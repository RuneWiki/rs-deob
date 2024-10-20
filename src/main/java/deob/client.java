package deob;

import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class59 {

    @ObfuscatedName("client.w")
    public static class162[] field981 = new class162[4];

    @ObfuscatedName("client.an")
    public static boolean field1101 = true;

    @ObfuscatedName("client.aj")
    public static int field918 = 1;

    @ObfuscatedName("client.af")
    public static int field919 = 0;

    @ObfuscatedName("client.bz")
    public static int field921 = 0;

    @ObfuscatedName("client.bh")
    public static boolean field1031 = false;

    @ObfuscatedName("client.bs")
    public static boolean field1066 = false;

    @ObfuscatedName("client.bq")
    public static int field925 = 0;

    @ObfuscatedName("client.bl")
    public static int field927 = 0;

    @ObfuscatedName("client.bu")
    public static boolean field928 = true;

    @ObfuscatedName("client.bt")
    public static int field929 = 0;

    @ObfuscatedName("client.bw")
    public static long field930 = -1L;

    @ObfuscatedName("client.by")
    public static int field931 = -1;

    @ObfuscatedName("client.br")
    public static int field988 = -1;

    @ObfuscatedName("client.bg")
    public static int field933 = -1;

    @ObfuscatedName("client.bk")
    public static boolean field934 = true;

    @ObfuscatedName("client.bj")
    public static boolean field935 = false;

    @ObfuscatedName("client.bx")
    public static int field936 = 0;

    @ObfuscatedName("client.ba")
    public static int field996 = 0;

    @ObfuscatedName("client.bm")
    public static int field938 = 0;

    @ObfuscatedName("client.bv")
    public static int field939 = 0;

    @ObfuscatedName("client.be")
    public static int field1186 = 0;

    @ObfuscatedName("client.bi")
    public static int field1115 = 0;

    @ObfuscatedName("client.cx")
    public static int field942 = 0;

    @ObfuscatedName("client.cy")
    public static int field1008 = 0;

    @ObfuscatedName("client.cf")
    public static int field1198 = 0;

    @ObfuscatedName("client.ch")
    public static class92 field945 = class92.field1423;

    @ObfuscatedName("client.cd")
    public static class92 field1051 = class92.field1423;

    @ObfuscatedName("client.cb")
    public static int field1123 = 0;

    @ObfuscatedName("client.cg")
    public static int field948 = 0;

    @ObfuscatedName("client.cc")
    public static int field1182 = 0;

    @ObfuscatedName("client.dn")
    public static int field952 = 0;

    @ObfuscatedName("client.dj")
    public static int field953 = 0;

    @ObfuscatedName("client.dc")
    public static int field1027 = 0;

    @ObfuscatedName("client.dy")
    public static int field955 = 0;

    @ObfuscatedName("client.do")
    public static int field956 = 0;

    @ObfuscatedName("client.dx")
    public static byte[] field957 = null;

    @ObfuscatedName("client.dm")
    public static class87[] field958 = new class87[32768];

    @ObfuscatedName("client.di")
    public static int field1138 = 0;

    @ObfuscatedName("client.dq")
    public static int[] field960 = new int[32768];

    @ObfuscatedName("client.dp")
    public static int field961 = 0;

    @ObfuscatedName("client.dz")
    public static int[] field1093 = new int[250];

    @ObfuscatedName("client.eg")
    public static class180 field963 = new class180(5000);

    @ObfuscatedName("client.eo")
    public static class180 field964 = new class180(5000);

    @ObfuscatedName("client.ep")
    public static class180 field965 = new class180(15000);

    @ObfuscatedName("client.eu")
    public static int field975 = 0;

    @ObfuscatedName("client.er")
    public static int field967 = 0;

    @ObfuscatedName("client.ee")
    public static int field968 = 0;

    @ObfuscatedName("client.ed")
    public static int field969 = 0;

    @ObfuscatedName("client.ec")
    public static int field970 = 0;

    @ObfuscatedName("client.ea")
    public static int field971 = 0;

    @ObfuscatedName("client.eq")
    public static int field1056 = 0;

    @ObfuscatedName("client.ex")
    public static int field1090 = 0;

    @ObfuscatedName("client.ew")
    public static boolean field974 = false;

    @ObfuscatedName("client.em")
    public static HashMap field1079 = new HashMap();

    @ObfuscatedName("client.eb")
    public static int field976 = 0;

    @ObfuscatedName("client.ft")
    public static int field977 = 1;

    @ObfuscatedName("client.fi")
    public static int field1083 = 0;

    @ObfuscatedName("client.fq")
    public static int field979 = 1;

    @ObfuscatedName("client.fp")
    public static int field980 = 0;

    @ObfuscatedName("client.fj")
    public static boolean field978 = false;

    @ObfuscatedName("client.fu")
    public static int[][][] field983 = new int[4][13][13];

    @ObfuscatedName("client.fd")
    public static final int[] field984 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fl")
    public static int field985 = 0;

    @ObfuscatedName("client.fw")
    public static int field986 = 2;

    @ObfuscatedName("client.fx")
    public static int field987 = 0;

    @ObfuscatedName("client.fh")
    public static int field1052 = 2;

    @ObfuscatedName("client.fo")
    public static int field962 = 0;

    @ObfuscatedName("client.ff")
    public static int field990 = 1;

    @ObfuscatedName("client.fy")
    public static int field1146 = 0;

    @ObfuscatedName("client.fk")
    public static int field992 = 0;

    @ObfuscatedName("client.fc")
    public static int field993 = 2;

    @ObfuscatedName("client.fn")
    public static int field994 = 0;

    @ObfuscatedName("client.gb")
    public static int field995 = 1;

    @ObfuscatedName("client.gx")
    public static int field1179 = 0;

    @ObfuscatedName("client.gn")
    public static int field997 = 0;

    @ObfuscatedName("client.gi")
    public static int field998 = 2301979;

    @ObfuscatedName("client.gv")
    public static int field999 = 5063219;

    @ObfuscatedName("client.gu")
    public static int field1000 = 3353893;

    @ObfuscatedName("client.gg")
    public static int field1128 = 7759444;

    @ObfuscatedName("client.gm")
    public static boolean field966 = false;

    @ObfuscatedName("client.gz")
    public static int field1180 = 0;

    @ObfuscatedName("client.ge")
    public static int field1004 = 128;

    @ObfuscatedName("client.hk")
    public static int field1005 = 0;

    @ObfuscatedName("client.hm")
    public static int field1033 = 0;

    @ObfuscatedName("client.hv")
    public static int field1007 = 0;

    @ObfuscatedName("client.he")
    public static int field1133 = 0;

    @ObfuscatedName("client.hh")
    public static int field1009 = 0;

    @ObfuscatedName("client.hr")
    public static int field1010 = 50;

    @ObfuscatedName("client.hj")
    public static int field1011 = 0;

    @ObfuscatedName("client.hc")
    public static boolean field1012 = false;

    @ObfuscatedName("client.hq")
    public static int field1013 = 0;

    @ObfuscatedName("client.hl")
    public static int field1014 = 0;

    @ObfuscatedName("client.hx")
    public static int field1015 = 50;

    @ObfuscatedName("client.ha")
    public static int[] field1016 = new int[field1015];

    @ObfuscatedName("client.hg")
    public static int[] field989 = new int[field1015];

    @ObfuscatedName("client.hp")
    public static int[] field1018 = new int[field1015];

    @ObfuscatedName("client.ho")
    public static int[] field1019 = new int[field1015];

    @ObfuscatedName("client.hb")
    public static int[] field1035 = new int[field1015];

    @ObfuscatedName("client.hs")
    public static int[] field924 = new int[field1015];

    @ObfuscatedName("client.hd")
    public static int[] field941 = new int[field1015];

    @ObfuscatedName("client.hz")
    public static String[] field1068 = new String[field1015];

    @ObfuscatedName("client.hw")
    public static int[][] field1178 = new int[104][104];

    @ObfuscatedName("client.hi")
    public static int field1025 = 0;

    @ObfuscatedName("client.ht")
    public static int field1174 = -1;

    @ObfuscatedName("client.hu")
    public static int field1184 = -1;

    @ObfuscatedName("client.hf")
    public static int field1028 = 0;

    @ObfuscatedName("client.ig")
    public static int field1029 = 0;

    @ObfuscatedName("client.in")
    public static int field1030 = 0;

    @ObfuscatedName("client.iv")
    public static int field1129 = 0;

    @ObfuscatedName("client.iw")
    public static int field1032 = 0;

    @ObfuscatedName("client.ip")
    public static int field1173 = 0;

    @ObfuscatedName("client.ij")
    public static int field1187 = 0;

    @ObfuscatedName("client.ib")
    public static int field1145 = 0;

    @ObfuscatedName("client.ia")
    public static int field1036 = 0;

    @ObfuscatedName("client.ic")
    public static int field1177 = 0;

    @ObfuscatedName("client.io")
    public static boolean field1038 = false;

    @ObfuscatedName("client.iu")
    public static int field1039 = 0;

    @ObfuscatedName("client.im")
    public static int field1001 = 0;

    @ObfuscatedName("client.il")
    public static class75[] field1041 = new class75[2048];

    @ObfuscatedName("client.id")
    public static int field1046 = -1;

    @ObfuscatedName("client.is")
    public static int field1043 = 0;

    @ObfuscatedName("client.iy")
    public static int field1044 = 0;

    @ObfuscatedName("client.it")
    public static String field1075 = null;

    @ObfuscatedName("client.ir")
    public static int[] field1045 = new int[1000];

    @ObfuscatedName("client.jn")
    public static final int[] field991 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.jy")
    public static String[] field1047 = new String[8];

    @ObfuscatedName("client.jf")
    public static boolean[] field1048 = new boolean[8];

    @ObfuscatedName("client.jr")
    public static int[] field1140 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.jp")
    public static int field1050 = -1;

    @ObfuscatedName("client.jb")
    public static class194[][][] field1160 = new class194[4][104][104];

    @ObfuscatedName("client.jx")
    public static class194 field1094 = new class194();

    @ObfuscatedName("client.ji")
    public static class194 field1053 = new class194();

    @ObfuscatedName("client.jt")
    public static class194 field1024 = new class194();

    @ObfuscatedName("client.jd")
    public static int[] field1055 = new int[25];

    @ObfuscatedName("client.jj")
    public static int[] field946 = new int[25];

    @ObfuscatedName("client.jw")
    public static int[] field932 = new int[25];

    @ObfuscatedName("client.jl")
    public static int field1058 = 0;

    @ObfuscatedName("client.jz")
    public static boolean field1059 = false;

    @ObfuscatedName("client.ja")
    public static int field1060 = 0;

    @ObfuscatedName("client.jv")
    public static int[] field1061 = new int[500];

    @ObfuscatedName("client.jg")
    public static int[] field1062 = new int[500];

    @ObfuscatedName("client.jo")
    public static int[] field1063 = new int[500];

    @ObfuscatedName("client.jh")
    public static int[] field1064 = new int[500];

    @ObfuscatedName("client.je")
    public static String[] field1065 = new String[500];

    @ObfuscatedName("client.kc")
    public static String[] field1134 = new String[500];

    @ObfuscatedName("client.kn")
    public static boolean field1169 = false;

    @ObfuscatedName("client.kh")
    public static int field1189 = -1;

    @ObfuscatedName("client.kd")
    public static boolean field1069 = false;

    @ObfuscatedName("client.ks")
    public static int field1070 = -1;

    @ObfuscatedName("client.kl")
    public static int field1071 = -1;

    @ObfuscatedName("client.ki")
    public static int field1072 = 0;

    @ObfuscatedName("client.ke")
    public static int field1073 = 50;

    @ObfuscatedName("client.kb")
    public static int field1074 = 0;

    @ObfuscatedName("client.kz")
    public static boolean field1076 = false;

    @ObfuscatedName("client.ky")
    public static int field1077 = -1;

    @ObfuscatedName("client.kp")
    public static int field1078 = -1;

    @ObfuscatedName("client.km")
    public static String field1201 = null;

    @ObfuscatedName("client.kf")
    public static String field1021 = null;

    @ObfuscatedName("client.kr")
    public static int field1081 = -1;

    @ObfuscatedName("client.kw")
    public static class191 field1082 = new class191(8);

    @ObfuscatedName("client.kk")
    public static int field1131 = 0;

    @ObfuscatedName("client.ku")
    public static int field1084 = 0;

    @ObfuscatedName("client.kq")
    public static class217 field954 = null;

    @ObfuscatedName("client.lh")
    public static int field1086 = 0;

    @ObfuscatedName("client.lj")
    public static int field1087 = 0;

    @ObfuscatedName("client.lo")
    public static int field1088 = 0;

    @ObfuscatedName("client.lb")
    public static int field982 = -1;

    @ObfuscatedName("client.ld")
    public static boolean field1022 = false;

    @ObfuscatedName("client.lz")
    public static boolean field1091 = false;

    @ObfuscatedName("client.lx")
    public static boolean field1185 = false;

    @ObfuscatedName("client.lw")
    public static class217 field1089 = null;

    @ObfuscatedName("client.lm")
    public static class217 field1049 = null;

    @ObfuscatedName("client.ll")
    public static class217 field1095 = null;

    @ObfuscatedName("client.lf")
    public static int field1054 = 0;

    @ObfuscatedName("client.lk")
    public static int field1154 = 0;

    @ObfuscatedName("client.lv")
    public static class217 field1098 = null;

    @ObfuscatedName("client.ly")
    public static boolean field1099 = false;

    @ObfuscatedName("client.ln")
    public static int field1100 = -1;

    @ObfuscatedName("client.la")
    public static int field947 = -1;

    @ObfuscatedName("client.lt")
    public static boolean field1102 = false;

    @ObfuscatedName("client.li")
    public static int field1103 = -1;

    @ObfuscatedName("client.lg")
    public static int field1104 = -1;

    @ObfuscatedName("client.lr")
    public static boolean field1034 = false;

    @ObfuscatedName("client.ls")
    public static int field1106 = 1;

    @ObfuscatedName("client.mw")
    public static int[] field1107 = new int[32];

    @ObfuscatedName("client.mj")
    public static int field1023 = 0;

    @ObfuscatedName("client.ms")
    public static int[] field1109 = new int[32];

    @ObfuscatedName("client.mc")
    public static int field972 = 0;

    @ObfuscatedName("client.mi")
    public static int[] field1111 = new int[32];

    @ObfuscatedName("client.mq")
    public static int field1112 = 0;

    @ObfuscatedName("client.mr")
    public static int field1159 = 0;

    @ObfuscatedName("client.mh")
    public static int field1114 = 0;

    @ObfuscatedName("client.mx")
    public static int field1097 = 0;

    @ObfuscatedName("client.mn")
    public static int field1116 = 0;

    @ObfuscatedName("client.md")
    public static int field1117 = 0;

    @ObfuscatedName("client.mo")
    public static int field1118 = 0;

    @ObfuscatedName("client.mg")
    public static int field1119 = 0;

    @ObfuscatedName("client.mb")
    public static class194 field1110 = new class194();

    @ObfuscatedName("client.me")
    public static class194 field973 = new class194();

    @ObfuscatedName("client.mm")
    public static class194 field1122 = new class194();

    @ObfuscatedName("client.mf")
    public static class191 field1143 = new class191(512);

    @ObfuscatedName("client.mt")
    public static int field917 = 0;

    @ObfuscatedName("client.mv")
    public static int field1125 = -2;

    @ObfuscatedName("client.mz")
    public static boolean[] field1096 = new boolean[100];

    @ObfuscatedName("client.my")
    public static boolean[] field944 = new boolean[100];

    @ObfuscatedName("client.mk")
    public static boolean[] field1003 = new boolean[100];

    @ObfuscatedName("client.nw")
    public static int[] field923 = new int[100];

    @ObfuscatedName("client.nf")
    public static int[] field1130 = new int[100];

    @ObfuscatedName("client.nt")
    public static int[] field1126 = new int[100];

    @ObfuscatedName("client.nu")
    public static int[] field1132 = new int[100];

    @ObfuscatedName("client.no")
    public static int field1195 = 0;

    @ObfuscatedName("client.nz")
    public static long field1156 = 0L;

    @ObfuscatedName("client.nh")
    public static boolean field1135 = true;

    @ObfuscatedName("client.nq")
    public static int[] field1136 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ny")
    public static int field1137 = 0;

    @ObfuscatedName("client.nk")
    public static int field922 = 0;

    @ObfuscatedName("client.nr")
    public static String field1139 = "";

    @ObfuscatedName("client.nj")
    public static long[] field1026 = new long[100];

    @ObfuscatedName("client.ne")
    public static int field1141 = 0;

    @ObfuscatedName("client.ng")
    public static int field1142 = 0;

    @ObfuscatedName("client.ns")
    public static int[] field940 = new int[128];

    @ObfuscatedName("client.nn")
    public static int[] field1144 = new int[128];

    @ObfuscatedName("client.nb")
    public static long field1006 = -1L;

    @ObfuscatedName("client.og")
    public static String field959 = null;

    @ObfuscatedName("client.oa")
    public static String field1147 = null;

    @ObfuscatedName("client.on")
    public static int field1148 = -1;

    @ObfuscatedName("client.ok")
    public static int field1181 = 0;

    @ObfuscatedName("client.or")
    public static int[] field1150 = new int[1000];

    @ObfuscatedName("client.of")
    public static int[] field1151 = new int[1000];

    @ObfuscatedName("client.ow")
    public static class286[] field1152 = new class286[1000];

    @ObfuscatedName("client.oz")
    public static int field1153 = 0;

    @ObfuscatedName("client.oc")
    public static int field1161 = 0;

    @ObfuscatedName("client.ou")
    public static int field1155 = 0;

    @ObfuscatedName("client.ox")
    public static int field1042 = 255;

    @ObfuscatedName("client.ov")
    public static int field1157 = -1;

    @ObfuscatedName("client.oi")
    public static boolean field1158 = false;

    @ObfuscatedName("client.op")
    public static int field1149 = 127;

    @ObfuscatedName("client.oh")
    public static int field1002 = 127;

    @ObfuscatedName("client.pl")
    public static int field1170 = 0;

    @ObfuscatedName("client.ps")
    public static int[] field1162 = new int[50];

    @ObfuscatedName("client.pm")
    public static int[] field1163 = new int[50];

    @ObfuscatedName("client.po")
    public static int[] field1164 = new int[50];

    @ObfuscatedName("client.pi")
    public static int[] field1165 = new int[50];

    @ObfuscatedName("client.pv")
    public static class106[] field1166 = new class106[50];

    @ObfuscatedName("client.pq")
    public static boolean field1167 = false;

    @ObfuscatedName("client.pd")
    public static boolean[] field1085 = new boolean[5];

    @ObfuscatedName("client.pt")
    public static int[] field1037 = new int[5];

    @ObfuscatedName("client.py")
    public static int[] field1171 = new int[5];

    @ObfuscatedName("client.qo")
    public static int[] field1172 = new int[5];

    @ObfuscatedName("client.qr")
    public static int[] field1017 = new int[5];

    @ObfuscatedName("client.qy")
    public static short field1057 = 256;

    @ObfuscatedName("client.qx")
    public static short field1175 = 205;

    @ObfuscatedName("client.qg")
    public static short field943 = 256;

    @ObfuscatedName("client.qu")
    public static short field1080 = 320;

    @ObfuscatedName("client.qv")
    public static short field1020 = 1;

    @ObfuscatedName("client.qc")
    public static short field1040 = 32767;

    @ObfuscatedName("client.qb")
    public static short field1127 = 1;

    @ObfuscatedName("client.qi")
    public static short field949 = 32767;

    @ObfuscatedName("client.qt")
    public static int field1092 = 0;

    @ObfuscatedName("client.qw")
    public static int field1183 = 0;

    @ObfuscatedName("client.qn")
    public static int field1113 = 0;

    @ObfuscatedName("client.qm")
    public static int field1108 = 0;

    @ObfuscatedName("client.qs")
    public static int field1121 = 0;

    @ObfuscatedName("client.qz")
    public static int field1067 = 0;

    @ObfuscatedName("client.qd")
    public static int field1188 = 0;

    @ObfuscatedName("client.ql")
    public static class66[] field1120 = new class66[400];

    @ObfuscatedName("client.qq")
    public static class196 field1190 = new class196();

    @ObfuscatedName("client.qh")
    public static int field1191 = 0;

    @ObfuscatedName("client.qa")
    public static class71[] field1192 = new class71[400];

    @ObfuscatedName("client.qe")
    public static class214 field1193 = new class214();

    @ObfuscatedName("client.qp")
    public static int field1194 = -1;

    @ObfuscatedName("client.qj")
    public static int field1176 = -1;

    @ObfuscatedName("client.ry")
    public static class17[] field1196 = new class17[8];

    @ObfuscatedName("client.rb")
    public static long field1197 = -1L;

    @ObfuscatedName("client.ru")
    public static long field926 = -1L;

    @ObfuscatedName("client.rh")
    public static final class74 field1199 = new class74();

    @ObfuscatedName("client.rs")
    public static int[] field1200 = new int[50];

    @ObfuscatedName("client.rl")
    public static int[] field937 = new int[50];

    @ObfuscatedName("bf.ei(I)Lkj;")
    public static class289 method927() {
        return Statics.field768;
    }

    @ObfuscatedName("client.ag(I)V")
    public final void method774() {
    }

    public final void init() {
        if (!this.method751()) {
            return;
        }
        class275[] var1 = class275.method4510();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class275 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3714);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3714)) {
                    case 1:
                        field921 = Integer.parseInt(var4);
                        break;
                    case 2:
                        field919 = Integer.parseInt(var4);
                        break;
                    case 3:
                        Statics.field1124 = var4;
                        break;
                    case 4:
                        field925 = Integer.parseInt(var4);
                    case 5:
                    case 11:
                    case 13:
                    default:
                        break;
                    case 6:
                        Statics.field1105 = (class233) class169.method999(class233.method477(), Integer.parseInt(var4));
                        if (Statics.field1105 == class233.field3173) {
                            Statics.field529 = class290.field3853;
                        } else {
                            Statics.field529 = class290.field3854;
                        }
                        break;
                    case 7:
                        if (var4.equalsIgnoreCase(class89.field1401)) {
                            field1031 = true;
                        } else {
                            field1031 = false;
                        }
                        break;
                    case 8:
                        Statics.field348 = Integer.parseInt(var4);
                        break;
                    case 9:
                        if (var4.equalsIgnoreCase(class89.field1401)) {
                        }
                        break;
                    case 10:
                        Statics.field3121 = Integer.parseInt(var4);
                        break;
                    case 12:
                        field918 = Integer.parseInt(var4);
                        break;
                    case 14:
                        int var5 = Integer.parseInt(var4);
                        class232[] var6 = new class232[] { class232.field3161, class232.field3163, class232.field3159, class232.field3164 };
                        class232[] var7 = var6;
                        int var8 = 0;
                        class232 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class232 var9 = var7[var8];
                            if (var9.field3160 == var5) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field920 = var10;
                        break;
                    case 15:
                        Statics.field472 = var4;
                }
            }
        }
        method1699();
        Statics.field235 = this.getCodeBase().getHost();
        String var11 = Statics.field920.field3162;
        byte var12 = 0;
        try {
            class156.method1012("oldschool", var11, var12, 17);
        } catch (Exception var14) {
            class153.method464((String) null, var14);
        }
        Statics.field3334 = this;
        this.method749(765, 503, 141);
    }

    @ObfuscatedName("cp.ft(I)V")
    public static final void method1699() {
        class140.field2074 = false;
        field1066 = false;
    }

    @ObfuscatedName("client.aw(I)V")
    public final void method764() {
        Statics.field657 = field921 == 0 ? 43594 : field918 + 40000;
        Statics.field526 = field921 == 0 ? 443 : field918 + 50000;
        Statics.field793 = Statics.field657;
        Statics.field802 = class215.field2612;
        Statics.field3204 = class215.field2611;
        Statics.field1418 = class215.field2616;
        Statics.field2221 = class215.field2614;
        this.method744();
        this.method745();
        Statics.field234 = this.method741();
        Statics.field874 = new class161(255, class156.field2236, class156.field2237, 500000);
        Statics.field527 = class82.method1010();
        this.method755();
        String var2 = Statics.field2829;
        class57.field683 = this;
        class57.field681 = var2;
        if (field921 != 0) {
            field935 = true;
        }
        int var3 = Statics.field527.field1315;
        field1156 = 0L;
        if (var3 >= 2) {
            field1135 = true;
        } else {
            field1135 = false;
        }
        if (method3650() == 1) {
            Statics.field3334.method819(765, 503);
        } else {
            Statics.field3334.method819(7680, 2160);
        }
        if (field927 >= 25) {
            field963.method3121(77);
            field963.method2876(method3650());
            field963.method2877(Statics.field413);
            field963.method2877(Statics.field1916);
        }
    }

    @ObfuscatedName("client.ak(B)V")
    public final void method765() {
        field929++;
        this.method1265();
        while (true) {
            class194 var1 = class237.field3205;
            class234 var2;
            synchronized (class237.field3205) {
                var2 = (class234) class237.field3208.method3316();
            }
            if (var2 == null) {
                try {
                    if (class204.field2487 == 1) {
                        int var4 = Statics.field2486.method3410();
                        if (var4 > 0 && Statics.field2486.method3415()) {
                            int var5 = var4 - Statics.field2135;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2486.method3409(var5);
                        } else {
                            Statics.field2486.method3457();
                            Statics.field2486.method3413();
                            if (Statics.field2488 == null) {
                                class204.field2487 = 0;
                            } else {
                                class204.field2487 = 2;
                            }
                            Statics.field826 = null;
                            Statics.field2491 = null;
                        }
                    }
                } catch (Exception var128) {
                    var128.printStackTrace();
                    Statics.field2486.method3457();
                    class204.field2487 = 0;
                    Statics.field826 = null;
                    Statics.field2491 = null;
                    Statics.field2488 = null;
                }
                method3572();
                class51 var7 = class51.field653;
                synchronized (class51.field653) {
                    class51.field655++;
                    class51.field649 = class51.field636;
                    class51.field648 = 0;
                    if (class51.field644 >= 0) {
                        while (class51.field644 != class51.field643) {
                            int var9 = class51.field642[class51.field643];
                            class51.field643 = class51.field643 + 1 & 0x7F;
                            if (var9 < 0) {
                                class51.field641[~var9] = false;
                            } else {
                                if (!class51.field641[var9] && class51.field648 < class51.field639.length - 1) {
                                    class51.field639[++class51.field648 - 1] = var9;
                                }
                                class51.field641[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class51.field641[var8] = false;
                        }
                        class51.field644 = class51.field643;
                    }
                    if (class51.field648 > 0) {
                        class51.field655 = 0;
                    }
                    class51.field636 = class51.field650;
                }
                class60 var11 = class60.field739;
                synchronized (class60.field739) {
                    class60.field728 = class60.field725;
                    class60.field729 = class60.field731;
                    class60.field726 = class60.field727;
                    class60.field737 = class60.field723;
                    class60.field736 = class60.field732;
                    class60.field735 = class60.field733;
                    class60.field738 = class60.field730;
                    class60.field723 = 0;
                }
                if (Statics.field234 != null) {
                    int var13 = Statics.field234.method633();
                    field1119 = var13;
                }
                if (field927 == 0) {
                    method627();
                    class59.method1536();
                } else if (field927 == 5) {
                    class93.method2802(this);
                    method627();
                    class59.method1536();
                } else if (field927 == 10 || field927 == 11) {
                    class93.method2802(this);
                } else if (field927 == 20) {
                    class93.method2802(this);
                    this.method1060();
                } else if (field927 == 25) {
                    method1557(false);
                    field976 = 0;
                    boolean var14 = true;
                    for (int var15 = 0; var15 < Statics.field815.length; var15++) {
                        if (Statics.field531[var15] != -1 && Statics.field815[var15] == null) {
                            Statics.field815[var15] = Statics.field822.method3760(Statics.field531[var15], 0);
                            if (Statics.field815[var15] == null) {
                                var14 = false;
                                field976++;
                            }
                        }
                        if (Statics.field849[var15] != -1 && Statics.field1670[var15] == null) {
                            Statics.field1670[var15] = Statics.field822.method3830(Statics.field849[var15], 0, Statics.field370[var15]);
                            if (Statics.field1670[var15] == null) {
                                var14 = false;
                                field976++;
                            }
                        }
                    }
                    if (var14) {
                        field1083 = 0;
                        boolean var16 = true;
                        for (int var17 = 0; var17 < Statics.field815.length; var17++) {
                            byte[] var18 = Statics.field1670[var17];
                            if (var18 != null) {
                                int var19 = (Statics.field244[var17] >> 8) * 64 - Statics.field414;
                                int var20 = (Statics.field244[var17] & 0xFF) * 64 - Statics.field2117;
                                if (field978) {
                                    var19 = 10;
                                    var20 = 10;
                                }
                                var16 &= class62.method990(var18, var19, var20);
                            }
                        }
                        if (var16) {
                            if (field980 != 0) {
                                method196(class226.field2838 + class89.field1399 + class89.field1396 + 100 + "%" + class89.field1398, true);
                            }
                            method3572();
                            method1599();
                            method3572();
                            Statics.field621.method2460();
                            method3572();
                            System.gc();
                            for (int var21 = 0; var21 < 4; var21++) {
                                field981[var21].method2762();
                            }
                            for (int var22 = 0; var22 < 4; var22++) {
                                for (int var23 = 0; var23 < 104; var23++) {
                                    for (int var24 = 0; var24 < 104; var24++) {
                                        class62.field759[var22][var23][var24] = 0;
                                    }
                                }
                            }
                            method3572();
                            class62.field750 = 99;
                            Statics.field291 = new byte[4][104][104];
                            Statics.field474 = new byte[4][104][104];
                            Statics.field751 = new byte[4][104][104];
                            Statics.field763 = new byte[4][104][104];
                            Statics.field2608 = new int[4][105][105];
                            Statics.field760 = new byte[4][105][105];
                            Statics.field754 = new int[105][105];
                            Statics.field3734 = new int[104];
                            Statics.field3373 = new int[104];
                            Statics.field755 = new int[104];
                            Statics.field278 = new int[104];
                            Statics.field635 = new int[104];
                            int var25 = Statics.field815.length;
                            class83.method2();
                            method1557(true);
                            if (!field978) {
                                int var26 = 0;
                                label551: while (true) {
                                    if (var26 >= var25) {
                                        for (int var40 = 0; var40 < var25; var40++) {
                                            int var41 = (Statics.field244[var40] >> 8) * 64 - Statics.field414;
                                            int var42 = (Statics.field244[var40] & 0xFF) * 64 - Statics.field2117;
                                            byte[] var43 = Statics.field815[var40];
                                            if (var43 == null && Statics.field256 < 800) {
                                                method3572();
                                                class62.method2819(var41, var42, 64, 64);
                                            }
                                        }
                                        method1557(true);
                                        int var44 = 0;
                                        while (true) {
                                            if (var44 >= var25) {
                                                break label551;
                                            }
                                            byte[] var45 = Statics.field1670[var44];
                                            if (var45 != null) {
                                                int var46 = (Statics.field244[var44] >> 8) * 64 - Statics.field414;
                                                int var47 = (Statics.field244[var44] & 0xFF) * 64 - Statics.field2117;
                                                method3572();
                                                class62.method2645(var45, var46, var47, Statics.field621, field981);
                                            }
                                            var44++;
                                        }
                                    }
                                    int var27 = (Statics.field244[var26] >> 8) * 64 - Statics.field414;
                                    int var28 = (Statics.field244[var26] & 0xFF) * 64 - Statics.field2117;
                                    byte[] var29 = Statics.field815[var26];
                                    if (var29 != null) {
                                        method3572();
                                        int var30 = Statics.field1336 * 8 - 48;
                                        int var31 = Statics.field256 * 8 - 48;
                                        class162[] var32 = field981;
                                        int var33 = 0;
                                        label548: while (true) {
                                            if (var33 >= 4) {
                                                class174 var36 = new class174(var29);
                                                int var37 = 0;
                                                while (true) {
                                                    if (var37 >= 4) {
                                                        break label548;
                                                    }
                                                    for (int var38 = 0; var38 < 64; var38++) {
                                                        for (int var39 = 0; var39 < 64; var39++) {
                                                            class62.method2661(var36, var37, var27 + var38, var28 + var39, var30, var31, 0);
                                                        }
                                                    }
                                                    var37++;
                                                }
                                            }
                                            for (int var34 = 0; var34 < 64; var34++) {
                                                for (int var35 = 0; var35 < 64; var35++) {
                                                    if (var27 + var34 > 0 && var27 + var34 < 103 && var28 + var35 > 0 && var28 + var35 < 103) {
                                                        var32[var33].field2275[var27 + var34][var28 + var35] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var33++;
                                        }
                                    }
                                    var26++;
                                }
                            }
                            if (field978) {
                                int var48 = 0;
                                label497: while (true) {
                                    if (var48 >= 4) {
                                        for (int var79 = 0; var79 < 13; var79++) {
                                            for (int var80 = 0; var80 < 13; var80++) {
                                                int var81 = field983[0][var79][var80];
                                                if (var81 == -1) {
                                                    class62.method2819(var79 * 8, var80 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method1557(true);
                                        int var82 = 0;
                                        while (true) {
                                            if (var82 >= 4) {
                                                break label497;
                                            }
                                            method3572();
                                            for (int var83 = 0; var83 < 13; var83++) {
                                                label420: for (int var84 = 0; var84 < 13; var84++) {
                                                    int var85 = field983[var82][var83][var84];
                                                    if (var85 != -1) {
                                                        int var86 = var85 >> 24 & 0x3;
                                                        int var87 = var85 >> 1 & 0x3;
                                                        int var88 = var85 >> 14 & 0x3FF;
                                                        int var89 = var85 >> 3 & 0x7FF;
                                                        int var90 = (var88 / 8 << 8) + var89 / 8;
                                                        for (int var91 = 0; var91 < Statics.field244.length; var91++) {
                                                            if (Statics.field244[var91] == var90 && Statics.field1670[var91] != null) {
                                                                byte[] var92 = Statics.field1670[var91];
                                                                int var93 = var83 * 8;
                                                                int var94 = var84 * 8;
                                                                int var95 = (var88 & 0x7) * 8;
                                                                int var96 = (var89 & 0x7) * 8;
                                                                class140 var97 = Statics.field621;
                                                                class162[] var98 = field981;
                                                                class174 var99 = new class174(var92);
                                                                int var100 = -1;
                                                                while (true) {
                                                                    int var101 = var99.method2904();
                                                                    if (var101 == 0) {
                                                                        continue label420;
                                                                    }
                                                                    var100 += var101;
                                                                    int var102 = 0;
                                                                    while (true) {
                                                                        int var103 = var99.method2904();
                                                                        if (var103 == 0) {
                                                                            break;
                                                                        }
                                                                        var102 += var103 - 1;
                                                                        int var104 = var102 & 0x3F;
                                                                        int var105 = var102 >> 6 & 0x3F;
                                                                        int var106 = var102 >> 12;
                                                                        int var107 = var99.method2891();
                                                                        int var108 = var107 >> 2;
                                                                        int var109 = var107 & 0x3;
                                                                        if (var86 == var106 && var105 >= var95 && var105 < var95 + 8 && var104 >= var96 && var104 < var96 + 8) {
                                                                            class256 var110 = class256.method4379(var100);
                                                                            int var111 = var93 + class216.method488(var105 & 0x7, var104 & 0x7, var87, var110.field3436, var110.field3431, var109);
                                                                            int var112 = var94 + Statics.method234(var105 & 0x7, var104 & 0x7, var87, var110.field3436, var110.field3431, var109);
                                                                            if (var111 > 0 && var112 > 0 && var111 < 103 && var112 < 103) {
                                                                                int var113 = var82;
                                                                                if ((class62.field759[1][var111][var112] & 0x2) == 2) {
                                                                                    var113 = var82 - 1;
                                                                                }
                                                                                class162 var114 = null;
                                                                                if (var113 >= 0) {
                                                                                    var114 = var98[var113];
                                                                                }
                                                                                class62.method984(var82, var111, var112, var100, var87 + var109 & 0x3, var108, var97, var114);
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
                                    method3572();
                                    for (int var49 = 0; var49 < 13; var49++) {
                                        for (int var50 = 0; var50 < 13; var50++) {
                                            boolean var51 = false;
                                            int var52 = field983[var48][var49][var50];
                                            if (var52 != -1) {
                                                int var53 = var52 >> 24 & 0x3;
                                                int var54 = var52 >> 1 & 0x3;
                                                int var55 = var52 >> 14 & 0x3FF;
                                                int var56 = var52 >> 3 & 0x7FF;
                                                int var57 = (var55 / 8 << 8) + var56 / 8;
                                                for (int var58 = 0; var58 < Statics.field244.length; var58++) {
                                                    if (Statics.field244[var58] == var57 && Statics.field815[var58] != null) {
                                                        byte[] var59 = Statics.field815[var58];
                                                        int var60 = var49 * 8;
                                                        int var61 = var50 * 8;
                                                        int var62 = (var55 & 0x7) * 8;
                                                        int var63 = (var56 & 0x7) * 8;
                                                        class162[] var64 = field981;
                                                        for (int var65 = 0; var65 < 8; var65++) {
                                                            for (int var66 = 0; var66 < 8; var66++) {
                                                                if (var60 + var65 > 0 && var60 + var65 < 103 && var61 + var66 > 0 && var61 + var66 < 103) {
                                                                    var64[var48].field2275[var60 + var65][var61 + var66] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class174 var67 = new class174(var59);
                                                        for (int var68 = 0; var68 < 4; var68++) {
                                                            for (int var69 = 0; var69 < 64; var69++) {
                                                                for (int var70 = 0; var70 < 64; var70++) {
                                                                    if (var53 == var68 && var69 >= var62 && var69 < var62 + 8 && var70 >= var63 && var70 < var63 + 8) {
                                                                        int var74 = var69 & 0x7;
                                                                        int var75 = var70 & 0x7;
                                                                        int var77 = var54 & 0x3;
                                                                        int var78;
                                                                        if (var77 == 0) {
                                                                            var78 = var74;
                                                                        } else if (var77 == 1) {
                                                                            var78 = var75;
                                                                        } else if (var77 == 2) {
                                                                            var78 = 7 - var74;
                                                                        } else {
                                                                            var78 = 7 - var75;
                                                                        }
                                                                        class62.method2661(var67, var48, var60 + var78, var61 + class216.method158(var69 & 0x7, var70 & 0x7, var54), 0, 0, var54);
                                                                    } else {
                                                                        class62.method2661(var67, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var51 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var51) {
                                                Statics.method154(var48, var49 * 8, var50 * 8);
                                            }
                                        }
                                    }
                                    var48++;
                                }
                            }
                            method1557(true);
                            method1599();
                            method3572();
                            class62.method3714(Statics.field621, field981);
                            method1557(true);
                            int var115 = class62.field750;
                            if (var115 > Statics.field267) {
                                var115 = Statics.field267;
                            }
                            if (var115 < Statics.field267 - 1) {
                                int var116 = Statics.field267 - 1;
                            }
                            if (field1066) {
                                Statics.field621.method2488(class62.field750);
                            } else {
                                Statics.field621.method2488(0);
                            }
                            for (int var117 = 0; var117 < 104; var117++) {
                                for (int var118 = 0; var118 < 104; var118++) {
                                    method2759(var117, var118);
                                }
                            }
                            method3572();
                            method3118();
                            class256.field3439.method3247();
                            if (Statics.field3334.method869()) {
                                field963.method3121(155);
                                field963.method3055(1057001181);
                            }
                            if (!field978) {
                                int var119 = (Statics.field1336 - 6) / 8;
                                int var120 = (Statics.field1336 + 6) / 8;
                                int var121 = (Statics.field256 - 6) / 8;
                                int var122 = (Statics.field256 + 6) / 8;
                                for (int var123 = var119 - 1; var123 <= var120 + 1; var123++) {
                                    for (int var124 = var121 - 1; var124 <= var122 + 1; var124++) {
                                        if (var123 < var119 || var123 > var120 || var124 < var121 || var124 > var122) {
                                            Statics.field822.method3782("m" + var123 + "_" + var124);
                                            Statics.field822.method3782("l" + var123 + "_" + var124);
                                        }
                                    }
                                }
                            }
                            method116(30);
                            method3572();
                            Statics.field291 = (byte[][][]) null;
                            Statics.field474 = (byte[][][]) null;
                            Statics.field751 = (byte[][][]) null;
                            Statics.field763 = (byte[][][]) null;
                            Statics.field2608 = (int[][][]) null;
                            Statics.field760 = (byte[][][]) null;
                            Statics.field754 = (int[][]) null;
                            Statics.field3734 = null;
                            Statics.field3373 = null;
                            Statics.field755 = null;
                            Statics.field278 = null;
                            Statics.field635 = null;
                            field963.method3121(217);
                            class59.method1536();
                        } else {
                            field980 = 2;
                        }
                    } else {
                        field980 = 1;
                    }
                }
                if (field927 == 30) {
                    this.method1061();
                } else if (field927 == 40 || field927 == 45) {
                    this.method1060();
                }
                return;
            }
            var2.field3180.method3857(var2.field3179, (int) var2.field2454, var2.field3178, false);
        }
    }

    @ObfuscatedName("client.ax(ZI)V")
    public final void method833(boolean arg0) {
        boolean var2 = class204.method1602();
        if (var2 && field1158 && Statics.field340 != null) {
            Statics.field340.method1865();
        }
        if ((field927 == 10 || field927 == 20 || field927 == 30) && field1156 != 0L && class176.method218() > field1156) {
            int var3 = method3650();
            field1156 = 0L;
            if (var3 >= 2) {
                field1135 = true;
            } else {
                field1135 = false;
            }
            if (method3650() == 1) {
                Statics.field3334.method819(765, 503);
            } else {
                Statics.field3334.method819(7680, 2160);
            }
            if (field927 >= 25) {
                field963.method3121(77);
                field963.method2876(method3650());
                field963.method2877(Statics.field413);
                field963.method2877(Statics.field1916);
            }
        }
        if (arg0) {
            for (int var4 = 0; var4 < 100; var4++) {
                field1096[var4] = true;
            }
        }
        if (field927 == 0) {
            this.method835(class93.field1435, class93.field1448, arg0);
        } else if (field927 == 5) {
            class93.method1373(Statics.field245, Statics.field599, Statics.field876, arg0);
        } else if (field927 == 10 || field927 == 11) {
            class93.method1373(Statics.field245, Statics.field599, Statics.field876, arg0);
        } else if (field927 == 20) {
            class93.method1373(Statics.field245, Statics.field599, Statics.field876, arg0);
        } else if (field927 == 25) {
            if (field980 == 1) {
                if (field976 > field977) {
                    field977 = field976;
                }
                int var5 = (field977 * 50 - field976 * 50) / field977;
                method196(class226.field2838 + class89.field1399 + class89.field1396 + var5 + "%" + class89.field1398, false);
            } else if (field980 == 2) {
                if (field1083 > field979) {
                    field979 = field1083;
                }
                int var6 = (field979 * 50 - field1083 * 50) / field979 + 50;
                method196(class226.field2838 + class89.field1399 + class89.field1396 + var6 + "%" + class89.field1398, false);
            } else {
                method196(class226.field2838, false);
            }
        } else if (field927 == 30) {
            this.method1064();
        } else if (field927 == 40) {
            method196(class226.field3056 + class89.field1399 + class226.field2846, false);
        } else if (field927 == 45) {
            method196(class226.field2992, false);
        }
        if (field927 == 30 && field1195 == 0 && !arg0) {
            for (int var7 = 0; var7 < field917; var7++) {
                if (field944[var7]) {
                    Statics.field844.method731(field923[var7], field1130[var7], field1126[var7], field1132[var7]);
                    field944[var7] = false;
                }
            }
        } else if (field927 > 0) {
            Statics.field844.method718(0, 0);
            for (int var8 = 0; var8 < field917; var8++) {
                field944[var8] = false;
            }
        }
    }

    @ObfuscatedName("client.at(I)V")
    public final void method780() {
        if (Statics.field294.method1638()) {
            Statics.field294.method1635();
        }
        if (Statics.field910 != null) {
            Statics.field910.field855 = false;
        }
        Statics.field910 = null;
        if (Statics.field1379 != null) {
            Statics.field1379.method2721();
            Statics.field1379 = null;
        }
        if (class51.field653 != null) {
            class51 var1 = class51.field653;
            synchronized (class51.field653) {
                class51.field653 = null;
            }
        }
        if (class60.field739 != null) {
            class60 var3 = class60.field739;
            synchronized (class60.field739) {
                class60.field739 = null;
            }
        }
        Statics.field234 = null;
        if (Statics.field340 != null) {
            Statics.field340.method1848();
        }
        if (Statics.field2394 != null) {
            Statics.field2394.method1848();
        }
        class239.method3852();
        Object var5 = class237.field3207;
        synchronized (class237.field3207) {
            if (class237.field3206 != 0) {
                class237.field3206 = 1;
                try {
                    class237.field3207.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        class156.method2783();
    }

    @ObfuscatedName("y.fi(II)V")
    public static void method116(int arg0) {
        if (field927 == arg0) {
            return;
        }
        if (field927 == 0) {
            Statics.field3334.method769();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field953 = 0;
            field1027 = 0;
            field955 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field3699 != null) {
            Statics.field3699.method2721();
            Statics.field3699 = null;
        }
        if (field927 == 25) {
            field980 = 0;
            field976 = 0;
            field977 = 1;
            field1083 = 0;
            field979 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class93.method3403(Statics.field3722, Statics.field311, true, 0);
        } else if (arg0 == 20) {
            class93.method3403(Statics.field3722, Statics.field311, true, field927 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class93.method3403(Statics.field3722, Statics.field311, false, 4);
        } else if (Statics.field1428) {
            Statics.field1455 = null;
            Statics.field3661 = null;
            Statics.field2118 = null;
            Statics.field1439 = null;
            Statics.field1462 = null;
            Statics.field1430 = null;
            Statics.field1432 = null;
            Statics.field1433 = null;
            Statics.field2008 = null;
            Statics.field247 = null;
            Statics.field380 = null;
            Statics.field2206 = null;
            Statics.field773 = null;
            Statics.field371 = null;
            Statics.field1436 = null;
            Statics.field475 = null;
            Statics.field3765 = null;
            Statics.field1438 = null;
            Statics.field3701 = null;
            Statics.field1442 = null;
            Statics.field389 = null;
            Statics.field447 = null;
            class204.field2487 = 1;
            Statics.field2488 = null;
            Statics.field2489 = -1;
            Statics.field2483 = -1;
            Statics.field2043 = 0;
            Statics.field1383 = false;
            Statics.field2135 = 2;
            class239.method1600(true);
            Statics.field1428 = false;
        }
        field927 = arg0;
    }

    @ObfuscatedName("client.fq(B)V")
    public void method1265() {
        if (field927 != 1000) {
            boolean var1 = class239.method141();
            if (!var1) {
                this.method1058();
            }
        }
    }

    @ObfuscatedName("client.fp(B)V")
    public void method1058() {
        if (class239.field3242 >= 4) {
            this.method770("js5crc");
            field927 = 1000;
            return;
        }
        if (class239.field3243 >= 4) {
            if (field927 <= 5) {
                this.method770("js5io");
                field927 = 1000;
                return;
            }
            field1182 = 3000;
            class239.field3243 = 3;
        }
        if (--field1182 + 1 > 0) {
            return;
        }
        try {
            if (field948 == 0) {
                Statics.field3643 = Statics.field712.method2681(Statics.field235, Statics.field793);
                field948++;
            }
            if (field948 == 1) {
                if (Statics.field3643.field2213 == 2) {
                    this.method1236(-1);
                    return;
                }
                if (Statics.field3643.field2213 == 1) {
                    field948++;
                }
            }
            if (field948 == 2) {
                Statics.field15 = new class160((Socket) Statics.field3643.field2214, Statics.field712);
                class174 var1 = new class174(5);
                var1.method2876(15);
                var1.method3055(141);
                Statics.field15.method2725(var1.field2373, 0, 5);
                field948++;
                Statics.field2226 = class176.method218();
            }
            if (field948 == 3) {
                if (field927 <= 5 || Statics.field15.method2723() > 0) {
                    int var2 = Statics.field15.method2722();
                    if (var2 != 0) {
                        this.method1236(var2);
                        return;
                    }
                    field948++;
                } else if (class176.method218() - Statics.field2226 > 30000L) {
                    this.method1236(-2);
                    return;
                }
            }
            if (field948 == 4) {
                class160 var3 = Statics.field15;
                boolean var4 = field927 > 20;
                if (Statics.field3236 != null) {
                    try {
                        Statics.field3236.method2721();
                    } catch (Exception var14) {
                    }
                    Statics.field3236 = null;
                }
                Statics.field3236 = var3;
                class239.method1600(var4);
                class239.field3245.field2370 = 0;
                Statics.field3229 = null;
                Statics.field877 = null;
                class239.field3238 = 0;
                while (true) {
                    class235 var6 = (class235) class239.field3235.method3262();
                    if (var6 == null) {
                        while (true) {
                            class235 var7 = (class235) class239.field3234.method3262();
                            if (var7 == null) {
                                if (class239.field3241 != 0) {
                                    try {
                                        class174 var8 = new class174(4);
                                        var8.method2876(4);
                                        var8.method2876(class239.field3241);
                                        var8.method2877(0);
                                        Statics.field3236.method2725(var8.field2373, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3236.method2721();
                                        } catch (Exception var12) {
                                        }
                                        class239.field3243++;
                                        Statics.field3236 = null;
                                    }
                                }
                                class239.field3225 = 0;
                                Statics.field3226 = class176.method218();
                                Statics.field3643 = null;
                                Statics.field15 = null;
                                field948 = 0;
                                field952 = 0;
                                return;
                            }
                            class239.field3231.method3201(var7);
                            class239.field3232.method3259(var7, var7.field2454);
                            class239.field3233++;
                            class239.field3239--;
                        }
                    }
                    class239.field3227.method3259(var6, var6.field2454);
                    class239.field3237++;
                    class239.field3230--;
                }
            }
        } catch (IOException var15) {
            this.method1236(-3);
        }
    }

    @ObfuscatedName("client.fg(IB)V")
    public void method1236(int arg0) {
        Statics.field3643 = null;
        Statics.field15 = null;
        field948 = 0;
        if (Statics.field793 == Statics.field657) {
            Statics.field793 = Statics.field526;
        } else {
            Statics.field793 = Statics.field657;
        }
        field952++;
        if (field952 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field927 <= 5) {
                this.method770("js5connect_full");
                field927 = 1000;
            } else {
                field1182 = 3000;
            }
        } else if (field952 >= 2 && arg0 == 6) {
            this.method770("js5connect_outofdate");
            field927 = 1000;
        } else if (field952 >= 4) {
            if (field927 <= 5) {
                this.method770("js5connect");
                field927 = 1000;
            } else {
                field1182 = 3000;
            }
        }
    }

    @ObfuscatedName("aa.fe(I)V")
    public static void method627() {
        if (field1123 == 0) {
            Statics.field621 = new class140(4, 104, 104, class62.field749);
            for (int var0 = 0; var0 < 4; var0++) {
                field981[var0] = new class162(104, 104);
            }
            Statics.field3215 = new class286(512, 512);
            class93.field1448 = class226.field2847;
            class93.field1435 = 5;
            field1123 = 20;
        } else if (field1123 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class137.field2034[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class140.method2494(var1, 500, 800, 512, 334);
            class93.field1448 = class226.field2848;
            class93.field1435 = 10;
            field1123 = 30;
        } else if (field1123 == 30) {
            Statics.field950 = method230(0, false, true, true);
            Statics.field951 = method230(1, false, true, true);
            Statics.field351 = method230(2, true, false, true);
            Statics.field333 = method230(3, false, true, true);
            Statics.field674 = method230(4, false, true, true);
            Statics.field822 = method230(5, true, true, true);
            Statics.field316 = method230(6, true, true, false);
            Statics.field792 = method230(7, false, true, true);
            Statics.field311 = method230(8, false, true, true);
            Statics.field1225 = method230(9, false, true, true);
            Statics.field3722 = method230(10, false, true, true);
            Statics.field2283 = method230(11, false, true, true);
            Statics.field2396 = method230(12, false, true, true);
            Statics.field356 = method230(13, true, false, true);
            Statics.field859 = method230(14, false, true, false);
            Statics.field319 = method230(15, false, true, true);
            Statics.field493 = method230(16, false, true, false);
            class93.field1448 = class226.field2849;
            class93.field1435 = 20;
            field1123 = 40;
        } else if (field1123 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field950.method3865() * 4 / 100;
            int var8 = var7 + Statics.field951.method3865() * 4 / 100;
            int var9 = var8 + Statics.field351.method3865() * 2 / 100;
            int var10 = var9 + Statics.field333.method3865() * 2 / 100;
            int var11 = var10 + Statics.field674.method3865() * 6 / 100;
            int var12 = var11 + Statics.field822.method3865() * 4 / 100;
            int var13 = var12 + Statics.field316.method3865() * 2 / 100;
            int var14 = var13 + Statics.field792.method3865() * 58 / 100;
            int var15 = var14 + Statics.field311.method3865() * 2 / 100;
            int var16 = var15 + Statics.field1225.method3865() * 2 / 100;
            int var17 = var16 + Statics.field3722.method3865() * 2 / 100;
            int var18 = var17 + Statics.field2283.method3865() * 2 / 100;
            int var19 = var18 + Statics.field2396.method3865() * 2 / 100;
            int var20 = var19 + Statics.field356.method3865() * 2 / 100;
            int var21 = var20 + Statics.field859.method3865() * 2 / 100;
            int var22 = var21 + Statics.field319.method3865() * 2 / 100;
            int var23 = var22 + Statics.field493.method3865() * 2 / 100;
            if (var23 == 100) {
                class93.field1448 = class226.field3005;
                class93.field1435 = 30;
                field1123 = 45;
            } else {
                if (var23 != 0) {
                    class93.field1448 = class226.field2850 + var23 + "%";
                }
                class93.field1435 = 30;
            }
        } else if (field1123 == 45) {
            class110.method463(22050, !field1066, 2);
            class205 var24 = new class205();
            var24.method3416(9, 128);
            Statics.field340 = Statics.method671(Statics.field712, 0, 22050);
            Statics.field340.method1852(var24);
            class238 var25 = Statics.field319;
            class238 var26 = Statics.field859;
            class238 var27 = Statics.field674;
            Statics.field2492 = var25;
            Statics.field2484 = var26;
            Statics.field2485 = var27;
            Statics.field2486 = var24;
            Statics.field2394 = Statics.method671(Statics.field712, 1, 2048);
            Statics.field2368 = new class103();
            Statics.field2394.method1852(Statics.field2368);
            Statics.field740 = new class117(22050, Statics.field1644);
            class93.field1448 = class226.field2968;
            class93.field1435 = 35;
            field1123 = 50;
            Statics.field675 = new class263(Statics.field311, Statics.field356);
        } else if (field1123 == 50) {
            int var28 = class262.method4375().length;
            field1079 = Statics.field675.method4382(class262.method4375());
            if (field1079.size() < var28) {
                class93.field1448 = class226.field2853 + field1079.size() * 100 / var28 + "%";
                class93.field1435 = 40;
            } else {
                Statics.field599 = (class264) field1079.get(class262.field3603);
                Statics.field876 = (class264) field1079.get(class262.field3608);
                Statics.field245 = (class264) field1079.get(class262.field3604);
                Statics.field1764 = new class292(true);
                class93.field1448 = class226.field2854;
                class93.field1435 = 40;
                field1123 = 60;
            }
        } else if (field1123 == 60) {
            int var29 = class93.method1653(Statics.field3722, Statics.field311);
            int var30 = class93.method2260();
            if (var29 < var30) {
                class93.field1448 = class226.field2875 + var29 * 100 / var30 + "%";
                class93.field1435 = 50;
            } else {
                class93.field1448 = class226.field2856;
                class93.field1435 = 50;
                method116(5);
                field1123 = 70;
            }
        } else if (field1123 == 70) {
            if (Statics.field351.method3770()) {
                class260.method96(Statics.field351);
                class247.method3872(Statics.field351);
                class238 var31 = Statics.field351;
                class238 var32 = Statics.field792;
                Statics.field3326 = var31;
                Statics.field3285 = var32;
                Statics.field3335 = Statics.field3326.method3771(3);
                class238 var33 = Statics.field351;
                class238 var34 = Statics.field792;
                boolean var35 = field1066;
                Statics.field3415 = var33;
                Statics.field3416 = var34;
                class256.field3427 = var35;
                class259.method1046(Statics.field351, Statics.field792);
                class253.method121(Statics.field351);
                class257.method2643(Statics.field351, Statics.field792, field1031, Statics.field599);
                class261.method3726(Statics.field351, Statics.field950, Statics.field951);
                class246.method1052(Statics.field351, Statics.field792);
                class251.method2272(Statics.field351);
                class238 var36 = Statics.field351;
                Statics.field3259 = var36;
                Statics.field3260 = Statics.field3259.method3771(16);
                class217.method991(Statics.field333, Statics.field792, Statics.field311, Statics.field356);
                class241.method117(Statics.field351);
                class238 var37 = Statics.field351;
                Statics.field3380 = var37;
                class238 var38 = Statics.field351;
                Statics.field3291 = var38;
                class238 var39 = Statics.field351;
                Statics.field3295 = var39;
                class238 var40 = Statics.field351;
                Statics.field3366 = var40;
                Statics.field294 = new class98();
                class255.method2811(Statics.field351, Statics.field311, Statics.field356);
                class238 var41 = Statics.field351;
                class238 var42 = Statics.field311;
                Statics.field3352 = var41;
                Statics.field3337 = var42;
                class238 var43 = Statics.field351;
                class238 var44 = Statics.field311;
                Statics.field2320 = var44;
                if (var43.method3770()) {
                    Statics.field3280 = var43.method3771(35);
                    Statics.field477 = new class243[Statics.field3280];
                    for (int var45 = 0; var45 < Statics.field3280; var45++) {
                        byte[] var46 = var43.method3760(35, var45);
                        if (var46 != null) {
                            Statics.field477[var45] = new class243(var45);
                            Statics.field477[var45].method3917(new class174(var46));
                            Statics.field477[var45].method3919();
                        }
                    }
                }
                class93.field1448 = class226.field2858;
                class93.field1435 = 60;
                field1123 = 80;
            } else {
                class93.field1448 = class226.field2857 + Statics.field351.method3859() + "%";
                class93.field1435 = 60;
            }
        } else if (field1123 == 80) {
            int var47 = 0;
            if (Statics.field1788 == null) {
                Statics.field1788 = class287.method2860(Statics.field311, "compass", "");
            } else {
                var47++;
            }
            if (Statics.field871 == null) {
                Statics.field871 = class287.method2860(Statics.field311, "mapedge", "");
            } else {
                var47++;
            }
            if (Statics.field3165 == null) {
                Statics.field3165 = class287.method3748(Statics.field311, "mapscene", "");
            } else {
                var47++;
            }
            if (Statics.field18 == null) {
                Statics.field18 = class287.method26(Statics.field311, "headicons_pk", "");
            } else {
                var47++;
            }
            if (Statics.field3251 == null) {
                Statics.field3251 = class287.method26(Statics.field311, "headicons_prayer", "");
            } else {
                var47++;
            }
            if (Statics.field1464 == null) {
                Statics.field1464 = class287.method26(Statics.field311, "headicons_hint", "");
            } else {
                var47++;
            }
            if (Statics.field473 == null) {
                Statics.field473 = class287.method26(Statics.field311, "mapmarker", "");
            } else {
                var47++;
            }
            if (Statics.field668 == null) {
                Statics.field668 = class287.method26(Statics.field311, "cross", "");
            } else {
                var47++;
            }
            if (Statics.field581 == null) {
                Statics.field581 = class287.method26(Statics.field311, "mapdots", "");
            } else {
                var47++;
            }
            if (Statics.field781 == null) {
                Statics.field781 = class287.method3748(Statics.field311, "scrollbar", "");
            } else {
                var47++;
            }
            if (Statics.field13 == null) {
                Statics.field13 = class287.method3748(Statics.field311, "mod_icons", "");
            } else {
                var47++;
            }
            if (var47 < 11) {
                class93.field1448 = class226.field2961 + var47 * 100 / 12 + "%";
                class93.field1435 = 70;
            } else {
                Statics.field3638 = Statics.field13;
                Statics.field871.method4741();
                int var48 = (int) (Math.random() * 21.0D) - 10;
                int var49 = (int) (Math.random() * 21.0D) - 10;
                int var50 = (int) (Math.random() * 21.0D) - 10;
                int var51 = (int) (Math.random() * 41.0D) - 20;
                Statics.field3165[0].method4668(var48 + var51, var49 + var51, var50 + var51);
                class93.field1448 = class226.field2860;
                class93.field1435 = 70;
                field1123 = 90;
            }
        } else if (field1123 == 90) {
            if (Statics.field1225.method3770()) {
                class126 var52 = new class126(Statics.field1225, Statics.field311, 20, 0.8D, field1066 ? 64 : 128);
                class137.method2386(var52);
                class137.method2387(0.8D);
                class93.field1448 = class226.field2862;
                class93.field1435 = 90;
                field1123 = 110;
            } else {
                class93.field1448 = class226.field2861 + Statics.field1225.method3859() + "%";
                class93.field1435 = 90;
            }
        } else if (field1123 == 110) {
            Statics.field910 = new class72();
            Statics.field712.method2682(Statics.field910, 10);
            class93.field1448 = class226.field2863;
            class93.field1435 = 94;
            field1123 = 120;
        } else if (field1123 == 120) {
            if (Statics.field3722.method3780("huffman", "")) {
                class166 var53 = new class166(Statics.field3722.method3785("huffman", ""));
                Statics.field3646 = var53;
                class93.field1448 = class226.field2865;
                class93.field1435 = 96;
                field1123 = 130;
            } else {
                class93.field1448 = class226.field2864 + "%";
                class93.field1435 = 96;
            }
        } else if (field1123 == 130) {
            if (!Statics.field333.method3770()) {
                class93.field1448 = class226.field2989 + Statics.field333.method3859() * 4 / 5 + "%";
                class93.field1435 = 100;
            } else if (!Statics.field2396.method3770()) {
                class93.field1448 = class226.field2989 + (80 + Statics.field2396.method3859() / 6) + "%";
                class93.field1435 = 100;
            } else if (Statics.field356.method3770()) {
                class93.field1448 = class226.field2867;
                class93.field1435 = 98;
                field1123 = 140;
            } else {
                class93.field1448 = class226.field2989 + (96 + Statics.field356.method3859() / 50) + "%";
                class93.field1435 = 100;
            }
        } else if (field1123 == 140) {
            if (Statics.field493.method3781(class41.field550.field548)) {
                if (Statics.field768 == null) {
                    Statics.field768 = new class289();
                    Statics.field768.method4823(Statics.field493, Statics.field245, field1079, Statics.field3165);
                }
                int var54 = Statics.field768.method4824();
                if (var54 < 100) {
                    class93.field1448 = class226.field2868 + (var54 * 9 / 10 + 10) + "%";
                } else {
                    class93.field1448 = class226.field2869;
                    class93.field1435 = 100;
                    field1123 = 150;
                }
            } else {
                class93.field1448 = class226.field2868 + Statics.field493.method3819(class41.field550.field548) / 10 + "%";
            }
        } else if (field1123 == 150) {
            method116(10);
        }
    }

    @ObfuscatedName("ar.fa(IZZZI)Lik;")
    public static class238 method230(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class161 var4 = null;
        if (class156.field2236 != null) {
            var4 = new class161(arg0, class156.field2236, Statics.field2238[arg0], 1000000);
        }
        return new class238(var4, Statics.field874, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fb(I)V")
    public final void method1060() {
        try {
            if (field953 == 0) {
                if (Statics.field1379 != null) {
                    Statics.field1379.method2721();
                    Statics.field1379 = null;
                }
                Statics.field2265 = null;
                field974 = false;
                field1027 = 0;
                field953 = 1;
            }
            if (field953 == 1) {
                if (Statics.field2265 == null) {
                    Statics.field2265 = Statics.field712.method2681(Statics.field235, Statics.field793);
                }
                if (Statics.field2265.field2213 == 2) {
                    throw new IOException();
                }
                if (Statics.field2265.field2213 == 1) {
                    Statics.field1379 = new class160((Socket) Statics.field2265.field2214, Statics.field712);
                    Statics.field2265 = null;
                    field953 = 2;
                }
            }
            if (field953 == 2) {
                field963.field2370 = 0;
                field963.method2876(14);
                Statics.field1379.method2725(field963.field2373, 0, 1);
                field965.field2370 = 0;
                field953 = 3;
            }
            if (field953 == 3) {
                if (Statics.field340 != null) {
                    Statics.field340.method1847();
                }
                if (Statics.field2394 != null) {
                    Statics.field2394.method1847();
                }
                int var1 = Statics.field1379.method2722();
                if (Statics.field340 != null) {
                    Statics.field340.method1847();
                }
                if (Statics.field2394 != null) {
                    Statics.field2394.method1847();
                }
                if (var1 != 0) {
                    method956(var1);
                    return;
                }
                field965.field2370 = 0;
                field953 = 4;
            }
            if (field953 == 4) {
                if (field965.field2370 < 8) {
                    int var2 = Statics.field1379.method2723();
                    if (var2 > 8 - field965.field2370) {
                        var2 = 8 - field965.field2370;
                    }
                    if (var2 > 0) {
                        Statics.field1379.method2724(field965.field2373, field965.field2370, var2);
                        field965.field2370 += var2;
                    }
                }
                if (field965.field2370 == 8) {
                    field965.field2370 = 0;
                    Statics.field567 = field965.method2897();
                    field953 = 5;
                }
            }
            if (field953 == 5) {
                int[] var3 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field567 >> 32), (int) (Statics.field567 & 0xFFFFFFFFFFFFFFFFL) };
                field963.field2370 = 0;
                field963.method2876(1);
                field963.method2876(class93.field1456.method8());
                field963.method3055(var3[0]);
                field963.method3055(var3[1]);
                field963.method3055(var3[2]);
                field963.method3055(var3[3]);
                switch(class93.field1456.field2191) {
                    case 0:
                        field963.method3055((Integer) Statics.field527.field1312.get(class271.method959(class93.field1431)));
                        field963.field2370 += 4;
                        break;
                    case 1:
                        field963.field2370 += 8;
                        break;
                    case 2:
                    case 3:
                        field963.method2878(Statics.field1426);
                        field963.field2370 += 5;
                }
                field963.method2936(class93.field1445);
                field963.method2911(class91.field1416, class91.field1417);
                field964.field2370 = 0;
                if (field927 == 40) {
                    field964.method2876(18);
                } else {
                    field964.method2876(16);
                }
                field964.method2877(0);
                int var4 = field964.field2370;
                field964.method3055(141);
                field964.method2882(field963.field2373, 0, field963.field2370);
                int var5 = field964.field2370;
                field964.method2936(class93.field1431);
                field964.method2876((field1135 ? 1 : 0) << 1 | (field1066 ? 1 : 0));
                field964.method2877(Statics.field413);
                field964.method2877(Statics.field1916);
                class180 var6 = field964;
                if (field957 == null) {
                    byte[] var7 = new byte[24];
                    try {
                        class156.field2235.method2127(0L);
                        class156.field2235.method2113(var7);
                        int var8;
                        for (var8 = 0; var8 < 24 && var7[var8] == 0; var8++) {
                        }
                        if (var8 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var32) {
                        for (int var10 = 0; var10 < 24; var10++) {
                            var7[var10] = -1;
                        }
                    }
                    var6.method2882(var7, 0, var7.length);
                } else {
                    var6.method2882(field957, 0, field957.length);
                }
                field964.method2936(Statics.field1124);
                field964.method3055(Statics.field3121);
                class174 var13 = new class174(Statics.field1764.method5028());
                Statics.field1764.method5024(var13);
                field964.method2882(var13.field2373, 0, var13.field2373.length);
                field964.method2876(Statics.field348);
                field964.method3055(0);
                field964.method3055(Statics.field950.field3199);
                field964.method3055(Statics.field951.field3199);
                field964.method3055(Statics.field351.field3199);
                field964.method3055(Statics.field333.field3199);
                field964.method3055(Statics.field674.field3199);
                field964.method3055(Statics.field822.field3199);
                field964.method3055(Statics.field316.field3199);
                field964.method3055(Statics.field792.field3199);
                field964.method3055(Statics.field311.field3199);
                field964.method3055(Statics.field1225.field3199);
                field964.method3055(Statics.field3722.field3199);
                field964.method3055(Statics.field2283.field3199);
                field964.method3055(Statics.field2396.field3199);
                field964.method3055(Statics.field356.field3199);
                field964.method3055(Statics.field859.field3199);
                field964.method3055(Statics.field319.field3199);
                field964.method3055(Statics.field493.field3199);
                field964.method3061(var3, var5, field964.field2370);
                field964.method2887(field964.field2370 - var4);
                Statics.field1379.method2725(field964.field2373, 0, field964.field2370);
                field963.method3120(var3);
                for (int var14 = 0; var14 < 4; var14++) {
                    var3[var14] += 50;
                }
                field965.method3120(var3);
                field953 = 6;
            }
            if (field953 == 6 && Statics.field1379.method2723() > 0) {
                int var15 = Statics.field1379.method2722();
                if (var15 == 21 && field927 == 20) {
                    field953 = 7;
                } else if (var15 == 2) {
                    field953 = 9;
                } else if (var15 == 15 && field927 == 40) {
                    field975 = -1;
                    field953 = 13;
                } else if (var15 == 23 && field955 < 1) {
                    field955++;
                    field953 = 0;
                } else if (var15 == 29) {
                    field953 = 11;
                } else {
                    method956(var15);
                    return;
                }
            }
            if (field953 == 7 && Statics.field1379.method2723() > 0) {
                field956 = (Statics.field1379.method2722() + 3) * 60;
                field953 = 8;
            }
            if (field953 == 8) {
                field1027 = 0;
                class93.method229(class226.field2873, class226.field2874, field956 / 60 + class226.field2933);
                if (--field956 <= 0) {
                    field953 = 0;
                }
            } else {
                if (field953 == 9 && Statics.field1379.method2723() >= 13) {
                    boolean var16 = Statics.field1379.method2722() == 1;
                    Statics.field1379.method2724(field965.field2373, 0, 4);
                    field965.field2370 = 0;
                    boolean var17 = false;
                    if (var16) {
                        int var18 = field965.method3126() << 24;
                        int var19 = var18 | field965.method3126() << 16;
                        int var20 = var19 | field965.method3126() << 8;
                        int var21 = var20 | field965.method3126();
                        int var22 = class271.method959(class93.field1431);
                        if (Statics.field527.field1312.size() >= 10 && !Statics.field527.field1312.containsKey(var22)) {
                            Iterator var23 = Statics.field527.field1312.entrySet().iterator();
                            var23.next();
                            var23.remove();
                        }
                        Statics.field527.field1312.put(var22, var21);
                        class82.method1400();
                    }
                    field1088 = Statics.field1379.method2722();
                    field1022 = Statics.field1379.method2722() == 1;
                    field1046 = Statics.field1379.method2722();
                    field1046 <<= 0x8;
                    field1046 += Statics.field1379.method2722();
                    field1043 = Statics.field1379.method2722();
                    Statics.field1379.method2724(field965.field2373, 0, 1);
                    field965.field2370 = 0;
                    field967 = field965.method3126();
                    Statics.field1379.method2724(field965.field2373, 0, 2);
                    field965.field2370 = 0;
                    field975 = field965.method2930();
                    try {
                        client var24 = Statics.field3334;
                        JSObject.getWindow(var24).call("zap", (Object[]) null);
                    } catch (Throwable var31) {
                    }
                    field953 = 10;
                }
                if (field953 != 10) {
                    if (field953 == 11 && Statics.field1379.method2723() >= 2) {
                        field965.field2370 = 0;
                        Statics.field1379.method2724(field965.field2373, 0, 2);
                        field965.field2370 = 0;
                        Statics.field1492 = field965.method2930();
                        field953 = 12;
                    }
                    if (field953 == 12 && Statics.field1379.method2723() >= Statics.field1492) {
                        field965.field2370 = 0;
                        Statics.field1379.method2724(field965.field2373, 0, Statics.field1492);
                        field965.field2370 = 0;
                        String var26 = field965.method2899();
                        String var27 = field965.method2899();
                        String var28 = field965.method2899();
                        class93.method229(var26, var27, var28);
                        method116(10);
                    }
                    if (field953 == 13) {
                        if (field975 == -1) {
                            if (Statics.field1379.method2723() < 2) {
                                return;
                            }
                            Statics.field1379.method2724(field965.field2373, 0, 2);
                            field965.field2370 = 0;
                            field975 = field965.method2930();
                        }
                        if (Statics.field1379.method2723() >= field975) {
                            Statics.field1379.method2724(field965.field2373, 0, field975);
                            field965.field2370 = 0;
                            int var29 = field975;
                            method47();
                            class97.method122(field965);
                            if (field965.field2370 != var29) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field1027++;
                        if (field1027 > 2000) {
                            if (field955 < 1) {
                                if (Statics.field793 == Statics.field657) {
                                    Statics.field793 = Statics.field526;
                                } else {
                                    Statics.field793 = Statics.field657;
                                }
                                field955++;
                                field953 = 0;
                            } else {
                                method956(-3);
                            }
                        }
                    }
                } else if (Statics.field1379.method2723() >= field975) {
                    field965.field2370 = 0;
                    Statics.field1379.method2724(field965.field2373, 0, field975);
                    method3098();
                    class97.method122(field965);
                    Statics.field1336 = -1;
                    method146(false);
                    field967 = -1;
                }
            }
        } catch (IOException var33) {
            if (field955 < 1) {
                if (Statics.field793 == Statics.field657) {
                    Statics.field793 = Statics.field526;
                } else {
                    Statics.field793 = Statics.field657;
                }
                field955++;
                field953 = 0;
            } else {
                method956(-2);
            }
        }
    }

    @ObfuscatedName("fh.fz(I)V")
    public static void method3098() {
        field930 = -1L;
        field933 = -1;
        Statics.field910.field851 = 0;
        Statics.field2387 = true;
        field934 = true;
        field1006 = -1L;
        class281.method3947();
        field963.field2370 = 0;
        field965.field2370 = 0;
        field967 = -1;
        field970 = -1;
        field971 = -1;
        field1056 = -1;
        field968 = 0;
        field936 = 0;
        field1090 = 0;
        field996 = 0;
        method1610();
        class60.method2457(0);
        class99.field1531.clear();
        class99.field1530.method3218();
        class99.field1529.method3382();
        class99.field1532 = 0;
        field1074 = 0;
        field1076 = false;
        field1170 = 0;
        field985 = (int) (Math.random() * 100.0D) - 50;
        field987 = (int) (Math.random() * 110.0D) - 55;
        field962 = (int) (Math.random() * 80.0D) - 40;
        field992 = (int) (Math.random() * 120.0D) - 60;
        field994 = (int) (Math.random() * 30.0D) - 20;
        field1005 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field1155 = 0;
        field1148 = -1;
        field1153 = 0;
        field1161 = 0;
        field945 = class92.field1423;
        field1051 = class92.field1423;
        field1138 = 0;
        class97.method3101();
        for (int var0 = 0; var0 < 2048; var0++) {
            field1041[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field958[var1] = null;
        }
        field1050 = -1;
        field1053.method3312();
        field1024.method3312();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field1160[var2][var3][var4] = null;
                }
            }
        }
        field1094 = new class194();
        field1188 = 0;
        field1067 = 0;
        field1191 = 0;
        for (int var5 = 0; var5 < Statics.field3260; var5++) {
            class242 var6 = class242.method2262(var5);
            if (var6 != null) {
                class212.field2590[var5] = 0;
                class212.field2589[var5] = 0;
            }
        }
        Statics.field294.method1633();
        field982 = -1;
        if (field1081 != -1) {
            class217.method578(field1081);
        }
        for (class69 var7 = (class69) field1082.method3262(); var7 != null; var7 = (class69) field1082.method3263()) {
            method551(var7, true);
        }
        field1081 = -1;
        field1082 = new class191(8);
        field954 = null;
        method1610();
        field1193.method3610((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field1047[var8] = null;
            field1048[var8] = false;
        }
        class64.method981();
        field928 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field1096[var9] = true;
        }
        field963.method3121(77);
        field963.method2876(method3650());
        field963.method2877(Statics.field413);
        field963.method2877(Statics.field1916);
        field959 = null;
        Statics.field315 = 0;
        Statics.field1316 = null;
        for (int var10 = 0; var10 < 8; var10++) {
            field1196[var10] = new class17();
        }
        Statics.field864 = null;
    }

    @ObfuscatedName("s.fm(B)V")
    public static void method47() {
        field963.field2370 = 0;
        field965.field2370 = 0;
        field967 = -1;
        field970 = -1;
        field971 = -1;
        field1056 = -1;
        field975 = 0;
        field968 = 0;
        field936 = 0;
        method1610();
        field1155 = 0;
        field1153 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1041[var0] = null;
        }
        Statics.field3209 = null;
        for (int var1 = 0; var1 < field958.length; var1++) {
            class87 var2 = field958[var1];
            if (var2 != null) {
                var2.field1254 = -1;
                var2.field1279 = false;
            }
        }
        class64.field778 = new class191(32);
        method116(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field1096[var3] = true;
        }
        field963.method3121(77);
        field963.method2876(method3650());
        field963.method2877(Statics.field413);
        field963.method2877(Statics.field1916);
    }

    @ObfuscatedName("bb.fv(II)V")
    public static void method956(int arg0) {
        if (arg0 == -3) {
            class93.method229(class226.field3098, class226.field2877, class226.field2878);
        } else if (arg0 == -2) {
            class93.method229(class226.field2879, class226.field3040, class226.field2881);
        } else if (arg0 == -1) {
            class93.method229(class226.field2882, class226.field2883, class226.field3074);
        } else if (arg0 == 3) {
            class93.field1449 = 3;
        } else if (arg0 == 4) {
            class93.method229(class226.field2943, class226.field2886, class226.field3034);
        } else if (arg0 == 5) {
            class93.method229(class226.field3015, class226.field2889, class226.field2890);
        } else if (arg0 == 6) {
            class93.method229(class226.field2891, class226.field2892, class226.field3050);
        } else if (arg0 == 7) {
            class93.method229(class226.field2894, class226.field2895, class226.field2896);
        } else if (arg0 == 8) {
            class93.method229(class226.field3025, class226.field3036, class226.field2899);
        } else if (arg0 == 9) {
            class93.method229(class226.field2900, class226.field2909, class226.field2902);
        } else if (arg0 == 10) {
            class93.method229(class226.field2903, class226.field2904, class226.field2851);
        } else if (arg0 == 11) {
            class93.method229(class226.field2906, class226.field2907, class226.field2956);
        } else if (arg0 == 12) {
            class93.method229(class226.field3077, class226.field2910, class226.field2911);
        } else if (arg0 == 13) {
            class93.method229(class226.field2912, class226.field2913, class226.field3045);
        } else if (arg0 == 14) {
            class93.method229(class226.field2915, class226.field2916, class226.field2917);
        } else if (arg0 == 16) {
            class93.method229(class226.field2918, class226.field2919, class226.field2920);
        } else if (arg0 == 17) {
            class93.method229(class226.field2905, class226.field2928, class226.field2923);
        } else if (arg0 == 18) {
            class93.method229(class226.field2924, class226.field3024, class226.field2926);
        } else if (arg0 == 19) {
            class93.method229(class226.field2951, class226.field2977, class226.field2929);
        } else if (arg0 == 20) {
            class93.method229(class226.field2930, class226.field2999, class226.field2932);
        } else if (arg0 == 22) {
            class93.method229(class226.field2844, class226.field2934, class226.field2935);
        } else if (arg0 == 23) {
            class93.method229(class226.field2936, class226.field3049, class226.field2941);
        } else if (arg0 == 24) {
            class93.method229(class226.field2939, class226.field2940, class226.field2908);
        } else if (arg0 == 25) {
            class93.method229(class226.field2981, class226.field3069, class226.field2927);
        } else if (arg0 == 26) {
            class93.method229(class226.field2945, class226.field2946, class226.field2947);
        } else if (arg0 == 27) {
            class93.method229(class226.field2885, class226.field2949, class226.field2950);
        } else if (arg0 == 31) {
            class93.method229(class226.field2957, class226.field2958, class226.field2959);
        } else if (arg0 == 32) {
            class93.method229(class226.field2960, class226.field3004, class226.field2962);
        } else if (arg0 == 37) {
            class93.method229(class226.field2963, class226.field2953, class226.field2965);
        } else if (arg0 == 38) {
            class93.method229(class226.field2966, class226.field2898, class226.field2948);
        } else if (arg0 == 55) {
            class93.method229(class226.field2969, class226.field2970, class226.field2971);
        } else if (arg0 == 56) {
            class93.method229(class226.field2972, class226.field2973, class226.field3016);
            method116(11);
            return;
        } else if (arg0 == 57) {
            class93.method229(class226.field3065, class226.field2976, class226.field3032);
            method116(11);
            return;
        } else {
            class93.method229(class226.field2978, class226.field2979, class226.field2980);
        }
        method116(10);
    }

    @ObfuscatedName("au.fj(I)V")
    public static final void method624() {
        if (Statics.field1379 != null) {
            Statics.field1379.method2721();
            Statics.field1379 = null;
        }
        method1599();
        Statics.field621.method2460();
        for (int var0 = 0; var0 < 4; var0++) {
            field981[var0].method2762();
        }
        System.gc();
        class204.field2487 = 1;
        Statics.field2488 = null;
        Statics.field2489 = -1;
        Statics.field2483 = -1;
        Statics.field2043 = 0;
        Statics.field1383 = false;
        Statics.field2135 = 2;
        field1157 = -1;
        field1158 = false;
        class83.method2();
        method116(10);
    }

    @ObfuscatedName("ce.fu(B)V")
    public static final void method1599() {
        class260.method3745();
        class247.field3317.method3247();
        class248.method36();
        class256.field3417.method3247();
        class256.field3439.method3247();
        class256.field3419.method3247();
        class256.field3420.method3247();
        class259.field3529.method3247();
        class259.field3530.method3247();
        class257.field3479.method3247();
        class257.field3472.method3247();
        class257.field3473.method3247();
        class261.method1027();
        class246.method468();
        class251.method3751();
        class242.field3261.method3247();
        class255.method3722();
        class249.field3338.method3247();
        class249.field3339.method3247();
        class253.field3375.method3247();
        class252.field3363.method3247();
        class243.field3266.method3247();
        class214.method142();
        class217.method3756();
        ((class126) Statics.field2031).method2159();
        class100.field1540.method3247();
        Statics.field950.method3774();
        Statics.field951.method3774();
        Statics.field333.method3774();
        Statics.field674.method3774();
        Statics.field822.method3774();
        Statics.field316.method3774();
        Statics.field792.method3774();
        Statics.field311.method3774();
        Statics.field1225.method3774();
        Statics.field3722.method3774();
        Statics.field2283.method3774();
        Statics.field2396.method3774();
    }

    @ObfuscatedName("i.fd(I)V")
    public static final void method37() {
        if (field1090 > 0) {
            method624();
        } else {
            method116(40);
            Statics.field3699 = Statics.field1379;
            Statics.field1379 = null;
        }
    }

    @ObfuscatedName("client.fr(B)V")
    public final void method1061() {
        if (field936 > 1) {
            field936--;
        }
        if (field1090 > 0) {
            field1090--;
        }
        if (field974) {
            field974 = false;
            method37();
            return;
        }
        if (!field1059) {
            method1878();
        }
        for (int var1 = 0; var1 < 100 && this.method1065(); var1++) {
        }
        if (field927 != 30) {
            return;
        }
        while (true) {
            class280 var2 = (class280) class281.field3746.method3280();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                Object var5 = Statics.field910.field850;
                synchronized (Statics.field910.field850) {
                    if (!field1101) {
                        Statics.field910.field851 = 0;
                    } else if (class60.field737 != 0 || Statics.field910.field851 >= 40) {
                        field963.method3121(131);
                        field963.method2876(0);
                        int var6 = field963.field2370;
                        int var7 = 0;
                        for (int var8 = 0; var8 < Statics.field910.field851 && field963.field2370 - var6 < 240; var8++) {
                            var7++;
                            int var9 = Statics.field910.field853[var8];
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > 502) {
                                var9 = 502;
                            }
                            int var10 = Statics.field910.field852[var8];
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > 764) {
                                var10 = 764;
                            }
                            int var11 = var9 * 765 + var10;
                            if (Statics.field910.field853[var8] == -1 && Statics.field910.field852[var8] == -1) {
                                var10 = -1;
                                var9 = -1;
                                var11 = 524287;
                            }
                            if (field931 != var10 || field988 != var9) {
                                int var12 = var10 - field931;
                                field931 = var10;
                                int var13 = var9 - field988;
                                field988 = var9;
                                if (field933 < 8 && var12 >= -32 && var12 <= 31 && var13 >= -32 && var13 <= 31) {
                                    var12 += 32;
                                    var13 += 32;
                                    field963.method2877((field933 << 12) + (var12 << 6) + var13);
                                    field933 = 0;
                                } else if (field933 < 8) {
                                    field963.method2878((field933 << 19) + 8388608 + var11);
                                    field933 = 0;
                                } else {
                                    field963.method3055((field933 << 19) + -1073741824 + var11);
                                    field933 = 0;
                                }
                            } else if (field933 < 2047) {
                                field933++;
                            }
                        }
                        field963.method2888(field963.field2370 - var6);
                        if (var7 >= Statics.field910.field851) {
                            Statics.field910.field851 = 0;
                        } else {
                            Statics.field910.field851 -= var7;
                            for (int var14 = 0; var14 < Statics.field910.field851; var14++) {
                                Statics.field910.field852[var14] = Statics.field910.field852[var7 + var14];
                                Statics.field910.field853[var14] = Statics.field910.field853[var7 + var14];
                            }
                        }
                    }
                }
                if (class60.field737 == 1 || !Statics.field264 && class60.field737 == 4 || class60.field737 == 2) {
                    long var16 = (class60.field738 - field930) / 50L;
                    if (var16 > 4095L) {
                        var16 = 4095L;
                    }
                    field930 = class60.field738;
                    int var18 = class60.field735;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > Statics.field1916) {
                        var18 = Statics.field1916;
                    }
                    int var19 = class60.field736;
                    if (var19 < 0) {
                        var19 = 0;
                    } else if (var19 > Statics.field413) {
                        var19 = Statics.field413;
                    }
                    int var20 = (int) var16;
                    field963.method3121(124);
                    field963.method2877((class60.field737 == 2 ? 1 : 0) + (var20 << 1));
                    field963.method2877(var19);
                    field963.method2877(var18);
                }
                if (class51.field648 > 0) {
                    field963.method3121(143);
                    field963.method2877(0);
                    int var21 = field963.field2370;
                    long var22 = class176.method218();
                    for (int var24 = 0; var24 < class51.field648; var24++) {
                        long var25 = var22 - field1006;
                        if (var25 > 16777215L) {
                            var25 = 16777215L;
                        }
                        field1006 = var22;
                        field963.method2953(class51.field639[var24]);
                        field963.method2950((int) var25);
                    }
                    field963.method2887(field963.field2370 - var21);
                }
                if (field1011 > 0) {
                    field1011--;
                }
                if (class51.field641[96] || class51.field641[97] || class51.field641[98] || class51.field641[99]) {
                    field1012 = true;
                }
                if (field1012 && field1011 <= 0) {
                    field1011 = 20;
                    field1012 = false;
                    field963.method3121(102);
                    field963.method2877(field1005);
                    field963.method2925(field1004);
                }
                if (Statics.field2387 && !field934) {
                    field934 = true;
                    field963.method3121(196);
                    field963.method2876(1);
                }
                if (!Statics.field2387 && field934) {
                    field934 = false;
                    field963.method3121(196);
                    field963.method2876(0);
                }
                if (Statics.field267 != field1148) {
                    field1148 = Statics.field267;
                    method155(Statics.field267);
                }
                if (field927 != 30) {
                    return;
                }
                for (class77 var27 = (class77) field1094.method3336(); var27 != null; var27 = (class77) field1094.method3324()) {
                    if (var27.field1204 > 0) {
                        var27.field1204--;
                    }
                    if (var27.field1204 == 0) {
                        if (var27.field1208 >= 0) {
                            int var28 = var27.field1208;
                            int var29 = var27.field1210;
                            class256 var30 = class256.method4379(var28);
                            if (var29 == 11) {
                                var29 = 10;
                            }
                            if (var29 >= 5 && var29 <= 8) {
                                var29 = 4;
                            }
                            boolean var31 = var30.method4180(var29);
                            if (!var31) {
                                continue;
                            }
                        }
                        Statics.method2261(var27.field1209, var27.field1215, var27.field1206, var27.field1207, var27.field1208, var27.field1216, var27.field1210);
                        var27.method3304();
                    } else {
                        if (var27.field1205 > 0) {
                            var27.field1205--;
                        }
                        if (var27.field1205 == 0 && var27.field1206 >= 1 && var27.field1207 >= 1 && var27.field1206 <= 102 && var27.field1207 <= 102) {
                            if (var27.field1211 >= 0) {
                                int var32 = var27.field1211;
                                int var33 = var27.field1213;
                                class256 var34 = class256.method4379(var32);
                                if (var33 == 11) {
                                    var33 = 10;
                                }
                                if (var33 >= 5 && var33 <= 8) {
                                    var33 = 4;
                                }
                                boolean var35 = var34.method4180(var33);
                                if (!var35) {
                                    continue;
                                }
                            }
                            Statics.method2261(var27.field1209, var27.field1215, var27.field1206, var27.field1207, var27.field1211, var27.field1212, var27.field1213);
                            var27.field1205 = -1;
                            if (var27.field1211 == var27.field1208 && var27.field1208 == -1) {
                                var27.method3304();
                            } else if (var27.field1211 == var27.field1208 && var27.field1216 == var27.field1212 && var27.field1213 == var27.field1210) {
                                var27.method3304();
                            }
                        }
                    }
                }
                int var10002;
                for (int var36 = 0; var36 < field1170; var36++) {
                    var10002 = field1164[var36]--;
                    if (field1164[var36] >= -10) {
                        class106 var38 = field1166[var36];
                        if (var38 == null) {
                            class106 var10000 = (class106) null;
                            var38 = class106.method1766(Statics.field674, field1162[var36], 0);
                            if (var38 == null) {
                                continue;
                            }
                            field1164[var36] += var38.method1768();
                            field1166[var36] = var38;
                        }
                        if (field1164[var36] < 0) {
                            int var45;
                            if (field1165[var36] == 0) {
                                var45 = field1149;
                            } else {
                                int var39 = (field1165[var36] & 0xFF) * 128;
                                int var40 = field1165[var36] >> 16 & 0xFF;
                                int var41 = var40 * 128 + 64 - Statics.field3209.field1243;
                                if (var41 < 0) {
                                    var41 = -var41;
                                }
                                int var42 = field1165[var36] >> 8 & 0xFF;
                                int var43 = var42 * 128 + 64 - Statics.field3209.field1229;
                                if (var43 < 0) {
                                    var43 = -var43;
                                }
                                int var44 = var41 + var43 - 128;
                                if (var44 > var39) {
                                    field1164[var36] = -100;
                                    continue;
                                }
                                if (var44 < 0) {
                                    var44 = 0;
                                }
                                var45 = field1002 * (var39 - var44) / var39;
                            }
                            if (var45 > 0) {
                                class108 var46 = var38.method1774().method1814(Statics.field740);
                                class118 var47 = class118.method1935(var46, 100, var45);
                                var47.method1938(field1163[var36] - 1);
                                Statics.field2368.method1728(var47);
                            }
                            field1164[var36] = -100;
                        }
                    } else {
                        field1170--;
                        for (int var37 = var36; var37 < field1170; var37++) {
                            field1162[var37] = field1162[var37 + 1];
                            field1166[var37] = field1166[var37 + 1];
                            field1163[var37] = field1163[var37 + 1];
                            field1164[var37] = field1164[var37 + 1];
                            field1165[var37] = field1165[var37 + 1];
                        }
                        var36--;
                    }
                }
                if (field1158 && !class204.method4198()) {
                    if (field1042 != 0 && field1157 != -1) {
                        class204.method4508(Statics.field316, field1157, 0, field1042, false);
                    }
                    field1158 = false;
                }
                field968++;
                if (field968 > 750) {
                    method37();
                    return;
                }
                method30();
                for (int var48 = 0; var48 < field1138; var48++) {
                    int var49 = field960[var48];
                    class87 var50 = field958[var49];
                    if (var50 != null) {
                        method3858(var50, var50.field1380.field3544);
                    }
                }
                int[] var51 = class97.field1508;
                for (int var52 = 0; var52 < class97.field1507; var52++) {
                    class75 var53 = field1041[var51[var52]];
                    if (var53 != null && var53.field1240 > 0) {
                        var53.field1240--;
                        if (var53.field1240 == 0) {
                            var53.field1241 = null;
                        }
                    }
                }
                for (int var54 = 0; var54 < field1138; var54++) {
                    int var55 = field960[var54];
                    class87 var56 = field958[var55];
                    if (var56 != null && var56.field1240 > 0) {
                        var56.field1240--;
                        if (var56.field1240 == 0) {
                            var56.field1241 = null;
                        }
                    }
                }
                field997++;
                if (field1129 != 0) {
                    field1030 += 20;
                    if (field1030 >= 400) {
                        field1129 = 0;
                    }
                }
                if (Statics.field797 != null) {
                    field1032++;
                    if (field1032 >= 15) {
                        method1(Statics.field797);
                        Statics.field797 = null;
                    }
                }
                class217 var57 = Statics.field1517;
                class217 var58 = Statics.field226;
                Statics.field1517 = null;
                Statics.field226 = null;
                field1098 = null;
                field1102 = false;
                field1099 = false;
                field1142 = 0;
                while (class51.method1521() && field1142 < 128) {
                    if (field1088 >= 2 && class51.field641[82] && Statics.field3360 == 66) {
                        String var59 = "";
                        Iterator var60 = class99.field1530.iterator();
                        while (var60.hasNext()) {
                            class73 var61 = (class73) var60.next();
                            var59 = var59 + var61.field872 + ':' + var61.field870 + '\n';
                        }
                        Statics.field3334.method743(var59);
                    } else {
                        field1144[field1142] = Statics.field3360;
                        field940[field1142] = Statics.field593;
                        field1142++;
                    }
                }
                if (field1081 != -1) {
                    int var64 = field1081;
                    int var65 = Statics.field413;
                    int var66 = Statics.field1916;
                    if (class217.method1895(var64)) {
                        method2801(Statics.field515[var64], -1, 0, 0, var65, var66, 0, 0);
                    }
                }
                field1106++;
                while (true) {
                    class70 var67;
                    class217 var68;
                    class217 var69;
                    do {
                        var67 = (class70) field973.method3316();
                        if (var67 == null) {
                            while (true) {
                                class70 var70;
                                class217 var71;
                                class217 var72;
                                do {
                                    var70 = (class70) field1122.method3316();
                                    if (var70 == null) {
                                        while (true) {
                                            class70 var73;
                                            class217 var74;
                                            class217 var75;
                                            do {
                                                var73 = (class70) field1110.method3316();
                                                if (var73 == null) {
                                                    this.method1293();
                                                    Statics.method48();
                                                    if (field1049 != null) {
                                                        this.method1069();
                                                    }
                                                    if (Statics.field423 != null) {
                                                        method1(Statics.field423);
                                                        field1039++;
                                                        if (class60.field728 == 0) {
                                                            if (!field1038) {
                                                                label1103: {
                                                                    int var82 = method1534();
                                                                    if (field1060 > 2) {
                                                                        label1088: {
                                                                            label811: {
                                                                                if (field1058 == 1) {
                                                                                    boolean var83;
                                                                                    if (field1060 <= 0) {
                                                                                        var83 = false;
                                                                                    } else if (field1069 && class51.field641[81] && field1189 != -1) {
                                                                                        var83 = true;
                                                                                    } else {
                                                                                        var83 = false;
                                                                                    }
                                                                                    if (!var83) {
                                                                                        break label811;
                                                                                    }
                                                                                }
                                                                                if (!method27(var82)) {
                                                                                    break label1088;
                                                                                }
                                                                            }
                                                                            this.method1066(field1145, field1036);
                                                                            break label1103;
                                                                        }
                                                                    }
                                                                    if (field1060 > 0) {
                                                                        method190(field1145, field1036);
                                                                    }
                                                                }
                                                            } else if (Statics.field423 == Statics.field3210 && field1187 != field1177) {
                                                                class217 var76 = Statics.field423;
                                                                byte var77 = 0;
                                                                if (field1084 == 1 && var76.field2651 == 206) {
                                                                    var77 = 1;
                                                                }
                                                                if (var76.field2751[field1177] <= 0) {
                                                                    var77 = 0;
                                                                }
                                                                if (class218.method3725(method1045(var76))) {
                                                                    int var78 = field1187;
                                                                    int var79 = field1177;
                                                                    var76.field2751[var79] = var76.field2751[var78];
                                                                    var76.field2741[var79] = var76.field2741[var78];
                                                                    var76.field2751[var78] = -1;
                                                                    var76.field2741[var78] = 0;
                                                                } else if (var77 == 1) {
                                                                    int var80 = field1187;
                                                                    int var81 = field1177;
                                                                    while (var80 != var81) {
                                                                        if (var80 > var81) {
                                                                            var76.method3662(var80 - 1, var80);
                                                                            var80--;
                                                                        } else if (var80 < var81) {
                                                                            var76.method3662(var80 + 1, var80);
                                                                            var80++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var76.method3662(field1177, field1187);
                                                                }
                                                                field963.method3121(112);
                                                                field963.method2953(var77);
                                                                field963.method2925(field1187);
                                                                field963.method2925(field1177);
                                                                field963.method2939(Statics.field423.field2637);
                                                            }
                                                            field1032 = 10;
                                                            class60.field737 = 0;
                                                            Statics.field423 = null;
                                                        } else if (field1039 >= 5 && (class60.field729 > field1145 + 5 || class60.field729 < field1145 - 5 || class60.field726 > field1036 + 5 || class60.field726 < field1036 - 5)) {
                                                            field1038 = true;
                                                        }
                                                    }
                                                    if (class140.method2498()) {
                                                        int var84 = class140.field2059;
                                                        int var85 = class140.field2064;
                                                        field963.method3121(90);
                                                        field963.method2876(5);
                                                        field963.method3052(class51.field641[82] ? (class51.field641[81] ? 2 : 1) : 0);
                                                        field963.method2916(Statics.field414 + var84);
                                                        field963.method2877(Statics.field2117 + var85);
                                                        class140.method2459();
                                                        field1028 = class60.field736;
                                                        field1029 = class60.field735;
                                                        field1129 = 1;
                                                        field1030 = 0;
                                                        field1153 = var84;
                                                        field1161 = var85;
                                                    }
                                                    if (Statics.field1517 != var57) {
                                                        if (var57 != null) {
                                                            method1(var57);
                                                        }
                                                        if (Statics.field1517 != null) {
                                                            method1(Statics.field1517);
                                                        }
                                                    }
                                                    if (Statics.field226 != var58 && field1073 == field1072) {
                                                        if (var58 != null) {
                                                            method1(var58);
                                                        }
                                                        if (Statics.field226 != null) {
                                                            method1(Statics.field226);
                                                        }
                                                    }
                                                    if (Statics.field226 == null) {
                                                        if (field1072 > 0) {
                                                            field1072--;
                                                        }
                                                    } else if (field1072 < field1073) {
                                                        field1072++;
                                                        if (field1073 == field1072) {
                                                            method1(Statics.field226);
                                                        }
                                                    }
                                                    int var86 = field985 + Statics.field3209.field1243;
                                                    int var87 = field987 + Statics.field3209.field1229;
                                                    if (Statics.field325 - var86 < -500 || Statics.field325 - var86 > 500 || Statics.field2039 - var87 < -500 || Statics.field2039 - var87 > 500) {
                                                        Statics.field325 = var86;
                                                        Statics.field2039 = var87;
                                                    }
                                                    if (Statics.field325 != var86) {
                                                        Statics.field325 += (var86 - Statics.field325) / 16;
                                                    }
                                                    if (Statics.field2039 != var87) {
                                                        Statics.field2039 += (var87 - Statics.field2039) / 16;
                                                    }
                                                    if (class60.field728 == 4 && Statics.field264) {
                                                        int var88 = class60.field726 - field1009;
                                                        field1007 = var88 * 2;
                                                        field1009 = var88 == -1 || var88 == 1 ? class60.field726 : (field1009 + class60.field726) / 2;
                                                        int var89 = field1133 - class60.field729;
                                                        field1033 = var89 * 2;
                                                        field1133 = var89 == -1 || var89 == 1 ? class60.field729 : (field1133 + class60.field729) / 2;
                                                    } else {
                                                        if (class51.field641[96]) {
                                                            field1033 += (-24 - field1033) / 2;
                                                        } else if (class51.field641[97]) {
                                                            field1033 += (24 - field1033) / 2;
                                                        } else {
                                                            field1033 /= 2;
                                                        }
                                                        if (class51.field641[98]) {
                                                            field1007 += (12 - field1007) / 2;
                                                        } else if (class51.field641[99]) {
                                                            field1007 += (-12 - field1007) / 2;
                                                        } else {
                                                            field1007 /= 2;
                                                        }
                                                        field1009 = class60.field726;
                                                        field1133 = class60.field729;
                                                    }
                                                    field1005 = field1033 / 2 + field1005 & 0x7FF;
                                                    field1004 += field1007 / 2;
                                                    if (field1004 < 128) {
                                                        field1004 = 128;
                                                    }
                                                    if (field1004 > 383) {
                                                        field1004 = 383;
                                                    }
                                                    int var90 = Statics.field325 >> 7;
                                                    int var91 = Statics.field2039 >> 7;
                                                    int var92 = method1372(Statics.field325, Statics.field2039, Statics.field267);
                                                    int var93 = 0;
                                                    if (var90 > 3 && var91 > 3 && var90 < 100 && var91 < 100) {
                                                        for (int var94 = var90 - 4; var94 <= var90 + 4; var94++) {
                                                            for (int var95 = var91 - 4; var95 <= var91 + 4; var95++) {
                                                                int var96 = Statics.field267;
                                                                if (var96 < 3 && (class62.field759[1][var94][var95] & 0x2) == 2) {
                                                                    var96++;
                                                                }
                                                                int var97 = var92 - class62.field749[var96][var94][var95];
                                                                if (var97 > var93) {
                                                                    var93 = var97;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var98 = var93 * 192;
                                                    if (var98 > 98048) {
                                                        var98 = 98048;
                                                    }
                                                    if (var98 < 32768) {
                                                        var98 = 32768;
                                                    }
                                                    if (var98 > field1013) {
                                                        field1013 += (var98 - field1013) / 24;
                                                    } else if (var98 < field1013) {
                                                        field1013 += (var98 - field1013) / 80;
                                                    }
                                                    if (field1167) {
                                                        int var99 = Statics.field450 * 128 + 64;
                                                        int var100 = Statics.field2390 * 128 + 64;
                                                        int var101 = method1372(var99, var100, Statics.field267) - Statics.field3700;
                                                        if (Statics.field1918 < var99) {
                                                            Statics.field1918 += Statics.field1381 * (var99 - Statics.field1918) / 1000 + Statics.field3158;
                                                            if (Statics.field1918 > var99) {
                                                                Statics.field1918 = var99;
                                                            }
                                                        }
                                                        if (Statics.field1918 > var99) {
                                                            Statics.field1918 -= Statics.field1381 * (Statics.field1918 - var99) / 1000 + Statics.field3158;
                                                            if (Statics.field1918 < var99) {
                                                                Statics.field1918 = var99;
                                                            }
                                                        }
                                                        if (Statics.field1758 < var101) {
                                                            Statics.field1758 += Statics.field1381 * (var101 - Statics.field1758) / 1000 + Statics.field3158;
                                                            if (Statics.field1758 > var101) {
                                                                Statics.field1758 = var101;
                                                            }
                                                        }
                                                        if (Statics.field1758 > var101) {
                                                            Statics.field1758 -= Statics.field1381 * (Statics.field1758 - var101) / 1000 + Statics.field3158;
                                                            if (Statics.field1758 < var101) {
                                                                Statics.field1758 = var101;
                                                            }
                                                        }
                                                        if (Statics.field525 < var100) {
                                                            Statics.field525 += Statics.field1381 * (var100 - Statics.field525) / 1000 + Statics.field3158;
                                                            if (Statics.field525 > var100) {
                                                                Statics.field525 = var100;
                                                            }
                                                        }
                                                        if (Statics.field525 > var100) {
                                                            Statics.field525 -= Statics.field1381 * (Statics.field525 - var100) / 1000 + Statics.field3158;
                                                            if (Statics.field525 < var100) {
                                                                Statics.field525 = var100;
                                                            }
                                                        }
                                                        int var102 = Statics.field603 * 128 + 64;
                                                        int var103 = Statics.field1335 * 128 + 64;
                                                        int var104 = method1372(var102, var103, Statics.field267) - Statics.field1631;
                                                        int var105 = var102 - Statics.field1918;
                                                        int var106 = var104 - Statics.field1758;
                                                        int var107 = var103 - Statics.field525;
                                                        int var108 = (int) Math.sqrt((double) (var105 * var105 + var107 * var107));
                                                        int var109 = (int) (Math.atan2((double) var106, (double) var108) * 325.949D) & 0x7FF;
                                                        int var110 = (int) (Math.atan2((double) var105, (double) var107) * -325.949D) & 0x7FF;
                                                        if (var109 < 128) {
                                                            var109 = 128;
                                                        }
                                                        if (var109 > 383) {
                                                            var109 = 383;
                                                        }
                                                        if (Statics.field875 < var109) {
                                                            Statics.field875 += Statics.field2204 * (var109 - Statics.field875) / 1000 + Statics.field1168;
                                                            if (Statics.field875 > var109) {
                                                                Statics.field875 = var109;
                                                            }
                                                        }
                                                        if (Statics.field875 > var109) {
                                                            Statics.field875 -= Statics.field2204 * (Statics.field875 - var109) / 1000 + Statics.field1168;
                                                            if (Statics.field875 < var109) {
                                                                Statics.field875 = var109;
                                                            }
                                                        }
                                                        int var111 = var110 - Statics.field508;
                                                        if (var111 > 1024) {
                                                            var111 -= 2048;
                                                        }
                                                        if (var111 < -1024) {
                                                            var111 += 2048;
                                                        }
                                                        if (var111 > 0) {
                                                            Statics.field508 += Statics.field2204 * var111 / 1000 + Statics.field1168;
                                                            Statics.field508 &= 0x7FF;
                                                        }
                                                        if (var111 < 0) {
                                                            Statics.field508 -= Statics.field2204 * -var111 / 1000 + Statics.field1168;
                                                            Statics.field508 &= 0x7FF;
                                                        }
                                                        int var112 = var110 - Statics.field508;
                                                        if (var112 > 1024) {
                                                            var112 -= 2048;
                                                        }
                                                        if (var112 < -1024) {
                                                            var112 += 2048;
                                                        }
                                                        if (var112 < 0 && var111 > 0 || var112 > 0 && var111 < 0) {
                                                            Statics.field508 = var110;
                                                        }
                                                    }
                                                    for (int var113 = 0; var113 < 5; var113++) {
                                                        var10002 = field1017[var113]++;
                                                    }
                                                    Statics.field294.method1637();
                                                    int var114 = class60.method887();
                                                    int var115 = class51.method3090();
                                                    if (var114 > 15000 && var115 > 15000) {
                                                        field1090 = 250;
                                                        class60.method2457(14500);
                                                        field963.method3121(37);
                                                    }
                                                    field1146++;
                                                    if (field1146 > 500) {
                                                        field1146 = 0;
                                                        int var116 = (int) (Math.random() * 8.0D);
                                                        if ((var116 & 0x1) == 1) {
                                                            field985 += field986;
                                                        }
                                                        if ((var116 & 0x2) == 2) {
                                                            field987 += field1052;
                                                        }
                                                        if ((var116 & 0x4) == 4) {
                                                            field962 += field990;
                                                        }
                                                    }
                                                    if (field985 < -50) {
                                                        field986 = 2;
                                                    }
                                                    if (field985 > 50) {
                                                        field986 = -2;
                                                    }
                                                    if (field987 < -55) {
                                                        field1052 = 2;
                                                    }
                                                    if (field987 > 55) {
                                                        field1052 = -2;
                                                    }
                                                    if (field962 < -40) {
                                                        field990 = 1;
                                                    }
                                                    if (field962 > 40) {
                                                        field990 = -1;
                                                    }
                                                    field1179++;
                                                    if (field1179 > 500) {
                                                        field1179 = 0;
                                                        int var117 = (int) (Math.random() * 8.0D);
                                                        if ((var117 & 0x1) == 1) {
                                                            field992 += field993;
                                                        }
                                                        if ((var117 & 0x2) == 2) {
                                                            field994 += field995;
                                                        }
                                                    }
                                                    if (field992 < -60) {
                                                        field993 = 2;
                                                    }
                                                    if (field992 > 60) {
                                                        field993 = -2;
                                                    }
                                                    if (field994 < -20) {
                                                        field995 = 1;
                                                    }
                                                    if (field994 > 10) {
                                                        field995 = -1;
                                                    }
                                                    for (class68 var118 = (class68) field1190.method3354(); var118 != null; var118 = (class68) field1190.method3353()) {
                                                        if ((long) var118.field819 < class176.method218() / 1000L - 5L) {
                                                            if (var118.field820 > 0) {
                                                                class99.method3(5, "", var118.field821 + class226.field2836);
                                                            }
                                                            if (var118.field820 == 0) {
                                                                class99.method3(5, "", var118.field821 + class226.field2982);
                                                            }
                                                            var118.method3364();
                                                        }
                                                    }
                                                    field969++;
                                                    if (field969 > 50) {
                                                        field963.method3121(154);
                                                    }
                                                    try {
                                                        if (Statics.field1379 != null && field963.field2370 > 0) {
                                                            Statics.field1379.method2725(field963.field2373, 0, field963.field2370);
                                                            field963.field2370 = 0;
                                                            field969 = 0;
                                                        }
                                                    } catch (IOException var120) {
                                                        method37();
                                                    }
                                                    return;
                                                }
                                                var74 = var73.field832;
                                                if (var74.field2759 < 0) {
                                                    break;
                                                }
                                                var75 = class217.method577(var74.field2652);
                                            } while (var75 == null || var75.field2757 == null || var74.field2759 >= var75.field2757.length || var75.field2757[var74.field2759] != var74);
                                            class84.method2456(var73);
                                        }
                                    }
                                    var71 = var70.field832;
                                    if (var71.field2759 < 0) {
                                        break;
                                    }
                                    var72 = class217.method577(var71.field2652);
                                } while (var72 == null || var72.field2757 == null || var71.field2759 >= var72.field2757.length || var72.field2757[var71.field2759] != var71);
                                class84.method2456(var70);
                            }
                        }
                        var68 = var67.field832;
                        if (var68.field2759 < 0) {
                            break;
                        }
                        var69 = class217.method577(var68.field2652);
                    } while (var69 == null || var69.field2757 == null || var68.field2759 >= var69.field2757.length || var69.field2757[var68.field2759] != var68);
                    class84.method2456(var67);
                }
            }
            field963.method3121(2);
            field963.method2876(0);
            int var4 = field963.field2370;
            class281.method3971(field963);
            field963.method2888(field963.field2370 - var4);
        }
    }

    @ObfuscatedName("hk.fs(B)V")
    public static final void method3572() {
        if (Statics.field2394 != null) {
            Statics.field2394.method1877();
        }
        if (Statics.field340 != null) {
            Statics.field340.method1877();
        }
    }

    @ObfuscatedName("ei.fl(Lju;IIII)V")
    public static void method2700(class261 arg0, int arg1, int arg2, int arg3) {
        if (field1170 >= 50 || field1002 == 0 || arg0.field3590 == null || arg1 >= arg0.field3590.length) {
            return;
        }
        int var4 = arg0.field3590[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1162[field1170] = var5;
        field1163[field1170] = var6;
        field1164[field1170] = 0;
        field1166[field1170] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1165[field1170] = (var8 << 16) + (var9 << 8) + var7;
        field1170++;
    }

    @ObfuscatedName("hh.fw(IIIB)V")
    public static void method3593(int arg0, int arg1, int arg2) {
        if (field1149 == 0 || arg1 == 0 || field1170 >= 50) {
            return;
        }
        field1162[field1170] = arg0;
        field1163[field1170] = arg1;
        field1164[field1170] = arg2;
        field1166[field1170] = null;
        field1165[field1170] = 0;
        field1170++;
    }

    @ObfuscatedName("g.fh(III)V")
    public static void method6(int arg0, int arg1) {
        if (field1042 != 0 && arg0 != -1) {
            class204.method4508(Statics.field2283, arg0, 0, field1042, false);
            field1158 = true;
        }
    }

    @ObfuscatedName("cx.fo(Lhj;III)V")
    public static final void method1384(class217 arg0, int arg1, int arg2) {
        if (field1155 != 0 && field1155 != 3 || class60.field737 != 1 && Statics.field264 || class60.field737 != 4) {
            return;
        }
        class211 var3 = arg0.method3680(true);
        if (var3 == null) {
            return;
        }
        int var4 = class60.field736 - arg1;
        int var5 = class60.field735 - arg2;
        if (!var3.method3586(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2585 / 2;
        int var7 = var5 - var3.field2587 / 2;
        int var8 = field992 + field1005 & 0x7FF;
        int var9 = class137.field2034[var8];
        int var10 = class137.field2035[var8];
        int var11 = (field994 + 256) * var9 >> 8;
        int var12 = (field994 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field3209.field1243 + var13 >> 7;
        int var16 = Statics.field3209.field1229 - var14 >> 7;
        field963.method3121(231);
        field963.method2876(18);
        field963.method3052(class51.field641[82] ? (class51.field641[81] ? 2 : 1) : 0);
        field963.method2916(Statics.field414 + var15);
        field963.method2877(Statics.field2117 + var16);
        field963.method2876(var6);
        field963.method2876(var7);
        field963.method2877(field1005);
        field963.method2876(57);
        field963.method2876(field992);
        field963.method2876(field994);
        field963.method2876(89);
        field963.method2877(Statics.field3209.field1243);
        field963.method2877(Statics.field3209.field1229);
        field963.method2876(63);
        field1153 = var15;
        field1161 = var16;
    }

    @ObfuscatedName("q.ff(I)V")
    public static final void method30() {
        int var0 = class97.field1507;
        int[] var1 = class97.field1508;
        for (int var2 = 0; var2 < var0; var2++) {
            class75 var3 = field1041[var1[var2]];
            if (var3 != null) {
                method3858(var3, 1);
            }
        }
    }

    @ObfuscatedName("ik.fy(Lcx;II)V")
    public static final void method3858(class79 arg0, int arg1) {
        if (arg0.field1248 > field929) {
            method1446(arg0);
        } else if (arg0.field1281 >= field929) {
            method306(arg0);
        } else {
            arg0.field1237 = arg0.field1276;
            if (arg0.field1245 == 0) {
                arg0.field1286 = 0;
            } else {
                label322: {
                    if (arg0.field1260 != -1 && arg0.field1263 == 0) {
                        class261 var2 = class261.method2746(arg0.field1260);
                        if (arg0.field1287 > 0 && var2.field3584 == 0) {
                            arg0.field1286++;
                            break label322;
                        }
                        if (arg0.field1287 <= 0 && var2.field3599 == 0) {
                            arg0.field1286++;
                            break label322;
                        }
                    }
                    int var3 = arg0.field1243;
                    int var4 = arg0.field1229;
                    int var5 = arg0.field1283[arg0.field1245 - 1] * 128 + arg0.field1232 * 64;
                    int var6 = arg0.field1284[arg0.field1245 - 1] * 128 + arg0.field1232 * 64;
                    if (var3 < var5) {
                        if (var4 < var6) {
                            arg0.field1247 = 1280;
                        } else if (var4 > var6) {
                            arg0.field1247 = 1792;
                        } else {
                            arg0.field1247 = 1536;
                        }
                    } else if (var3 > var5) {
                        if (var4 < var6) {
                            arg0.field1247 = 768;
                        } else if (var4 > var6) {
                            arg0.field1247 = 256;
                        } else {
                            arg0.field1247 = 512;
                        }
                    } else if (var4 < var6) {
                        arg0.field1247 = 1024;
                    } else if (var4 > var6) {
                        arg0.field1247 = 0;
                    }
                    byte var7 = arg0.field1285[arg0.field1245 - 1];
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        int var8 = arg0.field1247 - arg0.field1230 & 0x7FF;
                        if (var8 > 1024) {
                            var8 -= 2048;
                        }
                        int var9 = arg0.field1274;
                        if (var8 >= -256 && var8 <= 256) {
                            var9 = arg0.field1236;
                        } else if (var8 >= 256 && var8 < 768) {
                            var9 = arg0.field1239;
                        } else if (var8 >= -768 && var8 <= -256) {
                            var9 = arg0.field1238;
                        }
                        if (var9 == -1) {
                            var9 = arg0.field1236;
                        }
                        arg0.field1237 = var9;
                        int var10 = 4;
                        boolean var11 = true;
                        if (arg0 instanceof class87) {
                            var11 = ((class87) arg0).field1380.field3563;
                        }
                        if (var11) {
                            if (arg0.field1247 != arg0.field1230 && arg0.field1254 == -1 && arg0.field1277 != 0) {
                                var10 = 2;
                            }
                            if (arg0.field1245 > 2) {
                                var10 = 6;
                            }
                            if (arg0.field1245 > 3) {
                                var10 = 8;
                            }
                            if (arg0.field1286 > 0 && arg0.field1245 > 1) {
                                var10 = 8;
                                arg0.field1286--;
                            }
                        } else {
                            if (arg0.field1245 > 1) {
                                var10 = 6;
                            }
                            if (arg0.field1245 > 2) {
                                var10 = 8;
                            }
                            if (arg0.field1286 > 0 && arg0.field1245 > 1) {
                                var10 = 8;
                                arg0.field1286--;
                            }
                        }
                        if (var7 == 2) {
                            var10 <<= 0x1;
                        }
                        if (var10 >= 8 && arg0.field1237 == arg0.field1236 && arg0.field1255 != -1) {
                            arg0.field1237 = arg0.field1255;
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
                                arg0.field1229 += var10;
                                if (arg0.field1229 > var6) {
                                    arg0.field1229 = var6;
                                }
                            } else if (var4 > var6) {
                                arg0.field1229 -= var10;
                                if (arg0.field1229 < var6) {
                                    arg0.field1229 = var6;
                                }
                            }
                        }
                        if (arg0.field1243 == var5 && arg0.field1229 == var6) {
                            arg0.field1245--;
                            if (arg0.field1287 > 0) {
                                arg0.field1287--;
                            }
                        }
                    } else {
                        arg0.field1243 = var5;
                        arg0.field1229 = var6;
                        arg0.field1245--;
                        if (arg0.field1287 > 0) {
                            arg0.field1287--;
                        }
                    }
                }
            }
        }
        if (arg0.field1243 < 128 || arg0.field1229 < 128 || arg0.field1243 >= 13184 || arg0.field1229 >= 13184) {
            arg0.field1260 = -1;
            arg0.field1265 = -1;
            arg0.field1248 = 0;
            arg0.field1281 = 0;
            arg0.field1243 = arg0.field1283[0] * 128 + arg0.field1232 * 64;
            arg0.field1229 = arg0.field1284[0] * 128 + arg0.field1232 * 64;
            arg0.method1380();
        }
        if (Statics.field3209 == arg0 && (arg0.field1243 < 1536 || arg0.field1229 < 1536 || arg0.field1243 >= 11776 || arg0.field1229 >= 11776)) {
            arg0.field1260 = -1;
            arg0.field1265 = -1;
            arg0.field1248 = 0;
            arg0.field1281 = 0;
            arg0.field1243 = arg0.field1283[0] * 128 + arg0.field1232 * 64;
            arg0.field1229 = arg0.field1284[0] * 128 + arg0.field1232 * 64;
            arg0.method1380();
        }
        method3155(arg0);
        arg0.field1228 = false;
        if (arg0.field1237 != -1) {
            class261 var12 = class261.method2746(arg0.field1237);
            if (var12 == null || var12.field3587 == null) {
                arg0.field1237 = -1;
            } else {
                arg0.field1259++;
                if (arg0.field1269 < var12.field3587.length && arg0.field1259 > var12.field3588[arg0.field1269]) {
                    arg0.field1259 = 1;
                    arg0.field1269++;
                    method2700(var12, arg0.field1269, arg0.field1243, arg0.field1229);
                }
                if (arg0.field1269 >= var12.field3587.length) {
                    arg0.field1259 = 0;
                    arg0.field1269 = 0;
                    method2700(var12, arg0.field1269, arg0.field1243, arg0.field1229);
                }
            }
        }
        if (arg0.field1265 != -1 && field929 >= arg0.field1268) {
            if (arg0.field1273 < 0) {
                arg0.field1273 = 0;
            }
            int var13 = class246.method707(arg0.field1265).field3304;
            if (var13 == -1) {
                arg0.field1265 = -1;
            } else {
                class261 var14 = class261.method2746(var13);
                if (var14 == null || var14.field3587 == null) {
                    arg0.field1265 = -1;
                } else {
                    arg0.field1267++;
                    if (arg0.field1273 < var14.field3587.length && arg0.field1267 > var14.field3588[arg0.field1273]) {
                        arg0.field1267 = 1;
                        arg0.field1273++;
                        method2700(var14, arg0.field1273, arg0.field1243, arg0.field1229);
                    }
                    if (arg0.field1273 >= var14.field3587.length && (arg0.field1273 < 0 || arg0.field1273 >= var14.field3587.length)) {
                        arg0.field1265 = -1;
                    }
                }
            }
        }
        if (arg0.field1260 != -1 && arg0.field1263 <= 1) {
            class261 var15 = class261.method2746(arg0.field1260);
            if (var15.field3584 == 1 && arg0.field1287 > 0 && arg0.field1248 <= field929 && arg0.field1281 < field929) {
                arg0.field1263 = 1;
                return;
            }
        }
        if (arg0.field1260 != -1 && arg0.field1263 == 0) {
            class261 var16 = class261.method2746(arg0.field1260);
            if (var16 == null || var16.field3587 == null) {
                arg0.field1260 = -1;
            } else {
                arg0.field1262++;
                if (arg0.field1261 < var16.field3587.length && arg0.field1262 > var16.field3588[arg0.field1261]) {
                    arg0.field1262 = 1;
                    arg0.field1261++;
                    method2700(var16, arg0.field1261, arg0.field1243, arg0.field1229);
                }
                if (arg0.field1261 >= var16.field3587.length) {
                    arg0.field1261 -= var16.field3591;
                    arg0.field1264++;
                    if (arg0.field1264 >= var16.field3597) {
                        arg0.field1260 = -1;
                    } else if (arg0.field1261 >= 0 && arg0.field1261 < var16.field3587.length) {
                        method2700(var16, arg0.field1261, arg0.field1243, arg0.field1229);
                    } else {
                        arg0.field1260 = -1;
                    }
                }
                arg0.field1228 = var16.field3586;
            }
        }
        if (arg0.field1263 > 0) {
            arg0.field1263--;
        }
    }

    @ObfuscatedName("cq.fk(Lcx;B)V")
    public static final void method1446(class79 arg0) {
        int var1 = arg0.field1248 - field929;
        int var2 = arg0.field1270 * 128 + arg0.field1232 * 64;
        int var3 = arg0.field1272 * 128 + arg0.field1232 * 64;
        arg0.field1243 += (var2 - arg0.field1243) / var1;
        arg0.field1229 += (var3 - arg0.field1229) / var1;
        arg0.field1286 = 0;
        arg0.field1247 = arg0.field1258;
    }

    @ObfuscatedName("ai.fc(Lcx;I)V")
    public static final void method306(class79 arg0) {
        if (field929 == arg0.field1281 || arg0.field1260 == -1 || arg0.field1263 != 0 || arg0.field1262 + 1 > class261.method2746(arg0.field1260).field3588[arg0.field1261]) {
            int var1 = arg0.field1281 - arg0.field1248;
            int var2 = field929 - arg0.field1248;
            int var3 = arg0.field1270 * 128 + arg0.field1232 * 64;
            int var4 = arg0.field1272 * 128 + arg0.field1232 * 64;
            int var5 = arg0.field1271 * 128 + arg0.field1232 * 64;
            int var6 = arg0.field1249 * 128 + arg0.field1232 * 64;
            arg0.field1243 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1229 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1286 = 0;
        arg0.field1247 = arg0.field1258;
        arg0.field1230 = arg0.field1247;
    }

    @ObfuscatedName("fc.fn(Lcx;I)V")
    public static final void method3155(class79 arg0) {
        if (arg0.field1277 == 0) {
            return;
        }
        if (arg0.field1254 != -1) {
            class79 var1 = null;
            if (arg0.field1254 < 32768) {
                var1 = field958[arg0.field1254];
            } else if (arg0.field1254 >= 32768) {
                var1 = field1041[arg0.field1254 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1243 - var1.field1243;
                int var3 = arg0.field1229 - var1.field1229;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1247 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1279) {
                arg0.field1254 = -1;
                arg0.field1279 = false;
            }
        }
        if (arg0.field1256 != -1 && (arg0.field1245 == 0 || arg0.field1286 > 0)) {
            arg0.field1247 = arg0.field1256;
            arg0.field1256 = -1;
        }
        int var4 = arg0.field1247 - arg0.field1230 & 0x7FF;
        if (var4 == 0 && arg0.field1279) {
            arg0.field1254 = -1;
            arg0.field1279 = false;
        }
        if (var4 == 0) {
            arg0.field1280 = 0;
            return;
        }
        arg0.field1280++;
        if (var4 > 1024) {
            arg0.field1230 -= arg0.field1277;
            boolean var5 = true;
            if (var4 < arg0.field1277 || var4 > 2048 - arg0.field1277) {
                arg0.field1230 = arg0.field1247;
                var5 = false;
            }
            if (arg0.field1276 == arg0.field1237 && (arg0.field1280 > 25 || var5)) {
                if (arg0.field1278 == -1) {
                    arg0.field1237 = arg0.field1236;
                } else {
                    arg0.field1237 = arg0.field1278;
                }
            }
        } else {
            arg0.field1230 += arg0.field1277;
            boolean var6 = true;
            if (var4 < arg0.field1277 || var4 > 2048 - arg0.field1277) {
                arg0.field1230 = arg0.field1247;
                var6 = false;
            }
            if (arg0.field1276 == arg0.field1237 && (arg0.field1280 > 25 || var6)) {
                if (arg0.field1235 == -1) {
                    arg0.field1237 = arg0.field1236;
                } else {
                    arg0.field1237 = arg0.field1235;
                }
            }
        }
        arg0.field1230 &= 0x7FF;
    }

    @ObfuscatedName("hn.gn(B)I")
    public static int method3650() {
        return field1135 ? 2 : 1;
    }

    @ObfuscatedName("client.v(B)V")
    public final void method746() {
        field1156 = class176.method218() + 500L;
        this.method1063();
        if (field1081 != -1) {
            this.method1067(true);
        }
    }

    @ObfuscatedName("client.gp(I)V")
    public void method1063() {
        int var1 = Statics.field413;
        int var2 = Statics.field1916;
        if (this.field700 < var1) {
            int var3 = this.field700;
        }
        if (this.field701 < var2) {
            int var4 = this.field701;
        }
        if (Statics.field527 != null) {
            try {
                class53.method672(Statics.field3334, "resize", new Object[] { method3650() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.gf(I)V")
    public final void method1064() {
        if (field1081 != -1) {
            int var1 = field1081;
            if (class217.method1895(var1)) {
                method712(Statics.field515[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field917; var2++) {
            if (field1096[var2]) {
                field944[var2] = true;
            }
            field1003[var2] = field1096[var2];
            field1096[var2] = false;
        }
        field1125 = field929;
        field1070 = -1;
        field1071 = -1;
        Statics.field3210 = null;
        if (field1081 != -1) {
            field917 = 0;
            method51(field1081, 0, 0, Statics.field413, Statics.field1916, 0, 0, -1);
        }
        class282.method4561();
        if (field1059) {
            method3099();
        } else if (field1070 != -1) {
            int var3 = field1070;
            int var4 = field1071;
            if (field1060 >= 2 || field1074 != 0 || field1076) {
                int var5 = method1534();
                String var6;
                if (field1074 == 1 && field1060 < 2) {
                    var6 = class226.field2984 + class226.field2994 + field1075 + " " + class89.field1394;
                } else if (field1076 && field1060 < 2) {
                    var6 = field1201 + class226.field2994 + field1021 + " " + class89.field1394;
                } else {
                    String var7;
                    if (var5 < 0) {
                        var7 = "";
                    } else if (field1134[var5].length() > 0) {
                        var7 = field1065[var5] + class226.field2994 + field1134[var5];
                    } else {
                        var7 = field1065[var5];
                    }
                    var6 = var7;
                }
                if (field1060 > 2) {
                    var6 = var6 + class89.method2665(16777215) + " " + '/' + " " + (field1060 - 2) + class226.field2988;
                }
                Statics.field245.method4415(var6, var3 + 4, var4 + 15, 16777215, 0, field929 / 1000);
            }
        }
        if (field1195 == 3) {
            for (int var8 = 0; var8 < field917; var8++) {
                if (field1003[var8]) {
                    class282.method4571(field923[var8], field1130[var8], field1126[var8], field1132[var8], 16711935, 128);
                } else if (field944[var8]) {
                    class282.method4571(field923[var8], field1130[var8], field1126[var8], field1132[var8], 16711680, 128);
                }
            }
        }
        int var9 = Statics.field267;
        int var10 = Statics.field3209.field1243;
        int var11 = Statics.field3209.field1229;
        int var12 = field997;
        for (class83 var13 = (class83) class83.field1333.method3336(); var13 != null; var13 = (class83) class83.field1333.method3324()) {
            if (var13.field1327 != -1 || var13.field1332 != null) {
                int var14 = 0;
                if (var10 > var13.field1331) {
                    var14 += var10 - var13.field1331;
                } else if (var10 < var13.field1322) {
                    var14 += var13.field1322 - var10;
                }
                if (var11 > var13.field1320) {
                    var14 += var11 - var13.field1320;
                } else if (var11 < var13.field1323) {
                    var14 += var13.field1323 - var11;
                }
                if (var14 - 64 > var13.field1337 || field1002 == 0 || var13.field1321 != var9) {
                    if (var13.field1328 != null) {
                        Statics.field2368.method1709(var13.field1328);
                        var13.field1328 = null;
                    }
                    if (var13.field1330 != null) {
                        Statics.field2368.method1709(var13.field1330);
                        var13.field1330 = null;
                    }
                } else {
                    var14 -= 64;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = field1002 * (var13.field1337 - var14) / var13.field1337;
                    class106 var10000;
                    if (var13.field1328 != null) {
                        var13.field1328.method1939(var15);
                    } else if (var13.field1327 >= 0) {
                        var10000 = (class106) null;
                        class106 var16 = class106.method1766(Statics.field674, var13.field1327, 0);
                        if (var16 != null) {
                            class108 var17 = var16.method1774().method1814(Statics.field740);
                            class118 var18 = class118.method1935(var17, 100, var15);
                            var18.method1938(-1);
                            Statics.field2368.method1728(var18);
                            var13.field1328 = var18;
                        }
                    }
                    if (var13.field1330 != null) {
                        var13.field1330.method1939(var15);
                        if (!var13.field1330.method3305()) {
                            var13.field1330 = null;
                        }
                    } else if (var13.field1332 != null && (var13.field1326 -= var12) <= 0) {
                        int var19 = (int) (Math.random() * (double) var13.field1332.length);
                        var10000 = (class106) null;
                        class106 var20 = class106.method1766(Statics.field674, var13.field1332[var19], 0);
                        if (var20 != null) {
                            class108 var21 = var20.method1774().method1814(Statics.field740);
                            class118 var22 = class118.method1935(var21, 100, var15);
                            var22.method1938(0);
                            Statics.field2368.method1728(var22);
                            var13.field1330 = var22;
                            var13.field1326 = var13.field1329 + (int) (Math.random() * (double) (var13.field1324 - var13.field1329));
                        }
                    }
                }
            }
        }
        field997 = 0;
    }

    @ObfuscatedName("ay.gh(Ljava/lang/String;ZI)V")
    public static final void method196(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field876.method4398(arg0, 250);
        int var6 = Statics.field876.method4399(arg0, 250) * 13;
        class282.method4607(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class282.method4589(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field876.method4435(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1039(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field844.method718(0, 0);
        } else {
            method1457(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("jm.go(IIIIZI)V")
    public static final void method4546(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1175 - field1057) * var5 / 100 + field1057;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1127) {
            short var8 = field1127;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1040) {
                var6 = field1040;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class282.method4561();
                    class282.method4607(arg0, arg1, var10, arg3, -16777216);
                    class282.method4607(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field949) {
            short var11 = field949;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field1020) {
                var6 = field1020;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class282.method4561();
                    class282.method4607(arg0, arg1, arg2, var13, -16777216);
                    class282.method4607(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1080 - field943) * var5 / 100 + field943;
        field1121 = arg3 * var6 * var14 / 85504 << 1;
        if (field1113 != arg2 || field1108 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class137.field2034[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class140.method2494(var15, 500, 800, arg2, arg3);
        }
        field1092 = arg0;
        field1183 = arg1;
        field1113 = arg2;
        field1108 = arg3;
    }

    @ObfuscatedName("hr.gq(Lbc;B)V")
    public static final void method3624(class67 arg0) {
        if (Statics.field3209.field1243 >> 7 == field1153 && Statics.field3209.field1229 >> 7 == field1161) {
            field1153 = 0;
        }
        int var1 = class97.field1507;
        int[] var2 = class97.field1508;
        int var3 = var1;
        if (class67.field811 == arg0 || class67.field807 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class75 var5;
            int var6;
            if (class67.field811 == arg0) {
                var5 = Statics.field3209;
                var6 = Statics.field3209.field883 << 14;
            } else if (class67.field807 == arg0) {
                var5 = field1041[field1050];
                var6 = field1050 << 14;
            } else {
                var5 = field1041[var2[var4]];
                var6 = var2[var4] << 14;
                if (class67.field809 == arg0 && field1050 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method1031() && !var5.field901) {
                var5.field890 = false;
                if ((field1066 && var1 > 50 || var1 > 200) && class67.field811 != arg0 && var5.field1276 == var5.field1237) {
                    var5.field890 = true;
                }
                int var7 = var5.field1243 >> 7;
                int var8 = var5.field1229 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field894 == null || field929 < var5.field900 || field929 >= var5.field903) {
                        if ((var5.field1243 & 0x7F) == 64 && (var5.field1229 & 0x7F) == 64) {
                            if (field1025 == field1178[var7][var8]) {
                                continue;
                            }
                            field1178[var7][var8] = field1025;
                        }
                        var5.field888 = method1372(var5.field1243, var5.field1229, Statics.field267);
                        Statics.field621.method2471(Statics.field267, var5.field1243, var5.field1229, var5.field888, 60, var5, var5.field1230, var6, var5.field1228);
                    } else {
                        var5.field890 = false;
                        var5.field888 = method1372(var5.field1243, var5.field1229, Statics.field267);
                        Statics.field621.method2510(Statics.field267, var5.field1243, var5.field1229, var5.field888, 60, var5, var5.field1230, var6, var5.field899, var5.field880, var5.field897, var5.field898);
                    }
                }
            }
        }
    }

    @ObfuscatedName("by.gw(ZI)V")
    public static final void method987(boolean arg0) {
        for (int var1 = 0; var1 < field1138; var1++) {
            class87 var2 = field958[field960[var1]];
            int var3 = (field960[var1] << 14) + 536870912;
            if (var2 != null && var2.method1031() && var2.field1380.field3558 == arg0 && var2.field1380.method4271()) {
                int var4 = var2.field1243 >> 7;
                int var5 = var2.field1229 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1232 == 1 && (var2.field1243 & 0x7F) == 64 && (var2.field1229 & 0x7F) == 64) {
                        if (field1025 == field1178[var4][var5]) {
                            continue;
                        }
                        field1178[var4][var5] = field1025;
                    }
                    if (!var2.field1380.field3560) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field621.method2471(Statics.field267, var2.field1243, var2.field1229, method1372(var2.field1243 + (var2.field1232 * 64 - 64), var2.field1229 + (var2.field1232 * 64 - 64), Statics.field267), var2.field1232 * 64 - 64 + 60, var2, var2.field1230, var3, var2.field1228);
                }
            }
        }
    }

    @ObfuscatedName("iy.gc(Lcx;IIIIIB)V")
    public static final void method4263(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1031()) {
            return;
        }
        if (arg0 instanceof class87) {
            class259 var6 = ((class87) arg0).field1380;
            if (var6.field3557 != null) {
                var6 = var6.method4270();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class97.field1507;
        int[] var8 = class97.field1508;
        int var9 = 3;
        if (!arg0.field1253.method3282()) {
            Statics.method558(arg0, arg0.field1282 + 15);
            for (class86 var10 = (class86) arg0.field1253.method3280(); var10 != null; var10 = (class86) arg0.field1253.method3278()) {
                class80 var11 = var10.method1524(field929);
                if (var11 != null) {
                    class249 var12 = var10.field1370;
                    class286 var13 = var12.method4028();
                    class286 var14 = var12.method4026();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3341;
                    } else {
                        if (var12.field3350 * 2 < var14.field3774) {
                            var15 = var12.field3350;
                        }
                        var16 = var14.field3774 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field929 - var11.field1290;
                    int var20 = var11.field1289 * var16 / var12.field3341;
                    int var23;
                    if (var11.field1288 > var19) {
                        int var21 = var12.field3345 == 0 ? 0 : var19 / var12.field3345 * var12.field3345;
                        int var22 = var11.field1291 * var16 / var12.field3341;
                        var23 = (var20 - var22) * var21 / var11.field1288 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1288 + var12.field3346 - var19;
                        if (var12.field3342 >= 0) {
                            var17 = (var24 << 8) / (var12.field3346 - var12.field3342);
                        }
                    }
                    if (var11.field1289 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field1174 + arg2 - (var16 >> 1);
                    int var26 = field1184 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field1174 > -1) {
                            class282.method4607(var25, var26, var23, 5, 65280);
                            class282.method4607(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3775;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method4772(var27, var26, var17);
                            class282.method4565(var27, var26, var27 + var28, var26 + var29);
                            var14.method4772(var27, var26, var17);
                        } else {
                            var13.method4698(var27, var26);
                            class282.method4565(var27, var26, var27 + var28, var26 + var29);
                            var14.method4698(var27, var26);
                        }
                        class282.method4602(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1525()) {
                    var10.method3304();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class75 var30 = (class75) arg0;
            if (var30.field901) {
                return;
            }
            if (var30.field884 != -1 || var30.field896 != -1) {
                Statics.method558(arg0, arg0.field1282 + 15);
                if (field1174 > -1) {
                    if (var30.field884 != -1) {
                        Statics.field18[var30.field884].method4698(field1174 + arg2 - 12, field1184 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field896 != -1) {
                        Statics.field3251[var30.field896].method4698(field1174 + arg2 - 12, field1184 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field996 == 10 && field939 == var8[arg1]) {
                Statics.method558(arg0, arg0.field1282 + 15);
                if (field1174 > -1) {
                    Statics.field1464[1].method4698(field1174 + arg2 - 12, field1184 + arg3 - var9);
                }
            }
        } else {
            class259 var31 = ((class87) arg0).field1380;
            if (var31.field3557 != null) {
                var31 = var31.method4270();
            }
            if (var31.field3555 >= 0 && var31.field3555 < Statics.field3251.length) {
                Statics.method558(arg0, arg0.field1282 + 15);
                if (field1174 > -1) {
                    Statics.field3251[var31.field3555].method4698(field1174 + arg2 - 12, field1184 + arg3 - 30);
                }
            }
            if (field996 == 1 && field938 == field960[arg1 - var7] && field929 % 20 < 10) {
                Statics.method558(arg0, arg0.field1282 + 15);
                if (field1174 > -1) {
                    Statics.field1464[0].method4698(field1174 + arg2 - 12, field1184 + arg3 - 28);
                }
            }
        }
        if (arg0.field1241 != null && (arg1 >= var7 || !arg0.field1234 && (field1137 == 4 || !arg0.field1257 && (field1137 == 0 || field1137 == 3 || field1137 == 1 && method3649(((class75) arg0).field895, false))))) {
            Statics.method558(arg0, arg0.field1282);
            if (field1174 > -1 && field1014 < field1015) {
                field1019[field1014] = Statics.field245.method4446(arg0.field1241) / 2;
                field1018[field1014] = Statics.field245.field3627;
                field1016[field1014] = field1174;
                field989[field1014] = field1184;
                field1035[field1014] = arg0.field1266;
                field924[field1014] = arg0.field1246;
                field941[field1014] = arg0.field1240;
                field1068[field1014] = arg0.field1241;
                field1014++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1250[var32];
            int var34 = arg0.field1231[var32];
            class255 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field929) {
                    continue;
                }
                var35 = class255.method224(arg0.field1231[var32]);
                var36 = var35.field3391;
                if (var35 != null && var35.field3389 != null) {
                    var35 = var35.method4108();
                    if (var35 == null) {
                        arg0.field1250[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1251[var32];
            class255 var38 = null;
            if (var37 >= 0) {
                var38 = class255.method224(var37);
                if (var38 != null && var38.field3389 != null) {
                    var38 = var38.method4108();
                }
            }
            if (var33 - var36 <= field929) {
                if (var35 == null) {
                    arg0.field1250[var32] = -1;
                } else {
                    Statics.method558(arg0, arg0.field1282 / 2);
                    if (field1174 > -1) {
                        if (var32 == 1) {
                            field1184 -= 20;
                        }
                        if (var32 == 2) {
                            field1174 -= 15;
                            field1184 -= 10;
                        }
                        if (var32 == 3) {
                            field1174 += 15;
                            field1184 -= 10;
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
                        class286 var64 = var35.method4110();
                        if (var64 != null) {
                            var43 = var64.field3774;
                            int var65 = var64.field3775;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3777;
                        }
                        class286 var66 = var35.method4113();
                        if (var66 != null) {
                            var44 = var66.field3774;
                            int var67 = var66.field3775;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3777;
                        }
                        class286 var68 = var35.method4112();
                        if (var68 != null) {
                            var45 = var68.field3774;
                            int var69 = var68.field3775;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3777;
                        }
                        class286 var70 = var35.method4134();
                        if (var70 != null) {
                            var46 = var70.field3774;
                            int var71 = var70.field3775;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3777;
                        }
                        if (var38 != null) {
                            var51 = var38.method4110();
                            if (var51 != null) {
                                var55 = var51.field3774;
                                int var72 = var51.field3775;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3777;
                            }
                            var52 = var38.method4113();
                            if (var52 != null) {
                                var56 = var52.field3774;
                                int var73 = var52.field3775;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3777;
                            }
                            var53 = var38.method4112();
                            if (var53 != null) {
                                var57 = var53.field3774;
                                int var74 = var53.field3775;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3777;
                            }
                            var54 = var38.method4134();
                            if (var54 != null) {
                                var58 = var54.field3774;
                                int var75 = var54.field3775;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3777;
                            }
                        }
                        class264 var76 = var35.method4143();
                        if (var76 == null) {
                            var76 = Statics.field599;
                        }
                        class264 var77;
                        if (var38 == null) {
                            var77 = Statics.field599;
                        } else {
                            var77 = var38.method4143();
                            if (var77 == null) {
                                var77 = Statics.field599;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4109(arg0.field1242[var32]);
                        int var83 = var76.method4446(var82);
                        if (var38 != null) {
                            var79 = var38.method4109(arg0.field1252[var32]);
                            var81 = var77.method4446(var79);
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
                        int var100 = arg0.field1250[var32] - field929;
                        int var101 = var35.field3403 - var35.field3403 * var100 / var35.field3391;
                        int var102 = var35.field3404 * var100 / var35.field3391 + -var35.field3404;
                        int var103 = field1174 + arg2 - (var92 >> 1) + var101;
                        int var104 = field1184 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3408 + var104 + 15;
                        int var108 = var107 - var76.field3625;
                        int var109 = var76.field3632 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3408 + var104 + 15;
                            int var111 = var110 - var77.field3625;
                            int var112 = var77.field3632 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3405 >= 0) {
                            var115 = (var100 << 8) / (var35.field3391 - var35.field3405);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4772(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4772(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4772(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4772(var93 + var103 - var50, var104, var115);
                            }
                            var76.method4402(var82, var90 + var103, var107, var35.field3396, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4772(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4772(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4772(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4772(var97 + var103 - var62, var104, var115);
                                }
                                var77.method4402(var79, var98 + var103, var110, var38.field3396, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method4698(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method4698(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method4698(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method4698(var93 + var103 - var50, var104);
                            }
                            var76.method4401(var82, var90 + var103, var107, var35.field3396 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4698(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method4698(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method4698(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4698(var97 + var103 - var62, var104);
                                }
                                var77.method4401(var79, var98 + var103, var110, var38.field3396 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("by.gs(IIII)V")
    public static final void method988(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field1174 = -1;
            field1184 = -1;
            return;
        }
        int var3 = method1372(arg0, arg1, Statics.field267) - arg2;
        int var4 = arg0 - Statics.field1918;
        int var5 = var3 - Statics.field1758;
        int var6 = arg1 - Statics.field525;
        int var7 = class137.field2034[Statics.field875];
        int var8 = class137.field2035[Statics.field875];
        int var9 = class137.field2034[Statics.field508];
        int var10 = class137.field2035[Statics.field508];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field1174 = field1121 * var11 / var15 + field1113 / 2;
            field1184 = field1121 * var14 / var15 + field1108 / 2;
        } else {
            field1174 = -1;
            field1184 = -1;
        }
    }

    @ObfuscatedName("client.gi(IIII)I")
    public static final int method1372(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field759[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field749[var5][var3][var4] + class62.field749[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field749[var5][var3][var4 + 1] + class62.field749[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("t.gv(ZI)V")
    public static final void method146(boolean arg0) {
        field978 = arg0;
        if (!field978) {
            int var1 = field965.method2930();
            int var2 = field965.method2914();
            int var3 = field965.method2930();
            Statics.field370 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field370[var4][var5] = field965.method2896();
                }
            }
            Statics.field244 = new int[var3];
            Statics.field531 = new int[var3];
            Statics.field849 = new int[var3];
            Statics.field815 = new byte[var3][];
            Statics.field1670 = new byte[var3][];
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
                        Statics.field244[var7] = var10;
                        Statics.field531[var7] = Statics.field822.method3776("m" + var8 + "_" + var9);
                        Statics.field849[var7] = Statics.field822.method3776("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method993(var2, var1, true);
            return;
        }
        boolean var11 = field965.method2918() == 1;
        int var12 = field965.method2927();
        int var13 = field965.method2930();
        int var14 = field965.method2930();
        field965.method3123();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field965.method3141(1);
                    if (var18 == 1) {
                        field983[var15][var16][var17] = field965.method3141(26);
                    } else {
                        field983[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field965.method3124();
        Statics.field370 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field370[var19][var20] = field965.method2896();
            }
        }
        Statics.field244 = new int[var14];
        Statics.field531 = new int[var14];
        Statics.field849 = new int[var14];
        Statics.field815 = new byte[var14][];
        Statics.field1670 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field983[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field244[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field244[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field531[var21] = Statics.field822.method3776("m" + var30 + "_" + var31);
                            Statics.field849[var21] = Statics.field822.method3776("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method993(var12, var13, !var11);
    }

    @ObfuscatedName("bg.gu(IIZI)V")
    public static final void method993(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field1336 == arg0 && Statics.field256 == arg1) {
            return;
        }
        Statics.field1336 = arg0;
        Statics.field256 = arg1;
        method116(25);
        method196(class226.field2838, true);
        int var3 = Statics.field414;
        int var4 = Statics.field2117;
        Statics.field414 = (arg0 - 6) * 8;
        Statics.field2117 = (arg1 - 6) * 8;
        int var5 = Statics.field414 - var3;
        int var6 = Statics.field2117 - var4;
        int var7 = Statics.field414;
        int var8 = Statics.field2117;
        for (int var9 = 0; var9 < 32768; var9++) {
            class87 var10 = field958[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1283[var11] -= var5;
                    var10.field1284[var11] -= var6;
                }
                var10.field1243 -= var5 * 128;
                var10.field1229 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class75 var13 = field1041[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1283[var14] -= var5;
                    var13.field1284[var14] -= var6;
                }
                var13.field1243 -= var5 * 128;
                var13.field1229 -= var6 * 128;
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
                        field1160[var25][var21][var22] = field1160[var25][var23][var24];
                    } else {
                        field1160[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class77 var26 = (class77) field1094.method3336(); var26 != null; var26 = (class77) field1094.method3324()) {
            var26.field1206 -= var5;
            var26.field1207 -= var6;
            if (var26.field1206 < 0 || var26.field1207 < 0 || var26.field1206 >= 104 || var26.field1207 >= 104) {
                var26.method3304();
            }
        }
        if (field1153 != 0) {
            field1153 -= var5;
            field1161 -= var6;
        }
        field1170 = 0;
        field1167 = false;
        field1148 = -1;
        field1024.method3312();
        field1053.method3312();
        for (int var27 = 0; var27 < 4; var27++) {
            field981[var27].method2762();
        }
    }

    @ObfuscatedName("cg.gg(ZI)V")
    public static final void method1557(boolean arg0) {
        method3572();
        field969++;
        if (field969 < 50 && !arg0) {
            return;
        }
        field969 = 0;
        if (field974 || Statics.field1379 == null) {
            return;
        }
        field963.method3121(154);
        try {
            Statics.field1379.method2725(field963.field2373, 0, field963.field2370);
            field963.field2370 = 0;
        } catch (IOException var2) {
            field974 = true;
        }
    }

    @ObfuscatedName("a.gm(IB)V")
    public static final void method155(int arg0) {
        int[] var1 = Statics.field3215.field3779;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class62.field759[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field621.method2493(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class62.field759[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field621.method2493(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field3215.method4769();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class62.field759[arg0][var10][var9] & 0x18) == 0) {
                    method626(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class62.field759[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method626(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1181 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field621.method2566(Statics.field267, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class256.method4379(var14).field3458;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field981[Statics.field267].field2275;
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
                        field1152[field1181] = Statics.field477[var15].method3920(false);
                        field1150[field1181] = var16;
                        field1151[field1181] = var17;
                        field1181++;
                    }
                }
            }
        }
        Statics.field844.method4656();
    }

    @ObfuscatedName("au.gz(IIIIIB)V")
    public static final void method626(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field621.method2606(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field621.method2489(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field3215.field3779;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class256 var13 = class256.method4379(var12);
            if (var13.field3444 == -1) {
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
                class285 var14 = Statics.field3165[var13.field3444];
                if (var14 != null) {
                    int var15 = (var13.field3436 * 4 - var14.field3768) / 2;
                    int var16 = (var13.field3431 * 4 - var14.field3769) / 2;
                    var14.method4666(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3431) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field621.method2487(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field621.method2489(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class256 var22 = class256.method4379(var21);
            if (var22.field3444 != -1) {
                class285 var23 = Statics.field3165[var22.field3444];
                if (var23 != null) {
                    int var24 = (var22.field3436 * 4 - var23.field3768) / 2;
                    int var25 = (var22.field3431 * 4 - var23.field3769) / 2;
                    var23.method4666(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3431) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field3215.field3779;
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
        int var29 = Statics.field621.method2566(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class256 var31 = class256.method4379(var30);
        if (var31.field3444 == -1) {
            return;
        }
        class285 var32 = Statics.field3165[var31.field3444];
        if (var32 != null) {
            int var33 = (var31.field3436 * 4 - var32.field3768) / 2;
            int var34 = (var31.field3431 * 4 - var32.field3769) / 2;
            var32.method4666(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3431) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.gd(B)Z")
    public final boolean method1065() {
        if (Statics.field1379 == null) {
            return false;
        }
        try {
            int var1 = Statics.field1379.method2723();
            if (var1 == 0) {
                return false;
            }
            if (field967 == -1) {
                Statics.field1379.method2724(field965.field2373, 0, 1);
                field965.field2370 = 0;
                field967 = field965.method3126();
                field975 = class273.field3685[field967];
                var1--;
            }
            if (field975 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                Statics.field1379.method2724(field965.field2373, 0, 1);
                field975 = field965.field2373[0] & 0xFF;
                var1--;
            }
            if (field975 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                Statics.field1379.method2724(field965.field2373, 0, 2);
                field965.field2370 = 0;
                field975 = field965.method2930();
                var1 -= 2;
            }
            if (var1 < field975) {
                return false;
            }
            field965.field2370 = 0;
            Statics.field1379.method2724(field965.field2373, 0, field975);
            field968 = 0;
            field1056 = field971;
            field971 = field970;
            field970 = field967;
            if (field967 == 8) {
                int var2 = field965.method2930();
                int var3 = field965.method2937();
                class217 var4 = class217.method577(var3);
                if (var4.field2693 != 1 || var4.field2702 != var2) {
                    var4.field2693 = 1;
                    var4.field2702 = var2;
                    method1(var4);
                }
                field967 = -1;
                return true;
            }
            if (field967 == 50) {
                int var5 = field965.method2938();
                int var6 = field965.method2914();
                class212.field2590[var6] = var5;
                if (class212.field2589[var6] != var5) {
                    class212.field2589[var6] = var5;
                }
                method2647(var6);
                field1107[++field1023 - 1 & 0x1F] = var6;
                field967 = -1;
                return true;
            }
            if (field967 == 54) {
                int var7 = field965.method2938();
                int var8 = field965.method2938();
                int var9 = field965.method3089();
                if (var9 == 65535) {
                    var9 = -1;
                }
                class217 var10 = class217.method577(var8);
                if (var10.field2632) {
                    var10.field2753 = var9;
                    var10.field2754 = var7;
                    class257 var12 = Statics.method461(var9);
                    var10.field2684 = var12.field3482;
                    var10.field2685 = var12.field3483;
                    var10.field2686 = var12.field3484;
                    var10.field2676 = var12.field3485;
                    var10.field2683 = var12.field3508;
                    var10.field2687 = var12.field3496;
                    if (var12.field3501 == 1) {
                        var10.field2691 = 1;
                    } else {
                        var10.field2691 = 2;
                    }
                    if (var10.field2725 > 0) {
                        var10.field2687 = var10.field2687 * 32 / var10.field2725;
                    } else if (var10.field2644 > 0) {
                        var10.field2687 = var10.field2687 * 32 / var10.field2644;
                    }
                    method1(var10);
                } else if (var9 == -1) {
                    var10.field2693 = 0;
                    field967 = -1;
                    return true;
                } else {
                    class257 var11 = Statics.method461(var9);
                    var10.field2693 = 4;
                    var10.field2702 = var9;
                    var10.field2684 = var11.field3482;
                    var10.field2685 = var11.field3483;
                    var10.field2687 = var11.field3496 * 100 / var7;
                    method1(var10);
                }
                field967 = -1;
                return true;
            }
            if (field967 == 21) {
                int var13 = field965.method2914();
                int var14 = field965.method2938();
                int var15 = var13 >> 10 & 0x1F;
                int var16 = var13 >> 5 & 0x1F;
                int var17 = var13 & 0x1F;
                int var18 = (var17 << 3) + (var15 << 19) + (var16 << 11);
                class217 var19 = class217.method577(var14);
                if (var19.field2658 != var18) {
                    var19.field2658 = var18;
                    method1(var19);
                }
                field967 = -1;
                return true;
            }
            if (field967 == 66) {
                method472(false);
                field967 = -1;
                return true;
            }
            if (field967 == 230) {
                for (int var20 = 0; var20 < class212.field2589.length; var20++) {
                    if (class212.field2590[var20] != class212.field2589[var20]) {
                        class212.field2589[var20] = class212.field2590[var20];
                        method2647(var20);
                        field1107[++field1023 - 1 & 0x1F] = var20;
                    }
                }
                field967 = -1;
                return true;
            }
            if (field967 == 13) {
                for (int var21 = 0; var21 < Statics.field3260; var21++) {
                    class242 var22 = class242.method2262(var21);
                    if (var22 != null) {
                        class212.field2590[var21] = 0;
                        class212.field2589[var21] = 0;
                    }
                }
                method1908();
                field1023 += 32;
                field967 = -1;
                return true;
            }
            if (field967 == 87) {
                while (field965.field2370 < field975) {
                    int var23 = field965.method2891();
                    boolean var24 = (var23 & 0x1) == 1;
                    String var25 = field965.method2899();
                    String var26 = field965.method2899();
                    field965.method2899();
                    for (int var27 = 0; var27 < field1191; var27++) {
                        class71 var28 = field1192[var27];
                        if (var24) {
                            if (var26.equals(var28.field843)) {
                                var28.field843 = var25;
                                var28.field842 = var26;
                                var25 = null;
                                break;
                            }
                        } else if (var25.equals(var28.field843)) {
                            var28.field843 = var25;
                            var28.field842 = var26;
                            var25 = null;
                            break;
                        }
                    }
                    if (var25 != null && field1191 < 400) {
                        class71 var29 = new class71();
                        field1192[field1191] = var29;
                        var29.field843 = var25;
                        var29.field842 = var26;
                        field1191++;
                    }
                }
                field1114 = field1106;
                field967 = -1;
                return true;
            }
            if (field967 == 191) {
                int var30 = field965.method2947();
                int var31 = field965.method2894();
                int var32 = field965.method2896();
                class217 var33 = class217.method577(var32);
                if (var33.field2642 != var31 || var33.field2643 != var30 || var33.field2714 != 0 || var33.field2639 != 0) {
                    var33.field2642 = var31;
                    var33.field2643 = var30;
                    var33.field2714 = 0;
                    var33.field2639 = 0;
                    method1(var33);
                    this.method1172(var33);
                    if (var33.field2673 == 0) {
                        method108(Statics.field515[var32 >> 16], var33, false);
                    }
                }
                field967 = -1;
                return true;
            }
            if (field967 == 225) {
                Statics.field465 = field965.method2918();
                Statics.field3297 = field965.method2918();
                field967 = -1;
                return true;
            }
            if (field967 == 220) {
                method1908();
                int var34 = field965.method2918();
                int var35 = field965.method2918();
                int var36 = field965.method2896();
                field932[var35] = var36;
                field1055[var35] = var34;
                field946[var35] = 1;
                for (int var37 = 0; var37 < 98; var37++) {
                    if (var36 >= class223.field2822[var37]) {
                        field946[var35] = var37 + 2;
                    }
                }
                field1111[++field1112 - 1 & 0x1F] = var35;
                field967 = -1;
                return true;
            }
            if (field967 == 223) {
                int var38 = field965.method2891();
                class277[] var39 = class277.method2379();
                int var40 = 0;
                class277 var42;
                while (true) {
                    if (var40 >= var39.length) {
                        var42 = null;
                        break;
                    }
                    class277 var41 = var39[var40];
                    if (var41.field3723 == var38) {
                        var42 = var41;
                        break;
                    }
                    var40++;
                }
                Statics.field3413 = var42;
                field967 = -1;
                return true;
            }
            if (field967 == 146) {
                int var43 = field965.method2891();
                int var44 = field965.method2891();
                int var45 = field965.method2891();
                int var46 = field965.method2891();
                field1085[var43] = true;
                field1037[var43] = var44;
                field1171[var43] = var45;
                field1172[var43] = var46;
                field1017[var43] = 0;
                field967 = -1;
                return true;
            }
            if (field967 == 140 || field967 == 44 || field967 == 193 || field967 == 154 || field967 == 221 || field967 == 19 || field967 == 126 || field967 == 247 || field967 == 24 || field967 == 241) {
                method1549();
                field967 = -1;
                return true;
            }
            if (field967 == 136) {
                class81 var47 = new class81();
                var47.field1302 = field965.method2899();
                var47.field1301 = field965.method2930();
                int var48 = field965.method2896();
                var47.field1299 = var48;
                method116(45);
                Statics.field1379.method2721();
                Statics.field1379 = null;
                class93.method4378(var47);
                field967 = -1;
                return false;
            }
            if (field967 == 195) {
                method146(false);
                field965.method3126();
                int var49 = field965.method2930();
                class97.method546(field965, var49);
                field967 = -1;
                return true;
            }
            if (field967 == 91) {
                String var50 = field965.method2899();
                Object[] var51 = new Object[var50.length() + 1];
                for (int var52 = var50.length() - 1; var52 >= 0; var52--) {
                    if (var50.charAt(var52) == 's') {
                        var51[var52 + 1] = field965.method2899();
                    } else {
                        var51[var52 + 1] = Integer.valueOf(field965.method2896());
                    }
                }
                var51[0] = Integer.valueOf(field965.method2896());
                class70 var53 = new class70();
                var53.field836 = var51;
                class84.method2456(var53);
                field967 = -1;
                return true;
            }
            if (field967 == 200) {
                int var54 = field965.method2896();
                int var55 = field965.method2930();
                if (var54 < -70000) {
                    var55 += 32768;
                }
                class217 var56;
                if (var54 >= 0) {
                    var56 = class217.method577(var54);
                } else {
                    var56 = null;
                }
                if (var56 != null) {
                    for (int var57 = 0; var57 < var56.field2751.length; var57++) {
                        var56.field2751[var57] = 0;
                        var56.field2741[var57] = 0;
                    }
                }
                class64.method686(var55);
                int var58 = field965.method2930();
                for (int var59 = 0; var59 < var58; var59++) {
                    int var60 = field965.method2891();
                    if (var60 == 255) {
                        var60 = field965.method2937();
                    }
                    int var61 = field965.method3089();
                    if (var56 != null && var59 < var56.field2751.length) {
                        var56.field2751[var59] = var61;
                        var56.field2741[var59] = var60;
                    }
                    Statics.method41(var55, var59, var61 - 1, var60);
                }
                if (var56 != null) {
                    method1(var56);
                }
                method1908();
                field1109[++field972 - 1 & 0x1F] = var55 & 0x7FFF;
                field967 = -1;
                return true;
            }
            if (field967 == 162) {
                field1167 = true;
                Statics.field450 = field965.method2891();
                Statics.field2390 = field965.method2891();
                Statics.field3700 = field965.method2930();
                Statics.field3158 = field965.method2891();
                Statics.field1381 = field965.method2891();
                if (Statics.field1381 >= 100) {
                    Statics.field1918 = Statics.field450 * 128 + 64;
                    Statics.field525 = Statics.field2390 * 128 + 64;
                    Statics.field1758 = method1372(Statics.field1918, Statics.field525, Statics.field267) - Statics.field3700;
                }
                field967 = -1;
                return true;
            }
            if (field967 == 109) {
                Statics.field3297 = field965.method2917();
                Statics.field465 = field965.method2919();
                while (field965.field2370 < field975) {
                    field967 = field965.method2891();
                    method1549();
                }
                field967 = -1;
                return true;
            }
            if (field967 == 115) {
                int var62 = field965.method2900();
                int var63 = field965.method3089();
                class217 var64 = class217.method577(var62);
                if (var64 != null && var64.field2673 == 0) {
                    if (var63 > var64.field2657 - var64.field2649) {
                        var63 = var64.field2657 - var64.field2649;
                    }
                    if (var63 < 0) {
                        var63 = 0;
                    }
                    if (var64.field2655 != var63) {
                        var64.field2655 = var63;
                        method1(var64);
                    }
                }
                field967 = -1;
                return true;
            }
            if (field967 == 52) {
                field1167 = true;
                Statics.field603 = field965.method2891();
                Statics.field1335 = field965.method2891();
                Statics.field1631 = field965.method2930();
                Statics.field1168 = field965.method2891();
                Statics.field2204 = field965.method2891();
                if (Statics.field2204 >= 100) {
                    int var65 = Statics.field603 * 128 + 64;
                    int var66 = Statics.field1335 * 128 + 64;
                    int var67 = method1372(var65, var66, Statics.field267) - Statics.field1631;
                    int var68 = var65 - Statics.field1918;
                    int var69 = var67 - Statics.field1758;
                    int var70 = var66 - Statics.field525;
                    int var71 = (int) Math.sqrt((double) (var68 * var68 + var70 * var70));
                    Statics.field875 = (int) (Math.atan2((double) var69, (double) var71) * 325.949D) & 0x7FF;
                    Statics.field508 = (int) (Math.atan2((double) var68, (double) var70) * -325.949D) & 0x7FF;
                    if (Statics.field875 < 128) {
                        Statics.field875 = 128;
                    }
                    if (Statics.field875 > 383) {
                        Statics.field875 = 383;
                    }
                }
                field967 = -1;
                return true;
            }
            if (field967 == 27) {
                for (int var72 = 0; var72 < field1041.length; var72++) {
                    if (field1041[var72] != null) {
                        field1041[var72].field1260 = -1;
                    }
                }
                for (int var73 = 0; var73 < field958.length; var73++) {
                    if (field958[var73] != null) {
                        field958[var73].field1260 = -1;
                    }
                }
                field967 = -1;
                return true;
            }
            if (field967 == 88) {
                field1097 = field1106;
                if (field975 == 0) {
                    field959 = null;
                    field1147 = null;
                    Statics.field315 = 0;
                    Statics.field1316 = null;
                    field967 = -1;
                    return true;
                }
                field1147 = field965.method2899();
                long var74 = field965.method2897();
                long var76 = var74;
                String var78;
                if (var74 <= 0L || var74 >= 6582952005840035281L) {
                    var78 = null;
                } else if (var74 % 37L == 0L) {
                    var78 = null;
                } else {
                    int var79 = 0;
                    for (long var80 = var74; var80 != 0L; var80 /= 37L) {
                        var79++;
                    }
                    StringBuilder var82 = new StringBuilder(var79);
                    while (var76 != 0L) {
                        long var83 = var76;
                        var76 /= 37L;
                        var82.append(class269.field3658[(int) (var83 - var76 * 37L)]);
                    }
                    var78 = var82.reverse().toString();
                }
                field959 = var78;
                Statics.field388 = field965.method2944();
                int var85 = field965.method2891();
                if (var85 == 255) {
                    field967 = -1;
                    return true;
                }
                Statics.field315 = var85;
                class76[] var86 = new class76[100];
                for (int var87 = 0; var87 < Statics.field315; var87++) {
                    var86[var87] = new class76();
                    var86[var87].field916 = field965.method2899();
                    var86[var87].field911 = class268.method4330(var86[var87].field916, Statics.field529);
                    var86[var87].field912 = field965.method2930();
                    var86[var87].field913 = field965.method2944();
                    field965.method2899();
                    if (var86[var87].field916.equals(Statics.field3209.field895)) {
                        Statics.field810 = var86[var87].field913;
                    }
                }
                boolean var88 = false;
                int var89 = Statics.field315;
                while (var89 > 0) {
                    boolean var90 = true;
                    var89--;
                    for (int var91 = 0; var91 < var89; var91++) {
                        if (var86[var91].field911.compareTo(var86[var91 + 1].field911) > 0) {
                            class76 var92 = var86[var91];
                            var86[var91] = var86[var91 + 1];
                            var86[var91 + 1] = var92;
                            var90 = false;
                        }
                    }
                    if (var90) {
                        break;
                    }
                }
                Statics.field1316 = var86;
                field967 = -1;
                return true;
            }
            if (field967 == 173) {
                int var93 = field965.method2919();
                int var94 = field965.method2914();
                int var95 = field965.method2900();
                class69 var96 = (class69) field1082.method3268((long) var95);
                if (var96 != null) {
                    method551(var96, var96.field824 != var94);
                }
                class69 var97 = new class69();
                var97.field824 = var94;
                var97.field823 = var93;
                field1082.method3259(var97, (long) var95);
                method2718(var94);
                class217 var98 = class217.method577(var95);
                method1(var98);
                if (field954 != null) {
                    method1(field954);
                    field954 = null;
                }
                method2745();
                method108(Statics.field515[var95 >> 16], var98, false);
                class84.method137(var94);
                if (field1081 != -1) {
                    int var99 = field1081;
                    if (class217.method1895(var99)) {
                        Statics.method629(Statics.field515[var99], 1);
                    }
                }
                field967 = -1;
                return true;
            }
            if (field967 == 108) {
                method472(true);
                field967 = -1;
                return true;
            }
            if (field967 == 85) {
                int var100 = field975 + field965.field2370;
                int var101 = field965.method2930();
                int var102 = field965.method2930();
                if (field1081 != var101) {
                    field1081 = var101;
                    this.method1067(false);
                    method2718(field1081);
                    class84.method137(field1081);
                    for (int var103 = 0; var103 < 100; var103++) {
                        field1096[var103] = true;
                    }
                }
                while (var102-- > 0) {
                    int var104 = field965.method2896();
                    int var105 = field965.method2930();
                    int var106 = field965.method2891();
                    class69 var107 = (class69) field1082.method3268((long) var104);
                    if (var107 != null && var107.field824 != var105) {
                        method551(var107, true);
                        var107 = null;
                    }
                    if (var107 == null) {
                        class69 var108 = new class69();
                        var108.field824 = var105;
                        var108.field823 = var106;
                        field1082.method3259(var108, (long) var104);
                        method2718(var105);
                        class217 var109 = class217.method577(var104);
                        method1(var109);
                        if (field954 != null) {
                            method1(field954);
                            field954 = null;
                        }
                        method2745();
                        method108(Statics.field515[var104 >> 16], var109, false);
                        class84.method137(var105);
                        if (field1081 != -1) {
                            int var110 = field1081;
                            if (class217.method1895(var110)) {
                                Statics.method629(Statics.field515[var110], 1);
                            }
                        }
                        var107 = var108;
                    }
                    var107.field828 = true;
                }
                for (class69 var112 = (class69) field1082.method3262(); var112 != null; var112 = (class69) field1082.method3263()) {
                    if (var112.field828) {
                        var112.field828 = false;
                    } else {
                        method551(var112, true);
                    }
                }
                field1143 = new class191(512);
                while (field965.field2370 < var100) {
                    int var113 = field965.method2896();
                    int var114 = field965.method2930();
                    int var115 = field965.method2930();
                    int var116 = field965.method2896();
                    for (int var117 = var114; var117 <= var115; var117++) {
                        long var118 = ((long) var113 << 32) + (long) var117;
                        field1143.method3259(new class199(var116), var118);
                    }
                }
                field967 = -1;
                return true;
            }
            if (field967 == 232) {
                int var120 = field965.method2937();
                boolean var121 = field965.method2917() == 1;
                class217 var122 = class217.method577(var120);
                if (var122.field2739 != var121) {
                    var122.field2739 = var121;
                    method1(var122);
                }
                field967 = -1;
                return true;
            }
            if (field967 == 210) {
                String var123 = field965.method2899();
                class180 var124 = field965;
                String var128;
                try {
                    int var125 = var124.method2904();
                    if (var125 > 32767) {
                        var125 = 32767;
                    }
                    byte[] var126 = new byte[var125];
                    var124.field2370 += Statics.field3646.method2821(var124.field2373, var124.field2370, var126, 0, var125);
                    String var127 = class267.method1374(var126, 0, var125);
                    var128 = var127;
                } catch (Exception var332) {
                    var128 = "Cabbage";
                }
                String var131 = class265.method4400(class271.method1532(var128));
                class99.method3(6, var123, var131);
                field967 = -1;
                return true;
            }
            if (field967 == 157) {
                field996 = field965.method2891();
                if (field996 == 1) {
                    field938 = field965.method2930();
                }
                if (field996 >= 2 && field996 <= 6) {
                    if (field996 == 2) {
                        field1008 = 64;
                        field1198 = 64;
                    }
                    if (field996 == 3) {
                        field1008 = 0;
                        field1198 = 64;
                    }
                    if (field996 == 4) {
                        field1008 = 128;
                        field1198 = 64;
                    }
                    if (field996 == 5) {
                        field1008 = 64;
                        field1198 = 0;
                    }
                    if (field996 == 6) {
                        field1008 = 64;
                        field1198 = 128;
                    }
                    field996 = 2;
                    field1186 = field965.method2930();
                    field1115 = field965.method2930();
                    field942 = field965.method2891();
                }
                if (field996 == 10) {
                    field939 = field965.method2930();
                }
                field967 = -1;
                return true;
            }
            if (field967 == 33) {
                int var132 = field965.method2930();
                int var133 = field965.method2891();
                int var134 = field965.method2930();
                if (field1149 != 0 && var133 != 0 && field1170 < 50) {
                    field1162[field1170] = var132;
                    field1163[field1170] = var133;
                    field1164[field1170] = var134;
                    field1166[field1170] = null;
                    field1165[field1170] = 0;
                    field1170++;
                }
                field967 = -1;
                return true;
            }
            if (field967 == 231) {
                class97.method3101();
                for (int var138 = 0; var138 < 2048; var138++) {
                    field1041[var138] = null;
                }
                class97.method122(field965);
                field967 = -1;
                return true;
            }
            if (field967 == 30) {
                field936 = field965.method3089() * 30;
                field1118 = field1106;
                field967 = -1;
                return true;
            }
            if (field967 == 169) {
                int var139 = field965.method2917();
                int var140 = field965.method2918();
                String var141 = field965.method2899();
                if (var139 >= 1 && var139 <= 8) {
                    if (var141.equalsIgnoreCase("null")) {
                        var141 = null;
                    }
                    field1047[var139 - 1] = var141;
                    field1048[var139 - 1] = var140 == 0;
                }
                field967 = -1;
                return true;
            }
            if (field967 == 138) {
                class180 var142 = field965;
                int var143 = field975;
                class280 var144 = new class280();
                var144.field3739 = var142.method2891();
                var144.field3735 = var142.method2896();
                var144.field3737 = new int[var144.field3739];
                var144.field3738 = new int[var144.field3739];
                var144.field3740 = new Field[var144.field3739];
                var144.field3736 = new int[var144.field3739];
                var144.field3741 = new Method[var144.field3739];
                var144.field3742 = new byte[var144.field3739][][];
                for (int var145 = 0; var145 < var144.field3739; var145++) {
                    try {
                        int var146 = var142.method2891();
                        if (var146 == 0 || var146 == 1 || var146 == 2) {
                            String var147 = var142.method2899();
                            String var148 = var142.method2899();
                            int var149 = 0;
                            if (var146 == 1) {
                                var149 = var142.method2896();
                            }
                            var144.field3737[var145] = var146;
                            var144.field3736[var145] = var149;
                            if (Statics.method2810(var147).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var144.field3740[var145] = Statics.method2810(var147).getDeclaredField(var148);
                        } else if (var146 == 3 || var146 == 4) {
                            String var150 = var142.method2899();
                            String var151 = var142.method2899();
                            int var152 = var142.method2891();
                            String[] var153 = new String[var152];
                            for (int var154 = 0; var154 < var152; var154++) {
                                var153[var154] = var142.method2899();
                            }
                            String var155 = var142.method2899();
                            byte[][] var156 = new byte[var152][];
                            if (var146 == 3) {
                                for (int var157 = 0; var157 < var152; var157++) {
                                    int var158 = var142.method2896();
                                    var156[var157] = new byte[var158];
                                    var142.method2902(var156[var157], 0, var158);
                                }
                            }
                            var144.field3737[var145] = var146;
                            Class[] var159 = new Class[var152];
                            for (int var160 = 0; var160 < var152; var160++) {
                                var159[var160] = Statics.method2810(var153[var160]);
                            }
                            Class var161 = Statics.method2810(var155);
                            if (Statics.method2810(var150).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var162 = Statics.method2810(var150).getDeclaredMethods();
                            Method[] var163 = var162;
                            for (int var164 = 0; var164 < var163.length; var164++) {
                                Method var165 = var163[var164];
                                if (var165.getName().equals(var151)) {
                                    Class[] var166 = var165.getParameterTypes();
                                    if (var159.length == var166.length) {
                                        boolean var167 = true;
                                        for (int var168 = 0; var168 < var159.length; var168++) {
                                            if (var159[var168] != var166[var168]) {
                                                var167 = false;
                                                break;
                                            }
                                        }
                                        if (var167 && var161 == var165.getReturnType()) {
                                            var144.field3741[var145] = var165;
                                        }
                                    }
                                }
                            }
                            var144.field3742[var145] = var156;
                        }
                    } catch (ClassNotFoundException var334) {
                        var144.field3738[var145] = -1;
                    } catch (SecurityException var335) {
                        var144.field3738[var145] = -2;
                    } catch (NullPointerException var336) {
                        var144.field3738[var145] = -3;
                    } catch (Exception var337) {
                        var144.field3738[var145] = -4;
                    } catch (Throwable var338) {
                        var144.field3738[var145] = -5;
                    }
                }
                class281.field3746.method3276(var144);
                field967 = -1;
                return true;
            }
            if (field967 == 143) {
                field965.field2370 += 28;
                if (field965.method2913()) {
                    method536(field965, field965.field2370 - 28);
                }
                field967 = -1;
                return true;
            }
            if (field967 == 194) {
                field1188 = 1;
                field1114 = field1106;
                field967 = -1;
                return true;
            }
            if (field967 == 175) {
                int var174 = field965.method2896();
                class217 var175 = class217.method577(var174);
                for (int var176 = 0; var176 < var175.field2751.length; var176++) {
                    var175.field2751[var176] = -1;
                    var175.field2751[var176] = 0;
                }
                method1(var175);
                field967 = -1;
                return true;
            }
            if (field967 == 89) {
                int var177 = field965.method2900();
                int var178 = field965.method2938();
                class69 var179 = (class69) field1082.method3268((long) var178);
                class69 var180 = (class69) field1082.method3268((long) var177);
                if (var180 != null) {
                    method551(var180, var179 == null || var179.field824 != var180.field824);
                }
                if (var179 != null) {
                    var179.method3304();
                    field1082.method3259(var179, (long) var177);
                }
                class217 var181 = class217.method577(var178);
                if (var181 != null) {
                    method1(var181);
                }
                class217 var182 = class217.method577(var177);
                if (var182 != null) {
                    method1(var182);
                    method108(Statics.field515[var182.field2637 >>> 16], var182, true);
                }
                if (field1081 != -1) {
                    int var183 = field1081;
                    if (class217.method1895(var183)) {
                        Statics.method629(Statics.field515[var183], 1);
                    }
                }
                field967 = -1;
                return true;
            }
            if (field967 == 2) {
                String var184 = field965.method2899();
                long var185 = (long) field965.method2930();
                long var187 = (long) field965.method2890();
                class231 var189 = (class231) class169.method999(class231.method667(), field965.method2891());
                long var190 = (var185 << 32) + var187;
                boolean var192 = false;
                for (int var193 = 0; var193 < 100; var193++) {
                    if (field1026[var193] == var190) {
                        var192 = true;
                        break;
                    }
                }
                if (method2662(var184)) {
                    var192 = true;
                }
                if (!var192 && field1001 == 0) {
                    field1026[field1141] = var190;
                    field1141 = (field1141 + 1) % 100;
                    class180 var194 = field965;
                    String var198;
                    try {
                        int var195 = var194.method2904();
                        if (var195 > 32767) {
                            var195 = 32767;
                        }
                        byte[] var196 = new byte[var195];
                        var194.field2370 += Statics.field3646.method2821(var194.field2373, var194.field2370, var196, 0, var195);
                        String var197 = class267.method1374(var196, 0, var195);
                        var198 = var197;
                    } catch (Exception var331) {
                        var198 = "Cabbage";
                    }
                    String var201 = class265.method4400(class271.method1532(var198));
                    byte var202;
                    if (var189.field3149) {
                        var202 = 7;
                    } else {
                        var202 = 3;
                    }
                    if (var189.field3157 == -1) {
                        class99.method3(var202, var184, var201);
                    } else {
                        class99.method3(var202, class89.method3740(var189.field3157) + var184, var201);
                    }
                }
                field967 = -1;
                return true;
            }
            if (field967 == 110) {
                int var203 = field965.method2938();
                int var204 = field965.method2930();
                class217 var205 = class217.method577(var203);
                if (var205.field2693 != 2 || var205.field2702 != var204) {
                    var205.field2693 = 2;
                    var205.field2702 = var204;
                    method1(var205);
                }
                field967 = -1;
                return true;
            }
            if (field967 == 216) {
                Statics.field465 = field965.method2919();
                Statics.field3297 = field965.method2891();
                for (int var206 = Statics.field3297; var206 < Statics.field3297 + 8; var206++) {
                    for (int var207 = Statics.field465; var207 < Statics.field465 + 8; var207++) {
                        if (field1160[Statics.field267][var206][var207] != null) {
                            field1160[Statics.field267][var206][var207] = null;
                            method2759(var206, var207);
                        }
                    }
                }
                for (class77 var208 = (class77) field1094.method3336(); var208 != null; var208 = (class77) field1094.method3324()) {
                    if (var208.field1206 >= Statics.field3297 && var208.field1206 < Statics.field3297 + 8 && var208.field1207 >= Statics.field465 && var208.field1207 < Statics.field465 + 8 && Statics.field267 == var208.field1209) {
                        var208.field1204 = 0;
                    }
                }
                field967 = -1;
                return true;
            }
            if (field967 == 106) {
                int var209 = field965.method2938();
                class217 var210 = class217.method577(var209);
                var210.field2693 = 3;
                var210.field2702 = Statics.field3209.field881.method3618();
                method1(var210);
                field967 = -1;
                return true;
            }
            if (field967 == 218) {
                byte var211 = field965.method2920();
                int var212 = field965.method3089();
                class212.field2590[var212] = var211;
                if (class212.field2589[var212] != var211) {
                    class212.field2589[var212] = var211;
                }
                method2647(var212);
                field1107[++field1023 - 1 & 0x1F] = var212;
                field967 = -1;
                return true;
            }
            if (field967 == 244) {
                int var213 = field965.method2896();
                String var214 = field965.method2899();
                class217 var215 = class217.method577(var213);
                if (!var214.equals(var215.field2707)) {
                    var215.field2707 = var214;
                    method1(var215);
                }
                field967 = -1;
                return true;
            }
            if (field967 == 41) {
                int var216 = field965.method2896();
                int var217 = field965.method2896();
                if (Statics.field341 == null || !Statics.field341.isValid()) {
                    try {
                        Iterator var218 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var218.hasNext()) {
                            GarbageCollectorMXBean var219 = (GarbageCollectorMXBean) var218.next();
                            if (var219.isValid()) {
                                Statics.field341 = var219;
                                field926 = -1L;
                                field1197 = -1L;
                            }
                        }
                    } catch (Throwable var333) {
                    }
                }
                long var221 = class176.method218();
                int var223 = -1;
                if (Statics.field341 != null) {
                    long var224 = Statics.field341.getCollectionTime();
                    if (field1197 != -1L) {
                        long var226 = var224 - field1197;
                        long var228 = var221 - field926;
                        if (var228 != 0L) {
                            var223 = (int) (var226 * 100L / var228);
                        }
                    }
                    field1197 = var224;
                    field926 = var221;
                }
                field963.method3121(59);
                field963.method2915(var223);
                field963.method3055(var216);
                field963.method2885(var217);
                field963.method2915(field697);
                field967 = -1;
                return true;
            }
            if (field967 == 167) {
                method1908();
                field1086 = field965.method2891();
                field1118 = field1106;
                field967 = -1;
                return true;
            }
            if (field967 == 75) {
                method146(true);
                field965.method3126();
                int var230 = field965.method2930();
                class97.method546(field965, var230);
                field967 = -1;
                return true;
            }
            if (field967 == 185) {
                while (field965.field2370 < field975) {
                    boolean var231 = field965.method2891() == 1;
                    String var232 = field965.method2899();
                    String var233 = field965.method2899();
                    int var234 = field965.method2930();
                    int var235 = field965.method2891();
                    int var236 = field965.method2891();
                    boolean var237 = (var236 & 0x2) != 0;
                    boolean var238 = (var236 & 0x1) != 0;
                    if (var234 > 0) {
                        field965.method2899();
                        field965.method2891();
                        field965.method2896();
                    }
                    field965.method2899();
                    for (int var239 = 0; var239 < field1067; var239++) {
                        class66 var240 = field1120[var239];
                        if (var231) {
                            if (var233.equals(var240.field801)) {
                                var240.field801 = var232;
                                var240.field800 = var233;
                                var232 = null;
                                break;
                            }
                        } else if (var232.equals(var240.field801)) {
                            if (var240.field796 != var234) {
                                boolean var241 = true;
                                for (class68 var242 = (class68) field1190.method3354(); var242 != null; var242 = (class68) field1190.method3353()) {
                                    if (var242.field821.equals(var232)) {
                                        if (var234 != 0 && var242.field820 == 0) {
                                            var242.method3364();
                                            var241 = false;
                                        } else if (var234 == 0 && var242.field820 != 0) {
                                            var242.method3364();
                                            var241 = false;
                                        }
                                    }
                                }
                                if (var241) {
                                    field1190.method3352(new class68(var232, var234));
                                }
                                var240.field796 = var234;
                            }
                            var240.field800 = var233;
                            var240.field805 = var235;
                            var240.field798 = var237;
                            var240.field799 = var238;
                            var232 = null;
                            break;
                        }
                    }
                    if (var232 != null && field1067 < 400) {
                        class66 var243 = new class66();
                        field1120[field1067] = var243;
                        var243.field801 = var232;
                        var243.field800 = var233;
                        var243.field796 = var234;
                        var243.field805 = var235;
                        var243.field798 = var237;
                        var243.field799 = var238;
                        field1067++;
                    }
                }
                field1188 = 2;
                field1114 = field1106;
                boolean var244 = false;
                int var245 = field1067;
                while (var245 > 0) {
                    boolean var246 = true;
                    var245--;
                    for (int var247 = 0; var247 < var245; var247++) {
                        boolean var248 = false;
                        class66 var249 = field1120[var247];
                        class66 var250 = field1120[var247 + 1];
                        if (field918 != var249.field796 && field918 == var250.field796) {
                            var248 = true;
                        }
                        if (!var248 && var249.field796 == 0 && var250.field796 != 0) {
                            var248 = true;
                        }
                        if (!var248 && !var249.field798 && var250.field798) {
                            var248 = true;
                        }
                        if (!var248 && !var249.field799 && var250.field799) {
                            var248 = true;
                        }
                        if (var248) {
                            class66 var251 = field1120[var247];
                            field1120[var247] = field1120[var247 + 1];
                            field1120[var247 + 1] = var251;
                            var246 = false;
                        }
                    }
                    if (var246) {
                        break;
                    }
                }
                field967 = -1;
                return true;
            }
            if (field967 == 222) {
                field1137 = field965.method2891();
                field922 = field965.method2891();
                field967 = -1;
                return true;
            }
            if (field967 == 60) {
                boolean var252 = field965.method2891() == 1;
                if (var252) {
                    Statics.field322 = class176.method218() - field965.method2897();
                    Statics.field864 = new class14(field965, true);
                } else {
                    Statics.field864 = null;
                }
                field1117 = field1106;
                field967 = -1;
                return true;
            }
            if (field967 == 250) {
                field1167 = false;
                for (int var253 = 0; var253 < 5; var253++) {
                    field1085[var253] = false;
                }
                field967 = -1;
                return true;
            }
            if (field967 == 67) {
                if (field1081 != -1) {
                    int var254 = field1081;
                    if (class217.method1895(var254)) {
                        Statics.method629(Statics.field515[var254], 0);
                    }
                }
                field967 = -1;
                return true;
            }
            if (field967 == 188) {
                method1049(field965.method2899());
                field967 = -1;
                return true;
            }
            if (field967 == 80) {
                method624();
                field967 = -1;
                return false;
            }
            if (field967 == 70) {
                field1155 = field965.method2891();
                field967 = -1;
                return true;
            }
            if (field967 == 155) {
                int var255 = field965.method2930();
                int var256 = field965.method2927();
                int var257 = field965.method2900();
                class217 var258 = class217.method577(var257);
                var258.field2689 = (var255 << 16) + var256;
                field967 = -1;
                return true;
            }
            if (field967 == 0) {
                method1908();
                field1087 = field965.method2894();
                field1118 = field1106;
                field967 = -1;
                return true;
            }
            if (field967 == 102) {
                int var259 = field965.method2900();
                Statics.field722 = Statics.field712.method2683(var259);
                field967 = -1;
                return true;
            }
            if (field967 == 255) {
                int var260 = field965.method2896();
                int var261 = field965.method2930();
                if (var260 < -70000) {
                    var261 += 32768;
                }
                class217 var262;
                if (var260 >= 0) {
                    var262 = class217.method577(var260);
                } else {
                    var262 = null;
                }
                while (field965.field2370 < field975) {
                    int var263 = field965.method2904();
                    int var264 = field965.method2930();
                    int var265 = 0;
                    if (var264 != 0) {
                        var265 = field965.method2891();
                        if (var265 == 255) {
                            var265 = field965.method2896();
                        }
                    }
                    if (var262 != null && var263 >= 0 && var263 < var262.field2751.length) {
                        var262.field2751[var263] = var264;
                        var262.field2741[var263] = var265;
                    }
                    Statics.method41(var261, var263, var264 - 1, var265);
                }
                if (var262 != null) {
                    method1(var262);
                }
                method1908();
                field1109[++field972 - 1 & 0x1F] = var261 & 0x7FFF;
                field967 = -1;
                return true;
            }
            if (field967 == 97) {
                int var266 = field965.method2930();
                Statics.method219(var266);
                field1109[++field972 - 1 & 0x1F] = var266 & 0x7FFF;
                field967 = -1;
                return true;
            }
            if (field967 == 192) {
                field1153 = field965.method2891();
                if (field1153 == 255) {
                    field1153 = 0;
                }
                field1161 = field965.method2891();
                if (field1161 == 255) {
                    field1161 = 0;
                }
                field967 = -1;
                return true;
            }
            if (field967 == 25) {
                int var267 = field965.method2929();
                int var268 = field965.method2900();
                class217 var269 = class217.method577(var268);
                if (var269.field2680 != var267 || var267 == -1) {
                    var269.field2680 = var267;
                    var269.field2706 = 0;
                    var269.field2659 = 0;
                    method1(var269);
                }
                field967 = -1;
                return true;
            }
            if (field967 == 34) {
                class97.method546(field965, field975);
                field967 = -1;
                return true;
            }
            if (field967 == 203) {
                String var270 = field965.method2899();
                long var271 = field965.method2897();
                long var273 = (long) field965.method2930();
                long var275 = (long) field965.method2890();
                class231 var277 = (class231) class169.method999(class231.method667(), field965.method2891());
                long var278 = (var273 << 32) + var275;
                boolean var280 = false;
                for (int var281 = 0; var281 < 100; var281++) {
                    if (field1026[var281] == var278) {
                        var280 = true;
                        break;
                    }
                }
                if (var277.field3156 && method2662(var270)) {
                    var280 = true;
                }
                if (!var280 && field1001 == 0) {
                    field1026[field1141] = var278;
                    field1141 = (field1141 + 1) % 100;
                    class180 var282 = field965;
                    String var286;
                    try {
                        int var283 = var282.method2904();
                        if (var283 > 32767) {
                            var283 = 32767;
                        }
                        byte[] var284 = new byte[var283];
                        var282.field2370 += Statics.field3646.method2821(var282.field2373, var282.field2370, var284, 0, var283);
                        String var285 = class267.method1374(var284, 0, var283);
                        var286 = var285;
                    } catch (Exception var330) {
                        var286 = "Cabbage";
                    }
                    String var289 = class265.method4400(class271.method1532(var286));
                    if (var277.field3157 == -1) {
                        class99.method2667(9, var270, var289, class269.method3741(var271));
                    } else {
                        class99.method2667(9, class89.method3740(var277.field3157) + var270, var289, class269.method3741(var271));
                    }
                }
                field967 = -1;
                return true;
            }
            if (field967 == 237) {
                int var290 = field965.method2938();
                int var291 = field965.method2937();
                int var292 = field965.method2914();
                if (var292 == 65535) {
                    var292 = -1;
                }
                int var293 = field965.method2930();
                if (var293 == 65535) {
                    var293 = -1;
                }
                for (int var294 = var292; var294 <= var293; var294++) {
                    long var295 = ((long) var290 << 32) + (long) var294;
                    class193 var297 = field1143.method3268(var295);
                    if (var297 != null) {
                        var297.method3304();
                    }
                    field1143.method3259(new class199(var291), var295);
                }
                field967 = -1;
                return true;
            }
            if (field967 == 170) {
                int var298 = field965.method2891();
                if (field965.method2891() == 0) {
                    field1196[var298] = new class17();
                    field965.field2370 += 18;
                } else {
                    field965.field2370--;
                    field1196[var298] = new class17(field965, false);
                }
                field1116 = field1106;
                field967 = -1;
                return true;
            }
            if (field967 == 208) {
                int var299 = field965.method2930();
                field1081 = var299;
                this.method1067(false);
                method2718(var299);
                class84.method137(field1081);
                for (int var300 = 0; var300 < 100; var300++) {
                    field1096[var300] = true;
                }
                field967 = -1;
                return true;
            }
            if (field967 == 117) {
                int var301 = field965.method2904();
                boolean var302 = field965.method2891() == 1;
                String var303 = "";
                boolean var304 = false;
                if (var302) {
                    var303 = field965.method2899();
                    if (method2662(var303)) {
                        var304 = true;
                    }
                }
                String var305 = field965.method2899();
                if (!var304) {
                    class99.method3(var301, var303, var305);
                }
                field967 = -1;
                return true;
            }
            if (field967 == 16) {
                String var306 = field965.method2899();
                int var307 = field965.method2930();
                byte var308 = field965.method2944();
                boolean var309 = false;
                if (var308 == -128) {
                    var309 = true;
                }
                if (var309) {
                    if (Statics.field315 == 0) {
                        field967 = -1;
                        return true;
                    }
                    boolean var310 = false;
                    int var311;
                    for (var311 = 0; var311 < Statics.field315 && (!Statics.field1316[var311].field916.equals(var306) || Statics.field1316[var311].field912 != var307); var311++) {
                    }
                    if (var311 < Statics.field315) {
                        while (var311 < Statics.field315 - 1) {
                            Statics.field1316[var311] = Statics.field1316[var311 + 1];
                            var311++;
                        }
                        Statics.field315--;
                        Statics.field1316[Statics.field315] = null;
                    }
                } else {
                    field965.method2899();
                    class76 var312 = new class76();
                    var312.field916 = var306;
                    var312.field911 = class268.method4330(var312.field916, Statics.field529);
                    var312.field912 = var307;
                    var312.field913 = var308;
                    int var313;
                    for (var313 = Statics.field315 - 1; var313 >= 0; var313--) {
                        int var314 = Statics.field1316[var313].field911.compareTo(var312.field911);
                        if (var314 == 0) {
                            Statics.field1316[var313].field912 = var307;
                            Statics.field1316[var313].field913 = var308;
                            if (var306.equals(Statics.field3209.field895)) {
                                Statics.field810 = var308;
                            }
                            field1097 = field1106;
                            field967 = -1;
                            return true;
                        }
                        if (var314 < 0) {
                            break;
                        }
                    }
                    if (Statics.field315 >= Statics.field1316.length) {
                        field967 = -1;
                        return true;
                    }
                    for (int var315 = Statics.field315 - 1; var315 > var313; var315--) {
                        Statics.field1316[var315 + 1] = Statics.field1316[var315];
                    }
                    if (Statics.field315 == 0) {
                        Statics.field1316 = new class76[100];
                    }
                    Statics.field1316[var313 + 1] = var312;
                    Statics.field315++;
                    if (var306.equals(Statics.field3209.field895)) {
                        Statics.field810 = var308;
                    }
                }
                field1097 = field1106;
                field967 = -1;
                return true;
            }
            if (field967 == 159) {
                int var316 = field965.method2927();
                if (var316 == 65535) {
                    var316 = -1;
                }
                Statics.method469(var316);
                field967 = -1;
                return true;
            }
            if (field967 == 57) {
                int var317 = field965.method2930();
                if (var317 == 65535) {
                    var317 = -1;
                }
                int var318 = field965.method2935();
                method6(var317, var318);
                field967 = -1;
                return true;
            }
            if (field967 == 211) {
                int var319 = field965.method2896();
                class69 var320 = (class69) field1082.method3268((long) var319);
                if (var320 != null) {
                    method551(var320, true);
                }
                if (field954 != null) {
                    method1(field954);
                    field954 = null;
                }
                field967 = -1;
                return true;
            }
            if (field967 == 227) {
                int var321 = field965.method2927();
                int var322 = field965.method2896();
                int var323 = field965.method2914();
                int var324 = field965.method3089();
                class217 var325 = class217.method577(var322);
                if (var325.field2684 != var321 || var325.field2685 != var324 || var325.field2687 != var323) {
                    var325.field2684 = var321;
                    var325.field2685 = var324;
                    var325.field2687 = var323;
                    method1(var325);
                }
                field967 = -1;
                return true;
            }
            class153.method464("" + field967 + class89.field1395 + field971 + class89.field1395 + field1056 + class89.field1395 + field975, (Throwable) null);
            method624();
        } catch (IOException var339) {
            method37();
        } catch (Exception var340) {
            String var328 = "" + field967 + class89.field1395 + field971 + class89.field1395 + field1056 + class89.field1395 + field975 + class89.field1395 + (Statics.field414 + Statics.field3209.field1283[0]) + class89.field1395 + (Statics.field2117 + Statics.field3209.field1284[0]) + class89.field1395;
            for (int var329 = 0; var329 < field975 && var329 < 50; var329++) {
                var328 = var328 + field965.field2373[var329] + class89.field1395;
            }
            class153.method464(var328, var340);
            method624();
        }
        return true;
    }

    @ObfuscatedName("cj.ga(I)V")
    public static final void method1549() {
        if (field967 == 247) {
            int var0 = field965.method2914();
            int var1 = field965.method2919();
            int var2 = var1 >> 2;
            int var3 = var1 & 0x3;
            int var4 = field984[var2];
            int var5 = field965.method2891();
            int var6 = (var5 >> 4 & 0x7) + Statics.field3297;
            int var7 = (var5 & 0x7) + Statics.field465;
            if (var6 >= 0 && var7 >= 0 && var6 < 103 && var7 < 103) {
                if (var4 == 0) {
                    class143 var8 = Statics.field621.method2482(Statics.field267, var6, var7);
                    if (var8 != null) {
                        int var9 = var8.field2128 >> 14 & 0x7FFF;
                        if (var2 == 2) {
                            var8.field2127 = new class101(var9, 2, var3 + 4, Statics.field267, var6, var7, var0, false, var8.field2127);
                            var8.field2122 = new class101(var9, 2, var3 + 1 & 0x3, Statics.field267, var6, var7, var0, false, var8.field2122);
                        } else {
                            var8.field2127 = new class101(var9, var2, var3, Statics.field267, var6, var7, var0, false, var8.field2127);
                        }
                    }
                }
                if (var4 == 1) {
                    class148 var10 = Statics.field621.method2515(Statics.field267, var6, var7);
                    if (var10 != null) {
                        int var11 = var10.field2170 >> 14 & 0x7FFF;
                        if (var2 == 4 || var2 == 5) {
                            var10.field2171 = new class101(var11, 4, var3, Statics.field267, var6, var7, var0, false, var10.field2171);
                        } else if (var2 == 6) {
                            var10.field2171 = new class101(var11, 4, var3 + 4, Statics.field267, var6, var7, var0, false, var10.field2171);
                        } else if (var2 == 7) {
                            var10.field2171 = new class101(var11, 4, (var3 + 2 & 0x3) + 4, Statics.field267, var6, var7, var0, false, var10.field2171);
                        } else if (var2 == 8) {
                            var10.field2171 = new class101(var11, 4, var3 + 4, Statics.field267, var6, var7, var0, false, var10.field2171);
                            var10.field2163 = new class101(var11, 4, (var3 + 2 & 0x3) + 4, Statics.field267, var6, var7, var0, false, var10.field2163);
                        }
                    }
                }
                if (var4 == 2) {
                    class149 var12 = Statics.field621.method2484(Statics.field267, var6, var7);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var12 != null) {
                        var12.field2176 = new class101(var12.field2184 >> 14 & 0x7FFF, var2, var3, Statics.field267, var6, var7, var0, false, var12.field2176);
                    }
                }
                if (var4 == 3) {
                    class130 var13 = Statics.field621.method2485(Statics.field267, var6, var7);
                    if (var13 != null) {
                        var13.field1862 = new class101(var13.field1863 >> 14 & 0x7FFF, 22, var3, Statics.field267, var6, var7, var0, false, var13.field1862);
                    }
                }
            }
        } else if (field967 == 241) {
            int var14 = field965.method2917();
            int var15 = (var14 >> 4 & 0x7) + Statics.field3297;
            int var16 = (var14 & 0x7) + Statics.field465;
            int var17 = field965.method2891();
            int var18 = var17 >> 2;
            int var19 = var17 & 0x3;
            int var20 = field984[var18];
            int var21 = field965.method2930();
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                method623(Statics.field267, var15, var16, var20, var21, var18, var19, 0, -1);
            }
        } else if (field967 == 44) {
            int var22 = field965.method2891();
            int var23 = (var22 >> 4 & 0x7) + Statics.field3297;
            int var24 = (var22 & 0x7) + Statics.field465;
            int var25 = field965.method2930();
            int var26 = field965.method2930();
            int var27 = field965.method2930();
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                class194 var28 = field1160[Statics.field267][var23][var24];
                if (var28 != null) {
                    for (class95 var29 = (class95) var28.method3336(); var29 != null; var29 = (class95) var28.method3324()) {
                        if ((var25 & 0x7FFF) == var29.field1493 && var29.field1494 == var26) {
                            var29.field1494 = var27;
                            break;
                        }
                    }
                    method2759(var23, var24);
                }
            }
        } else if (field967 == 221) {
            int var30 = field965.method2891();
            int var31 = (var30 >> 4 & 0x7) + Statics.field3297;
            int var32 = (var30 & 0x7) + Statics.field465;
            int var33 = var31 + field965.method2944();
            int var34 = var32 + field965.method2944();
            int var35 = field965.method2894();
            int var36 = field965.method2930();
            int var37 = field965.method2891() * 4;
            int var38 = field965.method2891() * 4;
            int var39 = field965.method2930();
            int var40 = field965.method2930();
            int var41 = field965.method2891();
            int var42 = field965.method2891();
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && var36 != 65535) {
                int var43 = var31 * 128 + 64;
                int var44 = var32 * 128 + 64;
                int var45 = var33 * 128 + 64;
                int var46 = var34 * 128 + 64;
                class94 var47 = new class94(var36, Statics.field267, var43, var44, method1372(var43, var44, Statics.field267) - var37, field929 + var39, field929 + var40, var41, var42, var35, var38);
                var47.method1595(var45, var46, method1372(var45, var46, Statics.field267) - var38, field929 + var39);
                field1053.method3318(var47);
            }
        } else {
            if (field967 == 140) {
                int var48 = field965.method2891();
                int var49 = (var48 >> 4 & 0x7) + Statics.field3297;
                int var50 = (var48 & 0x7) + Statics.field465;
                int var51 = field965.method2930();
                int var52 = field965.method2891();
                int var53 = var52 >> 4 & 0xF;
                int var54 = var52 & 0x7;
                int var55 = field965.method2891();
                if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                    int var56 = var53 + 1;
                    if (Statics.field3209.field1283[0] >= var49 - var56 && Statics.field3209.field1283[0] <= var49 + var56 && Statics.field3209.field1284[0] >= var50 - var56 && Statics.field3209.field1284[0] <= var50 + var56 && field1002 != 0 && var54 > 0 && field1170 < 50) {
                        field1162[field1170] = var51;
                        field1163[field1170] = var54;
                        field1164[field1170] = var55;
                        field1166[field1170] = null;
                        field1165[field1170] = (var49 << 16) + (var50 << 8) + var53;
                        field1170++;
                    }
                }
            }
            if (field967 == 126) {
                int var57 = field965.method2927();
                int var58 = field965.method2891();
                int var59 = (var58 >> 4 & 0x7) + Statics.field3297;
                int var60 = (var58 & 0x7) + Statics.field465;
                int var61 = field965.method2930();
                if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
                    class95 var62 = new class95();
                    var62.field1493 = var61;
                    var62.field1494 = var57;
                    if (field1160[Statics.field267][var59][var60] == null) {
                        field1160[Statics.field267][var59][var60] = new class194();
                    }
                    field1160[Statics.field267][var59][var60].method3318(var62);
                    method2759(var59, var60);
                }
            } else if (field967 == 154) {
                int var63 = field965.method2891();
                int var64 = (var63 >> 4 & 0x7) + Statics.field3297;
                int var65 = (var63 & 0x7) + Statics.field465;
                int var66 = field965.method2930();
                int var67 = field965.method2891();
                int var68 = field965.method2930();
                if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
                    int var69 = var64 * 128 + 64;
                    int var70 = var65 * 128 + 64;
                    class85 var71 = new class85(var66, Statics.field267, var69, var70, method1372(var69, var70, Statics.field267) - var67, var68, field929);
                    field1024.method3318(var71);
                }
            } else if (field967 == 19) {
                int var72 = field965.method2930();
                int var73 = field965.method2917();
                int var74 = (var73 >> 4 & 0x7) + Statics.field3297;
                int var75 = (var73 & 0x7) + Statics.field465;
                if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104) {
                    class194 var76 = field1160[Statics.field267][var74][var75];
                    if (var76 != null) {
                        for (class95 var77 = (class95) var76.method3336(); var77 != null; var77 = (class95) var76.method3324()) {
                            if ((var72 & 0x7FFF) == var77.field1493) {
                                var77.method3304();
                                break;
                            }
                        }
                        if (var76.method3336() == null) {
                            field1160[Statics.field267][var74][var75] = null;
                        }
                        method2759(var74, var75);
                    }
                }
            } else {
                if (field967 == 193) {
                    int var78 = field965.method2914();
                    int var79 = field965.method2918();
                    int var80 = var79 >> 2;
                    int var81 = var79 & 0x3;
                    int var82 = field984[var80];
                    int var83 = field965.method2918();
                    int var84 = (var83 >> 4 & 0x7) + Statics.field3297;
                    int var85 = (var83 & 0x7) + Statics.field465;
                    int var86 = field965.method2927();
                    byte var87 = field965.method2944();
                    byte var88 = field965.method2921();
                    int var89 = field965.method3089();
                    int var90 = field965.method2927();
                    byte var91 = field965.method3016();
                    byte var92 = field965.method2920();
                    class75 var93;
                    if (field1046 == var78) {
                        var93 = Statics.field3209;
                    } else {
                        var93 = field1041[var78];
                    }
                    if (var93 != null) {
                        class256 var94 = class256.method4379(var90);
                        int var95;
                        int var96;
                        if (var81 == 1 || var81 == 3) {
                            var95 = var94.field3431;
                            var96 = var94.field3436;
                        } else {
                            var95 = var94.field3436;
                            var96 = var94.field3431;
                        }
                        int var97 = (var95 >> 1) + var84;
                        int var98 = (var95 + 1 >> 1) + var84;
                        int var99 = (var96 >> 1) + var85;
                        int var100 = (var96 + 1 >> 1) + var85;
                        int[][] var101 = class62.field749[Statics.field267];
                        int var102 = var101[var97][var99] + var101[var98][var99] + var101[var97][var100] + var101[var98][var100] >> 2;
                        int var103 = (var84 << 7) + (var95 << 6);
                        int var104 = (var85 << 7) + (var96 << 6);
                        class134 var105 = var94.method4151(var80, var81, var101, var103, var102, var104);
                        if (var105 != null) {
                            method623(Statics.field267, var84, var85, var82, -1, 0, 0, var89 + 1, var86 + 1);
                            var93.field900 = field929 + var89;
                            var93.field903 = field929 + var86;
                            var93.field894 = var105;
                            var93.field891 = var84 * 128 + var95 * 64;
                            var93.field893 = var85 * 128 + var96 * 64;
                            var93.field908 = var102;
                            if (var88 > var87) {
                                byte var106 = var88;
                                var88 = var87;
                                var87 = var106;
                            }
                            if (var92 > var91) {
                                byte var107 = var92;
                                var92 = var91;
                                var91 = var107;
                            }
                            var93.field899 = var84 + var88;
                            var93.field897 = var84 + var87;
                            var93.field880 = var85 + var92;
                            var93.field898 = var85 + var91;
                        }
                    }
                }
                if (field967 == 24) {
                    int var108 = field965.method2917();
                    int var109 = var108 >> 2;
                    int var110 = var108 & 0x3;
                    int var111 = field984[var109];
                    int var112 = field965.method2917();
                    int var113 = (var112 >> 4 & 0x7) + Statics.field3297;
                    int var114 = (var112 & 0x7) + Statics.field465;
                    if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
                        method623(Statics.field267, var113, var114, var111, -1, var109, var110, 0, -1);
                    }
                }
            }
        }
    }

    @ObfuscatedName("au.gy(IIIIIIIIIB)V")
    public static final void method623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class77 var9 = null;
        for (class77 var10 = (class77) field1094.method3336(); var10 != null; var10 = (class77) field1094.method3324()) {
            if (var10.field1209 == arg0 && var10.field1206 == arg1 && var10.field1207 == arg2 && var10.field1215 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class77();
            var9.field1209 = arg0;
            var9.field1215 = arg3;
            var9.field1206 = arg1;
            var9.field1207 = arg2;
            method705(var9);
            field1094.method3318(var9);
        }
        var9.field1211 = arg4;
        var9.field1213 = arg5;
        var9.field1212 = arg6;
        var9.field1205 = arg7;
        var9.field1204 = arg8;
    }

    @ObfuscatedName("ff.gl(S)V")
    public static final void method3118() {
        for (class77 var0 = (class77) field1094.method3336(); var0 != null; var0 = (class77) field1094.method3324()) {
            if (var0.field1204 == -1) {
                var0.field1205 = 0;
                method705(var0);
            } else {
                var0.method3304();
            }
        }
    }

    @ObfuscatedName("bs.gk(Lbe;I)V")
    public static final void method705(class77 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1215 == 0) {
            var1 = Statics.field621.method2606(arg0.field1209, arg0.field1206, arg0.field1207);
        }
        if (arg0.field1215 == 1) {
            var1 = Statics.field621.method2486(arg0.field1209, arg0.field1206, arg0.field1207);
        }
        if (arg0.field1215 == 2) {
            var1 = Statics.field621.method2487(arg0.field1209, arg0.field1206, arg0.field1207);
        }
        if (arg0.field1215 == 3) {
            var1 = Statics.field621.method2566(arg0.field1209, arg0.field1206, arg0.field1207);
        }
        if (var1 != 0) {
            int var5 = Statics.field621.method2489(arg0.field1209, arg0.field1206, arg0.field1207, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1208 = var2;
        arg0.field1210 = var3;
        arg0.field1216 = var4;
    }

    @ObfuscatedName("fg.hk(III)V")
    public static final void method2759(int arg0, int arg1) {
        class194 var2 = field1160[Statics.field267][arg0][arg1];
        if (var2 == null) {
            Statics.field621.method2481(Statics.field267, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class95 var5 = null;
        for (class95 var6 = (class95) var2.method3336(); var6 != null; var6 = (class95) var2.method3324()) {
            class257 var7 = Statics.method461(var6.field1493);
            long var8 = (long) var7.field3488;
            if (var7.field3501 == 1) {
                var8 = (long) (var6.field1494 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field621.method2481(Statics.field267, arg0, arg1);
            return;
        }
        var2.method3314(var5);
        class95 var10 = null;
        class95 var11 = null;
        for (class95 var12 = (class95) var2.method3336(); var12 != null; var12 = (class95) var2.method3324()) {
            if (var5.field1493 != var12.field1493) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1493 != var12.field1493 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field621.method2483(Statics.field267, arg0, arg1, method1372(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field267), var5, var13, var10, var11);
    }

    @ObfuscatedName("at.hm(ZI)V")
    public static final void method472(boolean arg0) {
        field1044 = 0;
        field961 = 0;
        method60();
        method46(arg0);
        for (int var1 = 0; var1 < field961; var1++) {
            int var2 = field1093[var1];
            class87 var3 = field958[var2];
            int var4 = field965.method2891();
            if ((var4 & 0x4) != 0) {
                var3.field1241 = field965.method2899();
                var3.field1240 = 100;
            }
            if ((var4 & 0x1) != 0) {
                int var5 = field965.method2914();
                int var6 = field965.method2930();
                int var7 = var3.field1243 - (var5 - Statics.field414 - Statics.field414) * 64;
                int var8 = var3.field1229 - (var6 - Statics.field2117 - Statics.field2117) * 64;
                if (var7 != 0 || var8 != 0) {
                    var3.field1256 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field1265 = field965.method2927();
                int var9 = field965.method2896();
                var3.field1275 = var9 >> 16;
                var3.field1268 = (var9 & 0xFFFF) + field929;
                var3.field1273 = 0;
                var3.field1267 = 0;
                if (var3.field1268 > field929) {
                    var3.field1273 = -1;
                }
                if (var3.field1265 == 65535) {
                    var3.field1265 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                int var10 = field965.method2927();
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = field965.method2918();
                if (var3.field1260 == var10 && var10 != -1) {
                    int var12 = class261.method2746(var10).field3582;
                    if (var12 == 1) {
                        var3.field1261 = 0;
                        var3.field1262 = 0;
                        var3.field1263 = var11;
                        var3.field1264 = 0;
                    }
                    if (var12 == 2) {
                        var3.field1264 = 0;
                    }
                } else if (var10 == -1 || var3.field1260 == -1 || class261.method2746(var10).field3594 >= class261.method2746(var3.field1260).field3594) {
                    var3.field1260 = var10;
                    var3.field1261 = 0;
                    var3.field1262 = 0;
                    var3.field1263 = var11;
                    var3.field1264 = 0;
                    var3.field1287 = var3.field1245;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field1380 = class259.method3097(field965.method2930());
                var3.field1232 = var3.field1380.field3544;
                var3.field1277 = var3.field1380.field3546;
                var3.field1236 = var3.field1380.field3539;
                var3.field1274 = var3.field1380.field3561;
                var3.field1238 = var3.field1380.field3541;
                var3.field1239 = var3.field1380.field3533;
                var3.field1276 = var3.field1380.field3536;
                var3.field1278 = var3.field1380.field3537;
                var3.field1235 = var3.field1380.field3538;
            }
            if ((var4 & 0x40) != 0) {
                int var13 = field965.method2919();
                if (var13 > 0) {
                    for (int var14 = 0; var14 < var13; var14++) {
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = -1;
                        int var18 = field965.method2904();
                        if (var18 == 32767) {
                            var18 = field965.method2904();
                            var16 = field965.method2904();
                            var15 = field965.method2904();
                            var17 = field965.method2904();
                        } else if (var18 == 32766) {
                            var18 = -1;
                        } else {
                            var16 = field965.method2904();
                        }
                        int var19 = field965.method2904();
                        var3.method1381(var18, var16, var15, var17, field929, var19);
                    }
                }
                int var20 = field965.method2891();
                if (var20 > 0) {
                    for (int var21 = 0; var21 < var20; var21++) {
                        int var22 = field965.method2904();
                        int var23 = field965.method2904();
                        if (var23 == 32767) {
                            var3.method1383(var22);
                        } else {
                            int var24 = field965.method2904();
                            int var25 = field965.method2918();
                            int var26 = var23 > 0 ? field965.method2891() : var25;
                            var3.method1382(var22, field929, var23, var24, var25, var26);
                        }
                    }
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field1254 = field965.method2927();
                if (var3.field1254 == 65535) {
                    var3.field1254 = -1;
                }
            }
        }
        for (int var27 = 0; var27 < field1044; var27++) {
            int var28 = field1045[var27];
            if (field929 != field958[var28].field1244) {
                field958[var28].field1380 = null;
                field958[var28] = null;
            }
        }
        if (field975 != field965.field2370) {
            throw new RuntimeException(field965.field2370 + class89.field1395 + field975);
        }
        for (int var29 = 0; var29 < field1138; var29++) {
            if (field958[field960[var29]] == null) {
                throw new RuntimeException(var29 + class89.field1395 + field1138);
            }
        }
    }

    @ObfuscatedName("c.hv(I)V")
    public static final void method60() {
        field965.method3123();
        int var0 = field965.method3141(8);
        if (var0 < field1138) {
            for (int var1 = var0; var1 < field1138; var1++) {
                field1045[++field1044 - 1] = field960[var1];
            }
        }
        if (var0 > field1138) {
            throw new RuntimeException("");
        }
        field1138 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field960[var2];
            class87 var4 = field958[var3];
            int var5 = field965.method3141(1);
            if (var5 == 0) {
                field960[++field1138 - 1] = var3;
                var4.field1244 = field929;
            } else {
                int var6 = field965.method3141(2);
                if (var6 == 0) {
                    field960[++field1138 - 1] = var3;
                    var4.field1244 = field929;
                    field1093[++field961 - 1] = var3;
                } else if (var6 == 1) {
                    field960[++field1138 - 1] = var3;
                    var4.field1244 = field929;
                    int var7 = field965.method3141(3);
                    var4.method1541(var7, (byte) 1);
                    int var8 = field965.method3141(1);
                    if (var8 == 1) {
                        field1093[++field961 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field960[++field1138 - 1] = var3;
                    var4.field1244 = field929;
                    int var9 = field965.method3141(3);
                    var4.method1541(var9, (byte) 2);
                    int var10 = field965.method3141(3);
                    var4.method1541(var10, (byte) 2);
                    int var11 = field965.method3141(1);
                    if (var11 == 1) {
                        field1093[++field961 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field1045[++field1044 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("s.he(ZB)V")
    public static final void method46(boolean arg0) {
        while (true) {
            if (field965.method3130(field975) >= 27) {
                int var1 = field965.method3141(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field958[var1] == null) {
                        field958[var1] = new class87();
                        var2 = true;
                    }
                    class87 var3 = field958[var1];
                    field960[++field1138 - 1] = var1;
                    var3.field1244 = field929;
                    var3.field1380 = class259.method3097(field965.method3141(14));
                    int var4 = field965.method3141(1);
                    int var5;
                    if (arg0) {
                        var5 = field965.method3141(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = field965.method3141(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6;
                    if (arg0) {
                        var6 = field965.method3141(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = field965.method3141(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7 = field1140[field965.method3141(3)];
                    if (var2) {
                        var3.field1247 = var3.field1230 = var7;
                    }
                    int var8 = field965.method3141(1);
                    if (var8 == 1) {
                        field1093[++field961 - 1] = var1;
                    }
                    var3.field1232 = var3.field1380.field3544;
                    var3.field1277 = var3.field1380.field3546;
                    if (var3.field1277 == 0) {
                        var3.field1230 = 0;
                    }
                    var3.field1236 = var3.field1380.field3539;
                    var3.field1274 = var3.field1380.field3561;
                    var3.field1238 = var3.field1380.field3541;
                    var3.field1239 = var3.field1380.field3533;
                    var3.field1276 = var3.field1380.field3536;
                    var3.field1278 = var3.field1380.field3537;
                    var3.field1235 = var3.field1380.field3538;
                    var3.method1538(Statics.field3209.field1283[0] + var6, Statics.field3209.field1284[0] + var5, var4 == 1);
                    continue;
                }
            }
            field965.method3124();
            return;
        }
    }

    @ObfuscatedName("fi.hh(Lbm;IIBI)V")
    public static final void method2714(class75 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field1283[0];
        int var5 = arg0.field1284[0];
        int var6 = arg0.method1017();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var9 = arg0.method1017();
        field1199.field2298 = arg1;
        field1199.field2296 = arg2;
        field1199.field2297 = 1;
        field1199.field2295 = 1;
        class74 var10 = field1199;
        int var11 = class163.method2454(var4, var5, var9, var10, field981[arg0.field889], true, field1200, field937);
        if (var11 >= 1) {
            for (int var12 = 0; var12 < var11 - 1; var12++) {
                arg0.method1021(field1200[var12], field937[var12], arg3);
            }
        }
    }

    @ObfuscatedName("cm.hr(I)V")
    public static void method1610() {
        field1060 = 0;
        field1189 = -1;
        field1059 = false;
    }

    @ObfuscatedName("dn.hn(B)V")
    public static void method1878() {
        method1610();
        field1065[0] = class226.field3073;
        field1134[0] = "";
        field1063[0] = 1006;
        field1060 = 1;
    }

    @ObfuscatedName("fh.hy(I)V")
    public static final void method3099() {
        int var0 = Statics.field860;
        int var1 = Statics.field2416;
        int var2 = Statics.field2053;
        int var3 = Statics.field2302;
        int var4 = 6116423;
        class282.method4607(var0, var1, var2, var3, var4);
        class282.method4607(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class282.method4589(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field245.method4401(class226.field3011, var0 + 3, var1 + 14, var4, -1);
        int var5 = class60.field729;
        int var6 = class60.field726;
        for (int var7 = 0; var7 < field1060; var7++) {
            int var8 = (field1060 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class264 var10 = Statics.field245;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (field1134[var7].length() > 0) {
                var11 = field1065[var7] + class226.field2994 + field1134[var7];
            } else {
                var11 = field1065[var7];
            }
            var10.method4401(var11, var0 + 3, var8, var9, 0);
        }
        method1457(Statics.field860, Statics.field2416, Statics.field2053, Statics.field2302);
    }

    @ObfuscatedName("bm.hj(IIIII)V")
    public static final void method1039(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field917; var4++) {
            if (field923[var4] + field1126[var4] > arg0 && field923[var4] < arg0 + arg2 && field1132[var4] + field1130[var4] > arg1 && field1130[var4] < arg1 + arg3) {
                field1096[var4] = true;
            }
        }
    }

    @ObfuscatedName("co.hc(IIIIB)V")
    public static final void method1457(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field917; var4++) {
            if (field923[var4] + field1126[var4] > arg0 && field923[var4] < arg0 + arg2 && field1132[var4] + field1130[var4] > arg1 && field1130[var4] < arg1 + arg3) {
                field944[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hq(I)V")
    public final void method1293() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field1060 - 1; var2++) {
                if (field1063[var2] < 1000 && field1063[var2 + 1] > 1000) {
                    String var3 = field1134[var2];
                    field1134[var2] = field1134[var2 + 1];
                    field1134[var2 + 1] = var3;
                    String var4 = field1065[var2];
                    field1065[var2] = field1065[var2 + 1];
                    field1065[var2 + 1] = var4;
                    int var5 = field1063[var2];
                    field1063[var2] = field1063[var2 + 1];
                    field1063[var2 + 1] = var5;
                    int var6 = field1061[var2];
                    field1061[var2] = field1061[var2 + 1];
                    field1061[var2 + 1] = var6;
                    int var7 = field1062[var2];
                    field1062[var2] = field1062[var2 + 1];
                    field1062[var2 + 1] = var7;
                    int var8 = field1064[var2];
                    field1064[var2] = field1064[var2 + 1];
                    field1064[var2 + 1] = var8;
                    if (field1189 != -1) {
                        if (field1189 == var2) {
                            field1189 = var2 + 1;
                        } else if (field1189 == var2 + 1) {
                            field1189 = var2;
                        }
                    }
                    var1 = false;
                }
            }
        }
        if (Statics.field423 != null || field1049 != null) {
            return;
        }
        int var20;
        int var22;
        int var23;
        label246: {
            int var9 = class60.field737;
            if (field1059) {
                if (var9 != 1 && (Statics.field264 || var9 != 4)) {
                    int var10 = class60.field729;
                    int var11 = class60.field726;
                    if (var10 < Statics.field860 - 10 || var10 > Statics.field860 + Statics.field2053 + 10 || var11 < Statics.field2416 - 10 || var11 > Statics.field2416 + Statics.field2302 + 10) {
                        field1059 = false;
                        method1039(Statics.field860, Statics.field2416, Statics.field2053, Statics.field2302);
                    }
                }
                if (var9 == 1 || !Statics.field264 && var9 == 4) {
                    int var12 = Statics.field860;
                    int var13 = Statics.field2416;
                    int var14 = Statics.field2053;
                    int var15 = class60.field736;
                    int var16 = class60.field735;
                    int var17 = -1;
                    for (int var18 = 0; var18 < field1060; var18++) {
                        int var19 = (field1060 - 1 - var18) * 15 + var13 + 31;
                        if (var15 > var12 && var15 < var12 + var14 && var16 > var19 - 13 && var16 < var19 + 3) {
                            var17 = var18;
                        }
                    }
                    if (var17 != -1) {
                        method458(var17);
                    }
                    field1059 = false;
                    method1039(Statics.field860, Statics.field2416, Statics.field2053, Statics.field2302);
                }
            } else {
                var20 = method1534();
                if ((var9 == 1 || !Statics.field264 && var9 == 4) && var20 >= 0) {
                    int var21 = field1063[var20];
                    if (var21 == 39 || var21 == 40 || var21 == 41 || var21 == 42 || var21 == 43 || var21 == 33 || var21 == 34 || var21 == 35 || var21 == 36 || var21 == 37 || var21 == 38 || var21 == 1005) {
                        var22 = field1061[var20];
                        var23 = field1062[var20];
                        class217 var24 = class217.method577(var23);
                        int var25 = method1045(var24);
                        boolean var26 = (var25 >> 28 & 0x1) != 0;
                        if (var26) {
                            break label246;
                        }
                        class218 var10000 = (class218) null;
                        if (class218.method3725(method1045(var24))) {
                            break label246;
                        }
                    }
                }
                if (var9 == 1 || !Statics.field264 && var9 == 4) {
                    label252: {
                        label163: {
                            if (field1058 == 1 && field1060 > 2) {
                                boolean var28;
                                if (field1060 <= 0) {
                                    var28 = false;
                                } else if (field1069 && class51.field641[81] && field1189 != -1) {
                                    var28 = true;
                                } else {
                                    var28 = false;
                                }
                                if (!var28) {
                                    break label163;
                                }
                            }
                            if (!method27(var20)) {
                                break label252;
                            }
                        }
                        var9 = 2;
                    }
                }
                if ((var9 == 1 || !Statics.field264 && var9 == 4) && field1060 > 0) {
                    method458(var20);
                }
                if (var9 == 2 && field1060 > 0) {
                    this.method1066(class60.field736, class60.field735);
                }
            }
            return;
        }
        if (Statics.field423 != null && !field1038) {
            int var27 = method1534();
            if (field1058 != 1 && !method27(var27) && field1060 > 0) {
                method190(field1145, field1036);
            }
        }
        field1038 = false;
        field1039 = 0;
        if (Statics.field423 != null) {
            method1(Statics.field423);
        }
        Statics.field423 = class217.method577(var23);
        field1187 = var22;
        field1145 = class60.field736;
        field1036 = class60.field735;
        if (var20 >= 0) {
            Statics.field2285 = new class90();
            Statics.field2285.field1408 = field1061[var20];
            Statics.field2285.field1414 = field1062[var20];
            Statics.field2285.field1406 = field1063[var20];
            Statics.field2285.field1407 = field1064[var20];
            Statics.field2285.field1415 = field1065[var20];
        }
        method1(Statics.field423);
    }

    @ObfuscatedName("client.hl(IIB)V")
    public final void method1066(int arg0, int arg1) {
        int var3 = Statics.field245.method4446(class226.field3011);
        for (int var4 = 0; var4 < field1060; var4++) {
            class264 var5 = Statics.field245;
            String var6;
            if (var4 < 0) {
                var6 = "";
            } else if (field1134[var4].length() > 0) {
                var6 = field1065[var4] + class226.field2994 + field1134[var4];
            } else {
                var6 = field1065[var4];
            }
            int var7 = var5.method4446(var6);
            if (var7 > var3) {
                var3 = var7;
            }
        }
        var3 += 8;
        int var8 = field1060 * 15 + 22;
        int var9 = arg0 - var3 / 2;
        if (var3 + var9 > Statics.field413) {
            var9 = Statics.field413 - var3;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg1;
        if (var8 + arg1 > Statics.field1916) {
            var10 = Statics.field1916 - var8;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        Statics.field621.method2496(Statics.field267, arg0, arg1, false);
        field1059 = true;
        Statics.field860 = var9;
        Statics.field2416 = var10;
        Statics.field2053 = var3;
        Statics.field2302 = field1060 * 15 + 22;
    }

    @ObfuscatedName("j.hx(II)Z")
    public static final boolean method27(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field1063[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("al.ha(II)V")
    public static final void method458(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field1061[arg0];
        int var2 = field1062[arg0];
        int var3 = field1063[arg0];
        int var4 = field1064[arg0];
        String var5 = field1065[arg0];
        String var6 = field1134[arg0];
        method1696(var1, var2, var3, var4, var5, var6, class60.field736, class60.field735);
    }

    @ObfuscatedName("hs.hg(Lcg;IIB)V")
    public static final void method3739(class90 arg0, int arg1, int arg2) {
        method1696(arg0.field1408, arg0.field1414, arg0.field1406, arg0.field1407, arg0.field1415, arg0.field1415, arg1, arg2);
    }

    @ObfuscatedName("cp.hp(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1696(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 29) {
            field963.method3121(110);
            field963.method3055(arg1);
            class217 var8 = class217.method577(arg1);
            if (var8.field2745 != null && var8.field2745[0][0] == 5) {
                int var9 = var8.field2745[0][1];
                if (class212.field2589[var9] != var8.field2747[0]) {
                    class212.field2589[var9] = var8.field2747[0];
                    method2647(var9);
                }
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field768.method4959(arg2, arg3, new class213(arg0), new class213(arg1));
        }
        if (arg2 == 5) {
            field1028 = arg6;
            field1029 = arg7;
            field1129 = 2;
            field1030 = 0;
            field1153 = arg0;
            field1161 = arg1;
            field963.method3121(114);
            field963.method2877(Statics.field2117 + arg1);
            field963.method2916(Statics.field414 + arg0);
            field963.method2876(class51.field641[82] ? 1 : 0);
            field963.method2925(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 38) {
            method231();
            class217 var10 = class217.method577(arg1);
            field1074 = 1;
            Statics.field237 = arg0;
            Statics.field609 = arg1;
            Statics.field338 = arg3;
            method1(var10);
            field1075 = class89.method2665(16748608) + Statics.method461(arg3).field3491 + class89.method2665(16777215);
            if (field1075 == null) {
                field1075 = "null";
            }
            return;
        }
        if (arg2 == 49) {
            class75 var11 = field1041[arg3];
            if (var11 != null) {
                field1028 = arg6;
                field1029 = arg7;
                field1129 = 2;
                field1030 = 0;
                field1153 = arg0;
                field1161 = arg1;
                field963.method3121(81);
                field963.method2923(arg3);
                field963.method3052(class51.field641[82] ? 1 : 0);
            }
        }
        if (arg2 == 40) {
            field963.method3121(146);
            field963.method2939(arg1);
            field963.method2925(arg3);
            field963.method2916(arg0);
            field1032 = 0;
            Statics.field797 = class217.method577(arg1);
            field1173 = arg0;
        }
        if (arg2 == 30 && field954 == null) {
            field963.method3121(171);
            field963.method2939(arg1);
            field963.method2916(arg0);
            field954 = class217.method1520(arg1, arg0);
            method1(field954);
        }
        if (arg2 == 14) {
            class75 var12 = field1041[arg3];
            if (var12 != null) {
                field1028 = arg6;
                field1029 = arg7;
                field1129 = 2;
                field1030 = 0;
                field1153 = arg0;
                field1161 = arg1;
                field963.method3121(165);
                field963.method2925(Statics.field338);
                field963.method2939(Statics.field609);
                field963.method3052(class51.field641[82] ? 1 : 0);
                field963.method2877(Statics.field237);
                field963.method2916(arg3);
            }
        }
        if (arg2 == 1003) {
            field1028 = arg6;
            field1029 = arg7;
            field1129 = 2;
            field1030 = 0;
            class87 var13 = field958[arg3];
            if (var13 != null) {
                class259 var14 = var13.field1380;
                if (var14.field3557 != null) {
                    var14 = var14.method4270();
                }
                if (var14 != null) {
                    field963.method3121(147);
                    field963.method2877(var14.field3531);
                }
            }
        }
        if (arg2 == 31) {
            field963.method3121(167);
            field963.method2877(Statics.field237);
            field963.method2934(Statics.field609);
            field963.method2939(arg1);
            field963.method2925(Statics.field338);
            field963.method2916(arg0);
            field963.method2916(arg3);
            field1032 = 0;
            Statics.field797 = class217.method577(arg1);
            field1173 = arg0;
        }
        if (arg2 == 17) {
            field1028 = arg6;
            field1029 = arg7;
            field1129 = 2;
            field1030 = 0;
            field1153 = arg0;
            field1161 = arg1;
            field963.method3121(148);
            field963.method2923(Statics.field414 + arg0);
            field963.method2885(Statics.field277);
            field963.method2877(Statics.field2117 + arg1);
            field963.method2916(arg3);
            field963.method2923(field1077);
            field963.method3052(class51.field641[82] ? 1 : 0);
        }
        if (arg2 == 32) {
            field963.method3121(180);
            field963.method2934(arg1);
            field963.method2923(field1077);
            field963.method2885(Statics.field277);
            field963.method2916(arg3);
            field963.method2916(arg0);
            field1032 = 0;
            Statics.field797 = class217.method577(arg1);
            field1173 = arg0;
        }
        if (arg2 == 37) {
            field963.method3121(100);
            field963.method2925(arg3);
            field963.method2885(arg1);
            field963.method2923(arg0);
            field1032 = 0;
            Statics.field797 = class217.method577(arg1);
            field1173 = arg0;
        }
        if (arg2 == 11) {
            class87 var15 = field958[arg3];
            if (var15 != null) {
                field1028 = arg6;
                field1029 = arg7;
                field1129 = 2;
                field1030 = 0;
                field1153 = arg0;
                field1161 = arg1;
                field963.method3121(94);
                field963.method2923(arg3);
                field963.method2876(class51.field641[82] ? 1 : 0);
            }
        }
        if (arg2 == 22) {
            field1028 = arg6;
            field1029 = arg7;
            field1129 = 2;
            field1030 = 0;
            field1153 = arg0;
            field1161 = arg1;
            field963.method3121(6);
            field963.method2923(Statics.field414 + arg0);
            field963.method2925(arg3);
            field963.method2953(class51.field641[82] ? 1 : 0);
            field963.method2877(Statics.field2117 + arg1);
        }
        if (arg2 == 6) {
            field1028 = arg6;
            field1029 = arg7;
            field1129 = 2;
            field1030 = 0;
            field1153 = arg0;
            field1161 = arg1;
            field963.method3121(56);
            field963.method2915(class51.field641[82] ? 1 : 0);
            field963.method2923(Statics.field2117 + arg1);
            field963.method2877(arg3 >> 14 & 0x7FFF);
            field963.method2916(Statics.field414 + arg0);
        }
        if (arg2 == 41) {
            field963.method3121(65);
            field963.method2877(arg0);
            field963.method2923(arg3);
            field963.method2939(arg1);
            field1032 = 0;
            Statics.field797 = class217.method577(arg1);
            field1173 = arg0;
        }
        if (arg2 == 1001) {
            field1028 = arg6;
            field1029 = arg7;
            field1129 = 2;
            field1030 = 0;
            field1153 = arg0;
            field1161 = arg1;
            field963.method3121(253);
            field963.method2923(arg3 >> 14 & 0x7FFF);
            field963.method2916(Statics.field2117 + arg1);
            field963.method2877(Statics.field414 + arg0);
            field963.method3052(class51.field641[82] ? 1 : 0);
        }
        if (arg2 == 25) {
            class217 var16 = class217.method1520(arg1, arg0);
            if (var16 != null) {
                method231();
                method1004(arg1, arg0, class218.method2678(method1045(var16)), var16.field2753);
                field1074 = 0;
                field1201 = method118(var16);
                if (field1201 == null) {
                    field1201 = "Null";
                }
                if (var16.field2632) {
                    field1021 = var16.field2671 + class89.method2665(16777215);
                } else {
                    field1021 = class89.method2665(65280) + var16.field2749 + class89.method2665(16777215);
                }
            }
            return;
        }
        if (arg2 == 45) {
            class75 var17 = field1041[arg3];
            if (var17 != null) {
                field1028 = arg6;
                field1029 = arg7;
                field1129 = 2;
                field1030 = 0;
                field1153 = arg0;
                field1161 = arg1;
                field963.method3121(170);
                field963.method2877(arg3);
                field963.method2876(class51.field641[82] ? 1 : 0);
            }
        }
        if (arg2 == 44) {
            class75 var18 = field1041[arg3];
            if (var18 != null) {
                field1028 = arg6;
                field1029 = arg7;
                field1129 = 2;
                field1030 = 0;
                field1153 = arg0;
                field1161 = arg1;
                field963.method3121(232);
                field963.method2953(class51.field641[82] ? 1 : 0);
                field963.method2877(arg3);
            }
        }
        if (arg2 == 1) {
            field1028 = arg6;
            field1029 = arg7;
            field1129 = 2;
            field1030 = 0;
            field1153 = arg0;
            field1161 = arg1;
            field963.method3121(69);
            field963.method2916(Statics.field2117 + arg1);
            field963.method2915(class51.field641[82] ? 1 : 0);
            field963.method2877(arg3 >> 14 & 0x7FFF);
            field963.method2916(Statics.field237);
            field963.method2925(Statics.field414 + arg0);
            field963.method3055(Statics.field609);
            field963.method2925(Statics.field338);
        }
        if (arg2 == 28) {
            field963.method3121(110);
            field963.method3055(arg1);
            class217 var19 = class217.method577(arg1);
            if (var19.field2745 != null && var19.field2745[0][0] == 5) {
                int var20 = var19.field2745[0][1];
                class212.field2589[var20] = 1 - class212.field2589[var20];
                method2647(var20);
            }
        }
        if (arg2 == 15) {
            class75 var21 = field1041[arg3];
            if (var21 != null) {
                field1028 = arg6;
                field1029 = arg7;
                field1129 = 2;
                field1030 = 0;
                field1153 = arg0;
                field1161 = arg1;
                field963.method3121(101);
                field963.method2916(field1077);
                field963.method2916(arg3);
                field963.method3052(class51.field641[82] ? 1 : 0);
                field963.method3055(Statics.field277);
            }
        }
        if (arg2 == 43) {
            field963.method3121(176);
            field963.method2925(arg3);
            field963.method2925(arg0);
            field963.method2934(arg1);
            field1032 = 0;
            Statics.field797 = class217.method577(arg1);
            field1173 = arg0;
        }
        if (arg2 == 8) {
            class87 var22 = field958[arg3];
            if (var22 != null) {
                field1028 = arg6;
                field1029 = arg7;
                field1129 = 2;
                field1030 = 0;
                field1153 = arg0;
                field1161 = arg1;
                field963.method3121(32);
                field963.method3055(Statics.field277);
                field963.method2877(arg3);
                field963.method2923(field1077);
                field963.method2915(class51.field641[82] ? 1 : 0);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class217 var23 = class217.method1520(arg1, arg0);
            if (var23 != null) {
                method1627(arg3, arg1, arg0, var23.field2753, arg5);
            }
        }
        if (arg2 == 1004) {
            field1028 = arg6;
            field1029 = arg7;
            field1129 = 2;
            field1030 = 0;
            field963.method3121(223);
            field963.method2925(arg3);
        }
        if (arg2 == 7) {
            class87 var24 = field958[arg3];
            if (var24 != null) {
                field1028 = arg6;
                field1029 = arg7;
                field1129 = 2;
                field1030 = 0;
                field1153 = arg0;
                field1161 = arg1;
                field963.method3121(74);
                field963.method2876(class51.field641[82] ? 1 : 0);
                field963.method2877(arg3);
                field963.method2877(Statics.field237);
                field963.method2916(Statics.field338);
                field963.method2939(Statics.field609);
            }
        }
        if (arg2 == 18) {
            field1028 = arg6;
            field1029 = arg7;
            field1129 = 2;
            field1030 = 0;
            field1153 = arg0;
            field1161 = arg1;
            field963.method3121(233);
            field963.method3052(class51.field641[82] ? 1 : 0);
            field963.method2925(Statics.field414 + arg0);
            field963.method2916(Statics.field2117 + arg1);
            field963.method2916(arg3);
        }
        if (arg2 == 51) {
            class75 var25 = field1041[arg3];
            if (var25 != null) {
                field1028 = arg6;
                field1029 = arg7;
                field1129 = 2;
                field1030 = 0;
                field1153 = arg0;
                field1161 = arg1;
                field963.method3121(177);
                field963.method2925(arg3);
                field963.method2876(class51.field641[82] ? 1 : 0);
            }
        }
        if (arg2 == 35) {
            field963.method3121(150);
            field963.method2925(arg0);
            field963.method2885(arg1);
            field963.method2923(arg3);
            field1032 = 0;
            Statics.field797 = class217.method577(arg1);
            field1173 = arg0;
        }
        if (arg2 == 42) {
            field963.method3121(197);
            field963.method2877(arg0);
            field963.method2877(arg3);
            field963.method2939(arg1);
            field1032 = 0;
            Statics.field797 = class217.method577(arg1);
            field1173 = arg0;
        }
        if (arg2 == 16) {
            field1028 = arg6;
            field1029 = arg7;
            field1129 = 2;
            field1030 = 0;
            field1153 = arg0;
            field1161 = arg1;
            field963.method3121(42);
            field963.method2925(Statics.field338);
            field963.method2915(class51.field641[82] ? 1 : 0);
            field963.method2923(Statics.field414 + arg0);
            field963.method2925(Statics.field237);
            field963.method2925(arg3);
            field963.method2939(Statics.field609);
            field963.method2923(Statics.field2117 + arg1);
        }
        if (arg2 == 19) {
            field1028 = arg6;
            field1029 = arg7;
            field1129 = 2;
            field1030 = 0;
            field1153 = arg0;
            field1161 = arg1;
            field963.method3121(115);
            field963.method2877(arg3);
            field963.method2877(Statics.field2117 + arg1);
            field963.method2916(Statics.field414 + arg0);
            field963.method2953(class51.field641[82] ? 1 : 0);
        }
        if (arg2 == 1005) {
            class217 var26 = class217.method577(arg1);
            if (var26 == null || var26.field2741[arg0] < 100000) {
                field963.method3121(223);
                field963.method2925(arg3);
            } else {
                class99.method3(27, "", var26.field2741[arg0] + " x " + Statics.method461(arg3).field3491);
            }
            field1032 = 0;
            Statics.field797 = class217.method577(arg1);
            field1173 = arg0;
        }
        if (arg2 == 36) {
            field963.method3121(185);
            field963.method2939(arg1);
            field963.method2923(arg0);
            field963.method2916(arg3);
            field1032 = 0;
            Statics.field797 = class217.method577(arg1);
            field1173 = arg0;
        }
        if (arg2 == 46) {
            class75 var27 = field1041[arg3];
            if (var27 != null) {
                field1028 = arg6;
                field1029 = arg7;
                field1129 = 2;
                field1030 = 0;
                field1153 = arg0;
                field1161 = arg1;
                field963.method3121(41);
                field963.method2915(class51.field641[82] ? 1 : 0);
                field963.method2925(arg3);
            }
        }
        if (arg2 == 48) {
            class75 var28 = field1041[arg3];
            if (var28 != null) {
                field1028 = arg6;
                field1029 = arg7;
                field1129 = 2;
                field1030 = 0;
                field1153 = arg0;
                field1161 = arg1;
                field963.method3121(152);
                field963.method2953(class51.field641[82] ? 1 : 0);
                field963.method2877(arg3);
            }
        }
        if (arg2 == 58) {
            class217 var29 = class217.method1520(arg1, arg0);
            if (var29 != null) {
                field963.method3121(105);
                field963.method2916(arg0);
                field963.method2939(arg1);
                field963.method2923(field1078);
                field963.method3055(Statics.field277);
                field963.method2916(var29.field2753);
                field963.method2877(field1077);
            }
        }
        if (arg2 == 39) {
            field963.method3121(129);
            field963.method2923(arg3);
            field963.method3055(arg1);
            field963.method2925(arg0);
            field1032 = 0;
            Statics.field797 = class217.method577(arg1);
            field1173 = arg0;
        }
        if (arg2 == 10) {
            class87 var30 = field958[arg3];
            if (var30 != null) {
                field1028 = arg6;
                field1029 = arg7;
                field1129 = 2;
                field1030 = 0;
                field1153 = arg0;
                field1161 = arg1;
                field963.method3121(79);
                field963.method2915(class51.field641[82] ? 1 : 0);
                field963.method2923(arg3);
            }
        }
        if (arg2 == 9) {
            class87 var31 = field958[arg3];
            if (var31 != null) {
                field1028 = arg6;
                field1029 = arg7;
                field1129 = 2;
                field1030 = 0;
                field1153 = arg0;
                field1161 = arg1;
                field963.method3121(241);
                field963.method2953(class51.field641[82] ? 1 : 0);
                field963.method2925(arg3);
            }
        }
        if (arg2 == 50) {
            class75 var32 = field1041[arg3];
            if (var32 != null) {
                field1028 = arg6;
                field1029 = arg7;
                field1129 = 2;
                field1030 = 0;
                field1153 = arg0;
                field1161 = arg1;
                field963.method3121(141);
                field963.method2915(class51.field641[82] ? 1 : 0);
                field963.method2916(arg3);
            }
        }
        if (arg2 == 20) {
            field1028 = arg6;
            field1029 = arg7;
            field1129 = 2;
            field1030 = 0;
            field1153 = arg0;
            field1161 = arg1;
            field963.method3121(244);
            field963.method2923(Statics.field414 + arg0);
            field963.method2916(arg3);
            field963.method2916(Statics.field2117 + arg1);
            field963.method2953(class51.field641[82] ? 1 : 0);
        }
        if (arg2 == 4) {
            field1028 = arg6;
            field1029 = arg7;
            field1129 = 2;
            field1030 = 0;
            field1153 = arg0;
            field1161 = arg1;
            field963.method3121(106);
            field963.method2923(arg3 >> 14 & 0x7FFF);
            field963.method2916(Statics.field2117 + arg1);
            field963.method2876(class51.field641[82] ? 1 : 0);
            field963.method2916(Statics.field414 + arg0);
        }
        if (arg2 == 26) {
            method3096();
        }
        if (arg2 == 23) {
            if (field1059) {
                Statics.field621.method2461();
            } else {
                Statics.field621.method2496(Statics.field267, arg0, arg1, true);
            }
        }
        if (arg2 == 3) {
            field1028 = arg6;
            field1029 = arg7;
            field1129 = 2;
            field1030 = 0;
            field1153 = arg0;
            field1161 = arg1;
            field963.method3121(95);
            field963.method2916(Statics.field2117 + arg1);
            field963.method2925(Statics.field414 + arg0);
            field963.method2953(class51.field641[82] ? 1 : 0);
            field963.method2925(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 33) {
            field963.method3121(235);
            field963.method2885(arg1);
            field963.method2925(arg0);
            field963.method2925(arg3);
            field1032 = 0;
            Statics.field797 = class217.method577(arg1);
            field1173 = arg0;
        }
        if (arg2 == 47) {
            class75 var33 = field1041[arg3];
            if (var33 != null) {
                field1028 = arg6;
                field1029 = arg7;
                field1129 = 2;
                field1030 = 0;
                field1153 = arg0;
                field1161 = arg1;
                field963.method3121(61);
                field963.method2915(class51.field641[82] ? 1 : 0);
                field963.method2925(arg3);
            }
        }
        if (arg2 == 12) {
            class87 var34 = field958[arg3];
            if (var34 != null) {
                field1028 = arg6;
                field1029 = arg7;
                field1129 = 2;
                field1030 = 0;
                field1153 = arg0;
                field1161 = arg1;
                field963.method3121(7);
                field963.method2925(arg3);
                field963.method2953(class51.field641[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field963.method3121(194);
            field963.method2916(arg0);
            field963.method2877(arg3);
            field963.method2885(arg1);
            field1032 = 0;
            Statics.field797 = class217.method577(arg1);
            field1173 = arg0;
        }
        if (arg2 == 1002) {
            field1028 = arg6;
            field1029 = arg7;
            field1129 = 2;
            field1030 = 0;
            field963.method3121(245);
            field963.method2916(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 2) {
            field1028 = arg6;
            field1029 = arg7;
            field1129 = 2;
            field1030 = 0;
            field1153 = arg0;
            field1161 = arg1;
            field963.method3121(64);
            field963.method2876(class51.field641[82] ? 1 : 0);
            field963.method2925(arg3 >> 14 & 0x7FFF);
            field963.method2925(field1077);
            field963.method2916(Statics.field2117 + arg1);
            field963.method2939(Statics.field277);
            field963.method2877(Statics.field414 + arg0);
        }
        if (arg2 == 24) {
            class217 var35 = class217.method577(arg1);
            boolean var36 = true;
            if (var35.field2651 > 0) {
                var36 = method1399(var35);
            }
            if (var36) {
                field963.method3121(110);
                field963.method3055(arg1);
            }
        }
        if (arg2 == 13) {
            class87 var37 = field958[arg3];
            if (var37 != null) {
                field1028 = arg6;
                field1029 = arg7;
                field1129 = 2;
                field1030 = 0;
                field1153 = arg0;
                field1161 = arg1;
                field963.method3121(251);
                field963.method2876(class51.field641[82] ? 1 : 0);
                field963.method2916(arg3);
            }
        }
        if (arg2 == 21) {
            field1028 = arg6;
            field1029 = arg7;
            field1129 = 2;
            field1030 = 0;
            field1153 = arg0;
            field1161 = arg1;
            field963.method3121(204);
            field963.method2925(Statics.field414 + arg0);
            field963.method2923(arg3);
            field963.method2916(Statics.field2117 + arg1);
            field963.method2876(class51.field641[82] ? 1 : 0);
        }
        if (field1074 != 0) {
            field1074 = 0;
            method1(class217.method577(Statics.field609));
        }
        if (field1076) {
            method231();
        }
        if (Statics.field797 != null && field1032 == 0) {
            method1(Statics.field797);
        }
    }

    @ObfuscatedName("hf.ho(ILjava/lang/String;I)V")
    public static void method3755(int arg0, String arg1) {
        int var2 = class97.field1507;
        int[] var3 = class97.field1508;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class75 var6 = field1041[var3[var5]];
            if (var6 != null && Statics.field3209 != var6 && var6.field895 != null && var6.field895.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field963.method3121(232);
                    field963.method2953(0);
                    field963.method2877(var3[var5]);
                } else if (arg0 == 4) {
                    field963.method3121(61);
                    field963.method2915(0);
                    field963.method2925(var3[var5]);
                } else if (arg0 == 6) {
                    field963.method3121(81);
                    field963.method2923(var3[var5]);
                    field963.method3052(0);
                } else if (arg0 == 7) {
                    field963.method3121(141);
                    field963.method2915(0);
                    field963.method2916(var3[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class99.method3(4, "", class226.field2887 + arg1);
        }
    }

    @ObfuscatedName("bx.hb(IIIII)V")
    public static void method1004(int arg0, int arg1, int arg2, int arg3) {
        class217 var4 = class217.method1520(arg0, arg1);
        if (var4 != null && var4.field2666 != null) {
            class70 var5 = new class70();
            var5.field832 = var4;
            var5.field836 = var4.field2666;
            class84.method2456(var5);
        }
        field1078 = arg3;
        field1076 = true;
        Statics.field277 = arg0;
        field1077 = arg1;
        Statics.field863 = arg2;
        method1(var4);
    }

    @ObfuscatedName("ar.hs(I)V")
    public static void method231() {
        if (!field1076) {
            return;
        }
        class217 var0 = class217.method1520(Statics.field277, field1077);
        if (var0 != null && var0.field2660 != null) {
            class70 var1 = new class70();
            var1.field832 = var0;
            var1.field836 = var0.field2660;
            class84.method2456(var1);
        }
        field1076 = false;
        method1(var0);
    }

    @ObfuscatedName("cl.hd(IIIILjava/lang/String;B)V")
    public static void method1627(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class217 var5 = class217.method1520(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2733 != null) {
            class70 var6 = new class70();
            var6.field832 = var5;
            var6.field835 = arg0;
            var6.field839 = arg4;
            var6.field836 = var5.field2733;
            class84.method2456(var6);
        }
        boolean var7 = true;
        if (var5.field2651 > 0) {
            var7 = method1399(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method1045(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field963.method3121(173);
            field963.method3055(arg1);
            field963.method2877(arg2);
            field963.method2877(arg3);
        }
        if (arg0 == 2) {
            field963.method3121(111);
            field963.method3055(arg1);
            field963.method2877(arg2);
            field963.method2877(arg3);
        }
        if (arg0 == 3) {
            field963.method3121(172);
            field963.method3055(arg1);
            field963.method2877(arg2);
            field963.method2877(arg3);
        }
        if (arg0 == 4) {
            field963.method3121(248);
            field963.method3055(arg1);
            field963.method2877(arg2);
            field963.method2877(arg3);
        }
        if (arg0 == 5) {
            field963.method3121(19);
            field963.method3055(arg1);
            field963.method2877(arg2);
            field963.method2877(arg3);
        }
        if (arg0 == 6) {
            field963.method3121(186);
            field963.method3055(arg1);
            field963.method2877(arg2);
            field963.method2877(arg3);
        }
        if (arg0 == 7) {
            field963.method3121(234);
            field963.method3055(arg1);
            field963.method2877(arg2);
            field963.method2877(arg3);
        }
        if (arg0 == 8) {
            field963.method3121(122);
            field963.method3055(arg1);
            field963.method2877(arg2);
            field963.method2877(arg3);
        }
        if (arg0 == 9) {
            field963.method3121(121);
            field963.method3055(arg1);
            field963.method2877(arg2);
            field963.method2877(arg3);
        }
        if (arg0 == 10) {
            field963.method3121(140);
            field963.method3055(arg1);
            field963.method2877(arg2);
            field963.method2877(arg3);
        }
    }

    @ObfuscatedName("hu.hz(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method3752(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method1693(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("ck.hw(Ljava/lang/String;Ljava/lang/String;IIIIZB)V")
    public static final void method1693(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field1059 || field1060 >= 500) {
            return;
        }
        field1065[field1060] = arg0;
        field1134[field1060] = arg1;
        field1063[field1060] = arg2;
        field1064[field1060] = arg3;
        field1061[field1060] = arg4;
        field1062[field1060] = arg5;
        if (arg6) {
            field1189 = field1060;
        }
        field1060++;
    }

    @ObfuscatedName("ci.hi(B)I")
    public static final int method1534() {
        if (field1060 <= 0) {
            return -1;
        } else if (field1069 && class51.field641[81] && field1189 != -1) {
            return field1189;
        } else {
            return field1060 - 1;
        }
    }

    @ObfuscatedName("fp.ht(I)V")
    public static void method2745() {
        for (int var0 = 0; var0 < field1060; var0++) {
            int var1 = field1063[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field1060 - 1) {
                    for (int var3 = var0; var3 < field1060 - 1; var3++) {
                        field1065[var3] = field1065[var3 + 1];
                        field1134[var3] = field1134[var3 + 1];
                        field1063[var3] = field1063[var3 + 1];
                        field1064[var3] = field1064[var3 + 1];
                        field1061[var3] = field1061[var3 + 1];
                        field1062[var3] = field1062[var3 + 1];
                    }
                }
                field1060--;
            }
        }
    }

    @ObfuscatedName("ar.hu(IIIIB)V")
    public static final void method228(int arg0, int arg1, int arg2, int arg3) {
        if (field1074 == 0 && !field1076) {
            method3752(class226.field2991, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class135.field1998; var6++) {
            int var7 = class135.field1999[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field621.method2489(Statics.field267, var8, var9, var7) >= 0) {
                    class256 var12 = class256.method4379(var11);
                    if (var12.field3437 != null) {
                        var12 = var12.method4154();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field1074 == 1) {
                        method3752(class226.field2984, field1075 + " " + class89.field1394 + " " + class89.method2665(65535) + var12.field3435, 1, var7, var8, var9);
                    } else if (!field1076) {
                        String[] var13 = var12.field3418;
                        if (field1185) {
                            var13 = method1401(var13);
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
                                    method3752(var13[var14], class89.method2665(65535) + var12.field3435, var15, var7, var8, var9);
                                }
                            }
                        }
                        method3752(class226.field2985, class89.method2665(65535) + var12.field3435, 1002, var12.field3422 << 14, var8, var9);
                    } else if ((Statics.field863 & 0x4) == 4) {
                        method3752(field1201, field1021 + " " + class89.field1394 + " " + class89.method2665(65535) + var12.field3435, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class87 var16 = field958[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field1380.field3544 == 1 && (var16.field1243 & 0x7F) == 64 && (var16.field1229 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field1138; var17++) {
                            class87 var18 = field958[field960[var17]];
                            if (var18 != null && var16 != var18 && var18.field1380.field3544 == 1 && var16.field1243 == var18.field1243 && var16.field1229 == var18.field1229) {
                                method3145(var18.field1380, field960[var17], var8, var9);
                            }
                        }
                        int var19 = class97.field1507;
                        int[] var20 = class97.field1508;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class75 var22 = field1041[var20[var21]];
                            if (var22 != null && var16.field1243 == var22.field1243 && var16.field1229 == var22.field1229) {
                                method3408(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method3145(var16.field1380, var11, var8, var9);
                }
                if (var10 == 0) {
                    class75 var23 = field1041[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field1243 & 0x7F) == 64 && (var23.field1229 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field1138; var24++) {
                            class87 var25 = field958[field960[var24]];
                            if (var25 != null && var25.field1380.field3544 == 1 && var23.field1243 == var25.field1243 && var23.field1229 == var25.field1229) {
                                method3145(var25.field1380, field960[var24], var8, var9);
                            }
                        }
                        int var26 = class97.field1507;
                        int[] var27 = class97.field1508;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class75 var29 = field1041[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field1243 == var29.field1243 && var23.field1229 == var29.field1229) {
                                method3408(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field1050 == var11) {
                        var4 = var7;
                    } else {
                        method3408(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class194 var30 = field1160[Statics.field267][var8][var9];
                    if (var30 != null) {
                        for (class95 var31 = (class95) var30.method3321(); var31 != null; var31 = (class95) var30.method3317()) {
                            class257 var32 = Statics.method461(var31.field1493);
                            if (field1074 == 1) {
                                method3752(class226.field2984, field1075 + " " + class89.field1394 + " " + class89.method2665(16748608) + var32.field3491, 16, var31.field1493, var8, var9);
                            } else if (!field1076) {
                                String[] var33 = var32.field3490;
                                if (field1185) {
                                    var33 = method1401(var33);
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
                                        method3752(var33[var34], class89.method2665(16748608) + var32.field3491, var35, var31.field1493, var8, var9);
                                    } else if (var34 == 2) {
                                        method3752(class226.field2835, class89.method2665(16748608) + var32.field3491, 20, var31.field1493, var8, var9);
                                    }
                                }
                                method3752(class226.field2985, class89.method2665(16748608) + var32.field3491, 1004, var31.field1493, var8, var9);
                            } else if ((Statics.field863 & 0x1) == 1) {
                                method3752(field1201, field1021 + " " + class89.field1394 + " " + class89.method2665(16748608) + var32.field3491, 17, var31.field1493, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class75 var38 = field1041[field1050];
            method3408(var38, field1050, var36, var37);
        }
    }

    @ObfuscatedName("fk.hf(Lit;IIII)V")
    public static final void method3145(class259 arg0, int arg1, int arg2, int arg3) {
        if (field1060 >= 400) {
            return;
        }
        if (arg0.field3557 != null) {
            arg0 = arg0.method4270();
        }
        if (arg0 == null || !arg0.field3560 || arg0.field3562 && field982 != arg1) {
            return;
        }
        String var4 = arg0.field3532;
        if (arg0.field3549 != 0) {
            int var6 = arg0.field3549;
            int var7 = Statics.field3209.field886;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class89.method2665(16711680);
            } else if (var8 < -6) {
                var9 = class89.method2665(16723968);
            } else if (var8 < -3) {
                var9 = class89.method2665(16740352);
            } else if (var8 < 0) {
                var9 = class89.method2665(16756736);
            } else if (var8 > 9) {
                var9 = class89.method2665(65280);
            } else if (var8 > 6) {
                var9 = class89.method2665(4259584);
            } else if (var8 > 3) {
                var9 = class89.method2665(8453888);
            } else if (var8 > 0) {
                var9 = class89.method2665(12648192);
            } else {
                var9 = class89.method2665(16776960);
            }
            var4 = var4 + var9 + " " + class89.field1396 + class226.field2990 + arg0.field3549 + class89.field1398;
        }
        if (arg0.field3562 && field1169) {
            method3752(class226.field2985, class89.method2665(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1074 == 1) {
            method3752(class226.field2984, field1075 + " " + class89.field1394 + " " + class89.method2665(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1076) {
            int var10 = arg0.field3562 && field1169 ? 2000 : 0;
            String[] var11 = arg0.field3550;
            if (field1185) {
                var11 = method1401(var11);
            }
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class226.field2986)) {
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
                        method3752(var11[var12], class89.method2665(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class226.field2986)) {
                        short var15 = 0;
                        if (field1051 != class92.field1423) {
                            if (field1051 == class92.field1420 || field1051 == class92.field1425 && arg0.field3549 > Statics.field3209.field886) {
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
                            method3752(var11[var14], class89.method2665(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3562 || !field1169) {
                method3752(class226.field2985, class89.method2665(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field863 & 0x2) == 2) {
            method3752(field1201, field1021 + " " + class89.field1394 + " " + class89.method2665(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ga.ig(Lbm;IIII)V")
    public static final void method3408(class75 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field3209 == arg0 || field1060 >= 400) {
            return;
        }
        String var9;
        if (arg0.field902 == 0) {
            String var4 = arg0.field885[0] + arg0.field895 + arg0.field885[1];
            int var5 = arg0.field886;
            int var6 = Statics.field3209.field886;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class89.method2665(16711680);
            } else if (var7 < -6) {
                var8 = class89.method2665(16723968);
            } else if (var7 < -3) {
                var8 = class89.method2665(16740352);
            } else if (var7 < 0) {
                var8 = class89.method2665(16756736);
            } else if (var7 > 9) {
                var8 = class89.method2665(65280);
            } else if (var7 > 6) {
                var8 = class89.method2665(4259584);
            } else if (var7 > 3) {
                var8 = class89.method2665(8453888);
            } else if (var7 > 0) {
                var8 = class89.method2665(12648192);
            } else {
                var8 = class89.method2665(16776960);
            }
            var9 = var4 + var8 + " " + class89.field1396 + class226.field2990 + arg0.field886 + class89.field1398 + arg0.field885[2];
        } else {
            var9 = arg0.field885[0] + arg0.field895 + arg0.field885[1] + " " + class89.field1396 + class226.field2897 + arg0.field902 + class89.field1398 + arg0.field885[2];
        }
        if (field1074 == 1) {
            method3752(class226.field2984, field1075 + " " + class89.field1394 + " " + class89.method2665(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field1076) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field1047[var10] != null) {
                    short var11 = 0;
                    if (field1047[var10].equalsIgnoreCase(class226.field2986)) {
                        if (field945 == class92.field1423) {
                            continue;
                        }
                        if (field945 == class92.field1420 || field945 == class92.field1425 && arg0.field886 > Statics.field3209.field886) {
                            var11 = 2000;
                        }
                        if (Statics.field3209.field882 != 0 && arg0.field882 != 0) {
                            if (Statics.field3209.field882 == arg0.field882) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field1048[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field991[var10] + var11;
                    method3752(field1047[var10], class89.method2665(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field863 & 0x8) == 8) {
            method3752(field1201, field1021 + " " + class89.field1394 + " " + class89.method2665(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field1060; var14++) {
            if (field1063[var14] == 23) {
                field1134[var14] = class89.method2665(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("n.in(IIIIIIIII)V")
    public static final void method51(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class217.method1895(arg0)) {
            Statics.field2832 = null;
            method107(Statics.field515[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2832 != null) {
                method107(Statics.field2832, -1412584499, arg1, arg2, arg3, arg4, Statics.field233, Statics.field671, arg7);
                Statics.field2832 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1096[var8] = true;
            }
        } else {
            field1096[arg7] = true;
        }
    }

    @ObfuscatedName("z.iv([Lhj;IIIIIIIIS)V")
    public static final void method107(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class282.method4602(arg2, arg3, arg4, arg5);
        class137.method2382();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class217 var10 = arg0[var9];
            if (var10 != null && (var10.field2652 == arg1 || arg1 == -1412584499 && field1049 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field923[field917] = var10.field2646 + arg6;
                    field1130[field917] = var10.field2662 + arg7;
                    field1126[field917] = var10.field2625;
                    field1132[field917] = var10.field2649;
                    var11 = ++field917 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2653 = var11;
                var10.field2724 = field929;
                if (!var10.field2632 || !method2808(var10)) {
                    if (var10.field2651 > 0) {
                        method957(var10);
                    }
                    int var12 = var10.field2646 + arg6;
                    int var13 = var10.field2662 + arg7;
                    int var14 = var10.field2717;
                    if (field1049 == var10) {
                        if (arg1 != -1412584499 && !var10.field2735) {
                            Statics.field2832 = arg0;
                            Statics.field233 = arg6;
                            Statics.field671 = arg7;
                            continue;
                        }
                        if (field1034 && field1099) {
                            int var15 = class60.field729;
                            int var16 = class60.field726;
                            int var17 = var15 - field1054;
                            int var18 = var16 - field1154;
                            if (var17 < field1100) {
                                var17 = field1100;
                            }
                            if (var10.field2625 + var17 > field1100 + field1095.field2625) {
                                var17 = field1100 + field1095.field2625 - var10.field2625;
                            }
                            if (var18 < field947) {
                                var18 = field947;
                            }
                            if (var10.field2649 + var18 > field947 + field1095.field2649) {
                                var18 = field947 + field1095.field2649 - var10.field2649;
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
                    if (var10.field2673 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2673 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2625 + var12;
                        int var26 = var10.field2649 + var13;
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
                        int var29 = var10.field2625 + var12;
                        int var30 = var10.field2649 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2632 || var19 < var21 && var20 < var22) {
                        if (var10.field2651 != 0) {
                            if (var10.field2651 == 1336) {
                                if (field935) {
                                    var13 += 15;
                                    Statics.field876.method4440("Fps:" + field697, var10.field2625 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field1066) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field1066) {
                                        var33 = 16711680;
                                    }
                                    Statics.field876.method4440("Mem:" + var32 + "k", var10.field2625 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2651 == 1337) {
                                field1070 = var12;
                                field1071 = var13;
                                int var36 = var10.field2625;
                                int var37 = var10.field2649;
                                field1025++;
                                method3624(class67.field811);
                                boolean var38 = false;
                                if (field1050 >= 0) {
                                    int var39 = class97.field1507;
                                    int[] var40 = class97.field1508;
                                    for (int var41 = 0; var41 < var39; var41++) {
                                        if (field1050 == var40[var41]) {
                                            var38 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var38) {
                                    method3624(class67.field807);
                                }
                                method987(true);
                                method3624(var38 ? class67.field809 : class67.field813);
                                method987(false);
                                for (class94 var42 = (class94) field1053.method3336(); var42 != null; var42 = (class94) field1053.method3324()) {
                                    if (Statics.field267 != var42.field1466 || field929 > var42.field1472) {
                                        var42.method3304();
                                    } else if (field929 >= var42.field1471) {
                                        if (var42.field1479 > 0) {
                                            class87 var43 = field958[var42.field1479 - 1];
                                            if (var43 != null && var43.field1243 >= 0 && var43.field1243 < 13312 && var43.field1229 >= 0 && var43.field1229 < 13312) {
                                                var42.method1595(var43.field1243, var43.field1229, method1372(var43.field1243, var43.field1229, var42.field1466) - var42.field1470, field929);
                                            }
                                        }
                                        if (var42.field1479 < 0) {
                                            int var44 = -var42.field1479 - 1;
                                            class75 var45;
                                            if (field1046 == var44) {
                                                var45 = Statics.field3209;
                                            } else {
                                                var45 = field1041[var44];
                                            }
                                            if (var45 != null && var45.field1243 >= 0 && var45.field1243 < 13312 && var45.field1229 >= 0 && var45.field1229 < 13312) {
                                                var42.method1595(var45.field1243, var45.field1229, method1372(var45.field1243, var45.field1229, var42.field1466) - var42.field1470, field929);
                                            }
                                        }
                                        var42.method1593(field997);
                                        Statics.field621.method2471(Statics.field267, (int) var42.field1477, (int) var42.field1478, (int) var42.field1484, 60, var42, var42.field1491, -1, false);
                                    }
                                }
                                for (class85 var46 = (class85) field1024.method3336(); var46 != null; var46 = (class85) field1024.method3324()) {
                                    if (Statics.field267 != var46.field1357 || var46.field1364) {
                                        var46.method3304();
                                    } else if (field929 >= var46.field1358) {
                                        var46.method1519(field997);
                                        if (var46.field1364) {
                                            var46.method3304();
                                        } else {
                                            Statics.field621.method2471(var46.field1357, var46.field1360, var46.field1361, var46.field1362, 60, var46, 0, -1, false);
                                        }
                                    }
                                }
                                method4546(var12, var13, var36, var37, true);
                                int var47 = field1092;
                                int var48 = field1183;
                                int var49 = field1113;
                                int var50 = field1108;
                                class282.method4602(var47, var48, var47 + var49, var48 + var50);
                                class137.method2382();
                                if (!field1167) {
                                    int var51 = field1004;
                                    if (field1013 / 256 > var51) {
                                        var51 = field1013 / 256;
                                    }
                                    if (field1085[4] && field1171[4] + 128 > var51) {
                                        var51 = field1171[4] + 128;
                                    }
                                    int var52 = field962 + field1005 & 0x7FF;
                                    int var53 = Statics.field325;
                                    int var54 = method1372(Statics.field3209.field1243, Statics.field3209.field1229, Statics.field267) - field1010;
                                    int var55 = Statics.field2039;
                                    int var56 = var51 * 3 + 600;
                                    int var57 = 2048 - var51 & 0x7FF;
                                    int var58 = 2048 - var52 & 0x7FF;
                                    int var59 = 0;
                                    int var60 = 0;
                                    int var61 = var56;
                                    if (var57 != 0) {
                                        int var62 = class137.field2034[var57];
                                        int var63 = class137.field2035[var57];
                                        int var64 = var60 * var63 - var56 * var62 >> 16;
                                        var61 = var60 * var62 + var56 * var63 >> 16;
                                        var60 = var64;
                                    }
                                    if (var58 != 0) {
                                        int var65 = class137.field2034[var58];
                                        int var66 = class137.field2035[var58];
                                        int var67 = var59 * var66 + var61 * var65 >> 16;
                                        var61 = var61 * var66 - var59 * var65 >> 16;
                                        var59 = var67;
                                    }
                                    Statics.field1918 = var53 - var59;
                                    Statics.field1758 = var54 - var60;
                                    Statics.field525 = var55 - var61;
                                    Statics.field875 = var51;
                                    Statics.field508 = var52;
                                }
                                int var68;
                                if (field1167) {
                                    int var69;
                                    if (Statics.field527.field1313) {
                                        var69 = Statics.field267;
                                    } else {
                                        int var70 = method1372(Statics.field1918, Statics.field525, Statics.field267);
                                        if (var70 - Statics.field1758 >= 800 || (class62.field759[Statics.field267][Statics.field1918 >> 7][Statics.field525 >> 7] & 0x4) == 0) {
                                            var69 = 3;
                                        } else {
                                            var69 = Statics.field267;
                                        }
                                    }
                                    var68 = var69;
                                } else {
                                    var68 = Statics.method88();
                                }
                                int var71 = Statics.field1918;
                                int var72 = Statics.field1758;
                                int var73 = Statics.field525;
                                int var74 = Statics.field875;
                                int var75 = Statics.field508;
                                for (int var76 = 0; var76 < 5; var76++) {
                                    if (field1085[var76]) {
                                        int var77 = (int) (Math.random() * (double) (field1037[var76] * 2 + 1) - (double) field1037[var76] + Math.sin((double) field1172[var76] / 100.0D * (double) field1017[var76]) * (double) field1171[var76]);
                                        if (var76 == 0) {
                                            Statics.field1918 += var77;
                                        }
                                        if (var76 == 1) {
                                            Statics.field1758 += var77;
                                        }
                                        if (var76 == 2) {
                                            Statics.field525 += var77;
                                        }
                                        if (var76 == 3) {
                                            Statics.field508 = Statics.field508 + var77 & 0x7FF;
                                        }
                                        if (var76 == 4) {
                                            Statics.field875 += var77;
                                            if (Statics.field875 < 128) {
                                                Statics.field875 = 128;
                                            }
                                            if (Statics.field875 > 383) {
                                                Statics.field875 = 383;
                                            }
                                        }
                                    }
                                }
                                int var78 = class60.field729;
                                int var79 = class60.field726;
                                if (class60.field737 != 0) {
                                    var78 = class60.field736;
                                    var79 = class60.field735;
                                }
                                if (var78 >= var47 && var78 < var47 + var49 && var79 >= var48 && var79 < var48 + var50) {
                                    class135.method2646(var78, var79);
                                } else {
                                    class135.field2000 = false;
                                    class135.field1998 = 0;
                                }
                                method3572();
                                class282.method4607(var47, var48, var49, var50, 0);
                                method3572();
                                int var80 = class137.field2021;
                                class137.field2021 = field1121;
                                Statics.field621.method2500(Statics.field1918, Statics.field1758, Statics.field525, Statics.field875, Statics.field508, var68);
                                class8.method632();
                                class137.field2021 = var80;
                                method3572();
                                Statics.field621.method2474();
                                Statics.method3879(var47, var48, var49, var50);
                                if (field996 == 2) {
                                    method988((field1186 - Statics.field414 << 7) + field1008, (field1115 - Statics.field2117 << 7) + field1198, field942 * 2);
                                    if (field1174 > -1 && field929 % 20 < 10) {
                                        Statics.field1464[0].method4698(field1174 + var47 - 12, field1184 + var48 - 28);
                                    }
                                }
                                ((class126) Statics.field2031).method2153(field997);
                                if (field1129 == 1) {
                                    Statics.field668[field1030 / 100].method4698(field1028 - 8, field1029 - 8);
                                }
                                if (field1129 == 2) {
                                    Statics.field668[field1030 / 100 + 4].method4698(field1028 - 8, field1029 - 8);
                                }
                                field1001 = 0;
                                int var81 = (Statics.field3209.field1243 >> 7) + Statics.field414;
                                int var82 = (Statics.field3209.field1229 >> 7) + Statics.field2117;
                                if (var81 >= 3053 && var81 <= 3156 && var82 >= 3056 && var82 <= 3136) {
                                    field1001 = 1;
                                }
                                if (var81 >= 3072 && var81 <= 3118 && var82 >= 9492 && var82 <= 9535) {
                                    field1001 = 1;
                                }
                                if (field1001 == 1 && var81 >= 3139 && var81 <= 3199 && var82 >= 3008 && var82 <= 3062) {
                                    field1001 = 0;
                                }
                                Statics.field1918 = var71;
                                Statics.field1758 = var72;
                                Statics.field525 = var73;
                                Statics.field875 = var74;
                                Statics.field508 = var75;
                                if (field928 && class239.method153(true, false) == 0) {
                                    field928 = false;
                                }
                                if (field928) {
                                    class282.method4607(var47, var48, var49, var50, 0);
                                    method196(class226.field2838, false);
                                }
                                field1096[var10.field2653] = true;
                                class282.method4602(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2651 == 1338) {
                                method33(var10, var12, var13, var11);
                                class282.method4602(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2651 == 1339) {
                                class211 var83 = var10.method3680(false);
                                if (var83 != null) {
                                    if (field1155 < 3) {
                                        Statics.field1788.method4708(var12, var13, var83.field2585, var83.field2587, 25, 25, field1005, 256, var83.field2582, var83.field2584);
                                    } else {
                                        class282.method4587(var12, var13, 0, var83.field2582, var83.field2584);
                                    }
                                }
                                class282.method4602(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2651 == 1400) {
                                Statics.field768.method5002(var12, var13, var10.field2625, var10.field2649, field929);
                            }
                            if (var10.field2651 == 1401) {
                                Statics.field768.method4840(var12, var13, var10.field2625, var10.field2649);
                            }
                        }
                        if (var10.field2673 == 0) {
                            if (!var10.field2632 && method2808(var10) && Statics.field1517 != var10) {
                                continue;
                            }
                            if (!var10.field2632) {
                                if (var10.field2655 > var10.field2657 - var10.field2649) {
                                    var10.field2655 = var10.field2657 - var10.field2649;
                                }
                                if (var10.field2655 < 0) {
                                    var10.field2655 = 0;
                                }
                            }
                            method107(arg0, var10.field2637, var19, var20, var21, var22, var12 - var10.field2654, var13 - var10.field2655, var11);
                            if (var10.field2757 != null) {
                                method107(var10.field2757, var10.field2637, var19, var20, var21, var22, var12 - var10.field2654, var13 - var10.field2655, var11);
                            }
                            class69 var84 = (class69) field1082.method3268((long) var10.field2637);
                            if (var84 != null) {
                                method51(var84.field824, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class282.method4602(arg2, arg3, arg4, arg5);
                            class137.method2382();
                        }
                        if (field1135 || field1003[var11] || field1195 > 1) {
                            if (var10.field2673 == 0 && !var10.field2632 && var10.field2657 > var10.field2649) {
                                int var85 = var10.field2625 + var12;
                                int var86 = var10.field2655;
                                int var87 = var10.field2649;
                                int var88 = var10.field2657;
                                Statics.field781[0].method4666(var85, var13);
                                Statics.field781[1].method4666(var85, var13 + var87 - 16);
                                class282.method4607(var85, var13 + 16, 16, var87 - 32, field998);
                                int var89 = (var87 - 32) * var87 / var88;
                                if (var89 < 8) {
                                    var89 = 8;
                                }
                                int var90 = (var87 - 32 - var89) * var86 / (var88 - var87);
                                class282.method4607(var85, var13 + 16 + var90, 16, var89, field999);
                                class282.method4583(var85, var13 + 16 + var90, var89, field1128);
                                class282.method4583(var85 + 1, var13 + 16 + var90, var89, field1128);
                                class282.method4609(var85, var13 + 16 + var90, 16, field1128);
                                class282.method4609(var85, var13 + 17 + var90, 16, field1128);
                                class282.method4583(var85 + 15, var13 + 16 + var90, var89, field1000);
                                class282.method4583(var85 + 14, var13 + 17 + var90, var89 - 1, field1000);
                                class282.method4609(var85, var13 + 15 + var90 + var89, 16, field1000);
                                class282.method4609(var85 + 1, var13 + 14 + var90 + var89, 15, field1000);
                            }
                            if (var10.field2673 != 1) {
                                if (var10.field2673 == 2) {
                                    int var91 = 0;
                                    for (int var92 = 0; var92 < var10.field2645; var92++) {
                                        for (int var93 = 0; var93 < var10.field2644; var93++) {
                                            int var94 = (var10.field2761 + 32) * var93 + var12;
                                            int var95 = (var10.field2700 + 32) * var92 + var13;
                                            if (var91 < 20) {
                                                var94 += var10.field2701[var91];
                                                var95 += var10.field2699[var91];
                                            }
                                            if (var10.field2751[var91] > 0) {
                                                boolean var96 = false;
                                                boolean var97 = false;
                                                int var98 = var10.field2751[var91] - 1;
                                                if (var94 + 32 > arg2 && var94 < arg4 && var95 + 32 > arg3 && var95 < arg5 || Statics.field423 == var10 && field1187 == var91) {
                                                    class286 var99;
                                                    if (field1074 == 1 && Statics.field237 == var91 && Statics.field609 == var10.field2637) {
                                                        var99 = class257.method3102(var98, var10.field2741[var91], 2, 0, 2, false);
                                                    } else {
                                                        var99 = class257.method3102(var98, var10.field2741[var91], 1, 3153952, 2, false);
                                                    }
                                                    if (var99 == null) {
                                                        method1(var10);
                                                    } else if (Statics.field423 == var10 && field1187 == var91) {
                                                        int var100 = class60.field729 - field1145;
                                                        int var101 = class60.field726 - field1036;
                                                        if (var100 < 5 && var100 > -5) {
                                                            var100 = 0;
                                                        }
                                                        if (var101 < 5 && var101 > -5) {
                                                            var101 = 0;
                                                        }
                                                        if (field1039 < 5) {
                                                            var100 = 0;
                                                            var101 = 0;
                                                        }
                                                        var99.method4772(var94 + var100, var95 + var101, 128);
                                                        if (arg1 != -1) {
                                                            class217 var102 = arg0[arg1 & 0xFFFF];
                                                            if (var95 + var101 < class282.field3751 && var102.field2655 > 0) {
                                                                int var103 = field997 * (class282.field3751 - var95 - var101) / 3;
                                                                if (var103 > field997 * 10) {
                                                                    var103 = field997 * 10;
                                                                }
                                                                if (var103 > var102.field2655) {
                                                                    var103 = var102.field2655;
                                                                }
                                                                var102.field2655 -= var103;
                                                                field1036 += var103;
                                                                method1(var102);
                                                            }
                                                            if (var95 + var101 + 32 > class282.field3752 && var102.field2655 < var102.field2657 - var102.field2649) {
                                                                int var104 = field997 * (var95 + var101 + 32 - class282.field3752) / 3;
                                                                if (var104 > field997 * 10) {
                                                                    var104 = field997 * 10;
                                                                }
                                                                if (var104 > var102.field2657 - var102.field2649 - var102.field2655) {
                                                                    var104 = var102.field2657 - var102.field2649 - var102.field2655;
                                                                }
                                                                var102.field2655 += var104;
                                                                field1036 -= var104;
                                                                method1(var102);
                                                            }
                                                        }
                                                    } else if (Statics.field797 == var10 && field1173 == var91) {
                                                        var99.method4772(var94, var95, 128);
                                                    } else {
                                                        var99.method4698(var94, var95);
                                                    }
                                                }
                                            } else if (var10.field2703 != null && var91 < 20) {
                                                class286 var105 = var10.method3679(var91);
                                                if (var105 != null) {
                                                    var105.method4698(var94, var95);
                                                } else if (class217.field2631) {
                                                    method1(var10);
                                                }
                                            }
                                            var91++;
                                        }
                                    }
                                } else if (var10.field2673 == 3) {
                                    int var106;
                                    if (method10(var10)) {
                                        var106 = var10.field2710;
                                        if (Statics.field1517 == var10 && var10.field2661 != 0) {
                                            var106 = var10.field2661;
                                        }
                                    } else {
                                        var106 = var10.field2658;
                                        if (Statics.field1517 == var10 && var10.field2627 != 0) {
                                            var106 = var10.field2627;
                                        }
                                    }
                                    if (var10.field2630) {
                                        switch(var10.field2663.field3763) {
                                            case 1:
                                                class282.method4573(var12, var13, var10.field2625, var10.field2649, var10.field2658, var10.field2710, 256 - (var10.field2717 & 0xFF), 256 - (var10.field2688 & 0xFF));
                                                break;
                                            case 2:
                                                class282.method4630(var12, var13, var10.field2625, var10.field2649, var10.field2658, var10.field2710, 256 - (var10.field2717 & 0xFF), 256 - (var10.field2688 & 0xFF));
                                                break;
                                            case 3:
                                                class282.method4575(var12, var13, var10.field2625, var10.field2649, var10.field2658, var10.field2710, 256 - (var10.field2717 & 0xFF), 256 - (var10.field2688 & 0xFF));
                                                break;
                                            case 4:
                                                class282.method4576(var12, var13, var10.field2625, var10.field2649, var10.field2658, var10.field2710, 256 - (var10.field2717 & 0xFF), 256 - (var10.field2688 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class282.method4607(var12, var13, var10.field2625, var10.field2649, var106);
                                                } else {
                                                    class282.method4571(var12, var13, var10.field2625, var10.field2649, var106, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class282.method4589(var12, var13, var10.field2625, var10.field2649, var106);
                                    } else {
                                        class282.method4654(var12, var13, var10.field2625, var10.field2649, var106, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2673 == 4) {
                                    class264 var107 = var10.method3664();
                                    if (var107 != null) {
                                        String var108 = var10.field2707;
                                        int var109;
                                        if (method10(var10)) {
                                            var109 = var10.field2710;
                                            if (Statics.field1517 == var10 && var10.field2661 != 0) {
                                                var109 = var10.field2661;
                                            }
                                            if (var10.field2694.length() > 0) {
                                                var108 = var10.field2694;
                                            }
                                        } else {
                                            var109 = var10.field2658;
                                            if (Statics.field1517 == var10 && var10.field2627 != 0) {
                                                var109 = var10.field2627;
                                            }
                                        }
                                        if (var10.field2632 && var10.field2753 != -1) {
                                            class257 var110 = Statics.method461(var10.field2753);
                                            var108 = var110.field3491;
                                            if (var108 == null) {
                                                var108 = "null";
                                            }
                                            if ((var110.field3501 == 1 || var10.field2754 != 1) && var10.field2754 != -1) {
                                                var108 = class89.method2665(16748608) + var108 + class89.field1400 + " " + 'x' + method1015(var10.field2754);
                                            }
                                        }
                                        if (field954 == var10) {
                                            class226 var10000 = (class226) null;
                                            var108 = class226.field2992;
                                            var109 = var10.field2658;
                                        }
                                        if (!var10.field2632) {
                                            var108 = method1694(var108, var10);
                                        }
                                        var107.method4435(var108, var12, var13, var10.field2625, var10.field2649, var109, var10.field2698 ? 0 : -1, var10.field2696, var10.field2697, var10.field2695);
                                    } else if (class217.field2631) {
                                        method1(var10);
                                    }
                                } else if (var10.field2673 == 5) {
                                    if (var10.field2632) {
                                        class286 var112;
                                        if (var10.field2753 == -1) {
                                            var112 = var10.method3704(false);
                                        } else {
                                            var112 = class257.method3102(var10.field2753, var10.field2754, var10.field2672, var10.field2647, var10.field2691, false);
                                        }
                                        if (var112 != null) {
                                            int var113 = var112.field3776;
                                            int var114 = var112.field3780;
                                            if (var10.field2765) {
                                                class282.method4565(var12, var13, var10.field2625 + var12, var10.field2649 + var13);
                                                int var115 = (var10.field2625 + (var113 - 1)) / var113;
                                                int var116 = (var10.field2649 + (var114 - 1)) / var114;
                                                for (int var117 = 0; var117 < var115; var117++) {
                                                    for (int var118 = 0; var118 < var116; var118++) {
                                                        if (var10.field2679 != 0) {
                                                            var112.method4710(var113 / 2 + var113 * var117 + var12, var114 / 2 + var114 * var118 + var13, var10.field2679, 4096);
                                                        } else if (var14 == 0) {
                                                            var112.method4698(var113 * var117 + var12, var114 * var118 + var13);
                                                        } else {
                                                            var112.method4772(var113 * var117 + var12, var114 * var118 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class282.method4602(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var119 = var10.field2625 * 4096 / var113;
                                                if (var10.field2679 != 0) {
                                                    var112.method4710(var10.field2625 / 2 + var12, var10.field2649 / 2 + var13, var10.field2679, var119);
                                                } else if (var14 != 0) {
                                                    var112.method4712(var12, var13, var10.field2625, var10.field2649, 256 - (var14 & 0xFF));
                                                } else if (var10.field2625 == var113 && var10.field2649 == var114) {
                                                    var112.method4698(var12, var13);
                                                } else {
                                                    var112.method4754(var12, var13, var10.field2625, var10.field2649);
                                                }
                                            }
                                        } else if (class217.field2631) {
                                            method1(var10);
                                        }
                                    } else {
                                        class286 var111 = var10.method3704(method10(var10));
                                        if (var111 != null) {
                                            var111.method4698(var12, var13);
                                        } else if (class217.field2631) {
                                            method1(var10);
                                        }
                                    }
                                } else if (var10.field2673 == 6) {
                                    boolean var120 = method10(var10);
                                    int var121;
                                    if (var120) {
                                        var121 = var10.field2681;
                                    } else {
                                        var121 = var10.field2680;
                                    }
                                    class134 var122 = null;
                                    int var123 = 0;
                                    if (var10.field2753 != -1) {
                                        class257 var124 = Statics.method461(var10.field2753);
                                        if (var124 != null) {
                                            class257 var125 = var124.method4219(var10.field2754);
                                            var122 = var125.method4207(1);
                                            if (var122 == null) {
                                                method1(var10);
                                            } else {
                                                var122.method2281();
                                                var123 = var122.field2121 / 2;
                                            }
                                        }
                                    } else if (var10.field2693 == 5) {
                                        if (var10.field2702 == 0) {
                                            var122 = field1193.method3616((class261) null, -1, (class261) null, -1);
                                        } else {
                                            var122 = Statics.field3209.method1018();
                                        }
                                    } else if (var121 == -1) {
                                        var122 = var10.method3665((class261) null, -1, var120, Statics.field3209.field881);
                                        if (var122 == null && class217.field2631) {
                                            method1(var10);
                                        }
                                    } else {
                                        class261 var126 = class261.method2746(var121);
                                        var122 = var10.method3665(var126, var10.field2706, var120, Statics.field3209.field881);
                                        if (var122 == null && class217.field2631) {
                                            method1(var10);
                                        }
                                    }
                                    class137.method2418(var10.field2625 / 2 + var12, var10.field2649 / 2 + var13);
                                    int var127 = var10.field2687 * class137.field2034[var10.field2684] >> 16;
                                    int var128 = var10.field2687 * class137.field2035[var10.field2684] >> 16;
                                    if (var122 != null) {
                                        if (var10.field2632) {
                                            var122.method2281();
                                            if (var10.field2690) {
                                                var122.method2294(0, var10.field2685, var10.field2686, var10.field2684, var10.field2676, var10.field2683 + var123 + var127, var10.field2683 + var128, var10.field2687);
                                            } else {
                                                var122.method2293(0, var10.field2685, var10.field2686, var10.field2684, var10.field2676, var10.field2683 + var123 + var127, var10.field2683 + var128);
                                            }
                                        } else {
                                            var122.method2293(0, var10.field2685, 0, var10.field2684, 0, var127, var128);
                                        }
                                    }
                                    class137.method2414();
                                } else {
                                    if (var10.field2673 == 7) {
                                        class264 var129 = var10.method3664();
                                        if (var129 == null) {
                                            if (class217.field2631) {
                                                method1(var10);
                                            }
                                            continue;
                                        }
                                        int var130 = 0;
                                        for (int var131 = 0; var131 < var10.field2645; var131++) {
                                            for (int var132 = 0; var132 < var10.field2644; var132++) {
                                                if (var10.field2751[var130] > 0) {
                                                    class257 var133 = Statics.method461(var10.field2751[var130] - 1);
                                                    String var134;
                                                    if (var133.field3501 != 1 && var10.field2741[var130] == 1) {
                                                        var134 = class89.method2665(16748608) + var133.field3491 + class89.field1400;
                                                    } else {
                                                        var134 = class89.method2665(16748608) + var133.field3491 + class89.field1400 + " " + 'x' + method1015(var10.field2741[var130]);
                                                    }
                                                    int var135 = (var10.field2761 + 115) * var132 + var12;
                                                    int var136 = (var10.field2700 + 12) * var131 + var13;
                                                    if (var10.field2696 == 0) {
                                                        var129.method4401(var134, var135, var136, var10.field2658, var10.field2698 ? 0 : -1);
                                                    } else if (var10.field2696 == 1) {
                                                        var129.method4432(var134, var10.field2625 / 2 + var135, var136, var10.field2658, var10.field2698 ? 0 : -1);
                                                    } else {
                                                        var129.method4440(var134, var10.field2625 + var135 - 1, var136, var10.field2658, var10.field2698 ? 0 : -1);
                                                    }
                                                }
                                                var130++;
                                            }
                                        }
                                    }
                                    if (var10.field2673 == 8 && Statics.field226 == var10 && field1073 == field1072) {
                                        int var137 = 0;
                                        int var138 = 0;
                                        class264 var139 = Statics.field876;
                                        String var140 = var10.field2707;
                                        String var141 = method1694(var140, var10);
                                        while (var141.length() > 0) {
                                            int var142 = var141.indexOf(class89.field1399);
                                            String var143;
                                            if (var142 == -1) {
                                                var143 = var141;
                                                var141 = "";
                                            } else {
                                                var143 = var141.substring(0, var142);
                                                var141 = var141.substring(var142 + 4);
                                            }
                                            int var144 = var139.method4446(var143);
                                            if (var144 > var137) {
                                                var137 = var144;
                                            }
                                            var138 += var139.field3627 + 1;
                                        }
                                        var137 += 6;
                                        var138 += 7;
                                        int var145 = var10.field2625 + var12 - 5 - var137;
                                        int var146 = var10.field2649 + var13 + 5;
                                        if (var145 < var12 + 5) {
                                            var145 = var12 + 5;
                                        }
                                        if (var137 + var145 > arg4) {
                                            var145 = arg4 - var137;
                                        }
                                        if (var138 + var146 > arg5) {
                                            var146 = arg5 - var138;
                                        }
                                        class282.method4607(var145, var146, var137, var138, 16777120);
                                        class282.method4589(var145, var146, var137, var138, 0);
                                        String var147 = var10.field2707;
                                        int var148 = var139.field3627 + var146 + 2;
                                        String var149 = method1694(var147, var10);
                                        while (var149.length() > 0) {
                                            int var150 = var149.indexOf(class89.field1399);
                                            String var151;
                                            if (var150 == -1) {
                                                var151 = var149;
                                                var149 = "";
                                            } else {
                                                var151 = var149.substring(0, var150);
                                                var149 = var149.substring(var150 + 4);
                                            }
                                            var139.method4401(var151, var145 + 3, var148, 0, -1);
                                            var148 += var139.field3627 + 1;
                                        }
                                    }
                                    if (var10.field2673 == 9) {
                                        int var152;
                                        int var153;
                                        int var154;
                                        int var155;
                                        if (var10.field2667) {
                                            var152 = var12;
                                            var153 = var10.field2649 + var13;
                                            var154 = var10.field2625 + var12;
                                            var155 = var13;
                                        } else {
                                            var152 = var12;
                                            var153 = var13;
                                            var154 = var10.field2625 + var12;
                                            var155 = var10.field2649 + var13;
                                        }
                                        if (var10.field2635 == 1) {
                                            class282.method4585(var152, var153, var154, var155, var10.field2658);
                                        } else {
                                            method188(var152, var153, var154, var155, var10.field2658, var10.field2635);
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

    @ObfuscatedName("ad.ik(IIIIIII)V")
    public static final void method188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class282.field3749;
        int var18 = arg1 - class282.field3751;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class137.method2407(var19, var20, var21);
        class137.method2392(var23, var24, var25, var19, var20, var21, arg4);
        class137.method2407(var19, var21, var22);
        class137.method2392(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("ck.iw(Ljava/lang/String;Lhj;I)Ljava/lang/String;")
    public static String method1694(String arg0, class217 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method3161(arg1, var2 - 1);
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
                if (Statics.field722 != null) {
                    var8 = class271.method1048(Statics.field722.field2216);
                    if (Statics.field722.field2214 != null) {
                        var8 = (String) Statics.field722.field2214;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ba.ip(II)Ljava/lang/String;")
    public static final String method1015(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class89.field1395 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class89.method2665(65408) + var1.substring(0, var1.length() - 8) + class226.field2995 + " " + class89.field1396 + var1 + class89.field1398 + class89.field1400;
        } else if (var1.length() > 6) {
            return " " + class89.method2665(16777215) + var1.substring(0, var1.length() - 4) + class226.field2997 + " " + class89.field1396 + var1 + class89.field1398 + class89.field1400;
        } else {
            return " " + class89.method2665(16776960) + var1 + class89.field1400;
        }
    }

    @ObfuscatedName("client.ie(ZI)V")
    public final void method1067(boolean arg0) {
        method226(field1081, Statics.field413, Statics.field1916, arg0);
    }

    @ObfuscatedName("client.iq(Lhj;I)V")
    public void method1172(class217 arg0) {
        class217 var2 = arg0.field2652 == -1 ? null : class217.method577(arg0.field2652);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field413;
            var4 = Statics.field1916;
        } else {
            var3 = var2.field2625;
            var4 = var2.field2649;
        }
        method115(arg0, var3, var4, false);
        method462(arg0, var3, var4);
    }

    @ObfuscatedName("y.ij([Lhj;Lhj;ZI)V")
    public static void method108(class217[] arg0, class217 arg1, boolean arg2) {
        int var3 = arg1.field2656 == 0 ? arg1.field2625 : arg1.field2656;
        int var4 = arg1.field2657 == 0 ? arg1.field2649 : arg1.field2657;
        method989(arg0, arg1.field2637, var3, var4, arg2);
        if (arg1.field2757 != null) {
            method989(arg1.field2757, arg1.field2637, var3, var4, arg2);
        }
        class69 var5 = (class69) field1082.method3268((long) arg1.field2637);
        if (var5 != null) {
            method226(var5.field824, var3, var4, arg2);
        }
        if (arg1.field2651 == 1337) {
        }
    }

    @ObfuscatedName("ar.ib(IIIZI)V")
    public static final void method226(int arg0, int arg1, int arg2, boolean arg3) {
        if (class217.method1895(arg0)) {
            method989(Statics.field515[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("br.ia([Lhj;IIIZI)V")
    public static void method989(class217[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class217 var6 = arg0[var5];
            if (var6 != null && var6.field2652 == arg1) {
                method115(var6, arg2, arg3, arg4);
                method462(var6, arg2, arg3);
                if (var6.field2654 > var6.field2656 - var6.field2625) {
                    var6.field2654 = var6.field2656 - var6.field2625;
                }
                if (var6.field2654 < 0) {
                    var6.field2654 = 0;
                }
                if (var6.field2655 > var6.field2657 - var6.field2649) {
                    var6.field2655 = var6.field2657 - var6.field2649;
                }
                if (var6.field2655 < 0) {
                    var6.field2655 = 0;
                }
                if (var6.field2673 == 0) {
                    method108(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("y.ic(Lhj;IIZB)V")
    public static void method115(class217 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2625;
        int var5 = arg0.field2649;
        if (arg0.field2640 == 0) {
            arg0.field2625 = arg0.field2644;
        } else if (arg0.field2640 == 1) {
            arg0.field2625 = arg1 - arg0.field2644;
        } else if (arg0.field2640 == 2) {
            arg0.field2625 = arg0.field2644 * arg1 >> 14;
        }
        if (arg0.field2641 == 0) {
            arg0.field2649 = arg0.field2645;
        } else if (arg0.field2641 == 1) {
            arg0.field2649 = arg2 - arg0.field2645;
        } else if (arg0.field2641 == 2) {
            arg0.field2649 = arg0.field2645 * arg2 >> 14;
        }
        if (arg0.field2640 == 4) {
            arg0.field2625 = arg0.field2650 * arg0.field2649 / arg0.field2648;
        }
        if (arg0.field2641 == 4) {
            arg0.field2649 = arg0.field2648 * arg0.field2625 / arg0.field2650;
        }
        if (field1091 && arg0.field2673 == 0) {
            if (arg0.field2649 < 5 && arg0.field2625 < 5) {
                arg0.field2649 = 5;
                arg0.field2625 = 5;
            } else {
                if (arg0.field2649 <= 0) {
                    arg0.field2649 = 5;
                }
                if (arg0.field2625 <= 0) {
                    arg0.field2625 = 5;
                }
            }
        }
        if (arg0.field2651 == 1337) {
            field1089 = arg0;
        }
        if (arg3 && arg0.field2742 != null && (arg0.field2625 != var4 || arg0.field2649 != var5)) {
            class70 var6 = new class70();
            var6.field832 = arg0;
            var6.field836 = arg0.field2742;
            field1110.method3318(var6);
        }
    }

    @ObfuscatedName("ak.io(Lhj;IIB)V")
    public static void method462(class217 arg0, int arg1, int arg2) {
        if (arg0.field2714 == 0) {
            arg0.field2646 = arg0.field2642;
        } else if (arg0.field2714 == 1) {
            arg0.field2646 = (arg1 - arg0.field2625) / 2 + arg0.field2642;
        } else if (arg0.field2714 == 2) {
            arg0.field2646 = arg1 - arg0.field2625 - arg0.field2642;
        } else if (arg0.field2714 == 3) {
            arg0.field2646 = arg0.field2642 * arg1 >> 14;
        } else if (arg0.field2714 == 4) {
            arg0.field2646 = (arg0.field2642 * arg1 >> 14) + (arg1 - arg0.field2625) / 2;
        } else {
            arg0.field2646 = arg1 - arg0.field2625 - (arg0.field2642 * arg1 >> 14);
        }
        if (arg0.field2639 == 0) {
            arg0.field2662 = arg0.field2643;
        } else if (arg0.field2639 == 1) {
            arg0.field2662 = (arg2 - arg0.field2649) / 2 + arg0.field2643;
        } else if (arg0.field2639 == 2) {
            arg0.field2662 = arg2 - arg0.field2649 - arg0.field2643;
        } else if (arg0.field2639 == 3) {
            arg0.field2662 = arg0.field2643 * arg2 >> 14;
        } else if (arg0.field2639 == 4) {
            arg0.field2662 = (arg0.field2643 * arg2 >> 14) + (arg2 - arg0.field2649) / 2;
        } else {
            arg0.field2662 = arg2 - arg0.field2649 - (arg0.field2643 * arg2 >> 14);
        }
        if (!field1091 || arg0.field2673 != 0) {
            return;
        }
        if (arg0.field2646 < 0) {
            arg0.field2646 = 0;
        } else if (arg0.field2646 + arg0.field2625 > arg1) {
            arg0.field2646 = arg1 - arg0.field2625;
        }
        if (arg0.field2662 < 0) {
            arg0.field2662 = 0;
        } else if (arg0.field2662 + arg0.field2649 > arg2) {
            arg0.field2662 = arg2 - arg0.field2649;
        }
    }

    @ObfuscatedName("ad.ix(Lhj;IIIIIII)V")
    public static final void method189(class217 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field966) {
            field1180 = 32;
        } else {
            field1180 = 0;
        }
        field966 = false;
        if (class60.field728 == 1 || !Statics.field264 && class60.field728 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2655 -= 4;
                method1(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2655 += 4;
                method1(arg0);
            } else if (arg5 >= arg1 - field1180 && arg5 < field1180 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2655 = (arg4 - arg3) * var8 / var9;
                method1(arg0);
                field966 = true;
            }
        }
        if (field1119 == 0) {
            return;
        }
        int var10 = arg0.field2625;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2655 += field1119 * 45;
            method1(arg0);
        }
    }

    @ObfuscatedName("d.iu(Lhj;B)Z")
    public static final boolean method10(class217 arg0) {
        if (arg0.field2746 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2746.length; var1++) {
            int var2 = method3161(arg0, var1);
            int var3 = arg0.field2747[var1];
            if (arg0.field2746[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2746[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2746[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fn.iz(Lhj;II)I")
    public static final int method3161(class217 arg0, int arg1) {
        if (arg0.field2745 == null || arg1 >= arg0.field2745.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2745[arg1];
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
                    var7 = field1055[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field946[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field932[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class217 var11 = class217.method577(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!Statics.method461(var12).field3489 || field1031)) {
                        for (int var13 = 0; var13 < var11.field2751.length; var13++) {
                            if (var12 + 1 == var11.field2751[var13]) {
                                var7 += var11.field2741[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class212.field2589[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class223.field2822[field946[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class212.field2589[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field3209.field886;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class223.field2821[var14]) {
                            var7 += field946[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class217 var17 = class217.method577(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!Statics.method461(var18).field3489 || field1031)) {
                        for (int var19 = 0; var19 < var17.field2751.length; var19++) {
                            if (var18 + 1 == var17.field2751[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1086;
                }
                if (var6 == 12) {
                    var7 = field1087;
                }
                if (var6 == 13) {
                    int var20 = class212.field2589[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class212.method56(var22);
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
                    var7 = (Statics.field3209.field1243 >> 7) + Statics.field414;
                }
                if (var6 == 19) {
                    var7 = (Statics.field3209.field1229 >> 7) + Statics.field2117;
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

    @ObfuscatedName("h.im(Lhj;III)V")
    public static final void method34(class217 arg0, int arg1, int arg2) {
        if (arg0.field2636 == 1) {
            method3752(arg0.field2750, "", 24, 0, 0, arg0.field2637);
        }
        if (arg0.field2636 == 2 && !field1076) {
            String var3 = method118(arg0);
            if (var3 != null) {
                method3752(var3, class89.method2665(65280) + arg0.field2749, 25, 0, -1, arg0.field2637);
            }
        }
        if (arg0.field2636 == 3) {
            method3752(class226.field2993, "", 26, 0, 0, arg0.field2637);
        }
        if (arg0.field2636 == 4) {
            method3752(arg0.field2750, "", 28, 0, 0, arg0.field2637);
        }
        if (arg0.field2636 == 5) {
            method3752(arg0.field2750, "", 29, 0, 0, arg0.field2637);
        }
        if (arg0.field2636 == 6 && field954 == null) {
            method3752(arg0.field2750, "", 30, 0, -1, arg0.field2637);
        }
        if (arg0.field2673 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2649; var5++) {
                for (int var6 = 0; var6 < arg0.field2625; var6++) {
                    int var7 = (arg0.field2761 + 32) * var6;
                    int var8 = (arg0.field2700 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2701[var4];
                        var8 += arg0.field2699[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field1177 = var4;
                        Statics.field3210 = arg0;
                        if (arg0.field2751[var4] > 0) {
                            class257 var9 = Statics.method461(arg0.field2751[var4] - 1);
                            if (field1074 == 1 && class218.method2719(method1045(arg0))) {
                                if (Statics.field609 != arg0.field2637 || Statics.field237 != var4) {
                                    method3752(class226.field2984, field1075 + " " + class89.field1394 + " " + class89.method2665(16748608) + var9.field3491, 31, var9.field3474, var4, arg0.field2637);
                                }
                            } else if (!field1076 || !class218.method2719(method1045(arg0))) {
                                String[] var10 = var9.field3510;
                                if (field1185) {
                                    var10 = method1401(var10);
                                }
                                int var11 = var9.method4199();
                                if (class218.method2719(method1045(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        boolean var13 = var11 == var12;
                                        if (var10 != null && var10[var12] != null) {
                                            byte var14;
                                            if (var12 == 3) {
                                                var14 = 36;
                                            } else {
                                                var14 = 37;
                                            }
                                            method1693(var10[var12], class89.method2665(16748608) + var9.field3491, var14, var9.field3474, var4, arg0.field2637, var13);
                                        } else if (var12 == 4) {
                                            method1693(class226.field2921, class89.method2665(16748608) + var9.field3491, 37, var9.field3474, var4, arg0.field2637, var13);
                                        }
                                    }
                                }
                                int var15 = method1045(arg0);
                                boolean var16 = (var15 >> 31 & 0x1) != 0;
                                if (var16) {
                                    method3752(class226.field2984, class89.method2665(16748608) + var9.field3491, 38, var9.field3474, var4, arg0.field2637);
                                }
                                class218 var10000 = (class218) null;
                                if (class218.method2719(method1045(arg0)) && var10 != null) {
                                    for (int var17 = 2; var17 >= 0; var17--) {
                                        boolean var18 = var11 == var17;
                                        if (var10[var17] != null) {
                                            byte var19 = 0;
                                            if (var17 == 0) {
                                                var19 = 33;
                                            }
                                            if (var17 == 1) {
                                                var19 = 34;
                                            }
                                            if (var17 == 2) {
                                                var19 = 35;
                                            }
                                            method1693(var10[var17], class89.method2665(16748608) + var9.field3491, var19, var9.field3474, var4, arg0.field2637, var18);
                                        }
                                    }
                                }
                                String[] var20 = arg0.field2704;
                                if (field1185) {
                                    var20 = method1401(var20);
                                }
                                if (var20 != null) {
                                    for (int var21 = 4; var21 >= 0; var21--) {
                                        if (var20[var21] != null) {
                                            byte var22 = 0;
                                            if (var21 == 0) {
                                                var22 = 39;
                                            }
                                            if (var21 == 1) {
                                                var22 = 40;
                                            }
                                            if (var21 == 2) {
                                                var22 = 41;
                                            }
                                            if (var21 == 3) {
                                                var22 = 42;
                                            }
                                            if (var21 == 4) {
                                                var22 = 43;
                                            }
                                            method3752(var20[var21], class89.method2665(16748608) + var9.field3491, var22, var9.field3474, var4, arg0.field2637);
                                        }
                                    }
                                }
                                method3752(class226.field2985, class89.method2665(16748608) + var9.field3491, 1005, var9.field3474, var4, arg0.field2637);
                            } else if ((Statics.field863 & 0x10) == 16) {
                                method3752(field1201, field1021 + " " + class89.field1394 + " " + class89.method2665(16748608) + var9.field3491, 32, var9.field3474, var4, arg0.field2637);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2632) {
            return;
        }
        if (!field1076) {
            for (int var23 = 9; var23 >= 5; var23--) {
                String var24 = method1560(arg0, var23);
                if (var24 != null) {
                    method3752(var24, arg0.field2671, 1007, var23 + 1, arg0.field2759, arg0.field2637);
                }
            }
            String var25 = method118(arg0);
            if (var25 != null) {
                method3752(var25, arg0.field2671, 25, 0, arg0.field2759, arg0.field2637);
            }
            for (int var26 = 4; var26 >= 0; var26--) {
                String var27 = method1560(arg0, var26);
                if (var27 != null) {
                    method3752(var27, arg0.field2671, 57, var26 + 1, arg0.field2759, arg0.field2637);
                }
            }
            if (class218.method3092(method1045(arg0))) {
                method3752(class226.field2840, "", 30, 0, arg0.field2759, arg0.field2637);
            }
        } else if (class218.method961(method1045(arg0)) && (Statics.field863 & 0x20) == 32) {
            method3752(field1201, field1021 + " " + class89.field1394 + " " + arg0.field2671, 58, 0, arg0.field2759, arg0.field2637);
        }
    }

    @ObfuscatedName("fe.ih([Lhj;IIIIIIIB)V")
    public static final void method2801(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class217 var9 = arg0[var8];
            if (var9 != null && (!var9.field2632 || var9.field2673 == 0 || var9.field2665 || method1045(var9) != 0 || field1095 == var9 || var9.field2651 == 1338) && var9.field2652 == arg1 && (!var9.field2632 || !method2808(var9))) {
                int var10 = var9.field2646 + arg6;
                int var11 = var9.field2662 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2673 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2673 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2625 + var10;
                    int var19 = var9.field2649 + var11;
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
                    int var22 = var9.field2625 + var10;
                    int var23 = var9.field2649 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1049 == var9) {
                    field1102 = true;
                    field1103 = var10;
                    field1104 = var11;
                }
                if (!var9.field2632 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field729;
                    int var25 = class60.field726;
                    if (class60.field737 != 0) {
                        var24 = class60.field736;
                        var25 = class60.field735;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2651 == 1337) {
                        if (!field928 && !field1059 && var26) {
                            method228(var24, var25, var12, var13);
                        }
                    } else if (var9.field2651 == 1338) {
                        method1384(var9, var10, var11);
                    } else {
                        if (var9.field2651 == 1400) {
                            Statics.field768.method4825(class60.field729, class60.field726, var26, var10, var11, var9.field2625, var9.field2649);
                        }
                        if (!field1059 && var26) {
                            if (var9.field2651 == 1400) {
                                Statics.field768.method4975(var10, var11, var9.field2625, var9.field2649, var24, var25);
                            } else {
                                method34(var9, var24 - var10, var25 - var11);
                            }
                        }
                        if (var9.field2673 == 0) {
                            if (!var9.field2632 && method2808(var9) && Statics.field1517 != var9) {
                                continue;
                            }
                            method2801(arg0, var9.field2637, var12, var13, var14, var15, var10 - var9.field2654, var11 - var9.field2655);
                            if (var9.field2757 != null) {
                                method2801(var9.field2757, var9.field2637, var12, var13, var14, var15, var10 - var9.field2654, var11 - var9.field2655);
                            }
                            class69 var27 = (class69) field1082.method3268((long) var9.field2637);
                            if (var27 != null) {
                                if (var27.field823 == 0 && class60.field729 >= var12 && class60.field726 >= var13 && class60.field729 < var14 && class60.field726 < var15 && !field1059 && !field1091) {
                                    for (class70 var28 = (class70) field1110.method3336(); var28 != null; var28 = (class70) field1110.method3324()) {
                                        if (var28.field831) {
                                            var28.method3304();
                                            var28.field832.field2756 = false;
                                        }
                                    }
                                    if (Statics.field795 == 0) {
                                        field1049 = null;
                                        field1095 = null;
                                    }
                                    if (!field1059) {
                                        method1878();
                                    }
                                }
                                int var29 = var27.field824;
                                if (class217.method1895(var29)) {
                                    method2801(Statics.field515[var29], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2632) {
                            if (var9.field2766) {
                                if (class60.field729 >= var12 && class60.field726 >= var13 && class60.field729 < var14 && class60.field726 < var15) {
                                    for (class70 var30 = (class70) field1110.method3336(); var30 != null; var30 = (class70) field1110.method3324()) {
                                        if (var30.field831) {
                                            var30.method3304();
                                            var30.field832.field2756 = false;
                                        }
                                    }
                                    if (Statics.field795 == 0) {
                                        field1049 = null;
                                        field1095 = null;
                                    }
                                    if (!field1059) {
                                        field1065[0] = class226.field3073;
                                        field1134[0] = "";
                                        field1063[0] = 1006;
                                        field1060 = 1;
                                    }
                                }
                            } else if (var9.field2767 && class60.field729 >= var12 && class60.field726 >= var13 && class60.field729 < var14 && class60.field726 < var15) {
                                for (class70 var31 = (class70) field1110.method3336(); var31 != null; var31 = (class70) field1110.method3324()) {
                                    if (var31.field831 && var31.field832.field2734 == var31.field836) {
                                        var31.method3304();
                                    }
                                }
                            }
                            boolean var32;
                            if (class60.field729 >= var12 && class60.field726 >= var13 && class60.field729 < var14 && class60.field726 < var15) {
                                var32 = true;
                            } else {
                                var32 = false;
                            }
                            boolean var33 = false;
                            if ((class60.field728 == 1 || !Statics.field264 && class60.field728 == 4) && var32) {
                                var33 = true;
                            }
                            boolean var34 = false;
                            if ((class60.field737 == 1 || !Statics.field264 && class60.field737 == 4) && class60.field736 >= var12 && class60.field735 >= var13 && class60.field736 < var14 && class60.field735 < var15) {
                                var34 = true;
                            }
                            if (var34) {
                                method2664(var9, class60.field736 - var10, class60.field735 - var11);
                            }
                            if (var9.field2651 == 1400) {
                                Statics.field768.method4878(class60.field729, class60.field726, var32 & var33);
                            }
                            if (field1049 != null && field1049 != var9 && var32) {
                                int var35 = method1045(var9);
                                boolean var36 = (var35 >> 20 & 0x1) != 0;
                                if (var36) {
                                    field1098 = var9;
                                }
                            }
                            if (field1095 == var9) {
                                field1099 = true;
                                field1100 = var10;
                                field947 = var11;
                            }
                            if (var9.field2665) {
                                if (var32 && field1119 != 0 && var9.field2734 != null) {
                                    class70 var37 = new class70();
                                    var37.field831 = true;
                                    var37.field832 = var9;
                                    var37.field834 = field1119;
                                    var37.field836 = var9.field2734;
                                    field1110.method3318(var37);
                                }
                                if (field1049 != null || Statics.field423 != null || field1059) {
                                    var34 = false;
                                    var33 = false;
                                    var32 = false;
                                }
                                if (!var9.field2670 && var34) {
                                    var9.field2670 = true;
                                    if (var9.field2755 != null) {
                                        class70 var38 = new class70();
                                        var38.field831 = true;
                                        var38.field832 = var9;
                                        var38.field833 = class60.field736 - var10;
                                        var38.field834 = class60.field735 - var11;
                                        var38.field836 = var9.field2755;
                                        field1110.method3318(var38);
                                    }
                                }
                                if (var9.field2670 && var33 && var9.field2716 != null) {
                                    class70 var39 = new class70();
                                    var39.field831 = true;
                                    var39.field832 = var9;
                                    var39.field833 = class60.field729 - var10;
                                    var39.field834 = class60.field726 - var11;
                                    var39.field836 = var9.field2716;
                                    field1110.method3318(var39);
                                }
                                if (var9.field2670 && !var33) {
                                    var9.field2670 = false;
                                    if (var9.field2622 != null) {
                                        class70 var40 = new class70();
                                        var40.field831 = true;
                                        var40.field832 = var9;
                                        var40.field833 = class60.field729 - var10;
                                        var40.field834 = class60.field726 - var11;
                                        var40.field836 = var9.field2622;
                                        field1122.method3318(var40);
                                    }
                                }
                                if (var33 && var9.field2718 != null) {
                                    class70 var41 = new class70();
                                    var41.field831 = true;
                                    var41.field832 = var9;
                                    var41.field833 = class60.field729 - var10;
                                    var41.field834 = class60.field726 - var11;
                                    var41.field836 = var9.field2718;
                                    field1110.method3318(var41);
                                }
                                if (!var9.field2756 && var32) {
                                    var9.field2756 = true;
                                    if (var9.field2719 != null) {
                                        class70 var42 = new class70();
                                        var42.field831 = true;
                                        var42.field832 = var9;
                                        var42.field833 = class60.field729 - var10;
                                        var42.field834 = class60.field726 - var11;
                                        var42.field836 = var9.field2719;
                                        field1110.method3318(var42);
                                    }
                                }
                                if (var9.field2756 && var32 && var9.field2720 != null) {
                                    class70 var43 = new class70();
                                    var43.field831 = true;
                                    var43.field832 = var9;
                                    var43.field833 = class60.field729 - var10;
                                    var43.field834 = class60.field726 - var11;
                                    var43.field836 = var9.field2720;
                                    field1110.method3318(var43);
                                }
                                if (var9.field2756 && !var32) {
                                    var9.field2756 = false;
                                    if (var9.field2721 != null) {
                                        class70 var44 = new class70();
                                        var44.field831 = true;
                                        var44.field832 = var9;
                                        var44.field833 = class60.field729 - var10;
                                        var44.field834 = class60.field726 - var11;
                                        var44.field836 = var9.field2721;
                                        field1122.method3318(var44);
                                    }
                                }
                                if (var9.field2732 != null) {
                                    class70 var45 = new class70();
                                    var45.field832 = var9;
                                    var45.field836 = var9.field2732;
                                    field973.method3318(var45);
                                }
                                if (var9.field2726 != null && field1023 > var9.field2664) {
                                    if (var9.field2709 == null || field1023 - var9.field2664 > 32) {
                                        class70 var50 = new class70();
                                        var50.field832 = var9;
                                        var50.field836 = var9.field2726;
                                        field1110.method3318(var50);
                                    } else {
                                        label503: for (int var46 = var9.field2664; var46 < field1023; var46++) {
                                            int var47 = field1107[var46 & 0x1F];
                                            for (int var48 = 0; var48 < var9.field2709.length; var48++) {
                                                if (var9.field2709[var48] == var47) {
                                                    class70 var49 = new class70();
                                                    var49.field832 = var9;
                                                    var49.field836 = var9.field2726;
                                                    field1110.method3318(var49);
                                                    break label503;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2664 = field1023;
                                }
                                if (var9.field2728 != null && field972 > var9.field2711) {
                                    if (var9.field2729 == null || field972 - var9.field2711 > 32) {
                                        class70 var55 = new class70();
                                        var55.field832 = var9;
                                        var55.field836 = var9.field2728;
                                        field1110.method3318(var55);
                                    } else {
                                        label479: for (int var51 = var9.field2711; var51 < field972; var51++) {
                                            int var52 = field1109[var51 & 0x1F];
                                            for (int var53 = 0; var53 < var9.field2729.length; var53++) {
                                                if (var9.field2729[var53] == var52) {
                                                    class70 var54 = new class70();
                                                    var54.field832 = var9;
                                                    var54.field836 = var9.field2728;
                                                    field1110.method3318(var54);
                                                    break label479;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2711 = field972;
                                }
                                if (var9.field2730 != null && field1112 > var9.field2763) {
                                    if (var9.field2731 == null || field1112 - var9.field2763 > 32) {
                                        class70 var60 = new class70();
                                        var60.field832 = var9;
                                        var60.field836 = var9.field2730;
                                        field1110.method3318(var60);
                                    } else {
                                        label455: for (int var56 = var9.field2763; var56 < field1112; var56++) {
                                            int var57 = field1111[var56 & 0x1F];
                                            for (int var58 = 0; var58 < var9.field2731.length; var58++) {
                                                if (var9.field2731[var58] == var57) {
                                                    class70 var59 = new class70();
                                                    var59.field832 = var9;
                                                    var59.field836 = var9.field2730;
                                                    field1110.method3318(var59);
                                                    break label455;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2763 = field1112;
                                }
                                if (field1159 > var9.field2760 && var9.field2758 != null) {
                                    class70 var61 = new class70();
                                    var61.field832 = var9;
                                    var61.field836 = var9.field2758;
                                    field1110.method3318(var61);
                                }
                                if (field1114 > var9.field2760 && var9.field2737 != null) {
                                    class70 var62 = new class70();
                                    var62.field832 = var9;
                                    var62.field836 = var9.field2737;
                                    field1110.method3318(var62);
                                }
                                if (field1097 > var9.field2760 && var9.field2738 != null) {
                                    class70 var63 = new class70();
                                    var63.field832 = var9;
                                    var63.field836 = var9.field2738;
                                    field1110.method3318(var63);
                                }
                                if (field1116 > var9.field2760 && var9.field2743 != null) {
                                    class70 var64 = new class70();
                                    var64.field832 = var9;
                                    var64.field836 = var9.field2743;
                                    field1110.method3318(var64);
                                }
                                if (field1117 > var9.field2760 && var9.field2744 != null) {
                                    class70 var65 = new class70();
                                    var65.field832 = var9;
                                    var65.field836 = var9.field2744;
                                    field1110.method3318(var65);
                                }
                                if (field1118 > var9.field2760 && var9.field2633 != null) {
                                    class70 var66 = new class70();
                                    var66.field832 = var9;
                                    var66.field836 = var9.field2633;
                                    field1110.method3318(var66);
                                }
                                var9.field2760 = field1106;
                                if (var9.field2736 != null) {
                                    for (int var67 = 0; var67 < field1142; var67++) {
                                        class70 var68 = new class70();
                                        var68.field832 = var9;
                                        var68.field837 = field1144[var67];
                                        var68.field838 = field940[var67];
                                        var68.field836 = var9.field2736;
                                        field1110.method3318(var68);
                                    }
                                }
                            }
                        }
                        if (!var9.field2632 && field1049 == null && Statics.field423 == null && !field1059) {
                            if ((var9.field2748 >= 0 || var9.field2627 != 0) && class60.field729 >= var12 && class60.field726 >= var13 && class60.field729 < var14 && class60.field726 < var15) {
                                if (var9.field2748 >= 0) {
                                    Statics.field1517 = arg0[var9.field2748];
                                } else {
                                    Statics.field1517 = var9;
                                }
                            }
                            if (var9.field2673 == 8 && class60.field729 >= var12 && class60.field726 >= var13 && class60.field729 < var14 && class60.field726 < var15) {
                                Statics.field226 = var9;
                            }
                            if (var9.field2657 > var9.field2649) {
                                method189(var9, var9.field2625 + var10, var11, var9.field2649, var9.field2657, class60.field729, class60.field726);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ej.if(Lhj;III)V")
    public static final void method2664(class217 arg0, int arg1, int arg2) {
        if (field1049 != null || field1059 || arg0 == null || method38(arg0) == null) {
            return;
        }
        field1049 = arg0;
        field1095 = method38(arg0);
        field1054 = arg1;
        field1154 = arg2;
        Statics.field795 = 0;
        field1034 = false;
        int var3 = method1534();
        if (var3 == -1) {
            return;
        }
        Statics.field2285 = new class90();
        Statics.field2285.field1408 = field1061[var3];
        Statics.field2285.field1414 = field1062[var3];
        Statics.field2285.field1406 = field1063[var3];
        Statics.field2285.field1407 = field1064[var3];
        Statics.field2285.field1415 = field1065[var3];
    }

    @ObfuscatedName("client.id(I)V")
    public final void method1069() {
        method1(field1049);
        Statics.field795++;
        if (field1102 && field1099) {
            int var1 = class60.field729;
            int var2 = class60.field726;
            int var3 = var1 - field1054;
            int var4 = var2 - field1154;
            if (var3 < field1100) {
                var3 = field1100;
            }
            if (field1049.field2625 + var3 > field1100 + field1095.field2625) {
                var3 = field1100 + field1095.field2625 - field1049.field2625;
            }
            if (var4 < field947) {
                var4 = field947;
            }
            if (field1049.field2649 + var4 > field947 + field1095.field2649) {
                var4 = field947 + field1095.field2649 - field1049.field2649;
            }
            int var5 = var3 - field1103;
            int var6 = var4 - field1104;
            int var7 = field1049.field2752;
            if (Statics.field795 > field1049.field2715 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1034 = true;
            }
            int var8 = field1095.field2654 + (var3 - field1100);
            int var9 = field1095.field2655 + (var4 - field947);
            if (field1049.field2722 != null && field1034) {
                class70 var10 = new class70();
                var10.field832 = field1049;
                var10.field833 = var8;
                var10.field834 = var9;
                var10.field836 = field1049.field2722;
                class84.method2456(var10);
            }
            if (class60.field728 == 0) {
                if (field1034) {
                    if (field1049.field2723 != null) {
                        class70 var11 = new class70();
                        var11.field832 = field1049;
                        var11.field833 = var8;
                        var11.field834 = var9;
                        var11.field840 = field1098;
                        var11.field836 = field1049.field2723;
                        class84.method2456(var11);
                    }
                    if (field1098 != null && method3159(field1049) != null) {
                        field963.method3121(83);
                        field963.method2934(field1049.field2637);
                        field963.method3055(field1098.field2637);
                        field963.method2877(field1049.field2759);
                        field963.method2877(field1098.field2759);
                        field963.method2877(field1049.field2753);
                        field963.method2916(field1098.field2753);
                    }
                } else {
                    label115: {
                        int var12 = method1534();
                        if (field1060 > 2) {
                            label112: {
                                label80: {
                                    if (field1058 == 1) {
                                        boolean var13;
                                        if (field1060 <= 0) {
                                            var13 = false;
                                        } else if (field1069 && class51.field641[81] && field1189 != -1) {
                                            var13 = true;
                                        } else {
                                            var13 = false;
                                        }
                                        if (!var13) {
                                            break label80;
                                        }
                                    }
                                    if (!method27(var12)) {
                                        break label112;
                                    }
                                }
                                this.method1066(field1103 + field1054, field1154 + field1104);
                                break label115;
                            }
                        }
                        if (field1060 > 0) {
                            method190(field1103 + field1054, field1154 + field1104);
                        }
                    }
                }
                field1049 = null;
            }
        } else if (Statics.field795 > 1) {
            field1049 = null;
        }
    }

    @ObfuscatedName("ad.is(III)V")
    public static void method190(int arg0, int arg1) {
        method3739(Statics.field2285, arg0, arg1);
        Statics.field2285 = null;
    }

    @ObfuscatedName("o.ii(Lhj;I)V")
    public static void method1(class217 arg0) {
        if (field1125 == arg0.field2724) {
            field1096[arg0.field2653] = true;
        }
    }

    @ObfuscatedName("dy.iy(I)V")
    public static void method1908() {
        for (class69 var0 = (class69) field1082.method3262(); var0 != null; var0 = (class69) field1082.method3263()) {
            int var1 = var0.field824;
            if (class217.method1895(var1)) {
                boolean var2 = true;
                class217[] var3 = Statics.field515[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2632;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2454;
                    class217 var6 = class217.method577(var5);
                    if (var6 != null) {
                        method1(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.it(Lhj;B)Lhj;")
    public static class217 method38(class217 arg0) {
        class217 var1 = arg0;
        int var2 = class218.method4262(method1045(arg0));
        class217 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class217.method577(var1.field2652);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class217 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2708;
        }
        return var5;
    }

    @ObfuscatedName("cy.ir([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1401(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("fq.ju(II)V")
    public static final void method2718(int arg0) {
        if (!class217.method1895(arg0)) {
            return;
        }
        class217[] var1 = Statics.field515[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3 != null) {
                var3.field2706 = 0;
                var3.field2659 = 0;
            }
        }
    }

    @ObfuscatedName("bs.jn([Lhj;II)V")
    public static final void method712(class217[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class217 var3 = arg0[var2];
            if (var3 != null && var3.field2652 == arg1 && (!var3.field2632 || !method2808(var3))) {
                if (var3.field2673 == 0) {
                    if (!var3.field2632 && method2808(var3) && Statics.field1517 != var3) {
                        continue;
                    }
                    method712(arg0, var3.field2637);
                    if (var3.field2757 != null) {
                        method712(var3.field2757, var3.field2637);
                    }
                    class69 var4 = (class69) field1082.method3268((long) var3.field2637);
                    if (var4 != null) {
                        int var5 = var4.field824;
                        if (class217.method1895(var5)) {
                            method712(Statics.field515[var5], -1);
                        }
                    }
                }
                if (var3.field2673 == 6) {
                    if (var3.field2680 != -1 || var3.field2681 != -1) {
                        boolean var6 = method10(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2681;
                        } else {
                            var7 = var3.field2680;
                        }
                        if (var7 != -1) {
                            class261 var8 = class261.method2746(var7);
                            var3.field2659 += field997;
                            while (var3.field2659 > var8.field3588[var3.field2706]) {
                                var3.field2659 -= var8.field3588[var3.field2706];
                                var3.field2706++;
                                if (var3.field2706 >= var8.field3587.length) {
                                    var3.field2706 -= var8.field3591;
                                    if (var3.field2706 < 0 || var3.field2706 >= var8.field3587.length) {
                                        var3.field2706 = 0;
                                    }
                                }
                                method1(var3);
                            }
                        }
                    }
                    if (var3.field2689 != 0 && !var3.field2632) {
                        int var9 = var3.field2689 >> 16;
                        int var10 = var3.field2689 << 16 >> 16;
                        int var11 = field997 * var9;
                        int var12 = field997 * var10;
                        var3.field2684 = var3.field2684 + var11 & 0x7FF;
                        var3.field2685 = var3.field2685 + var12 & 0x7FF;
                        method1(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ew.jy(II)V")
    public static final void method2647(int arg0) {
        method1908();
        class83.method35();
        int var1 = class242.method2262(arg0).field3262;
        if (var1 == 0) {
            return;
        }
        int var2 = class212.field2589[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class137.method2387(0.9D);
                ((class126) Statics.field2031).method2154(0.9D);
            }
            if (var2 == 2) {
                class137.method2387(0.8D);
                ((class126) Statics.field2031).method2154(0.8D);
            }
            if (var2 == 3) {
                class137.method2387(0.7D);
                ((class126) Statics.field2031).method2154(0.7D);
            }
            if (var2 == 4) {
                class137.method2387(0.6D);
                ((class126) Statics.field2031).method2154(0.6D);
            }
            class257.method2809();
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
            if (field1042 != var3) {
                if (field1042 == 0 && field1157 != -1) {
                    class204.method4508(Statics.field316, field1157, 0, var3, false);
                    field1158 = false;
                } else if (var3 == 0) {
                    Statics.field2486.method3457();
                    class204.field2487 = 1;
                    Statics.field2488 = null;
                    field1158 = false;
                } else {
                    class204.method979(var3);
                }
                field1042 = var3;
            }
        }
        if (var1 == 4) {
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
        if (var1 == 5) {
            field1058 = var2;
        }
        if (var1 == 6) {
            field1131 = var2;
        }
        if (var1 == 9) {
            field1084 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field1002 = 127;
            }
            if (var2 == 1) {
                field1002 = 96;
            }
            if (var2 == 2) {
                field1002 = 64;
            }
            if (var2 == 3) {
                field1002 = 32;
            }
            if (var2 == 4) {
                field1002 = 0;
            }
        }
        if (var1 == 17) {
            field982 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class92[] var4 = new class92[] { class92.field1420, class92.field1422, class92.field1423, class92.field1425 };
            field945 = (class92) class169.method999(var4, var2);
            if (field945 == null) {
                field945 = class92.field1425;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field1050 = -1;
            } else {
                field1050 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class92[] var5 = new class92[] { class92.field1420, class92.field1422, class92.field1423, class92.field1425 };
        field1051 = (class92) class169.method999(var5, var2);
        if (field1051 == null) {
            field1051 = class92.field1425;
        }
    }

    @ObfuscatedName("bb.jf(Lhj;I)V")
    public static final void method957(class217 arg0) {
        int var1 = arg0.field2651;
        if (var1 == 324) {
            if (field1194 == -1) {
                field1194 = arg0.field2668;
                field1176 = arg0.field2713;
            }
            if (field1193.field2610) {
                arg0.field2668 = field1194;
            } else {
                arg0.field2668 = field1176;
            }
        } else if (var1 == 325) {
            if (field1194 == -1) {
                field1194 = arg0.field2668;
                field1176 = arg0.field2713;
            }
            if (field1193.field2610) {
                arg0.field2668 = field1176;
            } else {
                arg0.field2668 = field1194;
            }
        } else if (var1 == 327) {
            arg0.field2684 = 150;
            arg0.field2685 = (int) (Math.sin((double) field929 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2693 = 5;
            arg0.field2702 = 0;
        } else if (var1 == 328) {
            arg0.field2684 = 150;
            arg0.field2685 = (int) (Math.sin((double) field929 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2693 = 5;
            arg0.field2702 = 1;
        }
    }

    @ObfuscatedName("fx.jr(I)V")
    public static final void method3096() {
        field963.method3121(190);
        for (class69 var0 = (class69) field1082.method3262(); var0 != null; var0 = (class69) field1082.method3263()) {
            if (var0.field823 == 0 || var0.field823 == 3) {
                method551(var0, true);
            }
        }
        if (field954 != null) {
            method1(field954);
            field954 = null;
        }
    }

    @ObfuscatedName("ac.jp(Lbr;ZI)V")
    public static final void method551(class69 arg0, boolean arg1) {
        int var2 = arg0.field824;
        int var3 = (int) arg0.field2454;
        arg0.method3304();
        if (arg1) {
            class217.method578(var2);
        }
        method151(var2);
        class217 var4 = class217.method577(var3);
        if (var4 != null) {
            method1(var4);
        }
        method2745();
        if (field1081 != -1) {
            int var5 = field1081;
            if (class217.method1895(var5)) {
                Statics.method629(Statics.field515[var5], 1);
            }
        }
    }

    @ObfuscatedName("cy.jb(Lhj;S)Z")
    public static final boolean method1399(class217 arg0) {
        int var1 = arg0.field2651;
        if (var1 == 205) {
            field1090 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1193.method3643(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1193.method3612(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1193.method3613(false);
        }
        if (var1 == 325) {
            field1193.method3613(true);
        }
        if (var1 == 326) {
            field963.method3121(133);
            field1193.method3614(field963);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("h.jx(Lhj;IIII)V")
    public static final void method33(class217 arg0, int arg1, int arg2, int arg3) {
        method3572();
        class211 var4 = arg0.method3680(false);
        if (var4 == null) {
            return;
        }
        class282.method4602(arg1, arg2, var4.field2585 + arg1, var4.field2587 + arg2);
        if (field1155 == 2 || field1155 == 5) {
            class282.method4587(arg1, arg2, 0, var4.field2582, var4.field2584);
        } else {
            int var5 = field992 + field1005 & 0x7FF;
            int var6 = Statics.field3209.field1243 / 32 + 48;
            int var7 = 464 - Statics.field3209.field1229 / 32;
            Statics.field3215.method4708(arg1, arg2, var4.field2585, var4.field2587, var6, var7, var5, field994 + 256, var4.field2582, var4.field2584);
            for (int var8 = 0; var8 < field1181; var8++) {
                int var9 = field1150[var8] * 4 + 2 - Statics.field3209.field1243 / 32;
                int var10 = field1151[var8] * 4 + 2 - Statics.field3209.field1229 / 32;
                method2663(arg1, arg2, var9, var10, field1152[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class194 var13 = field1160[Statics.field267][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field3209.field1243 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field3209.field1229 / 32;
                        method2663(arg1, arg2, var14, var15, Statics.field581[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field1138; var16++) {
                class87 var17 = field958[field960[var16]];
                if (var17 != null && var17.method1031()) {
                    class259 var18 = var17.field1380;
                    if (var18 != null && var18.field3557 != null) {
                        var18 = var18.method4270();
                    }
                    if (var18 != null && var18.field3540 && var18.field3560) {
                        int var19 = var17.field1243 / 32 - Statics.field3209.field1243 / 32;
                        int var20 = var17.field1229 / 32 - Statics.field3209.field1229 / 32;
                        method2663(arg1, arg2, var19, var20, Statics.field581[1], var4);
                    }
                }
            }
            int var21 = class97.field1507;
            int[] var22 = class97.field1508;
            for (int var23 = 0; var23 < var21; var23++) {
                class75 var24 = field1041[var22[var23]];
                if (var24 != null && var24.method1031() && !var24.field901 && Statics.field3209 != var24) {
                    int var25 = var24.field1243 / 32 - Statics.field3209.field1243 / 32;
                    int var26 = var24.field1229 / 32 - Statics.field3209.field1229 / 32;
                    boolean var27 = false;
                    if (method3649(var24.field895, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field315; var29++) {
                        if (var24.field895.equals(Statics.field1316[var29].field916)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field3209.field882 != 0 && var24.field882 != 0 && Statics.field3209.field882 == var24.field882) {
                        var30 = true;
                    }
                    if (var27) {
                        method2663(arg1, arg2, var25, var26, Statics.field581[3], var4);
                    } else if (var30) {
                        method2663(arg1, arg2, var25, var26, Statics.field581[4], var4);
                    } else if (var28) {
                        method2663(arg1, arg2, var25, var26, Statics.field581[5], var4);
                    } else {
                        method2663(arg1, arg2, var25, var26, Statics.field581[2], var4);
                    }
                }
            }
            if (field996 != 0 && field929 % 20 < 10) {
                if (field996 == 1 && field938 >= 0 && field938 < field958.length) {
                    class87 var31 = field958[field938];
                    if (var31 != null) {
                        int var32 = var31.field1243 / 32 - Statics.field3209.field1243 / 32;
                        int var33 = var31.field1229 / 32 - Statics.field3209.field1229 / 32;
                        method2716(arg1, arg2, var32, var33, Statics.field473[1], var4);
                    }
                }
                if (field996 == 2) {
                    int var34 = field1186 * 4 - Statics.field414 * 4 + 2 - Statics.field3209.field1243 / 32;
                    int var35 = field1115 * 4 - Statics.field2117 * 4 + 2 - Statics.field3209.field1229 / 32;
                    method2716(arg1, arg2, var34, var35, Statics.field473[1], var4);
                }
                if (field996 == 10 && field939 >= 0 && field939 < field1041.length) {
                    class75 var36 = field1041[field939];
                    if (var36 != null) {
                        int var37 = var36.field1243 / 32 - Statics.field3209.field1243 / 32;
                        int var38 = var36.field1229 / 32 - Statics.field3209.field1229 / 32;
                        method2716(arg1, arg2, var37, var38, Statics.field473[1], var4);
                    }
                }
            }
            if (field1153 != 0) {
                int var39 = field1153 * 4 + 2 - Statics.field3209.field1243 / 32;
                int var40 = field1161 * 4 + 2 - Statics.field3209.field1229 / 32;
                method2663(arg1, arg2, var39, var40, Statics.field473[0], var4);
            }
            if (!Statics.field3209.field901) {
                class282.method4607(var4.field2585 / 2 + arg1 - 1, var4.field2587 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field944[arg3] = true;
    }

    @ObfuscatedName("fi.ji(IIIILje;Lhv;I)V")
    public static final void method2716(int arg0, int arg1, int arg2, int arg3, class286 arg4, class211 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2663(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field992 + field1005 & 0x7FF;
        int var8 = class137.field2034[var7];
        int var9 = class137.field2035[var7];
        int var10 = var8 * 256 / (field994 + 256);
        int var11 = var9 * 256 / (field994 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field871.method4709(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("em.jt(IIIILje;Lhv;I)V")
    public static final void method2663(int arg0, int arg1, int arg2, int arg3, class286 arg4, class211 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field992 + field1005 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class137.field2034[var6];
        int var9 = class137.field2035[var6];
        int var10 = var8 * 256 / (field994 + 256);
        int var11 = var9 * 256 / (field994 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method4707(arg5.field2585 / 2 + var12 - arg4.field3776 / 2, arg5.field2587 / 2 - var13 - arg4.field3780 / 2, arg0, arg1, arg5.field2585, arg5.field2587, arg5.field2582, arg5.field2584);
        } else {
            arg4.method4698(arg5.field2585 / 2 + arg0 + var12 - arg4.field3776 / 2, arg5.field2587 / 2 + arg1 - var13 - arg4.field3780 / 2);
        }
    }

    @ObfuscatedName("hn.jd(Ljava/lang/String;ZB)Z")
    public static boolean method3649(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class268.method4330(arg0, Statics.field529);
        for (int var3 = 0; var3 < field1067; var3++) {
            if (var2.equalsIgnoreCase(class268.method4330(field1120[var3].field801, Statics.field529)) && (!arg1 || field1120[var3].field796 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class268.method4330(Statics.field3209.field895, Statics.field529))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ef.jj(Ljava/lang/String;I)Z")
    public static boolean method2662(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class268.method4330(arg0, Statics.field529);
        for (int var2 = 0; var2 < field1191; var2++) {
            class71 var3 = field1192[var2];
            if (var1.equalsIgnoreCase(class268.method4330(var3.field843, Statics.field529))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class268.method4330(var3.field842, Statics.field529))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("io.jw(Ljava/lang/String;B)V")
    public static final void method3992(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class268.method4330(arg0, Statics.field529);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1067; var2++) {
            class66 var3 = field1120[var2];
            String var4 = var3.field801;
            String var5 = class268.method4330(var4, Statics.field529);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field1067--;
                for (int var7 = var2; var7 < field1067; var7++) {
                    field1120[var7] = field1120[var7 + 1];
                }
                field1114 = field1106;
                field963.method3121(9);
                field963.method2876(class174.method2750(arg0));
                field963.method2936(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("ac.jl(Ljava/lang/String;I)V")
    public static final void method555(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class268.method4330(arg0, Statics.field529);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1191; var2++) {
            class71 var3 = field1192[var2];
            String var4 = var3.field843;
            String var5 = class268.method4330(var4, Statics.field529);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field1191--;
                for (int var7 = var2; var7 < field1191; var7++) {
                    field1192[var7] = field1192[var7 + 1];
                }
                field1114 = field1106;
                field963.method3121(206);
                field963.method2876(class174.method2750(arg0));
                field963.method2936(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("bo.jz(Ljava/lang/String;II)V")
    public static final void method685(String arg0, int arg1) {
        field963.method3121(226);
        field963.method2876(class174.method2750(arg0) + 1);
        field963.method2953(arg1);
        field963.method2936(arg0);
    }

    @ObfuscatedName("ee.jq(Ljava/lang/String;S)V")
    public static final void method2455(String arg0) {
        if (Statics.field1316 != null) {
            field963.method3121(134);
            field963.method2876(class174.method2750(arg0));
            field963.method2936(arg0);
        }
    }

    @ObfuscatedName("hk.js(Ljava/lang/String;I)V")
    public static final void method3566(String arg0) {
        if (!arg0.equals("")) {
            field963.method3121(68);
            field963.method2876(class174.method2750(arg0));
            field963.method2936(arg0);
        }
    }

    @ObfuscatedName("h.jc(I)V")
    public static final void method31() {
        field963.method3121(68);
        field963.method2876(0);
    }

    @ObfuscatedName("t.jm(II)V")
    public static void method151(int arg0) {
        for (class199 var1 = (class199) field1143.method3262(); var1 != null; var1 = (class199) field1143.method3263()) {
            if ((long) arg0 == (var1.field2454 >> 48 & 0xFFFFL)) {
                var1.method3304();
            }
        }
    }

    @ObfuscatedName("bm.jk(Lhj;I)I")
    public static int method1045(class217 arg0) {
        class199 var1 = (class199) field1143.method3268(((long) arg0.field2637 << 32) + (long) arg0.field2759);
        return var1 == null ? arg0.field2705 : var1.field2467;
    }

    @ObfuscatedName("fn.ja(Lhj;I)Lhj;")
    public static class217 method3159(class217 arg0) {
        int var1 = class218.method4262(method1045(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class217.method577(arg0.field2652);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("fa.jv(Lhj;B)Z")
    public static boolean method2808(class217 arg0) {
        if (field1091) {
            if (method1045(arg0) != 0) {
                return false;
            }
            if (arg0.field2673 == 0) {
                return false;
            }
        }
        return arg0.field2739;
    }

    @ObfuscatedName("cu.jg(Lhj;IS)Ljava/lang/String;")
    public static String method1560(class217 arg0, int arg1) {
        int var2 = method1045(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2733 == null) {
            return null;
        } else if (arg0.field2677 == null || arg0.field2677.length <= arg1 || arg0.field2677[arg1] == null || arg0.field2677[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2677[arg1];
        }
    }

    @ObfuscatedName("p.jo(Lhj;I)Ljava/lang/String;")
    public static String method118(class217 arg0) {
        if (class218.method2678(method1045(arg0)) == 0) {
            return null;
        } else if (arg0.field2638 == null || arg0.field2638.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2638;
        }
    }

    @ObfuscatedName("bv.je(Ljava/lang/String;S)V")
    public static void method1049(String arg0) {
        Statics.field1124 = arg0;
        try {
            String var1 = Statics.field3334.getParameter(class275.field3713.field3714);
            String var2 = Statics.field3334.getParameter(class275.field3710.field3714);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class176.method218() + 94608000000L;
                class183.field2425.setTime(new Date(var6));
                int var8 = class183.field2425.get(7);
                int var9 = class183.field2425.get(5);
                int var10 = class183.field2425.get(2);
                int var11 = class183.field2425.get(1);
                int var12 = class183.field2425.get(11);
                int var13 = class183.field2425.get(12);
                int var14 = class183.field2425.get(13);
                String var15 = class183.field2424[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class183.field2427[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            class53.method673(Statics.field3334, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var17) {
        }
    }

    @ObfuscatedName("ab.kc(Lfw;IS)V")
    public static void method536(class174 arg0, int arg1) {
        byte[] var2 = arg0.field2373;
        if (field957 == null) {
            field957 = new byte[24];
        }
        class184.method3163(var2, arg1, field957, 0, 24);
        if (class156.field2235 == null) {
            return;
        }
        try {
            class156.field2235.method2127(0L);
            class156.field2235.method2116(arg0.field2373, arg1, 24);
        } catch (Exception var4) {
        }
    }
}

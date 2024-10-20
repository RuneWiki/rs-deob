package deob;

import java.io.IOException;
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
    public static class162[] field1021 = new class162[4];

    @ObfuscatedName("client.au")
    public static boolean field1123 = true;

    @ObfuscatedName("client.ah")
    public static int field902 = 1;

    @ObfuscatedName("client.ad")
    public static int field903 = 0;

    @ObfuscatedName("client.bg")
    public static int field1162 = 0;

    @ObfuscatedName("client.bv")
    public static boolean field906 = false;

    @ObfuscatedName("client.bz")
    public static boolean field1056 = false;

    @ObfuscatedName("client.ba")
    public static int field1121 = 0;

    @ObfuscatedName("client.bw")
    public static int field910 = 0;

    @ObfuscatedName("client.bx")
    public static boolean field961 = true;

    @ObfuscatedName("client.bq")
    public static int field960 = 0;

    @ObfuscatedName("client.bd")
    public static long field1029 = 1L;

    @ObfuscatedName("client.bm")
    public static int field915 = -1;

    @ObfuscatedName("client.bs")
    public static int field916 = -1;

    @ObfuscatedName("client.bt")
    public static int field917 = -1;

    @ObfuscatedName("client.bk")
    public static boolean field1009 = true;

    @ObfuscatedName("client.bl")
    public static boolean field919 = false;

    @ObfuscatedName("client.be")
    public static int field920 = 0;

    @ObfuscatedName("client.by")
    public static int field921 = 0;

    @ObfuscatedName("client.bh")
    public static int field1134 = 0;

    @ObfuscatedName("client.bj")
    public static int field923 = 0;

    @ObfuscatedName("client.bu")
    public static int field924 = 0;

    @ObfuscatedName("client.bb")
    public static int field925 = 0;

    @ObfuscatedName("client.cx")
    public static int field1032 = 0;

    @ObfuscatedName("client.cw")
    public static int field927 = 0;

    @ObfuscatedName("client.ch")
    public static int field1040 = 0;

    @ObfuscatedName("client.co")
    public static class92 field929 = class92.field1411;

    @ObfuscatedName("client.cz")
    public static class92 field911 = class92.field1411;

    @ObfuscatedName("client.cp")
    public static int field922 = 0;

    @ObfuscatedName("client.cb")
    public static int field1186 = 0;

    @ObfuscatedName("client.cl")
    public static int field1022 = 0;

    @ObfuscatedName("client.df")
    public static int field937 = 0;

    @ObfuscatedName("client.di")
    public static int field938 = 0;

    @ObfuscatedName("client.da")
    public static int field939 = 0;

    @ObfuscatedName("client.dg")
    public static int field940 = 0;

    @ObfuscatedName("client.dn")
    public static int field941 = 0;

    @ObfuscatedName("client.db")
    public static byte[] field944 = null;

    @ObfuscatedName("client.ds")
    public static class87[] field1159 = new class87[32768];

    @ObfuscatedName("client.dd")
    public static int field931 = 0;

    @ObfuscatedName("client.dh")
    public static int[] field1002 = new int[32768];

    @ObfuscatedName("client.dp")
    public static int field1097 = 0;

    @ObfuscatedName("client.do")
    public static int[] field947 = new int[250];

    @ObfuscatedName("client.eo")
    public static class180 field948 = new class180(5000);

    @ObfuscatedName("client.es")
    public static class180 field908 = new class180(5000);

    @ObfuscatedName("client.er")
    public static class180 field950 = new class180(15000);

    @ObfuscatedName("client.ei")
    public static int field951 = 0;

    @ObfuscatedName("client.ec")
    public static int field952 = 0;

    @ObfuscatedName("client.em")
    public static int field953 = 0;

    @ObfuscatedName("client.eu")
    public static int field954 = 0;

    @ObfuscatedName("client.eq")
    public static int field1101 = 0;

    @ObfuscatedName("client.ek")
    public static int field956 = 0;

    @ObfuscatedName("client.el")
    public static int field957 = 0;

    @ObfuscatedName("client.ej")
    public static int field958 = 0;

    @ObfuscatedName("client.eg")
    public static boolean field959 = false;

    @ObfuscatedName("client.eh")
    public static HashMap field1053 = new HashMap();

    @ObfuscatedName("client.eb")
    public static int field1118 = 0;

    @ObfuscatedName("client.fg")
    public static int field962 = 1;

    @ObfuscatedName("client.fz")
    public static int field1128 = 0;

    @ObfuscatedName("client.fp")
    public static int field1024 = 1;

    @ObfuscatedName("client.fy")
    public static int field1114 = 0;

    @ObfuscatedName("client.fe")
    public static boolean field967 = false;

    @ObfuscatedName("client.fo")
    public static int[][][] field968 = new int[4][13][13];

    @ObfuscatedName("client.fq")
    public static final int[] field969 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fv")
    public static int field970 = 0;

    @ObfuscatedName("client.fr")
    public static int field971 = 2;

    @ObfuscatedName("client.fw")
    public static int field972 = 0;

    @ObfuscatedName("client.ft")
    public static int field973 = 2;

    @ObfuscatedName("client.fb")
    public static int field1115 = 0;

    @ObfuscatedName("client.fu")
    public static int field975 = 1;

    @ObfuscatedName("client.fx")
    public static int field976 = 0;

    @ObfuscatedName("client.ff")
    public static int field977 = 0;

    @ObfuscatedName("client.fh")
    public static int field978 = 2;

    @ObfuscatedName("client.fn")
    public static int field979 = 0;

    @ObfuscatedName("client.gq")
    public static int field980 = 1;

    @ObfuscatedName("client.gt")
    public static int field966 = 0;

    @ObfuscatedName("client.gh")
    public static int field1126 = 0;

    @ObfuscatedName("client.gg")
    public static int field984 = 2301979;

    @ObfuscatedName("client.gk")
    public static int field985 = 5063219;

    @ObfuscatedName("client.gz")
    public static int field1185 = 3353893;

    @ObfuscatedName("client.gu")
    public static int field987 = 7759444;

    @ObfuscatedName("client.gv")
    public static boolean field988 = false;

    @ObfuscatedName("client.gr")
    public static int field1074 = 0;

    @ObfuscatedName("client.ga")
    public static int field1160 = 128;

    @ObfuscatedName("client.ht")
    public static int field991 = 0;

    @ObfuscatedName("client.hy")
    public static int field1089 = 0;

    @ObfuscatedName("client.hm")
    public static int field993 = 0;

    @ObfuscatedName("client.hz")
    public static int field1105 = 0;

    @ObfuscatedName("client.hg")
    public static int field995 = 0;

    @ObfuscatedName("client.hw")
    public static int field996 = 50;

    @ObfuscatedName("client.hs")
    public static int field997 = 0;

    @ObfuscatedName("client.hl")
    public static boolean field1084 = false;

    @ObfuscatedName("client.hn")
    public static int field999 = 0;

    @ObfuscatedName("client.ha")
    public static int field1075 = 0;

    @ObfuscatedName("client.hq")
    public static int field1001 = 50;

    @ObfuscatedName("client.hv")
    public static int[] field963 = new int[field1001];

    @ObfuscatedName("client.hj")
    public static int[] field1003 = new int[field1001];

    @ObfuscatedName("client.hr")
    public static int[] field1004 = new int[field1001];

    @ObfuscatedName("client.hc")
    public static int[] field1005 = new int[field1001];

    @ObfuscatedName("client.hp")
    public static int[] field1006 = new int[field1001];

    @ObfuscatedName("client.hd")
    public static int[] field1007 = new int[field1001];

    @ObfuscatedName("client.he")
    public static int[] field1008 = new int[field1001];

    @ObfuscatedName("client.hb")
    public static String[] field904 = new String[field1001];

    @ObfuscatedName("client.hh")
    public static int[][] field1010 = new int[104][104];

    @ObfuscatedName("client.ho")
    public static int field1011 = 0;

    @ObfuscatedName("client.hk")
    public static int field1012 = -1;

    @ObfuscatedName("client.hu")
    public static int field1050 = -1;

    @ObfuscatedName("client.hf")
    public static int field1014 = 0;

    @ObfuscatedName("client.ib")
    public static int field1116 = 0;

    @ObfuscatedName("client.il")
    public static int field907 = 0;

    @ObfuscatedName("client.ic")
    public static int field1017 = 0;

    @ObfuscatedName("client.io")
    public static int field1018 = 0;

    @ObfuscatedName("client.if")
    public static int field1019 = 0;

    @ObfuscatedName("client.it")
    public static String field1061 = null;

    @ObfuscatedName("client.iq")
    public static int field1020 = 0;

    @ObfuscatedName("client.id")
    public static int field912 = 0;

    @ObfuscatedName("client.iv")
    public static int field986 = 0;

    @ObfuscatedName("client.is")
    public static int field1023 = 0;

    @ObfuscatedName("client.ia")
    public static boolean field1108 = false;

    @ObfuscatedName("client.ig")
    public static int field1025 = 0;

    @ObfuscatedName("client.ir")
    public static int field1026 = 0;

    @ObfuscatedName("client.im")
    public static class75[] field1049 = new class75[2048];

    @ObfuscatedName("client.ij")
    public static int field1028 = -1;

    @ObfuscatedName("client.iy")
    public static int field1177 = 0;

    @ObfuscatedName("client.ie")
    public static int field1030 = 0;

    @ObfuscatedName("client.ik")
    public static int[] field1031 = new int[1000];

    @ObfuscatedName("client.jq")
    public static final int[] field1058 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.jl")
    public static String[] field1033 = new String[8];

    @ObfuscatedName("client.jb")
    public static boolean[] field1146 = new boolean[8];

    @ObfuscatedName("client.jh")
    public static int[] field1155 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.jr")
    public static int field1036 = -1;

    @ObfuscatedName("client.ja")
    public static class194[][][] field1086 = new class194[4][104][104];

    @ObfuscatedName("client.jp")
    public static class194 field1038 = new class194();

    @ObfuscatedName("client.jm")
    public static class194 field1174 = new class194();

    @ObfuscatedName("client.jc")
    public static class194 field1034 = new class194();

    @ObfuscatedName("client.jj")
    public static int[] field1150 = new int[25];

    @ObfuscatedName("client.jf")
    public static int[] field1013 = new int[25];

    @ObfuscatedName("client.jk")
    public static int[] field1043 = new int[25];

    @ObfuscatedName("client.jw")
    public static int field1044 = 0;

    @ObfuscatedName("client.jv")
    public static boolean field1045 = false;

    @ObfuscatedName("client.jd")
    public static int field1046 = 0;

    @ObfuscatedName("client.jx")
    public static int[] field1047 = new int[500];

    @ObfuscatedName("client.jz")
    public static int[] field1048 = new int[500];

    @ObfuscatedName("client.je")
    public static int[] field933 = new int[500];

    @ObfuscatedName("client.jg")
    public static int[] field928 = new int[500];

    @ObfuscatedName("client.jy")
    public static String[] field1051 = new String[500];

    @ObfuscatedName("client.ky")
    public static String[] field1052 = new String[500];

    @ObfuscatedName("client.kx")
    public static boolean field1141 = false;

    @ObfuscatedName("client.kl")
    public static int field1054 = -1;

    @ObfuscatedName("client.ks")
    public static boolean field990 = false;

    @ObfuscatedName("client.ke")
    public static int field942 = -1;

    @ObfuscatedName("client.kd")
    public static int field1057 = -1;

    @ObfuscatedName("client.ka")
    public static int field918 = 0;

    @ObfuscatedName("client.kn")
    public static int field1059 = 50;

    @ObfuscatedName("client.kh")
    public static int field1060 = 0;

    @ObfuscatedName("client.ki")
    public static boolean field1062 = false;

    @ObfuscatedName("client.kv")
    public static int field1063 = -1;

    @ObfuscatedName("client.kf")
    public static int field1158 = -1;

    @ObfuscatedName("client.kk")
    public static String field1065 = null;

    @ObfuscatedName("client.kc")
    public static String field1066 = null;

    @ObfuscatedName("client.kz")
    public static int field1067 = -1;

    @ObfuscatedName("client.kb")
    public static class191 field1119 = new class191(8);

    @ObfuscatedName("client.kq")
    public static int field1069 = 0;

    @ObfuscatedName("client.kg")
    public static int field1070 = 0;

    @ObfuscatedName("client.kr")
    public static class217 field1071 = null;

    @ObfuscatedName("client.li")
    public static int field1072 = 0;

    @ObfuscatedName("client.lv")
    public static int field1073 = 0;

    @ObfuscatedName("client.ls")
    public static int field1068 = 0;

    @ObfuscatedName("client.lj")
    public static int field949 = -1;

    @ObfuscatedName("client.ld")
    public static boolean field1076 = false;

    @ObfuscatedName("client.le")
    public static boolean field1077 = false;

    @ObfuscatedName("client.lt")
    public static boolean field1078 = false;

    @ObfuscatedName("client.lg")
    public static class217 field1079 = null;

    @ObfuscatedName("client.lq")
    public static class217 field1080 = null;

    @ObfuscatedName("client.lz")
    public static class217 field1081 = null;

    @ObfuscatedName("client.lu")
    public static int field1082 = 0;

    @ObfuscatedName("client.lo")
    public static int field1083 = 0;

    @ObfuscatedName("client.lk")
    public static class217 field964 = null;

    @ObfuscatedName("client.lr")
    public static boolean field1085 = false;

    @ObfuscatedName("client.lc")
    public static int field1094 = -1;

    @ObfuscatedName("client.lp")
    public static int field1087 = -1;

    @ObfuscatedName("client.lh")
    public static boolean field981 = false;

    @ObfuscatedName("client.ll")
    public static int field982 = -1;

    @ObfuscatedName("client.la")
    public static int field1090 = -1;

    @ObfuscatedName("client.lb")
    public static boolean field1091 = false;

    @ObfuscatedName("client.lm")
    public static int field1092 = 1;

    @ObfuscatedName("client.mp")
    public static int[] field1093 = new int[32];

    @ObfuscatedName("client.mb")
    public static int field1027 = 0;

    @ObfuscatedName("client.mt")
    public static int[] field1095 = new int[32];

    @ObfuscatedName("client.mm")
    public static int field1096 = 0;

    @ObfuscatedName("client.mi")
    public static int[] field1175 = new int[32];

    @ObfuscatedName("client.ml")
    public static int field1098 = 0;

    @ObfuscatedName("client.mr")
    public static int field1099 = 0;

    @ObfuscatedName("client.mj")
    public static int field1100 = 0;

    @ObfuscatedName("client.mf")
    public static int field1064 = 0;

    @ObfuscatedName("client.mq")
    public static int field1102 = 0;

    @ObfuscatedName("client.mv")
    public static int field1103 = 0;

    @ObfuscatedName("client.mh")
    public static int field1104 = 0;

    @ObfuscatedName("client.mu")
    public static int field1187 = 0;

    @ObfuscatedName("client.mk")
    public static class194 field1106 = new class194();

    @ObfuscatedName("client.mz")
    public static class194 field1107 = new class194();

    @ObfuscatedName("client.ms")
    public static class194 field1137 = new class194();

    @ObfuscatedName("client.mn")
    public static class191 field1109 = new class191(512);

    @ObfuscatedName("client.mx")
    public static int field1110 = 0;

    @ObfuscatedName("client.mc")
    public static int field1111 = -2;

    @ObfuscatedName("client.md")
    public static boolean[] field1112 = new boolean[100];

    @ObfuscatedName("client.my")
    public static boolean[] field1113 = new boolean[100];

    @ObfuscatedName("client.mo")
    public static boolean[] field1129 = new boolean[100];

    @ObfuscatedName("client.nc")
    public static int[] field1055 = new int[100];

    @ObfuscatedName("client.nh")
    public static int[] field1000 = new int[100];

    @ObfuscatedName("client.ne")
    public static int[] field1117 = new int[100];

    @ObfuscatedName("client.nb")
    public static int[] field913 = new int[100];

    @ObfuscatedName("client.nj")
    public static int field1147 = 0;

    @ObfuscatedName("client.nw")
    public static long field1120 = 0L;

    @ObfuscatedName("client.nt")
    public static boolean field930 = true;

    @ObfuscatedName("client.no")
    public static int[] field1122 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.nr")
    public static int field955 = 0;

    @ObfuscatedName("client.np")
    public static int field1124 = 0;

    @ObfuscatedName("client.nf")
    public static String field1125 = "";

    @ObfuscatedName("client.nl")
    public static long[] field943 = new long[100];

    @ObfuscatedName("client.nn")
    public static int field1127 = 0;

    @ObfuscatedName("client.ni")
    public static int field1133 = 0;

    @ObfuscatedName("client.nq")
    public static int[] field1136 = new int[128];

    @ObfuscatedName("client.ny")
    public static int[] field1039 = new int[128];

    @ObfuscatedName("client.nm")
    public static long field1131 = -1L;

    @ObfuscatedName("client.oh")
    public static String field1132 = null;

    @ObfuscatedName("client.ok")
    public static String field965 = null;

    @ObfuscatedName("client.ou")
    public static int field945 = -1;

    @ObfuscatedName("client.oa")
    public static int field1135 = 0;

    @ObfuscatedName("client.oj")
    public static int[] field1181 = new int[1000];

    @ObfuscatedName("client.oo")
    public static int[] field901 = new int[1000];

    @ObfuscatedName("client.ov")
    public static class286[] field1138 = new class286[1000];

    @ObfuscatedName("client.op")
    public static int field1139 = 0;

    @ObfuscatedName("client.or")
    public static int field1140 = 0;

    @ObfuscatedName("client.ol")
    public static int field1088 = 0;

    @ObfuscatedName("client.od")
    public static int field1142 = 255;

    @ObfuscatedName("client.os")
    public static int field1143 = -1;

    @ObfuscatedName("client.ox")
    public static boolean field1144 = false;

    @ObfuscatedName("client.ot")
    public static int field1145 = 127;

    @ObfuscatedName("client.om")
    public static int field1042 = 127;

    @ObfuscatedName("client.px")
    public static int field932 = 0;

    @ObfuscatedName("client.pf")
    public static int[] field1037 = new int[50];

    @ObfuscatedName("client.pm")
    public static int[] field1156 = new int[50];

    @ObfuscatedName("client.pl")
    public static int[] field1151 = new int[50];

    @ObfuscatedName("client.pw")
    public static int[] field1171 = new int[50];

    @ObfuscatedName("client.pi")
    public static class106[] field1152 = new class106[50];

    @ObfuscatedName("client.pg")
    public static boolean field1153 = false;

    @ObfuscatedName("client.ps")
    public static boolean[] field1154 = new boolean[5];

    @ObfuscatedName("client.pe")
    public static int[] field1130 = new int[5];

    @ObfuscatedName("client.pu")
    public static int[] field1016 = new int[5];

    @ObfuscatedName("client.qc")
    public static int[] field1157 = new int[5];

    @ObfuscatedName("client.qp")
    public static int[] field983 = new int[5];

    @ObfuscatedName("client.qd")
    public static short field989 = 256;

    @ObfuscatedName("client.qk")
    public static short field1148 = 205;

    @ObfuscatedName("client.qe")
    public static short field1161 = 256;

    @ObfuscatedName("client.qw")
    public static short field905 = 320;

    @ObfuscatedName("client.qq")
    public static short field1163 = 1;

    @ObfuscatedName("client.qx")
    public static short field1164 = 32767;

    @ObfuscatedName("client.qr")
    public static short field1165 = 1;

    @ObfuscatedName("client.qz")
    public static short field1166 = 32767;

    @ObfuscatedName("client.qh")
    public static int field1167 = 0;

    @ObfuscatedName("client.qb")
    public static int field1168 = 0;

    @ObfuscatedName("client.qs")
    public static int field1169 = 0;

    @ObfuscatedName("client.qo")
    public static int field1041 = 0;

    @ObfuscatedName("client.qv")
    public static int field1015 = 0;

    @ObfuscatedName("client.qa")
    public static int field1172 = 0;

    @ObfuscatedName("client.qi")
    public static int field1173 = 0;

    @ObfuscatedName("client.qt")
    public static class66[] field935 = new class66[400];

    @ObfuscatedName("client.qm")
    public static class196 field974 = new class196();

    @ObfuscatedName("client.qu")
    public static int field1176 = 0;

    @ObfuscatedName("client.qn")
    public static class71[] field1149 = new class71[400];

    @ObfuscatedName("client.qy")
    public static class214 field1178 = new class214();

    @ObfuscatedName("client.ql")
    public static int field994 = -1;

    @ObfuscatedName("client.qg")
    public static int field1180 = -1;

    @ObfuscatedName("client.rv")
    public static class17[] field1179 = new class17[8];

    @ObfuscatedName("client.rm")
    public static long field1183 = -1L;

    @ObfuscatedName("client.rp")
    public static long field1184 = -1L;

    @ObfuscatedName("client.rq")
    public static final class74 field998 = new class74();

    @ObfuscatedName("client.rf")
    public static int[] field946 = new int[50];

    @ObfuscatedName("client.ru")
    public static int[] field1035 = new int[50];

    @ObfuscatedName("bs.eq(I)Lko;")
    public static class289 method961() {
        return Statics.field602;
    }

    @ObfuscatedName("client.aq(I)V")
    public final void method749() {
    }

    public final void init() {
        if (!this.method738()) {
            return;
        }
        class275[] var1 = new class275[] { class275.field3729, class275.field3716, class275.field3721, class275.field3725, class275.field3713, class275.field3718, class275.field3722, class275.field3720, class275.field3715, class275.field3723, class275.field3717, class275.field3728, class275.field3714, class275.field3719, class275.field3724 };
        class275[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class275 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3726);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3726)) {
                    case 1:
                        field902 = Integer.parseInt(var5);
                        break;
                    case 2:
                        field1162 = Integer.parseInt(var5);
                        break;
                    case 3:
                        Statics.field2811 = var5;
                        break;
                    case 4:
                        Statics.field348 = Integer.parseInt(var5);
                    case 5:
                    case 8:
                    default:
                        break;
                    case 6:
                        if (var5.equalsIgnoreCase(class89.field1377)) {
                        }
                        break;
                    case 7:
                        if (var5.equalsIgnoreCase(class89.field1377)) {
                            field906 = true;
                        } else {
                            field906 = false;
                        }
                        break;
                    case 9:
                        Statics.field1170 = (class233) Statics.method666(class233.method21(), Integer.parseInt(var5));
                        if (Statics.field1170 == class233.field3208) {
                            Statics.field483 = class290.field3854;
                        } else {
                            Statics.field483 = class290.field3858;
                        }
                        break;
                    case 10:
                        field1121 = Integer.parseInt(var5);
                        break;
                    case 11:
                        field903 = Integer.parseInt(var5);
                        break;
                    case 12:
                        Statics.field2220 = var5;
                        break;
                    case 13:
                        int var6 = Integer.parseInt(var5);
                        class232[] var7 = class232.method98();
                        int var8 = 0;
                        class232 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class232 var9 = var7[var8];
                            if (var9.field3196 == var6) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field276 = var10;
                        break;
                    case 14:
                        Statics.field909 = Integer.parseInt(var5);
                }
            }
        }
        class140.field2073 = false;
        field1056 = false;
        Statics.field554 = this.getCodeBase().getHost();
        String var11 = Statics.field276.field3195;
        byte var12 = 0;
        try {
            class156.method891("oldschool", var11, var12, 17);
        } catch (Exception var14) {
            class153.method40((String) null, var14);
        }
        Statics.field2818 = this;
        this.method746(765, 503, 145);
    }

    @ObfuscatedName("client.al(I)V")
    public final void method750() {
        Statics.field611 = field1162 == 0 ? 43594 : field902 + 40000;
        Statics.field1374 = field1162 == 0 ? 443 : field902 + 50000;
        Statics.field2412 = Statics.field611;
        Statics.field2630 = class215.field2641;
        Statics.field250 = class215.field2640;
        Statics.field2631 = class215.field2638;
        Statics.field241 = class215.field2639;
        this.method731();
        this.method766();
        Statics.field518 = this.method741();
        Statics.field255 = new class161(255, class156.field2263, class156.field2264, 500000);
        class125 var1 = null;
        class82 var2 = new class82();
        try {
            var1 = class156.method2132("", Statics.field1170.field3201, false);
            byte[] var3 = new byte[(int) var1.method2093()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method2094(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class82(new class174(var3));
        } catch (Exception var10) {
        }
        try {
            if (var1 != null) {
                var1.method2101();
            }
        } catch (Exception var9) {
        }
        Statics.field1482 = var2;
        this.method729();
        class57.method1568(this, Statics.field846);
        if (field1162 != 0) {
            field919 = true;
        }
        method469(Statics.field1482.field1304);
    }

    @ObfuscatedName("client.ab(I)V")
    public final void method860() {
        field960++;
        this.method1034();
        while (true) {
            class194 var1 = class237.field3246;
            class234 var2;
            synchronized (class237.field3246) {
                var2 = (class234) class237.field3241.method3250();
            }
            if (var2 == null) {
                class204.method33();
                method966();
                class51 var4 = class51.field648;
                synchronized (class51.field648) {
                    class51.field639++;
                    class51.field659 = class51.field666;
                    class51.field658 = 0;
                    if (class51.field654 >= 0) {
                        while (class51.field654 != class51.field653) {
                            int var6 = class51.field635[class51.field653];
                            class51.field653 = class51.field653 + 1 & 0x7F;
                            if (var6 < 0) {
                                class51.field661[~var6] = false;
                            } else {
                                if (!class51.field661[var6] && class51.field658 < class51.field657.length - 1) {
                                    class51.field657[++class51.field658 - 1] = var6;
                                }
                                class51.field661[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class51.field661[var5] = false;
                        }
                        class51.field654 = class51.field653;
                    }
                    if (class51.field658 > 0) {
                        class51.field639 = 0;
                    }
                    class51.field666 = class51.field660;
                }
                class60 var8 = class60.field746;
                synchronized (class60.field746) {
                    class60.field730 = class60.field744;
                    class60.field731 = class60.field728;
                    class60.field732 = class60.field741 * 1120985671;
                    class60.field737 = class60.field745;
                    class60.field738 = class60.field734;
                    class60.field733 = class60.field735;
                    class60.field740 = class60.field729;
                    class60.field745 = 0;
                }
                if (Statics.field518 != null) {
                    int var10 = Statics.field518.method632();
                    field1187 = var10;
                }
                if (field910 == 0) {
                    method189();
                    Statics.field708.method2594();
                    for (int var11 = 0; var11 < 32; var11++) {
                        field703[var11] = 0L;
                    }
                    for (int var12 = 0; var12 < 32; var12++) {
                        field704[var12] = 0L;
                    }
                    Statics.field698 = 0;
                } else if (field910 == 5) {
                    Statics.method32(this);
                    method189();
                    Statics.field708.method2594();
                    for (int var13 = 0; var13 < 32; var13++) {
                        field703[var13] = 0L;
                    }
                    for (int var14 = 0; var14 < 32; var14++) {
                        field704[var14] = 0L;
                    }
                    Statics.field698 = 0;
                } else if (field910 == 10 || field910 == 11) {
                    Statics.method32(this);
                } else if (field910 == 20) {
                    Statics.method32(this);
                    this.method1037();
                } else if (field910 == 25) {
                    method2745();
                }
                if (field910 == 30) {
                    this.method1145();
                } else if (field910 == 40 || field910 == 45) {
                    this.method1037();
                }
                return;
            }
            var2.field3214.method3806(var2.field3213, (int) var2.field2483, var2.field3211, false);
        }
    }

    @ObfuscatedName("client.am(ZB)V")
    public final void method829(boolean arg0) {
        boolean var2;
        label138: {
            try {
                if (class204.field2518 == 2) {
                    if (Statics.field1523 == null) {
                        Statics.field1523 = class210.method3529(Statics.field2519, Statics.field2520, Statics.field439);
                        if (Statics.field1523 == null) {
                            var2 = false;
                            break label138;
                        }
                    }
                    if (Statics.field605 == null) {
                        Statics.field605 = new class113(Statics.field2516, Statics.field2515);
                    }
                    if (Statics.field2517.method3340(Statics.field1523, Statics.field2514, Statics.field605, 22050)) {
                        Statics.field2517.method3341();
                        Statics.field2517.method3357(Statics.field2456);
                        Statics.field2517.method3343(Statics.field1523, Statics.field1385);
                        class204.field2518 = 0;
                        Statics.field1523 = null;
                        Statics.field605 = null;
                        Statics.field2519 = null;
                        var2 = true;
                        break label138;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field2517.method3344();
                class204.field2518 = 0;
                Statics.field1523 = null;
                Statics.field605 = null;
                Statics.field2519 = null;
            }
            var2 = false;
        }
        if (var2 && field1144 && Statics.field2004 != null) {
            Statics.field2004.method1826();
        }
        if ((field910 == 10 || field910 == 20 || field910 == 30) && field1120 != 0L && class176.method2747() > field1120) {
            method469(method3864());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field1112[var5] = true;
            }
        }
        if (field910 == 0) {
            this.method754(class93.field1430, class93.field1447, arg0);
        } else if (field910 == 5) {
            class93.method325(Statics.field789, Statics.field40, Statics.field2140, arg0);
        } else if (field910 == 10 || field910 == 11) {
            class93.method325(Statics.field789, Statics.field40, Statics.field2140, arg0);
        } else if (field910 == 20) {
            class93.method325(Statics.field789, Statics.field40, Statics.field2140, arg0);
        } else if (field910 == 25) {
            if (field1114 == 1) {
                if (field1118 > field962) {
                    field962 = field1118;
                }
                int var6 = (field962 * 50 - field1118 * 50) / field962;
                method2660(class226.field2873 + class89.field1382 + class89.field1379 + var6 + "%" + class89.field1386, false);
            } else if (field1114 == 2) {
                if (field1128 > field1024) {
                    field1024 = field1128;
                }
                int var7 = (field1024 * 50 - field1128 * 50) / field1024 + 50;
                method2660(class226.field2873 + class89.field1382 + class89.field1379 + var7 + "%" + class89.field1386, false);
            } else {
                method2660(class226.field2873, false);
            }
        } else if (field910 == 30) {
            this.method1245();
        } else if (field910 == 40) {
            method2660(class226.field2874 + class89.field1382 + class226.field2875, false);
        } else if (field910 == 45) {
            method2660(class226.field3037, false);
        }
        if (field910 == 30 && field1147 == 0 && !arg0) {
            for (int var8 = 0; var8 < field1110; var8++) {
                if (field1113[var8]) {
                    Statics.field1297.method709(field1055[var8], field1000[var8], field1117[var8], field913[var8]);
                    field1113[var8] = false;
                }
            }
        } else if (field910 > 0) {
            Statics.field1297.method708(0, 0);
            for (int var9 = 0; var9 < field1110; var9++) {
                field1113[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.ar(I)V")
    public final void method753() {
        if (Statics.field804.method1597()) {
            Statics.field804.method1594();
        }
        if (Statics.field914 != null) {
            Statics.field914.field841 = false;
        }
        Statics.field914 = null;
        if (Statics.field818 != null) {
            Statics.field818.method2662();
            Statics.field818 = null;
        }
        class51.method1889();
        if (class60.field746 != null) {
            class60 var1 = class60.field746;
            synchronized (class60.field746) {
                class60.field746 = null;
            }
        }
        Statics.field518 = null;
        if (Statics.field2004 != null) {
            Statics.field2004.method1816();
        }
        if (Statics.field863 != null) {
            Statics.field863.method1816();
        }
        if (Statics.field3259 != null) {
            Statics.field3259.method2662();
        }
        class237.method4234();
        class156.method1502();
    }

    @ObfuscatedName("b.el(II)V")
    public static void method178(int arg0) {
        if (field910 == arg0) {
            return;
        }
        if (field910 == 0) {
            Statics.field2818.method755();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field938 = 0;
            field939 = 0;
            field940 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2847 != null) {
            Statics.field2847.method2662();
            Statics.field2847 = null;
        }
        if (field910 == 25) {
            field1114 = 0;
            field1118 = 0;
            field962 = 1;
            field1128 = 0;
            field1024 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class93.method2088(Statics.field1764, Statics.field403, true, 0);
        } else if (arg0 == 20) {
            class93.method2088(Statics.field1764, Statics.field403, true, field910 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class93.method2088(Statics.field1764, Statics.field403, false, 4);
        } else if (Statics.field1423) {
            Statics.field1416 = null;
            Statics.field1448 = null;
            Statics.field504 = null;
            Statics.field520 = null;
            Statics.field1420 = null;
            Statics.field1417 = null;
            Statics.field1424 = null;
            Statics.field352 = null;
            Statics.field2056 = null;
            Statics.field3189 = null;
            Statics.field1419 = null;
            Statics.field614 = null;
            Statics.field472 = null;
            Statics.field2254 = null;
            Statics.field630 = null;
            Statics.field584 = null;
            Statics.field898 = null;
            Statics.field3737 = null;
            Statics.field297 = null;
            Statics.field1537 = null;
            Statics.field269 = null;
            Statics.field2361 = null;
            class204.field2518 = 1;
            Statics.field2519 = null;
            Statics.field2520 = -1;
            Statics.field439 = -1;
            Statics.field2456 = 0;
            Statics.field1385 = false;
            Statics.field2305 = 2;
            class239.method2779(true);
            Statics.field1423 = false;
        }
        field910 = arg0;
    }

    @ObfuscatedName("client.ej(I)V")
    public void method1034() {
        if (field910 != 1000) {
            boolean var1 = class239.method2401();
            if (!var1) {
                this.method1035();
            }
        }
    }

    @ObfuscatedName("client.eg(I)V")
    public void method1035() {
        if (class239.field3276 >= 4) {
            this.method747("js5crc");
            field910 = 1000;
            return;
        }
        if (class239.field3277 >= 4) {
            if (field910 <= 5) {
                this.method747("js5io");
                field910 = 1000;
                return;
            }
            field1022 = 3000;
            class239.field3277 = 3;
        }
        if (--field1022 + 1 > 0) {
            return;
        }
        try {
            if (field1186 == 0) {
                Statics.field727 = Statics.field692.method2637(Statics.field554, Statics.field2412);
                field1186++;
            }
            if (field1186 == 1) {
                if (Statics.field727.field2238 == 2) {
                    this.method1070(-1);
                    return;
                }
                if (Statics.field727.field2238 == 1) {
                    field1186++;
                }
            }
            if (field1186 == 2) {
                Statics.field21 = new class160((Socket) Statics.field727.field2242, Statics.field692);
                class174 var1 = new class174(5);
                var1.method2961(15);
                var1.method2798(145);
                Statics.field21.method2672(var1.field2415, 0, 5);
                field1186++;
                Statics.field934 = class176.method2747();
            }
            if (field1186 == 3) {
                if (field910 <= 5 || Statics.field21.method2664() > 0) {
                    int var2 = Statics.field21.method2663();
                    if (var2 != 0) {
                        this.method1070(var2);
                        return;
                    }
                    field1186++;
                } else if (class176.method2747() - Statics.field934 > 30000L) {
                    this.method1070(-2);
                    return;
                }
            }
            if (field1186 == 4) {
                class239.method2316(Statics.field21, field910 > 20);
                Statics.field727 = null;
                Statics.field21 = null;
                field1186 = 0;
                field937 = 0;
            }
        } catch (IOException var4) {
            this.method1070(-3);
        }
    }

    @ObfuscatedName("client.ea(IB)V")
    public void method1070(int arg0) {
        Statics.field727 = null;
        Statics.field21 = null;
        field1186 = 0;
        if (Statics.field611 == Statics.field2412) {
            Statics.field2412 = Statics.field1374;
        } else {
            Statics.field2412 = Statics.field611;
        }
        field937++;
        if (field937 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field910 <= 5) {
                this.method747("js5connect_full");
                field910 = 1000;
            } else {
                field1022 = 3000;
            }
        } else if (field937 >= 2 && arg0 == 6) {
            this.method747("js5connect_outofdate");
            field910 = 1000;
        } else if (field937 >= 4) {
            if (field910 <= 5) {
                this.method747("js5connect");
                field910 = 1000;
            } else {
                field1022 = 3000;
            }
        }
    }

    @ObfuscatedName("y.ef(I)V")
    public static void method189() {
        if (field922 == 0) {
            Statics.field324 = new class140(4, 104, 104, class62.field764);
            for (int var0 = 0; var0 < 4; var0++) {
                field1021[var0] = new class162(104, 104);
            }
            Statics.field1269 = new class286(512, 512);
            class93.field1447 = class226.field2876;
            class93.field1430 = 5;
            field922 = 20;
        } else if (field922 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class137.field2039[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class140.method2565(var1, 500, 800, 512, 334);
            class93.field1447 = class226.field3087;
            class93.field1430 = 10;
            field922 = 30;
        } else if (field922 == 30) {
            Statics.field992 = method2674(0, false, true, true);
            Statics.field936 = method2674(1, false, true, true);
            Statics.field25 = method2674(2, true, false, true);
            Statics.field256 = method2674(3, false, true, true);
            Statics.field800 = method2674(4, false, true, true);
            Statics.field2434 = method2674(5, true, true, true);
            Statics.field2149 = method2674(6, true, true, false);
            Statics.field35 = method2674(7, false, true, true);
            Statics.field403 = method2674(8, false, true, true);
            Statics.field323 = method2674(9, false, true, true);
            Statics.field1764 = method2674(10, false, true, true);
            Statics.field274 = method2674(11, false, true, true);
            Statics.field833 = method2674(12, false, true, true);
            Statics.field477 = method2674(13, true, false, true);
            Statics.field2808 = method2674(14, false, true, false);
            Statics.field2330 = method2674(15, false, true, true);
            Statics.field24 = method2674(16, false, true, false);
            class93.field1447 = class226.field3052;
            class93.field1430 = 20;
            field922 = 40;
        } else if (field922 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field992.method3804() * 4 / 100;
            int var8 = var7 + Statics.field936.method3804() * 4 / 100;
            int var9 = var8 + Statics.field25.method3804() * 2 / 100;
            int var10 = var9 + Statics.field256.method3804() * 2 / 100;
            int var11 = var10 + Statics.field800.method3804() * 6 / 100;
            int var12 = var11 + Statics.field2434.method3804() * 4 / 100;
            int var13 = var12 + Statics.field2149.method3804() * 2 / 100;
            int var14 = var13 + Statics.field35.method3804() * 58 / 100;
            int var15 = var14 + Statics.field403.method3804() * 2 / 100;
            int var16 = var15 + Statics.field323.method3804() * 2 / 100;
            int var17 = var16 + Statics.field1764.method3804() * 2 / 100;
            int var18 = var17 + Statics.field274.method3804() * 2 / 100;
            int var19 = var18 + Statics.field833.method3804() * 2 / 100;
            int var20 = var19 + Statics.field477.method3804() * 2 / 100;
            int var21 = var20 + Statics.field2808.method3804() * 2 / 100;
            int var22 = var21 + Statics.field2330.method3804() * 2 / 100;
            int var23 = var22 + Statics.field24.method3804() * 2 / 100;
            if (var23 == 100) {
                class93.field1447 = class226.field2880;
                class93.field1430 = 30;
                field922 = 45;
            } else {
                if (var23 != 0) {
                    class93.field1447 = class226.field2879 + var23 + "%";
                }
                class93.field1430 = 30;
            }
        } else if (field922 == 45) {
            class110.method1515(22050, !field1056, 2);
            class205 var24 = new class205();
            var24.method3436(9, 128);
            Statics.field2004 = class110.method532(Statics.field692, 0, 22050);
            Statics.field2004.method1805(var24);
            class238 var25 = Statics.field2330;
            class238 var26 = Statics.field2808;
            class238 var27 = Statics.field800;
            Statics.field2514 = var25;
            Statics.field2515 = var26;
            Statics.field2516 = var27;
            Statics.field2517 = var24;
            Statics.field863 = class110.method532(Statics.field692, 1, 2048);
            Statics.field443 = new class103();
            Statics.field863.method1805(Statics.field443);
            Statics.field725 = new class117(22050, Statics.field1636);
            class93.field1447 = class226.field3046;
            class93.field1430 = 35;
            field922 = 50;
            Statics.field821 = new class263(Statics.field403, Statics.field477);
        } else if (field922 == 50) {
            class262[] var28 = new class262[] { class262.field3626, class262.field3633, class262.field3625, class262.field3624, class262.field3627, class262.field3623 };
            int var29 = var28.length;
            class263 var30 = Statics.field821;
            class262[] var31 = new class262[] { class262.field3626, class262.field3633, class262.field3625, class262.field3624, class262.field3627, class262.field3623 };
            field1053 = var30.method4304(var31);
            if (field1053.size() < var29) {
                class93.field1447 = class226.field2946 + field1053.size() * 100 / var29 + "%";
                class93.field1430 = 40;
            } else {
                Statics.field40 = (class264) field1053.get(class262.field3627);
                Statics.field2140 = (class264) field1053.get(class262.field3633);
                Statics.field789 = (class264) field1053.get(class262.field3625);
                Statics.field338 = new class292(true);
                class93.field1447 = class226.field2883;
                class93.field1430 = 40;
                field922 = 60;
            }
        } else if (field922 == 60) {
            int var32 = class93.method160(Statics.field1764, Statics.field403);
            int var33 = class93.method216();
            if (var32 < var33) {
                class93.field1447 = class226.field3089 + var32 * 100 / var33 + "%";
                class93.field1430 = 50;
            } else {
                class93.field1447 = class226.field2885;
                class93.field1430 = 50;
                method178(5);
                field922 = 70;
            }
        } else if (field922 == 70) {
            if (Statics.field25.method3708()) {
                class238 var34 = Statics.field25;
                Statics.field3595 = var34;
                class247.method3596(Statics.field25);
                class238 var35 = Statics.field25;
                class238 var36 = Statics.field35;
                Statics.field3367 = var35;
                Statics.field3368 = var36;
                Statics.field3360 = Statics.field3367.method3784(3);
                class238 var37 = Statics.field25;
                class238 var38 = Statics.field35;
                boolean var39 = field1056;
                Statics.field3445 = var37;
                Statics.field3460 = var38;
                class256.field3468 = var39;
                class259.method4034(Statics.field25, Statics.field35);
                class253.method1468(Statics.field25);
                class238 var40 = Statics.field25;
                class238 var41 = Statics.field35;
                boolean var42 = field906;
                class264 var43 = Statics.field40;
                Statics.field1410 = var40;
                Statics.field1486 = var41;
                Statics.field3286 = var42;
                Statics.field2450 = Statics.field1410.method3784(10);
                Statics.field295 = var43;
                class261.method1469(Statics.field25, Statics.field992, Statics.field936);
                class238 var44 = Statics.field25;
                class238 var45 = Statics.field35;
                Statics.field3345 = var44;
                Statics.field2793 = var45;
                class251.method676(Statics.field25);
                class238 var46 = Statics.field25;
                Statics.field3294 = var46;
                Statics.field3293 = Statics.field3294.method3784(16);
                class217.method1511(Statics.field256, Statics.field35, Statics.field403, Statics.field477);
                class241.method3839(Statics.field25);
                class254.method1544(Statics.field25);
                class238 var47 = Statics.field25;
                Statics.field3322 = var47;
                class245.method248(Statics.field25);
                class238 var48 = Statics.field25;
                Statics.field3396 = var48;
                Statics.field804 = new class98();
                class238 var49 = Statics.field25;
                class238 var50 = Statics.field403;
                class238 var51 = Statics.field477;
                Statics.field3430 = var49;
                Statics.field3418 = var50;
                Statics.field3426 = var51;
                class249.method18(Statics.field25, Statics.field403);
                class243.method577(Statics.field25, Statics.field403);
                class93.field1447 = class226.field2887;
                class93.field1430 = 60;
                field922 = 80;
            } else {
                class93.field1447 = class226.field2886 + Statics.field25.method3809() + "%";
                class93.field1430 = 60;
            }
        } else if (field922 == 80) {
            int var52 = 0;
            if (Statics.field2278 == null) {
                Statics.field2278 = class287.method2615(Statics.field403, "compass", "");
            } else {
                var52++;
            }
            if (Statics.field301 == null) {
                Statics.field301 = class287.method2615(Statics.field403, "mapedge", "");
            } else {
                var52++;
            }
            if (Statics.field926 == null) {
                Statics.field926 = Statics.method964(Statics.field403, "mapscene", "");
            } else {
                var52++;
            }
            if (Statics.field3145 == null) {
                Statics.field3145 = class287.method2607(Statics.field403, "headicons_pk", "");
            } else {
                var52++;
            }
            if (Statics.field3662 == null) {
                Statics.field3662 = class287.method2607(Statics.field403, "headicons_prayer", "");
            } else {
                var52++;
            }
            if (Statics.field333 == null) {
                Statics.field333 = class287.method2607(Statics.field403, "headicons_hint", "");
            } else {
                var52++;
            }
            if (Statics.field347 == null) {
                Statics.field347 = class287.method2607(Statics.field403, "mapmarker", "");
            } else {
                var52++;
            }
            if (Statics.field591 == null) {
                Statics.field591 = class287.method2607(Statics.field403, "cross", "");
            } else {
                var52++;
            }
            if (Statics.field361 == null) {
                Statics.field361 = class287.method2607(Statics.field403, "mapdots", "");
            } else {
                var52++;
            }
            if (Statics.field14 == null) {
                Statics.field14 = Statics.method964(Statics.field403, "scrollbar", "");
            } else {
                var52++;
            }
            if (Statics.field482 == null) {
                Statics.field482 = Statics.method964(Statics.field403, "mod_icons", "");
            } else {
                var52++;
            }
            if (var52 < 11) {
                class93.field1447 = class226.field2888 + var52 * 100 / 12 + "%";
                class93.field1430 = 70;
            } else {
                Statics.field3647 = Statics.field482;
                Statics.field301.method4604();
                int var53 = (int) (Math.random() * 21.0D) - 10;
                int var54 = (int) (Math.random() * 21.0D) - 10;
                int var55 = (int) (Math.random() * 21.0D) - 10;
                int var56 = (int) (Math.random() * 41.0D) - 20;
                Statics.field926[0].method4583(var53 + var56, var54 + var56, var55 + var56);
                class93.field1447 = class226.field2889;
                class93.field1430 = 70;
                field922 = 90;
            }
        } else if (field922 == 90) {
            if (Statics.field323.method3708()) {
                class126 var57 = new class126(Statics.field323, Statics.field403, 20, 0.8D, field1056 ? 64 : 128);
                class137.method2324(var57);
                class137.method2325(0.8D);
                class93.field1447 = class226.field2891;
                class93.field1430 = 90;
                field922 = 110;
            } else {
                class93.field1447 = class226.field2997 + Statics.field323.method3809() + "%";
                class93.field1430 = 90;
            }
        } else if (field922 == 110) {
            Statics.field914 = new class72();
            Statics.field692.method2617(Statics.field914, 10);
            class93.field1447 = class226.field2892;
            class93.field1430 = 94;
            field922 = 120;
        } else if (field922 == 120) {
            if (Statics.field1764.method3735("huffman", "")) {
                class166 var58 = new class166(Statics.field1764.method3723("huffman", ""));
                class266.method119(var58);
                class93.field1447 = class226.field2894;
                class93.field1430 = 96;
                field922 = 130;
            } else {
                class93.field1447 = class226.field2893 + "%";
                class93.field1430 = 96;
            }
        } else if (field922 == 130) {
            if (!Statics.field256.method3708()) {
                class93.field1447 = class226.field2895 + Statics.field256.method3809() * 4 / 5 + "%";
                class93.field1430 = 100;
            } else if (!Statics.field833.method3708()) {
                class93.field1447 = class226.field2895 + (80 + Statics.field833.method3809() / 6) + "%";
                class93.field1430 = 100;
            } else if (Statics.field477.method3708()) {
                class93.field1447 = class226.field2896;
                class93.field1430 = 98;
                field922 = 140;
            } else {
                class93.field1447 = class226.field2895 + (96 + Statics.field477.method3809() / 50) + "%";
                class93.field1430 = 100;
            }
        } else if (field922 == 140) {
            if (Statics.field24.method3725(class41.field557.field549)) {
                if (Statics.field602 == null) {
                    Statics.field602 = new class289();
                    Statics.field602.method4739(Statics.field24, Statics.field789, field1053, Statics.field926);
                }
                int var59 = Statics.field602.method4888();
                if (var59 < 100) {
                    class93.field1447 = class226.field2897 + (var59 * 9 / 10 + 10) + "%";
                } else {
                    class93.field1447 = class226.field2898;
                    class93.field1430 = 100;
                    field922 = 150;
                }
            } else {
                class93.field1447 = class226.field2897 + Statics.field24.method3727(class41.field557.field549) / 10 + "%";
            }
        } else if (field922 == 150) {
            method178(10);
        }
    }

    @ObfuscatedName("fy.ed(IZZZI)Liw;")
    public static class238 method2674(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class161 var4 = null;
        if (class156.field2263 != null) {
            var4 = new class161(arg0, class156.field2263, Statics.field405[arg0], 1000000);
        }
        return new class238(var4, Statics.field255, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.ee(I)V")
    public final void method1037() {
        try {
            if (field938 == 0) {
                if (Statics.field818 != null) {
                    Statics.field818.method2662();
                    Statics.field818 = null;
                }
                Statics.field39 = null;
                field959 = false;
                field939 = 0;
                field938 = 1;
            }
            if (field938 == 1) {
                if (Statics.field39 == null) {
                    Statics.field39 = Statics.field692.method2637(Statics.field554, Statics.field2412);
                }
                if (Statics.field39.field2238 == 2) {
                    throw new IOException();
                }
                if (Statics.field39.field2238 == 1) {
                    Statics.field818 = new class160((Socket) Statics.field39.field2242, Statics.field692);
                    Statics.field39 = null;
                    field938 = 2;
                }
            }
            if (field938 == 2) {
                field948.field2408 = 0;
                field948.method2961(14);
                Statics.field818.method2672(field948.field2415, 0, 1);
                field950.field2408 = 0;
                field938 = 3;
            }
            if (field938 == 3) {
                if (Statics.field2004 != null) {
                    Statics.field2004.method1795();
                }
                if (Statics.field863 != null) {
                    Statics.field863.method1795();
                }
                int var1 = Statics.field818.method2663();
                if (Statics.field2004 != null) {
                    Statics.field2004.method1795();
                }
                if (Statics.field863 != null) {
                    Statics.field863.method1795();
                }
                if (var1 != 0) {
                    method989(var1);
                    return;
                }
                field950.field2408 = 0;
                field938 = 4;
            }
            if (field938 == 4) {
                if (field950.field2408 < 8) {
                    int var2 = Statics.field818.method2664();
                    if (var2 > 8 - field950.field2408) {
                        var2 = 8 - field950.field2408;
                    }
                    if (var2 > 0) {
                        Statics.field818.method2665(field950.field2415, field950.field2408, var2);
                        field950.field2408 += var2;
                    }
                }
                if (field950.field2408 == 8) {
                    field950.field2408 = 0;
                    Statics.field273 = field950.method2813();
                    field938 = 5;
                }
            }
            if (field938 == 5) {
                int[] var3 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field273 >> 32), (int) (Statics.field273 & 0xFFFFFFFFFFFFFFFFL) };
                field948.field2408 = 0;
                field948.method2961(1);
                field948.method2961(class93.field1439.method12());
                field948.method2798(var3[0]);
                field948.method2798(var3[1]);
                field948.method2798(var3[2]);
                field948.method2798(var3[3]);
                switch(class93.field1439.field2211) {
                    case 0:
                    case 2:
                        field948.method2797(Statics.field1290);
                        field948.field2408 += 5;
                        break;
                    case 1:
                        field948.field2408 += 8;
                        break;
                    case 3:
                        field948.method2798((Integer) Statics.field1482.field1303.get(Statics.method1576(class93.field1437)));
                        field948.field2408 += 4;
                }
                field948.method2902(class93.field1438);
                field948.method2831(class91.field1403, class91.field1397);
                field908.field2408 = 0;
                if (field910 == 40) {
                    field908.method2961(18);
                } else {
                    field908.method2961(16);
                }
                field908.method2957(0);
                int var4 = field908.field2408;
                field908.method2798(145);
                field908.method2804(field948.field2415, 0, field948.field2408);
                int var5 = field908.field2408;
                field908.method2902(class93.field1437);
                field908.method2961((field930 ? 1 : 0) << 1 | (field1056 ? 1 : 0));
                field908.method2957(Statics.field264);
                field908.method2957(Statics.field12);
                method4438(field908);
                field908.method2902(Statics.field2811);
                field908.method2798(Statics.field909);
                class174 var6 = new class174(Statics.field338.method4899());
                Statics.field338.method4904(var6);
                field908.method2804(var6.field2415, 0, var6.field2415.length);
                field908.method2961(Statics.field348);
                field908.method2798(0);
                field908.method2798(Statics.field992.field3234);
                field908.method2798(Statics.field936.field3234);
                field908.method2798(Statics.field25.field3234);
                field908.method2798(Statics.field256.field3234);
                field908.method2798(Statics.field800.field3234);
                field908.method2798(Statics.field2434.field3234);
                field908.method2798(Statics.field2149.field3234);
                field908.method2798(Statics.field35.field3234);
                field908.method2798(Statics.field403.field3234);
                field908.method2798(Statics.field323.field3234);
                field908.method2798(Statics.field1764.field3234);
                field908.method2798(Statics.field274.field3234);
                field908.method2798(Statics.field833.field3234);
                field908.method2798(Statics.field477.field3234);
                field908.method2798(Statics.field2808.field3234);
                field908.method2798(Statics.field2330.field3234);
                field908.method2798(Statics.field24.field3234);
                field908.method2829(var3, var5, field908.field2408);
                field908.method2933(field908.field2408 - var4);
                Statics.field818.method2672(field908.field2415, 0, field908.field2408);
                field948.method3053(var3);
                for (int var7 = 0; var7 < 4; var7++) {
                    var3[var7] += 50;
                }
                field950.method3053(var3);
                field938 = 6;
            }
            if (field938 == 6 && Statics.field818.method2664() > 0) {
                int var8 = Statics.field818.method2663();
                if (var8 == 21 && field910 == 20) {
                    field938 = 7;
                } else if (var8 == 2) {
                    field938 = 9;
                } else if (var8 == 15 && field910 == 40) {
                    field951 = -1;
                    field938 = 13;
                } else if (var8 == 23 && field940 < 1) {
                    field940++;
                    field938 = 0;
                } else if (var8 == 29) {
                    field938 = 11;
                } else {
                    method989(var8);
                    return;
                }
            }
            if (field938 == 7 && Statics.field818.method2664() > 0) {
                field941 = (Statics.field818.method2663() + 3) * 60;
                field938 = 8;
            }
            if (field938 == 8) {
                field939 = 0;
                class93.method619(class226.field3064, class226.field2903, field941 / 60 + class226.field2904);
                if (--field941 <= 0) {
                    field938 = 0;
                }
            } else {
                if (field938 == 9 && Statics.field818.method2664() >= 13) {
                    boolean var9 = Statics.field818.method2663() == 1;
                    Statics.field818.method2665(field950.field2415, 0, 4);
                    field950.field2408 = 0;
                    boolean var10 = false;
                    if (var9) {
                        int var11 = field950.method3074() << 24;
                        int var12 = var11 | field950.method3074() << 16;
                        int var13 = var12 | field950.method3074() << 8;
                        int var14 = var13 | field950.method3074();
                        int var15 = Statics.method1576(class93.field1437);
                        if (Statics.field1482.field1303.size() >= 10 && !Statics.field1482.field1303.containsKey(var15)) {
                            Iterator var16 = Statics.field1482.field1303.entrySet().iterator();
                            var16.next();
                            var16.remove();
                        }
                        Statics.field1482.field1303.put(var15, var14);
                        class82.method17();
                    }
                    field1068 = Statics.field818.method2663();
                    field1076 = Statics.field818.method2663() == 1;
                    field1028 = Statics.field818.method2663();
                    field1028 <<= 0x8;
                    field1028 += Statics.field818.method2663();
                    field1177 = Statics.field818.method2663();
                    Statics.field818.method2665(field950.field2415, 0, 1);
                    field950.field2408 = 0;
                    field952 = field950.method3074();
                    Statics.field818.method2665(field950.field2415, 0, 2);
                    field950.field2408 = 0;
                    field951 = field950.method2824();
                    try {
                        client var17 = Statics.field2818;
                        JSObject.getWindow(var17).call("zap", (Object[]) null);
                    } catch (Throwable var38) {
                    }
                    field938 = 10;
                }
                if (field938 != 10) {
                    if (field938 == 11 && Statics.field818.method2664() >= 2) {
                        field950.field2408 = 0;
                        Statics.field818.method2665(field950.field2415, 0, 2);
                        field950.field2408 = 0;
                        Statics.field615 = field950.method2824();
                        field938 = 12;
                    }
                    if (field938 == 12 && Statics.field818.method2664() >= Statics.field615) {
                        field950.field2408 = 0;
                        Statics.field818.method2665(field950.field2415, 0, Statics.field615);
                        field950.field2408 = 0;
                        String var33 = field950.method2818();
                        String var34 = field950.method2818();
                        String var35 = field950.method2818();
                        class93.method619(var33, var34, var35);
                        method178(10);
                    }
                    if (field938 == 13) {
                        if (field951 == -1) {
                            if (Statics.field818.method2664() < 2) {
                                return;
                            }
                            Statics.field818.method2665(field950.field2415, 0, 2);
                            field950.field2408 = 0;
                            field951 = field950.method2824();
                        }
                        if (Statics.field818.method2664() >= field951) {
                            Statics.field818.method2665(field950.field2415, 0, field951);
                            field950.field2408 = 0;
                            int var36 = field951;
                            method2217();
                            class97.method896(field950);
                            if (field950.field2408 != var36) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field939++;
                        if (field939 > 2000) {
                            if (field940 < 1) {
                                if (Statics.field611 == Statics.field2412) {
                                    Statics.field2412 = Statics.field1374;
                                } else {
                                    Statics.field2412 = Statics.field611;
                                }
                                field940++;
                                field938 = 0;
                            } else {
                                method989(-3);
                            }
                        }
                    }
                } else if (Statics.field818.method2664() >= field951) {
                    field950.field2408 = 0;
                    Statics.field818.method2665(field950.field2415, 0, field951);
                    field1029 = 1L;
                    field917 = -1;
                    Statics.field914.field844 = 0;
                    Statics.field1391 = true;
                    field1009 = true;
                    field1131 = -1L;
                    class281.field3750 = new class192();
                    field948.field2408 = 0;
                    field950.field2408 = 0;
                    field952 = -1;
                    field1101 = -1;
                    field956 = -1;
                    field957 = -1;
                    field953 = 0;
                    field920 = 0;
                    field958 = 0;
                    field921 = 0;
                    field1046 = 0;
                    field1054 = -1;
                    field1045 = false;
                    class60.method454(0);
                    class99.field1517.clear();
                    class99.field1518.method3156();
                    class99.field1524.method3320();
                    class99.field1519 = 0;
                    field1060 = 0;
                    field1062 = false;
                    field932 = 0;
                    field970 = (int) (Math.random() * 100.0D) - 50;
                    field972 = (int) (Math.random() * 110.0D) - 55;
                    field1115 = (int) (Math.random() * 80.0D) - 40;
                    field977 = (int) (Math.random() * 120.0D) - 60;
                    field979 = (int) (Math.random() * 30.0D) - 20;
                    field991 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field1088 = 0;
                    field945 = -1;
                    field1139 = 0;
                    field1140 = 0;
                    field929 = class92.field1411;
                    field911 = class92.field1411;
                    field931 = 0;
                    class97.method1654();
                    for (int var19 = 0; var19 < 2048; var19++) {
                        field1049[var19] = null;
                    }
                    for (int var20 = 0; var20 < 32768; var20++) {
                        field1159[var20] = null;
                    }
                    field1036 = -1;
                    field1174.method3246();
                    field1034.method3246();
                    for (int var21 = 0; var21 < 4; var21++) {
                        for (int var22 = 0; var22 < 104; var22++) {
                            for (int var23 = 0; var23 < 104; var23++) {
                                field1086[var21][var22][var23] = null;
                            }
                        }
                    }
                    field1038 = new class194();
                    field1173 = 0;
                    field1172 = 0;
                    field1176 = 0;
                    for (int var24 = 0; var24 < Statics.field3293; var24++) {
                        class242 var25 = class242.method194(var24);
                        if (var25 != null) {
                            class212.field2614[var24] = 0;
                            class212.field2616[var24] = 0;
                        }
                    }
                    Statics.field804.method1592();
                    field949 = -1;
                    if (field1067 != -1) {
                        int var26 = field1067;
                        if (var26 != -1 && Statics.field330[var26]) {
                            Statics.field16.method3752(var26);
                            if (Statics.field2647[var26] != null) {
                                boolean var27 = true;
                                for (int var28 = 0; var28 < Statics.field2647[var26].length; var28++) {
                                    if (Statics.field2647[var26][var28] != null) {
                                        if (Statics.field2647[var26][var28].field2657 == 2) {
                                            var27 = false;
                                        } else {
                                            Statics.field2647[var26][var28] = null;
                                        }
                                    }
                                }
                                if (var27) {
                                    Statics.field2647[var26] = null;
                                }
                                Statics.field330[var26] = false;
                            }
                        }
                    }
                    for (class69 var29 = (class69) field1119.method3200(); var29 != null; var29 = (class69) field1119.method3194()) {
                        method958(var29, true);
                    }
                    field1067 = -1;
                    field1119 = new class191(8);
                    field1071 = null;
                    field1046 = 0;
                    field1054 = -1;
                    field1045 = false;
                    field1178.method3569((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var30 = 0; var30 < 8; var30++) {
                        field1033[var30] = null;
                        field1146[var30] = false;
                    }
                    class64.field776 = new class191(32);
                    field961 = true;
                    for (int var31 = 0; var31 < 100; var31++) {
                        field1112[var31] = true;
                    }
                    method955();
                    field1132 = null;
                    Statics.field314 = 0;
                    Statics.field2433 = null;
                    for (int var32 = 0; var32 < 8; var32++) {
                        field1179[var32] = new class17();
                    }
                    Statics.field1182 = null;
                    class97.method896(field950);
                    Statics.field502 = -1;
                    method179(false);
                    field952 = -1;
                }
            }
        } catch (IOException var39) {
            if (field940 < 1) {
                if (Statics.field611 == Statics.field2412) {
                    Statics.field2412 = Statics.field1374;
                } else {
                    Statics.field2412 = Statics.field611;
                }
                field940++;
                field938 = 0;
            } else {
                method989(-2);
            }
        }
    }

    @ObfuscatedName("eo.eh(I)V")
    public static void method2217() {
        field948.field2408 = 0;
        field950.field2408 = 0;
        field952 = -1;
        field1101 = -1;
        field956 = -1;
        field957 = -1;
        field951 = 0;
        field953 = 0;
        field920 = 0;
        field1046 = 0;
        field1054 = -1;
        field1045 = false;
        field1088 = 0;
        field1139 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1049[var0] = null;
        }
        Statics.field341 = null;
        for (int var1 = 0; var1 < field1159.length; var1++) {
            class87 var2 = field1159[var1];
            if (var2 != null) {
                var2.field1209 = -1;
                var2.field1227 = false;
            }
        }
        class64.field776 = new class191(32);
        method178(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field1112[var3] = true;
        }
        method955();
    }

    @ObfuscatedName("be.ex(IB)V")
    public static void method989(int arg0) {
        if (arg0 == -3) {
            class93.method619(class226.field2905, class226.field3028, class226.field2972);
        } else if (arg0 == -2) {
            class93.method619(class226.field2908, class226.field2909, class226.field2910);
        } else if (arg0 == -1) {
            class93.method619(class226.field2958, class226.field2912, class226.field2913);
        } else if (arg0 == 3) {
            class93.field1432 = 3;
        } else if (arg0 == 4) {
            class93.method619(class226.field2914, class226.field2923, class226.field2916);
        } else if (arg0 == 5) {
            class93.method619(class226.field2917, class226.field2939, class226.field2919);
        } else if (arg0 == 6) {
            class93.method619(class226.field3098, class226.field2921, class226.field3004);
        } else if (arg0 == 7) {
            class93.method619(class226.field2978, class226.field2924, class226.field2925);
        } else if (arg0 == 8) {
            class93.method619(class226.field2926, class226.field2902, class226.field3070);
        } else if (arg0 == 9) {
            class93.method619(class226.field2929, class226.field2930, class226.field3127);
        } else if (arg0 == 10) {
            class93.method619(class226.field2932, class226.field2933, class226.field2934);
        } else if (arg0 == 11) {
            class93.method619(class226.field2935, class226.field3060, class226.field2907);
        } else if (arg0 == 12) {
            class93.method619(class226.field2938, class226.field2982, class226.field3015);
        } else if (arg0 == 13) {
            class93.method619(class226.field2915, class226.field2942, class226.field2943);
        } else if (arg0 == 14) {
            class93.method619(class226.field2944, class226.field2945, class226.field2970);
        } else if (arg0 == 16) {
            class93.method619(class226.field3063, class226.field2948, class226.field2949);
        } else if (arg0 == 17) {
            class93.method619(class226.field2998, class226.field2951, class226.field2952);
        } else if (arg0 == 18) {
            class93.method619(class226.field2953, class226.field2954, class226.field3079);
        } else if (arg0 == 19) {
            class93.method619(class226.field3086, class226.field2957, class226.field2863);
        } else if (arg0 == 20) {
            class93.method619(class226.field2959, class226.field2960, class226.field2961);
        } else if (arg0 == 22) {
            class93.method619(class226.field2962, class226.field2963, class226.field2964);
        } else if (arg0 == 23) {
            class93.method619(class226.field2965, class226.field2966, class226.field2967);
        } else if (arg0 == 24) {
            class93.method619(class226.field2955, class226.field2969, class226.field2947);
        } else if (arg0 == 25) {
            class93.method619(class226.field3115, class226.field3132, class226.field2973);
        } else if (arg0 == 26) {
            class93.method619(class226.field2974, class226.field2975, class226.field2890);
        } else if (arg0 == 27) {
            class93.method619(class226.field2977, class226.field3032, class226.field2979);
        } else if (arg0 == 31) {
            class93.method619(class226.field2986, class226.field2987, class226.field3090);
        } else if (arg0 == 32) {
            class93.method619(class226.field2989, class226.field2990, class226.field2991);
        } else if (arg0 == 37) {
            class93.method619(class226.field2884, class226.field2993, class226.field2994);
        } else if (arg0 == 38) {
            class93.method619(class226.field2995, class226.field2996, class226.field3137);
        } else if (arg0 == 55) {
            class93.method619(class226.field3050, class226.field2999, class226.field2985);
        } else if (arg0 == 56) {
            class93.method619(class226.field2882, class226.field3002, class226.field3003);
            method178(11);
            return;
        } else if (arg0 == 57) {
            class93.method619(class226.field3006, class226.field3005, class226.field2950);
            method178(11);
            return;
        } else {
            class93.method619(class226.field3007, class226.field3008, class226.field3009);
        }
        method178(10);
    }

    @ObfuscatedName("dh.ev(I)V")
    public static final void method2133() {
        if (Statics.field818 != null) {
            Statics.field818.method2662();
            Statics.field818 = null;
        }
        method30();
        Statics.field324.method2416();
        for (int var0 = 0; var0 < 4; var0++) {
            field1021[var0].method2695();
        }
        System.gc();
        class204.field2518 = 1;
        Statics.field2519 = null;
        Statics.field2520 = -1;
        Statics.field439 = -1;
        Statics.field2456 = 0;
        Statics.field1385 = false;
        Statics.field2305 = 2;
        field1143 = -1;
        field1144 = false;
        class83.method957();
        method178(10);
    }

    @ObfuscatedName("i.ep(B)V")
    public static final void method30() {
        class260.method3976();
        class247.field3350.method3180();
        class248.method1416();
        class256.field3490.method3180();
        class256.field3454.method3180();
        class256.field3447.method3180();
        class256.field3442.method3180();
        class259.method2585();
        class257.field3498.method3180();
        class257.field3499.method3180();
        class257.field3516.method3180();
        class261.field3604.method3180();
        class261.field3607.method3180();
        class246.field3332.method3180();
        class246.field3335.method3180();
        class251.field3390.method3180();
        class242.field3295.method3180();
        class255.field3420.method3180();
        class255.field3421.method3180();
        class255.field3422.method3180();
        class249.field3378.method3180();
        class249.field3374.method3180();
        class253.method701();
        class252.field3395.method3180();
        class243.field3301.method3180();
        class214.field2633.method3180();
        class217.field2655.method3180();
        class217.field2650.method3180();
        class217.field2659.method3180();
        class217.field2644.method3180();
        ((class126) Statics.field2029).method2112();
        class100.field1534.method3180();
        Statics.field992.method3718();
        Statics.field936.method3718();
        Statics.field256.method3718();
        Statics.field800.method3718();
        Statics.field2434.method3718();
        Statics.field2149.method3718();
        Statics.field35.method3718();
        Statics.field403.method3718();
        Statics.field323.method3718();
        Statics.field1764.method3718();
        Statics.field274.method3718();
        Statics.field833.method3718();
    }

    @ObfuscatedName("client.et(I)V")
    public final void method1145() {
        if (field920 > 1) {
            field920--;
        }
        if (field958 > 0) {
            field958--;
        }
        if (field959) {
            field959 = false;
            if (field958 > 0) {
                method2133();
            } else {
                method178(40);
                Statics.field2847 = Statics.field818;
                Statics.field818 = null;
            }
            return;
        }
        if (!field1045) {
            field1046 = 0;
            field1054 = -1;
            field1045 = false;
            field1051[0] = class226.field3110;
            field1052[0] = "";
            field933[0] = 1006;
            field1046 = 1;
        }
        for (int var1 = 0; var1 < 100 && this.method1189(); var1++) {
        }
        if (field910 != 30) {
            return;
        }
        while (class281.method140()) {
            field948.method3054(160);
            field948.method2961(0);
            int var2 = field948.field2408;
            class281.method3865(field948);
            field948.method2807(field948.field2408 - var2);
        }
        Object var3 = Statics.field914.field842;
        synchronized (Statics.field914.field842) {
            if (!field1123) {
                Statics.field914.field844 = 0;
            } else if (class60.field737 != 0 || Statics.field914.field844 >= 40) {
                field948.method3054(168);
                field948.method2961(0);
                int var4 = field948.field2408;
                int var5 = 0;
                for (int var6 = 0; var6 < Statics.field914.field844 && field948.field2408 - var4 < 240; var6++) {
                    var5++;
                    int var7 = Statics.field914.field845[var6];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var8 = Statics.field914.field843[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    int var9 = var7 * 765 + var8;
                    if (Statics.field914.field845[var6] == -1 && Statics.field914.field843[var6] == -1) {
                        var8 = -1;
                        var7 = -1;
                        var9 = 524287;
                    }
                    if (field915 != var8 || field916 != var7) {
                        int var10 = var8 - field915;
                        field915 = var8;
                        int var11 = var7 - field916;
                        field916 = var7;
                        if (field917 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var10 += 32;
                            var11 += 32;
                            field948.method2957((field917 << 12) + (var10 << 6) + var11);
                            field917 = 0;
                        } else if (field917 < 8) {
                            field948.method2797((field917 << 19) + 8388608 + var9);
                            field917 = 0;
                        } else {
                            field948.method2798((field917 << 19) + -1073741824 + var9);
                            field917 = 0;
                        }
                    } else if (field917 < 2047) {
                        field917++;
                    }
                }
                field948.method2807(field948.field2408 - var4);
                if (var5 >= Statics.field914.field844) {
                    Statics.field914.field844 = 0;
                } else {
                    Statics.field914.field844 -= var5;
                    for (int var12 = 0; var12 < Statics.field914.field844; var12++) {
                        Statics.field914.field843[var12] = Statics.field914.field843[var5 + var12];
                        Statics.field914.field845[var12] = Statics.field914.field845[var5 + var12];
                    }
                }
            }
        }
        if (class60.field737 == 1 || !Statics.field2846 && class60.field737 == 4 || class60.field737 == 2) {
            long var14 = (class60.field740 - field1029 * -1L) / 50L;
            if (var14 > 4095L) {
                var14 = 4095L;
            }
            field1029 = class60.field740 * -1L;
            int var16 = class60.field733;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > Statics.field12) {
                var16 = Statics.field12;
            }
            int var17 = class60.field738;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > Statics.field264) {
                var17 = Statics.field264;
            }
            int var18 = (int) var14;
            field948.method3054(101);
            field948.method2957((class60.field737 == 2 ? 1 : 0) + (var18 << 1));
            field948.method2957(var17);
            field948.method2957(var16);
        }
        if (class51.field658 > 0) {
            field948.method3054(172);
            field948.method2957(0);
            int var19 = field948.field2408;
            long var20 = class176.method2747();
            for (int var22 = 0; var22 < class51.field658; var22++) {
                long var23 = var20 - field1131;
                if (var23 > 16777215L) {
                    var23 = 16777215L;
                }
                field1131 = var20;
                field948.method2912((int) var23);
                field948.method2973(class51.field657[var22]);
            }
            field948.method2933(field948.field2408 - var19);
        }
        if (field997 > 0) {
            field997--;
        }
        if (class51.field661[96] || class51.field661[97] || class51.field661[98] || class51.field661[99]) {
            field1084 = true;
        }
        if (field1084 && field997 <= 0) {
            field997 = 20;
            field1084 = false;
            field948.method3054(51);
            field948.method2957(field991);
            field948.method2842(field1160);
        }
        if (Statics.field1391 && !field1009) {
            field1009 = true;
            field948.method3054(241);
            field948.method2961(1);
        }
        if (!Statics.field1391 && field1009) {
            field1009 = false;
            field948.method3054(241);
            field948.method2961(0);
        }
        method1545();
        if (field910 != 30) {
            return;
        }
        method2400();
        int var10002;
        for (int var25 = 0; var25 < field932; var25++) {
            var10002 = field1151[var25]--;
            if (field1151[var25] >= -10) {
                class106 var27 = field1152[var25];
                if (var27 == null) {
                    class106 var10000 = (class106) null;
                    var27 = class106.method1725(Statics.field800, field1037[var25], 0);
                    if (var27 == null) {
                        continue;
                    }
                    field1151[var25] += var27.method1720();
                    field1152[var25] = var27;
                }
                if (field1151[var25] < 0) {
                    int var34;
                    if (field1171[var25] == 0) {
                        var34 = field1145;
                    } else {
                        int var28 = (field1171[var25] & 0xFF) * 128;
                        int var29 = field1171[var25] >> 16 & 0xFF;
                        int var30 = var29 * 128 + 64 - Statics.field341.field1234;
                        if (var30 < 0) {
                            var30 = -var30;
                        }
                        int var31 = field1171[var25] >> 8 & 0xFF;
                        int var32 = var31 * 128 + 64 - Statics.field341.field1210;
                        if (var32 < 0) {
                            var32 = -var32;
                        }
                        int var33 = var30 + var32 - 128;
                        if (var33 > var28) {
                            field1151[var25] = -100;
                            continue;
                        }
                        if (var33 < 0) {
                            var33 = 0;
                        }
                        var34 = field1042 * (var28 - var33) / var28;
                    }
                    if (var34 > 0) {
                        class108 var35 = var27.method1721().method1763(Statics.field725);
                        class118 var36 = class118.method1903(var35, 100, var34);
                        var36.method1996(field1156[var25] - 1);
                        Statics.field443.method1690(var36);
                    }
                    field1151[var25] = -100;
                }
            } else {
                field932--;
                for (int var26 = var25; var26 < field932; var26++) {
                    field1037[var26] = field1037[var26 + 1];
                    field1152[var26] = field1152[var26 + 1];
                    field1156[var26] = field1156[var26 + 1];
                    field1151[var26] = field1151[var26 + 1];
                    field1171[var26] = field1171[var26 + 1];
                }
                var25--;
            }
        }
        if (field1144) {
            boolean var37;
            if (class204.field2518 == 0) {
                var37 = Statics.field2517.method3422();
            } else {
                var37 = true;
            }
            if (!var37) {
                if (field1142 != 0 && field1143 != -1) {
                    class204.method66(Statics.field2149, field1143, 0, field1142, false);
                }
                field1144 = false;
            }
        }
        field953++;
        if (field953 <= 750) {
            int var38 = class97.field1488;
            int[] var39 = class97.field1492;
            for (int var40 = 0; var40 < var38; var40++) {
                class75 var41 = field1049[var39[var40]];
                if (var41 != null) {
                    method246(var41, 1);
                }
            }
            method79();
            int[] var42 = class97.field1492;
            for (int var43 = 0; var43 < class97.field1488; var43++) {
                class75 var44 = field1049[var42[var43]];
                if (var44 != null && var44.field1235 > 0) {
                    var44.field1235--;
                    if (var44.field1235 == 0) {
                        var44.field1236 = null;
                    }
                }
            }
            for (int var45 = 0; var45 < field931; var45++) {
                int var46 = field1002[var45];
                class87 var47 = field1159[var46];
                if (var47 != null && var47.field1235 > 0) {
                    var47.field1235--;
                    if (var47.field1235 == 0) {
                        var47.field1236 = null;
                    }
                }
            }
            field1126++;
            if (field1017 != 0) {
                field907 += 20;
                if (field907 >= 400) {
                    field1017 = 0;
                }
            }
            if (Statics.field736 != null) {
                field1018++;
                if (field1018 >= 15) {
                    Statics.method951(Statics.field736);
                    Statics.field736 = null;
                }
            }
            class217 var48 = Statics.field1477;
            class217 var49 = Statics.field281;
            Statics.field1477 = null;
            Statics.field281 = null;
            field964 = null;
            field981 = false;
            field1085 = false;
            field1133 = 0;
            while (class51.method31() && field1133 < 128) {
                if (field1068 >= 2 && class51.field661[82] && Statics.field2172 == 66) {
                    String var50 = class99.method981();
                    Statics.field2818.method744(var50);
                } else {
                    field1039[field1133] = Statics.field2172;
                    field1136[field1133] = Statics.field377;
                    field1133++;
                }
            }
            if (field1067 != -1) {
                method3095(field1067, 0, 0, Statics.field264, Statics.field12, 0, 0);
            }
            field1092++;
            while (true) {
                class70 var51;
                class217 var52;
                class217 var53;
                do {
                    var51 = (class70) field1107.method3250();
                    if (var51 == null) {
                        while (true) {
                            class70 var54;
                            class217 var55;
                            class217 var56;
                            do {
                                var54 = (class70) field1137.method3250();
                                if (var54 == null) {
                                    while (true) {
                                        class70 var57;
                                        class217 var58;
                                        class217 var59;
                                        do {
                                            var57 = (class70) field1106.method3250();
                                            if (var57 == null) {
                                                this.method1043();
                                                method3546();
                                                if (field1080 != null) {
                                                    this.method1050();
                                                }
                                                if (Statics.field2336 != null) {
                                                    Statics.method951(Statics.field2336);
                                                    field1025++;
                                                    if (class60.field730 == 0) {
                                                        if (!field1108) {
                                                            label915: {
                                                                label933: {
                                                                    int var68 = method3690();
                                                                    if (field1046 > 2) {
                                                                        if (field1044 == 1) {
                                                                            boolean var69;
                                                                            if (field1046 <= 0) {
                                                                                var69 = false;
                                                                            } else if (field990 && class51.field661[81] && field1054 != -1) {
                                                                                var69 = true;
                                                                            } else {
                                                                                var69 = false;
                                                                            }
                                                                            if (!var69) {
                                                                                break label933;
                                                                            }
                                                                        }
                                                                        if (method324(var68)) {
                                                                            break label933;
                                                                        }
                                                                    }
                                                                    if (field1046 > 0) {
                                                                        method988(field912, field986);
                                                                    }
                                                                    break label915;
                                                                }
                                                                this.method1044(field912, field986);
                                                            }
                                                        } else if (Statics.field2336 == Statics.field1476 && field1023 != field1020) {
                                                            class217 var60 = Statics.field2336;
                                                            byte var61 = 0;
                                                            if (field1070 == 1 && var60.field2705 == 206) {
                                                                var61 = 1;
                                                            }
                                                            if (var60.field2773[field1023] <= 0) {
                                                                var61 = 0;
                                                            }
                                                            int var62 = method83(var60);
                                                            boolean var63 = (var62 >> 29 & 0x1) != 0;
                                                            if (var63) {
                                                                int var64 = field1020;
                                                                int var65 = field1023;
                                                                var60.field2773[var65] = var60.field2773[var64];
                                                                var60.field2774[var65] = var60.field2774[var64];
                                                                var60.field2773[var64] = -1;
                                                                var60.field2774[var64] = 0;
                                                            } else if (var61 == 1) {
                                                                int var66 = field1020;
                                                                int var67 = field1023;
                                                                while (var66 != var67) {
                                                                    if (var66 > var67) {
                                                                        var60.method3658(var66 - 1, var66);
                                                                        var66--;
                                                                    } else if (var66 < var67) {
                                                                        var60.method3658(var66 + 1, var66);
                                                                        var66++;
                                                                    }
                                                                }
                                                            } else {
                                                                var60.method3658(field1023, field1020);
                                                            }
                                                            field948.method3054(237);
                                                            field948.method2843(field1023);
                                                            field948.method2798(Statics.field2336.field2756);
                                                            field948.method2844(field1020);
                                                            field948.method2836(var61);
                                                        }
                                                        field1018 = 10;
                                                        class60.field737 = 0;
                                                        Statics.field2336 = null;
                                                    } else if (field1025 >= 5 && (class60.field731 > field912 + 5 || class60.field731 < field912 - 5 || class60.field732 * -417192073 > field986 + 5 || class60.field732 * -417192073 < field986 - 5)) {
                                                        field1108 = true;
                                                    }
                                                }
                                                if (class140.method2444()) {
                                                    int var70 = class140.field2094;
                                                    int var71 = class140.field2104;
                                                    field948.method3054(203);
                                                    field948.method2961(5);
                                                    field948.method2843(Statics.field340 + var70);
                                                    field948.method2843(Statics.field356 + var71);
                                                    field948.method2973(class51.field661[82] ? (class51.field661[81] ? 2 : 1) : 0);
                                                    class140.method2445();
                                                    field1014 = class60.field738;
                                                    field1116 = class60.field733;
                                                    field1017 = 1;
                                                    field907 = 0;
                                                    field1139 = var70;
                                                    field1140 = var71;
                                                }
                                                if (Statics.field1477 != var48) {
                                                    if (var48 != null) {
                                                        Statics.method951(var48);
                                                    }
                                                    if (Statics.field1477 != null) {
                                                        Statics.method951(Statics.field1477);
                                                    }
                                                }
                                                if (Statics.field281 != var49 && field918 == field1059) {
                                                    if (var49 != null) {
                                                        Statics.method951(var49);
                                                    }
                                                    if (Statics.field281 != null) {
                                                        Statics.method951(Statics.field281);
                                                    }
                                                }
                                                if (Statics.field281 == null) {
                                                    if (field918 > 0) {
                                                        field918--;
                                                    }
                                                } else if (field918 < field1059) {
                                                    field918++;
                                                    if (field918 == field1059) {
                                                        Statics.method951(Statics.field281);
                                                    }
                                                }
                                                int var72 = field970 + Statics.field341.field1234;
                                                int var73 = field972 + Statics.field341.field1210;
                                                if (Statics.field368 - var72 < -500 || Statics.field368 - var72 > 500 || Statics.field2179 - var73 < -500 || Statics.field2179 - var73 > 500) {
                                                    Statics.field368 = var72;
                                                    Statics.field2179 = var73;
                                                }
                                                if (Statics.field368 != var72) {
                                                    Statics.field368 += (var72 - Statics.field368) / 16;
                                                }
                                                if (Statics.field2179 != var73) {
                                                    Statics.field2179 += (var73 - Statics.field2179) / 16;
                                                }
                                                if (class60.field730 == 4 && Statics.field2846) {
                                                    int var74 = class60.field732 * -417192073 - field995;
                                                    field993 = var74 * 2;
                                                    field995 = var74 == -1 || var74 == 1 ? class60.field732 * -417192073 : (field995 + class60.field732 * -417192073) / 2;
                                                    int var75 = field1105 - class60.field731;
                                                    field1089 = var75 * 2;
                                                    field1105 = var75 == -1 || var75 == 1 ? class60.field731 : (field1105 + class60.field731) / 2;
                                                } else {
                                                    if (class51.field661[96]) {
                                                        field1089 += (-24 - field1089) / 2;
                                                    } else if (class51.field661[97]) {
                                                        field1089 += (24 - field1089) / 2;
                                                    } else {
                                                        field1089 /= 2;
                                                    }
                                                    if (class51.field661[98]) {
                                                        field993 += (12 - field993) / 2;
                                                    } else if (class51.field661[99]) {
                                                        field993 += (-12 - field993) / 2;
                                                    } else {
                                                        field993 /= 2;
                                                    }
                                                    field995 = class60.field732 * -417192073;
                                                    field1105 = class60.field731;
                                                }
                                                field991 = field1089 / 2 + field991 & 0x7FF;
                                                field1160 += field993 / 2;
                                                if (field1160 < 128) {
                                                    field1160 = 128;
                                                }
                                                if (field1160 > 383) {
                                                    field1160 = 383;
                                                }
                                                int var76 = Statics.field368 >> 7;
                                                int var77 = Statics.field2179 >> 7;
                                                int var78 = method1347(Statics.field368, Statics.field2179, Statics.field890);
                                                int var79 = 0;
                                                if (var76 > 3 && var77 > 3 && var76 < 100 && var77 < 100) {
                                                    for (int var80 = var76 - 4; var80 <= var76 + 4; var80++) {
                                                        for (int var81 = var77 - 4; var81 <= var77 + 4; var81++) {
                                                            int var82 = Statics.field890;
                                                            if (var82 < 3 && (class62.field750[1][var80][var81] & 0x2) == 2) {
                                                                var82++;
                                                            }
                                                            int var83 = var78 - class62.field764[var82][var80][var81];
                                                            if (var83 > var79) {
                                                                var79 = var83;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var84 = var79 * 192;
                                                if (var84 > 98048) {
                                                    var84 = 98048;
                                                }
                                                if (var84 < 32768) {
                                                    var84 = 32768;
                                                }
                                                if (var84 > field999) {
                                                    field999 += (var84 - field999) / 24;
                                                } else if (var84 < field999) {
                                                    field999 += (var84 - field999) / 80;
                                                }
                                                if (field1153) {
                                                    method3674();
                                                }
                                                for (int var85 = 0; var85 < 5; var85++) {
                                                    var10002 = field983[var85]++;
                                                }
                                                Statics.field804.method1596();
                                                int var86 = ++class60.field739 - 1;
                                                int var88 = class51.field639;
                                                if (var86 > 15000 && var88 > 15000) {
                                                    field958 = 250;
                                                    class60.method454(14500);
                                                    field948.method3054(45);
                                                }
                                                field976++;
                                                if (field976 > 500) {
                                                    field976 = 0;
                                                    int var90 = (int) (Math.random() * 8.0D);
                                                    if ((var90 & 0x1) == 1) {
                                                        field970 += field971;
                                                    }
                                                    if ((var90 & 0x2) == 2) {
                                                        field972 += field973;
                                                    }
                                                    if ((var90 & 0x4) == 4) {
                                                        field1115 += field975;
                                                    }
                                                }
                                                if (field970 < -50) {
                                                    field971 = 2;
                                                }
                                                if (field970 > 50) {
                                                    field971 = -2;
                                                }
                                                if (field972 < -55) {
                                                    field973 = 2;
                                                }
                                                if (field972 > 55) {
                                                    field973 = -2;
                                                }
                                                if (field1115 < -40) {
                                                    field975 = 1;
                                                }
                                                if (field1115 > 40) {
                                                    field975 = -1;
                                                }
                                                field966++;
                                                if (field966 > 500) {
                                                    field966 = 0;
                                                    int var91 = (int) (Math.random() * 8.0D);
                                                    if ((var91 & 0x1) == 1) {
                                                        field977 += field978;
                                                    }
                                                    if ((var91 & 0x2) == 2) {
                                                        field979 += field980;
                                                    }
                                                }
                                                if (field977 < -60) {
                                                    field978 = 2;
                                                }
                                                if (field977 > 60) {
                                                    field978 = -2;
                                                }
                                                if (field979 < -20) {
                                                    field980 = 1;
                                                }
                                                if (field979 > 10) {
                                                    field980 = -1;
                                                }
                                                for (class68 var92 = (class68) field974.method3289(); var92 != null; var92 = (class68) field974.method3288()) {
                                                    if ((long) var92.field810 < class176.method2747() / 1000L - 5L) {
                                                        if (var92.field808 > 0) {
                                                            Statics.method19(5, "", var92.field806 + class226.field3010);
                                                        }
                                                        if (var92.field808 == 0) {
                                                            Statics.method19(5, "", var92.field806 + class226.field3011);
                                                        }
                                                        var92.method3294();
                                                    }
                                                }
                                                field954++;
                                                if (field954 > 50) {
                                                    field948.method3054(71);
                                                }
                                                try {
                                                    if (Statics.field818 != null && field948.field2408 > 0) {
                                                        Statics.field818.method2672(field948.field2415, 0, field948.field2408);
                                                        field948.field2408 = 0;
                                                        field954 = 0;
                                                    }
                                                } catch (IOException var94) {
                                                    if (field958 > 0) {
                                                        method2133();
                                                    } else {
                                                        method178(40);
                                                        Statics.field2847 = Statics.field818;
                                                        Statics.field818 = null;
                                                    }
                                                }
                                                return;
                                            }
                                            var58 = var57.field823;
                                            if (var58.field2672 < 0) {
                                                break;
                                            }
                                            var59 = class217.method3680(var58.field2674);
                                        } while (var59 == null || var59.field2676 == null || var58.field2672 >= var59.field2676.length || var59.field2676[var58.field2672] != var58);
                                        class84.method1349(var57);
                                    }
                                }
                                var55 = var54.field823;
                                if (var55.field2672 < 0) {
                                    break;
                                }
                                var56 = class217.method3680(var55.field2674);
                            } while (var56 == null || var56.field2676 == null || var55.field2672 >= var56.field2676.length || var56.field2676[var55.field2672] != var55);
                            class84.method1349(var54);
                        }
                    }
                    var52 = var51.field823;
                    if (var52.field2672 < 0) {
                        break;
                    }
                    var53 = class217.method3680(var52.field2674);
                } while (var53 == null || var53.field2676 == null || var52.field2672 >= var53.field2676.length || var53.field2676[var52.field2672] != var52);
                class84.method1349(var51);
            }
        } else if (field958 > 0) {
            method2133();
        } else {
            method178(40);
            Statics.field2847 = Statics.field818;
            Statics.field818 = null;
        }
    }

    @ObfuscatedName("bt.en(I)V")
    public static final void method966() {
        if (Statics.field863 != null) {
            Statics.field863.method1794();
        }
        if (Statics.field2004 != null) {
            Statics.field2004.method1794();
        }
    }

    @ObfuscatedName("eg.ew(Ljo;IIII)V")
    public static void method2584(class261 arg0, int arg1, int arg2, int arg3) {
        if (field932 >= 50 || field1042 == 0 || arg0.field3611 == null || arg1 >= arg0.field3611.length) {
            return;
        }
        int var4 = arg0.field3611[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1037[field932] = var5;
        field1156[field932] = var6;
        field1151[field932] = 0;
        field1152[field932] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1171[field932] = (var8 << 16) + (var9 << 8) + var7;
        field932++;
    }

    @ObfuscatedName("bp.eb(IIB)V")
    public static void method862(int arg0, int arg1) {
        if (field1142 != 0 && arg0 != -1) {
            class204.method66(Statics.field274, arg0, 0, field1142, false);
            field1144 = true;
        }
    }

    @ObfuscatedName("ct.fg(I)V")
    public static final void method1545() {
        if (Statics.field890 != field945) {
            field945 = Statics.field890;
            method2593(Statics.field890);
        }
    }

    @ObfuscatedName("ha.fz(I)V")
    public static final void method3674() {
        int var0 = Statics.field437 * 128 + 64;
        int var1 = Statics.field20 * 128 + 64;
        int var2 = method1347(var0, var1, Statics.field890) - Statics.field416;
        if (Statics.field296 < var0) {
            Statics.field296 += Statics.field1871 * (var0 - Statics.field296) / 1000 + Statics.field318;
            if (Statics.field296 > var0) {
                Statics.field296 = var0;
            }
        }
        if (Statics.field296 > var0) {
            Statics.field296 -= Statics.field1871 * (Statics.field296 - var0) / 1000 + Statics.field318;
            if (Statics.field296 < var0) {
                Statics.field296 = var0;
            }
        }
        if (Statics.field1661 < var2) {
            Statics.field1661 += Statics.field1871 * (var2 - Statics.field1661) / 1000 + Statics.field318;
            if (Statics.field1661 > var2) {
                Statics.field1661 = var2;
            }
        }
        if (Statics.field1661 > var2) {
            Statics.field1661 -= Statics.field1871 * (Statics.field1661 - var2) / 1000 + Statics.field318;
            if (Statics.field1661 < var2) {
                Statics.field1661 = var2;
            }
        }
        if (Statics.field802 < var1) {
            Statics.field802 += Statics.field1871 * (var1 - Statics.field802) / 1000 + Statics.field318;
            if (Statics.field802 > var1) {
                Statics.field802 = var1;
            }
        }
        if (Statics.field802 > var1) {
            Statics.field802 -= Statics.field1871 * (Statics.field802 - var1) / 1000 + Statics.field318;
            if (Statics.field802 < var1) {
                Statics.field802 = var1;
            }
        }
        int var3 = Statics.field1480 * 128 + 64;
        int var4 = Statics.field336 * 128 + 64;
        int var5 = method1347(var3, var4, Statics.field890) - Statics.field2232;
        int var6 = var3 - Statics.field296;
        int var7 = var5 - Statics.field1661;
        int var8 = var4 - Statics.field802;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2521 < var10) {
            Statics.field2521 += Statics.field373 * (var10 - Statics.field2521) / 1000 + Statics.field857;
            if (Statics.field2521 > var10) {
                Statics.field2521 = var10;
            }
        }
        if (Statics.field2521 > var10) {
            Statics.field2521 -= Statics.field373 * (Statics.field2521 - var10) / 1000 + Statics.field857;
            if (Statics.field2521 < var10) {
                Statics.field2521 = var10;
            }
        }
        int var12 = var11 - Statics.field282;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field282 += Statics.field373 * var12 / 1000 + Statics.field857;
            Statics.field282 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field282 -= Statics.field373 * -var12 / 1000 + Statics.field857;
            Statics.field282 &= 0x7FF;
        }
        int var13 = var11 - Statics.field282;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field282 = var11;
        }
    }

    @ObfuscatedName("g.fp(I)V")
    public static final void method79() {
        for (int var0 = 0; var0 < field931; var0++) {
            int var1 = field1002[var0];
            class87 var2 = field1159[var1];
            if (var2 != null) {
                method246(var2, var2.field1363.field3560);
            }
        }
    }

    @ObfuscatedName("ap.fy(Lcx;II)V")
    public static final void method246(class79 arg0, int arg1) {
        if (arg0.field1255 > field960) {
            int var2 = arg0.field1255 - field960;
            int var3 = arg0.field1251 * 128 + arg0.field1213 * 64;
            int var4 = arg0.field1214 * 128 + arg0.field1213 * 64;
            arg0.field1234 += (var3 - arg0.field1234) / var2;
            arg0.field1210 += (var4 - arg0.field1210) / var2;
            arg0.field1267 = 0;
            arg0.field1250 = arg0.field1262;
        } else if (arg0.field1260 >= field960) {
            if (field960 == arg0.field1260 || arg0.field1261 == -1 || arg0.field1256 != 0 || arg0.field1243 + 1 > class261.method790(arg0.field1261).field3606[arg0.field1253]) {
                int var5 = arg0.field1260 - arg0.field1255;
                int var6 = field960 - arg0.field1255;
                int var7 = arg0.field1251 * 128 + arg0.field1213 * 64;
                int var8 = arg0.field1214 * 128 + arg0.field1213 * 64;
                int var9 = arg0.field1257 * 128 + arg0.field1213 * 64;
                int var10 = arg0.field1254 * 128 + arg0.field1213 * 64;
                arg0.field1234 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field1210 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field1267 = 0;
            arg0.field1250 = arg0.field1262;
            arg0.field1258 = arg0.field1250;
        } else {
            method1027(arg0);
        }
        if (arg0.field1234 < 128 || arg0.field1210 < 128 || arg0.field1234 >= 13184 || arg0.field1210 >= 13184) {
            arg0.field1261 = -1;
            arg0.field1246 = -1;
            arg0.field1255 = 0;
            arg0.field1260 = 0;
            arg0.field1234 = arg0.field1264[0] * 128 + arg0.field1213 * 64;
            arg0.field1210 = arg0.field1265[0] * 128 + arg0.field1213 * 64;
            arg0.method1350();
        }
        if (Statics.field341 == arg0 && (arg0.field1234 < 1536 || arg0.field1210 < 1536 || arg0.field1234 >= 11776 || arg0.field1210 >= 11776)) {
            arg0.field1261 = -1;
            arg0.field1246 = -1;
            arg0.field1255 = 0;
            arg0.field1260 = 0;
            arg0.field1234 = arg0.field1264[0] * 128 + arg0.field1213 * 64;
            arg0.field1210 = arg0.field1265[0] * 128 + arg0.field1213 * 64;
            arg0.method1350();
        }
        method2707(arg0);
        arg0.field1212 = false;
        if (arg0.field1238 != -1) {
            class261 var11 = class261.method790(arg0.field1238);
            if (var11 == null || var11.field3608 == null) {
                arg0.field1238 = -1;
            } else {
                arg0.field1232++;
                if (arg0.field1239 < var11.field3608.length && arg0.field1232 > var11.field3606[arg0.field1239]) {
                    arg0.field1232 = 1;
                    arg0.field1239++;
                    method2584(var11, arg0.field1239, arg0.field1234, arg0.field1210);
                }
                if (arg0.field1239 >= var11.field3608.length) {
                    arg0.field1232 = 0;
                    arg0.field1239 = 0;
                    method2584(var11, arg0.field1239, arg0.field1234, arg0.field1210);
                }
            }
        }
        if (arg0.field1246 != -1 && field960 >= arg0.field1249) {
            if (arg0.field1222 < 0) {
                arg0.field1222 = 0;
            }
            int var12 = class246.method3873(arg0.field1246).field3336;
            if (var12 == -1) {
                arg0.field1246 = -1;
            } else {
                class261 var13 = class261.method790(var12);
                if (var13 == null || var13.field3608 == null) {
                    arg0.field1246 = -1;
                } else {
                    arg0.field1248++;
                    if (arg0.field1222 < var13.field3608.length && arg0.field1248 > var13.field3606[arg0.field1222]) {
                        arg0.field1248 = 1;
                        arg0.field1222++;
                        method2584(var13, arg0.field1222, arg0.field1234, arg0.field1210);
                    }
                    if (arg0.field1222 >= var13.field3608.length && (arg0.field1222 < 0 || arg0.field1222 >= var13.field3608.length)) {
                        arg0.field1246 = -1;
                    }
                }
            }
        }
        if (arg0.field1261 != -1 && arg0.field1256 <= 1) {
            class261 var14 = class261.method790(arg0.field1261);
            if (var14.field3619 == 1 && arg0.field1268 > 0 && arg0.field1255 <= field960 && arg0.field1260 < field960) {
                arg0.field1256 = 1;
                return;
            }
        }
        if (arg0.field1261 != -1 && arg0.field1256 == 0) {
            class261 var15 = class261.method790(arg0.field1261);
            if (var15 == null || var15.field3608 == null) {
                arg0.field1261 = -1;
            } else {
                arg0.field1243++;
                if (arg0.field1253 < var15.field3608.length && arg0.field1243 > var15.field3606[arg0.field1253]) {
                    arg0.field1243 = 1;
                    arg0.field1253++;
                    method2584(var15, arg0.field1253, arg0.field1234, arg0.field1210);
                }
                if (arg0.field1253 >= var15.field3608.length) {
                    arg0.field1253 -= var15.field3613;
                    arg0.field1245++;
                    if (arg0.field1245 >= var15.field3618) {
                        arg0.field1261 = -1;
                    } else if (arg0.field1253 >= 0 && arg0.field1253 < var15.field3608.length) {
                        method2584(var15, arg0.field1253, arg0.field1234, arg0.field1210);
                    } else {
                        arg0.field1261 = -1;
                    }
                }
                arg0.field1212 = var15.field3614;
            }
        }
        if (arg0.field1256 > 0) {
            arg0.field1256--;
        }
    }

    @ObfuscatedName("bj.fk(Lcx;I)V")
    public static final void method1027(class79 arg0) {
        arg0.field1238 = arg0.field1244;
        if (arg0.field1211 == 0) {
            arg0.field1267 = 0;
            return;
        }
        if (arg0.field1261 != -1 && arg0.field1256 == 0) {
            class261 var1 = class261.method790(arg0.field1261);
            if (arg0.field1268 > 0 && var1.field3619 == 0) {
                arg0.field1267++;
                return;
            }
            if (arg0.field1268 <= 0 && var1.field3620 == 0) {
                arg0.field1267++;
                return;
            }
        }
        int var2 = arg0.field1234;
        int var3 = arg0.field1210;
        int var4 = arg0.field1264[arg0.field1211 - 1] * 128 + arg0.field1213 * 64;
        int var5 = arg0.field1265[arg0.field1211 - 1] * 128 + arg0.field1213 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1250 = 1280;
            } else if (var3 > var5) {
                arg0.field1250 = 1792;
            } else {
                arg0.field1250 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1250 = 768;
            } else if (var3 > var5) {
                arg0.field1250 = 256;
            } else {
                arg0.field1250 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1250 = 1024;
        } else if (var3 > var5) {
            arg0.field1250 = 0;
        }
        byte var6 = arg0.field1266[arg0.field1211 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1234 = var4;
            arg0.field1210 = var5;
            arg0.field1211--;
            if (arg0.field1268 > 0) {
                arg0.field1268--;
            }
            return;
        }
        int var7 = arg0.field1250 - arg0.field1258 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1218;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1217;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1220;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1219;
        }
        if (var8 == -1) {
            var8 = arg0.field1217;
        }
        arg0.field1238 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class87) {
            var10 = ((class87) arg0).field1363.field3588;
        }
        if (var10) {
            if (arg0.field1258 != arg0.field1250 && arg0.field1209 == -1 && arg0.field1228 != 0) {
                var9 = 2;
            }
            if (arg0.field1211 > 2) {
                var9 = 6;
            }
            if (arg0.field1211 > 3) {
                var9 = 8;
            }
            if (arg0.field1267 > 0 && arg0.field1211 > 1) {
                var9 = 8;
                arg0.field1267--;
            }
        } else {
            if (arg0.field1211 > 1) {
                var9 = 6;
            }
            if (arg0.field1211 > 2) {
                var9 = 8;
            }
            if (arg0.field1267 > 0 && arg0.field1211 > 1) {
                var9 = 8;
                arg0.field1267--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field1238 == arg0.field1217 && arg0.field1221 != -1) {
            arg0.field1238 = arg0.field1221;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1234 += var9;
                if (arg0.field1234 > var4) {
                    arg0.field1234 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1234 -= var9;
                if (arg0.field1234 < var4) {
                    arg0.field1234 = var4;
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
        if (arg0.field1234 == var4 && arg0.field1210 == var5) {
            arg0.field1211--;
            if (arg0.field1268 > 0) {
                arg0.field1268--;
            }
        }
    }

    @ObfuscatedName("fa.fa(Lcx;S)V")
    public static final void method2707(class79 arg0) {
        if (arg0.field1228 == 0) {
            return;
        }
        if (arg0.field1209 != -1) {
            class79 var1 = null;
            if (arg0.field1209 < 32768) {
                var1 = field1159[arg0.field1209];
            } else if (arg0.field1209 >= 32768) {
                var1 = field1049[arg0.field1209 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1234 - var1.field1234;
                int var3 = arg0.field1210 - var1.field1210;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1250 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1227) {
                arg0.field1209 = -1;
                arg0.field1227 = false;
            }
        }
        if (arg0.field1237 != -1 && (arg0.field1211 == 0 || arg0.field1267 > 0)) {
            arg0.field1250 = arg0.field1237;
            arg0.field1237 = -1;
        }
        int var4 = arg0.field1250 - arg0.field1258 & 0x7FF;
        if (var4 == 0 && arg0.field1227) {
            arg0.field1209 = -1;
            arg0.field1227 = false;
        }
        if (var4 == 0) {
            arg0.field1231 = 0;
            return;
        }
        arg0.field1231++;
        if (var4 > 1024) {
            arg0.field1258 -= arg0.field1228;
            boolean var5 = true;
            if (var4 < arg0.field1228 || var4 > 2048 - arg0.field1228) {
                arg0.field1258 = arg0.field1250;
                var5 = false;
            }
            if (arg0.field1244 == arg0.field1238 && (arg0.field1231 > 25 || var5)) {
                if (arg0.field1215 == -1) {
                    arg0.field1238 = arg0.field1217;
                } else {
                    arg0.field1238 = arg0.field1215;
                }
            }
        } else {
            arg0.field1258 += arg0.field1228;
            boolean var6 = true;
            if (var4 < arg0.field1228 || var4 > 2048 - arg0.field1228) {
                arg0.field1258 = arg0.field1250;
                var6 = false;
            }
            if (arg0.field1244 == arg0.field1238 && (arg0.field1231 > 25 || var6)) {
                if (arg0.field1216 == -1) {
                    arg0.field1238 = arg0.field1217;
                } else {
                    arg0.field1238 = arg0.field1216;
                }
            }
        }
        arg0.field1258 &= 0x7FF;
    }

    @ObfuscatedName("hz.fc(I)V")
    public static void method3546() {
        if (Statics.field602 != null) {
            Statics.field602.method4839(Statics.field890, (Statics.field341.field1234 >> 7) + Statics.field340, (Statics.field341.field1210 >> 7) + Statics.field356, false);
            Statics.field602.method4737();
        }
    }

    @ObfuscatedName("o.fd(Lbh;III)V")
    public static void method48(class75 arg0, int arg1, int arg2) {
        if (arg0.field1261 == arg1 && arg1 != -1) {
            int var3 = class261.method790(arg1).field3621;
            if (var3 == 1) {
                arg0.field1253 = 0;
                arg0.field1243 = 0;
                arg0.field1256 = arg2;
                arg0.field1245 = 0;
            }
            if (var3 == 2) {
                arg0.field1245 = 0;
            }
        } else if (arg1 == -1 || arg0.field1261 == -1 || class261.method790(arg1).field3612 >= class261.method790(arg0.field1261).field3612) {
            arg0.field1261 = arg1;
            arg0.field1253 = 0;
            arg0.field1243 = 0;
            arg0.field1256 = arg2;
            arg0.field1245 = 0;
            arg0.field1268 = arg0.field1211;
        }
    }

    @ObfuscatedName("iu.fm(I)I")
    public static int method3864() {
        return field930 ? 2 : 1;
    }

    @ObfuscatedName("aa.fj(II)V")
    public static void method469(int arg0) {
        field1120 = 0L;
        if (arg0 >= 2) {
            field930 = true;
        } else {
            field930 = false;
        }
        if (method3864() == 1) {
            Statics.field2818.method726(765, 503);
        } else {
            Statics.field2818.method726(7680, 2160);
        }
        if (field910 >= 25) {
            method955();
        }
    }

    @ObfuscatedName("bo.fs(I)V")
    public static void method955() {
        field948.method3054(144);
        field948.method2961(method3864());
        field948.method2957(Statics.field264);
        field948.method2957(Statics.field12);
    }

    @ObfuscatedName("client.v(I)V")
    public final void method789() {
        field1120 = class176.method2747() + 500L;
        this.method1040();
        if (field1067 != -1) {
            this.method1063(true);
        }
    }

    @ObfuscatedName("client.fe(B)V")
    public void method1040() {
        int var1 = Statics.field264;
        int var2 = Statics.field12;
        if (this.field705 < var1) {
            int var3 = this.field705;
        }
        if (this.field706 < var2) {
            int var4 = this.field706;
        }
        if (Statics.field1482 != null) {
            try {
                class53.method664(Statics.field2818, "resize", new Object[] { method3864() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.fo(I)V")
    public final void method1245() {
        if (field1067 != -1) {
            int var1 = field1067;
            if (class217.method892(var1)) {
                method2578(Statics.field2647[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field1110; var2++) {
            if (field1112[var2]) {
                field1113[var2] = true;
            }
            field1129[var2] = field1112[var2];
            field1112[var2] = false;
        }
        field1111 = field960;
        field942 = -1;
        field1057 = -1;
        Statics.field1476 = null;
        if (field1067 != -1) {
            field1110 = 0;
            method2656(field1067, 0, 0, Statics.field264, Statics.field12, 0, 0, -1);
        }
        class282.method4564();
        if (field1045) {
            method1348();
        } else if (field942 != -1) {
            int var3 = field942;
            int var4 = field1057;
            if (field1046 >= 2 || field1060 != 0 || field1062) {
                int var5 = method3690();
                String var6;
                if (field1060 == 1 && field1046 < 2) {
                    var6 = class226.field3013 + class226.field3023 + field1061 + " " + class89.field1381;
                } else if (field1062 && field1046 < 2) {
                    var6 = field1065 + class226.field3023 + field1066 + " " + class89.field1381;
                } else {
                    String var7;
                    if (var5 < 0) {
                        var7 = "";
                    } else if (field1052[var5].length() > 0) {
                        var7 = field1051[var5] + class226.field3023 + field1052[var5];
                    } else {
                        var7 = field1051[var5];
                    }
                    var6 = var7;
                }
                if (field1046 > 2) {
                    var6 = var6 + class89.method96(16777215) + " " + '/' + " " + (field1046 - 2) + class226.field3017;
                }
                Statics.field789.method4394(var6, var3 + 4, var4 + 15, 16777215, 0, field960 / 1000);
            }
        }
        if (field1147 == 3) {
            for (int var8 = 0; var8 < field1110; var8++) {
                if (field1129[var8]) {
                    class282.method4509(field1055[var8], field1000[var8], field1117[var8], field913[var8], 16711935, 128);
                } else if (field1113[var8]) {
                    class282.method4509(field1055[var8], field1000[var8], field1117[var8], field913[var8], 16711680, 128);
                }
            }
        }
        int var9 = Statics.field890;
        int var10 = Statics.field341.field1234;
        int var11 = Statics.field341.field1210;
        int var12 = field1126;
        for (class83 var13 = (class83) class83.field1315.method3252(); var13 != null; var13 = (class83) class83.field1315.method3277()) {
            if (var13.field1309 != -1 || var13.field1317 != null) {
                int var14 = 0;
                if (var10 > var13.field1310) {
                    var14 += var10 - var13.field1310;
                } else if (var10 < var13.field1323) {
                    var14 += var13.field1323 - var10;
                }
                if (var11 > var13.field1321) {
                    var14 += var11 - var13.field1321;
                } else if (var11 < var13.field1311) {
                    var14 += var13.field1311 - var11;
                }
                if (var14 - 64 > var13.field1312 || field1042 == 0 || var13.field1307 != var9) {
                    if (var13.field1314 != null) {
                        Statics.field443.method1664(var13.field1314);
                        var13.field1314 = null;
                    }
                    if (var13.field1319 != null) {
                        Statics.field443.method1664(var13.field1319);
                        var13.field1319 = null;
                    }
                } else {
                    var14 -= 64;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = field1042 * (var13.field1312 - var14) / var13.field1312;
                    class106 var10000;
                    if (var13.field1314 != null) {
                        var13.field1314.method1907(var15);
                    } else if (var13.field1309 >= 0) {
                        var10000 = (class106) null;
                        class106 var16 = class106.method1725(Statics.field800, var13.field1309, 0);
                        if (var16 != null) {
                            class108 var17 = var16.method1721().method1763(Statics.field725);
                            class118 var18 = class118.method1903(var17, 100, var15);
                            var18.method1996(-1);
                            Statics.field443.method1690(var18);
                            var13.field1314 = var18;
                        }
                    }
                    if (var13.field1319 != null) {
                        var13.field1319.method1907(var15);
                        if (!var13.field1319.method3235()) {
                            var13.field1319 = null;
                        }
                    } else if (var13.field1317 != null && (var13.field1318 -= var12) <= 0) {
                        int var19 = (int) (Math.random() * (double) var13.field1317.length);
                        var10000 = (class106) null;
                        class106 var20 = class106.method1725(Statics.field800, var13.field1317[var19], 0);
                        if (var20 != null) {
                            class108 var21 = var20.method1721().method1763(Statics.field725);
                            class118 var22 = class118.method1903(var21, 100, var15);
                            var22.method1996(0);
                            Statics.field443.method1690(var22);
                            var13.field1319 = var22;
                            var13.field1318 = var13.field1308 + (int) (Math.random() * (double) (var13.field1316 - var13.field1308));
                        }
                    }
                }
            }
        }
        field1126 = 0;
    }

    @ObfuscatedName("fp.fq(Ljava/lang/String;ZI)V")
    public static final void method2660(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2140.method4321(arg0, 250);
        int var6 = Statics.field2140.method4322(arg0, 250) * 13;
        class282.method4510(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class282.method4572(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2140.method4328(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1661(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field1297.method708(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field1110; var11++) {
            if (field1117[var11] + field1055[var11] > var7 && field1055[var11] < var7 + var9 && field913[var11] + field1000[var11] > var8 && field1000[var11] < var8 + var10) {
                field1113[var11] = true;
            }
        }
    }

    @ObfuscatedName("d.fi(IIIIB)V")
    public static final void method164(int arg0, int arg1, int arg2, int arg3) {
        field1011++;
        method1475(class67.field803);
        boolean var4 = false;
        if (field1036 >= 0) {
            int var5 = class97.field1488;
            int[] var6 = class97.field1492;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field1036 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method1475(class67.field805);
        }
        method16(true);
        method1475(var4 ? class67.field799 : class67.field801);
        method16(false);
        for (class94 var8 = (class94) field1174.method3252(); var8 != null; var8 = (class94) field1174.method3277()) {
            if (Statics.field890 != var8.field1451 || field960 > var8.field1453) {
                var8.method3234();
            } else if (field960 >= var8.field1456) {
                if (var8.field1460 > 0) {
                    class87 var9 = field1159[var8.field1460 - 1];
                    if (var9 != null && var9.field1234 >= 0 && var9.field1234 < 13312 && var9.field1210 >= 0 && var9.field1210 < 13312) {
                        var8.method1546(var9.field1234, var9.field1210, method1347(var9.field1234, var9.field1210, var8.field1451) - var8.field1455, field960);
                    }
                }
                if (var8.field1460 < 0) {
                    int var10 = -var8.field1460 - 1;
                    class75 var11;
                    if (field1028 == var10) {
                        var11 = Statics.field341;
                    } else {
                        var11 = field1049[var10];
                    }
                    if (var11 != null && var11.field1234 >= 0 && var11.field1234 < 13312 && var11.field1210 >= 0 && var11.field1210 < 13312) {
                        var8.method1546(var11.field1234, var11.field1210, method1347(var11.field1234, var11.field1210, var8.field1451) - var8.field1455, field960);
                    }
                }
                var8.method1547(field1126);
                Statics.field324.method2437(Statics.field890, (int) var8.field1457, (int) var8.field1463, (int) var8.field1464, 60, var8, var8.field1470, -1, false);
            }
        }
        for (class85 var12 = (class85) field1034.method3252(); var12 != null; var12 = (class85) field1034.method3277()) {
            if (Statics.field890 != var12.field1345 || var12.field1343) {
                var12.method3234();
            } else if (field960 >= var12.field1344) {
                var12.method1467(field1126);
                if (var12.field1343) {
                    var12.method3234();
                } else {
                    Statics.field324.method2437(var12.field1345, var12.field1346, var12.field1351, var12.field1348, 60, var12, 0, -1, false);
                }
            }
        }
        method1000(arg0, arg1, arg2, arg3, true);
        int var13 = field1167;
        int var14 = field1168;
        int var15 = field1169;
        int var16 = field1041;
        class282.method4517(var13, var14, var13 + var15, var14 + var16);
        class137.method2320();
        if (!field1153) {
            int var17 = field1160;
            if (field999 / 256 > var17) {
                var17 = field999 / 256;
            }
            if (field1154[4] && field1016[4] + 128 > var17) {
                var17 = field1016[4] + 128;
            }
            int var18 = field991 + field1115 & 0x7FF;
            int var19 = Statics.field368;
            int var20 = method1347(Statics.field341.field1234, Statics.field341.field1210, Statics.field890) - field996;
            int var21 = Statics.field2179;
            int var22 = var17 * 3 + 600;
            int var23 = 2048 - var17 & 0x7FF;
            int var24 = 2048 - var18 & 0x7FF;
            int var25 = 0;
            int var26 = 0;
            int var27 = var22;
            if (var23 != 0) {
                int var28 = class137.field2039[var23];
                int var29 = class137.field2023[var23];
                int var30 = var26 * var29 - var22 * var28 >> 16;
                var27 = var26 * var28 + var22 * var29 >> 16;
                var26 = var30;
            }
            if (var24 != 0) {
                int var31 = class137.field2039[var24];
                int var32 = class137.field2023[var24];
                int var33 = var25 * var32 + var27 * var31 >> 16;
                var27 = var27 * var32 - var25 * var31 >> 16;
                var25 = var33;
            }
            Statics.field296 = var19 - var25;
            Statics.field1661 = var20 - var26;
            Statics.field802 = var21 - var27;
            Statics.field2521 = var17;
            Statics.field282 = var18;
        }
        int var46;
        if (field1153) {
            int var47;
            if (Statics.field1482.field1300) {
                var47 = Statics.field890;
            } else {
                int var48 = method1347(Statics.field296, Statics.field802, Statics.field890);
                if (var48 - Statics.field1661 >= 800 || (class62.field750[Statics.field890][Statics.field296 >> 7][Statics.field802 >> 7] & 0x4) == 0) {
                    var47 = 3;
                } else {
                    var47 = Statics.field890;
                }
            }
            var46 = var47;
        } else {
            int var34;
            if (Statics.field1482.field1300) {
                var34 = Statics.field890;
            } else {
                label525: {
                    int var35 = 3;
                    if (Statics.field2521 < 310) {
                        int var36 = Statics.field296 >> 7;
                        int var37 = Statics.field802 >> 7;
                        int var38 = Statics.field341.field1234 >> 7;
                        int var39 = Statics.field341.field1210 >> 7;
                        if (var36 < 0 || var37 < 0 || var36 >= 104 || var37 >= 104) {
                            var34 = Statics.field890;
                            break label525;
                        }
                        if ((class62.field750[Statics.field890][var36][var37] & 0x4) != 0) {
                            var35 = Statics.field890;
                        }
                        int var40;
                        if (var38 > var36) {
                            var40 = var38 - var36;
                        } else {
                            var40 = var36 - var38;
                        }
                        int var41;
                        if (var39 > var37) {
                            var41 = var39 - var37;
                        } else {
                            var41 = var37 - var39;
                        }
                        if (var40 > var41) {
                            int var42 = var41 * 65536 / var40;
                            int var43 = 32768;
                            while (var36 != var38) {
                                if (var36 < var38) {
                                    var36++;
                                } else if (var36 > var38) {
                                    var36--;
                                }
                                if ((class62.field750[Statics.field890][var36][var37] & 0x4) != 0) {
                                    var35 = Statics.field890;
                                }
                                var43 += var42;
                                if (var43 >= 65536) {
                                    var43 -= 65536;
                                    if (var37 < var39) {
                                        var37++;
                                    } else if (var37 > var39) {
                                        var37--;
                                    }
                                    if ((class62.field750[Statics.field890][var36][var37] & 0x4) != 0) {
                                        var35 = Statics.field890;
                                    }
                                }
                            }
                        } else {
                            int var44 = var40 * 65536 / var41;
                            int var45 = 32768;
                            while (var37 != var39) {
                                if (var37 < var39) {
                                    var37++;
                                } else if (var37 > var39) {
                                    var37--;
                                }
                                if ((class62.field750[Statics.field890][var36][var37] & 0x4) != 0) {
                                    var35 = Statics.field890;
                                }
                                var45 += var44;
                                if (var45 >= 65536) {
                                    var45 -= 65536;
                                    if (var36 < var38) {
                                        var36++;
                                    } else if (var36 > var38) {
                                        var36--;
                                    }
                                    if ((class62.field750[Statics.field890][var36][var37] & 0x4) != 0) {
                                        var35 = Statics.field890;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field341.field1234 >= 0 && Statics.field341.field1210 >= 0 && Statics.field341.field1234 < 13312 && Statics.field341.field1210 < 13312) {
                        if ((class62.field750[Statics.field890][Statics.field341.field1234 >> 7][Statics.field341.field1210 >> 7] & 0x4) != 0) {
                            var35 = Statics.field890;
                        }
                        var34 = var35;
                    } else {
                        var34 = Statics.field890;
                    }
                }
            }
            var46 = var34;
        }
        int var49 = Statics.field296;
        int var50 = Statics.field1661;
        int var51 = Statics.field802;
        int var52 = Statics.field2521;
        int var53 = Statics.field282;
        for (int var54 = 0; var54 < 5; var54++) {
            if (field1154[var54]) {
                int var55 = (int) (Math.random() * (double) (field1130[var54] * 2 + 1) - (double) field1130[var54] + Math.sin((double) field1157[var54] / 100.0D * (double) field983[var54]) * (double) field1016[var54]);
                if (var54 == 0) {
                    Statics.field296 += var55;
                }
                if (var54 == 1) {
                    Statics.field1661 += var55;
                }
                if (var54 == 2) {
                    Statics.field802 += var55;
                }
                if (var54 == 3) {
                    Statics.field282 = Statics.field282 + var55 & 0x7FF;
                }
                if (var54 == 4) {
                    Statics.field2521 += var55;
                    if (Statics.field2521 < 128) {
                        Statics.field2521 = 128;
                    }
                    if (Statics.field2521 > 383) {
                        Statics.field2521 = 383;
                    }
                }
            }
        }
        int var56 = class60.field731;
        int var57 = class60.field732 * -417192073;
        if (class60.field737 != 0) {
            var56 = class60.field738;
            var57 = class60.field733;
        }
        if (var56 >= var13 && var56 < var13 + var15 && var57 >= var14 && var57 < var14 + var16) {
            int var58 = var56 - var13;
            int var59 = var57 - var14;
            class135.field1995 = var58;
            class135.field1996 = var59;
            class135.field2007 = true;
            class135.field2001 = 0;
            class135.field2005 = false;
        } else {
            class135.method455();
        }
        method966();
        class282.method4510(var13, var14, var15, var16, 0);
        method966();
        int var60 = class137.field2025;
        class137.field2025 = field1015;
        Statics.field324.method2446(Statics.field296, Statics.field1661, Statics.field802, Statics.field2521, Statics.field282, var46);
        while (true) {
            class10 var61 = (class10) class8.field238.method3209();
            if (var61 == null) {
                class137.field2025 = var60;
                method966();
                Statics.field324.method2521();
                field1075 = 0;
                boolean var62 = false;
                int var63 = -1;
                int var64 = class97.field1488;
                int[] var65 = class97.field1492;
                for (int var66 = 0; var66 < field931 + var64; var66++) {
                    class79 var67;
                    if (var66 < var64) {
                        var67 = field1049[var65[var66]];
                        if (field1036 == var65[var66]) {
                            var62 = true;
                            var63 = var66;
                            continue;
                        }
                    } else {
                        var67 = field1159[field1002[var66 - var64]];
                    }
                    method1362(var67, var66, var13, var14, var15, var16);
                }
                if (var62) {
                    method1362(field1049[field1036], var63, var13, var14, var15, var16);
                }
                for (int var68 = 0; var68 < field1075; var68++) {
                    int var69 = field963[var68];
                    int var70 = field1003[var68];
                    int var71 = field1005[var68];
                    int var72 = field1004[var68];
                    boolean var73 = true;
                    while (var73) {
                        var73 = false;
                        for (int var74 = 0; var74 < var68; var74++) {
                            if (var70 + 2 > field1003[var74] - field1004[var74] && var70 - var72 < field1003[var74] + 2 && var69 - var71 < field963[var74] + field1005[var74] && var69 + var71 > field963[var74] - field1005[var74] && field1003[var74] - field1004[var74] < var70) {
                                var70 = field1003[var74] - field1004[var74];
                                var73 = true;
                            }
                        }
                    }
                    field1012 = field963[var68];
                    field1050 = field1003[var68] = var70;
                    String var75 = field904[var68];
                    if (field1069 == 0) {
                        int var76 = 16776960;
                        if (field1006[var68] < 6) {
                            var76 = field1122[field1006[var68]];
                        }
                        if (field1006[var68] == 6) {
                            var76 = field1011 % 20 < 10 ? 16711680 : 16776960;
                        }
                        if (field1006[var68] == 7) {
                            var76 = field1011 % 20 < 10 ? 255 : 65535;
                        }
                        if (field1006[var68] == 8) {
                            var76 = field1011 % 20 < 10 ? 45056 : 8454016;
                        }
                        if (field1006[var68] == 9) {
                            int var77 = 150 - field1008[var68];
                            if (var77 < 50) {
                                var76 = var77 * 1280 + 16711680;
                            } else if (var77 < 100) {
                                var76 = 16776960 - (var77 - 50) * 327680;
                            } else if (var77 < 150) {
                                var76 = (var77 - 100) * 5 + 65280;
                            }
                        }
                        if (field1006[var68] == 10) {
                            int var78 = 150 - field1008[var68];
                            if (var78 < 50) {
                                var76 = var78 * 5 + 16711680;
                            } else if (var78 < 100) {
                                var76 = 16711935 - (var78 - 50) * 327680;
                            } else if (var78 < 150) {
                                var76 = (var78 - 100) * 327680 + 255 - (var78 - 100) * 5;
                            }
                        }
                        if (field1006[var68] == 11) {
                            int var79 = 150 - field1008[var68];
                            if (var79 < 50) {
                                var76 = 16777215 - var79 * 327685;
                            } else if (var79 < 100) {
                                var76 = (var79 - 50) * 327685 + 65280;
                            } else if (var79 < 150) {
                                var76 = 16777215 - (var79 - 100) * 327680;
                            }
                        }
                        if (field1007[var68] == 0) {
                            Statics.field789.method4327(var75, field1012 + var13, field1050 + var14, var76, 0);
                        }
                        if (field1007[var68] == 1) {
                            Statics.field789.method4332(var75, field1012 + var13, field1050 + var14, var76, 0, field1011);
                        }
                        if (field1007[var68] == 2) {
                            Statics.field789.method4330(var75, field1012 + var13, field1050 + var14, var76, 0, field1011);
                        }
                        if (field1007[var68] == 3) {
                            Statics.field789.method4331(var75, field1012 + var13, field1050 + var14, var76, 0, field1011, 150 - field1008[var68]);
                        }
                        if (field1007[var68] == 4) {
                            int var80 = (150 - field1008[var68]) * (Statics.field789.method4381(var75) + 100) / 150;
                            class282.method4546(field1012 + var13 - 50, var14, field1012 + var13 + 50, var14 + var16);
                            Statics.field789.method4338(var75, field1012 + var13 + 50 - var80, field1050 + var14, var76, 0);
                            class282.method4517(var13, var14, var13 + var15, var14 + var16);
                        }
                        if (field1007[var68] == 5) {
                            int var81 = 150 - field1008[var68];
                            int var82 = 0;
                            if (var81 < 25) {
                                var82 = var81 - 25;
                            } else if (var81 > 125) {
                                var82 = var81 - 125;
                            }
                            class282.method4546(var13, field1050 + var14 - Statics.field789.field3644 - 1, var13 + var15, field1050 + var14 + 5);
                            Statics.field789.method4327(var75, field1012 + var13, field1050 + var14 + var82, var76, 0);
                            class282.method4517(var13, var14, var13 + var15, var14 + var16);
                        }
                    } else {
                        Statics.field789.method4327(var75, field1012 + var13, field1050 + var14, 16776960, 0);
                    }
                }
                method130(var13, var14);
                ((class126) Statics.field2029).method2113(field1126);
                method1539(var13, var14, var15, var16);
                Statics.field296 = var49;
                Statics.field1661 = var50;
                Statics.field802 = var51;
                Statics.field2521 = var52;
                Statics.field282 = var53;
                if (field961) {
                    byte var83 = 0;
                    int var84 = class239.field3270 + class239.field3268 + var83;
                    if (var84 == 0) {
                        field961 = false;
                    }
                }
                if (field961) {
                    class282.method4510(var13, var14, var15, var16, 0);
                    method2660(class226.field2873, false);
                }
                return;
            }
            var61.method38();
        }
    }

    @ObfuscatedName("bh.fl(IIIIZI)V")
    public static final void method1000(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1148 - field989) * var5 / 100 + field989;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1165) {
            short var8 = field1165;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1164) {
                var6 = field1164;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class282.method4564();
                    class282.method4510(arg0, arg1, var10, arg3, -16777216);
                    class282.method4510(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
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
                    class282.method4564();
                    class282.method4510(arg0, arg1, arg2, var13, -16777216);
                    class282.method4510(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field905 - field1161) * var5 / 100 + field1161;
        field1015 = arg3 * var6 * var14 / 85504 << 1;
        if (field1169 != arg2 || field1041 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class137.field2039[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class140.method2565(var15, 500, 800, arg2, arg3);
        }
        field1167 = arg0;
        field1168 = arg1;
        field1169 = arg2;
        field1041 = arg3;
    }

    @ObfuscatedName("cj.fv(Lbo;I)V")
    public static final void method1475(class67 arg0) {
        if (Statics.field341.field1234 >> 7 == field1139 && Statics.field341.field1210 >> 7 == field1140) {
            field1139 = 0;
        }
        int var1 = class97.field1488;
        int[] var2 = class97.field1492;
        int var3 = var1;
        if (class67.field803 == arg0 || class67.field805 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class75 var5;
            int var6;
            if (class67.field803 == arg0) {
                var5 = Statics.field341;
                var6 = Statics.field341.field891 << 14;
            } else if (class67.field805 == arg0) {
                var5 = field1049[field1036];
                var6 = field1036 << 14;
            } else {
                var5 = field1049[var2[var4]];
                var6 = var2[var4] << 14;
                if (class67.field799 == arg0 && field1036 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method1011() && !var5.field884) {
                var5.field887 = false;
                if ((field1056 && var1 > 50 || var1 > 200) && class67.field803 != arg0 && var5.field1244 == var5.field1238) {
                    var5.field887 = true;
                }
                int var7 = var5.field1234 >> 7;
                int var8 = var5.field1210 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field877 == null || field960 < var5.field872 || field960 >= var5.field883) {
                        if ((var5.field1234 & 0x7F) == 64 && (var5.field1210 & 0x7F) == 64) {
                            if (field1011 == field1010[var7][var8]) {
                                continue;
                            }
                            field1010[var7][var8] = field1011;
                        }
                        var5.field880 = method1347(var5.field1234, var5.field1210, Statics.field890);
                        Statics.field324.method2437(Statics.field890, var5.field1234, var5.field1210, var5.field880, 60, var5, var5.field1258, var6, var5.field1212);
                    } else {
                        var5.field887 = false;
                        var5.field880 = method1347(var5.field1234, var5.field1210, Statics.field890);
                        Statics.field324.method2414(Statics.field890, var5.field1234, var5.field1210, var5.field880, 60, var5, var5.field1258, var6, var5.field871, var5.field879, var5.field886, var5.field881);
                    }
                }
            }
        }
    }

    @ObfuscatedName("z.fr(ZI)V")
    public static final void method16(boolean arg0) {
        for (int var1 = 0; var1 < field931; var1++) {
            class87 var2 = field1159[field1002[var1]];
            int var3 = (field1002[var1] << 14) + 536870912;
            if (var2 != null && var2.method1011() && var2.field1363.field3579 == arg0 && var2.field1363.method4210()) {
                int var4 = var2.field1234 >> 7;
                int var5 = var2.field1210 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1213 == 1 && (var2.field1234 & 0x7F) == 64 && (var2.field1210 & 0x7F) == 64) {
                        if (field1011 == field1010[var4][var5]) {
                            continue;
                        }
                        field1010[var4][var5] = field1011;
                    }
                    if (!var2.field1363.field3587) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field324.method2437(Statics.field890, var2.field1234, var2.field1210, method1347(var2.field1234 + (var2.field1213 * 64 - 64), var2.field1210 + (var2.field1213 * 64 - 64), Statics.field890), var2.field1213 * 64 - 64 + 60, var2, var2.field1258, var3, var2.field1212);
                }
            }
        }
    }

    @ObfuscatedName("k.fw(III)V")
    public static final void method130(int arg0, int arg1) {
        if (field921 == 2) {
            method2610((field924 - Statics.field340 << 7) + field927, (field925 - Statics.field356 << 7) + field1040, field1032 * 2);
            if (field1012 > -1 && field960 % 20 < 10) {
                Statics.field333[0].method4621(field1012 + arg0 - 12, field1050 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("cw.ft(Lcx;IIIIIB)V")
    public static final void method1362(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1011()) {
            return;
        }
        if (arg0 instanceof class87) {
            class259 var6 = ((class87) arg0).field1363;
            if (var6.field3584 != null) {
                var6 = var6.method4218();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class97.field1488;
        int[] var8 = class97.field1492;
        int var9 = 3;
        if (!arg0.field1247.method3214()) {
            method3453(arg0, arg0.field1259 + 15);
            for (class86 var10 = (class86) arg0.field1247.method3222(); var10 != null; var10 = (class86) arg0.field1247.method3213()) {
                class80 var11 = var10.method1472(field960);
                if (var11 != null) {
                    class249 var12 = var10.field1356;
                    class286 var13 = var12.method3975();
                    class286 var14 = var12.method3977();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3383;
                    } else {
                        if (var12.field3384 * 2 < var14.field3781) {
                            var15 = var12.field3384;
                        }
                        var16 = var14.field3781 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field960 - var11.field1277;
                    int var20 = var11.field1273 * var16 / var12.field3383;
                    int var23;
                    if (var11.field1272 > var19) {
                        int var21 = var12.field3382 == 0 ? 0 : var19 / var12.field3382 * var12.field3382;
                        int var22 = var11.field1270 * var16 / var12.field3383;
                        var23 = (var20 - var22) * var21 / var11.field1272 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1272 + var12.field3380 - var19;
                        if (var12.field3385 >= 0) {
                            var17 = (var24 << 8) / (var12.field3380 - var12.field3385);
                        }
                    }
                    if (var11.field1273 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field1012 + arg2 - (var16 >> 1);
                    int var26 = field1050 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field1012 > -1) {
                            class282.method4510(var25, var26, var23, 5, 65280);
                            class282.method4510(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3782;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method4626(var27, var26, var17);
                            class282.method4546(var27, var26, var27 + var28, var26 + var29);
                            var14.method4626(var27, var26, var17);
                        } else {
                            var13.method4621(var27, var26);
                            class282.method4546(var27, var26, var27 + var28, var26 + var29);
                            var14.method4621(var27, var26);
                        }
                        class282.method4517(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1473()) {
                    var10.method3234();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class75 var30 = (class75) arg0;
            if (var30.field884) {
                return;
            }
            if (var30.field865 != -1 || var30.field866 != -1) {
                method3453(arg0, arg0.field1259 + 15);
                if (field1012 > -1) {
                    if (var30.field865 != -1) {
                        Statics.field3145[var30.field865].method4621(field1012 + arg2 - 12, field1050 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field866 != -1) {
                        Statics.field3662[var30.field866].method4621(field1012 + arg2 - 12, field1050 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field921 == 10 && field923 == var8[arg1]) {
                method3453(arg0, arg0.field1259 + 15);
                if (field1012 > -1) {
                    Statics.field333[1].method4621(field1012 + arg2 - 12, field1050 + arg3 - var9);
                }
            }
        } else {
            class259 var31 = ((class87) arg0).field1363;
            if (var31.field3584 != null) {
                var31 = var31.method4218();
            }
            if (var31.field3582 >= 0 && var31.field3582 < Statics.field3662.length) {
                method3453(arg0, arg0.field1259 + 15);
                if (field1012 > -1) {
                    Statics.field3662[var31.field3582].method4621(field1012 + arg2 - 12, field1050 + arg3 - 30);
                }
            }
            if (field921 == 1 && field1134 == field1002[arg1 - var7] && field960 % 20 < 10) {
                method3453(arg0, arg0.field1259 + 15);
                if (field1012 > -1) {
                    Statics.field333[0].method4621(field1012 + arg2 - 12, field1050 + arg3 - 28);
                }
            }
        }
        if (arg0.field1236 != null && (arg1 >= var7 || !arg0.field1224 && (field955 == 4 || !arg0.field1223 && (field955 == 0 || field955 == 3 || field955 == 1 && method2729(((class75) arg0).field873, false))))) {
            method3453(arg0, arg0.field1259);
            if (field1012 > -1 && field1075 < field1001) {
                field1005[field1075] = Statics.field789.method4381(arg0.field1236) / 2;
                field1004[field1075] = Statics.field789.field3644;
                field963[field1075] = field1012;
                field1003[field1075] = field1050;
                field1006[field1075] = arg0.field1226;
                field1007[field1075] = arg0.field1263;
                field1008[field1075] = arg0.field1235;
                field904[field1075] = arg0.field1236;
                field1075++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1252[var32];
            int var34 = arg0.field1229[var32];
            class255 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field960) {
                    continue;
                }
                var35 = class255.method191(arg0.field1229[var32]);
                var36 = var35.field3419;
                if (var35 != null && var35.field3437 != null) {
                    var35 = var35.method4048();
                    if (var35 == null) {
                        arg0.field1252[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1242[var32];
            class255 var38 = null;
            if (var37 >= 0) {
                var38 = class255.method191(var37);
                if (var38 != null && var38.field3437 != null) {
                    var38 = var38.method4048();
                }
            }
            if (var33 - var36 <= field960) {
                if (var35 == null) {
                    arg0.field1252[var32] = -1;
                } else {
                    method3453(arg0, arg0.field1259 / 2);
                    if (field1012 > -1) {
                        if (var32 == 1) {
                            field1050 -= 20;
                        }
                        if (var32 == 2) {
                            field1012 -= 15;
                            field1050 -= 10;
                        }
                        if (var32 == 3) {
                            field1012 += 15;
                            field1050 -= 10;
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
                        class286 var64 = var35.method4075();
                        if (var64 != null) {
                            var43 = var64.field3781;
                            int var65 = var64.field3782;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3791;
                        }
                        class286 var66 = var35.method4051();
                        if (var66 != null) {
                            var44 = var66.field3781;
                            int var67 = var66.field3782;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3791;
                        }
                        class286 var68 = var35.method4073();
                        if (var68 != null) {
                            var45 = var68.field3781;
                            int var69 = var68.field3782;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3791;
                        }
                        class286 var70 = var35.method4083();
                        if (var70 != null) {
                            var46 = var70.field3781;
                            int var71 = var70.field3782;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3791;
                        }
                        if (var38 != null) {
                            var51 = var38.method4075();
                            if (var51 != null) {
                                var55 = var51.field3781;
                                int var72 = var51.field3782;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3791;
                            }
                            var52 = var38.method4051();
                            if (var52 != null) {
                                var56 = var52.field3781;
                                int var73 = var52.field3782;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3791;
                            }
                            var53 = var38.method4073();
                            if (var53 != null) {
                                var57 = var53.field3781;
                                int var74 = var53.field3782;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3791;
                            }
                            var54 = var38.method4083();
                            if (var54 != null) {
                                var58 = var54.field3781;
                                int var75 = var54.field3782;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3791;
                            }
                        }
                        class264 var76 = var35.method4050();
                        if (var76 == null) {
                            var76 = Statics.field40;
                        }
                        class264 var77;
                        if (var38 == null) {
                            var77 = Statics.field40;
                        } else {
                            var77 = var38.method4050();
                            if (var77 == null) {
                                var77 = Statics.field40;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4049(arg0.field1230[var32]);
                        int var83 = var76.method4381(var82);
                        if (var38 != null) {
                            var79 = var38.method4049(arg0.field1233[var32]);
                            var81 = var77.method4381(var79);
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
                        int var100 = arg0.field1252[var32] - field960;
                        int var101 = var35.field3417 - var35.field3417 * var100 / var35.field3419;
                        int var102 = var35.field3433 * var100 / var35.field3419 + -var35.field3433;
                        int var103 = field1012 + arg2 - (var92 >> 1) + var101;
                        int var104 = field1050 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3427 + var104 + 15;
                        int var108 = var107 - var76.field3652;
                        int var109 = var76.field3646 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3427 + var104 + 15;
                            int var111 = var110 - var77.field3652;
                            int var112 = var77.field3646 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3423 >= 0) {
                            var115 = (var100 << 8) / (var35.field3419 - var35.field3423);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4626(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4626(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4626(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4626(var93 + var103 - var50, var104, var115);
                            }
                            var76.method4325(var82, var90 + var103, var107, var35.field3434, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4626(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4626(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4626(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4626(var97 + var103 - var62, var104, var115);
                                }
                                var77.method4325(var79, var98 + var103, var110, var38.field3434, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method4621(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method4621(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method4621(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method4621(var93 + var103 - var50, var104);
                            }
                            var76.method4338(var82, var90 + var103, var107, var35.field3434 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4621(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method4621(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method4621(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4621(var97 + var103 - var62, var104);
                                }
                                var77.method4338(var79, var98 + var103, var110, var38.field3434 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jd.fb(B)V")
    public static final void method4498() {
        field1026 = 0;
        int var0 = (Statics.field341.field1234 >> 7) + Statics.field340;
        int var1 = (Statics.field341.field1210 >> 7) + Statics.field356;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field1026 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field1026 = 1;
        }
        if (field1026 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field1026 = 0;
        }
    }

    @ObfuscatedName("ct.fu(IIIII)V")
    public static final void method1539(int arg0, int arg1, int arg2, int arg3) {
        if (field1017 == 1) {
            Statics.field591[field907 / 100].method4621(field1014 - 8, field1116 - 8);
        }
        if (field1017 == 2) {
            Statics.field591[field907 / 100 + 4].method4621(field1014 - 8, field1116 - 8);
        }
        method4498();
    }

    @ObfuscatedName("gn.fx(Lcx;II)V")
    public static final void method3453(class79 arg0, int arg1) {
        method2610(arg0.field1234, arg0.field1210, arg1);
    }

    @ObfuscatedName("et.ff(IIII)V")
    public static final void method2610(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field1012 = -1;
            field1050 = -1;
            return;
        }
        int var3 = method1347(arg0, arg1, Statics.field890) - arg2;
        int var4 = arg0 - Statics.field296;
        int var5 = var3 - Statics.field1661;
        int var6 = arg1 - Statics.field802;
        int var7 = class137.field2039[Statics.field2521];
        int var8 = class137.field2023[Statics.field2521];
        int var9 = class137.field2039[Statics.field282];
        int var10 = class137.field2023[Statics.field282];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field1012 = field1015 * var11 / var15 + field1169 / 2;
            field1050 = field1015 * var14 / var15 + field1041 / 2;
        } else {
            field1012 = -1;
            field1050 = -1;
        }
    }

    @ObfuscatedName("bb.fh(IIII)I")
    public static final int method1347(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field750[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field764[var5][var3][var4] + class62.field764[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field764[var5][var3][var4 + 1] + class62.field764[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("b.fn(ZI)V")
    public static final void method179(boolean arg0) {
        field967 = arg0;
        if (!field967) {
            int var1 = field950.method2824();
            int var2 = field950.method2800();
            int var3 = field950.method2824();
            Statics.field516 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field516[var4][var5] = field950.method2803();
                }
            }
            Statics.field287 = new int[var3];
            Statics.field2144 = new int[var3];
            Statics.field2353 = new int[var3];
            Statics.field815 = new byte[var3][];
            Statics.field555 = new byte[var3][];
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
                        Statics.field287[var7] = var10;
                        Statics.field2144[var7] = Statics.field2434.method3764("m" + var8 + "_" + var9);
                        Statics.field2353[var7] = Statics.field2434.method3764("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method6(var2, var1, true);
            return;
        }
        int var11 = field950.method2845();
        boolean var12 = field950.method2837() == 1;
        int var13 = field950.method2845();
        int var14 = field950.method2824();
        field950.method3056();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field950.method3055(1);
                    if (var18 == 1) {
                        field968[var15][var16][var17] = field950.method3055(26);
                    } else {
                        field968[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field950.method3057();
        Statics.field516 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field516[var19][var20] = field950.method2803();
            }
        }
        Statics.field287 = new int[var14];
        Statics.field2144 = new int[var14];
        Statics.field2353 = new int[var14];
        Statics.field815 = new byte[var14][];
        Statics.field555 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field968[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field287[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field287[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field2144[var21] = Statics.field2434.method3764("m" + var30 + "_" + var31);
                            Statics.field2353[var21] = Statics.field2434.method3764("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method6(var13, var11, !var12);
    }

    @ObfuscatedName("e.gq(IIZI)V")
    public static final void method6(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field502 == arg0 && Statics.field290 == arg1) {
            return;
        }
        Statics.field502 = arg0;
        Statics.field290 = arg1;
        method178(25);
        method2660(class226.field2873, true);
        int var3 = Statics.field340;
        int var4 = Statics.field356;
        Statics.field340 = (arg0 - 6) * 8;
        Statics.field356 = (arg1 - 6) * 8;
        int var5 = Statics.field340 - var3;
        int var6 = Statics.field356 - var4;
        int var7 = Statics.field340;
        int var8 = Statics.field356;
        for (int var9 = 0; var9 < 32768; var9++) {
            class87 var10 = field1159[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1264[var11] -= var5;
                    var10.field1265[var11] -= var6;
                }
                var10.field1234 -= var5 * 128;
                var10.field1210 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class75 var13 = field1049[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1264[var14] -= var5;
                    var13.field1265[var14] -= var6;
                }
                var13.field1234 -= var5 * 128;
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
                        field1086[var25][var21][var22] = field1086[var25][var23][var24];
                    } else {
                        field1086[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class77 var26 = (class77) field1038.method3252(); var26 != null; var26 = (class77) field1038.method3277()) {
            var26.field1190 -= var5;
            var26.field1191 -= var6;
            if (var26.field1190 < 0 || var26.field1191 < 0 || var26.field1190 >= 104 || var26.field1191 >= 104) {
                var26.method3234();
            }
        }
        if (field1139 != 0) {
            field1139 -= var5;
            field1140 -= var6;
        }
        field932 = 0;
        field1153 = false;
        field945 = -1;
        field1034.method3246();
        field1174.method3246();
        for (int var27 = 0; var27 < 4; var27++) {
            field1021[var27].method2695();
        }
    }

    @ObfuscatedName("by.gt(ZI)V")
    public static final void method996(boolean arg0) {
        method966();
        field954++;
        if (field954 < 50 && !arg0) {
            return;
        }
        field954 = 0;
        if (field959 || Statics.field818 == null) {
            return;
        }
        field948.method3054(71);
        try {
            Statics.field818.method2672(field948.field2415, 0, field948.field2408);
            field948.field2408 = 0;
        } catch (IOException var2) {
            field959 = true;
        }
    }

    @ObfuscatedName("fj.gh(B)V")
    public static final void method2745() {
        method996(false);
        field1118 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field815.length; var1++) {
            if (Statics.field2144[var1] != -1 && Statics.field815[var1] == null) {
                Statics.field815[var1] = Statics.field2434.method3720(Statics.field2144[var1], 0);
                if (Statics.field815[var1] == null) {
                    var0 = false;
                    field1118++;
                }
            }
            if (Statics.field2353[var1] != -1 && Statics.field555[var1] == null) {
                Statics.field555[var1] = Statics.field2434.method3705(Statics.field2353[var1], 0, Statics.field516[var1]);
                if (Statics.field555[var1] == null) {
                    var0 = false;
                    field1118++;
                }
            }
        }
        if (!var0) {
            field1114 = 1;
            return;
        }
        field1128 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field815.length; var3++) {
            byte[] var4 = Statics.field555[var3];
            if (var4 != null) {
                int var5 = (Statics.field287[var3] >> 8) * 64 - Statics.field340;
                int var6 = (Statics.field287[var3] & 0xFF) * 64 - Statics.field356;
                if (field967) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class174 var9 = new class174(var4);
                int var10 = -1;
                label1236: while (true) {
                    int var11 = var9.method2823();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2823();
                            if (var16 == 0) {
                                continue label1236;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2810() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class256 var22 = class256.method239(var10);
                                if (var19 != 22 || !field1056 || var22.field3446 != 0 || var22.field3477 == 1 || var22.field3481) {
                                    if (!var22.method4126()) {
                                        field1128++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2823();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2810();
                    }
                }
            }
        }
        if (!var2) {
            field1114 = 2;
            return;
        }
        if (field1114 != 0) {
            method2660(class226.field2873 + class89.field1382 + class89.field1379 + 100 + "%" + class89.field1386, true);
        }
        method966();
        method30();
        method966();
        Statics.field324.method2416();
        method966();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field1021[var23].method2695();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class62.field750[var24][var25][var26] = 0;
                }
            }
        }
        method966();
        Statics.method975();
        int var27 = Statics.field815.length;
        class83.method957();
        method996(true);
        if (!field967) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field287[var28] >> 8) * 64 - Statics.field340;
                int var30 = (Statics.field287[var28] & 0xFF) * 64 - Statics.field356;
                byte[] var31 = Statics.field815[var28];
                if (var31 != null) {
                    method966();
                    int var32 = Statics.field502 * 8 - 48;
                    int var33 = Statics.field290 * 8 - 48;
                    class162[] var34 = field1021;
                    for (int var35 = 0; var35 < 4; var35++) {
                        for (int var36 = 0; var36 < 64; var36++) {
                            for (int var37 = 0; var37 < 64; var37++) {
                                if (var29 + var36 > 0 && var29 + var36 < 103 && var30 + var37 > 0 && var30 + var37 < 103) {
                                    var34[var35].field2308[var29 + var36][var30 + var37] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class174 var38 = new class174(var31);
                    for (int var39 = 0; var39 < 4; var39++) {
                        for (int var40 = 0; var40 < 64; var40++) {
                            for (int var41 = 0; var41 < 64; var41++) {
                                class62.method1833(var38, var39, var29 + var40, var30 + var41, var32, var33, 0);
                            }
                        }
                    }
                }
            }
            for (int var42 = 0; var42 < var27; var42++) {
                int var43 = (Statics.field287[var42] >> 8) * 64 - Statics.field340;
                int var44 = (Statics.field287[var42] & 0xFF) * 64 - Statics.field356;
                byte[] var45 = Statics.field815[var42];
                if (var45 == null && Statics.field290 < 800) {
                    method966();
                    class62.method3027(var43, var44, 64, 64);
                }
            }
            method996(true);
            for (int var46 = 0; var46 < var27; var46++) {
                byte[] var47 = Statics.field555[var46];
                if (var47 != null) {
                    int var48 = (Statics.field287[var46] >> 8) * 64 - Statics.field340;
                    int var49 = (Statics.field287[var46] & 0xFF) * 64 - Statics.field356;
                    method966();
                    class140 var50 = Statics.field324;
                    class162[] var51 = field1021;
                    class174 var52 = new class174(var47);
                    int var53 = -1;
                    while (true) {
                        int var54 = var52.method2823();
                        if (var54 == 0) {
                            break;
                        }
                        var53 += var54;
                        int var55 = 0;
                        while (true) {
                            int var56 = var52.method2823();
                            if (var56 == 0) {
                                break;
                            }
                            var55 += var56 - 1;
                            int var57 = var55 & 0x3F;
                            int var58 = var55 >> 6 & 0x3F;
                            int var59 = var55 >> 12;
                            int var60 = var52.method2810();
                            int var61 = var60 >> 2;
                            int var62 = var60 & 0x3;
                            int var63 = var48 + var58;
                            int var64 = var49 + var57;
                            if (var63 > 0 && var64 > 0 && var63 < 103 && var64 < 103) {
                                int var65 = var59;
                                if ((class62.field750[1][var63][var64] & 0x2) == 2) {
                                    var65 = var59 - 1;
                                }
                                class162 var66 = null;
                                if (var65 >= 0) {
                                    var66 = var51[var65];
                                }
                                class62.method617(var59, var63, var64, var53, var62, var61, var50, var66);
                            }
                        }
                    }
                }
            }
        }
        if (field967) {
            for (int var67 = 0; var67 < 4; var67++) {
                method966();
                for (int var68 = 0; var68 < 13; var68++) {
                    for (int var69 = 0; var69 < 13; var69++) {
                        boolean var70 = false;
                        int var71 = field968[var67][var68][var69];
                        if (var71 != -1) {
                            int var72 = var71 >> 24 & 0x3;
                            int var73 = var71 >> 1 & 0x3;
                            int var74 = var71 >> 14 & 0x3FF;
                            int var75 = var71 >> 3 & 0x7FF;
                            int var76 = (var74 / 8 << 8) + var75 / 8;
                            for (int var77 = 0; var77 < Statics.field287.length; var77++) {
                                if (Statics.field287[var77] == var76 && Statics.field815[var77] != null) {
                                    byte[] var78 = Statics.field815[var77];
                                    int var79 = var68 * 8;
                                    int var80 = var69 * 8;
                                    int var81 = (var74 & 0x7) * 8;
                                    int var82 = (var75 & 0x7) * 8;
                                    class162[] var83 = field1021;
                                    for (int var84 = 0; var84 < 8; var84++) {
                                        for (int var85 = 0; var85 < 8; var85++) {
                                            if (var79 + var84 > 0 && var79 + var84 < 103 && var80 + var85 > 0 && var80 + var85 < 103) {
                                                var83[var67].field2308[var79 + var84][var80 + var85] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class174 var86 = new class174(var78);
                                    for (int var87 = 0; var87 < 4; var87++) {
                                        for (int var88 = 0; var88 < 64; var88++) {
                                            for (int var89 = 0; var89 < 64; var89++) {
                                                if (var72 == var87 && var88 >= var81 && var88 < var81 + 8 && var89 >= var82 && var89 < var82 + 8) {
                                                    int var93 = var88 & 0x7;
                                                    int var94 = var89 & 0x7;
                                                    int var96 = var73 & 0x3;
                                                    int var97;
                                                    if (var96 == 0) {
                                                        var97 = var93;
                                                    } else if (var96 == 1) {
                                                        var97 = var94;
                                                    } else if (var96 == 2) {
                                                        var97 = 7 - var93;
                                                    } else {
                                                        var97 = 7 - var94;
                                                    }
                                                    class62.method1833(var86, var67, var79 + var97, var80 + class216.method1603(var88 & 0x7, var89 & 0x7, var73), 0, 0, var73);
                                                } else {
                                                    class62.method1833(var86, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var70 = true;
                                    break;
                                }
                            }
                        }
                        if (!var70) {
                            int var98 = var67;
                            int var99 = var68 * 8;
                            int var100 = var69 * 8;
                            for (int var101 = 0; var101 < 8; var101++) {
                                for (int var102 = 0; var102 < 8; var102++) {
                                    class62.field764[var98][var99 + var101][var100 + var102] = 0;
                                }
                            }
                            if (var99 > 0) {
                                for (int var103 = 1; var103 < 8; var103++) {
                                    class62.field764[var98][var99][var100 + var103] = class62.field764[var98][var99 - 1][var100 + var103];
                                }
                            }
                            if (var100 > 0) {
                                for (int var104 = 1; var104 < 8; var104++) {
                                    class62.field764[var98][var99 + var104][var100] = class62.field764[var98][var99 + var104][var100 - 1];
                                }
                            }
                            if (var99 > 0 && class62.field764[var98][var99 - 1][var100] != 0) {
                                class62.field764[var98][var99][var100] = class62.field764[var98][var99 - 1][var100];
                            } else if (var100 > 0 && class62.field764[var98][var99][var100 - 1] != 0) {
                                class62.field764[var98][var99][var100] = class62.field764[var98][var99][var100 - 1];
                            } else if (var99 > 0 && var100 > 0 && class62.field764[var98][var99 - 1][var100 - 1] != 0) {
                                class62.field764[var98][var99][var100] = class62.field764[var98][var99 - 1][var100 - 1];
                            }
                        }
                    }
                }
            }
            for (int var105 = 0; var105 < 13; var105++) {
                for (int var106 = 0; var106 < 13; var106++) {
                    int var107 = field968[0][var105][var106];
                    if (var107 == -1) {
                        class62.method3027(var105 * 8, var106 * 8, 8, 8);
                    }
                }
            }
            method996(true);
            for (int var108 = 0; var108 < 4; var108++) {
                method966();
                for (int var109 = 0; var109 < 13; var109++) {
                    label994: for (int var110 = 0; var110 < 13; var110++) {
                        int var111 = field968[var108][var109][var110];
                        if (var111 != -1) {
                            int var112 = var111 >> 24 & 0x3;
                            int var113 = var111 >> 1 & 0x3;
                            int var114 = var111 >> 14 & 0x3FF;
                            int var115 = var111 >> 3 & 0x7FF;
                            int var116 = (var114 / 8 << 8) + var115 / 8;
                            for (int var117 = 0; var117 < Statics.field287.length; var117++) {
                                if (Statics.field287[var117] == var116 && Statics.field555[var117] != null) {
                                    byte[] var118 = Statics.field555[var117];
                                    int var119 = var109 * 8;
                                    int var120 = var110 * 8;
                                    int var121 = (var114 & 0x7) * 8;
                                    int var122 = (var115 & 0x7) * 8;
                                    class140 var123 = Statics.field324;
                                    class162[] var124 = field1021;
                                    class174 var125 = new class174(var118);
                                    int var126 = -1;
                                    while (true) {
                                        int var127 = var125.method2823();
                                        if (var127 == 0) {
                                            continue label994;
                                        }
                                        var126 += var127;
                                        int var128 = 0;
                                        while (true) {
                                            int var129 = var125.method2823();
                                            if (var129 == 0) {
                                                break;
                                            }
                                            var128 += var129 - 1;
                                            int var130 = var128 & 0x3F;
                                            int var131 = var128 >> 6 & 0x3F;
                                            int var132 = var128 >> 12;
                                            int var133 = var125.method2810();
                                            int var134 = var133 >> 2;
                                            int var135 = var133 & 0x3;
                                            if (var112 == var132 && var131 >= var121 && var131 < var121 + 8 && var130 >= var122 && var130 < var122 + 8) {
                                                class256 var136 = class256.method239(var126);
                                                int var137 = var119 + class216.method2731(var131 & 0x7, var130 & 0x7, var113, var136.field3458, var136.field3459, var135);
                                                int var138 = var120 + class216.method2732(var131 & 0x7, var130 & 0x7, var113, var136.field3458, var136.field3459, var135);
                                                if (var137 > 0 && var138 > 0 && var137 < 103 && var138 < 103) {
                                                    int var139 = var108;
                                                    if ((class62.field750[1][var137][var138] & 0x2) == 2) {
                                                        var139 = var108 - 1;
                                                    }
                                                    class162 var140 = null;
                                                    if (var139 >= 0) {
                                                        var140 = var124[var139];
                                                    }
                                                    class62.method617(var108, var137, var138, var126, var113 + var135 & 0x3, var134, var123, var140);
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
        method996(true);
        method30();
        method966();
        class140 var141 = Statics.field324;
        class162[] var142 = field1021;
        for (int var143 = 0; var143 < 4; var143++) {
            for (int var144 = 0; var144 < 104; var144++) {
                for (int var145 = 0; var145 < 104; var145++) {
                    if ((class62.field750[var143][var144][var145] & 0x1) == 1) {
                        int var146 = var143;
                        if ((class62.field750[1][var144][var145] & 0x2) == 2) {
                            var146 = var143 - 1;
                        }
                        if (var146 >= 0) {
                            var142[var146].method2696(var144, var145);
                        }
                    }
                }
            }
        }
        class62.field762 += (int) (Math.random() * 5.0D) - 2;
        if (class62.field762 < -8) {
            class62.field762 = -8;
        }
        if (class62.field762 > 8) {
            class62.field762 = 8;
        }
        class62.field763 += (int) (Math.random() * 5.0D) - 2;
        if (class62.field763 < -16) {
            class62.field763 = -16;
        }
        if (class62.field763 > 16) {
            class62.field763 = 16;
        }
        for (int var147 = 0; var147 < 4; var147++) {
            byte[][] var148 = Statics.field3670[var147];
            int var149 = (int) Math.sqrt(5100.0D);
            int var150 = var149 * 768 >> 8;
            for (int var151 = 1; var151 < 103; var151++) {
                for (int var152 = 1; var152 < 103; var152++) {
                    int var153 = class62.field764[var147][var152 + 1][var151] - class62.field764[var147][var152 - 1][var151];
                    int var154 = class62.field764[var147][var152][var151 + 1] - class62.field764[var147][var152][var151 - 1];
                    int var155 = (int) Math.sqrt((double) (var154 * var154 + var153 * var153 + 65536));
                    int var156 = (var153 << 8) / var155;
                    int var157 = 65536 / var155;
                    int var158 = (var154 << 8) / var155;
                    int var159 = (var158 * -50 + var156 * -50 + var157 * -10) / var150 + 96;
                    int var160 = (var148[var152][var151] >> 1) + (var148[var152][var151 + 1] >> 3) + (var148[var152][var151 - 1] >> 2) + (var148[var152 - 1][var151] >> 2) + (var148[var152 + 1][var151] >> 3);
                    Statics.field775[var152][var151] = var159 - var160;
                }
            }
            for (int var161 = 0; var161 < 104; var161++) {
                Statics.field2649[var161] = 0;
                Statics.field754[var161] = 0;
                Statics.field2141[var161] = 0;
                Statics.field553[var161] = 0;
                Statics.field811[var161] = 0;
            }
            for (int var162 = -5; var162 < 109; var162++) {
                for (int var163 = 0; var163 < 104; var163++) {
                    int var164 = var162 + 5;
                    int var10002;
                    if (var164 >= 0 && var164 < 104) {
                        int var165 = Statics.field752[var147][var164][var163] & 0xFF;
                        if (var165 > 0) {
                            class247 var166 = class247.method1418(var165 - 1);
                            Statics.field2649[var163] += var166.field3357;
                            Statics.field754[var163] += var166.field3351;
                            Statics.field2141[var163] += var166.field3353;
                            Statics.field553[var163] += var166.field3354;
                            var10002 = Statics.field811[var163]++;
                        }
                    }
                    int var167 = var162 - 5;
                    if (var167 >= 0 && var167 < 104) {
                        int var168 = Statics.field752[var147][var167][var163] & 0xFF;
                        if (var168 > 0) {
                            class247 var169 = class247.method1418(var168 - 1);
                            Statics.field2649[var163] -= var169.field3357;
                            Statics.field754[var163] -= var169.field3351;
                            Statics.field2141[var163] -= var169.field3353;
                            Statics.field553[var163] -= var169.field3354;
                            var10002 = Statics.field811[var163]--;
                        }
                    }
                }
                if (var162 >= 1 && var162 < 103) {
                    int var170 = 0;
                    int var171 = 0;
                    int var172 = 0;
                    int var173 = 0;
                    int var174 = 0;
                    for (int var175 = -5; var175 < 109; var175++) {
                        int var176 = var175 + 5;
                        if (var176 >= 0 && var176 < 104) {
                            var170 += Statics.field2649[var176];
                            var171 += Statics.field754[var176];
                            var172 += Statics.field2141[var176];
                            var173 += Statics.field553[var176];
                            var174 += Statics.field811[var176];
                        }
                        int var177 = var175 - 5;
                        if (var177 >= 0 && var177 < 104) {
                            var170 -= Statics.field2649[var177];
                            var171 -= Statics.field754[var177];
                            var172 -= Statics.field2141[var177];
                            var173 -= Statics.field553[var177];
                            var174 -= Statics.field811[var177];
                        }
                        if (var175 >= 1 && var175 < 103 && (!field1056 || (class62.field750[0][var162][var175] & 0x2) != 0 || (class62.field750[var147][var162][var175] & 0x10) == 0)) {
                            if (var147 < class62.field760) {
                                class62.field760 = var147;
                            }
                            int var178 = Statics.field752[var147][var162][var175] & 0xFF;
                            int var179 = Statics.field756[var147][var162][var175] & 0xFF;
                            if (var178 > 0 || var179 > 0) {
                                int var180 = class62.field764[var147][var162][var175];
                                int var181 = class62.field764[var147][var162 + 1][var175];
                                int var182 = class62.field764[var147][var162 + 1][var175 + 1];
                                int var183 = class62.field764[var147][var162][var175 + 1];
                                int var184 = Statics.field775[var162][var175];
                                int var185 = Statics.field775[var162 + 1][var175];
                                int var186 = Statics.field775[var162 + 1][var175 + 1];
                                int var187 = Statics.field775[var162][var175 + 1];
                                int var188 = -1;
                                int var189 = -1;
                                if (var178 > 0) {
                                    int var190 = var170 * 256 / var173;
                                    int var191 = var171 / var174;
                                    int var192 = var172 / var174;
                                    var188 = class38.method42(var190, var191, var192);
                                    int var193 = class62.field762 + var190 & 0xFF;
                                    int var194 = class62.field763 + var192;
                                    if (var194 < 0) {
                                        var194 = 0;
                                    } else if (var194 > 255) {
                                        var194 = 255;
                                    }
                                    var189 = class38.method42(var193, var191, var194);
                                }
                                if (var147 > 0) {
                                    boolean var195 = true;
                                    if (var178 == 0 && Statics.field1398[var147][var162][var175] != 0) {
                                        var195 = false;
                                    }
                                    if (var179 > 0 && !class260.method4016(var179 - 1).field3594) {
                                        var195 = false;
                                    }
                                    if (var195 && var180 == var181 && var180 == var182 && var180 == var183) {
                                        Statics.field751[var147][var162][var175] |= 0x924;
                                    }
                                }
                                int var196 = 0;
                                if (var189 != -1) {
                                    var196 = class137.field2035[class62.method572(var189, 96)];
                                }
                                if (var179 == 0) {
                                    var141.method2410(var147, var162, var175, 0, 0, -1, var180, var181, var182, var183, class62.method572(var188, var184), class62.method572(var188, var185), class62.method572(var188, var186), class62.method572(var188, var187), 0, 0, 0, 0, var196, 0);
                                } else {
                                    int var197 = Statics.field1398[var147][var162][var175] + 1;
                                    byte var198 = Statics.field3731[var147][var162][var175];
                                    class260 var199 = class260.method4016(var179 - 1);
                                    int var200 = var199.field3602;
                                    int var201;
                                    int var202;
                                    if (var200 >= 0) {
                                        var201 = Statics.field2029.method2109(var200);
                                        var202 = -1;
                                    } else if (var199.field3593 == 16711935) {
                                        var202 = -2;
                                        var200 = -1;
                                        var201 = -2;
                                    } else {
                                        var202 = class38.method42(var199.field3597, var199.field3591, var199.field3592);
                                        int var203 = class62.field762 + var199.field3597 & 0xFF;
                                        int var204 = class62.field763 + var199.field3592;
                                        if (var204 < 0) {
                                            var204 = 0;
                                        } else if (var204 > 255) {
                                            var204 = 255;
                                        }
                                        var201 = class38.method42(var203, var199.field3591, var204);
                                    }
                                    int var205 = 0;
                                    if (var201 != -2) {
                                        var205 = class137.field2035[class62.method249(var201, 96)];
                                    }
                                    if (var199.field3596 != -1) {
                                        int var206 = class62.field762 + var199.field3600 & 0xFF;
                                        int var207 = class62.field763 + var199.field3599;
                                        if (var207 < 0) {
                                            var207 = 0;
                                        } else if (var207 > 255) {
                                            var207 = 255;
                                        }
                                        int var208 = class38.method42(var206, var199.field3601, var207);
                                        var205 = class137.field2035[class62.method249(var208, 96)];
                                    }
                                    var141.method2410(var147, var162, var175, var197, var198, var200, var180, var181, var182, var183, class62.method572(var188, var184), class62.method572(var188, var185), class62.method572(var188, var186), class62.method572(var188, var187), class62.method249(var202, var184), class62.method249(var202, var185), class62.method249(var202, var186), class62.method249(var202, var187), var196, var205);
                                }
                            }
                        }
                    }
                }
            }
            for (int var209 = 1; var209 < 103; var209++) {
                for (int var210 = 1; var210 < 103; var210++) {
                    var141.method2409(var147, var210, var209, class62.method61(var147, var210, var209));
                }
            }
            Statics.field752[var147] = (byte[][]) null;
            Statics.field756[var147] = (byte[][]) null;
            Statics.field1398[var147] = (byte[][]) null;
            Statics.field3731[var147] = (byte[][]) null;
            Statics.field3670[var147] = (byte[][]) null;
        }
        var141.method2436(-50, -10, -50);
        for (int var211 = 0; var211 < 104; var211++) {
            for (int var212 = 0; var212 < 104; var212++) {
                if ((class62.field750[1][var211][var212] & 0x2) == 2) {
                    var141.method2407(var211, var212);
                }
            }
        }
        int var213 = 1;
        int var214 = 2;
        int var215 = 4;
        for (int var216 = 0; var216 < 4; var216++) {
            if (var216 > 0) {
                var213 <<= 0x3;
                var214 <<= 0x3;
                var215 <<= 0x3;
            }
            for (int var217 = 0; var217 <= var216; var217++) {
                for (int var218 = 0; var218 <= 104; var218++) {
                    for (int var219 = 0; var219 <= 104; var219++) {
                        if ((Statics.field751[var217][var219][var218] & var213) != 0) {
                            int var220 = var218;
                            int var221 = var218;
                            int var222 = var217;
                            int var223 = var217;
                            while (var220 > 0 && (Statics.field751[var217][var219][var220 - 1] & var213) != 0) {
                                var220--;
                            }
                            while (var221 < 104 && (Statics.field751[var217][var219][var221 + 1] & var213) != 0) {
                                var221++;
                            }
                            label729: while (var222 > 0) {
                                for (int var224 = var220; var224 <= var221; var224++) {
                                    if ((Statics.field751[var222 - 1][var219][var224] & var213) == 0) {
                                        break label729;
                                    }
                                }
                                var222--;
                            }
                            label718: while (var223 < var216) {
                                for (int var225 = var220; var225 <= var221; var225++) {
                                    if ((Statics.field751[var223 + 1][var219][var225] & var213) == 0) {
                                        break label718;
                                    }
                                }
                                var223++;
                            }
                            int var226 = (var223 + 1 - var222) * (var221 - var220 + 1);
                            if (var226 >= 8) {
                                short var227 = 240;
                                int var228 = class62.field764[var223][var219][var220] - var227;
                                int var229 = class62.field764[var222][var219][var220];
                                class140.method2408(var216, 1, var219 * 128, var219 * 128, var220 * 128, var221 * 128 + 128, var228, var229);
                                for (int var230 = var222; var230 <= var223; var230++) {
                                    for (int var231 = var220; var231 <= var221; var231++) {
                                        Statics.field751[var230][var219][var231] &= ~var213;
                                    }
                                }
                            }
                        }
                        if ((Statics.field751[var217][var219][var218] & var214) != 0) {
                            int var232 = var219;
                            int var233 = var219;
                            int var234 = var217;
                            int var235 = var217;
                            while (var232 > 0 && (Statics.field751[var217][var232 - 1][var218] & var214) != 0) {
                                var232--;
                            }
                            while (var233 < 104 && (Statics.field751[var217][var233 + 1][var218] & var214) != 0) {
                                var233++;
                            }
                            label782: while (var234 > 0) {
                                for (int var236 = var232; var236 <= var233; var236++) {
                                    if ((Statics.field751[var234 - 1][var236][var218] & var214) == 0) {
                                        break label782;
                                    }
                                }
                                var234--;
                            }
                            label771: while (var235 < var216) {
                                for (int var237 = var232; var237 <= var233; var237++) {
                                    if ((Statics.field751[var235 + 1][var237][var218] & var214) == 0) {
                                        break label771;
                                    }
                                }
                                var235++;
                            }
                            int var238 = (var235 + 1 - var234) * (var233 - var232 + 1);
                            if (var238 >= 8) {
                                short var239 = 240;
                                int var240 = class62.field764[var235][var232][var218] - var239;
                                int var241 = class62.field764[var234][var232][var218];
                                class140.method2408(var216, 2, var232 * 128, var233 * 128 + 128, var218 * 128, var218 * 128, var240, var241);
                                for (int var242 = var234; var242 <= var235; var242++) {
                                    for (int var243 = var232; var243 <= var233; var243++) {
                                        Statics.field751[var242][var243][var218] &= ~var214;
                                    }
                                }
                            }
                        }
                        if ((Statics.field751[var217][var219][var218] & var215) != 0) {
                            int var244 = var219;
                            int var245 = var219;
                            int var246 = var218;
                            int var247 = var218;
                            while (var246 > 0 && (Statics.field751[var217][var219][var246 - 1] & var215) != 0) {
                                var246--;
                            }
                            while (var247 < 104 && (Statics.field751[var217][var219][var247 + 1] & var215) != 0) {
                                var247++;
                            }
                            label835: while (var244 > 0) {
                                for (int var248 = var246; var248 <= var247; var248++) {
                                    if ((Statics.field751[var217][var244 - 1][var248] & var215) == 0) {
                                        break label835;
                                    }
                                }
                                var244--;
                            }
                            label824: while (var245 < 104) {
                                for (int var249 = var246; var249 <= var247; var249++) {
                                    if ((Statics.field751[var217][var245 + 1][var249] & var215) == 0) {
                                        break label824;
                                    }
                                }
                                var245++;
                            }
                            if ((var245 - var244 + 1) * (var247 - var246 + 1) >= 4) {
                                int var250 = class62.field764[var217][var244][var246];
                                class140.method2408(var216, 4, var244 * 128, var245 * 128 + 128, var246 * 128, var247 * 128 + 128, var250, var250);
                                for (int var251 = var244; var251 <= var245; var251++) {
                                    for (int var252 = var246; var252 <= var247; var252++) {
                                        Statics.field751[var217][var251][var252] &= ~var215;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method996(true);
        int var253 = class62.field760;
        if (var253 > Statics.field890) {
            var253 = Statics.field890;
        }
        if (var253 < Statics.field890 - 1) {
            int var254 = Statics.field890 - 1;
        }
        if (field1056) {
            Statics.field324.method2458(class62.field760);
        } else {
            Statics.field324.method2458(0);
        }
        for (int var255 = 0; var255 < 104; var255++) {
            for (int var256 = 0; var256 < 104; var256++) {
                method621(var255, var256);
            }
        }
        method966();
        for (class77 var257 = (class77) field1038.method3252(); var257 != null; var257 = (class77) field1038.method3277()) {
            if (var257.field1189 == -1) {
                var257.field1199 = 0;
                method658(var257);
            } else {
                var257.method3234();
            }
        }
        class256.field3454.method3180();
        if (Statics.field2818.method759()) {
            field948.method3054(194);
            field948.method2798(1057001181);
        }
        if (!field967) {
            int var258 = (Statics.field502 - 6) / 8;
            int var259 = (Statics.field502 + 6) / 8;
            int var260 = (Statics.field290 - 6) / 8;
            int var261 = (Statics.field290 + 6) / 8;
            for (int var262 = var258 - 1; var262 <= var259 + 1; var262++) {
                for (int var263 = var260 - 1; var263 <= var261 + 1; var263++) {
                    if (var262 < var258 || var262 > var259 || var263 < var260 || var263 > var261) {
                        Statics.field2434.method3717("m" + var262 + "_" + var263);
                        Statics.field2434.method3717("l" + var262 + "_" + var263);
                    }
                }
            }
        }
        method178(30);
        method966();
        class62.method657();
        field948.method3054(9);
        Statics.field708.method2594();
        for (int var264 = 0; var264 < 32; var264++) {
            field703[var264] = 0L;
        }
        for (int var265 = 0; var265 < 32; var265++) {
            field704[var265] = 0L;
        }
        Statics.field698 = 0;
    }

    @ObfuscatedName("eh.gc(II)V")
    public static final void method2593(int arg0) {
        int[] var1 = Statics.field1269.field3783;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class62.field750[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field324.method2439(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class62.field750[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field324.method2439(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1269.method4603();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class62.field750[arg0][var10][var9] & 0x18) == 0) {
                    method177(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class62.field750[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method177(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1135 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field324.method2486(Statics.field890, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class256.method239(var14).field3471;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field1021[Statics.field890].field2308;
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
                        field1138[field1135] = Statics.field3305[var15].method3886(false);
                        field1181[field1135] = var16;
                        field901[field1135] = var17;
                        field1135++;
                    }
                }
            }
        }
        Statics.field1297.method4577();
    }

    @ObfuscatedName("x.gj(IIIIIS)V")
    public static final void method177(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field324.method2411(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field324.method2554(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1269.field3783;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class256 var13 = class256.method239(var12);
            if (var13.field3472 == -1) {
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
                class285 var14 = Statics.field926[var13.field3472];
                if (var14 != null) {
                    int var15 = (var13.field3458 * 4 - var14.field3774) / 2;
                    int var16 = (var13.field3459 * 4 - var14.field3775) / 2;
                    var14.method4594(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3459) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field324.method2433(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field324.method2554(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class256 var22 = class256.method239(var21);
            if (var22.field3472 != -1) {
                class285 var23 = Statics.field926[var22.field3472];
                if (var23 != null) {
                    int var24 = (var22.field3458 * 4 - var23.field3774) / 2;
                    int var25 = (var22.field3459 * 4 - var23.field3775) / 2;
                    var23.method4594(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3459) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1269.field3783;
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
        int var29 = Statics.field324.method2486(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class256 var31 = class256.method239(var30);
        if (var31.field3472 == -1) {
            return;
        }
        class285 var32 = Statics.field926[var31.field3472];
        if (var32 != null) {
            int var33 = (var31.field3458 * 4 - var32.field3774) / 2;
            int var34 = (var31.field3459 * 4 - var32.field3775) / 2;
            var32.method4594(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3459) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.gd(I)Z")
    public final boolean method1189() {
        if (Statics.field818 == null) {
            return false;
        }
        try {
            int var1 = Statics.field818.method2664();
            if (var1 == 0) {
                return false;
            }
            if (field952 == -1) {
                Statics.field818.method2665(field950.field2415, 0, 1);
                field950.field2408 = 0;
                field952 = field950.method3074();
                field951 = class273.field3701[field952];
                var1--;
            }
            if (field951 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                Statics.field818.method2665(field950.field2415, 0, 1);
                field951 = field950.field2415[0] & 0xFF;
                var1--;
            }
            if (field951 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                Statics.field818.method2665(field950.field2415, 0, 2);
                field950.field2408 = 0;
                field951 = field950.method2824();
                var1 -= 2;
            }
            if (var1 < field951) {
                return false;
            }
            field950.field2408 = 0;
            Statics.field818.method2665(field950.field2415, 0, field951);
            field953 = 0;
            field957 = field956;
            field956 = field1101;
            field1101 = field952;
            if (field952 == 206) {
                int var2 = field950.method2810();
                int var3 = field950.method2810();
                int var4 = field950.method2810();
                int var5 = field950.method2810();
                field1154[var2] = true;
                field1130[var2] = var3;
                field1016[var2] = var4;
                field1157[var2] = var5;
                field983[var2] = 0;
                field952 = -1;
                return true;
            }
            if (field952 == 78) {
                if (field1067 != -1) {
                    method14(field1067, 0);
                }
                field952 = -1;
                return true;
            }
            if (field952 == 146) {
                for (int var6 = 0; var6 < class212.field2616.length; var6++) {
                    if (class212.field2616[var6] != class212.field2614[var6]) {
                        class212.field2616[var6] = class212.field2614[var6];
                        method456(var6);
                        field1093[++field1027 - 1 & 0x1F] = var6;
                    }
                }
                field952 = -1;
                return true;
            }
            if (field952 == 71) {
                Statics.field1481 = class277.method1026(field950.method2810());
                field952 = -1;
                return true;
            }
            if (field952 == 101) {
                boolean var7 = field950.method2810() == 1;
                if (var7) {
                    Statics.field1922 = class176.method2747() - field950.method2813();
                    Statics.field1182 = new class14(field950, true);
                } else {
                    Statics.field1182 = null;
                }
                field1103 = field1092;
                field952 = -1;
                return true;
            }
            if (field952 == 24) {
                Statics.field438 = field950.method2978();
                Statics.field415 = field950.method2839();
                while (field950.field2408 < field951) {
                    field952 = field950.method2810();
                    method452();
                }
                field952 = -1;
                return true;
            }
            if (field952 == 33) {
                int var8 = field950.method2803();
                int var9 = field950.method2824();
                if (var8 < -70000) {
                    var9 += 32768;
                }
                class217 var10;
                if (var8 >= 0) {
                    var10 = class217.method3680(var8);
                } else {
                    var10 = null;
                }
                while (field950.field2408 < field951) {
                    int var11 = field950.method2823();
                    int var12 = field950.method2824();
                    int var13 = 0;
                    if (var12 != 0) {
                        var13 = field950.method2810();
                        if (var13 == 255) {
                            var13 = field950.method2803();
                        }
                    }
                    if (var10 != null && var11 >= 0 && var11 < var10.field2773.length) {
                        var10.field2773[var11] = var12;
                        var10.field2774[var11] = var13;
                    }
                    class64.method1542(var9, var11, var12 - 1, var13);
                }
                if (var10 != null) {
                    Statics.method951(var10);
                }
                method795();
                field1095[++field1096 - 1 & 0x1F] = var9 & 0x7FFF;
                field952 = -1;
                return true;
            }
            if (field952 == 42) {
                field1173 = 1;
                field1100 = field1092;
                field952 = -1;
                return true;
            }
            if (field952 == 72) {
                int var14 = field950.method2824();
                int var15 = field950.method2845();
                int var16 = field950.method2847();
                int var17 = field950.method2855();
                class217 var18 = class217.method3680(var17);
                if (var18.field2706 != var15 || var18.field2727 != var14 || var18.field2738 != var16) {
                    var18.field2706 = var15;
                    var18.field2727 = var14;
                    var18.field2738 = var16;
                    Statics.method951(var18);
                }
                field952 = -1;
                return true;
            }
            if (field952 == 136) {
                field1088 = field950.method2810();
                field952 = -1;
                return true;
            }
            if (field952 == 150) {
                method1(true);
                field952 = -1;
                return true;
            }
            if (field952 == 55) {
                int var19 = field950.method2855();
                Statics.field835 = Statics.field692.method2633(var19);
                field952 = -1;
                return true;
            }
            if (field952 == 82) {
                method179(true);
                field950.method3074();
                int var20 = field950.method2824();
                class180 var21 = field950;
                int var22 = var21.field2408;
                class97.field1494 = 0;
                int var23 = 0;
                var21.method3056();
                for (int var24 = 0; var24 < class97.field1488; var24++) {
                    int var25 = class97.field1492[var24];
                    if ((class97.field1490[var25] & 0x1) == 0) {
                        if (var23 > 0) {
                            var23--;
                            class97.field1490[var25] = (byte) (class97.field1490[var25] | 0x2);
                        } else {
                            int var26 = var21.method3055(1);
                            if (var26 == 0) {
                                var23 = class97.method1381(var21);
                                class97.field1490[var25] = (byte) (class97.field1490[var25] | 0x2);
                            } else {
                                class97.method5(var21, var25);
                            }
                        }
                    }
                }
                var21.method3057();
                if (var23 != 0) {
                    throw new RuntimeException();
                }
                var21.method3056();
                for (int var27 = 0; var27 < class97.field1488; var27++) {
                    int var28 = class97.field1492[var27];
                    if ((class97.field1490[var28] & 0x1) != 0) {
                        if (var23 > 0) {
                            var23--;
                            class97.field1490[var28] = (byte) (class97.field1490[var28] | 0x2);
                        } else {
                            int var29 = var21.method3055(1);
                            if (var29 == 0) {
                                var23 = class97.method1381(var21);
                                class97.field1490[var28] = (byte) (class97.field1490[var28] | 0x2);
                            } else {
                                class97.method5(var21, var28);
                            }
                        }
                    }
                }
                var21.method3057();
                if (var23 != 0) {
                    throw new RuntimeException();
                }
                var21.method3056();
                for (int var30 = 0; var30 < class97.field1500; var30++) {
                    int var31 = class97.field1496[var30];
                    if ((class97.field1490[var31] & 0x1) != 0) {
                        if (var23 > 0) {
                            var23--;
                            class97.field1490[var31] = (byte) (class97.field1490[var31] | 0x2);
                        } else {
                            int var32 = var21.method3055(1);
                            if (var32 == 0) {
                                var23 = class97.method1381(var21);
                                class97.field1490[var31] = (byte) (class97.field1490[var31] | 0x2);
                            } else if (class97.method240(var21, var31)) {
                                class97.field1490[var31] = (byte) (class97.field1490[var31] | 0x2);
                            }
                        }
                    }
                }
                var21.method3057();
                if (var23 != 0) {
                    throw new RuntimeException();
                }
                var21.method3056();
                for (int var33 = 0; var33 < class97.field1500; var33++) {
                    int var34 = class97.field1496[var33];
                    if ((class97.field1490[var34] & 0x1) == 0) {
                        if (var23 > 0) {
                            var23--;
                            class97.field1490[var34] = (byte) (class97.field1490[var34] | 0x2);
                        } else {
                            int var35 = var21.method3055(1);
                            if (var35 == 0) {
                                var23 = class97.method1381(var21);
                                class97.field1490[var34] = (byte) (class97.field1490[var34] | 0x2);
                            } else if (class97.method240(var21, var34)) {
                                class97.field1490[var34] = (byte) (class97.field1490[var34] | 0x2);
                            }
                        }
                    }
                }
                var21.method3057();
                if (var23 != 0) {
                    throw new RuntimeException();
                }
                class97.field1488 = 0;
                class97.field1500 = 0;
                for (int var36 = 1; var36 < 2048; var36++) {
                    class97.field1490[var36] = (byte) (class97.field1490[var36] >> 1);
                    class75 var37 = field1049[var36];
                    if (var37 == null) {
                        class97.field1496[++class97.field1500 - 1] = var36;
                    } else {
                        class97.field1492[++class97.field1488 - 1] = var36;
                    }
                }
                class97.method1555(var21);
                if (var21.field2408 - var22 != var20) {
                    throw new RuntimeException(var21.field2408 - var22 + " " + var20);
                }
                field952 = -1;
                return true;
            }
            if (field952 == 109) {
                class180 var38 = field950;
                int var39 = field951;
                class280 var40 = new class280();
                var40.field3744 = var38.method2810();
                var40.field3742 = var38.method2803();
                var40.field3749 = new int[var40.field3744];
                var40.field3745 = new int[var40.field3744];
                var40.field3746 = new Field[var40.field3744];
                var40.field3747 = new int[var40.field3744];
                var40.field3743 = new Method[var40.field3744];
                var40.field3748 = new byte[var40.field3744][][];
                for (int var41 = 0; var41 < var40.field3744; var41++) {
                    try {
                        int var42 = var38.method2810();
                        if (var42 == 0 || var42 == 1 || var42 == 2) {
                            String var43 = var38.method2818();
                            String var44 = var38.method2818();
                            int var45 = 0;
                            if (var42 == 1) {
                                var45 = var38.method2803();
                            }
                            var40.field3749[var41] = var42;
                            var40.field3747[var41] = var45;
                            if (class281.method1466(var43).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var40.field3746[var41] = class281.method1466(var43).getDeclaredField(var44);
                        } else if (var42 == 3 || var42 == 4) {
                            String var46 = var38.method2818();
                            String var47 = var38.method2818();
                            int var48 = var38.method2810();
                            String[] var49 = new String[var48];
                            for (int var50 = 0; var50 < var48; var50++) {
                                var49[var50] = var38.method2818();
                            }
                            String var51 = var38.method2818();
                            byte[][] var52 = new byte[var48][];
                            if (var42 == 3) {
                                for (int var53 = 0; var53 < var48; var53++) {
                                    int var54 = var38.method2803();
                                    var52[var53] = new byte[var54];
                                    var38.method3022(var52[var53], 0, var54);
                                }
                            }
                            var40.field3749[var41] = var42;
                            Class[] var55 = new Class[var48];
                            for (int var56 = 0; var56 < var48; var56++) {
                                var55[var56] = class281.method1466(var49[var56]);
                            }
                            Class var57 = class281.method1466(var51);
                            if (class281.method1466(var46).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var58 = class281.method1466(var46).getDeclaredMethods();
                            Method[] var59 = var58;
                            for (int var60 = 0; var60 < var59.length; var60++) {
                                Method var61 = var59[var60];
                                if (var61.getName().equals(var47)) {
                                    Class[] var62 = var61.getParameterTypes();
                                    if (var55.length == var62.length) {
                                        boolean var63 = true;
                                        for (int var64 = 0; var64 < var55.length; var64++) {
                                            if (var55[var64] != var62[var64]) {
                                                var63 = false;
                                                break;
                                            }
                                        }
                                        if (var63 && var57 == var61.getReturnType()) {
                                            var40.field3743[var41] = var61;
                                        }
                                    }
                                }
                            }
                            var40.field3748[var41] = var52;
                        }
                    } catch (ClassNotFoundException var358) {
                        var40.field3745[var41] = -1;
                    } catch (SecurityException var359) {
                        var40.field3745[var41] = -2;
                    } catch (NullPointerException var360) {
                        var40.field3745[var41] = -3;
                    } catch (Exception var361) {
                        var40.field3745[var41] = -4;
                    } catch (Throwable var362) {
                        var40.field3745[var41] = -5;
                    }
                }
                class281.field3750.method3206(var40);
                field952 = -1;
                return true;
            }
            if (field952 == 236) {
                method795();
                field1073 = field950.method3001();
                field1104 = field1092;
                field952 = -1;
                return true;
            }
            if (field952 == 134) {
                int var70 = field950.method2855();
                int var71 = field950.method2845();
                int var72 = field950.method2837();
                class69 var73 = (class69) field1119.method3190((long) var70);
                if (var73 != null) {
                    method958(var73, var73.field820 != var71);
                }
                method959(var70, var71, var72);
                field952 = -1;
                return true;
            }
            if (field952 == 32) {
                int var74 = field950.method2824();
                int var75 = field950.method2937();
                int var76 = field950.method2800();
                class217 var77 = class217.method3680(var75);
                var77.field2711 = (var74 << 16) + var76;
                field952 = -1;
                return true;
            }
            if (field952 == 17) {
                while (field950.field2408 < field951) {
                    boolean var78 = field950.method2810() == 1;
                    String var79 = field950.method2818();
                    String var80 = field950.method2818();
                    int var81 = field950.method2824();
                    int var82 = field950.method2810();
                    int var83 = field950.method2810();
                    boolean var84 = (var83 & 0x2) != 0;
                    boolean var85 = (var83 & 0x1) != 0;
                    if (var81 > 0) {
                        field950.method2818();
                        field950.method2810();
                        field950.method2803();
                    }
                    field950.method2818();
                    for (int var86 = 0; var86 < field1172; var86++) {
                        class66 var87 = field935[var86];
                        if (var78) {
                            if (var80.equals(var87.field797)) {
                                var87.field797 = var79;
                                var87.field795 = var80;
                                var79 = null;
                                break;
                            }
                        } else if (var79.equals(var87.field797)) {
                            if (var87.field792 != var81) {
                                boolean var88 = true;
                                for (class68 var89 = (class68) field974.method3289(); var89 != null; var89 = (class68) field974.method3288()) {
                                    if (var89.field806.equals(var79)) {
                                        if (var81 != 0 && var89.field808 == 0) {
                                            var89.method3294();
                                            var88 = false;
                                        } else if (var81 == 0 && var89.field808 != 0) {
                                            var89.method3294();
                                            var88 = false;
                                        }
                                    }
                                }
                                if (var88) {
                                    field974.method3290(new class68(var79, var81));
                                }
                                var87.field792 = var81;
                            }
                            var87.field795 = var80;
                            var87.field794 = var82;
                            var87.field796 = var84;
                            var87.field793 = var85;
                            var79 = null;
                            break;
                        }
                    }
                    if (var79 != null && field1172 < 400) {
                        class66 var90 = new class66();
                        field935[field1172] = var90;
                        var90.field797 = var79;
                        var90.field795 = var80;
                        var90.field792 = var81;
                        var90.field794 = var82;
                        var90.field796 = var84;
                        var90.field793 = var85;
                        field1172++;
                    }
                }
                field1173 = 2;
                field1100 = field1092;
                boolean var91 = false;
                int var92 = field1172;
                while (var92 > 0) {
                    boolean var93 = true;
                    var92--;
                    for (int var94 = 0; var94 < var92; var94++) {
                        boolean var95 = false;
                        class66 var96 = field935[var94];
                        class66 var97 = field935[var94 + 1];
                        if (field902 != var96.field792 && field902 == var97.field792) {
                            var95 = true;
                        }
                        if (!var95 && var96.field792 == 0 && var97.field792 != 0) {
                            var95 = true;
                        }
                        if (!var95 && !var96.field796 && var97.field796) {
                            var95 = true;
                        }
                        if (!var95 && !var96.field793 && var97.field793) {
                            var95 = true;
                        }
                        if (var95) {
                            class66 var98 = field935[var94];
                            field935[var94] = field935[var94 + 1];
                            field935[var94 + 1] = var98;
                            var93 = false;
                        }
                    }
                    if (var93) {
                        break;
                    }
                }
                field952 = -1;
                return true;
            }
            if (field952 == 127) {
                int var99 = field950.method2893();
                class217 var100 = class217.method3680(var99);
                var100.field2696 = 3;
                var100.field2699 = Statics.field341.field864.method3597();
                Statics.method951(var100);
                field952 = -1;
                return true;
            }
            if (field952 == 31) {
                String var101 = field950.method2818();
                int var102 = field950.method2855();
                class217 var103 = class217.method3680(var102);
                if (!var101.equals(var103.field2715)) {
                    var103.field2715 = var101;
                    Statics.method951(var103);
                }
                field952 = -1;
                return true;
            }
            if (field952 == 224) {
                int var104 = field950.method2855();
                int var105 = field950.method2847();
                class212.field2614[var105] = var104;
                if (class212.field2616[var105] != var104) {
                    class212.field2616[var105] = var104;
                }
                method456(var105);
                field1093[++field1027 - 1 & 0x1F] = var105;
                field952 = -1;
                return true;
            }
            if (field952 == 2) {
                field955 = field950.method2810();
                field1124 = field950.method2810();
                field952 = -1;
                return true;
            }
            if (field952 == 98 || field952 == 66 || field952 == 173 || field952 == 137 || field952 == 165 || field952 == 111 || field952 == 4 || field952 == 209 || field952 == 37 || field952 == 190) {
                method452();
                field952 = -1;
                return true;
            }
            if (field952 == 113) {
                field920 = field950.method2800() * 30;
                field1104 = field1092;
                field952 = -1;
                return true;
            }
            if (field952 == 13) {
                String var106 = field950.method2818();
                Statics.field2811 = var106;
                try {
                    String var107 = Statics.field2818.getParameter(class275.field3717.field3726);
                    String var108 = Statics.field2818.getParameter(class275.field3724.field3726);
                    String var109 = var107 + "settings=" + var106 + "; version=1; path=/; domain=" + var108;
                    String var110;
                    if (var106.length() == 0) {
                        var110 = var109 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var110 = var109 + "; Expires=" + class183.method1896(class176.method2747() + 94608000000L) + "; Max-Age=" + 94608000L;
                    }
                    client var111 = Statics.field2818;
                    String var112 = "document.cookie=\"" + var110 + "\"";
                    JSObject.getWindow(var111).eval(var112);
                } catch (Throwable var356) {
                }
                field952 = -1;
                return true;
            }
            if (field952 == 158) {
                int var114 = field950.method2824();
                int var115 = field950.method2803();
                int var116 = var114 >> 10 & 0x1F;
                int var117 = var114 >> 5 & 0x1F;
                int var118 = var114 & 0x1F;
                int var119 = (var118 << 3) + (var116 << 19) + (var117 << 11);
                class217 var120 = class217.method3680(var115);
                if (var120.field2761 != var119) {
                    var120.field2761 = var119;
                    Statics.method951(var120);
                }
                field952 = -1;
                return true;
            }
            if (field952 == 15) {
                int var121 = field950.method2800();
                int var122 = field950.method2937();
                class217 var123 = class217.method3680(var122);
                if (var123 != null && var123.field2657 == 0) {
                    if (var121 > var123.field2709 - var123.field2671) {
                        var121 = var123.field2709 - var123.field2671;
                    }
                    if (var121 < 0) {
                        var121 = 0;
                    }
                    if (var123.field2677 != var121) {
                        var123.field2677 = var121;
                        Statics.method951(var123);
                    }
                }
                field952 = -1;
                return true;
            }
            if (field952 == 141) {
                int var124 = field950.method2803();
                int var125 = field950.method2824();
                if (var124 < -70000) {
                    var125 += 32768;
                }
                class217 var126;
                if (var124 >= 0) {
                    var126 = class217.method3680(var124);
                } else {
                    var126 = null;
                }
                if (var126 != null) {
                    for (int var127 = 0; var127 < var126.field2773.length; var127++) {
                        var126.field2773[var127] = 0;
                        var126.field2774[var127] = 0;
                    }
                }
                class64.method679(var125);
                int var128 = field950.method2824();
                for (int var129 = 0; var129 < var128; var129++) {
                    int var130 = field950.method2847();
                    int var131 = field950.method2978();
                    if (var131 == 255) {
                        var131 = field950.method2893();
                    }
                    if (var126 != null && var129 < var126.field2773.length) {
                        var126.field2773[var129] = var130;
                        var126.field2774[var129] = var131;
                    }
                    class64.method1542(var125, var129, var130 - 1, var131);
                }
                if (var126 != null) {
                    Statics.method951(var126);
                }
                method795();
                field1095[++field1096 - 1 & 0x1F] = var125 & 0x7FFF;
                field952 = -1;
                return true;
            }
            if (field952 == 167) {
                int var132 = field950.method2837();
                String var133 = field950.method2818();
                int var134 = field950.method2837();
                if (var132 >= 1 && var132 <= 8) {
                    if (var133.equalsIgnoreCase("null")) {
                        var133 = null;
                    }
                    field1033[var132 - 1] = var133;
                    field1146[var132 - 1] = var134 == 0;
                }
                field952 = -1;
                return true;
            }
            if (field952 == 1) {
                int var135 = field950.method2803();
                int var136 = field950.method2803();
                if (Statics.field322 == null || !Statics.field322.isValid()) {
                    try {
                        Iterator var137 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var137.hasNext()) {
                            GarbageCollectorMXBean var138 = (GarbageCollectorMXBean) var137.next();
                            if (var138.isValid()) {
                                Statics.field322 = var138;
                                field1184 = -1L;
                                field1183 = -1L;
                            }
                        }
                    } catch (Throwable var357) {
                    }
                }
                long var140 = class176.method2747();
                int var142 = -1;
                if (Statics.field322 != null) {
                    long var143 = Statics.field322.getCollectionTime();
                    if (field1183 != -1L) {
                        long var145 = var143 - field1183;
                        long var147 = var140 - field1184;
                        if (var147 != 0L) {
                            var142 = (int) (var145 * 100L / var147);
                        }
                    }
                    field1183 = var143;
                    field1184 = var140;
                }
                field948.method3054(126);
                field948.method2891(var135);
                field948.method2798(var136);
                field948.method2846(field714);
                field948.method2961(var142);
                field952 = -1;
                return true;
            }
            if (field952 == 238) {
                String var149 = field950.method2818();
                class180 var150 = field950;
                String var151 = class266.method2730(var150, 32767);
                String var152 = class265.method4323(Statics.method3545(var151));
                Statics.method19(6, var149, var152);
                field952 = -1;
                return true;
            }
            if (field952 == 63) {
                while (field950.field2408 < field951) {
                    int var153 = field950.method2810();
                    boolean var154 = (var153 & 0x1) == 1;
                    String var155 = field950.method2818();
                    String var156 = field950.method2818();
                    field950.method2818();
                    for (int var157 = 0; var157 < field1176; var157++) {
                        class71 var158 = field1149[var157];
                        if (var154) {
                            if (var156.equals(var158.field838)) {
                                var158.field838 = var155;
                                var158.field837 = var156;
                                var155 = null;
                                break;
                            }
                        } else if (var155.equals(var158.field838)) {
                            var158.field838 = var155;
                            var158.field837 = var156;
                            var155 = null;
                            break;
                        }
                    }
                    if (var155 != null && field1176 < 400) {
                        class71 var159 = new class71();
                        field1149[field1176] = var159;
                        var159.field838 = var155;
                        var159.field837 = var156;
                        field1176++;
                    }
                }
                field1100 = field1092;
                field952 = -1;
                return true;
            }
            if (field952 == 155) {
                int var160 = field950.method2824();
                class64.method3551(var160);
                field1095[++field1096 - 1 & 0x1F] = var160 & 0x7FFF;
                field952 = -1;
                return true;
            }
            if (field952 == 218) {
                field1139 = field950.method2810();
                if (field1139 == 255) {
                    field1139 = 0;
                }
                field1140 = field950.method2810();
                if (field1140 == 255) {
                    field1140 = 0;
                }
                field952 = -1;
                return true;
            }
            if (field952 == 114) {
                field1153 = false;
                for (int var161 = 0; var161 < 5; var161++) {
                    field1154[var161] = false;
                }
                field952 = -1;
                return true;
            }
            if (field952 == 139) {
                int var162 = field950.method2847();
                field1067 = var162;
                this.method1063(false);
                Statics.method210(var162);
                class84.method953(field1067);
                for (int var163 = 0; var163 < 100; var163++) {
                    field1112[var163] = true;
                }
                field952 = -1;
                return true;
            }
            if (field952 == 103) {
                for (int var164 = 0; var164 < field1049.length; var164++) {
                    if (field1049[var164] != null) {
                        field1049[var164].field1261 = -1;
                    }
                }
                for (int var165 = 0; var165 < field1159.length; var165++) {
                    if (field1159[var165] != null) {
                        field1159[var165].field1261 = -1;
                    }
                }
                field952 = -1;
                return true;
            }
            if (field952 == 140) {
                field1064 = field1092;
                if (field951 == 0) {
                    field1132 = null;
                    field965 = null;
                    Statics.field314 = 0;
                    Statics.field2433 = null;
                    field952 = -1;
                    return true;
                }
                field965 = field950.method2818();
                long var166 = field950.method2813();
                field1132 = class269.method3029(var166);
                Statics.field360 = field950.method2811();
                int var168 = field950.method2810();
                if (var168 == 255) {
                    field952 = -1;
                    return true;
                }
                Statics.field314 = var168;
                class76[] var169 = new class76[100];
                for (int var170 = 0; var170 < Statics.field314; var170++) {
                    var169[var170] = new class76();
                    var169[var170].field900 = field950.method2818();
                    var169[var170].field893 = class268.method1830(var169[var170].field900, Statics.field483);
                    var169[var170].field894 = field950.method2824();
                    var169[var170].field896 = field950.method2811();
                    field950.method2818();
                    if (var169[var170].field900.equals(Statics.field341.field873)) {
                        Statics.field3148 = var169[var170].field896;
                    }
                }
                boolean var171 = false;
                int var172 = Statics.field314;
                while (var172 > 0) {
                    boolean var173 = true;
                    var172--;
                    for (int var174 = 0; var174 < var172; var174++) {
                        if (var169[var174].field893.compareTo(var169[var174 + 1].field893) > 0) {
                            class76 var175 = var169[var174];
                            var169[var174] = var169[var174 + 1];
                            var169[var174 + 1] = var175;
                            var173 = false;
                        }
                    }
                    if (var173) {
                        break;
                    }
                }
                Statics.field2433 = var169;
                field952 = -1;
                return true;
            }
            if (field952 == 207) {
                int var176 = field950.method2803();
                class69 var177 = (class69) field1119.method3190((long) var176);
                if (var177 != null) {
                    method958(var177, true);
                }
                if (field1071 != null) {
                    Statics.method951(field1071);
                    field1071 = null;
                }
                field952 = -1;
                return true;
            }
            if (field952 == 64) {
                int var178 = field950.method2845();
                int var179 = field950.method2937();
                class217 var180 = class217.method3680(var179);
                if (var180.field2696 != 1 || var180.field2699 != var178) {
                    var180.field2696 = 1;
                    var180.field2699 = var178;
                    Statics.method951(var180);
                }
                field952 = -1;
                return true;
            }
            if (field952 == 93) {
                class97.method1654();
                for (int var181 = 0; var181 < 2048; var181++) {
                    field1049[var181] = null;
                }
                class97.method896(field950);
                field952 = -1;
                return true;
            }
            if (field952 == 107) {
                field1153 = true;
                Statics.field437 = field950.method2810();
                Statics.field20 = field950.method2810();
                Statics.field416 = field950.method2824();
                Statics.field318 = field950.method2810();
                Statics.field1871 = field950.method2810();
                if (Statics.field1871 >= 100) {
                    Statics.field296 = Statics.field437 * 128 + 64;
                    Statics.field802 = Statics.field20 * 128 + 64;
                    Statics.field1661 = method1347(Statics.field296, Statics.field802, Statics.field890) - Statics.field416;
                }
                field952 = -1;
                return true;
            }
            if (field952 == 247) {
                method795();
                int var182 = field950.method2978();
                int var183 = field950.method2855();
                int var184 = field950.method2978();
                field1043[var184] = var183;
                field1150[var184] = var182;
                field1013[var184] = 1;
                for (int var185 = 0; var185 < 98; var185++) {
                    if (var183 >= class223.field2852[var185]) {
                        field1013[var184] = var185 + 2;
                    }
                }
                field1175[++field1098 - 1 & 0x1F] = var184;
                field952 = -1;
                return true;
            }
            if (field952 == 240) {
                field950.field2408 += 28;
                if (field950.method2833()) {
                    method910(field950, field950.field2408 - 28);
                }
                field952 = -1;
                return true;
            }
            if (field952 == 164) {
                int var186 = field950.method2824();
                if (var186 == 65535) {
                    var186 = -1;
                }
                if (var186 == -1 && !field1144) {
                    Statics.field2517.method3344();
                    class204.field2518 = 1;
                    Statics.field2519 = null;
                } else if (var186 != -1 && field1143 != var186 && field1142 != 0 && !field1144) {
                    class238 var187 = Statics.field2149;
                    int var188 = field1142;
                    class204.field2518 = 1;
                    Statics.field2519 = var187;
                    Statics.field2520 = var186;
                    Statics.field439 = 0;
                    Statics.field2456 = var188;
                    Statics.field1385 = false;
                    Statics.field2305 = 2;
                }
                field1143 = var186;
                field952 = -1;
                return true;
            }
            if (field952 == 80) {
                int var189 = field950.method2800();
                if (var189 == 65535) {
                    var189 = -1;
                }
                int var190 = field950.method2832();
                method862(var189, var190);
                field952 = -1;
                return true;
            }
            if (field952 == 210) {
                int var191 = field950.method2803();
                boolean var192 = field950.method2837() == 1;
                class217 var193 = class217.method3680(var191);
                if (var193.field2700 != var192) {
                    var193.field2700 = var192;
                    Statics.method951(var193);
                }
                field952 = -1;
                return true;
            }
            if (field952 == 239) {
                method2133();
                field952 = -1;
                return false;
            }
            if (field952 == 120) {
                int var194 = field950.method2824();
                if (var194 == 65535) {
                    var194 = -1;
                }
                int var195 = field950.method2803();
                int var196 = field950.method2855();
                class217 var197 = class217.method3680(var195);
                if (var197.field2656) {
                    var197.field2720 = var194;
                    var197.field2776 = var196;
                    class257 var199 = class257.method3684(var194);
                    var197.field2706 = var199.field3509;
                    var197.field2727 = var199.field3510;
                    var197.field2654 = var199.field3542;
                    var197.field2751 = var199.field3517;
                    var197.field2732 = var199.field3513;
                    var197.field2738 = var199.field3512;
                    if (var199.field3503 == 1) {
                        var197.field2713 = 1;
                    } else {
                        var197.field2713 = 2;
                    }
                    if (var197.field2710 > 0) {
                        var197.field2738 = var197.field2738 * 32 / var197.field2710;
                    } else if (var197.field2666 > 0) {
                        var197.field2738 = var197.field2738 * 32 / var197.field2666;
                    }
                    Statics.method951(var197);
                } else if (var194 == -1) {
                    var197.field2696 = 0;
                    field952 = -1;
                    return true;
                } else {
                    class257 var198 = class257.method3684(var194);
                    var197.field2696 = 4;
                    var197.field2699 = var194;
                    var197.field2706 = var198.field3509;
                    var197.field2727 = var198.field3510;
                    var197.field2738 = var198.field3512 * 100 / var196;
                    Statics.method951(var197);
                }
                field952 = -1;
                return true;
            }
            if (field952 == 225) {
                int var200 = field950.method2824();
                byte var201 = field950.method2840();
                class212.field2614[var200] = var201;
                if (class212.field2616[var200] != var201) {
                    class212.field2616[var200] = var201;
                }
                method456(var200);
                field1093[++field1027 - 1 & 0x1F] = var200;
                field952 = -1;
                return true;
            }
            if (field952 == 157) {
                Statics.field438 = field950.method2839();
                Statics.field415 = field950.method2810();
                for (int var202 = Statics.field415; var202 < Statics.field415 + 8; var202++) {
                    for (int var203 = Statics.field438; var203 < Statics.field438 + 8; var203++) {
                        if (field1086[Statics.field890][var202][var203] != null) {
                            field1086[Statics.field890][var202][var203] = null;
                            method621(var202, var203);
                        }
                    }
                }
                for (class77 var204 = (class77) field1038.method3252(); var204 != null; var204 = (class77) field1038.method3277()) {
                    if (var204.field1190 >= Statics.field415 && var204.field1190 < Statics.field415 + 8 && var204.field1191 >= Statics.field438 && var204.field1191 < Statics.field438 + 8 && Statics.field890 == var204.field1198) {
                        var204.field1189 = 0;
                    }
                }
                field952 = -1;
                return true;
            }
            if (field952 == 119) {
                int var205 = field950.method2823();
                boolean var206 = field950.method2810() == 1;
                String var207 = "";
                boolean var208 = false;
                if (var206) {
                    var207 = field950.method2818();
                    if (method1501(var207)) {
                        var208 = true;
                    }
                }
                String var209 = field950.method2818();
                if (!var208) {
                    Statics.method19(var205, var207, var209);
                }
                field952 = -1;
                return true;
            }
            if (field952 == 59) {
                int var210 = field950.method2893();
                class217 var211 = class217.method3680(var210);
                for (int var212 = 0; var212 < var211.field2773.length; var212++) {
                    var211.field2773[var212] = -1;
                    var211.field2773[var212] = 0;
                }
                Statics.method951(var211);
                field952 = -1;
                return true;
            }
            if (field952 == 204) {
                field921 = field950.method2810();
                if (field921 == 1) {
                    field1134 = field950.method2824();
                }
                if (field921 >= 2 && field921 <= 6) {
                    if (field921 == 2) {
                        field927 = 64;
                        field1040 = 64;
                    }
                    if (field921 == 3) {
                        field927 = 0;
                        field1040 = 64;
                    }
                    if (field921 == 4) {
                        field927 = 128;
                        field1040 = 64;
                    }
                    if (field921 == 5) {
                        field927 = 64;
                        field1040 = 0;
                    }
                    if (field921 == 6) {
                        field927 = 64;
                        field1040 = 128;
                    }
                    field921 = 2;
                    field924 = field950.method2824();
                    field925 = field950.method2824();
                    field1032 = field950.method2810();
                }
                if (field921 == 10) {
                    field923 = field950.method2824();
                }
                field952 = -1;
                return true;
            }
            if (field952 == 249) {
                field1153 = true;
                Statics.field1480 = field950.method2810();
                Statics.field336 = field950.method2810();
                Statics.field2232 = field950.method2824();
                Statics.field857 = field950.method2810();
                Statics.field373 = field950.method2810();
                if (Statics.field373 >= 100) {
                    int var213 = Statics.field1480 * 128 + 64;
                    int var214 = Statics.field336 * 128 + 64;
                    int var215 = method1347(var213, var214, Statics.field890) - Statics.field2232;
                    int var216 = var213 - Statics.field296;
                    int var217 = var215 - Statics.field1661;
                    int var218 = var214 - Statics.field802;
                    int var219 = (int) Math.sqrt((double) (var216 * var216 + var218 * var218));
                    Statics.field2521 = (int) (Math.atan2((double) var217, (double) var219) * 325.949D) & 0x7FF;
                    Statics.field282 = (int) (Math.atan2((double) var216, (double) var218) * -325.949D) & 0x7FF;
                    if (Statics.field2521 < 128) {
                        Statics.field2521 = 128;
                    }
                    if (Statics.field2521 > 383) {
                        Statics.field2521 = 383;
                    }
                }
                field952 = -1;
                return true;
            }
            if (field952 == 122) {
                String var220 = field950.method2818();
                long var221 = field950.method2813();
                long var223 = (long) field950.method2824();
                long var225 = (long) field950.method2832();
                class231[] var227 = new class231[] { class231.field3181, class231.field3179, class231.field3188, class231.field3183, class231.field3180, class231.field3182 };
                class231 var228 = (class231) Statics.method666(var227, field950.method2810());
                long var229 = (var223 << 32) + var225;
                boolean var231 = false;
                for (int var232 = 0; var232 < 100; var232++) {
                    if (field943[var232] == var229) {
                        var231 = true;
                        break;
                    }
                }
                if (var228.field3187 && method1501(var220)) {
                    var231 = true;
                }
                if (!var231 && field1026 == 0) {
                    field943[field1127] = var229;
                    field1127 = (field1127 + 1) % 100;
                    class180 var233 = field950;
                    String var234 = class266.method2730(var233, 32767);
                    String var235 = class265.method4323(Statics.method3545(var234));
                    if (var228.field3185 == -1) {
                        class99.method95(9, var220, var235, class269.method3840(var221));
                    } else {
                        class99.method95(9, class89.method672(var228.field3185) + var220, var235, class269.method3840(var221));
                    }
                }
                field952 = -1;
                return true;
            }
            if (field952 == 188) {
                String var236 = field950.method2818();
                long var237 = (long) field950.method2824();
                long var239 = (long) field950.method2832();
                class231[] var241 = new class231[] { class231.field3181, class231.field3179, class231.field3188, class231.field3183, class231.field3180, class231.field3182 };
                class231 var242 = (class231) Statics.method666(var241, field950.method2810());
                long var243 = (var237 << 32) + var239;
                boolean var245 = false;
                for (int var246 = 0; var246 < 100; var246++) {
                    if (field943[var246] == var243) {
                        var245 = true;
                        break;
                    }
                }
                if (method1501(var236)) {
                    var245 = true;
                }
                if (!var245 && field1026 == 0) {
                    field943[field1127] = var243;
                    field1127 = (field1127 + 1) % 100;
                    class180 var247 = field950;
                    String var248 = class266.method2730(var247, 32767);
                    String var249 = class265.method4323(Statics.method3545(var248));
                    byte var250;
                    if (var242.field3186) {
                        var250 = 7;
                    } else {
                        var250 = 3;
                    }
                    if (var242.field3185 == -1) {
                        Statics.method19(var250, var236, var249);
                    } else {
                        Statics.method19(var250, class89.method672(var242.field3185) + var236, var249);
                    }
                }
                field952 = -1;
                return true;
            }
            if (field952 == 35) {
                method179(false);
                field950.method3074();
                int var251 = field950.method2824();
                class180 var252 = field950;
                int var253 = var252.field2408;
                class97.field1494 = 0;
                int var254 = 0;
                var252.method3056();
                for (int var255 = 0; var255 < class97.field1488; var255++) {
                    int var256 = class97.field1492[var255];
                    if ((class97.field1490[var256] & 0x1) == 0) {
                        if (var254 > 0) {
                            var254--;
                            class97.field1490[var256] = (byte) (class97.field1490[var256] | 0x2);
                        } else {
                            int var257 = var252.method3055(1);
                            if (var257 == 0) {
                                var254 = class97.method1381(var252);
                                class97.field1490[var256] = (byte) (class97.field1490[var256] | 0x2);
                            } else {
                                class97.method5(var252, var256);
                            }
                        }
                    }
                }
                var252.method3057();
                if (var254 != 0) {
                    throw new RuntimeException();
                }
                var252.method3056();
                for (int var258 = 0; var258 < class97.field1488; var258++) {
                    int var259 = class97.field1492[var258];
                    if ((class97.field1490[var259] & 0x1) != 0) {
                        if (var254 > 0) {
                            var254--;
                            class97.field1490[var259] = (byte) (class97.field1490[var259] | 0x2);
                        } else {
                            int var260 = var252.method3055(1);
                            if (var260 == 0) {
                                var254 = class97.method1381(var252);
                                class97.field1490[var259] = (byte) (class97.field1490[var259] | 0x2);
                            } else {
                                class97.method5(var252, var259);
                            }
                        }
                    }
                }
                var252.method3057();
                if (var254 != 0) {
                    throw new RuntimeException();
                }
                var252.method3056();
                for (int var261 = 0; var261 < class97.field1500; var261++) {
                    int var262 = class97.field1496[var261];
                    if ((class97.field1490[var262] & 0x1) != 0) {
                        if (var254 > 0) {
                            var254--;
                            class97.field1490[var262] = (byte) (class97.field1490[var262] | 0x2);
                        } else {
                            int var263 = var252.method3055(1);
                            if (var263 == 0) {
                                var254 = class97.method1381(var252);
                                class97.field1490[var262] = (byte) (class97.field1490[var262] | 0x2);
                            } else if (class97.method240(var252, var262)) {
                                class97.field1490[var262] = (byte) (class97.field1490[var262] | 0x2);
                            }
                        }
                    }
                }
                var252.method3057();
                if (var254 != 0) {
                    throw new RuntimeException();
                }
                var252.method3056();
                for (int var264 = 0; var264 < class97.field1500; var264++) {
                    int var265 = class97.field1496[var264];
                    if ((class97.field1490[var265] & 0x1) == 0) {
                        if (var254 > 0) {
                            var254--;
                            class97.field1490[var265] = (byte) (class97.field1490[var265] | 0x2);
                        } else {
                            int var266 = var252.method3055(1);
                            if (var266 == 0) {
                                var254 = class97.method1381(var252);
                                class97.field1490[var265] = (byte) (class97.field1490[var265] | 0x2);
                            } else if (class97.method240(var252, var265)) {
                                class97.field1490[var265] = (byte) (class97.field1490[var265] | 0x2);
                            }
                        }
                    }
                }
                var252.method3057();
                if (var254 != 0) {
                    throw new RuntimeException();
                }
                class97.field1488 = 0;
                class97.field1500 = 0;
                for (int var267 = 1; var267 < 2048; var267++) {
                    class97.field1490[var267] = (byte) (class97.field1490[var267] >> 1);
                    class75 var268 = field1049[var267];
                    if (var268 == null) {
                        class97.field1496[++class97.field1500 - 1] = var267;
                    } else {
                        class97.field1492[++class97.field1488 - 1] = var267;
                    }
                }
                class97.method1555(var252);
                if (var252.field2408 - var253 != var251) {
                    throw new RuntimeException(var252.field2408 - var253 + " " + var251);
                }
                field952 = -1;
                return true;
            }
            if (field952 == 84) {
                method1(false);
                field952 = -1;
                return true;
            }
            if (field952 == 219) {
                int var269 = field951 + field950.field2408;
                int var270 = field950.method2824();
                int var271 = field950.method2824();
                if (field1067 != var270) {
                    field1067 = var270;
                    this.method1063(false);
                    Statics.method210(field1067);
                    class84.method953(field1067);
                    for (int var272 = 0; var272 < 100; var272++) {
                        field1112[var272] = true;
                    }
                }
                while (var271-- > 0) {
                    int var273 = field950.method2803();
                    int var274 = field950.method2824();
                    int var275 = field950.method2810();
                    class69 var276 = (class69) field1119.method3190((long) var273);
                    if (var276 != null && var276.field820 != var274) {
                        method958(var276, true);
                        var276 = null;
                    }
                    if (var276 == null) {
                        var276 = method959(var273, var274, var275);
                    }
                    var276.field816 = true;
                }
                for (class69 var277 = (class69) field1119.method3200(); var277 != null; var277 = (class69) field1119.method3194()) {
                    if (var277.field816) {
                        var277.field816 = false;
                    } else {
                        method958(var277, true);
                    }
                }
                field1109 = new class191(512);
                while (field950.field2408 < var269) {
                    int var278 = field950.method2803();
                    int var279 = field950.method2824();
                    int var280 = field950.method2824();
                    int var281 = field950.method2803();
                    for (int var282 = var279; var282 <= var280; var282++) {
                        long var283 = ((long) var278 << 32) + (long) var282;
                        field1109.method3191(new class199(var281), var283);
                    }
                }
                field952 = -1;
                return true;
            }
            if (field952 == 148) {
                class180 var285 = field950;
                int var286 = field951;
                int var287 = var285.field2408;
                class97.field1494 = 0;
                int var288 = 0;
                var285.method3056();
                for (int var289 = 0; var289 < class97.field1488; var289++) {
                    int var290 = class97.field1492[var289];
                    if ((class97.field1490[var290] & 0x1) == 0) {
                        if (var288 > 0) {
                            var288--;
                            class97.field1490[var290] = (byte) (class97.field1490[var290] | 0x2);
                        } else {
                            int var291 = var285.method3055(1);
                            if (var291 == 0) {
                                var288 = class97.method1381(var285);
                                class97.field1490[var290] = (byte) (class97.field1490[var290] | 0x2);
                            } else {
                                class97.method5(var285, var290);
                            }
                        }
                    }
                }
                var285.method3057();
                if (var288 != 0) {
                    throw new RuntimeException();
                }
                var285.method3056();
                for (int var292 = 0; var292 < class97.field1488; var292++) {
                    int var293 = class97.field1492[var292];
                    if ((class97.field1490[var293] & 0x1) != 0) {
                        if (var288 > 0) {
                            var288--;
                            class97.field1490[var293] = (byte) (class97.field1490[var293] | 0x2);
                        } else {
                            int var294 = var285.method3055(1);
                            if (var294 == 0) {
                                var288 = class97.method1381(var285);
                                class97.field1490[var293] = (byte) (class97.field1490[var293] | 0x2);
                            } else {
                                class97.method5(var285, var293);
                            }
                        }
                    }
                }
                var285.method3057();
                if (var288 != 0) {
                    throw new RuntimeException();
                }
                var285.method3056();
                for (int var295 = 0; var295 < class97.field1500; var295++) {
                    int var296 = class97.field1496[var295];
                    if ((class97.field1490[var296] & 0x1) != 0) {
                        if (var288 > 0) {
                            var288--;
                            class97.field1490[var296] = (byte) (class97.field1490[var296] | 0x2);
                        } else {
                            int var297 = var285.method3055(1);
                            if (var297 == 0) {
                                var288 = class97.method1381(var285);
                                class97.field1490[var296] = (byte) (class97.field1490[var296] | 0x2);
                            } else if (class97.method240(var285, var296)) {
                                class97.field1490[var296] = (byte) (class97.field1490[var296] | 0x2);
                            }
                        }
                    }
                }
                var285.method3057();
                if (var288 != 0) {
                    throw new RuntimeException();
                }
                var285.method3056();
                for (int var298 = 0; var298 < class97.field1500; var298++) {
                    int var299 = class97.field1496[var298];
                    if ((class97.field1490[var299] & 0x1) == 0) {
                        if (var288 > 0) {
                            var288--;
                            class97.field1490[var299] = (byte) (class97.field1490[var299] | 0x2);
                        } else {
                            int var300 = var285.method3055(1);
                            if (var300 == 0) {
                                var288 = class97.method1381(var285);
                                class97.field1490[var299] = (byte) (class97.field1490[var299] | 0x2);
                            } else if (class97.method240(var285, var299)) {
                                class97.field1490[var299] = (byte) (class97.field1490[var299] | 0x2);
                            }
                        }
                    }
                }
                var285.method3057();
                if (var288 != 0) {
                    throw new RuntimeException();
                }
                class97.field1488 = 0;
                class97.field1500 = 0;
                for (int var301 = 1; var301 < 2048; var301++) {
                    class97.field1490[var301] = (byte) (class97.field1490[var301] >> 1);
                    class75 var302 = field1049[var301];
                    if (var302 == null) {
                        class97.field1496[++class97.field1500 - 1] = var301;
                    } else {
                        class97.field1492[++class97.field1488 - 1] = var301;
                    }
                }
                class97.method1555(var285);
                if (var285.field2408 - var287 != var286) {
                    throw new RuntimeException(var285.field2408 - var287 + " " + var286);
                }
                field952 = -1;
                return true;
            }
            if (field952 == 244) {
                String var303 = field950.method2818();
                Object[] var304 = new Object[var303.length() + 1];
                for (int var305 = var303.length() - 1; var305 >= 0; var305--) {
                    if (var303.charAt(var305) == 's') {
                        var304[var305 + 1] = field950.method2818();
                    } else {
                        var304[var305 + 1] = Integer.valueOf(field950.method2803());
                    }
                }
                var304[0] = Integer.valueOf(field950.method2803());
                class70 var306 = new class70();
                var306.field822 = var304;
                class84.method1349(var306);
                field952 = -1;
                return true;
            }
            if (field952 == 172) {
                method795();
                field1072 = field950.method2810();
                field1104 = field1092;
                field952 = -1;
                return true;
            }
            if (field952 == 160) {
                for (int var307 = 0; var307 < Statics.field3293; var307++) {
                    class242 var308 = class242.method194(var307);
                    if (var308 != null) {
                        class212.field2614[var307] = 0;
                        class212.field2616[var307] = 0;
                    }
                }
                method795();
                field1027 += 32;
                field952 = -1;
                return true;
            }
            if (field952 == 121) {
                int var309 = field950.method2803();
                int var310 = field950.method2937();
                class69 var311 = (class69) field1119.method3190((long) var310);
                class69 var312 = (class69) field1119.method3190((long) var309);
                if (var312 != null) {
                    method958(var312, var311 == null || var311.field820 != var312.field820);
                }
                if (var311 != null) {
                    var311.method3234();
                    field1119.method3191(var311, (long) var309);
                }
                class217 var313 = class217.method3680(var310);
                if (var313 != null) {
                    Statics.method951(var313);
                }
                class217 var314 = class217.method3680(var309);
                if (var314 != null) {
                    Statics.method951(var314);
                    method1557(Statics.field2647[var314.field2756 >>> 16], var314, true);
                }
                if (field1067 != -1) {
                    method14(field1067, 1);
                }
                field952 = -1;
                return true;
            }
            if (field952 == 208) {
                int var315 = field950.method2855();
                int var316 = field950.method2893();
                int var317 = field950.method2845();
                if (var317 == 65535) {
                    var317 = -1;
                }
                int var318 = field950.method2824();
                if (var318 == 65535) {
                    var318 = -1;
                }
                for (int var319 = var317; var319 <= var318; var319++) {
                    long var320 = ((long) var315 << 32) + (long) var319;
                    class193 var322 = field1109.method3190(var320);
                    if (var322 != null) {
                        var322.method3234();
                    }
                    field1109.method3191(new class199(var316), var320);
                }
                field952 = -1;
                return true;
            }
            if (field952 == 86) {
                int var323 = field950.method2893();
                int var324 = field950.method2800();
                class217 var325 = class217.method3680(var323);
                if (var325.field2696 != 2 || var325.field2699 != var324) {
                    var325.field2696 = 2;
                    var325.field2699 = var324;
                    Statics.method951(var325);
                }
                field952 = -1;
                return true;
            }
            if (field952 == 76) {
                class81 var326 = new class81();
                var326.field1286 = field950.method2818();
                var326.field1278 = field950.method2824();
                int var327 = field950.method2803();
                var326.field1288 = var327;
                method178(45);
                Statics.field818.method2662();
                Statics.field818 = null;
                class93.method7(var326);
                field952 = -1;
                return false;
            }
            if (field952 == 62) {
                int var328 = field950.method2794();
                int var329 = field950.method2803();
                class217 var330 = class217.method3680(var329);
                if (var330.field2778 != var328 || var328 == -1) {
                    var330.field2778 = var328;
                    var330.field2777 = 0;
                    var330.field2759 = 0;
                    Statics.method951(var330);
                }
                field952 = -1;
                return true;
            }
            if (field952 == 151) {
                int var331 = field950.method2974();
                int var332 = field950.method2937();
                int var333 = field950.method2848();
                class217 var334 = class217.method3680(var332);
                if (var334.field2664 != var333 || var334.field2665 != var331 || var334.field2660 != 0 || var334.field2661 != 0) {
                    var334.field2664 = var333;
                    var334.field2665 = var331;
                    var334.field2660 = 0;
                    var334.field2661 = 0;
                    Statics.method951(var334);
                    this.method1046(var334);
                    if (var334.field2657 == 0) {
                        method1557(Statics.field2647[var332 >> 16], var334, false);
                    }
                }
                field952 = -1;
                return true;
            }
            if (field952 == 179) {
                int var335 = field950.method2824();
                int var336 = field950.method2810();
                int var337 = field950.method2824();
                if (field1145 != 0 && var336 != 0 && field932 < 50) {
                    field1037[field932] = var335;
                    field1156[field932] = var336;
                    field1151[field932] = var337;
                    field1152[field932] = null;
                    field1171[field932] = 0;
                    field932++;
                }
                field952 = -1;
                return true;
            }
            if (field952 == 36) {
                int var341 = field950.method2810();
                if (field950.method2810() == 0) {
                    field1179[var341] = new class17();
                    field950.field2408 += 18;
                } else {
                    field950.field2408--;
                    field1179[var341] = new class17(field950, false);
                }
                field1102 = field1092;
                field952 = -1;
                return true;
            }
            if (field952 == 161) {
                String var342 = field950.method2818();
                int var343 = field950.method2824();
                byte var344 = field950.method2811();
                boolean var345 = false;
                if (var344 == -128) {
                    var345 = true;
                }
                if (var345) {
                    if (Statics.field314 == 0) {
                        field952 = -1;
                        return true;
                    }
                    boolean var346 = false;
                    int var347;
                    for (var347 = 0; var347 < Statics.field314 && (!Statics.field2433[var347].field900.equals(var342) || Statics.field2433[var347].field894 != var343); var347++) {
                    }
                    if (var347 < Statics.field314) {
                        while (var347 < Statics.field314 - 1) {
                            Statics.field2433[var347] = Statics.field2433[var347 + 1];
                            var347++;
                        }
                        Statics.field314--;
                        Statics.field2433[Statics.field314] = null;
                    }
                } else {
                    field950.method2818();
                    class76 var348 = new class76();
                    var348.field900 = var342;
                    var348.field893 = class268.method1830(var348.field900, Statics.field483);
                    var348.field894 = var343;
                    var348.field896 = var344;
                    int var349;
                    for (var349 = Statics.field314 - 1; var349 >= 0; var349--) {
                        int var350 = Statics.field2433[var349].field893.compareTo(var348.field893);
                        if (var350 == 0) {
                            Statics.field2433[var349].field894 = var343;
                            Statics.field2433[var349].field896 = var344;
                            if (var342.equals(Statics.field341.field873)) {
                                Statics.field3148 = var344;
                            }
                            field1064 = field1092;
                            field952 = -1;
                            return true;
                        }
                        if (var350 < 0) {
                            break;
                        }
                    }
                    if (Statics.field314 >= Statics.field2433.length) {
                        field952 = -1;
                        return true;
                    }
                    for (int var351 = Statics.field314 - 1; var351 > var349; var351--) {
                        Statics.field2433[var351 + 1] = Statics.field2433[var351];
                    }
                    if (Statics.field314 == 0) {
                        Statics.field2433 = new class76[100];
                    }
                    Statics.field2433[var349 + 1] = var348;
                    Statics.field314++;
                    if (var342.equals(Statics.field341.field873)) {
                        Statics.field3148 = var344;
                    }
                }
                field1064 = field1092;
                field952 = -1;
                return true;
            }
            if (field952 == 70) {
                Statics.field438 = field950.method2837();
                Statics.field415 = field950.method2978();
                field952 = -1;
                return true;
            }
            class153.method40("" + field952 + class89.field1378 + field956 + class89.field1378 + field957 + class89.field1378 + field951, (Throwable) null);
            method2133();
        } catch (IOException var363) {
            if (field958 > 0) {
                method2133();
            } else {
                method178(40);
                Statics.field2847 = Statics.field818;
                Statics.field818 = null;
            }
        } catch (Exception var364) {
            String var354 = "" + field952 + class89.field1378 + field956 + class89.field1378 + field957 + class89.field1378 + field951 + class89.field1378 + (Statics.field340 + Statics.field341.field1264[0]) + class89.field1378 + (Statics.field356 + Statics.field341.field1265[0]) + class89.field1378;
            for (int var355 = 0; var355 < field951 && var355 < 50; var355++) {
                var354 = var354 + field950.field2415[var355] + class89.field1378;
            }
            class153.method40(var354, var364);
            method2133();
        }
        return true;
    }

    @ObfuscatedName("am.gs(I)V")
    public static final void method452() {
        if (field952 == 37) {
            int var0 = field950.method2810();
            int var1 = (var0 >> 4 & 0x7) + Statics.field415;
            int var2 = (var0 & 0x7) + Statics.field438;
            int var3 = field950.method2810();
            int var4 = var3 >> 2;
            int var5 = var3 & 0x3;
            int var6 = field969[var4];
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                method3030(Statics.field890, var1, var2, var6, -1, var4, var5, 0, -1);
            }
            return;
        }
        if (field952 == 173) {
            int var7 = field950.method2847();
            byte var8 = field950.method2840();
            int var9 = field950.method2847();
            int var10 = field950.method2837();
            int var11 = (var10 >> 4 & 0x7) + Statics.field415;
            int var12 = (var10 & 0x7) + Statics.field438;
            int var13 = field950.method2978();
            int var14 = var13 >> 2;
            int var15 = var13 & 0x3;
            int var16 = field969[var14];
            byte var17 = field950.method2942();
            byte var18 = field950.method2942();
            int var19 = field950.method2847();
            int var20 = field950.method2845();
            byte var21 = field950.method2811();
            class75 var22;
            if (field1028 == var7) {
                var22 = Statics.field341;
            } else {
                var22 = field1049[var7];
            }
            if (var22 != null) {
                class256 var23 = class256.method239(var20);
                int var24;
                int var25;
                if (var15 == 1 || var15 == 3) {
                    var24 = var23.field3459;
                    var25 = var23.field3458;
                } else {
                    var24 = var23.field3458;
                    var25 = var23.field3459;
                }
                int var26 = (var24 >> 1) + var11;
                int var27 = (var24 + 1 >> 1) + var11;
                int var28 = (var25 >> 1) + var12;
                int var29 = (var25 + 1 >> 1) + var12;
                int[][] var30 = class62.field764[Statics.field890];
                int var31 = var30[var26][var28] + var30[var27][var28] + var30[var26][var29] + var30[var27][var29] >> 2;
                int var32 = (var11 << 7) + (var24 << 6);
                int var33 = (var12 << 7) + (var25 << 6);
                class134 var34 = var23.method4091(var14, var15, var30, var32, var31, var33);
                if (var34 != null) {
                    method3030(Statics.field890, var11, var12, var16, -1, 0, 0, var19 + 1, var9 + 1);
                    var22.field872 = field960 + var19;
                    var22.field883 = field960 + var9;
                    var22.field877 = var34;
                    var22.field874 = var11 * 128 + var24 * 64;
                    var22.field876 = var12 * 128 + var25 * 64;
                    var22.field875 = var31;
                    if (var17 > var18) {
                        byte var35 = var17;
                        var17 = var18;
                        var18 = var35;
                    }
                    if (var8 > var21) {
                        byte var36 = var8;
                        var8 = var21;
                        var21 = var36;
                    }
                    var22.field871 = var11 + var17;
                    var22.field886 = var11 + var18;
                    var22.field879 = var8 + var12;
                    var22.field881 = var12 + var21;
                }
            }
        }
        if (field952 == 190) {
            int var37 = field950.method2800();
            int var38 = field950.method2839();
            int var39 = (var38 >> 4 & 0x7) + Statics.field415;
            int var40 = (var38 & 0x7) + Statics.field438;
            int var41 = field950.method2978();
            int var42 = var41 >> 2;
            int var43 = var41 & 0x3;
            int var44 = field969[var42];
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                method3030(Statics.field890, var39, var40, var44, var37, var42, var43, 0, -1);
            }
        } else if (field952 == 66) {
            int var45 = field950.method2810();
            int var46 = (var45 >> 4 & 0x7) + Statics.field415;
            int var47 = (var45 & 0x7) + Statics.field438;
            int var48 = field950.method2824();
            int var49 = field950.method2824();
            int var50 = field950.method2824();
            if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                class194 var51 = field1086[Statics.field890][var46][var47];
                if (var51 != null) {
                    for (class95 var52 = (class95) var51.method3252(); var52 != null; var52 = (class95) var51.method3277()) {
                        if ((var48 & 0x7FFF) == var52.field1479 && var52.field1483 == var49) {
                            var52.field1483 = var50;
                            break;
                        }
                    }
                    method621(var46, var47);
                }
            }
        } else if (field952 == 137) {
            int var53 = field950.method2810();
            int var54 = (var53 >> 4 & 0x7) + Statics.field415;
            int var55 = (var53 & 0x7) + Statics.field438;
            int var56 = field950.method2824();
            int var57 = field950.method2810();
            int var58 = field950.method2824();
            if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                int var59 = var54 * 128 + 64;
                int var60 = var55 * 128 + 64;
                class85 var61 = new class85(var56, Statics.field890, var59, var60, method1347(var59, var60, Statics.field890) - var57, var58, field960);
                field1034.method3270(var61);
            }
        } else {
            if (field952 == 98) {
                int var62 = field950.method2810();
                int var63 = (var62 >> 4 & 0x7) + Statics.field415;
                int var64 = (var62 & 0x7) + Statics.field438;
                int var65 = field950.method2824();
                int var66 = field950.method2810();
                int var67 = var66 >> 4 & 0xF;
                int var68 = var66 & 0x7;
                int var69 = field950.method2810();
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                    int var70 = var67 + 1;
                    if (Statics.field341.field1264[0] >= var63 - var70 && Statics.field341.field1264[0] <= var63 + var70 && Statics.field341.field1265[0] >= var64 - var70 && Statics.field341.field1265[0] <= var64 + var70 && field1042 != 0 && var68 > 0 && field932 < 50) {
                        field1037[field932] = var65;
                        field1156[field932] = var68;
                        field1151[field932] = var69;
                        field1152[field932] = null;
                        field1171[field932] = (var63 << 16) + (var64 << 8) + var67;
                        field932++;
                    }
                }
            }
            if (field952 == 209) {
                int var71 = field950.method2800();
                int var72 = field950.method2810();
                int var73 = var72 >> 2;
                int var74 = var72 & 0x3;
                int var75 = field969[var73];
                int var76 = field950.method2978();
                int var77 = (var76 >> 4 & 0x7) + Statics.field415;
                int var78 = (var76 & 0x7) + Statics.field438;
                if (var77 >= 0 && var78 >= 0 && var77 < 103 && var78 < 103) {
                    if (var75 == 0) {
                        class143 var79 = Statics.field324.method2427(Statics.field890, var77, var78);
                        if (var79 != null) {
                            int var80 = var79.field2138 >> 14 & 0x7FFF;
                            if (var73 == 2) {
                                var79.field2139 = new class101(var80, 2, var74 + 4, Statics.field890, var77, var78, var71, false, var79.field2139);
                                var79.field2142 = new class101(var80, 2, var74 + 1 & 0x3, Statics.field890, var77, var78, var71, false, var79.field2142);
                            } else {
                                var79.field2139 = new class101(var80, var73, var74, Statics.field890, var77, var78, var71, false, var79.field2139);
                            }
                        }
                    }
                    if (var75 == 1) {
                        class148 var81 = Statics.field324.method2428(Statics.field890, var77, var78);
                        if (var81 != null) {
                            int var82 = var81.field2183 >> 14 & 0x7FFF;
                            if (var73 == 4 || var73 == 5) {
                                var81.field2180 = new class101(var82, 4, var74, Statics.field890, var77, var78, var71, false, var81.field2180);
                            } else if (var73 == 6) {
                                var81.field2180 = new class101(var82, 4, var74 + 4, Statics.field890, var77, var78, var71, false, var81.field2180);
                            } else if (var73 == 7) {
                                var81.field2180 = new class101(var82, 4, (var74 + 2 & 0x3) + 4, Statics.field890, var77, var78, var71, false, var81.field2180);
                            } else if (var73 == 8) {
                                var81.field2180 = new class101(var82, 4, var74 + 4, Statics.field890, var77, var78, var71, false, var81.field2180);
                                var81.field2173 = new class101(var82, 4, (var74 + 2 & 0x3) + 4, Statics.field890, var77, var78, var71, false, var81.field2173);
                            }
                        }
                    }
                    if (var75 == 2) {
                        class149 var83 = Statics.field324.method2417(Statics.field890, var77, var78);
                        if (var73 == 11) {
                            var73 = 10;
                        }
                        if (var83 != null) {
                            var83.field2195 = new class101(var83.field2201 >> 14 & 0x7FFF, var73, var74, Statics.field890, var77, var78, var71, false, var83.field2195);
                        }
                    }
                    if (var75 == 3) {
                        class130 var84 = Statics.field324.method2430(Statics.field890, var77, var78);
                        if (var84 != null) {
                            var84.field1870 = new class101(var84.field1868 >> 14 & 0x7FFF, 22, var74, Statics.field890, var77, var78, var71, false, var84.field1870);
                        }
                    }
                }
            } else if (field952 == 4) {
                int var85 = field950.method2845();
                int var86 = field950.method2810();
                int var87 = (var86 >> 4 & 0x7) + Statics.field415;
                int var88 = (var86 & 0x7) + Statics.field438;
                int var89 = field950.method2847();
                if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
                    class95 var90 = new class95();
                    var90.field1479 = var89;
                    var90.field1483 = var85;
                    if (field1086[Statics.field890][var87][var88] == null) {
                        field1086[Statics.field890][var87][var88] = new class194();
                    }
                    field1086[Statics.field890][var87][var88].method3270(var90);
                    method621(var87, var88);
                }
            } else if (field952 == 111) {
                int var91 = field950.method2839();
                int var92 = (var91 >> 4 & 0x7) + Statics.field415;
                int var93 = (var91 & 0x7) + Statics.field438;
                int var94 = field950.method2847();
                if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104) {
                    class194 var95 = field1086[Statics.field890][var92][var93];
                    if (var95 != null) {
                        for (class95 var96 = (class95) var95.method3252(); var96 != null; var96 = (class95) var95.method3277()) {
                            if ((var94 & 0x7FFF) == var96.field1479) {
                                var96.method3234();
                                break;
                            }
                        }
                        if (var95.method3252() == null) {
                            field1086[Statics.field890][var92][var93] = null;
                        }
                        method621(var92, var93);
                    }
                }
            } else if (field952 == 165) {
                int var97 = field950.method2810();
                int var98 = (var97 >> 4 & 0x7) + Statics.field415;
                int var99 = (var97 & 0x7) + Statics.field438;
                int var100 = var98 + field950.method2811();
                int var101 = var99 + field950.method2811();
                int var102 = field950.method3001();
                int var103 = field950.method2824();
                int var104 = field950.method2810() * 4;
                int var105 = field950.method2810() * 4;
                int var106 = field950.method2824();
                int var107 = field950.method2824();
                int var108 = field950.method2810();
                int var109 = field950.method2810();
                if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var103 != 65535) {
                    int var110 = var98 * 128 + 64;
                    int var111 = var99 * 128 + 64;
                    int var112 = var100 * 128 + 64;
                    int var113 = var101 * 128 + 64;
                    class94 var114 = new class94(var103, Statics.field890, var110, var111, method1347(var110, var111, Statics.field890) - var104, field960 + var106, field960 + var107, var108, var109, var102, var105);
                    var114.method1546(var112, var113, method1347(var112, var113, Statics.field890) - var105, field960 + var106);
                    field1174.method3270(var114);
                }
            }
        }
    }

    @ObfuscatedName("fw.go(IIIIIIIIIB)V")
    public static final void method3030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class77 var9 = null;
        for (class77 var10 = (class77) field1038.method3252(); var10 != null; var10 = (class77) field1038.method3277()) {
            if (var10.field1198 == arg0 && var10.field1190 == arg1 && var10.field1191 == arg2 && var10.field1193 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class77();
            var9.field1198 = arg0;
            var9.field1193 = arg3;
            var9.field1190 = arg1;
            var9.field1191 = arg2;
            method658(var9);
            field1038.method3270(var9);
        }
        var9.field1188 = arg4;
        var9.field1197 = arg5;
        var9.field1195 = arg6;
        var9.field1199 = arg7;
        var9.field1189 = arg8;
    }

    @ObfuscatedName("ad.gx(Lbu;B)V")
    public static final void method658(class77 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1193 == 0) {
            var1 = Statics.field324.method2411(arg0.field1198, arg0.field1190, arg0.field1191);
        }
        if (arg0.field1193 == 1) {
            var1 = Statics.field324.method2432(arg0.field1198, arg0.field1190, arg0.field1191);
        }
        if (arg0.field1193 == 2) {
            var1 = Statics.field324.method2433(arg0.field1198, arg0.field1190, arg0.field1191);
        }
        if (arg0.field1193 == 3) {
            var1 = Statics.field324.method2486(arg0.field1198, arg0.field1190, arg0.field1191);
        }
        if (var1 != 0) {
            int var5 = Statics.field324.method2554(arg0.field1198, arg0.field1190, arg0.field1191, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1192 = var2;
        arg0.field1194 = var3;
        arg0.field1196 = var4;
    }

    @ObfuscatedName("em.gb(B)V")
    public static final void method2400() {
        for (class77 var0 = (class77) field1038.method3252(); var0 != null; var0 = (class77) field1038.method3277()) {
            if (var0.field1189 > 0) {
                var0.field1189--;
            }
            if (var0.field1189 != 0) {
                if (var0.field1199 > 0) {
                    var0.field1199--;
                }
                if (var0.field1199 == 0 && var0.field1190 >= 1 && var0.field1191 >= 1 && var0.field1190 <= 102 && var0.field1191 <= 102 && (var0.field1188 < 0 || class62.method1529(var0.field1188, var0.field1197))) {
                    method893(var0.field1198, var0.field1193, var0.field1190, var0.field1191, var0.field1188, var0.field1195, var0.field1197);
                    var0.field1199 = -1;
                    if (var0.field1192 == var0.field1188 && var0.field1192 == -1) {
                        var0.method3234();
                    } else if (var0.field1192 == var0.field1188 && var0.field1196 == var0.field1195 && var0.field1197 == var0.field1194) {
                        var0.method3234();
                    }
                }
            } else if (var0.field1192 < 0 || class62.method1529(var0.field1192, var0.field1194)) {
                method893(var0.field1198, var0.field1193, var0.field1190, var0.field1191, var0.field1192, var0.field1196, var0.field1194);
                var0.method3234();
            }
        }
    }

    @ObfuscatedName("bn.gw(IIIIIIII)V")
    public static final void method893(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field1056 && Statics.field890 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field324.method2411(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field324.method2432(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field324.method2433(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field324.method2486(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field324.method2554(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field324.method2577(arg0, arg2, arg3);
                class256 var15 = class256.method239(var12);
                if (var15.field3477 != 0) {
                    field1021[arg0].method2714(arg2, arg3, var13, var14, var15.field3469);
                }
            }
            if (arg1 == 1) {
                Statics.field324.method2423(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field324.method2424(arg0, arg2, arg3);
                class256 var16 = class256.method239(var12);
                if (var16.field3458 + arg2 > 103 || var16.field3458 + arg3 > 103 || var16.field3459 + arg2 > 103 || var16.field3459 + arg3 > 103) {
                    return;
                }
                if (var16.field3477 != 0) {
                    field1021[arg0].method2702(arg2, arg3, var16.field3458, var16.field3459, var14, var16.field3469);
                }
            }
            if (arg1 == 3) {
                Statics.field324.method2473(arg0, arg2, arg3);
                class256 var17 = class256.method239(var12);
                if (var17.field3477 == 1) {
                    field1021[arg0].method2704(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class62.field750[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class140 var19 = Statics.field324;
        class162 var20 = field1021[arg0];
        class256 var21 = class256.method239(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field3459;
            var23 = var21.field3458;
        } else {
            var22 = var21.field3458;
            var23 = var21.field3459;
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
        int[][] var28 = class62.field764[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field3446 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field3483 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class142 var34;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var34 = var21.method4091(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class101(arg4, 22, arg5, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2461(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field3477 == 1) {
                var20.method2699(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class142 var57;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var57 = var21.method4091(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class101(arg4, 10, arg5, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            if (var57 != null) {
                var19.method2415(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field3477 != 0) {
                var20.method2697(arg2, arg3, var22, var23, var21.field3469);
            }
        } else if (arg6 >= 12) {
            class142 var35;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var35 = var21.method4091(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class101(arg4, arg6, arg5, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2415(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field3477 != 0) {
                var20.method2697(arg2, arg3, var22, var23, var21.field3469);
            }
        } else if (arg6 == 0) {
            class142 var36;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var36 = var21.method4091(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class101(arg4, 0, arg5, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2413(arg0, arg2, arg3, var29, var36, (class142) null, class62.field749[arg5], 0, var32, var33);
            if (var21.field3477 != 0) {
                var20.method2705(arg2, arg3, arg6, arg5, var21.field3469);
            }
        } else if (arg6 == 1) {
            class142 var37;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var37 = var21.method4091(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class101(arg4, 1, arg5, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2413(arg0, arg2, arg3, var29, var37, (class142) null, class62.field757[arg5], 0, var32, var33);
            if (var21.field3477 != 0) {
                var20.method2705(arg2, arg3, arg6, arg5, var21.field3469);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class142 var39;
            class142 var40;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var39 = var21.method4091(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method4091(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class101(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field3466, true, (class142) null);
                var40 = new class101(arg4, 2, var38, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2413(arg0, arg2, arg3, var29, var39, var40, class62.field749[arg5], class62.field749[var38], var32, var33);
            if (var21.field3477 != 0) {
                var20.method2705(arg2, arg3, arg6, arg5, var21.field3469);
            }
        } else if (arg6 == 3) {
            class142 var41;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var41 = var21.method4091(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class101(arg4, 3, arg5, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2413(arg0, arg2, arg3, var29, var41, (class142) null, class62.field757[arg5], 0, var32, var33);
            if (var21.field3477 != 0) {
                var20.method2705(arg2, arg3, arg6, arg5, var21.field3469);
            }
        } else if (arg6 == 9) {
            class142 var42;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var42 = var21.method4091(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class101(arg4, arg6, arg5, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2415(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field3477 != 0) {
                var20.method2697(arg2, arg3, var22, var23, var21.field3469);
            }
        } else if (arg6 == 4) {
            class142 var43;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var43 = var21.method4091(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class101(arg4, 4, arg5, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2527(arg0, arg2, arg3, var29, var43, (class142) null, class62.field749[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method2411(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class256.method239(var45 >> 14 & 0x7FFF).field3476;
            }
            class142 var46;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var46 = var21.method4091(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class101(arg4, 4, arg5, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2527(arg0, arg2, arg3, var29, var46, (class142) null, class62.field749[arg5], 0, class62.field758[arg5] * var44, class62.field759[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method2411(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class256.method239(var48 >> 14 & 0x7FFF).field3476 / 2;
            }
            class142 var49;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var49 = var21.method4091(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class101(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2527(arg0, arg2, arg3, var29, var49, (class142) null, 256, arg5, class62.field753[arg5] * var47, class62.field761[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class142 var51;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var51 = var21.method4091(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class101(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2527(arg0, arg2, arg3, var29, var51, (class142) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method2411(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class256.method239(var53 >> 14 & 0x7FFF).field3476 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class142 var55;
            class142 var56;
            if (var21.field3466 == -1 && var21.field3484 == null) {
                var55 = var21.method4091(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method4091(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class101(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3466, true, (class142) null);
                var56 = new class101(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field3466, true, (class142) null);
            }
            var19.method2527(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class62.field753[arg5] * var52, class62.field761[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("aw.gy(III)V")
    public static final void method621(int arg0, int arg1) {
        class194 var2 = field1086[Statics.field890][arg0][arg1];
        if (var2 == null) {
            Statics.field324.method2426(Statics.field890, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class95 var5 = null;
        for (class95 var6 = (class95) var2.method3252(); var6 != null; var6 = (class95) var2.method3277()) {
            class257 var7 = class257.method3684(var6.field1479);
            long var8 = (long) var7.field3515;
            if (var7.field3503 == 1) {
                var8 = (long) (var6.field1483 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field324.method2426(Statics.field890, arg0, arg1);
            return;
        }
        var2.method3266(var5);
        class95 var10 = null;
        class95 var11 = null;
        for (class95 var12 = (class95) var2.method3252(); var12 != null; var12 = (class95) var2.method3277()) {
            if (var5.field1479 != var12.field1479) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1479 != var12.field1479 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field324.method2412(Statics.field890, arg0, arg1, method1347(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field890), var5, var13, var10, var11);
    }

    @ObfuscatedName("m.gp(ZI)V")
    public static final void method1(boolean arg0) {
        field1030 = 0;
        field1097 = 0;
        method986();
        method962(arg0);
        for (int var1 = 0; var1 < field1097; var1++) {
            int var2 = field947[var1];
            class87 var3 = field1159[var2];
            int var4 = field950.method2810();
            if ((var4 & 0x10) != 0) {
                int var5 = field950.method2800();
                int var6 = field950.method2824();
                int var7 = var3.field1234 - (var5 - Statics.field340 - Statics.field340) * 64;
                int var8 = var3.field1210 - (var6 - Statics.field356 - Statics.field356) * 64;
                if (var7 != 0 || var8 != 0) {
                    var3.field1237 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x2) != 0) {
                int var9 = field950.method2810();
                if (var9 > 0) {
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = -1;
                        int var12 = -1;
                        int var13 = -1;
                        int var14 = field950.method2823();
                        if (var14 == 32767) {
                            var14 = field950.method2823();
                            var12 = field950.method2823();
                            var11 = field950.method2823();
                            var13 = field950.method2823();
                        } else if (var14 == 32766) {
                            var14 = -1;
                        } else {
                            var12 = field950.method2823();
                        }
                        int var15 = field950.method2823();
                        var3.method1352(var14, var12, var11, var13, field960, var15);
                    }
                }
                int var16 = field950.method2810();
                if (var16 > 0) {
                    for (int var17 = 0; var17 < var16; var17++) {
                        int var18 = field950.method2823();
                        int var19 = field950.method2823();
                        if (var19 == 32767) {
                            var3.method1355(var18);
                        } else {
                            int var20 = field950.method2823();
                            int var21 = field950.method2978();
                            int var22 = var19 > 0 ? field950.method2810() : var21;
                            var3.method1354(var18, field960, var19, var20, var21, var22);
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field1363 = class259.method2658(field950.method2845());
                var3.field1213 = var3.field1363.field3560;
                var3.field1228 = var3.field1363.field3583;
                var3.field1217 = var3.field1363.field3566;
                var3.field1218 = var3.field1363.field3561;
                var3.field1219 = var3.field1363.field3568;
                var3.field1220 = var3.field1363.field3569;
                var3.field1244 = var3.field1363.field3559;
                var3.field1215 = var3.field1363.field3564;
                var3.field1216 = var3.field1363.field3565;
            }
            if ((var4 & 0x8) != 0) {
                var3.field1236 = field950.method2818();
                var3.field1235 = 100;
            }
            if ((var4 & 0x20) != 0) {
                var3.field1209 = field950.method2847();
                if (var3.field1209 == 65535) {
                    var3.field1209 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field1246 = field950.method2800();
                int var23 = field950.method2937();
                var3.field1240 = var23 >> 16;
                var3.field1249 = (var23 & 0xFFFF) + field960;
                var3.field1222 = 0;
                var3.field1248 = 0;
                if (var3.field1249 > field960) {
                    var3.field1222 = -1;
                }
                if (var3.field1246 == 65535) {
                    var3.field1246 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var24 = field950.method2800();
                if (var24 == 65535) {
                    var24 = -1;
                }
                int var25 = field950.method2978();
                if (var3.field1261 == var24 && var24 != -1) {
                    int var26 = class261.method790(var24).field3621;
                    if (var26 == 1) {
                        var3.field1253 = 0;
                        var3.field1243 = 0;
                        var3.field1256 = var25;
                        var3.field1245 = 0;
                    }
                    if (var26 == 2) {
                        var3.field1245 = 0;
                    }
                } else if (var24 == -1 || var3.field1261 == -1 || class261.method790(var24).field3612 >= class261.method790(var3.field1261).field3612) {
                    var3.field1261 = var24;
                    var3.field1253 = 0;
                    var3.field1243 = 0;
                    var3.field1256 = var25;
                    var3.field1245 = 0;
                    var3.field1268 = var3.field1211;
                }
            }
        }
        for (int var27 = 0; var27 < field1030; var27++) {
            int var28 = field1031[var27];
            if (field960 != field1159[var28].field1241) {
                field1159[var28].field1363 = null;
                field1159[var28] = null;
            }
        }
        if (field951 != field950.field2408) {
            throw new RuntimeException(field950.field2408 + class89.field1378 + field951);
        }
        for (int var29 = 0; var29 < field931; var29++) {
            if (field1159[field1002[var29]] == null) {
                throw new RuntimeException(var29 + class89.field1378 + field931);
            }
        }
    }

    @ObfuscatedName("be.gm(I)V")
    public static final void method986() {
        field950.method3056();
        int var0 = field950.method3055(8);
        if (var0 < field931) {
            for (int var1 = var0; var1 < field931; var1++) {
                field1031[++field1030 - 1] = field1002[var1];
            }
        }
        if (var0 > field931) {
            throw new RuntimeException("");
        }
        field931 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field1002[var2];
            class87 var4 = field1159[var3];
            int var5 = field950.method3055(1);
            if (var5 == 0) {
                field1002[++field931 - 1] = var3;
                var4.field1241 = field960;
            } else {
                int var6 = field950.method3055(2);
                if (var6 == 0) {
                    field1002[++field931 - 1] = var3;
                    var4.field1241 = field960;
                    field947[++field1097 - 1] = var3;
                } else if (var6 == 1) {
                    field1002[++field931 - 1] = var3;
                    var4.field1241 = field960;
                    int var7 = field950.method3055(3);
                    var4.method1488(var7, (byte) 1);
                    int var8 = field950.method3055(1);
                    if (var8 == 1) {
                        field947[++field1097 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field1002[++field931 - 1] = var3;
                    var4.field1241 = field960;
                    int var9 = field950.method3055(3);
                    var4.method1488(var9, (byte) 2);
                    int var10 = field950.method3055(3);
                    var4.method1488(var10, (byte) 2);
                    int var11 = field950.method3055(1);
                    if (var11 == 1) {
                        field947[++field1097 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field1031[++field1030 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("bs.gg(ZI)V")
    public static final void method962(boolean arg0) {
        while (true) {
            if (field950.method3059(field951) >= 27) {
                int var1 = field950.method3055(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field1159[var1] == null) {
                        field1159[var1] = new class87();
                        var2 = true;
                    }
                    class87 var3 = field1159[var1];
                    field1002[++field931 - 1] = var1;
                    var3.field1241 = field960;
                    int var4;
                    if (arg0) {
                        var4 = field950.method3055(8);
                        if (var4 > 127) {
                            var4 -= 256;
                        }
                    } else {
                        var4 = field950.method3055(5);
                        if (var4 > 15) {
                            var4 -= 32;
                        }
                    }
                    var3.field1363 = class259.method2658(field950.method3055(14));
                    int var5 = field950.method3055(1);
                    if (var5 == 1) {
                        field947[++field1097 - 1] = var1;
                    }
                    int var6 = field1155[field950.method3055(3)];
                    if (var2) {
                        var3.field1250 = var3.field1258 = var6;
                    }
                    int var7 = field950.method3055(1);
                    int var8;
                    if (arg0) {
                        var8 = field950.method3055(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = field950.method3055(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    var3.field1213 = var3.field1363.field3560;
                    var3.field1228 = var3.field1363.field3583;
                    if (var3.field1228 == 0) {
                        var3.field1258 = 0;
                    }
                    var3.field1217 = var3.field1363.field3566;
                    var3.field1218 = var3.field1363.field3561;
                    var3.field1219 = var3.field1363.field3568;
                    var3.field1220 = var3.field1363.field3569;
                    var3.field1244 = var3.field1363.field3559;
                    var3.field1215 = var3.field1363.field3564;
                    var3.field1216 = var3.field1363.field3565;
                    var3.method1491(Statics.field341.field1264[0] + var4, Statics.field341.field1265[0] + var8, var7 == 1);
                    continue;
                }
            }
            field950.method3057();
            return;
        }
    }

    @ObfuscatedName("ak.gk(Lbh;IIBI)V")
    public static final void method250(class75 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field1264[0];
        int var5 = arg0.field1265[0];
        int var6 = arg0.method1003();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var9 = arg0.method1003();
        field998.field2321 = arg1;
        field998.field2323 = arg2;
        field998.field2322 = 1;
        field998.field2324 = 1;
        class74 var10 = field998;
        int var11 = class163.method956(var4, var5, var9, var10, field1021[arg0.field885], true, field946, field1035);
        if (var11 >= 1) {
            for (int var12 = 0; var12 < var11 - 1; var12++) {
                arg0.method1004(field946[var12], field1035[var12], arg3);
            }
        }
    }

    @ObfuscatedName("bb.gz(B)V")
    public static final void method1348() {
        int var0 = Statics.field1639;
        int var1 = Statics.field384;
        int var2 = Statics.field2255;
        int var3 = Statics.field523;
        int var4 = 6116423;
        class282.method4510(var0, var1, var2, var3, var4);
        class282.method4510(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class282.method4572(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field789.method4338(class226.field3016, var0 + 3, var1 + 14, var4, -1);
        int var5 = class60.field731;
        int var6 = class60.field732 * -417192073;
        for (int var7 = 0; var7 < field1046; var7++) {
            int var8 = (field1046 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class264 var10 = Statics.field789;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (field1052[var7].length() > 0) {
                var11 = field1051[var7] + class226.field3023 + field1052[var7];
            } else {
                var11 = field1051[var7];
            }
            var10.method4338(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field1639;
        int var13 = Statics.field384;
        int var14 = Statics.field2255;
        int var15 = Statics.field523;
        for (int var16 = 0; var16 < field1110; var16++) {
            if (field1117[var16] + field1055[var16] > var12 && field1055[var16] < var12 + var14 && field913[var16] + field1000[var16] > var13 && field1000[var16] < var13 + var15) {
                field1113[var16] = true;
            }
        }
    }

    @ObfuscatedName("cg.gu(IIIIB)V")
    public static final void method1661(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1110; var4++) {
            if (field1117[var4] + field1055[var4] > arg0 && field1055[var4] < arg0 + arg2 && field913[var4] + field1000[var4] > arg1 && field1000[var4] < arg1 + arg3) {
                field1112[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.gv(I)V")
    public final void method1043() {
        method212();
        if (Statics.field2336 != null || field1080 != null) {
            return;
        }
        int var18;
        int var20;
        int var21;
        label230: {
            int var1 = class60.field737;
            if (field1045) {
                if (var1 != 1 && (Statics.field2846 || var1 != 4)) {
                    int var2 = class60.field731;
                    int var3 = class60.field732 * -417192073;
                    if (var2 < Statics.field1639 - 10 || var2 > Statics.field2255 + Statics.field1639 + 10 || var3 < Statics.field384 - 10 || var3 > Statics.field523 + Statics.field384 + 10) {
                        field1045 = false;
                        method1661(Statics.field1639, Statics.field384, Statics.field2255, Statics.field523);
                    }
                }
                if (var1 == 1 || !Statics.field2846 && var1 == 4) {
                    int var4 = Statics.field1639;
                    int var5 = Statics.field384;
                    int var6 = Statics.field2255;
                    int var7 = class60.field738;
                    int var8 = class60.field733;
                    int var9 = -1;
                    for (int var10 = 0; var10 < field1046; var10++) {
                        int var11 = (field1046 - 1 - var10) * 15 + var5 + 31;
                        if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                            var9 = var10;
                        }
                    }
                    if (var9 != -1 && var9 >= 0) {
                        int var12 = field1047[var9];
                        int var13 = field1048[var9];
                        int var14 = field933[var9];
                        int var15 = field928[var9];
                        String var16 = field1051[var9];
                        String var17 = field1052[var9];
                        method1897(var12, var13, var14, var15, var16, var17, class60.field738, class60.field733);
                    }
                    field1045 = false;
                    method1661(Statics.field1639, Statics.field384, Statics.field2255, Statics.field523);
                }
            } else {
                var18 = method3690();
                if ((var1 == 1 || !Statics.field2846 && var1 == 4) && var18 >= 0) {
                    int var19 = field933[var18];
                    if (var19 == 39 || var19 == 40 || var19 == 41 || var19 == 42 || var19 == 43 || var19 == 33 || var19 == 34 || var19 == 35 || var19 == 36 || var19 == 37 || var19 == 38 || var19 == 1005) {
                        var20 = field1047[var18];
                        var21 = field1048[var18];
                        class217 var22 = class217.method3680(var21);
                        int var23 = method83(var22);
                        boolean var24 = (var23 >> 28 & 0x1) != 0;
                        if (var24) {
                            break label230;
                        }
                        int var25 = method83(var22);
                        boolean var26 = (var25 >> 29 & 0x1) != 0;
                        if (var26) {
                            break label230;
                        }
                    }
                }
                if (var1 == 1 || !Statics.field2846 && var1 == 4) {
                    label236: {
                        label153: {
                            if (field1044 == 1 && field1046 > 2) {
                                boolean var28;
                                if (field1046 <= 0) {
                                    var28 = false;
                                } else if (field990 && class51.field661[81] && field1054 != -1) {
                                    var28 = true;
                                } else {
                                    var28 = false;
                                }
                                if (!var28) {
                                    break label153;
                                }
                            }
                            if (!method324(var18)) {
                                break label236;
                            }
                        }
                        var1 = 2;
                    }
                }
                if ((var1 == 1 || !Statics.field2846 && var1 == 4) && field1046 > 0 && var18 >= 0) {
                    int var29 = field1047[var18];
                    int var30 = field1048[var18];
                    int var31 = field933[var18];
                    int var32 = field928[var18];
                    String var33 = field1051[var18];
                    String var34 = field1052[var18];
                    method1897(var29, var30, var31, var32, var33, var34, class60.field738, class60.field733);
                }
                if (var1 == 2 && field1046 > 0) {
                    this.method1044(class60.field738, class60.field733);
                }
            }
            return;
        }
        if (Statics.field2336 != null && !field1108) {
            int var27 = method3690();
            if (field1044 != 1 && !method324(var27) && field1046 > 0) {
                method988(field912, field986);
            }
        }
        field1108 = false;
        field1025 = 0;
        if (Statics.field2336 != null) {
            Statics.method951(Statics.field2336);
        }
        Statics.field2336 = class217.method3680(var21);
        field1020 = var20;
        field912 = class60.field738;
        field986 = class60.field733;
        if (var18 >= 0) {
            method49(var18);
        }
        Statics.method951(Statics.field2336);
    }

    @ObfuscatedName("client.gr(III)V")
    public final void method1044(int arg0, int arg1) {
        int var3 = Statics.field789.method4381(class226.field3016);
        for (int var4 = 0; var4 < field1046; var4++) {
            class264 var5 = Statics.field789;
            String var6;
            if (var4 < 0) {
                var6 = "";
            } else if (field1052[var4].length() > 0) {
                var6 = field1051[var4] + class226.field3023 + field1052[var4];
            } else {
                var6 = field1051[var4];
            }
            int var7 = var5.method4381(var6);
            if (var7 > var3) {
                var3 = var7;
            }
        }
        var3 += 8;
        int var8 = field1046 * 15 + 22;
        int var9 = arg0 - var3 / 2;
        if (var3 + var9 > Statics.field264) {
            var9 = Statics.field264 - var3;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg1;
        if (var8 + arg1 > Statics.field12) {
            var10 = Statics.field12 - var8;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        Statics.field324.method2442(Statics.field890, arg0, arg1, false);
        field1045 = true;
        Statics.field1639 = var9;
        Statics.field384 = var10;
        Statics.field2255 = var3;
        Statics.field523 = field1046 * 15 + 22;
    }

    @ObfuscatedName("al.gl(IB)Z")
    public static final boolean method324(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field933[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("bk.ge(Lcb;III)V")
    public static final void method974(class90 arg0, int arg1, int arg2) {
        method1897(arg0.field1387, arg0.field1388, arg0.field1389, arg0.field1390, arg0.field1393, arg0.field1393, arg1, arg2);
    }

    @ObfuscatedName("dx.gf(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1897(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 7) {
            class87 var8 = field1159[arg3];
            if (var8 != null) {
                field1014 = arg6;
                field1116 = arg7;
                field1017 = 2;
                field907 = 0;
                field1139 = arg0;
                field1140 = arg1;
                field948.method3054(202);
                field948.method2843(Statics.field313);
                field948.method2842(arg3);
                field948.method2957(Statics.field1407);
                field948.method2973(class51.field661[82] ? 1 : 0);
                field948.method2891(Statics.field481);
            }
        }
        if (arg2 == 1001) {
            field1014 = arg6;
            field1116 = arg7;
            field1017 = 2;
            field907 = 0;
            field1139 = arg0;
            field1140 = arg1;
            field948.method3054(197);
            field948.method2973(class51.field661[82] ? 1 : 0);
            field948.method2957(Statics.field356 + arg1);
            field948.method2843(Statics.field340 + arg0);
            field948.method2843(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1) {
            field1014 = arg6;
            field1116 = arg7;
            field1017 = 2;
            field907 = 0;
            field1139 = arg0;
            field1140 = arg1;
            field948.method3054(59);
            field948.method2957(arg3 >> 14 & 0x7FFF);
            field948.method2957(Statics.field1407);
            field948.method2844(Statics.field356 + arg1);
            field948.method2961(class51.field661[82] ? 1 : 0);
            field948.method2891(Statics.field481);
            field948.method2842(Statics.field313);
            field948.method2844(Statics.field340 + arg0);
        }
        if (arg2 == 32) {
            field948.method3054(223);
            field948.method2854(Statics.field612);
            field948.method2844(arg0);
            field948.method2843(arg3);
            field948.method2844(field1063);
            field948.method2891(arg1);
            field1018 = 0;
            Statics.field736 = class217.method3680(arg1);
            field1019 = arg0;
        }
        if (arg2 == 29) {
            field948.method3054(26);
            field948.method2798(arg1);
            class217 var9 = class217.method3680(arg1);
            if (var9.field2698 != null && var9.field2698[0][0] == 5) {
                int var10 = var9.field2698[0][1];
                if (class212.field2616[var10] != var9.field2769[0]) {
                    class212.field2616[var10] = var9.field2769[0];
                    method456(var10);
                }
            }
        }
        if (arg2 == 15) {
            class75 var11 = field1049[arg3];
            if (var11 != null) {
                field1014 = arg6;
                field1116 = arg7;
                field1017 = 2;
                field907 = 0;
                field1139 = arg0;
                field1140 = arg1;
                field948.method3054(113);
                field948.method2843(field1063);
                field948.method2846(class51.field661[82] ? 1 : 0);
                field948.method2843(arg3);
                field948.method2798(Statics.field612);
            }
        }
        if (arg2 == 28) {
            field948.method3054(26);
            field948.method2798(arg1);
            class217 var12 = class217.method3680(arg1);
            if (var12.field2698 != null && var12.field2698[0][0] == 5) {
                int var13 = var12.field2698[0][1];
                class212.field2616[var13] = 1 - class212.field2616[var13];
                method456(var13);
            }
        }
        if (arg2 == 25) {
            class217 var14 = class217.method2792(arg1, arg0);
            if (var14 != null) {
                method1407();
                method193(arg1, arg0, class218.method241(method83(var14)), var14.field2720);
                field1060 = 0;
                String var15;
                if (class218.method241(method83(var14)) == 0) {
                    var15 = null;
                } else if (var14.field2734 == null || var14.field2734.trim().length() == 0) {
                    var15 = null;
                } else {
                    var15 = var14.field2734;
                }
                field1065 = var15;
                if (field1065 == null) {
                    field1065 = "Null";
                }
                if (var14.field2656) {
                    field1066 = var14.field2728 + class89.method96(16777215);
                } else {
                    field1066 = class89.method96(65280) + var14.field2742 + class89.method96(16777215);
                }
            }
            return;
        }
        if (arg2 == 12) {
            class87 var16 = field1159[arg3];
            if (var16 != null) {
                field1014 = arg6;
                field1116 = arg7;
                field1017 = 2;
                field907 = 0;
                field1139 = arg0;
                field1140 = arg1;
                field948.method3054(250);
                field948.method2846(class51.field661[82] ? 1 : 0);
                field948.method2842(arg3);
            }
        }
        if (arg2 == 44) {
            class75 var17 = field1049[arg3];
            if (var17 != null) {
                field1014 = arg6;
                field1116 = arg7;
                field1017 = 2;
                field907 = 0;
                field1139 = arg0;
                field1140 = arg1;
                field948.method3054(187);
                field948.method2844(arg3);
                field948.method2836(class51.field661[82] ? 1 : 0);
            }
        }
        if (arg2 == 46) {
            class75 var18 = field1049[arg3];
            if (var18 != null) {
                field1014 = arg6;
                field1116 = arg7;
                field1017 = 2;
                field907 = 0;
                field1139 = arg0;
                field1140 = arg1;
                field948.method3054(129);
                field948.method2842(arg3);
                field948.method2973(class51.field661[82] ? 1 : 0);
            }
        }
        if (arg2 == 20) {
            field1014 = arg6;
            field1116 = arg7;
            field1017 = 2;
            field907 = 0;
            field1139 = arg0;
            field1140 = arg1;
            field948.method3054(7);
            field948.method2842(arg3);
            field948.method2961(class51.field661[82] ? 1 : 0);
            field948.method2843(Statics.field340 + arg0);
            field948.method2844(Statics.field356 + arg1);
        }
        if (arg2 == 50) {
            class75 var19 = field1049[arg3];
            if (var19 != null) {
                field1014 = arg6;
                field1116 = arg7;
                field1017 = 2;
                field907 = 0;
                field1139 = arg0;
                field1140 = arg1;
                field948.method3054(165);
                field948.method2842(arg3);
                field948.method2961(class51.field661[82] ? 1 : 0);
            }
        }
        if (arg2 == 8) {
            class87 var20 = field1159[arg3];
            if (var20 != null) {
                field1014 = arg6;
                field1116 = arg7;
                field1017 = 2;
                field907 = 0;
                field1139 = arg0;
                field1140 = arg1;
                field948.method3054(57);
                field948.method2854(Statics.field612);
                field948.method2836(class51.field661[82] ? 1 : 0);
                field948.method2842(arg3);
                field948.method2843(field1063);
            }
        }
        if (arg2 == 39) {
            field948.method3054(251);
            field948.method2842(arg3);
            field948.method2854(arg1);
            field948.method2842(arg0);
            field1018 = 0;
            Statics.field736 = class217.method3680(arg1);
            field1019 = arg0;
        }
        if (arg2 == 17) {
            field1014 = arg6;
            field1116 = arg7;
            field1017 = 2;
            field907 = 0;
            field1139 = arg0;
            field1140 = arg1;
            field948.method3054(0);
            field948.method2957(arg3);
            field948.method2891(Statics.field612);
            field948.method2844(Statics.field356 + arg1);
            field948.method2961(class51.field661[82] ? 1 : 0);
            field948.method2842(field1063);
            field948.method2843(Statics.field340 + arg0);
        }
        if (arg2 == 5) {
            field1014 = arg6;
            field1116 = arg7;
            field1017 = 2;
            field907 = 0;
            field1139 = arg0;
            field1140 = arg1;
            field948.method3054(76);
            field948.method2846(class51.field661[82] ? 1 : 0);
            field948.method2844(arg3 >> 14 & 0x7FFF);
            field948.method2957(Statics.field356 + arg1);
            field948.method2957(Statics.field340 + arg0);
        }
        if (arg2 == 40) {
            field948.method3054(100);
            field948.method2843(arg0);
            field948.method2843(arg3);
            field948.method2854(arg1);
            field1018 = 0;
            Statics.field736 = class217.method3680(arg1);
            field1019 = arg0;
        }
        if (arg2 == 11) {
            class87 var21 = field1159[arg3];
            if (var21 != null) {
                field1014 = arg6;
                field1116 = arg7;
                field1017 = 2;
                field907 = 0;
                field1139 = arg0;
                field1140 = arg1;
                field948.method3054(118);
                field948.method2836(class51.field661[82] ? 1 : 0);
                field948.method2843(arg3);
            }
        }
        if (arg2 == 36) {
            field948.method3054(110);
            field948.method2891(arg1);
            field948.method2842(arg3);
            field948.method2842(arg0);
            field1018 = 0;
            Statics.field736 = class217.method3680(arg1);
            field1019 = arg0;
        }
        if (arg2 == 9) {
            class87 var22 = field1159[arg3];
            if (var22 != null) {
                field1014 = arg6;
                field1116 = arg7;
                field1017 = 2;
                field907 = 0;
                field1139 = arg0;
                field1140 = arg1;
                field948.method3054(85);
                field948.method2842(arg3);
                field948.method2961(class51.field661[82] ? 1 : 0);
            }
        }
        if (arg2 == 37) {
            field948.method3054(229);
            field948.method2854(arg1);
            field948.method2957(arg3);
            field948.method2843(arg0);
            field1018 = 0;
            Statics.field736 = class217.method3680(arg1);
            field1019 = arg0;
        }
        if (arg2 == 22) {
            field1014 = arg6;
            field1116 = arg7;
            field1017 = 2;
            field907 = 0;
            field1139 = arg0;
            field1140 = arg1;
            field948.method3054(62);
            field948.method2846(class51.field661[82] ? 1 : 0);
            field948.method2843(arg3);
            field948.method2843(Statics.field340 + arg0);
            field948.method2843(Statics.field356 + arg1);
        }
        if (arg2 == 51) {
            class75 var23 = field1049[arg3];
            if (var23 != null) {
                field1014 = arg6;
                field1116 = arg7;
                field1017 = 2;
                field907 = 0;
                field1139 = arg0;
                field1140 = arg1;
                field948.method3054(218);
                field948.method2844(arg3);
                field948.method2973(class51.field661[82] ? 1 : 0);
            }
        }
        if (arg2 == 10) {
            class87 var24 = field1159[arg3];
            if (var24 != null) {
                field1014 = arg6;
                field1116 = arg7;
                field1017 = 2;
                field907 = 0;
                field1139 = arg0;
                field1140 = arg1;
                field948.method3054(64);
                field948.method2961(class51.field661[82] ? 1 : 0);
                field948.method2957(arg3);
            }
        }
        if (arg2 == 24) {
            class217 var25 = class217.method3680(arg1);
            boolean var26 = true;
            if (var25.field2705 > 0) {
                var26 = method938(var25);
            }
            if (var26) {
                field948.method3054(26);
                field948.method2798(arg1);
            }
        }
        if (arg2 == 1004) {
            field1014 = arg6;
            field1116 = arg7;
            field1017 = 2;
            field907 = 0;
            field948.method3054(104);
            field948.method2957(arg3);
        }
        if (arg2 == 31) {
            field948.method3054(207);
            field948.method2844(arg0);
            field948.method2834(Statics.field481);
            field948.method2798(arg1);
            field948.method2844(Statics.field1407);
            field948.method2843(Statics.field313);
            field948.method2957(arg3);
            field1018 = 0;
            Statics.field736 = class217.method3680(arg1);
            field1019 = arg0;
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field602.method4801(arg2, arg3, new class213(arg0), new class213(arg1));
        }
        if (arg2 == 6) {
            field1014 = arg6;
            field1116 = arg7;
            field1017 = 2;
            field907 = 0;
            field1139 = arg0;
            field1140 = arg1;
            field948.method3054(79);
            field948.method2844(Statics.field340 + arg0);
            field948.method2957(Statics.field356 + arg1);
            field948.method2846(class51.field661[82] ? 1 : 0);
            field948.method2842(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 26) {
            method4472();
        }
        if (arg2 == 16) {
            field1014 = arg6;
            field1116 = arg7;
            field1017 = 2;
            field907 = 0;
            field1139 = arg0;
            field1140 = arg1;
            field948.method3054(39);
            field948.method2843(Statics.field356 + arg1);
            field948.method2834(Statics.field481);
            field948.method2843(Statics.field313);
            field948.method2843(Statics.field1407);
            field948.method2843(arg3);
            field948.method2973(class51.field661[82] ? 1 : 0);
            field948.method2844(Statics.field340 + arg0);
        }
        if (arg2 == 14) {
            class75 var27 = field1049[arg3];
            if (var27 != null) {
                field1014 = arg6;
                field1116 = arg7;
                field1017 = 2;
                field907 = 0;
                field1139 = arg0;
                field1140 = arg1;
                field948.method3054(199);
                field948.method2854(Statics.field481);
                field948.method2842(arg3);
                field948.method2846(class51.field661[82] ? 1 : 0);
                field948.method2844(Statics.field1407);
                field948.method2842(Statics.field313);
            }
        }
        if (arg2 == 41) {
            field948.method3054(68);
            field948.method2957(arg3);
            field948.method2957(arg0);
            field948.method2798(arg1);
            field1018 = 0;
            Statics.field736 = class217.method3680(arg1);
            field1019 = arg0;
        }
        if (arg2 == 1005) {
            class217 var28 = class217.method3680(arg1);
            if (var28 == null || var28.field2774[arg0] < 100000) {
                field948.method3054(104);
                field948.method2957(arg3);
            } else {
                Statics.method19(27, "", var28.field2774[arg0] + " x " + class257.method3684(arg3).field3535);
            }
            field1018 = 0;
            Statics.field736 = class217.method3680(arg1);
            field1019 = arg0;
        }
        if (arg2 == 2) {
            field1014 = arg6;
            field1116 = arg7;
            field1017 = 2;
            field907 = 0;
            field1139 = arg0;
            field1140 = arg1;
            field948.method3054(77);
            field948.method2957(arg3 >> 14 & 0x7FFF);
            field948.method2798(Statics.field612);
            field948.method2844(field1063);
            field948.method2843(Statics.field340 + arg0);
            field948.method2844(Statics.field356 + arg1);
            field948.method2973(class51.field661[82] ? 1 : 0);
        }
        if (arg2 == 58) {
            class217 var29 = class217.method2792(arg1, arg0);
            if (var29 != null) {
                field948.method3054(63);
                field948.method2843(arg0);
                field948.method2842(field1063);
                field948.method2798(arg1);
                field948.method2891(Statics.field612);
                field948.method2842(var29.field2720);
                field948.method2842(field1158);
            }
        }
        if (arg2 == 35) {
            field948.method3054(184);
            field948.method2842(arg3);
            field948.method2798(arg1);
            field948.method2842(arg0);
            field1018 = 0;
            Statics.field736 = class217.method3680(arg1);
            field1019 = arg0;
        }
        if (arg2 == 49) {
            class75 var30 = field1049[arg3];
            if (var30 != null) {
                field1014 = arg6;
                field1116 = arg7;
                field1017 = 2;
                field907 = 0;
                field1139 = arg0;
                field1140 = arg1;
                field948.method3054(196);
                field948.method2957(arg3);
                field948.method2846(class51.field661[82] ? 1 : 0);
            }
        }
        if (arg2 == 33) {
            field948.method3054(154);
            field948.method2844(arg0);
            field948.method2843(arg3);
            field948.method2854(arg1);
            field1018 = 0;
            Statics.field736 = class217.method3680(arg1);
            field1019 = arg0;
        }
        if (arg2 == 42) {
            field948.method3054(139);
            field948.method2844(arg0);
            field948.method2798(arg1);
            field948.method2842(arg3);
            field1018 = 0;
            Statics.field736 = class217.method3680(arg1);
            field1019 = arg0;
        }
        if (arg2 == 13) {
            class87 var31 = field1159[arg3];
            if (var31 != null) {
                field1014 = arg6;
                field1116 = arg7;
                field1017 = 2;
                field907 = 0;
                field1139 = arg0;
                field1140 = arg1;
                field948.method3054(46);
                field948.method2843(arg3);
                field948.method2836(class51.field661[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field948.method3054(133);
            field948.method2957(arg3);
            field948.method2834(arg1);
            field948.method2843(arg0);
            field1018 = 0;
            Statics.field736 = class217.method3680(arg1);
            field1019 = arg0;
        }
        if (arg2 == 47) {
            class75 var32 = field1049[arg3];
            if (var32 != null) {
                field1014 = arg6;
                field1116 = arg7;
                field1017 = 2;
                field907 = 0;
                field1139 = arg0;
                field1140 = arg1;
                field948.method3054(90);
                field948.method2836(class51.field661[82] ? 1 : 0);
                field948.method2842(arg3);
            }
        }
        if (arg2 == 19) {
            field1014 = arg6;
            field1116 = arg7;
            field1017 = 2;
            field907 = 0;
            field1139 = arg0;
            field1140 = arg1;
            field948.method3054(120);
            field948.method2844(arg3);
            field948.method2844(Statics.field356 + arg1);
            field948.method2844(Statics.field340 + arg0);
            field948.method2973(class51.field661[82] ? 1 : 0);
        }
        if (arg2 == 1002) {
            field1014 = arg6;
            field1116 = arg7;
            field1017 = 2;
            field907 = 0;
            field948.method3054(177);
            field948.method2957(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 21) {
            field1014 = arg6;
            field1116 = arg7;
            field1017 = 2;
            field907 = 0;
            field1139 = arg0;
            field1140 = arg1;
            field948.method3054(56);
            field948.method2844(Statics.field356 + arg1);
            field948.method2957(Statics.field340 + arg0);
            field948.method2844(arg3);
            field948.method2836(class51.field661[82] ? 1 : 0);
        }
        if (arg2 == 30 && field1071 == null) {
            method180(arg1, arg0);
            field1071 = class217.method2792(arg1, arg0);
            Statics.method951(field1071);
        }
        if (arg2 == 43) {
            field948.method3054(227);
            field948.method2957(arg3);
            field948.method2798(arg1);
            field948.method2843(arg0);
            field1018 = 0;
            Statics.field736 = class217.method3680(arg1);
            field1019 = arg0;
        }
        if (arg2 == 4) {
            field1014 = arg6;
            field1116 = arg7;
            field1017 = 2;
            field907 = 0;
            field1139 = arg0;
            field1140 = arg1;
            field948.method3054(198);
            field948.method2957(arg3 >> 14 & 0x7FFF);
            field948.method2846(class51.field661[82] ? 1 : 0);
            field948.method2843(Statics.field340 + arg0);
            field948.method2842(Statics.field356 + arg1);
        }
        if (arg2 == 3) {
            field1014 = arg6;
            field1116 = arg7;
            field1017 = 2;
            field907 = 0;
            field1139 = arg0;
            field1140 = arg1;
            field948.method3054(47);
            field948.method2844(arg3 >> 14 & 0x7FFF);
            field948.method2957(Statics.field340 + arg0);
            field948.method2843(Statics.field356 + arg1);
            field948.method2846(class51.field661[82] ? 1 : 0);
        }
        if (arg2 == 48) {
            class75 var33 = field1049[arg3];
            if (var33 != null) {
                field1014 = arg6;
                field1116 = arg7;
                field1017 = 2;
                field907 = 0;
                field1139 = arg0;
                field1140 = arg1;
                field948.method3054(43);
                field948.method2843(arg3);
                field948.method2961(class51.field661[82] ? 1 : 0);
            }
        }
        if (arg2 == 18) {
            field1014 = arg6;
            field1116 = arg7;
            field1017 = 2;
            field907 = 0;
            field1139 = arg0;
            field1140 = arg1;
            field948.method3054(167);
            field948.method2957(Statics.field356 + arg1);
            field948.method2961(class51.field661[82] ? 1 : 0);
            field948.method2842(arg3);
            field948.method2842(Statics.field340 + arg0);
        }
        if (arg2 == 45) {
            class75 var34 = field1049[arg3];
            if (var34 != null) {
                field1014 = arg6;
                field1116 = arg7;
                field1017 = 2;
                field907 = 0;
                field1139 = arg0;
                field1140 = arg1;
                field948.method3054(41);
                field948.method2843(arg3);
                field948.method2973(class51.field661[82] ? 1 : 0);
            }
        }
        if (arg2 == 38) {
            method1407();
            class217 var35 = class217.method3680(arg1);
            field1060 = 1;
            Statics.field1407 = arg0;
            Statics.field481 = arg1;
            Statics.field313 = arg3;
            Statics.method951(var35);
            field1061 = class89.method96(16748608) + class257.method3684(arg3).field3535 + class89.method96(16777215);
            if (field1061 == null) {
                field1061 = "null";
            }
            return;
        }
        if (arg2 == 23) {
            if (field1045) {
                Statics.field324.method2443();
            } else {
                Statics.field324.method2442(Statics.field890, arg0, arg1, true);
            }
        }
        if (arg2 == 1003) {
            field1014 = arg6;
            field1116 = arg7;
            field1017 = 2;
            field907 = 0;
            class87 var36 = field1159[arg3];
            if (var36 != null) {
                class259 var37 = var36.field1363;
                if (var37.field3584 != null) {
                    var37 = var37.method4218();
                }
                if (var37 != null) {
                    field948.method3054(109);
                    field948.method2843(var37.field3558);
                }
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class217 var38 = class217.method2792(arg1, arg0);
            if (var38 != null) {
                int var39 = var38.field2720;
                class217 var40 = class217.method2792(arg1, arg0);
                if (var40 != null) {
                    if (var40.field2658 != null) {
                        class70 var41 = new class70();
                        var41.field823 = var40;
                        var41.field826 = arg3;
                        var41.field834 = arg5;
                        var41.field822 = var40.field2658;
                        class84.method1349(var41);
                    }
                    boolean var42 = true;
                    if (var40.field2705 > 0) {
                        var42 = method938(var40);
                    }
                    if (var42) {
                        int var43 = method83(var40);
                        int var44 = arg3 - 1;
                        boolean var45 = (var43 >> var44 + 1 & 0x1) != 0;
                        if (var45) {
                            if (arg3 == 1) {
                                field948.method3054(221);
                                field948.method2798(arg1);
                                field948.method2957(arg0);
                                field948.method2957(var39);
                            }
                            if (arg3 == 2) {
                                field948.method3054(52);
                                field948.method2798(arg1);
                                field948.method2957(arg0);
                                field948.method2957(var39);
                            }
                            if (arg3 == 3) {
                                field948.method3054(206);
                                field948.method2798(arg1);
                                field948.method2957(arg0);
                                field948.method2957(var39);
                            }
                            if (arg3 == 4) {
                                field948.method3054(61);
                                field948.method2798(arg1);
                                field948.method2957(arg0);
                                field948.method2957(var39);
                            }
                            if (arg3 == 5) {
                                field948.method3054(103);
                                field948.method2798(arg1);
                                field948.method2957(arg0);
                                field948.method2957(var39);
                            }
                            if (arg3 == 6) {
                                field948.method3054(111);
                                field948.method2798(arg1);
                                field948.method2957(arg0);
                                field948.method2957(var39);
                            }
                            if (arg3 == 7) {
                                field948.method3054(5);
                                field948.method2798(arg1);
                                field948.method2957(arg0);
                                field948.method2957(var39);
                            }
                            if (arg3 == 8) {
                                field948.method3054(31);
                                field948.method2798(arg1);
                                field948.method2957(arg0);
                                field948.method2957(var39);
                            }
                            if (arg3 == 9) {
                                field948.method3054(135);
                                field948.method2798(arg1);
                                field948.method2957(arg0);
                                field948.method2957(var39);
                            }
                            if (arg3 == 10) {
                                field948.method3054(28);
                                field948.method2798(arg1);
                                field948.method2957(arg0);
                                field948.method2957(var39);
                            }
                        }
                    }
                }
            }
        }
        if (field1060 != 0) {
            field1060 = 0;
            Statics.method951(class217.method3680(Statics.field481));
        }
        if (field1062) {
            method1407();
        }
        if (Statics.field736 != null && field1018 == 0) {
            Statics.method951(Statics.field736);
        }
    }

    @ObfuscatedName("u.gn(IIIII)V")
    public static void method193(int arg0, int arg1, int arg2, int arg3) {
        class217 var4 = class217.method2792(arg0, arg1);
        if (var4 != null && var4.field2764 != null) {
            class70 var5 = new class70();
            var5.field823 = var4;
            var5.field822 = var4.field2764;
            class84.method1349(var5);
        }
        field1158 = arg3;
        field1062 = true;
        Statics.field612 = arg0;
        field1063 = arg1;
        Statics.field3210 = arg2;
        Statics.method951(var4);
    }

    @ObfuscatedName("ca.gi(B)V")
    public static void method1407() {
        if (!field1062) {
            return;
        }
        class217 var0 = class217.method2792(Statics.field612, field1063);
        if (var0 != null && var0.field2747 != null) {
            class70 var1 = new class70();
            var1.field823 = var0;
            var1.field822 = var0.field2747;
            class84.method1349(var1);
        }
        field1062 = false;
        Statics.method951(var0);
    }

    @ObfuscatedName("b.ga(III)V")
    public static void method180(int arg0, int arg1) {
        field948.method3054(84);
        field948.method2834(arg0);
        field948.method2842(arg1);
    }

    @ObfuscatedName("av.ht(B)V")
    public static final void method212() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field1046 - 1; var1++) {
                if (field933[var1] < 1000 && field933[var1 + 1] > 1000) {
                    String var2 = field1052[var1];
                    field1052[var1] = field1052[var1 + 1];
                    field1052[var1 + 1] = var2;
                    String var3 = field1051[var1];
                    field1051[var1] = field1051[var1 + 1];
                    field1051[var1 + 1] = var3;
                    int var4 = field933[var1];
                    field933[var1] = field933[var1 + 1];
                    field933[var1 + 1] = var4;
                    int var5 = field1047[var1];
                    field1047[var1] = field1047[var1 + 1];
                    field1047[var1 + 1] = var5;
                    int var6 = field1048[var1];
                    field1048[var1] = field1048[var1 + 1];
                    field1048[var1 + 1] = var6;
                    int var7 = field928[var1];
                    field928[var1] = field928[var1 + 1];
                    field928[var1 + 1] = var7;
                    if (field1054 != -1) {
                        if (field1054 == var1) {
                            field1054 = var1 + 1;
                        } else if (field1054 == var1 + 1) {
                            field1054 = var1;
                        }
                    }
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("an.hy(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method551(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method1496(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("cn.hm(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method1496(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field1045 || field1046 >= 500) {
            return;
        }
        field1051[field1046] = arg0;
        field1052[field1046] = arg1;
        field933[field1046] = arg2;
        field928[field1046] = arg3;
        field1047[field1046] = arg4;
        field1048[field1046] = arg5;
        if (arg6) {
            field1054 = field1046;
        }
        field1046++;
    }

    @ObfuscatedName("ho.hz(I)I")
    public static final int method3690() {
        if (field1046 <= 0) {
            return -1;
        } else if (field990 && class51.field661[81] && field1054 != -1) {
            return field1054;
        } else {
            return field1046 - 1;
        }
    }

    @ObfuscatedName("cc.hg(I)V")
    public static void method1646() {
        for (int var0 = 0; var0 < field1046; var0++) {
            if (method235(field933[var0])) {
                if (var0 < field1046 - 1) {
                    for (int var1 = var0; var1 < field1046 - 1; var1++) {
                        field1051[var1] = field1051[var1 + 1];
                        field1052[var1] = field1052[var1 + 1];
                        field933[var1] = field933[var1 + 1];
                        field928[var1] = field928[var1 + 1];
                        field1047[var1] = field1047[var1 + 1];
                        field1048[var1] = field1048[var1 + 1];
                    }
                }
                field1046--;
            }
        }
    }

    @ObfuscatedName("af.hw(II)Z")
    public static boolean method235(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("jq.hx(IIIIB)V")
    public static final void method4302(int arg0, int arg1, int arg2, int arg3) {
        if (field1060 == 0 && !field1062) {
            method551(class226.field3018, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class135.field2001; var6++) {
            int var7 = class135.field2003[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field324.method2554(Statics.field890, var8, var9, var7) >= 0) {
                    class256 var12 = class256.method239(var11);
                    if (var12.field3484 != null) {
                        var12 = var12.method4121();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field1060 == 1) {
                        method551(class226.field3013, field1061 + " " + class89.field1381 + " " + class89.method96(65535) + var12.field3453, 1, var7, var8, var9);
                    } else if (!field1062) {
                        String[] var13 = var12.field3470;
                        if (field1078) {
                            var13 = method8(var13);
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
                                    method551(var13[var14], class89.method96(65535) + var12.field3453, var15, var7, var8, var9);
                                }
                            }
                        }
                        method551(class226.field3014, class89.method96(65535) + var12.field3453, 1002, var12.field3462 << 14, var8, var9);
                    } else if ((Statics.field3210 & 0x4) == 4) {
                        method551(field1065, field1066 + " " + class89.field1381 + " " + class89.method96(65535) + var12.field3453, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class87 var16 = field1159[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field1363.field3560 == 1 && (var16.field1234 & 0x7F) == 64 && (var16.field1210 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field931; var17++) {
                            class87 var18 = field1159[field1002[var17]];
                            if (var18 != null && var16 != var18 && var18.field1363.field3560 == 1 && var16.field1234 == var18.field1234 && var16.field1210 == var18.field1210) {
                                method26(var18.field1363, field1002[var17], var8, var9);
                            }
                        }
                        int var19 = class97.field1488;
                        int[] var20 = class97.field1492;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class75 var22 = field1049[var20[var21]];
                            if (var22 != null && var16.field1234 == var22.field1234 && var16.field1210 == var22.field1210) {
                                method13(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method26(var16.field1363, var11, var8, var9);
                }
                if (var10 == 0) {
                    class75 var23 = field1049[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field1234 & 0x7F) == 64 && (var23.field1210 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field931; var24++) {
                            class87 var25 = field1159[field1002[var24]];
                            if (var25 != null && var25.field1363.field3560 == 1 && var23.field1234 == var25.field1234 && var23.field1210 == var25.field1210) {
                                method26(var25.field1363, field1002[var24], var8, var9);
                            }
                        }
                        int var26 = class97.field1488;
                        int[] var27 = class97.field1492;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class75 var29 = field1049[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field1234 == var29.field1234 && var23.field1210 == var29.field1210) {
                                method13(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field1036 == var11) {
                        var4 = var7;
                    } else {
                        method13(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class194 var30 = field1086[Statics.field890][var8][var9];
                    if (var30 != null) {
                        for (class95 var31 = (class95) var30.method3253(); var31 != null; var31 = (class95) var30.method3255()) {
                            class257 var32 = class257.method3684(var31.field1479);
                            if (field1060 == 1) {
                                method551(class226.field3013, field1061 + " " + class89.field1381 + " " + class89.method96(16748608) + var32.field3535, 16, var31.field1479, var8, var9);
                            } else if (!field1062) {
                                String[] var33 = var32.field3502;
                                if (field1078) {
                                    var33 = method8(var33);
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
                                        method551(var33[var34], class89.method96(16748608) + var32.field3535, var35, var31.field1479, var8, var9);
                                    } else if (var34 == 2) {
                                        method551(class226.field2881, class89.method96(16748608) + var32.field3535, 20, var31.field1479, var8, var9);
                                    }
                                }
                                method551(class226.field3014, class89.method96(16748608) + var32.field3535, 1004, var31.field1479, var8, var9);
                            } else if ((Statics.field3210 & 0x1) == 1) {
                                method551(field1065, field1066 + " " + class89.field1381 + " " + class89.method96(16748608) + var32.field3535, 17, var31.field1479, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class75 var38 = field1049[field1036];
            method13(var38, field1036, var36, var37);
        }
    }

    @ObfuscatedName("j.hi(Lie;IIIS)V")
    public static final void method26(class259 arg0, int arg1, int arg2, int arg3) {
        if (field1046 >= 400) {
            return;
        }
        if (arg0.field3584 != null) {
            arg0 = arg0.method4218();
        }
        if (arg0 == null || !arg0.field3587 || arg0.field3573 && field949 != arg1) {
            return;
        }
        String var4 = arg0.field3563;
        if (arg0.field3576 != 0) {
            var4 = var4 + method3689(arg0.field3576, Statics.field341.field869) + " " + class89.field1379 + class226.field2971 + arg0.field3576 + class89.field1386;
        }
        if (arg0.field3573 && field1141) {
            method551(class226.field3014, class89.method96(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1060 == 1) {
            method551(class226.field3013, field1061 + " " + class89.field1381 + " " + class89.method96(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1062) {
            int var5 = arg0.field3573 && field1141 ? 2000 : 0;
            String[] var6 = arg0.field3574;
            if (field1078) {
                var6 = method8(var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class226.field2968)) {
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
                        method551(var6[var7], class89.method96(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class226.field2968)) {
                        short var10 = 0;
                        if (field911 != class92.field1411) {
                            if (field911 == class92.field1404 || field911 == class92.field1405 && arg0.field3576 > Statics.field341.field869) {
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
                            method551(var6[var9], class89.method96(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3573 || !field1141) {
                method551(class226.field3014, class89.method96(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field3210 & 0x2) == 2) {
            method551(field1065, field1066 + " " + class89.field1381 + " " + class89.method96(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("w.hs(Lbh;IIII)V")
    public static final void method13(class75 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field341 == arg0 || field1046 >= 400) {
            return;
        }
        String var4;
        if (arg0.field870 == 0) {
            var4 = arg0.field868[0] + arg0.field873 + arg0.field868[1] + method3689(arg0.field869, Statics.field341.field869) + " " + class89.field1379 + class226.field2971 + arg0.field869 + class89.field1386 + arg0.field868[2];
        } else {
            var4 = arg0.field868[0] + arg0.field873 + arg0.field868[1] + " " + class89.field1379 + class226.field3020 + arg0.field870 + class89.field1386 + arg0.field868[2];
        }
        if (field1060 == 1) {
            method551(class226.field3013, field1061 + " " + class89.field1381 + " " + class89.method96(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field1062) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field1033[var5] != null) {
                    short var6 = 0;
                    if (field1033[var5].equalsIgnoreCase(class226.field2968)) {
                        if (field929 == class92.field1411) {
                            continue;
                        }
                        if (field929 == class92.field1404 || field929 == class92.field1405 && arg0.field869 > Statics.field341.field869) {
                            var6 = 2000;
                        }
                        if (Statics.field341.field882 != 0 && arg0.field882 != 0) {
                            if (Statics.field341.field882 == arg0.field882) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field1146[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field1058[var5] + var6;
                    method551(field1033[var5], class89.method96(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field3210 & 0x8) == 8) {
            method551(field1065, field1066 + " " + class89.field1381 + " " + class89.method96(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field1046; var9++) {
            if (field933[var9] == 23) {
                field1052[var9] = class89.method96(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("hh.hl(IIB)Ljava/lang/String;")
    public static final String method3689(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class89.method96(16711680);
        } else if (var2 < -6) {
            return class89.method96(16723968);
        } else if (var2 < -3) {
            return class89.method96(16740352);
        } else if (var2 < 0) {
            return class89.method96(16756736);
        } else if (var2 > 9) {
            return class89.method96(65280);
        } else if (var2 > 6) {
            return class89.method96(4259584);
        } else if (var2 > 3) {
            return class89.method96(8453888);
        } else if (var2 > 0) {
            return class89.method96(12648192);
        } else {
            return class89.method96(16776960);
        }
    }

    @ObfuscatedName("fp.hn(IIIIIIIIB)V")
    public static final void method2656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class217.method892(arg0)) {
            Statics.field791 = null;
            method238(Statics.field2647[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field791 != null) {
                method238(Statics.field791, -1412584499, arg1, arg2, arg3, arg4, Statics.field304, Statics.field848, arg7);
                Statics.field791 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1112[var8] = true;
            }
        } else {
            field1112[arg7] = true;
        }
    }

    @ObfuscatedName("ae.ha([Lhs;IIIIIIIII)V")
    public static final void method238(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class282.method4517(arg2, arg3, arg4, arg5);
        class137.method2320();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class217 var10 = arg0[var9];
            if (var10 != null && (var10.field2674 == arg1 || arg1 == -1412584499 && field1080 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1055[field1110] = var10.field2668 + arg6;
                    field1000[field1110] = var10.field2669 + arg7;
                    field1117[field1110] = var10.field2670;
                    field913[field1110] = var10.field2671;
                    var11 = ++field1110 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2786 = var11;
                var10.field2787 = field960;
                if (!var10.field2656 || !method470(var10)) {
                    if (var10.field2705 > 0) {
                        int var12 = var10.field2705;
                        if (var12 == 324) {
                            if (field994 == -1) {
                                field994 = var10.field2690;
                                field1180 = var10.field2691;
                            }
                            if (field1178.field2626) {
                                var10.field2690 = field994;
                            } else {
                                var10.field2690 = field1180;
                            }
                        } else if (var12 == 325) {
                            if (field994 == -1) {
                                field994 = var10.field2690;
                                field1180 = var10.field2691;
                            }
                            if (field1178.field2626) {
                                var10.field2690 = field1180;
                            } else {
                                var10.field2690 = field994;
                            }
                        } else if (var12 == 327) {
                            var10.field2706 = 150;
                            var10.field2727 = (int) (Math.sin((double) field960 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2696 = 5;
                            var10.field2699 = 0;
                        } else if (var12 == 328) {
                            var10.field2706 = 150;
                            var10.field2727 = (int) (Math.sin((double) field960 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2696 = 5;
                            var10.field2699 = 1;
                        }
                    }
                    int var13 = var10.field2668 + arg6;
                    int var14 = var10.field2669 + arg7;
                    int var15 = var10.field2686;
                    if (field1080 == var10) {
                        if (arg1 != -1412584499 && !var10.field2653) {
                            Statics.field791 = arg0;
                            Statics.field304 = arg6;
                            Statics.field848 = arg7;
                            continue;
                        }
                        if (field1091 && field1085) {
                            int var16 = class60.field731;
                            int var17 = class60.field732 * -417192073;
                            int var18 = var16 - field1082;
                            int var19 = var17 - field1083;
                            if (var18 < field1094) {
                                var18 = field1094;
                            }
                            if (var10.field2670 + var18 > field1094 + field1081.field2670) {
                                var18 = field1094 + field1081.field2670 - var10.field2670;
                            }
                            if (var19 < field1087) {
                                var19 = field1087;
                            }
                            if (var10.field2671 + var19 > field1087 + field1081.field2671) {
                                var19 = field1087 + field1081.field2671 - var10.field2671;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2653) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2657 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2657 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2670 + var13;
                        int var27 = var10.field2671 + var14;
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
                        int var30 = var10.field2670 + var13;
                        int var31 = var10.field2671 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2656 || var20 < var22 && var21 < var23) {
                        if (var10.field2705 != 0) {
                            if (var10.field2705 == 1336) {
                                if (field919) {
                                    var14 += 15;
                                    Statics.field2140.method4365("Fps:" + field714, var10.field2670 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field1056) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field1056) {
                                        var34 = 16711680;
                                    }
                                    Statics.field2140.method4365("Mem:" + var33 + "k", var10.field2670 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2705 == 1337) {
                                field942 = var13;
                                field1057 = var14;
                                method164(var13, var14, var10.field2670, var10.field2671);
                                field1112[var10.field2786] = true;
                                class282.method4517(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2705 == 1338) {
                                method4480(var10, var13, var14, var11);
                                class282.method4517(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2705 == 1339) {
                                method53(var10, var13, var14, var11);
                                class282.method4517(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2705 == 1400) {
                                Statics.field602.method4731(var13, var14, var10.field2670, var10.field2671, field960);
                            }
                            if (var10.field2705 == 1401) {
                                Statics.field602.method4732(var13, var14, var10.field2670, var10.field2671);
                            }
                        }
                        if (var10.field2657 == 0) {
                            if (!var10.field2656 && method470(var10) && Statics.field1477 != var10) {
                                continue;
                            }
                            if (!var10.field2656) {
                                if (var10.field2677 > var10.field2709 - var10.field2671) {
                                    var10.field2677 = var10.field2709 - var10.field2671;
                                }
                                if (var10.field2677 < 0) {
                                    var10.field2677 = 0;
                                }
                            }
                            method238(arg0, var10.field2756, var20, var21, var22, var23, var13 - var10.field2779, var14 - var10.field2677, var11);
                            if (var10.field2676 != null) {
                                method238(var10.field2676, var10.field2756, var20, var21, var22, var23, var13 - var10.field2779, var14 - var10.field2677, var11);
                            }
                            class69 var35 = (class69) field1119.method3190((long) var10.field2756);
                            if (var35 != null) {
                                method2656(var35.field820, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class282.method4517(arg2, arg3, arg4, arg5);
                            class137.method2320();
                        }
                        if (field930 || field1129[var11] || field1147 > 1) {
                            if (var10.field2657 == 0 && !var10.field2656 && var10.field2709 > var10.field2671) {
                                int var36 = var10.field2670 + var13;
                                int var37 = var10.field2677;
                                int var38 = var10.field2671;
                                int var39 = var10.field2709;
                                Statics.field14[0].method4594(var36, var14);
                                Statics.field14[1].method4594(var36, var14 + var38 - 16);
                                class282.method4510(var36, var14 + 16, 16, var38 - 32, field984);
                                int var40 = (var38 - 32) * var38 / var39;
                                if (var40 < 8) {
                                    var40 = 8;
                                }
                                int var41 = (var38 - 32 - var40) * var37 / (var39 - var38);
                                class282.method4510(var36, var14 + 16 + var41, 16, var40, field985);
                                class282.method4520(var36, var14 + 16 + var41, var40, field987);
                                class282.method4520(var36 + 1, var14 + 16 + var41, var40, field987);
                                class282.method4518(var36, var14 + 16 + var41, 16, field987);
                                class282.method4518(var36, var14 + 17 + var41, 16, field987);
                                class282.method4520(var36 + 15, var14 + 16 + var41, var40, field1185);
                                class282.method4520(var36 + 14, var14 + 17 + var41, var40 - 1, field1185);
                                class282.method4518(var36, var14 + 15 + var41 + var40, 16, field1185);
                                class282.method4518(var36 + 1, var14 + 14 + var41 + var40, 15, field1185);
                            }
                            if (var10.field2657 != 1) {
                                if (var10.field2657 == 2) {
                                    int var42 = 0;
                                    for (int var43 = 0; var43 < var10.field2667; var43++) {
                                        for (int var44 = 0; var44 < var10.field2666; var44++) {
                                            int var45 = (var10.field2775 + 32) * var44 + var13;
                                            int var46 = (var10.field2722 + 32) * var43 + var14;
                                            if (var42 < 20) {
                                                var45 += var10.field2723[var42];
                                                var46 += var10.field2724[var42];
                                            }
                                            if (var10.field2773[var42] > 0) {
                                                boolean var47 = false;
                                                boolean var48 = false;
                                                int var49 = var10.field2773[var42] - 1;
                                                if (var45 + 32 > arg2 && var45 < arg4 && var46 + 32 > arg3 && var46 < arg5 || Statics.field2336 == var10 && field1020 == var42) {
                                                    class286 var50;
                                                    if (field1060 == 1 && Statics.field1407 == var42 && Statics.field481 == var10.field2756) {
                                                        var50 = Statics.method25(var49, var10.field2774[var42], 2, 0, 2, false);
                                                    } else {
                                                        var50 = Statics.method25(var49, var10.field2774[var42], 1, 3153952, 2, false);
                                                    }
                                                    if (var50 == null) {
                                                        Statics.method951(var10);
                                                    } else if (Statics.field2336 == var10 && field1020 == var42) {
                                                        int var51 = class60.field731 - field912;
                                                        int var52 = class60.field732 * -417192073 - field986;
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        if (field1025 < 5) {
                                                            var51 = 0;
                                                            var52 = 0;
                                                        }
                                                        var50.method4626(var45 + var51, var46 + var52, 128);
                                                        if (arg1 != -1) {
                                                            class217 var53 = arg0[arg1 & 0xFFFF];
                                                            if (var46 + var52 < class282.field3756 && var53.field2677 > 0) {
                                                                int var54 = field1126 * (class282.field3756 - var46 - var52) / 3;
                                                                if (var54 > field1126 * 10) {
                                                                    var54 = field1126 * 10;
                                                                }
                                                                if (var54 > var53.field2677) {
                                                                    var54 = var53.field2677;
                                                                }
                                                                var53.field2677 -= var54;
                                                                field986 += var54;
                                                                Statics.method951(var53);
                                                            }
                                                            if (var46 + var52 + 32 > class282.field3757 && var53.field2677 < var53.field2709 - var53.field2671) {
                                                                int var55 = field1126 * (var46 + var52 + 32 - class282.field3757) / 3;
                                                                if (var55 > field1126 * 10) {
                                                                    var55 = field1126 * 10;
                                                                }
                                                                if (var55 > var53.field2709 - var53.field2671 - var53.field2677) {
                                                                    var55 = var53.field2709 - var53.field2671 - var53.field2677;
                                                                }
                                                                var53.field2677 += var55;
                                                                field986 -= var55;
                                                                Statics.method951(var53);
                                                            }
                                                        }
                                                    } else if (Statics.field736 == var10 && field1019 == var42) {
                                                        var50.method4626(var45, var46, 128);
                                                    } else {
                                                        var50.method4621(var45, var46);
                                                    }
                                                }
                                            } else if (var10.field2725 != null && var42 < 20) {
                                                class286 var56 = var10.method3609(var42);
                                                if (var56 != null) {
                                                    var56.method4621(var45, var46);
                                                } else if (class217.field2652) {
                                                    Statics.method951(var10);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                } else if (var10.field2657 == 3) {
                                    int var57;
                                    if (method677(var10)) {
                                        var57 = var10.field2729;
                                        if (Statics.field1477 == var10 && var10.field2683 != 0) {
                                            var57 = var10.field2683;
                                        }
                                    } else {
                                        var57 = var10.field2761;
                                        if (Statics.field1477 == var10 && var10.field2682 != 0) {
                                            var57 = var10.field2682;
                                        }
                                    }
                                    if (var10.field2684) {
                                        switch(var10.field2685.field3769) {
                                            case 1:
                                                class282.method4506(var13, var14, var10.field2670, var10.field2671, var10.field2761, var10.field2729, 256 - (var10.field2686 & 0xFF), 256 - (var10.field2687 & 0xFF));
                                                break;
                                            case 2:
                                                class282.method4558(var13, var14, var10.field2670, var10.field2671, var10.field2761, var10.field2729, 256 - (var10.field2686 & 0xFF), 256 - (var10.field2687 & 0xFF));
                                                break;
                                            case 3:
                                                class282.method4502(var13, var14, var10.field2670, var10.field2671, var10.field2761, var10.field2729, 256 - (var10.field2686 & 0xFF), 256 - (var10.field2687 & 0xFF));
                                                break;
                                            case 4:
                                                class282.method4503(var13, var14, var10.field2670, var10.field2671, var10.field2761, var10.field2729, 256 - (var10.field2686 & 0xFF), 256 - (var10.field2687 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class282.method4510(var13, var14, var10.field2670, var10.field2671, var57);
                                                } else {
                                                    class282.method4509(var13, var14, var10.field2670, var10.field2671, var57, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class282.method4572(var13, var14, var10.field2670, var10.field2671, var57);
                                    } else {
                                        class282.method4525(var13, var14, var10.field2670, var10.field2671, var57, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2657 == 4) {
                                    class264 var58 = var10.method3647();
                                    if (var58 != null) {
                                        String var59 = var10.field2715;
                                        int var60;
                                        if (method677(var10)) {
                                            var60 = var10.field2729;
                                            if (Statics.field1477 == var10 && var10.field2683 != 0) {
                                                var60 = var10.field2683;
                                            }
                                            if (var10.field2716.length() > 0) {
                                                var59 = var10.field2716;
                                            }
                                        } else {
                                            var60 = var10.field2761;
                                            if (Statics.field1477 == var10 && var10.field2682 != 0) {
                                                var60 = var10.field2682;
                                            }
                                        }
                                        if (var10.field2656 && var10.field2720 != -1) {
                                            class257 var61 = class257.method3684(var10.field2720);
                                            var59 = var61.field3535;
                                            if (var59 == null) {
                                                var59 = "null";
                                            }
                                            if ((var61.field3503 == 1 || var10.field2776 != 1) && var10.field2776 != -1) {
                                                var59 = class89.method96(16748608) + var59 + class89.field1383 + " " + 'x' + method1635(var10.field2776);
                                            }
                                        }
                                        if (field1071 == var10) {
                                            class226 var10000 = (class226) null;
                                            var59 = class226.field3037;
                                            var60 = var10.field2761;
                                        }
                                        if (!var10.field2656) {
                                            var59 = method890(var59, var10);
                                        }
                                        var58.method4328(var59, var13, var14, var10.field2670, var10.field2671, var60, var10.field2737 ? 0 : -1, var10.field2697, var10.field2719, var10.field2681);
                                    } else if (class217.field2652) {
                                        Statics.method951(var10);
                                    }
                                } else if (var10.field2657 == 5) {
                                    if (var10.field2656) {
                                        class286 var63;
                                        if (var10.field2720 == -1) {
                                            var63 = var10.method3614(false);
                                        } else {
                                            var63 = Statics.method25(var10.field2720, var10.field2776, var10.field2694, var10.field2695, var10.field2713, false);
                                        }
                                        if (var63 != null) {
                                            int var64 = var63.field3787;
                                            int var65 = var63.field3786;
                                            if (var10.field2693) {
                                                class282.method4546(var13, var14, var10.field2670 + var13, var10.field2671 + var14);
                                                int var66 = (var10.field2670 + (var64 - 1)) / var64;
                                                int var67 = (var10.field2671 + (var65 - 1)) / var65;
                                                for (int var68 = 0; var68 < var66; var68++) {
                                                    for (int var69 = 0; var69 < var67; var69++) {
                                                        if (var10.field2692 != 0) {
                                                            var63.method4623(var64 / 2 + var64 * var68 + var13, var65 / 2 + var65 * var69 + var14, var10.field2692, 4096);
                                                        } else if (var15 == 0) {
                                                            var63.method4621(var64 * var68 + var13, var65 * var69 + var14);
                                                        } else {
                                                            var63.method4626(var64 * var68 + var13, var65 * var69 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class282.method4517(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var70 = var10.field2670 * 4096 / var64;
                                                if (var10.field2692 != 0) {
                                                    var63.method4623(var10.field2670 / 2 + var13, var10.field2671 / 2 + var14, var10.field2692, var70);
                                                } else if (var15 != 0) {
                                                    var63.method4670(var13, var14, var10.field2670, var10.field2671, 256 - (var15 & 0xFF));
                                                } else if (var10.field2670 == var64 && var10.field2671 == var65) {
                                                    var63.method4621(var13, var14);
                                                } else {
                                                    var63.method4634(var13, var14, var10.field2670, var10.field2671);
                                                }
                                            }
                                        } else if (class217.field2652) {
                                            Statics.method951(var10);
                                        }
                                    } else {
                                        class286 var62 = var10.method3614(method677(var10));
                                        if (var62 != null) {
                                            var62.method4621(var13, var14);
                                        } else if (class217.field2652) {
                                            Statics.method951(var10);
                                        }
                                    }
                                } else if (var10.field2657 == 6) {
                                    boolean var71 = method677(var10);
                                    int var72;
                                    if (var71) {
                                        var72 = var10.field2703;
                                    } else {
                                        var72 = var10.field2778;
                                    }
                                    class134 var73 = null;
                                    int var74 = 0;
                                    if (var10.field2720 != -1) {
                                        class257 var75 = class257.method3684(var10.field2720);
                                        if (var75 != null) {
                                            class257 var76 = var75.method4155(var10.field2776);
                                            var73 = var76.method4182(1);
                                            if (var73 == null) {
                                                Statics.method951(var10);
                                            } else {
                                                var73.method2224();
                                                var74 = var73.field2129 / 2;
                                            }
                                        }
                                    } else if (var10.field2696 == 5) {
                                        if (var10.field2699 == 0) {
                                            var73 = field1178.method3574((class261) null, -1, (class261) null, -1);
                                        } else {
                                            var73 = Statics.field341.method1001();
                                        }
                                    } else if (var72 == -1) {
                                        var73 = var10.method3643((class261) null, -1, var71, Statics.field341.field864);
                                        if (var73 == null && class217.field2652) {
                                            Statics.method951(var10);
                                        }
                                    } else {
                                        class261 var77 = class261.method790(var72);
                                        var73 = var10.method3643(var77, var10.field2777, var71, Statics.field341.field864);
                                        if (var73 == null && class217.field2652) {
                                            Statics.method951(var10);
                                        }
                                    }
                                    class137.method2372(var10.field2670 / 2 + var13, var10.field2671 / 2 + var14);
                                    int var78 = var10.field2738 * class137.field2039[var10.field2706] >> 16;
                                    int var79 = var10.field2738 * class137.field2023[var10.field2706] >> 16;
                                    if (var73 != null) {
                                        if (var10.field2656) {
                                            var73.method2224();
                                            if (var10.field2712) {
                                                var73.method2238(0, var10.field2727, var10.field2654, var10.field2706, var10.field2751, var10.field2732 + var74 + var78, var10.field2732 + var79, var10.field2738);
                                            } else {
                                                var73.method2267(0, var10.field2727, var10.field2654, var10.field2706, var10.field2751, var10.field2732 + var74 + var78, var10.field2732 + var79);
                                            }
                                        } else {
                                            var73.method2267(0, var10.field2727, 0, var10.field2706, 0, var78, var79);
                                        }
                                    }
                                    class137.method2376();
                                } else {
                                    if (var10.field2657 == 7) {
                                        class264 var80 = var10.method3647();
                                        if (var80 == null) {
                                            if (class217.field2652) {
                                                Statics.method951(var10);
                                            }
                                            continue;
                                        }
                                        int var81 = 0;
                                        for (int var82 = 0; var82 < var10.field2667; var82++) {
                                            for (int var83 = 0; var83 < var10.field2666; var83++) {
                                                if (var10.field2773[var81] > 0) {
                                                    class257 var84 = class257.method3684(var10.field2773[var81] - 1);
                                                    String var85;
                                                    if (var84.field3503 != 1 && var10.field2774[var81] == 1) {
                                                        var85 = class89.method96(16748608) + var84.field3535 + class89.field1383;
                                                    } else {
                                                        var85 = class89.method96(16748608) + var84.field3535 + class89.field1383 + " " + 'x' + method1635(var10.field2774[var81]);
                                                    }
                                                    int var86 = (var10.field2775 + 115) * var83 + var13;
                                                    int var87 = (var10.field2722 + 12) * var82 + var14;
                                                    if (var10.field2697 == 0) {
                                                        var80.method4338(var85, var86, var87, var10.field2761, var10.field2737 ? 0 : -1);
                                                    } else if (var10.field2697 == 1) {
                                                        var80.method4327(var85, var10.field2670 / 2 + var86, var87, var10.field2761, var10.field2737 ? 0 : -1);
                                                    } else {
                                                        var80.method4365(var85, var10.field2670 + var86 - 1, var87, var10.field2761, var10.field2737 ? 0 : -1);
                                                    }
                                                }
                                                var81++;
                                            }
                                        }
                                    }
                                    if (var10.field2657 == 8 && Statics.field281 == var10 && field918 == field1059) {
                                        int var88 = 0;
                                        int var89 = 0;
                                        class264 var90 = Statics.field2140;
                                        String var91 = var10.field2715;
                                        String var92 = method890(var91, var10);
                                        while (var92.length() > 0) {
                                            int var93 = var92.indexOf(class89.field1382);
                                            String var94;
                                            if (var93 == -1) {
                                                var94 = var92;
                                                var92 = "";
                                            } else {
                                                var94 = var92.substring(0, var93);
                                                var92 = var92.substring(var93 + 4);
                                            }
                                            int var95 = var90.method4381(var94);
                                            if (var95 > var88) {
                                                var88 = var95;
                                            }
                                            var89 += var90.field3644 + 1;
                                        }
                                        var88 += 6;
                                        var89 += 7;
                                        int var96 = var10.field2670 + var13 - 5 - var88;
                                        int var97 = var10.field2671 + var14 + 5;
                                        if (var96 < var13 + 5) {
                                            var96 = var13 + 5;
                                        }
                                        if (var88 + var96 > arg4) {
                                            var96 = arg4 - var88;
                                        }
                                        if (var89 + var97 > arg5) {
                                            var97 = arg5 - var89;
                                        }
                                        class282.method4510(var96, var97, var88, var89, 16777120);
                                        class282.method4572(var96, var97, var88, var89, 0);
                                        String var98 = var10.field2715;
                                        int var99 = var90.field3644 + var97 + 2;
                                        String var100 = method890(var98, var10);
                                        while (var100.length() > 0) {
                                            int var101 = var100.indexOf(class89.field1382);
                                            String var102;
                                            if (var101 == -1) {
                                                var102 = var100;
                                                var100 = "";
                                            } else {
                                                var102 = var100.substring(0, var101);
                                                var100 = var100.substring(var101 + 4);
                                            }
                                            var90.method4338(var102, var96 + 3, var99, 0, -1);
                                            var99 += var90.field3644 + 1;
                                        }
                                    }
                                    if (var10.field2657 == 9) {
                                        int var103;
                                        int var104;
                                        int var105;
                                        int var106;
                                        if (var10.field2689) {
                                            var103 = var13;
                                            var104 = var10.field2671 + var14;
                                            var105 = var10.field2670 + var13;
                                            var106 = var14;
                                        } else {
                                            var103 = var13;
                                            var104 = var14;
                                            var105 = var10.field2670 + var13;
                                            var106 = var10.field2671 + var14;
                                        }
                                        if (var10.field2688 == 1) {
                                            class282.method4522(var103, var104, var105, var106, var10.field2761);
                                        } else {
                                            method176(var103, var104, var105, var106, var10.field2761, var10.field2688);
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

    @ObfuscatedName("x.hq(IIIIIIB)V")
    public static final void method176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class282.field3753;
        int var18 = arg1 - class282.field3756;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class137.method2341(var19, var20, var21);
        class137.method2368(var23, var24, var25, var19, var20, var21, arg4);
        class137.method2341(var19, var21, var22);
        class137.method2368(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("bn.hv(Ljava/lang/String;Lhs;I)Ljava/lang/String;")
    public static String method890(String arg0, class217 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method24(method1018(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field835 != null) {
                    var5 = class271.method2657(Statics.field835.field2239);
                    if (Statics.field835.field2242 != null) {
                        var5 = (String) Statics.field835.field2242;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("cm.hj(IB)Ljava/lang/String;")
    public static final String method1635(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class89.field1378 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class89.method96(65408) + var1.substring(0, var1.length() - 8) + class226.field3024 + " " + class89.field1379 + var1 + class89.field1386 + class89.field1383;
        } else if (var1.length() > 6) {
            return " " + class89.method96(16777215) + var1.substring(0, var1.length() - 4) + class226.field2872 + " " + class89.field1379 + var1 + class89.field1386 + class89.field1383;
        } else {
            return " " + class89.method96(16776960) + var1 + class89.field1383;
        }
    }

    @ObfuscatedName("client.hr(ZB)V")
    public final void method1063(boolean arg0) {
        int var2 = field1067;
        int var3 = Statics.field264;
        int var4 = Statics.field12;
        if (class217.method892(var2)) {
            method1028(Statics.field2647[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.hc(Lhs;I)V")
    public void method1046(class217 arg0) {
        class217 var2 = arg0.field2674 == -1 ? null : class217.method3680(arg0.field2674);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field264;
            var4 = Statics.field12;
        } else {
            var3 = var2.field2670;
            var4 = var2.field2671;
        }
        method3920(arg0, var3, var4, false);
        method2609(arg0, var3, var4);
    }

    @ObfuscatedName("cd.hp([Lhs;Lhs;ZI)V")
    public static void method1557(class217[] arg0, class217 arg1, boolean arg2) {
        int var3 = arg1.field2767 == 0 ? arg1.field2670 : arg1.field2767;
        int var4 = arg1.field2709 == 0 ? arg1.field2671 : arg1.field2709;
        method1028(arg0, arg1.field2756, var3, var4, arg2);
        if (arg1.field2676 != null) {
            method1028(arg1.field2676, arg1.field2756, var3, var4, arg2);
        }
        class69 var5 = (class69) field1119.method3190((long) arg1.field2756);
        if (var5 != null) {
            int var6 = var5.field820;
            if (class217.method892(var6)) {
                method1028(Statics.field2647[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2705 == 1337) {
        }
    }

    @ObfuscatedName("bj.hd([Lhs;IIIZI)V")
    public static void method1028(class217[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class217 var6 = arg0[var5];
            if (var6 != null && var6.field2674 == arg1) {
                method3920(var6, arg2, arg3, arg4);
                method2609(var6, arg2, arg3);
                if (var6.field2779 > var6.field2767 - var6.field2670) {
                    var6.field2779 = var6.field2767 - var6.field2670;
                }
                if (var6.field2779 < 0) {
                    var6.field2779 = 0;
                }
                if (var6.field2677 > var6.field2709 - var6.field2671) {
                    var6.field2677 = var6.field2709 - var6.field2671;
                }
                if (var6.field2677 < 0) {
                    var6.field2677 = 0;
                }
                if (var6.field2657 == 0) {
                    method1557(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("id.he(Lhs;IIZB)V")
    public static void method3920(class217 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2670;
        int var5 = arg0.field2671;
        if (arg0.field2662 == 0) {
            arg0.field2670 = arg0.field2666;
        } else if (arg0.field2662 == 1) {
            arg0.field2670 = arg1 - arg0.field2666;
        } else if (arg0.field2662 == 2) {
            arg0.field2670 = arg0.field2666 * arg1 >> 14;
        }
        if (arg0.field2663 == 0) {
            arg0.field2671 = arg0.field2667;
        } else if (arg0.field2663 == 1) {
            arg0.field2671 = arg2 - arg0.field2667;
        } else if (arg0.field2663 == 2) {
            arg0.field2671 = arg0.field2667 * arg2 >> 14;
        }
        if (arg0.field2662 == 4) {
            arg0.field2670 = arg0.field2755 * arg0.field2671 / arg0.field2760;
        }
        if (arg0.field2663 == 4) {
            arg0.field2671 = arg0.field2760 * arg0.field2670 / arg0.field2755;
        }
        if (field1077 && arg0.field2657 == 0) {
            if (arg0.field2671 < 5 && arg0.field2670 < 5) {
                arg0.field2671 = 5;
                arg0.field2670 = 5;
            } else {
                if (arg0.field2671 <= 0) {
                    arg0.field2671 = 5;
                }
                if (arg0.field2670 <= 0) {
                    arg0.field2670 = 5;
                }
            }
        }
        if (arg0.field2705 == 1337) {
            field1079 = arg0;
        }
        if (arg3 && arg0.field2707 != null && (arg0.field2670 != var4 || arg0.field2671 != var5)) {
            class70 var6 = new class70();
            var6.field823 = arg0;
            var6.field822 = arg0.field2707;
            field1106.method3270(var6);
        }
    }

    @ObfuscatedName("et.hb(Lhs;IIS)V")
    public static void method2609(class217 arg0, int arg1, int arg2) {
        if (arg0.field2660 == 0) {
            arg0.field2668 = arg0.field2664;
        } else if (arg0.field2660 == 1) {
            arg0.field2668 = (arg1 - arg0.field2670) / 2 + arg0.field2664;
        } else if (arg0.field2660 == 2) {
            arg0.field2668 = arg1 - arg0.field2670 - arg0.field2664;
        } else if (arg0.field2660 == 3) {
            arg0.field2668 = arg0.field2664 * arg1 >> 14;
        } else if (arg0.field2660 == 4) {
            arg0.field2668 = (arg0.field2664 * arg1 >> 14) + (arg1 - arg0.field2670) / 2;
        } else {
            arg0.field2668 = arg1 - arg0.field2670 - (arg0.field2664 * arg1 >> 14);
        }
        if (arg0.field2661 == 0) {
            arg0.field2669 = arg0.field2665;
        } else if (arg0.field2661 == 1) {
            arg0.field2669 = (arg2 - arg0.field2671) / 2 + arg0.field2665;
        } else if (arg0.field2661 == 2) {
            arg0.field2669 = arg2 - arg0.field2671 - arg0.field2665;
        } else if (arg0.field2661 == 3) {
            arg0.field2669 = arg0.field2665 * arg2 >> 14;
        } else if (arg0.field2661 == 4) {
            arg0.field2669 = (arg0.field2665 * arg2 >> 14) + (arg2 - arg0.field2671) / 2;
        } else {
            arg0.field2669 = arg2 - arg0.field2671 - (arg0.field2665 * arg2 >> 14);
        }
        if (!field1077 || arg0.field2657 != 0) {
            return;
        }
        if (arg0.field2668 < 0) {
            arg0.field2668 = 0;
        } else if (arg0.field2670 + arg0.field2668 > arg1) {
            arg0.field2668 = arg1 - arg0.field2670;
        }
        if (arg0.field2669 < 0) {
            arg0.field2669 = 0;
        } else if (arg0.field2671 + arg0.field2669 > arg2) {
            arg0.field2669 = arg2 - arg0.field2671;
        }
    }

    @ObfuscatedName("j.hh(II)Ljava/lang/String;")
    public static final String method24(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("bi.ho(Lhs;I)Z")
    public static final boolean method677(class217 arg0) {
        if (arg0.field2675 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2675.length; var1++) {
            int var2 = method1018(arg0, var1);
            int var3 = arg0.field2769[var1];
            if (arg0.field2675[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2675[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2675[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("bh.hk(Lhs;IB)I")
    public static final int method1018(class217 arg0, int arg1) {
        if (arg0.field2698 == null || arg1 >= arg0.field2698.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2698[arg1];
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
                    var7 = field1150[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field1013[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field1043[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class217 var11 = class217.method3680(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class257.method3684(var12).field3511 || field906)) {
                        for (int var13 = 0; var13 < var11.field2773.length; var13++) {
                            if (var12 + 1 == var11.field2773[var13]) {
                                var7 += var11.field2774[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class212.field2616[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class223.field2852[field1013[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class212.field2616[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field341.field869;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class223.field2851[var14]) {
                            var7 += field1013[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class217 var17 = class217.method3680(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class257.method3684(var18).field3511 || field906)) {
                        for (int var19 = 0; var19 < var17.field2773.length; var19++) {
                            if (var18 + 1 == var17.field2773[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1072;
                }
                if (var6 == 12) {
                    var7 = field1073;
                }
                if (var6 == 13) {
                    int var20 = class212.field2616[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class212.method659(var22);
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
                    var7 = (Statics.field341.field1234 >> 7) + Statics.field340;
                }
                if (var6 == 19) {
                    var7 = (Statics.field341.field1210 >> 7) + Statics.field356;
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

    @ObfuscatedName("fc.hu(Lhs;III)V")
    public static final void method2726(class217 arg0, int arg1, int arg2) {
        if (arg0.field2770 == 1) {
            method551(arg0.field2772, "", 24, 0, 0, arg0.field2756);
        }
        if (arg0.field2770 == 2 && !field1062) {
            String var3;
            if (class218.method241(method83(arg0)) == 0) {
                var3 = null;
            } else if (arg0.field2734 == null || arg0.field2734.trim().length() == 0) {
                var3 = null;
            } else {
                var3 = arg0.field2734;
            }
            if (var3 != null) {
                method551(var3, class89.method96(65280) + arg0.field2742, 25, 0, -1, arg0.field2756);
            }
        }
        if (arg0.field2770 == 3) {
            method551(class226.field3022, "", 26, 0, 0, arg0.field2756);
        }
        if (arg0.field2770 == 4) {
            method551(arg0.field2772, "", 28, 0, 0, arg0.field2756);
        }
        if (arg0.field2770 == 5) {
            method551(arg0.field2772, "", 29, 0, 0, arg0.field2756);
        }
        if (arg0.field2770 == 6 && field1071 == null) {
            method551(arg0.field2772, "", 30, 0, -1, arg0.field2756);
        }
        if (arg0.field2657 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2671; var6++) {
                for (int var7 = 0; var7 < arg0.field2670; var7++) {
                    int var8 = (arg0.field2775 + 32) * var7;
                    int var9 = (arg0.field2722 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field2723[var5];
                        var9 += arg0.field2724[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && arg2 < var9 + 32) {
                        field1023 = var5;
                        Statics.field1476 = arg0;
                        if (arg0.field2773[var5] > 0) {
                            class257 var10 = class257.method3684(arg0.field2773[var5] - 1);
                            if (field1060 == 1 && class218.method466(method83(arg0))) {
                                if (Statics.field481 != arg0.field2756 || Statics.field1407 != var5) {
                                    method551(class226.field3013, field1061 + " " + class89.field1381 + " " + class89.method96(16748608) + var10.field3535, 31, var10.field3521, var5, arg0.field2756);
                                }
                            } else if (!field1062 || !class218.method466(method83(arg0))) {
                                String[] var11 = var10.field3495;
                                if (field1078) {
                                    var11 = method8(var11);
                                }
                                int var12 = var10.method4176();
                                if (class218.method466(method83(arg0))) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        boolean var14 = var12 == var13;
                                        if (var11 != null && var11[var13] != null) {
                                            byte var15;
                                            if (var13 == 3) {
                                                var15 = 36;
                                            } else {
                                                var15 = 37;
                                            }
                                            method1496(var11[var13], class89.method96(16748608) + var10.field3535, var15, var10.field3521, var5, arg0.field2756, var14);
                                        } else if (var13 == 4) {
                                            method1496(class226.field2865, class89.method96(16748608) + var10.field3535, 37, var10.field3521, var5, arg0.field2756, var14);
                                        }
                                    }
                                }
                                if (class218.method151(method83(arg0))) {
                                    method551(class226.field3013, class89.method96(16748608) + var10.field3535, 38, var10.field3521, var5, arg0.field2756);
                                }
                                if (class218.method466(method83(arg0)) && var11 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        boolean var17 = var12 == var16;
                                        if (var11[var16] != null) {
                                            byte var18 = 0;
                                            if (var16 == 0) {
                                                var18 = 33;
                                            }
                                            if (var16 == 1) {
                                                var18 = 34;
                                            }
                                            if (var16 == 2) {
                                                var18 = 35;
                                            }
                                            method1496(var11[var16], class89.method96(16748608) + var10.field3535, var18, var10.field3521, var5, arg0.field2756, var17);
                                        }
                                    }
                                }
                                String[] var19 = arg0.field2726;
                                if (field1078) {
                                    var19 = method8(var19);
                                }
                                if (var19 != null) {
                                    for (int var20 = 4; var20 >= 0; var20--) {
                                        if (var19[var20] != null) {
                                            byte var21 = 0;
                                            if (var20 == 0) {
                                                var21 = 39;
                                            }
                                            if (var20 == 1) {
                                                var21 = 40;
                                            }
                                            if (var20 == 2) {
                                                var21 = 41;
                                            }
                                            if (var20 == 3) {
                                                var21 = 42;
                                            }
                                            if (var20 == 4) {
                                                var21 = 43;
                                            }
                                            method551(var19[var20], class89.method96(16748608) + var10.field3535, var21, var10.field3521, var5, arg0.field2756);
                                        }
                                    }
                                }
                                method551(class226.field3014, class89.method96(16748608) + var10.field3535, 1005, var10.field3521, var5, arg0.field2756);
                            } else if ((Statics.field3210 & 0x10) == 16) {
                                method551(field1065, field1066 + " " + class89.field1381 + " " + class89.method96(16748608) + var10.field3535, 32, var10.field3521, var5, arg0.field2756);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2656) {
            return;
        }
        if (!field1062) {
            for (int var22 = 9; var22 >= 5; var22--) {
                int var23 = method83(arg0);
                boolean var24 = (var23 >> var22 + 1 & 0x1) != 0;
                String var25;
                if (!var24 && arg0.field2658 == null) {
                    var25 = null;
                } else if (arg0.field2790 == null || arg0.field2790.length <= var22 || arg0.field2790[var22] == null || arg0.field2790[var22].trim().length() == 0) {
                    var25 = null;
                } else {
                    var25 = arg0.field2790[var22];
                }
                if (var25 != null) {
                    method551(var25, arg0.field2728, 1007, var22 + 1, arg0.field2672, arg0.field2756);
                }
            }
            String var27;
            if (class218.method241(method83(arg0)) == 0) {
                var27 = null;
            } else if (arg0.field2734 == null || arg0.field2734.trim().length() == 0) {
                var27 = null;
            } else {
                var27 = arg0.field2734;
            }
            if (var27 != null) {
                method551(var27, arg0.field2728, 25, 0, arg0.field2672, arg0.field2756);
            }
            for (int var29 = 4; var29 >= 0; var29--) {
                String var30 = method37(arg0, var29);
                if (var30 != null) {
                    method551(var30, arg0.field2728, 57, var29 + 1, arg0.field2672, arg0.field2756);
                }
            }
            int var31 = method83(arg0);
            boolean var32 = (var31 & 0x1) != 0;
            if (var32) {
                method551(class226.field3000, "", 30, 0, arg0.field2672, arg0.field2756);
            }
        } else if (class218.method3607(method83(arg0)) && (Statics.field3210 & 0x20) == 32) {
            method551(field1065, field1066 + " " + class89.field1381 + " " + arg0.field2728, 58, 0, arg0.field2672, arg0.field2756);
        }
    }

    @ObfuscatedName("gq.hf(IIIIIIIB)V")
    public static final void method3095(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class217.method892(arg0)) {
            method4475(Statics.field2647[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("jt.ib([Lhs;IIIIIIII)V")
    public static final void method4475(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class217 var9 = arg0[var8];
            if (var9 != null && (!var9.field2656 || var9.field2657 == 0 || var9.field2735 || method83(var9) != 0 || field1081 == var9 || var9.field2705 == 1338) && var9.field2674 == arg1 && (!var9.field2656 || !method470(var9))) {
                int var10 = var9.field2668 + arg6;
                int var11 = var9.field2669 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2657 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2657 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2670 + var10;
                    int var19 = var9.field2671 + var11;
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
                    int var22 = var9.field2670 + var10;
                    int var23 = var9.field2671 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1080 == var9) {
                    field981 = true;
                    field982 = var10;
                    field1090 = var11;
                }
                if (!var9.field2656 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field731;
                    int var25 = class60.field732 * -417192073;
                    if (class60.field737 != 0) {
                        var24 = class60.field738;
                        var25 = class60.field733;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2705 == 1337) {
                        if (!field961 && !field1045 && var26) {
                            method4302(var24, var25, var12, var13);
                        }
                    } else if (var9.field2705 != 1338) {
                        if (var9.field2705 == 1400) {
                            Statics.field602.method4717(class60.field731, class60.field732 * -417192073, var26, var10, var11, var9.field2670, var9.field2671);
                        }
                        if (!field1045 && var26) {
                            if (var9.field2705 == 1400) {
                                Statics.field602.method4764(var10, var11, var9.field2670, var9.field2671, var24, var25);
                            } else {
                                method2726(var9, var24 - var10, var25 - var11);
                            }
                        }
                        if (var9.field2657 == 0) {
                            if (!var9.field2656 && method470(var9) && Statics.field1477 != var9) {
                                continue;
                            }
                            method4475(arg0, var9.field2756, var12, var13, var14, var15, var10 - var9.field2779, var11 - var9.field2677);
                            if (var9.field2676 != null) {
                                method4475(var9.field2676, var9.field2756, var12, var13, var14, var15, var10 - var9.field2779, var11 - var9.field2677);
                            }
                            class69 var41 = (class69) field1119.method3190((long) var9.field2756);
                            if (var41 != null) {
                                if (var41.field812 == 0 && class60.field731 >= var12 && class60.field732 * -417192073 >= var13 && class60.field731 < var14 && class60.field732 * -417192073 < var15 && !field1045 && !field1077) {
                                    for (class70 var42 = (class70) field1106.method3252(); var42 != null; var42 = (class70) field1106.method3277()) {
                                        if (var42.field827) {
                                            var42.method3234();
                                            var42.field823.field2780 = false;
                                        }
                                    }
                                    if (Statics.field479 == 0) {
                                        field1080 = null;
                                        field1081 = null;
                                    }
                                    if (!field1045) {
                                        field1046 = 0;
                                        field1054 = -1;
                                        field1045 = false;
                                        field1051[0] = class226.field3110;
                                        field1052[0] = "";
                                        field933[0] = 1006;
                                        field1046 = 1;
                                    }
                                }
                                method3095(var41.field820, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2656) {
                            if (var9.field2788) {
                                if (class60.field731 >= var12 && class60.field732 * -417192073 >= var13 && class60.field731 < var14 && class60.field732 * -417192073 < var15) {
                                    for (class70 var43 = (class70) field1106.method3252(); var43 != null; var43 = (class70) field1106.method3277()) {
                                        if (var43.field827) {
                                            var43.method3234();
                                            var43.field823.field2780 = false;
                                        }
                                    }
                                    if (Statics.field479 == 0) {
                                        field1080 = null;
                                        field1081 = null;
                                    }
                                    if (!field1045) {
                                        field1051[0] = class226.field3110;
                                        field1052[0] = "";
                                        field933[0] = 1006;
                                        field1046 = 1;
                                    }
                                }
                            } else if (var9.field2789 && class60.field731 >= var12 && class60.field732 * -417192073 >= var13 && class60.field731 < var14 && class60.field732 * -417192073 < var15) {
                                for (class70 var44 = (class70) field1106.method3252(); var44 != null; var44 = (class70) field1106.method3277()) {
                                    if (var44.field827 && var44.field823.field2673 == var44.field822) {
                                        var44.method3234();
                                    }
                                }
                            }
                            boolean var45;
                            if (class60.field731 >= var12 && class60.field732 * -417192073 >= var13 && class60.field731 < var14 && class60.field732 * -417192073 < var15) {
                                var45 = true;
                            } else {
                                var45 = false;
                            }
                            boolean var46 = false;
                            if ((class60.field730 == 1 || !Statics.field2846 && class60.field730 == 4) && var45) {
                                var46 = true;
                            }
                            boolean var47 = false;
                            if ((class60.field737 == 1 || !Statics.field2846 && class60.field737 == 4) && class60.field738 >= var12 && class60.field733 >= var13 && class60.field738 < var14 && class60.field733 < var15) {
                                var47 = true;
                            }
                            if (var47) {
                                method940(var9, class60.field738 - var10, class60.field733 - var11);
                            }
                            if (var9.field2705 == 1400) {
                                Statics.field602.method4718(class60.field731, class60.field732 * -417192073, var45 & var46);
                            }
                            if (field1080 != null && field1080 != var9 && var45) {
                                int var48 = method83(var9);
                                boolean var49 = (var48 >> 20 & 0x1) != 0;
                                if (var49) {
                                    field964 = var9;
                                }
                            }
                            if (field1081 == var9) {
                                field1085 = true;
                                field1094 = var10;
                                field1087 = var11;
                            }
                            if (var9.field2735) {
                                if (var45 && field1187 != 0 && var9.field2673 != null) {
                                    class70 var50 = new class70();
                                    var50.field827 = true;
                                    var50.field823 = var9;
                                    var50.field836 = field1187;
                                    var50.field822 = var9.field2673;
                                    field1106.method3270(var50);
                                }
                                if (field1080 != null || Statics.field2336 != null || field1045) {
                                    var47 = false;
                                    var46 = false;
                                    var45 = false;
                                }
                                if (!var9.field2643 && var47) {
                                    var9.field2643 = true;
                                    if (var9.field2771 != null) {
                                        class70 var51 = new class70();
                                        var51.field827 = true;
                                        var51.field823 = var9;
                                        var51.field824 = class60.field738 - var10;
                                        var51.field836 = class60.field733 - var11;
                                        var51.field822 = var9.field2771;
                                        field1106.method3270(var51);
                                    }
                                }
                                if (var9.field2643 && var46 && var9.field2702 != null) {
                                    class70 var52 = new class70();
                                    var52.field827 = true;
                                    var52.field823 = var9;
                                    var52.field824 = class60.field731 - var10;
                                    var52.field836 = class60.field732 * -417192073 - var11;
                                    var52.field822 = var9.field2702;
                                    field1106.method3270(var52);
                                }
                                if (var9.field2643 && !var46) {
                                    var9.field2643 = false;
                                    if (var9.field2739 != null) {
                                        class70 var53 = new class70();
                                        var53.field827 = true;
                                        var53.field823 = var9;
                                        var53.field824 = class60.field731 - var10;
                                        var53.field836 = class60.field732 * -417192073 - var11;
                                        var53.field822 = var9.field2739;
                                        field1137.method3270(var53);
                                    }
                                }
                                if (var46 && var9.field2740 != null) {
                                    class70 var54 = new class70();
                                    var54.field827 = true;
                                    var54.field823 = var9;
                                    var54.field824 = class60.field731 - var10;
                                    var54.field836 = class60.field732 * -417192073 - var11;
                                    var54.field822 = var9.field2740;
                                    field1106.method3270(var54);
                                }
                                if (!var9.field2780 && var45) {
                                    var9.field2780 = true;
                                    if (var9.field2708 != null) {
                                        class70 var55 = new class70();
                                        var55.field827 = true;
                                        var55.field823 = var9;
                                        var55.field824 = class60.field731 - var10;
                                        var55.field836 = class60.field732 * -417192073 - var11;
                                        var55.field822 = var9.field2708;
                                        field1106.method3270(var55);
                                    }
                                }
                                if (var9.field2780 && var45 && var9.field2704 != null) {
                                    class70 var56 = new class70();
                                    var56.field827 = true;
                                    var56.field823 = var9;
                                    var56.field824 = class60.field731 - var10;
                                    var56.field836 = class60.field732 * -417192073 - var11;
                                    var56.field822 = var9.field2704;
                                    field1106.method3270(var56);
                                }
                                if (var9.field2780 && !var45) {
                                    var9.field2780 = false;
                                    if (var9.field2743 != null) {
                                        class70 var57 = new class70();
                                        var57.field827 = true;
                                        var57.field823 = var9;
                                        var57.field824 = class60.field731 - var10;
                                        var57.field836 = class60.field732 * -417192073 - var11;
                                        var57.field822 = var9.field2743;
                                        field1137.method3270(var57);
                                    }
                                }
                                if (var9.field2754 != null) {
                                    class70 var58 = new class70();
                                    var58.field823 = var9;
                                    var58.field822 = var9.field2754;
                                    field1107.method3270(var58);
                                }
                                if (var9.field2748 != null && field1027 > var9.field2678) {
                                    if (var9.field2749 == null || field1027 - var9.field2678 > 32) {
                                        class70 var63 = new class70();
                                        var63.field823 = var9;
                                        var63.field822 = var9.field2748;
                                        field1106.method3270(var63);
                                    } else {
                                        label589: for (int var59 = var9.field2678; var59 < field1027; var59++) {
                                            int var60 = field1093[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2749.length; var61++) {
                                                if (var9.field2749[var61] == var60) {
                                                    class70 var62 = new class70();
                                                    var62.field823 = var9;
                                                    var62.field822 = var9.field2748;
                                                    field1106.method3270(var62);
                                                    break label589;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2678 = field1027;
                                }
                                if (var9.field2750 != null && field1096 > var9.field2784) {
                                    if (var9.field2783 == null || field1096 - var9.field2784 > 32) {
                                        class70 var68 = new class70();
                                        var68.field823 = var9;
                                        var68.field822 = var9.field2750;
                                        field1106.method3270(var68);
                                    } else {
                                        label565: for (int var64 = var9.field2784; var64 < field1096; var64++) {
                                            int var65 = field1095[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var9.field2783.length; var66++) {
                                                if (var9.field2783[var66] == var65) {
                                                    class70 var67 = new class70();
                                                    var67.field823 = var9;
                                                    var67.field822 = var9.field2750;
                                                    field1106.method3270(var67);
                                                    break label565;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2784 = field1096;
                                }
                                if (var9.field2752 != null && field1098 > var9.field2785) {
                                    if (var9.field2753 == null || field1098 - var9.field2785 > 32) {
                                        class70 var73 = new class70();
                                        var73.field823 = var9;
                                        var73.field822 = var9.field2752;
                                        field1106.method3270(var73);
                                    } else {
                                        label541: for (int var69 = var9.field2785; var69 < field1098; var69++) {
                                            int var70 = field1175[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var9.field2753.length; var71++) {
                                                if (var9.field2753[var71] == var70) {
                                                    class70 var72 = new class70();
                                                    var72.field823 = var9;
                                                    var72.field822 = var9.field2752;
                                                    field1106.method3270(var72);
                                                    break label541;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2785 = field1098;
                                }
                                if (field1099 > var9.field2782 && var9.field2757 != null) {
                                    class70 var74 = new class70();
                                    var74.field823 = var9;
                                    var74.field822 = var9.field2757;
                                    field1106.method3270(var74);
                                }
                                if (field1100 > var9.field2782 && var9.field2768 != null) {
                                    class70 var75 = new class70();
                                    var75.field823 = var9;
                                    var75.field822 = var9.field2768;
                                    field1106.method3270(var75);
                                }
                                if (field1064 > var9.field2782 && var9.field2741 != null) {
                                    class70 var76 = new class70();
                                    var76.field823 = var9;
                                    var76.field822 = var9.field2741;
                                    field1106.method3270(var76);
                                }
                                if (field1102 > var9.field2782 && var9.field2765 != null) {
                                    class70 var77 = new class70();
                                    var77.field823 = var9;
                                    var77.field822 = var9.field2765;
                                    field1106.method3270(var77);
                                }
                                if (field1103 > var9.field2782 && var9.field2766 != null) {
                                    class70 var78 = new class70();
                                    var78.field823 = var9;
                                    var78.field822 = var9.field2766;
                                    field1106.method3270(var78);
                                }
                                if (field1104 > var9.field2782 && var9.field2781 != null) {
                                    class70 var79 = new class70();
                                    var79.field823 = var9;
                                    var79.field822 = var9.field2781;
                                    field1106.method3270(var79);
                                }
                                var9.field2782 = field1092;
                                if (var9.field2758 != null) {
                                    for (int var80 = 0; var80 < field1133; var80++) {
                                        class70 var81 = new class70();
                                        var81.field823 = var9;
                                        var81.field828 = field1039[var80];
                                        var81.field829 = field1136[var80];
                                        var81.field822 = var9.field2758;
                                        field1106.method3270(var81);
                                    }
                                }
                            }
                        }
                        if (!var9.field2656 && field1080 == null && Statics.field2336 == null && !field1045) {
                            if ((var9.field2721 >= 0 || var9.field2682 != 0) && class60.field731 >= var12 && class60.field732 * -417192073 >= var13 && class60.field731 < var14 && class60.field732 * -417192073 < var15) {
                                if (var9.field2721 >= 0) {
                                    Statics.field1477 = arg0[var9.field2721];
                                } else {
                                    Statics.field1477 = var9;
                                }
                            }
                            if (var9.field2657 == 8 && class60.field731 >= var12 && class60.field732 * -417192073 >= var13 && class60.field731 < var14 && class60.field732 * -417192073 < var15) {
                                Statics.field281 = var9;
                            }
                            if (var9.field2709 > var9.field2671) {
                                int var82 = var9.field2670 + var10;
                                int var83 = var9.field2671;
                                int var84 = var9.field2709;
                                int var85 = class60.field731;
                                int var86 = class60.field732 * -417192073;
                                if (field988) {
                                    field1074 = 32;
                                } else {
                                    field1074 = 0;
                                }
                                field988 = false;
                                if (class60.field730 == 1 || !Statics.field2846 && class60.field730 == 4) {
                                    if (var85 >= var82 && var85 < var82 + 16 && var86 >= var11 && var86 < var11 + 16) {
                                        var9.field2677 -= 4;
                                        Statics.method951(var9);
                                    } else if (var85 >= var82 && var85 < var82 + 16 && var86 >= var11 + var83 - 16 && var86 < var11 + var83) {
                                        var9.field2677 += 4;
                                        Statics.method951(var9);
                                    } else if (var85 >= var82 - field1074 && var85 < field1074 + var82 + 16 && var86 >= var11 + 16 && var86 < var11 + var83 - 16) {
                                        int var87 = (var83 - 32) * var83 / var84;
                                        if (var87 < 8) {
                                            var87 = 8;
                                        }
                                        int var88 = var86 - var11 - 16 - var87 / 2;
                                        int var89 = var83 - 32 - var87;
                                        var9.field2677 = (var84 - var83) * var88 / var89;
                                        Statics.method951(var9);
                                        field988 = true;
                                    }
                                }
                                if (field1187 != 0) {
                                    int var90 = var9.field2670;
                                    if (var85 >= var82 - var90 && var86 >= var11 && var85 < var82 + 16 && var86 <= var11 + var83) {
                                        var9.field2677 += field1187 * 45;
                                        Statics.method951(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field1088 == 0 || field1088 == 3) && (class60.field737 == 1 || !Statics.field2846 && class60.field737 == 4)) {
                        class211 var27 = var9.method3617(true);
                        if (var27 != null) {
                            int var28 = class60.field738 - var10;
                            int var29 = class60.field733 - var11;
                            if (var27.method3540(var28, var29)) {
                                int var30 = var28 - var27.field2608 / 2;
                                int var31 = var29 - var27.field2612 / 2;
                                int var32 = field991 + field977 & 0x7FF;
                                int var33 = class137.field2039[var32];
                                int var34 = class137.field2023[var32];
                                int var35 = (field979 + 256) * var33 >> 8;
                                int var36 = (field979 + 256) * var34 >> 8;
                                int var37 = var30 * var36 + var31 * var35 >> 11;
                                int var38 = var31 * var36 - var30 * var35 >> 11;
                                int var39 = Statics.field341.field1234 + var37 >> 7;
                                int var40 = Statics.field341.field1210 - var38 >> 7;
                                field948.method3054(220);
                                field948.method2961(18);
                                field948.method2843(Statics.field340 + var39);
                                field948.method2843(Statics.field356 + var40);
                                field948.method2973(class51.field661[82] ? (class51.field661[81] ? 2 : 1) : 0);
                                field948.method2961(var30);
                                field948.method2961(var31);
                                field948.method2957(field991);
                                field948.method2961(57);
                                field948.method2961(field977);
                                field948.method2961(field979);
                                field948.method2961(89);
                                field948.method2957(Statics.field341.field1234);
                                field948.method2957(Statics.field341.field1210);
                                field948.method2961(63);
                                field1139 = var39;
                                field1140 = var40;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("w.il(III)V")
    public static final void method14(int arg0, int arg1) {
        if (class217.method892(arg0)) {
            method960(Statics.field2647[arg0], arg1);
        }
    }

    @ObfuscatedName("bm.ic([Lhs;II)V")
    public static final void method960(class217[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class217 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2657 == 0) {
                    if (var3.field2676 != null) {
                        method960(var3.field2676, arg1);
                    }
                    class69 var4 = (class69) field1119.method3190((long) var3.field2756);
                    if (var4 != null) {
                        method14(var4.field820, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2762 != null) {
                    class70 var5 = new class70();
                    var5.field823 = var3;
                    var5.field822 = var3.field2762;
                    class84.method1349(var5);
                }
                if (arg1 == 1 && var3.field2763 != null) {
                    if (var3.field2672 >= 0) {
                        class217 var6 = class217.method3680(var3.field2756);
                        if (var6 == null || var6.field2676 == null || var3.field2672 >= var6.field2676.length || var6.field2676[var3.field2672] != var3) {
                            continue;
                        }
                    }
                    class70 var7 = new class70();
                    var7.field823 = var3;
                    var7.field822 = var3.field2763;
                    class84.method1349(var7);
                }
            }
        }
    }

    @ObfuscatedName("bw.iw(Lhs;III)V")
    public static final void method940(class217 arg0, int arg1, int arg2) {
        if (field1080 != null || field1045 || arg0 == null || method620(arg0) == null) {
            return;
        }
        field1080 = arg0;
        field1081 = method620(arg0);
        field1082 = arg1;
        field1083 = arg2;
        Statics.field479 = 0;
        field1091 = false;
        int var3 = method3690();
        if (var3 != -1) {
            method49(var3);
        }
    }

    @ObfuscatedName("client.io(I)V")
    public final void method1050() {
        Statics.method951(field1080);
        Statics.field479++;
        if (field981 && field1085) {
            int var1 = class60.field731;
            int var2 = class60.field732 * -417192073;
            int var3 = var1 - field1082;
            int var4 = var2 - field1083;
            if (var3 < field1094) {
                var3 = field1094;
            }
            if (field1080.field2670 + var3 > field1094 + field1081.field2670) {
                var3 = field1094 + field1081.field2670 - field1080.field2670;
            }
            if (var4 < field1087) {
                var4 = field1087;
            }
            if (field1080.field2671 + var4 > field1087 + field1081.field2671) {
                var4 = field1087 + field1081.field2671 - field1080.field2671;
            }
            int var5 = var3 - field982;
            int var6 = var4 - field1090;
            int var7 = field1080.field2731;
            if (Statics.field479 > field1080.field2718 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1091 = true;
            }
            int var8 = field1081.field2779 + (var3 - field1094);
            int var9 = field1081.field2677 + (var4 - field1087);
            if (field1080.field2744 != null && field1091) {
                class70 var10 = new class70();
                var10.field823 = field1080;
                var10.field824 = var8;
                var10.field836 = var9;
                var10.field822 = field1080.field2744;
                class84.method1349(var10);
            }
            if (class60.field730 == 0) {
                if (field1091) {
                    if (field1080.field2745 != null) {
                        class70 var11 = new class70();
                        var11.field823 = field1080;
                        var11.field824 = var8;
                        var11.field836 = var9;
                        var11.field830 = field964;
                        var11.field822 = field1080.field2745;
                        class84.method1349(var11);
                    }
                    if (field964 != null && method900(field1080) != null) {
                        field948.method3054(97);
                        field948.method2854(field964.field2756);
                        field948.method2842(field964.field2672);
                        field948.method2844(field1080.field2672);
                        field948.method2854(field1080.field2756);
                        field948.method2957(field964.field2720);
                        field948.method2844(field1080.field2720);
                    }
                } else {
                    label115: {
                        int var12 = method3690();
                        if (field1046 > 2) {
                            label112: {
                                label80: {
                                    if (field1044 == 1) {
                                        boolean var13;
                                        if (field1046 <= 0) {
                                            var13 = false;
                                        } else if (field990 && class51.field661[81] && field1054 != -1) {
                                            var13 = true;
                                        } else {
                                            var13 = false;
                                        }
                                        if (!var13) {
                                            break label80;
                                        }
                                    }
                                    if (!method324(var12)) {
                                        break label112;
                                    }
                                }
                                this.method1044(field982 + field1082, field1090 + field1083);
                                break label115;
                            }
                        }
                        if (field1046 > 0) {
                            method988(field982 + field1082, field1090 + field1083);
                        }
                    }
                }
                field1080 = null;
            }
        } else if (Statics.field479 > 1) {
            field1080 = null;
        }
    }

    @ObfuscatedName("o.if(II)V")
    public static void method49(int arg0) {
        Statics.field3326 = new class90();
        Statics.field3326.field1387 = field1047[arg0];
        Statics.field3326.field1388 = field1048[arg0];
        Statics.field3326.field1389 = field933[arg0];
        Statics.field3326.field1390 = field928[arg0];
        Statics.field3326.field1393 = field1051[arg0];
    }

    @ObfuscatedName("be.it(IIB)V")
    public static void method988(int arg0, int arg1) {
        method974(Statics.field3326, arg0, arg1);
        Statics.field3326 = null;
    }

    @ObfuscatedName("bp.ip(I)V")
    public static void method795() {
        for (class69 var0 = (class69) field1119.method3200(); var0 != null; var0 = (class69) field1119.method3194()) {
            int var1 = var0.field820;
            if (class217.method892(var1)) {
                boolean var2 = true;
                class217[] var3 = Statics.field2647[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2656;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2483;
                    class217 var6 = class217.method3680(var5);
                    if (var6 != null) {
                        Statics.method951(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aw.iq(Lhs;I)Lhs;")
    public static class217 method620(class217 arg0) {
        class217 var1 = method900(arg0);
        if (var1 == null) {
            var1 = arg0.field2730;
        }
        return var1;
    }

    @ObfuscatedName("e.ix([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method8(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ek.iz([Lhs;II)V")
    public static final void method2578(class217[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class217 var3 = arg0[var2];
            if (var3 != null && var3.field2674 == arg1 && (!var3.field2656 || !method470(var3))) {
                if (var3.field2657 == 0) {
                    if (!var3.field2656 && method470(var3) && Statics.field1477 != var3) {
                        continue;
                    }
                    method2578(arg0, var3.field2756);
                    if (var3.field2676 != null) {
                        method2578(var3.field2676, var3.field2756);
                    }
                    class69 var4 = (class69) field1119.method3190((long) var3.field2756);
                    if (var4 != null) {
                        int var5 = var4.field820;
                        if (class217.method892(var5)) {
                            method2578(Statics.field2647[var5], -1);
                        }
                    }
                }
                if (var3.field2657 == 6) {
                    if (var3.field2778 != -1 || var3.field2703 != -1) {
                        boolean var6 = method677(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2703;
                        } else {
                            var7 = var3.field2778;
                        }
                        if (var7 != -1) {
                            class261 var8 = class261.method790(var7);
                            var3.field2759 += field1126;
                            while (var3.field2759 > var8.field3606[var3.field2777]) {
                                var3.field2759 -= var8.field3606[var3.field2777];
                                var3.field2777++;
                                if (var3.field2777 >= var8.field3608.length) {
                                    var3.field2777 -= var8.field3613;
                                    if (var3.field2777 < 0 || var3.field2777 >= var8.field3608.length) {
                                        var3.field2777 = 0;
                                    }
                                }
                                Statics.method951(var3);
                            }
                        }
                    }
                    if (var3.field2711 != 0 && !var3.field2656) {
                        int var9 = var3.field2711 >> 16;
                        int var10 = var3.field2711 << 16 >> 16;
                        int var11 = field1126 * var9;
                        int var12 = field1126 * var10;
                        var3.field2706 = var3.field2706 + var11 & 0x7FF;
                        var3.field2727 = var3.field2727 + var12 & 0x7FF;
                        Statics.method951(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.iv(IB)V")
    public static final void method456(int arg0) {
        method795();
        class83.method2583();
        int var1 = class242.method194(arg0).field3296;
        if (var1 == 0) {
            return;
        }
        int var2 = class212.field2616[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class137.method2325(0.9D);
                ((class126) Statics.field2029).method2107(0.9D);
            }
            if (var2 == 2) {
                class137.method2325(0.8D);
                ((class126) Statics.field2029).method2107(0.8D);
            }
            if (var2 == 3) {
                class137.method2325(0.7D);
                ((class126) Statics.field2029).method2107(0.7D);
            }
            if (var2 == 4) {
                class137.method2325(0.6D);
                ((class126) Statics.field2029).method2107(0.6D);
            }
            class257.method3568();
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
            if (field1142 != var3) {
                if (field1142 == 0 && field1143 != -1) {
                    class204.method66(Statics.field2149, field1143, 0, var3, false);
                    field1144 = false;
                } else if (var3 == 0) {
                    Statics.field2517.method3344();
                    class204.field2518 = 1;
                    Statics.field2519 = null;
                    field1144 = false;
                } else {
                    class204.method1504(var3);
                }
                field1142 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field1145 = 127;
            }
            if (var2 == 1) {
                field1145 = 96;
            }
            if (var2 == 2) {
                field1145 = 64;
            }
            if (var2 == 3) {
                field1145 = 32;
            }
            if (var2 == 4) {
                field1145 = 0;
            }
        }
        if (var1 == 5) {
            field1044 = var2;
        }
        if (var1 == 6) {
            field1069 = var2;
        }
        if (var1 == 9) {
            field1070 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field1042 = 127;
            }
            if (var2 == 1) {
                field1042 = 96;
            }
            if (var2 == 2) {
                field1042 = 64;
            }
            if (var2 == 3) {
                field1042 = 32;
            }
            if (var2 == 4) {
                field1042 = 0;
            }
        }
        if (var1 == 17) {
            field949 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class92[] var4 = new class92[] { class92.field1406, class92.field1405, class92.field1404, class92.field1411 };
            field929 = (class92) Statics.method666(var4, var2);
            if (field929 == null) {
                field929 = class92.field1405;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field1036 = -1;
            } else {
                field1036 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class92[] var5 = new class92[] { class92.field1406, class92.field1405, class92.field1404, class92.field1411 };
        field911 = (class92) Statics.method666(var5, var2);
        if (field911 == null) {
            field911 = class92.field1405;
        }
    }

    @ObfuscatedName("jj.is(I)V")
    public static final void method4472() {
        field948.method3054(128);
        for (class69 var0 = (class69) field1119.method3200(); var0 != null; var0 = (class69) field1119.method3194()) {
            if (var0.field812 == 0 || var0.field812 == 3) {
                method958(var0, true);
            }
        }
        if (field1071 != null) {
            Statics.method951(field1071);
            field1071 = null;
        }
    }

    @ObfuscatedName("bm.ia(IIIB)Lbs;")
    public static final class69 method959(int arg0, int arg1, int arg2) {
        class69 var3 = new class69();
        var3.field820 = arg1;
        var3.field812 = arg2;
        field1119.method3191(var3, (long) arg0);
        Statics.method210(arg1);
        class217 var4 = class217.method3680(arg0);
        Statics.method951(var4);
        if (field1071 != null) {
            Statics.method951(field1071);
            field1071 = null;
        }
        method1646();
        method1557(Statics.field2647[arg0 >> 16], var4, false);
        class84.method953(arg1);
        if (field1067 != -1) {
            method14(field1067, 1);
        }
        return var3;
    }

    @ObfuscatedName("bm.ig(Lbs;ZI)V")
    public static final void method958(class69 arg0, boolean arg1) {
        int var2 = arg0.field820;
        int var3 = (int) arg0.field2483;
        arg0.method3234();
        if (arg1 && var2 != -1 && Statics.field330[var2]) {
            Statics.field16.method3752(var2);
            if (Statics.field2647[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2647[var2].length; var5++) {
                    if (Statics.field2647[var2][var5] != null) {
                        if (Statics.field2647[var2][var5].field2657 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2647[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2647[var2] = null;
                }
                Statics.field330[var2] = false;
            }
        }
        method471(var2);
        class217 var6 = class217.method3680(var3);
        if (var6 != null) {
            Statics.method951(var6);
        }
        method1646();
        if (field1067 != -1) {
            method14(field1067, 1);
        }
    }

    @ObfuscatedName("bc.ir(Lhs;B)Z")
    public static final boolean method938(class217 arg0) {
        int var1 = arg0.field2705;
        if (var1 == 205) {
            field958 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1178.method3581(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1178.method3570(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1178.method3571(false);
        }
        if (var1 == 325) {
            field1178.method3571(true);
        }
        if (var1 == 326) {
            field948.method3054(222);
            field1178.method3572(field948);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("js.ih(Lhs;IIII)V")
    public static final void method4480(class217 arg0, int arg1, int arg2, int arg3) {
        method966();
        class211 var4 = arg0.method3617(false);
        if (var4 == null) {
            return;
        }
        class282.method4517(arg1, arg2, var4.field2608 + arg1, var4.field2612 + arg2);
        if (field1088 == 2 || field1088 == 5) {
            class282.method4524(arg1, arg2, 0, var4.field2610, var4.field2609);
        } else {
            int var5 = field991 + field977 & 0x7FF;
            int var6 = Statics.field341.field1234 / 32 + 48;
            int var7 = 464 - Statics.field341.field1210 / 32;
            Statics.field1269.method4617(arg1, arg2, var4.field2608, var4.field2612, var6, var7, var5, field979 + 256, var4.field2610, var4.field2609);
            for (int var8 = 0; var8 < field1135; var8++) {
                int var9 = field1181[var8] * 4 + 2 - Statics.field341.field1234 / 32;
                int var10 = field901[var8] * 4 + 2 - Statics.field341.field1210 / 32;
                method1429(arg1, arg2, var9, var10, field1138[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class194 var13 = field1086[Statics.field890][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field341.field1234 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field341.field1210 / 32;
                        method1429(arg1, arg2, var14, var15, Statics.field361[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field931; var16++) {
                class87 var17 = field1159[field1002[var16]];
                if (var17 != null && var17.method1011()) {
                    class259 var18 = var17.field1363;
                    if (var18 != null && var18.field3584 != null) {
                        var18 = var18.method4218();
                    }
                    if (var18 != null && var18.field3554 && var18.field3587) {
                        int var19 = var17.field1234 / 32 - Statics.field341.field1234 / 32;
                        int var20 = var17.field1210 / 32 - Statics.field341.field1210 / 32;
                        method1429(arg1, arg2, var19, var20, Statics.field361[1], var4);
                    }
                }
            }
            int var21 = class97.field1488;
            int[] var22 = class97.field1492;
            for (int var23 = 0; var23 < var21; var23++) {
                class75 var24 = field1049[var22[var23]];
                if (var24 != null && var24.method1011() && !var24.field884 && Statics.field341 != var24) {
                    int var25 = var24.field1234 / 32 - Statics.field341.field1234 / 32;
                    int var26 = var24.field1210 / 32 - Statics.field341.field1210 / 32;
                    boolean var27 = false;
                    if (method2729(var24.field873, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field314; var29++) {
                        if (var24.field873.equals(Statics.field2433[var29].field900)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field341.field882 != 0 && var24.field882 != 0 && Statics.field341.field882 == var24.field882) {
                        var30 = true;
                    }
                    if (var27) {
                        method1429(arg1, arg2, var25, var26, Statics.field361[3], var4);
                    } else if (var30) {
                        method1429(arg1, arg2, var25, var26, Statics.field361[4], var4);
                    } else if (var28) {
                        method1429(arg1, arg2, var25, var26, Statics.field361[5], var4);
                    } else {
                        method1429(arg1, arg2, var25, var26, Statics.field361[2], var4);
                    }
                }
            }
            if (field921 != 0 && field960 % 20 < 10) {
                if (field921 == 1 && field1134 >= 0 && field1134 < field1159.length) {
                    class87 var31 = field1159[field1134];
                    if (var31 != null) {
                        int var32 = var31.field1234 / 32 - Statics.field341.field1234 / 32;
                        int var33 = var31.field1210 / 32 - Statics.field341.field1210 / 32;
                        Statics.method539(arg1, arg2, var32, var33, Statics.field347[1], var4);
                    }
                }
                if (field921 == 2) {
                    int var34 = field924 * 4 - Statics.field340 * 4 + 2 - Statics.field341.field1234 / 32;
                    int var35 = field925 * 4 - Statics.field356 * 4 + 2 - Statics.field341.field1210 / 32;
                    Statics.method539(arg1, arg2, var34, var35, Statics.field347[1], var4);
                }
                if (field921 == 10 && field923 >= 0 && field923 < field1049.length) {
                    class75 var36 = field1049[field923];
                    if (var36 != null) {
                        int var37 = var36.field1234 / 32 - Statics.field341.field1234 / 32;
                        int var38 = var36.field1210 / 32 - Statics.field341.field1210 / 32;
                        Statics.method539(arg1, arg2, var37, var38, Statics.field347[1], var4);
                    }
                }
            }
            if (field1139 != 0) {
                int var39 = field1139 * 4 + 2 - Statics.field341.field1234 / 32;
                int var40 = field1140 * 4 + 2 - Statics.field341.field1210 / 32;
                method1429(arg1, arg2, var39, var40, Statics.field347[0], var4);
            }
            if (!Statics.field341.field884) {
                class282.method4510(var4.field2608 / 2 + arg1 - 1, var4.field2612 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field1113[arg3] = true;
    }

    @ObfuscatedName("q.im(Lhs;IIII)V")
    public static final void method53(class217 arg0, int arg1, int arg2, int arg3) {
        class211 var4 = arg0.method3617(false);
        if (var4 == null) {
            return;
        }
        if (field1088 < 3) {
            Statics.field2278.method4617(arg1, arg2, var4.field2608, var4.field2612, 25, 25, field991, 256, var4.field2610, var4.field2609);
        } else {
            class282.method4524(arg1, arg2, 0, var4.field2610, var4.field2609);
        }
    }

    @ObfuscatedName("ci.ij(IIIILjy;Lhm;S)V")
    public static final void method1429(int arg0, int arg1, int arg2, int arg3, class286 arg4, class211 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field991 + field977 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class137.field2039[var6];
        int var9 = class137.field2023[var6];
        int var10 = var8 * 256 / (field979 + 256);
        int var11 = var9 * 256 / (field979 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method4661(arg5.field2608 / 2 + var12 - arg4.field3787 / 2, arg5.field2612 / 2 - var13 - arg4.field3786 / 2, arg0, arg1, arg5.field2608, arg5.field2612, arg5.field2610, arg5.field2609);
        } else {
            arg4.method4621(arg5.field2608 / 2 + arg0 + var12 - arg4.field3787 / 2, arg5.field2612 / 2 + arg1 - var13 - arg4.field3786 / 2);
        }
    }

    @ObfuscatedName("fc.iy(Ljava/lang/String;ZB)Z")
    public static boolean method2729(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class268.method1830(arg0, Statics.field483);
        for (int var3 = 0; var3 < field1172; var3++) {
            if (var2.equalsIgnoreCase(class268.method1830(field935[var3].field797, Statics.field483)) && (!arg1 || field935[var3].field792 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class268.method1830(Statics.field341.field873, Statics.field483))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cn.ii(Ljava/lang/String;B)Z")
    public static boolean method1501(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class268.method1830(arg0, Statics.field483);
        for (int var2 = 0; var2 < field1176; var2++) {
            class71 var3 = field1149[var2];
            if (var1.equalsIgnoreCase(class268.method1830(var3.field838, Statics.field483))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class268.method1830(var3.field837, Statics.field483))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("dp.ie(Ljava/lang/String;ZB)V")
    public static final void method2134(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field1176 < 100 || field1177 == 1) || field1176 >= 400) {
            Statics.method19(31, "", class226.field2956);
            return;
        }
        String var2 = class268.method1830(arg0, Statics.field483);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field1176; var3++) {
            class71 var4 = field1149[var3];
            String var5 = class268.method1830(var4.field838, Statics.field483);
            if (var5 != null && var5.equals(var2)) {
                Statics.method19(31, "", arg0 + class226.field3029);
                return;
            }
            if (var4.field837 != null) {
                String var6 = class268.method1830(var4.field837, Statics.field483);
                if (var6 != null && var6.equals(var2)) {
                    Statics.method19(31, "", arg0 + class226.field3029);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field1172; var7++) {
            class66 var8 = field935[var7];
            String var9 = class268.method1830(var8.field797, Statics.field483);
            if (var9 != null && var9.equals(var2)) {
                Statics.method19(31, "", class226.field3025 + arg0 + class226.field3038);
                return;
            }
            if (var8.field795 != null) {
                String var10 = class268.method1830(var8.field795, Statics.field483);
                if (var10 != null && var10.equals(var2)) {
                    Statics.method19(31, "", class226.field3025 + arg0 + class226.field3038);
                    return;
                }
            }
        }
        if (class268.method1830(Statics.field341.field873, Statics.field483).equals(var2)) {
            Statics.method19(31, "", class226.field2992);
        } else {
            field948.method3054(148);
            field948.method2961(class174.method954(arg0));
            field948.method2902(arg0);
        }
    }

    @ObfuscatedName("hz.ik(Ljava/lang/String;S)V")
    public static final void method3549(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class268.method1830(arg0, Statics.field483);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1176; var2++) {
            class71 var3 = field1149[var2];
            String var4 = var3.field838;
            String var5 = class268.method1830(var4, Statics.field483);
            if (class278.method4442(arg0, var1, var4, var5)) {
                field1176--;
                for (int var6 = var2; var6 < field1176; var6++) {
                    field1149[var6] = field1149[var6 + 1];
                }
                field1100 = field1092;
                field948.method3054(163);
                field948.method2961(class174.method954(arg0));
                field948.method2902(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("fq.jo(Ljava/lang/String;II)V")
    public static final void method2780(String arg0, int arg1) {
        field948.method3054(11);
        field948.method2961(class174.method954(arg0) + 1);
        field948.method2902(arg0);
        field948.method2836(arg1);
    }

    @ObfuscatedName("client.jq(Ljava/lang/String;B)V")
    public static final void method1267(String arg0) {
        if (Statics.field2433 != null) {
            field948.method3054(127);
            field948.method2961(class174.method954(arg0));
            field948.method2902(arg0);
        }
    }

    @ObfuscatedName("cj.jl(Ljava/lang/String;I)V")
    public static final void method1487(String arg0) {
        if (!arg0.equals("")) {
            field948.method3054(105);
            field948.method2961(class174.method954(arg0));
            field948.method2902(arg0);
        }
    }

    @ObfuscatedName("be.jb(I)V")
    public static final void method987() {
        field948.method3054(105);
        field948.method2961(0);
    }

    @ObfuscatedName("aa.jh(II)V")
    public static void method471(int arg0) {
        for (class199 var1 = (class199) field1109.method3200(); var1 != null; var1 = (class199) field1109.method3194()) {
            if ((long) arg0 == (var1.field2483 >> 48 & 0xFFFFL)) {
                var1.method3234();
            }
        }
    }

    @ObfuscatedName("v.jr(Lhs;I)I")
    public static int method83(class217 arg0) {
        class199 var1 = (class199) field1109.method3190(((long) arg0.field2756 << 32) + (long) arg0.field2672);
        return var1 == null ? arg0.field2651 : var1.field2497;
    }

    @ObfuscatedName("br.ja(Lhs;B)Lhs;")
    public static class217 method900(class217 arg0) {
        int var1 = class218.method97(method83(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class217.method3680(arg0.field2674);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("aa.jp(Lhs;I)Z")
    public static boolean method470(class217 arg0) {
        if (field1077) {
            if (method83(arg0) != 0) {
                return false;
            }
            if (arg0.field2657 == 0) {
                return false;
            }
        }
        return arg0.field2700;
    }

    @ObfuscatedName("f.jm(Lhs;II)Ljava/lang/String;")
    public static String method37(class217 arg0, int arg1) {
        int var2 = method83(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2658 == null) {
            return null;
        } else if (arg0.field2790 == null || arg0.field2790.length <= arg1 || arg0.field2790[arg1] == null || arg0.field2790[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2790[arg1];
        }
    }

    @ObfuscatedName("by.jc(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method997(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field1162 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field1162 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field1162 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field1162 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field1162 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field2811 != null) {
            var3 = "/p=" + Statics.field2811;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field1121 + "/a=" + Statics.field909 + var3 + "/";
    }

    @ObfuscatedName("bc.jj(Lfr;IB)V")
    public static void method910(class174 arg0, int arg1) {
        byte[] var2 = arg0.field2415;
        if (field944 == null) {
            field944 = new byte[24];
        }
        class184.method3104(var2, arg1, field944, 0, 24);
        if (class156.field2257 == null) {
            return;
        }
        try {
            class156.field2257.method2083(0L);
            class156.field2257.method2068(arg0.field2415, arg1, 24);
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("jm.jf(Lfr;I)V")
    public static void method4438(class174 arg0) {
        if (field944 == null) {
            byte[] var1 = class156.method192();
            arg0.method2804(var1, 0, var1.length);
        } else {
            arg0.method2804(field944, 0, field944.length);
        }
    }
}

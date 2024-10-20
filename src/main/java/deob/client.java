package deob;

import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class59 {

    @ObfuscatedName("client.w")
    public static class162[] field951 = new class162[4];

    @ObfuscatedName("client.aa")
    public static boolean field1004 = true;

    @ObfuscatedName("client.an")
    public static int field1079 = 1;

    @ObfuscatedName("client.au")
    public static int field893 = 0;

    @ObfuscatedName("client.bz")
    public static int field927 = 0;

    @ObfuscatedName("client.bf")
    public static boolean field1147 = false;

    @ObfuscatedName("client.bb")
    public static boolean field896 = false;

    @ObfuscatedName("client.bw")
    public static int field897 = 0;

    @ObfuscatedName("client.bn")
    public static int field898 = 0;

    @ObfuscatedName("client.bg")
    public static boolean field899 = true;

    @ObfuscatedName("client.bt")
    public static int field900 = 0;

    @ObfuscatedName("client.bv")
    public static long field1126 = -1L;

    @ObfuscatedName("client.bo")
    public static int field955 = -1;

    @ObfuscatedName("client.br")
    public static int field894 = -1;

    @ObfuscatedName("client.bs")
    public static int field1039 = -1;

    @ObfuscatedName("client.bx")
    public static boolean field905 = true;

    @ObfuscatedName("client.be")
    public static boolean field906 = false;

    @ObfuscatedName("client.bu")
    public static int field907 = 0;

    @ObfuscatedName("client.bc")
    public static int field908 = 0;

    @ObfuscatedName("client.bj")
    public static int field909 = 0;

    @ObfuscatedName("client.by")
    public static int field910 = 0;

    @ObfuscatedName("client.bk")
    public static int field925 = 0;

    @ObfuscatedName("client.ba")
    public static int field912 = 0;

    @ObfuscatedName("client.ch")
    public static int field1134 = 0;

    @ObfuscatedName("client.cz")
    public static int field914 = 0;

    @ObfuscatedName("client.cb")
    public static int field1027 = 0;

    @ObfuscatedName("client.cg")
    public static class92 field916 = class92.field1408;

    @ObfuscatedName("client.ca")
    public static class92 field917 = class92.field1408;

    @ObfuscatedName("client.cl")
    public static int field969 = 0;

    @ObfuscatedName("client.cx")
    public static int field1151 = 0;

    @ObfuscatedName("client.cw")
    public static int field920 = 0;

    @ObfuscatedName("client.ds")
    public static int field922 = 0;

    @ObfuscatedName("client.dv")
    public static int field923 = 0;

    @ObfuscatedName("client.de")
    public static int field902 = 0;

    @ObfuscatedName("client.du")
    public static int field913 = 0;

    @ObfuscatedName("client.da")
    public static int field942 = 0;

    @ObfuscatedName("client.dw")
    public static byte[] field968 = null;

    @ObfuscatedName("client.dj")
    public static class87[] field928 = new class87[32768];

    @ObfuscatedName("client.dp")
    public static int field929 = 0;

    @ObfuscatedName("client.dd")
    public static int[] field1014 = new int[32768];

    @ObfuscatedName("client.dn")
    public static int field931 = 0;

    @ObfuscatedName("client.df")
    public static int[] field932 = new int[250];

    @ObfuscatedName("client.em")
    public static class180 field933 = new class180(5000);

    @ObfuscatedName("client.ew")
    public static class180 field934 = new class180(5000);

    @ObfuscatedName("client.ea")
    public static class180 field1001 = new class180(15000);

    @ObfuscatedName("client.eg")
    public static int field936 = 0;

    @ObfuscatedName("client.en")
    public static int field937 = 0;

    @ObfuscatedName("client.ei")
    public static int field938 = 0;

    @ObfuscatedName("client.ek")
    public static int field939 = 0;

    @ObfuscatedName("client.el")
    public static int field1165 = 0;

    @ObfuscatedName("client.eb")
    public static int field1071 = 0;

    @ObfuscatedName("client.eq")
    public static int field979 = 0;

    @ObfuscatedName("client.eo")
    public static int field987 = 0;

    @ObfuscatedName("client.ez")
    public static boolean field944 = false;

    @ObfuscatedName("client.ey")
    public static HashMap field945 = new HashMap();

    @ObfuscatedName("client.ej")
    public static int field1045 = 0;

    @ObfuscatedName("client.fb")
    public static int field1120 = 1;

    @ObfuscatedName("client.fg")
    public static int field948 = 0;

    @ObfuscatedName("client.fp")
    public static int field924 = 1;

    @ObfuscatedName("client.ft")
    public static int field950 = 0;

    @ObfuscatedName("client.fu")
    public static boolean field952 = false;

    @ObfuscatedName("client.fy")
    public static int[][][] field1077 = new int[4][13][13];

    @ObfuscatedName("client.fq")
    public static final int[] field954 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fh")
    public static int field1062 = 0;

    @ObfuscatedName("client.fv")
    public static int field1064 = 2;

    @ObfuscatedName("client.fz")
    public static int field957 = 0;

    @ObfuscatedName("client.fa")
    public static int field958 = 2;

    @ObfuscatedName("client.fe")
    public static int field959 = 0;

    @ObfuscatedName("client.fi")
    public static int field960 = 1;

    @ObfuscatedName("client.fd")
    public static int field903 = 0;

    @ObfuscatedName("client.fs")
    public static int field991 = 0;

    @ObfuscatedName("client.fn")
    public static int field963 = 2;

    @ObfuscatedName("client.fl")
    public static int field964 = 0;

    @ObfuscatedName("client.gd")
    public static int field965 = 1;

    @ObfuscatedName("client.gx")
    public static int field966 = 0;

    @ObfuscatedName("client.gi")
    public static int field967 = 0;

    @ObfuscatedName("client.gw")
    public static int field941 = 2301979;

    @ObfuscatedName("client.gs")
    public static int field1016 = 5063219;

    @ObfuscatedName("client.gj")
    public static int field947 = 3353893;

    @ObfuscatedName("client.gb")
    public static int field970 = 7759444;

    @ObfuscatedName("client.go")
    public static boolean field972 = false;

    @ObfuscatedName("client.gt")
    public static int field973 = 0;

    @ObfuscatedName("client.ge")
    public static int field974 = 128;

    @ObfuscatedName("client.hz")
    public static int field1158 = 0;

    @ObfuscatedName("client.hb")
    public static int field976 = 0;

    @ObfuscatedName("client.hj")
    public static int field1030 = 0;

    @ObfuscatedName("client.hp")
    public static int field978 = 0;

    @ObfuscatedName("client.ho")
    public static int field1005 = 0;

    @ObfuscatedName("client.hw")
    public static int field980 = 50;

    @ObfuscatedName("client.hr")
    public static int field981 = 0;

    @ObfuscatedName("client.ht")
    public static boolean field982 = false;

    @ObfuscatedName("client.hn")
    public static int field983 = 0;

    @ObfuscatedName("client.ha")
    public static int field984 = 0;

    @ObfuscatedName("client.hf")
    public static int field985 = 50;

    @ObfuscatedName("client.hk")
    public static int[] field986 = new int[field985];

    @ObfuscatedName("client.he")
    public static int[] field911 = new int[field985];

    @ObfuscatedName("client.hm")
    public static int[] field988 = new int[field985];

    @ObfuscatedName("client.hg")
    public static int[] field989 = new int[field985];

    @ObfuscatedName("client.hc")
    public static int[] field1057 = new int[field985];

    @ObfuscatedName("client.hi")
    public static int[] field926 = new int[field985];

    @ObfuscatedName("client.hl")
    public static int[] field953 = new int[field985];

    @ObfuscatedName("client.hh")
    public static String[] field993 = new String[field985];

    @ObfuscatedName("client.hv")
    public static int[][] field891 = new int[104][104];

    @ObfuscatedName("client.hu")
    public static int field1153 = 0;

    @ObfuscatedName("client.hs")
    public static int field996 = -1;

    @ObfuscatedName("client.hd")
    public static int field997 = -1;

    @ObfuscatedName("client.hq")
    public static int field998 = 0;

    @ObfuscatedName("client.iy")
    public static int field999 = 0;

    @ObfuscatedName("client.ig")
    public static int field1000 = 0;

    @ObfuscatedName("client.in")
    public static int field1017 = 0;

    @ObfuscatedName("client.ic")
    public static int field1002 = 0;

    @ObfuscatedName("client.id")
    public static int field1003 = 0;

    @ObfuscatedName("client.ih")
    public static int field1106 = 0;

    @ObfuscatedName("client.im")
    public static int field994 = 0;

    @ObfuscatedName("client.io")
    public static int field971 = 0;

    @ObfuscatedName("client.ir")
    public static int field1007 = 0;

    @ObfuscatedName("client.iq")
    public static boolean field1008 = false;

    @ObfuscatedName("client.ij")
    public static int field1091 = 0;

    @ObfuscatedName("client.ik")
    public static int field1015 = 0;

    @ObfuscatedName("client.it")
    public static String field1143 = null;

    @ObfuscatedName("client.ie")
    public static class75[] field1032 = new class75[2048];

    @ObfuscatedName("client.if")
    public static int field1012 = -1;

    @ObfuscatedName("client.iu")
    public static int field1013 = 0;

    @ObfuscatedName("client.iv")
    public static int field1159 = 0;

    @ObfuscatedName("client.ip")
    public static int[] field1088 = new int[1000];

    @ObfuscatedName("client.jy")
    public static final int[] field1160 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.jb")
    public static String[] field1063 = new String[8];

    @ObfuscatedName("client.jj")
    public static boolean[] field1023 = new boolean[8];

    @ObfuscatedName("client.jr")
    public static int[] field1019 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ju")
    public static int field1107 = -1;

    @ObfuscatedName("client.jf")
    public static class194[][][] field1021 = new class194[4][104][104];

    @ObfuscatedName("client.ji")
    public static class194 field1022 = new class194();

    @ObfuscatedName("client.jz")
    public static class194 field1075 = new class194();

    @ObfuscatedName("client.jm")
    public static class194 field1024 = new class194();

    @ObfuscatedName("client.jn")
    public static int[] field1025 = new int[25];

    @ObfuscatedName("client.jl")
    public static int[] field1026 = new int[25];

    @ObfuscatedName("client.js")
    public static int[] field977 = new int[25];

    @ObfuscatedName("client.jg")
    public static int field1028 = 0;

    @ObfuscatedName("client.jo")
    public static boolean field1029 = false;

    @ObfuscatedName("client.jw")
    public static int field961 = 0;

    @ObfuscatedName("client.jq")
    public static int[] field1031 = new int[500];

    @ObfuscatedName("client.jh")
    public static int[] field1042 = new int[500];

    @ObfuscatedName("client.jx")
    public static int[] field1033 = new int[500];

    @ObfuscatedName("client.jp")
    public static int[] field1034 = new int[500];

    @ObfuscatedName("client.jk")
    public static String[] field895 = new String[500];

    @ObfuscatedName("client.kn")
    public static String[] field1036 = new String[500];

    @ObfuscatedName("client.kr")
    public static boolean field1037 = false;

    @ObfuscatedName("client.ke")
    public static int field1038 = -1;

    @ObfuscatedName("client.kg")
    public static boolean field1006 = false;

    @ObfuscatedName("client.kd")
    public static int field1144 = -1;

    @ObfuscatedName("client.kj")
    public static int field1041 = -1;

    @ObfuscatedName("client.kw")
    public static int field1121 = 0;

    @ObfuscatedName("client.kh")
    public static int field1043 = 50;

    @ObfuscatedName("client.ks")
    public static int field1044 = 0;

    @ObfuscatedName("client.kv")
    public static boolean field1046 = false;

    @ObfuscatedName("client.ka")
    public static int field1047 = -1;

    @ObfuscatedName("client.ku")
    public static int field1048 = -1;

    @ObfuscatedName("client.kx")
    public static String field1049 = null;

    @ObfuscatedName("client.kt")
    public static String field1050 = null;

    @ObfuscatedName("client.ky")
    public static int field1051 = -1;

    @ObfuscatedName("client.kl")
    public static class191 field1020 = new class191(8);

    @ObfuscatedName("client.kp")
    public static int field1053 = 0;

    @ObfuscatedName("client.kq")
    public static int field1070 = 0;

    @ObfuscatedName("client.ko")
    public static class217 field1055 = null;

    @ObfuscatedName("client.lp")
    public static int field1108 = 0;

    @ObfuscatedName("client.lj")
    public static int field1011 = 0;

    @ObfuscatedName("client.lu")
    public static int field1058 = 0;

    @ObfuscatedName("client.lc")
    public static int field1059 = -1;

    @ObfuscatedName("client.lg")
    public static boolean field1060 = false;

    @ObfuscatedName("client.li")
    public static boolean field1061 = false;

    @ObfuscatedName("client.lt")
    public static boolean field995 = false;

    @ObfuscatedName("client.lr")
    public static class217 field904 = null;

    @ObfuscatedName("client.lv")
    public static class217 field962 = null;

    @ObfuscatedName("client.lq")
    public static class217 field1085 = null;

    @ObfuscatedName("client.lm")
    public static int field1066 = 0;

    @ObfuscatedName("client.lw")
    public static int field1040 = 0;

    @ObfuscatedName("client.lo")
    public static class217 field1068 = null;

    @ObfuscatedName("client.lk")
    public static boolean field1069 = false;

    @ObfuscatedName("client.lh")
    public static int field1035 = -1;

    @ObfuscatedName("client.lf")
    public static int field990 = -1;

    @ObfuscatedName("client.le")
    public static boolean field1072 = false;

    @ObfuscatedName("client.ll")
    public static int field1073 = -1;

    @ObfuscatedName("client.la")
    public static int field1074 = -1;

    @ObfuscatedName("client.ln")
    public static boolean field1009 = false;

    @ObfuscatedName("client.lz")
    public static int field1076 = 1;

    @ObfuscatedName("client.ml")
    public static int[] field956 = new int[32];

    @ObfuscatedName("client.mm")
    public static int field1146 = 0;

    @ObfuscatedName("client.mk")
    public static int[] field1052 = new int[32];

    @ObfuscatedName("client.me")
    public static int field1080 = 0;

    @ObfuscatedName("client.mt")
    public static int[] field1081 = new int[32];

    @ObfuscatedName("client.mi")
    public static int field1082 = 0;

    @ObfuscatedName("client.mo")
    public static int field1083 = 0;

    @ObfuscatedName("client.mw")
    public static int field1084 = 0;

    @ObfuscatedName("client.md")
    public static int field1127 = 0;

    @ObfuscatedName("client.mf")
    public static int field1086 = 0;

    @ObfuscatedName("client.mb")
    public static int field1087 = 0;

    @ObfuscatedName("client.ma")
    public static int field1054 = 0;

    @ObfuscatedName("client.mx")
    public static int field1089 = 0;

    @ObfuscatedName("client.ms")
    public static class194 field1090 = new class194();

    @ObfuscatedName("client.my")
    public static class194 field1115 = new class194();

    @ObfuscatedName("client.mv")
    public static class194 field975 = new class194();

    @ObfuscatedName("client.mj")
    public static class191 field918 = new class191(512);

    @ObfuscatedName("client.mn")
    public static int field1094 = 0;

    @ObfuscatedName("client.mu")
    public static int field1095 = -2;

    @ObfuscatedName("client.mz")
    public static boolean[] field1096 = new boolean[100];

    @ObfuscatedName("client.mr")
    public static boolean[] field1097 = new boolean[100];

    @ObfuscatedName("client.mg")
    public static boolean[] field1098 = new boolean[100];

    @ObfuscatedName("client.nf")
    public static int[] field1099 = new int[100];

    @ObfuscatedName("client.ne")
    public static int[] field992 = new int[100];

    @ObfuscatedName("client.nc")
    public static int[] field1101 = new int[100];

    @ObfuscatedName("client.nn")
    public static int[] field1102 = new int[100];

    @ObfuscatedName("client.ni")
    public static int field1103 = 0;

    @ObfuscatedName("client.nq")
    public static long field1104 = 0L;

    @ObfuscatedName("client.na")
    public static boolean field1105 = true;

    @ObfuscatedName("client.nb")
    public static int[] field1067 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.nz")
    public static int field1100 = 0;

    @ObfuscatedName("client.ns")
    public static int field1093 = 0;

    @ObfuscatedName("client.nw")
    public static String field1109 = "";

    @ObfuscatedName("client.nh")
    public static long[] field1138 = new long[100];

    @ObfuscatedName("client.nm")
    public static int field1111 = 0;

    @ObfuscatedName("client.nt")
    public static int field1112 = 0;

    @ObfuscatedName("client.ny")
    public static int[] field1113 = new int[128];

    @ObfuscatedName("client.nu")
    public static int[] field1114 = new int[128];

    @ObfuscatedName("client.np")
    public static long field949 = -1L;

    @ObfuscatedName("client.ov")
    public static String field1116 = null;

    @ObfuscatedName("client.oo")
    public static String field1117 = null;

    @ObfuscatedName("client.ot")
    public static int field1118 = -1;

    @ObfuscatedName("client.oy")
    public static int field1119 = 0;

    @ObfuscatedName("client.ob")
    public static int[] field919 = new int[1000];

    @ObfuscatedName("client.od")
    public static int[] field1065 = new int[1000];

    @ObfuscatedName("client.oe")
    public static class286[] field1125 = new class286[1000];

    @ObfuscatedName("client.oa")
    public static int field1123 = 0;

    @ObfuscatedName("client.on")
    public static int field1124 = 0;

    @ObfuscatedName("client.oq")
    public static int field1018 = 0;

    @ObfuscatedName("client.oz")
    public static int field1078 = 255;

    @ObfuscatedName("client.oc")
    public static int field1128 = -1;

    @ObfuscatedName("client.oh")
    public static boolean field1110 = false;

    @ObfuscatedName("client.or")
    public static int field1130 = 127;

    @ObfuscatedName("client.ou")
    public static int field1131 = 127;

    @ObfuscatedName("client.px")
    public static int field1132 = 0;

    @ObfuscatedName("client.pi")
    public static int[] field1133 = new int[50];

    @ObfuscatedName("client.pz")
    public static int[] field1010 = new int[50];

    @ObfuscatedName("client.pl")
    public static int[] field1135 = new int[50];

    @ObfuscatedName("client.po")
    public static int[] field1136 = new int[50];

    @ObfuscatedName("client.pm")
    public static class106[] field1137 = new class106[50];

    @ObfuscatedName("client.pv")
    public static boolean field930 = false;

    @ObfuscatedName("client.py")
    public static boolean[] field1139 = new boolean[5];

    @ObfuscatedName("client.pj")
    public static int[] field1140 = new int[5];

    @ObfuscatedName("client.pt")
    public static int[] field1141 = new int[5];

    @ObfuscatedName("client.qw")
    public static int[] field1142 = new int[5];

    @ObfuscatedName("client.qz")
    public static int[] field1167 = new int[5];

    @ObfuscatedName("client.ql")
    public static short field901 = 256;

    @ObfuscatedName("client.qq")
    public static short field1145 = 205;

    @ObfuscatedName("client.qg")
    public static short field943 = 256;

    @ObfuscatedName("client.qn")
    public static short field1122 = 320;

    @ObfuscatedName("client.qy")
    public static short field1148 = 1;

    @ObfuscatedName("client.qa")
    public static short field1149 = 32767;

    @ObfuscatedName("client.qb")
    public static short field1150 = 1;

    @ObfuscatedName("client.qx")
    public static short field915 = 32767;

    @ObfuscatedName("client.qo")
    public static int field1152 = 0;

    @ObfuscatedName("client.qd")
    public static int field1092 = 0;

    @ObfuscatedName("client.qh")
    public static int field1154 = 0;

    @ObfuscatedName("client.qj")
    public static int field1155 = 0;

    @ObfuscatedName("client.qv")
    public static int field1156 = 0;

    @ObfuscatedName("client.qs")
    public static int field1157 = 0;

    @ObfuscatedName("client.qe")
    public static int field940 = 0;

    @ObfuscatedName("client.qi")
    public static class66[] field892 = new class66[400];

    @ObfuscatedName("client.qk")
    public static class196 field1129 = new class196();

    @ObfuscatedName("client.qr")
    public static int field1161 = 0;

    @ObfuscatedName("client.qu")
    public static class71[] field1162 = new class71[400];

    @ObfuscatedName("client.qp")
    public static class214 field1163 = new class214();

    @ObfuscatedName("client.qm")
    public static int field1164 = -1;

    @ObfuscatedName("client.qf")
    public static int field1056 = -1;

    @ObfuscatedName("client.rs")
    public static class17[] field1166 = new class17[8];

    @ObfuscatedName("client.re")
    public static long field946 = -1L;

    @ObfuscatedName("client.rh")
    public static long field1168 = -1L;

    @ObfuscatedName("client.rn")
    public static final class74 field1169 = new class74();

    @ObfuscatedName("client.rk")
    public static int[] field1170 = new int[50];

    @ObfuscatedName("client.rf")
    public static int[] field1171 = new int[50];

    @ObfuscatedName("bu.ey(I)Lkf;")
    public static class289 method1039() {
        return Statics.field1326;
    }

    @ObfuscatedName("client.as(B)V")
    public final void method854() {
    }

    public final void init() {
        if (!this.method762()) {
            return;
        }
        class275[] var1 = new class275[] { class275.field3721, class275.field3719, class275.field3717, class275.field3718, class275.field3713, class275.field3709, class275.field3716, class275.field3706, class275.field3711, class275.field3714, class275.field3710, class275.field3715, class275.field3708, class275.field3720, class275.field3707 };
        class275[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class275 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3712);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3712)) {
                    case 2:
                        Statics.field2840 = var5;
                        break;
                    case 3:
                        field1079 = Integer.parseInt(var5);
                        break;
                    case 4:
                        Statics.field3314 = Integer.parseInt(var5);
                        break;
                    case 5:
                        field927 = Integer.parseInt(var5);
                        break;
                    case 6:
                        if (var5.equalsIgnoreCase(class89.field1377)) {
                            field1147 = true;
                        } else {
                            field1147 = false;
                        }
                        break;
                    case 7:
                        Statics.field21 = var5;
                        break;
                    case 8:
                        if (var5.equalsIgnoreCase(class89.field1377)) {
                        }
                    case 9:
                    case 13:
                    default:
                        break;
                    case 10:
                        Statics.field584 = class232.method2224(Integer.parseInt(var5));
                        break;
                    case 11:
                        class233[] var6 = new class233[] { class233.field3182, class233.field3183, class233.field3184, class233.field3190, class233.field3185, class233.field3187 };
                        Statics.field26 = (class233) class169.method1267(var6, Integer.parseInt(var5));
                        if (Statics.field26 == class233.field3190) {
                            Statics.field424 = class290.field3851;
                        } else {
                            Statics.field424 = class290.field3848;
                        }
                        break;
                    case 12:
                        field893 = Integer.parseInt(var5);
                        break;
                    case 14:
                        field897 = Integer.parseInt(var5);
                        break;
                    case 15:
                        Statics.field732 = Integer.parseInt(var5);
                }
            }
        }
        class140.field2088 = false;
        field896 = false;
        Statics.field1479 = this.getCodeBase().getHost();
        String var7 = Statics.field584.field3177;
        byte var8 = 0;
        try {
            class156.method3("oldschool", var7, var8, 17);
        } catch (Exception var10) {
            class153.method3831((String) null, var10);
        }
        Statics.field357 = this;
        this.method760(765, 503, 142);
    }

    @ObfuscatedName("client.ad(I)V")
    public final void method789() {
        Statics.field341 = field927 == 0 ? 43594 : field1079 + 40000;
        Statics.field2184 = field927 == 0 ? 443 : field1079 + 50000;
        Statics.field1511 = Statics.field341;
        Statics.field2616 = class215.field2622;
        Statics.field2612 = class215.field2619;
        Statics.field1364 = class215.field2621;
        Statics.field1522 = class215.field2620;
        this.method763();
        this.method755();
        Statics.field332 = this.method752();
        Statics.field760 = new class161(255, class156.field2232, class156.field2230, 500000);
        Statics.field1990 = class82.method501();
        this.method779();
        class57.method3932(this, Statics.field3169);
        if (field927 != 0) {
            field906 = true;
        }
        int var1 = Statics.field1990.field1287;
        field1104 = 0L;
        if (var1 >= 2) {
            field1105 = true;
        } else {
            field1105 = false;
        }
        int var2 = field1105 ? 2 : 1;
        if (var2 == 1) {
            Statics.field357.method750(765, 503);
        } else {
            Statics.field357.method750(7680, 2160);
        }
        if (field898 < 25) {
            return;
        }
        field933.method3179(149);
        class180 var3 = field933;
        int var4 = field1105 ? 2 : 1;
        var3.method3031(var4);
        field933.method2917(Statics.field3627);
        field933.method2917(Statics.field321);
    }

    @ObfuscatedName("client.av(I)V")
    public final void method803() {
        field900++;
        this.method1080();
        class237.method233();
        class204.method118();
        method1027();
        class51.method2687();
        class60.method553();
        if (Statics.field332 != null) {
            int var1 = Statics.field332.method656();
            field1089 = var1;
        }
        if (field898 == 0) {
            method1102();
            Statics.field3198.method2701();
            for (int var2 = 0; var2 < 32; var2++) {
                field691[var2] = 0L;
            }
            for (int var3 = 0; var3 < 32; var3++) {
                field692[var3] = 0L;
            }
            Statics.field787 = 0;
        } else if (field898 == 5) {
            class93.method2223(this);
            method1102();
            Statics.field3198.method2701();
            for (int var4 = 0; var4 < 32; var4++) {
                field691[var4] = 0L;
            }
            for (int var5 = 0; var5 < 32; var5++) {
                field692[var5] = 0L;
            }
            Statics.field787 = 0;
        } else if (field898 == 10 || field898 == 11) {
            class93.method2223(this);
        } else if (field898 == 20) {
            class93.method2223(this);
            this.method1083();
        } else if (field898 == 25) {
            method321();
        }
        if (field898 == 30) {
            this.method1084();
        } else if (field898 == 40 || field898 == 45) {
            this.method1083();
        }
    }

    @ObfuscatedName("client.ae(ZI)V")
    public final void method767(boolean arg0) {
        boolean var2 = class204.method1608();
        if (var2 && field1110 && Statics.field612 != null) {
            Statics.field612.method1913();
        }
        if ((field898 == 10 || field898 == 20 || field898 == 30) && field1104 != 0L && class176.method3821() > field1104) {
            int var3 = method9();
            field1104 = 0L;
            if (var3 >= 2) {
                field1105 = true;
            } else {
                field1105 = false;
            }
            int var4 = field1105 ? 2 : 1;
            if (var4 == 1) {
                Statics.field357.method750(765, 503);
            } else {
                Statics.field357.method750(7680, 2160);
            }
            if (field898 >= 25) {
                field933.method3179(149);
                class180 var5 = field933;
                int var6 = field1105 ? 2 : 1;
                var5.method3031(var6);
                field933.method2917(Statics.field3627);
                field933.method2917(Statics.field321);
            }
        }
        if (arg0) {
            for (int var7 = 0; var7 < 100; var7++) {
                field1096[var7] = true;
            }
        }
        if (field898 == 0) {
            this.method751(class93.field1431, class93.field1432, arg0);
        } else if (field898 == 5) {
            class93.method1030(Statics.field532, Statics.field16, Statics.field846, arg0);
        } else if (field898 == 10 || field898 == 11) {
            class93.method1030(Statics.field532, Statics.field16, Statics.field846, arg0);
        } else if (field898 == 20) {
            class93.method1030(Statics.field532, Statics.field16, Statics.field846, arg0);
        } else if (field898 == 25) {
            if (field950 == 1) {
                if (field1045 > field1120) {
                    field1120 = field1045;
                }
                int var8 = (field1120 * 50 - field1045 * 50) / field1120;
                method318(class226.field2852 + class89.field1379 + class89.field1372 + var8 + "%" + class89.field1373, false);
            } else if (field950 == 2) {
                if (field948 > field924) {
                    field924 = field948;
                }
                int var9 = (field924 * 50 - field948 * 50) / field924 + 50;
                method318(class226.field2852 + class89.field1379 + class89.field1372 + var9 + "%" + class89.field1373, false);
            } else {
                method318(class226.field2852, false);
            }
        } else if (field898 == 30) {
            this.method1087();
        } else if (field898 == 40) {
            method318(class226.field2928 + class89.field1379 + class226.field2854, false);
        } else if (field898 == 45) {
            method318(class226.field3000, false);
        }
        if (field898 == 30 && field1103 == 0 && !arg0) {
            for (int var10 = 0; var10 < field1094; var10++) {
                if (field1097[var10]) {
                    Statics.field542.method737(field1099[var10], field992[var10], field1101[var10], field1102[var10]);
                    field1097[var10] = false;
                }
            }
        } else if (field898 > 0) {
            Statics.field542.method738(0, 0);
            for (int var11 = 0; var11 < field1094; var11++) {
                field1097[var11] = false;
            }
        }
    }

    @ObfuscatedName("client.ar(I)V")
    public final void method776() {
        if (Statics.field1173.method1693()) {
            Statics.field1173.method1678();
        }
        if (Statics.field2415 != null) {
            Statics.field2415.field836 = false;
        }
        Statics.field2415 = null;
        if (Statics.field304 != null) {
            Statics.field304.method2784();
            Statics.field304 = null;
        }
        class51.method2314();
        class60.method2863();
        Statics.field332 = null;
        if (Statics.field612 != null) {
            Statics.field612.method1890();
        }
        if (Statics.field813 != null) {
            Statics.field813.method1890();
        }
        class239.method168();
        class237.method3641();
        try {
            class156.field2232.method2141();
            for (int var1 = 0; var1 < Statics.field2224; var1++) {
                Statics.field1995[var1].method2141();
            }
            class156.field2230.method2141();
            class156.field2222.method2141();
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("b.eh(II)V")
    public static void method54(int arg0) {
        if (field898 == arg0) {
            return;
        }
        if (field898 == 0) {
            Statics.field357.method778();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field923 = 0;
            field902 = 0;
            field913 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1524 != null) {
            Statics.field1524.method2784();
            Statics.field1524 = null;
        }
        if (field898 == 25) {
            field950 = 0;
            field1045 = 0;
            field1120 = 1;
            field948 = 0;
            field924 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class93.method3986(Statics.field786, Statics.field1197, true, 0);
        } else if (arg0 == 20) {
            class93.method3986(Statics.field786, Statics.field1197, true, field898 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class93.method3986(Statics.field786, Statics.field1197, false, 4);
        } else {
            class93.method1467();
        }
        field898 = arg0;
    }

    @ObfuscatedName("client.ef(B)V")
    public void method1080() {
        if (field898 != 1000) {
            boolean var1 = class239.method672();
            if (!var1) {
                this.method1081();
            }
        }
    }

    @ObfuscatedName("client.ep(I)V")
    public void method1081() {
        if (class239.field3259 >= 4) {
            this.method882("js5crc");
            field898 = 1000;
            return;
        }
        if (class239.field3242 >= 4) {
            if (field898 <= 5) {
                this.method882("js5io");
                field898 = 1000;
                return;
            }
            field920 = 3000;
            class239.field3242 = 3;
        }
        if (--field920 + 1 > 0) {
            return;
        }
        try {
            if (field1151 == 0) {
                Statics.field660 = Statics.field683.method2714(Statics.field1479, Statics.field1511);
                field1151++;
            }
            if (field1151 == 1) {
                if (Statics.field660.field2210 == 2) {
                    this.method1082(-1);
                    return;
                }
                if (Statics.field660.field2210 == 1) {
                    field1151++;
                }
            }
            if (field1151 == 2) {
                Statics.field3856 = new class160((Socket) Statics.field660.field2212, Statics.field683);
                class174 var1 = new class174(5);
                var1.method3031(15);
                var1.method2919(142);
                Statics.field3856.method2769(var1.field2387, 0, 5);
                field1151++;
                Statics.field921 = class176.method3821();
            }
            if (field1151 == 3) {
                if (field898 <= 5 || Statics.field3856.method2770() > 0) {
                    int var2 = Statics.field3856.method2787();
                    if (var2 != 0) {
                        this.method1082(var2);
                        return;
                    }
                    field1151++;
                } else if (class176.method3821() - Statics.field921 > 30000L) {
                    this.method1082(-2);
                    return;
                }
            }
            if (field1151 == 4) {
                class239.method1423(Statics.field3856, field898 > 20);
                Statics.field660 = null;
                Statics.field3856 = null;
                field1151 = 0;
                field922 = 0;
            }
        } catch (IOException var4) {
            this.method1082(-3);
        }
    }

    @ObfuscatedName("client.ed(II)V")
    public void method1082(int arg0) {
        Statics.field660 = null;
        Statics.field3856 = null;
        field1151 = 0;
        if (Statics.field341 == Statics.field1511) {
            Statics.field1511 = Statics.field2184;
        } else {
            Statics.field1511 = Statics.field341;
        }
        field922++;
        if (field922 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field898 <= 5) {
                this.method882("js5connect_full");
                field898 = 1000;
            } else {
                field920 = 3000;
            }
        } else if (field922 >= 2 && arg0 == 6) {
            this.method882("js5connect_outofdate");
            field898 = 1000;
        } else if (field922 >= 4) {
            if (field898 <= 5) {
                this.method882("js5connect");
                field898 = 1000;
            } else {
                field920 = 3000;
            }
        }
    }

    @ObfuscatedName("client.ev(I)V")
    public static void method1102() {
        if (field969 == 0) {
            Statics.field596 = new class140(4, 104, 104, class62.field745);
            for (int var0 = 0; var0 < 4; var0++) {
                field951[var0] = new class162(104, 104);
            }
            Statics.field2369 = new class286(512, 512);
            class93.field1432 = class226.field2901;
            class93.field1431 = 5;
            field969 = 20;
        } else if (field969 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class137.field2021[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class140.method2572(var1, 500, 800, 512, 334);
            class93.field1432 = class226.field2856;
            class93.field1431 = 10;
            field969 = 30;
        } else if (field969 == 30) {
            Statics.field10 = method61(0, false, true, true);
            Statics.field2327 = method61(1, false, true, true);
            Statics.field312 = method61(2, true, false, true);
            Statics.field514 = method61(3, false, true, true);
            Statics.field560 = method61(4, false, true, true);
            Statics.field475 = method61(5, true, true, true);
            Statics.field575 = method61(6, true, true, false);
            Statics.field1506 = method61(7, false, true, true);
            Statics.field1197 = method61(8, false, true, true);
            Statics.field325 = method61(9, false, true, true);
            Statics.field786 = method61(10, false, true, true);
            Statics.field467 = method61(11, false, true, true);
            Statics.field801 = method61(12, false, true, true);
            Statics.field1412 = method61(13, true, false, true);
            Statics.field295 = method61(14, false, true, false);
            Statics.field1172 = method61(15, false, true, true);
            Statics.field337 = method61(16, false, true, false);
            class93.field1432 = class226.field2987;
            class93.field1431 = 20;
            field969 = 40;
        } else if (field969 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field10.method3968() * 4 / 100;
            int var8 = var7 + Statics.field2327.method3968() * 4 / 100;
            int var9 = var8 + Statics.field312.method3968() * 2 / 100;
            int var10 = var9 + Statics.field514.method3968() * 2 / 100;
            int var11 = var10 + Statics.field560.method3968() * 6 / 100;
            int var12 = var11 + Statics.field475.method3968() * 4 / 100;
            int var13 = var12 + Statics.field575.method3968() * 2 / 100;
            int var14 = var13 + Statics.field1506.method3968() * 58 / 100;
            int var15 = var14 + Statics.field1197.method3968() * 2 / 100;
            int var16 = var15 + Statics.field325.method3968() * 2 / 100;
            int var17 = var16 + Statics.field786.method3968() * 2 / 100;
            int var18 = var17 + Statics.field467.method3968() * 2 / 100;
            int var19 = var18 + Statics.field801.method3968() * 2 / 100;
            int var20 = var19 + Statics.field1412.method3968() * 2 / 100;
            int var21 = var20 + Statics.field295.method3968() * 2 / 100;
            int var22 = var21 + Statics.field1172.method3968() * 2 / 100;
            int var23 = var22 + Statics.field337.method3968() * 2 / 100;
            if (var23 == 100) {
                class93.field1432 = class226.field2910;
                class93.field1431 = 30;
                field969 = 45;
            } else {
                if (var23 != 0) {
                    class93.field1432 = class226.field2861 + var23 + "%";
                }
                class93.field1431 = 30;
            }
        } else if (field969 == 45) {
            boolean var24 = !field896;
            Statics.field1629 = 22050;
            Statics.field2316 = var24;
            Statics.field3306 = 2;
            class205 var25 = new class205();
            var25.method3478(9, 128);
            Statics.field612 = class110.method1648(Statics.field683, 0, 22050);
            Statics.field612.method1894(var25);
            class204.method37(Statics.field1172, Statics.field295, Statics.field560, var25);
            Statics.field813 = class110.method1648(Statics.field683, 1, 2048);
            Statics.field2292 = new class103();
            Statics.field813.method1894(Statics.field2292);
            Statics.field2217 = new class117(22050, Statics.field1629);
            class93.field1432 = class226.field2860;
            class93.field1431 = 35;
            field969 = 50;
            Statics.field273 = new class263(Statics.field1197, Statics.field1412);
        } else if (field969 == 50) {
            class262[] var26 = new class262[] { class262.field3616, class262.field3623, class262.field3619, class262.field3625, class262.field3617, class262.field3620 };
            int var27 = var26.length;
            class263 var28 = Statics.field273;
            class262[] var29 = new class262[] { class262.field3616, class262.field3623, class262.field3619, class262.field3625, class262.field3617, class262.field3620 };
            field945 = var28.method4436(var29);
            if (field945.size() < var27) {
                class93.field1432 = class226.field2938 + field945.size() * 100 / var27 + "%";
                class93.field1431 = 40;
            } else {
                Statics.field16 = (class264) field945.get(class262.field3625);
                Statics.field846 = (class264) field945.get(class262.field3616);
                Statics.field532 = (class264) field945.get(class262.field3617);
                Statics.field3291 = new class292(true);
                class93.field1432 = class226.field2862;
                class93.field1431 = 40;
                field969 = 60;
            }
        } else if (field969 == 60) {
            int var30 = class93.method1010(Statics.field786, Statics.field1197);
            byte var31 = 9;
            if (var30 < var31) {
                class93.field1432 = class226.field2863 + var30 * 100 / var31 + "%";
                class93.field1431 = 50;
            } else {
                class93.field1432 = class226.field2864;
                class93.field1431 = 50;
                method54(5);
                field969 = 70;
            }
        } else if (field969 == 70) {
            if (Statics.field312.method3840()) {
                class260.method3584(Statics.field312);
                class247.method1736(Statics.field312);
                class238 var33 = Statics.field312;
                class238 var34 = Statics.field1506;
                Statics.field3340 = var33;
                Statics.field3342 = var34;
                Statics.field3339 = Statics.field3340.method3846(3);
                class256.method1396(Statics.field312, Statics.field1506, field896);
                class238 var35 = Statics.field312;
                class238 var36 = Statics.field1506;
                Statics.field739 = var35;
                Statics.field3552 = var36;
                class253.method1918(Statics.field312);
                class238 var37 = Statics.field312;
                class238 var38 = Statics.field1506;
                boolean var39 = field1147;
                class264 var40 = Statics.field16;
                Statics.field3517 = var37;
                Statics.field2303 = var38;
                Statics.field3175 = var39;
                Statics.field3485 = Statics.field3517.method3846(10);
                Statics.field3525 = var40;
                class261.method1739(Statics.field312, Statics.field10, Statics.field2327);
                class238 var41 = Statics.field312;
                class238 var42 = Statics.field1506;
                Statics.field3324 = var41;
                Statics.field3312 = var42;
                class238 var43 = Statics.field312;
                Statics.field29 = var43;
                class242.method2735(Statics.field312);
                class238 var44 = Statics.field514;
                class238 var45 = Statics.field1506;
                class238 var46 = Statics.field1197;
                class238 var47 = Statics.field1412;
                Statics.field2683 = var44;
                Statics.field3678 = var45;
                Statics.field678 = var46;
                Statics.field2636 = var47;
                Statics.field1401 = new class217[Statics.field2683.method3885()][];
                Statics.field2634 = new boolean[Statics.field2683.method3885()];
                class238 var48 = Statics.field312;
                Statics.field3269 = var48;
                class254.method158(Statics.field312);
                class238 var49 = Statics.field312;
                Statics.field3303 = var49;
                class245.method1933(Statics.field312);
                class238 var50 = Statics.field312;
                Statics.field3387 = var50;
                Statics.field1173 = new class98();
                class255.method1002(Statics.field312, Statics.field1197, Statics.field1412);
                class238 var51 = Statics.field312;
                class238 var52 = Statics.field1197;
                Statics.field3354 = var51;
                Statics.field3655 = var52;
                class243.method171(Statics.field312, Statics.field1197);
                class93.field1432 = class226.field3030;
                class93.field1431 = 60;
                field969 = 80;
            } else {
                class93.field1432 = class226.field2865 + Statics.field312.method3953() + "%";
                class93.field1431 = 60;
            }
        } else if (field969 == 80) {
            int var53 = 0;
            if (Statics.field2305 == null) {
                class238 var54 = Statics.field1197;
                int var55 = var54.method3851("compass");
                int var56 = var54.method3852(var55, "");
                class286 var57 = class287.method2165(var54, var55, var56);
                Statics.field2305 = var57;
            } else {
                var53++;
            }
            if (Statics.field2239 == null) {
                class238 var58 = Statics.field1197;
                int var59 = var58.method3851("mapedge");
                int var60 = var58.method3852(var59, "");
                class286 var61 = class287.method2165(var58, var59, var60);
                Statics.field2239 = var61;
            } else {
                var53++;
            }
            if (Statics.field1659 == null) {
                Statics.field1659 = class287.method735(Statics.field1197, "mapscene", "");
            } else {
                var53++;
            }
            if (Statics.field1384 == null) {
                Statics.field1384 = class287.method992(Statics.field1197, "headicons_pk", "");
            } else {
                var53++;
            }
            if (Statics.field348 == null) {
                Statics.field348 = class287.method992(Statics.field1197, "headicons_prayer", "");
            } else {
                var53++;
            }
            if (Statics.field262 == null) {
                Statics.field262 = class287.method992(Statics.field1197, "headicons_hint", "");
            } else {
                var53++;
            }
            if (Statics.field1348 == null) {
                Statics.field1348 = class287.method992(Statics.field1197, "mapmarker", "");
            } else {
                var53++;
            }
            if (Statics.field3149 == null) {
                Statics.field3149 = class287.method992(Statics.field1197, "cross", "");
            } else {
                var53++;
            }
            if (Statics.field1283 == null) {
                Statics.field1283 = class287.method992(Statics.field1197, "mapdots", "");
            } else {
                var53++;
            }
            if (Statics.field643 == null) {
                Statics.field643 = class287.method735(Statics.field1197, "scrollbar", "");
            } else {
                var53++;
            }
            if (Statics.field461 == null) {
                Statics.field461 = class287.method735(Statics.field1197, "mod_icons", "");
            } else {
                var53++;
            }
            if (var53 < 11) {
                class93.field1432 = class226.field2867 + var53 * 100 / 12 + "%";
                class93.field1431 = 70;
            } else {
                Statics.field3633 = Statics.field461;
                Statics.field2239.method4769();
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 21.0D) - 10;
                int var64 = (int) (Math.random() * 21.0D) - 10;
                int var65 = (int) (Math.random() * 41.0D) - 20;
                Statics.field1659[0].method4724(var62 + var65, var63 + var65, var64 + var65);
                class93.field1432 = class226.field2953;
                class93.field1431 = 70;
                field969 = 90;
            }
        } else if (field969 == 90) {
            if (Statics.field325.method3840()) {
                class126 var66 = new class126(Statics.field325, Statics.field1197, 20, 0.8D, field896 ? 64 : 128);
                class137.method2410(var66);
                class137.method2411(0.8D);
                class93.field1432 = class226.field2917;
                class93.field1431 = 90;
                field969 = 110;
            } else {
                class93.field1432 = class226.field3023 + Statics.field325.method3953() + "%";
                class93.field1431 = 90;
            }
        } else if (field969 == 110) {
            Statics.field2415 = new class72();
            Statics.field683.method2715(Statics.field2415, 10);
            class93.field1432 = class226.field2871;
            class93.field1431 = 94;
            field969 = 120;
        } else if (field969 == 120) {
            if (Statics.field786.method3855("huffman", "")) {
                class166 var67 = new class166(Statics.field786.method3854("huffman", ""));
                class266.method4085(var67);
                class93.field1432 = class226.field3048;
                class93.field1431 = 96;
                field969 = 130;
            } else {
                class93.field1432 = class226.field2872 + "%";
                class93.field1431 = 96;
            }
        } else if (field969 == 130) {
            if (!Statics.field514.method3840()) {
                class93.field1432 = class226.field2874 + Statics.field514.method3953() * 4 / 5 + "%";
                class93.field1431 = 100;
            } else if (!Statics.field801.method3840()) {
                class93.field1432 = class226.field2874 + (80 + Statics.field801.method3953() / 6) + "%";
                class93.field1431 = 100;
            } else if (Statics.field1412.method3840()) {
                class93.field1432 = class226.field2875;
                class93.field1431 = 98;
                field969 = 140;
            } else {
                class93.field1432 = class226.field2874 + (96 + Statics.field1412.method3953() / 50) + "%";
                class93.field1431 = 100;
            }
        } else if (field969 == 140) {
            if (Statics.field337.method3887(class41.field539.field541)) {
                if (Statics.field1326 == null) {
                    Statics.field1326 = new class289();
                    Statics.field1326.method4877(Statics.field337, Statics.field532, field945, Statics.field1659);
                }
                int var68 = Statics.field1326.method4879();
                if (var68 < 100) {
                    class93.field1432 = class226.field2876 + (var68 * 9 / 10 + 10) + "%";
                } else {
                    class93.field1432 = class226.field2877;
                    class93.field1431 = 100;
                    field969 = 150;
                }
            } else {
                class93.field1432 = class226.field2876 + Statics.field337.method3858(class41.field539.field541) / 10 + "%";
            }
        } else if (field969 == 150) {
            method54(10);
        }
    }

    @ObfuscatedName("x.ej(IZZZB)Lin;")
    public static class238 method61(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class161 var4 = null;
        if (class156.field2232 != null) {
            var4 = new class161(arg0, class156.field2232, Statics.field1995[arg0], 1000000);
        }
        return new class238(var4, Statics.field760, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fb(B)V")
    public final void method1083() {
        try {
            if (field923 == 0) {
                if (Statics.field304 != null) {
                    Statics.field304.method2784();
                    Statics.field304 = null;
                }
                Statics.field655 = null;
                field944 = false;
                field902 = 0;
                field923 = 1;
            }
            if (field923 == 1) {
                if (Statics.field655 == null) {
                    Statics.field655 = Statics.field683.method2714(Statics.field1479, Statics.field1511);
                }
                if (Statics.field655.field2210 == 2) {
                    throw new IOException();
                }
                if (Statics.field655.field2210 == 1) {
                    Statics.field304 = new class160((Socket) Statics.field655.field2212, Statics.field683);
                    Statics.field655 = null;
                    field923 = 2;
                }
            }
            if (field923 == 2) {
                field933.field2384 = 0;
                field933.method3031(14);
                Statics.field304.method2769(field933.field2387, 0, 1);
                field1001.field2384 = 0;
                field923 = 3;
            }
            if (field923 == 3) {
                if (Statics.field612 != null) {
                    Statics.field612.method1889();
                }
                if (Statics.field813 != null) {
                    Statics.field813.method1889();
                }
                int var1 = Statics.field304.method2787();
                if (Statics.field612 != null) {
                    Statics.field612.method1889();
                }
                if (Statics.field813 != null) {
                    Statics.field813.method1889();
                }
                if (var1 != 0) {
                    Statics.method575(var1);
                    return;
                }
                field1001.field2384 = 0;
                field923 = 4;
            }
            if (field923 == 4) {
                if (field1001.field2384 < 8) {
                    int var2 = Statics.field304.method2770();
                    if (var2 > 8 - field1001.field2384) {
                        var2 = 8 - field1001.field2384;
                    }
                    if (var2 > 0) {
                        Statics.field304.method2779(field1001.field2387, field1001.field2384, var2);
                        field1001.field2384 += var2;
                    }
                }
                if (field1001.field2384 == 8) {
                    field1001.field2384 = 0;
                    Statics.field330 = field1001.method2949();
                    field923 = 5;
                }
            }
            if (field923 == 5) {
                int[] var3 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field330 >> 32), (int) (Statics.field330 & 0xFFFFFFFFFFFFFFFFL) };
                field933.field2384 = 0;
                field933.method3031(1);
                field933.method3031(class93.field1437.method7());
                field933.method2919(var3[0]);
                field933.method2919(var3[1]);
                field933.method2919(var3[2]);
                field933.method2919(var3[3]);
                switch(class93.field1437.field2178) {
                    case 0:
                        field933.field2384 += 8;
                        break;
                    case 1:
                    case 2:
                        field933.method3009(Statics.field2399);
                        field933.field2384 += 5;
                        break;
                    case 3:
                        field933.method2919((Integer) Statics.field1990.field1288.get(class271.method3824(class93.field1438)));
                        field933.field2384 += 4;
                }
                field933.method2922(class93.field1439);
                field933.method3084(class91.field1397, class91.field1398);
                field934.field2384 = 0;
                if (field898 == 40) {
                    field934.method3031(18);
                } else {
                    field934.method3031(16);
                }
                field934.method2917(0);
                int var4 = field934.field2384;
                field934.method2919(142);
                field934.method2986(field933.field2387, 0, field933.field2384);
                int var5 = field934.field2384;
                field934.method2922(class93.field1438);
                field934.method3031((field1105 ? 1 : 0) << 1 | (field896 ? 1 : 0));
                field934.method2917(Statics.field3627);
                field934.method2917(Statics.field321);
                method1038(field934);
                field934.method2922(Statics.field2840);
                field934.method2919(Statics.field732);
                class174 var6 = new class174(Statics.field3291.method5066());
                Statics.field3291.method5067(var6);
                field934.method2986(var6.field2387, 0, var6.field2387.length);
                field934.method3031(Statics.field3314);
                field934.method2919(0);
                field934.method2919(Statics.field10.field3217);
                field934.method2919(Statics.field2327.field3217);
                field934.method2919(Statics.field312.field3217);
                field934.method2919(Statics.field514.field3217);
                field934.method2919(Statics.field560.field3217);
                field934.method2919(Statics.field475.field3217);
                field934.method2919(Statics.field575.field3217);
                field934.method2919(Statics.field1506.field3217);
                field934.method2919(Statics.field1197.field3217);
                field934.method2919(Statics.field325.field3217);
                field934.method2919(Statics.field786.field3217);
                field934.method2919(Statics.field467.field3217);
                field934.method2919(Statics.field801.field3217);
                field934.method2919(Statics.field1412.field3217);
                field934.method2919(Statics.field295.field3217);
                field934.method2919(Statics.field1172.field3217);
                field934.method2919(Statics.field337.field3217);
                field934.method3106(var3, var5, field934.field2384);
                field934.method2926(field934.field2384 - var4);
                Statics.field304.method2769(field934.field2387, 0, field934.field2384);
                field933.method3191(var3);
                for (int var7 = 0; var7 < 4; var7++) {
                    var3[var7] += 50;
                }
                field1001.method3191(var3);
                field923 = 6;
            }
            if (field923 == 6 && Statics.field304.method2770() > 0) {
                int var8 = Statics.field304.method2787();
                if (var8 == 21 && field898 == 20) {
                    field923 = 7;
                } else if (var8 == 2) {
                    field923 = 9;
                } else if (var8 == 15 && field898 == 40) {
                    field936 = -1;
                    field923 = 13;
                } else if (var8 == 23 && field913 < 1) {
                    field913++;
                    field923 = 0;
                } else if (var8 == 29) {
                    field923 = 11;
                } else {
                    Statics.method575(var8);
                    return;
                }
            }
            if (field923 == 7 && Statics.field304.method2770() > 0) {
                field942 = (Statics.field304.method2787() + 3) * 60;
                field923 = 8;
            }
            if (field923 == 8) {
                field902 = 0;
                class93.method3114(class226.field2881, class226.field2882, field942 / 60 + class226.field2883);
                if (--field942 <= 0) {
                    field923 = 0;
                }
            } else {
                if (field923 == 9 && Statics.field304.method2770() >= 13) {
                    boolean var9 = Statics.field304.method2787() == 1;
                    Statics.field304.method2779(field1001.field2387, 0, 4);
                    field1001.field2384 = 0;
                    boolean var10 = false;
                    if (var9) {
                        int var11 = field1001.method3180() << 24;
                        int var12 = var11 | field1001.method3180() << 16;
                        int var13 = var12 | field1001.method3180() << 8;
                        int var14 = var13 | field1001.method3180();
                        int var15 = class271.method3824(class93.field1438);
                        if (Statics.field1990.field1288.size() >= 10 && !Statics.field1990.field1288.containsKey(var15)) {
                            Iterator var16 = Statics.field1990.field1288.entrySet().iterator();
                            var16.next();
                            var16.remove();
                        }
                        Statics.field1990.field1288.put(var15, var14);
                        class82.method2307();
                    }
                    field1058 = Statics.field304.method2787();
                    field1060 = Statics.field304.method2787() == 1;
                    field1012 = Statics.field304.method2787();
                    field1012 <<= 0x8;
                    field1012 += Statics.field304.method2787();
                    field1013 = Statics.field304.method2787();
                    Statics.field304.method2779(field1001.field2387, 0, 1);
                    field1001.field2384 = 0;
                    field937 = field1001.method3180();
                    Statics.field304.method2779(field1001.field2387, 0, 2);
                    field1001.field2384 = 0;
                    field936 = field1001.method2932();
                    try {
                        client var17 = Statics.field357;
                        JSObject.getWindow(var17).call("zap", (Object[]) null);
                    } catch (Throwable var40) {
                    }
                    field923 = 10;
                }
                if (field923 != 10) {
                    if (field923 == 11 && Statics.field304.method2770() >= 2) {
                        field1001.field2384 = 0;
                        Statics.field304.method2779(field1001.field2387, 0, 2);
                        field1001.field2384 = 0;
                        Statics.field648 = field1001.method2932();
                        field923 = 12;
                    }
                    if (field923 == 12 && Statics.field304.method2770() >= Statics.field648) {
                        field1001.field2384 = 0;
                        Statics.field304.method2779(field1001.field2387, 0, Statics.field648);
                        field1001.field2384 = 0;
                        String var35 = field1001.method2938();
                        String var36 = field1001.method2938();
                        String var37 = field1001.method2938();
                        class93.method3114(var35, var36, var37);
                        method54(10);
                    }
                    if (field923 == 13) {
                        if (field936 == -1) {
                            if (Statics.field304.method2770() < 2) {
                                return;
                            }
                            Statics.field304.method2779(field1001.field2387, 0, 2);
                            field1001.field2384 = 0;
                            field936 = field1001.method2932();
                        }
                        if (Statics.field304.method2770() >= field936) {
                            Statics.field304.method2779(field1001.field2387, 0, field936);
                            field1001.field2384 = 0;
                            int var38 = field936;
                            method945();
                            class97.method1034(field1001);
                            if (field1001.field2384 != var38) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field902++;
                        if (field902 > 2000) {
                            if (field913 < 1) {
                                if (Statics.field341 == Statics.field1511) {
                                    Statics.field1511 = Statics.field2184;
                                } else {
                                    Statics.field1511 = Statics.field341;
                                }
                                field913++;
                                field923 = 0;
                            } else {
                                Statics.method575(-3);
                            }
                        }
                    }
                } else if (Statics.field304.method2770() >= field936) {
                    field1001.field2384 = 0;
                    Statics.field304.method2779(field1001.field2387, 0, field936);
                    field1126 = -1L;
                    field1039 = -1;
                    Statics.field2415.field834 = 0;
                    Statics.field2795 = true;
                    field905 = true;
                    field949 = -1L;
                    class281.method26();
                    field933.field2384 = 0;
                    field1001.field2384 = 0;
                    field937 = -1;
                    field1165 = -1;
                    field1071 = -1;
                    field979 = -1;
                    field938 = 0;
                    field907 = 0;
                    field987 = 0;
                    field908 = 0;
                    method685();
                    class60.method4429(0);
                    class99.method2315();
                    field1044 = 0;
                    field1046 = false;
                    field1132 = 0;
                    field1062 = (int) (Math.random() * 100.0D) - 50;
                    field957 = (int) (Math.random() * 110.0D) - 55;
                    field959 = (int) (Math.random() * 80.0D) - 40;
                    field991 = (int) (Math.random() * 120.0D) - 60;
                    field964 = (int) (Math.random() * 30.0D) - 20;
                    field1158 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field1018 = 0;
                    field1118 = -1;
                    field1123 = 0;
                    field1124 = 0;
                    field916 = class92.field1408;
                    field917 = class92.field1408;
                    field929 = 0;
                    Statics.method1592();
                    for (int var19 = 0; var19 < 2048; var19++) {
                        field1032[var19] = null;
                    }
                    for (int var20 = 0; var20 < 32768; var20++) {
                        field928[var20] = null;
                    }
                    field1107 = -1;
                    field1075.method3372();
                    field1024.method3372();
                    for (int var21 = 0; var21 < 4; var21++) {
                        for (int var22 = 0; var22 < 104; var22++) {
                            for (int var23 = 0; var23 < 104; var23++) {
                                field1021[var21][var22][var23] = null;
                            }
                        }
                    }
                    field1022 = new class194();
                    field940 = 0;
                    field1157 = 0;
                    field1161 = 0;
                    for (int var24 = 0; var24 < Statics.field2317; var24++) {
                        class242 var25 = class242.method1000(var24);
                        if (var25 != null) {
                            class212.field2596[var24] = 0;
                            class212.field2597[var24] = 0;
                        }
                    }
                    Statics.field1173.method1676();
                    field1059 = -1;
                    if (field1051 != -1) {
                        int var26 = field1051;
                        if (var26 != -1 && Statics.field2634[var26]) {
                            Statics.field2683.method3848(var26);
                            if (Statics.field1401[var26] != null) {
                                boolean var27 = true;
                                for (int var28 = 0; var28 < Statics.field1401[var26].length; var28++) {
                                    if (Statics.field1401[var26][var28] != null) {
                                        if (Statics.field1401[var26][var28].field2645 == 2) {
                                            var27 = false;
                                        } else {
                                            Statics.field1401[var26][var28] = null;
                                        }
                                    }
                                }
                                if (var27) {
                                    Statics.field1401[var26] = null;
                                }
                                Statics.field2634[var26] = false;
                            }
                        }
                    }
                    for (class69 var29 = (class69) field1020.method3322(); var29 != null; var29 = (class69) field1020.method3323()) {
                        method4603(var29, true);
                    }
                    field1051 = -1;
                    field1020 = new class191(8);
                    field1055 = null;
                    method685();
                    field1163.method3702((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var30 = 0; var30 < 8; var30++) {
                        field1063[var30] = null;
                        field1023[var30] = false;
                    }
                    class64.method3650();
                    field899 = true;
                    for (int var31 = 0; var31 < 100; var31++) {
                        field1096[var31] = true;
                    }
                    field933.method3179(149);
                    class180 var32 = field933;
                    int var33 = field1105 ? 2 : 1;
                    var32.method3031(var33);
                    field933.method2917(Statics.field3627);
                    field933.method2917(Statics.field321);
                    field1116 = null;
                    Statics.field611 = 0;
                    Statics.field3744 = null;
                    for (int var34 = 0; var34 < 8; var34++) {
                        field1166[var34] = new class17();
                    }
                    Statics.field2403 = null;
                    class97.method1034(field1001);
                    Statics.field647 = -1;
                    method939(false);
                    field937 = -1;
                }
            }
        } catch (IOException var41) {
            if (field913 < 1) {
                if (Statics.field341 == Statics.field1511) {
                    Statics.field1511 = Statics.field2184;
                } else {
                    Statics.field1511 = Statics.field341;
                }
                field913++;
                field923 = 0;
            } else {
                Statics.method575(-2);
            }
        }
    }

    @ObfuscatedName("bi.fg(I)V")
    public static void method945() {
        field933.field2384 = 0;
        field1001.field2384 = 0;
        field937 = -1;
        field1165 = -1;
        field1071 = -1;
        field979 = -1;
        field936 = 0;
        field938 = 0;
        field907 = 0;
        method685();
        field1018 = 0;
        field1123 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1032[var0] = null;
        }
        Statics.field308 = null;
        for (int var1 = 0; var1 < field928.length; var1++) {
            class87 var2 = field928[var1];
            if (var2 != null) {
                var2.field1219 = -1;
                var2.field1250 = false;
            }
        }
        class64.method3650();
        method54(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field1096[var3] = true;
        }
        field933.method3179(149);
        class180 var4 = field933;
        int var5 = field1105 ? 2 : 1;
        var4.method3031(var5);
        field933.method2917(Statics.field3627);
        field933.method2917(Statics.field321);
    }

    @ObfuscatedName("ca.ft(I)V")
    public static final void method1568() {
        if (Statics.field304 != null) {
            Statics.field304.method2784();
            Statics.field304 = null;
        }
        method2902();
        Statics.field596.method2493();
        for (int var0 = 0; var0 < 4; var0++) {
            field951[var0].method2809();
        }
        System.gc();
        class204.field2499 = 1;
        Statics.field3381 = null;
        Statics.field2326 = -1;
        Statics.field2500 = -1;
        Statics.field2501 = 0;
        Statics.field2496 = false;
        Statics.field2502 = 2;
        field1128 = -1;
        field1110 = false;
        for (class83 var1 = (class83) class83.field1300.method3376(); var1 != null; var1 = (class83) class83.field1300.method3377()) {
            if (var1.field1299 != null) {
                Statics.field2292.method1755(var1.field1299);
                var1.field1299 = null;
            }
            if (var1.field1304 != null) {
                Statics.field2292.method1755(var1.field1304);
                var1.field1304 = null;
            }
        }
        class83.field1300.method3372();
        method54(10);
    }

    @ObfuscatedName("fw.fr(I)V")
    public static final void method2902() {
        class260.field3591.method3311();
        class247.method1009();
        class248.field3341.method3311();
        class256.field3432.method3311();
        class256.field3479.method3311();
        class256.field3434.method3311();
        class256.field3465.method3311();
        class259.method1641();
        class257.field3486.method3311();
        class257.field3507.method3311();
        class257.field3503.method3311();
        class261.method503();
        class246.field3313.method3311();
        class246.field3329.method3311();
        class251.field3379.method3311();
        class242.field3271.method3311();
        class255.method23();
        class249.method2737();
        class253.field3389.method3311();
        class252.field3383.method3311();
        class243.field3279.method3311();
        class214.method2691();
        class217.field2696.method3311();
        class217.field2638.method3311();
        class217.field2738.method3311();
        class217.field2653.method3311();
        ((class126) Statics.field2018).method2199();
        class100.field1535.method3311();
        Statics.field10.method3849();
        Statics.field2327.method3849();
        Statics.field514.method3849();
        Statics.field560.method3849();
        Statics.field475.method3849();
        Statics.field575.method3849();
        Statics.field1506.method3849();
        Statics.field1197.method3849();
        Statics.field325.method3849();
        Statics.field786.method3849();
        Statics.field467.method3849();
        Statics.field801.method3849();
    }

    @ObfuscatedName("client.fc(I)V")
    public final void method1084() {
        if (field907 > 1) {
            field907--;
        }
        if (field987 > 0) {
            field987--;
        }
        if (field944) {
            field944 = false;
            if (field987 > 0) {
                method1568();
            } else {
                method54(40);
                Statics.field1524 = Statics.field304;
                Statics.field304 = null;
            }
            return;
        }
        if (!field1029) {
            method3934();
        }
        for (int var1 = 0; var1 < 100 && this.method1093(); var1++) {
        }
        if (field898 != 30) {
            return;
        }
        while (class281.method3675()) {
            field933.method3179(148);
            field933.method3031(0);
            int var2 = field933.field2384;
            class281.method3822(field933);
            field933.method3095(field933.field2384 - var2);
        }
        Object var3 = Statics.field2415.field835;
        synchronized (Statics.field2415.field835) {
            if (!field1004) {
                Statics.field2415.field834 = 0;
            } else if (class60.field728 != 0 || Statics.field2415.field834 >= 40) {
                field933.method3179(70);
                field933.method3031(0);
                int var4 = field933.field2384;
                int var5 = 0;
                for (int var6 = 0; var6 < Statics.field2415.field834 && field933.field2384 - var4 < 240; var6++) {
                    var5++;
                    int var7 = Statics.field2415.field838[var6];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var8 = Statics.field2415.field837[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    int var9 = var7 * 765 + var8;
                    if (Statics.field2415.field838[var6] == -1 && Statics.field2415.field837[var6] == -1) {
                        var8 = -1;
                        var7 = -1;
                        var9 = 524287;
                    }
                    if (field955 != var8 || field894 != var7) {
                        int var10 = var8 - field955;
                        field955 = var8;
                        int var11 = var7 - field894;
                        field894 = var7;
                        if (field1039 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var10 += 32;
                            var11 += 32;
                            field933.method2917((field1039 << 12) + (var10 << 6) + var11);
                            field1039 = 0;
                        } else if (field1039 < 8) {
                            field933.method3009((field1039 << 19) + 8388608 + var9);
                            field1039 = 0;
                        } else {
                            field933.method2919((field1039 << 19) + -1073741824 + var9);
                            field1039 = 0;
                        }
                    } else if (field1039 < 2047) {
                        field1039++;
                    }
                }
                field933.method3095(field933.field2384 - var4);
                if (var5 >= Statics.field2415.field834) {
                    Statics.field2415.field834 = 0;
                } else {
                    Statics.field2415.field834 -= var5;
                    for (int var12 = 0; var12 < Statics.field2415.field834; var12++) {
                        Statics.field2415.field837[var12] = Statics.field2415.field837[var5 + var12];
                        Statics.field2415.field838[var12] = Statics.field2415.field838[var5 + var12];
                    }
                }
            }
        }
        if (class60.field728 == 1 || !Statics.field2179 && class60.field728 == 4 || class60.field728 == 2) {
            long var14 = (class60.field716 - field1126) / 50L;
            if (var14 > 4095L) {
                var14 = 4095L;
            }
            field1126 = class60.field716;
            int var16 = class60.field730;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > Statics.field321) {
                var16 = Statics.field321;
            }
            int var17 = class60.field718;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > Statics.field3627) {
                var17 = Statics.field3627;
            }
            int var18 = (int) var14;
            field933.method3179(160);
            field933.method2917((class60.field728 == 2 ? 1 : 0) + (var18 << 1));
            field933.method2917(var17);
            field933.method2917(var16);
        }
        if (class51.field642 > 0) {
            field933.method3179(154);
            field933.method2917(0);
            int var19 = field933.field2384;
            long var20 = class176.method3821();
            for (int var22 = 0; var22 < class51.field642; var22++) {
                long var23 = var20 - field949;
                if (var23 > 16777215L) {
                    var23 = 16777215L;
                }
                field949 = var20;
                field933.method3009((int) var23);
                field933.method3031(class51.field630[var22]);
            }
            field933.method2926(field933.field2384 - var19);
        }
        if (field981 > 0) {
            field981--;
        }
        if (class51.field625[96] || class51.field625[97] || class51.field625[98] || class51.field625[99]) {
            field982 = true;
        }
        if (field982 && field981 <= 0) {
            field981 = 20;
            field982 = false;
            field933.method3179(231);
            field933.method3113(field1158);
            field933.method3113(field974);
        }
        if (Statics.field2795 && !field905) {
            field905 = true;
            field933.method3179(33);
            field933.method3031(1);
        }
        if (!Statics.field2795 && field905) {
            field905 = false;
            field933.method3179(33);
            field933.method3031(0);
        }
        method31();
        if (field898 != 30) {
            return;
        }
        method991();
        int var10002;
        for (int var25 = 0; var25 < field1132; var25++) {
            var10002 = field1135[var25]--;
            if (field1135[var25] >= -10) {
                class106 var27 = field1137[var25];
                if (var27 == null) {
                    class106 var10000 = (class106) null;
                    var27 = class106.method1813(Statics.field560, field1133[var25], 0);
                    if (var27 == null) {
                        continue;
                    }
                    field1135[var25] += var27.method1806();
                    field1137[var25] = var27;
                }
                if (field1135[var25] < 0) {
                    int var34;
                    if (field1136[var25] == 0) {
                        var34 = field1130;
                    } else {
                        int var28 = (field1136[var25] & 0xFF) * 128;
                        int var29 = field1136[var25] >> 16 & 0xFF;
                        int var30 = var29 * 128 + 64 - Statics.field308.field1247;
                        if (var30 < 0) {
                            var30 = -var30;
                        }
                        int var31 = field1136[var25] >> 8 & 0xFF;
                        int var32 = var31 * 128 + 64 - Statics.field308.field1200;
                        if (var32 < 0) {
                            var32 = -var32;
                        }
                        int var33 = var30 + var32 - 128;
                        if (var33 > var28) {
                            field1135[var25] = -100;
                            continue;
                        }
                        if (var33 < 0) {
                            var33 = 0;
                        }
                        var34 = field1131 * (var28 - var33) / var28;
                    }
                    if (var34 > 0) {
                        class108 var35 = var27.method1809().method1860(Statics.field2217);
                        class118 var36 = class118.method2054(var35, 100, var34);
                        var36.method1980(field1010[var25] - 1);
                        Statics.field2292.method1781(var36);
                    }
                    field1135[var25] = -100;
                }
            } else {
                field1132--;
                for (int var26 = var25; var26 < field1132; var26++) {
                    field1133[var26] = field1133[var26 + 1];
                    field1137[var26] = field1137[var26 + 1];
                    field1010[var26] = field1010[var26 + 1];
                    field1135[var26] = field1135[var26 + 1];
                    field1136[var26] = field1136[var26 + 1];
                }
                var25--;
            }
        }
        if (field1110 && !class204.method141()) {
            if (field1078 != 0 && field1128 != -1) {
                class204.method291(Statics.field575, field1128, 0, field1078, false);
            }
            field1110 = false;
        }
        field938++;
        if (field938 <= 750) {
            method140();
            method641();
            int[] var37 = class97.field1497;
            for (int var38 = 0; var38 < class97.field1490; var38++) {
                class75 var39 = field1032[var37[var38]];
                if (var39 != null && var39.field1215 > 0) {
                    var39.field1215--;
                    if (var39.field1215 == 0) {
                        var39.field1212 = null;
                    }
                }
            }
            for (int var40 = 0; var40 < field929; var40++) {
                int var41 = field1014[var40];
                class87 var42 = field928[var41];
                if (var42 != null && var42.field1215 > 0) {
                    var42.field1215--;
                    if (var42.field1215 == 0) {
                        var42.field1212 = null;
                    }
                }
            }
            field967++;
            if (field1017 != 0) {
                field1000 += 20;
                if (field1000 >= 400) {
                    field1017 = 0;
                }
            }
            if (Statics.field508 != null) {
                field1002++;
                if (field1002 >= 15) {
                    method3808(Statics.field508);
                    Statics.field508 = null;
                }
            }
            class217 var43 = Statics.field869;
            class217 var44 = Statics.field3580;
            Statics.field869 = null;
            Statics.field3580 = null;
            field1068 = null;
            field1072 = false;
            field1069 = false;
            field1112 = 0;
            while (Statics.method62() && field1112 < 128) {
                if (field1058 >= 2 && class51.field625[82] && Statics.field626 == 66) {
                    String var45 = "";
                    Iterator var46 = class99.field1520.iterator();
                    while (var46.hasNext()) {
                        class73 var47 = (class73) var46.next();
                        var45 = var45 + var47.field842 + ':' + var47.field839 + '\n';
                    }
                    Statics.field357.method753(var45);
                } else {
                    field1114[field1112] = Statics.field626;
                    field1113[field1112] = Statics.field342;
                    field1112++;
                }
            }
            if (field1051 != -1) {
                method2775(field1051, 0, 0, Statics.field3627, Statics.field321, 0, 0);
            }
            field1076++;
            while (true) {
                class70 var50;
                class217 var51;
                class217 var52;
                do {
                    var50 = (class70) field1115.method3374();
                    if (var50 == null) {
                        while (true) {
                            class70 var53;
                            class217 var54;
                            class217 var55;
                            do {
                                var53 = (class70) field975.method3374();
                                if (var53 == null) {
                                    while (true) {
                                        class70 var56;
                                        class217 var57;
                                        class217 var58;
                                        do {
                                            var56 = (class70) field1090.method3374();
                                            if (var56 == null) {
                                                this.method1348();
                                                method646();
                                                if (field962 != null) {
                                                    this.method1336();
                                                }
                                                if (Statics.field324 != null) {
                                                    method3808(Statics.field324);
                                                    field1091++;
                                                    if (class60.field733 == 0) {
                                                        if (!field1008) {
                                                            label803: {
                                                                int var65 = method1567();
                                                                if (field961 > 2) {
                                                                    label788: {
                                                                        label770: {
                                                                            if (field1028 == 1) {
                                                                                boolean var66;
                                                                                if (field961 <= 0) {
                                                                                    var66 = false;
                                                                                } else if (field1006 && class51.field625[81] && field1038 != -1) {
                                                                                    var66 = true;
                                                                                } else {
                                                                                    var66 = false;
                                                                                }
                                                                                if (!var66) {
                                                                                    break label770;
                                                                                }
                                                                            }
                                                                            boolean var67;
                                                                            if (var65 < 0) {
                                                                                var67 = false;
                                                                            } else {
                                                                                int var68 = field1033[var65];
                                                                                if (var68 >= 2000) {
                                                                                    var68 -= 2000;
                                                                                }
                                                                                if (var68 == 1007) {
                                                                                    var67 = true;
                                                                                } else {
                                                                                    var67 = false;
                                                                                }
                                                                            }
                                                                            if (!var67) {
                                                                                break label788;
                                                                            }
                                                                        }
                                                                        this.method1132(field994, field971);
                                                                        break label803;
                                                                    }
                                                                }
                                                                if (field961 > 0) {
                                                                    Statics.method102(field994, field971);
                                                                }
                                                            }
                                                        } else if (Statics.field748 == Statics.field324 && field1106 != field1007) {
                                                            class217 var59 = Statics.field324;
                                                            byte var60 = 0;
                                                            if (field1070 == 1 && var59.field2647 == 206) {
                                                                var60 = 1;
                                                            }
                                                            if (var59.field2761[field1007] <= 0) {
                                                                var60 = 0;
                                                            }
                                                            if (class218.method944(Statics.method555(var59))) {
                                                                int var61 = field1106;
                                                                int var62 = field1007;
                                                                var59.field2761[var62] = var59.field2761[var61];
                                                                var59.field2637[var62] = var59.field2637[var61];
                                                                var59.field2761[var61] = -1;
                                                                var59.field2637[var61] = 0;
                                                            } else if (var60 == 1) {
                                                                int var63 = field1106;
                                                                int var64 = field1007;
                                                                while (var63 != var64) {
                                                                    if (var63 > var64) {
                                                                        var59.method3733(var63 - 1, var63);
                                                                        var63--;
                                                                    } else if (var63 < var64) {
                                                                        var59.method3733(var63 + 1, var63);
                                                                        var63++;
                                                                    }
                                                                }
                                                            } else {
                                                                var59.method3733(field1007, field1106);
                                                            }
                                                            field933.method3179(222);
                                                            field933.method2917(field1007);
                                                            field933.method2965(field1106);
                                                            field933.method2956(var60);
                                                            field933.method2973(Statics.field324.field2643);
                                                        }
                                                        field1002 = 10;
                                                        class60.field728 = 0;
                                                        Statics.field324 = null;
                                                    } else if (field1091 >= 5 && (class60.field722 > field994 + 5 || class60.field722 < field994 - 5 || class60.field723 * -113761157 > field971 + 5 || class60.field723 * -113761157 < field971 - 5)) {
                                                        field1008 = true;
                                                    }
                                                }
                                                if (class140.method2570()) {
                                                    int var69 = class140.field2073;
                                                    int var70 = class140.field2054;
                                                    field933.method3179(106);
                                                    field933.method3031(5);
                                                    field933.method2917(Statics.field2304 + var69);
                                                    field933.method2956(class51.field625[82] ? (class51.field625[81] ? 2 : 1) : 0);
                                                    field933.method2917(Statics.field2147 + var70);
                                                    class140.method2531();
                                                    field998 = class60.field718;
                                                    field999 = class60.field730;
                                                    field1017 = 1;
                                                    field1000 = 0;
                                                    field1123 = var69;
                                                    field1124 = var70;
                                                }
                                                if (Statics.field869 != var43) {
                                                    if (var43 != null) {
                                                        method3808(var43);
                                                    }
                                                    if (Statics.field869 != null) {
                                                        method3808(Statics.field869);
                                                    }
                                                }
                                                if (Statics.field3580 != var44 && field1121 == field1043) {
                                                    if (var44 != null) {
                                                        method3808(var44);
                                                    }
                                                    if (Statics.field3580 != null) {
                                                        method3808(Statics.field3580);
                                                    }
                                                }
                                                if (Statics.field3580 == null) {
                                                    if (field1121 > 0) {
                                                        field1121--;
                                                    }
                                                } else if (field1121 < field1043) {
                                                    field1121++;
                                                    if (field1121 == field1043) {
                                                        method3808(Statics.field3580);
                                                    }
                                                }
                                                method943();
                                                if (field930) {
                                                    method470();
                                                }
                                                for (int var71 = 0; var71 < 5; var71++) {
                                                    var10002 = field1167[var71]++;
                                                }
                                                Statics.field1173.method1680();
                                                int var72 = class60.method38();
                                                int var73 = class51.field637;
                                                if (var72 > 15000 && var73 > 15000) {
                                                    field987 = 250;
                                                    class60.method4429(14500);
                                                    field933.method3179(133);
                                                }
                                                field903++;
                                                if (field903 > 500) {
                                                    field903 = 0;
                                                    int var75 = (int) (Math.random() * 8.0D);
                                                    if ((var75 & 0x1) == 1) {
                                                        field1062 += field1064;
                                                    }
                                                    if ((var75 & 0x2) == 2) {
                                                        field957 += field958;
                                                    }
                                                    if ((var75 & 0x4) == 4) {
                                                        field959 += field960;
                                                    }
                                                }
                                                if (field1062 < -50) {
                                                    field1064 = 2;
                                                }
                                                if (field1062 > 50) {
                                                    field1064 = -2;
                                                }
                                                if (field957 < -55) {
                                                    field958 = 2;
                                                }
                                                if (field957 > 55) {
                                                    field958 = -2;
                                                }
                                                if (field959 < -40) {
                                                    field960 = 1;
                                                }
                                                if (field959 > 40) {
                                                    field960 = -1;
                                                }
                                                field966++;
                                                if (field966 > 500) {
                                                    field966 = 0;
                                                    int var76 = (int) (Math.random() * 8.0D);
                                                    if ((var76 & 0x1) == 1) {
                                                        field991 += field963;
                                                    }
                                                    if ((var76 & 0x2) == 2) {
                                                        field964 += field965;
                                                    }
                                                }
                                                if (field991 < -60) {
                                                    field963 = 2;
                                                }
                                                if (field991 > 60) {
                                                    field963 = -2;
                                                }
                                                if (field964 < -20) {
                                                    field965 = 1;
                                                }
                                                if (field964 > 10) {
                                                    field965 = -1;
                                                }
                                                for (class68 var77 = (class68) field1129.method3406(); var77 != null; var77 = (class68) field1129.method3407()) {
                                                    if ((long) var77.field809 < class176.method3821() / 1000L - 5L) {
                                                        if (var77.field807 > 0) {
                                                            class99.method2696(5, "", var77.field808 + class226.field2989);
                                                        }
                                                        if (var77.field807 == 0) {
                                                            class99.method2696(5, "", var77.field808 + class226.field2973);
                                                        }
                                                        var77.method3415();
                                                    }
                                                }
                                                field939++;
                                                if (field939 > 50) {
                                                    field933.method3179(103);
                                                }
                                                try {
                                                    if (Statics.field304 != null && field933.field2384 > 0) {
                                                        Statics.field304.method2769(field933.field2387, 0, field933.field2384);
                                                        field933.field2384 = 0;
                                                        field939 = 0;
                                                    }
                                                } catch (IOException var79) {
                                                    if (field987 > 0) {
                                                        method1568();
                                                    } else {
                                                        method54(40);
                                                        Statics.field1524 = Statics.field304;
                                                        Statics.field304 = null;
                                                    }
                                                }
                                                return;
                                            }
                                            var57 = var56.field817;
                                            if (var57.field2644 < 0) {
                                                break;
                                            }
                                            var58 = class217.method4432(var57.field2675);
                                        } while (var58 == null || var58.field2747 == null || var57.field2644 >= var58.field2747.length || var58.field2747[var57.field2644] != var57);
                                        class84.method2306(var56);
                                    }
                                }
                                var54 = var53.field817;
                                if (var54.field2644 < 0) {
                                    break;
                                }
                                var55 = class217.method4432(var54.field2675);
                            } while (var55 == null || var55.field2747 == null || var54.field2644 >= var55.field2747.length || var55.field2747[var54.field2644] != var54);
                            class84.method2306(var53);
                        }
                    }
                    var51 = var50.field817;
                    if (var51.field2644 < 0) {
                        break;
                    }
                    var52 = class217.method4432(var51.field2675);
                } while (var52 == null || var52.field2747 == null || var51.field2644 >= var52.field2747.length || var52.field2747[var51.field2644] != var51);
                class84.method2306(var50);
            }
        } else if (field987 > 0) {
            method1568();
        } else {
            method54(40);
            Statics.field1524 = Statics.field304;
            Statics.field304 = null;
        }
    }

    @ObfuscatedName("bx.fx(I)V")
    public static final void method1027() {
        if (Statics.field813 != null) {
            Statics.field813.method1888();
        }
        if (Statics.field612 != null) {
            Statics.field612.method1888();
        }
    }

    @ObfuscatedName("bd.fk(Lje;IIII)V")
    public static void method694(class261 arg0, int arg1, int arg2, int arg3) {
        if (field1132 >= 50 || field1131 == 0 || arg0.field3604 == null || arg1 >= arg0.field3604.length) {
            return;
        }
        int var4 = arg0.field3604[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1133[field1132] = var5;
        field1010[field1132] = var6;
        field1135[field1132] = 0;
        field1137[field1132] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1136[field1132] = (var8 << 16) + (var9 << 8) + var7;
        field1132++;
    }

    @ObfuscatedName("l.ff(I)V")
    public static final void method31() {
        if (Statics.field3606 != field1118) {
            field1118 = Statics.field3606;
            method4836(Statics.field3606);
        }
    }

    @ObfuscatedName("ae.fm(I)V")
    public static final void method470() {
        int var0 = Statics.field1400 * 128 + 64;
        int var1 = Statics.field853 * 128 + 64;
        int var2 = method1028(var0, var1, Statics.field3606) - Statics.field1478;
        if (Statics.field275 < var0) {
            Statics.field275 += Statics.field392 * (var0 - Statics.field275) / 1000 + Statics.field548;
            if (Statics.field275 > var0) {
                Statics.field275 = var0;
            }
        }
        if (Statics.field275 > var0) {
            Statics.field275 -= Statics.field392 * (Statics.field275 - var0) / 1000 + Statics.field548;
            if (Statics.field275 < var0) {
                Statics.field275 = var0;
            }
        }
        if (Statics.field537 < var2) {
            Statics.field537 += Statics.field392 * (var2 - Statics.field537) / 1000 + Statics.field548;
            if (Statics.field537 > var2) {
                Statics.field537 = var2;
            }
        }
        if (Statics.field537 > var2) {
            Statics.field537 -= Statics.field392 * (Statics.field537 - var2) / 1000 + Statics.field548;
            if (Statics.field537 < var2) {
                Statics.field537 = var2;
            }
        }
        if (Statics.field277 < var1) {
            Statics.field277 += Statics.field392 * (var1 - Statics.field277) / 1000 + Statics.field548;
            if (Statics.field277 > var1) {
                Statics.field277 = var1;
            }
        }
        if (Statics.field277 > var1) {
            Statics.field277 -= Statics.field392 * (Statics.field277 - var1) / 1000 + Statics.field548;
            if (Statics.field277 < var1) {
                Statics.field277 = var1;
            }
        }
        int var3 = Statics.field297 * 128 + 64;
        int var4 = Statics.field2354 * 128 + 64;
        int var5 = method1028(var3, var4, Statics.field3606) - Statics.field3543;
        int var6 = var3 - Statics.field275;
        int var7 = var5 - Statics.field537;
        int var8 = var4 - Statics.field277;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field503 < var10) {
            Statics.field503 += Statics.field1501 * (var10 - Statics.field503) / 1000 + Statics.field2293;
            if (Statics.field503 > var10) {
                Statics.field503 = var10;
            }
        }
        if (Statics.field503 > var10) {
            Statics.field503 -= Statics.field1501 * (Statics.field503 - var10) / 1000 + Statics.field2293;
            if (Statics.field503 < var10) {
                Statics.field503 = var10;
            }
        }
        int var12 = var11 - Statics.field3308;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field3308 += Statics.field1501 * var12 / 1000 + Statics.field2293;
            Statics.field3308 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field3308 -= Statics.field1501 * -var12 / 1000 + Statics.field2293;
            Statics.field3308 &= 0x7FF;
        }
        int var13 = var11 - Statics.field3308;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field3308 = var11;
        }
    }

    @ObfuscatedName("bi.fu(I)V")
    public static final void method943() {
        int var0 = field1062 + Statics.field308.field1247;
        int var1 = field957 + Statics.field308.field1200;
        if (Statics.field488 - var0 < -500 || Statics.field488 - var0 > 500 || Statics.field440 - var1 < -500 || Statics.field440 - var1 > 500) {
            Statics.field488 = var0;
            Statics.field440 = var1;
        }
        if (Statics.field488 != var0) {
            Statics.field488 += (var0 - Statics.field488) / 16;
        }
        if (Statics.field440 != var1) {
            Statics.field440 += (var1 - Statics.field440) / 16;
        }
        if (class60.field733 == 4 && Statics.field2179) {
            int var2 = class60.field723 * -113761157 - field1005 * -113761157;
            field1030 = var2 * 2;
            field1005 = (var2 == -1 || var2 == 1 ? class60.field723 * -113761157 : (field1005 * -113761157 + class60.field723 * -113761157) / 2) * 150870707;
            int var3 = field978 - class60.field722;
            field976 = var3 * 2;
            field978 = var3 == -1 || var3 == 1 ? class60.field722 : (field978 + class60.field722) / 2;
        } else {
            if (class51.field625[96]) {
                field976 += (-24 - field976) / 2;
            } else if (class51.field625[97]) {
                field976 += (24 - field976) / 2;
            } else {
                field976 /= 2;
            }
            if (class51.field625[98]) {
                field1030 += (12 - field1030) / 2;
            } else if (class51.field625[99]) {
                field1030 += (-12 - field1030) / 2;
            } else {
                field1030 /= 2;
            }
            field1005 = class60.field723;
            field978 = class60.field722;
        }
        field1158 = field976 / 2 + field1158 & 0x7FF;
        field974 += field1030 / 2;
        if (field974 < 128) {
            field974 = 128;
        }
        if (field974 > 383) {
            field974 = 383;
        }
        int var4 = Statics.field488 >> 7;
        int var5 = Statics.field440 >> 7;
        int var6 = method1028(Statics.field488, Statics.field440, Statics.field3606);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field3606;
                    if (var10 < 3 && (class62.field742[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class62.field745[var10][var8][var9];
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
        if (var12 > field983) {
            field983 += (var12 - field983) / 24;
        } else if (var12 < field983) {
            field983 += (var12 - field983) / 80;
        }
    }

    @ObfuscatedName("n.fy(I)V")
    public static final void method140() {
        int var0 = class97.field1490;
        int[] var1 = class97.field1497;
        for (int var2 = 0; var2 < var0; var2++) {
            class75 var3 = field1032[var1[var2]];
            if (var3 != null) {
                method142(var3, 1);
            }
        }
    }

    @ObfuscatedName("al.fq(I)V")
    public static final void method641() {
        for (int var0 = 0; var0 < field929; var0++) {
            int var1 = field1014[var0];
            class87 var2 = field928[var1];
            if (var2 != null) {
                method142(var2, var2.field1354.field3549);
            }
        }
    }

    @ObfuscatedName("y.fw(Lch;II)V")
    public static final void method142(class79 arg0, int arg1) {
        if (arg0.field1245 > field900) {
            int var2 = arg0.field1245 - field900;
            int var3 = arg0.field1203 * 64 + arg0.field1199 * 128;
            int var4 = arg0.field1243 * 128 + arg0.field1203 * 64;
            arg0.field1247 += (var3 - arg0.field1247) / var2;
            arg0.field1200 += (var4 - arg0.field1200) / var2;
            arg0.field1258 = 0;
            arg0.field1248 = arg0.field1202;
        } else if (arg0.field1225 >= field900) {
            method989(arg0);
        } else {
            arg0.field1222 = arg0.field1204;
            if (arg0.field1253 == 0) {
                arg0.field1258 = 0;
            } else {
                label418: {
                    if (arg0.field1241 != -1 && arg0.field1233 == 0) {
                        class261 var5 = class261.method2856(arg0.field1241);
                        if (arg0.field1237 > 0 && var5.field3610 == 0) {
                            arg0.field1258++;
                            break label418;
                        }
                        if (arg0.field1237 <= 0 && var5.field3611 == 0) {
                            arg0.field1258++;
                            break label418;
                        }
                    }
                    int var6 = arg0.field1247;
                    int var7 = arg0.field1200;
                    int var8 = arg0.field1254[arg0.field1253 - 1] * 128 + arg0.field1203 * 64;
                    int var9 = arg0.field1255[arg0.field1253 - 1] * 128 + arg0.field1203 * 64;
                    if (var6 < var8) {
                        if (var7 < var9) {
                            arg0.field1248 = 1280;
                        } else if (var7 > var9) {
                            arg0.field1248 = 1792;
                        } else {
                            arg0.field1248 = 1536;
                        }
                    } else if (var6 > var8) {
                        if (var7 < var9) {
                            arg0.field1248 = 768;
                        } else if (var7 > var9) {
                            arg0.field1248 = 256;
                        } else {
                            arg0.field1248 = 512;
                        }
                    } else if (var7 < var9) {
                        arg0.field1248 = 1024;
                    } else if (var7 > var9) {
                        arg0.field1248 = 0;
                    }
                    byte var10 = arg0.field1256[arg0.field1253 - 1];
                    if (var8 - var6 <= 256 && var8 - var6 >= -256 && var9 - var7 <= 256 && var9 - var7 >= -256) {
                        int var11 = arg0.field1248 - arg0.field1201 & 0x7FF;
                        if (var11 > 1024) {
                            var11 -= 2048;
                        }
                        int var12 = arg0.field1252;
                        if (var11 >= -256 && var11 <= 256) {
                            var12 = arg0.field1228;
                        } else if (var11 >= 256 && var11 < 768) {
                            var12 = arg0.field1227;
                        } else if (var11 >= -768 && var11 <= -256) {
                            var12 = arg0.field1209;
                        }
                        if (var12 == -1) {
                            var12 = arg0.field1228;
                        }
                        arg0.field1222 = var12;
                        int var13 = 4;
                        boolean var14 = true;
                        if (arg0 instanceof class87) {
                            var14 = ((class87) arg0).field1354.field3577;
                        }
                        if (var14) {
                            if (arg0.field1248 != arg0.field1201 && arg0.field1219 == -1 && arg0.field1210 != 0) {
                                var13 = 2;
                            }
                            if (arg0.field1253 > 2) {
                                var13 = 6;
                            }
                            if (arg0.field1253 > 3) {
                                var13 = 8;
                            }
                            if (arg0.field1258 > 0 && arg0.field1253 > 1) {
                                var13 = 8;
                                arg0.field1258--;
                            }
                        } else {
                            if (arg0.field1253 > 1) {
                                var13 = 6;
                            }
                            if (arg0.field1253 > 2) {
                                var13 = 8;
                            }
                            if (arg0.field1258 > 0 && arg0.field1253 > 1) {
                                var13 = 8;
                                arg0.field1258--;
                            }
                        }
                        if (var10 == 2) {
                            var13 <<= 0x1;
                        }
                        if (var13 >= 8 && arg0.field1228 == arg0.field1222 && arg0.field1211 != -1) {
                            arg0.field1222 = arg0.field1211;
                        }
                        if (var6 != var8 || var7 != var9) {
                            if (var6 < var8) {
                                arg0.field1247 += var13;
                                if (arg0.field1247 > var8) {
                                    arg0.field1247 = var8;
                                }
                            } else if (var6 > var8) {
                                arg0.field1247 -= var13;
                                if (arg0.field1247 < var8) {
                                    arg0.field1247 = var8;
                                }
                            }
                            if (var7 < var9) {
                                arg0.field1200 += var13;
                                if (arg0.field1200 > var9) {
                                    arg0.field1200 = var9;
                                }
                            } else if (var7 > var9) {
                                arg0.field1200 -= var13;
                                if (arg0.field1200 < var9) {
                                    arg0.field1200 = var9;
                                }
                            }
                        }
                        if (arg0.field1247 == var8 && arg0.field1200 == var9) {
                            arg0.field1253--;
                            if (arg0.field1237 > 0) {
                                arg0.field1237--;
                            }
                        }
                    } else {
                        arg0.field1247 = var8;
                        arg0.field1200 = var9;
                        arg0.field1253--;
                        if (arg0.field1237 > 0) {
                            arg0.field1237--;
                        }
                    }
                }
            }
        }
        if (arg0.field1247 < 128 || arg0.field1200 < 128 || arg0.field1247 >= 13184 || arg0.field1200 >= 13184) {
            arg0.field1241 = -1;
            arg0.field1236 = -1;
            arg0.field1245 = 0;
            arg0.field1225 = 0;
            arg0.field1247 = arg0.field1254[0] * 128 + arg0.field1203 * 64;
            arg0.field1200 = arg0.field1255[0] * 128 + arg0.field1203 * 64;
            arg0.method1422();
        }
        if (Statics.field308 == arg0 && (arg0.field1247 < 1536 || arg0.field1200 < 1536 || arg0.field1247 >= 11776 || arg0.field1200 >= 11776)) {
            arg0.field1241 = -1;
            arg0.field1236 = -1;
            arg0.field1245 = 0;
            arg0.field1225 = 0;
            arg0.field1247 = arg0.field1254[0] * 128 + arg0.field1203 * 64;
            arg0.field1200 = arg0.field1255[0] * 128 + arg0.field1203 * 64;
            arg0.method1422();
        }
        if (arg0.field1210 != 0) {
            if (arg0.field1219 != -1) {
                class79 var15 = null;
                if (arg0.field1219 < 32768) {
                    var15 = field928[arg0.field1219];
                } else if (arg0.field1219 >= 32768) {
                    var15 = field1032[arg0.field1219 - 32768];
                }
                if (var15 != null) {
                    int var16 = arg0.field1247 - var15.field1247;
                    int var17 = arg0.field1200 - var15.field1200;
                    if (var16 != 0 || var17 != 0) {
                        arg0.field1248 = (int) (Math.atan2((double) var16, (double) var17) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1250) {
                    arg0.field1219 = -1;
                    arg0.field1250 = false;
                }
            }
            if (arg0.field1231 != -1 && (arg0.field1253 == 0 || arg0.field1258 > 0)) {
                arg0.field1248 = arg0.field1231;
                arg0.field1231 = -1;
            }
            int var18 = arg0.field1248 - arg0.field1201 & 0x7FF;
            if (var18 == 0 && arg0.field1250) {
                arg0.field1219 = -1;
                arg0.field1250 = false;
            }
            if (var18 == 0) {
                arg0.field1251 = 0;
            } else {
                arg0.field1251++;
                if (var18 > 1024) {
                    arg0.field1201 -= arg0.field1210;
                    boolean var19 = true;
                    if (var18 < arg0.field1210 || var18 > 2048 - arg0.field1210) {
                        arg0.field1201 = arg0.field1248;
                        var19 = false;
                    }
                    if (arg0.field1222 == arg0.field1204 && (arg0.field1251 > 25 || var19)) {
                        if (arg0.field1205 == -1) {
                            arg0.field1222 = arg0.field1228;
                        } else {
                            arg0.field1222 = arg0.field1205;
                        }
                    }
                } else {
                    arg0.field1201 += arg0.field1210;
                    boolean var20 = true;
                    if (var18 < arg0.field1210 || var18 > 2048 - arg0.field1210) {
                        arg0.field1201 = arg0.field1248;
                        var20 = false;
                    }
                    if (arg0.field1222 == arg0.field1204 && (arg0.field1251 > 25 || var20)) {
                        if (arg0.field1206 == -1) {
                            arg0.field1222 = arg0.field1228;
                        } else {
                            arg0.field1222 = arg0.field1206;
                        }
                    }
                }
                arg0.field1201 &= 0x7FF;
            }
        }
        arg0.field1208 = false;
        if (arg0.field1222 != -1) {
            class261 var22 = class261.method2856(arg0.field1222);
            if (var22 == null || var22.field3607 == null) {
                arg0.field1222 = -1;
            } else {
                arg0.field1230++;
                if (arg0.field1242 < var22.field3607.length && arg0.field1230 > var22.field3596[arg0.field1242]) {
                    arg0.field1230 = 1;
                    arg0.field1242++;
                    method694(var22, arg0.field1242, arg0.field1247, arg0.field1200);
                }
                if (arg0.field1242 >= var22.field3607.length) {
                    arg0.field1230 = 0;
                    arg0.field1242 = 0;
                    method694(var22, arg0.field1242, arg0.field1247, arg0.field1200);
                }
            }
        }
        if (arg0.field1236 != -1 && field900 >= arg0.field1207) {
            if (arg0.field1229 < 0) {
                arg0.field1229 = 0;
            }
            int var23 = class246.method3468(arg0.field1236).field3320;
            if (var23 == -1) {
                arg0.field1236 = -1;
            } else {
                class261 var24 = class261.method2856(var23);
                if (var24 == null || var24.field3607 == null) {
                    arg0.field1236 = -1;
                } else {
                    arg0.field1238++;
                    if (arg0.field1229 < var24.field3607.length && arg0.field1238 > var24.field3596[arg0.field1229]) {
                        arg0.field1238 = 1;
                        arg0.field1229++;
                        method694(var24, arg0.field1229, arg0.field1247, arg0.field1200);
                    }
                    if (arg0.field1229 >= var24.field3607.length && (arg0.field1229 < 0 || arg0.field1229 >= var24.field3607.length)) {
                        arg0.field1236 = -1;
                    }
                }
            }
        }
        if (arg0.field1241 != -1 && arg0.field1233 <= 1) {
            class261 var25 = class261.method2856(arg0.field1241);
            if (var25.field3610 == 1 && arg0.field1237 > 0 && arg0.field1245 <= field900 && arg0.field1225 < field900) {
                arg0.field1233 = 1;
                return;
            }
        }
        if (arg0.field1241 != -1 && arg0.field1233 == 0) {
            class261 var26 = class261.method2856(arg0.field1241);
            if (var26 == null || var26.field3607 == null) {
                arg0.field1241 = -1;
            } else {
                arg0.field1221++;
                if (arg0.field1232 < var26.field3607.length && arg0.field1221 > var26.field3596[arg0.field1232]) {
                    arg0.field1221 = 1;
                    arg0.field1232++;
                    method694(var26, arg0.field1232, arg0.field1247, arg0.field1200);
                }
                if (arg0.field1232 >= var26.field3607.length) {
                    arg0.field1232 -= var26.field3603;
                    arg0.field1235++;
                    if (arg0.field1235 >= var26.field3609) {
                        arg0.field1241 = -1;
                    } else if (arg0.field1232 >= 0 && arg0.field1232 < var26.field3607.length) {
                        method694(var26, arg0.field1232, arg0.field1247, arg0.field1200);
                    } else {
                        arg0.field1241 = -1;
                    }
                }
                arg0.field1208 = var26.field3605;
            }
        }
        if (arg0.field1233 > 0) {
            arg0.field1233--;
        }
    }

    @ObfuscatedName("bn.fj(Lch;B)V")
    public static final void method989(class79 arg0) {
        if (field900 == arg0.field1225 || arg0.field1241 == -1 || arg0.field1233 != 0 || arg0.field1221 + 1 > class261.method2856(arg0.field1241).field3596[arg0.field1232]) {
            int var1 = arg0.field1225 - arg0.field1245;
            int var2 = field900 - arg0.field1245;
            int var3 = arg0.field1203 * 64 + arg0.field1199 * 128;
            int var4 = arg0.field1243 * 128 + arg0.field1203 * 64;
            int var5 = arg0.field1226 * 128 + arg0.field1203 * 64;
            int var6 = arg0.field1244 * 128 + arg0.field1203 * 64;
            arg0.field1247 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1200 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1258 = 0;
        arg0.field1248 = arg0.field1202;
        arg0.field1201 = arg0.field1248;
    }

    @ObfuscatedName("aa.fh(B)V")
    public static void method646() {
        if (Statics.field1326 != null) {
            Statics.field1326.method4886(Statics.field3606, (Statics.field308.field1247 >> 7) + Statics.field2304, (Statics.field308.field1200 >> 7) + Statics.field2147, false);
            Statics.field1326.method4899();
        }
    }

    @ObfuscatedName("as.fv(Lbj;IIB)V")
    public static void method573(class75 arg0, int arg1, int arg2) {
        if (arg0.field1241 == arg1 && arg1 != -1) {
            int var3 = class261.method2856(arg1).field3612;
            if (var3 == 1) {
                arg0.field1232 = 0;
                arg0.field1221 = 0;
                arg0.field1233 = arg2;
                arg0.field1235 = 0;
            }
            if (var3 == 2) {
                arg0.field1235 = 0;
            }
        } else if (arg1 == -1 || arg0.field1241 == -1 || class261.method2856(arg1).field3598 >= class261.method2856(arg0.field1241).field3598) {
            arg0.field1241 = arg1;
            arg0.field1232 = 0;
            arg0.field1221 = 0;
            arg0.field1233 = arg2;
            arg0.field1235 = 0;
            arg0.field1237 = arg0.field1253;
        }
    }

    @ObfuscatedName("g.fz(B)I")
    public static int method9() {
        return field1105 ? 2 : 1;
    }

    @ObfuscatedName("client.f(B)V")
    public final void method757() {
        field1104 = class176.method3821() + 500L;
        this.method1086();
        if (field1051 != -1) {
            this.method1078(true);
        }
    }

    @ObfuscatedName("client.fa(I)V")
    public void method1086() {
        int var1 = Statics.field3627;
        int var2 = Statics.field321;
        if (this.field693 < var1) {
            int var3 = this.field693;
        }
        if (this.field687 < var2) {
            int var4 = this.field687;
        }
        if (Statics.field1990 == null) {
            return;
        }
        try {
            client var5 = Statics.field357;
            Object[] var6 = new Object[] { method9() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.fe(I)V")
    public final void method1087() {
        if (field1051 != -1) {
            method4150(field1051);
        }
        for (int var1 = 0; var1 < field1094; var1++) {
            if (field1096[var1]) {
                field1097[var1] = true;
            }
            field1098[var1] = field1096[var1];
            field1096[var1] = false;
        }
        field1095 = field900;
        field1144 = -1;
        field1041 = -1;
        Statics.field748 = null;
        if (field1051 != -1) {
            field1094 = 0;
            method59(field1051, 0, 0, Statics.field3627, Statics.field321, 0, 0, -1);
        }
        class282.method4643();
        if (field1029) {
            int var6 = Statics.field2203;
            int var7 = Statics.field3789;
            int var8 = Statics.field3380;
            int var9 = Statics.field1752;
            int var10 = 6116423;
            class282.method4676(var6, var7, var8, var9, var10);
            class282.method4676(var6 + 1, var7 + 1, var8 - 2, 16, 0);
            class282.method4646(var6 + 1, var7 + 18, var8 - 2, var9 - 19, 0);
            Statics.field532.method4523(class226.field2848, var6 + 3, var7 + 14, var10, -1);
            int var11 = class60.field722;
            int var12 = class60.field723 * -113761157;
            for (int var13 = 0; var13 < field961; var13++) {
                int var14 = (field961 - 1 - var13) * 15 + var7 + 31;
                int var15 = 16777215;
                if (var11 > var6 && var11 < var6 + var8 && var12 > var14 - 13 && var12 < var14 + 3) {
                    var15 = 16776960;
                }
                Statics.field532.method4523(method606(var13), var6 + 3, var14, var15, 0);
            }
            method1748(Statics.field2203, Statics.field3789, Statics.field3380, Statics.field1752);
        } else if (field1144 != -1) {
            int var2 = field1144;
            int var3 = field1041;
            if (field961 >= 2 || field1044 != 0 || field1046) {
                int var4 = method1567();
                String var5;
                if (field1044 == 1 && field961 < 2) {
                    var5 = class226.field2992 + class226.field3070 + field1143 + " " + class89.field1374;
                } else if (field1046 && field961 < 2) {
                    var5 = field1049 + class226.field3070 + field1050 + " " + class89.field1374;
                } else {
                    var5 = method606(var4);
                }
                if (field961 > 2) {
                    var5 = var5 + class89.method1488(16777215) + " " + '/' + " " + (field961 - 2) + class226.field2996;
                }
                Statics.field532.method4461(var5, var2 + 4, var3 + 15, 16777215, 0, field900 / 1000);
            }
        }
        if (field1103 == 3) {
            for (int var16 = 0; var16 < field1094; var16++) {
                if (field1098[var16]) {
                    class282.method4682(field1099[var16], field992[var16], field1101[var16], field1102[var16], 16711935, 128);
                } else if (field1097[var16]) {
                    class282.method4682(field1099[var16], field992[var16], field1101[var16], field1102[var16], 16711680, 128);
                }
            }
        }
        Statics.method2862(Statics.field3606, Statics.field308.field1247, Statics.field308.field1200, field967);
        field967 = 0;
    }

    @ObfuscatedName("aj.fi(Ljava/lang/String;ZB)V")
    public static final void method318(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field846.method4450(arg0, 250);
        int var6 = Statics.field846.method4478(arg0, 250) * 13;
        class282.method4676(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class282.method4646(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field846.method4457(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method574(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field542.method738(0, 0);
        } else {
            method1748(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("client.fd(IIIIZI)V")
    public static final void method1394(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1145 - field901) * var5 / 100 + field901;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1150) {
            short var8 = field1150;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1149) {
                var6 = field1149;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class282.method4643();
                    class282.method4676(arg0, arg1, var10, arg3, -16777216);
                    class282.method4676(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field915) {
            short var11 = field915;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field1148) {
                var6 = field1148;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class282.method4643();
                    class282.method4676(arg0, arg1, arg2, var13, -16777216);
                    class282.method4676(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1122 - field943) * var5 / 100 + field943;
        field1156 = arg3 * var6 * var14 / 85504 << 1;
        if (field1154 != arg2 || field1155 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class137.field2021[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class140.method2572(var15, 500, 800, arg2, arg3);
        }
        field1152 = arg0;
        field1092 = arg1;
        field1154 = arg2;
        field1155 = arg3;
    }

    @ObfuscatedName("j.fs(Lbm;I)V")
    public static final void method79(class67 arg0) {
        if (Statics.field308.field1247 >> 7 == field1123 && Statics.field308.field1200 >> 7 == field1124) {
            field1123 = 0;
        }
        int var1 = class97.field1490;
        int[] var2 = class97.field1497;
        int var3 = var1;
        if (class67.field803 == arg0 || class67.field800 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class75 var5;
            int var6;
            if (class67.field803 == arg0) {
                var5 = Statics.field308;
                var6 = Statics.field308.field876 << 14;
            } else if (class67.field800 == arg0) {
                var5 = field1032[field1107];
                var6 = field1107 << 14;
            } else {
                var5 = field1032[var2[var4]];
                var6 = var2[var4] << 14;
                if (class67.field802 == arg0 && field1107 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method1057() && !var5.field868) {
                var5.field872 = false;
                if ((field896 && var1 > 50 || var1 > 200) && class67.field803 != arg0 && var5.field1222 == var5.field1204) {
                    var5.field872 = true;
                }
                int var7 = var5.field1247 >> 7;
                int var8 = var5.field1200 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field867 == null || field900 < var5.field860 || field900 >= var5.field874) {
                        if ((var5.field1247 & 0x7F) == 64 && (var5.field1200 & 0x7F) == 64) {
                            if (field1153 == field891[var7][var8]) {
                                continue;
                            }
                            field891[var7][var8] = field1153;
                        }
                        var5.field863 = method1028(var5.field1247, var5.field1200, Statics.field3606);
                        Statics.field596.method2555(Statics.field3606, var5.field1247, var5.field1200, var5.field863, 60, var5, var5.field1201, var6, var5.field1208);
                    } else {
                        var5.field872 = false;
                        var5.field863 = method1028(var5.field1247, var5.field1200, Statics.field3606);
                        Statics.field596.method2504(Statics.field3606, var5.field1247, var5.field1200, var5.field863, 60, var5, var5.field1201, var6, var5.field857, var5.field861, var5.field870, var5.field871);
                    }
                }
            }
        }
    }

    @ObfuscatedName("t.fn(ZI)V")
    public static final void method11(boolean arg0) {
        for (int var1 = 0; var1 < field929; var1++) {
            class87 var2 = field928[field1014[var1]];
            int var3 = (field1014[var1] << 14) + 536870912;
            if (var2 != null && var2.method1057() && var2.field1354.field3571 == arg0 && var2.field1354.method4346()) {
                int var4 = var2.field1247 >> 7;
                int var5 = var2.field1200 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1203 == 1 && (var2.field1247 & 0x7F) == 64 && (var2.field1200 & 0x7F) == 64) {
                        if (field1153 == field891[var4][var5]) {
                            continue;
                        }
                        field891[var4][var5] = field1153;
                    }
                    if (!var2.field1354.field3576) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field596.method2555(Statics.field3606, var2.field1247, var2.field1200, method1028(var2.field1247 + (var2.field1203 * 64 - 64), var2.field1200 + (var2.field1203 * 64 - 64), Statics.field3606), var2.field1203 * 64 - 64 + 60, var2, var2.field1201, var3, var2.field1208);
                }
            }
        }
    }

    @ObfuscatedName("hz.fl(Lch;IIIIII)V")
    public static final void method3651(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1057()) {
            return;
        }
        if (arg0 instanceof class87) {
            class259 var6 = ((class87) arg0).field1354;
            if (var6.field3550 != null) {
                var6 = var6.method4345();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class97.field1490;
        int[] var8 = class97.field1497;
        int var9 = 3;
        if (!arg0.field1224.method3342()) {
            method3725(arg0, arg0.field1249 + 15);
            for (class86 var10 = (class86) arg0.field1224.method3336(); var10 != null; var10 = (class86) arg0.field1224.method3341()) {
                class80 var11 = var10.method1572(field900);
                if (var11 != null) {
                    class249 var12 = var10.field1344;
                    class286 var13 = var12.method4112();
                    class286 var14 = var12.method4111();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3365;
                    } else {
                        if (var12.field3366 * 2 < var14.field3777) {
                            var15 = var12.field3366;
                        }
                        var16 = var14.field3777 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field900 - var11.field1260;
                    int var20 = var11.field1261 * var16 / var12.field3365;
                    int var23;
                    if (var11.field1262 > var19) {
                        int var21 = var12.field3361 == 0 ? 0 : var19 / var12.field3361 * var12.field3361;
                        int var22 = var11.field1259 * var16 / var12.field3365;
                        var23 = (var20 - var22) * var21 / var11.field1262 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1262 + var12.field3360 - var19;
                        if (var12.field3364 >= 0) {
                            var17 = (var24 << 8) / (var12.field3360 - var12.field3364);
                        }
                    }
                    if (var11.field1261 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field996 + arg2 - (var16 >> 1);
                    int var26 = field997 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field996 > -1) {
                            class282.method4676(var25, var26, var23, 5, 65280);
                            class282.method4676(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3774;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method4762(var27, var26, var17);
                            class282.method4633(var27, var26, var27 + var28, var26 + var29);
                            var14.method4762(var27, var26, var17);
                        } else {
                            var13.method4831(var27, var26);
                            class282.method4633(var27, var26, var27 + var28, var26 + var29);
                            var14.method4831(var27, var26);
                        }
                        class282.method4632(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1576()) {
                    var10.method3364();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class75 var30 = (class75) arg0;
            if (var30.field868) {
                return;
            }
            if (var30.field854 != -1 || var30.field879 != -1) {
                method3725(arg0, arg0.field1249 + 15);
                if (field996 > -1) {
                    if (var30.field854 != -1) {
                        Statics.field1384[var30.field854].method4831(field996 + arg2 - 12, field997 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field879 != -1) {
                        Statics.field348[var30.field879].method4831(field996 + arg2 - 12, field997 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field908 == 10 && field910 == var8[arg1]) {
                method3725(arg0, arg0.field1249 + 15);
                if (field996 > -1) {
                    Statics.field262[1].method4831(field996 + arg2 - 12, field997 + arg3 - var9);
                }
            }
        } else {
            class259 var31 = ((class87) arg0).field1354;
            if (var31.field3550 != null) {
                var31 = var31.method4345();
            }
            if (var31.field3558 >= 0 && var31.field3558 < Statics.field348.length) {
                method3725(arg0, arg0.field1249 + 15);
                if (field996 > -1) {
                    Statics.field348[var31.field3558].method4831(field996 + arg2 - 12, field997 + arg3 - 30);
                }
            }
            if (field908 == 1 && field909 == field1014[arg1 - var7] && field900 % 20 < 10) {
                method3725(arg0, arg0.field1249 + 15);
                if (field996 > -1) {
                    Statics.field262[0].method4831(field996 + arg2 - 12, field997 + arg3 - 28);
                }
            }
        }
        if (arg0.field1212 != null && (arg1 >= var7 || !arg0.field1214 && (field1100 == 4 || !arg0.field1213 && (field1100 == 0 || field1100 == 3 || field1100 == 1 && method2764(((class75) arg0).field881, false))))) {
            method3725(arg0, arg0.field1249);
            if (field996 > -1 && field984 < field985) {
                field989[field984] = Statics.field532.method4448(arg0.field1212) / 2;
                field988[field984] = Statics.field532.field3639;
                field986[field984] = field996;
                field911[field984] = field997;
                field1057[field984] = arg0.field1216;
                field926[field984] = arg0.field1217;
                field953[field984] = arg0.field1215;
                field993[field984] = arg0.field1212;
                field984++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1239[var32];
            int var34 = arg0.field1257[var32];
            class255 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field900) {
                    continue;
                }
                var35 = class255.method2697(arg0.field1257[var32]);
                var36 = var35.field3427;
                if (var35 != null && var35.field3425 != null) {
                    var35 = var35.method4190();
                    if (var35 == null) {
                        arg0.field1239[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1234[var32];
            class255 var38 = null;
            if (var37 >= 0) {
                var38 = class255.method2697(var37);
                if (var38 != null && var38.field3425 != null) {
                    var38 = var38.method4190();
                }
            }
            if (var33 - var36 <= field900) {
                if (var35 == null) {
                    arg0.field1239[var32] = -1;
                } else {
                    method3725(arg0, arg0.field1249 / 2);
                    if (field996 > -1) {
                        if (var32 == 1) {
                            field997 -= 20;
                        }
                        if (var32 == 2) {
                            field996 -= 15;
                            field997 -= 10;
                        }
                        if (var32 == 3) {
                            field996 += 15;
                            field997 -= 10;
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
                        class286 var64 = var35.method4189();
                        if (var64 != null) {
                            var43 = var64.field3777;
                            int var65 = var64.field3774;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3775;
                        }
                        class286 var66 = var35.method4205();
                        if (var66 != null) {
                            var44 = var66.field3777;
                            int var67 = var66.field3774;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3775;
                        }
                        class286 var68 = var35.method4194();
                        if (var68 != null) {
                            var45 = var68.field3777;
                            int var69 = var68.field3774;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3775;
                        }
                        class286 var70 = var35.method4195();
                        if (var70 != null) {
                            var46 = var70.field3777;
                            int var71 = var70.field3774;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3775;
                        }
                        if (var38 != null) {
                            var51 = var38.method4189();
                            if (var51 != null) {
                                var55 = var51.field3777;
                                int var72 = var51.field3774;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3775;
                            }
                            var52 = var38.method4205();
                            if (var52 != null) {
                                var56 = var52.field3777;
                                int var73 = var52.field3774;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3775;
                            }
                            var53 = var38.method4194();
                            if (var53 != null) {
                                var57 = var53.field3777;
                                int var74 = var53.field3774;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3775;
                            }
                            var54 = var38.method4195();
                            if (var54 != null) {
                                var58 = var54.field3777;
                                int var75 = var54.field3774;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3775;
                            }
                        }
                        class264 var76 = var35.method4211();
                        if (var76 == null) {
                            var76 = Statics.field16;
                        }
                        class264 var77;
                        if (var38 == null) {
                            var77 = Statics.field16;
                        } else {
                            var77 = var38.method4211();
                            if (var77 == null) {
                                var77 = Statics.field16;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4191(arg0.field1220[var32]);
                        int var83 = var76.method4448(var82);
                        if (var38 != null) {
                            var79 = var38.method4191(arg0.field1223[var32]);
                            var81 = var77.method4448(var79);
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
                        int var100 = arg0.field1239[var32] - field900;
                        int var101 = var35.field3408 - var35.field3408 * var100 / var35.field3427;
                        int var102 = var35.field3407 * var100 / var35.field3427 + -var35.field3407;
                        int var103 = field996 + arg2 - (var92 >> 1) + var101;
                        int var104 = field997 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3424 + var104 + 15;
                        int var108 = var107 - var76.field3640;
                        int var109 = var76.field3637 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3424 + var104 + 15;
                            int var111 = var110 - var77.field3640;
                            int var112 = var77.field3637 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3404 >= 0) {
                            var115 = (var100 << 8) / (var35.field3427 - var35.field3404);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4762(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4762(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4762(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4762(var93 + var103 - var50, var104, var115);
                            }
                            var76.method4508(var82, var90 + var103, var107, var35.field3413, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4762(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4762(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4762(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4762(var97 + var103 - var62, var104, var115);
                                }
                                var77.method4508(var79, var98 + var103, var110, var38.field3413, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method4831(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method4831(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method4831(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method4831(var93 + var103 - var50, var104);
                            }
                            var76.method4523(var82, var90 + var103, var107, var35.field3413 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4831(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method4831(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method4831(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4831(var97 + var103 - var62, var104);
                                }
                                var77.method4523(var79, var98 + var103, var110, var38.field3413 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cr.gd(I)V")
    public static final void method1640() {
        field1015 = 0;
        int var0 = (Statics.field308.field1247 >> 7) + Statics.field2304;
        int var1 = (Statics.field308.field1200 >> 7) + Statics.field2147;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field1015 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field1015 = 1;
        }
        if (field1015 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field1015 = 0;
        }
    }

    @ObfuscatedName("ai.gx(IIIII)V")
    public static final void method504(int arg0, int arg1, int arg2, int arg3) {
        if (field1017 == 1) {
            Statics.field3149[field1000 / 100].method4831(field998 - 8, field999 - 8);
        }
        if (field1017 == 2) {
            Statics.field3149[field1000 / 100 + 4].method4831(field998 - 8, field999 - 8);
        }
        method1640();
    }

    @ObfuscatedName("hx.gi(Lch;IB)V")
    public static final void method3725(class79 arg0, int arg1) {
        Statics.method3931(arg0.field1247, arg0.field1200, arg1);
    }

    @ObfuscatedName("bx.gm(IIIB)I")
    public static final int method1028(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field742[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field745[var5][var3][var4] + class62.field745[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field745[var5][var3][var4 + 1] + class62.field745[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("bi.gz(ZI)V")
    public static final void method939(boolean arg0) {
        field952 = arg0;
        if (!field952) {
            int var1 = field1001.method2976();
            int var2 = field1001.method2967();
            int var3 = field1001.method2932();
            Statics.field340 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field340[var4][var5] = field1001.method2927();
                }
            }
            Statics.field664 = new int[var3];
            Statics.field2318 = new int[var3];
            Statics.field1546 = new int[var3];
            Statics.field462 = new byte[var3][];
            Statics.field620 = new byte[var3][];
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
                        Statics.field664[var7] = var10;
                        Statics.field2318[var7] = Statics.field475.method3851("m" + var8 + "_" + var9);
                        Statics.field1546[var7] = Statics.field475.method3851("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method990(var1, var2, true);
            return;
        }
        int var11 = field1001.method2932();
        boolean var12 = field1001.method2991() == 1;
        int var13 = field1001.method2967();
        int var14 = field1001.method2932();
        field1001.method3185();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field1001.method3186(1);
                    if (var18 == 1) {
                        field1077[var15][var16][var17] = field1001.method3186(26);
                    } else {
                        field1077[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field1001.method3182();
        Statics.field340 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field340[var19][var20] = field1001.method2927();
            }
        }
        Statics.field664 = new int[var14];
        Statics.field2318 = new int[var14];
        Statics.field1546 = new int[var14];
        Statics.field462 = new byte[var14][];
        Statics.field620 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field1077[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field664[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field664[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field2318[var21] = Statics.field475.method3851("m" + var30 + "_" + var31);
                            Statics.field1546[var21] = Statics.field475.method3851("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method990(var11, var13, !var12);
    }

    @ObfuscatedName("bn.gl(IIZB)V")
    public static final void method990(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field647 == arg0 && Statics.field2159 == arg1) {
            return;
        }
        Statics.field647 = arg0;
        Statics.field2159 = arg1;
        method54(25);
        method318(class226.field2852, true);
        int var3 = Statics.field2304;
        int var4 = Statics.field2147;
        Statics.field2304 = (arg0 - 6) * 8;
        Statics.field2147 = (arg1 - 6) * 8;
        int var5 = Statics.field2304 - var3;
        int var6 = Statics.field2147 - var4;
        int var7 = Statics.field2304;
        int var8 = Statics.field2147;
        for (int var9 = 0; var9 < 32768; var9++) {
            class87 var10 = field928[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1254[var11] -= var5;
                    var10.field1255[var11] -= var6;
                }
                var10.field1247 -= var5 * 128;
                var10.field1200 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class75 var13 = field1032[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1254[var14] -= var5;
                    var13.field1255[var14] -= var6;
                }
                var13.field1247 -= var5 * 128;
                var13.field1200 -= var6 * 128;
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
                        field1021[var25][var21][var22] = field1021[var25][var23][var24];
                    } else {
                        field1021[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class77 var26 = (class77) field1022.method3376(); var26 != null; var26 = (class77) field1022.method3377()) {
            var26.field1177 -= var5;
            var26.field1178 -= var6;
            if (var26.field1177 < 0 || var26.field1178 < 0 || var26.field1177 >= 104 || var26.field1178 >= 104) {
                var26.method3364();
            }
        }
        if (field1123 != 0) {
            field1123 -= var5;
            field1124 -= var6;
        }
        field1132 = 0;
        field930 = false;
        field1118 = -1;
        field1024.method3372();
        field1075.method3372();
        for (int var27 = 0; var27 < 4; var27++) {
            field951[var27].method2809();
        }
    }

    @ObfuscatedName("du.gg(ZI)V")
    public static final void method1950(boolean arg0) {
        method1027();
        field939++;
        if (field939 < 50 && !arg0) {
            return;
        }
        field939 = 0;
        if (field944 || Statics.field304 == null) {
            return;
        }
        field933.method3179(103);
        try {
            Statics.field304.method2769(field933.field2387, 0, field933.field2384);
            field933.field2384 = 0;
        } catch (IOException var2) {
            field944 = true;
        }
    }

    @ObfuscatedName("ax.gv(I)V")
    public static final void method321() {
        method1950(false);
        field1045 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field462.length; var1++) {
            if (Statics.field2318[var1] != -1 && Statics.field462[var1] == null) {
                Statics.field462[var1] = Statics.field475.method3836(Statics.field2318[var1], 0);
                if (Statics.field462[var1] == null) {
                    var0 = false;
                    field1045++;
                }
            }
            if (Statics.field1546[var1] != -1 && Statics.field620[var1] == null) {
                Statics.field620[var1] = Statics.field475.method3837(Statics.field1546[var1], 0, Statics.field340[var1]);
                if (Statics.field620[var1] == null) {
                    var0 = false;
                    field1045++;
                }
            }
        }
        if (!var0) {
            field950 = 1;
            return;
        }
        field948 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field462.length; var3++) {
            byte[] var4 = Statics.field620[var3];
            if (var4 != null) {
                int var5 = (Statics.field664[var3] >> 8) * 64 - Statics.field2304;
                int var6 = (Statics.field664[var3] & 0xFF) * 64 - Statics.field2147;
                if (field952) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class174 var9 = new class174(var4);
                int var10 = -1;
                label433: while (true) {
                    int var11 = var9.method2943();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2943();
                            if (var16 == 0) {
                                continue label433;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2930() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class256 var22 = Statics.method564(var10);
                                if (var19 != 22 || !field896 || var22.field3457 != 0 || var22.field3447 == 1 || var22.field3462) {
                                    if (!var22.method4227()) {
                                        field948++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2943();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2930();
                    }
                }
            }
        }
        if (!var2) {
            field950 = 2;
            return;
        }
        if (field950 != 0) {
            method318(class226.field2852 + class89.field1379 + class89.field1372 + 100 + "%" + class89.field1373, true);
        }
        method1027();
        method2902();
        method1027();
        Statics.field596.method2493();
        method1027();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field951[var23].method2809();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class62.field742[var24][var25][var26] = 0;
                }
            }
        }
        method1027();
        class62.field753 = 99;
        Statics.field1404 = new byte[4][104][104];
        Statics.field744 = new byte[4][104][104];
        Statics.field749 = new byte[4][104][104];
        Statics.field750 = new byte[4][104][104];
        Statics.field755 = new int[4][105][105];
        Statics.field316 = new byte[4][105][105];
        Statics.field747 = new int[105][105];
        Statics.field1388 = new int[104];
        Statics.field651 = new int[104];
        Statics.field3372 = new int[104];
        Statics.field265 = new int[104];
        Statics.field746 = new int[104];
        int var27 = Statics.field462.length;
        for (class83 var28 = (class83) class83.field1300.method3376(); var28 != null; var28 = (class83) class83.field1300.method3377()) {
            if (var28.field1299 != null) {
                Statics.field2292.method1755(var28.field1299);
                var28.field1299 = null;
            }
            if (var28.field1304 != null) {
                Statics.field2292.method1755(var28.field1304);
                var28.field1304 = null;
            }
        }
        class83.field1300.method3372();
        method1950(true);
        if (!field952) {
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = (Statics.field664[var29] >> 8) * 64 - Statics.field2304;
                int var31 = (Statics.field664[var29] & 0xFF) * 64 - Statics.field2147;
                byte[] var32 = Statics.field462[var29];
                if (var32 != null) {
                    method1027();
                    class62.method1705(var32, var30, var31, Statics.field647 * 8 - 48, Statics.field2159 * 8 - 48, field951);
                }
            }
            for (int var33 = 0; var33 < var27; var33++) {
                int var34 = (Statics.field664[var33] >> 8) * 64 - Statics.field2304;
                int var35 = (Statics.field664[var33] & 0xFF) * 64 - Statics.field2147;
                byte[] var36 = Statics.field462[var33];
                if (var36 == null && Statics.field2159 < 800) {
                    method1027();
                    class62.method1647(var34, var35, 64, 64);
                }
            }
            method1950(true);
            for (int var37 = 0; var37 < var27; var37++) {
                byte[] var38 = Statics.field620[var37];
                if (var38 != null) {
                    int var39 = (Statics.field664[var37] >> 8) * 64 - Statics.field2304;
                    int var40 = (Statics.field664[var37] & 0xFF) * 64 - Statics.field2147;
                    method1027();
                    class140 var41 = Statics.field596;
                    class162[] var42 = field951;
                    class174 var43 = new class174(var38);
                    int var44 = -1;
                    while (true) {
                        int var45 = var43.method2943();
                        if (var45 == 0) {
                            break;
                        }
                        var44 += var45;
                        int var46 = 0;
                        while (true) {
                            int var47 = var43.method2943();
                            if (var47 == 0) {
                                break;
                            }
                            var46 += var47 - 1;
                            int var48 = var46 & 0x3F;
                            int var49 = var46 >> 6 & 0x3F;
                            int var50 = var46 >> 12;
                            int var51 = var43.method2930();
                            int var52 = var51 >> 2;
                            int var53 = var51 & 0x3;
                            int var54 = var39 + var49;
                            int var55 = var40 + var48;
                            if (var54 > 0 && var55 > 0 && var54 < 103 && var55 < 103) {
                                int var56 = var50;
                                if ((class62.field742[1][var54][var55] & 0x2) == 2) {
                                    var56 = var50 - 1;
                                }
                                class162 var57 = null;
                                if (var56 >= 0) {
                                    var57 = var42[var56];
                                }
                                class62.method469(var50, var54, var55, var44, var53, var52, var41, var57);
                            }
                        }
                    }
                }
            }
        }
        if (field952) {
            for (int var58 = 0; var58 < 4; var58++) {
                method1027();
                for (int var59 = 0; var59 < 13; var59++) {
                    for (int var60 = 0; var60 < 13; var60++) {
                        boolean var61 = false;
                        int var62 = field1077[var58][var59][var60];
                        if (var62 != -1) {
                            int var63 = var62 >> 24 & 0x3;
                            int var64 = var62 >> 1 & 0x3;
                            int var65 = var62 >> 14 & 0x3FF;
                            int var66 = var62 >> 3 & 0x7FF;
                            int var67 = (var65 / 8 << 8) + var66 / 8;
                            for (int var68 = 0; var68 < Statics.field664.length; var68++) {
                                if (Statics.field664[var68] == var67 && Statics.field462[var68] != null) {
                                    class62.method39(Statics.field462[var68], var58, var59 * 8, var60 * 8, var63, (var65 & 0x7) * 8, (var66 & 0x7) * 8, var64, field951);
                                    var61 = true;
                                    break;
                                }
                            }
                        }
                        if (!var61) {
                            class62.method155(var58, var59 * 8, var60 * 8);
                        }
                    }
                }
            }
            for (int var69 = 0; var69 < 13; var69++) {
                for (int var70 = 0; var70 < 13; var70++) {
                    int var71 = field1077[0][var69][var70];
                    if (var71 == -1) {
                        class62.method1647(var69 * 8, var70 * 8, 8, 8);
                    }
                }
            }
            method1950(true);
            for (int var72 = 0; var72 < 4; var72++) {
                method1027();
                for (int var73 = 0; var73 < 13; var73++) {
                    for (int var74 = 0; var74 < 13; var74++) {
                        int var75 = field1077[var72][var73][var74];
                        if (var75 != -1) {
                            int var76 = var75 >> 24 & 0x3;
                            int var77 = var75 >> 1 & 0x3;
                            int var78 = var75 >> 14 & 0x3FF;
                            int var79 = var75 >> 3 & 0x7FF;
                            int var80 = (var78 / 8 << 8) + var79 / 8;
                            for (int var81 = 0; var81 < Statics.field664.length; var81++) {
                                if (Statics.field664[var81] == var80 && Statics.field620[var81] != null) {
                                    class62.method576(Statics.field620[var81], var72, var73 * 8, var74 * 8, var76, (var78 & 0x7) * 8, (var79 & 0x7) * 8, var77, Statics.field596, field951);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method1950(true);
        method2902();
        method1027();
        class62.method1603(Statics.field596, field951);
        method1950(true);
        int var82 = class62.field753;
        if (var82 > Statics.field3606) {
            var82 = Statics.field3606;
        }
        if (var82 < Statics.field3606 - 1) {
            int var83 = Statics.field3606 - 1;
        }
        if (field896) {
            Statics.field596.method2494(class62.field753);
        } else {
            Statics.field596.method2494(0);
        }
        for (int var84 = 0; var84 < 104; var84++) {
            for (int var85 = 0; var85 < 104; var85++) {
                method473(var84, var85);
            }
        }
        method1027();
        method481();
        class256.field3479.method3311();
        if (Statics.field357.method782()) {
            field933.method3179(169);
            field933.method2919(1057001181);
        }
        if (!field952) {
            int var86 = (Statics.field647 - 6) / 8;
            int var87 = (Statics.field647 + 6) / 8;
            int var88 = (Statics.field2159 - 6) / 8;
            int var89 = (Statics.field2159 + 6) / 8;
            for (int var90 = var86 - 1; var90 <= var87 + 1; var90++) {
                for (int var91 = var88 - 1; var91 <= var89 + 1; var91++) {
                    if (var90 < var86 || var90 > var87 || var91 < var88 || var91 > var89) {
                        Statics.field475.method3897("m" + var90 + "_" + var91);
                        Statics.field475.method3897("l" + var90 + "_" + var91);
                    }
                }
            }
        }
        method54(30);
        method1027();
        Statics.method688();
        field933.method3179(49);
        Statics.field3198.method2701();
        for (int var92 = 0; var92 < 32; var92++) {
            field691[var92] = 0L;
        }
        for (int var93 = 0; var93 < 32; var93++) {
            field692[var93] = 0L;
        }
        Statics.field787 = 0;
    }

    @ObfuscatedName("kn.gu(IB)V")
    public static final void method4836(int arg0) {
        int[] var1 = Statics.field2369.field3779;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class62.field742[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field596.method2590(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class62.field742[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field596.method2590(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field2369.method4823();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class62.field742[arg0][var10][var9] & 0x18) == 0) {
                    method2684(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class62.field742[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2684(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1119 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field596.method2520(Statics.field3606, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = Statics.method564(var14).field3458;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field951[Statics.field3606].field2276;
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
                        field1125[field1119] = Statics.field3277[var15].method4014(false);
                        field919[field1119] = var16;
                        field1065[field1119] = var17;
                        field1119++;
                    }
                }
            }
        }
        Statics.field542.method4715();
    }

    @ObfuscatedName("eb.gn(IIIIII)V")
    public static final void method2684(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field596.method2517(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field596.method2680(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2369.field3779;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class256 var13 = Statics.method564(var12);
            if (var13.field3459 == -1) {
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
                class285 var14 = Statics.field1659[var13.field3459];
                if (var14 != null) {
                    int var15 = (var13.field3453 * 4 - var14.field3766) / 2;
                    int var16 = (var13.field3431 * 4 - var14.field3764) / 2;
                    var14.method4725(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3431) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field596.method2605(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field596.method2680(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class256 var22 = Statics.method564(var21);
            if (var22.field3459 != -1) {
                class285 var23 = Statics.field1659[var22.field3459];
                if (var23 != null) {
                    int var24 = (var22.field3453 * 4 - var23.field3766) / 2;
                    int var25 = (var22.field3431 * 4 - var23.field3764) / 2;
                    var23.method4725(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3431) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2369.field3779;
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
        int var29 = Statics.field596.method2520(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class256 var31 = Statics.method564(var30);
        if (var31.field3459 == -1) {
            return;
        }
        class285 var32 = Statics.field1659[var31.field3459];
        if (var32 != null) {
            int var33 = (var31.field3453 * 4 - var32.field3766) / 2;
            int var34 = (var31.field3431 * 4 - var32.field3764) / 2;
            var32.method4725(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3431) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.gq(I)Z")
    public final boolean method1093() {
        if (Statics.field304 == null) {
            return false;
        }
        try {
            int var1 = Statics.field304.method2770();
            if (var1 == 0) {
                return false;
            }
            if (field937 == -1) {
                Statics.field304.method2779(field1001.field2387, 0, 1);
                field1001.field2384 = 0;
                field937 = field1001.method3180();
                field936 = class273.field3686[field937];
                var1--;
            }
            if (field936 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                Statics.field304.method2779(field1001.field2387, 0, 1);
                field936 = field1001.field2387[0] & 0xFF;
                var1--;
            }
            if (field936 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                Statics.field304.method2779(field1001.field2387, 0, 2);
                field1001.field2384 = 0;
                field936 = field1001.method2932();
                var1 -= 2;
            }
            if (var1 < field936) {
                return false;
            }
            field1001.field2384 = 0;
            Statics.field304.method2779(field1001.field2387, 0, field936);
            field938 = 0;
            field979 = field1071;
            field1071 = field1165;
            field1165 = field937;
            if (field937 == 58) {
                class180 var2 = field1001;
                int var3 = field936;
                int var4 = var2.field2384;
                class97.field1488 = 0;
                class97.method988(var2);
                for (int var5 = 0; var5 < class97.field1488; var5++) {
                    int var6 = class97.field1496[var5];
                    class75 var7 = field1032[var6];
                    int var8 = var2.method2930();
                    if ((var8 & 0x4) != 0) {
                        var8 += var2.method2930() << 8;
                    }
                    byte var9 = -1;
                    if ((var8 & 0x20) != 0) {
                        int var10 = var2.method2930();
                        byte[] var11 = new byte[var10];
                        class174 var12 = new class174(var11);
                        var2.method2941(var11, 0, var10);
                        class97.field1487[var6] = var12;
                        var7.method1051(var12);
                    }
                    if ((var8 & 0x40) != 0) {
                        int var13 = var2.method2932();
                        if (var13 == 65535) {
                            var13 = -1;
                        }
                        int var14 = var2.method2930();
                        method573(var7, var13, var14);
                    }
                    if ((var8 & 0x10) != 0) {
                        var7.field1219 = var2.method2932();
                        if (var7.field1219 == 65535) {
                            var7.field1219 = -1;
                        }
                    }
                    if ((var8 & 0x8) != 0) {
                        var7.field1212 = var2.method2938();
                        if (var7.field1212.charAt(0) == '~') {
                            var7.field1212 = var7.field1212.substring(1);
                            class99.method2696(2, var7.field881, var7.field1212);
                        } else if (Statics.field308 == var7) {
                            class99.method2696(2, var7.field881, var7.field1212);
                        }
                        var7.field1213 = false;
                        var7.field1216 = 0;
                        var7.field1217 = 0;
                        var7.field1215 = 150;
                    }
                    if ((var8 & 0x2) != 0) {
                        int var15 = var2.method2930();
                        if (var15 > 0) {
                            for (int var16 = 0; var16 < var15; var16++) {
                                int var17 = -1;
                                int var18 = -1;
                                int var19 = -1;
                                int var20 = var2.method2943();
                                if (var20 == 32767) {
                                    var20 = var2.method2943();
                                    var18 = var2.method2943();
                                    var17 = var2.method2943();
                                    var19 = var2.method2943();
                                } else if (var20 == 32766) {
                                    var20 = -1;
                                } else {
                                    var18 = var2.method2943();
                                }
                                int var21 = var2.method2943();
                                var7.method1406(var20, var18, var17, var19, field900, var21);
                            }
                        }
                        int var22 = var2.method2930();
                        if (var22 > 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                int var24 = var2.method2943();
                                int var25 = var2.method2943();
                                if (var25 == 32767) {
                                    var7.method1408(var24);
                                } else {
                                    int var26 = var2.method2943();
                                    int var27 = var2.method2930();
                                    int var28 = var25 > 0 ? var2.method2930() : var27;
                                    var7.method1407(var24, field900, var25, var26, var27, var28);
                                }
                            }
                        }
                    }
                    if ((var8 & 0x1) != 0) {
                        var7.field1231 = var2.method2932();
                        if (var7.field1253 == 0) {
                            var7.field1248 = var7.field1231;
                            var7.field1231 = -1;
                        }
                    }
                    if ((var8 & 0x80) != 0) {
                        int var29 = var2.method2932();
                        class231 var30 = (class231) class169.method1267(class231.method1015(), var2.method2930());
                        boolean var31 = var2.method2930() == 1;
                        int var32 = var2.method2930();
                        int var33 = var2.field2384;
                        if (var7.field881 != null && var7.field855 != null) {
                            boolean var34 = false;
                            if (var30.field3159 && method146(var7.field881)) {
                                var34 = true;
                            }
                            if (!var34 && field1015 == 0 && !var7.field868) {
                                class97.field1484.field2384 = 0;
                                var2.method2941(class97.field1484.field2387, 0, var32);
                                class97.field1484.field2384 = 0;
                                String var35 = class265.method4452(class271.method3809(class266.method2225(class97.field1484)));
                                var7.field1212 = var35.trim();
                                var7.field1216 = var29 >> 8;
                                var7.field1217 = var29 & 0xFF;
                                var7.field1215 = 150;
                                var7.field1213 = var31;
                                var7.field1214 = Statics.field308 != var7 && var30.field3159 && field1109 != "" && var35.toLowerCase().indexOf(field1109) == -1;
                                int var36;
                                if (var30.field3162) {
                                    var36 = var31 ? 91 : 1;
                                } else {
                                    var36 = var31 ? 90 : 2;
                                }
                                if (var30.field3167 == -1) {
                                    class99.method2696(var36, var7.field881, var35);
                                } else {
                                    class99.method2696(var36, class89.method1013(var30.field3167) + var7.field881, var35);
                                }
                            }
                        }
                        var2.field2384 = var32 + var33;
                    }
                    if ((var8 & 0x1000) != 0) {
                        var7.field1236 = var2.method2932();
                        int var37 = var2.method2927();
                        var7.field1240 = var37 >> 16;
                        var7.field1207 = (var37 & 0xFFFF) + field900;
                        var7.field1229 = 0;
                        var7.field1238 = 0;
                        if (var7.field1207 > field900) {
                            var7.field1229 = -1;
                        }
                        if (var7.field1236 == 65535) {
                            var7.field1236 = -1;
                        }
                    }
                    if ((var8 & 0x400) != 0) {
                        var7.field1199 = var2.method2931();
                        var7.field1243 = var2.method2931();
                        var7.field1226 = var2.method2931();
                        var7.field1244 = var2.method2931();
                        var7.field1245 = var2.method2932() + field900;
                        var7.field1225 = var2.method2932() + field900;
                        var7.field1202 = var2.method2932();
                        if (var7.field877) {
                            var7.field1199 += var7.field878;
                            var7.field1243 += var7.field862;
                            var7.field1226 += var7.field878;
                            var7.field1244 += var7.field862;
                            var7.field1253 = 0;
                        } else {
                            var7.field1199 += var7.field1254[0];
                            var7.field1243 += var7.field1255[0];
                            var7.field1226 += var7.field1254[0];
                            var7.field1244 += var7.field1255[0];
                            var7.field1253 = 1;
                        }
                        var7.field1237 = 0;
                    }
                    if ((var8 & 0x800) != 0) {
                        class97.field1486[var6] = var2.method2931();
                    }
                    if ((var8 & 0x100) != 0) {
                        var9 = var2.method2931();
                    }
                    if ((var8 & 0x200) != 0) {
                        for (int var38 = 0; var38 < 3; var38++) {
                            var7.field858[var38] = var2.method2938();
                        }
                    }
                    if (var7.field877) {
                        if (var9 == 127) {
                            var7.method1055(var7.field878, var7.field862);
                        } else {
                            byte var39;
                            if (var9 == -1) {
                                var39 = class97.field1486[var6];
                            } else {
                                var39 = var9;
                            }
                            var7.method1054(var7.field878, var7.field862, var39);
                        }
                    }
                }
                if (var2.field2384 - var4 != var3) {
                    throw new RuntimeException(var2.field2384 - var4 + " " + var3);
                }
                field937 = -1;
                return true;
            }
            if (field937 == 231) {
                int var40 = field1001.method2930();
                int var41 = field1001.method2930();
                int var42 = field1001.method2930();
                int var43 = field1001.method2930();
                field1139[var40] = true;
                field1140[var40] = var41;
                field1141[var40] = var42;
                field1142[var40] = var43;
                field1167[var40] = 0;
                field937 = -1;
                return true;
            }
            if (field937 == 152) {
                int var44 = field1001.method2927();
                int var45 = field1001.method2976();
                if (var45 == 65535) {
                    var45 = -1;
                }
                int var46 = field1001.method2977();
                int var47 = field1001.method2967();
                if (var47 == 65535) {
                    var47 = -1;
                }
                for (int var48 = var45; var48 <= var47; var48++) {
                    long var49 = ((long) var46 << 32) + (long) var48;
                    class193 var51 = field918.method3331(var49);
                    if (var51 != null) {
                        var51.method3364();
                    }
                    field918.method3333(new class199(var44), var49);
                }
                field937 = -1;
                return true;
            }
            if (field937 == 188) {
                field1018 = field1001.method2930();
                field937 = -1;
                return true;
            }
            if (field937 == 16) {
                field930 = true;
                Statics.field1400 = field1001.method2930();
                Statics.field853 = field1001.method2930();
                Statics.field1478 = field1001.method2932();
                Statics.field548 = field1001.method2930();
                Statics.field392 = field1001.method2930();
                if (Statics.field392 >= 100) {
                    Statics.field275 = Statics.field1400 * 128 + 64;
                    Statics.field277 = Statics.field853 * 128 + 64;
                    Statics.field537 = method1028(Statics.field275, Statics.field277, Statics.field3606) - Statics.field1478;
                }
                field937 = -1;
                return true;
            }
            if (field937 == 122) {
                field907 = field1001.method2920() * 30;
                field1054 = field1076;
                field937 = -1;
                return true;
            }
            if (field937 == 124) {
                method125();
                field1011 = field1001.method2933();
                field1054 = field1076;
                field937 = -1;
                return true;
            }
            if (field937 == 43) {
                while (field1001.field2384 < field936) {
                    int var52 = field1001.method2930();
                    boolean var53 = (var52 & 0x1) == 1;
                    String var54 = field1001.method2938();
                    String var55 = field1001.method2938();
                    field1001.method2938();
                    for (int var56 = 0; var56 < field1161; var56++) {
                        class71 var57 = field1162[var56];
                        if (var53) {
                            if (var55.equals(var57.field832)) {
                                var57.field832 = var54;
                                var57.field828 = var55;
                                var54 = null;
                                break;
                            }
                        } else if (var54.equals(var57.field832)) {
                            var57.field832 = var54;
                            var57.field828 = var55;
                            var54 = null;
                            break;
                        }
                    }
                    if (var54 != null && field1161 < 400) {
                        class71 var58 = new class71();
                        field1162[field1161] = var58;
                        var58.field832 = var54;
                        var58.field828 = var55;
                        field1161++;
                    }
                }
                field1084 = field1076;
                field937 = -1;
                return true;
            }
            if (field937 == 243) {
                for (int var59 = 0; var59 < field1032.length; var59++) {
                    if (field1032[var59] != null) {
                        field1032[var59].field1241 = -1;
                    }
                }
                for (int var60 = 0; var60 < field928.length; var60++) {
                    if (field928[var60] != null) {
                        field928[var60].field1241 = -1;
                    }
                }
                field937 = -1;
                return true;
            }
            if (field937 == 191 || field937 == 178 || field937 == 193 || field937 == 239 || field937 == 130 || field937 == 94 || field937 == 103 || field937 == 19 || field937 == 74 || field937 == 143) {
                method1659();
                field937 = -1;
                return true;
            }
            if (field937 == 61) {
                field1001.field2384 += 28;
                if (field1001.method2964()) {
                    class180 var61 = field1001;
                    int var62 = field1001.field2384 - 28;
                    method1569(var61.field2387, var62);
                    class156.method1716(var61, var62);
                }
                field937 = -1;
                return true;
            }
            if (field937 == 250) {
                method3721(field1001.method2938());
                field937 = -1;
                return true;
            }
            if (field937 == 23) {
                int var63 = field1001.method2932();
                class64 var64 = (class64) class64.field774.method3331((long) var63);
                if (var64 != null) {
                    var64.method3364();
                }
                field1052[++field1080 - 1 & 0x1F] = var63 & 0x7FFF;
                field937 = -1;
                return true;
            }
            if (field937 == 179) {
                int var65 = field1001.method2977();
                int var66 = field1001.method2977();
                class69 var67 = (class69) field1020.method3331((long) var65);
                class69 var68 = (class69) field1020.method3331((long) var66);
                if (var68 != null) {
                    method4603(var68, var67 == null || var67.field814 != var68.field814);
                }
                if (var67 != null) {
                    var67.method3364();
                    field1020.method3333(var67, (long) var66);
                }
                class217 var69 = class217.method4432(var65);
                if (var69 != null) {
                    method3808(var69);
                }
                class217 var70 = class217.method4432(var66);
                if (var70 != null) {
                    method3808(var70);
                    method169(Statics.field1401[var70.field2643 >>> 16], var70, true);
                }
                if (field1051 != -1) {
                    int var71 = field1051;
                    if (class217.method68(var71)) {
                        method1752(Statics.field1401[var71], 1);
                    }
                }
                field937 = -1;
                return true;
            }
            if (field937 == 251) {
                field1123 = field1001.method2930();
                if (field1123 == 255) {
                    field1123 = 0;
                }
                field1124 = field1001.method2930();
                if (field1124 == 255) {
                    field1124 = 0;
                }
                field937 = -1;
                return true;
            }
            if (field937 == 73) {
                int var72 = field1001.method2976();
                int var73 = field1001.method2920();
                int var74 = field1001.method2977();
                class217 var75 = class217.method4432(var74);
                var75.field2699 = (var73 << 16) + var72;
                field937 = -1;
                return true;
            }
            if (field937 == 207) {
                int var76 = field1001.method2967();
                int var77 = field1001.method3041();
                class217 var78 = class217.method4432(var77);
                if (var78.field2686 != 2 || var78.field2687 != var76) {
                    var78.field2686 = 2;
                    var78.field2687 = var76;
                    method3808(var78);
                }
                field937 = -1;
                return true;
            }
            if (field937 == 209) {
                for (int var79 = 0; var79 < Statics.field2317; var79++) {
                    class242 var80 = class242.method1000(var79);
                    if (var80 != null) {
                        class212.field2596[var79] = 0;
                        class212.field2597[var79] = 0;
                    }
                }
                method125();
                field1146 += 32;
                field937 = -1;
                return true;
            }
            if (field937 == 156) {
                Statics.field3278 = field1001.method2958();
                Statics.field1859 = field1001.method2991();
                for (int var81 = Statics.field1859; var81 < Statics.field1859 + 8; var81++) {
                    for (int var82 = Statics.field3278; var82 < Statics.field3278 + 8; var82++) {
                        if (field1021[Statics.field3606][var81][var82] != null) {
                            field1021[Statics.field3606][var81][var82] = null;
                            method473(var81, var82);
                        }
                    }
                }
                for (class77 var83 = (class77) field1022.method3376(); var83 != null; var83 = (class77) field1022.method3377()) {
                    if (var83.field1177 >= Statics.field1859 && var83.field1177 < Statics.field1859 + 8 && var83.field1178 >= Statics.field3278 && var83.field1178 < Statics.field3278 + 8 && Statics.field3606 == var83.field1175) {
                        var83.field1186 = 0;
                    }
                }
                field937 = -1;
                return true;
            }
            if (field937 == 128) {
                method125();
                int var84 = field1001.method3041();
                int var85 = field1001.method2958();
                int var86 = field1001.method2930();
                field977[var86] = var84;
                field1025[var86] = var85;
                field1026[var86] = 1;
                for (int var87 = 0; var87 < 98; var87++) {
                    if (var84 >= class223.field2833[var87]) {
                        field1026[var86] = var87 + 2;
                    }
                }
                field1081[++field1082 - 1 & 0x1F] = var86;
                field937 = -1;
                return true;
            }
            if (field937 == 135) {
                int var88 = field1001.method2932();
                int var89 = field1001.method2930();
                int var90 = field1001.method2932();
                if (field1130 != 0 && var89 != 0 && field1132 < 50) {
                    field1133[field1132] = var88;
                    field1010[field1132] = var89;
                    field1135[field1132] = var90;
                    field1137[field1132] = null;
                    field1136[field1132] = 0;
                    field1132++;
                }
                field937 = -1;
                return true;
            }
            if (field937 == 14) {
                int var94 = field1001.method2970();
                int var95 = field1001.method2971();
                int var96 = field1001.method2927();
                class217 var97 = class217.method4432(var96);
                if (var97.field2652 != var94 || var97.field2664 != var95 || var97.field2648 != 0 || var97.field2649 != 0) {
                    var97.field2652 = var94;
                    var97.field2664 = var95;
                    var97.field2648 = 0;
                    var97.field2649 = 0;
                    method3808(var97);
                    this.method1095(var97);
                    if (var97.field2645 == 0) {
                        method169(Statics.field1401[var96 >> 16], var97, false);
                    }
                }
                field937 = -1;
                return true;
            }
            if (field937 == 22) {
                int var98 = field1001.method2930();
                class277[] var99 = new class277[] { class277.field3725, class277.field3726, class277.field3727 };
                class277[] var100 = var99;
                int var101 = 0;
                class277 var103;
                while (true) {
                    if (var101 >= var100.length) {
                        var103 = null;
                        break;
                    }
                    class277 var102 = var100[var101];
                    if (var102.field3728 == var98) {
                        var103 = var102;
                        break;
                    }
                    var101++;
                }
                Statics.field845 = var103;
                field937 = -1;
                return true;
            }
            if (field937 == 18) {
                method125();
                field1108 = field1001.method2930();
                field1054 = field1076;
                field937 = -1;
                return true;
            }
            if (field937 == 160) {
                if (field1051 != -1) {
                    int var104 = field1051;
                    if (class217.method68(var104)) {
                        method1752(Statics.field1401[var104], 0);
                    }
                }
                field937 = -1;
                return true;
            }
            if (field937 == 218) {
                int var105 = field1001.method2958();
                String var106 = field1001.method2938();
                int var107 = field1001.method2958();
                if (var105 >= 1 && var105 <= 8) {
                    if (var106.equalsIgnoreCase("null")) {
                        var106 = null;
                    }
                    field1063[var105 - 1] = var106;
                    field1023[var105 - 1] = var107 == 0;
                }
                field937 = -1;
                return true;
            }
            if (field937 == 113) {
                int var108 = field1001.method2930();
                if (field1001.method2930() == 0) {
                    field1166[var108] = new class17();
                    field1001.field2384 += 18;
                } else {
                    field1001.field2384--;
                    field1166[var108] = new class17(field1001, false);
                }
                field1086 = field1076;
                field937 = -1;
                return true;
            }
            if (field937 == 235) {
                int var109 = field1001.method2927();
                int var110 = field1001.method2927();
                if (Statics.field356 == null || !Statics.field356.isValid()) {
                    try {
                        Iterator var111 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var111.hasNext()) {
                            GarbageCollectorMXBean var112 = (GarbageCollectorMXBean) var111.next();
                            if (var112.isValid()) {
                                Statics.field356 = var112;
                                field1168 = -1L;
                                field946 = -1L;
                            }
                        }
                    } catch (Throwable var386) {
                    }
                }
                long var114 = class176.method3821();
                int var116 = -1;
                if (Statics.field356 != null) {
                    long var117 = Statics.field356.getCollectionTime();
                    if (field946 != -1L) {
                        long var119 = var117 - field946;
                        long var121 = var114 - field1168;
                        if (var121 != 0L) {
                            var116 = (int) (var119 * 100L / var121);
                        }
                    }
                    field946 = var117;
                    field1168 = var114;
                }
                field933.method3179(24);
                field933.method3031(var116);
                field933.method2954(field686);
                field933.method2973(var109);
                field933.method2919(var110);
                field937 = -1;
                return true;
            }
            if (field937 == 237) {
                boolean var123 = field1001.method2930() == 1;
                int var124 = field1001.method2953();
                class217 var125 = class217.method4432(var124);
                if (var125.field2663 != var123) {
                    var125.field2663 = var123;
                    method3808(var125);
                }
                field937 = -1;
                return true;
            }
            if (field937 == 248) {
                int var126 = field1001.method2927();
                class69 var127 = (class69) field1020.method3331((long) var126);
                if (var127 != null) {
                    method4603(var127, true);
                }
                if (field1055 != null) {
                    method3808(field1055);
                    field1055 = null;
                }
                field937 = -1;
                return true;
            }
            if (field937 == 234) {
                field1127 = field1076;
                if (field936 == 0) {
                    field1116 = null;
                    field1117 = null;
                    Statics.field611 = 0;
                    Statics.field3744 = null;
                    field937 = -1;
                    return true;
                }
                field1117 = field1001.method2938();
                long var128 = field1001.method2949();
                long var130 = var128;
                String var132;
                if (var128 <= 0L || var128 >= 6582952005840035281L) {
                    var132 = null;
                } else if (var128 % 37L == 0L) {
                    var132 = null;
                } else {
                    int var133 = 0;
                    for (long var134 = var128; var134 != 0L; var134 /= 37L) {
                        var133++;
                    }
                    StringBuilder var136 = new StringBuilder(var133);
                    while (var130 != 0L) {
                        long var137 = var130;
                        var130 /= 37L;
                        var136.append(class269.field3670[(int) (var137 - var130 * 37L)]);
                    }
                    var132 = var136.reverse().toString();
                }
                field1116 = var132;
                Statics.field402 = field1001.method2931();
                int var139 = field1001.method2930();
                if (var139 == 255) {
                    field937 = -1;
                    return true;
                }
                Statics.field611 = var139;
                class76[] var140 = new class76[100];
                for (int var141 = 0; var141 < Statics.field611; var141++) {
                    var140[var141] = new class76();
                    var140[var141].field882 = field1001.method2938();
                    var140[var141].field888 = class268.method203(var140[var141].field882, Statics.field424);
                    var140[var141].field884 = field1001.method2932();
                    var140[var141].field885 = field1001.method2931();
                    field1001.method2938();
                    if (var140[var141].field882.equals(Statics.field308.field881)) {
                        Statics.field419 = var140[var141].field885;
                    }
                }
                boolean var142 = false;
                int var143 = Statics.field611;
                while (var143 > 0) {
                    boolean var144 = true;
                    var143--;
                    for (int var145 = 0; var145 < var143; var145++) {
                        if (var140[var145].field888.compareTo(var140[var145 + 1].field888) > 0) {
                            class76 var146 = var140[var145];
                            var140[var145] = var140[var145 + 1];
                            var140[var145 + 1] = var146;
                            var144 = false;
                        }
                    }
                    if (var144) {
                        break;
                    }
                }
                Statics.field3744 = var140;
                field937 = -1;
                return true;
            }
            if (field937 == 225) {
                Statics.field3278 = field1001.method2958();
                Statics.field1859 = field1001.method2930();
                while (field1001.field2384 < field936) {
                    field937 = field1001.method2930();
                    method1659();
                }
                field937 = -1;
                return true;
            }
            if (field937 == 177) {
                method2842(false);
                field937 = -1;
                return true;
            }
            if (field937 == 166) {
                String var147 = field1001.method2938();
                long var148 = (long) field1001.method2932();
                long var150 = (long) field1001.method3033();
                class231 var152 = (class231) class169.method1267(class231.method1015(), field1001.method2930());
                long var153 = (var148 << 32) + var150;
                boolean var155 = false;
                for (int var156 = 0; var156 < 100; var156++) {
                    if (field1138[var156] == var153) {
                        var155 = true;
                        break;
                    }
                }
                if (method146(var147)) {
                    var155 = true;
                }
                if (!var155 && field1015 == 0) {
                    field1138[field1111] = var153;
                    field1111 = (field1111 + 1) % 100;
                    String var157 = class265.method4452(class271.method3809(class266.method2225(field1001)));
                    byte var158;
                    if (var152.field3162) {
                        var158 = 7;
                    } else {
                        var158 = 3;
                    }
                    if (var152.field3167 == -1) {
                        class99.method2696(var158, var147, var157);
                    } else {
                        class99.method2696(var158, class89.method1013(var152.field3167) + var147, var157);
                    }
                }
                field937 = -1;
                return true;
            }
            if (field937 == 26) {
                String var159 = field1001.method2938();
                Object[] var160 = new Object[var159.length() + 1];
                for (int var161 = var159.length() - 1; var161 >= 0; var161--) {
                    if (var159.charAt(var161) == 's') {
                        var160[var161 + 1] = field1001.method2938();
                    } else {
                        var160[var161 + 1] = Integer.valueOf(field1001.method2927());
                    }
                }
                var160[0] = Integer.valueOf(field1001.method2927());
                class70 var162 = new class70();
                var162.field827 = var160;
                class84.method2306(var162);
                field937 = -1;
                return true;
            }
            if (field937 == 141) {
                field930 = false;
                for (int var163 = 0; var163 < 5; var163++) {
                    field1139[var163] = false;
                }
                field937 = -1;
                return true;
            }
            if (field937 == 36) {
                boolean var164 = field1001.method2930() == 1;
                if (var164) {
                    Statics.field228 = class176.method3821() - field1001.method2949();
                    Statics.field2403 = new class14(field1001, true);
                } else {
                    Statics.field2403 = null;
                }
                field1087 = field1076;
                field937 = -1;
                return true;
            }
            if (field937 == 202) {
                method1568();
                field937 = -1;
                return false;
            }
            if (field937 == 13) {
                int var165 = field1001.method2976();
                int var166 = field1001.method2977();
                class217 var167 = class217.method4432(var166);
                if (var167.field2686 != 1 || var167.field2687 != var165) {
                    var167.field2686 = 1;
                    var167.field2687 = var165;
                    method3808(var167);
                }
                field937 = -1;
                return true;
            }
            if (field937 == 38) {
                Statics.field1859 = field1001.method2958();
                Statics.field3278 = field1001.method2991();
                field937 = -1;
                return true;
            }
            if (field937 == 20) {
                method939(true);
                field1001.method3180();
                int var168 = field1001.method2932();
                class180 var169 = field1001;
                int var170 = var169.field2384;
                class97.field1488 = 0;
                class97.method988(var169);
                for (int var171 = 0; var171 < class97.field1488; var171++) {
                    int var172 = class97.field1496[var171];
                    class75 var173 = field1032[var172];
                    int var174 = var169.method2930();
                    if ((var174 & 0x4) != 0) {
                        var174 += var169.method2930() << 8;
                    }
                    byte var175 = -1;
                    if ((var174 & 0x20) != 0) {
                        int var176 = var169.method2930();
                        byte[] var177 = new byte[var176];
                        class174 var178 = new class174(var177);
                        var169.method2941(var177, 0, var176);
                        class97.field1487[var172] = var178;
                        var173.method1051(var178);
                    }
                    if ((var174 & 0x40) != 0) {
                        int var179 = var169.method2932();
                        if (var179 == 65535) {
                            var179 = -1;
                        }
                        int var180 = var169.method2930();
                        method573(var173, var179, var180);
                    }
                    if ((var174 & 0x10) != 0) {
                        var173.field1219 = var169.method2932();
                        if (var173.field1219 == 65535) {
                            var173.field1219 = -1;
                        }
                    }
                    if ((var174 & 0x8) != 0) {
                        var173.field1212 = var169.method2938();
                        if (var173.field1212.charAt(0) == '~') {
                            var173.field1212 = var173.field1212.substring(1);
                            class99.method2696(2, var173.field881, var173.field1212);
                        } else if (Statics.field308 == var173) {
                            class99.method2696(2, var173.field881, var173.field1212);
                        }
                        var173.field1213 = false;
                        var173.field1216 = 0;
                        var173.field1217 = 0;
                        var173.field1215 = 150;
                    }
                    if ((var174 & 0x2) != 0) {
                        int var181 = var169.method2930();
                        if (var181 > 0) {
                            for (int var182 = 0; var182 < var181; var182++) {
                                int var183 = -1;
                                int var184 = -1;
                                int var185 = -1;
                                int var186 = var169.method2943();
                                if (var186 == 32767) {
                                    var186 = var169.method2943();
                                    var184 = var169.method2943();
                                    var183 = var169.method2943();
                                    var185 = var169.method2943();
                                } else if (var186 == 32766) {
                                    var186 = -1;
                                } else {
                                    var184 = var169.method2943();
                                }
                                int var187 = var169.method2943();
                                var173.method1406(var186, var184, var183, var185, field900, var187);
                            }
                        }
                        int var188 = var169.method2930();
                        if (var188 > 0) {
                            for (int var189 = 0; var189 < var188; var189++) {
                                int var190 = var169.method2943();
                                int var191 = var169.method2943();
                                if (var191 == 32767) {
                                    var173.method1408(var190);
                                } else {
                                    int var192 = var169.method2943();
                                    int var193 = var169.method2930();
                                    int var194 = var191 > 0 ? var169.method2930() : var193;
                                    var173.method1407(var190, field900, var191, var192, var193, var194);
                                }
                            }
                        }
                    }
                    if ((var174 & 0x1) != 0) {
                        var173.field1231 = var169.method2932();
                        if (var173.field1253 == 0) {
                            var173.field1248 = var173.field1231;
                            var173.field1231 = -1;
                        }
                    }
                    if ((var174 & 0x80) != 0) {
                        int var195 = var169.method2932();
                        class231 var196 = (class231) class169.method1267(class231.method1015(), var169.method2930());
                        boolean var197 = var169.method2930() == 1;
                        int var198 = var169.method2930();
                        int var199 = var169.field2384;
                        if (var173.field881 != null && var173.field855 != null) {
                            boolean var200 = false;
                            if (var196.field3159 && method146(var173.field881)) {
                                var200 = true;
                            }
                            if (!var200 && field1015 == 0 && !var173.field868) {
                                class97.field1484.field2384 = 0;
                                var169.method2941(class97.field1484.field2387, 0, var198);
                                class97.field1484.field2384 = 0;
                                String var201 = class265.method4452(class271.method3809(class266.method2225(class97.field1484)));
                                var173.field1212 = var201.trim();
                                var173.field1216 = var195 >> 8;
                                var173.field1217 = var195 & 0xFF;
                                var173.field1215 = 150;
                                var173.field1213 = var197;
                                var173.field1214 = Statics.field308 != var173 && var196.field3159 && field1109 != "" && var201.toLowerCase().indexOf(field1109) == -1;
                                int var202;
                                if (var196.field3162) {
                                    var202 = var197 ? 91 : 1;
                                } else {
                                    var202 = var197 ? 90 : 2;
                                }
                                if (var196.field3167 == -1) {
                                    class99.method2696(var202, var173.field881, var201);
                                } else {
                                    class99.method2696(var202, class89.method1013(var196.field3167) + var173.field881, var201);
                                }
                            }
                        }
                        var169.field2384 = var198 + var199;
                    }
                    if ((var174 & 0x1000) != 0) {
                        var173.field1236 = var169.method2932();
                        int var203 = var169.method2927();
                        var173.field1240 = var203 >> 16;
                        var173.field1207 = (var203 & 0xFFFF) + field900;
                        var173.field1229 = 0;
                        var173.field1238 = 0;
                        if (var173.field1207 > field900) {
                            var173.field1229 = -1;
                        }
                        if (var173.field1236 == 65535) {
                            var173.field1236 = -1;
                        }
                    }
                    if ((var174 & 0x400) != 0) {
                        var173.field1199 = var169.method2931();
                        var173.field1243 = var169.method2931();
                        var173.field1226 = var169.method2931();
                        var173.field1244 = var169.method2931();
                        var173.field1245 = var169.method2932() + field900;
                        var173.field1225 = var169.method2932() + field900;
                        var173.field1202 = var169.method2932();
                        if (var173.field877) {
                            var173.field1199 += var173.field878;
                            var173.field1243 += var173.field862;
                            var173.field1226 += var173.field878;
                            var173.field1244 += var173.field862;
                            var173.field1253 = 0;
                        } else {
                            var173.field1199 += var173.field1254[0];
                            var173.field1243 += var173.field1255[0];
                            var173.field1226 += var173.field1254[0];
                            var173.field1244 += var173.field1255[0];
                            var173.field1253 = 1;
                        }
                        var173.field1237 = 0;
                    }
                    if ((var174 & 0x800) != 0) {
                        class97.field1486[var172] = var169.method2931();
                    }
                    if ((var174 & 0x100) != 0) {
                        var175 = var169.method2931();
                    }
                    if ((var174 & 0x200) != 0) {
                        for (int var204 = 0; var204 < 3; var204++) {
                            var173.field858[var204] = var169.method2938();
                        }
                    }
                    if (var173.field877) {
                        if (var175 == 127) {
                            var173.method1055(var173.field878, var173.field862);
                        } else {
                            byte var205;
                            if (var175 == -1) {
                                var205 = class97.field1486[var172];
                            } else {
                                var205 = var175;
                            }
                            var173.method1054(var173.field878, var173.field862, var205);
                        }
                    }
                }
                if (var169.field2384 - var170 != var168) {
                    throw new RuntimeException(var169.field2384 - var170 + " " + var168);
                }
                field937 = -1;
                return true;
            }
            if (field937 == 106) {
                String var206 = field1001.method2938();
                int var207 = field1001.method2932();
                byte var208 = field1001.method2931();
                boolean var209 = false;
                if (var208 == -128) {
                    var209 = true;
                }
                if (var209) {
                    if (Statics.field611 == 0) {
                        field937 = -1;
                        return true;
                    }
                    boolean var210 = false;
                    int var211;
                    for (var211 = 0; var211 < Statics.field611 && (!Statics.field3744[var211].field882.equals(var206) || Statics.field3744[var211].field884 != var207); var211++) {
                    }
                    if (var211 < Statics.field611) {
                        while (var211 < Statics.field611 - 1) {
                            Statics.field3744[var211] = Statics.field3744[var211 + 1];
                            var211++;
                        }
                        Statics.field611--;
                        Statics.field3744[Statics.field611] = null;
                    }
                } else {
                    field1001.method2938();
                    class76 var212 = new class76();
                    var212.field882 = var206;
                    var212.field888 = class268.method203(var212.field882, Statics.field424);
                    var212.field884 = var207;
                    var212.field885 = var208;
                    int var213;
                    for (var213 = Statics.field611 - 1; var213 >= 0; var213--) {
                        int var214 = Statics.field3744[var213].field888.compareTo(var212.field888);
                        if (var214 == 0) {
                            Statics.field3744[var213].field884 = var207;
                            Statics.field3744[var213].field885 = var208;
                            if (var206.equals(Statics.field308.field881)) {
                                Statics.field419 = var208;
                            }
                            field1127 = field1076;
                            field937 = -1;
                            return true;
                        }
                        if (var214 < 0) {
                            break;
                        }
                    }
                    if (Statics.field611 >= Statics.field3744.length) {
                        field937 = -1;
                        return true;
                    }
                    for (int var215 = Statics.field611 - 1; var215 > var213; var215--) {
                        Statics.field3744[var215 + 1] = Statics.field3744[var215];
                    }
                    if (Statics.field611 == 0) {
                        Statics.field3744 = new class76[100];
                    }
                    Statics.field3744[var213 + 1] = var212;
                    Statics.field611++;
                    if (var206.equals(Statics.field308.field881)) {
                        Statics.field419 = var208;
                    }
                }
                field1127 = field1076;
                field937 = -1;
                return true;
            }
            if (field937 == 32) {
                int var216 = field1001.method2943();
                boolean var217 = field1001.method2930() == 1;
                String var218 = "";
                boolean var219 = false;
                if (var217) {
                    var218 = field1001.method2938();
                    if (method146(var218)) {
                        var219 = true;
                    }
                }
                String var220 = field1001.method2938();
                if (!var219) {
                    class99.method2696(var216, var218, var220);
                }
                field937 = -1;
                return true;
            }
            if (field937 == 119) {
                field930 = true;
                Statics.field297 = field1001.method2930();
                Statics.field2354 = field1001.method2930();
                Statics.field3543 = field1001.method2932();
                Statics.field2293 = field1001.method2930();
                Statics.field1501 = field1001.method2930();
                if (Statics.field1501 >= 100) {
                    int var221 = Statics.field297 * 128 + 64;
                    int var222 = Statics.field2354 * 128 + 64;
                    int var223 = method1028(var221, var222, Statics.field3606) - Statics.field3543;
                    int var224 = var221 - Statics.field275;
                    int var225 = var223 - Statics.field537;
                    int var226 = var222 - Statics.field277;
                    int var227 = (int) Math.sqrt((double) (var224 * var224 + var226 * var226));
                    Statics.field503 = (int) (Math.atan2((double) var225, (double) var227) * 325.949D) & 0x7FF;
                    Statics.field3308 = (int) (Math.atan2((double) var224, (double) var226) * -325.949D) & 0x7FF;
                    if (Statics.field503 < 128) {
                        Statics.field503 = 128;
                    }
                    if (Statics.field503 > 383) {
                        Statics.field503 = 383;
                    }
                }
                field937 = -1;
                return true;
            }
            if (field937 == 64) {
                int var228 = field1001.method2953();
                class217 var229 = class217.method4432(var228);
                for (int var230 = 0; var230 < var229.field2761.length; var230++) {
                    var229.field2761[var230] = -1;
                    var229.field2761[var230] = 0;
                }
                method3808(var229);
                field937 = -1;
                return true;
            }
            if (field937 == 222) {
                String var231 = field1001.method2938();
                String var232 = class265.method4452(class271.method3809(class266.method2225(field1001)));
                class99.method2696(6, var231, var232);
                field937 = -1;
                return true;
            }
            if (field937 == 59) {
                while (field1001.field2384 < field936) {
                    boolean var233 = field1001.method2930() == 1;
                    String var234 = field1001.method2938();
                    String var235 = field1001.method2938();
                    int var236 = field1001.method2932();
                    int var237 = field1001.method2930();
                    int var238 = field1001.method2930();
                    boolean var239 = (var238 & 0x2) != 0;
                    boolean var240 = (var238 & 0x1) != 0;
                    if (var236 > 0) {
                        field1001.method2938();
                        field1001.method2930();
                        field1001.method2927();
                    }
                    field1001.method2938();
                    for (int var241 = 0; var241 < field1157; var241++) {
                        class66 var242 = field892[var241];
                        if (var233) {
                            if (var235.equals(var242.field796)) {
                                var242.field796 = var234;
                                var242.field793 = var235;
                                var234 = null;
                                break;
                            }
                        } else if (var234.equals(var242.field796)) {
                            if (var242.field794 != var236) {
                                boolean var243 = true;
                                for (class68 var244 = (class68) field1129.method3406(); var244 != null; var244 = (class68) field1129.method3407()) {
                                    if (var244.field808.equals(var234)) {
                                        if (var236 != 0 && var244.field807 == 0) {
                                            var244.method3415();
                                            var243 = false;
                                        } else if (var236 == 0 && var244.field807 != 0) {
                                            var244.method3415();
                                            var243 = false;
                                        }
                                    }
                                }
                                if (var243) {
                                    field1129.method3405(new class68(var234, var236));
                                }
                                var242.field794 = var236;
                            }
                            var242.field793 = var235;
                            var242.field795 = var237;
                            var242.field798 = var239;
                            var242.field797 = var240;
                            var234 = null;
                            break;
                        }
                    }
                    if (var234 != null && field1157 < 400) {
                        class66 var245 = new class66();
                        field892[field1157] = var245;
                        var245.field796 = var234;
                        var245.field793 = var235;
                        var245.field794 = var236;
                        var245.field795 = var237;
                        var245.field798 = var239;
                        var245.field797 = var240;
                        field1157++;
                    }
                }
                field940 = 2;
                field1084 = field1076;
                boolean var246 = false;
                int var247 = field1157;
                while (var247 > 0) {
                    boolean var248 = true;
                    var247--;
                    for (int var249 = 0; var249 < var247; var249++) {
                        boolean var250 = false;
                        class66 var251 = field892[var249];
                        class66 var252 = field892[var249 + 1];
                        if (field1079 != var251.field794 && field1079 == var252.field794) {
                            var250 = true;
                        }
                        if (!var250 && var251.field794 == 0 && var252.field794 != 0) {
                            var250 = true;
                        }
                        if (!var250 && !var251.field798 && var252.field798) {
                            var250 = true;
                        }
                        if (!var250 && !var251.field797 && var252.field797) {
                            var250 = true;
                        }
                        if (var250) {
                            class66 var253 = field892[var249];
                            field892[var249] = field892[var249 + 1];
                            field892[var249 + 1] = var253;
                            var248 = false;
                        }
                    }
                    if (var248) {
                        break;
                    }
                }
                field937 = -1;
                return true;
            }
            if (field937 == 229) {
                int var254 = field1001.method2932();
                int var255 = field1001.method2932();
                int var256 = field1001.method2967();
                int var257 = field1001.method2927();
                class217 var258 = class217.method4432(var257);
                if (var258.field2720 != var256 || var258.field2695 != var254 || var258.field2697 != var255) {
                    var258.field2720 = var256;
                    var258.field2695 = var254;
                    var258.field2697 = var255;
                    method3808(var258);
                }
                field937 = -1;
                return true;
            }
            if (field937 == 167) {
                field908 = field1001.method2930();
                if (field908 == 1) {
                    field909 = field1001.method2932();
                }
                if (field908 >= 2 && field908 <= 6) {
                    if (field908 == 2) {
                        field914 = 64;
                        field1027 = 64;
                    }
                    if (field908 == 3) {
                        field914 = 0;
                        field1027 = 64;
                    }
                    if (field908 == 4) {
                        field914 = 128;
                        field1027 = 64;
                    }
                    if (field908 == 5) {
                        field914 = 64;
                        field1027 = 0;
                    }
                    if (field908 == 6) {
                        field914 = 64;
                        field1027 = 128;
                    }
                    field908 = 2;
                    field925 = field1001.method2932();
                    field912 = field1001.method2932();
                    field1134 = field1001.method2930();
                }
                if (field908 == 10) {
                    field910 = field1001.method2932();
                }
                field937 = -1;
                return true;
            }
            if (field937 == 15) {
                int var259 = field1001.method2953();
                class217 var260 = class217.method4432(var259);
                var260.field2686 = 3;
                var260.field2687 = Statics.field308.field855.method3714();
                method3808(var260);
                field937 = -1;
                return true;
            }
            if (field937 == 107) {
                int var261 = field1001.method2927();
                int var262 = field1001.method2932();
                if (var261 < -70000) {
                    var262 += 32768;
                }
                class217 var263;
                if (var261 >= 0) {
                    var263 = class217.method4432(var261);
                } else {
                    var263 = null;
                }
                if (var263 != null) {
                    for (int var264 = 0; var264 < var263.field2761.length; var264++) {
                        var263.field2761[var264] = 0;
                        var263.field2637[var264] = 0;
                    }
                }
                class64.method461(var262);
                int var265 = field1001.method2932();
                for (int var266 = 0; var266 < var265; var266++) {
                    int var267 = field1001.method2976();
                    int var268 = field1001.method3036();
                    if (var268 == 255) {
                        var268 = field1001.method2927();
                    }
                    if (var263 != null && var266 < var263.field2761.length) {
                        var263.field2761[var266] = var267;
                        var263.field2637[var266] = var268;
                    }
                    class64.method153(var262, var266, var267 - 1, var268);
                }
                if (var263 != null) {
                    method3808(var263);
                }
                method125();
                field1052[++field1080 - 1 & 0x1F] = var262 & 0x7FFF;
                field937 = -1;
                return true;
            }
            if (field937 == 42) {
                class281.method3991(field1001, field936);
                field937 = -1;
                return true;
            }
            if (field937 == 217) {
                int var269 = field1001.method2920();
                byte var270 = field1001.method2962();
                class212.field2596[var269] = var270;
                if (class212.field2597[var269] != var270) {
                    class212.field2597[var269] = var270;
                }
                method605(var269);
                field956[++field1146 - 1 & 0x1F] = var269;
                field937 = -1;
                return true;
            }
            if (field937 == 147) {
                int var271 = field1001.method3041();
                Statics.field2534 = Statics.field683.method2716(var271);
                field937 = -1;
                return true;
            }
            if (field937 == 63) {
                int var272 = field1001.method3041();
                int var273 = field1001.method2920();
                if (var273 == 65535) {
                    var273 = -1;
                }
                int var274 = field1001.method3041();
                class217 var275 = class217.method4432(var274);
                if (var275.field2642) {
                    var275.field2763 = var273;
                    var275.field2764 = var272;
                    class257 var277 = class257.method678(var273);
                    var275.field2720 = var277.field3524;
                    var275.field2695 = var277.field3499;
                    var275.field2654 = var277.field3500;
                    var275.field2753 = var277.field3519;
                    var275.field2693 = var277.field3502;
                    var275.field2697 = var277.field3497;
                    if (var277.field3490 == 1) {
                        var275.field2771 = 1;
                    } else {
                        var275.field2771 = 2;
                    }
                    if (var275.field2698 > 0) {
                        var275.field2697 = var275.field2697 * 32 / var275.field2698;
                    } else if (var275.field2662 > 0) {
                        var275.field2697 = var275.field2697 * 32 / var275.field2662;
                    }
                    method3808(var275);
                } else if (var273 == -1) {
                    var275.field2686 = 0;
                    field937 = -1;
                    return true;
                } else {
                    class257 var276 = class257.method678(var273);
                    var275.field2686 = 4;
                    var275.field2687 = var273;
                    var275.field2720 = var276.field3524;
                    var275.field2695 = var276.field3499;
                    var275.field2697 = var276.field3497 * 100 / var272;
                    method3808(var275);
                }
                field937 = -1;
                return true;
            }
            if (field937 == 2) {
                int var278 = field1001.method3041();
                int var279 = field1001.method2932();
                class212.field2596[var279] = var278;
                if (class212.field2597[var279] != var278) {
                    class212.field2597[var279] = var278;
                }
                method605(var279);
                field956[++field1146 - 1 & 0x1F] = var279;
                field937 = -1;
                return true;
            }
            if (field937 == 149) {
                field940 = 1;
                field1084 = field1076;
                field937 = -1;
                return true;
            }
            if (field937 == 137) {
                field1100 = field1001.method2930();
                field1093 = field1001.method2930();
                field937 = -1;
                return true;
            }
            if (field937 == 185) {
                for (int var280 = 0; var280 < class212.field2597.length; var280++) {
                    if (class212.field2597[var280] != class212.field2596[var280]) {
                        class212.field2597[var280] = class212.field2596[var280];
                        method605(var280);
                        field956[++field1146 - 1 & 0x1F] = var280;
                    }
                }
                field937 = -1;
                return true;
            }
            if (field937 == 252) {
                int var281 = field1001.method2920();
                if (var281 == 65535) {
                    var281 = -1;
                }
                if (var281 == -1 && !field1110) {
                    Statics.field502.method3508();
                    class204.field2499 = 1;
                    Statics.field3381 = null;
                } else if (var281 != -1 && field1128 != var281 && field1078 != 0 && !field1110) {
                    class204.method55(2, Statics.field575, var281, 0, field1078, false);
                }
                field1128 = var281;
                field937 = -1;
                return true;
            }
            if (field937 == 96) {
                int var282 = field1001.method2967();
                if (var282 == 65535) {
                    var282 = -1;
                }
                int var283 = field1001.method3033();
                if (field1078 != 0 && var282 != -1) {
                    class204.method291(Statics.field467, var282, 0, field1078, false);
                    field1110 = true;
                }
                field937 = -1;
                return true;
            }
            if (field937 == 70) {
                int var284 = field1001.method2932();
                field1051 = var284;
                this.method1078(false);
                method698(var284);
                class84.method112(field1051);
                for (int var285 = 0; var285 < 100; var285++) {
                    field1096[var285] = true;
                }
                field937 = -1;
                return true;
            }
            if (field937 == 56) {
                String var286 = field1001.method2938();
                long var287 = field1001.method2949();
                long var289 = (long) field1001.method2932();
                long var291 = (long) field1001.method3033();
                class231 var293 = (class231) class169.method1267(class231.method1015(), field1001.method2930());
                long var294 = (var289 << 32) + var291;
                boolean var296 = false;
                for (int var297 = 0; var297 < 100; var297++) {
                    if (field1138[var297] == var294) {
                        var296 = true;
                        break;
                    }
                }
                if (var293.field3159 && method146(var286)) {
                    var296 = true;
                }
                if (!var296 && field1015 == 0) {
                    field1138[field1111] = var294;
                    field1111 = (field1111 + 1) % 100;
                    String var298 = class265.method4452(class271.method3809(class266.method2225(field1001)));
                    if (var293.field3167 == -1) {
                        class99.method1582(9, var286, var298, class269.method1663(var287));
                    } else {
                        class99.method1582(9, class89.method1013(var293.field3167) + var286, var298, class269.method1663(var287));
                    }
                }
                field937 = -1;
                return true;
            }
            if (field937 == 44) {
                Statics.method1592();
                for (int var299 = 0; var299 < 2048; var299++) {
                    field1032[var299] = null;
                }
                class97.method1034(field1001);
                field937 = -1;
                return true;
            }
            if (field937 == 123) {
                int var300 = field1001.method2953();
                int var301 = field1001.method2920();
                class217 var302 = class217.method4432(var300);
                if (var302 != null && var302.field2645 == 0) {
                    if (var301 > var302.field2661 - var302.field2659) {
                        var301 = var302.field2661 - var302.field2659;
                    }
                    if (var301 < 0) {
                        var301 = 0;
                    }
                    if (var302.field2692 != var301) {
                        var302.field2692 = var301;
                        method3808(var302);
                    }
                }
                field937 = -1;
                return true;
            }
            if (field937 == 87) {
                method2842(true);
                field937 = -1;
                return true;
            }
            if (field937 == 198) {
                int var303 = field936 + field1001.field2384;
                int var304 = field1001.method2932();
                int var305 = field1001.method2932();
                if (field1051 != var304) {
                    field1051 = var304;
                    this.method1078(false);
                    method698(field1051);
                    class84.method112(field1051);
                    for (int var306 = 0; var306 < 100; var306++) {
                        field1096[var306] = true;
                    }
                }
                while (var305-- > 0) {
                    int var307 = field1001.method2927();
                    int var308 = field1001.method2932();
                    int var309 = field1001.method2930();
                    class69 var310 = (class69) field1020.method3331((long) var307);
                    if (var310 != null && var310.field814 != var308) {
                        method4603(var310, true);
                        var310 = null;
                    }
                    if (var310 == null) {
                        var310 = method578(var307, var308, var309);
                    }
                    var310.field812 = true;
                }
                for (class69 var311 = (class69) field1020.method3322(); var311 != null; var311 = (class69) field1020.method3323()) {
                    if (var311.field812) {
                        var311.field812 = false;
                    } else {
                        method4603(var311, true);
                    }
                }
                field918 = new class191(512);
                while (field1001.field2384 < var303) {
                    int var312 = field1001.method2927();
                    int var313 = field1001.method2932();
                    int var314 = field1001.method2932();
                    int var315 = field1001.method2927();
                    for (int var316 = var313; var316 <= var314; var316++) {
                        long var317 = ((long) var312 << 32) + (long) var316;
                        field918.method3333(new class199(var315), var317);
                    }
                }
                field937 = -1;
                return true;
            }
            if (field937 == 164) {
                class81 var319 = new class81();
                var319.field1276 = field1001.method2938();
                var319.field1278 = field1001.method2932();
                int var320 = field1001.method2927();
                var319.field1274 = var320;
                method54(45);
                Statics.field304.method2784();
                Statics.field304 = null;
                class93.method1602(var319);
                field937 = -1;
                return false;
            }
            if (field937 == 24) {
                int var321 = field1001.method3041();
                int var322 = field1001.method2969();
                class217 var323 = class217.method4432(var321);
                if (var323.field2690 != var322 || var322 == -1) {
                    var323.field2690 = var322;
                    var323.field2774 = 0;
                    var323.field2766 = 0;
                    method3808(var323);
                }
                field937 = -1;
                return true;
            }
            if (field937 == 17) {
                int var324 = field1001.method2958();
                int var325 = field1001.method2920();
                int var326 = field1001.method2927();
                class69 var327 = (class69) field1020.method3331((long) var326);
                if (var327 != null) {
                    method4603(var327, var327.field814 != var325);
                }
                method578(var326, var325, var324);
                field937 = -1;
                return true;
            }
            if (field937 == 253) {
                method939(false);
                field1001.method3180();
                int var328 = field1001.method2932();
                class180 var329 = field1001;
                int var330 = var329.field2384;
                class97.field1488 = 0;
                class97.method988(var329);
                for (int var331 = 0; var331 < class97.field1488; var331++) {
                    int var332 = class97.field1496[var331];
                    class75 var333 = field1032[var332];
                    int var334 = var329.method2930();
                    if ((var334 & 0x4) != 0) {
                        var334 += var329.method2930() << 8;
                    }
                    byte var335 = -1;
                    if ((var334 & 0x20) != 0) {
                        int var336 = var329.method2930();
                        byte[] var337 = new byte[var336];
                        class174 var338 = new class174(var337);
                        var329.method2941(var337, 0, var336);
                        class97.field1487[var332] = var338;
                        var333.method1051(var338);
                    }
                    if ((var334 & 0x40) != 0) {
                        int var339 = var329.method2932();
                        if (var339 == 65535) {
                            var339 = -1;
                        }
                        int var340 = var329.method2930();
                        method573(var333, var339, var340);
                    }
                    if ((var334 & 0x10) != 0) {
                        var333.field1219 = var329.method2932();
                        if (var333.field1219 == 65535) {
                            var333.field1219 = -1;
                        }
                    }
                    if ((var334 & 0x8) != 0) {
                        var333.field1212 = var329.method2938();
                        if (var333.field1212.charAt(0) == '~') {
                            var333.field1212 = var333.field1212.substring(1);
                            class99.method2696(2, var333.field881, var333.field1212);
                        } else if (Statics.field308 == var333) {
                            class99.method2696(2, var333.field881, var333.field1212);
                        }
                        var333.field1213 = false;
                        var333.field1216 = 0;
                        var333.field1217 = 0;
                        var333.field1215 = 150;
                    }
                    if ((var334 & 0x2) != 0) {
                        int var341 = var329.method2930();
                        if (var341 > 0) {
                            for (int var342 = 0; var342 < var341; var342++) {
                                int var343 = -1;
                                int var344 = -1;
                                int var345 = -1;
                                int var346 = var329.method2943();
                                if (var346 == 32767) {
                                    var346 = var329.method2943();
                                    var344 = var329.method2943();
                                    var343 = var329.method2943();
                                    var345 = var329.method2943();
                                } else if (var346 == 32766) {
                                    var346 = -1;
                                } else {
                                    var344 = var329.method2943();
                                }
                                int var347 = var329.method2943();
                                var333.method1406(var346, var344, var343, var345, field900, var347);
                            }
                        }
                        int var348 = var329.method2930();
                        if (var348 > 0) {
                            for (int var349 = 0; var349 < var348; var349++) {
                                int var350 = var329.method2943();
                                int var351 = var329.method2943();
                                if (var351 == 32767) {
                                    var333.method1408(var350);
                                } else {
                                    int var352 = var329.method2943();
                                    int var353 = var329.method2930();
                                    int var354 = var351 > 0 ? var329.method2930() : var353;
                                    var333.method1407(var350, field900, var351, var352, var353, var354);
                                }
                            }
                        }
                    }
                    if ((var334 & 0x1) != 0) {
                        var333.field1231 = var329.method2932();
                        if (var333.field1253 == 0) {
                            var333.field1248 = var333.field1231;
                            var333.field1231 = -1;
                        }
                    }
                    if ((var334 & 0x80) != 0) {
                        int var355 = var329.method2932();
                        class231 var356 = (class231) class169.method1267(class231.method1015(), var329.method2930());
                        boolean var357 = var329.method2930() == 1;
                        int var358 = var329.method2930();
                        int var359 = var329.field2384;
                        if (var333.field881 != null && var333.field855 != null) {
                            boolean var360 = false;
                            if (var356.field3159 && method146(var333.field881)) {
                                var360 = true;
                            }
                            if (!var360 && field1015 == 0 && !var333.field868) {
                                class97.field1484.field2384 = 0;
                                var329.method2941(class97.field1484.field2387, 0, var358);
                                class97.field1484.field2384 = 0;
                                String var361 = class265.method4452(class271.method3809(class266.method2225(class97.field1484)));
                                var333.field1212 = var361.trim();
                                var333.field1216 = var355 >> 8;
                                var333.field1217 = var355 & 0xFF;
                                var333.field1215 = 150;
                                var333.field1213 = var357;
                                var333.field1214 = Statics.field308 != var333 && var356.field3159 && field1109 != "" && var361.toLowerCase().indexOf(field1109) == -1;
                                int var362;
                                if (var356.field3162) {
                                    var362 = var357 ? 91 : 1;
                                } else {
                                    var362 = var357 ? 90 : 2;
                                }
                                if (var356.field3167 == -1) {
                                    class99.method2696(var362, var333.field881, var361);
                                } else {
                                    class99.method2696(var362, class89.method1013(var356.field3167) + var333.field881, var361);
                                }
                            }
                        }
                        var329.field2384 = var358 + var359;
                    }
                    if ((var334 & 0x1000) != 0) {
                        var333.field1236 = var329.method2932();
                        int var363 = var329.method2927();
                        var333.field1240 = var363 >> 16;
                        var333.field1207 = (var363 & 0xFFFF) + field900;
                        var333.field1229 = 0;
                        var333.field1238 = 0;
                        if (var333.field1207 > field900) {
                            var333.field1229 = -1;
                        }
                        if (var333.field1236 == 65535) {
                            var333.field1236 = -1;
                        }
                    }
                    if ((var334 & 0x400) != 0) {
                        var333.field1199 = var329.method2931();
                        var333.field1243 = var329.method2931();
                        var333.field1226 = var329.method2931();
                        var333.field1244 = var329.method2931();
                        var333.field1245 = var329.method2932() + field900;
                        var333.field1225 = var329.method2932() + field900;
                        var333.field1202 = var329.method2932();
                        if (var333.field877) {
                            var333.field1199 += var333.field878;
                            var333.field1243 += var333.field862;
                            var333.field1226 += var333.field878;
                            var333.field1244 += var333.field862;
                            var333.field1253 = 0;
                        } else {
                            var333.field1199 += var333.field1254[0];
                            var333.field1243 += var333.field1255[0];
                            var333.field1226 += var333.field1254[0];
                            var333.field1244 += var333.field1255[0];
                            var333.field1253 = 1;
                        }
                        var333.field1237 = 0;
                    }
                    if ((var334 & 0x800) != 0) {
                        class97.field1486[var332] = var329.method2931();
                    }
                    if ((var334 & 0x100) != 0) {
                        var335 = var329.method2931();
                    }
                    if ((var334 & 0x200) != 0) {
                        for (int var364 = 0; var364 < 3; var364++) {
                            var333.field858[var364] = var329.method2938();
                        }
                    }
                    if (var333.field877) {
                        if (var335 == 127) {
                            var333.method1055(var333.field878, var333.field862);
                        } else {
                            byte var365;
                            if (var335 == -1) {
                                var365 = class97.field1486[var332];
                            } else {
                                var365 = var335;
                            }
                            var333.method1054(var333.field878, var333.field862, var365);
                        }
                    }
                }
                if (var329.field2384 - var330 != var328) {
                    throw new RuntimeException(var329.field2384 - var330 + " " + var328);
                }
                field937 = -1;
                return true;
            }
            if (field937 == 228) {
                int var366 = field1001.method2967();
                int var367 = field1001.method2953();
                int var368 = var366 >> 10 & 0x1F;
                int var369 = var366 >> 5 & 0x1F;
                int var370 = var366 & 0x1F;
                int var371 = (var370 << 3) + (var368 << 19) + (var369 << 11);
                class217 var372 = class217.method4432(var367);
                if (var372.field2668 != var371) {
                    var372.field2668 = var371;
                    method3808(var372);
                }
                field937 = -1;
                return true;
            }
            if (field937 == 46) {
                int var373 = field1001.method2977();
                String var374 = field1001.method2938();
                class217 var375 = class217.method4432(var373);
                if (!var374.equals(var375.field2703)) {
                    var375.field2703 = var374;
                    method3808(var375);
                }
                field937 = -1;
                return true;
            }
            if (field937 == 84) {
                int var376 = field1001.method2927();
                int var377 = field1001.method2932();
                if (var376 < -70000) {
                    var377 += 32768;
                }
                class217 var378;
                if (var376 >= 0) {
                    var378 = class217.method4432(var376);
                } else {
                    var378 = null;
                }
                while (field1001.field2384 < field936) {
                    int var379 = field1001.method2943();
                    int var380 = field1001.method2932();
                    int var381 = 0;
                    if (var380 != 0) {
                        var381 = field1001.method2930();
                        if (var381 == 255) {
                            var381 = field1001.method2927();
                        }
                    }
                    if (var378 != null && var379 >= 0 && var379 < var378.field2761.length) {
                        var378.field2761[var379] = var380;
                        var378.field2637[var379] = var381;
                    }
                    class64.method153(var377, var379, var380 - 1, var381);
                }
                if (var378 != null) {
                    method3808(var378);
                }
                method125();
                field1052[++field1080 - 1 & 0x1F] = var377 & 0x7FFF;
                field937 = -1;
                return true;
            }
            class153.method3831("" + field937 + class89.field1375 + field1071 + class89.field1375 + field979 + class89.field1375 + field936, (Throwable) null);
            method1568();
        } catch (IOException var387) {
            if (field987 > 0) {
                method1568();
            } else {
                method54(40);
                Statics.field1524 = Statics.field304;
                Statics.field304 = null;
            }
        } catch (Exception var388) {
            String var384 = "" + field937 + class89.field1375 + field1071 + class89.field1375 + field979 + class89.field1375 + field936 + class89.field1375 + (Statics.field2304 + Statics.field308.field1254[0]) + class89.field1375 + (Statics.field2147 + Statics.field308.field1255[0]) + class89.field1375;
            for (int var385 = 0; var385 < field936 && var385 < 50; var385++) {
                var384 = var384 + field1001.field2387[var385] + class89.field1375;
            }
            class153.method3831(var384, var388);
            method1568();
        }
        return true;
    }

    @ObfuscatedName("cm.ga(I)V")
    public static final void method1659() {
        if (field937 == 130) {
            int var0 = field1001.method2930();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1859;
            int var2 = (var0 & 0x7) + Statics.field3278;
            int var3 = var1 + field1001.method2931();
            int var4 = var2 + field1001.method2931();
            int var5 = field1001.method2933();
            int var6 = field1001.method2932();
            int var7 = field1001.method2930() * 4;
            int var8 = field1001.method2930() * 4;
            int var9 = field1001.method2932();
            int var10 = field1001.method2932();
            int var11 = field1001.method2930();
            int var12 = field1001.method2930();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104 && var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && var6 != 65535) {
                int var13 = var1 * 128 + 64;
                int var14 = var2 * 128 + 64;
                int var15 = var3 * 128 + 64;
                int var16 = var4 * 128 + 64;
                class94 var17 = new class94(var6, Statics.field3606, var13, var14, method1028(var13, var14, Statics.field3606) - var7, field900 + var9, field900 + var10, var11, var12, var5, var8);
                var17.method1642(var15, var16, method1028(var15, var16, Statics.field3606) - var8, field900 + var9);
                field1075.method3371(var17);
            }
        } else if (field937 == 143) {
            int var18 = field1001.method2991();
            int var19 = (var18 >> 4 & 0x7) + Statics.field1859;
            int var20 = (var18 & 0x7) + Statics.field3278;
            int var21 = field1001.method2930();
            int var22 = var21 >> 2;
            int var23 = var21 & 0x3;
            int var24 = field954[var22];
            int var25 = field1001.method2932();
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                method139(Statics.field3606, var19, var20, var24, var25, var22, var23, 0, -1);
            }
        } else if (field937 == 103) {
            int var26 = field1001.method2967();
            int var27 = field1001.method2920();
            int var28 = field1001.method2958();
            int var29 = (var28 >> 4 & 0x7) + Statics.field1859;
            int var30 = (var28 & 0x7) + Statics.field3278;
            if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
                class95 var31 = new class95();
                var31.field1474 = var27;
                var31.field1475 = var26;
                if (field1021[Statics.field3606][var29][var30] == null) {
                    field1021[Statics.field3606][var29][var30] = new class194();
                }
                field1021[Statics.field3606][var29][var30].method3371(var31);
                method473(var29, var30);
            }
        } else if (field937 == 74) {
            int var32 = field1001.method2958();
            int var33 = (var32 >> 4 & 0x7) + Statics.field1859;
            int var34 = (var32 & 0x7) + Statics.field3278;
            int var35 = field1001.method2991();
            int var36 = var35 >> 2;
            int var37 = var35 & 0x3;
            int var38 = field954[var36];
            if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                method139(Statics.field3606, var33, var34, var38, -1, var36, var37, 0, -1);
            }
        } else if (field937 == 239) {
            int var39 = field1001.method2930();
            int var40 = (var39 >> 4 & 0x7) + Statics.field1859;
            int var41 = (var39 & 0x7) + Statics.field3278;
            int var42 = field1001.method2932();
            int var43 = field1001.method2930();
            int var44 = field1001.method2932();
            if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
                int var45 = var40 * 128 + 64;
                int var46 = var41 * 128 + 64;
                class85 var47 = new class85(var42, Statics.field3606, var45, var46, method1028(var45, var46, Statics.field3606) - var43, var44, field900);
                field1024.method3371(var47);
            }
        } else {
            if (field937 == 191) {
                int var48 = field1001.method2930();
                int var49 = (var48 >> 4 & 0x7) + Statics.field1859;
                int var50 = (var48 & 0x7) + Statics.field3278;
                int var51 = field1001.method2932();
                int var52 = field1001.method2930();
                int var53 = var52 >> 4 & 0xF;
                int var54 = var52 & 0x7;
                int var55 = field1001.method2930();
                if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                    int var56 = var53 + 1;
                    if (Statics.field308.field1254[0] >= var49 - var56 && Statics.field308.field1254[0] <= var49 + var56 && Statics.field308.field1255[0] >= var50 - var56 && Statics.field308.field1255[0] <= var50 + var56 && field1131 != 0 && var54 > 0 && field1132 < 50) {
                        field1133[field1132] = var51;
                        field1010[field1132] = var54;
                        field1135[field1132] = var55;
                        field1137[field1132] = null;
                        field1136[field1132] = (var49 << 16) + (var50 << 8) + var53;
                        field1132++;
                    }
                }
            }
            if (field937 == 94) {
                int var57 = field1001.method2976();
                int var58 = field1001.method2930();
                int var59 = (var58 >> 4 & 0x7) + Statics.field1859;
                int var60 = (var58 & 0x7) + Statics.field3278;
                if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
                    class194 var61 = field1021[Statics.field3606][var59][var60];
                    if (var61 != null) {
                        for (class95 var62 = (class95) var61.method3376(); var62 != null; var62 = (class95) var61.method3377()) {
                            if ((var57 & 0x7FFF) == var62.field1474) {
                                var62.method3364();
                                break;
                            }
                        }
                        if (var61.method3376() == null) {
                            field1021[Statics.field3606][var59][var60] = null;
                        }
                        method473(var59, var60);
                    }
                }
            } else {
                if (field937 == 193) {
                    byte var63 = field1001.method2961();
                    int var64 = field1001.method2958();
                    int var65 = var64 >> 2;
                    int var66 = var64 & 0x3;
                    int var67 = field954[var65];
                    byte var68 = field1001.method2931();
                    int var69 = field1001.method2958();
                    int var70 = (var69 >> 4 & 0x7) + Statics.field1859;
                    int var71 = (var69 & 0x7) + Statics.field3278;
                    int var72 = field1001.method2932();
                    int var73 = field1001.method2932();
                    byte var74 = field1001.method2962();
                    byte var75 = field1001.method3078();
                    int var76 = field1001.method2967();
                    int var77 = field1001.method2976();
                    class75 var78;
                    if (field1012 == var76) {
                        var78 = Statics.field308;
                    } else {
                        var78 = field1032[var76];
                    }
                    if (var78 != null) {
                        class256 var79 = Statics.method564(var73);
                        int var80;
                        int var81;
                        if (var66 == 1 || var66 == 3) {
                            var80 = var79.field3431;
                            var81 = var79.field3453;
                        } else {
                            var80 = var79.field3453;
                            var81 = var79.field3431;
                        }
                        int var82 = (var80 >> 1) + var70;
                        int var83 = (var80 + 1 >> 1) + var70;
                        int var84 = (var81 >> 1) + var71;
                        int var85 = (var81 + 1 >> 1) + var71;
                        int[][] var86 = class62.field745[Statics.field3606];
                        int var87 = var86[var82][var84] + var86[var83][var84] + var86[var82][var85] + var86[var83][var85] >> 2;
                        int var88 = (var70 << 7) + (var80 << 6);
                        int var89 = (var71 << 7) + (var81 << 6);
                        class134 var90 = var79.method4229(var65, var66, var86, var88, var87, var89);
                        if (var90 != null) {
                            method139(Statics.field3606, var70, var71, var67, -1, 0, 0, var77 + 1, var72 + 1);
                            var78.field860 = field900 + var77;
                            var78.field874 = field900 + var72;
                            var78.field867 = var90;
                            var78.field864 = var70 * 128 + var80 * 64;
                            var78.field866 = var71 * 128 + var81 * 64;
                            var78.field865 = var87;
                            if (var75 > var74) {
                                byte var91 = var75;
                                var75 = var74;
                                var74 = var91;
                            }
                            if (var63 > var68) {
                                byte var92 = var63;
                                var63 = var68;
                                var68 = var92;
                            }
                            var78.field857 = var70 + var75;
                            var78.field870 = var70 + var74;
                            var78.field861 = var63 + var71;
                            var78.field871 = var68 + var71;
                        }
                    }
                }
                if (field937 == 19) {
                    int var93 = field1001.method2958();
                    int var94 = var93 >> 2;
                    int var95 = var93 & 0x3;
                    int var96 = field954[var94];
                    int var97 = field1001.method2976();
                    int var98 = field1001.method2930();
                    int var99 = (var98 >> 4 & 0x7) + Statics.field1859;
                    int var100 = (var98 & 0x7) + Statics.field3278;
                    if (var99 >= 0 && var100 >= 0 && var99 < 103 && var100 < 103) {
                        if (var96 == 0) {
                            class143 var101 = Statics.field596.method2663(Statics.field3606, var99, var100);
                            if (var101 != null) {
                                int var102 = var101.field2112 >> 14 & 0x7FFF;
                                if (var94 == 2) {
                                    var101.field2110 = new class101(var102, 2, var95 + 4, Statics.field3606, var99, var100, var97, false, var101.field2110);
                                    var101.field2109 = new class101(var102, 2, var95 + 1 & 0x3, Statics.field3606, var99, var100, var97, false, var101.field2109);
                                } else {
                                    var101.field2110 = new class101(var102, var94, var95, Statics.field3606, var99, var100, var97, false, var101.field2110);
                                }
                            }
                        }
                        if (var96 == 1) {
                            class148 var103 = Statics.field596.method2514(Statics.field3606, var99, var100);
                            if (var103 != null) {
                                int var104 = var103.field2157 >> 14 & 0x7FFF;
                                if (var94 == 4 || var94 == 5) {
                                    var103.field2155 = new class101(var104, 4, var95, Statics.field3606, var99, var100, var97, false, var103.field2155);
                                } else if (var94 == 6) {
                                    var103.field2155 = new class101(var104, 4, var95 + 4, Statics.field3606, var99, var100, var97, false, var103.field2155);
                                } else if (var94 == 7) {
                                    var103.field2155 = new class101(var104, 4, (var95 + 2 & 0x3) + 4, Statics.field3606, var99, var100, var97, false, var103.field2155);
                                } else if (var94 == 8) {
                                    var103.field2155 = new class101(var104, 4, var95 + 4, Statics.field3606, var99, var100, var97, false, var103.field2155);
                                    var103.field2152 = new class101(var104, 4, (var95 + 2 & 0x3) + 4, Statics.field3606, var99, var100, var97, false, var103.field2152);
                                }
                            }
                        }
                        if (var96 == 2) {
                            class149 var105 = Statics.field596.method2515(Statics.field3606, var99, var100);
                            if (var94 == 11) {
                                var94 = 10;
                            }
                            if (var105 != null) {
                                var105.field2164 = new class101(var105.field2166 >> 14 & 0x7FFF, var94, var95, Statics.field3606, var99, var100, var97, false, var105.field2164);
                            }
                        }
                        if (var96 == 3) {
                            class130 var106 = Statics.field596.method2516(Statics.field3606, var99, var100);
                            if (var106 != null) {
                                var106.field1849 = new class101(var106.field1846 >> 14 & 0x7FFF, 22, var95, Statics.field3606, var99, var100, var97, false, var106.field1849);
                            }
                        }
                    }
                } else if (field937 == 178) {
                    int var107 = field1001.method2930();
                    int var108 = (var107 >> 4 & 0x7) + Statics.field1859;
                    int var109 = (var107 & 0x7) + Statics.field3278;
                    int var110 = field1001.method2932();
                    int var111 = field1001.method2932();
                    int var112 = field1001.method2932();
                    if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                        class194 var113 = field1021[Statics.field3606][var108][var109];
                        if (var113 != null) {
                            for (class95 var114 = (class95) var113.method3376(); var114 != null; var114 = (class95) var113.method3377()) {
                                if ((var110 & 0x7FFF) == var114.field1474 && var114.field1475 == var111) {
                                    var114.field1475 = var112;
                                    break;
                                }
                            }
                            method473(var108, var109);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("n.gc(IIIIIIIIII)V")
    public static final void method139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class77 var9 = null;
        for (class77 var10 = (class77) field1022.method3376(); var10 != null; var10 = (class77) field1022.method3377()) {
            if (var10.field1175 == arg0 && var10.field1177 == arg1 && var10.field1178 == arg2 && var10.field1182 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class77();
            var9.field1175 = arg0;
            var9.field1182 = arg3;
            var9.field1177 = arg1;
            var9.field1178 = arg2;
            method1024(var9);
            field1022.method3371(var9);
        }
        var9.field1176 = arg4;
        var9.field1184 = arg5;
        var9.field1183 = arg6;
        var9.field1185 = arg7;
        var9.field1186 = arg8;
    }

    @ObfuscatedName("ag.gw(I)V")
    public static final void method481() {
        for (class77 var0 = (class77) field1022.method3376(); var0 != null; var0 = (class77) field1022.method3377()) {
            if (var0.field1186 == -1) {
                var0.field1185 = 0;
                method1024(var0);
            } else {
                var0.method3364();
            }
        }
    }

    @ObfuscatedName("bs.gs(Lbk;I)V")
    public static final void method1024(class77 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1182 == 0) {
            var1 = Statics.field596.method2517(arg0.field1175, arg0.field1177, arg0.field1178);
        }
        if (arg0.field1182 == 1) {
            var1 = Statics.field596.method2518(arg0.field1175, arg0.field1177, arg0.field1178);
        }
        if (arg0.field1182 == 2) {
            var1 = Statics.field596.method2605(arg0.field1175, arg0.field1177, arg0.field1178);
        }
        if (arg0.field1182 == 3) {
            var1 = Statics.field596.method2520(arg0.field1175, arg0.field1177, arg0.field1178);
        }
        if (var1 != 0) {
            int var5 = Statics.field596.method2680(arg0.field1175, arg0.field1177, arg0.field1178, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1179 = var2;
        arg0.field1181 = var3;
        arg0.field1180 = var4;
    }

    @ObfuscatedName("bn.gj(S)V")
    public static final void method991() {
        for (class77 var0 = (class77) field1022.method3376(); var0 != null; var0 = (class77) field1022.method3377()) {
            if (var0.field1186 > 0) {
                var0.field1186--;
            }
            if (var0.field1186 != 0) {
                if (var0.field1185 > 0) {
                    var0.field1185--;
                }
                if (var0.field1185 == 0 && var0.field1177 >= 1 && var0.field1178 >= 1 && var0.field1177 <= 102 && var0.field1178 <= 102 && (var0.field1176 < 0 || class62.method1471(var0.field1176, var0.field1184))) {
                    method2738(var0.field1175, var0.field1182, var0.field1177, var0.field1178, var0.field1176, var0.field1183, var0.field1184);
                    var0.field1185 = -1;
                    if (var0.field1179 == var0.field1176 && var0.field1179 == -1) {
                        var0.method3364();
                    } else if (var0.field1179 == var0.field1176 && var0.field1183 == var0.field1180 && var0.field1184 == var0.field1181) {
                        var0.method3364();
                    }
                }
            } else if (var0.field1179 < 0 || class62.method1471(var0.field1179, var0.field1181)) {
                method2738(var0.field1175, var0.field1182, var0.field1177, var0.field1178, var0.field1179, var0.field1180, var0.field1181);
                var0.method3364();
            }
        }
    }

    @ObfuscatedName("ev.gb(IIIIIIII)V")
    public static final void method2738(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field896 && Statics.field3606 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field596.method2517(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field596.method2518(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field596.method2605(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field596.method2520(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field596.method2680(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field596.method2508(arg0, arg2, arg3);
                class256 var15 = Statics.method564(var12);
                if (var15.field3447 != 0) {
                    field951[arg0].method2814(arg2, arg3, var13, var14, var15.field3448);
                }
            }
            if (arg1 == 1) {
                Statics.field596.method2524(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field596.method2584(arg0, arg2, arg3);
                class256 var16 = Statics.method564(var12);
                if (var16.field3453 + arg2 > 103 || var16.field3453 + arg3 > 103 || var16.field3431 + arg2 > 103 || var16.field3431 + arg3 > 103) {
                    return;
                }
                if (var16.field3447 != 0) {
                    field951[arg0].method2824(arg2, arg3, var16.field3453, var16.field3431, var14, var16.field3448);
                }
            }
            if (arg1 == 3) {
                Statics.field596.method2511(arg0, arg2, arg3);
                class256 var17 = Statics.method564(var12);
                if (var17.field3447 == 1) {
                    field951[arg0].method2815(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class62.field742[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class140 var19 = Statics.field596;
        class162 var20 = field951[arg0];
        class256 var21 = Statics.method564(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field3431;
            var23 = var21.field3453;
        } else {
            var22 = var21.field3453;
            var23 = var21.field3431;
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
        int[][] var28 = class62.field745[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field3457 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field3444 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class142 var34;
            if (var21.field3445 == -1 && var21.field3471 == null) {
                var34 = var21.method4229(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class101(arg4, 22, arg5, var18, arg2, arg3, var21.field3445, true, (class142) null);
            }
            var19.method2499(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field3447 == 1) {
                var20.method2808(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class142 var57;
            if (var21.field3445 == -1 && var21.field3471 == null) {
                var57 = var21.method4229(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class101(arg4, 10, arg5, var18, arg2, arg3, var21.field3445, true, (class142) null);
            }
            if (var57 != null) {
                var19.method2571(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field3447 != 0) {
                var20.method2810(arg2, arg3, var22, var23, var21.field3448);
            }
        } else if (arg6 >= 12) {
            class142 var35;
            if (var21.field3445 == -1 && var21.field3471 == null) {
                var35 = var21.method4229(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class101(arg4, arg6, arg5, var18, arg2, arg3, var21.field3445, true, (class142) null);
            }
            var19.method2571(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field3447 != 0) {
                var20.method2810(arg2, arg3, var22, var23, var21.field3448);
            }
        } else if (arg6 == 0) {
            class142 var36;
            if (var21.field3445 == -1 && var21.field3471 == null) {
                var36 = var21.method4229(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class101(arg4, 0, arg5, var18, arg2, arg3, var21.field3445, true, (class142) null);
            }
            var19.method2501(arg0, arg2, arg3, var29, var36, (class142) null, class62.field756[arg5], 0, var32, var33);
            if (var21.field3447 != 0) {
                var20.method2836(arg2, arg3, arg6, arg5, var21.field3448);
            }
        } else if (arg6 == 1) {
            class142 var37;
            if (var21.field3445 == -1 && var21.field3471 == null) {
                var37 = var21.method4229(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class101(arg4, 1, arg5, var18, arg2, arg3, var21.field3445, true, (class142) null);
            }
            var19.method2501(arg0, arg2, arg3, var29, var37, (class142) null, class62.field751[arg5], 0, var32, var33);
            if (var21.field3447 != 0) {
                var20.method2836(arg2, arg3, arg6, arg5, var21.field3448);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class142 var39;
            class142 var40;
            if (var21.field3445 == -1 && var21.field3471 == null) {
                var39 = var21.method4229(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method4229(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class101(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field3445, true, (class142) null);
                var40 = new class101(arg4, 2, var38, var18, arg2, arg3, var21.field3445, true, (class142) null);
            }
            var19.method2501(arg0, arg2, arg3, var29, var39, var40, class62.field756[arg5], class62.field756[var38], var32, var33);
            if (var21.field3447 != 0) {
                var20.method2836(arg2, arg3, arg6, arg5, var21.field3448);
            }
        } else if (arg6 == 3) {
            class142 var41;
            if (var21.field3445 == -1 && var21.field3471 == null) {
                var41 = var21.method4229(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class101(arg4, 3, arg5, var18, arg2, arg3, var21.field3445, true, (class142) null);
            }
            var19.method2501(arg0, arg2, arg3, var29, var41, (class142) null, class62.field751[arg5], 0, var32, var33);
            if (var21.field3447 != 0) {
                var20.method2836(arg2, arg3, arg6, arg5, var21.field3448);
            }
        } else if (arg6 == 9) {
            class142 var42;
            if (var21.field3445 == -1 && var21.field3471 == null) {
                var42 = var21.method4229(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class101(arg4, arg6, arg5, var18, arg2, arg3, var21.field3445, true, (class142) null);
            }
            var19.method2571(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field3447 != 0) {
                var20.method2810(arg2, arg3, var22, var23, var21.field3448);
            }
        } else if (arg6 == 4) {
            class142 var43;
            if (var21.field3445 == -1 && var21.field3471 == null) {
                var43 = var21.method4229(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class101(arg4, 4, arg5, var18, arg2, arg3, var21.field3445, true, (class142) null);
            }
            var19.method2561(arg0, arg2, arg3, var29, var43, (class142) null, class62.field756[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method2517(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = Statics.method564(var45 >> 14 & 0x7FFF).field3454;
            }
            class142 var46;
            if (var21.field3445 == -1 && var21.field3471 == null) {
                var46 = var21.method4229(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class101(arg4, 4, arg5, var18, arg2, arg3, var21.field3445, true, (class142) null);
            }
            var19.method2561(arg0, arg2, arg3, var29, var46, (class142) null, class62.field756[arg5], 0, class62.field752[arg5] * var44, class62.field758[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method2517(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = Statics.method564(var48 >> 14 & 0x7FFF).field3454 / 2;
            }
            class142 var49;
            if (var21.field3445 == -1 && var21.field3471 == null) {
                var49 = var21.method4229(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class101(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3445, true, (class142) null);
            }
            var19.method2561(arg0, arg2, arg3, var29, var49, (class142) null, 256, arg5, class62.field754[arg5] * var47, class62.field743[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class142 var51;
            if (var21.field3445 == -1 && var21.field3471 == null) {
                var51 = var21.method4229(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class101(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field3445, true, (class142) null);
            }
            var19.method2561(arg0, arg2, arg3, var29, var51, (class142) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method2517(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = Statics.method564(var53 >> 14 & 0x7FFF).field3454 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class142 var55;
            class142 var56;
            if (var21.field3445 == -1 && var21.field3471 == null) {
                var55 = var21.method4229(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method4229(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class101(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3445, true, (class142) null);
                var56 = new class101(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field3445, true, (class142) null);
            }
            var19.method2561(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class62.field754[arg5] * var52, class62.field743[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("ar.go(III)V")
    public static final void method473(int arg0, int arg1) {
        class194 var2 = field1021[Statics.field3606][arg0][arg1];
        if (var2 == null) {
            Statics.field596.method2512(Statics.field3606, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class95 var5 = null;
        for (class95 var6 = (class95) var2.method3376(); var6 != null; var6 = (class95) var2.method3377()) {
            class257 var7 = class257.method678(var6.field1474);
            long var8 = (long) var7.field3504;
            if (var7.field3490 == 1) {
                var8 = (long) (var6.field1475 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field596.method2512(Statics.field3606, arg0, arg1);
            return;
        }
        var2.method3402(var5);
        class95 var10 = null;
        class95 var11 = null;
        for (class95 var12 = (class95) var2.method3376(); var12 != null; var12 = (class95) var2.method3377()) {
            if (var5.field1474 != var12.field1474) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1474 != var12.field1474 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field596.method2500(Statics.field3606, arg0, arg1, method1028(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field3606), var5, var13, var10, var11);
    }

    @ObfuscatedName("fx.gt(ZI)V")
    public static final void method2842(boolean arg0) {
        field1159 = 0;
        field931 = 0;
        method1016();
        while (field1001.method3184(field936) >= 27) {
            int var1 = field1001.method3186(15);
            if (var1 == 32767) {
                break;
            }
            boolean var31 = false;
            if (field928[var1] == null) {
                field928[var1] = new class87();
                var31 = true;
            }
            class87 var32 = field928[var1];
            field1014[++field929 - 1] = var1;
            var32.field1246 = field900;
            int var33 = field1001.method3186(1);
            int var34;
            if (arg0) {
                var34 = field1001.method3186(8);
                if (var34 > 127) {
                    var34 -= 256;
                }
            } else {
                var34 = field1001.method3186(5);
                if (var34 > 15) {
                    var34 -= 32;
                }
            }
            int var35 = field1019[field1001.method3186(3)];
            if (var31) {
                var32.field1248 = var32.field1201 = var35;
            }
            var32.field1354 = Statics.method3810(field1001.method3186(14));
            int var36;
            if (arg0) {
                var36 = field1001.method3186(8);
                if (var36 > 127) {
                    var36 -= 256;
                }
            } else {
                var36 = field1001.method3186(5);
                if (var36 > 15) {
                    var36 -= 32;
                }
            }
            int var37 = field1001.method3186(1);
            if (var37 == 1) {
                field932[++field931 - 1] = var1;
            }
            var32.field1203 = var32.field1354.field3549;
            var32.field1210 = var32.field1354.field3572;
            if (var32.field1210 == 0) {
                var32.field1201 = 0;
            }
            var32.field1228 = var32.field1354.field3555;
            var32.field1252 = var32.field1354.field3556;
            var32.field1209 = var32.field1354.field3557;
            var32.field1227 = var32.field1354.field3546;
            var32.field1204 = var32.field1354.field3561;
            var32.field1205 = var32.field1354.field3574;
            var32.field1206 = var32.field1354.field3554;
            var32.method1585(Statics.field308.field1254[0] + var34, Statics.field308.field1255[0] + var36, var33 == 1);
        }
        field1001.method3182();
        for (int var2 = 0; var2 < field931; var2++) {
            int var3 = field932[var2];
            class87 var4 = field928[var3];
            int var5 = field1001.method2930();
            if ((var5 & 0x2) != 0) {
                var4.field1219 = field1001.method2920();
                if (var4.field1219 == 65535) {
                    var4.field1219 = -1;
                }
            }
            if ((var5 & 0x40) != 0) {
                var4.field1236 = field1001.method2932();
                int var6 = field1001.method3041();
                var4.field1240 = var6 >> 16;
                var4.field1207 = (var6 & 0xFFFF) + field900;
                var4.field1229 = 0;
                var4.field1238 = 0;
                if (var4.field1207 > field900) {
                    var4.field1229 = -1;
                }
                if (var4.field1236 == 65535) {
                    var4.field1236 = -1;
                }
            }
            if ((var5 & 0x8) != 0) {
                int var7 = field1001.method2976();
                int var8 = field1001.method2920();
                int var9 = var4.field1247 - (var7 - Statics.field2304 - Statics.field2304) * 64;
                int var10 = var4.field1200 - (var8 - Statics.field2147 - Statics.field2147) * 64;
                if (var9 != 0 || var10 != 0) {
                    var4.field1231 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                }
            }
            if ((var5 & 0x1) != 0) {
                int var11 = field1001.method2932();
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = field1001.method2991();
                if (var4.field1241 == var11 && var11 != -1) {
                    int var13 = class261.method2856(var11).field3612;
                    if (var13 == 1) {
                        var4.field1232 = 0;
                        var4.field1221 = 0;
                        var4.field1233 = var12;
                        var4.field1235 = 0;
                    }
                    if (var13 == 2) {
                        var4.field1235 = 0;
                    }
                } else if (var11 == -1 || var4.field1241 == -1 || class261.method2856(var11).field3598 >= class261.method2856(var4.field1241).field3598) {
                    var4.field1241 = var11;
                    var4.field1232 = 0;
                    var4.field1221 = 0;
                    var4.field1233 = var12;
                    var4.field1235 = 0;
                    var4.field1237 = var4.field1253;
                }
            }
            if ((var5 & 0x10) != 0) {
                int var14 = field1001.method3036();
                if (var14 > 0) {
                    for (int var15 = 0; var15 < var14; var15++) {
                        int var16 = -1;
                        int var17 = -1;
                        int var18 = -1;
                        int var19 = field1001.method2943();
                        if (var19 == 32767) {
                            var19 = field1001.method2943();
                            var17 = field1001.method2943();
                            var16 = field1001.method2943();
                            var18 = field1001.method2943();
                        } else if (var19 == 32766) {
                            var19 = -1;
                        } else {
                            var17 = field1001.method2943();
                        }
                        int var20 = field1001.method2943();
                        var4.method1406(var19, var17, var16, var18, field900, var20);
                    }
                }
                int var21 = field1001.method2991();
                if (var21 > 0) {
                    for (int var22 = 0; var22 < var21; var22++) {
                        int var23 = field1001.method2943();
                        int var24 = field1001.method2943();
                        if (var24 == 32767) {
                            var4.method1408(var23);
                        } else {
                            int var25 = field1001.method2943();
                            int var26 = field1001.method2991();
                            int var27 = var24 > 0 ? field1001.method2958() : var26;
                            var4.method1407(var23, field900, var24, var25, var26, var27);
                        }
                    }
                }
            }
            if ((var5 & 0x4) != 0) {
                var4.field1354 = Statics.method3810(field1001.method2976());
                var4.field1203 = var4.field1354.field3549;
                var4.field1210 = var4.field1354.field3572;
                var4.field1228 = var4.field1354.field3555;
                var4.field1252 = var4.field1354.field3556;
                var4.field1209 = var4.field1354.field3557;
                var4.field1227 = var4.field1354.field3546;
                var4.field1204 = var4.field1354.field3561;
                var4.field1205 = var4.field1354.field3574;
                var4.field1206 = var4.field1354.field3554;
            }
            if ((var5 & 0x20) != 0) {
                var4.field1212 = field1001.method2938();
                var4.field1215 = 100;
            }
        }
        for (int var28 = 0; var28 < field1159; var28++) {
            int var29 = field1088[var28];
            if (field900 != field928[var29].field1246) {
                field928[var29].field1354 = null;
                field928[var29] = null;
            }
        }
        if (field936 != field1001.field2384) {
            throw new RuntimeException(field1001.field2384 + class89.field1375 + field936);
        }
        for (int var30 = 0; var30 < field929; var30++) {
            if (field928[field1014[var30]] == null) {
                throw new RuntimeException(var30 + class89.field1375 + field929);
            }
        }
    }

    @ObfuscatedName("bs.gh(I)V")
    public static final void method1016() {
        field1001.method3185();
        int var0 = field1001.method3186(8);
        if (var0 < field929) {
            for (int var1 = var0; var1 < field929; var1++) {
                field1088[++field1159 - 1] = field1014[var1];
            }
        }
        if (var0 > field929) {
            throw new RuntimeException("");
        }
        field929 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field1014[var2];
            class87 var4 = field928[var3];
            int var5 = field1001.method3186(1);
            if (var5 == 0) {
                field1014[++field929 - 1] = var3;
                var4.field1246 = field900;
            } else {
                int var6 = field1001.method3186(2);
                if (var6 == 0) {
                    field1014[++field929 - 1] = var3;
                    var4.field1246 = field900;
                    field932[++field931 - 1] = var3;
                } else if (var6 == 1) {
                    field1014[++field929 - 1] = var3;
                    var4.field1246 = field900;
                    int var7 = field1001.method3186(3);
                    var4.method1584(var7, (byte) 1);
                    int var8 = field1001.method3186(1);
                    if (var8 == 1) {
                        field932[++field931 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field1014[++field929 - 1] = var3;
                    var4.field1246 = field900;
                    int var9 = field1001.method3186(3);
                    var4.method1584(var9, (byte) 2);
                    int var10 = field1001.method3186(3);
                    var4.method1584(var10, (byte) 2);
                    int var11 = field1001.method3186(1);
                    if (var11 == 1) {
                        field932[++field931 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field1088[++field1159 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("ag.gr(Lbj;IIBI)V")
    public static final void method487(class75 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field1254[0];
        int var5 = arg0.field1255[0];
        int var6 = arg0.method1052();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method1052();
        field1169.field2290 = arg1;
        field1169.field2288 = arg2;
        field1169.field2289 = 1;
        field1169.field2287 = 1;
        class74 var8 = field1169;
        class74 var9 = var8;
        class162 var10 = field951[arg0.field875];
        int[] var11 = field1170;
        int[] var12 = field1171;
        for (int var13 = 0; var13 < 128; var13++) {
            for (int var14 = 0; var14 < 128; var14++) {
                class163.field2282[var13][var14] = 0;
                class163.field2283[var13][var14] = 99999999;
            }
        }
        boolean var30;
        if (var7 == 1) {
            int var15 = var4;
            int var16 = var5;
            byte var17 = 64;
            byte var18 = 64;
            int var19 = var4 - var17;
            int var20 = var5 - var18;
            class163.field2282[var17][var18] = 99;
            class163.field2283[var17][var18] = 0;
            byte var21 = 0;
            int var22 = 0;
            class163.field2285[var21] = var4;
            int var71 = var21 + 1;
            class163.field2280[var21] = var5;
            int[][] var23 = var10.field2276;
            boolean var28;
            while (true) {
                if (var71 == var22) {
                    Statics.field2281 = var15;
                    Statics.field3135 = var16;
                    var28 = false;
                    break;
                }
                var15 = class163.field2285[var22];
                var16 = class163.field2280[var22];
                var22 = var22 + 1 & 0xFFF;
                int var24 = var15 - var19;
                int var25 = var16 - var20;
                int var26 = var15 - var10.field2272;
                int var27 = var16 - var10.field2278;
                if (var9.method1043(1, var15, var16, var10)) {
                    Statics.field2281 = var15;
                    Statics.field3135 = var16;
                    var28 = true;
                    break;
                }
                int var29 = class163.field2283[var24][var25] + 1;
                if (var24 > 0 && class163.field2282[var24 - 1][var25] == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0) {
                    class163.field2285[var71] = var15 - 1;
                    class163.field2280[var71] = var16;
                    var71 = var71 + 1 & 0xFFF;
                    class163.field2282[var24 - 1][var25] = 2;
                    class163.field2283[var24 - 1][var25] = var29;
                }
                if (var24 < 127 && class163.field2282[var24 + 1][var25] == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0) {
                    class163.field2285[var71] = var15 + 1;
                    class163.field2280[var71] = var16;
                    var71 = var71 + 1 & 0xFFF;
                    class163.field2282[var24 + 1][var25] = 8;
                    class163.field2283[var24 + 1][var25] = var29;
                }
                if (var25 > 0 && class163.field2282[var24][var25 - 1] == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                    class163.field2285[var71] = var15;
                    class163.field2280[var71] = var16 - 1;
                    var71 = var71 + 1 & 0xFFF;
                    class163.field2282[var24][var25 - 1] = 1;
                    class163.field2283[var24][var25 - 1] = var29;
                }
                if (var25 < 127 && class163.field2282[var24][var25 + 1] == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                    class163.field2285[var71] = var15;
                    class163.field2280[var71] = var16 + 1;
                    var71 = var71 + 1 & 0xFFF;
                    class163.field2282[var24][var25 + 1] = 4;
                    class163.field2283[var24][var25 + 1] = var29;
                }
                if (var24 > 0 && var25 > 0 && class163.field2282[var24 - 1][var25 - 1] == 0 && (var23[var26 - 1][var27 - 1] & 0x124010E) == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                    class163.field2285[var71] = var15 - 1;
                    class163.field2280[var71] = var16 - 1;
                    var71 = var71 + 1 & 0xFFF;
                    class163.field2282[var24 - 1][var25 - 1] = 3;
                    class163.field2283[var24 - 1][var25 - 1] = var29;
                }
                if (var24 < 127 && var25 > 0 && class163.field2282[var24 + 1][var25 - 1] == 0 && (var23[var26 + 1][var27 - 1] & 0x1240183) == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                    class163.field2285[var71] = var15 + 1;
                    class163.field2280[var71] = var16 - 1;
                    var71 = var71 + 1 & 0xFFF;
                    class163.field2282[var24 + 1][var25 - 1] = 9;
                    class163.field2283[var24 + 1][var25 - 1] = var29;
                }
                if (var24 > 0 && var25 < 127 && class163.field2282[var24 - 1][var25 + 1] == 0 && (var23[var26 - 1][var27 + 1] & 0x1240138) == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                    class163.field2285[var71] = var15 - 1;
                    class163.field2280[var71] = var16 + 1;
                    var71 = var71 + 1 & 0xFFF;
                    class163.field2282[var24 - 1][var25 + 1] = 6;
                    class163.field2283[var24 - 1][var25 + 1] = var29;
                }
                if (var24 < 127 && var25 < 127 && class163.field2282[var24 + 1][var25 + 1] == 0 && (var23[var26 + 1][var27 + 1] & 0x12401E0) == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                    class163.field2285[var71] = var15 + 1;
                    class163.field2280[var71] = var16 + 1;
                    var71 = var71 + 1 & 0xFFF;
                    class163.field2282[var24 + 1][var25 + 1] = 12;
                    class163.field2283[var24 + 1][var25 + 1] = var29;
                }
            }
            var30 = var28;
        } else if (var7 == 2) {
            int var31 = var4;
            int var32 = var5;
            byte var33 = 64;
            byte var34 = 64;
            int var35 = var4 - var33;
            int var36 = var5 - var34;
            class163.field2282[var33][var34] = 99;
            class163.field2283[var33][var34] = 0;
            byte var37 = 0;
            int var38 = 0;
            class163.field2285[var37] = var4;
            int var72 = var37 + 1;
            class163.field2280[var37] = var5;
            int[][] var39 = var10.field2276;
            boolean var44;
            while (true) {
                if (var72 == var38) {
                    Statics.field2281 = var31;
                    Statics.field3135 = var32;
                    var44 = false;
                    break;
                }
                var31 = class163.field2285[var38];
                var32 = class163.field2280[var38];
                var38 = var38 + 1 & 0xFFF;
                int var40 = var31 - var35;
                int var41 = var32 - var36;
                int var42 = var31 - var10.field2272;
                int var43 = var32 - var10.field2278;
                if (var9.method1043(2, var31, var32, var10)) {
                    Statics.field2281 = var31;
                    Statics.field3135 = var32;
                    var44 = true;
                    break;
                }
                int var45 = class163.field2283[var40][var41] + 1;
                if (var40 > 0 && class163.field2282[var40 - 1][var41] == 0 && (var39[var42 - 1][var43] & 0x124010E) == 0 && (var39[var42 - 1][var43 + 1] & 0x1240138) == 0) {
                    class163.field2285[var72] = var31 - 1;
                    class163.field2280[var72] = var32;
                    var72 = var72 + 1 & 0xFFF;
                    class163.field2282[var40 - 1][var41] = 2;
                    class163.field2283[var40 - 1][var41] = var45;
                }
                if (var40 < 126 && class163.field2282[var40 + 1][var41] == 0 && (var39[var42 + 2][var43] & 0x1240183) == 0 && (var39[var42 + 2][var43 + 1] & 0x12401E0) == 0) {
                    class163.field2285[var72] = var31 + 1;
                    class163.field2280[var72] = var32;
                    var72 = var72 + 1 & 0xFFF;
                    class163.field2282[var40 + 1][var41] = 8;
                    class163.field2283[var40 + 1][var41] = var45;
                }
                if (var41 > 0 && class163.field2282[var40][var41 - 1] == 0 && (var39[var42][var43 - 1] & 0x124010E) == 0 && (var39[var42 + 1][var43 - 1] & 0x1240183) == 0) {
                    class163.field2285[var72] = var31;
                    class163.field2280[var72] = var32 - 1;
                    var72 = var72 + 1 & 0xFFF;
                    class163.field2282[var40][var41 - 1] = 1;
                    class163.field2283[var40][var41 - 1] = var45;
                }
                if (var41 < 126 && class163.field2282[var40][var41 + 1] == 0 && (var39[var42][var43 + 2] & 0x1240138) == 0 && (var39[var42 + 1][var43 + 2] & 0x12401E0) == 0) {
                    class163.field2285[var72] = var31;
                    class163.field2280[var72] = var32 + 1;
                    var72 = var72 + 1 & 0xFFF;
                    class163.field2282[var40][var41 + 1] = 4;
                    class163.field2283[var40][var41 + 1] = var45;
                }
                if (var40 > 0 && var41 > 0 && class163.field2282[var40 - 1][var41 - 1] == 0 && (var39[var42 - 1][var43] & 0x124013E) == 0 && (var39[var42 - 1][var43 - 1] & 0x124010E) == 0 && (var39[var42][var43 - 1] & 0x124018F) == 0) {
                    class163.field2285[var72] = var31 - 1;
                    class163.field2280[var72] = var32 - 1;
                    var72 = var72 + 1 & 0xFFF;
                    class163.field2282[var40 - 1][var41 - 1] = 3;
                    class163.field2283[var40 - 1][var41 - 1] = var45;
                }
                if (var40 < 126 && var41 > 0 && class163.field2282[var40 + 1][var41 - 1] == 0 && (var39[var42 + 1][var43 - 1] & 0x124018F) == 0 && (var39[var42 + 2][var43 - 1] & 0x1240183) == 0 && (var39[var42 + 2][var43] & 0x12401E3) == 0) {
                    class163.field2285[var72] = var31 + 1;
                    class163.field2280[var72] = var32 - 1;
                    var72 = var72 + 1 & 0xFFF;
                    class163.field2282[var40 + 1][var41 - 1] = 9;
                    class163.field2283[var40 + 1][var41 - 1] = var45;
                }
                if (var40 > 0 && var41 < 126 && class163.field2282[var40 - 1][var41 + 1] == 0 && (var39[var42 - 1][var43 + 1] & 0x124013E) == 0 && (var39[var42 - 1][var43 + 2] & 0x1240138) == 0 && (var39[var42][var43 + 2] & 0x12401F8) == 0) {
                    class163.field2285[var72] = var31 - 1;
                    class163.field2280[var72] = var32 + 1;
                    var72 = var72 + 1 & 0xFFF;
                    class163.field2282[var40 - 1][var41 + 1] = 6;
                    class163.field2283[var40 - 1][var41 + 1] = var45;
                }
                if (var40 < 126 && var41 < 126 && class163.field2282[var40 + 1][var41 + 1] == 0 && (var39[var42 + 1][var43 + 2] & 0x12401F8) == 0 && (var39[var42 + 2][var43 + 2] & 0x12401E0) == 0 && (var39[var42 + 2][var43 + 1] & 0x12401E3) == 0) {
                    class163.field2285[var72] = var31 + 1;
                    class163.field2280[var72] = var32 + 1;
                    var72 = var72 + 1 & 0xFFF;
                    class163.field2282[var40 + 1][var41 + 1] = 12;
                    class163.field2283[var40 + 1][var41 + 1] = var45;
                }
            }
            var30 = var44;
        } else {
            var30 = class163.method71(var4, var5, var7, var8, var10);
        }
        int var64;
        label424: {
            int var46 = var4 - 64;
            int var47 = var5 - 64;
            int var48 = Statics.field2281;
            int var49 = Statics.field3135;
            if (!var30) {
                int var50 = Integer.MAX_VALUE;
                int var51 = Integer.MAX_VALUE;
                byte var52 = 10;
                int var53 = var9.field2290;
                int var54 = var9.field2288;
                int var55 = var9.field2289;
                int var56 = var9.field2287;
                for (int var57 = var53 - var52; var57 <= var52 + var53; var57++) {
                    for (int var58 = var54 - var52; var58 <= var52 + var54; var58++) {
                        int var59 = var57 - var46;
                        int var60 = var58 - var47;
                        if (var59 >= 0 && var60 >= 0 && var59 < 128 && var60 < 128 && class163.field2283[var59][var60] < 100) {
                            int var61 = 0;
                            if (var57 < var53) {
                                var61 = var53 - var57;
                            } else if (var57 > var53 + var55 - 1) {
                                var61 = var57 - (var53 + var55 - 1);
                            }
                            int var62 = 0;
                            if (var58 < var54) {
                                var62 = var54 - var58;
                            } else if (var58 > var54 + var56 - 1) {
                                var62 = var58 - (var54 + var56 - 1);
                            }
                            int var63 = var61 * var61 + var62 * var62;
                            if (var63 < var50 || var50 == var63 && class163.field2283[var59][var60] < var51) {
                                var50 = var63;
                                var51 = class163.field2283[var59][var60];
                                var48 = var57;
                                var49 = var58;
                            }
                        }
                    }
                }
                if (var50 == Integer.MAX_VALUE) {
                    var64 = -1;
                    break label424;
                }
            }
            if (var4 == var48 && var5 == var49) {
                var64 = 0;
            } else {
                byte var65 = 0;
                class163.field2285[var65] = var48;
                int var73 = var65 + 1;
                class163.field2280[var65] = var49;
                int var66;
                int var67 = var66 = class163.field2282[var48 - var46][var49 - var47];
                while (var4 != var48 || var5 != var49) {
                    if (var66 != var67) {
                        var66 = var67;
                        class163.field2285[var73] = var48;
                        class163.field2280[var73++] = var49;
                    }
                    if ((var67 & 0x2) != 0) {
                        var48++;
                    } else if ((var67 & 0x8) != 0) {
                        var48--;
                    }
                    if ((var67 & 0x1) != 0) {
                        var49++;
                    } else if ((var67 & 0x4) != 0) {
                        var49--;
                    }
                    var67 = class163.field2282[var48 - var46][var49 - var47];
                }
                int var68 = 0;
                while (var73-- > 0) {
                    var11[var68] = class163.field2285[var73];
                    var12[var68++] = class163.field2280[var73];
                    if (var68 >= var11.length) {
                        break;
                    }
                }
                var64 = var68;
            }
        }
        int var69 = var64;
        if (var64 >= 1) {
            for (int var70 = 0; var70 < var69 - 1; var70++) {
                arg0.method1073(field1170[var70], field1171[var70], arg3);
            }
        }
    }

    @ObfuscatedName("bd.gy(I)V")
    public static void method685() {
        field961 = 0;
        field1038 = -1;
        field1029 = false;
    }

    @ObfuscatedName("iy.gp(I)V")
    public static void method3934() {
        method685();
        field895[0] = class226.field2853;
        field1036[0] = "";
        field1033[0] = 1006;
        field961 = 1;
    }

    @ObfuscatedName("as.gf(IIIII)V")
    public static final void method574(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1094; var4++) {
            if (field1101[var4] + field1099[var4] > arg0 && field1099[var4] < arg0 + arg2 && field992[var4] + field1102[var4] > arg1 && field992[var4] < arg1 + arg3) {
                field1096[var4] = true;
            }
        }
    }

    @ObfuscatedName("ct.ge(IIIIB)V")
    public static final void method1748(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1094; var4++) {
            if (field1101[var4] + field1099[var4] > arg0 && field1099[var4] < arg0 + arg2 && field992[var4] + field1102[var4] > arg1 && field992[var4] < arg1 + arg3) {
                field1097[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hz(I)V")
    public final void method1348() {
        method2404();
        if (Statics.field324 != null || field962 != null) {
            return;
        }
        int var1 = class60.field728;
        if (field1029) {
            if (var1 != 1 && (Statics.field2179 || var1 != 4)) {
                int var2 = class60.field722;
                int var3 = class60.field723 * -113761157;
                if (var2 < Statics.field2203 - 10 || var2 > Statics.field3380 + Statics.field2203 + 10 || var3 < Statics.field3789 - 10 || var3 > Statics.field3789 + Statics.field1752 + 10) {
                    field1029 = false;
                    method574(Statics.field2203, Statics.field3789, Statics.field3380, Statics.field1752);
                }
            }
            if (var1 == 1 || !Statics.field2179 && var1 == 4) {
                int var4 = Statics.field2203;
                int var5 = Statics.field3789;
                int var6 = Statics.field3380;
                int var7 = class60.field718;
                int var8 = class60.field730;
                int var9 = -1;
                for (int var10 = 0; var10 < field961; var10++) {
                    int var11 = (field961 - 1 - var10) * 15 + var5 + 31;
                    if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    method2694(var9);
                }
                field1029 = false;
                method574(Statics.field2203, Statics.field3789, Statics.field3380, Statics.field1752);
            }
            return;
        }
        int var12 = method1567();
        if ((var1 == 1 || !Statics.field2179 && var1 == 4) && var12 >= 0) {
            int var13 = field1033[var12];
            if (var13 == 39 || var13 == 40 || var13 == 41 || var13 == 42 || var13 == 43 || var13 == 33 || var13 == 34 || var13 == 35 || var13 == 36 || var13 == 37 || var13 == 38 || var13 == 1005) {
                int var14 = field1031[var12];
                int var15 = field1042[var12];
                class217 var16 = class217.method4432(var15);
                if (class218.method2491(Statics.method555(var16)) || class218.method944(Statics.method555(var16))) {
                    if (Statics.field324 != null && !field1008) {
                        int var17 = method1567();
                        if (field1028 != 1) {
                            boolean var18;
                            if (var17 < 0) {
                                var18 = false;
                            } else {
                                int var19 = field1033[var17];
                                if (var19 >= 2000) {
                                    var19 -= 2000;
                                }
                                if (var19 == 1007) {
                                    var18 = true;
                                } else {
                                    var18 = false;
                                }
                            }
                            if (!var18 && field961 > 0) {
                                Statics.method102(field994, field971);
                            }
                        }
                    }
                    field1008 = false;
                    field1091 = 0;
                    if (Statics.field324 != null) {
                        method3808(Statics.field324);
                    }
                    Statics.field324 = class217.method4432(var15);
                    field1106 = var14;
                    field994 = class60.field718;
                    field971 = class60.field730;
                    if (var12 >= 0) {
                        Statics.field236 = new class90();
                        Statics.field236.field1382 = field1031[var12];
                        Statics.field236.field1395 = field1042[var12];
                        Statics.field236.field1383 = field1033[var12];
                        Statics.field236.field1392 = field1034[var12];
                        Statics.field236.field1385 = field895[var12];
                    }
                    method3808(Statics.field324);
                    return;
                }
            }
        }
        if (var1 == 1 || !Statics.field2179 && var1 == 4) {
            label242: {
                label228: {
                    if (field1028 == 1 && field961 > 2) {
                        boolean var20;
                        if (field961 <= 0) {
                            var20 = false;
                        } else if (field1006 && class51.field625[81] && field1038 != -1) {
                            var20 = true;
                        } else {
                            var20 = false;
                        }
                        if (!var20) {
                            break label228;
                        }
                    }
                    boolean var21;
                    if (var12 < 0) {
                        var21 = false;
                    } else {
                        int var22 = field1033[var12];
                        if (var22 >= 2000) {
                            var22 -= 2000;
                        }
                        if (var22 == 1007) {
                            var21 = true;
                        } else {
                            var21 = false;
                        }
                    }
                    if (!var21) {
                        break label242;
                    }
                }
                var1 = 2;
            }
        }
        if ((var1 == 1 || !Statics.field2179 && var1 == 4) && field961 > 0) {
            method2694(var12);
        }
        if (var1 == 2 && field961 > 0) {
            this.method1132(class60.field718, class60.field730);
        }
    }

    @ObfuscatedName("client.hb(III)V")
    public final void method1132(int arg0, int arg1) {
        int var3 = Statics.field532.method4448(class226.field2848);
        for (int var4 = 0; var4 < field961; var4++) {
            int var5 = Statics.field532.method4448(method606(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field961 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field3627) {
            var7 = Statics.field3627 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field321) {
            var8 = Statics.field321 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field596.method2528(Statics.field3606, arg0, arg1, false);
        field1029 = true;
        Statics.field2203 = var7;
        Statics.field3789 = var8;
        Statics.field3380 = var3;
        Statics.field1752 = field961 * 15 + 22;
    }

    @ObfuscatedName("ec.hj(II)V")
    public static final void method2694(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field1031[arg0];
        int var2 = field1042[arg0];
        int var3 = field1033[arg0];
        int var4 = field1034[arg0];
        String var5 = field895[arg0];
        String var6 = field1036[arg0];
        method3727(var1, var2, var3, var4, var5, var6, class60.field718, class60.field730);
    }

    @ObfuscatedName("hy.hp(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method3727(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 24) {
            class217 var8 = class217.method4432(arg1);
            boolean var9 = true;
            if (var8.field2647 > 0) {
                var9 = method1421(var8);
            }
            if (var9) {
                field933.method3179(88);
                field933.method2919(arg1);
            }
        }
        if (arg2 == 2) {
            field998 = arg6;
            field999 = arg7;
            field1017 = 2;
            field1000 = 0;
            field1123 = arg0;
            field1124 = arg1;
            field933.method3179(182);
            field933.method3031(class51.field625[82] ? 1 : 0);
            field933.method2973(Statics.field2279);
            field933.method2965(Statics.field2147 + arg1);
            field933.method2963(field1047);
            field933.method2963(arg3 >> 14 & 0x7FFF);
            field933.method2917(Statics.field2304 + arg0);
        }
        if (arg2 == 1005) {
            class217 var10 = class217.method4432(arg1);
            if (var10 == null || var10.field2637[arg0] < 100000) {
                field933.method3179(39);
                field933.method3113(arg3);
            } else {
                class99.method2696(27, "", var10.field2637[arg0] + " x " + class257.method678(arg3).field3489);
            }
            field1002 = 0;
            Statics.field508 = class217.method4432(arg1);
            field1003 = arg0;
        }
        if (arg2 == 12) {
            class87 var11 = field928[arg3];
            if (var11 != null) {
                field998 = arg6;
                field999 = arg7;
                field1017 = 2;
                field1000 = 0;
                field1123 = arg0;
                field1124 = arg1;
                field933.method3179(74);
                field933.method3113(arg3);
                field933.method3031(class51.field625[82] ? 1 : 0);
            }
        }
        if (arg2 == 40) {
            field933.method3179(175);
            field933.method3113(arg3);
            field933.method2965(arg0);
            field933.method2919(arg1);
            field1002 = 0;
            Statics.field508 = class217.method4432(arg1);
            field1003 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class217 var12 = class217.method1008(arg1, arg0);
            if (var12 != null) {
                method25(arg3, arg1, arg0, var12.field2763, arg5);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field1326.method4928(arg2, arg3, new class213(arg0), new class213(arg1));
        }
        if (arg2 == 48) {
            class75 var13 = field1032[arg3];
            if (var13 != null) {
                field998 = arg6;
                field999 = arg7;
                field1017 = 2;
                field1000 = 0;
                field1123 = arg0;
                field1124 = arg1;
                field933.method3179(68);
                field933.method2956(class51.field625[82] ? 1 : 0);
                field933.method3113(arg3);
            }
        }
        if (arg2 == 9) {
            class87 var14 = field928[arg3];
            if (var14 != null) {
                field998 = arg6;
                field999 = arg7;
                field1017 = 2;
                field1000 = 0;
                field1123 = arg0;
                field1124 = arg1;
                field933.method3179(161);
                field933.method2917(arg3);
                field933.method3139(class51.field625[82] ? 1 : 0);
            }
        }
        if (arg2 == 1003) {
            field998 = arg6;
            field999 = arg7;
            field1017 = 2;
            field1000 = 0;
            class87 var15 = field928[arg3];
            if (var15 != null) {
                class259 var16 = var15.field1354;
                if (var16.field3550 != null) {
                    var16 = var16.method4345();
                }
                if (var16 != null) {
                    field933.method3179(25);
                    field933.method2963(var16.field3547);
                }
            }
        }
        if (arg2 == 1002) {
            field998 = arg6;
            field999 = arg7;
            field1017 = 2;
            field1000 = 0;
            field933.method3179(220);
            field933.method2917(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1004) {
            field998 = arg6;
            field999 = arg7;
            field1017 = 2;
            field1000 = 0;
            field933.method3179(39);
            field933.method3113(arg3);
        }
        if (arg2 == 37) {
            field933.method3179(208);
            field933.method2973(arg1);
            field933.method2917(arg3);
            field933.method2963(arg0);
            field1002 = 0;
            Statics.field508 = class217.method4432(arg1);
            field1003 = arg0;
        }
        if (arg2 == 42) {
            field933.method3179(28);
            field933.method3113(arg3);
            field933.method2963(arg0);
            field933.method2973(arg1);
            field1002 = 0;
            Statics.field508 = class217.method4432(arg1);
            field1003 = arg0;
        }
        if (arg2 == 46) {
            class75 var17 = field1032[arg3];
            if (var17 != null) {
                field998 = arg6;
                field999 = arg7;
                field1017 = 2;
                field1000 = 0;
                field1123 = arg0;
                field1124 = arg1;
                field933.method3179(241);
                field933.method2917(arg3);
                field933.method2954(class51.field625[82] ? 1 : 0);
            }
        }
        if (arg2 == 7) {
            class87 var18 = field928[arg3];
            if (var18 != null) {
                field998 = arg6;
                field999 = arg7;
                field1017 = 2;
                field1000 = 0;
                field1123 = arg0;
                field1124 = arg1;
                field933.method3179(173);
                field933.method3016(Statics.field2623);
                field933.method2963(Statics.field613);
                field933.method2954(class51.field625[82] ? 1 : 0);
                field933.method2917(Statics.field810);
                field933.method3113(arg3);
            }
        }
        if (arg2 == 23) {
            if (field1029) {
                Statics.field596.method2529();
            } else {
                Statics.field596.method2528(Statics.field3606, arg0, arg1, true);
            }
        }
        if (arg2 == 10) {
            class87 var19 = field928[arg3];
            if (var19 != null) {
                field998 = arg6;
                field999 = arg7;
                field1017 = 2;
                field1000 = 0;
                field1123 = arg0;
                field1124 = arg1;
                field933.method3179(113);
                field933.method2954(class51.field625[82] ? 1 : 0);
                field933.method2917(arg3);
            }
        }
        if (arg2 == 14) {
            class75 var20 = field1032[arg3];
            if (var20 != null) {
                field998 = arg6;
                field999 = arg7;
                field1017 = 2;
                field1000 = 0;
                field1123 = arg0;
                field1124 = arg1;
                field933.method3179(210);
                field933.method3139(class51.field625[82] ? 1 : 0);
                field933.method3113(Statics.field613);
                field933.method2974(Statics.field2623);
                field933.method3113(arg3);
                field933.method2963(Statics.field810);
            }
        }
        if (arg2 == 43) {
            field933.method3179(181);
            field933.method2963(arg0);
            field933.method2974(arg1);
            field933.method2965(arg3);
            field1002 = 0;
            Statics.field508 = class217.method4432(arg1);
            field1003 = arg0;
        }
        if (arg2 == 34) {
            field933.method3179(180);
            field933.method2965(arg3);
            field933.method3016(arg1);
            field933.method2963(arg0);
            field1002 = 0;
            Statics.field508 = class217.method4432(arg1);
            field1003 = arg0;
        }
        if (arg2 == 58) {
            class217 var21 = class217.method1008(arg1, arg0);
            if (var21 != null) {
                field933.method3179(184);
                field933.method2973(arg1);
                field933.method2963(field1047);
                field933.method3113(arg0);
                field933.method2917(var21.field2763);
                field933.method2965(field1048);
                field933.method2974(Statics.field2279);
            }
        }
        if (arg2 == 45) {
            class75 var22 = field1032[arg3];
            if (var22 != null) {
                field998 = arg6;
                field999 = arg7;
                field1017 = 2;
                field1000 = 0;
                field1123 = arg0;
                field1124 = arg1;
                field933.method3179(218);
                field933.method2963(arg3);
                field933.method3139(class51.field625[82] ? 1 : 0);
            }
        }
        if (arg2 == 3) {
            field998 = arg6;
            field999 = arg7;
            field1017 = 2;
            field1000 = 0;
            field1123 = arg0;
            field1124 = arg1;
            field933.method3179(41);
            field933.method3139(class51.field625[82] ? 1 : 0);
            field933.method2965(Statics.field2147 + arg1);
            field933.method3113(Statics.field2304 + arg0);
            field933.method2963(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 51) {
            class75 var23 = field1032[arg3];
            if (var23 != null) {
                field998 = arg6;
                field999 = arg7;
                field1017 = 2;
                field1000 = 0;
                field1123 = arg0;
                field1124 = arg1;
                field933.method3179(12);
                field933.method3139(class51.field625[82] ? 1 : 0);
                field933.method2917(arg3);
            }
        }
        if (arg2 == 31) {
            field933.method3179(216);
            field933.method2917(Statics.field613);
            field933.method3016(arg1);
            field933.method3113(arg0);
            field933.method2919(Statics.field2623);
            field933.method2917(arg3);
            field933.method2963(Statics.field810);
            field1002 = 0;
            Statics.field508 = class217.method4432(arg1);
            field1003 = arg0;
        }
        if (arg2 == 20) {
            field998 = arg6;
            field999 = arg7;
            field1017 = 2;
            field1000 = 0;
            field1123 = arg0;
            field1124 = arg1;
            field933.method3179(122);
            field933.method2963(Statics.field2147 + arg1);
            field933.method2965(arg3);
            field933.method2917(Statics.field2304 + arg0);
            field933.method3031(class51.field625[82] ? 1 : 0);
        }
        if (arg2 == 30 && field1055 == null) {
            method1737(arg1, arg0);
            field1055 = class217.method1008(arg1, arg0);
            method3808(field1055);
        }
        if (arg2 == 47) {
            class75 var24 = field1032[arg3];
            if (var24 != null) {
                field998 = arg6;
                field999 = arg7;
                field1017 = 2;
                field1000 = 0;
                field1123 = arg0;
                field1124 = arg1;
                field933.method3179(34);
                field933.method2917(arg3);
                field933.method2956(class51.field625[82] ? 1 : 0);
            }
        }
        if (arg2 == 50) {
            class75 var25 = field1032[arg3];
            if (var25 != null) {
                field998 = arg6;
                field999 = arg7;
                field1017 = 2;
                field1000 = 0;
                field1123 = arg0;
                field1124 = arg1;
                field933.method3179(69);
                field933.method3113(arg3);
                field933.method2956(class51.field625[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class87 var26 = field928[arg3];
            if (var26 != null) {
                field998 = arg6;
                field999 = arg7;
                field1017 = 2;
                field1000 = 0;
                field1123 = arg0;
                field1124 = arg1;
                field933.method3179(201);
                field933.method2956(class51.field625[82] ? 1 : 0);
                field933.method2917(arg3);
            }
        }
        if (arg2 == 38) {
            method136();
            class217 var27 = class217.method4432(arg1);
            field1044 = 1;
            Statics.field613 = arg0;
            Statics.field2623 = arg1;
            Statics.field810 = arg3;
            method3808(var27);
            field1143 = class89.method1488(16748608) + class257.method678(arg3).field3489 + class89.method1488(16777215);
            if (field1143 == null) {
                field1143 = "null";
            }
            return;
        }
        if (arg2 == 39) {
            field933.method3179(45);
            field933.method3113(arg0);
            field933.method2917(arg3);
            field933.method2974(arg1);
            field1002 = 0;
            Statics.field508 = class217.method4432(arg1);
            field1003 = arg0;
        }
        if (arg2 == 35) {
            field933.method3179(71);
            field933.method2919(arg1);
            field933.method3113(arg3);
            field933.method2963(arg0);
            field1002 = 0;
            Statics.field508 = class217.method4432(arg1);
            field1003 = arg0;
        }
        if (arg2 == 28) {
            field933.method3179(88);
            field933.method2919(arg1);
            class217 var28 = class217.method4432(arg1);
            if (var28.field2755 != null && var28.field2755[0][0] == 5) {
                int var29 = var28.field2755[0][1];
                class212.field2597[var29] = 1 - class212.field2597[var29];
                method605(var29);
            }
        }
        if (arg2 == 25) {
            class217 var30 = class217.method1008(arg1, arg0);
            if (var30 != null) {
                method136();
                int var31 = Statics.method555(var30);
                int var32 = var31 >> 11 & 0x3F;
                int var34 = var30.field2763;
                class217 var35 = class217.method1008(arg1, arg0);
                if (var35 != null && var35.field2734 != null) {
                    class70 var36 = new class70();
                    var36.field817 = var35;
                    var36.field827 = var35.field2734;
                    class84.method2306(var36);
                }
                field1048 = var34;
                field1046 = true;
                Statics.field2279 = arg1;
                field1047 = arg0;
                Statics.field365 = var32;
                method3808(var35);
                field1044 = 0;
                int var37 = Statics.method555(var30);
                int var38 = var37 >> 11 & 0x3F;
                String var39;
                if (var38 == 0) {
                    var39 = null;
                } else if (var30.field2722 == null || var30.field2722.trim().length() == 0) {
                    var39 = null;
                } else {
                    var39 = var30.field2722;
                }
                field1049 = var39;
                if (field1049 == null) {
                    field1049 = "Null";
                }
                if (var30.field2642) {
                    field1050 = var30.field2716 + class89.method1488(16777215);
                } else {
                    field1050 = class89.method1488(65280) + var30.field2751 + class89.method1488(16777215);
                }
            }
            return;
        }
        if (arg2 == 33) {
            field933.method3179(50);
            field933.method2917(arg3);
            field933.method2974(arg1);
            field933.method2965(arg0);
            field1002 = 0;
            Statics.field508 = class217.method4432(arg1);
            field1003 = arg0;
        }
        if (arg2 == 21) {
            field998 = arg6;
            field999 = arg7;
            field1017 = 2;
            field1000 = 0;
            field1123 = arg0;
            field1124 = arg1;
            field933.method3179(244);
            field933.method3139(class51.field625[82] ? 1 : 0);
            field933.method2917(Statics.field2147 + arg1);
            field933.method3113(arg3);
            field933.method2963(Statics.field2304 + arg0);
        }
        if (arg2 == 19) {
            field998 = arg6;
            field999 = arg7;
            field1017 = 2;
            field1000 = 0;
            field1123 = arg0;
            field1124 = arg1;
            field933.method3179(138);
            field933.method2965(Statics.field2304 + arg0);
            field933.method2917(Statics.field2147 + arg1);
            field933.method3139(class51.field625[82] ? 1 : 0);
            field933.method2963(arg3);
        }
        if (arg2 == 8) {
            class87 var40 = field928[arg3];
            if (var40 != null) {
                field998 = arg6;
                field999 = arg7;
                field1017 = 2;
                field1000 = 0;
                field1123 = arg0;
                field1124 = arg1;
                field933.method3179(35);
                field933.method3139(class51.field625[82] ? 1 : 0);
                field933.method2973(Statics.field2279);
                field933.method2965(field1047);
                field933.method3113(arg3);
            }
        }
        if (arg2 == 29) {
            field933.method3179(88);
            field933.method2919(arg1);
            class217 var41 = class217.method4432(arg1);
            if (var41.field2755 != null && var41.field2755[0][0] == 5) {
                int var42 = var41.field2755[0][1];
                if (class212.field2597[var42] != var41.field2757[0]) {
                    class212.field2597[var42] = var41.field2757[0];
                    method605(var42);
                }
            }
        }
        if (arg2 == 22) {
            field998 = arg6;
            field999 = arg7;
            field1017 = 2;
            field1000 = 0;
            field1123 = arg0;
            field1124 = arg1;
            field933.method3179(223);
            field933.method3139(class51.field625[82] ? 1 : 0);
            field933.method2963(Statics.field2304 + arg0);
            field933.method2963(arg3);
            field933.method2965(Statics.field2147 + arg1);
        }
        if (arg2 == 4) {
            field998 = arg6;
            field999 = arg7;
            field1017 = 2;
            field1000 = 0;
            field1123 = arg0;
            field1124 = arg1;
            field933.method3179(240);
            field933.method3139(class51.field625[82] ? 1 : 0);
            field933.method3113(Statics.field2304 + arg0);
            field933.method3113(arg3 >> 14 & 0x7FFF);
            field933.method2963(Statics.field2147 + arg1);
        }
        if (arg2 == 36) {
            field933.method3179(56);
            field933.method2963(arg3);
            field933.method2973(arg1);
            field933.method3113(arg0);
            field1002 = 0;
            Statics.field508 = class217.method4432(arg1);
            field1003 = arg0;
        }
        if (arg2 == 41) {
            field933.method3179(159);
            field933.method3016(arg1);
            field933.method2965(arg3);
            field933.method2917(arg0);
            field1002 = 0;
            Statics.field508 = class217.method4432(arg1);
            field1003 = arg0;
        }
        if (arg2 == 18) {
            field998 = arg6;
            field999 = arg7;
            field1017 = 2;
            field1000 = 0;
            field1123 = arg0;
            field1124 = arg1;
            field933.method3179(151);
            field933.method2954(class51.field625[82] ? 1 : 0);
            field933.method2965(Statics.field2147 + arg1);
            field933.method3113(Statics.field2304 + arg0);
            field933.method3113(arg3);
        }
        if (arg2 == 15) {
            class75 var43 = field1032[arg3];
            if (var43 != null) {
                field998 = arg6;
                field999 = arg7;
                field1017 = 2;
                field1000 = 0;
                field1123 = arg0;
                field1124 = arg1;
                field933.method3179(230);
                field933.method2963(arg3);
                field933.method3139(class51.field625[82] ? 1 : 0);
                field933.method2919(Statics.field2279);
                field933.method2917(field1047);
            }
        }
        if (arg2 == 16) {
            field998 = arg6;
            field999 = arg7;
            field1017 = 2;
            field1000 = 0;
            field1123 = arg0;
            field1124 = arg1;
            field933.method3179(203);
            field933.method3113(Statics.field2147 + arg1);
            field933.method3113(Statics.field810);
            field933.method2965(arg3);
            field933.method3016(Statics.field2623);
            field933.method2956(class51.field625[82] ? 1 : 0);
            field933.method3113(Statics.field2304 + arg0);
            field933.method2963(Statics.field613);
        }
        if (arg2 == 6) {
            field998 = arg6;
            field999 = arg7;
            field1017 = 2;
            field1000 = 0;
            field1123 = arg0;
            field1124 = arg1;
            field933.method3179(80);
            field933.method3113(arg3 >> 14 & 0x7FFF);
            field933.method2917(Statics.field2304 + arg0);
            field933.method2917(Statics.field2147 + arg1);
            field933.method3139(class51.field625[82] ? 1 : 0);
        }
        if (arg2 == 44) {
            class75 var44 = field1032[arg3];
            if (var44 != null) {
                field998 = arg6;
                field999 = arg7;
                field1017 = 2;
                field1000 = 0;
                field1123 = arg0;
                field1124 = arg1;
                field933.method3179(207);
                field933.method2956(class51.field625[82] ? 1 : 0);
                field933.method2965(arg3);
            }
        }
        if (arg2 == 26) {
            method1006();
        }
        if (arg2 == 49) {
            class75 var45 = field1032[arg3];
            if (var45 != null) {
                field998 = arg6;
                field999 = arg7;
                field1017 = 2;
                field1000 = 0;
                field1123 = arg0;
                field1124 = arg1;
                field933.method3179(139);
                field933.method2954(class51.field625[82] ? 1 : 0);
                field933.method2917(arg3);
            }
        }
        if (arg2 == 17) {
            field998 = arg6;
            field999 = arg7;
            field1017 = 2;
            field1000 = 0;
            field1123 = arg0;
            field1124 = arg1;
            field933.method3179(81);
            field933.method3016(Statics.field2279);
            field933.method2965(Statics.field2304 + arg0);
            field933.method3139(class51.field625[82] ? 1 : 0);
            field933.method2917(Statics.field2147 + arg1);
            field933.method3113(arg3);
            field933.method2963(field1047);
        }
        if (arg2 == 5) {
            field998 = arg6;
            field999 = arg7;
            field1017 = 2;
            field1000 = 0;
            field1123 = arg0;
            field1124 = arg1;
            field933.method3179(116);
            field933.method2917(Statics.field2147 + arg1);
            field933.method2965(arg3 >> 14 & 0x7FFF);
            field933.method2954(class51.field625[82] ? 1 : 0);
            field933.method3113(Statics.field2304 + arg0);
        }
        if (arg2 == 11) {
            class87 var46 = field928[arg3];
            if (var46 != null) {
                field998 = arg6;
                field999 = arg7;
                field1017 = 2;
                field1000 = 0;
                field1123 = arg0;
                field1124 = arg1;
                field933.method3179(130);
                field933.method3139(class51.field625[82] ? 1 : 0);
                field933.method2917(arg3);
            }
        }
        if (arg2 == 32) {
            field933.method3179(76);
            field933.method2965(arg0);
            field933.method2963(field1047);
            field933.method2974(arg1);
            field933.method3113(arg3);
            field933.method2974(Statics.field2279);
            field1002 = 0;
            Statics.field508 = class217.method4432(arg1);
            field1003 = arg0;
        }
        if (arg2 == 1) {
            field998 = arg6;
            field999 = arg7;
            field1017 = 2;
            field1000 = 0;
            field1123 = arg0;
            field1124 = arg1;
            field933.method3179(13);
            field933.method3016(Statics.field2623);
            field933.method2963(Statics.field2147 + arg1);
            field933.method2963(arg3 >> 14 & 0x7FFF);
            field933.method2965(Statics.field613);
            field933.method3113(Statics.field2304 + arg0);
            field933.method2954(class51.field625[82] ? 1 : 0);
            field933.method2917(Statics.field810);
        }
        if (arg2 == 1001) {
            field998 = arg6;
            field999 = arg7;
            field1017 = 2;
            field1000 = 0;
            field1123 = arg0;
            field1124 = arg1;
            field933.method3179(4);
            field933.method2963(Statics.field2147 + arg1);
            field933.method2965(arg3 >> 14 & 0x7FFF);
            field933.method3031(class51.field625[82] ? 1 : 0);
            field933.method2917(Statics.field2304 + arg0);
        }
        if (field1044 != 0) {
            field1044 = 0;
            method3808(class217.method4432(Statics.field2623));
        }
        if (field1046) {
            method136();
        }
        if (Statics.field508 != null && field1002 == 0) {
            method3808(Statics.field508);
        }
    }

    @ObfuscatedName("s.ho(I)V")
    public static void method136() {
        if (!field1046) {
            return;
        }
        class217 var0 = class217.method1008(Statics.field2279, field1047);
        if (var0 != null && var0.field2737 != null) {
            class70 var1 = new class70();
            var1.field817 = var0;
            var1.field827 = var0.field2737;
            class84.method2306(var1);
        }
        field1046 = false;
        method3808(var0);
    }

    @ObfuscatedName("cc.hw(III)V")
    public static void method1737(int arg0, int arg1) {
        field933.method3179(179);
        field933.method2974(arg0);
        field933.method2965(arg1);
    }

    @ObfuscatedName("p.hx(IIIILjava/lang/String;B)V")
    public static void method25(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class217 var5 = class217.method1008(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2635 != null) {
            class70 var6 = new class70();
            var6.field817 = var5;
            var6.field815 = arg0;
            var6.field816 = arg4;
            var6.field827 = var5.field2635;
            class84.method2306(var6);
        }
        boolean var7 = true;
        if (var5.field2647 > 0) {
            var7 = method1421(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = Statics.method555(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field933.method3179(38);
            field933.method2919(arg1);
            field933.method2917(arg2);
            field933.method2917(arg3);
        }
        if (arg0 == 2) {
            field933.method3179(60);
            field933.method2919(arg1);
            field933.method2917(arg2);
            field933.method2917(arg3);
        }
        if (arg0 == 3) {
            field933.method3179(235);
            field933.method2919(arg1);
            field933.method2917(arg2);
            field933.method2917(arg3);
        }
        if (arg0 == 4) {
            field933.method3179(42);
            field933.method2919(arg1);
            field933.method2917(arg2);
            field933.method2917(arg3);
        }
        if (arg0 == 5) {
            field933.method3179(165);
            field933.method2919(arg1);
            field933.method2917(arg2);
            field933.method2917(arg3);
        }
        if (arg0 == 6) {
            field933.method3179(221);
            field933.method2919(arg1);
            field933.method2917(arg2);
            field933.method2917(arg3);
        }
        if (arg0 == 7) {
            field933.method3179(255);
            field933.method2919(arg1);
            field933.method2917(arg2);
            field933.method2917(arg3);
        }
        if (arg0 == 8) {
            field933.method3179(229);
            field933.method2919(arg1);
            field933.method2917(arg2);
            field933.method2917(arg3);
        }
        if (arg0 == 9) {
            field933.method3179(209);
            field933.method2919(arg1);
            field933.method2917(arg2);
            field933.method2917(arg3);
        }
        if (arg0 == 10) {
            field933.method3179(164);
            field933.method2919(arg1);
            field933.method2917(arg2);
            field933.method2917(arg3);
        }
    }

    @ObfuscatedName("eg.hy(I)V")
    public static final void method2404() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field961 - 1; var1++) {
                if (field1033[var1] < 1000 && field1033[var1 + 1] > 1000) {
                    String var2 = field1036[var1];
                    field1036[var1] = field1036[var1 + 1];
                    field1036[var1 + 1] = var2;
                    String var3 = field895[var1];
                    field895[var1] = field895[var1 + 1];
                    field895[var1 + 1] = var3;
                    int var4 = field1033[var1];
                    field1033[var1] = field1033[var1 + 1];
                    field1033[var1 + 1] = var4;
                    int var5 = field1031[var1];
                    field1031[var1] = field1031[var1 + 1];
                    field1031[var1 + 1] = var5;
                    int var6 = field1042[var1];
                    field1042[var1] = field1042[var1 + 1];
                    field1042[var1 + 1] = var6;
                    int var7 = field1034[var1];
                    field1034[var1] = field1034[var1 + 1];
                    field1034[var1 + 1] = var7;
                    if (field1038 != -1) {
                        if (field1038 == var1) {
                            field1038 = var1 + 1;
                        } else if (field1038 == var1 + 1) {
                            field1038 = var1;
                        }
                    }
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("fe.hr(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method3161(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method238(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("af.ht(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method238(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field1029 || field961 >= 500) {
            return;
        }
        field895[field961] = arg0;
        field1036[field961] = arg1;
        field1033[field961] = arg2;
        field1034[field961] = arg3;
        field1031[field961] = arg4;
        field1042[field961] = arg5;
        if (arg6) {
            field1038 = field961;
        }
        field961++;
    }

    @ObfuscatedName("ca.hn(B)I")
    public static final int method1567() {
        if (field961 <= 0) {
            return -1;
        } else if (field1006 && class51.field625[81] && field1038 != -1) {
            return field1038;
        } else {
            return field961 - 1;
        }
    }

    @ObfuscatedName("m.ha(I)V")
    public static void method103() {
        for (int var0 = 0; var0 < field961; var0++) {
            if (method2695(field1033[var0])) {
                if (var0 < field961 - 1) {
                    for (int var1 = var0; var1 < field961 - 1; var1++) {
                        field895[var1] = field895[var1 + 1];
                        field1036[var1] = field1036[var1 + 1];
                        field1033[var1] = field1033[var1 + 1];
                        field1034[var1] = field1034[var1 + 1];
                        field1031[var1] = field1031[var1 + 1];
                        field1042[var1] = field1042[var1 + 1];
                    }
                }
                field961--;
            }
        }
    }

    @ObfuscatedName("ey.hf(II)Z")
    public static boolean method2695(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("al.hk(II)Ljava/lang/String;")
    public static String method606(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field1036[arg0].length() > 0) {
            return field895[arg0] + class226.field3070 + field1036[arg0];
        } else {
            return field895[arg0];
        }
    }

    @ObfuscatedName("fz.he(Liv;IIII)V")
    public static final void method3147(class259 arg0, int arg1, int arg2, int arg3) {
        if (field961 >= 400) {
            return;
        }
        if (arg0.field3550 != null) {
            arg0 = arg0.method4345();
        }
        if (arg0 == null || !arg0.field3576 || arg0.field3578 && field1059 != arg1) {
            return;
        }
        String var4 = arg0.field3573;
        if (arg0.field3553 != 0) {
            int var6 = arg0.field3553;
            int var7 = Statics.field308.field859;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class89.method1488(16711680);
            } else if (var8 < -6) {
                var9 = class89.method1488(16723968);
            } else if (var8 < -3) {
                var9 = class89.method1488(16740352);
            } else if (var8 < 0) {
                var9 = class89.method1488(16756736);
            } else if (var8 > 9) {
                var9 = class89.method1488(65280);
            } else if (var8 > 6) {
                var9 = class89.method1488(4259584);
            } else if (var8 > 3) {
                var9 = class89.method1488(8453888);
            } else if (var8 > 0) {
                var9 = class89.method1488(12648192);
            } else {
                var9 = class89.method1488(16776960);
            }
            var4 = var4 + var9 + " " + class89.field1372 + class226.field2998 + arg0.field3553 + class89.field1373;
        }
        if (arg0.field3578 && field1037) {
            method3161(class226.field3095, class89.method1488(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1044 == 1) {
            method3161(class226.field2992, field1143 + " " + class89.field1374 + " " + class89.method1488(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1046) {
            int var10 = arg0.field3578 && field1037 ? 2000 : 0;
            String[] var11 = arg0.field3563;
            if (field995) {
                var11 = method33(var11);
            }
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class226.field2994)) {
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
                        method3161(var11[var12], class89.method1488(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class226.field2994)) {
                        short var15 = 0;
                        if (field917 != class92.field1408) {
                            if (field917 == class92.field1406 || field917 == class92.field1411 && arg0.field3553 > Statics.field308.field859) {
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
                            method3161(var11[var14], class89.method1488(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3578 || !field1037) {
                method3161(class226.field3095, class89.method1488(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field365 & 0x2) == 2) {
            method3161(field1049, field1050 + " " + class89.field1374 + " " + class89.method1488(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("au.hm(Lbj;IIIB)V")
    public static final void method675(class75 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field308 == arg0 || field961 >= 400) {
            return;
        }
        String var9;
        if (arg0.field856 == 0) {
            String var4 = arg0.field858[0] + arg0.field881 + arg0.field858[1];
            int var5 = arg0.field859;
            int var6 = Statics.field308.field859;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class89.method1488(16711680);
            } else if (var7 < -6) {
                var8 = class89.method1488(16723968);
            } else if (var7 < -3) {
                var8 = class89.method1488(16740352);
            } else if (var7 < 0) {
                var8 = class89.method1488(16756736);
            } else if (var7 > 9) {
                var8 = class89.method1488(65280);
            } else if (var7 > 6) {
                var8 = class89.method1488(4259584);
            } else if (var7 > 3) {
                var8 = class89.method1488(8453888);
            } else if (var7 > 0) {
                var8 = class89.method1488(12648192);
            } else {
                var8 = class89.method1488(16776960);
            }
            var9 = var4 + var8 + " " + class89.field1372 + class226.field2998 + arg0.field859 + class89.field1373 + arg0.field858[2];
        } else {
            var9 = arg0.field858[0] + arg0.field881 + arg0.field858[1] + " " + class89.field1372 + class226.field2926 + arg0.field856 + class89.field1373 + arg0.field858[2];
        }
        if (field1044 == 1) {
            method3161(class226.field2992, field1143 + " " + class89.field1374 + " " + class89.method1488(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field1046) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field1063[var10] != null) {
                    short var11 = 0;
                    if (field1063[var10].equalsIgnoreCase(class226.field2994)) {
                        if (field916 == class92.field1408) {
                            continue;
                        }
                        if (field916 == class92.field1406 || field916 == class92.field1411 && arg0.field859 > Statics.field308.field859) {
                            var11 = 2000;
                        }
                        if (Statics.field308.field873 != 0 && arg0.field873 != 0) {
                            if (Statics.field308.field873 == arg0.field873) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field1023[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field1160[var10] + var11;
                    method3161(field1063[var10], class89.method1488(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field365 & 0x8) == 8) {
            method3161(field1049, field1050 + " " + class89.field1374 + " " + class89.method1488(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field961; var14++) {
            if (field1033[var14] == 23) {
                field1036[var14] = class89.method1488(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("x.hg(IIIIIIIII)V")
    public static final void method59(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class217.method68(arg0)) {
            Statics.field417 = null;
            method320(Statics.field1401[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field417 != null) {
                method320(Statics.field417, -1412584499, arg1, arg2, arg3, arg4, Statics.field887, Statics.field649, arg7);
                Statics.field417 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1096[var8] = true;
            }
        } else {
            field1096[arg7] = true;
        }
    }

    @ObfuscatedName("ax.hc([Lhr;IIIIIIIIB)V")
    public static final void method320(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class282.method4632(arg2, arg3, arg4, arg5);
        class137.method2435();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class217 var10 = arg0[var9];
            if (var10 != null && (var10.field2675 == arg1 || arg1 == -1412584499 && field962 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1099[field1094] = var10.field2656 + arg6;
                    field992[field1094] = var10.field2657 + arg7;
                    field1101[field1094] = var10.field2730;
                    field1102[field1094] = var10.field2659;
                    var11 = ++field1094 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2762 = var11;
                var10.field2775 = field900;
                if (!var10.field2642 || !method2698(var10)) {
                    if (var10.field2647 > 0) {
                        method726(var10);
                    }
                    int var12 = var10.field2656 + arg6;
                    int var13 = var10.field2657 + arg7;
                    int var14 = var10.field2674;
                    if (field962 == var10) {
                        if (arg1 != -1412584499 && !var10.field2721) {
                            Statics.field417 = arg0;
                            Statics.field887 = arg6;
                            Statics.field649 = arg7;
                            continue;
                        }
                        if (field1009 && field1069) {
                            int var15 = class60.field722;
                            int var16 = class60.field723 * -113761157;
                            int var17 = var15 - field1066;
                            int var18 = var16 - field1040;
                            if (var17 < field1035) {
                                var17 = field1035;
                            }
                            if (var10.field2730 + var17 > field1035 + field1085.field2730) {
                                var17 = field1035 + field1085.field2730 - var10.field2730;
                            }
                            if (var18 < field990) {
                                var18 = field990;
                            }
                            if (var10.field2659 + var18 > field990 + field1085.field2659) {
                                var18 = field990 + field1085.field2659 - var10.field2659;
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
                        int var25 = var10.field2730 + var12;
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
                        int var29 = var10.field2730 + var12;
                        int var30 = var10.field2659 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2642 || var19 < var21 && var20 < var22) {
                        if (var10.field2647 != 0) {
                            if (var10.field2647 == 1336) {
                                if (field906) {
                                    var13 += 15;
                                    Statics.field846.method4455("Fps:" + field686, var10.field2730 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field896) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field896) {
                                        var33 = 16711680;
                                    }
                                    Statics.field846.method4455("Mem:" + var32 + "k", var10.field2730 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2647 == 1337) {
                                field1144 = var12;
                                field1041 = var13;
                                int var36 = var10.field2730;
                                int var37 = var10.field2659;
                                field1153++;
                                method79(class67.field803);
                                boolean var38 = false;
                                if (field1107 >= 0) {
                                    int var39 = class97.field1490;
                                    int[] var40 = class97.field1497;
                                    for (int var41 = 0; var41 < var39; var41++) {
                                        if (field1107 == var40[var41]) {
                                            var38 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var38) {
                                    method79(class67.field800);
                                }
                                method11(true);
                                method79(var38 ? class67.field802 : class67.field804);
                                method11(false);
                                for (class94 var42 = (class94) field1075.method3376(); var42 != null; var42 = (class94) field1075.method3377()) {
                                    if (Statics.field3606 != var42.field1449 || field900 > var42.field1455) {
                                        var42.method3364();
                                    } else if (field900 >= var42.field1451) {
                                        if (var42.field1458 > 0) {
                                            class87 var43 = field928[var42.field1458 - 1];
                                            if (var43 != null && var43.field1247 >= 0 && var43.field1247 < 13312 && var43.field1200 >= 0 && var43.field1200 < 13312) {
                                                var42.method1642(var43.field1247, var43.field1200, method1028(var43.field1247, var43.field1200, var42.field1449) - var42.field1453, field900);
                                            }
                                        }
                                        if (var42.field1458 < 0) {
                                            int var44 = -var42.field1458 - 1;
                                            class75 var45;
                                            if (field1012 == var44) {
                                                var45 = Statics.field308;
                                            } else {
                                                var45 = field1032[var44];
                                            }
                                            if (var45 != null && var45.field1247 >= 0 && var45.field1247 < 13312 && var45.field1200 >= 0 && var45.field1200 < 13312) {
                                                var42.method1642(var45.field1247, var45.field1200, method1028(var45.field1247, var45.field1200, var42.field1449) - var42.field1453, field900);
                                            }
                                        }
                                        var42.method1646(field967);
                                        Statics.field596.method2555(Statics.field3606, (int) var42.field1466, (int) var42.field1461, (int) var42.field1448, 60, var42, var42.field1471, -1, false);
                                    }
                                }
                                for (class85 var46 = (class85) field1024.method3376(); var46 != null; var46 = (class85) field1024.method3377()) {
                                    if (Statics.field3606 != var46.field1331 || var46.field1338) {
                                        var46.method3364();
                                    } else if (field900 >= var46.field1329) {
                                        var46.method1566(field967);
                                        if (var46.field1338) {
                                            var46.method3364();
                                        } else {
                                            Statics.field596.method2555(var46.field1331, var46.field1332, var46.field1330, var46.field1334, 60, var46, 0, -1, false);
                                        }
                                    }
                                }
                                method1394(var12, var13, var36, var37, true);
                                int var47 = field1152;
                                int var48 = field1092;
                                int var49 = field1154;
                                int var50 = field1155;
                                class282.method4632(var47, var48, var47 + var49, var48 + var50);
                                class137.method2435();
                                if (!field930) {
                                    int var51 = field974;
                                    if (field983 / 256 > var51) {
                                        var51 = field983 / 256;
                                    }
                                    if (field1139[4] && field1141[4] + 128 > var51) {
                                        var51 = field1141[4] + 128;
                                    }
                                    int var52 = field959 + field1158 & 0x7FF;
                                    int var53 = Statics.field488;
                                    int var54 = method1028(Statics.field308.field1247, Statics.field308.field1200, Statics.field3606) - field980;
                                    int var55 = Statics.field440;
                                    int var56 = var51 * 3 + 600;
                                    int var57 = 2048 - var51 & 0x7FF;
                                    int var58 = 2048 - var52 & 0x7FF;
                                    int var59 = 0;
                                    int var60 = 0;
                                    int var61 = var56;
                                    if (var57 != 0) {
                                        int var62 = class137.field2021[var57];
                                        int var63 = class137.field2022[var57];
                                        int var64 = var60 * var63 - var56 * var62 >> 16;
                                        var61 = var60 * var62 + var56 * var63 >> 16;
                                        var60 = var64;
                                    }
                                    if (var58 != 0) {
                                        int var65 = class137.field2021[var58];
                                        int var66 = class137.field2022[var58];
                                        int var67 = var59 * var66 + var61 * var65 >> 16;
                                        var61 = var61 * var66 - var59 * var65 >> 16;
                                        var59 = var67;
                                    }
                                    Statics.field275 = var53 - var59;
                                    Statics.field537 = var54 - var60;
                                    Statics.field277 = var55 - var61;
                                    Statics.field503 = var51;
                                    Statics.field3308 = var52;
                                }
                                int var80;
                                if (field930) {
                                    int var81;
                                    if (Statics.field1990.field1285) {
                                        var81 = Statics.field3606;
                                    } else {
                                        int var82 = method1028(Statics.field275, Statics.field277, Statics.field3606);
                                        if (var82 - Statics.field537 >= 800 || (class62.field742[Statics.field3606][Statics.field275 >> 7][Statics.field277 >> 7] & 0x4) == 0) {
                                            var81 = 3;
                                        } else {
                                            var81 = Statics.field3606;
                                        }
                                    }
                                    var80 = var81;
                                } else {
                                    int var68;
                                    if (Statics.field1990.field1285) {
                                        var68 = Statics.field3606;
                                    } else {
                                        label1465: {
                                            int var69 = 3;
                                            if (Statics.field503 < 310) {
                                                int var70 = Statics.field275 >> 7;
                                                int var71 = Statics.field277 >> 7;
                                                int var72 = Statics.field308.field1247 >> 7;
                                                int var73 = Statics.field308.field1200 >> 7;
                                                if (var70 < 0 || var71 < 0 || var70 >= 104 || var71 >= 104) {
                                                    var68 = Statics.field3606;
                                                    break label1465;
                                                }
                                                if ((class62.field742[Statics.field3606][var70][var71] & 0x4) != 0) {
                                                    var69 = Statics.field3606;
                                                }
                                                int var74;
                                                if (var72 > var70) {
                                                    var74 = var72 - var70;
                                                } else {
                                                    var74 = var70 - var72;
                                                }
                                                int var75;
                                                if (var73 > var71) {
                                                    var75 = var73 - var71;
                                                } else {
                                                    var75 = var71 - var73;
                                                }
                                                if (var74 > var75) {
                                                    int var76 = var75 * 65536 / var74;
                                                    int var77 = 32768;
                                                    while (var70 != var72) {
                                                        if (var70 < var72) {
                                                            var70++;
                                                        } else if (var70 > var72) {
                                                            var70--;
                                                        }
                                                        if ((class62.field742[Statics.field3606][var70][var71] & 0x4) != 0) {
                                                            var69 = Statics.field3606;
                                                        }
                                                        var77 += var76;
                                                        if (var77 >= 65536) {
                                                            var77 -= 65536;
                                                            if (var71 < var73) {
                                                                var71++;
                                                            } else if (var71 > var73) {
                                                                var71--;
                                                            }
                                                            if ((class62.field742[Statics.field3606][var70][var71] & 0x4) != 0) {
                                                                var69 = Statics.field3606;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int var78 = var74 * 65536 / var75;
                                                    int var79 = 32768;
                                                    while (var71 != var73) {
                                                        if (var71 < var73) {
                                                            var71++;
                                                        } else if (var71 > var73) {
                                                            var71--;
                                                        }
                                                        if ((class62.field742[Statics.field3606][var70][var71] & 0x4) != 0) {
                                                            var69 = Statics.field3606;
                                                        }
                                                        var79 += var78;
                                                        if (var79 >= 65536) {
                                                            var79 -= 65536;
                                                            if (var70 < var72) {
                                                                var70++;
                                                            } else if (var70 > var72) {
                                                                var70--;
                                                            }
                                                            if ((class62.field742[Statics.field3606][var70][var71] & 0x4) != 0) {
                                                                var69 = Statics.field3606;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (Statics.field308.field1247 >= 0 && Statics.field308.field1200 >= 0 && Statics.field308.field1247 < 13312 && Statics.field308.field1200 < 13312) {
                                                if ((class62.field742[Statics.field3606][Statics.field308.field1247 >> 7][Statics.field308.field1200 >> 7] & 0x4) != 0) {
                                                    var69 = Statics.field3606;
                                                }
                                                var68 = var69;
                                            } else {
                                                var68 = Statics.field3606;
                                            }
                                        }
                                    }
                                    var80 = var68;
                                }
                                int var83 = Statics.field275;
                                int var84 = Statics.field537;
                                int var85 = Statics.field277;
                                int var86 = Statics.field503;
                                int var87 = Statics.field3308;
                                for (int var88 = 0; var88 < 5; var88++) {
                                    if (field1139[var88]) {
                                        int var89 = (int) (Math.random() * (double) (field1140[var88] * 2 + 1) - (double) field1140[var88] + Math.sin((double) field1142[var88] / 100.0D * (double) field1167[var88]) * (double) field1141[var88]);
                                        if (var88 == 0) {
                                            Statics.field275 += var89;
                                        }
                                        if (var88 == 1) {
                                            Statics.field537 += var89;
                                        }
                                        if (var88 == 2) {
                                            Statics.field277 += var89;
                                        }
                                        if (var88 == 3) {
                                            Statics.field3308 = Statics.field3308 + var89 & 0x7FF;
                                        }
                                        if (var88 == 4) {
                                            Statics.field503 += var89;
                                            if (Statics.field503 < 128) {
                                                Statics.field503 = 128;
                                            }
                                            if (Statics.field503 > 383) {
                                                Statics.field503 = 383;
                                            }
                                        }
                                    }
                                }
                                int var90 = class60.field722;
                                int var91 = class60.field723 * -113761157;
                                if (class60.field728 != 0) {
                                    var90 = class60.field718;
                                    var91 = class60.field730;
                                }
                                if (var90 >= var47 && var90 < var47 + var49 && var91 >= var48 && var91 < var48 + var50) {
                                    class135.method1076(var90 - var47, var91 - var48);
                                } else {
                                    class135.method471();
                                }
                                method1027();
                                class282.method4676(var47, var48, var49, var50, 0);
                                method1027();
                                int var92 = class137.field1999;
                                class137.field1999 = field1156;
                                Statics.field596.method2532(Statics.field275, Statics.field537, Statics.field277, Statics.field503, Statics.field3308, var80);
                                class8.method1164();
                                class137.field1999 = var92;
                                method1027();
                                Statics.field596.method2563();
                                field984 = 0;
                                boolean var93 = false;
                                int var94 = -1;
                                int var95 = class97.field1490;
                                int[] var96 = class97.field1497;
                                for (int var97 = 0; var97 < field929 + var95; var97++) {
                                    class79 var98;
                                    if (var97 < var95) {
                                        var98 = field1032[var96[var97]];
                                        if (field1107 == var96[var97]) {
                                            var93 = true;
                                            var94 = var97;
                                            continue;
                                        }
                                    } else {
                                        var98 = field928[field1014[var97 - var95]];
                                    }
                                    method3651(var98, var97, var47, var48, var49, var50);
                                }
                                if (var93) {
                                    method3651(field1032[field1107], var94, var47, var48, var49, var50);
                                }
                                for (int var99 = 0; var99 < field984; var99++) {
                                    int var100 = field986[var99];
                                    int var101 = field911[var99];
                                    int var102 = field989[var99];
                                    int var103 = field988[var99];
                                    boolean var104 = true;
                                    while (var104) {
                                        var104 = false;
                                        for (int var105 = 0; var105 < var99; var105++) {
                                            if (var101 + 2 > field911[var105] - field988[var105] && var101 - var103 < field911[var105] + 2 && var100 - var102 < field989[var105] + field986[var105] && var100 + var102 > field986[var105] - field989[var105] && field911[var105] - field988[var105] < var101) {
                                                var101 = field911[var105] - field988[var105];
                                                var104 = true;
                                            }
                                        }
                                    }
                                    field996 = field986[var99];
                                    field997 = field911[var99] = var101;
                                    String var106 = field993[var99];
                                    if (field1053 == 0) {
                                        int var107 = 16776960;
                                        if (field1057[var99] < 6) {
                                            var107 = field1067[field1057[var99]];
                                        }
                                        if (field1057[var99] == 6) {
                                            var107 = field1153 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field1057[var99] == 7) {
                                            var107 = field1153 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field1057[var99] == 8) {
                                            var107 = field1153 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field1057[var99] == 9) {
                                            int var108 = 150 - field953[var99];
                                            if (var108 < 50) {
                                                var107 = var108 * 1280 + 16711680;
                                            } else if (var108 < 100) {
                                                var107 = 16776960 - (var108 - 50) * 327680;
                                            } else if (var108 < 150) {
                                                var107 = (var108 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field1057[var99] == 10) {
                                            int var109 = 150 - field953[var99];
                                            if (var109 < 50) {
                                                var107 = var109 * 5 + 16711680;
                                            } else if (var109 < 100) {
                                                var107 = 16711935 - (var109 - 50) * 327680;
                                            } else if (var109 < 150) {
                                                var107 = (var109 - 100) * 327680 + 255 - (var109 - 100) * 5;
                                            }
                                        }
                                        if (field1057[var99] == 11) {
                                            int var110 = 150 - field953[var99];
                                            if (var110 < 50) {
                                                var107 = 16777215 - var110 * 327685;
                                            } else if (var110 < 100) {
                                                var107 = (var110 - 50) * 327685 + 65280;
                                            } else if (var110 < 150) {
                                                var107 = 16777215 - (var110 - 100) * 327680;
                                            }
                                        }
                                        if (field926[var99] == 0) {
                                            Statics.field532.method4456(var106, field996 + var47, field997 + var48, var107, 0);
                                        }
                                        if (field926[var99] == 1) {
                                            Statics.field532.method4458(var106, field996 + var47, field997 + var48, var107, 0, field1153);
                                        }
                                        if (field926[var99] == 2) {
                                            Statics.field532.method4459(var106, field996 + var47, field997 + var48, var107, 0, field1153);
                                        }
                                        if (field926[var99] == 3) {
                                            Statics.field532.method4460(var106, field996 + var47, field997 + var48, var107, 0, field1153, 150 - field953[var99]);
                                        }
                                        if (field926[var99] == 4) {
                                            int var111 = (150 - field953[var99]) * (Statics.field532.method4448(var106) + 100) / 150;
                                            class282.method4633(field996 + var47 - 50, var48, field996 + var47 + 50, var48 + var50);
                                            Statics.field532.method4523(var106, field996 + var47 + 50 - var111, field997 + var48, var107, 0);
                                            class282.method4632(var47, var48, var47 + var49, var48 + var50);
                                        }
                                        if (field926[var99] == 5) {
                                            int var112 = 150 - field953[var99];
                                            int var113 = 0;
                                            if (var112 < 25) {
                                                var113 = var112 - 25;
                                            } else if (var112 > 125) {
                                                var113 = var112 - 125;
                                            }
                                            class282.method4633(var47, field997 + var48 - Statics.field532.field3639 - 1, var47 + var49, field997 + var48 + 5);
                                            Statics.field532.method4456(var106, field996 + var47, field997 + var48 + var113, var107, 0);
                                            class282.method4632(var47, var48, var47 + var49, var48 + var50);
                                        }
                                    } else {
                                        Statics.field532.method4456(var106, field996 + var47, field997 + var48, 16776960, 0);
                                    }
                                }
                                if (field908 == 2) {
                                    Statics.method3931((field925 - Statics.field2304 << 7) + field914, (field912 - Statics.field2147 << 7) + field1027, field1134 * 2);
                                    if (field996 > -1 && field900 % 20 < 10) {
                                        Statics.field262[0].method4831(field996 + var47 - 12, field997 + var48 - 28);
                                    }
                                }
                                ((class126) Statics.field2018).method2200(field967);
                                method504(var47, var48, var49, var50);
                                Statics.field275 = var83;
                                Statics.field537 = var84;
                                Statics.field277 = var85;
                                Statics.field503 = var86;
                                Statics.field3308 = var87;
                                if (field899) {
                                    byte var114 = 0;
                                    int var115 = class239.field3247 + class239.field3245 + var114;
                                    if (var115 == 0) {
                                        field899 = false;
                                    }
                                }
                                if (field899) {
                                    class282.method4676(var47, var48, var49, var50, 0);
                                    method318(class226.field2852, false);
                                }
                                field1096[var10.field2762] = true;
                                class282.method4632(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2647 == 1338) {
                                method1027();
                                class211 var117 = var10.method3749(false);
                                if (var117 != null) {
                                    class282.method4632(var12, var13, var117.field2592 + var12, var117.field2591 + var13);
                                    if (field1018 == 2 || field1018 == 5) {
                                        class282.method4654(var12, var13, 0, var117.field2588, var117.field2590);
                                    } else {
                                        int var118 = field991 + field1158 & 0x7FF;
                                        int var119 = Statics.field308.field1247 / 32 + 48;
                                        int var120 = 464 - Statics.field308.field1200 / 32;
                                        Statics.field2369.method4767(var12, var13, var117.field2592, var117.field2591, var119, var120, var118, field964 + 256, var117.field2588, var117.field2590);
                                        for (int var121 = 0; var121 < field1119; var121++) {
                                            int var122 = field919[var121] * 4 + 2 - Statics.field308.field1247 / 32;
                                            int var123 = field1065[var121] * 4 + 2 - Statics.field308.field1200 / 32;
                                            method696(var12, var13, var122, var123, field1125[var121], var117);
                                        }
                                        int var124 = 0;
                                        while (true) {
                                            if (var124 >= 104) {
                                                for (int var129 = 0; var129 < field929; var129++) {
                                                    class87 var130 = field928[field1014[var129]];
                                                    if (var130 != null && var130.method1057()) {
                                                        class259 var131 = var130.field1354;
                                                        if (var131 != null && var131.field3550 != null) {
                                                            var131 = var131.method4345();
                                                        }
                                                        if (var131 != null && var131.field3564 && var131.field3576) {
                                                            int var132 = var130.field1247 / 32 - Statics.field308.field1247 / 32;
                                                            int var133 = var130.field1200 / 32 - Statics.field308.field1200 / 32;
                                                            method696(var12, var13, var132, var133, Statics.field1283[1], var117);
                                                        }
                                                    }
                                                }
                                                int var134 = class97.field1490;
                                                int[] var135 = class97.field1497;
                                                for (int var136 = 0; var136 < var134; var136++) {
                                                    class75 var137 = field1032[var135[var136]];
                                                    if (var137 != null && var137.method1057() && !var137.field868 && Statics.field308 != var137) {
                                                        int var138 = var137.field1247 / 32 - Statics.field308.field1247 / 32;
                                                        int var139 = var137.field1200 / 32 - Statics.field308.field1200 / 32;
                                                        boolean var140 = false;
                                                        if (method2764(var137.field881, true)) {
                                                            var140 = true;
                                                        }
                                                        boolean var141 = false;
                                                        for (int var142 = 0; var142 < Statics.field611; var142++) {
                                                            if (var137.field881.equals(Statics.field3744[var142].field882)) {
                                                                var141 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var143 = false;
                                                        if (Statics.field308.field873 != 0 && var137.field873 != 0 && Statics.field308.field873 == var137.field873) {
                                                            var143 = true;
                                                        }
                                                        if (var140) {
                                                            method696(var12, var13, var138, var139, Statics.field1283[3], var117);
                                                        } else if (var143) {
                                                            method696(var12, var13, var138, var139, Statics.field1283[4], var117);
                                                        } else if (var141) {
                                                            method696(var12, var13, var138, var139, Statics.field1283[5], var117);
                                                        } else {
                                                            method696(var12, var13, var138, var139, Statics.field1283[2], var117);
                                                        }
                                                    }
                                                }
                                                if (field908 != 0 && field900 % 20 < 10) {
                                                    if (field908 == 1 && field909 >= 0 && field909 < field928.length) {
                                                        class87 var144 = field928[field909];
                                                        if (var144 != null) {
                                                            int var145 = var144.field1247 / 32 - Statics.field308.field1247 / 32;
                                                            int var146 = var144.field1200 / 32 - Statics.field308.field1200 / 32;
                                                            method604(var12, var13, var145, var146, Statics.field1348[1], var117);
                                                        }
                                                    }
                                                    if (field908 == 2) {
                                                        int var147 = field925 * 4 - Statics.field2304 * 4 + 2 - Statics.field308.field1247 / 32;
                                                        int var148 = field912 * 4 - Statics.field2147 * 4 + 2 - Statics.field308.field1200 / 32;
                                                        method604(var12, var13, var147, var148, Statics.field1348[1], var117);
                                                    }
                                                    if (field908 == 10 && field910 >= 0 && field910 < field1032.length) {
                                                        class75 var149 = field1032[field910];
                                                        if (var149 != null) {
                                                            int var150 = var149.field1247 / 32 - Statics.field308.field1247 / 32;
                                                            int var151 = var149.field1200 / 32 - Statics.field308.field1200 / 32;
                                                            method604(var12, var13, var150, var151, Statics.field1348[1], var117);
                                                        }
                                                    }
                                                }
                                                if (field1123 != 0) {
                                                    int var152 = field1123 * 4 + 2 - Statics.field308.field1247 / 32;
                                                    int var153 = field1124 * 4 + 2 - Statics.field308.field1200 / 32;
                                                    method696(var12, var13, var152, var153, Statics.field1348[0], var117);
                                                }
                                                if (!Statics.field308.field868) {
                                                    class282.method4676(var117.field2592 / 2 + var12 - 1, var117.field2591 / 2 + var13 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var125 = 0; var125 < 104; var125++) {
                                                class194 var126 = field1021[Statics.field3606][var124][var125];
                                                if (var126 != null) {
                                                    int var127 = var124 * 4 + 2 - Statics.field308.field1247 / 32;
                                                    int var128 = var125 * 4 + 2 - Statics.field308.field1200 / 32;
                                                    method696(var12, var13, var127, var128, Statics.field1283[0], var117);
                                                }
                                            }
                                            var124++;
                                        }
                                    }
                                    field1097[var11] = true;
                                }
                                class282.method4632(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2647 == 1339) {
                                class211 var154 = var10.method3749(false);
                                if (var154 != null) {
                                    if (field1018 < 3) {
                                        Statics.field2305.method4767(var12, var13, var154.field2592, var154.field2591, 25, 25, field1158, 256, var154.field2588, var154.field2590);
                                    } else {
                                        class282.method4654(var12, var13, 0, var154.field2588, var154.field2590);
                                    }
                                }
                                class282.method4632(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2647 == 1400) {
                                Statics.field1326.method4894(var12, var13, var10.field2730, var10.field2659, field900);
                            }
                            if (var10.field2647 == 1401) {
                                Statics.field1326.method5060(var12, var13, var10.field2730, var10.field2659);
                            }
                        }
                        if (var10.field2645 == 0) {
                            if (!var10.field2642 && method2698(var10) && Statics.field869 != var10) {
                                continue;
                            }
                            if (!var10.field2642) {
                                if (var10.field2692 > var10.field2661 - var10.field2659) {
                                    var10.field2692 = var10.field2661 - var10.field2659;
                                }
                                if (var10.field2692 < 0) {
                                    var10.field2692 = 0;
                                }
                            }
                            method320(arg0, var10.field2643, var19, var20, var21, var22, var12 - var10.field2630, var13 - var10.field2692, var11);
                            if (var10.field2747 != null) {
                                method320(var10.field2747, var10.field2643, var19, var20, var21, var22, var12 - var10.field2630, var13 - var10.field2692, var11);
                            }
                            class69 var155 = (class69) field1020.method3331((long) var10.field2643);
                            if (var155 != null) {
                                method59(var155.field814, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class282.method4632(arg2, arg3, arg4, arg5);
                            class137.method2435();
                        }
                        if (field1105 || field1098[var11] || field1103 > 1) {
                            if (var10.field2645 == 0 && !var10.field2642 && var10.field2661 > var10.field2659) {
                                int var156 = var10.field2730 + var12;
                                int var157 = var10.field2692;
                                int var158 = var10.field2659;
                                int var159 = var10.field2661;
                                Statics.field643[0].method4725(var156, var13);
                                Statics.field643[1].method4725(var156, var13 + var158 - 16);
                                class282.method4676(var156, var13 + 16, 16, var158 - 32, field941);
                                int var160 = (var158 - 32) * var158 / var159;
                                if (var160 < 8) {
                                    var160 = 8;
                                }
                                int var161 = (var158 - 32 - var160) * var157 / (var159 - var158);
                                class282.method4676(var156, var13 + 16 + var161, 16, var160, field1016);
                                class282.method4710(var156, var13 + 16 + var161, var160, field970);
                                class282.method4710(var156 + 1, var13 + 16 + var161, var160, field970);
                                class282.method4648(var156, var13 + 16 + var161, 16, field970);
                                class282.method4648(var156, var13 + 17 + var161, 16, field970);
                                class282.method4710(var156 + 15, var13 + 16 + var161, var160, field947);
                                class282.method4710(var156 + 14, var13 + 17 + var161, var160 - 1, field947);
                                class282.method4648(var156, var13 + 15 + var161 + var160, 16, field947);
                                class282.method4648(var156 + 1, var13 + 14 + var161 + var160, 15, field947);
                            }
                            if (var10.field2645 != 1) {
                                if (var10.field2645 == 2) {
                                    int var162 = 0;
                                    for (int var163 = 0; var163 < var10.field2639; var163++) {
                                        for (int var164 = 0; var164 < var10.field2662; var164++) {
                                            int var165 = (var10.field2667 + 32) * var164 + var12;
                                            int var166 = (var10.field2710 + 32) * var163 + var13;
                                            if (var162 < 20) {
                                                var165 += var10.field2711[var162];
                                                var166 += var10.field2712[var162];
                                            }
                                            if (var10.field2761[var162] > 0) {
                                                boolean var167 = false;
                                                boolean var168 = false;
                                                int var169 = var10.field2761[var162] - 1;
                                                if (var165 + 32 > arg2 && var165 < arg4 && var166 + 32 > arg3 && var166 < arg5 || Statics.field324 == var10 && field1106 == var162) {
                                                    class286 var170;
                                                    if (field1044 == 1 && Statics.field613 == var162 && Statics.field2623 == var10.field2643) {
                                                        var170 = class257.method226(var169, var10.field2637[var162], 2, 0, 2, false);
                                                    } else {
                                                        var170 = class257.method226(var169, var10.field2637[var162], 1, 3153952, 2, false);
                                                    }
                                                    if (var170 == null) {
                                                        method3808(var10);
                                                    } else if (Statics.field324 == var10 && field1106 == var162) {
                                                        int var171 = class60.field722 - field994;
                                                        int var172 = class60.field723 * -113761157 - field971;
                                                        if (var171 < 5 && var171 > -5) {
                                                            var171 = 0;
                                                        }
                                                        if (var172 < 5 && var172 > -5) {
                                                            var172 = 0;
                                                        }
                                                        if (field1091 < 5) {
                                                            var171 = 0;
                                                            var172 = 0;
                                                        }
                                                        var170.method4762(var165 + var171, var166 + var172, 128);
                                                        if (arg1 != -1) {
                                                            class217 var173 = arg0[arg1 & 0xFFFF];
                                                            if (var166 + var172 < class282.field3747 && var173.field2692 > 0) {
                                                                int var174 = field967 * (class282.field3747 - var166 - var172) / 3;
                                                                if (var174 > field967 * 10) {
                                                                    var174 = field967 * 10;
                                                                }
                                                                if (var174 > var173.field2692) {
                                                                    var174 = var173.field2692;
                                                                }
                                                                var173.field2692 -= var174;
                                                                field971 += var174;
                                                                method3808(var173);
                                                            }
                                                            if (var166 + var172 + 32 > class282.field3751 && var173.field2692 < var173.field2661 - var173.field2659) {
                                                                int var175 = field967 * (var166 + var172 + 32 - class282.field3751) / 3;
                                                                if (var175 > field967 * 10) {
                                                                    var175 = field967 * 10;
                                                                }
                                                                if (var175 > var173.field2661 - var173.field2659 - var173.field2692) {
                                                                    var175 = var173.field2661 - var173.field2659 - var173.field2692;
                                                                }
                                                                var173.field2692 += var175;
                                                                field971 -= var175;
                                                                method3808(var173);
                                                            }
                                                        }
                                                    } else if (Statics.field508 == var10 && field1003 == var162) {
                                                        var170.method4762(var165, var166, 128);
                                                    } else {
                                                        var170.method4831(var165, var166);
                                                    }
                                                }
                                            } else if (var10.field2713 != null && var162 < 20) {
                                                class286 var176 = var10.method3769(var162);
                                                if (var176 != null) {
                                                    var176.method4831(var165, var166);
                                                } else if (class217.field2665) {
                                                    method3808(var10);
                                                }
                                            }
                                            var162++;
                                        }
                                    }
                                } else if (var10.field2645 == 3) {
                                    int var177;
                                    if (method639(var10)) {
                                        var177 = var10.field2669;
                                        if (Statics.field869 == var10 && var10.field2671 != 0) {
                                            var177 = var10.field2671;
                                        }
                                    } else {
                                        var177 = var10.field2668;
                                        if (Statics.field869 == var10 && var10.field2707 != 0) {
                                            var177 = var10.field2707;
                                        }
                                    }
                                    if (var10.field2672) {
                                        switch(var10.field2673.field3762) {
                                            case 1:
                                                class282.method4641(var12, var13, var10.field2730, var10.field2659, var10.field2668, var10.field2669, 256 - (var10.field2674 & 0xFF), 256 - (var10.field2735 & 0xFF));
                                                break;
                                            case 2:
                                                class282.method4707(var12, var13, var10.field2730, var10.field2659, var10.field2668, var10.field2669, 256 - (var10.field2674 & 0xFF), 256 - (var10.field2735 & 0xFF));
                                                break;
                                            case 3:
                                                class282.method4697(var12, var13, var10.field2730, var10.field2659, var10.field2668, var10.field2669, 256 - (var10.field2674 & 0xFF), 256 - (var10.field2735 & 0xFF));
                                                break;
                                            case 4:
                                                class282.method4645(var12, var13, var10.field2730, var10.field2659, var10.field2668, var10.field2669, 256 - (var10.field2674 & 0xFF), 256 - (var10.field2735 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class282.method4676(var12, var13, var10.field2730, var10.field2659, var177);
                                                } else {
                                                    class282.method4682(var12, var13, var10.field2730, var10.field2659, var177, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class282.method4646(var12, var13, var10.field2730, var10.field2659, var177);
                                    } else {
                                        class282.method4647(var12, var13, var10.field2730, var10.field2659, var177, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2645 == 4) {
                                    class264 var178 = var10.method3735();
                                    if (var178 != null) {
                                        String var179 = var10.field2703;
                                        int var180;
                                        if (method639(var10)) {
                                            var180 = var10.field2669;
                                            if (Statics.field869 == var10 && var10.field2671 != 0) {
                                                var180 = var10.field2671;
                                            }
                                            if (var10.field2704.length() > 0) {
                                                var179 = var10.field2704;
                                            }
                                        } else {
                                            var180 = var10.field2668;
                                            if (Statics.field869 == var10 && var10.field2707 != 0) {
                                                var180 = var10.field2707;
                                            }
                                        }
                                        if (var10.field2642 && var10.field2763 != -1) {
                                            class257 var181 = class257.method678(var10.field2763);
                                            var179 = var181.field3489;
                                            if (var179 == null) {
                                                var179 = "null";
                                            }
                                            if ((var181.field3490 == 1 || var10.field2764 != 1) && var10.field2764 != -1) {
                                                var179 = class89.method1488(16748608) + var179 + class89.field1376 + " " + 'x' + method27(var10.field2764);
                                            }
                                        }
                                        if (field1055 == var10) {
                                            class226 var10000 = (class226) null;
                                            var179 = class226.field3000;
                                            var180 = var10.field2668;
                                        }
                                        if (!var10.field2642) {
                                            var179 = method30(var179, var10);
                                        }
                                        var178.method4457(var179, var12, var13, var10.field2730, var10.field2659, var180, var10.field2708 ? 0 : -1, var10.field2706, var10.field2773, var10.field2705);
                                    } else if (class217.field2665) {
                                        method3808(var10);
                                    }
                                } else if (var10.field2645 == 5) {
                                    if (var10.field2642) {
                                        class286 var183;
                                        if (var10.field2763 == -1) {
                                            var183 = var10.method3734(false);
                                        } else {
                                            var183 = class257.method226(var10.field2763, var10.field2764, var10.field2682, var10.field2743, var10.field2771, false);
                                        }
                                        if (var183 != null) {
                                            int var184 = var183.field3772;
                                            int var185 = var183.field3778;
                                            if (var10.field2724) {
                                                class282.method4633(var12, var13, var10.field2730 + var12, var10.field2659 + var13);
                                                int var186 = (var10.field2730 + (var184 - 1)) / var184;
                                                int var187 = (var10.field2659 + (var185 - 1)) / var185;
                                                for (int var188 = 0; var188 < var186; var188++) {
                                                    for (int var189 = 0; var189 < var187; var189++) {
                                                        if (var10.field2680 != 0) {
                                                            var183.method4745(var184 / 2 + var184 * var188 + var12, var185 / 2 + var185 * var189 + var13, var10.field2680, 4096);
                                                        } else if (var14 == 0) {
                                                            var183.method4831(var184 * var188 + var12, var185 * var189 + var13);
                                                        } else {
                                                            var183.method4762(var184 * var188 + var12, var185 * var189 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class282.method4632(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var190 = var10.field2730 * 4096 / var184;
                                                if (var10.field2680 != 0) {
                                                    var183.method4745(var10.field2730 / 2 + var12, var10.field2659 / 2 + var13, var10.field2680, var190);
                                                } else if (var14 != 0) {
                                                    var183.method4764(var12, var13, var10.field2730, var10.field2659, 256 - (var14 & 0xFF));
                                                } else if (var10.field2730 == var184 && var10.field2659 == var185) {
                                                    var183.method4831(var12, var13);
                                                } else {
                                                    var183.method4758(var12, var13, var10.field2730, var10.field2659);
                                                }
                                            }
                                        } else if (class217.field2665) {
                                            method3808(var10);
                                        }
                                    } else {
                                        class286 var182 = var10.method3734(method639(var10));
                                        if (var182 != null) {
                                            var182.method4831(var12, var13);
                                        } else if (class217.field2665) {
                                            method3808(var10);
                                        }
                                    }
                                } else if (var10.field2645 == 6) {
                                    boolean var191 = method639(var10);
                                    int var192;
                                    if (var191) {
                                        var192 = var10.field2676;
                                    } else {
                                        var192 = var10.field2690;
                                    }
                                    class134 var193 = null;
                                    int var194 = 0;
                                    if (var10.field2763 != -1) {
                                        class257 var195 = class257.method678(var10.field2763);
                                        if (var195 != null) {
                                            class257 var196 = var195.method4281(var10.field2764);
                                            var193 = var196.method4328(1);
                                            if (var193 == null) {
                                                method3808(var10);
                                            } else {
                                                var193.method2359();
                                                var194 = var193.field2104 / 2;
                                            }
                                        }
                                    } else if (var10.field2686 == 5) {
                                        if (var10.field2687 == 0) {
                                            var193 = field1163.method3694((class261) null, -1, (class261) null, -1);
                                        } else {
                                            var193 = Statics.field308.method1053();
                                        }
                                    } else if (var192 == -1) {
                                        var193 = var10.method3737((class261) null, -1, var191, Statics.field308.field855);
                                        if (var193 == null && class217.field2665) {
                                            method3808(var10);
                                        }
                                    } else {
                                        class261 var197 = class261.method2856(var192);
                                        var193 = var10.method3737(var197, var10.field2774, var191, Statics.field308.field855);
                                        if (var193 == null && class217.field2665) {
                                            method3808(var10);
                                        }
                                    }
                                    class137.method2409(var10.field2730 / 2 + var12, var10.field2659 / 2 + var13);
                                    int var198 = var10.field2697 * class137.field2021[var10.field2720] >> 16;
                                    int var199 = var10.field2697 * class137.field2022[var10.field2720] >> 16;
                                    if (var193 != null) {
                                        if (var10.field2642) {
                                            var193.method2359();
                                            if (var10.field2700) {
                                                var193.method2337(0, var10.field2695, var10.field2654, var10.field2720, var10.field2753, var10.field2693 + var194 + var198, var10.field2693 + var199, var10.field2697);
                                            } else {
                                                var193.method2336(0, var10.field2695, var10.field2654, var10.field2720, var10.field2753, var10.field2693 + var194 + var198, var10.field2693 + var199);
                                            }
                                        } else {
                                            var193.method2336(0, var10.field2695, 0, var10.field2720, 0, var198, var199);
                                        }
                                    }
                                    class137.method2408();
                                } else {
                                    if (var10.field2645 == 7) {
                                        class264 var200 = var10.method3735();
                                        if (var200 == null) {
                                            if (class217.field2665) {
                                                method3808(var10);
                                            }
                                            continue;
                                        }
                                        int var201 = 0;
                                        for (int var202 = 0; var202 < var10.field2639; var202++) {
                                            for (int var203 = 0; var203 < var10.field2662; var203++) {
                                                if (var10.field2761[var201] > 0) {
                                                    class257 var204 = class257.method678(var10.field2761[var201] - 1);
                                                    String var205;
                                                    if (var204.field3490 != 1 && var10.field2637[var201] == 1) {
                                                        var205 = class89.method1488(16748608) + var204.field3489 + class89.field1376;
                                                    } else {
                                                        var205 = class89.method1488(16748608) + var204.field3489 + class89.field1376 + " " + 'x' + method27(var10.field2637[var201]);
                                                    }
                                                    int var206 = (var10.field2667 + 115) * var203 + var12;
                                                    int var207 = (var10.field2710 + 12) * var202 + var13;
                                                    if (var10.field2706 == 0) {
                                                        var200.method4523(var205, var206, var207, var10.field2668, var10.field2708 ? 0 : -1);
                                                    } else if (var10.field2706 == 1) {
                                                        var200.method4456(var205, var10.field2730 / 2 + var206, var207, var10.field2668, var10.field2708 ? 0 : -1);
                                                    } else {
                                                        var200.method4455(var205, var10.field2730 + var206 - 1, var207, var10.field2668, var10.field2708 ? 0 : -1);
                                                    }
                                                }
                                                var201++;
                                            }
                                        }
                                    }
                                    if (var10.field2645 == 8 && Statics.field3580 == var10 && field1121 == field1043) {
                                        int var208 = 0;
                                        int var209 = 0;
                                        class264 var210 = Statics.field846;
                                        String var211 = var10.field2703;
                                        String var212 = method30(var211, var10);
                                        while (var212.length() > 0) {
                                            int var213 = var212.indexOf(class89.field1379);
                                            String var214;
                                            if (var213 == -1) {
                                                var214 = var212;
                                                var212 = "";
                                            } else {
                                                var214 = var212.substring(0, var213);
                                                var212 = var212.substring(var213 + 4);
                                            }
                                            int var215 = var210.method4448(var214);
                                            if (var215 > var208) {
                                                var208 = var215;
                                            }
                                            var209 += var210.field3639 + 1;
                                        }
                                        var208 += 6;
                                        var209 += 7;
                                        int var216 = var10.field2730 + var12 - 5 - var208;
                                        int var217 = var10.field2659 + var13 + 5;
                                        if (var216 < var12 + 5) {
                                            var216 = var12 + 5;
                                        }
                                        if (var208 + var216 > arg4) {
                                            var216 = arg4 - var208;
                                        }
                                        if (var209 + var217 > arg5) {
                                            var217 = arg5 - var209;
                                        }
                                        class282.method4676(var216, var217, var208, var209, 16777120);
                                        class282.method4646(var216, var217, var208, var209, 0);
                                        String var218 = var10.field2703;
                                        int var219 = var210.field3639 + var217 + 2;
                                        String var220 = method30(var218, var10);
                                        while (var220.length() > 0) {
                                            int var221 = var220.indexOf(class89.field1379);
                                            String var222;
                                            if (var221 == -1) {
                                                var222 = var220;
                                                var220 = "";
                                            } else {
                                                var222 = var220.substring(0, var221);
                                                var220 = var220.substring(var221 + 4);
                                            }
                                            var210.method4523(var222, var216 + 3, var219, 0, -1);
                                            var219 += var210.field3639 + 1;
                                        }
                                    }
                                    if (var10.field2645 == 9) {
                                        int var223;
                                        int var224;
                                        int var225;
                                        int var226;
                                        if (var10.field2677) {
                                            var223 = var12;
                                            var224 = var10.field2659 + var13;
                                            var225 = var10.field2730 + var12;
                                            var226 = var13;
                                        } else {
                                            var223 = var12;
                                            var224 = var13;
                                            var225 = var10.field2730 + var12;
                                            var226 = var10.field2659 + var13;
                                        }
                                        if (var10.field2670 == 1) {
                                            class282.method4689(var223, var224, var225, var226, var10.field2668);
                                        } else {
                                            method907(var223, var224, var225, var226, var10.field2668, var10.field2670);
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

    @ObfuscatedName("bl.hi(IIIIIIB)V")
    public static final void method907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class282.field3750;
        int var18 = arg1 - class282.field3747;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class137.method2486(var19, var20, var21);
        class137.method2479(var23, var24, var25, var19, var20, var21, arg4);
        class137.method2486(var19, var21, var22);
        class137.method2479(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("l.hl(Ljava/lang/String;Lhr;I)Ljava/lang/String;")
    public static String method30(String arg0, class217 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method1033(arg1, var2 - 1);
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
                if (Statics.field2534 != null) {
                    var8 = class271.method10(Statics.field2534.field2206);
                    if (Statics.field2534.field2212 != null) {
                        var8 = (String) Statics.field2534.field2212;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("p.hh(II)Ljava/lang/String;")
    public static final String method27(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class89.field1375 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class89.method1488(65408) + var1.substring(0, var1.length() - 8) + class226.field3003 + " " + class89.field1372 + var1 + class89.field1373 + class89.field1376;
        } else if (var1.length() > 6) {
            return " " + class89.method1488(16777215) + var1.substring(0, var1.length() - 4) + class226.field3118 + " " + class89.field1372 + var1 + class89.field1373 + class89.field1376;
        } else {
            return " " + class89.method1488(16776960) + var1 + class89.field1376;
        }
    }

    @ObfuscatedName("client.hv(ZI)V")
    public final void method1078(boolean arg0) {
        int var2 = field1051;
        int var3 = Statics.field3627;
        int var4 = Statics.field321;
        if (class217.method68(var2)) {
            method2150(Statics.field1401[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.hu(Lhr;I)V")
    public void method1095(class217 arg0) {
        class217 var2 = arg0.field2675 == -1 ? null : class217.method4432(arg0.field2675);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field3627;
            var4 = Statics.field321;
        } else {
            var3 = var2.field2730;
            var4 = var2.field2659;
        }
        method466(arg0, var3, var4, false);
        method154(arg0, var3, var4);
    }

    @ObfuscatedName("c.hs([Lhr;Lhr;ZI)V")
    public static void method169(class217[] arg0, class217 arg1, boolean arg2) {
        int var3 = arg1.field2666 == 0 ? arg1.field2730 : arg1.field2666;
        int var4 = arg1.field2661 == 0 ? arg1.field2659 : arg1.field2661;
        method2150(arg0, arg1.field2643, var3, var4, arg2);
        if (arg1.field2747 != null) {
            method2150(arg1.field2747, arg1.field2643, var3, var4, arg2);
        }
        class69 var5 = (class69) field1020.method3331((long) arg1.field2643);
        if (var5 != null) {
            int var6 = var5.field814;
            if (class217.method68(var6)) {
                method2150(Statics.field1401[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2647 == 1337) {
        }
    }

    @ObfuscatedName("dj.hd([Lhr;IIIZI)V")
    public static void method2150(class217[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class217 var6 = arg0[var5];
            if (var6 != null && var6.field2675 == arg1) {
                method466(var6, arg2, arg3, arg4);
                method154(var6, arg2, arg3);
                if (var6.field2630 > var6.field2666 - var6.field2730) {
                    var6.field2630 = var6.field2666 - var6.field2730;
                }
                if (var6.field2630 < 0) {
                    var6.field2630 = 0;
                }
                if (var6.field2692 > var6.field2661 - var6.field2659) {
                    var6.field2692 = var6.field2661 - var6.field2659;
                }
                if (var6.field2692 < 0) {
                    var6.field2692 = 0;
                }
                if (var6.field2645 == 0) {
                    method169(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ae.hq(Lhr;IIZI)V")
    public static void method466(class217 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2730;
        int var5 = arg0.field2659;
        if (arg0.field2714 == 0) {
            arg0.field2730 = arg0.field2662;
        } else if (arg0.field2714 == 1) {
            arg0.field2730 = arg1 - arg0.field2662;
        } else if (arg0.field2714 == 2) {
            arg0.field2730 = arg0.field2662 * arg1 >> 14;
        }
        if (arg0.field2655 == 0) {
            arg0.field2659 = arg0.field2639;
        } else if (arg0.field2655 == 1) {
            arg0.field2659 = arg2 - arg0.field2639;
        } else if (arg0.field2655 == 2) {
            arg0.field2659 = arg0.field2639 * arg2 >> 14;
        }
        if (arg0.field2714 == 4) {
            arg0.field2730 = arg0.field2660 * arg0.field2659 / arg0.field2758;
        }
        if (arg0.field2655 == 4) {
            arg0.field2659 = arg0.field2758 * arg0.field2730 / arg0.field2660;
        }
        if (field1061 && arg0.field2645 == 0) {
            if (arg0.field2659 < 5 && arg0.field2730 < 5) {
                arg0.field2659 = 5;
                arg0.field2730 = 5;
            } else {
                if (arg0.field2659 <= 0) {
                    arg0.field2659 = 5;
                }
                if (arg0.field2730 <= 0) {
                    arg0.field2730 = 5;
                }
            }
        }
        if (arg0.field2647 == 1337) {
            field904 = arg0;
        }
        if (arg3 && arg0.field2752 != null && (arg0.field2730 != var4 || arg0.field2659 != var5)) {
            class70 var6 = new class70();
            var6.field817 = arg0;
            var6.field827 = arg0.field2752;
            field1090.method3371(var6);
        }
    }

    @ObfuscatedName("f.iz(Lhr;III)V")
    public static void method154(class217 arg0, int arg1, int arg2) {
        if (arg0.field2648 == 0) {
            arg0.field2656 = arg0.field2652;
        } else if (arg0.field2648 == 1) {
            arg0.field2656 = (arg1 - arg0.field2730) / 2 + arg0.field2652;
        } else if (arg0.field2648 == 2) {
            arg0.field2656 = arg1 - arg0.field2730 - arg0.field2652;
        } else if (arg0.field2648 == 3) {
            arg0.field2656 = arg0.field2652 * arg1 >> 14;
        } else if (arg0.field2648 == 4) {
            arg0.field2656 = (arg0.field2652 * arg1 >> 14) + (arg1 - arg0.field2730) / 2;
        } else {
            arg0.field2656 = arg1 - arg0.field2730 - (arg0.field2652 * arg1 >> 14);
        }
        if (arg0.field2649 == 0) {
            arg0.field2657 = arg0.field2664;
        } else if (arg0.field2649 == 1) {
            arg0.field2657 = (arg2 - arg0.field2659) / 2 + arg0.field2664;
        } else if (arg0.field2649 == 2) {
            arg0.field2657 = arg2 - arg0.field2659 - arg0.field2664;
        } else if (arg0.field2649 == 3) {
            arg0.field2657 = arg0.field2664 * arg2 >> 14;
        } else if (arg0.field2649 == 4) {
            arg0.field2657 = (arg0.field2664 * arg2 >> 14) + (arg2 - arg0.field2659) / 2;
        } else {
            arg0.field2657 = arg2 - arg0.field2659 - (arg0.field2664 * arg2 >> 14);
        }
        if (!field1061 || arg0.field2645 != 0) {
            return;
        }
        if (arg0.field2656 < 0) {
            arg0.field2656 = 0;
        } else if (arg0.field2730 + arg0.field2656 > arg1) {
            arg0.field2656 = arg1 - arg0.field2730;
        }
        if (arg0.field2657 < 0) {
            arg0.field2657 = 0;
        } else if (arg0.field2659 + arg0.field2657 > arg2) {
            arg0.field2657 = arg2 - arg0.field2659;
        }
    }

    @ObfuscatedName("al.iy(Lhr;I)Z")
    public static final boolean method639(class217 arg0) {
        if (arg0.field2756 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2756.length; var1++) {
            int var2 = method1033(arg0, var1);
            int var3 = arg0.field2757[var1];
            if (arg0.field2756[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2756[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2756[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("be.ig(Lhr;II)I")
    public static final int method1033(class217 arg0, int arg1) {
        if (arg0.field2755 == null || arg1 >= arg0.field2755.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2755[arg1];
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
                    var7 = field1025[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field1026[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field977[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class217 var11 = class217.method4432(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class257.method678(var12).field3505 || field1147)) {
                        for (int var13 = 0; var13 < var11.field2761.length; var13++) {
                            if (var12 + 1 == var11.field2761[var13]) {
                                var7 += var11.field2637[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class212.field2597[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class223.field2833[field1026[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class212.field2597[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field308.field859;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class223.field2829[var14]) {
                            var7 += field1026[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class217 var17 = class217.method4432(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class257.method678(var18).field3505 || field1147)) {
                        for (int var19 = 0; var19 < var17.field2761.length; var19++) {
                            if (var18 + 1 == var17.field2761[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1108;
                }
                if (var6 == 12) {
                    var7 = field1011;
                }
                if (var6 == 13) {
                    int var20 = class212.field2597[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class212.method1417(var22);
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
                    var7 = (Statics.field308.field1247 >> 7) + Statics.field2304;
                }
                if (var6 == 19) {
                    var7 = (Statics.field308.field1200 >> 7) + Statics.field2147;
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

    @ObfuscatedName("ft.il(IIIIIIIB)V")
    public static final void method2775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class217.method68(arg0)) {
            method479(Statics.field1401[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ar.ic([Lhr;IIIIIIIB)V")
    public static final void method479(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class217 var9 = arg0[var8];
            if (var9 != null && (!var9.field2642 || var9.field2645 == 0 || var9.field2723 || Statics.method555(var9) != 0 || field1085 == var9 || var9.field2647 == 1338) && var9.field2675 == arg1 && (!var9.field2642 || !method2698(var9))) {
                int var10 = var9.field2656 + arg6;
                int var11 = var9.field2657 + arg7;
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
                    int var18 = var9.field2730 + var10;
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
                    int var22 = var9.field2730 + var10;
                    int var23 = var9.field2659 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field962 == var9) {
                    field1072 = true;
                    field1073 = var10;
                    field1074 = var11;
                }
                if (!var9.field2642 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field722;
                    int var25 = class60.field723 * -113761157;
                    if (class60.field728 != 0) {
                        var24 = class60.field718;
                        var25 = class60.field730;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2647 == 1337) {
                        if (!field899 && !field1029 && var26) {
                            if (field1044 == 0 && !field1046) {
                                method3161(class226.field2997, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var27 = -1;
                            int var28 = -1;
                            for (int var29 = 0; var29 < class135.field1987; var29++) {
                                int var30 = class135.field1988[var29];
                                int var31 = var30 & 0x7F;
                                int var32 = var30 >> 7 & 0x7F;
                                int var33 = var30 >> 29 & 0x3;
                                int var34 = var30 >> 14 & 0x7FFF;
                                if (var28 != var30) {
                                    var28 = var30;
                                    if (var33 == 2 && Statics.field596.method2680(Statics.field3606, var31, var32, var30) >= 0) {
                                        class256 var35 = Statics.method564(var34);
                                        if (var35.field3471 != null) {
                                            var35 = var35.method4253();
                                        }
                                        if (var35 == null) {
                                            continue;
                                        }
                                        if (field1044 == 1) {
                                            method3161(class226.field2992, field1143 + " " + class89.field1374 + " " + class89.method1488(65535) + var35.field3440, 1, var30, var31, var32);
                                        } else if (!field1046) {
                                            String[] var36 = var35.field3451;
                                            if (field995) {
                                                var36 = method33(var36);
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
                                                        method3161(var36[var37], class89.method1488(65535) + var35.field3440, var38, var30, var31, var32);
                                                    }
                                                }
                                            }
                                            method3161(class226.field3095, class89.method1488(65535) + var35.field3440, 1002, var35.field3437 << 14, var31, var32);
                                        } else if ((Statics.field365 & 0x4) == 4) {
                                            method3161(field1049, field1050 + " " + class89.field1374 + " " + class89.method1488(65535) + var35.field3440, 2, var30, var31, var32);
                                        }
                                    }
                                    if (var33 == 1) {
                                        class87 var39 = field928[var34];
                                        if (var39 == null) {
                                            continue;
                                        }
                                        if (var39.field1354.field3549 == 1 && (var39.field1247 & 0x7F) == 64 && (var39.field1200 & 0x7F) == 64) {
                                            for (int var40 = 0; var40 < field929; var40++) {
                                                class87 var41 = field928[field1014[var40]];
                                                if (var41 != null && var39 != var41 && var41.field1354.field3549 == 1 && var39.field1247 == var41.field1247 && var39.field1200 == var41.field1200) {
                                                    method3147(var41.field1354, field1014[var40], var31, var32);
                                                }
                                            }
                                            int var42 = class97.field1490;
                                            int[] var43 = class97.field1497;
                                            for (int var44 = 0; var44 < var42; var44++) {
                                                class75 var45 = field1032[var43[var44]];
                                                if (var45 != null && var39.field1247 == var45.field1247 && var39.field1200 == var45.field1200) {
                                                    method675(var45, var43[var44], var31, var32);
                                                }
                                            }
                                        }
                                        method3147(var39.field1354, var34, var31, var32);
                                    }
                                    if (var33 == 0) {
                                        class75 var46 = field1032[var34];
                                        if (var46 == null) {
                                            continue;
                                        }
                                        if ((var46.field1247 & 0x7F) == 64 && (var46.field1200 & 0x7F) == 64) {
                                            for (int var47 = 0; var47 < field929; var47++) {
                                                class87 var48 = field928[field1014[var47]];
                                                if (var48 != null && var48.field1354.field3549 == 1 && var46.field1247 == var48.field1247 && var46.field1200 == var48.field1200) {
                                                    method3147(var48.field1354, field1014[var47], var31, var32);
                                                }
                                            }
                                            int var49 = class97.field1490;
                                            int[] var50 = class97.field1497;
                                            for (int var51 = 0; var51 < var49; var51++) {
                                                class75 var52 = field1032[var50[var51]];
                                                if (var52 != null && var46 != var52 && var46.field1247 == var52.field1247 && var46.field1200 == var52.field1200) {
                                                    method675(var52, var50[var51], var31, var32);
                                                }
                                            }
                                        }
                                        if (field1107 == var34) {
                                            var27 = var30;
                                        } else {
                                            method675(var46, var34, var31, var32);
                                        }
                                    }
                                    if (var33 == 3) {
                                        class194 var53 = field1021[Statics.field3606][var31][var32];
                                        if (var53 != null) {
                                            for (class95 var54 = (class95) var53.method3382(); var54 != null; var54 = (class95) var53.method3378()) {
                                                class257 var55 = class257.method678(var54.field1474);
                                                if (field1044 == 1) {
                                                    method3161(class226.field2992, field1143 + " " + class89.field1374 + " " + class89.method1488(16748608) + var55.field3489, 16, var54.field1474, var31, var32);
                                                } else if (!field1046) {
                                                    String[] var56 = var55.field3506;
                                                    if (field995) {
                                                        var56 = method33(var56);
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
                                                            method3161(var56[var57], class89.method1488(16748608) + var55.field3489, var58, var54.field1474, var31, var32);
                                                        } else if (var57 == 2) {
                                                            method3161(class226.field2955, class89.method1488(16748608) + var55.field3489, 20, var54.field1474, var31, var32);
                                                        }
                                                    }
                                                    method3161(class226.field3095, class89.method1488(16748608) + var55.field3489, 1004, var54.field1474, var31, var32);
                                                } else if ((Statics.field365 & 0x1) == 1) {
                                                    method3161(field1049, field1050 + " " + class89.field1374 + " " + class89.method1488(16748608) + var55.field3489, 17, var54.field1474, var31, var32);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var27 != -1) {
                                int var59 = var27 & 0x7F;
                                int var60 = var27 >> 7 & 0x7F;
                                class75 var61 = field1032[field1107];
                                method675(var61, field1107, var59, var60);
                            }
                        }
                    } else if (var9.field2647 != 1338) {
                        if (var9.field2647 == 1400) {
                            Statics.field1326.method4880(class60.field722, class60.field723 * -113761157, var26, var10, var11, var9.field2730, var9.field2659);
                        }
                        if (!field1029 && var26) {
                            if (var9.field2647 == 1400) {
                                Statics.field1326.method5021(var10, var11, var9.field2730, var9.field2659, var24, var25);
                            } else {
                                Statics.method3802(var9, var24 - var10, var25 - var11);
                            }
                        }
                        if (var9.field2645 == 0) {
                            if (!var9.field2642 && method2698(var9) && Statics.field869 != var9) {
                                continue;
                            }
                            method479(arg0, var9.field2643, var12, var13, var14, var15, var10 - var9.field2630, var11 - var9.field2692);
                            if (var9.field2747 != null) {
                                method479(var9.field2747, var9.field2643, var12, var13, var14, var15, var10 - var9.field2630, var11 - var9.field2692);
                            }
                            class69 var76 = (class69) field1020.method3331((long) var9.field2643);
                            if (var76 != null) {
                                if (var76.field811 == 0 && class60.field722 >= var12 && class60.field723 * -113761157 >= var13 && class60.field722 < var14 && class60.field723 * -113761157 < var15 && !field1029 && !field1061) {
                                    for (class70 var77 = (class70) field1090.method3376(); var77 != null; var77 = (class70) field1090.method3377()) {
                                        if (var77.field822) {
                                            var77.method3364();
                                            var77.field817.field2768 = false;
                                        }
                                    }
                                    if (Statics.field2121 == 0) {
                                        field962 = null;
                                        field1085 = null;
                                    }
                                    if (!field1029) {
                                        method3934();
                                    }
                                }
                                method2775(var76.field814, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2642) {
                            if (var9.field2776) {
                                if (class60.field722 >= var12 && class60.field723 * -113761157 >= var13 && class60.field722 < var14 && class60.field723 * -113761157 < var15) {
                                    for (class70 var78 = (class70) field1090.method3376(); var78 != null; var78 = (class70) field1090.method3377()) {
                                        if (var78.field822) {
                                            var78.method3364();
                                            var78.field817.field2768 = false;
                                        }
                                    }
                                    if (Statics.field2121 == 0) {
                                        field962 = null;
                                        field1085 = null;
                                    }
                                    if (!field1029) {
                                        field895[0] = class226.field2853;
                                        field1036[0] = "";
                                        field1033[0] = 1006;
                                        field961 = 1;
                                    }
                                }
                            } else if (var9.field2777 && class60.field722 >= var12 && class60.field723 * -113761157 >= var13 && class60.field722 < var14 && class60.field723 * -113761157 < var15) {
                                for (class70 var79 = (class70) field1090.method3376(); var79 != null; var79 = (class70) field1090.method3377()) {
                                    if (var79.field822 && var79.field817.field2744 == var79.field827) {
                                        var79.method3364();
                                    }
                                }
                            }
                            boolean var80;
                            if (class60.field722 >= var12 && class60.field723 * -113761157 >= var13 && class60.field722 < var14 && class60.field723 * -113761157 < var15) {
                                var80 = true;
                            } else {
                                var80 = false;
                            }
                            boolean var81 = false;
                            if ((class60.field733 == 1 || !Statics.field2179 && class60.field733 == 4) && var80) {
                                var81 = true;
                            }
                            boolean var82 = false;
                            if ((class60.field728 == 1 || !Statics.field2179 && class60.field728 == 4) && class60.field718 >= var12 && class60.field730 >= var13 && class60.field718 < var14 && class60.field730 < var15) {
                                var82 = true;
                            }
                            if (var82) {
                                method1029(var9, class60.field718 - var10, class60.field730 - var11);
                            }
                            if (var9.field2647 == 1400) {
                                Statics.field1326.method4983(class60.field722, class60.field723 * -113761157, var80 & var81);
                            }
                            if (field962 != null && field962 != var9 && var80) {
                                int var83 = Statics.method555(var9);
                                boolean var84 = (var83 >> 20 & 0x1) != 0;
                                if (var84) {
                                    field1068 = var9;
                                }
                            }
                            if (field1085 == var9) {
                                field1069 = true;
                                field1035 = var10;
                                field990 = var11;
                            }
                            if (var9.field2723) {
                                if (var80 && field1089 != 0 && var9.field2744 != null) {
                                    class70 var85 = new class70();
                                    var85.field822 = true;
                                    var85.field817 = var9;
                                    var85.field820 = field1089;
                                    var85.field827 = var9.field2744;
                                    field1090.method3371(var85);
                                }
                                if (field962 != null || Statics.field324 != null || field1029) {
                                    var82 = false;
                                    var81 = false;
                                    var80 = false;
                                }
                                if (!var9.field2759 && var82) {
                                    var9.field2759 = true;
                                    if (var9.field2725 != null) {
                                        class70 var86 = new class70();
                                        var86.field822 = true;
                                        var86.field817 = var9;
                                        var86.field818 = class60.field718 - var10;
                                        var86.field820 = class60.field730 - var11;
                                        var86.field827 = var9.field2725;
                                        field1090.method3371(var86);
                                    }
                                }
                                if (var9.field2759 && var81 && var9.field2726 != null) {
                                    class70 var87 = new class70();
                                    var87.field822 = true;
                                    var87.field817 = var9;
                                    var87.field818 = class60.field722 - var10;
                                    var87.field820 = class60.field723 * -113761157 - var11;
                                    var87.field827 = var9.field2726;
                                    field1090.method3371(var87);
                                }
                                if (var9.field2759 && !var81) {
                                    var9.field2759 = false;
                                    if (var9.field2727 != null) {
                                        class70 var88 = new class70();
                                        var88.field822 = true;
                                        var88.field817 = var9;
                                        var88.field818 = class60.field722 - var10;
                                        var88.field820 = class60.field723 * -113761157 - var11;
                                        var88.field827 = var9.field2727;
                                        field975.method3371(var88);
                                    }
                                }
                                if (var81 && var9.field2728 != null) {
                                    class70 var89 = new class70();
                                    var89.field822 = true;
                                    var89.field817 = var9;
                                    var89.field818 = class60.field722 - var10;
                                    var89.field820 = class60.field723 * -113761157 - var11;
                                    var89.field827 = var9.field2728;
                                    field1090.method3371(var89);
                                }
                                if (!var9.field2768 && var80) {
                                    var9.field2768 = true;
                                    if (var9.field2684 != null) {
                                        class70 var90 = new class70();
                                        var90.field822 = true;
                                        var90.field817 = var9;
                                        var90.field818 = class60.field722 - var10;
                                        var90.field820 = class60.field723 * -113761157 - var11;
                                        var90.field827 = var9.field2684;
                                        field1090.method3371(var90);
                                    }
                                }
                                if (var9.field2768 && var80 && var9.field2769 != null) {
                                    class70 var91 = new class70();
                                    var91.field822 = true;
                                    var91.field817 = var9;
                                    var91.field818 = class60.field722 - var10;
                                    var91.field820 = class60.field723 * -113761157 - var11;
                                    var91.field827 = var9.field2769;
                                    field1090.method3371(var91);
                                }
                                if (var9.field2768 && !var80) {
                                    var9.field2768 = false;
                                    if (var9.field2731 != null) {
                                        class70 var92 = new class70();
                                        var92.field822 = true;
                                        var92.field817 = var9;
                                        var92.field818 = class60.field722 - var10;
                                        var92.field820 = class60.field723 * -113761157 - var11;
                                        var92.field827 = var9.field2731;
                                        field975.method3371(var92);
                                    }
                                }
                                if (var9.field2742 != null) {
                                    class70 var93 = new class70();
                                    var93.field817 = var9;
                                    var93.field827 = var9.field2742;
                                    field1115.method3371(var93);
                                }
                                if (var9.field2709 != null && field1146 > var9.field2689) {
                                    if (var9.field2767 == null || field1146 - var9.field2689 > 32) {
                                        class70 var98 = new class70();
                                        var98.field817 = var9;
                                        var98.field827 = var9.field2709;
                                        field1090.method3371(var98);
                                    } else {
                                        label854: for (int var94 = var9.field2689; var94 < field1146; var94++) {
                                            int var95 = field956[var94 & 0x1F];
                                            for (int var96 = 0; var96 < var9.field2767.length; var96++) {
                                                if (var9.field2767[var96] == var95) {
                                                    class70 var97 = new class70();
                                                    var97.field817 = var9;
                                                    var97.field827 = var9.field2709;
                                                    field1090.method3371(var97);
                                                    break label854;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2689 = field1146;
                                }
                                if (var9.field2765 != null && field1080 > var9.field2772) {
                                    if (var9.field2739 == null || field1080 - var9.field2772 > 32) {
                                        class70 var103 = new class70();
                                        var103.field817 = var9;
                                        var103.field827 = var9.field2765;
                                        field1090.method3371(var103);
                                    } else {
                                        label830: for (int var99 = var9.field2772; var99 < field1080; var99++) {
                                            int var100 = field1052[var99 & 0x1F];
                                            for (int var101 = 0; var101 < var9.field2739.length; var101++) {
                                                if (var9.field2739[var101] == var100) {
                                                    class70 var102 = new class70();
                                                    var102.field817 = var9;
                                                    var102.field827 = var9.field2765;
                                                    field1090.method3371(var102);
                                                    break label830;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2772 = field1080;
                                }
                                if (var9.field2633 != null && field1082 > var9.field2694) {
                                    if (var9.field2741 == null || field1082 - var9.field2694 > 32) {
                                        class70 var108 = new class70();
                                        var108.field817 = var9;
                                        var108.field827 = var9.field2633;
                                        field1090.method3371(var108);
                                    } else {
                                        label806: for (int var104 = var9.field2694; var104 < field1082; var104++) {
                                            int var105 = field1081[var104 & 0x1F];
                                            for (int var106 = 0; var106 < var9.field2741.length; var106++) {
                                                if (var9.field2741[var106] == var105) {
                                                    class70 var107 = new class70();
                                                    var107.field817 = var9;
                                                    var107.field827 = var9.field2633;
                                                    field1090.method3371(var107);
                                                    break label806;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2694 = field1082;
                                }
                                if (field1083 > var9.field2770 && var9.field2651 != null) {
                                    class70 var109 = new class70();
                                    var109.field817 = var9;
                                    var109.field827 = var9.field2651;
                                    field1090.method3371(var109);
                                }
                                if (field1084 > var9.field2770 && var9.field2681 != null) {
                                    class70 var110 = new class70();
                                    var110.field817 = var9;
                                    var110.field827 = var9.field2681;
                                    field1090.method3371(var110);
                                }
                                if (field1127 > var9.field2770 && var9.field2748 != null) {
                                    class70 var111 = new class70();
                                    var111.field817 = var9;
                                    var111.field827 = var9.field2748;
                                    field1090.method3371(var111);
                                }
                                if (field1086 > var9.field2770 && var9.field2718 != null) {
                                    class70 var112 = new class70();
                                    var112.field817 = var9;
                                    var112.field827 = var9.field2718;
                                    field1090.method3371(var112);
                                }
                                if (field1087 > var9.field2770 && var9.field2754 != null) {
                                    class70 var113 = new class70();
                                    var113.field817 = var9;
                                    var113.field827 = var9.field2754;
                                    field1090.method3371(var113);
                                }
                                if (field1054 > var9.field2770 && var9.field2749 != null) {
                                    class70 var114 = new class70();
                                    var114.field817 = var9;
                                    var114.field827 = var9.field2749;
                                    field1090.method3371(var114);
                                }
                                var9.field2770 = field1076;
                                if (var9.field2746 != null) {
                                    for (int var115 = 0; var115 < field1112; var115++) {
                                        class70 var116 = new class70();
                                        var116.field817 = var9;
                                        var116.field823 = field1114[var115];
                                        var116.field819 = field1113[var115];
                                        var116.field827 = var9.field2746;
                                        field1090.method3371(var116);
                                    }
                                }
                            }
                        }
                        if (!var9.field2642 && field962 == null && Statics.field324 == null && !field1029) {
                            if ((var9.field2691 >= 0 || var9.field2707 != 0) && class60.field722 >= var12 && class60.field723 * -113761157 >= var13 && class60.field722 < var14 && class60.field723 * -113761157 < var15) {
                                if (var9.field2691 >= 0) {
                                    Statics.field869 = arg0[var9.field2691];
                                } else {
                                    Statics.field869 = var9;
                                }
                            }
                            if (var9.field2645 == 8 && class60.field722 >= var12 && class60.field723 * -113761157 >= var13 && class60.field722 < var14 && class60.field723 * -113761157 < var15) {
                                Statics.field3580 = var9;
                            }
                            if (var9.field2661 > var9.field2659) {
                                int var117 = var9.field2730 + var10;
                                int var118 = var9.field2659;
                                int var119 = var9.field2661;
                                int var120 = class60.field722;
                                int var121 = class60.field723 * -113761157;
                                if (field972) {
                                    field973 = 32;
                                } else {
                                    field973 = 0;
                                }
                                field972 = false;
                                if (class60.field733 == 1 || !Statics.field2179 && class60.field733 == 4) {
                                    if (var120 >= var117 && var120 < var117 + 16 && var121 >= var11 && var121 < var11 + 16) {
                                        var9.field2692 -= 4;
                                        method3808(var9);
                                    } else if (var120 >= var117 && var120 < var117 + 16 && var121 >= var11 + var118 - 16 && var121 < var11 + var118) {
                                        var9.field2692 += 4;
                                        method3808(var9);
                                    } else if (var120 >= var117 - field973 && var120 < field973 + var117 + 16 && var121 >= var11 + 16 && var121 < var11 + var118 - 16) {
                                        int var122 = (var118 - 32) * var118 / var119;
                                        if (var122 < 8) {
                                            var122 = 8;
                                        }
                                        int var123 = var121 - var11 - 16 - var122 / 2;
                                        int var124 = var118 - 32 - var122;
                                        var9.field2692 = (var119 - var118) * var123 / var124;
                                        method3808(var9);
                                        field972 = true;
                                    }
                                }
                                if (field1089 != 0) {
                                    int var125 = var9.field2730;
                                    if (var120 >= var117 - var125 && var121 >= var11 && var120 < var117 + 16 && var121 <= var11 + var118) {
                                        var9.field2692 += field1089 * 45;
                                        method3808(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field1018 == 0 || field1018 == 3) && (class60.field728 == 1 || !Statics.field2179 && class60.field728 == 4)) {
                        class211 var62 = var9.method3749(true);
                        if (var62 != null) {
                            int var63 = class60.field718 - var10;
                            int var64 = class60.field730 - var11;
                            if (var62.method3662(var63, var64)) {
                                int var65 = var63 - var62.field2592 / 2;
                                int var66 = var64 - var62.field2591 / 2;
                                int var67 = field991 + field1158 & 0x7FF;
                                int var68 = class137.field2021[var67];
                                int var69 = class137.field2022[var67];
                                int var70 = (field964 + 256) * var68 >> 8;
                                int var71 = (field964 + 256) * var69 >> 8;
                                int var72 = var65 * var71 + var66 * var70 >> 11;
                                int var73 = var66 * var71 - var65 * var70 >> 11;
                                int var74 = Statics.field308.field1247 + var72 >> 7;
                                int var75 = Statics.field308.field1200 - var73 >> 7;
                                field933.method3179(253);
                                field933.method3031(18);
                                field933.method2917(Statics.field2304 + var74);
                                field933.method2956(class51.field625[82] ? (class51.field625[81] ? 2 : 1) : 0);
                                field933.method2917(Statics.field2147 + var75);
                                field933.method3031(var65);
                                field933.method3031(var66);
                                field933.method2917(field1158);
                                field933.method3031(57);
                                field933.method3031(field991);
                                field933.method3031(field964);
                                field933.method3031(89);
                                field933.method2917(Statics.field308.field1247);
                                field933.method2917(Statics.field308.field1200);
                                field933.method3031(63);
                                field1123 = var74;
                                field1124 = var75;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ct.id([Lhr;II)V")
    public static final void method1752(class217[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class217 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2645 == 0) {
                    if (var3.field2747 != null) {
                        method1752(var3.field2747, arg1);
                    }
                    class69 var4 = (class69) field1020.method3331((long) var3.field2643);
                    if (var4 != null) {
                        int var5 = var4.field814;
                        if (class217.method68(var5)) {
                            method1752(Statics.field1401[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2750 != null) {
                    class70 var6 = new class70();
                    var6.field817 = var3;
                    var6.field827 = var3.field2750;
                    class84.method2306(var6);
                }
                if (arg1 == 1 && var3.field2736 != null) {
                    if (var3.field2644 >= 0) {
                        class217 var7 = class217.method4432(var3.field2643);
                        if (var7 == null || var7.field2747 == null || var3.field2644 >= var7.field2747.length || var7.field2747[var3.field2644] != var3) {
                            continue;
                        }
                    }
                    class70 var8 = new class70();
                    var8.field817 = var3;
                    var8.field827 = var3.field2736;
                    class84.method2306(var8);
                }
            }
        }
    }

    @ObfuscatedName("bx.ix(Lhr;III)V")
    public static final void method1029(class217 arg0, int arg1, int arg2) {
        if (field962 != null || field1029 || arg0 == null || method3142(arg0) == null) {
            return;
        }
        field962 = arg0;
        field1085 = method3142(arg0);
        field1066 = arg1;
        field1040 = arg2;
        Statics.field2121 = 0;
        field1009 = false;
        int var3 = method1567();
        if (var3 == -1) {
            return;
        }
        Statics.field236 = new class90();
        Statics.field236.field1382 = field1031[var3];
        Statics.field236.field1395 = field1042[var3];
        Statics.field236.field1383 = field1033[var3];
        Statics.field236.field1392 = field1034[var3];
        Statics.field236.field1385 = field895[var3];
    }

    @ObfuscatedName("client.ib(I)V")
    public final void method1336() {
        method3808(field962);
        Statics.field2121++;
        if (field1072 && field1069) {
            int var1 = class60.field722;
            int var2 = class60.field723 * -113761157;
            int var3 = var1 - field1066;
            int var4 = var2 - field1040;
            if (var3 < field1035) {
                var3 = field1035;
            }
            if (field962.field2730 + var3 > field1035 + field1085.field2730) {
                var3 = field1035 + field1085.field2730 - field962.field2730;
            }
            if (var4 < field990) {
                var4 = field990;
            }
            if (field962.field2659 + var4 > field990 + field1085.field2659) {
                var4 = field990 + field1085.field2659 - field962.field2659;
            }
            int var5 = var3 - field1073;
            int var6 = var4 - field1074;
            int var7 = field962.field2719;
            if (Statics.field2121 > field962.field2688 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1009 = true;
            }
            int var8 = field1085.field2630 + (var3 - field1035);
            int var9 = field1085.field2692 + (var4 - field990);
            if (field962.field2732 != null && field1009) {
                class70 var10 = new class70();
                var10.field817 = field962;
                var10.field818 = var8;
                var10.field820 = var9;
                var10.field827 = field962.field2732;
                class84.method2306(var10);
            }
            if (class60.field733 == 0) {
                if (field1009) {
                    if (field962.field2733 != null) {
                        class70 var11 = new class70();
                        var11.field817 = field962;
                        var11.field818 = var8;
                        var11.field820 = var9;
                        var11.field821 = field1068;
                        var11.field827 = field962.field2733;
                        class84.method2306(var11);
                    }
                    if (field1068 != null && method937(field962) != null) {
                        field933.method3179(128);
                        field933.method2919(field962.field2643);
                        field933.method2917(field962.field2644);
                        field933.method2919(field1068.field2643);
                        field933.method3113(field962.field2763);
                        field933.method2963(field1068.field2644);
                        field933.method3113(field1068.field2763);
                    }
                } else {
                    label124: {
                        label128: {
                            int var12 = method1567();
                            if (field961 > 2) {
                                if (field1028 == 1) {
                                    boolean var13;
                                    if (field961 <= 0) {
                                        var13 = false;
                                    } else if (field1006 && class51.field625[81] && field1038 != -1) {
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
                                    int var15 = field1033[var12];
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
                            if (field961 > 0) {
                                Statics.method102(field1073 + field1066, field1074 + field1040);
                            }
                            break label124;
                        }
                        this.method1132(field1073 + field1066, field1074 + field1040);
                    }
                }
                field962 = null;
            }
        } else if (Statics.field2121 > 1) {
            field962 = null;
        }
    }

    @ObfuscatedName("ha.ih(Lhr;I)V")
    public static void method3808(class217 arg0) {
        if (field1095 == arg0.field2775) {
            field1096[arg0.field2762] = true;
        }
    }

    @ObfuscatedName("e.im(B)V")
    public static void method125() {
        for (class69 var0 = (class69) field1020.method3322(); var0 != null; var0 = (class69) field1020.method3323()) {
            int var1 = var0.field814;
            if (class217.method68(var1)) {
                boolean var2 = true;
                class217[] var3 = Statics.field1401[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2642;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2467;
                    class217 var6 = class217.method4432(var5);
                    if (var6 != null) {
                        method3808(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fv.io(Lhr;I)Lhr;")
    public static class217 method3142(class217 arg0) {
        class217 var1 = method937(arg0);
        if (var1 == null) {
            var1 = arg0.field2729;
        }
        return var1;
    }

    @ObfuscatedName("a.ir([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method33(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("bp.iq(II)V")
    public static final void method698(int arg0) {
        if (!class217.method68(arg0)) {
            return;
        }
        class217[] var1 = Statics.field1401[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3 != null) {
                var3.field2774 = 0;
                var3.field2766 = 0;
            }
        }
    }

    @ObfuscatedName("ia.ij(II)V")
    public static final void method4150(int arg0) {
        if (class217.method68(arg0)) {
            method692(Statics.field1401[arg0], -1);
        }
    }

    @ObfuscatedName("bd.ik([Lhr;II)V")
    public static final void method692(class217[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class217 var3 = arg0[var2];
            if (var3 != null && var3.field2675 == arg1 && (!var3.field2642 || !method2698(var3))) {
                if (var3.field2645 == 0) {
                    if (!var3.field2642 && method2698(var3) && Statics.field869 != var3) {
                        continue;
                    }
                    method692(arg0, var3.field2643);
                    if (var3.field2747 != null) {
                        method692(var3.field2747, var3.field2643);
                    }
                    class69 var4 = (class69) field1020.method3331((long) var3.field2643);
                    if (var4 != null) {
                        method4150(var4.field814);
                    }
                }
                if (var3.field2645 == 6) {
                    if (var3.field2690 != -1 || var3.field2676 != -1) {
                        boolean var5 = method639(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2676;
                        } else {
                            var6 = var3.field2690;
                        }
                        if (var6 != -1) {
                            class261 var7 = class261.method2856(var6);
                            var3.field2766 += field967;
                            while (var3.field2766 > var7.field3596[var3.field2774]) {
                                var3.field2766 -= var7.field3596[var3.field2774];
                                var3.field2774++;
                                if (var3.field2774 >= var7.field3607.length) {
                                    var3.field2774 -= var7.field3603;
                                    if (var3.field2774 < 0 || var3.field2774 >= var7.field3607.length) {
                                        var3.field2774 = 0;
                                    }
                                }
                                method3808(var3);
                            }
                        }
                    }
                    if (var3.field2699 != 0 && !var3.field2642) {
                        int var8 = var3.field2699 >> 16;
                        int var9 = var3.field2699 << 16 >> 16;
                        int var10 = field967 * var8;
                        int var11 = field967 * var9;
                        var3.field2720 = var3.field2720 + var10 & 0x7FF;
                        var3.field2695 = var3.field2695 + var11 & 0x7FF;
                        method3808(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aw.it(IB)V")
    public static final void method605(int arg0) {
        method125();
        class83.method1469();
        int var1 = class242.method1000(arg0).field3273;
        if (var1 == 0) {
            return;
        }
        int var2 = class212.field2597[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class137.method2411(0.9D);
                ((class126) Statics.field2018).method2221(0.9D);
            }
            if (var2 == 2) {
                class137.method2411(0.8D);
                ((class126) Statics.field2018).method2221(0.8D);
            }
            if (var2 == 3) {
                class137.method2411(0.7D);
                ((class126) Statics.field2018).method2221(0.7D);
            }
            if (var2 == 4) {
                class137.method2411(0.6D);
                ((class126) Statics.field2018).method2221(0.6D);
            }
            class257.field3503.method3311();
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
            if (field1078 != var3) {
                if (field1078 == 0 && field1128 != -1) {
                    class204.method291(Statics.field575, field1128, 0, var3, false);
                    field1110 = false;
                } else if (var3 == 0) {
                    Statics.field502.method3508();
                    class204.field2499 = 1;
                    Statics.field3381 = null;
                    field1110 = false;
                } else {
                    class204.method24(var3);
                }
                field1078 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field1130 = 127;
            }
            if (var2 == 1) {
                field1130 = 96;
            }
            if (var2 == 2) {
                field1130 = 64;
            }
            if (var2 == 3) {
                field1130 = 32;
            }
            if (var2 == 4) {
                field1130 = 0;
            }
        }
        if (var1 == 5) {
            field1028 = var2;
        }
        if (var1 == 6) {
            field1053 = var2;
        }
        if (var1 == 9) {
            field1070 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field1131 = 127;
            }
            if (var2 == 1) {
                field1131 = 96;
            }
            if (var2 == 2) {
                field1131 = 64;
            }
            if (var2 == 3) {
                field1131 = 32;
            }
            if (var2 == 4) {
                field1131 = 0;
            }
        }
        if (var1 == 17) {
            field1059 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field916 = (class92) class169.method1267(class92.method693(), var2);
            if (field916 == null) {
                field916 = class92.field1411;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field1107 = -1;
            } else {
                field1107 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field917 = (class92) class169.method1267(class92.method693(), var2);
            if (field917 == null) {
                field917 = class92.field1411;
            }
        }
    }

    @ObfuscatedName("bb.ia(Lhr;I)V")
    public static final void method726(class217 arg0) {
        int var1 = arg0.field2647;
        if (var1 == 324) {
            if (field1164 == -1) {
                field1164 = arg0.field2678;
                field1056 = arg0.field2679;
            }
            if (field1163.field2608) {
                arg0.field2678 = field1164;
            } else {
                arg0.field2678 = field1056;
            }
        } else if (var1 == 325) {
            if (field1164 == -1) {
                field1164 = arg0.field2678;
                field1056 = arg0.field2679;
            }
            if (field1163.field2608) {
                arg0.field2678 = field1056;
            } else {
                arg0.field2678 = field1164;
            }
        } else if (var1 == 327) {
            arg0.field2720 = 150;
            arg0.field2695 = (int) (Math.sin((double) field900 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2686 = 5;
            arg0.field2687 = 0;
        } else if (var1 == 328) {
            arg0.field2720 = 150;
            arg0.field2695 = (int) (Math.sin((double) field900 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2686 = 5;
            arg0.field2687 = 1;
        }
    }

    @ObfuscatedName("bv.ie(B)V")
    public static final void method1006() {
        field933.method3179(123);
        for (class69 var0 = (class69) field1020.method3322(); var0 != null; var0 = (class69) field1020.method3323()) {
            if (var0.field811 == 0 || var0.field811 == 3) {
                method4603(var0, true);
            }
        }
        if (field1055 != null) {
            method3808(field1055);
            field1055 = null;
        }
    }

    @ObfuscatedName("as.is(IIII)Lbr;")
    public static final class69 method578(int arg0, int arg1, int arg2) {
        class69 var3 = new class69();
        var3.field814 = arg1;
        var3.field811 = arg2;
        field1020.method3333(var3, (long) arg0);
        method698(arg1);
        class217 var4 = class217.method4432(arg0);
        method3808(var4);
        if (field1055 != null) {
            method3808(field1055);
            field1055 = null;
        }
        method103();
        method169(Statics.field1401[arg0 >> 16], var4, false);
        class84.method112(arg1);
        if (field1051 != -1) {
            int var5 = field1051;
            if (class217.method68(var5)) {
                method1752(Statics.field1401[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("jd.if(Lbr;ZB)V")
    public static final void method4603(class69 arg0, boolean arg1) {
        int var2 = arg0.field814;
        int var3 = (int) arg0.field2467;
        arg0.method3364();
        if (arg1 && var2 != -1 && Statics.field2634[var2]) {
            Statics.field2683.method3848(var2);
            if (Statics.field1401[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field1401[var2].length; var5++) {
                    if (Statics.field1401[var2][var5] != null) {
                        if (Statics.field1401[var2][var5].field2645 == 2) {
                            var4 = false;
                        } else {
                            Statics.field1401[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field1401[var2] = null;
                }
                Statics.field2634[var2] = false;
            }
        }
        method2860(var2);
        class217 var6 = class217.method4432(var3);
        if (var6 != null) {
            method3808(var6);
        }
        method103();
        if (field1051 != -1) {
            int var7 = field1051;
            if (class217.method68(var7)) {
                method1752(Statics.field1401[var7], 1);
            }
        }
    }

    @ObfuscatedName("ch.iu(Lhr;B)Z")
    public static final boolean method1421(class217 arg0) {
        int var1 = arg0.field2647;
        if (var1 == 205) {
            field987 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1163.method3716(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1163.method3690(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1163.method3691(false);
        }
        if (var1 == 325) {
            field1163.method3691(true);
        }
        if (var1 == 326) {
            field933.method3179(3);
            field1163.method3700(field933);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aw.ii(IIIILjk;Lhj;B)V")
    public static final void method604(int arg0, int arg1, int arg2, int arg3, class286 arg4, class211 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method696(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field991 + field1158 & 0x7FF;
        int var8 = class137.field2021[var7];
        int var9 = class137.field2022[var7];
        int var10 = var8 * 256 / (field964 + 256);
        int var11 = var9 * 256 / (field964 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field2239.method4768(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("bp.iv(IIIILjk;Lhj;I)V")
    public static final void method696(int arg0, int arg1, int arg2, int arg3, class286 arg4, class211 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field991 + field1158 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class137.field2021[var6];
        int var9 = class137.field2022[var6];
        int var10 = var8 * 256 / (field964 + 256);
        int var11 = var9 * 256 / (field964 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method4776(arg5.field2592 / 2 + var12 - arg4.field3772 / 2, arg5.field2591 / 2 - var13 - arg4.field3778 / 2, arg0, arg1, arg5.field2592, arg5.field2591, arg5.field2588, arg5.field2590);
        } else {
            arg4.method4831(arg5.field2592 / 2 + arg0 + var12 - arg4.field3772 / 2, arg5.field2591 / 2 + arg1 - var13 - arg4.field3778 / 2);
        }
    }

    @ObfuscatedName("fp.ip(Ljava/lang/String;ZI)Z")
    public static boolean method2764(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class268.method203(arg0, Statics.field424);
        for (int var3 = 0; var3 < field1157; var3++) {
            if (var2.equalsIgnoreCase(class268.method203(field892[var3].field796, Statics.field424)) && (!arg1 || field892[var3].field794 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class268.method203(Statics.field308.field881, Statics.field424))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("w.je(Ljava/lang/String;B)Z")
    public static boolean method146(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class268.method203(arg0, Statics.field424);
        for (int var2 = 0; var2 < field1161; var2++) {
            class71 var3 = field1162[var2];
            if (var1.equalsIgnoreCase(class268.method203(var3.field832, Statics.field424))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class268.method203(var3.field828, Statics.field424))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("cd.jy(Ljava/lang/String;I)V")
    public static final void method1486(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field1157 < 200 || field1013 == 1) || field1157 >= 400) {
            class99.method2696(30, "", class226.field2936);
            return;
        }
        String var1 = class268.method203(arg0, Statics.field424);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1157; var2++) {
            class66 var3 = field892[var2];
            String var4 = class268.method203(var3.field796, Statics.field424);
            if (var4 != null && var4.equals(var1)) {
                class99.method2696(30, "", arg0 + class226.field3009);
                return;
            }
            if (var3.field793 != null) {
                String var5 = class268.method203(var3.field793, Statics.field424);
                if (var5 != null && var5.equals(var1)) {
                    class99.method2696(30, "", arg0 + class226.field3009);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field1161; var6++) {
            class71 var7 = field1162[var6];
            String var8 = class268.method203(var7.field832, Statics.field424);
            if (var8 != null && var8.equals(var1)) {
                class99.method2696(30, "", class226.field3014 + arg0 + class226.field2859);
                return;
            }
            if (var7.field828 != null) {
                String var9 = class268.method203(var7.field828, Statics.field424);
                if (var9 != null && var9.equals(var1)) {
                    class99.method2696(30, "", class226.field3014 + arg0 + class226.field2859);
                    return;
                }
            }
        }
        if (class268.method203(Statics.field308.field881, Statics.field424).equals(var1)) {
            class99.method2696(30, "", class226.field2907);
        } else {
            field933.method3179(105);
            field933.method3031(class174.method640(arg0));
            field933.method2922(arg0);
        }
    }

    @ObfuscatedName("fc.jb(Ljava/lang/String;I)V")
    public static final void method2830(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class268.method203(arg0, Statics.field424);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1157; var2++) {
            class66 var3 = field892[var2];
            String var4 = var3.field796;
            String var5 = class268.method203(var4, Statics.field424);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field1157--;
                for (int var7 = var2; var7 < field1157; var7++) {
                    field892[var7] = field892[var7 + 1];
                }
                field1084 = field1076;
                field933.method3179(61);
                field933.method3031(class174.method640(arg0));
                field933.method2922(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("jy.jj(Ljava/lang/String;S)V")
    public static final void method4431(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class268.method203(arg0, Statics.field424);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1161; var2++) {
            class71 var3 = field1162[var2];
            String var4 = var3.field832;
            String var5 = class268.method203(var4, Statics.field424);
            if (class278.method144(arg0, var1, var4, var5)) {
                field1161--;
                for (int var6 = var2; var6 < field1161; var6++) {
                    field1162[var6] = field1162[var6 + 1];
                }
                field1084 = field1076;
                field933.method3179(118);
                field933.method3031(class174.method640(arg0));
                field933.method2922(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("fl.jr(I)V")
    public static final void method3219() {
        field933.method3179(233);
        field933.method3031(0);
    }

    @ObfuscatedName("fm.ju(II)V")
    public static void method2860(int arg0) {
        for (class199 var1 = (class199) field918.method3322(); var1 != null; var1 = (class199) field918.method3323()) {
            if ((long) arg0 == (var1.field2467 >> 48 & 0xFFFFL)) {
                var1.method3364();
            }
        }
    }

    @ObfuscatedName("bl.ji(Lhr;I)Lhr;")
    public static class217 method937(class217 arg0) {
        int var1 = class218.method1595(Statics.method555(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class217.method4432(arg0.field2675);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ex.jz(Lhr;I)Z")
    public static boolean method2698(class217 arg0) {
        if (field1061) {
            if (Statics.method555(arg0) != 0) {
                return false;
            }
            if (arg0.field2645 == 0) {
                return false;
            }
        }
        return arg0.field2663;
    }

    @ObfuscatedName("ay.jm(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method172(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field927 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field927 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field927 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field927 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field927 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field2840 != null) {
            var3 = "/p=" + Statics.field2840;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field897 + "/a=" + Statics.field732 + var3 + "/";
    }

    @ObfuscatedName("hw.jn(Ljava/lang/String;I)V")
    public static void method3721(String arg0) {
        Statics.field2840 = arg0;
        try {
            String var1 = Statics.field357.getParameter(class275.field3718.field3712);
            String var2 = Statics.field357.getParameter(class275.field3719.field3712);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class183.method1936(class176.method3821() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class53.method682(Statics.field357, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("ca.jl([BIB)V")
    public static void method1569(byte[] arg0, int arg1) {
        if (field968 == null) {
            field968 = new byte[24];
        }
        class184.method3225(arg0, arg1, field968, 0, 24);
    }

    @ObfuscatedName("bu.js(Lfv;B)V")
    public static void method1038(class174 arg0) {
        if (field968 == null) {
            byte[] var1 = class156.method2402();
            arg0.method2986(var1, 0, var1.length);
        } else {
            arg0.method2986(field968, 0, field968.length);
        }
    }
}

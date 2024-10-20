package deob;

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
    public static class163[] field1086 = new class163[4];

    @ObfuscatedName("client.at")
    public static boolean field941 = true;

    @ObfuscatedName("client.bj")
    public static int field1040 = 1;

    @ObfuscatedName("client.bq")
    public static int field874 = 0;

    @ObfuscatedName("client.bk")
    public static int field875 = 0;

    @ObfuscatedName("client.bs")
    public static boolean field973 = false;

    @ObfuscatedName("client.bg")
    public static boolean field1111 = false;

    @ObfuscatedName("client.bn")
    public static int field878 = 0;

    @ObfuscatedName("client.bc")
    public static int field879 = 0;

    @ObfuscatedName("client.bf")
    public static boolean field880 = true;

    @ObfuscatedName("client.br")
    public static int field881 = 0;

    @ObfuscatedName("client.bx")
    public static long field1067 = -1L;

    @ObfuscatedName("client.bt")
    public static int field1024 = -1;

    @ObfuscatedName("client.bh")
    public static int field884 = -1;

    @ObfuscatedName("client.bd")
    public static int field885 = -1;

    @ObfuscatedName("client.bw")
    public static boolean field886 = true;

    @ObfuscatedName("client.bp")
    public static boolean field887 = false;

    @ObfuscatedName("client.bu")
    public static int field932 = 0;

    @ObfuscatedName("client.bi")
    public static int field907 = 0;

    @ObfuscatedName("client.by")
    public static int field926 = 0;

    @ObfuscatedName("client.cd")
    public static int field1031 = 0;

    @ObfuscatedName("client.cw")
    public static int field892 = 0;

    @ObfuscatedName("client.ca")
    public static int field893 = 0;

    @ObfuscatedName("client.co")
    public static int field894 = 0;

    @ObfuscatedName("client.cs")
    public static int field1006 = 0;

    @ObfuscatedName("client.cy")
    public static int field896 = 0;

    @ObfuscatedName("client.cj")
    public static class91 field898 = class91.field1337;

    @ObfuscatedName("client.cn")
    public static class91 field899 = class91.field1337;

    @ObfuscatedName("client.cm")
    public static int field900 = 0;

    @ObfuscatedName("client.cq")
    public static int field902 = 0;

    @ObfuscatedName("client.cp")
    public static int field903 = 0;

    @ObfuscatedName("client.ds")
    public static int field904 = 0;

    @ObfuscatedName("client.dj")
    public static int field905 = 0;

    @ObfuscatedName("client.dm")
    public static int field906 = 0;

    @ObfuscatedName("client.dq")
    public static int field897 = 0;

    @ObfuscatedName("client.dh")
    public static int field984 = 0;

    @ObfuscatedName("client.dv")
    public static class151 field1044 = class151.field2113;

    @ObfuscatedName("client.dl")
    public static byte[] field1084 = null;

    @ObfuscatedName("client.dr")
    public static class86[] field915 = new class86[32768];

    @ObfuscatedName("client.dk")
    public static int field913 = 0;

    @ObfuscatedName("client.dd")
    public static int[] field1121 = new int[32768];

    @ObfuscatedName("client.du")
    public static int field1046 = 0;

    @ObfuscatedName("client.ep")
    public static int[] field916 = new int[250];

    @ObfuscatedName("client.eq")
    public static final class101 field917 = new class101();

    @ObfuscatedName("client.em")
    public static int field1109 = 0;

    @ObfuscatedName("client.ea")
    public static boolean field919 = false;

    @ObfuscatedName("client.er")
    public static class284 field920 = new class284();

    @ObfuscatedName("client.ej")
    public static HashMap field921 = new HashMap();

    @ObfuscatedName("client.eo")
    public static int field922 = 0;

    @ObfuscatedName("client.et")
    public static int field923 = 1;

    @ObfuscatedName("client.ei")
    public static int field924 = 0;

    @ObfuscatedName("client.ey")
    public static int field925 = 1;

    @ObfuscatedName("client.ex")
    public static int field956 = 0;

    @ObfuscatedName("client.fb")
    public static boolean field1001 = false;

    @ObfuscatedName("client.fu")
    public static int[][][] field929 = new int[4][13][13];

    @ObfuscatedName("client.fd")
    public static final int[] field930 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fn")
    public static int field993 = 0;

    @ObfuscatedName("client.fw")
    public static int field1039 = 2301979;

    @ObfuscatedName("client.fr")
    public static int field983 = 5063219;

    @ObfuscatedName("client.fv")
    public static int field934 = 3353893;

    @ObfuscatedName("client.gm")
    public static int field935 = 7759444;

    @ObfuscatedName("client.gc")
    public static boolean field974 = false;

    @ObfuscatedName("client.gb")
    public static int field937 = 0;

    @ObfuscatedName("client.gj")
    public static int field998 = 128;

    @ObfuscatedName("client.gy")
    public static int field939 = 0;

    @ObfuscatedName("client.gq")
    public static int field940 = 0;

    @ObfuscatedName("client.gi")
    public static int field1032 = 0;

    @ObfuscatedName("client.gw")
    public static int field942 = 0;

    @ObfuscatedName("client.gr")
    public static int field943 = 0;

    @ObfuscatedName("client.gx")
    public static int field944 = 50;

    @ObfuscatedName("client.gf")
    public static int field912 = 0;

    @ObfuscatedName("client.gs")
    public static boolean field946 = false;

    @ObfuscatedName("client.gt")
    public static int field947 = 0;

    @ObfuscatedName("client.gk")
    public static int field948 = 0;

    @ObfuscatedName("client.ga")
    public static int field949 = 50;

    @ObfuscatedName("client.gz")
    public static int[] field950 = new int[field949];

    @ObfuscatedName("client.gp")
    public static int[] field951 = new int[field949];

    @ObfuscatedName("client.gg")
    public static int[] field952 = new int[field949];

    @ObfuscatedName("client.ge")
    public static int[] field953 = new int[field949];

    @ObfuscatedName("client.hu")
    public static int[] field911 = new int[field949];

    @ObfuscatedName("client.hc")
    public static int[] field955 = new int[field949];

    @ObfuscatedName("client.hr")
    public static int[] field914 = new int[field949];

    @ObfuscatedName("client.hf")
    public static String[] field877 = new String[field949];

    @ObfuscatedName("client.ha")
    public static int[][] field958 = new int[104][104];

    @ObfuscatedName("client.hj")
    public static int field959 = 0;

    @ObfuscatedName("client.hn")
    public static int field960 = -1;

    @ObfuscatedName("client.hw")
    public static int field961 = -1;

    @ObfuscatedName("client.ht")
    public static int field1065 = 0;

    @ObfuscatedName("client.hl")
    public static int field963 = 0;

    @ObfuscatedName("client.hd")
    public static int field964 = 0;

    @ObfuscatedName("client.hp")
    public static int field965 = 0;

    @ObfuscatedName("client.hs")
    public static int field966 = 0;

    @ObfuscatedName("client.hk")
    public static int field967 = 0;

    @ObfuscatedName("client.hb")
    public static int field1077 = 0;

    @ObfuscatedName("client.ho")
    public static int field969 = 0;

    @ObfuscatedName("client.hv")
    public static int field970 = 0;

    @ObfuscatedName("client.hg")
    public static int field1002 = 0;

    @ObfuscatedName("client.hz")
    public static boolean field972 = false;

    @ObfuscatedName("client.he")
    public static int field1013 = 0;

    @ObfuscatedName("client.hm")
    public static int field909 = 0;

    @ObfuscatedName("client.hq")
    public static class74[] field1054 = new class74[2048];

    @ObfuscatedName("client.ie")
    public static int field976 = -1;

    @ObfuscatedName("client.ig")
    public static int field977 = 0;

    @ObfuscatedName("client.iy")
    public static int field933 = 0;

    @ObfuscatedName("client.im")
    public static int[] field979 = new int[1000];

    @ObfuscatedName("client.it")
    public static String field975 = null;

    @ObfuscatedName("client.id")
    public static final int[] field980 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.in")
    public static String[] field981 = new String[8];

    @ObfuscatedName("client.iv")
    public static boolean[] field982 = new boolean[8];

    @ObfuscatedName("client.ir")
    public static int[] field945 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ih")
    public static int field1095 = -1;

    @ObfuscatedName("client.ia")
    public static class201[][][] field985 = new class201[4][104][104];

    @ObfuscatedName("client.ip")
    public static class201 field888 = new class201();

    @ObfuscatedName("client.if")
    public static class201 field1045 = new class201();

    @ObfuscatedName("client.io")
    public static class201 field1033 = new class201();

    @ObfuscatedName("client.iw")
    public static int[] field989 = new int[25];

    @ObfuscatedName("client.ik")
    public static int[] field1090 = new int[25];

    @ObfuscatedName("client.is")
    public static int[] field991 = new int[25];

    @ObfuscatedName("client.ib")
    public static int field1022 = 0;

    @ObfuscatedName("client.il")
    public static boolean field1072 = false;

    @ObfuscatedName("client.jb")
    public static int field994 = 0;

    @ObfuscatedName("client.jn")
    public static int[] field1048 = new int[500];

    @ObfuscatedName("client.jd")
    public static int[] field996 = new int[500];

    @ObfuscatedName("client.jc")
    public static int[] field997 = new int[500];

    @ObfuscatedName("client.jj")
    public static int[] field988 = new int[500];

    @ObfuscatedName("client.jk")
    public static String[] field999 = new String[500];

    @ObfuscatedName("client.ju")
    public static String[] field1000 = new String[500];

    @ObfuscatedName("client.jp")
    public static boolean[] field890 = new boolean[500];

    @ObfuscatedName("client.jq")
    public static boolean field1061 = false;

    @ObfuscatedName("client.jm")
    public static boolean field1003 = false;

    @ObfuscatedName("client.jg")
    public static int field1004 = -1;

    @ObfuscatedName("client.jr")
    public static int field1005 = -1;

    @ObfuscatedName("client.ja")
    public static int field883 = 0;

    @ObfuscatedName("client.jo")
    public static int field1007 = 50;

    @ObfuscatedName("client.ji")
    public static int field1008 = 0;

    @ObfuscatedName("client.jf")
    public static boolean field1098 = false;

    @ObfuscatedName("client.jx")
    public static int field918 = -1;

    @ObfuscatedName("client.kr")
    public static int field1012 = -1;

    @ObfuscatedName("client.km")
    public static String field1043 = null;

    @ObfuscatedName("client.kk")
    public static String field1014 = null;

    @ObfuscatedName("client.kc")
    public static int field1016 = -1;

    @ObfuscatedName("client.ki")
    public static class198 field1070 = new class198(8);

    @ObfuscatedName("client.kp")
    public static int field1017 = 0;

    @ObfuscatedName("client.kl")
    public static int field928 = 0;

    @ObfuscatedName("client.ky")
    public static class224 field1019 = null;

    @ObfuscatedName("client.kw")
    public static int field1020 = 0;

    @ObfuscatedName("client.kb")
    public static int field1021 = 0;

    @ObfuscatedName("client.ko")
    public static int field1026 = 0;

    @ObfuscatedName("client.ku")
    public static int field1083 = -1;

    @ObfuscatedName("client.kf")
    public static boolean field1080 = false;

    @ObfuscatedName("client.ka")
    public static boolean field968 = false;

    @ObfuscatedName("client.kt")
    public static boolean field908 = false;

    @ObfuscatedName("client.kv")
    public static class224 field1027 = null;

    @ObfuscatedName("client.kn")
    public static class224 field1028 = null;

    @ObfuscatedName("client.kz")
    public static class224 field1029 = null;

    @ObfuscatedName("client.kd")
    public static int field1030 = 0;

    @ObfuscatedName("client.kg")
    public static int field954 = 0;

    @ObfuscatedName("client.kj")
    public static class224 field891 = null;

    @ObfuscatedName("client.kx")
    public static boolean field1047 = false;

    @ObfuscatedName("client.ks")
    public static int field1034 = -1;

    @ObfuscatedName("client.kq")
    public static int field1035 = -1;

    @ObfuscatedName("client.kh")
    public static boolean field992 = false;

    @ObfuscatedName("client.le")
    public static int field1104 = -1;

    @ObfuscatedName("client.ls")
    public static int field1038 = -1;

    @ObfuscatedName("client.li")
    public static boolean field1015 = false;

    @ObfuscatedName("client.ll")
    public static int field882 = 1;

    @ObfuscatedName("client.lx")
    public static int[] field1041 = new int[32];

    @ObfuscatedName("client.lp")
    public static int field1042 = 0;

    @ObfuscatedName("client.lr")
    public static int[] field938 = new int[32];

    @ObfuscatedName("client.lk")
    public static int field962 = 0;

    @ObfuscatedName("client.la")
    public static int[] field1093 = new int[32];

    @ObfuscatedName("client.lm")
    public static int field895 = 0;

    @ObfuscatedName("client.lh")
    public static int field872 = 0;

    @ObfuscatedName("client.lg")
    public static int field978 = 0;

    @ObfuscatedName("client.lz")
    public static int field1049 = 0;

    @ObfuscatedName("client.lj")
    public static int field1050 = 0;

    @ObfuscatedName("client.lo")
    public static int field1051 = 0;

    @ObfuscatedName("client.lu")
    public static int field1052 = 0;

    @ObfuscatedName("client.ly")
    public static int field1053 = 0;

    @ObfuscatedName("client.lc")
    public static class201 field1011 = new class201();

    @ObfuscatedName("client.mc")
    public static class201 field1055 = new class201();

    @ObfuscatedName("client.mo")
    public static class201 field1106 = new class201();

    @ObfuscatedName("client.ml")
    public static class198 field1057 = new class198(512);

    @ObfuscatedName("client.mi")
    public static int field1036 = 0;

    @ObfuscatedName("client.me")
    public static int field1059 = -2;

    @ObfuscatedName("client.mu")
    public static boolean[] field1060 = new boolean[100];

    @ObfuscatedName("client.mm")
    public static boolean[] field1100 = new boolean[100];

    @ObfuscatedName("client.ma")
    public static boolean[] field1133 = new boolean[100];

    @ObfuscatedName("client.mp")
    public static int[] field1063 = new int[100];

    @ObfuscatedName("client.mh")
    public static int[] field1064 = new int[100];

    @ObfuscatedName("client.ms")
    public static int[] field990 = new int[100];

    @ObfuscatedName("client.mw")
    public static int[] field1066 = new int[100];

    @ObfuscatedName("client.mv")
    public static int field1058 = 0;

    @ObfuscatedName("client.mn")
    public static long field1068 = 0L;

    @ObfuscatedName("client.mx")
    public static boolean field1069 = true;

    @ObfuscatedName("client.mj")
    public static int[] field1009 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.mr")
    public static int field1071 = 0;

    @ObfuscatedName("client.mq")
    public static int field987 = 0;

    @ObfuscatedName("client.nv")
    public static String field1073 = "";

    @ObfuscatedName("client.na")
    public static long[] field1074 = new long[100];

    @ObfuscatedName("client.ni")
    public static int field1075 = 0;

    @ObfuscatedName("client.nf")
    public static int field1076 = 0;

    @ObfuscatedName("client.nl")
    public static int[] field1056 = new int[128];

    @ObfuscatedName("client.nb")
    public static int[] field1078 = new int[128];

    @ObfuscatedName("client.no")
    public static long field1079 = -1L;

    @ObfuscatedName("client.ne")
    public static String field1131 = null;

    @ObfuscatedName("client.nr")
    public static String field1081 = null;

    @ObfuscatedName("client.nt")
    public static int field1082 = -1;

    @ObfuscatedName("client.nw")
    public static int field1025 = 0;

    @ObfuscatedName("client.ns")
    public static int[] field995 = new int[1000];

    @ObfuscatedName("client.ny")
    public static int[] field1085 = new int[1000];

    @ObfuscatedName("client.nj")
    public static class295[] field1018 = new class295[1000];

    @ObfuscatedName("client.nc")
    public static int field1087 = 0;

    @ObfuscatedName("client.nd")
    public static int field1088 = 0;

    @ObfuscatedName("client.os")
    public static int field1089 = 0;

    @ObfuscatedName("client.oh")
    public static int field1114 = 255;

    @ObfuscatedName("client.oj")
    public static int field1091 = -1;

    @ObfuscatedName("client.om")
    public static boolean field1096 = false;

    @ObfuscatedName("client.oe")
    public static int field1010 = 127;

    @ObfuscatedName("client.og")
    public static int field1094 = 127;

    @ObfuscatedName("client.ok")
    public static int field986 = 0;

    @ObfuscatedName("client.ot")
    public static int[] field971 = new int[50];

    @ObfuscatedName("client.ox")
    public static int[] field1097 = new int[50];

    @ObfuscatedName("client.ol")
    public static int[] field931 = new int[50];

    @ObfuscatedName("client.oy")
    public static int[] field1099 = new int[50];

    @ObfuscatedName("client.ou")
    public static class105[] field1127 = new class105[50];

    @ObfuscatedName("client.ob")
    public static boolean field1101 = false;

    @ObfuscatedName("client.pk")
    public static boolean[] field1102 = new boolean[5];

    @ObfuscatedName("client.pu")
    public static int[] field1103 = new int[5];

    @ObfuscatedName("client.pf")
    public static int[] field936 = new int[5];

    @ObfuscatedName("client.pm")
    public static int[] field873 = new int[5];

    @ObfuscatedName("client.pl")
    public static int[] field1092 = new int[5];

    @ObfuscatedName("client.pv")
    public static short field1107 = 256;

    @ObfuscatedName("client.ps")
    public static short field1108 = 205;

    @ObfuscatedName("client.pa")
    public static short field1037 = 256;

    @ObfuscatedName("client.pw")
    public static short field1110 = 320;

    @ObfuscatedName("client.pe")
    public static short field927 = 1;

    @ObfuscatedName("client.pd")
    public static short field1112 = 32767;

    @ObfuscatedName("client.pi")
    public static short field1113 = 1;

    @ObfuscatedName("client.pb")
    public static short field1062 = 32767;

    @ObfuscatedName("client.pn")
    public static int field1115 = 0;

    @ObfuscatedName("client.pj")
    public static int field1116 = 0;

    @ObfuscatedName("client.pc")
    public static int field1117 = 0;

    @ObfuscatedName("client.pz")
    public static int field1118 = 0;

    @ObfuscatedName("client.pq")
    public static int field1119 = 0;

    @ObfuscatedName("client.py")
    public static int field1120 = 0;

    @ObfuscatedName("client.ph")
    public static int field1023 = 0;

    @ObfuscatedName("client.qp")
    public static class66[] field1122 = new class66[400];

    @ObfuscatedName("client.qw")
    public static class203 field1123 = new class203();

    @ObfuscatedName("client.qk")
    public static int field1124 = 0;

    @ObfuscatedName("client.qs")
    public static class70[] field1125 = new class70[400];

    @ObfuscatedName("client.qv")
    public static class221 field1126 = new class221();

    @ObfuscatedName("client.qj")
    public static int field1105 = -1;

    @ObfuscatedName("client.qo")
    public static int field1128 = -1;

    @ObfuscatedName("client.qq")
    public static class17[] field1129 = new class17[8];

    @ObfuscatedName("client.qf")
    public static class75 field1130 = new class75();

    @ObfuscatedName("client.qa")
    public static final class73 field876 = new class73();

    @ObfuscatedName("client.qr")
    public static int[] field1132 = new int[50];

    @ObfuscatedName("client.qn")
    public static int[] field889 = new int[50];

    @ObfuscatedName("bl.fi(B)Lko;")
    public static class298 method1001() {
        return Statics.field699;
    }

    @ObfuscatedName("client.ai(I)V")
    public final void method792() {
    }

    public final void init() {
        if (!this.method852()) {
            return;
        }
        class283[] var1 = new class283[] { class283.field3762, class283.field3757, class283.field3756, class283.field3759, class283.field3767, class283.field3760, class283.field3770, class283.field3765, class283.field3755, class283.field3768, class283.field3766, class283.field3761, class283.field3758, class283.field3769, class283.field3764 };
        class283[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class283 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3763);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3763)) {
                    case 1:
                        Statics.field3357 = var5;
                    case 2:
                    case 5:
                    case 11:
                    default:
                        break;
                    case 3:
                        Statics.field398 = Integer.parseInt(var5);
                        break;
                    case 4:
                        Statics.field1240 = var5;
                        break;
                    case 6:
                        if (var5.equalsIgnoreCase(class88.field1313)) {
                        }
                        break;
                    case 7:
                        field878 = Integer.parseInt(var5);
                        break;
                    case 8:
                        class240[] var6 = new class240[] { class240.field3275, class240.field3271, class240.field3272, class240.field3273, class240.field3276, class240.field3274 };
                        Statics.field484 = (class240) class176.method1702(var6, Integer.parseInt(var5));
                        if (Statics.field484 == class240.field3276) {
                            Statics.field3240 = class299.field3917;
                        } else {
                            Statics.field3240 = class299.field3916;
                        }
                        break;
                    case 9:
                        Statics.field739 = class239.method2235(Integer.parseInt(var5));
                        break;
                    case 10:
                        Statics.field817 = Integer.parseInt(var5);
                        break;
                    case 12:
                        field875 = Integer.parseInt(var5);
                        break;
                    case 13:
                        if (var5.equalsIgnoreCase(class88.field1313)) {
                            field973 = true;
                        } else {
                            field973 = false;
                        }
                        break;
                    case 14:
                        field874 = Integer.parseInt(var5);
                        break;
                    case 15:
                        field1040 = Integer.parseInt(var5);
                }
            }
        }
        method498();
        Statics.field315 = this.getCodeBase().getHost();
        String var7 = Statics.field739.field3264;
        byte var8 = 0;
        try {
            class157.method80("oldschool", var7, var8, 17);
        } catch (Exception var10) {
            class154.method1684((String) null, var10);
        }
        Statics.field3793 = this;
        this.method884(765, 503, 159);
    }

    @ObfuscatedName("ap.fg(I)V")
    public static final void method498() {
        class139.field2003 = false;
        field1111 = false;
    }

    @ObfuscatedName("client.al(I)V")
    public final void method783() {
        class182.method1616(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field592 = field875 == 0 ? 43594 : field1040 + 40000;
        Statics.field910 = field875 == 0 ? 443 : field1040 + 50000;
        Statics.field2519 = Statics.field592;
        Statics.field2699 = class222.field2709;
        Statics.field2698 = class222.field2711;
        Statics.field636 = class222.field2707;
        Statics.field2693 = class222.field2708;
        Statics.field2712 = new class149();
        this.method765();
        this.method766();
        Statics.field556 = this.method763();
        Statics.field300 = new class162(255, class157.field2158, class157.field2155, 500000);
        class124 var1 = null;
        class81 var2 = new class81();
        try {
            var1 = class157.method609("", Statics.field484.field3277, false);
            byte[] var3 = new byte[(int) var1.method2242()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method2243(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class81(new class181(var3));
        } catch (Exception var12) {
        }
        try {
            if (var1 != null) {
                var1.method2240();
            }
        } catch (Exception var11) {
        }
        Statics.field632 = var2;
        this.method764();
        class57.method23(this, Statics.field750);
        if (field875 != 0) {
            field887 = true;
        }
        int var9 = Statics.field632.field1236;
        field1068 = 0L;
        if (var9 >= 2) {
            field1069 = true;
        } else {
            field1069 = false;
        }
        if (method3334() == 1) {
            Statics.field3793.method761(765, 503);
        } else {
            Statics.field3793.method761(7680, 2160);
        }
        if (field879 < 25) {
            return;
        }
        class171 var10 = class171.method3795(class168.field2322, field917.field1471);
        var10.field2423.method3020(method3334());
        var10.field2423.method3021(Statics.field1308);
        var10.field2423.method3021(Statics.field674);
        field917.method1777(var10);
    }

    @ObfuscatedName("client.ae(I)V")
    public final void method901() {
        field881++;
        this.method1102();
        Statics.method995();
        class211.method2808();
        method181();
        class51.method2292();
        class60.method4066();
        if (Statics.field556 != null) {
            int var1 = Statics.field556.method651();
            field1053 = var1;
        }
        if (field879 == 0) {
            method1049();
            Statics.field1295.method2803();
            for (int var2 = 0; var2 < 32; var2++) {
                field668[var2] = 0L;
            }
            for (int var3 = 0; var3 < 32; var3++) {
                field669[var3] = 0L;
            }
            Statics.field682 = 0;
        } else if (field879 == 5) {
            class92.method164(this);
            method1049();
            Statics.field1295.method2803();
            for (int var4 = 0; var4 < 32; var4++) {
                field668[var4] = 0L;
            }
            for (int var5 = 0; var5 < 32; var5++) {
                field669[var5] = 0L;
            }
            Statics.field682 = 0;
        } else if (field879 == 10 || field879 == 11) {
            class92.method164(this);
        } else if (field879 == 20) {
            class92.method164(this);
            this.method1105();
        } else if (field879 == 25) {
            method1635();
        }
        if (field879 == 30) {
            this.method1106();
        } else if (field879 == 40 || field879 == 45) {
            this.method1105();
        }
    }

    @ObfuscatedName("client.aj(ZI)V")
    public final void method785(boolean arg0) {
        boolean var2;
        label152: {
            try {
                if (class211.field2599 == 2) {
                    if (Statics.field2514 == null) {
                        Statics.field2514 = class217.method3772(Statics.field23, Statics.field238, Statics.field2600);
                        if (Statics.field2514 == null) {
                            var2 = false;
                            break label152;
                        }
                    }
                    if (Statics.field1317 == null) {
                        Statics.field1317 = new class112(Statics.field2598, Statics.field2595);
                    }
                    if (Statics.field2596.method3589(Statics.field2514, Statics.field2597, Statics.field1317, 22050)) {
                        Statics.field2596.method3593();
                        Statics.field2596.method3587(Statics.field1589);
                        Statics.field2596.method3614(Statics.field2514, Statics.field323);
                        class211.field2599 = 0;
                        Statics.field2514 = null;
                        Statics.field1317 = null;
                        Statics.field23 = null;
                        var2 = true;
                        break label152;
                    }
                }
            } catch (Exception var12) {
                var12.printStackTrace();
                Statics.field2596.method3592();
                class211.field2599 = 0;
                Statics.field2514 = null;
                Statics.field1317 = null;
                Statics.field23 = null;
            }
            var2 = false;
        }
        if (var2 && field1096 && Statics.field25 != null) {
            Statics.field25.method1969();
        }
        if ((field879 == 10 || field879 == 20 || field879 == 30) && field1068 != 0L && class183.method2932() > field1068) {
            int var5 = method3334();
            field1068 = 0L;
            if (var5 >= 2) {
                field1069 = true;
            } else {
                field1069 = false;
            }
            if (method3334() == 1) {
                Statics.field3793.method761(765, 503);
            } else {
                Statics.field3793.method761(7680, 2160);
            }
            if (field879 >= 25) {
                class171 var6 = class171.method3795(class168.field2322, field917.field1471);
                var6.field2423.method3020(method3334());
                var6.field2423.method3021(Statics.field1308);
                var6.field2423.method3021(Statics.field674);
                field917.method1777(var6);
            }
        }
        if (arg0) {
            for (int var7 = 0; var7 < 100; var7++) {
                field1060[var7] = true;
            }
        }
        if (field879 == 0) {
            this.method787(class92.field1356, class92.field1359, arg0);
        } else if (field879 == 5) {
            class92.method2384(Statics.field1227, Statics.field263, Statics.field621, arg0);
        } else if (field879 == 10 || field879 == 11) {
            class92.method2384(Statics.field1227, Statics.field263, Statics.field621, arg0);
        } else if (field879 == 20) {
            class92.method2384(Statics.field1227, Statics.field263, Statics.field621, arg0);
        } else if (field879 == 25) {
            if (field956 == 1) {
                if (field922 > field923) {
                    field923 = field922;
                }
                int var8 = (field923 * 50 - field922 * 50) / field923;
                method2792(class233.field3120 + class88.field1320 + class88.field1314 + var8 + "%" + class88.field1315, false);
            } else if (field956 == 2) {
                if (field924 > field925) {
                    field925 = field924;
                }
                int var9 = (field925 * 50 - field924 * 50) / field925 + 50;
                method2792(class233.field3120 + class88.field1320 + class88.field1314 + var9 + "%" + class88.field1315, false);
            } else {
                method2792(class233.field3120, false);
            }
        } else if (field879 == 30) {
            this.method1108();
        } else if (field879 == 40) {
            method2792(class233.field2942 + class88.field1320 + class233.field2943, false);
        } else if (field879 == 45) {
            method2792(class233.field3089, false);
        }
        if (field879 == 30 && field1058 == 0 && !arg0 && !field1069) {
            for (int var10 = 0; var10 < field1036; var10++) {
                if (field1100[var10]) {
                    Statics.field1310.method746(field1063[var10], field1064[var10], field990[var10], field1066[var10]);
                    field1100[var10] = false;
                }
            }
        } else if (field879 > 0) {
            Statics.field1310.method756(0, 0);
            for (int var11 = 0; var11 < field1036; var11++) {
                field1100[var11] = false;
            }
        }
    }

    @ObfuscatedName("client.as(S)V")
    public final void method786() {
        if (Statics.field383.method1719()) {
            Statics.field383.method1711();
        }
        if (Statics.field3697 != null) {
            Statics.field3697.field824 = false;
        }
        Statics.field3697 = null;
        field917.method1782();
        class51.method1046();
        if (class60.field697 != null) {
            class60 var1 = class60.field697;
            synchronized (class60.field697) {
                class60.field697 = null;
            }
        }
        Statics.field556 = null;
        if (Statics.field25 != null) {
            Statics.field25.method1946();
        }
        if (Statics.field1685 != null) {
            Statics.field1685.method1946();
        }
        if (Statics.field3328 != null) {
            Statics.field3328.method2867();
        }
        class244.method2772();
        if (Statics.field2712 != null) {
            Statics.field2712.method2785();
            Statics.field2712 = null;
        }
        class157.method2767();
    }

    @ObfuscatedName("n.fa(IB)V")
    public static void method62(int arg0) {
        if (field879 == arg0) {
            return;
        }
        if (field879 == 0) {
            Statics.field3793.method788();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field905 = 0;
            field906 = 0;
            field897 = 0;
            field920.method4742(arg0);
            if (arg0 != 20) {
                method25(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1686 != null) {
            Statics.field1686.method2867();
            Statics.field1686 = null;
        }
        if (field879 == 25) {
            field956 = 0;
            field922 = 0;
            field923 = 1;
            field924 = 0;
            field925 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class92.method205(Statics.field501, Statics.field1323, true, 0);
        } else if (arg0 == 20) {
            class92.method205(Statics.field501, Statics.field1323, true, field879 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class92.method205(Statics.field501, Statics.field1323, false, 4);
        } else if (Statics.field1343) {
            Statics.field1342 = null;
            Statics.field1341 = null;
            Statics.field3721 = null;
            Statics.field2512 = null;
            Statics.field1348 = null;
            Statics.field1345 = null;
            Statics.field1357 = null;
            Statics.field3695 = null;
            Statics.field2099 = null;
            Statics.field571 = null;
            Statics.field424 = null;
            Statics.field249 = null;
            Statics.field488 = null;
            Statics.field14 = null;
            Statics.field812 = null;
            Statics.field3852 = null;
            Statics.field1351 = null;
            Statics.field460 = null;
            Statics.field3221 = null;
            Statics.field3262 = null;
            Statics.field1275 = null;
            Statics.field1276 = null;
            class211.method7(2);
            class246.method2850(true);
            Statics.field1343 = false;
        }
        field879 = arg0;
    }

    @ObfuscatedName("client.ff(B)V")
    public void method1102() {
        if (field879 == 1000) {
            return;
        }
        long var1 = class183.method2932();
        int var3 = (int) (var1 - Statics.field3335);
        Statics.field3335 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class246.field3337 += var3;
        boolean var4;
        if (class246.field3334 == 0 && class246.field3329 == 0 && class246.field3332 == 0 && class246.field3342 == 0) {
            var4 = true;
        } else if (Statics.field3328 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class246.field3337 > 30000) {
                        throw new IOException();
                    }
                    while (class246.field3329 < 20 && class246.field3342 > 0) {
                        class242 var5 = (class242) class246.field3324.method3437();
                        class181 var6 = new class181(4);
                        var6.method3020(1);
                        var6.method3137((int) var5.field2564);
                        Statics.field3328.method2871(var6.field2496, 0, 4);
                        class246.field3339.method3431(var5, var5.field2564);
                        class246.field3342--;
                        class246.field3329++;
                    }
                    while (class246.field3334 < 20 && class246.field3332 > 0) {
                        class242 var7 = (class242) class246.field3330.method3376();
                        class181 var8 = new class181(4);
                        var8.method3020(0);
                        var8.method3137((int) var7.field2564);
                        Statics.field3328.method2871(var8.field2496, 0, 4);
                        var7.method3514();
                        class246.field3333.method3431(var7, var7.field2564);
                        class246.field3332--;
                        class246.field3334++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3328.method2862();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class246.field3337 = 0;
                        byte var11 = 0;
                        if (Statics.field3464 == null) {
                            var11 = 8;
                        } else if (class246.field3327 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class246.field3323.field2498;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3328.method2864(class246.field3323.field2496, class246.field3323.field2498, var12);
                            if (class246.field3341 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class246.field3323.field2496[class246.field3323.field2498 + var13] ^= class246.field3341;
                                }
                            }
                            class246.field3323.field2498 += var12;
                            if (class246.field3323.field2498 < var11) {
                                break;
                            }
                            if (Statics.field3464 == null) {
                                class246.field3323.field2498 = 0;
                                int var14 = class246.field3323.method3204();
                                int var15 = class246.field3323.method3179();
                                int var16 = class246.field3323.method3204();
                                int var17 = class246.field3323.method3041();
                                long var18 = (long) ((var14 << 16) + var15);
                                class242 var20 = (class242) class246.field3339.method3438(var18);
                                Statics.field3312 = true;
                                if (var20 == null) {
                                    var20 = (class242) class246.field3333.method3438(var18);
                                    Statics.field3312 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field3464 = var20;
                                Statics.field3336 = new class181(var17 + var21 + Statics.field3464.field3287);
                                Statics.field3336.method3020(var16);
                                Statics.field3336.method3149(var17);
                                class246.field3327 = 8;
                                class246.field3323.field2498 = 0;
                            } else if (class246.field3327 == 0) {
                                if (class246.field3323.field2496[0] == -1) {
                                    class246.field3327 = 1;
                                    class246.field3323.field2498 = 0;
                                } else {
                                    Statics.field3464 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field3336.field2496.length - Statics.field3464.field3287;
                            int var23 = 512 - class246.field3327;
                            if (var23 > var22 - Statics.field3336.field2498) {
                                var23 = var22 - Statics.field3336.field2498;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3328.method2864(Statics.field3336.field2496, Statics.field3336.field2498, var23);
                            if (class246.field3341 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field3336.field2496[Statics.field3336.field2498 + var24] ^= class246.field3341;
                                }
                            }
                            Statics.field3336.field2498 += var23;
                            class246.field3327 += var23;
                            if (Statics.field3336.field2498 == var22) {
                                if (Statics.field3464.field2564 == 16711935L) {
                                    Statics.field3340 = Statics.field3336;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class245 var26 = class246.field3325[var25];
                                        if (var26 != null) {
                                            Statics.field3340.field2498 = var25 * 8 + 5;
                                            int var27 = Statics.field3340.method3041();
                                            int var28 = Statics.field3340.method3041();
                                            var26.method4041(var27, var28);
                                        }
                                    }
                                } else {
                                    class246.field3338.reset();
                                    class246.field3338.update(Statics.field3336.field2496, 0, var22);
                                    int var29 = (int) class246.field3338.getValue();
                                    if (Statics.field3464.field3288 != var29) {
                                        try {
                                            Statics.field3328.method2867();
                                        } catch (Exception var35) {
                                        }
                                        class246.field3326++;
                                        Statics.field3328 = null;
                                        class246.field3341 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class246.field3326 = 0;
                                    class246.field3343 = 0;
                                    Statics.field3464.field3286.method4047((int) (Statics.field3464.field2564 & 0xFFFFL), Statics.field3336.field2496, (Statics.field3464.field2564 & 0xFF0000L) == 16711680L, Statics.field3312);
                                }
                                Statics.field3464.method3475();
                                if (Statics.field3312) {
                                    class246.field3329--;
                                } else {
                                    class246.field3334--;
                                }
                                class246.field3327 = 0;
                                Statics.field3464 = null;
                                Statics.field3336 = null;
                            } else {
                                if (class246.field3327 != 512) {
                                    break;
                                }
                                class246.field3327 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3328.method2867();
                } catch (Exception var34) {
                }
                class246.field3343++;
                Statics.field3328 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1228();
        }
    }

    @ObfuscatedName("client.fb(I)V")
    public void method1228() {
        if (class246.field3326 >= 4) {
            this.method789("js5crc");
            field879 = 1000;
            return;
        }
        if (class246.field3343 >= 4) {
            if (field879 <= 5) {
                this.method789("js5io");
                field879 = 1000;
                return;
            }
            field903 = 3000;
            class246.field3343 = 3;
        }
        if (--field903 + 1 > 0) {
            return;
        }
        try {
            if (field902 == 0) {
                Statics.field1309 = Statics.field3738.method2820(Statics.field315, Statics.field2519);
                field902++;
            }
            if (field902 == 1) {
                if (Statics.field1309.field2133 == 2) {
                    this.method1104(-1);
                    return;
                }
                if (Statics.field1309.field2133 == 1) {
                    field902++;
                }
            }
            if (field902 == 2) {
                Statics.field901 = new class161((Socket) Statics.field1309.field2141, Statics.field3738, 5000);
                class181 var1 = new class181(5);
                var1.method3020(15);
                var1.method3149(159);
                Statics.field901.method2871(var1.field2496, 0, 5);
                field902++;
                Statics.field1438 = class183.method2932();
            }
            if (field902 == 3) {
                if (field879 <= 5 || Statics.field901.method2862() > 0) {
                    int var2 = Statics.field901.method2872();
                    if (var2 != 0) {
                        this.method1104(var2);
                        return;
                    }
                    field902++;
                } else if (class183.method2932() - Statics.field1438 > 30000L) {
                    this.method1104(-2);
                    return;
                }
            }
            if (field902 == 4) {
                class161 var3 = Statics.field901;
                boolean var4 = field879 > 20;
                if (Statics.field3328 != null) {
                    try {
                        Statics.field3328.method2867();
                    } catch (Exception var14) {
                    }
                    Statics.field3328 = null;
                }
                Statics.field3328 = var3;
                class246.method2850(var4);
                class246.field3323.field2498 = 0;
                Statics.field3464 = null;
                Statics.field3336 = null;
                class246.field3327 = 0;
                while (true) {
                    class242 var6 = (class242) class246.field3339.method3437();
                    if (var6 == null) {
                        while (true) {
                            class242 var7 = (class242) class246.field3333.method3437();
                            if (var7 == null) {
                                if (class246.field3341 != 0) {
                                    try {
                                        class181 var8 = new class181(4);
                                        var8.method3020(4);
                                        var8.method3020(class246.field3341);
                                        var8.method3021(0);
                                        Statics.field3328.method2871(var8.field2496, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3328.method2867();
                                        } catch (Exception var12) {
                                        }
                                        class246.field3343++;
                                        Statics.field3328 = null;
                                    }
                                }
                                class246.field3337 = 0;
                                Statics.field3335 = class183.method2932();
                                Statics.field1309 = null;
                                Statics.field901 = null;
                                field902 = 0;
                                field904 = 0;
                                return;
                            }
                            class246.field3330.method3378(var7);
                            class246.field3331.method3431(var7, var7.field2564);
                            class246.field3332++;
                            class246.field3334--;
                        }
                    }
                    class246.field3324.method3431(var6, var6.field2564);
                    class246.field3342++;
                    class246.field3329--;
                }
            }
        } catch (IOException var15) {
            this.method1104(-3);
        }
    }

    @ObfuscatedName("client.fu(II)V")
    public void method1104(int arg0) {
        Statics.field1309 = null;
        Statics.field901 = null;
        field902 = 0;
        if (Statics.field592 == Statics.field2519) {
            Statics.field2519 = Statics.field910;
        } else {
            Statics.field2519 = Statics.field592;
        }
        field904++;
        if (field904 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field879 <= 5) {
                this.method789("js5connect_full");
                field879 = 1000;
            } else {
                field903 = 3000;
            }
        } else if (field904 >= 2 && arg0 == 6) {
            this.method789("js5connect_outofdate");
            field879 = 1000;
        } else if (field904 >= 4) {
            if (field879 <= 5) {
                this.method789("js5connect");
                field879 = 1000;
            } else {
                field903 = 3000;
            }
        }
    }

    @ObfuscatedName("bd.fd(B)V")
    public static void method1049() {
        if (field900 == 0) {
            Statics.field282 = new class139(4, 104, 104, class62.field729);
            for (int var0 = 0; var0 < 4; var0++) {
                field1086[var0] = new class163(104, 104);
            }
            Statics.field13 = new class295(512, 512);
            class92.field1359 = class233.field2937;
            class92.field1356 = 5;
            field900 = 20;
        } else if (field900 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class136.field1943[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class139.method2615(var1, 500, 800, 512, 334);
            class92.field1359 = class233.field3210;
            class92.field1356 = 10;
            field900 = 30;
        } else if (field900 == 30) {
            Statics.field2209 = Statics.method476(0, false, true, true);
            Statics.field253 = Statics.method476(1, false, true, true);
            Statics.field863 = Statics.method476(2, true, false, true);
            Statics.field562 = Statics.method476(3, false, true, true);
            Statics.field577 = Statics.method476(4, false, true, true);
            Statics.field2702 = Statics.method476(5, true, true, true);
            Statics.field631 = Statics.method476(6, true, true, false);
            Statics.field702 = Statics.method476(7, false, true, true);
            Statics.field1323 = Statics.method476(8, false, true, true);
            Statics.field774 = Statics.method476(9, false, true, true);
            Statics.field501 = Statics.method476(10, false, true, true);
            Statics.field477 = Statics.method476(11, false, true, true);
            Statics.field11 = Statics.method476(12, false, true, true);
            Statics.field551 = Statics.method476(13, true, false, true);
            Statics.field313 = Statics.method476(14, false, true, false);
            Statics.field862 = Statics.method476(15, false, true, true);
            Statics.field570 = Statics.method476(16, false, true, false);
            class92.field1359 = class233.field3030;
            class92.field1356 = 20;
            field900 = 40;
        } else if (field900 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2209.method4045() * 4 / 100;
            int var8 = var7 + Statics.field253.method4045() * 4 / 100;
            int var9 = var8 + Statics.field863.method4045() * 2 / 100;
            int var10 = var9 + Statics.field562.method4045() * 2 / 100;
            int var11 = var10 + Statics.field577.method4045() * 6 / 100;
            int var12 = var11 + Statics.field2702.method4045() * 4 / 100;
            int var13 = var12 + Statics.field631.method4045() * 2 / 100;
            int var14 = var13 + Statics.field702.method4045() * 58 / 100;
            int var15 = var14 + Statics.field1323.method4045() * 2 / 100;
            int var16 = var15 + Statics.field774.method4045() * 2 / 100;
            int var17 = var16 + Statics.field501.method4045() * 2 / 100;
            int var18 = var17 + Statics.field477.method4045() * 2 / 100;
            int var19 = var18 + Statics.field11.method4045() * 2 / 100;
            int var20 = var19 + Statics.field551.method4045() * 2 / 100;
            int var21 = var20 + Statics.field313.method4045() * 2 / 100;
            int var22 = var21 + Statics.field862.method4045() * 2 / 100;
            int var23 = var22 + Statics.field570.method4045() * 2 / 100;
            if (var23 == 100) {
                class92.field1359 = class233.field2948;
                class92.field1356 = 30;
                field900 = 45;
            } else {
                if (var23 != 0) {
                    class92.field1359 = class233.field3067 + var23 + "%";
                }
                class92.field1356 = 30;
            }
        } else if (field900 == 45) {
            class109.method1018(22050, !field1111, 2);
            class212 var24 = new class212();
            var24.method3594(9, 128);
            Statics.field25 = class109.method1761(Statics.field3738, 0, 22050);
            Statics.field25.method1943(var24);
            class211.method958(Statics.field862, Statics.field313, Statics.field577, var24);
            Statics.field1685 = class109.method1761(Statics.field3738, 1, 2048);
            Statics.field822 = new class102();
            Statics.field1685.method1943(Statics.field822);
            Statics.field1584 = new class116(22050, Statics.field1546);
            class92.field1359 = class233.field2949;
            class92.field1356 = 35;
            field900 = 50;
            Statics.field717 = new class270(Statics.field1323, Statics.field551);
        } else if (field900 == 50) {
            int var25 = class269.method4565().length;
            field921 = Statics.field717.method4567(class269.method4565());
            if (field921.size() < var25) {
                class92.field1359 = class233.field2950 + field921.size() * 100 / var25 + "%";
                class92.field1356 = 40;
            } else {
                Statics.field263 = (class271) field921.get(class269.field3688);
                Statics.field621 = (class271) field921.get(class269.field3691);
                Statics.field1227 = (class271) field921.get(class269.field3684);
                Statics.field3448 = new class301(true);
                class92.field1359 = class233.field2951;
                class92.field1356 = 40;
                field900 = 60;
            }
        } else if (field900 == 60) {
            int var26 = class92.method229(Statics.field501, Statics.field1323);
            int var27 = class92.method956();
            if (var26 < var27) {
                class92.field1359 = class233.field3154 + var26 * 100 / var27 + "%";
                class92.field1356 = 50;
            } else {
                class92.field1359 = class233.field3039;
                class92.field1356 = 50;
                method62(5);
                field900 = 70;
            }
        } else if (field900 == 70) {
            if (Statics.field863.method3939()) {
                class267.method2929(Statics.field863);
                class245 var28 = Statics.field863;
                Statics.field638 = var28;
                class255.method4134(Statics.field863, Statics.field702);
                class245 var29 = Statics.field863;
                class245 var30 = Statics.field702;
                boolean var31 = field1111;
                Statics.field1583 = var29;
                Statics.field639 = var30;
                class263.field3524 = var31;
                class266.method170(Statics.field863, Statics.field702);
                class260.method70(Statics.field863);
                class245 var32 = Statics.field863;
                class245 var33 = Statics.field702;
                boolean var34 = field973;
                class271 var35 = Statics.field263;
                Statics.field3555 = var32;
                Statics.field2859 = var33;
                Statics.field827 = var34;
                Statics.field3560 = Statics.field3555.method3946(10);
                Statics.field1377 = var35;
                class268.method2771(Statics.field863, Statics.field2209, Statics.field253);
                class245 var36 = Statics.field863;
                class245 var37 = Statics.field702;
                Statics.field3405 = var36;
                Statics.field3395 = var37;
                class258.method3915(Statics.field863);
                class249.method737(Statics.field863);
                class245 var38 = Statics.field562;
                class245 var39 = Statics.field702;
                class245 var40 = Statics.field1323;
                class245 var41 = Statics.field551;
                Statics.field755 = var38;
                Statics.field349 = var39;
                Statics.field2429 = var40;
                Statics.field2718 = var41;
                Statics.field257 = new class224[Statics.field755.method3947()][];
                Statics.field646 = new boolean[Statics.field755.method3947()];
                Statics.method4472(Statics.field863);
                class245 var42 = Statics.field863;
                Statics.field3476 = var42;
                class245 var43 = Statics.field863;
                Statics.field3388 = var43;
                class252.method2937(Statics.field863);
                class259.method3813(Statics.field863);
                Statics.field383 = new class96();
                class262.method3285(Statics.field863, Statics.field1323, Statics.field551);
                class256.method2936(Statics.field863, Statics.field1323);
                class245 var44 = Statics.field863;
                class245 var45 = Statics.field1323;
                Statics.field3382 = var45;
                if (var44.method3939()) {
                    Statics.field2432 = var44.method3946(35);
                    Statics.field3365 = new class250[Statics.field2432];
                    for (int var46 = 0; var46 < Statics.field2432; var46++) {
                        byte[] var47 = var44.method3935(35, var46);
                        if (var47 != null) {
                            Statics.field3365[var46] = new class250(var46);
                            Statics.field3365[var46].method4100(new class181(var47));
                            Statics.field3365[var46].method4102();
                        }
                    }
                }
                class92.field1359 = class233.field3182;
                class92.field1356 = 60;
                field900 = 80;
            } else {
                class92.field1359 = class233.field3153 + Statics.field863.method4044() + "%";
                class92.field1356 = 60;
            }
        } else if (field900 == 80) {
            int var48 = 0;
            if (Statics.field375 == null) {
                Statics.field375 = class296.method73(Statics.field1323, "compass", "");
            } else {
                var48++;
            }
            if (Statics.field22 == null) {
                Statics.field22 = class296.method73(Statics.field1323, "mapedge", "");
            } else {
                var48++;
            }
            if (Statics.field2910 == null) {
                Statics.field2910 = class296.method3585(Statics.field1323, "mapscene", "");
            } else {
                var48++;
            }
            if (Statics.field547 == null) {
                Statics.field547 = class296.method636(Statics.field1323, "headicons_pk", "");
            } else {
                var48++;
            }
            if (Statics.field805 == null) {
                Statics.field805 = class296.method636(Statics.field1323, "headicons_prayer", "");
            } else {
                var48++;
            }
            if (Statics.field449 == null) {
                Statics.field449 = class296.method636(Statics.field1323, "headicons_hint", "");
            } else {
                var48++;
            }
            if (Statics.field676 == null) {
                Statics.field676 = class296.method636(Statics.field1323, "mapmarker", "");
            } else {
                var48++;
            }
            if (Statics.field2515 == null) {
                Statics.field2515 = class296.method636(Statics.field1323, "cross", "");
            } else {
                var48++;
            }
            if (Statics.field302 == null) {
                Statics.field302 = class296.method636(Statics.field1323, "mapdots", "");
            } else {
                var48++;
            }
            if (Statics.field1334 == null) {
                Statics.field1334 = class296.method3585(Statics.field1323, "scrollbar", "");
            } else {
                var48++;
            }
            if (Statics.field2408 == null) {
                Statics.field2408 = class296.method3585(Statics.field1323, "mod_icons", "");
            } else {
                var48++;
            }
            if (var48 < 11) {
                class92.field1359 = class233.field3004 + var48 * 100 / 12 + "%";
                class92.field1356 = 70;
            } else {
                Statics.field3707 = Statics.field2408;
                Statics.field22.method4895();
                int var49 = (int) (Math.random() * 21.0D) - 10;
                int var50 = (int) (Math.random() * 21.0D) - 10;
                int var51 = (int) (Math.random() * 21.0D) - 10;
                int var52 = (int) (Math.random() * 41.0D) - 20;
                Statics.field2910[0].method4875(var49 + var52, var50 + var52, var51 + var52);
                class92.field1359 = class233.field3017;
                class92.field1356 = 70;
                field900 = 90;
            }
        } else if (field900 == 90) {
            if (Statics.field774.method3939()) {
                class125 var53 = new class125(Statics.field774, Statics.field1323, 20, 0.8D, field1111 ? 64 : 128);
                class136.method2502(var53);
                class136.method2563(0.8D);
                class92.field1359 = class233.field3093;
                class92.field1356 = 90;
                field900 = 110;
            } else {
                class92.field1359 = class233.field2931 + Statics.field774.method4044() + "%";
                class92.field1356 = 90;
            }
        } else if (field900 == 110) {
            Statics.field3697 = new class71();
            Statics.field3738.method2824(Statics.field3697, 10);
            class92.field1359 = class233.field2993;
            class92.field1356 = 92;
            field900 = 120;
        } else if (field900 == 120) {
            if (Statics.field501.method3955("huffman", "")) {
                class173 var54 = new class173(Statics.field501.method3954("huffman", ""));
                class273.method171(var54);
                class92.field1359 = class233.field2962;
                class92.field1356 = 94;
                field900 = 130;
            } else {
                class92.field1359 = class233.field3058 + "%";
                class92.field1356 = 94;
            }
        } else if (field900 == 130) {
            if (!Statics.field562.method3939()) {
                class92.field1359 = class233.field2963 + Statics.field562.method4044() * 4 / 5 + "%";
                class92.field1356 = 96;
            } else if (!Statics.field11.method3939()) {
                class92.field1359 = class233.field2963 + (80 + Statics.field11.method4044() / 6) + "%";
                class92.field1356 = 96;
            } else if (Statics.field551.method3939()) {
                class92.field1359 = class233.field2964;
                class92.field1356 = 98;
                field900 = 140;
            } else {
                class92.field1359 = class233.field2963 + (96 + Statics.field551.method4044() / 50) + "%";
                class92.field1356 = 96;
            }
        } else if (field900 == 140) {
            class92.field1356 = 100;
            if (Statics.field570.method3956(class41.field515.field518)) {
                if (Statics.field699 == null) {
                    Statics.field699 = new class298();
                    Statics.field699.method5135(Statics.field570, Statics.field1227, field921, Statics.field2910);
                }
                int var55 = Statics.field699.method5029();
                if (var55 < 100) {
                    class92.field1359 = class233.field2965 + (var55 * 9 / 10 + 10) + "%";
                } else {
                    class92.field1359 = class233.field2966;
                    field900 = 150;
                }
            } else {
                class92.field1359 = class233.field2965 + Statics.field570.method3966(class41.field515.field518) / 10 + "%";
            }
        } else if (field900 == 150) {
            method62(10);
        }
    }

    @ObfuscatedName("client.fm(I)V")
    public final void method1105() {
        class161 var1 = field917.method1785();
        class187 var2 = field917.field1466;
        try {
            if (field905 == 0) {
                if (var1 != null) {
                    var1.method2867();
                    var1 = null;
                }
                Statics.field1952 = null;
                field919 = false;
                field906 = 0;
                field905 = 1;
            }
            if (field905 == 1) {
                if (Statics.field1952 == null) {
                    Statics.field1952 = Statics.field3738.method2820(Statics.field315, Statics.field2519);
                }
                if (Statics.field1952.field2133 == 2) {
                    throw new IOException();
                }
                if (Statics.field1952.field2133 == 1) {
                    field917.method1781(new class161((Socket) Statics.field1952.field2141, Statics.field3738, 5000));
                    var1 = field917.method1785();
                    Statics.field1952 = null;
                    field905 = 2;
                }
            }
            if (field905 == 2) {
                field917.method1778();
                class171 var3 = class171.method3340();
                var3.field2423.method3020(class169.field2407.field2404);
                field917.method1777(var3);
                field917.method1779();
                var2.field2498 = 0;
                field905 = 3;
            }
            if (field905 == 3) {
                if (Statics.field25 != null) {
                    Statics.field25.method1945();
                }
                if (Statics.field1685 != null) {
                    Statics.field1685.method1945();
                }
                int var4 = var1.method2872();
                if (Statics.field25 != null) {
                    Statics.field25.method1945();
                }
                if (Statics.field1685 != null) {
                    Statics.field1685.method1945();
                }
                if (var4 != 0) {
                    method223(var4);
                    return;
                }
                var2.field2498 = 0;
                field905 = 4;
            }
            if (field905 == 4) {
                if (var2.field2498 < 8) {
                    int var5 = var1.method2862();
                    if (var5 > 8 - var2.field2498) {
                        var5 = 8 - var2.field2498;
                    }
                    if (var5 > 0) {
                        var1.method2864(var2.field2496, var2.field2498, var5);
                        var2.field2498 += var5;
                    }
                }
                if (var2.field2498 == 8) {
                    var2.field2498 = 0;
                    Statics.field2065 = var2.method3134();
                    field905 = 5;
                }
            }
            if (field905 == 5) {
                field917.field1466.field2498 = 0;
                field917.method1778();
                class187 var6 = new class187(500);
                int[] var7 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field2065 >> 32), (int) (Statics.field2065 & 0xFFFFFFFFFFFFFFFFL) };
                var6.field2498 = 0;
                var6.method3020(1);
                var6.method3020(field1044.method18());
                var6.method3149(var7[0]);
                var6.method3149(var7[1]);
                var6.method3149(var7[2]);
                var6.method3149(var7[3]);
                switch(field1044.field2114) {
                    case 0:
                        LinkedHashMap var9 = Statics.field632.field1239;
                        String var10 = class92.field1362;
                        int var11 = var10.length();
                        int var12 = 0;
                        for (int var13 = 0; var13 < var11; var13++) {
                            var12 = (var12 << 5) - var12 + var10.charAt(var13);
                        }
                        var6.method3149((Integer) var9.get(var12));
                        var6.field2498 += 4;
                        break;
                    case 1:
                    case 2:
                        var6.method3137(Statics.field391);
                        var6.field2498 += 5;
                        break;
                    case 3:
                        var6.field2498 += 8;
                }
                var6.method3027(class92.field1366);
                var6.method3203(class90.field1332, class90.field1331);
                class171 var15 = class171.method3340();
                var15.field2423.field2498 = 0;
                if (field879 == 40) {
                    var15.field2423.method3020(class169.field2401.field2404);
                } else {
                    var15.field2423.method3020(class169.field2403.field2404);
                }
                var15.field2423.method3021(0);
                int var16 = var15.field2423.field2498;
                var15.field2423.method3149(159);
                var15.field2423.method3198(var6.field2496, 0, var6.field2498);
                int var17 = var15.field2423.field2498;
                var15.field2423.method3027(class92.field1362);
                var15.field2423.method3020((field1069 ? 1 : 0) << 1 | (field1111 ? 1 : 0));
                var15.field2423.method3021(Statics.field1308);
                var15.field2423.method3021(Statics.field674);
                method1637(var15.field2423);
                var15.field2423.method3027(Statics.field1240);
                var15.field2423.method3149(Statics.field398);
                class181 var18 = new class181(Statics.field3448.method5222());
                Statics.field3448.method5224(var18);
                var15.field2423.method3198(var18.field2496, 0, var18.field2496.length);
                var15.field2423.method3020(Statics.field817);
                var15.field2423.method3149(0);
                var15.field2423.method3149(Statics.field2209.field3296);
                var15.field2423.method3149(Statics.field253.field3296);
                var15.field2423.method3149(Statics.field863.field3296);
                var15.field2423.method3149(Statics.field562.field3296);
                var15.field2423.method3149(Statics.field577.field3296);
                var15.field2423.method3149(Statics.field2702.field3296);
                var15.field2423.method3149(Statics.field631.field3296);
                var15.field2423.method3149(Statics.field702.field3296);
                var15.field2423.method3149(Statics.field1323.field3296);
                var15.field2423.method3149(Statics.field774.field3296);
                var15.field2423.method3149(Statics.field501.field3296);
                var15.field2423.method3149(Statics.field477.field3296);
                var15.field2423.method3149(Statics.field11.field3296);
                var15.field2423.method3149(Statics.field551.field3296);
                var15.field2423.method3149(Statics.field313.field3296);
                var15.field2423.method3149(Statics.field862.field3296);
                var15.field2423.method3149(Statics.field570.field3296);
                var15.field2423.method3056(var7, var17, var15.field2423.field2498);
                var15.field2423.method3238(var15.field2423.field2498 - var16);
                field917.method1777(var15);
                field917.method1779();
                field917.field1471 = new class188(var7);
                for (int var19 = 0; var19 < 4; var19++) {
                    var7[var19] += 50;
                }
                var2.method3301(var7);
                field905 = 6;
            }
            if (field905 == 6 && var1.method2862() > 0) {
                int var20 = var1.method2872();
                if (var20 == 21 && field879 == 20) {
                    field905 = 7;
                } else if (var20 == 2) {
                    field905 = 9;
                } else if (var20 == 15 && field879 == 40) {
                    field917.field1473 = -1;
                    field905 = 13;
                } else if (var20 == 23 && field897 < 1) {
                    field897++;
                    field905 = 0;
                } else if (var20 == 29) {
                    field905 = 11;
                } else {
                    method223(var20);
                    return;
                }
            }
            if (field905 == 7 && var1.method2862() > 0) {
                field984 = (var1.method2872() + 3) * 60;
                field905 = 8;
            }
            if (field905 == 8) {
                field906 = 0;
                class92.method1614(class233.field2970, class233.field2958, field984 / 60 + class233.field3060);
                if (--field984 <= 0) {
                    field905 = 0;
                }
            } else {
                if (field905 == 9 && var1.method2862() >= 13) {
                    boolean var21 = var1.method2872() == 1;
                    var1.method2864(var2.field2496, 0, 4);
                    var2.field2498 = 0;
                    boolean var22 = false;
                    if (var21) {
                        int var23 = var2.method3292() << 24;
                        int var24 = var23 | var2.method3292() << 16;
                        int var25 = var24 | var2.method3292() << 8;
                        int var26 = var25 | var2.method3292();
                        String var27 = class92.field1362;
                        int var28 = var27.length();
                        int var29 = 0;
                        int var30 = 0;
                        while (true) {
                            if (var30 >= var28) {
                                if (Statics.field632.field1239.size() >= 10 && !Statics.field632.field1239.containsKey(var29)) {
                                    Iterator var33 = Statics.field632.field1239.entrySet().iterator();
                                    var33.next();
                                    var33.remove();
                                }
                                Statics.field632.field1239.put(var29, var26);
                                break;
                            }
                            var29 = (var29 << 5) - var29 + var27.charAt(var30);
                            var30++;
                        }
                    }
                    if (class92.field1367) {
                        Statics.field632.field1235 = class92.field1362;
                    } else {
                        Statics.field632.field1235 = null;
                    }
                    class81.method1010();
                    field1026 = var1.method2872();
                    field1080 = var1.method2872() == 1;
                    field976 = var1.method2872();
                    field976 <<= 0x8;
                    field976 += var1.method2872();
                    field977 = var1.method2872();
                    var1.method2864(var2.field2496, 0, 1);
                    var2.field2498 = 0;
                    class167[] var34 = new class167[] { class167.field2265, class167.field2231, class167.field2222, class167.field2294, class167.field2223, class167.field2225, class167.field2276, class167.field2227, class167.field2228, class167.field2229, class167.field2230, class167.field2283, class167.field2266, class167.field2242, class167.field2270, class167.field2235, class167.field2269, class167.field2237, class167.field2238, class167.field2239, class167.field2240, class167.field2241, class167.field2261, class167.field2243, class167.field2244, class167.field2232, class167.field2246, class167.field2247, class167.field2248, class167.field2233, class167.field2250, class167.field2251, class167.field2252, class167.field2253, class167.field2263, class167.field2255, class167.field2256, class167.field2245, class167.field2259, class167.field2234, class167.field2260, class167.field2287, class167.field2262, class167.field2220, class167.field2264, class167.field2302, class167.field2224, class167.field2267, class167.field2268, class167.field2236, class167.field2273, class167.field2271, class167.field2272, class167.field2277, class167.field2274, class167.field2275, class167.field2257, class167.field2249, class167.field2278, class167.field2279, class167.field2280, class167.field2281, class167.field2282, class167.field2291, class167.field2284, class167.field2285, class167.field2286, class167.field2258, class167.field2288, class167.field2289, class167.field2226, class167.field2290, class167.field2292, class167.field2293, class167.field2254, class167.field2295, class167.field2296, class167.field2297, class167.field2298, class167.field2299, class167.field2300 };
                    int var36 = var2.method3294();
                    if (var36 < 0 || var36 >= var34.length) {
                        throw new IOException(var36 + " " + var2.field2498);
                    }
                    field917.field1472 = var34[var36];
                    field917.field1473 = field917.field1472.field2221;
                    var1.method2864(var2.field2496, 0, 2);
                    var2.field2498 = 0;
                    field917.field1473 = var2.method3179();
                    try {
                        class53.method690(Statics.field3793, "zap");
                    } catch (Throwable var67) {
                    }
                    field905 = 10;
                }
                if (field905 != 10) {
                    if (field905 == 11 && var1.method2862() >= 2) {
                        var2.field2498 = 0;
                        var1.method2864(var2.field2496, 0, 2);
                        var2.field2498 = 0;
                        Statics.field20 = var2.method3179();
                        field905 = 12;
                    }
                    if (field905 == 12 && var1.method2862() >= Statics.field20) {
                        var2.field2498 = 0;
                        var1.method2864(var2.field2496, 0, Statics.field20);
                        var2.field2498 = 0;
                        String var57 = var2.method3045();
                        String var58 = var2.method3045();
                        String var59 = var2.method3045();
                        class92.method1614(var57, var58, var59);
                        method62(10);
                    }
                    if (field905 == 13) {
                        if (field917.field1473 == -1) {
                            if (var1.method2862() < 2) {
                                return;
                            }
                            var1.method2864(var2.field2496, 0, 2);
                            var2.field2498 = 0;
                            field917.field1473 = var2.method3179();
                        }
                        if (var1.method2862() >= field917.field1473) {
                            var1.method2864(var2.field2496, 0, field917.field1473);
                            var2.field2498 = 0;
                            int var60 = field917.field1473;
                            field920.method4745();
                            field917.method1778();
                            field917.field1466.field2498 = 0;
                            field917.field1472 = null;
                            field917.field1477 = null;
                            field917.field1476 = null;
                            field917.field1479 = null;
                            field917.field1473 = 0;
                            field917.field1475 = 0;
                            field932 = 0;
                            method1007();
                            field1089 = 0;
                            field1087 = 0;
                            for (int var61 = 0; var61 < 2048; var61++) {
                                field1054[var61] = null;
                            }
                            Statics.field2501 = null;
                            for (int var62 = 0; var62 < field915.length; var62++) {
                                class86 var63 = field915[var62];
                                if (var63 != null) {
                                    var63.field1173 = -1;
                                    var63.field1174 = false;
                                }
                            }
                            class64.field754 = new class198(32);
                            method62(30);
                            for (int var64 = 0; var64 < 100; var64++) {
                                field1060[var64] = true;
                            }
                            class171 var65 = class171.method3795(class168.field2322, field917.field1471);
                            var65.field2423.method3020(method3334());
                            var65.field2423.method3021(Statics.field1308);
                            var65.field2423.method3021(Statics.field674);
                            field917.method1777(var65);
                            class95.method1531(var2);
                            if (var2.field2498 != var60) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field906++;
                        if (field906 > 2000) {
                            if (field897 < 1) {
                                if (Statics.field592 == Statics.field2519) {
                                    Statics.field2519 = Statics.field910;
                                } else {
                                    Statics.field2519 = Statics.field592;
                                }
                                field897++;
                                field905 = 0;
                            } else {
                                method223(-3);
                            }
                        }
                    }
                } else if (var1.method2862() >= field917.field1473) {
                    var2.field2498 = 0;
                    var1.method2864(var2.field2496, 0, field917.field1473);
                    field920.method4739();
                    field1067 = -1L;
                    field885 = -1;
                    Statics.field3697.field819 = 0;
                    Statics.field549 = true;
                    field886 = true;
                    field1079 = -1L;
                    class290.method1465();
                    field917.method1778();
                    field917.field1466.field2498 = 0;
                    field917.field1472 = null;
                    field917.field1477 = null;
                    field917.field1476 = null;
                    field917.field1479 = null;
                    field917.field1473 = 0;
                    field917.field1475 = 0;
                    field932 = 0;
                    field1109 = 0;
                    field907 = 0;
                    method1007();
                    class60.method239(0);
                    class97.field1439.clear();
                    class97.field1435.method3393();
                    class97.field1436.method3551();
                    class97.field1437 = 0;
                    field1008 = 0;
                    field1098 = false;
                    field986 = 0;
                    field939 = 0;
                    field1089 = 0;
                    field1082 = -1;
                    field1087 = 0;
                    field1088 = 0;
                    field898 = class91.field1337;
                    field899 = class91.field1337;
                    field913 = 0;
                    class95.method1081();
                    for (int var38 = 0; var38 < 2048; var38++) {
                        field1054[var38] = null;
                    }
                    for (int var39 = 0; var39 < 32768; var39++) {
                        field915[var39] = null;
                    }
                    field1095 = -1;
                    field1045.method3506();
                    field1033.method3506();
                    for (int var40 = 0; var40 < 4; var40++) {
                        for (int var41 = 0; var41 < 104; var41++) {
                            for (int var42 = 0; var42 < 104; var42++) {
                                field985[var40][var41][var42] = null;
                            }
                        }
                    }
                    field888 = new class201();
                    field1023 = 0;
                    field1120 = 0;
                    field1124 = 0;
                    for (int var43 = 0; var43 < Statics.field3358; var43++) {
                        class249 var44 = (class249) class249.field3361.method3418((long) var43);
                        class249 var45;
                        if (var44 == null) {
                            byte[] var46 = Statics.field3360.method3935(16, var43);
                            class249 var47 = new class249();
                            if (var46 != null) {
                                var47.method4098(new class181(var46));
                            }
                            class249.field3361.method3417(var47, (long) var43);
                            var45 = var47;
                        } else {
                            var45 = var44;
                        }
                        if (var45 != null) {
                            class219.field2689[var43] = 0;
                            class219.field2688[var43] = 0;
                        }
                    }
                    Statics.field383.method1729();
                    field1083 = -1;
                    if (field1016 != -1) {
                        int var49 = field1016;
                        if (var49 != -1 && Statics.field646[var49]) {
                            Statics.field755.method3948(var49);
                            if (Statics.field257[var49] != null) {
                                boolean var50 = true;
                                for (int var51 = 0; var51 < Statics.field257[var49].length; var51++) {
                                    if (Statics.field257[var49][var51] != null) {
                                        if (Statics.field257[var49][var51].field2727 == 2) {
                                            var50 = false;
                                        } else {
                                            Statics.field257[var49][var51] = null;
                                        }
                                    }
                                }
                                if (var50) {
                                    Statics.field257[var49] = null;
                                }
                                Statics.field646[var49] = false;
                            }
                        }
                    }
                    for (class68 var52 = (class68) field1070.method3437(); var52 != null; var52 = (class68) field1070.method3433()) {
                        method499(var52, true);
                    }
                    field1016 = -1;
                    field1070 = new class198(8);
                    field1019 = null;
                    method1007();
                    field1126.method3815((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var53 = 0; var53 < 8; var53++) {
                        field981[var53] = null;
                        field982[var53] = false;
                    }
                    class64.field754 = new class198(32);
                    field880 = true;
                    for (int var54 = 0; var54 < 100; var54++) {
                        field1060[var54] = true;
                    }
                    class171 var55 = class171.method3795(class168.field2322, field917.field1471);
                    var55.field2423.method3020(method3334());
                    var55.field2423.method3021(Statics.field1308);
                    var55.field2423.method3021(Statics.field674);
                    field917.method1777(var55);
                    field1131 = null;
                    Statics.field733 = 0;
                    Statics.field2537 = null;
                    for (int var56 = 0; var56 < 8; var56++) {
                        field1129[var56] = new class17();
                    }
                    Statics.field28 = null;
                    class95.method1531(var2);
                    Statics.field555 = -1;
                    method2399(false, var2);
                    field917.field1472 = null;
                }
            }
        } catch (IOException var68) {
            if (field897 < 1) {
                if (Statics.field592 == Statics.field2519) {
                    Statics.field2519 = Statics.field910;
                } else {
                    Statics.field2519 = Statics.field592;
                }
                field897++;
                field905 = 0;
            } else {
                method223(-2);
            }
        }
    }

    @ObfuscatedName("aa.fn(II)V")
    public static void method223(int arg0) {
        if (arg0 == -3) {
            class92.method1614(class233.field3043, class233.field2974, class233.field2975);
        } else if (arg0 == -2) {
            class92.method1614(class233.field2976, class233.field2977, class233.field2988);
        } else if (arg0 == -1) {
            class92.method1614(class233.field3044, class233.field2997, class233.field2981);
        } else if (arg0 == 3) {
            class92.field1360 = 3;
        } else if (arg0 == 4) {
            class92.method1614(class233.field2982, class233.field3194, class233.field3079);
        } else if (arg0 == 5) {
            class92.method1614(class233.field2985, class233.field3041, class233.field2987);
        } else if (arg0 == 6) {
            class92.method1614(class233.field2954, class233.field2989, class233.field2947);
        } else if (arg0 == 7) {
            class92.method1614(class233.field2991, class233.field2992, class233.field3122);
        } else if (arg0 == 8) {
            class92.method1614(class233.field2994, class233.field3119, class233.field2996);
        } else if (arg0 == 9) {
            class92.method1614(class233.field3150, class233.field2998, class233.field2999);
        } else if (arg0 == 10) {
            class92.method1614(class233.field3000, class233.field3001, class233.field3002);
        } else if (arg0 == 11) {
            class92.method1614(class233.field3003, class233.field3124, class233.field3005);
        } else if (arg0 == 12) {
            class92.method1614(class233.field3134, class233.field3007, class233.field3139);
        } else if (arg0 == 13) {
            class92.method1614(class233.field2990, class233.field3038, class233.field3011);
        } else if (arg0 == 14) {
            class92.method1614(class233.field3012, class233.field2972, class233.field3014);
        } else if (arg0 == 16) {
            class92.method1614(class233.field3015, class233.field3016, class233.field3009);
        } else if (arg0 == 17) {
            class92.method1614(class233.field3018, class233.field3164, class233.field3020);
        } else if (arg0 == 18) {
            class92.method1614(class233.field3021, class233.field2953, class233.field3010);
        } else if (arg0 == 19) {
            class92.method1614(class233.field3024, class233.field3025, class233.field3023);
        } else if (arg0 == 20) {
            class92.method1614(class233.field3034, class233.field3028, class233.field3029);
        } else if (arg0 == 22) {
            class92.method1614(class233.field2978, class233.field3031, class233.field2968);
        } else if (arg0 == 23) {
            class92.method1614(class233.field3033, class233.field3145, class233.field3035);
        } else if (arg0 == 24) {
            class92.method1614(class233.field3036, class233.field3037, class233.field2984);
        } else if (arg0 == 25) {
            class92.method1614(class233.field2971, class233.field3040, class233.field3136);
        } else if (arg0 == 26) {
            class92.method1614(class233.field3099, class233.field3181, class233.field3057);
        } else if (arg0 == 27) {
            class92.method1614(class233.field3045, class233.field3051, class233.field3047);
        } else if (arg0 == 31) {
            class92.method1614(class233.field3054, class233.field3055, class233.field2952);
        } else if (arg0 == 32) {
            class92.method1614(class233.field3172, class233.field2980, class233.field3059);
        } else if (arg0 == 37) {
            class92.method1614(class233.field3052, class233.field3061, class233.field3062);
        } else if (arg0 == 38) {
            class92.method1614(class233.field3063, class233.field3064, class233.field3065);
        } else if (arg0 == 55) {
            class92.method1614(class233.field3066, class233.field3113, class233.field3068);
        } else if (arg0 == 56) {
            class92.method1614(class233.field3042, class233.field3070, class233.field3071);
            method62(11);
            return;
        } else if (arg0 == 57) {
            class92.method1614(class233.field3072, class233.field3073, class233.field3074);
            method62(11);
            return;
        } else {
            class92.method1614(class233.field3075, class233.field3076, class233.field2946);
        }
        method62(10);
    }

    @ObfuscatedName("es.fp(B)V")
    public static final void method2769() {
        field917.method1782();
        method3917();
        Statics.field282.method2581();
        for (int var0 = 0; var0 < 4; var0++) {
            field1086[var0].method2893();
        }
        System.gc();
        class211.method7(2);
        field1091 = -1;
        field1096 = false;
        class82.method1020();
        method62(10);
    }

    @ObfuscatedName("ie.fo(I)V")
    public static final void method3917() {
        class267.field3653.method3422();
        class254.method21();
        class255.field3421.method3422();
        class263.method1704();
        class266.method2494();
        class264.method4234();
        class268.field3667.method3422();
        class268.field3680.method3422();
        class253.field3396.method3422();
        class253.field3397.method3422();
        class258.field3450.method3422();
        class249.field3361.method3422();
        class262.method2941();
        class256.method3264();
        class260.method1985();
        class259.method2958();
        class250.method1057();
        class221.method3694();
        class224.field2719.method3422();
        class224.field2851.method3422();
        class224.field2736.method3422();
        class224.field2798.method3422();
        ((class125) Statics.field1933).method2264();
        class98.field1442.method3422();
        Statics.field2209.method3961();
        Statics.field253.method3961();
        Statics.field562.method3961();
        Statics.field577.method3961();
        Statics.field2702.method3961();
        Statics.field631.method3961();
        Statics.field702.method3961();
        Statics.field1323.method3961();
        Statics.field774.method3961();
        Statics.field501.method3961();
        Statics.field477.method3961();
        Statics.field11.method3961();
    }

    @ObfuscatedName("ds.fq(I)V")
    public static final void method2007() {
        if (field1109 > 0) {
            method2769();
        } else {
            field920.method4741();
            method62(40);
            Statics.field1686 = field917.method1785();
            field917.method1791();
        }
    }

    @ObfuscatedName("b.fl(ZB)V")
    public static final void method25(boolean arg0) {
        if (arg0) {
            field1044 = class92.field1370 ? class151.field2111 : class151.field2112;
            return;
        }
        LinkedHashMap var1 = Statics.field632.field1239;
        String var2 = class92.field1362;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field1044 = var1.containsKey(var4) ? class151.field2116 : class151.field2113;
    }

    @ObfuscatedName("client.fy(I)V")
    public final void method1106() {
        if (field932 > 1) {
            field932--;
        }
        if (field1109 > 0) {
            field1109--;
        }
        if (field919) {
            field919 = false;
            method2007();
            return;
        }
        if (!field1072) {
            method3931();
        }
        for (int var1 = 0; var1 < 100 && this.method1245(field917); var1++) {
        }
        if (field879 != 30) {
            return;
        }
        while (class290.method4737()) {
            class171 var2 = class171.method3795(class168.field2325, field917.field1471);
            var2.field2423.method3020(0);
            int var3 = var2.field2423.field2498;
            class290.method2025(var2.field2423);
            var2.field2423.method3033(var2.field2423.field2498 - var3);
            field917.method1777(var2);
        }
        if (field920.field3777) {
            class171 var4 = class171.method3795(class168.field2356, field917.field1471);
            var4.field2423.method3020(0);
            int var5 = var4.field2423.field2498;
            field920.method4743(var4.field2423);
            var4.field2423.method3033(var4.field2423.field2498 - var5);
            field917.method1777(var4);
            field920.method4744();
        }
        Object var6 = Statics.field3697.field820;
        synchronized (Statics.field3697.field820) {
            if (!field941) {
                Statics.field3697.field819 = 0;
            } else if (class60.field709 != 0 || Statics.field3697.field819 >= 40) {
                class171 var7 = class171.method3795(class168.field2362, field917.field1471);
                var7.field2423.method3020(0);
                int var8 = var7.field2423.field2498;
                int var9 = 0;
                for (int var10 = 0; var10 < Statics.field3697.field819 && var7.field2423.field2498 - var8 < 240; var10++) {
                    var9++;
                    int var11 = Statics.field3697.field823[var10];
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 502) {
                        var11 = 502;
                    }
                    int var12 = Statics.field3697.field825[var10];
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 764) {
                        var12 = 764;
                    }
                    int var13 = var11 * 765 + var12;
                    if (Statics.field3697.field823[var10] == -1 && Statics.field3697.field825[var10] == -1) {
                        var12 = -1;
                        var11 = -1;
                        var13 = 524287;
                    }
                    if (field1024 != var12 || field884 != var11) {
                        int var14 = var12 - field1024;
                        field1024 = var12;
                        int var15 = var11 - field884;
                        field884 = var11;
                        if (field885 < 8 && var14 >= -32 && var14 <= 31 && var15 >= -32 && var15 <= 31) {
                            var14 += 32;
                            var15 += 32;
                            var7.field2423.method3021((field885 << 12) + (var14 << 6) + var15);
                            field885 = 0;
                        } else if (field885 < 8) {
                            var7.field2423.method3137((field885 << 19) + 8388608 + var13);
                            field885 = 0;
                        } else {
                            var7.field2423.method3149((field885 << 19) + -1073741824 + var13);
                            field885 = 0;
                        }
                    } else if (field885 < 2047) {
                        field885++;
                    }
                }
                var7.field2423.method3033(var7.field2423.field2498 - var8);
                field917.method1777(var7);
                if (var9 >= Statics.field3697.field819) {
                    Statics.field3697.field819 = 0;
                } else {
                    Statics.field3697.field819 -= var9;
                    for (int var16 = 0; var16 < Statics.field3697.field819; var16++) {
                        Statics.field3697.field825[var16] = Statics.field3697.field825[var9 + var16];
                        Statics.field3697.field823[var16] = Statics.field3697.field823[var9 + var16];
                    }
                }
            }
        }
        if (class60.field709 == 1 || !Statics.field957 && class60.field709 == 4 || class60.field709 == 2) {
            long var18 = (class60.field698 - field1067) / 50L;
            if (var18 > 4095L) {
                var18 = 4095L;
            }
            field1067 = class60.field698;
            int var20 = class60.field711;
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > Statics.field674) {
                var20 = Statics.field674;
            }
            int var21 = class60.field710;
            if (var21 < 0) {
                var21 = 0;
            } else if (var21 > Statics.field1308) {
                var21 = Statics.field1308;
            }
            int var22 = (int) var18;
            class171 var23 = class171.method3795(class168.field2353, field917.field1471);
            var23.field2423.method3021((var22 << 1) + (class60.field709 == 2 ? 1 : 0));
            var23.field2423.method3021(var21);
            var23.field2423.method3021(var20);
            field917.method1777(var23);
        }
        if (class51.field614 > 0) {
            class171 var24 = class171.method3795(class168.field2312, field917.field1471);
            var24.field2423.method3021(0);
            int var25 = var24.field2423.field2498;
            long var26 = class183.method2932();
            for (int var28 = 0; var28 < class51.field614; var28++) {
                long var29 = var26 - field1079;
                if (var29 > 16777215L) {
                    var29 = 16777215L;
                }
                field1079 = var26;
                var24.field2423.method3137((int) var29);
                var24.field2423.method3020(class51.field613[var28]);
            }
            var24.field2423.method3238(var24.field2423.field2498 - var25);
            field917.method1777(var24);
        }
        if (field912 > 0) {
            field912--;
        }
        if (class51.field607[96] || class51.field607[97] || class51.field607[98] || class51.field607[99]) {
            field946 = true;
        }
        if (field946 && field912 <= 0) {
            field912 = 20;
            field946 = false;
            class171 var31 = class171.method3795(class168.field2398, field917.field1471);
            var31.field2423.method3040(field998);
            var31.field2423.method3040(field939);
            field917.method1777(var31);
        }
        if (Statics.field549 && !field886) {
            field886 = true;
            class171 var32 = class171.method3795(class168.field2365, field917.field1471);
            var32.field2423.method3020(1);
            field917.method1777(var32);
        }
        if (!Statics.field549 && field886) {
            field886 = false;
            class171 var33 = class171.method3795(class168.field2365, field917.field1471);
            var33.field2423.method3020(0);
            field917.method1777(var33);
        }
        if (Statics.field3219 != field1082) {
            field1082 = Statics.field3219;
            method647(Statics.field3219);
        }
        if (field879 != 30) {
            return;
        }
        method3263();
        method3928();
        field917.field1475++;
        if (field917.field1475 > 750) {
            method2007();
            return;
        }
        method2781();
        for (int var34 = 0; var34 < field913; var34++) {
            int var35 = field1121[var34];
            class86 var36 = field915[var35];
            if (var36 != null) {
                method1036(var36, var36.field1296.field3620);
            }
        }
        int[] var37 = class95.field1424;
        for (int var38 = 0; var38 < class95.field1414; var38++) {
            class74 var39 = field1054[var37[var38]];
            if (var39 != null && var39.field1178 > 0) {
                var39.field1178--;
                if (var39.field1178 == 0) {
                    var39.field1193 = null;
                }
            }
        }
        for (int var40 = 0; var40 < field913; var40++) {
            int var41 = field1121[var40];
            class86 var42 = field915[var41];
            if (var42 != null && var42.field1178 > 0) {
                var42.field1178--;
                if (var42.field1178 == 0) {
                    var42.field1193 = null;
                }
            }
        }
        field993++;
        if (field965 != 0) {
            field964 += 20;
            if (field964 >= 400) {
                field965 = 0;
            }
        }
        if (Statics.field623 != null) {
            field966++;
            if (field966 >= 15) {
                method503(Statics.field623);
                Statics.field623 = null;
            }
        }
        class224 var43 = Statics.field3410;
        class224 var44 = Statics.field280;
        Statics.field3410 = null;
        Statics.field280 = null;
        field891 = null;
        field992 = false;
        field1047 = false;
        field1076 = 0;
        while (class51.method1030() && field1076 < 128) {
            if (field1026 >= 2 && class51.field607[82] && Statics.field474 == 66) {
                String var45 = class97.method1673();
                Statics.field3793.method774(var45);
            } else {
                field1078[field1076] = Statics.field474;
                field1056[field1076] = Statics.field321;
                field1076++;
            }
        }
        boolean var46 = field1026 >= 2;
        if (var46 && class51.field607[82] && class51.field607[81] && field1053 != 0) {
            int var47 = Statics.field2501.field854 - field1053;
            if (var47 < 0) {
                var47 = 0;
            } else if (var47 > 3) {
                var47 = 3;
            }
            if (Statics.field2501.field854 != var47) {
                int var48 = Statics.field3306 + Statics.field2501.field1187[0];
                int var49 = Statics.field2066 + Statics.field2501.field1203[0];
                class171 var50 = class171.method3795(class168.field2376, field917.field1471);
                var50.field2423.method3083(var47);
                var50.field2423.method3040(var48);
                var50.field2423.method3072(var49);
                field917.method1777(var50);
            }
            field1053 = 0;
        }
        if (field1016 != -1) {
            int var51 = field1016;
            int var52 = Statics.field1308;
            int var53 = Statics.field674;
            if (class224.method3331(var51)) {
                method1765(Statics.field257[var51], -1, 0, 0, var52, var53, 0, 0);
            }
        }
        field882++;
        while (true) {
            class69 var54;
            class224 var55;
            class224 var56;
            do {
                var54 = (class69) field1055.method3484();
                if (var54 == null) {
                    while (true) {
                        class69 var57;
                        class224 var58;
                        class224 var59;
                        do {
                            var57 = (class69) field1106.method3484();
                            if (var57 == null) {
                                while (true) {
                                    class69 var60;
                                    class224 var61;
                                    class224 var62;
                                    do {
                                        var60 = (class69) field1011.method3484();
                                        if (var60 == null) {
                                            this.method1110();
                                            method700();
                                            if (field1028 != null) {
                                                this.method1115();
                                            }
                                            if (Statics.field493 != null) {
                                                method503(Statics.field493);
                                                field1013++;
                                                if (class60.field706 == 0) {
                                                    if (field972) {
                                                        if (Statics.field498 == Statics.field493 && field1077 != field1002) {
                                                            class224 var63 = Statics.field493;
                                                            byte var64 = 0;
                                                            if (field928 == 1 && var63.field2729 == 206) {
                                                                var64 = 1;
                                                            }
                                                            if (var63.field2778[field1002] <= 0) {
                                                                var64 = 0;
                                                            }
                                                            if (class225.method2844(method1097(var63))) {
                                                                int var65 = field1077;
                                                                int var66 = field1002;
                                                                var63.field2778[var66] = var63.field2778[var65];
                                                                var63.field2733[var66] = var63.field2733[var65];
                                                                var63.field2778[var65] = -1;
                                                                var63.field2733[var65] = 0;
                                                            } else if (var64 == 1) {
                                                                int var67 = field1077;
                                                                int var68 = field1002;
                                                                while (var67 != var68) {
                                                                    if (var67 > var68) {
                                                                        var63.method3854(var67 - 1, var67);
                                                                        var67--;
                                                                    } else if (var67 < var68) {
                                                                        var63.method3854(var67 + 1, var67);
                                                                        var67++;
                                                                    }
                                                                }
                                                            } else {
                                                                var63.method3854(field1002, field1077);
                                                            }
                                                            class171 var69 = class171.method3795(class168.field2386, field917.field1471);
                                                            var69.field2423.method3149(Statics.field493.field2725);
                                                            var69.field2423.method3070(field1002);
                                                            var69.field2423.method3020(var64);
                                                            var69.field2423.method3021(field1077);
                                                            field917.method1777(var69);
                                                        }
                                                    } else if (this.method1111()) {
                                                        this.method1112(field969, field970);
                                                    } else if (field994 > 0) {
                                                        method2003(field969, field970);
                                                    }
                                                    field966 = 10;
                                                    class60.field709 = 0;
                                                    Statics.field493 = null;
                                                } else if (field1013 >= 5 && (class60.field704 > field969 + 5 || class60.field704 < field969 - 5 || class60.field716 * 10625923 > field970 + 5 || class60.field716 * 10625923 < field970 - 5)) {
                                                    field972 = true;
                                                }
                                            }
                                            if (class139.method2619()) {
                                                int var70 = class139.field1959;
                                                int var71 = class139.field1995;
                                                class171 var72 = class171.method3795(class168.field2346, field917.field1471);
                                                var72.field2423.method3020(5);
                                                var72.field2423.method3021(Statics.field3306 + var70);
                                                var72.field2423.method3040(Statics.field2066 + var71);
                                                var72.field2423.method3020(class51.field607[82] ? (class51.field607[81] ? 2 : 1) : 0);
                                                field917.method1777(var72);
                                                class139.method2620();
                                                field1065 = class60.field710;
                                                field963 = class60.field711;
                                                field965 = 1;
                                                field964 = 0;
                                                field1087 = var70;
                                                field1088 = var71;
                                            }
                                            if (Statics.field3410 != var43) {
                                                if (var43 != null) {
                                                    method503(var43);
                                                }
                                                if (Statics.field3410 != null) {
                                                    method503(Statics.field3410);
                                                }
                                            }
                                            if (Statics.field280 != var44 && field883 == field1007) {
                                                if (var44 != null) {
                                                    method503(var44);
                                                }
                                                if (Statics.field280 != null) {
                                                    method503(Statics.field280);
                                                }
                                            }
                                            if (Statics.field280 == null) {
                                                if (field883 > 0) {
                                                    field883--;
                                                }
                                            } else if (field883 < field1007) {
                                                field883++;
                                                if (field883 == field1007) {
                                                    method503(Statics.field280);
                                                }
                                            }
                                            method172();
                                            if (field1101) {
                                                int var73 = Statics.field778 * 128 + 64;
                                                int var74 = Statics.field2207 * 128 + 64;
                                                int var75 = method545(var73, var74, Statics.field3219) - Statics.field351;
                                                if (Statics.field2674 < var73) {
                                                    Statics.field2674 += Statics.field329 * (var73 - Statics.field2674) / 1000 + Statics.field2686;
                                                    if (Statics.field2674 > var73) {
                                                        Statics.field2674 = var73;
                                                    }
                                                }
                                                if (Statics.field2674 > var73) {
                                                    Statics.field2674 -= Statics.field329 * (Statics.field2674 - var73) / 1000 + Statics.field2686;
                                                    if (Statics.field2674 < var73) {
                                                        Statics.field2674 = var73;
                                                    }
                                                }
                                                if (Statics.field694 < var75) {
                                                    Statics.field694 += Statics.field329 * (var75 - Statics.field694) / 1000 + Statics.field2686;
                                                    if (Statics.field694 > var75) {
                                                        Statics.field694 = var75;
                                                    }
                                                }
                                                if (Statics.field694 > var75) {
                                                    Statics.field694 -= Statics.field329 * (Statics.field694 - var75) / 1000 + Statics.field2686;
                                                    if (Statics.field694 < var75) {
                                                        Statics.field694 = var75;
                                                    }
                                                }
                                                if (Statics.field3806 < var74) {
                                                    Statics.field3806 += Statics.field329 * (var74 - Statics.field3806) / 1000 + Statics.field2686;
                                                    if (Statics.field3806 > var74) {
                                                        Statics.field3806 = var74;
                                                    }
                                                }
                                                if (Statics.field3806 > var74) {
                                                    Statics.field3806 -= Statics.field329 * (Statics.field3806 - var74) / 1000 + Statics.field2686;
                                                    if (Statics.field3806 < var74) {
                                                        Statics.field3806 = var74;
                                                    }
                                                }
                                                int var76 = Statics.field480 * 128 + 64;
                                                int var77 = Statics.field630 * 128 + 64;
                                                int var78 = method545(var76, var77, Statics.field3219) - Statics.field305;
                                                int var79 = var76 - Statics.field2674;
                                                int var80 = var78 - Statics.field694;
                                                int var81 = var77 - Statics.field3806;
                                                int var82 = (int) Math.sqrt((double) (var79 * var79 + var81 * var81));
                                                int var83 = (int) (Math.atan2((double) var80, (double) var82) * 325.949D) & 0x7FF;
                                                int var84 = (int) (Math.atan2((double) var79, (double) var81) * -325.949D) & 0x7FF;
                                                if (var83 < 128) {
                                                    var83 = 128;
                                                }
                                                if (var83 > 383) {
                                                    var83 = 383;
                                                }
                                                if (Statics.field312 < var83) {
                                                    Statics.field312 += Statics.field3227 * (var83 - Statics.field312) / 1000 + Statics.field2166;
                                                    if (Statics.field312 > var83) {
                                                        Statics.field312 = var83;
                                                    }
                                                }
                                                if (Statics.field312 > var83) {
                                                    Statics.field312 -= Statics.field3227 * (Statics.field312 - var83) / 1000 + Statics.field2166;
                                                    if (Statics.field312 < var83) {
                                                        Statics.field312 = var83;
                                                    }
                                                }
                                                int var85 = var84 - Statics.field625;
                                                if (var85 > 1024) {
                                                    var85 -= 2048;
                                                }
                                                if (var85 < -1024) {
                                                    var85 += 2048;
                                                }
                                                if (var85 > 0) {
                                                    Statics.field625 += Statics.field3227 * var85 / 1000 + Statics.field2166;
                                                    Statics.field625 &= 0x7FF;
                                                }
                                                if (var85 < 0) {
                                                    Statics.field625 -= Statics.field3227 * -var85 / 1000 + Statics.field2166;
                                                    Statics.field625 &= 0x7FF;
                                                }
                                                int var86 = var84 - Statics.field625;
                                                if (var86 > 1024) {
                                                    var86 -= 2048;
                                                }
                                                if (var86 < -1024) {
                                                    var86 += 2048;
                                                }
                                                if (var86 < 0 && var85 > 0 || var86 > 0 && var85 < 0) {
                                                    Statics.field625 = var84;
                                                }
                                            }
                                            for (int var87 = 0; var87 < 5; var87++) {
                                                int var10002 = field1092[var87]++;
                                            }
                                            Statics.field383.method1713();
                                            int var88 = class60.method4096();
                                            int var89 = class51.field618;
                                            if (var88 > 15000 && var89 > 15000) {
                                                field1109 = 250;
                                                class60.method239(14500);
                                                class171 var91 = class171.method3795(class168.field2305, field917.field1471);
                                                field917.method1777(var91);
                                            }
                                            for (class67 var92 = (class67) field1123.method3518(); var92 != null; var92 = (class67) field1123.method3528()) {
                                                if ((long) var92.field789 < class183.method2932() / 1000L - 5L) {
                                                    if (var92.field787 > 0) {
                                                        class97.method706(5, "", var92.field786 + class233.field3078);
                                                    }
                                                    if (var92.field787 == 0) {
                                                        class97.method706(5, "", var92.field786 + class233.field3135);
                                                    }
                                                    var92.method3529();
                                                }
                                            }
                                            field917.field1469++;
                                            if (field917.field1469 > 50) {
                                                class171 var93 = class171.method3795(class168.field2352, field917.field1471);
                                                field917.method1777(var93);
                                            }
                                            try {
                                                field917.method1779();
                                            } catch (IOException var95) {
                                                method2007();
                                            }
                                            return;
                                        }
                                        var61 = var60.field800;
                                        if (var61.field2726 < 0) {
                                            break;
                                        }
                                        var62 = class224.method1627(var61.field2744);
                                    } while (var62 == null || var62.field2779 == null || var61.field2726 >= var62.field2779.length || var62.field2779[var61.field2726] != var61);
                                    class83.method86(var60);
                                }
                            }
                            var58 = var57.field800;
                            if (var58.field2726 < 0) {
                                break;
                            }
                            var59 = class224.method1627(var58.field2744);
                        } while (var59 == null || var59.field2779 == null || var58.field2726 >= var59.field2779.length || var59.field2779[var58.field2726] != var58);
                        class83.method86(var57);
                    }
                }
                var55 = var54.field800;
                if (var55.field2726 < 0) {
                    break;
                }
                var56 = class224.method1627(var55.field2744);
            } while (var56 == null || var56.field2779 == null || var55.field2726 >= var56.field2779.length || var56.field2779[var55.field2726] != var55);
            class83.method86(var54);
        }
    }

    @ObfuscatedName("a.fz(B)V")
    public static final void method181() {
        if (Statics.field1685 != null) {
            Statics.field1685.method1944();
        }
        if (Statics.field25 != null) {
            Statics.field25.method1944();
        }
    }

    @ObfuscatedName("iy.fe(I)V")
    public static final void method3928() {
        for (int var0 = 0; var0 < field986; var0++) {
            int var10002 = field931[var0]--;
            if (field931[var0] >= -10) {
                class105 var2 = field1127[var0];
                if (var2 == null) {
                    class105 var10000 = (class105) null;
                    var2 = class105.method1863(Statics.field577, field971[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field931[var0] += var2.method1872();
                    field1127[var0] = var2;
                }
                if (field931[var0] < 0) {
                    int var9;
                    if (field1099[var0] == 0) {
                        var9 = field1010;
                    } else {
                        int var3 = (field1099[var0] & 0xFF) * 128;
                        int var4 = field1099[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2501.field1149;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field1099[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2501.field1198;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field931[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field1094 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class107 var10 = var2.method1862().method1915(Statics.field1584);
                        class117 var11 = class117.method2054(var10, 100, var9);
                        var11.method2057(field1097[var0] - 1);
                        Statics.field822.method1805(var11);
                    }
                    field931[var0] = -100;
                }
            } else {
                field986--;
                for (int var1 = var0; var1 < field986; var1++) {
                    field971[var1] = field971[var1 + 1];
                    field1127[var1] = field1127[var1 + 1];
                    field1097[var1] = field1097[var1 + 1];
                    field931[var1] = field931[var1 + 1];
                    field1099[var1] = field1099[var1 + 1];
                }
                var0--;
            }
        }
        if (field1096 && !class211.method107()) {
            if (field1114 != 0 && field1091 != -1) {
                class211.method3058(Statics.field631, field1091, 0, field1114, false);
            }
            field1096 = false;
        }
    }

    @ObfuscatedName("cn.fh(Ljj;IIII)V")
    public static void method1617(class268 arg0, int arg1, int arg2, int arg3) {
        if (field986 >= 50 || field1094 == 0 || arg0.field3672 == null || arg1 >= arg0.field3672.length) {
            return;
        }
        int var4 = arg0.field3672[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field971[field986] = var5;
        field1097[field986] = var6;
        field931[field986] = 0;
        field1127[field986] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1099[field986] = (var8 << 16) + (var9 << 8) + var7;
        field986++;
    }

    @ObfuscatedName("af.fc(IIII)V")
    public static void method633(int arg0, int arg1, int arg2) {
        if (field1010 == 0 || arg1 == 0 || field986 >= 50) {
            return;
        }
        field971[field986] = arg0;
        field1097[field986] = arg1;
        field931[field986] = arg2;
        field1127[field986] = null;
        field1099[field986] = 0;
        field986++;
    }

    @ObfuscatedName("bb.fs(II)V")
    public static void method1011(int arg0) {
        if (arg0 == -1 && !field1096) {
            class211.method1033();
        } else if (arg0 != -1 && field1091 != arg0 && field1114 != 0 && !field1096) {
            class245 var1 = Statics.field631;
            int var2 = field1114;
            class211.field2599 = 1;
            Statics.field23 = var1;
            Statics.field238 = arg0;
            Statics.field2600 = 0;
            Statics.field1589 = var2;
            Statics.field323 = false;
            Statics.field2217 = 2;
        }
        field1091 = arg0;
    }

    @ObfuscatedName("cb.fx(III)V")
    public static void method1602(int arg0, int arg1) {
        if (field1114 != 0 && arg0 != -1) {
            class211.method3058(Statics.field477, arg0, 0, field1114, false);
            field1096 = true;
        }
    }

    @ObfuscatedName("f.fw(Lhx;III)V")
    public static final void method123(class224 arg0, int arg1, int arg2) {
        if (field1089 != 0 && field1089 != 3 || class60.field709 != 1 && Statics.field957 || class60.field709 != 4) {
            return;
        }
        class218 var3 = arg0.method3871(true);
        if (var3 == null) {
            return;
        }
        int var4 = class60.field710 - arg1;
        int var5 = class60.field711 - arg2;
        if (!var3.method3785(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2684 / 2;
        int var7 = var5 - var3.field2683 / 2;
        int var8 = field939 & 0x7FF;
        int var9 = class136.field1943[var8];
        int var10 = class136.field1940[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field2501.field1149 + var11 >> 7;
        int var14 = Statics.field2501.field1198 - var12 >> 7;
        class171 var15 = class171.method3795(class168.field2361, field917.field1471);
        var15.field2423.method3020(18);
        var15.field2423.method3021(Statics.field3306 + var13);
        var15.field2423.method3040(Statics.field2066 + var14);
        var15.field2423.method3020(class51.field607[82] ? (class51.field607[81] ? 2 : 1) : 0);
        var15.field2423.method3020(var6);
        var15.field2423.method3020(var7);
        var15.field2423.method3021(field939);
        var15.field2423.method3020(57);
        var15.field2423.method3020(0);
        var15.field2423.method3020(0);
        var15.field2423.method3020(89);
        var15.field2423.method3021(Statics.field2501.field1149);
        var15.field2423.method3021(Statics.field2501.field1198);
        var15.field2423.method3020(63);
        field917.method1777(var15);
        field1087 = var13;
        field1088 = var14;
    }

    @ObfuscatedName("az.fr(Ljava/lang/String;I)V")
    public static final void method681(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field632.field1234 = !Statics.field632.field1234;
            class81.method1010();
            if (Statics.field632.field1234) {
                class97.method706(99, "", "Roofs are now all hidden");
            } else {
                class97.method706(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field887 = !field887;
        }
        if (field1026 >= 2) {
            if (arg0.equalsIgnoreCase("aabb")) {
                if (!class8.field228) {
                    class8.field228 = true;
                    class8.field226 = class12.field255;
                } else if (class8.field226 == class12.field255) {
                    class8.field228 = true;
                    class8.field226 = class12.field259;
                } else {
                    class8.field228 = false;
                }
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field887 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field887 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2007();
            }
            if (arg0.equalsIgnoreCase("errortest") && field875 == 2) {
                throw new RuntimeException();
            }
        }
        class171 var1 = class171.method3795(class168.field2341, field917.field1471);
        var1.field2423.method3020(arg0.length() + 1);
        var1.field2423.method3027(arg0);
        field917.method1777(var1);
    }

    @ObfuscatedName("w.fv(I)V")
    public static final void method172() {
        int var0 = Statics.field2501.field1149;
        int var1 = Statics.field2501.field1198;
        if (Statics.field2864 - var0 < -500 || Statics.field2864 - var0 > 500 || Statics.field284 - var1 < -500 || Statics.field284 - var1 > 500) {
            Statics.field2864 = var0;
            Statics.field284 = var1;
        }
        if (Statics.field2864 != var0) {
            Statics.field2864 += (var0 - Statics.field2864) / 16;
        }
        if (Statics.field284 != var1) {
            Statics.field284 += (var1 - Statics.field284) / 16;
        }
        if (class60.field706 == 4 && Statics.field957) {
            int var2 = class60.field716 * 10625923 - field943 * 10625923;
            field1032 = var2 * 2;
            field943 = (var2 == -1 || var2 == 1 ? class60.field716 * 10625923 : (field943 * 10625923 + class60.field716 * 10625923) / 2) * -2054651093;
            int var3 = field942 - class60.field704;
            field940 = var3 * 2;
            field942 = var3 == -1 || var3 == 1 ? class60.field704 : (field942 + class60.field704) / 2;
        } else {
            if (class51.field607[96]) {
                field940 += (-24 - field940) / 2;
            } else if (class51.field607[97]) {
                field940 += (24 - field940) / 2;
            } else {
                field940 /= 2;
            }
            if (class51.field607[98]) {
                field1032 += (12 - field1032) / 2;
            } else if (class51.field607[99]) {
                field1032 += (-12 - field1032) / 2;
            } else {
                field1032 /= 2;
            }
            field943 = class60.field716;
            field942 = class60.field704;
        }
        field939 = field940 / 2 + field939 & 0x7FF;
        field998 += field1032 / 2;
        if (field998 < 128) {
            field998 = 128;
        }
        if (field998 > 383) {
            field998 = 383;
        }
        int var4 = Statics.field2864 >> 7;
        int var5 = Statics.field284 >> 7;
        int var6 = method545(Statics.field2864, Statics.field284, Statics.field3219);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field3219;
                    if (var10 < 3 && (class62.field723[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class62.field729[var10][var8][var9];
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
        if (var12 > field947) {
            field947 += (var12 - field947) / 24;
        } else if (var12 < field947) {
            field947 += (var12 - field947) / 80;
        }
    }

    @ObfuscatedName("ek.gm(I)V")
    public static final void method2781() {
        int var0 = class95.field1414;
        int[] var1 = class95.field1424;
        for (int var2 = 0; var2 < var0; var2++) {
            class74 var3 = field1054[var1[var2]];
            if (var3 != null) {
                method1036(var3, 1);
            }
        }
    }

    @ObfuscatedName("bt.gc(Lby;IB)V")
    public static final void method1036(class78 arg0, int arg1) {
        if (arg0.field1177 > field881) {
            int var2 = arg0.field1177 - field881;
            int var3 = arg0.field1189 * 128 + arg0.field1148 * 64;
            int var4 = arg0.field1191 * 128 + arg0.field1148 * 64;
            arg0.field1149 += (var3 - arg0.field1149) / var2;
            arg0.field1198 += (var4 - arg0.field1198) / var2;
            arg0.field1205 = 0;
            arg0.field1151 = arg0.field1195;
        } else if (arg0.field1194 >= field881) {
            if (field881 == arg0.field1194 || arg0.field1192 == -1 || arg0.field1150 != 0 || arg0.field1181 + 1 > class268.method76(arg0.field1192).field3671[arg0.field1206]) {
                int var5 = arg0.field1194 - arg0.field1177;
                int var6 = field881 - arg0.field1177;
                int var7 = arg0.field1189 * 128 + arg0.field1148 * 64;
                int var8 = arg0.field1191 * 128 + arg0.field1148 * 64;
                int var9 = arg0.field1179 * 128 + arg0.field1148 * 64;
                int var10 = arg0.field1167 * 128 + arg0.field1148 * 64;
                arg0.field1149 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field1198 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field1205 = 0;
            arg0.field1151 = arg0.field1195;
            arg0.field1170 = arg0.field1151;
        } else {
            method17(arg0);
        }
        if (arg0.field1149 < 128 || arg0.field1198 < 128 || arg0.field1149 >= 13184 || arg0.field1198 >= 13184) {
            arg0.field1192 = -1;
            arg0.field1201 = -1;
            arg0.field1177 = 0;
            arg0.field1194 = 0;
            arg0.field1149 = arg0.field1187[0] * 128 + arg0.field1148 * 64;
            arg0.field1198 = arg0.field1203[0] * 128 + arg0.field1148 * 64;
            arg0.method1453();
        }
        if (Statics.field2501 == arg0 && (arg0.field1149 < 1536 || arg0.field1198 < 1536 || arg0.field1149 >= 11776 || arg0.field1198 >= 11776)) {
            arg0.field1192 = -1;
            arg0.field1201 = -1;
            arg0.field1177 = 0;
            arg0.field1194 = 0;
            arg0.field1149 = arg0.field1187[0] * 128 + arg0.field1148 * 64;
            arg0.field1198 = arg0.field1203[0] * 128 + arg0.field1148 * 64;
            arg0.method1453();
        }
        if (arg0.field1200 != 0) {
            if (arg0.field1173 != -1) {
                class78 var11 = null;
                if (arg0.field1173 < 32768) {
                    var11 = field915[arg0.field1173];
                } else if (arg0.field1173 >= 32768) {
                    var11 = field1054[arg0.field1173 - 32768];
                }
                if (var11 != null) {
                    int var12 = arg0.field1149 - var11.field1149;
                    int var13 = arg0.field1198 - var11.field1198;
                    if (var12 != 0 || var13 != 0) {
                        arg0.field1151 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1174) {
                    arg0.field1173 = -1;
                    arg0.field1174 = false;
                }
            }
            if (arg0.field1175 != -1 && (arg0.field1184 == 0 || arg0.field1205 > 0)) {
                arg0.field1151 = arg0.field1175;
                arg0.field1175 = -1;
            }
            int var14 = arg0.field1151 - arg0.field1170 & 0x7FF;
            if (var14 == 0 && arg0.field1174) {
                arg0.field1173 = -1;
                arg0.field1174 = false;
            }
            if (var14 == 0) {
                arg0.field1199 = 0;
            } else {
                arg0.field1199++;
                if (var14 > 1024) {
                    arg0.field1170 -= arg0.field1200;
                    boolean var15 = true;
                    if (var14 < arg0.field1200 || var14 > 2048 - arg0.field1200) {
                        arg0.field1170 = arg0.field1151;
                        var15 = false;
                    }
                    if (arg0.field1176 == arg0.field1152 && (arg0.field1199 > 25 || var15)) {
                        if (arg0.field1153 == -1) {
                            arg0.field1176 = arg0.field1155;
                        } else {
                            arg0.field1176 = arg0.field1153;
                        }
                    }
                } else {
                    arg0.field1170 += arg0.field1200;
                    boolean var16 = true;
                    if (var14 < arg0.field1200 || var14 > 2048 - arg0.field1200) {
                        arg0.field1170 = arg0.field1151;
                        var16 = false;
                    }
                    if (arg0.field1176 == arg0.field1152 && (arg0.field1199 > 25 || var16)) {
                        if (arg0.field1154 == -1) {
                            arg0.field1176 = arg0.field1155;
                        } else {
                            arg0.field1176 = arg0.field1154;
                        }
                    }
                }
                arg0.field1170 &= 0x7FF;
            }
        }
        Statics.method2809(arg0);
    }

    @ObfuscatedName("v.gb(Lby;B)V")
    public static final void method17(class78 arg0) {
        arg0.field1176 = arg0.field1152;
        if (arg0.field1184 == 0) {
            arg0.field1205 = 0;
            return;
        }
        if (arg0.field1192 != -1 && arg0.field1150 == 0) {
            class268 var1 = class268.method76(arg0.field1192);
            if (arg0.field1160 > 0 && var1.field3666 == 0) {
                arg0.field1205++;
                return;
            }
            if (arg0.field1160 <= 0 && var1.field3681 == 0) {
                arg0.field1205++;
                return;
            }
        }
        int var2 = arg0.field1149;
        int var3 = arg0.field1198;
        int var4 = arg0.field1187[arg0.field1184 - 1] * 128 + arg0.field1148 * 64;
        int var5 = arg0.field1203[arg0.field1184 - 1] * 128 + arg0.field1148 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1151 = 1280;
            } else if (var3 > var5) {
                arg0.field1151 = 1792;
            } else {
                arg0.field1151 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1151 = 768;
            } else if (var3 > var5) {
                arg0.field1151 = 256;
            } else {
                arg0.field1151 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1151 = 1024;
        } else if (var3 > var5) {
            arg0.field1151 = 0;
        }
        byte var6 = arg0.field1204[arg0.field1184 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1149 = var4;
            arg0.field1198 = var5;
            arg0.field1184--;
            if (arg0.field1160 > 0) {
                arg0.field1160--;
            }
            return;
        }
        int var7 = arg0.field1151 - arg0.field1170 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1156;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1155;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1158;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1157;
        }
        if (var8 == -1) {
            var8 = arg0.field1155;
        }
        arg0.field1176 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class86) {
            var10 = ((class86) arg0).field1296.field3626;
        }
        if (var10) {
            if (arg0.field1170 != arg0.field1151 && arg0.field1173 == -1 && arg0.field1200 != 0) {
                var9 = 2;
            }
            if (arg0.field1184 > 2) {
                var9 = 6;
            }
            if (arg0.field1184 > 3) {
                var9 = 8;
            }
            if (arg0.field1205 > 0 && arg0.field1184 > 1) {
                var9 = 8;
                arg0.field1205--;
            }
        } else {
            if (arg0.field1184 > 1) {
                var9 = 6;
            }
            if (arg0.field1184 > 2) {
                var9 = 8;
            }
            if (arg0.field1205 > 0 && arg0.field1184 > 1) {
                var9 = 8;
                arg0.field1205--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field1176 == arg0.field1155 && arg0.field1159 != -1) {
            arg0.field1176 = arg0.field1159;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1149 += var9;
                if (arg0.field1149 > var4) {
                    arg0.field1149 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1149 -= var9;
                if (arg0.field1149 < var4) {
                    arg0.field1149 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1198 += var9;
                if (arg0.field1198 > var5) {
                    arg0.field1198 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1198 -= var9;
                if (arg0.field1198 < var5) {
                    arg0.field1198 = var5;
                }
            }
        }
        if (arg0.field1149 == var4 && arg0.field1198 == var5) {
            arg0.field1184--;
            if (arg0.field1160 > 0) {
                arg0.field1160--;
            }
        }
    }

    @ObfuscatedName("bq.gv(I)V")
    public static void method700() {
        if (Statics.field699 != null) {
            Statics.field699.method5037(Statics.field3219, (Statics.field2501.field1149 >> 7) + Statics.field3306, (Statics.field2501.field1198 >> 7) + Statics.field2066, false);
            Statics.field699.method5051();
        }
    }

    @ObfuscatedName("gh.gu(I)I")
    public static int method3334() {
        return field1069 ? 2 : 1;
    }

    @ObfuscatedName("client.u(I)V")
    public final void method837() {
        field1068 = class183.method2932() + 500L;
        this.method1107();
        if (field1016 != -1) {
            this.method1145(true);
        }
    }

    @ObfuscatedName("client.go(S)V")
    public void method1107() {
        int var1 = Statics.field1308;
        int var2 = Statics.field674;
        if (this.field671 < var1) {
            int var3 = this.field671;
        }
        if (this.field664 < var2) {
            int var4 = this.field664;
        }
        if (Statics.field632 == null) {
            return;
        }
        try {
            client var5 = Statics.field3793;
            int var6 = field1069 ? 2 : 1;
            class53.method691(var5, "resize", new Object[] { var6 });
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.gj(B)V")
    public final void method1108() {
        if (field1016 != -1) {
            int var1 = field1016;
            if (class224.method3331(var1)) {
                method1038(Statics.field257[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field1036; var2++) {
            if (field1060[var2]) {
                field1100[var2] = true;
            }
            field1133[var2] = field1060[var2];
            field1060[var2] = false;
        }
        field1059 = field881;
        field1004 = -1;
        field1005 = -1;
        Statics.field498 = null;
        if (field1016 != -1) {
            field1036 = 0;
            method2810(field1016, 0, 0, Statics.field1308, Statics.field674, 0, 0, -1);
        }
        class291.method4855();
        if (field1072) {
            int var9 = Statics.field2452;
            int var10 = Statics.field12;
            int var11 = Statics.field416;
            int var12 = Statics.field1376;
            int var13 = 6116423;
            class291.method4819(var9, var10, var11, var12, var13);
            class291.method4819(var9 + 1, var10 + 1, var11 - 2, 16, 0);
            class291.method4797(var9 + 1, var10 + 18, var11 - 2, var12 - 19, 0);
            Statics.field1227.method4584(class233.field3084, var9 + 3, var10 + 14, var13, -1);
            int var14 = class60.field704;
            int var15 = class60.field716 * 10625923;
            for (int var16 = 0; var16 < field994; var16++) {
                int var17 = (field994 - 1 - var16) * 15 + var10 + 31;
                int var18 = 16777215;
                if (var14 > var9 && var14 < var9 + var11 && var15 > var17 - 13 && var15 < var17 + 3) {
                    var18 = 16776960;
                }
                class271 var19 = Statics.field1227;
                String var20;
                if (var16 < 0) {
                    var20 = "";
                } else if (field1000[var16].length() > 0) {
                    var20 = field999[var16] + class233.field3091 + field1000[var16];
                } else {
                    var20 = field999[var16];
                }
                var19.method4584(var20, var9 + 3, var17, var18, 0);
            }
            method3016(Statics.field2452, Statics.field12, Statics.field416, Statics.field1376);
        } else if (field1004 != -1) {
            int var3 = field1004;
            int var4 = field1005;
            if (field994 >= 2 || field1008 != 0 || field1098) {
                int var5 = field994 - 1;
                String var7;
                if (field1008 == 1 && field994 < 2) {
                    var7 = class233.field3081 + class233.field3091 + field975 + " " + class88.field1311;
                } else if (field1098 && field994 < 2) {
                    var7 = field1043 + class233.field3091 + field1014 + " " + class88.field1311;
                } else {
                    String var8;
                    if (var5 < 0) {
                        var8 = "";
                    } else if (field1000[var5].length() > 0) {
                        var8 = field999[var5] + class233.field3091 + field1000[var5];
                    } else {
                        var8 = field999[var5];
                    }
                    var7 = var8;
                }
                if (field994 > 2) {
                    var7 = var7 + class88.method3336(16777215) + " " + '/' + " " + (field994 - 2) + class233.field3085;
                }
                Statics.field1227.method4611(var7, var3 + 4, var4 + 15, 16777215, 0, field881 / 1000);
            }
        }
        if (field1058 == 3) {
            for (int var21 = 0; var21 < field1036; var21++) {
                if (field1133[var21]) {
                    class291.method4789(field1063[var21], field1064[var21], field990[var21], field1066[var21], 16711935, 128);
                } else if (field1100[var21]) {
                    class291.method4789(field1063[var21], field1064[var21], field990[var21], field1066[var21], 16711680, 128);
                }
            }
        }
        int var22 = Statics.field3219;
        int var23 = Statics.field2501.field1149;
        int var24 = Statics.field2501.field1198;
        int var25 = field993;
        for (class82 var26 = (class82) class82.field1249.method3500(); var26 != null; var26 = (class82) class82.field1249.method3511()) {
            if (var26.field1248 != -1 || var26.field1241 != null) {
                int var27 = 0;
                if (var23 > var26.field1252) {
                    var27 += var23 - var26.field1252;
                } else if (var23 < var26.field1243) {
                    var27 += var26.field1243 - var23;
                }
                if (var24 > var26.field1246) {
                    var27 += var24 - var26.field1246;
                } else if (var24 < var26.field1245) {
                    var27 += var26.field1245 - var24;
                }
                if (var27 - 64 > var26.field1247 || field1094 == 0 || var26.field1242 != var22) {
                    if (var26.field1254 != null) {
                        Statics.field822.method1806(var26.field1254);
                        var26.field1254 = null;
                    }
                    if (var26.field1251 != null) {
                        Statics.field822.method1806(var26.field1251);
                        var26.field1251 = null;
                    }
                } else {
                    var27 -= 64;
                    if (var27 < 0) {
                        var27 = 0;
                    }
                    int var28 = field1094 * (var26.field1247 - var27) / var26.field1247;
                    class105 var10000;
                    if (var26.field1254 != null) {
                        var26.field1254.method2058(var28);
                    } else if (var26.field1248 >= 0) {
                        var10000 = (class105) null;
                        class105 var29 = class105.method1863(Statics.field577, var26.field1248, 0);
                        if (var29 != null) {
                            class107 var30 = var29.method1862().method1915(Statics.field1584);
                            class117 var31 = class117.method2054(var30, 100, var28);
                            var31.method2057(-1);
                            Statics.field822.method1805(var31);
                            var26.field1254 = var31;
                        }
                    }
                    if (var26.field1251 != null) {
                        var26.field1251.method2058(var28);
                        if (!var26.field1251.method3476()) {
                            var26.field1251 = null;
                        }
                    } else if (var26.field1241 != null && (var26.field1253 -= var25) <= 0) {
                        int var32 = (int) (Math.random() * (double) var26.field1241.length);
                        var10000 = (class105) null;
                        class105 var33 = class105.method1863(Statics.field577, var26.field1241[var32], 0);
                        if (var33 != null) {
                            class107 var34 = var33.method1862().method1915(Statics.field1584);
                            class117 var35 = class117.method2054(var34, 100, var28);
                            var35.method2057(0);
                            Statics.field822.method1805(var35);
                            var26.field1251 = var35;
                            var26.field1253 = var26.field1250 + (int) (Math.random() * (double) (var26.field1244 - var26.field1250));
                        }
                    }
                }
            }
        }
        field993 = 0;
    }

    @ObfuscatedName("eb.gy(Ljava/lang/String;ZI)V")
    public static final void method2792(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field621.method4581(arg0, 250);
        int var6 = Statics.field621.method4582(arg0, 250) * 13;
        class291.method4819(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class291.method4797(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field621.method4588(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method563(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field1310.method756(0, 0);
        } else {
            method3016(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("cs.gq(IIIIZI)V")
    public static final void method1567(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1108 - field1107) * var5 / 100 + field1107;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1113) {
            short var8 = field1113;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1112) {
                var6 = field1112;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class291.method4855();
                    class291.method4819(arg0, arg1, var10, arg3, -16777216);
                    class291.method4819(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field1062) {
            short var11 = field1062;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field927) {
                var6 = field927;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class291.method4855();
                    class291.method4819(arg0, arg1, arg2, var13, -16777216);
                    class291.method4819(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1110 - field1037) * var5 / 100 + field1037;
        field1119 = arg3 * var6 * var14 / 85504 << 1;
        if (field1117 != arg2 || field1118 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class136.field1943[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class139.method2615(var15, 500, 800, arg2, arg3);
        }
        field1115 = arg0;
        field1116 = arg1;
        field1117 = arg2;
        field1118 = arg3;
    }

    @ObfuscatedName("ay.gi(B)V")
    public static void method548() {
        method8(Statics.field2501, false);
    }

    @ObfuscatedName("he.gw(I)V")
    public static void method3908() {
        int var0 = class95.field1414;
        int[] var1 = class95.field1424;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field1095 != var1[var2] && field976 != var1[var2]) {
                method8(field1054[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("z.gr(Lbw;ZS)V")
    public static void method8(class74 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1065() || arg0.field839) {
            return;
        }
        int var2 = arg0.field858 << 14;
        arg0.field842 = false;
        if ((field1111 && class95.field1414 > 50 || class95.field1414 > 200) && arg1 && arg0.field1176 == arg0.field1152) {
            arg0.field842 = true;
        }
        int var3 = arg0.field1149 >> 7;
        int var4 = arg0.field1198 >> 7;
        if (var3 < 0 || var3 >= 104 || var4 < 0 || var4 >= 104) {
            return;
        }
        if (arg0.field841 != null && field881 >= arg0.field849 && field881 < arg0.field845) {
            arg0.field842 = false;
            arg0.field843 = method545(arg0.field1149, arg0.field1198, Statics.field3219);
            Statics.field282.method2593(Statics.field3219, arg0.field1149, arg0.field1198, arg0.field843, 60, arg0, arg0.field1170, var2, arg0.field850, arg0.field851, arg0.field852, arg0.field853);
            return;
        }
        if ((arg0.field1149 & 0x7F) == 64 && (arg0.field1198 & 0x7F) == 64) {
            if (field959 == field958[var3][var4]) {
                return;
            }
            field958[var3][var4] = field959;
        }
        arg0.field843 = method545(arg0.field1149, arg0.field1198, Statics.field3219);
        Statics.field282.method2592(Statics.field3219, arg0.field1149, arg0.field1198, arg0.field843, 60, arg0, arg0.field1170, var2, arg0.field1202);
    }

    @ObfuscatedName("ao.gx(ZI)V")
    public static final void method637(boolean arg0) {
        for (int var1 = 0; var1 < field913; var1++) {
            class86 var2 = field915[field1121[var1]];
            int var3 = (field1121[var1] << 14) + 536870912;
            if (var2 != null && var2.method1065() && var2.field1296.field3639 == arg0 && var2.field1296.method4483()) {
                int var4 = var2.field1149 >> 7;
                int var5 = var2.field1198 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1148 == 1 && (var2.field1149 & 0x7F) == 64 && (var2.field1198 & 0x7F) == 64) {
                        if (field959 == field958[var4][var5]) {
                            continue;
                        }
                        field958[var4][var5] = field959;
                    }
                    if (!var2.field1296.field3628) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field282.method2592(Statics.field3219, var2.field1149, var2.field1198, method545(var2.field1149 + (var2.field1148 * 64 - 64), var2.field1198 + (var2.field1148 * 64 - 64), Statics.field3219), var2.field1148 * 64 - 64 + 60, var2, var2.field1170, var3, var2.field1202);
                }
            }
        }
    }

    @ObfuscatedName("gb.gn(I)V")
    public static final void method3277() {
        for (class93 var0 = (class93) field1045.method3500(); var0 != null; var0 = (class93) field1045.method3511()) {
            if (Statics.field3219 != var0.field1388 || field881 > var0.field1386) {
                var0.method3475();
            } else if (field881 >= var0.field1384) {
                if (var0.field1400 > 0) {
                    class86 var1 = field915[var0.field1400 - 1];
                    if (var1 != null && var1.field1149 >= 0 && var1.field1149 < 13312 && var1.field1198 >= 0 && var1.field1198 < 13312) {
                        var0.method1676(var1.field1149, var1.field1198, method545(var1.field1149, var1.field1198, var0.field1388) - var0.field1383, field881);
                    }
                }
                if (var0.field1400 < 0) {
                    int var2 = -var0.field1400 - 1;
                    class74 var3;
                    if (field976 == var2) {
                        var3 = Statics.field2501;
                    } else {
                        var3 = field1054[var2];
                    }
                    if (var3 != null && var3.field1149 >= 0 && var3.field1149 < 13312 && var3.field1198 >= 0 && var3.field1198 < 13312) {
                        var0.method1676(var3.field1149, var3.field1198, method545(var3.field1149, var3.field1198, var0.field1388) - var0.field1383, field881);
                    }
                }
                var0.method1677(field993);
                Statics.field282.method2592(Statics.field3219, (int) var0.field1390, (int) var0.field1402, (int) var0.field1392, 60, var0, var0.field1382, -1, false);
            }
        }
    }

    @ObfuscatedName("n.gl(I)V")
    public static final void method68() {
        for (class84 var0 = (class84) field1033.method3500(); var0 != null; var0 = (class84) field1033.method3511()) {
            if (Statics.field3219 != var0.field1281 || var0.field1288) {
                var0.method3475();
            } else if (field881 >= var0.field1280) {
                var0.method1594(field993);
                if (var0.field1288) {
                    var0.method3475();
                } else {
                    Statics.field282.method2592(var0.field1281, var0.field1283, var0.field1282, var0.field1284, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("l.gf(III)V")
    public static final void method50(int arg0, int arg1) {
        if (field907 == 2) {
            method469((field892 - Statics.field3306 << 7) + field1006, (field893 - Statics.field2066 << 7) + field896, field894 * 2);
            if (field960 > -1 && field881 % 20 < 10) {
                Statics.field449[0].method4903(field960 + arg0 - 12, field961 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("az.gs(Lby;IIIIII)V")
    public static final void method682(class78 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1065()) {
            return;
        }
        if (arg0 instanceof class86) {
            class266 var6 = ((class86) arg0).field1296;
            if (var6.field3644 != null) {
                var6 = var6.method4482();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class95.field1414;
        int[] var8 = class95.field1424;
        int var9 = 3;
        if (!arg0.field1172.method3456()) {
            method219(arg0, arg0.field1180 + 15);
            for (class85 var10 = (class85) arg0.field1172.method3453(); var10 != null; var10 = (class85) arg0.field1172.method3450()) {
                class79 var11 = var10.method1604(field881);
                if (var11 != null) {
                    class256 var12 = var10.field1292;
                    class295 var13 = var12.method4207();
                    class295 var14 = var12.method4206();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3444;
                    } else {
                        if (var12.field3432 * 2 < var14.field3835) {
                            var15 = var12.field3432;
                        }
                        var16 = var14.field3835 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field881 - var11.field1207;
                    int var20 = var11.field1212 * var16 / var12.field3444;
                    int var23;
                    if (var11.field1209 > var19) {
                        int var21 = var12.field3437 == 0 ? 0 : var19 / var12.field3437 * var12.field3437;
                        int var22 = var11.field1208 * var16 / var12.field3444;
                        var23 = (var20 - var22) * var21 / var11.field1209 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1209 + var12.field3441 - var19;
                        if (var12.field3439 >= 0) {
                            var17 = (var24 << 8) / (var12.field3441 - var12.field3439);
                        }
                    }
                    if (var11.field1212 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field960 + arg2 - (var16 >> 1);
                    int var26 = field961 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field960 > -1) {
                            class291.method4819(var25, var26, var23, 5, 65280);
                            class291.method4819(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3836;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method4909(var27, var26, var17);
                            class291.method4784(var27, var26, var27 + var28, var26 + var29);
                            var14.method4909(var27, var26, var17);
                        } else {
                            var13.method4903(var27, var26);
                            class291.method4784(var27, var26, var27 + var28, var26 + var29);
                            var14.method4903(var27, var26);
                        }
                        class291.method4800(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1603()) {
                    var10.method3475();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class74 var30 = (class74) arg0;
            if (var30.field839) {
                return;
            }
            if (var30.field838 != -1 || var30.field836 != -1) {
                method219(arg0, arg0.field1180 + 15);
                if (field960 > -1) {
                    if (var30.field838 != -1) {
                        Statics.field547[var30.field838].method4903(field960 + arg2 - 12, field961 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field836 != -1) {
                        Statics.field805[var30.field836].method4903(field960 + arg2 - 12, field961 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field907 == 10 && field1031 == var8[arg1]) {
                method219(arg0, arg0.field1180 + 15);
                if (field960 > -1) {
                    Statics.field449[1].method4903(field960 + arg2 - 12, field961 + arg3 - var9);
                }
            }
        } else {
            class266 var31 = ((class86) arg0).field1296;
            if (var31.field3644 != null) {
                var31 = var31.method4482();
            }
            if (var31.field3622 >= 0 && var31.field3622 < Statics.field805.length) {
                method219(arg0, arg0.field1180 + 15);
                if (field960 > -1) {
                    Statics.field805[var31.field3622].method4903(field960 + arg2 - 12, field961 + arg3 - 30);
                }
            }
            if (field907 == 1 && field926 == field1121[arg1 - var7] && field881 % 20 < 10) {
                method219(arg0, arg0.field1180 + 15);
                if (field960 > -1) {
                    Statics.field449[0].method4903(field960 + arg2 - 12, field961 + arg3 - 28);
                }
            }
        }
        if (arg0.field1193 != null && (arg1 >= var7 || !arg0.field1162 && (field1071 == 4 || !arg0.field1161 && (field1071 == 0 || field1071 == 3 || field1071 == 1 && method6(((class74) arg0).field844, false))))) {
            method219(arg0, arg0.field1180);
            if (field960 > -1 && field948 < field949) {
                field953[field948] = Statics.field1227.method4578(arg0.field1193) / 2;
                field952[field948] = Statics.field1227.field3719;
                field950[field948] = field960;
                field951[field948] = field961;
                field911[field948] = arg0.field1164;
                field955[field948] = arg0.field1165;
                field914[field948] = arg0.field1178;
                field877[field948] = arg0.field1193;
                field948++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1169[var32];
            int var34 = arg0.field1197[var32];
            class262 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field881) {
                    continue;
                }
                var35 = class262.method1012(arg0.field1197[var32]);
                var36 = var35.field3492;
                if (var35 != null && var35.field3497 != null) {
                    var35 = var35.method4318();
                    if (var35 == null) {
                        arg0.field1169[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1163[var32];
            class262 var38 = null;
            if (var37 >= 0) {
                var38 = class262.method1012(var37);
                if (var38 != null && var38.field3497 != null) {
                    var38 = var38.method4318();
                }
            }
            if (var33 - var36 <= field881) {
                if (var35 == null) {
                    arg0.field1169[var32] = -1;
                } else {
                    method219(arg0, arg0.field1180 / 2);
                    if (field960 > -1) {
                        if (var32 == 1) {
                            field961 -= 20;
                        }
                        if (var32 == 2) {
                            field960 -= 15;
                            field961 -= 10;
                        }
                        if (var32 == 3) {
                            field960 += 15;
                            field961 -= 10;
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
                        class295 var51 = null;
                        class295 var52 = null;
                        class295 var53 = null;
                        class295 var54 = null;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        class295 var64 = var35.method4309();
                        if (var64 != null) {
                            var43 = var64.field3835;
                            int var65 = var64.field3836;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3845;
                        }
                        class295 var66 = var35.method4310();
                        if (var66 != null) {
                            var44 = var66.field3835;
                            int var67 = var66.field3836;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3845;
                        }
                        class295 var68 = var35.method4311();
                        if (var68 != null) {
                            var45 = var68.field3835;
                            int var69 = var68.field3836;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3845;
                        }
                        class295 var70 = var35.method4312();
                        if (var70 != null) {
                            var46 = var70.field3835;
                            int var71 = var70.field3836;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3845;
                        }
                        if (var38 != null) {
                            var51 = var38.method4309();
                            if (var51 != null) {
                                var55 = var51.field3835;
                                int var72 = var51.field3836;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3845;
                            }
                            var52 = var38.method4310();
                            if (var52 != null) {
                                var56 = var52.field3835;
                                int var73 = var52.field3836;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3845;
                            }
                            var53 = var38.method4311();
                            if (var53 != null) {
                                var57 = var53.field3835;
                                int var74 = var53.field3836;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3845;
                            }
                            var54 = var38.method4312();
                            if (var54 != null) {
                                var58 = var54.field3835;
                                int var75 = var54.field3836;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3845;
                            }
                        }
                        class271 var76 = var35.method4313();
                        if (var76 == null) {
                            var76 = Statics.field263;
                        }
                        class271 var77;
                        if (var38 == null) {
                            var77 = Statics.field263;
                        } else {
                            var77 = var38.method4313();
                            if (var77 == null) {
                                var77 = Statics.field263;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4308(arg0.field1168[var32]);
                        int var83 = var76.method4578(var82);
                        if (var38 != null) {
                            var79 = var38.method4308(arg0.field1171[var32]);
                            var81 = var77.method4578(var79);
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
                        int var100 = arg0.field1169[var32] - field881;
                        int var101 = var35.field3479 - var35.field3479 * var100 / var35.field3492;
                        int var102 = var35.field3494 * var100 / var35.field3492 + -var35.field3494;
                        int var103 = field960 + arg2 - (var92 >> 1) + var101;
                        int var104 = field961 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3487 + var104 + 15;
                        int var108 = var107 - var76.field3705;
                        int var109 = var76.field3706 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3487 + var104 + 15;
                            int var111 = var110 - var77.field3705;
                            int var112 = var77.field3706 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3498 >= 0) {
                            var115 = (var100 << 8) / (var35.field3492 - var35.field3498);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4909(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4909(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4909(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4909(var93 + var103 - var50, var104, var115);
                            }
                            var76.method4585(var82, var90 + var103, var107, var35.field3486, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4909(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4909(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4909(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4909(var97 + var103 - var62, var104, var115);
                                }
                                var77.method4585(var79, var98 + var103, var110, var38.field3486, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method4903(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method4903(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method4903(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method4903(var93 + var103 - var50, var104);
                            }
                            var76.method4584(var82, var90 + var103, var107, var35.field3486 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4903(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method4903(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method4903(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4903(var97 + var103 - var62, var104);
                                }
                                var77.method4584(var79, var98 + var103, var110, var38.field3486 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cr.gt(I)V")
    public static final void method1736() {
        field909 = 0;
        int var0 = (Statics.field2501.field1149 >> 7) + Statics.field3306;
        int var1 = (Statics.field2501.field1198 >> 7) + Statics.field2066;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field909 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field909 = 1;
        }
        if (field909 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field909 = 0;
        }
    }

    @ObfuscatedName("f.gk(IIIII)V")
    public static final void method108(int arg0, int arg1, int arg2, int arg3) {
        if (field965 == 1) {
            Statics.field2515[field964 / 100].method4903(field1065 - 8, field963 - 8);
        }
        if (field965 == 2) {
            Statics.field2515[field964 / 100 + 4].method4903(field1065 - 8, field963 - 8);
        }
        method1736();
    }

    @ObfuscatedName("aa.ga(Lby;II)V")
    public static final void method219(class78 arg0, int arg1) {
        method469(arg0.field1149, arg0.field1198, arg1);
    }

    @ObfuscatedName("as.gz(IIII)V")
    public static final void method469(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field960 = -1;
            field961 = -1;
            return;
        }
        int var3 = method545(arg0, arg1, Statics.field3219) - arg2;
        int var4 = arg0 - Statics.field2674;
        int var5 = var3 - Statics.field694;
        int var6 = arg1 - Statics.field3806;
        int var7 = class136.field1943[Statics.field312];
        int var8 = class136.field1940[Statics.field312];
        int var9 = class136.field1943[Statics.field625];
        int var10 = class136.field1940[Statics.field625];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field960 = field1119 * var11 / var15 + field1117 / 2;
            field961 = field1119 * var14 / var15 + field1118 / 2;
        } else {
            field960 = -1;
            field961 = -1;
        }
    }

    @ObfuscatedName("an.gp(IIII)I")
    public static final int method545(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field723[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field729[var5][var3][var4] + class62.field729[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field729[var5][var3][var4 + 1] + class62.field729[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("bv.gg(IIIIIIS)V")
    public static final void method742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class136.field1943[var6];
            int var12 = class136.field1940[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class136.field1943[var7];
            int var15 = class136.field1940[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field2674 = arg0 - var8;
        Statics.field694 = arg1 - var9;
        Statics.field3806 = arg2 - var10;
        Statics.field312 = arg3;
        Statics.field625 = arg4;
    }

    @ObfuscatedName("en.ge(ZLgv;I)V")
    public static final void method2399(boolean arg0, class187 arg1) {
        field1001 = arg0;
        if (!field1001) {
            int var2 = arg1.method3179();
            int var3 = arg1.method3073();
            int var4 = arg1.method3179();
            Statics.field810 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field810[var5][var6] = arg1.method3041();
                }
            }
            Statics.field1917 = new int[var4];
            Statics.field2923 = new int[var4];
            Statics.field299 = new int[var4];
            Statics.field401 = new byte[var4][];
            Statics.field3387 = new byte[var4][];
            boolean var7 = false;
            if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
                var7 = true;
            }
            if (var3 / 8 == 48 && var2 / 8 == 148) {
                var7 = true;
            }
            int var8 = 0;
            for (int var9 = (var3 - 6) / 8; var9 <= (var3 + 6) / 8; var9++) {
                for (int var10 = (var2 - 6) / 8; var10 <= (var2 + 6) / 8; var10++) {
                    int var11 = (var9 << 8) + var10;
                    if (!var7 || var10 != 49 && var10 != 149 && var10 != 147 && var9 != 50 && (var9 != 49 || var10 != 47)) {
                        Statics.field1917[var8] = var11;
                        Statics.field2923[var8] = Statics.field2702.method3951("m" + var9 + "_" + var10);
                        Statics.field299[var8] = Statics.field2702.method3951("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method2262(var3, var2, true);
            return;
        }
        boolean var12 = arg1.method3197() == 1;
        int var13 = arg1.method3179();
        int var14 = arg1.method3075();
        int var15 = arg1.method3179();
        arg1.method3295();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3296(1);
                    if (var19 == 1) {
                        field929[var16][var17][var18] = arg1.method3296(26);
                    } else {
                        field929[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3297();
        Statics.field810 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field810[var20][var21] = arg1.method3041();
            }
        }
        Statics.field1917 = new int[var15];
        Statics.field2923 = new int[var15];
        Statics.field299 = new int[var15];
        Statics.field401 = new byte[var15][];
        Statics.field3387 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field929[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field1917[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field1917[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field2923[var22] = Statics.field2702.method3951("m" + var31 + "_" + var32);
                            Statics.field299[var22] = Statics.field2702.method3951("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method2262(var14, var13, !var12);
    }

    @ObfuscatedName("dt.hu(IIZB)V")
    public static final void method2262(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field555 == arg0 && Statics.field2160 == arg1) {
            return;
        }
        Statics.field555 = arg0;
        Statics.field2160 = arg1;
        method62(25);
        method2792(class233.field3120, true);
        int var3 = Statics.field3306;
        int var4 = Statics.field2066;
        Statics.field3306 = (arg0 - 6) * 8;
        Statics.field2066 = (arg1 - 6) * 8;
        int var5 = Statics.field3306 - var3;
        int var6 = Statics.field2066 - var4;
        int var7 = Statics.field3306;
        int var8 = Statics.field2066;
        for (int var9 = 0; var9 < 32768; var9++) {
            class86 var10 = field915[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1187[var11] -= var5;
                    var10.field1203[var11] -= var6;
                }
                var10.field1149 -= var5 * 128;
                var10.field1198 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class74 var13 = field1054[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1187[var14] -= var5;
                    var13.field1203[var14] -= var6;
                }
                var13.field1149 -= var5 * 128;
                var13.field1198 -= var6 * 128;
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
                        field985[var25][var21][var22] = field985[var25][var23][var24];
                    } else {
                        field985[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class77 var26 = (class77) field888.method3500(); var26 != null; var26 = (class77) field888.method3511()) {
            var26.field1137 -= var5;
            var26.field1142 -= var6;
            if (var26.field1137 < 0 || var26.field1142 < 0 || var26.field1137 >= 104 || var26.field1142 >= 104) {
                var26.method3475();
            }
        }
        if (field1087 != 0) {
            field1087 -= var5;
            field1088 -= var6;
        }
        field986 = 0;
        field1101 = false;
        field1082 = -1;
        field1033.method3506();
        field1045.method3506();
        for (int var27 = 0; var27 < 4; var27++) {
            field1086[var27].method2893();
        }
    }

    @ObfuscatedName("client.hc(ZB)V")
    public static final void method1448(boolean arg0) {
        method181();
        field917.field1469++;
        if (field917.field1469 < 50 && !arg0) {
            return;
        }
        field917.field1469 = 0;
        if (field919 || field917.method1785() == null) {
            return;
        }
        class171 var1 = class171.method3795(class168.field2352, field917.field1471);
        field917.method1777(var1);
        try {
            field917.method1779();
        } catch (IOException var3) {
            field919 = true;
        }
    }

    @ObfuscatedName("ck.hr(I)V")
    public static final void method1635() {
        method1448(false);
        field922 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field401.length; var1++) {
            if (Statics.field2923[var1] != -1 && Statics.field401[var1] == null) {
                Statics.field401[var1] = Statics.field2702.method3935(Statics.field2923[var1], 0);
                if (Statics.field401[var1] == null) {
                    var0 = false;
                    field922++;
                }
            }
            if (Statics.field299[var1] != -1 && Statics.field3387[var1] == null) {
                Statics.field3387[var1] = Statics.field2702.method3936(Statics.field299[var1], 0, Statics.field810[var1]);
                if (Statics.field3387[var1] == null) {
                    var0 = false;
                    field922++;
                }
            }
        }
        if (!var0) {
            field956 = 1;
            return;
        }
        field924 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field401.length; var3++) {
            byte[] var4 = Statics.field3387[var3];
            if (var4 != null) {
                int var5 = (Statics.field1917[var3] >> 8) * 64 - Statics.field3306;
                int var6 = (Statics.field1917[var3] & 0xFF) * 64 - Statics.field2066;
                if (field1001) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class181 var9 = new class181(var4);
                int var10 = -1;
                label1021: while (true) {
                    int var11 = var9.method3044();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method3044();
                            if (var16 == 0) {
                                continue label1021;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method3204() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class263 var22 = class263.method10(var10);
                                if (var19 != 22 || !field1111 || var22.field3519 != 0 || var22.field3525 == 1 || var22.field3531) {
                                    if (!var22.method4386()) {
                                        field924++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method3044();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method3204();
                    }
                }
            }
        }
        if (!var2) {
            field956 = 2;
            return;
        }
        if (field956 != 0) {
            method2792(class233.field3120 + class88.field1320 + class88.field1314 + 100 + "%" + class88.field1315, true);
        }
        method181();
        method3917();
        method181();
        Statics.field282.method2581();
        method181();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field1086[var23].method2893();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class62.field723[var24][var25][var26] = 0;
                }
            }
        }
        method181();
        class62.method467();
        int var27 = Statics.field401.length;
        class82.method1020();
        method1448(true);
        if (!field1001) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field1917[var28] >> 8) * 64 - Statics.field3306;
                int var30 = (Statics.field1917[var28] & 0xFF) * 64 - Statics.field2066;
                byte[] var31 = Statics.field401[var28];
                if (var31 != null) {
                    method181();
                    class62.method1451(var31, var29, var30, Statics.field555 * 8 - 48, Statics.field2160 * 8 - 48, field1086);
                }
            }
            for (int var32 = 0; var32 < var27; var32++) {
                int var33 = (Statics.field1917[var32] >> 8) * 64 - Statics.field3306;
                int var34 = (Statics.field1917[var32] & 0xFF) * 64 - Statics.field2066;
                byte[] var35 = Statics.field401[var32];
                if (var35 == null && Statics.field2160 < 800) {
                    method181();
                    class62.method24(var33, var34, 64, 64);
                }
            }
            method1448(true);
            for (int var36 = 0; var36 < var27; var36++) {
                byte[] var37 = Statics.field3387[var36];
                if (var37 != null) {
                    int var38 = (Statics.field1917[var36] >> 8) * 64 - Statics.field3306;
                    int var39 = (Statics.field1917[var36] & 0xFF) * 64 - Statics.field2066;
                    method181();
                    class62.method913(var37, var38, var39, Statics.field282, field1086);
                }
            }
        }
        if (field1001) {
            for (int var40 = 0; var40 < 4; var40++) {
                method181();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        boolean var43 = false;
                        int var44 = field929[var40][var41][var42];
                        if (var44 != -1) {
                            int var45 = var44 >> 24 & 0x3;
                            int var46 = var44 >> 1 & 0x3;
                            int var47 = var44 >> 14 & 0x3FF;
                            int var48 = var44 >> 3 & 0x7FF;
                            int var49 = (var47 / 8 << 8) + var48 / 8;
                            for (int var50 = 0; var50 < Statics.field1917.length; var50++) {
                                if (Statics.field1917[var50] == var49 && Statics.field401[var50] != null) {
                                    class62.method3844(Statics.field401[var50], var40, var41 * 8, var42 * 8, var45, (var47 & 0x7) * 8, (var48 & 0x7) * 8, var46, field1086);
                                    var43 = true;
                                    break;
                                }
                            }
                        }
                        if (!var43) {
                            class62.method4131(var40, var41 * 8, var42 * 8);
                        }
                    }
                }
            }
            for (int var51 = 0; var51 < 13; var51++) {
                for (int var52 = 0; var52 < 13; var52++) {
                    int var53 = field929[0][var51][var52];
                    if (var53 == -1) {
                        class62.method24(var51 * 8, var52 * 8, 8, 8);
                    }
                }
            }
            method1448(true);
            for (int var54 = 0; var54 < 4; var54++) {
                method181();
                for (int var55 = 0; var55 < 13; var55++) {
                    label896: for (int var56 = 0; var56 < 13; var56++) {
                        int var57 = field929[var54][var55][var56];
                        if (var57 != -1) {
                            int var58 = var57 >> 24 & 0x3;
                            int var59 = var57 >> 1 & 0x3;
                            int var60 = var57 >> 14 & 0x3FF;
                            int var61 = var57 >> 3 & 0x7FF;
                            int var62 = (var60 / 8 << 8) + var61 / 8;
                            for (int var63 = 0; var63 < Statics.field1917.length; var63++) {
                                if (Statics.field1917[var63] == var62 && Statics.field3387[var63] != null) {
                                    byte[] var64 = Statics.field3387[var63];
                                    int var65 = var55 * 8;
                                    int var66 = var56 * 8;
                                    int var67 = (var60 & 0x7) * 8;
                                    int var68 = (var61 & 0x7) * 8;
                                    class139 var69 = Statics.field282;
                                    class163[] var70 = field1086;
                                    class181 var71 = new class181(var64);
                                    int var72 = -1;
                                    while (true) {
                                        int var73 = var71.method3044();
                                        if (var73 == 0) {
                                            continue label896;
                                        }
                                        var72 += var73;
                                        int var74 = 0;
                                        while (true) {
                                            int var75 = var71.method3044();
                                            if (var75 == 0) {
                                                break;
                                            }
                                            var74 += var75 - 1;
                                            int var76 = var74 & 0x3F;
                                            int var77 = var74 >> 6 & 0x3F;
                                            int var78 = var74 >> 12;
                                            int var79 = var71.method3204();
                                            int var80 = var79 >> 2;
                                            int var81 = var79 & 0x3;
                                            if (var58 == var78 && var77 >= var67 && var77 < var67 + 8 && var76 >= var68 && var76 < var68 + 8) {
                                                class263 var82 = class263.method10(var72);
                                                int var84 = var77 & 0x7;
                                                int var85 = var76 & 0x7;
                                                int var87 = var82.field3550;
                                                int var88 = var82.field3508;
                                                if ((var81 & 0x1) == 1) {
                                                    int var89 = var87;
                                                    var87 = var88;
                                                    var88 = var89;
                                                }
                                                int var90 = var59 & 0x3;
                                                int var91;
                                                if (var90 == 0) {
                                                    var91 = var84;
                                                } else if (var90 == 1) {
                                                    var91 = var85;
                                                } else if (var90 == 2) {
                                                    var91 = 7 - var84 - (var87 - 1);
                                                } else {
                                                    var91 = 7 - var85 - (var88 - 1);
                                                }
                                                int var92 = var65 + var91;
                                                int var93 = var66 + class223.method2023(var77 & 0x7, var76 & 0x7, var59, var82.field3550, var82.field3508, var81);
                                                if (var92 > 0 && var93 > 0 && var92 < 103 && var93 < 103) {
                                                    int var94 = var54;
                                                    if ((class62.field723[1][var92][var93] & 0x2) == 2) {
                                                        var94 = var54 - 1;
                                                    }
                                                    class163 var95 = null;
                                                    if (var94 >= 0) {
                                                        var95 = var70[var94];
                                                    }
                                                    class62.method1019(var54, var92, var93, var72, var59 + var81 & 0x3, var80, var69, var95);
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
        method1448(true);
        method3917();
        method181();
        class139 var96 = Statics.field282;
        class163[] var97 = field1086;
        for (int var98 = 0; var98 < 4; var98++) {
            for (int var99 = 0; var99 < 104; var99++) {
                for (int var100 = 0; var100 < 104; var100++) {
                    if ((class62.field723[var98][var99][var100] & 0x1) == 1) {
                        int var101 = var98;
                        if ((class62.field723[1][var99][var100] & 0x2) == 2) {
                            var101 = var98 - 1;
                        }
                        if (var101 >= 0) {
                            var97[var101].method2902(var99, var100);
                        }
                    }
                }
            }
        }
        class62.field735 += (int) (Math.random() * 5.0D) - 2;
        if (class62.field735 < -8) {
            class62.field735 = -8;
        }
        if (class62.field735 > 8) {
            class62.field735 = 8;
        }
        class62.field726 += (int) (Math.random() * 5.0D) - 2;
        if (class62.field726 < -16) {
            class62.field726 = -16;
        }
        if (class62.field726 > 16) {
            class62.field726 = 16;
        }
        for (int var102 = 0; var102 < 4; var102++) {
            byte[][] var103 = Statics.field746[var102];
            int var104 = (int) Math.sqrt(5100.0D);
            int var105 = var104 * 768 >> 8;
            for (int var106 = 1; var106 < 103; var106++) {
                for (int var107 = 1; var107 < 103; var107++) {
                    int var108 = class62.field729[var102][var107 + 1][var106] - class62.field729[var102][var107 - 1][var106];
                    int var109 = class62.field729[var102][var107][var106 + 1] - class62.field729[var102][var107][var106 - 1];
                    int var110 = (int) Math.sqrt((double) (var109 * var109 + var108 * var108 + 65536));
                    int var111 = (var108 << 8) / var110;
                    int var112 = 65536 / var110;
                    int var113 = (var109 << 8) / var110;
                    int var114 = (var113 * -50 + var111 * -50 + var112 * -10) / var105 + 96;
                    int var115 = (var103[var107][var106] >> 1) + (var103[var107][var106 + 1] >> 3) + (var103[var107][var106 - 1] >> 2) + (var103[var107 - 1][var106] >> 2) + (var103[var107 + 1][var106] >> 3);
                    Statics.field728[var107][var106] = var114 - var115;
                }
            }
            for (int var116 = 0; var116 < 104; var116++) {
                Statics.field288[var116] = 0;
                Statics.field546[var116] = 0;
                Statics.field301[var116] = 0;
                Statics.field3261[var116] = 0;
                Statics.field2045[var116] = 0;
            }
            for (int var117 = -5; var117 < 109; var117++) {
                for (int var118 = 0; var118 < 104; var118++) {
                    int var119 = var117 + 5;
                    int var10002;
                    if (var119 >= 0 && var119 < 104) {
                        int var120 = Statics.field725[var102][var119][var118] & 0xFF;
                        if (var120 > 0) {
                            class254 var121 = class254.method1000(var120 - 1);
                            Statics.field288[var118] += var121.field3412;
                            Statics.field546[var118] += var121.field3413;
                            Statics.field301[var118] += var121.field3414;
                            Statics.field3261[var118] += var121.field3415;
                            var10002 = Statics.field2045[var118]++;
                        }
                    }
                    int var122 = var117 - 5;
                    if (var122 >= 0 && var122 < 104) {
                        int var123 = Statics.field725[var102][var122][var118] & 0xFF;
                        if (var123 > 0) {
                            class254 var124 = class254.method1000(var123 - 1);
                            Statics.field288[var118] -= var124.field3412;
                            Statics.field546[var118] -= var124.field3413;
                            Statics.field301[var118] -= var124.field3414;
                            Statics.field3261[var118] -= var124.field3415;
                            var10002 = Statics.field2045[var118]--;
                        }
                    }
                }
                if (var117 >= 1 && var117 < 103) {
                    int var125 = 0;
                    int var126 = 0;
                    int var127 = 0;
                    int var128 = 0;
                    int var129 = 0;
                    for (int var130 = -5; var130 < 109; var130++) {
                        int var131 = var130 + 5;
                        if (var131 >= 0 && var131 < 104) {
                            var125 += Statics.field288[var131];
                            var126 += Statics.field546[var131];
                            var127 += Statics.field301[var131];
                            var128 += Statics.field3261[var131];
                            var129 += Statics.field2045[var131];
                        }
                        int var132 = var130 - 5;
                        if (var132 >= 0 && var132 < 104) {
                            var125 -= Statics.field288[var132];
                            var126 -= Statics.field546[var132];
                            var127 -= Statics.field301[var132];
                            var128 -= Statics.field3261[var132];
                            var129 -= Statics.field2045[var132];
                        }
                        if (var130 >= 1 && var130 < 103 && (!field1111 || (class62.field723[0][var117][var130] & 0x2) != 0 || (class62.field723[var102][var117][var130] & 0x10) == 0)) {
                            if (var102 < class62.field736) {
                                class62.field736 = var102;
                            }
                            int var133 = Statics.field725[var102][var117][var130] & 0xFF;
                            int var134 = Statics.field737[var102][var117][var130] & 0xFF;
                            if (var133 > 0 || var134 > 0) {
                                int var135 = class62.field729[var102][var117][var130];
                                int var136 = class62.field729[var102][var117 + 1][var130];
                                int var137 = class62.field729[var102][var117 + 1][var130 + 1];
                                int var138 = class62.field729[var102][var117][var130 + 1];
                                int var139 = Statics.field728[var117][var130];
                                int var140 = Statics.field728[var117 + 1][var130];
                                int var141 = Statics.field728[var117 + 1][var130 + 1];
                                int var142 = Statics.field728[var117][var130 + 1];
                                int var143 = -1;
                                int var144 = -1;
                                if (var133 > 0) {
                                    int var145 = var125 * 256 / var128;
                                    int var146 = var126 / var129;
                                    int var147 = var127 / var129;
                                    var143 = class62.method1775(var145, var146, var147);
                                    int var148 = class62.field735 + var145 & 0xFF;
                                    int var149 = class62.field726 + var147;
                                    if (var149 < 0) {
                                        var149 = 0;
                                    } else if (var149 > 255) {
                                        var149 = 255;
                                    }
                                    var144 = class62.method1775(var148, var146, var149);
                                }
                                if (var102 > 0) {
                                    boolean var150 = true;
                                    if (var133 == 0 && Statics.field482[var102][var117][var130] != 0) {
                                        var150 = false;
                                    }
                                    if (var134 > 0 && !class267.method517(var134 - 1).field3658) {
                                        var150 = false;
                                    }
                                    if (var150 && var135 == var136 && var135 == var137 && var135 == var138) {
                                        Statics.field243[var102][var117][var130] |= 0x924;
                                    }
                                }
                                int var151 = 0;
                                if (var144 != -1) {
                                    var151 = class136.field1941[class62.method1467(var144, 96)];
                                }
                                if (var134 == 0) {
                                    var96.method2586(var102, var117, var130, 0, 0, -1, var135, var136, var137, var138, class62.method1467(var143, var139), class62.method1467(var143, var140), class62.method1467(var143, var141), class62.method1467(var143, var142), 0, 0, 0, 0, var151, 0);
                                } else {
                                    int var152 = Statics.field482[var102][var117][var130] + 1;
                                    byte var153 = Statics.field727[var102][var117][var130];
                                    class267 var154 = class267.method517(var134 - 1);
                                    int var155 = var154.field3664;
                                    int var156;
                                    int var157;
                                    if (var155 >= 0) {
                                        var156 = Statics.field1933.method2280(var155);
                                        var157 = -1;
                                    } else if (var154.field3654 == 16711935) {
                                        var157 = -2;
                                        var155 = -1;
                                        var156 = -2;
                                    } else {
                                        var157 = class62.method1775(var154.field3652, var154.field3659, var154.field3660);
                                        int var158 = class62.field735 + var154.field3652 & 0xFF;
                                        int var159 = class62.field726 + var154.field3660;
                                        if (var159 < 0) {
                                            var159 = 0;
                                        } else if (var159 > 255) {
                                            var159 = 255;
                                        }
                                        var156 = class62.method1775(var158, var154.field3659, var159);
                                    }
                                    int var160 = 0;
                                    if (var156 != -2) {
                                        var160 = class136.field1941[Statics.method1551(var156, 96)];
                                    }
                                    if (var154.field3657 != -1) {
                                        int var161 = class62.field735 + var154.field3661 & 0xFF;
                                        int var162 = class62.field726 + var154.field3655;
                                        if (var162 < 0) {
                                            var162 = 0;
                                        } else if (var162 > 255) {
                                            var162 = 255;
                                        }
                                        int var163 = class62.method1775(var161, var154.field3662, var162);
                                        var160 = class136.field1941[Statics.method1551(var163, 96)];
                                    }
                                    var96.method2586(var102, var117, var130, var152, var153, var155, var135, var136, var137, var138, class62.method1467(var143, var139), class62.method1467(var143, var140), class62.method1467(var143, var141), class62.method1467(var143, var142), Statics.method1551(var157, var139), Statics.method1551(var157, var140), Statics.method1551(var157, var141), Statics.method1551(var157, var142), var151, var160);
                                }
                            }
                        }
                    }
                }
            }
            for (int var164 = 1; var164 < 103; var164++) {
                for (int var165 = 1; var165 < 103; var165++) {
                    var96.method2585(var102, var165, var164, class62.method52(var102, var165, var164));
                }
            }
            Statics.field725[var102] = (byte[][]) null;
            Statics.field737[var102] = (byte[][]) null;
            Statics.field482[var102] = (byte[][]) null;
            Statics.field727[var102] = (byte[][]) null;
            Statics.field746[var102] = (byte[][]) null;
        }
        var96.method2612(-50, -10, -50);
        for (int var166 = 0; var166 < 104; var166++) {
            for (int var167 = 0; var167 < 104; var167++) {
                if ((class62.field723[1][var166][var167] & 0x2) == 2) {
                    var96.method2583(var166, var167);
                }
            }
        }
        int var168 = 1;
        int var169 = 2;
        int var170 = 4;
        for (int var171 = 0; var171 < 4; var171++) {
            if (var171 > 0) {
                var168 <<= 0x3;
                var169 <<= 0x3;
                var170 <<= 0x3;
            }
            for (int var172 = 0; var172 <= var171; var172++) {
                for (int var173 = 0; var173 <= 104; var173++) {
                    for (int var174 = 0; var174 <= 104; var174++) {
                        if ((Statics.field243[var172][var174][var173] & var168) != 0) {
                            int var175 = var173;
                            int var176 = var173;
                            int var177 = var172;
                            int var178 = var172;
                            while (var175 > 0 && (Statics.field243[var172][var174][var175 - 1] & var168) != 0) {
                                var175--;
                            }
                            while (var176 < 104 && (Statics.field243[var172][var174][var176 + 1] & var168) != 0) {
                                var176++;
                            }
                            label631: while (var177 > 0) {
                                for (int var179 = var175; var179 <= var176; var179++) {
                                    if ((Statics.field243[var177 - 1][var174][var179] & var168) == 0) {
                                        break label631;
                                    }
                                }
                                var177--;
                            }
                            label620: while (var178 < var171) {
                                for (int var180 = var175; var180 <= var176; var180++) {
                                    if ((Statics.field243[var178 + 1][var174][var180] & var168) == 0) {
                                        break label620;
                                    }
                                }
                                var178++;
                            }
                            int var181 = (var178 + 1 - var177) * (var176 - var175 + 1);
                            if (var181 >= 8) {
                                short var182 = 240;
                                int var183 = class62.field729[var178][var174][var175] - var182;
                                int var184 = class62.field729[var177][var174][var175];
                                class139.method2584(var171, 1, var174 * 128, var174 * 128, var175 * 128, var176 * 128 + 128, var183, var184);
                                for (int var185 = var177; var185 <= var178; var185++) {
                                    for (int var186 = var175; var186 <= var176; var186++) {
                                        Statics.field243[var185][var174][var186] &= ~var168;
                                    }
                                }
                            }
                        }
                        if ((Statics.field243[var172][var174][var173] & var169) != 0) {
                            int var187 = var174;
                            int var188 = var174;
                            int var189 = var172;
                            int var190 = var172;
                            while (var187 > 0 && (Statics.field243[var172][var187 - 1][var173] & var169) != 0) {
                                var187--;
                            }
                            while (var188 < 104 && (Statics.field243[var172][var188 + 1][var173] & var169) != 0) {
                                var188++;
                            }
                            label684: while (var189 > 0) {
                                for (int var191 = var187; var191 <= var188; var191++) {
                                    if ((Statics.field243[var189 - 1][var191][var173] & var169) == 0) {
                                        break label684;
                                    }
                                }
                                var189--;
                            }
                            label673: while (var190 < var171) {
                                for (int var192 = var187; var192 <= var188; var192++) {
                                    if ((Statics.field243[var190 + 1][var192][var173] & var169) == 0) {
                                        break label673;
                                    }
                                }
                                var190++;
                            }
                            int var193 = (var190 + 1 - var189) * (var188 - var187 + 1);
                            if (var193 >= 8) {
                                short var194 = 240;
                                int var195 = class62.field729[var190][var187][var173] - var194;
                                int var196 = class62.field729[var189][var187][var173];
                                class139.method2584(var171, 2, var187 * 128, var188 * 128 + 128, var173 * 128, var173 * 128, var195, var196);
                                for (int var197 = var189; var197 <= var190; var197++) {
                                    for (int var198 = var187; var198 <= var188; var198++) {
                                        Statics.field243[var197][var198][var173] &= ~var169;
                                    }
                                }
                            }
                        }
                        if ((Statics.field243[var172][var174][var173] & var170) != 0) {
                            int var199 = var174;
                            int var200 = var174;
                            int var201 = var173;
                            int var202 = var173;
                            while (var201 > 0 && (Statics.field243[var172][var174][var201 - 1] & var170) != 0) {
                                var201--;
                            }
                            while (var202 < 104 && (Statics.field243[var172][var174][var202 + 1] & var170) != 0) {
                                var202++;
                            }
                            label737: while (var199 > 0) {
                                for (int var203 = var201; var203 <= var202; var203++) {
                                    if ((Statics.field243[var172][var199 - 1][var203] & var170) == 0) {
                                        break label737;
                                    }
                                }
                                var199--;
                            }
                            label726: while (var200 < 104) {
                                for (int var204 = var201; var204 <= var202; var204++) {
                                    if ((Statics.field243[var172][var200 + 1][var204] & var170) == 0) {
                                        break label726;
                                    }
                                }
                                var200++;
                            }
                            if ((var200 - var199 + 1) * (var202 - var201 + 1) >= 4) {
                                int var205 = class62.field729[var172][var199][var201];
                                class139.method2584(var171, 4, var199 * 128, var200 * 128 + 128, var201 * 128, var202 * 128 + 128, var205, var205);
                                for (int var206 = var199; var206 <= var200; var206++) {
                                    for (int var207 = var201; var207 <= var202; var207++) {
                                        Statics.field243[var172][var206][var207] &= ~var170;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method1448(true);
        int var208 = class62.field736;
        if (var208 > Statics.field3219) {
            var208 = Statics.field3219;
        }
        if (var208 < Statics.field3219 - 1) {
            int var209 = Statics.field3219 - 1;
        }
        if (field1111) {
            Statics.field282.method2582(class62.field736);
        } else {
            Statics.field282.method2582(0);
        }
        for (int var210 = 0; var210 < 104; var210++) {
            for (int var211 = 0; var211 < 104; var211++) {
                method2768(var210, var211);
            }
        }
        method181();
        for (class77 var212 = (class77) field888.method3500(); var212 != null; var212 = (class77) field888.method3511()) {
            if (var212.field1146 == -1) {
                var212.field1145 = 0;
                method19(var212);
            } else {
                var212.method3475();
            }
        }
        class263.field3503.method3422();
        if (Statics.field3793.method791()) {
            class171 var213 = class171.method3795(class168.field2385, field917.field1471);
            var213.field2423.method3149(1057001181);
            field917.method1777(var213);
        }
        if (!field1001) {
            int var214 = (Statics.field555 - 6) / 8;
            int var215 = (Statics.field555 + 6) / 8;
            int var216 = (Statics.field2160 - 6) / 8;
            int var217 = (Statics.field2160 + 6) / 8;
            for (int var218 = var214 - 1; var218 <= var215 + 1; var218++) {
                for (int var219 = var216 - 1; var219 <= var217 + 1; var219++) {
                    if (var218 < var214 || var218 > var215 || var219 < var216 || var219 > var217) {
                        Statics.field2702.method3957("m" + var218 + "_" + var219);
                        Statics.field2702.method3957("l" + var218 + "_" + var219);
                    }
                }
            }
        }
        method62(30);
        method181();
        class62.method672();
        class171 var220 = class171.method3795(class168.field2319, field917.field1471);
        field917.method1777(var220);
        Statics.field1295.method2803();
        for (int var221 = 0; var221 < 32; var221++) {
            field668[var221] = 0L;
        }
        for (int var222 = 0; var222 < 32; var222++) {
            field669[var222] = 0L;
        }
        Statics.field682 = 0;
    }

    @ObfuscatedName("av.hf(IS)V")
    public static final void method647(int arg0) {
        int[] var1 = Statics.field13.field3841;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class62.field723[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field282.method2711(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class62.field723[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field282.method2711(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field13.method4920();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class62.field723[arg0][var10][var9] & 0x18) == 0) {
                    method1675(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class62.field723[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method1675(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1025 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field282.method2610(Statics.field3219, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class263.method10(var14).field3528;
                    if (var15 >= 0) {
                        field1018[field1025] = Statics.field3365[var15].method4118(false);
                        field995[field1025] = var11;
                        field1085[field1025] = var12;
                        field1025++;
                    }
                }
            }
        }
        Statics.field1310.method4868();
    }

    @ObfuscatedName("cq.ha(IIIIII)V")
    public static final void method1675(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field282.method2607(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field282.method2611(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field13.field3841;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class263 var13 = class263.method10(var12);
            if (var13.field3529 == -1) {
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
                class294 var14 = Statics.field2910[var13.field3529];
                if (var14 != null) {
                    int var15 = (var13.field3550 * 4 - var14.field3827) / 2;
                    int var16 = (var13.field3508 * 4 - var14.field3831) / 2;
                    var14.method4880(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3508) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field282.method2609(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field282.method2611(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class263 var22 = class263.method10(var21);
            if (var22.field3529 != -1) {
                class294 var23 = Statics.field2910[var22.field3529];
                if (var23 != null) {
                    int var24 = (var22.field3550 * 4 - var23.field3827) / 2;
                    int var25 = (var22.field3508 * 4 - var23.field3831) / 2;
                    var23.method4880(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3508) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field13.field3841;
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
        int var29 = Statics.field282.method2610(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class263 var31 = class263.method10(var30);
        if (var31.field3529 == -1) {
            return;
        }
        class294 var32 = Statics.field2910[var31.field3529];
        if (var32 != null) {
            int var33 = (var31.field3550 * 4 - var32.field3827) / 2;
            int var34 = (var31.field3508 * 4 - var32.field3831) / 2;
            var32.method4880(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3508) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.hj(Lct;I)Z")
    public final boolean method1245(class101 arg0) {
        class161 var2 = arg0.method1785();
        class187 var3 = arg0.field1466;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1472 == null) {
                if (arg0.field1474) {
                    if (!var2.method2863(1)) {
                        return false;
                    }
                    var2.method2864(arg0.field1466.field2496, 0, 1);
                    arg0.field1475 = 0;
                    arg0.field1474 = false;
                }
                var3.field2498 = 0;
                if (var3.method3293()) {
                    if (!var2.method2863(1)) {
                        return false;
                    }
                    var2.method2864(arg0.field1466.field2496, 1, 1);
                    arg0.field1475 = 0;
                }
                arg0.field1474 = true;
                class167[] var4 = new class167[] { class167.field2265, class167.field2231, class167.field2222, class167.field2294, class167.field2223, class167.field2225, class167.field2276, class167.field2227, class167.field2228, class167.field2229, class167.field2230, class167.field2283, class167.field2266, class167.field2242, class167.field2270, class167.field2235, class167.field2269, class167.field2237, class167.field2238, class167.field2239, class167.field2240, class167.field2241, class167.field2261, class167.field2243, class167.field2244, class167.field2232, class167.field2246, class167.field2247, class167.field2248, class167.field2233, class167.field2250, class167.field2251, class167.field2252, class167.field2253, class167.field2263, class167.field2255, class167.field2256, class167.field2245, class167.field2259, class167.field2234, class167.field2260, class167.field2287, class167.field2262, class167.field2220, class167.field2264, class167.field2302, class167.field2224, class167.field2267, class167.field2268, class167.field2236, class167.field2273, class167.field2271, class167.field2272, class167.field2277, class167.field2274, class167.field2275, class167.field2257, class167.field2249, class167.field2278, class167.field2279, class167.field2280, class167.field2281, class167.field2282, class167.field2291, class167.field2284, class167.field2285, class167.field2286, class167.field2258, class167.field2288, class167.field2289, class167.field2226, class167.field2290, class167.field2292, class167.field2293, class167.field2254, class167.field2295, class167.field2296, class167.field2297, class167.field2298, class167.field2299, class167.field2300 };
                int var6 = var3.method3294();
                if (var6 < 0 || var6 >= var4.length) {
                    throw new IOException(var6 + " " + var3.field2498);
                }
                arg0.field1472 = var4[var6];
                arg0.field1473 = arg0.field1472.field2221;
            }
            if (arg0.field1473 == -1) {
                if (!var2.method2863(1)) {
                    return false;
                }
                arg0.method1785().method2864(var3.field2496, 0, 1);
                arg0.field1473 = var3.field2496[0] & 0xFF;
            }
            if (arg0.field1473 == -2) {
                if (!var2.method2863(2)) {
                    return false;
                }
                arg0.method1785().method2864(var3.field2496, 0, 2);
                var3.field2498 = 0;
                arg0.field1473 = var3.method3179();
            }
            if (!var2.method2863(arg0.field1473)) {
                return false;
            }
            var3.field2498 = 0;
            var2.method2864(var3.field2496, 0, arg0.field1473);
            arg0.field1475 = 0;
            field920.method4740();
            arg0.field1479 = arg0.field1476;
            arg0.field1476 = arg0.field1477;
            arg0.field1477 = arg0.field1472;
            if (class167.field2274 == arg0.field1472) {
                method1056(class170.field2409);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2278 == arg0.field1472) {
                field932 = var3.method3073() * 30;
                field1052 = field882;
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2260 == arg0.field1472) {
                field1049 = field882;
                if (arg0.field1473 == 0) {
                    field1131 = null;
                    field1081 = null;
                    Statics.field733 = 0;
                    Statics.field2537 = null;
                    arg0.field1472 = null;
                    return true;
                }
                field1081 = var3.method3045();
                long var7 = var3.method3134();
                field1131 = class276.method4178(var7);
                Statics.field721 = var3.method3236();
                int var9 = var3.method3204();
                if (var9 == 255) {
                    arg0.field1472 = null;
                    return true;
                }
                Statics.field733 = var9;
                class76[] var10 = new class76[100];
                for (int var11 = 0; var11 < Statics.field733; var11++) {
                    var10[var11] = new class76();
                    var10[var11].field871 = var3.method3045();
                    var10[var11].field868 = class275.method1598(var10[var11].field871, Statics.field3240);
                    var10[var11].field867 = var3.method3179();
                    var10[var11].field869 = var3.method3236();
                    var3.method3045();
                    if (var10[var11].field871.equals(Statics.field2501.field844)) {
                        Statics.field283 = var10[var11].field869;
                    }
                }
                boolean var12 = false;
                int var13 = Statics.field733;
                while (var13 > 0) {
                    boolean var14 = true;
                    var13--;
                    for (int var15 = 0; var15 < var13; var15++) {
                        if (var10[var15].field868.compareTo(var10[var15 + 1].field868) > 0) {
                            class76 var16 = var10[var15];
                            var10[var15] = var10[var15 + 1];
                            var10[var15 + 1] = var16;
                            var14 = false;
                        }
                    }
                    if (var14) {
                        break;
                    }
                }
                Statics.field2537 = var10;
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2297 == arg0.field1472) {
                int var17 = var3.method3019();
                int var18 = var3.method3077();
                int var19 = var3.method3077();
                class224 var20 = class224.method1627(var17);
                if (var20.field2734 != var18 || var20.field2735 != var19 || var20.field2789 != 0 || var20.field2731 != 0) {
                    var20.field2734 = var18;
                    var20.field2735 = var19;
                    var20.field2789 = 0;
                    var20.field2731 = 0;
                    method503(var20);
                    this.method1114(var20);
                    if (var20.field2727 == 0) {
                        method4517(Statics.field257[var17 >> 16], var20, false);
                    }
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2225 == arg0.field1472) {
                int var21 = var3.method3041();
                int var22 = var3.method3041();
                int var23 = 0;
                if (Statics.field3280 == null || !Statics.field3280.isValid()) {
                    try {
                        Iterator var24 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var24.hasNext()) {
                            GarbageCollectorMXBean var25 = (GarbageCollectorMXBean) var24.next();
                            if (var25.isValid()) {
                                Statics.field3280 = var25;
                                field692 = -1L;
                                field659 = -1L;
                            }
                        }
                    } catch (Throwable var295) {
                    }
                }
                if (Statics.field3280 != null) {
                    long var27 = class183.method2932();
                    long var29 = Statics.field3280.getCollectionTime();
                    if (field659 != -1L) {
                        long var31 = var29 - field659;
                        long var33 = var27 - field692;
                        if (var33 != 0L) {
                            var23 = (int) (var31 * 100L / var33);
                        }
                    }
                    field659 = var29;
                    field692 = var27;
                }
                class171 var37 = class171.method3795(class168.field2323, field917.field1471);
                var37.field2423.method3062(var23);
                var37.field2423.method3105(var21);
                var37.field2423.method3140(var22);
                var37.field2423.method3062(field667);
                field917.method1777(var37);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2272 == arg0.field1472) {
                method1056(class170.field2413);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2229 == arg0.field1472) {
                String var38 = var3.method3045();
                Statics.field1240 = var38;
                try {
                    String var39 = Statics.field3793.getParameter(class283.field3767.field3763);
                    String var40 = Statics.field3793.getParameter(class283.field3756.field3763);
                    String var41 = var39 + "settings=" + var38 + "; version=1; path=/; domain=" + var40;
                    String var42;
                    if (var38.length() == 0) {
                        var42 = var41 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var43 = var41 + "; Expires=";
                        long var44 = class183.method2932() + 94608000000L;
                        class190.field2538.setTime(new Date(var44));
                        int var46 = class190.field2538.get(7);
                        int var47 = class190.field2538.get(5);
                        int var48 = class190.field2538.get(2);
                        int var49 = class190.field2538.get(1);
                        int var50 = class190.field2538.get(11);
                        int var51 = class190.field2538.get(12);
                        int var52 = class190.field2538.get(13);
                        String var53 = class190.field2540[var46 - 1] + ", " + var47 / 10 + var47 % 10 + "-" + class190.field2539[0][var48] + "-" + var49 + " " + var50 / 10 + var50 % 10 + ":" + var51 / 10 + var51 % 10 + ":" + var52 / 10 + var52 % 10 + " GMT";
                        var42 = var43 + var53 + "; Max-Age=" + 94608000L;
                    }
                    client var54 = Statics.field3793;
                    String var55 = "document.cookie=\"" + var42 + "\"";
                    JSObject.getWindow(var54).eval(var55);
                } catch (Throwable var294) {
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2256 == arg0.field1472) {
                while (var3.field2498 < arg0.field1473) {
                    boolean var57 = var3.method3204() == 1;
                    String var58 = var3.method3045();
                    String var59 = var3.method3045();
                    int var60 = var3.method3179();
                    int var61 = var3.method3204();
                    int var62 = var3.method3204();
                    boolean var63 = (var62 & 0x2) != 0;
                    boolean var64 = (var62 & 0x1) != 0;
                    if (var60 > 0) {
                        var3.method3045();
                        var3.method3204();
                        var3.method3041();
                    }
                    var3.method3045();
                    for (int var65 = 0; var65 < field1120; var65++) {
                        class66 var66 = field1122[var65];
                        if (var57) {
                            if (var59.equals(var66.field780)) {
                                var66.field780 = var58;
                                var66.field779 = var59;
                                var58 = null;
                                break;
                            }
                        } else if (var58.equals(var66.field780)) {
                            if (var66.field783 != var60) {
                                boolean var67 = true;
                                for (class67 var68 = (class67) field1123.method3518(); var68 != null; var68 = (class67) field1123.method3528()) {
                                    if (var68.field786.equals(var58)) {
                                        if (var60 != 0 && var68.field787 == 0) {
                                            var68.method3529();
                                            var67 = false;
                                        } else if (var60 == 0 && var68.field787 != 0) {
                                            var68.method3529();
                                            var67 = false;
                                        }
                                    }
                                }
                                if (var67) {
                                    field1123.method3517(new class67(var58, var60));
                                }
                                var66.field783 = var60;
                            }
                            var66.field779 = var59;
                            var66.field781 = var61;
                            var66.field784 = var63;
                            var66.field782 = var64;
                            var58 = null;
                            break;
                        }
                    }
                    if (var58 != null && field1120 < 400) {
                        class66 var69 = new class66();
                        field1122[field1120] = var69;
                        var69.field780 = var58;
                        var69.field779 = var59;
                        var69.field783 = var60;
                        var69.field781 = var61;
                        var69.field784 = var63;
                        var69.field782 = var64;
                        field1120++;
                    }
                }
                field1023 = 2;
                field978 = field882;
                boolean var70 = false;
                int var71 = field1120;
                while (var71 > 0) {
                    boolean var72 = true;
                    var71--;
                    for (int var73 = 0; var73 < var71; var73++) {
                        boolean var74 = false;
                        class66 var75 = field1122[var73];
                        class66 var76 = field1122[var73 + 1];
                        if (field1040 != var75.field783 && field1040 == var76.field783) {
                            var74 = true;
                        }
                        if (!var74 && var75.field783 == 0 && var76.field783 != 0) {
                            var74 = true;
                        }
                        if (!var74 && !var75.field784 && var76.field784) {
                            var74 = true;
                        }
                        if (!var74 && !var75.field782 && var76.field782) {
                            var74 = true;
                        }
                        if (var74) {
                            class66 var77 = field1122[var73];
                            field1122[var73] = field1122[var73 + 1];
                            field1122[var73 + 1] = var77;
                            var72 = false;
                        }
                    }
                    if (var72) {
                        break;
                    }
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2288 == arg0.field1472) {
                class95.method565(var3, arg0.field1473);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2252 == arg0.field1472) {
                int var78 = var3.method3074();
                byte var79 = var3.method3236();
                class219.field2689[var78] = var79;
                if (class219.field2688[var78] != var79) {
                    class219.field2688[var78] = var79;
                }
                method1596(var78);
                field1041[++field1042 - 1 & 0x1F] = var78;
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2286 == arg0.field1472) {
                boolean var80 = var3.method3162() == 1;
                int var81 = var3.method3041();
                class224 var82 = class224.method1627(var81);
                if (var82.field2745 != var80) {
                    var82.field2745 = var80;
                    method503(var82);
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2300 == arg0.field1472) {
                method1056(class170.field2418);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2220 == arg0.field1472) {
                field1071 = var3.method3162();
                field987 = var3.method3162();
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2290 == arg0.field1472) {
                method2399(true, arg0.field1466);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2235 == arg0.field1472) {
                class290.method1043(var3, arg0.field1473);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2275 == arg0.field1472) {
                int var83 = var3.method3019();
                int var84 = var3.method3082();
                class68 var85 = (class68) field1070.method3438((long) var84);
                class68 var86 = (class68) field1070.method3438((long) var83);
                if (var86 != null) {
                    method499(var86, var85 == null || var85.field797 != var86.field797);
                }
                if (var85 != null) {
                    var85.method3475();
                    field1070.method3431(var85, (long) var83);
                }
                class224 var87 = class224.method1627(var84);
                if (var87 != null) {
                    method503(var87);
                }
                class224 var88 = class224.method1627(var83);
                if (var88 != null) {
                    method503(var88);
                    method4517(Statics.field257[var88.field2725 >>> 16], var88, true);
                }
                if (field1016 != -1) {
                    method79(field1016, 1);
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2223 == arg0.field1472) {
                String var89 = var3.method3045();
                int var90 = var3.method3179();
                byte var91 = var3.method3236();
                boolean var92 = false;
                if (var91 == -128) {
                    var92 = true;
                }
                if (var92) {
                    if (Statics.field733 == 0) {
                        arg0.field1472 = null;
                        return true;
                    }
                    boolean var93 = false;
                    int var94;
                    for (var94 = 0; var94 < Statics.field733 && (!Statics.field2537[var94].field871.equals(var89) || Statics.field2537[var94].field867 != var90); var94++) {
                    }
                    if (var94 < Statics.field733) {
                        while (var94 < Statics.field733 - 1) {
                            Statics.field2537[var94] = Statics.field2537[var94 + 1];
                            var94++;
                        }
                        Statics.field733--;
                        Statics.field2537[Statics.field733] = null;
                    }
                } else {
                    var3.method3045();
                    class76 var95 = new class76();
                    var95.field871 = var89;
                    var95.field868 = class275.method1598(var95.field871, Statics.field3240);
                    var95.field867 = var90;
                    var95.field869 = var91;
                    int var96;
                    for (var96 = Statics.field733 - 1; var96 >= 0; var96--) {
                        int var97 = Statics.field2537[var96].field868.compareTo(var95.field868);
                        if (var97 == 0) {
                            Statics.field2537[var96].field867 = var90;
                            Statics.field2537[var96].field869 = var91;
                            if (var89.equals(Statics.field2501.field844)) {
                                Statics.field283 = var91;
                            }
                            field1049 = field882;
                            arg0.field1472 = null;
                            return true;
                        }
                        if (var97 < 0) {
                            break;
                        }
                    }
                    if (Statics.field733 >= Statics.field2537.length) {
                        arg0.field1472 = null;
                        return true;
                    }
                    for (int var98 = Statics.field733 - 1; var98 > var96; var98--) {
                        Statics.field2537[var98 + 1] = Statics.field2537[var98];
                    }
                    if (Statics.field733 == 0) {
                        Statics.field2537 = new class76[100];
                    }
                    Statics.field2537[var96 + 1] = var95;
                    Statics.field733++;
                    if (var89.equals(Statics.field2501.field844)) {
                        Statics.field283 = var91;
                    }
                }
                field1049 = field882;
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2247 == arg0.field1472) {
                field1101 = true;
                Statics.field778 = var3.method3204();
                Statics.field2207 = var3.method3204();
                Statics.field351 = var3.method3179();
                Statics.field2686 = var3.method3204();
                Statics.field329 = var3.method3204();
                if (Statics.field329 >= 100) {
                    Statics.field2674 = Statics.field778 * 128 + 64;
                    Statics.field3806 = Statics.field2207 * 128 + 64;
                    Statics.field694 = method545(Statics.field2674, Statics.field3806, Statics.field3219) - Statics.field351;
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2233 == arg0.field1472) {
                int var99 = var3.method3074();
                int var100 = var3.method3019();
                class224 var101 = class224.method1627(var100);
                if (var101.field2768 != 1 || var101.field2769 != var99) {
                    var101.field2768 = 1;
                    var101.field2769 = var99;
                    method503(var101);
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2291 == arg0.field1472) {
                field1023 = 1;
                field978 = field882;
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2240 == arg0.field1472) {
                int var102 = var3.method3041();
                int var103 = var3.method3041();
                int var104 = var3.method3075();
                if (var104 == 65535) {
                    var104 = -1;
                }
                class224 var105 = class224.method1627(var103);
                if (var105.field2724) {
                    var105.field2754 = var104;
                    var105.field2846 = var102;
                    class264 var107 = class264.method482(var104);
                    var105.field2776 = var107.field3568;
                    var105.field2777 = var107.field3584;
                    var105.field2843 = var107.field3570;
                    var105.field2774 = var107.field3571;
                    var105.field2775 = var107.field3567;
                    var105.field2782 = var107.field3557;
                    if (var107.field3573 == 1) {
                        var105.field2783 = 1;
                    } else {
                        var105.field2783 = 2;
                    }
                    if (var105.field2780 > 0) {
                        var105.field2782 = var105.field2782 * 32 / var105.field2780;
                    } else if (var105.field2809 > 0) {
                        var105.field2782 = var105.field2782 * 32 / var105.field2809;
                    }
                    method503(var105);
                } else if (var104 == -1) {
                    var105.field2768 = 0;
                    arg0.field1472 = null;
                    return true;
                } else {
                    class264 var106 = class264.method482(var104);
                    var105.field2768 = 4;
                    var105.field2769 = var104;
                    var105.field2776 = var106.field3568;
                    var105.field2777 = var106.field3584;
                    var105.field2782 = var106.field3557 * 100 / var102;
                    method503(var105);
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2281 == arg0.field1472) {
                int var108 = var3.method3082();
                int var109 = var3.method3076();
                class224 var110 = class224.method1627(var108);
                if (var110.field2845 != var109 || var109 == -1) {
                    var110.field2845 = var109;
                    var110.field2847 = 0;
                    var110.field2784 = 0;
                    method503(var110);
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2224 == arg0.field1472) {
                int var111 = var3.method3082();
                int var112 = var3.method3204();
                int var113 = var3.method3073();
                class68 var114 = (class68) field1070.method3438((long) var111);
                if (var114 != null) {
                    method499(var114, var114.field797 != var113);
                }
                class68 var115 = new class68();
                var115.field797 = var113;
                var115.field791 = var112;
                field1070.method3431(var115, (long) var111);
                method233(var113);
                class224 var116 = class224.method1627(var111);
                method503(var116);
                if (field1019 != null) {
                    method503(field1019);
                    field1019 = null;
                }
                method1629();
                method4517(Statics.field257[var111 >> 16], var116, false);
                class83.method919(var113);
                if (field1016 != -1) {
                    method79(field1016, 1);
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2279 == arg0.field1472) {
                var3.field2498 += 28;
                if (var3.method3060()) {
                    method1447(var3, var3.field2498 - 28);
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2264 == arg0.field1472) {
                int var117 = var3.method3179();
                int var118 = var3.method3082();
                class219.field2689[var117] = var118;
                if (class219.field2688[var117] != var118) {
                    class219.field2688[var117] = var118;
                }
                method1596(var117);
                field1041[++field1042 - 1 & 0x1F] = var117;
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2280 == arg0.field1472) {
                int var119 = var3.method3073();
                if (var119 == 65535) {
                    var119 = -1;
                }
                method1011(var119);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2293 == arg0.field1472) {
                int var120 = var3.method3074();
                if (var120 == 65535) {
                    var120 = -1;
                }
                int var121 = var3.method3078();
                method1602(var120, var121);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2265 == arg0.field1472) {
                Statics.field2629 = var3.method3120();
                Statics.field340 = var3.method3162();
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2226 == arg0.field1472) {
                int var122 = var3.method3074();
                int var123 = var3.method3179();
                int var124 = var3.method3041();
                int var125 = var3.method3074();
                class224 var126 = class224.method1627(var124);
                if (var126.field2776 != var123 || var126.field2777 != var125 || var126.field2782 != var122) {
                    var126.field2776 = var123;
                    var126.field2777 = var125;
                    var126.field2782 = var122;
                    method503(var126);
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2237 == arg0.field1472) {
                int var127 = arg0.field1473 + var3.field2498;
                int var128 = var3.method3179();
                int var129 = var3.method3179();
                if (field1016 != var128) {
                    field1016 = var128;
                    this.method1145(false);
                    method233(field1016);
                    class83.method919(field1016);
                    for (int var130 = 0; var130 < 100; var130++) {
                        field1060[var130] = true;
                    }
                }
                while (var129-- > 0) {
                    int var131 = var3.method3041();
                    int var132 = var3.method3179();
                    int var133 = var3.method3204();
                    class68 var134 = (class68) field1070.method3438((long) var131);
                    if (var134 != null && var134.field797 != var132) {
                        method499(var134, true);
                        var134 = null;
                    }
                    if (var134 == null) {
                        class68 var135 = new class68();
                        var135.field797 = var132;
                        var135.field791 = var133;
                        field1070.method3431(var135, (long) var131);
                        method233(var132);
                        class224 var136 = class224.method1627(var131);
                        method503(var136);
                        if (field1019 != null) {
                            method503(field1019);
                            field1019 = null;
                        }
                        method1629();
                        method4517(Statics.field257[var131 >> 16], var136, false);
                        class83.method919(var132);
                        if (field1016 != -1) {
                            method79(field1016, 1);
                        }
                        var134 = var135;
                    }
                    var134.field792 = true;
                }
                for (class68 var138 = (class68) field1070.method3437(); var138 != null; var138 = (class68) field1070.method3433()) {
                    if (var138.field792) {
                        var138.field792 = false;
                    } else {
                        method499(var138, true);
                    }
                }
                field1057 = new class198(512);
                while (var3.field2498 < var127) {
                    int var139 = var3.method3041();
                    int var140 = var3.method3179();
                    int var141 = var3.method3179();
                    int var142 = var3.method3041();
                    for (int var143 = var140; var143 <= var141; var143++) {
                        long var144 = ((long) var139 << 32) + (long) var143;
                        field1057.method3431(new class206(var142), var144);
                    }
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2228 == arg0.field1472) {
                Statics.field2629 = var3.method3120();
                Statics.field340 = var3.method3197();
                while (var3.field2498 < arg0.field1473) {
                    int var146 = var3.method3204();
                    class170 var147 = class170.method178()[var146];
                    method1056(var147);
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2299 == arg0.field1472) {
                field907 = var3.method3204();
                if (field907 == 1) {
                    field926 = var3.method3179();
                }
                if (field907 >= 2 && field907 <= 6) {
                    if (field907 == 2) {
                        field1006 = 64;
                        field896 = 64;
                    }
                    if (field907 == 3) {
                        field1006 = 0;
                        field896 = 64;
                    }
                    if (field907 == 4) {
                        field1006 = 128;
                        field896 = 64;
                    }
                    if (field907 == 5) {
                        field1006 = 64;
                        field896 = 0;
                    }
                    if (field907 == 6) {
                        field1006 = 64;
                        field896 = 128;
                    }
                    field907 = 2;
                    field892 = var3.method3179();
                    field893 = var3.method3179();
                    field894 = var3.method3204();
                }
                if (field907 == 10) {
                    field1031 = var3.method3179();
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2276 == arg0.field1472) {
                int var148 = var3.method3041();
                int var149 = var3.method3179();
                if (var148 < -70000) {
                    var149 += 32768;
                }
                class224 var150;
                if (var148 >= 0) {
                    var150 = class224.method1627(var148);
                } else {
                    var150 = null;
                }
                if (var150 != null) {
                    for (int var151 = 0; var151 < var150.field2778.length; var151++) {
                        var150.field2778[var151] = 0;
                        var150.field2733[var151] = 0;
                    }
                }
                class64 var152 = (class64) class64.field754.method3438((long) var149);
                if (var152 != null) {
                    for (int var153 = 0; var153 < var152.field756.length; var153++) {
                        var152.field756[var153] = -1;
                        var152.field751[var153] = 0;
                    }
                }
                int var154 = var3.method3179();
                for (int var155 = 0; var155 < var154; var155++) {
                    int var156 = var3.method3179();
                    int var157 = var3.method3197();
                    if (var157 == 255) {
                        var157 = var3.method3019();
                    }
                    if (var150 != null && var155 < var150.field2778.length) {
                        var150.field2778[var155] = var156;
                        var150.field2733[var155] = var157;
                    }
                    class64.method484(var149, var155, var156 - 1, var157);
                }
                if (var150 != null) {
                    method503(var150);
                }
                method480();
                field938[++field962 - 1 & 0x1F] = var149 & 0x7FFF;
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2259 == arg0.field1472) {
                String var158 = var3.method3045();
                long var159 = (long) var3.method3179();
                long var161 = (long) var3.method3235();
                class238 var163 = (class238) class176.method1702(class238.method994(), var3.method3204());
                long var164 = (var159 << 32) + var161;
                boolean var166 = false;
                for (int var167 = 0; var167 < 100; var167++) {
                    if (field1074[var167] == var164) {
                        var166 = true;
                        break;
                    }
                }
                if (method228(var158)) {
                    var166 = true;
                }
                if (!var166 && field909 == 0) {
                    field1074[field1075] = var164;
                    field1075 = (field1075 + 1) % 100;
                    String var168 = class272.method4638(class278.method227(class273.method1014(var3)));
                    byte var169;
                    if (var163.field3258) {
                        var169 = 7;
                    } else {
                        var169 = 3;
                    }
                    if (var163.field3252 == -1) {
                        class97.method706(var169, var158, var168);
                    } else {
                        class97.method706(var169, class88.method1449(var163.field3252) + var158, var168);
                    }
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2270 == arg0.field1472) {
                int var170 = var3.method3041();
                class68 var171 = (class68) field1070.method3438((long) var170);
                if (var171 != null) {
                    method499(var171, true);
                }
                if (field1019 != null) {
                    method503(field1019);
                    field1019 = null;
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2296 == arg0.field1472) {
                int var172 = var3.method3179();
                int var173 = var3.method3204();
                int var174 = var3.method3179();
                method633(var172, var173, var174);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2238 == arg0.field1472) {
                method1056(class170.field2415);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2246 == arg0.field1472) {
                int var175 = var3.method3120();
                int var176 = var3.method3197();
                String var177 = var3.method3045();
                if (var176 >= 1 && var176 <= 8) {
                    if (var177.equalsIgnoreCase("null")) {
                        var177 = null;
                    }
                    field981[var176 - 1] = var177;
                    field982[var176 - 1] = var175 == 0;
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2236 == arg0.field1472) {
                String var178 = var3.method3045();
                long var179 = var3.method3134();
                long var181 = (long) var3.method3179();
                long var183 = (long) var3.method3235();
                class238 var185 = (class238) class176.method1702(class238.method994(), var3.method3204());
                long var186 = (var181 << 32) + var183;
                boolean var188 = false;
                for (int var189 = 0; var189 < 100; var189++) {
                    if (field1074[var189] == var186) {
                        var188 = true;
                        break;
                    }
                }
                if (var185.field3260 && method228(var178)) {
                    var188 = true;
                }
                if (!var188 && field909 == 0) {
                    field1074[field1075] = var186;
                    field1075 = (field1075 + 1) % 100;
                    String var190 = class272.method4638(class278.method227(class273.method1014(var3)));
                    if (var185.field3252 == -1) {
                        class97.method1525(9, var178, var190, class276.method3269(var179));
                    } else {
                        class97.method1525(9, class88.method1449(var185.field3252) + var178, var190, class276.method3269(var179));
                    }
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2277 == arg0.field1472) {
                int var191 = var3.method3041();
                class224 var192 = class224.method1627(var191);
                for (int var193 = 0; var193 < var192.field2778.length; var193++) {
                    var192.field2778[var193] = -1;
                    var192.field2778[var193] = 0;
                }
                method503(var192);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2266 == arg0.field1472) {
                method1056(class170.field2410);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2255 == arg0.field1472) {
                int var194 = var3.method3073();
                int var195 = var3.method3041();
                class224 var196 = class224.method1627(var195);
                if (var196 != null && var196.field2727 == 0) {
                    if (var194 > var196.field2749 - var196.field2741) {
                        var194 = var196.field2749 - var196.field2741;
                    }
                    if (var194 < 0) {
                        var194 = 0;
                    }
                    if (var196.field2747 != var194) {
                        var196.field2747 = var194;
                        method503(var196);
                    }
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2258 == arg0.field1472) {
                int var197 = var3.method3082();
                int var198 = var3.method3179();
                int var199 = var3.method3179();
                class224 var200 = class224.method1627(var197);
                var200.field2781 = (var199 << 16) + var198;
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2282 == arg0.field1472) {
                int var201 = var3.method3204();
                if (var3.method3204() == 0) {
                    field1129[var201] = new class17();
                    var3.field2498 += 18;
                } else {
                    var3.field2498--;
                    field1129[var201] = new class17(var3, false);
                }
                field1050 = field882;
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2292 == arg0.field1472) {
                int var202 = var3.method3044();
                boolean var203 = var3.method3204() == 1;
                String var204 = "";
                boolean var205 = false;
                if (var203) {
                    var204 = var3.method3045();
                    if (method228(var204)) {
                        var205 = true;
                    }
                }
                String var206 = var3.method3045();
                if (!var205) {
                    class97.method706(var202, var204, var206);
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2285 == arg0.field1472) {
                String var207 = var3.method3045();
                Object[] var208 = new Object[var207.length() + 1];
                for (int var209 = var207.length() - 1; var209 >= 0; var209--) {
                    if (var207.charAt(var209) == 's') {
                        var208[var209 + 1] = var3.method3045();
                    } else {
                        var208[var209 + 1] = Integer.valueOf(var3.method3041());
                    }
                }
                var208[0] = Integer.valueOf(var3.method3041());
                class69 var210 = new class69();
                var210.field798 = var208;
                class83.method86(var210);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2232 == arg0.field1472) {
                method2769();
                arg0.field1472 = null;
                return false;
            }
            if (class167.field2261 == arg0.field1472) {
                int var211 = var3.method3179();
                field1016 = var211;
                this.method1145(false);
                method233(var211);
                class83.method919(field1016);
                for (int var212 = 0; var212 < 100; var212++) {
                    field1060[var212] = true;
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2283 == arg0.field1472) {
                method480();
                field1020 = var3.method3204();
                field1052 = field882;
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2231 == arg0.field1472) {
                boolean var213 = var3.method3204() == 1;
                if (var213) {
                    Statics.field2534 = class183.method2932() - var3.method3134();
                    Statics.field28 = new class14(var3, true);
                } else {
                    Statics.field28 = null;
                }
                field1051 = field882;
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2251 == arg0.field1472) {
                int var214 = var3.method3018();
                int var215 = var3.method3019();
                int var216 = var3.method3074();
                if (var216 == 65535) {
                    var216 = -1;
                }
                int var217 = var3.method3074();
                if (var217 == 65535) {
                    var217 = -1;
                }
                for (int var218 = var217; var218 <= var216; var218++) {
                    long var219 = ((long) var215 << 32) + (long) var218;
                    class200 var221 = field1057.method3438(var219);
                    if (var221 != null) {
                        var221.method3475();
                    }
                    field1057.method3431(new class206(var214), var219);
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2298 == arg0.field1472) {
                method1056(class170.field2417);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2239 == arg0.field1472) {
                int var222 = var3.method3073();
                int var223 = var3.method3019();
                class224 var224 = class224.method1627(var223);
                if (var224.field2768 != 2 || var224.field2769 != var222) {
                    var224.field2768 = 2;
                    var224.field2769 = var222;
                    method503(var224);
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2248 == arg0.field1472) {
                for (int var225 = 0; var225 < field1054.length; var225++) {
                    if (field1054[var225] != null) {
                        field1054[var225].field1192 = -1;
                    }
                }
                for (int var226 = 0; var226 < field915.length; var226++) {
                    if (field915[var226] != null) {
                        field915[var226].field1192 = -1;
                    }
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2244 == arg0.field1472) {
                String var227 = var3.method3045();
                String var228 = class272.method4638(class278.method227(class273.method1014(var3)));
                class97.method706(6, var227, var228);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2234 == arg0.field1472) {
                method5(true, var3);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2241 == arg0.field1472) {
                field1101 = false;
                for (int var229 = 0; var229 < 5; var229++) {
                    field1102[var229] = false;
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2267 == arg0.field1472) {
                field1101 = true;
                Statics.field480 = var3.method3204();
                Statics.field630 = var3.method3204();
                Statics.field305 = var3.method3179();
                Statics.field2166 = var3.method3204();
                Statics.field3227 = var3.method3204();
                if (Statics.field3227 >= 100) {
                    int var230 = Statics.field480 * 128 + 64;
                    int var231 = Statics.field630 * 128 + 64;
                    int var232 = method545(var230, var231, Statics.field3219) - Statics.field305;
                    int var233 = var230 - Statics.field2674;
                    int var234 = var232 - Statics.field694;
                    int var235 = var231 - Statics.field3806;
                    int var236 = (int) Math.sqrt((double) (var233 * var233 + var235 * var235));
                    Statics.field312 = (int) (Math.atan2((double) var234, (double) var236) * 325.949D) & 0x7FF;
                    Statics.field625 = (int) (Math.atan2((double) var233, (double) var235) * -325.949D) & 0x7FF;
                    if (Statics.field312 < 128) {
                        Statics.field312 = 128;
                    }
                    if (Statics.field312 > 383) {
                        Statics.field312 = 383;
                    }
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2250 == arg0.field1472) {
                method5(false, var3);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2284 == arg0.field1472) {
                String var237 = var3.method3045();
                int var238 = var3.method3018();
                class224 var239 = class224.method1627(var238);
                if (!var237.equals(var239.field2793)) {
                    var239.field2793 = var237;
                    method503(var239);
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2257 == arg0.field1472) {
                while (var3.field2498 < arg0.field1473) {
                    int var240 = var3.method3204();
                    boolean var241 = (var240 & 0x1) == 1;
                    String var242 = var3.method3045();
                    String var243 = var3.method3045();
                    var3.method3045();
                    for (int var244 = 0; var244 < field1124; var244++) {
                        class70 var245 = field1125[var244];
                        if (var241) {
                            if (var243.equals(var245.field816)) {
                                var245.field816 = var242;
                                var245.field815 = var243;
                                var242 = null;
                                break;
                            }
                        } else if (var242.equals(var245.field816)) {
                            var245.field816 = var242;
                            var245.field815 = var243;
                            var242 = null;
                            break;
                        }
                    }
                    if (var242 != null && field1124 < 400) {
                        class70 var246 = new class70();
                        field1125[field1124] = var246;
                        var246.field816 = var242;
                        var246.field815 = var243;
                        field1124++;
                    }
                }
                field978 = field882;
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2302 == arg0.field1472) {
                int var247 = var3.method3041();
                int var248 = var3.method3179();
                if (var247 < -70000) {
                    var248 += 32768;
                }
                class224 var249;
                if (var247 >= 0) {
                    var249 = class224.method1627(var247);
                } else {
                    var249 = null;
                }
                while (var3.field2498 < arg0.field1473) {
                    int var250 = var3.method3044();
                    int var251 = var3.method3179();
                    int var252 = 0;
                    if (var251 != 0) {
                        var252 = var3.method3204();
                        if (var252 == 255) {
                            var252 = var3.method3041();
                        }
                    }
                    if (var249 != null && var250 >= 0 && var250 < var249.field2778.length) {
                        var249.field2778[var250] = var251;
                        var249.field2733[var250] = var252;
                    }
                    class64.method484(var248, var250, var251 - 1, var252);
                }
                if (var249 != null) {
                    method503(var249);
                }
                method480();
                field938[++field962 - 1 & 0x1F] = var248 & 0x7FFF;
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2263 == arg0.field1472) {
                class80 var253 = new class80();
                var253.field1228 = var3.method3045();
                var253.field1222 = var3.method3179();
                int var254 = var3.method3041();
                var253.field1213 = var254;
                method62(45);
                var2.method2867();
                Object var255 = null;
                class92.method1558(var253);
                arg0.field1472 = null;
                return false;
            }
            if (class167.field2227 == arg0.field1472) {
                for (int var256 = 0; var256 < Statics.field3358; var256++) {
                    class249 var257 = (class249) class249.field3361.method3418((long) var256);
                    class249 var258;
                    if (var257 == null) {
                        byte[] var259 = Statics.field3360.method3935(16, var256);
                        class249 var260 = new class249();
                        if (var259 != null) {
                            var260.method4098(new class181(var259));
                        }
                        class249.field3361.method3417(var260, (long) var256);
                        var258 = var260;
                    } else {
                        var258 = var257;
                    }
                    if (var258 != null) {
                        class219.field2689[var256] = 0;
                        class219.field2688[var256] = 0;
                    }
                }
                method480();
                field1042 += 32;
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2262 == arg0.field1472) {
                int var262 = var3.method3204();
                int var263 = var3.method3204();
                int var264 = var3.method3204();
                int var265 = var3.method3204();
                field1102[var262] = true;
                field1103[var262] = var263;
                field936[var262] = var264;
                field873[var262] = var265;
                field1092[var262] = 0;
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2271 == arg0.field1472) {
                method480();
                int var266 = var3.method3019();
                int var267 = var3.method3162();
                int var268 = var3.method3120();
                field991[var268] = var266;
                field989[var268] = var267;
                field1090[var268] = 1;
                for (int var269 = 0; var269 < 98; var269++) {
                    if (var266 >= class230.field2913[var269]) {
                        field1090[var268] = var269 + 2;
                    }
                }
                field1093[++field895 - 1 & 0x1F] = var268;
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2243 == arg0.field1472) {
                field1087 = var3.method3204();
                if (field1087 == 255) {
                    field1087 = 0;
                }
                field1088 = var3.method3204();
                if (field1088 == 255) {
                    field1088 = 0;
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2294 == arg0.field1472) {
                int var270 = var3.method3019();
                int var271 = var3.method3075();
                int var272 = var271 >> 10 & 0x1F;
                int var273 = var271 >> 5 & 0x1F;
                int var274 = var271 & 0x1F;
                int var275 = (var274 << 3) + (var272 << 19) + (var273 << 11);
                class224 var276 = class224.method1627(var270);
                if (var276.field2764 != var275) {
                    var276.field2764 = var275;
                    method503(var276);
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2230 == arg0.field1472) {
                method1056(class170.field2412);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2254 == arg0.field1472) {
                method480();
                field1021 = var3.method3147();
                field1052 = field882;
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2245 == arg0.field1472) {
                field1089 = var3.method3204();
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2269 == arg0.field1472) {
                method2399(false, arg0.field1466);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2287 == arg0.field1472) {
                int var277 = var3.method3204();
                class286[] var278 = class286.method3009();
                int var279 = 0;
                class286 var281;
                while (true) {
                    if (var279 >= var278.length) {
                        var281 = null;
                        break;
                    }
                    class286 var280 = var278[var279];
                    if (var280.field3785 == var277) {
                        var281 = var280;
                        break;
                    }
                    var279++;
                }
                Statics.field2706 = var281;
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2295 == arg0.field1472) {
                for (int var282 = 0; var282 < class219.field2688.length; var282++) {
                    if (class219.field2689[var282] != class219.field2688[var282]) {
                        class219.field2688[var282] = class219.field2689[var282];
                        method1596(var282);
                        field1041[++field1042 - 1 & 0x1F] = var282;
                    }
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2289 == arg0.field1472) {
                if (field1016 != -1) {
                    method79(field1016, 0);
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2268 == arg0.field1472) {
                int var283 = var3.method3074();
                class64 var284 = (class64) class64.field754.method3438((long) var283);
                if (var284 != null) {
                    var284.method3475();
                }
                field938[++field962 - 1 & 0x1F] = var283 & 0x7FFF;
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2253 == arg0.field1472) {
                method1056(class170.field2414);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2249 == arg0.field1472) {
                method1056(class170.field2411);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2273 == arg0.field1472) {
                int var285 = var3.method3018();
                class224 var286 = class224.method1627(var285);
                var286.field2768 = 3;
                var286.field2769 = Statics.field2501.field857.method3831();
                method503(var286);
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2222 == arg0.field1472) {
                Statics.field340 = var3.method3204();
                Statics.field2629 = var3.method3204();
                for (int var287 = Statics.field340; var287 < Statics.field340 + 8; var287++) {
                    for (int var288 = Statics.field2629; var288 < Statics.field2629 + 8; var288++) {
                        if (field985[Statics.field3219][var287][var288] != null) {
                            field985[Statics.field3219][var287][var288] = null;
                            method2768(var287, var288);
                        }
                    }
                }
                for (class77 var289 = (class77) field888.method3500(); var289 != null; var289 = (class77) field888.method3511()) {
                    if (var289.field1137 >= Statics.field340 && var289.field1137 < Statics.field340 + 8 && var289.field1142 >= Statics.field2629 && var289.field1142 < Statics.field2629 + 8 && Statics.field3219 == var289.field1138) {
                        var289.field1146 = 0;
                    }
                }
                arg0.field1472 = null;
                return true;
            }
            if (class167.field2242 == arg0.field1472) {
                method1056(class170.field2416);
                arg0.field1472 = null;
                return true;
            }
            class154.method1684("" + (arg0.field1472 == null ? -1 : arg0.field1472.field2301) + class88.field1312 + (arg0.field1476 == null ? -1 : arg0.field1476.field2301) + class88.field1312 + (arg0.field1479 == null ? -1 : arg0.field1479.field2301) + class88.field1312 + arg0.field1473, (Throwable) null);
            method2769();
        } catch (IOException var296) {
            method2007();
        } catch (Exception var297) {
            String var292 = "" + (arg0.field1472 == null ? -1 : arg0.field1472.field2301) + class88.field1312 + (arg0.field1476 == null ? -1 : arg0.field1476.field2301) + class88.field1312 + (arg0.field1479 == null ? -1 : arg0.field1479.field2301) + class88.field1312 + arg0.field1473 + class88.field1312 + (Statics.field3306 + Statics.field2501.field1187[0]) + class88.field1312 + (Statics.field2066 + Statics.field2501.field1203[0]) + class88.field1312;
            for (int var293 = 0; var293 < arg0.field1473 && var293 < 50; var293++) {
                var292 = var292 + var3.field2496[var293] + class88.field1312;
            }
            class154.method1684(var292, var297);
            method2769();
        }
        return true;
    }

    @ObfuscatedName("bd.hn(Lfo;I)V")
    public static final void method1056(class170 arg0) {
        class187 var1 = field917.field1466;
        if (class170.field2409 == arg0) {
            int var2 = var1.method3075();
            int var3 = var1.method3120();
            int var4 = (var3 >> 4 & 0x7) + Statics.field340;
            int var5 = (var3 & 0x7) + Statics.field2629;
            int var6 = var1.method3204();
            int var7 = var6 >> 2;
            int var8 = var6 & 0x3;
            int var9 = field930[var7];
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                method4757(Statics.field3219, var4, var5, var9, var2, var7, var8, 0, -1);
            }
            return;
        }
        if (class170.field2411 == arg0) {
            int var10 = var1.method3074();
            int var11 = var1.method3073();
            byte var12 = var1.method3236();
            int var13 = var1.method3075();
            int var14 = var1.method3197();
            int var15 = var14 >> 2;
            int var16 = var14 & 0x3;
            int var17 = field930[var15];
            byte var18 = var1.method3067();
            int var19 = var1.method3120();
            int var20 = (var19 >> 4 & 0x7) + Statics.field340;
            int var21 = (var19 & 0x7) + Statics.field2629;
            byte var22 = var1.method3068();
            int var23 = var1.method3075();
            byte var24 = var1.method3069();
            class74 var25;
            if (field976 == var11) {
                var25 = Statics.field2501;
            } else {
                var25 = field1054[var11];
            }
            if (var25 != null) {
                class263 var26 = class263.method10(var23);
                int var27;
                int var28;
                if (var16 == 1 || var16 == 3) {
                    var27 = var26.field3508;
                    var28 = var26.field3550;
                } else {
                    var27 = var26.field3550;
                    var28 = var26.field3508;
                }
                int var29 = (var27 >> 1) + var20;
                int var30 = (var27 + 1 >> 1) + var20;
                int var31 = (var28 >> 1) + var21;
                int var32 = (var28 + 1 >> 1) + var21;
                int[][] var33 = class62.field729[Statics.field3219];
                int var34 = var33[var29][var31] + var33[var30][var31] + var33[var29][var32] + var33[var30][var32] >> 2;
                int var35 = (var20 << 7) + (var27 << 6);
                int var36 = (var21 << 7) + (var28 << 6);
                class133 var37 = var26.method4356(var15, var16, var33, var35, var34, var36);
                if (var37 != null) {
                    method4757(Statics.field3219, var20, var21, var17, -1, 0, 0, var10 + 1, var13 + 1);
                    var25.field849 = field881 + var10;
                    var25.field845 = field881 + var13;
                    var25.field841 = var37;
                    var25.field846 = var20 * 128 + var27 * 64;
                    var25.field848 = var21 * 128 + var28 * 64;
                    var25.field847 = var34;
                    if (var24 > var12) {
                        byte var38 = var24;
                        var24 = var12;
                        var12 = var38;
                    }
                    if (var18 > var22) {
                        byte var39 = var18;
                        var18 = var22;
                        var22 = var39;
                    }
                    var25.field850 = var20 + var24;
                    var25.field852 = var12 + var20;
                    var25.field851 = var18 + var21;
                    var25.field853 = var21 + var22;
                }
            }
        }
        if (class170.field2418 == arg0) {
            byte var40 = var1.method3068();
            int var41 = var1.method3147();
            int var42 = var1.method3074();
            int var43 = var1.method3074();
            int var44 = var1.method3179();
            int var45 = var1.method3120();
            int var46 = (var45 >> 4 & 0x7) + Statics.field340;
            int var47 = (var45 & 0x7) + Statics.field2629;
            int var48 = var1.method3162() * 4;
            int var49 = var1.method3162();
            int var50 = var1.method3197() * 4;
            int var51 = var1.method3162();
            byte var52 = var1.method3068();
            int var53 = var46 + var52;
            int var54 = var40 + var47;
            if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104 && var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104 && var42 != 65535) {
                int var55 = var46 * 128 + 64;
                int var56 = var47 * 128 + 64;
                int var57 = var53 * 128 + 64;
                int var58 = var54 * 128 + 64;
                class93 var59 = new class93(var42, Statics.field3219, var55, var56, method545(var55, var56, Statics.field3219) - var50, field881 + var43, field881 + var44, var51, var49, var41, var48);
                var59.method1676(var57, var58, method545(var57, var58, Statics.field3219) - var48, field881 + var43);
                field1045.method3502(var59);
            }
        } else if (class170.field2412 == arg0) {
            int var60 = var1.method3074();
            int var61 = var1.method3120();
            int var62 = (var61 >> 4 & 0x7) + Statics.field340;
            int var63 = (var61 & 0x7) + Statics.field2629;
            int var64 = var1.method3074();
            int var65 = var1.method3074();
            if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
                class201 var66 = field985[Statics.field3219][var62][var63];
                if (var66 != null) {
                    for (class94 var67 = (class94) var66.method3500(); var67 != null; var67 = (class94) var66.method3511()) {
                        if ((var60 & 0x7FFF) == var67.field1404 && var67.field1405 == var65) {
                            var67.field1405 = var64;
                            break;
                        }
                    }
                    method2768(var62, var63);
                }
            }
        } else if (class170.field2413 == arg0) {
            int var68 = var1.method3074();
            int var69 = var1.method3120();
            int var70 = var1.method3204();
            int var71 = (var70 >> 4 & 0x7) + Statics.field340;
            int var72 = (var70 & 0x7) + Statics.field2629;
            int var73 = var1.method3074();
            if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104) {
                int var74 = var71 * 128 + 64;
                int var75 = var72 * 128 + 64;
                class84 var76 = new class84(var68, Statics.field3219, var74, var75, method545(var74, var75, Statics.field3219) - var69, var73, field881);
                field1033.method3502(var76);
            }
        } else {
            if (class170.field2417 == arg0) {
                int var77 = var1.method3204();
                int var78 = var1.method3073();
                int var79 = var1.method3204();
                int var80 = var79 >> 4 & 0xF;
                int var81 = var79 & 0x7;
                int var82 = var1.method3197();
                int var83 = (var82 >> 4 & 0x7) + Statics.field340;
                int var84 = (var82 & 0x7) + Statics.field2629;
                if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                    int var85 = var80 + 1;
                    if (Statics.field2501.field1187[0] >= var83 - var85 && Statics.field2501.field1187[0] <= var83 + var85 && Statics.field2501.field1203[0] >= var84 - var85 && Statics.field2501.field1203[0] <= var84 + var85 && field1094 != 0 && var81 > 0 && field986 < 50) {
                        field971[field986] = var78;
                        field1097[field986] = var81;
                        field931[field986] = var77;
                        field1127[field986] = null;
                        field1099[field986] = (var83 << 16) + (var84 << 8) + var80;
                        field986++;
                    }
                }
            }
            if (class170.field2410 == arg0) {
                int var86 = var1.method3075();
                int var87 = var1.method3204();
                int var88 = var87 >> 2;
                int var89 = var87 & 0x3;
                int var90 = field930[var88];
                int var91 = var1.method3204();
                int var92 = (var91 >> 4 & 0x7) + Statics.field340;
                int var93 = (var91 & 0x7) + Statics.field2629;
                if (var92 >= 0 && var93 >= 0 && var92 < 103 && var93 < 103) {
                    if (var90 == 0) {
                        class142 var94 = Statics.field282.method2603(Statics.field3219, var92, var93);
                        if (var94 != null) {
                            int var95 = var94.field2032 >> 14 & 0x7FFF;
                            if (var88 == 2) {
                                var94.field2030 = new class99(var95, 2, var89 + 4, Statics.field3219, var92, var93, var86, false, var94.field2030);
                                var94.field2025 = new class99(var95, 2, var89 + 1 & 0x3, Statics.field3219, var92, var93, var86, false, var94.field2025);
                            } else {
                                var94.field2030 = new class99(var95, var88, var89, Statics.field3219, var92, var93, var86, false, var94.field2030);
                            }
                        }
                    }
                    if (var90 == 1) {
                        class147 var96 = Statics.field282.method2604(Statics.field3219, var92, var93);
                        if (var96 != null) {
                            int var97 = var96.field2069 >> 14 & 0x7FFF;
                            if (var88 == 4 || var88 == 5) {
                                var96.field2075 = new class99(var97, 4, var89, Statics.field3219, var92, var93, var86, false, var96.field2075);
                            } else if (var88 == 6) {
                                var96.field2075 = new class99(var97, 4, var89 + 4, Statics.field3219, var92, var93, var86, false, var96.field2075);
                            } else if (var88 == 7) {
                                var96.field2075 = new class99(var97, 4, (var89 + 2 & 0x3) + 4, Statics.field3219, var92, var93, var86, false, var96.field2075);
                            } else if (var88 == 8) {
                                var96.field2075 = new class99(var97, 4, var89 + 4, Statics.field3219, var92, var93, var86, false, var96.field2075);
                                var96.field2080 = new class99(var97, 4, (var89 + 2 & 0x3) + 4, Statics.field3219, var92, var93, var86, false, var96.field2080);
                            }
                        }
                    }
                    if (var90 == 2) {
                        class148 var98 = Statics.field282.method2635(Statics.field3219, var92, var93);
                        if (var88 == 11) {
                            var88 = 10;
                        }
                        if (var98 != null) {
                            var98.field2090 = new class99(var98.field2082 >> 14 & 0x7FFF, var88, var89, Statics.field3219, var92, var93, var86, false, var98.field2090);
                        }
                    }
                    if (var90 == 3) {
                        class129 var99 = Statics.field282.method2608(Statics.field3219, var92, var93);
                        if (var99 != null) {
                            var99.field1775 = new class99(var99.field1773 >> 14 & 0x7FFF, 22, var89, Statics.field3219, var92, var93, var86, false, var99.field1775);
                        }
                    }
                }
            } else if (class170.field2415 == arg0) {
                int var100 = var1.method3120();
                int var101 = (var100 >> 4 & 0x7) + Statics.field340;
                int var102 = (var100 & 0x7) + Statics.field2629;
                int var103 = var1.method3075();
                if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
                    class201 var104 = field985[Statics.field3219][var101][var102];
                    if (var104 != null) {
                        for (class94 var105 = (class94) var104.method3500(); var105 != null; var105 = (class94) var104.method3511()) {
                            if ((var103 & 0x7FFF) == var105.field1404) {
                                var105.method3475();
                                break;
                            }
                        }
                        if (var104.method3500() == null) {
                            field985[Statics.field3219][var101][var102] = null;
                        }
                        method2768(var101, var102);
                    }
                }
            } else if (class170.field2414 == arg0) {
                int var106 = var1.method3074();
                int var107 = var1.method3120();
                int var108 = (var107 >> 4 & 0x7) + Statics.field340;
                int var109 = (var107 & 0x7) + Statics.field2629;
                int var110 = var1.method3073();
                if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                    class94 var111 = new class94();
                    var111.field1404 = var106;
                    var111.field1405 = var110;
                    if (field985[Statics.field3219][var108][var109] == null) {
                        field985[Statics.field3219][var108][var109] = new class201();
                    }
                    field985[Statics.field3219][var108][var109].method3502(var111);
                    method2768(var108, var109);
                }
            } else if (class170.field2416 == arg0) {
                int var112 = var1.method3204();
                int var113 = var112 >> 2;
                int var114 = var112 & 0x3;
                int var115 = field930[var113];
                int var116 = var1.method3204();
                int var117 = (var116 >> 4 & 0x7) + Statics.field340;
                int var118 = (var116 & 0x7) + Statics.field2629;
                if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104) {
                    method4757(Statics.field3219, var117, var118, var115, -1, var113, var114, 0, -1);
                }
            }
        }
    }

    @ObfuscatedName("js.hw(IIIIIIIIII)V")
    public static final void method4757(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class77 var9 = null;
        for (class77 var10 = (class77) field888.method3500(); var10 != null; var10 = (class77) field888.method3511()) {
            if (var10.field1138 == arg0 && var10.field1137 == arg1 && var10.field1142 == arg2 && var10.field1136 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class77();
            var9.field1138 = arg0;
            var9.field1136 = arg3;
            var9.field1137 = arg1;
            var9.field1142 = arg2;
            method19(var9);
            field888.method3502(var9);
        }
        var9.field1139 = arg4;
        var9.field1144 = arg5;
        var9.field1143 = arg6;
        var9.field1145 = arg7;
        var9.field1146 = arg8;
    }

    @ObfuscatedName("v.ht(Lbi;I)V")
    public static final void method19(class77 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1136 == 0) {
            var1 = Statics.field282.method2607(arg0.field1138, arg0.field1137, arg0.field1142);
        }
        if (arg0.field1136 == 1) {
            var1 = Statics.field282.method2687(arg0.field1138, arg0.field1137, arg0.field1142);
        }
        if (arg0.field1136 == 2) {
            var1 = Statics.field282.method2609(arg0.field1138, arg0.field1137, arg0.field1142);
        }
        if (arg0.field1136 == 3) {
            var1 = Statics.field282.method2610(arg0.field1138, arg0.field1137, arg0.field1142);
        }
        if (var1 != 0) {
            int var5 = Statics.field282.method2611(arg0.field1138, arg0.field1137, arg0.field1142, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1135 = var2;
        arg0.field1141 = var3;
        arg0.field1140 = var4;
    }

    @ObfuscatedName("fv.hl(I)V")
    public static final void method3263() {
        for (class77 var0 = (class77) field888.method3500(); var0 != null; var0 = (class77) field888.method3511()) {
            if (var0.field1146 > 0) {
                var0.field1146--;
            }
            if (var0.field1146 == 0) {
                if (var0.field1135 >= 0) {
                    int var1 = var0.field1135;
                    int var2 = var0.field1141;
                    class263 var3 = class263.method10(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method4351(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method992(var0.field1138, var0.field1136, var0.field1137, var0.field1142, var0.field1135, var0.field1140, var0.field1141);
                var0.method3475();
            } else {
                if (var0.field1145 > 0) {
                    var0.field1145--;
                }
                if (var0.field1145 == 0 && var0.field1137 >= 1 && var0.field1142 >= 1 && var0.field1137 <= 102 && var0.field1142 <= 102) {
                    if (var0.field1139 >= 0) {
                        int var5 = var0.field1139;
                        int var6 = var0.field1144;
                        class263 var7 = class263.method10(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method4351(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method992(var0.field1138, var0.field1136, var0.field1137, var0.field1142, var0.field1139, var0.field1143, var0.field1144);
                    var0.field1145 = -1;
                    if (var0.field1139 == var0.field1135 && var0.field1135 == -1) {
                        var0.method3475();
                    } else if (var0.field1139 == var0.field1135 && var0.field1143 == var0.field1140 && var0.field1144 == var0.field1141) {
                        var0.method3475();
                    }
                }
            }
        }
    }

    @ObfuscatedName("bz.hd(IIIIIIII)V")
    public static final void method992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field1111 && Statics.field3219 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field282.method2607(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field282.method2687(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field282.method2609(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field282.method2610(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field282.method2611(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field282.method2598(arg0, arg2, arg3);
                class263 var15 = class263.method10(var12);
                if (var15.field3525 != 0) {
                    field1086[arg0].method2897(arg2, arg3, var13, var14, var15.field3518);
                }
            }
            if (arg1 == 1) {
                Statics.field282.method2599(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field282.method2600(arg0, arg2, arg3);
                class263 var16 = class263.method10(var12);
                if (var16.field3550 + arg2 > 103 || var16.field3550 + arg3 > 103 || var16.field3508 + arg2 > 103 || var16.field3508 + arg3 > 103) {
                    return;
                }
                if (var16.field3525 != 0) {
                    field1086[arg0].method2928(arg2, arg3, var16.field3550, var16.field3508, var14, var16.field3518);
                }
            }
            if (arg1 == 3) {
                Statics.field282.method2650(arg0, arg2, arg3);
                class263 var17 = class263.method10(var12);
                if (var17.field3525 == 1) {
                    field1086[arg0].method2900(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class62.field723[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class62.method1615(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field282, field1086[arg0]);
    }

    @ObfuscatedName("ee.hp(III)V")
    public static final void method2768(int arg0, int arg1) {
        class201 var2 = field985[Statics.field3219][arg0][arg1];
        if (var2 == null) {
            Statics.field282.method2580(Statics.field3219, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class94 var5 = null;
        for (class94 var6 = (class94) var2.method3500(); var6 != null; var6 = (class94) var2.method3511()) {
            class264 var7 = class264.method482(var6.field1404);
            long var8 = (long) var7.field3574;
            if (var7.field3573 == 1) {
                var8 = (long) (var6.field1405 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field282.method2580(Statics.field3219, arg0, arg1);
            return;
        }
        var2.method3497(var5);
        class94 var10 = null;
        class94 var11 = null;
        for (class94 var12 = (class94) var2.method3500(); var12 != null; var12 = (class94) var2.method3511()) {
            if (var5.field1404 != var12.field1404) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1404 != var12.field1404 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field282.method2588(Statics.field3219, arg0, arg1, method545(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field3219), var5, var13, var10, var11);
    }

    @ObfuscatedName("k.hy(ZLgv;B)V")
    public static final void method5(boolean arg0, class187 arg1) {
        field933 = 0;
        field1046 = 0;
        method109();
        Statics.method632(arg0, arg1);
        for (int var2 = 0; var2 < field1046; var2++) {
            int var3 = field916[var2];
            class86 var4 = field915[var3];
            int var5 = arg1.method3204();
            if ((var5 & 0x1) != 0) {
                var4.field1296 = class266.method4(arg1.method3075());
                var4.field1148 = var4.field1296.field3620;
                var4.field1200 = var4.field1296.field3614;
                var4.field1155 = var4.field1296.field3642;
                var4.field1156 = var4.field1296.field3618;
                var4.field1157 = var4.field1296.field3641;
                var4.field1158 = var4.field1296.field3629;
                var4.field1152 = var4.field1296.field3623;
                var4.field1153 = var4.field1296.field3624;
                var4.field1154 = var4.field1296.field3625;
            }
            if ((var5 & 0x10) != 0) {
                var4.field1201 = arg1.method3073();
                int var6 = arg1.method3041();
                var4.field1188 = var6 >> 16;
                var4.field1182 = (var6 & 0xFFFF) + field881;
                var4.field1185 = 0;
                var4.field1186 = 0;
                if (var4.field1182 > field881) {
                    var4.field1185 = -1;
                }
                if (var4.field1201 == 65535) {
                    var4.field1201 = -1;
                }
            }
            if ((var5 & 0x4) != 0) {
                int var7 = arg1.method3073();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = arg1.method3197();
                if (var4.field1192 == var7 && var7 != -1) {
                    int var9 = class268.method76(var7).field3682;
                    if (var9 == 1) {
                        var4.field1206 = 0;
                        var4.field1181 = 0;
                        var4.field1150 = var8;
                        var4.field1183 = 0;
                    }
                    if (var9 == 2) {
                        var4.field1183 = 0;
                    }
                } else if (var7 == -1 || var4.field1192 == -1 || class268.method76(var7).field3676 >= class268.method76(var4.field1192).field3676) {
                    var4.field1192 = var7;
                    var4.field1206 = 0;
                    var4.field1181 = 0;
                    var4.field1150 = var8;
                    var4.field1183 = 0;
                    var4.field1160 = var4.field1184;
                }
            }
            if ((var5 & 0x8) != 0) {
                int var10 = arg1.method3162();
                if (var10 > 0) {
                    for (int var11 = 0; var11 < var10; var11++) {
                        int var12 = -1;
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = arg1.method3044();
                        if (var15 == 32767) {
                            var15 = arg1.method3044();
                            var13 = arg1.method3044();
                            var12 = arg1.method3044();
                            var14 = arg1.method3044();
                        } else if (var15 == 32766) {
                            var15 = -1;
                        } else {
                            var13 = arg1.method3044();
                        }
                        int var16 = arg1.method3044();
                        var4.method1458(var15, var13, var12, var14, field881, var16);
                    }
                }
                int var17 = arg1.method3162();
                if (var17 > 0) {
                    for (int var18 = 0; var18 < var17; var18++) {
                        int var19 = arg1.method3044();
                        int var20 = arg1.method3044();
                        if (var20 == 32767) {
                            var4.method1457(var19);
                        } else {
                            int var21 = arg1.method3044();
                            int var22 = arg1.method3204();
                            int var23 = var20 > 0 ? arg1.method3204() : var22;
                            var4.method1456(var19, field881, var20, var21, var22, var23);
                        }
                    }
                }
            }
            if ((var5 & 0x2) != 0) {
                int var24 = arg1.method3179();
                int var25 = arg1.method3075();
                int var26 = var4.field1149 - (var24 - Statics.field3306 - Statics.field3306) * 64;
                int var27 = var4.field1198 - (var25 - Statics.field2066 - Statics.field2066) * 64;
                if (var26 != 0 || var27 != 0) {
                    var4.field1175 = (int) (Math.atan2((double) var26, (double) var27) * 325.949D) & 0x7FF;
                }
            }
            if ((var5 & 0x40) != 0) {
                var4.field1193 = arg1.method3045();
                var4.field1178 = 100;
            }
            if ((var5 & 0x20) != 0) {
                var4.field1173 = arg1.method3073();
                if (var4.field1173 == 65535) {
                    var4.field1173 = -1;
                }
            }
        }
        for (int var28 = 0; var28 < field933; var28++) {
            int var29 = field979[var28];
            if (field881 != field915[var29].field1196) {
                field915[var29].field1296 = null;
                field915[var29] = null;
            }
        }
        if (field917.field1473 != arg1.field2498) {
            throw new RuntimeException(arg1.field2498 + class88.field1312 + field917.field1473);
        }
        for (int var30 = 0; var30 < field913; var30++) {
            if (field915[field1121[var30]] == null) {
                throw new RuntimeException(var30 + class88.field1312 + field913);
            }
        }
    }

    @ObfuscatedName("f.hs(I)V")
    public static final void method109() {
        class187 var0 = field917.field1466;
        var0.method3295();
        int var1 = var0.method3296(8);
        if (var1 < field913) {
            for (int var2 = var1; var2 < field913; var2++) {
                field979[++field933 - 1] = field1121[var2];
            }
        }
        if (var1 > field913) {
            throw new RuntimeException("");
        }
        field913 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field1121[var3];
            class86 var5 = field915[var4];
            int var6 = var0.method3296(1);
            if (var6 == 0) {
                field1121[++field913 - 1] = var4;
                var5.field1196 = field881;
            } else {
                int var7 = var0.method3296(2);
                if (var7 == 0) {
                    field1121[++field913 - 1] = var4;
                    var5.field1196 = field881;
                    field916[++field1046 - 1] = var4;
                } else if (var7 == 1) {
                    field1121[++field913 - 1] = var4;
                    var5.field1196 = field881;
                    int var8 = var0.method3296(3);
                    var5.method1610(var8, (byte) 1);
                    int var9 = var0.method3296(1);
                    if (var9 == 1) {
                        field916[++field1046 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field1121[++field913 - 1] = var4;
                    var5.field1196 = field881;
                    int var10 = var0.method3296(3);
                    var5.method1610(var10, (byte) 2);
                    int var11 = var0.method3296(3);
                    var5.method1610(var11, (byte) 2);
                    int var12 = var0.method3296(1);
                    if (var12 == 1) {
                        field916[++field1046 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field979[++field933 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("gc.hx(Lbw;IIBS)V")
    public static final void method3276(class74 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field1187[0];
        int var5 = arg0.field1203[0];
        int var6 = arg0.method1058();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method1058();
        class165 var8 = method1597(arg1, arg2);
        class163 var9 = field1086[arg0.field854];
        int[] var10 = field1132;
        int[] var11 = field889;
        for (int var12 = 0; var12 < 128; var12++) {
            for (int var13 = 0; var13 < 128; var13++) {
                class164.field2206[var12][var13] = 0;
                class164.field2205[var12][var13] = 99999999;
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
            class164.field2206[var16][var17] = 99;
            class164.field2205[var16][var17] = 0;
            byte var20 = 0;
            int var21 = 0;
            class164.field2210[var20] = var4;
            int var93 = var20 + 1;
            class164.field2208[var20] = var5;
            int[][] var22 = var9.field2195;
            boolean var27;
            while (true) {
                if (var93 == var21) {
                    Statics.field2204 = var14;
                    Statics.field1465 = var15;
                    var27 = false;
                    break;
                }
                var14 = class164.field2210[var21];
                var15 = class164.field2208[var21];
                var21 = var21 + 1 & 0xFFF;
                int var23 = var14 - var18;
                int var24 = var15 - var19;
                int var25 = var14 - var9.field2198;
                int var26 = var15 - var9.field2199;
                if (var8.method1050(1, var14, var15, var9)) {
                    Statics.field2204 = var14;
                    Statics.field1465 = var15;
                    var27 = true;
                    break;
                }
                int var28 = class164.field2205[var23][var24] + 1;
                if (var23 > 0 && class164.field2206[var23 - 1][var24] == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0) {
                    class164.field2210[var93] = var14 - 1;
                    class164.field2208[var93] = var15;
                    var93 = var93 + 1 & 0xFFF;
                    class164.field2206[var23 - 1][var24] = 2;
                    class164.field2205[var23 - 1][var24] = var28;
                }
                if (var23 < 127 && class164.field2206[var23 + 1][var24] == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0) {
                    class164.field2210[var93] = var14 + 1;
                    class164.field2208[var93] = var15;
                    var93 = var93 + 1 & 0xFFF;
                    class164.field2206[var23 + 1][var24] = 8;
                    class164.field2205[var23 + 1][var24] = var28;
                }
                if (var24 > 0 && class164.field2206[var23][var24 - 1] == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class164.field2210[var93] = var14;
                    class164.field2208[var93] = var15 - 1;
                    var93 = var93 + 1 & 0xFFF;
                    class164.field2206[var23][var24 - 1] = 1;
                    class164.field2205[var23][var24 - 1] = var28;
                }
                if (var24 < 127 && class164.field2206[var23][var24 + 1] == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class164.field2210[var93] = var14;
                    class164.field2208[var93] = var15 + 1;
                    var93 = var93 + 1 & 0xFFF;
                    class164.field2206[var23][var24 + 1] = 4;
                    class164.field2205[var23][var24 + 1] = var28;
                }
                if (var23 > 0 && var24 > 0 && class164.field2206[var23 - 1][var24 - 1] == 0 && (var22[var25 - 1][var26 - 1] & 0x124010E) == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class164.field2210[var93] = var14 - 1;
                    class164.field2208[var93] = var15 - 1;
                    var93 = var93 + 1 & 0xFFF;
                    class164.field2206[var23 - 1][var24 - 1] = 3;
                    class164.field2205[var23 - 1][var24 - 1] = var28;
                }
                if (var23 < 127 && var24 > 0 && class164.field2206[var23 + 1][var24 - 1] == 0 && (var22[var25 + 1][var26 - 1] & 0x1240183) == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class164.field2210[var93] = var14 + 1;
                    class164.field2208[var93] = var15 - 1;
                    var93 = var93 + 1 & 0xFFF;
                    class164.field2206[var23 + 1][var24 - 1] = 9;
                    class164.field2205[var23 + 1][var24 - 1] = var28;
                }
                if (var23 > 0 && var24 < 127 && class164.field2206[var23 - 1][var24 + 1] == 0 && (var22[var25 - 1][var26 + 1] & 0x1240138) == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class164.field2210[var93] = var14 - 1;
                    class164.field2208[var93] = var15 + 1;
                    var93 = var93 + 1 & 0xFFF;
                    class164.field2206[var23 - 1][var24 + 1] = 6;
                    class164.field2205[var23 - 1][var24 + 1] = var28;
                }
                if (var23 < 127 && var24 < 127 && class164.field2206[var23 + 1][var24 + 1] == 0 && (var22[var25 + 1][var26 + 1] & 0x12401E0) == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class164.field2210[var93] = var14 + 1;
                    class164.field2208[var93] = var15 + 1;
                    var93 = var93 + 1 & 0xFFF;
                    class164.field2206[var23 + 1][var24 + 1] = 12;
                    class164.field2205[var23 + 1][var24 + 1] = var28;
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
            class164.field2206[var32][var33] = 99;
            class164.field2205[var32][var33] = 0;
            byte var36 = 0;
            int var37 = 0;
            class164.field2210[var36] = var4;
            int var94 = var36 + 1;
            class164.field2208[var36] = var5;
            int[][] var38 = var9.field2195;
            boolean var43;
            while (true) {
                if (var94 == var37) {
                    Statics.field2204 = var30;
                    Statics.field1465 = var31;
                    var43 = false;
                    break;
                }
                var30 = class164.field2210[var37];
                var31 = class164.field2208[var37];
                var37 = var37 + 1 & 0xFFF;
                int var39 = var30 - var34;
                int var40 = var31 - var35;
                int var41 = var30 - var9.field2198;
                int var42 = var31 - var9.field2199;
                if (var8.method1050(2, var30, var31, var9)) {
                    Statics.field2204 = var30;
                    Statics.field1465 = var31;
                    var43 = true;
                    break;
                }
                int var44 = class164.field2205[var39][var40] + 1;
                if (var39 > 0 && class164.field2206[var39 - 1][var40] == 0 && (var38[var41 - 1][var42] & 0x124010E) == 0 && (var38[var41 - 1][var42 + 1] & 0x1240138) == 0) {
                    class164.field2210[var94] = var30 - 1;
                    class164.field2208[var94] = var31;
                    var94 = var94 + 1 & 0xFFF;
                    class164.field2206[var39 - 1][var40] = 2;
                    class164.field2205[var39 - 1][var40] = var44;
                }
                if (var39 < 126 && class164.field2206[var39 + 1][var40] == 0 && (var38[var41 + 2][var42] & 0x1240183) == 0 && (var38[var41 + 2][var42 + 1] & 0x12401E0) == 0) {
                    class164.field2210[var94] = var30 + 1;
                    class164.field2208[var94] = var31;
                    var94 = var94 + 1 & 0xFFF;
                    class164.field2206[var39 + 1][var40] = 8;
                    class164.field2205[var39 + 1][var40] = var44;
                }
                if (var40 > 0 && class164.field2206[var39][var40 - 1] == 0 && (var38[var41][var42 - 1] & 0x124010E) == 0 && (var38[var41 + 1][var42 - 1] & 0x1240183) == 0) {
                    class164.field2210[var94] = var30;
                    class164.field2208[var94] = var31 - 1;
                    var94 = var94 + 1 & 0xFFF;
                    class164.field2206[var39][var40 - 1] = 1;
                    class164.field2205[var39][var40 - 1] = var44;
                }
                if (var40 < 126 && class164.field2206[var39][var40 + 1] == 0 && (var38[var41][var42 + 2] & 0x1240138) == 0 && (var38[var41 + 1][var42 + 2] & 0x12401E0) == 0) {
                    class164.field2210[var94] = var30;
                    class164.field2208[var94] = var31 + 1;
                    var94 = var94 + 1 & 0xFFF;
                    class164.field2206[var39][var40 + 1] = 4;
                    class164.field2205[var39][var40 + 1] = var44;
                }
                if (var39 > 0 && var40 > 0 && class164.field2206[var39 - 1][var40 - 1] == 0 && (var38[var41 - 1][var42] & 0x124013E) == 0 && (var38[var41 - 1][var42 - 1] & 0x124010E) == 0 && (var38[var41][var42 - 1] & 0x124018F) == 0) {
                    class164.field2210[var94] = var30 - 1;
                    class164.field2208[var94] = var31 - 1;
                    var94 = var94 + 1 & 0xFFF;
                    class164.field2206[var39 - 1][var40 - 1] = 3;
                    class164.field2205[var39 - 1][var40 - 1] = var44;
                }
                if (var39 < 126 && var40 > 0 && class164.field2206[var39 + 1][var40 - 1] == 0 && (var38[var41 + 1][var42 - 1] & 0x124018F) == 0 && (var38[var41 + 2][var42 - 1] & 0x1240183) == 0 && (var38[var41 + 2][var42] & 0x12401E3) == 0) {
                    class164.field2210[var94] = var30 + 1;
                    class164.field2208[var94] = var31 - 1;
                    var94 = var94 + 1 & 0xFFF;
                    class164.field2206[var39 + 1][var40 - 1] = 9;
                    class164.field2205[var39 + 1][var40 - 1] = var44;
                }
                if (var39 > 0 && var40 < 126 && class164.field2206[var39 - 1][var40 + 1] == 0 && (var38[var41 - 1][var42 + 1] & 0x124013E) == 0 && (var38[var41 - 1][var42 + 2] & 0x1240138) == 0 && (var38[var41][var42 + 2] & 0x12401F8) == 0) {
                    class164.field2210[var94] = var30 - 1;
                    class164.field2208[var94] = var31 + 1;
                    var94 = var94 + 1 & 0xFFF;
                    class164.field2206[var39 - 1][var40 + 1] = 6;
                    class164.field2205[var39 - 1][var40 + 1] = var44;
                }
                if (var39 < 126 && var40 < 126 && class164.field2206[var39 + 1][var40 + 1] == 0 && (var38[var41 + 1][var42 + 2] & 0x12401F8) == 0 && (var38[var41 + 2][var42 + 2] & 0x12401E0) == 0 && (var38[var41 + 2][var42 + 1] & 0x12401E3) == 0) {
                    class164.field2210[var94] = var30 + 1;
                    class164.field2208[var94] = var31 + 1;
                    var94 = var94 + 1 & 0xFFF;
                    class164.field2206[var39 + 1][var40 + 1] = 12;
                    class164.field2205[var39 + 1][var40 + 1] = var44;
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
            class164.field2206[var47][var48] = 99;
            class164.field2205[var47][var48] = 0;
            byte var51 = 0;
            int var52 = 0;
            class164.field2210[var51] = var4;
            int var95 = var51 + 1;
            class164.field2208[var51] = var5;
            int[][] var53 = var9.field2195;
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
                                        Statics.field2204 = var45;
                                        Statics.field1465 = var46;
                                        var58 = false;
                                        break label643;
                                    }
                                    var45 = class164.field2210[var52];
                                    var46 = class164.field2208[var52];
                                    var52 = var52 + 1 & 0xFFF;
                                    var54 = var45 - var49;
                                    var55 = var46 - var50;
                                    var56 = var45 - var9.field2198;
                                    var57 = var46 - var9.field2199;
                                    if (var8.method1050(var7, var45, var46, var9)) {
                                        Statics.field2204 = var45;
                                        Statics.field1465 = var46;
                                        var58 = true;
                                        break label643;
                                    }
                                    var59 = class164.field2205[var54][var55] + 1;
                                    if (var54 > 0 && class164.field2206[var54 - 1][var55] == 0 && (var53[var56 - 1][var57] & 0x124010E) == 0 && (var53[var56 - 1][var7 + var57 - 1] & 0x1240138) == 0) {
                                        int var60 = 1;
                                        while (true) {
                                            if (var60 >= var7 - 1) {
                                                class164.field2210[var95] = var45 - 1;
                                                class164.field2208[var95] = var46;
                                                var95 = var95 + 1 & 0xFFF;
                                                class164.field2206[var54 - 1][var55] = 2;
                                                class164.field2205[var54 - 1][var55] = var59;
                                                break;
                                            }
                                            if ((var53[var56 - 1][var57 + var60] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var60++;
                                        }
                                    }
                                    if (var54 < 128 - var7 && class164.field2206[var54 + 1][var55] == 0 && (var53[var7 + var56][var57] & 0x1240183) == 0 && (var53[var7 + var56][var7 + var57 - 1] & 0x12401E0) == 0) {
                                        int var61 = 1;
                                        while (true) {
                                            if (var61 >= var7 - 1) {
                                                class164.field2210[var95] = var45 + 1;
                                                class164.field2208[var95] = var46;
                                                var95 = var95 + 1 & 0xFFF;
                                                class164.field2206[var54 + 1][var55] = 8;
                                                class164.field2205[var54 + 1][var55] = var59;
                                                break;
                                            }
                                            if ((var53[var7 + var56][var57 + var61] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var61++;
                                        }
                                    }
                                    if (var55 > 0 && class164.field2206[var54][var55 - 1] == 0 && (var53[var56][var57 - 1] & 0x124010E) == 0 && (var53[var7 + var56 - 1][var57 - 1] & 0x1240183) == 0) {
                                        int var62 = 1;
                                        while (true) {
                                            if (var62 >= var7 - 1) {
                                                class164.field2210[var95] = var45;
                                                class164.field2208[var95] = var46 - 1;
                                                var95 = var95 + 1 & 0xFFF;
                                                class164.field2206[var54][var55 - 1] = 1;
                                                class164.field2205[var54][var55 - 1] = var59;
                                                break;
                                            }
                                            if ((var53[var56 + var62][var57 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var62++;
                                        }
                                    }
                                    if (var55 < 128 - var7 && class164.field2206[var54][var55 + 1] == 0 && (var53[var56][var7 + var57] & 0x1240138) == 0 && (var53[var7 + var56 - 1][var7 + var57] & 0x12401E0) == 0) {
                                        int var63 = 1;
                                        while (true) {
                                            if (var63 >= var7 - 1) {
                                                class164.field2210[var95] = var45;
                                                class164.field2208[var95] = var46 + 1;
                                                var95 = var95 + 1 & 0xFFF;
                                                class164.field2206[var54][var55 + 1] = 4;
                                                class164.field2205[var54][var55 + 1] = var59;
                                                break;
                                            }
                                            if ((var53[var56 + var63][var7 + var57] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var63++;
                                        }
                                    }
                                    if (var54 > 0 && var55 > 0 && class164.field2206[var54 - 1][var55 - 1] == 0 && (var53[var56 - 1][var57 - 1] & 0x124010E) == 0) {
                                        int var64 = 1;
                                        while (true) {
                                            if (var64 >= var7) {
                                                class164.field2210[var95] = var45 - 1;
                                                class164.field2208[var95] = var46 - 1;
                                                var95 = var95 + 1 & 0xFFF;
                                                class164.field2206[var54 - 1][var55 - 1] = 3;
                                                class164.field2205[var54 - 1][var55 - 1] = var59;
                                                break;
                                            }
                                            if ((var53[var56 - 1][var57 - 1 + var64] & 0x124013E) != 0 || (var53[var56 - 1 + var64][var57 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var64++;
                                        }
                                    }
                                    if (var54 < 128 - var7 && var55 > 0 && class164.field2206[var54 + 1][var55 - 1] == 0 && (var53[var7 + var56][var57 - 1] & 0x1240183) == 0) {
                                        int var65 = 1;
                                        while (true) {
                                            if (var65 >= var7) {
                                                class164.field2210[var95] = var45 + 1;
                                                class164.field2208[var95] = var46 - 1;
                                                var95 = var95 + 1 & 0xFFF;
                                                class164.field2206[var54 + 1][var55 - 1] = 9;
                                                class164.field2205[var54 + 1][var55 - 1] = var59;
                                                break;
                                            }
                                            if ((var53[var7 + var56][var57 - 1 + var65] & 0x12401E3) != 0 || (var53[var56 + var65][var57 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var65++;
                                        }
                                    }
                                    if (var54 > 0 && var55 < 128 - var7 && class164.field2206[var54 - 1][var55 + 1] == 0 && (var53[var56 - 1][var7 + var57] & 0x1240138) == 0) {
                                        for (int var66 = 1; var66 < var7; var66++) {
                                            if ((var53[var56 - 1][var57 + var66] & 0x124013E) != 0 || (var53[var56 - 1 + var66][var7 + var57] & 0x12401F8) != 0) {
                                                continue label618;
                                            }
                                        }
                                        class164.field2210[var95] = var45 - 1;
                                        class164.field2208[var95] = var46 + 1;
                                        var95 = var95 + 1 & 0xFFF;
                                        class164.field2206[var54 - 1][var55 + 1] = 6;
                                        class164.field2205[var54 - 1][var55 + 1] = var59;
                                    }
                                } while (var54 >= 128 - var7);
                            } while (var55 >= 128 - var7);
                        } while (class164.field2206[var54 + 1][var55 + 1] != 0);
                    } while ((var53[var7 + var56][var7 + var57] & 0x12401E0) != 0);
                    for (int var67 = 1; var67 < var7; var67++) {
                        if ((var53[var56 + var67][var7 + var57] & 0x12401F8) != 0 || (var53[var7 + var56][var57 + var67] & 0x12401E3) != 0) {
                            continue label641;
                        }
                    }
                    class164.field2210[var95] = var45 + 1;
                    class164.field2208[var95] = var46 + 1;
                    var95 = var95 + 1 & 0xFFF;
                    class164.field2206[var54 + 1][var55 + 1] = 12;
                    class164.field2205[var54 + 1][var55 + 1] = var59;
                }
            }
            var29 = var58;
        }
        int var86;
        label709: {
            int var68 = var4 - 64;
            int var69 = var5 - 64;
            int var70 = Statics.field2204;
            int var71 = Statics.field1465;
            if (!var29) {
                int var72 = Integer.MAX_VALUE;
                int var73 = Integer.MAX_VALUE;
                byte var74 = 10;
                int var75 = var8.field2211;
                int var76 = var8.field2212;
                int var77 = var8.field2213;
                int var78 = var8.field2219;
                for (int var79 = var75 - var74; var79 <= var74 + var75; var79++) {
                    for (int var80 = var76 - var74; var80 <= var74 + var76; var80++) {
                        int var81 = var79 - var68;
                        int var82 = var80 - var69;
                        if (var81 >= 0 && var82 >= 0 && var81 < 128 && var82 < 128 && class164.field2205[var81][var82] < 100) {
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
                            if (var85 < var72 || var72 == var85 && class164.field2205[var81][var82] < var73) {
                                var72 = var85;
                                var73 = class164.field2205[var81][var82];
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
                class164.field2210[var87] = var70;
                int var96 = var87 + 1;
                class164.field2208[var87] = var71;
                int var88;
                int var89 = var88 = class164.field2206[var70 - var68][var71 - var69];
                while (var4 != var70 || var5 != var71) {
                    if (var88 != var89) {
                        var88 = var89;
                        class164.field2210[var96] = var70;
                        class164.field2208[var96++] = var71;
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
                    var89 = class164.field2206[var70 - var68][var71 - var69];
                }
                int var90 = 0;
                while (var96-- > 0) {
                    var10[var90] = class164.field2210[var96];
                    var11[var90++] = class164.field2208[var96];
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
                arg0.method1064(field1132[var92], field889[var92], arg3);
            }
        }
    }

    @ObfuscatedName("cy.hh(IIB)Lfd;")
    public static class165 method1597(int arg0, int arg1) {
        field876.field2211 = arg0;
        field876.field2212 = arg1;
        field876.field2213 = 1;
        field876.field2219 = 1;
        return field876;
    }

    @ObfuscatedName("bm.hb(I)V")
    public static void method1007() {
        field994 = 0;
        field1072 = false;
    }

    @ObfuscatedName("it.ho(I)V")
    public static void method3931() {
        method1007();
        field999[0] = class233.field3170;
        field1000[0] = "";
        field997[0] = 1006;
        field890[0] = false;
        field994 = 1;
    }

    @ObfuscatedName("ar.hv(IIIII)V")
    public static final void method563(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1036; var4++) {
            if (field990[var4] + field1063[var4] > arg0 && field1063[var4] < arg0 + arg2 && field1066[var4] + field1064[var4] > arg1 && field1064[var4] < arg1 + arg3) {
                field1060[var4] = true;
            }
        }
    }

    @ObfuscatedName("fw.hg(IIIII)V")
    public static final void method3016(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1036; var4++) {
            if (field990[var4] + field1063[var4] > arg0 && field1063[var4] < arg0 + arg2 && field1066[var4] + field1064[var4] > arg1 && field1064[var4] < arg1 + arg3) {
                field1100[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hz(I)V")
    public final void method1110() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field994 - 1; var2++) {
                if (field997[var2] < 1000 && field997[var2 + 1] > 1000) {
                    String var3 = field1000[var2];
                    field1000[var2] = field1000[var2 + 1];
                    field1000[var2 + 1] = var3;
                    String var4 = field999[var2];
                    field999[var2] = field999[var2 + 1];
                    field999[var2 + 1] = var4;
                    int var5 = field997[var2];
                    field997[var2] = field997[var2 + 1];
                    field997[var2 + 1] = var5;
                    int var6 = field1048[var2];
                    field1048[var2] = field1048[var2 + 1];
                    field1048[var2 + 1] = var6;
                    int var7 = field996[var2];
                    field996[var2] = field996[var2 + 1];
                    field996[var2 + 1] = var7;
                    int var8 = field988[var2];
                    field988[var2] = field988[var2 + 1];
                    field988[var2 + 1] = var8;
                    boolean var9 = field890[var2];
                    field890[var2] = field890[var2 + 1];
                    field890[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field493 != null || field1028 != null) {
            return;
        }
        int var10 = class60.field709;
        if (field1072) {
            if (var10 != 1 && (Statics.field957 || var10 != 4)) {
                int var11 = class60.field704;
                int var12 = class60.field716 * 10625923;
                if (var11 < Statics.field2452 - 10 || var11 > Statics.field416 + Statics.field2452 + 10 || var12 < Statics.field12 - 10 || var12 > Statics.field1376 + Statics.field12 + 10) {
                    field1072 = false;
                    method563(Statics.field2452, Statics.field12, Statics.field416, Statics.field1376);
                }
            }
            if (var10 == 1 || !Statics.field957 && var10 == 4) {
                int var13 = Statics.field2452;
                int var14 = Statics.field12;
                int var15 = Statics.field416;
                int var16 = class60.field710;
                int var17 = class60.field711;
                int var18 = -1;
                for (int var19 = 0; var19 < field994; var19++) {
                    int var20 = (field994 - 1 - var19) * 15 + var14 + 31;
                    if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                        var18 = var19;
                    }
                }
                if (var18 != -1) {
                    method1028(var18);
                }
                field1072 = false;
                method563(Statics.field2452, Statics.field12, Statics.field416, Statics.field1376);
            }
            return;
        }
        int var21 = field994 - 1;
        if ((var10 == 1 || !Statics.field957 && var10 == 4) && var21 >= 0) {
            int var23 = field997[var21];
            if (var23 == 39 || var23 == 40 || var23 == 41 || var23 == 42 || var23 == 43 || var23 == 33 || var23 == 34 || var23 == 35 || var23 == 36 || var23 == 37 || var23 == 38 || var23 == 1005) {
                label208: {
                    int var24 = field1048[var21];
                    int var25 = field996[var21];
                    class224 var26 = class224.method1627(var25);
                    int var27 = method1097(var26);
                    boolean var28 = (var27 >> 28 & 0x1) != 0;
                    if (!var28) {
                        class225 var10000 = (class225) null;
                        if (!class225.method2844(method1097(var26))) {
                            break label208;
                        }
                    }
                    if (Statics.field493 != null && !field972 && field994 > 0 && !this.method1111()) {
                        method2003(field969, field970);
                    }
                    field972 = false;
                    field1013 = 0;
                    if (Statics.field493 != null) {
                        method503(Statics.field493);
                    }
                    Statics.field493 = class224.method1627(var25);
                    field1077 = var24;
                    field969 = class60.field710;
                    field970 = class60.field711;
                    if (var21 >= 0) {
                        Statics.method45(var21);
                    }
                    method503(Statics.field493);
                    return;
                }
            }
        }
        if ((var10 == 1 || !Statics.field957 && var10 == 4) && this.method1111()) {
            var10 = 2;
        }
        if ((var10 == 1 || !Statics.field957 && var10 == 4) && field994 > 0) {
            method1028(var21);
        }
        if (var10 == 2 && field994 > 0) {
            this.method1112(class60.field710, class60.field711);
        }
    }

    @ObfuscatedName("client.he(I)Z")
    public final boolean method1111() {
        int var1 = field994 - 1;
        return field994 > 2 && (field1022 == 1 && !field890[var1] || method2777(var1));
    }

    @ObfuscatedName("client.hm(III)V")
    public final void method1112(int arg0, int arg1) {
        int var3 = Statics.field1227.method4578(class233.field3084);
        for (int var4 = 0; var4 < field994; var4++) {
            int var5 = Statics.field1227.method4578(method2782(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field994 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field1308) {
            var7 = Statics.field1308 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field674) {
            var8 = Statics.field674 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field282.method2754(Statics.field3219, arg0, arg1, false);
        field1072 = true;
        Statics.field2452 = var7;
        Statics.field12 = var8;
        Statics.field416 = var3;
        Statics.field1376 = field994 * 15 + 22;
    }

    @ObfuscatedName("ez.hi(II)Z")
    public static final boolean method2777(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field997[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("bx.hq(IB)V")
    public static final void method1028(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field1048[arg0];
        int var2 = field996[arg0];
        int var3 = field997[arg0];
        int var4 = field988[arg0];
        String var5 = field999[arg0];
        String var6 = field1000[arg0];
        method2293(var1, var2, var3, var4, var5, var6, class60.field710, class60.field711);
    }

    @ObfuscatedName("dy.ij(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method2293(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 26) {
            method237();
        }
        if (arg2 == 34) {
            class171 var8 = class171.method3795(class168.field2392, field917.field1471);
            var8.field2423.method3070(arg0);
            var8.field2423.method3040(arg3);
            var8.field2423.method3140(arg1);
            field917.method1777(var8);
            field966 = 0;
            Statics.field623 = class224.method1627(arg1);
            field967 = arg0;
        }
        if (arg2 == 36) {
            class171 var9 = class171.method3795(class168.field2332, field917.field1471);
            var9.field2423.method3021(arg3);
            var9.field2423.method3021(arg0);
            var9.field2423.method3105(arg1);
            field917.method1777(var9);
            field966 = 0;
            Statics.field623 = class224.method1627(arg1);
            field967 = arg0;
        }
        if (arg2 == 22) {
            field1065 = arg6;
            field963 = arg7;
            field965 = 2;
            field964 = 0;
            field1087 = arg0;
            field1088 = arg1;
            class171 var10 = class171.method3795(class168.field2372, field917.field1471);
            var10.field2423.method3070(Statics.field3306 + arg0);
            var10.field2423.method3072(Statics.field2066 + arg1);
            var10.field2423.method3070(arg3);
            var10.field2423.method3062(class51.field607[82] ? 1 : 0);
            field917.method1777(var10);
        }
        if (arg2 == 24) {
            class224 var11 = class224.method1627(arg1);
            boolean var12 = true;
            if (var11.field2729 > 0) {
                var12 = method2770(var11);
            }
            if (var12) {
                class171 var13 = class171.method3795(class168.field2342, field917.field1471);
                var13.field2423.method3149(arg1);
                field917.method1777(var13);
            }
        }
        if (arg2 == 44) {
            class74 var14 = field1054[arg3];
            if (var14 != null) {
                field1065 = arg6;
                field963 = arg7;
                field965 = 2;
                field964 = 0;
                field1087 = arg0;
                field1088 = arg1;
                class171 var15 = class171.method3795(class168.field2369, field917.field1471);
                var15.field2423.method3062(class51.field607[82] ? 1 : 0);
                var15.field2423.method3021(arg3);
                field917.method1777(var15);
            }
        }
        if (arg2 == 1) {
            field1065 = arg6;
            field963 = arg7;
            field965 = 2;
            field964 = 0;
            field1087 = arg0;
            field1088 = arg1;
            class171 var16 = class171.method3795(class168.field2345, field917.field1471);
            var16.field2423.method3020(class51.field607[82] ? 1 : 0);
            var16.field2423.method3021(Statics.field1410);
            var16.field2423.method3072(Statics.field3306 + arg0);
            var16.field2423.method3021(Statics.field469);
            var16.field2423.method3105(Statics.field2676);
            var16.field2423.method3070(Statics.field2066 + arg1);
            var16.field2423.method3072(arg3 >> 14 & 0x7FFF);
            field917.method1777(var16);
        }
        if (arg2 == 31) {
            class171 var17 = class171.method3795(class168.field2366, field917.field1471);
            var17.field2423.method3070(arg0);
            var17.field2423.method3072(arg3);
            var17.field2423.method3149(Statics.field2676);
            var17.field2423.method3021(Statics.field469);
            var17.field2423.method3040(Statics.field1410);
            var17.field2423.method3140(arg1);
            field917.method1777(var17);
            field966 = 0;
            Statics.field623 = class224.method1627(arg1);
            field967 = arg0;
        }
        if (arg2 == 49) {
            class74 var18 = field1054[arg3];
            if (var18 != null) {
                field1065 = arg6;
                field963 = arg7;
                field965 = 2;
                field964 = 0;
                field1087 = arg0;
                field1088 = arg1;
                class171 var19 = class171.method3795(class168.field2324, field917.field1471);
                var19.field2423.method3040(arg3);
                var19.field2423.method3062(class51.field607[82] ? 1 : 0);
                field917.method1777(var19);
            }
        }
        if (arg2 == 45) {
            class74 var20 = field1054[arg3];
            if (var20 != null) {
                field1065 = arg6;
                field963 = arg7;
                field965 = 2;
                field964 = 0;
                field1087 = arg0;
                field1088 = arg1;
                class171 var21 = class171.method3795(class168.field2304, field917.field1471);
                var21.field2423.method3072(arg3);
                var21.field2423.method3047(class51.field607[82] ? 1 : 0);
                field917.method1777(var21);
            }
        }
        if (arg2 == 19) {
            field1065 = arg6;
            field963 = arg7;
            field965 = 2;
            field964 = 0;
            field1087 = arg0;
            field1088 = arg1;
            class171 var22 = class171.method3795(class168.field2399, field917.field1471);
            var22.field2423.method3083(class51.field607[82] ? 1 : 0);
            var22.field2423.method3070(Statics.field3306 + arg0);
            var22.field2423.method3070(Statics.field2066 + arg1);
            var22.field2423.method3040(arg3);
            field917.method1777(var22);
        }
        if (arg2 == 35) {
            class171 var23 = class171.method3795(class168.field2370, field917.field1471);
            var23.field2423.method3149(arg1);
            var23.field2423.method3070(arg3);
            var23.field2423.method3040(arg0);
            field917.method1777(var23);
            field966 = 0;
            Statics.field623 = class224.method1627(arg1);
            field967 = arg0;
        }
        if (arg2 == 20) {
            field1065 = arg6;
            field963 = arg7;
            field965 = 2;
            field964 = 0;
            field1087 = arg0;
            field1088 = arg1;
            class171 var24 = class171.method3795(class168.field2367, field917.field1471);
            var24.field2423.method3072(arg3);
            var24.field2423.method3040(Statics.field3306 + arg0);
            var24.field2423.method3021(Statics.field2066 + arg1);
            var24.field2423.method3047(class51.field607[82] ? 1 : 0);
            field917.method1777(var24);
        }
        if (arg2 == 58) {
            class224 var25 = class224.method2811(arg1, arg0);
            if (var25 != null) {
                class171 var26 = class171.method3795(class168.field2321, field917.field1471);
                var26.field2423.method3021(field1012);
                var26.field2423.method3140(arg1);
                var26.field2423.method3072(field918);
                var26.field2423.method3021(var25.field2754);
                var26.field2423.method3070(arg0);
                var26.field2423.method3081(Statics.field490);
                field917.method1777(var26);
            }
        }
        if (arg2 == 32) {
            class171 var27 = class171.method3795(class168.field2318, field917.field1471);
            var27.field2423.method3140(arg1);
            var27.field2423.method3040(arg0);
            var27.field2423.method3021(field918);
            var27.field2423.method3105(Statics.field490);
            var27.field2423.method3040(arg3);
            field917.method1777(var27);
            field966 = 0;
            Statics.field623 = class224.method1627(arg1);
            field967 = arg0;
        }
        if (arg2 == 51) {
            class74 var28 = field1054[arg3];
            if (var28 != null) {
                field1065 = arg6;
                field963 = arg7;
                field965 = 2;
                field964 = 0;
                field1087 = arg0;
                field1088 = arg1;
                class171 var29 = class171.method3795(class168.field2330, field917.field1471);
                var29.field2423.method3062(class51.field607[82] ? 1 : 0);
                var29.field2423.method3021(arg3);
                field917.method1777(var29);
            }
        }
        if (arg2 == 1003) {
            field1065 = arg6;
            field963 = arg7;
            field965 = 2;
            field964 = 0;
            class86 var30 = field915[arg3];
            if (var30 != null) {
                class266 var31 = var30.field1296;
                if (var31.field3644 != null) {
                    var31 = var31.method4482();
                }
                if (var31 != null) {
                    class171 var32 = class171.method3795(class168.field2357, field917.field1471);
                    var32.field2423.method3040(var31.field3648);
                    field917.method1777(var32);
                }
            }
        }
        if (arg2 == 33) {
            class171 var33 = class171.method3795(class168.field2380, field917.field1471);
            var33.field2423.method3072(arg3);
            var33.field2423.method3149(arg1);
            var33.field2423.method3040(arg0);
            field917.method1777(var33);
            field966 = 0;
            Statics.field623 = class224.method1627(arg1);
            field967 = arg0;
        }
        if (arg2 == 50) {
            class74 var34 = field1054[arg3];
            if (var34 != null) {
                field1065 = arg6;
                field963 = arg7;
                field965 = 2;
                field964 = 0;
                field1087 = arg0;
                field1088 = arg1;
                class171 var35 = class171.method3795(class168.field2355, field917.field1471);
                var35.field2423.method3047(class51.field607[82] ? 1 : 0);
                var35.field2423.method3040(arg3);
                field917.method1777(var35);
            }
        }
        if (arg2 == 8) {
            class86 var36 = field915[arg3];
            if (var36 != null) {
                field1065 = arg6;
                field963 = arg7;
                field965 = 2;
                field964 = 0;
                field1087 = arg0;
                field1088 = arg1;
                class171 var37 = class171.method3795(class168.field2310, field917.field1471);
                var37.field2423.method3081(Statics.field490);
                var37.field2423.method3062(class51.field607[82] ? 1 : 0);
                var37.field2423.method3070(arg3);
                var37.field2423.method3040(field918);
                field917.method1777(var37);
            }
        }
        if (arg2 == 1004) {
            field1065 = arg6;
            field963 = arg7;
            field965 = 2;
            field964 = 0;
            class171 var38 = class171.method3795(class168.field2358, field917.field1471);
            var38.field2423.method3021(arg3);
            field917.method1777(var38);
        }
        if (arg2 == 9) {
            class86 var39 = field915[arg3];
            if (var39 != null) {
                field1065 = arg6;
                field963 = arg7;
                field965 = 2;
                field964 = 0;
                field1087 = arg0;
                field1088 = arg1;
                class171 var40 = class171.method3795(class168.field2334, field917.field1471);
                var40.field2423.method3070(arg3);
                var40.field2423.method3047(class51.field607[82] ? 1 : 0);
                field917.method1777(var40);
            }
        }
        if (arg2 == 37) {
            class171 var41 = class171.method3795(class168.field2307, field917.field1471);
            var41.field2423.method3149(arg1);
            var41.field2423.method3072(arg3);
            var41.field2423.method3072(arg0);
            field917.method1777(var41);
            field966 = 0;
            Statics.field623 = class224.method1627(arg1);
            field967 = arg0;
        }
        if (arg2 == 18) {
            field1065 = arg6;
            field963 = arg7;
            field965 = 2;
            field964 = 0;
            field1087 = arg0;
            field1088 = arg1;
            class171 var42 = class171.method3795(class168.field2327, field917.field1471);
            var42.field2423.method3070(Statics.field2066 + arg1);
            var42.field2423.method3020(class51.field607[82] ? 1 : 0);
            var42.field2423.method3021(arg3);
            var42.field2423.method3021(Statics.field3306 + arg0);
            field917.method1777(var42);
        }
        if (arg2 == 46) {
            class74 var43 = field1054[arg3];
            if (var43 != null) {
                field1065 = arg6;
                field963 = arg7;
                field965 = 2;
                field964 = 0;
                field1087 = arg0;
                field1088 = arg1;
                class171 var44 = class171.method3795(class168.field2331, field917.field1471);
                var44.field2423.method3040(arg3);
                var44.field2423.method3062(class51.field607[82] ? 1 : 0);
                field917.method1777(var44);
            }
        }
        if (arg2 == 28) {
            class171 var45 = class171.method3795(class168.field2342, field917.field1471);
            var45.field2423.method3149(arg1);
            field917.method1777(var45);
            class224 var46 = class224.method1627(arg1);
            if (var46.field2837 != null && var46.field2837[0][0] == 5) {
                int var47 = var46.field2837[0][1];
                class219.field2688[var47] = 1 - class219.field2688[var47];
                method1596(var47);
            }
        }
        if (arg2 == 6) {
            field1065 = arg6;
            field963 = arg7;
            field965 = 2;
            field964 = 0;
            field1087 = arg0;
            field1088 = arg1;
            class171 var48 = class171.method3795(class168.field2388, field917.field1471);
            var48.field2423.method3072(arg3 >> 14 & 0x7FFF);
            var48.field2423.method3083(class51.field607[82] ? 1 : 0);
            var48.field2423.method3040(Statics.field3306 + arg0);
            var48.field2423.method3021(Statics.field2066 + arg1);
            field917.method1777(var48);
        }
        if (arg2 == 41) {
            class171 var49 = class171.method3795(class168.field2329, field917.field1471);
            var49.field2423.method3149(arg1);
            var49.field2423.method3070(arg0);
            var49.field2423.method3040(arg3);
            field917.method1777(var49);
            field966 = 0;
            Statics.field623 = class224.method1627(arg1);
            field967 = arg0;
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field699.method5080(arg2, arg3, new class220(arg0), new class220(arg1));
        }
        if (arg2 == 15) {
            class74 var50 = field1054[arg3];
            if (var50 != null) {
                field1065 = arg6;
                field963 = arg7;
                field965 = 2;
                field964 = 0;
                field1087 = arg0;
                field1088 = arg1;
                class171 var51 = class171.method3795(class168.field2348, field917.field1471);
                var51.field2423.method3021(field918);
                var51.field2423.method3070(arg3);
                var51.field2423.method3083(class51.field607[82] ? 1 : 0);
                var51.field2423.method3105(Statics.field490);
                field917.method1777(var51);
            }
        }
        if (arg2 == 4) {
            field1065 = arg6;
            field963 = arg7;
            field965 = 2;
            field964 = 0;
            field1087 = arg0;
            field1088 = arg1;
            class171 var52 = class171.method3795(class168.field2396, field917.field1471);
            var52.field2423.method3021(arg3 >> 14 & 0x7FFF);
            var52.field2423.method3040(Statics.field2066 + arg1);
            var52.field2423.method3047(class51.field607[82] ? 1 : 0);
            var52.field2423.method3072(Statics.field3306 + arg0);
            field917.method1777(var52);
        }
        if (arg2 == 13) {
            class86 var53 = field915[arg3];
            if (var53 != null) {
                field1065 = arg6;
                field963 = arg7;
                field965 = 2;
                field964 = 0;
                field1087 = arg0;
                field1088 = arg1;
                class171 var54 = class171.method3795(class168.field2393, field917.field1471);
                var54.field2423.method3040(arg3);
                var54.field2423.method3083(class51.field607[82] ? 1 : 0);
                field917.method1777(var54);
            }
        }
        if (arg2 == 42) {
            class171 var55 = class171.method3795(class168.field2354, field917.field1471);
            var55.field2423.method3105(arg1);
            var55.field2423.method3040(arg0);
            var55.field2423.method3021(arg3);
            field917.method1777(var55);
            field966 = 0;
            Statics.field623 = class224.method1627(arg1);
            field967 = arg0;
        }
        if (arg2 == 47) {
            class74 var56 = field1054[arg3];
            if (var56 != null) {
                field1065 = arg6;
                field963 = arg7;
                field965 = 2;
                field964 = 0;
                field1087 = arg0;
                field1088 = arg1;
                class171 var57 = class171.method3795(class168.field2381, field917.field1471);
                var57.field2423.method3021(arg3);
                var57.field2423.method3020(class51.field607[82] ? 1 : 0);
                field917.method1777(var57);
            }
        }
        if (arg2 == 38) {
            Statics.method1764();
            class224 var58 = class224.method1627(arg1);
            field1008 = 1;
            Statics.field469 = arg0;
            Statics.field2676 = arg1;
            Statics.field1410 = arg3;
            method503(var58);
            field975 = class88.method3336(16748608) + class264.method482(arg3).field3562 + class88.method3336(16777215);
            if (field975 == null) {
                field975 = "null";
            }
            return;
        }
        if (arg2 == 17) {
            field1065 = arg6;
            field963 = arg7;
            field965 = 2;
            field964 = 0;
            field1087 = arg0;
            field1088 = arg1;
            class171 var59 = class171.method3795(class168.field2390, field917.field1471);
            var59.field2423.method3070(arg3);
            var59.field2423.method3083(class51.field607[82] ? 1 : 0);
            var59.field2423.method3149(Statics.field490);
            var59.field2423.method3070(field918);
            var59.field2423.method3070(Statics.field3306 + arg0);
            var59.field2423.method3070(Statics.field2066 + arg1);
            field917.method1777(var59);
        }
        if (arg2 == 12) {
            class86 var60 = field915[arg3];
            if (var60 != null) {
                field1065 = arg6;
                field963 = arg7;
                field965 = 2;
                field964 = 0;
                field1087 = arg0;
                field1088 = arg1;
                class171 var61 = class171.method3795(class168.field2373, field917.field1471);
                var61.field2423.method3072(arg3);
                var61.field2423.method3020(class51.field607[82] ? 1 : 0);
                field917.method1777(var61);
            }
        }
        if (arg2 == 10) {
            class86 var62 = field915[arg3];
            if (var62 != null) {
                field1065 = arg6;
                field963 = arg7;
                field965 = 2;
                field964 = 0;
                field1087 = arg0;
                field1088 = arg1;
                class171 var63 = class171.method3795(class168.field2397, field917.field1471);
                var63.field2423.method3062(class51.field607[82] ? 1 : 0);
                var63.field2423.method3040(arg3);
                field917.method1777(var63);
            }
        }
        if (arg2 == 1005) {
            class224 var64 = class224.method1627(arg1);
            if (var64 == null || var64.field2733[arg0] < 100000) {
                class171 var65 = class171.method3795(class168.field2358, field917.field1471);
                var65.field2423.method3021(arg3);
                field917.method1777(var65);
            } else {
                class97.method706(27, "", var64.field2733[arg0] + " x " + class264.method482(arg3).field3562);
            }
            field966 = 0;
            Statics.field623 = class224.method1627(arg1);
            field967 = arg0;
        }
        if (arg2 == 1002) {
            field1065 = arg6;
            field963 = arg7;
            field965 = 2;
            field964 = 0;
            class171 var66 = class171.method3795(class168.field2364, field917.field1471);
            var66.field2423.method3070(arg3 >> 14 & 0x7FFF);
            field917.method1777(var66);
        }
        if (arg2 == 7) {
            class86 var67 = field915[arg3];
            if (var67 != null) {
                field1065 = arg6;
                field963 = arg7;
                field965 = 2;
                field964 = 0;
                field1087 = arg0;
                field1088 = arg1;
                class171 var68 = class171.method3795(class168.field2382, field917.field1471);
                var68.field2423.method3070(arg3);
                var68.field2423.method3070(Statics.field469);
                var68.field2423.method3047(class51.field607[82] ? 1 : 0);
                var68.field2423.method3070(Statics.field1410);
                var68.field2423.method3140(Statics.field2676);
                field917.method1777(var68);
            }
        }
        if (arg2 == 5) {
            field1065 = arg6;
            field963 = arg7;
            field965 = 2;
            field964 = 0;
            field1087 = arg0;
            field1088 = arg1;
            class171 var69 = class171.method3795(class168.field2394, field917.field1471);
            var69.field2423.method3047(class51.field607[82] ? 1 : 0);
            var69.field2423.method3072(Statics.field2066 + arg1);
            var69.field2423.method3040(arg3 >> 14 & 0x7FFF);
            var69.field2423.method3070(Statics.field3306 + arg0);
            field917.method1777(var69);
        }
        if (arg2 == 1001) {
            field1065 = arg6;
            field963 = arg7;
            field965 = 2;
            field964 = 0;
            field1087 = arg0;
            field1088 = arg1;
            class171 var70 = class171.method3795(class168.field2391, field917.field1471);
            var70.field2423.method3070(arg3 >> 14 & 0x7FFF);
            var70.field2423.method3070(Statics.field2066 + arg1);
            var70.field2423.method3083(class51.field607[82] ? 1 : 0);
            var70.field2423.method3040(Statics.field3306 + arg0);
            field917.method1777(var70);
        }
        if (arg2 == 25) {
            class224 var71 = class224.method2811(arg1, arg0);
            if (var71 != null) {
                Statics.method1764();
                int var72 = method1097(var71);
                int var73 = var72 >> 11 & 0x3F;
                int var75 = var71.field2754;
                class224 var76 = class224.method2811(arg1, arg0);
                if (var76 != null && var76.field2785 != null) {
                    class69 var77 = new class69();
                    var77.field800 = var76;
                    var77.field798 = var76.field2785;
                    class83.method86(var77);
                }
                field1012 = var75;
                field1098 = true;
                Statics.field490 = arg1;
                field918 = arg0;
                Statics.field2162 = var73;
                method503(var76);
                field1008 = 0;
                field1043 = method2779(var71);
                if (field1043 == null) {
                    field1043 = "Null";
                }
                if (var71.field2724) {
                    field1014 = var71.field2842 + class88.method3336(16777215);
                } else {
                    field1014 = class88.method3336(65280) + var71.field2841 + class88.method3336(16777215);
                }
            }
            return;
        }
        if (arg2 == 2) {
            field1065 = arg6;
            field963 = arg7;
            field965 = 2;
            field964 = 0;
            field1087 = arg0;
            field1088 = arg1;
            class171 var78 = class171.method3795(class168.field2400, field917.field1471);
            var78.field2423.method3047(class51.field607[82] ? 1 : 0);
            var78.field2423.method3140(Statics.field490);
            var78.field2423.method3040(Statics.field2066 + arg1);
            var78.field2423.method3072(arg3 >> 14 & 0x7FFF);
            var78.field2423.method3072(field918);
            var78.field2423.method3072(Statics.field3306 + arg0);
            field917.method1777(var78);
        }
        if (arg2 == 48) {
            class74 var79 = field1054[arg3];
            if (var79 != null) {
                field1065 = arg6;
                field963 = arg7;
                field965 = 2;
                field964 = 0;
                field1087 = arg0;
                field1088 = arg1;
                class171 var80 = class171.method3795(class168.field2339, field917.field1471);
                var80.field2423.method3021(arg3);
                var80.field2423.method3083(class51.field607[82] ? 1 : 0);
                field917.method1777(var80);
            }
        }
        if (arg2 == 11) {
            class86 var81 = field915[arg3];
            if (var81 != null) {
                field1065 = arg6;
                field963 = arg7;
                field965 = 2;
                field964 = 0;
                field1087 = arg0;
                field1088 = arg1;
                class171 var82 = class171.method3795(class168.field2363, field917.field1471);
                var82.field2423.method3020(class51.field607[82] ? 1 : 0);
                var82.field2423.method3072(arg3);
                field917.method1777(var82);
            }
        }
        if (arg2 == 30 && field1019 == null) {
            method3268(arg1, arg0);
            field1019 = class224.method2811(arg1, arg0);
            method503(field1019);
        }
        if (arg2 == 21) {
            field1065 = arg6;
            field963 = arg7;
            field965 = 2;
            field964 = 0;
            field1087 = arg0;
            field1088 = arg1;
            class171 var83 = class171.method3795(class168.field2378, field917.field1471);
            var83.field2423.method3062(class51.field607[82] ? 1 : 0);
            var83.field2423.method3021(Statics.field2066 + arg1);
            var83.field2423.method3021(arg3);
            var83.field2423.method3040(Statics.field3306 + arg0);
            field917.method1777(var83);
        }
        if (arg2 == 43) {
            class171 var84 = class171.method3795(class168.field2350, field917.field1471);
            var84.field2423.method3040(arg3);
            var84.field2423.method3140(arg1);
            var84.field2423.method3040(arg0);
            field917.method1777(var84);
            field966 = 0;
            Statics.field623 = class224.method1627(arg1);
            field967 = arg0;
        }
        if (arg2 == 40) {
            class171 var85 = class171.method3795(class168.field2320, field917.field1471);
            var85.field2423.method3081(arg1);
            var85.field2423.method3021(arg0);
            var85.field2423.method3040(arg3);
            field917.method1777(var85);
            field966 = 0;
            Statics.field623 = class224.method1627(arg1);
            field967 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class224 var86 = class224.method2811(arg1, arg0);
            if (var86 != null) {
                int var87 = var86.field2754;
                class224 var88 = class224.method2811(arg1, arg0);
                if (var88 != null) {
                    if (var88.field2804 != null) {
                        class69 var89 = new class69();
                        var89.field800 = var88;
                        var89.field807 = arg3;
                        var89.field806 = arg5;
                        var89.field798 = var88.field2804;
                        class83.method86(var89);
                    }
                    boolean var90 = true;
                    if (var88.field2729 > 0) {
                        var90 = method2770(var88);
                    }
                    if (var90) {
                        int var91 = method1097(var88);
                        int var92 = arg3 - 1;
                        boolean var93 = (var91 >> var92 + 1 & 0x1) != 0;
                        if (var93) {
                            if (arg3 == 1) {
                                class171 var94 = class171.method3795(class168.field2317, field917.field1471);
                                var94.field2423.method3149(arg1);
                                var94.field2423.method3021(arg0);
                                var94.field2423.method3021(var87);
                                field917.method1777(var94);
                            }
                            if (arg3 == 2) {
                                class171 var95 = class171.method3795(class168.field2309, field917.field1471);
                                var95.field2423.method3149(arg1);
                                var95.field2423.method3021(arg0);
                                var95.field2423.method3021(var87);
                                field917.method1777(var95);
                            }
                            if (arg3 == 3) {
                                class171 var96 = class171.method3795(class168.field2333, field917.field1471);
                                var96.field2423.method3149(arg1);
                                var96.field2423.method3021(arg0);
                                var96.field2423.method3021(var87);
                                field917.method1777(var96);
                            }
                            if (arg3 == 4) {
                                class171 var97 = class171.method3795(class168.field2347, field917.field1471);
                                var97.field2423.method3149(arg1);
                                var97.field2423.method3021(arg0);
                                var97.field2423.method3021(var87);
                                field917.method1777(var97);
                            }
                            if (arg3 == 5) {
                                class171 var98 = class171.method3795(class168.field2374, field917.field1471);
                                var98.field2423.method3149(arg1);
                                var98.field2423.method3021(arg0);
                                var98.field2423.method3021(var87);
                                field917.method1777(var98);
                            }
                            if (arg3 == 6) {
                                class171 var99 = class171.method3795(class168.field2340, field917.field1471);
                                var99.field2423.method3149(arg1);
                                var99.field2423.method3021(arg0);
                                var99.field2423.method3021(var87);
                                field917.method1777(var99);
                            }
                            if (arg3 == 7) {
                                class171 var100 = class171.method3795(class168.field2359, field917.field1471);
                                var100.field2423.method3149(arg1);
                                var100.field2423.method3021(arg0);
                                var100.field2423.method3021(var87);
                                field917.method1777(var100);
                            }
                            if (arg3 == 8) {
                                class171 var101 = class171.method3795(class168.field2326, field917.field1471);
                                var101.field2423.method3149(arg1);
                                var101.field2423.method3021(arg0);
                                var101.field2423.method3021(var87);
                                field917.method1777(var101);
                            }
                            if (arg3 == 9) {
                                class171 var102 = class171.method3795(class168.field2313, field917.field1471);
                                var102.field2423.method3149(arg1);
                                var102.field2423.method3021(arg0);
                                var102.field2423.method3021(var87);
                                field917.method1777(var102);
                            }
                            if (arg3 == 10) {
                                class171 var103 = class171.method3795(class168.field2368, field917.field1471);
                                var103.field2423.method3149(arg1);
                                var103.field2423.method3021(arg0);
                                var103.field2423.method3021(var87);
                                field917.method1777(var103);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 23) {
            if (field1072) {
                Statics.field282.method2618();
            } else {
                Statics.field282.method2754(Statics.field3219, arg0, arg1, true);
            }
        }
        if (arg2 == 14) {
            class74 var104 = field1054[arg3];
            if (var104 != null) {
                field1065 = arg6;
                field963 = arg7;
                field965 = 2;
                field964 = 0;
                field1087 = arg0;
                field1088 = arg1;
                class171 var105 = class171.method3795(class168.field2389, field917.field1471);
                var105.field2423.method3072(arg3);
                var105.field2423.method3083(class51.field607[82] ? 1 : 0);
                var105.field2423.method3070(Statics.field469);
                var105.field2423.method3072(Statics.field1410);
                var105.field2423.method3081(Statics.field2676);
                field917.method1777(var105);
            }
        }
        if (arg2 == 3) {
            field1065 = arg6;
            field963 = arg7;
            field965 = 2;
            field964 = 0;
            field1087 = arg0;
            field1088 = arg1;
            class171 var106 = class171.method3795(class168.field2335, field917.field1471);
            var106.field2423.method3070(Statics.field3306 + arg0);
            var106.field2423.method3021(Statics.field2066 + arg1);
            var106.field2423.method3021(arg3 >> 14 & 0x7FFF);
            var106.field2423.method3020(class51.field607[82] ? 1 : 0);
            field917.method1777(var106);
        }
        if (arg2 == 16) {
            field1065 = arg6;
            field963 = arg7;
            field965 = 2;
            field964 = 0;
            field1087 = arg0;
            field1088 = arg1;
            class171 var107 = class171.method3795(class168.field2360, field917.field1471);
            var107.field2423.method3021(Statics.field1410);
            var107.field2423.method3105(Statics.field2676);
            var107.field2423.method3070(arg3);
            var107.field2423.method3072(Statics.field3306 + arg0);
            var107.field2423.method3021(Statics.field2066 + arg1);
            var107.field2423.method3062(class51.field607[82] ? 1 : 0);
            var107.field2423.method3040(Statics.field469);
            field917.method1777(var107);
        }
        if (arg2 == 39) {
            class171 var108 = class171.method3795(class168.field2337, field917.field1471);
            var108.field2423.method3149(arg1);
            var108.field2423.method3070(arg3);
            var108.field2423.method3070(arg0);
            field917.method1777(var108);
            field966 = 0;
            Statics.field623 = class224.method1627(arg1);
            field967 = arg0;
        }
        if (arg2 == 29) {
            class171 var109 = class171.method3795(class168.field2342, field917.field1471);
            var109.field2423.method3149(arg1);
            field917.method1777(var109);
            class224 var110 = class224.method1627(arg1);
            if (var110.field2837 != null && var110.field2837[0][0] == 5) {
                int var111 = var110.field2837[0][1];
                if (class219.field2688[var111] != var110.field2823[0]) {
                    class219.field2688[var111] = var110.field2823[0];
                    method1596(var111);
                }
            }
        }
        if (field1008 != 0) {
            field1008 = 0;
            method503(class224.method1627(Statics.field2676));
        }
        if (field1098) {
            Statics.method1764();
        }
        if (Statics.field623 != null && field966 == 0) {
            method503(Statics.field623);
        }
    }

    @ObfuscatedName("u.ie(ILjava/lang/String;I)V")
    public static void method56(int arg0, String arg1) {
        int var2 = class95.field1414;
        int[] var3 = class95.field1424;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class74 var6 = field1054[var3[var5]];
            if (var6 != null && Statics.field2501 != var6 && var6.field844 != null && var6.field844.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    class171 var7 = class171.method3795(class168.field2369, field917.field1471);
                    var7.field2423.method3062(0);
                    var7.field2423.method3021(var3[var5]);
                    field917.method1777(var7);
                } else if (arg0 == 4) {
                    class171 var8 = class171.method3795(class168.field2381, field917.field1471);
                    var8.field2423.method3021(var3[var5]);
                    var8.field2423.method3020(0);
                    field917.method1777(var8);
                } else if (arg0 == 6) {
                    class171 var9 = class171.method3795(class168.field2324, field917.field1471);
                    var9.field2423.method3040(var3[var5]);
                    var9.field2423.method3062(0);
                    field917.method1777(var9);
                } else if (arg0 == 7) {
                    class171 var10 = class171.method3795(class168.field2355, field917.field1471);
                    var10.field2423.method3047(0);
                    var10.field2423.method3040(var3[var5]);
                    field917.method1777(var10);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class97.method706(4, "", class233.field2955 + arg1);
        }
    }

    @ObfuscatedName("gm.iu(III)V")
    public static void method3268(int arg0, int arg1) {
        class171 var2 = class171.method3795(class168.field2336, field917.field1471);
        var2.field2423.method3140(arg0);
        var2.field2423.method3072(arg1);
        field917.method1777(var2);
    }

    @ObfuscatedName("bq.iy(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method696(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var12 = false;
        if (field1072 || field994 >= 500) {
            return;
        }
        field999[field994] = arg0;
        field1000[field994] = arg1;
        field997[field994] = arg2;
        field988[field994] = arg3;
        field1048[field994] = arg4;
        field996[field994] = arg5;
        field890[field994] = var12;
        field994++;
    }

    @ObfuscatedName("cm.im(I)V")
    public static void method1629() {
        for (int var0 = 0; var0 < field994; var0++) {
            if (method180(field997[var0])) {
                if (var0 < field994 - 1) {
                    for (int var1 = var0; var1 < field994 - 1; var1++) {
                        field999[var1] = field999[var1 + 1];
                        field1000[var1] = field1000[var1 + 1];
                        field997[var1] = field997[var1 + 1];
                        field988[var1] = field988[var1 + 1];
                        field1048[var1] = field1048[var1 + 1];
                        field996[var1] = field996[var1 + 1];
                        field890[var1] = field890[var1 + 1];
                    }
                }
                field994--;
            }
        }
    }

    @ObfuscatedName("a.ii(II)Z")
    public static boolean method180(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("ek.it(II)Ljava/lang/String;")
    public static String method2782(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field1000[arg0].length() > 0) {
            return field999[arg0] + class233.field3091 + field1000[arg0];
        } else {
            return field999[arg0];
        }
    }

    @ObfuscatedName("f.id(Ljd;IIII)V")
    public static final void method126(class266 arg0, int arg1, int arg2, int arg3) {
        if (field994 >= 400) {
            return;
        }
        if (arg0.field3644 != null) {
            arg0 = arg0.method4482();
        }
        if (arg0 == null || !arg0.field3628 || arg0.field3649 && field1083 != arg1) {
            return;
        }
        String var4 = arg0.field3637;
        if (arg0.field3636 != 0) {
            int var6 = arg0.field3636;
            int var7 = Statics.field2501.field856;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class88.method3336(16711680);
            } else if (var8 < -6) {
                var9 = class88.method3336(16723968);
            } else if (var8 < -3) {
                var9 = class88.method3336(16740352);
            } else if (var8 < 0) {
                var9 = class88.method3336(16756736);
            } else if (var8 > 9) {
                var9 = class88.method3336(65280);
            } else if (var8 > 6) {
                var9 = class88.method3336(4259584);
            } else if (var8 > 3) {
                var9 = class88.method3336(8453888);
            } else if (var8 > 0) {
                var9 = class88.method3336(12648192);
            } else {
                var9 = class88.method3336(16776960);
            }
            var4 = var4 + var9 + " " + class88.field1314 + class233.field3087 + arg0.field3636 + class88.field1315;
        }
        if (arg0.field3649 && field1061) {
            method696(class233.field3082, class88.method3336(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1008 == 1) {
            method696(class233.field3081, field975 + " " + class88.field1311 + " " + class88.method3336(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1098) {
            int var10 = arg0.field3649 && field1061 ? 2000 : 0;
            String[] var11 = arg0.field3634;
            if (field908) {
                var11 = method2386(var11);
            }
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class233.field3141)) {
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
                        method696(var11[var12], class88.method3336(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class233.field3141)) {
                        short var15 = 0;
                        if (field899 != class91.field1337) {
                            if (field899 == class91.field1339 || field899 == class91.field1338 && arg0.field3636 > Statics.field2501.field856) {
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
                            method696(var11[var14], class88.method3336(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3649 || !field1061) {
                method696(class233.field3082, class88.method3336(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field2162 & 0x2) == 2) {
            method696(field1043, field1014 + " " + class88.field1311 + " " + class88.method3336(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bh.in(Lbw;IIII)V")
    public static final void method1045(class74 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2501 == arg0 || field994 >= 400) {
            return;
        }
        String var9;
        if (arg0.field859 == 0) {
            String var4 = arg0.field840[0] + arg0.field844 + arg0.field840[1];
            int var5 = arg0.field856;
            int var6 = Statics.field2501.field856;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class88.method3336(16711680);
            } else if (var7 < -6) {
                var8 = class88.method3336(16723968);
            } else if (var7 < -3) {
                var8 = class88.method3336(16740352);
            } else if (var7 < 0) {
                var8 = class88.method3336(16756736);
            } else if (var7 > 9) {
                var8 = class88.method3336(65280);
            } else if (var7 > 6) {
                var8 = class88.method3336(4259584);
            } else if (var7 > 3) {
                var8 = class88.method3336(8453888);
            } else if (var7 > 0) {
                var8 = class88.method3336(12648192);
            } else {
                var8 = class88.method3336(16776960);
            }
            var9 = var4 + var8 + " " + class88.field1314 + class233.field3087 + arg0.field856 + class88.field1315 + arg0.field840[2];
        } else {
            var9 = arg0.field840[0] + arg0.field844 + arg0.field840[1] + " " + class88.field1314 + class233.field3088 + arg0.field859 + class88.field1315 + arg0.field840[2];
        }
        if (field1008 == 1) {
            method696(class233.field3081, field975 + " " + class88.field1311 + " " + class88.method3336(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field1098) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field981[var10] != null) {
                    short var11 = 0;
                    if (field981[var10].equalsIgnoreCase(class233.field3141)) {
                        if (field898 == class91.field1337) {
                            continue;
                        }
                        if (field898 == class91.field1339 || field898 == class91.field1338 && arg0.field856 > Statics.field2501.field856) {
                            var11 = 2000;
                        }
                        if (Statics.field2501.field855 != 0 && arg0.field855 != 0) {
                            if (Statics.field2501.field855 == arg0.field855) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field982[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field980[var10] + var11;
                    method696(field981[var10], class88.method3336(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2162 & 0x8) == 8) {
            method696(field1043, field1014 + " " + class88.field1311 + " " + class88.method3336(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field994; var14++) {
            if (field997[var14] == 23) {
                field1000[var14] = class88.method3336(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ei.iv(IIIIIIIIB)V")
    public static final void method2810(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class224.method3331(arg0)) {
            Statics.field2109 = null;
            Statics.method3913(Statics.field257[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2109 != null) {
                Statics.method3913(Statics.field2109, -1412584499, arg1, arg2, arg3, arg4, Statics.field713, Statics.field423, arg7);
                Statics.field2109 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1060[var8] = true;
            }
        } else {
            field1060[arg7] = true;
        }
    }

    @ObfuscatedName("bl.ih(Ljava/lang/String;Lhx;I)Ljava/lang/String;")
    public static String method998(String arg0, class224 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2225(arg1, var2 - 1);
                    String var6;
                    if (var5 < 999999999) {
                        var6 = Integer.toString(var5);
                    } else {
                        var6 = "*";
                    }
                    arg0 = var4 + var6 + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("q.ia(II)Ljava/lang/String;")
    public static final String method150(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class88.field1312 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class88.method3336(65408) + var1.substring(0, var1.length() - 8) + class233.field3092 + " " + class88.field1314 + var1 + class88.field1315 + class88.field1318;
        } else if (var1.length() > 6) {
            return " " + class88.method3336(16777215) + var1.substring(0, var1.length() - 4) + class233.field3094 + " " + class88.field1314 + var1 + class88.field1315 + class88.field1318;
        } else {
            return " " + class88.method3336(16776960) + var1 + class88.field1318;
        }
    }

    @ObfuscatedName("client.ip(ZI)V")
    public final void method1145(boolean arg0) {
        method638(field1016, Statics.field1308, Statics.field674, arg0);
    }

    @ObfuscatedName("client.iz(Lhx;I)V")
    public void method1114(class224 arg0) {
        class224 var2 = arg0.field2744 == -1 ? null : class224.method1627(arg0.field2744);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1308;
            var4 = Statics.field674;
        } else {
            var3 = var2.field2740;
            var4 = var2.field2741;
        }
        method55(arg0, var3, var4, false);
        Statics.method2005(arg0, var3, var4);
    }

    @ObfuscatedName("jd.if([Lhx;Lhx;ZB)V")
    public static void method4517(class224[] arg0, class224 arg1, boolean arg2) {
        int var3 = arg1.field2748 == 0 ? arg1.field2740 : arg1.field2748;
        int var4 = arg1.field2749 == 0 ? arg1.field2741 : arg1.field2749;
        method57(arg0, arg1.field2725, var3, var4, arg2);
        if (arg1.field2779 != null) {
            method57(arg1.field2779, arg1.field2725, var3, var4, arg2);
        }
        class68 var5 = (class68) field1070.method3438((long) arg1.field2725);
        if (var5 != null) {
            method638(var5.field797, var3, var4, arg2);
        }
        if (arg1.field2729 == 1337) {
        }
    }

    @ObfuscatedName("ao.io(IIIZI)V")
    public static final void method638(int arg0, int arg1, int arg2, boolean arg3) {
        if (class224.method3331(arg0)) {
            method57(Statics.field257[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("u.ix([Lhx;IIIZI)V")
    public static void method57(class224[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class224 var6 = arg0[var5];
            if (var6 != null && var6.field2744 == arg1) {
                method55(var6, arg2, arg3, arg4);
                Statics.method2005(var6, arg2, arg3);
                if (var6.field2746 > var6.field2748 - var6.field2740) {
                    var6.field2746 = var6.field2748 - var6.field2740;
                }
                if (var6.field2746 < 0) {
                    var6.field2746 = 0;
                }
                if (var6.field2747 > var6.field2749 - var6.field2741) {
                    var6.field2747 = var6.field2749 - var6.field2741;
                }
                if (var6.field2747 < 0) {
                    var6.field2747 = 0;
                }
                if (var6.field2727 == 0) {
                    method4517(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("u.iw(Lhx;IIZB)V")
    public static void method55(class224 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2740;
        int var5 = arg0.field2741;
        if (arg0.field2732 == 0) {
            arg0.field2740 = arg0.field2809;
        } else if (arg0.field2732 == 1) {
            arg0.field2740 = arg1 - arg0.field2809;
        } else if (arg0.field2732 == 2) {
            arg0.field2740 = arg0.field2809 * arg1 >> 14;
        }
        if (arg0.field2819 == 0) {
            arg0.field2741 = arg0.field2737;
        } else if (arg0.field2819 == 1) {
            arg0.field2741 = arg2 - arg0.field2737;
        } else if (arg0.field2819 == 2) {
            arg0.field2741 = arg0.field2737 * arg2 >> 14;
        }
        if (arg0.field2732 == 4) {
            arg0.field2740 = arg0.field2742 * arg0.field2741 / arg0.field2767;
        }
        if (arg0.field2819 == 4) {
            arg0.field2741 = arg0.field2767 * arg0.field2740 / arg0.field2742;
        }
        if (field968 && arg0.field2727 == 0) {
            if (arg0.field2741 < 5 && arg0.field2740 < 5) {
                arg0.field2741 = 5;
                arg0.field2740 = 5;
            } else {
                if (arg0.field2741 <= 0) {
                    arg0.field2741 = 5;
                }
                if (arg0.field2740 <= 0) {
                    arg0.field2740 = 5;
                }
            }
        }
        if (arg0.field2729 == 1337) {
            field1027 = arg0;
        }
        if (arg3 && arg0.field2834 != null && (arg0.field2740 != var4 || arg0.field2741 != var5)) {
            class69 var6 = new class69();
            var6.field800 = arg0;
            var6.field798 = arg0.field2834;
            field1011.method3502(var6);
        }
    }

    @ObfuscatedName("cr.is(Lhx;B)Z")
    public static final boolean method1732(class224 arg0) {
        if (arg0.field2838 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2838.length; var1++) {
            int var2 = method2225(arg0, var1);
            int var3 = arg0.field2823[var1];
            if (arg0.field2838[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2838[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2838[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("dl.ib(Lhx;II)I")
    public static final int method2225(class224 arg0, int arg1) {
        if (arg0.field2837 == null || arg1 >= arg0.field2837.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2837[arg1];
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
                    var7 = field989[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field1090[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field991[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class224 var11 = class224.method1627(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class264.method482(var12).field3575 || field973)) {
                        for (int var13 = 0; var13 < var11.field2778.length; var13++) {
                            if (var12 + 1 == var11.field2778[var13]) {
                                var7 += var11.field2733[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class219.field2688[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class230.field2913[field1090[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class219.field2688[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2501.field856;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class230.field2917[var14]) {
                            var7 += field1090[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class224 var17 = class224.method1627(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class264.method482(var18).field3575 || field973)) {
                        for (int var19 = 0; var19 < var17.field2778.length; var19++) {
                            if (var18 + 1 == var17.field2778[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1020;
                }
                if (var6 == 12) {
                    var7 = field1021;
                }
                if (var6 == 13) {
                    int var20 = class219.field2688[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class219.method1016(var22);
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
                    var7 = (Statics.field2501.field1149 >> 7) + Statics.field3306;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2501.field1198 >> 7) + Statics.field2066;
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

    @ObfuscatedName("at.il(Lhx;Ljb;IIZI)V")
    public static final void method687(class224 arg0, class264 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3577;
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
            var7 = class233.field3026;
        }
        if (var6 == -1 || var7 == null) {
            return;
        }
        String var9 = class88.method3336(16748608) + arg1.field3562;
        int var11 = arg1.field3554;
        int var13 = arg0.field2725;
        if (field1072 || field994 >= 500) {
            return;
        }
        field999[field994] = var7;
        field1000[field994] = var9;
        field997[field994] = var6;
        field988[field994] = var11;
        field1048[field994] = arg2;
        field996[field994] = var13;
        field890[field994] = arg4;
        field994++;
    }

    @ObfuscatedName("cx.ic([Lhx;IIIIIIII)V")
    public static final void method1765(class224[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class224 var9 = arg0[var8];
            if (var9 != null && (!var9.field2724 || var9.field2727 == 0 || var9.field2771 || method1097(var9) != 0 || field1029 == var9 || var9.field2729 == 1338) && var9.field2744 == arg1 && (!var9.field2724 || !method3249(var9))) {
                int var10 = var9.field2738 + arg6;
                int var11 = var9.field2739 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2727 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2727 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2740 + var10;
                    int var19 = var9.field2741 + var11;
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
                    int var22 = var9.field2740 + var10;
                    int var23 = var9.field2741 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1028 == var9) {
                    field992 = true;
                    field1104 = var10;
                    field1038 = var11;
                }
                if (!var9.field2724 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field704;
                    int var25 = class60.field716 * 10625923;
                    if (class60.field709 != 0) {
                        var24 = class60.field710;
                        var25 = class60.field711;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2729 == 1337) {
                        if (!field880 && !field1072 && var26) {
                            if (field1008 == 0 && !field1098) {
                                method696(class233.field3213, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var27 = -1;
                            int var28 = -1;
                            for (int var29 = 0; var29 < class134.field1910; var29++) {
                                int var30 = class134.field1904[var29];
                                int var31 = var30 & 0x7F;
                                int var32 = var30 >> 7 & 0x7F;
                                int var33 = var30 >> 29 & 0x3;
                                int var34 = var30 >> 14 & 0x7FFF;
                                if (var28 != var30) {
                                    var28 = var30;
                                    if (var33 == 2 && Statics.field282.method2611(Statics.field3219, var31, var32, var30) >= 0) {
                                        class263 var35 = class263.method10(var34);
                                        if (var35.field3541 != null) {
                                            var35 = var35.method4355();
                                        }
                                        if (var35 == null) {
                                            continue;
                                        }
                                        if (field1008 == 1) {
                                            method696(class233.field3081, field975 + " " + class88.field1311 + " " + class88.method3336(65535) + var35.field3510, 1, var30, var31, var32);
                                        } else if (!field1098) {
                                            String[] var36 = var35.field3506;
                                            if (field908) {
                                                var36 = method2386(var36);
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
                                                        method696(var36[var37], class88.method3336(65535) + var35.field3510, var38, var30, var31, var32);
                                                    }
                                                }
                                            }
                                            method696(class233.field3082, class88.method3336(65535) + var35.field3510, 1002, var35.field3523 << 14, var31, var32);
                                        } else if ((Statics.field2162 & 0x4) == 4) {
                                            method696(field1043, field1014 + " " + class88.field1311 + " " + class88.method3336(65535) + var35.field3510, 2, var30, var31, var32);
                                        }
                                    }
                                    if (var33 == 1) {
                                        class86 var39 = field915[var34];
                                        if (var39 == null) {
                                            continue;
                                        }
                                        if (var39.field1296.field3620 == 1 && (var39.field1149 & 0x7F) == 64 && (var39.field1198 & 0x7F) == 64) {
                                            for (int var40 = 0; var40 < field913; var40++) {
                                                class86 var41 = field915[field1121[var40]];
                                                if (var41 != null && var39 != var41 && var41.field1296.field3620 == 1 && var39.field1149 == var41.field1149 && var39.field1198 == var41.field1198) {
                                                    method126(var41.field1296, field1121[var40], var31, var32);
                                                }
                                            }
                                            int var42 = class95.field1414;
                                            int[] var43 = class95.field1424;
                                            for (int var44 = 0; var44 < var42; var44++) {
                                                class74 var45 = field1054[var43[var44]];
                                                if (var45 != null && var39.field1149 == var45.field1149 && var39.field1198 == var45.field1198) {
                                                    method1045(var45, var43[var44], var31, var32);
                                                }
                                            }
                                        }
                                        method126(var39.field1296, var34, var31, var32);
                                    }
                                    if (var33 == 0) {
                                        class74 var46 = field1054[var34];
                                        if (var46 == null) {
                                            continue;
                                        }
                                        if ((var46.field1149 & 0x7F) == 64 && (var46.field1198 & 0x7F) == 64) {
                                            for (int var47 = 0; var47 < field913; var47++) {
                                                class86 var48 = field915[field1121[var47]];
                                                if (var48 != null && var48.field1296.field3620 == 1 && var46.field1149 == var48.field1149 && var46.field1198 == var48.field1198) {
                                                    method126(var48.field1296, field1121[var47], var31, var32);
                                                }
                                            }
                                            int var49 = class95.field1414;
                                            int[] var50 = class95.field1424;
                                            for (int var51 = 0; var51 < var49; var51++) {
                                                class74 var52 = field1054[var50[var51]];
                                                if (var52 != null && var46 != var52 && var46.field1149 == var52.field1149 && var46.field1198 == var52.field1198) {
                                                    method1045(var52, var50[var51], var31, var32);
                                                }
                                            }
                                        }
                                        if (field1095 == var34) {
                                            var27 = var30;
                                        } else {
                                            method1045(var46, var34, var31, var32);
                                        }
                                    }
                                    if (var33 == 3) {
                                        class201 var53 = field985[Statics.field3219][var31][var32];
                                        if (var53 != null) {
                                            for (class94 var54 = (class94) var53.method3487(); var54 != null; var54 = (class94) var53.method3489()) {
                                                class264 var55 = class264.method482(var54.field1404);
                                                if (field1008 == 1) {
                                                    method696(class233.field3081, field975 + " " + class88.field1311 + " " + class88.method3336(16748608) + var55.field3562, 16, var54.field1404, var31, var32);
                                                } else if (!field1098) {
                                                    String[] var56 = var55.field3576;
                                                    if (field908) {
                                                        var56 = method2386(var56);
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
                                                            method696(var56[var57], class88.method3336(16748608) + var55.field3562, var58, var54.field1404, var31, var32);
                                                        } else if (var57 == 2) {
                                                            method696(class233.field3097, class88.method3336(16748608) + var55.field3562, 20, var54.field1404, var31, var32);
                                                        }
                                                    }
                                                    method696(class233.field3082, class88.method3336(16748608) + var55.field3562, 1004, var54.field1404, var31, var32);
                                                } else if ((Statics.field2162 & 0x1) == 1) {
                                                    method696(field1043, field1014 + " " + class88.field1311 + " " + class88.method3336(16748608) + var55.field3562, 17, var54.field1404, var31, var32);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var27 != -1) {
                                int var59 = var27 & 0x7F;
                                int var60 = var27 >> 7 & 0x7F;
                                class74 var61 = field1054[field1095];
                                method1045(var61, field1095, var59, var60);
                            }
                        }
                    } else if (var9.field2729 == 1338) {
                        method123(var9, var10, var11);
                    } else {
                        if (var9.field2729 == 1400) {
                            Statics.field699.method5030(class60.field704, class60.field716 * 10625923, var26, var10, var11, var9.field2740, var9.field2741);
                        }
                        if (!field1072 && var26) {
                            if (var9.field2729 == 1400) {
                                Statics.field699.method5076(var10, var11, var9.field2740, var9.field2741, var24, var25);
                            } else {
                                int var62 = var24 - var10;
                                int var63 = var25 - var11;
                                if (var9.field2728 == 1) {
                                    method696(var9.field2805, "", 24, 0, 0, var9.field2725);
                                }
                                if (var9.field2728 == 2 && !field1098) {
                                    String var64 = method2779(var9);
                                    if (var64 != null) {
                                        method696(var64, class88.method3336(65280) + var9.field2841, 25, 0, -1, var9.field2725);
                                    }
                                }
                                if (var9.field2728 == 3) {
                                    method696(class233.field3090, "", 26, 0, 0, var9.field2725);
                                }
                                if (var9.field2728 == 4) {
                                    method696(var9.field2805, "", 28, 0, 0, var9.field2725);
                                }
                                if (var9.field2728 == 5) {
                                    method696(var9.field2805, "", 29, 0, 0, var9.field2725);
                                }
                                if (var9.field2728 == 6 && field1019 == null) {
                                    method696(var9.field2805, "", 30, 0, -1, var9.field2725);
                                }
                                if (var9.field2727 == 2) {
                                    int var65 = 0;
                                    for (int var66 = 0; var66 < var9.field2741; var66++) {
                                        for (int var67 = 0; var67 < var9.field2740; var67++) {
                                            int var68 = (var9.field2791 + 32) * var67;
                                            int var69 = (var9.field2792 + 32) * var66;
                                            if (var65 < 20) {
                                                var68 += var9.field2860[var65];
                                                var69 += var9.field2839[var65];
                                            }
                                            if (var62 >= var68 && var63 >= var69 && var62 < var68 + 32 && var63 < var69 + 32) {
                                                field1002 = var65;
                                                Statics.field498 = var9;
                                                if (var9.field2778[var65] > 0) {
                                                    label1306: {
                                                        class264 var70 = class264.method482(var9.field2778[var65] - 1);
                                                        if (field1008 == 1) {
                                                            int var71 = method1097(var9);
                                                            boolean var72 = (var71 >> 30 & 0x1) != 0;
                                                            if (var72) {
                                                                if (Statics.field2676 != var9.field2725 || Statics.field469 != var65) {
                                                                    method696(class233.field3081, field975 + " " + class88.field1311 + " " + class88.method3336(16748608) + var70.field3562, 31, var70.field3554, var65, var9.field2725);
                                                                }
                                                                break label1306;
                                                            }
                                                        }
                                                        if (field1098) {
                                                            int var73 = method1097(var9);
                                                            boolean var74 = (var73 >> 30 & 0x1) != 0;
                                                            if (var74) {
                                                                if ((Statics.field2162 & 0x10) == 16) {
                                                                    method696(field1043, field1014 + " " + class88.field1311 + " " + class88.method3336(16748608) + var70.field3562, 32, var70.field3554, var65, var9.field2725);
                                                                }
                                                                break label1306;
                                                            }
                                                        }
                                                        String[] var75 = var70.field3577;
                                                        if (field908) {
                                                            String[] var76 = method2386(var75);
                                                        }
                                                        int var77 = -1;
                                                        if (field1003 && class51.field607[81]) {
                                                            var77 = var70.method4448();
                                                        }
                                                        int var78 = method1097(var9);
                                                        boolean var79 = (var78 >> 30 & 0x1) != 0;
                                                        if (var79) {
                                                            for (int var80 = 4; var80 >= 3; var80--) {
                                                                if (var77 != var80) {
                                                                    method687(var9, var70, var65, var80, false);
                                                                }
                                                            }
                                                        }
                                                        int var81 = method1097(var9);
                                                        boolean var82 = (var81 >> 31 & 0x1) != 0;
                                                        if (var82) {
                                                            method696(class233.field3081, class88.method3336(16748608) + var70.field3562, 38, var70.field3554, var65, var9.field2725);
                                                        }
                                                        int var83 = method1097(var9);
                                                        boolean var84 = (var83 >> 30 & 0x1) != 0;
                                                        if (var84) {
                                                            for (int var85 = 2; var85 >= 0; var85--) {
                                                                if (var77 != var85) {
                                                                    method687(var9, var70, var65, var85, false);
                                                                }
                                                            }
                                                            if (var77 >= 0) {
                                                                method687(var9, var70, var65, var77, true);
                                                            }
                                                        }
                                                        String[] var86 = var9.field2796;
                                                        if (field908) {
                                                            var86 = method2386(var86);
                                                        }
                                                        if (var86 != null) {
                                                            for (int var87 = 4; var87 >= 0; var87--) {
                                                                if (var86[var87] != null) {
                                                                    byte var88 = 0;
                                                                    if (var87 == 0) {
                                                                        var88 = 39;
                                                                    }
                                                                    if (var87 == 1) {
                                                                        var88 = 40;
                                                                    }
                                                                    if (var87 == 2) {
                                                                        var88 = 41;
                                                                    }
                                                                    if (var87 == 3) {
                                                                        var88 = 42;
                                                                    }
                                                                    if (var87 == 4) {
                                                                        var88 = 43;
                                                                    }
                                                                    method696(var86[var87], class88.method3336(16748608) + var70.field3562, var88, var70.field3554, var65, var9.field2725);
                                                                }
                                                            }
                                                        }
                                                        method696(class233.field3082, class88.method3336(16748608) + var70.field3562, 1005, var70.field3554, var65, var9.field2725);
                                                    }
                                                }
                                            }
                                            var65++;
                                        }
                                    }
                                }
                                if (var9.field2724) {
                                    if (!field1098) {
                                        for (int var89 = 9; var89 >= 5; var89--) {
                                            String var90 = method41(var9, var89);
                                            if (var90 != null) {
                                                method696(var90, var9.field2842, 1007, var89 + 1, var9.field2726, var9.field2725);
                                            }
                                        }
                                        String var91 = method2779(var9);
                                        if (var91 != null) {
                                            method696(var91, var9.field2842, 25, 0, var9.field2726, var9.field2725);
                                        }
                                        for (int var92 = 4; var92 >= 0; var92--) {
                                            String var93 = method41(var9, var92);
                                            if (var93 != null) {
                                                method696(var93, var9.field2842, 57, var92 + 1, var9.field2726, var9.field2725);
                                            }
                                        }
                                        if (class225.method161(method1097(var9))) {
                                            method696(class233.field3022, "", 30, 0, var9.field2726, var9.field2725);
                                        }
                                    } else if (Statics.method2960(method1097(var9)) && (Statics.field2162 & 0x20) == 32) {
                                        method696(field1043, field1014 + " " + class88.field1311 + " " + var9.field2842, 58, 0, var9.field2726, var9.field2725);
                                    }
                                }
                            }
                        }
                        if (var9.field2727 == 0) {
                            if (!var9.field2724 && method3249(var9) && Statics.field3410 != var9) {
                                continue;
                            }
                            method1765(arg0, var9.field2725, var12, var13, var14, var15, var10 - var9.field2746, var11 - var9.field2747);
                            if (var9.field2779 != null) {
                                method1765(var9.field2779, var9.field2725, var12, var13, var14, var15, var10 - var9.field2746, var11 - var9.field2747);
                            }
                            class68 var94 = (class68) field1070.method3438((long) var9.field2725);
                            if (var94 != null) {
                                if (var94.field791 == 0 && class60.field704 >= var12 && class60.field716 * 10625923 >= var13 && class60.field704 < var14 && class60.field716 * 10625923 < var15 && !field1072 && !field968) {
                                    for (class69 var95 = (class69) field1011.method3500(); var95 != null; var95 = (class69) field1011.method3511()) {
                                        if (var95.field799) {
                                            var95.method3475();
                                            var95.field800.field2721 = false;
                                        }
                                    }
                                    if (Statics.field489 == 0) {
                                        field1028 = null;
                                        field1029 = null;
                                    }
                                    if (!field1072) {
                                        method3931();
                                    }
                                }
                                int var96 = var94.field797;
                                if (class224.method3331(var96)) {
                                    method1765(Statics.field257[var96], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2724) {
                            if (var9.field2858) {
                                if (class60.field704 >= var12 && class60.field716 * 10625923 >= var13 && class60.field704 < var14 && class60.field716 * 10625923 < var15) {
                                    for (class69 var97 = (class69) field1011.method3500(); var97 != null; var97 = (class69) field1011.method3511()) {
                                        if (var97.field799) {
                                            var97.method3475();
                                            var97.field800.field2721 = false;
                                        }
                                    }
                                    if (Statics.field489 == 0) {
                                        field1028 = null;
                                        field1029 = null;
                                    }
                                    if (!field1072) {
                                        method3931();
                                    }
                                }
                            } else if (var9.field2827 && class60.field704 >= var12 && class60.field716 * 10625923 >= var13 && class60.field704 < var14 && class60.field716 * 10625923 < var15) {
                                for (class69 var98 = (class69) field1011.method3500(); var98 != null; var98 = (class69) field1011.method3511()) {
                                    if (var98.field799 && var98.field800.field2826 == var98.field798) {
                                        var98.method3475();
                                    }
                                }
                            }
                            boolean var99;
                            if (class60.field704 >= var12 && class60.field716 * 10625923 >= var13 && class60.field704 < var14 && class60.field716 * 10625923 < var15) {
                                var99 = true;
                            } else {
                                var99 = false;
                            }
                            boolean var100 = false;
                            if ((class60.field706 == 1 || !Statics.field957 && class60.field706 == 4) && var99) {
                                var100 = true;
                            }
                            boolean var101 = false;
                            if ((class60.field709 == 1 || !Statics.field957 && class60.field709 == 4) && class60.field710 >= var12 && class60.field711 >= var13 && class60.field710 < var14 && class60.field711 < var15) {
                                var101 = true;
                            }
                            if (var101) {
                                method1631(var9, class60.field710 - var10, class60.field711 - var11);
                            }
                            if (var9.field2729 == 1400) {
                                Statics.field699.method5132(class60.field704, class60.field716 * 10625923, var99 & var100, var99 & var101);
                            }
                            if (field1028 != null && field1028 != var9 && var99 && class225.method4028(method1097(var9))) {
                                field891 = var9;
                            }
                            if (field1029 == var9) {
                                field1047 = true;
                                field1034 = var10;
                                field1035 = var11;
                            }
                            if (var9.field2771) {
                                if (var99 && field1053 != 0 && var9.field2826 != null) {
                                    class69 var102 = new class69();
                                    var102.field799 = true;
                                    var102.field800 = var9;
                                    var102.field802 = field1053;
                                    var102.field798 = var9.field2826;
                                    field1011.method3502(var102);
                                }
                                if (field1028 != null || Statics.field493 != null || field1072) {
                                    var101 = false;
                                    var100 = false;
                                    var99 = false;
                                }
                                if (!var9.field2720 && var101) {
                                    var9.field2720 = true;
                                    if (var9.field2807 != null) {
                                        class69 var103 = new class69();
                                        var103.field799 = true;
                                        var103.field800 = var9;
                                        var103.field801 = class60.field710 - var10;
                                        var103.field802 = class60.field711 - var11;
                                        var103.field798 = var9.field2807;
                                        field1011.method3502(var103);
                                    }
                                }
                                if (var9.field2720 && var100 && var9.field2806 != null) {
                                    class69 var104 = new class69();
                                    var104.field799 = true;
                                    var104.field800 = var9;
                                    var104.field801 = class60.field704 - var10;
                                    var104.field802 = class60.field716 * 10625923 - var11;
                                    var104.field798 = var9.field2806;
                                    field1011.method3502(var104);
                                }
                                if (var9.field2720 && !var100) {
                                    var9.field2720 = false;
                                    if (var9.field2853 != null) {
                                        class69 var105 = new class69();
                                        var105.field799 = true;
                                        var105.field800 = var9;
                                        var105.field801 = class60.field704 - var10;
                                        var105.field802 = class60.field716 * 10625923 - var11;
                                        var105.field798 = var9.field2853;
                                        field1106.method3502(var105);
                                    }
                                }
                                if (var100 && var9.field2761 != null) {
                                    class69 var106 = new class69();
                                    var106.field799 = true;
                                    var106.field800 = var9;
                                    var106.field801 = class60.field704 - var10;
                                    var106.field802 = class60.field716 * 10625923 - var11;
                                    var106.field798 = var9.field2761;
                                    field1011.method3502(var106);
                                }
                                if (!var9.field2721 && var99) {
                                    var9.field2721 = true;
                                    if (var9.field2723 != null) {
                                        class69 var107 = new class69();
                                        var107.field799 = true;
                                        var107.field800 = var9;
                                        var107.field801 = class60.field704 - var10;
                                        var107.field802 = class60.field716 * 10625923 - var11;
                                        var107.field798 = var9.field2723;
                                        field1011.method3502(var107);
                                    }
                                }
                                if (var9.field2721 && var99 && var9.field2812 != null) {
                                    class69 var108 = new class69();
                                    var108.field799 = true;
                                    var108.field800 = var9;
                                    var108.field801 = class60.field704 - var10;
                                    var108.field802 = class60.field716 * 10625923 - var11;
                                    var108.field798 = var9.field2812;
                                    field1011.method3502(var108);
                                }
                                if (var9.field2721 && !var99) {
                                    var9.field2721 = false;
                                    if (var9.field2750 != null) {
                                        class69 var109 = new class69();
                                        var109.field799 = true;
                                        var109.field800 = var9;
                                        var109.field801 = class60.field704 - var10;
                                        var109.field802 = class60.field716 * 10625923 - var11;
                                        var109.field798 = var9.field2750;
                                        field1106.method3502(var109);
                                    }
                                }
                                if (var9.field2824 != null) {
                                    class69 var110 = new class69();
                                    var110.field800 = var9;
                                    var110.field798 = var9.field2824;
                                    field1055.method3502(var110);
                                }
                                if (var9.field2849 != null && field1042 > var9.field2833) {
                                    if (var9.field2743 == null || field1042 - var9.field2833 > 32) {
                                        class69 var115 = new class69();
                                        var115.field800 = var9;
                                        var115.field798 = var9.field2849;
                                        field1011.method3502(var115);
                                    } else {
                                        label977: for (int var111 = var9.field2833; var111 < field1042; var111++) {
                                            int var112 = field1041[var111 & 0x1F];
                                            for (int var113 = 0; var113 < var9.field2743.length; var113++) {
                                                if (var9.field2743[var113] == var112) {
                                                    class69 var114 = new class69();
                                                    var114.field800 = var9;
                                                    var114.field798 = var9.field2849;
                                                    field1011.method3502(var114);
                                                    break label977;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2833 = field1042;
                                }
                                if (var9.field2799 != null && field962 > var9.field2854) {
                                    if (var9.field2821 == null || field962 - var9.field2854 > 32) {
                                        class69 var120 = new class69();
                                        var120.field800 = var9;
                                        var120.field798 = var9.field2799;
                                        field1011.method3502(var120);
                                    } else {
                                        label953: for (int var116 = var9.field2854; var116 < field962; var116++) {
                                            int var117 = field938[var116 & 0x1F];
                                            for (int var118 = 0; var118 < var9.field2821.length; var118++) {
                                                if (var9.field2821[var118] == var117) {
                                                    class69 var119 = new class69();
                                                    var119.field800 = var9;
                                                    var119.field798 = var9.field2799;
                                                    field1011.method3502(var119);
                                                    break label953;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2854 = field962;
                                }
                                if (var9.field2822 != null && field895 > var9.field2855) {
                                    if (var9.field2808 == null || field895 - var9.field2855 > 32) {
                                        class69 var125 = new class69();
                                        var125.field800 = var9;
                                        var125.field798 = var9.field2822;
                                        field1011.method3502(var125);
                                    } else {
                                        label929: for (int var121 = var9.field2855; var121 < field895; var121++) {
                                            int var122 = field1093[var121 & 0x1F];
                                            for (int var123 = 0; var123 < var9.field2808.length; var123++) {
                                                if (var9.field2808[var123] == var122) {
                                                    class69 var124 = new class69();
                                                    var124.field800 = var9;
                                                    var124.field798 = var9.field2822;
                                                    field1011.method3502(var124);
                                                    break label929;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2855 = field895;
                                }
                                if (field872 > var9.field2852 && var9.field2850 != null) {
                                    class69 var126 = new class69();
                                    var126.field800 = var9;
                                    var126.field798 = var9.field2850;
                                    field1011.method3502(var126);
                                }
                                if (field978 > var9.field2852 && var9.field2829 != null) {
                                    class69 var127 = new class69();
                                    var127.field800 = var9;
                                    var127.field798 = var9.field2829;
                                    field1011.method3502(var127);
                                }
                                if (field1049 > var9.field2852 && var9.field2830 != null) {
                                    class69 var128 = new class69();
                                    var128.field800 = var9;
                                    var128.field798 = var9.field2830;
                                    field1011.method3502(var128);
                                }
                                if (field1050 > var9.field2852 && var9.field2835 != null) {
                                    class69 var129 = new class69();
                                    var129.field800 = var9;
                                    var129.field798 = var9.field2835;
                                    field1011.method3502(var129);
                                }
                                if (field1051 > var9.field2852 && var9.field2836 != null) {
                                    class69 var130 = new class69();
                                    var130.field800 = var9;
                                    var130.field798 = var9.field2836;
                                    field1011.method3502(var130);
                                }
                                if (field1052 > var9.field2852 && var9.field2831 != null) {
                                    class69 var131 = new class69();
                                    var131.field800 = var9;
                                    var131.field798 = var9.field2831;
                                    field1011.method3502(var131);
                                }
                                var9.field2852 = field882;
                                if (var9.field2828 != null) {
                                    for (int var132 = 0; var132 < field1076; var132++) {
                                        class69 var133 = new class69();
                                        var133.field800 = var9;
                                        var133.field803 = field1078[var132];
                                        var133.field811 = field1056[var132];
                                        var133.field798 = var9.field2828;
                                        field1011.method3502(var133);
                                    }
                                }
                            }
                        }
                        if (!var9.field2724 && field1028 == null && Statics.field493 == null && !field1072) {
                            if ((var9.field2840 >= 0 || var9.field2752 != 0) && class60.field704 >= var12 && class60.field716 * 10625923 >= var13 && class60.field704 < var14 && class60.field716 * 10625923 < var15) {
                                if (var9.field2840 >= 0) {
                                    Statics.field3410 = arg0[var9.field2840];
                                } else {
                                    Statics.field3410 = var9;
                                }
                            }
                            if (var9.field2727 == 8 && class60.field704 >= var12 && class60.field716 * 10625923 >= var13 && class60.field704 < var14 && class60.field716 * 10625923 < var15) {
                                Statics.field280 = var9;
                            }
                            if (var9.field2749 > var9.field2741) {
                                int var134 = var9.field2740 + var10;
                                int var135 = var9.field2741;
                                int var136 = var9.field2749;
                                int var137 = class60.field704;
                                int var138 = class60.field716 * 10625923;
                                if (field974) {
                                    field937 = 32;
                                } else {
                                    field937 = 0;
                                }
                                field974 = false;
                                if (class60.field706 == 1 || !Statics.field957 && class60.field706 == 4) {
                                    if (var137 >= var134 && var137 < var134 + 16 && var138 >= var11 && var138 < var11 + 16) {
                                        var9.field2747 -= 4;
                                        method503(var9);
                                    } else if (var137 >= var134 && var137 < var134 + 16 && var138 >= var11 + var135 - 16 && var138 < var11 + var135) {
                                        var9.field2747 += 4;
                                        method503(var9);
                                    } else if (var137 >= var134 - field937 && var137 < field937 + var134 + 16 && var138 >= var11 + 16 && var138 < var11 + var135 - 16) {
                                        int var139 = (var135 - 32) * var135 / var136;
                                        if (var139 < 8) {
                                            var139 = 8;
                                        }
                                        int var140 = var138 - var11 - 16 - var139 / 2;
                                        int var141 = var135 - 32 - var139;
                                        var9.field2747 = (var136 - var135) * var140 / var141;
                                        method503(var9);
                                        field974 = true;
                                    }
                                }
                                if (field1053 != 0) {
                                    int var142 = var9.field2740;
                                    if (var137 >= var134 - var142 && var138 >= var11 && var137 < var134 + 16 && var138 <= var11 + var135) {
                                        var9.field2747 += field1053 * 45;
                                        method503(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.iq(III)V")
    public static final void method79(int arg0, int arg1) {
        if (class224.method3331(arg0)) {
            method121(Statics.field257[arg0], arg1);
        }
    }

    @ObfuscatedName("f.jl([Lhx;II)V")
    public static final void method121(class224[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class224 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2727 == 0) {
                    if (var3.field2779 != null) {
                        method121(var3.field2779, arg1);
                    }
                    class68 var4 = (class68) field1070.method3438((long) var3.field2725);
                    if (var4 != null) {
                        method79(var4.field797, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2832 != null) {
                    class69 var5 = new class69();
                    var5.field800 = var3;
                    var5.field798 = var3.field2832;
                    class83.method86(var5);
                }
                if (arg1 == 1 && var3.field2862 != null) {
                    if (var3.field2726 >= 0) {
                        class224 var6 = class224.method1627(var3.field2725);
                        if (var6 == null || var6.field2779 == null || var3.field2726 >= var6.field2779.length || var6.field2779[var3.field2726] != var3) {
                            continue;
                        }
                    }
                    class69 var7 = new class69();
                    var7.field800 = var3;
                    var7.field798 = var3.field2862;
                    class83.method86(var7);
                }
            }
        }
    }

    @ObfuscatedName("ck.jh(Lhx;III)V")
    public static final void method1631(class224 arg0, int arg1, int arg2) {
        if (field1028 != null || field1072 || arg0 == null || method688(arg0) == null) {
            return;
        }
        field1028 = arg0;
        field1029 = method688(arg0);
        field1030 = arg1;
        field954 = arg2;
        Statics.field489 = 0;
        field1015 = false;
        int var3 = field994 - 1;
        if (var3 == -1) {
            return;
        }
        Statics.field3692 = new class89();
        Statics.field3692.field1327 = field1048[var3];
        Statics.field3692.field1322 = field996[var3];
        Statics.field3692.field1326 = field997[var3];
        Statics.field3692.field1328 = field988[var3];
        Statics.field3692.field1325 = field999[var3];
    }

    @ObfuscatedName("client.jv(I)V")
    public final void method1115() {
        method503(field1028);
        Statics.field489++;
        if (field992 && field1047) {
            int var1 = class60.field704;
            int var2 = class60.field716 * 10625923;
            int var3 = var1 - field1030;
            int var4 = var2 - field954;
            if (var3 < field1034) {
                var3 = field1034;
            }
            if (field1028.field2740 + var3 > field1034 + field1029.field2740) {
                var3 = field1034 + field1029.field2740 - field1028.field2740;
            }
            if (var4 < field1035) {
                var4 = field1035;
            }
            if (field1028.field2741 + var4 > field1035 + field1029.field2741) {
                var4 = field1035 + field1029.field2741 - field1028.field2741;
            }
            int var5 = var3 - field1104;
            int var6 = var4 - field1038;
            int var7 = field1028.field2801;
            if (Statics.field489 > field1028.field2802 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1015 = true;
            }
            int var8 = field1029.field2746 + (var3 - field1034);
            int var9 = field1029.field2747 + (var4 - field1035);
            if (field1028.field2814 != null && field1015) {
                class69 var10 = new class69();
                var10.field800 = field1028;
                var10.field801 = var8;
                var10.field802 = var9;
                var10.field798 = field1028.field2814;
                class83.method86(var10);
            }
            if (class60.field706 == 0) {
                if (field1015) {
                    if (field1028.field2815 != null) {
                        class69 var11 = new class69();
                        var11.field800 = field1028;
                        var11.field801 = var8;
                        var11.field802 = var9;
                        var11.field804 = field891;
                        var11.field798 = field1028.field2815;
                        class83.method86(var11);
                    }
                    if (field891 != null) {
                        class224 var12 = field1028;
                        int var13 = class225.method137(method1097(var12));
                        class224 var14;
                        if (var13 == 0) {
                            var14 = null;
                        } else {
                            int var15 = 0;
                            while (true) {
                                if (var15 >= var13) {
                                    var14 = var12;
                                    break;
                                }
                                var12 = class224.method1627(var12.field2744);
                                if (var12 == null) {
                                    var14 = null;
                                    break;
                                }
                                var15++;
                            }
                        }
                        if (var14 != null) {
                            class171 var16 = class171.method3795(class168.field2351, field917.field1471);
                            var16.field2423.method3040(field1028.field2754);
                            var16.field2423.method3070(field891.field2726);
                            var16.field2423.method3081(field1028.field2725);
                            var16.field2423.method3081(field891.field2725);
                            var16.field2423.method3072(field891.field2754);
                            var16.field2423.method3040(field1028.field2726);
                            field917.method1777(var16);
                        }
                    }
                } else if (this.method1111()) {
                    this.method1112(field1104 + field1030, field954 + field1038);
                } else if (field994 > 0) {
                    method2003(field1104 + field1030, field954 + field1038);
                }
                field1028 = null;
            }
        } else if (Statics.field489 > 1) {
            field1028 = null;
        }
    }

    @ObfuscatedName("dc.jn(IIB)V")
    public static void method2003(int arg0, int arg1) {
        class89 var2 = Statics.field3692;
        method2293(var2.field1327, var2.field1322, var2.field1326, var2.field1328, var2.field1325, var2.field1325, arg0, arg1);
        Statics.field3692 = null;
    }

    @ObfuscatedName("ad.jd(Lhx;I)V")
    public static void method503(class224 arg0) {
        if (field1059 == arg0.field2857) {
            field1060[arg0.field2856] = true;
        }
    }

    @ObfuscatedName("aw.jc(I)V")
    public static void method480() {
        for (class68 var0 = (class68) field1070.method3437(); var0 != null; var0 = (class68) field1070.method3433()) {
            int var1 = var0.field797;
            if (class224.method3331(var1)) {
                boolean var2 = true;
                class224[] var3 = Statics.field257[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2724;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2564;
                    class224 var6 = class224.method1627(var5);
                    if (var6 != null) {
                        method503(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("at.jj(Lhx;B)Lhx;")
    public static class224 method688(class224 arg0) {
        class224 var1 = arg0;
        int var2 = class225.method137(method1097(arg0));
        class224 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class224.method1627(var1.field2744);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class224 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2800;
        }
        return var5;
    }

    @ObfuscatedName("dd.jk([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2386(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("aq.ju(IB)V")
    public static final void method233(int arg0) {
        if (!class224.method3331(arg0)) {
            return;
        }
        class224[] var1 = Statics.field257[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class224 var3 = var1[var2];
            if (var3 != null) {
                var3.field2847 = 0;
                var3.field2784 = 0;
            }
        }
    }

    @ObfuscatedName("bt.jp([Lhx;II)V")
    public static final void method1038(class224[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class224 var3 = arg0[var2];
            if (var3 != null && var3.field2744 == arg1 && (!var3.field2724 || !method3249(var3))) {
                if (var3.field2727 == 0) {
                    if (!var3.field2724 && method3249(var3) && Statics.field3410 != var3) {
                        continue;
                    }
                    method1038(arg0, var3.field2725);
                    if (var3.field2779 != null) {
                        method1038(var3.field2779, var3.field2725);
                    }
                    class68 var4 = (class68) field1070.method3438((long) var3.field2725);
                    if (var4 != null) {
                        int var5 = var4.field797;
                        if (class224.method3331(var5)) {
                            method1038(Statics.field257[var5], -1);
                        }
                    }
                }
                if (var3.field2727 == 6) {
                    if (var3.field2845 != -1 || var3.field2773 != -1) {
                        boolean var6 = method1732(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2773;
                        } else {
                            var7 = var3.field2845;
                        }
                        if (var7 != -1) {
                            class268 var8 = class268.method76(var7);
                            var3.field2784 += field993;
                            while (var3.field2784 > var8.field3671[var3.field2847]) {
                                var3.field2784 -= var8.field3671[var3.field2847];
                                var3.field2847++;
                                if (var3.field2847 >= var8.field3669.length) {
                                    var3.field2847 -= var8.field3673;
                                    if (var3.field2847 < 0 || var3.field2847 >= var8.field3669.length) {
                                        var3.field2847 = 0;
                                    }
                                }
                                method503(var3);
                            }
                        }
                    }
                    if (var3.field2781 != 0 && !var3.field2724) {
                        int var9 = var3.field2781 >> 16;
                        int var10 = var3.field2781 << 16 >> 16;
                        int var11 = field993 * var9;
                        int var12 = field993 * var10;
                        var3.field2776 = var3.field2776 + var11 & 0x7FF;
                        var3.field2777 = var3.field2777 + var12 & 0x7FF;
                        method503(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cy.jq(II)V")
    public static final void method1596(int arg0) {
        method480();
        class82.method1031();
        class249 var1 = (class249) class249.field3361.method3418((long) arg0);
        class249 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3360.method3935(16, arg0);
            class249 var4 = new class249();
            if (var3 != null) {
                var4.method4098(new class181(var3));
            }
            class249.field3361.method3417(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var5 = var2.field3359;
        if (var5 == 0) {
            return;
        }
        int var6 = class219.field2688[arg0];
        if (var5 == 1) {
            if (var6 == 1) {
                class136.method2563(0.9D);
                ((class125) Statics.field1933).method2265(0.9D);
            }
            if (var6 == 2) {
                class136.method2563(0.8D);
                ((class125) Statics.field1933).method2265(0.8D);
            }
            if (var6 == 3) {
                class136.method2563(0.7D);
                ((class125) Statics.field1933).method2265(0.7D);
            }
            if (var6 == 4) {
                class136.method2563(0.6D);
                ((class125) Statics.field1933).method2265(0.6D);
            }
            class264.method226();
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
            if (field1114 != var7) {
                if (field1114 == 0 && field1091 != -1) {
                    class211.method3058(Statics.field631, field1091, 0, var7, false);
                    field1096 = false;
                } else if (var7 == 0) {
                    class211.method1033();
                    field1096 = false;
                } else {
                    class211.method26(var7);
                }
                field1114 = var7;
            }
        }
        if (var5 == 4) {
            if (var6 == 0) {
                field1010 = 127;
            }
            if (var6 == 1) {
                field1010 = 96;
            }
            if (var6 == 2) {
                field1010 = 64;
            }
            if (var6 == 3) {
                field1010 = 32;
            }
            if (var6 == 4) {
                field1010 = 0;
            }
        }
        if (var5 == 5) {
            field1022 = var6;
        }
        if (var5 == 6) {
            field1017 = var6;
        }
        if (var5 == 9) {
            field928 = var6;
        }
        if (var5 == 10) {
            if (var6 == 0) {
                field1094 = 127;
            }
            if (var6 == 1) {
                field1094 = 96;
            }
            if (var6 == 2) {
                field1094 = 64;
            }
            if (var6 == 3) {
                field1094 = 32;
            }
            if (var6 == 4) {
                field1094 = 0;
            }
        }
        if (var5 == 17) {
            field1083 = var6 & 0xFFFF;
        }
        if (var5 == 18) {
            field898 = (class91) class176.method1702(class91.method591(), var6);
            if (field898 == null) {
                field898 = class91.field1338;
            }
        }
        if (var5 == 19) {
            if (var6 == -1) {
                field1095 = -1;
            } else {
                field1095 = var6 & 0x7FF;
            }
        }
        if (var5 == 22) {
            field899 = (class91) class176.method1702(class91.method591(), var6);
            if (field899 == null) {
                field899 = class91.field1338;
            }
        }
    }

    @ObfuscatedName("aq.jm(B)V")
    public static final void method237() {
        class171 var0 = class171.method3795(class168.field2314, field917.field1471);
        field917.method1777(var0);
        for (class68 var1 = (class68) field1070.method3437(); var1 != null; var1 = (class68) field1070.method3433()) {
            if (var1.field791 == 0 || var1.field791 == 3) {
                method499(var1, true);
            }
        }
        if (field1019 != null) {
            method503(field1019);
            field1019 = null;
        }
    }

    @ObfuscatedName("ap.jg(Lbr;ZI)V")
    public static final void method499(class68 arg0, boolean arg1) {
        int var2 = arg0.field797;
        int var3 = (int) arg0.field2564;
        arg0.method3475();
        if (arg1 && var2 != -1 && Statics.field646[var2]) {
            Statics.field755.method3948(var2);
            if (Statics.field257[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field257[var2].length; var5++) {
                    if (Statics.field257[var2][var5] != null) {
                        if (Statics.field257[var2][var5].field2727 == 2) {
                            var4 = false;
                        } else {
                            Statics.field257[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field257[var2] = null;
                }
                Statics.field646[var2] = false;
            }
        }
        Statics.method3921(var2);
        class224 var6 = class224.method1627(var3);
        if (var6 != null) {
            method503(var6);
        }
        method1629();
        if (field1016 != -1) {
            method79(field1016, 1);
        }
    }

    @ObfuscatedName("es.jr(Lhx;I)Z")
    public static final boolean method2770(class224 arg0) {
        int var1 = arg0.field2729;
        if (var1 == 205) {
            field1109 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1126.method3816(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1126.method3817(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1126.method3842(false);
        }
        if (var1 == 325) {
            field1126.method3842(true);
        }
        if (var1 == 326) {
            class171 var6 = class171.method3795(class168.field2371, field917.field1471);
            field1126.method3819(var6.field2423);
            field917.method1777(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bm.jw(Lhx;IIII)V")
    public static final void method1006(class224 arg0, int arg1, int arg2, int arg3) {
        method181();
        class218 var4 = arg0.method3871(false);
        if (var4 == null) {
            return;
        }
        class291.method4800(arg1, arg2, var4.field2684 + arg1, var4.field2683 + arg2);
        if (field1089 == 2 || field1089 == 5) {
            class291.method4805(arg1, arg2, 0, var4.field2685, var4.field2682);
        } else {
            int var5 = field939 & 0x7FF;
            int var6 = Statics.field2501.field1149 / 32 + 48;
            int var7 = 464 - Statics.field2501.field1198 / 32;
            Statics.field13.method4907(arg1, arg2, var4.field2684, var4.field2683, var6, var7, var5, 256, var4.field2685, var4.field2682);
            for (int var8 = 0; var8 < field1025; var8++) {
                int var9 = field995[var8] * 4 + 2 - Statics.field2501.field1149 / 32;
                int var10 = field1085[var8] * 4 + 2 - Statics.field2501.field1198 / 32;
                method999(arg1, arg2, var9, var10, field1018[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class201 var13 = field985[Statics.field3219][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2501.field1149 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2501.field1198 / 32;
                        method999(arg1, arg2, var14, var15, Statics.field302[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field913; var16++) {
                class86 var17 = field915[field1121[var16]];
                if (var17 != null && var17.method1065()) {
                    class266 var18 = var17.field1296;
                    if (var18 != null && var18.field3644 != null) {
                        var18 = var18.method4482();
                    }
                    if (var18 != null && var18.field3635 && var18.field3628) {
                        int var19 = var17.field1149 / 32 - Statics.field2501.field1149 / 32;
                        int var20 = var17.field1198 / 32 - Statics.field2501.field1198 / 32;
                        method999(arg1, arg2, var19, var20, Statics.field302[1], var4);
                    }
                }
            }
            int var21 = class95.field1414;
            int[] var22 = class95.field1424;
            for (int var23 = 0; var23 < var21; var23++) {
                class74 var24 = field1054[var22[var23]];
                if (var24 != null && var24.method1065() && !var24.field839 && Statics.field2501 != var24) {
                    int var25 = var24.field1149 / 32 - Statics.field2501.field1149 / 32;
                    int var26 = var24.field1198 / 32 - Statics.field2501.field1198 / 32;
                    boolean var27 = false;
                    if (method6(var24.field844, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field733; var29++) {
                        if (var24.field844.equals(Statics.field2537[var29].field871)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field2501.field855 != 0 && var24.field855 != 0 && Statics.field2501.field855 == var24.field855) {
                        var30 = true;
                    }
                    if (var27) {
                        method999(arg1, arg2, var25, var26, Statics.field302[3], var4);
                    } else if (var30) {
                        method999(arg1, arg2, var25, var26, Statics.field302[4], var4);
                    } else if (var28) {
                        method999(arg1, arg2, var25, var26, Statics.field302[5], var4);
                    } else {
                        method999(arg1, arg2, var25, var26, Statics.field302[2], var4);
                    }
                }
            }
            if (field907 != 0 && field881 % 20 < 10) {
                if (field907 == 1 && field926 >= 0 && field926 < field915.length) {
                    class86 var31 = field915[field926];
                    if (var31 != null) {
                        int var32 = var31.field1149 / 32 - Statics.field2501.field1149 / 32;
                        int var33 = var31.field1198 / 32 - Statics.field2501.field1198 / 32;
                        method1683(arg1, arg2, var32, var33, Statics.field676[1], var4);
                    }
                }
                if (field907 == 2) {
                    int var34 = field892 * 4 - Statics.field3306 * 4 + 2 - Statics.field2501.field1149 / 32;
                    int var35 = field893 * 4 - Statics.field2066 * 4 + 2 - Statics.field2501.field1198 / 32;
                    method1683(arg1, arg2, var34, var35, Statics.field676[1], var4);
                }
                if (field907 == 10 && field1031 >= 0 && field1031 < field1054.length) {
                    class74 var36 = field1054[field1031];
                    if (var36 != null) {
                        int var37 = var36.field1149 / 32 - Statics.field2501.field1149 / 32;
                        int var38 = var36.field1198 / 32 - Statics.field2501.field1198 / 32;
                        method1683(arg1, arg2, var37, var38, Statics.field676[1], var4);
                    }
                }
            }
            if (field1087 != 0) {
                int var39 = field1087 * 4 + 2 - Statics.field2501.field1149 / 32;
                int var40 = field1088 * 4 + 2 - Statics.field2501.field1198 / 32;
                method999(arg1, arg2, var39, var40, Statics.field676[0], var4);
            }
            if (!Statics.field2501.field839) {
                class291.method4819(var4.field2684 / 2 + arg1 - 1, var4.field2683 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field1100[arg3] = true;
    }

    @ObfuscatedName("gc.je(Lhx;IIII)V")
    public static final void method3275(class224 arg0, int arg1, int arg2, int arg3) {
        class218 var4 = arg0.method3871(false);
        if (var4 == null) {
            return;
        }
        if (field1089 < 3) {
            Statics.field375.method4907(arg1, arg2, var4.field2684, var4.field2683, 25, 25, field939, 256, var4.field2685, var4.field2682);
        } else {
            class291.method4805(arg1, arg2, 0, var4.field2685, var4.field2682);
        }
    }

    @ObfuscatedName("cp.jt(IIIILky;Lhl;I)V")
    public static final void method1683(int arg0, int arg1, int arg2, int arg3, class295 arg4, class218 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method999(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field939 & 0x7FF;
        int var8 = class136.field1943[var7];
        int var9 = class136.field1940[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2684 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field22.method4915(arg5.field2684 / 2 + arg0 - var17 / 2 + var15, arg5.field2683 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("bl.ja(IIIILky;Lhl;B)V")
    public static final void method999(int arg0, int arg1, int arg2, int arg3, class295 arg4, class218 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field939 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class136.field1943[var6];
        int var9 = class136.field1940[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method4928(arg5.field2684 / 2 + var10 - arg4.field3837 / 2, arg5.field2683 / 2 - var11 - arg4.field3840 / 2, arg0, arg1, arg5.field2684, arg5.field2683, arg5.field2685, arg5.field2682);
        } else {
            arg4.method4903(arg5.field2684 / 2 + arg0 + var10 - arg4.field3837 / 2, arg5.field2683 / 2 + arg1 - var11 - arg4.field3840 / 2);
        }
    }

    @ObfuscatedName("k.jo(Ljava/lang/String;ZI)Z")
    public static boolean method6(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class275.method1598(arg0, Statics.field3240);
        for (int var3 = 0; var3 < field1120; var3++) {
            if (var2.equalsIgnoreCase(class275.method1598(field1122[var3].field780, Statics.field3240)) && (!arg1 || field1122[var3].field783 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class275.method1598(Statics.field2501.field844, Statics.field3240))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ax.ji(Ljava/lang/String;I)Z")
    public static boolean method228(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class275.method1598(arg0, Statics.field3240);
        for (int var2 = 0; var2 < field1124; var2++) {
            class70 var3 = field1125[var2];
            if (var1.equalsIgnoreCase(class275.method1598(var3.field816, Statics.field3240))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class275.method1598(var3.field815, Statics.field3240))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("f.jy(Ljava/lang/String;ZB)V")
    public static final void method122(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field1124 < 100 || field977 == 1) || field1124 >= 400) {
            class97.method706(31, "", class233.field3171);
            return;
        }
        String var2 = class275.method1598(arg0, Statics.field3240);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field1124; var3++) {
            class70 var4 = field1125[var3];
            String var5 = class275.method1598(var4.field816, Statics.field3240);
            if (var5 != null && var5.equals(var2)) {
                class97.method706(31, "", arg0 + class233.field3100);
                return;
            }
            if (var4.field815 != null) {
                String var6 = class275.method1598(var4.field815, Statics.field3240);
                if (var6 != null && var6.equals(var2)) {
                    class97.method706(31, "", arg0 + class233.field3100);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field1120; var7++) {
            class66 var8 = field1122[var7];
            String var9 = class275.method1598(var8.field780, Statics.field3240);
            if (var9 != null && var9.equals(var2)) {
                class97.method706(31, "", class233.field3006 + arg0 + class233.field3106);
                return;
            }
            if (var8.field779 != null) {
                String var10 = class275.method1598(var8.field779, Statics.field3240);
                if (var10 != null && var10.equals(var2)) {
                    class97.method706(31, "", class233.field3006 + arg0 + class233.field3106);
                    return;
                }
            }
        }
        if (class275.method1598(Statics.field2501.field844, Statics.field3240).equals(var2)) {
            class97.method706(31, "", class233.field3102);
        } else {
            class171 var11 = class171.method3795(class168.field2306, field917.field1471);
            var11.field2423.method3020(class181.method1954(arg0));
            var11.field2423.method3027(arg0);
            field917.method1777(var11);
        }
    }

    @ObfuscatedName("gu.jf(Ljava/lang/String;I)V")
    public static final void method3339(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class275.method1598(arg0, Statics.field3240);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1120; var2++) {
            class66 var3 = field1122[var2];
            String var4 = var3.field780;
            String var5 = class275.method1598(var4, Statics.field3240);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field1120--;
                for (int var7 = var2; var7 < field1120; var7++) {
                    field1122[var7] = field1122[var7 + 1];
                }
                field978 = field882;
                class171 var8 = class171.method3795(class168.field2338, field917.field1471);
                var8.field2423.method3020(class181.method1954(arg0));
                var8.field2423.method3027(arg0);
                field917.method1777(var8);
                break;
            }
        }
    }

    @ObfuscatedName("hp.js(Ljava/lang/String;I)V")
    public static final void method3812(String arg0) {
        if (!arg0.equals("")) {
            class171 var1 = class171.method3795(class168.field2316, field917.field1471);
            var1.field2423.method3020(class181.method1954(arg0));
            var1.field2423.method3027(arg0);
            field917.method1777(var1);
        }
    }

    @ObfuscatedName("q.jx(I)V")
    public static final void method159() {
        class171 var0 = class171.method3795(class168.field2316, field917.field1471);
        var0.field2423.method3020(0);
        field917.method1777(var0);
    }

    @ObfuscatedName("bu.ke(Lhx;I)I")
    public static int method1097(class224 arg0) {
        class206 var1 = (class206) field1057.method3438(((long) arg0.field2725 << 32) + (long) arg0.field2726);
        return var1 == null ? arg0.field2818 : var1.field2579;
    }

    @ObfuscatedName("fr.km(Lhx;I)Z")
    public static boolean method3249(class224 arg0) {
        if (field968) {
            if (method1097(arg0) != 0) {
                return false;
            }
            if (arg0.field2727 == 0) {
                return false;
            }
        }
        return arg0.field2745;
    }

    @ObfuscatedName("p.kk(Lhx;II)Ljava/lang/String;")
    public static String method41(class224 arg0, int arg1) {
        int var2 = method1097(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2804 == null) {
            return null;
        } else if (arg0.field2813 == null || arg0.field2813.length <= arg1 || arg0.field2813[arg1] == null || arg0.field2813[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2813[arg1];
        }
    }

    @ObfuscatedName("eg.kc(Lhx;I)Ljava/lang/String;")
    public static String method2779(class224 arg0) {
        int var1 = method1097(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2715 == null || arg0.field2715.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2715;
        }
    }

    @ObfuscatedName("bl.ki(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method997(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field875 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field875 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field875 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field875 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field875 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1240 != null) {
            var3 = "/p=" + Statics.field1240;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field878 + "/a=" + Statics.field398 + var3 + "/";
    }

    @ObfuscatedName("ej.kp(Ljava/lang/String;ZI)V")
    public static void method2776(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3560; var5++) {
            class264 var6 = class264.method482(var5);
            if ((!arg1 || var6.field3595) && var6.field3594 == -1 && var6.field3562.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field2912 = -1;
                    Statics.field627 = null;
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
        Statics.field627 = var3;
        Statics.field322 = 0;
        Statics.field2912 = var4;
        String[] var9 = new String[Statics.field2912];
        for (int var10 = 0; var10 < Statics.field2912; var10++) {
            var9[var10] = class264.method482(var3[var10]).field3562;
        }
        short[] var11 = Statics.field627;
        class178.method1763(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("client.kl(Lfr;IB)V")
    public static void method1447(class181 arg0, int arg1) {
        byte[] var2 = arg0.field2496;
        if (field1084 == null) {
            field1084 = new byte[24];
        }
        class191.method3351(var2, arg1, field1084, 0, 24);
        if (class157.field2156 == null) {
            return;
        }
        try {
            class157.field2156.method2236(0L);
            class157.field2156.method2217(arg0.field2496, arg1, 24);
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("ck.ky(Lfr;S)V")
    public static void method1637(class181 arg0) {
        if (field1084 == null) {
            byte[] var1 = class157.method1096();
            arg0.method3198(var1, 0, var1.length);
        } else {
            arg0.method3198(field1084, 0, field1084.length);
        }
    }
}

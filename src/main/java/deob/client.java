package deob;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import netscape.javascript.JSObject;

public final class client extends class59 {

    @ObfuscatedName("client.w")
    public static class163[] field916 = new class163[4];

    @ObfuscatedName("client.ad")
    public static boolean field1080 = true;

    @ObfuscatedName("client.ba")
    public static int field940 = 1;

    @ObfuscatedName("client.bi")
    public static int field871 = 0;

    @ObfuscatedName("client.bc")
    public static int field900 = 0;

    @ObfuscatedName("client.bt")
    public static boolean field1058 = false;

    @ObfuscatedName("client.be")
    public static boolean field868 = false;

    @ObfuscatedName("client.by")
    public static int field1092 = 0;

    @ObfuscatedName("client.bh")
    public static int field870 = 0;

    @ObfuscatedName("client.bp")
    public static boolean field1006 = true;

    @ObfuscatedName("client.bf")
    public static int field872 = 0;

    @ObfuscatedName("client.bv")
    public static long field1091 = 1L;

    @ObfuscatedName("client.bm")
    public static int field990 = -1;

    @ObfuscatedName("client.bn")
    public static int field917 = -1;

    @ObfuscatedName("client.bu")
    public static int field876 = -1;

    @ObfuscatedName("client.bd")
    public static boolean field877 = true;

    @ObfuscatedName("client.bo")
    public static boolean field878 = false;

    @ObfuscatedName("client.bg")
    public static int field911 = 0;

    @ObfuscatedName("client.bj")
    public static int field880 = 0;

    @ObfuscatedName("client.bw")
    public static int field881 = 0;

    @ObfuscatedName("client.ce")
    public static int field882 = 0;

    @ObfuscatedName("client.cg")
    public static int field1073 = 0;

    @ObfuscatedName("client.cw")
    public static int field884 = 0;

    @ObfuscatedName("client.ch")
    public static int field1028 = 0;

    @ObfuscatedName("client.cc")
    public static int field886 = 0;

    @ObfuscatedName("client.cz")
    public static int field887 = 0;

    @ObfuscatedName("client.cj")
    public static class91 field1097 = class91.field1329;

    @ObfuscatedName("client.cv")
    public static class91 field951 = class91.field1329;

    @ObfuscatedName("client.cq")
    public static int field890 = 0;

    @ObfuscatedName("client.ca")
    public static int field998 = 0;

    @ObfuscatedName("client.ck")
    public static int field1083 = 0;

    @ObfuscatedName("client.dg")
    public static int field894 = 0;

    @ObfuscatedName("client.dr")
    public static int field895 = 0;

    @ObfuscatedName("client.dp")
    public static int field896 = 0;

    @ObfuscatedName("client.dw")
    public static int field897 = 0;

    @ObfuscatedName("client.du")
    public static int field898 = 0;

    @ObfuscatedName("client.dd")
    public static class151 field899 = class151.field2104;

    @ObfuscatedName("client.dz")
    public static byte[] field984 = null;

    @ObfuscatedName("client.da")
    public static class86[] field874 = new class86[32768];

    @ObfuscatedName("client.dl")
    public static int field902 = 0;

    @ObfuscatedName("client.df")
    public static int[] field893 = new int[32768];

    @ObfuscatedName("client.ds")
    public static int field1000 = 0;

    @ObfuscatedName("client.en")
    public static int[] field912 = new int[250];

    @ObfuscatedName("client.ek")
    public static final class101 field906 = new class101();

    @ObfuscatedName("client.ej")
    public static int field907 = 0;

    @ObfuscatedName("client.ei")
    public static boolean field908 = false;

    @ObfuscatedName("client.ep")
    public static class284 field977 = new class284();

    @ObfuscatedName("client.et")
    public static HashMap field1042 = new HashMap();

    @ObfuscatedName("client.em")
    public static int field913 = 0;

    @ObfuscatedName("client.ee")
    public static int field914 = 1;

    @ObfuscatedName("client.ew")
    public static int field915 = 0;

    @ObfuscatedName("client.eg")
    public static int field1089 = 1;

    @ObfuscatedName("client.ex")
    public static int field1024 = 0;

    @ObfuscatedName("client.fy")
    public static boolean field920 = false;

    @ObfuscatedName("client.fr")
    public static int[][][] field1012 = new int[4][13][13];

    @ObfuscatedName("client.fp")
    public static final int[] field1077 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fi")
    public static int field923 = 0;

    @ObfuscatedName("client.ff")
    public static int field1062 = 2301979;

    @ObfuscatedName("client.fs")
    public static int field925 = 5063219;

    @ObfuscatedName("client.fm")
    public static int field926 = 3353893;

    @ObfuscatedName("client.gz")
    public static int field927 = 7759444;

    @ObfuscatedName("client.gj")
    public static boolean field928 = false;

    @ObfuscatedName("client.ge")
    public static int field929 = 0;

    @ObfuscatedName("client.gm")
    public static int field931 = 128;

    @ObfuscatedName("client.gr")
    public static int field922 = 0;

    @ObfuscatedName("client.gq")
    public static int field904 = 0;

    @ObfuscatedName("client.gu")
    public static int field934 = 0;

    @ObfuscatedName("client.gv")
    public static int field935 = 0;

    @ObfuscatedName("client.gy")
    public static int field936 = 0;

    @ObfuscatedName("client.gp")
    public static int field903 = 50;

    @ObfuscatedName("client.gt")
    public static int field938 = 0;

    @ObfuscatedName("client.gg")
    public static boolean field939 = false;

    @ObfuscatedName("client.gh")
    public static int field1056 = 0;

    @ObfuscatedName("client.gn")
    public static int field941 = 0;

    @ObfuscatedName("client.go")
    public static int field1055 = 50;

    @ObfuscatedName("client.gw")
    public static int[] field943 = new int[field1055];

    @ObfuscatedName("client.gc")
    public static int[] field1121 = new int[field1055];

    @ObfuscatedName("client.gb")
    public static int[] field945 = new int[field1055];

    @ObfuscatedName("client.gk")
    public static int[] field905 = new int[field1055];

    @ObfuscatedName("client.hd")
    public static int[] field901 = new int[field1055];

    @ObfuscatedName("client.hw")
    public static int[] field948 = new int[field1055];

    @ObfuscatedName("client.hs")
    public static int[] field932 = new int[field1055];

    @ObfuscatedName("client.hj")
    public static String[] field950 = new String[field1055];

    @ObfuscatedName("client.hp")
    public static int[][] field921 = new int[104][104];

    @ObfuscatedName("client.hv")
    public static int field952 = 0;

    @ObfuscatedName("client.ho")
    public static int field992 = -1;

    @ObfuscatedName("client.hr")
    public static int field954 = -1;

    @ObfuscatedName("client.hg")
    public static int field955 = 0;

    @ObfuscatedName("client.hy")
    public static int field956 = 0;

    @ObfuscatedName("client.hi")
    public static int field969 = 0;

    @ObfuscatedName("client.hk")
    public static int field958 = 0;

    @ObfuscatedName("client.hq")
    public static int field959 = 0;

    @ObfuscatedName("client.ht")
    public static int field960 = 0;

    @ObfuscatedName("client.hm")
    public static int field891 = 0;

    @ObfuscatedName("client.hf")
    public static int field924 = 0;

    @ObfuscatedName("client.hc")
    public static int field963 = 0;

    @ObfuscatedName("client.hb")
    public static int field1112 = 0;

    @ObfuscatedName("client.hz")
    public static boolean field965 = false;

    @ObfuscatedName("client.he")
    public static int field966 = 0;

    @ObfuscatedName("client.hl")
    public static int field967 = 0;

    @ObfuscatedName("client.hn")
    public static class74[] field1098 = new class74[2048];

    @ObfuscatedName("client.iw")
    public static int field989 = -1;

    @ObfuscatedName("client.ik")
    public static int field970 = 0;

    @ObfuscatedName("client.iy")
    public static int field1037 = 0;

    @ObfuscatedName("client.io")
    public static int[] field972 = new int[1000];

    @ObfuscatedName("client.il")
    public static final int[] field973 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ij")
    public static String[] field961 = new String[8];

    @ObfuscatedName("client.iu")
    public static boolean[] field975 = new boolean[8];

    @ObfuscatedName("client.is")
    public static int[] field866 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.it")
    public static String field1002 = null;

    @ObfuscatedName("client.ih")
    public static int field1071 = -1;

    @ObfuscatedName("client.ip")
    public static class201[][][] field978 = new class201[4][104][104];

    @ObfuscatedName("client.ib")
    public static class201 field885 = new class201();

    @ObfuscatedName("client.ia")
    public static class201 field947 = new class201();

    @ObfuscatedName("client.im")
    public static class201 field981 = new class201();

    @ObfuscatedName("client.ie")
    public static int[] field982 = new int[25];

    @ObfuscatedName("client.if")
    public static int[] field983 = new int[25];

    @ObfuscatedName("client.iv")
    public static int[] field1094 = new int[25];

    @ObfuscatedName("client.ir")
    public static int field985 = 0;

    @ObfuscatedName("client.ig")
    public static boolean field964 = false;

    @ObfuscatedName("client.jj")
    public static int field1044 = 0;

    @ObfuscatedName("client.jp")
    public static int[] field988 = new int[500];

    @ObfuscatedName("client.jc")
    public static int[] field937 = new int[500];

    @ObfuscatedName("client.jx")
    public static int[] field919 = new int[500];

    @ObfuscatedName("client.jh")
    public static int[] field953 = new int[500];

    @ObfuscatedName("client.ju")
    public static String[] field1078 = new String[500];

    @ObfuscatedName("client.jz")
    public static String[] field993 = new String[500];

    @ObfuscatedName("client.jn")
    public static boolean[] field944 = new boolean[500];

    @ObfuscatedName("client.js")
    public static boolean field995 = false;

    @ObfuscatedName("client.je")
    public static boolean field996 = false;

    @ObfuscatedName("client.jy")
    public static int field997 = -1;

    @ObfuscatedName("client.jv")
    public static int field1125 = -1;

    @ObfuscatedName("client.ji")
    public static int field999 = 0;

    @ObfuscatedName("client.jf")
    public static int field976 = 50;

    @ObfuscatedName("client.jo")
    public static int field1001 = 0;

    @ObfuscatedName("client.jg")
    public static boolean field1003 = false;

    @ObfuscatedName("client.jq")
    public static int field1004 = -1;

    @ObfuscatedName("client.kd")
    public static int field1005 = -1;

    @ObfuscatedName("client.kl")
    public static String field1046 = null;

    @ObfuscatedName("client.kv")
    public static String field949 = null;

    @ObfuscatedName("client.ko")
    public static int field1008 = -1;

    @ObfuscatedName("client.kn")
    public static class198 field1009 = new class198(8);

    @ObfuscatedName("client.ka")
    public static int field1010 = 0;

    @ObfuscatedName("client.ks")
    public static int field1011 = 0;

    @ObfuscatedName("client.kb")
    public static class224 field879 = null;

    @ObfuscatedName("client.kg")
    public static int field1013 = 0;

    @ObfuscatedName("client.ku")
    public static int field1014 = 0;

    @ObfuscatedName("client.kw")
    public static int field1015 = 0;

    @ObfuscatedName("client.kz")
    public static int field1016 = -1;

    @ObfuscatedName("client.kk")
    public static boolean field980 = false;

    @ObfuscatedName("client.kp")
    public static boolean field1018 = false;

    @ObfuscatedName("client.kj")
    public static boolean field1019 = false;

    @ObfuscatedName("client.kq")
    public static class224 field1020 = null;

    @ObfuscatedName("client.kh")
    public static class224 field1021 = null;

    @ObfuscatedName("client.km")
    public static class224 field1022 = null;

    @ObfuscatedName("client.kf")
    public static int field1023 = 0;

    @ObfuscatedName("client.ki")
    public static int field1122 = 0;

    @ObfuscatedName("client.ke")
    public static class224 field1025 = null;

    @ObfuscatedName("client.kx")
    public static boolean field1026 = false;

    @ObfuscatedName("client.kt")
    public static int field1027 = -1;

    @ObfuscatedName("client.ky")
    public static int field1060 = -1;

    @ObfuscatedName("client.kc")
    public static boolean field1029 = false;

    @ObfuscatedName("client.ll")
    public static int field1030 = -1;

    @ObfuscatedName("client.lb")
    public static int field1031 = -1;

    @ObfuscatedName("client.lu")
    public static boolean field994 = false;

    @ObfuscatedName("client.lq")
    public static int field1033 = 1;

    @ObfuscatedName("client.lm")
    public static int[] field1034 = new int[32];

    @ObfuscatedName("client.lf")
    public static int field1035 = 0;

    @ObfuscatedName("client.lw")
    public static int[] field1036 = new int[32];

    @ObfuscatedName("client.lc")
    public static int field974 = 0;

    @ObfuscatedName("client.ln")
    public static int[] field1038 = new int[32];

    @ObfuscatedName("client.lz")
    public static int field1039 = 0;

    @ObfuscatedName("client.lg")
    public static int field1040 = 0;

    @ObfuscatedName("client.lv")
    public static int field1041 = 0;

    @ObfuscatedName("client.le")
    public static int field1047 = 0;

    @ObfuscatedName("client.ly")
    public static int field1043 = 0;

    @ObfuscatedName("client.lx")
    public static int field968 = 0;

    @ObfuscatedName("client.la")
    public static int field865 = 0;

    @ObfuscatedName("client.lp")
    public static int field986 = 0;

    @ObfuscatedName("client.lo")
    public static class201 field863 = new class201();

    @ObfuscatedName("client.md")
    public static class201 field1048 = new class201();

    @ObfuscatedName("client.mi")
    public static class201 field1049 = new class201();

    @ObfuscatedName("client.ms")
    public static class198 field1050 = new class198(512);

    @ObfuscatedName("client.mk")
    public static int field1051 = 0;

    @ObfuscatedName("client.mu")
    public static int field867 = -2;

    @ObfuscatedName("client.mc")
    public static boolean[] field1053 = new boolean[100];

    @ObfuscatedName("client.mj")
    public static boolean[] field1054 = new boolean[100];

    @ObfuscatedName("client.ml")
    public static boolean[] field873 = new boolean[100];

    @ObfuscatedName("client.mn")
    public static int[] field1007 = new int[100];

    @ObfuscatedName("client.mf")
    public static int[] field1057 = new int[100];

    @ObfuscatedName("client.mx")
    public static int[] field1045 = new int[100];

    @ObfuscatedName("client.mr")
    public static int[] field1059 = new int[100];

    @ObfuscatedName("client.mm")
    public static int field888 = 0;

    @ObfuscatedName("client.mq")
    public static long field1017 = 0L;

    @ObfuscatedName("client.mw")
    public static boolean field942 = true;

    @ObfuscatedName("client.mt")
    public static int[] field1063 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.mv")
    public static int field1064 = 0;

    @ObfuscatedName("client.ma")
    public static int field1065 = 0;

    @ObfuscatedName("client.nf")
    public static String field1066 = "";

    @ObfuscatedName("client.nx")
    public static long[] field1067 = new long[100];

    @ObfuscatedName("client.nc")
    public static int field1068 = 0;

    @ObfuscatedName("client.nq")
    public static int field1069 = 0;

    @ObfuscatedName("client.nj")
    public static int[] field1070 = new int[128];

    @ObfuscatedName("client.np")
    public static int[] field971 = new int[128];

    @ObfuscatedName("client.nn")
    public static long field1072 = -1L;

    @ObfuscatedName("client.nl")
    public static String field962 = null;

    @ObfuscatedName("client.ng")
    public static String field1074 = null;

    @ObfuscatedName("client.nv")
    public static int field1082 = -1;

    @ObfuscatedName("client.nh")
    public static int field1076 = 0;

    @ObfuscatedName("client.nb")
    public static int[] field1061 = new int[1000];

    @ObfuscatedName("client.nt")
    public static int[] field892 = new int[1000];

    @ObfuscatedName("client.nz")
    public static class295[] field1079 = new class295[1000];

    @ObfuscatedName("client.nu")
    public static int field979 = 0;

    @ObfuscatedName("client.no")
    public static int field1081 = 0;

    @ObfuscatedName("client.oa")
    public static int field1109 = 0;

    @ObfuscatedName("client.oj")
    public static int field946 = 255;

    @ObfuscatedName("client.oi")
    public static int field1084 = -1;

    @ObfuscatedName("client.oo")
    public static boolean field1085 = false;

    @ObfuscatedName("client.oh")
    public static int field1086 = 127;

    @ObfuscatedName("client.od")
    public static int field1052 = 127;

    @ObfuscatedName("client.ov")
    public static int field1032 = 0;

    @ObfuscatedName("client.of")
    public static int[] field957 = new int[50];

    @ObfuscatedName("client.on")
    public static int[] field987 = new int[50];

    @ObfuscatedName("client.op")
    public static int[] field1087 = new int[50];

    @ObfuscatedName("client.ou")
    public static int[] field1093 = new int[50];

    @ObfuscatedName("client.ok")
    public static class105[] field883 = new class105[50];

    @ObfuscatedName("client.og")
    public static boolean field1095 = false;

    @ObfuscatedName("client.pz")
    public static boolean[] field1096 = new boolean[5];

    @ObfuscatedName("client.pk")
    public static int[] field869 = new int[5];

    @ObfuscatedName("client.pb")
    public static int[] field1075 = new int[5];

    @ObfuscatedName("client.pt")
    public static int[] field1099 = new int[5];

    @ObfuscatedName("client.pj")
    public static int[] field991 = new int[5];

    @ObfuscatedName("client.pl")
    public static short field1101 = 256;

    @ObfuscatedName("client.pm")
    public static short field1102 = 205;

    @ObfuscatedName("client.px")
    public static short field1103 = 256;

    @ObfuscatedName("client.po")
    public static short field1104 = 320;

    @ObfuscatedName("client.pg")
    public static short field1105 = 1;

    @ObfuscatedName("client.ph")
    public static short field1106 = 32767;

    @ObfuscatedName("client.pw")
    public static short field1107 = 1;

    @ObfuscatedName("client.pp")
    public static short field1108 = 32767;

    @ObfuscatedName("client.pv")
    public static int field1100 = 0;

    @ObfuscatedName("client.pn")
    public static int field1110 = 0;

    @ObfuscatedName("client.pf")
    public static int field1111 = 0;

    @ObfuscatedName("client.py")
    public static int field909 = 0;

    @ObfuscatedName("client.pc")
    public static int field1113 = 0;

    @ObfuscatedName("client.pu")
    public static int field1114 = 0;

    @ObfuscatedName("client.pr")
    public static int field1115 = 0;

    @ObfuscatedName("client.qr")
    public static class66[] field1116 = new class66[400];

    @ObfuscatedName("client.qh")
    public static class203 field1117 = new class203();

    @ObfuscatedName("client.qu")
    public static int field1118 = 0;

    @ObfuscatedName("client.qk")
    public static class70[] field1119 = new class70[400];

    @ObfuscatedName("client.qv")
    public static class221 field1120 = new class221();

    @ObfuscatedName("client.ql")
    public static int field1090 = -1;

    @ObfuscatedName("client.qy")
    public static int field875 = -1;

    @ObfuscatedName("client.qp")
    public static class17[] field1123 = new class17[8];

    @ObfuscatedName("client.qf")
    public static class75 field1124 = new class75();

    @ObfuscatedName("client.qn")
    public static final class73 field889 = new class73();

    @ObfuscatedName("client.qj")
    public static int[] field1126 = new int[50];

    @ObfuscatedName("client.qo")
    public static int[] field1127 = new int[50];

    @ObfuscatedName("client.ax(I)V")
    public final void method742() {
    }

    public final void init() {
        if (!this.method833()) {
            return;
        }
        class283[] var1 = new class283[] { class283.field3769, class283.field3764, class283.field3760, class283.field3763, class283.field3767, class283.field3755, class283.field3762, class283.field3761, class283.field3757, class283.field3759, class283.field3754, class283.field3765, class283.field3758, class283.field3768, class283.field3766 };
        class283[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class283 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3756);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3756)) {
                    case 2:
                        if (var5.equalsIgnoreCase(class88.field1309)) {
                            field1058 = true;
                        } else {
                            field1058 = false;
                        }
                        break;
                    case 3:
                        field1092 = Integer.parseInt(var5);
                        break;
                    case 4:
                        Statics.field2496 = class239.method1612(Integer.parseInt(var5));
                        break;
                    case 5:
                        Statics.field340 = Integer.parseInt(var5);
                        break;
                    case 6:
                        if (var5.equalsIgnoreCase(class88.field1309)) {
                        }
                    case 7:
                    default:
                        break;
                    case 8:
                        class240[] var6 = new class240[] { class240.field3255, class240.field3253, class240.field3258, class240.field3256, class240.field3254, class240.field3251 };
                        Statics.field3263 = (class240) class176.method2719(var6, Integer.parseInt(var5));
                        if (Statics.field3263 == class240.field3258) {
                            Statics.field2530 = class299.field3919;
                        } else {
                            Statics.field2530 = class299.field3909;
                        }
                        break;
                    case 9:
                        Statics.field14 = Integer.parseInt(var5);
                        break;
                    case 10:
                        field900 = Integer.parseInt(var5);
                        break;
                    case 11:
                        field940 = Integer.parseInt(var5);
                        break;
                    case 12:
                        field871 = Integer.parseInt(var5);
                        break;
                    case 13:
                        Statics.field1140 = var5;
                        break;
                    case 14:
                        Statics.field1573 = var5;
                }
            }
        }
        class139.field1984 = false;
        field868 = false;
        Statics.field1413 = this.getCodeBase().getHost();
        String var7 = Statics.field2496.field3244;
        byte var8 = 0;
        try {
            class157.method2674("oldschool", var7, var8, 17);
        } catch (Exception var10) {
            class154.method607((String) null, var10);
        }
        Statics.field3803 = this;
        this.method720(765, 503, 158);
    }

    @ObfuscatedName("client.ac(B)V")
    public final void method844() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field1955 = null;
            Statics.field2505 = null;
            Statics.field1324 = (byte[][][]) null;
        } else {
            Statics.field1955 = var1;
            Statics.field2505 = new int[var1.length];
            Statics.field1324 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field1955.length; var3++) {
                Statics.field1324[var3] = new byte[var2[var3]][];
            }
        }
        Statics.field791 = field900 == 0 ? 43594 : field940 + 40000;
        Statics.field258 = field900 == 0 ? 443 : field940 + 50000;
        Statics.field799 = Statics.field791;
        Statics.field1344 = class222.field2699;
        Statics.field2693 = class222.field2697;
        Statics.field1911 = class222.field2700;
        Statics.field27 = class222.field2698;
        Statics.field3332 = new class149();
        this.method714();
        this.method796();
        Statics.field3718 = this.method737();
        Statics.field224 = new class162(255, class157.field2149, class157.field2154, 500000);
        Statics.field801 = class81.method16();
        this.method764();
        class57.method36(this, Statics.field538);
        if (field900 != 0) {
            field878 = true;
        }
        method1418(Statics.field801.field1232);
    }

    @ObfuscatedName("client.as(B)V")
    public final void method773() {
        field872++;
        this.method1245();
        while (true) {
            class201 var1 = class244.field3292;
            class241 var2;
            synchronized (class244.field3292) {
                var2 = (class241) class244.field3290.method3403();
            }
            if (var2 == null) {
                class211.method4435();
                method1557();
                class51.method525();
                class60 var4 = class60.field676;
                synchronized (class60.field676) {
                    class60.field690 = class60.field678;
                    class60.field682 = class60.field683;
                    class60.field677 = class60.field681;
                    class60.field688 = class60.field684;
                    class60.field675 = class60.field685;
                    class60.field689 = class60.field692;
                    class60.field691 = class60.field687;
                    class60.field684 = 0;
                }
                if (Statics.field3718 != null) {
                    int var6 = Statics.field3718.method610();
                    field986 = var6;
                }
                if (field870 == 0) {
                    method23();
                    class59.method651();
                } else if (field870 == 5) {
                    class92.method1551(this);
                    method23();
                    class59.method651();
                } else if (field870 == 10 || field870 == 11) {
                    class92.method1551(this);
                } else if (field870 == 20) {
                    class92.method1551(this);
                    this.method1177();
                } else if (field870 == 25) {
                    method218(false);
                    field913 = 0;
                    boolean var7 = true;
                    for (int var8 = 0; var8 < Statics.field1579.length; var8++) {
                        if (Statics.field1364[var8] != -1 && Statics.field1579[var8] == null) {
                            Statics.field1579[var8] = Statics.field617.method3887(Statics.field1364[var8], 0);
                            if (Statics.field1579[var8] == null) {
                                var7 = false;
                                field913++;
                            }
                        }
                        if (Statics.field524[var8] != -1 && Statics.field1321[var8] == null) {
                            Statics.field1321[var8] = Statics.field617.method3818(Statics.field524[var8], 0, Statics.field615[var8]);
                            if (Statics.field1321[var8] == null) {
                                var7 = false;
                                field913++;
                            }
                        }
                    }
                    if (var7) {
                        field915 = 0;
                        boolean var9 = true;
                        for (int var10 = 0; var10 < Statics.field1579.length; var10++) {
                            byte[] var11 = Statics.field1321[var10];
                            if (var11 != null) {
                                int var12 = (Statics.field1304[var10] >> 8) * 64 - Statics.field269;
                                int var13 = (Statics.field1304[var10] & 0xFF) * 64 - Statics.field854;
                                if (field920) {
                                    var12 = 10;
                                    var13 = 10;
                                }
                                var9 &= class62.method3658(var11, var12, var13);
                            }
                        }
                        if (var9) {
                            if (field1024 != 0) {
                                method2802(class233.field2927 + class88.field1312 + class88.field1307 + 100 + "%" + class88.field1305, true);
                            }
                            method1557();
                            method601();
                            method1557();
                            Statics.field918.method2489();
                            method1557();
                            System.gc();
                            for (int var14 = 0; var14 < 4; var14++) {
                                field916[var14].method2804();
                            }
                            for (int var15 = 0; var15 < 4; var15++) {
                                for (int var16 = 0; var16 < 104; var16++) {
                                    for (int var17 = 0; var17 < 104; var17++) {
                                        class62.field713[var15][var16][var17] = 0;
                                    }
                                }
                            }
                            method1557();
                            class62.field706 = 99;
                            Statics.field3205 = new byte[4][104][104];
                            Statics.field475 = new byte[4][104][104];
                            Statics.field703 = new byte[4][104][104];
                            Statics.field297 = new byte[4][104][104];
                            Statics.field369 = new int[4][105][105];
                            Statics.field2441 = new byte[4][105][105];
                            Statics.field704 = new int[105][105];
                            Statics.field707 = new int[104];
                            Statics.field708 = new int[104];
                            Statics.field720 = new int[104];
                            Statics.field556 = new int[104];
                            Statics.field1681 = new int[104];
                            int var18 = Statics.field1579.length;
                            class82.method3784();
                            method218(true);
                            if (!field920) {
                                int var19 = 0;
                                label556: while (true) {
                                    if (var19 >= var18) {
                                        for (int var33 = 0; var33 < var18; var33++) {
                                            int var34 = (Statics.field1304[var33] >> 8) * 64 - Statics.field269;
                                            int var35 = (Statics.field1304[var33] & 0xFF) * 64 - Statics.field854;
                                            byte[] var36 = Statics.field1579[var33];
                                            if (var36 == null && Statics.field412 < 800) {
                                                method1557();
                                                class62.method1618(var34, var35, 64, 64);
                                            }
                                        }
                                        method218(true);
                                        int var37 = 0;
                                        while (true) {
                                            if (var37 >= var18) {
                                                break label556;
                                            }
                                            byte[] var38 = Statics.field1321[var37];
                                            if (var38 != null) {
                                                int var39 = (Statics.field1304[var37] >> 8) * 64 - Statics.field269;
                                                int var40 = (Statics.field1304[var37] & 0xFF) * 64 - Statics.field854;
                                                method1557();
                                                class139 var41 = Statics.field918;
                                                class163[] var42 = field916;
                                                class181 var43 = new class181(var38);
                                                int var44 = -1;
                                                while (true) {
                                                    int var45 = var43.method3086();
                                                    if (var45 == 0) {
                                                        break;
                                                    }
                                                    var44 += var45;
                                                    int var46 = 0;
                                                    while (true) {
                                                        int var47 = var43.method3086();
                                                        if (var47 == 0) {
                                                            break;
                                                        }
                                                        var46 += var47 - 1;
                                                        int var48 = var46 & 0x3F;
                                                        int var49 = var46 >> 6 & 0x3F;
                                                        int var50 = var46 >> 12;
                                                        int var51 = var43.method2945();
                                                        int var52 = var51 >> 2;
                                                        int var53 = var51 & 0x3;
                                                        int var54 = var39 + var49;
                                                        int var55 = var40 + var48;
                                                        if (var54 > 0 && var55 > 0 && var54 < 103 && var55 < 103) {
                                                            int var56 = var50;
                                                            if ((class62.field713[1][var54][var55] & 0x2) == 2) {
                                                                var56 = var50 - 1;
                                                            }
                                                            class163 var57 = null;
                                                            if (var56 >= 0) {
                                                                var57 = var42[var56];
                                                            }
                                                            class62.method153(var50, var54, var55, var44, var53, var52, var41, var57);
                                                        }
                                                    }
                                                }
                                            }
                                            var37++;
                                        }
                                    }
                                    int var20 = (Statics.field1304[var19] >> 8) * 64 - Statics.field269;
                                    int var21 = (Statics.field1304[var19] & 0xFF) * 64 - Statics.field854;
                                    byte[] var22 = Statics.field1579[var19];
                                    if (var22 != null) {
                                        method1557();
                                        int var23 = Statics.field470 * 8 - 48;
                                        int var24 = Statics.field412 * 8 - 48;
                                        class163[] var25 = field916;
                                        int var26 = 0;
                                        label553: while (true) {
                                            if (var26 >= 4) {
                                                class181 var29 = new class181(var22);
                                                int var30 = 0;
                                                while (true) {
                                                    if (var30 >= 4) {
                                                        break label553;
                                                    }
                                                    for (int var31 = 0; var31 < 64; var31++) {
                                                        for (int var32 = 0; var32 < 64; var32++) {
                                                            class62.method596(var29, var30, var20 + var31, var21 + var32, var23, var24, 0);
                                                        }
                                                    }
                                                    var30++;
                                                }
                                            }
                                            for (int var27 = 0; var27 < 64; var27++) {
                                                for (int var28 = 0; var28 < 64; var28++) {
                                                    if (var20 + var27 > 0 && var20 + var27 < 103 && var21 + var28 > 0 && var21 + var28 < 103) {
                                                        var25[var26].field2201[var20 + var27][var21 + var28] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var26++;
                                        }
                                    }
                                    var19++;
                                }
                            }
                            if (field920) {
                                int var58 = 0;
                                label489: while (true) {
                                    if (var58 >= 4) {
                                        for (int var97 = 0; var97 < 13; var97++) {
                                            for (int var98 = 0; var98 < 13; var98++) {
                                                int var99 = field1012[0][var97][var98];
                                                if (var99 == -1) {
                                                    class62.method1618(var97 * 8, var98 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method218(true);
                                        int var100 = 0;
                                        while (true) {
                                            if (var100 >= 4) {
                                                break label489;
                                            }
                                            method1557();
                                            for (int var101 = 0; var101 < 13; var101++) {
                                                for (int var102 = 0; var102 < 13; var102++) {
                                                    int var103 = field1012[var100][var101][var102];
                                                    if (var103 != -1) {
                                                        int var104 = var103 >> 24 & 0x3;
                                                        int var105 = var103 >> 1 & 0x3;
                                                        int var106 = var103 >> 14 & 0x3FF;
                                                        int var107 = var103 >> 3 & 0x7FF;
                                                        int var108 = (var106 / 8 << 8) + var107 / 8;
                                                        for (int var109 = 0; var109 < Statics.field1304.length; var109++) {
                                                            if (Statics.field1304[var109] == var108 && Statics.field1321[var109] != null) {
                                                                class62.method7(Statics.field1321[var109], var100, var101 * 8, var102 * 8, var104, (var106 & 0x7) * 8, (var107 & 0x7) * 8, var105, Statics.field918, field916);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var100++;
                                        }
                                    }
                                    method1557();
                                    for (int var59 = 0; var59 < 13; var59++) {
                                        for (int var60 = 0; var60 < 13; var60++) {
                                            boolean var61 = false;
                                            int var62 = field1012[var58][var59][var60];
                                            if (var62 != -1) {
                                                int var63 = var62 >> 24 & 0x3;
                                                int var64 = var62 >> 1 & 0x3;
                                                int var65 = var62 >> 14 & 0x3FF;
                                                int var66 = var62 >> 3 & 0x7FF;
                                                int var67 = (var65 / 8 << 8) + var66 / 8;
                                                for (int var68 = 0; var68 < Statics.field1304.length; var68++) {
                                                    if (Statics.field1304[var68] == var67 && Statics.field1579[var68] != null) {
                                                        byte[] var69 = Statics.field1579[var68];
                                                        int var70 = var59 * 8;
                                                        int var71 = var60 * 8;
                                                        int var72 = (var65 & 0x7) * 8;
                                                        int var73 = (var66 & 0x7) * 8;
                                                        class163[] var74 = field916;
                                                        for (int var75 = 0; var75 < 8; var75++) {
                                                            for (int var76 = 0; var76 < 8; var76++) {
                                                                if (var70 + var75 > 0 && var70 + var75 < 103 && var71 + var76 > 0 && var71 + var76 < 103) {
                                                                    var74[var58].field2201[var70 + var75][var71 + var76] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class181 var77 = new class181(var69);
                                                        for (int var78 = 0; var78 < 4; var78++) {
                                                            for (int var79 = 0; var79 < 64; var79++) {
                                                                for (int var80 = 0; var80 < 64; var80++) {
                                                                    if (var63 == var78 && var79 >= var72 && var79 < var72 + 8 && var80 >= var73 && var80 < var73 + 8) {
                                                                        int var83 = var70 + Statics.method978(var79 & 0x7, var80 & 0x7, var64);
                                                                        int var85 = var79 & 0x7;
                                                                        int var86 = var80 & 0x7;
                                                                        int var88 = var64 & 0x3;
                                                                        int var89;
                                                                        if (var88 == 0) {
                                                                            var89 = var86;
                                                                        } else if (var88 == 1) {
                                                                            var89 = 7 - var85;
                                                                        } else if (var88 == 2) {
                                                                            var89 = 7 - var86;
                                                                        } else {
                                                                            var89 = var85;
                                                                        }
                                                                        class62.method596(var77, var58, var83, var71 + var89, 0, 0, var64);
                                                                    } else {
                                                                        class62.method596(var77, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var61 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var61) {
                                                int var90 = var58;
                                                int var91 = var59 * 8;
                                                int var92 = var60 * 8;
                                                for (int var93 = 0; var93 < 8; var93++) {
                                                    for (int var94 = 0; var94 < 8; var94++) {
                                                        class62.field709[var90][var91 + var93][var92 + var94] = 0;
                                                    }
                                                }
                                                if (var91 > 0) {
                                                    for (int var95 = 1; var95 < 8; var95++) {
                                                        class62.field709[var90][var91][var92 + var95] = class62.field709[var90][var91 - 1][var92 + var95];
                                                    }
                                                }
                                                if (var92 > 0) {
                                                    for (int var96 = 1; var96 < 8; var96++) {
                                                        class62.field709[var90][var91 + var96][var92] = class62.field709[var90][var91 + var96][var92 - 1];
                                                    }
                                                }
                                                if (var91 > 0 && class62.field709[var90][var91 - 1][var92] != 0) {
                                                    class62.field709[var90][var91][var92] = class62.field709[var90][var91 - 1][var92];
                                                } else if (var92 > 0 && class62.field709[var90][var91][var92 - 1] != 0) {
                                                    class62.field709[var90][var91][var92] = class62.field709[var90][var91][var92 - 1];
                                                } else if (var91 > 0 && var92 > 0 && class62.field709[var90][var91 - 1][var92 - 1] != 0) {
                                                    class62.field709[var90][var91][var92] = class62.field709[var90][var91 - 1][var92 - 1];
                                                }
                                            }
                                        }
                                    }
                                    var58++;
                                }
                            }
                            method218(true);
                            method601();
                            method1557();
                            class62.method155(Statics.field918, field916);
                            method218(true);
                            int var110 = class62.field706;
                            if (var110 > Statics.field376) {
                                var110 = Statics.field376;
                            }
                            if (var110 < Statics.field376 - 1) {
                                int var111 = Statics.field376 - 1;
                            }
                            if (field868) {
                                Statics.field918.method2490(class62.field706);
                            } else {
                                Statics.field918.method2490(0);
                            }
                            for (int var112 = 0; var112 < 104; var112++) {
                                for (int var113 = 0; var113 < 104; var113++) {
                                    method960(var112, var113);
                                }
                            }
                            method1557();
                            method512();
                            class263.field3490.method3333();
                            if (Statics.field3803.method741()) {
                                class171 var114 = class171.method124(class168.field2368, field906.field1461);
                                var114.field2423.method2977(1057001181);
                                field906.method1715(var114);
                            }
                            if (!field920) {
                                int var115 = (Statics.field470 - 6) / 8;
                                int var116 = (Statics.field470 + 6) / 8;
                                int var117 = (Statics.field412 - 6) / 8;
                                int var118 = (Statics.field412 + 6) / 8;
                                for (int var119 = var115 - 1; var119 <= var116 + 1; var119++) {
                                    for (int var120 = var117 - 1; var120 <= var118 + 1; var120++) {
                                        if (var119 < var115 || var119 > var116 || var120 < var117 || var120 > var118) {
                                            Statics.field617.method3829("m" + var119 + "_" + var120);
                                            Statics.field617.method3829("l" + var119 + "_" + var120);
                                        }
                                    }
                                }
                            }
                            method2(30);
                            method1557();
                            Statics.field3205 = (byte[][][]) null;
                            Statics.field475 = (byte[][][]) null;
                            Statics.field703 = (byte[][][]) null;
                            Statics.field297 = (byte[][][]) null;
                            Statics.field369 = (int[][][]) null;
                            Statics.field2441 = (byte[][][]) null;
                            Statics.field704 = (int[][]) null;
                            Statics.field707 = null;
                            Statics.field708 = null;
                            Statics.field720 = null;
                            Statics.field556 = null;
                            Statics.field1681 = null;
                            class171 var121 = class171.method124(class168.field2358, field906.field1461);
                            field906.method1715(var121);
                            class59.method651();
                        } else {
                            field1024 = 2;
                        }
                    } else {
                        field1024 = 1;
                    }
                }
                if (field870 == 30) {
                    this.method1028();
                } else if (field870 == 40 || field870 == 45) {
                    this.method1177();
                }
                return;
            }
            var2.field3262.method3921(var2.field3264, (int) var2.field2557, var2.field3259, false);
        }
    }

    @ObfuscatedName("client.ah(ZI)V")
    public final void method734(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class211.field2586 == 2) {
                    if (Statics.field2589 == null) {
                        Statics.field2589 = class217.method3675(Statics.field803, Statics.field2587, Statics.field415);
                        if (Statics.field2589 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field13 == null) {
                        Statics.field13 = new class112(Statics.field846, Statics.field2590);
                    }
                    if (Statics.field2588.method3491(Statics.field2589, Statics.field2591, Statics.field13, 22050)) {
                        Statics.field2588.method3492();
                        Statics.field2588.method3582(Statics.field2910);
                        Statics.field2588.method3510(Statics.field2589, Statics.field2906);
                        class211.field2586 = 0;
                        Statics.field2589 = null;
                        Statics.field13 = null;
                        Statics.field803 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field2588.method3514();
                class211.field2586 = 0;
                Statics.field2589 = null;
                Statics.field13 = null;
                Statics.field803 = null;
            }
            var2 = false;
        }
        if (var2 && field1085 && Statics.field15 != null) {
            Statics.field15.method1879();
        }
        if ((field870 == 10 || field870 == 20 || field870 == 30) && field1017 != 0L && class183.method1711() > field1017) {
            method1418(method1384());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field1053[var5] = true;
            }
        }
        if (field870 == 0) {
            this.method755(class92.field1337, class92.field1345, arg0);
        } else if (field870 == 5) {
            class92.method115(Statics.field910, Statics.field364, Statics.field1818, arg0);
        } else if (field870 == 10 || field870 == 11) {
            class92.method115(Statics.field910, Statics.field364, Statics.field1818, arg0);
        } else if (field870 == 20) {
            class92.method115(Statics.field910, Statics.field364, Statics.field1818, arg0);
        } else if (field870 == 25) {
            if (field1024 == 1) {
                if (field913 > field914) {
                    field914 = field913;
                }
                int var6 = (field914 * 50 - field913 * 50) / field914;
                method2802(class233.field2927 + class88.field1312 + class88.field1307 + var6 + "%" + class88.field1305, false);
            } else if (field1024 == 2) {
                if (field915 > field1089) {
                    field1089 = field915;
                }
                int var7 = (field1089 * 50 - field915 * 50) / field1089 + 50;
                method2802(class233.field2927 + class88.field1312 + class88.field1307 + var7 + "%" + class88.field1305, false);
            } else {
                method2802(class233.field2927, false);
            }
        } else if (field870 == 30) {
            this.method1030();
        } else if (field870 == 40) {
            method2802(class233.field3020 + class88.field1312 + class233.field3004, false);
        } else if (field870 == 45) {
            method2802(class233.field3117, false);
        }
        if (field870 == 30 && field888 == 0 && !arg0 && !field942) {
            for (int var8 = 0; var8 < field1051; var8++) {
                if (field1054[var8]) {
                    Statics.field3228.method696(field1007[var8], field1057[var8], field1045[var8], field1059[var8]);
                    field1054[var8] = false;
                }
            }
        } else if (field870 > 0) {
            Statics.field3228.method704(0, 0);
            for (int var9 = 0; var9 < field1051; var9++) {
                field1054[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.aw(B)V")
    public final void method735() {
        if (Statics.field2024.method1631()) {
            Statics.field2024.method1636();
        }
        if (Statics.field520 != null) {
            Statics.field520.field804 = false;
        }
        Statics.field520 = null;
        field906.method1717();
        if (class51.field601 != null) {
            class51 var1 = class51.field601;
            synchronized (class51.field601) {
                class51.field601 = null;
            }
        }
        if (class60.field676 != null) {
            class60 var3 = class60.field676;
            synchronized (class60.field676) {
                class60.field676 = null;
            }
        }
        Statics.field3718 = null;
        if (Statics.field15 != null) {
            Statics.field15.method1889();
        }
        if (Statics.field2864 != null) {
            Statics.field2864.method1889();
        }
        class246.method443();
        Object var5 = class244.field3291;
        synchronized (class244.field3291) {
            if (class244.field3289 != 0) {
                class244.field3289 = 1;
                try {
                    class244.field3291.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        if (Statics.field3332 != null) {
            Statics.field3332.method2680();
            Statics.field3332 = null;
        }
        class157.method3932();
    }

    @ObfuscatedName("r.ef(II)V")
    public static void method2(int arg0) {
        if (field870 == arg0) {
            return;
        }
        if (field870 == 0) {
            Statics.field3803.method713();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field895 = 0;
            field896 = 0;
            field897 = 0;
            field977.method4610(arg0);
            if (arg0 != 20) {
                Statics.method163(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field858 != null) {
            Statics.field858.method2763();
            Statics.field858 = null;
        }
        if (field870 == 25) {
            field1024 = 0;
            field913 = 0;
            field914 = 1;
            field915 = 0;
            field1089 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class92.method105(Statics.field841, Statics.field2134, true, 0);
        } else if (arg0 == 20) {
            class92.method105(Statics.field841, Statics.field2134, true, field870 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class92.method105(Statics.field841, Statics.field2134, false, 4);
        } else {
            class92.method940();
        }
        field870 = arg0;
    }

    @ObfuscatedName("client.ed(I)V")
    public void method1245() {
        if (field870 != 1000) {
            boolean var1 = class246.method2663();
            if (!var1) {
                this.method1346();
            }
        }
    }

    @ObfuscatedName("client.em(I)V")
    public void method1346() {
        if (class246.field3324 >= 4) {
            this.method738("js5crc");
            field870 = 1000;
            return;
        }
        if (class246.field3325 >= 4) {
            if (field870 <= 5) {
                this.method738("js5io");
                field870 = 1000;
                return;
            }
            field1083 = 3000;
            class246.field3325 = 3;
        }
        if (--field1083 + 1 > 0) {
            return;
        }
        try {
            if (field998 == 0) {
                Statics.field2164 = Statics.field671.method2724(Statics.field1413, Statics.field799);
                field998++;
            }
            if (field998 == 1) {
                if (Statics.field2164.field2125 == 2) {
                    this.method1026(-1);
                    return;
                }
                if (Statics.field2164.field2125 == 1) {
                    field998++;
                }
            }
            if (field998 == 2) {
                Statics.field10 = new class161((Socket) Statics.field2164.field2133, Statics.field671, 5000);
                class181 var1 = new class181(5);
                var1.method2929(15);
                var1.method2977(158);
                Statics.field10.method2768(var1.field2495, 0, 5);
                field998++;
                Statics.field864 = class183.method1711();
            }
            if (field998 == 3) {
                if (field870 <= 5 || Statics.field10.method2765() > 0) {
                    int var2 = Statics.field10.method2767();
                    if (var2 != 0) {
                        this.method1026(var2);
                        return;
                    }
                    field998++;
                } else if (class183.method1711() - Statics.field864 > 30000L) {
                    this.method1026(-2);
                    return;
                }
            }
            if (field998 == 4) {
                class246.method65(Statics.field10, field870 > 20);
                Statics.field2164 = null;
                Statics.field10 = null;
                field998 = 0;
                field894 = 0;
            }
        } catch (IOException var4) {
            this.method1026(-3);
        }
    }

    @ObfuscatedName("client.ee(II)V")
    public void method1026(int arg0) {
        Statics.field2164 = null;
        Statics.field10 = null;
        field998 = 0;
        if (Statics.field799 == Statics.field791) {
            Statics.field799 = Statics.field258;
        } else {
            Statics.field799 = Statics.field791;
        }
        field894++;
        if (field894 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field870 <= 5) {
                this.method738("js5connect_full");
                field870 = 1000;
            } else {
                field1083 = 3000;
            }
        } else if (field894 >= 2 && arg0 == 6) {
            this.method738("js5connect_outofdate");
            field870 = 1000;
        } else if (field894 >= 4) {
            if (field870 <= 5) {
                this.method738("js5connect");
                field870 = 1000;
            } else {
                field1083 = 3000;
            }
        }
    }

    @ObfuscatedName("u.ew(B)V")
    public static void method23() {
        if (field890 == 0) {
            Statics.field918 = new class139(4, 104, 104, class62.field709);
            for (int var0 = 0; var0 < 4; var0++) {
                field916[var0] = new class163(104, 104);
            }
            Statics.field1281 = new class295(512, 512);
            class92.field1345 = class233.field2930;
            class92.field1337 = 5;
            field890 = 20;
        } else if (field890 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class136.field1939[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class139.method2524(var1, 500, 800, 512, 334);
            class92.field1345 = class233.field2931;
            class92.field1337 = 10;
            field890 = 30;
        } else if (field890 == 30) {
            Statics.field2021 = method4546(0, false, true, true);
            Statics.field1451 = method4546(1, false, true, true);
            Statics.field2898 = method4546(2, true, false, true);
            Statics.field760 = method4546(3, false, true, true);
            Statics.field327 = method4546(4, false, true, true);
            Statics.field617 = method4546(5, true, true, true);
            Statics.field542 = method4546(6, true, true, false);
            Statics.field316 = method4546(7, false, true, true);
            Statics.field2134 = method4546(8, false, true, true);
            Statics.field3391 = method4546(9, false, true, true);
            Statics.field841 = method4546(10, false, true, true);
            Statics.field702 = method4546(11, false, true, true);
            Statics.field393 = method4546(12, false, true, true);
            Statics.field2072 = method4546(13, true, false, true);
            Statics.field1142 = method4546(14, false, true, false);
            Statics.field698 = method4546(15, false, true, true);
            Statics.field324 = method4546(16, false, true, false);
            class92.field1345 = class233.field2932;
            class92.field1337 = 20;
            field890 = 40;
        } else if (field890 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2021.method3918() * 4 / 100;
            int var8 = var7 + Statics.field1451.method3918() * 4 / 100;
            int var9 = var8 + Statics.field2898.method3918() * 2 / 100;
            int var10 = var9 + Statics.field760.method3918() * 2 / 100;
            int var11 = var10 + Statics.field327.method3918() * 6 / 100;
            int var12 = var11 + Statics.field617.method3918() * 4 / 100;
            int var13 = var12 + Statics.field542.method3918() * 2 / 100;
            int var14 = var13 + Statics.field316.method3918() * 58 / 100;
            int var15 = var14 + Statics.field2134.method3918() * 2 / 100;
            int var16 = var15 + Statics.field3391.method3918() * 2 / 100;
            int var17 = var16 + Statics.field841.method3918() * 2 / 100;
            int var18 = var17 + Statics.field702.method3918() * 2 / 100;
            int var19 = var18 + Statics.field393.method3918() * 2 / 100;
            int var20 = var19 + Statics.field2072.method3918() * 2 / 100;
            int var21 = var20 + Statics.field1142.method3918() * 2 / 100;
            int var22 = var21 + Statics.field698.method3918() * 2 / 100;
            int var23 = var22 + Statics.field324.method3918() * 2 / 100;
            if (var23 == 100) {
                class92.field1345 = class233.field2945;
                class92.field1337 = 30;
                field890 = 45;
            } else {
                if (var23 != 0) {
                    class92.field1345 = class233.field2974 + var23 + "%";
                }
                class92.field1337 = 30;
            }
        } else if (field890 == 45) {
            class109.method916(22050, !field868, 2);
            class212 var24 = new class212();
            var24.method3496(9, 128);
            Statics.field15 = class109.method2295(Statics.field671, 0, 22050);
            Statics.field15.method1876(var24);
            class211.method2692(Statics.field698, Statics.field1142, Statics.field327, var24);
            Statics.field2864 = class109.method2295(Statics.field671, 1, 2048);
            Statics.field1088 = new class102();
            Statics.field2864.method1876(Statics.field1088);
            Statics.field498 = new class116(22050, Statics.field1556);
            class92.field1345 = class233.field3068;
            class92.field1337 = 35;
            field890 = 50;
            Statics.field933 = new class270(Statics.field2134, Statics.field2072);
        } else if (field890 == 50) {
            int var25 = class269.method4440().length;
            field1042 = Statics.field933.method4443(class269.method4440());
            if (field1042.size() < var25) {
                class92.field1345 = class233.field3093 + field1042.size() * 100 / var25 + "%";
                class92.field1337 = 40;
            } else {
                Statics.field364 = (class271) field1042.get(class269.field3677);
                Statics.field1818 = (class271) field1042.get(class269.field3669);
                Statics.field910 = (class271) field1042.get(class269.field3671);
                Statics.field3652 = new class301(true);
                class92.field1345 = class233.field3153;
                class92.field1337 = 40;
                field890 = 60;
            }
        } else if (field890 == 60) {
            class245 var26 = Statics.field841;
            class245 var27 = Statics.field2134;
            int var28 = 0;
            if (var26.method3836("title.jpg", "")) {
                var28++;
            }
            if (var27.method3836("logo", "")) {
                var28++;
            }
            if (var27.method3836("logo_deadman_mode", "")) {
                var28++;
            }
            if (var27.method3836("titlebox", "")) {
                var28++;
            }
            if (var27.method3836("titlebutton", "")) {
                var28++;
            }
            if (var27.method3836("runes", "")) {
                var28++;
            }
            if (var27.method3836("title_mute", "")) {
                var28++;
            }
            if (var27.method3836("options_radio_buttons,0", "")) {
                var28++;
            }
            if (var27.method3836("options_radio_buttons,2", "")) {
                var28++;
            }
            if (var27.method3836("options_radio_buttons,4", "")) {
                var28++;
            }
            if (var27.method3836("options_radio_buttons,6", "")) {
                var28++;
            }
            var27.method3836("sl_back", "");
            var27.method3836("sl_flags", "");
            var27.method3836("sl_arrows", "");
            var27.method3836("sl_stars", "");
            var27.method3836("sl_button", "");
            byte var31 = 11;
            if (var28 < var31) {
                class92.field1345 = class233.field2938 + var28 * 100 / var31 + "%";
                class92.field1337 = 50;
            } else {
                class92.field1345 = class233.field2939;
                class92.field1337 = 50;
                method2(5);
                field890 = 70;
            }
        } else if (field890 == 70) {
            if (Statics.field2898.method3821()) {
                class267.method292(Statics.field2898);
                class254.method2304(Statics.field2898);
                class245 var33 = Statics.field2898;
                class245 var34 = Statics.field316;
                Statics.field3405 = var33;
                Statics.field3400 = var34;
                Statics.field2592 = Statics.field3405.method3883(3);
                class263.method941(Statics.field2898, Statics.field316, field868);
                class266.method44(Statics.field2898, Statics.field316);
                class245 var35 = Statics.field2898;
                Statics.field3446 = var35;
                class264.method2852(Statics.field2898, Statics.field316, field1058, Statics.field364);
                class268.method606(Statics.field2898, Statics.field2021, Statics.field1451);
                class245 var36 = Statics.field2898;
                class245 var37 = Statics.field316;
                Statics.field3379 = var36;
                Statics.field3386 = var37;
                Statics.method3813(Statics.field2898);
                class245 var38 = Statics.field2898;
                Statics.field3342 = var38;
                Statics.field3339 = Statics.field3342.method3883(16);
                class245 var39 = Statics.field760;
                class245 var40 = Statics.field316;
                class245 var41 = Statics.field2134;
                class245 var42 = Statics.field2072;
                Statics.field1687 = var39;
                Statics.field2786 = var40;
                Statics.field613 = var41;
                Statics.field3675 = var42;
                Statics.field2807 = new class224[Statics.field1687.method3828()][];
                Statics.field635 = new boolean[Statics.field1687.method3828()];
                class245 var43 = Statics.field2898;
                Statics.field3337 = var43;
                class261.method4050(Statics.field2898);
                class245 var44 = Statics.field2898;
                Statics.field3370 = var44;
                class252.method217(Statics.field2898);
                class245 var45 = Statics.field2898;
                Statics.field3439 = var45;
                Statics.field2024 = new class96();
                class245 var46 = Statics.field2898;
                class245 var47 = Statics.field2134;
                class245 var48 = Statics.field2072;
                Statics.field3461 = var46;
                Statics.field3469 = var47;
                Statics.field3463 = var48;
                class245 var49 = Statics.field2898;
                class245 var50 = Statics.field2134;
                Statics.field3414 = var49;
                Statics.field295 = var50;
                class245 var51 = Statics.field2898;
                class245 var52 = Statics.field2134;
                Statics.field3352 = var52;
                if (var51.method3821()) {
                    Statics.field3347 = var51.method3883(35);
                    Statics.field3346 = new class250[Statics.field3347];
                    for (int var53 = 0; var53 < Statics.field3347; var53++) {
                        byte[] var54 = var51.method3887(35, var53);
                        if (var54 != null) {
                            Statics.field3346[var53] = new class250(var53);
                            Statics.field3346[var53].method3965(new class181(var54));
                            Statics.field3346[var53].method3967();
                        }
                    }
                }
                class92.field1345 = class233.field2941;
                class92.field1337 = 60;
                field890 = 80;
            } else {
                class92.field1345 = class233.field2940 + Statics.field2898.method3923() + "%";
                class92.field1337 = 60;
            }
        } else if (field890 == 80) {
            int var55 = 0;
            if (Statics.field1429 == null) {
                Statics.field1429 = class296.method210(Statics.field2134, "compass", "");
            } else {
                var55++;
            }
            if (Statics.field680 == null) {
                Statics.field680 = class296.method210(Statics.field2134, "mapedge", "");
            } else {
                var55++;
            }
            if (Statics.field788 == null) {
                Statics.field788 = class296.method448(Statics.field2134, "mapscene", "");
            } else {
                var55++;
            }
            if (Statics.field765 == null) {
                Statics.field765 = class296.method524(Statics.field2134, "headicons_pk", "");
            } else {
                var55++;
            }
            if (Statics.field3331 == null) {
                Statics.field3331 = class296.method524(Statics.field2134, "headicons_prayer", "");
            } else {
                var55++;
            }
            if (Statics.field3680 == null) {
                Statics.field3680 = class296.method524(Statics.field2134, "headicons_hint", "");
            } else {
                var55++;
            }
            if (Statics.field2594 == null) {
                Statics.field2594 = class296.method524(Statics.field2134, "mapmarker", "");
            } else {
                var55++;
            }
            if (Statics.field26 == null) {
                Statics.field26 = class296.method524(Statics.field2134, "cross", "");
            } else {
                var55++;
            }
            if (Statics.field843 == null) {
                Statics.field843 = class296.method524(Statics.field2134, "mapdots", "");
            } else {
                var55++;
            }
            if (Statics.field633 == null) {
                Statics.field633 = class296.method448(Statics.field2134, "scrollbar", "");
            } else {
                var55++;
            }
            if (Statics.field2430 == null) {
                Statics.field2430 = class296.method448(Statics.field2134, "mod_icons", "");
            } else {
                var55++;
            }
            if (var55 < 11) {
                class92.field1345 = class233.field2942 + var55 * 100 / 12 + "%";
                class92.field1337 = 70;
            } else {
                Statics.field3699 = Statics.field2430;
                Statics.field680.method4847();
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 41.0D) - 20;
                Statics.field788[0].method4764(var56 + var59, var57 + var59, var58 + var59);
                class92.field1345 = class233.field2943;
                class92.field1337 = 70;
                field890 = 90;
            }
        } else if (field890 == 90) {
            if (Statics.field3391.method3821()) {
                class125 var60 = new class125(Statics.field3391, Statics.field2134, 20, 0.8D, field868 ? 64 : 128);
                class136.method2434(var60);
                class136.method2407(0.8D);
                class92.field1345 = class233.field3194;
                class92.field1337 = 90;
                field890 = 110;
            } else {
                class92.field1345 = class233.field2944 + Statics.field3391.method3923() + "%";
                class92.field1337 = 90;
            }
        } else if (field890 == 110) {
            Statics.field520 = new class71();
            Statics.field671.method2739(Statics.field520, 10);
            class92.field1345 = class233.field2946;
            class92.field1337 = 92;
            field890 = 120;
        } else if (field890 == 120) {
            if (Statics.field841.method3836("huffman", "")) {
                class173 var61 = new class173(Statics.field841.method3850("huffman", ""));
                class273.method854(var61);
                class92.field1345 = class233.field2948;
                class92.field1337 = 94;
                field890 = 130;
            } else {
                class92.field1345 = class233.field2964 + "%";
                class92.field1337 = 94;
            }
        } else if (field890 == 130) {
            if (!Statics.field760.method3821()) {
                class92.field1345 = class233.field2949 + Statics.field760.method3923() * 4 / 5 + "%";
                class92.field1337 = 96;
            } else if (!Statics.field393.method3821()) {
                class92.field1345 = class233.field2949 + (80 + Statics.field393.method3923() / 6) + "%";
                class92.field1337 = 96;
            } else if (Statics.field2072.method3821()) {
                class92.field1345 = class233.field2950;
                class92.field1337 = 98;
                field890 = 140;
            } else {
                class92.field1345 = class233.field2949 + (96 + Statics.field2072.method3923() / 50) + "%";
                class92.field1337 = 96;
            }
        } else if (field890 == 140) {
            class92.field1337 = 100;
            if (Statics.field324.method3880(class41.field508.field505)) {
                if (Statics.field725 == null) {
                    Statics.field725 = new class298();
                    Statics.field725.method4919(Statics.field324, Statics.field910, field1042, Statics.field788);
                }
                int var62 = Statics.field725.method4920();
                if (var62 < 100) {
                    class92.field1345 = class233.field3197 + (var62 * 9 / 10 + 10) + "%";
                } else {
                    class92.field1345 = class233.field3200;
                    field890 = 150;
                }
            } else {
                class92.field1345 = class233.field3197 + Statics.field324.method3837(class41.field508.field505) / 10 + "%";
            }
        } else if (field890 == 150) {
            method2(10);
        }
    }

    @ObfuscatedName("jw.eg(IZZZI)Liu;")
    public static class245 method4546(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class162 var4 = null;
        if (class157.field2149 != null) {
            var4 = new class162(arg0, class157.field2149, Statics.field2701[arg0], 1000000);
        }
        return new class245(var4, Statics.field224, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.ex(I)V")
    public final void method1177() {
        class161 var1 = field906.method1733();
        class187 var2 = field906.field1462;
        try {
            if (field895 == 0) {
                if (var1 != null) {
                    var1.method2763();
                    var1 = null;
                }
                Statics.field253 = null;
                field908 = false;
                field896 = 0;
                field895 = 1;
            }
            if (field895 == 1) {
                if (Statics.field253 == null) {
                    Statics.field253 = Statics.field671.method2724(Statics.field1413, Statics.field799);
                }
                if (Statics.field253.field2125 == 2) {
                    throw new IOException();
                }
                if (Statics.field253.field2125 == 1) {
                    field906.method1716(new class161((Socket) Statics.field253.field2133, Statics.field671, 5000));
                    var1 = field906.method1733();
                    Statics.field253 = null;
                    field895 = 2;
                }
            }
            if (field895 == 2) {
                field906.method1728();
                class171 var3 = class171.method1668();
                var3.field2422 = null;
                var3.field2417 = 0;
                var3.field2423 = new class187(5000);
                var3.field2423.method2929(class169.field2397.field2401);
                field906.method1715(var3);
                field906.method1726();
                var2.field2488 = 0;
                field895 = 3;
            }
            if (field895 == 3) {
                if (Statics.field15 != null) {
                    Statics.field15.method1878();
                }
                if (Statics.field2864 != null) {
                    Statics.field2864.method1878();
                }
                int var6 = var1.method2767();
                if (Statics.field15 != null) {
                    Statics.field15.method1878();
                }
                if (Statics.field2864 != null) {
                    Statics.field2864.method1878();
                }
                if (var6 != 0) {
                    method293(var6);
                    return;
                }
                var2.field2488 = 0;
                field895 = 4;
            }
            if (field895 == 4) {
                if (var2.field2488 < 8) {
                    int var7 = var1.method2765();
                    if (var7 > 8 - var2.field2488) {
                        var7 = 8 - var2.field2488;
                    }
                    if (var7 > 0) {
                        var1.method2783(var2.field2495, var2.field2488, var7);
                        var2.field2488 += var7;
                    }
                }
                if (var2.field2488 == 8) {
                    var2.field2488 = 0;
                    Statics.field421 = var2.method2951();
                    field895 = 5;
                }
            }
            if (field895 == 5) {
                field906.field1462.field2488 = 0;
                field906.method1728();
                class187 var8 = new class187(500);
                int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field421 >> 32), (int) (Statics.field421 & 0xFFFFFFFFFFFFFFFFL) };
                var8.field2488 = 0;
                var8.method2929(1);
                var8.method2929(field899.method8());
                var8.method2977(var9[0]);
                var8.method2977(var9[1]);
                var8.method2977(var9[2]);
                var8.method2977(var9[3]);
                switch(field899.field2108) {
                    case 0:
                    case 1:
                        var8.method2931(Statics.field610);
                        var8.field2488 += 5;
                        break;
                    case 2:
                        LinkedHashMap var11 = Statics.field801.field1228;
                        String var12 = class92.field1351;
                        int var13 = var12.length();
                        int var14 = 0;
                        for (int var15 = 0; var15 < var13; var15++) {
                            var14 = (var14 << 5) - var14 + var12.charAt(var15);
                        }
                        var8.method2977((Integer) var11.get(var14));
                        var8.field2488 += 4;
                        break;
                    case 3:
                        var8.field2488 += 8;
                }
                var8.method2936(class92.field1340);
                var8.method3142(class90.field1322, class90.field1320);
                class171 var17 = class171.method1668();
                var17.field2422 = null;
                var17.field2417 = 0;
                var17.field2423 = new class187(5000);
                var17.field2423.field2488 = 0;
                if (field870 == 40) {
                    var17.field2423.method2929(class169.field2404.field2401);
                } else {
                    var17.field2423.method2929(class169.field2399.field2401);
                }
                var17.field2423.method2930(0);
                int var20 = var17.field2423.field2488;
                var17.field2423.method2977(158);
                var17.field2423.method2939(var8.field2495, 0, var8.field2488);
                int var21 = var17.field2423.field2488;
                var17.field2423.method2936(class92.field1351);
                var17.field2423.method2929((field942 ? 1 : 0) << 1 | (field868 ? 1 : 0));
                var17.field2423.method2930(Statics.field764);
                var17.field2423.method2930(Statics.field1394);
                method3808(var17.field2423);
                var17.field2423.method2936(Statics.field1573);
                var17.field2423.method2977(Statics.field340);
                class181 var22 = new class181(Statics.field3652.method5108());
                Statics.field3652.method5114(var22);
                var17.field2423.method2939(var22.field2495, 0, var22.field2495.length);
                var17.field2423.method2929(Statics.field14);
                var17.field2423.method2977(0);
                var17.field2423.method2977(Statics.field2021.field3285);
                var17.field2423.method2977(Statics.field1451.field3285);
                var17.field2423.method2977(Statics.field2898.field3285);
                var17.field2423.method2977(Statics.field760.field3285);
                var17.field2423.method2977(Statics.field327.field3285);
                var17.field2423.method2977(Statics.field617.field3285);
                var17.field2423.method2977(Statics.field542.field3285);
                var17.field2423.method2977(Statics.field316.field3285);
                var17.field2423.method2977(Statics.field2134.field3285);
                var17.field2423.method2977(Statics.field3391.field3285);
                var17.field2423.method2977(Statics.field841.field3285);
                var17.field2423.method2977(Statics.field702.field3285);
                var17.field2423.method2977(Statics.field393.field3285);
                var17.field2423.method2977(Statics.field2072.field3285);
                var17.field2423.method2977(Statics.field1142.field3285);
                var17.field2423.method2977(Statics.field698.field3285);
                var17.field2423.method2977(Statics.field324.field3285);
                var17.field2423.method3025(var9, var21, var17.field2423.field2488);
                var17.field2423.method2941(var17.field2423.field2488 - var20);
                field906.method1715(var17);
                field906.method1726();
                field906.field1461 = new class188(var9);
                for (int var23 = 0; var23 < 4; var23++) {
                    var9[var23] += 50;
                }
                var2.method3228(var9);
                field895 = 6;
            }
            if (field895 == 6 && var1.method2765() > 0) {
                int var24 = var1.method2767();
                if (var24 == 21 && field870 == 20) {
                    field895 = 7;
                } else if (var24 == 2) {
                    field895 = 9;
                } else if (var24 == 15 && field870 == 40) {
                    field906.field1466 = -1;
                    field895 = 13;
                } else if (var24 == 23 && field897 < 1) {
                    field897++;
                    field895 = 0;
                } else if (var24 == 29) {
                    field895 = 11;
                } else {
                    method293(var24);
                    return;
                }
            }
            if (field895 == 7 && var1.method2765() > 0) {
                field898 = (var1.method2767() + 3) * 60;
                field895 = 8;
            }
            if (field895 == 8) {
                field896 = 0;
                class92.method15(class233.field2956, class233.field2957, field898 / 60 + class233.field2958);
                if (--field898 <= 0) {
                    field895 = 0;
                }
            } else {
                if (field895 == 9 && var1.method2765() >= 13) {
                    boolean var25 = var1.method2767() == 1;
                    var1.method2783(var2.field2495, 0, 4);
                    var2.field2488 = 0;
                    boolean var26 = false;
                    if (var25) {
                        int var27 = var2.method3204() << 24;
                        int var28 = var27 | var2.method3204() << 16;
                        int var29 = var28 | var2.method3204() << 8;
                        int var30 = var29 | var2.method3204();
                        String var31 = class92.field1351;
                        int var32 = var31.length();
                        int var33 = 0;
                        int var34 = 0;
                        while (true) {
                            if (var34 >= var32) {
                                if (Statics.field801.field1228.size() >= 10 && !Statics.field801.field1228.containsKey(var33)) {
                                    Iterator var37 = Statics.field801.field1228.entrySet().iterator();
                                    var37.next();
                                    var37.remove();
                                }
                                Statics.field801.field1228.put(var33, var30);
                                break;
                            }
                            var33 = (var33 << 5) - var33 + var31.charAt(var34);
                            var34++;
                        }
                    }
                    if (class92.field1353) {
                        Statics.field801.field1233 = class92.field1351;
                    } else {
                        Statics.field801.field1233 = null;
                    }
                    class81.method842();
                    field1015 = var1.method2767();
                    field980 = var1.method2767() == 1;
                    field989 = var1.method2767();
                    field989 <<= 0x8;
                    field989 += var1.method2767();
                    field970 = var1.method2767();
                    var1.method2783(var2.field2495, 0, 1);
                    var2.field2488 = 0;
                    class167[] var38 = class167.method3797();
                    int var39 = var2.method3206();
                    if (var39 < 0 || var39 >= var38.length) {
                        throw new IOException(var39 + " " + var2.field2488);
                    }
                    field906.field1464 = var38[var39];
                    field906.field1466 = field906.field1464.field2298;
                    var1.method2783(var2.field2495, 0, 2);
                    var2.field2488 = 0;
                    field906.field1466 = var2.method3081();
                    try {
                        class53.method643(Statics.field3803, "zap");
                    } catch (Throwable var58) {
                    }
                    field895 = 10;
                }
                if (field895 != 10) {
                    if (field895 == 11 && var1.method2765() >= 2) {
                        var2.field2488 = 0;
                        var1.method2783(var2.field2495, 0, 2);
                        var2.field2488 = 0;
                        Statics.field794 = var2.method3081();
                        field895 = 12;
                    }
                    if (field895 == 12 && var1.method2765() >= Statics.field794) {
                        var2.field2488 = 0;
                        var1.method2783(var2.field2495, 0, Statics.field794);
                        var2.field2488 = 0;
                        String var53 = var2.method2953();
                        String var54 = var2.method2953();
                        String var55 = var2.method2953();
                        class92.method15(var53, var54, var55);
                        method2(10);
                    }
                    if (field895 == 13) {
                        if (field906.field1466 == -1) {
                            if (var1.method2765() < 2) {
                                return;
                            }
                            var1.method2783(var2.field2495, 0, 2);
                            var2.field2488 = 0;
                            field906.field1466 = var2.method3081();
                        }
                        if (var1.method2765() >= field906.field1466) {
                            var1.method2783(var2.field2495, 0, field906.field1466);
                            var2.field2488 = 0;
                            int var56 = field906.field1466;
                            field977.method4613();
                            method2397();
                            class95.method160(var2);
                            if (var2.field2488 != var56) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field896++;
                        if (field896 > 2000) {
                            if (field897 < 1) {
                                if (Statics.field799 == Statics.field791) {
                                    Statics.field799 = Statics.field258;
                                } else {
                                    Statics.field799 = Statics.field791;
                                }
                                field897++;
                                field895 = 0;
                            } else {
                                method293(-3);
                            }
                        }
                    }
                } else if (var1.method2765() >= field906.field1466) {
                    var2.field2488 = 0;
                    var1.method2783(var2.field2495, 0, field906.field1466);
                    field977.method4616();
                    field1091 = 1L;
                    field876 = -1;
                    Statics.field520.field796 = 0;
                    Statics.field609 = true;
                    field877 = true;
                    field1072 = -1L;
                    class290.method3809();
                    field906.method1728();
                    field906.field1462.field2488 = 0;
                    field906.field1464 = null;
                    field906.field1468 = null;
                    field906.field1469 = null;
                    field906.field1460 = null;
                    field906.field1466 = 0;
                    field906.field1458 = 0;
                    field911 = 0;
                    field907 = 0;
                    field880 = 0;
                    field1044 = 0;
                    field964 = false;
                    class60.field679 = 0;
                    class97.method42();
                    field1001 = 0;
                    field1003 = false;
                    field1032 = 0;
                    field922 = 0;
                    field1109 = 0;
                    field1082 = -1;
                    field979 = 0;
                    field1081 = 0;
                    field1097 = class91.field1329;
                    field951 = class91.field1329;
                    field902 = 0;
                    class95.field1401 = 0;
                    for (int var41 = 0; var41 < 2048; var41++) {
                        class95.field1409[var41] = null;
                        class95.field1399[var41] = 1;
                    }
                    for (int var42 = 0; var42 < 2048; var42++) {
                        field1098[var42] = null;
                    }
                    for (int var43 = 0; var43 < 32768; var43++) {
                        field874[var43] = null;
                    }
                    field1071 = -1;
                    field947.method3399();
                    field981.method3399();
                    for (int var44 = 0; var44 < 4; var44++) {
                        for (int var45 = 0; var45 < 104; var45++) {
                            for (int var46 = 0; var46 < 104; var46++) {
                                field978[var44][var45][var46] = null;
                            }
                        }
                    }
                    field885 = new class201();
                    field1115 = 0;
                    field1114 = 0;
                    field1118 = 0;
                    for (int var47 = 0; var47 < Statics.field3339; var47++) {
                        class249 var48 = class249.method4573(var47);
                        if (var48 != null) {
                            class219.field2679[var47] = 0;
                            class219.field2680[var47] = 0;
                        }
                    }
                    Statics.field2024.method1634();
                    field1016 = -1;
                    if (field1008 != -1) {
                        class224.method4159(field1008);
                    }
                    for (class68 var49 = (class68) field1009.method3343(); var49 != null; var49 = (class68) field1009.method3344()) {
                        method1017(var49, true);
                    }
                    field1008 = -1;
                    field1009 = new class198(8);
                    field879 = null;
                    field1044 = 0;
                    field964 = false;
                    field1120.method3701((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var50 = 0; var50 < 8; var50++) {
                        field961[var50] = null;
                        field975[var50] = false;
                    }
                    class64.method112();
                    field1006 = true;
                    for (int var51 = 0; var51 < 100; var51++) {
                        field1053[var51] = true;
                    }
                    method1446();
                    field962 = null;
                    Statics.field451 = 0;
                    Statics.field1420 = null;
                    for (int var52 = 0; var52 < 8; var52++) {
                        field1123[var52] = new class17();
                    }
                    Statics.field856 = null;
                    class95.method160(var2);
                    Statics.field470 = -1;
                    method2400(false, var2);
                    field906.field1464 = null;
                }
            }
        } catch (IOException var59) {
            if (field897 < 1) {
                if (Statics.field799 == Statics.field791) {
                    Statics.field799 = Statics.field258;
                } else {
                    Statics.field799 = Statics.field791;
                }
                field897++;
                field895 = 0;
            } else {
                method293(-2);
            }
        }
    }

    @ObfuscatedName("ek.eq(B)V")
    public static void method2397() {
        field906.method1728();
        field906.field1462.field2488 = 0;
        field906.field1464 = null;
        field906.field1468 = null;
        field906.field1469 = null;
        field906.field1460 = null;
        field906.field1466 = 0;
        field906.field1458 = 0;
        field911 = 0;
        field1044 = 0;
        field964 = false;
        field1109 = 0;
        field979 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1098[var0] = null;
        }
        Statics.field3721 = null;
        for (int var1 = 0; var1 < field874.length; var1++) {
            class86 var2 = field874[var1];
            if (var2 != null) {
                var2.field1171 = -1;
                var2.field1188 = false;
            }
        }
        class64.method112();
        method2(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field1053[var3] = true;
        }
        method1446();
    }

    @ObfuscatedName("am.fk(IB)V")
    public static void method293(int arg0) {
        if (arg0 == -3) {
            class92.method15(class233.field3166, class233.field3078, class233.field2961);
        } else if (arg0 == -2) {
            class92.method15(class233.field2962, class233.field3142, class233.field3046);
        } else if (arg0 == -1) {
            class92.method15(class233.field2936, class233.field3044, class233.field2928);
        } else if (arg0 == 3) {
            class92.field1346 = 3;
        } else if (arg0 == 4) {
            class92.method15(class233.field3144, class233.field2969, class233.field2970);
        } else if (arg0 == 5) {
            class92.method15(class233.field3032, class233.field2972, class233.field2973);
        } else if (arg0 == 6) {
            class92.method15(class233.field2992, class233.field2921, class233.field2976);
        } else if (arg0 == 7) {
            class92.method15(class233.field2977, class233.field3094, class233.field2979);
        } else if (arg0 == 8) {
            class92.method15(class233.field2980, class233.field2981, class233.field3091);
        } else if (arg0 == 9) {
            class92.method15(class233.field3133, class233.field3037, class233.field2985);
        } else if (arg0 == 10) {
            class92.method15(class233.field2986, class233.field3105, class233.field3147);
        } else if (arg0 == 11) {
            class92.method15(class233.field2989, class233.field2967, class233.field2990);
        } else if (arg0 == 12) {
            class92.method15(class233.field3173, class233.field2993, class233.field3077);
        } else if (arg0 == 13) {
            class92.method15(class233.field2995, class233.field2996, class233.field2997);
        } else if (arg0 == 14) {
            class92.method15(class233.field2998, class233.field2994, class233.field3099);
        } else if (arg0 == 16) {
            class92.method15(class233.field3001, class233.field2984, class233.field3003);
        } else if (arg0 == 17) {
            class92.method15(class233.field2935, class233.field2983, class233.field3006);
        } else if (arg0 == 18) {
            class92.method15(class233.field3007, class233.field3008, class233.field3009);
        } else if (arg0 == 19) {
            class92.method15(class233.field3010, class233.field3075, class233.field3012);
        } else if (arg0 == 20) {
            class92.method15(class233.field3013, class233.field3014, class233.field2947);
        } else if (arg0 == 22) {
            class92.method15(class233.field2955, class233.field3089, class233.field3018);
        } else if (arg0 == 23) {
            class92.method15(class233.field3019, class233.field3030, class233.field3101);
        } else if (arg0 == 24) {
            class92.method15(class233.field3022, class233.field3023, class233.field3024);
        } else if (arg0 == 25) {
            class92.method15(class233.field3025, class233.field3063, class233.field3027);
        } else if (arg0 == 26) {
            class92.method15(class233.field3028, class233.field3029, class233.field3167);
        } else if (arg0 == 27) {
            class92.method15(class233.field3031, class233.field3065, class233.field3033);
        } else if (arg0 == 31) {
            class92.method15(class233.field3040, class233.field3041, class233.field2922);
        } else if (arg0 == 32) {
            class92.method15(class233.field3043, class233.field3130, class233.field3045);
        } else if (arg0 == 37) {
            class92.method15(class233.field2991, class233.field3047, class233.field3048);
        } else if (arg0 == 38) {
            class92.method15(class233.field3049, class233.field3050, class233.field3051);
        } else if (arg0 == 55) {
            class92.method15(class233.field3052, class233.field3053, class233.field3054);
        } else if (arg0 == 56) {
            class92.method15(class233.field3055, class233.field3056, class233.field3087);
            method2(11);
            return;
        } else if (arg0 == 57) {
            class92.method15(class233.field3058, class233.field3059, class233.field3060);
            method2(11);
            return;
        } else {
            class92.method15(class233.field2959, class233.field3198, class233.field3088);
        }
        method2(10);
    }

    @ObfuscatedName("a.ft(I)V")
    public static final void method55() {
        field906.method1717();
        method601();
        Statics.field918.method2489();
        for (int var0 = 0; var0 < 4; var0++) {
            field916[var0].method2804();
        }
        System.gc();
        class211.method1679(2);
        field1084 = -1;
        field1085 = false;
        class82.method3784();
        method2(10);
    }

    @ObfuscatedName("ai.fl(I)V")
    public static final void method601() {
        class267.method2761();
        class254.field3392.method3333();
        class255.method3790();
        class263.field3512.method3333();
        class263.field3490.method3333();
        class263.field3491.method3333();
        class263.field3492.method3333();
        class266.field3603.method3333();
        class266.field3616.method3333();
        class264.field3544.method3333();
        class264.field3576.method3333();
        class264.field3546.method3333();
        class268.method140();
        class253.field3374.method3333();
        class253.field3377.method3333();
        class258.method2664();
        class249.field3340.method3333();
        class262.field3470.method3333();
        class262.field3465.method3333();
        class262.field3466.method3333();
        class256.field3425.method3333();
        class256.field3419.method3333();
        class260.method4631();
        class259.field3436.method3333();
        class250.method3235();
        class221.field2696.method3333();
        class224.field2708.method3333();
        class224.field2709.method3333();
        class224.field2850.method3333();
        class224.field2784.method3333();
        ((class125) Statics.field1938).method2213();
        class98.field1437.method3333();
        Statics.field2021.method3830();
        Statics.field1451.method3830();
        Statics.field760.method3830();
        Statics.field327.method3830();
        Statics.field617.method3830();
        Statics.field542.method3830();
        Statics.field316.method3830();
        Statics.field2134.method3830();
        Statics.field3391.method3830();
        Statics.field841.method3830();
        Statics.field702.method3830();
        Statics.field393.method3830();
    }

    @ObfuscatedName("bv.fg(B)V")
    public static final void method953() {
        if (field907 > 0) {
            method55();
        } else {
            field977.method4615();
            method2(40);
            Statics.field858 = field906.method1733();
            field906.method1718();
        }
    }

    @ObfuscatedName("client.fw(B)V")
    public final void method1028() {
        if (field911 > 1) {
            field911--;
        }
        if (field907 > 0) {
            field907--;
        }
        if (field908) {
            field908 = false;
            method953();
            return;
        }
        if (!field964) {
            method944();
        }
        for (int var1 = 0; var1 < 100 && this.method1031(field906); var1++) {
        }
        if (field870 != 30) {
            return;
        }
        while (true) {
            class289 var2 = (class289) class290.field3804.method3362();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field977.field3770) {
                    class171 var6 = class171.method124(class168.field2362, field906.field1461);
                    var6.field2423.method2929(0);
                    int var7 = var6.field2423.field2488;
                    field977.method4614(var6.field2423);
                    var6.field2423.method2956(var6.field2423.field2488 - var7);
                    field906.method1715(var6);
                    field977.method4622();
                }
                Object var8 = Statics.field520.field798;
                synchronized (Statics.field520.field798) {
                    if (!field1080) {
                        Statics.field520.field796 = 0;
                    } else if (class60.field688 != 0 || Statics.field520.field796 >= 40) {
                        class171 var9 = class171.method124(class168.field2303, field906.field1461);
                        var9.field2423.method2929(0);
                        int var10 = var9.field2423.field2488;
                        int var11 = 0;
                        for (int var12 = 0; var12 < Statics.field520.field796 && var9.field2423.field2488 - var10 < 240; var12++) {
                            var11++;
                            int var13 = Statics.field520.field795[var12];
                            if (var13 < 0) {
                                var13 = 0;
                            } else if (var13 > 502) {
                                var13 = 502;
                            }
                            int var14 = Statics.field520.field800[var12];
                            if (var14 < 0) {
                                var14 = 0;
                            } else if (var14 > 764) {
                                var14 = 764;
                            }
                            int var15 = var13 * 765 + var14;
                            if (Statics.field520.field795[var12] == -1 && Statics.field520.field800[var12] == -1) {
                                var14 = -1;
                                var13 = -1;
                                var15 = 524287;
                            }
                            if (field990 != var14 || field917 != var13) {
                                int var16 = var14 - field990;
                                field990 = var14;
                                int var17 = var13 - field917;
                                field917 = var13;
                                if (field876 < 8 && var16 >= -32 && var16 <= 31 && var17 >= -32 && var17 <= 31) {
                                    var16 += 32;
                                    var17 += 32;
                                    var9.field2423.method2930((field876 << 12) + (var16 << 6) + var17);
                                    field876 = 0;
                                } else if (field876 < 8) {
                                    var9.field2423.method2931((field876 << 19) + 8388608 + var15);
                                    field876 = 0;
                                } else {
                                    var9.field2423.method2977((field876 << 19) + -1073741824 + var15);
                                    field876 = 0;
                                }
                            } else if (field876 < 2047) {
                                field876++;
                            }
                        }
                        var9.field2423.method2956(var9.field2423.field2488 - var10);
                        field906.method1715(var9);
                        if (var11 >= Statics.field520.field796) {
                            Statics.field520.field796 = 0;
                        } else {
                            Statics.field520.field796 -= var11;
                            for (int var18 = 0; var18 < Statics.field520.field796; var18++) {
                                Statics.field520.field800[var18] = Statics.field520.field800[var11 + var18];
                                Statics.field520.field795[var18] = Statics.field520.field795[var11 + var18];
                            }
                        }
                    }
                }
                if (class60.field688 == 1 || !Statics.field2143 && class60.field688 == 4 || class60.field688 == 2) {
                    long var20 = (class60.field691 - field1091 * -1L) / 50L;
                    if (var20 > 4095L) {
                        var20 = 4095L;
                    }
                    field1091 = class60.field691 * -1L;
                    int var22 = class60.field689;
                    if (var22 < 0) {
                        var22 = 0;
                    } else if (var22 > Statics.field1394) {
                        var22 = Statics.field1394;
                    }
                    int var23 = class60.field675;
                    if (var23 < 0) {
                        var23 = 0;
                    } else if (var23 > Statics.field764) {
                        var23 = Statics.field764;
                    }
                    int var24 = (int) var20;
                    class171 var25 = class171.method124(class168.field2386, field906.field1461);
                    var25.field2423.method2930((class60.field688 == 2 ? 1 : 0) + (var24 << 1));
                    var25.field2423.method2930(var23);
                    var25.field2423.method2930(var22);
                    field906.method1715(var25);
                }
                if (class51.field602 > 0) {
                    class171 var26 = class171.method124(class168.field2346, field906.field1461);
                    var26.field2423.method2930(0);
                    int var27 = var26.field2423.field2488;
                    long var28 = class183.method1711();
                    for (int var30 = 0; var30 < class51.field602; var30++) {
                        long var31 = var28 - field1072;
                        if (var31 > 16777215L) {
                            var31 = 16777215L;
                        }
                        field1072 = var28;
                        var26.field2423.method2985((int) var31);
                        var26.field2423.method2969(class51.field595[var30]);
                    }
                    var26.field2423.method2941(var26.field2423.field2488 - var27);
                    field906.method1715(var26);
                }
                if (field938 > 0) {
                    field938--;
                }
                if (class51.field579[96] || class51.field579[97] || class51.field579[98] || class51.field579[99]) {
                    field939 = true;
                }
                if (field939 && field938 <= 0) {
                    field938 = 20;
                    field939 = false;
                    class171 var33 = class171.method124(class168.field2364, field906.field1461);
                    var33.field2423.method2930(field922);
                    var33.field2423.method2980(field931);
                    field906.method1715(var33);
                }
                if (Statics.field609 && !field877) {
                    field877 = true;
                    class171 var34 = class171.method124(class168.field2304, field906.field1461);
                    var34.field2423.method2929(1);
                    field906.method1715(var34);
                }
                if (!Statics.field609 && field877) {
                    field877 = false;
                    class171 var35 = class171.method124(class168.field2304, field906.field1461);
                    var35.field2423.method2929(0);
                    field906.method1715(var35);
                }
                method1609();
                if (field870 != 30) {
                    return;
                }
                for (class77 var36 = (class77) field885.method3405(); var36 != null; var36 = (class77) field885.method3414()) {
                    if (var36.field1130 > 0) {
                        var36.field1130--;
                    }
                    if (var36.field1130 == 0) {
                        if (var36.field1134 >= 0) {
                            int var37 = var36.field1134;
                            int var38 = var36.field1139;
                            class263 var39 = class263.method2851(var37);
                            if (var38 == 11) {
                                var38 = 10;
                            }
                            if (var38 >= 5 && var38 <= 8) {
                                var38 = 4;
                            }
                            boolean var40 = var39.method4212(var38);
                            if (!var40) {
                                continue;
                            }
                        }
                        method295(var36.field1138, var36.field1131, var36.field1129, var36.field1132, var36.field1134, var36.field1133, var36.field1139);
                        var36.method3392();
                    } else {
                        if (var36.field1144 > 0) {
                            var36.field1144--;
                        }
                        if (var36.field1144 == 0 && var36.field1129 >= 1 && var36.field1132 >= 1 && var36.field1129 <= 102 && var36.field1132 <= 102) {
                            if (var36.field1135 >= 0) {
                                int var41 = var36.field1135;
                                int var42 = var36.field1137;
                                class263 var43 = class263.method2851(var41);
                                if (var42 == 11) {
                                    var42 = 10;
                                }
                                if (var42 >= 5 && var42 <= 8) {
                                    var42 = 4;
                                }
                                boolean var44 = var43.method4212(var42);
                                if (!var44) {
                                    continue;
                                }
                            }
                            method295(var36.field1138, var36.field1131, var36.field1129, var36.field1132, var36.field1135, var36.field1136, var36.field1137);
                            var36.field1144 = -1;
                            if (var36.field1135 == var36.field1134 && var36.field1134 == -1) {
                                var36.method3392();
                            } else if (var36.field1135 == var36.field1134 && var36.field1136 == var36.field1133 && var36.field1139 == var36.field1137) {
                                var36.method3392();
                            }
                        }
                    }
                }
                method13();
                field906.field1458++;
                if (field906.field1458 > 750) {
                    method953();
                    return;
                }
                method21();
                method71();
                method4761();
                field923++;
                if (field958 != 0) {
                    field969 += 20;
                    if (field969 >= 400) {
                        field958 = 0;
                    }
                }
                if (Statics.field2443 != null) {
                    field959++;
                    if (field959 >= 15) {
                        method955(Statics.field2443);
                        Statics.field2443 = null;
                    }
                }
                class224 var45 = Statics.field265;
                class224 var46 = Statics.field395;
                Statics.field265 = null;
                Statics.field395 = null;
                field1025 = null;
                field1029 = false;
                field1026 = false;
                field1069 = 0;
                while (class51.method4004() && field1069 < 128) {
                    if (field1015 >= 2 && class51.field579[82] && Statics.field1427 == 66) {
                        String var47 = "";
                        Iterator var48 = class97.field1426.iterator();
                        while (var48.hasNext()) {
                            class72 var49 = (class72) var48.next();
                            var47 = var47 + var49.field805 + ':' + var49.field808 + '\n';
                        }
                        Statics.field3803.method729(var47);
                    } else {
                        field971[field1069] = Statics.field1427;
                        field1070[field1069] = Statics.field3201;
                        field1069++;
                    }
                }
                boolean var52 = field1015 >= 2;
                if (var52 && class51.field579[82] && class51.field579[81] && field986 != 0) {
                    int var53 = Statics.field3721.field836 - field986;
                    if (var53 < 0) {
                        var53 = 0;
                    } else if (var53 > 3) {
                        var53 = 3;
                    }
                    if (Statics.field3721.field836 != var53) {
                        method63(Statics.field269 + Statics.field3721.field1200[0], Statics.field854 + Statics.field3721.field1201[0], var53);
                    }
                    field986 = 0;
                }
                if (field1008 != -1) {
                    method4326(field1008, 0, 0, Statics.field764, Statics.field1394, 0, 0);
                }
                field1033++;
                while (true) {
                    class69 var54;
                    class224 var55;
                    class224 var56;
                    do {
                        var54 = (class69) field1048.method3403();
                        if (var54 == null) {
                            while (true) {
                                class69 var57;
                                class224 var58;
                                class224 var59;
                                do {
                                    var57 = (class69) field1049.method3403();
                                    if (var57 == null) {
                                        while (true) {
                                            class69 var60;
                                            class224 var61;
                                            class224 var62;
                                            do {
                                                var60 = (class69) field863.method3403();
                                                if (var60 == null) {
                                                    this.method1032();
                                                    if (Statics.field725 != null) {
                                                        Statics.field725.method4927(Statics.field376, (Statics.field3721.field1195 >> 7) + Statics.field269, (Statics.field3721.field1157 >> 7) + Statics.field854, false);
                                                        Statics.field725.method4941();
                                                    }
                                                    if (field1021 != null) {
                                                        this.method1064();
                                                    }
                                                    if (Statics.field813 != null) {
                                                        method955(Statics.field813);
                                                        field966++;
                                                        if (class60.field690 == 0) {
                                                            if (field965) {
                                                                if (Statics.field813 == Statics.field2710 && field891 != field1112) {
                                                                    class224 var63 = Statics.field813;
                                                                    byte var64 = 0;
                                                                    if (field1011 == 1 && var63.field2718 == 206) {
                                                                        var64 = 1;
                                                                    }
                                                                    if (var63.field2832[field1112] <= 0) {
                                                                        var64 = 0;
                                                                    }
                                                                    int var65 = method57(var63);
                                                                    boolean var66 = (var65 >> 29 & 0x1) != 0;
                                                                    if (var66) {
                                                                        int var67 = field891;
                                                                        int var68 = field1112;
                                                                        var63.field2832[var68] = var63.field2832[var67];
                                                                        var63.field2833[var68] = var63.field2833[var67];
                                                                        var63.field2832[var67] = -1;
                                                                        var63.field2833[var67] = 0;
                                                                    } else if (var64 == 1) {
                                                                        int var69 = field891;
                                                                        int var70 = field1112;
                                                                        while (var69 != var70) {
                                                                            if (var69 > var70) {
                                                                                var63.method3741(var69 - 1, var69);
                                                                                var69--;
                                                                            } else if (var69 < var70) {
                                                                                var63.method3741(var69 + 1, var69);
                                                                                var69++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var63.method3741(field1112, field891);
                                                                    }
                                                                    class171 var71 = class171.method124(class168.field2341, field906.field1461);
                                                                    var71.field2423.method2930(field891);
                                                                    var71.field2423.method2978(field1112);
                                                                    var71.field2423.method2971(var64);
                                                                    var71.field2423.method2977(Statics.field813.field2714);
                                                                    field906.method1715(var71);
                                                                }
                                                            } else if (this.method1033()) {
                                                                this.method1034(field924, field963);
                                                            } else if (field1044 > 0) {
                                                                method459(field924, field963);
                                                            }
                                                            field959 = 10;
                                                            class60.field688 = 0;
                                                            Statics.field813 = null;
                                                        } else if (field966 >= 5 && (class60.field682 > field924 + 5 || class60.field682 < field924 - 5 || class60.field677 > field963 + 5 || class60.field677 < field963 - 5)) {
                                                            field965 = true;
                                                        }
                                                    }
                                                    if (class139.method2528()) {
                                                        int var72 = class139.field1981;
                                                        int var73 = class139.field1999;
                                                        class171 var74 = class171.method124(class168.field2349, field906.field1461);
                                                        var74.field2423.method2929(5);
                                                        var74.field2423.method2978(Statics.field269 + var72);
                                                        var74.field2423.method2969(class51.field579[82] ? (class51.field579[81] ? 2 : 1) : 0);
                                                        var74.field2423.method3129(Statics.field854 + var73);
                                                        field906.method1715(var74);
                                                        class139.method2529();
                                                        field955 = class60.field675;
                                                        field956 = class60.field689;
                                                        field958 = 1;
                                                        field969 = 0;
                                                        field979 = var72;
                                                        field1081 = var73;
                                                    }
                                                    if (Statics.field265 != var45) {
                                                        if (var45 != null) {
                                                            method955(var45);
                                                        }
                                                        if (Statics.field265 != null) {
                                                            method955(Statics.field265);
                                                        }
                                                    }
                                                    if (Statics.field395 != var46 && field999 == field976) {
                                                        if (var46 != null) {
                                                            method955(var46);
                                                        }
                                                        if (Statics.field395 != null) {
                                                            method955(Statics.field395);
                                                        }
                                                    }
                                                    if (Statics.field395 == null) {
                                                        if (field999 > 0) {
                                                            field999--;
                                                        }
                                                    } else if (field999 < field976) {
                                                        field999++;
                                                        if (field999 == field976) {
                                                            method955(Statics.field395);
                                                        }
                                                    }
                                                    int var75 = Statics.field3721.field1195;
                                                    int var76 = Statics.field3721.field1157;
                                                    if (Statics.field361 - var75 < -500 || Statics.field361 - var75 > 500 || Statics.field847 - var76 < -500 || Statics.field847 - var76 > 500) {
                                                        Statics.field361 = var75;
                                                        Statics.field847 = var76;
                                                    }
                                                    if (Statics.field361 != var75) {
                                                        Statics.field361 += (var75 - Statics.field361) / 16;
                                                    }
                                                    if (Statics.field847 != var76) {
                                                        Statics.field847 += (var76 - Statics.field847) / 16;
                                                    }
                                                    if (class60.field690 == 4 && Statics.field2143) {
                                                        int var77 = class60.field677 - field936;
                                                        field934 = var77 * 2;
                                                        field936 = var77 == -1 || var77 == 1 ? class60.field677 : (field936 + class60.field677) / 2;
                                                        int var78 = field935 - class60.field682;
                                                        field904 = var78 * 2;
                                                        field935 = var78 == -1 || var78 == 1 ? class60.field682 : (field935 + class60.field682) / 2;
                                                    } else {
                                                        if (class51.field579[96]) {
                                                            field904 += (-24 - field904) / 2;
                                                        } else if (class51.field579[97]) {
                                                            field904 += (24 - field904) / 2;
                                                        } else {
                                                            field904 /= 2;
                                                        }
                                                        if (class51.field579[98]) {
                                                            field934 += (12 - field934) / 2;
                                                        } else if (class51.field579[99]) {
                                                            field934 += (-12 - field934) / 2;
                                                        } else {
                                                            field934 /= 2;
                                                        }
                                                        field936 = class60.field677;
                                                        field935 = class60.field682;
                                                    }
                                                    field922 = field904 / 2 + field922 & 0x7FF;
                                                    field931 += field934 / 2;
                                                    if (field931 < 128) {
                                                        field931 = 128;
                                                    }
                                                    if (field931 > 383) {
                                                        field931 = 383;
                                                    }
                                                    int var79 = Statics.field361 >> 7;
                                                    int var80 = Statics.field847 >> 7;
                                                    int var81 = method118(Statics.field361, Statics.field847, Statics.field376);
                                                    int var82 = 0;
                                                    if (var79 > 3 && var80 > 3 && var79 < 100 && var80 < 100) {
                                                        for (int var83 = var79 - 4; var83 <= var79 + 4; var83++) {
                                                            for (int var84 = var80 - 4; var84 <= var80 + 4; var84++) {
                                                                int var85 = Statics.field376;
                                                                if (var85 < 3 && (class62.field713[1][var83][var84] & 0x2) == 2) {
                                                                    var85++;
                                                                }
                                                                int var86 = var81 - class62.field709[var85][var83][var84];
                                                                if (var86 > var82) {
                                                                    var82 = var86;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var87 = var82 * 192;
                                                    if (var87 > 98048) {
                                                        var87 = 98048;
                                                    }
                                                    if (var87 < 32768) {
                                                        var87 = 32768;
                                                    }
                                                    if (var87 > field1056) {
                                                        field1056 += (var87 - field1056) / 24;
                                                    } else if (var87 < field1056) {
                                                        field1056 += (var87 - field1056) / 80;
                                                    }
                                                    if (field1095) {
                                                        int var88 = Statics.field2118 * 128 + 64;
                                                        int var89 = Statics.field3815 * 128 + 64;
                                                        int var90 = method118(var88, var89, Statics.field376) - Statics.field371;
                                                        if (Statics.field546 < var88) {
                                                            Statics.field546 += Statics.field12 * (var88 - Statics.field546) / 1000 + Statics.field1221;
                                                            if (Statics.field546 > var88) {
                                                                Statics.field546 = var88;
                                                            }
                                                        }
                                                        if (Statics.field546 > var88) {
                                                            Statics.field546 -= Statics.field12 * (Statics.field546 - var88) / 1000 + Statics.field1221;
                                                            if (Statics.field546 < var88) {
                                                                Statics.field546 = var88;
                                                            }
                                                        }
                                                        if (Statics.field3739 < var90) {
                                                            Statics.field3739 += Statics.field12 * (var90 - Statics.field3739) / 1000 + Statics.field1221;
                                                            if (Statics.field3739 > var90) {
                                                                Statics.field3739 = var90;
                                                            }
                                                        }
                                                        if (Statics.field3739 > var90) {
                                                            Statics.field3739 -= Statics.field12 * (Statics.field3739 - var90) / 1000 + Statics.field1221;
                                                            if (Statics.field3739 < var90) {
                                                                Statics.field3739 = var90;
                                                            }
                                                        }
                                                        if (Statics.field930 < var89) {
                                                            Statics.field930 += Statics.field12 * (var89 - Statics.field930) / 1000 + Statics.field1221;
                                                            if (Statics.field930 > var89) {
                                                                Statics.field930 = var89;
                                                            }
                                                        }
                                                        if (Statics.field930 > var89) {
                                                            Statics.field930 -= Statics.field12 * (Statics.field930 - var89) / 1000 + Statics.field1221;
                                                            if (Statics.field930 < var89) {
                                                                Statics.field930 = var89;
                                                            }
                                                        }
                                                        int var91 = Statics.field1237 * 128 + 64;
                                                        int var92 = Statics.field3449 * 128 + 64;
                                                        int var93 = method118(var91, var92, Statics.field376) - Statics.field2849;
                                                        int var94 = var91 - Statics.field546;
                                                        int var95 = var93 - Statics.field3739;
                                                        int var96 = var92 - Statics.field930;
                                                        int var97 = (int) Math.sqrt((double) (var94 * var94 + var96 * var96));
                                                        int var98 = (int) (Math.atan2((double) var95, (double) var97) * 325.949D) & 0x7FF;
                                                        int var99 = (int) (Math.atan2((double) var94, (double) var96) * -325.949D) & 0x7FF;
                                                        if (var98 < 128) {
                                                            var98 = 128;
                                                        }
                                                        if (var98 > 383) {
                                                            var98 = 383;
                                                        }
                                                        if (Statics.field543 < var98) {
                                                            Statics.field543 += Statics.field2512 * (var98 - Statics.field543) / 1000 + Statics.field1210;
                                                            if (Statics.field543 > var98) {
                                                                Statics.field543 = var98;
                                                            }
                                                        }
                                                        if (Statics.field543 > var98) {
                                                            Statics.field543 -= Statics.field2512 * (Statics.field543 - var98) / 1000 + Statics.field1210;
                                                            if (Statics.field543 < var98) {
                                                                Statics.field543 = var98;
                                                            }
                                                        }
                                                        int var100 = var99 - Statics.field2909;
                                                        if (var100 > 1024) {
                                                            var100 -= 2048;
                                                        }
                                                        if (var100 < -1024) {
                                                            var100 += 2048;
                                                        }
                                                        if (var100 > 0) {
                                                            Statics.field2909 += Statics.field2512 * var100 / 1000 + Statics.field1210;
                                                            Statics.field2909 &= 0x7FF;
                                                        }
                                                        if (var100 < 0) {
                                                            Statics.field2909 -= Statics.field2512 * -var100 / 1000 + Statics.field1210;
                                                            Statics.field2909 &= 0x7FF;
                                                        }
                                                        int var101 = var99 - Statics.field2909;
                                                        if (var101 > 1024) {
                                                            var101 -= 2048;
                                                        }
                                                        if (var101 < -1024) {
                                                            var101 += 2048;
                                                        }
                                                        if (var101 < 0 && var100 > 0 || var101 > 0 && var100 < 0) {
                                                            Statics.field2909 = var99;
                                                        }
                                                    }
                                                    for (int var102 = 0; var102 < 5; var102++) {
                                                        int var10002 = field991[var102]++;
                                                    }
                                                    Statics.field2024.method1638();
                                                    int var103 = ++class60.field679 - 1;
                                                    int var105 = class51.field600;
                                                    if (var103 > 15000 && var105 > 15000) {
                                                        field907 = 250;
                                                        class60.field679 = 14500;
                                                        class171 var107 = class171.method124(class168.field2344, field906.field1461);
                                                        field906.method1715(var107);
                                                    }
                                                    for (class67 var108 = (class67) field1117.method3435(); var108 != null; var108 = (class67) field1117.method3432()) {
                                                        if ((long) var108.field762 < class183.method1711() / 1000L - 5L) {
                                                            if (var108.field763 > 0) {
                                                                class97.method4(5, "", var108.field770 + class233.field3064);
                                                            }
                                                            if (var108.field763 == 0) {
                                                                class97.method4(5, "", var108.field770 + class233.field3026);
                                                            }
                                                            var108.method3440();
                                                        }
                                                    }
                                                    field906.field1457++;
                                                    if (field906.field1457 > 50) {
                                                        class171 var109 = class171.method124(class168.field2355, field906.field1461);
                                                        field906.method1715(var109);
                                                    }
                                                    try {
                                                        field906.method1726();
                                                    } catch (IOException var111) {
                                                        method953();
                                                    }
                                                    return;
                                                }
                                                var61 = var60.field778;
                                                if (var61.field2715 < 0) {
                                                    break;
                                                }
                                                var62 = class224.method934(var61.field2733);
                                            } while (var62 == null || var62.field2838 == null || var61.field2715 >= var62.field2838.length || var62.field2838[var61.field2715] != var61);
                                            class83.method12(var60);
                                        }
                                    }
                                    var58 = var57.field778;
                                    if (var58.field2715 < 0) {
                                        break;
                                    }
                                    var59 = class224.method934(var58.field2733);
                                } while (var59 == null || var59.field2838 == null || var58.field2715 >= var59.field2838.length || var59.field2838[var58.field2715] != var58);
                                class83.method12(var57);
                            }
                        }
                        var55 = var54.field778;
                        if (var55.field2715 < 0) {
                            break;
                        }
                        var56 = class224.method934(var55.field2733);
                    } while (var56 == null || var56.field2838 == null || var55.field2715 >= var56.field2838.length || var56.field2838[var55.field2715] != var55);
                    class83.method12(var54);
                }
            }
            class171 var4 = class171.method124(class168.field2374, field906.field1461);
            var4.field2423.method2929(0);
            int var5 = var4.field2423.field2488;
            class290.method4632(var4.field2423);
            var4.field2423.method2956(var4.field2423.field2488 - var5);
            field906.method1715(var4);
        }
    }

    @ObfuscatedName("cp.fy(B)V")
    public static final void method1557() {
        if (Statics.field2864 != null) {
            Statics.field2864.method1907();
        }
        if (Statics.field15 != null) {
            Statics.field15.method1907();
        }
    }

    @ObfuscatedName("x.fr(B)V")
    public static final void method13() {
        for (int var0 = 0; var0 < field1032; var0++) {
            int var10002 = field1087[var0]--;
            if (field1087[var0] >= -10) {
                class105 var2 = field883[var0];
                if (var2 == null) {
                    class105 var10000 = (class105) null;
                    var2 = class105.method1805(Statics.field327, field957[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field1087[var0] += var2.method1792();
                    field883[var0] = var2;
                }
                if (field1087[var0] < 0) {
                    int var9;
                    if (field1093[var0] == 0) {
                        var9 = field1086;
                    } else {
                        int var3 = (field1093[var0] & 0xFF) * 128;
                        int var4 = field1093[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field3721.field1195;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field1093[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field3721.field1157;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field1087[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field1052 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class107 var10 = var2.method1791().method1846(Statics.field498);
                        class117 var11 = class117.method1978(var10, 100, var9);
                        var11.method2012(field987[var0] - 1);
                        Statics.field1088.method1774(var11);
                    }
                    field1087[var0] = -100;
                }
            } else {
                field1032--;
                for (int var1 = var0; var1 < field1032; var1++) {
                    field957[var1] = field957[var1 + 1];
                    field883[var1] = field883[var1 + 1];
                    field987[var1] = field987[var1 + 1];
                    field1087[var1] = field1087[var1 + 1];
                    field1093[var1] = field1093[var1 + 1];
                }
                var0--;
            }
        }
        if (field1085 && !class211.method208()) {
            if (field946 != 0 && field1084 != -1) {
                class211.method3796(Statics.field542, field1084, 0, field946, false);
            }
            field1085 = false;
        }
    }

    @ObfuscatedName("bt.fp(Ljh;IIIB)V")
    public static void method816(class268 arg0, int arg1, int arg2, int arg3) {
        if (field1032 >= 50 || field1052 == 0 || arg0.field3657 == null || arg1 >= arg0.field3657.length) {
            return;
        }
        int var4 = arg0.field3657[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field957[field1032] = var5;
        field987[field1032] = var6;
        field1087[field1032] = 0;
        field883[field1032] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1093[field1032] = (var8 << 16) + (var9 << 8) + var7;
        field1032++;
    }

    @ObfuscatedName("bb.fh(IB)V")
    public static void method687(int arg0) {
        if (arg0 == -1 && !field1085) {
            class211.method290();
        } else if (arg0 != -1 && field1084 != arg0 && field946 != 0 && !field1085) {
            class211.method661(2, Statics.field542, arg0, 0, field946, false);
        }
        field1084 = arg0;
    }

    @ObfuscatedName("ck.fv(I)V")
    public static final void method1609() {
        if (Statics.field376 == field1082) {
            return;
        }
        field1082 = Statics.field376;
        int var0 = Statics.field376;
        int[] var1 = Statics.field1281.field3842;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class62.field713[var0][var6][var4] & 0x18) == 0) {
                    Statics.field918.method2523(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class62.field713[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field918.method2523(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1281.method4849();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class62.field713[var0][var10][var9] & 0x18) == 0) {
                    method4449(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class62.field713[var0 + 1][var10][var9] & 0x8) != 0) {
                    method4449(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1076 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field918.method2518(Statics.field376, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class263.method2851(var14).field3511;
                    if (var15 >= 0) {
                        field1079[field1076] = Statics.field3346[var15].method3972(false);
                        field1061[field1076] = var11;
                        field892[field1076] = var12;
                        field1076++;
                    }
                }
            }
        }
        Statics.field3228.method4757();
    }

    @ObfuscatedName("cf.fi(Lhx;III)V")
    public static final void method1667(class224 arg0, int arg1, int arg2) {
        if (field1109 != 0 && field1109 != 3 || class60.field688 != 1 && Statics.field2143 || class60.field688 != 4) {
            return;
        }
        class218 var3 = arg0.method3746(true);
        if (var3 == null) {
            return;
        }
        int var4 = class60.field675 - arg1;
        int var5 = class60.field689 - arg2;
        if (!var3.method3680(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2674 / 2;
        int var7 = var5 - var3.field2673 / 2;
        int var8 = field922 & 0x7FF;
        int var9 = class136.field1939[var8];
        int var10 = class136.field1942[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field3721.field1195 + var11 >> 7;
        int var14 = Statics.field3721.field1157 - var12 >> 7;
        class171 var15 = class171.method124(class168.field2359, field906.field1461);
        var15.field2423.method2929(18);
        var15.field2423.method2978(Statics.field269 + var13);
        var15.field2423.method2969(class51.field579[82] ? (class51.field579[81] ? 2 : 1) : 0);
        var15.field2423.method3129(Statics.field854 + var14);
        var15.field2423.method2929(var6);
        var15.field2423.method2929(var7);
        var15.field2423.method2930(field922);
        var15.field2423.method2929(57);
        var15.field2423.method2929(0);
        var15.field2423.method2929(0);
        var15.field2423.method2929(89);
        var15.field2423.method2930(Statics.field3721.field1195);
        var15.field2423.method2930(Statics.field3721.field1157);
        var15.field2423.method2929(63);
        field906.method1715(var15);
        field979 = var13;
        field1081 = var14;
    }

    @ObfuscatedName("kn.fn(I)V")
    public static final void method4761() {
        int[] var0 = class95.field1402;
        for (int var1 = 0; var1 < class95.field1401; var1++) {
            class74 var2 = field1098[var0[var1]];
            if (var2 != null && var2.field1202 > 0) {
                var2.field1202--;
                if (var2.field1202 == 0) {
                    var2.field1177 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field902; var3++) {
            int var4 = field893[var3];
            class86 var5 = field874[var4];
            if (var5 != null && var5.field1202 > 0) {
                var5.field1202--;
                if (var5.field1202 == 0) {
                    var5.field1177 = null;
                }
            }
        }
    }

    @ObfuscatedName("u.fu(B)V")
    public static final void method21() {
        int var0 = class95.field1401;
        int[] var1 = class95.field1402;
        for (int var2 = 0; var2 < var0; var2++) {
            class74 var3 = field1098[var1[var2]];
            if (var3 != null) {
                method2690(var3, 1);
            }
        }
    }

    @ObfuscatedName("q.fc(I)V")
    public static final void method71() {
        for (int var0 = 0; var0 < field902; var0++) {
            int var1 = field893[var0];
            class86 var2 = field874[var1];
            if (var2 != null) {
                method2690(var2, var2.field1289.field3607);
            }
        }
    }

    @ObfuscatedName("ef.fj(Lbw;II)V")
    public static final void method2690(class78 arg0, int arg1) {
        if (arg0.field1179 > field872) {
            int var2 = arg0.field1179 - field872;
            int var3 = arg0.field1187 * 128 + arg0.field1149 * 64;
            int var4 = arg0.field1163 * 128 + arg0.field1149 * 64;
            arg0.field1195 += (var3 - arg0.field1195) / var2;
            arg0.field1157 += (var4 - arg0.field1157) / var2;
            arg0.field1203 = 0;
            arg0.field1183 = arg0.field1196;
        } else if (arg0.field1192 >= field872) {
            method2215(arg0);
        } else {
            arg0.field1174 = arg0.field1150;
            if (arg0.field1199 == 0) {
                arg0.field1203 = 0;
            } else {
                label213: {
                    if (arg0.field1158 != -1 && arg0.field1180 == 0) {
                        class268 var5 = class268.method1560(arg0.field1158);
                        if (arg0.field1204 > 0 && var5.field3665 == 0) {
                            arg0.field1203++;
                            break label213;
                        }
                        if (arg0.field1204 <= 0 && var5.field3666 == 0) {
                            arg0.field1203++;
                            break label213;
                        }
                    }
                    int var6 = arg0.field1195;
                    int var7 = arg0.field1157;
                    int var8 = arg0.field1200[arg0.field1199 - 1] * 128 + arg0.field1149 * 64;
                    int var9 = arg0.field1201[arg0.field1199 - 1] * 128 + arg0.field1149 * 64;
                    if (var6 < var8) {
                        if (var7 < var9) {
                            arg0.field1183 = 1280;
                        } else if (var7 > var9) {
                            arg0.field1183 = 1792;
                        } else {
                            arg0.field1183 = 1536;
                        }
                    } else if (var6 > var8) {
                        if (var7 < var9) {
                            arg0.field1183 = 768;
                        } else if (var7 > var9) {
                            arg0.field1183 = 256;
                        } else {
                            arg0.field1183 = 512;
                        }
                    } else if (var7 < var9) {
                        arg0.field1183 = 1024;
                    } else if (var7 > var9) {
                        arg0.field1183 = 0;
                    }
                    byte var10 = arg0.field1190[arg0.field1199 - 1];
                    if (var8 - var6 <= 256 && var8 - var6 >= -256 && var9 - var7 <= 256 && var9 - var7 >= -256) {
                        int var11 = arg0.field1183 - arg0.field1147 & 0x7FF;
                        if (var11 > 1024) {
                            var11 -= 2048;
                        }
                        int var12 = arg0.field1154;
                        if (var11 >= -256 && var11 <= 256) {
                            var12 = arg0.field1153;
                        } else if (var11 >= 256 && var11 < 768) {
                            var12 = arg0.field1156;
                        } else if (var11 >= -768 && var11 <= -256) {
                            var12 = arg0.field1155;
                        }
                        if (var12 == -1) {
                            var12 = arg0.field1153;
                        }
                        arg0.field1174 = var12;
                        int var13 = 4;
                        boolean var14 = true;
                        if (arg0 instanceof class86) {
                            var14 = ((class86) arg0).field1289.field3635;
                        }
                        if (var14) {
                            if (arg0.field1183 != arg0.field1147 && arg0.field1171 == -1 && arg0.field1198 != 0) {
                                var13 = 2;
                            }
                            if (arg0.field1199 > 2) {
                                var13 = 6;
                            }
                            if (arg0.field1199 > 3) {
                                var13 = 8;
                            }
                            if (arg0.field1203 > 0 && arg0.field1199 > 1) {
                                var13 = 8;
                                arg0.field1203--;
                            }
                        } else {
                            if (arg0.field1199 > 1) {
                                var13 = 6;
                            }
                            if (arg0.field1199 > 2) {
                                var13 = 8;
                            }
                            if (arg0.field1203 > 0 && arg0.field1199 > 1) {
                                var13 = 8;
                                arg0.field1203--;
                            }
                        }
                        if (var10 == 2) {
                            var13 <<= 0x1;
                        }
                        if (var13 >= 8 && arg0.field1174 == arg0.field1153 && arg0.field1167 != -1) {
                            arg0.field1174 = arg0.field1167;
                        }
                        if (var6 != var8 || var7 != var9) {
                            if (var6 < var8) {
                                arg0.field1195 += var13;
                                if (arg0.field1195 > var8) {
                                    arg0.field1195 = var8;
                                }
                            } else if (var6 > var8) {
                                arg0.field1195 -= var13;
                                if (arg0.field1195 < var8) {
                                    arg0.field1195 = var8;
                                }
                            }
                            if (var7 < var9) {
                                arg0.field1157 += var13;
                                if (arg0.field1157 > var9) {
                                    arg0.field1157 = var9;
                                }
                            } else if (var7 > var9) {
                                arg0.field1157 -= var13;
                                if (arg0.field1157 < var9) {
                                    arg0.field1157 = var9;
                                }
                            }
                        }
                        if (arg0.field1195 == var8 && arg0.field1157 == var9) {
                            arg0.field1199--;
                            if (arg0.field1204 > 0) {
                                arg0.field1204--;
                            }
                        }
                    } else {
                        arg0.field1195 = var8;
                        arg0.field1157 = var9;
                        arg0.field1199--;
                        if (arg0.field1204 > 0) {
                            arg0.field1204--;
                        }
                    }
                }
            }
        }
        if (arg0.field1195 < 128 || arg0.field1157 < 128 || arg0.field1195 >= 13184 || arg0.field1157 >= 13184) {
            arg0.field1158 = -1;
            arg0.field1182 = -1;
            arg0.field1179 = 0;
            arg0.field1192 = 0;
            arg0.field1195 = arg0.field1200[0] * 128 + arg0.field1149 * 64;
            arg0.field1157 = arg0.field1201[0] * 128 + arg0.field1149 * 64;
            arg0.method1386();
        }
        if (Statics.field3721 == arg0 && (arg0.field1195 < 1536 || arg0.field1157 < 1536 || arg0.field1195 >= 11776 || arg0.field1157 >= 11776)) {
            arg0.field1158 = -1;
            arg0.field1182 = -1;
            arg0.field1179 = 0;
            arg0.field1192 = 0;
            arg0.field1195 = arg0.field1200[0] * 128 + arg0.field1149 * 64;
            arg0.field1157 = arg0.field1201[0] * 128 + arg0.field1149 * 64;
            arg0.method1386();
        }
        method19(arg0);
        method914(arg0);
    }

    @ObfuscatedName("di.fb(Lbw;I)V")
    public static final void method2215(class78 arg0) {
        if (field872 == arg0.field1192 || arg0.field1158 == -1 || arg0.field1180 != 0 || arg0.field1145 + 1 > class268.method1560(arg0.field1158).field3656[arg0.field1178]) {
            int var1 = arg0.field1192 - arg0.field1179;
            int var2 = field872 - arg0.field1179;
            int var3 = arg0.field1187 * 128 + arg0.field1149 * 64;
            int var4 = arg0.field1163 * 128 + arg0.field1149 * 64;
            int var5 = arg0.field1175 * 128 + arg0.field1149 * 64;
            int var6 = arg0.field1165 * 128 + arg0.field1149 * 64;
            arg0.field1195 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1157 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1203 = 0;
        arg0.field1183 = arg0.field1196;
        arg0.field1147 = arg0.field1183;
    }

    @ObfuscatedName("u.fa(Lbw;I)V")
    public static final void method19(class78 arg0) {
        if (arg0.field1198 == 0) {
            return;
        }
        if (arg0.field1171 != -1) {
            class78 var1 = null;
            if (arg0.field1171 < 32768) {
                var1 = field874[arg0.field1171];
            } else if (arg0.field1171 >= 32768) {
                var1 = field1098[arg0.field1171 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1195 - var1.field1195;
                int var3 = arg0.field1157 - var1.field1157;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1183 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1188) {
                arg0.field1171 = -1;
                arg0.field1188 = false;
            }
        }
        if (arg0.field1173 != -1 && (arg0.field1199 == 0 || arg0.field1203 > 0)) {
            arg0.field1183 = arg0.field1173;
            arg0.field1173 = -1;
        }
        int var4 = arg0.field1183 - arg0.field1147 & 0x7FF;
        if (var4 == 0 && arg0.field1188) {
            arg0.field1171 = -1;
            arg0.field1188 = false;
        }
        if (var4 == 0) {
            arg0.field1161 = 0;
            return;
        }
        arg0.field1161++;
        if (var4 > 1024) {
            arg0.field1147 -= arg0.field1198;
            boolean var5 = true;
            if (var4 < arg0.field1198 || var4 > 2048 - arg0.field1198) {
                arg0.field1147 = arg0.field1183;
                var5 = false;
            }
            if (arg0.field1174 == arg0.field1150 && (arg0.field1161 > 25 || var5)) {
                if (arg0.field1151 == -1) {
                    arg0.field1174 = arg0.field1153;
                } else {
                    arg0.field1174 = arg0.field1151;
                }
            }
        } else {
            arg0.field1147 += arg0.field1198;
            boolean var6 = true;
            if (var4 < arg0.field1198 || var4 > 2048 - arg0.field1198) {
                arg0.field1147 = arg0.field1183;
                var6 = false;
            }
            if (arg0.field1174 == arg0.field1150 && (arg0.field1161 > 25 || var6)) {
                if (arg0.field1172 == -1) {
                    arg0.field1174 = arg0.field1153;
                } else {
                    arg0.field1174 = arg0.field1172;
                }
            }
        }
        arg0.field1147 &= 0x7FF;
    }

    @ObfuscatedName("bk.fe(Lbw;I)V")
    public static final void method914(class78 arg0) {
        arg0.field1148 = false;
        if (arg0.field1174 != -1) {
            class268 var1 = class268.method1560(arg0.field1174);
            if (var1 == null || var1.field3661 == null) {
                arg0.field1174 = -1;
            } else {
                arg0.field1176++;
                if (arg0.field1181 < var1.field3661.length && arg0.field1176 > var1.field3656[arg0.field1181]) {
                    arg0.field1176 = 1;
                    arg0.field1181++;
                    method816(var1, arg0.field1181, arg0.field1195, arg0.field1157);
                }
                if (arg0.field1181 >= var1.field3661.length) {
                    arg0.field1176 = 0;
                    arg0.field1181 = 0;
                    method816(var1, arg0.field1181, arg0.field1195, arg0.field1157);
                }
            }
        }
        if (arg0.field1182 != -1 && field872 >= arg0.field1185) {
            if (arg0.field1191 < 0) {
                arg0.field1191 = 0;
            }
            int var2 = class253.method3933(arg0.field1182).field3388;
            if (var2 == -1) {
                arg0.field1182 = -1;
            } else {
                class268 var3 = class268.method1560(var2);
                if (var3 == null || var3.field3661 == null) {
                    arg0.field1182 = -1;
                } else {
                    arg0.field1184++;
                    if (arg0.field1191 < var3.field3661.length && arg0.field1184 > var3.field3656[arg0.field1191]) {
                        arg0.field1184 = 1;
                        arg0.field1191++;
                        method816(var3, arg0.field1191, arg0.field1195, arg0.field1157);
                    }
                    if (arg0.field1191 >= var3.field3661.length && (arg0.field1191 < 0 || arg0.field1191 >= var3.field3661.length)) {
                        arg0.field1182 = -1;
                    }
                }
            }
        }
        if (arg0.field1158 != -1 && arg0.field1180 <= 1) {
            class268 var4 = class268.method1560(arg0.field1158);
            if (var4.field3665 == 1 && arg0.field1204 > 0 && arg0.field1179 <= field872 && arg0.field1192 < field872) {
                arg0.field1180 = 1;
                return;
            }
        }
        if (arg0.field1158 != -1 && arg0.field1180 == 0) {
            class268 var5 = class268.method1560(arg0.field1158);
            if (var5 == null || var5.field3661 == null) {
                arg0.field1158 = -1;
            } else {
                arg0.field1145++;
                if (arg0.field1178 < var5.field3661.length && arg0.field1145 > var5.field3656[arg0.field1178]) {
                    arg0.field1145 = 1;
                    arg0.field1178++;
                    method816(var5, arg0.field1178, arg0.field1195, arg0.field1157);
                }
                if (arg0.field1178 >= var5.field3661.length) {
                    arg0.field1178 -= var5.field3658;
                    arg0.field1189++;
                    if (arg0.field1189 >= var5.field3654) {
                        arg0.field1158 = -1;
                    } else if (arg0.field1178 >= 0 && arg0.field1178 < var5.field3661.length) {
                        method816(var5, arg0.field1178, arg0.field1195, arg0.field1157);
                    } else {
                        arg0.field1158 = -1;
                    }
                }
                arg0.field1148 = var5.field3660;
            }
        }
        if (arg0.field1180 > 0) {
            arg0.field1180--;
        }
    }

    @ObfuscatedName("bx.fz(Lbd;III)V")
    public static void method962(class74 arg0, int arg1, int arg2) {
        if (arg0.field1158 == arg1 && arg1 != -1) {
            int var3 = class268.method1560(arg1).field3667;
            if (var3 == 1) {
                arg0.field1178 = 0;
                arg0.field1145 = 0;
                arg0.field1180 = arg2;
                arg0.field1189 = 0;
            }
            if (var3 == 2) {
                arg0.field1189 = 0;
            }
        } else if (arg1 == -1 || arg0.field1158 == -1 || class268.method1560(arg1).field3659 >= class268.method1560(arg0.field1158).field3659) {
            arg0.field1158 = arg1;
            arg0.field1178 = 0;
            arg0.field1145 = 0;
            arg0.field1180 = arg2;
            arg0.field1189 = 0;
            arg0.field1204 = arg0.field1199;
        }
    }

    @ObfuscatedName("bj.fo(I)I")
    public static int method1384() {
        return field942 ? 2 : 1;
    }

    @ObfuscatedName("cg.fq(II)V")
    public static void method1418(int arg0) {
        field1017 = 0L;
        if (arg0 >= 2) {
            field942 = true;
        } else {
            field942 = false;
        }
        if (method1384() == 1) {
            Statics.field3803.method710(765, 503);
        } else {
            Statics.field3803.method710(7680, 2160);
        }
        if (field870 >= 25) {
            method1446();
        }
    }

    @ObfuscatedName("cg.fd(I)V")
    public static void method1446() {
        class171 var0 = class171.method124(class168.field2390, field906.field1461);
        var0.field2423.method2929(method1384());
        var0.field2423.method2930(Statics.field764);
        var0.field2423.method2930(Statics.field1394);
        field906.method1715(var0);
    }

    @ObfuscatedName("client.v(I)V")
    public final void method717() {
        field1017 = class183.method1711() + 500L;
        this.method1029();
        if (field1008 != -1) {
            this.method1035(true);
        }
    }

    @ObfuscatedName("client.ff(I)V")
    public void method1029() {
        int var1 = Statics.field764;
        int var2 = Statics.field1394;
        if (this.field653 < var1) {
            int var3 = this.field653;
        }
        if (this.field663 < var2) {
            int var4 = this.field663;
        }
        if (Statics.field801 != null) {
            try {
                class53.method647(Statics.field3803, "resize", new Object[] { method1384() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.fs(B)V")
    public final void method1030() {
        if (field1008 != -1) {
            int var1 = field1008;
            if (class224.method936(var1)) {
                method22(Statics.field2807[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field1051; var2++) {
            if (field1053[var2]) {
                field1054[var2] = true;
            }
            field873[var2] = field1053[var2];
            field1053[var2] = false;
        }
        field867 = field872;
        field997 = -1;
        field1125 = -1;
        Statics.field2710 = null;
        if (field1008 != -1) {
            field1051 = 0;
            method522(field1008, 0, 0, Statics.field764, Statics.field1394, 0, 0, -1);
        }
        class291.method4662();
        if (field964) {
            int var9 = Statics.field574;
            int var10 = Statics.field2400;
            int var11 = Statics.field1283;
            int var12 = Statics.field329;
            int var13 = 6116423;
            class291.method4671(var9, var10, var11, var12, var13);
            class291.method4671(var9 + 1, var10 + 1, var11 - 2, 16, 0);
            class291.method4678(var9 + 1, var10 + 18, var11 - 2, var12 - 19, 0);
            Statics.field910.method4464(class233.field3035, var9 + 3, var10 + 14, var13, -1);
            int var14 = class60.field682;
            int var15 = class60.field677;
            for (int var16 = 0; var16 < field1044; var16++) {
                int var17 = (field1044 - 1 - var16) * 15 + var10 + 31;
                int var18 = 16777215;
                if (var14 > var9 && var14 < var9 + var11 && var15 > var17 - 13 && var15 < var17 + 3) {
                    var18 = 16776960;
                }
                class271 var19 = Statics.field910;
                String var20;
                if (var16 < 0) {
                    var20 = "";
                } else if (field993[var16].length() > 0) {
                    var20 = field1078[var16] + class233.field2971 + field993[var16];
                } else {
                    var20 = field1078[var16];
                }
                var19.method4464(var20, var9 + 3, var17, var18, 0);
            }
            method3177(Statics.field574, Statics.field2400, Statics.field1283, Statics.field329);
        } else if (field997 != -1) {
            int var3 = field997;
            int var4 = field1125;
            if (field1044 >= 2 || field1001 != 0 || field1003) {
                int var5 = field1044 - 1;
                String var7;
                if (field1001 == 1 && field1044 < 2) {
                    var7 = class233.field3067 + class233.field2971 + field1002 + " " + class88.field1306;
                } else if (field1003 && field1044 < 2) {
                    var7 = field1046 + class233.field2971 + field949 + " " + class88.field1306;
                } else {
                    String var8;
                    if (var5 < 0) {
                        var8 = "";
                    } else if (field993[var5].length() > 0) {
                        var8 = field1078[var5] + class233.field2971 + field993[var5];
                    } else {
                        var8 = field1078[var5];
                    }
                    var7 = var8;
                }
                if (field1044 > 2) {
                    var7 = var7 + class88.method3736(16777215) + " " + '/' + " " + (field1044 - 2) + class233.field3071;
                }
                Statics.field910.method4472(var7, var3 + 4, var4 + 15, 16777215, 0, field872 / 1000);
            }
        }
        if (field888 == 3) {
            for (int var21 = 0; var21 < field1051; var21++) {
                if (field873[var21]) {
                    class291.method4670(field1007[var21], field1057[var21], field1045[var21], field1059[var21], 16711935, 128);
                } else if (field1054[var21]) {
                    class291.method4670(field1007[var21], field1057[var21], field1045[var21], field1059[var21], 16711680, 128);
                }
            }
        }
        class82.method207(Statics.field376, Statics.field3721.field1195, Statics.field3721.field1157, field923);
        field923 = 0;
    }

    @ObfuscatedName("fw.fm(Ljava/lang/String;ZI)V")
    public static final void method2802(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1818.method4514(arg0, 250);
        int var6 = Statics.field1818.method4462(arg0, 250) * 13;
        class291.method4671(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class291.method4678(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1818.method4468(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1380(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field3228.method704(0, 0);
        } else {
            method3177(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("it.gz(IIIII)V")
    public static final void method3947(int arg0, int arg1, int arg2, int arg3) {
        field952++;
        if (Statics.field3721.field1195 >> 7 == field979 && Statics.field3721.field1157 >> 7 == field1081) {
            field979 = 0;
        }
        method1669();
        if (field1071 >= 0 && field1098[field1071] != null) {
            method429(field1098[field1071], false);
        }
        method1008(true);
        int var4 = class95.field1401;
        int[] var5 = class95.field1402;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field1071 != var5[var6] && field989 != var5[var6]) {
                method429(field1098[var5[var6]], true);
            }
        }
        method1008(false);
        for (class93 var7 = (class93) field947.method3405(); var7 != null; var7 = (class93) field947.method3414()) {
            if (Statics.field376 != var7.field1378 || field872 > var7.field1373) {
                var7.method3392();
            } else if (field872 >= var7.field1372) {
                if (var7.field1376 > 0) {
                    class86 var8 = field874[var7.field1376 - 1];
                    if (var8 != null && var8.field1195 >= 0 && var8.field1195 < 13312 && var8.field1157 >= 0 && var8.field1157 < 13312) {
                        var7.method1615(var8.field1195, var8.field1157, method118(var8.field1195, var8.field1157, var7.field1378) - var7.field1371, field872);
                    }
                }
                if (var7.field1376 < 0) {
                    int var9 = -var7.field1376 - 1;
                    class74 var10;
                    if (field989 == var9) {
                        var10 = Statics.field3721;
                    } else {
                        var10 = field1098[var9];
                    }
                    if (var10 != null && var10.field1195 >= 0 && var10.field1195 < 13312 && var10.field1157 >= 0 && var10.field1157 < 13312) {
                        var7.method1615(var10.field1195, var10.field1157, method118(var10.field1195, var10.field1157, var7.field1378) - var7.field1371, field872);
                    }
                }
                var7.method1611(field923);
                Statics.field918.method2500(Statics.field376, (int) var7.field1370, (int) var7.field1385, (int) var7.field1380, 60, var7, var7.field1383, -1, false);
            }
        }
        for (class84 var11 = (class84) field981.method3405(); var11 != null; var11 = (class84) field981.method3414()) {
            if (Statics.field376 != var11.field1270 || var11.field1279) {
                var11.method3392();
            } else if (field872 >= var11.field1282) {
                var11.method1521(field923);
                if (var11.field1279) {
                    var11.method3392();
                } else {
                    Statics.field918.method2500(var11.field1270, var11.field1273, var11.field1274, var11.field1275, 60, var11, 0, -1, false);
                }
            }
        }
        method2188(arg0, arg1, arg2, arg3, true);
        int var12 = field1100;
        int var13 = field1110;
        int var14 = field1111;
        int var15 = field909;
        class291.method4712(var12, var13, var12 + var14, var13 + var15);
        class136.method2402();
        if (!field1095) {
            int var16 = field931;
            if (field1056 / 256 > var16) {
                var16 = field1056 / 256;
            }
            if (field1096[4] && field1075[4] + 128 > var16) {
                var16 = field1075[4] + 128;
            }
            int var17 = field922 & 0x7FF;
            method103(Statics.field361, method118(Statics.field3721.field1195, Statics.field3721.field1157, Statics.field376) - field903, Statics.field847, var16, var17, var16 * 3 + 600);
        }
        int var30;
        if (field1095) {
            var30 = method996();
        } else {
            int var18;
            if (Statics.field801.field1235) {
                var18 = Statics.field376;
            } else {
                label495: {
                    int var19 = 3;
                    if (Statics.field543 < 310) {
                        int var20 = Statics.field546 >> 7;
                        int var21 = Statics.field930 >> 7;
                        int var22 = Statics.field3721.field1195 >> 7;
                        int var23 = Statics.field3721.field1157 >> 7;
                        if (var20 < 0 || var21 < 0 || var20 >= 104 || var21 >= 104) {
                            var18 = Statics.field376;
                            break label495;
                        }
                        if ((class62.field713[Statics.field376][var20][var21] & 0x4) != 0) {
                            var19 = Statics.field376;
                        }
                        int var24;
                        if (var22 > var20) {
                            var24 = var22 - var20;
                        } else {
                            var24 = var20 - var22;
                        }
                        int var25;
                        if (var23 > var21) {
                            var25 = var23 - var21;
                        } else {
                            var25 = var21 - var23;
                        }
                        if (var24 > var25) {
                            int var26 = var25 * 65536 / var24;
                            int var27 = 32768;
                            while (var20 != var22) {
                                if (var20 < var22) {
                                    var20++;
                                } else if (var20 > var22) {
                                    var20--;
                                }
                                if ((class62.field713[Statics.field376][var20][var21] & 0x4) != 0) {
                                    var19 = Statics.field376;
                                }
                                var27 += var26;
                                if (var27 >= 65536) {
                                    var27 -= 65536;
                                    if (var21 < var23) {
                                        var21++;
                                    } else if (var21 > var23) {
                                        var21--;
                                    }
                                    if ((class62.field713[Statics.field376][var20][var21] & 0x4) != 0) {
                                        var19 = Statics.field376;
                                    }
                                }
                            }
                        } else {
                            int var28 = var24 * 65536 / var25;
                            int var29 = 32768;
                            while (var21 != var23) {
                                if (var21 < var23) {
                                    var21++;
                                } else if (var21 > var23) {
                                    var21--;
                                }
                                if ((class62.field713[Statics.field376][var20][var21] & 0x4) != 0) {
                                    var19 = Statics.field376;
                                }
                                var29 += var28;
                                if (var29 >= 65536) {
                                    var29 -= 65536;
                                    if (var20 < var22) {
                                        var20++;
                                    } else if (var20 > var22) {
                                        var20--;
                                    }
                                    if ((class62.field713[Statics.field376][var20][var21] & 0x4) != 0) {
                                        var19 = Statics.field376;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field3721.field1195 >= 0 && Statics.field3721.field1157 >= 0 && Statics.field3721.field1195 < 13312 && Statics.field3721.field1157 < 13312) {
                        if ((class62.field713[Statics.field376][Statics.field3721.field1195 >> 7][Statics.field3721.field1157 >> 7] & 0x4) != 0) {
                            var19 = Statics.field376;
                        }
                        var18 = var19;
                    } else {
                        var18 = Statics.field376;
                    }
                }
            }
            var30 = var18;
        }
        int var31 = Statics.field546;
        int var32 = Statics.field3739;
        int var33 = Statics.field930;
        int var34 = Statics.field543;
        int var35 = Statics.field2909;
        for (int var36 = 0; var36 < 5; var36++) {
            if (field1096[var36]) {
                int var37 = (int) (Math.random() * (double) (field869[var36] * 2 + 1) - (double) field869[var36] + Math.sin((double) field1099[var36] / 100.0D * (double) field991[var36]) * (double) field1075[var36]);
                if (var36 == 0) {
                    Statics.field546 += var37;
                }
                if (var36 == 1) {
                    Statics.field3739 += var37;
                }
                if (var36 == 2) {
                    Statics.field930 += var37;
                }
                if (var36 == 3) {
                    Statics.field2909 = Statics.field2909 + var37 & 0x7FF;
                }
                if (var36 == 4) {
                    Statics.field543 += var37;
                    if (Statics.field543 < 128) {
                        Statics.field543 = 128;
                    }
                    if (Statics.field543 > 383) {
                        Statics.field543 = 383;
                    }
                }
            }
        }
        int var38 = class60.field682;
        int var39 = class60.field677;
        if (class60.field688 != 0) {
            var38 = class60.field675;
            var39 = class60.field689;
        }
        if (var38 >= var12 && var38 < var12 + var14 && var39 >= var13 && var39 < var13 + var15) {
            class134.method1689(var38 - var12, var39 - var13);
        } else {
            class134.field1904 = false;
            class134.field1908 = 0;
        }
        method1557();
        class291.method4671(var12, var13, var14, var15, 0);
        method1557();
        int var40 = class136.field1927;
        class136.field1927 = field1113;
        Statics.field918.method2530(Statics.field546, Statics.field3739, Statics.field930, Statics.field543, Statics.field2909, var30);
        class8.method166();
        class136.field1927 = var40;
        method1557();
        Statics.field918.method2503();
        field941 = 0;
        boolean var41 = false;
        int var42 = -1;
        int var43 = class95.field1401;
        int[] var44 = class95.field1402;
        for (int var45 = 0; var45 < field902 + var43; var45++) {
            class78 var46;
            if (var45 < var43) {
                var46 = field1098[var44[var45]];
                if (field1071 == var44[var45]) {
                    var41 = true;
                    var42 = var45;
                    continue;
                }
            } else {
                var46 = field874[field893[var45 - var43]];
            }
            method2882(var46, var45, var12, var13, var14, var15);
        }
        if (var41) {
            method2882(field1098[field1071], var42, var12, var13, var14, var15);
        }
        for (int var47 = 0; var47 < field941; var47++) {
            int var48 = field943[var47];
            int var49 = field1121[var47];
            int var50 = field905[var47];
            int var51 = field945[var47];
            boolean var52 = true;
            while (var52) {
                var52 = false;
                for (int var53 = 0; var53 < var47; var53++) {
                    if (var49 + 2 > field1121[var53] - field945[var53] && var49 - var51 < field1121[var53] + 2 && var48 - var50 < field943[var53] + field905[var53] && var48 + var50 > field943[var53] - field905[var53] && field1121[var53] - field945[var53] < var49) {
                        var49 = field1121[var53] - field945[var53];
                        var52 = true;
                    }
                }
            }
            field992 = field943[var47];
            field954 = field1121[var47] = var49;
            String var54 = field950[var47];
            if (field1010 == 0) {
                int var55 = 16776960;
                if (field901[var47] < 6) {
                    var55 = field1063[field901[var47]];
                }
                if (field901[var47] == 6) {
                    var55 = field952 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field901[var47] == 7) {
                    var55 = field952 % 20 < 10 ? 255 : 65535;
                }
                if (field901[var47] == 8) {
                    var55 = field952 % 20 < 10 ? 45056 : 8454016;
                }
                if (field901[var47] == 9) {
                    int var56 = 150 - field932[var47];
                    if (var56 < 50) {
                        var55 = var56 * 1280 + 16711680;
                    } else if (var56 < 100) {
                        var55 = 16776960 - (var56 - 50) * 327680;
                    } else if (var56 < 150) {
                        var55 = (var56 - 100) * 5 + 65280;
                    }
                }
                if (field901[var47] == 10) {
                    int var57 = 150 - field932[var47];
                    if (var57 < 50) {
                        var55 = var57 * 5 + 16711680;
                    } else if (var57 < 100) {
                        var55 = 16711935 - (var57 - 50) * 327680;
                    } else if (var57 < 150) {
                        var55 = (var57 - 100) * 327680 + 255 - (var57 - 100) * 5;
                    }
                }
                if (field901[var47] == 11) {
                    int var58 = 150 - field932[var47];
                    if (var58 < 50) {
                        var55 = 16777215 - var58 * 327685;
                    } else if (var58 < 100) {
                        var55 = (var58 - 50) * 327685 + 65280;
                    } else if (var58 < 150) {
                        var55 = 16777215 - (var58 - 100) * 327680;
                    }
                }
                if (field948[var47] == 0) {
                    Statics.field910.method4467(var54, field992 + var12, field954 + var13, var55, 0);
                }
                if (field948[var47] == 1) {
                    Statics.field910.method4469(var54, field992 + var12, field954 + var13, var55, 0, field952);
                }
                if (field948[var47] == 2) {
                    Statics.field910.method4470(var54, field992 + var12, field954 + var13, var55, 0, field952);
                }
                if (field948[var47] == 3) {
                    Statics.field910.method4471(var54, field992 + var12, field954 + var13, var55, 0, field952, 150 - field932[var47]);
                }
                if (field948[var47] == 4) {
                    int var59 = (150 - field932[var47]) * (Statics.field910.method4482(var54) + 100) / 150;
                    class291.method4694(field992 + var12 - 50, var13, field992 + var12 + 50, var13 + var15);
                    Statics.field910.method4464(var54, field992 + var12 + 50 - var59, field954 + var13, var55, 0);
                    class291.method4712(var12, var13, var12 + var14, var13 + var15);
                }
                if (field948[var47] == 5) {
                    int var60 = 150 - field932[var47];
                    int var61 = 0;
                    if (var60 < 25) {
                        var61 = var60 - 25;
                    } else if (var60 > 125) {
                        var61 = var60 - 125;
                    }
                    class291.method4694(var12, field954 + var13 - Statics.field910.field3692 - 1, var12 + var14, field954 + var13 + 5);
                    Statics.field910.method4467(var54, field992 + var12, field954 + var13 + var61, var55, 0);
                    class291.method4712(var12, var13, var12 + var14, var13 + var15);
                }
            } else {
                Statics.field910.method4467(var54, field992 + var12, field954 + var13, 16776960, 0);
            }
        }
        method2857(var12, var13);
        ((class125) Statics.field1938).method2195(field923);
        method461(var12, var13, var14, var15);
        Statics.field546 = var31;
        Statics.field3739 = var32;
        Statics.field930 = var33;
        Statics.field543 = var34;
        Statics.field2909 = var35;
        if (field1006) {
            byte var62 = 0;
            int var63 = class246.field3311 + class246.field3309 + var62;
            if (var63 == 0) {
                field1006 = false;
            }
        }
        if (field1006) {
            class291.method4671(var12, var13, var14, var15, 0);
            method2802(class233.field2927, false);
        }
    }

    @ObfuscatedName("dx.gj(IIIIZI)V")
    public static final void method2188(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1102 - field1101) * var5 / 100 + field1101;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1107) {
            short var8 = field1107;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1106) {
                var6 = field1106;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class291.method4662();
                    class291.method4671(arg0, arg1, var10, arg3, -16777216);
                    class291.method4671(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field1108) {
            short var11 = field1108;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field1105) {
                var6 = field1105;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class291.method4662();
                    class291.method4671(arg0, arg1, arg2, var13, -16777216);
                    class291.method4671(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1104 - field1103) * var5 / 100 + field1103;
        field1113 = arg3 * var6 * var14 / 85504 << 1;
        if (field1111 != arg2 || field909 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class136.field1939[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class139.method2524(var15, 500, 800, arg2, arg3);
        }
        field1100 = arg0;
        field1110 = arg1;
        field1111 = arg2;
        field909 = arg3;
    }

    @ObfuscatedName("cf.ge(I)V")
    public static void method1669() {
        method429(Statics.field3721, false);
    }

    @ObfuscatedName("ao.gf(Lbd;ZI)V")
    public static void method429(class74 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method987() || arg0.field821) {
            return;
        }
        int var2 = arg0.field835 << 14;
        arg0.field833 = false;
        if ((field868 && class95.field1401 > 50 || class95.field1401 > 200) && arg1 && arg0.field1174 == arg0.field1150) {
            arg0.field833 = true;
        }
        int var3 = arg0.field1195 >> 7;
        int var4 = arg0.field1157 >> 7;
        if (var3 < 0 || var3 >= 104 || var4 < 0 || var4 >= 104) {
            return;
        }
        if (arg0.field828 != null && field872 >= arg0.field840 && field872 < arg0.field838) {
            arg0.field833 = false;
            arg0.field822 = method118(arg0.field1195, arg0.field1157, Statics.field376);
            Statics.field918.method2493(Statics.field376, arg0.field1195, arg0.field1157, arg0.field822, 60, arg0, arg0.field1147, var2, arg0.field829, arg0.field830, arg0.field831, arg0.field832);
            return;
        }
        if ((arg0.field1195 & 0x7F) == 64 && (arg0.field1157 & 0x7F) == 64) {
            if (field952 == field921[var3][var4]) {
                return;
            }
            field921[var3][var4] = field952;
        }
        arg0.field822 = method118(arg0.field1195, arg0.field1157, Statics.field376);
        Statics.field918.method2500(Statics.field376, arg0.field1195, arg0.field1157, arg0.field822, 60, arg0, arg0.field1147, var2, arg0.field1148);
    }

    @ObfuscatedName("bd.gd(ZI)V")
    public static final void method1008(boolean arg0) {
        for (int var1 = 0; var1 < field902; var1++) {
            class86 var2 = field874[field893[var1]];
            int var3 = (field893[var1] << 14) + 536870912;
            if (var2 != null && var2.method987() && var2.field1289.field3626 == arg0 && var2.field1289.method4334()) {
                int var4 = var2.field1195 >> 7;
                int var5 = var2.field1157 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1149 == 1 && (var2.field1195 & 0x7F) == 64 && (var2.field1157 & 0x7F) == 64) {
                        if (field952 == field921[var4][var5]) {
                            continue;
                        }
                        field921[var4][var5] = field952;
                    }
                    if (!var2.field1289.field3612) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field918.method2500(Statics.field376, var2.field1195, var2.field1157, method118(var2.field1195 + (var2.field1149 * 64 - 64), var2.field1157 + (var2.field1149 * 64 - 64), Statics.field376), var2.field1149 * 64 - 64 + 60, var2, var2.field1147, var3, var2.field1148);
                }
            }
        }
    }

    @ObfuscatedName("bd.gi(I)I")
    public static final int method996() {
        if (Statics.field801.field1235) {
            return Statics.field376;
        } else {
            int var0 = method118(Statics.field546, Statics.field930, Statics.field376);
            return var0 - Statics.field3739 >= 800 || (class62.field713[Statics.field376][Statics.field546 >> 7][Statics.field930 >> 7] & 0x4) == 0 ? 3 : Statics.field376;
        }
    }

    @ObfuscatedName("fc.gl(III)V")
    public static final void method2857(int arg0, int arg1) {
        if (field880 == 2) {
            method2855((field1073 - Statics.field269 << 7) + field886, (field884 - Statics.field854 << 7) + field887, field1028 * 2);
            if (field992 > -1 && field872 % 20 < 10) {
                Statics.field3680[0].method4793(field992 + arg0 - 12, field954 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("fj.ga(Lbw;IIIIIB)V")
    public static final void method2882(class78 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method987()) {
            return;
        }
        if (arg0 instanceof class86) {
            class266 var6 = ((class86) arg0).field1289;
            if (var6.field3633 != null) {
                var6 = var6.method4333();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class95.field1401;
        int[] var8 = class95.field1402;
        int var9 = 3;
        if (!arg0.field1170.method3365()) {
            method1382(arg0, arg0.field1152 + 15);
            for (class85 var10 = (class85) arg0.field1170.method3362(); var10 != null; var10 = (class85) arg0.field1170.method3364()) {
                class79 var11 = var10.method1532(field872);
                if (var11 != null) {
                    class256 var12 = var10.field1284;
                    class295 var13 = var12.method4090();
                    class295 var14 = var12.method4082();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3423;
                    } else {
                        if (var12.field3424 * 2 < var14.field3845) {
                            var15 = var12.field3424;
                        }
                        var16 = var14.field3845 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field872 - var11.field1208;
                    int var20 = var11.field1207 * var16 / var12.field3423;
                    int var23;
                    if (var11.field1211 > var19) {
                        int var21 = var12.field3413 == 0 ? 0 : var19 / var12.field3413 * var12.field3413;
                        int var22 = var11.field1206 * var16 / var12.field3423;
                        var23 = (var20 - var22) * var21 / var11.field1211 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1211 + var12.field3412 - var19;
                        if (var12.field3418 >= 0) {
                            var17 = (var24 << 8) / (var12.field3412 - var12.field3418);
                        }
                    }
                    if (var11.field1207 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field992 + arg2 - (var16 >> 1);
                    int var26 = field954 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field992 > -1) {
                            class291.method4671(var25, var26, var23, 5, 65280);
                            class291.method4671(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                            var13.method4859(var27, var26, var17);
                            class291.method4694(var27, var26, var27 + var28, var26 + var29);
                            var14.method4859(var27, var26, var17);
                        } else {
                            var13.method4793(var27, var26);
                            class291.method4694(var27, var26, var27 + var28, var26 + var29);
                            var14.method4793(var27, var26);
                        }
                        class291.method4712(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1528()) {
                    var10.method3392();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class74 var30 = (class74) arg0;
            if (var30.field821) {
                return;
            }
            if (var30.field826 != -1 || var30.field818 != -1) {
                method1382(arg0, arg0.field1152 + 15);
                if (field992 > -1) {
                    if (var30.field826 != -1) {
                        Statics.field765[var30.field826].method4793(field992 + arg2 - 12, field954 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field818 != -1) {
                        Statics.field3331[var30.field818].method4793(field992 + arg2 - 12, field954 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field880 == 10 && field882 == var8[arg1]) {
                method1382(arg0, arg0.field1152 + 15);
                if (field992 > -1) {
                    Statics.field3680[1].method4793(field992 + arg2 - 12, field954 + arg3 - var9);
                }
            }
        } else {
            class266 var31 = ((class86) arg0).field1289;
            if (var31.field3633 != null) {
                var31 = var31.method4333();
            }
            if (var31.field3629 >= 0 && var31.field3629 < Statics.field3331.length) {
                method1382(arg0, arg0.field1152 + 15);
                if (field992 > -1) {
                    Statics.field3331[var31.field3629].method4793(field992 + arg2 - 12, field954 + arg3 - 30);
                }
            }
            if (field880 == 1 && field881 == field893[arg1 - var7] && field872 % 20 < 10) {
                method1382(arg0, arg0.field1152 + 15);
                if (field992 > -1) {
                    Statics.field3680[0].method4793(field992 + arg2 - 12, field954 + arg3 - 28);
                }
            }
        }
        if (arg0.field1177 != null && (arg1 >= var7 || !arg0.field1160 && (field1064 == 4 || !arg0.field1159 && (field1064 == 0 || field1064 == 3 || field1064 == 1 && method1520(((class74) arg0).field823, false))))) {
            method1382(arg0, arg0.field1152);
            if (field992 > -1 && field941 < field1055) {
                field905[field941] = Statics.field910.method4482(arg0.field1177) / 2;
                field945[field941] = Statics.field910.field3692;
                field943[field941] = field992;
                field1121[field941] = field954;
                field901[field941] = arg0.field1162;
                field948[field941] = arg0.field1146;
                field932[field941] = arg0.field1202;
                field950[field941] = arg0.field1177;
                field941++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1197[var32];
            int var34 = arg0.field1164[var32];
            class262 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field872) {
                    continue;
                }
                var35 = class262.method852(arg0.field1164[var32]);
                var36 = var35.field3471;
                if (var35 != null && var35.field3482 != null) {
                    var35 = var35.method4172();
                    if (var35 == null) {
                        arg0.field1197[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1168[var32];
            class262 var38 = null;
            if (var37 >= 0) {
                var38 = class262.method852(var37);
                if (var38 != null && var38.field3482 != null) {
                    var38 = var38.method4172();
                }
            }
            if (var33 - var36 <= field872) {
                if (var35 == null) {
                    arg0.field1197[var32] = -1;
                } else {
                    method1382(arg0, arg0.field1152 / 2);
                    if (field992 > -1) {
                        if (var32 == 1) {
                            field954 -= 20;
                        }
                        if (var32 == 2) {
                            field992 -= 15;
                            field954 -= 10;
                        }
                        if (var32 == 3) {
                            field992 += 15;
                            field954 -= 10;
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
                        class295 var64 = var35.method4174();
                        if (var64 != null) {
                            var43 = var64.field3845;
                            int var65 = var64.field3836;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3837;
                        }
                        class295 var66 = var35.method4175();
                        if (var66 != null) {
                            var44 = var66.field3845;
                            int var67 = var66.field3836;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3837;
                        }
                        class295 var68 = var35.method4203();
                        if (var68 != null) {
                            var45 = var68.field3845;
                            int var69 = var68.field3836;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3837;
                        }
                        class295 var70 = var35.method4177();
                        if (var70 != null) {
                            var46 = var70.field3845;
                            int var71 = var70.field3836;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3837;
                        }
                        if (var38 != null) {
                            var51 = var38.method4174();
                            if (var51 != null) {
                                var55 = var51.field3845;
                                int var72 = var51.field3836;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3837;
                            }
                            var52 = var38.method4175();
                            if (var52 != null) {
                                var56 = var52.field3845;
                                int var73 = var52.field3836;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3837;
                            }
                            var53 = var38.method4203();
                            if (var53 != null) {
                                var57 = var53.field3845;
                                int var74 = var53.field3836;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3837;
                            }
                            var54 = var38.method4177();
                            if (var54 != null) {
                                var58 = var54.field3845;
                                int var75 = var54.field3836;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3837;
                            }
                        }
                        class271 var76 = var35.method4178();
                        if (var76 == null) {
                            var76 = Statics.field364;
                        }
                        class271 var77;
                        if (var38 == null) {
                            var77 = Statics.field364;
                        } else {
                            var77 = var38.method4178();
                            if (var77 == null) {
                                var77 = Statics.field364;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4196(arg0.field1166[var32]);
                        int var83 = var76.method4482(var82);
                        if (var38 != null) {
                            var79 = var38.method4196(arg0.field1169[var32]);
                            var81 = var77.method4482(var79);
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
                        int var100 = arg0.field1197[var32] - field872;
                        int var101 = var35.field3476 - var35.field3476 * var100 / var35.field3471;
                        int var102 = var35.field3477 * var100 / var35.field3471 + -var35.field3477;
                        int var103 = field992 + arg2 - (var92 >> 1) + var101;
                        int var104 = field954 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3467 + var104 + 15;
                        int var108 = var107 - var76.field3697;
                        int var109 = var76.field3695 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3467 + var104 + 15;
                            int var111 = var110 - var77.field3697;
                            int var112 = var77.field3695 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3478 >= 0) {
                            var115 = (var100 << 8) / (var35.field3471 - var35.field3478);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4859(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4859(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4859(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4859(var93 + var103 - var50, var104, var115);
                            }
                            var76.method4465(var82, var90 + var103, var107, var35.field3464, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4859(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4859(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4859(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4859(var97 + var103 - var62, var104, var115);
                                }
                                var77.method4465(var79, var98 + var103, var110, var38.field3464, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method4793(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method4793(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method4793(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method4793(var93 + var103 - var50, var104);
                            }
                            var76.method4464(var82, var90 + var103, var107, var35.field3464 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4793(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method4793(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method4793(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4793(var97 + var103 - var62, var104);
                                }
                                var77.method4464(var79, var98 + var103, var110, var38.field3464 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ah.gm(IIIII)V")
    public static final void method461(int arg0, int arg1, int arg2, int arg3) {
        if (field958 == 1) {
            Statics.field26[field969 / 100].method4793(field955 - 8, field956 - 8);
        }
        if (field958 == 2) {
            Statics.field26[field969 / 100 + 4].method4793(field955 - 8, field956 - 8);
        }
        field967 = 0;
        int var4 = (Statics.field3721.field1195 >> 7) + Statics.field269;
        int var5 = (Statics.field3721.field1157 >> 7) + Statics.field854;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field967 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field967 = 1;
        }
        if (field967 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field967 = 0;
        }
    }

    @ObfuscatedName("bj.gr(Lbw;II)V")
    public static final void method1382(class78 arg0, int arg1) {
        method2855(arg0.field1195, arg0.field1157, arg1);
    }

    @ObfuscatedName("fn.gq(IIII)V")
    public static final void method2855(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field992 = -1;
            field954 = -1;
            return;
        }
        int var3 = method118(arg0, arg1, Statics.field376) - arg2;
        int var4 = arg0 - Statics.field546;
        int var5 = var3 - Statics.field3739;
        int var6 = arg1 - Statics.field930;
        int var7 = class136.field1939[Statics.field543];
        int var8 = class136.field1942[Statics.field543];
        int var9 = class136.field1939[Statics.field2909];
        int var10 = class136.field1942[Statics.field2909];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field992 = field1113 * var11 / var15 + field1111 / 2;
            field954 = field1113 * var14 / var15 + field909 / 2;
        } else {
            field992 = -1;
            field954 = -1;
        }
    }

    @ObfuscatedName("y.gu(IIIB)I")
    public static final int method118(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field713[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field709[var5][var3][var4] + class62.field709[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field709[var5][var3][var4 + 1] + class62.field709[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("h.gv(IIIIIIS)V")
    public static final void method103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class136.field1939[var6];
            int var12 = class136.field1942[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class136.field1939[var7];
            int var15 = class136.field1942[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field546 = arg0 - var8;
        Statics.field3739 = arg1 - var9;
        Statics.field930 = arg2 - var10;
        Statics.field543 = arg3;
        Statics.field2909 = arg4;
    }

    @ObfuscatedName("eh.gy(ZLgd;I)V")
    public static final void method2400(boolean arg0, class187 arg1) {
        field920 = arg0;
        if (!field920) {
            int var2 = arg1.method3049();
            int var3 = arg1.method3049();
            int var4 = arg1.method3081();
            Statics.field615 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field615[var5][var6] = arg1.method2996();
                }
            }
            Statics.field1304 = new int[var4];
            Statics.field1364 = new int[var4];
            Statics.field524 = new int[var4];
            Statics.field1579 = new byte[var4][];
            Statics.field1321 = new byte[var4][];
            boolean var7 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var3 / 8 == 48) {
                var7 = true;
            }
            if (var2 / 8 == 48 && var3 / 8 == 148) {
                var7 = true;
            }
            int var8 = 0;
            for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                for (int var10 = (var3 - 6) / 8; var10 <= (var3 + 6) / 8; var10++) {
                    int var11 = (var9 << 8) + var10;
                    if (!var7 || var10 != 49 && var10 != 149 && var10 != 147 && var9 != 50 && (var9 != 49 || var10 != 47)) {
                        Statics.field1304[var8] = var11;
                        Statics.field1364[var8] = Statics.field617.method3832("m" + var9 + "_" + var10);
                        Statics.field524[var8] = Statics.field617.method3832("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            Statics.method43(var2, var3, true);
            return;
        }
        int var12 = arg1.method3081();
        boolean var13 = arg1.method2974() == 1;
        int var14 = arg1.method2981();
        int var15 = arg1.method3081();
        arg1.method3214();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3208(1);
                    if (var19 == 1) {
                        field1012[var16][var17][var18] = arg1.method3208(26);
                    } else {
                        field1012[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3233();
        Statics.field615 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field615[var20][var21] = arg1.method2996();
            }
        }
        Statics.field1304 = new int[var15];
        Statics.field1364 = new int[var15];
        Statics.field524 = new int[var15];
        Statics.field1579 = new byte[var15][];
        Statics.field1321 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field1012[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field1304[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field1304[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field1364[var22] = Statics.field617.method3832("m" + var31 + "_" + var32);
                            Statics.field524[var22] = Statics.field617.method3832("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        Statics.method43(var12, var14, !var13);
    }

    @ObfuscatedName("an.gs(ZI)V")
    public static final void method218(boolean arg0) {
        method1557();
        field906.field1457++;
        if (field906.field1457 < 50 && !arg0) {
            return;
        }
        field906.field1457 = 0;
        if (field908 || field906.method1733() == null) {
            return;
        }
        class171 var1 = class171.method124(class168.field2355, field906.field1461);
        field906.method1715(var1);
        try {
            field906.method1726();
        } catch (IOException var3) {
            field908 = true;
        }
    }

    @ObfuscatedName("jz.gx(IIIIII)V")
    public static final void method4449(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field918.method2515(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field918.method2519(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1281.field3842;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class263 var13 = class263.method2851(var12);
            if (var13.field3535 == -1) {
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
                class294 var14 = Statics.field788[var13.field3535];
                if (var14 != null) {
                    int var15 = (var13.field3502 * 4 - var14.field3828) / 2;
                    int var16 = (var13.field3503 * 4 - var14.field3826) / 2;
                    var14.method4778(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3503) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field918.method2517(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field918.method2519(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class263 var22 = class263.method2851(var21);
            if (var22.field3535 != -1) {
                class294 var23 = Statics.field788[var22.field3535];
                if (var23 != null) {
                    int var24 = (var22.field3502 * 4 - var23.field3828) / 2;
                    int var25 = (var22.field3503 * 4 - var23.field3826) / 2;
                    var23.method4778(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3503) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1281.field3842;
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
        int var29 = Statics.field918.method2518(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class263 var31 = class263.method2851(var30);
        if (var31.field3535 == -1) {
            return;
        }
        class294 var32 = Statics.field788[var31.field3535];
        if (var32 != null) {
            int var33 = (var31.field3502 * 4 - var32.field3828) / 2;
            int var34 = (var31.field3503 * 4 - var32.field3826) / 2;
            var32.method4778(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3503) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.gt(Lci;I)Z")
    public final boolean method1031(class101 arg0) {
        class161 var2 = arg0.method1733();
        class187 var3 = arg0.field1462;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1464 == null) {
                if (arg0.field1465) {
                    if (!var2.method2766(1)) {
                        return false;
                    }
                    var2.method2783(arg0.field1462.field2495, 0, 1);
                    arg0.field1458 = 0;
                    arg0.field1465 = false;
                }
                var3.field2488 = 0;
                if (var3.method3230()) {
                    if (!var2.method2766(1)) {
                        return false;
                    }
                    var2.method2783(arg0.field1462.field2495, 1, 1);
                    arg0.field1458 = 0;
                }
                arg0.field1465 = true;
                class167[] var4 = class167.method3797();
                int var5 = var3.method3206();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field2488);
                }
                arg0.field1464 = var4[var5];
                arg0.field1466 = arg0.field1464.field2298;
            }
            if (arg0.field1466 == -1) {
                if (!var2.method2766(1)) {
                    return false;
                }
                arg0.method1733().method2783(var3.field2495, 0, 1);
                arg0.field1466 = var3.field2495[0] & 0xFF;
            }
            if (arg0.field1466 == -2) {
                if (!var2.method2766(2)) {
                    return false;
                }
                arg0.method1733().method2783(var3.field2495, 0, 2);
                var3.field2488 = 0;
                arg0.field1466 = var3.method3081();
            }
            if (!var2.method2766(arg0.field1466)) {
                return false;
            }
            var3.field2488 = 0;
            var2.method2783(var3.field2495, 0, arg0.field1466);
            arg0.field1458 = 0;
            field977.method4608();
            arg0.field1460 = arg0.field1469;
            arg0.field1469 = arg0.field1468;
            arg0.field1468 = arg0.field1464;
            if (class167.field2251 == arg0.field1464) {
                class95.method45(var3, arg0.field1466);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2224 == arg0.field1464) {
                field1095 = false;
                for (int var6 = 0; var6 < 5; var6++) {
                    field1096[var6] = false;
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2240 == arg0.field1464) {
                int var7 = var3.method3081();
                int var8 = var3.method2945();
                int var9 = var3.method3081();
                if (field1086 != 0 && var8 != 0 && field1032 < 50) {
                    field957[field1032] = var7;
                    field987[field1032] = var8;
                    field1087[field1032] = var9;
                    field883[field1032] = null;
                    field1093[field1032] = 0;
                    field1032++;
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2286 == arg0.field1464) {
                method890(class170.field2408);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2280 == arg0.field1464) {
                String var13 = var3.method2953();
                int var14 = var3.method2992();
                class224 var15 = class224.method934(var14);
                if (!var13.equals(var15.field2774)) {
                    var15.field2774 = var13;
                    method955(var15);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2283 == arg0.field1464) {
                method1019();
                field1013 = var3.method2945();
                field865 = field1033;
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2233 == arg0.field1464) {
                var3.field2488 += 28;
                if (var3.method2968()) {
                    int var16 = var3.field2488 - 28;
                    method54(var3.field2495, var16);
                    class157.method2691(var3, var16);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2255 == arg0.field1464) {
                byte var17 = var3.method2948();
                int var18 = var3.method2983();
                class219.field2679[var18] = var17;
                if (class219.field2680[var18] != var17) {
                    class219.field2680[var18] = var17;
                }
                method447(var18);
                field1034[++field1035 - 1 & 0x1F] = var18;
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2261 == arg0.field1464) {
                int var19 = var3.method2996();
                class224 var20 = class224.method934(var19);
                var20.field2720 = 3;
                var20.field2758 = Statics.field3721.field816.method3709();
                method955(var20);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2221 == arg0.field1464) {
                method971(var3.method2953());
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2216 == arg0.field1464) {
                class95.field1401 = 0;
                for (int var21 = 0; var21 < 2048; var21++) {
                    class95.field1409[var21] = null;
                    class95.field1399[var21] = 1;
                }
                for (int var22 = 0; var22 < 2048; var22++) {
                    field1098[var22] = null;
                }
                class95.method160(var3);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2291 == arg0.field1464) {
                String var23 = var3.method2953();
                long var24 = (long) var3.method3081();
                long var26 = (long) var3.method3010();
                class238[] var28 = new class238[] { class238.field3238, class238.field3236, class238.field3235, class238.field3234, class238.field3241, class238.field3233 };
                class238 var29 = (class238) class176.method2719(var28, var3.method2945());
                long var30 = (var24 << 32) + var26;
                boolean var32 = false;
                for (int var33 = 0; var33 < 100; var33++) {
                    if (field1067[var33] == var30) {
                        var32 = true;
                        break;
                    }
                }
                if (method72(var23)) {
                    var32 = true;
                }
                if (!var32 && field967 == 0) {
                    field1067[field1068] = var30;
                    field1068 = (field1068 + 1) % 100;
                    String var37;
                    try {
                        int var34 = var3.method3086();
                        if (var34 > 32767) {
                            var34 = 32767;
                        }
                        byte[] var35 = new byte[var34];
                        var3.field2488 += Statics.field3708.method2884(var3.field2495, var3.field2488, var35, 0, var34);
                        String var36 = class274.method168(var35, 0, var34);
                        var37 = var36;
                    } catch (Exception var277) {
                        var37 = "Cabbage";
                    }
                    String var40 = class272.method4463(class278.method2790(var37));
                    byte var41;
                    if (var29.field3232) {
                        var41 = 7;
                    } else {
                        var41 = 3;
                    }
                    if (var29.field3239 == -1) {
                        class97.method4(var41, var23, var40);
                    } else {
                        class97.method4(var41, class88.method1379(var29.field3239) + var23, var40);
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2292 == arg0.field1464) {
                String var42 = var3.method2953();
                long var43 = var3.method2951();
                long var45 = (long) var3.method3081();
                long var47 = (long) var3.method3010();
                class238[] var49 = new class238[] { class238.field3238, class238.field3236, class238.field3235, class238.field3234, class238.field3241, class238.field3233 };
                class238 var50 = (class238) class176.method2719(var49, var3.method2945());
                long var51 = (var45 << 32) + var47;
                boolean var53 = false;
                for (int var54 = 0; var54 < 100; var54++) {
                    if (field1067[var54] == var51) {
                        var53 = true;
                        break;
                    }
                }
                if (var50.field3240 && method72(var42)) {
                    var53 = true;
                }
                if (!var53 && field967 == 0) {
                    field1067[field1068] = var51;
                    field1068 = (field1068 + 1) % 100;
                    String var58;
                    try {
                        int var55 = var3.method3086();
                        if (var55 > 32767) {
                            var55 = 32767;
                        }
                        byte[] var56 = new byte[var55];
                        var3.field2488 += Statics.field3708.method2884(var3.field2495, var3.field2488, var56, 0, var55);
                        String var57 = class274.method168(var56, 0, var55);
                        var58 = var57;
                    } catch (Exception var276) {
                        var58 = "Cabbage";
                    }
                    String var61 = class272.method4463(class278.method2790(var58));
                    if (var50.field3239 == -1) {
                        class97.method938(9, var42, var61, class276.method4014(var43));
                    } else {
                        class97.method938(9, class88.method1379(var50.field3239) + var42, var61, class276.method4014(var43));
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2294 == arg0.field1464) {
                int var62 = var3.method2996();
                class68 var63 = (class68) field1009.method3340((long) var62);
                if (var63 != null) {
                    method1017(var63, true);
                }
                if (field879 != null) {
                    method955(field879);
                    field879 = null;
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2287 == arg0.field1464) {
                int var64 = var3.method2996();
                int var65 = var3.method2983();
                int var66 = var65 >> 10 & 0x1F;
                int var67 = var65 >> 5 & 0x1F;
                int var68 = var65 & 0x1F;
                int var69 = (var68 << 3) + (var66 << 19) + (var67 << 11);
                class224 var70 = class224.method934(var64);
                if (var70.field2739 != var69) {
                    var70.field2739 = var69;
                    method955(var70);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2263 == arg0.field1464) {
                String var71 = var3.method2953();
                int var72 = var3.method3081();
                byte var73 = var3.method2946();
                boolean var74 = false;
                if (var73 == -128) {
                    var74 = true;
                }
                if (var74) {
                    if (Statics.field451 == 0) {
                        arg0.field1464 = null;
                        return true;
                    }
                    boolean var75 = false;
                    int var76;
                    for (var76 = 0; var76 < Statics.field451 && (!Statics.field1420[var76].field853.equals(var71) || Statics.field1420[var76].field852 != var72); var76++) {
                    }
                    if (var76 < Statics.field451) {
                        while (var76 < Statics.field451 - 1) {
                            Statics.field1420[var76] = Statics.field1420[var76 + 1];
                            var76++;
                        }
                        Statics.field451--;
                        Statics.field1420[Statics.field451] = null;
                    }
                } else {
                    var3.method2953();
                    class76 var77 = new class76();
                    var77.field853 = var71;
                    var77.field851 = Statics.method3795(var77.field853, Statics.field2530);
                    var77.field852 = var72;
                    var77.field850 = var73;
                    int var78;
                    for (var78 = Statics.field451 - 1; var78 >= 0; var78--) {
                        int var79 = Statics.field1420[var78].field851.compareTo(var77.field851);
                        if (var79 == 0) {
                            Statics.field1420[var78].field852 = var72;
                            Statics.field1420[var78].field850 = var73;
                            if (var71.equals(Statics.field3721.field823)) {
                                Statics.field1584 = var73;
                            }
                            field1047 = field1033;
                            arg0.field1464 = null;
                            return true;
                        }
                        if (var79 < 0) {
                            break;
                        }
                    }
                    if (Statics.field451 >= Statics.field1420.length) {
                        arg0.field1464 = null;
                        return true;
                    }
                    for (int var80 = Statics.field451 - 1; var80 > var78; var80--) {
                        Statics.field1420[var80 + 1] = Statics.field1420[var80];
                    }
                    if (Statics.field451 == 0) {
                        Statics.field1420 = new class76[100];
                    }
                    Statics.field1420[var78 + 1] = var77;
                    Statics.field451++;
                    if (var71.equals(Statics.field3721.field823)) {
                        Statics.field1584 = var73;
                    }
                }
                field1047 = field1033;
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2222 == arg0.field1464) {
                method890(class170.field2406);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2254 == arg0.field1464) {
                method2400(false, arg0.field1462);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2262 == arg0.field1464) {
                int var81 = var3.method2990();
                int var82 = var3.method2991();
                int var83 = var3.method3049();
                if (var83 == 65535) {
                    var83 = -1;
                }
                class224 var84 = class224.method934(var81);
                if (var84.field2757) {
                    var84.field2717 = var83;
                    var84.field2780 = var82;
                    class264 var86 = class264.method2662(var83);
                    var84.field2765 = var86.field3582;
                    var84.field2716 = var86.field3552;
                    var84.field2711 = var86.field3557;
                    var84.field2763 = var86.field3558;
                    var84.field2764 = var86.field3571;
                    var84.field2768 = var86.field3554;
                    if (var86.field3560 == 1) {
                        var84.field2788 = 1;
                    } else {
                        var84.field2788 = 2;
                    }
                    if (var84.field2769 > 0) {
                        var84.field2768 = var84.field2768 * 32 / var84.field2769;
                    } else if (var84.field2800 > 0) {
                        var84.field2768 = var84.field2768 * 32 / var84.field2800;
                    }
                    method955(var84);
                } else if (var83 == -1) {
                    var84.field2720 = 0;
                    arg0.field1464 = null;
                    return true;
                } else {
                    class264 var85 = class264.method2662(var83);
                    var84.field2720 = 4;
                    var84.field2758 = var83;
                    var84.field2765 = var85.field3582;
                    var84.field2716 = var85.field3552;
                    var84.field2768 = var85.field3554 * 100 / var82;
                    method955(var84);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2274 == arg0.field1464) {
                int var87 = var3.method2992();
                class224 var88 = class224.method934(var87);
                for (int var89 = 0; var89 < var88.field2832.length; var89++) {
                    var88.field2832[var89] = -1;
                    var88.field2832[var89] = 0;
                }
                method955(var88);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2276 == arg0.field1464) {
                for (int var90 = 0; var90 < Statics.field3339; var90++) {
                    class249 var91 = class249.method4573(var90);
                    if (var91 != null) {
                        class219.field2679[var90] = 0;
                        class219.field2680[var90] = 0;
                    }
                }
                method1019();
                field1035 += 32;
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2218 == arg0.field1464) {
                int var92 = var3.method3081();
                int var93 = var3.method2981();
                int var94 = var3.method2990();
                class224 var95 = class224.method934(var94);
                var95.field2770 = (var93 << 16) + var92;
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2225 == arg0.field1464) {
                int var96 = var3.method2992();
                int var97 = var3.method2981();
                class219.field2679[var97] = var96;
                if (class219.field2680[var97] != var96) {
                    class219.field2680[var97] = var96;
                }
                method447(var97);
                field1034[++field1035 - 1 & 0x1F] = var97;
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2289 == arg0.field1464) {
                field979 = var3.method2945();
                if (field979 == 255) {
                    field979 = 0;
                }
                field1081 = var3.method2945();
                if (field1081 == 255) {
                    field1081 = 0;
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2268 == arg0.field1464) {
                int var98 = var3.method2992();
                int var99 = var3.method2947();
                int var100 = var3.method3050();
                class224 var101 = class224.method934(var98);
                if (var101.field2842 != var99 || var101.field2776 != var100 || var101.field2719 != 0 || var101.field2722 != 0) {
                    var101.field2842 = var99;
                    var101.field2776 = var100;
                    var101.field2719 = 0;
                    var101.field2722 = 0;
                    method955(var101);
                    this.method1236(var101);
                    if (var101.field2747 == 0) {
                        method1558(Statics.field2807[var98 >> 16], var101, false);
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2227 == arg0.field1464) {
                Statics.field2416 = var3.method2945();
                Statics.field862 = var3.method2973();
                while (var3.field2488 < arg0.field1466) {
                    int var102 = var3.method2945();
                    class170[] var103 = new class170[] { class170.field2415, class170.field2406, class170.field2407, class170.field2405, class170.field2408, class170.field2413, class170.field2411, class170.field2410, class170.field2409, class170.field2414 };
                    class170 var104 = var103[var102];
                    method890(var104);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2231 == arg0.field1464) {
                class290.method942(var3, arg0.field1466);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2293 == arg0.field1464) {
                while (var3.field2488 < arg0.field1466) {
                    int var105 = var3.method2945();
                    boolean var106 = (var105 & 0x1) == 1;
                    String var107 = var3.method2953();
                    String var108 = var3.method2953();
                    var3.method2953();
                    for (int var109 = 0; var109 < field1118; var109++) {
                        class70 var110 = field1119[var109];
                        if (var106) {
                            if (var108.equals(var110.field793)) {
                                var110.field793 = var107;
                                var110.field790 = var108;
                                var107 = null;
                                break;
                            }
                        } else if (var107.equals(var110.field793)) {
                            var110.field793 = var107;
                            var110.field790 = var108;
                            var107 = null;
                            break;
                        }
                    }
                    if (var107 != null && field1118 < 400) {
                        class70 var111 = new class70();
                        field1119[field1118] = var111;
                        var111.field793 = var107;
                        var111.field790 = var108;
                        field1118++;
                    }
                }
                field1041 = field1033;
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2266 == arg0.field1464) {
                field1047 = field1033;
                if (arg0.field1466 == 0) {
                    field962 = null;
                    field1074 = null;
                    Statics.field451 = 0;
                    Statics.field1420 = null;
                    arg0.field1464 = null;
                    return true;
                }
                field1074 = var3.method2953();
                long var112 = var3.method2951();
                field962 = class276.method4103(var112);
                Statics.field518 = var3.method2946();
                int var114 = var3.method2945();
                if (var114 == 255) {
                    arg0.field1464 = null;
                    return true;
                }
                Statics.field451 = var114;
                class76[] var115 = new class76[100];
                for (int var116 = 0; var116 < Statics.field451; var116++) {
                    var115[var116] = new class76();
                    var115[var116].field853 = var3.method2953();
                    var115[var116].field851 = Statics.method3795(var115[var116].field853, Statics.field2530);
                    var115[var116].field852 = var3.method3081();
                    var115[var116].field850 = var3.method2946();
                    var3.method2953();
                    if (var115[var116].field853.equals(Statics.field3721.field823)) {
                        Statics.field1584 = var115[var116].field850;
                    }
                }
                boolean var117 = false;
                int var118 = Statics.field451;
                while (var118 > 0) {
                    boolean var119 = true;
                    var118--;
                    for (int var120 = 0; var120 < var118; var120++) {
                        if (var115[var120].field851.compareTo(var115[var120 + 1].field851) > 0) {
                            class76 var121 = var115[var120];
                            var115[var120] = var115[var120 + 1];
                            var115[var120 + 1] = var121;
                            var119 = false;
                        }
                    }
                    if (var119) {
                        break;
                    }
                }
                Statics.field1420 = var115;
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2215 == arg0.field1464) {
                method446(true, var3);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2256 == arg0.field1464) {
                int var122 = var3.method2991();
                int var123 = var3.method3049();
                class224 var124 = class224.method934(var122);
                if (var124 != null && var124.field2747 == 0) {
                    if (var123 > var124.field2766 - var124.field2834) {
                        var123 = var124.field2766 - var124.field2834;
                    }
                    if (var123 < 0) {
                        var123 = 0;
                    }
                    if (var124.field2759 != var123) {
                        var124.field2759 = var123;
                        method955(var124);
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2295 == arg0.field1464) {
                method890(class170.field2414);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2247 == arg0.field1464) {
                int var125 = var3.method3086();
                boolean var126 = var3.method2945() == 1;
                String var127 = "";
                boolean var128 = false;
                if (var126) {
                    var127 = var3.method2953();
                    if (method72(var127)) {
                        var128 = true;
                    }
                }
                String var129 = var3.method2953();
                if (!var128) {
                    class97.method4(var125, var127, var129);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2250 == arg0.field1464) {
                method890(class170.field2413);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2265 == arg0.field1464) {
                for (int var130 = 0; var130 < field1098.length; var130++) {
                    if (field1098[var130] != null) {
                        field1098[var130].field1158 = -1;
                    }
                }
                for (int var131 = 0; var131 < field874.length; var131++) {
                    if (field874[var131] != null) {
                        field874[var131].field1158 = -1;
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2269 == arg0.field1464) {
                String var132 = var3.method2953();
                int var133 = var3.method2945();
                int var134 = var3.method2973();
                if (var133 >= 1 && var133 <= 8) {
                    if (var132.equalsIgnoreCase("null")) {
                        var132 = null;
                    }
                    field961[var133 - 1] = var132;
                    field975[var133 - 1] = var134 == 0;
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2281 == arg0.field1464) {
                method890(class170.field2409);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2252 == arg0.field1464) {
                int var135 = var3.method3049();
                if (var135 == 65535) {
                    var135 = -1;
                }
                method687(var135);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2236 == arg0.field1464) {
                int var136 = var3.method2981();
                if (var136 == 65535) {
                    var136 = -1;
                }
                int var137 = var3.method3088();
                if (field946 != 0 && var136 != -1) {
                    class211.method3796(Statics.field702, var136, 0, field946, false);
                    field1085 = true;
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2297 == arg0.field1464) {
                method890(class170.field2410);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2279 == arg0.field1464) {
                for (int var138 = 0; var138 < class219.field2680.length; var138++) {
                    if (class219.field2680[var138] != class219.field2679[var138]) {
                        class219.field2680[var138] = class219.field2679[var138];
                        method447(var138);
                        field1034[++field1035 - 1 & 0x1F] = var138;
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2229 == arg0.field1464) {
                method446(false, var3);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2257 == arg0.field1464) {
                method2400(true, arg0.field1462);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2243 == arg0.field1464) {
                field1064 = var3.method2974();
                field1065 = var3.method2945();
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2245 == arg0.field1464) {
                String var139 = var3.method2953();
                String var143;
                try {
                    int var140 = var3.method3086();
                    if (var140 > 32767) {
                        var140 = 32767;
                    }
                    byte[] var141 = new byte[var140];
                    var3.field2488 += Statics.field3708.method2884(var3.field2495, var3.field2488, var141, 0, var140);
                    String var142 = class274.method168(var141, 0, var140);
                    var143 = var142;
                } catch (Exception var275) {
                    var143 = "Cabbage";
                }
                String var146 = class272.method4463(class278.method2790(var143));
                class97.method4(6, var139, var146);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2290 == arg0.field1464) {
                String var147 = var3.method2953();
                Object[] var148 = new Object[var147.length() + 1];
                for (int var149 = var147.length() - 1; var149 >= 0; var149--) {
                    if (var147.charAt(var149) == 's') {
                        var148[var149 + 1] = var3.method2953();
                    } else {
                        var148[var149 + 1] = Integer.valueOf(var3.method2996());
                    }
                }
                var148[0] = Integer.valueOf(var3.method2996());
                class69 var150 = new class69();
                var150.field786 = var148;
                class83.method12(var150);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2217 == arg0.field1464) {
                field1109 = var3.method2945();
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2241 == arg0.field1464) {
                int var151 = var3.method2996();
                int var152 = var3.method3081();
                if (var151 < -70000) {
                    var152 += 32768;
                }
                class224 var153;
                if (var151 >= 0) {
                    var153 = class224.method934(var151);
                } else {
                    var153 = null;
                }
                if (var153 != null) {
                    for (int var154 = 0; var154 < var153.field2832.length; var154++) {
                        var153.field2832[var154] = 0;
                        var153.field2833[var154] = 0;
                    }
                }
                class64 var155 = (class64) class64.field734.method3340((long) var152);
                if (var155 != null) {
                    for (int var156 = 0; var156 < var155.field733.length; var156++) {
                        var155.field733[var156] = -1;
                        var155.field737[var156] = 0;
                    }
                }
                int var157 = var3.method3081();
                for (int var158 = 0; var158 < var157; var158++) {
                    int var159 = var3.method2983();
                    int var160 = var3.method2945();
                    if (var160 == 255) {
                        var160 = var3.method2996();
                    }
                    if (var153 != null && var158 < var153.field2832.length) {
                        var153.field2832[var158] = var159;
                        var153.field2833[var158] = var160;
                    }
                    class64.method633(var152, var158, var159 - 1, var160);
                }
                if (var153 != null) {
                    method955(var153);
                }
                method1019();
                field1036[++field974 - 1 & 0x1F] = var152 & 0x7FFF;
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2275 == arg0.field1464) {
                int var161 = var3.method2996();
                int var162 = var3.method3081();
                if (var161 < -70000) {
                    var162 += 32768;
                }
                class224 var163;
                if (var161 >= 0) {
                    var163 = class224.method934(var161);
                } else {
                    var163 = null;
                }
                while (var3.field2488 < arg0.field1466) {
                    int var164 = var3.method3086();
                    int var165 = var3.method3081();
                    int var166 = 0;
                    if (var165 != 0) {
                        var166 = var3.method2945();
                        if (var166 == 255) {
                            var166 = var3.method2996();
                        }
                    }
                    if (var163 != null && var164 >= 0 && var164 < var163.field2832.length) {
                        var163.field2832[var164] = var165;
                        var163.field2833[var164] = var166;
                    }
                    class64.method633(var162, var164, var165 - 1, var166);
                }
                if (var163 != null) {
                    method955(var163);
                }
                method1019();
                field1036[++field974 - 1 & 0x1F] = var162 & 0x7FFF;
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2271 == arg0.field1464) {
                int var167 = var3.method2945();
                if (var3.method2945() == 0) {
                    field1123[var167] = new class17();
                    var3.field2488 += 18;
                } else {
                    var3.field2488--;
                    field1123[var167] = new class17(var3, false);
                }
                field1043 = field1033;
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2246 == arg0.field1464) {
                field1095 = true;
                Statics.field2118 = var3.method2945();
                Statics.field3815 = var3.method2945();
                Statics.field371 = var3.method3081();
                Statics.field1221 = var3.method2945();
                Statics.field12 = var3.method2945();
                if (Statics.field12 >= 100) {
                    Statics.field546 = Statics.field2118 * 128 + 64;
                    Statics.field930 = Statics.field3815 * 128 + 64;
                    Statics.field3739 = method118(Statics.field546, Statics.field930, Statics.field376) - Statics.field371;
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2258 == arg0.field1464) {
                field1095 = true;
                Statics.field1237 = var3.method2945();
                Statics.field3449 = var3.method2945();
                Statics.field2849 = var3.method3081();
                Statics.field1210 = var3.method2945();
                Statics.field2512 = var3.method2945();
                if (Statics.field2512 >= 100) {
                    int var168 = Statics.field1237 * 128 + 64;
                    int var169 = Statics.field3449 * 128 + 64;
                    int var170 = method118(var168, var169, Statics.field376) - Statics.field2849;
                    int var171 = var168 - Statics.field546;
                    int var172 = var170 - Statics.field3739;
                    int var173 = var169 - Statics.field930;
                    int var174 = (int) Math.sqrt((double) (var171 * var171 + var173 * var173));
                    Statics.field543 = (int) (Math.atan2((double) var172, (double) var174) * 325.949D) & 0x7FF;
                    Statics.field2909 = (int) (Math.atan2((double) var171, (double) var173) * -325.949D) & 0x7FF;
                    if (Statics.field543 < 128) {
                        Statics.field543 = 128;
                    }
                    if (Statics.field543 > 383) {
                        Statics.field543 = 383;
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2253 == arg0.field1464) {
                method1019();
                field1014 = var3.method3050();
                field865 = field1033;
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2234 == arg0.field1464) {
                method890(class170.field2407);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2260 == arg0.field1464) {
                int var175 = var3.method2983();
                class64.method4158(var175);
                field1036[++field974 - 1 & 0x1F] = var175 & 0x7FFF;
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2272 == arg0.field1464) {
                boolean var176 = var3.method2942() == 1;
                int var177 = var3.method2990();
                class224 var178 = class224.method934(var177);
                if (var178.field2734 != var176) {
                    var178.field2734 = var176;
                    method955(var178);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2278 == arg0.field1464) {
                Statics.field2416 = var3.method2973();
                Statics.field862 = var3.method2973();
                for (int var179 = Statics.field2416; var179 < Statics.field2416 + 8; var179++) {
                    for (int var180 = Statics.field862; var180 < Statics.field862 + 8; var180++) {
                        if (field978[Statics.field376][var179][var180] != null) {
                            field978[Statics.field376][var179][var180] = null;
                            method960(var179, var180);
                        }
                    }
                }
                for (class77 var181 = (class77) field885.method3405(); var181 != null; var181 = (class77) field885.method3414()) {
                    if (var181.field1129 >= Statics.field2416 && var181.field1129 < Statics.field2416 + 8 && var181.field1132 >= Statics.field862 && var181.field1132 < Statics.field862 + 8 && Statics.field376 == var181.field1138) {
                        var181.field1130 = 0;
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2223 == arg0.field1464) {
                field880 = var3.method2945();
                if (field880 == 1) {
                    field881 = var3.method3081();
                }
                if (field880 >= 2 && field880 <= 6) {
                    if (field880 == 2) {
                        field886 = 64;
                        field887 = 64;
                    }
                    if (field880 == 3) {
                        field886 = 0;
                        field887 = 64;
                    }
                    if (field880 == 4) {
                        field886 = 128;
                        field887 = 64;
                    }
                    if (field880 == 5) {
                        field886 = 64;
                        field887 = 0;
                    }
                    if (field880 == 6) {
                        field886 = 64;
                        field887 = 128;
                    }
                    field880 = 2;
                    field1073 = var3.method3081();
                    field884 = var3.method3081();
                    field1028 = var3.method2945();
                }
                if (field880 == 10) {
                    field882 = var3.method3081();
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2244 == arg0.field1464) {
                field911 = var3.method2981() * 30;
                field865 = field1033;
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2230 == arg0.field1464) {
                int var182 = var3.method3081();
                field1008 = var182;
                this.method1035(false);
                method641(var182);
                class83.method450(field1008);
                for (int var183 = 0; var183 < 100; var183++) {
                    field1053[var183] = true;
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2242 == arg0.field1464) {
                int var184 = var3.method2996();
                int var185 = var3.method2996();
                int var186 = class59.method3992();
                class171 var187 = class171.method124(class168.field2388, field906.field1461);
                var187.field2423.method2929(field658);
                var187.field2423.method2979(var186);
                var187.field2423.method2989(var184);
                var187.field2423.method3112(var185);
                field906.method1715(var187);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2249 == arg0.field1464) {
                Statics.field2416 = var3.method2945();
                Statics.field862 = var3.method2942();
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2284 == arg0.field1464) {
                if (field1008 != -1) {
                    int var188 = field1008;
                    if (class224.method936(var188)) {
                        method136(Statics.field2807[var188], 0);
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2219 == arg0.field1464) {
                method890(class170.field2405);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2277 == arg0.field1464) {
                while (var3.field2488 < arg0.field1466) {
                    boolean var189 = var3.method2945() == 1;
                    String var190 = var3.method2953();
                    String var191 = var3.method2953();
                    int var192 = var3.method3081();
                    int var193 = var3.method2945();
                    int var194 = var3.method2945();
                    boolean var195 = (var194 & 0x2) != 0;
                    boolean var196 = (var194 & 0x1) != 0;
                    if (var192 > 0) {
                        var3.method2953();
                        var3.method2945();
                        var3.method2996();
                    }
                    var3.method2953();
                    for (int var197 = 0; var197 < field1114; var197++) {
                        class66 var198 = field1116[var197];
                        if (var189) {
                            if (var191.equals(var198.field755)) {
                                var198.field755 = var190;
                                var198.field754 = var191;
                                var190 = null;
                                break;
                            }
                        } else if (var190.equals(var198.field755)) {
                            if (var198.field757 != var192) {
                                boolean var199 = true;
                                for (class67 var200 = (class67) field1117.method3435(); var200 != null; var200 = (class67) field1117.method3432()) {
                                    if (var200.field770.equals(var190)) {
                                        if (var192 != 0 && var200.field763 == 0) {
                                            var200.method3440();
                                            var199 = false;
                                        } else if (var192 == 0 && var200.field763 != 0) {
                                            var200.method3440();
                                            var199 = false;
                                        }
                                    }
                                }
                                if (var199) {
                                    field1117.method3431(new class67(var190, var192));
                                }
                                var198.field757 = var192;
                            }
                            var198.field754 = var191;
                            var198.field753 = var193;
                            var198.field756 = var195;
                            var198.field758 = var196;
                            var190 = null;
                            break;
                        }
                    }
                    if (var190 != null && field1114 < 400) {
                        class66 var201 = new class66();
                        field1116[field1114] = var201;
                        var201.field755 = var190;
                        var201.field754 = var191;
                        var201.field757 = var192;
                        var201.field753 = var193;
                        var201.field756 = var195;
                        var201.field758 = var196;
                        field1114++;
                    }
                }
                field1115 = 2;
                field1041 = field1033;
                boolean var202 = false;
                int var203 = field1114;
                while (var203 > 0) {
                    boolean var204 = true;
                    var203--;
                    for (int var205 = 0; var205 < var203; var205++) {
                        boolean var206 = false;
                        class66 var207 = field1116[var205];
                        class66 var208 = field1116[var205 + 1];
                        if (field940 != var207.field757 && field940 == var208.field757) {
                            var206 = true;
                        }
                        if (!var206 && var207.field757 == 0 && var208.field757 != 0) {
                            var206 = true;
                        }
                        if (!var206 && !var207.field756 && var208.field756) {
                            var206 = true;
                        }
                        if (!var206 && !var207.field758 && var208.field758) {
                            var206 = true;
                        }
                        if (var206) {
                            class66 var209 = field1116[var205];
                            field1116[var205] = field1116[var205 + 1];
                            field1116[var205 + 1] = var209;
                            var204 = false;
                        }
                    }
                    if (var204) {
                        break;
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2285 == arg0.field1464) {
                boolean var210 = var3.method2945() == 1;
                if (var210) {
                    Statics.field861 = class183.method1711() - var3.method2951();
                    Statics.field856 = new class14(var3, true);
                } else {
                    Statics.field856 = null;
                }
                field968 = field1033;
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2228 == arg0.field1464) {
                class80 var211 = new class80();
                var211.field1224 = var3.method2953();
                var211.field1220 = var3.method3081();
                int var212 = var3.method2996();
                var211.field1223 = var212;
                method2(45);
                var2.method2763();
                Object var213 = null;
                class92.method167(var211);
                arg0.field1464 = null;
                return false;
            }
            if (class167.field2288 == arg0.field1464) {
                field1115 = 1;
                field1041 = field1033;
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2239 == arg0.field1464) {
                int var214 = var3.method2991();
                int var215 = var3.method3081();
                class224 var216 = class224.method934(var214);
                if (var216.field2720 != 1 || var216.field2758 != var215) {
                    var216.field2720 = 1;
                    var216.field2758 = var215;
                    method955(var216);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2248 == arg0.field1464) {
                int var217 = var3.method2983();
                int var218 = var3.method2983();
                int var219 = var3.method3081();
                int var220 = var3.method2990();
                class224 var221 = class224.method934(var220);
                if (var221.field2765 != var217 || var221.field2716 != var218 || var221.field2768 != var219) {
                    var221.field2765 = var217;
                    var221.field2716 = var218;
                    var221.field2768 = var219;
                    method955(var221);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2296 == arg0.field1464) {
                method1019();
                int var222 = var3.method2942();
                int var223 = var3.method2992();
                int var224 = var3.method2973();
                field1094[var222] = var223;
                field982[var222] = var224;
                field983[var222] = 1;
                for (int var225 = 0; var225 < 98; var225++) {
                    if (var223 >= class230.field2901[var225]) {
                        field983[var222] = var225 + 2;
                    }
                }
                field1038[++field1039 - 1 & 0x1F] = var222;
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2270 == arg0.field1464) {
                int var226 = var3.method2991();
                int var227 = var3.method2990();
                class68 var228 = (class68) field1009.method3340((long) var226);
                class68 var229 = (class68) field1009.method3340((long) var227);
                if (var229 != null) {
                    method1017(var229, var228 == null || var228.field771 != var229.field771);
                }
                if (var228 != null) {
                    var228.method3392();
                    field1009.method3352(var228, (long) var227);
                }
                class224 var230 = class224.method934(var226);
                if (var230 != null) {
                    method955(var230);
                }
                class224 var231 = class224.method934(var227);
                if (var231 != null) {
                    method955(var231);
                    method1558(Statics.field2807[var231.field2714 >>> 16], var231, true);
                }
                if (field1008 != -1) {
                    int var232 = field1008;
                    if (class224.method936(var232)) {
                        method136(Statics.field2807[var232], 1);
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2235 == arg0.field1464) {
                int var233 = var3.method2981();
                int var234 = var3.method2991();
                class224 var235 = class224.method934(var234);
                if (var235.field2720 != 2 || var235.field2758 != var233) {
                    var235.field2720 = 2;
                    var235.field2758 = var233;
                    method955(var235);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2273 == arg0.field1464) {
                method890(class170.field2411);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2238 == arg0.field1464) {
                method55();
                arg0.field1464 = null;
                return false;
            }
            if (class167.field2237 == arg0.field1464) {
                int var236 = var3.method2981();
                if (var236 == 65535) {
                    var236 = -1;
                }
                int var237 = var3.method2996();
                int var238 = var3.method2996();
                int var239 = var3.method3081();
                if (var239 == 65535) {
                    var239 = -1;
                }
                for (int var240 = var236; var240 <= var239; var240++) {
                    long var241 = ((long) var238 << 32) + (long) var240;
                    class200 var243 = field1050.method3340(var241);
                    if (var243 != null) {
                        var243.method3392();
                    }
                    field1050.method3352(new class206(var237), var241);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2220 == arg0.field1464) {
                int var244 = var3.method2945();
                int var245 = var3.method2945();
                int var246 = var3.method2945();
                int var247 = var3.method2945();
                field1096[var244] = true;
                field869[var244] = var245;
                field1075[var244] = var246;
                field1099[var244] = var247;
                field991[var244] = 0;
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2259 == arg0.field1464) {
                method890(class170.field2415);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2232 == arg0.field1464) {
                int var248 = arg0.field1466 + var3.field2488;
                int var249 = var3.method3081();
                int var250 = var3.method3081();
                if (field1008 != var249) {
                    field1008 = var249;
                    this.method1035(false);
                    method641(field1008);
                    class83.method450(field1008);
                    for (int var251 = 0; var251 < 100; var251++) {
                        field1053[var251] = true;
                    }
                }
                while (var250-- > 0) {
                    int var252 = var3.method2996();
                    int var253 = var3.method3081();
                    int var254 = var3.method2945();
                    class68 var255 = (class68) field1009.method3340((long) var252);
                    if (var255 != null && var255.field771 != var253) {
                        method1017(var255, true);
                        var255 = null;
                    }
                    if (var255 == null) {
                        var255 = method3735(var252, var253, var254);
                    }
                    var255.field773 = true;
                }
                for (class68 var256 = (class68) field1009.method3343(); var256 != null; var256 = (class68) field1009.method3344()) {
                    if (var256.field773) {
                        var256.field773 = false;
                    } else {
                        method1017(var256, true);
                    }
                }
                field1050 = new class198(512);
                while (var3.field2488 < var248) {
                    int var257 = var3.method2996();
                    int var258 = var3.method3081();
                    int var259 = var3.method3081();
                    int var260 = var3.method2996();
                    for (int var261 = var258; var261 <= var259; var261++) {
                        long var262 = ((long) var257 << 32) + (long) var261;
                        field1050.method3352(new class206(var260), var262);
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2282 == arg0.field1464) {
                int var264 = var3.method2990();
                int var265 = var3.method2973();
                int var266 = var3.method2983();
                class68 var267 = (class68) field1009.method3340((long) var264);
                if (var267 != null) {
                    method1017(var267, var267.field771 != var266);
                }
                method3735(var264, var266, var265);
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2267 == arg0.field1464) {
                int var268 = var3.method2947();
                int var269 = var3.method2990();
                class224 var270 = class224.method934(var269);
                if (var270.field2761 != var268 || var268 == -1) {
                    var270.field2761 = var268;
                    var270.field2836 = 0;
                    var270.field2724 = 0;
                    method955(var270);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class167.field2264 == arg0.field1464) {
                Statics.field3398 = class286.method3679(var3.method2945());
                arg0.field1464 = null;
                return true;
            }
            class154.method607("" + (arg0.field1464 == null ? -1 : arg0.field1464.field2226) + class88.field1302 + (arg0.field1469 == null ? -1 : arg0.field1469.field2226) + class88.field1302 + (arg0.field1460 == null ? -1 : arg0.field1460.field2226) + class88.field1302 + arg0.field1466, (Throwable) null);
            method55();
        } catch (IOException var278) {
            method953();
        } catch (Exception var279) {
            String var273 = "" + (arg0.field1464 == null ? -1 : arg0.field1464.field2226) + class88.field1302 + (arg0.field1469 == null ? -1 : arg0.field1469.field2226) + class88.field1302 + (arg0.field1460 == null ? -1 : arg0.field1460.field2226) + class88.field1302 + arg0.field1466 + class88.field1302 + (Statics.field269 + Statics.field3721.field1200[0]) + class88.field1302 + (Statics.field854 + Statics.field3721.field1201[0]) + class88.field1302;
            for (int var274 = 0; var274 < arg0.field1466 && var274 < 50; var274++) {
                var273 = var273 + var3.field2495[var274] + class88.field1302;
            }
            class154.method607(var273, var279);
            method55();
        }
        return true;
    }

    @ObfuscatedName("bk.gg(Lfu;S)V")
    public static final void method890(class170 arg0) {
        class187 var1 = field906.field1462;
        if (class170.field2410 == arg0) {
            int var2 = var1.method2942();
            int var3 = (var2 >> 4 & 0x7) + Statics.field2416;
            int var4 = (var2 & 0x7) + Statics.field862;
            int var5 = var1.method3081();
            int var6 = var1.method2973();
            int var7 = var6 >> 2;
            int var8 = var6 & 0x3;
            int var9 = field1077[var7];
            if (var3 >= 0 && var4 >= 0 && var3 < 103 && var4 < 103) {
                if (var9 == 0) {
                    class142 var10 = Statics.field918.method2511(Statics.field376, var3, var4);
                    if (var10 != null) {
                        int var11 = var10.field2029 >> 14 & 0x7FFF;
                        if (var7 == 2) {
                            var10.field2030 = new class99(var11, 2, var8 + 4, Statics.field376, var3, var4, var5, false, var10.field2030);
                            var10.field2031 = new class99(var11, 2, var8 + 1 & 0x3, Statics.field376, var3, var4, var5, false, var10.field2031);
                        } else {
                            var10.field2030 = new class99(var11, var7, var8, Statics.field376, var3, var4, var5, false, var10.field2030);
                        }
                    }
                }
                if (var9 == 1) {
                    class147 var12 = Statics.field918.method2512(Statics.field376, var3, var4);
                    if (var12 != null) {
                        int var13 = var12.field2061 >> 14 & 0x7FFF;
                        if (var7 == 4 || var7 == 5) {
                            var12.field2067 = new class99(var13, 4, var8, Statics.field376, var3, var4, var5, false, var12.field2067);
                        } else if (var7 == 6) {
                            var12.field2067 = new class99(var13, 4, var8 + 4, Statics.field376, var3, var4, var5, false, var12.field2067);
                        } else if (var7 == 7) {
                            var12.field2067 = new class99(var13, 4, (var8 + 2 & 0x3) + 4, Statics.field376, var3, var4, var5, false, var12.field2067);
                        } else if (var7 == 8) {
                            var12.field2067 = new class99(var13, 4, var8 + 4, Statics.field376, var3, var4, var5, false, var12.field2067);
                            var12.field2069 = new class99(var13, 4, (var8 + 2 & 0x3) + 4, Statics.field376, var3, var4, var5, false, var12.field2069);
                        }
                    }
                }
                if (var9 == 2) {
                    class148 var14 = Statics.field918.method2513(Statics.field376, var3, var4);
                    if (var7 == 11) {
                        var7 = 10;
                    }
                    if (var14 != null) {
                        var14.field2078 = new class99(var14.field2085 >> 14 & 0x7FFF, var7, var8, Statics.field376, var3, var4, var5, false, var14.field2078);
                    }
                }
                if (var9 == 3) {
                    class129 var15 = Statics.field918.method2514(Statics.field376, var3, var4);
                    if (var15 != null) {
                        var15.field1772 = new class99(var15.field1775 >> 14 & 0x7FFF, 22, var8, Statics.field376, var3, var4, var5, false, var15.field1772);
                    }
                }
            }
        } else if (class170.field2407 == arg0) {
            int var16 = var1.method2942();
            int var17 = var16 >> 2;
            int var18 = var16 & 0x3;
            int var19 = field1077[var17];
            int var20 = var1.method2973();
            int var21 = (var20 >> 4 & 0x7) + Statics.field2416;
            int var22 = (var20 & 0x7) + Statics.field862;
            if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
                Statics.method141(Statics.field376, var21, var22, var19, -1, var17, var18, 0, -1);
            }
        } else if (class170.field2414 == arg0) {
            int var23 = var1.method2942() * 4;
            int var24 = var1.method2973() * 4;
            int var25 = var1.method2945();
            int var26 = (var25 >> 4 & 0x7) + Statics.field2416;
            int var27 = (var25 & 0x7) + Statics.field862;
            int var28 = var1.method2981();
            int var29 = var1.method2945();
            byte var30 = var1.method3037();
            int var31 = var1.method2981();
            byte var32 = var1.method2975();
            int var33 = var1.method2947();
            int var34 = var1.method2981();
            int var35 = var1.method2942();
            int var36 = var26 + var32;
            int var37 = var27 + var30;
            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104 && var34 != 65535) {
                int var38 = var26 * 128 + 64;
                int var39 = var27 * 128 + 64;
                int var40 = var36 * 128 + 64;
                int var41 = var37 * 128 + 64;
                class93 var42 = new class93(var34, Statics.field376, var38, var39, method118(var38, var39, Statics.field376) - var24, field872 + var31, field872 + var28, var35, var29, var33, var23);
                var42.method1615(var40, var41, method118(var40, var41, Statics.field376) - var23, field872 + var31);
                field947.method3400(var42);
            }
        } else if (class170.field2413 == arg0) {
            int var43 = var1.method2981();
            int var44 = var1.method2974();
            int var45 = (var44 >> 4 & 0x7) + Statics.field2416;
            int var46 = (var44 & 0x7) + Statics.field862;
            int var47 = var1.method3049();
            int var48 = var1.method2973();
            if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                int var49 = var45 * 128 + 64;
                int var50 = var46 * 128 + 64;
                class84 var51 = new class84(var47, Statics.field376, var49, var50, method118(var49, var50, Statics.field376) - var48, var43, field872);
                field981.method3400(var51);
            }
        } else if (class170.field2415 == arg0) {
            int var52 = var1.method2945();
            int var53 = (var52 >> 4 & 0x7) + Statics.field2416;
            int var54 = (var52 & 0x7) + Statics.field862;
            int var55 = var1.method2981();
            if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                class201 var56 = field978[Statics.field376][var53][var54];
                if (var56 != null) {
                    for (class94 var57 = (class94) var56.method3405(); var57 != null; var57 = (class94) var56.method3414()) {
                        if ((var55 & 0x7FFF) == var57.field1392) {
                            var57.method3392();
                            break;
                        }
                    }
                    if (var56.method3405() == null) {
                        field978[Statics.field376][var53][var54] = null;
                    }
                    method960(var53, var54);
                }
            }
        } else {
            if (class170.field2405 == arg0) {
                byte var58 = var1.method2948();
                byte var59 = var1.method2948();
                int var60 = var1.method3049();
                int var61 = var1.method2983();
                int var62 = var1.method3081();
                int var63 = var1.method2983();
                int var64 = var1.method2942();
                int var65 = var64 >> 2;
                int var66 = var64 & 0x3;
                int var67 = field1077[var65];
                int var68 = var1.method2974();
                int var69 = (var68 >> 4 & 0x7) + Statics.field2416;
                int var70 = (var68 & 0x7) + Statics.field862;
                byte var71 = var1.method2946();
                byte var72 = var1.method2975();
                class74 var73;
                if (field989 == var60) {
                    var73 = Statics.field3721;
                } else {
                    var73 = field1098[var60];
                }
                if (var73 != null) {
                    class263 var74 = class263.method2851(var63);
                    int var75;
                    int var76;
                    if (var66 == 1 || var66 == 3) {
                        var75 = var74.field3503;
                        var76 = var74.field3502;
                    } else {
                        var75 = var74.field3502;
                        var76 = var74.field3503;
                    }
                    int var77 = (var75 >> 1) + var69;
                    int var78 = (var75 + 1 >> 1) + var69;
                    int var79 = (var76 >> 1) + var70;
                    int var80 = (var76 + 1 >> 1) + var70;
                    int[][] var81 = class62.field709[Statics.field376];
                    int var82 = var81[var77][var79] + var81[var78][var79] + var81[var77][var80] + var81[var78][var80] >> 2;
                    int var83 = (var69 << 7) + (var75 << 6);
                    int var84 = (var70 << 7) + (var76 << 6);
                    class133 var85 = var74.method4242(var65, var66, var81, var83, var82, var84);
                    if (var85 != null) {
                        Statics.method141(Statics.field376, var69, var70, var67, -1, 0, 0, var62 + 1, var61 + 1);
                        var73.field840 = field872 + var62;
                        var73.field838 = field872 + var61;
                        var73.field828 = var85;
                        var73.field825 = var69 * 128 + var75 * 64;
                        var73.field827 = var70 * 128 + var76 * 64;
                        var73.field824 = var82;
                        if (var58 > var71) {
                            byte var86 = var58;
                            var58 = var71;
                            var71 = var86;
                        }
                        if (var72 > var59) {
                            byte var87 = var72;
                            var72 = var59;
                            var59 = var87;
                        }
                        var73.field829 = var58 + var69;
                        var73.field831 = var69 + var71;
                        var73.field830 = var70 + var72;
                        var73.field832 = var59 + var70;
                    }
                }
            }
            if (class170.field2406 == arg0) {
                int var88 = var1.method3049();
                int var89 = var1.method3049();
                int var90 = var1.method2945();
                int var91 = (var90 >> 4 & 0x7) + Statics.field2416;
                int var92 = (var90 & 0x7) + Statics.field862;
                int var93 = var1.method2983();
                if (var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104) {
                    class201 var94 = field978[Statics.field376][var91][var92];
                    if (var94 != null) {
                        for (class94 var95 = (class94) var94.method3405(); var95 != null; var95 = (class94) var94.method3414()) {
                            if ((var93 & 0x7FFF) == var95.field1392 && var95.field1391 == var89) {
                                var95.field1391 = var88;
                                break;
                            }
                        }
                        method960(var91, var92);
                    }
                }
            } else if (class170.field2411 == arg0) {
                int var96 = var1.method2945();
                int var97 = (var96 >> 4 & 0x7) + Statics.field2416;
                int var98 = (var96 & 0x7) + Statics.field862;
                int var99 = var1.method2981();
                int var100 = var1.method2942();
                int var101 = var100 >> 2;
                int var102 = var100 & 0x3;
                int var103 = field1077[var101];
                if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104) {
                    Statics.method141(Statics.field376, var97, var98, var103, var99, var101, var102, 0, -1);
                }
            } else {
                if (class170.field2409 == arg0) {
                    int var104 = var1.method2945();
                    int var105 = var1.method2974();
                    int var106 = (var105 >> 4 & 0x7) + Statics.field2416;
                    int var107 = (var105 & 0x7) + Statics.field862;
                    int var108 = var1.method3081();
                    int var109 = var1.method2973();
                    int var110 = var109 >> 4 & 0xF;
                    int var111 = var109 & 0x7;
                    if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104) {
                        int var112 = var110 + 1;
                        if (Statics.field3721.field1200[0] >= var106 - var112 && Statics.field3721.field1200[0] <= var106 + var112 && Statics.field3721.field1201[0] >= var107 - var112 && Statics.field3721.field1201[0] <= var107 + var112 && field1052 != 0 && var111 > 0 && field1032 < 50) {
                            field957[field1032] = var108;
                            field987[field1032] = var111;
                            field1087[field1032] = var104;
                            field883[field1032] = null;
                            field1093[field1032] = (var106 << 16) + (var107 << 8) + var110;
                            field1032++;
                        }
                    }
                }
                if (class170.field2408 == arg0) {
                    int var113 = var1.method2981();
                    int var114 = var1.method2981();
                    int var115 = var1.method2974();
                    int var116 = (var115 >> 4 & 0x7) + Statics.field2416;
                    int var117 = (var115 & 0x7) + Statics.field862;
                    if (var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104) {
                        class94 var118 = new class94();
                        var118.field1392 = var114;
                        var118.field1391 = var113;
                        if (field978[Statics.field376][var116][var117] == null) {
                            field978[Statics.field376][var116][var117] = new class201();
                        }
                        field978[Statics.field376][var116][var117].method3400(var118);
                        method960(var116, var117);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.gn(I)V")
    public static final void method512() {
        for (class77 var0 = (class77) field885.method3405(); var0 != null; var0 = (class77) field885.method3414()) {
            if (var0.field1130 == -1) {
                var0.field1144 = 0;
                method884(var0);
            } else {
                var0.method3392();
            }
        }
    }

    @ObfuscatedName("by.go(Lbj;I)V")
    public static final void method884(class77 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1131 == 0) {
            var1 = Statics.field918.method2515(arg0.field1138, arg0.field1129, arg0.field1132);
        }
        if (arg0.field1131 == 1) {
            var1 = Statics.field918.method2541(arg0.field1138, arg0.field1129, arg0.field1132);
        }
        if (arg0.field1131 == 2) {
            var1 = Statics.field918.method2517(arg0.field1138, arg0.field1129, arg0.field1132);
        }
        if (arg0.field1131 == 3) {
            var1 = Statics.field918.method2518(arg0.field1138, arg0.field1129, arg0.field1132);
        }
        if (var1 != 0) {
            int var5 = Statics.field918.method2519(arg0.field1138, arg0.field1129, arg0.field1132, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1134 = var2;
        arg0.field1139 = var3;
        arg0.field1133 = var4;
    }

    @ObfuscatedName("ar.gw(IIIIIIII)V")
    public static final void method295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field868 && Statics.field376 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field918.method2515(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field918.method2541(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field918.method2517(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field918.method2518(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field918.method2519(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field918.method2506(arg0, arg2, arg3);
                class263 var15 = class263.method2851(var12);
                if (var15.field3515 != 0) {
                    field916[arg0].method2810(arg2, arg3, var13, var14, var15.field3505);
                }
            }
            if (arg1 == 1) {
                Statics.field918.method2507(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field918.method2508(arg0, arg2, arg3);
                class263 var16 = class263.method2851(var12);
                if (var16.field3502 + arg2 > 103 || var16.field3502 + arg3 > 103 || var16.field3503 + arg2 > 103 || var16.field3503 + arg3 > 103) {
                    return;
                }
                if (var16.field3515 != 0) {
                    field916[arg0].method2811(arg2, arg3, var16.field3502, var16.field3503, var14, var16.field3505);
                }
            }
            if (arg1 == 3) {
                Statics.field918.method2603(arg0, arg2, arg3);
                class263 var17 = class263.method2851(var12);
                if (var17.field3515 == 1) {
                    field916[arg0].method2838(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class62.field713[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class139 var19 = Statics.field918;
        class163 var20 = field916[arg0];
        class263 var21 = class263.method2851(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field3503;
            var23 = var21.field3502;
        } else {
            var22 = var21.field3502;
            var23 = var21.field3503;
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
        int[][] var28 = class62.field709[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field3487 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field3522 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class141 var34;
            if (var21.field3498 == -1 && var21.field3528 == null) {
                var34 = var21.method4242(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class99(arg4, 22, arg5, var18, arg2, arg3, var21.field3498, true, (class141) null);
            }
            var19.method2495(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field3515 == 1) {
                var20.method2819(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class141 var57;
            if (var21.field3498 == -1 && var21.field3528 == null) {
                var57 = var21.method4242(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class99(arg4, 10, arg5, var18, arg2, arg3, var21.field3498, true, (class141) null);
            }
            if (var57 != null) {
                var19.method2499(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field3515 != 0) {
                var20.method2806(arg2, arg3, var22, var23, var21.field3505);
            }
        } else if (arg6 >= 12) {
            class141 var35;
            if (var21.field3498 == -1 && var21.field3528 == null) {
                var35 = var21.method4242(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class99(arg4, arg6, arg5, var18, arg2, arg3, var21.field3498, true, (class141) null);
            }
            var19.method2499(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field3515 != 0) {
                var20.method2806(arg2, arg3, var22, var23, var21.field3505);
            }
        } else if (arg6 == 0) {
            class141 var36;
            if (var21.field3498 == -1 && var21.field3528 == null) {
                var36 = var21.method4242(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class99(arg4, 0, arg5, var18, arg2, arg3, var21.field3498, true, (class141) null);
            }
            var19.method2497(arg0, arg2, arg3, var29, var36, (class141) null, class62.field710[arg5], 0, var32, var33);
            if (var21.field3515 != 0) {
                var20.method2814(arg2, arg3, arg6, arg5, var21.field3505);
            }
        } else if (arg6 == 1) {
            class141 var37;
            if (var21.field3498 == -1 && var21.field3528 == null) {
                var37 = var21.method4242(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class99(arg4, 1, arg5, var18, arg2, arg3, var21.field3498, true, (class141) null);
            }
            var19.method2497(arg0, arg2, arg3, var29, var37, (class141) null, class62.field711[arg5], 0, var32, var33);
            if (var21.field3515 != 0) {
                var20.method2814(arg2, arg3, arg6, arg5, var21.field3505);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class141 var39;
            class141 var40;
            if (var21.field3498 == -1 && var21.field3528 == null) {
                var39 = var21.method4242(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method4242(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class99(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field3498, true, (class141) null);
                var40 = new class99(arg4, 2, var38, var18, arg2, arg3, var21.field3498, true, (class141) null);
            }
            var19.method2497(arg0, arg2, arg3, var29, var39, var40, class62.field710[arg5], class62.field710[var38], var32, var33);
            if (var21.field3515 != 0) {
                var20.method2814(arg2, arg3, arg6, arg5, var21.field3505);
            }
        } else if (arg6 == 3) {
            class141 var41;
            if (var21.field3498 == -1 && var21.field3528 == null) {
                var41 = var21.method4242(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class99(arg4, 3, arg5, var18, arg2, arg3, var21.field3498, true, (class141) null);
            }
            var19.method2497(arg0, arg2, arg3, var29, var41, (class141) null, class62.field711[arg5], 0, var32, var33);
            if (var21.field3515 != 0) {
                var20.method2814(arg2, arg3, arg6, arg5, var21.field3505);
            }
        } else if (arg6 == 9) {
            class141 var42;
            if (var21.field3498 == -1 && var21.field3528 == null) {
                var42 = var21.method4242(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class99(arg4, arg6, arg5, var18, arg2, arg3, var21.field3498, true, (class141) null);
            }
            var19.method2499(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field3515 != 0) {
                var20.method2806(arg2, arg3, var22, var23, var21.field3505);
            }
        } else if (arg6 == 4) {
            class141 var43;
            if (var21.field3498 == -1 && var21.field3528 == null) {
                var43 = var21.method4242(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class99(arg4, 4, arg5, var18, arg2, arg3, var21.field3498, true, (class141) null);
            }
            var19.method2498(arg0, arg2, arg3, var29, var43, (class141) null, class62.field710[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method2515(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class263.method2851(var45 >> 14 & 0x7FFF).field3516;
            }
            class141 var46;
            if (var21.field3498 == -1 && var21.field3528 == null) {
                var46 = var21.method4242(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class99(arg4, 4, arg5, var18, arg2, arg3, var21.field3498, true, (class141) null);
            }
            var19.method2498(arg0, arg2, arg3, var29, var46, (class141) null, class62.field710[arg5], 0, class62.field705[arg5] * var44, class62.field722[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method2515(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class263.method2851(var48 >> 14 & 0x7FFF).field3516 / 2;
            }
            class141 var49;
            if (var21.field3498 == -1 && var21.field3528 == null) {
                var49 = var21.method4242(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class99(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3498, true, (class141) null);
            }
            var19.method2498(arg0, arg2, arg3, var29, var49, (class141) null, 256, arg5, class62.field714[arg5] * var47, class62.field715[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class141 var51;
            if (var21.field3498 == -1 && var21.field3528 == null) {
                var51 = var21.method4242(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class99(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field3498, true, (class141) null);
            }
            var19.method2498(arg0, arg2, arg3, var29, var51, (class141) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method2515(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class263.method2851(var53 >> 14 & 0x7FFF).field3516 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class141 var55;
            class141 var56;
            if (var21.field3498 == -1 && var21.field3528 == null) {
                var55 = var21.method4242(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method4242(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class99(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3498, true, (class141) null);
                var56 = new class99(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field3498, true, (class141) null);
            }
            var19.method2498(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class62.field714[arg5] * var52, class62.field715[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("bv.gc(III)V")
    public static final void method960(int arg0, int arg1) {
        class201 var2 = field978[Statics.field376][arg0][arg1];
        if (var2 == null) {
            Statics.field918.method2510(Statics.field376, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class94 var5 = null;
        for (class94 var6 = (class94) var2.method3405(); var6 != null; var6 = (class94) var2.method3414()) {
            class264 var7 = class264.method2662(var6.field1392);
            long var8 = (long) var7.field3564;
            if (var7.field3560 == 1) {
                var8 = (long) (var6.field1391 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field918.method2510(Statics.field376, arg0, arg1);
            return;
        }
        var2.method3401(var5);
        class94 var10 = null;
        class94 var11 = null;
        for (class94 var12 = (class94) var2.method3405(); var12 != null; var12 = (class94) var2.method3414()) {
            if (var5.field1392 != var12.field1392) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1392 != var12.field1392 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field918.method2496(Statics.field376, arg0, arg1, method118(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field376), var5, var13, var10, var11);
    }

    @ObfuscatedName("ac.gb(ZLgd;I)V")
    public static final void method446(boolean arg0, class187 arg1) {
        field1037 = 0;
        field1000 = 0;
        class187 var2 = field906.field1462;
        var2.method3214();
        int var3 = var2.method3208(8);
        if (var3 < field902) {
            for (int var4 = var3; var4 < field902; var4++) {
                field972[++field1037 - 1] = field893[var4];
            }
        }
        if (var3 > field902) {
            throw new RuntimeException("");
        }
        field902 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field893[var5];
            class86 var7 = field874[var6];
            int var8 = var2.method3208(1);
            if (var8 == 0) {
                field893[++field902 - 1] = var6;
                var7.field1194 = field872;
            } else {
                int var9 = var2.method3208(2);
                if (var9 == 0) {
                    field893[++field902 - 1] = var6;
                    var7.field1194 = field872;
                    field912[++field1000 - 1] = var6;
                } else if (var9 == 1) {
                    field893[++field902 - 1] = var6;
                    var7.field1194 = field872;
                    int var10 = var2.method3208(3);
                    var7.method1538(var10, (byte) 1);
                    int var11 = var2.method3208(1);
                    if (var11 == 1) {
                        field912[++field1000 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field893[++field902 - 1] = var6;
                    var7.field1194 = field872;
                    int var12 = var2.method3208(3);
                    var7.method1538(var12, (byte) 2);
                    int var13 = var2.method3208(3);
                    var7.method1538(var13, (byte) 2);
                    int var14 = var2.method3208(1);
                    if (var14 == 1) {
                        field912[++field1000 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field972[++field1037 - 1] = var6;
                }
            }
        }
        method1399(arg0, arg1);
        method3178(arg1);
        for (int var15 = 0; var15 < field1037; var15++) {
            int var16 = field972[var15];
            if (field872 != field874[var16].field1194) {
                field874[var16].field1289 = null;
                field874[var16] = null;
            }
        }
        if (field906.field1466 != arg1.field2488) {
            throw new RuntimeException(arg1.field2488 + class88.field1302 + field906.field1466);
        }
        for (int var17 = 0; var17 < field902; var17++) {
            if (field874[field893[var17]] == null) {
                throw new RuntimeException(var17 + class88.field1302 + field902);
            }
        }
    }

    @ObfuscatedName("bw.gk(ZLgd;I)V")
    public static final void method1399(boolean arg0, class187 arg1) {
        while (true) {
            if (arg1.method3209(field906.field1466) >= 27) {
                int var2 = arg1.method3208(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field874[var2] == null) {
                        field874[var2] = new class86();
                        var3 = true;
                    }
                    class86 var4 = field874[var2];
                    field893[++field902 - 1] = var2;
                    var4.field1194 = field872;
                    int var5 = arg1.method3208(1);
                    if (var5 == 1) {
                        field912[++field1000 - 1] = var2;
                    }
                    var4.field1289 = class266.method3591(arg1.method3208(14));
                    int var6 = field866[arg1.method3208(3)];
                    if (var3) {
                        var4.field1183 = var4.field1147 = var6;
                    }
                    int var7;
                    if (arg0) {
                        var7 = arg1.method3208(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = arg1.method3208(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    int var8;
                    if (arg0) {
                        var8 = arg1.method3208(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = arg1.method3208(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    int var9 = arg1.method3208(1);
                    var4.field1149 = var4.field1289.field3607;
                    var4.field1198 = var4.field1289.field3617;
                    if (var4.field1198 == 0) {
                        var4.field1147 = 0;
                    }
                    var4.field1153 = var4.field1289.field3625;
                    var4.field1154 = var4.field1289.field3604;
                    var4.field1155 = var4.field1289.field3615;
                    var4.field1156 = var4.field1289.field3623;
                    var4.field1150 = var4.field1289.field3610;
                    var4.field1151 = var4.field1289.field3630;
                    var4.field1172 = var4.field1289.field3634;
                    var4.method1539(Statics.field3721.field1200[0] + var7, Statics.field3721.field1201[0] + var8, var9 == 1);
                    continue;
                }
            }
            arg1.method3233();
            return;
        }
    }

    @ObfuscatedName("gz.hd(Lgd;I)V")
    public static final void method3178(class187 arg0) {
        for (int var1 = 0; var1 < field1000; var1++) {
            int var2 = field912[var1];
            class86 var3 = field874[var2];
            int var4 = arg0.method2945();
            if ((var4 & 0x20) != 0) {
                int var5 = arg0.method3049();
                int var6 = arg0.method3049();
                int var7 = var3.field1195 - (var5 - Statics.field269 - Statics.field269) * 64;
                int var8 = var3.field1157 - (var6 - Statics.field854 - Statics.field854) * 64;
                if (var7 != 0 || var8 != 0) {
                    var3.field1173 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field1289 = class266.method3591(arg0.method3049());
                var3.field1149 = var3.field1289.field3607;
                var3.field1198 = var3.field1289.field3617;
                var3.field1153 = var3.field1289.field3625;
                var3.field1154 = var3.field1289.field3604;
                var3.field1155 = var3.field1289.field3615;
                var3.field1156 = var3.field1289.field3623;
                var3.field1150 = var3.field1289.field3610;
                var3.field1151 = var3.field1289.field3630;
                var3.field1172 = var3.field1289.field3634;
            }
            if ((var4 & 0x4) != 0) {
                int var9 = arg0.method3049();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method2973();
                if (var3.field1158 == var9 && var9 != -1) {
                    int var11 = class268.method1560(var9).field3667;
                    if (var11 == 1) {
                        var3.field1178 = 0;
                        var3.field1145 = 0;
                        var3.field1180 = var10;
                        var3.field1189 = 0;
                    }
                    if (var11 == 2) {
                        var3.field1189 = 0;
                    }
                } else if (var9 == -1 || var3.field1158 == -1 || class268.method1560(var9).field3659 >= class268.method1560(var3.field1158).field3659) {
                    var3.field1158 = var9;
                    var3.field1178 = 0;
                    var3.field1145 = 0;
                    var3.field1180 = var10;
                    var3.field1189 = 0;
                    var3.field1204 = var3.field1199;
                }
            }
            if ((var4 & 0x10) != 0) {
                int var12 = arg0.method2973();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = arg0.method3086();
                        if (var17 == 32767) {
                            var17 = arg0.method3086();
                            var15 = arg0.method3086();
                            var14 = arg0.method3086();
                            var16 = arg0.method3086();
                        } else if (var17 == 32766) {
                            var17 = -1;
                        } else {
                            var15 = arg0.method3086();
                        }
                        int var18 = arg0.method3086();
                        var3.method1390(var17, var15, var14, var16, field872, var18);
                    }
                }
                int var19 = arg0.method2973();
                if (var19 > 0) {
                    for (int var20 = 0; var20 < var19; var20++) {
                        int var21 = arg0.method3086();
                        int var22 = arg0.method3086();
                        if (var22 == 32767) {
                            var3.method1385(var21);
                        } else {
                            int var23 = arg0.method3086();
                            int var24 = arg0.method2973();
                            int var25 = var22 > 0 ? arg0.method2942() : var24;
                            var3.method1398(var21, field872, var22, var23, var24, var25);
                        }
                    }
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1177 = arg0.method2953();
                var3.field1202 = 100;
            }
            if ((var4 & 0x1) != 0) {
                var3.field1182 = arg0.method3049();
                int var26 = arg0.method2991();
                var3.field1186 = var26 >> 16;
                var3.field1185 = (var26 & 0xFFFF) + field872;
                var3.field1191 = 0;
                var3.field1184 = 0;
                if (var3.field1185 > field872) {
                    var3.field1191 = -1;
                }
                if (var3.field1182 == 65535) {
                    var3.field1182 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field1171 = arg0.method3081();
                if (var3.field1171 == 65535) {
                    var3.field1171 = -1;
                }
            }
        }
    }

    @ObfuscatedName("bf.hw(Lbd;IIBI)V")
    public static final void method943(class74 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field1200[0];
        int var5 = arg0.field1201[0];
        int var6 = arg0.method990();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var9 = arg0.method990();
        field889.field2211 = arg1;
        field889.field2210 = arg2;
        field889.field2214 = 1;
        field889.field2212 = 1;
        class73 var10 = field889;
        int var11 = class164.method73(var4, var5, var9, var10, field916[arg0.field836], true, field1126, field1127);
        if (var11 >= 1) {
            for (int var12 = 0; var12 < var11 - 1; var12++) {
                arg0.method986(field1126[var12], field1127[var12], arg3);
            }
        }
    }

    @ObfuscatedName("bf.hs(I)V")
    public static void method944() {
        field1044 = 0;
        field964 = false;
        field1078[0] = class233.field3156;
        field993[0] = "";
        field919[0] = 1006;
        field944[0] = false;
        field1044 = 1;
    }

    @ObfuscatedName("client.hj(IIIII)V")
    public static final void method1380(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1051; var4++) {
            if (field1045[var4] + field1007[var4] > arg0 && field1007[var4] < arg0 + arg2 && field1059[var4] + field1057[var4] > arg1 && field1057[var4] < arg1 + arg3) {
                field1053[var4] = true;
            }
        }
    }

    @ObfuscatedName("gz.hp(IIIIS)V")
    public static final void method3177(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1051; var4++) {
            if (field1045[var4] + field1007[var4] > arg0 && field1007[var4] < arg0 + arg2 && field1059[var4] + field1057[var4] > arg1 && field1057[var4] < arg1 + arg3) {
                field1054[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hv(I)V")
    public final void method1032() {
        method946();
        if (Statics.field813 != null || field1021 != null) {
            return;
        }
        int var12;
        int var15;
        int var16;
        label196: {
            int var1 = class60.field688;
            if (field964) {
                if (var1 != 1 && (Statics.field2143 || var1 != 4)) {
                    int var2 = class60.field682;
                    int var3 = class60.field677;
                    if (var2 < Statics.field574 - 10 || var2 > Statics.field574 + Statics.field1283 + 10 || var3 < Statics.field2400 - 10 || var3 > Statics.field329 + Statics.field2400 + 10) {
                        field964 = false;
                        method1380(Statics.field574, Statics.field2400, Statics.field1283, Statics.field329);
                    }
                }
                if (var1 == 1 || !Statics.field2143 && var1 == 4) {
                    int var4 = Statics.field574;
                    int var5 = Statics.field2400;
                    int var6 = Statics.field1283;
                    int var7 = class60.field675;
                    int var8 = class60.field689;
                    int var9 = -1;
                    for (int var10 = 0; var10 < field1044; var10++) {
                        int var11 = (field1044 - 1 - var10) * 15 + var5 + 31;
                        if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                            var9 = var10;
                        }
                    }
                    if (var9 != -1) {
                        method2848(var9);
                    }
                    field964 = false;
                    method1380(Statics.field574, Statics.field2400, Statics.field1283, Statics.field329);
                }
            } else {
                var12 = field1044 - 1;
                if ((var1 == 1 || !Statics.field2143 && var1 == 4) && var12 >= 0) {
                    int var14 = field919[var12];
                    if (var14 == 39 || var14 == 40 || var14 == 41 || var14 == 42 || var14 == 43 || var14 == 33 || var14 == 34 || var14 == 35 || var14 == 36 || var14 == 37 || var14 == 38 || var14 == 1005) {
                        var15 = field988[var12];
                        var16 = field937[var12];
                        class224 var17 = class224.method934(var16);
                        int var18 = method57(var17);
                        boolean var19 = (var18 >> 28 & 0x1) != 0;
                        if (var19) {
                            break label196;
                        }
                        int var20 = method57(var17);
                        boolean var21 = (var20 >> 29 & 0x1) != 0;
                        if (var21) {
                            break label196;
                        }
                    }
                }
                if ((var1 == 1 || !Statics.field2143 && var1 == 4) && this.method1033()) {
                    var1 = 2;
                }
                if ((var1 == 1 || !Statics.field2143 && var1 == 4) && field1044 > 0 && var12 >= 0) {
                    int var22 = field988[var12];
                    int var23 = field937[var12];
                    int var24 = field919[var12];
                    int var25 = field953[var12];
                    String var26 = field1078[var12];
                    String var27 = field993[var12];
                    method79(var22, var23, var24, var25, var26, var27, class60.field675, class60.field689);
                }
                if (var1 == 2 && field1044 > 0) {
                    this.method1034(class60.field675, class60.field689);
                }
            }
            return;
        }
        if (Statics.field813 != null && !field965 && field1044 > 0 && !this.method1033()) {
            method459(field924, field963);
        }
        field965 = false;
        field966 = 0;
        if (Statics.field813 != null) {
            method955(Statics.field813);
        }
        Statics.field813 = class224.method934(var16);
        field891 = var15;
        field924 = class60.field675;
        field963 = class60.field689;
        if (var12 >= 0) {
            method2164(var12);
        }
        method955(Statics.field813);
    }

    @ObfuscatedName("client.ho(B)Z")
    public final boolean method1033() {
        int var1 = field1044 - 1;
        if (field1044 > 2) {
            if (field985 == 1 && !field944[var1]) {
                return true;
            }
            boolean var3;
            if (var1 < 0) {
                var3 = false;
            } else {
                int var4 = field919[var1];
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

    @ObfuscatedName("client.hr(III)V")
    public final void method1034(int arg0, int arg1) {
        int var3 = Statics.field910.method4482(class233.field3035);
        for (int var4 = 0; var4 < field1044; var4++) {
            class271 var5 = Statics.field910;
            String var6;
            if (var4 < 0) {
                var6 = "";
            } else if (field993[var4].length() > 0) {
                var6 = field1078[var4] + class233.field2971 + field993[var4];
            } else {
                var6 = field1078[var4];
            }
            int var7 = var5.method4482(var6);
            if (var7 > var3) {
                var3 = var7;
            }
        }
        var3 += 8;
        int var8 = field1044 * 15 + 22;
        int var9 = arg0 - var3 / 2;
        if (var3 + var9 > Statics.field764) {
            var9 = Statics.field764 - var3;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg1;
        if (var8 + arg1 > Statics.field1394) {
            var10 = Statics.field1394 - var8;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        Statics.field918.method2590(Statics.field376, arg0, arg1, false);
        field964 = true;
        Statics.field574 = var9;
        Statics.field2400 = var10;
        Statics.field1283 = var3;
        Statics.field329 = field1044 * 15 + 22;
    }

    @ObfuscatedName("fp.hg(IB)V")
    public static final void method2848(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field988[arg0];
        int var2 = field937[arg0];
        int var3 = field919[arg0];
        int var4 = field953[arg0];
        String var5 = field1078[arg0];
        String var6 = field993[arg0];
        method79(var1, var2, var3, var4, var5, var6, class60.field675, class60.field689);
    }

    @ObfuscatedName("j.hy(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method79(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 26) {
            method462();
        }
        if (arg2 == 39) {
            class171 var8 = class171.method124(class168.field2361, field906.field1461);
            var8.field2423.method2930(arg3);
            var8.field2423.method3129(arg0);
            var8.field2423.method3056(arg1);
            field906.method1715(var8);
            field959 = 0;
            Statics.field2443 = class224.method934(arg1);
            field960 = arg0;
        }
        if (arg2 == 1003) {
            field955 = arg6;
            field956 = arg7;
            field958 = 2;
            field969 = 0;
            class86 var9 = field874[arg3];
            if (var9 != null) {
                class266 var10 = var9.field1289;
                if (var10.field3633 != null) {
                    var10 = var10.method4333();
                }
                if (var10 != null) {
                    class171 var11 = class171.method124(class168.field2379, field906.field1461);
                    var11.field2423.method2930(var10.field3605);
                    field906.method1715(var11);
                }
            }
        }
        if (arg2 == 31) {
            class171 var12 = class171.method124(class168.field2354, field906.field1461);
            var12.field2423.method3129(Statics.field362);
            var12.field2423.method2930(arg0);
            var12.field2423.method2977(Statics.field3678);
            var12.field2423.method2980(Statics.field3459);
            var12.field2423.method2977(arg1);
            var12.field2423.method3129(arg3);
            field906.method1715(var12);
            field959 = 0;
            Statics.field2443 = class224.method934(arg1);
            field960 = arg0;
        }
        if (arg2 == 47) {
            class74 var13 = field1098[arg3];
            if (var13 != null) {
                field955 = arg6;
                field956 = arg7;
                field958 = 2;
                field969 = 0;
                field979 = arg0;
                field1081 = arg1;
                class171 var14 = class171.method124(class168.field2299, field906.field1461);
                var14.field2423.method2979(class51.field579[82] ? 1 : 0);
                var14.field2423.method3129(arg3);
                field906.method1715(var14);
            }
        }
        if (arg2 == 1002) {
            field955 = arg6;
            field956 = arg7;
            field958 = 2;
            field969 = 0;
            class171 var15 = class171.method124(class168.field2392, field906.field1461);
            var15.field2423.method2980(arg3 >> 14 & 0x7FFF);
            field906.method1715(var15);
        }
        if (arg2 == 13) {
            class86 var16 = field874[arg3];
            if (var16 != null) {
                field955 = arg6;
                field956 = arg7;
                field958 = 2;
                field969 = 0;
                field979 = arg0;
                field1081 = arg1;
                class171 var17 = class171.method124(class168.field2343, field906.field1461);
                var17.field2423.method2929(class51.field579[82] ? 1 : 0);
                var17.field2423.method2980(arg3);
                field906.method1715(var17);
            }
        }
        if (arg2 == 12) {
            class86 var18 = field874[arg3];
            if (var18 != null) {
                field955 = arg6;
                field956 = arg7;
                field958 = 2;
                field969 = 0;
                field979 = arg0;
                field1081 = arg1;
                class171 var19 = class171.method124(class168.field2326, field906.field1461);
                var19.field2423.method2979(class51.field579[82] ? 1 : 0);
                var19.field2423.method2980(arg3);
                field906.method1715(var19);
            }
        }
        if (arg2 == 35) {
            class171 var20 = class171.method124(class168.field2325, field906.field1461);
            var20.field2423.method2930(arg0);
            var20.field2423.method2989(arg1);
            var20.field2423.method2978(arg3);
            field906.method1715(var20);
            field959 = 0;
            Statics.field2443 = class224.method934(arg1);
            field960 = arg0;
        }
        if (arg2 == 14) {
            class74 var21 = field1098[arg3];
            if (var21 != null) {
                field955 = arg6;
                field956 = arg7;
                field958 = 2;
                field969 = 0;
                field979 = arg0;
                field1081 = arg1;
                class171 var22 = class171.method124(class168.field2381, field906.field1461);
                var22.field2423.method2978(Statics.field3459);
                var22.field2423.method3129(arg3);
                var22.field2423.method2989(Statics.field3678);
                var22.field2423.method2979(class51.field579[82] ? 1 : 0);
                var22.field2423.method2930(Statics.field362);
                field906.method1715(var22);
            }
        }
        if (arg2 == 58) {
            class224 var23 = class224.method2676(arg1, arg0);
            if (var23 != null) {
                class171 var24 = class171.method124(class168.field2384, field906.field1461);
                var24.field2423.method2980(field1004);
                var24.field2423.method2978(arg0);
                var24.field2423.method3056(Statics.field563);
                var24.field2423.method2930(var23.field2717);
                var24.field2423.method3129(field1005);
                var24.field2423.method2989(arg1);
                field906.method1715(var24);
            }
        }
        if (arg2 == 33) {
            class171 var25 = class171.method124(class168.field2313, field906.field1461);
            var25.field2423.method3056(arg1);
            var25.field2423.method2930(arg0);
            var25.field2423.method2978(arg3);
            field906.method1715(var25);
            field959 = 0;
            Statics.field2443 = class224.method934(arg1);
            field960 = arg0;
        }
        if (arg2 == 28) {
            class171 var26 = class171.method124(class168.field2335, field906.field1461);
            var26.field2423.method2977(arg1);
            field906.method1715(var26);
            class224 var27 = class224.method934(arg1);
            if (var27.field2826 != null && var27.field2826[0][0] == 5) {
                int var28 = var27.field2826[0][1];
                class219.field2680[var28] = 1 - class219.field2680[var28];
                method447(var28);
            }
        }
        if (arg2 == 3) {
            field955 = arg6;
            field956 = arg7;
            field958 = 2;
            field969 = 0;
            field979 = arg0;
            field1081 = arg1;
            class171 var29 = class171.method124(class168.field2319, field906.field1461);
            var29.field2423.method2930(Statics.field854 + arg1);
            var29.field2423.method2929(class51.field579[82] ? 1 : 0);
            var29.field2423.method2980(arg3 >> 14 & 0x7FFF);
            var29.field2423.method2930(Statics.field269 + arg0);
            field906.method1715(var29);
        }
        if (arg2 == 20) {
            field955 = arg6;
            field956 = arg7;
            field958 = 2;
            field969 = 0;
            field979 = arg0;
            field1081 = arg1;
            class171 var30 = class171.method124(class168.field2334, field906.field1461);
            var30.field2423.method2929(class51.field579[82] ? 1 : 0);
            var30.field2423.method2980(arg3);
            var30.field2423.method2978(Statics.field854 + arg1);
            var30.field2423.method2930(Statics.field269 + arg0);
            field906.method1715(var30);
        }
        if (arg2 == 22) {
            field955 = arg6;
            field956 = arg7;
            field958 = 2;
            field969 = 0;
            field979 = arg0;
            field1081 = arg1;
            class171 var31 = class171.method124(class168.field2367, field906.field1461);
            var31.field2423.method3129(arg3);
            var31.field2423.method2929(class51.field579[82] ? 1 : 0);
            var31.field2423.method3129(Statics.field269 + arg0);
            var31.field2423.method2978(Statics.field854 + arg1);
            field906.method1715(var31);
        }
        if (arg2 == 7) {
            class86 var32 = field874[arg3];
            if (var32 != null) {
                field955 = arg6;
                field956 = arg7;
                field958 = 2;
                field969 = 0;
                field979 = arg0;
                field1081 = arg1;
                class171 var33 = class171.method124(class168.field2370, field906.field1461);
                var33.field2423.method2930(Statics.field3459);
                var33.field2423.method2978(arg3);
                var33.field2423.method2980(Statics.field362);
                var33.field2423.method2971(class51.field579[82] ? 1 : 0);
                var33.field2423.method2989(Statics.field3678);
                field906.method1715(var33);
            }
        }
        if (arg2 == 40) {
            class171 var34 = class171.method124(class168.field2375, field906.field1461);
            var34.field2423.method2978(arg3);
            var34.field2423.method3056(arg1);
            var34.field2423.method2978(arg0);
            field906.method1715(var34);
            field959 = 0;
            Statics.field2443 = class224.method934(arg1);
            field960 = arg0;
        }
        if (arg2 == 25) {
            class224 var35 = class224.method2676(arg1, arg0);
            if (var35 != null) {
                method1553();
                int var36 = method57(var35);
                int var37 = var36 >> 11 & 0x3F;
                int var39 = var35.field2717;
                class224 var40 = class224.method2676(arg1, arg0);
                if (var40 != null && var40.field2736 != null) {
                    class69 var41 = new class69();
                    var41.field778 = var40;
                    var41.field786 = var40.field2736;
                    class83.method12(var41);
                }
                field1005 = var39;
                field1003 = true;
                Statics.field563 = arg1;
                field1004 = arg0;
                Statics.field388 = var37;
                method955(var40);
                field1001 = 0;
                int var42 = method57(var35);
                int var43 = var42 >> 11 & 0x3F;
                String var44;
                if (var43 == 0) {
                    var44 = null;
                } else if (var35.field2793 == null || var35.field2793.trim().length() == 0) {
                    var44 = null;
                } else {
                    var44 = var35.field2793;
                }
                field1046 = var44;
                if (field1046 == null) {
                    field1046 = "Null";
                }
                if (var35.field2757) {
                    field949 = var35.field2787 + class88.method3736(16777215);
                } else {
                    field949 = class88.method3736(65280) + var35.field2798 + class88.method3736(16777215);
                }
            }
            return;
        }
        if (arg2 == 46) {
            class74 var45 = field1098[arg3];
            if (var45 != null) {
                field955 = arg6;
                field956 = arg7;
                field958 = 2;
                field969 = 0;
                field979 = arg0;
                field1081 = arg1;
                class171 var46 = class171.method124(class168.field2383, field906.field1461);
                var46.field2423.method2969(class51.field579[82] ? 1 : 0);
                var46.field2423.method3129(arg3);
                field906.method1715(var46);
            }
        }
        if (arg2 == 16) {
            field955 = arg6;
            field956 = arg7;
            field958 = 2;
            field969 = 0;
            field979 = arg0;
            field1081 = arg1;
            class171 var47 = class171.method124(class168.field2301, field906.field1461);
            var47.field2423.method2969(class51.field579[82] ? 1 : 0);
            var47.field2423.method2978(Statics.field269 + arg0);
            var47.field2423.method2980(arg3);
            var47.field2423.method2980(Statics.field854 + arg1);
            var47.field2423.method2978(Statics.field362);
            var47.field2423.method3056(Statics.field3678);
            var47.field2423.method3129(Statics.field3459);
            field906.method1715(var47);
        }
        if (arg2 == 18) {
            field955 = arg6;
            field956 = arg7;
            field958 = 2;
            field969 = 0;
            field979 = arg0;
            field1081 = arg1;
            class171 var48 = class171.method124(class168.field2323, field906.field1461);
            var48.field2423.method2979(class51.field579[82] ? 1 : 0);
            var48.field2423.method2980(arg3);
            var48.field2423.method3129(Statics.field854 + arg1);
            var48.field2423.method3129(Statics.field269 + arg0);
            field906.method1715(var48);
        }
        if (arg2 == 5) {
            field955 = arg6;
            field956 = arg7;
            field958 = 2;
            field969 = 0;
            field979 = arg0;
            field1081 = arg1;
            class171 var49 = class171.method124(class168.field2363, field906.field1461);
            var49.field2423.method2978(Statics.field854 + arg1);
            var49.field2423.method2930(Statics.field269 + arg0);
            var49.field2423.method3129(arg3 >> 14 & 0x7FFF);
            var49.field2423.method2979(class51.field579[82] ? 1 : 0);
            field906.method1715(var49);
        }
        if (arg2 == 44) {
            class74 var50 = field1098[arg3];
            if (var50 != null) {
                field955 = arg6;
                field956 = arg7;
                field958 = 2;
                field969 = 0;
                field979 = arg0;
                field1081 = arg1;
                class171 var51 = class171.method124(class168.field2351, field906.field1461);
                var51.field2423.method2979(class51.field579[82] ? 1 : 0);
                var51.field2423.method3129(arg3);
                field906.method1715(var51);
            }
        }
        if (arg2 == 11) {
            class86 var52 = field874[arg3];
            if (var52 != null) {
                field955 = arg6;
                field956 = arg7;
                field958 = 2;
                field969 = 0;
                field979 = arg0;
                field1081 = arg1;
                class171 var53 = class171.method124(class168.field2305, field906.field1461);
                var53.field2423.method2930(arg3);
                var53.field2423.method2979(class51.field579[82] ? 1 : 0);
                field906.method1715(var53);
            }
        }
        if (arg2 == 38) {
            method1553();
            class224 var54 = class224.method934(arg1);
            field1001 = 1;
            Statics.field362 = arg0;
            Statics.field3678 = arg1;
            Statics.field3459 = arg3;
            method955(var54);
            field1002 = class88.method3736(16748608) + class264.method2662(arg3).field3547 + class88.method3736(16777215);
            if (field1002 == null) {
                field1002 = "null";
            }
            return;
        }
        if (arg2 == 24) {
            class224 var55 = class224.method934(arg1);
            boolean var56 = true;
            if (var55.field2718 > 0) {
                var56 = method14(var55);
            }
            if (var56) {
                class171 var57 = class171.method124(class168.field2335, field906.field1461);
                var57.field2423.method2977(arg1);
                field906.method1715(var57);
            }
        }
        if (arg2 == 4) {
            field955 = arg6;
            field956 = arg7;
            field958 = 2;
            field969 = 0;
            field979 = arg0;
            field1081 = arg1;
            class171 var58 = class171.method124(class168.field2327, field906.field1461);
            var58.field2423.method2978(Statics.field854 + arg1);
            var58.field2423.method2930(arg3 >> 14 & 0x7FFF);
            var58.field2423.method2969(class51.field579[82] ? 1 : 0);
            var58.field2423.method2980(Statics.field269 + arg0);
            field906.method1715(var58);
        }
        if (arg2 == 2) {
            field955 = arg6;
            field956 = arg7;
            field958 = 2;
            field969 = 0;
            field979 = arg0;
            field1081 = arg1;
            class171 var59 = class171.method124(class168.field2371, field906.field1461);
            var59.field2423.method2969(class51.field579[82] ? 1 : 0);
            var59.field2423.method2980(arg3 >> 14 & 0x7FFF);
            var59.field2423.method2989(Statics.field563);
            var59.field2423.method2978(Statics.field269 + arg0);
            var59.field2423.method3129(field1004);
            var59.field2423.method3129(Statics.field854 + arg1);
            field906.method1715(var59);
        }
        if (arg2 == 51) {
            class74 var60 = field1098[arg3];
            if (var60 != null) {
                field955 = arg6;
                field956 = arg7;
                field958 = 2;
                field969 = 0;
                field979 = arg0;
                field1081 = arg1;
                class171 var61 = class171.method124(class168.field2324, field906.field1461);
                var61.field2423.method2979(class51.field579[82] ? 1 : 0);
                var61.field2423.method2930(arg3);
                field906.method1715(var61);
            }
        }
        if (arg2 == 36) {
            class171 var62 = class171.method124(class168.field2345, field906.field1461);
            var62.field2423.method2980(arg3);
            var62.field2423.method2930(arg0);
            var62.field2423.method3056(arg1);
            field906.method1715(var62);
            field959 = 0;
            Statics.field2443 = class224.method934(arg1);
            field960 = arg0;
        }
        if (arg2 == 32) {
            class171 var63 = class171.method124(class168.field2369, field906.field1461);
            var63.field2423.method2980(arg0);
            var63.field2423.method2977(arg1);
            var63.field2423.method2930(arg3);
            var63.field2423.method2977(Statics.field563);
            var63.field2423.method2980(field1004);
            field906.method1715(var63);
            field959 = 0;
            Statics.field2443 = class224.method934(arg1);
            field960 = arg0;
        }
        if (arg2 == 8) {
            class86 var64 = field874[arg3];
            if (var64 != null) {
                field955 = arg6;
                field956 = arg7;
                field958 = 2;
                field969 = 0;
                field979 = arg0;
                field1081 = arg1;
                class171 var65 = class171.method124(class168.field2373, field906.field1461);
                var65.field2423.method2979(class51.field579[82] ? 1 : 0);
                var65.field2423.method2978(field1004);
                var65.field2423.method2977(Statics.field563);
                var65.field2423.method3129(arg3);
                field906.method1715(var65);
            }
        }
        if (arg2 == 21) {
            field955 = arg6;
            field956 = arg7;
            field958 = 2;
            field969 = 0;
            field979 = arg0;
            field1081 = arg1;
            class171 var66 = class171.method124(class168.field2310, field906.field1461);
            var66.field2423.method2979(class51.field579[82] ? 1 : 0);
            var66.field2423.method2978(Statics.field854 + arg1);
            var66.field2423.method2978(arg3);
            var66.field2423.method2930(Statics.field269 + arg0);
            field906.method1715(var66);
        }
        if (arg2 == 29) {
            class171 var67 = class171.method124(class168.field2335, field906.field1461);
            var67.field2423.method2977(arg1);
            field906.method1715(var67);
            class224 var68 = class224.method934(arg1);
            if (var68.field2826 != null && var68.field2826[0][0] == 5) {
                int var69 = var68.field2826[0][1];
                if (class219.field2680[var69] != var68.field2820[0]) {
                    class219.field2680[var69] = var68.field2820[0];
                    method447(var69);
                }
            }
        }
        if (arg2 == 30 && field879 == null) {
            method3805(arg1, arg0);
            field879 = class224.method2676(arg1, arg0);
            method955(field879);
        }
        if (arg2 == 9) {
            class86 var70 = field874[arg3];
            if (var70 != null) {
                field955 = arg6;
                field956 = arg7;
                field958 = 2;
                field969 = 0;
                field979 = arg0;
                field1081 = arg1;
                class171 var71 = class171.method124(class168.field2318, field906.field1461);
                var71.field2423.method3129(arg3);
                var71.field2423.method2971(class51.field579[82] ? 1 : 0);
                field906.method1715(var71);
            }
        }
        if (arg2 == 19) {
            field955 = arg6;
            field956 = arg7;
            field958 = 2;
            field969 = 0;
            field979 = arg0;
            field1081 = arg1;
            class171 var72 = class171.method124(class168.field2329, field906.field1461);
            var72.field2423.method2980(Statics.field854 + arg1);
            var72.field2423.method2980(arg3);
            var72.field2423.method2980(Statics.field269 + arg0);
            var72.field2423.method2929(class51.field579[82] ? 1 : 0);
            field906.method1715(var72);
        }
        if (arg2 == 17) {
            field955 = arg6;
            field956 = arg7;
            field958 = 2;
            field969 = 0;
            field979 = arg0;
            field1081 = arg1;
            class171 var73 = class171.method124(class168.field2378, field906.field1461);
            var73.field2423.method2930(arg3);
            var73.field2423.method2971(class51.field579[82] ? 1 : 0);
            var73.field2423.method2930(Statics.field269 + arg0);
            var73.field2423.method2978(field1004);
            var73.field2423.method3129(Statics.field854 + arg1);
            var73.field2423.method2989(Statics.field563);
            field906.method1715(var73);
        }
        if (arg2 == 1005) {
            class224 var74 = class224.method934(arg1);
            if (var74 == null || var74.field2833[arg0] < 100000) {
                class171 var75 = class171.method124(class168.field2377, field906.field1461);
                var75.field2423.method2980(arg3);
                field906.method1715(var75);
            } else {
                class97.method4(27, "", var74.field2833[arg0] + " x " + class264.method2662(arg3).field3547);
            }
            field959 = 0;
            Statics.field2443 = class224.method934(arg1);
            field960 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class224 var76 = class224.method2676(arg1, arg0);
            if (var76 != null) {
                method2399(arg3, arg1, arg0, var76.field2717, arg5);
            }
        }
        if (arg2 == 15) {
            class74 var77 = field1098[arg3];
            if (var77 != null) {
                field955 = arg6;
                field956 = arg7;
                field958 = 2;
                field969 = 0;
                field979 = arg0;
                field1081 = arg1;
                class171 var78 = class171.method124(class168.field2352, field906.field1461);
                var78.field2423.method3112(Statics.field563);
                var78.field2423.method2930(arg3);
                var78.field2423.method2980(field1004);
                var78.field2423.method2979(class51.field579[82] ? 1 : 0);
                field906.method1715(var78);
            }
        }
        if (arg2 == 43) {
            class171 var79 = class171.method124(class168.field2300, field906.field1461);
            var79.field2423.method2980(arg0);
            var79.field2423.method2980(arg3);
            var79.field2423.method2989(arg1);
            field906.method1715(var79);
            field959 = 0;
            Statics.field2443 = class224.method934(arg1);
            field960 = arg0;
        }
        if (arg2 == 10) {
            class86 var80 = field874[arg3];
            if (var80 != null) {
                field955 = arg6;
                field956 = arg7;
                field958 = 2;
                field969 = 0;
                field979 = arg0;
                field1081 = arg1;
                class171 var81 = class171.method124(class168.field2350, field906.field1461);
                var81.field2423.method2930(arg3);
                var81.field2423.method2979(class51.field579[82] ? 1 : 0);
                field906.method1715(var81);
            }
        }
        if (arg2 == 6) {
            field955 = arg6;
            field956 = arg7;
            field958 = 2;
            field969 = 0;
            field979 = arg0;
            field1081 = arg1;
            class171 var82 = class171.method124(class168.field2340, field906.field1461);
            var82.field2423.method3129(arg3 >> 14 & 0x7FFF);
            var82.field2423.method2930(Statics.field269 + arg0);
            var82.field2423.method2978(Statics.field854 + arg1);
            var82.field2423.method2979(class51.field579[82] ? 1 : 0);
            field906.method1715(var82);
        }
        if (arg2 == 1) {
            field955 = arg6;
            field956 = arg7;
            field958 = 2;
            field969 = 0;
            field979 = arg0;
            field1081 = arg1;
            class171 var83 = class171.method124(class168.field2382, field906.field1461);
            var83.field2423.method2980(Statics.field362);
            var83.field2423.method2929(class51.field579[82] ? 1 : 0);
            var83.field2423.method2978(Statics.field3459);
            var83.field2423.method2930(Statics.field854 + arg1);
            var83.field2423.method2977(Statics.field3678);
            var83.field2423.method2930(arg3 >> 14 & 0x7FFF);
            var83.field2423.method2930(Statics.field269 + arg0);
            field906.method1715(var83);
        }
        if (arg2 == 34) {
            class171 var84 = class171.method124(class168.field2366, field906.field1461);
            var84.field2423.method2978(arg0);
            var84.field2423.method2978(arg3);
            var84.field2423.method2977(arg1);
            field906.method1715(var84);
            field959 = 0;
            Statics.field2443 = class224.method934(arg1);
            field960 = arg0;
        }
        if (arg2 == 1004) {
            field955 = arg6;
            field956 = arg7;
            field958 = 2;
            field969 = 0;
            class171 var85 = class171.method124(class168.field2377, field906.field1461);
            var85.field2423.method2980(arg3);
            field906.method1715(var85);
        }
        if (arg2 == 50) {
            class74 var86 = field1098[arg3];
            if (var86 != null) {
                field955 = arg6;
                field956 = arg7;
                field958 = 2;
                field969 = 0;
                field979 = arg0;
                field1081 = arg1;
                class171 var87 = class171.method124(class168.field2385, field906.field1461);
                var87.field2423.method2929(class51.field579[82] ? 1 : 0);
                var87.field2423.method3129(arg3);
                field906.method1715(var87);
            }
        }
        if (arg2 == 23) {
            if (field964) {
                Statics.field918.method2527();
            } else {
                Statics.field918.method2590(Statics.field376, arg0, arg1, true);
            }
        }
        if (arg2 == 49) {
            class74 var88 = field1098[arg3];
            if (var88 != null) {
                field955 = arg6;
                field956 = arg7;
                field958 = 2;
                field969 = 0;
                field979 = arg0;
                field1081 = arg1;
                class171 var89 = class171.method124(class168.field2307, field906.field1461);
                var89.field2423.method2930(arg3);
                var89.field2423.method2929(class51.field579[82] ? 1 : 0);
                field906.method1715(var89);
            }
        }
        if (arg2 == 42) {
            class171 var90 = class171.method124(class168.field2372, field906.field1461);
            var90.field2423.method2977(arg1);
            var90.field2423.method2980(arg3);
            var90.field2423.method2978(arg0);
            field906.method1715(var90);
            field959 = 0;
            Statics.field2443 = class224.method934(arg1);
            field960 = arg0;
        }
        if (arg2 == 45) {
            class74 var91 = field1098[arg3];
            if (var91 != null) {
                field955 = arg6;
                field956 = arg7;
                field958 = 2;
                field969 = 0;
                field979 = arg0;
                field1081 = arg1;
                class171 var92 = class171.method124(class168.field2337, field906.field1461);
                var92.field2423.method3129(arg3);
                var92.field2423.method2979(class51.field579[82] ? 1 : 0);
                field906.method1715(var92);
            }
        }
        if (arg2 == 1001) {
            field955 = arg6;
            field956 = arg7;
            field958 = 2;
            field969 = 0;
            field979 = arg0;
            field1081 = arg1;
            class171 var93 = class171.method124(class168.field2394, field906.field1461);
            var93.field2423.method2978(arg3 >> 14 & 0x7FFF);
            var93.field2423.method2978(Statics.field854 + arg1);
            var93.field2423.method2980(Statics.field269 + arg0);
            var93.field2423.method2929(class51.field579[82] ? 1 : 0);
            field906.method1715(var93);
        }
        if (arg2 == 37) {
            class171 var94 = class171.method124(class168.field2338, field906.field1461);
            var94.field2423.method2978(arg3);
            var94.field2423.method2978(arg0);
            var94.field2423.method3056(arg1);
            field906.method1715(var94);
            field959 = 0;
            Statics.field2443 = class224.method934(arg1);
            field960 = arg0;
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field725.method4970(arg2, arg3, new class220(arg0), new class220(arg1));
        }
        if (arg2 == 48) {
            class74 var95 = field1098[arg3];
            if (var95 != null) {
                field955 = arg6;
                field956 = arg7;
                field958 = 2;
                field969 = 0;
                field979 = arg0;
                field1081 = arg1;
                class171 var96 = class171.method124(class168.field2348, field906.field1461);
                var96.field2423.method2980(arg3);
                var96.field2423.method2971(class51.field579[82] ? 1 : 0);
                field906.method1715(var96);
            }
        }
        if (arg2 == 41) {
            class171 var97 = class171.method124(class168.field2311, field906.field1461);
            var97.field2423.method2980(arg3);
            var97.field2423.method2980(arg0);
            var97.field2423.method2989(arg1);
            field906.method1715(var97);
            field959 = 0;
            Statics.field2443 = class224.method934(arg1);
            field960 = arg0;
        }
        if (field1001 != 0) {
            field1001 = 0;
            method955(class224.method934(Statics.field3678));
        }
        if (field1003) {
            method1553();
        }
        if (Statics.field2443 != null && field959 == 0) {
            method955(Statics.field2443);
        }
    }

    @ObfuscatedName("cq.hi(I)V")
    public static void method1553() {
        if (!field1003) {
            return;
        }
        class224 var0 = class224.method2676(Statics.field563, field1004);
        if (var0 != null && var0.field2806 != null) {
            class69 var1 = new class69();
            var1.field778 = var0;
            var1.field786 = var0.field2806;
            class83.method12(var1);
        }
        field1003 = false;
        method955(var0);
    }

    @ObfuscatedName("hn.hk(III)V")
    public static void method3805(int arg0, int arg1) {
        class171 var2 = class171.method124(class168.field2321, field906.field1461);
        var2.field2423.method2978(arg1);
        var2.field2423.method3112(arg0);
        field906.method1715(var2);
    }

    @ObfuscatedName("eh.ha(IIIILjava/lang/String;I)V")
    public static void method2399(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class224 var5 = class224.method2676(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2814 != null) {
            class69 var6 = new class69();
            var6.field778 = var5;
            var6.field784 = arg0;
            var6.field785 = arg4;
            var6.field786 = var5.field2814;
            class83.method12(var6);
        }
        boolean var7 = true;
        if (var5.field2718 > 0) {
            var7 = method14(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method57(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class171 var11 = class171.method124(class168.field2356, field906.field1461);
            var11.field2423.method2977(arg1);
            var11.field2423.method2930(arg2);
            var11.field2423.method2930(arg3);
            field906.method1715(var11);
        }
        if (arg0 == 2) {
            class171 var12 = class171.method124(class168.field2314, field906.field1461);
            var12.field2423.method2977(arg1);
            var12.field2423.method2930(arg2);
            var12.field2423.method2930(arg3);
            field906.method1715(var12);
        }
        if (arg0 == 3) {
            class171 var13 = class171.method124(class168.field2306, field906.field1461);
            var13.field2423.method2977(arg1);
            var13.field2423.method2930(arg2);
            var13.field2423.method2930(arg3);
            field906.method1715(var13);
        }
        if (arg0 == 4) {
            class171 var14 = class171.method124(class168.field2342, field906.field1461);
            var14.field2423.method2977(arg1);
            var14.field2423.method2930(arg2);
            var14.field2423.method2930(arg3);
            field906.method1715(var14);
        }
        if (arg0 == 5) {
            class171 var15 = class171.method124(class168.field2365, field906.field1461);
            var15.field2423.method2977(arg1);
            var15.field2423.method2930(arg2);
            var15.field2423.method2930(arg3);
            field906.method1715(var15);
        }
        if (arg0 == 6) {
            class171 var16 = class171.method124(class168.field2333, field906.field1461);
            var16.field2423.method2977(arg1);
            var16.field2423.method2930(arg2);
            var16.field2423.method2930(arg3);
            field906.method1715(var16);
        }
        if (arg0 == 7) {
            class171 var17 = class171.method124(class168.field2391, field906.field1461);
            var17.field2423.method2977(arg1);
            var17.field2423.method2930(arg2);
            var17.field2423.method2930(arg3);
            field906.method1715(var17);
        }
        if (arg0 == 8) {
            class171 var18 = class171.method124(class168.field2336, field906.field1461);
            var18.field2423.method2977(arg1);
            var18.field2423.method2930(arg2);
            var18.field2423.method2930(arg3);
            field906.method1715(var18);
        }
        if (arg0 == 9) {
            class171 var19 = class171.method124(class168.field2389, field906.field1461);
            var19.field2423.method2977(arg1);
            var19.field2423.method2930(arg2);
            var19.field2423.method2930(arg3);
            field906.method1715(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class171 var20 = class171.method124(class168.field2393, field906.field1461);
        var20.field2423.method2977(arg1);
        var20.field2423.method2930(arg2);
        var20.field2423.method2930(arg3);
        field906.method1715(var20);
    }

    @ObfuscatedName("bf.hq(I)V")
    public static final void method946() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field1044 - 1; var1++) {
                if (field919[var1] < 1000 && field919[var1 + 1] > 1000) {
                    String var2 = field993[var1];
                    field993[var1] = field993[var1 + 1];
                    field993[var1 + 1] = var2;
                    String var3 = field1078[var1];
                    field1078[var1] = field1078[var1 + 1];
                    field1078[var1 + 1] = var3;
                    int var4 = field919[var1];
                    field919[var1] = field919[var1 + 1];
                    field919[var1 + 1] = var4;
                    int var5 = field988[var1];
                    field988[var1] = field988[var1 + 1];
                    field988[var1 + 1] = var5;
                    int var6 = field937[var1];
                    field937[var1] = field937[var1 + 1];
                    field937[var1 + 1] = var6;
                    int var7 = field953[var1];
                    field953[var1] = field953[var1 + 1];
                    field953[var1 + 1] = var7;
                    boolean var8 = field944[var1];
                    field944[var1] = field944[var1 + 1];
                    field944[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("am.ht(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method289(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method294(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("ar.hx(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method294(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field964 || field1044 >= 500) {
            return;
        }
        field1078[field1044] = arg0;
        field993[field1044] = arg1;
        field919[field1044] = arg2;
        field953[field1044] = arg3;
        field988[field1044] = arg4;
        field937[field1044] = arg5;
        field944[field1044] = arg6;
        field1044++;
    }

    @ObfuscatedName("bf.hh(I)V")
    public static void method945() {
        for (int var0 = 0; var0 < field1044; var0++) {
            int var1 = field919[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field1044 - 1) {
                    for (int var3 = var0; var3 < field1044 - 1; var3++) {
                        field1078[var3] = field1078[var3 + 1];
                        field993[var3] = field993[var3 + 1];
                        field919[var3] = field919[var3 + 1];
                        field953[var3] = field953[var3 + 1];
                        field988[var3] = field988[var3 + 1];
                        field937[var3] = field937[var3 + 1];
                        field944[var3] = field944[var3 + 1];
                    }
                }
                field1044--;
            }
        }
    }

    @ObfuscatedName("ew.hm(Ljc;IIIB)V")
    public static final void method2711(class266 arg0, int arg1, int arg2, int arg3) {
        if (field1044 >= 400) {
            return;
        }
        if (arg0.field3633 != null) {
            arg0 = arg0.method4333();
        }
        if (arg0 == null || !arg0.field3612 || arg0.field3636 && field1016 != arg1) {
            return;
        }
        String var4 = arg0.field3606;
        if (arg0.field3614 != 0) {
            int var6 = arg0.field3614;
            int var7 = Statics.field3721.field820;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class88.method3736(16711680);
            } else if (var8 < -6) {
                var9 = class88.method3736(16723968);
            } else if (var8 < -3) {
                var9 = class88.method3736(16740352);
            } else if (var8 < 0) {
                var9 = class88.method3736(16756736);
            } else if (var8 > 9) {
                var9 = class88.method3736(65280);
            } else if (var8 > 6) {
                var9 = class88.method3736(4259584);
            } else if (var8 > 3) {
                var9 = class88.method3736(8453888);
            } else if (var8 > 0) {
                var9 = class88.method3736(12648192);
            } else {
                var9 = class88.method3736(16776960);
            }
            var4 = var4 + var9 + " " + class88.field1307 + class233.field3073 + arg0.field3614 + class88.field1305;
        }
        if (arg0.field3636 && field995) {
            method289(class233.field3066, class88.method3736(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1001 == 1) {
            method289(class233.field3067, field1002 + " " + class88.field1306 + " " + class88.method3736(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1003) {
            int var10 = arg0.field3636 && field995 ? 2000 : 0;
            String[] var11 = arg0.field3621;
            if (field1019) {
                var11 = method3989(var11);
            }
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class233.field3069)) {
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
                        method289(var11[var12], class88.method3736(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class233.field3069)) {
                        short var15 = 0;
                        if (field951 != class91.field1329) {
                            if (field951 == class91.field1323 || field951 == class91.field1326 && arg0.field3614 > Statics.field3721.field820) {
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
                            method289(var11[var14], class88.method3736(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3636 || !field995) {
                method289(class233.field3066, class88.method3736(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field388 & 0x2) == 2) {
            method289(field1046, field949 + " " + class88.field1306 + " " + class88.method3736(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("eh.hf(Lbd;IIIB)V")
    public static final void method2398(class74 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field3721 == arg0 || field1044 >= 400) {
            return;
        }
        String var9;
        if (arg0.field815 == 0) {
            String var4 = arg0.field837[0] + arg0.field823 + arg0.field837[1];
            int var5 = arg0.field820;
            int var6 = Statics.field3721.field820;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class88.method3736(16711680);
            } else if (var7 < -6) {
                var8 = class88.method3736(16723968);
            } else if (var7 < -3) {
                var8 = class88.method3736(16740352);
            } else if (var7 < 0) {
                var8 = class88.method3736(16756736);
            } else if (var7 > 9) {
                var8 = class88.method3736(65280);
            } else if (var7 > 6) {
                var8 = class88.method3736(4259584);
            } else if (var7 > 3) {
                var8 = class88.method3736(8453888);
            } else if (var7 > 0) {
                var8 = class88.method3736(12648192);
            } else {
                var8 = class88.method3736(16776960);
            }
            var9 = var4 + var8 + " " + class88.field1307 + class233.field3073 + arg0.field820 + class88.field1305 + arg0.field837[2];
        } else {
            var9 = arg0.field837[0] + arg0.field823 + arg0.field837[1] + " " + class88.field1307 + class233.field3074 + arg0.field815 + class88.field1305 + arg0.field837[2];
        }
        if (field1001 == 1) {
            method289(class233.field3067, field1002 + " " + class88.field1306 + " " + class88.method3736(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field1003) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field961[var10] != null) {
                    short var11 = 0;
                    if (field961[var10].equalsIgnoreCase(class233.field3069)) {
                        if (field1097 == class91.field1329) {
                            continue;
                        }
                        if (field1097 == class91.field1323 || field1097 == class91.field1326 && arg0.field820 > Statics.field3721.field820) {
                            var11 = 2000;
                        }
                        if (Statics.field3721.field817 != 0 && arg0.field817 != 0) {
                            if (Statics.field3721.field817 == arg0.field817) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field975[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field973[var10] + var11;
                    method289(field961[var10], class88.method3736(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field388 & 0x8) == 8) {
            method289(field1046, field949 + " " + class88.field1306 + " " + class88.method3736(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field1044; var14++) {
            if (field919[var14] == 23) {
                field993[var14] = class88.method3736(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ag.hc(IIIIIIIIB)V")
    public static final void method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class224.method936(arg0)) {
            Statics.field272 = null;
            method193(Statics.field2807[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field272 != null) {
                method193(Statics.field272, -1412584499, arg1, arg2, arg3, arg4, Statics.field341, Statics.field458, arg7);
                Statics.field272 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1053[var8] = true;
            }
        } else {
            field1053[arg7] = true;
        }
    }

    @ObfuscatedName("au.hb([Lhx;IIIIIIIII)V")
    public static final void method193(class224[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class291.method4712(arg2, arg3, arg4, arg5);
        class136.method2402();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class224 var10 = arg0[var9];
            if (var10 != null && (var10.field2733 == arg1 || arg1 == -1412584499 && field1021 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1007[field1051] = var10.field2727 + arg6;
                    field1057[field1051] = var10.field2728 + arg7;
                    field1045[field1051] = var10.field2729;
                    field1059[field1051] = var10.field2834;
                    var11 = ++field1051 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2845 = var11;
                var10.field2846 = field872;
                if (!var10.field2757 || !method3(var10)) {
                    if (var10.field2718 > 0) {
                        method3174(var10);
                    }
                    int var12 = var10.field2727 + arg6;
                    int var13 = var10.field2728 + arg7;
                    int var14 = var10.field2745;
                    if (field1021 == var10) {
                        if (arg1 != -1412584499 && !var10.field2792) {
                            Statics.field272 = arg0;
                            Statics.field341 = arg6;
                            Statics.field458 = arg7;
                            continue;
                        }
                        if (field994 && field1026) {
                            int var15 = class60.field682;
                            int var16 = class60.field677;
                            int var17 = var15 - field1023;
                            int var18 = var16 - field1122;
                            if (var17 < field1027) {
                                var17 = field1027;
                            }
                            if (var10.field2729 + var17 > field1027 + field1022.field2729) {
                                var17 = field1027 + field1022.field2729 - var10.field2729;
                            }
                            if (var18 < field1060) {
                                var18 = field1060;
                            }
                            if (var10.field2834 + var18 > field1060 + field1022.field2834) {
                                var18 = field1060 + field1022.field2834 - var10.field2834;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2792) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2747 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2747 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2729 + var12;
                        int var26 = var10.field2834 + var13;
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
                        int var29 = var10.field2729 + var12;
                        int var30 = var10.field2834 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2757 || var19 < var21 && var20 < var22) {
                        if (var10.field2718 != 0) {
                            if (var10.field2718 == 1336) {
                                if (field878) {
                                    var13 += 15;
                                    Statics.field1818.method4466("Fps:" + field658, var10.field2729 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field868) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field868) {
                                        var33 = 16711680;
                                    }
                                    Statics.field1818.method4466("Mem:" + var32 + "k", var10.field2729 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2718 == 1337) {
                                field997 = var12;
                                field1125 = var13;
                                method3947(var12, var13, var10.field2729, var10.field2834);
                                field1053[var10.field2845] = true;
                                class291.method4712(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2718 == 1338) {
                                method88(var10, var12, var13, var11);
                                class291.method4712(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2718 == 1339) {
                                class218 var34 = var10.method3746(false);
                                if (var34 != null) {
                                    if (field1109 < 3) {
                                        Statics.field1429.method4806(var12, var13, var34.field2674, var34.field2673, 25, 25, field922, 256, var34.field2676, var34.field2675);
                                    } else {
                                        class291.method4686(var12, var13, 0, var34.field2676, var34.field2675);
                                    }
                                }
                                class291.method4712(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2718 == 1400) {
                                Statics.field725.method4939(var12, var13, var10.field2729, var10.field2834, field872);
                            }
                            if (var10.field2718 == 1401) {
                                Statics.field725.method5063(var12, var13, var10.field2729, var10.field2834);
                            }
                        }
                        if (var10.field2747 == 0) {
                            if (!var10.field2757 && method3(var10) && Statics.field265 != var10) {
                                continue;
                            }
                            if (!var10.field2757) {
                                if (var10.field2759 > var10.field2766 - var10.field2834) {
                                    var10.field2759 = var10.field2766 - var10.field2834;
                                }
                                if (var10.field2759 < 0) {
                                    var10.field2759 = 0;
                                }
                            }
                            method193(arg0, var10.field2714, var19, var20, var21, var22, var12 - var10.field2735, var13 - var10.field2759, var11);
                            if (var10.field2838 != null) {
                                method193(var10.field2838, var10.field2714, var19, var20, var21, var22, var12 - var10.field2735, var13 - var10.field2759, var11);
                            }
                            class68 var35 = (class68) field1009.method3340((long) var10.field2714);
                            if (var35 != null) {
                                method522(var35.field771, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class291.method4712(arg2, arg3, arg4, arg5);
                            class136.method2402();
                        }
                        if (field942 || field873[var11] || field888 > 1) {
                            if (var10.field2747 == 0 && !var10.field2757 && var10.field2766 > var10.field2834) {
                                method445(var10.field2729 + var12, var13, var10.field2759, var10.field2834, var10.field2766);
                            }
                            if (var10.field2747 != 1) {
                                if (var10.field2747 == 2) {
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < var10.field2726; var37++) {
                                        for (int var38 = 0; var38 < var10.field2800; var38++) {
                                            int var39 = (var10.field2713 + 32) * var38 + var12;
                                            int var40 = (var10.field2781 + 32) * var37 + var13;
                                            if (var36 < 20) {
                                                var39 += var10.field2782[var36];
                                                var40 += var10.field2783[var36];
                                            }
                                            if (var10.field2832[var36] > 0) {
                                                boolean var41 = false;
                                                boolean var42 = false;
                                                int var43 = var10.field2832[var36] - 1;
                                                if (var39 + 32 > arg2 && var39 < arg4 && var40 + 32 > arg3 && var40 < arg5 || Statics.field813 == var10 && field891 == var36) {
                                                    class295 var44;
                                                    if (field1001 == 1 && Statics.field362 == var36 && Statics.field3678 == var10.field2714) {
                                                        var44 = class264.method1556(var43, var10.field2833[var36], 2, 0, 2, false);
                                                    } else {
                                                        var44 = class264.method1556(var43, var10.field2833[var36], 1, 3153952, 2, false);
                                                    }
                                                    if (var44 == null) {
                                                        method955(var10);
                                                    } else if (Statics.field813 == var10 && field891 == var36) {
                                                        int var45 = class60.field682 - field924;
                                                        int var46 = class60.field677 - field963;
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (var46 < 5 && var46 > -5) {
                                                            var46 = 0;
                                                        }
                                                        if (field966 < 5) {
                                                            var45 = 0;
                                                            var46 = 0;
                                                        }
                                                        var44.method4859(var39 + var45, var40 + var46, 128);
                                                        if (arg1 != -1) {
                                                            class224 var47 = arg0[arg1 & 0xFFFF];
                                                            if (var40 + var46 < class291.field3809 && var47.field2759 > 0) {
                                                                int var48 = field923 * (class291.field3809 - var40 - var46) / 3;
                                                                if (var48 > field923 * 10) {
                                                                    var48 = field923 * 10;
                                                                }
                                                                if (var48 > var47.field2759) {
                                                                    var48 = var47.field2759;
                                                                }
                                                                var47.field2759 -= var48;
                                                                field963 += var48;
                                                                method955(var47);
                                                            }
                                                            if (var40 + var46 + 32 > class291.field3810 && var47.field2759 < var47.field2766 - var47.field2834) {
                                                                int var49 = field923 * (var40 + var46 + 32 - class291.field3810) / 3;
                                                                if (var49 > field923 * 10) {
                                                                    var49 = field923 * 10;
                                                                }
                                                                if (var49 > var47.field2766 - var47.field2834 - var47.field2759) {
                                                                    var49 = var47.field2766 - var47.field2834 - var47.field2759;
                                                                }
                                                                var47.field2759 += var49;
                                                                field963 -= var49;
                                                                method955(var47);
                                                            }
                                                        }
                                                    } else if (Statics.field2443 == var10 && field960 == var36) {
                                                        var44.method4859(var39, var40, 128);
                                                    } else {
                                                        var44.method4793(var39, var40);
                                                    }
                                                }
                                            } else if (var10.field2712 != null && var36 < 20) {
                                                class295 var50 = var10.method3771(var36);
                                                if (var50 != null) {
                                                    var50.method4793(var39, var40);
                                                } else if (class224.field2819) {
                                                    method955(var10);
                                                }
                                            }
                                            var36++;
                                        }
                                    }
                                } else if (var10.field2747 == 3) {
                                    int var51;
                                    if (method958(var10)) {
                                        var51 = var10.field2835;
                                        if (Statics.field265 == var10 && var10.field2760 != 0) {
                                            var51 = var10.field2760;
                                        }
                                    } else {
                                        var51 = var10.field2739;
                                        if (Statics.field265 == var10 && var10.field2839 != 0) {
                                            var51 = var10.field2839;
                                        }
                                    }
                                    if (var10.field2743) {
                                        switch(var10.field2744.field3824) {
                                            case 1:
                                                class291.method4660(var12, var13, var10.field2729, var10.field2834, var10.field2739, var10.field2835, 256 - (var10.field2745 & 0xFF), 256 - (var10.field2746 & 0xFF));
                                                break;
                                            case 2:
                                                class291.method4731(var12, var13, var10.field2729, var10.field2834, var10.field2739, var10.field2835, 256 - (var10.field2745 & 0xFF), 256 - (var10.field2746 & 0xFF));
                                                break;
                                            case 3:
                                                class291.method4674(var12, var13, var10.field2729, var10.field2834, var10.field2739, var10.field2835, 256 - (var10.field2745 & 0xFF), 256 - (var10.field2746 & 0xFF));
                                                break;
                                            case 4:
                                                class291.method4675(var12, var13, var10.field2729, var10.field2834, var10.field2739, var10.field2835, 256 - (var10.field2745 & 0xFF), 256 - (var10.field2746 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class291.method4671(var12, var13, var10.field2729, var10.field2834, var51);
                                                } else {
                                                    class291.method4670(var12, var13, var10.field2729, var10.field2834, var51, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class291.method4678(var12, var13, var10.field2729, var10.field2834, var51);
                                    } else {
                                        class291.method4751(var12, var13, var10.field2729, var10.field2834, var51, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2747 == 4) {
                                    class271 var52 = var10.method3743();
                                    if (var52 != null) {
                                        String var53 = var10.field2774;
                                        int var54;
                                        if (method958(var10)) {
                                            var54 = var10.field2835;
                                            if (Statics.field265 == var10 && var10.field2760 != 0) {
                                                var54 = var10.field2760;
                                            }
                                            if (var10.field2775.length() > 0) {
                                                var53 = var10.field2775;
                                            }
                                        } else {
                                            var54 = var10.field2739;
                                            if (Statics.field265 == var10 && var10.field2839 != 0) {
                                                var54 = var10.field2839;
                                            }
                                        }
                                        if (var10.field2757 && var10.field2717 != -1) {
                                            class264 var55 = class264.method2662(var10.field2717);
                                            var53 = var55.field3547;
                                            if (var53 == null) {
                                                var53 = "null";
                                            }
                                            if ((var55.field3560 == 1 || var10.field2780 != 1) && var10.field2780 != -1) {
                                                var53 = class88.method3736(16748608) + var53 + class88.field1301 + " " + 'x' + method3806(var10.field2780);
                                            }
                                        }
                                        if (field879 == var10) {
                                            class233 var10000 = (class233) null;
                                            var53 = class233.field3117;
                                            var54 = var10.field2739;
                                        }
                                        if (!var10.field2757) {
                                            var53 = method1011(var53, var10);
                                        }
                                        var52.method4468(var53, var12, var13, var10.field2729, var10.field2834, var54, var10.field2779 ? 0 : -1, var10.field2777, var10.field2778, var10.field2707);
                                    } else if (class224.field2819) {
                                        method955(var10);
                                    }
                                } else if (var10.field2747 == 5) {
                                    if (var10.field2757) {
                                        class295 var57;
                                        if (var10.field2717 == -1) {
                                            var57 = var10.method3742(false);
                                        } else {
                                            var57 = class264.method1556(var10.field2717, var10.field2780, var10.field2828, var10.field2754, var10.field2788, false);
                                        }
                                        if (var57 != null) {
                                            int var58 = var57.field3834;
                                            int var59 = var57.field3840;
                                            if (var10.field2752) {
                                                class291.method4694(var12, var13, var10.field2729 + var12, var10.field2834 + var13);
                                                int var60 = (var10.field2729 + (var58 - 1)) / var58;
                                                int var61 = (var10.field2834 + (var59 - 1)) / var59;
                                                for (int var62 = 0; var62 < var60; var62++) {
                                                    for (int var63 = 0; var63 < var61; var63++) {
                                                        if (var10.field2751 != 0) {
                                                            var57.method4799(var58 / 2 + var58 * var62 + var12, var59 / 2 + var59 * var63 + var13, var10.field2751, 4096);
                                                        } else if (var14 == 0) {
                                                            var57.method4793(var58 * var62 + var12, var59 * var63 + var13);
                                                        } else {
                                                            var57.method4859(var58 * var62 + var12, var59 * var63 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class291.method4712(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var64 = var10.field2729 * 4096 / var58;
                                                if (var10.field2751 != 0) {
                                                    var57.method4799(var10.field2729 / 2 + var12, var10.field2834 / 2 + var13, var10.field2751, var64);
                                                } else if (var14 != 0) {
                                                    var57.method4824(var12, var13, var10.field2729, var10.field2834, 256 - (var14 & 0xFF));
                                                } else if (var10.field2729 == var58 && var10.field2834 == var59) {
                                                    var57.method4793(var12, var13);
                                                } else {
                                                    var57.method4797(var12, var13, var10.field2729, var10.field2834);
                                                }
                                            }
                                        } else if (class224.field2819) {
                                            method955(var10);
                                        }
                                    } else {
                                        class295 var56 = var10.method3742(method958(var10));
                                        if (var56 != null) {
                                            var56.method4793(var12, var13);
                                        } else if (class224.field2819) {
                                            method955(var10);
                                        }
                                    }
                                } else if (var10.field2747 == 6) {
                                    boolean var65 = method958(var10);
                                    int var66;
                                    if (var65) {
                                        var66 = var10.field2762;
                                    } else {
                                        var66 = var10.field2761;
                                    }
                                    class133 var67 = null;
                                    int var68 = 0;
                                    if (var10.field2717 != -1) {
                                        class264 var69 = class264.method2662(var10.field2717);
                                        if (var69 != null) {
                                            class264 var70 = var69.method4294(var10.field2780);
                                            var67 = var70.method4265(1);
                                            if (var67 == null) {
                                                method955(var10);
                                            } else {
                                                var67.method2312();
                                                var68 = var67.field2023 / 2;
                                            }
                                        }
                                    } else if (var10.field2720 == 5) {
                                        if (var10.field2758 == 0) {
                                            var67 = field1120.method3718((class268) null, -1, (class268) null, -1);
                                        } else {
                                            var67 = Statics.field3721.method983();
                                        }
                                    } else if (var66 == -1) {
                                        var67 = var10.method3745((class268) null, -1, var65, Statics.field3721.field816);
                                        if (var67 == null && class224.field2819) {
                                            method955(var10);
                                        }
                                    } else {
                                        class268 var71 = class268.method1560(var66);
                                        var67 = var10.method3745(var71, var10.field2836, var65, Statics.field3721.field816);
                                        if (var67 == null && class224.field2819) {
                                            method955(var10);
                                        }
                                    }
                                    class136.method2450(var10.field2729 / 2 + var12, var10.field2834 / 2 + var13);
                                    int var72 = var10.field2768 * class136.field1939[var10.field2765] >> 16;
                                    int var73 = var10.field2768 * class136.field1942[var10.field2765] >> 16;
                                    if (var67 != null) {
                                        if (var10.field2757) {
                                            var67.method2312();
                                            if (var10.field2815) {
                                                var67.method2326(0, var10.field2716, var10.field2711, var10.field2765, var10.field2763, var10.field2764 + var68 + var72, var10.field2764 + var73, var10.field2768);
                                            } else {
                                                var67.method2325(0, var10.field2716, var10.field2711, var10.field2765, var10.field2763, var10.field2764 + var68 + var72, var10.field2764 + var73);
                                            }
                                        } else {
                                            var67.method2325(0, var10.field2716, 0, var10.field2765, 0, var72, var73);
                                        }
                                    }
                                    class136.method2422();
                                } else {
                                    if (var10.field2747 == 7) {
                                        class271 var74 = var10.method3743();
                                        if (var74 == null) {
                                            if (class224.field2819) {
                                                method955(var10);
                                            }
                                            continue;
                                        }
                                        int var75 = 0;
                                        for (int var76 = 0; var76 < var10.field2726; var76++) {
                                            for (int var77 = 0; var77 < var10.field2800; var77++) {
                                                if (var10.field2832[var75] > 0) {
                                                    class264 var78 = class264.method2662(var10.field2832[var75] - 1);
                                                    String var79;
                                                    if (var78.field3560 != 1 && var10.field2833[var75] == 1) {
                                                        var79 = class88.method3736(16748608) + var78.field3547 + class88.field1301;
                                                    } else {
                                                        var79 = class88.method3736(16748608) + var78.field3547 + class88.field1301 + " " + 'x' + method3806(var10.field2833[var75]);
                                                    }
                                                    int var80 = (var10.field2713 + 115) * var77 + var12;
                                                    int var81 = (var10.field2781 + 12) * var76 + var13;
                                                    if (var10.field2777 == 0) {
                                                        var74.method4464(var79, var80, var81, var10.field2739, var10.field2779 ? 0 : -1);
                                                    } else if (var10.field2777 == 1) {
                                                        var74.method4467(var79, var10.field2729 / 2 + var80, var81, var10.field2739, var10.field2779 ? 0 : -1);
                                                    } else {
                                                        var74.method4466(var79, var10.field2729 + var80 - 1, var81, var10.field2739, var10.field2779 ? 0 : -1);
                                                    }
                                                }
                                                var75++;
                                            }
                                        }
                                    }
                                    if (var10.field2747 == 8 && Statics.field395 == var10 && field999 == field976) {
                                        int var82 = 0;
                                        int var83 = 0;
                                        class271 var84 = Statics.field1818;
                                        String var85 = var10.field2774;
                                        String var86 = method1011(var85, var10);
                                        while (var86.length() > 0) {
                                            int var87 = var86.indexOf(class88.field1312);
                                            String var88;
                                            if (var87 == -1) {
                                                var88 = var86;
                                                var86 = "";
                                            } else {
                                                var88 = var86.substring(0, var87);
                                                var86 = var86.substring(var87 + 4);
                                            }
                                            int var89 = var84.method4482(var88);
                                            if (var89 > var82) {
                                                var82 = var89;
                                            }
                                            var83 += var84.field3692 + 1;
                                        }
                                        var82 += 6;
                                        var83 += 7;
                                        int var90 = var10.field2729 + var12 - 5 - var82;
                                        int var91 = var10.field2834 + var13 + 5;
                                        if (var90 < var12 + 5) {
                                            var90 = var12 + 5;
                                        }
                                        if (var82 + var90 > arg4) {
                                            var90 = arg4 - var82;
                                        }
                                        if (var83 + var91 > arg5) {
                                            var91 = arg5 - var83;
                                        }
                                        class291.method4671(var90, var91, var82, var83, 16777120);
                                        class291.method4678(var90, var91, var82, var83, 0);
                                        String var92 = var10.field2774;
                                        int var93 = var84.field3692 + var91 + 2;
                                        String var94 = method1011(var92, var10);
                                        while (var94.length() > 0) {
                                            int var95 = var94.indexOf(class88.field1312);
                                            String var96;
                                            if (var95 == -1) {
                                                var96 = var94;
                                                var94 = "";
                                            } else {
                                                var96 = var94.substring(0, var95);
                                                var94 = var94.substring(var95 + 4);
                                            }
                                            var84.method4464(var96, var90 + 3, var93, 0, -1);
                                            var93 += var84.field3692 + 1;
                                        }
                                    }
                                    if (var10.field2747 == 9) {
                                        int var97;
                                        int var98;
                                        int var99;
                                        int var100;
                                        if (var10.field2748) {
                                            var97 = var12;
                                            var98 = var10.field2834 + var13;
                                            var99 = var10.field2729 + var12;
                                            var100 = var13;
                                        } else {
                                            var97 = var12;
                                            var98 = var13;
                                            var99 = var10.field2729 + var12;
                                            var100 = var10.field2834 + var13;
                                        }
                                        if (var10.field2756 == 1) {
                                            class291.method4684(var97, var98, var99, var100, var10.field2739);
                                        } else {
                                            method48(var97, var98, var99, var100, var10.field2739, var10.field2756);
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

    @ObfuscatedName("n.hz(IIIIIII)V")
    public static final void method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class291.field3808;
        int var18 = arg1 - class291.field3809;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class136.method2437(var19, var20, var21);
        class136.method2413(var23, var24, var25, var19, var20, var21, arg4);
        class136.method2437(var19, var21, var22);
        class136.method2413(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("bo.he(Ljava/lang/String;Lhx;B)Ljava/lang/String;")
    public static String method1011(String arg0, class224 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method195(method2661(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("id.hl(II)Ljava/lang/String;")
    public static final String method3806(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class88.field1302 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class88.method3736(65408) + var1.substring(0, var1.length() - 8) + class233.field3162 + " " + class88.field1307 + var1 + class88.field1305 + class88.field1301;
        } else if (var1.length() > 6) {
            return " " + class88.method3736(16777215) + var1.substring(0, var1.length() - 4) + class233.field3080 + " " + class88.field1307 + var1 + class88.field1305 + class88.field1301;
        } else {
            return " " + class88.method3736(16776960) + var1 + class88.field1301;
        }
    }

    @ObfuscatedName("client.hu(ZI)V")
    public final void method1035(boolean arg0) {
        method1544(field1008, Statics.field764, Statics.field1394, arg0);
    }

    @ObfuscatedName("client.hn(Lhx;I)V")
    public void method1236(class224 arg0) {
        class224 var2 = arg0.field2733 == -1 ? null : class224.method934(arg0.field2733);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field764;
            var4 = Statics.field1394;
        } else {
            var3 = var2.field2729;
            var4 = var2.field2834;
        }
        method3812(arg0, var3, var4, false);
        method972(arg0, var3, var4);
    }

    @ObfuscatedName("cp.id([Lhx;Lhx;ZI)V")
    public static void method1558(class224[] arg0, class224 arg1, boolean arg2) {
        int var3 = arg1.field2804 == 0 ? arg1.field2729 : arg1.field2804;
        int var4 = arg1.field2766 == 0 ? arg1.field2834 : arg1.field2766;
        method3785(arg0, arg1.field2714, var3, var4, arg2);
        if (arg1.field2838 != null) {
            method3785(arg1.field2838, arg1.field2714, var3, var4, arg2);
        }
        class68 var5 = (class68) field1009.method3340((long) arg1.field2714);
        if (var5 != null) {
            method1544(var5.field771, var3, var4, arg2);
        }
        if (arg1.field2718 == 1337) {
        }
    }

    @ObfuscatedName("cv.iw(IIIZI)V")
    public static final void method1544(int arg0, int arg1, int arg2, boolean arg3) {
        if (class224.method936(arg0)) {
            method3785(Statics.field2807[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("hx.ik([Lhx;IIIZI)V")
    public static void method3785(class224[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class224 var6 = arg0[var5];
            if (var6 != null && var6.field2733 == arg1) {
                method3812(var6, arg2, arg3, arg4);
                method972(var6, arg2, arg3);
                if (var6.field2735 > var6.field2804 - var6.field2729) {
                    var6.field2735 = var6.field2804 - var6.field2729;
                }
                if (var6.field2735 < 0) {
                    var6.field2735 = 0;
                }
                if (var6.field2759 > var6.field2766 - var6.field2834) {
                    var6.field2759 = var6.field2766 - var6.field2834;
                }
                if (var6.field2759 < 0) {
                    var6.field2759 = 0;
                }
                if (var6.field2747 == 0) {
                    method1558(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("io.iq(Lhx;IIZB)V")
    public static void method3812(class224 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2729;
        int var5 = arg0.field2834;
        if (arg0.field2721 == 0) {
            arg0.field2729 = arg0.field2800;
        } else if (arg0.field2721 == 1) {
            arg0.field2729 = arg1 - arg0.field2800;
        } else if (arg0.field2721 == 2) {
            arg0.field2729 = arg0.field2800 * arg1 >> 14;
        }
        if (arg0.field2742 == 0) {
            arg0.field2834 = arg0.field2726;
        } else if (arg0.field2742 == 1) {
            arg0.field2834 = arg2 - arg0.field2726;
        } else if (arg0.field2742 == 2) {
            arg0.field2834 = arg0.field2726 * arg2 >> 14;
        }
        if (arg0.field2721 == 4) {
            arg0.field2729 = arg0.field2834 * arg0.field2817 / arg0.field2795;
        }
        if (arg0.field2742 == 4) {
            arg0.field2834 = arg0.field2795 * arg0.field2729 / arg0.field2817;
        }
        if (field1018 && arg0.field2747 == 0) {
            if (arg0.field2834 < 5 && arg0.field2729 < 5) {
                arg0.field2834 = 5;
                arg0.field2729 = 5;
            } else {
                if (arg0.field2834 <= 0) {
                    arg0.field2834 = 5;
                }
                if (arg0.field2729 <= 0) {
                    arg0.field2729 = 5;
                }
            }
        }
        if (arg0.field2718 == 1337) {
            field1020 = arg0;
        }
        if (arg3 && arg0.field2823 != null && (arg0.field2729 != var4 || arg0.field2834 != var5)) {
            class69 var6 = new class69();
            var6.field778 = arg0;
            var6.field786 = arg0.field2823;
            field863.method3400(var6);
        }
    }

    @ObfuscatedName("bu.iy(Lhx;III)V")
    public static void method972(class224 arg0, int arg1, int arg2) {
        if (arg0.field2719 == 0) {
            arg0.field2727 = arg0.field2842;
        } else if (arg0.field2719 == 1) {
            arg0.field2727 = (arg1 - arg0.field2729) / 2 + arg0.field2842;
        } else if (arg0.field2719 == 2) {
            arg0.field2727 = arg1 - arg0.field2729 - arg0.field2842;
        } else if (arg0.field2719 == 3) {
            arg0.field2727 = arg0.field2842 * arg1 >> 14;
        } else if (arg0.field2719 == 4) {
            arg0.field2727 = (arg0.field2842 * arg1 >> 14) + (arg1 - arg0.field2729) / 2;
        } else {
            arg0.field2727 = arg1 - arg0.field2729 - (arg0.field2842 * arg1 >> 14);
        }
        if (arg0.field2722 == 0) {
            arg0.field2728 = arg0.field2776;
        } else if (arg0.field2722 == 1) {
            arg0.field2728 = (arg2 - arg0.field2834) / 2 + arg0.field2776;
        } else if (arg0.field2722 == 2) {
            arg0.field2728 = arg2 - arg0.field2834 - arg0.field2776;
        } else if (arg0.field2722 == 3) {
            arg0.field2728 = arg0.field2776 * arg2 >> 14;
        } else if (arg0.field2722 == 4) {
            arg0.field2728 = (arg0.field2776 * arg2 >> 14) + (arg2 - arg0.field2834) / 2;
        } else {
            arg0.field2728 = arg2 - arg0.field2834 - (arg0.field2776 * arg2 >> 14);
        }
        if (!field1018 || arg0.field2747 != 0) {
            return;
        }
        if (arg0.field2727 < 0) {
            arg0.field2727 = 0;
        } else if (arg0.field2729 + arg0.field2727 > arg1) {
            arg0.field2727 = arg1 - arg0.field2729;
        }
        if (arg0.field2728 < 0) {
            arg0.field2728 = 0;
        } else if (arg0.field2834 + arg0.field2728 > arg2) {
            arg0.field2728 = arg2 - arg0.field2834;
        }
    }

    @ObfuscatedName("et.io(Lhx;IIIIIIB)V")
    public static final void method2671(class224 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field928) {
            field929 = 32;
        } else {
            field929 = 0;
        }
        field928 = false;
        if (class60.field690 == 1 || !Statics.field2143 && class60.field690 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2759 -= 4;
                method955(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2759 += 4;
                method955(arg0);
            } else if (arg5 >= arg1 - field929 && arg5 < field929 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2759 = (arg4 - arg3) * var8 / var9;
                method955(arg0);
                field928 = true;
            }
        }
        if (field986 == 0) {
            return;
        }
        int var10 = arg0.field2729;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2759 += field986 * 45;
            method955(arg0);
        }
    }

    @ObfuscatedName("at.ic(IIIIIB)V")
    public static final void method445(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field633[0].method4778(arg0, arg1);
        Statics.field633[1].method4778(arg0, arg1 + arg3 - 16);
        class291.method4671(arg0, arg1 + 16, 16, arg3 - 32, field1062);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class291.method4671(arg0, arg1 + 16 + var6, 16, var5, field925);
        class291.method4709(arg0, arg1 + 16 + var6, var5, field927);
        class291.method4709(arg0 + 1, arg1 + 16 + var6, var5, field927);
        class291.method4680(arg0, arg1 + 16 + var6, 16, field927);
        class291.method4680(arg0, arg1 + 17 + var6, 16, field927);
        class291.method4709(arg0 + 15, arg1 + 16 + var6, var5, field926);
        class291.method4709(arg0 + 14, arg1 + 17 + var6, var5 - 1, field926);
        class291.method4680(arg0, arg1 + 15 + var6 + var5, 16, field926);
        class291.method4680(arg0 + 1, arg1 + 14 + var6 + var5, 15, field926);
    }

    @ObfuscatedName("au.il(IB)Ljava/lang/String;")
    public static final String method195(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("bv.ij(Lhx;I)Z")
    public static final boolean method958(class224 arg0) {
        if (arg0.field2827 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2827.length; var1++) {
            int var2 = method2661(arg0, var1);
            int var3 = arg0.field2820[var1];
            if (arg0.field2827[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2827[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2827[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ea.iz(Lhx;II)I")
    public static final int method2661(class224 arg0, int arg1) {
        if (arg0.field2826 == null || arg1 >= arg0.field2826.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2826[arg1];
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
                    var7 = field982[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field983[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field1094[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class224 var11 = class224.method934(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class264.method2662(var12).field3562 || field1058)) {
                        for (int var13 = 0; var13 < var11.field2832.length; var13++) {
                            if (var12 + 1 == var11.field2832[var13]) {
                                var7 += var11.field2833[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class219.field2680[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class230.field2901[field983[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class219.field2680[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field3721.field820;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class230.field2899[var14]) {
                            var7 += field983[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class224 var17 = class224.method934(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class264.method2662(var18).field3562 || field1058)) {
                        for (int var19 = 0; var19 < var17.field2832.length; var19++) {
                            if (var18 + 1 == var17.field2832[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1013;
                }
                if (var6 == 12) {
                    var7 = field1014;
                }
                if (var6 == 13) {
                    int var20 = class219.field2680[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class219.method122(var22);
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
                    var7 = (Statics.field3721.field1195 >> 7) + Statics.field269;
                }
                if (var6 == 19) {
                    var7 = (Statics.field3721.field1157 >> 7) + Statics.field854;
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

    @ObfuscatedName("bo.iu(Lhx;Ljj;IIZB)V")
    public static final void method1016(class224 arg0, class264 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3570;
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
            var7 = class233.field3108;
        }
        if (var6 != -1 && var7 != null) {
            method294(var7, class88.method3736(16748608) + arg1.field3547, var6, arg1.field3591, arg2, arg0.field2714, arg4);
        }
    }

    @ObfuscatedName("jp.is(IIIIIIII)V")
    public static final void method4326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class224.method936(arg0)) {
            method2694(Statics.field2807[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ef.it([Lhx;IIIIIIIB)V")
    public static final void method2694(class224[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class224 var9 = arg0[var8];
            if (var9 != null && (!var9.field2757 || var9.field2747 == 0 || var9.field2794 || method57(var9) != 0 || field1022 == var9 || var9.field2718 == 1338) && var9.field2733 == arg1 && (!var9.field2757 || !method3(var9))) {
                int var10 = var9.field2727 + arg6;
                int var11 = var9.field2728 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2747 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2747 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2729 + var10;
                    int var19 = var9.field2834 + var11;
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
                    int var22 = var9.field2729 + var10;
                    int var23 = var9.field2834 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1021 == var9) {
                    field1029 = true;
                    field1030 = var10;
                    field1031 = var11;
                }
                if (!var9.field2757 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field682;
                    int var25 = class60.field677;
                    if (class60.field688 != 0) {
                        var24 = class60.field675;
                        var25 = class60.field689;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2718 == 1337) {
                        if (!field1006 && !field964 && var26) {
                            if (field1001 == 0 && !field1003) {
                                method289(class233.field3072, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var27 = -1;
                            int var28 = -1;
                            for (int var29 = 0; var29 < class134.field1908; var29++) {
                                int var30 = class134.field1903[var29];
                                int var31 = var30 & 0x7F;
                                int var32 = var30 >> 7 & 0x7F;
                                int var33 = var30 >> 29 & 0x3;
                                int var34 = var30 >> 14 & 0x7FFF;
                                if (var28 != var30) {
                                    var28 = var30;
                                    if (var33 == 2 && Statics.field918.method2519(Statics.field376, var31, var32, var30) >= 0) {
                                        class263 var35 = class263.method2851(var34);
                                        if (var35.field3528 != null) {
                                            var35 = var35.method4228();
                                        }
                                        if (var35 == null) {
                                            continue;
                                        }
                                        if (field1001 == 1) {
                                            method289(class233.field3067, field1002 + " " + class88.field1306 + " " + class88.method3736(65535) + var35.field3497, 1, var30, var31, var32);
                                        } else if (!field1003) {
                                            String[] var36 = var35.field3514;
                                            if (field1019) {
                                                var36 = method3989(var36);
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
                                                        method289(var36[var37], class88.method3736(65535) + var35.field3497, var38, var30, var31, var32);
                                                    }
                                                }
                                            }
                                            method289(class233.field3066, class88.method3736(65535) + var35.field3497, 1002, var35.field3494 << 14, var31, var32);
                                        } else if ((Statics.field388 & 0x4) == 4) {
                                            method289(field1046, field949 + " " + class88.field1306 + " " + class88.method3736(65535) + var35.field3497, 2, var30, var31, var32);
                                        }
                                    }
                                    if (var33 == 1) {
                                        class86 var39 = field874[var34];
                                        if (var39 == null) {
                                            continue;
                                        }
                                        if (var39.field1289.field3607 == 1 && (var39.field1195 & 0x7F) == 64 && (var39.field1157 & 0x7F) == 64) {
                                            for (int var40 = 0; var40 < field902; var40++) {
                                                class86 var41 = field874[field893[var40]];
                                                if (var41 != null && var39 != var41 && var41.field1289.field3607 == 1 && var39.field1195 == var41.field1195 && var39.field1157 == var41.field1157) {
                                                    method2711(var41.field1289, field893[var40], var31, var32);
                                                }
                                            }
                                            int var42 = class95.field1401;
                                            int[] var43 = class95.field1402;
                                            for (int var44 = 0; var44 < var42; var44++) {
                                                class74 var45 = field1098[var43[var44]];
                                                if (var45 != null && var39.field1195 == var45.field1195 && var39.field1157 == var45.field1157) {
                                                    method2398(var45, var43[var44], var31, var32);
                                                }
                                            }
                                        }
                                        method2711(var39.field1289, var34, var31, var32);
                                    }
                                    if (var33 == 0) {
                                        class74 var46 = field1098[var34];
                                        if (var46 == null) {
                                            continue;
                                        }
                                        if ((var46.field1195 & 0x7F) == 64 && (var46.field1157 & 0x7F) == 64) {
                                            for (int var47 = 0; var47 < field902; var47++) {
                                                class86 var48 = field874[field893[var47]];
                                                if (var48 != null && var48.field1289.field3607 == 1 && var46.field1195 == var48.field1195 && var46.field1157 == var48.field1157) {
                                                    method2711(var48.field1289, field893[var47], var31, var32);
                                                }
                                            }
                                            int var49 = class95.field1401;
                                            int[] var50 = class95.field1402;
                                            for (int var51 = 0; var51 < var49; var51++) {
                                                class74 var52 = field1098[var50[var51]];
                                                if (var52 != null && var46 != var52 && var46.field1195 == var52.field1195 && var46.field1157 == var52.field1157) {
                                                    method2398(var52, var50[var51], var31, var32);
                                                }
                                            }
                                        }
                                        if (field1071 == var34) {
                                            var27 = var30;
                                        } else {
                                            method2398(var46, var34, var31, var32);
                                        }
                                    }
                                    if (var33 == 3) {
                                        class201 var53 = field978[Statics.field376][var31][var32];
                                        if (var53 != null) {
                                            for (class94 var54 = (class94) var53.method3406(); var54 != null; var54 = (class94) var53.method3408()) {
                                                class264 var55 = class264.method2662(var54.field1392);
                                                if (field1001 == 1) {
                                                    method289(class233.field3067, field1002 + " " + class88.field1306 + " " + class88.method3736(16748608) + var55.field3547, 16, var54.field1392, var31, var32);
                                                } else if (!field1003) {
                                                    String[] var56 = var55.field3563;
                                                    if (field1019) {
                                                        var56 = method3989(var56);
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
                                                            method289(var56[var57], class88.method3736(16748608) + var55.field3547, var58, var54.field1392, var31, var32);
                                                        } else if (var57 == 2) {
                                                            method289(class233.field2918, class88.method3736(16748608) + var55.field3547, 20, var54.field1392, var31, var32);
                                                        }
                                                    }
                                                    method289(class233.field3066, class88.method3736(16748608) + var55.field3547, 1004, var54.field1392, var31, var32);
                                                } else if ((Statics.field388 & 0x1) == 1) {
                                                    method289(field1046, field949 + " " + class88.field1306 + " " + class88.method3736(16748608) + var55.field3547, 17, var54.field1392, var31, var32);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var27 != -1) {
                                int var59 = var27 & 0x7F;
                                int var60 = var27 >> 7 & 0x7F;
                                class74 var61 = field1098[field1071];
                                method2398(var61, field1071, var59, var60);
                            }
                        }
                    } else if (var9.field2718 == 1338) {
                        method1667(var9, var10, var11);
                    } else {
                        if (var9.field2718 == 1400) {
                            Statics.field725.method4921(class60.field682, class60.field677, var26, var10, var11, var9.field2729, var9.field2834);
                        }
                        if (!field964 && var26) {
                            if (var9.field2718 == 1400) {
                                Statics.field725.method4968(var10, var11, var9.field2729, var9.field2834, var24, var25);
                            } else {
                                int var62 = var24 - var10;
                                int var63 = var25 - var11;
                                if (var9.field2725 == 1) {
                                    method289(var9.field2843, "", 24, 0, 0, var9.field2714);
                                }
                                if (var9.field2725 == 2 && !field1003) {
                                    int var64 = method57(var9);
                                    int var65 = var64 >> 11 & 0x3F;
                                    String var66;
                                    if (var65 == 0) {
                                        var66 = null;
                                    } else if (var9.field2793 == null || var9.field2793.trim().length() == 0) {
                                        var66 = null;
                                    } else {
                                        var66 = var9.field2793;
                                    }
                                    if (var66 != null) {
                                        method289(var66, class88.method3736(65280) + var9.field2798, 25, 0, -1, var9.field2714);
                                    }
                                }
                                if (var9.field2725 == 3) {
                                    method289(class233.field3076, "", 26, 0, 0, var9.field2714);
                                }
                                if (var9.field2725 == 4) {
                                    method289(var9.field2843, "", 28, 0, 0, var9.field2714);
                                }
                                if (var9.field2725 == 5) {
                                    method289(var9.field2843, "", 29, 0, 0, var9.field2714);
                                }
                                if (var9.field2725 == 6 && field879 == null) {
                                    method289(var9.field2843, "", 30, 0, -1, var9.field2714);
                                }
                                if (var9.field2747 == 2) {
                                    int var68 = 0;
                                    for (int var69 = 0; var69 < var9.field2834; var69++) {
                                        for (int var70 = 0; var70 < var9.field2729; var70++) {
                                            int var71 = (var9.field2713 + 32) * var70;
                                            int var72 = (var9.field2781 + 32) * var69;
                                            if (var68 < 20) {
                                                var71 += var9.field2782[var68];
                                                var72 += var9.field2783[var68];
                                            }
                                            if (var62 >= var71 && var63 >= var72 && var62 < var71 + 32 && var63 < var72 + 32) {
                                                field1112 = var68;
                                                Statics.field2710 = var9;
                                                if (var9.field2832[var68] > 0) {
                                                    class264 var73 = class264.method2662(var9.field2832[var68] - 1);
                                                    if (field1001 == 1 && class225.method3185(method57(var9))) {
                                                        if (Statics.field3678 != var9.field2714 || Statics.field362 != var68) {
                                                            method289(class233.field3067, field1002 + " " + class88.field1306 + " " + class88.method3736(16748608) + var73.field3547, 31, var73.field3591, var68, var9.field2714);
                                                        }
                                                    } else if (!field1003 || !class225.method3185(method57(var9))) {
                                                        String[] var74 = var73.field3570;
                                                        if (field1019) {
                                                            String[] var75 = method3989(var74);
                                                        }
                                                        int var76 = -1;
                                                        if (field996 && class51.field579[81]) {
                                                            var76 = var73.method4281();
                                                        }
                                                        if (class225.method3185(method57(var9))) {
                                                            for (int var77 = 4; var77 >= 3; var77--) {
                                                                if (var76 != var77) {
                                                                    method1016(var9, var73, var68, var77, false);
                                                                }
                                                            }
                                                        }
                                                        if (class225.method169(method57(var9))) {
                                                            method289(class233.field3067, class88.method3736(16748608) + var73.field3547, 38, var73.field3591, var68, var9.field2714);
                                                        }
                                                        if (class225.method3185(method57(var9))) {
                                                            for (int var78 = 2; var78 >= 0; var78--) {
                                                                if (var76 != var78) {
                                                                    method1016(var9, var73, var68, var78, false);
                                                                }
                                                            }
                                                            if (var76 >= 0) {
                                                                method1016(var9, var73, var68, var76, true);
                                                            }
                                                        }
                                                        String[] var79 = var9.field2785;
                                                        if (field1019) {
                                                            var79 = method3989(var79);
                                                        }
                                                        if (var79 != null) {
                                                            for (int var80 = 4; var80 >= 0; var80--) {
                                                                if (var79[var80] != null) {
                                                                    byte var81 = 0;
                                                                    if (var80 == 0) {
                                                                        var81 = 39;
                                                                    }
                                                                    if (var80 == 1) {
                                                                        var81 = 40;
                                                                    }
                                                                    if (var80 == 2) {
                                                                        var81 = 41;
                                                                    }
                                                                    if (var80 == 3) {
                                                                        var81 = 42;
                                                                    }
                                                                    if (var80 == 4) {
                                                                        var81 = 43;
                                                                    }
                                                                    method289(var79[var80], class88.method3736(16748608) + var73.field3547, var81, var73.field3591, var68, var9.field2714);
                                                                }
                                                            }
                                                        }
                                                        method289(class233.field3066, class88.method3736(16748608) + var73.field3547, 1005, var73.field3591, var68, var9.field2714);
                                                    } else if ((Statics.field388 & 0x10) == 16) {
                                                        method289(field1046, field949 + " " + class88.field1306 + " " + class88.method3736(16748608) + var73.field3547, 32, var73.field3591, var68, var9.field2714);
                                                    }
                                                }
                                            }
                                            var68++;
                                        }
                                    }
                                }
                                if (var9.field2757) {
                                    if (field1003) {
                                        int var82 = method57(var9);
                                        boolean var83 = (var82 >> 21 & 0x1) != 0;
                                        if (var83 && (Statics.field388 & 0x20) == 32) {
                                            method289(field1046, field949 + " " + class88.field1306 + " " + var9.field2787, 58, 0, var9.field2715, var9.field2714);
                                        }
                                    } else {
                                        for (int var84 = 9; var84 >= 5; var84--) {
                                            String var85 = method523(var9, var84);
                                            if (var85 != null) {
                                                method289(var85, var9.field2787, 1007, var84 + 1, var9.field2715, var9.field2714);
                                            }
                                        }
                                        int var86 = method57(var9);
                                        int var87 = var86 >> 11 & 0x3F;
                                        String var88;
                                        if (var87 == 0) {
                                            var88 = null;
                                        } else if (var9.field2793 == null || var9.field2793.trim().length() == 0) {
                                            var88 = null;
                                        } else {
                                            var88 = var9.field2793;
                                        }
                                        if (var88 != null) {
                                            method289(var88, var9.field2787, 25, 0, var9.field2715, var9.field2714);
                                        }
                                        for (int var90 = 4; var90 >= 0; var90--) {
                                            String var91 = method523(var9, var90);
                                            if (var91 != null) {
                                                method289(var91, var9.field2787, 57, var90 + 1, var9.field2715, var9.field2714);
                                            }
                                        }
                                        if (class225.method1474(method57(var9))) {
                                            method289(class233.field2923, "", 30, 0, var9.field2715, var9.field2714);
                                        }
                                    }
                                }
                            }
                        }
                        if (var9.field2747 == 0) {
                            if (!var9.field2757 && method3(var9) && Statics.field265 != var9) {
                                continue;
                            }
                            method2694(arg0, var9.field2714, var12, var13, var14, var15, var10 - var9.field2735, var11 - var9.field2759);
                            if (var9.field2838 != null) {
                                method2694(var9.field2838, var9.field2714, var12, var13, var14, var15, var10 - var9.field2735, var11 - var9.field2759);
                            }
                            class68 var92 = (class68) field1009.method3340((long) var9.field2714);
                            if (var92 != null) {
                                if (var92.field772 == 0 && class60.field682 >= var12 && class60.field677 >= var13 && class60.field682 < var14 && class60.field677 < var15 && !field964 && !field1018) {
                                    for (class69 var93 = (class69) field863.method3405(); var93 != null; var93 = (class69) field863.method3414()) {
                                        if (var93.field777) {
                                            var93.method3392();
                                            var93.field778.field2847 = false;
                                        }
                                    }
                                    if (Statics.field712 == 0) {
                                        field1021 = null;
                                        field1022 = null;
                                    }
                                    if (!field964) {
                                        method944();
                                    }
                                }
                                method4326(var92.field771, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2757) {
                            if (var9.field2730) {
                                if (class60.field682 >= var12 && class60.field677 >= var13 && class60.field682 < var14 && class60.field677 < var15) {
                                    for (class69 var94 = (class69) field863.method3405(); var94 != null; var94 = (class69) field863.method3414()) {
                                        if (var94.field777) {
                                            var94.method3392();
                                            var94.field778.field2847 = false;
                                        }
                                    }
                                    if (Statics.field712 == 0) {
                                        field1021 = null;
                                        field1022 = null;
                                    }
                                    if (!field964) {
                                        method944();
                                    }
                                }
                            } else if (var9.field2848 && class60.field682 >= var12 && class60.field677 >= var13 && class60.field682 < var14 && class60.field677 < var15) {
                                for (class69 var95 = (class69) field863.method3405(); var95 != null; var95 = (class69) field863.method3414()) {
                                    if (var95.field777 && var95.field778.field2771 == var95.field786) {
                                        var95.method3392();
                                    }
                                }
                            }
                            boolean var96;
                            if (class60.field682 >= var12 && class60.field677 >= var13 && class60.field682 < var14 && class60.field677 < var15) {
                                var96 = true;
                            } else {
                                var96 = false;
                            }
                            boolean var97 = false;
                            if ((class60.field690 == 1 || !Statics.field2143 && class60.field690 == 4) && var96) {
                                var97 = true;
                            }
                            boolean var98 = false;
                            if ((class60.field688 == 1 || !Statics.field2143 && class60.field688 == 4) && class60.field675 >= var12 && class60.field689 >= var13 && class60.field675 < var14 && class60.field689 < var15) {
                                var98 = true;
                            }
                            if (var98) {
                                method530(var9, class60.field675 - var10, class60.field689 - var11);
                            }
                            if (var9.field2718 == 1400) {
                                Statics.field725.method4922(class60.field682, class60.field677, var96 & var97, var96 & var98);
                            }
                            if (field1021 != null && field1021 != var9 && var96) {
                                int var99 = method57(var9);
                                boolean var100 = (var99 >> 20 & 0x1) != 0;
                                if (var100) {
                                    field1025 = var9;
                                }
                            }
                            if (field1022 == var9) {
                                field1026 = true;
                                field1027 = var10;
                                field1060 = var11;
                            }
                            if (var9.field2794) {
                                if (var96 && field986 != 0 && var9.field2771 != null) {
                                    class69 var101 = new class69();
                                    var101.field777 = true;
                                    var101.field778 = var9;
                                    var101.field776 = field986;
                                    var101.field786 = var9.field2771;
                                    field863.method3400(var101);
                                }
                                if (field1021 != null || Statics.field813 != null || field964) {
                                    var98 = false;
                                    var97 = false;
                                    var96 = false;
                                }
                                if (!var9.field2840 && var98) {
                                    var9.field2840 = true;
                                    if (var9.field2796 != null) {
                                        class69 var102 = new class69();
                                        var102.field777 = true;
                                        var102.field778 = var9;
                                        var102.field779 = class60.field675 - var10;
                                        var102.field776 = class60.field689 - var11;
                                        var102.field786 = var9.field2796;
                                        field863.method3400(var102);
                                    }
                                }
                                if (var9.field2840 && var97 && var9.field2797 != null) {
                                    class69 var103 = new class69();
                                    var103.field777 = true;
                                    var103.field778 = var9;
                                    var103.field779 = class60.field682 - var10;
                                    var103.field776 = class60.field677 - var11;
                                    var103.field786 = var9.field2797;
                                    field863.method3400(var103);
                                }
                                if (var9.field2840 && !var97) {
                                    var9.field2840 = false;
                                    if (var9.field2767 != null) {
                                        class69 var104 = new class69();
                                        var104.field777 = true;
                                        var104.field778 = var9;
                                        var104.field779 = class60.field682 - var10;
                                        var104.field776 = class60.field677 - var11;
                                        var104.field786 = var9.field2767;
                                        field1049.method3400(var104);
                                    }
                                }
                                if (var97 && var9.field2799 != null) {
                                    class69 var105 = new class69();
                                    var105.field777 = true;
                                    var105.field778 = var9;
                                    var105.field779 = class60.field682 - var10;
                                    var105.field776 = class60.field677 - var11;
                                    var105.field786 = var9.field2799;
                                    field863.method3400(var105);
                                }
                                if (!var9.field2847 && var96) {
                                    var9.field2847 = true;
                                    if (var9.field2740 != null) {
                                        class69 var106 = new class69();
                                        var106.field777 = true;
                                        var106.field778 = var9;
                                        var106.field779 = class60.field682 - var10;
                                        var106.field776 = class60.field677 - var11;
                                        var106.field786 = var9.field2740;
                                        field863.method3400(var106);
                                    }
                                }
                                if (var9.field2847 && var96 && var9.field2801 != null) {
                                    class69 var107 = new class69();
                                    var107.field777 = true;
                                    var107.field778 = var9;
                                    var107.field779 = class60.field682 - var10;
                                    var107.field776 = class60.field677 - var11;
                                    var107.field786 = var9.field2801;
                                    field863.method3400(var107);
                                }
                                if (var9.field2847 && !var96) {
                                    var9.field2847 = false;
                                    if (var9.field2837 != null) {
                                        class69 var108 = new class69();
                                        var108.field777 = true;
                                        var108.field778 = var9;
                                        var108.field779 = class60.field682 - var10;
                                        var108.field776 = class60.field677 - var11;
                                        var108.field786 = var9.field2837;
                                        field1049.method3400(var108);
                                    }
                                }
                                if (var9.field2813 != null) {
                                    class69 var109 = new class69();
                                    var109.field778 = var9;
                                    var109.field786 = var9.field2813;
                                    field1048.method3400(var109);
                                }
                                if (var9.field2772 != null && field1035 > var9.field2753) {
                                    if (var9.field2808 == null || field1035 - var9.field2753 > 32) {
                                        class69 var114 = new class69();
                                        var114.field778 = var9;
                                        var114.field786 = var9.field2772;
                                        field863.method3400(var114);
                                    } else {
                                        label918: for (int var110 = var9.field2753; var110 < field1035; var110++) {
                                            int var111 = field1034[var110 & 0x1F];
                                            for (int var112 = 0; var112 < var9.field2808.length; var112++) {
                                                if (var9.field2808[var112] == var111) {
                                                    class69 var113 = new class69();
                                                    var113.field778 = var9;
                                                    var113.field786 = var9.field2772;
                                                    field863.method3400(var113);
                                                    break label918;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2753 = field1035;
                                }
                                if (var9.field2809 != null && field974 > var9.field2731) {
                                    if (var9.field2738 == null || field974 - var9.field2731 > 32) {
                                        class69 var119 = new class69();
                                        var119.field778 = var9;
                                        var119.field786 = var9.field2809;
                                        field863.method3400(var119);
                                    } else {
                                        label894: for (int var115 = var9.field2731; var115 < field974; var115++) {
                                            int var116 = field1036[var115 & 0x1F];
                                            for (int var117 = 0; var117 < var9.field2738.length; var117++) {
                                                if (var9.field2738[var117] == var116) {
                                                    class69 var118 = new class69();
                                                    var118.field778 = var9;
                                                    var118.field786 = var9.field2809;
                                                    field863.method3400(var118);
                                                    break label894;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2731 = field974;
                                }
                                if (var9.field2811 != null && field1039 > var9.field2844) {
                                    if (var9.field2812 == null || field1039 - var9.field2844 > 32) {
                                        class69 var124 = new class69();
                                        var124.field778 = var9;
                                        var124.field786 = var9.field2811;
                                        field863.method3400(var124);
                                    } else {
                                        label870: for (int var120 = var9.field2844; var120 < field1039; var120++) {
                                            int var121 = field1038[var120 & 0x1F];
                                            for (int var122 = 0; var122 < var9.field2812.length; var122++) {
                                                if (var9.field2812[var122] == var121) {
                                                    class69 var123 = new class69();
                                                    var123.field778 = var9;
                                                    var123.field786 = var9.field2811;
                                                    field863.method3400(var123);
                                                    break label870;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2844 = field1039;
                                }
                                if (field1040 > var9.field2841 && var9.field2816 != null) {
                                    class69 var125 = new class69();
                                    var125.field778 = var9;
                                    var125.field786 = var9.field2816;
                                    field863.method3400(var125);
                                }
                                if (field1041 > var9.field2841 && var9.field2818 != null) {
                                    class69 var126 = new class69();
                                    var126.field778 = var9;
                                    var126.field786 = var9.field2818;
                                    field863.method3400(var126);
                                }
                                if (field1047 > var9.field2841 && var9.field2805 != null) {
                                    class69 var127 = new class69();
                                    var127.field778 = var9;
                                    var127.field786 = var9.field2805;
                                    field863.method3400(var127);
                                }
                                if (field1043 > var9.field2841 && var9.field2824 != null) {
                                    class69 var128 = new class69();
                                    var128.field778 = var9;
                                    var128.field786 = var9.field2824;
                                    field863.method3400(var128);
                                }
                                if (field968 > var9.field2841 && var9.field2825 != null) {
                                    class69 var129 = new class69();
                                    var129.field778 = var9;
                                    var129.field786 = var9.field2825;
                                    field863.method3400(var129);
                                }
                                if (field865 > var9.field2841 && var9.field2703 != null) {
                                    class69 var130 = new class69();
                                    var130.field778 = var9;
                                    var130.field786 = var9.field2703;
                                    field863.method3400(var130);
                                }
                                var9.field2841 = field1033;
                                if (var9.field2732 != null) {
                                    for (int var131 = 0; var131 < field1069; var131++) {
                                        class69 var132 = new class69();
                                        var132.field778 = var9;
                                        var132.field783 = field971[var131];
                                        var132.field781 = field1070[var131];
                                        var132.field786 = var9.field2732;
                                        field863.method3400(var132);
                                    }
                                }
                            }
                        }
                        if (!var9.field2757 && field1021 == null && Statics.field813 == null && !field964) {
                            if ((var9.field2829 >= 0 || var9.field2839 != 0) && class60.field682 >= var12 && class60.field677 >= var13 && class60.field682 < var14 && class60.field677 < var15) {
                                if (var9.field2829 >= 0) {
                                    Statics.field265 = arg0[var9.field2829];
                                } else {
                                    Statics.field265 = var9;
                                }
                            }
                            if (var9.field2747 == 8 && class60.field682 >= var12 && class60.field677 >= var13 && class60.field682 < var14 && class60.field677 < var15) {
                                Statics.field395 = var9;
                            }
                            if (var9.field2766 > var9.field2834) {
                                method2671(var9, var9.field2729 + var10, var11, var9.field2834, var9.field2766, class60.field682, class60.field677);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("p.ih([Lhx;II)V")
    public static final void method136(class224[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class224 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2747 == 0) {
                    if (var3.field2838 != null) {
                        method136(var3.field2838, arg1);
                    }
                    class68 var4 = (class68) field1009.method3340((long) var3.field2714);
                    if (var4 != null) {
                        int var5 = var4.field771;
                        if (class224.method936(var5)) {
                            method136(Statics.field2807[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2821 != null) {
                    class69 var6 = new class69();
                    var6.field778 = var3;
                    var6.field786 = var3.field2821;
                    class83.method12(var6);
                }
                if (arg1 == 1 && var3.field2822 != null) {
                    if (var3.field2715 >= 0) {
                        class224 var7 = class224.method934(var3.field2714);
                        if (var7 == null || var7.field2838 == null || var3.field2715 >= var7.field2838.length || var7.field2838[var3.field2715] != var3) {
                            continue;
                        }
                    }
                    class69 var8 = new class69();
                    var8.field778 = var3;
                    var8.field786 = var3.field2822;
                    class83.method12(var8);
                }
            }
        }
    }

    @ObfuscatedName("af.ip(Lhx;IIB)V")
    public static final void method530(class224 arg0, int arg1, int arg2) {
        if (field1021 != null || field964 || arg0 == null) {
            return;
        }
        class224 var3 = method1554(arg0);
        if (var3 == null) {
            var3 = arg0.field2789;
        }
        if (var3 == null) {
            return;
        }
        field1021 = arg0;
        class224 var5 = method1554(arg0);
        if (var5 == null) {
            var5 = arg0.field2789;
        }
        field1022 = var5;
        field1023 = arg1;
        field1122 = arg2;
        Statics.field712 = 0;
        field994 = false;
        int var7 = field1044 - 1;
        if (var7 != -1) {
            method2164(var7);
        }
        return;
    }

    @ObfuscatedName("client.ib(I)V")
    public final void method1064() {
        method955(field1021);
        Statics.field712++;
        if (field1029 && field1026) {
            int var1 = class60.field682;
            int var2 = class60.field677;
            int var3 = var1 - field1023;
            int var4 = var2 - field1122;
            if (var3 < field1027) {
                var3 = field1027;
            }
            if (field1021.field2729 + var3 > field1027 + field1022.field2729) {
                var3 = field1027 + field1022.field2729 - field1021.field2729;
            }
            if (var4 < field1060) {
                var4 = field1060;
            }
            if (field1021.field2834 + var4 > field1060 + field1022.field2834) {
                var4 = field1060 + field1022.field2834 - field1021.field2834;
            }
            int var5 = var3 - field1030;
            int var6 = var4 - field1031;
            int var7 = field1021.field2790;
            if (Statics.field712 > field1021.field2791 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field994 = true;
            }
            int var8 = field1022.field2735 + (var3 - field1027);
            int var9 = field1022.field2759 + (var4 - field1060);
            if (field1021.field2803 != null && field994) {
                class69 var10 = new class69();
                var10.field778 = field1021;
                var10.field779 = var8;
                var10.field776 = var9;
                var10.field786 = field1021.field2803;
                class83.method12(var10);
            }
            if (class60.field690 == 0) {
                if (field994) {
                    if (field1021.field2802 != null) {
                        class69 var11 = new class69();
                        var11.field778 = field1021;
                        var11.field779 = var8;
                        var11.field776 = var9;
                        var11.field782 = field1025;
                        var11.field786 = field1021.field2802;
                        class83.method12(var11);
                    }
                    if (field1025 != null && method1554(field1021) != null) {
                        class171 var12 = class171.method124(class168.field2360, field906.field1461);
                        var12.field2423.method3129(field1025.field2715);
                        var12.field2423.method2980(field1021.field2715);
                        var12.field2423.method3056(field1021.field2714);
                        var12.field2423.method3129(field1025.field2717);
                        var12.field2423.method2980(field1021.field2717);
                        var12.field2423.method2977(field1025.field2714);
                        field906.method1715(var12);
                    }
                } else if (this.method1033()) {
                    this.method1034(field1030 + field1023, field1122 + field1031);
                } else if (field1044 > 0) {
                    method459(field1030 + field1023, field1122 + field1031);
                }
                field1021 = null;
            }
        } else if (Statics.field712 > 1) {
            field1021 = null;
        }
    }

    @ObfuscatedName("dz.ia(IB)V")
    public static void method2164(int arg0) {
        Statics.field416 = new class89();
        Statics.field416.field1319 = field988[arg0];
        Statics.field416.field1315 = field937[arg0];
        Statics.field416.field1316 = field919[arg0];
        Statics.field416.field1317 = field953[arg0];
        Statics.field416.field1318 = field1078[arg0];
    }

    @ObfuscatedName("ah.im(IIB)V")
    public static void method459(int arg0, int arg1) {
        class89 var2 = Statics.field416;
        method79(var2.field1319, var2.field1315, var2.field1316, var2.field1317, var2.field1318, var2.field1318, arg0, arg1);
        Statics.field416 = null;
    }

    @ObfuscatedName("bv.ix(Lhx;I)V")
    public static void method955(class224 arg0) {
        if (field867 == arg0.field2846) {
            field1053[arg0.field2845] = true;
        }
    }

    @ObfuscatedName("bg.ie(B)V")
    public static void method1019() {
        for (class68 var0 = (class68) field1009.method3343(); var0 != null; var0 = (class68) field1009.method3344()) {
            int var1 = var0.field771;
            if (class224.method936(var1)) {
                boolean var2 = true;
                class224[] var3 = Statics.field2807[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2757;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2557;
                    class224 var6 = class224.method934(var5);
                    if (var6 != null) {
                        method955(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ib.if([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method3989(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ad.iv(II)V")
    public static final void method641(int arg0) {
        if (!class224.method936(arg0)) {
            return;
        }
        class224[] var1 = Statics.field2807[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class224 var3 = var1[var2];
            if (var3 != null) {
                var3.field2836 = 0;
                var3.field2724 = 0;
            }
        }
    }

    @ObfuscatedName("u.ir([Lhx;IB)V")
    public static final void method22(class224[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class224 var3 = arg0[var2];
            if (var3 != null && var3.field2733 == arg1 && (!var3.field2757 || !method3(var3))) {
                if (var3.field2747 == 0) {
                    if (!var3.field2757 && method3(var3) && Statics.field265 != var3) {
                        continue;
                    }
                    method22(arg0, var3.field2714);
                    if (var3.field2838 != null) {
                        method22(var3.field2838, var3.field2714);
                    }
                    class68 var4 = (class68) field1009.method3340((long) var3.field2714);
                    if (var4 != null) {
                        int var5 = var4.field771;
                        if (class224.method936(var5)) {
                            method22(Statics.field2807[var5], -1);
                        }
                    }
                }
                if (var3.field2747 == 6) {
                    if (var3.field2761 != -1 || var3.field2762 != -1) {
                        boolean var6 = method958(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2762;
                        } else {
                            var7 = var3.field2761;
                        }
                        if (var7 != -1) {
                            class268 var8 = class268.method1560(var7);
                            var3.field2724 += field923;
                            while (var3.field2724 > var8.field3656[var3.field2836]) {
                                var3.field2724 -= var8.field3656[var3.field2836];
                                var3.field2836++;
                                if (var3.field2836 >= var8.field3661.length) {
                                    var3.field2836 -= var8.field3658;
                                    if (var3.field2836 < 0 || var3.field2836 >= var8.field3661.length) {
                                        var3.field2836 = 0;
                                    }
                                }
                                method955(var3);
                            }
                        }
                    }
                    if (var3.field2770 != 0 && !var3.field2757) {
                        int var9 = var3.field2770 >> 16;
                        int var10 = var3.field2770 << 16 >> 16;
                        int var11 = field923 * var9;
                        int var12 = field923 * var10;
                        var3.field2765 = var3.field2765 + var11 & 0x7FF;
                        var3.field2716 = var3.field2716 + var12 & 0x7FF;
                        method955(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ac.ig(IS)V")
    public static final void method447(int arg0) {
        method1019();
        for (class82 var1 = (class82) class82.field1241.method3405(); var1 != null; var1 = (class82) class82.field1241.method3414()) {
            if (var1.field1251 != null) {
                var1.method1462();
            }
        }
        int var2 = class249.method4573(arg0).field3341;
        if (var2 == 0) {
            return;
        }
        int var3 = class219.field2680[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class136.method2407(0.9D);
                ((class125) Statics.field1938).method2210(0.9D);
            }
            if (var3 == 2) {
                class136.method2407(0.8D);
                ((class125) Statics.field1938).method2210(0.8D);
            }
            if (var3 == 3) {
                class136.method2407(0.7D);
                ((class125) Statics.field1938).method2210(0.7D);
            }
            if (var3 == 4) {
                class136.method2407(0.6D);
                ((class125) Statics.field1938).method2210(0.6D);
            }
            class264.method2925();
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
            if (field946 != var4) {
                if (field946 == 0 && field1084 != -1) {
                    class211.method3796(Statics.field542, field1084, 0, var4, false);
                    field1085 = false;
                } else if (var4 == 0) {
                    class211.method290();
                    field1085 = false;
                } else if (class211.field2586 == 0) {
                    Statics.field2588.method3582(var4);
                } else {
                    Statics.field2910 = var4;
                }
                field946 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field1086 = 127;
            }
            if (var3 == 1) {
                field1086 = 96;
            }
            if (var3 == 2) {
                field1086 = 64;
            }
            if (var3 == 3) {
                field1086 = 32;
            }
            if (var3 == 4) {
                field1086 = 0;
            }
        }
        if (var2 == 5) {
            field985 = var3;
        }
        if (var2 == 6) {
            field1010 = var3;
        }
        if (var2 == 9) {
            field1011 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field1052 = 127;
            }
            if (var3 == 1) {
                field1052 = 96;
            }
            if (var3 == 2) {
                field1052 = 64;
            }
            if (var3 == 3) {
                field1052 = 32;
            }
            if (var3 == 4) {
                field1052 = 0;
            }
        }
        if (var2 == 17) {
            field1016 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class91[] var5 = new class91[] { class91.field1325, class91.field1329, class91.field1323, class91.field1326 };
            field1097 = (class91) class176.method2719(var5, var3);
            if (field1097 == null) {
                field1097 = class91.field1326;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field1071 = -1;
            } else {
                field1071 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class91[] var6 = new class91[] { class91.field1325, class91.field1329, class91.field1323, class91.field1326 };
        field951 = (class91) class176.method2719(var6, var3);
        if (field951 == null) {
            field951 = class91.field1326;
        }
    }

    @ObfuscatedName("fm.ii(Lhx;I)V")
    public static final void method3174(class224 arg0) {
        int var1 = arg0.field2718;
        if (var1 == 324) {
            if (field1090 == -1) {
                field1090 = arg0.field2749;
                field875 = arg0.field2750;
            }
            if (field1120.field2688) {
                arg0.field2749 = field1090;
            } else {
                arg0.field2749 = field875;
            }
        } else if (var1 == 325) {
            if (field1090 == -1) {
                field1090 = arg0.field2749;
                field875 = arg0.field2750;
            }
            if (field1120.field2688) {
                arg0.field2749 = field875;
            } else {
                arg0.field2749 = field1090;
            }
        } else if (var1 == 327) {
            arg0.field2765 = 150;
            arg0.field2716 = (int) (Math.sin((double) field872 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2720 = 5;
            arg0.field2758 = 0;
        } else if (var1 == 328) {
            arg0.field2765 = 150;
            arg0.field2716 = (int) (Math.sin((double) field872 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2720 = 5;
            arg0.field2758 = 1;
        }
    }

    @ObfuscatedName("aw.in(B)V")
    public static final void method462() {
        class171 var0 = class171.method124(class168.field2302, field906.field1461);
        field906.method1715(var0);
        for (class68 var1 = (class68) field1009.method3343(); var1 != null; var1 = (class68) field1009.method3344()) {
            if (var1.field772 == 0 || var1.field772 == 3) {
                method1017(var1, true);
            }
        }
        if (field879 != null) {
            method955(field879);
            field879 = null;
        }
    }

    @ObfuscatedName("ht.jk(IIII)Lbf;")
    public static final class68 method3735(int arg0, int arg1, int arg2) {
        class68 var3 = new class68();
        var3.field771 = arg1;
        var3.field772 = arg2;
        field1009.method3352(var3, (long) arg0);
        method641(arg1);
        class224 var4 = class224.method934(arg0);
        method955(var4);
        if (field879 != null) {
            method955(field879);
            field879 = null;
        }
        method945();
        method1558(Statics.field2807[arg0 >> 16], var4, false);
        class83.method450(arg1);
        if (field1008 != -1) {
            int var5 = field1008;
            if (class224.method936(var5)) {
                method136(Statics.field2807[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("bo.jb(Lbf;ZB)V")
    public static final void method1017(class68 arg0, boolean arg1) {
        int var2 = arg0.field771;
        int var3 = (int) arg0.field2557;
        arg0.method3392();
        if (arg1) {
            class224.method4159(var2);
        }
        for (class206 var4 = (class206) field1050.method3343(); var4 != null; var4 = (class206) field1050.method3344()) {
            if ((var4.field2557 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method3392();
            }
        }
        class224 var5 = class224.method934(var3);
        if (var5 != null) {
            method955(var5);
        }
        method945();
        if (field1008 != -1) {
            int var6 = field1008;
            if (class224.method936(var6)) {
                method136(Statics.field2807[var6], 1);
            }
        }
    }

    @ObfuscatedName("x.jt(Lhx;B)Z")
    public static final boolean method14(class224 arg0) {
        int var1 = arg0.field2718;
        if (var1 == 205) {
            field907 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1120.method3702(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1120.method3703(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1120.method3704(false);
        }
        if (var1 == 325) {
            field1120.method3704(true);
        }
        if (var1 == 326) {
            class171 var6 = class171.method124(class168.field2339, field906.field1461);
            field1120.method3705(var6.field2423);
            field906.method1715(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("m.jj(Lhx;IIII)V")
    public static final void method88(class224 arg0, int arg1, int arg2, int arg3) {
        method1557();
        class218 var4 = arg0.method3746(false);
        if (var4 == null) {
            return;
        }
        class291.method4712(arg1, arg2, var4.field2674 + arg1, var4.field2673 + arg2);
        if (field1109 == 2 || field1109 == 5) {
            class291.method4686(arg1, arg2, 0, var4.field2676, var4.field2675);
        } else {
            int var5 = field922 & 0x7FF;
            int var6 = Statics.field3721.field1195 / 32 + 48;
            int var7 = 464 - Statics.field3721.field1157 / 32;
            Statics.field1281.method4806(arg1, arg2, var4.field2674, var4.field2673, var6, var7, var5, 256, var4.field2676, var4.field2675);
            for (int var8 = 0; var8 < field1076; var8++) {
                int var9 = field1061[var8] * 4 + 2 - Statics.field3721.field1195 / 32;
                int var10 = field892[var8] * 4 + 2 - Statics.field3721.field1157 / 32;
                method6(arg1, arg2, var9, var10, field1079[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class201 var13 = field978[Statics.field376][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field3721.field1195 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field3721.field1157 / 32;
                        method6(arg1, arg2, var14, var15, Statics.field843[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field902; var16++) {
                class86 var17 = field874[field893[var16]];
                if (var17 != null && var17.method987()) {
                    class266 var18 = var17.field1289;
                    if (var18 != null && var18.field3633 != null) {
                        var18 = var18.method4333();
                    }
                    if (var18 != null && var18.field3622 && var18.field3612) {
                        int var19 = var17.field1195 / 32 - Statics.field3721.field1195 / 32;
                        int var20 = var17.field1157 / 32 - Statics.field3721.field1157 / 32;
                        method6(arg1, arg2, var19, var20, Statics.field843[1], var4);
                    }
                }
            }
            int var21 = class95.field1401;
            int[] var22 = class95.field1402;
            for (int var23 = 0; var23 < var21; var23++) {
                class74 var24 = field1098[var22[var23]];
                if (var24 != null && var24.method987() && !var24.field821 && Statics.field3721 != var24) {
                    int var25 = var24.field1195 / 32 - Statics.field3721.field1195 / 32;
                    int var26 = var24.field1157 / 32 - Statics.field3721.field1157 / 32;
                    boolean var27 = false;
                    if (method1520(var24.field823, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field451; var29++) {
                        if (var24.field823.equals(Statics.field1420[var29].field853)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field3721.field817 != 0 && var24.field817 != 0 && Statics.field3721.field817 == var24.field817) {
                        var30 = true;
                    }
                    if (var27) {
                        method6(arg1, arg2, var25, var26, Statics.field843[3], var4);
                    } else if (var30) {
                        method6(arg1, arg2, var25, var26, Statics.field843[4], var4);
                    } else if (var28) {
                        method6(arg1, arg2, var25, var26, Statics.field843[5], var4);
                    } else {
                        method6(arg1, arg2, var25, var26, Statics.field843[2], var4);
                    }
                }
            }
            if (field880 != 0 && field872 % 20 < 10) {
                if (field880 == 1 && field881 >= 0 && field881 < field874.length) {
                    class86 var31 = field874[field881];
                    if (var31 != null) {
                        int var32 = var31.field1195 / 32 - Statics.field3721.field1195 / 32;
                        int var33 = var31.field1157 / 32 - Statics.field3721.field1157 / 32;
                        method1444(arg1, arg2, var32, var33, Statics.field2594[1], var4);
                    }
                }
                if (field880 == 2) {
                    int var34 = field1073 * 4 - Statics.field269 * 4 + 2 - Statics.field3721.field1195 / 32;
                    int var35 = field884 * 4 - Statics.field854 * 4 + 2 - Statics.field3721.field1157 / 32;
                    method1444(arg1, arg2, var34, var35, Statics.field2594[1], var4);
                }
                if (field880 == 10 && field882 >= 0 && field882 < field1098.length) {
                    class74 var36 = field1098[field882];
                    if (var36 != null) {
                        int var37 = var36.field1195 / 32 - Statics.field3721.field1195 / 32;
                        int var38 = var36.field1157 / 32 - Statics.field3721.field1157 / 32;
                        method1444(arg1, arg2, var37, var38, Statics.field2594[1], var4);
                    }
                }
            }
            if (field979 != 0) {
                int var39 = field979 * 4 + 2 - Statics.field3721.field1195 / 32;
                int var40 = field1081 * 4 + 2 - Statics.field3721.field1157 / 32;
                method6(arg1, arg2, var39, var40, Statics.field2594[0], var4);
            }
            if (!Statics.field3721.field821) {
                class291.method4671(var4.field2674 / 2 + arg1 - 1, var4.field2673 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field1054[arg3] = true;
    }

    @ObfuscatedName("cg.jp(IIIILkb;Lhy;B)V")
    public static final void method1444(int arg0, int arg1, int arg2, int arg3, class295 arg4, class218 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method6(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field922 & 0x7FF;
        int var8 = class136.field1939[var7];
        int var9 = class136.field1942[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2674 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field680.method4801(arg5.field2674 / 2 + arg0 - var17 / 2 + var15, arg5.field2673 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("g.jc(IIIILkb;Lhy;I)V")
    public static final void method6(int arg0, int arg1, int arg2, int arg3, class295 arg4, class218 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field922 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class136.field1939[var6];
        int var9 = class136.field1942[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method4805(arg5.field2674 / 2 + var10 - arg4.field3834 / 2, arg5.field2673 / 2 - var11 - arg4.field3840 / 2, arg0, arg1, arg5.field2674, arg5.field2673, arg5.field2676, arg5.field2675);
        } else {
            arg4.method4793(arg5.field2674 / 2 + arg0 + var10 - arg4.field3834 / 2, arg5.field2673 / 2 + arg1 - var11 - arg4.field3840 / 2);
        }
    }

    @ObfuscatedName("cc.jx(Ljava/lang/String;ZB)Z")
    public static boolean method1520(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = Statics.method3795(arg0, Statics.field2530);
        for (int var3 = 0; var3 < field1114; var3++) {
            if (var2.equalsIgnoreCase(Statics.method3795(field1116[var3].field755, Statics.field2530)) && (!arg1 || field1116[var3].field757 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(Statics.method3795(Statics.field3721.field823, Statics.field2530))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("q.jh(Ljava/lang/String;B)Z")
    public static boolean method72(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = Statics.method3795(arg0, Statics.field2530);
        for (int var2 = 0; var2 < field1118; var2++) {
            class70 var3 = field1119[var2];
            if (var1.equalsIgnoreCase(Statics.method3795(var3.field793, Statics.field2530))) {
                return true;
            }
            if (var1.equalsIgnoreCase(Statics.method3795(var3.field790, Statics.field2530))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ju.ju(Ljava/lang/String;I)V")
    public static final void method4439(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = Statics.method3795(arg0, Statics.field2530);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1118; var2++) {
            class70 var3 = field1119[var2];
            String var4 = var3.field793;
            String var5 = Statics.method3795(var4, Statics.field2530);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field1118--;
                for (int var7 = var2; var7 < field1118; var7++) {
                    field1119[var7] = field1119[var7 + 1];
                }
                field1041 = field1033;
                class171 var8 = class171.method124(class168.field2387, field906.field1461);
                var8.field2423.method2929(class181.method157(arg0));
                var8.field2423.method2936(arg0);
                field906.method1715(var8);
                break;
            }
        }
    }

    @ObfuscatedName("o.jz(Ljava/lang/String;IB)V")
    public static final void method53(String arg0, int arg1) {
        class171 var2 = class171.method124(class168.field2328, field906.field1461);
        var2.field2423.method2929(class181.method157(arg0) + 1);
        var2.field2423.method2936(arg0);
        var2.field2423.method2971(arg1);
        field906.method1715(var2);
    }

    @ObfuscatedName("fs.jn(B)V")
    public static final void method3162() {
        class171 var0 = class171.method124(class168.field2330, field906.field1461);
        var0.field2423.method2929(0);
        field906.method1715(var0);
    }

    @ObfuscatedName("a.js(Lhx;I)I")
    public static int method57(class224 arg0) {
        class206 var1 = (class206) field1050.method3340(((long) arg0.field2714 << 32) + (long) arg0.field2715);
        return var1 == null ? arg0.field2741 : var1.field2570;
    }

    @ObfuscatedName("cn.jw(Lhx;I)Lhx;")
    public static class224 method1554(class224 arg0) {
        int var1 = method57(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class224.method934(arg0.field2733);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("r.je(Lhx;I)Z")
    public static boolean method3(class224 arg0) {
        if (field1018) {
            if (method57(arg0) != 0) {
                return false;
            }
            if (arg0.field2747 == 0) {
                return false;
            }
        }
        return arg0.field2734;
    }

    @ObfuscatedName("ag.jy(Lhx;IB)Ljava/lang/String;")
    public static String method523(class224 arg0, int arg1) {
        int var2 = method57(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2814 == null) {
            return null;
        } else if (arg0.field2810 == null || arg0.field2810.length <= arg1 || arg0.field2810[arg1] == null || arg0.field2810[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2810[arg1];
        }
    }

    @ObfuscatedName("fa.jv(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method2889(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field900 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field900 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field900 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field900 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field900 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1573 != null) {
            var3 = "/p=" + Statics.field1573;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field1092 + "/a=" + Statics.field340 + var3 + "/";
    }

    @ObfuscatedName("bu.ja(Ljava/lang/String;I)V")
    public static void method971(String arg0) {
        Statics.field1573 = arg0;
        try {
            String var1 = Statics.field3803.getParameter(class283.field3766.field3756);
            String var2 = Statics.field3803.getParameter(class283.field3767.field3756);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class183.method1711() + 94608000000L;
                class190.field2531.setTime(new Date(var6));
                int var8 = class190.field2531.get(7);
                int var9 = class190.field2531.get(5);
                int var10 = class190.field2531.get(2);
                int var11 = class190.field2531.get(1);
                int var12 = class190.field2531.get(11);
                int var13 = class190.field2531.get(12);
                int var14 = class190.field2531.get(13);
                String var15 = class190.field2527[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class190.field2529[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field3803;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }

    @ObfuscatedName("k.jd(Ljava/lang/String;ZI)V")
    public static void method37(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3448; var5++) {
            class264 var6 = class264.method2662(var5);
            if ((!arg1 || var6.field3590) && var6.field3581 == -1 && var6.field3547.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field697 = -1;
                    Statics.field1455 = null;
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
        Statics.field1455 = var3;
        Statics.field408 = 0;
        Statics.field697 = var4;
        String[] var9 = new String[Statics.field697];
        for (int var10 = 0; var10 < Statics.field697; var10++) {
            var9[var10] = class264.method2662(var3[var10]).field3547;
        }
        short[] var11 = Statics.field1455;
        class178.method2695(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("o.jm([BII)V")
    public static void method54(byte[] arg0, int arg1) {
        if (field984 == null) {
            field984 = new byte[24];
        }
        class191.method3257(arg0, arg1, field984, 0, 24);
    }

    @ObfuscatedName("iw.ji(Lfs;I)V")
    public static void method3808(class181 arg0) {
        if (field984 != null) {
            arg0.method2939(field984, 0, field984.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class157.field2152.method2149(0L);
            class157.field2152.method2151(var1);
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
        arg0.method2939(var1, 0, var1.length);
    }

    @ObfuscatedName("a.jf(IIIB)V")
    public static void method63(int arg0, int arg1, int arg2) {
        class171 var3 = class171.method124(class168.field2353, field906.field1461);
        var3.field2423.method2978(arg0);
        var3.field2423.method2971(arg2);
        var3.field2423.method2980(arg1);
        field906.method1715(var3);
    }
}

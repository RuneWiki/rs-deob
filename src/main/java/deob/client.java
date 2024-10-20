package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class60 implements class303 {

    @ObfuscatedName("client.w")
    public static class177[] field910 = new class177[4];

    @ObfuscatedName("client.aq")
    public static boolean field862 = true;

    @ObfuscatedName("client.bq")
    public static int field994 = 1;

    @ObfuscatedName("client.bi")
    public static int field854 = 0;

    @ObfuscatedName("client.bj")
    public static int field855 = 0;

    @ObfuscatedName("client.bh")
    public static boolean field856 = false;

    @ObfuscatedName("client.bz")
    public static boolean field853 = false;

    @ObfuscatedName("client.bl")
    public static int field1020 = 0;

    @ObfuscatedName("client.br")
    public static int field1017 = -1;

    @ObfuscatedName("client.bc")
    public static boolean field860 = false;

    @ObfuscatedName("client.bf")
    public static int field1111 = 0;

    @ObfuscatedName("client.bt")
    public static boolean field996 = true;

    @ObfuscatedName("client.bs")
    public static int field913 = 0;

    @ObfuscatedName("client.bg")
    public static long field864 = -1L;

    @ObfuscatedName("client.bu")
    public static int field873 = -1;

    @ObfuscatedName("client.bd")
    public static int field866 = -1;

    @ObfuscatedName("client.by")
    public static int field867 = -1;

    @ObfuscatedName("client.be")
    public static boolean field868 = true;

    @ObfuscatedName("client.bm")
    public static boolean field869 = false;

    @ObfuscatedName("client.bv")
    public static int field870 = 0;

    @ObfuscatedName("client.bx")
    public static int field871 = 0;

    @ObfuscatedName("client.ce")
    public static int field872 = 0;

    @ObfuscatedName("client.cj")
    public static int field978 = 0;

    @ObfuscatedName("client.cv")
    public static int field1118 = 0;

    @ObfuscatedName("client.ca")
    public static int field875 = 0;

    @ObfuscatedName("client.cp")
    public static int field1120 = 0;

    @ObfuscatedName("client.cf")
    public static int field877 = 0;

    @ObfuscatedName("client.cy")
    public static int field878 = 0;

    @ObfuscatedName("client.ck")
    public static class90 field879 = class90.field1331;

    @ObfuscatedName("client.cm")
    public static class90 field880 = class90.field1331;

    @ObfuscatedName("client.cn")
    public static int field881 = 0;

    @ObfuscatedName("client.cd")
    public static int field1097 = 0;

    @ObfuscatedName("client.co")
    public static int field883 = 0;

    @ObfuscatedName("client.ds")
    public static int field886 = 0;

    @ObfuscatedName("client.dv")
    public static int field887 = 0;

    @ObfuscatedName("client.de")
    public static int field1096 = 0;

    @ObfuscatedName("client.dn")
    public static int field889 = 0;

    @ObfuscatedName("client.du")
    public static int field1042 = 0;

    @ObfuscatedName("client.dh")
    public static class159 field1051 = class159.field2142;

    @ObfuscatedName("client.dx")
    public static byte[] field1072 = null;

    @ObfuscatedName("client.dw")
    public static class85[] field894 = new class85[32768];

    @ObfuscatedName("client.dd")
    public static int field895 = 0;

    @ObfuscatedName("client.dz")
    public static int[] field896 = new int[32768];

    @ObfuscatedName("client.eg")
    public static int field968 = 0;

    @ObfuscatedName("client.ee")
    public static int[] field898 = new int[250];

    @ObfuscatedName("client.ej")
    public static final class100 field912 = new class100();

    @ObfuscatedName("client.ef")
    public static int field900 = 0;

    @ObfuscatedName("client.eb")
    public static boolean field986 = false;

    @ObfuscatedName("client.ep")
    public static boolean field1061 = true;

    @ObfuscatedName("client.ey")
    public static class295 field903 = new class295();

    @ObfuscatedName("client.eh")
    public static HashMap field1028 = new HashMap();

    @ObfuscatedName("client.eo")
    public static int field905 = 0;

    @ObfuscatedName("client.em")
    public static int field906 = 1;

    @ObfuscatedName("client.ew")
    public static int field911 = 0;

    @ObfuscatedName("client.el")
    public static int field908 = 1;

    @ObfuscatedName("client.fh")
    public static int field1003 = 0;

    @ObfuscatedName("client.fd")
    public static boolean field1079 = false;

    @ObfuscatedName("client.fi")
    public static int[][][] field907 = new int[4][13][13];

    @ObfuscatedName("client.fl")
    public static final int[] field1110 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fs")
    public static int field914 = 0;

    @ObfuscatedName("client.fb")
    public static int field915 = 2301979;

    @ObfuscatedName("client.gk")
    public static int field1066 = 5063219;

    @ObfuscatedName("client.gd")
    public static int field1108 = 3353893;

    @ObfuscatedName("client.gj")
    public static int field904 = 7759444;

    @ObfuscatedName("client.ge")
    public static boolean field919 = false;

    @ObfuscatedName("client.gm")
    public static int field920 = 0;

    @ObfuscatedName("client.gg")
    public static int field921 = 128;

    @ObfuscatedName("client.gn")
    public static int field922 = 0;

    @ObfuscatedName("client.gy")
    public static int field923 = 0;

    @ObfuscatedName("client.gf")
    public static int field924 = 0;

    @ObfuscatedName("client.gx")
    public static int field925 = 0;

    @ObfuscatedName("client.gb")
    public static int field926 = 0;

    @ObfuscatedName("client.gh")
    public static int field927 = 0;

    @ObfuscatedName("client.gl")
    public static int field928 = 50;

    @ObfuscatedName("client.gi")
    public static int field966 = 0;

    @ObfuscatedName("client.gz")
    public static int field930 = 0;

    @ObfuscatedName("client.ga")
    public static int field931 = 0;

    @ObfuscatedName("client.hh")
    public static int field932 = 12;

    @ObfuscatedName("client.hk")
    public static int field859 = 6;

    @ObfuscatedName("client.hx")
    public static int field934 = 0;

    @ObfuscatedName("client.hi")
    public static boolean field935 = false;

    @ObfuscatedName("client.ho")
    public static int field917 = 0;

    @ObfuscatedName("client.hu")
    public static boolean field937 = false;

    @ObfuscatedName("client.hb")
    public static int field938 = 0;

    @ObfuscatedName("client.ht")
    public static int field939 = 0;

    @ObfuscatedName("client.hn")
    public static int field940 = 50;

    @ObfuscatedName("client.hf")
    public static int[] field890 = new int[field940];

    @ObfuscatedName("client.hl")
    public static int[] field942 = new int[field940];

    @ObfuscatedName("client.hm")
    public static int[] field943 = new int[field940];

    @ObfuscatedName("client.hv")
    public static int[] field944 = new int[field940];

    @ObfuscatedName("client.hp")
    public static int[] field945 = new int[field940];

    @ObfuscatedName("client.hq")
    public static int[] field946 = new int[field940];

    @ObfuscatedName("client.hz")
    public static int[] field947 = new int[field940];

    @ObfuscatedName("client.hj")
    public static String[] field948 = new String[field940];

    @ObfuscatedName("client.hw")
    public static int[][] field949 = new int[104][104];

    @ObfuscatedName("client.hy")
    public static int field1094 = 0;

    @ObfuscatedName("client.hr")
    public static int field951 = -1;

    @ObfuscatedName("client.hd")
    public static int field952 = -1;

    @ObfuscatedName("client.he")
    public static int field1038 = 0;

    @ObfuscatedName("client.ha")
    public static int field954 = 0;

    @ObfuscatedName("client.hs")
    public static int field1081 = 0;

    @ObfuscatedName("client.hg")
    public static int field956 = 0;

    @ObfuscatedName("client.ie")
    public static boolean field998 = true;

    @ObfuscatedName("client.in")
    public static int field865 = 0;

    @ObfuscatedName("client.im")
    public static int field959 = 0;

    @ObfuscatedName("client.ib")
    public static int field960 = 0;

    @ObfuscatedName("client.iu")
    public static int field961 = 0;

    @ObfuscatedName("client.ih")
    public static int field962 = 0;

    @ObfuscatedName("client.il")
    public static int field963 = 0;

    @ObfuscatedName("client.iv")
    public static boolean field964 = false;

    @ObfuscatedName("client.ic")
    public static int field990 = 0;

    @ObfuscatedName("client.ip")
    public static int field1048 = 0;

    @ObfuscatedName("client.ik")
    public static boolean field965 = true;

    @ObfuscatedName("client.iq")
    public static class73[] field1004 = new class73[2048];

    @ObfuscatedName("client.ia")
    public static int field969 = -1;

    @ObfuscatedName("client.ii")
    public static int field970 = 0;

    @ObfuscatedName("client.iy")
    public static boolean field929 = true;

    @ObfuscatedName("client.it")
    public static String field1012 = null;

    @ObfuscatedName("client.ji")
    public static int field972 = 0;

    @ObfuscatedName("client.jo")
    public static int field973 = 0;

    @ObfuscatedName("client.jd")
    public static int[] field974 = new int[1000];

    @ObfuscatedName("client.jw")
    public static final int[] field975 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.jk")
    public static String[] field976 = new String[8];

    @ObfuscatedName("client.jx")
    public static boolean[] field950 = new boolean[8];

    @ObfuscatedName("client.jf")
    public static int[] field852 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.jp")
    public static int field979 = -1;

    @ObfuscatedName("client.jn")
    public static class218[][][] field980 = new class218[4][104][104];

    @ObfuscatedName("client.jv")
    public static class218 field981 = new class218();

    @ObfuscatedName("client.jg")
    public static class218 field982 = new class218();

    @ObfuscatedName("client.jj")
    public static class218 field983 = new class218();

    @ObfuscatedName("client.jy")
    public static int[] field984 = new int[25];

    @ObfuscatedName("client.jc")
    public static int[] field985 = new int[25];

    @ObfuscatedName("client.jh")
    public static int[] field876 = new int[25];

    @ObfuscatedName("client.jq")
    public static int field987 = 0;

    @ObfuscatedName("client.jz")
    public static boolean field1000 = false;

    @ObfuscatedName("client.kk")
    public static int field989 = 0;

    @ObfuscatedName("client.kc")
    public static int[] field933 = new int[500];

    @ObfuscatedName("client.ko")
    public static int[] field991 = new int[500];

    @ObfuscatedName("client.ks")
    public static int[] field1031 = new int[500];

    @ObfuscatedName("client.kq")
    public static int[] field993 = new int[500];

    @ObfuscatedName("client.kw")
    public static String[] field1105 = new String[500];

    @ObfuscatedName("client.kt")
    public static String[] field995 = new String[500];

    @ObfuscatedName("client.kz")
    public static boolean[] field1089 = new boolean[500];

    @ObfuscatedName("client.kj")
    public static boolean field1112 = false;

    @ObfuscatedName("client.kg")
    public static boolean field1080 = false;

    @ObfuscatedName("client.kl")
    public static boolean field999 = false;

    @ObfuscatedName("client.km")
    public static boolean field1113 = true;

    @ObfuscatedName("client.kn")
    public static int field1001 = -1;

    @ObfuscatedName("client.ka")
    public static int field1002 = -1;

    @ObfuscatedName("client.ky")
    public static int field916 = 0;

    @ObfuscatedName("client.kb")
    public static int field1073 = 50;

    @ObfuscatedName("client.ke")
    public static int field1005 = 0;

    @ObfuscatedName("client.kp")
    public static boolean field1008 = false;

    @ObfuscatedName("client.kr")
    public static int field1009 = -1;

    @ObfuscatedName("client.kh")
    public static int field1010 = -1;

    @ObfuscatedName("client.ln")
    public static String field1011 = null;

    @ObfuscatedName("client.lk")
    public static String field1064 = null;

    @ObfuscatedName("client.lc")
    public static int field888 = -1;

    @ObfuscatedName("client.lf")
    public static class215 field1014 = new class215(8);

    @ObfuscatedName("client.la")
    public static int field1015 = 0;

    @ObfuscatedName("client.ld")
    public static int field971 = 0;

    @ObfuscatedName("client.lb")
    public static class243 field1018 = null;

    @ObfuscatedName("client.lz")
    public static int field1007 = 0;

    @ObfuscatedName("client.lq")
    public static int field897 = 0;

    @ObfuscatedName("client.lp")
    public static int field997 = 0;

    @ObfuscatedName("client.ls")
    public static int field1058 = -1;

    @ObfuscatedName("client.le")
    public static boolean field1022 = false;

    @ObfuscatedName("client.lu")
    public static class243 field863 = null;

    @ObfuscatedName("client.lt")
    public static class243 field1024 = null;

    @ObfuscatedName("client.lw")
    public static class243 field1025 = null;

    @ObfuscatedName("client.lj")
    public static int field1026 = 0;

    @ObfuscatedName("client.lg")
    public static int field893 = 0;

    @ObfuscatedName("client.lh")
    public static class243 field891 = null;

    @ObfuscatedName("client.lv")
    public static boolean field1029 = false;

    @ObfuscatedName("client.lr")
    public static int field1030 = -1;

    @ObfuscatedName("client.lx")
    public static int field955 = -1;

    @ObfuscatedName("client.li")
    public static boolean field1032 = false;

    @ObfuscatedName("client.ly")
    public static int field902 = -1;

    @ObfuscatedName("client.lm")
    public static int field1099 = -1;

    @ObfuscatedName("client.lo")
    public static boolean field1035 = false;

    @ObfuscatedName("client.mn")
    public static int field1036 = 1;

    @ObfuscatedName("client.mk")
    public static int[] field1037 = new int[32];

    @ObfuscatedName("client.mp")
    public static int field936 = 0;

    @ObfuscatedName("client.mf")
    public static int[] field1039 = new int[32];

    @ObfuscatedName("client.ml")
    public static int field1033 = 0;

    @ObfuscatedName("client.ma")
    public static int[] field1041 = new int[32];

    @ObfuscatedName("client.mw")
    public static int field909 = 0;

    @ObfuscatedName("client.mr")
    public static int field1043 = 0;

    @ObfuscatedName("client.mq")
    public static int field1046 = 0;

    @ObfuscatedName("client.mj")
    public static int field892 = 0;

    @ObfuscatedName("client.mu")
    public static int field882 = 0;

    @ObfuscatedName("client.mc")
    public static int field1047 = 0;

    @ObfuscatedName("client.mt")
    public static int field988 = 0;

    @ObfuscatedName("client.my")
    public static int field1049 = 0;

    @ObfuscatedName("client.mv")
    public static class218 field1050 = new class218();

    @ObfuscatedName("client.mz")
    public static class218 field977 = new class218();

    @ObfuscatedName("client.mb")
    public static class218 field1052 = new class218();

    @ObfuscatedName("client.mg")
    public static class215 field1021 = new class215(512);

    @ObfuscatedName("client.nc")
    public static int field857 = 0;

    @ObfuscatedName("client.nh")
    public static int field1055 = -2;

    @ObfuscatedName("client.nx")
    public static boolean[] field1056 = new boolean[100];

    @ObfuscatedName("client.ni")
    public static boolean[] field1057 = new boolean[100];

    @ObfuscatedName("client.no")
    public static boolean[] field1102 = new boolean[100];

    @ObfuscatedName("client.nf")
    public static int[] field1059 = new int[100];

    @ObfuscatedName("client.nq")
    public static int[] field1060 = new int[100];

    @ObfuscatedName("client.nm")
    public static int[] field874 = new int[100];

    @ObfuscatedName("client.nb")
    public static int[] field1062 = new int[100];

    @ObfuscatedName("client.nd")
    public static int field1063 = 0;

    @ObfuscatedName("client.nk")
    public static long field1093 = 0L;

    @ObfuscatedName("client.np")
    public static boolean field1065 = true;

    @ObfuscatedName("client.nv")
    public static int[] field1077 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.na")
    public static int field1067 = 0;

    @ObfuscatedName("client.nz")
    public static int field1068 = 0;

    @ObfuscatedName("client.nt")
    public static String field1069 = "";

    @ObfuscatedName("client.ng")
    public static long[] field1070 = new long[100];

    @ObfuscatedName("client.ot")
    public static int field1071 = 0;

    @ObfuscatedName("client.ob")
    public static int field1090 = 0;

    @ObfuscatedName("client.ox")
    public static int[] field958 = new int[128];

    @ObfuscatedName("client.oj")
    public static int[] field1040 = new int[128];

    @ObfuscatedName("client.ol")
    public static long field1075 = -1L;

    @ObfuscatedName("client.of")
    public static int field1076 = -1;

    @ObfuscatedName("client.od")
    public static int field1115 = 0;

    @ObfuscatedName("client.oq")
    public static int[] field1106 = new int[1000];

    @ObfuscatedName("client.oh")
    public static int[] field1088 = new int[1000];

    @ObfuscatedName("client.or")
    public static class332[] field1016 = new class332[1000];

    @ObfuscatedName("client.ov")
    public static int field1023 = 0;

    @ObfuscatedName("client.oc")
    public static int field1082 = 0;

    @ObfuscatedName("client.oa")
    public static int field1083 = 0;

    @ObfuscatedName("client.og")
    public static int field1084 = 255;

    @ObfuscatedName("client.oz")
    public static int field1085 = -1;

    @ObfuscatedName("client.oo")
    public static boolean field1086 = false;

    @ObfuscatedName("client.pu")
    public static int field1087 = 127;

    @ObfuscatedName("client.pc")
    public static int field1019 = 127;

    @ObfuscatedName("client.pt")
    public static int field957 = 0;

    @ObfuscatedName("client.ps")
    public static int[] field1098 = new int[50];

    @ObfuscatedName("client.pq")
    public static int[] field1091 = new int[50];

    @ObfuscatedName("client.pw")
    public static int[] field1092 = new int[50];

    @ObfuscatedName("client.ph")
    public static int[] field1013 = new int[50];

    @ObfuscatedName("client.pf")
    public static class104[] field858 = new class104[50];

    @ObfuscatedName("client.pj")
    public static boolean field1095 = false;

    @ObfuscatedName("client.pz")
    public static boolean[] field861 = new boolean[5];

    @ObfuscatedName("client.qp")
    public static int[] field1044 = new int[5];

    @ObfuscatedName("client.qs")
    public static int[] field967 = new int[5];

    @ObfuscatedName("client.qa")
    public static int[] field992 = new int[5];

    @ObfuscatedName("client.qb")
    public static int[] field1100 = new int[5];

    @ObfuscatedName("client.qy")
    public static short field1101 = 256;

    @ObfuscatedName("client.qn")
    public static short field1126 = 205;

    @ObfuscatedName("client.qi")
    public static short field1103 = 256;

    @ObfuscatedName("client.qu")
    public static short field1104 = 320;

    @ObfuscatedName("client.qc")
    public static short field884 = 1;

    @ObfuscatedName("client.qo")
    public static short field1027 = 32767;

    @ObfuscatedName("client.qm")
    public static short field1107 = 1;

    @ObfuscatedName("client.qq")
    public static short field941 = 32767;

    @ObfuscatedName("client.qx")
    public static int field1109 = 0;

    @ObfuscatedName("client.qh")
    public static int field1074 = 0;

    @ObfuscatedName("client.qe")
    public static int field918 = 0;

    @ObfuscatedName("client.qt")
    public static int field899 = 0;

    @ObfuscatedName("client.qv")
    public static int field1053 = 0;

    @ObfuscatedName("client.ql")
    public static class240 field1114 = new class240();

    @ObfuscatedName("client.qg")
    public static int field1078 = -1;

    @ObfuscatedName("client.qd")
    public static int field1116 = -1;

    @ObfuscatedName("client.qz")
    public static class17[] field1045 = new class17[8];

    @ObfuscatedName("client.rp")
    public static class74 field1119 = new class74();

    @ObfuscatedName("client.rj")
    public static int field1054 = -1;

    @ObfuscatedName("client.ri")
    public static ArrayList field1121 = new ArrayList(10);

    @ObfuscatedName("client.ra")
    public static int field1122 = 0;

    @ObfuscatedName("client.rv")
    public static final class72 field1123 = new class72();

    @ObfuscatedName("client.ro")
    public static int[] field1124 = new int[50];

    @ObfuscatedName("client.rz")
    public static int[] field1125 = new int[50];

    @ObfuscatedName("bu.ew(I)Lli;")
    public static class335 method1107() {
        return Statics.field2585;
    }

    @ObfuscatedName("client.ap(I)V")
    public final void method840() {
    }

    public final void init() {
        if (!this.method819()) {
            return;
        }
        class294[] var1 = Statics.method1838();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class294 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3815);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3815)) {
                    case 1:
                        Statics.field357 = var4;
                        break;
                    case 2:
                        if (var4.equalsIgnoreCase(class87.field1314)) {
                            field856 = true;
                        } else {
                            field856 = false;
                        }
                        break;
                    case 3:
                        Statics.field532 = var4;
                        break;
                    case 4:
                        field1061 = Integer.parseInt(var4) != 0;
                        break;
                    case 5:
                        if (var4.equalsIgnoreCase(class87.field1314)) {
                        }
                        break;
                    case 6:
                        field994 = Integer.parseInt(var4);
                        break;
                    case 7:
                        if (field1017 == -1) {
                            field1017 = Integer.parseInt(var4);
                        }
                        break;
                    case 8:
                        field855 = Integer.parseInt(var4);
                        break;
                    case 9:
                        int var5 = Integer.parseInt(var4);
                        class258[] var6 = new class258[] { class258.field3348, class258.field3346, class258.field3345, class258.field3347 };
                        class258[] var7 = var6;
                        int var8 = 0;
                        class258 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class258 var9 = var7[var8];
                            if (var9.field3350 == var5) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field1349 = var10;
                        break;
                    case 10:
                        field1020 = Integer.parseInt(var4);
                        break;
                    case 11:
                        class259[] var11 = new class259[] { class259.field3351, class259.field3358, class259.field3353, class259.field3356, class259.field3355, class259.field3354 };
                        Statics.field297 = (class259) Statics.method3233(var11, Integer.parseInt(var4));
                        if (Statics.field297 == class259.field3356) {
                            Statics.field2078 = class336.field4070;
                        } else {
                            Statics.field2078 = class336.field4069;
                        }
                    case 12:
                    case 14:
                    case 15:
                    default:
                        break;
                    case 13:
                        Statics.field2516 = Integer.parseInt(var4);
                        break;
                    case 16:
                        field854 = Integer.parseInt(var4);
                }
            }
        }
        method1057();
        Statics.field2498 = this.getCodeBase().getHost();
        String var12 = Statics.field1349.field3349;
        byte var13 = 0;
        try {
            Statics.field3018 = 17;
            Statics.field848 = var13;
            try {
                Statics.field4114 = System.getProperty("os.name");
            } catch (Exception var33) {
                Statics.field4114 = "Unknown";
            }
            Statics.field2204 = Statics.field4114.toLowerCase();
            try {
                Statics.field2206 = System.getProperty("user.home");
                if (Statics.field2206 != null) {
                    Statics.field2206 = Statics.field2206 + "/";
                }
            } catch (Exception var32) {
            }
            try {
                if (Statics.field2204.startsWith("win")) {
                    if (Statics.field2206 == null) {
                        Statics.field2206 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2206 == null) {
                    Statics.field2206 = System.getenv("HOME");
                }
                if (Statics.field2206 != null) {
                    Statics.field2206 = Statics.field2206 + "/";
                }
            } catch (Exception var31) {
            }
            if (Statics.field2206 == null) {
                Statics.field2206 = "~/";
            }
            Statics.field433 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2206, "/tmp/", "" };
            Statics.field1135 = new String[] { ".jagex_cache_" + Statics.field848, ".file_store_" + Statics.field848 };
            label163: for (int var17 = 0; var17 < 4; var17++) {
                Statics.field1913 = class168.method1889("oldschool", var12, var17);
                if (!Statics.field1913.exists()) {
                    Statics.field1913.mkdirs();
                }
                File[] var18 = Statics.field1913.listFiles();
                if (var18 == null) {
                    break;
                }
                File[] var19 = var18;
                int var20 = 0;
                while (true) {
                    if (var20 >= var19.length) {
                        break label163;
                    }
                    File var21 = var19[var20];
                    if (!class168.method43(var21, false)) {
                        break;
                    }
                    var20++;
                }
            }
            class171.method2216(Statics.field1913);
            try {
                File var22 = new File(Statics.field2206, "random.dat");
                if (var22.exists()) {
                    class168.field2201 = new class122(new class123(var22, "rw", 25L), 24, 0);
                } else {
                    label143: for (int var23 = 0; var23 < Statics.field1135.length; var23++) {
                        for (int var24 = 0; var24 < Statics.field433.length; var24++) {
                            File var25 = new File(Statics.field433[var24] + Statics.field1135[var23] + File.separatorChar + "random.dat");
                            if (var25.exists()) {
                                class168.field2201 = new class122(new class123(var25, "rw", 25L), 24, 0);
                                break label143;
                            }
                        }
                    }
                }
                if (class168.field2201 == null) {
                    RandomAccessFile var26 = new RandomAccessFile(var22, "rw");
                    int var27 = var26.read();
                    var26.seek(0L);
                    var26.write(var27);
                    var26.seek(0L);
                    var26.close();
                    class168.field2201 = new class122(new class123(var22, "rw", 25L), 24, 0);
                }
            } catch (IOException var34) {
            }
            class168.field2202 = new class122(new class123(class171.method2976("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class168.field2205 = new class122(new class123(class171.method2976("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field232 = new class122[Statics.field3018];
            for (int var29 = 0; var29 < Statics.field3018; var29++) {
                Statics.field232[var29] = new class122(new class123(class171.method2976("main_file_cache.idx" + var29), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var35) {
            class165.method4257((String) null, var35);
        }
        Statics.field3445 = this;
        Statics.field2171 = field1017;
        this.method825(765, 503, 169);
    }

    @ObfuscatedName("bt.fh(B)V")
    public static final void method1057() {
        class138.field2007 = false;
        field853 = false;
    }

    @ObfuscatedName("client.av(I)V")
    public final void method830() {
        class196.method1047(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field319 = field855 == 0 ? 43594 : field994 + 40000;
        Statics.field324 = field855 == 0 ? 443 : field994 + 50000;
        Statics.field579 = Statics.field319;
        Statics.field2799 = class241.field2807;
        Statics.field2700 = class241.field2806;
        Statics.field2592 = class241.field2808;
        Statics.field2122 = class241.field2809;
        Statics.field13 = new class148();
        this.method813();
        this.method933();
        Statics.field33 = this.method808();
        Statics.field779 = new class175(255, class168.field2202, class168.field2205, 500000);
        Statics.field1117 = class79.method18();
        this.method809();
        class58.method5115(this, Statics.field245);
        if (field855 != 0) {
            field869 = true;
        }
        int var1 = Statics.field1117.field1230;
        field1093 = 0L;
        if (var1 >= 2) {
            field1065 = true;
        } else {
            field1065 = false;
        }
        int var2 = field1065 ? 2 : 1;
        if (var2 == 1) {
            Statics.field3445.method807(765, 503);
        } else {
            Statics.field3445.method807(7680, 2160);
        }
        if (field1111 >= 25) {
            class185 var3 = class185.method2191(class182.field2423, field912.field1461);
            class202 var4 = var3.field2489;
            int var5 = field1065 ? 2 : 1;
            var4.method3363(var5);
            var3.field2489.method3476(Statics.field2039);
            var3.field2489.method3476(Statics.field328);
            field912.method1999(var3);
        }
        Statics.field1666 = new class80(Statics.field2078);
    }

    @ObfuscatedName("client.ao(I)V")
    public final void method831() {
        field913++;
        this.method1376();
        class263.method1831();
        class230.method2023();
        method510();
        class52.method2937();
        class61.method1056();
        if (Statics.field33 != null) {
            int var1 = Statics.field33.method698();
            field1049 = var1;
        }
        if (field1111 == 0) {
            method1845();
            class60.method3011();
        } else if (field1111 == 5) {
            class91.method170(this);
            method1845();
            class60.method3011();
        } else if (field1111 == 10 || field1111 == 11) {
            class91.method170(this);
        } else if (field1111 == 20) {
            class91.method170(this);
            this.method1183();
        } else if (field1111 == 25) {
            method682();
        }
        if (field1111 == 30) {
            this.method1184();
        } else if (field1111 == 40 || field1111 == 45) {
            this.method1183();
        }
    }

    @ObfuscatedName("client.ak(ZI)V")
    public final void method832(boolean arg0) {
        boolean var2 = class230.method1976();
        if (var2 && field1086 && Statics.field1590 != null) {
            Statics.field1590.method2159();
        }
        if ((field1111 == 10 || field1111 == 20 || field1111 == 30) && field1093 != 0L && class197.method4873() > field1093) {
            int var3 = field1065 ? 2 : 1;
            field1093 = 0L;
            if (var3 >= 2) {
                field1065 = true;
            } else {
                field1065 = false;
            }
            int var4 = field1065 ? 2 : 1;
            if (var4 == 1) {
                Statics.field3445.method807(765, 503);
            } else {
                Statics.field3445.method807(7680, 2160);
            }
            if (field1111 >= 25) {
                class185 var5 = class185.method2191(class182.field2423, field912.field1461);
                class202 var6 = var5.field2489;
                int var7 = field1065 ? 2 : 1;
                var6.method3363(var7);
                var5.field2489.method3476(Statics.field2039);
                var5.field2489.method3476(Statics.field328);
                field912.method1999(var5);
            }
        }
        if (arg0) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1056[var8] = true;
            }
        }
        if (field1111 == 0) {
            this.method834(class91.field1351, class91.field1352, arg0);
        } else if (field1111 == 5) {
            class91.method241(Statics.field342, Statics.field318, Statics.field3013, arg0);
        } else if (field1111 == 10 || field1111 == 11) {
            class91.method241(Statics.field342, Statics.field318, Statics.field3013, arg0);
        } else if (field1111 == 20) {
            class91.method241(Statics.field342, Statics.field318, Statics.field3013, arg0);
        } else if (field1111 == 25) {
            if (field1003 == 1) {
                if (field905 > field906) {
                    field906 = field905;
                }
                int var9 = (field906 * 50 - field905 * 50) / field906;
                method17(class252.field3031 + class87.field1315 + class87.field1309 + var9 + "%" + class87.field1312, false);
            } else if (field1003 == 2) {
                if (field911 > field908) {
                    field908 = field911;
                }
                int var10 = (field908 * 50 - field911 * 50) / field908 + 50;
                method17(class252.field3031 + class87.field1315 + class87.field1309 + var10 + "%" + class87.field1312, false);
            } else {
                method17(class252.field3031, false);
            }
        } else if (field1111 == 30) {
            this.method1553();
        } else if (field1111 == 40) {
            method17(class252.field3032 + class87.field1315 + class252.field3033, false);
        } else if (field1111 == 45) {
            method17(class252.field3179, false);
        }
        if (field1111 == 30 && field1063 == 0 && !arg0 && !field1065) {
            for (int var11 = 0; var11 < field857; var11++) {
                if (field1057[var11]) {
                    Statics.field309.method792(field1059[var11], field1060[var11], field874[var11], field1062[var11]);
                    field1057[var11] = false;
                }
            }
        } else if (field1111 > 0) {
            Statics.field309.method791(0, 0);
            for (int var12 = 0; var12 < field857; var12++) {
                field1057[var12] = false;
            }
        }
    }

    @ObfuscatedName("client.ad(I)V")
    public final void method954() {
        if (Statics.field2146.method1912()) {
            Statics.field2146.method1914();
        }
        if (Statics.field465 != null) {
            Statics.field465.field797 = false;
        }
        Statics.field465 = null;
        field912.method2010();
        if (class52.field623 != null) {
            class52 var1 = class52.field623;
            synchronized (class52.field623) {
                class52.field623 = null;
            }
        }
        class61.method73();
        Statics.field33 = null;
        if (Statics.field1590 != null) {
            Statics.field1590.method2168();
        }
        if (Statics.field593 != null) {
            Statics.field593.method2168();
        }
        if (Statics.field3418 != null) {
            Statics.field3418.method3108();
        }
        class263.method3225();
        if (Statics.field13 != null) {
            Statics.field13.method2944();
            Statics.field13 = null;
        }
        try {
            class168.field2202.method2409();
            for (int var3 = 0; var3 < Statics.field3018; var3++) {
                Statics.field232[var3].method2409();
            }
            class168.field2205.method2409();
            class168.field2201.method2409();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("bj.fg(II)V")
    public static void method751(int arg0) {
        if (field1111 == arg0) {
            return;
        }
        if (field1111 == 0) {
            Statics.field3445.method929();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field887 = 0;
            field1096 = 0;
            field889 = 0;
            field903.method4880(arg0);
            if (arg0 != 20) {
                method22(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1813 != null) {
            Statics.field1813.method3108();
            Statics.field1813 = null;
        }
        if (field1111 == 25) {
            field1003 = 0;
            field905 = 0;
            field906 = 1;
            field911 = 0;
            field908 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class91.method230(Statics.field2046, Statics.field313, true, 0);
        } else if (arg0 == 20) {
            class91.method230(Statics.field2046, Statics.field313, true, field1111 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class91.method230(Statics.field2046, Statics.field313, false, 4);
        } else if (Statics.field1336) {
            Statics.field1338 = null;
            Statics.field2107 = null;
            Statics.field1340 = null;
            Statics.field1360 = null;
            Statics.field1341 = null;
            Statics.field304 = null;
            Statics.field1299 = null;
            Statics.field34 = null;
            Statics.field340 = null;
            Statics.field745 = null;
            Statics.field1368 = null;
            Statics.field18 = null;
            Statics.field452 = null;
            Statics.field2108 = null;
            Statics.field502 = null;
            Statics.field3927 = null;
            Statics.field19 = null;
            Statics.field1339 = null;
            Statics.field2605 = null;
            Statics.field460 = null;
            Statics.field790 = null;
            Statics.field560 = null;
            class230.field2695 = 1;
            Statics.field1906 = null;
            Statics.field3941 = -1;
            Statics.field1898 = -1;
            Statics.field1335 = 0;
            Statics.field2194 = false;
            Statics.field336 = 2;
            class265.method141(true);
            Statics.field1336 = false;
        }
        field1111 = arg0;
    }

    @ObfuscatedName("client.fx(B)V")
    public void method1376() {
        if (field1111 != 1000) {
            boolean var1 = class265.method65();
            if (!var1) {
                this.method1541();
            }
        }
    }

    @ObfuscatedName("client.fq(I)V")
    public void method1541() {
        if (class265.field3421 >= 4) {
            this.method930("js5crc");
            field1111 = 1000;
            return;
        }
        if (class265.field3416 >= 4) {
            if (field1111 <= 5) {
                this.method930("js5io");
                field1111 = 1000;
                return;
            }
            field883 = 3000;
            class265.field3416 = 3;
        }
        if (--field883 + 1 > 0) {
            return;
        }
        try {
            if (field1097 == 0) {
                Statics.field2482 = Statics.field671.method3079(Statics.field2498, Statics.field579);
                field1097++;
            }
            if (field1097 == 1) {
                if (Statics.field2482.field2183 == 2) {
                    this.method1182(-1);
                    return;
                }
                if (Statics.field2482.field2183 == 1) {
                    field1097++;
                }
            }
            if (field1097 == 2) {
                if (field1061) {
                    Socket var1 = (Socket) Statics.field2482.field2182;
                    class172 var2 = new class172(var1, 40000, 5000);
                    Statics.field373 = var2;
                } else {
                    Statics.field373 = new class174((Socket) Statics.field2482.field2182, Statics.field671, 5000);
                }
                class195 var3 = new class195(5);
                var3.method3363(15);
                var3.method3319(169);
                Statics.field373.method3107(var3.field2563, 0, 5);
                field1097++;
                Statics.field953 = class197.method4873();
            }
            if (field1097 == 3) {
                if (Statics.field373.method3104() > 0 || !field1061 && field1111 <= 5) {
                    int var4 = Statics.field373.method3122();
                    if (var4 != 0) {
                        this.method1182(var4);
                        return;
                    }
                    field1097++;
                } else if (class197.method4873() - Statics.field953 > 30000L) {
                    this.method1182(-2);
                    return;
                }
            }
            if (field1097 == 4) {
                class170 var5 = Statics.field373;
                boolean var6 = field1111 > 20;
                if (Statics.field3418 != null) {
                    try {
                        Statics.field3418.method3108();
                    } catch (Exception var16) {
                    }
                    Statics.field3418 = null;
                }
                Statics.field3418 = var5;
                class265.method141(var6);
                class265.field3425.field2562 = 0;
                Statics.field2571 = null;
                Statics.field2045 = null;
                class265.field3424 = 0;
                while (true) {
                    class261 var8 = (class261) class265.field3408.method3749();
                    if (var8 == null) {
                        while (true) {
                            class261 var9 = (class261) class265.field3417.method3749();
                            if (var9 == null) {
                                if (class265.field3420 != 0) {
                                    try {
                                        class195 var10 = new class195(4);
                                        var10.method3363(4);
                                        var10.method3363(class265.field3420);
                                        var10.method3476(0);
                                        Statics.field3418.method3107(var10.field2563, 0, 4);
                                    } catch (IOException var15) {
                                        try {
                                            Statics.field3418.method3108();
                                        } catch (Exception var14) {
                                        }
                                        class265.field3416++;
                                        Statics.field3418 = null;
                                    }
                                }
                                class265.field3404 = 0;
                                Statics.field3405 = class197.method4873();
                                Statics.field2482 = null;
                                Statics.field373 = null;
                                field1097 = 0;
                                field886 = 0;
                                return;
                            }
                            class265.field3410.method3654(var9);
                            class265.field3413.method3741(var9, var9.field2660);
                            class265.field3422++;
                            class265.field3414--;
                        }
                    }
                    class265.field3406.method3741(var8, var8.field2660);
                    class265.field3407++;
                    class265.field3409--;
                }
            }
        } catch (IOException var17) {
            this.method1182(-3);
        }
    }

    @ObfuscatedName("client.fk(II)V")
    public void method1182(int arg0) {
        Statics.field2482 = null;
        Statics.field373 = null;
        field1097 = 0;
        if (Statics.field579 == Statics.field319) {
            Statics.field579 = Statics.field324;
        } else {
            Statics.field579 = Statics.field319;
        }
        field886++;
        if (field886 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field1111 <= 5) {
                this.method930("js5connect_full");
                field1111 = 1000;
            } else {
                field883 = 3000;
            }
        } else if (field886 >= 2 && arg0 == 6) {
            this.method930("js5connect_outofdate");
            field1111 = 1000;
        } else if (field886 >= 4) {
            if (field1111 <= 5) {
                this.method930("js5connect");
                field1111 = 1000;
            } else {
                field883 = 3000;
            }
        }
    }

    @ObfuscatedName("d.fp(Lji;Ljava/lang/String;B)V")
    public static void method51(class264 arg0, String arg1) {
        class65 var2 = new class65(arg0, arg1);
        field1121.add(var2);
    }

    @ObfuscatedName("br.fv(I)Z")
    public static boolean method1041() {
        if (field1121 == null || field1122 >= field1121.size()) {
            return true;
        }
        while (field1122 < field1121.size()) {
            class65 var0 = (class65) field1121.get(field1122);
            if (!var0.method1039()) {
                return false;
            }
            field1122++;
        }
        return true;
    }

    @ObfuscatedName("cn.fz(B)V")
    public static void method1845() {
        if (field881 == 0) {
            Statics.field2246 = new class138(4, 104, 104, class63.field731);
            for (int var0 = 0; var0 < 4; var0++) {
                field910[var0] = new class177(104, 104);
            }
            Statics.field566 = new class332(512, 512);
            class91.field1352 = class252.field3087;
            class91.field1351 = 5;
            field881 = 20;
        } else if (field881 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class135.field1939[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class138.method2775(var1, 500, 800, 512, 334);
            class91.field1352 = class252.field3035;
            class91.field1351 = 10;
            field881 = 30;
        } else if (field881 == 30) {
            Statics.field714 = method179(0, false, true, true);
            Statics.field1294 = method179(1, false, true, true);
            Statics.field885 = method179(2, true, false, true);
            Statics.field233 = method179(3, false, true, true);
            Statics.field398 = method179(4, false, true, true);
            Statics.field637 = method179(5, true, true, true);
            Statics.field235 = method179(6, true, true, true);
            Statics.field402 = method179(7, false, true, true);
            Statics.field313 = method179(8, false, true, true);
            Statics.field419 = method179(9, false, true, true);
            Statics.field2046 = method179(10, false, true, true);
            Statics.field2518 = method179(11, false, true, true);
            Statics.field533 = method179(12, false, true, true);
            Statics.field490 = method179(13, true, false, true);
            Statics.field2694 = method179(14, false, true, true);
            Statics.field635 = method179(15, false, true, true);
            Statics.field469 = method179(16, true, true, true);
            class91.field1352 = class252.field3036;
            class91.field1351 = 20;
            field881 = 40;
        } else if (field881 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field714.method4378() * 4 / 100;
            int var8 = var7 + Statics.field1294.method4378() * 4 / 100;
            int var9 = var8 + Statics.field885.method4378() * 2 / 100;
            int var10 = var9 + Statics.field233.method4378() * 2 / 100;
            int var11 = var10 + Statics.field398.method4378() * 6 / 100;
            int var12 = var11 + Statics.field637.method4378() * 4 / 100;
            int var13 = var12 + Statics.field235.method4378() * 2 / 100;
            int var14 = var13 + Statics.field402.method4378() * 58 / 100;
            int var15 = var14 + Statics.field313.method4378() * 2 / 100;
            int var16 = var15 + Statics.field419.method4378() * 2 / 100;
            int var17 = var16 + Statics.field2046.method4378() * 2 / 100;
            int var18 = var17 + Statics.field2518.method4378() * 2 / 100;
            int var19 = var18 + Statics.field533.method4378() * 2 / 100;
            int var20 = var19 + Statics.field490.method4378() * 2 / 100;
            int var21 = var20 + Statics.field2694.method4378() * 2 / 100;
            int var22 = var21 + Statics.field635.method4378() * 2 / 100;
            int var23 = var22 + Statics.field469.method4378() * 2 / 100;
            if (var23 == 100) {
                method51(Statics.field714, "Animations");
                method51(Statics.field1294, "Skeletons");
                method51(Statics.field398, "Sound FX");
                method51(Statics.field637, "Maps");
                method51(Statics.field235, "Music Tracks");
                method51(Statics.field402, "Models");
                method51(Statics.field313, "Sprites");
                method51(Statics.field2518, "Music Jingles");
                method51(Statics.field2694, "Music Samples");
                method51(Statics.field635, "Music Patches");
                method51(Statics.field469, "World Map");
                class91.field1352 = class252.field3119;
                class91.field1351 = 30;
                field881 = 45;
            } else {
                if (var23 != 0) {
                    class91.field1352 = class252.field3037 + var23 + "%";
                }
                class91.field1351 = 30;
            }
        } else if (field881 == 45) {
            Statics.method1025(22050, !field853, 2);
            class231 var24 = new class231();
            var24.method3930(9, 128);
            Statics.field1590 = class108.method4246(Statics.field671, 0, 22050);
            Statics.field1590.method2157(var24);
            class230.method2483(Statics.field635, Statics.field2694, Statics.field398, var24);
            Statics.field593 = class108.method4246(Statics.field671, 1, 2048);
            Statics.field239 = new class101();
            Statics.field593.method2157(Statics.field239);
            Statics.field321 = new class115(22050, Statics.field1550);
            class91.field1352 = class252.field3039;
            class91.field1351 = 35;
            field881 = 50;
            Statics.field648 = new class311(Statics.field313, Statics.field490);
        } else if (field881 == 50) {
            class310[] var25 = new class310[] { class310.field3888, class310.field3886, class310.field3887, class310.field3883, class310.field3885, class310.field3884 };
            int var26 = var25.length;
            class311 var27 = Statics.field648;
            class310[] var28 = new class310[] { class310.field3888, class310.field3886, class310.field3887, class310.field3883, class310.field3885, class310.field3884 };
            field1028 = var27.method5113(var28);
            if (field1028.size() < var26) {
                class91.field1352 = class252.field3040 + field1028.size() * 100 / var26 + "%";
                class91.field1351 = 40;
            } else {
                Statics.field318 = (class312) field1028.get(class310.field3888);
                Statics.field3013 = (class312) field1028.get(class310.field3884);
                Statics.field342 = (class312) field1028.get(class310.field3885);
                Statics.field2121 = new class338(true);
                class91.field1352 = class252.field3041;
                class91.field1351 = 40;
                field881 = 60;
            }
        } else if (field881 == 60) {
            class264 var29 = Statics.field2046;
            class264 var30 = Statics.field313;
            int var31 = 0;
            if (var29.method4337("title.jpg", "")) {
                var31++;
            }
            if (var30.method4337("logo", "")) {
                var31++;
            }
            if (var30.method4337("logo_deadman_mode", "")) {
                var31++;
            }
            if (var30.method4337("titlebox", "")) {
                var31++;
            }
            if (var30.method4337("titlebutton", "")) {
                var31++;
            }
            if (var30.method4337("runes", "")) {
                var31++;
            }
            if (var30.method4337("title_mute", "")) {
                var31++;
            }
            if (var30.method4337("options_radio_buttons,0", "")) {
                var31++;
            }
            if (var30.method4337("options_radio_buttons,2", "")) {
                var31++;
            }
            if (var30.method4337("options_radio_buttons,4", "")) {
                var31++;
            }
            if (var30.method4337("options_radio_buttons,6", "")) {
                var31++;
            }
            var30.method4337("sl_back", "");
            var30.method4337("sl_flags", "");
            var30.method4337("sl_arrows", "");
            var30.method4337("sl_stars", "");
            var30.method4337("sl_button", "");
            byte var34 = 11;
            if (var31 < var34) {
                class91.field1352 = class252.field3042 + var31 * 100 / var34 + "%";
                class91.field1351 = 50;
            } else {
                class91.field1352 = class252.field3043;
                class91.field1351 = 50;
                method751(5);
                field881 = 70;
            }
        } else if (field881 == 70) {
            if (Statics.field885.method4290()) {
                class287.method1160(Statics.field885);
                class274.method1584(Statics.field885);
                class264 var36 = Statics.field885;
                class264 var37 = Statics.field402;
                Statics.field3520 = var36;
                Statics.field3510 = var37;
                Statics.field3515 = Statics.field3520.method4279(3);
                class264 var38 = Statics.field885;
                class264 var39 = Statics.field402;
                boolean var40 = field853;
                Statics.field3592 = var38;
                Statics.field3593 = var39;
                class283.field3613 = var40;
                class264 var41 = Statics.field885;
                class264 var42 = Statics.field402;
                Statics.field2520 = var41;
                Statics.field3717 = var42;
                class280.method11(Statics.field885);
                class284.method1824(Statics.field885, Statics.field402, field856, Statics.field318);
                class288.method4256(Statics.field885, Statics.field714, Statics.field1294);
                class273.method604(Statics.field885, Statics.field402);
                class278.method1102(Statics.field885);
                class269.method1801(Statics.field885);
                class243.method2025(Statics.field233, Statics.field402, Statics.field313, Statics.field490);
                class264 var43 = Statics.field885;
                Statics.field3442 = var43;
                class281.method3205(Statics.field885);
                Statics.method4448(Statics.field885);
                class264 var44 = Statics.field885;
                Statics.field3482 = var44;
                class279.method1064(Statics.field885);
                Statics.field2146 = new class95();
                class282.method995(Statics.field885, Statics.field313, Statics.field490);
                class276.method1816(Statics.field885, Statics.field313);
                class270.method2451(Statics.field885, Statics.field313);
                class91.field1352 = class252.field3216;
                class91.field1351 = 60;
                field881 = 80;
            } else {
                class91.field1352 = class252.field3030 + Statics.field885.method4387() + "%";
                class91.field1351 = 60;
            }
        } else if (field881 == 80) {
            int var45 = 0;
            if (Statics.field545 == null) {
                class264 var46 = Statics.field313;
                int var47 = var46.method4306("compass");
                int var48 = var46.method4295(var47, "");
                class332 var49 = class333.method3538(var46, var47, var48);
                Statics.field545 = var49;
            } else {
                var45++;
            }
            if (Statics.field2729 == null) {
                class264 var50 = Statics.field313;
                int var51 = var50.method4306("mapedge");
                int var52 = var50.method4295(var51, "");
                class332 var53 = class333.method3538(var50, var51, var52);
                Statics.field2729 = var53;
            } else {
                var45++;
            }
            if (Statics.field15 == null) {
                Statics.field15 = class333.method4242(Statics.field313, "mapscene", "");
            } else {
                var45++;
            }
            if (Statics.field1893 == null) {
                Statics.field1893 = class333.method235(Statics.field313, "headicons_pk", "");
            } else {
                var45++;
            }
            if (Statics.field794 == null) {
                Statics.field794 = class333.method235(Statics.field313, "headicons_prayer", "");
            } else {
                var45++;
            }
            if (Statics.field2071 == null) {
                Statics.field2071 = class333.method235(Statics.field313, "headicons_hint", "");
            } else {
                var45++;
            }
            if (Statics.field766 == null) {
                Statics.field766 = class333.method235(Statics.field313, "mapmarker", "");
            } else {
                var45++;
            }
            if (Statics.field742 == null) {
                Statics.field742 = class333.method235(Statics.field313, "cross", "");
            } else {
                var45++;
            }
            if (Statics.field17 == null) {
                Statics.field17 = class333.method235(Statics.field313, "mapdots", "");
            } else {
                var45++;
            }
            if (Statics.field236 == null) {
                Statics.field236 = class333.method4242(Statics.field313, "scrollbar", "");
            } else {
                var45++;
            }
            if (Statics.field344 == null) {
                Statics.field344 = class333.method4242(Statics.field313, "mod_icons", "");
            } else {
                var45++;
            }
            if (var45 < 11) {
                class91.field1352 = class252.field3240 + var45 * 100 / 12 + "%";
                class91.field1351 = 70;
            } else {
                Statics.field3905 = Statics.field344;
                Statics.field2729.method5462();
                int var54 = (int) (Math.random() * 21.0D) - 10;
                int var55 = (int) (Math.random() * 21.0D) - 10;
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 41.0D) - 20;
                Statics.field15[0].method5433(var54 + var57, var55 + var57, var56 + var57);
                class91.field1352 = class252.field3234;
                class91.field1351 = 70;
                field881 = 90;
            }
        } else if (field881 == 90) {
            if (Statics.field419.method4290()) {
                Statics.field24 = new class124(Statics.field419, Statics.field313, 20, 0.8D, field853 ? 64 : 128);
                class135.method2727(Statics.field24);
                class135.method2676(0.8D);
                field881 = 100;
            } else {
                class91.field1352 = class252.field3252 + "0%";
                class91.field1351 = 90;
            }
        } else if (field881 == 100) {
            int var58 = Statics.field24.method2452();
            if (var58 < 100) {
                class91.field1352 = class252.field3252 + var58 + "%";
                class91.field1351 = 90;
            } else {
                class91.field1352 = class252.field3088;
                class91.field1351 = 90;
                field881 = 110;
            }
        } else if (field881 == 110) {
            Statics.field465 = new class70();
            Statics.field671.method3080(Statics.field465, 10);
            class91.field1352 = class252.field3112;
            class91.field1351 = 92;
            field881 = 120;
        } else if (field881 == 120) {
            if (Statics.field2046.method4337("huffman", "")) {
                class187 var59 = new class187(Statics.field2046.method4271("huffman", ""));
                class314.method1070(var59);
                class91.field1352 = class252.field3052;
                class91.field1351 = 94;
                field881 = 130;
            } else {
                class91.field1352 = class252.field3051 + "%";
                class91.field1351 = 94;
            }
        } else if (field881 == 130) {
            if (!Statics.field233.method4290()) {
                class91.field1352 = class252.field3057 + Statics.field233.method4387() * 4 / 5 + "%";
                class91.field1351 = 96;
            } else if (!Statics.field533.method4290()) {
                class91.field1352 = class252.field3057 + (80 + Statics.field533.method4387() / 6) + "%";
                class91.field1351 = 96;
            } else if (Statics.field490.method4290()) {
                class91.field1352 = class252.field3293;
                class91.field1351 = 98;
                field881 = 140;
            } else {
                class91.field1352 = class252.field3057 + (96 + Statics.field490.method4387() / 50) + "%";
                class91.field1351 = 96;
            }
        } else if (field881 == 140) {
            class91.field1351 = 100;
            if (Statics.field469.method4310(class42.field536.field540)) {
                if (Statics.field2585 == null) {
                    Statics.field2585 = new class335();
                    Statics.field2585.method5610(Statics.field469, Statics.field342, field1028, Statics.field15);
                }
                int var60 = Statics.field2585.method5661();
                if (var60 < 100) {
                    class91.field1352 = class252.field3055 + (var60 * 9 / 10 + 10) + "%";
                } else {
                    class91.field1352 = class252.field3270;
                    field881 = 150;
                }
            } else {
                class91.field1352 = class252.field3055 + Statics.field469.method4277(class42.field536.field540) / 10 + "%";
            }
        } else if (field881 == 150) {
            method751(10);
        }
    }

    @ObfuscatedName("t.fd(IZZZI)Lji;")
    public static class264 method179(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class175 var4 = null;
        if (class168.field2202 != null) {
            var4 = new class175(arg0, class168.field2202, Statics.field232[arg0], 1000000);
        }
        return new class264(var4, Statics.field779, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fi(I)V")
    public final void method1183() {
        class170 var1 = field912.method2003();
        class202 var2 = field912.field1457;
        try {
            if (field887 == 0) {
                if (var1 != null) {
                    var1.method3108();
                    var1 = null;
                }
                Statics.field3498 = null;
                field986 = false;
                field1096 = 0;
                field887 = 1;
            }
            if (field887 == 1) {
                if (Statics.field3498 == null) {
                    Statics.field3498 = Statics.field671.method3079(Statics.field2498, Statics.field579);
                }
                if (Statics.field3498.field2183 == 2) {
                    throw new IOException();
                }
                if (Statics.field3498.field2183 == 1) {
                    if (field1061) {
                        Socket var3 = (Socket) Statics.field3498.field2182;
                        class172 var4 = new class172(var3, 40000, 5000);
                        var1 = var4;
                    } else {
                        var1 = new class174((Socket) Statics.field3498.field2182, Statics.field671, 5000);
                    }
                    field912.method2000(var1);
                    Statics.field3498 = null;
                    field887 = 2;
                }
            }
            if (field887 == 2) {
                field912.method1997();
                class185 var5;
                if (class185.field2492 == 0) {
                    var5 = new class185();
                } else {
                    var5 = class185.field2487[--class185.field2492];
                }
                var5.field2491 = null;
                var5.field2488 = 0;
                var5.field2489 = new class202(5000);
                var5.field2489.method3363(class183.field2466.field2470);
                field912.method1999(var5);
                field912.method1998();
                var2.field2562 = 0;
                field887 = 3;
            }
            if (field887 == 3) {
                if (Statics.field1590 != null) {
                    Statics.field1590.method2158();
                }
                if (Statics.field593 != null) {
                    Statics.field593.method2158();
                }
                boolean var9 = true;
                if (field1061 && !var1.method3103(1)) {
                    var9 = false;
                }
                if (var9) {
                    int var10 = var1.method3122();
                    if (Statics.field1590 != null) {
                        Statics.field1590.method2158();
                    }
                    if (Statics.field593 != null) {
                        Statics.field593.method2158();
                    }
                    if (var10 != 0) {
                        method227(var10);
                        return;
                    }
                    var2.field2562 = 0;
                    field887 = 4;
                }
            }
            if (field887 == 4) {
                if (var2.field2562 < 8) {
                    int var11 = var1.method3104();
                    if (var11 > 8 - var2.field2562) {
                        var11 = 8 - var2.field2562;
                    }
                    if (var11 > 0) {
                        var1.method3106(var2.field2563, var2.field2562, var11);
                        var2.field2562 += var11;
                    }
                }
                if (var2.field2562 == 8) {
                    var2.field2562 = 0;
                    Statics.field750 = var2.method3381();
                    field887 = 5;
                }
            }
            if (field887 == 5) {
                field912.field1457.field2562 = 0;
                field912.method1997();
                class202 var12 = new class202(500);
                int[] var13 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field750 >> 32), (int) (Statics.field750 & 0xFFFFFFFFFFFFFFFFL) };
                var12.field2562 = 0;
                var12.method3363(1);
                var12.method3363(field1051.method15());
                var12.method3319(var13[0]);
                var12.method3319(var13[1]);
                var12.method3319(var13[2]);
                var12.method3319(var13[3]);
                switch(field1051.field2141) {
                    case 0:
                    case 3:
                        var12.method3358(Statics.field339);
                        var12.field2562 += 5;
                        break;
                    case 1:
                        var12.method3319((Integer) Statics.field1117.field1229.get(class319.method4376(class91.field1358)));
                        var12.field2562 += 4;
                        break;
                    case 2:
                        var12.field2562 += 8;
                }
                var12.method3300(class91.field1359);
                var12.method3330(class89.field1328, class89.field1325);
                class185 var14;
                if (class185.field2492 == 0) {
                    var14 = new class185();
                } else {
                    var14 = class185.field2487[--class185.field2492];
                }
                var14.field2491 = null;
                var14.field2488 = 0;
                var14.field2489 = new class202(5000);
                var14.field2489.field2562 = 0;
                if (field1111 == 40) {
                    var14.field2489.method3363(class183.field2469.field2470);
                } else {
                    var14.field2489.method3363(class183.field2471.field2470);
                }
                var14.field2489.method3476(0);
                int var18 = var14.field2489.field2562;
                var14.field2489.method3319(169);
                var14.field2489.method3504(var12.field2563, 0, var12.field2562);
                int var19 = var14.field2489.field2562;
                var14.field2489.method3300(class91.field1358);
                var14.field2489.method3363((field1065 ? 1 : 0) << 1 | (field853 ? 1 : 0));
                var14.field2489.method3476(Statics.field2039);
                var14.field2489.method3476(Statics.field328);
                method2571(var14.field2489);
                var14.field2489.method3300(Statics.field357);
                var14.field2489.method3319(Statics.field2516);
                class195 var20 = new class195(Statics.field2121.method5835());
                Statics.field2121.method5828(var20);
                var14.field2489.method3504(var20.field2563, 0, var20.field2563.length);
                var14.field2489.method3363(field1017);
                var14.field2489.method3319(0);
                var14.field2489.method3319(Statics.field714.field3368);
                var14.field2489.method3319(Statics.field1294.field3368);
                var14.field2489.method3319(Statics.field885.field3368);
                var14.field2489.method3319(Statics.field233.field3368);
                var14.field2489.method3319(Statics.field398.field3368);
                var14.field2489.method3319(Statics.field637.field3368);
                var14.field2489.method3319(Statics.field235.field3368);
                var14.field2489.method3319(Statics.field402.field3368);
                var14.field2489.method3319(Statics.field313.field3368);
                var14.field2489.method3319(Statics.field419.field3368);
                var14.field2489.method3319(Statics.field2046.field3368);
                var14.field2489.method3319(Statics.field2518.field3368);
                var14.field2489.method3319(Statics.field533.field3368);
                var14.field2489.method3319(Statics.field490.field3368);
                var14.field2489.method3319(Statics.field2694.field3368);
                var14.field2489.method3319(Statics.field635.field3368);
                var14.field2489.method3319(Statics.field469.field3368);
                var14.field2489.method3328(var13, var19, var14.field2489.field2562);
                var14.field2489.method3304(var14.field2489.field2562 - var18);
                field912.method1999(var14);
                field912.method1998();
                field912.field1461 = new class203(var13);
                for (int var21 = 0; var21 < 4; var21++) {
                    var13[var21] += 50;
                }
                var2.method3553(var13);
                field887 = 6;
            }
            if (field887 == 6 && var1.method3104() > 0) {
                int var22 = var1.method3122();
                if (var22 == 21 && field1111 == 20) {
                    field887 = 7;
                } else if (var22 == 2) {
                    field887 = 9;
                } else if (var22 == 15 && field1111 == 40) {
                    field912.field1464 = -1;
                    field887 = 13;
                } else if (var22 == 23 && field889 < 1) {
                    field889++;
                    field887 = 0;
                } else if (var22 == 29) {
                    field887 = 11;
                } else {
                    method227(var22);
                    return;
                }
            }
            if (field887 == 7 && var1.method3104() > 0) {
                field1042 = (var1.method3122() + 3) * 60;
                field887 = 8;
            }
            if (field887 == 8) {
                field1096 = 0;
                class91.method4439(class252.field3060, class252.field3062, field1042 / 60 + class252.field3198);
                if (--field1042 <= 0) {
                    field887 = 0;
                }
            } else {
                if (field887 == 9 && var1.method3104() >= 13) {
                    boolean var23 = var1.method3122() == 1;
                    var1.method3106(var2.field2563, 0, 4);
                    var2.field2562 = 0;
                    boolean var24 = false;
                    if (var23) {
                        int var25 = var2.method3572() << 24;
                        int var26 = var25 | var2.method3572() << 16;
                        int var27 = var26 | var2.method3572() << 8;
                        int var28 = var27 | var2.method3572();
                        int var29 = class319.method4376(class91.field1358);
                        if (Statics.field1117.field1229.size() >= 10 && !Statics.field1117.field1229.containsKey(var29)) {
                            Iterator var30 = Statics.field1117.field1229.entrySet().iterator();
                            var30.next();
                            var30.remove();
                        }
                        Statics.field1117.field1229.put(var29, var28);
                    }
                    if (class91.field1344) {
                        Statics.field1117.field1231 = class91.field1358;
                    } else {
                        Statics.field1117.field1231 = null;
                    }
                    class79.method4185();
                    field997 = var1.method3122();
                    field1022 = var1.method3122() == 1;
                    field969 = var1.method3122();
                    field969 <<= 0x8;
                    field969 += var1.method3122();
                    field970 = var1.method3122();
                    var1.method3106(var2.field2563, 0, 1);
                    var2.field2562 = 0;
                    class181[] var31 = class181.method3062();
                    int var32 = var2.method3558();
                    if (var32 < 0 || var32 >= var31.length) {
                        throw new IOException(var32 + " " + var2.field2562);
                    }
                    field912.field1470 = var31[var32];
                    field912.field1464 = field912.field1470.field2308;
                    var1.method3106(var2.field2563, 0, 2);
                    var2.field2562 = 0;
                    field912.field1464 = var2.method3310();
                    try {
                        class54.method738(Statics.field3445, "zap");
                    } catch (Throwable var39) {
                    }
                    field887 = 10;
                }
                if (field887 != 10) {
                    if (field887 == 11 && var1.method3104() >= 2) {
                        var2.field2562 = 0;
                        var1.method3106(var2.field2563, 0, 2);
                        var2.field2562 = 0;
                        Statics.field2174 = var2.method3310();
                        field887 = 12;
                    }
                    if (field887 == 12 && var1.method3104() >= Statics.field2174) {
                        var2.field2562 = 0;
                        var1.method3106(var2.field2563, 0, Statics.field2174);
                        var2.field2562 = 0;
                        String var34 = var2.method3429();
                        String var35 = var2.method3429();
                        String var36 = var2.method3429();
                        class91.method4439(var34, var35, var36);
                        method751(10);
                    }
                    if (field887 == 13) {
                        if (field912.field1464 == -1) {
                            if (var1.method3104() < 2) {
                                return;
                            }
                            var1.method3106(var2.field2563, 0, 2);
                            var2.field2562 = 0;
                            field912.field1464 = var2.method3310();
                        }
                        if (var1.method3104() >= field912.field1464) {
                            var1.method3106(var2.field2563, 0, field912.field1464);
                            var2.field2562 = 0;
                            int var37 = field912.field1464;
                            field903.method4883();
                            method16();
                            Statics.method1583(var2);
                            if (var2.field2562 != var37) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field1096++;
                        if (field1096 > 2000) {
                            if (field889 < 1) {
                                if (Statics.field579 == Statics.field319) {
                                    Statics.field579 = Statics.field324;
                                } else {
                                    Statics.field579 = Statics.field319;
                                }
                                field889++;
                                field887 = 0;
                            } else {
                                method227(-3);
                            }
                        }
                    }
                } else if (var1.method3104() >= field912.field1464) {
                    var2.field2562 = 0;
                    var1.method3106(var2.field2563, 0, field912.field1464);
                    field903.method4881();
                    method4520();
                    Statics.method1583(var2);
                    Statics.field2207 = -1;
                    method338(false, var2);
                    field912.field1470 = null;
                }
            }
        } catch (IOException var40) {
            if (field889 < 1) {
                if (Statics.field579 == Statics.field319) {
                    Statics.field579 = Statics.field324;
                } else {
                    Statics.field579 = Statics.field319;
                }
                field889++;
                field887 = 0;
            } else {
                method227(-2);
            }
        }
    }

    @ObfuscatedName("jn.fl(I)V")
    public static void method4520() {
        field864 = -1L;
        field867 = -1;
        Statics.field465.field792 = 0;
        Statics.field644 = true;
        field868 = true;
        field1075 = -1L;
        class327.method47();
        field912.method1997();
        field912.field1457.field2562 = 0;
        field912.field1470 = null;
        field912.field1468 = null;
        field912.field1469 = null;
        field912.field1459 = null;
        field912.field1464 = 0;
        field912.field1466 = 0;
        field870 = 0;
        field900 = 0;
        field871 = 0;
        method7();
        class61.method26(0);
        class96.field1431.clear();
        class96.field1429.method3676();
        class96.field1430.method3901();
        class96.field1432 = 0;
        field1005 = 0;
        field1008 = false;
        field957 = 0;
        field922 = 0;
        field927 = 0;
        Statics.field327 = null;
        field1083 = 0;
        field1076 = -1;
        field1023 = 0;
        field1082 = 0;
        field879 = class90.field1331;
        field880 = class90.field1331;
        field895 = 0;
        class94.field1408 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class94.field1405[var0] = null;
            class94.field1417[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field1004[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field894[var2] = null;
        }
        field979 = -1;
        field982.method3811();
        field983.method3811();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field980[var3][var4][var5] = null;
                }
            }
        }
        field981 = new class218();
        Statics.field1666.method1683();
        for (int var6 = 0; var6 < Statics.field3447; var6++) {
            class269 var7 = class269.method1109(var6);
            if (var7 != null) {
                class238.field2786[var6] = 0;
                class238.field2788[var6] = 0;
            }
        }
        Statics.field2146.method1907();
        field1058 = -1;
        if (field888 != -1) {
            int var8 = field888;
            if (var8 != -1 && Statics.field3019[var8]) {
                Statics.field2814.method4299(var8);
                if (Statics.field2503[var8] != null) {
                    boolean var9 = true;
                    for (int var10 = 0; var10 < Statics.field2503[var8].length; var10++) {
                        if (Statics.field2503[var8][var10] != null) {
                            if (Statics.field2503[var8][var10].field2824 == 2) {
                                var9 = false;
                            } else {
                                Statics.field2503[var8][var10] = null;
                            }
                        }
                    }
                    if (var9) {
                        Statics.field2503[var8] = null;
                    }
                    Statics.field3019[var8] = false;
                }
            }
        }
        for (class68 var11 = (class68) field1014.method3749(); var11 != null; var11 = (class68) field1014.method3744()) {
            method3155(var11, true);
        }
        field888 = -1;
        field1014 = new class215(8);
        field1018 = null;
        method7();
        field1114.method4157((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var12 = 0; var12 < 8; var12++) {
            field976[var12] = null;
            field950[var12] = false;
        }
        class66.field753 = new class215(32);
        field996 = true;
        for (int var13 = 0; var13 < 100; var13++) {
            field1056[var13] = true;
        }
        class185 var14 = class185.method2191(class182.field2423, field912.field1461);
        class202 var15 = var14.field2489;
        int var16 = field1065 ? 2 : 1;
        var15.method3363(var16);
        var14.field2489.method3476(Statics.field2039);
        var14.field2489.method3476(Statics.field328);
        field912.method1999(var14);
        Statics.field2474 = null;
        for (int var17 = 0; var17 < 8; var17++) {
            field1045[var17] = new class17();
        }
        Statics.field519 = null;
    }

    @ObfuscatedName("l.fu(I)V")
    public static void method16() {
        field912.method1997();
        field912.field1457.field2562 = 0;
        field912.field1470 = null;
        field912.field1468 = null;
        field912.field1469 = null;
        field912.field1459 = null;
        field912.field1464 = 0;
        field912.field1466 = 0;
        field870 = 0;
        method7();
        field1083 = 0;
        field1023 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1004[var0] = null;
        }
        Statics.field3435 = null;
        for (int var1 = 0; var1 < field894.length; var1++) {
            class85 var2 = field894[var1];
            if (var2 != null) {
                var2.field1167 = -1;
                var2.field1168 = false;
            }
        }
        class66.field753 = new class215(32);
        method751(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field1056[var3] = true;
        }
        method3290();
    }

    @ObfuscatedName("aj.fo(II)V")
    public static void method227(int arg0) {
        if (arg0 == -3) {
            class91.method4439(class252.field3196, class252.field3064, class252.field3024);
        } else if (arg0 == -2) {
            class91.method4439(class252.field3066, class252.field3067, class252.field3045);
        } else if (arg0 == -1) {
            class91.method4439(class252.field3069, class252.field3023, class252.field3071);
        } else if (arg0 == 3) {
            class91.field1353 = 3;
        } else if (arg0 == 4) {
            class91.method4439(class252.field3248, class252.field3073, class252.field3074);
        } else if (arg0 == 5) {
            class91.method4439(class252.field3206, class252.field3076, class252.field3220);
        } else if (arg0 == 6) {
            class91.method4439(class252.field3078, class252.field3026, class252.field3080);
        } else if (arg0 == 7) {
            class91.method4439(class252.field3081, class252.field3029, class252.field3083);
        } else if (arg0 == 8) {
            class91.method4439(class252.field3151, class252.field3085, class252.field3086);
        } else if (arg0 == 9) {
            class91.method4439(class252.field3187, class252.field3068, class252.field3089);
        } else if (arg0 == 10) {
            class91.method4439(class252.field3090, class252.field3091, class252.field3154);
        } else if (arg0 == 11) {
            class91.method4439(class252.field3093, class252.field3094, class252.field3046);
        } else if (arg0 == 12) {
            class91.method4439(class252.field3117, class252.field3097, class252.field3098);
        } else if (arg0 == 13) {
            class91.method4439(class252.field3099, class252.field3218, class252.field3132);
        } else if (arg0 == 14) {
            class91.method4439(class252.field3050, class252.field3103, class252.field3034);
        } else if (arg0 == 16) {
            class91.method4439(class252.field3166, class252.field3106, class252.field3107);
        } else if (arg0 == 17) {
            class91.method4439(class252.field3108, class252.field3109, class252.field3110);
        } else if (arg0 == 18) {
            class91.method4439(class252.field3111, class252.field3182, class252.field3113);
        } else if (arg0 == 19) {
            class91.method4439(class252.field3114, class252.field3115, class252.field3053);
        } else if (arg0 == 20) {
            class91.method4439(class252.field3047, class252.field3118, class252.field3249);
        } else if (arg0 == 22) {
            class91.method4439(class252.field3120, class252.field3121, class252.field3197);
        } else if (arg0 == 23) {
            class91.method4439(class252.field3056, class252.field3124, class252.field3125);
        } else if (arg0 == 24) {
            class91.method4439(class252.field3254, class252.field3231, class252.field3128);
        } else if (arg0 == 25) {
            class91.method4439(class252.field3297, class252.field3130, class252.field3131);
        } else if (arg0 == 26) {
            class91.method4439(class252.field3129, class252.field3133, class252.field3134);
        } else if (arg0 == 27) {
            class91.method4439(class252.field3135, class252.field3136, class252.field3137);
        } else if (arg0 == 31) {
            class91.method4439(class252.field3144, class252.field3145, class252.field3096);
        } else if (arg0 == 32) {
            class91.method4439(class252.field3100, class252.field3148, class252.field3149);
        } else if (arg0 == 37) {
            class91.method4439(class252.field3150, class252.field3095, class252.field3044);
        } else if (arg0 == 38) {
            class91.method4439(class252.field3153, class252.field3102, class252.field3244);
        } else if (arg0 == 55) {
            class91.method4439(class252.field3126, class252.field3157, class252.field3038);
        } else if (arg0 == 56) {
            class91.method4439(class252.field3285, class252.field3160, class252.field3161);
            method751(11);
            return;
        } else if (arg0 == 57) {
            class91.method4439(class252.field3162, class252.field3163, class252.field3164);
            method751(11);
            return;
        } else {
            class91.method4439(class252.field3165, class252.field3158, class252.field3167);
        }
        method751(10);
    }

    @ObfuscatedName("e.fs(I)V")
    public static final void method2() {
        field912.method2010();
        class287.method4491();
        class274.field3500.method3709();
        class275.field3514.method3709();
        class283.method20();
        class286.method171();
        class284.field3650.method3709();
        class284.field3670.method3709();
        class284.field3652.method3709();
        class288.method3215();
        class273.method2979();
        class278.field3544.method3709();
        class269.method1110();
        class282.method3160();
        class276.method511();
        class280.field3554.method3709();
        class279.field3546.method3709();
        class270.method80();
        class240.field2803.method3709();
        class243.method3136();
        ((class124) Statics.field1936).method2480();
        class97.field1438.method3709();
        Statics.field714.method4283();
        Statics.field1294.method4283();
        Statics.field233.method4283();
        Statics.field398.method4283();
        Statics.field637.method4283();
        Statics.field235.method4283();
        Statics.field402.method4283();
        Statics.field313.method4283();
        Statics.field419.method4283();
        Statics.field2046.method4283();
        Statics.field2518.method4283();
        Statics.field533.method4283();
        Statics.field2246.method2741();
        for (int var0 = 0; var0 < 4; var0++) {
            field910[var0].method3188();
        }
        System.gc();
        class230.field2695 = 1;
        Statics.field1906 = null;
        Statics.field3941 = -1;
        Statics.field1898 = -1;
        Statics.field1335 = 0;
        Statics.field2194 = false;
        Statics.field336 = 2;
        field1085 = -1;
        field1086 = false;
        class81.method2014();
        method751(10);
    }

    @ObfuscatedName("aj.fc(I)V")
    public static final void method225() {
        if (field900 > 0) {
            method2();
        } else {
            field903.method4879();
            method751(40);
            Statics.field1813 = field912.method2003();
            field912.method2002();
        }
    }

    @ObfuscatedName("s.fy(ZB)V")
    public static final void method22(boolean arg0) {
        if (arg0) {
            field1051 = class91.field1363 ? class159.field2138 : class159.field2140;
        } else {
            field1051 = Statics.field1117.field1229.containsKey(class319.method4376(class91.field1358)) ? class159.field2139 : class159.field2142;
        }
    }

    @ObfuscatedName("client.fe(I)V")
    public final void method1184() {
        if (field870 > 1) {
            field870--;
        }
        if (field900 > 0) {
            field900--;
        }
        if (field986) {
            field986 = false;
            method225();
            return;
        }
        if (!field1000) {
            method3086();
        }
        for (int var1 = 0; var1 < 100 && this.method1202(field912); var1++) {
        }
        if (field1111 != 30) {
            return;
        }
        while (true) {
            class326 var2 = (class326) class327.field3959.method3767();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field903.field3820) {
                    class185 var6 = class185.method2191(class182.field2438, field912.field1461);
                    var6.field2489.method3363(0);
                    int var7 = var6.field2489.field2562;
                    field903.method4884(var6.field2489);
                    var6.field2489.method3459(var6.field2489.field2562 - var7);
                    field912.method1999(var6);
                    field903.method4882();
                }
                Object var8 = Statics.field465.field791;
                synchronized (Statics.field465.field791) {
                    if (!field862) {
                        Statics.field465.field792 = 0;
                    } else if (class61.field711 != 0 || Statics.field465.field792 >= 40) {
                        class185 var9 = class185.method2191(class182.field2371, field912.field1461);
                        var9.field2489.method3363(0);
                        int var10 = var9.field2489.field2562;
                        int var11 = 0;
                        for (int var12 = 0; var12 < Statics.field465.field792 && var9.field2489.field2562 - var10 < 240; var12++) {
                            var11++;
                            int var13 = Statics.field465.field799[var12];
                            if (var13 < 0) {
                                var13 = 0;
                            } else if (var13 > 502) {
                                var13 = 502;
                            }
                            int var14 = Statics.field465.field793[var12];
                            if (var14 < 0) {
                                var14 = 0;
                            } else if (var14 > 764) {
                                var14 = 764;
                            }
                            int var15 = var13 * 765 + var14;
                            if (Statics.field465.field799[var12] == -1 && Statics.field465.field793[var12] == -1) {
                                var14 = -1;
                                var13 = -1;
                                var15 = 524287;
                            }
                            if (field873 != var14 || field866 != var13) {
                                int var16 = var14 - field873;
                                field873 = var14;
                                int var17 = var13 - field866;
                                field866 = var13;
                                if (field867 < 8 && var16 >= -32 && var16 <= 31 && var17 >= -32 && var17 <= 31) {
                                    var16 += 32;
                                    var17 += 32;
                                    var9.field2489.method3476((field867 << 12) + (var16 << 6) + var17);
                                    field867 = 0;
                                } else if (field867 < 8) {
                                    var9.field2489.method3358((field867 << 19) + 8388608 + var15);
                                    field867 = 0;
                                } else {
                                    var9.field2489.method3319((field867 << 19) + -1073741824 + var15);
                                    field867 = 0;
                                }
                            } else if (field867 < 2047) {
                                field867++;
                            }
                        }
                        var9.field2489.method3459(var9.field2489.field2562 - var10);
                        field912.method1999(var9);
                        if (var11 >= Statics.field465.field792) {
                            Statics.field465.field792 = 0;
                        } else {
                            Statics.field465.field792 -= var11;
                            for (int var18 = 0; var18 < Statics.field465.field792; var18++) {
                                Statics.field465.field793[var18] = Statics.field465.field793[var11 + var18];
                                Statics.field465.field799[var18] = Statics.field465.field799[var11 + var18];
                            }
                        }
                    }
                }
                if (class61.field711 == 1 || !Statics.field2061 && class61.field711 == 4 || class61.field711 == 2) {
                    long var20 = (class61.field717 - field864) / 50L;
                    if (var20 > 4095L) {
                        var20 = 4095L;
                    }
                    field864 = class61.field717;
                    int var22 = class61.field716;
                    if (var22 < 0) {
                        var22 = 0;
                    } else if (var22 > Statics.field328) {
                        var22 = Statics.field328;
                    }
                    int var23 = class61.field715;
                    if (var23 < 0) {
                        var23 = 0;
                    } else if (var23 > Statics.field2039) {
                        var23 = Statics.field2039;
                    }
                    int var24 = (int) var20;
                    class185 var25 = class185.method2191(class182.field2374, field912.field1461);
                    var25.field2489.method3476((var24 << 1) + (class61.field711 == 2 ? 1 : 0));
                    var25.field2489.method3476(var23);
                    var25.field2489.method3476(var22);
                    field912.method1999(var25);
                }
                if (class52.field627 > 0) {
                    class185 var26 = class185.method2191(class182.field2448, field912.field1461);
                    var26.field2489.method3476(0);
                    int var27 = var26.field2489.field2562;
                    long var28 = class197.method4873();
                    for (int var30 = 0; var30 < class52.field627; var30++) {
                        long var31 = var28 - field1075;
                        if (var31 > 16777215L) {
                            var31 = 16777215L;
                        }
                        field1075 = var28;
                        var26.field2489.method3351((int) var31);
                        var26.field2489.method3334(class52.field626[var30]);
                    }
                    var26.field2489.method3304(var26.field2489.field2562 - var27);
                    field912.method1999(var26);
                }
                if (field917 > 0) {
                    field917--;
                }
                if (class52.field620[96] || class52.field620[97] || class52.field620[98] || class52.field620[99]) {
                    field937 = true;
                }
                if (field937 && field917 <= 0) {
                    field917 = 20;
                    field937 = false;
                    class185 var33 = class185.method2191(class182.field2410, field912.field1461);
                    var33.field2489.method3344(field922);
                    var33.field2489.method3343(field921);
                    field912.method1999(var33);
                }
                if (Statics.field644 && !field868) {
                    field868 = true;
                    class185 var34 = class185.method2191(class182.field2386, field912.field1461);
                    var34.field2489.method3363(1);
                    field912.method1999(var34);
                }
                if (!Statics.field644 && field868) {
                    field868 = false;
                    class185 var35 = class185.method2191(class182.field2386, field912.field1461);
                    var35.field2489.method3363(0);
                    field912.method1999(var35);
                }
                if (Statics.field2585 != null) {
                    Statics.field2585.method5669();
                }
                method689();
                method633();
                if (field1111 != 30) {
                    return;
                }
                method598();
                int var10002;
                for (int var36 = 0; var36 < field957; var36++) {
                    var10002 = field1092[var36]--;
                    if (field1092[var36] >= -10) {
                        class104 var38 = field858[var36];
                        if (var38 == null) {
                            class104 var10000 = (class104) null;
                            var38 = class104.method2094(Statics.field398, field1098[var36], 0);
                            if (var38 == null) {
                                continue;
                            }
                            field1092[var36] += var38.method2092();
                            field858[var36] = var38;
                        }
                        if (field1092[var36] < 0) {
                            int var45;
                            if (field1013[var36] == 0) {
                                var45 = field1087;
                            } else {
                                int var39 = (field1013[var36] & 0xFF) * 128;
                                int var40 = field1013[var36] >> 16 & 0xFF;
                                int var41 = var40 * 128 + 64 - Statics.field3435.field1154;
                                if (var41 < 0) {
                                    var41 = -var41;
                                }
                                int var42 = field1013[var36] >> 8 & 0xFF;
                                int var43 = var42 * 128 + 64 - Statics.field3435.field1148;
                                if (var43 < 0) {
                                    var43 = -var43;
                                }
                                int var44 = var41 + var43 - 128;
                                if (var44 > var39) {
                                    field1092[var36] = -100;
                                    continue;
                                }
                                if (var44 < 0) {
                                    var44 = 0;
                                }
                                var45 = field1019 * (var39 - var44) / var39;
                            }
                            if (var45 > 0) {
                                class106 var46 = var38.method2091().method2131(Statics.field321);
                                class116 var47 = class116.method2238(var46, 100, var45);
                                var47.method2241(field1091[var36] - 1);
                                Statics.field239.method2030(var47);
                            }
                            field1092[var36] = -100;
                        }
                    } else {
                        field957--;
                        for (int var37 = var36; var37 < field957; var37++) {
                            field1098[var37] = field1098[var37 + 1];
                            field858[var37] = field858[var37 + 1];
                            field1091[var37] = field1091[var37 + 1];
                            field1092[var37] = field1092[var37 + 1];
                            field1013[var37] = field1013[var37 + 1];
                        }
                        var36--;
                    }
                }
                if (field1086) {
                    boolean var48;
                    if (class230.field2695 == 0) {
                        var48 = Statics.field508.method3929();
                    } else {
                        var48 = true;
                    }
                    if (!var48) {
                        if (field1084 != 0 && field1085 != -1) {
                            class230.method3043(Statics.field235, field1085, 0, field1084, false);
                        }
                        field1086 = false;
                    }
                }
                field912.field1466++;
                if (field912.field1466 > 750) {
                    method225();
                    return;
                }
                method4812();
                Statics.method4261();
                int[] var49 = class94.field1406;
                for (int var50 = 0; var50 < class94.field1408; var50++) {
                    class73 var51 = field1004[var49[var50]];
                    if (var51 != null && var51.field1157 > 0) {
                        var51.field1157--;
                        if (var51.field1157 == 0) {
                            var51.field1195 = null;
                        }
                    }
                }
                for (int var52 = 0; var52 < field895; var52++) {
                    int var53 = field896[var52];
                    class85 var54 = field894[var53];
                    if (var54 != null && var54.field1157 > 0) {
                        var54.field1157--;
                        if (var54.field1157 == 0) {
                            var54.field1195 = null;
                        }
                    }
                }
                field914++;
                if (field956 != 0) {
                    field1081 += 20;
                    if (field1081 >= 400) {
                        field956 = 0;
                    }
                }
                if (Statics.field242 != null) {
                    field865++;
                    if (field865 >= 15) {
                        method89(Statics.field242);
                        Statics.field242 = null;
                    }
                }
                class243 var55 = Statics.field643;
                class243 var56 = Statics.field1951;
                Statics.field643 = null;
                Statics.field1951 = null;
                field891 = null;
                field1032 = false;
                field1029 = false;
                field1090 = 0;
                while (class52.method4967() && field1090 < 128) {
                    if (field997 >= 2 && class52.field620[82] && Statics.field3860 == 66) {
                        String var57 = class96.method151();
                        Statics.field3445.method810(var57);
                    } else if (field927 != 1 || Statics.field244 <= 0) {
                        field1040[field1090] = Statics.field3860;
                        field958[field1090] = Statics.field244;
                        field1090++;
                    }
                }
                if (method595() && class52.field620[82] && class52.field620[81] && field1049 != 0) {
                    int var58 = Statics.field3435.field832 - field1049;
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 3) {
                        var58 = 3;
                    }
                    if (Statics.field3435.field832 != var58) {
                        method541(Statics.field2465 + Statics.field3435.field1196[0], Statics.field594 + Statics.field3435.field1197[0], var58, false);
                    }
                    field1049 = 0;
                }
                if (field888 != -1) {
                    int var59 = field888;
                    int var60 = Statics.field2039;
                    int var61 = Statics.field328;
                    if (class243.method1826(var59)) {
                        method233(Statics.field2503[var59], -1, 0, 0, var60, var61, 0, 0);
                    }
                }
                field1036++;
                while (true) {
                    class69 var62;
                    class243 var63;
                    class243 var64;
                    do {
                        var62 = (class69) field977.method3807();
                        if (var62 == null) {
                            while (true) {
                                class69 var65;
                                class243 var66;
                                class243 var67;
                                do {
                                    var65 = (class69) field1052.method3807();
                                    if (var65 == null) {
                                        while (true) {
                                            class69 var68;
                                            class243 var69;
                                            class243 var70;
                                            do {
                                                var68 = (class69) field1050.method3807();
                                                if (var68 == null) {
                                                    this.method1559();
                                                    if (Statics.field2585 != null) {
                                                        Statics.field2585.method5622(Statics.field226, (Statics.field3435.field1154 >> 7) + Statics.field2465, (Statics.field3435.field1148 >> 7) + Statics.field594, false);
                                                        Statics.field2585.method5722();
                                                    }
                                                    if (field1024 != null) {
                                                        this.method1193();
                                                    }
                                                    if (Statics.field636 != null) {
                                                        method89(Statics.field636);
                                                        field990++;
                                                        if (class61.field718 == 0) {
                                                            if (field964) {
                                                                if (Statics.field636 == Statics.field1677 && field963 != field960) {
                                                                    class243 var71 = Statics.field636;
                                                                    byte var72 = 0;
                                                                    if (field971 == 1 && var71.field2856 == 206) {
                                                                        var72 = 1;
                                                                    }
                                                                    if (var71.field2940[field963] <= 0) {
                                                                        var72 = 0;
                                                                    }
                                                                    if (class244.method70(method1(var71))) {
                                                                        int var73 = field960;
                                                                        int var74 = field963;
                                                                        var71.field2940[var74] = var71.field2940[var73];
                                                                        var71.field2941[var74] = var71.field2941[var73];
                                                                        var71.field2940[var73] = -1;
                                                                        var71.field2941[var73] = 0;
                                                                    } else if (var72 == 1) {
                                                                        int var75 = field960;
                                                                        int var76 = field963;
                                                                        while (var75 != var76) {
                                                                            if (var75 > var76) {
                                                                                var71.method4198(var75 - 1, var75);
                                                                                var75--;
                                                                            } else if (var75 < var76) {
                                                                                var71.method4198(var75 + 1, var75);
                                                                                var75++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var71.method4198(field963, field960);
                                                                    }
                                                                    class185 var77 = class185.method2191(class182.field2405, field912.field1461);
                                                                    var77.field2489.method3363(var72);
                                                                    var77.field2489.method3446(Statics.field636.field2822);
                                                                    var77.field2489.method3343(field960);
                                                                    var77.field2489.method3344(field963);
                                                                    field912.method1999(var77);
                                                                }
                                                            } else if (this.method1189()) {
                                                                this.method1190(field961, field962);
                                                            } else if (field989 > 0) {
                                                                method1035(field961, field962);
                                                            }
                                                            field865 = 10;
                                                            class61.field711 = 0;
                                                            Statics.field636 = null;
                                                        } else if (field990 >= 5 && (class61.field708 > field961 + 5 || class61.field708 < field961 - 5 || class61.field709 > field962 + 5 || class61.field709 < field962 - 5)) {
                                                            field964 = true;
                                                        }
                                                    }
                                                    if (class138.method2755()) {
                                                        int var78 = class138.field1993;
                                                        int var79 = class138.field2006;
                                                        class185 var80 = class185.method2191(class182.field2390, field912.field1461);
                                                        var80.field2489.method3363(5);
                                                        var80.field2489.method3476(Statics.field594 + var79);
                                                        var80.field2489.method3344(Statics.field2465 + var78);
                                                        var80.field2489.method3334(class52.field620[82] ? (class52.field620[81] ? 2 : 1) : 0);
                                                        field912.method1999(var80);
                                                        class138.method2780();
                                                        field1038 = class61.field715;
                                                        field954 = class61.field716;
                                                        field956 = 1;
                                                        field1081 = 0;
                                                        field1023 = var78;
                                                        field1082 = var79;
                                                    }
                                                    if (Statics.field643 != var55) {
                                                        if (var55 != null) {
                                                            method89(var55);
                                                        }
                                                        if (Statics.field643 != null) {
                                                            method89(Statics.field643);
                                                        }
                                                    }
                                                    if (Statics.field1951 != var56 && field916 == field1073) {
                                                        if (var56 != null) {
                                                            method89(var56);
                                                        }
                                                        if (Statics.field1951 != null) {
                                                            method89(Statics.field1951);
                                                        }
                                                    }
                                                    if (Statics.field1951 == null) {
                                                        if (field916 > 0) {
                                                            field916--;
                                                        }
                                                    } else if (field916 < field1073) {
                                                        field916++;
                                                        if (field916 == field1073) {
                                                            method89(Statics.field1951);
                                                        }
                                                    }
                                                    method180();
                                                    if (field1095) {
                                                        int var81 = Statics.field591 * 128 + 64;
                                                        int var82 = Statics.field316 * 128 + 64;
                                                        int var83 = method79(var81, var82, Statics.field226) - Statics.field1225;
                                                        if (Statics.field2105 < var81) {
                                                            Statics.field2105 += Statics.field743 * (var81 - Statics.field2105) / 1000 + Statics.field3432;
                                                            if (Statics.field2105 > var81) {
                                                                Statics.field2105 = var81;
                                                            }
                                                        }
                                                        if (Statics.field2105 > var81) {
                                                            Statics.field2105 -= Statics.field743 * (Statics.field2105 - var81) / 1000 + Statics.field3432;
                                                            if (Statics.field2105 < var81) {
                                                                Statics.field2105 = var81;
                                                            }
                                                        }
                                                        if (Statics.field1318 < var83) {
                                                            Statics.field1318 += Statics.field743 * (var83 - Statics.field1318) / 1000 + Statics.field3432;
                                                            if (Statics.field1318 > var83) {
                                                                Statics.field1318 = var83;
                                                            }
                                                        }
                                                        if (Statics.field1318 > var83) {
                                                            Statics.field1318 -= Statics.field743 * (Statics.field1318 - var83) / 1000 + Statics.field3432;
                                                            if (Statics.field1318 < var83) {
                                                                Statics.field1318 = var83;
                                                            }
                                                        }
                                                        if (Statics.field2196 < var82) {
                                                            Statics.field2196 += Statics.field743 * (var82 - Statics.field2196) / 1000 + Statics.field3432;
                                                            if (Statics.field2196 > var82) {
                                                                Statics.field2196 = var82;
                                                            }
                                                        }
                                                        if (Statics.field2196 > var82) {
                                                            Statics.field2196 -= Statics.field743 * (Statics.field2196 - var82) / 1000 + Statics.field3432;
                                                            if (Statics.field2196 < var82) {
                                                                Statics.field2196 = var82;
                                                            }
                                                        }
                                                        int var84 = Statics.field326 * 128 + 64;
                                                        int var85 = Statics.field234 * 128 + 64;
                                                        int var86 = method79(var84, var85, Statics.field226) - Statics.field355;
                                                        int var87 = var84 - Statics.field2105;
                                                        int var88 = var86 - Statics.field1318;
                                                        int var89 = var85 - Statics.field2196;
                                                        int var90 = (int) Math.sqrt((double) (var87 * var87 + var89 * var89));
                                                        int var91 = (int) (Math.atan2((double) var88, (double) var90) * 325.949D) & 0x7FF;
                                                        int var92 = (int) (Math.atan2((double) var87, (double) var89) * -325.949D) & 0x7FF;
                                                        if (var91 < 128) {
                                                            var91 = 128;
                                                        }
                                                        if (var91 > 383) {
                                                            var91 = 383;
                                                        }
                                                        if (Statics.field322 < var91) {
                                                            Statics.field322 += Statics.field312 * (var91 - Statics.field322) / 1000 + Statics.field3433;
                                                            if (Statics.field322 > var91) {
                                                                Statics.field322 = var91;
                                                            }
                                                        }
                                                        if (Statics.field322 > var91) {
                                                            Statics.field322 -= Statics.field312 * (Statics.field322 - var91) / 1000 + Statics.field3433;
                                                            if (Statics.field322 < var91) {
                                                                Statics.field322 = var91;
                                                            }
                                                        }
                                                        int var93 = var92 - Statics.field457;
                                                        if (var93 > 1024) {
                                                            var93 -= 2048;
                                                        }
                                                        if (var93 < -1024) {
                                                            var93 += 2048;
                                                        }
                                                        if (var93 > 0) {
                                                            Statics.field457 += Statics.field312 * var93 / 1000 + Statics.field3433;
                                                            Statics.field457 &= 0x7FF;
                                                        }
                                                        if (var93 < 0) {
                                                            Statics.field457 -= Statics.field312 * -var93 / 1000 + Statics.field3433;
                                                            Statics.field457 &= 0x7FF;
                                                        }
                                                        int var94 = var92 - Statics.field457;
                                                        if (var94 > 1024) {
                                                            var94 -= 2048;
                                                        }
                                                        if (var94 < -1024) {
                                                            var94 += 2048;
                                                        }
                                                        if (var94 < 0 && var93 > 0 || var94 > 0 && var93 < 0) {
                                                            Statics.field457 = var92;
                                                        }
                                                    }
                                                    for (int var95 = 0; var95 < 5; var95++) {
                                                        var10002 = field1100[var95]++;
                                                    }
                                                    Statics.field2146.method1911();
                                                    int var96 = class61.method157();
                                                    int var97 = class52.method680();
                                                    if (var96 > 15000 && var97 > 15000) {
                                                        field900 = 250;
                                                        class61.field700 = 14500;
                                                        class185 var98 = class185.method2191(class182.field2452, field912.field1461);
                                                        field912.method1999(var98);
                                                    }
                                                    Statics.field1666.method1666();
                                                    field912.field1467++;
                                                    if (field912.field1467 > 50) {
                                                        class185 var99 = class185.method2191(class182.field2384, field912.field1461);
                                                        field912.method1999(var99);
                                                    }
                                                    try {
                                                        field912.method1998();
                                                    } catch (IOException var101) {
                                                        method225();
                                                    }
                                                    return;
                                                }
                                                var69 = var68.field778;
                                                if (var69.field2823 < 0) {
                                                    break;
                                                }
                                                var70 = class243.method123(var69.field2841);
                                            } while (var70 == null || var70.field2946 == null || var69.field2823 >= var70.field2946.length || var70.field2946[var69.field2823] != var69);
                                            class82.method1108(var68);
                                        }
                                    }
                                    var66 = var65.field778;
                                    if (var66.field2823 < 0) {
                                        break;
                                    }
                                    var67 = class243.method123(var66.field2841);
                                } while (var67 == null || var67.field2946 == null || var66.field2823 >= var67.field2946.length || var67.field2946[var66.field2823] != var66);
                                class82.method1108(var65);
                            }
                        }
                        var63 = var62.field778;
                        if (var63.field2823 < 0) {
                            break;
                        }
                        var64 = class243.method123(var63.field2841);
                    } while (var64 == null || var64.field2946 == null || var63.field2823 >= var64.field2946.length || var64.field2946[var63.field2823] != var63);
                    class82.method1108(var62);
                }
            }
            class185 var4 = class185.method2191(class182.field2419, field912.field1461);
            var4.field2489.method3363(0);
            int var5 = var4.field2489.field2562;
            class327.method737(var4.field2489);
            var4.field2489.method3459(var4.field2489.field2562 - var5);
            field912.method1999(var4);
        }
    }

    @ObfuscatedName("ad.fm(I)V")
    public static final void method510() {
        if (Statics.field593 != null) {
            Statics.field593.method2173();
        }
        if (Statics.field1590 != null) {
            Statics.field1590.method2173();
        }
    }

    @ObfuscatedName("bd.fr(Lkc;IIII)V")
    public static void method1128(class288 arg0, int arg1, int arg2, int arg3) {
        if (field957 >= 50 || field1019 == 0 || arg0.field3765 == null || arg1 >= arg0.field3765.length) {
            return;
        }
        int var4 = arg0.field3765[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1098[field957] = var5;
        field1091[field957] = var6;
        field1092[field957] = 0;
        field858[field957] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1013[field957] = (var8 << 16) + (var9 << 8) + var7;
        field957++;
    }

    @ObfuscatedName("ae.fa(IB)V")
    public static void method684(int arg0) {
        if (arg0 == -1 && !field1086) {
            class230.method609();
        } else if (arg0 != -1 && field1085 != arg0 && field1084 != 0 && !field1086) {
            class230.method3600(2, Statics.field235, arg0, 0, field1084, false);
        }
        field1085 = arg0;
    }

    @ObfuscatedName("aw.ff(I)V")
    public static final void method689() {
        if (!Statics.field362) {
            return;
        }
        if (Statics.field2474 != null) {
            Statics.field2474.method4968();
        }
        method152();
        Statics.field362 = false;
    }

    @ObfuscatedName("am.ft(I)V")
    public static final void method633() {
        if (Statics.field226 != field1076) {
            field1076 = Statics.field226;
            method4167(Statics.field226);
        }
    }

    @ObfuscatedName("bq.fw(Liz;III)V")
    public static final void method733(class243 arg0, int arg1, int arg2) {
        if (field1083 != 0 && field1083 != 3 || class61.field711 != 1 && Statics.field2061 || class61.field711 != 4) {
            return;
        }
        class237 var3 = arg0.method4186(true);
        if (var3 == null) {
            return;
        }
        int var4 = class61.field715 - arg1;
        int var5 = class61.field716 - arg2;
        if (!var3.method4108(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2781 / 2;
        int var7 = var5 - var3.field2783 / 2;
        int var8 = field922 & 0x7FF;
        int var9 = class135.field1939[var8];
        int var10 = class135.field1921[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field3435.field1154 + var11 >> 7;
        int var14 = Statics.field3435.field1148 - var12 >> 7;
        class185 var15 = class185.method2191(class182.field2454, field912.field1461);
        var15.field2489.method3363(18);
        var15.field2489.method3476(Statics.field594 + var14);
        var15.field2489.method3344(Statics.field2465 + var13);
        var15.field2489.method3334(class52.field620[82] ? (class52.field620[81] ? 2 : 1) : 0);
        var15.field2489.method3363(var6);
        var15.field2489.method3363(var7);
        var15.field2489.method3476(field922);
        var15.field2489.method3363(57);
        var15.field2489.method3363(0);
        var15.field2489.method3363(0);
        var15.field2489.method3363(89);
        var15.field2489.method3476(Statics.field3435.field1154);
        var15.field2489.method3476(Statics.field3435.field1148);
        var15.field2489.method3363(63);
        field912.method1999(var15);
        field1023 = var13;
        field1082 = var14;
    }

    @ObfuscatedName("t.fn(B)V")
    public static final void method180() {
        if (field927 == 0) {
            int var0 = Statics.field3435.field1154;
            int var1 = Statics.field3435.field1148;
            if (Statics.field368 - var0 < -500 || Statics.field368 - var0 > 500 || Statics.field2784 - var1 < -500 || Statics.field2784 - var1 > 500) {
                Statics.field368 = var0;
                Statics.field2784 = var1;
            }
            if (Statics.field368 != var0) {
                Statics.field368 += (var0 - Statics.field368) / 16;
            }
            if (Statics.field2784 != var1) {
                Statics.field2784 += (var1 - Statics.field2784) / 16;
            }
            int var2 = Statics.field368 >> 7;
            int var3 = Statics.field2784 >> 7;
            int var4 = method79(Statics.field368, Statics.field2784, Statics.field226);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field226;
                        if (var8 < 3 && (class63.field721[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class63.field731[var8][var6][var7];
                        if (var9 > var5) {
                            var5 = var9;
                        }
                    }
                }
            }
            int var10 = var5 * 192;
            if (var10 > 98048) {
                var10 = 98048;
            }
            if (var10 < 32768) {
                var10 = 32768;
            }
            if (var10 > field938) {
                field938 += (var10 - field938) / 24;
            } else if (var10 < field938) {
                field938 += (var10 - field938) / 80;
            }
            Statics.field1334 = method79(Statics.field3435.field1154, Statics.field3435.field1148, Statics.field226) - field928;
        } else if (field927 == 1) {
            if (field935 && Statics.field3435 != null) {
                int var11 = Statics.field3435.field1196[0];
                int var12 = Statics.field3435.field1197[0];
                if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                    Statics.field368 = Statics.field3435.field1154;
                    int var13 = method79(Statics.field3435.field1154, Statics.field3435.field1148, Statics.field226) - field928;
                    if (var13 < Statics.field1334) {
                        Statics.field1334 = var13;
                    }
                    Statics.field2784 = Statics.field3435.field1148;
                    field935 = false;
                }
            }
            short var14 = -1;
            if (class52.field620[33]) {
                var14 = 0;
            } else if (class52.field620[49]) {
                var14 = 1024;
            }
            if (class52.field620[48]) {
                if (var14 == 0) {
                    var14 = 1792;
                } else if (var14 == 1024) {
                    var14 = 1280;
                } else {
                    var14 = 1536;
                }
            } else if (class52.field620[50]) {
                if (var14 == 0) {
                    var14 = 256;
                } else if (var14 == 1024) {
                    var14 = 768;
                } else {
                    var14 = 512;
                }
            }
            byte var15 = 0;
            if (class52.field620[35]) {
                var15 = -1;
            } else if (class52.field620[51]) {
                var15 = 1;
            }
            int var16 = 0;
            if (var14 >= 0 || var15 != 0) {
                int var17 = class52.field620[81] ? field859 : field932;
                var16 = var17 * 16;
                field930 = var14;
                field931 = var15;
            }
            if (field966 < var16) {
                field966 += var16 / 8;
                if (field966 > var16) {
                    field966 = var16;
                }
            } else if (field966 > var16) {
                field966 = field966 * 9 / 10;
            }
            if (field966 > 0) {
                int var18 = field966 / 16;
                if (field930 >= 0) {
                    int var19 = field930 - Statics.field457 & 0x7FF;
                    int var20 = class135.field1939[var19];
                    int var21 = class135.field1921[var19];
                    Statics.field368 += var18 * var20 / 65536;
                    Statics.field2784 += var18 * var21 / 65536;
                }
                if (field931 != 0) {
                    Statics.field1334 += field931 * var18;
                    if (Statics.field1334 > 0) {
                        Statics.field1334 = 0;
                    }
                }
            } else {
                field930 = -1;
                field931 = -1;
            }
            if (class52.field620[13]) {
                method61();
            }
        }
        if (class61.field718 == 4 && Statics.field2061) {
            int var22 = class61.field709 - field926;
            field924 = var22 * 2;
            field926 = var22 == -1 || var22 == 1 ? class61.field709 : (field926 + class61.field709) / 2;
            int var23 = field925 - class61.field708;
            field923 = var23 * 2;
            field925 = var23 == -1 || var23 == 1 ? class61.field708 : (field925 + class61.field708) / 2;
        } else {
            if (class52.field620[96]) {
                field923 += (-24 - field923) / 2;
            } else if (class52.field620[97]) {
                field923 += (24 - field923) / 2;
            } else {
                field923 /= 2;
            }
            if (class52.field620[98]) {
                field924 += (12 - field924) / 2;
            } else if (class52.field620[99]) {
                field924 += (-12 - field924) / 2;
            } else {
                field924 /= 2;
            }
            field926 = class61.field709;
            field925 = class61.field708;
        }
        field922 = field923 / 2 + field922 & 0x7FF;
        field921 += field924 / 2;
        if (field921 < 128) {
            field921 = 128;
        }
        if (field921 > 383) {
            field921 = 383;
        }
    }

    @ObfuscatedName("je.fj(I)V")
    public static final void method4812() {
        int var0 = class94.field1408;
        int[] var1 = class94.field1406;
        for (int var2 = 0; var2 < var0; var2++) {
            class73 var3 = field1004[var1[var2]];
            if (var3 != null) {
                method45(var3, 1);
            }
        }
    }

    @ObfuscatedName("i.gk(Lbm;IB)V")
    public static final void method45(class76 arg0, int arg1) {
        if (arg0.field1187 > field913) {
            int var2 = arg0.field1187 - field913;
            int var3 = arg0.field1183 * 128 + arg0.field1144 * 64;
            int var4 = arg0.field1185 * 128 + arg0.field1144 * 64;
            arg0.field1154 += (var3 - arg0.field1154) / var2;
            arg0.field1148 += (var4 - arg0.field1148) / var2;
            arg0.field1193 = 0;
            arg0.field1152 = arg0.field1189;
        } else if (arg0.field1140 >= field913) {
            method4227(arg0);
        } else {
            method3004(arg0);
        }
        if (arg0.field1154 < 128 || arg0.field1148 < 128 || arg0.field1154 >= 13184 || arg0.field1148 >= 13184) {
            arg0.field1173 = -1;
            arg0.field1142 = -1;
            arg0.field1187 = 0;
            arg0.field1140 = 0;
            arg0.field1154 = arg0.field1196[0] * 128 + arg0.field1144 * 64;
            arg0.field1148 = arg0.field1197[0] * 128 + arg0.field1144 * 64;
            arg0.method1591();
        }
        if (Statics.field3435 == arg0 && (arg0.field1154 < 1536 || arg0.field1148 < 1536 || arg0.field1154 >= 11776 || arg0.field1148 >= 11776)) {
            arg0.field1173 = -1;
            arg0.field1142 = -1;
            arg0.field1187 = 0;
            arg0.field1140 = 0;
            arg0.field1154 = arg0.field1196[0] * 128 + arg0.field1144 * 64;
            arg0.field1148 = arg0.field1197[0] * 128 + arg0.field1144 * 64;
            arg0.method1591();
        }
        method1941(arg0);
        arg0.field1143 = false;
        if (arg0.field1170 != -1) {
            class288 var5 = class288.method1825(arg0.field1170);
            if (var5 == null || var5.field3762 == null) {
                arg0.field1170 = -1;
            } else {
                arg0.field1172++;
                if (arg0.field1200 < var5.field3762.length && arg0.field1172 > var5.field3757[arg0.field1200]) {
                    arg0.field1172 = 1;
                    arg0.field1200++;
                    method1128(var5, arg0.field1200, arg0.field1154, arg0.field1148);
                }
                if (arg0.field1200 >= var5.field3762.length) {
                    arg0.field1172 = 0;
                    arg0.field1200 = 0;
                    method1128(var5, arg0.field1200, arg0.field1154, arg0.field1148);
                }
            }
        }
        if (arg0.field1142 != -1 && field913 >= arg0.field1162) {
            if (arg0.field1163 < 0) {
                arg0.field1163 = 0;
            }
            int var6 = class273.method1058(arg0.field1142).field3496;
            if (var6 == -1) {
                arg0.field1142 = -1;
            } else {
                class288 var7 = class288.method1825(var6);
                if (var7 == null || var7.field3762 == null) {
                    arg0.field1142 = -1;
                } else {
                    arg0.field1180++;
                    if (arg0.field1163 < var7.field3762.length && arg0.field1180 > var7.field3757[arg0.field1163]) {
                        arg0.field1180 = 1;
                        arg0.field1163++;
                        method1128(var7, arg0.field1163, arg0.field1154, arg0.field1148);
                    }
                    if (arg0.field1163 >= var7.field3762.length && (arg0.field1163 < 0 || arg0.field1163 >= var7.field3762.length)) {
                        arg0.field1142 = -1;
                    }
                }
            }
        }
        if (arg0.field1173 != -1 && arg0.field1176 <= 1) {
            class288 var8 = class288.method1825(arg0.field1173);
            if (var8.field3773 == 1 && arg0.field1179 > 0 && arg0.field1187 <= field913 && arg0.field1140 < field913) {
                arg0.field1176 = 1;
                return;
            }
        }
        if (arg0.field1173 != -1 && arg0.field1176 == 0) {
            class288 var9 = class288.method1825(arg0.field1173);
            if (var9 == null || var9.field3762 == null) {
                arg0.field1173 = -1;
            } else {
                arg0.field1141++;
                if (arg0.field1174 < var9.field3762.length && arg0.field1141 > var9.field3757[arg0.field1174]) {
                    arg0.field1141 = 1;
                    arg0.field1174++;
                    method1128(var9, arg0.field1174, arg0.field1154, arg0.field1148);
                }
                if (arg0.field1174 >= var9.field3762.length) {
                    arg0.field1174 -= var9.field3766;
                    arg0.field1177++;
                    if (arg0.field1177 >= var9.field3770) {
                        arg0.field1173 = -1;
                    } else if (arg0.field1174 >= 0 && arg0.field1174 < var9.field3762.length) {
                        method1128(var9, arg0.field1174, arg0.field1154, arg0.field1148);
                    } else {
                        arg0.field1173 = -1;
                    }
                }
                arg0.field1143 = var9.field3768;
            }
        }
        if (arg0.field1176 > 0) {
            arg0.field1176--;
        }
    }

    @ObfuscatedName("iz.gd(Lbm;B)V")
    public static final void method4227(class76 arg0) {
        if (field913 == arg0.field1140 || arg0.field1173 == -1 || arg0.field1176 != 0 || arg0.field1141 + 1 > class288.method1825(arg0.field1173).field3757[arg0.field1174]) {
            int var1 = arg0.field1140 - arg0.field1187;
            int var2 = field913 - arg0.field1187;
            int var3 = arg0.field1183 * 128 + arg0.field1144 * 64;
            int var4 = arg0.field1185 * 128 + arg0.field1144 * 64;
            int var5 = arg0.field1175 * 128 + arg0.field1144 * 64;
            int var6 = arg0.field1186 * 128 + arg0.field1144 * 64;
            arg0.field1154 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1148 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1193 = 0;
        arg0.field1152 = arg0.field1189;
        arg0.field1182 = arg0.field1152;
    }

    @ObfuscatedName("ew.gj(Lbm;B)V")
    public static final void method3004(class76 arg0) {
        arg0.field1170 = arg0.field1146;
        if (arg0.field1199 == 0) {
            arg0.field1193 = 0;
            return;
        }
        if (arg0.field1173 != -1 && arg0.field1176 == 0) {
            class288 var1 = class288.method1825(arg0.field1173);
            if (arg0.field1179 > 0 && var1.field3773 == 0) {
                arg0.field1193++;
                return;
            }
            if (arg0.field1179 <= 0 && var1.field3774 == 0) {
                arg0.field1193++;
                return;
            }
        }
        int var2 = arg0.field1154;
        int var3 = arg0.field1148;
        int var4 = arg0.field1196[arg0.field1199 - 1] * 128 + arg0.field1144 * 64;
        int var5 = arg0.field1197[arg0.field1199 - 1] * 128 + arg0.field1144 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1152 = 1280;
            } else if (var3 > var5) {
                arg0.field1152 = 1792;
            } else {
                arg0.field1152 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1152 = 768;
            } else if (var3 > var5) {
                arg0.field1152 = 256;
            } else {
                arg0.field1152 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1152 = 1024;
        } else if (var3 > var5) {
            arg0.field1152 = 0;
        }
        byte var6 = arg0.field1198[arg0.field1199 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1154 = var4;
            arg0.field1148 = var5;
            arg0.field1199--;
            if (arg0.field1179 > 0) {
                arg0.field1179--;
            }
            return;
        }
        int var7 = arg0.field1152 - arg0.field1182 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1150;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1149;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1181;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1151;
        }
        if (var8 == -1) {
            var8 = arg0.field1149;
        }
        arg0.field1170 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class85) {
            var10 = ((class85) arg0).field1297.field3741;
        }
        if (var10) {
            if (arg0.field1182 != arg0.field1152 && arg0.field1167 == -1 && arg0.field1194 != 0) {
                var9 = 2;
            }
            if (arg0.field1199 > 2) {
                var9 = 6;
            }
            if (arg0.field1199 > 3) {
                var9 = 8;
            }
            if (arg0.field1193 > 0 && arg0.field1199 > 1) {
                var9 = 8;
                arg0.field1193--;
            }
        } else {
            if (arg0.field1199 > 1) {
                var9 = 6;
            }
            if (arg0.field1199 > 2) {
                var9 = 8;
            }
            if (arg0.field1193 > 0 && arg0.field1199 > 1) {
                var9 = 8;
                arg0.field1193--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field1170 == arg0.field1149 && arg0.field1153 != -1) {
            arg0.field1170 = arg0.field1153;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1154 += var9;
                if (arg0.field1154 > var4) {
                    arg0.field1154 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1154 -= var9;
                if (arg0.field1154 < var4) {
                    arg0.field1154 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1148 += var9;
                if (arg0.field1148 > var5) {
                    arg0.field1148 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1148 -= var9;
                if (arg0.field1148 < var5) {
                    arg0.field1148 = var5;
                }
            }
        }
        if (arg0.field1154 == var4 && arg0.field1148 == var5) {
            arg0.field1199--;
            if (arg0.field1179 > 0) {
                arg0.field1179--;
            }
        }
    }

    @ObfuscatedName("cb.ge(Lbm;B)V")
    public static final void method1941(class76 arg0) {
        if (arg0.field1194 == 0) {
            return;
        }
        if (arg0.field1167 != -1) {
            class76 var1 = null;
            if (arg0.field1167 < 32768) {
                var1 = field894[arg0.field1167];
            } else if (arg0.field1167 >= 32768) {
                var1 = field1004[arg0.field1167 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1154 - var1.field1154;
                int var3 = arg0.field1148 - var1.field1148;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1152 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1168) {
                arg0.field1167 = -1;
                arg0.field1168 = false;
            }
        }
        if (arg0.field1169 != -1 && (arg0.field1199 == 0 || arg0.field1193 > 0)) {
            arg0.field1152 = arg0.field1169;
            arg0.field1169 = -1;
        }
        int var4 = arg0.field1152 - arg0.field1182 & 0x7FF;
        if (var4 == 0 && arg0.field1168) {
            arg0.field1167 = -1;
            arg0.field1168 = false;
        }
        if (var4 == 0) {
            arg0.field1178 = 0;
            return;
        }
        arg0.field1178++;
        if (var4 > 1024) {
            arg0.field1182 -= arg0.field1194;
            boolean var5 = true;
            if (var4 < arg0.field1194 || var4 > 2048 - arg0.field1194) {
                arg0.field1182 = arg0.field1152;
                var5 = false;
            }
            if (arg0.field1170 == arg0.field1146 && (arg0.field1178 > 25 || var5)) {
                if (arg0.field1190 == -1) {
                    arg0.field1170 = arg0.field1149;
                } else {
                    arg0.field1170 = arg0.field1190;
                }
            }
        } else {
            arg0.field1182 += arg0.field1194;
            boolean var6 = true;
            if (var4 < arg0.field1194 || var4 > 2048 - arg0.field1194) {
                arg0.field1182 = arg0.field1152;
                var6 = false;
            }
            if (arg0.field1170 == arg0.field1146 && (arg0.field1178 > 25 || var6)) {
                if (arg0.field1158 == -1) {
                    arg0.field1170 = arg0.field1149;
                } else {
                    arg0.field1170 = arg0.field1158;
                }
            }
        }
        arg0.field1182 &= 0x7FF;
    }

    @ObfuscatedName("fz.gm(Lbd;IIS)V")
    public static void method3054(class73 arg0, int arg1, int arg2) {
        if (arg0.field1173 == arg1 && arg1 != -1) {
            int var3 = class288.method1825(arg1).field3764;
            if (var3 == 1) {
                arg0.field1174 = 0;
                arg0.field1141 = 0;
                arg0.field1176 = arg2;
                arg0.field1177 = 0;
            }
            if (var3 == 2) {
                arg0.field1177 = 0;
            }
        } else if (arg1 == -1 || arg0.field1173 == -1 || class288.method1825(arg1).field3761 >= class288.method1825(arg0.field1173).field3761) {
            arg0.field1173 = arg1;
            arg0.field1174 = 0;
            arg0.field1141 = 0;
            arg0.field1176 = arg2;
            arg0.field1177 = 0;
            arg0.field1179 = arg0.field1199;
        }
    }

    @ObfuscatedName("gw.gq(S)V")
    public static void method3290() {
        class185 var0 = class185.method2191(class182.field2423, field912.field1461);
        class202 var1 = var0.field2489;
        int var2 = field1065 ? 2 : 1;
        var1.method3363(var2);
        var0.field2489.method3476(Statics.field2039);
        var0.field2489.method3476(Statics.field328);
        field912.method1999(var0);
    }

    @ObfuscatedName("client.q(I)V")
    public final void method844() {
        field1093 = class197.method4873() + 500L;
        this.method1185();
        if (field888 != -1) {
            this.method1371(true);
        }
    }

    @ObfuscatedName("client.gp(I)V")
    public void method1185() {
        int var1 = Statics.field2039;
        int var2 = Statics.field328;
        if (this.field682 < var1) {
            int var3 = this.field682;
        }
        if (this.field685 < var2) {
            int var4 = this.field685;
        }
        if (Statics.field1117 == null) {
            return;
        }
        try {
            client var5 = Statics.field3445;
            int var6 = field1065 ? 2 : 1;
            Object[] var7 = new Object[] { var6 };
            JSObject.getWindow(var5).call("resize", var7);
        } catch (Throwable var9) {
        }
    }

    @ObfuscatedName("client.gc(I)V")
    public final void method1553() {
        if (field888 != -1) {
            method131(field888);
        }
        for (int var1 = 0; var1 < field857; var1++) {
            if (field1056[var1]) {
                field1057[var1] = true;
            }
            field1102[var1] = field1056[var1];
            field1056[var1] = false;
        }
        field1055 = field913;
        field1001 = -1;
        field1002 = -1;
        Statics.field1677 = null;
        if (field888 != -1) {
            field857 = 0;
            method4590(field888, 0, 0, Statics.field2039, Statics.field328, 0, 0, -1);
        }
        class328.method5353();
        if (field1000) {
            method693();
        } else if (field1001 != -1) {
            int var2 = field1001;
            int var3 = field1002;
            if ((field989 >= 2 || field1005 != 0 || field1008) && field1113) {
                int var4 = method783();
                String var5;
                if (field1005 == 1 && field989 < 2) {
                    var5 = class252.field3171 + class252.field3266 + field1012 + " " + class87.field1310;
                } else if (field1008 && field989 < 2) {
                    var5 = field1011 + class252.field3266 + field1064 + " " + class87.field1310;
                } else {
                    var5 = method3234(var4);
                }
                if (field989 > 2) {
                    var5 = var5 + class87.method1978(16777215) + " " + '/' + " " + (field989 - 2) + class252.field3127;
                }
                Statics.field342.method5142(var5, var2 + 4, var3 + 15, 16777215, 0, field913 / 1000);
            }
        }
        if (field1063 == 3) {
            for (int var6 = 0; var6 < field857; var6++) {
                if (field1102[var6]) {
                    class328.method5361(field1059[var6], field1060[var6], field874[var6], field1062[var6], 16711935, 128);
                } else if (field1057[var6]) {
                    class328.method5361(field1059[var6], field1060[var6], field874[var6], field1062[var6], 16711680, 128);
                }
            }
        }
        int var7 = Statics.field226;
        int var8 = Statics.field3435.field1154;
        int var9 = Statics.field3435.field1148;
        int var10 = field914;
        for (class81 var11 = (class81) class81.field1248.method3809(); var11 != null; var11 = (class81) class81.field1248.method3832()) {
            if (var11.field1249 != -1 || var11.field1255 != null) {
                int var12 = 0;
                if (var8 > var11.field1254) {
                    var12 += var8 - var11.field1254;
                } else if (var8 < var11.field1246) {
                    var12 += var11.field1246 - var8;
                }
                if (var9 > var11.field1251) {
                    var12 += var9 - var11.field1251;
                } else if (var9 < var11.field1247) {
                    var12 += var11.field1247 - var9;
                }
                if (var12 - 64 > var11.field1250 || field1019 == 0 || var11.field1244 != var7) {
                    if (var11.field1252 != null) {
                        Statics.field239.method2031(var11.field1252);
                        var11.field1252 = null;
                    }
                    if (var11.field1245 != null) {
                        Statics.field239.method2031(var11.field1245);
                        var11.field1245 = null;
                    }
                } else {
                    var12 -= 64;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = field1019 * (var11.field1250 - var12) / var11.field1250;
                    class104 var10000;
                    if (var11.field1252 != null) {
                        var11.field1252.method2351(var13);
                    } else if (var11.field1249 >= 0) {
                        var10000 = (class104) null;
                        class104 var14 = class104.method2094(Statics.field398, var11.field1249, 0);
                        if (var14 != null) {
                            class106 var15 = var14.method2091().method2131(Statics.field321);
                            class116 var16 = class116.method2238(var15, 100, var13);
                            var16.method2241(-1);
                            Statics.field239.method2030(var16);
                            var11.field1252 = var16;
                        }
                    }
                    if (var11.field1245 != null) {
                        var11.field1245.method2351(var13);
                        if (!var11.field1245.method3801()) {
                            var11.field1245 = null;
                        }
                    } else if (var11.field1255 != null && (var11.field1256 -= var10) <= 0) {
                        int var17 = (int) (Math.random() * (double) var11.field1255.length);
                        var10000 = (class104) null;
                        class104 var18 = class104.method2094(Statics.field398, var11.field1255[var17], 0);
                        if (var18 != null) {
                            class106 var19 = var18.method2091().method2131(Statics.field321);
                            class116 var20 = class116.method2238(var19, 100, var13);
                            var20.method2241(0);
                            Statics.field239.method2030(var20);
                            var11.field1245 = var20;
                            var11.field1256 = var11.field1253 + (int) (Math.random() * (double) (var11.field1257 - var11.field1253));
                        }
                    }
                }
            }
        }
        field914 = 0;
    }

    @ObfuscatedName("l.gs(Ljava/lang/String;ZB)V")
    public static final void method17(String arg0, boolean arg1) {
        if (!field965) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field3013.method5131(arg0, 250);
        int var6 = Statics.field3013.method5128(arg0, 250) * 13;
        class328.method5362(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class328.method5368(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field3013.method5138(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method166(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field309.method791(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field857; var11++) {
            if (field874[var11] + field1059[var11] > var7 && field1059[var11] < var7 + var9 && field1062[var11] + field1060[var11] > var8 && field1060[var11] < var8 + var10) {
                field1057[var11] = true;
            }
        }
    }

    @ObfuscatedName("e.gv(IIIIZI)V")
    public static final void method3(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1126 - field1101) * var5 / 100 + field1101;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1107) {
            short var8 = field1107;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1027) {
                var6 = field1027;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class328.method5353();
                    class328.method5362(arg0, arg1, var10, arg3, -16777216);
                    class328.method5362(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field941) {
            short var11 = field941;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field884) {
                var6 = field884;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class328.method5353();
                    class328.method5362(arg0, arg1, arg2, var13, -16777216);
                    class328.method5362(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1104 - field1103) * var5 / 100 + field1103;
        field1053 = arg3 * var6 * var14 / 85504 << 1;
        if (field918 != arg2 || field899 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class135.field1939[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class138.method2775(var15, 500, 800, arg2, arg3);
        }
        field1109 = arg0;
        field1074 = arg1;
        field918 = arg2;
        field899 = arg3;
    }

    @ObfuscatedName("cs.gr(I)V")
    public static void method1961() {
        if (Statics.field3435.field1154 >> 7 == field1023 && Statics.field3435.field1148 >> 7 == field1082) {
            field1023 = 0;
        }
    }

    @ObfuscatedName("ay.gw(I)V")
    public static void method243() {
        if (field979 >= 0 && field1004[field979] != null) {
            method506(field1004[field979], false);
        }
    }

    @ObfuscatedName("ad.gg(Lbd;ZI)V")
    public static void method506(class73 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1123() || arg0.field836) {
            return;
        }
        int var2 = arg0.field818 << 14;
        arg0.field834 = false;
        if ((field853 && class94.field1408 > 50 || class94.field1408 > 200) && arg1 && arg0.field1170 == arg0.field1146) {
            arg0.field834 = true;
        }
        int var3 = arg0.field1154 >> 7;
        int var4 = arg0.field1148 >> 7;
        if (var3 < 0 || var3 >= 104 || var4 < 0 || var4 >= 104) {
            return;
        }
        if (arg0.field825 != null && field913 >= arg0.field824 && field913 < arg0.field842) {
            arg0.field834 = false;
            arg0.field823 = method79(arg0.field1154, arg0.field1148, Statics.field226);
            arg0.field1145 = field913;
            Statics.field2246.method2753(Statics.field226, arg0.field1154, arg0.field1148, arg0.field823, 60, arg0, arg0.field1182, var2, arg0.field830, arg0.field831, arg0.field819, arg0.field837);
            return;
        }
        if ((arg0.field1154 & 0x7F) == 64 && (arg0.field1148 & 0x7F) == 64) {
            if (field1094 == field949[var3][var4]) {
                return;
            }
            field949[var3][var4] = field1094;
        }
        arg0.field823 = method79(arg0.field1154, arg0.field1148, Statics.field226);
        arg0.field1145 = field913;
        Statics.field2246.method2752(Statics.field226, arg0.field1154, arg0.field1148, arg0.field823, 60, arg0, arg0.field1182, var2, arg0.field1143);
    }

    @ObfuscatedName("q.gn(ZI)V")
    public static final void method96(boolean arg0) {
        for (int var1 = 0; var1 < field895; var1++) {
            class85 var2 = field894[field896[var1]];
            int var3 = (field896[var1] << 14) + 536870912;
            if (var2 != null && var2.method1123() && var2.field1297.field3732 == arg0 && var2.field1297.method4800()) {
                int var4 = var2.field1154 >> 7;
                int var5 = var2.field1148 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1144 == 1 && (var2.field1154 & 0x7F) == 64 && (var2.field1148 & 0x7F) == 64) {
                        if (field1094 == field949[var4][var5]) {
                            continue;
                        }
                        field949[var4][var5] = field1094;
                    }
                    if (!var2.field1297.field3740) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    var2.field1145 = field913;
                    Statics.field2246.method2752(Statics.field226, var2.field1154, var2.field1148, method79(var2.field1154 + (var2.field1144 * 64 - 64), var2.field1148 + (var2.field1144 * 64 - 64), Statics.field226), var2.field1144 * 64 - 64 + 60, var2, var2.field1182, var3, var2.field1143);
                }
            }
        }
    }

    @ObfuscatedName("t.gy(I)V")
    public static final void method178() {
        for (class92 var0 = (class92) field982.method3809(); var0 != null; var0 = (class92) field982.method3832()) {
            if (Statics.field226 != var0.field1376 || field913 > var0.field1382) {
                var0.method3796();
            } else if (field913 >= var0.field1381) {
                if (var0.field1386 > 0) {
                    class85 var1 = field894[var0.field1386 - 1];
                    if (var1 != null && var1.field1154 >= 0 && var1.field1154 < 13312 && var1.field1148 >= 0 && var1.field1148 < 13312) {
                        var0.method1879(var1.field1154, var1.field1148, method79(var1.field1154, var1.field1148, var0.field1376) - var0.field1390, field913);
                    }
                }
                if (var0.field1386 < 0) {
                    int var2 = -var0.field1386 - 1;
                    class73 var3;
                    if (field969 == var2) {
                        var3 = Statics.field3435;
                    } else {
                        var3 = field1004[var2];
                    }
                    if (var3 != null && var3.field1154 >= 0 && var3.field1154 < 13312 && var3.field1148 >= 0 && var3.field1148 < 13312) {
                        var0.method1879(var3.field1154, var3.field1148, method79(var3.field1154, var3.field1148, var0.field1376) - var0.field1390, field913);
                    }
                }
                var0.method1880(field914);
                Statics.field2246.method2752(Statics.field226, (int) var0.field1387, (int) var0.field1388, (int) var0.field1389, 60, var0, var0.field1395, -1, false);
            }
        }
    }

    @ObfuscatedName("bj.gf(I)V")
    public static final void method752() {
        for (class83 var0 = (class83) field983.method3809(); var0 != null; var0 = (class83) field983.method3832()) {
            if (Statics.field226 != var0.field1282 || var0.field1289) {
                var0.method3796();
            } else if (field913 >= var0.field1281) {
                var0.method1795(field914);
                if (var0.field1289) {
                    var0.method3796();
                } else {
                    Statics.field2246.method2752(var0.field1282, var0.field1286, var0.field1284, var0.field1280, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("ir.gx(S)I")
    public static final int method4258() {
        if (Statics.field1117.field1228) {
            return Statics.field226;
        }
        int var0 = 3;
        if (Statics.field322 < 310) {
            int var1;
            int var2;
            if (field927 == 1) {
                var1 = Statics.field368 >> 7;
                var2 = Statics.field2784 >> 7;
            } else {
                var1 = Statics.field3435.field1154 >> 7;
                var2 = Statics.field3435.field1148 >> 7;
            }
            int var3 = Statics.field2105 >> 7;
            int var4 = Statics.field2196 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field226;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field226;
            }
            if ((class63.field721[Statics.field226][var3][var4] & 0x4) != 0) {
                var0 = Statics.field226;
            }
            int var5;
            if (var1 > var3) {
                var5 = var1 - var3;
            } else {
                var5 = var3 - var1;
            }
            int var6;
            if (var2 > var4) {
                var6 = var2 - var4;
            } else {
                var6 = var4 - var2;
            }
            if (var5 > var6) {
                int var7 = var6 * 65536 / var5;
                int var8 = 32768;
                while (var1 != var3) {
                    if (var3 < var1) {
                        var3++;
                    } else if (var3 > var1) {
                        var3--;
                    }
                    if ((class63.field721[Statics.field226][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field226;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class63.field721[Statics.field226][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field226;
                        }
                    }
                }
            } else if (var6 > 0) {
                int var9 = var5 * 65536 / var6;
                int var10 = 32768;
                while (var2 != var4) {
                    if (var4 < var2) {
                        var4++;
                    } else if (var4 > var2) {
                        var4--;
                    }
                    if ((class63.field721[Statics.field226][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field226;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class63.field721[Statics.field226][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field226;
                        }
                    }
                }
            }
        }
        if (Statics.field3435.field1154 >= 0 && Statics.field3435.field1148 >= 0 && Statics.field3435.field1154 < 13312 && Statics.field3435.field1148 < 13312) {
            if ((class63.field721[Statics.field226][Statics.field3435.field1154 >> 7][Statics.field3435.field1148 >> 7] & 0x4) != 0) {
                var0 = Statics.field226;
            }
            return var0;
        } else {
            return Statics.field226;
        }
    }

    @ObfuscatedName("z.gb(III)V")
    public static final void method8(int arg0, int arg1) {
        if (field871 == 2) {
            method4179((field1118 - Statics.field2465 << 7) + field877, (field875 - Statics.field594 << 7) + field878, field1120 * 2);
            if (field951 > -1 && field913 % 20 < 10) {
                Statics.field2071[0].method5524(field951 + arg0 - 12, field952 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("bv.gh(B)Z")
    public static boolean method1606() {
        return (field972 & 0x1) != 0;
    }

    @ObfuscatedName("ac.gl(I)Z")
    public static boolean method232() {
        return (field972 & 0x8) != 0;
    }

    @ObfuscatedName("af.go(Lbd;I)Z")
    public static boolean method545(class73 arg0) {
        if (field972 == 0) {
            return false;
        } else if (Statics.field3435 == arg0) {
            return method232();
        } else {
            boolean var1 = (field972 & 0x4) != 0;
            boolean var2 = var1 || method1606() && arg0.method1113();
            if (!var2) {
                boolean var3 = (field972 & 0x2) != 0;
                var2 = var3 && arg0.method1136();
            }
            return var2;
        }
    }

    @ObfuscatedName("fv.gu(Lbm;IIIIII)V")
    public static final void method3042(class76 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1123()) {
            return;
        }
        if (arg0 instanceof class85) {
            class286 var6 = ((class85) arg0).field1297;
            if (var6.field3723 != null) {
                var6 = var6.method4806();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class94.field1408;
        int[] var8 = class94.field1406;
        byte var9 = 0;
        if (arg1 < var7 && field913 == arg0.field1145 && method545((class73) arg0)) {
            class73 var10 = (class73) arg0;
            if (arg1 < var7) {
                method117(arg0, arg0.field1191 + 15);
                class313 var11 = (class313) field1028.get(class310.field3884);
                byte var12 = 9;
                var11.method5137(var10.field829.method5060(), field951 + arg2, field952 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field1166.method3778()) {
            method117(arg0, arg0.field1191 + 15);
            for (class84 var14 = (class84) arg0.field1166.method3767(); var14 != null; var14 = (class84) arg0.field1166.method3765()) {
                class77 var15 = var14.method1804(field913);
                if (var15 != null) {
                    class276 var16 = var14.field1292;
                    class332 var17 = var16.method4569();
                    class332 var18 = var16.method4568();
                    int var19 = 0;
                    int var20;
                    if (var17 == null || var18 == null) {
                        var20 = var16.field3523;
                    } else {
                        if (var16.field3537 * 2 < var18.field3991) {
                            var19 = var16.field3537;
                        }
                        var20 = var18.field3991 - var19 * 2;
                    }
                    int var21 = 255;
                    boolean var22 = true;
                    int var23 = field913 - var15.field1202;
                    int var24 = var15.field1203 * var20 / var16.field3523;
                    int var27;
                    if (var15.field1204 > var23) {
                        int var25 = var16.field3535 == 0 ? 0 : var23 / var16.field3535 * var16.field3535;
                        int var26 = var15.field1206 * var20 / var16.field3523;
                        var27 = (var24 - var26) * var25 / var15.field1204 + var26;
                    } else {
                        var27 = var24;
                        int var28 = var15.field1204 + var16.field3533 - var23;
                        if (var16.field3531 >= 0) {
                            var21 = (var28 << 8) / (var16.field3533 - var16.field3531);
                        }
                    }
                    if (var15.field1203 > 0 && var27 < 1) {
                        var27 = 1;
                    }
                    if (var17 == null || var18 == null) {
                        var13 += 5;
                        if (field951 > -1) {
                            int var34 = field951 + arg2 - (var20 >> 1);
                            int var35 = field952 + arg3 - var13;
                            class328.method5362(var34, var35, var27, 5, 65280);
                            class328.method5362(var27 + var34, var35, var20 - var27, 5, 16711680);
                        }
                        var13 += 2;
                    } else {
                        int var29;
                        if (var20 == var27) {
                            var29 = var19 * 2 + var27;
                        } else {
                            var29 = var19 + var27;
                        }
                        int var30 = var17.field3988;
                        var13 += var30;
                        int var31 = field951 + arg2 - (var20 >> 1);
                        int var32 = field952 + arg3 - var13;
                        int var33 = var31 - var19;
                        if (var21 >= 0 && var21 < 255) {
                            var17.method5466(var33, var32, var21);
                            class328.method5355(var33, var32, var29 + var33, var30 + var32);
                            var18.method5466(var33, var32, var21);
                        } else {
                            var17.method5524(var33, var32);
                            class328.method5355(var33, var32, var29 + var33, var30 + var32);
                            var18.method5524(var33, var32);
                        }
                        class328.method5354(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var14.method1805()) {
                    var14.method3796();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var36 = var9 + var13;
        if (arg1 < var7) {
            class73 var37 = (class73) arg0;
            if (var37.field836) {
                return;
            }
            if (var37.field833 != -1 || var37.field828 != -1) {
                method117(arg0, arg0.field1191 + 15);
                if (field951 > -1) {
                    if (var37.field833 != -1) {
                        var36 += 25;
                        Statics.field1893[var37.field833].method5524(field951 + arg2 - 12, field952 + arg3 - var36);
                    }
                    if (var37.field828 != -1) {
                        var36 += 25;
                        Statics.field794[var37.field828].method5524(field951 + arg2 - 12, field952 + arg3 - var36);
                    }
                }
            }
            if (arg1 >= 0 && field871 == 10 && field978 == var8[arg1]) {
                method117(arg0, arg0.field1191 + 15);
                if (field951 > -1) {
                    int var38 = Statics.field2071[1].field3988 + var36;
                    Statics.field2071[1].method5524(field951 + arg2 - 12, field952 + arg3 - var38);
                }
            }
        } else {
            class286 var39 = ((class85) arg0).field1297;
            if (var39.field3723 != null) {
                var39 = var39.method4806();
            }
            if (var39.field3735 >= 0 && var39.field3735 < Statics.field794.length) {
                method117(arg0, arg0.field1191 + 15);
                if (field951 > -1) {
                    Statics.field794[var39.field3735].method5524(field951 + arg2 - 12, field952 + arg3 - 30);
                }
            }
            if (field871 == 1 && field872 == field896[arg1 - var7] && field913 % 20 < 10) {
                method117(arg0, arg0.field1191 + 15);
                if (field951 > -1) {
                    Statics.field2071[0].method5524(field951 + arg2 - 12, field952 + arg3 - 28);
                }
            }
        }
        if (arg0.field1195 != null && (arg1 >= var7 || !arg0.field1156 && (field1067 == 4 || !arg0.field1192 && (field1067 == 0 || field1067 == 3 || field1067 == 1 && ((class73) arg0).method1113())))) {
            method117(arg0, arg0.field1191);
            if (field951 > -1 && field939 < field940) {
                field944[field939] = Statics.field342.method5129(arg0.field1195) / 2;
                field943[field939] = Statics.field342.field3910;
                field890[field939] = field951;
                field942[field939] = field952;
                field945[field939] = arg0.field1160;
                field946[field939] = arg0.field1159;
                field947[field939] = arg0.field1157;
                field948[field939] = arg0.field1195;
                field939++;
            }
        }
        for (int var40 = 0; var40 < 4; var40++) {
            int var41 = arg0.field1171[var40];
            int var42 = arg0.field1161[var40];
            class282 var43 = null;
            int var44 = 0;
            if (var42 >= 0) {
                if (var41 <= field913) {
                    continue;
                }
                var43 = class282.method4262(arg0.field1161[var40]);
                var44 = var43.field3581;
                if (var43 != null && var43.field3588 != null) {
                    var43 = var43.method4657();
                    if (var43 == null) {
                        arg0.field1171[var40] = -1;
                        continue;
                    }
                }
            } else if (var41 < 0) {
                continue;
            }
            int var45 = arg0.field1164[var40];
            class282 var46 = null;
            if (var45 >= 0) {
                var46 = class282.method4262(var45);
                if (var46 != null && var46.field3588 != null) {
                    var46 = var46.method4657();
                }
            }
            if (var41 - var44 <= field913) {
                if (var43 == null) {
                    arg0.field1171[var40] = -1;
                } else {
                    method117(arg0, arg0.field1191 / 2);
                    if (field951 > -1) {
                        if (var40 == 1) {
                            field952 -= 20;
                        }
                        if (var40 == 2) {
                            field951 -= 15;
                            field952 -= 10;
                        }
                        if (var40 == 3) {
                            field951 += 15;
                            field952 -= 10;
                        }
                        Object var47 = null;
                        Object var48 = null;
                        Object var49 = null;
                        Object var50 = null;
                        int var51 = 0;
                        int var52 = 0;
                        int var53 = 0;
                        int var54 = 0;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        class332 var59 = null;
                        class332 var60 = null;
                        class332 var61 = null;
                        class332 var62 = null;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        class332 var72 = var43.method4658();
                        if (var72 != null) {
                            var51 = var72.field3991;
                            int var73 = var72.field3988;
                            if (var73 > var71) {
                                var71 = var73;
                            }
                            var55 = var72.field3989;
                        }
                        class332 var74 = var43.method4684();
                        if (var74 != null) {
                            var52 = var74.field3991;
                            int var75 = var74.field3988;
                            if (var75 > var71) {
                                var71 = var75;
                            }
                            var56 = var74.field3989;
                        }
                        class332 var76 = var43.method4660();
                        if (var76 != null) {
                            var53 = var76.field3991;
                            int var77 = var76.field3988;
                            if (var77 > var71) {
                                var71 = var77;
                            }
                            var57 = var76.field3989;
                        }
                        class332 var78 = var43.method4661();
                        if (var78 != null) {
                            var54 = var78.field3991;
                            int var79 = var78.field3988;
                            if (var79 > var71) {
                                var71 = var79;
                            }
                            var58 = var78.field3989;
                        }
                        if (var46 != null) {
                            var59 = var46.method4658();
                            if (var59 != null) {
                                var63 = var59.field3991;
                                int var80 = var59.field3988;
                                if (var80 > var71) {
                                    var71 = var80;
                                }
                                var67 = var59.field3989;
                            }
                            var60 = var46.method4684();
                            if (var60 != null) {
                                var64 = var60.field3991;
                                int var81 = var60.field3988;
                                if (var81 > var71) {
                                    var71 = var81;
                                }
                                var68 = var60.field3989;
                            }
                            var61 = var46.method4660();
                            if (var61 != null) {
                                var65 = var61.field3991;
                                int var82 = var61.field3988;
                                if (var82 > var71) {
                                    var71 = var82;
                                }
                                var69 = var61.field3989;
                            }
                            var62 = var46.method4661();
                            if (var62 != null) {
                                var66 = var62.field3991;
                                int var83 = var62.field3988;
                                if (var83 > var71) {
                                    var71 = var83;
                                }
                                var70 = var62.field3989;
                            }
                        }
                        class312 var84 = var43.method4662();
                        if (var84 == null) {
                            var84 = Statics.field318;
                        }
                        class312 var85;
                        if (var46 == null) {
                            var85 = Statics.field318;
                        } else {
                            var85 = var46.method4662();
                            if (var85 == null) {
                                var85 = Statics.field318;
                            }
                        }
                        Object var86 = null;
                        String var87 = null;
                        boolean var88 = false;
                        int var89 = 0;
                        String var90 = var43.method4653(arg0.field1155[var40]);
                        int var91 = var84.method5129(var90);
                        if (var46 != null) {
                            var87 = var46.method4653(arg0.field1165[var40]);
                            var89 = var85.method5129(var87);
                        }
                        int var92 = 0;
                        int var93 = 0;
                        if (var52 > 0) {
                            if (var76 == null && var78 == null) {
                                var92 = 1;
                            } else {
                                var92 = var91 / var52 + 1;
                            }
                        }
                        if (var46 != null && var64 > 0) {
                            if (var61 == null && var62 == null) {
                                var93 = 1;
                            } else {
                                var93 = var89 / var64 + 1;
                            }
                        }
                        int var94 = 0;
                        int var95 = var94;
                        if (var51 > 0) {
                            var94 += var51;
                        }
                        var94 += 2;
                        int var96 = var94;
                        if (var53 > 0) {
                            var94 += var53;
                        }
                        int var97 = var94;
                        int var98 = var94;
                        int var100;
                        if (var52 > 0) {
                            int var99 = var52 * var92;
                            var100 = var94 + var99;
                            var98 = (var99 - var91) / 2 + var94;
                        } else {
                            var100 = var91 + var94;
                        }
                        int var101 = var100;
                        if (var54 > 0) {
                            var100 += var54;
                        }
                        int var102 = 0;
                        int var103 = 0;
                        int var104 = 0;
                        int var105 = 0;
                        int var106 = 0;
                        if (var46 != null) {
                            var100 += 2;
                            var102 = var100;
                            if (var63 > 0) {
                                var100 += var63;
                            }
                            var100 += 2;
                            var103 = var100;
                            if (var65 > 0) {
                                var100 += var65;
                            }
                            var104 = var100;
                            var106 = var100;
                            if (var64 > 0) {
                                int var107 = var64 * var93;
                                var100 += var107;
                                var106 += (var107 - var89) / 2;
                            } else {
                                var100 += var89;
                            }
                            var105 = var100;
                            if (var66 > 0) {
                                var100 += var66;
                            }
                        }
                        int var108 = arg0.field1171[var40] - field913;
                        int var109 = var43.field3582 - var43.field3582 * var108 / var43.field3581;
                        int var110 = var43.field3583 * var108 / var43.field3581 + -var43.field3583;
                        int var111 = field951 + arg2 - (var100 >> 1) + var109;
                        int var112 = field952 + arg3 - 12 + var110;
                        int var113 = var112;
                        int var114 = var71 + var112;
                        int var115 = var43.field3587 + var112 + 15;
                        int var116 = var115 - var84.field3903;
                        int var117 = var84.field3904 + var115;
                        if (var116 < var112) {
                            var113 = var116;
                        }
                        if (var117 > var114) {
                            var114 = var117;
                        }
                        int var118 = 0;
                        if (var46 != null) {
                            var118 = var46.field3587 + var112 + 15;
                            int var119 = var118 - var85.field3903;
                            int var120 = var85.field3904 + var118;
                            if (var119 < var113) {
                                ;
                            }
                            if (var120 > var114) {
                                ;
                            }
                        }
                        int var123 = 255;
                        if (var43.field3567 >= 0) {
                            var123 = (var108 << 8) / (var43.field3581 - var43.field3567);
                        }
                        if (var123 >= 0 && var123 < 255) {
                            if (var72 != null) {
                                var72.method5466(var95 + var111 - var55, var112, var123);
                            }
                            if (var76 != null) {
                                var76.method5466(var96 + var111 - var57, var112, var123);
                            }
                            if (var74 != null) {
                                for (int var124 = 0; var124 < var92; var124++) {
                                    var74.method5466(var52 * var124 + (var97 + var111 - var56), var112, var123);
                                }
                            }
                            if (var78 != null) {
                                var78.method5466(var101 + var111 - var58, var112, var123);
                            }
                            var84.method5135(var90, var98 + var111, var115, var43.field3576, 0, var123);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5466(var102 + var111 - var67, var112, var123);
                                }
                                if (var61 != null) {
                                    var61.method5466(var103 + var111 - var69, var112, var123);
                                }
                                if (var60 != null) {
                                    for (int var125 = 0; var125 < var93; var125++) {
                                        var60.method5466(var64 * var125 + (var104 + var111 - var68), var112, var123);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5466(var105 + var111 - var70, var112, var123);
                                }
                                var85.method5135(var87, var106 + var111, var118, var46.field3576, 0, var123);
                            }
                        } else {
                            if (var72 != null) {
                                var72.method5524(var95 + var111 - var55, var112);
                            }
                            if (var76 != null) {
                                var76.method5524(var96 + var111 - var57, var112);
                            }
                            if (var74 != null) {
                                for (int var126 = 0; var126 < var92; var126++) {
                                    var74.method5524(var52 * var126 + (var97 + var111 - var56), var112);
                                }
                            }
                            if (var78 != null) {
                                var78.method5524(var101 + var111 - var58, var112);
                            }
                            var84.method5186(var90, var98 + var111, var115, var43.field3576 | 0xFF000000, 0);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5524(var102 + var111 - var67, var112);
                                }
                                if (var61 != null) {
                                    var61.method5524(var103 + var111 - var69, var112);
                                }
                                if (var60 != null) {
                                    for (int var127 = 0; var127 < var93; var127++) {
                                        var60.method5524(var64 * var127 + (var104 + var111 - var68), var112);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5524(var105 + var111 - var70, var112);
                                }
                                var85.method5186(var87, var106 + var111, var118, var46.field3576 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("q.gt(IIIIB)V")
    public static final void method94(int arg0, int arg1, int arg2, int arg3) {
        field939 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = -1;
        int var7 = class94.field1408;
        int[] var8 = class94.field1406;
        for (int var9 = 0; var9 < field895 + var7; var9++) {
            class76 var10;
            if (var9 < var7) {
                var10 = field1004[var8[var9]];
                if (field979 == var8[var9]) {
                    var4 = true;
                    var5 = var9;
                    continue;
                }
                if (Statics.field3435 == var10) {
                    var6 = var9;
                    continue;
                }
            } else {
                var10 = field894[field896[var9 - var7]];
            }
            method3042(var10, var9, arg0, arg1, arg2, arg3);
        }
        if (field929 && var6 != -1) {
            method3042(Statics.field3435, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method3042(field1004[field979], var5, arg0, arg1, arg2, arg3);
        }
        for (int var11 = 0; var11 < field939; var11++) {
            int var12 = field890[var11];
            int var13 = field942[var11];
            int var14 = field944[var11];
            int var15 = field943[var11];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var17 = 0; var17 < var11; var17++) {
                    if (var13 + 2 > field942[var17] - field943[var17] && var13 - var15 < field942[var17] + 2 && var12 - var14 < field944[var17] + field890[var17] && var12 + var14 > field890[var17] - field944[var17] && field942[var17] - field943[var17] < var13) {
                        var13 = field942[var17] - field943[var17];
                        var16 = true;
                    }
                }
            }
            field951 = field890[var11];
            field952 = field942[var11] = var13;
            String var18 = field948[var11];
            if (field1015 == 0) {
                int var19 = 16776960;
                if (field945[var11] < 6) {
                    var19 = field1077[field945[var11]];
                }
                if (field945[var11] == 6) {
                    var19 = field1094 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field945[var11] == 7) {
                    var19 = field1094 % 20 < 10 ? 255 : 65535;
                }
                if (field945[var11] == 8) {
                    var19 = field1094 % 20 < 10 ? 45056 : 8454016;
                }
                if (field945[var11] == 9) {
                    int var20 = 150 - field947[var11];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var19 = (var20 - 100) * 5 + 65280;
                    }
                }
                if (field945[var11] == 10) {
                    int var21 = 150 - field947[var11];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 - (var21 - 100) * 5;
                    }
                }
                if (field945[var11] == 11) {
                    int var22 = 150 - field947[var11];
                    if (var22 < 50) {
                        var19 = 16777215 - var22 * 327685;
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - (var22 - 100) * 327680;
                    }
                }
                if (field946[var11] == 0) {
                    Statics.field342.method5137(var18, field951 + arg0, field952 + arg1, var19, 0);
                }
                if (field946[var11] == 1) {
                    Statics.field342.method5158(var18, field951 + arg0, field952 + arg1, var19, 0, field1094);
                }
                if (field946[var11] == 2) {
                    Statics.field342.method5140(var18, field951 + arg0, field952 + arg1, var19, 0, field1094);
                }
                if (field946[var11] == 3) {
                    Statics.field342.method5141(var18, field951 + arg0, field952 + arg1, var19, 0, field1094, 150 - field947[var11]);
                }
                if (field946[var11] == 4) {
                    int var23 = (150 - field947[var11]) * (Statics.field342.method5129(var18) + 100) / 150;
                    class328.method5355(field951 + arg0 - 50, arg1, field951 + arg0 + 50, arg1 + arg3);
                    Statics.field342.method5186(var18, field951 + arg0 + 50 - var23, field952 + arg1, var19, 0);
                    class328.method5354(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field946[var11] == 5) {
                    int var24 = 150 - field947[var11];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    class328.method5355(arg0, field952 + arg1 - Statics.field342.field3910 - 1, arg0 + arg2, field952 + arg1 + 5);
                    Statics.field342.method5137(var18, field951 + arg0, field952 + arg1 + var25, var19, 0);
                    class328.method5354(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field342.method5137(var18, field951 + arg0, field952 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("ex.gi(IIIIB)V")
    public static final void method2931(int arg0, int arg1, int arg2, int arg3) {
        if (field998) {
            if (field956 == 1) {
                Statics.field742[field1081 / 100].method5524(field1038 - 8, field954 - 8);
            }
            if (field956 == 2) {
                Statics.field742[field1081 / 100 + 4].method5524(field1038 - 8, field954 - 8);
            }
        }
        field1048 = 0;
        int var4 = (Statics.field3435.field1154 >> 7) + Statics.field2465;
        int var5 = (Statics.field3435.field1148 >> 7) + Statics.field594;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field1048 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field1048 = 1;
        }
        if (field1048 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field1048 = 0;
        }
    }

    @ObfuscatedName("f.gz(Lbm;II)V")
    public static final void method117(class76 arg0, int arg1) {
        method4179(arg0.field1154, arg0.field1148, arg1);
    }

    @ObfuscatedName("iz.ga(IIIB)V")
    public static final void method4179(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field951 = -1;
            field952 = -1;
            return;
        }
        int var3 = method79(arg0, arg1, Statics.field226) - arg2;
        int var4 = arg0 - Statics.field2105;
        int var5 = var3 - Statics.field1318;
        int var6 = arg1 - Statics.field2196;
        int var7 = class135.field1939[Statics.field322];
        int var8 = class135.field1921[Statics.field322];
        int var9 = class135.field1939[Statics.field457];
        int var10 = class135.field1921[Statics.field457];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field951 = field1053 * var11 / var15 + field918 / 2;
            field952 = field1053 * var14 / var15 + field899 / 2;
        } else {
            field951 = -1;
            field952 = -1;
        }
    }

    @ObfuscatedName("p.hc(IIIB)I")
    public static final int method79(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class63.field721[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class63.field731[var5][var3][var4] + class63.field731[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class63.field731[var5][var3][var4 + 1] + class63.field731[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("by.hh(IIIIIIB)V")
    public static final void method1165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class135.field1939[var6];
            int var12 = class135.field1921[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class135.field1939[var7];
            int var15 = class135.field1921[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field2105 = arg0 - var8;
        Statics.field1318 = arg1 - var9;
        Statics.field2196 = arg2 - var10;
        Statics.field322 = arg3;
        Statics.field457 = arg4;
        if (field927 == 1 && field997 >= 2 && field913 % 50 == 0 && (Statics.field368 >> 7 != Statics.field3435.field1154 >> 7 || Statics.field2784 >> 7 != Statics.field3435.field1148 >> 7)) {
            int var17 = Statics.field3435.field832;
            int var18 = (Statics.field368 >> 7) + Statics.field2465;
            int var19 = (Statics.field2784 >> 7) + Statics.field594;
            method541(var18, var19, var17, true);
        }
    }

    @ObfuscatedName("ao.hk(ZLgl;I)V")
    public static final void method338(boolean arg0, class202 arg1) {
        field1079 = arg0;
        if (!field1079) {
            int var2 = arg1.method3337();
            int var3 = arg1.method3345();
            int var4 = arg1.method3310();
            Statics.field526 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field526[var5][var6] = arg1.method3472();
                }
            }
            Statics.field332 = new int[var4];
            Statics.field354 = new int[var4];
            Statics.field1205 = new int[var4];
            Statics.field1324 = new byte[var4][];
            Statics.field271 = new byte[var4][];
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
                        Statics.field332[var8] = var11;
                        Statics.field354[var8] = Statics.field637.method4306("m" + var9 + "_" + var10);
                        Statics.field1205[var8] = Statics.field637.method4306("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method30(var2, var3, true);
            return;
        }
        int var12 = arg1.method3345();
        boolean var13 = arg1.method3338() == 1;
        int var14 = arg1.method3310();
        int var15 = arg1.method3310();
        arg1.method3559();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3562(1);
                    if (var19 == 1) {
                        field907[var16][var17][var18] = arg1.method3562(26);
                    } else {
                        field907[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3556();
        Statics.field526 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field526[var20][var21] = arg1.method3472();
            }
        }
        Statics.field332 = new int[var15];
        Statics.field354 = new int[var15];
        Statics.field1205 = new int[var15];
        Statics.field1324 = new byte[var15][];
        Statics.field271 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field907[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field332[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field332[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field354[var22] = Statics.field637.method4306("m" + var31 + "_" + var32);
                            Statics.field1205[var22] = Statics.field637.method4306("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method30(var12, var14, !var13);
    }

    @ObfuscatedName("y.hx(IIZI)V")
    public static final void method30(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field2207 == arg0 && Statics.field494 == arg1) {
            return;
        }
        Statics.field2207 = arg0;
        Statics.field494 = arg1;
        method751(25);
        method17(class252.field3031, true);
        int var3 = Statics.field2465;
        int var4 = Statics.field594;
        Statics.field2465 = (arg0 - 6) * 8;
        Statics.field594 = (arg1 - 6) * 8;
        int var5 = Statics.field2465 - var3;
        int var6 = Statics.field594 - var4;
        int var7 = Statics.field2465;
        int var8 = Statics.field594;
        for (int var9 = 0; var9 < 32768; var9++) {
            class85 var10 = field894[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1196[var11] -= var5;
                    var10.field1197[var11] -= var6;
                }
                var10.field1154 -= var5 * 128;
                var10.field1148 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class73 var13 = field1004[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1196[var14] -= var5;
                    var13.field1197[var14] -= var6;
                }
                var13.field1154 -= var5 * 128;
                var13.field1148 -= var6 * 128;
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
                        field980[var25][var21][var22] = field980[var25][var23][var24];
                    } else {
                        field980[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class75 var26 = (class75) field981.method3809(); var26 != null; var26 = (class75) field981.method3832()) {
            var26.field1128 -= var5;
            var26.field1130 -= var6;
            if (var26.field1128 < 0 || var26.field1130 < 0 || var26.field1128 >= 104 || var26.field1130 >= 104) {
                var26.method3796();
            }
        }
        if (field1023 != 0) {
            field1023 -= var5;
            field1082 -= var6;
        }
        field957 = 0;
        field1095 = false;
        Statics.field2105 -= var5 << 7;
        Statics.field2196 -= var6 << 7;
        Statics.field368 -= var5 << 7;
        Statics.field2784 -= var6 << 7;
        field1076 = -1;
        field983.method3811();
        field982.method3811();
        for (int var27 = 0; var27 < 4; var27++) {
            field910[var27].method3188();
        }
    }

    @ObfuscatedName("kk.hi(ZB)V")
    public static final void method4840(boolean arg0) {
        method510();
        field912.field1467++;
        if (field912.field1467 < 50 && !arg0) {
            return;
        }
        field912.field1467 = 0;
        if (field986 || field912.method2003() == null) {
            return;
        }
        class185 var1 = class185.method2191(class182.field2384, field912.field1461);
        field912.method1999(var1);
        try {
            field912.method1998();
        } catch (IOException var3) {
            field986 = true;
        }
    }

    @ObfuscatedName("an.ho(I)V")
    public static final void method682() {
        method4840(false);
        field905 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1324.length; var1++) {
            if (Statics.field354[var1] != -1 && Statics.field1324[var1] == null) {
                Statics.field1324[var1] = Statics.field637.method4294(Statics.field354[var1], 0);
                if (Statics.field1324[var1] == null) {
                    var0 = false;
                    field905++;
                }
            }
            if (Statics.field1205[var1] != -1 && Statics.field271[var1] == null) {
                Statics.field271[var1] = Statics.field637.method4268(Statics.field1205[var1], 0, Statics.field526[var1]);
                if (Statics.field271[var1] == null) {
                    var0 = false;
                    field905++;
                }
            }
        }
        if (!var0) {
            field1003 = 1;
            return;
        }
        field911 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1324.length; var3++) {
            byte[] var4 = Statics.field271[var3];
            if (var4 != null) {
                int var5 = (Statics.field332[var3] >> 8) * 64 - Statics.field2465;
                int var6 = (Statics.field332[var3] & 0xFF) * 64 - Statics.field594;
                if (field1079) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class195 var9 = new class195(var4);
                int var10 = -1;
                label1140: while (true) {
                    int var11 = var9.method3339();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method3339();
                            if (var16 == 0) {
                                continue label1140;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method3332() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class283 var22 = class283.method1732(var10);
                                if (var19 != 22 || !field853 || var22.field3627 != 0 || var22.field3609 == 1 || var22.field3630) {
                                    if (!var22.method4695()) {
                                        field911++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method3339();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method3332();
                    }
                }
            }
        }
        if (!var2) {
            field1003 = 2;
            return;
        }
        if (field1003 != 0) {
            method17(class252.field3031 + class87.field1315 + class87.field1309 + 100 + "%" + class87.field1312, true);
        }
        method510();
        Statics.field2246.method2741();
        for (int var23 = 0; var23 < 4; var23++) {
            field910[var23].method3188();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class63.field721[var24][var25][var26] = 0;
                }
            }
        }
        method510();
        class63.method788();
        int var27 = Statics.field1324.length;
        class81.method2014();
        method4840(true);
        if (!field1079) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field332[var28] >> 8) * 64 - Statics.field2465;
                int var30 = (Statics.field332[var28] & 0xFF) * 64 - Statics.field594;
                byte[] var31 = Statics.field1324[var28];
                if (var31 != null) {
                    method510();
                    int var32 = Statics.field2207 * 8 - 48;
                    int var33 = Statics.field494 * 8 - 48;
                    class177[] var34 = field910;
                    for (int var35 = 0; var35 < 4; var35++) {
                        for (int var36 = 0; var36 < 64; var36++) {
                            for (int var37 = 0; var37 < 64; var37++) {
                                if (var29 + var36 > 0 && var29 + var36 < 103 && var30 + var37 > 0 && var30 + var37 < 103) {
                                    var34[var35].field2252[var29 + var36][var30 + var37] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class195 var38 = new class195(var31);
                    for (int var39 = 0; var39 < 4; var39++) {
                        for (int var40 = 0; var40 < 64; var40++) {
                            for (int var41 = 0; var41 < 64; var41++) {
                                Statics.method1844(var38, var39, var29 + var40, var30 + var41, var32, var33, 0);
                            }
                        }
                    }
                }
            }
            for (int var42 = 0; var42 < var27; var42++) {
                int var43 = (Statics.field332[var42] >> 8) * 64 - Statics.field2465;
                int var44 = (Statics.field332[var42] & 0xFF) * 64 - Statics.field594;
                byte[] var45 = Statics.field1324[var42];
                if (var45 == null && Statics.field494 < 800) {
                    method510();
                    class63.method821(var43, var44, 64, 64);
                }
            }
            method4840(true);
            for (int var46 = 0; var46 < var27; var46++) {
                byte[] var47 = Statics.field271[var46];
                if (var47 != null) {
                    int var48 = (Statics.field332[var46] >> 8) * 64 - Statics.field2465;
                    int var49 = (Statics.field332[var46] & 0xFF) * 64 - Statics.field594;
                    method510();
                    class63.method3126(var47, var48, var49, Statics.field2246, field910);
                }
            }
        }
        if (field1079) {
            for (int var50 = 0; var50 < 4; var50++) {
                method510();
                for (int var51 = 0; var51 < 13; var51++) {
                    for (int var52 = 0; var52 < 13; var52++) {
                        boolean var53 = false;
                        int var54 = field907[var50][var51][var52];
                        if (var54 != -1) {
                            int var55 = var54 >> 24 & 0x3;
                            int var56 = var54 >> 1 & 0x3;
                            int var57 = var54 >> 14 & 0x3FF;
                            int var58 = var54 >> 3 & 0x7FF;
                            int var59 = (var57 / 8 << 8) + var58 / 8;
                            for (int var60 = 0; var60 < Statics.field332.length; var60++) {
                                if (Statics.field332[var60] == var59 && Statics.field1324[var60] != null) {
                                    byte[] var61 = Statics.field1324[var60];
                                    int var62 = var51 * 8;
                                    int var63 = var52 * 8;
                                    int var64 = (var57 & 0x7) * 8;
                                    int var65 = (var58 & 0x7) * 8;
                                    class177[] var66 = field910;
                                    for (int var67 = 0; var67 < 8; var67++) {
                                        for (int var68 = 0; var68 < 8; var68++) {
                                            if (var62 + var67 > 0 && var62 + var67 < 103 && var63 + var68 > 0 && var63 + var68 < 103) {
                                                var66[var50].field2252[var62 + var67][var63 + var68] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class195 var69 = new class195(var61);
                                    for (int var70 = 0; var70 < 4; var70++) {
                                        for (int var71 = 0; var71 < 64; var71++) {
                                            for (int var72 = 0; var72 < 64; var72++) {
                                                if (var55 == var70 && var71 >= var64 && var71 < var64 + 8 && var72 >= var65 && var72 < var65 + 8) {
                                                    int var76 = var71 & 0x7;
                                                    int var77 = var72 & 0x7;
                                                    int var79 = var56 & 0x3;
                                                    int var80;
                                                    if (var79 == 0) {
                                                        var80 = var76;
                                                    } else if (var79 == 1) {
                                                        var80 = var77;
                                                    } else if (var79 == 2) {
                                                        var80 = 7 - var76;
                                                    } else {
                                                        var80 = 7 - var77;
                                                    }
                                                    Statics.method1844(var69, var50, var62 + var80, var63 + class242.method1798(var71 & 0x7, var72 & 0x7, var56), 0, 0, var56);
                                                } else {
                                                    Statics.method1844(var69, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var53 = true;
                                    break;
                                }
                            }
                        }
                        if (!var53) {
                            class63.method1723(var50, var51 * 8, var52 * 8);
                        }
                    }
                }
            }
            for (int var81 = 0; var81 < 13; var81++) {
                for (int var82 = 0; var82 < 13; var82++) {
                    int var83 = field907[0][var81][var82];
                    if (var83 == -1) {
                        class63.method821(var81 * 8, var82 * 8, 8, 8);
                    }
                }
            }
            method4840(true);
            for (int var84 = 0; var84 < 4; var84++) {
                method510();
                for (int var85 = 0; var85 < 13; var85++) {
                    label945: for (int var86 = 0; var86 < 13; var86++) {
                        int var87 = field907[var84][var85][var86];
                        if (var87 != -1) {
                            int var88 = var87 >> 24 & 0x3;
                            int var89 = var87 >> 1 & 0x3;
                            int var90 = var87 >> 14 & 0x3FF;
                            int var91 = var87 >> 3 & 0x7FF;
                            int var92 = (var90 / 8 << 8) + var91 / 8;
                            for (int var93 = 0; var93 < Statics.field332.length; var93++) {
                                if (Statics.field332[var93] == var92 && Statics.field271[var93] != null) {
                                    byte[] var94 = Statics.field271[var93];
                                    int var95 = var85 * 8;
                                    int var96 = var86 * 8;
                                    int var97 = (var90 & 0x7) * 8;
                                    int var98 = (var91 & 0x7) * 8;
                                    class138 var99 = Statics.field2246;
                                    class177[] var100 = field910;
                                    class195 var101 = new class195(var94);
                                    int var102 = -1;
                                    while (true) {
                                        int var103 = var101.method3339();
                                        if (var103 == 0) {
                                            continue label945;
                                        }
                                        var102 += var103;
                                        int var104 = 0;
                                        while (true) {
                                            int var105 = var101.method3339();
                                            if (var105 == 0) {
                                                break;
                                            }
                                            var104 += var105 - 1;
                                            int var106 = var104 & 0x3F;
                                            int var107 = var104 >> 6 & 0x3F;
                                            int var108 = var104 >> 12;
                                            int var109 = var101.method3332();
                                            int var110 = var109 >> 2;
                                            int var111 = var109 & 0x3;
                                            if (var88 == var108 && var107 >= var97 && var107 < var97 + 8 && var106 >= var98 && var106 < var98 + 8) {
                                                class283 var112 = class283.method1732(var102);
                                                int var114 = var107 & 0x7;
                                                int var115 = var106 & 0x7;
                                                int var117 = var112.field3610;
                                                int var118 = var112.field3608;
                                                if ((var111 & 0x1) == 1) {
                                                    int var119 = var117;
                                                    var117 = var118;
                                                    var118 = var119;
                                                }
                                                int var120 = var89 & 0x3;
                                                int var121;
                                                if (var120 == 0) {
                                                    var121 = var114;
                                                } else if (var120 == 1) {
                                                    var121 = var115;
                                                } else if (var120 == 2) {
                                                    var121 = 7 - var114 - (var117 - 1);
                                                } else {
                                                    var121 = 7 - var115 - (var118 - 1);
                                                }
                                                int var122 = var95 + var121;
                                                int var123 = var96 + class242.method2425(var107 & 0x7, var106 & 0x7, var89, var112.field3610, var112.field3608, var111);
                                                if (var122 > 0 && var123 > 0 && var122 < 103 && var123 < 103) {
                                                    int var124 = var84;
                                                    if ((class63.field721[1][var122][var123] & 0x2) == 2) {
                                                        var124 = var84 - 1;
                                                    }
                                                    class177 var125 = null;
                                                    if (var124 >= 0) {
                                                        var125 = var100[var124];
                                                    }
                                                    class63.method203(var84, var122, var123, var102, var89 + var111 & 0x3, var110, var99, var125);
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
        method4840(true);
        method510();
        class138 var126 = Statics.field2246;
        class177[] var127 = field910;
        for (int var128 = 0; var128 < 4; var128++) {
            for (int var129 = 0; var129 < 104; var129++) {
                for (int var130 = 0; var130 < 104; var130++) {
                    if ((class63.field721[var128][var129][var130] & 0x1) == 1) {
                        int var131 = var128;
                        if ((class63.field721[1][var129][var130] & 0x2) == 2) {
                            var131 = var128 - 1;
                        }
                        if (var131 >= 0) {
                            var127[var131].method3190(var129, var130);
                        }
                    }
                }
            }
        }
        class63.field734 += (int) (Math.random() * 5.0D) - 2;
        if (class63.field734 < -8) {
            class63.field734 = -8;
        }
        if (class63.field734 > 8) {
            class63.field734 = 8;
        }
        class63.field735 += (int) (Math.random() * 5.0D) - 2;
        if (class63.field735 < -16) {
            class63.field735 = -16;
        }
        if (class63.field735 > 16) {
            class63.field735 = 16;
        }
        for (int var132 = 0; var132 < 4; var132++) {
            byte[][] var133 = Statics.field520[var132];
            int var134 = (int) Math.sqrt(5100.0D);
            int var135 = var134 * 768 >> 8;
            for (int var136 = 1; var136 < 103; var136++) {
                for (int var137 = 1; var137 < 103; var137++) {
                    int var138 = class63.field731[var132][var137 + 1][var136] - class63.field731[var132][var137 - 1][var136];
                    int var139 = class63.field731[var132][var137][var136 + 1] - class63.field731[var132][var137][var136 - 1];
                    int var140 = (int) Math.sqrt((double) (var139 * var139 + var138 * var138 + 65536));
                    int var141 = (var138 << 8) / var140;
                    int var142 = 65536 / var140;
                    int var143 = (var139 << 8) / var140;
                    int var144 = (var143 * -50 + var141 * -50 + var142 * -10) / var135 + 96;
                    int var145 = (var133[var137][var136] >> 1) + (var133[var137][var136 + 1] >> 3) + (var133[var137][var136 - 1] >> 2) + (var133[var137 - 1][var136] >> 2) + (var133[var137 + 1][var136] >> 3);
                    Statics.field3835[var137][var136] = var144 - var145;
                }
            }
            for (int var146 = 0; var146 < 104; var146++) {
                Statics.field733[var146] = 0;
                Statics.field757[var146] = 0;
                Statics.field2502[var146] = 0;
                Statics.field278[var146] = 0;
                Statics.field589[var146] = 0;
            }
            for (int var147 = -5; var147 < 109; var147++) {
                for (int var148 = 0; var148 < 104; var148++) {
                    int var149 = var147 + 5;
                    int var10002;
                    if (var149 >= 0 && var149 < 104) {
                        int var150 = Statics.field724[var132][var149][var148] & 0xFF;
                        if (var150 > 0) {
                            class274 var151 = class274.method2932(var150 - 1);
                            Statics.field733[var148] += var151.field3502;
                            Statics.field757[var148] += var151.field3503;
                            Statics.field2502[var148] += var151.field3499;
                            Statics.field278[var148] += var151.field3505;
                            var10002 = Statics.field589[var148]++;
                        }
                    }
                    int var152 = var147 - 5;
                    if (var152 >= 0 && var152 < 104) {
                        int var153 = Statics.field724[var132][var152][var148] & 0xFF;
                        if (var153 > 0) {
                            class274 var154 = class274.method2932(var153 - 1);
                            Statics.field733[var148] -= var154.field3502;
                            Statics.field757[var148] -= var154.field3503;
                            Statics.field2502[var148] -= var154.field3499;
                            Statics.field278[var148] -= var154.field3505;
                            var10002 = Statics.field589[var148]--;
                        }
                    }
                }
                if (var147 >= 1 && var147 < 103) {
                    int var155 = 0;
                    int var156 = 0;
                    int var157 = 0;
                    int var158 = 0;
                    int var159 = 0;
                    for (int var160 = -5; var160 < 109; var160++) {
                        int var161 = var160 + 5;
                        if (var161 >= 0 && var161 < 104) {
                            var155 += Statics.field733[var161];
                            var156 += Statics.field757[var161];
                            var157 += Statics.field2502[var161];
                            var158 += Statics.field278[var161];
                            var159 += Statics.field589[var161];
                        }
                        int var162 = var160 - 5;
                        if (var162 >= 0 && var162 < 104) {
                            var155 -= Statics.field733[var162];
                            var156 -= Statics.field757[var162];
                            var157 -= Statics.field2502[var162];
                            var158 -= Statics.field278[var162];
                            var159 -= Statics.field589[var162];
                        }
                        if (var160 >= 1 && var160 < 103 && (!field853 || (class63.field721[0][var147][var160] & 0x2) != 0 || (class63.field721[var132][var147][var160] & 0x10) == 0)) {
                            if (var132 < class63.field723) {
                                class63.field723 = var132;
                            }
                            int var163 = Statics.field724[var132][var147][var160] & 0xFF;
                            int var164 = Statics.field341[var132][var147][var160] & 0xFF;
                            if (var163 > 0 || var164 > 0) {
                                int var165 = class63.field731[var132][var147][var160];
                                int var166 = class63.field731[var132][var147 + 1][var160];
                                int var167 = class63.field731[var132][var147 + 1][var160 + 1];
                                int var168 = class63.field731[var132][var147][var160 + 1];
                                int var169 = Statics.field3835[var147][var160];
                                int var170 = Statics.field3835[var147 + 1][var160];
                                int var171 = Statics.field3835[var147 + 1][var160 + 1];
                                int var172 = Statics.field3835[var147][var160 + 1];
                                int var173 = -1;
                                int var174 = -1;
                                if (var163 > 0) {
                                    int var175 = var155 * 256 / var158;
                                    int var176 = var156 / var159;
                                    int var177 = var157 / var159;
                                    var173 = class63.method5112(var175, var176, var177);
                                    int var178 = class63.field734 + var175 & 0xFF;
                                    int var179 = class63.field735 + var177;
                                    if (var179 < 0) {
                                        var179 = 0;
                                    } else if (var179 > 255) {
                                        var179 = 255;
                                    }
                                    var174 = class63.method5112(var178, var176, var179);
                                }
                                if (var132 > 0) {
                                    boolean var180 = true;
                                    if (var163 == 0 && Statics.field725[var132][var147][var160] != 0) {
                                        var180 = false;
                                    }
                                    if (var164 > 0 && !class287.method3920(var164 - 1).field3748) {
                                        var180 = false;
                                    }
                                    if (var180 && var165 == var166 && var165 == var167 && var165 == var168) {
                                        Statics.field272[var132][var147][var160] |= 0x924;
                                    }
                                }
                                int var181 = 0;
                                if (var174 != -1) {
                                    var181 = class135.field1940[class63.method1979(var174, 96)];
                                }
                                if (var164 == 0) {
                                    var126.method2746(var132, var147, var160, 0, 0, -1, var165, var166, var167, var168, class63.method1979(var173, var169), class63.method1979(var173, var170), class63.method1979(var173, var171), class63.method1979(var173, var172), 0, 0, 0, 0, var181, 0);
                                } else {
                                    int var182 = Statics.field725[var132][var147][var160] + 1;
                                    byte var183 = Statics.field726[var132][var147][var160];
                                    class287 var184 = class287.method3920(var164 - 1);
                                    int var185 = var184.field3750;
                                    int var186;
                                    int var187;
                                    if (var185 >= 0) {
                                        var186 = Statics.field1936.method2455(var185);
                                        var187 = -1;
                                    } else if (var184.field3746 == 16711935) {
                                        var187 = -2;
                                        var185 = -1;
                                        var186 = -2;
                                    } else {
                                        var187 = class63.method5112(var184.field3747, var184.field3751, var184.field3754);
                                        int var188 = class63.field734 + var184.field3747 & 0xFF;
                                        int var189 = class63.field735 + var184.field3754;
                                        if (var189 < 0) {
                                            var189 = 0;
                                        } else if (var189 > 255) {
                                            var189 = 255;
                                        }
                                        var186 = class63.method5112(var188, var184.field3751, var189);
                                    }
                                    int var190 = 0;
                                    if (var186 != -2) {
                                        var190 = class135.field1940[class63.method636(var186, 96)];
                                    }
                                    if (var184.field3749 != -1) {
                                        int var191 = class63.field734 + var184.field3753 & 0xFF;
                                        int var192 = class63.field735 + var184.field3744;
                                        if (var192 < 0) {
                                            var192 = 0;
                                        } else if (var192 > 255) {
                                            var192 = 255;
                                        }
                                        int var193 = class63.method5112(var191, var184.field3756, var192);
                                        var190 = class135.field1940[class63.method636(var193, 96)];
                                    }
                                    var126.method2746(var132, var147, var160, var182, var183, var185, var165, var166, var167, var168, class63.method1979(var173, var169), class63.method1979(var173, var170), class63.method1979(var173, var171), class63.method1979(var173, var172), class63.method636(var187, var169), class63.method636(var187, var170), class63.method636(var187, var171), class63.method636(var187, var172), var181, var190);
                                }
                            }
                        }
                    }
                }
            }
            for (int var194 = 1; var194 < 103; var194++) {
                for (int var195 = 1; var195 < 103; var195++) {
                    int var200;
                    if ((class63.field721[var132][var195][var194] & 0x8) != 0) {
                        var200 = 0;
                    } else if (var132 <= 0 || (class63.field721[1][var195][var194] & 0x2) == 0) {
                        var200 = var132;
                    } else {
                        var200 = var132 - 1;
                    }
                    var126.method2769(var132, var195, var194, var200);
                }
            }
            Statics.field724[var132] = (byte[][]) null;
            Statics.field341[var132] = (byte[][]) null;
            Statics.field725[var132] = (byte[][]) null;
            Statics.field726[var132] = (byte[][]) null;
            Statics.field520[var132] = (byte[][]) null;
        }
        var126.method2761(-50, -10, -50);
        for (int var201 = 0; var201 < 104; var201++) {
            for (int var202 = 0; var202 < 104; var202++) {
                if ((class63.field721[1][var201][var202] & 0x2) == 2) {
                    var126.method2743(var201, var202);
                }
            }
        }
        int var203 = 1;
        int var204 = 2;
        int var205 = 4;
        for (int var206 = 0; var206 < 4; var206++) {
            if (var206 > 0) {
                var203 <<= 0x3;
                var204 <<= 0x3;
                var205 <<= 0x3;
            }
            for (int var207 = 0; var207 <= var206; var207++) {
                for (int var208 = 0; var208 <= 104; var208++) {
                    for (int var209 = 0; var209 <= 104; var209++) {
                        if ((Statics.field272[var207][var209][var208] & var203) != 0) {
                            int var210 = var208;
                            int var211 = var208;
                            int var212 = var207;
                            int var213 = var207;
                            while (var210 > 0 && (Statics.field272[var207][var209][var210 - 1] & var203) != 0) {
                                var210--;
                            }
                            while (var211 < 104 && (Statics.field272[var207][var209][var211 + 1] & var203) != 0) {
                                var211++;
                            }
                            label673: while (var212 > 0) {
                                for (int var214 = var210; var214 <= var211; var214++) {
                                    if ((Statics.field272[var212 - 1][var209][var214] & var203) == 0) {
                                        break label673;
                                    }
                                }
                                var212--;
                            }
                            label662: while (var213 < var206) {
                                for (int var215 = var210; var215 <= var211; var215++) {
                                    if ((Statics.field272[var213 + 1][var209][var215] & var203) == 0) {
                                        break label662;
                                    }
                                }
                                var213++;
                            }
                            int var216 = (var213 + 1 - var212) * (var211 - var210 + 1);
                            if (var216 >= 8) {
                                short var217 = 240;
                                int var218 = class63.field731[var213][var209][var210] - var217;
                                int var219 = class63.field731[var212][var209][var210];
                                class138.method2744(var206, 1, var209 * 128, var209 * 128, var210 * 128, var211 * 128 + 128, var218, var219);
                                for (int var220 = var212; var220 <= var213; var220++) {
                                    for (int var221 = var210; var221 <= var211; var221++) {
                                        Statics.field272[var220][var209][var221] &= ~var203;
                                    }
                                }
                            }
                        }
                        if ((Statics.field272[var207][var209][var208] & var204) != 0) {
                            int var222 = var209;
                            int var223 = var209;
                            int var224 = var207;
                            int var225 = var207;
                            while (var222 > 0 && (Statics.field272[var207][var222 - 1][var208] & var204) != 0) {
                                var222--;
                            }
                            while (var223 < 104 && (Statics.field272[var207][var223 + 1][var208] & var204) != 0) {
                                var223++;
                            }
                            label726: while (var224 > 0) {
                                for (int var226 = var222; var226 <= var223; var226++) {
                                    if ((Statics.field272[var224 - 1][var226][var208] & var204) == 0) {
                                        break label726;
                                    }
                                }
                                var224--;
                            }
                            label715: while (var225 < var206) {
                                for (int var227 = var222; var227 <= var223; var227++) {
                                    if ((Statics.field272[var225 + 1][var227][var208] & var204) == 0) {
                                        break label715;
                                    }
                                }
                                var225++;
                            }
                            int var228 = (var225 + 1 - var224) * (var223 - var222 + 1);
                            if (var228 >= 8) {
                                short var229 = 240;
                                int var230 = class63.field731[var225][var222][var208] - var229;
                                int var231 = class63.field731[var224][var222][var208];
                                class138.method2744(var206, 2, var222 * 128, var223 * 128 + 128, var208 * 128, var208 * 128, var230, var231);
                                for (int var232 = var224; var232 <= var225; var232++) {
                                    for (int var233 = var222; var233 <= var223; var233++) {
                                        Statics.field272[var232][var233][var208] &= ~var204;
                                    }
                                }
                            }
                        }
                        if ((Statics.field272[var207][var209][var208] & var205) != 0) {
                            int var234 = var209;
                            int var235 = var209;
                            int var236 = var208;
                            int var237 = var208;
                            while (var236 > 0 && (Statics.field272[var207][var209][var236 - 1] & var205) != 0) {
                                var236--;
                            }
                            while (var237 < 104 && (Statics.field272[var207][var209][var237 + 1] & var205) != 0) {
                                var237++;
                            }
                            label779: while (var234 > 0) {
                                for (int var238 = var236; var238 <= var237; var238++) {
                                    if ((Statics.field272[var207][var234 - 1][var238] & var205) == 0) {
                                        break label779;
                                    }
                                }
                                var234--;
                            }
                            label768: while (var235 < 104) {
                                for (int var239 = var236; var239 <= var237; var239++) {
                                    if ((Statics.field272[var207][var235 + 1][var239] & var205) == 0) {
                                        break label768;
                                    }
                                }
                                var235++;
                            }
                            if ((var235 - var234 + 1) * (var237 - var236 + 1) >= 4) {
                                int var240 = class63.field731[var207][var234][var236];
                                class138.method2744(var206, 4, var234 * 128, var235 * 128 + 128, var236 * 128, var237 * 128 + 128, var240, var240);
                                for (int var241 = var234; var241 <= var235; var241++) {
                                    for (int var242 = var236; var242 <= var237; var242++) {
                                        Statics.field272[var207][var241][var242] &= ~var205;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method4840(true);
        int var243 = class63.field723;
        if (var243 > Statics.field226) {
            var243 = Statics.field226;
        }
        if (var243 < Statics.field226 - 1) {
            int var244 = Statics.field226 - 1;
        }
        if (field853) {
            Statics.field2246.method2831(class63.field723);
        } else {
            Statics.field2246.method2831(0);
        }
        for (int var245 = 0; var245 < 104; var245++) {
            for (int var246 = 0; var246 < 104; var246++) {
                method3206(var245, var246);
            }
        }
        method510();
        method5266();
        class283.field3595.method3709();
        if (Statics.field3445.method839()) {
            class185 var247 = class185.method2191(class182.field2398, field912.field1461);
            var247.field2489.method3319(1057001181);
            field912.method1999(var247);
        }
        if (!field1079) {
            int var248 = (Statics.field2207 - 6) / 8;
            int var249 = (Statics.field2207 + 6) / 8;
            int var250 = (Statics.field494 - 6) / 8;
            int var251 = (Statics.field494 + 6) / 8;
            for (int var252 = var248 - 1; var252 <= var249 + 1; var252++) {
                for (int var253 = var250 - 1; var253 <= var251 + 1; var253++) {
                    if (var252 < var248 || var252 > var249 || var253 < var250 || var253 > var251) {
                        Statics.field637.method4291("m" + var252 + "_" + var253);
                        Statics.field637.method4291("l" + var252 + "_" + var253);
                    }
                }
            }
        }
        method751(30);
        method510();
        Statics.field724 = (byte[][][]) null;
        Statics.field341 = (byte[][][]) null;
        Statics.field725 = (byte[][][]) null;
        Statics.field726 = (byte[][][]) null;
        Statics.field272 = (int[][][]) null;
        Statics.field520 = (byte[][][]) null;
        Statics.field3835 = (int[][]) null;
        Statics.field733 = null;
        Statics.field757 = null;
        Statics.field2502 = null;
        Statics.field278 = null;
        Statics.field589 = null;
        class185 var254 = class185.method2191(class182.field2453, field912.field1461);
        field912.method1999(var254);
        class60.method3011();
    }

    @ObfuscatedName("ib.hu(II)V")
    public static final void method4167(int arg0) {
        int[] var1 = Statics.field566.field3986;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class63.field721[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field2246.method2774(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class63.field721[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field2246.method2774(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field566.method5453();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class63.field721[arg0][var10][var9] & 0x18) == 0) {
                    method1730(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class63.field721[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method1730(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1115 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field2246.method2827(Statics.field226, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class283.method1732(var14).field3620;
                    if (var15 >= 0) {
                        field1016[field1115] = Statics.field2517[var15].method4468(false);
                        field1106[field1115] = var11;
                        field1088[field1115] = var12;
                        field1115++;
                    }
                }
            }
        }
        Statics.field309.method5428();
    }

    @ObfuscatedName("cv.hb(IIIIII)V")
    public static final void method1730(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2246.method2767(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2246.method2770(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field566.field3986;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class283 var13 = class283.method1732(var12);
            if (var13.field3621 == -1) {
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
                class331 var14 = Statics.field15[var13.field3621];
                if (var14 != null) {
                    int var15 = (var13.field3610 * 4 - var14.field3981) / 2;
                    int var16 = (var13.field3608 * 4 - var14.field3983) / 2;
                    var14.method5443(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3608) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2246.method2768(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2246.method2770(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class283 var22 = class283.method1732(var21);
            if (var22.field3621 != -1) {
                class331 var23 = Statics.field15[var22.field3621];
                if (var23 != null) {
                    int var24 = (var22.field3610 * 4 - var23.field3981) / 2;
                    int var25 = (var22.field3608 * 4 - var23.field3983) / 2;
                    var23.method5443(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3608) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field566.field3986;
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
        int var29 = Statics.field2246.method2827(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class283 var31 = class283.method1732(var30);
        if (var31.field3621 == -1) {
            return;
        }
        class331 var32 = Statics.field15[var31.field3621];
        if (var32 != null) {
            int var33 = (var31.field3610 * 4 - var32.field3981) / 2;
            int var34 = (var31.field3608 * 4 - var32.field3983) / 2;
            var32.method5443(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3608) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.ht(Lcq;B)Z")
    public final boolean method1202(class100 arg0) {
        class170 var2 = arg0.method2003();
        class202 var3 = arg0.field1457;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1470 == null) {
                if (arg0.field1462) {
                    if (!var2.method3103(1)) {
                        return false;
                    }
                    var2.method3106(arg0.field1457.field2563, 0, 1);
                    arg0.field1466 = 0;
                    arg0.field1462 = false;
                }
                var3.field2562 = 0;
                if (var3.method3552()) {
                    if (!var2.method3103(1)) {
                        return false;
                    }
                    var2.method3106(arg0.field1457.field2563, 1, 1);
                    arg0.field1466 = 0;
                }
                arg0.field1462 = true;
                class181[] var4 = class181.method3062();
                int var5 = var3.method3558();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field2562);
                }
                arg0.field1470 = var4[var5];
                arg0.field1464 = arg0.field1470.field2308;
            }
            if (arg0.field1464 == -1) {
                if (!var2.method3103(1)) {
                    return false;
                }
                arg0.method2003().method3106(var3.field2563, 0, 1);
                arg0.field1464 = var3.field2563[0] & 0xFF;
            }
            if (arg0.field1464 == -2) {
                if (!var2.method3103(2)) {
                    return false;
                }
                arg0.method2003().method3106(var3.field2563, 0, 2);
                var3.field2562 = 0;
                arg0.field1464 = var3.method3310();
            }
            if (!var2.method3103(arg0.field1464)) {
                return false;
            }
            var3.field2562 = 0;
            var2.method3106(var3.field2563, 0, arg0.field1464);
            arg0.field1466 = 0;
            field903.method4878();
            arg0.field1459 = arg0.field1469;
            arg0.field1469 = arg0.field1468;
            arg0.field1468 = arg0.field1470;
            if (class181.field2297 == arg0.field1470) {
                int var6 = var3.method3345();
                int var7 = var3.method3337();
                int var8 = var3.method3356();
                class243 var9 = class243.method123(var8);
                var9.field2908 = (var6 << 16) + var7;
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2306 == arg0.field1470) {
                method736(class184.field2477);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2360 == arg0.field1470) {
                method338(true, arg0.field1457);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2315 == arg0.field1470) {
                field1083 = var3.method3332();
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2288 == arg0.field1470) {
                method736(class184.field2475);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2314 == arg0.field1470) {
                boolean var10 = var3.method3315();
                if (!var10) {
                    Statics.field327 = null;
                } else if (Statics.field327 == null) {
                    Statics.field327 = new class266();
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2354 == arg0.field1470) {
                int var11 = var3.method3345();
                int var12 = var3.method3356();
                int var13 = var3.method3337();
                int var14 = var3.method3337();
                class243 var15 = class243.method123(var12);
                if (var15.field2873 != var11 || var15.field2874 != var13 || var15.field2876 != var14) {
                    var15.field2873 = var11;
                    var15.field2874 = var13;
                    var15.field2876 = var14;
                    method89(var15);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2289 == arg0.field1470) {
                method338(false, arg0.field1457);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2318 == arg0.field1470) {
                int var16 = var3.method3346();
                if (var16 == 65535) {
                    var16 = -1;
                }
                int var17 = var3.method3356();
                int var18 = var3.method3472();
                class243 var19 = class243.method123(var17);
                if (var19.field2900) {
                    var19.field2892 = var16;
                    var19.field2943 = var18;
                    class284 var21 = class284.method2027(var16);
                    var19.field2873 = var21.field3662;
                    var19.field2874 = var21.field3663;
                    var19.field2875 = var21.field3672;
                    var19.field2865 = var21.field3656;
                    var19.field2881 = var21.field3666;
                    var19.field2876 = var21.field3661;
                    if (var21.field3667 == 1) {
                        var19.field2880 = 1;
                    } else {
                        var19.field2880 = 2;
                    }
                    if (var19.field2877 > 0) {
                        var19.field2876 = var19.field2876 * 32 / var19.field2877;
                    } else if (var19.field2929 > 0) {
                        var19.field2876 = var19.field2876 * 32 / var19.field2929;
                    }
                    method89(var19);
                } else if (var16 == -1) {
                    var19.field2898 = 0;
                    arg0.field1470 = null;
                    return true;
                } else {
                    class284 var20 = class284.method2027(var16);
                    var19.field2898 = 4;
                    var19.field2866 = var16;
                    var19.field2873 = var20.field3662;
                    var19.field2874 = var20.field3663;
                    var19.field2876 = var20.field3661 * 100 / var18;
                    method89(var19);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2291 == arg0.field1470) {
                int var22 = var3.method3357();
                class243 var23 = class243.method123(var22);
                var23.field2898 = 3;
                var23.field2866 = Statics.field3435.field817.method4140();
                method89(var23);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2329 == arg0.field1470) {
                if (field888 != -1) {
                    method1799(field888, 0);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2316 == arg0.field1470) {
                int var24 = var3.method3472();
                int var25 = var3.method3310();
                if (var24 < -70000) {
                    var25 += 32768;
                }
                class243 var26;
                if (var24 >= 0) {
                    var26 = class243.method123(var24);
                } else {
                    var26 = null;
                }
                if (var26 != null) {
                    for (int var27 = 0; var27 < var26.field2940.length; var27++) {
                        var26.field2940[var27] = 0;
                        var26.field2941[var27] = 0;
                    }
                }
                class66.method2930(var25);
                int var28 = var3.method3310();
                for (int var29 = 0; var29 < var28; var29++) {
                    int var30 = var3.method3336();
                    if (var30 == 255) {
                        var30 = var3.method3355();
                    }
                    int var31 = var3.method3337();
                    if (var26 != null && var29 < var26.field2940.length) {
                        var26.field2940[var29] = var31;
                        var26.field2941[var29] = var30;
                    }
                    class66.method329(var25, var29, var31 - 1, var30);
                }
                if (var26 != null) {
                    method89(var26);
                }
                method2561();
                field1039[++field1033 - 1 & 0x1F] = var25 & 0x7FFF;
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2302 == arg0.field1470) {
                String var32 = var3.method3429();
                String var33 = class314.method1036(var3, 32767);
                String var34 = class313.method5133(class319.method127(var33));
                class96.method5053(6, var32, var34);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2278 == arg0.field1470) {
                String var35 = var3.method3429();
                long var36 = (long) var3.method3310();
                long var38 = (long) var3.method3312();
                class257 var40 = (class257) Statics.method3233(Statics.method2482(), var3.method3332());
                long var41 = (var36 << 32) + var38;
                boolean var43 = false;
                for (int var44 = 0; var44 < 100; var44++) {
                    if (field1070[var44] == var41) {
                        var43 = true;
                        break;
                    }
                }
                if (Statics.field1666.method1669(new class306(var35, Statics.field2078))) {
                    var43 = true;
                }
                if (!var43 && field1048 == 0) {
                    field1070[field1071] = var41;
                    field1071 = (field1071 + 1) % 100;
                    String var45 = class314.method1036(var3, 32767);
                    String var46 = class313.method5133(class319.method127(var45));
                    byte var47;
                    if (var40.field3342) {
                        var47 = 7;
                    } else {
                        var47 = 3;
                    }
                    if (var40.field3335 == -1) {
                        class96.method5053(var47, var35, var46);
                    } else {
                        class96.method5053(var47, class87.method4176(var40.field3335) + var35, var46);
                    }
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2333 == arg0.field1470) {
                int var48 = var3.method3332();
                if (var3.method3332() == 0) {
                    field1045[var48] = new class17();
                    var3.field2562 += 18;
                } else {
                    var3.field2562--;
                    field1045[var48] = new class17(var3, false);
                }
                field882 = field1036;
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2304 == arg0.field1470) {
                int var49 = var3.method3337();
                field888 = var49;
                this.method1371(false);
                method240(var49);
                class82.method1962(field888);
                for (int var50 = 0; var50 < 100; var50++) {
                    field1056[var50] = true;
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2355 == arg0.field1470) {
                for (int var51 = 0; var51 < field1004.length; var51++) {
                    if (field1004[var51] != null) {
                        field1004[var51].field1173 = -1;
                    }
                }
                for (int var52 = 0; var52 < field894.length; var52++) {
                    if (field894[var52] != null) {
                        field894[var52].field1173 = -1;
                    }
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2350 == arg0.field1470) {
                field1095 = true;
                Statics.field326 = var3.method3332();
                Statics.field234 = var3.method3332();
                Statics.field355 = var3.method3310();
                Statics.field3433 = var3.method3332();
                Statics.field312 = var3.method3332();
                if (Statics.field312 >= 100) {
                    int var53 = Statics.field326 * 128 + 64;
                    int var54 = Statics.field234 * 128 + 64;
                    int var55 = method79(var53, var54, Statics.field226) - Statics.field355;
                    int var56 = var53 - Statics.field2105;
                    int var57 = var55 - Statics.field1318;
                    int var58 = var54 - Statics.field2196;
                    int var59 = (int) Math.sqrt((double) (var56 * var56 + var58 * var58));
                    Statics.field322 = (int) (Math.atan2((double) var57, (double) var59) * 325.949D) & 0x7FF;
                    Statics.field457 = (int) (Math.atan2((double) var56, (double) var58) * -325.949D) & 0x7FF;
                    if (Statics.field322 < 128) {
                        Statics.field322 = 128;
                    }
                    if (Statics.field322 > 383) {
                        Statics.field322 = 383;
                    }
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2282 == arg0.field1470) {
                byte var60 = var3.method3341();
                int var61 = var3.method3346();
                class238.field2786[var61] = var60;
                if (class238.field2788[var61] != var60) {
                    class238.field2788[var61] = var60;
                }
                method1977(var61);
                field1037[++field936 - 1 & 0x1F] = var61;
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2332 == arg0.field1470) {
                String var62 = var3.method3429();
                long var63 = var3.method3381();
                long var65 = (long) var3.method3310();
                long var67 = (long) var3.method3312();
                class257 var69 = (class257) Statics.method3233(Statics.method2482(), var3.method3332());
                long var70 = (var65 << 32) + var67;
                boolean var72 = false;
                for (int var73 = 0; var73 < 100; var73++) {
                    if (field1070[var73] == var70) {
                        var72 = true;
                        break;
                    }
                }
                if (var69.field3343 && Statics.field1666.method1669(new class306(var62, Statics.field2078))) {
                    var72 = true;
                }
                if (!var72 && field1048 == 0) {
                    field1070[field1071] = var70;
                    field1071 = (field1071 + 1) % 100;
                    String var74 = class314.method1036(var3, 32767);
                    String var75 = class313.method5133(class319.method127(var74));
                    if (var69.field3335 == -1) {
                        class96.method504(9, var62, var75, class317.method2234(var63));
                    } else {
                        class96.method504(9, class87.method4176(var69.field3335) + var62, var75, class317.method2234(var63));
                    }
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2295 == arg0.field1470) {
                int var76 = var3.method3339();
                boolean var77 = var3.method3332() == 1;
                String var78 = "";
                boolean var79 = false;
                if (var77) {
                    var78 = var3.method3429();
                    if (Statics.field1666.method1669(new class306(var78, Statics.field2078))) {
                        var79 = true;
                    }
                }
                String var80 = var3.method3429();
                if (!var79) {
                    class96.method5053(var76, var78, var80);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2292 == arg0.field1470) {
                int var81 = var3.method3472();
                if (field934 != var81) {
                    field934 = var81;
                    if (field927 == 1) {
                        field935 = true;
                    }
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2357 == arg0.field1470) {
                int var82 = var3.method3337();
                int var83 = var3.method3357();
                class243 var84 = class243.method123(var83);
                if (var84.field2898 != 2 || var84.field2866 != var82) {
                    var84.field2898 = 2;
                    var84.field2866 = var82;
                    method89(var84);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2336 == arg0.field1470) {
                method2561();
                int var85 = var3.method3356();
                int var86 = var3.method3338();
                int var87 = var3.method3332();
                field876[var86] = var85;
                field984[var86] = var87;
                field985[var86] = 1;
                for (int var88 = 0; var88 < 98; var88++) {
                    if (var85 >= class249.field3008[var88]) {
                        field985[var86] = var88 + 2;
                    }
                }
                field1041[++field909 - 1 & 0x1F] = var86;
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2324 == arg0.field1470) {
                Statics.field247 = class321.method527(var3.method3332());
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2303 == arg0.field1470) {
                int var89 = var3.method3337();
                if (var89 == 65535) {
                    var89 = -1;
                }
                method684(var89);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2359 == arg0.field1470) {
                int var90 = var3.method3312();
                int var91 = var3.method3310();
                if (var91 == 65535) {
                    var91 = -1;
                }
                if (field1084 != 0 && var91 != -1) {
                    class230.method3043(Statics.field2518, var91, 0, field1084, false);
                    field1086 = true;
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2279 == arg0.field1470) {
                method2561();
                field897 = var3.method3414();
                field988 = field1036;
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2348 == arg0.field1470) {
                String var92 = var3.method3429();
                Object[] var93 = new Object[var92.length() + 1];
                for (int var94 = var92.length() - 1; var94 >= 0; var94--) {
                    if (var92.charAt(var94) == 's') {
                        var93[var94 + 1] = var3.method3429();
                    } else {
                        var93[var94 + 1] = Integer.valueOf(var3.method3472());
                    }
                }
                var93[0] = Integer.valueOf(var3.method3472());
                class69 var95 = new class69();
                var95.field786 = var93;
                class82.method1108(var95);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2356 == arg0.field1470) {
                field870 = var3.method3337() * 30;
                field988 = field1036;
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2313 == arg0.field1470) {
                boolean var96 = var3.method3332() == 1;
                if (var96) {
                    Statics.field456 = class197.method4873() - var3.method3381();
                    Statics.field519 = new class14(var3, true);
                } else {
                    Statics.field519 = null;
                }
                field1047 = field1036;
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2293 == arg0.field1470) {
                boolean var97 = var3.method3376() == 1;
                int var98 = var3.method3357();
                class243 var99 = class243.method123(var98);
                if (var99.field2845 != var97) {
                    var99.field2845 = var97;
                    method89(var99);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2310 == arg0.field1470) {
                Statics.field1666.method1665(var3, arg0.field1464);
                field1046 = field1036;
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2286 == arg0.field1470) {
                class94.method4872(var3, arg0.field1464);
                method167();
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2309 == arg0.field1470) {
                int var100 = var3.method3472();
                class68 var101 = (class68) field1014.method3740((long) var100);
                if (var101 != null) {
                    method3155(var101, true);
                }
                if (field1018 != null) {
                    method89(field1018);
                    field1018 = null;
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2358 == arg0.field1470) {
                Statics.field1666.field1239.method4957(var3, arg0.field1464);
                method172();
                field1046 = field1036;
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2337 == arg0.field1470) {
                int var102 = var3.method3345();
                int var103 = var3.method3356();
                class238.field2786[var102] = var103;
                if (class238.field2788[var102] != var103) {
                    class238.field2788[var102] = var103;
                }
                method1977(var102);
                field1037[++field936 - 1 & 0x1F] = var102;
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2330 == arg0.field1470) {
                method1796(false, var3);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2340 == arg0.field1470) {
                Statics.field1666.method1708();
                field1046 = field1036;
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2342 == arg0.field1470) {
                field1095 = false;
                for (int var104 = 0; var104 < 5; var104++) {
                    field861[var104] = false;
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2339 == arg0.field1470) {
                field871 = var3.method3332();
                if (field871 == 1) {
                    field872 = var3.method3310();
                }
                if (field871 >= 2 && field871 <= 6) {
                    if (field871 == 2) {
                        field877 = 64;
                        field878 = 64;
                    }
                    if (field871 == 3) {
                        field877 = 0;
                        field878 = 64;
                    }
                    if (field871 == 4) {
                        field877 = 128;
                        field878 = 64;
                    }
                    if (field871 == 5) {
                        field877 = 64;
                        field878 = 0;
                    }
                    if (field871 == 6) {
                        field877 = 64;
                        field878 = 128;
                    }
                    field871 = 2;
                    field1118 = var3.method3310();
                    field875 = var3.method3310();
                    field1120 = var3.method3332();
                }
                if (field871 == 10) {
                    field978 = var3.method3310();
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2325 == arg0.field1470) {
                method736(class184.field2483);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2320 == arg0.field1470) {
                int var105 = var3.method3310();
                int var106 = var3.method3472();
                class243 var107 = class243.method123(var106);
                if (var107.field2898 != 1 || var107.field2866 != var105) {
                    var107.field2898 = 1;
                    var107.field2866 = var105;
                    method89(var107);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2321 == arg0.field1470) {
                method2739(var3.method3429());
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2296 == arg0.field1470) {
                method736(class184.field2485);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2312 == arg0.field1470) {
                method736(class184.field2476);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2290 == arg0.field1470) {
                int var108 = var3.method3356();
                class243 var109 = class243.method123(var108);
                for (int var110 = 0; var110 < var109.field2940.length; var110++) {
                    var109.field2940[var110] = -1;
                    var109.field2940[var110] = 0;
                }
                method89(var109);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2307 == arg0.field1470) {
                method1796(true, var3);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2353 == arg0.field1470) {
                int var111 = var3.method3336();
                String var112 = var3.method3429();
                int var113 = var3.method3336();
                if (var111 >= 1 && var111 <= 8) {
                    if (var112.equalsIgnoreCase(class252.field3028)) {
                        var112 = null;
                    }
                    field976[var111 - 1] = var112;
                    field950[var111 - 1] = var113 == 0;
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2311 == arg0.field1470) {
                int var114 = var3.method3332();
                field927 = var114;
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2363 == arg0.field1470) {
                method736(class184.field2486);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2328 == arg0.field1470) {
                if (Statics.field2474 != null) {
                    Statics.field2474.method5103(var3);
                }
                field892 = field1036;
                Statics.field362 = true;
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2344 == arg0.field1470) {
                class327.method3030(var3, arg0.field1464);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2361 == arg0.field1470) {
                Statics.field3478 = var3.method3338();
                Statics.field2364 = var3.method3332();
                while (var3.field2562 < arg0.field1464) {
                    int var115 = var3.method3332();
                    class184[] var116 = new class184[] { class184.field2476, class184.field2485, class184.field2477, class184.field2478, class184.field2486, class184.field2479, class184.field2481, class184.field2475, class184.field2483, class184.field2484 };
                    class184 var117 = var116[var115];
                    method736(var117);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2352 == arg0.field1470) {
                field1023 = var3.method3332();
                if (field1023 == 255) {
                    field1023 = 0;
                }
                field1082 = var3.method3332();
                if (field1082 == 255) {
                    field1082 = 0;
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2338 == arg0.field1470) {
                int var118 = var3.method3310();
                int var119 = var3.method3332();
                int var120 = var3.method3310();
                if (field1087 != 0 && var119 != 0 && field957 < 50) {
                    field1098[field957] = var118;
                    field1091[field957] = var119;
                    field1092[field957] = var120;
                    field858[field957] = null;
                    field1013[field957] = 0;
                    field957++;
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2280 == arg0.field1470) {
                class78 var124 = new class78();
                var124.field1221 = var3.method3429();
                var124.field1215 = var3.method3310();
                int var125 = var3.method3472();
                var124.field1208 = var125;
                method751(45);
                var2.method3108();
                Object var126 = null;
                class91.method523(var124);
                arg0.field1470 = null;
                return false;
            }
            if (class181.field2341 == arg0.field1470) {
                method736(class184.field2478);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2298 == arg0.field1470) {
                int var127 = var3.method3332();
                int var128 = var3.method3332();
                int var129 = var3.method3332();
                int var130 = var3.method3332();
                field861[var127] = true;
                field1044[var127] = var128;
                field967[var127] = var129;
                field992[var127] = var130;
                field1100[var127] = 0;
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2301 == arg0.field1470) {
                int var131 = var3.method3472();
                int var132 = var3.method3310();
                if (var131 < -70000) {
                    var132 += 32768;
                }
                class243 var133;
                if (var131 >= 0) {
                    var133 = class243.method123(var131);
                } else {
                    var133 = null;
                }
                while (var3.field2562 < arg0.field1464) {
                    int var134 = var3.method3339();
                    int var135 = var3.method3310();
                    int var136 = 0;
                    if (var135 != 0) {
                        var136 = var3.method3332();
                        if (var136 == 255) {
                            var136 = var3.method3472();
                        }
                    }
                    if (var133 != null && var134 >= 0 && var134 < var133.field2940.length) {
                        var133.field2940[var134] = var135;
                        var133.field2941[var134] = var136;
                    }
                    class66.method329(var132, var134, var135 - 1, var136);
                }
                if (var133 != null) {
                    method89(var133);
                }
                method2561();
                field1039[++field1033 - 1 & 0x1F] = var132 & 0x7FFF;
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2347 == arg0.field1470) {
                method736(class184.field2479);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2294 == arg0.field1470) {
                if (arg0.field1464 == 0) {
                    Statics.field2474 = null;
                } else {
                    if (Statics.field2474 == null) {
                        Statics.field2474 = new class308(Statics.field2078, Statics.field3445);
                    }
                    Statics.field2474.method5091(var3);
                }
                field892 = field1036;
                Statics.field362 = true;
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2300 == arg0.field1470) {
                int var137 = var3.method3472();
                int var138 = var3.method3346();
                if (var138 == 65535) {
                    var138 = -1;
                }
                int var139 = var3.method3310();
                if (var139 == 65535) {
                    var139 = -1;
                }
                int var140 = var3.method3357();
                for (int var141 = var138; var141 <= var139; var141++) {
                    long var142 = ((long) var140 << 32) + (long) var141;
                    class217 var144 = field1021.method3740(var142);
                    if (var144 != null) {
                        var144.method3796();
                    }
                    field1021.method3741(new class224(var137), var142);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2331 == arg0.field1470) {
                Statics.field3478 = var3.method3336();
                Statics.field2364 = var3.method3338();
                for (int var145 = Statics.field2364; var145 < Statics.field2364 + 8; var145++) {
                    for (int var146 = Statics.field3478; var146 < Statics.field3478 + 8; var146++) {
                        if (field980[Statics.field226][var145][var146] != null) {
                            field980[Statics.field226][var145][var146] = null;
                            method3206(var145, var146);
                        }
                    }
                }
                for (class75 var147 = (class75) field981.method3809(); var147 != null; var147 = (class75) field981.method3832()) {
                    if (var147.field1128 >= Statics.field2364 && var147.field1128 < Statics.field2364 + 8 && var147.field1130 >= Statics.field3478 && var147.field1130 < Statics.field3478 + 8 && Statics.field226 == var147.field1134) {
                        var147.field1138 = 0;
                    }
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2283 == arg0.field1470) {
                int var148 = var3.method3472();
                int var149 = var3.method3472();
                int var150 = class60.method544();
                class185 var151 = class185.method2191(class182.field2389, field912.field1461);
                var151.field2489.method3380(field677);
                var151.field2489.method3363(var150);
                var151.field2489.method3353(var148);
                var151.field2489.method3446(var149);
                field912.method1999(var151);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2299 == arg0.field1470) {
                int var152 = var3.method3357();
                int var153 = var3.method3337();
                int var154 = var153 >> 10 & 0x1F;
                int var155 = var153 >> 5 & 0x1F;
                int var156 = var153 & 0x1F;
                int var157 = (var156 << 3) + (var154 << 19) + (var155 << 11);
                class243 var158 = class243.method123(var152);
                if (var158.field2847 != var157) {
                    var158.field2847 = var157;
                    method89(var158);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2351 == arg0.field1470) {
                method736(class184.field2484);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2345 == arg0.field1470) {
                int var159 = var3.method3346();
                class66.method4094(var159);
                field1039[++field1033 - 1 & 0x1F] = var159 & 0x7FFF;
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2285 == arg0.field1470) {
                method2();
                arg0.field1470 = null;
                return false;
            }
            if (class181.field2319 == arg0.field1470) {
                for (int var160 = 0; var160 < Statics.field3447; var160++) {
                    class269 var161 = class269.method1109(var160);
                    if (var161 != null) {
                        class238.field2786[var160] = 0;
                        class238.field2788[var160] = 0;
                    }
                }
                method2561();
                field936 += 32;
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2317 == arg0.field1470) {
                int var162 = var3.method3346();
                int var163 = var3.method3356();
                class243 var164 = class243.method123(var163);
                if (var164 != null && var164.field2824 == 0) {
                    if (var162 > var164.field2846 - var164.field2838) {
                        var162 = var164.field2846 - var164.field2838;
                    }
                    if (var162 < 0) {
                        var162 = 0;
                    }
                    if (var164.field2844 != var162) {
                        var164.field2844 = var162;
                        method89(var164);
                    }
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2287 == arg0.field1470) {
                String var165 = var3.method3429();
                int var166 = var3.method3357();
                class243 var167 = class243.method123(var166);
                if (!var165.equals(var167.field2810)) {
                    var167.field2810 = var165;
                    method89(var167);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2323 == arg0.field1470) {
                field1067 = var3.method3336();
                field1068 = var3.method3376();
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2334 == arg0.field1470) {
                var3.field2562 += 28;
                if (var3.method3333()) {
                    method3269(var3, var3.field2562 - 28);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2281 == arg0.field1470) {
                field1095 = true;
                Statics.field591 = var3.method3332();
                Statics.field316 = var3.method3332();
                Statics.field1225 = var3.method3310();
                Statics.field3432 = var3.method3332();
                Statics.field743 = var3.method3332();
                if (Statics.field743 >= 100) {
                    Statics.field2105 = Statics.field591 * 128 + 64;
                    Statics.field2196 = Statics.field316 * 128 + 64;
                    Statics.field1318 = method79(Statics.field2105, Statics.field2196, Statics.field226) - Statics.field1225;
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2327 == arg0.field1470) {
                int var168 = var3.method3350();
                int var169 = var3.method3348();
                int var170 = var3.method3357();
                class243 var171 = class243.method123(var170);
                if (var171.field2878 != var169 || var171.field2832 != var168 || var171.field2827 != 0 || var171.field2828 != 0) {
                    var171.field2878 = var169;
                    var171.field2832 = var168;
                    var171.field2827 = 0;
                    var171.field2828 = 0;
                    method89(var171);
                    this.method1192(var171);
                    if (var171.field2824 == 0) {
                        method337(Statics.field2503[var170 >> 16], var171, false);
                    }
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2305 == arg0.field1470) {
                method2561();
                field1007 = var3.method3332();
                field988 = field1036;
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2349 == arg0.field1470) {
                for (int var172 = 0; var172 < class238.field2788.length; var172++) {
                    if (class238.field2788[var172] != class238.field2786[var172]) {
                        class238.field2788[var172] = class238.field2786[var172];
                        method1977(var172);
                        field1037[++field936 - 1 & 0x1F] = var172;
                    }
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2346 == arg0.field1470) {
                method736(class184.field2481);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2326 == arg0.field1470) {
                int var173 = var3.method3355();
                int var174 = var3.method3349();
                class243 var175 = class243.method123(var173);
                if (var175.field2869 != var174 || var174 == -1) {
                    var175.field2869 = var174;
                    var175.field2944 = 0;
                    var175.field2897 = 0;
                    method89(var175);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2335 == arg0.field1470) {
                int var176 = var3.method3336();
                int var177 = var3.method3337();
                int var178 = var3.method3357();
                class68 var179 = (class68) field1014.method3740((long) var178);
                if (var179 != null) {
                    method3155(var179, var179.field774 != var177);
                }
                method181(var178, var177, var176);
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2284 == arg0.field1470) {
                Statics.field3478 = var3.method3338();
                Statics.field2364 = var3.method3338();
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2343 == arg0.field1470) {
                int var180 = var3.method3356();
                int var181 = var3.method3357();
                class68 var182 = (class68) field1014.method3740((long) var180);
                class68 var183 = (class68) field1014.method3740((long) var181);
                if (var183 != null) {
                    method3155(var183, var182 == null || var182.field774 != var183.field774);
                }
                if (var182 != null) {
                    var182.method3796();
                    field1014.method3741(var182, (long) var181);
                }
                class243 var184 = class243.method123(var180);
                if (var184 != null) {
                    method89(var184);
                }
                class243 var185 = class243.method123(var181);
                if (var185 != null) {
                    method89(var185);
                    method337(Statics.field2503[var185.field2822 >>> 16], var185, true);
                }
                if (field888 != -1) {
                    method1799(field888, 1);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class181.field2322 == arg0.field1470) {
                int var186 = arg0.field1464 + var3.field2562;
                int var187 = var3.method3310();
                int var188 = var3.method3310();
                if (field888 != var187) {
                    field888 = var187;
                    this.method1371(false);
                    method240(field888);
                    class82.method1962(field888);
                    for (int var189 = 0; var189 < 100; var189++) {
                        field1056[var189] = true;
                    }
                }
                while (var188-- > 0) {
                    int var190 = var3.method3472();
                    int var191 = var3.method3310();
                    int var192 = var3.method3332();
                    class68 var193 = (class68) field1014.method3740((long) var190);
                    if (var193 != null && var193.field774 != var191) {
                        method3155(var193, true);
                        var193 = null;
                    }
                    if (var193 == null) {
                        var193 = method181(var190, var191, var192);
                    }
                    var193.field770 = true;
                }
                for (class68 var194 = (class68) field1014.method3749(); var194 != null; var194 = (class68) field1014.method3744()) {
                    if (var194.field770) {
                        var194.field770 = false;
                    } else {
                        method3155(var194, true);
                    }
                }
                field1021 = new class215(512);
                while (var3.field2562 < var186) {
                    int var195 = var3.method3472();
                    int var196 = var3.method3310();
                    int var197 = var3.method3310();
                    int var198 = var3.method3472();
                    for (int var199 = var196; var199 <= var197; var199++) {
                        long var200 = ((long) var195 << 32) + (long) var199;
                        field1021.method3741(new class224(var198), var200);
                    }
                }
                arg0.field1470 = null;
                return true;
            }
            class165.method4257("" + (arg0.field1470 == null ? -1 : arg0.field1470.field2362) + class87.field1317 + (arg0.field1469 == null ? -1 : arg0.field1469.field2362) + class87.field1317 + (arg0.field1459 == null ? -1 : arg0.field1459.field2362) + class87.field1317 + arg0.field1464, (Throwable) null);
            method2();
        } catch (IOException var206) {
            method225();
        } catch (Exception var207) {
            String var204 = "" + (arg0.field1470 == null ? -1 : arg0.field1470.field2362) + class87.field1317 + (arg0.field1469 == null ? -1 : arg0.field1469.field2362) + class87.field1317 + (arg0.field1459 == null ? -1 : arg0.field1459.field2362) + class87.field1317 + arg0.field1464 + class87.field1317 + (Statics.field2465 + Statics.field3435.field1196[0]) + class87.field1317 + (Statics.field594 + Statics.field3435.field1197[0]) + class87.field1317;
            for (int var205 = 0; var205 < arg0.field1464 && var205 < 50; var205++) {
                var204 = var204 + var3.field2563[var205] + class87.field1317;
            }
            class165.method4257(var204, var207);
            method2();
        }
        return true;
    }

    @ObfuscatedName("bq.hn(Lgd;I)V")
    public static final void method736(class184 arg0) {
        class202 var1 = field912.field1457;
        if (class184.field2485 == arg0) {
            int var2 = var1.method3346();
            int var3 = var1.method3336();
            int var4 = var1.method3332();
            int var5 = (var4 >> 4 & 0x7) + Statics.field2364;
            int var6 = (var4 & 0x7) + Statics.field3478;
            int var7 = var1.method3310();
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                int var8 = var5 * 128 + 64;
                int var9 = var6 * 128 + 64;
                class83 var10 = new class83(var7, Statics.field226, var8, var9, method79(var8, var9, Statics.field226) - var3, var2, field913);
                field983.method3829(var10);
            }
        } else if (class184.field2476 == arg0) {
            int var11 = var1.method3376();
            int var12 = (var11 >> 4 & 0x7) + Statics.field2364;
            int var13 = (var11 & 0x7) + Statics.field3478;
            int var14 = var1.method3332();
            int var15 = var14 >> 2;
            int var16 = var14 & 0x3;
            int var17 = field1110[var15];
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                method3592(Statics.field226, var12, var13, var17, -1, var15, var16, 0, -1);
            }
        } else {
            if (class184.field2483 == arg0) {
                int var18 = var1.method3336();
                int var19 = var1.method3336();
                int var20 = var19 >> 4 & 0xF;
                int var21 = var19 & 0x7;
                int var22 = var1.method3332();
                int var23 = (var22 >> 4 & 0x7) + Statics.field2364;
                int var24 = (var22 & 0x7) + Statics.field3478;
                int var25 = var1.method3346();
                if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                    int var26 = var20 + 1;
                    if (Statics.field3435.field1196[0] >= var23 - var26 && Statics.field3435.field1196[0] <= var23 + var26 && Statics.field3435.field1197[0] >= var24 - var26 && Statics.field3435.field1197[0] <= var24 + var26 && field1019 != 0 && var21 > 0 && field957 < 50) {
                        field1098[field957] = var25;
                        field1091[field957] = var21;
                        field1092[field957] = var18;
                        field858[field957] = null;
                        field1013[field957] = (var23 << 16) + (var24 << 8) + var20;
                        field957++;
                    }
                }
            }
            if (class184.field2481 == arg0) {
                byte var27 = var1.method3296();
                int var28 = var1.method3345();
                int var29 = var1.method3376();
                int var30 = var29 >> 2;
                int var31 = var29 & 0x3;
                int var32 = field1110[var30];
                int var33 = var1.method3337();
                byte var34 = var1.method3296();
                byte var35 = var1.method3340();
                int var36 = var1.method3376();
                int var37 = (var36 >> 4 & 0x7) + Statics.field2364;
                int var38 = (var36 & 0x7) + Statics.field3478;
                int var39 = var1.method3337();
                int var40 = var1.method3345();
                byte var41 = var1.method3296();
                class73 var42;
                if (field969 == var33) {
                    var42 = Statics.field3435;
                } else {
                    var42 = field1004[var33];
                }
                if (var42 != null) {
                    class283 var43 = class283.method1732(var39);
                    int var44;
                    int var45;
                    if (var31 == 1 || var31 == 3) {
                        var44 = var43.field3608;
                        var45 = var43.field3610;
                    } else {
                        var44 = var43.field3610;
                        var45 = var43.field3608;
                    }
                    int var46 = (var44 >> 1) + var37;
                    int var47 = (var44 + 1 >> 1) + var37;
                    int var48 = (var45 >> 1) + var38;
                    int var49 = (var45 + 1 >> 1) + var38;
                    int[][] var50 = class63.field731[Statics.field226];
                    int var51 = var50[var46][var48] + var50[var47][var48] + var50[var46][var49] + var50[var47][var49] >> 2;
                    int var52 = (var37 << 7) + (var44 << 6);
                    int var53 = (var38 << 7) + (var45 << 6);
                    class132 var54 = var43.method4693(var30, var31, var50, var52, var51, var53);
                    if (var54 != null) {
                        method3592(Statics.field226, var37, var38, var32, -1, 0, 0, var28 + 1, var40 + 1);
                        var42.field824 = field913 + var28;
                        var42.field842 = field913 + var40;
                        var42.field825 = var54;
                        var42.field826 = var37 * 128 + var44 * 64;
                        var42.field838 = var38 * 128 + var45 * 64;
                        var42.field827 = var51;
                        if (var34 > var27) {
                            byte var55 = var34;
                            var34 = var27;
                            var27 = var55;
                        }
                        if (var35 > var41) {
                            byte var56 = var35;
                            var35 = var41;
                            var41 = var56;
                        }
                        var42.field830 = var34 + var37;
                        var42.field819 = var27 + var37;
                        var42.field831 = var35 + var38;
                        var42.field837 = var38 + var41;
                    }
                }
            }
            if (class184.field2484 == arg0) {
                int var57 = var1.method3338();
                int var58 = (var57 >> 4 & 0x7) + Statics.field2364;
                int var59 = (var57 & 0x7) + Statics.field3478;
                int var60 = var1.method3346();
                int var61 = var1.method3338();
                int var62 = var61 >> 2;
                int var63 = var61 & 0x3;
                int var64 = field1110[var62];
                if (var58 >= 0 && var59 >= 0 && var58 < 103 && var59 < 103) {
                    if (var64 == 0) {
                        class141 var65 = Statics.field2246.method2763(Statics.field226, var58, var59);
                        if (var65 != null) {
                            int var66 = var65.field2033 >> 14 & 0x7FFF;
                            if (var62 == 2) {
                                var65.field2030 = new class98(var66, 2, var63 + 4, Statics.field226, var58, var59, var60, false, var65.field2030);
                                var65.field2032 = new class98(var66, 2, var63 + 1 & 0x3, Statics.field226, var58, var59, var60, false, var65.field2032);
                            } else {
                                var65.field2030 = new class98(var66, var62, var63, Statics.field226, var58, var59, var60, false, var65.field2030);
                            }
                        }
                    }
                    if (var64 == 1) {
                        class146 var67 = Statics.field2246.method2764(Statics.field226, var58, var59);
                        if (var67 != null) {
                            int var68 = var67.field2069 >> 14 & 0x7FFF;
                            if (var62 == 4 || var62 == 5) {
                                var67.field2070 = new class98(var68, 4, var63, Statics.field226, var58, var59, var60, false, var67.field2070);
                            } else if (var62 == 6) {
                                var67.field2070 = new class98(var68, 4, var63 + 4, Statics.field226, var58, var59, var60, false, var67.field2070);
                            } else if (var62 == 7) {
                                var67.field2070 = new class98(var68, 4, (var63 + 2 & 0x3) + 4, Statics.field226, var58, var59, var60, false, var67.field2070);
                            } else if (var62 == 8) {
                                var67.field2070 = new class98(var68, 4, var63 + 4, Statics.field226, var58, var59, var60, false, var67.field2070);
                                var67.field2075 = new class98(var68, 4, (var63 + 2 & 0x3) + 4, Statics.field226, var58, var59, var60, false, var67.field2075);
                            }
                        }
                    }
                    if (var64 == 2) {
                        class147 var69 = Statics.field2246.method2765(Statics.field226, var58, var59);
                        if (var62 == 11) {
                            var62 = 10;
                        }
                        if (var69 != null) {
                            var69.field2082 = new class98(var69.field2092 >> 14 & 0x7FFF, var62, var63, Statics.field226, var58, var59, var60, false, var69.field2082);
                        }
                    }
                    if (var64 == 3) {
                        class128 var70 = Statics.field2246.method2803(Statics.field226, var58, var59);
                        if (var70 != null) {
                            var70.field1768 = new class98(var70.field1771 >> 14 & 0x7FFF, 22, var63, Statics.field226, var58, var59, var60, false, var70.field1768);
                        }
                    }
                }
            } else if (class184.field2479 == arg0) {
                int var71 = var1.method3310();
                int var72 = var1.method3376();
                int var73 = (var72 >> 4 & 0x7) + Statics.field2364;
                int var74 = (var72 & 0x7) + Statics.field3478;
                int var75 = var1.method3336();
                int var76 = var75 >> 2;
                int var77 = var75 & 0x3;
                int var78 = field1110[var76];
                if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                    method3592(Statics.field226, var73, var74, var78, var71, var76, var77, 0, -1);
                }
            } else if (class184.field2478 == arg0) {
                int var79 = var1.method3345();
                int var80 = var1.method3337();
                int var81 = var1.method3345();
                int var82 = var1.method3338();
                int var83 = (var82 >> 4 & 0x7) + Statics.field2364;
                int var84 = (var82 & 0x7) + Statics.field3478;
                if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                    class218 var85 = field980[Statics.field226][var83][var84];
                    if (var85 != null) {
                        for (class93 var86 = (class93) var85.method3809(); var86 != null; var86 = (class93) var85.method3832()) {
                            if ((var79 & 0x7FFF) == var86.field1401 && var86.field1400 == var80) {
                                var86.field1400 = var81;
                                break;
                            }
                        }
                        method3206(var83, var84);
                    }
                }
            } else if (class184.field2477 == arg0) {
                int var87 = var1.method3376();
                int var88 = var1.method3345();
                int var89 = var1.method3348();
                int var90 = var1.method3332() * 4;
                int var91 = var1.method3338() * 4;
                int var92 = var1.method3310();
                int var93 = var1.method3376();
                int var94 = var1.method3345();
                byte var95 = var1.method3296();
                byte var96 = var1.method3341();
                int var97 = var1.method3338();
                int var98 = (var97 >> 4 & 0x7) + Statics.field2364;
                int var99 = (var97 & 0x7) + Statics.field3478;
                int var100 = var95 + var98;
                int var101 = var96 + var99;
                if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var92 != 65535) {
                    int var102 = var98 * 128 + 64;
                    int var103 = var99 * 128 + 64;
                    int var104 = var100 * 128 + 64;
                    int var105 = var101 * 128 + 64;
                    class92 var106 = new class92(var92, Statics.field226, var102, var103, method79(var102, var103, Statics.field226) - var90, field913 + var94, field913 + var88, var87, var93, var89, var91);
                    var106.method1879(var104, var105, method79(var104, var105, Statics.field226) - var91, field913 + var94);
                    field982.method3829(var106);
                }
            } else if (class184.field2475 == arg0) {
                int var107 = var1.method3332();
                int var108 = (var107 >> 4 & 0x7) + Statics.field2364;
                int var109 = (var107 & 0x7) + Statics.field3478;
                int var110 = var1.method3310();
                if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                    class218 var111 = field980[Statics.field226][var108][var109];
                    if (var111 != null) {
                        for (class93 var112 = (class93) var111.method3809(); var112 != null; var112 = (class93) var111.method3832()) {
                            if ((var110 & 0x7FFF) == var112.field1401) {
                                var112.method3796();
                                break;
                            }
                        }
                        if (var111.method3809() == null) {
                            field980[Statics.field226][var108][var109] = null;
                        }
                        method3206(var108, var109);
                    }
                }
            } else if (class184.field2486 == arg0) {
                int var113 = var1.method3346();
                int var114 = var1.method3346();
                int var115 = var1.method3336();
                int var116 = (var115 >> 4 & 0x7) + Statics.field2364;
                int var117 = (var115 & 0x7) + Statics.field3478;
                if (var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104) {
                    class93 var118 = new class93();
                    var118.field1401 = var113;
                    var118.field1400 = var114;
                    if (field980[Statics.field226][var116][var117] == null) {
                        field980[Statics.field226][var116][var117] = new class218();
                    }
                    field980[Statics.field226][var116][var117].method3829(var118);
                    method3206(var116, var117);
                }
            }
        }
    }

    @ObfuscatedName("gl.hf(IIIIIIIIII)V")
    public static final void method3592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class75 var9 = null;
        for (class75 var10 = (class75) field981.method3809(); var10 != null; var10 = (class75) field981.method3832()) {
            if (var10.field1134 == arg0 && var10.field1128 == arg1 && var10.field1130 == arg2 && var10.field1139 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class75();
            var9.field1134 = arg0;
            var9.field1139 = arg3;
            var9.field1128 = arg1;
            var9.field1130 = arg2;
            method158(var9);
            field981.method3829(var9);
        }
        var9.field1127 = arg4;
        var9.field1136 = arg5;
        var9.field1132 = arg6;
        var9.field1137 = arg7;
        var9.field1138 = arg8;
    }

    @ObfuscatedName("ld.hl(I)V")
    public static final void method5266() {
        for (class75 var0 = (class75) field981.method3809(); var0 != null; var0 = (class75) field981.method3832()) {
            if (var0.field1138 == -1) {
                var0.field1137 = 0;
                method158(var0);
            } else {
                var0.method3796();
            }
        }
    }

    @ObfuscatedName("m.hm(Lbe;I)V")
    public static final void method158(class75 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1139 == 0) {
            var1 = Statics.field2246.method2767(arg0.field1134, arg0.field1128, arg0.field1130);
        }
        if (arg0.field1139 == 1) {
            var1 = Statics.field2246.method2861(arg0.field1134, arg0.field1128, arg0.field1130);
        }
        if (arg0.field1139 == 2) {
            var1 = Statics.field2246.method2768(arg0.field1134, arg0.field1128, arg0.field1130);
        }
        if (arg0.field1139 == 3) {
            var1 = Statics.field2246.method2827(arg0.field1134, arg0.field1128, arg0.field1130);
        }
        if (var1 != 0) {
            int var5 = Statics.field2246.method2770(arg0.field1134, arg0.field1128, arg0.field1130, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1131 = var2;
        arg0.field1133 = var3;
        arg0.field1129 = var4;
    }

    @ObfuscatedName("at.hv(B)V")
    public static final void method598() {
        for (class75 var0 = (class75) field981.method3809(); var0 != null; var0 = (class75) field981.method3832()) {
            if (var0.field1138 > 0) {
                var0.field1138--;
            }
            if (var0.field1138 == 0) {
                if (var0.field1131 >= 0) {
                    int var1 = var0.field1131;
                    int var2 = var0.field1133;
                    class283 var3 = class283.method1732(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method4690(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method1661(var0.field1134, var0.field1139, var0.field1128, var0.field1130, var0.field1131, var0.field1129, var0.field1133);
                var0.method3796();
            } else {
                if (var0.field1137 > 0) {
                    var0.field1137--;
                }
                if (var0.field1137 == 0 && var0.field1128 >= 1 && var0.field1130 >= 1 && var0.field1128 <= 102 && var0.field1130 <= 102) {
                    if (var0.field1127 >= 0) {
                        int var5 = var0.field1127;
                        int var6 = var0.field1136;
                        class283 var7 = class283.method1732(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method4690(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method1661(var0.field1134, var0.field1139, var0.field1128, var0.field1130, var0.field1127, var0.field1132, var0.field1136);
                    var0.field1137 = -1;
                    if (var0.field1131 == var0.field1127 && var0.field1131 == -1) {
                        var0.method3796();
                    } else if (var0.field1131 == var0.field1127 && var0.field1132 == var0.field1129 && var0.field1136 == var0.field1133) {
                        var0.method3796();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ce.hp(IIIIIIII)V")
    public static final void method1661(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field853 && Statics.field226 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2246.method2767(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2246.method2861(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2246.method2768(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2246.method2827(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2246.method2770(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2246.method2821(arg0, arg2, arg3);
                class283 var15 = class283.method1732(var12);
                if (var15.field3609 != 0) {
                    field910[arg0].method3177(arg2, arg3, var13, var14, var15.field3614);
                }
            }
            if (arg1 == 1) {
                Statics.field2246.method2759(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2246.method2818(arg0, arg2, arg3);
                class283 var16 = class283.method1732(var12);
                if (var16.field3610 + arg2 > 103 || var16.field3610 + arg3 > 103 || var16.field3608 + arg2 > 103 || var16.field3608 + arg3 > 103) {
                    return;
                }
                if (var16.field3609 != 0) {
                    field910[arg0].method3184(arg2, arg3, var16.field3610, var16.field3608, var14, var16.field3614);
                }
            }
            if (arg1 == 3) {
                Statics.field2246.method2850(arg0, arg2, arg3);
                class283 var17 = class283.method1732(var12);
                if (var17.field3609 == 1) {
                    field910[arg0].method3180(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class63.field721[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class138 var19 = Statics.field2246;
        class177 var20 = field910[arg0];
        class283 var21 = class283.method1732(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field3608;
            var23 = var21.field3610;
        } else {
            var22 = var21.field3610;
            var23 = var21.field3608;
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
        int[][] var28 = class63.field731[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field3627 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field3603 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class140 var34;
            if (var21.field3632 == -1 && var21.field3633 == null) {
                var34 = var21.method4693(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class98(arg4, 22, arg5, var18, arg2, arg3, var21.field3632, true, (class140) null);
            }
            var19.method2813(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field3609 == 1) {
                var20.method3185(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class140 var57;
            if (var21.field3632 == -1 && var21.field3633 == null) {
                var57 = var21.method4693(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class98(arg4, 10, arg5, var18, arg2, arg3, var21.field3632, true, (class140) null);
            }
            if (var57 != null) {
                var19.method2751(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field3609 != 0) {
                var20.method3202(arg2, arg3, var22, var23, var21.field3614);
            }
        } else if (arg6 >= 12) {
            class140 var35;
            if (var21.field3632 == -1 && var21.field3633 == null) {
                var35 = var21.method4693(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class98(arg4, arg6, arg5, var18, arg2, arg3, var21.field3632, true, (class140) null);
            }
            var19.method2751(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field3609 != 0) {
                var20.method3202(arg2, arg3, var22, var23, var21.field3614);
            }
        } else if (arg6 == 0) {
            class140 var36;
            if (var21.field3632 == -1 && var21.field3633 == null) {
                var36 = var21.method4693(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class98(arg4, 0, arg5, var18, arg2, arg3, var21.field3632, true, (class140) null);
            }
            var19.method2749(arg0, arg2, arg3, var29, var36, (class140) null, class63.field728[arg5], 0, var32, var33);
            if (var21.field3609 != 0) {
                var20.method3175(arg2, arg3, arg6, arg5, var21.field3614);
            }
        } else if (arg6 == 1) {
            class140 var37;
            if (var21.field3632 == -1 && var21.field3633 == null) {
                var37 = var21.method4693(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class98(arg4, 1, arg5, var18, arg2, arg3, var21.field3632, true, (class140) null);
            }
            var19.method2749(arg0, arg2, arg3, var29, var37, (class140) null, class63.field729[arg5], 0, var32, var33);
            if (var21.field3609 != 0) {
                var20.method3175(arg2, arg3, arg6, arg5, var21.field3614);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class140 var39;
            class140 var40;
            if (var21.field3632 == -1 && var21.field3633 == null) {
                var39 = var21.method4693(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method4693(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class98(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field3632, true, (class140) null);
                var40 = new class98(arg4, 2, var38, var18, arg2, arg3, var21.field3632, true, (class140) null);
            }
            var19.method2749(arg0, arg2, arg3, var29, var39, var40, class63.field728[arg5], class63.field728[var38], var32, var33);
            if (var21.field3609 != 0) {
                var20.method3175(arg2, arg3, arg6, arg5, var21.field3614);
            }
        } else if (arg6 == 3) {
            class140 var41;
            if (var21.field3632 == -1 && var21.field3633 == null) {
                var41 = var21.method4693(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class98(arg4, 3, arg5, var18, arg2, arg3, var21.field3632, true, (class140) null);
            }
            var19.method2749(arg0, arg2, arg3, var29, var41, (class140) null, class63.field729[arg5], 0, var32, var33);
            if (var21.field3609 != 0) {
                var20.method3175(arg2, arg3, arg6, arg5, var21.field3614);
            }
        } else if (arg6 == 9) {
            class140 var42;
            if (var21.field3632 == -1 && var21.field3633 == null) {
                var42 = var21.method4693(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class98(arg4, arg6, arg5, var18, arg2, arg3, var21.field3632, true, (class140) null);
            }
            var19.method2751(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field3609 != 0) {
                var20.method3202(arg2, arg3, var22, var23, var21.field3614);
            }
        } else if (arg6 == 4) {
            class140 var43;
            if (var21.field3632 == -1 && var21.field3633 == null) {
                var43 = var21.method4693(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class98(arg4, 4, arg5, var18, arg2, arg3, var21.field3632, true, (class140) null);
            }
            var19.method2750(arg0, arg2, arg3, var29, var43, (class140) null, class63.field728[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method2767(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class283.method1732(var45 >> 14 & 0x7FFF).field3622;
            }
            class140 var46;
            if (var21.field3632 == -1 && var21.field3633 == null) {
                var46 = var21.method4693(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class98(arg4, 4, arg5, var18, arg2, arg3, var21.field3632, true, (class140) null);
            }
            var19.method2750(arg0, arg2, arg3, var29, var46, (class140) null, class63.field728[arg5], 0, class63.field732[arg5] * var44, class63.field722[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method2767(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class283.method1732(var48 >> 14 & 0x7FFF).field3622 / 2;
            }
            class140 var49;
            if (var21.field3632 == -1 && var21.field3633 == null) {
                var49 = var21.method4693(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class98(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3632, true, (class140) null);
            }
            var19.method2750(arg0, arg2, arg3, var29, var49, (class140) null, 256, arg5, class63.field727[arg5] * var47, class63.field730[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class140 var51;
            if (var21.field3632 == -1 && var21.field3633 == null) {
                var51 = var21.method4693(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class98(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field3632, true, (class140) null);
            }
            var19.method2750(arg0, arg2, arg3, var29, var51, (class140) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method2767(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class283.method1732(var53 >> 14 & 0x7FFF).field3622 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class140 var55;
            class140 var56;
            if (var21.field3632 == -1 && var21.field3633 == null) {
                var55 = var21.method4693(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method4693(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class98(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3632, true, (class140) null);
                var56 = new class98(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field3632, true, (class140) null);
            }
            var19.method2750(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class63.field727[arg5] * var52, class63.field730[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("ft.hq(III)V")
    public static final void method3206(int arg0, int arg1) {
        class218 var2 = field980[Statics.field226][arg0][arg1];
        if (var2 == null) {
            Statics.field2246.method2762(Statics.field226, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class93 var5 = null;
        for (class93 var6 = (class93) var2.method3809(); var6 != null; var6 = (class93) var2.method3832()) {
            class284 var7 = class284.method2027(var6.field1401);
            long var8 = (long) var7.field3668;
            if (var7.field3667 == 1) {
                var8 = (long) (var6.field1400 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2246.method2762(Statics.field226, arg0, arg1);
            return;
        }
        var2.method3805(var5);
        class93 var10 = null;
        class93 var11 = null;
        for (class93 var12 = (class93) var2.method3809(); var12 != null; var12 = (class93) var2.method3832()) {
            if (var5.field1401 != var12.field1401) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1401 != var12.field1401 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field2246.method2891(Statics.field226, arg0, arg1, method79(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field226), var5, var13, var10, var11);
    }

    @ObfuscatedName("cp.hz(ZLgl;I)V")
    public static final void method1796(boolean arg0, class202 arg1) {
        field973 = 0;
        field968 = 0;
        method229();
        while (arg1.method3590(field912.field1464) >= 27) {
            int var2 = arg1.method3562(15);
            if (var2 == 32767) {
                break;
            }
            boolean var32 = false;
            if (field894[var2] == null) {
                field894[var2] = new class85();
                var32 = true;
            }
            class85 var33 = field894[var2];
            field896[++field895 - 1] = var2;
            var33.field1184 = field913;
            int var34;
            if (arg0) {
                var34 = arg1.method3562(8);
                if (var34 > 127) {
                    var34 -= 256;
                }
            } else {
                var34 = arg1.method3562(5);
                if (var34 > 15) {
                    var34 -= 32;
                }
            }
            int var35;
            if (arg0) {
                var35 = arg1.method3562(8);
                if (var35 > 127) {
                    var35 -= 256;
                }
            } else {
                var35 = arg1.method3562(5);
                if (var35 > 15) {
                    var35 -= 32;
                }
            }
            int var36 = arg1.method3562(1);
            int var37 = arg1.method3562(1);
            if (var37 == 1) {
                field898[++field968 - 1] = var2;
            }
            var33.field1297 = Statics.method2738(arg1.method3562(14));
            int var38 = field852[arg1.method3562(3)];
            if (var32) {
                var33.field1152 = var33.field1182 = var38;
            }
            var33.field1144 = var33.field1297.field3727;
            var33.field1194 = var33.field1297.field3726;
            if (var33.field1194 == 0) {
                var33.field1182 = 0;
            }
            var33.field1149 = var33.field1297.field3719;
            var33.field1150 = var33.field1297.field3720;
            var33.field1151 = var33.field1297.field3721;
            var33.field1181 = var33.field1297.field3712;
            var33.field1146 = var33.field1297.field3733;
            var33.field1190 = var33.field1297.field3714;
            var33.field1158 = var33.field1297.field3718;
            var33.method1819(Statics.field3435.field1196[0] + var35, Statics.field3435.field1197[0] + var34, var36 == 1);
        }
        arg1.method3556();
        for (int var3 = 0; var3 < field968; var3++) {
            int var4 = field898[var3];
            class85 var5 = field894[var4];
            int var6 = arg1.method3332();
            if ((var6 & 0x8) != 0) {
                int var7 = arg1.method3337();
                int var8 = arg1.method3345();
                int var9 = var5.field1154 - (var7 - Statics.field2465 - Statics.field2465) * 64;
                int var10 = var5.field1148 - (var8 - Statics.field594 - Statics.field594) * 64;
                if (var9 != 0 || var10 != 0) {
                    var5.field1169 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                }
            }
            if ((var6 & 0x40) != 0) {
                var5.field1167 = arg1.method3310();
                if (var5.field1167 == 65535) {
                    var5.field1167 = -1;
                }
            }
            if ((var6 & 0x4) != 0) {
                int var11 = arg1.method3332();
                if (var11 > 0) {
                    for (int var12 = 0; var12 < var11; var12++) {
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = arg1.method3339();
                        if (var16 == 32767) {
                            var16 = arg1.method3339();
                            var14 = arg1.method3339();
                            var13 = arg1.method3339();
                            var15 = arg1.method3339();
                        } else if (var16 == 32766) {
                            var16 = -1;
                        } else {
                            var14 = arg1.method3339();
                        }
                        int var17 = arg1.method3339();
                        var5.method1587(var16, var14, var13, var15, field913, var17);
                    }
                }
                int var18 = arg1.method3332();
                if (var18 > 0) {
                    for (int var19 = 0; var19 < var18; var19++) {
                        int var20 = arg1.method3339();
                        int var21 = arg1.method3339();
                        if (var21 == 32767) {
                            var5.method1588(var20);
                        } else {
                            int var22 = arg1.method3339();
                            int var23 = arg1.method3332();
                            int var24 = var21 > 0 ? arg1.method3338() : var23;
                            var5.method1590(var20, field913, var21, var22, var23, var24);
                        }
                    }
                }
            }
            if ((var6 & 0x1) != 0) {
                var5.field1195 = arg1.method3429();
                var5.field1157 = 100;
            }
            if ((var6 & 0x20) != 0) {
                var5.field1142 = arg1.method3346();
                int var25 = arg1.method3472();
                var5.field1188 = var25 >> 16;
                var5.field1162 = (var25 & 0xFFFF) + field913;
                var5.field1163 = 0;
                var5.field1180 = 0;
                if (var5.field1162 > field913) {
                    var5.field1163 = -1;
                }
                if (var5.field1142 == 65535) {
                    var5.field1142 = -1;
                }
            }
            if ((var6 & 0x2) != 0) {
                var5.field1297 = Statics.method2738(arg1.method3310());
                var5.field1144 = var5.field1297.field3727;
                var5.field1194 = var5.field1297.field3726;
                var5.field1149 = var5.field1297.field3719;
                var5.field1150 = var5.field1297.field3720;
                var5.field1151 = var5.field1297.field3721;
                var5.field1181 = var5.field1297.field3712;
                var5.field1146 = var5.field1297.field3733;
                var5.field1190 = var5.field1297.field3714;
                var5.field1158 = var5.field1297.field3718;
            }
            if ((var6 & 0x10) != 0) {
                int var26 = arg1.method3345();
                if (var26 == 65535) {
                    var26 = -1;
                }
                int var27 = arg1.method3336();
                if (var5.field1173 == var26 && var26 != -1) {
                    int var28 = class288.method1825(var26).field3764;
                    if (var28 == 1) {
                        var5.field1174 = 0;
                        var5.field1141 = 0;
                        var5.field1176 = var27;
                        var5.field1177 = 0;
                    }
                    if (var28 == 2) {
                        var5.field1177 = 0;
                    }
                } else if (var26 == -1 || var5.field1173 == -1 || class288.method1825(var26).field3761 >= class288.method1825(var5.field1173).field3761) {
                    var5.field1173 = var26;
                    var5.field1174 = 0;
                    var5.field1141 = 0;
                    var5.field1176 = var27;
                    var5.field1177 = 0;
                    var5.field1179 = var5.field1199;
                }
            }
        }
        for (int var29 = 0; var29 < field973; var29++) {
            int var30 = field974[var29];
            if (field913 != field894[var30].field1184) {
                field894[var30].field1297 = null;
                field894[var30] = null;
            }
        }
        if (field912.field1464 != arg1.field2562) {
            throw new RuntimeException(arg1.field2562 + class87.field1317 + field912.field1464);
        }
        for (int var31 = 0; var31 < field895; var31++) {
            if (field894[field896[var31]] == null) {
                throw new RuntimeException(var31 + class87.field1317 + field895);
            }
        }
    }

    @ObfuscatedName("aj.hj(B)V")
    public static final void method229() {
        class202 var0 = field912.field1457;
        var0.method3559();
        int var1 = var0.method3562(8);
        if (var1 < field895) {
            for (int var2 = var1; var2 < field895; var2++) {
                field974[++field973 - 1] = field896[var2];
            }
        }
        if (var1 > field895) {
            throw new RuntimeException("");
        }
        field895 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field896[var3];
            class85 var5 = field894[var4];
            int var6 = var0.method3562(1);
            if (var6 == 0) {
                field896[++field895 - 1] = var4;
                var5.field1184 = field913;
            } else {
                int var7 = var0.method3562(2);
                if (var7 == 0) {
                    field896[++field895 - 1] = var4;
                    var5.field1184 = field913;
                    field898[++field968 - 1] = var4;
                } else if (var7 == 1) {
                    field896[++field895 - 1] = var4;
                    var5.field1184 = field913;
                    int var8 = var0.method3562(3);
                    var5.method1818(var8, (byte) 1);
                    int var9 = var0.method3562(1);
                    if (var9 == 1) {
                        field898[++field968 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field896[++field895 - 1] = var4;
                    var5.field1184 = field913;
                    int var10 = var0.method3562(3);
                    var5.method1818(var10, (byte) 2);
                    int var11 = var0.method3562(3);
                    var5.method1818(var11, (byte) 2);
                    int var12 = var0.method3562(1);
                    if (var12 == 1) {
                        field898[++field968 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field974[++field973 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("z.hw(S)V")
    public static void method7() {
        field989 = 0;
        field1000 = false;
    }

    @ObfuscatedName("fl.hy(I)V")
    public static void method3086() {
        method7();
        field1105[0] = class252.field3264;
        field995[0] = "";
        field1031[0] = 1006;
        field1089[0] = false;
        field989 = 1;
    }

    @ObfuscatedName("aw.hr(I)V")
    public static final void method693() {
        int var0 = Statics.field1428;
        int var1 = Statics.field1374;
        int var2 = Statics.field2621;
        int var3 = Statics.field686;
        int var4 = 6116423;
        class328.method5362(var0, var1, var2, var3, var4);
        class328.method5362(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class328.method5368(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field342.method5186(class252.field3174, var0 + 3, var1 + 14, var4, -1);
        int var5 = class61.field708;
        int var6 = class61.field709;
        for (int var7 = 0; var7 < field989; var7++) {
            int var8 = (field989 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field342.method5186(method3234(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field1428;
        int var11 = Statics.field1374;
        int var12 = Statics.field2621;
        int var13 = Statics.field686;
        for (int var14 = 0; var14 < field857; var14++) {
            if (field874[var14] + field1059[var14] > var10 && field1059[var14] < var10 + var12 && field1062[var14] + field1060[var14] > var11 && field1060[var14] < var11 + var13) {
                field1057[var14] = true;
            }
        }
    }

    @ObfuscatedName("m.hd(IIIIB)V")
    public static final void method166(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field857; var4++) {
            if (field874[var4] + field1059[var4] > arg0 && field1059[var4] < arg0 + arg2 && field1062[var4] + field1060[var4] > arg1 && field1060[var4] < arg1 + arg3) {
                field1056[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.he(B)V")
    public final void method1559() {
        method23();
        if (Statics.field636 != null || field1024 != null) {
            return;
        }
        int var18;
        int var20;
        int var21;
        label192: {
            int var1 = class61.field711;
            if (field1000) {
                if (var1 != 1 && (Statics.field2061 || var1 != 4)) {
                    int var2 = class61.field708;
                    int var3 = class61.field709;
                    if (var2 < Statics.field1428 - 10 || var2 > Statics.field2621 + Statics.field1428 + 10 || var3 < Statics.field1374 - 10 || var3 > Statics.field686 + Statics.field1374 + 10) {
                        field1000 = false;
                        method166(Statics.field1428, Statics.field1374, Statics.field2621, Statics.field686);
                    }
                }
                if (var1 == 1 || !Statics.field2061 && var1 == 4) {
                    int var4 = Statics.field1428;
                    int var5 = Statics.field1374;
                    int var6 = Statics.field2621;
                    int var7 = class61.field715;
                    int var8 = class61.field716;
                    int var9 = -1;
                    for (int var10 = 0; var10 < field989; var10++) {
                        int var11 = (field989 - 1 - var10) * 15 + var5 + 31;
                        if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                            var9 = var10;
                        }
                    }
                    if (var9 != -1 && var9 >= 0) {
                        int var12 = field933[var9];
                        int var13 = field991[var9];
                        int var14 = field1031[var9];
                        int var15 = field993[var9];
                        String var16 = field1105[var9];
                        String var17 = field995[var9];
                        method746(var12, var13, var14, var15, var16, var17, class61.field715, class61.field716);
                    }
                    field1000 = false;
                    method166(Statics.field1428, Statics.field1374, Statics.field2621, Statics.field686);
                }
            } else {
                var18 = method783();
                if ((var1 == 1 || !Statics.field2061 && var1 == 4) && var18 >= 0) {
                    int var19 = field1031[var18];
                    if (var19 == 39 || var19 == 40 || var19 == 41 || var19 == 42 || var19 == 43 || var19 == 33 || var19 == 34 || var19 == 35 || var19 == 36 || var19 == 37 || var19 == 38 || var19 == 1005) {
                        var20 = field933[var18];
                        var21 = field991[var18];
                        class243 var22 = class243.method123(var21);
                        if (class244.method2929(method1(var22))) {
                            break label192;
                        }
                        int var23 = method1(var22);
                        boolean var24 = (var23 >> 29 & 0x1) != 0;
                        if (var24) {
                            break label192;
                        }
                    }
                }
                if ((var1 == 1 || !Statics.field2061 && var1 == 4) && this.method1189()) {
                    var1 = 2;
                }
                if ((var1 == 1 || !Statics.field2061 && var1 == 4) && field989 > 0 && var18 >= 0) {
                    int var25 = field933[var18];
                    int var26 = field991[var18];
                    int var27 = field1031[var18];
                    int var28 = field993[var18];
                    String var29 = field1105[var18];
                    String var30 = field995[var18];
                    method746(var25, var26, var27, var28, var29, var30, class61.field715, class61.field716);
                }
                if (var1 == 2 && field989 > 0) {
                    this.method1190(class61.field715, class61.field716);
                }
            }
            return;
        }
        if (Statics.field636 != null && !field964 && field989 > 0 && !this.method1189()) {
            method1035(field961, field962);
        }
        field964 = false;
        field990 = 0;
        if (Statics.field636 != null) {
            method89(Statics.field636);
        }
        Statics.field636 = class243.method123(var21);
        field960 = var20;
        field961 = class61.field715;
        field962 = class61.field716;
        if (var18 >= 0) {
            method1839(var18);
        }
        method89(Statics.field636);
    }

    @ObfuscatedName("client.ha(I)Z")
    public final boolean method1189() {
        int var1 = method783();
        boolean var2 = field987 == 1 && field989 > 2;
        if (!var2) {
            boolean var3;
            if (var1 < 0) {
                var3 = false;
            } else {
                int var4 = field1031[var1];
                if (var4 >= 2000) {
                    var4 -= 2000;
                }
                if (var4 == 1007) {
                    var3 = true;
                } else {
                    var3 = false;
                }
            }
            var2 = var3;
        }
        return var2 && !field1089[var1];
    }

    @ObfuscatedName("client.hs(III)V")
    public final void method1190(int arg0, int arg1) {
        method785(arg0, arg1);
        Statics.field2246.method2777(Statics.field226, arg0, arg1, false);
        field1000 = true;
    }

    @ObfuscatedName("aj.hg(S)V")
    public static void method228() {
        method785(Statics.field2621 / 2 + Statics.field1428, Statics.field1374);
    }

    @ObfuscatedName("bp.ie(III)V")
    public static void method785(int arg0, int arg1) {
        int var2 = Statics.field342.method5129(class252.field3174);
        for (int var3 = 0; var3 < field989; var3++) {
            int var4 = Statics.field342.method5129(method3234(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field989 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field2039) {
            var6 = Statics.field2039 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field328) {
            var7 = Statics.field328 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field1428 = var6;
        Statics.field1374 = var7;
        Statics.field2621 = var2;
        Statics.field686 = field989 * 15 + 22;
    }

    @ObfuscatedName("d.if(Lcm;III)V")
    public static final void method62(class88 arg0, int arg1, int arg2) {
        method746(arg0.field1322, arg0.field1320, arg0.field1321, arg0.field1319, arg0.field1323, arg0.field1323, arg1, arg2);
    }

    @ObfuscatedName("bo.in(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method746(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 8) {
            class85 var8 = field894[arg3];
            if (var8 != null) {
                field1038 = arg6;
                field954 = arg7;
                field956 = 2;
                field1081 = 0;
                field1023 = arg0;
                field1082 = arg1;
                class185 var9 = class185.method2191(class182.field2402, field912.field1461);
                var9.field2489.method3342(arg3);
                var9.field2489.method3426(class52.field620[82] ? 1 : 0);
                var9.field2489.method3446(Statics.field262);
                var9.field2489.method3343(field1009);
                field912.method1999(var9);
            }
        }
        if (arg2 == 1005) {
            class243 var10 = class243.method123(arg1);
            if (var10 == null || var10.field2941[arg0] < 100000) {
                class185 var11 = class185.method2191(class182.field2449, field912.field1461);
                var11.field2489.method3343(arg3);
                field912.method1999(var11);
            } else {
                class96.method5053(27, "", var10.field2941[arg0] + " x " + class284.method2027(arg3).field3692);
            }
            field865 = 0;
            Statics.field242 = class243.method123(arg1);
            field959 = arg0;
        }
        if (arg2 == 11) {
            class85 var12 = field894[arg3];
            if (var12 != null) {
                field1038 = arg6;
                field954 = arg7;
                field956 = 2;
                field1081 = 0;
                field1023 = arg0;
                field1082 = arg1;
                class185 var13 = class185.method2191(class182.field2396, field912.field1461);
                var13.field2489.method3342(arg3);
                var13.field2489.method3334(class52.field620[82] ? 1 : 0);
                field912.method1999(var13);
            }
        }
        if (arg2 == 9) {
            class85 var14 = field894[arg3];
            if (var14 != null) {
                field1038 = arg6;
                field954 = arg7;
                field956 = 2;
                field1081 = 0;
                field1023 = arg0;
                field1082 = arg1;
                class185 var15 = class185.method2191(class182.field2421, field912.field1461);
                var15.field2489.method3334(class52.field620[82] ? 1 : 0);
                var15.field2489.method3343(arg3);
                field912.method1999(var15);
            }
        }
        if (arg2 == 16) {
            field1038 = arg6;
            field954 = arg7;
            field956 = 2;
            field1081 = 0;
            field1023 = arg0;
            field1082 = arg1;
            class185 var16 = class185.method2191(class182.field2433, field912.field1461);
            var16.field2489.method3476(arg3);
            var16.field2489.method3342(Statics.field2147);
            var16.field2489.method3446(Statics.field1006);
            var16.field2489.method3342(Statics.field594 + arg1);
            var16.field2489.method3342(Statics.field2465 + arg0);
            var16.field2489.method3426(class52.field620[82] ? 1 : 0);
            var16.field2489.method3343(Statics.field2959);
            field912.method1999(var16);
        }
        if (arg2 == 6) {
            field1038 = arg6;
            field954 = arg7;
            field956 = 2;
            field1081 = 0;
            field1023 = arg0;
            field1082 = arg1;
            class185 var17 = class185.method2191(class182.field2451, field912.field1461);
            var17.field2489.method3363(class52.field620[82] ? 1 : 0);
            var17.field2489.method3476(Statics.field2465 + arg0);
            var17.field2489.method3342(Statics.field594 + arg1);
            var17.field2489.method3344(arg3 >> 14 & 0x7FFF);
            field912.method1999(var17);
        }
        if (arg2 == 44) {
            class73 var18 = field1004[arg3];
            if (var18 != null) {
                field1038 = arg6;
                field954 = arg7;
                field956 = 2;
                field1081 = 0;
                field1023 = arg0;
                field1082 = arg1;
                class185 var19 = class185.method2191(class182.field2430, field912.field1461);
                var19.field2489.method3476(arg3);
                var19.field2489.method3380(class52.field620[82] ? 1 : 0);
                field912.method1999(var19);
            }
        }
        if (arg2 == 45) {
            class73 var20 = field1004[arg3];
            if (var20 != null) {
                field1038 = arg6;
                field954 = arg7;
                field956 = 2;
                field1081 = 0;
                field1023 = arg0;
                field1082 = arg1;
                class185 var21 = class185.method2191(class182.field2445, field912.field1461);
                var21.field2489.method3334(class52.field620[82] ? 1 : 0);
                var21.field2489.method3342(arg3);
                field912.method1999(var21);
            }
        }
        if (arg2 == 34) {
            class185 var22 = class185.method2191(class182.field2460, field912.field1461);
            var22.field2489.method3319(arg1);
            var22.field2489.method3343(arg0);
            var22.field2489.method3476(arg3);
            field912.method1999(var22);
            field865 = 0;
            Statics.field242 = class243.method123(arg1);
            field959 = arg0;
        }
        if (arg2 == 7) {
            class85 var23 = field894[arg3];
            if (var23 != null) {
                field1038 = arg6;
                field954 = arg7;
                field956 = 2;
                field1081 = 0;
                field1023 = arg0;
                field1082 = arg1;
                class185 var24 = class185.method2191(class182.field2407, field912.field1461);
                var24.field2489.method3344(Statics.field2959);
                var24.field2489.method3344(arg3);
                var24.field2489.method3342(Statics.field2147);
                var24.field2489.method3354(Statics.field1006);
                var24.field2489.method3334(class52.field620[82] ? 1 : 0);
                field912.method1999(var24);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field2585.method5618(arg2, arg3, new class239(arg0), new class239(arg1));
        }
        if (arg2 == 15) {
            class73 var25 = field1004[arg3];
            if (var25 != null) {
                field1038 = arg6;
                field954 = arg7;
                field956 = 2;
                field1081 = 0;
                field1023 = arg0;
                field1082 = arg1;
                class185 var26 = class185.method2191(class182.field2431, field912.field1461);
                var26.field2489.method3476(field1009);
                var26.field2489.method3426(class52.field620[82] ? 1 : 0);
                var26.field2489.method3354(Statics.field262);
                var26.field2489.method3476(arg3);
                field912.method1999(var26);
            }
        }
        if (arg2 == 1002) {
            field1038 = arg6;
            field954 = arg7;
            field956 = 2;
            field1081 = 0;
            class185 var27 = class185.method2191(class182.field2440, field912.field1461);
            var27.field2489.method3343(arg3 >> 14 & 0x7FFF);
            field912.method1999(var27);
        }
        if (arg2 == 12) {
            class85 var28 = field894[arg3];
            if (var28 != null) {
                field1038 = arg6;
                field954 = arg7;
                field956 = 2;
                field1081 = 0;
                field1023 = arg0;
                field1082 = arg1;
                class185 var29 = class185.method2191(class182.field2418, field912.field1461);
                var29.field2489.method3344(arg3);
                var29.field2489.method3363(class52.field620[82] ? 1 : 0);
                field912.method1999(var29);
            }
        }
        if (arg2 == 40) {
            class185 var30 = class185.method2191(class182.field2415, field912.field1461);
            var30.field2489.method3342(arg0);
            var30.field2489.method3344(arg3);
            var30.field2489.method3446(arg1);
            field912.method1999(var30);
            field865 = 0;
            Statics.field242 = class243.method123(arg1);
            field959 = arg0;
        }
        if (arg2 == 2) {
            field1038 = arg6;
            field954 = arg7;
            field956 = 2;
            field1081 = 0;
            field1023 = arg0;
            field1082 = arg1;
            class185 var31 = class185.method2191(class182.field2383, field912.field1461);
            var31.field2489.method3426(class52.field620[82] ? 1 : 0);
            var31.field2489.method3476(arg3 >> 14 & 0x7FFF);
            var31.field2489.method3476(Statics.field594 + arg1);
            var31.field2489.method3354(Statics.field262);
            var31.field2489.method3342(Statics.field2465 + arg0);
            var31.field2489.method3344(field1009);
            field912.method1999(var31);
        }
        if (arg2 == 47) {
            class73 var32 = field1004[arg3];
            if (var32 != null) {
                field1038 = arg6;
                field954 = arg7;
                field956 = 2;
                field1081 = 0;
                field1023 = arg0;
                field1082 = arg1;
                class185 var33 = class185.method2191(class182.field2382, field912.field1461);
                var33.field2489.method3380(class52.field620[82] ? 1 : 0);
                var33.field2489.method3343(arg3);
                field912.method1999(var33);
            }
        }
        if (arg2 == 1003) {
            field1038 = arg6;
            field954 = arg7;
            field956 = 2;
            field1081 = 0;
            class85 var34 = field894[arg3];
            if (var34 != null) {
                class286 var35 = var34.field1297;
                if (var35.field3723 != null) {
                    var35 = var35.method4806();
                }
                if (var35 != null) {
                    class185 var36 = class185.method2191(class182.field2368, field912.field1461);
                    var36.field2489.method3476(var35.field3737);
                    field912.method1999(var36);
                }
            }
        }
        if (arg2 == 1001) {
            field1038 = arg6;
            field954 = arg7;
            field956 = 2;
            field1081 = 0;
            field1023 = arg0;
            field1082 = arg1;
            class185 var37 = class185.method2191(class182.field2435, field912.field1461);
            var37.field2489.method3342(Statics.field594 + arg1);
            var37.field2489.method3476(arg3 >> 14 & 0x7FFF);
            var37.field2489.method3426(class52.field620[82] ? 1 : 0);
            var37.field2489.method3342(Statics.field2465 + arg0);
            field912.method1999(var37);
        }
        if (arg2 == 37) {
            class185 var38 = class185.method2191(class182.field2392, field912.field1461);
            var38.field2489.method3344(arg3);
            var38.field2489.method3344(arg0);
            var38.field2489.method3353(arg1);
            field912.method1999(var38);
            field865 = 0;
            Statics.field242 = class243.method123(arg1);
            field959 = arg0;
        }
        if (arg2 == 49) {
            class73 var39 = field1004[arg3];
            if (var39 != null) {
                field1038 = arg6;
                field954 = arg7;
                field956 = 2;
                field1081 = 0;
                field1023 = arg0;
                field1082 = arg1;
                class185 var40 = class185.method2191(class182.field2376, field912.field1461);
                var40.field2489.method3476(arg3);
                var40.field2489.method3334(class52.field620[82] ? 1 : 0);
                field912.method1999(var40);
            }
        }
        if (arg2 == 22) {
            field1038 = arg6;
            field954 = arg7;
            field956 = 2;
            field1081 = 0;
            field1023 = arg0;
            field1082 = arg1;
            class185 var41 = class185.method2191(class182.field2414, field912.field1461);
            var41.field2489.method3342(Statics.field2465 + arg0);
            var41.field2489.method3334(class52.field620[82] ? 1 : 0);
            var41.field2489.method3476(Statics.field594 + arg1);
            var41.field2489.method3343(arg3);
            field912.method1999(var41);
        }
        if (arg2 == 58) {
            class243 var42 = class243.method590(arg1, arg0);
            if (var42 != null) {
                class185 var43 = class185.method2191(class182.field2378, field912.field1461);
                var43.field2489.method3344(field1010);
                var43.field2489.method3342(arg0);
                var43.field2489.method3446(arg1);
                var43.field2489.method3344(var42.field2892);
                var43.field2489.method3343(field1009);
                var43.field2489.method3353(Statics.field262);
                field912.method1999(var43);
            }
        }
        if (arg2 == 36) {
            class185 var44 = class185.method2191(class182.field2455, field912.field1461);
            var44.field2489.method3353(arg1);
            var44.field2489.method3343(arg0);
            var44.field2489.method3344(arg3);
            field912.method1999(var44);
            field865 = 0;
            Statics.field242 = class243.method123(arg1);
            field959 = arg0;
        }
        if (arg2 == 21) {
            field1038 = arg6;
            field954 = arg7;
            field956 = 2;
            field1081 = 0;
            field1023 = arg0;
            field1082 = arg1;
            class185 var45 = class185.method2191(class182.field2427, field912.field1461);
            var45.field2489.method3344(Statics.field594 + arg1);
            var45.field2489.method3344(arg3);
            var45.field2489.method3343(Statics.field2465 + arg0);
            var45.field2489.method3334(class52.field620[82] ? 1 : 0);
            field912.method1999(var45);
        }
        if (arg2 == 19) {
            field1038 = arg6;
            field954 = arg7;
            field956 = 2;
            field1081 = 0;
            field1023 = arg0;
            field1082 = arg1;
            class185 var46 = class185.method2191(class182.field2399, field912.field1461);
            var46.field2489.method3476(Statics.field594 + arg1);
            var46.field2489.method3344(Statics.field2465 + arg0);
            var46.field2489.method3343(arg3);
            var46.field2489.method3363(class52.field620[82] ? 1 : 0);
            field912.method1999(var46);
        }
        if (arg2 == 32) {
            class185 var47 = class185.method2191(class182.field2437, field912.field1461);
            var47.field2489.method3354(Statics.field262);
            var47.field2489.method3343(arg3);
            var47.field2489.method3342(field1009);
            var47.field2489.method3446(arg1);
            var47.field2489.method3342(arg0);
            field912.method1999(var47);
            field865 = 0;
            Statics.field242 = class243.method123(arg1);
            field959 = arg0;
        }
        if (arg2 == 10) {
            class85 var48 = field894[arg3];
            if (var48 != null) {
                field1038 = arg6;
                field954 = arg7;
                field956 = 2;
                field1081 = 0;
                field1023 = arg0;
                field1082 = arg1;
                class185 var49 = class185.method2191(class182.field2409, field912.field1461);
                var49.field2489.method3476(arg3);
                var49.field2489.method3334(class52.field620[82] ? 1 : 0);
                field912.method1999(var49);
            }
        }
        if (arg2 == 41) {
            class185 var50 = class185.method2191(class182.field2373, field912.field1461);
            var50.field2489.method3353(arg1);
            var50.field2489.method3344(arg0);
            var50.field2489.method3344(arg3);
            field912.method1999(var50);
            field865 = 0;
            Statics.field242 = class243.method123(arg1);
            field959 = arg0;
        }
        if (arg2 == 31) {
            class185 var51 = class185.method2191(class182.field2457, field912.field1461);
            var51.field2489.method3344(Statics.field2147);
            var51.field2489.method3319(Statics.field1006);
            var51.field2489.method3476(arg3);
            var51.field2489.method3343(Statics.field2959);
            var51.field2489.method3319(arg1);
            var51.field2489.method3343(arg0);
            field912.method1999(var51);
            field865 = 0;
            Statics.field242 = class243.method123(arg1);
            field959 = arg0;
        }
        if (arg2 == 42) {
            class185 var52 = class185.method2191(class182.field2393, field912.field1461);
            var52.field2489.method3342(arg3);
            var52.field2489.method3353(arg1);
            var52.field2489.method3476(arg0);
            field912.method1999(var52);
            field865 = 0;
            Statics.field242 = class243.method123(arg1);
            field959 = arg0;
        }
        if (arg2 == 29) {
            class185 var53 = class185.method2191(class182.field2425, field912.field1461);
            var53.field2489.method3319(arg1);
            field912.method1999(var53);
            class243 var54 = class243.method123(arg1);
            if (var54.field2934 != null && var54.field2934[0][0] == 5) {
                int var55 = var54.field2934[0][1];
                if (class238.field2788[var55] != var54.field2936[0]) {
                    class238.field2788[var55] = var54.field2936[0];
                    method1977(var55);
                }
            }
        }
        if (arg2 == 23) {
            if (field1000) {
                Statics.field2246.method2778();
            } else {
                Statics.field2246.method2777(Statics.field226, arg0, arg1, true);
            }
        }
        if (arg2 == 28) {
            class185 var56 = class185.method2191(class182.field2425, field912.field1461);
            var56.field2489.method3319(arg1);
            field912.method1999(var56);
            class243 var57 = class243.method123(arg1);
            if (var57.field2934 != null && var57.field2934[0][0] == 5) {
                int var58 = var57.field2934[0][1];
                class238.field2788[var58] = 1 - class238.field2788[var58];
                method1977(var58);
            }
        }
        if (arg2 == 5) {
            field1038 = arg6;
            field954 = arg7;
            field956 = 2;
            field1081 = 0;
            field1023 = arg0;
            field1082 = arg1;
            class185 var59 = class185.method2191(class182.field2442, field912.field1461);
            var59.field2489.method3342(Statics.field2465 + arg0);
            var59.field2489.method3476(arg3 >> 14 & 0x7FFF);
            var59.field2489.method3476(Statics.field594 + arg1);
            var59.field2489.method3380(class52.field620[82] ? 1 : 0);
            field912.method1999(var59);
        }
        if (arg2 == 50) {
            class73 var60 = field1004[arg3];
            if (var60 != null) {
                field1038 = arg6;
                field954 = arg7;
                field956 = 2;
                field1081 = 0;
                field1023 = arg0;
                field1082 = arg1;
                class185 var61 = class185.method2191(class182.field2422, field912.field1461);
                var61.field2489.method3426(class52.field620[82] ? 1 : 0);
                var61.field2489.method3342(arg3);
                field912.method1999(var61);
            }
        }
        if (arg2 == 33) {
            class185 var62 = class185.method2191(class182.field2379, field912.field1461);
            var62.field2489.method3344(arg3);
            var62.field2489.method3353(arg1);
            var62.field2489.method3476(arg0);
            field912.method1999(var62);
            field865 = 0;
            Statics.field242 = class243.method123(arg1);
            field959 = arg0;
        }
        if (arg2 == 18) {
            field1038 = arg6;
            field954 = arg7;
            field956 = 2;
            field1081 = 0;
            field1023 = arg0;
            field1082 = arg1;
            class185 var63 = class185.method2191(class182.field2365, field912.field1461);
            var63.field2489.method3476(arg3);
            var63.field2489.method3334(class52.field620[82] ? 1 : 0);
            var63.field2489.method3344(Statics.field594 + arg1);
            var63.field2489.method3476(Statics.field2465 + arg0);
            field912.method1999(var63);
        }
        if (arg2 == 26) {
            method3087();
        }
        if (arg2 == 1) {
            field1038 = arg6;
            field954 = arg7;
            field956 = 2;
            field1081 = 0;
            field1023 = arg0;
            field1082 = arg1;
            class185 var64 = class185.method2191(class182.field2394, field912.field1461);
            var64.field2489.method3476(Statics.field594 + arg1);
            var64.field2489.method3344(Statics.field2959);
            var64.field2489.method3344(arg3 >> 14 & 0x7FFF);
            var64.field2489.method3354(Statics.field1006);
            var64.field2489.method3363(class52.field620[82] ? 1 : 0);
            var64.field2489.method3343(Statics.field2465 + arg0);
            var64.field2489.method3343(Statics.field2147);
            field912.method1999(var64);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class243 var65 = class243.method590(arg1, arg0);
            if (var65 != null) {
                method685(arg3, arg1, arg0, var65.field2892, arg5);
            }
        }
        if (arg2 == 39) {
            class185 var66 = class185.method2191(class182.field2447, field912.field1461);
            var66.field2489.method3342(arg3);
            var66.field2489.method3343(arg0);
            var66.field2489.method3354(arg1);
            field912.method1999(var66);
            field865 = 0;
            Statics.field242 = class243.method123(arg1);
            field959 = arg0;
        }
        if (arg2 == 43) {
            class185 var67 = class185.method2191(class182.field2429, field912.field1461);
            var67.field2489.method3342(arg0);
            var67.field2489.method3344(arg3);
            var67.field2489.method3354(arg1);
            field912.method1999(var67);
            field865 = 0;
            Statics.field242 = class243.method123(arg1);
            field959 = arg0;
        }
        if (arg2 == 30 && field1018 == null) {
            class185 var68 = class185.method2191(class182.field2432, field912.field1461);
            var68.field2489.method3344(arg0);
            var68.field2489.method3354(arg1);
            field912.method1999(var68);
            field1018 = class243.method590(arg1, arg0);
            method89(field1018);
        }
        if (arg2 == 1004) {
            field1038 = arg6;
            field954 = arg7;
            field956 = 2;
            field1081 = 0;
            class185 var69 = class185.method2191(class182.field2449, field912.field1461);
            var69.field2489.method3343(arg3);
            field912.method1999(var69);
        }
        if (arg2 == 14) {
            class73 var70 = field1004[arg3];
            if (var70 != null) {
                field1038 = arg6;
                field954 = arg7;
                field956 = 2;
                field1081 = 0;
                field1023 = arg0;
                field1082 = arg1;
                class185 var71 = class185.method2191(class182.field2444, field912.field1461);
                var71.field2489.method3319(Statics.field1006);
                var71.field2489.method3476(Statics.field2959);
                var71.field2489.method3476(arg3);
                var71.field2489.method3363(class52.field620[82] ? 1 : 0);
                var71.field2489.method3343(Statics.field2147);
                field912.method1999(var71);
            }
        }
        if (arg2 == 17) {
            field1038 = arg6;
            field954 = arg7;
            field956 = 2;
            field1081 = 0;
            field1023 = arg0;
            field1082 = arg1;
            class185 var72 = class185.method2191(class182.field2439, field912.field1461);
            var72.field2489.method3426(class52.field620[82] ? 1 : 0);
            var72.field2489.method3446(Statics.field262);
            var72.field2489.method3342(Statics.field2465 + arg0);
            var72.field2489.method3342(Statics.field594 + arg1);
            var72.field2489.method3343(arg3);
            var72.field2489.method3476(field1009);
            field912.method1999(var72);
        }
        if (arg2 == 24) {
            class243 var73 = class243.method123(arg1);
            boolean var74 = true;
            if (var73.field2856 > 0) {
                var74 = method2004(var73);
            }
            if (var74) {
                class185 var75 = class185.method2191(class182.field2425, field912.field1461);
                var75.field2489.method3319(arg1);
                field912.method1999(var75);
            }
        }
        if (arg2 == 38) {
            method5109();
            class243 var76 = class243.method123(arg1);
            field1005 = 1;
            Statics.field2959 = arg0;
            Statics.field1006 = arg1;
            Statics.field2147 = arg3;
            method89(var76);
            field1012 = class87.method1978(16748608) + class284.method2027(arg3).field3692 + class87.method1978(16777215);
            if (field1012 == null) {
                field1012 = class252.field3028;
            }
            return;
        }
        if (arg2 == 46) {
            class73 var77 = field1004[arg3];
            if (var77 != null) {
                field1038 = arg6;
                field954 = arg7;
                field956 = 2;
                field1081 = 0;
                field1023 = arg0;
                field1082 = arg1;
                class185 var78 = class185.method2191(class182.field2369, field912.field1461);
                var78.field2489.method3363(class52.field620[82] ? 1 : 0);
                var78.field2489.method3342(arg3);
                field912.method1999(var78);
            }
        }
        if (arg2 == 51) {
            class73 var79 = field1004[arg3];
            if (var79 != null) {
                field1038 = arg6;
                field954 = arg7;
                field956 = 2;
                field1081 = 0;
                field1023 = arg0;
                field1082 = arg1;
                class185 var80 = class185.method2191(class182.field2385, field912.field1461);
                var80.field2489.method3344(arg3);
                var80.field2489.method3334(class52.field620[82] ? 1 : 0);
                field912.method1999(var80);
            }
        }
        if (arg2 == 13) {
            class85 var81 = field894[arg3];
            if (var81 != null) {
                field1038 = arg6;
                field954 = arg7;
                field956 = 2;
                field1081 = 0;
                field1023 = arg0;
                field1082 = arg1;
                class185 var82 = class185.method2191(class182.field2426, field912.field1461);
                var82.field2489.method3426(class52.field620[82] ? 1 : 0);
                var82.field2489.method3344(arg3);
                field912.method1999(var82);
            }
        }
        if (arg2 == 4) {
            field1038 = arg6;
            field954 = arg7;
            field956 = 2;
            field1081 = 0;
            field1023 = arg0;
            field1082 = arg1;
            class185 var83 = class185.method2191(class182.field2370, field912.field1461);
            var83.field2489.method3476(arg3 >> 14 & 0x7FFF);
            var83.field2489.method3344(Statics.field2465 + arg0);
            var83.field2489.method3426(class52.field620[82] ? 1 : 0);
            var83.field2489.method3343(Statics.field594 + arg1);
            field912.method1999(var83);
        }
        if (arg2 == 48) {
            class73 var84 = field1004[arg3];
            if (var84 != null) {
                field1038 = arg6;
                field954 = arg7;
                field956 = 2;
                field1081 = 0;
                field1023 = arg0;
                field1082 = arg1;
                class185 var85 = class185.method2191(class182.field2424, field912.field1461);
                var85.field2489.method3344(arg3);
                var85.field2489.method3334(class52.field620[82] ? 1 : 0);
                field912.method1999(var85);
            }
        }
        if (arg2 == 3) {
            field1038 = arg6;
            field954 = arg7;
            field956 = 2;
            field1081 = 0;
            field1023 = arg0;
            field1082 = arg1;
            class185 var86 = class185.method2191(class182.field2428, field912.field1461);
            var86.field2489.method3344(arg3 >> 14 & 0x7FFF);
            var86.field2489.method3476(Statics.field594 + arg1);
            var86.field2489.method3476(Statics.field2465 + arg0);
            var86.field2489.method3334(class52.field620[82] ? 1 : 0);
            field912.method1999(var86);
        }
        if (arg2 == 35) {
            class185 var87 = class185.method2191(class182.field2377, field912.field1461);
            var87.field2489.method3343(arg0);
            var87.field2489.method3446(arg1);
            var87.field2489.method3476(arg3);
            field912.method1999(var87);
            field865 = 0;
            Statics.field242 = class243.method123(arg1);
            field959 = arg0;
        }
        if (arg2 != 25) {
            if (arg2 == 20) {
                field1038 = arg6;
                field954 = arg7;
                field956 = 2;
                field1081 = 0;
                field1023 = arg0;
                field1082 = arg1;
                class185 var90 = class185.method2191(class182.field2443, field912.field1461);
                var90.field2489.method3342(Statics.field594 + arg1);
                var90.field2489.method3343(Statics.field2465 + arg0);
                var90.field2489.method3426(class52.field620[82] ? 1 : 0);
                var90.field2489.method3343(arg3);
                field912.method1999(var90);
            }
            if (field1005 != 0) {
                field1005 = 0;
                method89(class243.method123(Statics.field1006));
            }
            if (field1008) {
                method5109();
            }
            if (Statics.field242 != null && field865 == 0) {
                method89(Statics.field242);
            }
            return;
        }
        class243 var88 = class243.method590(arg1, arg0);
        if (var88 == null) {
            return;
        }
        method5109();
        method4440(arg1, arg0, class244.method3050(method1(var88)), var88.field2892);
        field1005 = 0;
        String var89;
        if (class244.method3050(method1(var88)) == 0) {
            var89 = null;
        } else if (var88.field2901 == null || var88.field2901.trim().length() == 0) {
            var89 = null;
        } else {
            var89 = var88.field2901;
        }
        field1011 = var89;
        if (field1011 == null) {
            field1011 = "Null";
        }
        if (var88.field2900) {
            field1064 = var88.field2821 + class87.method1978(16777215);
        } else {
            field1064 = class87.method1978(65280) + var88.field2938 + class87.method1978(16777215);
        }
    }

    @ObfuscatedName("ja.im(IIIII)V")
    public static void method4440(int arg0, int arg1, int arg2, int arg3) {
        class243 var4 = class243.method590(arg0, arg1);
        if (var4 != null && var4.field2913 != null) {
            class69 var5 = new class69();
            var5.field778 = var4;
            var5.field786 = var4.field2913;
            class82.method1108(var5);
        }
        field1010 = arg3;
        field1008 = true;
        Statics.field262 = arg0;
        field1009 = arg1;
        Statics.field606 = arg2;
        method89(var4);
    }

    @ObfuscatedName("kv.io(I)V")
    public static void method5109() {
        if (!field1008) {
            return;
        }
        class243 var0 = class243.method590(Statics.field262, field1009);
        if (var0 != null && var0.field2914 != null) {
            class69 var1 = new class69();
            var1.field778 = var0;
            var1.field786 = var0.field2914;
            class82.method1108(var1);
        }
        field1008 = false;
        method89(var0);
    }

    @ObfuscatedName("ae.ig(IIIILjava/lang/String;I)V")
    public static void method685(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class243 var5 = class243.method590(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2895 != null) {
            class69 var6 = new class69();
            var6.field778 = var5;
            var6.field780 = arg0;
            var6.field784 = arg4;
            var6.field786 = var5.field2895;
            class82.method1108(var6);
        }
        boolean var7 = true;
        if (var5.field2856 > 0) {
            var7 = method2004(var5);
        }
        if (!var7 || !class244.method2938(method1(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class185 var8 = class185.method2191(class182.field2461, field912.field1461);
            var8.field2489.method3319(arg1);
            var8.field2489.method3476(arg2);
            var8.field2489.method3476(arg3);
            field912.method1999(var8);
        }
        if (arg0 == 2) {
            class185 var9 = class185.method2191(class182.field2459, field912.field1461);
            var9.field2489.method3319(arg1);
            var9.field2489.method3476(arg2);
            var9.field2489.method3476(arg3);
            field912.method1999(var9);
        }
        if (arg0 == 3) {
            class185 var10 = class185.method2191(class182.field2387, field912.field1461);
            var10.field2489.method3319(arg1);
            var10.field2489.method3476(arg2);
            var10.field2489.method3476(arg3);
            field912.method1999(var10);
        }
        if (arg0 == 4) {
            class185 var11 = class185.method2191(class182.field2381, field912.field1461);
            var11.field2489.method3319(arg1);
            var11.field2489.method3476(arg2);
            var11.field2489.method3476(arg3);
            field912.method1999(var11);
        }
        if (arg0 == 5) {
            class185 var12 = class185.method2191(class182.field2395, field912.field1461);
            var12.field2489.method3319(arg1);
            var12.field2489.method3476(arg2);
            var12.field2489.method3476(arg3);
            field912.method1999(var12);
        }
        if (arg0 == 6) {
            class185 var13 = class185.method2191(class182.field2462, field912.field1461);
            var13.field2489.method3319(arg1);
            var13.field2489.method3476(arg2);
            var13.field2489.method3476(arg3);
            field912.method1999(var13);
        }
        if (arg0 == 7) {
            class185 var14 = class185.method2191(class182.field2420, field912.field1461);
            var14.field2489.method3319(arg1);
            var14.field2489.method3476(arg2);
            var14.field2489.method3476(arg3);
            field912.method1999(var14);
        }
        if (arg0 == 8) {
            class185 var15 = class185.method2191(class182.field2391, field912.field1461);
            var15.field2489.method3319(arg1);
            var15.field2489.method3476(arg2);
            var15.field2489.method3476(arg3);
            field912.method1999(var15);
        }
        if (arg0 == 9) {
            class185 var16 = class185.method2191(class182.field2456, field912.field1461);
            var16.field2489.method3319(arg1);
            var16.field2489.method3476(arg2);
            var16.field2489.method3476(arg3);
            field912.method1999(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class185 var17 = class185.method2191(class182.field2388, field912.field1461);
        var17.field2489.method3319(arg1);
        var17.field2489.method3476(arg2);
        var17.field2489.method3476(arg3);
        field912.method1999(var17);
    }

    @ObfuscatedName("y.ib(B)V")
    public static final void method23() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field989 - 1; var1++) {
                if (field1031[var1] < 1000 && field1031[var1 + 1] > 1000) {
                    String var2 = field995[var1];
                    field995[var1] = field995[var1 + 1];
                    field995[var1 + 1] = var2;
                    String var3 = field1105[var1];
                    field1105[var1] = field1105[var1 + 1];
                    field1105[var1 + 1] = var3;
                    int var4 = field1031[var1];
                    field1031[var1] = field1031[var1 + 1];
                    field1031[var1 + 1] = var4;
                    int var5 = field933[var1];
                    field933[var1] = field933[var1 + 1];
                    field933[var1 + 1] = var5;
                    int var6 = field991[var1];
                    field991[var1] = field991[var1 + 1];
                    field991[var1 + 1] = var6;
                    int var7 = field993[var1];
                    field993[var1] = field993[var1 + 1];
                    field993[var1 + 1] = var7;
                    boolean var8 = field1089[var1];
                    field1089[var1] = field1089[var1 + 1];
                    field1089[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("en.iu(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method2971(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var12 = false;
        if (field1000 || field989 >= 500) {
            return;
        }
        field1105[field989] = arg0;
        field995[field989] = arg1;
        field1031[field989] = arg2;
        field993[field989] = arg3;
        field933[field989] = arg4;
        field991[field989] = arg5;
        field1089[field989] = var12;
        field989++;
    }

    @ObfuscatedName("bp.iz(I)I")
    public static final int method783() {
        return field989 - 1;
    }

    @ObfuscatedName("jo.ih(I)V")
    public static void method4421() {
        for (int var0 = 0; var0 < field989; var0++) {
            int var1 = field1031[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field989 - 1) {
                    for (int var3 = var0; var3 < field989 - 1; var3++) {
                        field1105[var3] = field1105[var3 + 1];
                        field995[var3] = field995[var3 + 1];
                        field1031[var3] = field1031[var3 + 1];
                        field993[var3] = field993[var3 + 1];
                        field933[var3] = field933[var3 + 1];
                        field991[var3] = field991[var3 + 1];
                        field1089[var3] = field1089[var3 + 1];
                    }
                }
                var0--;
                field989--;
            }
        }
        method228();
    }

    @ObfuscatedName("gm.il(II)Ljava/lang/String;")
    public static String method3234(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field995[arg0].length() > 0) {
            return field1105[arg0] + class252.field3266 + field995[arg0];
        } else {
            return field1105[arg0];
        }
    }

    @ObfuscatedName("q.iv(Lje;IIII)V")
    public static final void method90(class286 arg0, int arg1, int arg2, int arg3) {
        if (field989 >= 400) {
            return;
        }
        if (arg0.field3723 != null) {
            arg0 = arg0.method4806();
        }
        if (arg0 == null || !arg0.field3740 || arg0.field3742 && field1058 != arg1) {
            return;
        }
        String var4 = arg0.field3716;
        if (arg0.field3729 != 0) {
            var4 = var4 + method748(arg0.field3729, Statics.field3435.field821) + " " + class87.field1309 + class252.field3177 + arg0.field3729 + class87.field1312;
        }
        if (arg0.field3742 && field1112) {
            method2971(class252.field3172, class87.method1978(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1005 == 1) {
            method2971(class252.field3171, field1012 + " " + class87.field1310 + " " + class87.method1978(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1008) {
            int var5 = arg0.field3742 && field1112 ? 2000 : 0;
            String[] var6 = arg0.field3715;
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class252.field3147)) {
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
                        method2971(var6[var7], class87.method1978(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class252.field3147)) {
                        short var10 = 0;
                        if (field880 != class90.field1331) {
                            if (field880 == class90.field1332 || field880 == class90.field1330 && arg0.field3729 > Statics.field3435.field821) {
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
                            method2971(var6[var9], class87.method1978(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3742 || !field1112) {
                method2971(class252.field3172, class87.method1978(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field606 & 0x2) == 2) {
            method2971(field1011, field1064 + " " + class87.field1310 + " " + class87.method1978(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ih.ic(Lbd;IIII)V")
    public static final void method4241(class73 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field3435 == arg0 || field989 >= 400) {
            return;
        }
        String var4;
        if (arg0.field822 == 0) {
            var4 = arg0.field820[0] + arg0.field829 + arg0.field820[1] + method748(arg0.field821, Statics.field3435.field821) + " " + class87.field1309 + class252.field3177 + arg0.field821 + class87.field1312 + arg0.field820[2];
        } else {
            var4 = arg0.field820[0] + arg0.field829 + arg0.field820[1] + " " + class87.field1309 + class252.field3178 + arg0.field822 + class87.field1312 + arg0.field820[2];
        }
        if (field1005 == 1) {
            method2971(class252.field3171, field1012 + " " + class87.field1310 + " " + class87.method1978(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field1008) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field976[var5] != null) {
                    short var6 = 0;
                    if (field976[var5].equalsIgnoreCase(class252.field3147)) {
                        if (field879 == class90.field1331) {
                            continue;
                        }
                        if (field879 == class90.field1332 || field879 == class90.field1330 && arg0.field821 > Statics.field3435.field821) {
                            var6 = 2000;
                        }
                        if (Statics.field3435.field835 != 0 && arg0.field835 != 0) {
                            if (Statics.field3435.field835 == arg0.field835) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field950[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field975[var5] + var6;
                    method2971(field976[var5], class87.method1978(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field606 & 0x8) == 8) {
            method2971(field1011, field1064 + " " + class87.field1310 + " " + class87.method1978(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field989; var9++) {
            if (field1031[var9] == 23) {
                field995[var9] = class87.method1978(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("bo.ip(III)Ljava/lang/String;")
    public static final String method748(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class87.method1978(16711680);
        } else if (var2 < -6) {
            return class87.method1978(16723968);
        } else if (var2 < -3) {
            return class87.method1978(16740352);
        } else if (var2 < 0) {
            return class87.method1978(16756736);
        } else if (var2 > 9) {
            return class87.method1978(65280);
        } else if (var2 > 6) {
            return class87.method1978(4259584);
        } else if (var2 > 3) {
            return class87.method1978(8453888);
        } else if (var2 > 0) {
            return class87.method1978(12648192);
        } else {
            return class87.method1978(16776960);
        }
    }

    @ObfuscatedName("jy.is(IIIIIIIIB)V")
    public static final void method4590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class243.method1826(arg0)) {
            Statics.field2247 = null;
            method5110(Statics.field2503[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2247 != null) {
                method5110(Statics.field2247, -1412584499, arg1, arg2, arg3, arg4, Statics.field497, Statics.field3881, arg7);
                Statics.field2247 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1056[var8] = true;
            }
        } else {
            field1056[arg7] = true;
        }
    }

    @ObfuscatedName("kv.ik([Liz;IIIIIIIIB)V")
    public static final void method5110(class243[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class328.method5354(arg2, arg3, arg4, arg5);
        class135.method2711();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class243 var10 = arg0[var9];
            if (var10 != null && (var10.field2841 == arg1 || arg1 == -1412584499 && field1024 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1059[field857] = var10.field2928 + arg6;
                    field1060[field857] = var10.field2826 + arg7;
                    field874[field857] = var10.field2837;
                    field1062[field857] = var10.field2838;
                    var11 = ++field857 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2953 = var11;
                var10.field2834 = field913;
                if (!var10.field2900 || !method687(var10)) {
                    if (var10.field2856 > 0) {
                        method1843(var10);
                    }
                    int var12 = var10.field2928 + arg6;
                    int var13 = var10.field2826 + arg7;
                    int var14 = var10.field2853;
                    if (field1024 == var10) {
                        if (arg1 != -1412584499 && !var10.field2945) {
                            Statics.field2247 = arg0;
                            Statics.field497 = arg6;
                            Statics.field3881 = arg7;
                            continue;
                        }
                        if (field1035 && field1029) {
                            int var15 = class61.field708;
                            int var16 = class61.field709;
                            int var17 = var15 - field1026;
                            int var18 = var16 - field893;
                            if (var17 < field1030) {
                                var17 = field1030;
                            }
                            if (var10.field2837 + var17 > field1030 + field1025.field2837) {
                                var17 = field1030 + field1025.field2837 - var10.field2837;
                            }
                            if (var18 < field955) {
                                var18 = field955;
                            }
                            if (var10.field2838 + var18 > field955 + field1025.field2838) {
                                var18 = field955 + field1025.field2838 - var10.field2838;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2945) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2824 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2824 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2837 + var12;
                        int var26 = var10.field2838 + var13;
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
                        int var29 = var10.field2837 + var12;
                        int var30 = var10.field2838 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2900 || var19 < var21 && var20 < var22) {
                        if (var10.field2856 != 0) {
                            if (var10.field2856 == 1336) {
                                if (field869) {
                                    var13 += 15;
                                    Statics.field3013.method5126("Fps:" + field677, var10.field2837 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field853) {
                                        var33 = 16711680;
                                    }
                                    Statics.field3013.method5126("Mem:" + var32 + "k", var10.field2837 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2856 == 1337) {
                                field1001 = var12;
                                field1002 = var13;
                                int var36 = var10.field2837;
                                int var37 = var10.field2838;
                                field1094++;
                                method1961();
                                if (field929) {
                                    method506(Statics.field3435, false);
                                }
                                method243();
                                method96(true);
                                int var38 = class94.field1408;
                                int[] var39 = class94.field1406;
                                for (int var40 = 0; var40 < var38; var40++) {
                                    if (field979 != var39[var40] && field969 != var39[var40]) {
                                        method506(field1004[var39[var40]], true);
                                    }
                                }
                                method96(false);
                                method178();
                                method752();
                                method3(var12, var13, var36, var37, true);
                                int var41 = field1109;
                                int var42 = field1074;
                                int var43 = field918;
                                int var44 = field899;
                                class328.method5354(var41, var42, var41 + var43, var42 + var44);
                                class135.method2711();
                                if (!field1095) {
                                    int var45 = field921;
                                    if (field938 / 256 > var45) {
                                        var45 = field938 / 256;
                                    }
                                    if (field861[4] && field967[4] + 128 > var45) {
                                        var45 = field967[4] + 128;
                                    }
                                    int var46 = field922 & 0x7FF;
                                    method1165(Statics.field368, Statics.field1334, Statics.field2784, var45, var46, var45 * 3 + 600);
                                }
                                int var47;
                                if (field1095) {
                                    int var48;
                                    if (Statics.field1117.field1228) {
                                        var48 = Statics.field226;
                                    } else {
                                        int var49 = method79(Statics.field2105, Statics.field2196, Statics.field226);
                                        if (var49 - Statics.field1318 >= 800 || (class63.field721[Statics.field226][Statics.field2105 >> 7][Statics.field2196 >> 7] & 0x4) == 0) {
                                            var48 = 3;
                                        } else {
                                            var48 = Statics.field226;
                                        }
                                    }
                                    var47 = var48;
                                } else {
                                    var47 = method4258();
                                }
                                int var50 = Statics.field2105;
                                int var51 = Statics.field1318;
                                int var52 = Statics.field2196;
                                int var53 = Statics.field322;
                                int var54 = Statics.field457;
                                for (int var55 = 0; var55 < 5; var55++) {
                                    if (field861[var55]) {
                                        int var56 = (int) (Math.random() * (double) (field1044[var55] * 2 + 1) - (double) field1044[var55] + Math.sin((double) field992[var55] / 100.0D * (double) field1100[var55]) * (double) field967[var55]);
                                        if (var55 == 0) {
                                            Statics.field2105 += var56;
                                        }
                                        if (var55 == 1) {
                                            Statics.field1318 += var56;
                                        }
                                        if (var55 == 2) {
                                            Statics.field2196 += var56;
                                        }
                                        if (var55 == 3) {
                                            Statics.field457 = Statics.field457 + var56 & 0x7FF;
                                        }
                                        if (var55 == 4) {
                                            Statics.field322 += var56;
                                            if (Statics.field322 < 128) {
                                                Statics.field322 = 128;
                                            }
                                            if (Statics.field322 > 383) {
                                                Statics.field322 = 383;
                                            }
                                        }
                                    }
                                }
                                int var57 = class61.field708;
                                int var58 = class61.field709;
                                if (class61.field711 != 0) {
                                    var57 = class61.field715;
                                    var58 = class61.field716;
                                }
                                if (var57 >= var41 && var57 < var41 + var43 && var58 >= var42 && var58 < var42 + var44) {
                                    class133.method3279(var57 - var41, var58 - var42);
                                } else {
                                    class133.method1022();
                                }
                                method510();
                                class328.method5362(var41, var42, var43, var44, 0);
                                method510();
                                int var59 = class135.field1926;
                                class135.field1926 = field1053;
                                Statics.field2246.method2781(Statics.field2105, Statics.field1318, Statics.field2196, Statics.field322, Statics.field457, var47);
                                class8.method1585();
                                class135.field1926 = var59;
                                method510();
                                Statics.field2246.method2918();
                                method94(var41, var42, var43, var44);
                                method8(var41, var42);
                                ((class124) Statics.field1936).method2477(field914);
                                method2931(var41, var42, var43, var44);
                                Statics.field2105 = var50;
                                Statics.field1318 = var51;
                                Statics.field2196 = var52;
                                Statics.field322 = var53;
                                Statics.field457 = var54;
                                if (field996 && class265.method3204(true, false) == 0) {
                                    field996 = false;
                                }
                                if (field996) {
                                    class328.method5362(var41, var42, var43, var44, 0);
                                    method17(class252.field3031, false);
                                }
                                field1056[var10.field2953] = true;
                                class328.method5354(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2856 == 1338) {
                                method140(var10, var12, var13, var11);
                                class328.method5354(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2856 == 1339) {
                                class237 var60 = var10.method4186(false);
                                if (var60 != null) {
                                    if (field1083 < 3) {
                                        Statics.field545.method5477(var12, var13, var60.field2781, var60.field2783, 25, 25, field922, 256, var60.field2780, var60.field2782);
                                    } else {
                                        class328.method5376(var12, var13, 0, var60.field2780, var60.field2782);
                                    }
                                }
                                class328.method5354(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2856 == 1400) {
                                Statics.field2585.method5630(var12, var13, var10.field2837, var10.field2838, field913);
                            }
                            if (var10.field2856 == 1401) {
                                Statics.field2585.method5674(var12, var13, var10.field2837, var10.field2838);
                            }
                        }
                        if (var10.field2824 == 0) {
                            if (!var10.field2900 && method687(var10) && Statics.field643 != var10) {
                                continue;
                            }
                            if (!var10.field2900) {
                                if (var10.field2844 > var10.field2846 - var10.field2838) {
                                    var10.field2844 = var10.field2846 - var10.field2838;
                                }
                                if (var10.field2844 < 0) {
                                    var10.field2844 = 0;
                                }
                            }
                            method5110(arg0, var10.field2822, var19, var20, var21, var22, var12 - var10.field2951, var13 - var10.field2844, var11);
                            if (var10.field2946 != null) {
                                method5110(var10.field2946, var10.field2822, var19, var20, var21, var22, var12 - var10.field2951, var13 - var10.field2844, var11);
                            }
                            class68 var61 = (class68) field1014.method3740((long) var10.field2822);
                            if (var61 != null) {
                                method4590(var61.field774, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class328.method5354(arg2, arg3, arg4, arg5);
                            class135.method2711();
                        }
                        if (field1065 || field1102[var11] || field1063 > 1) {
                            if (var10.field2824 == 0 && !var10.field2900 && var10.field2846 > var10.field2838) {
                                method3067(var10.field2837 + var12, var13, var10.field2844, var10.field2838, var10.field2846);
                            }
                            if (var10.field2824 != 1) {
                                if (var10.field2824 == 2) {
                                    int var62 = 0;
                                    for (int var63 = 0; var63 < var10.field2909; var63++) {
                                        for (int var64 = 0; var64 < var10.field2929; var64++) {
                                            int var65 = (var10.field2888 + 32) * var64 + var12;
                                            int var66 = (var10.field2864 + 32) * var63 + var13;
                                            if (var62 < 20) {
                                                var65 += var10.field2890[var62];
                                                var66 += var10.field2891[var62];
                                            }
                                            if (var10.field2940[var62] > 0) {
                                                boolean var67 = false;
                                                boolean var68 = false;
                                                int var69 = var10.field2940[var62] - 1;
                                                if (var65 + 32 > arg2 && var65 < arg4 && var66 + 32 > arg3 && var66 < arg5 || Statics.field636 == var10 && field960 == var62) {
                                                    class332 var70;
                                                    if (field1005 == 1 && Statics.field2959 == var62 && Statics.field1006 == var10.field2822) {
                                                        var70 = class284.method6(var69, var10.field2941[var62], 2, 0, 2, false);
                                                    } else {
                                                        var70 = class284.method6(var69, var10.field2941[var62], 1, 3153952, 2, false);
                                                    }
                                                    if (var70 == null) {
                                                        method89(var10);
                                                    } else if (Statics.field636 == var10 && field960 == var62) {
                                                        int var71 = class61.field708 - field961;
                                                        int var72 = class61.field709 - field962;
                                                        if (var71 < 5 && var71 > -5) {
                                                            var71 = 0;
                                                        }
                                                        if (var72 < 5 && var72 > -5) {
                                                            var72 = 0;
                                                        }
                                                        if (field990 < 5) {
                                                            var71 = 0;
                                                            var72 = 0;
                                                        }
                                                        var70.method5466(var65 + var71, var66 + var72, 128);
                                                        if (arg1 != -1) {
                                                            class243 var73 = arg0[arg1 & 0xFFFF];
                                                            if (var66 + var72 < class328.field3963 && var73.field2844 > 0) {
                                                                int var74 = field914 * (class328.field3963 - var66 - var72) / 3;
                                                                if (var74 > field914 * 10) {
                                                                    var74 = field914 * 10;
                                                                }
                                                                if (var74 > var73.field2844) {
                                                                    var74 = var73.field2844;
                                                                }
                                                                var73.field2844 -= var74;
                                                                field962 += var74;
                                                                method89(var73);
                                                            }
                                                            if (var66 + var72 + 32 > class328.field3964 && var73.field2844 < var73.field2846 - var73.field2838) {
                                                                int var75 = field914 * (var66 + var72 + 32 - class328.field3964) / 3;
                                                                if (var75 > field914 * 10) {
                                                                    var75 = field914 * 10;
                                                                }
                                                                if (var75 > var73.field2846 - var73.field2838 - var73.field2844) {
                                                                    var75 = var73.field2846 - var73.field2838 - var73.field2844;
                                                                }
                                                                var73.field2844 += var75;
                                                                field962 -= var75;
                                                                method89(var73);
                                                            }
                                                        }
                                                    } else if (Statics.field242 == var10 && field959 == var62) {
                                                        var70.method5466(var65, var66, 128);
                                                    } else {
                                                        var70.method5524(var65, var66);
                                                    }
                                                }
                                            } else if (var10.field2820 != null && var62 < 20) {
                                                class332 var76 = var10.method4219(var62);
                                                if (var76 != null) {
                                                    var76.method5524(var65, var66);
                                                } else if (class243.field2935) {
                                                    method89(var10);
                                                }
                                            }
                                            var62++;
                                        }
                                    }
                                } else if (var10.field2824 == 3) {
                                    int var77;
                                    if (method2957(var10)) {
                                        var77 = var10.field2848;
                                        if (Statics.field643 == var10 && var10.field2850 != 0) {
                                            var77 = var10.field2850;
                                        }
                                    } else {
                                        var77 = var10.field2847;
                                        if (Statics.field643 == var10 && var10.field2842 != 0) {
                                            var77 = var10.field2842;
                                        }
                                    }
                                    if (var10.field2851) {
                                        switch(var10.field2855.field3976) {
                                            case 1:
                                                class328.method5365(var12, var13, var10.field2837, var10.field2838, var10.field2847, var10.field2848, 256 - (var10.field2853 & 0xFF), 256 - (var10.field2854 & 0xFF));
                                                break;
                                            case 2:
                                                class328.method5414(var12, var13, var10.field2837, var10.field2838, var10.field2847, var10.field2848, 256 - (var10.field2853 & 0xFF), 256 - (var10.field2854 & 0xFF));
                                                break;
                                            case 3:
                                                class328.method5364(var12, var13, var10.field2837, var10.field2838, var10.field2847, var10.field2848, 256 - (var10.field2853 & 0xFF), 256 - (var10.field2854 & 0xFF));
                                                break;
                                            case 4:
                                                class328.method5394(var12, var13, var10.field2837, var10.field2838, var10.field2847, var10.field2848, 256 - (var10.field2853 & 0xFF), 256 - (var10.field2854 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class328.method5362(var12, var13, var10.field2837, var10.field2838, var77);
                                                } else {
                                                    class328.method5361(var12, var13, var10.field2837, var10.field2838, var77, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class328.method5368(var12, var13, var10.field2837, var10.field2838, var77);
                                    } else {
                                        class328.method5351(var12, var13, var10.field2837, var10.field2838, var77, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2824 == 4) {
                                    class312 var78 = var10.method4184();
                                    if (var78 != null) {
                                        String var79 = var10.field2810;
                                        int var80;
                                        if (method2957(var10)) {
                                            var80 = var10.field2848;
                                            if (Statics.field643 == var10 && var10.field2850 != 0) {
                                                var80 = var10.field2850;
                                            }
                                            if (var10.field2883.length() > 0) {
                                                var79 = var10.field2883;
                                            }
                                        } else {
                                            var80 = var10.field2847;
                                            if (Statics.field643 == var10 && var10.field2842 != 0) {
                                                var80 = var10.field2842;
                                            }
                                        }
                                        if (var10.field2900 && var10.field2892 != -1) {
                                            class284 var81 = class284.method2027(var10.field2892);
                                            var79 = var81.field3692;
                                            if (var79 == null) {
                                                var79 = class252.field3028;
                                            }
                                            if ((var81.field3667 == 1 || var10.field2943 != 1) && var10.field2943 != -1) {
                                                var79 = class87.method1978(16748608) + var79 + class87.field1316 + " " + 'x' + method4875(var10.field2943);
                                            }
                                        }
                                        if (field1018 == var10) {
                                            var79 = class252.field3179;
                                            var80 = var10.field2847;
                                        }
                                        if (!var10.field2900) {
                                            var79 = method4(var79, var10);
                                        }
                                        var78.method5138(var79, var12, var13, var10.field2837, var10.field2838, var80, var10.field2887 ? 0 : -1, var10.field2871, var10.field2948, var10.field2884);
                                    } else if (class243.field2935) {
                                        method89(var10);
                                    }
                                } else if (var10.field2824 == 5) {
                                    if (var10.field2900) {
                                        class332 var83;
                                        if (var10.field2892 == -1) {
                                            var83 = var10.method4183(false);
                                        } else {
                                            var83 = class284.method6(var10.field2892, var10.field2943, var10.field2882, var10.field2833, var10.field2880, false);
                                        }
                                        if (var83 != null) {
                                            int var84 = var83.field3992;
                                            int var85 = var83.field3990;
                                            if (var10.field2860) {
                                                class328.method5355(var12, var13, var10.field2837 + var12, var10.field2838 + var13);
                                                int var86 = (var10.field2837 + (var84 - 1)) / var84;
                                                int var87 = (var10.field2838 + (var85 - 1)) / var85;
                                                for (int var88 = 0; var88 < var86; var88++) {
                                                    for (int var89 = 0; var89 < var87; var89++) {
                                                        if (var10.field2859 != 0) {
                                                            var83.method5549(var84 / 2 + var84 * var88 + var12, var85 / 2 + var85 * var89 + var13, var10.field2859, 4096);
                                                        } else if (var14 == 0) {
                                                            var83.method5524(var84 * var88 + var12, var85 * var89 + var13);
                                                        } else {
                                                            var83.method5466(var84 * var88 + var12, var85 * var89 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class328.method5354(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var90 = var10.field2837 * 4096 / var84;
                                                if (var10.field2859 != 0) {
                                                    var83.method5549(var10.field2837 / 2 + var12, var10.field2838 / 2 + var13, var10.field2859, var90);
                                                } else if (var14 != 0) {
                                                    var83.method5468(var12, var13, var10.field2837, var10.field2838, 256 - (var14 & 0xFF));
                                                } else if (var10.field2837 == var84 && var10.field2838 == var85) {
                                                    var83.method5524(var12, var13);
                                                } else {
                                                    var83.method5532(var12, var13, var10.field2837, var10.field2838);
                                                }
                                            }
                                        } else if (class243.field2935) {
                                            method89(var10);
                                        }
                                    } else {
                                        class332 var82 = var10.method4183(method2957(var10));
                                        if (var82 != null) {
                                            var82.method5524(var12, var13);
                                        } else if (class243.field2935) {
                                            method89(var10);
                                        }
                                    }
                                } else if (var10.field2824 == 6) {
                                    boolean var91 = method2957(var10);
                                    int var92;
                                    if (var91) {
                                        var92 = var10.field2870;
                                    } else {
                                        var92 = var10.field2869;
                                    }
                                    class132 var93 = null;
                                    int var94 = 0;
                                    if (var10.field2892 != -1) {
                                        class284 var95 = class284.method2027(var10.field2892);
                                        if (var95 != null) {
                                            class284 var96 = var95.method4745(var10.field2943);
                                            var93 = var96.method4737(1);
                                            if (var93 == null) {
                                                method89(var10);
                                            } else {
                                                var93.method2581();
                                                var94 = var93.field2025 / 2;
                                            }
                                        }
                                    } else if (var10.field2898 == 5) {
                                        if (var10.field2866 == 0) {
                                            var93 = field1114.method4138((class288) null, -1, (class288) null, -1);
                                        } else {
                                            var93 = Statics.field3435.method1120();
                                        }
                                    } else if (var92 == -1) {
                                        var93 = var10.method4228((class288) null, -1, var91, Statics.field3435.field817);
                                        if (var93 == null && class243.field2935) {
                                            method89(var10);
                                        }
                                    } else {
                                        class288 var97 = class288.method1825(var92);
                                        var93 = var10.method4228(var97, var10.field2944, var91, Statics.field3435.field817);
                                        if (var93 == null && class243.field2935) {
                                            method89(var10);
                                        }
                                    }
                                    class135.method2674(var10.field2837 / 2 + var12, var10.field2838 / 2 + var13);
                                    int var98 = var10.field2876 * class135.field1939[var10.field2873] >> 16;
                                    int var99 = var10.field2876 * class135.field1921[var10.field2873] >> 16;
                                    if (var93 != null) {
                                        if (var10.field2900) {
                                            var93.method2581();
                                            if (var10.field2879) {
                                                var93.method2625(0, var10.field2874, var10.field2875, var10.field2873, var10.field2865, var10.field2881 + var94 + var98, var10.field2881 + var99, var10.field2876);
                                            } else {
                                                var93.method2575(0, var10.field2874, var10.field2875, var10.field2873, var10.field2865, var10.field2881 + var94 + var98, var10.field2881 + var99);
                                            }
                                        } else {
                                            var93.method2575(0, var10.field2874, 0, var10.field2873, 0, var98, var99);
                                        }
                                    }
                                    class135.method2673();
                                } else {
                                    if (var10.field2824 == 7) {
                                        class312 var100 = var10.method4184();
                                        if (var100 == null) {
                                            if (class243.field2935) {
                                                method89(var10);
                                            }
                                            continue;
                                        }
                                        int var101 = 0;
                                        for (int var102 = 0; var102 < var10.field2909; var102++) {
                                            for (int var103 = 0; var103 < var10.field2929; var103++) {
                                                if (var10.field2940[var101] > 0) {
                                                    class284 var104 = class284.method2027(var10.field2940[var101] - 1);
                                                    String var105;
                                                    if (var104.field3667 != 1 && var10.field2941[var101] == 1) {
                                                        var105 = class87.method1978(16748608) + var104.field3692 + class87.field1316;
                                                    } else {
                                                        var105 = class87.method1978(16748608) + var104.field3692 + class87.field1316 + " " + 'x' + method4875(var10.field2941[var101]);
                                                    }
                                                    int var106 = (var10.field2888 + 115) * var103 + var12;
                                                    int var107 = (var10.field2864 + 12) * var102 + var13;
                                                    if (var10.field2871 == 0) {
                                                        var100.method5186(var105, var106, var107, var10.field2847, var10.field2887 ? 0 : -1);
                                                    } else if (var10.field2871 == 1) {
                                                        var100.method5137(var105, var10.field2837 / 2 + var106, var107, var10.field2847, var10.field2887 ? 0 : -1);
                                                    } else {
                                                        var100.method5126(var105, var10.field2837 + var106 - 1, var107, var10.field2847, var10.field2887 ? 0 : -1);
                                                    }
                                                }
                                                var101++;
                                            }
                                        }
                                    }
                                    if (var10.field2824 == 8 && Statics.field1951 == var10 && field916 == field1073) {
                                        int var108 = 0;
                                        int var109 = 0;
                                        class312 var110 = Statics.field3013;
                                        String var111 = var10.field2810;
                                        String var112 = method4(var111, var10);
                                        while (var112.length() > 0) {
                                            int var113 = var112.indexOf(class87.field1315);
                                            String var114;
                                            if (var113 == -1) {
                                                var114 = var112;
                                                var112 = "";
                                            } else {
                                                var114 = var112.substring(0, var113);
                                                var112 = var112.substring(var113 + 4);
                                            }
                                            int var115 = var110.method5129(var114);
                                            if (var115 > var108) {
                                                var108 = var115;
                                            }
                                            var109 += var110.field3910 + 1;
                                        }
                                        var108 += 6;
                                        var109 += 7;
                                        int var116 = var10.field2837 + var12 - 5 - var108;
                                        int var117 = var10.field2838 + var13 + 5;
                                        if (var116 < var12 + 5) {
                                            var116 = var12 + 5;
                                        }
                                        if (var108 + var116 > arg4) {
                                            var116 = arg4 - var108;
                                        }
                                        if (var109 + var117 > arg5) {
                                            var117 = arg5 - var109;
                                        }
                                        class328.method5362(var116, var117, var108, var109, 16777120);
                                        class328.method5368(var116, var117, var108, var109, 0);
                                        String var118 = var10.field2810;
                                        int var119 = var110.field3910 + var117 + 2;
                                        String var120 = method4(var118, var10);
                                        while (var120.length() > 0) {
                                            int var121 = var120.indexOf(class87.field1315);
                                            String var122;
                                            if (var121 == -1) {
                                                var122 = var120;
                                                var120 = "";
                                            } else {
                                                var122 = var120.substring(0, var121);
                                                var120 = var120.substring(var121 + 4);
                                            }
                                            var110.method5186(var122, var116 + 3, var119, 0, -1);
                                            var119 += var110.field3910 + 1;
                                        }
                                    }
                                    if (var10.field2824 == 9) {
                                        int var123;
                                        int var124;
                                        int var125;
                                        int var126;
                                        if (var10.field2831) {
                                            var123 = var12;
                                            var124 = var10.field2838 + var13;
                                            var125 = var10.field2837 + var12;
                                            var126 = var13;
                                        } else {
                                            var123 = var12;
                                            var124 = var13;
                                            var125 = var10.field2837 + var12;
                                            var126 = var10.field2838 + var13;
                                        }
                                        if (var10.field2889 == 1) {
                                            class328.method5374(var123, var124, var125, var126, var10.field2847);
                                        } else {
                                            int var129 = var10.field2847;
                                            int var130 = var10.field2889;
                                            int var131 = var125 - var123;
                                            int var132 = var126 - var124;
                                            int var133 = var131 >= 0 ? var131 : -var131;
                                            int var134 = var132 >= 0 ? var132 : -var132;
                                            int var135 = var133;
                                            if (var133 < var134) {
                                                var135 = var134;
                                            }
                                            if (var135 != 0) {
                                                int var136 = (var131 << 16) / var135;
                                                int var137 = (var132 << 16) / var135;
                                                if (var137 <= var136) {
                                                    var136 = -var136;
                                                } else {
                                                    var137 = -var137;
                                                }
                                                int var138 = var130 * var137 >> 17;
                                                int var139 = var130 * var137 + 1 >> 17;
                                                int var140 = var130 * var136 >> 17;
                                                int var141 = var130 * var136 + 1 >> 17;
                                                int var142 = var123 - class328.field3965;
                                                int var143 = var124 - class328.field3963;
                                                int var144 = var138 + var142;
                                                int var145 = var142 - var139;
                                                int var146 = var131 + var142 - var139;
                                                int var147 = var131 + var142 + var138;
                                                int var148 = var140 + var143;
                                                int var149 = var143 - var141;
                                                int var150 = var132 + var143 - var141;
                                                int var151 = var132 + var143 + var140;
                                                class135.method2679(var144, var145, var146);
                                                class135.method2682(var148, var149, var150, var144, var145, var146, var129);
                                                class135.method2679(var144, var146, var147);
                                                class135.method2682(var148, var150, var151, var144, var146, var147, var129);
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

    @ObfuscatedName("e.iw(Ljava/lang/String;Liz;I)Ljava/lang/String;")
    public static String method4(String arg0, class243 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method1071(Statics.method683(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("kw.iq(II)Ljava/lang/String;")
    public static final String method4875(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class87.field1317 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class87.method1978(65408) + var1.substring(0, var1.length() - 8) + class252.field3059 + " " + class87.field1309 + var1 + class87.field1312 + class87.field1316;
        } else if (var1.length() > 6) {
            return " " + class87.method1978(16777215) + var1.substring(0, var1.length() - 4) + class252.field3184 + " " + class87.field1309 + var1 + class87.field1312 + class87.field1316;
        } else {
            return " " + class87.method1978(16776960) + var1 + class87.field1316;
        }
    }

    @ObfuscatedName("client.id(ZS)V")
    public final void method1371(boolean arg0) {
        method1582(field888, Statics.field2039, Statics.field328, arg0);
    }

    @ObfuscatedName("client.ia(Liz;I)V")
    public void method1192(class243 arg0) {
        class243 var2 = arg0.field2841 == -1 ? null : class243.method123(arg0.field2841);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field2039;
            var4 = Statics.field328;
        } else {
            var3 = var2.field2837;
            var4 = var2.field2838;
        }
        method1861(arg0, var3, var4, false);
        method4953(arg0, var3, var4);
    }

    @ObfuscatedName("av.ii([Liz;Liz;ZB)V")
    public static void method337(class243[] arg0, class243 arg1, boolean arg2) {
        int var3 = arg1.field2813 == 0 ? arg1.field2837 : arg1.field2813;
        int var4 = arg1.field2846 == 0 ? arg1.field2838 : arg1.field2846;
        method605(arg0, arg1.field2822, var3, var4, arg2);
        if (arg1.field2946 != null) {
            method605(arg1.field2946, arg1.field2822, var3, var4, arg2);
        }
        class68 var5 = (class68) field1014.method3740((long) arg1.field2822);
        if (var5 != null) {
            method1582(var5.field774, var3, var4, arg2);
        }
        if (arg1.field2856 == 1337) {
        }
    }

    @ObfuscatedName("be.ir(IIIZI)V")
    public static final void method1582(int arg0, int arg1, int arg2, boolean arg3) {
        if (class243.method1826(arg0)) {
            method605(Statics.field2503[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("at.ix([Liz;IIIZS)V")
    public static void method605(class243[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class243 var6 = arg0[var5];
            if (var6 != null && var6.field2841 == arg1) {
                method1861(var6, arg2, arg3, arg4);
                method4953(var6, arg2, arg3);
                if (var6.field2951 > var6.field2813 - var6.field2837) {
                    var6.field2951 = var6.field2813 - var6.field2837;
                }
                if (var6.field2951 < 0) {
                    var6.field2951 = 0;
                }
                if (var6.field2844 > var6.field2846 - var6.field2838) {
                    var6.field2844 = var6.field2846 - var6.field2838;
                }
                if (var6.field2844 < 0) {
                    var6.field2844 = 0;
                }
                if (var6.field2824 == 0) {
                    method337(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("cc.iy(Liz;IIZS)V")
    public static void method1861(class243 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2837;
        int var5 = arg0.field2838;
        if (arg0.field2829 == 0) {
            arg0.field2837 = arg0.field2929;
        } else if (arg0.field2829 == 1) {
            arg0.field2837 = arg1 - arg0.field2929;
        } else if (arg0.field2829 == 2) {
            arg0.field2837 = arg0.field2929 * arg1 >> 14;
        }
        if (arg0.field2830 == 0) {
            arg0.field2838 = arg0.field2909;
        } else if (arg0.field2830 == 1) {
            arg0.field2838 = arg2 - arg0.field2909;
        } else if (arg0.field2830 == 2) {
            arg0.field2838 = arg0.field2909 * arg2 >> 14;
        }
        if (arg0.field2829 == 4) {
            arg0.field2837 = arg0.field2839 * arg0.field2838 / arg0.field2840;
        }
        if (arg0.field2830 == 4) {
            arg0.field2838 = arg0.field2840 * arg0.field2837 / arg0.field2839;
        }
        if (arg0.field2856 == 1337) {
            field863 = arg0;
        }
        if (arg3 && arg0.field2931 != null && (arg0.field2837 != var4 || arg0.field2838 != var5)) {
            class69 var6 = new class69();
            var6.field778 = arg0;
            var6.field786 = arg0.field2931;
            field1050.method3829(var6);
        }
    }

    @ObfuscatedName("kl.ij(Liz;III)V")
    public static void method4953(class243 arg0, int arg1, int arg2) {
        if (arg0.field2827 == 0) {
            arg0.field2928 = arg0.field2878;
        } else if (arg0.field2827 == 1) {
            arg0.field2928 = (arg1 - arg0.field2837) / 2 + arg0.field2878;
        } else if (arg0.field2827 == 2) {
            arg0.field2928 = arg1 - arg0.field2837 - arg0.field2878;
        } else if (arg0.field2827 == 3) {
            arg0.field2928 = arg0.field2878 * arg1 >> 14;
        } else if (arg0.field2827 == 4) {
            arg0.field2928 = (arg0.field2878 * arg1 >> 14) + (arg1 - arg0.field2837) / 2;
        } else {
            arg0.field2928 = arg1 - arg0.field2837 - (arg0.field2878 * arg1 >> 14);
        }
        if (arg0.field2828 == 0) {
            arg0.field2826 = arg0.field2832;
        } else if (arg0.field2828 == 1) {
            arg0.field2826 = (arg2 - arg0.field2838) / 2 + arg0.field2832;
        } else if (arg0.field2828 == 2) {
            arg0.field2826 = arg2 - arg0.field2838 - arg0.field2832;
        } else if (arg0.field2828 == 3) {
            arg0.field2826 = arg0.field2832 * arg2 >> 14;
        } else if (arg0.field2828 == 4) {
            arg0.field2826 = (arg0.field2832 * arg2 >> 14) + (arg2 - arg0.field2838) / 2;
        } else {
            arg0.field2826 = arg2 - arg0.field2838 - (arg0.field2832 * arg2 >> 14);
        }
    }

    @ObfuscatedName("fz.it(IIIIIB)V")
    public static final void method3067(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field236[0].method5443(arg0, arg1);
        Statics.field236[1].method5443(arg0, arg1 + arg3 - 16);
        class328.method5362(arg0, arg1 + 16, 16, arg3 - 32, field915);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class328.method5362(arg0, arg1 + 16 + var6, 16, var5, field1066);
        class328.method5372(arg0, arg1 + 16 + var6, var5, field904);
        class328.method5372(arg0 + 1, arg1 + 16 + var6, var5, field904);
        class328.method5370(arg0, arg1 + 16 + var6, 16, field904);
        class328.method5370(arg0, arg1 + 17 + var6, 16, field904);
        class328.method5372(arg0 + 15, arg1 + 16 + var6, var5, field1108);
        class328.method5372(arg0 + 14, arg1 + 17 + var6, var5 - 1, field1108);
        class328.method5370(arg0, arg1 + 15 + var6 + var5, 16, field1108);
        class328.method5370(arg0 + 1, arg1 + 14 + var6 + var5, 15, field1108);
    }

    @ObfuscatedName("bg.jb(IB)Ljava/lang/String;")
    public static final String method1071(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("ek.jr(Liz;I)Z")
    public static final boolean method2957(class243 arg0) {
        if (arg0.field2872 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2872.length; var1++) {
            int var2 = Statics.method683(arg0, var1);
            int var3 = arg0.field2936[var1];
            if (arg0.field2872[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2872[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2872[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("bb.ji(Liz;Lju;IIZI)V")
    public static final void method1001(class243 arg0, class284 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3671;
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
            var7 = class252.field3022;
        }
        if (var6 == -1 || var7 == null) {
            return;
        }
        String var9 = class87.method1978(16748608) + arg1.field3692;
        int var11 = arg1.field3654;
        int var13 = arg0.field2822;
        if (field1000 || field989 >= 500) {
            return;
        }
        field1105[field989] = var7;
        field995[field989] = var9;
        field1031[field989] = var6;
        field993[field989] = var11;
        field933[field989] = arg2;
        field991[field989] = var13;
        field1089[field989] = arg4;
        field989++;
    }

    @ObfuscatedName("bo.jo(Liz;III)V")
    public static final void method747(class243 arg0, int arg1, int arg2) {
        if (arg0.field2925 == 1) {
            method2971(arg0.field2939, "", 24, 0, 0, arg0.field2822);
        }
        if (arg0.field2925 == 2 && !field1008) {
            String var3;
            if (class244.method3050(method1(arg0)) == 0) {
                var3 = null;
            } else if (arg0.field2901 == null || arg0.field2901.trim().length() == 0) {
                var3 = null;
            } else {
                var3 = arg0.field2901;
            }
            if (var3 != null) {
                method2971(var3, class87.method1978(65280) + arg0.field2938, 25, 0, -1, arg0.field2822);
            }
        }
        if (arg0.field2925 == 3) {
            method2971(class252.field3065, "", 26, 0, 0, arg0.field2822);
        }
        if (arg0.field2925 == 4) {
            method2971(arg0.field2939, "", 28, 0, 0, arg0.field2822);
        }
        if (arg0.field2925 == 5) {
            method2971(arg0.field2939, "", 29, 0, 0, arg0.field2822);
        }
        if (arg0.field2925 == 6 && field1018 == null) {
            method2971(arg0.field2939, "", 30, 0, -1, arg0.field2822);
        }
        if (arg0.field2824 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2838; var6++) {
                for (int var7 = 0; var7 < arg0.field2837; var7++) {
                    int var8 = (arg0.field2888 + 32) * var7;
                    int var9 = (arg0.field2864 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field2890[var5];
                        var9 += arg0.field2891[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && arg2 < var9 + 32) {
                        field963 = var5;
                        Statics.field1677 = arg0;
                        if (arg0.field2940[var5] > 0) {
                            class284 var10 = class284.method2027(arg0.field2940[var5] - 1);
                            if (field1005 == 1 && class244.method3547(method1(arg0))) {
                                if (Statics.field1006 != arg0.field2822 || Statics.field2959 != var5) {
                                    method2971(class252.field3171, field1012 + " " + class87.field1310 + " " + class87.method1978(16748608) + var10.field3692, 31, var10.field3654, var5, arg0.field2822);
                                }
                            } else if (!field1008 || !class244.method3547(method1(arg0))) {
                                String[] var11 = var10.field3671;
                                int var12 = -1;
                                if (field1080) {
                                    boolean var13 = field999 || class52.field620[81];
                                    if (var13) {
                                        var12 = var10.method4763();
                                    }
                                }
                                if (class244.method3547(method1(arg0))) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var12 != var14) {
                                            method1001(arg0, var10, var5, var14, false);
                                        }
                                    }
                                }
                                if (class244.method340(method1(arg0))) {
                                    method2971(class252.field3171, class87.method1978(16748608) + var10.field3692, 38, var10.field3654, var5, arg0.field2822);
                                }
                                if (class244.method3547(method1(arg0))) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        if (var12 != var15) {
                                            method1001(arg0, var10, var5, var15, false);
                                        }
                                    }
                                    if (var12 >= 0) {
                                        method1001(arg0, var10, var5, var12, true);
                                    }
                                }
                                String[] var16 = arg0.field2893;
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 39;
                                            }
                                            if (var17 == 1) {
                                                var18 = 40;
                                            }
                                            if (var17 == 2) {
                                                var18 = 41;
                                            }
                                            if (var17 == 3) {
                                                var18 = 42;
                                            }
                                            if (var17 == 4) {
                                                var18 = 43;
                                            }
                                            method2971(var16[var17], class87.method1978(16748608) + var10.field3692, var18, var10.field3654, var5, arg0.field2822);
                                        }
                                    }
                                }
                                method2971(class252.field3172, class87.method1978(16748608) + var10.field3692, 1005, var10.field3654, var5, arg0.field2822);
                            } else if ((Statics.field606 & 0x10) == 16) {
                                method2971(field1011, field1064 + " " + class87.field1310 + " " + class87.method1978(16748608) + var10.field3692, 32, var10.field3654, var5, arg0.field2822);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2900) {
            return;
        }
        if (!field1008) {
            for (int var19 = 9; var19 >= 5; var19--) {
                String var20 = method1161(arg0, var19);
                if (var20 != null) {
                    method2971(var20, arg0.field2821, 1007, var19 + 1, arg0.field2823, arg0.field2822);
                }
            }
            String var21;
            if (class244.method3050(method1(arg0)) == 0) {
                var21 = null;
            } else if (arg0.field2901 == null || arg0.field2901.trim().length() == 0) {
                var21 = null;
            } else {
                var21 = arg0.field2901;
            }
            if (var21 != null) {
                method2971(var21, arg0.field2821, 25, 0, arg0.field2823, arg0.field2822);
            }
            for (int var23 = 4; var23 >= 0; var23--) {
                String var24 = method1161(arg0, var23);
                if (var24 != null) {
                    method2971(var24, arg0.field2821, 57, var23 + 1, arg0.field2823, arg0.field2822);
                }
            }
            if (class244.method3245(method1(arg0))) {
                method2971(class252.field3257, "", 30, 0, arg0.field2823, arg0.field2822);
            }
        } else if (class244.method3280(method1(arg0)) && (Statics.field606 & 0x20) == 32) {
            method2971(field1011, field1064 + " " + class87.field1310 + " " + arg0.field2821, 58, 0, arg0.field2823, arg0.field2822);
        }
    }

    @ObfuscatedName("q.jd(ZI)V")
    public static void method91(boolean arg0) {
        field999 = arg0;
    }

    @ObfuscatedName("bq.ja(I)Z")
    public static boolean method735() {
        return field999;
    }

    @ObfuscatedName("ac.jw([Liz;IIIIIIIB)V")
    public static final void method233(class243[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class243 var9 = arg0[var8];
            if (var9 != null && (!var9.field2900 || var9.field2824 == 0 || var9.field2902 || method1(var9) != 0 || field1025 == var9 || var9.field2856 == 1338) && var9.field2841 == arg1 && (!var9.field2900 || !method687(var9))) {
                int var10 = var9.field2928 + arg6;
                int var11 = var9.field2826 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2824 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2824 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2837 + var10;
                    int var19 = var9.field2838 + var11;
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
                    int var22 = var9.field2837 + var10;
                    int var23 = var9.field2838 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1024 == var9) {
                    field1032 = true;
                    field902 = var10;
                    field1099 = var11;
                }
                if (!var9.field2900 || var12 < var14 && var13 < var15) {
                    int var24 = class61.field708;
                    int var25 = class61.field709;
                    if (class61.field711 != 0) {
                        var24 = class61.field715;
                        var25 = class61.field716;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2856 == 1337) {
                        if (!field996 && !field1000 && var26) {
                            if (field1005 == 0 && !field1008) {
                                method2971(class252.field3070, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var27 = -1;
                            int var28 = -1;
                            for (int var29 = 0; var29 < class133.field1901; var29++) {
                                int var30 = class133.field1902[var29];
                                int var31 = var30 & 0x7F;
                                int var32 = var30 >> 7 & 0x7F;
                                int var33 = var30 >> 29 & 0x3;
                                int var34 = var30 >> 14 & 0x7FFF;
                                if (var28 != var30) {
                                    var28 = var30;
                                    if (var33 == 2 && Statics.field2246.method2770(Statics.field226, var31, var32, var30) >= 0) {
                                        class283 var35 = class283.method1732(var34);
                                        if (var35.field3633 != null) {
                                            var35 = var35.method4699();
                                        }
                                        if (var35 == null) {
                                            continue;
                                        }
                                        if (field1005 == 1) {
                                            method2971(class252.field3171, field1012 + " " + class87.field1310 + " " + class87.method1978(65535) + var35.field3602, 1, var30, var31, var32);
                                        } else if (!field1008) {
                                            String[] var36 = var35.field3596;
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
                                                        method2971(var36[var37], class87.method1978(65535) + var35.field3602, var38, var30, var31, var32);
                                                    }
                                                }
                                            }
                                            method2971(class252.field3172, class87.method1978(65535) + var35.field3602, 1002, var35.field3599 << 14, var31, var32);
                                        } else if ((Statics.field606 & 0x4) == 4) {
                                            method2971(field1011, field1064 + " " + class87.field1310 + " " + class87.method1978(65535) + var35.field3602, 2, var30, var31, var32);
                                        }
                                    }
                                    if (var33 == 1) {
                                        class85 var39 = field894[var34];
                                        if (var39 == null) {
                                            continue;
                                        }
                                        if (var39.field1297.field3727 == 1 && (var39.field1154 & 0x7F) == 64 && (var39.field1148 & 0x7F) == 64) {
                                            for (int var40 = 0; var40 < field895; var40++) {
                                                class85 var41 = field894[field896[var40]];
                                                if (var41 != null && var39 != var41 && var41.field1297.field3727 == 1 && var39.field1154 == var41.field1154 && var39.field1148 == var41.field1148) {
                                                    method90(var41.field1297, field896[var40], var31, var32);
                                                }
                                            }
                                            int var42 = class94.field1408;
                                            int[] var43 = class94.field1406;
                                            for (int var44 = 0; var44 < var42; var44++) {
                                                class73 var45 = field1004[var43[var44]];
                                                if (var45 != null && var39.field1154 == var45.field1154 && var39.field1148 == var45.field1148) {
                                                    method4241(var45, var43[var44], var31, var32);
                                                }
                                            }
                                        }
                                        method90(var39.field1297, var34, var31, var32);
                                    }
                                    if (var33 == 0) {
                                        class73 var46 = field1004[var34];
                                        if (var46 == null) {
                                            continue;
                                        }
                                        if ((var46.field1154 & 0x7F) == 64 && (var46.field1148 & 0x7F) == 64) {
                                            for (int var47 = 0; var47 < field895; var47++) {
                                                class85 var48 = field894[field896[var47]];
                                                if (var48 != null && var48.field1297.field3727 == 1 && var46.field1154 == var48.field1154 && var46.field1148 == var48.field1148) {
                                                    method90(var48.field1297, field896[var47], var31, var32);
                                                }
                                            }
                                            int var49 = class94.field1408;
                                            int[] var50 = class94.field1406;
                                            for (int var51 = 0; var51 < var49; var51++) {
                                                class73 var52 = field1004[var50[var51]];
                                                if (var52 != null && var46 != var52 && var46.field1154 == var52.field1154 && var46.field1148 == var52.field1148) {
                                                    method4241(var52, var50[var51], var31, var32);
                                                }
                                            }
                                        }
                                        if (field979 == var34) {
                                            var27 = var30;
                                        } else {
                                            method4241(var46, var34, var31, var32);
                                        }
                                    }
                                    if (var33 == 3) {
                                        class218 var53 = field980[Statics.field226][var31][var32];
                                        if (var53 != null) {
                                            for (class93 var54 = (class93) var53.method3835(); var54 != null; var54 = (class93) var53.method3812()) {
                                                class284 var55 = class284.method2027(var54.field1401);
                                                if (field1005 == 1) {
                                                    method2971(class252.field3171, field1012 + " " + class87.field1310 + " " + class87.method1978(16748608) + var55.field3692, 16, var54.field1401, var31, var32);
                                                } else if (!field1008) {
                                                    String[] var56 = var55.field3660;
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
                                                            method2971(var56[var57], class87.method1978(16748608) + var55.field3692, var58, var54.field1401, var31, var32);
                                                        } else if (var57 == 2) {
                                                            method2971(class252.field3021, class87.method1978(16748608) + var55.field3692, 20, var54.field1401, var31, var32);
                                                        }
                                                    }
                                                    method2971(class252.field3172, class87.method1978(16748608) + var55.field3692, 1004, var54.field1401, var31, var32);
                                                } else if ((Statics.field606 & 0x1) == 1) {
                                                    method2971(field1011, field1064 + " " + class87.field1310 + " " + class87.method1978(16748608) + var55.field3692, 17, var54.field1401, var31, var32);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var27 != -1) {
                                int var59 = var27 & 0x7F;
                                int var60 = var27 >> 7 & 0x7F;
                                class73 var61 = field1004[field979];
                                method4241(var61, field979, var59, var60);
                            }
                        }
                    } else if (var9.field2856 == 1338) {
                        method733(var9, var10, var11);
                    } else {
                        if (var9.field2856 == 1400) {
                            Statics.field2585.method5613(class61.field708, class61.field709, var26, var10, var11, var9.field2837, var9.field2838);
                        }
                        if (!field1000 && var26) {
                            if (var9.field2856 == 1400) {
                                Statics.field2585.method5664(var10, var11, var9.field2837, var9.field2838, var24, var25);
                            } else {
                                method747(var9, var24 - var10, var25 - var11);
                            }
                        }
                        if (var9.field2824 == 0) {
                            if (!var9.field2900 && method687(var9) && Statics.field643 != var9) {
                                continue;
                            }
                            method233(arg0, var9.field2822, var12, var13, var14, var15, var10 - var9.field2951, var11 - var9.field2844);
                            if (var9.field2946 != null) {
                                method233(var9.field2946, var9.field2822, var12, var13, var14, var15, var10 - var9.field2951, var11 - var9.field2844);
                            }
                            class68 var62 = (class68) field1014.method3740((long) var9.field2822);
                            if (var62 != null) {
                                if (var62.field769 == 0 && class61.field708 >= var12 && class61.field709 >= var13 && class61.field708 < var14 && class61.field709 < var15 && !field1000) {
                                    for (class69 var63 = (class69) field1050.method3809(); var63 != null; var63 = (class69) field1050.method3832()) {
                                        if (var63.field776) {
                                            var63.method3796();
                                            var63.field778.field2947 = false;
                                        }
                                    }
                                    if (Statics.field353 == 0) {
                                        field1024 = null;
                                        field1025 = null;
                                    }
                                    if (!field1000) {
                                        method3086();
                                    }
                                }
                                int var64 = var62.field774;
                                if (class243.method1826(var64)) {
                                    method233(Statics.field2503[var64], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2900) {
                            if (var9.field2955) {
                                if (class61.field708 >= var12 && class61.field709 >= var13 && class61.field708 < var14 && class61.field709 < var15) {
                                    for (class69 var65 = (class69) field1050.method3809(); var65 != null; var65 = (class69) field1050.method3832()) {
                                        if (var65.field776) {
                                            var65.method3796();
                                            var65.field778.field2947 = false;
                                        }
                                    }
                                    if (Statics.field353 == 0) {
                                        field1024 = null;
                                        field1025 = null;
                                    }
                                    if (!field1000) {
                                        method3086();
                                    }
                                }
                            } else if (var9.field2956 && class61.field708 >= var12 && class61.field709 >= var13 && class61.field708 < var14 && class61.field709 < var15) {
                                for (class69 var66 = (class69) field1050.method3809(); var66 != null; var66 = (class69) field1050.method3832()) {
                                    if (var66.field776 && var66.field778.field2923 == var66.field786) {
                                        var66.method3796();
                                    }
                                }
                            }
                            boolean var67;
                            if (class61.field708 >= var12 && class61.field709 >= var13 && class61.field708 < var14 && class61.field709 < var15) {
                                var67 = true;
                            } else {
                                var67 = false;
                            }
                            boolean var68 = false;
                            if ((class61.field718 == 1 || !Statics.field2061 && class61.field718 == 4) && var67) {
                                var68 = true;
                            }
                            boolean var69 = false;
                            if ((class61.field711 == 1 || !Statics.field2061 && class61.field711 == 4) && class61.field715 >= var12 && class61.field716 >= var13 && class61.field715 < var14 && class61.field716 < var15) {
                                var69 = true;
                            }
                            if (var69) {
                                method3561(var9, class61.field715 - var10, class61.field716 - var11);
                            }
                            if (var9.field2856 == 1400) {
                                Statics.field2585.method5745(var24, var25, var67 & var68, var67 & var69);
                            }
                            if (field1024 != null && field1024 != var9 && var67) {
                                int var70 = method1(var9);
                                boolean var71 = (var70 >> 20 & 0x1) != 0;
                                if (var71) {
                                    field891 = var9;
                                }
                            }
                            if (field1025 == var9) {
                                field1029 = true;
                                field1030 = var10;
                                field955 = var11;
                            }
                            if (var9.field2902) {
                                if (var67 && field1049 != 0 && var9.field2923 != null) {
                                    class69 var72 = new class69();
                                    var72.field776 = true;
                                    var72.field778 = var9;
                                    var72.field781 = field1049;
                                    var72.field786 = var9.field2923;
                                    field1050.method3829(var72);
                                }
                                if (field1024 != null || Statics.field636 != null || field1000) {
                                    var69 = false;
                                    var68 = false;
                                    var67 = false;
                                }
                                if (!var9.field2907 && var69) {
                                    var9.field2907 = true;
                                    if (var9.field2904 != null) {
                                        class69 var73 = new class69();
                                        var73.field776 = true;
                                        var73.field778 = var9;
                                        var73.field788 = class61.field715 - var10;
                                        var73.field781 = class61.field716 - var11;
                                        var73.field786 = var9.field2904;
                                        field1050.method3829(var73);
                                    }
                                }
                                if (var9.field2907 && var68 && var9.field2905 != null) {
                                    class69 var74 = new class69();
                                    var74.field776 = true;
                                    var74.field778 = var9;
                                    var74.field788 = class61.field708 - var10;
                                    var74.field781 = class61.field709 - var11;
                                    var74.field786 = var9.field2905;
                                    field1050.method3829(var74);
                                }
                                if (var9.field2907 && !var68) {
                                    var9.field2907 = false;
                                    if (var9.field2906 != null) {
                                        class69 var75 = new class69();
                                        var75.field776 = true;
                                        var75.field778 = var9;
                                        var75.field788 = class61.field708 - var10;
                                        var75.field781 = class61.field709 - var11;
                                        var75.field786 = var9.field2906;
                                        field1052.method3829(var75);
                                    }
                                }
                                if (var68 && var9.field2857 != null) {
                                    class69 var76 = new class69();
                                    var76.field776 = true;
                                    var76.field778 = var9;
                                    var76.field788 = class61.field708 - var10;
                                    var76.field781 = class61.field709 - var11;
                                    var76.field786 = var9.field2857;
                                    field1050.method3829(var76);
                                }
                                if (!var9.field2947 && var67) {
                                    var9.field2947 = true;
                                    if (var9.field2918 != null) {
                                        class69 var77 = new class69();
                                        var77.field776 = true;
                                        var77.field778 = var9;
                                        var77.field788 = class61.field708 - var10;
                                        var77.field781 = class61.field709 - var11;
                                        var77.field786 = var9.field2918;
                                        field1050.method3829(var77);
                                    }
                                }
                                if (var9.field2947 && var67 && var9.field2894 != null) {
                                    class69 var78 = new class69();
                                    var78.field776 = true;
                                    var78.field778 = var9;
                                    var78.field788 = class61.field708 - var10;
                                    var78.field781 = class61.field709 - var11;
                                    var78.field786 = var9.field2894;
                                    field1050.method3829(var78);
                                }
                                if (var9.field2947 && !var67) {
                                    var9.field2947 = false;
                                    if (var9.field2896 != null) {
                                        class69 var79 = new class69();
                                        var79.field776 = true;
                                        var79.field778 = var9;
                                        var79.field788 = class61.field708 - var10;
                                        var79.field781 = class61.field709 - var11;
                                        var79.field786 = var9.field2896;
                                        field1052.method3829(var79);
                                    }
                                }
                                if (var9.field2937 != null) {
                                    class69 var80 = new class69();
                                    var80.field778 = var9;
                                    var80.field786 = var9.field2937;
                                    field977.method3829(var80);
                                }
                                if (var9.field2915 != null && field936 > var9.field2950) {
                                    if (var9.field2916 == null || field936 - var9.field2950 > 32) {
                                        class69 var85 = new class69();
                                        var85.field778 = var9;
                                        var85.field786 = var9.field2915;
                                        field1050.method3829(var85);
                                    } else {
                                        label820: for (int var81 = var9.field2950; var81 < field936; var81++) {
                                            int var82 = field1037[var81 & 0x1F];
                                            for (int var83 = 0; var83 < var9.field2916.length; var83++) {
                                                if (var9.field2916[var83] == var82) {
                                                    class69 var84 = new class69();
                                                    var84.field778 = var9;
                                                    var84.field786 = var9.field2915;
                                                    field1050.method3829(var84);
                                                    break label820;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2950 = field936;
                                }
                                if (var9.field2917 != null && field1033 > var9.field2836) {
                                    if (var9.field2922 == null || field1033 - var9.field2836 > 32) {
                                        class69 var90 = new class69();
                                        var90.field778 = var9;
                                        var90.field786 = var9.field2917;
                                        field1050.method3829(var90);
                                    } else {
                                        label796: for (int var86 = var9.field2836; var86 < field1033; var86++) {
                                            int var87 = field1039[var86 & 0x1F];
                                            for (int var88 = 0; var88 < var9.field2922.length; var88++) {
                                                if (var9.field2922[var88] == var87) {
                                                    class69 var89 = new class69();
                                                    var89.field778 = var9;
                                                    var89.field786 = var9.field2917;
                                                    field1050.method3829(var89);
                                                    break label796;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2836 = field1033;
                                }
                                if (var9.field2886 != null && field909 > var9.field2952) {
                                    if (var9.field2926 == null || field909 - var9.field2952 > 32) {
                                        class69 var95 = new class69();
                                        var95.field778 = var9;
                                        var95.field786 = var9.field2886;
                                        field1050.method3829(var95);
                                    } else {
                                        label772: for (int var91 = var9.field2952; var91 < field909; var91++) {
                                            int var92 = field1041[var91 & 0x1F];
                                            for (int var93 = 0; var93 < var9.field2926.length; var93++) {
                                                if (var9.field2926[var93] == var92) {
                                                    class69 var94 = new class69();
                                                    var94.field778 = var9;
                                                    var94.field786 = var9.field2886;
                                                    field1050.method3829(var94);
                                                    break label772;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2952 = field909;
                                }
                                if (field1043 > var9.field2949 && var9.field2924 != null) {
                                    class69 var96 = new class69();
                                    var96.field778 = var9;
                                    var96.field786 = var9.field2924;
                                    field1050.method3829(var96);
                                }
                                if (field1046 > var9.field2949 && var9.field2942 != null) {
                                    class69 var97 = new class69();
                                    var97.field778 = var9;
                                    var97.field786 = var9.field2942;
                                    field1050.method3829(var97);
                                }
                                if (field892 > var9.field2949 && var9.field2852 != null) {
                                    class69 var98 = new class69();
                                    var98.field778 = var9;
                                    var98.field786 = var9.field2852;
                                    field1050.method3829(var98);
                                }
                                if (field882 > var9.field2949 && var9.field2835 != null) {
                                    class69 var99 = new class69();
                                    var99.field778 = var9;
                                    var99.field786 = var9.field2835;
                                    field1050.method3829(var99);
                                }
                                if (field1047 > var9.field2949 && var9.field2933 != null) {
                                    class69 var100 = new class69();
                                    var100.field778 = var9;
                                    var100.field786 = var9.field2933;
                                    field1050.method3829(var100);
                                }
                                if (field988 > var9.field2949 && var9.field2920 != null) {
                                    class69 var101 = new class69();
                                    var101.field778 = var9;
                                    var101.field786 = var9.field2920;
                                    field1050.method3829(var101);
                                }
                                var9.field2949 = field1036;
                                if (var9.field2862 != null) {
                                    for (int var102 = 0; var102 < field1090; var102++) {
                                        class69 var103 = new class69();
                                        var103.field778 = var9;
                                        var103.field787 = field1040[var102];
                                        var103.field783 = field958[var102];
                                        var103.field786 = var9.field2862;
                                        field1050.method3829(var103);
                                    }
                                }
                            }
                        }
                        if (!var9.field2900 && field1024 == null && Statics.field636 == null && !field1000) {
                            if ((var9.field2863 >= 0 || var9.field2842 != 0) && class61.field708 >= var12 && class61.field709 >= var13 && class61.field708 < var14 && class61.field709 < var15) {
                                if (var9.field2863 >= 0) {
                                    Statics.field643 = arg0[var9.field2863];
                                } else {
                                    Statics.field643 = var9;
                                }
                            }
                            if (var9.field2824 == 8 && class61.field708 >= var12 && class61.field709 >= var13 && class61.field708 < var14 && class61.field709 < var15) {
                                Statics.field1951 = var9;
                            }
                            if (var9.field2846 > var9.field2838) {
                                int var104 = var9.field2837 + var10;
                                int var105 = var9.field2838;
                                int var106 = var9.field2846;
                                int var107 = class61.field708;
                                int var108 = class61.field709;
                                if (field919) {
                                    field920 = 32;
                                } else {
                                    field920 = 0;
                                }
                                field919 = false;
                                if (class61.field718 == 1 || !Statics.field2061 && class61.field718 == 4) {
                                    if (var107 >= var104 && var107 < var104 + 16 && var108 >= var11 && var108 < var11 + 16) {
                                        var9.field2844 -= 4;
                                        method89(var9);
                                    } else if (var107 >= var104 && var107 < var104 + 16 && var108 >= var11 + var105 - 16 && var108 < var11 + var105) {
                                        var9.field2844 += 4;
                                        method89(var9);
                                    } else if (var107 >= var104 - field920 && var107 < field920 + var104 + 16 && var108 >= var11 + 16 && var108 < var11 + var105 - 16) {
                                        int var109 = (var105 - 32) * var105 / var106;
                                        if (var109 < 8) {
                                            var109 = 8;
                                        }
                                        int var110 = var108 - var11 - 16 - var109 / 2;
                                        int var111 = var105 - 32 - var109;
                                        var9.field2844 = (var106 - var105) * var110 / var111;
                                        method89(var9);
                                        field919 = true;
                                    }
                                }
                                if (field1049 != 0) {
                                    int var112 = var9.field2837;
                                    if (var107 >= var104 - var112 && var108 >= var11 && var107 < var104 + 16 && var108 <= var11 + var105) {
                                        var9.field2844 += field1049 * 45;
                                        method89(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cp.jk(III)V")
    public static final void method1799(int arg0, int arg1) {
        if (class243.method1826(arg0)) {
            method996(Statics.field2503[arg0], arg1);
        }
    }

    @ObfuscatedName("bb.jx([Liz;II)V")
    public static final void method996(class243[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class243 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2824 == 0) {
                    if (var3.field2946 != null) {
                        method996(var3.field2946, arg1);
                    }
                    class68 var4 = (class68) field1014.method3740((long) var3.field2822);
                    if (var4 != null) {
                        method1799(var4.field774, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2885 != null) {
                    class69 var5 = new class69();
                    var5.field778 = var3;
                    var5.field786 = var3.field2885;
                    class82.method1108(var5);
                }
                if (arg1 == 1 && var3.field2930 != null) {
                    if (var3.field2823 >= 0) {
                        class243 var6 = class243.method123(var3.field2822);
                        if (var6 == null || var6.field2946 == null || var3.field2823 >= var6.field2946.length || var6.field2946[var3.field2823] != var3) {
                            continue;
                        }
                    }
                    class69 var7 = new class69();
                    var7.field778 = var3;
                    var7.field786 = var3.field2930;
                    class82.method1108(var7);
                }
            }
        }
    }

    @ObfuscatedName("gl.jf(Liz;IIB)V")
    public static final void method3561(class243 arg0, int arg1, int arg2) {
        if (field1024 != null || field1000 || arg0 == null || method526(arg0) == null) {
            return;
        }
        field1024 = arg0;
        field1025 = method526(arg0);
        field1026 = arg1;
        field893 = arg2;
        Statics.field353 = 0;
        field1035 = false;
        int var3 = method783();
        if (var3 != -1) {
            method1839(var3);
        }
    }

    @ObfuscatedName("client.jp(I)V")
    public final void method1193() {
        method89(field1024);
        Statics.field353++;
        if (field1032 && field1029) {
            int var1 = class61.field708;
            int var2 = class61.field709;
            int var3 = var1 - field1026;
            int var4 = var2 - field893;
            if (var3 < field1030) {
                var3 = field1030;
            }
            if (field1024.field2837 + var3 > field1030 + field1025.field2837) {
                var3 = field1030 + field1025.field2837 - field1024.field2837;
            }
            if (var4 < field955) {
                var4 = field955;
            }
            if (field1024.field2838 + var4 > field955 + field1025.field2838) {
                var4 = field955 + field1025.field2838 - field1024.field2838;
            }
            int var5 = var3 - field902;
            int var6 = var4 - field1099;
            int var7 = field1024.field2861;
            if (Statics.field353 > field1024.field2899 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1035 = true;
            }
            int var8 = field1025.field2951 + (var3 - field1030);
            int var9 = field1025.field2844 + (var4 - field955);
            if (field1024.field2911 != null && field1035) {
                class69 var10 = new class69();
                var10.field778 = field1024;
                var10.field788 = var8;
                var10.field781 = var9;
                var10.field786 = field1024.field2911;
                class82.method1108(var10);
            }
            if (class61.field718 == 0) {
                if (field1035) {
                    if (field1024.field2912 != null) {
                        class69 var11 = new class69();
                        var11.field778 = field1024;
                        var11.field788 = var8;
                        var11.field781 = var9;
                        var11.field777 = field891;
                        var11.field786 = field1024.field2912;
                        class82.method1108(var11);
                    }
                    if (field891 != null) {
                        class243 var12 = field1024;
                        int var13 = method1(var12);
                        int var14 = var13 >> 17 & 0x7;
                        int var15 = var14;
                        class243 var16;
                        if (var14 == 0) {
                            var16 = null;
                        } else {
                            int var17 = 0;
                            while (true) {
                                if (var17 >= var15) {
                                    var16 = var12;
                                    break;
                                }
                                var12 = class243.method123(var12.field2841);
                                if (var12 == null) {
                                    var16 = null;
                                    break;
                                }
                                var17++;
                            }
                        }
                        if (var16 != null) {
                            class185 var18 = class185.method2191(class182.field2404, field912.field1461);
                            var18.field2489.method3354(field891.field2822);
                            var18.field2489.method3342(field891.field2823);
                            var18.field2489.method3343(field1024.field2823);
                            var18.field2489.method3342(field891.field2892);
                            var18.field2489.method3353(field1024.field2822);
                            var18.field2489.method3343(field1024.field2892);
                            field912.method1999(var18);
                        }
                    }
                } else if (this.method1189()) {
                    this.method1190(field902 + field1026, field893 + field1099);
                } else if (field989 > 0) {
                    method1035(field902 + field1026, field893 + field1099);
                }
                field1024 = null;
            }
        } else if (Statics.field353 > 1) {
            field1024 = null;
        }
    }

    @ObfuscatedName("ck.jn(II)V")
    public static void method1839(int arg0) {
        Statics.field3423 = new class88();
        Statics.field3423.field1322 = field933[arg0];
        Statics.field3423.field1320 = field991[arg0];
        Statics.field3423.field1321 = field1031[arg0];
        Statics.field3423.field1319 = field993[arg0];
        Statics.field3423.field1323 = field1105[arg0];
    }

    @ObfuscatedName("bk.jv(III)V")
    public static void method1035(int arg0, int arg1) {
        method62(Statics.field3423, arg0, arg1);
        Statics.field3423 = null;
    }

    @ObfuscatedName("q.jg(Liz;I)V")
    public static void method89(class243 arg0) {
        if (field1055 == arg0.field2834) {
            field1056[arg0.field2953] = true;
        }
    }

    @ObfuscatedName("dw.jj(B)V")
    public static void method2561() {
        for (class68 var0 = (class68) field1014.method3749(); var0 != null; var0 = (class68) field1014.method3744()) {
            int var1 = var0.field774;
            if (class243.method1826(var1)) {
                boolean var2 = true;
                class243[] var3 = Statics.field2503[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2900;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2660;
                    class243 var6 = class243.method123(var5);
                    if (var6 != null) {
                        method89(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ab.jy(Liz;I)Liz;")
    public static class243 method526(class243 arg0) {
        class243 var1 = arg0;
        int var2 = method1(arg0);
        int var3 = var2 >> 17 & 0x7;
        int var4 = var3;
        class243 var5;
        if (var3 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var1;
                    break;
                }
                var1 = class243.method123(var1.field2841);
                if (var1 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class243 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2932;
        }
        return var7;
    }

    @ObfuscatedName("ag.jc(IB)V")
    public static final void method240(int arg0) {
        if (!class243.method1826(arg0)) {
            return;
        }
        class243[] var1 = Statics.field2503[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class243 var3 = var1[var2];
            if (var3 != null) {
                var3.field2944 = 0;
                var3.field2897 = 0;
            }
        }
    }

    @ObfuscatedName("j.jh(II)V")
    public static final void method131(int arg0) {
        if (class243.method1826(arg0)) {
            method4263(Statics.field2503[arg0], -1);
        }
    }

    @ObfuscatedName("jb.jq([Liz;II)V")
    public static final void method4263(class243[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class243 var3 = arg0[var2];
            if (var3 != null && var3.field2841 == arg1 && (!var3.field2900 || !method687(var3))) {
                if (var3.field2824 == 0) {
                    if (!var3.field2900 && method687(var3) && Statics.field643 != var3) {
                        continue;
                    }
                    method4263(arg0, var3.field2822);
                    if (var3.field2946 != null) {
                        method4263(var3.field2946, var3.field2822);
                    }
                    class68 var4 = (class68) field1014.method3740((long) var3.field2822);
                    if (var4 != null) {
                        method131(var4.field774);
                    }
                }
                if (var3.field2824 == 6) {
                    if (var3.field2869 != -1 || var3.field2870 != -1) {
                        boolean var5 = method2957(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2870;
                        } else {
                            var6 = var3.field2869;
                        }
                        if (var6 != -1) {
                            class288 var7 = class288.method1825(var6);
                            var3.field2897 += field914;
                            while (var3.field2897 > var7.field3757[var3.field2944]) {
                                var3.field2897 -= var7.field3757[var3.field2944];
                                var3.field2944++;
                                if (var3.field2944 >= var7.field3762.length) {
                                    var3.field2944 -= var7.field3766;
                                    if (var3.field2944 < 0 || var3.field2944 >= var7.field3762.length) {
                                        var3.field2944 = 0;
                                    }
                                }
                                method89(var3);
                            }
                        }
                    }
                    if (var3.field2908 != 0 && !var3.field2900) {
                        int var8 = var3.field2908 >> 16;
                        int var9 = var3.field2908 << 16 >> 16;
                        int var10 = field914 * var8;
                        int var11 = field914 * var9;
                        var3.field2873 = var3.field2873 + var10 & 0x7FF;
                        var3.field2874 = var3.field2874 + var11 & 0x7FF;
                        method89(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cw.jz(II)V")
    public static final void method1977(int arg0) {
        method2561();
        for (class81 var1 = (class81) class81.field1248.method3809(); var1 != null; var1 = (class81) class81.field1248.method3832()) {
            if (var1.field1258 != null) {
                var1.method1726();
            }
        }
        int var2 = class269.method1109(arg0).field3448;
        if (var2 == 0) {
            return;
        }
        int var3 = class238.field2788[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class135.method2676(0.9D);
                ((class124) Statics.field1936).method2453(0.9D);
            }
            if (var3 == 2) {
                class135.method2676(0.8D);
                ((class124) Statics.field1936).method2453(0.8D);
            }
            if (var3 == 3) {
                class135.method2676(0.7D);
                ((class124) Statics.field1936).method2453(0.7D);
            }
            if (var3 == 4) {
                class135.method2676(0.6D);
                ((class124) Statics.field1936).method2453(0.6D);
            }
            class284.field3652.method3709();
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
            if (field1084 != var4) {
                if (field1084 == 0 && field1085 != -1) {
                    class230.method3043(Statics.field235, field1085, 0, var4, false);
                    field1086 = false;
                } else if (var4 == 0) {
                    class230.method609();
                    field1086 = false;
                } else {
                    class230.method1649(var4);
                }
                field1084 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field1087 = 127;
            }
            if (var3 == 1) {
                field1087 = 96;
            }
            if (var3 == 2) {
                field1087 = 64;
            }
            if (var3 == 3) {
                field1087 = 32;
            }
            if (var3 == 4) {
                field1087 = 0;
            }
        }
        if (var2 == 5) {
            field987 = var3;
        }
        if (var2 == 6) {
            field1015 = var3;
        }
        if (var2 == 9) {
            field971 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field1019 = 127;
            }
            if (var3 == 1) {
                field1019 = 96;
            }
            if (var3 == 2) {
                field1019 = 64;
            }
            if (var3 == 3) {
                field1019 = 32;
            }
            if (var3 == 4) {
                field1019 = 0;
            }
        }
        if (var2 == 17) {
            field1058 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class90[] var5 = new class90[] { class90.field1331, class90.field1329, class90.field1330, class90.field1332 };
            field879 = (class90) Statics.method3233(var5, var3);
            if (field879 == null) {
                field879 = class90.field1330;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field979 = -1;
            } else {
                field979 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class90[] var6 = new class90[] { class90.field1331, class90.field1329, class90.field1330, class90.field1332 };
        field880 = (class90) Statics.method3233(var6, var3);
        if (field880 == null) {
            field880 = class90.field1330;
        }
    }

    @ObfuscatedName("cg.jl(Liz;B)V")
    public static final void method1843(class243 arg0) {
        int var1 = arg0.field2856;
        if (var1 == 324) {
            if (field1078 == -1) {
                field1078 = arg0.field2954;
                field1116 = arg0.field2858;
            }
            if (field1114.field2797) {
                arg0.field2954 = field1078;
            } else {
                arg0.field2954 = field1116;
            }
        } else if (var1 == 325) {
            if (field1078 == -1) {
                field1078 = arg0.field2954;
                field1116 = arg0.field2858;
            }
            if (field1114.field2797) {
                arg0.field2954 = field1116;
            } else {
                arg0.field2954 = field1078;
            }
        } else if (var1 == 327) {
            arg0.field2873 = 150;
            arg0.field2874 = (int) (Math.sin((double) field913 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2898 = 5;
            arg0.field2866 = 0;
        } else if (var1 == 328) {
            arg0.field2873 = 150;
            arg0.field2874 = (int) (Math.sin((double) field913 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2898 = 5;
            arg0.field2866 = 1;
        }
    }

    @ObfuscatedName("fl.js(I)V")
    public static final void method3087() {
        class185 var0 = class185.method2191(class182.field2401, field912.field1461);
        field912.method1999(var0);
        for (class68 var1 = (class68) field1014.method3749(); var1 != null; var1 = (class68) field1014.method3744()) {
            if (var1.field769 == 0 || var1.field769 == 3) {
                method3155(var1, true);
            }
        }
        if (field1018 != null) {
            method89(field1018);
            field1018 = null;
        }
    }

    @ObfuscatedName("t.ju(IIII)Lbt;")
    public static final class68 method181(int arg0, int arg1, int arg2) {
        class68 var3 = new class68();
        var3.field774 = arg1;
        var3.field769 = arg2;
        field1014.method3741(var3, (long) arg0);
        method240(arg1);
        class243 var4 = class243.method123(arg0);
        method89(var4);
        if (field1018 != null) {
            method89(field1018);
            field1018 = null;
        }
        method4421();
        method337(Statics.field2503[arg0 >> 16], var4, false);
        class82.method1962(arg1);
        if (field888 != -1) {
            method1799(field888, 1);
        }
        return var3;
    }

    @ObfuscatedName("fr.jt(Lbt;ZB)V")
    public static final void method3155(class68 arg0, boolean arg1) {
        int var2 = arg0.field774;
        int var3 = (int) arg0.field2660;
        arg0.method3796();
        if (arg1 && var2 != -1 && Statics.field3019[var2]) {
            Statics.field2814.method4299(var2);
            if (Statics.field2503[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2503[var2].length; var5++) {
                    if (Statics.field2503[var2][var5] != null) {
                        if (Statics.field2503[var2][var5].field2824 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2503[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2503[var2] = null;
                }
                Statics.field3019[var2] = false;
            }
        }
        for (class224 var6 = (class224) field1021.method3749(); var6 != null; var6 = (class224) field1021.method3744()) {
            if ((var6.field2660 >> 48 & 0xFFFFL) == (long) var2) {
                var6.method3796();
            }
        }
        class243 var7 = class243.method123(var3);
        if (var7 != null) {
            method89(var7);
        }
        method4421();
        if (field888 != -1) {
            method1799(field888, 1);
        }
    }

    @ObfuscatedName("cq.je(Liz;I)Z")
    public static final boolean method2004(class243 arg0) {
        int var1 = arg0.field2856;
        if (var1 == 205) {
            field900 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1114.method4133(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1114.method4134(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1114.method4131(false);
        }
        if (var1 == 325) {
            field1114.method4131(true);
        }
        if (var1 == 326) {
            class185 var6 = class185.method2191(class182.field2446, field912.field1461);
            field1114.method4136(var6.field2489);
            field912.method1999(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("v.kk(Liz;IIII)V")
    public static final void method140(class243 arg0, int arg1, int arg2, int arg3) {
        method510();
        class237 var4 = arg0.method4186(false);
        if (var4 == null) {
            return;
        }
        class328.method5354(arg1, arg2, var4.field2781 + arg1, var4.field2783 + arg2);
        if (field1083 == 2 || field1083 == 5) {
            class328.method5376(arg1, arg2, 0, var4.field2780, var4.field2782);
        } else {
            int var5 = field922 & 0x7FF;
            int var6 = Statics.field3435.field1154 / 32 + 48;
            int var7 = 464 - Statics.field3435.field1148 / 32;
            Statics.field566.method5477(arg1, arg2, var4.field2781, var4.field2783, var6, var7, var5, 256, var4.field2780, var4.field2782);
            for (int var8 = 0; var8 < field1115; var8++) {
                int var9 = field1106[var8] * 4 + 2 - Statics.field3435.field1154 / 32;
                int var10 = field1088[var8] * 4 + 2 - Statics.field3435.field1148 / 32;
                method5108(arg1, arg2, var9, var10, field1016[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class218 var13 = field980[Statics.field226][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field3435.field1154 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field3435.field1148 / 32;
                        method5108(arg1, arg2, var14, var15, Statics.field17[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field895; var16++) {
                class85 var17 = field894[field896[var16]];
                if (var17 != null && var17.method1123()) {
                    class286 var18 = var17.field1297;
                    if (var18 != null && var18.field3723 != null) {
                        var18 = var18.method4806();
                    }
                    if (var18 != null && var18.field3728 && var18.field3740) {
                        int var19 = var17.field1154 / 32 - Statics.field3435.field1154 / 32;
                        int var20 = var17.field1148 / 32 - Statics.field3435.field1148 / 32;
                        method5108(arg1, arg2, var19, var20, Statics.field17[1], var4);
                    }
                }
            }
            int var21 = class94.field1408;
            int[] var22 = class94.field1406;
            for (int var23 = 0; var23 < var21; var23++) {
                class73 var24 = field1004[var22[var23]];
                if (var24 != null && var24.method1123() && !var24.field836 && Statics.field3435 != var24) {
                    int var25 = var24.field1154 / 32 - Statics.field3435.field1154 / 32;
                    int var26 = var24.field1148 / 32 - Statics.field3435.field1148 / 32;
                    boolean var27 = false;
                    if (Statics.field3435.field835 != 0 && var24.field835 != 0 && Statics.field3435.field835 == var24.field835) {
                        var27 = true;
                    }
                    if (var24.method1113()) {
                        method5108(arg1, arg2, var25, var26, Statics.field17[3], var4);
                    } else if (var27) {
                        method5108(arg1, arg2, var25, var26, Statics.field17[4], var4);
                    } else if (var24.method1136()) {
                        method5108(arg1, arg2, var25, var26, Statics.field17[5], var4);
                    } else {
                        method5108(arg1, arg2, var25, var26, Statics.field17[2], var4);
                    }
                }
            }
            if (field871 != 0 && field913 % 20 < 10) {
                if (field871 == 1 && field872 >= 0 && field872 < field894.length) {
                    class85 var28 = field894[field872];
                    if (var28 != null) {
                        int var29 = var28.field1154 / 32 - Statics.field3435.field1154 / 32;
                        int var30 = var28.field1148 / 32 - Statics.field3435.field1148 / 32;
                        method531(arg1, arg2, var29, var30, Statics.field766[1], var4);
                    }
                }
                if (field871 == 2) {
                    int var31 = field1118 * 4 - Statics.field2465 * 4 + 2 - Statics.field3435.field1154 / 32;
                    int var32 = field875 * 4 - Statics.field594 * 4 + 2 - Statics.field3435.field1148 / 32;
                    method531(arg1, arg2, var31, var32, Statics.field766[1], var4);
                }
                if (field871 == 10 && field978 >= 0 && field978 < field1004.length) {
                    class73 var33 = field1004[field978];
                    if (var33 != null) {
                        int var34 = var33.field1154 / 32 - Statics.field3435.field1154 / 32;
                        int var35 = var33.field1148 / 32 - Statics.field3435.field1148 / 32;
                        method531(arg1, arg2, var34, var35, Statics.field766[1], var4);
                    }
                }
            }
            if (field1023 != 0) {
                int var36 = field1023 * 4 + 2 - Statics.field3435.field1154 / 32;
                int var37 = field1082 * 4 + 2 - Statics.field3435.field1148 / 32;
                method5108(arg1, arg2, var36, var37, Statics.field766[0], var4);
            }
            if (!Statics.field3435.field836) {
                class328.method5362(var4.field2781 / 2 + arg1 - 1, var4.field2783 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field1057[arg3] = true;
    }

    @ObfuscatedName("al.kc(IIIILlv;Lin;B)V")
    public static final void method531(int arg0, int arg1, int arg2, int arg3, class332 arg4, class237 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method5108(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field922 & 0x7FF;
        int var8 = class135.field1939[var7];
        int var9 = class135.field1921[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2781 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field2729.method5512(arg5.field2781 / 2 + arg0 - var17 / 2 + var15, arg5.field2783 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("ki.ko(IIIILlv;Lin;I)V")
    public static final void method5108(int arg0, int arg1, int arg2, int arg3, class332 arg4, class237 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field922 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class135.field1939[var6];
        int var9 = class135.field1921[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5476(arg5.field2781 / 2 + var10 - arg4.field3992 / 2, arg5.field2783 / 2 - var11 - arg4.field3990 / 2, arg0, arg1, arg5.field2781, arg5.field2783, arg5.field2780, arg5.field2782);
        } else {
            arg4.method5524(arg5.field2781 / 2 + arg0 + var10 - arg4.field3992 / 2, arg5.field2783 / 2 + arg1 - var11 - arg4.field3990 / 2);
        }
    }

    @ObfuscatedName("x.ks(S)V")
    public static final void method172() {
        class96.method728();
        if (Statics.field2474 != null) {
            Statics.field2474.method5089();
        }
    }

    @ObfuscatedName("k.kq(B)V")
    public static final void method152() {
        for (int var0 = 0; var0 < class94.field1408; var0++) {
            class73 var1 = field1004[class94.field1406[var0]];
            var1.method1117();
        }
    }

    @ObfuscatedName("n.kw(Ljava/lang/String;S)V")
    public static final void method13(String arg0) {
        if (Statics.field2474 != null) {
            class185 var1 = class185.method2191(class182.field2413, field912.field1461);
            var1.field2489.method3363(class195.method1963(arg0));
            var1.field2489.method3300(arg0);
            field912.method1999(var1);
        }
    }

    @ObfuscatedName("dm.kt(Ljava/lang/String;I)V")
    public static final void method2424(String arg0) {
        if (!arg0.equals("")) {
            class185 var1 = class185.method2191(class182.field2441, field912.field1461);
            var1.field2489.method3363(class195.method1963(arg0));
            var1.field2489.method3300(arg0);
            field912.method1999(var1);
        }
    }

    @ObfuscatedName("cv.kz(B)V")
    public static final void method1725() {
        class185 var0 = class185.method2191(class182.field2441, field912.field1461);
        var0.field2489.method3363(0);
        field912.method1999(var0);
    }

    @ObfuscatedName("e.kj(Liz;I)I")
    public static int method1(class243 arg0) {
        class224 var1 = (class224) field1021.method3740(((long) arg0.field2822 << 32) + (long) arg0.field2823);
        return var1 == null ? arg0.field2825 : var1.field2675;
    }

    @ObfuscatedName("ae.kd(Liz;I)Z")
    public static boolean method687(class243 arg0) {
        return arg0.field2845;
    }

    @ObfuscatedName("by.kg(Liz;IB)Ljava/lang/String;")
    public static String method1161(class243 arg0, int arg1) {
        if (!class244.method2938(method1(arg0), arg1) && arg0.field2895 == null) {
            return null;
        } else if (arg0.field2816 == null || arg0.field2816.length <= arg1 || arg0.field2816[arg1] == null || arg0.field2816[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2816[arg1];
        }
    }

    @ObfuscatedName("ji.kl(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method4403(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field855 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field855 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field855 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field855 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field855 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field357 != null) {
            var3 = "/p=" + Statics.field357;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field1020 + "/a=" + Statics.field2516 + var3 + "/";
    }

    @ObfuscatedName("ef.km(Ljava/lang/String;B)V")
    public static void method2739(String arg0) {
        Statics.field357 = arg0;
        try {
            String var1 = Statics.field3445.getParameter(class294.field3813.field3815);
            String var2 = Statics.field3445.getParameter(class294.field3801.field3815);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class197.method4873() + 94608000000L;
                class205.field2625.setTime(new Date(var6));
                int var8 = class205.field2625.get(7);
                int var9 = class205.field2625.get(5);
                int var10 = class205.field2625.get(2);
                int var11 = class205.field2625.get(1);
                int var12 = class205.field2625.get(11);
                int var13 = class205.field2625.get(12);
                int var14 = class205.field2625.get(13);
                String var15 = class205.field2624[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class205.field2629[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field3445;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }

    @ObfuscatedName("eg.kn(Ljava/lang/String;ZB)V")
    public static void method2574(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3644; var5++) {
            class284 var6 = class284.method2027(var5);
            if ((!arg1 || var6.field3696) && var6.field3688 == -1 && var6.field3692.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field773 = -1;
                    Statics.field367 = null;
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
        Statics.field367 = var3;
        Statics.field847 = 0;
        Statics.field773 = var4;
        String[] var9 = new String[Statics.field773];
        for (int var10 = 0; var10 < Statics.field773; var10++) {
            var9[var10] = class284.method2027(var3[var10]).field3692;
        }
        class192.method239(var9, Statics.field367);
    }

    @ObfuscatedName("go.ka([BII)V")
    public static void method3606(byte[] arg0, int arg1) {
        if (field1072 == null) {
            field1072 = new byte[24];
        }
        class206.method3622(arg0, arg1, field1072, 0, 24);
    }

    @ObfuscatedName("gc.ku(Lgg;II)V")
    public static void method3269(class195 arg0, int arg1) {
        method3606(arg0.field2563, arg1);
        class168.method63(arg0, arg1);
    }

    @ObfuscatedName("eg.kx(Lgg;B)V")
    public static void method2571(class195 arg0) {
        if (field1072 == null) {
            byte[] var1 = class168.method1659();
            arg0.method3504(var1, 0, var1.length);
        } else {
            arg0.method3504(field1072, 0, field1072.length);
        }
    }

    @ObfuscatedName("client.kf(I)Lkb;")
    public class306 method1194() {
        return Statics.field3435 == null ? null : Statics.field3435.field829;
    }

    @ObfuscatedName("al.ky(IIIZB)V")
    public static void method541(int arg0, int arg1, int arg2, boolean arg3) {
        class185 var4 = class185.method2191(class182.field2367, field912.field1461);
        var4.field2489.method3476(arg0);
        var4.field2489.method3476(arg1);
        var4.field2489.method3334(arg2);
        var4.field2489.method3319(arg3 ? field934 : 0);
        field912.method1999(var4);
    }

    @ObfuscatedName("ap.kb(B)Z")
    public static boolean method595() {
        return field997 >= 2;
    }

    @ObfuscatedName("d.ke(B)V")
    public static void method61() {
        field912.method1999(class185.method2191(class182.field2411, field912.field1461));
        field927 = 0;
    }

    @ObfuscatedName("as.ki(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method322(String arg0) {
        class257[] var1 = Statics.method2482();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class257 var3 = var1[var2];
            if (var3.field3335 != -1 && arg0.startsWith(class87.method4176(var3.field3335))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3335).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("m.kp(B)V")
    public static void method167() {
        if (Statics.field327 == null) {
            return;
        }
        field1054 = field913;
        Statics.field327.method4433();
        for (int var0 = 0; var0 < field1004.length; var0++) {
            if (field1004[var0] != null) {
                Statics.field327.method4425((field1004[var0].field1154 >> 7) + Statics.field2465, (field1004[var0].field1148 >> 7) + Statics.field594);
            }
        }
    }
}

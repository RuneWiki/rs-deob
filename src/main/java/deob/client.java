package deob;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import netscape.javascript.JSObject;

public final class client extends class59 {

    @ObfuscatedName("client.w")
    public static class167[] field1090 = new class167[4];

    @ObfuscatedName("client.au")
    public static boolean field1100 = true;

    @ObfuscatedName("client.bb")
    public static int field847 = 1;

    @ObfuscatedName("client.bc")
    public static int field891 = 0;

    @ObfuscatedName("client.bn")
    public static int field849 = 0;

    @ObfuscatedName("client.be")
    public static boolean field850 = false;

    @ObfuscatedName("client.bx")
    public static boolean field1002 = false;

    @ObfuscatedName("client.bw")
    public static int field852 = 0;

    @ObfuscatedName("client.bh")
    public static int field982 = 0;

    @ObfuscatedName("client.bm")
    public static boolean field854 = true;

    @ObfuscatedName("client.bt")
    public static int field963 = 0;

    @ObfuscatedName("client.by")
    public static long field984 = 1L;

    @ObfuscatedName("client.bl")
    public static int field1017 = -1;

    @ObfuscatedName("client.bv")
    public static int field967 = -1;

    @ObfuscatedName("client.bd")
    public static int field859 = -1;

    @ObfuscatedName("client.bj")
    public static boolean field860 = true;

    @ObfuscatedName("client.ba")
    public static boolean field1055 = false;

    @ObfuscatedName("client.bu")
    public static int field862 = 0;

    @ObfuscatedName("client.bo")
    public static int field863 = 0;

    @ObfuscatedName("client.br")
    public static int field1098 = 0;

    @ObfuscatedName("client.ch")
    public static int field865 = 0;

    @ObfuscatedName("client.cp")
    public static int field866 = 0;

    @ObfuscatedName("client.cf")
    public static int field867 = 0;

    @ObfuscatedName("client.cb")
    public static int field1075 = 0;

    @ObfuscatedName("client.cv")
    public static int field869 = 0;

    @ObfuscatedName("client.cj")
    public static int field870 = 0;

    @ObfuscatedName("client.ci")
    public static class91 field871 = class91.field1311;

    @ObfuscatedName("client.ce")
    public static class91 field935 = class91.field1311;

    @ObfuscatedName("client.cw")
    public static int field940 = 0;

    @ObfuscatedName("client.cr")
    public static int field874 = 0;

    @ObfuscatedName("client.co")
    public static int field875 = 0;

    @ObfuscatedName("client.de")
    public static int field876 = 0;

    @ObfuscatedName("client.dw")
    public static int field881 = 0;

    @ObfuscatedName("client.dk")
    public static int field1014 = 0;

    @ObfuscatedName("client.dr")
    public static int field1005 = 0;

    @ObfuscatedName("client.dz")
    public static int field880 = 0;

    @ObfuscatedName("client.dg")
    public static class151 field1064 = class151.field2092;

    @ObfuscatedName("client.dv")
    public static byte[] field1035 = null;

    @ObfuscatedName("client.dm")
    public static class86[] field884 = new class86[32768];

    @ObfuscatedName("client.df")
    public static int field885 = 0;

    @ObfuscatedName("client.dq")
    public static int[] field886 = new int[32768];

    @ObfuscatedName("client.dp")
    public static int field1099 = 0;

    @ObfuscatedName("client.eu")
    public static int[] field888 = new int[250];

    @ObfuscatedName("client.ej")
    public static final class101 field889 = new class101();

    @ObfuscatedName("client.es")
    public static int field882 = 0;

    @ObfuscatedName("client.ed")
    public static boolean field1096 = false;

    @ObfuscatedName("client.eg")
    public static boolean field892 = true;

    @ObfuscatedName("client.eh")
    public static class288 field893 = new class288();

    @ObfuscatedName("client.ey")
    public static HashMap field894 = new HashMap();

    @ObfuscatedName("client.en")
    public static int field896 = 0;

    @ObfuscatedName("client.ew")
    public static int field897 = 1;

    @ObfuscatedName("client.er")
    public static int field898 = 0;

    @ObfuscatedName("client.eo")
    public static int field899 = 1;

    @ObfuscatedName("client.ev")
    public static int field900 = 0;

    @ObfuscatedName("client.fl")
    public static boolean field945 = false;

    @ObfuscatedName("client.fv")
    public static int[][][] field903 = new int[4][13][13];

    @ObfuscatedName("client.fr")
    public static final int[] field904 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fk")
    public static int field848 = 0;

    @ObfuscatedName("client.fc")
    public static int field906 = 2301979;

    @ObfuscatedName("client.fy")
    public static int field907 = 5063219;

    @ObfuscatedName("client.gk")
    public static int field908 = 3353893;

    @ObfuscatedName("client.gt")
    public static int field909 = 7759444;

    @ObfuscatedName("client.gh")
    public static boolean field910 = false;

    @ObfuscatedName("client.ge")
    public static int field857 = 0;

    @ObfuscatedName("client.gj")
    public static int field999 = 128;

    @ObfuscatedName("client.gb")
    public static int field913 = 0;

    @ObfuscatedName("client.gw")
    public static int field988 = 0;

    @ObfuscatedName("client.gf")
    public static int field902 = 0;

    @ObfuscatedName("client.gx")
    public static int field916 = 0;

    @ObfuscatedName("client.gq")
    public static int field917 = 0;

    @ObfuscatedName("client.gr")
    public static int field1015 = 50;

    @ObfuscatedName("client.gu")
    public static int field1022 = 0;

    @ObfuscatedName("client.gp")
    public static boolean field920 = false;

    @ObfuscatedName("client.go")
    public static int field921 = 0;

    @ObfuscatedName("client.gn")
    public static int field922 = 0;

    @ObfuscatedName("client.gl")
    public static int field1101 = 50;

    @ObfuscatedName("client.gi")
    public static int[] field924 = new int[field1101];

    @ObfuscatedName("client.gv")
    public static int[] field925 = new int[field1101];

    @ObfuscatedName("client.gc")
    public static int[] field926 = new int[field1101];

    @ObfuscatedName("client.he")
    public static int[] field927 = new int[field1101];

    @ObfuscatedName("client.hr")
    public static int[] field928 = new int[field1101];

    @ObfuscatedName("client.hv")
    public static int[] field901 = new int[field1101];

    @ObfuscatedName("client.hp")
    public static int[] field930 = new int[field1101];

    @ObfuscatedName("client.hh")
    public static String[] field998 = new String[field1101];

    @ObfuscatedName("client.ha")
    public static int[][] field932 = new int[104][104];

    @ObfuscatedName("client.hm")
    public static int field933 = 0;

    @ObfuscatedName("client.ht")
    public static int field934 = -1;

    @ObfuscatedName("client.hq")
    public static int field861 = -1;

    @ObfuscatedName("client.hf")
    public static int field1004 = 0;

    @ObfuscatedName("client.ho")
    public static int field937 = 0;

    @ObfuscatedName("client.hn")
    public static int field1093 = 0;

    @ObfuscatedName("client.hl")
    public static int field939 = 0;

    @ObfuscatedName("client.hs")
    public static int field856 = 0;

    @ObfuscatedName("client.hc")
    public static int field941 = 0;

    @ObfuscatedName("client.hg")
    public static int field1074 = 0;

    @ObfuscatedName("client.hz")
    public static int field858 = 0;

    @ObfuscatedName("client.hx")
    public static int field1040 = 0;

    @ObfuscatedName("client.hk")
    public static int field936 = 0;

    @ObfuscatedName("client.hi")
    public static boolean field946 = false;

    @ObfuscatedName("client.hu")
    public static int field1083 = 0;

    @ObfuscatedName("client.hw")
    public static int field948 = 0;

    @ObfuscatedName("client.ie")
    public static class74[] field949 = new class74[2048];

    @ObfuscatedName("client.ig")
    public static int field950 = -1;

    @ObfuscatedName("client.iq")
    public static int field919 = 0;

    @ObfuscatedName("client.im")
    public static int field968 = 0;

    @ObfuscatedName("client.ij")
    public static int[] field952 = new int[1000];

    @ObfuscatedName("client.ia")
    public static final int[] field954 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.in")
    public static String[] field955 = new String[8];

    @ObfuscatedName("client.it")
    public static String field983 = null;

    @ObfuscatedName("client.ib")
    public static boolean[] field956 = new boolean[8];

    @ObfuscatedName("client.id")
    public static int[] field957 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.iu")
    public static int field958 = -1;

    @ObfuscatedName("client.io")
    public static class205[][][] field1036 = new class205[4][104][104];

    @ObfuscatedName("client.ik")
    public static class205 field960 = new class205();

    @ObfuscatedName("client.is")
    public static class205 field961 = new class205();

    @ObfuscatedName("client.iv")
    public static class205 field887 = new class205();

    @ObfuscatedName("client.if")
    public static int[] field1024 = new int[25];

    @ObfuscatedName("client.ic")
    public static int[] field964 = new int[25];

    @ObfuscatedName("client.iw")
    public static int[] field914 = new int[25];

    @ObfuscatedName("client.ih")
    public static int field966 = 0;

    @ObfuscatedName("client.ip")
    public static boolean field972 = false;

    @ObfuscatedName("client.jg")
    public static int field938 = 0;

    @ObfuscatedName("client.je")
    public static int[] field969 = new int[500];

    @ObfuscatedName("client.jf")
    public static int[] field970 = new int[500];

    @ObfuscatedName("client.jq")
    public static int[] field918 = new int[500];

    @ObfuscatedName("client.jr")
    public static int[] field855 = new int[500];

    @ObfuscatedName("client.jn")
    public static String[] field973 = new String[500];

    @ObfuscatedName("client.jh")
    public static String[] field974 = new String[500];

    @ObfuscatedName("client.jj")
    public static boolean[] field975 = new boolean[500];

    @ObfuscatedName("client.jl")
    public static boolean field976 = false;

    @ObfuscatedName("client.jm")
    public static boolean field977 = false;

    @ObfuscatedName("client.jd")
    public static int field965 = -1;

    @ObfuscatedName("client.jx")
    public static int field883 = -1;

    @ObfuscatedName("client.jo")
    public static int field980 = 0;

    @ObfuscatedName("client.ja")
    public static int field981 = 50;

    @ObfuscatedName("client.jp")
    public static int field864 = 0;

    @ObfuscatedName("client.jb")
    public static boolean field1041 = false;

    @ObfuscatedName("client.kp")
    public static int field985 = -1;

    @ObfuscatedName("client.kj")
    public static int field986 = -1;

    @ObfuscatedName("client.ku")
    public static String field987 = null;

    @ObfuscatedName("client.kd")
    public static String field911 = null;

    @ObfuscatedName("client.kr")
    public static int field873 = -1;

    @ObfuscatedName("client.kb")
    public static class202 field947 = new class202(8);

    @ObfuscatedName("client.kv")
    public static int field991 = 0;

    @ObfuscatedName("client.ky")
    public static int field992 = 0;

    @ObfuscatedName("client.kt")
    public static class228 field959 = null;

    @ObfuscatedName("client.kx")
    public static int field994 = 0;

    @ObfuscatedName("client.kg")
    public static int field995 = 0;

    @ObfuscatedName("client.ks")
    public static int field996 = 0;

    @ObfuscatedName("client.kn")
    public static int field997 = -1;

    @ObfuscatedName("client.kc")
    public static boolean field872 = false;

    @ObfuscatedName("client.ka")
    public static boolean field979 = false;

    @ObfuscatedName("client.kz")
    public static boolean field962 = false;

    @ObfuscatedName("client.kf")
    public static class228 field1001 = null;

    @ObfuscatedName("client.ki")
    public static class228 field1065 = null;

    @ObfuscatedName("client.kw")
    public static class228 field1003 = null;

    @ObfuscatedName("client.kh")
    public static int field890 = 0;

    @ObfuscatedName("client.ko")
    public static int field944 = 0;

    @ObfuscatedName("client.kk")
    public static class228 field1006 = null;

    @ObfuscatedName("client.kl")
    public static boolean field993 = false;

    @ObfuscatedName("client.kq")
    public static int field1008 = -1;

    @ObfuscatedName("client.km")
    public static int field951 = -1;

    @ObfuscatedName("client.lz")
    public static boolean field1010 = false;

    @ObfuscatedName("client.lp")
    public static int field1011 = -1;

    @ObfuscatedName("client.lr")
    public static int field1012 = -1;

    @ObfuscatedName("client.lo")
    public static boolean field1013 = false;

    @ObfuscatedName("client.lx")
    public static int field1058 = 1;

    @ObfuscatedName("client.la")
    public static int[] field989 = new int[32];

    @ObfuscatedName("client.lu")
    public static int field1016 = 0;

    @ObfuscatedName("client.lt")
    public static int[] field853 = new int[32];

    @ObfuscatedName("client.lq")
    public static int field1018 = 0;

    @ObfuscatedName("client.lf")
    public static int[] field1019 = new int[32];

    @ObfuscatedName("client.le")
    public static int field923 = 0;

    @ObfuscatedName("client.lh")
    public static int field1021 = 0;

    @ObfuscatedName("client.ls")
    public static int field1042 = 0;

    @ObfuscatedName("client.lv")
    public static int field1023 = 0;

    @ObfuscatedName("client.li")
    public static int field1051 = 0;

    @ObfuscatedName("client.ll")
    public static int field1025 = 0;

    @ObfuscatedName("client.lc")
    public static int field1026 = 0;

    @ObfuscatedName("client.lk")
    public static int field1027 = 0;

    @ObfuscatedName("client.mq")
    public static class205 field1028 = new class205();

    @ObfuscatedName("client.mm")
    public static class205 field1029 = new class205();

    @ObfuscatedName("client.mu")
    public static class205 field1030 = new class205();

    @ObfuscatedName("client.mt")
    public static class202 field1031 = new class202(512);

    @ObfuscatedName("client.mn")
    public static int field1032 = 0;

    @ObfuscatedName("client.mh")
    public static int field1033 = -2;

    @ObfuscatedName("client.mp")
    public static boolean[] field1034 = new boolean[100];

    @ObfuscatedName("client.ml")
    public static boolean[] field1020 = new boolean[100];

    @ObfuscatedName("client.mk")
    public static boolean[] field971 = new boolean[100];

    @ObfuscatedName("client.mi")
    public static int[] field1037 = new int[100];

    @ObfuscatedName("client.mf")
    public static int[] field942 = new int[100];

    @ObfuscatedName("client.mr")
    public static int[] field1039 = new int[100];

    @ObfuscatedName("client.mb")
    public static int[] field978 = new int[100];

    @ObfuscatedName("client.mv")
    public static int field929 = 0;

    @ObfuscatedName("client.mo")
    public static long field943 = 0L;

    @ObfuscatedName("client.mw")
    public static boolean field1043 = true;

    @ObfuscatedName("client.mc")
    public static int[] field1044 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ms")
    public static int field1045 = 0;

    @ObfuscatedName("client.no")
    public static int field1088 = 0;

    @ObfuscatedName("client.ng")
    public static String field1047 = "";

    @ObfuscatedName("client.nz")
    public static long[] field1048 = new long[100];

    @ObfuscatedName("client.nb")
    public static int field1049 = 0;

    @ObfuscatedName("client.nv")
    public static int field1050 = 0;

    @ObfuscatedName("client.ny")
    public static int[] field1086 = new int[128];

    @ObfuscatedName("client.nc")
    public static int[] field1052 = new int[128];

    @ObfuscatedName("client.nt")
    public static long field1053 = -1L;

    @ObfuscatedName("client.nl")
    public static String field1054 = null;

    @ObfuscatedName("client.np")
    public static String field953 = null;

    @ObfuscatedName("client.nq")
    public static int field1056 = -1;

    @ObfuscatedName("client.nf")
    public static int field1057 = 0;

    @ObfuscatedName("client.nm")
    public static int[] field915 = new int[1000];

    @ObfuscatedName("client.nx")
    public static int[] field1059 = new int[1000];

    @ObfuscatedName("client.ne")
    public static class299[] field1060 = new class299[1000];

    @ObfuscatedName("client.na")
    public static int field1061 = 0;

    @ObfuscatedName("client.ni")
    public static int field1062 = 0;

    @ObfuscatedName("client.ol")
    public static int field1063 = 0;

    @ObfuscatedName("client.on")
    public static int field846 = 255;

    @ObfuscatedName("client.of")
    public static int field851 = -1;

    @ObfuscatedName("client.oi")
    public static boolean field1009 = false;

    @ObfuscatedName("client.og")
    public static int field1067 = 127;

    @ObfuscatedName("client.ov")
    public static int field1068 = 127;

    @ObfuscatedName("client.om")
    public static int field1069 = 0;

    @ObfuscatedName("client.ok")
    public static int[] field1070 = new int[50];

    @ObfuscatedName("client.oz")
    public static int[] field1071 = new int[50];

    @ObfuscatedName("client.oo")
    public static int[] field1072 = new int[50];

    @ObfuscatedName("client.ow")
    public static int[] field1073 = new int[50];

    @ObfuscatedName("client.oc")
    public static class105[] field1103 = new class105[50];

    @ObfuscatedName("client.oa")
    public static boolean field931 = false;

    @ObfuscatedName("client.pr")
    public static boolean[] field1076 = new boolean[5];

    @ObfuscatedName("client.ps")
    public static int[] field1077 = new int[5];

    @ObfuscatedName("client.pl")
    public static int[] field1078 = new int[5];

    @ObfuscatedName("client.pc")
    public static int[] field1079 = new int[5];

    @ObfuscatedName("client.pq")
    public static int[] field1080 = new int[5];

    @ObfuscatedName("client.pt")
    public static short field1081 = 256;

    @ObfuscatedName("client.pw")
    public static short field1082 = 205;

    @ObfuscatedName("client.pb")
    public static short field879 = 256;

    @ObfuscatedName("client.ph")
    public static short field1084 = 320;

    @ObfuscatedName("client.pf")
    public static short field1085 = 1;

    @ObfuscatedName("client.py")
    public static short field868 = 32767;

    @ObfuscatedName("client.pk")
    public static short field1087 = 1;

    @ObfuscatedName("client.px")
    public static short field1007 = 32767;

    @ObfuscatedName("client.pn")
    public static int field1089 = 0;

    @ObfuscatedName("client.pv")
    public static int field1000 = 0;

    @ObfuscatedName("client.pd")
    public static int field877 = 0;

    @ObfuscatedName("client.pa")
    public static int field1092 = 0;

    @ObfuscatedName("client.pu")
    public static int field1038 = 0;

    @ObfuscatedName("client.pp")
    public static int field1094 = 0;

    @ObfuscatedName("client.qa")
    public static int field1095 = 0;

    @ObfuscatedName("client.qq")
    public static class66[] field990 = new class66[400];

    @ObfuscatedName("client.qm")
    public static class207 field1097 = new class207();

    @ObfuscatedName("client.qt")
    public static int field905 = 0;

    @ObfuscatedName("client.qz")
    public static class70[] field1066 = new class70[400];

    @ObfuscatedName("client.qh")
    public static class225 field1091 = new class225();

    @ObfuscatedName("client.qo")
    public static int field1046 = -1;

    @ObfuscatedName("client.qs")
    public static int field1102 = -1;

    @ObfuscatedName("client.qn")
    public static class17[] field912 = new class17[8];

    @ObfuscatedName("client.qg")
    public static class75 field1104 = new class75();

    @ObfuscatedName("client.qu")
    public static final class73 field1105 = new class73();

    @ObfuscatedName("client.qy")
    public static int[] field1106 = new int[50];

    @ObfuscatedName("client.qp")
    public static int[] field1107 = new int[50];

    @ObfuscatedName("ce.eb(I)Lka;")
    public static class302 method1515() {
        return Statics.field713;
    }

    @ObfuscatedName("client.af(I)V")
    public final void method713() {
    }

    public final void init() {
        if (!this.method721()) {
            return;
        }
        class287[] var1 = new class287[] { class287.field3784, class287.field3781, class287.field3780, class287.field3777, class287.field3786, class287.field3779, class287.field3787, class287.field3785, class287.field3790, class287.field3775, class287.field3778, class287.field3776, class287.field3789, class287.field3783, class287.field3788, class287.field3782 };
        class287[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class287 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3791);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3791)) {
                    case 1:
                        field892 = Integer.parseInt(var5) != 0;
                        break;
                    case 2:
                        Statics.field1108 = var5;
                        break;
                    case 3:
                        field849 = Integer.parseInt(var5);
                    case 4:
                    case 9:
                    case 10:
                    default:
                        break;
                    case 5:
                        Statics.field32 = Integer.parseInt(var5);
                        break;
                    case 6:
                        field852 = Integer.parseInt(var5);
                        break;
                    case 7:
                        field891 = Integer.parseInt(var5);
                        break;
                    case 8:
                        field847 = Integer.parseInt(var5);
                        break;
                    case 11:
                        if (var5.equalsIgnoreCase(class88.field1293)) {
                        }
                        break;
                    case 12:
                        Statics.field400 = Integer.parseInt(var5);
                        break;
                    case 13:
                        Statics.field2176 = class243.method434(Integer.parseInt(var5));
                        break;
                    case 14:
                        Statics.field2104 = var5;
                        break;
                    case 15:
                        if (var5.equalsIgnoreCase(class88.field1293)) {
                            field850 = true;
                        } else {
                            field850 = false;
                        }
                        break;
                    case 16:
                        Statics.field722 = (class244) class180.method1581(class244.method881(), Integer.parseInt(var5));
                        if (Statics.field722 == class244.field3290) {
                            Statics.field1110 = class303.field3932;
                        } else {
                            Statics.field1110 = class303.field3930;
                        }
                }
            }
        }
        class139.field1967 = false;
        field1002 = false;
        Statics.field261 = this.getCodeBase().getHost();
        String var6 = Statics.field2176.field3288;
        byte var7 = 0;
        try {
            class158.method2681("oldschool", var6, var7, 17);
        } catch (Exception var9) {
            class155.method1339((String) null, var9);
        }
        Statics.field284 = this;
        this.method719(765, 503, 160);
    }

    @ObfuscatedName("client.as(I)V")
    public final void method819() {
        class186.method161(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field1263 = field849 == 0 ? 43594 : field847 + 40000;
        Statics.field1664 = field849 == 0 ? 443 : field847 + 50000;
        Statics.field3619 = Statics.field1263;
        Statics.field1944 = class226.field2744;
        Statics.field2735 = class226.field2741;
        Statics.field246 = class226.field2742;
        Statics.field2736 = class226.field2743;
        Statics.field2507 = new class149();
        this.method794();
        this.method802();
        Statics.field264 = this.method838();
        Statics.field628 = new class165(255, class158.field2146, class158.field2143, 500000);
        Statics.field15 = class81.method946();
        this.method773();
        String var2 = Statics.field657;
        class57.field623 = this;
        class57.field622 = var2;
        if (field849 != 0) {
            field1055 = true;
        }
        method458(Statics.field15.field1214);
    }

    @ObfuscatedName("client.aq(I)V")
    public final void method733() {
        field963++;
        this.method1023();
        while (true) {
            class205 var1 = class248.field3328;
            class245 var2;
            synchronized (class248.field3328) {
                var2 = (class245) class248.field3331.method3440();
            }
            if (var2 == null) {
                try {
                    if (class215.field2621 == 1) {
                        int var4 = Statics.field3754.method3535();
                        if (var4 > 0 && Statics.field3754.method3582()) {
                            int var5 = var4 - Statics.field2160;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field3754.method3534(var5);
                        } else {
                            Statics.field3754.method3540();
                            Statics.field3754.method3538();
                            if (Statics.field2624 == null) {
                                class215.field2621 = 0;
                            } else {
                                class215.field2621 = 2;
                            }
                            Statics.field2623 = null;
                            Statics.field2628 = null;
                        }
                    }
                } catch (Exception var258) {
                    var258.printStackTrace();
                    Statics.field3754.method3540();
                    class215.field2621 = 0;
                    Statics.field2623 = null;
                    Statics.field2628 = null;
                    Statics.field2624 = null;
                }
                method1508();
                class51 var7 = class51.field604;
                synchronized (class51.field604) {
                    class51.field606++;
                    class51.field603 = class51.field605;
                    class51.field602 = 0;
                    if (class51.field598 >= 0) {
                        while (class51.field598 != class51.field597) {
                            int var9 = class51.field608[class51.field597];
                            class51.field597 = class51.field597 + 1 & 0x7F;
                            if (var9 < 0) {
                                class51.field594[~var9] = false;
                            } else {
                                if (!class51.field594[var9] && class51.field602 < class51.field601.length - 1) {
                                    class51.field601[++class51.field602 - 1] = var9;
                                }
                                class51.field594[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class51.field594[var8] = false;
                        }
                        class51.field598 = class51.field597;
                    }
                    if (class51.field602 > 0) {
                        class51.field606 = 0;
                    }
                    class51.field605 = class51.field591;
                }
                class60.method2803();
                if (Statics.field264 != null) {
                    int var11 = Statics.field264.method624();
                    field1027 = var11;
                }
                if (field982 == 0) {
                    method206();
                    Statics.field2411.method2694();
                    for (int var12 = 0; var12 < 32; var12++) {
                        field634[var12] = 0L;
                    }
                    for (int var13 = 0; var13 < 32; var13++) {
                        field663[var13] = 0L;
                    }
                    Statics.field2740 = 0;
                } else if (field982 == 5) {
                    class92.method3287(this);
                    method206();
                    Statics.field2411.method2694();
                    for (int var14 = 0; var14 < 32; var14++) {
                        field634[var14] = 0L;
                    }
                    for (int var15 = 0; var15 < 32; var15++) {
                        field663[var15] = 0L;
                    }
                    Statics.field2740 = 0;
                } else if (field982 == 10 || field982 == 11) {
                    class92.method3287(this);
                } else if (field982 == 20) {
                    class92.method3287(this);
                    this.method1217();
                } else if (field982 == 25) {
                    method2660(false);
                    field896 = 0;
                    boolean var16 = true;
                    for (int var17 = 0; var17 < Statics.field843.length; var17++) {
                        if (Statics.field1353[var17] != -1 && Statics.field843[var17] == null) {
                            Statics.field843[var17] = Statics.field326.method3897(Statics.field1353[var17], 0);
                            if (Statics.field843[var17] == null) {
                                var16 = false;
                                field896++;
                            }
                        }
                        if (Statics.field1257[var17] != -1 && Statics.field366[var17] == null) {
                            Statics.field366[var17] = Statics.field326.method3912(Statics.field1257[var17], 0, Statics.field320[var17]);
                            if (Statics.field366[var17] == null) {
                                var16 = false;
                                field896++;
                            }
                        }
                    }
                    if (var16) {
                        field898 = 0;
                        boolean var18 = true;
                        for (int var19 = 0; var19 < Statics.field843.length; var19++) {
                            byte[] var20 = Statics.field366[var19];
                            if (var20 != null) {
                                int var21 = (Statics.field739[var19] >> 8) * 64 - Statics.field556;
                                int var22 = (Statics.field739[var19] & 0xFF) * 64 - Statics.field895;
                                if (field945) {
                                    var21 = 10;
                                    var22 = 10;
                                }
                                boolean var24 = true;
                                class185 var25 = new class185(var20);
                                int var26 = -1;
                                label1252: while (true) {
                                    int var27 = var25.method3137();
                                    if (var27 == 0) {
                                        var18 &= var24;
                                        break;
                                    }
                                    var26 += var27;
                                    int var28 = 0;
                                    boolean var29 = false;
                                    while (true) {
                                        while (!var29) {
                                            int var31 = var25.method3137();
                                            if (var31 == 0) {
                                                continue label1252;
                                            }
                                            var28 += var31 - 1;
                                            int var32 = var28 & 0x3F;
                                            int var33 = var28 >> 6 & 0x3F;
                                            int var34 = var25.method2962() >> 2;
                                            int var35 = var21 + var33;
                                            int var36 = var22 + var32;
                                            if (var35 > 0 && var36 > 0 && var35 < 103 && var36 < 103) {
                                                class267 var37 = class267.method2129(var26);
                                                if (var34 != 22 || !field1002 || var37.field3529 != 0 || var37.field3527 == 1 || var37.field3548) {
                                                    if (!var37.method4290()) {
                                                        field898++;
                                                        var24 = false;
                                                    }
                                                    var29 = true;
                                                }
                                            }
                                        }
                                        int var30 = var25.method3137();
                                        if (var30 == 0) {
                                            break;
                                        }
                                        var25.method2962();
                                    }
                                }
                            }
                        }
                        if (var18) {
                            if (field900 != 0) {
                                method3200(class237.field3241 + class88.field1290 + class88.field1287 + 100 + "%" + class88.field1284, true);
                            }
                            method1508();
                            method17();
                            method1508();
                            Statics.field581.method2479();
                            method1508();
                            System.gc();
                            for (int var39 = 0; var39 < 4; var39++) {
                                field1090[var39].method2833();
                            }
                            for (int var40 = 0; var40 < 4; var40++) {
                                for (int var41 = 0; var41 < 104; var41++) {
                                    for (int var42 = 0; var42 < 104; var42++) {
                                        class62.field711[var40][var41][var42] = 0;
                                    }
                                }
                            }
                            method1508();
                            class62.method2802();
                            int var43 = Statics.field843.length;
                            class82.method204();
                            method2660(true);
                            if (!field945) {
                                for (int var44 = 0; var44 < var43; var44++) {
                                    int var45 = (Statics.field739[var44] >> 8) * 64 - Statics.field556;
                                    int var46 = (Statics.field739[var44] & 0xFF) * 64 - Statics.field895;
                                    byte[] var47 = Statics.field843[var44];
                                    if (var47 != null) {
                                        method1508();
                                        class62.method1522(var47, var45, var46, Statics.field14 * 8 - 48, Statics.field2031 * 8 - 48, field1090);
                                    }
                                }
                                for (int var48 = 0; var48 < var43; var48++) {
                                    int var49 = (Statics.field739[var48] >> 8) * 64 - Statics.field556;
                                    int var50 = (Statics.field739[var48] & 0xFF) * 64 - Statics.field895;
                                    byte[] var51 = Statics.field843[var48];
                                    if (var51 == null && Statics.field2031 < 800) {
                                        method1508();
                                        class62.method3869(var49, var50, 64, 64);
                                    }
                                }
                                method2660(true);
                                for (int var52 = 0; var52 < var43; var52++) {
                                    byte[] var53 = Statics.field366[var52];
                                    if (var53 != null) {
                                        int var54 = (Statics.field739[var52] >> 8) * 64 - Statics.field556;
                                        int var55 = (Statics.field739[var52] & 0xFF) * 64 - Statics.field895;
                                        method1508();
                                        class139 var56 = Statics.field581;
                                        class167[] var57 = field1090;
                                        class185 var58 = new class185(var53);
                                        int var59 = -1;
                                        while (true) {
                                            int var60 = var58.method3137();
                                            if (var60 == 0) {
                                                break;
                                            }
                                            var59 += var60;
                                            int var61 = 0;
                                            while (true) {
                                                int var62 = var58.method3137();
                                                if (var62 == 0) {
                                                    break;
                                                }
                                                var61 += var62 - 1;
                                                int var63 = var61 & 0x3F;
                                                int var64 = var61 >> 6 & 0x3F;
                                                int var65 = var61 >> 12;
                                                int var66 = var58.method2962();
                                                int var67 = var66 >> 2;
                                                int var68 = var66 & 0x3;
                                                int var69 = var54 + var64;
                                                int var70 = var55 + var63;
                                                if (var69 > 0 && var70 > 0 && var69 < 103 && var70 < 103) {
                                                    int var71 = var65;
                                                    if ((class62.field711[1][var69][var70] & 0x2) == 2) {
                                                        var71 = var65 - 1;
                                                    }
                                                    class167 var72 = null;
                                                    if (var71 >= 0) {
                                                        var72 = var57[var71];
                                                    }
                                                    class62.method940(var65, var69, var70, var59, var68, var67, var56, var72);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (field945) {
                                int var73 = 0;
                                label1157: while (true) {
                                    if (var73 >= 4) {
                                        for (int var111 = 0; var111 < 13; var111++) {
                                            for (int var112 = 0; var112 < 13; var112++) {
                                                int var113 = field903[0][var111][var112];
                                                if (var113 == -1) {
                                                    class62.method3869(var111 * 8, var112 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method2660(true);
                                        int var114 = 0;
                                        while (true) {
                                            if (var114 >= 4) {
                                                break label1157;
                                            }
                                            method1508();
                                            for (int var115 = 0; var115 < 13; var115++) {
                                                for (int var116 = 0; var116 < 13; var116++) {
                                                    int var117 = field903[var114][var115][var116];
                                                    if (var117 != -1) {
                                                        int var118 = var117 >> 24 & 0x3;
                                                        int var119 = var117 >> 1 & 0x3;
                                                        int var120 = var117 >> 14 & 0x3FF;
                                                        int var121 = var117 >> 3 & 0x7FF;
                                                        int var122 = (var120 / 8 << 8) + var121 / 8;
                                                        for (int var123 = 0; var123 < Statics.field739.length; var123++) {
                                                            if (Statics.field739[var123] == var122 && Statics.field366[var123] != null) {
                                                                Statics.method3523(Statics.field366[var123], var114, var115 * 8, var116 * 8, var118, (var120 & 0x7) * 8, (var121 & 0x7) * 8, var119, Statics.field581, field1090);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var114++;
                                        }
                                    }
                                    method1508();
                                    for (int var74 = 0; var74 < 13; var74++) {
                                        for (int var75 = 0; var75 < 13; var75++) {
                                            boolean var76 = false;
                                            int var77 = field903[var73][var74][var75];
                                            if (var77 != -1) {
                                                int var78 = var77 >> 24 & 0x3;
                                                int var79 = var77 >> 1 & 0x3;
                                                int var80 = var77 >> 14 & 0x3FF;
                                                int var81 = var77 >> 3 & 0x7FF;
                                                int var82 = (var80 / 8 << 8) + var81 / 8;
                                                for (int var83 = 0; var83 < Statics.field739.length; var83++) {
                                                    if (Statics.field739[var83] == var82 && Statics.field843[var83] != null) {
                                                        byte[] var84 = Statics.field843[var83];
                                                        int var85 = var74 * 8;
                                                        int var86 = var75 * 8;
                                                        int var87 = (var80 & 0x7) * 8;
                                                        int var88 = (var81 & 0x7) * 8;
                                                        class167[] var89 = field1090;
                                                        for (int var90 = 0; var90 < 8; var90++) {
                                                            for (int var91 = 0; var91 < 8; var91++) {
                                                                if (var85 + var90 > 0 && var85 + var90 < 103 && var86 + var91 > 0 && var86 + var91 < 103) {
                                                                    var89[var73].field2197[var85 + var90][var86 + var91] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class185 var92 = new class185(var84);
                                                        for (int var93 = 0; var93 < 4; var93++) {
                                                            for (int var94 = 0; var94 < 64; var94++) {
                                                                for (int var95 = 0; var95 < 64; var95++) {
                                                                    if (var78 == var93 && var94 >= var87 && var94 < var87 + 8 && var95 >= var88 && var95 < var88 + 8) {
                                                                        int var99 = var94 & 0x7;
                                                                        int var100 = var95 & 0x7;
                                                                        int var102 = var79 & 0x3;
                                                                        int var103;
                                                                        if (var102 == 0) {
                                                                            var103 = var99;
                                                                        } else if (var102 == 1) {
                                                                            var103 = var100;
                                                                        } else if (var102 == 2) {
                                                                            var103 = 7 - var99;
                                                                        } else {
                                                                            var103 = 7 - var100;
                                                                        }
                                                                        class62.method1533(var92, var73, var85 + var103, var86 + class227.method938(var94 & 0x7, var95 & 0x7, var79), 0, 0, var79);
                                                                    } else {
                                                                        class62.method1533(var92, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var76 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var76) {
                                                int var104 = var73;
                                                int var105 = var74 * 8;
                                                int var106 = var75 * 8;
                                                for (int var107 = 0; var107 < 8; var107++) {
                                                    for (int var108 = 0; var108 < 8; var108++) {
                                                        class62.field696[var104][var105 + var107][var106 + var108] = 0;
                                                    }
                                                }
                                                if (var105 > 0) {
                                                    for (int var109 = 1; var109 < 8; var109++) {
                                                        class62.field696[var104][var105][var106 + var109] = class62.field696[var104][var105 - 1][var106 + var109];
                                                    }
                                                }
                                                if (var106 > 0) {
                                                    for (int var110 = 1; var110 < 8; var110++) {
                                                        class62.field696[var104][var105 + var110][var106] = class62.field696[var104][var105 + var110][var106 - 1];
                                                    }
                                                }
                                                if (var105 > 0 && class62.field696[var104][var105 - 1][var106] != 0) {
                                                    class62.field696[var104][var105][var106] = class62.field696[var104][var105 - 1][var106];
                                                } else if (var106 > 0 && class62.field696[var104][var105][var106 - 1] != 0) {
                                                    class62.field696[var104][var105][var106] = class62.field696[var104][var105][var106 - 1];
                                                } else if (var105 > 0 && var106 > 0 && class62.field696[var104][var105 - 1][var106 - 1] != 0) {
                                                    class62.field696[var104][var105][var106] = class62.field696[var104][var105 - 1][var106 - 1];
                                                }
                                            }
                                        }
                                    }
                                    var73++;
                                }
                            }
                            method2660(true);
                            method17();
                            method1508();
                            class139 var124 = Statics.field581;
                            class167[] var125 = field1090;
                            for (int var126 = 0; var126 < 4; var126++) {
                                for (int var127 = 0; var127 < 104; var127++) {
                                    for (int var128 = 0; var128 < 104; var128++) {
                                        if ((class62.field711[var126][var127][var128] & 0x1) == 1) {
                                            int var129 = var126;
                                            if ((class62.field711[1][var127][var128] & 0x2) == 2) {
                                                var129 = var126 - 1;
                                            }
                                            if (var129 >= 0) {
                                                var125[var129].method2836(var127, var128);
                                            }
                                        }
                                    }
                                }
                            }
                            class62.field708 += (int) (Math.random() * 5.0D) - 2;
                            if (class62.field708 < -8) {
                                class62.field708 = -8;
                            }
                            if (class62.field708 > 8) {
                                class62.field708 = 8;
                            }
                            class62.field709 += (int) (Math.random() * 5.0D) - 2;
                            if (class62.field709 < -16) {
                                class62.field709 = -16;
                            }
                            if (class62.field709 > 16) {
                                class62.field709 = 16;
                            }
                            for (int var130 = 0; var130 < 4; var130++) {
                                byte[][] var131 = Statics.field1419[var130];
                                int var132 = (int) Math.sqrt(5100.0D);
                                int var133 = var132 * 768 >> 8;
                                for (int var134 = 1; var134 < 103; var134++) {
                                    for (int var135 = 1; var135 < 103; var135++) {
                                        int var136 = class62.field696[var130][var135 + 1][var134] - class62.field696[var130][var135 - 1][var134];
                                        int var137 = class62.field696[var130][var135][var134 + 1] - class62.field696[var130][var135][var134 - 1];
                                        int var138 = (int) Math.sqrt((double) (var137 * var137 + var136 * var136 + 65536));
                                        int var139 = (var136 << 8) / var138;
                                        int var140 = 65536 / var138;
                                        int var141 = (var137 << 8) / var138;
                                        int var142 = (var141 * -50 + var139 * -50 + var140 * -10) / var133 + 96;
                                        int var143 = (var131[var135][var134] >> 1) + (var131[var135][var134 + 1] >> 3) + (var131[var135][var134 - 1] >> 2) + (var131[var135 - 1][var134] >> 2) + (var131[var135 + 1][var134] >> 3);
                                        Statics.field697[var135][var134] = var142 - var143;
                                    }
                                }
                                for (int var144 = 0; var144 < 104; var144++) {
                                    Statics.field698[var144] = 0;
                                    Statics.field699[var144] = 0;
                                    Statics.field311[var144] = 0;
                                    Statics.field700[var144] = 0;
                                    Statics.field29[var144] = 0;
                                }
                                for (int var145 = -5; var145 < 109; var145++) {
                                    for (int var146 = 0; var146 < 104; var146++) {
                                        int var147 = var145 + 5;
                                        int var10002;
                                        if (var147 >= 0 && var147 < 104) {
                                            int var148 = Statics.field694[var130][var147][var146] & 0xFF;
                                            if (var148 > 0) {
                                                class258 var149 = class258.method3796(var148 - 1);
                                                Statics.field698[var146] += var149.field3427;
                                                Statics.field699[var146] += var149.field3428;
                                                Statics.field311[var146] += var149.field3429;
                                                Statics.field700[var146] += var149.field3426;
                                                var10002 = Statics.field29[var146]++;
                                            }
                                        }
                                        int var150 = var145 - 5;
                                        if (var150 >= 0 && var150 < 104) {
                                            int var151 = Statics.field694[var130][var150][var146] & 0xFF;
                                            if (var151 > 0) {
                                                class258 var152 = class258.method3796(var151 - 1);
                                                Statics.field698[var146] -= var152.field3427;
                                                Statics.field699[var146] -= var152.field3428;
                                                Statics.field311[var146] -= var152.field3429;
                                                Statics.field700[var146] -= var152.field3426;
                                                var10002 = Statics.field29[var146]--;
                                            }
                                        }
                                    }
                                    if (var145 >= 1 && var145 < 103) {
                                        int var153 = 0;
                                        int var154 = 0;
                                        int var155 = 0;
                                        int var156 = 0;
                                        int var157 = 0;
                                        for (int var158 = -5; var158 < 109; var158++) {
                                            int var159 = var158 + 5;
                                            if (var159 >= 0 && var159 < 104) {
                                                var153 += Statics.field698[var159];
                                                var154 += Statics.field699[var159];
                                                var155 += Statics.field311[var159];
                                                var156 += Statics.field700[var159];
                                                var157 += Statics.field29[var159];
                                            }
                                            int var160 = var158 - 5;
                                            if (var160 >= 0 && var160 < 104) {
                                                var153 -= Statics.field698[var160];
                                                var154 -= Statics.field699[var160];
                                                var155 -= Statics.field311[var160];
                                                var156 -= Statics.field700[var160];
                                                var157 -= Statics.field29[var160];
                                            }
                                            if (var158 >= 1 && var158 < 103 && (!field1002 || (class62.field711[0][var145][var158] & 0x2) != 0 || (class62.field711[var130][var145][var158] & 0x10) == 0)) {
                                                if (var130 < class62.field695) {
                                                    class62.field695 = var130;
                                                }
                                                int var161 = Statics.field694[var130][var145][var158] & 0xFF;
                                                int var162 = Statics.field2084[var130][var145][var158] & 0xFF;
                                                if (var161 > 0 || var162 > 0) {
                                                    int var163 = class62.field696[var130][var145][var158];
                                                    int var164 = class62.field696[var130][var145 + 1][var158];
                                                    int var165 = class62.field696[var130][var145 + 1][var158 + 1];
                                                    int var166 = class62.field696[var130][var145][var158 + 1];
                                                    int var167 = Statics.field697[var145][var158];
                                                    int var168 = Statics.field697[var145 + 1][var158];
                                                    int var169 = Statics.field697[var145 + 1][var158 + 1];
                                                    int var170 = Statics.field697[var145][var158 + 1];
                                                    int var171 = -1;
                                                    int var172 = -1;
                                                    if (var161 > 0) {
                                                        int var173 = var153 * 256 / var156;
                                                        int var174 = var154 / var157;
                                                        int var175 = var155 / var157;
                                                        var171 = class62.method1001(var173, var174, var175);
                                                        int var176 = class62.field708 + var173 & 0xFF;
                                                        int var177 = class62.field709 + var175;
                                                        if (var177 < 0) {
                                                            var177 = 0;
                                                        } else if (var177 > 255) {
                                                            var177 = 255;
                                                        }
                                                        var172 = class62.method1001(var176, var174, var177);
                                                    }
                                                    if (var130 > 0) {
                                                        boolean var178 = true;
                                                        if (var161 == 0 && Statics.field2227[var130][var145][var158] != 0) {
                                                            var178 = false;
                                                        }
                                                        if (var162 > 0 && !class271.method1655(var162 - 1).field3661) {
                                                            var178 = false;
                                                        }
                                                        if (var178 && var163 == var164 && var163 == var165 && var163 == var166) {
                                                            Statics.field1668[var130][var145][var158] |= 0x924;
                                                        }
                                                    }
                                                    int var179 = 0;
                                                    if (var172 != -1) {
                                                        var179 = class136.field1923[class62.method1363(var172, 96)];
                                                    }
                                                    if (var162 == 0) {
                                                        var124.method2484(var130, var145, var158, 0, 0, -1, var163, var164, var165, var166, class62.method1363(var171, var167), class62.method1363(var171, var168), class62.method1363(var171, var169), class62.method1363(var171, var170), 0, 0, 0, 0, var179, 0);
                                                    } else {
                                                        int var180 = Statics.field2227[var130][var145][var158] + 1;
                                                        byte var181 = Statics.field414[var130][var145][var158];
                                                        class271 var182 = class271.method1655(var162 - 1);
                                                        int var183 = var182.field3663;
                                                        int var184;
                                                        int var185;
                                                        if (var183 >= 0) {
                                                            var184 = Statics.field1924.method2186(var183);
                                                            var185 = -1;
                                                        } else if (var182.field3664 == 16711935) {
                                                            var185 = -2;
                                                            var183 = -1;
                                                            var184 = -2;
                                                        } else {
                                                            var185 = class62.method1001(var182.field3657, var182.field3660, var182.field3665);
                                                            int var186 = class62.field708 + var182.field3657 & 0xFF;
                                                            int var187 = class62.field709 + var182.field3665;
                                                            if (var187 < 0) {
                                                                var187 = 0;
                                                            } else if (var187 > 255) {
                                                                var187 = 255;
                                                            }
                                                            var184 = class62.method1001(var186, var182.field3660, var187);
                                                        }
                                                        int var188 = 0;
                                                        if (var184 != -2) {
                                                            var188 = class136.field1923[class62.method2865(var184, 96)];
                                                        }
                                                        if (var182.field3659 != -1) {
                                                            int var189 = class62.field708 + var182.field3666 & 0xFF;
                                                            int var190 = class62.field709 + var182.field3668;
                                                            if (var190 < 0) {
                                                                var190 = 0;
                                                            } else if (var190 > 255) {
                                                                var190 = 255;
                                                            }
                                                            int var191 = class62.method1001(var189, var182.field3667, var190);
                                                            var188 = class136.field1923[class62.method2865(var191, 96)];
                                                        }
                                                        var124.method2484(var130, var145, var158, var180, var181, var183, var163, var164, var165, var166, class62.method1363(var171, var167), class62.method1363(var171, var168), class62.method1363(var171, var169), class62.method1363(var171, var170), class62.method2865(var185, var167), class62.method2865(var185, var168), class62.method2865(var185, var169), class62.method2865(var185, var170), var179, var188);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var192 = 1; var192 < 103; var192++) {
                                    for (int var193 = 1; var193 < 103; var193++) {
                                        int var198;
                                        if ((class62.field711[var130][var193][var192] & 0x8) != 0) {
                                            var198 = 0;
                                        } else if (var130 <= 0 || (class62.field711[1][var193][var192] & 0x2) == 0) {
                                            var198 = var130;
                                        } else {
                                            var198 = var130 - 1;
                                        }
                                        var124.method2483(var130, var193, var192, var198);
                                    }
                                }
                                Statics.field694[var130] = (byte[][]) null;
                                Statics.field2084[var130] = (byte[][]) null;
                                Statics.field2227[var130] = (byte[][]) null;
                                Statics.field414[var130] = (byte[][]) null;
                                Statics.field1419[var130] = (byte[][]) null;
                            }
                            var124.method2510(-50, -10, -50);
                            for (int var199 = 0; var199 < 104; var199++) {
                                for (int var200 = 0; var200 < 104; var200++) {
                                    if ((class62.field711[1][var199][var200] & 0x2) == 2) {
                                        var124.method2527(var199, var200);
                                    }
                                }
                            }
                            int var201 = 1;
                            int var202 = 2;
                            int var203 = 4;
                            for (int var204 = 0; var204 < 4; var204++) {
                                if (var204 > 0) {
                                    var201 <<= 0x3;
                                    var202 <<= 0x3;
                                    var203 <<= 0x3;
                                }
                                for (int var205 = 0; var205 <= var204; var205++) {
                                    for (int var206 = 0; var206 <= 104; var206++) {
                                        for (int var207 = 0; var207 <= 104; var207++) {
                                            if ((Statics.field1668[var205][var207][var206] & var201) != 0) {
                                                int var208 = var206;
                                                int var209 = var206;
                                                int var210 = var205;
                                                int var211 = var205;
                                                while (var208 > 0 && (Statics.field1668[var205][var207][var208 - 1] & var201) != 0) {
                                                    var208--;
                                                }
                                                while (var209 < 104 && (Statics.field1668[var205][var207][var209 + 1] & var201) != 0) {
                                                    var209++;
                                                }
                                                label774: while (var210 > 0) {
                                                    for (int var212 = var208; var212 <= var209; var212++) {
                                                        if ((Statics.field1668[var210 - 1][var207][var212] & var201) == 0) {
                                                            break label774;
                                                        }
                                                    }
                                                    var210--;
                                                }
                                                label763: while (var211 < var204) {
                                                    for (int var213 = var208; var213 <= var209; var213++) {
                                                        if ((Statics.field1668[var211 + 1][var207][var213] & var201) == 0) {
                                                            break label763;
                                                        }
                                                    }
                                                    var211++;
                                                }
                                                int var214 = (var211 + 1 - var210) * (var209 - var208 + 1);
                                                if (var214 >= 8) {
                                                    short var215 = 240;
                                                    int var216 = class62.field696[var211][var207][var208] - var215;
                                                    int var217 = class62.field696[var210][var207][var208];
                                                    class139.method2482(var204, 1, var207 * 128, var207 * 128, var208 * 128, var209 * 128 + 128, var216, var217);
                                                    for (int var218 = var210; var218 <= var211; var218++) {
                                                        for (int var219 = var208; var219 <= var209; var219++) {
                                                            Statics.field1668[var218][var207][var219] &= ~var201;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field1668[var205][var207][var206] & var202) != 0) {
                                                int var220 = var207;
                                                int var221 = var207;
                                                int var222 = var205;
                                                int var223 = var205;
                                                while (var220 > 0 && (Statics.field1668[var205][var220 - 1][var206] & var202) != 0) {
                                                    var220--;
                                                }
                                                while (var221 < 104 && (Statics.field1668[var205][var221 + 1][var206] & var202) != 0) {
                                                    var221++;
                                                }
                                                label827: while (var222 > 0) {
                                                    for (int var224 = var220; var224 <= var221; var224++) {
                                                        if ((Statics.field1668[var222 - 1][var224][var206] & var202) == 0) {
                                                            break label827;
                                                        }
                                                    }
                                                    var222--;
                                                }
                                                label816: while (var223 < var204) {
                                                    for (int var225 = var220; var225 <= var221; var225++) {
                                                        if ((Statics.field1668[var223 + 1][var225][var206] & var202) == 0) {
                                                            break label816;
                                                        }
                                                    }
                                                    var223++;
                                                }
                                                int var226 = (var223 + 1 - var222) * (var221 - var220 + 1);
                                                if (var226 >= 8) {
                                                    short var227 = 240;
                                                    int var228 = class62.field696[var223][var220][var206] - var227;
                                                    int var229 = class62.field696[var222][var220][var206];
                                                    class139.method2482(var204, 2, var220 * 128, var221 * 128 + 128, var206 * 128, var206 * 128, var228, var229);
                                                    for (int var230 = var222; var230 <= var223; var230++) {
                                                        for (int var231 = var220; var231 <= var221; var231++) {
                                                            Statics.field1668[var230][var231][var206] &= ~var202;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field1668[var205][var207][var206] & var203) != 0) {
                                                int var232 = var207;
                                                int var233 = var207;
                                                int var234 = var206;
                                                int var235 = var206;
                                                while (var234 > 0 && (Statics.field1668[var205][var207][var234 - 1] & var203) != 0) {
                                                    var234--;
                                                }
                                                while (var235 < 104 && (Statics.field1668[var205][var207][var235 + 1] & var203) != 0) {
                                                    var235++;
                                                }
                                                label880: while (var232 > 0) {
                                                    for (int var236 = var234; var236 <= var235; var236++) {
                                                        if ((Statics.field1668[var205][var232 - 1][var236] & var203) == 0) {
                                                            break label880;
                                                        }
                                                    }
                                                    var232--;
                                                }
                                                label869: while (var233 < 104) {
                                                    for (int var237 = var234; var237 <= var235; var237++) {
                                                        if ((Statics.field1668[var205][var233 + 1][var237] & var203) == 0) {
                                                            break label869;
                                                        }
                                                    }
                                                    var233++;
                                                }
                                                if ((var233 - var232 + 1) * (var235 - var234 + 1) >= 4) {
                                                    int var238 = class62.field696[var205][var232][var234];
                                                    class139.method2482(var204, 4, var232 * 128, var233 * 128 + 128, var234 * 128, var235 * 128 + 128, var238, var238);
                                                    for (int var239 = var232; var239 <= var233; var239++) {
                                                        for (int var240 = var234; var240 <= var235; var240++) {
                                                            Statics.field1668[var205][var239][var240] &= ~var203;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            method2660(true);
                            int var241 = class62.field695;
                            if (var241 > Statics.field235) {
                                var241 = Statics.field235;
                            }
                            if (var241 < Statics.field235 - 1) {
                                int var242 = Statics.field235 - 1;
                            }
                            if (field1002) {
                                Statics.field581.method2480(class62.field695);
                            } else {
                                Statics.field581.method2480(0);
                            }
                            for (int var243 = 0; var243 < 104; var243++) {
                                for (int var244 = 0; var244 < 104; var244++) {
                                    method998(var243, var244);
                                }
                            }
                            method1508();
                            for (class77 var245 = (class77) field960.method3442(); var245 != null; var245 = (class77) field960.method3444()) {
                                if (var245.field1120 == -1) {
                                    var245.field1122 = 0;
                                    method489(var245);
                                } else {
                                    var245.method3427();
                                }
                            }
                            class267.field3513.method3370();
                            if (Statics.field284.method741()) {
                                class175 var246 = class175.method3893(class172.field2333, field889.field1450);
                                var246.field2434.method2949(1057001181);
                                field889.method1706(var246);
                            }
                            if (!field945) {
                                int var247 = (Statics.field14 - 6) / 8;
                                int var248 = (Statics.field14 + 6) / 8;
                                int var249 = (Statics.field2031 - 6) / 8;
                                int var250 = (Statics.field2031 + 6) / 8;
                                for (int var251 = var247 - 1; var251 <= var248 + 1; var251++) {
                                    for (int var252 = var249 - 1; var252 <= var250 + 1; var252++) {
                                        if (var251 < var247 || var251 > var248 || var252 < var249 || var252 > var250) {
                                            Statics.field326.method3918("m" + var251 + "_" + var252);
                                            Statics.field326.method3918("l" + var251 + "_" + var252);
                                        }
                                    }
                                }
                            }
                            method939(30);
                            method1508();
                            Statics.field694 = (byte[][][]) null;
                            Statics.field2084 = (byte[][][]) null;
                            Statics.field2227 = (byte[][][]) null;
                            Statics.field414 = (byte[][][]) null;
                            Statics.field1668 = (int[][][]) null;
                            Statics.field1419 = (byte[][][]) null;
                            Statics.field697 = (int[][]) null;
                            Statics.field698 = null;
                            Statics.field699 = null;
                            Statics.field311 = null;
                            Statics.field700 = null;
                            Statics.field29 = null;
                            class175 var253 = class175.method3893(class172.field2379, field889.field1450);
                            field889.method1706(var253);
                            Statics.field2411.method2694();
                            for (int var254 = 0; var254 < 32; var254++) {
                                field634[var254] = 0L;
                            }
                            for (int var255 = 0; var255 < 32; var255++) {
                                field663[var255] = 0L;
                            }
                            Statics.field2740 = 0;
                        } else {
                            field900 = 2;
                        }
                    } else {
                        field900 = 1;
                    }
                }
                if (field982 == 30) {
                    this.method1027();
                } else if (field982 == 40 || field982 == 45) {
                    this.method1217();
                }
                return;
            }
            var2.field3299.method4003(var2.field3301, (int) var2.field2589, var2.field3300, false);
        }
    }

    @ObfuscatedName("client.ax(ZI)V")
    public final void method734(boolean arg0) {
        boolean var2 = class215.method3766();
        if (var2 && field1009 && Statics.field471 != null) {
            Statics.field471.method1846();
        }
        if ((field982 == 10 || field982 == 20 || field982 == 30) && field943 != 0L && class187.method1411() > field943) {
            int var3 = field1043 ? 2 : 1;
            method458(var3);
        }
        if (arg0) {
            for (int var4 = 0; var4 < 100; var4++) {
                field1034[var4] = true;
            }
        }
        if (field982 == 0) {
            this.method736(class92.field1333, class92.field1345, arg0);
        } else if (field982 == 5) {
            class92.method537(Statics.field745, Statics.field621, Statics.field28, arg0);
        } else if (field982 == 10 || field982 == 11) {
            class92.method537(Statics.field745, Statics.field621, Statics.field28, arg0);
        } else if (field982 == 20) {
            class92.method537(Statics.field745, Statics.field621, Statics.field28, arg0);
        } else if (field982 == 25) {
            if (field900 == 1) {
                if (field896 > field897) {
                    field897 = field896;
                }
                int var5 = (field897 * 50 - field896 * 50) / field897;
                method3200(class237.field3241 + class88.field1290 + class88.field1287 + var5 + "%" + class88.field1284, false);
            } else if (field900 == 2) {
                if (field898 > field899) {
                    field899 = field898;
                }
                int var6 = (field899 * 50 - field898 * 50) / field899 + 50;
                method3200(class237.field3241 + class88.field1290 + class88.field1287 + var6 + "%" + class88.field1284, false);
            } else {
                method3200(class237.field3241, false);
            }
        } else if (field982 == 30) {
            this.method1029();
        } else if (field982 == 40) {
            method3200(class237.field3076 + class88.field1290 + class237.field3209, false);
        } else if (field982 == 45) {
            method3200(class237.field3117, false);
        }
        if (field982 == 30 && field929 == 0 && !arg0 && !field1043) {
            for (int var7 = 0; var7 < field1032; var7++) {
                if (field1020[var7]) {
                    Statics.field720.method696(field1037[var7], field942[var7], field1039[var7], field978[var7]);
                    field1020[var7] = false;
                }
            }
        } else if (field982 > 0) {
            Statics.field720.method693(0, 0);
            for (int var8 = 0; var8 < field1032; var8++) {
                field1020[var8] = false;
            }
        }
    }

    @ObfuscatedName("client.at(B)V")
    public final void method735() {
        if (Statics.field1460.method1620()) {
            Statics.field1460.method1622();
        }
        if (Statics.field546 != null) {
            Statics.field546.field793 = false;
        }
        Statics.field546 = null;
        field889.method1719();
        class51.method2929();
        if (class60.field667 != null) {
            class60 var1 = class60.field667;
            synchronized (class60.field667) {
                class60.field667 = null;
            }
        }
        Statics.field264 = null;
        if (Statics.field471 != null) {
            Statics.field471.method1847();
        }
        if (Statics.field1901 != null) {
            Statics.field1901.method1847();
        }
        class250.method197();
        Object var3 = class248.field3330;
        synchronized (class248.field3330) {
            if (class248.field3329 != 0) {
                class248.field3329 = 1;
                try {
                    class248.field3330.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        if (Statics.field2507 != null) {
            Statics.field2507.method2677();
            Statics.field2507 = null;
        }
        class158.method400();
    }

    @ObfuscatedName("bh.ec(IB)V")
    public static void method939(int arg0) {
        if (field982 == arg0) {
            return;
        }
        if (field982 == 0) {
            Statics.field284.method737();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field881 = 0;
            field1014 = 0;
            field1005 = 0;
            field893.method4651(arg0);
            if (arg0 != 20) {
                method2692(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field686 != null) {
            Statics.field686.method2776();
            Statics.field686 = null;
        }
        if (field982 == 25) {
            field900 = 0;
            field896 = 0;
            field897 = 1;
            field898 = 0;
            field899 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class92.method15(Statics.field474, Statics.field539, true, 0);
        } else if (arg0 == 20) {
            class92.method15(Statics.field474, Statics.field539, true, field982 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class92.method15(Statics.field474, Statics.field539, false, 4);
        } else {
            Statics.method1695();
        }
        field982 = arg0;
    }

    @ObfuscatedName("client.ey(B)V")
    public void method1023() {
        if (field982 != 1000) {
            boolean var1 = class250.method3887();
            if (!var1) {
                this.method1288();
            }
        }
    }

    @ObfuscatedName("client.em(I)V")
    public void method1288() {
        if (class250.field3346 >= 4) {
            this.method738("js5crc");
            field982 = 1000;
            return;
        }
        if (class250.field3361 >= 4) {
            if (field982 <= 5) {
                this.method738("js5io");
                field982 = 1000;
                return;
            }
            field875 = 3000;
            class250.field3361 = 3;
        }
        if (--field875 + 1 > 0) {
            return;
        }
        try {
            if (field874 == 0) {
                Statics.field2442 = Statics.field638.method2737(Statics.field261, Statics.field3619);
                field874++;
            }
            if (field874 == 1) {
                if (Statics.field2442.field2123 == 2) {
                    this.method1025(-1);
                    return;
                }
                if (Statics.field2442.field2123 == 1) {
                    field874++;
                }
            }
            if (field874 == 2) {
                if (field892) {
                    Statics.field21 = class160.method306((Socket) Statics.field2442.field2127, 40000, 5000);
                } else {
                    Statics.field21 = new class164((Socket) Statics.field2442.field2127, Statics.field638, 5000);
                }
                class185 var1 = new class185(5);
                var1.method2946(15);
                var1.method2949(160);
                Statics.field21.method2775(var1.field2512, 0, 5);
                field874++;
                Statics.field20 = class187.method1411();
            }
            if (field874 == 3) {
                if (Statics.field21.method2773() > 0 || !field892 && field982 <= 5) {
                    int var2 = Statics.field21.method2786();
                    if (var2 != 0) {
                        this.method1025(var2);
                        return;
                    }
                    field874++;
                } else if (class187.method1411() - Statics.field20 > 30000L) {
                    this.method1025(-2);
                    return;
                }
            }
            if (field874 == 4) {
                class160 var3 = Statics.field21;
                boolean var4 = field982 > 20;
                if (Statics.field3360 != null) {
                    try {
                        Statics.field3360.method2776();
                    } catch (Exception var14) {
                    }
                    Statics.field3360 = null;
                }
                Statics.field3360 = var3;
                class250.method199(var4);
                class250.field3355.field2509 = 0;
                Statics.field712 = null;
                Statics.field3803 = null;
                class250.field3357 = 0;
                while (true) {
                    class246 var6 = (class246) class250.field3348.method3379();
                    if (var6 == null) {
                        while (true) {
                            class246 var7 = (class246) class250.field3353.method3379();
                            if (var7 == null) {
                                if (class250.field3359 != 0) {
                                    try {
                                        class185 var8 = new class185(4);
                                        var8.method2946(4);
                                        var8.method2946(class250.field3359);
                                        var8.method2944(0);
                                        Statics.field3360.method2775(var8.field2512, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3360.method2776();
                                        } catch (Exception var12) {
                                        }
                                        class250.field3361++;
                                        Statics.field3360 = null;
                                    }
                                }
                                class250.field3345 = 0;
                                Statics.field2540 = class187.method1411();
                                Statics.field2442 = null;
                                Statics.field21 = null;
                                field874 = 0;
                                field876 = 0;
                                return;
                            }
                            class250.field3349.method3327(var7);
                            class250.field3351.method3381(var7, var7.field2589);
                            class250.field3347++;
                            class250.field3350--;
                        }
                    }
                    class250.field3354.method3381(var6, var6.field2589);
                    class250.field3344++;
                    class250.field3352--;
                }
            }
        } catch (IOException var15) {
            this.method1025(-3);
        }
    }

    @ObfuscatedName("client.eq(II)V")
    public void method1025(int arg0) {
        Statics.field2442 = null;
        Statics.field21 = null;
        field874 = 0;
        if (Statics.field3619 == Statics.field1263) {
            Statics.field3619 = Statics.field1664;
        } else {
            Statics.field3619 = Statics.field1263;
        }
        field876++;
        if (field876 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field982 <= 5) {
                this.method738("js5connect_full");
                field982 = 1000;
            } else {
                field875 = 3000;
            }
        } else if (field876 >= 2 && arg0 == 6) {
            this.method738("js5connect_outofdate");
            field982 = 1000;
        } else if (field876 >= 4) {
            if (field982 <= 5) {
                this.method738("js5connect");
                field982 = 1000;
            } else {
                field875 = 3000;
            }
        }
    }

    @ObfuscatedName("ad.et(I)V")
    public static void method206() {
        if (field940 == 0) {
            Statics.field581 = new class139(4, 104, 104, class62.field696);
            for (int var0 = 0; var0 < 4; var0++) {
                field1090[var0] = new class167(104, 104);
            }
            Statics.field251 = new class299(512, 512);
            class92.field1345 = class237.field3060;
            class92.field1333 = 5;
            field940 = 20;
        } else if (field940 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class136.field1927[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class139.method2514(var1, 500, 800, 512, 334);
            class92.field1345 = class237.field2973;
            class92.field1333 = 10;
            field940 = 30;
        } else if (field940 == 30) {
            Statics.field242 = method1000(0, false, true, true);
            Statics.field1940 = method1000(1, false, true, true);
            Statics.field3701 = method1000(2, true, false, true);
            Statics.field674 = method1000(3, false, true, true);
            Statics.field1283 = method1000(4, false, true, true);
            Statics.field326 = method1000(5, true, true, true);
            Statics.field387 = method1000(6, true, true, false);
            Statics.field485 = method1000(7, false, true, true);
            Statics.field539 = method1000(8, false, true, true);
            Statics.field19 = method1000(9, false, true, true);
            Statics.field474 = method1000(10, false, true, true);
            Statics.field314 = method1000(11, false, true, true);
            Statics.field2159 = method1000(12, false, true, true);
            Statics.field1217 = method1000(13, true, false, true);
            Statics.field2909 = method1000(14, false, true, false);
            Statics.field3692 = method1000(15, false, true, true);
            Statics.field757 = method1000(16, false, true, false);
            class92.field1345 = class237.field2974;
            class92.field1333 = 20;
            field940 = 40;
        } else if (field940 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field242.method3996() * 4 / 100;
            int var8 = var7 + Statics.field1940.method3996() * 4 / 100;
            int var9 = var8 + Statics.field3701.method3996() * 2 / 100;
            int var10 = var9 + Statics.field674.method3996() * 2 / 100;
            int var11 = var10 + Statics.field1283.method3996() * 6 / 100;
            int var12 = var11 + Statics.field326.method3996() * 4 / 100;
            int var13 = var12 + Statics.field387.method3996() * 2 / 100;
            int var14 = var13 + Statics.field485.method3996() * 58 / 100;
            int var15 = var14 + Statics.field539.method3996() * 2 / 100;
            int var16 = var15 + Statics.field19.method3996() * 2 / 100;
            int var17 = var16 + Statics.field474.method3996() * 2 / 100;
            int var18 = var17 + Statics.field314.method3996() * 2 / 100;
            int var19 = var18 + Statics.field2159.method3996() * 2 / 100;
            int var20 = var19 + Statics.field1217.method3996() * 2 / 100;
            int var21 = var20 + Statics.field2909.method3996() * 2 / 100;
            int var22 = var21 + Statics.field3692.method3996() * 2 / 100;
            int var23 = var22 + Statics.field757.method3996() * 2 / 100;
            if (var23 == 100) {
                class92.field1345 = class237.field2976;
                class92.field1333 = 30;
                field940 = 45;
            } else {
                if (var23 != 0) {
                    class92.field1345 = class237.field3089 + var23 + "%";
                }
                class92.field1333 = 30;
            }
        } else if (field940 == 45) {
            class109.method3219(22050, !field1002, 2);
            class216 var24 = new class216();
            var24.method3542(9, 128);
            Statics.field471 = Statics.method3270(Statics.field638, 0, 22050);
            Statics.field471.method1843(var24);
            class249 var25 = Statics.field3692;
            class249 var26 = Statics.field2909;
            class249 var27 = Statics.field1283;
            Statics.field2627 = var25;
            Statics.field2622 = var26;
            Statics.field2625 = var27;
            Statics.field3754 = var24;
            Statics.field1901 = Statics.method3270(Statics.field638, 1, 2048);
            Statics.field2629 = new class102();
            Statics.field1901.method1843(Statics.field2629);
            Statics.field458 = new class116(22050, Statics.field715);
            class92.field1345 = class237.field3111;
            class92.field1333 = 35;
            field940 = 50;
            Statics.field3303 = new class274(Statics.field539, Statics.field1217);
        } else if (field940 == 50) {
            int var28 = class273.method4492().length;
            field894 = Statics.field3303.method4499(class273.method4492());
            if (field894.size() < var28) {
                class92.field1345 = class237.field3109 + field894.size() * 100 / var28 + "%";
                class92.field1333 = 40;
            } else {
                Statics.field621 = (class275) field894.get(class273.field3694);
                Statics.field28 = (class275) field894.get(class273.field3690);
                Statics.field745 = (class275) field894.get(class273.field3691);
                Statics.field577 = new class305(true);
                class92.field1345 = class237.field2979;
                class92.field1333 = 40;
                field940 = 60;
            }
        } else if (field940 == 60) {
            class249 var29 = Statics.field474;
            class249 var30 = Statics.field539;
            int var31 = 0;
            if (var29.method3920("title.jpg", "")) {
                var31++;
            }
            if (var30.method3920("logo", "")) {
                var31++;
            }
            if (var30.method3920("logo_deadman_mode", "")) {
                var31++;
            }
            if (var30.method3920("titlebox", "")) {
                var31++;
            }
            if (var30.method3920("titlebutton", "")) {
                var31++;
            }
            if (var30.method3920("runes", "")) {
                var31++;
            }
            if (var30.method3920("title_mute", "")) {
                var31++;
            }
            if (var30.method3920("options_radio_buttons,0", "")) {
                var31++;
            }
            if (var30.method3920("options_radio_buttons,2", "")) {
                var31++;
            }
            if (var30.method3920("options_radio_buttons,4", "")) {
                var31++;
            }
            if (var30.method3920("options_radio_buttons,6", "")) {
                var31++;
            }
            var30.method3920("sl_back", "");
            var30.method3920("sl_flags", "");
            var30.method3920("sl_arrows", "");
            var30.method3920("sl_stars", "");
            var30.method3920("sl_button", "");
            int var34 = class92.method1550();
            if (var31 < var34) {
                class92.field1345 = class237.field2980 + var31 * 100 / var34 + "%";
                class92.field1333 = 50;
            } else {
                class92.field1345 = class237.field2981;
                class92.field1333 = 50;
                method939(5);
                field940 = 70;
            }
        } else if (field940 == 70) {
            if (Statics.field3701.method3900()) {
                class249 var35 = Statics.field3701;
                Statics.field3662 = var35;
                class249 var36 = Statics.field3701;
                Statics.field3430 = var36;
                class249 var37 = Statics.field3701;
                class249 var38 = Statics.field485;
                Statics.field3437 = var37;
                Statics.field3433 = var38;
                Statics.field266 = Statics.field3437.method3907(3);
                class267.method3987(Statics.field3701, Statics.field485, field1002);
                class270.method3891(Statics.field3701, Statics.field485);
                class249 var39 = Statics.field3701;
                Statics.field3472 = var39;
                class249 var40 = Statics.field3701;
                class249 var41 = Statics.field485;
                boolean var42 = field850;
                class275 var43 = Statics.field621;
                Statics.field3584 = var40;
                Statics.field3249 = var41;
                Statics.field719 = var42;
                Statics.field2464 = Statics.field3584.method3907(10);
                Statics.field2749 = var43;
                class249 var44 = Statics.field3701;
                class249 var45 = Statics.field242;
                class249 var46 = Statics.field1940;
                Statics.field455 = var44;
                Statics.field3670 = var45;
                Statics.field3687 = var46;
                class257.method1343(Statics.field3701, Statics.field485);
                class262.method3875(Statics.field3701);
                class253.method1575(Statics.field3701);
                class228.method1498(Statics.field674, Statics.field485, Statics.field539, Statics.field1217);
                class252.method309(Statics.field3701);
                class265.method1510(Statics.field3701);
                class255.method135(Statics.field3701);
                class256.method23(Statics.field3701);
                class263.method1502(Statics.field3701);
                Statics.field1460 = new class96();
                class249 var47 = Statics.field3701;
                class249 var48 = Statics.field539;
                class249 var49 = Statics.field1217;
                Statics.field3498 = var47;
                Statics.field3488 = var48;
                Statics.field3489 = var49;
                class260.method2933(Statics.field3701, Statics.field539);
                class249 var50 = Statics.field3701;
                class249 var51 = Statics.field539;
                Statics.field3393 = var51;
                if (var50.method3900()) {
                    Statics.field3380 = var50.method3907(35);
                    Statics.field3379 = new class254[Statics.field3380];
                    for (int var52 = 0; var52 < Statics.field3380; var52++) {
                        byte[] var53 = var50.method3897(35, var52);
                        if (var53 != null) {
                            Statics.field3379[var52] = new class254(var52);
                            Statics.field3379[var52].method4065(new class185(var53));
                            Statics.field3379[var52].method4067();
                        }
                    }
                }
                class92.field1345 = class237.field3139;
                class92.field1333 = 60;
                field940 = 80;
            } else {
                class92.field1345 = class237.field2982 + Statics.field3701.method4002() + "%";
                class92.field1333 = 60;
            }
        } else if (field940 == 80) {
            int var54 = 0;
            if (Statics.field275 == null) {
                Statics.field275 = class300.method4645(Statics.field539, "compass", "");
            } else {
                var54++;
            }
            if (Statics.field562 == null) {
                Statics.field562 = class300.method4645(Statics.field539, "mapedge", "");
            } else {
                var54++;
            }
            if (Statics.field1314 == null) {
                Statics.field1314 = class300.method2744(Statics.field539, "mapscene", "");
            } else {
                var54++;
            }
            if (Statics.field304 == null) {
                Statics.field304 = class300.method634(Statics.field539, "headicons_pk", "");
            } else {
                var54++;
            }
            if (Statics.field302 == null) {
                Statics.field302 = class300.method634(Statics.field539, "headicons_prayer", "");
            } else {
                var54++;
            }
            if (Statics.field3928 == null) {
                Statics.field3928 = class300.method634(Statics.field539, "headicons_hint", "");
            } else {
                var54++;
            }
            if (Statics.field459 == null) {
                Statics.field459 = class300.method634(Statics.field539, "mapmarker", "");
            } else {
                var54++;
            }
            if (Statics.field341 == null) {
                Statics.field341 = class300.method634(Statics.field539, "cross", "");
            } else {
                var54++;
            }
            if (Statics.field1431 == null) {
                Statics.field1431 = class300.method634(Statics.field539, "mapdots", "");
            } else {
                var54++;
            }
            if (Statics.field2020 == null) {
                Statics.field2020 = class300.method2744(Statics.field539, "scrollbar", "");
            } else {
                var54++;
            }
            if (Statics.field785 == null) {
                Statics.field785 = class300.method2744(Statics.field539, "mod_icons", "");
            } else {
                var54++;
            }
            if (var54 < 11) {
                class92.field1345 = class237.field2984 + var54 * 100 / 12 + "%";
                class92.field1333 = 70;
            } else {
                Statics.field3714 = Statics.field785;
                Statics.field562.method4860();
                int var55 = (int) (Math.random() * 21.0D) - 10;
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 41.0D) - 20;
                Statics.field1314[0].method4782(var55 + var58, var56 + var58, var57 + var58);
                class92.field1345 = class237.field2985;
                class92.field1333 = 70;
                field940 = 90;
            }
        } else if (field940 == 90) {
            if (Statics.field19.method3900()) {
                class125 var59 = new class125(Statics.field19, Statics.field539, 20, 0.8D, field1002 ? 64 : 128);
                class136.method2415(var59);
                class136.method2398(0.8D);
                class92.field1345 = class237.field2975;
                class92.field1333 = 90;
                field940 = 110;
            } else {
                class92.field1345 = class237.field3036 + Statics.field19.method4002() + "%";
                class92.field1333 = 90;
            }
        } else if (field940 == 110) {
            Statics.field546 = new class71();
            Statics.field638.method2733(Statics.field546, 10);
            class92.field1345 = class237.field3219;
            class92.field1333 = 92;
            field940 = 120;
        } else if (field940 == 120) {
            if (Statics.field474.method3920("huffman", "")) {
                class177 var60 = new class177(Statics.field474.method3978("huffman", ""));
                Statics.field3727 = var60;
                class92.field1345 = class237.field2990;
                class92.field1333 = 94;
                field940 = 130;
            } else {
                class92.field1345 = class237.field2988 + "%";
                class92.field1333 = 94;
            }
        } else if (field940 == 130) {
            if (!Statics.field674.method3900()) {
                class92.field1345 = class237.field3227 + Statics.field674.method4002() * 4 / 5 + "%";
                class92.field1333 = 96;
            } else if (!Statics.field2159.method3900()) {
                class92.field1345 = class237.field3227 + (80 + Statics.field2159.method4002() / 6) + "%";
                class92.field1333 = 96;
            } else if (Statics.field1217.method3900()) {
                class92.field1345 = class237.field2992;
                class92.field1333 = 98;
                field940 = 140;
            } else {
                class92.field1345 = class237.field3227 + (96 + Statics.field1217.method4002() / 50) + "%";
                class92.field1333 = 96;
            }
        } else if (field940 == 140) {
            class92.field1333 = 100;
            if (Statics.field757.method3917(class41.field511.field515)) {
                if (Statics.field713 == null) {
                    Statics.field713 = new class302();
                    Statics.field713.method4947(Statics.field757, Statics.field745, field894, Statics.field1314);
                }
                int var61 = Statics.field713.method5028();
                if (var61 < 100) {
                    class92.field1345 = class237.field2971 + (var61 * 9 / 10 + 10) + "%";
                } else {
                    class92.field1345 = class237.field2994;
                    field940 = 150;
                }
            } else {
                class92.field1345 = class237.field2971 + Statics.field757.method3919(class41.field511.field515) / 10 + "%";
            }
        } else if (field940 == 150) {
            method939(10);
        }
    }

    @ObfuscatedName("bj.ee(IZZZB)Liu;")
    public static class249 method1000(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class165 var4 = null;
        if (class158.field2146 != null) {
            var4 = new class165(arg0, class158.field2146, Statics.field2144[arg0], 1000000);
        }
        return new class249(var4, Statics.field628, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.ep(B)V")
    public final void method1217() {
        class160 var1 = field889.method1708();
        class191 var2 = field889.field1451;
        try {
            if (field881 == 0) {
                if (var1 != null) {
                    var1.method2776();
                    var1 = null;
                }
                Statics.field561 = null;
                field1096 = false;
                field1014 = 0;
                field881 = 1;
            }
            if (field881 == 1) {
                if (Statics.field561 == null) {
                    Statics.field561 = Statics.field638.method2737(Statics.field261, Statics.field3619);
                }
                if (Statics.field561.field2123 == 2) {
                    throw new IOException();
                }
                if (Statics.field561.field2123 == 1) {
                    if (field892) {
                        var1 = class160.method306((Socket) Statics.field561.field2127, 40000, 5000);
                    } else {
                        var1 = new class164((Socket) Statics.field561.field2127, Statics.field638, 5000);
                    }
                    field889.method1707(var1);
                    Statics.field561 = null;
                    field881 = 2;
                }
            }
            if (field881 == 2) {
                field889.method1710();
                class175 var3 = class175.method2801();
                var3.field2440 = null;
                var3.field2433 = 0;
                var3.field2434 = new class191(5000);
                var3.field2434.method2946(class173.field2412.field2415);
                field889.method1706(var3);
                field889.method1705();
                var2.field2509 = 0;
                field881 = 3;
            }
            if (field881 == 3) {
                if (Statics.field471 != null) {
                    Statics.field471.method1845();
                }
                if (Statics.field1901 != null) {
                    Statics.field1901.method1845();
                }
                boolean var6 = true;
                if (field892 && !var1.method2772(1)) {
                    var6 = false;
                }
                if (var6) {
                    int var7 = var1.method2786();
                    if (Statics.field471 != null) {
                        Statics.field471.method1845();
                    }
                    if (Statics.field1901 != null) {
                        Statics.field1901.method1845();
                    }
                    if (var7 != 0) {
                        method1663(var7);
                        return;
                    }
                    var2.field2509 = 0;
                    field881 = 4;
                }
            }
            if (field881 == 4) {
                if (var2.field2509 < 8) {
                    int var8 = var1.method2773();
                    if (var8 > 8 - var2.field2509) {
                        var8 = 8 - var2.field2509;
                    }
                    if (var8 > 0) {
                        var1.method2782(var2.field2512, var2.field2509, var8);
                        var2.field2509 += var8;
                    }
                }
                if (var2.field2509 == 8) {
                    var2.field2509 = 0;
                    Statics.field710 = var2.method2974();
                    field881 = 5;
                }
            }
            if (field881 == 5) {
                field889.field1451.field2509 = 0;
                field889.method1710();
                class191 var9 = new class191(500);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field710 >> 32), (int) (Statics.field710 & 0xFFFFFFFFFFFFFFFFL) };
                var9.field2509 = 0;
                var9.method2946(1);
                var9.method2946(field1064.method10());
                var9.method2949(var10[0]);
                var9.method2949(var10[1]);
                var9.method2949(var10[2]);
                var9.method2949(var10[3]);
                switch(field1064.field2094) {
                    case 0:
                    case 1:
                        var9.method3045(Statics.field241);
                        var9.field2509 += 5;
                        break;
                    case 2:
                        var9.field2509 += 8;
                        break;
                    case 3:
                        LinkedHashMap var12 = Statics.field15.field1216;
                        String var13 = class92.field1340;
                        int var14 = var13.length();
                        int var15 = 0;
                        for (int var16 = 0; var16 < var14; var16++) {
                            var15 = (var15 << 5) - var15 + var13.charAt(var16);
                        }
                        var9.method2949((Integer) var12.get(var15));
                        var9.field2509 += 4;
                }
                var9.method3106(class92.field1341);
                var9.method2960(class90.field1304, class90.field1302);
                class175 var18 = class175.method2801();
                var18.field2440 = null;
                var18.field2433 = 0;
                var18.field2434 = new class191(5000);
                var18.field2434.field2509 = 0;
                if (field982 == 40) {
                    var18.field2434.method2946(class173.field2414.field2415);
                } else {
                    var18.field2434.method2946(class173.field2417.field2415);
                }
                var18.field2434.method2944(0);
                int var21 = var18.field2434.field2509;
                var18.field2434.method2949(160);
                var18.field2434.method2964(var9.field2512, 0, var9.field2509);
                int var22 = var18.field2434.field2509;
                var18.field2434.method3106(class92.field1340);
                var18.field2434.method2946((field1043 ? 1 : 0) << 1 | (field1002 ? 1 : 0));
                var18.field2434.method2944(Statics.field2446);
                var18.field2434.method2944(Statics.field1897);
                class191 var23 = var18.field2434;
                if (field1035 == null) {
                    byte[] var24 = new byte[24];
                    try {
                        class158.field2141.method2114(0L);
                        class158.field2141.method2113(var24);
                        int var25;
                        for (var25 = 0; var25 < 24 && var24[var25] == 0; var25++) {
                        }
                        if (var25 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var71) {
                        for (int var27 = 0; var27 < 24; var27++) {
                            var24[var27] = -1;
                        }
                    }
                    var23.method2964(var24, 0, var24.length);
                } else {
                    var23.method2964(field1035, 0, field1035.length);
                }
                var18.field2434.method3106(Statics.field2104);
                var18.field2434.method2949(Statics.field32);
                class185 var30 = new class185(Statics.field577.method5138());
                Statics.field577.method5139(var30);
                var18.field2434.method2964(var30.field2512, 0, var30.field2512.length);
                var18.field2434.method2946(Statics.field400);
                var18.field2434.method2949(0);
                var18.field2434.method2949(Statics.field242.field3322);
                var18.field2434.method2949(Statics.field1940.field3322);
                var18.field2434.method2949(Statics.field3701.field3322);
                var18.field2434.method2949(Statics.field674.field3322);
                var18.field2434.method2949(Statics.field1283.field3322);
                var18.field2434.method2949(Statics.field326.field3322);
                var18.field2434.method2949(Statics.field387.field3322);
                var18.field2434.method2949(Statics.field485.field3322);
                var18.field2434.method2949(Statics.field539.field3322);
                var18.field2434.method2949(Statics.field19.field3322);
                var18.field2434.method2949(Statics.field474.field3322);
                var18.field2434.method2949(Statics.field314.field3322);
                var18.field2434.method2949(Statics.field2159.field3322);
                var18.field2434.method2949(Statics.field1217.field3322);
                var18.field2434.method2949(Statics.field2909.field3322);
                var18.field2434.method2949(Statics.field3692.field3322);
                var18.field2434.method2949(Statics.field757.field3322);
                var18.field2434.method2981(var10, var22, var18.field2434.field2509);
                var18.field2434.method2958(var18.field2434.field2509 - var21);
                field889.method1706(var18);
                field889.method1705();
                field889.field1450 = new class192(var10);
                for (int var31 = 0; var31 < 4; var31++) {
                    var10[var31] += 50;
                }
                var2.method3236(var10);
                field881 = 6;
            }
            if (field881 == 6 && var1.method2773() > 0) {
                int var32 = var1.method2786();
                if (var32 == 21 && field982 == 20) {
                    field881 = 7;
                } else if (var32 == 2) {
                    field881 = 9;
                } else if (var32 == 15 && field982 == 40) {
                    field889.field1446 = -1;
                    field881 = 13;
                } else if (var32 == 23 && field1005 < 1) {
                    field1005++;
                    field881 = 0;
                } else if (var32 == 29) {
                    field881 = 11;
                } else {
                    method1663(var32);
                    return;
                }
            }
            if (field881 == 7 && var1.method2773() > 0) {
                field880 = (var1.method2786() + 3) * 60;
                field881 = 8;
            }
            if (field881 == 8) {
                field1014 = 0;
                class92.method934(class237.field2998, class237.field2999, field880 / 60 + class237.field3000);
                if (--field880 <= 0) {
                    field881 = 0;
                }
            } else {
                if (field881 == 9 && var1.method2773() >= 13) {
                    boolean var33 = var1.method2786() == 1;
                    var1.method2782(var2.field2512, 0, 4);
                    var2.field2509 = 0;
                    boolean var34 = false;
                    if (var33) {
                        int var35 = var2.method3239() << 24;
                        int var36 = var35 | var2.method3239() << 16;
                        int var37 = var36 | var2.method3239() << 8;
                        int var38 = var37 | var2.method3239();
                        String var39 = class92.field1340;
                        int var40 = var39.length();
                        int var41 = 0;
                        int var42 = 0;
                        while (true) {
                            if (var42 >= var40) {
                                if (Statics.field15.field1216.size() >= 10 && !Statics.field15.field1216.containsKey(var41)) {
                                    Iterator var45 = Statics.field15.field1216.entrySet().iterator();
                                    var45.next();
                                    var45.remove();
                                }
                                Statics.field15.field1216.put(var41, var38);
                                break;
                            }
                            var41 = (var41 << 5) - var41 + var39.charAt(var42);
                            var42++;
                        }
                    }
                    if (class92.field1337) {
                        Statics.field15.field1219 = class92.field1340;
                    } else {
                        Statics.field15.field1219 = null;
                    }
                    class81.method52();
                    field996 = var1.method2786();
                    field872 = var1.method2786() == 1;
                    field950 = var1.method2786();
                    field950 <<= 0x8;
                    field950 += var1.method2786();
                    field919 = var1.method2786();
                    var1.method2782(var2.field2512, 0, 1);
                    var2.field2509 = 0;
                    class171[] var46 = new class171[] { class171.field2256, class171.field2230, class171.field2231, class171.field2232, class171.field2264, class171.field2234, class171.field2301, class171.field2236, class171.field2242, class171.field2238, class171.field2239, class171.field2240, class171.field2241, class171.field2303, class171.field2243, class171.field2258, class171.field2245, class171.field2246, class171.field2250, class171.field2248, class171.field2249, class171.field2297, class171.field2251, class171.field2252, class171.field2253, class171.field2254, class171.field2300, class171.field2259, class171.field2257, class171.field2229, class171.field2283, class171.field2260, class171.field2302, class171.field2262, class171.field2255, class171.field2237, class171.field2265, class171.field2266, class171.field2267, class171.field2307, class171.field2247, class171.field2270, class171.field2233, class171.field2272, class171.field2273, class171.field2274, class171.field2275, class171.field2276, class171.field2269, class171.field2278, class171.field2263, class171.field2280, class171.field2281, class171.field2282, class171.field2290, class171.field2284, class171.field2285, class171.field2286, class171.field2287, class171.field2288, class171.field2235, class171.field2296, class171.field2291, class171.field2292, class171.field2293, class171.field2244, class171.field2279, class171.field2289, class171.field2268, class171.field2298, class171.field2299, class171.field2277, class171.field2271, class171.field2305, class171.field2310, class171.field2304, class171.field2294, class171.field2306, class171.field2261, class171.field2295, class171.field2309 };
                    int var48 = var2.method3241();
                    if (var48 < 0 || var48 >= var46.length) {
                        throw new IOException(var48 + " " + var2.field2509);
                    }
                    field889.field1452 = var46[var48];
                    field889.field1446 = field889.field1452.field2311;
                    var1.method2782(var2.field2512, 0, 2);
                    var2.field2509 = 0;
                    field889.field1446 = var2.method3194();
                    try {
                        class53.method656(Statics.field284, "zap");
                    } catch (Throwable var70) {
                    }
                    field881 = 10;
                }
                if (field881 != 10) {
                    if (field881 == 11 && var1.method2773() >= 2) {
                        var2.field2509 = 0;
                        var1.method2782(var2.field2512, 0, 2);
                        var2.field2509 = 0;
                        Statics.field2223 = var2.method3194();
                        field881 = 12;
                    }
                    if (field881 == 12 && var1.method2773() >= Statics.field2223) {
                        var2.field2509 = 0;
                        var1.method2782(var2.field2512, 0, Statics.field2223);
                        var2.field2509 = 0;
                        String var61 = var2.method3168();
                        String var62 = var2.method3168();
                        String var63 = var2.method3168();
                        class92.method934(var61, var62, var63);
                        method939(10);
                    }
                    if (field881 == 13) {
                        if (field889.field1446 == -1) {
                            if (var1.method2773() < 2) {
                                return;
                            }
                            var1.method2782(var2.field2512, 0, 2);
                            var2.field2509 = 0;
                            field889.field1446 = var2.method3194();
                        }
                        if (var1.method2773() >= field889.field1446) {
                            var1.method2782(var2.field2512, 0, field889.field1446);
                            var2.field2509 = 0;
                            int var64 = field889.field1446;
                            field893.method4662();
                            field889.method1710();
                            field889.field1451.field2509 = 0;
                            field889.field1452 = null;
                            field889.field1457 = null;
                            field889.field1458 = null;
                            field889.field1459 = null;
                            field889.field1446 = 0;
                            field889.field1454 = 0;
                            field862 = 0;
                            method517();
                            field1063 = 0;
                            field1061 = 0;
                            for (int var65 = 0; var65 < 2048; var65++) {
                                field949[var65] = null;
                            }
                            Statics.field2088 = null;
                            for (int var66 = 0; var66 < field884.length; var66++) {
                                class86 var67 = field884[var66];
                                if (var67 != null) {
                                    var67.field1149 = -1;
                                    var67.field1150 = false;
                                }
                            }
                            class64.field726 = new class202(32);
                            method939(30);
                            for (int var68 = 0; var68 < 100; var68++) {
                                field1034[var68] = true;
                            }
                            method959();
                            class95.method1364(var2);
                            if (var2.field2509 != var64) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field1014++;
                        if (field1014 > 2000) {
                            if (field1005 < 1) {
                                if (Statics.field3619 == Statics.field1263) {
                                    Statics.field3619 = Statics.field1664;
                                } else {
                                    Statics.field3619 = Statics.field1263;
                                }
                                field1005++;
                                field881 = 0;
                            } else {
                                method1663(-3);
                            }
                        }
                    }
                } else if (var1.method2773() >= field889.field1446) {
                    var2.field2509 = 0;
                    var1.method2782(var2.field2512, 0, field889.field1446);
                    field893.method4650();
                    field984 = 1L;
                    field859 = -1;
                    Statics.field546.field791 = 0;
                    Statics.field3252 = true;
                    field860 = true;
                    field1053 = -1L;
                    class294.method4333();
                    field889.method1710();
                    field889.field1451.field2509 = 0;
                    field889.field1452 = null;
                    field889.field1457 = null;
                    field889.field1458 = null;
                    field889.field1459 = null;
                    field889.field1446 = 0;
                    field889.field1454 = 0;
                    field862 = 0;
                    field882 = 0;
                    field863 = 0;
                    method517();
                    class60.field685 = 0;
                    class97.method101();
                    field864 = 0;
                    field1041 = false;
                    field1069 = 0;
                    field913 = 0;
                    field1063 = 0;
                    field1056 = -1;
                    field1061 = 0;
                    field1062 = 0;
                    field871 = class91.field1311;
                    field935 = class91.field1311;
                    field885 = 0;
                    class95.method1015();
                    for (int var50 = 0; var50 < 2048; var50++) {
                        field949[var50] = null;
                    }
                    for (int var51 = 0; var51 < 32768; var51++) {
                        field884[var51] = null;
                    }
                    field958 = -1;
                    field961.method3464();
                    field887.method3464();
                    for (int var52 = 0; var52 < 4; var52++) {
                        for (int var53 = 0; var53 < 104; var53++) {
                            for (int var54 = 0; var54 < 104; var54++) {
                                field1036[var52][var53][var54] = null;
                            }
                        }
                    }
                    field960 = new class205();
                    field1095 = 0;
                    field1094 = 0;
                    field905 = 0;
                    for (int var55 = 0; var55 < Statics.field2029; var55++) {
                        class253 var56 = class253.method171(var55);
                        if (var56 != null) {
                            class223.field2722[var55] = 0;
                            class223.field2723[var55] = 0;
                        }
                    }
                    Statics.field1460.method1638();
                    field997 = -1;
                    if (field873 != -1) {
                        class228.method4197(field873);
                    }
                    for (class68 var57 = (class68) field947.method3379(); var57 != null; var57 = (class68) field947.method3384()) {
                        method943(var57, true);
                    }
                    field873 = -1;
                    field947 = new class202(8);
                    field959 = null;
                    method517();
                    field1091.method3765((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var58 = 0; var58 < 8; var58++) {
                        field955[var58] = null;
                        field956[var58] = false;
                    }
                    class64.field726 = new class202(32);
                    field854 = true;
                    for (int var59 = 0; var59 < 100; var59++) {
                        field1034[var59] = true;
                    }
                    method959();
                    field1054 = null;
                    Statics.field2559 = 0;
                    Statics.field631 = null;
                    for (int var60 = 0; var60 < 8; var60++) {
                        field912[var60] = new class17();
                    }
                    Statics.field627 = null;
                    class95.method1364(var2);
                    Statics.field14 = -1;
                    method692(false, var2);
                    field889.field1452 = null;
                }
            }
        } catch (IOException var72) {
            if (field1005 < 1) {
                if (Statics.field3619 == Statics.field1263) {
                    Statics.field3619 = Statics.field1664;
                } else {
                    Statics.field3619 = Statics.field1263;
                }
                field1005++;
                field881 = 0;
            } else {
                method1663(-2);
            }
        }
    }

    @ObfuscatedName("cm.ex(IB)V")
    public static void method1663(int arg0) {
        if (arg0 == -3) {
            class92.method934(class237.field3001, class237.field3064, class237.field3003);
        } else if (arg0 == -2) {
            class92.method934(class237.field3004, class237.field3005, class237.field3006);
        } else if (arg0 == -1) {
            class92.method934(class237.field3127, class237.field3008, class237.field3044);
        } else if (arg0 == 3) {
            class92.field1335 = 3;
        } else if (arg0 == 4) {
            class92.method934(class237.field3010, class237.field3011, class237.field3012);
        } else if (arg0 == 5) {
            class92.method934(class237.field3223, class237.field3014, class237.field3015);
        } else if (arg0 == 6) {
            class92.method934(class237.field3016, class237.field3017, class237.field3018);
        } else if (arg0 == 7) {
            class92.method934(class237.field3019, class237.field3020, class237.field3021);
        } else if (arg0 == 8) {
            class92.method934(class237.field3215, class237.field3210, class237.field3024);
        } else if (arg0 == 9) {
            class92.method934(class237.field3025, class237.field3026, class237.field3027);
        } else if (arg0 == 10) {
            class92.method934(class237.field3002, class237.field3029, class237.field2978);
        } else if (arg0 == 11) {
            class92.method934(class237.field3031, class237.field3032, class237.field2959);
        } else if (arg0 == 12) {
            class92.method934(class237.field3080, class237.field2991, class237.field3009);
        } else if (arg0 == 13) {
            class92.method934(class237.field3037, class237.field3086, class237.field3138);
        } else if (arg0 == 14) {
            class92.method934(class237.field3040, class237.field3041, class237.field3042);
        } else if (arg0 == 16) {
            class92.method934(class237.field3043, class237.field3077, class237.field3007);
        } else if (arg0 == 17) {
            class92.method934(class237.field2969, class237.field3047, class237.field3048);
        } else if (arg0 == 18) {
            class92.method934(class237.field3093, class237.field3050, class237.field3051);
        } else if (arg0 == 19) {
            class92.method934(class237.field2960, class237.field3053, class237.field3054);
        } else if (arg0 == 20) {
            class92.method934(class237.field3055, class237.field3056, class237.field3197);
        } else if (arg0 == 22) {
            class92.method934(class237.field3058, class237.field3144, class237.field3039);
        } else if (arg0 == 23) {
            class92.method934(class237.field3030, class237.field3072, class237.field3063);
        } else if (arg0 == 24) {
            class92.method934(class237.field3106, class237.field3065, class237.field3066);
        } else if (arg0 == 25) {
            class92.method934(class237.field3067, class237.field3068, class237.field3069);
        } else if (arg0 == 26) {
            class92.method934(class237.field3235, class237.field3071, class237.field3022);
        } else if (arg0 == 27) {
            class92.method934(class237.field3073, class237.field3049, class237.field3075);
        } else if (arg0 == 31) {
            class92.method934(class237.field3082, class237.field3057, class237.field3084);
        } else if (arg0 == 32) {
            class92.method934(class237.field3085, class237.field3023, class237.field3087);
        } else if (arg0 == 37) {
            class92.method934(class237.field3088, class237.field3132, class237.field3191);
        } else if (arg0 == 38) {
            class92.method934(class237.field3091, class237.field3092, class237.field3188);
        } else if (arg0 == 55) {
            class92.method934(class237.field3094, class237.field3214, class237.field3096);
        } else if (arg0 == 56) {
            class92.method934(class237.field3035, class237.field3098, class237.field3099);
            method939(11);
            return;
        } else if (arg0 == 57) {
            class92.method934(class237.field3100, class237.field3179, class237.field3061);
            method939(11);
            return;
        } else {
            class92.method934(class237.field3103, class237.field3104, class237.field3105);
        }
        method939(10);
    }

    @ObfuscatedName("cm.en(B)V")
    public static final void method1679() {
        field889.method1719();
        method17();
        Statics.field581.method2479();
        for (int var0 = 0; var0 < 4; var0++) {
            field1090[var0].method2833();
        }
        System.gc();
        class215.field2621 = 1;
        Statics.field2624 = null;
        Statics.field693 = -1;
        Statics.field3755 = -1;
        Statics.field2626 = 0;
        Statics.field2182 = false;
        Statics.field2160 = 2;
        field851 = -1;
        field1009 = false;
        class82.method204();
        method939(10);
    }

    @ObfuscatedName("z.ew(I)V")
    public static final void method17() {
        class271.field3658.method3370();
        class258.method1528();
        class259.method4032();
        class267.method198();
        class270.field3656.method3370();
        class270.field3623.method3370();
        class268.field3564.method3370();
        class268.field3565.method3370();
        class268.field3566.method3370();
        class272.method2659();
        class257.method144();
        class262.field3458.method3370();
        class253.field3374.method3370();
        class266.field3500.method3370();
        class266.field3490.method3370();
        class266.field3492.method3370();
        class260.field3444.method3370();
        class260.field3445.method3370();
        class264.field3473.method3370();
        class263.field3465.method3370();
        class254.field3381.method3370();
        class225.method3269();
        class228.method3237();
        ((class125) Statics.field1924).method2181();
        class98.field1432.method3370();
        Statics.field242.method3924();
        Statics.field1940.method3924();
        Statics.field674.method3924();
        Statics.field1283.method3924();
        Statics.field326.method3924();
        Statics.field387.method3924();
        Statics.field485.method3924();
        Statics.field539.method3924();
        Statics.field19.method3924();
        Statics.field474.method3924();
        Statics.field314.method3924();
        Statics.field2159.method3924();
    }

    @ObfuscatedName("o.er(I)V")
    public static final void method74() {
        if (field882 > 0) {
            method1679();
        } else {
            field893.method4665();
            method939(40);
            Statics.field686 = field889.method1708();
            field889.method1717();
        }
    }

    @ObfuscatedName("ex.eo(ZI)V")
    public static final void method2692(boolean arg0) {
        if (arg0) {
            field1064 = class92.field1347 ? class151.field2091 : class151.field2093;
            return;
        }
        LinkedHashMap var1 = Statics.field15.field1216;
        String var2 = class92.field1340;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field1064 = var1.containsKey(var4) ? class151.field2095 : class151.field2092;
    }

    @ObfuscatedName("client.ev(I)V")
    public final void method1027() {
        if (field862 > 1) {
            field862--;
        }
        if (field882 > 0) {
            field882--;
        }
        if (field1096) {
            field1096 = false;
            method74();
            return;
        }
        if (!field972) {
            method1003();
        }
        for (int var1 = 0; var1 < 100 && this.method1111(field889); var1++) {
        }
        if (field982 != 30) {
            return;
        }
        while (true) {
            class293 var2 = (class293) class294.field3825.method3399();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field893.field3797) {
                    class175 var6 = class175.method3893(class172.field2346, field889.field1450);
                    var6.field2434.method2946(0);
                    int var7 = var6.field2434.field2509;
                    field893.method4674(var6.field2434);
                    var6.field2434.method2959(var6.field2434.field2509 - var7);
                    field889.method1706(var6);
                    field893.method4653();
                }
                Object var8 = Statics.field546.field790;
                synchronized (Statics.field546.field790) {
                    if (!field1100) {
                        Statics.field546.field791 = 0;
                    } else if (class60.field679 != 0 || Statics.field546.field791 >= 40) {
                        class175 var9 = class175.method3893(class172.field2357, field889.field1450);
                        var9.field2434.method2946(0);
                        int var10 = var9.field2434.field2509;
                        int var11 = 0;
                        for (int var12 = 0; var12 < Statics.field546.field791 && var9.field2434.field2509 - var10 < 240; var12++) {
                            var11++;
                            int var13 = Statics.field546.field792[var12];
                            if (var13 < 0) {
                                var13 = 0;
                            } else if (var13 > 502) {
                                var13 = 502;
                            }
                            int var14 = Statics.field546.field789[var12];
                            if (var14 < 0) {
                                var14 = 0;
                            } else if (var14 > 764) {
                                var14 = 764;
                            }
                            int var15 = var13 * 765 + var14;
                            if (Statics.field546.field792[var12] == -1 && Statics.field546.field789[var12] == -1) {
                                var14 = -1;
                                var13 = -1;
                                var15 = 524287;
                            }
                            if (field1017 != var14 || field967 != var13) {
                                int var16 = var14 - field1017;
                                field1017 = var14;
                                int var17 = var13 - field967;
                                field967 = var13;
                                if (field859 < 8 && var16 >= -32 && var16 <= 31 && var17 >= -32 && var17 <= 31) {
                                    var16 += 32;
                                    var17 += 32;
                                    var9.field2434.method2944((field859 << 12) + (var16 << 6) + var17);
                                    field859 = 0;
                                } else if (field859 < 8) {
                                    var9.field2434.method3045((field859 << 19) + 8388608 + var15);
                                    field859 = 0;
                                } else {
                                    var9.field2434.method2949((field859 << 19) + -1073741824 + var15);
                                    field859 = 0;
                                }
                            } else if (field859 < 2047) {
                                field859++;
                            }
                        }
                        var9.field2434.method2959(var9.field2434.field2509 - var10);
                        field889.method1706(var9);
                        if (var11 >= Statics.field546.field791) {
                            Statics.field546.field791 = 0;
                        } else {
                            Statics.field546.field791 -= var11;
                            for (int var18 = 0; var18 < Statics.field546.field791; var18++) {
                                Statics.field546.field789[var18] = Statics.field546.field789[var11 + var18];
                                Statics.field546.field792[var18] = Statics.field546.field792[var11 + var18];
                            }
                        }
                    }
                }
                if (class60.field679 == 1 || !Statics.field456 && class60.field679 == 4 || class60.field679 == 2) {
                    long var20 = (class60.field682 - field984 * -1L) / 50L;
                    if (var20 > 4095L) {
                        var20 = 4095L;
                    }
                    field984 = class60.field682 * -1L;
                    int var22 = class60.field681;
                    if (var22 < 0) {
                        var22 = 0;
                    } else if (var22 > Statics.field1897) {
                        var22 = Statics.field1897;
                    }
                    int var23 = class60.field665;
                    if (var23 < 0) {
                        var23 = 0;
                    } else if (var23 > Statics.field2446) {
                        var23 = Statics.field2446;
                    }
                    int var24 = (int) var20;
                    class175 var25 = class175.method3893(class172.field2359, field889.field1450);
                    var25.field2434.method2944((class60.field679 == 2 ? 1 : 0) + (var24 << 1));
                    var25.field2434.method2944(var23);
                    var25.field2434.method2944(var22);
                    field889.method1706(var25);
                }
                if (class51.field602 > 0) {
                    class175 var26 = class175.method3893(class172.field2334, field889.field1450);
                    var26.field2434.method2944(0);
                    int var27 = var26.field2434.field2509;
                    long var28 = class187.method1411();
                    for (int var30 = 0; var30 < class51.field602; var30++) {
                        long var31 = var28 - field1053;
                        if (var31 > 16777215L) {
                            var31 = 16777215L;
                        }
                        field1053 = var28;
                        var26.field2434.method2988(class51.field601[var30]);
                        var26.field2434.method3003((int) var31);
                    }
                    var26.field2434.method2958(var26.field2434.field2509 - var27);
                    field889.method1706(var26);
                }
                if (field1022 > 0) {
                    field1022--;
                }
                if (class51.field594[96] || class51.field594[97] || class51.field594[98] || class51.field594[99]) {
                    field920 = true;
                }
                if (field920 && field1022 <= 0) {
                    field1022 = 20;
                    field920 = false;
                    class175 var33 = class175.method3893(class172.field2376, field889.field1450);
                    var33.field2434.method2947(field913);
                    var33.field2434.method2997(field999);
                    field889.method1706(var33);
                }
                if (Statics.field3252 && !field860) {
                    field860 = true;
                    class175 var34 = class175.method3893(class172.field2317, field889.field1450);
                    var34.field2434.method2946(1);
                    field889.method1706(var34);
                }
                if (!Statics.field3252 && field860) {
                    field860 = false;
                    class175 var35 = class175.method3893(class172.field2317, field889.field1450);
                    var35.field2434.method2946(0);
                    field889.method1706(var35);
                }
                method2837();
                if (field982 != 30) {
                    return;
                }
                for (class77 var36 = (class77) field960.method3442(); var36 != null; var36 = (class77) field960.method3444()) {
                    if (var36.field1120 > 0) {
                        var36.field1120--;
                    }
                    if (var36.field1120 != 0) {
                        if (var36.field1122 > 0) {
                            var36.field1122--;
                        }
                        if (var36.field1122 == 0 && var36.field1111 >= 1 && var36.field1116 >= 1 && var36.field1111 <= 102 && var36.field1116 <= 102 && (var36.field1109 < 0 || class62.method227(var36.field1109, var36.field1118))) {
                            method4494(var36.field1119, var36.field1121, var36.field1111, var36.field1116, var36.field1109, var36.field1117, var36.field1118);
                            var36.field1122 = -1;
                            if (var36.field1113 == var36.field1109 && var36.field1113 == -1) {
                                var36.method3427();
                            } else if (var36.field1113 == var36.field1109 && var36.field1117 == var36.field1114 && var36.field1118 == var36.field1115) {
                                var36.method3427();
                            }
                        }
                    } else if (var36.field1113 < 0 || class62.method227(var36.field1113, var36.field1115)) {
                        method4494(var36.field1119, var36.field1121, var36.field1111, var36.field1116, var36.field1113, var36.field1114, var36.field1115);
                        var36.method3427();
                    }
                }
                int var10002;
                for (int var37 = 0; var37 < field1069; var37++) {
                    var10002 = field1072[var37]--;
                    if (field1072[var37] >= -10) {
                        class105 var39 = field1103[var37];
                        if (var39 == null) {
                            class105 var10000 = (class105) null;
                            var39 = class105.method1775(Statics.field1283, field1070[var37], 0);
                            if (var39 == null) {
                                continue;
                            }
                            field1072[var37] += var39.method1777();
                            field1103[var37] = var39;
                        }
                        if (field1072[var37] < 0) {
                            int var46;
                            if (field1073[var37] == 0) {
                                var46 = field1067;
                            } else {
                                int var40 = (field1073[var37] & 0xFF) * 128;
                                int var41 = field1073[var37] >> 16 & 0xFF;
                                int var42 = var41 * 128 + 64 - Statics.field2088.field1182;
                                if (var42 < 0) {
                                    var42 = -var42;
                                }
                                int var43 = field1073[var37] >> 8 & 0xFF;
                                int var44 = var43 * 128 + 64 - Statics.field2088.field1143;
                                if (var44 < 0) {
                                    var44 = -var44;
                                }
                                int var45 = var42 + var44 - 128;
                                if (var45 > var40) {
                                    field1072[var37] = -100;
                                    continue;
                                }
                                if (var45 < 0) {
                                    var45 = 0;
                                }
                                var46 = field1068 * (var40 - var45) / var40;
                            }
                            if (var46 > 0) {
                                class107 var47 = var39.method1784().method1821(Statics.field458);
                                class117 var48 = class117.method1974(var47, 100, var46);
                                var48.method1936(field1071[var37] - 1);
                                Statics.field2629.method1729(var48);
                            }
                            field1072[var37] = -100;
                        }
                    } else {
                        field1069--;
                        for (int var38 = var37; var38 < field1069; var38++) {
                            field1070[var38] = field1070[var38 + 1];
                            field1103[var38] = field1103[var38 + 1];
                            field1071[var38] = field1071[var38 + 1];
                            field1072[var38] = field1072[var38 + 1];
                            field1073[var38] = field1073[var38 + 1];
                        }
                        var37--;
                    }
                }
                if (field1009) {
                    boolean var49;
                    if (class215.field2621 == 0) {
                        var49 = Statics.field3754.method3582();
                    } else {
                        var49 = true;
                    }
                    if (!var49) {
                        if (field846 != 0 && field851 != -1) {
                            class215.method4(Statics.field387, field851, 0, field846, false);
                        }
                        field1009 = false;
                    }
                }
                field889.field1454++;
                if (field889.field1454 > 750) {
                    method74();
                    return;
                }
                method3098();
                for (int var50 = 0; var50 < field885; var50++) {
                    int var51 = field886[var50];
                    class86 var52 = field884[var51];
                    if (var52 != null) {
                        method2661(var52, var52.field1273.field3621);
                    }
                }
                int[] var53 = class95.field1394;
                for (int var54 = 0; var54 < class95.field1400; var54++) {
                    class74 var55 = field949[var53[var54]];
                    if (var55 != null && var55.field1158 > 0) {
                        var55.field1158--;
                        if (var55.field1158 == 0) {
                            var55.field1135 = null;
                        }
                    }
                }
                for (int var56 = 0; var56 < field885; var56++) {
                    int var57 = field886[var56];
                    class86 var58 = field884[var57];
                    if (var58 != null && var58.field1158 > 0) {
                        var58.field1158--;
                        if (var58.field1158 == 0) {
                            var58.field1135 = null;
                        }
                    }
                }
                field848++;
                if (field939 != 0) {
                    field1093 += 20;
                    if (field1093 >= 400) {
                        field939 = 0;
                    }
                }
                if (Statics.field743 != null) {
                    field856++;
                    if (field856 >= 15) {
                        method308(Statics.field743);
                        Statics.field743 = null;
                    }
                }
                class228 var59 = Statics.field392;
                class228 var60 = Statics.field1300;
                Statics.field392 = null;
                Statics.field1300 = null;
                field1006 = null;
                field1010 = false;
                field993 = false;
                field1050 = 0;
                while (class51.method3857() && field1050 < 128) {
                    if (field996 >= 2 && class51.field594[82] && Statics.field3305 == 66) {
                        String var61 = class97.method16();
                        Statics.field284.method785(var61);
                    } else {
                        field1052[field1050] = Statics.field3305;
                        field1086[field1050] = Statics.field2187;
                        field1050++;
                    }
                }
                if (method942() && class51.field594[82] && class51.field594[81] && field1027 != 0) {
                    int var62 = Statics.field2088.field822 - field1027;
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 3) {
                        var62 = 3;
                    }
                    if (Statics.field2088.field822 != var62) {
                        method4496(Statics.field556 + Statics.field2088.field1178[0], Statics.field895 + Statics.field2088.field1179[0], var62);
                    }
                    field1027 = 0;
                }
                if (field873 != -1) {
                    method2671(field873, 0, 0, Statics.field2446, Statics.field1897, 0, 0);
                }
                field1058++;
                while (true) {
                    class69 var63;
                    class228 var64;
                    class228 var65;
                    do {
                        var63 = (class69) field1029.method3440();
                        if (var63 == null) {
                            while (true) {
                                class69 var66;
                                class228 var67;
                                class228 var68;
                                do {
                                    var66 = (class69) field1030.method3440();
                                    if (var66 == null) {
                                        while (true) {
                                            class69 var69;
                                            class228 var70;
                                            class228 var71;
                                            do {
                                                var69 = (class69) field1028.method3440();
                                                if (var69 == null) {
                                                    this.method1269();
                                                    if (Statics.field713 != null) {
                                                        Statics.field713.method4956(Statics.field235, (Statics.field2088.field1182 >> 7) + Statics.field556, (Statics.field2088.field1143 >> 7) + Statics.field895, false);
                                                        Statics.field713.method4953();
                                                    }
                                                    if (field1065 != null) {
                                                        this.method1036();
                                                    }
                                                    if (Statics.field507 != null) {
                                                        method308(Statics.field507);
                                                        field1083++;
                                                        if (class60.field672 == 0) {
                                                            if (field946) {
                                                                if (Statics.field567 == Statics.field507 && field936 != field1074) {
                                                                    class228 var72 = Statics.field507;
                                                                    byte var73 = 0;
                                                                    if (field992 == 1 && var72.field2764 == 206) {
                                                                        var73 = 1;
                                                                    }
                                                                    if (var72.field2878[field936] <= 0) {
                                                                        var73 = 0;
                                                                    }
                                                                    int var74 = method464(var72);
                                                                    boolean var75 = (var74 >> 29 & 0x1) != 0;
                                                                    if (var75) {
                                                                        int var76 = field1074;
                                                                        int var77 = field936;
                                                                        var72.field2878[var77] = var72.field2878[var76];
                                                                        var72.field2879[var77] = var72.field2879[var76];
                                                                        var72.field2878[var76] = -1;
                                                                        var72.field2879[var76] = 0;
                                                                    } else if (var73 == 1) {
                                                                        int var78 = field1074;
                                                                        int var79 = field936;
                                                                        while (var78 != var79) {
                                                                            if (var78 > var79) {
                                                                                var72.method3804(var78 - 1, var78);
                                                                                var78--;
                                                                            } else if (var78 < var79) {
                                                                                var72.method3804(var78 + 1, var78);
                                                                                var78++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var72.method3804(field936, field1074);
                                                                    }
                                                                    class175 var80 = class175.method3893(class172.field2335, field889.field1450);
                                                                    var80.field2434.method2986(var73);
                                                                    var80.field2434.method3131(field936);
                                                                    var80.field2434.method3012(Statics.field507.field2868);
                                                                    var80.field2434.method3131(field1074);
                                                                    field889.method1706(var80);
                                                                }
                                                            } else if (this.method1032()) {
                                                                this.method1033(field858, field1040);
                                                            } else if (field938 > 0) {
                                                                method550(field858, field1040);
                                                            }
                                                            field856 = 10;
                                                            class60.field679 = 0;
                                                            Statics.field507 = null;
                                                        } else if (field1083 >= 5 && (class60.field680 > field858 + 5 || class60.field680 < field858 - 5 || class60.field683 * -469125321 > field1040 + 5 || class60.field683 * -469125321 < field1040 - 5)) {
                                                            field946 = true;
                                                        }
                                                    }
                                                    if (class139.method2518()) {
                                                        int var81 = class139.field1981;
                                                        int var82 = class139.field1982;
                                                        class175 var83 = class175.method3893(class172.field2353, field889.field1450);
                                                        var83.field2434.method2946(5);
                                                        var83.field2434.method2988(class51.field594[82] ? (class51.field594[81] ? 2 : 1) : 0);
                                                        var83.field2434.method3131(Statics.field556 + var81);
                                                        var83.field2434.method2947(Statics.field895 + var82);
                                                        field889.method1706(var83);
                                                        class139.method2589();
                                                        field1004 = class60.field665;
                                                        field937 = class60.field681;
                                                        field939 = 1;
                                                        field1093 = 0;
                                                        field1061 = var81;
                                                        field1062 = var82;
                                                    }
                                                    if (Statics.field392 != var59) {
                                                        if (var59 != null) {
                                                            method308(var59);
                                                        }
                                                        if (Statics.field392 != null) {
                                                            method308(Statics.field392);
                                                        }
                                                    }
                                                    if (Statics.field1300 != var60 && field981 == field980) {
                                                        if (var60 != null) {
                                                            method308(var60);
                                                        }
                                                        if (Statics.field1300 != null) {
                                                            method308(Statics.field1300);
                                                        }
                                                    }
                                                    if (Statics.field1300 == null) {
                                                        if (field980 > 0) {
                                                            field980--;
                                                        }
                                                    } else if (field980 < field981) {
                                                        field980++;
                                                        if (field981 == field980) {
                                                            method308(Statics.field1300);
                                                        }
                                                    }
                                                    method932();
                                                    if (field931) {
                                                        method4644();
                                                    }
                                                    for (int var84 = 0; var84 < 5; var84++) {
                                                        var10002 = field1080[var84]++;
                                                    }
                                                    Statics.field1460.method1627();
                                                    int var85 = class60.method136();
                                                    int var86 = class51.field606;
                                                    if (var85 > 15000 && var86 > 15000) {
                                                        field882 = 250;
                                                        class60.field685 = 14500;
                                                        class175 var88 = class175.method3893(class172.field2358, field889.field1450);
                                                        field889.method1706(var88);
                                                    }
                                                    for (class67 var89 = (class67) field1097.method3482(); var89 != null; var89 = (class67) field1097.method3485()) {
                                                        if ((long) var89.field759 < class187.method1411() / 1000L - 5L) {
                                                            if (var89.field754 > 0) {
                                                                class97.method172(5, "", var89.field753 + class237.field3196);
                                                            }
                                                            if (var89.field754 == 0) {
                                                                class97.method172(5, "", var89.field753 + class237.field3107);
                                                            }
                                                            var89.method3492();
                                                        }
                                                    }
                                                    field889.field1456++;
                                                    if (field889.field1456 > 50) {
                                                        class175 var90 = class175.method3893(class172.field2329, field889.field1450);
                                                        field889.method1706(var90);
                                                    }
                                                    try {
                                                        field889.method1705();
                                                    } catch (IOException var92) {
                                                        method74();
                                                    }
                                                    return;
                                                }
                                                var70 = var69.field771;
                                                if (var70.field2761 < 0) {
                                                    break;
                                                }
                                                var71 = class228.method2391(var70.field2779);
                                            } while (var71 == null || var71.field2833 == null || var70.field2761 >= var71.field2833.length || var71.field2833[var70.field2761] != var70);
                                            class83.method2139(var69);
                                        }
                                    }
                                    var67 = var66.field771;
                                    if (var67.field2761 < 0) {
                                        break;
                                    }
                                    var68 = class228.method2391(var67.field2779);
                                } while (var68 == null || var68.field2833 == null || var67.field2761 >= var68.field2833.length || var68.field2833[var67.field2761] != var67);
                                class83.method2139(var66);
                            }
                        }
                        var64 = var63.field771;
                        if (var64.field2761 < 0) {
                            break;
                        }
                        var65 = class228.method2391(var64.field2779);
                    } while (var65 == null || var65.field2833 == null || var64.field2761 >= var65.field2833.length || var65.field2833[var64.field2761] != var64);
                    class83.method2139(var63);
                }
            }
            class175 var4 = class175.method3893(class172.field2365, field889.field1450);
            var4.field2434.method2946(0);
            int var5 = var4.field2434.field2509;
            class294.method3737(var4.field2434);
            var4.field2434.method2959(var4.field2434.field2509 - var5);
            field889.method1706(var4);
        }
    }

    @ObfuscatedName("ci.fs(I)V")
    public static final void method1508() {
        if (Statics.field1901 != null) {
            Statics.field1901.method1844();
        }
        if (Statics.field471 != null) {
            Statics.field471.method1844();
        }
    }

    @ObfuscatedName("w.fn(Ljj;IIII)V")
    public static void method2(class272 arg0, int arg1, int arg2, int arg3) {
        if (field1069 >= 50 || field1068 == 0 || arg0.field3677 == null || arg1 >= arg0.field3677.length) {
            return;
        }
        int var4 = arg0.field3677[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1070[field1069] = var5;
        field1071[field1069] = var6;
        field1072[field1069] = 0;
        field1103[field1069] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1073[field1069] = (var8 << 16) + (var9 << 8) + var7;
        field1069++;
    }

    @ObfuscatedName("ac.fe(IIII)V")
    public static void method462(int arg0, int arg1, int arg2) {
        if (field1067 == 0 || arg1 == 0 || field1069 >= 50) {
            return;
        }
        field1070[field1069] = arg0;
        field1071[field1069] = arg1;
        field1072[field1069] = arg2;
        field1103[field1069] = null;
        field1073[field1069] = 0;
        field1069++;
    }

    @ObfuscatedName("fp.fx(I)V")
    public static final void method2837() {
        if (Statics.field235 == field1056) {
            return;
        }
        field1056 = Statics.field235;
        int var0 = Statics.field235;
        int[] var1 = Statics.field251.field3863;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class62.field711[var0][var6][var4] & 0x18) == 0) {
                    Statics.field581.method2532(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class62.field711[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field581.method2532(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field251.method4803();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class62.field711[var0][var10][var9] & 0x18) == 0) {
                    Statics.method3890(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class62.field711[var0 + 1][var10][var9] & 0x8) != 0) {
                    Statics.method3890(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1057 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field581.method2629(Statics.field235, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class267.method2129(var14).field3538;
                    if (var15 >= 0) {
                        field1060[field1057] = Statics.field3379[var15].method4077(false);
                        field915[field1057] = var11;
                        field1059[field1057] = var12;
                        field1057++;
                    }
                }
            }
        }
        Statics.field720.method4776();
    }

    @ObfuscatedName("cz.fm(Lhz;IIB)V")
    public static final void method1534(class228 arg0, int arg1, int arg2) {
        if (field1063 != 0 && field1063 != 3 || class60.field679 != 1 && Statics.field456 || class60.field679 != 4) {
            return;
        }
        class222 var3 = arg0.method3809(true);
        if (var3 == null) {
            return;
        }
        int var4 = class60.field665 - arg1;
        int var5 = class60.field681 - arg2;
        if (!var3.method3734(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2716 / 2;
        int var7 = var5 - var3.field2717 / 2;
        int var8 = field913 & 0x7FF;
        int var9 = class136.field1927[var8];
        int var10 = class136.field1926[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field2088.field1182 + var11 >> 7;
        int var14 = Statics.field2088.field1143 - var12 >> 7;
        class175 var15 = class175.method3893(class172.field2366, field889.field1450);
        var15.field2434.method2946(18);
        var15.field2434.method2988(class51.field594[82] ? (class51.field594[81] ? 2 : 1) : 0);
        var15.field2434.method3131(Statics.field556 + var13);
        var15.field2434.method2947(Statics.field895 + var14);
        var15.field2434.method2946(var6);
        var15.field2434.method2946(var7);
        var15.field2434.method2944(field913);
        var15.field2434.method2946(57);
        var15.field2434.method2946(0);
        var15.field2434.method2946(0);
        var15.field2434.method2946(89);
        var15.field2434.method2944(Statics.field2088.field1182);
        var15.field2434.method2944(Statics.field2088.field1143);
        var15.field2434.method2946(63);
        field889.method1706(var15);
        field1061 = var13;
        field1062 = var14;
    }

    @ObfuscatedName("ed.fj(Ljava/lang/String;I)V")
    public static final void method2472(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field15.field1211 = !Statics.field15.field1211;
            class81.method52();
            if (Statics.field15.field1211) {
                class97.method172(99, "", "Roofs are now all hidden");
            } else {
                class97.method172(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field1055 = !field1055;
        }
        if (field996 >= 2) {
            if (arg0.equalsIgnoreCase("aabb")) {
                if (!class8.field224) {
                    class8.field224 = true;
                    class8.field226 = class12.field257;
                } else if (class8.field226 == class12.field257) {
                    class8.field224 = true;
                    class8.field226 = class12.field259;
                } else {
                    class8.field224 = false;
                }
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field1055 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field1055 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method74();
            }
            if (arg0.equalsIgnoreCase("cs")) {
                class97.method172(99, "", "" + field892);
            }
            if (arg0.equalsIgnoreCase("errortest") && field849 == 2) {
                throw new RuntimeException();
            }
        }
        class175 var1 = class175.method3893(class172.field2342, field889.field1450);
        var1.field2434.method2946(arg0.length() + 1);
        var1.field2434.method3106(arg0);
        field889.method1706(var1);
    }

    @ObfuscatedName("jp.fi(B)V")
    public static final void method4644() {
        int var0 = Statics.field22 * 128 + 64;
        int var1 = Statics.field254 * 128 + 64;
        int var2 = method479(var0, var1, Statics.field235) - Statics.field1381;
        if (Statics.field668 < var0) {
            Statics.field668 += Statics.field578 * (var0 - Statics.field668) / 1000 + Statics.field260;
            if (Statics.field668 > var0) {
                Statics.field668 = var0;
            }
        }
        if (Statics.field668 > var0) {
            Statics.field668 -= Statics.field578 * (Statics.field668 - var0) / 1000 + Statics.field260;
            if (Statics.field668 < var0) {
                Statics.field668 = var0;
            }
        }
        if (Statics.field283 < var2) {
            Statics.field283 += Statics.field578 * (var2 - Statics.field283) / 1000 + Statics.field260;
            if (Statics.field283 > var2) {
                Statics.field283 = var2;
            }
        }
        if (Statics.field283 > var2) {
            Statics.field283 -= Statics.field578 * (Statics.field283 - var2) / 1000 + Statics.field260;
            if (Statics.field283 < var2) {
                Statics.field283 = var2;
            }
        }
        if (Statics.field2452 < var1) {
            Statics.field2452 += Statics.field578 * (var1 - Statics.field2452) / 1000 + Statics.field260;
            if (Statics.field2452 > var1) {
                Statics.field2452 = var1;
            }
        }
        if (Statics.field2452 > var1) {
            Statics.field2452 -= Statics.field578 * (Statics.field2452 - var1) / 1000 + Statics.field260;
            if (Statics.field2452 < var1) {
                Statics.field2452 = var1;
            }
        }
        int var3 = Statics.field10 * 128 + 64;
        int var4 = Statics.field2517 * 128 + 64;
        int var5 = method479(var3, var4, Statics.field235) - Statics.field274;
        int var6 = var3 - Statics.field668;
        int var7 = var5 - Statics.field283;
        int var8 = var4 - Statics.field2452;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2154 < var10) {
            Statics.field2154 += Statics.field3699 * (var10 - Statics.field2154) / 1000 + Statics.field2430;
            if (Statics.field2154 > var10) {
                Statics.field2154 = var10;
            }
        }
        if (Statics.field2154 > var10) {
            Statics.field2154 -= Statics.field3699 * (Statics.field2154 - var10) / 1000 + Statics.field2430;
            if (Statics.field2154 < var10) {
                Statics.field2154 = var10;
            }
        }
        int var12 = var11 - Statics.field3268;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field3268 += Statics.field3699 * var12 / 1000 + Statics.field2430;
            Statics.field3268 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field3268 -= Statics.field3699 * -var12 / 1000 + Statics.field2430;
            Statics.field3268 &= 0x7FF;
        }
        int var13 = var11 - Statics.field3268;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field3268 = var11;
        }
    }

    @ObfuscatedName("bz.fl(I)V")
    public static final void method932() {
        int var0 = Statics.field2088.field1182;
        int var1 = Statics.field2088.field1143;
        if (Statics.field805 - var0 < -500 || Statics.field805 - var0 > 500 || Statics.field1933 - var1 < -500 || Statics.field1933 - var1 > 500) {
            Statics.field805 = var0;
            Statics.field1933 = var1;
        }
        if (Statics.field805 != var0) {
            Statics.field805 += (var0 - Statics.field805) / 16;
        }
        if (Statics.field1933 != var1) {
            Statics.field1933 += (var1 - Statics.field1933) / 16;
        }
        if (class60.field672 == 4 && Statics.field456) {
            int var2 = class60.field683 * -469125321 - field917 * -469125321;
            field902 = var2 * 2;
            field917 = (var2 == -1 || var2 == 1 ? class60.field683 * -469125321 : (field917 * -469125321 + class60.field683 * -469125321) / 2) * -1460687225;
            int var3 = field916 - class60.field680;
            field988 = var3 * 2;
            field916 = var3 == -1 || var3 == 1 ? class60.field680 : (field916 + class60.field680) / 2;
        } else {
            if (class51.field594[96]) {
                field988 += (-24 - field988) / 2;
            } else if (class51.field594[97]) {
                field988 += (24 - field988) / 2;
            } else {
                field988 /= 2;
            }
            if (class51.field594[98]) {
                field902 += (12 - field902) / 2;
            } else if (class51.field594[99]) {
                field902 += (-12 - field902) / 2;
            } else {
                field902 /= 2;
            }
            field917 = class60.field683;
            field916 = class60.field680;
        }
        field913 = field988 / 2 + field913 & 0x7FF;
        field999 += field902 / 2;
        if (field999 < 128) {
            field999 = 128;
        }
        if (field999 > 383) {
            field999 = 383;
        }
        int var4 = Statics.field805 >> 7;
        int var5 = Statics.field1933 >> 7;
        int var6 = method479(Statics.field805, Statics.field1933, Statics.field235);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field235;
                    if (var10 < 3 && (class62.field711[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class62.field696[var10][var8][var9];
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
        if (var12 > field921) {
            field921 += (var12 - field921) / 24;
        } else if (var12 < field921) {
            field921 += (var12 - field921) / 80;
        }
    }

    @ObfuscatedName("gh.fv(I)V")
    public static final void method3098() {
        int var0 = class95.field1400;
        int[] var1 = class95.field1394;
        for (int var2 = 0; var2 < var0; var2++) {
            class74 var3 = field949[var1[var2]];
            if (var3 != null) {
                method2661(var3, 1);
            }
        }
    }

    @ObfuscatedName("eb.fr(Lbr;II)V")
    public static final void method2661(class78 arg0, int arg1) {
        if (arg0.field1139 > field963) {
            int var2 = arg0.field1139 - field963;
            int var3 = arg0.field1165 * 128 + arg0.field1127 * 64;
            int var4 = arg0.field1167 * 128 + arg0.field1127 * 64;
            arg0.field1182 += (var3 - arg0.field1182) / var2;
            arg0.field1143 += (var4 - arg0.field1143) / var2;
            arg0.field1181 = 0;
            arg0.field1174 = arg0.field1134;
        } else if (arg0.field1170 >= field963) {
            if (field963 == arg0.field1170 || arg0.field1155 == -1 || arg0.field1146 != 0 || arg0.field1157 + 1 > class272.method3881(arg0.field1155).field3676[arg0.field1169]) {
                int var5 = arg0.field1170 - arg0.field1139;
                int var6 = field963 - arg0.field1139;
                int var7 = arg0.field1165 * 128 + arg0.field1127 * 64;
                int var8 = arg0.field1167 * 128 + arg0.field1127 * 64;
                int var9 = arg0.field1166 * 128 + arg0.field1127 * 64;
                int var10 = arg0.field1127 * 64 + arg0.field1126 * 128;
                arg0.field1182 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field1143 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field1181 = 0;
            arg0.field1174 = arg0.field1134;
            arg0.field1173 = arg0.field1174;
        } else {
            arg0.field1152 = arg0.field1128;
            if (arg0.field1136 == 0) {
                arg0.field1181 = 0;
            } else {
                label334: {
                    if (arg0.field1155 != -1 && arg0.field1146 == 0) {
                        class272 var11 = class272.method3881(arg0.field1155);
                        if (arg0.field1156 > 0 && var11.field3685 == 0) {
                            arg0.field1181++;
                            break label334;
                        }
                        if (arg0.field1156 <= 0 && var11.field3686 == 0) {
                            arg0.field1181++;
                            break label334;
                        }
                    }
                    int var12 = arg0.field1182;
                    int var13 = arg0.field1143;
                    int var14 = arg0.field1178[arg0.field1136 - 1] * 128 + arg0.field1127 * 64;
                    int var15 = arg0.field1179[arg0.field1136 - 1] * 128 + arg0.field1127 * 64;
                    if (var12 < var14) {
                        if (var13 < var15) {
                            arg0.field1174 = 1280;
                        } else if (var13 > var15) {
                            arg0.field1174 = 1792;
                        } else {
                            arg0.field1174 = 1536;
                        }
                    } else if (var12 > var14) {
                        if (var13 < var15) {
                            arg0.field1174 = 768;
                        } else if (var13 > var15) {
                            arg0.field1174 = 256;
                        } else {
                            arg0.field1174 = 512;
                        }
                    } else if (var13 < var15) {
                        arg0.field1174 = 1024;
                    } else if (var13 > var15) {
                        arg0.field1174 = 0;
                    }
                    byte var16 = arg0.field1168[arg0.field1136 - 1];
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        int var17 = arg0.field1174 - arg0.field1173 & 0x7FF;
                        if (var17 > 1024) {
                            var17 -= 2048;
                        }
                        int var18 = arg0.field1132;
                        if (var17 >= -256 && var17 <= 256) {
                            var18 = arg0.field1140;
                        } else if (var17 >= 256 && var17 < 768) {
                            var18 = arg0.field1124;
                        } else if (var17 >= -768 && var17 <= -256) {
                            var18 = arg0.field1133;
                        }
                        if (var18 == -1) {
                            var18 = arg0.field1140;
                        }
                        arg0.field1152 = var18;
                        int var19 = 4;
                        boolean var20 = true;
                        if (arg0 instanceof class86) {
                            var20 = ((class86) arg0).field1273.field3654;
                        }
                        if (var20) {
                            if (arg0.field1174 != arg0.field1173 && arg0.field1149 == -1 && arg0.field1176 != 0) {
                                var19 = 2;
                            }
                            if (arg0.field1136 > 2) {
                                var19 = 6;
                            }
                            if (arg0.field1136 > 3) {
                                var19 = 8;
                            }
                            if (arg0.field1181 > 0 && arg0.field1136 > 1) {
                                var19 = 8;
                                arg0.field1181--;
                            }
                        } else {
                            if (arg0.field1136 > 1) {
                                var19 = 6;
                            }
                            if (arg0.field1136 > 2) {
                                var19 = 8;
                            }
                            if (arg0.field1181 > 0 && arg0.field1136 > 1) {
                                var19 = 8;
                                arg0.field1181--;
                            }
                        }
                        if (var16 == 2) {
                            var19 <<= 0x1;
                        }
                        if (var19 >= 8 && arg0.field1152 == arg0.field1140 && arg0.field1131 != -1) {
                            arg0.field1152 = arg0.field1131;
                        }
                        if (var12 != var14 || var13 != var15) {
                            if (var12 < var14) {
                                arg0.field1182 += var19;
                                if (arg0.field1182 > var14) {
                                    arg0.field1182 = var14;
                                }
                            } else if (var12 > var14) {
                                arg0.field1182 -= var19;
                                if (arg0.field1182 < var14) {
                                    arg0.field1182 = var14;
                                }
                            }
                            if (var13 < var15) {
                                arg0.field1143 += var19;
                                if (arg0.field1143 > var15) {
                                    arg0.field1143 = var15;
                                }
                            } else if (var13 > var15) {
                                arg0.field1143 -= var19;
                                if (arg0.field1143 < var15) {
                                    arg0.field1143 = var15;
                                }
                            }
                        }
                        if (arg0.field1182 == var14 && arg0.field1143 == var15) {
                            arg0.field1136--;
                            if (arg0.field1156 > 0) {
                                arg0.field1156--;
                            }
                        }
                    } else {
                        arg0.field1182 = var14;
                        arg0.field1143 = var15;
                        arg0.field1136--;
                        if (arg0.field1156 > 0) {
                            arg0.field1156--;
                        }
                    }
                }
            }
        }
        if (arg0.field1182 < 128 || arg0.field1143 < 128 || arg0.field1182 >= 13184 || arg0.field1143 >= 13184) {
            arg0.field1155 = -1;
            arg0.field1160 = -1;
            arg0.field1139 = 0;
            arg0.field1170 = 0;
            arg0.field1182 = arg0.field1178[0] * 128 + arg0.field1127 * 64;
            arg0.field1143 = arg0.field1179[0] * 128 + arg0.field1127 * 64;
            arg0.method1342();
        }
        if (Statics.field2088 == arg0 && (arg0.field1182 < 1536 || arg0.field1143 < 1536 || arg0.field1182 >= 11776 || arg0.field1143 >= 11776)) {
            arg0.field1155 = -1;
            arg0.field1160 = -1;
            arg0.field1139 = 0;
            arg0.field1170 = 0;
            arg0.field1182 = arg0.field1178[0] * 128 + arg0.field1127 * 64;
            arg0.field1143 = arg0.field1179[0] * 128 + arg0.field1127 * 64;
            arg0.method1342();
        }
        method100(arg0);
        arg0.field1171 = false;
        if (arg0.field1152 != -1) {
            class272 var21 = class272.method3881(arg0.field1152);
            if (var21 == null || var21.field3671 == null) {
                arg0.field1152 = -1;
            } else {
                arg0.field1154++;
                if (arg0.field1153 < var21.field3671.length && arg0.field1154 > var21.field3676[arg0.field1153]) {
                    arg0.field1154 = 1;
                    arg0.field1153++;
                    method2(var21, arg0.field1153, arg0.field1182, arg0.field1143);
                }
                if (arg0.field1153 >= var21.field3671.length) {
                    arg0.field1154 = 0;
                    arg0.field1153 = 0;
                    method2(var21, arg0.field1153, arg0.field1182, arg0.field1143);
                }
            }
        }
        if (arg0.field1160 != -1 && field963 >= arg0.field1163) {
            if (arg0.field1161 < 0) {
                arg0.field1161 = 0;
            }
            int var22 = class257.method4035(arg0.field1160).field3414;
            if (var22 == -1) {
                arg0.field1160 = -1;
            } else {
                class272 var23 = class272.method3881(var22);
                if (var23 == null || var23.field3671 == null) {
                    arg0.field1160 = -1;
                } else {
                    arg0.field1144++;
                    if (arg0.field1161 < var23.field3671.length && arg0.field1144 > var23.field3676[arg0.field1161]) {
                        arg0.field1144 = 1;
                        arg0.field1161++;
                        method2(var23, arg0.field1161, arg0.field1182, arg0.field1143);
                    }
                    if (arg0.field1161 >= var23.field3671.length && (arg0.field1161 < 0 || arg0.field1161 >= var23.field3671.length)) {
                        arg0.field1160 = -1;
                    }
                }
            }
        }
        if (arg0.field1155 != -1 && arg0.field1146 <= 1) {
            class272 var24 = class272.method3881(arg0.field1155);
            if (var24.field3685 == 1 && arg0.field1156 > 0 && arg0.field1139 <= field963 && arg0.field1170 < field963) {
                arg0.field1146 = 1;
                return;
            }
        }
        if (arg0.field1155 != -1 && arg0.field1146 == 0) {
            class272 var25 = class272.method3881(arg0.field1155);
            if (var25 == null || var25.field3671 == null) {
                arg0.field1155 = -1;
            } else {
                arg0.field1157++;
                if (arg0.field1169 < var25.field3671.length && arg0.field1157 > var25.field3676[arg0.field1169]) {
                    arg0.field1157 = 1;
                    arg0.field1169++;
                    method2(var25, arg0.field1169, arg0.field1182, arg0.field1143);
                }
                if (arg0.field1169 >= var25.field3671.length) {
                    arg0.field1169 -= var25.field3683;
                    arg0.field1125++;
                    if (arg0.field1125 >= var25.field3684) {
                        arg0.field1155 = -1;
                    } else if (arg0.field1169 >= 0 && arg0.field1169 < var25.field3671.length) {
                        method2(var25, arg0.field1169, arg0.field1182, arg0.field1143);
                    } else {
                        arg0.field1155 = -1;
                    }
                }
                arg0.field1171 = var25.field3680;
            }
        }
        if (arg0.field1146 > 0) {
            arg0.field1146--;
        }
    }

    @ObfuscatedName("r.fp(Lbr;I)V")
    public static final void method100(class78 arg0) {
        if (arg0.field1176 == 0) {
            return;
        }
        if (arg0.field1149 != -1) {
            class78 var1 = null;
            if (arg0.field1149 < 32768) {
                var1 = field884[arg0.field1149];
            } else if (arg0.field1149 >= 32768) {
                var1 = field949[arg0.field1149 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1182 - var1.field1182;
                int var3 = arg0.field1143 - var1.field1143;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1174 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1150) {
                arg0.field1149 = -1;
                arg0.field1150 = false;
            }
        }
        if (arg0.field1151 != -1 && (arg0.field1136 == 0 || arg0.field1181 > 0)) {
            arg0.field1174 = arg0.field1151;
            arg0.field1151 = -1;
        }
        int var4 = arg0.field1174 - arg0.field1173 & 0x7FF;
        if (var4 == 0 && arg0.field1150) {
            arg0.field1149 = -1;
            arg0.field1150 = false;
        }
        if (var4 == 0) {
            arg0.field1175 = 0;
            return;
        }
        arg0.field1175++;
        if (var4 > 1024) {
            arg0.field1173 -= arg0.field1176;
            boolean var5 = true;
            if (var4 < arg0.field1176 || var4 > 2048 - arg0.field1176) {
                arg0.field1173 = arg0.field1174;
                var5 = false;
            }
            if (arg0.field1152 == arg0.field1128 && (arg0.field1175 > 25 || var5)) {
                if (arg0.field1129 == -1) {
                    arg0.field1152 = arg0.field1140;
                } else {
                    arg0.field1152 = arg0.field1129;
                }
            }
        } else {
            arg0.field1173 += arg0.field1176;
            boolean var6 = true;
            if (var4 < arg0.field1176 || var4 > 2048 - arg0.field1176) {
                arg0.field1173 = arg0.field1174;
                var6 = false;
            }
            if (arg0.field1152 == arg0.field1128 && (arg0.field1175 > 25 || var6)) {
                if (arg0.field1177 == -1) {
                    arg0.field1152 = arg0.field1140;
                } else {
                    arg0.field1152 = arg0.field1177;
                }
            }
        }
        arg0.field1173 &= 0x7FF;
    }

    @ObfuscatedName("aw.ft(Lbj;III)V")
    public static void method473(class74 arg0, int arg1, int arg2) {
        if (arg0.field1155 == arg1 && arg1 != -1) {
            int var3 = class272.method3881(arg1).field3681;
            if (var3 == 1) {
                arg0.field1169 = 0;
                arg0.field1157 = 0;
                arg0.field1146 = arg2;
                arg0.field1125 = 0;
            }
            if (var3 == 2) {
                arg0.field1125 = 0;
            }
        } else if (arg1 == -1 || arg0.field1155 == -1 || class272.method3881(arg1).field3674 >= class272.method3881(arg0.field1155).field3674) {
            arg0.field1155 = arg1;
            arg0.field1169 = 0;
            arg0.field1157 = 0;
            arg0.field1146 = arg2;
            arg0.field1125 = 0;
            arg0.field1156 = arg0.field1136;
        }
    }

    @ObfuscatedName("an.fk(IB)V")
    public static void method458(int arg0) {
        field943 = 0L;
        if (arg0 >= 2) {
            field1043 = true;
        } else {
            field1043 = false;
        }
        int var1 = field1043 ? 2 : 1;
        if (var1 == 1) {
            Statics.field284.method710(765, 503);
        } else {
            Statics.field284.method710(7680, 2160);
        }
        if (field982 >= 25) {
            method959();
        }
    }

    @ObfuscatedName("bi.ff(I)V")
    public static void method959() {
        class175 var0 = class175.method3893(class172.field2395, field889.field1450);
        class191 var1 = var0.field2434;
        int var2 = field1043 ? 2 : 1;
        var1.method2946(var2);
        var0.field2434.method2944(Statics.field2446);
        var0.field2434.method2944(Statics.field1897);
        field889.method1706(var0);
    }

    @ObfuscatedName("client.y(I)V")
    public final void method716() {
        field943 = class187.method1411() + 500L;
        this.method1202();
        if (field873 != -1) {
            this.method1259(true);
        }
    }

    @ObfuscatedName("client.fq(I)V")
    public void method1202() {
        int var1 = Statics.field2446;
        int var2 = Statics.field1897;
        if (this.field649 < var1) {
            int var3 = this.field649;
        }
        if (this.field643 < var2) {
            int var4 = this.field643;
        }
        if (Statics.field15 == null) {
            return;
        }
        try {
            client var5 = Statics.field284;
            int var6 = field1043 ? 2 : 1;
            Object[] var7 = new Object[] { var6 };
            JSObject.getWindow(var5).call("resize", var7);
        } catch (Throwable var9) {
        }
    }

    @ObfuscatedName("client.fo(B)V")
    public final void method1029() {
        if (field873 != -1) {
            int var1 = field873;
            if (class228.method1487(var1)) {
                method1880(Statics.field2858[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field1032; var2++) {
            if (field1034[var2]) {
                field1020[var2] = true;
            }
            field971[var2] = field1034[var2];
            field1034[var2] = false;
        }
        field1033 = field963;
        field965 = -1;
        field883 = -1;
        Statics.field567 = null;
        if (field873 != -1) {
            field1032 = 0;
            method919(field873, 0, 0, Statics.field2446, Statics.field1897, 0, 0, -1);
        }
        class295.method4698();
        if (field972) {
            int var9 = Statics.field409;
            int var10 = Statics.field2410;
            int var11 = Statics.field1385;
            int var12 = Statics.field342;
            int var13 = 6116423;
            class295.method4707(var9, var10, var11, var12, var13);
            class295.method4707(var9 + 1, var10 + 1, var11 - 2, 16, 0);
            class295.method4706(var9 + 1, var10 + 18, var11 - 2, var12 - 19, 0);
            Statics.field745.method4514(class237.field3112, var9 + 3, var10 + 14, var13, -1);
            int var14 = class60.field680;
            int var15 = class60.field683 * -469125321;
            for (int var16 = 0; var16 < field938; var16++) {
                int var17 = (field938 - 1 - var16) * 15 + var10 + 31;
                int var18 = 16777215;
                if (var14 > var9 && var14 < var9 + var11 && var15 > var17 - 13 && var15 < var17 + 3) {
                    var18 = 16776960;
                }
                Statics.field745.method4514(method19(var16), var9 + 3, var17, var18, 0);
            }
            method1907(Statics.field409, Statics.field2410, Statics.field1385, Statics.field342);
        } else if (field965 != -1) {
            int var3 = field965;
            int var4 = field883;
            if (field938 >= 2 || field864 != 0 || field1041) {
                int var5 = field938 - 1;
                String var7;
                if (field864 == 1 && field938 < 2) {
                    var7 = class237.field3120 + class237.field3119 + field983 + " " + class88.field1288;
                } else if (field1041 && field938 < 2) {
                    var7 = field987 + class237.field3119 + field911 + " " + class88.field1288;
                } else {
                    String var8;
                    if (var5 < 0) {
                        var8 = "";
                    } else if (field974[var5].length() > 0) {
                        var8 = field973[var5] + class237.field3119 + field974[var5];
                    } else {
                        var8 = field973[var5];
                    }
                    var7 = var8;
                }
                if (field938 > 2) {
                    var7 = var7 + class88.method3175(16777215) + " " + '/' + " " + (field938 - 2) + class237.field3190;
                }
                Statics.field745.method4522(var7, var3 + 4, var4 + 15, 16777215, 0, field963 / 1000);
            }
        }
        if (field929 == 3) {
            for (int var19 = 0; var19 < field1032; var19++) {
                if (field971[var19]) {
                    class295.method4753(field1037[var19], field942[var19], field1039[var19], field978[var19], 16711935, 128);
                } else if (field1020[var19]) {
                    class295.method4753(field1037[var19], field942[var19], field1039[var19], field978[var19], 16711680, 128);
                }
            }
        }
        int var20 = Statics.field235;
        int var21 = Statics.field2088.field1182;
        int var22 = Statics.field2088.field1143;
        int var23 = field848;
        for (class82 var24 = (class82) class82.field1236.method3442(); var24 != null; var24 = (class82) class82.field1236.method3444()) {
            if (var24.field1229 != -1 || var24.field1227 != null) {
                int var25 = 0;
                if (var21 > var24.field1233) {
                    var25 += var21 - var24.field1233;
                } else if (var21 < var24.field1224) {
                    var25 += var24.field1224 - var21;
                }
                if (var22 > var24.field1237) {
                    var25 += var22 - var24.field1237;
                } else if (var22 < var24.field1225) {
                    var25 += var24.field1225 - var22;
                }
                if (var25 - 64 > var24.field1222 || field1068 == 0 || var24.field1226 != var20) {
                    if (var24.field1230 != null) {
                        Statics.field2629.method1726(var24.field1230);
                        var24.field1230 = null;
                    }
                    if (var24.field1235 != null) {
                        Statics.field2629.method1726(var24.field1235);
                        var24.field1235 = null;
                    }
                } else {
                    var25 -= 64;
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    int var26 = field1068 * (var24.field1222 - var25) / var24.field1222;
                    class105 var10000;
                    if (var24.field1230 != null) {
                        var24.field1230.method1985(var26);
                    } else if (var24.field1229 >= 0) {
                        var10000 = (class105) null;
                        class105 var27 = class105.method1775(Statics.field1283, var24.field1229, 0);
                        if (var27 != null) {
                            class107 var28 = var27.method1784().method1821(Statics.field458);
                            class117 var29 = class117.method1974(var28, 100, var26);
                            var29.method1936(-1);
                            Statics.field2629.method1729(var29);
                            var24.field1230 = var29;
                        }
                    }
                    if (var24.field1235 != null) {
                        var24.field1235.method1985(var26);
                        if (!var24.field1235.method3433()) {
                            var24.field1235 = null;
                        }
                    } else if (var24.field1227 != null && (var24.field1234 -= var23) <= 0) {
                        int var30 = (int) (Math.random() * (double) var24.field1227.length);
                        var10000 = (class105) null;
                        class105 var31 = class105.method1775(Statics.field1283, var24.field1227[var30], 0);
                        if (var31 != null) {
                            class107 var32 = var31.method1784().method1821(Statics.field458);
                            class117 var33 = class117.method1974(var32, 100, var26);
                            var33.method1936(0);
                            Statics.field2629.method1729(var33);
                            var24.field1235 = var33;
                            var24.field1234 = var24.field1231 + (int) (Math.random() * (double) (var24.field1232 - var24.field1231));
                        }
                    }
                }
            }
        }
        field848 = 0;
    }

    @ObfuscatedName("ge.fh(Ljava/lang/String;ZB)V")
    public static final void method3200(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field28.method4511(arg0, 250);
        int var6 = Statics.field28.method4512(arg0, 250) * 13;
        class295.method4707(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class295.method4706(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field28.method4518(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method269(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field720.method693(0, 0);
        } else {
            method1907(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("x.fa(IIIIZI)V")
    public static final void method39(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1082 - field1081) * var5 / 100 + field1081;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1087) {
            short var8 = field1087;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field868) {
                var6 = field868;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class295.method4698();
                    class295.method4707(arg0, arg1, var10, arg3, -16777216);
                    class295.method4707(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field1007) {
            short var11 = field1007;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field1085) {
                var6 = field1085;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class295.method4698();
                    class295.method4707(arg0, arg1, arg2, var13, -16777216);
                    class295.method4707(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1084 - field879) * var5 / 100 + field879;
        field1038 = arg3 * var6 * var14 / 85504 << 1;
        if (field877 != arg2 || field1092 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class136.field1927[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class139.method2514(var15, 500, 800, arg2, arg3);
        }
        field1089 = arg0;
        field1000 = arg1;
        field877 = arg2;
        field1092 = arg3;
    }

    @ObfuscatedName("o.fg(I)V")
    public static void method81() {
        int var0 = class95.field1400;
        int[] var1 = class95.field1394;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field958 != var1[var2] && field950 != var1[var2]) {
                method1340(field949[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("bo.fz(Lbj;ZI)V")
    public static void method1340(class74 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method985() || arg0.field830) {
            return;
        }
        int var2 = arg0.field811 << 14;
        arg0.field828 = false;
        if ((field1002 && class95.field1400 > 50 || class95.field1400 > 200) && arg1 && arg0.field1152 == arg0.field1128) {
            arg0.field828 = true;
        }
        int var3 = arg0.field1182 >> 7;
        int var4 = arg0.field1143 >> 7;
        if (var3 < 0 || var3 >= 104 || var4 < 0 || var4 >= 104) {
            return;
        }
        if (arg0.field823 != null && field963 >= arg0.field818 && field963 < arg0.field819) {
            arg0.field828 = false;
            arg0.field817 = method479(arg0.field1182, arg0.field1143, Statics.field235);
            Statics.field581.method2651(Statics.field235, arg0.field1182, arg0.field1143, arg0.field817, 60, arg0, arg0.field1173, var2, arg0.field824, arg0.field825, arg0.field826, arg0.field829);
            return;
        }
        if ((arg0.field1182 & 0x7F) == 64 && (arg0.field1143 & 0x7F) == 64) {
            if (field933 == field932[var3][var4]) {
                return;
            }
            field932[var3][var4] = field933;
        }
        arg0.field817 = method479(arg0.field1182, arg0.field1143, Statics.field235);
        Statics.field581.method2490(Statics.field235, arg0.field1182, arg0.field1143, arg0.field817, 60, arg0, arg0.field1173, var2, arg0.field1171);
    }

    @ObfuscatedName("bs.fb(ZB)V")
    public static final void method923(boolean arg0) {
        for (int var1 = 0; var1 < field885; var1++) {
            class86 var2 = field884[field886[var1]];
            int var3 = (field886[var1] << 14) + 536870912;
            if (var2 != null && var2.method985() && var2.field1273.field3638 == arg0 && var2.field1273.method4422()) {
                int var4 = var2.field1182 >> 7;
                int var5 = var2.field1143 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1127 == 1 && (var2.field1182 & 0x7F) == 64 && (var2.field1143 & 0x7F) == 64) {
                        if (field933 == field932[var4][var5]) {
                            continue;
                        }
                        field932[var4][var5] = field933;
                    }
                    if (!var2.field1273.field3644) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field581.method2490(Statics.field235, var2.field1182, var2.field1143, method479(var2.field1182 + (var2.field1127 * 64 - 64), var2.field1143 + (var2.field1127 * 64 - 64), Statics.field235), var2.field1127 * 64 - 64 + 60, var2, var2.field1173, var3, var2.field1171);
                }
            }
        }
    }

    @ObfuscatedName("an.fd(I)V")
    public static final void method459() {
        for (class93 var0 = (class93) field961.method3442(); var0 != null; var0 = (class93) field961.method3444()) {
            if (Statics.field235 != var0.field1373 || field963 > var0.field1362) {
                var0.method3427();
            } else if (field963 >= var0.field1361) {
                if (var0.field1365 > 0) {
                    class86 var1 = field884[var0.field1365 - 1];
                    if (var1 != null && var1.field1182 >= 0 && var1.field1182 < 13312 && var1.field1143 >= 0 && var1.field1143 < 13312) {
                        var0.method1585(var1.field1182, var1.field1143, method479(var1.field1182, var1.field1143, var0.field1373) - var0.field1360, field963);
                    }
                }
                if (var0.field1365 < 0) {
                    int var2 = -var0.field1365 - 1;
                    class74 var3;
                    if (field950 == var2) {
                        var3 = Statics.field2088;
                    } else {
                        var3 = field949[var2];
                    }
                    if (var3 != null && var3.field1182 >= 0 && var3.field1182 < 13312 && var3.field1143 >= 0 && var3.field1143 < 13312) {
                        var0.method1585(var3.field1182, var3.field1143, method479(var3.field1182, var3.field1143, var0.field1373) - var0.field1360, field963);
                    }
                }
                var0.method1584(field848);
                Statics.field581.method2490(Statics.field235, (int) var0.field1367, (int) var0.field1368, (int) var0.field1369, 60, var0, var0.field1358, -1, false);
            }
        }
    }

    @ObfuscatedName("i.fw(I)V")
    public static final void method114() {
        for (class84 var0 = (class84) field887.method3442(); var0 != null; var0 = (class84) field887.method3444()) {
            if (Statics.field235 != var0.field1254 || var0.field1264) {
                var0.method3427();
            } else if (field963 >= var0.field1253) {
                var0.method1484(field848);
                if (var0.field1264) {
                    var0.method3427();
                } else {
                    Statics.field581.method2490(var0.field1254, var0.field1255, var0.field1261, var0.field1258, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("b.fu(III)V")
    public static final void method143(int arg0, int arg1) {
        if (field863 == 2) {
            method4646((field866 - Statics.field556 << 7) + field869, (field867 - Statics.field895 << 7) + field870, field1075 * 2);
            if (field934 > -1 && field963 % 20 < 10) {
                Statics.field3928[0].method4812(field934 + arg0 - 12, field861 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("h.fc(Lbr;IIIIII)V")
    public static final void method157(class78 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method985()) {
            return;
        }
        if (arg0 instanceof class86) {
            class270 var6 = ((class86) arg0).field1273;
            if (var6.field3650 != null) {
                var6 = var6.method4414();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class95.field1400;
        int[] var8 = class95.field1394;
        int var9 = 3;
        if (!arg0.field1148.method3425()) {
            method957(arg0, arg0.field1137 + 15);
            for (class85 var10 = (class85) arg0.field1148.method3399(); var10 != null; var10 = (class85) arg0.field1148.method3418()) {
                class79 var11 = var10.method1490(field963);
                if (var11 != null) {
                    class260 var12 = var10.field1265;
                    class299 var13 = var12.method4176();
                    class299 var14 = var12.method4163();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3455;
                    } else {
                        if (var12.field3446 * 2 < var14.field3853) {
                            var15 = var12.field3446;
                        }
                        var16 = var14.field3853 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field963 - var11.field1185;
                    int var20 = var11.field1186 * var16 / var12.field3455;
                    int var23;
                    if (var11.field1184 > var19) {
                        int var21 = var12.field3451 == 0 ? 0 : var19 / var12.field3451 * var12.field3451;
                        int var22 = var11.field1187 * var16 / var12.field3455;
                        var23 = (var20 - var22) * var21 / var11.field1184 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1184 + var12.field3452 - var19;
                        if (var12.field3450 >= 0) {
                            var17 = (var24 << 8) / (var12.field3452 - var12.field3450);
                        }
                    }
                    if (var11.field1186 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field934 + arg2 - (var16 >> 1);
                    int var26 = field861 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field934 > -1) {
                            class295.method4707(var25, var26, var23, 5, 65280);
                            class295.method4707(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3855;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method4818(var27, var26, var17);
                            class295.method4700(var27, var26, var27 + var28, var26 + var29);
                            var14.method4818(var27, var26, var17);
                        } else {
                            var13.method4812(var27, var26);
                            class295.method4700(var27, var26, var27 + var28, var26 + var29);
                            var14.method4812(var27, var26);
                        }
                        class295.method4699(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1491()) {
                    var10.method3427();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class74 var30 = (class74) arg0;
            if (var30.field830) {
                return;
            }
            if (var30.field812 != -1 || var30.field813 != -1) {
                method957(arg0, arg0.field1137 + 15);
                if (field934 > -1) {
                    if (var30.field812 != -1) {
                        Statics.field304[var30.field812].method4812(field934 + arg2 - 12, field861 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field813 != -1) {
                        Statics.field302[var30.field813].method4812(field934 + arg2 - 12, field861 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field863 == 10 && field865 == var8[arg1]) {
                method957(arg0, arg0.field1137 + 15);
                if (field934 > -1) {
                    Statics.field3928[1].method4812(field934 + arg2 - 12, field861 + arg3 - var9);
                }
            }
        } else {
            class270 var31 = ((class86) arg0).field1273;
            if (var31.field3650 != null) {
                var31 = var31.method4414();
            }
            if (var31.field3648 >= 0 && var31.field3648 < Statics.field302.length) {
                method957(arg0, arg0.field1137 + 15);
                if (field934 > -1) {
                    Statics.field302[var31.field3648].method4812(field934 + arg2 - 12, field861 + arg3 - 30);
                }
            }
            if (field863 == 1 && field1098 == field886[arg1 - var7] && field963 % 20 < 10) {
                method957(arg0, arg0.field1137 + 15);
                if (field934 > -1) {
                    Statics.field3928[0].method4812(field934 + arg2 - 12, field861 + arg3 - 28);
                }
            }
        }
        if (arg0.field1135 != null && (arg1 >= var7 || !arg0.field1138 && (field1045 == 4 || !arg0.field1123 && (field1045 == 0 || field1045 == 3 || field1045 == 1 && method620(((class74) arg0).field832, false))))) {
            method957(arg0, arg0.field1137);
            if (field934 > -1 && field922 < field1101) {
                field927[field922] = Statics.field745.method4509(arg0.field1135) / 2;
                field926[field922] = Statics.field745.field3711;
                field924[field922] = field934;
                field925[field922] = field861;
                field928[field922] = arg0.field1180;
                field901[field922] = arg0.field1141;
                field930[field922] = arg0.field1158;
                field998[field922] = arg0.field1135;
                field922++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1145[var32];
            int var34 = arg0.field1159[var32];
            class266 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field963) {
                    continue;
                }
                var35 = class266.method4010(arg0.field1159[var32]);
                var36 = var35.field3501;
                if (var35 != null && var35.field3506 != null) {
                    var35 = var35.method4252();
                    if (var35 == null) {
                        arg0.field1145[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1162[var32];
            class266 var38 = null;
            if (var37 >= 0) {
                var38 = class266.method4010(var37);
                if (var38 != null && var38.field3506 != null) {
                    var38 = var38.method4252();
                }
            }
            if (var33 - var36 <= field963) {
                if (var35 == null) {
                    arg0.field1145[var32] = -1;
                } else {
                    method957(arg0, arg0.field1137 / 2);
                    if (field934 > -1) {
                        if (var32 == 1) {
                            field861 -= 20;
                        }
                        if (var32 == 2) {
                            field934 -= 15;
                            field861 -= 10;
                        }
                        if (var32 == 3) {
                            field934 += 15;
                            field861 -= 10;
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
                        class299 var51 = null;
                        class299 var52 = null;
                        class299 var53 = null;
                        class299 var54 = null;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        class299 var64 = var35.method4254();
                        if (var64 != null) {
                            var43 = var64.field3853;
                            int var65 = var64.field3855;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3856;
                        }
                        class299 var66 = var35.method4255();
                        if (var66 != null) {
                            var44 = var66.field3853;
                            int var67 = var66.field3855;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3856;
                        }
                        class299 var68 = var35.method4271();
                        if (var68 != null) {
                            var45 = var68.field3853;
                            int var69 = var68.field3855;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3856;
                        }
                        class299 var70 = var35.method4256();
                        if (var70 != null) {
                            var46 = var70.field3853;
                            int var71 = var70.field3855;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3856;
                        }
                        if (var38 != null) {
                            var51 = var38.method4254();
                            if (var51 != null) {
                                var55 = var51.field3853;
                                int var72 = var51.field3855;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3856;
                            }
                            var52 = var38.method4255();
                            if (var52 != null) {
                                var56 = var52.field3853;
                                int var73 = var52.field3855;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3856;
                            }
                            var53 = var38.method4271();
                            if (var53 != null) {
                                var57 = var53.field3853;
                                int var74 = var53.field3855;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3856;
                            }
                            var54 = var38.method4256();
                            if (var54 != null) {
                                var58 = var54.field3853;
                                int var75 = var54.field3855;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3856;
                            }
                        }
                        class275 var76 = var35.method4258();
                        if (var76 == null) {
                            var76 = Statics.field621;
                        }
                        class275 var77;
                        if (var38 == null) {
                            var77 = Statics.field621;
                        } else {
                            var77 = var38.method4258();
                            if (var77 == null) {
                                var77 = Statics.field621;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4253(arg0.field1130[var32]);
                        int var83 = var76.method4509(var82);
                        if (var38 != null) {
                            var79 = var38.method4253(arg0.field1147[var32]);
                            var81 = var77.method4509(var79);
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
                        int var100 = arg0.field1145[var32] - field963;
                        int var101 = var35.field3487 - var35.field3487 * var100 / var35.field3501;
                        int var102 = var35.field3497 * var100 / var35.field3501 + -var35.field3497;
                        int var103 = field934 + arg2 - (var92 >> 1) + var101;
                        int var104 = field861 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3495 + var104 + 15;
                        int var108 = var107 - var76.field3712;
                        int var109 = var76.field3713 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3495 + var104 + 15;
                            int var111 = var110 - var77.field3712;
                            int var112 = var77.field3713 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3502 >= 0) {
                            var115 = (var100 << 8) / (var35.field3501 - var35.field3502);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4818(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4818(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4818(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4818(var93 + var103 - var50, var104, var115);
                            }
                            var76.method4515(var82, var90 + var103, var107, var35.field3493, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4818(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4818(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4818(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4818(var97 + var103 - var62, var104, var115);
                                }
                                var77.method4515(var79, var98 + var103, var110, var38.field3493, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method4812(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method4812(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method4812(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method4812(var93 + var103 - var50, var104);
                            }
                            var76.method4514(var82, var90 + var103, var107, var35.field3493 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4812(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method4812(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method4812(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4812(var97 + var103 - var62, var104);
                                }
                                var77.method4514(var79, var98 + var103, var110, var38.field3493 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hc.fy(B)V")
    public static final void method3738() {
        field948 = 0;
        int var0 = (Statics.field2088.field1182 >> 7) + Statics.field556;
        int var1 = (Statics.field2088.field1143 >> 7) + Statics.field895;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field948 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field948 = 1;
        }
        if (field948 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field948 = 0;
        }
    }

    @ObfuscatedName("bi.gk(Lbr;II)V")
    public static final void method957(class78 arg0, int arg1) {
        method4646(arg0.field1182, arg0.field1143, arg1);
    }

    @ObfuscatedName("ji.gt(IIIB)V")
    public static final void method4646(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field934 = -1;
            field861 = -1;
            return;
        }
        int var3 = method479(arg0, arg1, Statics.field235) - arg2;
        int var4 = arg0 - Statics.field668;
        int var5 = var3 - Statics.field283;
        int var6 = arg1 - Statics.field2452;
        int var7 = class136.field1927[Statics.field2154];
        int var8 = class136.field1926[Statics.field2154];
        int var9 = class136.field1927[Statics.field3268];
        int var10 = class136.field1926[Statics.field3268];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field934 = field1038 * var11 / var15 + field877 / 2;
            field861 = field1038 * var14 / var15 + field1092 / 2;
        } else {
            field934 = -1;
            field861 = -1;
        }
    }

    @ObfuscatedName("al.gh(IIII)I")
    public static final int method479(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field711[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field696[var5][var3][var4] + class62.field696[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field696[var5][var3][var4 + 1] + class62.field696[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("bg.ge(ZLgy;I)V")
    public static final void method692(boolean arg0, class191 arg1) {
        field945 = arg0;
        if (!field945) {
            int var2 = arg1.method2998();
            int var3 = arg1.method2999();
            int var4 = arg1.method3194();
            Statics.field320 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field320[var5][var6] = arg1.method2967();
                }
            }
            Statics.field739 = new int[var4];
            Statics.field1353 = new int[var4];
            Statics.field1257 = new int[var4];
            Statics.field843 = new byte[var4][];
            Statics.field366 = new byte[var4][];
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
                        Statics.field739[var8] = var11;
                        Statics.field1353[var8] = Statics.field326.method3962("m" + var9 + "_" + var10);
                        Statics.field1257[var8] = Statics.field326.method3962("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            Statics.method884(var3, var2, true);
            return;
        }
        boolean var12 = arg1.method2975() == 1;
        int var13 = arg1.method3000();
        int var14 = arg1.method3000();
        int var15 = arg1.method3194();
        arg1.method3244();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3243(1);
                    if (var19 == 1) {
                        field903[var16][var17][var18] = arg1.method3243(26);
                    } else {
                        field903[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3263();
        Statics.field320 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field320[var20][var21] = arg1.method2967();
            }
        }
        Statics.field739 = new int[var15];
        Statics.field1353 = new int[var15];
        Statics.field1257 = new int[var15];
        Statics.field843 = new byte[var15][];
        Statics.field366 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field903[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field739[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field739[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field1353[var22] = Statics.field326.method3962("m" + var31 + "_" + var32);
                            Statics.field1257[var22] = Statics.field326.method3962("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        Statics.method884(var13, var14, !var12);
    }

    @ObfuscatedName("ei.gd(ZI)V")
    public static final void method2660(boolean arg0) {
        method1508();
        field889.field1456++;
        if (field889.field1456 < 50 && !arg0) {
            return;
        }
        field889.field1456 = 0;
        if (field1096 || field889.method1708() == null) {
            return;
        }
        class175 var1 = class175.method3893(class172.field2329, field889.field1450);
        field889.method1706(var1);
        try {
            field889.method1705();
        } catch (IOException var3) {
            field1096 = true;
        }
    }

    @ObfuscatedName("client.gs(Lcx;I)Z")
    public final boolean method1111(class101 arg0) {
        class160 var2 = arg0.method1708();
        class191 var3 = arg0.field1451;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1452 == null) {
                if (arg0.field1447) {
                    if (!var2.method2772(1)) {
                        return false;
                    }
                    var2.method2782(arg0.field1451.field2512, 0, 1);
                    arg0.field1454 = 0;
                    arg0.field1447 = false;
                }
                var3.field2509 = 0;
                if (var3.method3258()) {
                    if (!var2.method2772(1)) {
                        return false;
                    }
                    var2.method2782(arg0.field1451.field2512, 1, 1);
                    arg0.field1454 = 0;
                }
                arg0.field1447 = true;
                class171[] var4 = new class171[] { class171.field2256, class171.field2230, class171.field2231, class171.field2232, class171.field2264, class171.field2234, class171.field2301, class171.field2236, class171.field2242, class171.field2238, class171.field2239, class171.field2240, class171.field2241, class171.field2303, class171.field2243, class171.field2258, class171.field2245, class171.field2246, class171.field2250, class171.field2248, class171.field2249, class171.field2297, class171.field2251, class171.field2252, class171.field2253, class171.field2254, class171.field2300, class171.field2259, class171.field2257, class171.field2229, class171.field2283, class171.field2260, class171.field2302, class171.field2262, class171.field2255, class171.field2237, class171.field2265, class171.field2266, class171.field2267, class171.field2307, class171.field2247, class171.field2270, class171.field2233, class171.field2272, class171.field2273, class171.field2274, class171.field2275, class171.field2276, class171.field2269, class171.field2278, class171.field2263, class171.field2280, class171.field2281, class171.field2282, class171.field2290, class171.field2284, class171.field2285, class171.field2286, class171.field2287, class171.field2288, class171.field2235, class171.field2296, class171.field2291, class171.field2292, class171.field2293, class171.field2244, class171.field2279, class171.field2289, class171.field2268, class171.field2298, class171.field2299, class171.field2277, class171.field2271, class171.field2305, class171.field2310, class171.field2304, class171.field2294, class171.field2306, class171.field2261, class171.field2295, class171.field2309 };
                int var6 = var3.method3241();
                if (var6 < 0 || var6 >= var4.length) {
                    throw new IOException(var6 + " " + var3.field2509);
                }
                arg0.field1452 = var4[var6];
                arg0.field1446 = arg0.field1452.field2311;
            }
            if (arg0.field1446 == -1) {
                if (!var2.method2772(1)) {
                    return false;
                }
                arg0.method1708().method2782(var3.field2512, 0, 1);
                arg0.field1446 = var3.field2512[0] & 0xFF;
            }
            if (arg0.field1446 == -2) {
                if (!var2.method2772(2)) {
                    return false;
                }
                arg0.method1708().method2782(var3.field2512, 0, 2);
                var3.field2509 = 0;
                arg0.field1446 = var3.method3194();
            }
            if (!var2.method2772(arg0.field1446)) {
                return false;
            }
            var3.field2509 = 0;
            var2.method2782(var3.field2512, 0, arg0.field1446);
            arg0.field1454 = 0;
            field893.method4649();
            arg0.field1459 = arg0.field1458;
            arg0.field1458 = arg0.field1457;
            arg0.field1457 = arg0.field1452;
            if (class171.field2260 == arg0.field1452) {
                method936(class174.field2431);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2266 == arg0.field1452) {
                field931 = false;
                for (int var7 = 0; var7 < 5; var7++) {
                    field1076[var7] = false;
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2306 == arg0.field1452) {
                int var8 = var3.method3000();
                int var9 = var3.method2967();
                class228 var10 = class228.method2391(var9);
                if (var10.field2803 != 2 || var10.field2804 != var8) {
                    var10.field2803 = 2;
                    var10.field2804 = var8;
                    method308(var10);
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2253 == arg0.field1452) {
                method936(class174.field2421);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2256 == arg0.field1452) {
                method936(class174.field2428);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2250 == arg0.field1452) {
                int var11 = arg0.field1446;
                int var12 = var3.field2509;
                class95.field1401 = 0;
                int var13 = 0;
                var3.method3244();
                for (int var14 = 0; var14 < class95.field1400; var14++) {
                    int var15 = class95.field1394[var14];
                    if ((class95.field1390[var15] & 0x1) == 0) {
                        if (var13 > 0) {
                            var13--;
                            class95.field1390[var15] = (byte) (class95.field1390[var15] | 0x2);
                        } else {
                            int var16 = var3.method3243(1);
                            if (var16 == 0) {
                                var13 = class95.method159(var3);
                                class95.field1390[var15] = (byte) (class95.field1390[var15] | 0x2);
                            } else {
                                class95.method921(var3, var15);
                            }
                        }
                    }
                }
                var3.method3263();
                if (var13 != 0) {
                    throw new RuntimeException();
                }
                var3.method3244();
                for (int var17 = 0; var17 < class95.field1400; var17++) {
                    int var18 = class95.field1394[var17];
                    if ((class95.field1390[var18] & 0x1) != 0) {
                        if (var13 > 0) {
                            var13--;
                            class95.field1390[var18] = (byte) (class95.field1390[var18] | 0x2);
                        } else {
                            int var19 = var3.method3243(1);
                            if (var19 == 0) {
                                var13 = class95.method159(var3);
                                class95.field1390[var18] = (byte) (class95.field1390[var18] | 0x2);
                            } else {
                                class95.method921(var3, var18);
                            }
                        }
                    }
                }
                var3.method3263();
                if (var13 != 0) {
                    throw new RuntimeException();
                }
                var3.method3244();
                for (int var20 = 0; var20 < class95.field1395; var20++) {
                    int var21 = class95.field1396[var20];
                    if ((class95.field1390[var21] & 0x1) != 0) {
                        if (var13 > 0) {
                            var13--;
                            class95.field1390[var21] = (byte) (class95.field1390[var21] | 0x2);
                        } else {
                            int var22 = var3.method3243(1);
                            if (var22 == 0) {
                                var13 = class95.method159(var3);
                                class95.field1390[var21] = (byte) (class95.field1390[var21] | 0x2);
                            } else if (class95.method1517(var3, var21)) {
                                class95.field1390[var21] = (byte) (class95.field1390[var21] | 0x2);
                            }
                        }
                    }
                }
                var3.method3263();
                if (var13 != 0) {
                    throw new RuntimeException();
                }
                var3.method3244();
                for (int var23 = 0; var23 < class95.field1395; var23++) {
                    int var24 = class95.field1396[var23];
                    if ((class95.field1390[var24] & 0x1) == 0) {
                        if (var13 > 0) {
                            var13--;
                            class95.field1390[var24] = (byte) (class95.field1390[var24] | 0x2);
                        } else {
                            int var25 = var3.method3243(1);
                            if (var25 == 0) {
                                var13 = class95.method159(var3);
                                class95.field1390[var24] = (byte) (class95.field1390[var24] | 0x2);
                            } else if (class95.method1517(var3, var24)) {
                                class95.field1390[var24] = (byte) (class95.field1390[var24] | 0x2);
                            }
                        }
                    }
                }
                var3.method3263();
                if (var13 != 0) {
                    throw new RuntimeException();
                }
                class95.field1400 = 0;
                class95.field1395 = 0;
                for (int var26 = 1; var26 < 2048; var26++) {
                    class95.field1390[var26] = (byte) (class95.field1390[var26] >> 1);
                    class74 var27 = field949[var26];
                    if (var27 == null) {
                        class95.field1396[++class95.field1395 - 1] = var26;
                    } else {
                        class95.field1394[++class95.field1400 - 1] = var26;
                    }
                }
                class95.method2203(var3);
                if (var3.field2509 - var12 != var11) {
                    throw new RuntimeException(var3.field2509 - var12 + " " + var11);
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2257 == arg0.field1452) {
                int var28 = var3.method3194();
                if (var28 == 65535) {
                    var28 = -1;
                }
                int var29 = var3.method3009();
                int var30 = var3.method2967();
                int var31 = var3.method3194();
                if (var31 == 65535) {
                    var31 = -1;
                }
                for (int var32 = var31; var32 <= var28; var32++) {
                    long var33 = ((long) var29 << 32) + (long) var32;
                    class204 var35 = field1031.method3387(var33);
                    if (var35 != null) {
                        var35.method3427();
                    }
                    field1031.method3381(new class210(var30), var33);
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2287 == arg0.field1452) {
                for (int var36 = 0; var36 < field949.length; var36++) {
                    if (field949[var36] != null) {
                        field949[var36].field1155 = -1;
                    }
                }
                for (int var37 = 0; var37 < field884.length; var37++) {
                    if (field884[var37] != null) {
                        field884[var37].field1155 = -1;
                    }
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2297 == arg0.field1452) {
                field1023 = field1058;
                if (arg0.field1446 == 0) {
                    field1054 = null;
                    field953 = null;
                    Statics.field2559 = 0;
                    Statics.field631 = null;
                    arg0.field1452 = null;
                    return true;
                }
                field953 = var3.method3168();
                long var38 = var3.method2974();
                long var40 = var38;
                String var42;
                if (var38 <= 0L || var38 >= 6582952005840035281L) {
                    var42 = null;
                } else if (var38 % 37L == 0L) {
                    var42 = null;
                } else {
                    int var43 = 0;
                    for (long var44 = var38; var44 != 0L; var44 /= 37L) {
                        var43++;
                    }
                    StringBuilder var46 = new StringBuilder(var43);
                    while (var40 != 0L) {
                        long var47 = var40;
                        var40 /= 37L;
                        var46.append(class280.field3740[(int) (var47 - var40 * 37L)]);
                    }
                    var42 = var46.reverse().toString();
                }
                field1054 = var42;
                Statics.field2210 = var3.method3015();
                int var49 = var3.method2962();
                if (var49 == 255) {
                    arg0.field1452 = null;
                    return true;
                }
                Statics.field2559 = var49;
                class76[] var50 = new class76[100];
                for (int var51 = 0; var51 < Statics.field2559; var51++) {
                    var50[var51] = new class76();
                    var50[var51].field839 = var3.method3168();
                    var50[var51].field841 = class279.method3736(var50[var51].field839, Statics.field1110);
                    var50[var51].field840 = var3.method3194();
                    var50[var51].field842 = var3.method3015();
                    var3.method3168();
                    if (var50[var51].field839.equals(Statics.field2088.field832)) {
                        Statics.field1898 = var50[var51].field842;
                    }
                }
                boolean var52 = false;
                int var53 = Statics.field2559;
                while (var53 > 0) {
                    boolean var54 = true;
                    var53--;
                    for (int var55 = 0; var55 < var53; var55++) {
                        if (var50[var55].field841.compareTo(var50[var55 + 1].field841) > 0) {
                            class76 var56 = var50[var55];
                            var50[var55] = var50[var55 + 1];
                            var50[var55 + 1] = var56;
                            var54 = false;
                        }
                    }
                    if (var54) {
                        break;
                    }
                }
                Statics.field631 = var50;
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2300 == arg0.field1452) {
                method692(false, arg0.field1451);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2261 == arg0.field1452) {
                Statics.field728 = class290.method3994(var3.method2962());
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2249 == arg0.field1452) {
                for (int var57 = 0; var57 < Statics.field2029; var57++) {
                    class253 var58 = class253.method171(var57);
                    if (var58 != null) {
                        class223.field2722[var57] = 0;
                        class223.field2723[var57] = 0;
                    }
                }
                method1499();
                field1016 += 32;
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2284 == arg0.field1452) {
                method1499();
                field994 = var3.method2962();
                field1026 = field1058;
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2238 == arg0.field1452) {
                method936(class174.field2422);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2293 == arg0.field1452) {
                int var59 = var3.method2962();
                int var60 = var3.method2962();
                int var61 = var3.method2962();
                int var62 = var3.method2962();
                field1076[var59] = true;
                field1077[var59] = var60;
                field1078[var59] = var61;
                field1079[var59] = var62;
                field1080[var59] = 0;
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2303 == arg0.field1452) {
                int var63 = var3.method3001();
                int var64 = var3.method3008();
                class228 var65 = class228.method2391(var64);
                if (var65.field2807 != var63 || var63 == -1) {
                    var65.field2807 = var63;
                    var65.field2882 = 0;
                    var65.field2893 = 0;
                    method308(var65);
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2275 == arg0.field1452) {
                method1499();
                int var66 = var3.method2989();
                int var67 = var3.method2989();
                int var68 = var3.method2967();
                field914[var67] = var68;
                field1024[var67] = var66;
                field964[var67] = 1;
                for (int var69 = 0; var69 < 98; var69++) {
                    if (var68 >= class234.field2943[var69]) {
                        field964[var67] = var69 + 2;
                    }
                }
                field1019[++field923 - 1 & 0x1F] = var67;
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2271 == arg0.field1452) {
                if (field873 != -1) {
                    int var70 = field873;
                    if (class228.method1487(var70)) {
                        method154(Statics.field2858[var70], 0);
                    }
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2240 == arg0.field1452) {
                method936(class174.field2429);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2276 == arg0.field1452) {
                boolean var71 = var3.method3036() == 1;
                int var72 = var3.method3158();
                class228 var73 = class228.method2391(var72);
                if (var73.field2832 != var71) {
                    var73.field2832 = var71;
                    method308(var73);
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2244 == arg0.field1452) {
                int var74 = var3.method2967();
                int var75 = var3.method3194();
                if (var74 < -70000) {
                    var75 += 32768;
                }
                class228 var76;
                if (var74 >= 0) {
                    var76 = class228.method2391(var74);
                } else {
                    var76 = null;
                }
                if (var76 != null) {
                    for (int var77 = 0; var77 < var76.field2878.length; var77++) {
                        var76.field2878[var77] = 0;
                        var76.field2879[var77] = 0;
                    }
                }
                class64.method491(var75);
                int var78 = var3.method3194();
                for (int var79 = 0; var79 < var78; var79++) {
                    int var80 = var3.method2989();
                    if (var80 == 255) {
                        var80 = var3.method3009();
                    }
                    int var81 = var3.method3000();
                    if (var76 != null && var79 < var76.field2878.length) {
                        var76.field2878[var79] = var81;
                        var76.field2879[var79] = var80;
                    }
                    Statics.method2682(var75, var79, var81 - 1, var80);
                }
                if (var76 != null) {
                    method308(var76);
                }
                method1499();
                field853[++field1018 - 1 & 0x1F] = var75 & 0x7FFF;
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2246 == arg0.field1452) {
                field1061 = var3.method2962();
                if (field1061 == 255) {
                    field1061 = 0;
                }
                field1062 = var3.method2962();
                if (field1062 == 255) {
                    field1062 = 0;
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2268 == arg0.field1452) {
                field1095 = 1;
                field1042 = field1058;
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2263 == arg0.field1452) {
                int var82 = var3.method3137();
                boolean var83 = var3.method2962() == 1;
                String var84 = "";
                boolean var85 = false;
                if (var83) {
                    var84 = var3.method3168();
                    if (method203(var84)) {
                        var85 = true;
                    }
                }
                String var86 = var3.method3168();
                if (!var85) {
                    class97.method172(var82, var84, var86);
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2269 == arg0.field1452) {
                Statics.field468 = var3.method2975();
                Statics.field559 = var3.method2989();
                while (var3.field2509 < arg0.field1446) {
                    int var87 = var3.method2962();
                    class174 var88 = Statics.method162()[var87];
                    method936(var88);
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2298 == arg0.field1452) {
                method692(true, arg0.field1451);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2252 == arg0.field1452) {
                int var89 = var3.method2999();
                class64 var90 = (class64) class64.field726.method3387((long) var89);
                if (var90 != null) {
                    var90.method3427();
                }
                field853[++field1018 - 1 & 0x1F] = var89 & 0x7FFF;
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2310 == arg0.field1452) {
                int var91 = var3.method3036();
                String var92 = var3.method3168();
                int var93 = var3.method2962();
                if (var93 >= 1 && var93 <= 8) {
                    if (var92.equalsIgnoreCase("null")) {
                        var92 = null;
                    }
                    field955[var93 - 1] = var92;
                    field956[var93 - 1] = var91 == 0;
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2285 == arg0.field1452) {
                int var94 = var3.method3194();
                int var95 = var3.method3009();
                class228 var96 = class228.method2391(var95);
                if (var96 != null && var96.field2762 == 0) {
                    if (var94 > var96.field2784 - var96.field2776) {
                        var94 = var96.field2784 - var96.field2776;
                    }
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var96.field2782 != var94) {
                        var96.field2782 = var94;
                        method308(var96);
                    }
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2248 == arg0.field1452) {
                method1499();
                field995 = var3.method2965();
                field1026 = field1058;
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2245 == arg0.field1452) {
                while (var3.field2509 < arg0.field1446) {
                    boolean var97 = var3.method2962() == 1;
                    String var98 = var3.method3168();
                    String var99 = var3.method3168();
                    int var100 = var3.method3194();
                    int var101 = var3.method2962();
                    int var102 = var3.method2962();
                    boolean var103 = (var102 & 0x2) != 0;
                    boolean var104 = (var102 & 0x1) != 0;
                    if (var100 > 0) {
                        var3.method3168();
                        var3.method2962();
                        var3.method2967();
                    }
                    var3.method3168();
                    for (int var105 = 0; var105 < field1094; var105++) {
                        class66 var106 = field990[var105];
                        if (var97) {
                            if (var99.equals(var106.field750)) {
                                var106.field750 = var98;
                                var106.field744 = var99;
                                var98 = null;
                                break;
                            }
                        } else if (var98.equals(var106.field750)) {
                            if (var106.field747 != var100) {
                                boolean var107 = true;
                                for (class67 var108 = (class67) field1097.method3482(); var108 != null; var108 = (class67) field1097.method3485()) {
                                    if (var108.field753.equals(var98)) {
                                        if (var100 != 0 && var108.field754 == 0) {
                                            var108.method3492();
                                            var107 = false;
                                        } else if (var100 == 0 && var108.field754 != 0) {
                                            var108.method3492();
                                            var107 = false;
                                        }
                                    }
                                }
                                if (var107) {
                                    field1097.method3481(new class67(var98, var100));
                                }
                                var106.field747 = var100;
                            }
                            var106.field744 = var99;
                            var106.field746 = var101;
                            var106.field749 = var103;
                            var106.field748 = var104;
                            var98 = null;
                            break;
                        }
                    }
                    if (var98 != null && field1094 < 400) {
                        class66 var109 = new class66();
                        field990[field1094] = var109;
                        var109.field750 = var98;
                        var109.field744 = var99;
                        var109.field747 = var100;
                        var109.field746 = var101;
                        var109.field749 = var103;
                        var109.field748 = var104;
                        field1094++;
                    }
                }
                field1095 = 2;
                field1042 = field1058;
                boolean var110 = false;
                int var111 = field1094;
                while (var111 > 0) {
                    boolean var112 = true;
                    var111--;
                    for (int var113 = 0; var113 < var111; var113++) {
                        boolean var114 = false;
                        class66 var115 = field990[var113];
                        class66 var116 = field990[var113 + 1];
                        if (field847 != var115.field747 && field847 == var116.field747) {
                            var114 = true;
                        }
                        if (!var114 && var115.field747 == 0 && var116.field747 != 0) {
                            var114 = true;
                        }
                        if (!var114 && !var115.field749 && var116.field749) {
                            var114 = true;
                        }
                        if (!var114 && !var115.field748 && var116.field748) {
                            var114 = true;
                        }
                        if (var114) {
                            class66 var117 = field990[var113];
                            field990[var113] = field990[var113 + 1];
                            field990[var113 + 1] = var117;
                            var112 = false;
                        }
                    }
                    if (var112) {
                        break;
                    }
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2277 == arg0.field1452) {
                field1063 = var3.method2962();
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2278 == arg0.field1452) {
                int var118 = var3.method3158();
                int var119 = var3.method3194();
                int var120 = var119 >> 10 & 0x1F;
                int var121 = var119 >> 5 & 0x1F;
                int var122 = var119 & 0x1F;
                int var123 = (var122 << 3) + (var120 << 19) + (var121 << 11);
                class228 var124 = class228.method2391(var118);
                if (var124.field2785 != var123) {
                    var124.field2785 = var123;
                    method308(var124);
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2305 == arg0.field1452) {
                int var125 = var3.method3009();
                int var126 = var3.method2998();
                int var127 = var3.method3000();
                int var128 = var3.method3194();
                class228 var129 = class228.method2391(var125);
                if (var129.field2811 != var126 || var129.field2812 != var127 || var129.field2814 != var128) {
                    var129.field2811 = var126;
                    var129.field2812 = var127;
                    var129.field2814 = var128;
                    method308(var129);
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2233 == arg0.field1452) {
                field931 = true;
                Statics.field22 = var3.method2962();
                Statics.field254 = var3.method2962();
                Statics.field1381 = var3.method3194();
                Statics.field260 = var3.method2962();
                Statics.field578 = var3.method2962();
                if (Statics.field578 >= 100) {
                    Statics.field668 = Statics.field22 * 128 + 64;
                    Statics.field2452 = Statics.field254 * 128 + 64;
                    Statics.field283 = method479(Statics.field668, Statics.field2452, Statics.field235) - Statics.field1381;
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2283 == arg0.field1452) {
                String var130 = var3.method3168();
                long var131 = (long) var3.method3194();
                long var133 = (long) var3.method2966();
                class242 var135 = (class242) class180.method1581(class242.method2282(), var3.method2962());
                long var136 = (var131 << 32) + var133;
                boolean var138 = false;
                for (int var139 = 0; var139 < 100; var139++) {
                    if (field1048[var139] == var136) {
                        var138 = true;
                        break;
                    }
                }
                if (method203(var130)) {
                    var138 = true;
                }
                if (!var138 && field948 == 0) {
                    field1048[field1049] = var136;
                    field1049 = (field1049 + 1) % 100;
                    String var140 = class276.method4546(class282.method2471(class277.method83(var3)));
                    byte var141;
                    if (var135.field3279) {
                        var141 = 7;
                    } else {
                        var141 = 3;
                    }
                    if (var135.field3280 == -1) {
                        class97.method172(var141, var130, var140);
                    } else {
                        int var143 = var135.field3280;
                        String var144 = "<img=" + var143 + ">";
                        class97.method172(var141, var144 + var130, var140);
                    }
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2279 == arg0.field1452) {
                field931 = true;
                Statics.field10 = var3.method2962();
                Statics.field2517 = var3.method2962();
                Statics.field274 = var3.method3194();
                Statics.field2430 = var3.method2962();
                Statics.field3699 = var3.method2962();
                if (Statics.field3699 >= 100) {
                    int var145 = Statics.field10 * 128 + 64;
                    int var146 = Statics.field2517 * 128 + 64;
                    int var147 = method479(var145, var146, Statics.field235) - Statics.field274;
                    int var148 = var145 - Statics.field668;
                    int var149 = var147 - Statics.field283;
                    int var150 = var146 - Statics.field2452;
                    int var151 = (int) Math.sqrt((double) (var148 * var148 + var150 * var150));
                    Statics.field2154 = (int) (Math.atan2((double) var149, (double) var151) * 325.949D) & 0x7FF;
                    Statics.field3268 = (int) (Math.atan2((double) var148, (double) var150) * -325.949D) & 0x7FF;
                    if (Statics.field2154 < 128) {
                        Statics.field2154 = 128;
                    }
                    if (Statics.field2154 > 383) {
                        Statics.field2154 = 383;
                    }
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2289 == arg0.field1452) {
                int var152 = var3.method3009();
                class228 var153 = class228.method2391(var152);
                var153.field2803 = 3;
                var153.field2804 = Statics.field2088.field827.method3761();
                method308(var153);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2288 == arg0.field1452) {
                int var154 = var3.method2967();
                int var155 = var3.method3194();
                if (var154 < -70000) {
                    var155 += 32768;
                }
                class228 var156;
                if (var154 >= 0) {
                    var156 = class228.method2391(var154);
                } else {
                    var156 = null;
                }
                while (var3.field2509 < arg0.field1446) {
                    int var157 = var3.method3137();
                    int var158 = var3.method3194();
                    int var159 = 0;
                    if (var158 != 0) {
                        var159 = var3.method2962();
                        if (var159 == 255) {
                            var159 = var3.method2967();
                        }
                    }
                    if (var156 != null && var157 >= 0 && var157 < var156.field2878.length) {
                        var156.field2878[var157] = var158;
                        var156.field2879[var157] = var159;
                    }
                    Statics.method2682(var155, var157, var158 - 1, var159);
                }
                if (var156 != null) {
                    method308(var156);
                }
                method1499();
                field853[++field1018 - 1 & 0x1F] = var155 & 0x7FFF;
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2295 == arg0.field1452) {
                field1045 = var3.method3036();
                field1088 = var3.method2962();
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2274 == arg0.field1452) {
                class80 var160 = new class80();
                var160.field1203 = var3.method3168();
                var160.field1206 = var3.method3194();
                int var161 = var3.method2967();
                var160.field1201 = var161;
                method939(45);
                var2.method2776();
                Object var162 = null;
                class92.method165(var160);
                arg0.field1452 = null;
                return false;
            }
            if (class171.field2265 == arg0.field1452) {
                method966(true, var3);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2280 == arg0.field1452) {
                method936(class174.field2423);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2237 == arg0.field1452) {
                method966(false, var3);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2296 == arg0.field1452) {
                int var163 = var3.method3194();
                int var164 = var3.method2962();
                int var165 = var3.method3194();
                method462(var163, var164, var165);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2231 == arg0.field1452) {
                field863 = var3.method2962();
                if (field863 == 1) {
                    field1098 = var3.method3194();
                }
                if (field863 >= 2 && field863 <= 6) {
                    if (field863 == 2) {
                        field869 = 64;
                        field870 = 64;
                    }
                    if (field863 == 3) {
                        field869 = 0;
                        field870 = 64;
                    }
                    if (field863 == 4) {
                        field869 = 128;
                        field870 = 64;
                    }
                    if (field863 == 5) {
                        field869 = 64;
                        field870 = 0;
                    }
                    if (field863 == 6) {
                        field869 = 64;
                        field870 = 128;
                    }
                    field863 = 2;
                    field866 = var3.method3194();
                    field867 = var3.method3194();
                    field1075 = var3.method2962();
                }
                if (field863 == 10) {
                    field865 = var3.method3194();
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2302 == arg0.field1452) {
                method2686(var3.method3168());
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2234 == arg0.field1452) {
                int var166 = arg0.field1446;
                class293 var167 = new class293();
                var167.field3823 = var3.method2962();
                var167.field3820 = var3.method2967();
                var167.field3818 = new int[var167.field3823];
                var167.field3817 = new int[var167.field3823];
                var167.field3819 = new Field[var167.field3823];
                var167.field3821 = new int[var167.field3823];
                var167.field3822 = new Method[var167.field3823];
                var167.field3816 = new byte[var167.field3823][][];
                for (int var168 = 0; var168 < var167.field3823; var168++) {
                    try {
                        int var169 = var3.method2962();
                        if (var169 == 0 || var169 == 1 || var169 == 2) {
                            String var170 = var3.method3168();
                            String var171 = var3.method3168();
                            int var172 = 0;
                            if (var169 == 1) {
                                var172 = var3.method2967();
                            }
                            var167.field3818[var168] = var169;
                            var167.field3821[var168] = var172;
                            if (class294.method2870(var170).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var167.field3819[var168] = class294.method2870(var170).getDeclaredField(var171);
                        } else if (var169 == 3 || var169 == 4) {
                            String var173 = var3.method3168();
                            String var174 = var3.method3168();
                            int var175 = var3.method2962();
                            String[] var176 = new String[var175];
                            for (int var177 = 0; var177 < var175; var177++) {
                                var176[var177] = var3.method3168();
                            }
                            String var178 = var3.method3168();
                            byte[][] var179 = new byte[var175][];
                            if (var169 == 3) {
                                for (int var180 = 0; var180 < var175; var180++) {
                                    int var181 = var3.method2967();
                                    var179[var180] = new byte[var181];
                                    var3.method2973(var179[var180], 0, var181);
                                }
                            }
                            var167.field3818[var168] = var169;
                            Class[] var182 = new Class[var175];
                            for (int var183 = 0; var183 < var175; var183++) {
                                var182[var183] = class294.method2870(var176[var183]);
                            }
                            Class var184 = class294.method2870(var178);
                            if (class294.method2870(var173).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var185 = class294.method2870(var173).getDeclaredMethods();
                            Method[] var186 = var185;
                            for (int var187 = 0; var187 < var186.length; var187++) {
                                Method var188 = var186[var187];
                                if (var188.getName().equals(var174)) {
                                    Class[] var189 = var188.getParameterTypes();
                                    if (var182.length == var189.length) {
                                        boolean var190 = true;
                                        for (int var191 = 0; var191 < var182.length; var191++) {
                                            if (var182[var191] != var189[var191]) {
                                                var190 = false;
                                                break;
                                            }
                                        }
                                        if (var190 && var184 == var188.getReturnType()) {
                                            var167.field3822[var168] = var188;
                                        }
                                    }
                                }
                            }
                            var167.field3816[var168] = var179;
                        }
                    } catch (ClassNotFoundException var310) {
                        var167.field3817[var168] = -1;
                    } catch (SecurityException var311) {
                        var167.field3817[var168] = -2;
                    } catch (NullPointerException var312) {
                        var167.field3817[var168] = -3;
                    } catch (Exception var313) {
                        var167.field3817[var168] = -4;
                    } catch (Throwable var314) {
                        var167.field3817[var168] = -5;
                    }
                }
                class294.field3825.method3417(var167);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2294 == arg0.field1452) {
                Statics.field559 = var3.method2975();
                Statics.field468 = var3.method2962();
                for (int var197 = Statics.field559; var197 < Statics.field559 + 8; var197++) {
                    for (int var198 = Statics.field468; var198 < Statics.field468 + 8; var198++) {
                        if (field1036[Statics.field235][var197][var198] != null) {
                            field1036[Statics.field235][var197][var198] = null;
                            method998(var197, var198);
                        }
                    }
                }
                for (class77 var199 = (class77) field960.method3442(); var199 != null; var199 = (class77) field960.method3444()) {
                    if (var199.field1111 >= Statics.field559 && var199.field1111 < Statics.field559 + 8 && var199.field1116 >= Statics.field468 && var199.field1116 < Statics.field468 + 8 && Statics.field235 == var199.field1119) {
                        var199.field1120 = 0;
                    }
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2299 == arg0.field1452) {
                int var200 = var3.method2962();
                if (var3.method2962() == 0) {
                    field912[var200] = new class17();
                    var3.field2509 += 18;
                } else {
                    var3.field2509--;
                    field912[var200] = new class17(var3, false);
                }
                field1051 = field1058;
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2281 == arg0.field1452) {
                int var201 = var3.method3009();
                int var202 = var3.method3001();
                int var203 = var3.method2970();
                class228 var204 = class228.method2391(var201);
                if (var204.field2769 != var202 || var204.field2770 != var203 || var204.field2765 != 0 || var204.field2839 != 0) {
                    var204.field2769 = var202;
                    var204.field2770 = var203;
                    var204.field2765 = 0;
                    var204.field2839 = 0;
                    method308(var204);
                    this.method1035(var204);
                    if (var204.field2762 == 0) {
                        method91(Statics.field2858[var201 >> 16], var204, false);
                    }
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2243 == arg0.field1452) {
                int var205 = var3.method2967();
                int var206 = var3.method2967();
                class68 var207 = (class68) field947.method3387((long) var206);
                class68 var208 = (class68) field947.method3387((long) var205);
                if (var208 != null) {
                    method943(var208, var207 == null || var207.field766 != var208.field766);
                }
                if (var207 != null) {
                    var207.method3427();
                    field947.method3381(var207, (long) var205);
                }
                class228 var209 = class228.method2391(var206);
                if (var209 != null) {
                    method308(var209);
                }
                class228 var210 = class228.method2391(var205);
                if (var210 != null) {
                    method308(var210);
                    method91(Statics.field2858[var210.field2868 >>> 16], var210, true);
                }
                if (field873 != -1) {
                    int var211 = field873;
                    if (class228.method1487(var211)) {
                        method154(Statics.field2858[var211], 1);
                    }
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2230 == arg0.field1452) {
                Statics.field468 = var3.method3036();
                Statics.field559 = var3.method2989();
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2286 == arg0.field1452) {
                method936(class174.field2427);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2273 == arg0.field1452) {
                String var212 = var3.method3168();
                String var213 = class276.method4546(class282.method2471(class277.method83(var3)));
                class97.method172(6, var212, var213);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2241 == arg0.field1452) {
                int var214 = arg0.field1446 + var3.field2509;
                int var215 = var3.method3194();
                int var216 = var3.method3194();
                if (field873 != var215) {
                    field873 = var215;
                    this.method1259(false);
                    method307(field873);
                    Statics.method41(field873);
                    for (int var217 = 0; var217 < 100; var217++) {
                        field1034[var217] = true;
                    }
                }
                while (var216-- > 0) {
                    int var218 = var3.method2967();
                    int var219 = var3.method3194();
                    int var220 = var3.method2962();
                    class68 var221 = (class68) field947.method3387((long) var218);
                    if (var221 != null && var221.field766 != var219) {
                        method943(var221, true);
                        var221 = null;
                    }
                    if (var221 == null) {
                        var221 = method1676(var218, var219, var220);
                    }
                    var221.field765 = true;
                }
                for (class68 var222 = (class68) field947.method3379(); var222 != null; var222 = (class68) field947.method3384()) {
                    if (var222.field765) {
                        var222.field765 = false;
                    } else {
                        method943(var222, true);
                    }
                }
                field1031 = new class202(512);
                while (var3.field2509 < var214) {
                    int var223 = var3.method2967();
                    int var224 = var3.method3194();
                    int var225 = var3.method3194();
                    int var226 = var3.method2967();
                    for (int var227 = var224; var227 <= var225; var227++) {
                        long var228 = ((long) var223 << 32) + (long) var227;
                        field1031.method3381(new class210(var226), var228);
                    }
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2242 == arg0.field1452) {
                method1679();
                arg0.field1452 = null;
                return false;
            }
            if (class171.field2282 == arg0.field1452) {
                int var230 = var3.method2967();
                class228 var231 = class228.method2391(var230);
                for (int var232 = 0; var232 < var231.field2878.length; var232++) {
                    var231.field2878[var232] = -1;
                    var231.field2878[var232] = 0;
                }
                method308(var231);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2291 == arg0.field1452) {
                int var233 = var3.method2998();
                int var234 = var3.method3008();
                class228 var235 = class228.method2391(var234);
                if (var235.field2803 != 1 || var235.field2804 != var233) {
                    var235.field2803 = 1;
                    var235.field2804 = var233;
                    method308(var235);
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2262 == arg0.field1452) {
                int var236 = var3.method2998();
                if (var236 == 65535) {
                    var236 = -1;
                }
                if (var236 == -1 && !field1009) {
                    Statics.field3754.method3540();
                    class215.field2621 = 1;
                    Statics.field2624 = null;
                } else if (var236 != -1 && field851 != var236 && field846 != 0 && !field1009) {
                    class215.method2856(2, Statics.field387, var236, 0, field846, false);
                }
                field851 = var236;
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2247 == arg0.field1452) {
                int var237 = var3.method3004();
                int var238 = var3.method3194();
                if (var238 == 65535) {
                    var238 = -1;
                }
                if (field846 != 0 && var238 != -1) {
                    class215.method4(Statics.field314, var238, 0, field846, false);
                    field1009 = true;
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2272 == arg0.field1452) {
                byte var239 = var3.method3048();
                int var240 = var3.method3194();
                class223.field2722[var240] = var239;
                if (class223.field2723[var240] != var239) {
                    class223.field2723[var240] = var239;
                }
                method2693(var240);
                field989[++field1016 - 1 & 0x1F] = var240;
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2236 == arg0.field1452) {
                String var241 = var3.method3168();
                Object[] var242 = new Object[var241.length() + 1];
                for (int var243 = var241.length() - 1; var243 >= 0; var243--) {
                    if (var241.charAt(var243) == 's') {
                        var242[var243 + 1] = var3.method3168();
                    } else {
                        var242[var243 + 1] = Integer.valueOf(var3.method2967());
                    }
                }
                var242[0] = Integer.valueOf(var3.method2967());
                class69 var244 = new class69();
                var244.field775 = var242;
                class83.method2139(var244);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2307 == arg0.field1452) {
                method936(class174.field2426);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2255 == arg0.field1452) {
                String var245 = var3.method3168();
                long var246 = var3.method2974();
                long var248 = (long) var3.method3194();
                long var250 = (long) var3.method2966();
                class242 var252 = (class242) class180.method1581(class242.method2282(), var3.method2962());
                long var253 = (var248 << 32) + var250;
                boolean var255 = false;
                for (int var256 = 0; var256 < 100; var256++) {
                    if (field1048[var256] == var253) {
                        var255 = true;
                        break;
                    }
                }
                if (var252.field3273 && method203(var245)) {
                    var255 = true;
                }
                if (!var255 && field948 == 0) {
                    field1048[field1049] = var253;
                    field1049 = (field1049 + 1) % 100;
                    String var257 = class276.method4546(class282.method2471(class277.method83(var3)));
                    if (var252.field3280 == -1) {
                        class97.method225(9, var245, var257, Statics.method1656(var246));
                    } else {
                        int var258 = var252.field3280;
                        String var259 = "<img=" + var258 + ">";
                        class97.method225(9, var259 + var245, var257, Statics.method1656(var246));
                    }
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2239 == arg0.field1452) {
                int var260 = var3.method2967();
                class68 var261 = (class68) field947.method3387((long) var260);
                if (var261 != null) {
                    method943(var261, true);
                }
                if (field959 != null) {
                    method308(field959);
                    field959 = null;
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2251 == arg0.field1452) {
                int var262 = var3.method2998();
                field873 = var262;
                this.method1259(false);
                method307(var262);
                Statics.method41(field873);
                for (int var263 = 0; var263 < 100; var263++) {
                    field1034[var263] = true;
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2229 == arg0.field1452) {
                while (var3.field2509 < arg0.field1446) {
                    int var264 = var3.method2962();
                    boolean var265 = (var264 & 0x1) == 1;
                    String var266 = var3.method3168();
                    String var267 = var3.method3168();
                    var3.method3168();
                    for (int var268 = 0; var268 < field905; var268++) {
                        class70 var269 = field1066[var268];
                        if (var265) {
                            if (var267.equals(var269.field786)) {
                                var269.field786 = var266;
                                var269.field782 = var267;
                                var266 = null;
                                break;
                            }
                        } else if (var266.equals(var269.field786)) {
                            var269.field786 = var266;
                            var269.field782 = var267;
                            var266 = null;
                            break;
                        }
                    }
                    if (var266 != null && field905 < 400) {
                        class70 var270 = new class70();
                        field1066[field905] = var270;
                        var270.field786 = var266;
                        var270.field782 = var267;
                        field905++;
                    }
                }
                field1042 = field1058;
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2258 == arg0.field1452) {
                var3.field2509 += 28;
                if (var3.method2968()) {
                    method1589(var3, var3.field2509 - 28);
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2232 == arg0.field1452) {
                String var271 = var3.method3168();
                int var272 = var3.method3009();
                class228 var273 = class228.method2391(var272);
                if (!var271.equals(var273.field2820)) {
                    var273.field2820 = var271;
                    method308(var273);
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2301 == arg0.field1452) {
                method936(class174.field2425);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2259 == arg0.field1452) {
                String var274 = var3.method3168();
                int var275 = var3.method3194();
                byte var276 = var3.method3015();
                boolean var277 = false;
                if (var276 == -128) {
                    var277 = true;
                }
                if (var277) {
                    if (Statics.field2559 == 0) {
                        arg0.field1452 = null;
                        return true;
                    }
                    boolean var278 = false;
                    int var279;
                    for (var279 = 0; var279 < Statics.field2559 && (!Statics.field631[var279].field839.equals(var274) || Statics.field631[var279].field840 != var275); var279++) {
                    }
                    if (var279 < Statics.field2559) {
                        while (var279 < Statics.field2559 - 1) {
                            Statics.field631[var279] = Statics.field631[var279 + 1];
                            var279++;
                        }
                        Statics.field2559--;
                        Statics.field631[Statics.field2559] = null;
                    }
                } else {
                    var3.method3168();
                    class76 var280 = new class76();
                    var280.field839 = var274;
                    var280.field841 = class279.method3736(var280.field839, Statics.field1110);
                    var280.field840 = var275;
                    var280.field842 = var276;
                    int var281;
                    for (var281 = Statics.field2559 - 1; var281 >= 0; var281--) {
                        int var282 = Statics.field631[var281].field841.compareTo(var280.field841);
                        if (var282 == 0) {
                            Statics.field631[var281].field840 = var275;
                            Statics.field631[var281].field842 = var276;
                            if (var274.equals(Statics.field2088.field832)) {
                                Statics.field1898 = var276;
                            }
                            field1023 = field1058;
                            arg0.field1452 = null;
                            return true;
                        }
                        if (var282 < 0) {
                            break;
                        }
                    }
                    if (Statics.field2559 >= Statics.field631.length) {
                        arg0.field1452 = null;
                        return true;
                    }
                    for (int var283 = Statics.field2559 - 1; var283 > var281; var283--) {
                        Statics.field631[var283 + 1] = Statics.field631[var283];
                    }
                    if (Statics.field2559 == 0) {
                        Statics.field631 = new class76[100];
                    }
                    Statics.field631[var281 + 1] = var280;
                    Statics.field2559++;
                    if (var274.equals(Statics.field2088.field832)) {
                        Statics.field1898 = var276;
                    }
                }
                field1023 = field1058;
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2267 == arg0.field1452) {
                method936(class174.field2424);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2235 == arg0.field1452) {
                int var284 = var3.method3158();
                int var285 = var3.method2998();
                class223.field2722[var285] = var284;
                if (class223.field2723[var285] != var284) {
                    class223.field2723[var285] = var284;
                }
                method2693(var285);
                field989[++field1016 - 1 & 0x1F] = var285;
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2270 == arg0.field1452) {
                int var286 = var3.method2962();
                int var287 = var3.method3000();
                int var288 = var3.method3009();
                class68 var289 = (class68) field947.method3387((long) var288);
                if (var289 != null) {
                    method943(var289, var289.field766 != var287);
                }
                method1676(var288, var287, var286);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2304 == arg0.field1452) {
                int var290 = var3.method2967();
                int var291 = var3.method2967();
                int var292 = class59.method3860();
                class175 var293 = class175.method3893(class172.field2377, field889.field1450);
                var293.field2434.method2986(field639);
                var293.field2434.method2987(var292);
                var293.field2434.method3012(var290);
                var293.field2434.method3005(var291);
                field889.method1706(var293);
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2254 == arg0.field1452) {
                boolean var294 = var3.method2962() == 1;
                if (var294) {
                    Statics.field393 = class187.method1411() - var3.method2974();
                    Statics.field627 = new class14(var3, true);
                } else {
                    Statics.field627 = null;
                }
                field1025 = field1058;
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2292 == arg0.field1452) {
                int var295 = var3.method3009();
                int var296 = var3.method3194();
                int var297 = var3.method2999();
                class228 var298 = class228.method2391(var295);
                var298.field2816 = (var296 << 16) + var297;
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2290 == arg0.field1452) {
                int var299 = var3.method3009();
                int var300 = var3.method2998();
                if (var300 == 65535) {
                    var300 = -1;
                }
                int var301 = var3.method2967();
                class228 var302 = class228.method2391(var301);
                if (var302.field2791) {
                    var302.field2880 = var300;
                    var302.field2881 = var299;
                    class268 var304 = class268.method4160(var300);
                    var302.field2811 = var304.field3573;
                    var302.field2812 = var304.field3593;
                    var302.field2813 = var304.field3577;
                    var302.field2809 = var304.field3578;
                    var302.field2810 = var304.field3612;
                    var302.field2814 = var304.field3574;
                    if (var304.field3591 == 1) {
                        var302.field2867 = 1;
                    } else {
                        var302.field2867 = 2;
                    }
                    if (var302.field2837 > 0) {
                        var302.field2814 = var302.field2814 * 32 / var302.field2837;
                    } else if (var302.field2771 > 0) {
                        var302.field2814 = var302.field2814 * 32 / var302.field2771;
                    }
                    method308(var302);
                } else if (var300 == -1) {
                    var302.field2803 = 0;
                    arg0.field1452 = null;
                    return true;
                } else {
                    class268 var303 = class268.method4160(var300);
                    var302.field2803 = 4;
                    var302.field2804 = var300;
                    var302.field2811 = var303.field3573;
                    var302.field2812 = var303.field3593;
                    var302.field2814 = var303.field3574 * 100 / var299;
                    method308(var302);
                }
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2264 == arg0.field1452) {
                field862 = var3.method3000() * 30;
                field1026 = field1058;
                arg0.field1452 = null;
                return true;
            }
            if (class171.field2309 == arg0.field1452) {
                for (int var305 = 0; var305 < class223.field2723.length; var305++) {
                    if (class223.field2723[var305] != class223.field2722[var305]) {
                        class223.field2723[var305] = class223.field2722[var305];
                        method2693(var305);
                        field989[++field1016 - 1 & 0x1F] = var305;
                    }
                }
                arg0.field1452 = null;
                return true;
            }
            class155.method1339("" + (arg0.field1452 == null ? -1 : arg0.field1452.field2308) + class88.field1285 + (arg0.field1458 == null ? -1 : arg0.field1458.field2308) + class88.field1285 + (arg0.field1459 == null ? -1 : arg0.field1459.field2308) + class88.field1285 + arg0.field1446, (Throwable) null);
            method1679();
        } catch (IOException var315) {
            method74();
        } catch (Exception var316) {
            String var308 = "" + (arg0.field1452 == null ? -1 : arg0.field1452.field2308) + class88.field1285 + (arg0.field1458 == null ? -1 : arg0.field1458.field2308) + class88.field1285 + (arg0.field1459 == null ? -1 : arg0.field1459.field2308) + class88.field1285 + arg0.field1446 + class88.field1285 + (Statics.field556 + Statics.field2088.field1178[0]) + class88.field1285 + (Statics.field895 + Statics.field2088.field1179[0]) + class88.field1285;
            for (int var309 = 0; var309 < arg0.field1446 && var309 < 50; var309++) {
                var308 = var308 + var3.field2512[var309] + class88.field1285;
            }
            class155.method1339(var308, var316);
            method1679();
        }
        return true;
    }

    @ObfuscatedName("bh.gy(Lfa;I)V")
    public static final void method936(class174 arg0) {
        class191 var1 = field889.field1451;
        if (class174.field2431 == arg0) {
            int var2 = var1.method2998();
            int var3 = var1.method2999();
            int var4 = var1.method2989();
            int var5 = (var4 >> 4 & 0x7) + Statics.field559;
            int var6 = (var4 & 0x7) + Statics.field468;
            int var7 = var1.method3194();
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                class205 var8 = field1036[Statics.field235][var5][var6];
                if (var8 != null) {
                    for (class94 var9 = (class94) var8.method3442(); var9 != null; var9 = (class94) var8.method3444()) {
                        if ((var3 & 0x7FFF) == var9.field1383 && var9.field1384 == var7) {
                            var9.field1384 = var2;
                            break;
                        }
                    }
                    method998(var5, var6);
                }
            }
        } else if (class174.field2422 == arg0) {
            int var10 = var1.method2998();
            int var11 = var1.method2962();
            int var12 = (var11 >> 4 & 0x7) + Statics.field559;
            int var13 = (var11 & 0x7) + Statics.field468;
            int var14 = var1.method2962();
            int var15 = var14 >> 2;
            int var16 = var14 & 0x3;
            int var17 = field904[var15];
            if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
                if (var17 == 0) {
                    class142 var18 = Statics.field581.method2501(Statics.field235, var12, var13);
                    if (var18 != null) {
                        int var19 = var18.field2018 >> 14 & 0x7FFF;
                        if (var15 == 2) {
                            var18.field2012 = new class99(var19, 2, var16 + 4, Statics.field235, var12, var13, var10, false, var18.field2012);
                            var18.field2017 = new class99(var19, 2, var16 + 1 & 0x3, Statics.field235, var12, var13, var10, false, var18.field2017);
                        } else {
                            var18.field2012 = new class99(var19, var15, var16, Statics.field235, var12, var13, var10, false, var18.field2012);
                        }
                    }
                }
                if (var17 == 1) {
                    class147 var20 = Statics.field581.method2560(Statics.field235, var12, var13);
                    if (var20 != null) {
                        int var21 = var20.field2059 >> 14 & 0x7FFF;
                        if (var15 == 4 || var15 == 5) {
                            var20.field2057 = new class99(var21, 4, var16, Statics.field235, var12, var13, var10, false, var20.field2057);
                        } else if (var15 == 6) {
                            var20.field2057 = new class99(var21, 4, var16 + 4, Statics.field235, var12, var13, var10, false, var20.field2057);
                        } else if (var15 == 7) {
                            var20.field2057 = new class99(var21, 4, (var16 + 2 & 0x3) + 4, Statics.field235, var12, var13, var10, false, var20.field2057);
                        } else if (var15 == 8) {
                            var20.field2057 = new class99(var21, 4, var16 + 4, Statics.field235, var12, var13, var10, false, var20.field2057);
                            var20.field2058 = new class99(var21, 4, (var16 + 2 & 0x3) + 4, Statics.field235, var12, var13, var10, false, var20.field2058);
                        }
                    }
                }
                if (var17 == 2) {
                    class148 var22 = Statics.field581.method2503(Statics.field235, var12, var13);
                    if (var15 == 11) {
                        var15 = 10;
                    }
                    if (var22 != null) {
                        var22.field2065 = new class99(var22.field2073 >> 14 & 0x7FFF, var15, var16, Statics.field235, var12, var13, var10, false, var22.field2065);
                    }
                }
                if (var17 == 3) {
                    class129 var23 = Statics.field581.method2504(Statics.field235, var12, var13);
                    if (var23 != null) {
                        var23.field1758 = new class99(var23.field1757 >> 14 & 0x7FFF, 22, var16, Statics.field235, var12, var13, var10, false, var23.field1758);
                    }
                }
            }
        } else if (class174.field2429 == arg0) {
            int var24 = var1.method2989();
            int var25 = (var24 >> 4 & 0x7) + Statics.field559;
            int var26 = (var24 & 0x7) + Statics.field468;
            int var27 = var1.method3000();
            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                class205 var28 = field1036[Statics.field235][var25][var26];
                if (var28 != null) {
                    for (class94 var29 = (class94) var28.method3442(); var29 != null; var29 = (class94) var28.method3444()) {
                        if ((var27 & 0x7FFF) == var29.field1383) {
                            var29.method3427();
                            break;
                        }
                    }
                    if (var28.method3442() == null) {
                        field1036[Statics.field235][var25][var26] = null;
                    }
                    method998(var25, var26);
                }
            }
        } else if (class174.field2428 == arg0) {
            int var30 = var1.method3000();
            int var31 = var1.method2962();
            int var32 = (var31 >> 4 & 0x7) + Statics.field559;
            int var33 = (var31 & 0x7) + Statics.field468;
            int var34 = var1.method2999();
            if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
                class94 var35 = new class94();
                var35.field1383 = var30;
                var35.field1384 = var34;
                if (field1036[Statics.field235][var32][var33] == null) {
                    field1036[Statics.field235][var32][var33] = new class205();
                }
                field1036[Statics.field235][var32][var33].method3446(var35);
                method998(var32, var33);
            }
        } else if (class174.field2424 == arg0) {
            int var36 = var1.method2998();
            int var37 = var1.method3194();
            int var38 = var1.method2989();
            int var39 = var1.method2962();
            int var40 = (var39 >> 4 & 0x7) + Statics.field559;
            int var41 = (var39 & 0x7) + Statics.field468;
            if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
                int var42 = var40 * 128 + 64;
                int var43 = var41 * 128 + 64;
                class84 var44 = new class84(var37, Statics.field235, var42, var43, method479(var42, var43, Statics.field235) - var38, var36, field963);
                field887.method3446(var44);
            }
        } else if (class174.field2421 == arg0) {
            int var45 = var1.method2962();
            int var46 = var45 >> 2;
            int var47 = var45 & 0x3;
            int var48 = field904[var46];
            int var49 = var1.method2975();
            int var50 = (var49 >> 4 & 0x7) + Statics.field559;
            int var51 = (var49 & 0x7) + Statics.field468;
            int var52 = var1.method3194();
            if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                method547(Statics.field235, var50, var51, var48, var52, var46, var47, 0, -1);
            }
        } else {
            if (class174.field2425 == arg0) {
                int var53 = var1.method3036();
                int var54 = var1.method3194();
                int var55 = var1.method2962();
                int var56 = var55 >> 4 & 0xF;
                int var57 = var55 & 0x7;
                int var58 = var1.method2962();
                int var59 = (var58 >> 4 & 0x7) + Statics.field559;
                int var60 = (var58 & 0x7) + Statics.field468;
                if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
                    int var61 = var56 + 1;
                    if (Statics.field2088.field1178[0] >= var59 - var61 && Statics.field2088.field1178[0] <= var59 + var61 && Statics.field2088.field1179[0] >= var60 - var61 && Statics.field2088.field1179[0] <= var60 + var61 && field1068 != 0 && var57 > 0 && field1069 < 50) {
                        field1070[field1069] = var54;
                        field1071[field1069] = var57;
                        field1072[field1069] = var53;
                        field1103[field1069] = null;
                        field1073[field1069] = (var59 << 16) + (var60 << 8) + var56;
                        field1069++;
                    }
                }
            }
            if (class174.field2426 == arg0) {
                int var62 = var1.method2989();
                int var63 = var62 >> 2;
                int var64 = var62 & 0x3;
                int var65 = field904[var63];
                int var66 = var1.method3036();
                int var67 = (var66 >> 4 & 0x7) + Statics.field559;
                int var68 = (var66 & 0x7) + Statics.field468;
                if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
                    method547(Statics.field235, var67, var68, var65, -1, var63, var64, 0, -1);
                }
            } else if (class174.field2427 == arg0) {
                int var69 = var1.method3000();
                int var70 = var1.method2975();
                int var71 = (var70 >> 4 & 0x7) + Statics.field559;
                int var72 = (var70 & 0x7) + Statics.field468;
                int var73 = var1.method3036() * 4;
                int var74 = var1.method2989();
                byte var75 = var1.method3138();
                int var76 = var1.method2999();
                int var77 = var1.method2999();
                int var78 = var1.method2989() * 4;
                int var79 = var1.method2965();
                int var80 = var1.method2962();
                byte var81 = var1.method3048();
                int var82 = var71 + var75;
                int var83 = var72 + var81;
                if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104 && var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104 && var77 != 65535) {
                    int var84 = var71 * 128 + 64;
                    int var85 = var72 * 128 + 64;
                    int var86 = var82 * 128 + 64;
                    int var87 = var83 * 128 + 64;
                    class93 var88 = new class93(var77, Statics.field235, var84, var85, method479(var84, var85, Statics.field235) - var73, field963 + var76, field963 + var69, var80, var74, var79, var78);
                    var88.method1585(var86, var87, method479(var86, var87, Statics.field235) - var78, field963 + var76);
                    field961.method3446(var88);
                }
            } else if (class174.field2423 == arg0) {
                int var89 = var1.method2999();
                int var90 = var1.method2999();
                int var91 = var1.method3194();
                int var92 = var1.method2962();
                int var93 = var92 >> 2;
                int var94 = var92 & 0x3;
                int var95 = field904[var93];
                byte var96 = var1.method3048();
                byte var97 = var1.method3048();
                byte var98 = var1.method3029();
                int var99 = var1.method3000();
                byte var100 = var1.method3138();
                int var101 = var1.method2989();
                int var102 = (var101 >> 4 & 0x7) + Statics.field559;
                int var103 = (var101 & 0x7) + Statics.field468;
                class74 var104;
                if (field950 == var91) {
                    var104 = Statics.field2088;
                } else {
                    var104 = field949[var91];
                }
                if (var104 != null) {
                    class267 var105 = class267.method2129(var99);
                    int var106;
                    int var107;
                    if (var94 == 1 || var94 == 3) {
                        var106 = var105.field3526;
                        var107 = var105.field3544;
                    } else {
                        var106 = var105.field3544;
                        var107 = var105.field3526;
                    }
                    int var108 = (var106 >> 1) + var102;
                    int var109 = (var106 + 1 >> 1) + var102;
                    int var110 = (var107 >> 1) + var103;
                    int var111 = (var107 + 1 >> 1) + var103;
                    int[][] var112 = class62.field696[Statics.field235];
                    int var113 = var112[var108][var110] + var112[var109][var110] + var112[var108][var111] + var112[var109][var111] >> 2;
                    int var114 = (var102 << 7) + (var106 << 6);
                    int var115 = (var103 << 7) + (var107 << 6);
                    class133 var116 = var105.method4292(var93, var94, var112, var114, var113, var115);
                    if (var116 != null) {
                        method547(Statics.field235, var102, var103, var95, -1, 0, 0, var90 + 1, var89 + 1);
                        var104.field818 = field963 + var90;
                        var104.field819 = field963 + var89;
                        var104.field823 = var116;
                        var104.field810 = var102 * 128 + var106 * 64;
                        var104.field821 = var103 * 128 + var107 * 64;
                        var104.field831 = var113;
                        if (var98 > var96) {
                            byte var117 = var98;
                            var98 = var96;
                            var96 = var117;
                        }
                        if (var100 > var97) {
                            byte var118 = var100;
                            var100 = var97;
                            var97 = var118;
                        }
                        var104.field824 = var98 + var102;
                        var104.field826 = var96 + var102;
                        var104.field825 = var100 + var103;
                        var104.field829 = var97 + var103;
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.gj(IIIIIIIIIB)V")
    public static final void method547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class77 var9 = null;
        for (class77 var10 = (class77) field960.method3442(); var10 != null; var10 = (class77) field960.method3444()) {
            if (var10.field1119 == arg0 && var10.field1111 == arg1 && var10.field1116 == arg2 && var10.field1121 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class77();
            var9.field1119 = arg0;
            var9.field1121 = arg3;
            var9.field1111 = arg1;
            var9.field1116 = arg2;
            method489(var9);
            field960.method3446(var9);
        }
        var9.field1109 = arg4;
        var9.field1118 = arg5;
        var9.field1117 = arg6;
        var9.field1122 = arg7;
        var9.field1120 = arg8;
    }

    @ObfuscatedName("ay.gb(Lbo;B)V")
    public static final void method489(class77 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1121 == 0) {
            var1 = Statics.field581.method2505(arg0.field1119, arg0.field1111, arg0.field1116);
        }
        if (arg0.field1121 == 1) {
            var1 = Statics.field581.method2506(arg0.field1119, arg0.field1111, arg0.field1116);
        }
        if (arg0.field1121 == 2) {
            var1 = Statics.field581.method2507(arg0.field1119, arg0.field1111, arg0.field1116);
        }
        if (arg0.field1121 == 3) {
            var1 = Statics.field581.method2629(arg0.field1119, arg0.field1111, arg0.field1116);
        }
        if (var1 != 0) {
            int var5 = Statics.field581.method2509(arg0.field1119, arg0.field1111, arg0.field1116, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1113 = var2;
        arg0.field1115 = var3;
        arg0.field1114 = var4;
    }

    @ObfuscatedName("jl.gw(IIIIIIII)V")
    public static final void method4494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field1002 && Statics.field235 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field581.method2505(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field581.method2506(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field581.method2507(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field581.method2629(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field581.method2509(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field581.method2481(arg0, arg2, arg3);
                class267 var15 = class267.method2129(var12);
                if (var15.field3527 != 0) {
                    field1090[arg0].method2839(arg2, arg3, var13, var14, var15.field3528);
                }
            }
            if (arg1 == 1) {
                Statics.field581.method2528(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field581.method2498(arg0, arg2, arg3);
                class267 var16 = class267.method2129(var12);
                if (var16.field3544 + arg2 > 103 || var16.field3544 + arg3 > 103 || var16.field3526 + arg2 > 103 || var16.field3526 + arg3 > 103) {
                    return;
                }
                if (var16.field3527 != 0) {
                    field1090[arg0].method2841(arg2, arg3, var16.field3544, var16.field3526, var14, var16.field3528);
                }
            }
            if (arg1 == 3) {
                Statics.field581.method2553(arg0, arg2, arg3);
                class267 var17 = class267.method2129(var12);
                if (var17.field3527 == 1) {
                    field1090[arg0].method2842(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class62.field711[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class139 var19 = Statics.field581;
        class167 var20 = field1090[arg0];
        class267 var21 = class267.method2129(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field3526;
            var23 = var21.field3544;
        } else {
            var22 = var21.field3544;
            var23 = var21.field3526;
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
        int[][] var28 = class62.field696[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field3529 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field3550 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class141 var34;
            if (var21.field3558 == -1 && var21.field3551 == null) {
                var34 = var21.method4292(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class99(arg4, 22, arg5, var18, arg2, arg3, var21.field3558, true, (class141) null);
            }
            var19.method2485(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field3527 == 1) {
                var20.method2854(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class141 var57;
            if (var21.field3558 == -1 && var21.field3551 == null) {
                var57 = var21.method4292(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class99(arg4, 10, arg5, var18, arg2, arg3, var21.field3558, true, (class141) null);
            }
            if (var57 != null) {
                var19.method2489(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field3527 != 0) {
                var20.method2835(arg2, arg3, var22, var23, var21.field3528);
            }
        } else if (arg6 >= 12) {
            class141 var35;
            if (var21.field3558 == -1 && var21.field3551 == null) {
                var35 = var21.method4292(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class99(arg4, arg6, arg5, var18, arg2, arg3, var21.field3558, true, (class141) null);
            }
            var19.method2489(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field3527 != 0) {
                var20.method2835(arg2, arg3, var22, var23, var21.field3528);
            }
        } else if (arg6 == 0) {
            class141 var36;
            if (var21.field3558 == -1 && var21.field3551 == null) {
                var36 = var21.method4292(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class99(arg4, 0, arg5, var18, arg2, arg3, var21.field3558, true, (class141) null);
            }
            var19.method2487(arg0, arg2, arg3, var29, var36, (class141) null, class62.field702[arg5], 0, var32, var33);
            if (var21.field3527 != 0) {
                var20.method2834(arg2, arg3, arg6, arg5, var21.field3528);
            }
        } else if (arg6 == 1) {
            class141 var37;
            if (var21.field3558 == -1 && var21.field3551 == null) {
                var37 = var21.method4292(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class99(arg4, 1, arg5, var18, arg2, arg3, var21.field3558, true, (class141) null);
            }
            var19.method2487(arg0, arg2, arg3, var29, var37, (class141) null, class62.field704[arg5], 0, var32, var33);
            if (var21.field3527 != 0) {
                var20.method2834(arg2, arg3, arg6, arg5, var21.field3528);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class141 var39;
            class141 var40;
            if (var21.field3558 == -1 && var21.field3551 == null) {
                var39 = var21.method4292(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method4292(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class99(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field3558, true, (class141) null);
                var40 = new class99(arg4, 2, var38, var18, arg2, arg3, var21.field3558, true, (class141) null);
            }
            var19.method2487(arg0, arg2, arg3, var29, var39, var40, class62.field702[arg5], class62.field702[var38], var32, var33);
            if (var21.field3527 != 0) {
                var20.method2834(arg2, arg3, arg6, arg5, var21.field3528);
            }
        } else if (arg6 == 3) {
            class141 var41;
            if (var21.field3558 == -1 && var21.field3551 == null) {
                var41 = var21.method4292(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class99(arg4, 3, arg5, var18, arg2, arg3, var21.field3558, true, (class141) null);
            }
            var19.method2487(arg0, arg2, arg3, var29, var41, (class141) null, class62.field704[arg5], 0, var32, var33);
            if (var21.field3527 != 0) {
                var20.method2834(arg2, arg3, arg6, arg5, var21.field3528);
            }
        } else if (arg6 == 9) {
            class141 var42;
            if (var21.field3558 == -1 && var21.field3551 == null) {
                var42 = var21.method4292(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class99(arg4, arg6, arg5, var18, arg2, arg3, var21.field3558, true, (class141) null);
            }
            var19.method2489(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field3527 != 0) {
                var20.method2835(arg2, arg3, var22, var23, var21.field3528);
            }
        } else if (arg6 == 4) {
            class141 var43;
            if (var21.field3558 == -1 && var21.field3551 == null) {
                var43 = var21.method4292(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class99(arg4, 4, arg5, var18, arg2, arg3, var21.field3558, true, (class141) null);
            }
            var19.method2585(arg0, arg2, arg3, var29, var43, (class141) null, class62.field702[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method2505(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class267.method2129(var45 >> 14 & 0x7FFF).field3518;
            }
            class141 var46;
            if (var21.field3558 == -1 && var21.field3551 == null) {
                var46 = var21.method4292(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class99(arg4, 4, arg5, var18, arg2, arg3, var21.field3558, true, (class141) null);
            }
            var19.method2585(arg0, arg2, arg3, var29, var46, (class141) null, class62.field702[arg5], 0, class62.field705[arg5] * var44, class62.field703[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method2505(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class267.method2129(var48 >> 14 & 0x7FFF).field3518 / 2;
            }
            class141 var49;
            if (var21.field3558 == -1 && var21.field3551 == null) {
                var49 = var21.method4292(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class99(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3558, true, (class141) null);
            }
            var19.method2585(arg0, arg2, arg3, var29, var49, (class141) null, 256, arg5, class62.field706[arg5] * var47, class62.field707[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class141 var51;
            if (var21.field3558 == -1 && var21.field3551 == null) {
                var51 = var21.method4292(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class99(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field3558, true, (class141) null);
            }
            var19.method2585(arg0, arg2, arg3, var29, var51, (class141) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method2505(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class267.method2129(var53 >> 14 & 0x7FFF).field3518 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class141 var55;
            class141 var56;
            if (var21.field3558 == -1 && var21.field3551 == null) {
                var55 = var21.method4292(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method4292(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class99(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3558, true, (class141) null);
                var56 = new class99(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field3558, true, (class141) null);
            }
            var19.method2585(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class62.field706[arg5] * var52, class62.field707[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("bj.gf(III)V")
    public static final void method998(int arg0, int arg1) {
        class205 var2 = field1036[Statics.field235][arg0][arg1];
        if (var2 == null) {
            Statics.field581.method2641(Statics.field235, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class94 var5 = null;
        for (class94 var6 = (class94) var2.method3442(); var6 != null; var6 = (class94) var2.method3444()) {
            class268 var7 = class268.method4160(var6.field1383);
            long var8 = (long) var7.field3581;
            if (var7.field3591 == 1) {
                var8 = (long) (var6.field1384 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field581.method2641(Statics.field235, arg0, arg1);
            return;
        }
        var2.method3460(var5);
        class94 var10 = null;
        class94 var11 = null;
        for (class94 var12 = (class94) var2.method3442(); var12 != null; var12 = (class94) var2.method3444()) {
            if (var5.field1383 != var12.field1383) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1383 != var12.field1383 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field581.method2486(Statics.field235, arg0, arg1, method479(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field235), var5, var13, var10, var11);
    }

    @ObfuscatedName("bv.gx(ZLgy;B)V")
    public static final void method966(boolean arg0, class191 arg1) {
        field968 = 0;
        field1099 = 0;
        method18();
        method579(arg0, arg1);
        method201(arg1);
        for (int var2 = 0; var2 < field968; var2++) {
            int var3 = field952[var2];
            if (field963 != field884[var3].field1172) {
                field884[var3].field1273 = null;
                field884[var3] = null;
            }
        }
        if (field889.field1446 != arg1.field2509) {
            throw new RuntimeException(arg1.field2509 + class88.field1285 + field889.field1446);
        }
        for (int var4 = 0; var4 < field885; var4++) {
            if (field884[field886[var4]] == null) {
                throw new RuntimeException(var4 + class88.field1285 + field885);
            }
        }
    }

    @ObfuscatedName("z.gq(I)V")
    public static final void method18() {
        class191 var0 = field889.field1451;
        var0.method3244();
        int var1 = var0.method3243(8);
        if (var1 < field885) {
            for (int var2 = var1; var2 < field885; var2++) {
                field952[++field968 - 1] = field886[var2];
            }
        }
        if (var1 > field885) {
            throw new RuntimeException("");
        }
        field885 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field886[var3];
            class86 var5 = field884[var4];
            int var6 = var0.method3243(1);
            if (var6 == 0) {
                field886[++field885 - 1] = var4;
                var5.field1172 = field963;
            } else {
                int var7 = var0.method3243(2);
                if (var7 == 0) {
                    field886[++field885 - 1] = var4;
                    var5.field1172 = field963;
                    field888[++field1099 - 1] = var4;
                } else if (var7 == 1) {
                    field886[++field885 - 1] = var4;
                    var5.field1172 = field963;
                    int var8 = var0.method3243(3);
                    var5.method1505(var8, (byte) 1);
                    int var9 = var0.method3243(1);
                    if (var9 == 1) {
                        field888[++field1099 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field886[++field885 - 1] = var4;
                    var5.field1172 = field963;
                    int var10 = var0.method3243(3);
                    var5.method1505(var10, (byte) 2);
                    int var11 = var0.method3243(3);
                    var5.method1505(var11, (byte) 2);
                    int var12 = var0.method3243(1);
                    if (var12 == 1) {
                        field888[++field1099 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field952[++field968 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("ae.gr(ZLgy;B)V")
    public static final void method579(boolean arg0, class191 arg1) {
        while (true) {
            if (arg1.method3245(field889.field1446) >= 27) {
                int var2 = arg1.method3243(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field884[var2] == null) {
                        field884[var2] = new class86();
                        var3 = true;
                    }
                    class86 var4 = field884[var2];
                    field886[++field885 - 1] = var2;
                    var4.field1172 = field963;
                    int var5;
                    if (arg0) {
                        var5 = arg1.method3243(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = arg1.method3243(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = arg1.method3243(1);
                    int var7;
                    if (arg0) {
                        var7 = arg1.method3243(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = arg1.method3243(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    var4.field1273 = class270.method1336(arg1.method3243(14));
                    int var8 = field957[arg1.method3243(3)];
                    if (var3) {
                        var4.field1174 = var4.field1173 = var8;
                    }
                    int var9 = arg1.method3243(1);
                    if (var9 == 1) {
                        field888[++field1099 - 1] = var2;
                    }
                    var4.field1127 = var4.field1273.field3621;
                    var4.field1176 = var4.field1273.field3649;
                    if (var4.field1176 == 0) {
                        var4.field1173 = 0;
                    }
                    var4.field1140 = var4.field1273.field3632;
                    var4.field1132 = var4.field1273.field3633;
                    var4.field1133 = var4.field1273.field3634;
                    var4.field1124 = var4.field1273.field3635;
                    var4.field1128 = var4.field1273.field3629;
                    var4.field1129 = var4.field1273.field3645;
                    var4.field1177 = var4.field1273.field3631;
                    var4.method1506(Statics.field2088.field1178[0] + var7, Statics.field2088.field1179[0] + var5, var6 == 1);
                    continue;
                }
            }
            arg1.method3263();
            return;
        }
    }

    @ObfuscatedName("ad.gm(Lgy;I)V")
    public static final void method201(class191 arg0) {
        for (int var1 = 0; var1 < field1099; var1++) {
            int var2 = field888[var1];
            class86 var3 = field884[var2];
            int var4 = arg0.method2962();
            if ((var4 & 0x4) != 0) {
                var3.field1160 = arg0.method3194();
                int var5 = arg0.method2967();
                var3.field1164 = var5 >> 16;
                var3.field1163 = (var5 & 0xFFFF) + field963;
                var3.field1161 = 0;
                var3.field1144 = 0;
                if (var3.field1163 > field963) {
                    var3.field1161 = -1;
                }
                if (var3.field1160 == 65535) {
                    var3.field1160 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field1149 = arg0.method2998();
                if (var3.field1149 == 65535) {
                    var3.field1149 = -1;
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field1273 = class270.method1336(arg0.method2998());
                var3.field1127 = var3.field1273.field3621;
                var3.field1176 = var3.field1273.field3649;
                var3.field1140 = var3.field1273.field3632;
                var3.field1132 = var3.field1273.field3633;
                var3.field1133 = var3.field1273.field3634;
                var3.field1124 = var3.field1273.field3635;
                var3.field1128 = var3.field1273.field3629;
                var3.field1129 = var3.field1273.field3645;
                var3.field1177 = var3.field1273.field3631;
            }
            if ((var4 & 0x2) != 0) {
                int var6 = arg0.method2962();
                if (var6 > 0) {
                    for (int var7 = 0; var7 < var6; var7++) {
                        int var8 = -1;
                        int var9 = -1;
                        int var10 = -1;
                        int var11 = arg0.method3137();
                        if (var11 == 32767) {
                            var11 = arg0.method3137();
                            var9 = arg0.method3137();
                            var8 = arg0.method3137();
                            var10 = arg0.method3137();
                        } else if (var11 == 32766) {
                            var11 = -1;
                        } else {
                            var9 = arg0.method3137();
                        }
                        int var12 = arg0.method3137();
                        var3.method1341(var11, var9, var8, var10, field963, var12);
                    }
                }
                int var13 = arg0.method3036();
                if (var13 > 0) {
                    for (int var14 = 0; var14 < var13; var14++) {
                        int var15 = arg0.method3137();
                        int var16 = arg0.method3137();
                        if (var16 == 32767) {
                            var3.method1345(var15);
                        } else {
                            int var17 = arg0.method3137();
                            int var18 = arg0.method3036();
                            int var19 = var16 > 0 ? arg0.method2962() : var18;
                            var3.method1344(var15, field963, var16, var17, var18, var19);
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                int var20 = arg0.method3000();
                int var21 = arg0.method2999();
                int var22 = var3.field1182 - (var20 - Statics.field556 - Statics.field556) * 64;
                int var23 = var3.field1143 - (var21 - Statics.field895 - Statics.field895) * 64;
                if (var22 != 0 || var23 != 0) {
                    var3.field1151 = (int) (Math.atan2((double) var22, (double) var23) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var24 = arg0.method3194();
                if (var24 == 65535) {
                    var24 = -1;
                }
                int var25 = arg0.method2962();
                if (var3.field1155 == var24 && var24 != -1) {
                    int var26 = class272.method3881(var24).field3681;
                    if (var26 == 1) {
                        var3.field1169 = 0;
                        var3.field1157 = 0;
                        var3.field1146 = var25;
                        var3.field1125 = 0;
                    }
                    if (var26 == 2) {
                        var3.field1125 = 0;
                    }
                } else if (var24 == -1 || var3.field1155 == -1 || class272.method3881(var24).field3674 >= class272.method3881(var3.field1155).field3674) {
                    var3.field1155 = var24;
                    var3.field1169 = 0;
                    var3.field1157 = 0;
                    var3.field1146 = var25;
                    var3.field1125 = 0;
                    var3.field1156 = var3.field1136;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field1135 = arg0.method3168();
                var3.field1158 = 100;
            }
        }
    }

    @ObfuscatedName("af.ga(B)V")
    public static void method517() {
        field938 = 0;
        field972 = false;
    }

    @ObfuscatedName("ba.gu(S)V")
    public static void method1003() {
        method517();
        field973[0] = class237.field3198;
        field974[0] = "";
        field918[0] = 1006;
        field975[0] = false;
        field938 = 1;
    }

    @ObfuscatedName("ax.gp(IIIIB)V")
    public static final void method269(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1032; var4++) {
            if (field1039[var4] + field1037[var4] > arg0 && field1037[var4] < arg0 + arg2 && field978[var4] + field942[var4] > arg1 && field942[var4] < arg1 + arg3) {
                field1034[var4] = true;
            }
        }
    }

    @ObfuscatedName("de.go(IIIII)V")
    public static final void method1907(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1032; var4++) {
            if (field1039[var4] + field1037[var4] > arg0 && field1037[var4] < arg0 + arg2 && field978[var4] + field942[var4] > arg1 && field942[var4] < arg1 + arg3) {
                field1020[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.gn(B)V")
    public final void method1269() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field938 - 1; var2++) {
                if (field918[var2] < 1000 && field918[var2 + 1] > 1000) {
                    String var3 = field974[var2];
                    field974[var2] = field974[var2 + 1];
                    field974[var2 + 1] = var3;
                    String var4 = field973[var2];
                    field973[var2] = field973[var2 + 1];
                    field973[var2 + 1] = var4;
                    int var5 = field918[var2];
                    field918[var2] = field918[var2 + 1];
                    field918[var2 + 1] = var5;
                    int var6 = field969[var2];
                    field969[var2] = field969[var2 + 1];
                    field969[var2 + 1] = var6;
                    int var7 = field970[var2];
                    field970[var2] = field970[var2 + 1];
                    field970[var2 + 1] = var7;
                    int var8 = field855[var2];
                    field855[var2] = field855[var2 + 1];
                    field855[var2 + 1] = var8;
                    boolean var9 = field975[var2];
                    field975[var2] = field975[var2 + 1];
                    field975[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field507 != null || field1065 != null) {
            return;
        }
        int var27;
        int var30;
        int var31;
        label213: {
            int var10 = class60.field679;
            if (field972) {
                if (var10 != 1 && (Statics.field456 || var10 != 4)) {
                    int var11 = class60.field680;
                    int var12 = class60.field683 * -469125321;
                    if (var11 < Statics.field409 - 10 || var11 > Statics.field409 + Statics.field1385 + 10 || var12 < Statics.field2410 - 10 || var12 > Statics.field342 + Statics.field2410 + 10) {
                        field972 = false;
                        method269(Statics.field409, Statics.field2410, Statics.field1385, Statics.field342);
                    }
                }
                if (var10 == 1 || !Statics.field456 && var10 == 4) {
                    int var13 = Statics.field409;
                    int var14 = Statics.field2410;
                    int var15 = Statics.field1385;
                    int var16 = class60.field665;
                    int var17 = class60.field681;
                    int var18 = -1;
                    for (int var19 = 0; var19 < field938; var19++) {
                        int var20 = (field938 - 1 - var19) * 15 + var14 + 31;
                        if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                            var18 = var19;
                        }
                    }
                    if (var18 != -1 && var18 >= 0) {
                        int var21 = field969[var18];
                        int var22 = field970[var18];
                        int var23 = field918[var18];
                        int var24 = field855[var18];
                        String var25 = field973[var18];
                        String var26 = field974[var18];
                        method202(var21, var22, var23, var24, var25, var26, class60.field665, class60.field681);
                    }
                    field972 = false;
                    method269(Statics.field409, Statics.field2410, Statics.field1385, Statics.field342);
                }
            } else {
                var27 = field938 - 1;
                if ((var10 == 1 || !Statics.field456 && var10 == 4) && var27 >= 0) {
                    int var29 = field918[var27];
                    if (var29 == 39 || var29 == 40 || var29 == 41 || var29 == 42 || var29 == 43 || var29 == 33 || var29 == 34 || var29 == 35 || var29 == 36 || var29 == 37 || var29 == 38 || var29 == 1005) {
                        var30 = field969[var27];
                        var31 = field970[var27];
                        class228 var32 = class228.method2391(var31);
                        if (class229.method3793(method464(var32))) {
                            break label213;
                        }
                        int var33 = method464(var32);
                        boolean var34 = (var33 >> 29 & 0x1) != 0;
                        if (var34) {
                            break label213;
                        }
                    }
                }
                if ((var10 == 1 || !Statics.field456 && var10 == 4) && this.method1032()) {
                    var10 = 2;
                }
                if ((var10 == 1 || !Statics.field456 && var10 == 4) && field938 > 0 && var27 >= 0) {
                    int var35 = field969[var27];
                    int var36 = field970[var27];
                    int var37 = field918[var27];
                    int var38 = field855[var27];
                    String var39 = field973[var27];
                    String var40 = field974[var27];
                    method202(var35, var36, var37, var38, var39, var40, class60.field665, class60.field681);
                }
                if (var10 == 2 && field938 > 0) {
                    this.method1033(class60.field665, class60.field681);
                }
            }
            return;
        }
        if (Statics.field507 != null && !field946 && field938 > 0 && !this.method1032()) {
            method550(field858, field1040);
        }
        field946 = false;
        field1083 = 0;
        if (Statics.field507 != null) {
            method308(Statics.field507);
        }
        Statics.field507 = class228.method2391(var31);
        field1074 = var30;
        field858 = class60.field665;
        field1040 = class60.field681;
        if (var27 >= 0) {
            Statics.field1112 = new class89();
            Statics.field1112.field1295 = field969[var27];
            Statics.field1112.field1294 = field970[var27];
            Statics.field1112.field1296 = field918[var27];
            Statics.field1112.field1297 = field855[var27];
            Statics.field1112.field1298 = field973[var27];
        }
        method308(Statics.field507);
    }

    @ObfuscatedName("client.gl(I)Z")
    public final boolean method1032() {
        int var1 = field938 - 1;
        if (field938 > 2) {
            if (field966 == 1 && !field975[var1]) {
                return true;
            }
            boolean var3;
            if (var1 < 0) {
                var3 = false;
            } else {
                int var4 = field918[var1];
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

    @ObfuscatedName("client.gi(III)V")
    public final void method1033(int arg0, int arg1) {
        int var3 = Statics.field745.method4509(class237.field3112);
        for (int var4 = 0; var4 < field938; var4++) {
            int var5 = Statics.field745.method4509(method19(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field938 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field2446) {
            var7 = Statics.field2446 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field1897) {
            var8 = Statics.field1897 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field581.method2618(Statics.field235, arg0, arg1, false);
        field972 = true;
        Statics.field409 = var7;
        Statics.field2410 = var8;
        Statics.field1385 = var3;
        Statics.field342 = field938 * 15 + 22;
    }

    @ObfuscatedName("k.gv(Lcw;III)V")
    public static final void method7(class89 arg0, int arg1, int arg2) {
        method202(arg0.field1295, arg0.field1294, arg0.field1296, arg0.field1297, arg0.field1298, arg0.field1298, arg1, arg2);
    }

    @ObfuscatedName("ad.gc(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method202(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 31) {
            class175 var8 = class175.method3893(class172.field2321, field889.field1450);
            var8.field2434.method2947(arg0);
            var8.field2434.method2997(Statics.field558);
            var8.field2434.method2949(arg1);
            var8.field2434.method2949(Statics.field305);
            var8.field2434.method3131(arg3);
            var8.field2434.method2944(Statics.field475);
            field889.method1706(var8);
            field856 = 0;
            Statics.field743 = class228.method2391(arg1);
            field941 = arg0;
        }
        if (arg2 == 24) {
            class228 var9 = class228.method2391(arg1);
            boolean var10 = true;
            if (var9.field2764 > 0) {
                var10 = method666(var9);
            }
            if (var10) {
                class175 var11 = class175.method3893(class172.field2337, field889.field1450);
                var11.field2434.method2949(arg1);
                field889.method1706(var11);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class228 var12 = class228.method2202(arg1, arg0);
            if (var12 != null) {
                int var13 = var12.field2880;
                class228 var14 = class228.method2202(arg1, arg0);
                if (var14 != null) {
                    if (var14.field2860 != null) {
                        class69 var15 = new class69();
                        var15.field771 = var14;
                        var15.field774 = arg3;
                        var15.field778 = arg5;
                        var15.field775 = var14.field2860;
                        class83.method2139(var15);
                    }
                    boolean var16 = true;
                    if (var14.field2764 > 0) {
                        var16 = method666(var14);
                    }
                    if (var16) {
                        int var17 = method464(var14);
                        int var18 = arg3 - 1;
                        boolean var19 = (var17 >> var18 + 1 & 0x1) != 0;
                        if (var19) {
                            if (arg3 == 1) {
                                class175 var20 = class175.method3893(class172.field2368, field889.field1450);
                                var20.field2434.method2949(arg1);
                                var20.field2434.method2944(arg0);
                                var20.field2434.method2944(var13);
                                field889.method1706(var20);
                            }
                            if (arg3 == 2) {
                                class175 var21 = class175.method3893(class172.field2326, field889.field1450);
                                var21.field2434.method2949(arg1);
                                var21.field2434.method2944(arg0);
                                var21.field2434.method2944(var13);
                                field889.method1706(var21);
                            }
                            if (arg3 == 3) {
                                class175 var22 = class175.method3893(class172.field2405, field889.field1450);
                                var22.field2434.method2949(arg1);
                                var22.field2434.method2944(arg0);
                                var22.field2434.method2944(var13);
                                field889.method1706(var22);
                            }
                            if (arg3 == 4) {
                                class175 var23 = class175.method3893(class172.field2407, field889.field1450);
                                var23.field2434.method2949(arg1);
                                var23.field2434.method2944(arg0);
                                var23.field2434.method2944(var13);
                                field889.method1706(var23);
                            }
                            if (arg3 == 5) {
                                class175 var24 = class175.method3893(class172.field2332, field889.field1450);
                                var24.field2434.method2949(arg1);
                                var24.field2434.method2944(arg0);
                                var24.field2434.method2944(var13);
                                field889.method1706(var24);
                            }
                            if (arg3 == 6) {
                                class175 var25 = class175.method3893(class172.field2401, field889.field1450);
                                var25.field2434.method2949(arg1);
                                var25.field2434.method2944(arg0);
                                var25.field2434.method2944(var13);
                                field889.method1706(var25);
                            }
                            if (arg3 == 7) {
                                class175 var26 = class175.method3893(class172.field2372, field889.field1450);
                                var26.field2434.method2949(arg1);
                                var26.field2434.method2944(arg0);
                                var26.field2434.method2944(var13);
                                field889.method1706(var26);
                            }
                            if (arg3 == 8) {
                                class175 var27 = class175.method3893(class172.field2380, field889.field1450);
                                var27.field2434.method2949(arg1);
                                var27.field2434.method2944(arg0);
                                var27.field2434.method2944(var13);
                                field889.method1706(var27);
                            }
                            if (arg3 == 9) {
                                class175 var28 = class175.method3893(class172.field2328, field889.field1450);
                                var28.field2434.method2949(arg1);
                                var28.field2434.method2944(arg0);
                                var28.field2434.method2944(var13);
                                field889.method1706(var28);
                            }
                            if (arg3 == 10) {
                                class175 var29 = class175.method3893(class172.field2320, field889.field1450);
                                var29.field2434.method2949(arg1);
                                var29.field2434.method2944(arg0);
                                var29.field2434.method2944(var13);
                                field889.method1706(var29);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 16) {
            field1004 = arg6;
            field937 = arg7;
            field939 = 2;
            field1093 = 0;
            field1061 = arg0;
            field1062 = arg1;
            class175 var30 = class175.method3893(class172.field2384, field889.field1450);
            var30.field2434.method2988(class51.field594[82] ? 1 : 0);
            var30.field2434.method3007(Statics.field305);
            var30.field2434.method2944(Statics.field558);
            var30.field2434.method2997(Statics.field556 + arg0);
            var30.field2434.method2944(arg3);
            var30.field2434.method2947(Statics.field895 + arg1);
            var30.field2434.method2947(Statics.field475);
            field889.method1706(var30);
        }
        if (arg2 == 3) {
            field1004 = arg6;
            field937 = arg7;
            field939 = 2;
            field1093 = 0;
            field1061 = arg0;
            field1062 = arg1;
            class175 var31 = class175.method3893(class172.field2339, field889.field1450);
            var31.field2434.method2997(Statics.field556 + arg0);
            var31.field2434.method2997(Statics.field895 + arg1);
            var31.field2434.method2947(arg3 >> 14 & 0x7FFF);
            var31.field2434.method2987(class51.field594[82] ? 1 : 0);
            field889.method1706(var31);
        }
        if (arg2 == 1001) {
            field1004 = arg6;
            field937 = arg7;
            field939 = 2;
            field1093 = 0;
            field1061 = arg0;
            field1062 = arg1;
            class175 var32 = class175.method3893(class172.field2352, field889.field1450);
            var32.field2434.method3131(arg3 >> 14 & 0x7FFF);
            var32.field2434.method3131(Statics.field556 + arg0);
            var32.field2434.method2986(class51.field594[82] ? 1 : 0);
            var32.field2434.method2944(Statics.field895 + arg1);
            field889.method1706(var32);
        }
        if (arg2 == 42) {
            class175 var33 = class175.method3893(class172.field2385, field889.field1450);
            var33.field2434.method2944(arg3);
            var33.field2434.method2949(arg1);
            var33.field2434.method2947(arg0);
            field889.method1706(var33);
            field856 = 0;
            Statics.field743 = class228.method2391(arg1);
            field941 = arg0;
        }
        if (arg2 == 47) {
            class74 var34 = field949[arg3];
            if (var34 != null) {
                field1004 = arg6;
                field937 = arg7;
                field939 = 2;
                field1093 = 0;
                field1061 = arg0;
                field1062 = arg1;
                class175 var35 = class175.method3893(class172.field2360, field889.field1450);
                var35.field2434.method2988(class51.field594[82] ? 1 : 0);
                var35.field2434.method2947(arg3);
                field889.method1706(var35);
            }
        }
        if (arg2 == 18) {
            field1004 = arg6;
            field937 = arg7;
            field939 = 2;
            field1093 = 0;
            field1061 = arg0;
            field1062 = arg1;
            class175 var36 = class175.method3893(class172.field2323, field889.field1450);
            var36.field2434.method2947(Statics.field895 + arg1);
            var36.field2434.method2947(Statics.field556 + arg0);
            var36.field2434.method2947(arg3);
            var36.field2434.method2987(class51.field594[82] ? 1 : 0);
            field889.method1706(var36);
        }
        if (arg2 == 34) {
            class175 var37 = class175.method3893(class172.field2319, field889.field1450);
            var37.field2434.method2997(arg3);
            var37.field2434.method2947(arg0);
            var37.field2434.method2949(arg1);
            field889.method1706(var37);
            field856 = 0;
            Statics.field743 = class228.method2391(arg1);
            field941 = arg0;
        }
        if (arg2 == 50) {
            class74 var38 = field949[arg3];
            if (var38 != null) {
                field1004 = arg6;
                field937 = arg7;
                field939 = 2;
                field1093 = 0;
                field1061 = arg0;
                field1062 = arg1;
                class175 var39 = class175.method3893(class172.field2392, field889.field1450);
                var39.field2434.method2988(class51.field594[82] ? 1 : 0);
                var39.field2434.method2947(arg3);
                field889.method1706(var39);
            }
        }
        if (arg2 == 29) {
            class175 var40 = class175.method3893(class172.field2337, field889.field1450);
            var40.field2434.method2949(arg1);
            field889.method1706(var40);
            class228 var41 = class228.method2391(arg1);
            if (var41.field2872 != null && var41.field2872[0][0] == 5) {
                int var42 = var41.field2872[0][1];
                if (class223.field2723[var42] != var41.field2838[0]) {
                    class223.field2723[var42] = var41.field2838[0];
                    method2693(var42);
                }
            }
        }
        if (arg2 == 9) {
            class86 var43 = field884[arg3];
            if (var43 != null) {
                field1004 = arg6;
                field937 = arg7;
                field939 = 2;
                field1093 = 0;
                field1061 = arg0;
                field1062 = arg1;
                class175 var44 = class175.method3893(class172.field2387, field889.field1450);
                var44.field2434.method2947(arg3);
                var44.field2434.method2988(class51.field594[82] ? 1 : 0);
                field889.method1706(var44);
            }
        }
        if (arg2 == 7) {
            class86 var45 = field884[arg3];
            if (var45 != null) {
                field1004 = arg6;
                field937 = arg7;
                field939 = 2;
                field1093 = 0;
                field1061 = arg0;
                field1062 = arg1;
                class175 var46 = class175.method3893(class172.field2349, field889.field1450);
                var46.field2434.method2947(Statics.field558);
                var46.field2434.method3131(arg3);
                var46.field2434.method2946(class51.field594[82] ? 1 : 0);
                var46.field2434.method2947(Statics.field475);
                var46.field2434.method2949(Statics.field305);
                field889.method1706(var46);
            }
        }
        if (arg2 == 20) {
            field1004 = arg6;
            field937 = arg7;
            field939 = 2;
            field1093 = 0;
            field1061 = arg0;
            field1062 = arg1;
            class175 var47 = class175.method3893(class172.field2406, field889.field1450);
            var47.field2434.method3131(Statics.field895 + arg1);
            var47.field2434.method2987(class51.field594[82] ? 1 : 0);
            var47.field2434.method2997(Statics.field556 + arg0);
            var47.field2434.method3131(arg3);
            field889.method1706(var47);
        }
        if (arg2 == 1002) {
            field1004 = arg6;
            field937 = arg7;
            field939 = 2;
            field1093 = 0;
            class175 var48 = class175.method3893(class172.field2391, field889.field1450);
            var48.field2434.method2944(arg3 >> 14 & 0x7FFF);
            field889.method1706(var48);
        }
        if (arg2 == 1003) {
            field1004 = arg6;
            field937 = arg7;
            field939 = 2;
            field1093 = 0;
            class86 var49 = field884[arg3];
            if (var49 != null) {
                class270 var50 = var49.field1273;
                if (var50.field3650 != null) {
                    var50 = var50.method4414();
                }
                if (var50 != null) {
                    class175 var51 = class175.method3893(class172.field2344, field889.field1450);
                    var51.field2434.method2944(var50.field3622);
                    field889.method1706(var51);
                }
            }
        }
        if (arg2 == 41) {
            class175 var52 = class175.method3893(class172.field2327, field889.field1450);
            var52.field2434.method3131(arg0);
            var52.field2434.method2944(arg3);
            var52.field2434.method3012(arg1);
            field889.method1706(var52);
            field856 = 0;
            Statics.field743 = class228.method2391(arg1);
            field941 = arg0;
        }
        if (arg2 == 22) {
            field1004 = arg6;
            field937 = arg7;
            field939 = 2;
            field1093 = 0;
            field1061 = arg0;
            field1062 = arg1;
            class175 var53 = class175.method3893(class172.field2404, field889.field1450);
            var53.field2434.method2944(Statics.field556 + arg0);
            var53.field2434.method2988(class51.field594[82] ? 1 : 0);
            var53.field2434.method2997(arg3);
            var53.field2434.method2944(Statics.field895 + arg1);
            field889.method1706(var53);
        }
        if (arg2 == 10) {
            class86 var54 = field884[arg3];
            if (var54 != null) {
                field1004 = arg6;
                field937 = arg7;
                field939 = 2;
                field1093 = 0;
                field1061 = arg0;
                field1062 = arg1;
                class175 var55 = class175.method3893(class172.field2345, field889.field1450);
                var55.field2434.method2947(arg3);
                var55.field2434.method2986(class51.field594[82] ? 1 : 0);
                field889.method1706(var55);
            }
        }
        if (arg2 == 36) {
            class175 var56 = class175.method3893(class172.field2390, field889.field1450);
            var56.field2434.method2997(arg3);
            var56.field2434.method3007(arg1);
            var56.field2434.method2947(arg0);
            field889.method1706(var56);
            field856 = 0;
            Statics.field743 = class228.method2391(arg1);
            field941 = arg0;
        }
        if (arg2 == 46) {
            class74 var57 = field949[arg3];
            if (var57 != null) {
                field1004 = arg6;
                field937 = arg7;
                field939 = 2;
                field1093 = 0;
                field1061 = arg0;
                field1062 = arg1;
                class175 var58 = class175.method3893(class172.field2336, field889.field1450);
                var58.field2434.method2947(arg3);
                var58.field2434.method2987(class51.field594[82] ? 1 : 0);
                field889.method1706(var58);
            }
        }
        if (arg2 == 23) {
            if (field972) {
                Statics.field581.method2517();
            } else {
                Statics.field581.method2618(Statics.field235, arg0, arg1, true);
            }
        }
        if (arg2 == 1004) {
            field1004 = arg6;
            field937 = arg7;
            field939 = 2;
            field1093 = 0;
            class175 var59 = class175.method3893(class172.field2403, field889.field1450);
            var59.field2434.method3131(arg3);
            field889.method1706(var59);
        }
        if (arg2 == 14) {
            class74 var60 = field949[arg3];
            if (var60 != null) {
                field1004 = arg6;
                field937 = arg7;
                field939 = 2;
                field1093 = 0;
                field1061 = arg0;
                field1062 = arg1;
                class175 var61 = class175.method3893(class172.field2324, field889.field1450);
                var61.field2434.method2949(Statics.field305);
                var61.field2434.method2946(class51.field594[82] ? 1 : 0);
                var61.field2434.method2944(Statics.field558);
                var61.field2434.method2944(arg3);
                var61.field2434.method2944(Statics.field475);
                field889.method1706(var61);
            }
        }
        if (arg2 == 40) {
            class175 var62 = class175.method3893(class172.field2363, field889.field1450);
            var62.field2434.method3131(arg0);
            var62.field2434.method3012(arg1);
            var62.field2434.method2947(arg3);
            field889.method1706(var62);
            field856 = 0;
            Statics.field743 = class228.method2391(arg1);
            field941 = arg0;
        }
        if (arg2 == 5) {
            field1004 = arg6;
            field937 = arg7;
            field939 = 2;
            field1093 = 0;
            field1061 = arg0;
            field1062 = arg1;
            class175 var63 = class175.method3893(class172.field2400, field889.field1450);
            var63.field2434.method3131(arg3 >> 14 & 0x7FFF);
            var63.field2434.method2944(Statics.field556 + arg0);
            var63.field2434.method2988(class51.field594[82] ? 1 : 0);
            var63.field2434.method3131(Statics.field895 + arg1);
            field889.method1706(var63);
        }
        if (arg2 == 17) {
            field1004 = arg6;
            field937 = arg7;
            field939 = 2;
            field1093 = 0;
            field1061 = arg0;
            field1062 = arg1;
            class175 var64 = class175.method3893(class172.field2378, field889.field1450);
            var64.field2434.method3005(Statics.field3298);
            var64.field2434.method3131(Statics.field556 + arg0);
            var64.field2434.method2988(class51.field594[82] ? 1 : 0);
            var64.field2434.method3131(field985);
            var64.field2434.method3131(arg3);
            var64.field2434.method3131(Statics.field895 + arg1);
            field889.method1706(var64);
        }
        if (arg2 == 26) {
            method3848();
        }
        if (arg2 == 33) {
            class175 var65 = class175.method3893(class172.field2314, field889.field1450);
            var65.field2434.method3012(arg1);
            var65.field2434.method2947(arg3);
            var65.field2434.method3131(arg0);
            field889.method1706(var65);
            field856 = 0;
            Statics.field743 = class228.method2391(arg1);
            field941 = arg0;
        }
        if (arg2 == 28) {
            class175 var66 = class175.method3893(class172.field2337, field889.field1450);
            var66.field2434.method2949(arg1);
            field889.method1706(var66);
            class228 var67 = class228.method2391(arg1);
            if (var67.field2872 != null && var67.field2872[0][0] == 5) {
                int var68 = var67.field2872[0][1];
                class223.field2723[var68] = 1 - class223.field2723[var68];
                method2693(var68);
            }
        }
        if (arg2 == 45) {
            class74 var69 = field949[arg3];
            if (var69 != null) {
                field1004 = arg6;
                field937 = arg7;
                field939 = 2;
                field1093 = 0;
                field1061 = arg0;
                field1062 = arg1;
                class175 var70 = class175.method3893(class172.field2330, field889.field1450);
                var70.field2434.method2988(class51.field594[82] ? 1 : 0);
                var70.field2434.method2947(arg3);
                field889.method1706(var70);
            }
        }
        if (arg2 == 12) {
            class86 var71 = field884[arg3];
            if (var71 != null) {
                field1004 = arg6;
                field937 = arg7;
                field939 = 2;
                field1093 = 0;
                field1061 = arg0;
                field1062 = arg1;
                class175 var72 = class175.method3893(class172.field2396, field889.field1450);
                var72.field2434.method3131(arg3);
                var72.field2434.method2946(class51.field594[82] ? 1 : 0);
                field889.method1706(var72);
            }
        }
        if (arg2 == 30 && field959 == null) {
            class175 var73 = class175.method3893(class172.field2325, field889.field1450);
            var73.field2434.method3005(arg1);
            var73.field2434.method2997(arg0);
            field889.method1706(var73);
            field959 = class228.method2202(arg1, arg0);
            method308(field959);
        }
        if (arg2 == 32) {
            class175 var74 = class175.method3893(class172.field2315, field889.field1450);
            var74.field2434.method2944(field985);
            var74.field2434.method3007(arg1);
            var74.field2434.method2944(arg3);
            var74.field2434.method2947(arg0);
            var74.field2434.method3007(Statics.field3298);
            field889.method1706(var74);
            field856 = 0;
            Statics.field743 = class228.method2391(arg1);
            field941 = arg0;
        }
        if (arg2 == 15) {
            class74 var75 = field949[arg3];
            if (var75 != null) {
                field1004 = arg6;
                field937 = arg7;
                field939 = 2;
                field1093 = 0;
                field1061 = arg0;
                field1062 = arg1;
                class175 var76 = class175.method3893(class172.field2312, field889.field1450);
                var76.field2434.method3012(Statics.field3298);
                var76.field2434.method2997(arg3);
                var76.field2434.method2944(field985);
                var76.field2434.method2946(class51.field594[82] ? 1 : 0);
                field889.method1706(var76);
            }
        }
        if (arg2 == 13) {
            class86 var77 = field884[arg3];
            if (var77 != null) {
                field1004 = arg6;
                field937 = arg7;
                field939 = 2;
                field1093 = 0;
                field1061 = arg0;
                field1062 = arg1;
                class175 var78 = class175.method3893(class172.field2382, field889.field1450);
                var78.field2434.method2986(class51.field594[82] ? 1 : 0);
                var78.field2434.method3131(arg3);
                field889.method1706(var78);
            }
        }
        if (arg2 == 19) {
            field1004 = arg6;
            field937 = arg7;
            field939 = 2;
            field1093 = 0;
            field1061 = arg0;
            field1062 = arg1;
            class175 var79 = class175.method3893(class172.field2371, field889.field1450);
            var79.field2434.method2944(Statics.field556 + arg0);
            var79.field2434.method2997(Statics.field895 + arg1);
            var79.field2434.method2944(arg3);
            var79.field2434.method2988(class51.field594[82] ? 1 : 0);
            field889.method1706(var79);
        }
        if (arg2 == 6) {
            field1004 = arg6;
            field937 = arg7;
            field939 = 2;
            field1093 = 0;
            field1061 = arg0;
            field1062 = arg1;
            class175 var80 = class175.method3893(class172.field2393, field889.field1450);
            var80.field2434.method3131(Statics.field895 + arg1);
            var80.field2434.method3131(arg3 >> 14 & 0x7FFF);
            var80.field2434.method2988(class51.field594[82] ? 1 : 0);
            var80.field2434.method2997(Statics.field556 + arg0);
            field889.method1706(var80);
        }
        if (arg2 == 2) {
            field1004 = arg6;
            field937 = arg7;
            field939 = 2;
            field1093 = 0;
            field1061 = arg0;
            field1062 = arg1;
            class175 var81 = class175.method3893(class172.field2375, field889.field1450);
            var81.field2434.method3005(Statics.field3298);
            var81.field2434.method3131(Statics.field895 + arg1);
            var81.field2434.method2947(arg3 >> 14 & 0x7FFF);
            var81.field2434.method3131(Statics.field556 + arg0);
            var81.field2434.method2988(class51.field594[82] ? 1 : 0);
            var81.field2434.method3131(field985);
            field889.method1706(var81);
        }
        if (arg2 == 1005) {
            class228 var82 = class228.method2391(arg1);
            if (var82 == null || var82.field2879[arg0] < 100000) {
                class175 var83 = class175.method3893(class172.field2403, field889.field1450);
                var83.field2434.method3131(arg3);
                field889.method1706(var83);
            } else {
                class97.method172(27, "", var82.field2879[arg0] + " x " + class268.method4160(arg3).field3569);
            }
            field856 = 0;
            Statics.field743 = class228.method2391(arg1);
            field941 = arg0;
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field713.method4999(arg2, arg3, new class224(arg0), new class224(arg1));
        }
        if (arg2 == 1) {
            field1004 = arg6;
            field937 = arg7;
            field939 = 2;
            field1093 = 0;
            field1061 = arg0;
            field1062 = arg1;
            class175 var84 = class175.method3893(class172.field2383, field889.field1450);
            var84.field2434.method3007(Statics.field305);
            var84.field2434.method2946(class51.field594[82] ? 1 : 0);
            var84.field2434.method2997(arg3 >> 14 & 0x7FFF);
            var84.field2434.method2947(Statics.field895 + arg1);
            var84.field2434.method2997(Statics.field475);
            var84.field2434.method3131(Statics.field556 + arg0);
            var84.field2434.method2997(Statics.field558);
            field889.method1706(var84);
        }
        if (arg2 == 37) {
            class175 var85 = class175.method3893(class172.field2341, field889.field1450);
            var85.field2434.method2944(arg0);
            var85.field2434.method3012(arg1);
            var85.field2434.method2944(arg3);
            field889.method1706(var85);
            field856 = 0;
            Statics.field743 = class228.method2391(arg1);
            field941 = arg0;
        }
        if (arg2 == 11) {
            class86 var86 = field884[arg3];
            if (var86 != null) {
                field1004 = arg6;
                field937 = arg7;
                field939 = 2;
                field1093 = 0;
                field1061 = arg0;
                field1062 = arg1;
                class175 var87 = class175.method3893(class172.field2361, field889.field1450);
                var87.field2434.method2988(class51.field594[82] ? 1 : 0);
                var87.field2434.method3131(arg3);
                field889.method1706(var87);
            }
        }
        if (arg2 == 51) {
            class74 var88 = field949[arg3];
            if (var88 != null) {
                field1004 = arg6;
                field937 = arg7;
                field939 = 2;
                field1093 = 0;
                field1061 = arg0;
                field1062 = arg1;
                class175 var89 = class175.method3893(class172.field2394, field889.field1450);
                var89.field2434.method2986(class51.field594[82] ? 1 : 0);
                var89.field2434.method2997(arg3);
                field889.method1706(var89);
            }
        }
        if (arg2 == 25) {
            class228 var90 = class228.method2202(arg1, arg0);
            if (var90 != null) {
                method170();
                int var93 = method464(var90);
                int var94 = var93 >> 11 & 0x3F;
                method36(arg1, arg0, var94, var90.field2880);
                field864 = 0;
                int var95 = method464(var90);
                int var96 = var95 >> 11 & 0x3F;
                String var97;
                if (var96 == 0) {
                    var97 = null;
                } else if (var90.field2852 == null || var90.field2852.trim().length() == 0) {
                    var97 = null;
                } else {
                    var97 = var90.field2852;
                }
                field987 = var97;
                if (field987 == null) {
                    field987 = "Null";
                }
                if (var90.field2791) {
                    field911 = var90.field2854 + class88.method3175(16777215);
                } else {
                    field911 = class88.method3175(65280) + var90.field2876 + class88.method3175(16777215);
                }
            }
            return;
        }
        if (arg2 == 48) {
            class74 var98 = field949[arg3];
            if (var98 != null) {
                field1004 = arg6;
                field937 = arg7;
                field939 = 2;
                field1093 = 0;
                field1061 = arg0;
                field1062 = arg1;
                class175 var99 = class175.method3893(class172.field2338, field889.field1450);
                var99.field2434.method2947(arg3);
                var99.field2434.method2987(class51.field594[82] ? 1 : 0);
                field889.method1706(var99);
            }
        }
        if (arg2 == 43) {
            class175 var100 = class175.method3893(class172.field2347, field889.field1450);
            var100.field2434.method2949(arg1);
            var100.field2434.method2997(arg3);
            var100.field2434.method2997(arg0);
            field889.method1706(var100);
            field856 = 0;
            Statics.field743 = class228.method2391(arg1);
            field941 = arg0;
        }
        if (arg2 == 39) {
            class175 var101 = class175.method3893(class172.field2351, field889.field1450);
            var101.field2434.method3007(arg1);
            var101.field2434.method2997(arg0);
            var101.field2434.method2947(arg3);
            field889.method1706(var101);
            field856 = 0;
            Statics.field743 = class228.method2391(arg1);
            field941 = arg0;
        }
        if (arg2 == 44) {
            class74 var102 = field949[arg3];
            if (var102 != null) {
                field1004 = arg6;
                field937 = arg7;
                field939 = 2;
                field1093 = 0;
                field1061 = arg0;
                field1062 = arg1;
                class175 var103 = class175.method3893(class172.field2316, field889.field1450);
                var103.field2434.method2946(class51.field594[82] ? 1 : 0);
                var103.field2434.method2947(arg3);
                field889.method1706(var103);
            }
        }
        if (arg2 == 8) {
            class86 var104 = field884[arg3];
            if (var104 != null) {
                field1004 = arg6;
                field937 = arg7;
                field939 = 2;
                field1093 = 0;
                field1061 = arg0;
                field1062 = arg1;
                class175 var105 = class175.method3893(class172.field2348, field889.field1450);
                var105.field2434.method2947(field985);
                var105.field2434.method2944(arg3);
                var105.field2434.method3012(Statics.field3298);
                var105.field2434.method2986(class51.field594[82] ? 1 : 0);
                field889.method1706(var105);
            }
        }
        if (arg2 == 35) {
            class175 var106 = class175.method3893(class172.field2331, field889.field1450);
            var106.field2434.method2947(arg3);
            var106.field2434.method3012(arg1);
            var106.field2434.method2944(arg0);
            field889.method1706(var106);
            field856 = 0;
            Statics.field743 = class228.method2391(arg1);
            field941 = arg0;
        }
        if (arg2 == 38) {
            method170();
            class228 var107 = class228.method2391(arg1);
            field864 = 1;
            Statics.field475 = arg0;
            Statics.field305 = arg1;
            Statics.field558 = arg3;
            method308(var107);
            field983 = class88.method3175(16748608) + class268.method4160(arg3).field3569 + class88.method3175(16777215);
            if (field983 == null) {
                field983 = "null";
            }
            return;
        }
        if (arg2 == 49) {
            class74 var108 = field949[arg3];
            if (var108 != null) {
                field1004 = arg6;
                field937 = arg7;
                field939 = 2;
                field1093 = 0;
                field1061 = arg0;
                field1062 = arg1;
                class175 var109 = class175.method3893(class172.field2362, field889.field1450);
                var109.field2434.method3131(arg3);
                var109.field2434.method2986(class51.field594[82] ? 1 : 0);
                field889.method1706(var109);
            }
        }
        if (arg2 == 21) {
            field1004 = arg6;
            field937 = arg7;
            field939 = 2;
            field1093 = 0;
            field1061 = arg0;
            field1062 = arg1;
            class175 var110 = class175.method3893(class172.field2354, field889.field1450);
            var110.field2434.method2997(Statics.field895 + arg1);
            var110.field2434.method3131(Statics.field556 + arg0);
            var110.field2434.method2946(class51.field594[82] ? 1 : 0);
            var110.field2434.method2947(arg3);
            field889.method1706(var110);
        }
        if (arg2 == 58) {
            class228 var111 = class228.method2202(arg1, arg0);
            if (var111 != null) {
                class175 var112 = class175.method3893(class172.field2389, field889.field1450);
                var112.field2434.method2949(arg1);
                var112.field2434.method2997(field986);
                var112.field2434.method2947(var111.field2880);
                var112.field2434.method2997(field985);
                var112.field2434.method3012(Statics.field3298);
                var112.field2434.method3131(arg0);
                field889.method1706(var112);
            }
        }
        if (arg2 == 4) {
            field1004 = arg6;
            field937 = arg7;
            field939 = 2;
            field1093 = 0;
            field1061 = arg0;
            field1062 = arg1;
            class175 var113 = class175.method3893(class172.field2369, field889.field1450);
            var113.field2434.method3131(arg3 >> 14 & 0x7FFF);
            var113.field2434.method2988(class51.field594[82] ? 1 : 0);
            var113.field2434.method2944(Statics.field556 + arg0);
            var113.field2434.method3131(Statics.field895 + arg1);
            field889.method1706(var113);
        }
        if (field864 != 0) {
            field864 = 0;
            method308(class228.method2391(Statics.field305));
        }
        if (field1041) {
            method170();
        }
        if (Statics.field743 != null && field856 == 0) {
            method308(Statics.field743);
        }
    }

    @ObfuscatedName("bv.he(ILjava/lang/String;B)V")
    public static void method968(int arg0, String arg1) {
        int var2 = class95.field1400;
        int[] var3 = class95.field1394;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class74 var6 = field949[var3[var5]];
            if (var6 != null && Statics.field2088 != var6 && var6.field832 != null && var6.field832.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    class175 var7 = class175.method3893(class172.field2316, field889.field1450);
                    var7.field2434.method2946(0);
                    var7.field2434.method2947(var3[var5]);
                    field889.method1706(var7);
                } else if (arg0 == 4) {
                    class175 var8 = class175.method3893(class172.field2360, field889.field1450);
                    var8.field2434.method2988(0);
                    var8.field2434.method2947(var3[var5]);
                    field889.method1706(var8);
                } else if (arg0 == 6) {
                    class175 var9 = class175.method3893(class172.field2362, field889.field1450);
                    var9.field2434.method3131(var3[var5]);
                    var9.field2434.method2986(0);
                    field889.method1706(var9);
                } else if (arg0 == 7) {
                    class175 var10 = class175.method3893(class172.field2392, field889.field1450);
                    var10.field2434.method2988(0);
                    var10.field2434.method2947(var3[var5]);
                    field889.method1706(var10);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class97.method172(4, "", class237.field3108 + arg1);
        }
    }

    @ObfuscatedName("g.hr(IIIIB)V")
    public static void method36(int arg0, int arg1, int arg2, int arg3) {
        class228 var4 = class228.method2202(arg0, arg1);
        if (var4 != null && var4.field2851 != null) {
            class69 var5 = new class69();
            var5.field771 = var4;
            var5.field775 = var4.field2851;
            class83.method2139(var5);
        }
        field986 = arg3;
        field1041 = true;
        Statics.field3298 = arg0;
        field985 = arg1;
        Statics.field1279 = arg2;
        method308(var4);
    }

    @ObfuscatedName("p.hv(I)V")
    public static void method170() {
        if (!field1041) {
            return;
        }
        class228 var0 = class228.method2202(Statics.field3298, field985);
        if (var0 != null && var0.field2798 != null) {
            class69 var1 = new class69();
            var1.field771 = var0;
            var1.field775 = var0.field2798;
            class83.method2139(var1);
        }
        field1041 = false;
        method308(var0);
    }

    @ObfuscatedName("aw.hp(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method466(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method1654(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("cc.hh(Ljava/lang/String;Ljava/lang/String;IIIIZB)V")
    public static final void method1654(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field972 || field938 >= 500) {
            return;
        }
        field973[field938] = arg0;
        field974[field938] = arg1;
        field918[field938] = arg2;
        field855[field938] = arg3;
        field969[field938] = arg4;
        field970[field938] = arg5;
        field975[field938] = arg6;
        field938++;
    }

    @ObfuscatedName("y.ha(I)V")
    public static void method71() {
        for (int var0 = 0; var0 < field938; var0++) {
            int var1 = field918[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field938 - 1) {
                    for (int var3 = var0; var3 < field938 - 1; var3++) {
                        field973[var3] = field973[var3 + 1];
                        field974[var3] = field974[var3 + 1];
                        field918[var3] = field918[var3 + 1];
                        field855[var3] = field855[var3 + 1];
                        field969[var3] = field969[var3 + 1];
                        field970[var3] = field970[var3 + 1];
                        field975[var3] = field975[var3 + 1];
                    }
                }
                field938--;
            }
        }
    }

    @ObfuscatedName("z.hm(II)Ljava/lang/String;")
    public static String method19(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field974[arg0].length() > 0) {
            return field973[arg0] + class237.field3119 + field974[arg0];
        } else {
            return field973[arg0];
        }
    }

    @ObfuscatedName("av.ht(IIIII)V")
    public static final void method548(int arg0, int arg1, int arg2, int arg3) {
        if (field864 == 0 && !field1041) {
            method466(class237.field3114, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class134.field1888; var6++) {
            int var7 = class134.field1889[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field581.method2509(Statics.field235, var8, var9, var7) >= 0) {
                    class267 var12 = class267.method2129(var11);
                    if (var12.field3551 != null) {
                        var12 = var12.method4325();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field864 == 1) {
                        method466(class237.field3120, field983 + " " + class88.field1288 + " " + class88.method3175(65535) + var12.field3520, 1, var7, var8, var9);
                    } else if (!field1041) {
                        String[] var13 = var12.field3515;
                        if (field962) {
                            var13 = method843(var13);
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
                                    method466(var13[var14], class88.method3175(65535) + var12.field3520, var15, var7, var8, var9);
                                }
                            }
                        }
                        method466(class237.field3110, class88.method3175(65535) + var12.field3520, 1002, var12.field3517 << 14, var8, var9);
                    } else if ((Statics.field1279 & 0x4) == 4) {
                        method466(field987, field911 + " " + class88.field1288 + " " + class88.method3175(65535) + var12.field3520, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class86 var16 = field884[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field1273.field3621 == 1 && (var16.field1182 & 0x7F) == 64 && (var16.field1143 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field885; var17++) {
                            class86 var18 = field884[field886[var17]];
                            if (var18 != null && var16 != var18 && var18.field1273.field3621 == 1 && var16.field1182 == var18.field1182 && var16.field1143 == var18.field1143) {
                                method3859(var18.field1273, field886[var17], var8, var9);
                            }
                        }
                        int var19 = class95.field1400;
                        int[] var20 = class95.field1394;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class74 var22 = field949[var20[var21]];
                            if (var22 != null && var16.field1182 == var22.field1182 && var16.field1143 == var22.field1143) {
                                method3864(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method3859(var16.field1273, var11, var8, var9);
                }
                if (var10 == 0) {
                    class74 var23 = field949[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field1182 & 0x7F) == 64 && (var23.field1143 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field885; var24++) {
                            class86 var25 = field884[field886[var24]];
                            if (var25 != null && var25.field1273.field3621 == 1 && var23.field1182 == var25.field1182 && var23.field1143 == var25.field1143) {
                                method3859(var25.field1273, field886[var24], var8, var9);
                            }
                        }
                        int var26 = class95.field1400;
                        int[] var27 = class95.field1394;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class74 var29 = field949[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field1182 == var29.field1182 && var23.field1143 == var29.field1143) {
                                method3864(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field958 == var11) {
                        var4 = var7;
                    } else {
                        method3864(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class205 var30 = field1036[Statics.field235][var8][var9];
                    if (var30 != null) {
                        for (class94 var31 = (class94) var30.method3443(); var31 != null; var31 = (class94) var30.method3445()) {
                            class268 var32 = class268.method4160(var31.field1383);
                            if (field864 == 1) {
                                method466(class237.field3120, field983 + " " + class88.field1288 + " " + class88.method3175(16748608) + var32.field3569, 16, var31.field1383, var8, var9);
                            } else if (!field1041) {
                                String[] var33 = var32.field3583;
                                if (field962) {
                                    var33 = method843(var33);
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
                                        method466(var33[var34], class88.method3175(16748608) + var32.field3569, var35, var31.field1383, var8, var9);
                                    } else if (var34 == 2) {
                                        method466(class237.field2986, class88.method3175(16748608) + var32.field3569, 20, var31.field1383, var8, var9);
                                    }
                                }
                                method466(class237.field3110, class88.method3175(16748608) + var32.field3569, 1004, var31.field1383, var8, var9);
                            } else if ((Statics.field1279 & 0x1) == 1) {
                                method466(field987, field911 + " " + class88.field1288 + " " + class88.method3175(16748608) + var32.field3569, 17, var31.field1383, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class74 var38 = field949[field958];
            method3864(var38, field958, var36, var37);
        }
    }

    @ObfuscatedName("hw.hq(Ljn;IIIB)V")
    public static final void method3859(class270 arg0, int arg1, int arg2, int arg3) {
        if (field938 >= 400) {
            return;
        }
        if (arg0.field3650 != null) {
            arg0 = arg0.method4414();
        }
        if (arg0 == null || !arg0.field3644 || arg0.field3655 && field997 != arg1) {
            return;
        }
        String var4 = arg0.field3625;
        if (arg0.field3640 != 0) {
            int var6 = arg0.field3640;
            int var7 = Statics.field2088.field820;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class88.method3175(16711680);
            } else if (var8 < -6) {
                var9 = class88.method3175(16723968);
            } else if (var8 < -3) {
                var9 = class88.method3175(16740352);
            } else if (var8 < 0) {
                var9 = class88.method3175(16756736);
            } else if (var8 > 9) {
                var9 = class88.method3175(65280);
            } else if (var8 > 6) {
                var9 = class88.method3175(4259584);
            } else if (var8 > 3) {
                var9 = class88.method3175(8453888);
            } else if (var8 > 0) {
                var9 = class88.method3175(12648192);
            } else {
                var9 = class88.method3175(16776960);
            }
            var4 = var4 + var9 + " " + class88.field1287 + class237.field3115 + arg0.field3640 + class88.field1284;
        }
        if (arg0.field3655 && field976) {
            method466(class237.field3110, class88.method3175(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field864 == 1) {
            method466(class237.field3120, field983 + " " + class88.field1288 + " " + class88.method3175(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1041) {
            int var10 = arg0.field3655 && field976 ? 2000 : 0;
            String[] var11 = arg0.field3630;
            if (field962) {
                var11 = method843(var11);
            }
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class237.field3062)) {
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
                        method466(var11[var12], class88.method3175(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class237.field3062)) {
                        short var15 = 0;
                        if (field935 != class91.field1311) {
                            if (field935 == class91.field1306 || field935 == class91.field1309 && arg0.field3640 > Statics.field2088.field820) {
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
                            method466(var11[var14], class88.method3175(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3655 || !field976) {
                method466(class237.field3110, class88.method3175(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1279 & 0x2) == 2) {
            method466(field987, field911 + " " + class88.field1288 + " " + class88.method3175(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ix.hf(Lbj;IIII)V")
    public static final void method3864(class74 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2088 == arg0 || field938 >= 400) {
            return;
        }
        String var9;
        if (arg0.field816 == 0) {
            String var4 = arg0.field814[0] + arg0.field832 + arg0.field814[1];
            int var5 = arg0.field820;
            int var6 = Statics.field2088.field820;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class88.method3175(16711680);
            } else if (var7 < -6) {
                var8 = class88.method3175(16723968);
            } else if (var7 < -3) {
                var8 = class88.method3175(16740352);
            } else if (var7 < 0) {
                var8 = class88.method3175(16756736);
            } else if (var7 > 9) {
                var8 = class88.method3175(65280);
            } else if (var7 > 6) {
                var8 = class88.method3175(4259584);
            } else if (var7 > 3) {
                var8 = class88.method3175(8453888);
            } else if (var7 > 0) {
                var8 = class88.method3175(12648192);
            } else {
                var8 = class88.method3175(16776960);
            }
            var9 = var4 + var8 + " " + class88.field1287 + class237.field3115 + arg0.field820 + class88.field1284 + arg0.field814[2];
        } else {
            var9 = arg0.field814[0] + arg0.field832 + arg0.field814[1] + " " + class88.field1287 + class237.field3116 + arg0.field816 + class88.field1284 + arg0.field814[2];
        }
        if (field864 == 1) {
            method466(class237.field3120, field983 + " " + class88.field1288 + " " + class88.method3175(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field1041) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field955[var10] != null) {
                    short var11 = 0;
                    if (field955[var10].equalsIgnoreCase(class237.field3062)) {
                        if (field871 == class91.field1311) {
                            continue;
                        }
                        if (field871 == class91.field1306 || field871 == class91.field1309 && arg0.field820 > Statics.field2088.field820) {
                            var11 = 2000;
                        }
                        if (Statics.field2088.field833 != 0 && arg0.field833 != 0) {
                            if (Statics.field2088.field833 == arg0.field833) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field956[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field954[var10] + var11;
                    method466(field955[var10], class88.method3175(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1279 & 0x8) == 8) {
            method466(field987, field911 + " " + class88.field1288 + " " + class88.method3175(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field938; var14++) {
            if (field918[var14] == 23) {
                field974[var14] = class88.method3175(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("bf.ho(IIIIIIIII)V")
    public static final void method919(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class228.method1487(arg0)) {
            Statics.field18 = null;
            Statics.method1469(Statics.field2858[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field18 != null) {
                Statics.method1469(Statics.field18, -1412584499, arg1, arg2, arg3, arg4, Statics.field1223, Statics.field2527, arg7);
                Statics.field18 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1034[var8] = true;
            }
        } else {
            field1034[arg7] = true;
        }
    }

    @ObfuscatedName("i.hl(Ljava/lang/String;Lhz;B)Ljava/lang/String;")
    public static String method104(String arg0, class228 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method4612(arg1, var2 - 1);
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

    @ObfuscatedName("bf.hy(II)Ljava/lang/String;")
    public static final String method916(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class88.field1285 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class88.method3175(65408) + var1.substring(0, var1.length() - 8) + class237.field3220 + " " + class88.field1287 + var1 + class88.field1284 + class88.field1292;
        } else if (var1.length() > 6) {
            return " " + class88.method3175(16777215) + var1.substring(0, var1.length() - 4) + class237.field3122 + " " + class88.field1287 + var1 + class88.field1284 + class88.field1292;
        } else {
            return " " + class88.method3175(16776960) + var1 + class88.field1292;
        }
    }

    @ObfuscatedName("client.hs(ZI)V")
    public final void method1259(boolean arg0) {
        method956(field873, Statics.field2446, Statics.field1897, arg0);
    }

    @ObfuscatedName("client.hc(Lhz;I)V")
    public void method1035(class228 arg0) {
        class228 var2 = arg0.field2779 == -1 ? null : class228.method2391(arg0.field2779);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field2446;
            var4 = Statics.field1897;
        } else {
            var3 = var2.field2884;
            var4 = var2.field2776;
        }
        method1526(arg0, var3, var4, false);
        method886(arg0, var3, var4);
    }

    @ObfuscatedName("r.hb([Lhz;Lhz;ZB)V")
    public static void method91(class228[] arg0, class228 arg1, boolean arg2) {
        int var3 = arg1.field2817 == 0 ? arg1.field2884 : arg1.field2817;
        int var4 = arg1.field2784 == 0 ? arg1.field2776 : arg1.field2784;
        method3876(arg0, arg1.field2868, var3, var4, arg2);
        if (arg1.field2833 != null) {
            method3876(arg1.field2833, arg1.field2868, var3, var4, arg2);
        }
        class68 var5 = (class68) field947.method3387((long) arg1.field2868);
        if (var5 != null) {
            method956(var5.field766, var3, var4, arg2);
        }
        if (arg1.field2764 == 1337) {
        }
    }

    @ObfuscatedName("by.hd(IIIZI)V")
    public static final void method956(int arg0, int arg1, int arg2, boolean arg3) {
        if (class228.method1487(arg0)) {
            method3876(Statics.field2858[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ii.hg([Lhz;IIIZI)V")
    public static void method3876(class228[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class228 var6 = arg0[var5];
            if (var6 != null && var6.field2779 == arg1) {
                method1526(var6, arg2, arg3, arg4);
                method886(var6, arg2, arg3);
                if (var6.field2883 > var6.field2817 - var6.field2884) {
                    var6.field2883 = var6.field2817 - var6.field2884;
                }
                if (var6.field2883 < 0) {
                    var6.field2883 = 0;
                }
                if (var6.field2782 > var6.field2784 - var6.field2776) {
                    var6.field2782 = var6.field2784 - var6.field2776;
                }
                if (var6.field2782 < 0) {
                    var6.field2782 = 0;
                }
                if (var6.field2762 == 0) {
                    method91(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("cs.hz(Lhz;IIZI)V")
    public static void method1526(class228 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2884;
        int var5 = arg0.field2776;
        if (arg0.field2767 == 0) {
            arg0.field2884 = arg0.field2771;
        } else if (arg0.field2767 == 1) {
            arg0.field2884 = arg1 - arg0.field2771;
        } else if (arg0.field2767 == 2) {
            arg0.field2884 = arg0.field2771 * arg1 >> 14;
        }
        if (arg0.field2768 == 0) {
            arg0.field2776 = arg0.field2818;
        } else if (arg0.field2768 == 1) {
            arg0.field2776 = arg2 - arg0.field2818;
        } else if (arg0.field2768 == 2) {
            arg0.field2776 = arg0.field2818 * arg2 >> 14;
        }
        if (arg0.field2767 == 4) {
            arg0.field2884 = arg0.field2777 * arg0.field2776 / arg0.field2778;
        }
        if (arg0.field2768 == 4) {
            arg0.field2776 = arg0.field2884 * arg0.field2778 / arg0.field2777;
        }
        if (field979 && arg0.field2762 == 0) {
            if (arg0.field2776 < 5 && arg0.field2884 < 5) {
                arg0.field2776 = 5;
                arg0.field2884 = 5;
            } else {
                if (arg0.field2776 <= 0) {
                    arg0.field2776 = 5;
                }
                if (arg0.field2884 <= 0) {
                    arg0.field2884 = 5;
                }
            }
        }
        if (arg0.field2764 == 1337) {
            field1001 = arg0;
        }
        if (arg3 && arg0.field2869 != null && (arg0.field2884 != var4 || arg0.field2776 != var5)) {
            class69 var6 = new class69();
            var6.field771 = arg0;
            var6.field775 = arg0.field2869;
            field1028.method3446(var6);
        }
    }

    @ObfuscatedName("bw.hx(Lhz;III)V")
    public static void method886(class228 arg0, int arg1, int arg2) {
        if (arg0.field2765 == 0) {
            arg0.field2773 = arg0.field2769;
        } else if (arg0.field2765 == 1) {
            arg0.field2773 = (arg1 - arg0.field2884) / 2 + arg0.field2769;
        } else if (arg0.field2765 == 2) {
            arg0.field2773 = arg1 - arg0.field2884 - arg0.field2769;
        } else if (arg0.field2765 == 3) {
            arg0.field2773 = arg0.field2769 * arg1 >> 14;
        } else if (arg0.field2765 == 4) {
            arg0.field2773 = (arg0.field2769 * arg1 >> 14) + (arg1 - arg0.field2884) / 2;
        } else {
            arg0.field2773 = arg1 - arg0.field2884 - (arg0.field2769 * arg1 >> 14);
        }
        if (arg0.field2839 == 0) {
            arg0.field2835 = arg0.field2770;
        } else if (arg0.field2839 == 1) {
            arg0.field2835 = (arg2 - arg0.field2776) / 2 + arg0.field2770;
        } else if (arg0.field2839 == 2) {
            arg0.field2835 = arg2 - arg0.field2776 - arg0.field2770;
        } else if (arg0.field2839 == 3) {
            arg0.field2835 = arg0.field2770 * arg2 >> 14;
        } else if (arg0.field2839 == 4) {
            arg0.field2835 = (arg0.field2770 * arg2 >> 14) + (arg2 - arg0.field2776) / 2;
        } else {
            arg0.field2835 = arg2 - arg0.field2776 - (arg0.field2770 * arg2 >> 14);
        }
        if (!field979 || arg0.field2762 != 0) {
            return;
        }
        if (arg0.field2773 < 0) {
            arg0.field2773 = 0;
        } else if (arg0.field2884 + arg0.field2773 > arg1) {
            arg0.field2773 = arg1 - arg0.field2884;
        }
        if (arg0.field2835 < 0) {
            arg0.field2835 = 0;
        } else if (arg0.field2835 + arg0.field2776 > arg2) {
            arg0.field2835 = arg2 - arg0.field2776;
        }
    }

    @ObfuscatedName("bu.hi(Lhz;B)Z")
    public static final boolean method1018(class228 arg0) {
        if (arg0.field2873 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2873.length; var1++) {
            int var2 = method4612(arg0, var1);
            int var3 = arg0.field2838[var1];
            if (arg0.field2873[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2873[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2873[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("js.hu(Lhz;IB)I")
    public static final int method4612(class228 arg0, int arg1) {
        if (arg0.field2872 == null || arg1 >= arg0.field2872.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2872[arg1];
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
                    var7 = field1024[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field964[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field914[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class228 var11 = class228.method2391(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class268.method4160(var12).field3582 || field850)) {
                        for (int var13 = 0; var13 < var11.field2878.length; var13++) {
                            if (var12 + 1 == var11.field2878[var13]) {
                                var7 += var11.field2879[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class223.field2723[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class234.field2943[field964[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class223.field2723[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2088.field820;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class234.field2944[var14]) {
                            var7 += field964[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class228 var17 = class228.method2391(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class268.method4160(var18).field3582 || field850)) {
                        for (int var19 = 0; var19 < var17.field2878.length; var19++) {
                            if (var18 + 1 == var17.field2878[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field994;
                }
                if (var6 == 12) {
                    var7 = field995;
                }
                if (var6 == 13) {
                    int var20 = class223.field2723[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = Statics.method463(var22);
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
                    var7 = (Statics.field2088.field1182 >> 7) + Statics.field556;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2088.field1143 >> 7) + Statics.field895;
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

    @ObfuscatedName("bs.hw(Lhz;Ljq;IIZI)V")
    public static final void method924(class228 arg0, class268 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3604;
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
            var7 = class237.field2961;
        }
        if (var6 != -1 && var7 != null) {
            method1654(var7, class88.method3175(16748608) + arg1.field3569, var6, arg1.field3567, arg2, arg0.field2868, arg4);
        }
    }

    @ObfuscatedName("ea.hj(Lhz;III)V")
    public static final void method2663(class228 arg0, int arg1, int arg2) {
        if (arg0.field2755 == 1) {
            method466(arg0.field2877, "", 24, 0, 0, arg0.field2868);
        }
        if (arg0.field2755 == 2 && !field1041) {
            int var3 = method464(arg0);
            int var4 = var3 >> 11 & 0x3F;
            String var5;
            if (var4 == 0) {
                var5 = null;
            } else if (arg0.field2852 == null || arg0.field2852.trim().length() == 0) {
                var5 = null;
            } else {
                var5 = arg0.field2852;
            }
            if (var5 != null) {
                method466(var5, class88.method3175(65280) + arg0.field2876, 25, 0, -1, arg0.field2868);
            }
        }
        if (arg0.field2755 == 3) {
            method466(class237.field3118, "", 26, 0, 0, arg0.field2868);
        }
        if (arg0.field2755 == 4) {
            method466(arg0.field2877, "", 28, 0, 0, arg0.field2868);
        }
        if (arg0.field2755 == 5) {
            method466(arg0.field2877, "", 29, 0, 0, arg0.field2868);
        }
        if (arg0.field2755 == 6 && field959 == null) {
            method466(arg0.field2877, "", 30, 0, -1, arg0.field2868);
        }
        if (arg0.field2762 == 2) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field2776; var8++) {
                for (int var9 = 0; var9 < arg0.field2884; var9++) {
                    int var10 = (arg0.field2826 + 32) * var9;
                    int var11 = (arg0.field2827 + 32) * var8;
                    if (var7 < 20) {
                        var10 += arg0.field2828[var7];
                        var11 += arg0.field2829[var7];
                    }
                    if (arg1 >= var10 && arg2 >= var11 && arg1 < var10 + 32 && arg2 < var11 + 32) {
                        field936 = var7;
                        Statics.field567 = arg0;
                        if (arg0.field2878[var7] > 0) {
                            label310: {
                                class268 var12 = class268.method4160(arg0.field2878[var7] - 1);
                                if (field864 == 1) {
                                    int var13 = method464(arg0);
                                    boolean var14 = (var13 >> 30 & 0x1) != 0;
                                    if (var14) {
                                        if (Statics.field305 != arg0.field2868 || Statics.field475 != var7) {
                                            method466(class237.field3120, field983 + " " + class88.field1288 + " " + class88.method3175(16748608) + var12.field3569, 31, var12.field3567, var7, arg0.field2868);
                                        }
                                        break label310;
                                    }
                                }
                                if (field1041) {
                                    int var15 = method464(arg0);
                                    boolean var16 = (var15 >> 30 & 0x1) != 0;
                                    if (var16) {
                                        if ((Statics.field1279 & 0x10) == 16) {
                                            method466(field987, field911 + " " + class88.field1288 + " " + class88.method3175(16748608) + var12.field3569, 32, var12.field3567, var7, arg0.field2868);
                                        }
                                        break label310;
                                    }
                                }
                                String[] var17 = var12.field3604;
                                if (field962) {
                                    String[] var18 = method843(var17);
                                }
                                int var19 = -1;
                                if (field977 && class51.field594[81]) {
                                    var19 = var12.method4346();
                                }
                                int var20 = method464(arg0);
                                boolean var21 = (var20 >> 30 & 0x1) != 0;
                                if (var21) {
                                    for (int var22 = 4; var22 >= 3; var22--) {
                                        if (var19 != var22) {
                                            method924(arg0, var12, var7, var22, false);
                                        }
                                    }
                                }
                                int var23 = method464(arg0);
                                boolean var24 = (var23 >> 31 & 0x1) != 0;
                                if (var24) {
                                    method466(class237.field3120, class88.method3175(16748608) + var12.field3569, 38, var12.field3567, var7, arg0.field2868);
                                }
                                int var25 = method464(arg0);
                                boolean var26 = (var25 >> 30 & 0x1) != 0;
                                if (var26) {
                                    for (int var27 = 2; var27 >= 0; var27--) {
                                        if (var19 != var27) {
                                            method924(arg0, var12, var7, var27, false);
                                        }
                                    }
                                    if (var19 >= 0) {
                                        method924(arg0, var12, var7, var19, true);
                                    }
                                }
                                String[] var28 = arg0.field2831;
                                if (field962) {
                                    var28 = method843(var28);
                                }
                                if (var28 != null) {
                                    for (int var29 = 4; var29 >= 0; var29--) {
                                        if (var28[var29] != null) {
                                            byte var30 = 0;
                                            if (var29 == 0) {
                                                var30 = 39;
                                            }
                                            if (var29 == 1) {
                                                var30 = 40;
                                            }
                                            if (var29 == 2) {
                                                var30 = 41;
                                            }
                                            if (var29 == 3) {
                                                var30 = 42;
                                            }
                                            if (var29 == 4) {
                                                var30 = 43;
                                            }
                                            method466(var28[var29], class88.method3175(16748608) + var12.field3569, var30, var12.field3567, var7, arg0.field2868);
                                        }
                                    }
                                }
                                method466(class237.field3110, class88.method3175(16748608) + var12.field3569, 1005, var12.field3567, var7, arg0.field2868);
                            }
                        }
                    }
                    var7++;
                }
            }
        }
        if (!arg0.field2791) {
            return;
        }
        if (field1041) {
            int var31 = method464(arg0);
            boolean var32 = (var31 >> 21 & 0x1) != 0;
            if (var32 && (Statics.field1279 & 0x20) == 32) {
                method466(field987, field911 + " " + class88.field1288 + " " + arg0.field2854, 58, 0, arg0.field2761, arg0.field2868);
            }
            return;
        }
        for (int var33 = 9; var33 >= 5; var33--) {
            String var34 = method619(arg0, var33);
            if (var34 != null) {
                method466(var34, arg0.field2854, 1007, var33 + 1, arg0.field2761, arg0.field2868);
            }
        }
        int var35 = method464(arg0);
        int var36 = var35 >> 11 & 0x3F;
        String var37;
        if (var36 == 0) {
            var37 = null;
        } else if (arg0.field2852 == null || arg0.field2852.trim().length() == 0) {
            var37 = null;
        } else {
            var37 = arg0.field2852;
        }
        if (var37 != null) {
            method466(var37, arg0.field2854, 25, 0, arg0.field2761, arg0.field2868);
        }
        for (int var39 = 4; var39 >= 0; var39--) {
            String var40 = method619(arg0, var39);
            if (var40 != null) {
                method466(var40, arg0.field2854, 57, var39 + 1, arg0.field2761, arg0.field2868);
            }
        }
        int var41 = method464(arg0);
        boolean var42 = (var41 & 0x1) != 0;
        if (var42) {
            method466(class237.field2965, "", 30, 0, arg0.field2761, arg0.field2868);
        }
    }

    @ObfuscatedName("eq.ix(IIIIIIII)V")
    public static final void method2671(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class228.method1487(arg0)) {
            method145(Statics.field2858[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("b.ie([Lhz;IIIIIIII)V")
    public static final void method145(class228[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class228 var9 = arg0[var8];
            if (var9 != null && (!var9.field2791 || var9.field2762 == 0 || var9.field2888 || method464(var9) != 0 || field1003 == var9 || var9.field2764 == 1338) && var9.field2779 == arg1 && (!var9.field2791 || !method2669(var9))) {
                int var10 = var9.field2773 + arg6;
                int var11 = var9.field2835 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2762 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2762 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2884 + var10;
                    int var19 = var9.field2776 + var11;
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
                    int var22 = var9.field2884 + var10;
                    int var23 = var9.field2776 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1065 == var9) {
                    field1010 = true;
                    field1011 = var10;
                    field1012 = var11;
                }
                if (!var9.field2791 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field680;
                    int var25 = class60.field683 * -469125321;
                    if (class60.field679 != 0) {
                        var24 = class60.field665;
                        var25 = class60.field681;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2764 == 1337) {
                        if (!field854 && !field972 && var26) {
                            method548(var24, var25, var12, var13);
                        }
                    } else if (var9.field2764 == 1338) {
                        method1534(var9, var10, var11);
                    } else {
                        if (var9.field2764 == 1400) {
                            Statics.field713.method4949(class60.field680, class60.field683 * -469125321, var26, var10, var11, var9.field2884, var9.field2776);
                        }
                        if (!field972 && var26) {
                            if (var9.field2764 == 1400) {
                                Statics.field713.method5049(var10, var11, var9.field2884, var9.field2776, var24, var25);
                            } else {
                                method2663(var9, var24 - var10, var25 - var11);
                            }
                        }
                        if (var9.field2762 == 0) {
                            if (!var9.field2791 && method2669(var9) && Statics.field392 != var9) {
                                continue;
                            }
                            method145(arg0, var9.field2868, var12, var13, var14, var15, var10 - var9.field2883, var11 - var9.field2782);
                            if (var9.field2833 != null) {
                                method145(var9.field2833, var9.field2868, var12, var13, var14, var15, var10 - var9.field2883, var11 - var9.field2782);
                            }
                            class68 var27 = (class68) field947.method3387((long) var9.field2868);
                            if (var27 != null) {
                                if (var27.field763 == 0 && class60.field680 >= var12 && class60.field683 * -469125321 >= var13 && class60.field680 < var14 && class60.field683 * -469125321 < var15 && !field972 && !field979) {
                                    for (class69 var28 = (class69) field1028.method3442(); var28 != null; var28 = (class69) field1028.method3444()) {
                                        if (var28.field770) {
                                            var28.method3427();
                                            var28.field771.field2863 = false;
                                        }
                                    }
                                    if (Statics.field752 == 0) {
                                        field1065 = null;
                                        field1003 = null;
                                    }
                                    if (!field972) {
                                        method1003();
                                    }
                                }
                                method2671(var27.field766, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2791) {
                            if (var9.field2774) {
                                if (class60.field680 >= var12 && class60.field683 * -469125321 >= var13 && class60.field680 < var14 && class60.field683 * -469125321 < var15) {
                                    for (class69 var29 = (class69) field1028.method3442(); var29 != null; var29 = (class69) field1028.method3444()) {
                                        if (var29.field770) {
                                            var29.method3427();
                                            var29.field771.field2863 = false;
                                        }
                                    }
                                    if (Statics.field752 == 0) {
                                        field1065 = null;
                                        field1003 = null;
                                    }
                                    if (!field972) {
                                        method1003();
                                    }
                                }
                            } else if (var9.field2889 && class60.field680 >= var12 && class60.field683 * -469125321 >= var13 && class60.field680 < var14 && class60.field683 * -469125321 < var15) {
                                for (class69 var30 = (class69) field1028.method3442(); var30 != null; var30 = (class69) field1028.method3444()) {
                                    if (var30.field770 && var30.field771.field2861 == var30.field775) {
                                        var30.method3427();
                                    }
                                }
                            }
                            boolean var31;
                            if (class60.field680 >= var12 && class60.field683 * -469125321 >= var13 && class60.field680 < var14 && class60.field683 * -469125321 < var15) {
                                var31 = true;
                            } else {
                                var31 = false;
                            }
                            boolean var32 = false;
                            if ((class60.field672 == 1 || !Statics.field456 && class60.field672 == 4) && var31) {
                                var32 = true;
                            }
                            boolean var33 = false;
                            if ((class60.field679 == 1 || !Statics.field456 && class60.field679 == 4) && class60.field665 >= var12 && class60.field681 >= var13 && class60.field665 < var14 && class60.field681 < var15) {
                                var33 = true;
                            }
                            if (var33) {
                                method305(var9, class60.field665 - var10, class60.field681 - var11);
                            }
                            if (var9.field2764 == 1400) {
                                Statics.field713.method4950(class60.field680, class60.field683 * -469125321, var31 & var32, var31 & var33);
                            }
                            if (field1065 != null && field1065 != var9 && var31) {
                                int var34 = method464(var9);
                                boolean var35 = (var34 >> 20 & 0x1) != 0;
                                if (var35) {
                                    field1006 = var9;
                                }
                            }
                            if (field1003 == var9) {
                                field993 = true;
                                field1008 = var10;
                                field951 = var11;
                            }
                            if (var9.field2888) {
                                if (var31 && field1027 != 0 && var9.field2861 != null) {
                                    class69 var36 = new class69();
                                    var36.field770 = true;
                                    var36.field771 = var9;
                                    var36.field773 = field1027;
                                    var36.field775 = var9.field2861;
                                    field1028.method3446(var36);
                                }
                                if (field1065 != null || Statics.field507 != null || field972) {
                                    var33 = false;
                                    var32 = false;
                                    var31 = false;
                                }
                                if (!var9.field2763 && var33) {
                                    var9.field2763 = true;
                                    if (var9.field2848 != null) {
                                        class69 var37 = new class69();
                                        var37.field770 = true;
                                        var37.field771 = var9;
                                        var37.field772 = class60.field665 - var10;
                                        var37.field773 = class60.field681 - var11;
                                        var37.field775 = var9.field2848;
                                        field1028.method3446(var37);
                                    }
                                }
                                if (var9.field2763 && var32 && var9.field2843 != null) {
                                    class69 var38 = new class69();
                                    var38.field770 = true;
                                    var38.field771 = var9;
                                    var38.field772 = class60.field680 - var10;
                                    var38.field773 = class60.field683 * -469125321 - var11;
                                    var38.field775 = var9.field2843;
                                    field1028.method3446(var38);
                                }
                                if (var9.field2763 && !var32) {
                                    var9.field2763 = false;
                                    if (var9.field2844 != null) {
                                        class69 var39 = new class69();
                                        var39.field770 = true;
                                        var39.field771 = var9;
                                        var39.field772 = class60.field680 - var10;
                                        var39.field773 = class60.field683 * -469125321 - var11;
                                        var39.field775 = var9.field2844;
                                        field1030.method3446(var39);
                                    }
                                }
                                if (var32 && var9.field2874 != null) {
                                    class69 var40 = new class69();
                                    var40.field770 = true;
                                    var40.field771 = var9;
                                    var40.field772 = class60.field680 - var10;
                                    var40.field773 = class60.field683 * -469125321 - var11;
                                    var40.field775 = var9.field2874;
                                    field1028.method3446(var40);
                                }
                                if (!var9.field2863 && var31) {
                                    var9.field2863 = true;
                                    if (var9.field2846 != null) {
                                        class69 var41 = new class69();
                                        var41.field770 = true;
                                        var41.field771 = var9;
                                        var41.field772 = class60.field680 - var10;
                                        var41.field773 = class60.field683 * -469125321 - var11;
                                        var41.field775 = var9.field2846;
                                        field1028.method3446(var41);
                                    }
                                }
                                if (var9.field2863 && var31 && var9.field2847 != null) {
                                    class69 var42 = new class69();
                                    var42.field770 = true;
                                    var42.field771 = var9;
                                    var42.field772 = class60.field680 - var10;
                                    var42.field773 = class60.field683 * -469125321 - var11;
                                    var42.field775 = var9.field2847;
                                    field1028.method3446(var42);
                                }
                                if (var9.field2863 && !var31) {
                                    var9.field2863 = false;
                                    if (var9.field2766 != null) {
                                        class69 var43 = new class69();
                                        var43.field770 = true;
                                        var43.field771 = var9;
                                        var43.field772 = class60.field680 - var10;
                                        var43.field773 = class60.field683 * -469125321 - var11;
                                        var43.field775 = var9.field2766;
                                        field1030.method3446(var43);
                                    }
                                }
                                if (var9.field2859 != null) {
                                    class69 var44 = new class69();
                                    var44.field771 = var9;
                                    var44.field775 = var9.field2859;
                                    field1029.method3446(var44);
                                }
                                if (var9.field2853 != null && field1016 > var9.field2864) {
                                    if (var9.field2840 == null || field1016 - var9.field2864 > 32) {
                                        class69 var49 = new class69();
                                        var49.field771 = var9;
                                        var49.field775 = var9.field2853;
                                        field1028.method3446(var49);
                                    } else {
                                        label500: for (int var45 = var9.field2864; var45 < field1016; var45++) {
                                            int var46 = field989[var45 & 0x1F];
                                            for (int var47 = 0; var47 < var9.field2840.length; var47++) {
                                                if (var9.field2840[var47] == var46) {
                                                    class69 var48 = new class69();
                                                    var48.field771 = var9;
                                                    var48.field775 = var9.field2853;
                                                    field1028.method3446(var48);
                                                    break label500;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2864 = field1016;
                                }
                                if (var9.field2855 != null && field1018 > var9.field2894) {
                                    if (var9.field2856 == null || field1018 - var9.field2894 > 32) {
                                        class69 var54 = new class69();
                                        var54.field771 = var9;
                                        var54.field775 = var9.field2855;
                                        field1028.method3446(var54);
                                    } else {
                                        label476: for (int var50 = var9.field2894; var50 < field1018; var50++) {
                                            int var51 = field853[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field2856.length; var52++) {
                                                if (var9.field2856[var52] == var51) {
                                                    class69 var53 = new class69();
                                                    var53.field771 = var9;
                                                    var53.field775 = var9.field2855;
                                                    field1028.method3446(var53);
                                                    break label476;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2894 = field1018;
                                }
                                if (var9.field2751 != null && field923 > var9.field2886) {
                                    if (var9.field2792 == null || field923 - var9.field2886 > 32) {
                                        class69 var59 = new class69();
                                        var59.field771 = var9;
                                        var59.field775 = var9.field2751;
                                        field1028.method3446(var59);
                                    } else {
                                        label452: for (int var55 = var9.field2886; var55 < field923; var55++) {
                                            int var56 = field1019[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field2792.length; var57++) {
                                                if (var9.field2792[var57] == var56) {
                                                    class69 var58 = new class69();
                                                    var58.field771 = var9;
                                                    var58.field775 = var9.field2751;
                                                    field1028.method3446(var58);
                                                    break label452;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2886 = field923;
                                }
                                if (field1021 > var9.field2887 && var9.field2862 != null) {
                                    class69 var60 = new class69();
                                    var60.field771 = var9;
                                    var60.field775 = var9.field2862;
                                    field1028.method3446(var60);
                                }
                                if (field1042 > var9.field2887 && var9.field2892 != null) {
                                    class69 var61 = new class69();
                                    var61.field771 = var9;
                                    var61.field775 = var9.field2892;
                                    field1028.method3446(var61);
                                }
                                if (field1023 > var9.field2887 && var9.field2865 != null) {
                                    class69 var62 = new class69();
                                    var62.field771 = var9;
                                    var62.field775 = var9.field2865;
                                    field1028.method3446(var62);
                                }
                                if (field1051 > var9.field2887 && var9.field2870 != null) {
                                    class69 var63 = new class69();
                                    var63.field771 = var9;
                                    var63.field775 = var9.field2870;
                                    field1028.method3446(var63);
                                }
                                if (field1025 > var9.field2887 && var9.field2802 != null) {
                                    class69 var64 = new class69();
                                    var64.field771 = var9;
                                    var64.field775 = var9.field2802;
                                    field1028.method3446(var64);
                                }
                                if (field1026 > var9.field2887 && var9.field2866 != null) {
                                    class69 var65 = new class69();
                                    var65.field771 = var9;
                                    var65.field775 = var9.field2866;
                                    field1028.method3446(var65);
                                }
                                var9.field2887 = field1058;
                                if (var9.field2752 != null) {
                                    for (int var66 = 0; var66 < field1050; var66++) {
                                        class69 var67 = new class69();
                                        var67.field771 = var9;
                                        var67.field769 = field1052[var66];
                                        var67.field776 = field1086[var66];
                                        var67.field775 = var9.field2752;
                                        field1028.method3446(var67);
                                    }
                                }
                            }
                        }
                        if (!var9.field2791 && field1065 == null && Statics.field507 == null && !field972) {
                            if ((var9.field2823 >= 0 || var9.field2787 != 0) && class60.field680 >= var12 && class60.field683 * -469125321 >= var13 && class60.field680 < var14 && class60.field683 * -469125321 < var15) {
                                if (var9.field2823 >= 0) {
                                    Statics.field392 = arg0[var9.field2823];
                                } else {
                                    Statics.field392 = var9;
                                }
                            }
                            if (var9.field2762 == 8 && class60.field680 >= var12 && class60.field683 * -469125321 >= var13 && class60.field680 < var14 && class60.field683 * -469125321 < var15) {
                                Statics.field1300 = var9;
                            }
                            if (var9.field2784 > var9.field2776) {
                                Statics.method1615(var9, var9.field2884 + var10, var11, var9.field2776, var9.field2784, class60.field680, class60.field683 * -469125321);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("h.iy([Lhz;IB)V")
    public static final void method154(class228[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class228 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2762 == 0) {
                    if (var3.field2833 != null) {
                        method154(var3.field2833, arg1);
                    }
                    class68 var4 = (class68) field947.method3387((long) var3.field2868);
                    if (var4 != null) {
                        int var5 = var4.field766;
                        if (class228.method1487(var5)) {
                            method154(Statics.field2858[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2800 != null) {
                    class69 var6 = new class69();
                    var6.field771 = var3;
                    var6.field775 = var3.field2800;
                    class83.method2139(var6);
                }
                if (arg1 == 1 && var3.field2857 != null) {
                    if (var3.field2761 >= 0) {
                        class228 var7 = class228.method2391(var3.field2868);
                        if (var7 == null || var7.field2833 == null || var3.field2761 >= var7.field2833.length || var7.field2833[var3.field2761] != var3) {
                            continue;
                        }
                    }
                    class69 var8 = new class69();
                    var8.field771 = var3;
                    var8.field775 = var3.field2857;
                    class83.method2139(var8);
                }
            }
        }
    }

    @ObfuscatedName("ax.ig(Lhz;III)V")
    public static final void method305(class228 arg0, int arg1, int arg2) {
        if (field1065 != null || field972 || arg0 == null || method2140(arg0) == null) {
            return;
        }
        field1065 = arg0;
        field1003 = method2140(arg0);
        field890 = arg1;
        field944 = arg2;
        Statics.field752 = 0;
        field1013 = false;
        int var3 = field938 - 1;
        if (var3 == -1) {
            return;
        }
        Statics.field1112 = new class89();
        Statics.field1112.field1295 = field969[var3];
        Statics.field1112.field1294 = field970[var3];
        Statics.field1112.field1296 = field918[var3];
        Statics.field1112.field1297 = field855[var3];
        Statics.field1112.field1298 = field973[var3];
    }

    @ObfuscatedName("client.iq(I)V")
    public final void method1036() {
        method308(field1065);
        Statics.field752++;
        if (field1010 && field993) {
            int var1 = class60.field680;
            int var2 = class60.field683 * -469125321;
            int var3 = var1 - field890;
            int var4 = var2 - field944;
            if (var3 < field1008) {
                var3 = field1008;
            }
            if (field1065.field2884 + var3 > field1008 + field1003.field2884) {
                var3 = field1008 + field1003.field2884 - field1065.field2884;
            }
            if (var4 < field951) {
                var4 = field951;
            }
            if (field1065.field2776 + var4 > field951 + field1003.field2776) {
                var4 = field951 + field1003.field2776 - field1065.field2776;
            }
            int var5 = var3 - field1011;
            int var6 = var4 - field1012;
            int var7 = field1065.field2836;
            if (Statics.field752 > field1065.field2885 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1013 = true;
            }
            int var8 = field1003.field2883 + (var3 - field1008);
            int var9 = field1003.field2782 + (var4 - field951);
            if (field1065.field2849 != null && field1013) {
                class69 var10 = new class69();
                var10.field771 = field1065;
                var10.field772 = var8;
                var10.field773 = var9;
                var10.field775 = field1065.field2849;
                class83.method2139(var10);
            }
            if (class60.field672 == 0) {
                if (field1013) {
                    if (field1065.field2850 != null) {
                        class69 var11 = new class69();
                        var11.field771 = field1065;
                        var11.field772 = var8;
                        var11.field773 = var9;
                        var11.field777 = field1006;
                        var11.field775 = field1065.field2850;
                        class83.method2139(var11);
                    }
                    if (field1006 != null) {
                        class228 var12 = field1065;
                        int var13 = class229.method3849(method464(var12));
                        class228 var14;
                        if (var13 == 0) {
                            var14 = null;
                        } else {
                            int var15 = 0;
                            while (true) {
                                if (var15 >= var13) {
                                    var14 = var12;
                                    break;
                                }
                                var12 = class228.method2391(var12.field2779);
                                if (var12 == null) {
                                    var14 = null;
                                    break;
                                }
                                var15++;
                            }
                        }
                        if (var14 != null) {
                            class175 var16 = class175.method3893(class172.field2322, field889.field1450);
                            var16.field2434.method3007(field1065.field2868);
                            var16.field2434.method2944(field1065.field2761);
                            var16.field2434.method2947(field1006.field2880);
                            var16.field2434.method3007(field1006.field2868);
                            var16.field2434.method2997(field1006.field2761);
                            var16.field2434.method2944(field1065.field2880);
                            field889.method1706(var16);
                        }
                    }
                } else if (this.method1032()) {
                    this.method1033(field890 + field1011, field944 + field1012);
                } else if (field938 > 0) {
                    method550(field890 + field1011, field944 + field1012);
                }
                field1065 = null;
            }
        } else if (Statics.field752 > 1) {
            field1065 = null;
        }
    }

    @ObfuscatedName("av.ii(III)V")
    public static void method550(int arg0, int arg1) {
        method7(Statics.field1112, arg0, arg1);
        Statics.field1112 = null;
    }

    @ObfuscatedName("at.im(Lhz;I)V")
    public static void method308(class228 arg0) {
        if (field1033 == arg0.field2759) {
            field1034[arg0.field2891] = true;
        }
    }

    @ObfuscatedName("cq.ij(B)V")
    public static void method1499() {
        for (class68 var0 = (class68) field947.method3379(); var0 != null; var0 = (class68) field947.method3384()) {
            int var1 = var0.field766;
            if (class228.method1487(var1)) {
                boolean var2 = true;
                class228[] var3 = Statics.field2858[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2791;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2589;
                    class228 var6 = class228.method2391(var5);
                    if (var6 != null) {
                        method308(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dv.il(Lhz;I)Lhz;")
    public static class228 method2140(class228 arg0) {
        class228 var1 = arg0;
        int var2 = class229.method3849(method464(arg0));
        class228 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class228.method2391(var1.field2779);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class228 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2783;
        }
        return var5;
    }

    @ObfuscatedName("be.ia([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method843(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("at.in(II)V")
    public static final void method307(int arg0) {
        if (!class228.method1487(arg0)) {
            return;
        }
        class228[] var1 = Statics.field2858[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class228 var3 = var1[var2];
            if (var3 != null) {
                var3.field2882 = 0;
                var3.field2893 = 0;
            }
        }
    }

    @ObfuscatedName("dn.it([Lhz;II)V")
    public static final void method1880(class228[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class228 var3 = arg0[var2];
            if (var3 != null && var3.field2779 == arg1 && (!var3.field2791 || !method2669(var3))) {
                if (var3.field2762 == 0) {
                    if (!var3.field2791 && method2669(var3) && Statics.field392 != var3) {
                        continue;
                    }
                    method1880(arg0, var3.field2868);
                    if (var3.field2833 != null) {
                        method1880(var3.field2833, var3.field2868);
                    }
                    class68 var4 = (class68) field947.method3387((long) var3.field2868);
                    if (var4 != null) {
                        int var5 = var4.field766;
                        if (class228.method1487(var5)) {
                            method1880(Statics.field2858[var5], -1);
                        }
                    }
                }
                if (var3.field2762 == 6) {
                    if (var3.field2807 != -1 || var3.field2808 != -1) {
                        boolean var6 = method1018(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2808;
                        } else {
                            var7 = var3.field2807;
                        }
                        if (var7 != -1) {
                            class272 var8 = class272.method3881(var7);
                            var3.field2893 += field848;
                            while (var3.field2893 > var8.field3676[var3.field2882]) {
                                var3.field2893 -= var8.field3676[var3.field2882];
                                var3.field2882++;
                                if (var3.field2882 >= var8.field3671.length) {
                                    var3.field2882 -= var8.field3683;
                                    if (var3.field2882 < 0 || var3.field2882 >= var8.field3671.length) {
                                        var3.field2882 = 0;
                                    }
                                }
                                method308(var3);
                            }
                        }
                    }
                    if (var3.field2816 != 0 && !var3.field2791) {
                        int var9 = var3.field2816 >> 16;
                        int var10 = var3.field2816 << 16 >> 16;
                        int var11 = field848 * var9;
                        int var12 = field848 * var10;
                        var3.field2811 = var3.field2811 + var11 & 0x7FF;
                        var3.field2812 = var3.field2812 + var12 & 0x7FF;
                        method308(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ex.ib(II)V")
    public static final void method2693(int arg0) {
        method1499();
        class82.method221();
        int var1 = class253.method171(arg0).field3375;
        if (var1 == 0) {
            return;
        }
        int var2 = class223.field2723[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class136.method2398(0.9D);
                ((class125) Statics.field1924).method2176(0.9D);
            }
            if (var2 == 2) {
                class136.method2398(0.8D);
                ((class125) Statics.field1924).method2176(0.8D);
            }
            if (var2 == 3) {
                class136.method2398(0.7D);
                ((class125) Statics.field1924).method2176(0.7D);
            }
            if (var2 == 4) {
                class136.method2398(0.6D);
                ((class125) Statics.field1924).method2176(0.6D);
            }
            class268.field3566.method3370();
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
            if (field846 != var3) {
                if (field846 == 0 && field851 != -1) {
                    class215.method4(Statics.field387, field851, 0, var3, false);
                    field1009 = false;
                } else if (var3 == 0) {
                    Statics.field3754.method3540();
                    class215.field2621 = 1;
                    Statics.field2624 = null;
                    field1009 = false;
                } else {
                    class215.method1017(var3);
                }
                field846 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field1067 = 127;
            }
            if (var2 == 1) {
                field1067 = 96;
            }
            if (var2 == 2) {
                field1067 = 64;
            }
            if (var2 == 3) {
                field1067 = 32;
            }
            if (var2 == 4) {
                field1067 = 0;
            }
        }
        if (var1 == 5) {
            field966 = var2;
        }
        if (var1 == 6) {
            field991 = var2;
        }
        if (var1 == 9) {
            field992 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field1068 = 127;
            }
            if (var2 == 1) {
                field1068 = 96;
            }
            if (var2 == 2) {
                field1068 = 64;
            }
            if (var2 == 3) {
                field1068 = 32;
            }
            if (var2 == 4) {
                field1068 = 0;
            }
        }
        if (var1 == 17) {
            field997 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field871 = (class91) class180.method1581(class91.method2477(), var2);
            if (field871 == null) {
                field871 = class91.field1309;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field958 = -1;
            } else {
                field958 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field935 = (class91) class180.method1581(class91.method2477(), var2);
            if (field935 == null) {
                field935 = class91.field1309;
            }
        }
    }

    @ObfuscatedName("an.id(Lhz;I)V")
    public static final void method455(class228 arg0) {
        int var1 = arg0.field2764;
        if (var1 == 324) {
            if (field1046 == -1) {
                field1046 = arg0.field2795;
                field1102 = arg0.field2753;
            }
            if (field1091.field2731) {
                arg0.field2795 = field1046;
            } else {
                arg0.field2795 = field1102;
            }
        } else if (var1 == 325) {
            if (field1046 == -1) {
                field1046 = arg0.field2795;
                field1102 = arg0.field2753;
            }
            if (field1091.field2731) {
                arg0.field2795 = field1102;
            } else {
                arg0.field2795 = field1046;
            }
        } else if (var1 == 327) {
            arg0.field2811 = 150;
            arg0.field2812 = (int) (Math.sin((double) field963 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2803 = 5;
            arg0.field2804 = 0;
        } else if (var1 == 328) {
            arg0.field2811 = 150;
            arg0.field2812 = (int) (Math.sin((double) field963 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2803 = 5;
            arg0.field2804 = 1;
        }
    }

    @ObfuscatedName("hz.iu(I)V")
    public static final void method3848() {
        class175 var0 = class175.method3893(class172.field2381, field889.field1450);
        field889.method1706(var0);
        for (class68 var1 = (class68) field947.method3379(); var1 != null; var1 = (class68) field947.method3384()) {
            if (var1.field763 == 0 || var1.field763 == 3) {
                method943(var1, true);
            }
        }
        if (field959 != null) {
            method308(field959);
            field959 = null;
        }
    }

    @ObfuscatedName("cm.io(IIII)Lbt;")
    public static final class68 method1676(int arg0, int arg1, int arg2) {
        class68 var3 = new class68();
        var3.field766 = arg1;
        var3.field763 = arg2;
        field947.method3381(var3, (long) arg0);
        method307(arg1);
        class228 var4 = class228.method2391(arg0);
        method308(var4);
        if (field959 != null) {
            method308(field959);
            field959 = null;
        }
        method71();
        method91(Statics.field2858[arg0 >> 16], var4, false);
        Statics.method41(arg1);
        if (field873 != -1) {
            int var5 = field873;
            if (class228.method1487(var5)) {
                method154(Statics.field2858[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("bm.ik(Lbt;ZI)V")
    public static final void method943(class68 arg0, boolean arg1) {
        int var2 = arg0.field766;
        int var3 = (int) arg0.field2589;
        arg0.method3427();
        if (arg1) {
            class228.method4197(var2);
        }
        method651(var2);
        class228 var4 = class228.method2391(var3);
        if (var4 != null) {
            method308(var4);
        }
        method71();
        if (field873 != -1) {
            int var5 = field873;
            if (class228.method1487(var5)) {
                method154(Statics.field2858[var5], 1);
            }
        }
    }

    @ObfuscatedName("bp.is(Lhz;B)Z")
    public static final boolean method666(class228 arg0) {
        int var1 = arg0.field2764;
        if (var1 == 205) {
            field882 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1091.method3754(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1091.method3755(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1091.method3753(false);
        }
        if (var1 == 325) {
            field1091.method3753(true);
        }
        if (var1 == 326) {
            class175 var6 = class175.method3893(class172.field2398, field889.field1450);
            field1091.method3757(var6.field2434);
            field889.method1706(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("i.iv(Lhz;IIII)V")
    public static final void method115(class228 arg0, int arg1, int arg2, int arg3) {
        method1508();
        class222 var4 = arg0.method3809(false);
        if (var4 == null) {
            return;
        }
        class295.method4699(arg1, arg2, var4.field2716 + arg1, var4.field2717 + arg2);
        if (field1063 == 2 || field1063 == 5) {
            class295.method4722(arg1, arg2, 0, var4.field2718, var4.field2715);
        } else {
            int var5 = field913 & 0x7FF;
            int var6 = Statics.field2088.field1182 / 32 + 48;
            int var7 = 464 - Statics.field2088.field1143 / 32;
            Statics.field251.method4823(arg1, arg2, var4.field2716, var4.field2717, var6, var7, var5, 256, var4.field2718, var4.field2715);
            for (int var8 = 0; var8 < field1057; var8++) {
                int var9 = field915[var8] * 4 + 2 - Statics.field2088.field1182 / 32;
                int var10 = field1059[var8] * 4 + 2 - Statics.field2088.field1143 / 32;
                method472(arg1, arg2, var9, var10, field1060[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class205 var13 = field1036[Statics.field235][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2088.field1182 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2088.field1143 / 32;
                        method472(arg1, arg2, var14, var15, Statics.field1431[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field885; var16++) {
                class86 var17 = field884[field886[var16]];
                if (var17 != null && var17.method985()) {
                    class270 var18 = var17.field1273;
                    if (var18 != null && var18.field3650 != null) {
                        var18 = var18.method4414();
                    }
                    if (var18 != null && var18.field3641 && var18.field3644) {
                        int var19 = var17.field1182 / 32 - Statics.field2088.field1182 / 32;
                        int var20 = var17.field1143 / 32 - Statics.field2088.field1143 / 32;
                        method472(arg1, arg2, var19, var20, Statics.field1431[1], var4);
                    }
                }
            }
            int var21 = class95.field1400;
            int[] var22 = class95.field1394;
            for (int var23 = 0; var23 < var21; var23++) {
                class74 var24 = field949[var22[var23]];
                if (var24 != null && var24.method985() && !var24.field830 && Statics.field2088 != var24) {
                    int var25 = var24.field1182 / 32 - Statics.field2088.field1182 / 32;
                    int var26 = var24.field1143 / 32 - Statics.field2088.field1143 / 32;
                    boolean var27 = false;
                    if (method620(var24.field832, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field2559; var29++) {
                        if (var24.field832.equals(Statics.field631[var29].field839)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field2088.field833 != 0 && var24.field833 != 0 && Statics.field2088.field833 == var24.field833) {
                        var30 = true;
                    }
                    if (var27) {
                        method472(arg1, arg2, var25, var26, Statics.field1431[3], var4);
                    } else if (var30) {
                        method472(arg1, arg2, var25, var26, Statics.field1431[4], var4);
                    } else if (var28) {
                        method472(arg1, arg2, var25, var26, Statics.field1431[5], var4);
                    } else {
                        method472(arg1, arg2, var25, var26, Statics.field1431[2], var4);
                    }
                }
            }
            if (field863 != 0 && field963 % 20 < 10) {
                if (field863 == 1 && field1098 >= 0 && field1098 < field884.length) {
                    class86 var31 = field884[field1098];
                    if (var31 != null) {
                        int var32 = var31.field1182 / 32 - Statics.field2088.field1182 / 32;
                        int var33 = var31.field1143 / 32 - Statics.field2088.field1143 / 32;
                        Statics.method2389(arg1, arg2, var32, var33, Statics.field459[1], var4);
                    }
                }
                if (field863 == 2) {
                    int var34 = field866 * 4 - Statics.field556 * 4 + 2 - Statics.field2088.field1182 / 32;
                    int var35 = field867 * 4 - Statics.field895 * 4 + 2 - Statics.field2088.field1143 / 32;
                    Statics.method2389(arg1, arg2, var34, var35, Statics.field459[1], var4);
                }
                if (field863 == 10 && field865 >= 0 && field865 < field949.length) {
                    class74 var36 = field949[field865];
                    if (var36 != null) {
                        int var37 = var36.field1182 / 32 - Statics.field2088.field1182 / 32;
                        int var38 = var36.field1143 / 32 - Statics.field2088.field1143 / 32;
                        Statics.method2389(arg1, arg2, var37, var38, Statics.field459[1], var4);
                    }
                }
            }
            if (field1061 != 0) {
                int var39 = field1061 * 4 + 2 - Statics.field2088.field1182 / 32;
                int var40 = field1062 * 4 + 2 - Statics.field2088.field1143 / 32;
                method472(arg1, arg2, var39, var40, Statics.field459[0], var4);
            }
            if (!Statics.field2088.field830) {
                class295.method4707(var4.field2716 / 2 + arg1 - 1, var4.field2717 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field1020[arg3] = true;
    }

    @ObfuscatedName("aw.ic(IIIILks;Lhy;B)V")
    public static final void method472(int arg0, int arg1, int arg2, int arg3, class299 arg4, class222 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field913 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class136.field1927[var6];
        int var9 = class136.field1926[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method4822(arg5.field2716 / 2 + var10 - arg4.field3858 / 2, arg5.field2717 / 2 - var11 - arg4.field3859 / 2, arg0, arg1, arg5.field2716, arg5.field2717, arg5.field2718, arg5.field2715);
        } else {
            arg4.method4812(arg5.field2716 / 2 + arg0 + var10 - arg4.field3858 / 2, arg5.field2717 / 2 + arg1 - var11 - arg4.field3859 / 2);
        }
    }

    @ObfuscatedName("aj.iw(Ljava/lang/String;ZB)Z")
    public static boolean method620(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class279.method3736(arg0, Statics.field1110);
        for (int var3 = 0; var3 < field1094; var3++) {
            if (var2.equalsIgnoreCase(class279.method3736(field990[var3].field750, Statics.field1110)) && (!arg1 || field990[var3].field747 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class279.method3736(Statics.field2088.field832, Statics.field1110))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ad.iz(Ljava/lang/String;B)Z")
    public static boolean method203(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class279.method3736(arg0, Statics.field1110);
        for (int var2 = 0; var2 < field905; var2++) {
            class70 var3 = field1066[var2];
            if (var1.equalsIgnoreCase(class279.method3736(var3.field786, Statics.field1110))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class279.method3736(var3.field782, Statics.field1110))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("f.ih(Ljava/lang/String;I)V")
    public static final void method31(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field1094 < 200 || field919 == 1) || field1094 >= 400) {
            class97.method172(30, "", class237.field3125);
            return;
        }
        String var1 = class279.method3736(arg0, Statics.field1110);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1094; var2++) {
            class66 var3 = field990[var2];
            String var4 = class279.method3736(var3.field750, Statics.field1110);
            if (var4 != null && var4.equals(var1)) {
                class97.method172(30, "", arg0 + class237.field3126);
                return;
            }
            if (var3.field744 != null) {
                String var5 = class279.method3736(var3.field744, Statics.field1110);
                if (var5 != null && var5.equals(var1)) {
                    class97.method172(30, "", arg0 + class237.field3126);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field905; var6++) {
            class70 var7 = field1066[var6];
            String var8 = class279.method3736(var7.field786, Statics.field1110);
            if (var8 != null && var8.equals(var1)) {
                class97.method172(30, "", class237.field3161 + arg0 + class237.field3033);
                return;
            }
            if (var7.field782 != null) {
                String var9 = class279.method3736(var7.field782, Statics.field1110);
                if (var9 != null && var9.equals(var1)) {
                    class97.method172(30, "", class237.field3161 + arg0 + class237.field3033);
                    return;
                }
            }
        }
        if (class279.method3736(Statics.field2088.field832, Statics.field1110).equals(var1)) {
            class97.method172(30, "", class237.field3052);
        } else {
            class175 var10 = class175.method3893(class172.field2350, field889.field1450);
            var10.field2434.method2946(class185.method960(arg0));
            var10.field2434.method3106(arg0);
            field889.method1706(var10);
        }
    }

    @ObfuscatedName("be.ip(Ljava/lang/String;I)V")
    public static final void method758(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class279.method3736(arg0, Statics.field1110);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1094; var2++) {
            class66 var3 = field990[var2];
            String var4 = var3.field750;
            String var5 = class279.method3736(var4, Statics.field1110);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field1094--;
                for (int var7 = var2; var7 < field1094; var7++) {
                    field990[var7] = field990[var7 + 1];
                }
                field1042 = field1058;
                class175 var8 = class175.method3893(class172.field2355, field889.field1450);
                var8.field2434.method2946(class185.method960(arg0));
                var8.field2434.method3106(arg0);
                field889.method1706(var8);
                break;
            }
        }
    }

    @ObfuscatedName("ed.ir(I)V")
    public static final void method2473() {
        class175 var0 = class175.method3893(class172.field2343, field889.field1450);
        var0.field2434.method2946(0);
        field889.method1706(var0);
    }

    @ObfuscatedName("ar.jc(IB)V")
    public static void method651(int arg0) {
        for (class210 var1 = (class210) field1031.method3379(); var1 != null; var1 = (class210) field1031.method3384()) {
            if ((long) arg0 == (var1.field2589 >> 48 & 0xFFFFL)) {
                var1.method3427();
            }
        }
    }

    @ObfuscatedName("ac.jw(Lhz;I)I")
    public static int method464(class228 arg0) {
        class210 var1 = (class210) field1031.method3387(((long) arg0.field2868 << 32) + (long) arg0.field2761);
        return var1 == null ? arg0.field2758 : var1.field2604;
    }

    @ObfuscatedName("em.jk(Lhz;I)Z")
    public static boolean method2669(class228 arg0) {
        if (field979) {
            if (method464(arg0) != 0) {
                return false;
            }
            if (arg0.field2762 == 0) {
                return false;
            }
        }
        return arg0.field2832;
    }

    @ObfuscatedName("aj.jt(Lhz;II)Ljava/lang/String;")
    public static String method619(class228 arg0, int arg1) {
        int var2 = method464(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2860 == null) {
            return null;
        } else if (arg0.field2834 == null || arg0.field2834.length <= arg1 || arg0.field2834[arg1] == null || arg0.field2834[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2834[arg1];
        }
    }

    @ObfuscatedName("h.jg(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method156(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field849 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field849 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field849 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field849 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field849 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field2104 != null) {
            var3 = "/p=" + Statics.field2104;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field852 + "/a=" + Statics.field32 + var3 + "/";
    }

    @ObfuscatedName("ep.je(Ljava/lang/String;B)V")
    public static void method2686(String arg0) {
        Statics.field2104 = arg0;
        try {
            String var1 = Statics.field284.getParameter(class287.field3787.field3791);
            String var2 = Statics.field284.getParameter(class287.field3786.field3791);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class194.method1335(class187.method1411() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field284;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("co.jq(Lgh;II)V")
    public static void method1589(class185 arg0, int arg1) {
        byte[] var2 = arg0.field2512;
        if (field1035 == null) {
            field1035 = new byte[24];
        }
        class195.method3294(var2, arg1, field1035, 0, 24);
        class158.method2770(arg0, arg1);
    }

    @ObfuscatedName("jl.jr(IIII)V")
    public static void method4496(int arg0, int arg1, int arg2) {
        class175 var3 = class175.method3893(class172.field2370, field889.field1450);
        var3.field2434.method2944(arg0);
        var3.field2434.method2987(arg2);
        var3.field2434.method3131(arg1);
        field889.method1706(var3);
    }

    @ObfuscatedName("bm.jn(I)Z")
    public static boolean method942() {
        return field996 >= 2;
    }
}

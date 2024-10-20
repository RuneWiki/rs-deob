package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;

public final class client extends class112 {

    @ObfuscatedName("client.an")
    public static boolean field1909 = true;

    @ObfuscatedName("client.az")
    public static int field2083 = 1;

    @ObfuscatedName("client.ap")
    public static int field1911 = 0;

    @ObfuscatedName("client.as")
    public static boolean field1913 = false;

    @ObfuscatedName("client.ak")
    public static boolean field1914 = false;

    @ObfuscatedName("client.av")
    public static int field2048 = 0;

    @ObfuscatedName("client.ay")
    public static int field1916 = 1;

    @ObfuscatedName("client.am")
    public static int field1917 = 0;

    @ObfuscatedName("client.aw")
    public static boolean field1918 = true;

    @ObfuscatedName("client.ag")
    public static int field1919 = 0;

    @ObfuscatedName("client.al")
    public static long field1998 = 0L;

    @ObfuscatedName("client.ah")
    public static int field2016 = 0;

    @ObfuscatedName("client.ao")
    public static int field1922 = 0;

    @ObfuscatedName("client.bg")
    public static int field1923 = 0;

    @ObfuscatedName("client.be")
    public static boolean field1924 = true;

    @ObfuscatedName("client.bi")
    public static boolean field1925 = false;

    @ObfuscatedName("client.bp")
    public static int field1926 = 0;

    @ObfuscatedName("client.bw")
    public static int field1927 = 0;

    @ObfuscatedName("client.bu")
    public static int field1928 = 0;

    @ObfuscatedName("client.bf")
    public static int field2184 = 0;

    @ObfuscatedName("client.bc")
    public static int field1930 = 0;

    @ObfuscatedName("client.bn")
    public static int field2065 = 0;

    @ObfuscatedName("client.bk")
    public static int field2113 = 0;

    @ObfuscatedName("client.bz")
    public static int field2190 = 0;

    @ObfuscatedName("client.bj")
    public static int field2094 = 0;

    @ObfuscatedName("client.bt")
    public static class136 field1935 = new class136(new byte[5000]);

    @ObfuscatedName("client.bq")
    public static int field1981 = 0;

    @ObfuscatedName("client.bm")
    public static int field1938 = 0;

    @ObfuscatedName("client.bv")
    public static int field1939 = 0;

    @ObfuscatedName("client.cy")
    public static int field1945 = 0;

    @ObfuscatedName("client.cd")
    public static int field2132 = 0;

    @ObfuscatedName("client.cp")
    public static int field1947 = 0;

    @ObfuscatedName("client.ce")
    public static int field1948 = 0;

    @ObfuscatedName("client.ct")
    public static int field1949 = 0;

    @ObfuscatedName("client.cz")
    public static class184[] field2062 = new class184[32768];

    @ObfuscatedName("client.cl")
    public static int field1999 = 0;

    @ObfuscatedName("client.cu")
    public static int[] field1984 = new int[32768];

    @ObfuscatedName("client.dd")
    public static class151 field2162 = new class151(5000);

    @ObfuscatedName("client.di")
    public static class151 field1957 = new class151(5000);

    @ObfuscatedName("client.dw")
    public static class151 field1958 = new class151(5000);

    @ObfuscatedName("client.db")
    public static int field2102 = 0;

    @ObfuscatedName("client.dz")
    public static int field1960 = 0;

    @ObfuscatedName("client.dy")
    public static int field1961 = 0;

    @ObfuscatedName("client.dl")
    public static int field1962 = 0;

    @ObfuscatedName("client.dh")
    public static int field1965 = 0;

    @ObfuscatedName("client.dp")
    public static int field2147 = 0;

    @ObfuscatedName("client.do")
    public static int field1933 = 0;

    @ObfuscatedName("client.df")
    public static int field1966 = 0;

    @ObfuscatedName("client.dk")
    public static boolean field1967 = false;

    @ObfuscatedName("client.dx")
    public static int field1970 = 0;

    @ObfuscatedName("client.dr")
    public static int field2111 = 0;

    @ObfuscatedName("client.eo")
    public static int field1977 = 1;

    @ObfuscatedName("client.es")
    public static int field1973 = 0;

    @ObfuscatedName("client.eh")
    public static int field1974 = 1;

    @ObfuscatedName("client.er")
    public static int field1975 = 0;

    @ObfuscatedName("client.ea")
    public static class95[] field1976 = new class95[4];

    @ObfuscatedName("client.ee")
    public static boolean field2157 = false;

    @ObfuscatedName("client.eb")
    public static int[][][] field2042 = new int[4][13][13];

    @ObfuscatedName("client.ej")
    public static final int[] field2133 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.ev")
    public static int field1980 = 0;

    @ObfuscatedName("client.em")
    public static int[][] field2100 = new int[104][104];

    @ObfuscatedName("client.ef")
    public static int[][] field1982 = new int[104][104];

    @ObfuscatedName("client.ec")
    public static int[] field1983 = new int[4000];

    @ObfuscatedName("client.ei")
    public static int[] field2052 = new int[4000];

    @ObfuscatedName("client.ek")
    public static int field1985 = 0;

    @ObfuscatedName("client.el")
    public static int field1986 = 2;

    @ObfuscatedName("client.ez")
    public static int field2112 = 0;

    @ObfuscatedName("client.eu")
    public static int field1988 = 2;

    @ObfuscatedName("client.ff")
    public static int field1989 = 0;

    @ObfuscatedName("client.fc")
    public static int field1990 = 1;

    @ObfuscatedName("client.ft")
    public static int field1991 = 0;

    @ObfuscatedName("client.fo")
    public static int field1992 = 0;

    @ObfuscatedName("client.fd")
    public static int field1993 = 2;

    @ObfuscatedName("client.fg")
    public static int field1994 = 0;

    @ObfuscatedName("client.fw")
    public static int field1972 = 1;

    @ObfuscatedName("client.fa")
    public static int field1996 = 0;

    @ObfuscatedName("client.fk")
    public static int field1997 = 0;

    @ObfuscatedName("client.gx")
    public static int field2136 = 2301979;

    @ObfuscatedName("client.gj")
    public static int field2080 = 5063219;

    @ObfuscatedName("client.gr")
    public static int field2000 = 3353893;

    @ObfuscatedName("client.gd")
    public static int field2108 = 7759444;

    @ObfuscatedName("client.go")
    public static boolean field2071 = false;

    @ObfuscatedName("client.gf")
    public static int field1968 = 0;

    @ObfuscatedName("client.ga")
    public static int field1915 = 128;

    @ObfuscatedName("client.gl")
    public static int field1955 = 0;

    @ObfuscatedName("client.gq")
    public static int field2058 = 0;

    @ObfuscatedName("client.gh")
    public static int field2007 = 0;

    @ObfuscatedName("client.gy")
    public static int field1956 = 0;

    @ObfuscatedName("client.gm")
    public static boolean field2009 = false;

    @ObfuscatedName("client.gn")
    public static int field2144 = 0;

    @ObfuscatedName("client.gv")
    public static int field2011 = 0;

    @ObfuscatedName("client.gs")
    public static int field1971 = 50;

    @ObfuscatedName("client.gt")
    public static int[] field2013 = new int[field1971];

    @ObfuscatedName("client.gc")
    public static int[] field2014 = new int[field1971];

    @ObfuscatedName("client.gp")
    public static int[] field2015 = new int[field1971];

    @ObfuscatedName("client.hj")
    public static int[] field2029 = new int[field1971];

    @ObfuscatedName("client.hy")
    public static int[] field2017 = new int[field1971];

    @ObfuscatedName("client.hr")
    public static int[] field2035 = new int[field1971];

    @ObfuscatedName("client.hx")
    public static int[] field2019 = new int[field1971];

    @ObfuscatedName("client.hv")
    public static String[] field2024 = new String[field1971];

    @ObfuscatedName("client.hm")
    public static int[][] field2021 = new int[104][104];

    @ObfuscatedName("client.ho")
    public static int field2107 = 0;

    @ObfuscatedName("client.hs")
    public static int field2070 = -1;

    @ObfuscatedName("client.hp")
    public static int field1937 = -1;

    @ObfuscatedName("client.hn")
    public static int field2053 = 0;

    @ObfuscatedName("client.ht")
    public static int field2026 = 0;

    @ObfuscatedName("client.hh")
    public static int field2163 = 0;

    @ObfuscatedName("client.hz")
    public static int field2028 = 0;

    @ObfuscatedName("client.hb")
    public static int field1934 = 0;

    @ObfuscatedName("client.he")
    public static int field1987 = 0;

    @ObfuscatedName("client.hq")
    public static int field2031 = 0;

    @ObfuscatedName("client.hd")
    public static int field2032 = 0;

    @ObfuscatedName("client.ha")
    public static int field1944 = 0;

    @ObfuscatedName("client.hk")
    public static int field1946 = 0;

    @ObfuscatedName("client.hf")
    public static boolean field2025 = false;

    @ObfuscatedName("client.hi")
    public static int field2036 = 0;

    @ObfuscatedName("client.hc")
    public static int field2037 = 0;

    @ObfuscatedName("client.ie")
    public static class183[] field2040 = new class183[2048];

    @ObfuscatedName("client.im")
    public static int field2041 = 0;

    @ObfuscatedName("client.ib")
    public static int[] field2166 = new int[2048];

    @ObfuscatedName("client.il")
    public static int field2043 = 0;

    @ObfuscatedName("client.ip")
    public static int[] field2044 = new int[2048];

    @ObfuscatedName("client.iw")
    public static class136[] field2045 = new class136[2048];

    @ObfuscatedName("client.ih")
    public static int field2078 = -1;

    @ObfuscatedName("client.id")
    public static int field1929 = 0;

    @ObfuscatedName("client.iq")
    public static int field2012 = 0;

    @ObfuscatedName("client.ir")
    public static int[] field2050 = new int[1000];

    @ObfuscatedName("client.ia")
    public static final int[] field2195 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ii")
    public static String[] field2047 = new String[8];

    @ObfuscatedName("client.if")
    public static boolean[] field2054 = new boolean[8];

    @ObfuscatedName("client.iu")
    public static int[] field2055 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ij")
    public static class105[][][] field2056 = new class105[4][104][104];

    @ObfuscatedName("client.ik")
    public static class105 field2057 = new class105();

    @ObfuscatedName("client.iy")
    public static class105 field2135 = new class105();

    @ObfuscatedName("client.io")
    public static class105 field2059 = new class105();

    @ObfuscatedName("client.ig")
    public static int[] field2060 = new int[25];

    @ObfuscatedName("client.jz")
    public static int[] field2061 = new int[25];

    @ObfuscatedName("client.jj")
    public static int[] field2093 = new int[25];

    @ObfuscatedName("client.jc")
    public static int field2063 = 0;

    @ObfuscatedName("client.jf")
    public static boolean field2064 = false;

    @ObfuscatedName("client.jy")
    public static int field2066 = 0;

    @ObfuscatedName("client.jn")
    public static int[] field2067 = new int[500];

    @ObfuscatedName("client.jw")
    public static int[] field2068 = new int[500];

    @ObfuscatedName("client.jd")
    public static int[] field2069 = new int[500];

    @ObfuscatedName("client.js")
    public static int[] field2085 = new int[500];

    @ObfuscatedName("client.jr")
    public static String[] field2153 = new String[500];

    @ObfuscatedName("client.jg")
    public static String[] field2072 = new String[500];

    @ObfuscatedName("client.ji")
    public static int field2073 = -1;

    @ObfuscatedName("client.ju")
    public static int field2003 = -1;

    @ObfuscatedName("client.jm")
    public static int field1936 = 0;

    @ObfuscatedName("client.jq")
    public static int field2076 = 50;

    @ObfuscatedName("client.jx")
    public static int field2077 = 0;

    @ObfuscatedName("client.it")
    public static String field2143 = null;

    @ObfuscatedName("client.jb")
    public static boolean field2079 = false;

    @ObfuscatedName("client.kg")
    public static int field1931 = -1;

    @ObfuscatedName("client.kp")
    public static String field2081 = null;

    @ObfuscatedName("client.kv")
    public static String field2082 = null;

    @ObfuscatedName("client.kf")
    public static int field2168 = -1;

    @ObfuscatedName("client.ke")
    public static class104 field2160 = new class104(8);

    @ObfuscatedName("client.ks")
    public static int field2125 = 0;

    @ObfuscatedName("client.kn")
    public static int field2086 = 0;

    @ObfuscatedName("client.kb")
    public static class141 field2087 = null;

    @ObfuscatedName("client.kq")
    public static int field1908 = 0;

    @ObfuscatedName("client.kw")
    public static int field2140 = 0;

    @ObfuscatedName("client.kr")
    public static int field2090 = 0;

    @ObfuscatedName("client.ka")
    public static boolean field2091 = false;

    @ObfuscatedName("client.ku")
    public static boolean field2092 = false;

    @ObfuscatedName("client.ko")
    public static boolean field1964 = false;

    @ObfuscatedName("client.kx")
    public static class141 field2182 = null;

    @ObfuscatedName("client.kk")
    public static class141 field2095 = null;

    @ObfuscatedName("client.kt")
    public static int field2096 = 0;

    @ObfuscatedName("client.kl")
    public static int field2023 = 0;

    @ObfuscatedName("client.kd")
    public static class141 field2098 = null;

    @ObfuscatedName("client.kh")
    public static boolean field2099 = false;

    @ObfuscatedName("client.km")
    public static int field2084 = -1;

    @ObfuscatedName("client.kz")
    public static int field2020 = -1;

    @ObfuscatedName("client.ki")
    public static boolean field2137 = false;

    @ObfuscatedName("client.kj")
    public static int field2022 = -1;

    @ObfuscatedName("client.ky")
    public static int field2104 = -1;

    @ObfuscatedName("client.lg")
    public static boolean field2105 = false;

    @ObfuscatedName("client.lb")
    public static int field1954 = 1;

    @ObfuscatedName("client.lq")
    public static int[] field2109 = new int[32];

    @ObfuscatedName("client.ls")
    public static int field2110 = 0;

    @ObfuscatedName("client.lc")
    public static int[] field2189 = new int[32];

    @ObfuscatedName("client.lk")
    public static int field1951 = 0;

    @ObfuscatedName("client.ll")
    public static int[] field2008 = new int[32];

    @ObfuscatedName("client.ln")
    public static int field2114 = 0;

    @ObfuscatedName("client.lf")
    public static int field2115 = 0;

    @ObfuscatedName("client.ly")
    public static int field2116 = 0;

    @ObfuscatedName("client.lw")
    public static int field2117 = 0;

    @ObfuscatedName("client.lz")
    public static int field2118 = 0;

    @ObfuscatedName("client.lo")
    public static int[] field2119 = new int[2000];

    @ObfuscatedName("client.lp")
    public static String[] field2120 = new String[1000];

    @ObfuscatedName("client.lj")
    public static int field2121 = 0;

    @ObfuscatedName("client.lt")
    public static class105 field2191 = new class105();

    @ObfuscatedName("client.lm")
    public static class105 field2123 = new class105();

    @ObfuscatedName("client.le")
    public static class105 field2124 = new class105();

    @ObfuscatedName("client.lx")
    public static class104 field2176 = new class104(512);

    @ObfuscatedName("client.mk")
    public static int field2127 = 0;

    @ObfuscatedName("client.ma")
    public static int field2128 = -2;

    @ObfuscatedName("client.mt")
    public static boolean[] field2129 = new boolean[100];

    @ObfuscatedName("client.mg")
    public static boolean[] field2130 = new boolean[100];

    @ObfuscatedName("client.mb")
    public static boolean[] field2131 = new boolean[100];

    @ObfuscatedName("client.mw")
    public static int[] field1979 = new int[100];

    @ObfuscatedName("client.mn")
    public static int[] field2049 = new int[100];

    @ObfuscatedName("client.mf")
    public static int[] field2134 = new int[100];

    @ObfuscatedName("client.mm")
    public static int[] field2151 = new int[100];

    @ObfuscatedName("client.mx")
    public static int field2156 = 0;

    @ObfuscatedName("client.mz")
    public static int[] field2138 = new int[100];

    @ObfuscatedName("client.mu")
    public static String[] field2139 = new String[100];

    @ObfuscatedName("client.ms")
    public static String[] field1910 = new String[100];

    @ObfuscatedName("client.ml")
    public static String[] field2097 = new String[100];

    @ObfuscatedName("client.mi")
    public static int field2142 = 0;

    @ObfuscatedName("client.mj")
    public static int[] field2187 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.my")
    public static int field2122 = 0;

    @ObfuscatedName("client.mq")
    public static int field2145 = 0;

    @ObfuscatedName("client.mp")
    public static long[] field2006 = new long[100];

    @ObfuscatedName("client.mh")
    public static int field2148 = 0;

    @ObfuscatedName("client.mr")
    public static int field2150 = 0;

    @ObfuscatedName("client.nb")
    public static int[] field2169 = new int[128];

    @ObfuscatedName("client.nq")
    public static int[] field2152 = new int[128];

    @ObfuscatedName("client.ni")
    public static String field1921 = null;

    @ObfuscatedName("client.nt")
    public static String field2154 = null;

    @ObfuscatedName("client.nx")
    public static int field2155 = -1;

    @ObfuscatedName("client.nf")
    public static int field2010 = 0;

    @ObfuscatedName("client.ne")
    public static int[] field1978 = new int[1000];

    @ObfuscatedName("client.na")
    public static int[] field2158 = new int[1000];

    @ObfuscatedName("client.nc")
    public static class171[] field2159 = new class171[1000];

    @ObfuscatedName("client.nk")
    public static int field2089 = 0;

    @ObfuscatedName("client.nu")
    public static int field2161 = 0;

    @ObfuscatedName("client.ng")
    public static int field2167 = 0;

    @ObfuscatedName("client.nw")
    public static int field2075 = 255;

    @ObfuscatedName("client.no")
    public static int field1932 = -1;

    @ObfuscatedName("client.ns")
    public static boolean field2170 = false;

    @ObfuscatedName("client.ob")
    public static int field2172 = 127;

    @ObfuscatedName("client.oi")
    public static int field2173 = 127;

    @ObfuscatedName("client.ou")
    public static int field2175 = 0;

    @ObfuscatedName("client.of")
    public static int[] field2005 = new int[50];

    @ObfuscatedName("client.oa")
    public static int[] field2177 = new int[50];

    @ObfuscatedName("client.oz")
    public static int[] field2178 = new int[50];

    @ObfuscatedName("client.oy")
    public static int[] field2179 = new int[50];

    @ObfuscatedName("client.ox")
    public static class22[] field2180 = new class22[50];

    @ObfuscatedName("client.op")
    public static boolean field2181 = false;

    @ObfuscatedName("client.oo")
    public static boolean[] field2183 = new boolean[5];

    @ObfuscatedName("client.pg")
    public static int[] field1942 = new int[5];

    @ObfuscatedName("client.pt")
    public static int[] field2185 = new int[5];

    @ObfuscatedName("client.pd")
    public static int[] field2186 = new int[5];

    @ObfuscatedName("client.pb")
    public static int[] field2146 = new int[5];

    @ObfuscatedName("client.pa")
    public static int field2188 = 0;

    @ObfuscatedName("client.pc")
    public static int field2001 = 0;

    @ObfuscatedName("client.pl")
    public static class10[] field2030 = new class10[200];

    @ObfuscatedName("client.pf")
    public static class103 field2192 = new class103();

    @ObfuscatedName("client.pp")
    public static int field2193 = 0;

    @ObfuscatedName("client.ph")
    public static class4[] field1959 = new class4[100];

    @ObfuscatedName("client.pu")
    public static class94 field2034 = new class94();

    @ObfuscatedName("client.py")
    public static int field2197 = -1;

    @ObfuscatedName("client.po")
    public static int field2198 = -1;

    @ObfuscatedName("client.n(I)V")
    public final void method1377() {
    }

    public final void init() {
        if (!this.method1364()) {
            return;
        }
        class98[] var1 = class98.method783();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class98 var3 = var1[var2];
            String var4 = this.getParameter(var3.field1479);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field1479)) {
                    case 1:
                        field1911 = Integer.parseInt(var4);
                        break;
                    case 2:
                        field2083 = Integer.parseInt(var4);
                        break;
                    case 3:
                        if (var4.equalsIgnoreCase(class1.field1)) {
                            field1916 = 1;
                        } else {
                            field1916 = 0;
                        }
                    case 4:
                    default:
                        break;
                    case 5:
                        if (var4.equalsIgnoreCase(class1.field1)) {
                            field1913 = true;
                        } else {
                            field1913 = false;
                        }
                        break;
                    case 6:
                        Statics.field557 = var4;
                        break;
                    case 7:
                        Statics.field1521 = (class74) class57.method450(Statics.method855(), Integer.parseInt(var4));
                        if (Statics.field1521 == class74.field877) {
                            Statics.field1912 = class111.field1525;
                        } else {
                            Statics.field1912 = class111.field1531;
                        }
                        break;
                    case 8:
                        Statics.field349 = class73.method41(Integer.parseInt(var4));
                        break;
                    case 9:
                        field2048 = Integer.parseInt(var4);
                }
            }
        }
        method1222();
        Statics.field1126 = this.getCodeBase().getHost();
        String var5 = Statics.field349.field870;
        byte var6 = 0;
        try {
            class39.method916("oldschool", var5, var6, 16);
        } catch (Exception var8) {
            Statics.method244((String) null, var8);
        }
        Statics.field769 = this;
        this.method1356(765, 503, 3);
    }

    @ObfuscatedName("cn.ci(I)V")
    public static final void method1222() {
        class45.field592 = false;
        field1914 = false;
    }

    @ObfuscatedName("client.y(S)V")
    public final void method1366() {
        Statics.field124 = field1911 == 0 ? 43594 : field2083 + 40000;
        Statics.field355 = field1911 == 0 ? 443 : field2083 + 50000;
        Statics.field1244 = Statics.field124;
        Statics.field834 = class92.field1222;
        Statics.field1239 = class92.field1223;
        Statics.field1232 = class92.field1224;
        Statics.field1240 = class92.field1225;
        class36.method345();
        Canvas var1 = Statics.field558;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class36.field458);
        var1.addFocusListener(class36.field458);
        Canvas var2 = Statics.field558;
        var2.addMouseListener(class37.field494);
        var2.addMouseMotionListener(class37.field494);
        var2.addFocusListener(class37.field494);
        Statics.field739 = class28.method848();
        if (Statics.field739 != null) {
            Statics.field739.method327(Statics.field558);
        }
        Statics.field315 = new class33(255, class39.field530, class39.field529, 500000);
        if (field1911 != 0) {
            field1925 = true;
        }
    }

    @ObfuscatedName("client.b(I)V")
    public final void method1413() {
        field1919++;
        this.method1957();
        while (true) {
            class105 var1 = class89.field1213;
            class140 var2;
            synchronized (class89.field1213) {
                var2 = (class140) class89.field1211.method1294();
            }
            if (var2 == null) {
                class79.method478();
                method1785();
                class36 var4 = class36.field458;
                synchronized (class36.field458) {
                    class36.field487++;
                    class36.field486 = class36.field459;
                    if (class36.field406 >= 0) {
                        while (class36.field480 != class36.field406) {
                            int var6 = class36.field479[class36.field480];
                            class36.field480 = class36.field480 + 1 & 0x7F;
                            if (var6 < 0) {
                                class36.field478[~var6] = false;
                            } else {
                                class36.field478[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class36.field478[var5] = false;
                        }
                        class36.field406 = class36.field480;
                    }
                    class36.field459 = class36.field424;
                }
                class37.method85();
                if (Statics.field739 != null) {
                    int var8 = Statics.field739.method330();
                    field2121 = var8;
                }
                if (field1917 == 0) {
                    method723();
                    class112.method847();
                } else if (field1917 == 5) {
                    class9.method905(this);
                    method723();
                    class112.method847();
                } else if (field1917 == 10) {
                    class9.method905(this);
                } else if (field1917 == 20) {
                    class9.method905(this);
                    method795();
                } else if (field1917 == 25) {
                    Statics.method898();
                }
                if (field1917 == 30) {
                    if (field1926 > 1) {
                        field1926--;
                    }
                    if (field1965 > 0) {
                        field1965--;
                    }
                    if (field1967) {
                        field1967 = false;
                        method2332();
                    } else {
                        for (int var9 = 0; var9 < 100 && method1225(); var9++) {
                        }
                        if (field1917 == 30) {
                            class109.method57(field2162, 222);
                            Object var10 = Statics.field550.field113;
                            synchronized (Statics.field550.field113) {
                                if (!field1909) {
                                    Statics.field550.field114 = 0;
                                } else if (class37.field504 != 0 || Statics.field550.field114 >= 40) {
                                    field2162.method2308(102);
                                    field2162.method1612(0);
                                    int var11 = field2162.field1722;
                                    int var12 = 0;
                                    for (int var13 = 0; var13 < Statics.field550.field114 && field2162.field1722 - var11 < 240; var13++) {
                                        var12++;
                                        int var14 = Statics.field550.field115[var13];
                                        if (var14 < 0) {
                                            var14 = 0;
                                        } else if (var14 > 502) {
                                            var14 = 502;
                                        }
                                        int var15 = Statics.field550.field116[var13];
                                        if (var15 < 0) {
                                            var15 = 0;
                                        } else if (var15 > 764) {
                                            var15 = 764;
                                        }
                                        int var16 = var14 * 765 + var15;
                                        if (Statics.field550.field115[var13] == -1 && Statics.field550.field116[var13] == -1) {
                                            var15 = -1;
                                            var14 = -1;
                                            var16 = 524287;
                                        }
                                        if (field2016 != var15 || field1922 != var14) {
                                            int var17 = var15 - field2016;
                                            field2016 = var15;
                                            int var18 = var14 - field1922;
                                            field1922 = var14;
                                            if (field1923 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                                var17 += 32;
                                                var18 += 32;
                                                field2162.method1680((field1923 << 12) + (var17 << 6) + var18);
                                                field1923 = 0;
                                            } else if (field1923 < 8) {
                                                field2162.method1591((field1923 << 19) + 8388608 + var16);
                                                field1923 = 0;
                                            } else {
                                                field2162.method1592((field1923 << 19) + -1073741824 + var16);
                                                field1923 = 0;
                                            }
                                        } else if (field1923 < 2047) {
                                            field1923++;
                                        }
                                    }
                                    field2162.method1599(field2162.field1722 - var11);
                                    if (var12 >= Statics.field550.field114) {
                                        Statics.field550.field114 = 0;
                                    } else {
                                        Statics.field550.field114 -= var12;
                                        for (int var19 = 0; var19 < Statics.field550.field114; var19++) {
                                            Statics.field550.field116[var19] = Statics.field550.field116[var12 + var19];
                                            Statics.field550.field115[var19] = Statics.field550.field115[var12 + var19];
                                        }
                                    }
                                }
                            }
                            if (class37.field504 != 0) {
                                long var21 = (class37.field507 - field1998 * -8825884552046035273L) / 50L;
                                if (var21 > 4095L) {
                                    var21 = 4095L;
                                }
                                field1998 = class37.field507 * 932015242072489735L;
                                int var23 = class37.field506;
                                if (var23 < 0) {
                                    var23 = 0;
                                } else if (var23 > 502) {
                                    var23 = 502;
                                }
                                int var24 = class37.field505;
                                if (var24 < 0) {
                                    var24 = 0;
                                } else if (var24 > 764) {
                                    var24 = 764;
                                }
                                int var25 = var23 * 765 + var24;
                                byte var26 = 0;
                                if (class37.field504 == 2) {
                                    var26 = 1;
                                }
                                int var27 = (int) var21;
                                field2162.method2308(95);
                                field2162.method1598((var26 << 19) + (var27 << 20) + var25);
                            }
                            if (field1956 > 0) {
                                field1956--;
                            }
                            if (class36.field478[96] || class36.field478[97] || class36.field478[98] || class36.field478[99]) {
                                field2009 = true;
                            }
                            if (field2009 && field1956 <= 0) {
                                field1956 = 20;
                                field2009 = false;
                                field2162.method2308(229);
                                field2162.method1635(field1955);
                                field2162.method1635(field1915);
                            }
                            if (Statics.field1555 && !field1924) {
                                field1924 = true;
                                field2162.method2308(43);
                                field2162.method1612(1);
                            }
                            if (!Statics.field1555 && field1924) {
                                field1924 = false;
                                field2162.method2308(43);
                                field2162.method1612(0);
                            }
                            method721();
                            if (field1917 == 30) {
                                for (class128 var28 = (class128) field2057.method1298(); var28 != null; var28 = (class128) field2057.method1299()) {
                                    if (var28.field1630 > 0) {
                                        var28.field1630--;
                                    }
                                    if (var28.field1630 != 0) {
                                        if (var28.field1636 > 0) {
                                            var28.field1636--;
                                        }
                                        if (var28.field1636 == 0 && var28.field1637 >= 1 && var28.field1629 >= 1 && var28.field1637 <= 102 && var28.field1629 <= 102 && (var28.field1633 < 0 || class3.method2899(var28.field1633, var28.field1632))) {
                                            method1116(var28.field1635, var28.field1627, var28.field1637, var28.field1629, var28.field1633, var28.field1634, var28.field1632);
                                            var28.field1636 = -1;
                                            if (var28.field1633 == var28.field1626 && var28.field1626 == -1) {
                                                var28.method1328();
                                            } else if (var28.field1633 == var28.field1626 && var28.field1634 == var28.field1631 && var28.field1632 == var28.field1628) {
                                                var28.method1328();
                                            }
                                        }
                                    } else if (var28.field1626 < 0 || class3.method2899(var28.field1626, var28.field1628)) {
                                        method1116(var28.field1635, var28.field1627, var28.field1637, var28.field1629, var28.field1626, var28.field1631, var28.field1628);
                                        var28.method1328();
                                    }
                                }
                                int var10002;
                                for (int var29 = 0; var29 < field2175; var29++) {
                                    var10002 = field2178[var29]--;
                                    if (field2178[var29] >= -10) {
                                        class22 var31 = field2180[var29];
                                        if (var31 == null) {
                                            class22 var10000 = (class22) null;
                                            var31 = class22.method263(Statics.field51, field2005[var29], 0);
                                            if (var31 == null) {
                                                continue;
                                            }
                                            field2178[var29] += var31.method255();
                                            field2180[var29] = var31;
                                        }
                                        if (field2178[var29] < 0) {
                                            int var38;
                                            if (field2179[var29] == 0) {
                                                var38 = field2172;
                                            } else {
                                                int var32 = (field2179[var29] & 0xFF) * 128;
                                                int var33 = field2179[var29] >> 16 & 0xFF;
                                                int var34 = var33 * 128 + 64 - Statics.field1230.field2630;
                                                if (var34 < 0) {
                                                    var34 = -var34;
                                                }
                                                int var35 = field2179[var29] >> 8 & 0xFF;
                                                int var36 = var35 * 128 + 64 - Statics.field1230.field2615;
                                                if (var36 < 0) {
                                                    var36 = -var36;
                                                }
                                                int var37 = var34 + var36 - 128;
                                                if (var37 > var32) {
                                                    field2178[var29] = -100;
                                                    continue;
                                                }
                                                if (var37 < 0) {
                                                    var37 = 0;
                                                }
                                                var38 = field2173 * (var32 - var37) / var32;
                                            }
                                            if (var38 > 0) {
                                                class146 var39 = var31.method256().method2051(Statics.field810);
                                                class147 var40 = class147.method2055(var39, 100, var38);
                                                var40.method2058(field2177[var29] - 1);
                                                Statics.field1493.method2194(var40);
                                            }
                                            field2178[var29] = -100;
                                        }
                                    } else {
                                        field2175--;
                                        for (int var30 = var29; var30 < field2175; var30++) {
                                            field2005[var30] = field2005[var30 + 1];
                                            field2180[var30] = field2180[var30 + 1];
                                            field2177[var30] = field2177[var30 + 1];
                                            field2178[var30] = field2178[var30 + 1];
                                            field2179[var30] = field2179[var30 + 1];
                                        }
                                        var29--;
                                    }
                                }
                                if (field2170) {
                                    boolean var41;
                                    if (class79.field1130 == 0) {
                                        var41 = Statics.field1131.method2214();
                                    } else {
                                        var41 = true;
                                    }
                                    if (!var41) {
                                        if (field2075 != 0 && field1932 != -1) {
                                            class79.method278(Statics.field702, field1932, 0, field2075, false);
                                        }
                                        field2170 = false;
                                    }
                                }
                                field1961++;
                                if (field1961 > 750) {
                                    method2332();
                                } else {
                                    Statics.method1333();
                                    for (int var42 = 0; var42 < field1999; var42++) {
                                        int var43 = field1984[var42];
                                        class184 var44 = field2062[var43];
                                        if (var44 != null) {
                                            method430(var44, var44.field2805.field2272);
                                        }
                                    }
                                    for (int var45 = -1; var45 < field2041; var45++) {
                                        int var46;
                                        if (var45 == -1) {
                                            var46 = 2047;
                                        } else {
                                            var46 = field2166[var45];
                                        }
                                        class183 var47 = field2040[var46];
                                        if (var47 != null && var47.field2628 > 0) {
                                            var47.field2628--;
                                            if (var47.field2628 == 0) {
                                                var47.field2627 = null;
                                            }
                                        }
                                    }
                                    for (int var48 = 0; var48 < field1999; var48++) {
                                        int var49 = field1984[var48];
                                        class184 var50 = field2062[var49];
                                        if (var50 != null && var50.field2628 > 0) {
                                            var50.field2628--;
                                            if (var50.field2628 == 0) {
                                                var50.field2627 = null;
                                            }
                                        }
                                    }
                                    field1997++;
                                    if (field2028 != 0) {
                                        field2163 += 20;
                                        if (field2163 >= 400) {
                                            field2028 = 0;
                                        }
                                    }
                                    if (Statics.field127 != null) {
                                        field1934++;
                                        if (field1934 >= 15) {
                                            method542(Statics.field127);
                                            Statics.field127 = null;
                                        }
                                    }
                                    if (Statics.field822 != null) {
                                        method542(Statics.field822);
                                        field2036++;
                                        if (class37.field492 > field2032 + 5 || class37.field492 < field2032 - 5 || class37.field499 > field1944 + 5 || class37.field499 < field1944 - 5) {
                                            field2025 = true;
                                        }
                                        if (class37.field497 == 0) {
                                            if (field2025 && field2036 >= 5) {
                                                if (Statics.field822 == Statics.field351 && field2031 != field1946) {
                                                    class141 var51 = Statics.field822;
                                                    byte var52 = 0;
                                                    if (field2086 == 1 && var51.field1779 == 206) {
                                                        var52 = 1;
                                                    }
                                                    if (var51.field1799[field1946] <= 0) {
                                                        var52 = 0;
                                                    }
                                                    if (class93.method2900(method101(var51))) {
                                                        int var53 = field2031;
                                                        int var54 = field1946;
                                                        var51.field1799[var54] = var51.field1799[var53];
                                                        var51.field1878[var54] = var51.field1878[var53];
                                                        var51.field1799[var53] = -1;
                                                        var51.field1878[var53] = 0;
                                                    } else if (var52 == 1) {
                                                        int var55 = field2031;
                                                        int var56 = field1946;
                                                        while (var55 != var56) {
                                                            if (var55 > var56) {
                                                                var51.method1793(var55 - 1, var55);
                                                                var55--;
                                                            } else if (var55 < var56) {
                                                                var51.method1793(var55 + 1, var55);
                                                                var55++;
                                                            }
                                                        }
                                                    } else {
                                                        var51.method1793(field1946, field2031);
                                                    }
                                                    field2162.method2308(255);
                                                    field2162.method1631(field2031);
                                                    field2162.method1612(var52);
                                                    field2162.method1640(Statics.field822.field1767);
                                                    field2162.method1635(field1946);
                                                }
                                            } else if ((field2063 == 1 || method1474(field2066 - 1)) && field2066 > 2) {
                                                Statics.method806();
                                            } else if (field2066 > 0) {
                                                method1341(field2066 - 1);
                                            }
                                            field1934 = 10;
                                            class37.field504 = 0;
                                            Statics.field822 = null;
                                        }
                                    }
                                    class141 var57 = Statics.field1738;
                                    class141 var58 = Statics.field1228;
                                    Statics.field1738 = null;
                                    Statics.field1228 = null;
                                    field2098 = null;
                                    field2137 = false;
                                    field2099 = false;
                                    field2150 = 0;
                                    while (true) {
                                        class36 var59 = class36.field458;
                                        boolean var60;
                                        synchronized (class36.field458) {
                                            if (class36.field486 == class36.field459) {
                                                var60 = false;
                                            } else {
                                                Statics.field9 = class36.field483[class36.field486];
                                                Statics.field1168 = class36.field407[class36.field486];
                                                class36.field486 = class36.field486 + 1 & 0x7F;
                                                var60 = true;
                                            }
                                        }
                                        if (!var60 || field2150 >= 128) {
                                            int var62 = field2168;
                                            if (class141.method1494(var62)) {
                                                method2049(Statics.field1807[var62], -1, 0, 0, 765, 503, 0, 0);
                                            }
                                            field1954++;
                                            while (true) {
                                                class123 var63;
                                                class141 var64;
                                                class141 var65;
                                                do {
                                                    var63 = (class123) field2123.method1294();
                                                    if (var63 == null) {
                                                        while (true) {
                                                            class123 var66;
                                                            class141 var67;
                                                            class141 var68;
                                                            do {
                                                                var66 = (class123) field2124.method1294();
                                                                if (var66 == null) {
                                                                    while (true) {
                                                                        class123 var69;
                                                                        class141 var70;
                                                                        class141 var71;
                                                                        do {
                                                                            var69 = (class123) field2191.method1294();
                                                                            if (var69 == null) {
                                                                                if (field2182 != null) {
                                                                                    method542(field2182);
                                                                                    Statics.field1492++;
                                                                                    if (field2137 && field2099) {
                                                                                        int var72 = class37.field492;
                                                                                        int var73 = class37.field499;
                                                                                        int var74 = var72 - field2096;
                                                                                        int var75 = var73 - field2023;
                                                                                        if (var74 < field2084) {
                                                                                            var74 = field2084;
                                                                                        }
                                                                                        if (field2182.field1782 + var74 > field2084 + field2095.field1782) {
                                                                                            var74 = field2084 + field2095.field1782 - field2182.field1782;
                                                                                        }
                                                                                        if (var75 < field2020) {
                                                                                            var75 = field2020;
                                                                                        }
                                                                                        if (field2182.field1785 + var75 > field2020 + field2095.field1785) {
                                                                                            var75 = field2020 + field2095.field1785 - field2182.field1785;
                                                                                        }
                                                                                        int var76 = var74 - field2022;
                                                                                        int var77 = var75 - field2104;
                                                                                        int var78 = field2182.field1838;
                                                                                        if (Statics.field1492 > field2182.field1860 && (var76 > var78 || var76 < -var78 || var77 > var78 || var77 < -var78)) {
                                                                                            field2105 = true;
                                                                                        }
                                                                                        int var79 = field2095.field1840 + (var74 - field2084);
                                                                                        int var80 = field2095.field1789 + (var75 - field2020);
                                                                                        if (field2182.field1851 != null && field2105) {
                                                                                            class123 var81 = new class123();
                                                                                            var81.field1592 = field2182;
                                                                                            var81.field1593 = var79;
                                                                                            var81.field1594 = var80;
                                                                                            var81.field1590 = field2182.field1851;
                                                                                            class12.method1103(var81);
                                                                                        }
                                                                                        if (class37.field497 == 0) {
                                                                                            if (field2105) {
                                                                                                if (field2182.field1857 != null) {
                                                                                                    class123 var82 = new class123();
                                                                                                    var82.field1592 = field2182;
                                                                                                    var82.field1593 = var79;
                                                                                                    var82.field1594 = var80;
                                                                                                    var82.field1591 = field2098;
                                                                                                    var82.field1590 = field2182.field1857;
                                                                                                    class12.method1103(var82);
                                                                                                }
                                                                                                if (field2098 != null && Statics.method915(field2182) != null) {
                                                                                                    field2162.method2308(53);
                                                                                                    field2162.method1630(field2098.field1776);
                                                                                                    field2162.method1640(field2098.field1767);
                                                                                                    field2162.method1631(field2182.field1776);
                                                                                                    field2162.method1592(field2182.field1767);
                                                                                                }
                                                                                            } else if ((field2063 == 1 || method1474(field2066 - 1)) && field2066 > 2) {
                                                                                                Statics.method806();
                                                                                            } else if (field2066 > 0) {
                                                                                                method1341(field2066 - 1);
                                                                                            }
                                                                                            field2182 = null;
                                                                                        }
                                                                                    } else if (Statics.field1492 > 1) {
                                                                                        field2182 = null;
                                                                                    }
                                                                                }
                                                                                if (class45.field623 != -1) {
                                                                                    int var83 = class45.field623;
                                                                                    int var84 = class45.field624;
                                                                                    boolean var85 = Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var83, var84, true, 0, 0, 0, 0, 0, 0);
                                                                                    class45.field623 = -1;
                                                                                    if (var85) {
                                                                                        field2053 = class37.field505;
                                                                                        field2026 = class37.field506;
                                                                                        field2028 = 1;
                                                                                        field2163 = 0;
                                                                                    }
                                                                                }
                                                                                if (Statics.field822 == null && field2182 == null) {
                                                                                    int var86 = class37.field504;
                                                                                    if (field2064) {
                                                                                        if (var86 != 1) {
                                                                                            int var87 = class37.field492;
                                                                                            int var88 = class37.field499;
                                                                                            if (var87 < Statics.field832 - 10 || var87 > Statics.field832 + Statics.field543 + 10 || var88 < Statics.field491 - 10 || var88 > Statics.field491 + Statics.field1598 + 10) {
                                                                                                field2064 = false;
                                                                                                method432(Statics.field832, Statics.field491, Statics.field543, Statics.field1598);
                                                                                            }
                                                                                        }
                                                                                        if (var86 == 1) {
                                                                                            int var89 = Statics.field832;
                                                                                            int var90 = Statics.field491;
                                                                                            int var91 = Statics.field543;
                                                                                            int var92 = class37.field505;
                                                                                            int var93 = class37.field506;
                                                                                            int var94 = -1;
                                                                                            for (int var95 = 0; var95 < field2066; var95++) {
                                                                                                int var96 = (field2066 - 1 - var95) * 15 + var90 + 31;
                                                                                                if (var92 > var89 && var92 < var89 + var91 && var93 > var96 - 13 && var93 < var96 + 3) {
                                                                                                    var94 = var95;
                                                                                                }
                                                                                            }
                                                                                            if (var94 != -1) {
                                                                                                method1341(var94);
                                                                                            }
                                                                                            field2064 = false;
                                                                                            method432(Statics.field832, Statics.field491, Statics.field543, Statics.field1598);
                                                                                        }
                                                                                    } else {
                                                                                        label1305: {
                                                                                            if (var86 == 1 && field2066 > 0) {
                                                                                                int var97 = field2069[field2066 - 1];
                                                                                                if (var97 == 39 || var97 == 40 || var97 == 41 || var97 == 42 || var97 == 43 || var97 == 33 || var97 == 34 || var97 == 35 || var97 == 36 || var97 == 37 || var97 == 38 || var97 == 1005) {
                                                                                                    int var98 = field2067[field2066 - 1];
                                                                                                    int var99 = field2068[field2066 - 1];
                                                                                                    class141 var100 = class141.method451(var99);
                                                                                                    if (class93.method856(method101(var100)) || class93.method2900(method101(var100))) {
                                                                                                        field2025 = false;
                                                                                                        field2036 = 0;
                                                                                                        if (Statics.field822 != null) {
                                                                                                            method542(Statics.field822);
                                                                                                        }
                                                                                                        Statics.field822 = class141.method451(var99);
                                                                                                        field2031 = var98;
                                                                                                        field2032 = class37.field505;
                                                                                                        field1944 = class37.field506;
                                                                                                        method542(Statics.field822);
                                                                                                        break label1305;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            if (var86 == 1 && (field2063 == 1 && field2066 > 2 || method1474(field2066 - 1))) {
                                                                                                var86 = 2;
                                                                                            }
                                                                                            if (var86 == 1 && field2066 > 0) {
                                                                                                method1341(field2066 - 1);
                                                                                            }
                                                                                            if (var86 == 2 && field2066 > 0) {
                                                                                                Statics.method806();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (Statics.field1738 != var57) {
                                                                                    if (var57 != null) {
                                                                                        method542(var57);
                                                                                    }
                                                                                    if (Statics.field1738 != null) {
                                                                                        method542(Statics.field1738);
                                                                                    }
                                                                                }
                                                                                if (Statics.field1228 != var58 && field2076 == field1936) {
                                                                                    if (var58 != null) {
                                                                                        method542(var58);
                                                                                    }
                                                                                    if (Statics.field1228 != null) {
                                                                                        method542(Statics.field1228);
                                                                                    }
                                                                                }
                                                                                if (Statics.field1228 == null) {
                                                                                    if (field1936 > 0) {
                                                                                        field1936--;
                                                                                    }
                                                                                } else if (field1936 < field2076) {
                                                                                    field1936++;
                                                                                    if (field2076 == field1936) {
                                                                                        method542(Statics.field1228);
                                                                                    }
                                                                                }
                                                                                int var101 = field1985 + Statics.field1230.field2630;
                                                                                int var102 = field2112 + Statics.field1230.field2615;
                                                                                if (Statics.field336 - var101 < -500 || Statics.field336 - var101 > 500 || Statics.field738 - var102 < -500 || Statics.field738 - var102 > 500) {
                                                                                    Statics.field336 = var101;
                                                                                    Statics.field738 = var102;
                                                                                }
                                                                                if (Statics.field336 != var101) {
                                                                                    Statics.field336 += (var101 - Statics.field336) / 16;
                                                                                }
                                                                                if (Statics.field738 != var102) {
                                                                                    Statics.field738 += (var102 - Statics.field738) / 16;
                                                                                }
                                                                                if (class36.field478[96]) {
                                                                                    field2058 += (-24 - field2058) / 2;
                                                                                } else if (class36.field478[97]) {
                                                                                    field2058 += (24 - field2058) / 2;
                                                                                } else {
                                                                                    field2058 /= 2;
                                                                                }
                                                                                if (class36.field478[98]) {
                                                                                    field2007 += (12 - field2007) / 2;
                                                                                } else if (class36.field478[99]) {
                                                                                    field2007 += (-12 - field2007) / 2;
                                                                                } else {
                                                                                    field2007 /= 2;
                                                                                }
                                                                                field1955 = field2058 / 2 + field1955 & 0x7FF;
                                                                                field1915 += field2007 / 2;
                                                                                if (field1915 < 128) {
                                                                                    field1915 = 128;
                                                                                }
                                                                                if (field1915 > 383) {
                                                                                    field1915 = 383;
                                                                                }
                                                                                int var103 = Statics.field336 >> 7;
                                                                                int var104 = Statics.field738 >> 7;
                                                                                int var105 = method358(Statics.field336, Statics.field738, Statics.field2046);
                                                                                int var106 = 0;
                                                                                if (var103 > 3 && var104 > 3 && var103 < 100 && var104 < 100) {
                                                                                    for (int var107 = var103 - 4; var107 <= var103 + 4; var107++) {
                                                                                        for (int var108 = var104 - 4; var108 <= var104 + 4; var108++) {
                                                                                            int var109 = Statics.field2046;
                                                                                            if (var109 < 3 && (class3.field18[1][var107][var108] & 0x2) == 2) {
                                                                                                var109++;
                                                                                            }
                                                                                            int var110 = var105 - class3.field23[var109][var107][var108];
                                                                                            if (var110 > var106) {
                                                                                                var106 = var110;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                int var111 = var106 * 192;
                                                                                if (var111 > 98048) {
                                                                                    var111 = 98048;
                                                                                }
                                                                                if (var111 < 32768) {
                                                                                    var111 = 32768;
                                                                                }
                                                                                if (var111 > field2144) {
                                                                                    field2144 += (var111 - field2144) / 24;
                                                                                } else if (var111 < field2144) {
                                                                                    field2144 += (var111 - field2144) / 80;
                                                                                }
                                                                                if (field2181) {
                                                                                    int var112 = Statics.field846 * 128 + 64;
                                                                                    int var113 = Statics.field714 * 128 + 64;
                                                                                    int var114 = method358(var112, var113, Statics.field2046) - Statics.field1907;
                                                                                    if (Statics.field350 < var112) {
                                                                                        Statics.field350 += Statics.field1210 * (var112 - Statics.field350) / 1000 + Statics.field1162;
                                                                                        if (Statics.field350 > var112) {
                                                                                            Statics.field350 = var112;
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field350 > var112) {
                                                                                        Statics.field350 -= Statics.field1210 * (Statics.field350 - var112) / 1000 + Statics.field1162;
                                                                                        if (Statics.field350 < var112) {
                                                                                            Statics.field350 = var112;
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field850 < var114) {
                                                                                        Statics.field850 += Statics.field1210 * (var114 - Statics.field850) / 1000 + Statics.field1162;
                                                                                        if (Statics.field850 > var114) {
                                                                                            Statics.field850 = var114;
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field850 > var114) {
                                                                                        Statics.field850 -= Statics.field1210 * (Statics.field850 - var114) / 1000 + Statics.field1162;
                                                                                        if (Statics.field850 < var114) {
                                                                                            Statics.field850 = var114;
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field759 < var113) {
                                                                                        Statics.field759 += Statics.field1210 * (var113 - Statics.field759) / 1000 + Statics.field1162;
                                                                                        if (Statics.field759 > var113) {
                                                                                            Statics.field759 = var113;
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field759 > var113) {
                                                                                        Statics.field759 -= Statics.field1210 * (Statics.field759 - var113) / 1000 + Statics.field1162;
                                                                                        if (Statics.field759 < var113) {
                                                                                            Statics.field759 = var113;
                                                                                        }
                                                                                    }
                                                                                    int var115 = Statics.field1515 * 128 + 64;
                                                                                    int var116 = Statics.field1117 * 128 + 64;
                                                                                    int var117 = method358(var115, var116, Statics.field2046) - Statics.field112;
                                                                                    int var118 = var115 - Statics.field350;
                                                                                    int var119 = var117 - Statics.field850;
                                                                                    int var120 = var116 - Statics.field759;
                                                                                    int var121 = (int) Math.sqrt((double) (var118 * var118 + var120 * var120));
                                                                                    int var122 = (int) (Math.atan2((double) var119, (double) var121) * 325.949D) & 0x7FF;
                                                                                    int var123 = (int) (Math.atan2((double) var118, (double) var120) * -325.949D) & 0x7FF;
                                                                                    if (var122 < 128) {
                                                                                        var122 = 128;
                                                                                    }
                                                                                    if (var122 > 383) {
                                                                                        var122 = 383;
                                                                                    }
                                                                                    if (Statics.field827 < var122) {
                                                                                        Statics.field827 += Statics.field200 * (var122 - Statics.field827) / 1000 + Statics.field694;
                                                                                        if (Statics.field827 > var122) {
                                                                                            Statics.field827 = var122;
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field827 > var122) {
                                                                                        Statics.field827 -= Statics.field200 * (Statics.field827 - var122) / 1000 + Statics.field694;
                                                                                        if (Statics.field827 < var122) {
                                                                                            Statics.field827 = var122;
                                                                                        }
                                                                                    }
                                                                                    int var124 = var123 - Statics.field1227;
                                                                                    if (var124 > 1024) {
                                                                                        var124 -= 2048;
                                                                                    }
                                                                                    if (var124 < -1024) {
                                                                                        var124 += 2048;
                                                                                    }
                                                                                    if (var124 > 0) {
                                                                                        Statics.field1227 += Statics.field200 * var124 / 1000 + Statics.field694;
                                                                                        Statics.field1227 &= 0x7FF;
                                                                                    }
                                                                                    if (var124 < 0) {
                                                                                        Statics.field1227 -= Statics.field200 * -var124 / 1000 + Statics.field694;
                                                                                        Statics.field1227 &= 0x7FF;
                                                                                    }
                                                                                    int var125 = var123 - Statics.field1227;
                                                                                    if (var125 > 1024) {
                                                                                        var125 -= 2048;
                                                                                    }
                                                                                    if (var125 < -1024) {
                                                                                        var125 += 2048;
                                                                                    }
                                                                                    if (var125 < 0 && var124 > 0 || var125 > 0 && var124 < 0) {
                                                                                        Statics.field1227 = var123;
                                                                                    }
                                                                                }
                                                                                for (int var126 = 0; var126 < 5; var126++) {
                                                                                    var10002 = field2146[var126]++;
                                                                                }
                                                                                int var127 = ++class37.field493 - 1;
                                                                                int var129 = class36.field487;
                                                                                if (var127 > 15000 && var129 > 15000) {
                                                                                    field1965 = 250;
                                                                                    class37.field493 = 14500;
                                                                                    field2162.method2308(236);
                                                                                }
                                                                                field1991++;
                                                                                if (field1991 > 500) {
                                                                                    field1991 = 0;
                                                                                    int var131 = (int) (Math.random() * 8.0D);
                                                                                    if ((var131 & 0x1) == 1) {
                                                                                        field1985 += field1986;
                                                                                    }
                                                                                    if ((var131 & 0x2) == 2) {
                                                                                        field2112 += field1988;
                                                                                    }
                                                                                    if ((var131 & 0x4) == 4) {
                                                                                        field1989 += field1990;
                                                                                    }
                                                                                }
                                                                                if (field1985 < -50) {
                                                                                    field1986 = 2;
                                                                                }
                                                                                if (field1985 > 50) {
                                                                                    field1986 = -2;
                                                                                }
                                                                                if (field2112 < -55) {
                                                                                    field1988 = 2;
                                                                                }
                                                                                if (field2112 > 55) {
                                                                                    field1988 = -2;
                                                                                }
                                                                                if (field1989 < -40) {
                                                                                    field1990 = 1;
                                                                                }
                                                                                if (field1989 > 40) {
                                                                                    field1990 = -1;
                                                                                }
                                                                                field1996++;
                                                                                if (field1996 > 500) {
                                                                                    field1996 = 0;
                                                                                    int var132 = (int) (Math.random() * 8.0D);
                                                                                    if ((var132 & 0x1) == 1) {
                                                                                        field1992 += field1993;
                                                                                    }
                                                                                    if ((var132 & 0x2) == 2) {
                                                                                        field1994 += field1972;
                                                                                    }
                                                                                }
                                                                                if (field1992 < -60) {
                                                                                    field1993 = 2;
                                                                                }
                                                                                if (field1992 > 60) {
                                                                                    field1993 = -2;
                                                                                }
                                                                                if (field1994 < -20) {
                                                                                    field1972 = 1;
                                                                                }
                                                                                if (field1994 > 10) {
                                                                                    field1972 = -1;
                                                                                }
                                                                                field1962++;
                                                                                if (field1962 > 50) {
                                                                                    field2162.method2308(24);
                                                                                }
                                                                                try {
                                                                                    if (Statics.field728 != null && field2162.field1722 > 0) {
                                                                                        Statics.field728.method371(field2162.field1725, 0, field2162.field1722);
                                                                                        field2162.field1722 = 0;
                                                                                        field1962 = 0;
                                                                                        return;
                                                                                    }
                                                                                } catch (IOException var134) {
                                                                                    method2332();
                                                                                }
                                                                                return;
                                                                            }
                                                                            var70 = var69.field1592;
                                                                            if (var70.field1776 < 0) {
                                                                                break;
                                                                            }
                                                                            var71 = class141.method451(var70.field1786);
                                                                        } while (var71 == null || var71.field1883 == null || var70.field1776 >= var71.field1883.length || var71.field1883[var70.field1776] != var70);
                                                                        class12.method1103(var69);
                                                                    }
                                                                }
                                                                var67 = var66.field1592;
                                                                if (var67.field1776 < 0) {
                                                                    break;
                                                                }
                                                                var68 = class141.method451(var67.field1786);
                                                            } while (var68 == null || var68.field1883 == null || var67.field1776 >= var68.field1883.length || var68.field1883[var67.field1776] != var67);
                                                            class12.method1103(var66);
                                                        }
                                                    }
                                                    var64 = var63.field1592;
                                                    if (var64.field1776 < 0) {
                                                        break;
                                                    }
                                                    var65 = class141.method451(var64.field1786);
                                                } while (var65 == null || var65.field1883 == null || var64.field1776 >= var65.field1883.length || var65.field1883[var64.field1776] != var64);
                                                class12.method1103(var63);
                                            }
                                        }
                                        field2152[field2150] = Statics.field9;
                                        field2169[field2150] = Statics.field1168;
                                        field2150++;
                                    }
                                }
                            }
                        }
                    }
                } else if (field1917 == 40) {
                    method795();
                }
                return;
            }
            var2.field1765.method1467(var2.field1762, (int) var2.field1513, var2.field1763, false);
        }
    }

    @ObfuscatedName("client.w(I)V")
    public final void method1367() {
        boolean var1;
        label274: {
            try {
                if (class79.field1130 == 2) {
                    if (Statics.field41 == null) {
                        Statics.field41 = class137.method1776(Statics.field1125, Statics.field563, Statics.field1128);
                        if (Statics.field41 == null) {
                            var1 = false;
                            break label274;
                        }
                    }
                    if (Statics.field1132 == null) {
                        Statics.field1132 = new class23(Statics.field1133, Statics.field1129);
                    }
                    if (Statics.field1131.method2209(Statics.field41, Statics.field1135, Statics.field1132, 22050)) {
                        Statics.field1131.method2210();
                        Statics.field1131.method2207(Statics.field736);
                        Statics.field1131.method2212(Statics.field41, Statics.field1134);
                        class79.field1130 = 0;
                        Statics.field41 = null;
                        Statics.field1132 = null;
                        Statics.field1125 = null;
                        var1 = true;
                        break label274;
                    }
                }
            } catch (Exception var49) {
                var49.printStackTrace();
                Statics.field1131.method2286();
                class79.field1130 = 0;
                Statics.field41 = null;
                Statics.field1132 = null;
                Statics.field1125 = null;
            }
            var1 = false;
        }
        if (var1 && field2170 && Statics.field564 != null) {
            Statics.field564.method200();
        }
        if (field1543) {
            Canvas var4 = Statics.field558;
            var4.removeKeyListener(class36.field458);
            var4.removeFocusListener(class36.field458);
            class36.field406 = -1;
            Canvas var5 = Statics.field558;
            var5.removeMouseListener(class37.field494);
            var5.removeMouseMotionListener(class37.field494);
            var5.removeFocusListener(class37.field494);
            class37.field498 = 0;
            if (Statics.field739 != null) {
                Statics.field739.method335(Statics.field558);
            }
            this.method1357();
            Canvas var6 = Statics.field558;
            var6.setFocusTraversalKeysEnabled(false);
            var6.addKeyListener(class36.field458);
            var6.addFocusListener(class36.field458);
            class37.method396(Statics.field558);
            if (Statics.field739 != null) {
                Statics.field739.method327(Statics.field558);
            }
        }
        if (field1917 == 0) {
            class112.method688(class9.field143, class9.field152, (Color) null);
        } else if (field1917 == 5) {
            Statics.method536(Statics.field35, Statics.field1119);
        } else if (field1917 == 10) {
            Statics.method536(Statics.field35, Statics.field1119);
        } else if (field1917 == 20) {
            Statics.method536(Statics.field35, Statics.field1119);
        } else if (field1917 == 25) {
            if (field1975 == 1) {
                if (field2111 > field1977) {
                    field1977 = field2111;
                }
                int var7 = (field1977 * 50 - field2111 * 50) / field1977;
                method908(class75.field977 + class1.field7 + class1.field4 + var7 + "%" + class1.field5, false);
            } else if (field1975 == 2) {
                if (field1973 > field1974) {
                    field1974 = field1973;
                }
                int var8 = (field1974 * 50 - field1973 * 50) / field1974 + 50;
                method908(class75.field977 + class1.field7 + class1.field4 + var8 + "%" + class1.field5, false);
            } else {
                method908(class75.field977, false);
            }
        } else if (field1917 == 30) {
            if (!field2064) {
                field2153[0] = class75.field1092;
                field2072[0] = "";
                field2069[0] = 1006;
                field2066 = 1;
            }
            if (field2168 != -1) {
                method1088(field2168);
            }
            for (int var9 = 0; var9 < field2127; var9++) {
                if (field2129[var9]) {
                    field2130[var9] = true;
                }
                field2131[var9] = field2129[var9];
                field2129[var9] = false;
            }
            field2128 = field1919;
            field2073 = -1;
            field2003 = -1;
            Statics.field351 = null;
            if (field2168 != -1) {
                field2127 = 0;
                method124(field2168, 0, 0, 765, 503, 0, 0, -1);
            }
            class165.method2585();
            boolean var10 = false;
            while (!var10) {
                var10 = true;
                for (int var11 = 0; var11 < field2066 - 1; var11++) {
                    if (field2069[var11] < 1000 && field2069[var11 + 1] > 1000) {
                        String var12 = field2072[var11];
                        field2072[var11] = field2072[var11 + 1];
                        field2072[var11 + 1] = var12;
                        String var13 = field2153[var11];
                        field2153[var11] = field2153[var11 + 1];
                        field2153[var11 + 1] = var13;
                        int var14 = field2069[var11];
                        field2069[var11] = field2069[var11 + 1];
                        field2069[var11 + 1] = var14;
                        int var15 = field2067[var11];
                        field2067[var11] = field2067[var11 + 1];
                        field2067[var11 + 1] = var15;
                        int var16 = field2068[var11];
                        field2068[var11] = field2068[var11 + 1];
                        field2068[var11 + 1] = var16;
                        int var17 = field2085[var11];
                        field2085[var11] = field2085[var11 + 1];
                        field2085[var11 + 1] = var17;
                        var10 = false;
                    }
                }
            }
            if (field2064) {
                int var23 = Statics.field832;
                int var24 = Statics.field491;
                int var25 = Statics.field543;
                int var26 = Statics.field1598;
                int var27 = 6116423;
                class165.method2588(var23, var24, var25, var26, var27);
                class165.method2588(var23 + 1, var24 + 1, var25 - 2, 16, 0);
                class165.method2594(var23 + 1, var24 + 18, var25 - 2, var26 - 19, 0);
                Statics.field35.method2852(class75.field1068, var23 + 3, var24 + 14, var27, -1);
                int var28 = class37.field492;
                int var29 = class37.field499;
                for (int var30 = 0; var30 < field2066; var30++) {
                    int var31 = (field2066 - 1 - var30) * 15 + var24 + 31;
                    int var32 = 16777215;
                    if (var28 > var23 && var28 < var23 + var25 && var29 > var31 - 13 && var29 < var31 + 3) {
                        var32 = 16776960;
                    }
                    class182 var33 = Statics.field35;
                    String var34;
                    if (field2072[var30].length() > 0) {
                        var34 = field2153[var30] + class75.field955 + field2072[var30];
                    } else {
                        var34 = field2153[var30];
                    }
                    var33.method2852(var34, var23 + 3, var31, var32, 0);
                }
                int var35 = Statics.field832;
                int var36 = Statics.field491;
                int var37 = Statics.field543;
                int var38 = Statics.field1598;
                for (int var39 = 0; var39 < field2127; var39++) {
                    if (field2134[var39] + field1979[var39] > var35 && field1979[var39] < var35 + var37 && field2151[var39] + field2049[var39] > var36 && field2049[var39] < var36 + var38) {
                        field2130[var39] = true;
                    }
                }
            } else if (field2073 != -1) {
                int var18 = field2073;
                int var19 = field2003;
                if (field2066 >= 2 || field2077 != 0 || field2079) {
                    String var20;
                    if (field2077 == 1 && field2066 < 2) {
                        var20 = class75.field1019 + class75.field955 + field2143 + " " + class1.field8;
                    } else if (field2079 && field2066 < 2) {
                        var20 = field2081 + class75.field955 + field2082 + " " + class1.field8;
                    } else {
                        int var21 = field2066 - 1;
                        String var22;
                        if (field2072[var21].length() > 0) {
                            var22 = field2153[var21] + class75.field955 + field2072[var21];
                        } else {
                            var22 = field2153[var21];
                        }
                        var20 = var22;
                    }
                    if (field2066 > 2) {
                        var20 = var20 + class1.method348(16777215) + " " + '/' + " " + (field2066 - 2) + class75.field1023;
                    }
                    Statics.field35.method2840(var20, var18 + 4, var19 + 15, 16777215, 0, field1919 / 1000);
                }
            }
            if (field2156 == 3) {
                for (int var40 = 0; var40 < field2127; var40++) {
                    if (field2131[var40]) {
                        class165.method2591(field1979[var40], field2049[var40], field2134[var40], field2151[var40], 16711935, 128);
                    } else if (field2130[var40]) {
                        class165.method2591(field1979[var40], field2049[var40], field2134[var40], field2151[var40], 16711680, 128);
                    }
                }
            }
            class125.method87(Statics.field2046, Statics.field1230.field2630, Statics.field1230.field2615, field1997);
            field1997 = 0;
        } else if (field1917 == 40) {
            method908(class75.field888 + class1.field7 + class75.field1020, false);
        }
        if (field1917 == 30 && field2156 == 0 && !field1550) {
            try {
                Graphics var41 = Statics.field558.getGraphics();
                for (int var42 = 0; var42 < field2127; var42++) {
                    if (field2130[var42]) {
                        Statics.field1534.method526(var41, field1979[var42], field2049[var42], field2134[var42], field2151[var42]);
                        field2130[var42] = false;
                    }
                }
            } catch (Exception var48) {
                Statics.field558.repaint();
            }
        } else if (field1917 > 0) {
            try {
                Graphics var44 = Statics.field558.getGraphics();
                Statics.field1534.method531(var44, 0, 0);
                field1550 = false;
                for (int var45 = 0; var45 < field2127; var45++) {
                    field2130[var45] = false;
                }
            } catch (Exception var47) {
                Statics.field558.repaint();
            }
        }
    }

    @ObfuscatedName("client.g(I)V")
    public final void method1368() {
        if (Statics.field550 != null) {
            Statics.field550.field117 = false;
        }
        Statics.field550 = null;
        if (Statics.field728 != null) {
            Statics.field728.method366();
            Statics.field728 = null;
        }
        if (class36.field458 != null) {
            class36 var1 = class36.field458;
            synchronized (class36.field458) {
                class36.field458 = null;
            }
        }
        if (class37.field494 != null) {
            class37 var3 = class37.field494;
            synchronized (class37.field494) {
                class37.field494 = null;
            }
        }
        Statics.field739 = null;
        if (Statics.field564 != null) {
            Statics.field564.method190();
        }
        if (Statics.field1520 != null) {
            Statics.field1520.method190();
        }
        class88.method917();
        Object var5 = class89.field1214;
        synchronized (class89.field1214) {
            if (class89.field1212 != 0) {
                class89.field1212 = 1;
                try {
                    class89.field1214.wait();
                } catch (InterruptedException var10) {
                }
            }
        }
        try {
            class39.field530.method126();
            for (int var8 = 0; var8 < Statics.field527; var8++) {
                Statics.field528[var8].method126();
            }
            class39.field529.method126();
            class39.field518.method126();
        } catch (Exception var13) {
        }
    }

    @ObfuscatedName("cq.cq(II)V")
    public static void method1009(int arg0) {
        if (field1917 == arg0) {
            return;
        }
        if (field1917 == 0) {
            Statics.field294 = null;
            Statics.field1548 = null;
            Statics.field863 = null;
        }
        if (arg0 == 20 || arg0 == 40) {
            field2132 = 0;
            field1947 = 0;
            field1948 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1120 != null) {
            Statics.field1120.method366();
            Statics.field1120 = null;
        }
        if (field1917 == 25) {
            field1975 = 0;
            field2111 = 0;
            field1977 = 1;
            field1973 = 0;
            field1974 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            Canvas var1 = Statics.field558;
            class121 var2 = Statics.field1943;
            class121 var3 = Statics.field1941;
            if (!Statics.field150) {
                class165.method2590();
                byte[] var4 = var2.method1083("title.jpg", "");
                Statics.field139 = new class171(var4, var1);
                Statics.field155 = Statics.field139.method2665();
                Statics.field135 = class40.method1231(var3, "logo", "");
                Statics.field130 = class40.method1231(var3, "titlebox", "");
                Statics.field134 = class40.method1231(var3, "titlebutton", "");
                Statics.field131 = class40.method240(var3, "runes", "");
                Statics.field132 = class40.method240(var3, "title_mute", "");
                Statics.field118 = new int[256];
                for (int var5 = 0; var5 < 64; var5++) {
                    Statics.field118[var5] = var5 * 262144;
                }
                for (int var6 = 0; var6 < 64; var6++) {
                    Statics.field118[var6 + 64] = var6 * 1024 + 16711680;
                }
                for (int var7 = 0; var7 < 64; var7++) {
                    Statics.field118[var7 + 128] = var7 * 4 + 16776960;
                }
                for (int var8 = 0; var8 < 64; var8++) {
                    Statics.field118[var8 + 192] = 16777215;
                }
                Statics.field828 = new int[256];
                for (int var9 = 0; var9 < 64; var9++) {
                    Statics.field828[var9] = var9 * 1024;
                }
                for (int var10 = 0; var10 < 64; var10++) {
                    Statics.field828[var10 + 64] = var10 * 4 + 65280;
                }
                for (int var11 = 0; var11 < 64; var11++) {
                    Statics.field828[var11 + 128] = var11 * 262144 + 65535;
                }
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.field828[var12 + 192] = 16777215;
                }
                Statics.field1480 = new int[256];
                for (int var13 = 0; var13 < 64; var13++) {
                    Statics.field1480[var13] = var13 * 4;
                }
                for (int var14 = 0; var14 < 64; var14++) {
                    Statics.field1480[var14 + 64] = var14 * 262144 + 255;
                }
                for (int var15 = 0; var15 < 64; var15++) {
                    Statics.field1480[var15 + 128] = var15 * 1024 + 16711935;
                }
                for (int var16 = 0; var16 < 64; var16++) {
                    Statics.field1480[var16 + 192] = 16777215;
                }
                Statics.field165 = new int[256];
                Statics.field826 = new int[32768];
                Statics.field1569 = new int[32768];
                class9.method750((class172) null);
                Statics.field42 = new int[32768];
                Statics.field533 = new int[32768];
                class9.field153 = 0;
                class9.field157 = "";
                class9.field158 = "";
                class9.field164 = false;
                if (field2075 == 0) {
                    class9.field137 = true;
                } else {
                    class9.field137 = false;
                }
                if (class9.field137) {
                    class79.field1130 = 1;
                    Statics.field1125 = null;
                    Statics.field563 = -1;
                    Statics.field1128 = -1;
                    Statics.field736 = 0;
                    Statics.field1134 = false;
                    Statics.field40 = 2;
                } else {
                    Statics.method693(2, Statics.field702, "scape main", "", 255, false);
                }
                class88.method751(false);
                Statics.field150 = true;
                Statics.field139.method2674(0, 0);
                Statics.field155.method2674(382, 0);
                Statics.field135.method2752(382 - Statics.field135.field2513 / 2, 18);
            }
        } else {
            class9.method42();
        }
        field1917 = arg0;
    }

    @ObfuscatedName("client.cs(I)V")
    public void method1957() {
        if (field1917 != 1000) {
            boolean var1 = class88.method904();
            if (!var1) {
                this.method1842();
            }
        }
    }

    @ObfuscatedName("client.cv(S)V")
    public void method1842() {
        if (class88.field1191 >= 4) {
            this.method1369("js5crc");
            field1917 = 1000;
            return;
        }
        if (class88.field1208 >= 4) {
            if (field1917 <= 5) {
                this.method1369("js5io");
                field1917 = 1000;
                return;
            }
            field1939 = 3000;
            class88.field1208 = 3;
        }
        if (--field1939 + 1 > 0) {
            return;
        }
        try {
            if (field1938 == 0) {
                Statics.field352 = Statics.field1551.method408(Statics.field1126, Statics.field1244);
                field1938++;
            }
            if (field1938 == 1) {
                if (Statics.field352.field508 == 2) {
                    this.method1835(-1);
                    return;
                }
                if (Statics.field352.field508 == 1) {
                    field1938++;
                }
            }
            if (field1938 == 2) {
                Statics.field1221 = new class32((Socket) Statics.field352.field514, Statics.field1551);
                class136 var1 = new class136(5);
                var1.method1612(15);
                var1.method1592(3);
                Statics.field1221.method371(var1.field1725, 0, 5);
                field1938++;
                Statics.field1940 = class64.method535();
            }
            if (field1938 == 3) {
                if (field1917 <= 5 || Statics.field1221.method369() > 0) {
                    int var2 = Statics.field1221.method368();
                    if (var2 != 0) {
                        this.method1835(var2);
                        return;
                    }
                    field1938++;
                } else if (class64.method535() - Statics.field1940 > 30000L) {
                    this.method1835(-2);
                    return;
                }
            }
            if (field1938 == 4) {
                class88.method903(Statics.field1221, field1917 > 20);
                Statics.field352 = null;
                Statics.field1221 = null;
                field1938 = 0;
                field1945 = 0;
            }
        } catch (IOException var4) {
            this.method1835(-3);
        }
    }

    @ObfuscatedName("client.cb(IB)V")
    public void method1835(int arg0) {
        Statics.field352 = null;
        Statics.field1221 = null;
        field1938 = 0;
        if (Statics.field1244 == Statics.field124) {
            Statics.field1244 = Statics.field355;
        } else {
            Statics.field1244 = Statics.field124;
        }
        field1945++;
        if (field1945 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field1917 <= 5) {
                this.method1369("js5connect_full");
                field1917 = 1000;
            } else {
                field1939 = 3000;
            }
        } else if (field1945 >= 2 && arg0 == 6) {
            this.method1369("js5connect_outofdate");
            field1917 = 1000;
        } else if (field1945 >= 4) {
            if (field1917 <= 5) {
                this.method1369("js5connect");
                field1917 = 1000;
            } else {
                field1939 = 3000;
            }
        }
    }

    @ObfuscatedName("be.cw(I)V")
    public static void method723() {
        if (field1981 == 0) {
            Statics.field1481 = new class45(4, 104, 104, class3.field23);
            for (int var0 = 0; var0 < 4; var0++) {
                field1976[var0] = new class95(104, 104);
            }
            Statics.field1209 = new class171(512, 512);
            class9.field152 = class75.field1081;
            class9.field143 = 5;
            field1981 = 20;
        } else if (field1981 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class173.field2544[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class45.method578(var1, 500, 800, 512, 334);
            class9.field152 = class75.field953;
            class9.field143 = 10;
            field1981 = 30;
        } else if (field1981 == 30) {
            Statics.field1280 = method696(0, false, true, true);
            Statics.field864 = method696(1, false, true, true);
            Statics.field1220 = method696(2, true, false, true);
            Statics.field545 = method696(3, false, true, true);
            Statics.field51 = method696(4, false, true, true);
            Statics.field111 = method696(5, true, true, true);
            Statics.field702 = method696(6, true, true, false);
            Statics.field1491 = method696(7, false, true, true);
            Statics.field1941 = method696(8, false, true, true);
            Statics.field1953 = method696(9, false, true, true);
            Statics.field1943 = method696(10, false, true, true);
            Statics.field2103 = method696(11, false, true, true);
            Statics.field1727 = method696(12, false, true, true);
            Statics.field737 = method696(13, true, false, true);
            Statics.field1469 = method696(14, false, true, false);
            Statics.field489 = method696(15, false, true, true);
            class9.field152 = class75.field1029;
            class9.field143 = 20;
            field1981 = 40;
        } else if (field1981 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1280.method1453() * 4 / 100;
            int var8 = var7 + Statics.field864.method1453() * 4 / 100;
            int var9 = var8 + Statics.field1220.method1453() * 2 / 100;
            int var10 = var9 + Statics.field545.method1453() * 2 / 100;
            int var11 = var10 + Statics.field51.method1453() * 6 / 100;
            int var12 = var11 + Statics.field111.method1453() * 4 / 100;
            int var13 = var12 + Statics.field702.method1453() * 2 / 100;
            int var14 = var13 + Statics.field1491.method1453() * 60 / 100;
            int var15 = var14 + Statics.field1941.method1453() * 2 / 100;
            int var16 = var15 + Statics.field1953.method1453() * 2 / 100;
            int var17 = var16 + Statics.field1943.method1453() * 2 / 100;
            int var18 = var17 + Statics.field2103.method1453() * 2 / 100;
            int var19 = var18 + Statics.field1727.method1453() * 2 / 100;
            int var20 = var19 + Statics.field737.method1453() * 2 / 100;
            int var21 = var20 + Statics.field1469.method1453() * 2 / 100;
            int var22 = var21 + Statics.field489.method1453() * 2 / 100;
            if (var22 == 100) {
                class9.field152 = class75.field1066;
                class9.field143 = 30;
                field1981 = 45;
            } else {
                if (var22 != 0) {
                    class9.field152 = class75.field893 + var22 + "%";
                }
                class9.field143 = 30;
            }
        } else if (field1981 == 45) {
            boolean var23 = !field1914;
            Statics.field354 = 22050;
            Statics.field243 = var23;
            Statics.field238 = 2;
            class149 var24 = new class149();
            var24.method2215(9, 128);
            Statics.field564 = class18.method2505(Statics.field1551, Statics.field558, 0, 22050);
            Statics.field564.method210(var24);
            class121 var25 = Statics.field489;
            class121 var26 = Statics.field1469;
            class121 var27 = Statics.field51;
            Statics.field1135 = var25;
            Statics.field1129 = var26;
            Statics.field1133 = var27;
            Statics.field1131 = var24;
            Statics.field1520 = class18.method2505(Statics.field1551, Statics.field558, 1, 2048);
            Statics.field1493 = new class148();
            Statics.field1520.method210(Statics.field1493);
            Statics.field810 = new class26(22050, Statics.field354);
            class9.field152 = class75.field895;
            class9.field143 = 35;
            field1981 = 50;
        } else if (field1981 == 50) {
            int var28 = 0;
            if (Statics.field1119 == null) {
                class121 var29 = Statics.field1941;
                class121 var30 = Statics.field737;
                int var31 = var29.method1034("p11_full");
                int var32 = var29.method1035(var31, "");
                class182 var33 = class40.method148(var29, var30, var31, var32);
                Statics.field1119 = var33;
            } else {
                var28++;
            }
            if (Statics.field1906 == null) {
                class121 var34 = Statics.field1941;
                class121 var35 = Statics.field737;
                int var36 = var34.method1034("p12_full");
                int var37 = var34.method1035(var36, "");
                class182 var38 = class40.method148(var34, var35, var36, var37);
                Statics.field1906 = var38;
            } else {
                var28++;
            }
            if (Statics.field35 == null) {
                class121 var39 = Statics.field1941;
                class121 var40 = Statics.field737;
                int var41 = var39.method1034("b12_full");
                int var42 = var39.method1035(var41, "");
                class182 var43 = class40.method148(var39, var40, var41, var42);
                Statics.field35 = var43;
            } else {
                var28++;
            }
            if (var28 < 3) {
                class9.field152 = class75.field896 + var28 * 100 / 3 + "%";
                class9.field143 = 40;
            } else {
                class9.field152 = class75.field1016;
                class9.field143 = 40;
                field1981 = 60;
            }
        } else if (field1981 == 60) {
            class121 var44 = Statics.field1943;
            class121 var45 = Statics.field1941;
            int var46 = 0;
            if (var44.method1037("title.jpg", "")) {
                var46++;
            }
            if (var45.method1037("logo", "")) {
                var46++;
            }
            if (var45.method1037("titlebox", "")) {
                var46++;
            }
            if (var45.method1037("titlebutton", "")) {
                var46++;
            }
            if (var45.method1037("runes", "")) {
                var46++;
            }
            if (var45.method1037("title_mute", "")) {
                var46++;
            }
            var45.method1037("sl_back", "");
            var45.method1037("sl_flags", "");
            var45.method1037("sl_arrows", "");
            var45.method1037("sl_stars", "");
            var45.method1037("sl_button", "");
            byte var49 = 6;
            if (var46 < var49) {
                class9.field152 = class75.field898 + var46 * 100 / var49 + "%";
                class9.field143 = 50;
            } else {
                class9.field152 = class75.field1027;
                class9.field143 = 50;
                method1009(5);
                field1981 = 70;
            }
        } else if (field1981 == 70) {
            if (Statics.field1220.method1022()) {
                class121 var51 = Statics.field1220;
                Statics.field2405 = var51;
                class121 var52 = Statics.field1220;
                Statics.field2351 = var52;
                class121 var53 = Statics.field1220;
                class121 var54 = Statics.field1491;
                Statics.field2400 = var53;
                Statics.field2392 = var54;
                Statics.field2393 = Statics.field2400.method1028(3);
                class121 var55 = Statics.field1220;
                class121 var56 = Statics.field1491;
                boolean var57 = field1914;
                Statics.field1231 = var55;
                Statics.field1574 = var56;
                class154.field2339 = var57;
                class153.method749(Statics.field1220, Statics.field1491);
                class162.method347(Statics.field1220, Statics.field1491, field1913, Statics.field1119);
                class121 var58 = Statics.field1220;
                class121 var59 = Statics.field1280;
                class121 var60 = Statics.field864;
                Statics.field2360 = var58;
                Statics.field2361 = var59;
                Statics.field2359 = var60;
                class121 var61 = Statics.field1220;
                class121 var62 = Statics.field1491;
                Statics.field845 = var61;
                Statics.field2383 = var62;
                class160.method1479(Statics.field1220);
                class121 var63 = Statics.field1220;
                Statics.field2481 = var63;
                Statics.field2479 = Statics.field2481.method1028(16);
                class141.method1428(Statics.field545, Statics.field1491, Statics.field1941, Statics.field737);
                class163.method150(Statics.field1220);
                class121 var64 = Statics.field1220;
                Statics.field2424 = var64;
                class9.field152 = class75.field901;
                class9.field143 = 60;
                field1981 = 80;
            } else {
                class9.field152 = class75.field1007 + Statics.field1220.method1454() + "%";
                class9.field143 = 60;
            }
        } else if (field1981 == 80) {
            int var65 = 0;
            if (Statics.field831 == null) {
                Statics.field831 = class40.method277(Statics.field1941, "compass", "");
            } else {
                var65++;
            }
            if (Statics.field1892 == null) {
                Statics.field1892 = class40.method277(Statics.field1941, "mapedge", "");
            } else {
                var65++;
            }
            if (Statics.field188 == null) {
                Statics.field188 = class40.method240(Statics.field1941, "mapscene", "");
            } else {
                var65++;
            }
            if (Statics.field879 == null) {
                Statics.field879 = class40.method346(Statics.field1941, "mapfunction", "");
            } else {
                var65++;
            }
            if (Statics.field1618 == null) {
                Statics.field1618 = class40.method346(Statics.field1941, "hitmarks", "");
            } else {
                var65++;
            }
            if (Statics.field15 == null) {
                Statics.field15 = class40.method346(Statics.field1941, "headicons_pk", "");
            } else {
                var65++;
            }
            if (Statics.field1226 == null) {
                Statics.field1226 = class40.method346(Statics.field1941, "headicons_prayer", "");
            } else {
                var65++;
            }
            if (Statics.field1761 == null) {
                Statics.field1761 = class40.method346(Statics.field1941, "headicons_hint", "");
            } else {
                var65++;
            }
            if (Statics.field2420 == null) {
                Statics.field2420 = class40.method346(Statics.field1941, "mapmarker", "");
            } else {
                var65++;
            }
            if (Statics.field11 == null) {
                Statics.field11 = class40.method346(Statics.field1941, "cross", "");
            } else {
                var65++;
            }
            if (Statics.field374 == null) {
                Statics.field374 = class40.method346(Statics.field1941, "mapdots", "");
            } else {
                var65++;
            }
            if (Statics.field126 == null) {
                Statics.field126 = class40.method240(Statics.field1941, "scrollbar", "");
            } else {
                var65++;
            }
            if (Statics.field768 == null) {
                Statics.field768 = class40.method240(Statics.field1941, "mod_icons", "");
            } else {
                var65++;
            }
            if (Statics.field295 == null) {
                Statics.field295 = class40.method1231(Statics.field1941, "mapback", "");
            } else {
                var65++;
            }
            if (var65 < 14) {
                class9.field152 = class75.field902 + var65 * 100 / 14 + "%";
                class9.field143 = 70;
            } else {
                Statics.field2555 = Statics.field768;
                Statics.field1892.method2668();
                int var66 = (int) (Math.random() * 21.0D) - 10;
                int var67 = (int) (Math.random() * 21.0D) - 10;
                int var68 = (int) (Math.random() * 21.0D) - 10;
                int var69 = (int) (Math.random() * 41.0D) - 20;
                for (int var70 = 0; var70 < Statics.field879.length; var70++) {
                    Statics.field879[var70].method2667(var66 + var69, var67 + var69, var68 + var69);
                }
                Statics.field188[0].method2753(var66 + var69, var67 + var69, var68 + var69);
                Statics.field703 = new int[33];
                Statics.field1570 = new int[33];
                Statics.field1169 = new int[151];
                Statics.field1599 = new int[151];
                for (int var71 = 0; var71 < 33; var71++) {
                    int var72 = 999;
                    int var73 = 0;
                    for (int var74 = 0; var74 < 34; var74++) {
                        if (Statics.field295.field2514[Statics.field295.field2513 * var71 + var74] == 0) {
                            if (var72 == 999) {
                                var72 = var74;
                            }
                        } else if (var72 != 999) {
                            var73 = var74;
                            break;
                        }
                    }
                    Statics.field703[var71] = var72;
                    Statics.field1570[var71] = var73 - var72;
                }
                for (int var75 = 5; var75 < 156; var75++) {
                    int var76 = 999;
                    int var77 = 0;
                    for (int var78 = 25; var78 < 172; var78++) {
                        if (Statics.field295.field2514[Statics.field295.field2513 * var75 + var78] == 0 && (var78 > 34 || var75 > 34)) {
                            if (var76 == 999) {
                                var76 = var78;
                            }
                        } else if (var76 != 999) {
                            var77 = var78;
                            break;
                        }
                    }
                    Statics.field1169[var75 - 5] = var76 - 25;
                    Statics.field1599[var75 - 5] = var77 - var76;
                }
                class9.field152 = class75.field903;
                class9.field143 = 70;
                field1981 = 90;
            }
        } else if (field1981 == 90) {
            if (Statics.field1953.method1022()) {
                class55 var79 = new class55(Statics.field1953, Statics.field1941, 20, 0.8D, field1914 ? 64 : 128);
                class173.method2763(var79);
                class173.method2764(0.8D);
                class9.field152 = class75.field905;
                class9.field143 = 90;
                field1981 = 110;
            } else {
                class9.field152 = class75.field1095 + Statics.field1953.method1454() + "%";
                class9.field143 = 90;
            }
        } else if (field1981 == 110) {
            Statics.field550 = new class7();
            Statics.field1551.method426(Statics.field550, 10);
            class9.field152 = class75.field906;
            class9.field143 = 94;
            field1981 = 120;
        } else if (field1981 == 120) {
            if (Statics.field1943.method1037("huffman", "")) {
                class63 var80 = new class63(Statics.field1943.method1083("huffman", ""));
                class110.method304(var80);
                class9.field152 = class75.field908;
                class9.field143 = 96;
                field1981 = 130;
            } else {
                class9.field152 = class75.field907 + "%";
                class9.field143 = 96;
            }
        } else if (field1981 == 130) {
            if (!Statics.field545.method1022()) {
                class9.field152 = class75.field987 + Statics.field545.method1454() * 4 / 5 + "%";
                class9.field143 = 100;
            } else if (!Statics.field1727.method1022()) {
                class9.field152 = class75.field987 + (80 + Statics.field1727.method1454() / 6) + "%";
                class9.field143 = 100;
            } else if (Statics.field737.method1022()) {
                class9.field152 = class75.field910;
                class9.field143 = 100;
                field1981 = 140;
            } else {
                class9.field152 = class75.field987 + (96 + Statics.field737.method1454() / 20) + "%";
                class9.field143 = 100;
            }
        } else if (field1981 == 140) {
            method1009(10);
        }
    }

    @ObfuscatedName("ah.cy(IZZZI)Ldc;")
    public static class121 method696(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class33 var4 = null;
        if (class39.field530 != null) {
            var4 = new class33(arg0, class39.field530, Statics.field528[arg0], 1000000);
        }
        return new class121(var4, Statics.field315, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bz.cd(B)V")
    public static final void method795() {
        try {
            if (field2132 == 0) {
                if (Statics.field728 != null) {
                    Statics.field728.method366();
                    Statics.field728 = null;
                }
                Statics.field1905 = null;
                field1967 = false;
                field1947 = 0;
                field2132 = 1;
            }
            if (field2132 == 1) {
                if (Statics.field1905 == null) {
                    Statics.field1905 = Statics.field1551.method408(Statics.field1126, Statics.field1244);
                }
                if (Statics.field1905.field508 == 2) {
                    throw new IOException();
                }
                if (Statics.field1905.field508 == 1) {
                    Statics.field728 = new class32((Socket) Statics.field1905.field514, Statics.field1551);
                    Statics.field1905 = null;
                    field2132 = 2;
                }
            }
            if (field2132 == 2) {
                field2162.field1722 = 0;
                field2162.method1612(14);
                Statics.field728.method371(field2162.field1725, 0, 1);
                field1958.field1722 = 0;
                field2132 = 3;
            }
            if (field2132 == 3) {
                if (Statics.field564 != null) {
                    Statics.field564.method188();
                }
                if (Statics.field1520 != null) {
                    Statics.field1520.method188();
                }
                int var0 = Statics.field728.method368();
                if (Statics.field564 != null) {
                    Statics.field564.method188();
                }
                if (Statics.field1520 != null) {
                    Statics.field1520.method188();
                }
                if (var0 != 0) {
                    method918(var0);
                    return;
                }
                field1958.field1722 = 0;
                field2132 = 5;
            }
            if (field2132 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field2162.field1722 = 0;
                field2162.method1612(10);
                field2162.method1592(var1[0]);
                field2162.method1592(var1[1]);
                field2162.method1592(var1[2]);
                field2162.method1592(var1[3]);
                field2162.method1593(0L);
                field2162.method1702(class9.field158);
                field2162.method1620(class2.field14, class2.field13);
                field1957.field1722 = 0;
                if (field1917 == 40) {
                    field1957.method1612(18);
                } else {
                    field1957.method1612(16);
                }
                field1957.method1680(0);
                int var2 = field1957.field1722;
                field1957.method1592(3);
                field1957.method1596(field2162.field1725, 0, field2162.field1722);
                int var3 = field1957.field1722;
                field1957.method1702(class9.field157);
                field1957.method1612(field1914 ? 1 : 0);
                class39.method399(field1957);
                field1957.method1592(Statics.field1280.field1170);
                field1957.method1592(Statics.field864.field1170);
                field1957.method1592(Statics.field1220.field1170);
                field1957.method1592(Statics.field545.field1170);
                field1957.method1592(Statics.field51.field1170);
                field1957.method1592(Statics.field111.field1170);
                field1957.method1592(Statics.field702.field1170);
                field1957.method1592(Statics.field1491.field1170);
                field1957.method1592(Statics.field1941.field1170);
                field1957.method1592(Statics.field1953.field1170);
                field1957.method1592(Statics.field1943.field1170);
                field1957.method1592(Statics.field2103.field1170);
                field1957.method1592(Statics.field1727.field1170);
                field1957.method1592(Statics.field737.field1170);
                field1957.method1592(Statics.field1469.field1170);
                field1957.method1592(Statics.field489.field1170);
                field1957.method1618(var1, var3, field1957.field1722);
                field1957.method1729(field1957.field1722 - var2);
                Statics.field728.method371(field1957.field1725, 0, field1957.field1722);
                field2162.method2306(var1);
                for (int var4 = 0; var4 < 4; var4++) {
                    var1[var4] += 50;
                }
                field1958.method2306(var1);
                field2132 = 6;
            }
            if (field2132 == 6 && Statics.field728.method369() > 0) {
                int var5 = Statics.field728.method368();
                if (var5 == 21 && field1917 == 20) {
                    field2132 = 7;
                } else if (var5 == 2) {
                    field2132 = 9;
                } else if (var5 == 15 && field1917 == 40) {
                    method784();
                    return;
                } else if (var5 == 23 && field1948 < 1) {
                    field1948++;
                    field2132 = 0;
                } else {
                    method918(var5);
                    return;
                }
            }
            if (field2132 == 7 && Statics.field728.method369() > 0) {
                field1949 = (Statics.field728.method368() + 3) * 60;
                field2132 = 8;
            }
            if (field2132 == 8) {
                field1947 = 0;
                class9.method1352(class75.field911, class75.field912, field1949 / 60 + class75.field1035);
                if (--field1949 <= 0) {
                    field2132 = 0;
                }
            } else {
                if (field2132 == 9 && Statics.field728.method369() >= 8) {
                    field2090 = Statics.field728.method368();
                    field2091 = Statics.field728.method368() == 1;
                    field2078 = Statics.field728.method368();
                    field2078 <<= 0x8;
                    field2078 += Statics.field728.method368();
                    field1929 = Statics.field728.method368();
                    Statics.field728.method370(field1958.field1725, 0, 1);
                    field1958.field1722 = 0;
                    field1960 = field1958.method2326();
                    Statics.field728.method370(field1958.field1725, 0, 2);
                    field1958.field1722 = 0;
                    field2102 = field1958.method1712();
                    if (field1929 == 1) {
                        try {
                            class29.method349(Statics.field769, "zap");
                        } catch (Throwable var22) {
                        }
                    } else {
                        try {
                            class29.method349(Statics.field769, "unzap");
                        } catch (Throwable var21) {
                        }
                    }
                    field2132 = 10;
                }
                if (field2132 != 10) {
                    field1947++;
                    if (field1947 > 2000) {
                        if (field1948 < 1) {
                            if (Statics.field1244 == Statics.field124) {
                                Statics.field1244 = Statics.field355;
                            } else {
                                Statics.field1244 = Statics.field124;
                            }
                            field1948++;
                            field2132 = 0;
                        } else {
                            method918(-3);
                        }
                    }
                } else if (Statics.field728.method369() >= field2102) {
                    field1958.field1722 = 0;
                    Statics.field728.method370(field1958.field1725, 0, field2102);
                    field1998 = 0L;
                    field1923 = 0;
                    Statics.field550.field114 = 0;
                    Statics.field1555 = true;
                    field1924 = true;
                    class109.method56();
                    field2162.field1722 = 0;
                    field1958.field1722 = 0;
                    field1960 = -1;
                    field2147 = -1;
                    field1933 = -1;
                    field1966 = -1;
                    field1961 = 0;
                    field1926 = 0;
                    field1965 = 0;
                    field1927 = 0;
                    field2066 = 0;
                    field2064 = false;
                    class37.field493 = 0;
                    for (int var8 = 0; var8 < 100; var8++) {
                        field2097[var8] = null;
                    }
                    field2142 = 0;
                    field2077 = 0;
                    field2079 = false;
                    field2175 = 0;
                    field1985 = (int) (Math.random() * 100.0D) - 50;
                    field2112 = (int) (Math.random() * 110.0D) - 55;
                    field1989 = (int) (Math.random() * 80.0D) - 40;
                    field1992 = (int) (Math.random() * 120.0D) - 60;
                    field1994 = (int) (Math.random() * 30.0D) - 20;
                    field1955 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field2167 = 0;
                    field2155 = -1;
                    field2089 = 0;
                    field2161 = 0;
                    field2041 = 0;
                    field1999 = 0;
                    for (int var9 = 0; var9 < 2048; var9++) {
                        field2040[var9] = null;
                        field2045[var9] = null;
                    }
                    for (int var10 = 0; var10 < 32768; var10++) {
                        field2062[var10] = null;
                    }
                    Statics.field1230 = field2040[2047] = new class183();
                    field2135.method1292();
                    field2059.method1292();
                    for (int var11 = 0; var11 < 4; var11++) {
                        for (int var12 = 0; var12 < 104; var12++) {
                            for (int var13 = 0; var13 < 104; var13++) {
                                field2056[var11][var12][var13] = null;
                            }
                        }
                    }
                    field2057 = new class105();
                    field2001 = 0;
                    field2188 = 0;
                    for (int var14 = 0; var14 < Statics.field2479; var14++) {
                        class164 var15 = class164.method1337(var14);
                        if (var15 != null && var15.field2478 == 0) {
                            class90.field1217[var14] = 0;
                            class90.field1219[var14] = 0;
                        }
                    }
                    for (int var16 = 0; var16 < field2119.length; var16++) {
                        field2119[var16] = -1;
                    }
                    if (field2168 != -1) {
                        class141.method914(field2168);
                    }
                    for (class124 var17 = (class124) field2160.method1280(); var17 != null; var17 = (class124) field2160.method1282()) {
                        method720(var17, true);
                    }
                    field2168 = -1;
                    field2160 = new class104(8);
                    field2087 = null;
                    field2064 = false;
                    field2066 = 0;
                    field2034.method1149((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var18 = 0; var18 < 8; var18++) {
                        field2047[var18] = null;
                        field2054[var18] = false;
                    }
                    class127.method885();
                    field1918 = true;
                    for (int var19 = 0; var19 < 100; var19++) {
                        field2129[var19] = true;
                    }
                    field1921 = null;
                    Statics.field1116 = 0;
                    Statics.field544 = null;
                    Statics.field1516 = -1;
                    method43(false);
                    field1960 = -1;
                }
            }
        } catch (IOException var23) {
            if (field1948 < 1) {
                if (Statics.field1244 == Statics.field124) {
                    Statics.field1244 = Statics.field355;
                } else {
                    Statics.field1244 = Statics.field124;
                }
                field1948++;
                field2132 = 0;
            } else {
                method918(-2);
            }
        }
    }

    @ObfuscatedName("bk.cp(I)V")
    public static void method784() {
        field2162.field1722 = 0;
        field1958.field1722 = 0;
        field1960 = -1;
        field2147 = -1;
        field1933 = -1;
        field1966 = -1;
        field2102 = 0;
        field1961 = 0;
        field1926 = 0;
        field2066 = 0;
        field2064 = false;
        field2167 = 0;
        field2089 = 0;
        for (int var0 = 0; var0 < field2040.length; var0++) {
            if (field2040[var0] != null) {
                field2040[var0].field2638 = -1;
            }
        }
        for (int var1 = 0; var1 < field2062.length; var1++) {
            if (field2062[var1] != null) {
                field2062[var1].field2638 = -1;
            }
        }
        class127.method885();
        method1009(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field2129[var2] = true;
        }
    }

    @ObfuscatedName("ch.ce(IB)V")
    public static void method918(int arg0) {
        if (arg0 == -3) {
            class9.method1352(class75.field970, class75.field915, class75.field916);
        } else if (arg0 == -2) {
            class9.method1352(class75.field917, class75.field1017, class75.field919);
        } else if (arg0 == -1) {
            class9.method1352(class75.field920, class75.field921, class75.field922);
        } else if (arg0 == 3) {
            class9.method1352(class75.field923, class75.field996, class75.field1054);
        } else if (arg0 == 4) {
            class9.method1352(class75.field926, class75.field927, class75.field928);
        } else if (arg0 == 5) {
            class9.method1352(class75.field929, class75.field889, class75.field1031);
        } else if (arg0 == 6) {
            class9.method1352(class75.field932, class75.field933, class75.field934);
        } else if (arg0 == 7) {
            class9.method1352(class75.field884, class75.field936, class75.field998);
        } else if (arg0 == 8) {
            class9.method1352(class75.field938, class75.field939, class75.field940);
        } else if (arg0 == 9) {
            class9.method1352(class75.field941, class75.field942, class75.field943);
        } else if (arg0 == 10) {
            class9.method1352(class75.field944, class75.field945, class75.field946);
        } else if (arg0 == 11) {
            class9.method1352(class75.field1062, class75.field948, class75.field949);
        } else if (arg0 == 12) {
            class9.method1352(class75.field909, class75.field984, class75.field952);
        } else if (arg0 == 13) {
            class9.method1352(class75.field960, class75.field954, class75.field924);
        } else if (arg0 == 14) {
            class9.method1352(class75.field956, class75.field957, class75.field958);
        } else if (arg0 == 16) {
            class9.method1352(class75.field959, class75.field1059, class75.field961);
        } else if (arg0 == 17) {
            class9.method1352(class75.field962, class75.field963, class75.field964);
        } else if (arg0 == 18) {
            class9.method1352(class75.field1087, class75.field897, class75.field967);
        } else if (arg0 == 19) {
            class9.method1352(class75.field900, class75.field969, class75.field981);
        } else if (arg0 == 20) {
            class9.method1352(class75.field971, class75.field972, class75.field1086);
        } else if (arg0 == 22) {
            class9.method1352(class75.field966, class75.field1096, class75.field965);
        } else if (arg0 == 23) {
            class9.method1352(class75.field1055, class75.field978, class75.field979);
        } else if (arg0 == 24) {
            class9.method1352(class75.field1044, class75.field1033, class75.field982);
        } else if (arg0 == 25) {
            class9.method1352(class75.field983, class75.field1034, class75.field985);
        } else if (arg0 == 26) {
            class9.method1352(class75.field986, class75.field976, class75.field988);
        } else if (arg0 == 27) {
            class9.method1352(class75.field989, class75.field974, class75.field894);
        } else if (arg0 == 31) {
            class9.method1352(class75.field1085, class75.field999, class75.field1013);
        } else if (arg0 == 32) {
            class9.method1352(class75.field1001, class75.field1002, class75.field1003);
        } else if (arg0 == 37) {
            class9.method1352(class75.field1004, class75.field930, class75.field1006);
        } else if (arg0 == 38) {
            class9.method1352(class75.field1083, class75.field931, class75.field973);
        } else if (arg0 == 55) {
            class9.method1352(class75.field1010, class75.field1011, class75.field1012);
        } else {
            class9.method1352(class75.field975, class75.field1014, class75.field1015);
        }
        method1009(10);
    }

    @ObfuscatedName("er.ct(I)V")
    public static final void method1585() {
        if (Statics.field728 != null) {
            Statics.field728.method366();
            Statics.field728 = null;
        }
        method689();
        Statics.field1481.method544();
        for (int var0 = 0; var0 < 4; var0++) {
            field1976[var0].method1179();
        }
        System.gc();
        class79.field1130 = 1;
        Statics.field1125 = null;
        Statics.field563 = -1;
        Statics.field1128 = -1;
        Statics.field736 = 0;
        Statics.field1134 = false;
        Statics.field40 = 2;
        field1932 = -1;
        field2170 = false;
        class125.method1008();
        method1009(10);
    }

    @ObfuscatedName("al.cx(I)V")
    public static final void method689() {
        class159.field2409.method1239();
        class155.field2350.method1239();
        class158.method39();
        class154.method694();
        class153.field2268.method1239();
        class153.field2269.method1239();
        class162.field2432.method1239();
        class162.field2433.method1239();
        class162.field2434.method1239();
        class156.method1232();
        class157.field2376.method1239();
        class157.field2389.method1239();
        class160.field2416.method1239();
        class164.method906();
        class94.method736();
        class141.method1495();
        ((class55) Statics.field2541).method730();
        class152.field2260.method1239();
        Statics.field1280.method1032();
        Statics.field864.method1032();
        Statics.field545.method1032();
        Statics.field51.method1032();
        Statics.field111.method1032();
        Statics.field702.method1032();
        Statics.field1491.method1032();
        Statics.field1941.method1032();
        Statics.field1953.method1032();
        Statics.field1943.method1032();
        Statics.field2103.method1032();
        Statics.field1727.method1032();
    }

    @ObfuscatedName("ei.cn(I)V")
    public static final void method2332() {
        if (field1965 > 0) {
            method1585();
        } else {
            method1009(40);
            Statics.field1120 = Statics.field728;
            Statics.field728 = null;
        }
    }

    @ObfuscatedName("ep.cj(I)V")
    public static final void method1785() {
        if (Statics.field1520 != null) {
            Statics.field1520.method187();
        }
        if (Statics.field564 != null) {
            Statics.field564.method187();
        }
    }

    @ObfuscatedName("bs.co(Leu;IIII)V")
    public static void method852(class156 arg0, int arg1, int arg2, int arg3) {
        if (field2175 >= 50 || field2173 == 0 || arg0.field2365 == null || arg1 >= arg0.field2365.length) {
            return;
        }
        int var4 = arg0.field2365[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field2005[field2175] = var5;
        field2177[field2175] = var6;
        field2178[field2175] = 0;
        field2180[field2175] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field2179[field2175] = (var8 << 16) + (var9 << 8) + var7;
        field2175++;
    }

    @ObfuscatedName("be.ck(I)V")
    public static final void method721() {
        if (field1914 && Statics.field2046 != field1970) {
            method122(Statics.field1516, Statics.field490, Statics.field2046, Statics.field1230.field2649[0], Statics.field1230.field2652[0]);
        } else if (Statics.field2046 != field2155) {
            field2155 = Statics.field2046;
            int var0 = Statics.field2046;
            int[] var1 = Statics.field1209.field2503;
            int var2 = var1.length;
            for (int var3 = 0; var3 < var2; var3++) {
                var1[var3] = 0;
            }
            for (int var4 = 1; var4 < 103; var4++) {
                int var5 = (103 - var4) * 2048 + 24628;
                for (int var6 = 1; var6 < 103; var6++) {
                    if ((class3.field18[var0][var6][var4] & 0x18) == 0) {
                        Statics.field1481.method577(var1, var5, 512, var0, var6, var4);
                    }
                    if (var0 < 3 && (class3.field18[var0 + 1][var6][var4] & 0x8) != 0) {
                        Statics.field1481.method577(var1, var5, 512, var0 + 1, var6, var4);
                    }
                    var5 += 4;
                }
            }
            int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field1209.method2691();
            for (int var9 = 1; var9 < 103; var9++) {
                for (int var10 = 1; var10 < 103; var10++) {
                    if ((class3.field18[var0][var10][var9] & 0x18) == 0) {
                        method894(var0, var10, var9, var7, var8);
                    }
                    if (var0 < 3 && (class3.field18[var0 + 1][var10][var9] & 0x8) != 0) {
                        method894(var0 + 1, var10, var9, var7, var8);
                    }
                }
            }
            field2010 = 0;
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    int var13 = Statics.field1481.method572(Statics.field2046, var11, var12);
                    if (var13 != 0) {
                        int var14 = var13 >> 14 & 0x7FFF;
                        int var15 = class154.method886(var14).field2302;
                        if (var15 >= 0) {
                            int var16 = var11;
                            int var17 = var12;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var18 = field1976[Statics.field2046].field1279;
                                for (int var19 = 0; var19 < 10; var19++) {
                                    int var20 = (int) (Math.random() * 4.0D);
                                    if (var20 == 0 && var16 > 0 && var16 > var11 - 3 && (var18[var16 - 1][var17] & 0x12C0108) == 0) {
                                        var16--;
                                    }
                                    if (var20 == 1 && var16 < 103 && var16 < var11 + 3 && (var18[var16 + 1][var17] & 0x12C0180) == 0) {
                                        var16++;
                                    }
                                    if (var20 == 2 && var17 > 0 && var17 > var12 - 3 && (var18[var16][var17 - 1] & 0x12C0102) == 0) {
                                        var17--;
                                    }
                                    if (var20 == 3 && var17 < 103 && var17 < var12 + 3 && (var18[var16][var17 + 1] & 0x12C0120) == 0) {
                                        var17++;
                                    }
                                }
                            }
                            field2159[field2010] = Statics.field879[var15];
                            field1978[field2010] = var16;
                            field2158[field2010] = var17;
                            field2010++;
                        }
                    }
                }
            }
            Statics.field1534.method524();
        }
    }

    @ObfuscatedName("bb.cm(III)V")
    public static final void method893(int arg0, int arg1) {
        if (field2167 != 0 && field2167 != 3 || class37.field504 != 1) {
            return;
        }
        int var2 = class37.field505 - 25 - arg0;
        int var3 = class37.field506 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field1992 + field1955 & 0x7FF;
        int var5 = class173.field2544[var4];
        int var6 = class173.field2545[var4];
        int var7 = (field1994 + 256) * var5 >> 8;
        int var8 = (field1994 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field1230.field2630 + var9 >> 7;
        int var12 = Statics.field1230.field2615 - var10 >> 7;
        boolean var13 = Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var11, var12, true, 0, 0, 0, 0, 0, 1);
        if (!var13) {
            return;
        }
        field2162.method1612(var2);
        field2162.method1612(var3);
        field2162.method1680(field1955);
        field2162.method1612(57);
        field2162.method1612(field1992);
        field2162.method1612(field1994);
        field2162.method1612(89);
        field2162.method1680(Statics.field1230.field2630);
        field2162.method1680(Statics.field1230.field2615);
        field2162.method1612(field1980);
        field2162.method1612(63);
    }

    @ObfuscatedName("q.ca(Ljava/lang/String;I)V")
    public static final void method5(String arg0) {
        if (field2090 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                method2332();
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                field1925 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                field1925 = false;
            }
            if (arg0.equalsIgnoreCase("::noclip")) {
                for (int var1 = 0; var1 < 4; var1++) {
                    for (int var2 = 1; var2 < 103; var2++) {
                        for (int var3 = 1; var3 < 103; var3++) {
                            field1976[var1].field1279[var2][var3] = 0;
                        }
                    }
                }
            }
            if (arg0.equalsIgnoreCase("::errortest") && field1911 == 2) {
                throw new RuntimeException();
            }
        }
        field2162.method2308(240);
        field2162.method1612(arg0.length() - 1);
        field2162.method1702(arg0.substring(2));
    }

    @ObfuscatedName("an.cl(Lfz;II)V")
    public static final void method430(class179 arg0, int arg1) {
        if (arg0.field2658 > field1919) {
            int var2 = arg0.field2658 - field1919;
            int var3 = arg0.field2654 * 64 + arg0.field2642 * 128;
            int var4 = arg0.field2656 * 128 + arg0.field2654 * 64;
            arg0.field2630 += (var3 - arg0.field2630) / var2;
            arg0.field2615 += (var4 - arg0.field2615) / var2;
            arg0.field2618 = 0;
            if (arg0.field2660 == 0) {
                arg0.field2670 = 1024;
            }
            if (arg0.field2660 == 1) {
                arg0.field2670 = 1536;
            }
            if (arg0.field2660 == 2) {
                arg0.field2670 = 0;
            }
            if (arg0.field2660 == 3) {
                arg0.field2670 = 512;
            }
        } else if (arg0.field2629 >= field1919) {
            method541(arg0);
        } else {
            arg0.field2641 = arg0.field2619;
            if (arg0.field2666 == 0) {
                arg0.field2618 = 0;
            } else {
                label331: {
                    if (arg0.field2644 != -1 && arg0.field2647 == 0) {
                        class156 var5 = class156.method482(arg0.field2644);
                        if (arg0.field2671 > 0 && var5.field2370 == 0) {
                            arg0.field2618++;
                            break label331;
                        }
                        if (arg0.field2671 <= 0 && var5.field2374 == 0) {
                            arg0.field2618++;
                            break label331;
                        }
                    }
                    int var6 = arg0.field2630;
                    int var7 = arg0.field2615;
                    int var8 = arg0.field2649[arg0.field2666 - 1] * 128 + arg0.field2654 * 64;
                    int var9 = arg0.field2652[arg0.field2666 - 1] * 128 + arg0.field2654 * 64;
                    if (var8 - var6 <= 256 && var8 - var6 >= -256 && var9 - var7 <= 256 && var9 - var7 >= -256) {
                        if (var6 < var8) {
                            if (var7 < var9) {
                                arg0.field2670 = 1280;
                            } else if (var7 > var9) {
                                arg0.field2670 = 1792;
                            } else {
                                arg0.field2670 = 1536;
                            }
                        } else if (var6 > var8) {
                            if (var7 < var9) {
                                arg0.field2670 = 768;
                            } else if (var7 > var9) {
                                arg0.field2670 = 256;
                            } else {
                                arg0.field2670 = 512;
                            }
                        } else if (var7 < var9) {
                            arg0.field2670 = 1024;
                        } else if (var7 > var9) {
                            arg0.field2670 = 0;
                        }
                        int var10 = arg0.field2670 - arg0.field2616 & 0x7FF;
                        if (var10 > 1024) {
                            var10 -= 2048;
                        }
                        int var11 = arg0.field2668;
                        if (var10 >= -256 && var10 <= 256) {
                            var11 = arg0.field2622;
                        } else if (var10 >= 256 && var10 < 768) {
                            var11 = arg0.field2625;
                        } else if (var10 >= -768 && var10 <= -256) {
                            var11 = arg0.field2624;
                        }
                        if (var11 == -1) {
                            var11 = arg0.field2622;
                        }
                        arg0.field2641 = var11;
                        int var12 = 4;
                        boolean var13 = true;
                        if (arg0 instanceof class184) {
                            var13 = ((class184) arg0).field2805.field2280;
                        }
                        if (var13) {
                            if (arg0.field2670 != arg0.field2616 && arg0.field2638 == -1 && arg0.field2665 != 0) {
                                var12 = 2;
                            }
                            if (arg0.field2666 > 2) {
                                var12 = 6;
                            }
                            if (arg0.field2666 > 3) {
                                var12 = 8;
                            }
                            if (arg0.field2618 > 0 && arg0.field2666 > 1) {
                                var12 = 8;
                                arg0.field2618--;
                            }
                        } else {
                            if (arg0.field2666 > 1) {
                                var12 = 6;
                            }
                            if (arg0.field2666 > 2) {
                                var12 = 8;
                            }
                            if (arg0.field2618 > 0 && arg0.field2666 > 1) {
                                var12 = 8;
                                arg0.field2618--;
                            }
                        }
                        if (arg0.field2669[arg0.field2666 - 1]) {
                            var12 <<= 0x1;
                        }
                        if (var12 >= 8 && arg0.field2641 == arg0.field2622 && arg0.field2626 != -1) {
                            arg0.field2641 = arg0.field2626;
                        }
                        if (var6 < var8) {
                            arg0.field2630 += var12;
                            if (arg0.field2630 > var8) {
                                arg0.field2630 = var8;
                            }
                        } else if (var6 > var8) {
                            arg0.field2630 -= var12;
                            if (arg0.field2630 < var8) {
                                arg0.field2630 = var8;
                            }
                        }
                        if (var7 < var9) {
                            arg0.field2615 += var12;
                            if (arg0.field2615 > var9) {
                                arg0.field2615 = var9;
                            }
                        } else if (var7 > var9) {
                            arg0.field2615 -= var12;
                            if (arg0.field2615 < var9) {
                                arg0.field2615 = var9;
                            }
                        }
                        if (arg0.field2630 == var8 && arg0.field2615 == var9) {
                            arg0.field2666--;
                            if (arg0.field2671 > 0) {
                                arg0.field2671--;
                            }
                        }
                    } else {
                        arg0.field2630 = var8;
                        arg0.field2615 = var9;
                    }
                }
            }
        }
        if (arg0.field2630 < 128 || arg0.field2615 < 128 || arg0.field2630 >= 13184 || arg0.field2615 >= 13184) {
            arg0.field2644 = -1;
            arg0.field2623 = -1;
            arg0.field2658 = 0;
            arg0.field2629 = 0;
            arg0.field2630 = arg0.field2649[0] * 128 + arg0.field2654 * 64;
            arg0.field2615 = arg0.field2652[0] * 128 + arg0.field2654 * 64;
            arg0.method2906();
        }
        if (Statics.field1230 == arg0 && (arg0.field2630 < 1536 || arg0.field2615 < 1536 || arg0.field2630 >= 11776 || arg0.field2615 >= 11776)) {
            arg0.field2644 = -1;
            arg0.field2623 = -1;
            arg0.field2658 = 0;
            arg0.field2629 = 0;
            arg0.field2630 = arg0.field2649[0] * 128 + arg0.field2654 * 64;
            arg0.field2615 = arg0.field2652[0] * 128 + arg0.field2654 * 64;
            arg0.method2906();
        }
        if (arg0.field2665 != 0) {
            if (arg0.field2638 != -1 && arg0.field2638 < 32768) {
                class184 var14 = field2062[arg0.field2638];
                if (var14 != null) {
                    int var15 = arg0.field2630 - var14.field2630;
                    int var16 = arg0.field2615 - var14.field2615;
                    if (var15 != 0 || var16 != 0) {
                        arg0.field2670 = (int) (Math.atan2((double) var15, (double) var16) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field2638 >= 32768) {
                int var17 = arg0.field2638 - 32768;
                if (field2078 == var17) {
                    var17 = 2047;
                }
                class183 var18 = field2040[var17];
                if (var18 != null) {
                    int var19 = arg0.field2630 - var18.field2630;
                    int var20 = arg0.field2615 - var18.field2615;
                    if (var19 != 0 || var20 != 0) {
                        arg0.field2670 = (int) (Math.atan2((double) var19, (double) var20) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field2663 != 0 || arg0.field2632 != 0) && (arg0.field2666 == 0 || arg0.field2618 > 0)) {
                int var21 = arg0.field2630 - (arg0.field2663 * 64 - Statics.field125 * 64 - Statics.field125 * 64);
                int var22 = arg0.field2615 - (arg0.field2632 * 64 - Statics.field542 * 64 - Statics.field542 * 64);
                if (var21 != 0 || var22 != 0) {
                    arg0.field2670 = (int) (Math.atan2((double) var21, (double) var22) * 325.949D) & 0x7FF;
                }
                arg0.field2663 = 0;
                arg0.field2632 = 0;
            }
            int var23 = arg0.field2670 - arg0.field2616 & 0x7FF;
            if (var23 == 0) {
                arg0.field2664 = 0;
            } else {
                arg0.field2664++;
                if (var23 > 1024) {
                    arg0.field2616 -= arg0.field2665;
                    boolean var24 = true;
                    if (var23 < arg0.field2665 || var23 > 2048 - arg0.field2665) {
                        arg0.field2616 = arg0.field2670;
                        var24 = false;
                    }
                    if (arg0.field2641 == arg0.field2619 && (arg0.field2664 > 25 || var24)) {
                        if (arg0.field2620 == -1) {
                            arg0.field2641 = arg0.field2622;
                        } else {
                            arg0.field2641 = arg0.field2620;
                        }
                    }
                } else {
                    arg0.field2616 += arg0.field2665;
                    boolean var25 = true;
                    if (var23 < arg0.field2665 || var23 > 2048 - arg0.field2665) {
                        arg0.field2616 = arg0.field2670;
                        var25 = false;
                    }
                    if (arg0.field2641 == arg0.field2619 && (arg0.field2664 > 25 || var25)) {
                        if (arg0.field2621 == -1) {
                            arg0.field2641 = arg0.field2622;
                        } else {
                            arg0.field2641 = arg0.field2621;
                        }
                    }
                }
                arg0.field2616 &= 0x7FF;
            }
        }
        method690(arg0);
    }

    @ObfuscatedName("av.cu(Lfz;B)V")
    public static final void method541(class179 arg0) {
        if (field1919 == arg0.field2629 || arg0.field2644 == -1 || arg0.field2647 != 0 || arg0.field2646 + 1 > class156.method482(arg0.field2644).field2364[arg0.field2631]) {
            int var1 = arg0.field2629 - arg0.field2658;
            int var2 = field1919 - arg0.field2658;
            int var3 = arg0.field2654 * 64 + arg0.field2642 * 128;
            int var4 = arg0.field2656 * 128 + arg0.field2654 * 64;
            int var5 = arg0.field2655 * 128 + arg0.field2654 * 64;
            int var6 = arg0.field2657 * 128 + arg0.field2654 * 64;
            arg0.field2630 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field2615 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field2618 = 0;
        if (arg0.field2660 == 0) {
            arg0.field2670 = 1024;
        }
        if (arg0.field2660 == 1) {
            arg0.field2670 = 1536;
        }
        if (arg0.field2660 == 2) {
            arg0.field2670 = 0;
        }
        if (arg0.field2660 == 3) {
            arg0.field2670 = 512;
        }
        arg0.field2616 = arg0.field2670;
    }

    @ObfuscatedName("al.dm(Lfz;B)V")
    public static final void method690(class179 arg0) {
        arg0.field2617 = false;
        if (arg0.field2641 != -1) {
            class156 var1 = class156.method482(arg0.field2641);
            if (var1 == null || var1.field2362 == null) {
                arg0.field2641 = -1;
            } else {
                arg0.field2643++;
                if (arg0.field2639 < var1.field2362.length && arg0.field2643 > var1.field2364[arg0.field2639]) {
                    arg0.field2643 = 1;
                    arg0.field2639++;
                    method852(var1, arg0.field2639, arg0.field2630, arg0.field2615);
                }
                if (arg0.field2639 >= var1.field2362.length) {
                    arg0.field2643 = 0;
                    arg0.field2639 = 0;
                    method852(var1, arg0.field2639, arg0.field2630, arg0.field2615);
                }
            }
        }
        if (arg0.field2623 != -1 && field1919 >= arg0.field2645) {
            if (arg0.field2650 < 0) {
                arg0.field2650 = 0;
            }
            int var2 = class157.method404(arg0.field2623).field2381;
            if (var2 == -1) {
                arg0.field2623 = -1;
            } else {
                class156 var3 = class156.method482(var2);
                if (var3 == null || var3.field2362 == null) {
                    arg0.field2623 = -1;
                } else {
                    arg0.field2651++;
                    if (arg0.field2650 < var3.field2362.length && arg0.field2651 > var3.field2364[arg0.field2650]) {
                        arg0.field2651 = 1;
                        arg0.field2650++;
                        method852(var3, arg0.field2650, arg0.field2630, arg0.field2615);
                    }
                    if (arg0.field2650 >= var3.field2362.length && (arg0.field2650 < 0 || arg0.field2650 >= var3.field2362.length)) {
                        arg0.field2623 = -1;
                    }
                }
            }
        }
        if (arg0.field2644 != -1 && arg0.field2647 <= 1) {
            class156 var4 = class156.method482(arg0.field2644);
            if (var4.field2370 == 1 && arg0.field2671 > 0 && arg0.field2658 <= field1919 && arg0.field2629 < field1919) {
                arg0.field2647 = 1;
                return;
            }
        }
        if (arg0.field2644 != -1 && arg0.field2647 == 0) {
            class156 var5 = class156.method482(arg0.field2644);
            if (var5 == null || var5.field2362 == null) {
                arg0.field2644 = -1;
            } else {
                arg0.field2646++;
                if (arg0.field2631 < var5.field2362.length && arg0.field2646 > var5.field2364[arg0.field2631]) {
                    arg0.field2646 = 1;
                    arg0.field2631++;
                    method852(var5, arg0.field2631, arg0.field2630, arg0.field2615);
                }
                if (arg0.field2631 >= var5.field2362.length) {
                    arg0.field2631 -= var5.field2366;
                    arg0.field2648++;
                    if (arg0.field2648 >= var5.field2372) {
                        arg0.field2644 = -1;
                    } else if (arg0.field2631 >= 0 && arg0.field2631 < var5.field2362.length) {
                        method852(var5, arg0.field2631, arg0.field2630, arg0.field2615);
                    } else {
                        arg0.field2644 = -1;
                    }
                }
                arg0.field2617 = var5.field2357;
            }
        }
        if (arg0.field2647 > 0) {
            arg0.field2647--;
        }
    }

    @ObfuscatedName("r.dv(Lgi;IIS)V")
    public static void method54(class183 arg0, int arg1, int arg2) {
        if (arg0.field2644 == arg1 && arg1 != -1) {
            int var3 = class156.method482(arg1).field2375;
            if (var3 == 1) {
                arg0.field2631 = 0;
                arg0.field2646 = 0;
                arg0.field2647 = arg2;
                arg0.field2648 = 0;
            }
            if (var3 == 2) {
                arg0.field2648 = 0;
            }
        } else if (arg1 == -1 || arg0.field2644 == -1 || class156.method482(arg1).field2369 >= class156.method482(arg0.field2644).field2369) {
            arg0.field2644 = arg1;
            arg0.field2631 = 0;
            arg0.field2646 = 0;
            arg0.field2647 = arg2;
            arg0.field2648 = 0;
            arg0.field2671 = arg0.field2666;
        }
    }

    @ObfuscatedName("bh.dn(Ljava/lang/String;ZI)V")
    public static final void method908(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1906.method2824(arg0, 250);
        int var6 = Statics.field1906.method2825(arg0, 250) * 13;
        class165.method2588(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class165.method2594(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1906.method2845(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method432(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field558.getGraphics();
                Statics.field1534.method531(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field558.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field2127; var13++) {
            if (field2134[var13] + field1979[var13] > var9 && field1979[var13] < var9 + var11 && field2151[var13] + field2049[var13] > var10 && field2049[var13] < var10 + var12) {
                field2130[var13] = true;
            }
        }
    }

    @ObfuscatedName("ac.dd(ZI)V")
    public static final void method479(boolean arg0) {
        if (Statics.field1230.field2630 >> 7 == field2089 && Statics.field1230.field2615 >> 7 == field2161) {
            field2089 = 0;
        }
        int var1 = field2041;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class183 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field1230;
                var4 = 33538048;
            } else {
                var3 = field2040[field2166[var2]];
                var4 = field2166[var2] << 14;
            }
            if (var3 != null && var3.method2909()) {
                var3.field2803 = false;
                if ((field1914 && field2041 > 50 || field2041 > 200) && !arg0 && var3.field2641 == var3.field2619) {
                    var3.field2803 = true;
                }
                int var5 = var3.field2630 >> 7;
                int var6 = var3.field2615 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field2798 == null || field1919 < var3.field2793 || field1919 >= var3.field2804) {
                        if ((var3.field2630 & 0x7F) == 64 && (var3.field2615 & 0x7F) == 64) {
                            if (field2107 == field2021[var5][var6]) {
                                continue;
                            }
                            field2021[var5][var6] = field2107;
                        }
                        var3.field2789 = method358(var3.field2630, var3.field2615, Statics.field2046);
                        Statics.field1481.method600(Statics.field2046, var3.field2630, var3.field2615, var3.field2789, 60, var3, var3.field2616, var4, var3.field2617);
                    } else {
                        var3.field2803 = false;
                        var3.field2789 = method358(var3.field2630, var3.field2615, Statics.field2046);
                        Statics.field1481.method557(Statics.field2046, var3.field2630, var3.field2615, var3.field2789, 60, var3, var3.field2616, var4, var3.field2799, var3.field2800, var3.field2801, var3.field2786);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bs.dw(B)V")
    public static final void method850() {
        for (class175 var0 = (class175) field2135.method1298(); var0 != null; var0 = (class175) field2135.method1299()) {
            if (Statics.field2046 != var0.field2569 || field1919 > var0.field2575) {
                var0.method1328();
            } else if (field1919 >= var0.field2574) {
                if (var0.field2578 > 0) {
                    class184 var1 = field2062[var0.field2578 - 1];
                    if (var1 != null && var1.field2630 >= 0 && var1.field2630 < 13312 && var1.field2615 >= 0 && var1.field2615 < 13312) {
                        var0.method2895(var1.field2630, var1.field2615, method358(var1.field2630, var1.field2615, var0.field2569) - var0.field2573, field1919);
                    }
                }
                if (var0.field2578 < 0) {
                    int var2 = -var0.field2578 - 1;
                    class183 var3;
                    if (field2078 == var2) {
                        var3 = Statics.field1230;
                    } else {
                        var3 = field2040[var2];
                    }
                    if (var3 != null && var3.field2630 >= 0 && var3.field2630 < 13312 && var3.field2615 >= 0 && var3.field2615 < 13312) {
                        var0.method2895(var3.field2630, var3.field2615, method358(var3.field2630, var3.field2615, var0.field2569) - var0.field2573, field1919);
                    }
                }
                var0.method2893(field1997);
                Statics.field1481.method600(Statics.field2046, (int) var0.field2582, (int) var0.field2577, (int) var0.field2585, 60, var0, var0.field2588, -1, false);
            }
        }
    }

    @ObfuscatedName("au.db(S)V")
    public static final void method402() {
        for (class178 var0 = (class178) field2059.method1298(); var0 != null; var0 = (class178) field2059.method1299()) {
            if (Statics.field2046 != var0.field2604 || var0.field2606) {
                var0.method1328();
            } else if (field1919 >= var0.field2605) {
                var0.method2902(field1997);
                if (var0.field2606) {
                    var0.method1328();
                } else {
                    Statics.field1481.method600(var0.field2604, var0.field2607, var0.field2613, var0.field2609, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("ak.dz(B)I")
    public static final int method539() {
        int var0 = 3;
        if (Statics.field827 < 310) {
            int var1 = Statics.field350 >> 7;
            int var2 = Statics.field759 >> 7;
            int var3 = Statics.field1230.field2630 >> 7;
            int var4 = Statics.field1230.field2615 >> 7;
            if ((class3.field18[Statics.field2046][var1][var2] & 0x4) != 0) {
                var0 = Statics.field2046;
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
                    if ((class3.field18[Statics.field2046][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2046;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class3.field18[Statics.field2046][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2046;
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
                    if ((class3.field18[Statics.field2046][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2046;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class3.field18[Statics.field2046][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2046;
                        }
                    }
                }
            }
        }
        if ((class3.field18[Statics.field2046][Statics.field1230.field2630 >> 7][Statics.field1230.field2615 >> 7] & 0x4) != 0) {
            var0 = Statics.field2046;
        }
        return var0;
    }

    @ObfuscatedName("ct.dl(IIIII)V")
    public static final void method1175(int arg0, int arg1, int arg2, int arg3) {
        field2011 = 0;
        for (int var4 = -1; var4 < field2041 + field1999; var4++) {
            class179 var5;
            if (var4 == -1) {
                var5 = Statics.field1230;
            } else if (var4 < field2041) {
                var5 = field2040[field2166[var4]];
            } else {
                var5 = field2062[field1984[var4 - field2041]];
            }
            if (var5 != null && var5.method2909()) {
                if (var5 instanceof class184) {
                    class153 var6 = ((class184) var5).field2805;
                    if (var6.field2296 != null) {
                        var6 = var6.method2355();
                    }
                    if (var6 == null) {
                        continue;
                    }
                }
                if (var4 >= field2041) {
                    class153 var9 = ((class184) var5).field2805;
                    if (var9.field2296 != null) {
                        var9 = var9.method2355();
                    }
                    if (var9.field2284 >= 0 && var9.field2284 < Statics.field1226.length) {
                        method1429(var5, var5.field2662 + 15);
                        if (field2070 > -1) {
                            Statics.field1226[var9.field2284].method2676(field2070 + arg0 - 12, field1937 + arg1 - 30);
                        }
                    }
                    if (field1927 == 1 && field1928 == field1984[var4 - field2041] && field1919 % 20 < 10) {
                        method1429(var5, var5.field2662 + 15);
                        if (field2070 > -1) {
                            Statics.field1761[0].method2676(field2070 + arg0 - 12, field1937 + arg1 - 28);
                        }
                    }
                } else {
                    int var7 = 30;
                    class183 var8 = (class183) var5;
                    if (var8.field2788 != -1 || var8.field2802 != -1) {
                        method1429(var5, var5.field2662 + 15);
                        if (field2070 > -1) {
                            if (var8.field2788 != -1) {
                                Statics.field15[var8.field2788].method2676(field2070 + arg0 - 12, field1937 + arg1 - var7);
                                var7 += 25;
                            }
                            if (var8.field2802 != -1) {
                                Statics.field1226[var8.field2802].method2676(field2070 + arg0 - 12, field1937 + arg1 - var7);
                                var7 += 25;
                            }
                        }
                    }
                    if (var4 >= 0 && field1927 == 10 && field2184 == field2166[var4]) {
                        method1429(var5, var5.field2662 + 15);
                        if (field2070 > -1) {
                            Statics.field1761[1].method2676(field2070 + arg0 - 12, field1937 + arg1 - var7);
                        }
                    }
                }
                if (var5.field2627 != null && (var4 >= field2041 || field2122 == 0 || field2122 == 3 || field2122 == 1 && method766(((class183) var5).field2792))) {
                    method1429(var5, var5.field2662);
                    if (field2070 > -1 && field2011 < field1971) {
                        field2029[field2011] = Statics.field35.method2822(var5.field2627) / 2;
                        field2015[field2011] = Statics.field35.field2550;
                        field2013[field2011] = field2070;
                        field2014[field2011] = field1937;
                        field2017[field2011] = var5.field2667;
                        field2035[field2011] = var5.field2653;
                        field2019[field2011] = var5.field2628;
                        field2024[field2011] = var5.field2627;
                        field2011++;
                    }
                }
                if (var5.field2635 > field1919) {
                    method1429(var5, var5.field2662 + 15);
                    if (field2070 > -1) {
                        int var10 = var5.field2636 * 30 / var5.field2637;
                        if (var10 > 30) {
                            var10 = 30;
                        }
                        class165.method2588(field2070 + arg0 - 15, field1937 + arg1 - 3, var10, 5, 65280);
                        class165.method2588(field2070 + arg0 - 15 + var10, field1937 + arg1 - 3, 30 - var10, 5, 16711680);
                    }
                }
                for (int var11 = 0; var11 < 4; var11++) {
                    if (var5.field2634[var11] > field1919) {
                        method1429(var5, var5.field2662 / 2);
                        if (field2070 > -1) {
                            if (var11 == 1) {
                                field1937 -= 20;
                            }
                            if (var11 == 2) {
                                field2070 -= 15;
                                field1937 -= 10;
                            }
                            if (var11 == 3) {
                                field2070 += 15;
                                field1937 -= 10;
                            }
                            Statics.field1618[var5.field2633[var11]].method2676(field2070 + arg0 - 12, field1937 + arg1 - 12);
                            Statics.field1119.method2879(Integer.toString(var5.field2659[var11]), field2070 + arg0 - 1, field1937 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var12 = 0; var12 < field2011; var12++) {
            int var13 = field2013[var12];
            int var14 = field2014[var12];
            int var15 = field2029[var12];
            int var16 = field2015[var12];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var18 = 0; var18 < var12; var18++) {
                    if (var14 + 2 > field2014[var18] - field2015[var18] && var14 - var16 < field2014[var18] + 2 && var13 - var15 < field2029[var18] + field2013[var18] && var13 + var15 > field2013[var18] - field2029[var18] && field2014[var18] - field2015[var18] < var14) {
                        var14 = field2014[var18] - field2015[var18];
                        var17 = true;
                    }
                }
            }
            field2070 = field2013[var12];
            field1937 = field2014[var12] = var14;
            String var19 = field2024[var12];
            if (field2125 == 0) {
                int var20 = 16776960;
                if (field2017[var12] < 6) {
                    var20 = field2187[field2017[var12]];
                }
                if (field2017[var12] == 6) {
                    var20 = field2107 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field2017[var12] == 7) {
                    var20 = field2107 % 20 < 10 ? 255 : 65535;
                }
                if (field2017[var12] == 8) {
                    var20 = field2107 % 20 < 10 ? 45056 : 8454016;
                }
                if (field2017[var12] == 9) {
                    int var21 = 150 - field2019[var12];
                    if (var21 < 50) {
                        var20 = var21 * 1280 + 16711680;
                    } else if (var21 < 100) {
                        var20 = 16776960 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var20 = (var21 - 100) * 5 + 65280;
                    }
                }
                if (field2017[var12] == 10) {
                    int var22 = 150 - field2019[var12];
                    if (var22 < 50) {
                        var20 = var22 * 5 + 16711680;
                    } else if (var22 < 100) {
                        var20 = 16711935 - (var22 - 50) * 327680;
                    } else if (var22 < 150) {
                        var20 = (var22 - 100) * 327680 + 255 - (var22 - 100) * 5;
                    }
                }
                if (field2017[var12] == 11) {
                    int var23 = 150 - field2019[var12];
                    if (var23 < 50) {
                        var20 = 16777215 - var23 * 327685;
                    } else if (var23 < 100) {
                        var20 = (var23 - 50) * 327685 + 65280;
                    } else if (var23 < 150) {
                        var20 = 16777215 - (var23 - 100) * 327680;
                    }
                }
                if (field2035[var12] == 0) {
                    Statics.field35.method2879(var19, field2070 + arg0, field1937 + arg1, var20, 0);
                }
                if (field2035[var12] == 1) {
                    Statics.field35.method2881(var19, field2070 + arg0, field1937 + arg1, var20, 0, field2107);
                }
                if (field2035[var12] == 2) {
                    Statics.field35.method2832(var19, field2070 + arg0, field1937 + arg1, var20, 0, field2107);
                }
                if (field2035[var12] == 3) {
                    Statics.field35.method2817(var19, field2070 + arg0, field1937 + arg1, var20, 0, field2107, 150 - field2019[var12]);
                }
                if (field2035[var12] == 4) {
                    int var24 = (150 - field2019[var12]) * (Statics.field35.method2822(var19) + 100) / 150;
                    class165.method2583(field2070 + arg0 - 50, arg1, field2070 + arg0 + 50, arg1 + arg3);
                    Statics.field35.method2852(var19, field2070 + arg0 + 50 - var24, field1937 + arg1, var20, 0);
                    class165.method2586(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field2035[var12] == 5) {
                    int var25 = 150 - field2019[var12];
                    int var26 = 0;
                    if (var25 < 25) {
                        var26 = var25 - 25;
                    } else if (var25 > 125) {
                        var26 = var25 - 125;
                    }
                    class165.method2583(arg0, field1937 + arg1 - Statics.field35.field2550 - 1, arg0 + arg2, field1937 + arg1 + 5);
                    Statics.field35.method2879(var19, field2070 + arg0, field1937 + arg1 + var26, var20, 0);
                    class165.method2586(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field35.method2879(var19, field2070 + arg0, field1937 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("au.dh(I)V")
    public static final void method403() {
        field2037 = 0;
        int var0 = (Statics.field1230.field2630 >> 7) + Statics.field125;
        int var1 = (Statics.field1230.field2615 >> 7) + Statics.field542;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field2037 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field2037 = 1;
        }
        if (field2037 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field2037 = 0;
        }
    }

    @ObfuscatedName("k.dp(IIIII)V")
    public static final void method88(int arg0, int arg1, int arg2, int arg3) {
        if (field2028 == 1) {
            Statics.field11[field2163 / 100].method2676(field2053 - 8, field2026 - 8);
        }
        if (field2028 == 2) {
            Statics.field11[field2163 / 100 + 4].method2676(field2053 - 8, field2026 - 8);
        }
        method403();
        if (!field1925) {
            return;
        }
        int var4 = arg0 + 512 - 5;
        int var5 = arg1 + 20;
        Statics.field1906.method2828("Fps:" + field1542, var4, var5, 16776960, -1);
        int var9 = var5 + 15;
        Runtime var6 = Runtime.getRuntime();
        int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        int var8 = 16776960;
        if (var7 > 32768 && field1914) {
            var8 = 16711680;
        }
        if (var7 > 65536 && !field1914) {
            var8 = 16711680;
        }
        Statics.field1906.method2828("Mem:" + var7 + "k", var4, var9, var8, -1);
        var5 = var9 + 15;
    }

    @ObfuscatedName("dp.do(Lfz;IS)V")
    public static final void method1429(class179 arg0, int arg1) {
        method1334(arg0.field2630, arg0.field2615, arg1);
    }

    @ObfuscatedName("dd.df(IIII)V")
    public static final void method1334(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field2070 = -1;
            field1937 = -1;
            return;
        }
        int var3 = method358(arg0, arg1, Statics.field2046) - arg2;
        int var4 = arg0 - Statics.field350;
        int var5 = var3 - Statics.field850;
        int var6 = arg1 - Statics.field759;
        int var7 = class173.field2544[Statics.field827];
        int var8 = class173.field2545[Statics.field827];
        int var9 = class173.field2544[Statics.field1227];
        int var10 = class173.field2545[Statics.field1227];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field2070 = (var11 << 9) / var15 + 256;
            field1937 = (var14 << 9) / var15 + 167;
        } else {
            field2070 = -1;
            field1937 = -1;
        }
    }

    @ObfuscatedName("ae.dk(IIII)I")
    public static final int method358(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class3.field18[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class3.field23[var5][var3][var4] + class3.field23[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class3.field23[var5][var3][var4 + 1] + class3.field23[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("bc.de(IIIIIII)V")
    public static final void method765(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class173.field2544[var6];
            int var12 = class173.field2545[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class173.field2544[var7];
            int var15 = class173.field2545[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field350 = arg0 - var8;
        Statics.field850 = arg1 - var9;
        Statics.field759 = arg2 - var10;
        Statics.field827 = arg3;
        Statics.field1227 = arg4;
    }

    @ObfuscatedName("c.dc(ZI)V")
    public static final void method43(boolean arg0) {
        field2157 = arg0;
        if (!field2157) {
            int var1 = field1958.method1634();
            int var2 = field1958.method1712();
            int var3 = field1958.method1712();
            int var4 = field1958.method1623();
            int var5 = field1958.method1634();
            int var6 = (field2102 - field1958.field1722) / 16;
            Statics.field692 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    Statics.field692[var7][var8] = field1958.method1607();
                }
            }
            Statics.field179 = new int[var6];
            Statics.field865 = new int[var6];
            Statics.field1161 = new int[var6];
            Statics.field809 = new byte[var6][];
            Statics.field760 = new byte[var6][];
            boolean var9 = false;
            if ((var5 / 8 == 48 || var5 / 8 == 49) && var3 / 8 == 48) {
                var9 = true;
            }
            if (var5 / 8 == 48 && var3 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var5 - 6) / 8; var11 <= (var5 + 6) / 8; var11++) {
                for (int var12 = (var3 - 6) / 8; var12 <= (var3 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field179[var10] = var13;
                        Statics.field865[var10] = Statics.field111.method1034("m" + var11 + "_" + var12);
                        Statics.field1161[var10] = Statics.field111.method1034("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method122(var5, var3, var4, var2, var1);
            return;
        }
        int var14 = field1958.method1671();
        int var15 = field1958.method1632();
        int var16 = field1958.method1634();
        int var17 = field1958.method1623();
        field1958.method2311();
        for (int var18 = 0; var18 < 4; var18++) {
            for (int var19 = 0; var19 < 13; var19++) {
                for (int var20 = 0; var20 < 13; var20++) {
                    int var21 = field1958.method2316(1);
                    if (var21 == 1) {
                        field2042[var18][var19][var20] = field1958.method2316(26);
                    } else {
                        field2042[var18][var19][var20] = -1;
                    }
                }
            }
        }
        field1958.method2312();
        int var22 = (field2102 - field1958.field1722) / 16;
        Statics.field692 = new int[var22][4];
        for (int var23 = 0; var23 < var22; var23++) {
            for (int var24 = 0; var24 < 4; var24++) {
                Statics.field692[var23][var24] = field1958.method1633();
            }
        }
        int var25 = field1958.method1712();
        Statics.field179 = new int[var22];
        Statics.field865 = new int[var22];
        Statics.field1161 = new int[var22];
        Statics.field809 = new byte[var22][];
        Statics.field760 = new byte[var22][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field2042[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field179[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field179[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field865[var26] = Statics.field111.method1034("m" + var35 + "_" + var36);
                            Statics.field1161[var26] = Statics.field111.method1034("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method122(var16, var25, var17, var14, var15);
    }

    @ObfuscatedName("s.dt(IIIIII)V")
    public static final void method122(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1516 == arg0 && Statics.field490 == arg1 && field1970 == arg2 || !field1914) {
            return;
        }
        Statics.field1516 = arg0;
        Statics.field490 = arg1;
        field1970 = arg2;
        if (!field1914) {
            field1970 = 0;
        }
        method1009(25);
        method908(class75.field977, true);
        int var5 = Statics.field125;
        int var6 = Statics.field542;
        Statics.field125 = (arg0 - 6) * 8;
        Statics.field542 = (arg1 - 6) * 8;
        int var7 = Statics.field125 - var5;
        int var8 = Statics.field542 - var6;
        int var9 = Statics.field125;
        int var10 = Statics.field542;
        for (int var11 = 0; var11 < 32768; var11++) {
            class184 var12 = field2062[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field2649[var13] -= var7;
                    var12.field2652[var13] -= var8;
                }
                var12.field2630 -= var7 * 128;
                var12.field2615 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class183 var15 = field2040[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field2649[var16] -= var7;
                    var15.field2652[var16] -= var8;
                }
                var15.field2630 -= var7 * 128;
                var15.field2615 -= var8 * 128;
            }
        }
        Statics.field2046 = arg2;
        Statics.field1230.method2908(arg3, arg4, false);
        byte var17 = 0;
        byte var18 = 104;
        byte var19 = 1;
        if (var7 < 0) {
            var17 = 103;
            var18 = -1;
            var19 = -1;
        }
        byte var20 = 0;
        byte var21 = 104;
        byte var22 = 1;
        if (var8 < 0) {
            var20 = 103;
            var21 = -1;
            var22 = -1;
        }
        for (int var23 = var17; var23 != var18; var23 += var19) {
            for (int var24 = var20; var24 != var21; var24 += var22) {
                int var25 = var7 + var23;
                int var26 = var8 + var24;
                for (int var27 = 0; var27 < 4; var27++) {
                    if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                        field2056[var27][var23][var24] = field2056[var27][var25][var26];
                    } else {
                        field2056[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class128 var28 = (class128) field2057.method1298(); var28 != null; var28 = (class128) field2057.method1299()) {
            var28.field1637 -= var7;
            var28.field1629 -= var8;
            if (var28.field1637 < 0 || var28.field1629 < 0 || var28.field1637 >= 104 || var28.field1629 >= 104) {
                var28.method1328();
            }
        }
        if (field2089 != 0) {
            field2089 -= var7;
            field2161 -= var8;
        }
        field2175 = 0;
        field2181 = false;
        field2155 = -1;
        field2059.method1292();
        field2135.method1292();
    }

    @ObfuscatedName("o.ds(ZS)V")
    public static final void method40(boolean arg0) {
        method1785();
        field1962++;
        if (field1962 < 50 && !arg0) {
            return;
        }
        field1962 = 0;
        if (field1967 || Statics.field728 == null) {
            return;
        }
        field2162.method2308(24);
        try {
            Statics.field728.method371(field2162.field1725, 0, field2162.field1722);
            field2162.field1722 = 0;
        } catch (IOException var2) {
            field1967 = true;
        }
    }

    @ObfuscatedName("bb.da(IIIIII)V")
    public static final void method894(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1481.method651(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1481.method573(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1209.field2503;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class154 var13 = class154.method886(var12);
            if (var13.field2333 == -1) {
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
                class172 var14 = Statics.field188[var13.field2333];
                if (var14 != null) {
                    int var15 = (var13.field2315 * 4 - var14.field2513) / 2;
                    int var16 = (var13.field2316 * 4 - var14.field2516) / 2;
                    var14.method2752(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field2316) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1481.method571(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1481.method573(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class154 var22 = class154.method886(var21);
            if (var22.field2333 != -1) {
                class172 var23 = Statics.field188[var22.field2333];
                if (var23 != null) {
                    int var24 = (var22.field2315 * 4 - var23.field2513) / 2;
                    int var25 = (var22.field2316 * 4 - var23.field2516) / 2;
                    var23.method2752(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field2316) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1209.field2503;
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
        int var29 = Statics.field1481.method572(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class154 var31 = class154.method886(var30);
        if (var31.field2333 == -1) {
            return;
        }
        class172 var32 = Statics.field188[var31.field2333];
        if (var32 != null) {
            int var33 = (var31.field2315 * 4 - var32.field2513) / 2;
            int var34 = (var31.field2316 * 4 - var32.field2516) / 2;
            var32.method2752(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field2316) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ac.dq(IIII)Z")
    public static final boolean method480(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field1481.method573(Statics.field2046, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class154 var7 = class154.method886(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field2315;
                var9 = var7.field2316;
            } else {
                var8 = var7.field2316;
                var9 = var7.field2315;
            }
            int var10 = var7.field2338;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field2053 = class37.field505;
        field2026 = class37.field506;
        field2028 = 2;
        field2163 = 0;
        return true;
    }

    @ObfuscatedName("cj.dg(B)Z")
    public static final boolean method1225() {
        if (Statics.field728 == null) {
            return false;
        }
        try {
            int var0 = Statics.field728.method369();
            if (var0 == 0) {
                return false;
            }
            if (field1960 == -1) {
                Statics.field728.method370(field1958.field1725, 0, 1);
                field1958.field1722 = 0;
                field1960 = field1958.method2326();
                field2102 = class96.field1467[field1960];
                var0--;
            }
            if (field2102 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field728.method370(field1958.field1725, 0, 1);
                field2102 = field1958.field1725[0] & 0xFF;
                var0--;
            }
            if (field2102 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field728.method370(field1958.field1725, 0, 2);
                field1958.field1722 = 0;
                field2102 = field1958.method1712();
                var0 -= 2;
            }
            if (var0 < field2102) {
                return false;
            }
            field1958.field1722 = 0;
            Statics.field728.method370(field1958.field1725, 0, field2102);
            field1961 = 0;
            field1966 = field1933;
            field1933 = field2147;
            field2147 = field1960;
            if (field1960 == 174) {
                int var1 = field1958.method1712();
                int var2 = field1958.method1602();
                int var3 = field1958.method1712();
                if (field2172 != 0 && var2 != 0 && field2175 < 50) {
                    field2005[field2175] = var1;
                    field2177[field2175] = var2;
                    field2178[field2175] = var3;
                    field2180[field2175] = null;
                    field2179[field2175] = 0;
                    field2175++;
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 192) {
                int var7 = field1958.method1633();
                int var8 = field1958.method1684();
                class141 var9 = class141.method451(var7);
                if (var9.field1811 != var8 || var8 == -1) {
                    var9.field1811 = var8;
                    var9.field1881 = 0;
                    var9.field1858 = 0;
                    method542(var9);
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 100) {
                field1927 = field1958.method1602();
                if (field1927 == 1) {
                    field1928 = field1958.method1712();
                }
                if (field1927 >= 2 && field1927 <= 6) {
                    if (field1927 == 2) {
                        field2190 = 64;
                        field2094 = 64;
                    }
                    if (field1927 == 3) {
                        field2190 = 0;
                        field2094 = 64;
                    }
                    if (field1927 == 4) {
                        field2190 = 128;
                        field2094 = 64;
                    }
                    if (field1927 == 5) {
                        field2190 = 64;
                        field2094 = 0;
                    }
                    if (field1927 == 6) {
                        field2190 = 64;
                        field2094 = 128;
                    }
                    field1927 = 2;
                    field1930 = field1958.method1712();
                    field2065 = field1958.method1712();
                    field2113 = field1958.method1602();
                }
                if (field1927 == 10) {
                    field2184 = field1958.method1712();
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 5) {
                int var10 = field1958.method1623();
                int var11 = field1958.method1623();
                int var12 = field1958.method1625();
                Statics.field2046 = var10 >> 1;
                Statics.field1230.method2908(var11, var12, (var10 & 0x1) == 1);
                field1960 = -1;
                return true;
            }
            if (field1960 == 216) {
                field1958.field1722 += 28;
                if (field1958.method1621()) {
                    class151 var13 = field1958;
                    int var14 = field1958.field1722 - 28;
                    if (class39.field518 != null) {
                        try {
                            class39.field518.method127(0L);
                            class39.field518.method132(var13.field1725, var14, 24);
                        } catch (Exception var330) {
                        }
                    }
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 188 || field1960 == 184 || field1960 == 104 || field1960 == 219 || field1960 == 141 || field1960 == 190 || field1960 == 156 || field1960 == 80 || field1960 == 134 || field1960 == 251 || field1960 == 172) {
                method752();
                field1960 = -1;
                return true;
            }
            if (field1960 == 207) {
                int var16 = field1958.method1632();
                field2168 = var16;
                if (class141.method1494(var16)) {
                    class141[] var17 = Statics.field1807[var16];
                    for (int var18 = 0; var18 < var17.length; var18++) {
                        class141 var19 = var17[var18];
                        if (var19 != null) {
                            var19.field1881 = 0;
                            var19.field1858 = 0;
                        }
                    }
                }
                class12.method537(field2168);
                for (int var20 = 0; var20 < 100; var20++) {
                    field2129[var20] = true;
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 44) {
                int var21 = field1958.method1634();
                int var22 = field1958.method1633();
                class141 var23 = class141.method451(var22);
                if (var23.field1882 != 1 || var23.field1808 != var21) {
                    var23.field1882 = 1;
                    var23.field1808 = var21;
                    method542(var23);
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 6) {
                String var24 = field1958.method1610();
                int var25 = field1958.method1712();
                byte var26 = field1958.method1603();
                boolean var27 = false;
                if (var26 == -128) {
                    var27 = true;
                }
                if (var27) {
                    if (Statics.field1116 == 0) {
                        field1960 = -1;
                        return true;
                    }
                    boolean var28 = false;
                    int var29;
                    for (var29 = 0; var29 < Statics.field1116 && (!Statics.field544[var29].field1621.equals(var24) || Statics.field544[var29].field1619 != var25); var29++) {
                    }
                    if (var29 < Statics.field1116) {
                        while (var29 < Statics.field1116 - 1) {
                            Statics.field544[var29] = Statics.field544[var29 + 1];
                            var29++;
                        }
                        Statics.field1116--;
                        Statics.field544[Statics.field1116] = null;
                    }
                } else {
                    field1958.method1610();
                    class126 var30 = new class126();
                    var30.field1621 = var24;
                    var30.field1620 = class84.method1100(var30.field1621, Statics.field1912);
                    var30.field1619 = var25;
                    var30.field1622 = var26;
                    int var31;
                    for (var31 = Statics.field1116 - 1; var31 >= 0; var31--) {
                        int var32 = Statics.field544[var31].field1620.compareTo(var30.field1621);
                        if (var32 == 0) {
                            Statics.field544[var31].field1619 = var25;
                            Statics.field544[var31].field1622 = var26;
                            if (var24.equals(Statics.field1230.field2792)) {
                                Statics.field693 = var26;
                            }
                            field2117 = field1954;
                            field1960 = -1;
                            return true;
                        }
                        if (var32 < 0) {
                            break;
                        }
                    }
                    if (Statics.field1116 >= Statics.field544.length) {
                        field1960 = -1;
                        return true;
                    }
                    for (int var33 = Statics.field1116 - 1; var33 > var31; var33--) {
                        Statics.field544[var33 + 1] = Statics.field544[var33];
                    }
                    if (Statics.field1116 == 0) {
                        Statics.field544 = new class126[100];
                    }
                    Statics.field544[var31 + 1] = var30;
                    Statics.field1116++;
                    if (var24.equals(Statics.field1230.field2792)) {
                        Statics.field693 = var26;
                    }
                }
                field2117 = field1954;
                field1960 = -1;
                return true;
            }
            if (field1960 == 88) {
                int var34 = field1958.method1607();
                int var35 = field1958.method1632();
                class141 var36 = class141.method451(var34);
                if (var36 != null && var36.field1806 == 0) {
                    if (var35 > var36.field1836 - var36.field1785) {
                        var35 = var36.field1836 - var36.field1785;
                    }
                    if (var35 < 0) {
                        var35 = 0;
                    }
                    if (var36.field1789 != var35) {
                        var36.field1789 = var35;
                        method542(var36);
                    }
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 92) {
                int var37 = field1958.method1632();
                if (var37 == 65535) {
                    var37 = -1;
                }
                if (var37 == -1 && !field2170) {
                    Statics.field1131.method2286();
                    class79.field1130 = 1;
                    Statics.field1125 = null;
                } else if (var37 != -1 && field1932 != var37 && field2075 != 0 && !field2170) {
                    class79.method6(2, Statics.field702, var37, 0, field2075, false);
                }
                field1932 = var37;
                field1960 = -1;
                return true;
            }
            if (field1960 == 3) {
                int var38 = field1958.method1632();
                if (var38 == 65535) {
                    var38 = -1;
                }
                int var39 = field1958.method1637();
                if (field2075 != 0 && var38 != -1) {
                    class79.method278(Statics.field2103, var38, 0, field2075, false);
                    field2170 = true;
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 86) {
                boolean var40 = field1958.method1625() == 1;
                int var41 = field1958.method1607();
                class141 var42 = class141.method451(var41);
                if (var42.field1829 != var40) {
                    var42.field1829 = var40;
                    method542(var42);
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 103) {
                Statics.field373 = field1958.method1587();
                Statics.field356 = field1958.method1625();
                while (field1958.field1722 < field2102) {
                    field1960 = field1958.method1602();
                    method752();
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 236) {
                method43(false);
                field1960 = -1;
                return true;
            }
            if (field1960 == 29) {
                int var43 = field1958.method1724();
                int var44 = field1958.method1625();
                int var45 = field1958.method1671();
                class124 var46 = (class124) field2160.method1290((long) var43);
                if (var46 != null) {
                    method720(var46, var46.field1602 != var45);
                }
                method799(var43, var45, var44);
                field1960 = -1;
                return true;
            }
            if (field1960 == 129) {
                int var47 = field1958.method1641();
                int var48 = field1958.method1632();
                class141 var49 = class141.method451(var47);
                if (var49.field1882 != 2 || var49.field1808 != var48) {
                    var49.field1882 = 2;
                    var49.field1808 = var48;
                    method542(var49);
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 58) {
                method538();
                field1960 = -1;
                return true;
            }
            if (field1960 == 27) {
                field2012 = 0;
                field2043 = 0;
                field1958.method2311();
                int var50 = field1958.method2316(8);
                if (var50 < field1999) {
                    for (int var51 = var50; var51 < field1999; var51++) {
                        field2050[++field2012 - 1] = field1984[var51];
                    }
                }
                if (var50 > field1999) {
                    throw new RuntimeException("");
                }
                field1999 = 0;
                for (int var52 = 0; var52 < var50; var52++) {
                    int var53 = field1984[var52];
                    class184 var54 = field2062[var53];
                    int var55 = field1958.method2316(1);
                    if (var55 == 0) {
                        field1984[++field1999 - 1] = var53;
                        var54.field2661 = field1919;
                    } else {
                        int var56 = field1958.method2316(2);
                        if (var56 == 0) {
                            field1984[++field1999 - 1] = var53;
                            var54.field2661 = field1919;
                            field2044[++field2043 - 1] = var53;
                        } else if (var56 == 1) {
                            field1984[++field1999 - 1] = var53;
                            var54.field2661 = field1919;
                            int var57 = field1958.method2316(3);
                            var54.method2911(var57, false);
                            int var58 = field1958.method2316(1);
                            if (var58 == 1) {
                                field2044[++field2043 - 1] = var53;
                            }
                        } else if (var56 == 2) {
                            field1984[++field1999 - 1] = var53;
                            var54.field2661 = field1919;
                            int var59 = field1958.method2316(3);
                            var54.method2911(var59, true);
                            int var60 = field1958.method2316(3);
                            var54.method2911(var60, true);
                            int var61 = field1958.method2316(1);
                            if (var61 == 1) {
                                field2044[++field2043 - 1] = var53;
                            }
                        } else if (var56 == 3) {
                            field2050[++field2012 - 1] = var53;
                        }
                    }
                }
                while (field1958.method2313(field2102) >= 27) {
                    int var62 = field1958.method2316(15);
                    if (var62 == 32767) {
                        break;
                    }
                    boolean var63 = false;
                    if (field2062[var62] == null) {
                        field2062[var62] = new class184();
                        var63 = true;
                    }
                    class184 var64 = field2062[var62];
                    field1984[++field1999 - 1] = var62;
                    var64.field2661 = field1919;
                    int var65 = field2055[field1958.method2316(3)];
                    if (var63) {
                        var64.field2670 = var64.field2616 = var65;
                    }
                    var64.field2805 = class153.method1016(field1958.method2316(14));
                    int var66 = field1958.method2316(5);
                    if (var66 > 15) {
                        var66 -= 32;
                    }
                    int var67 = field1958.method2316(1);
                    if (var67 == 1) {
                        field2044[++field2043 - 1] = var62;
                    }
                    int var68 = field1958.method2316(5);
                    if (var68 > 15) {
                        var68 -= 32;
                    }
                    int var69 = field1958.method2316(1);
                    var64.field2654 = var64.field2805.field2272;
                    var64.field2665 = var64.field2805.field2295;
                    if (var64.field2665 == 0) {
                        var64.field2616 = 0;
                    }
                    var64.field2622 = var64.field2805.field2267;
                    var64.field2668 = var64.field2805.field2279;
                    var64.field2624 = var64.field2805.field2292;
                    var64.field2625 = var64.field2805.field2281;
                    var64.field2619 = var64.field2805.field2274;
                    var64.field2620 = var64.field2805.field2294;
                    var64.field2621 = var64.field2805.field2277;
                    var64.method2908(Statics.field1230.field2649[0] + var68, Statics.field1230.field2652[0] + var66, var69 == 1);
                }
                field1958.method2312();
                for (int var70 = 0; var70 < field2043; var70++) {
                    int var71 = field2044[var70];
                    class184 var72 = field2062[var71];
                    int var73 = field1958.method1602();
                    if ((var73 & 0x2) != 0) {
                        int var74 = field1958.method1602();
                        int var75 = field1958.method1602();
                        var72.method2907(var74, var75, field1919);
                        var72.field2635 = field1919 + 300;
                        var72.field2636 = field1958.method1587();
                        var72.field2637 = field1958.method1623();
                    }
                    if ((var73 & 0x80) != 0) {
                        var72.field2623 = field1958.method1712();
                        int var76 = field1958.method1724();
                        var72.field2614 = var76 >> 16;
                        var72.field2645 = (var76 & 0xFFFF) + field1919;
                        var72.field2650 = 0;
                        var72.field2651 = 0;
                        if (var72.field2645 > field1919) {
                            var72.field2650 = -1;
                        }
                        if (var72.field2623 == 65535) {
                            var72.field2623 = -1;
                        }
                    }
                    if ((var73 & 0x10) != 0) {
                        int var77 = field1958.method1634();
                        if (var77 == 65535) {
                            var77 = -1;
                        }
                        int var78 = field1958.method1623();
                        if (var72.field2644 == var77 && var77 != -1) {
                            int var79 = class156.method482(var77).field2375;
                            if (var79 == 1) {
                                var72.field2631 = 0;
                                var72.field2646 = 0;
                                var72.field2647 = var78;
                                var72.field2648 = 0;
                            }
                            if (var79 == 2) {
                                var72.field2648 = 0;
                            }
                        } else if (var77 == -1 || var72.field2644 == -1 || class156.method482(var77).field2369 >= class156.method482(var72.field2644).field2369) {
                            var72.field2644 = var77;
                            var72.field2631 = 0;
                            var72.field2646 = 0;
                            var72.field2647 = var78;
                            var72.field2648 = 0;
                            var72.field2671 = var72.field2666;
                        }
                    }
                    if ((var73 & 0x4) != 0) {
                        int var80 = field1958.method1587();
                        int var81 = field1958.method1602();
                        var72.method2907(var80, var81, field1919);
                        var72.field2635 = field1919 + 300;
                        var72.field2636 = field1958.method1587();
                        var72.field2637 = field1958.method1602();
                    }
                    if ((var73 & 0x8) != 0) {
                        var72.field2638 = field1958.method1632();
                        if (var72.field2638 == 65535) {
                            var72.field2638 = -1;
                        }
                    }
                    if ((var73 & 0x20) != 0) {
                        var72.field2627 = field1958.method1610();
                        var72.field2628 = 100;
                    }
                    if ((var73 & 0x1) != 0) {
                        var72.field2805 = class153.method1016(field1958.method1632());
                        var72.field2654 = var72.field2805.field2272;
                        var72.field2665 = var72.field2805.field2295;
                        var72.field2622 = var72.field2805.field2267;
                        var72.field2668 = var72.field2805.field2279;
                        var72.field2624 = var72.field2805.field2292;
                        var72.field2625 = var72.field2805.field2281;
                        var72.field2619 = var72.field2805.field2274;
                        var72.field2620 = var72.field2805.field2294;
                        var72.field2621 = var72.field2805.field2277;
                    }
                    if ((var73 & 0x40) != 0) {
                        var72.field2663 = field1958.method1712();
                        var72.field2632 = field1958.method1632();
                    }
                }
                for (int var82 = 0; var82 < field2012; var82++) {
                    int var83 = field2050[var82];
                    if (field1919 != field2062[var83].field2661) {
                        field2062[var83].field2805 = null;
                        field2062[var83] = null;
                    }
                }
                if (field2102 != field1958.field1722) {
                    throw new RuntimeException(field1958.field1722 + class1.field6 + field2102);
                }
                for (int var84 = 0; var84 < field1999; var84++) {
                    if (field2062[field1984[var84]] == null) {
                        throw new RuntimeException(var84 + class1.field6 + field1999);
                    }
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 144) {
                int var85 = field1958.method1587();
                int var86 = field1958.method1587();
                String var87 = field1958.method1610();
                if (var85 >= 1 && var85 <= 8) {
                    if (var87.equalsIgnoreCase("null")) {
                        var87 = null;
                    }
                    field2047[var85 - 1] = var87;
                    field2054[var85 - 1] = var86 == 0;
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 197) {
                field1926 = field1958.method1634() * 30;
                field2118 = field1954;
                field1960 = -1;
                return true;
            }
            if (field1960 == 10) {
                int var88 = field1958.method1712();
                byte var89 = field1958.method1627();
                class90.field1217[var88] = var89;
                if (class90.field1219[var88] != var89) {
                    class90.field1219[var88] = var89;
                    method1223(var88);
                }
                field2109[++field2110 - 1 & 0x1F] = var88;
                field1960 = -1;
                return true;
            }
            if (field1960 == 131) {
                method43(true);
                field1960 = -1;
                return true;
            }
            if (field1960 == 193) {
                String var90 = field1958.method1610();
                long var91 = field1958.method1624();
                long var93 = (long) field1958.method1712();
                long var95 = (long) field1958.method1606();
                int var97 = field1958.method1602();
                long var98 = (var93 << 32) + var95;
                boolean var100 = false;
                for (int var101 = 0; var101 < 100; var101++) {
                    if (field2006[var101] == var98) {
                        var100 = true;
                        break;
                    }
                }
                if (var97 <= 1 && method1769(var90)) {
                    var100 = true;
                }
                if (!var100 && field2037 == 0) {
                    field2006[field2148] = var98;
                    field2148 = (field2148 + 1) % 100;
                    String var102 = class174.method2826(class83.method44(class110.method1451(field1958)));
                    if (var97 == 2 || var97 == 3) {
                        method1507(9, class1.method1118(1) + var90, var102, Statics.method1117(var91));
                    } else if (var97 == 1) {
                        method1507(9, class1.method1118(0) + var90, var102, Statics.method1117(var91));
                    } else {
                        method1507(9, var90, var102, Statics.method1117(var91));
                    }
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 12) {
                method697();
                field1908 = field1958.method1602();
                field2118 = field1954;
                field1960 = -1;
                return true;
            }
            if (field1960 == 31) {
                if (field2168 != -1) {
                    method901(field2168, 0);
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 117) {
                int var103 = field1958.method1641();
                int var104 = field1958.method1671();
                int var105 = var104 >> 10 & 0x1F;
                int var106 = var104 >> 5 & 0x1F;
                int var107 = var104 & 0x1F;
                int var108 = (var107 << 3) + (var105 << 19) + (var106 << 11);
                class141 var109 = class141.method451(var103);
                if (var109.field1792 != var108) {
                    var109.field1792 = var108;
                    method542(var109);
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 153) {
                field2181 = true;
                Statics.field1515 = field1958.method1602();
                Statics.field1117 = field1958.method1602();
                Statics.field112 = field1958.method1712();
                Statics.field694 = field1958.method1602();
                Statics.field200 = field1958.method1602();
                if (Statics.field200 >= 100) {
                    int var110 = Statics.field1515 * 128 + 64;
                    int var111 = Statics.field1117 * 128 + 64;
                    int var112 = method358(var110, var111, Statics.field2046) - Statics.field112;
                    int var113 = var110 - Statics.field350;
                    int var114 = var112 - Statics.field850;
                    int var115 = var111 - Statics.field759;
                    int var116 = (int) Math.sqrt((double) (var113 * var113 + var115 * var115));
                    Statics.field827 = (int) (Math.atan2((double) var114, (double) var116) * 325.949D) & 0x7FF;
                    Statics.field1227 = (int) (Math.atan2((double) var113, (double) var115) * -325.949D) & 0x7FF;
                    if (Statics.field827 < 128) {
                        Statics.field827 = 128;
                    }
                    if (Statics.field827 > 383) {
                        Statics.field827 = 383;
                    }
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 96) {
                int var117 = field1958.method1712();
                int var118 = field1958.method1712();
                int var119 = field1958.method1724();
                class141 var120 = class141.method451(var119);
                var120.field1819 = (var118 << 16) + var117;
                field1960 = -1;
                return true;
            }
            if (field1960 == 228) {
                int var121 = field1958.method1634();
                int var122 = field1958.method1724();
                class90.field1217[var121] = var122;
                if (class90.field1219[var121] != var122) {
                    class90.field1219[var121] = var122;
                    method1223(var121);
                }
                field2109[++field2110 - 1 & 0x1F] = var121;
                field1960 = -1;
                return true;
            }
            if (field1960 == 175) {
                class151 var123 = field1958;
                int var124 = field2102;
                class145 var125 = new class145();
                var125.field1898 = var123.method1602();
                var125.field1903 = var123.method1607();
                var125.field1899 = new int[var125.field1898];
                var125.field1897 = new int[var125.field1898];
                var125.field1901 = new Field[var125.field1898];
                var125.field1902 = new int[var125.field1898];
                var125.field1900 = new Method[var125.field1898];
                var125.field1904 = new byte[var125.field1898][][];
                for (int var126 = 0; var126 < var125.field1898; var126++) {
                    try {
                        int var127 = var123.method1602();
                        if (var127 == 0 || var127 == 1 || var127 == 2) {
                            String var128 = new String(var123.method1610());
                            String var129 = new String(var123.method1610());
                            int var130 = 0;
                            if (var127 == 1) {
                                var130 = var123.method1607();
                            }
                            var125.field1899[var126] = var127;
                            var125.field1902[var126] = var130;
                            Field[] var131 = var125.field1901;
                            Class var133;
                            if (var128.equals("B")) {
                                var133 = Byte.TYPE;
                            } else if (var128.equals("I")) {
                                var133 = Integer.TYPE;
                            } else if (var128.equals("S")) {
                                var133 = Short.TYPE;
                            } else if (var128.equals("J")) {
                                var133 = Long.TYPE;
                            } else if (var128.equals("Z")) {
                                var133 = Boolean.TYPE;
                            } else if (var128.equals("F")) {
                                var133 = Float.TYPE;
                            } else if (var128.equals("D")) {
                                var133 = Double.TYPE;
                            } else if (var128.equals("C")) {
                                var133 = Character.TYPE;
                            } else {
                                var133 = Class.forName(var128);
                            }
                            var131[var126] = var133.getDeclaredField(var129);
                        } else if (var127 == 3 || var127 == 4) {
                            String var134 = new String(var123.method1610());
                            String var135 = new String(var123.method1610());
                            int var136 = var123.method1602();
                            String[] var137 = new String[var136];
                            for (int var138 = 0; var138 < var136; var138++) {
                                var137[var138] = new String(var123.method1610());
                            }
                            byte[][] var139 = new byte[var136][];
                            if (var127 == 3) {
                                for (int var140 = 0; var140 < var136; var140++) {
                                    int var141 = var123.method1607();
                                    var139[var140] = new byte[var141];
                                    var123.method1626(var139[var140], 0, var141);
                                }
                            }
                            var125.field1899[var126] = var127;
                            Class[] var142 = new Class[var136];
                            for (int var143 = 0; var143 < var136; var143++) {
                                String var146 = var137[var143];
                                Class var147;
                                if (var146.equals("B")) {
                                    var147 = Byte.TYPE;
                                } else if (var146.equals("I")) {
                                    var147 = Integer.TYPE;
                                } else if (var146.equals("S")) {
                                    var147 = Short.TYPE;
                                } else if (var146.equals("J")) {
                                    var147 = Long.TYPE;
                                } else if (var146.equals("Z")) {
                                    var147 = Boolean.TYPE;
                                } else if (var146.equals("F")) {
                                    var147 = Float.TYPE;
                                } else if (var146.equals("D")) {
                                    var147 = Double.TYPE;
                                } else if (var146.equals("C")) {
                                    var147 = Character.TYPE;
                                } else {
                                    var147 = Class.forName(var146);
                                }
                                var142[var143] = var147;
                            }
                            Method[] var148 = var125.field1900;
                            Class var150;
                            if (var134.equals("B")) {
                                var150 = Byte.TYPE;
                            } else if (var134.equals("I")) {
                                var150 = Integer.TYPE;
                            } else if (var134.equals("S")) {
                                var150 = Short.TYPE;
                            } else if (var134.equals("J")) {
                                var150 = Long.TYPE;
                            } else if (var134.equals("Z")) {
                                var150 = Boolean.TYPE;
                            } else if (var134.equals("F")) {
                                var150 = Float.TYPE;
                            } else if (var134.equals("D")) {
                                var150 = Double.TYPE;
                            } else if (var134.equals("C")) {
                                var150 = Character.TYPE;
                            } else {
                                var150 = Class.forName(var134);
                            }
                            var148[var126] = var150.getDeclaredMethod(var135, var142);
                            var125.field1904[var126] = var139;
                        }
                    } catch (ClassNotFoundException var331) {
                        var125.field1897[var126] = -1;
                    } catch (SecurityException var332) {
                        var125.field1897[var126] = -2;
                    } catch (NullPointerException var333) {
                        var125.field1897[var126] = -3;
                    } catch (Exception var334) {
                        var125.field1897[var126] = -4;
                    } catch (Throwable var335) {
                        var125.field1897[var126] = -5;
                    }
                }
                class109.field1518.method1293(var125);
                field1960 = -1;
                return true;
            }
            if (field1960 == 164) {
                field2089 = 0;
                field1960 = -1;
                return true;
            }
            if (field1960 == 230) {
                String var156 = field1958.method1610();
                if (var156.endsWith(":tradereq:")) {
                    String var157 = var156.substring(0, var156.indexOf(":"));
                    boolean var158 = false;
                    if (method1769(var157)) {
                        var158 = true;
                    }
                    if (!var158 && field2037 == 0) {
                        method1101(4, var157, class75.field935);
                    }
                } else if (var156.endsWith(":duelreq:")) {
                    String var159 = var156.substring(0, var156.indexOf(":"));
                    boolean var160 = false;
                    if (method1769(var159)) {
                        var160 = true;
                    }
                    if (!var160 && field2037 == 0) {
                        method1101(8, var159, class75.field997);
                    }
                } else if (var156.endsWith(":chalreq:")) {
                    String var161 = var156.substring(0, var156.indexOf(":"));
                    boolean var162 = false;
                    if (method1769(var161)) {
                        var162 = true;
                    }
                    if (!var162 && field2037 == 0) {
                        String var163 = var156.substring(var156.indexOf(":") + 1, var156.length() - 9);
                        method1101(8, var161, var163);
                    }
                } else if (var156.endsWith(":assistreq:")) {
                    String var164 = var156.substring(0, var156.indexOf(":"));
                    boolean var165 = false;
                    if (method1769(var164)) {
                        var165 = true;
                    }
                    if (!var165 && field2037 == 0) {
                        method1101(10, var164, "");
                    }
                } else if (var156.endsWith(":clan:")) {
                    String var166 = var156.substring(0, var156.indexOf(":clan:"));
                    method1101(11, "", var166);
                } else if (var156.endsWith(":trade:")) {
                    String var167 = var156.substring(0, var156.indexOf(":trade:"));
                    if (field2037 == 0) {
                        method1101(12, "", var167);
                    }
                } else if (var156.endsWith(":assist:")) {
                    String var168 = var156.substring(0, var156.indexOf(":assist:"));
                    if (field2037 == 0) {
                        method1101(13, "", var168);
                    }
                } else {
                    method1101(0, "", var156);
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 237) {
                method1585();
                field1960 = -1;
                return false;
            }
            if (field1960 == 136) {
                for (int var169 = 0; var169 < Statics.field2479; var169++) {
                    class164 var170 = class164.method1337(var169);
                    if (var170 != null && var170.field2478 == 0) {
                        class90.field1217[var169] = 0;
                        class90.field1219[var169] = 0;
                    }
                }
                method697();
                field2110 += 32;
                field1960 = -1;
                return true;
            }
            if (field1960 == 157) {
                int var171 = field1958.method1607();
                String var172 = field1958.method1610();
                class141 var173 = class141.method451(var171);
                if (!var172.equals(var173.field1822)) {
                    var173.field1822 = var172;
                    method542(var173);
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 229) {
                int var174 = field1958.method1607();
                class124 var175 = (class124) field2160.method1290((long) var174);
                if (var175 != null) {
                    method720(var175, true);
                }
                if (field2087 != null) {
                    method542(field2087);
                    field2087 = null;
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 149) {
                int var176 = field1958.method1632();
                int var177 = field1958.method1641();
                int var178 = field1958.method1632();
                int var179 = field1958.method1671();
                class141 var180 = class141.method451(var177);
                if (var180.field1777 != var179 || var180.field1791 != var176 || var180.field1818 != var178) {
                    var180.field1777 = var179;
                    var180.field1791 = var176;
                    var180.field1818 = var178;
                    method542(var180);
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 152) {
                field2001 = 1;
                field2116 = field1954;
                field1960 = -1;
                return true;
            }
            if (field1960 == 61) {
                int var181 = field1958.method1641();
                class141 var182 = class141.method451(var181);
                for (int var183 = 0; var183 < var182.field1799.length; var183++) {
                    var182.field1799[var183] = -1;
                    var182.field1799[var183] = 0;
                }
                method542(var182);
                field1960 = -1;
                return true;
            }
            if (field1960 == 159) {
                int var184 = field1958.method1712();
                if (var184 == 65535) {
                    var184 = -1;
                }
                int var185 = field1958.method1607();
                int var186 = field1958.method1607();
                class141 var187 = class141.method451(var185);
                if (var187.field1774) {
                    var187.field1888 = var184;
                    var187.field1814 = var186;
                    class162 var189 = class162.method768(var184);
                    var187.field1777 = var189.field2474;
                    var187.field1791 = var189.field2448;
                    var187.field1817 = var189.field2445;
                    var187.field1813 = var189.field2446;
                    var187.field1850 = var189.field2447;
                    var187.field1818 = var189.field2442;
                    if (var187.field1782 > 0) {
                        var187.field1818 = var187.field1818 * 32 / var187.field1782;
                    }
                    method542(var187);
                } else if (var184 == -1) {
                    var187.field1882 = 0;
                    field1960 = -1;
                    return true;
                } else {
                    class162 var188 = class162.method768(var184);
                    var187.field1882 = 4;
                    var187.field1808 = var184;
                    var187.field1777 = var188.field2474;
                    var187.field1791 = var188.field2448;
                    var187.field1818 = var188.field2442 * 100 / var186;
                    method542(var187);
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 125) {
                Statics.field356 = field1958.method1587();
                Statics.field373 = field1958.method1602();
                for (int var190 = Statics.field373; var190 < Statics.field373 + 8; var190++) {
                    for (int var191 = Statics.field356; var191 < Statics.field356 + 8; var191++) {
                        if (field2056[Statics.field2046][var190][var191] != null) {
                            field2056[Statics.field2046][var190][var191] = null;
                            method92(var190, var191);
                        }
                    }
                }
                for (class128 var192 = (class128) field2057.method1298(); var192 != null; var192 = (class128) field2057.method1299()) {
                    if (var192.field1637 >= Statics.field373 && var192.field1637 < Statics.field373 + 8 && var192.field1629 >= Statics.field356 && var192.field1629 < Statics.field356 + 8 && Statics.field2046 == var192.field1635) {
                        var192.field1630 = 0;
                    }
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 60) {
                int var193 = field1958.method1641();
                Statics.field391 = Statics.field1551.method412(var193);
                field1960 = -1;
                return true;
            }
            if (field1960 == 123) {
                String var194 = field1958.method1610();
                long var195 = (long) field1958.method1712();
                long var197 = (long) field1958.method1606();
                int var199 = field1958.method1602();
                long var200 = (var195 << 32) + var197;
                boolean var202 = false;
                for (int var203 = 0; var203 < 100; var203++) {
                    if (field2006[var203] == var200) {
                        var202 = true;
                        break;
                    }
                }
                if (method1769(var194)) {
                    var202 = true;
                }
                if (!var202 && field2037 == 0) {
                    field2006[field2148] = var200;
                    field2148 = (field2148 + 1) % 100;
                    String var204 = class174.method2826(class83.method44(class110.method1451(field1958)));
                    if (var199 == 2 || var199 == 3) {
                        method1101(7, class1.method1118(1) + var194, var204);
                    } else if (var199 == 1) {
                        method1101(7, class1.method1118(0) + var194, var204);
                    } else {
                        method1101(3, var194, var204);
                    }
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 227) {
                for (int var205 = 0; var205 < class90.field1219.length; var205++) {
                    if (class90.field1219[var205] != class90.field1217[var205]) {
                        class90.field1219[var205] = class90.field1217[var205];
                        method1223(var205);
                        field2109[++field2110 - 1 & 0x1F] = var205;
                    }
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 108) {
                int var206 = field1958.method1605();
                int var207 = field1958.method1636();
                int var208 = field1958.method1724();
                class141 var209 = class141.method451(var208);
                int var210 = var209.field1812 + var207;
                int var211 = var209.field1816 + var206;
                if (var209.field1780 != var210 || var209.field1781 != var211) {
                    var209.field1780 = var210;
                    var209.field1781 = var211;
                    method542(var209);
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 167) {
                field2181 = false;
                for (int var212 = 0; var212 < 5; var212++) {
                    field2183[var212] = false;
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 67) {
                while (field1958.field1722 < field2102) {
                    boolean var213 = field1958.method1602() == 1;
                    String var214 = field1958.method1610();
                    String var215 = field1958.method1610();
                    int var216 = field1958.method1712();
                    int var217 = field1958.method1602();
                    int var218 = field1958.method1602();
                    boolean var219 = (var218 & 0x2) != 0;
                    boolean var220 = (var218 & 0x1) != 0;
                    if (var216 > 0) {
                        field1958.method1610();
                        field1958.method1602();
                        field1958.method1607();
                    }
                    field1958.method1610();
                    for (int var221 = 0; var221 < field2188; var221++) {
                        class10 var222 = field2030[var221];
                        if (var213) {
                            if (var215.equals(var222.field178)) {
                                var222.field178 = var214;
                                var222.field174 = var215;
                                var214 = null;
                                break;
                            }
                        } else if (var214.equals(var222.field178)) {
                            if (var222.field175 != var216) {
                                boolean var223 = true;
                                for (class122 var224 = (class122) field2192.method1272(); var224 != null; var224 = (class122) field2192.method1276()) {
                                    if (var224.field1588.equals(var214)) {
                                        if (var216 != 0 && var224.field1587 == 0) {
                                            var224.method1322();
                                            var223 = false;
                                        } else if (var216 == 0 && var224.field1587 != 0) {
                                            var224.method1322();
                                            var223 = false;
                                        }
                                    }
                                }
                                if (var223) {
                                    field2192.method1265(new class122(var214, var216));
                                }
                                var222.field175 = var216;
                            }
                            var222.field174 = var215;
                            var222.field176 = var217;
                            var222.field173 = var219;
                            var222.field177 = var220;
                            var214 = null;
                            break;
                        }
                    }
                    if (var214 != null && field2188 < 200) {
                        class10 var225 = new class10();
                        field2030[field2188] = var225;
                        var225.field178 = var214;
                        var225.field174 = var215;
                        var225.field175 = var216;
                        var225.field176 = var217;
                        var225.field173 = var219;
                        var225.field177 = var220;
                        field2188++;
                    }
                }
                field2001 = 2;
                field2116 = field1954;
                boolean var226 = false;
                int var227 = field2188;
                while (var227 > 0) {
                    boolean var228 = true;
                    var227--;
                    for (int var229 = 0; var229 < var227; var229++) {
                        boolean var230 = false;
                        class10 var231 = field2030[var229];
                        class10 var232 = field2030[var229 + 1];
                        if (field2083 != var231.field175 && field2083 == var232.field175) {
                            var230 = true;
                        }
                        if (!var230 && var231.field175 == 0 && var232.field175 != 0) {
                            var230 = true;
                        }
                        if (!var230 && !var231.field173 && var232.field173) {
                            var230 = true;
                        }
                        if (!var230 && !var231.field177 && var232.field177) {
                            var230 = true;
                        }
                        if (var230) {
                            class10 var233 = field2030[var229];
                            field2030[var229] = field2030[var229 + 1];
                            field2030[var229 + 1] = var233;
                            var228 = false;
                        }
                    }
                    if (var228) {
                        break;
                    }
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 127) {
                while (field1958.field1722 < field2102) {
                    int var234 = field1958.method1602();
                    boolean var235 = (var234 & 0x1) == 1;
                    String var236 = field1958.method1610();
                    String var237 = field1958.method1610();
                    field1958.method1610();
                    for (int var238 = 0; var238 < field2193; var238++) {
                        class4 var239 = field1959[var238];
                        if (var235) {
                            if (var237.equals(var239.field38)) {
                                var239.field38 = var236;
                                var239.field37 = var237;
                                var236 = null;
                                break;
                            }
                        } else if (var236.equals(var239.field38)) {
                            var239.field38 = var236;
                            var239.field37 = var237;
                            var236 = null;
                            break;
                        }
                    }
                    if (var236 != null && field2193 < 100) {
                        class4 var240 = new class4();
                        field1959[field2193] = var240;
                        var240.field38 = var236;
                        var240.field37 = var237;
                        field2193++;
                    }
                }
                field2116 = field1954;
                field1960 = -1;
                return true;
            }
            if (field1960 == 99) {
                field2122 = field1958.method1602();
                field2145 = field1958.method1602();
                field1960 = -1;
                return true;
            }
            if (field1960 == 28) {
                Statics.field36 = Statics.method798(field1958.method1602());
                field1960 = -1;
                return true;
            }
            if (field1960 == 15) {
                Statics.field356 = field1958.method1602();
                Statics.field373 = field1958.method1587();
                field1960 = -1;
                return true;
            }
            if (field1960 == 185) {
                field2181 = true;
                Statics.field846 = field1958.method1602();
                Statics.field714 = field1958.method1602();
                Statics.field1907 = field1958.method1712();
                Statics.field1162 = field1958.method1602();
                Statics.field1210 = field1958.method1602();
                if (Statics.field1210 >= 100) {
                    Statics.field350 = Statics.field846 * 128 + 64;
                    Statics.field759 = Statics.field714 * 128 + 64;
                    Statics.field850 = method358(Statics.field350, Statics.field759, Statics.field2046) - Statics.field1907;
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 205) {
                for (int var241 = 0; var241 < field2040.length; var241++) {
                    if (field2040[var241] != null) {
                        field2040[var241].field2644 = -1;
                    }
                }
                for (int var242 = 0; var242 < field2062.length; var242++) {
                    if (field2062[var242] != null) {
                        field2062[var242].field2644 = -1;
                    }
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 72) {
                String var243 = field1958.method1610();
                Object[] var244 = new Object[var243.length() + 1];
                for (int var245 = var243.length() - 1; var245 >= 0; var245--) {
                    if (var243.charAt(var245) == 's') {
                        var244[var245 + 1] = field1958.method1610();
                    } else {
                        var244[var245 + 1] = Integer.valueOf(field1958.method1607());
                    }
                }
                var244[0] = Integer.valueOf(field1958.method1607());
                class123 var246 = new class123();
                var246.field1590 = var244;
                class12.method1103(var246);
                field1960 = -1;
                return true;
            }
            if (field1960 == 242) {
                int var247 = field2102 + field1958.field1722;
                int var248 = field1958.method1712();
                int var249 = field1958.method1712();
                if (field2168 != var248) {
                    field2168 = var248;
                    int var250 = field2168;
                    if (class141.method1494(var250)) {
                        class141[] var251 = Statics.field1807[var250];
                        for (int var252 = 0; var252 < var251.length; var252++) {
                            class141 var253 = var251[var252];
                            if (var253 != null) {
                                var253.field1881 = 0;
                                var253.field1858 = 0;
                            }
                        }
                    }
                    class12.method537(field2168);
                    for (int var254 = 0; var254 < 100; var254++) {
                        field2129[var254] = true;
                    }
                }
                while (var249-- > 0) {
                    int var255 = field1958.method1607();
                    int var256 = field1958.method1712();
                    int var257 = field1958.method1602();
                    class124 var258 = (class124) field2160.method1290((long) var255);
                    if (var258 != null && var258.field1602 != var256) {
                        method720(var258, true);
                        var258 = null;
                    }
                    if (var258 == null) {
                        var258 = method799(var255, var256, var257);
                    }
                    var258.field1600 = true;
                }
                for (class124 var259 = (class124) field2160.method1280(); var259 != null; var259 = (class124) field2160.method1282()) {
                    if (var259.field1600) {
                        var259.field1600 = false;
                    } else {
                        method720(var259, true);
                    }
                }
                field2176 = new class104(512);
                while (field1958.field1722 < var247) {
                    int var260 = field1958.method1607();
                    int var261 = field1958.method1712();
                    int var262 = field1958.method1712();
                    int var263 = field1958.method1607();
                    for (int var264 = var261; var264 <= var262; var264++) {
                        long var265 = ((long) var260 << 32) + (long) var264;
                        field2176.method1279(new class142(var263), var265);
                    }
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 154) {
                method697();
                field2140 = field1958.method1605();
                field2118 = field1954;
                field1960 = -1;
                return true;
            }
            if (field1960 == 37) {
                method697();
                int var267 = field1958.method1724();
                int var268 = field1958.method1625();
                int var269 = field1958.method1623();
                field2093[var268] = var267;
                field2060[var268] = var269;
                field2061[var268] = 1;
                for (int var270 = 0; var270 < 98; var270++) {
                    if (var267 >= class71.field847[var270]) {
                        field2061[var268] = var270 + 2;
                    }
                }
                field2008[++field2114 - 1 & 0x1F] = var268;
                field1960 = -1;
                return true;
            }
            if (field1960 == 63) {
                field2167 = field1958.method1602();
                field1960 = -1;
                return true;
            }
            if (field1960 == 47) {
                int var271 = field1958.method1607();
                int var272 = field1958.method1712();
                if (var271 < -70000) {
                    var272 += 32768;
                }
                class141 var273;
                if (var271 >= 0) {
                    var273 = class141.method451(var271);
                } else {
                    var273 = null;
                }
                if (var273 != null) {
                    for (int var274 = 0; var274 < var273.field1799.length; var274++) {
                        var273.field1799[var274] = 0;
                        var273.field1878[var274] = 0;
                    }
                }
                class127 var275 = (class127) class127.field1624.method1290((long) var272);
                if (var275 != null) {
                    for (int var276 = 0; var276 < var275.field1623.length; var276++) {
                        var275.field1623[var276] = -1;
                        var275.field1625[var276] = 0;
                    }
                }
                int var277 = field1958.method1712();
                for (int var278 = 0; var278 < var277; var278++) {
                    int var279 = field1958.method1632();
                    int var280 = field1958.method1602();
                    if (var280 == 255) {
                        var280 = field1958.method1724();
                    }
                    if (var273 != null && var278 < var273.field1799.length) {
                        var273.field1799[var278] = var279;
                        var273.field1878[var278] = var280;
                    }
                    int var281 = var279 - 1;
                    class127 var282 = (class127) class127.field1624.method1290((long) var272);
                    if (var282 == null) {
                        var282 = new class127();
                        class127.field1624.method1279(var282, (long) var272);
                    }
                    if (var282.field1623.length <= var278) {
                        int[] var283 = new int[var278 + 1];
                        int[] var284 = new int[var278 + 1];
                        for (int var285 = 0; var285 < var282.field1623.length; var285++) {
                            var283[var285] = var282.field1623[var285];
                            var284[var285] = var282.field1625[var285];
                        }
                        for (int var286 = var282.field1623.length; var286 < var278; var286++) {
                            var283[var286] = -1;
                            var284[var286] = 0;
                        }
                        var282.field1623 = var283;
                        var282.field1625 = var284;
                    }
                    var282.field1623[var278] = var281;
                    var282.field1625[var278] = var280;
                }
                if (var273 != null) {
                    method542(var273);
                }
                method697();
                field2189[++field1951 - 1 & 0x1F] = var272 & 0x7FFF;
                field1960 = -1;
                return true;
            }
            if (field1960 == 138) {
                field2117 = field1954;
                if (field2102 == 0) {
                    field1921 = null;
                    field2154 = null;
                    Statics.field1116 = 0;
                    Statics.field544 = null;
                    field1960 = -1;
                    return true;
                }
                field2154 = field1958.method1610();
                long var287 = field1958.method1624();
                field1921 = class82.method805(var287);
                Statics.field12 = field1958.method1603();
                int var289 = field1958.method1602();
                if (var289 == 255) {
                    field1960 = -1;
                    return true;
                }
                Statics.field1116 = var289;
                class126[] var290 = new class126[100];
                for (int var291 = 0; var291 < Statics.field1116; var291++) {
                    var290[var291] = new class126();
                    var290[var291].field1621 = field1958.method1610();
                    var290[var291].field1620 = class84.method1100(var290[var291].field1621, Statics.field1912);
                    var290[var291].field1619 = field1958.method1712();
                    var290[var291].field1622 = field1958.method1603();
                    field1958.method1610();
                    if (var290[var291].field1621.equals(Statics.field1230.field2792)) {
                        Statics.field693 = var290[var291].field1622;
                    }
                }
                boolean var292 = false;
                int var293 = Statics.field1116;
                while (var293 > 0) {
                    boolean var294 = true;
                    var293--;
                    for (int var295 = 0; var295 < var293; var295++) {
                        if (var290[var295].field1620.compareTo(var290[var295 + 1].field1620) > 0) {
                            class126 var296 = var290[var295];
                            var290[var295] = var290[var295 + 1];
                            var290[var295 + 1] = var296;
                            var294 = false;
                        }
                    }
                    if (var294) {
                        break;
                    }
                }
                Statics.field544 = var290;
                field1960 = -1;
                return true;
            }
            if (field1960 == 26) {
                int var297 = field1958.method1632();
                Statics.method452(var297);
                field2189[++field1951 - 1 & 0x1F] = var297 & 0x7FFF;
                field1960 = -1;
                return true;
            }
            if (field1960 == 50) {
                int var298 = field1958.method1633();
                class141 var299 = class141.method451(var298);
                var299.field1882 = 3;
                var299.field1808 = Statics.field1230.field2794.method1154();
                method542(var299);
                field1960 = -1;
                return true;
            }
            if (field1960 == 97) {
                int var300 = field1958.method1633();
                int var301 = field1958.method1634();
                if (var301 == 65535) {
                    var301 = -1;
                }
                int var302 = field1958.method1633();
                int var303 = field1958.method1671();
                if (var303 == 65535) {
                    var303 = -1;
                }
                for (int var304 = var301; var304 <= var303; var304++) {
                    long var305 = ((long) var302 << 32) + (long) var304;
                    class107 var307 = field2176.method1290(var305);
                    if (var307 != null) {
                        var307.method1328();
                    }
                    field2176.method1279(new class142(var300), var305);
                }
                field1960 = -1;
                return true;
            }
            if (field1960 == 48) {
                int var308 = field1958.method1602();
                int var309 = field1958.method1602();
                int var310 = field1958.method1602();
                int var311 = field1958.method1602();
                field2183[var308] = true;
                field1942[var308] = var309;
                field2185[var308] = var310;
                field2186[var308] = var311;
                field2146[var308] = 0;
                field1960 = -1;
                return true;
            }
            if (field1960 == 19) {
                String var312 = field1958.method1610();
                String var313 = class174.method2826(class83.method44(class110.method1451(field1958)));
                method1101(6, var312, var313);
                field1960 = -1;
                return true;
            }
            if (field1960 == 224) {
                int var314 = field1958.method1607();
                int var315 = field1958.method1712();
                if (var314 < -70000) {
                    var315 += 32768;
                }
                class141 var316;
                if (var314 >= 0) {
                    var316 = class141.method451(var314);
                } else {
                    var316 = null;
                }
                while (field1958.field1722 < field2102) {
                    int var317 = field1958.method1615();
                    int var318 = field1958.method1712();
                    int var319 = 0;
                    if (var318 != 0) {
                        var319 = field1958.method1602();
                        if (var319 == 255) {
                            var319 = field1958.method1607();
                        }
                    }
                    if (var316 != null && var317 >= 0 && var317 < var316.field1799.length) {
                        var316.field1799[var317] = var318;
                        var316.field1878[var317] = var319;
                    }
                    int var320 = var318 - 1;
                    class127 var321 = (class127) class127.field1624.method1290((long) var315);
                    if (var321 == null) {
                        var321 = new class127();
                        class127.field1624.method1279(var321, (long) var315);
                    }
                    if (var321.field1623.length <= var317) {
                        int[] var322 = new int[var317 + 1];
                        int[] var323 = new int[var317 + 1];
                        for (int var324 = 0; var324 < var321.field1623.length; var324++) {
                            var322[var324] = var321.field1623[var324];
                            var323[var324] = var321.field1625[var324];
                        }
                        for (int var325 = var321.field1623.length; var325 < var317; var325++) {
                            var322[var325] = -1;
                            var323[var325] = 0;
                        }
                        var321.field1623 = var322;
                        var321.field1625 = var323;
                    }
                    var321.field1623[var317] = var320;
                    var321.field1625[var317] = var319;
                }
                if (var316 != null) {
                    method542(var316);
                }
                method697();
                field2189[++field1951 - 1 & 0x1F] = var315 & 0x7FFF;
                field1960 = -1;
                return true;
            }
            Statics.method244("" + field1960 + class1.field6 + field1933 + class1.field6 + field1966 + class1.field6 + field2102, (Throwable) null);
            method1585();
        } catch (IOException var336) {
            method2332();
        } catch (Exception var337) {
            String var328 = "" + field1960 + class1.field6 + field1933 + class1.field6 + field1966 + class1.field6 + field2102 + class1.field6 + (Statics.field125 + Statics.field1230.field2649[0]) + class1.field6 + (Statics.field542 + Statics.field1230.field2652[0]) + class1.field6;
            for (int var329 = 0; var329 < field2102 && var329 < 50; var329++) {
                var328 = var328 + field1958.field1725[var329] + class1.field6;
            }
            Statics.method244(var328, var337);
            method1585();
        }
        return true;
    }

    @ObfuscatedName("bf.du(B)V")
    public static final void method752() {
        if (field1960 == 219) {
            int var0 = field1958.method1632();
            int var1 = field1958.method1634();
            int var2 = field1958.method1623();
            int var3 = (var2 >> 4 & 0x7) + Statics.field373;
            int var4 = (var2 & 0x7) + Statics.field356;
            int var5 = field1958.method1712();
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && field2078 != var5) {
                class177 var6 = new class177();
                var6.field2602 = var1;
                var6.field2603 = var0;
                if (field2056[Statics.field2046][var3][var4] == null) {
                    field2056[Statics.field2046][var3][var4] = new class105();
                }
                field2056[Statics.field2046][var3][var4].method1293(var6);
                method92(var3, var4);
            }
        } else if (field1960 == 251) {
            int var7 = field1958.method1587();
            int var8 = var7 >> 2;
            int var9 = var7 & 0x3;
            int var10 = field2133[var8];
            int var11 = field1958.method1625();
            int var12 = (var11 >> 4 & 0x7) + Statics.field373;
            int var13 = (var11 & 0x7) + Statics.field356;
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                method305(Statics.field2046, var12, var13, var10, -1, var8, var9, 0, -1);
            }
        } else if (field1960 == 80) {
            int var14 = field1958.method1632();
            int var15 = field1958.method1671();
            int var16 = field1958.method1623();
            int var17 = (var16 >> 4 & 0x7) + Statics.field373;
            int var18 = (var16 & 0x7) + Statics.field356;
            if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                class177 var19 = new class177();
                var19.field2602 = var14;
                var19.field2603 = var15;
                if (field2056[Statics.field2046][var17][var18] == null) {
                    field2056[Statics.field2046][var17][var18] = new class105();
                }
                field2056[Statics.field2046][var17][var18].method1293(var19);
                method92(var17, var18);
            }
        } else if (field1960 == 141) {
            int var20 = field1958.method1602();
            int var21 = (var20 >> 4 & 0x7) + Statics.field373;
            int var22 = (var20 & 0x7) + Statics.field356;
            int var23 = field1958.method1712();
            int var24 = field1958.method1602();
            int var25 = field1958.method1712();
            if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
                int var26 = var21 * 128 + 64;
                int var27 = var22 * 128 + 64;
                class178 var28 = new class178(var23, Statics.field2046, var26, var27, method358(var26, var27, Statics.field2046) - var24, var25, field1919);
                field2059.method1293(var28);
            }
        } else {
            if (field1960 == 188) {
                int var29 = field1958.method1602();
                int var30 = (var29 >> 4 & 0x7) + Statics.field373;
                int var31 = (var29 & 0x7) + Statics.field356;
                int var32 = field1958.method1712();
                int var33 = field1958.method1602();
                int var34 = var33 >> 4 & 0xF;
                int var35 = var33 & 0x7;
                int var36 = field1958.method1602();
                if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                    int var37 = var34 + 1;
                    if (Statics.field1230.field2649[0] >= var30 - var37 && Statics.field1230.field2649[0] <= var30 + var37 && Statics.field1230.field2652[0] >= var31 - var37 && Statics.field1230.field2652[0] <= var31 + var37 && field2173 != 0 && var35 > 0 && field2175 < 50) {
                        field2005[field2175] = var32;
                        field2177[field2175] = var35;
                        field2178[field2175] = var36;
                        field2180[field2175] = null;
                        field2179[field2175] = (var30 << 16) + (var31 << 8) + var34;
                        field2175++;
                    }
                }
            }
            if (field1960 == 184) {
                int var38 = field1958.method1602();
                int var39 = (var38 >> 4 & 0x7) + Statics.field373;
                int var40 = (var38 & 0x7) + Statics.field356;
                int var41 = field1958.method1712();
                int var42 = field1958.method1712();
                int var43 = field1958.method1712();
                if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                    class105 var44 = field2056[Statics.field2046][var39][var40];
                    if (var44 != null) {
                        for (class177 var45 = (class177) var44.method1298(); var45 != null; var45 = (class177) var44.method1299()) {
                            if ((var41 & 0x7FFF) == var45.field2602 && var45.field2603 == var42) {
                                var45.field2603 = var43;
                                break;
                            }
                        }
                        method92(var39, var40);
                    }
                }
            } else if (field1960 == 134) {
                int var46 = field1958.method1625();
                int var47 = var46 >> 2;
                int var48 = var46 & 0x3;
                int var49 = field2133[var47];
                int var50 = field1958.method1625();
                int var51 = (var50 >> 4 & 0x7) + Statics.field373;
                int var52 = (var50 & 0x7) + Statics.field356;
                int var53 = field1958.method1712();
                if (var51 >= 0 && var52 >= 0 && var51 < 103 && var52 < 103) {
                    if (var49 == 0) {
                        class46 var54 = Statics.field1481.method565(Statics.field2046, var51, var52);
                        if (var54 != null) {
                            int var55 = var54.field657 >> 14 & 0x7FFF;
                            if (var47 == 2) {
                                var54.field650 = new class176(var55, 2, var48 + 4, Statics.field2046, var51, var52, var53, false, var54.field650);
                                var54.field656 = new class176(var55, 2, var48 + 1 & 0x3, Statics.field2046, var51, var52, var53, false, var54.field656);
                            } else {
                                var54.field650 = new class176(var55, var47, var48, Statics.field2046, var51, var52, var53, false, var54.field650);
                            }
                        }
                    }
                    if (var49 == 1) {
                        class54 var56 = Statics.field1481.method566(Statics.field2046, var51, var52);
                        if (var56 != null) {
                            int var57 = var56.field716 >> 14 & 0x7FFF;
                            if (var47 == 4 || var47 == 5) {
                                var56.field717 = new class176(var57, 4, var48, Statics.field2046, var51, var52, var53, false, var56.field717);
                            } else if (var47 == 6) {
                                var56.field717 = new class176(var57, 4, var48 + 4, Statics.field2046, var51, var52, var53, false, var56.field717);
                            } else if (var47 == 7) {
                                var56.field717 = new class176(var57, 4, (var48 + 2 & 0x3) + 4, Statics.field2046, var51, var52, var53, false, var56.field717);
                            } else if (var47 == 8) {
                                var56.field717 = new class176(var57, 4, var48 + 4, Statics.field2046, var51, var52, var53, false, var56.field717);
                                var56.field723 = new class176(var57, 4, (var48 + 2 & 0x3) + 4, Statics.field2046, var51, var52, var53, false, var56.field723);
                            }
                        }
                    }
                    if (var49 == 2) {
                        class48 var58 = Statics.field1481.method567(Statics.field2046, var51, var52);
                        if (var47 == 11) {
                            var47 = 10;
                        }
                        if (var58 != null) {
                            var58.field677 = new class176(var58.field679 >> 14 & 0x7FFF, var47, var48, Statics.field2046, var51, var52, var53, false, var58.field677);
                        }
                    }
                    if (var49 == 3) {
                        class53 var59 = Statics.field1481.method561(Statics.field2046, var51, var52);
                        if (var59 != null) {
                            var59.field708 = new class176(var59.field705 >> 14 & 0x7FFF, 22, var48, Statics.field2046, var51, var52, var53, false, var59.field708);
                        }
                    }
                }
            } else if (field1960 == 190) {
                int var60 = field1958.method1602();
                int var61 = (var60 >> 4 & 0x7) + Statics.field373;
                int var62 = (var60 & 0x7) + Statics.field356;
                int var63 = var61 + field1958.method1603();
                int var64 = var62 + field1958.method1603();
                int var65 = field1958.method1605();
                int var66 = field1958.method1712();
                int var67 = field1958.method1602() * 4;
                int var68 = field1958.method1602() * 4;
                int var69 = field1958.method1712();
                int var70 = field1958.method1712();
                int var71 = field1958.method1602();
                int var72 = field1958.method1602();
                if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104 && var66 != 65535) {
                    int var73 = var61 * 128 + 64;
                    int var74 = var62 * 128 + 64;
                    int var75 = var63 * 128 + 64;
                    int var76 = var64 * 128 + 64;
                    class175 var77 = new class175(var66, Statics.field2046, var73, var74, method358(var73, var74, Statics.field2046) - var67, field1919 + var69, field1919 + var70, var71, var72, var65, var68);
                    var77.method2895(var75, var76, method358(var75, var76, Statics.field2046) - var68, field1919 + var69);
                    field2135.method1293(var77);
                }
            } else {
                if (field1960 == 104) {
                    int var78 = field1958.method1671();
                    byte var79 = field1958.method1595();
                    int var80 = field1958.method1712();
                    byte var81 = field1958.method1603();
                    int var82 = field1958.method1625();
                    int var83 = (var82 >> 4 & 0x7) + Statics.field373;
                    int var84 = (var82 & 0x7) + Statics.field356;
                    byte var85 = field1958.method1628();
                    int var86 = field1958.method1602();
                    int var87 = var86 >> 2;
                    int var88 = var86 & 0x3;
                    int var89 = field2133[var87];
                    int var90 = field1958.method1632();
                    int var91 = field1958.method1632();
                    byte var92 = field1958.method1595();
                    class183 var93;
                    if (field2078 == var90) {
                        var93 = Statics.field1230;
                    } else {
                        var93 = field2040[var90];
                    }
                    if (var93 != null) {
                        class154 var94 = class154.method886(var80);
                        int var95;
                        int var96;
                        if (var88 == 1 || var88 == 3) {
                            var95 = var94.field2316;
                            var96 = var94.field2315;
                        } else {
                            var95 = var94.field2315;
                            var96 = var94.field2316;
                        }
                        int var97 = (var95 >> 1) + var83;
                        int var98 = (var95 + 1 >> 1) + var83;
                        int var99 = (var96 >> 1) + var84;
                        int var100 = (var96 + 1 >> 1) + var84;
                        int[][] var101 = class3.field23[Statics.field2046];
                        int var102 = var101[var97][var99] + var101[var98][var99] + var101[var97][var100] + var101[var98][var100] >> 2;
                        int var103 = (var83 << 7) + (var95 << 6);
                        int var104 = (var84 << 7) + (var96 << 6);
                        class181 var105 = var94.method2375(var87, var88, var101, var103, var102, var104);
                        if (var105 != null) {
                            method305(Statics.field2046, var83, var84, var89, -1, 0, 0, var91 + 1, var78 + 1);
                            var93.field2793 = field1919 + var91;
                            var93.field2804 = field1919 + var78;
                            var93.field2798 = var105;
                            var93.field2795 = var83 * 128 + var95 * 64;
                            var93.field2797 = var84 * 128 + var96 * 64;
                            var93.field2796 = var102;
                            if (var81 > var79) {
                                byte var106 = var81;
                                var81 = var79;
                                var79 = var106;
                            }
                            if (var92 > var85) {
                                byte var107 = var92;
                                var92 = var85;
                                var85 = var107;
                            }
                            var93.field2799 = var81 + var83;
                            var93.field2801 = var79 + var83;
                            var93.field2800 = var84 + var92;
                            var93.field2786 = var84 + var85;
                        }
                    }
                }
                if (field1960 == 156) {
                    int var108 = field1958.method1712();
                    int var109 = field1958.method1625();
                    int var110 = (var109 >> 4 & 0x7) + Statics.field373;
                    int var111 = (var109 & 0x7) + Statics.field356;
                    if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                        class105 var112 = field2056[Statics.field2046][var110][var111];
                        if (var112 != null) {
                            for (class177 var113 = (class177) var112.method1298(); var113 != null; var113 = (class177) var112.method1299()) {
                                if ((var108 & 0x7FFF) == var113.field2602) {
                                    var113.method1328();
                                    break;
                                }
                            }
                            if (var112.method1298() == null) {
                                field2056[Statics.field2046][var110][var111] = null;
                            }
                            method92(var110, var111);
                        }
                    }
                } else if (field1960 == 172) {
                    int var114 = field1958.method1623();
                    int var115 = (var114 >> 4 & 0x7) + Statics.field373;
                    int var116 = (var114 & 0x7) + Statics.field356;
                    int var117 = field1958.method1634();
                    int var118 = field1958.method1587();
                    int var119 = var118 >> 2;
                    int var120 = var118 & 0x3;
                    int var121 = field2133[var119];
                    if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                        method305(Statics.field2046, var115, var116, var121, var117, var119, var120, 0, -1);
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.dr(IIIIIIIIII)V")
    public static final void method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class128 var9 = null;
        for (class128 var10 = (class128) field2057.method1298(); var10 != null; var10 = (class128) field2057.method1299()) {
            if (var10.field1635 == arg0 && var10.field1637 == arg1 && var10.field1629 == arg2 && var10.field1627 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class128();
            var9.field1635 = arg0;
            var9.field1627 = arg3;
            var9.field1637 = arg1;
            var9.field1629 = arg2;
            method857(var9);
            field2057.method1293(var9);
        }
        var9.field1633 = arg4;
        var9.field1632 = arg5;
        var9.field1634 = arg6;
        var9.field1636 = arg7;
        var9.field1630 = arg8;
    }

    @ObfuscatedName("an.eo(I)V")
    public static final void method431() {
        for (class128 var0 = (class128) field2057.method1298(); var0 != null; var0 = (class128) field2057.method1299()) {
            if (var0.field1630 == -1) {
                var0.field1636 = 0;
                method857(var0);
            } else {
                var0.method1328();
            }
        }
    }

    @ObfuscatedName("bq.es(Ldg;I)V")
    public static final void method857(class128 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1627 == 0) {
            var1 = Statics.field1481.method651(arg0.field1635, arg0.field1637, arg0.field1629);
        }
        if (arg0.field1627 == 1) {
            var1 = Statics.field1481.method612(arg0.field1635, arg0.field1637, arg0.field1629);
        }
        if (arg0.field1627 == 2) {
            var1 = Statics.field1481.method571(arg0.field1635, arg0.field1637, arg0.field1629);
        }
        if (arg0.field1627 == 3) {
            var1 = Statics.field1481.method572(arg0.field1635, arg0.field1637, arg0.field1629);
        }
        if (var1 != 0) {
            int var5 = Statics.field1481.method573(arg0.field1635, arg0.field1637, arg0.field1629, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1626 = var2;
        arg0.field1628 = var3;
        arg0.field1631 = var4;
    }

    @ObfuscatedName("cy.eh(IIIIIIII)V")
    public static final void method1116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field1914 && Statics.field2046 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1481.method651(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1481.method612(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1481.method571(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1481.method572(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1481.method573(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1481.method543(arg0, arg2, arg3);
                class154 var15 = class154.method886(var12);
                if (var15.field2348 != 0) {
                    field1976[arg0].method1184(arg2, arg3, var13, var14, var15.field2318);
                }
            }
            if (arg1 == 1) {
                Statics.field1481.method588(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1481.method562(arg0, arg2, arg3);
                class154 var16 = class154.method886(var12);
                if (var16.field2315 + arg2 > 103 || var16.field2315 + arg3 > 103 || var16.field2316 + arg2 > 103 || var16.field2316 + arg3 > 103) {
                    return;
                }
                if (var16.field2348 != 0) {
                    field1976[arg0].method1197(arg2, arg3, var16.field2315, var16.field2316, var14, var16.field2318);
                }
            }
            if (arg1 == 3) {
                Statics.field1481.method563(arg0, arg2, arg3);
                class154 var17 = class154.method886(var12);
                if (var17.field2348 == 1) {
                    field1976[arg0].method1199(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class3.field18[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class45 var19 = Statics.field1481;
        class95 var20 = field1976[arg0];
        class154 var21 = class154.method886(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field2316;
            var23 = var21.field2315;
        } else {
            var22 = var21.field2315;
            var23 = var21.field2316;
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
        int[][] var28 = class3.field23[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field2319 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field2341 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class166 var34;
            if (var21.field2307 == -1 && var21.field2301 == null) {
                var34 = var21.method2375(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class176(arg4, 22, arg5, var18, arg2, arg3, var21.field2307, true, (class166) null);
            }
            var19.method550(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field2348 == 1) {
                var20.method1200(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class166 var57;
            if (var21.field2307 == -1 && var21.field2301 == null) {
                var57 = var21.method2375(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class176(arg4, 10, arg5, var18, arg2, arg3, var21.field2307, true, (class166) null);
            }
            if (var57 != null) {
                var19.method554(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field2348 != 0) {
                var20.method1214(arg2, arg3, var22, var23, var21.field2318);
            }
        } else if (arg6 >= 12) {
            class166 var35;
            if (var21.field2307 == -1 && var21.field2301 == null) {
                var35 = var21.method2375(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class176(arg4, arg6, arg5, var18, arg2, arg3, var21.field2307, true, (class166) null);
            }
            var19.method554(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field2348 != 0) {
                var20.method1214(arg2, arg3, var22, var23, var21.field2318);
            }
        } else if (arg6 == 0) {
            class166 var36;
            if (var21.field2307 == -1 && var21.field2301 == null) {
                var36 = var21.method2375(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class176(arg4, 0, arg5, var18, arg2, arg3, var21.field2307, true, (class166) null);
            }
            var19.method682(arg0, arg2, arg3, var29, var36, (class166) null, class3.field27[arg5], 0, var32, var33);
            if (var21.field2348 != 0) {
                var20.method1191(arg2, arg3, arg6, arg5, var21.field2318);
            }
        } else if (arg6 == 1) {
            class166 var37;
            if (var21.field2307 == -1 && var21.field2301 == null) {
                var37 = var21.method2375(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class176(arg4, 1, arg5, var18, arg2, arg3, var21.field2307, true, (class166) null);
            }
            var19.method682(arg0, arg2, arg3, var29, var37, (class166) null, class3.field26[arg5], 0, var32, var33);
            if (var21.field2348 != 0) {
                var20.method1191(arg2, arg3, arg6, arg5, var21.field2318);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class166 var39;
            class166 var40;
            if (var21.field2307 == -1 && var21.field2301 == null) {
                var39 = var21.method2375(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method2375(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class176(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field2307, true, (class166) null);
                var40 = new class176(arg4, 2, var38, var18, arg2, arg3, var21.field2307, true, (class166) null);
            }
            var19.method682(arg0, arg2, arg3, var29, var39, var40, class3.field27[arg5], class3.field27[var38], var32, var33);
            if (var21.field2348 != 0) {
                var20.method1191(arg2, arg3, arg6, arg5, var21.field2318);
            }
        } else if (arg6 == 3) {
            class166 var41;
            if (var21.field2307 == -1 && var21.field2301 == null) {
                var41 = var21.method2375(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class176(arg4, 3, arg5, var18, arg2, arg3, var21.field2307, true, (class166) null);
            }
            var19.method682(arg0, arg2, arg3, var29, var41, (class166) null, class3.field26[arg5], 0, var32, var33);
            if (var21.field2348 != 0) {
                var20.method1191(arg2, arg3, arg6, arg5, var21.field2318);
            }
        } else if (arg6 == 9) {
            class166 var42;
            if (var21.field2307 == -1 && var21.field2301 == null) {
                var42 = var21.method2375(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class176(arg4, arg6, arg5, var18, arg2, arg3, var21.field2307, true, (class166) null);
            }
            var19.method554(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field2348 != 0) {
                var20.method1214(arg2, arg3, var22, var23, var21.field2318);
            }
        } else if (arg6 == 4) {
            class166 var43;
            if (var21.field2307 == -1 && var21.field2301 == null) {
                var43 = var21.method2375(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class176(arg4, 4, arg5, var18, arg2, arg3, var21.field2307, true, (class166) null);
            }
            var19.method553(arg0, arg2, arg3, var29, var43, (class166) null, class3.field27[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method651(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class154.method886(var45 >> 14 & 0x7FFF).field2324;
            }
            class166 var46;
            if (var21.field2307 == -1 && var21.field2301 == null) {
                var46 = var21.method2375(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class176(arg4, 4, arg5, var18, arg2, arg3, var21.field2307, true, (class166) null);
            }
            var19.method553(arg0, arg2, arg3, var29, var46, (class166) null, class3.field27[arg5], 0, class3.field34[arg5] * var44, class3.field30[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method651(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class154.method886(var48 >> 14 & 0x7FFF).field2324 / 2;
            }
            class166 var49;
            if (var21.field2307 == -1 && var21.field2301 == null) {
                var49 = var21.method2375(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class176(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2307, true, (class166) null);
            }
            var19.method553(arg0, arg2, arg3, var29, var49, (class166) null, 256, arg5, class3.field31[arg5] * var47, class3.field25[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class166 var51;
            if (var21.field2307 == -1 && var21.field2301 == null) {
                var51 = var21.method2375(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class176(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field2307, true, (class166) null);
            }
            var19.method553(arg0, arg2, arg3, var29, var51, (class166) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method651(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class154.method886(var53 >> 14 & 0x7FFF).field2324 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class166 var55;
            class166 var56;
            if (var21.field2307 == -1 && var21.field2301 == null) {
                var55 = var21.method2375(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method2375(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class176(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2307, true, (class166) null);
                var56 = new class176(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field2307, true, (class166) null);
            }
            var19.method553(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class3.field31[arg5] * var52, class3.field25[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("u.er(III)V")
    public static final void method92(int arg0, int arg1) {
        class105 var2 = field2056[Statics.field2046][arg0][arg1];
        if (var2 == null) {
            Statics.field1481.method564(Statics.field2046, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class177 var4 = null;
        for (class177 var5 = (class177) var2.method1298(); var5 != null; var5 = (class177) var2.method1299()) {
            class162 var6 = class162.method768(var5.field2602);
            int var7 = var6.field2451;
            if (var6.field2456 == 1) {
                var7 = (var5.field2603 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field1481.method564(Statics.field2046, arg0, arg1);
            return;
        }
        var2.method1320(var4);
        class177 var8 = null;
        class177 var9 = null;
        for (class177 var10 = (class177) var2.method1298(); var10 != null; var10 = (class177) var2.method1299()) {
            if (var4.field2602 != var10.field2602) {
                if (var8 == null) {
                    var8 = var10;
                }
                if (var8.field2602 != var10.field2602 && var9 == null) {
                    var9 = var10;
                }
            }
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1481.method551(Statics.field2046, arg0, arg1, method358(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2046), var4, var11, var8, var9);
    }

    @ObfuscatedName("ak.ew(I)V")
    public static final void method538() {
        field2012 = 0;
        field2043 = 0;
        field1958.method2311();
        int var0 = field1958.method2316(1);
        if (var0 != 0) {
            int var1 = field1958.method2316(2);
            if (var1 == 0) {
                field2044[++field2043 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field1958.method2316(3);
                Statics.field1230.method2911(var2, false);
                int var3 = field1958.method2316(1);
                if (var3 == 1) {
                    field2044[++field2043 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field1958.method2316(3);
                Statics.field1230.method2911(var4, true);
                int var5 = field1958.method2316(3);
                Statics.field1230.method2911(var5, true);
                int var6 = field1958.method2316(1);
                if (var6 == 1) {
                    field2044[++field2043 - 1] = 2047;
                }
            } else if (var1 == 3) {
                int var7 = field1958.method2316(1);
                if (var7 == 1) {
                    field2044[++field2043 - 1] = 2047;
                }
                int var8 = field1958.method2316(7);
                int var9 = field1958.method2316(1);
                Statics.field2046 = field1958.method2316(2);
                int var10 = field1958.method2316(7);
                Statics.field1230.method2908(var8, var10, var9 == 1);
            }
        }
        int var11 = field1958.method2316(8);
        if (var11 < field2041) {
            for (int var12 = var11; var12 < field2041; var12++) {
                field2050[++field2012 - 1] = field2166[var12];
            }
        }
        if (var11 > field2041) {
            throw new RuntimeException("");
        }
        field2041 = 0;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = field2166[var13];
            class183 var15 = field2040[var14];
            int var16 = field1958.method2316(1);
            if (var16 == 0) {
                field2166[++field2041 - 1] = var14;
                var15.field2661 = field1919;
            } else {
                int var17 = field1958.method2316(2);
                if (var17 == 0) {
                    field2166[++field2041 - 1] = var14;
                    var15.field2661 = field1919;
                    field2044[++field2043 - 1] = var14;
                } else if (var17 == 1) {
                    field2166[++field2041 - 1] = var14;
                    var15.field2661 = field1919;
                    int var18 = field1958.method2316(3);
                    var15.method2911(var18, false);
                    int var19 = field1958.method2316(1);
                    if (var19 == 1) {
                        field2044[++field2043 - 1] = var14;
                    }
                } else if (var17 == 2) {
                    field2166[++field2041 - 1] = var14;
                    var15.field2661 = field1919;
                    int var20 = field1958.method2316(3);
                    var15.method2911(var20, true);
                    int var21 = field1958.method2316(3);
                    var15.method2911(var21, true);
                    int var22 = field1958.method2316(1);
                    if (var22 == 1) {
                        field2044[++field2043 - 1] = var14;
                    }
                } else if (var17 == 3) {
                    field2050[++field2012 - 1] = var14;
                }
            }
        }
        method48();
        method46();
        for (int var23 = 0; var23 < field2012; var23++) {
            int var24 = field2050[var23];
            if (field1919 != field2040[var24].field2661) {
                field2040[var24] = null;
            }
        }
        if (field2102 != field1958.field1722) {
            throw new RuntimeException(field1958.field1722 + class1.field6 + field2102);
        }
        for (int var25 = 0; var25 < field2041; var25++) {
            if (field2040[field2166[var25]] == null) {
                throw new RuntimeException(var25 + class1.field6 + field2041);
            }
        }
    }

    @ObfuscatedName("h.et(I)V")
    public static final void method48() {
        while (true) {
            if (field1958.method2313(field2102) >= 11) {
                int var0 = field1958.method2316(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field2040[var0] == null) {
                        field2040[var0] = new class183();
                        if (field2045[var0] != null) {
                            field2040[var0].method3073(field2045[var0]);
                        }
                        var1 = true;
                    }
                    field2166[++field2041 - 1] = var0;
                    class183 var2 = field2040[var0];
                    var2.field2661 = field1919;
                    int var3 = field1958.method2316(1);
                    int var4 = field1958.method2316(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field1958.method2316(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field1958.method2316(1);
                    if (var6 == 1) {
                        field2044[++field2043 - 1] = var0;
                    }
                    int var7 = field2055[field1958.method2316(3)];
                    if (var1) {
                        var2.field2670 = var2.field2616 = var7;
                    }
                    var2.method2908(Statics.field1230.field2649[0] + var4, Statics.field1230.field2652[0] + var5, var3 == 1);
                    continue;
                }
            }
            field1958.method2312();
            return;
        }
    }

    @ObfuscatedName("h.en(I)V")
    public static final void method46() {
        for (int var0 = 0; var0 < field2043; var0++) {
            int var1 = field2044[var0];
            class183 var2 = field2040[var1];
            int var3 = field1958.method1602();
            if ((var3 & 0x10) != 0) {
                var3 += field1958.method1602() << 8;
            }
            method1113(var1, var2, var3);
        }
    }

    @ObfuscatedName("cw.ed(ILgi;IB)V")
    public static final void method1113(int arg0, class183 arg1, int arg2) {
        if ((arg2 & 0x200) != 0) {
            int var3 = field1958.method1587();
            int var4 = field1958.method1602();
            arg1.method2907(var3, var4, field1919);
            arg1.field2635 = field1919 + 300;
            arg1.field2636 = field1958.method1623();
            arg1.field2637 = field1958.method1625();
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field2642 = field1958.method1602();
            arg1.field2656 = field1958.method1625();
            arg1.field2655 = field1958.method1602();
            arg1.field2657 = field1958.method1602();
            arg1.field2658 = field1958.method1634() + field1919;
            arg1.field2629 = field1958.method1712() + field1919;
            arg1.field2660 = field1958.method1625();
            arg1.field2666 = 1;
            arg1.field2671 = 0;
        }
        if ((arg2 & 0x1) != 0) {
            arg1.field2627 = field1958.method1610();
            if (arg1.field2627.charAt(0) == '~') {
                arg1.field2627 = arg1.field2627.substring(1);
                method1101(2, arg1.field2792, arg1.field2627);
            } else if (Statics.field1230 == arg1) {
                method1101(2, arg1.field2792, arg1.field2627);
            }
            arg1.field2667 = 0;
            arg1.field2653 = 0;
            arg1.field2628 = 150;
        }
        if ((arg2 & 0x2) != 0) {
            int var5 = field1958.method1632();
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = field1958.method1602();
            method54(arg1, var5, var6);
        }
        if ((arg2 & 0x8) != 0) {
            arg1.field2638 = field1958.method1632();
            if (arg1.field2638 == 65535) {
                arg1.field2638 = -1;
            }
        }
        if ((arg2 & 0x4) != 0) {
            int var7 = field1958.method1632();
            int var8 = field1958.method1587();
            int var9 = field1958.method1587();
            int var10 = field1958.field1722;
            if (arg1.field2792 != null && arg1.field2794 != null) {
                boolean var11 = false;
                if (var8 <= 1 && method1769(arg1.field2792)) {
                    var11 = true;
                }
                if (!var11 && field2037 == 0) {
                    field1935.field1722 = 0;
                    field1958.method1644(field1935.field1725, 0, var9);
                    field1935.field1722 = 0;
                    String var12 = class174.method2826(class83.method44(class110.method1451(field1935)));
                    arg1.field2627 = var12.trim();
                    arg1.field2667 = var7 >> 8;
                    arg1.field2653 = var7 & 0xFF;
                    arg1.field2628 = 150;
                    if (var8 == 2 || var8 == 3) {
                        method1101(1, class1.method1118(1) + arg1.field2792, var12);
                    } else if (var8 == 1) {
                        method1101(1, class1.method1118(0) + arg1.field2792, var12);
                    } else {
                        method1101(2, arg1.field2792, var12);
                    }
                }
            }
            field1958.field1722 = var9 + var10;
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field2623 = field1958.method1634();
            int var13 = field1958.method1641();
            arg1.field2614 = var13 >> 16;
            arg1.field2645 = (var13 & 0xFFFF) + field1919;
            arg1.field2650 = 0;
            arg1.field2651 = 0;
            if (arg1.field2645 > field1919) {
                arg1.field2650 = -1;
            }
            if (arg1.field2623 == 65535) {
                arg1.field2623 = -1;
            }
        }
        if ((arg2 & 0x80) != 0) {
            int var14 = field1958.method1602();
            int var15 = field1958.method1602();
            arg1.method2907(var14, var15, field1919);
            arg1.field2635 = field1919 + 300;
            arg1.field2636 = field1958.method1625();
            arg1.field2637 = field1958.method1625();
        }
        if ((arg2 & 0x20) != 0) {
            int var16 = field1958.method1625();
            byte[] var17 = new byte[var16];
            class136 var18 = new class136(var17);
            field1958.method1626(var17, 0, var16);
            field2045[arg0] = var18;
            arg1.method3073(var18);
        }
        if ((arg2 & 0x40) != 0) {
            arg1.field2663 = field1958.method1712();
            arg1.field2632 = field1958.method1671();
        }
    }

    @ObfuscatedName("an.ep(IIIIB)V")
    public static final void method432(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field2127; var4++) {
            if (field2134[var4] + field1979[var4] > arg0 && field1979[var4] < arg0 + arg2 && field2151[var4] + field2049[var4] > arg1 && field2049[var4] < arg1 + arg3) {
                field2129[var4] = true;
            }
        }
    }

    @ObfuscatedName("dc.ey(II)Z")
    public static final boolean method1474(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field2069[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("di.ea(IB)V")
    public static final void method1341(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field2067[arg0];
        int var2 = field2068[arg0];
        int var3 = field2069[arg0];
        int var4 = field2085[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 58) {
            field2162.method2308(118);
            field2162.method1598(var2);
            field2162.method1680(var1);
            field2162.method1630(field1931);
            field2162.method1640(Statics.field844);
        }
        if (var3 == 16) {
            boolean var5 = Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var5) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field2053 = class37.field505;
            field2026 = class37.field506;
            field2028 = 2;
            field2163 = 0;
            field2162.method2308(12);
            field2162.method1680(Statics.field207);
            field2162.method1680(var4);
            field2162.method1640(Statics.field1127);
            field2162.method1635(Statics.field125 + var1);
            field2162.method1635(Statics.field172);
            field2162.method1635(Statics.field542 + var2);
        }
        if (var3 == 57 || var3 == 1007) {
            String var7 = field2072[arg0];
            class141 var8 = class141.method1768(var2, var1);
            if (var8 != null) {
                if (var8.field1887 != null) {
                    class123 var9 = new class123();
                    var9.field1592 = var8;
                    var9.field1589 = var4;
                    var9.field1597 = var7;
                    var9.field1590 = var8.field1887;
                    class12.method1103(var9);
                }
                boolean var10 = true;
                if (var8.field1779 > 0) {
                    int var11 = var8.field1779;
                    boolean var12;
                    if (var11 == 205) {
                        field1965 = 250;
                        var12 = true;
                    } else {
                        if (var11 >= 300 && var11 <= 313) {
                            int var13 = (var11 - 300) / 2;
                            int var14 = var11 & 0x1;
                            field2034.method1145(var13, var14 == 1);
                        }
                        if (var11 >= 314 && var11 <= 323) {
                            int var15 = (var11 - 314) / 2;
                            int var16 = var11 & 0x1;
                            field2034.method1148(var15, var16 == 1);
                        }
                        if (var11 == 324) {
                            field2034.method1152(false);
                        }
                        if (var11 == 325) {
                            field2034.method1152(true);
                        }
                        if (var11 == 326) {
                            field2162.method2308(1);
                            field2034.method1150(field2162);
                            var12 = true;
                        } else {
                            var12 = false;
                        }
                    }
                    var10 = var12;
                }
                if (var10 && class93.method1784(method101(var8), var4 - 1)) {
                    if (var4 == 1) {
                        field2162.method2308(204);
                        field2162.method1592(var2);
                        field2162.method1680(var1);
                    }
                    if (var4 == 2) {
                        field2162.method2308(221);
                        field2162.method1592(var2);
                        field2162.method1680(var1);
                    }
                    if (var4 == 3) {
                        field2162.method2308(160);
                        field2162.method1592(var2);
                        field2162.method1680(var1);
                    }
                    if (var4 == 4) {
                        field2162.method2308(174);
                        field2162.method1592(var2);
                        field2162.method1680(var1);
                    }
                    if (var4 == 5) {
                        field2162.method2308(70);
                        field2162.method1592(var2);
                        field2162.method1680(var1);
                    }
                    if (var4 == 6) {
                        field2162.method2308(165);
                        field2162.method1592(var2);
                        field2162.method1680(var1);
                    }
                    if (var4 == 7) {
                        field2162.method2308(243);
                        field2162.method1592(var2);
                        field2162.method1680(var1);
                    }
                    if (var4 == 8) {
                        field2162.method2308(99);
                        field2162.method1592(var2);
                        field2162.method1680(var1);
                    }
                    if (var4 == 9) {
                        field2162.method2308(159);
                        field2162.method1592(var2);
                        field2162.method1680(var1);
                    }
                    if (var4 == 10) {
                        field2162.method2308(220);
                        field2162.method1592(var2);
                        field2162.method1680(var1);
                    }
                }
            }
        }
        if (var3 == 9) {
            class184 var17 = field2062[var4];
            if (var17 != null) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var17.field2649[0], var17.field2652[0], false, 0, 0, 1, 1, 0, 2);
                field2053 = class37.field505;
                field2026 = class37.field506;
                field2028 = 2;
                field2163 = 0;
                field2162.method2308(75);
                field2162.method1635(var4);
            }
        }
        if (var3 == 11) {
            class184 var18 = field2062[var4];
            if (var18 != null) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var18.field2649[0], var18.field2652[0], false, 0, 0, 1, 1, 0, 2);
                field2053 = class37.field505;
                field2026 = class37.field506;
                field2028 = 2;
                field2163 = 0;
                field2162.method2308(239);
                field2162.method1631(var4);
            }
        }
        if (var3 == 23) {
            Statics.field1481.method628(Statics.field2046, var1, var2);
        }
        if (var3 == 1004) {
            field2053 = class37.field505;
            field2026 = class37.field506;
            field2028 = 2;
            field2163 = 0;
            field2162.method2308(46);
            field2162.method1630(var4);
        }
        if (var3 == 1005) {
            class141 var19 = class141.method451(var2);
            if (var19 == null || var19.field1878[var1] < 100000) {
                field2162.method2308(46);
                field2162.method1630(var4);
            } else {
                method1101(0, "", var19.field1878[var1] + " x " + class162.method768(var4).field2437);
            }
            field1934 = 0;
            Statics.field127 = class141.method451(var2);
            field1987 = var1;
        }
        if (var3 == 36) {
            field2162.method2308(247);
            field2162.method1631(var4);
            field2162.method1598(var2);
            field2162.method1630(var1);
            field1934 = 0;
            Statics.field127 = class141.method451(var2);
            field1987 = var1;
        }
        if (var3 == 30 && field2087 == null) {
            Statics.method747(var2, var1);
            field2087 = class141.method1768(var2, var1);
            method542(field2087);
        }
        if (var3 == 21) {
            boolean var20 = Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var20) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field2053 = class37.field505;
            field2026 = class37.field506;
            field2028 = 2;
            field2163 = 0;
            field2162.method2308(78);
            field2162.method1635(Statics.field125 + var1);
            field2162.method1630(Statics.field542 + var2);
            field2162.method1635(var4);
        }
        if (var3 == 10) {
            class184 var22 = field2062[var4];
            if (var22 != null) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var22.field2649[0], var22.field2652[0], false, 0, 0, 1, 1, 0, 2);
                field2053 = class37.field505;
                field2026 = class37.field506;
                field2028 = 2;
                field2163 = 0;
                field2162.method2308(233);
                field2162.method1631(var4);
            }
        }
        if (var3 == 1002) {
            field2053 = class37.field505;
            field2026 = class37.field506;
            field2028 = 2;
            field2163 = 0;
            field2162.method2308(179);
            field2162.method1631(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 25) {
            class141 var23 = class141.method1768(var2, var1);
            if (var23 != null) {
                method746();
                Statics.method899(var2, var1, class93.method55(method101(var23)));
                field2077 = 0;
                field2081 = Statics.method1221(var23);
                if (field2081 == null) {
                    field2081 = "Null";
                }
                if (var23.field1774) {
                    field2082 = var23.field1835 + class1.method348(16777215);
                } else {
                    field2082 = class1.method348(65280) + var23.field1824 + class1.method348(16777215);
                }
            }
            return;
        }
        if (var3 == 20) {
            boolean var24 = Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var24) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field2053 = class37.field505;
            field2026 = class37.field506;
            field2028 = 2;
            field2163 = 0;
            field2162.method2308(209);
            field2162.method1635(Statics.field542 + var2);
            field2162.method1635(Statics.field125 + var1);
            field2162.method1631(var4);
        }
        if (var3 == 5) {
            method480(var1, var2, var4);
            field2162.method2308(92);
            field2162.method1630(Statics.field542 + var2);
            field2162.method1635(var4 >> 14 & 0x7FFF);
            field2162.method1635(Statics.field125 + var1);
        }
        if (var3 == 48) {
            class183 var26 = field2040[var4];
            if (var26 != null) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var26.field2649[0], var26.field2652[0], false, 0, 0, 1, 1, 0, 2);
                field2053 = class37.field505;
                field2026 = class37.field506;
                field2028 = 2;
                field2163 = 0;
                field2162.method2308(140);
                field2162.method1635(var4);
            }
        }
        if (var3 == 47) {
            class183 var27 = field2040[var4];
            if (var27 != null) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var27.field2649[0], var27.field2652[0], false, 0, 0, 1, 1, 0, 2);
                field2053 = class37.field505;
                field2026 = class37.field506;
                field2028 = 2;
                field2163 = 0;
                field2162.method2308(11);
                field2162.method1631(var4);
            }
        }
        if (var3 == 4) {
            method480(var1, var2, var4);
            field2162.method2308(23);
            field2162.method1680(Statics.field542 + var2);
            field2162.method1630(var4 >> 14 & 0x7FFF);
            field2162.method1635(Statics.field125 + var1);
        }
        if (var3 == 1 && method480(var1, var2, var4)) {
            field2162.method2308(61);
            field2162.method1630(Statics.field207);
            field2162.method1680(Statics.field542 + var2);
            field2162.method1680(var4 >> 14 & 0x7FFF);
            field2162.method1680(Statics.field172);
            field2162.method1592(Statics.field1127);
            field2162.method1631(Statics.field125 + var1);
        }
        if (var3 == 42) {
            field2162.method2308(10);
            field2162.method1680(var1);
            field2162.method1592(var2);
            field2162.method1680(var4);
            field1934 = 0;
            Statics.field127 = class141.method451(var2);
            field1987 = var1;
        }
        if (var3 == 17) {
            boolean var28 = Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var28) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field2053 = class37.field505;
            field2026 = class37.field506;
            field2028 = 2;
            field2163 = 0;
            field2162.method2308(166);
            field2162.method1631(var4);
            field2162.method1631(Statics.field542 + var2);
            field2162.method1639(Statics.field844);
            field2162.method1680(Statics.field125 + var1);
            field2162.method1680(field1931);
        }
        if (var3 == 8) {
            class184 var30 = field2062[var4];
            if (var30 != null) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var30.field2649[0], var30.field2652[0], false, 0, 0, 1, 1, 0, 2);
                field2053 = class37.field505;
                field2026 = class37.field506;
                field2028 = 2;
                field2163 = 0;
                field2162.method2308(106);
                field2162.method1639(Statics.field844);
                field2162.method1631(field1931);
                field2162.method1631(var4);
            }
        }
        if (var3 == 6) {
            method480(var1, var2, var4);
            field2162.method2308(170);
            field2162.method1630(Statics.field542 + var2);
            field2162.method1635(var4 >> 14 & 0x7FFF);
            field2162.method1630(Statics.field125 + var1);
        }
        if (var3 == 43) {
            field2162.method2308(133);
            field2162.method1592(var2);
            field2162.method1630(var1);
            field2162.method1630(var4);
            field1934 = 0;
            Statics.field127 = class141.method451(var2);
            field1987 = var1;
        }
        if (var3 == 32) {
            field2162.method2308(125);
            field2162.method1592(Statics.field844);
            field2162.method1598(var2);
            field2162.method1631(field1931);
            field2162.method1630(var4);
            field2162.method1630(var1);
            field1934 = 0;
            Statics.field127 = class141.method451(var2);
            field1987 = var1;
        }
        if (var3 == 38) {
            method746();
            class141 var31 = class141.method451(var2);
            field2077 = 1;
            Statics.field172 = var1;
            Statics.field1127 = var2;
            Statics.field207 = var4;
            method542(var31);
            field2143 = class1.method348(16748608) + class162.method768(var4).field2437 + class1.method348(16777215);
            if (field2143 == null) {
                field2143 = "null";
            }
            return;
        }
        if (var3 == 34) {
            field2162.method2308(110);
            field2162.method1639(var2);
            field2162.method1635(var1);
            field2162.method1630(var4);
            field1934 = 0;
            Statics.field127 = class141.method451(var2);
            field1987 = var1;
        }
        if (var3 == 1003) {
            field2053 = class37.field505;
            field2026 = class37.field506;
            field2028 = 2;
            field2163 = 0;
            class184 var32 = field2062[var4];
            if (var32 != null) {
                class153 var33 = var32.field2805;
                if (var33.field2296 != null) {
                    var33 = var33.method2355();
                }
                if (var33 != null) {
                    field2162.method2308(227);
                    field2162.method1680(var33.field2270);
                }
            }
        }
        if (var3 == 31) {
            field2162.method2308(147);
            field2162.method1631(Statics.field172);
            field2162.method1630(var1);
            field2162.method1635(var4);
            field2162.method1592(var2);
            field2162.method1630(Statics.field207);
            field2162.method1639(Statics.field1127);
            field1934 = 0;
            Statics.field127 = class141.method451(var2);
            field1987 = var1;
        }
        if (var3 == 33) {
            field2162.method2308(32);
            field2162.method1635(var4);
            field2162.method1680(var1);
            field2162.method1640(var2);
            field1934 = 0;
            Statics.field127 = class141.method451(var2);
            field1987 = var1;
        }
        if (var3 == 40) {
            field2162.method2308(2);
            field2162.method1631(var4);
            field2162.method1640(var2);
            field2162.method1630(var1);
            field1934 = 0;
            Statics.field127 = class141.method451(var2);
            field1987 = var1;
        }
        if (var3 == 44) {
            class183 var34 = field2040[var4];
            if (var34 != null) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var34.field2649[0], var34.field2652[0], false, 0, 0, 1, 1, 0, 2);
                field2053 = class37.field505;
                field2026 = class37.field506;
                field2028 = 2;
                field2163 = 0;
                field2162.method2308(85);
                field2162.method1680(var4);
            }
        }
        if (var3 == 14) {
            class183 var35 = field2040[var4];
            if (var35 != null) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var35.field2649[0], var35.field2652[0], false, 0, 0, 1, 1, 0, 2);
                field2053 = class37.field505;
                field2026 = class37.field506;
                field2028 = 2;
                field2163 = 0;
                field2162.method2308(96);
                field2162.method1680(var4);
                field2162.method1631(Statics.field207);
                field2162.method1680(Statics.field172);
                field2162.method1592(Statics.field1127);
            }
        }
        if (var3 == 18) {
            boolean var36 = Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var36) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field2053 = class37.field505;
            field2026 = class37.field506;
            field2028 = 2;
            field2163 = 0;
            field2162.method2308(205);
            field2162.method1631(var4);
            field2162.method1631(Statics.field125 + var1);
            field2162.method1680(Statics.field542 + var2);
        }
        if (var3 == 41) {
            field2162.method2308(80);
            field2162.method1635(var4);
            field2162.method1640(var2);
            field2162.method1631(var1);
            field1934 = 0;
            Statics.field127 = class141.method451(var2);
            field1987 = var1;
        }
        if (var3 == 37) {
            field2162.method2308(250);
            field2162.method1631(var4);
            field2162.method1639(var2);
            field2162.method1635(var1);
            field1934 = 0;
            Statics.field127 = class141.method451(var2);
            field1987 = var1;
        }
        if (var3 == 26) {
            method1335();
        }
        if (var3 == 29) {
            field2162.method2308(142);
            field2162.method1592(var2);
            class141 var38 = class141.method451(var2);
            if (var38.field1871 != null && var38.field1871[0][0] == 5) {
                int var39 = var38.field1871[0][1];
                if (class90.field1219[var39] != var38.field1873[0]) {
                    class90.field1219[var39] = var38.field1873[0];
                    method1223(var39);
                }
            }
        }
        if (var3 == 35) {
            field2162.method2308(21);
            field2162.method1635(var4);
            field2162.method1639(var2);
            field2162.method1635(var1);
            field1934 = 0;
            Statics.field127 = class141.method451(var2);
            field1987 = var1;
        }
        if (var3 == 22) {
            boolean var40 = Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var40) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field2053 = class37.field505;
            field2026 = class37.field506;
            field2028 = 2;
            field2163 = 0;
            field2162.method2308(38);
            field2162.method1680(var4);
            field2162.method1630(Statics.field542 + var2);
            field2162.method1680(Statics.field125 + var1);
        }
        if (var3 == 2 && method480(var1, var2, var4)) {
            field2162.method2308(105);
            field2162.method1630(field1931);
            field2162.method1640(Statics.field844);
            field2162.method1635(Statics.field125 + var1);
            field2162.method1631(var4 >> 14 & 0x7FFF);
            field2162.method1630(Statics.field542 + var2);
        }
        if (var3 == 46) {
            class183 var42 = field2040[var4];
            if (var42 != null) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var42.field2649[0], var42.field2652[0], false, 0, 0, 1, 1, 0, 2);
                field2053 = class37.field505;
                field2026 = class37.field506;
                field2028 = 2;
                field2163 = 0;
                field2162.method2308(124);
                field2162.method1635(var4);
            }
        }
        if (var3 == 39) {
            field2162.method2308(149);
            field2162.method1592(var2);
            field2162.method1631(var4);
            field2162.method1630(var1);
            field1934 = 0;
            Statics.field127 = class141.method451(var2);
            field1987 = var1;
        }
        if (var3 == 12) {
            class184 var43 = field2062[var4];
            if (var43 != null) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var43.field2649[0], var43.field2652[0], false, 0, 0, 1, 1, 0, 2);
                field2053 = class37.field505;
                field2026 = class37.field506;
                field2028 = 2;
                field2163 = 0;
                field2162.method2308(232);
                field2162.method1635(var4);
            }
        }
        if (var3 == 45) {
            class183 var44 = field2040[var4];
            if (var44 != null) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var44.field2649[0], var44.field2652[0], false, 0, 0, 1, 1, 0, 2);
                field2053 = class37.field505;
                field2026 = class37.field506;
                field2028 = 2;
                field2163 = 0;
                field2162.method2308(20);
                field2162.method1631(var4);
            }
        }
        if (var3 == 19) {
            boolean var45 = Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var45) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field2053 = class37.field505;
            field2026 = class37.field506;
            field2028 = 2;
            field2163 = 0;
            field2162.method2308(126);
            field2162.method1635(Statics.field125 + var1);
            field2162.method1631(var4);
            field2162.method1630(Statics.field542 + var2);
        }
        if (var3 == 51) {
            class183 var47 = field2040[var4];
            if (var47 != null) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var47.field2649[0], var47.field2652[0], false, 0, 0, 1, 1, 0, 2);
                field2053 = class37.field505;
                field2026 = class37.field506;
                field2028 = 2;
                field2163 = 0;
                field2162.method2308(238);
                field2162.method1680(var4);
            }
        }
        if (var3 == 24) {
            class141 var48 = class141.method451(var2);
            boolean var49 = true;
            if (var48.field1779 > 0) {
                int var50 = var48.field1779;
                boolean var51;
                if (var50 == 205) {
                    field1965 = 250;
                    var51 = true;
                } else {
                    if (var50 >= 300 && var50 <= 313) {
                        int var52 = (var50 - 300) / 2;
                        int var53 = var50 & 0x1;
                        field2034.method1145(var52, var53 == 1);
                    }
                    if (var50 >= 314 && var50 <= 323) {
                        int var54 = (var50 - 314) / 2;
                        int var55 = var50 & 0x1;
                        field2034.method1148(var54, var55 == 1);
                    }
                    if (var50 == 324) {
                        field2034.method1152(false);
                    }
                    if (var50 == 325) {
                        field2034.method1152(true);
                    }
                    if (var50 == 326) {
                        field2162.method2308(1);
                        field2034.method1150(field2162);
                        var51 = true;
                    } else {
                        var51 = false;
                    }
                }
                var49 = var51;
            }
            if (var49) {
                field2162.method2308(142);
                field2162.method1592(var2);
            }
        }
        if (var3 == 15) {
            class183 var56 = field2040[var4];
            if (var56 != null) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var56.field2649[0], var56.field2652[0], false, 0, 0, 1, 1, 0, 2);
                field2053 = class37.field505;
                field2026 = class37.field506;
                field2028 = 2;
                field2163 = 0;
                field2162.method2308(190);
                field2162.method1680(field1931);
                field2162.method1639(Statics.field844);
                field2162.method1635(var4);
            }
        }
        if (var3 == 49) {
            class183 var57 = field2040[var4];
            if (var57 != null) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var57.field2649[0], var57.field2652[0], false, 0, 0, 1, 1, 0, 2);
                field2053 = class37.field505;
                field2026 = class37.field506;
                field2028 = 2;
                field2163 = 0;
                field2162.method2308(13);
                field2162.method1635(var4);
            }
        }
        if (var3 == 1001) {
            method480(var1, var2, var4);
            field2162.method2308(200);
            field2162.method1631(Statics.field542 + var2);
            field2162.method1635(var4 >> 14 & 0x7FFF);
            field2162.method1635(Statics.field125 + var1);
        }
        if (var3 == 28) {
            field2162.method2308(142);
            field2162.method1592(var2);
            class141 var58 = class141.method451(var2);
            if (var58.field1871 != null && var58.field1871[0][0] == 5) {
                int var59 = var58.field1871[0][1];
                class90.field1219[var59] = 1 - class90.field1219[var59];
                method1223(var59);
            }
        }
        if (var3 == 3) {
            method480(var1, var2, var4);
            field2162.method2308(4);
            field2162.method1680(var4 >> 14 & 0x7FFF);
            field2162.method1680(Statics.field125 + var1);
            field2162.method1680(Statics.field542 + var2);
        }
        if (var3 == 50) {
            class183 var60 = field2040[var4];
            if (var60 != null) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var60.field2649[0], var60.field2652[0], false, 0, 0, 1, 1, 0, 2);
                field2053 = class37.field505;
                field2026 = class37.field506;
                field2028 = 2;
                field2163 = 0;
                field2162.method2308(156);
                field2162.method1680(var4);
            }
        }
        if (var3 == 13) {
            class184 var61 = field2062[var4];
            if (var61 != null) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var61.field2649[0], var61.field2652[0], false, 0, 0, 1, 1, 0, 2);
                field2053 = class37.field505;
                field2026 = class37.field506;
                field2028 = 2;
                field2163 = 0;
                field2162.method2308(3);
                field2162.method1630(var4);
            }
        }
        if (var3 == 7) {
            class184 var62 = field2062[var4];
            if (var62 != null) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var62.field2649[0], var62.field2652[0], false, 0, 0, 1, 1, 0, 2);
                field2053 = class37.field505;
                field2026 = class37.field506;
                field2028 = 2;
                field2163 = 0;
                field2162.method2308(206);
                field2162.method1631(Statics.field207);
                field2162.method1630(Statics.field172);
                field2162.method1631(var4);
                field2162.method1598(Statics.field1127);
            }
        }
        if (field2077 != 0) {
            field2077 = 0;
            method542(class141.method451(Statics.field1127));
        }
        if (field2079) {
            method746();
        }
        if (Statics.field127 != null && field1934 == 0) {
            method542(Statics.field127);
        }
    }

    @ObfuscatedName("j.ee(ILjava/lang/String;I)V")
    public static void method149(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field2041; var3++) {
            class183 var4 = field2040[field2166[var3]];
            if (var4 != null && var4.field2792 != null && var4.field2792.equalsIgnoreCase(arg1)) {
                Statics.method1176(Statics.field1230.field2649[0], Statics.field1230.field2652[0], var4.field2649[0], var4.field2652[0], false, 0, 0, 1, 1, 0, 2);
                if (arg0 == 1) {
                    field2162.method2308(85);
                    field2162.method1680(field2166[var3]);
                } else if (arg0 == 4) {
                    field2162.method2308(11);
                    field2162.method1631(field2166[var3]);
                } else if (arg0 == 6) {
                    field2162.method2308(13);
                    field2162.method1635(field2166[var3]);
                } else if (arg0 == 7) {
                    field2162.method2308(156);
                    field2162.method1680(field2166[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            method1101(0, "", class75.field1018 + arg1);
        }
    }

    @ObfuscatedName("bu.ej(I)V")
    public static void method746() {
        if (!field2079) {
            return;
        }
        class141 var0 = class141.method1768(Statics.field844, field1931);
        if (var0 != null && var0.field1854 != null) {
            class123 var1 = new class123();
            var1.field1592 = var0;
            var1.field1590 = var0.field1854;
            class12.method1103(var1);
        }
        field2079 = false;
        method542(var0);
    }

    @ObfuscatedName("ch.eq(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method919(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field2064 || field2066 >= 500) {
            return;
        }
        field2153[field2066] = arg0;
        field2072[field2066] = arg1;
        field2069[field2066] = arg2;
        field2085[field2066] = arg3;
        field2067[field2066] = arg4;
        field2068[field2066] = arg5;
        field2066++;
    }

    @ObfuscatedName("ej.em(IIIIB)V")
    public static final void method1833(int arg0, int arg1, int arg2, int arg3) {
        if (field2077 == 0 && !field2079) {
            method919(class75.field1024, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class181.field2732; var5++) {
            int var6 = class181.field2744[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field1481.method573(Statics.field2046, var7, var8, var6) >= 0) {
                    class154 var11 = class154.method886(var10);
                    if (var11.field2301 != null) {
                        var11 = var11.method2365();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field2077 == 1) {
                        method919(class75.field1019, field2143 + " " + class1.field8 + " " + class1.method348(65535) + var11.field2310, 1, var6, var7, var8);
                    } else if (!field2079) {
                        String[] var12 = var11.field2327;
                        if (field1964) {
                            var12 = method1829(var12);
                        }
                        if (var12 != null) {
                            for (int var13 = 4; var13 >= 0; var13--) {
                                if (var12[var13] != null) {
                                    short var14 = 0;
                                    if (var13 == 0) {
                                        var14 = 3;
                                    }
                                    if (var13 == 1) {
                                        var14 = 4;
                                    }
                                    if (var13 == 2) {
                                        var14 = 5;
                                    }
                                    if (var13 == 3) {
                                        var14 = 6;
                                    }
                                    if (var13 == 4) {
                                        var14 = 1001;
                                    }
                                    method919(var12[var13], class1.method348(65535) + var11.field2310, var14, var6, var7, var8);
                                }
                            }
                        }
                        method919(class75.field887, class1.method348(65535) + var11.field2310, 1002, var11.field2323 << 14, var7, var8);
                    } else if ((Statics.field551 & 0x4) == 4) {
                        method919(field2081, field2082 + " " + class1.field8 + " " + class1.method348(65535) + var11.field2310, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class184 var15 = field2062[var10];
                    if (var15.field2805.field2272 == 1 && (var15.field2630 & 0x7F) == 64 && (var15.field2615 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field1999; var16++) {
                            class184 var17 = field2062[field1984[var16]];
                            if (var17 != null && var15 != var17 && var17.field2805.field2272 == 1 && var15.field2630 == var17.field2630 && var15.field2615 == var17.field2615) {
                                method900(var17.field2805, field1984[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field2041; var18++) {
                            class183 var19 = field2040[field2166[var18]];
                            if (var19 != null && var15.field2630 == var19.field2630 && var15.field2615 == var19.field2615) {
                                method1478(var19, field2166[var18], var7, var8);
                            }
                        }
                    }
                    method900(var15.field2805, var10, var7, var8);
                }
                if (var9 == 0) {
                    class183 var20 = field2040[var10];
                    if ((var20.field2630 & 0x7F) == 64 && (var20.field2615 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field1999; var21++) {
                            class184 var22 = field2062[field1984[var21]];
                            if (var22 != null && var22.field2805.field2272 == 1 && var20.field2630 == var22.field2630 && var20.field2615 == var22.field2615) {
                                method900(var22.field2805, field1984[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field2041; var23++) {
                            class183 var24 = field2040[field2166[var23]];
                            if (var24 != null && var20 != var24 && var20.field2630 == var24.field2630 && var20.field2615 == var24.field2615) {
                                method1478(var24, field2166[var23], var7, var8);
                            }
                        }
                    }
                    method1478(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class105 var25 = field2056[Statics.field2046][var7][var8];
                    if (var25 != null) {
                        for (class177 var26 = (class177) var25.method1296(); var26 != null; var26 = (class177) var25.method1300()) {
                            class162 var27 = class162.method768(var26.field2602);
                            if (field2077 == 1) {
                                method919(class75.field1019, field2143 + " " + class1.field8 + " " + class1.method348(16748608) + var27.field2437, 16, var26.field2602, var7, var8);
                            } else if (!field2079) {
                                String[] var28 = var27.field2463;
                                if (field1964) {
                                    var28 = method1829(var28);
                                }
                                for (int var29 = 4; var29 >= 0; var29--) {
                                    if (var28 != null && var28[var29] != null) {
                                        byte var30 = 0;
                                        if (var29 == 0) {
                                            var30 = 18;
                                        }
                                        if (var29 == 1) {
                                            var30 = 19;
                                        }
                                        if (var29 == 2) {
                                            var30 = 20;
                                        }
                                        if (var29 == 3) {
                                            var30 = 21;
                                        }
                                        if (var29 == 4) {
                                            var30 = 22;
                                        }
                                        method919(var28[var29], class1.method348(16748608) + var27.field2437, var30, var26.field2602, var7, var8);
                                    } else if (var29 == 2) {
                                        method919(class75.field881, class1.method348(16748608) + var27.field2437, 20, var26.field2602, var7, var8);
                                    }
                                }
                                method919(class75.field887, class1.method348(16748608) + var27.field2437, 1004, var26.field2602, var7, var8);
                            } else if ((Statics.field551 & 0x1) == 1) {
                                method919(field2081, field2082 + " " + class1.field8 + " " + class1.method348(16748608) + var27.field2437, 17, var26.field2602, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ba.ef(Lek;IIII)V")
    public static final void method900(class153 arg0, int arg1, int arg2, int arg3) {
        if (field2066 >= 400) {
            return;
        }
        if (arg0.field2296 != null) {
            arg0 = arg0.method2355();
        }
        if (arg0 == null || !arg0.field2299) {
            return;
        }
        String var4 = arg0.field2300;
        if (arg0.field2288 != 0) {
            var4 = var4 + method1786(arg0.field2288, Statics.field1230.field2790) + " " + class1.field4 + class75.field1025 + arg0.field2288 + class1.field5;
        }
        if (field2077 == 1) {
            method919(class75.field1019, field2143 + " " + class1.field8 + " " + class1.method348(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field2079) {
            String[] var5 = arg0.field2278;
            if (field1964) {
                var5 = method1829(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class75.field1021)) {
                        byte var7 = 0;
                        if (var6 == 0) {
                            var7 = 9;
                        }
                        if (var6 == 1) {
                            var7 = 10;
                        }
                        if (var6 == 2) {
                            var7 = 11;
                        }
                        if (var6 == 3) {
                            var7 = 12;
                        }
                        if (var6 == 4) {
                            var7 = 13;
                        }
                        method919(var5[var6], class1.method348(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class75.field1021)) {
                        short var9 = 0;
                        if (arg0.field2288 > Statics.field1230.field2790) {
                            var9 = 2000;
                        }
                        int var10 = 0;
                        if (var8 == 0) {
                            var10 = var9 + 9;
                        }
                        if (var8 == 1) {
                            var10 = var9 + 10;
                        }
                        if (var8 == 2) {
                            var10 = var9 + 11;
                        }
                        if (var8 == 3) {
                            var10 = var9 + 12;
                        }
                        if (var8 == 4) {
                            var10 = var9 + 13;
                        }
                        method919(var5[var8], class1.method348(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method919(class75.field887, class1.method348(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field551 & 0x2) == 2) {
            method919(field2081, field2082 + " " + class1.field8 + " " + class1.method348(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dj.ec(Lgi;IIII)V")
    public static final void method1478(class183 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1230 == arg0 || field2066 >= 400) {
            return;
        }
        String var4;
        if (arg0.field2791 == 0) {
            var4 = arg0.field2792 + method1786(arg0.field2790, Statics.field1230.field2790) + " " + class1.field4 + class75.field1025 + arg0.field2790 + class1.field5;
        } else {
            var4 = arg0.field2792 + " " + class1.field4 + class75.field1026 + arg0.field2791 + class1.field5;
        }
        if (field2077 == 1) {
            method919(class75.field1019, field2143 + " " + class1.field8 + " " + class1.method348(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field2079) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field2047[var5] != null) {
                    short var6 = 0;
                    if (field2047[var5].equalsIgnoreCase(class75.field1021)) {
                        if (arg0.field2790 > Statics.field1230.field2790) {
                            var6 = 2000;
                        }
                        if (Statics.field1230.field2787 != 0 && arg0.field2787 != 0) {
                            if (Statics.field1230.field2787 == arg0.field2787) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field2054[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field2195[var5] + var6;
                    method919(field2047[var5], class1.method348(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field551 & 0x8) == 8) {
            method919(field2081, field2082 + " " + class1.field8 + " " + class1.method348(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field2066; var9++) {
            if (field2069[var9] == 23) {
                field2072[var9] = class1.method348(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("ex.ei(IIS)Ljava/lang/String;")
    public static final String method1786(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class1.method348(16711680);
        } else if (var2 < -6) {
            return class1.method348(16723968);
        } else if (var2 < -3) {
            return class1.method348(16740352);
        } else if (var2 < 0) {
            return class1.method348(16756736);
        } else if (var2 > 9) {
            return class1.method348(65280);
        } else if (var2 > 6) {
            return class1.method348(4259584);
        } else if (var2 > 3) {
            return class1.method348(8453888);
        } else if (var2 > 0) {
            return class1.method348(12648192);
        } else {
            return class1.method348(16776960);
        }
    }

    @ObfuscatedName("s.ek(IIIIIIIIB)V")
    public static final void method124(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class141.method1494(arg0)) {
            Statics.field43 = null;
            method47(Statics.field1807[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field43 != null) {
                method47(Statics.field43, -1412584499, arg1, arg2, arg3, arg4, Statics.field761, Statics.field206, arg7);
                Statics.field43 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field2129[var8] = true;
            }
        } else {
            field2129[arg7] = true;
        }
    }

    @ObfuscatedName("h.el([Ley;IIIIIIIII)V")
    public static final void method47(class141[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class165.method2586(arg2, arg3, arg4, arg5);
        class173.method2759();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class141 var10 = arg0[var9];
            if (var10 != null && (var10.field1786 == arg1 || arg1 == -1412584499 && field2182 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1979[field2127] = var10.field1780 + arg6;
                    field2049[field2127] = var10.field1781 + arg7;
                    field2134[field2127] = var10.field1782;
                    field2151[field2127] = var10.field1785;
                    var11 = ++field2127 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field1890 = var11;
                var10.field1891 = field1919;
                if (!var10.field1774 || !method2658(var10)) {
                    if (var10.field1779 > 0) {
                        method902(var10);
                    }
                    int var12 = var10.field1780 + arg6;
                    int var13 = var10.field1781 + arg7;
                    int var14 = var10.field1797;
                    if (field2182 == var10) {
                        if (arg1 != -1412584499 && !var10.field1839) {
                            Statics.field43 = arg0;
                            Statics.field761 = arg6;
                            Statics.field206 = arg7;
                            continue;
                        }
                        if (field2105 && field2099) {
                            int var15 = class37.field492;
                            int var16 = class37.field499;
                            int var17 = var15 - field2096;
                            int var18 = var16 - field2023;
                            if (var17 < field2084) {
                                var17 = field2084;
                            }
                            if (var10.field1782 + var17 > field2084 + field2095.field1782) {
                                var17 = field2084 + field2095.field1782 - var10.field1782;
                            }
                            if (var18 < field2020) {
                                var18 = field2020;
                            }
                            if (var10.field1785 + var18 > field2020 + field2095.field1785) {
                                var18 = field2020 + field2095.field1785 - var10.field1785;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field1839) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field1806 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field1806 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field1782 + var12;
                        int var26 = var10.field1785 + var13;
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
                        int var29 = var10.field1782 + var12;
                        int var30 = var10.field1785 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field1774 || var19 < var21 && var20 < var22) {
                        if (var10.field1779 != 0) {
                            if (var10.field1779 == 1337) {
                                field2073 = var12;
                                field2003 = var13;
                                int var31 = var10.field1782;
                                int var32 = var10.field1785;
                                class165.method2586(var12, var13, var12 + var31, var13 + var32);
                                class173.method2759();
                                field2107++;
                                method479(true);
                                Statics.method121(true);
                                method479(false);
                                Statics.method121(false);
                                method850();
                                method402();
                                if (!field2181) {
                                    int var33 = field1915;
                                    if (field2144 / 256 > var33) {
                                        var33 = field2144 / 256;
                                    }
                                    if (field2183[4] && field2185[4] + 128 > var33) {
                                        var33 = field2185[4] + 128;
                                    }
                                    int var34 = field1989 + field1955 & 0x7FF;
                                    method765(Statics.field336, method358(Statics.field1230.field2630, Statics.field1230.field2615, Statics.field2046) - 50, Statics.field738, var33, var34, var33 * 3 + 600);
                                }
                                int var35;
                                if (field2181) {
                                    int var36 = method358(Statics.field350, Statics.field759, Statics.field2046);
                                    int var37;
                                    if (var36 - Statics.field850 >= 800 || (class3.field18[Statics.field2046][Statics.field350 >> 7][Statics.field759 >> 7] & 0x4) == 0) {
                                        var37 = 3;
                                    } else {
                                        var37 = Statics.field2046;
                                    }
                                    var35 = var37;
                                } else {
                                    var35 = method539();
                                }
                                int var38 = Statics.field350;
                                int var39 = Statics.field850;
                                int var40 = Statics.field759;
                                int var41 = Statics.field827;
                                int var42 = Statics.field1227;
                                for (int var43 = 0; var43 < 5; var43++) {
                                    if (field2183[var43]) {
                                        int var44 = (int) (Math.random() * (double) (field1942[var43] * 2 + 1) - (double) field1942[var43] + Math.sin((double) field2186[var43] / 100.0D * (double) field2146[var43]) * (double) field2185[var43]);
                                        if (var43 == 0) {
                                            Statics.field350 += var44;
                                        }
                                        if (var43 == 1) {
                                            Statics.field850 += var44;
                                        }
                                        if (var43 == 2) {
                                            Statics.field759 += var44;
                                        }
                                        if (var43 == 3) {
                                            Statics.field1227 = Statics.field1227 + var44 & 0x7FF;
                                        }
                                        if (var43 == 4) {
                                            Statics.field827 += var44;
                                            if (Statics.field827 < 128) {
                                                Statics.field827 = 128;
                                            }
                                            if (Statics.field827 > 383) {
                                                Statics.field827 = 383;
                                            }
                                        }
                                    }
                                }
                                int var45 = class37.field492;
                                int var46 = class37.field499;
                                if (var45 >= var12 && var45 < var12 + var31 && var46 >= var13 && var46 < var13 + var32) {
                                    class181.field2773 = true;
                                    class181.field2732 = 0;
                                    class181.field2748 = class37.field492 - var12;
                                    class181.field2776 = class37.field499 - var13;
                                } else {
                                    class181.field2773 = false;
                                    class181.field2732 = 0;
                                }
                                method1785();
                                class165.method2588(var12, var13, var31, var32, 0);
                                method1785();
                                Statics.field1481.method581(Statics.field350, Statics.field850, Statics.field759, Statics.field827, Statics.field1227, var35);
                                method1785();
                                Statics.field1481.method619();
                                method1175(var12, var13, var31, var32);
                                Statics.method1087(var12, var13);
                                ((class55) Statics.field2541).method726(field1997);
                                method88(var12, var13, var31, var32);
                                Statics.field350 = var38;
                                Statics.field850 = var39;
                                Statics.field759 = var40;
                                Statics.field827 = var41;
                                Statics.field1227 = var42;
                                if (field1918) {
                                    byte var47 = 0;
                                    int var48 = class88.field1204 + class88.field1194 + var47;
                                    if (var48 == 0) {
                                        field1918 = false;
                                    }
                                }
                                if (field1918) {
                                    class165.method2588(var12, var13, var31, var32, 0);
                                    method908(class75.field977, false);
                                }
                                if (!field1918 && !field2064 && var45 >= var12 && var45 < var12 + var31 && var46 >= var13 && var46 < var13 + var32) {
                                    method1833(var45, var46, var12, var13);
                                }
                                class165.method2586(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field1779 == 1338) {
                                method785(var12, var13, var11);
                                class165.method2586(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var50 = class37.field492;
                        int var51 = class37.field499;
                        if (!field2064 && var50 >= var19 && var51 >= var20 && var50 < var21 && var51 < var22) {
                            method722(var10, var50 - var12, var51 - var13);
                        }
                        if (var10.field1806 == 0) {
                            if (!var10.field1774 && method2658(var10) && Statics.field1738 != var10) {
                                continue;
                            }
                            if (!var10.field1774) {
                                if (var10.field1789 > var10.field1836 - var10.field1785) {
                                    var10.field1789 = var10.field1836 - var10.field1785;
                                }
                                if (var10.field1789 < 0) {
                                    var10.field1789 = 0;
                                }
                            }
                            method47(arg0, var10.field1767, var19, var20, var21, var22, var12 - var10.field1840, var13 - var10.field1789, var11);
                            if (var10.field1883 != null) {
                                method47(var10.field1883, var10.field1767, var19, var20, var21, var22, var12 - var10.field1840, var13 - var10.field1789, var11);
                            }
                            class124 var52 = (class124) field2160.method1290((long) var10.field1767);
                            if (var52 != null) {
                                if (var52.field1601 == 0 && class37.field492 >= var19 && class37.field499 >= var20 && class37.field492 < var21 && class37.field499 < var22 && !field2064 && !field2092) {
                                    field2153[0] = class75.field1092;
                                    field2072[0] = "";
                                    field2069[0] = 1006;
                                    field2066 = 1;
                                }
                                method124(var52.field1602, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class165.method2586(arg2, arg3, arg4, arg5);
                            class173.method2759();
                        }
                        if (field2131[var11] || field2156 > 1) {
                            if (var10.field1806 == 0 && !var10.field1774 && var10.field1836 > var10.field1785) {
                                int var53 = var10.field1782 + var12;
                                int var54 = var10.field1789;
                                int var55 = var10.field1785;
                                int var56 = var10.field1836;
                                Statics.field126[0].method2752(var53, var13);
                                Statics.field126[1].method2752(var53, var13 + var55 - 16);
                                class165.method2588(var53, var13 + 16, 16, var55 - 32, field2136);
                                int var57 = (var55 - 32) * var55 / var56;
                                if (var57 < 8) {
                                    var57 = 8;
                                }
                                int var58 = (var55 - 32 - var57) * var54 / (var56 - var55);
                                class165.method2588(var53, var13 + 16 + var58, 16, var57, field2080);
                                class165.method2604(var53, var13 + 16 + var58, var57, field2108);
                                class165.method2604(var53 + 1, var13 + 16 + var58, var57, field2108);
                                class165.method2627(var53, var13 + 16 + var58, 16, field2108);
                                class165.method2627(var53, var13 + 17 + var58, 16, field2108);
                                class165.method2604(var53 + 15, var13 + 16 + var58, var57, field2000);
                                class165.method2604(var53 + 14, var13 + 17 + var58, var57 - 1, field2000);
                                class165.method2627(var53, var13 + 15 + var58 + var57, 16, field2000);
                                class165.method2627(var53 + 1, var13 + 14 + var58 + var57, 15, field2000);
                            }
                            if (var10.field1806 != 1) {
                                if (var10.field1806 == 2) {
                                    int var59 = 0;
                                    for (int var60 = 0; var60 < var10.field1785; var60++) {
                                        for (int var61 = 0; var61 < var10.field1782; var61++) {
                                            int var62 = (var10.field1828 + 32) * var61 + var12;
                                            int var63 = (var10.field1784 + 32) * var60 + var13;
                                            if (var59 < 20) {
                                                var62 += var10.field1830[var59];
                                                var63 += var10.field1831[var59];
                                            }
                                            if (var10.field1799[var59] > 0) {
                                                boolean var64 = false;
                                                boolean var65 = false;
                                                int var66 = var10.field1799[var59] - 1;
                                                if (var62 + 32 > arg2 && var62 < arg4 && var63 + 32 > arg3 && var63 < arg5 || Statics.field822 == var10 && field2031 == var59) {
                                                    class171 var67;
                                                    if (field2077 == 1 && Statics.field172 == var59 && Statics.field1127 == var10.field1767) {
                                                        var67 = class162.method245(var66, var10.field1878[var59], 2, 0, false);
                                                    } else {
                                                        var67 = class162.method245(var66, var10.field1878[var59], 1, 3153952, false);
                                                    }
                                                    if (var67 == null) {
                                                        method542(var10);
                                                    } else if (Statics.field822 == var10 && field2031 == var59) {
                                                        int var68 = class37.field492 - field2032;
                                                        int var69 = class37.field499 - field1944;
                                                        if (var68 < 5 && var68 > -5) {
                                                            var68 = 0;
                                                        }
                                                        if (var69 < 5 && var69 > -5) {
                                                            var69 = 0;
                                                        }
                                                        if (field2036 < 5) {
                                                            var68 = 0;
                                                            var69 = 0;
                                                        }
                                                        var67.method2682(var62 + var68, var63 + var69, 128);
                                                        if (arg1 != -1) {
                                                            class141 var70 = arg0[arg1 & 0xFFFF];
                                                            if (var63 + var69 < class165.field2485 && var70.field1789 > 0) {
                                                                int var71 = field1997 * (class165.field2485 - var63 - var69) / 3;
                                                                if (var71 > field1997 * 10) {
                                                                    var71 = field1997 * 10;
                                                                }
                                                                if (var71 > var70.field1789) {
                                                                    var71 = var70.field1789;
                                                                }
                                                                var70.field1789 -= var71;
                                                                field1944 += var71;
                                                                method542(var70);
                                                            }
                                                            if (var63 + var69 + 32 > class165.field2487 && var70.field1789 < var70.field1836 - var70.field1785) {
                                                                int var72 = field1997 * (var63 + var69 + 32 - class165.field2487) / 3;
                                                                if (var72 > field1997 * 10) {
                                                                    var72 = field1997 * 10;
                                                                }
                                                                if (var72 > var70.field1836 - var70.field1785 - var70.field1789) {
                                                                    var72 = var70.field1836 - var70.field1785 - var70.field1789;
                                                                }
                                                                var70.field1789 += var72;
                                                                field1944 -= var72;
                                                                method542(var70);
                                                            }
                                                        }
                                                    } else if (Statics.field127 == var10 && field1987 == var59) {
                                                        var67.method2682(var62, var63, 128);
                                                    } else {
                                                        var67.method2676(var62, var63);
                                                    }
                                                }
                                            } else if (var10.field1832 != null && var59 < 20) {
                                                class171 var73 = var10.method1796(var59);
                                                if (var73 != null) {
                                                    var73.method2676(var62, var63);
                                                } else if (class141.field1773) {
                                                    method542(var10);
                                                }
                                            }
                                            var59++;
                                        }
                                    }
                                } else if (var10.field1806 == 3) {
                                    int var74;
                                    if (method998(var10)) {
                                        var74 = var10.field1793;
                                        if (Statics.field1738 == var10 && var10.field1827 != 0) {
                                            var74 = var10.field1827;
                                        }
                                    } else {
                                        var74 = var10.field1792;
                                        if (Statics.field1738 == var10 && var10.field1794 != 0) {
                                            var74 = var10.field1794;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field1879) {
                                            class165.method2588(var12, var13, var10.field1782, var10.field1785, var74);
                                        } else {
                                            class165.method2594(var12, var13, var10.field1782, var10.field1785, var74);
                                        }
                                    } else if (var10.field1879) {
                                        class165.method2591(var12, var13, var10.field1782, var10.field1785, var74, 256 - (var14 & 0xFF));
                                    } else {
                                        class165.method2628(var12, var13, var10.field1782, var10.field1785, var74, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field1806 == 4) {
                                    class182 var75 = var10.method1795();
                                    if (var75 != null) {
                                        String var76 = var10.field1822;
                                        int var77;
                                        if (method998(var10)) {
                                            var77 = var10.field1793;
                                            if (Statics.field1738 == var10 && var10.field1827 != 0) {
                                                var77 = var10.field1827;
                                            }
                                            if (var10.field1884.length() > 0) {
                                                var76 = var10.field1884;
                                            }
                                        } else {
                                            var77 = var10.field1792;
                                            if (Statics.field1738 == var10 && var10.field1794 != 0) {
                                                var77 = var10.field1794;
                                            }
                                        }
                                        if (var10.field1774 && var10.field1888 != -1) {
                                            class162 var78 = class162.method768(var10.field1888);
                                            var76 = var78.field2437;
                                            if (var76 == null) {
                                                var76 = "null";
                                            }
                                            if ((var78.field2456 == 1 || var10.field1814 != 1) && var10.field1814 != -1) {
                                                String var79 = class1.method348(16748608) + var76 + class1.field2 + " " + 'x';
                                                int var80 = var10.field1814;
                                                String var81 = Integer.toString(var80);
                                                for (int var82 = var81.length() - 3; var82 > 0; var82 -= 3) {
                                                    var81 = var81.substring(0, var82) + class1.field6 + var81.substring(var82);
                                                }
                                                StringBuilder var10000;
                                                class75 var10001;
                                                String var83;
                                                if (var81.length() > 9) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class1.method348(65408)).append(var81.substring(0, var81.length() - 8));
                                                    var10001 = (class75) null;
                                                    var83 = var10000.append(class75.field1030).append(" ").append(class1.field4).append(var81).append(class1.field5).append(class1.field2).toString();
                                                } else if (var81.length() > 6) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class1.method348(16777215)).append(var81.substring(0, var81.length() - 4));
                                                    var10001 = (class75) null;
                                                    var83 = var10000.append(class75.field1032).append(" ").append(class1.field4).append(var81).append(class1.field5).append(class1.field2).toString();
                                                } else {
                                                    var83 = " " + class1.method348(16776960) + var81 + class1.field2;
                                                }
                                                var76 = var79 + var83;
                                            }
                                        }
                                        if (field2087 == var10) {
                                            class75 var147 = (class75) null;
                                            var76 = class75.field951;
                                            var77 = var10.field1792;
                                        }
                                        if (!var10.field1774) {
                                            var76 = method1450(var76, var10);
                                        }
                                        var75.method2845(var76, var12, var13, var10.field1782, var10.field1785, var77, var10.field1775 ? 0 : -1, var10.field1825, var10.field1826, var10.field1880);
                                    } else if (class141.field1773) {
                                        method542(var10);
                                    }
                                } else if (var10.field1806 == 5) {
                                    if (var10.field1774) {
                                        class171 var85;
                                        if (var10.field1888 == -1) {
                                            var85 = var10.method1794(false);
                                        } else {
                                            var85 = class162.method245(var10.field1888, var10.field1814, var10.field1803, var10.field1804, false);
                                        }
                                        if (var85 != null) {
                                            int var86 = var85.field2506;
                                            int var87 = var85.field2501;
                                            if (var10.field1802) {
                                                class165.method2583(var12, var13, var10.field1782 + var12, var10.field1785 + var13);
                                                int var88 = (var10.field1782 + (var86 - 1)) / var86;
                                                int var89 = (var10.field1785 + (var87 - 1)) / var87;
                                                for (int var90 = 0; var90 < var88; var90++) {
                                                    for (int var91 = 0; var91 < var89; var91++) {
                                                        if (var10.field1801 != 0) {
                                                            var85.method2711(var86 / 2 + var86 * var90 + var12, var87 / 2 + var87 * var91 + var13, var10.field1801, 4096);
                                                        } else if (var14 == 0) {
                                                            var85.method2676(var86 * var90 + var12, var87 * var91 + var13);
                                                        } else {
                                                            var85.method2682(var86 * var90 + var12, var87 * var91 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class165.method2586(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var92 = var10.field1782 * 4096 / var86;
                                                if (var10.field1801 != 0) {
                                                    var85.method2711(var10.field1782 / 2 + var12, var10.field1785 / 2 + var13, var10.field1801, var92);
                                                } else if (var14 != 0) {
                                                    var85.method2684(var12, var13, var10.field1782, var10.field1785, 256 - (var14 & 0xFF));
                                                } else if (var10.field1782 == var86 && var10.field1785 == var87) {
                                                    var85.method2676(var12, var13);
                                                } else {
                                                    var85.method2678(var12, var13, var10.field1782, var10.field1785);
                                                }
                                            }
                                        } else if (class141.field1773) {
                                            method542(var10);
                                        }
                                    } else {
                                        class171 var84 = var10.method1794(method998(var10));
                                        if (var84 != null) {
                                            var84.method2676(var12, var13);
                                        } else if (class141.field1773) {
                                            method542(var10);
                                        }
                                    }
                                } else if (var10.field1806 == 6) {
                                    boolean var93 = method998(var10);
                                    int var94;
                                    if (var93) {
                                        var94 = var10.field1810;
                                    } else {
                                        var94 = var10.field1811;
                                    }
                                    class181 var95 = null;
                                    int var96 = 0;
                                    if (var10.field1888 != -1) {
                                        class162 var97 = class162.method768(var10.field1888);
                                        if (var97 != null) {
                                            class162 var98 = var97.method2524(var10.field1814);
                                            var95 = var98.method2523(1);
                                            if (var95 == null) {
                                                method542(var10);
                                            } else {
                                                var95.method3001();
                                                var96 = var95.field2489 / 2;
                                            }
                                        }
                                    } else if (var10.field1882 == 5) {
                                        if (var10.field1808 == 0) {
                                            var95 = field2034.method1146((class156) null, -1, (class156) null, -1);
                                        } else {
                                            var95 = Statics.field1230.method2641();
                                        }
                                    } else if (var94 == -1) {
                                        var95 = var10.method1821((class156) null, -1, var93, Statics.field1230.field2794);
                                        if (var95 == null && class141.field1773) {
                                            method542(var10);
                                        }
                                    } else {
                                        class156 var99 = class156.method482(var94);
                                        var95 = var10.method1821(var99, var10.field1881, var93, Statics.field1230.field2794);
                                        if (var95 == null && class141.field1773) {
                                            method542(var10);
                                        }
                                    }
                                    class173.method2792(var10.field1782 / 2 + var12, var10.field1785 / 2 + var13);
                                    int var100 = var10.field1818 * class173.field2544[var10.field1777] >> 16;
                                    int var101 = var10.field1818 * class173.field2545[var10.field1777] >> 16;
                                    if (var95 != null) {
                                        if (var10.field1774) {
                                            var95.method3001();
                                            if (var10.field1820) {
                                                var95.method3018(0, var10.field1791, var10.field1817, var10.field1777, var10.field1813, var10.field1850 + var96 + var100, var10.field1850 + var101, var10.field1818);
                                            } else {
                                                var95.method3023(0, var10.field1791, var10.field1817, var10.field1777, var10.field1813, var10.field1850 + var96 + var100, var10.field1850 + var101);
                                            }
                                        } else {
                                            var95.method3023(0, var10.field1791, 0, var10.field1777, 0, var100, var101);
                                        }
                                    }
                                    class173.method2761();
                                } else {
                                    if (var10.field1806 == 7) {
                                        class182 var102 = var10.method1795();
                                        if (var102 == null) {
                                            if (class141.field1773) {
                                                method542(var10);
                                            }
                                            continue;
                                        }
                                        int var103 = 0;
                                        for (int var104 = 0; var104 < var10.field1785; var104++) {
                                            for (int var105 = 0; var105 < var10.field1782; var105++) {
                                                if (var10.field1799[var103] > 0) {
                                                    class162 var106 = class162.method768(var10.field1799[var103] - 1);
                                                    String var107;
                                                    if (var106.field2456 != 1 && var10.field1878[var103] == 1) {
                                                        var107 = class1.method348(16748608) + var106.field2437 + class1.field2;
                                                    } else {
                                                        String var108 = class1.method348(16748608) + var106.field2437 + class1.field2 + " " + 'x';
                                                        int var109 = var10.field1878[var103];
                                                        String var110 = Integer.toString(var109);
                                                        for (int var111 = var110.length() - 3; var111 > 0; var111 -= 3) {
                                                            var110 = var110.substring(0, var111) + class1.field6 + var110.substring(var111);
                                                        }
                                                        String var112;
                                                        if (var110.length() > 9) {
                                                            var112 = " " + class1.method348(65408) + var110.substring(0, var110.length() - 8) + class75.field1030 + " " + class1.field4 + var110 + class1.field5 + class1.field2;
                                                        } else if (var110.length() > 6) {
                                                            var112 = " " + class1.method348(16777215) + var110.substring(0, var110.length() - 4) + class75.field1032 + " " + class1.field4 + var110 + class1.field5 + class1.field2;
                                                        } else {
                                                            var112 = " " + class1.method348(16776960) + var110 + class1.field2;
                                                        }
                                                        var107 = var108 + var112;
                                                    }
                                                    int var113 = (var10.field1828 + 115) * var105 + var12;
                                                    int var114 = (var10.field1784 + 12) * var104 + var13;
                                                    if (var10.field1825 == 0) {
                                                        var102.method2852(var107, var113, var114, var10.field1792, var10.field1775 ? 0 : -1);
                                                    } else if (var10.field1825 == 1) {
                                                        var102.method2879(var107, var10.field1782 / 2 + var113, var114, var10.field1792, var10.field1775 ? 0 : -1);
                                                    } else {
                                                        var102.method2828(var107, var10.field1782 + var113 - 1, var114, var10.field1792, var10.field1775 ? 0 : -1);
                                                    }
                                                }
                                                var103++;
                                            }
                                        }
                                    }
                                    if (var10.field1806 == 8 && Statics.field1228 == var10 && field2076 == field1936) {
                                        int var115 = 0;
                                        int var116 = 0;
                                        class182 var117 = Statics.field1906;
                                        String var118 = var10.field1822;
                                        String var119 = method1450(var118, var10);
                                        while (var119.length() > 0) {
                                            int var120 = var119.indexOf(class1.field7);
                                            String var121;
                                            if (var120 == -1) {
                                                var121 = var119;
                                                var119 = "";
                                            } else {
                                                var121 = var119.substring(0, var120);
                                                var119 = var119.substring(var120 + 4);
                                            }
                                            int var122 = var117.method2822(var121);
                                            if (var122 > var115) {
                                                var115 = var122;
                                            }
                                            var116 += var117.field2550 + 1;
                                        }
                                        var115 += 6;
                                        var116 += 7;
                                        int var123 = var10.field1782 + var12 - 5 - var115;
                                        int var124 = var10.field1785 + var13 + 5;
                                        if (var123 < var12 + 5) {
                                            var123 = var12 + 5;
                                        }
                                        if (var115 + var123 > arg4) {
                                            var123 = arg4 - var115;
                                        }
                                        if (var116 + var124 > arg5) {
                                            var124 = arg5 - var116;
                                        }
                                        class165.method2588(var123, var124, var115, var116, 16777120);
                                        class165.method2594(var123, var124, var115, var116, 0);
                                        String var125 = var10.field1822;
                                        int var126 = var117.field2550 + var124 + 2;
                                        String var127 = method1450(var125, var10);
                                        while (var127.length() > 0) {
                                            int var128 = var127.indexOf(class1.field7);
                                            String var129;
                                            if (var128 == -1) {
                                                var129 = var127;
                                                var127 = "";
                                            } else {
                                                var129 = var127.substring(0, var128);
                                                var127 = var127.substring(var128 + 4);
                                            }
                                            var117.method2852(var129, var123 + 3, var126, 0, -1);
                                            var126 += var117.field2550 + 1;
                                        }
                                    }
                                    if (var10.field1806 == 9) {
                                        if (var10.field1798 == 1) {
                                            class165.method2600(var12, var13, var10.field1782 + var12, var10.field1785 + var13, var10.field1792);
                                        } else {
                                            int var130 = var10.field1782 >= 0 ? var10.field1782 : -var10.field1782;
                                            int var131 = var10.field1785 >= 0 ? var10.field1785 : -var10.field1785;
                                            int var132 = var130;
                                            if (var130 < var131) {
                                                var132 = var131;
                                            }
                                            if (var132 != 0) {
                                                int var133 = (var10.field1782 << 16) / var132;
                                                int var134 = (var10.field1785 << 16) / var132;
                                                if (var134 <= var133) {
                                                    var133 = -var133;
                                                } else {
                                                    var134 = -var134;
                                                }
                                                int var135 = var10.field1798 * var134 >> 17;
                                                int var136 = var10.field1798 * var134 + 1 >> 17;
                                                int var137 = var10.field1798 * var133 >> 17;
                                                int var138 = var10.field1798 * var133 + 1 >> 17;
                                                int var139 = var12 + var135;
                                                int var140 = var12 - var136;
                                                int var141 = var10.field1782 + var12 - var136;
                                                int var142 = var10.field1782 + var12 + var135;
                                                int var143 = var13 + var137;
                                                int var144 = var13 - var138;
                                                int var145 = var10.field1785 + var13 - var138;
                                                int var146 = var10.field1785 + var13 + var137;
                                                class173.method2771(var139, var140, var141);
                                                class173.method2770(var143, var144, var145, var139, var140, var141, var10.field1792);
                                                class173.method2771(var139, var141, var142);
                                                class173.method2770(var143, var145, var146, var139, var141, var142, var10.field1792);
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

    @ObfuscatedName("df.ez(Ljava/lang/String;Ley;I)Ljava/lang/String;")
    public static String method1450(String arg0, class141 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method1475(arg1, var2 - 1);
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
                if (Statics.field391 != null) {
                    int var9 = Statics.field391.field513;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field391.field514 != null) {
                        var8 = (String) Statics.field391.field514;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ag.eu(Ley;IIIIIII)V")
    public static final void method687(class141 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field2071) {
            field1968 = 32;
        } else {
            field1968 = 0;
        }
        field2071 = false;
        if (class37.field497 != 0) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field1789 -= 4;
                method542(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field1789 += 4;
                method542(arg0);
            } else if (arg5 >= arg1 - field1968 && arg5 < field1968 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field1789 = (arg4 - arg3) * var8 / var9;
                method542(arg0);
                field2071 = true;
            }
        }
        if (field2121 == 0) {
            return;
        }
        int var10 = arg0.field1782;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field1789 += field2121 * 45;
            method542(arg0);
        }
    }

    @ObfuscatedName("ci.ff(Ley;I)Z")
    public static final boolean method998(class141 arg0) {
        if (arg0.field1872 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field1872.length; var1++) {
            int var2 = method1475(arg0, var1);
            int var3 = arg0.field1873[var1];
            if (arg0.field1872[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field1872[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field1872[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("dc.fc(Ley;II)I")
    public static final int method1475(class141 arg0, int arg1) {
        if (arg0.field1871 == null || arg1 >= arg0.field1871.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field1871[arg1];
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
                    var7 = field2060[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field2061[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field2093[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class141 var11 = class141.method451(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class162.method768(var12).field2450 || field1913)) {
                        for (int var13 = 0; var13 < var11.field1799.length; var13++) {
                            if (var12 + 1 == var11.field1799[var13]) {
                                var7 += var11.field1878[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class90.field1219[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class71.field847[field2061[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class90.field1219[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1230.field2790;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class71.field848[var14]) {
                            var7 += field2061[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class141 var17 = class141.method451(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class162.method768(var18).field2450 || field1913)) {
                        for (int var19 = 0; var19 < var17.field1799.length; var19++) {
                            if (var18 + 1 == var17.field1799[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1908;
                }
                if (var6 == 12) {
                    var7 = field2140;
                }
                if (var6 == 13) {
                    int var20 = class90.field1219[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class90.method344(var22);
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
                    var7 = (Statics.field1230.field2630 >> 7) + Statics.field125;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1230.field2615 >> 7) + Statics.field542;
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

    @ObfuscatedName("be.ft(Ley;III)V")
    public static final void method722(class141 arg0, int arg1, int arg2) {
        if (arg0.field1859 == 1) {
            method919(arg0.field1852, "", 24, 0, 0, arg0.field1767);
        }
        if (arg0.field1859 == 2 && !field2079) {
            String var3 = Statics.method1221(arg0);
            if (var3 != null) {
                method919(var3, class1.method348(65280) + arg0.field1824, 25, 0, -1, arg0.field1767);
            }
        }
        if (arg0.field1859 == 3) {
            method919(class75.field1028, "", 26, 0, 0, arg0.field1767);
        }
        if (arg0.field1859 == 4) {
            method919(arg0.field1852, "", 28, 0, 0, arg0.field1767);
        }
        if (arg0.field1859 == 5) {
            method919(arg0.field1852, "", 29, 0, 0, arg0.field1767);
        }
        if (arg0.field1859 == 6 && field2087 == null) {
            method919(arg0.field1852, "", 30, 0, -1, arg0.field1767);
        }
        if (arg0.field1806 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field1785; var5++) {
                for (int var6 = 0; var6 < arg0.field1782; var6++) {
                    int var7 = (arg0.field1828 + 32) * var6;
                    int var8 = (arg0.field1784 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field1830[var4];
                        var8 += arg0.field1831[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field1946 = var4;
                        Statics.field351 = arg0;
                        if (arg0.field1799[var4] > 0) {
                            class162 var9 = class162.method768(arg0.field1799[var4] - 1);
                            if (field2077 == 1 && class93.method786(method101(arg0))) {
                                if (Statics.field1127 != arg0.field1767 || Statics.field172 != var4) {
                                    method919(class75.field1019, field2143 + " " + class1.field8 + " " + class1.method348(16748608) + var9.field2437, 31, var9.field2435, var4, arg0.field1767);
                                }
                            } else if (!field2079 || !class93.method786(method101(arg0))) {
                                String[] var10 = var9.field2461;
                                if (field1964) {
                                    var10 = method1829(var10);
                                }
                                if (class93.method786(method101(arg0))) {
                                    for (int var11 = 4; var11 >= 3; var11--) {
                                        if (var10 != null && var10[var11] != null) {
                                            byte var12;
                                            if (var11 == 3) {
                                                var12 = 36;
                                            } else {
                                                var12 = 37;
                                            }
                                            method919(var10[var11], class1.method348(16748608) + var9.field2437, var12, var9.field2435, var4, arg0.field1767);
                                        } else if (var11 == 4) {
                                            method919(class75.field1056, class1.method348(16748608) + var9.field2437, 37, var9.field2435, var4, arg0.field1767);
                                        }
                                    }
                                }
                                if (class93.method1477(method101(arg0))) {
                                    method919(class75.field1019, class1.method348(16748608) + var9.field2437, 38, var9.field2435, var4, arg0.field1767);
                                }
                                if (class93.method786(method101(arg0)) && var10 != null) {
                                    for (int var13 = 2; var13 >= 0; var13--) {
                                        if (var10[var13] != null) {
                                            byte var14 = 0;
                                            if (var13 == 0) {
                                                var14 = 33;
                                            }
                                            if (var13 == 1) {
                                                var14 = 34;
                                            }
                                            if (var13 == 2) {
                                                var14 = 35;
                                            }
                                            method919(var10[var13], class1.method348(16748608) + var9.field2437, var14, var9.field2435, var4, arg0.field1767);
                                        }
                                    }
                                }
                                String[] var15 = arg0.field1833;
                                if (field1964) {
                                    var15 = method1829(var15);
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
                                            method919(var15[var16], class1.method348(16748608) + var9.field2437, var17, var9.field2435, var4, arg0.field1767);
                                        }
                                    }
                                }
                                method919(class75.field887, class1.method348(16748608) + var9.field2437, 1005, var9.field2435, var4, arg0.field1767);
                            } else if ((Statics.field551 & 0x10) == 16) {
                                method919(field2081, field2082 + " " + class1.field8 + " " + class1.method348(16748608) + var9.field2437, 32, var9.field2435, var4, arg0.field1767);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field1774) {
            return;
        }
        if (!field2079) {
            for (int var18 = 9; var18 >= 5; var18--) {
                String var19 = method398(arg0, var18);
                if (var19 != null) {
                    method919(var19, arg0.field1835, 1007, var18 + 1, arg0.field1776, arg0.field1767);
                }
            }
            String var20 = Statics.method1221(arg0);
            if (var20 != null) {
                method919(var20, arg0.field1835, 25, 0, arg0.field1776, arg0.field1767);
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                String var22 = method398(arg0, var21);
                if (var22 != null) {
                    method919(var22, arg0.field1835, 57, var21 + 1, arg0.field1776, arg0.field1767);
                }
            }
            if (class93.method91(method101(arg0))) {
                method919(class75.field886, "", 30, 0, arg0.field1776, arg0.field1767);
            }
        } else if (class93.method714(method101(arg0)) && (Statics.field551 & 0x20) == 32) {
            method919(field2081, field2082 + " " + class1.field8 + " " + arg0.field1835, 58, 0, arg0.field1776, arg0.field1767);
        }
    }

    @ObfuscatedName("client.fo([Ley;IIIIIIIB)V")
    public static final void method2049(class141[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class141 var9 = arg0[var8];
            if (var9 != null && (!var9.field1774 || var9.field1806 == 0 || var9.field1842 || method101(var9) != 0 || field2095 == var9) && var9.field1786 == arg1 && (!var9.field1774 || !method2658(var9))) {
                int var10 = var9.field1780 + arg6;
                int var11 = var9.field1781 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field1806 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field1806 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field1782 + var10;
                    int var19 = var9.field1785 + var11;
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
                    int var22 = var9.field1782 + var10;
                    int var23 = var9.field1785 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field2182 == var9) {
                    field2137 = true;
                    field2022 = var10;
                    field2104 = var11;
                }
                if (!var9.field1774 || var12 < var14 && var13 < var15) {
                    if (var9.field1779 == 1337) {
                        method542(var9);
                    } else if (var9.field1779 == 1338) {
                        method893(var10, var11);
                    } else {
                        if (var9.field1806 == 0) {
                            if (!var9.field1774 && method2658(var9) && Statics.field1738 != var9) {
                                continue;
                            }
                            method2049(arg0, var9.field1767, var12, var13, var14, var15, var10 - var9.field1840, var11 - var9.field1789);
                            if (var9.field1883 != null) {
                                method2049(var9.field1883, var9.field1767, var12, var13, var14, var15, var10 - var9.field1840, var11 - var9.field1789);
                            }
                            class124 var24 = (class124) field2160.method1290((long) var9.field1767);
                            if (var24 != null) {
                                int var25 = var24.field1602;
                                if (class141.method1494(var25)) {
                                    method2049(Statics.field1807[var25], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field1774) {
                            boolean var26;
                            if (class37.field492 >= var12 && class37.field499 >= var13 && class37.field492 < var14 && class37.field499 < var15) {
                                var26 = true;
                            } else {
                                var26 = false;
                            }
                            boolean var27 = false;
                            if (class37.field497 == 1 && var26) {
                                var27 = true;
                            }
                            boolean var28 = false;
                            if (class37.field504 == 1 && class37.field505 >= var12 && class37.field506 >= var13 && class37.field505 < var14 && class37.field506 < var15) {
                                var28 = true;
                            }
                            if (var28) {
                                method737(var9, class37.field505 - var10, class37.field506 - var11);
                            }
                            if (field2182 != null && field2182 != var9 && var26) {
                                int var29 = method101(var9);
                                boolean var30 = (var29 >> 20 & 0x1) != 0;
                                if (var30) {
                                    field2098 = var9;
                                }
                            }
                            if (field2095 == var9) {
                                field2099 = true;
                                field2084 = var10;
                                field2020 = var11;
                            }
                            if (var9.field1842) {
                                if (var26 && field2121 != 0 && var9.field1863 != null) {
                                    class123 var31 = new class123();
                                    var31.field1592 = var9;
                                    var31.field1594 = field2121;
                                    var31.field1590 = var9.field1863;
                                    field2191.method1293(var31);
                                }
                                if (field2182 != null || Statics.field822 != null || field2064) {
                                    var28 = false;
                                    var27 = false;
                                    var26 = false;
                                }
                                if (!var9.field1885 && var28) {
                                    var9.field1885 = true;
                                    if (var9.field1875 != null) {
                                        class123 var32 = new class123();
                                        var32.field1592 = var9;
                                        var32.field1593 = class37.field505 - var10;
                                        var32.field1594 = class37.field506 - var11;
                                        var32.field1590 = var9.field1875;
                                        field2191.method1293(var32);
                                    }
                                }
                                if (var9.field1885 && var27 && var9.field1867 != null) {
                                    class123 var33 = new class123();
                                    var33.field1592 = var9;
                                    var33.field1593 = class37.field492 - var10;
                                    var33.field1594 = class37.field499 - var11;
                                    var33.field1590 = var9.field1867;
                                    field2191.method1293(var33);
                                }
                                if (var9.field1885 && !var27) {
                                    var9.field1885 = false;
                                    if (var9.field1795 != null) {
                                        class123 var34 = new class123();
                                        var34.field1592 = var9;
                                        var34.field1593 = class37.field492 - var10;
                                        var34.field1594 = class37.field499 - var11;
                                        var34.field1590 = var9.field1795;
                                        field2124.method1293(var34);
                                    }
                                }
                                if (var27 && var9.field1847 != null) {
                                    class123 var35 = new class123();
                                    var35.field1592 = var9;
                                    var35.field1593 = class37.field492 - var10;
                                    var35.field1594 = class37.field499 - var11;
                                    var35.field1590 = var9.field1847;
                                    field2191.method1293(var35);
                                }
                                if (!var9.field1783 && var26) {
                                    var9.field1783 = true;
                                    if (var9.field1848 != null) {
                                        class123 var36 = new class123();
                                        var36.field1592 = var9;
                                        var36.field1593 = class37.field492 - var10;
                                        var36.field1594 = class37.field499 - var11;
                                        var36.field1590 = var9.field1848;
                                        field2191.method1293(var36);
                                    }
                                }
                                if (var9.field1783 && var26 && var9.field1849 != null) {
                                    class123 var37 = new class123();
                                    var37.field1592 = var9;
                                    var37.field1593 = class37.field492 - var10;
                                    var37.field1594 = class37.field499 - var11;
                                    var37.field1590 = var9.field1849;
                                    field2191.method1293(var37);
                                }
                                if (var9.field1783 && !var26) {
                                    var9.field1783 = false;
                                    if (var9.field1876 != null) {
                                        class123 var38 = new class123();
                                        var38.field1592 = var9;
                                        var38.field1593 = class37.field492 - var10;
                                        var38.field1594 = class37.field499 - var11;
                                        var38.field1590 = var9.field1876;
                                        field2124.method1293(var38);
                                    }
                                }
                                if (var9.field1861 != null) {
                                    class123 var39 = new class123();
                                    var39.field1592 = var9;
                                    var39.field1590 = var9.field1861;
                                    field2123.method1293(var39);
                                }
                                if (var9.field1855 != null && field2110 > var9.field1877) {
                                    if (var9.field1845 == null || field2110 - var9.field1877 > 32) {
                                        class123 var44 = new class123();
                                        var44.field1592 = var9;
                                        var44.field1590 = var9.field1855;
                                        field2191.method1293(var44);
                                    } else {
                                        label386: for (int var40 = var9.field1877; var40 < field2110; var40++) {
                                            int var41 = field2109[var40 & 0x1F];
                                            for (int var42 = 0; var42 < var9.field1845.length; var42++) {
                                                if (var9.field1845[var42] == var41) {
                                                    class123 var43 = new class123();
                                                    var43.field1592 = var9;
                                                    var43.field1590 = var9.field1855;
                                                    field2191.method1293(var43);
                                                    break label386;
                                                }
                                            }
                                        }
                                    }
                                    var9.field1877 = field2110;
                                }
                                if (var9.field1805 != null && field1951 > var9.field1766) {
                                    if (var9.field1856 == null || field1951 - var9.field1766 > 32) {
                                        class123 var49 = new class123();
                                        var49.field1592 = var9;
                                        var49.field1590 = var9.field1805;
                                        field2191.method1293(var49);
                                    } else {
                                        label366: for (int var45 = var9.field1766; var45 < field1951; var45++) {
                                            int var46 = field2189[var45 & 0x1F];
                                            for (int var47 = 0; var47 < var9.field1856.length; var47++) {
                                                if (var9.field1856[var47] == var46) {
                                                    class123 var48 = new class123();
                                                    var48.field1592 = var9;
                                                    var48.field1590 = var9.field1805;
                                                    field2191.method1293(var48);
                                                    break label366;
                                                }
                                            }
                                        }
                                    }
                                    var9.field1766 = field1951;
                                }
                                if (var9.field1778 != null && field2114 > var9.field1889) {
                                    if (var9.field1823 == null || field2114 - var9.field1889 > 32) {
                                        class123 var54 = new class123();
                                        var54.field1592 = var9;
                                        var54.field1590 = var9.field1778;
                                        field2191.method1293(var54);
                                    } else {
                                        label346: for (int var50 = var9.field1889; var50 < field2114; var50++) {
                                            int var51 = field2008[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field1823.length; var52++) {
                                                if (var9.field1823[var52] == var51) {
                                                    class123 var53 = new class123();
                                                    var53.field1592 = var9;
                                                    var53.field1590 = var9.field1778;
                                                    field2191.method1293(var53);
                                                    break label346;
                                                }
                                            }
                                        }
                                    }
                                    var9.field1889 = field2114;
                                }
                                if (field2115 > var9.field1815 && var9.field1864 != null) {
                                    class123 var55 = new class123();
                                    var55.field1592 = var9;
                                    var55.field1590 = var9.field1864;
                                    field2191.method1293(var55);
                                }
                                if (field2116 > var9.field1815 && var9.field1866 != null) {
                                    class123 var56 = new class123();
                                    var56.field1592 = var9;
                                    var56.field1590 = var9.field1866;
                                    field2191.method1293(var56);
                                }
                                if (field2117 > var9.field1815 && var9.field1788 != null) {
                                    class123 var57 = new class123();
                                    var57.field1592 = var9;
                                    var57.field1590 = var9.field1788;
                                    field2191.method1293(var57);
                                }
                                if (field2118 > var9.field1815 && var9.field1868 != null) {
                                    class123 var58 = new class123();
                                    var58.field1592 = var9;
                                    var58.field1590 = var9.field1868;
                                    field2191.method1293(var58);
                                }
                                var9.field1815 = field1954;
                                if (var9.field1865 != null) {
                                    for (int var59 = 0; var59 < field2150; var59++) {
                                        class123 var60 = new class123();
                                        var60.field1592 = var9;
                                        var60.field1595 = field2152[var59];
                                        var60.field1596 = field2169[var59];
                                        var60.field1590 = var9.field1865;
                                        field2191.method1293(var60);
                                    }
                                }
                            }
                        }
                        if (!var9.field1774) {
                            if (field2182 != null || Statics.field822 != null || field2064) {
                                return;
                            }
                            if ((var9.field1874 >= 0 || var9.field1794 != 0) && class37.field492 >= var12 && class37.field499 >= var13 && class37.field492 < var14 && class37.field499 < var15) {
                                if (var9.field1874 >= 0) {
                                    Statics.field1738 = arg0[var9.field1874];
                                } else {
                                    Statics.field1738 = var9;
                                }
                            }
                            if (var9.field1806 == 8 && class37.field492 >= var12 && class37.field499 >= var13 && class37.field492 < var14 && class37.field499 < var15) {
                                Statics.field1228 = var9;
                            }
                            if (var9.field1836 > var9.field1785) {
                                method687(var9, var9.field1782 + var10, var11, var9.field1785, var9.field1836, class37.field492, class37.field499);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ba.fd(IIB)V")
    public static final void method901(int arg0, int arg1) {
        if (class141.method1494(arg0)) {
            method359(Statics.field1807[arg0], arg1);
        }
    }

    @ObfuscatedName("ae.fg([Ley;II)V")
    public static final void method359(class141[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class141 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field1806 == 0) {
                    if (var3.field1883 != null) {
                        method359(var3.field1883, arg1);
                    }
                    class124 var4 = (class124) field2160.method1290((long) var3.field1767);
                    if (var4 != null) {
                        method901(var4.field1602, arg1);
                    }
                }
                if (arg1 == 0 && var3.field1869 != null) {
                    class123 var5 = new class123();
                    var5.field1592 = var3;
                    var5.field1590 = var3.field1869;
                    class12.method1103(var5);
                }
                if (arg1 == 1 && var3.field1870 != null) {
                    if (var3.field1776 >= 0) {
                        class141 var6 = class141.method451(var3.field1767);
                        if (var6 == null || var6.field1883 == null || var3.field1776 >= var6.field1883.length || var6.field1883[var3.field1776] != var3) {
                            continue;
                        }
                    }
                    class123 var7 = new class123();
                    var7.field1592 = var3;
                    var7.field1590 = var3.field1870;
                    class12.method1103(var7);
                }
            }
        }
    }

    @ObfuscatedName("bp.fw(Ley;IIB)V")
    public static final void method737(class141 arg0, int arg1, int arg2) {
        if (field2182 != null || field2064 || arg0 == null || method1787(arg0) == null) {
            return;
        }
        field2182 = arg0;
        field2095 = method1787(arg0);
        field2096 = arg1;
        field2023 = arg2;
        Statics.field1492 = 0;
        field2105 = false;
    }

    @ObfuscatedName("av.fa(Ley;B)V")
    public static void method542(class141 arg0) {
        if (field2128 == arg0.field1891) {
            field2129[arg0.field1890] = true;
        }
    }

    @ObfuscatedName("ah.fk(B)V")
    public static void method697() {
        for (class124 var0 = (class124) field2160.method1280(); var0 != null; var0 = (class124) field2160.method1282()) {
            int var1 = var0.field1602;
            if (class141.method1494(var1)) {
                boolean var2 = true;
                class141[] var3 = Statics.field1807[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field1774;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field1513;
                    class141 var6 = class141.method451(var5);
                    if (var6 != null) {
                        method542(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ex.fr(Ley;B)Ley;")
    public static class141 method1787(class141 arg0) {
        class141 var1 = Statics.method915(arg0);
        if (var1 == null) {
            var1 = arg0.field1837;
        }
        return var1;
    }

    @ObfuscatedName("ey.fl([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1829(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("cv.fj(II)V")
    public static final void method1088(int arg0) {
        if (class141.method1494(arg0)) {
            method1010(Statics.field1807[arg0], -1);
        }
    }

    @ObfuscatedName("cq.fi([Ley;II)V")
    public static final void method1010(class141[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class141 var3 = arg0[var2];
            if (var3 != null && var3.field1786 == arg1 && (!var3.field1774 || !method2658(var3))) {
                if (var3.field1806 == 0) {
                    if (!var3.field1774 && method2658(var3) && Statics.field1738 != var3) {
                        continue;
                    }
                    method1010(arg0, var3.field1767);
                    if (var3.field1883 != null) {
                        method1010(var3.field1883, var3.field1767);
                    }
                    class124 var4 = (class124) field2160.method1290((long) var3.field1767);
                    if (var4 != null) {
                        method1088(var4.field1602);
                    }
                }
                if (var3.field1806 == 6) {
                    if (var3.field1811 != -1 || var3.field1810 != -1) {
                        boolean var5 = method998(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field1810;
                        } else {
                            var6 = var3.field1811;
                        }
                        if (var6 != -1) {
                            class156 var7 = class156.method482(var6);
                            var3.field1858 += field1997;
                            while (var3.field1858 > var7.field2364[var3.field1881]) {
                                var3.field1858 -= var7.field2364[var3.field1881];
                                var3.field1881++;
                                if (var3.field1881 >= var7.field2362.length) {
                                    var3.field1881 -= var7.field2366;
                                    if (var3.field1881 < 0 || var3.field1881 >= var7.field2362.length) {
                                        var3.field1881 = 0;
                                    }
                                }
                                method542(var3);
                            }
                        }
                    }
                    if (var3.field1819 != 0 && !var3.field1774) {
                        int var8 = var3.field1819 >> 16;
                        int var9 = var3.field1819 << 16 >> 16;
                        int var10 = field1997 * var8;
                        int var11 = field1997 * var9;
                        var3.field1777 = var3.field1777 + var10 & 0x7FF;
                        var3.field1791 = var3.field1791 + var11 & 0x7FF;
                        method542(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cn.fp(II)V")
    public static final void method1223(int arg0) {
        method697();
        class125.method1099();
        int var1 = class164.method1337(arg0).field2478;
        if (var1 == 0) {
            return;
        }
        int var2 = class90.field1219[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class173.method2764(0.9D);
                ((class55) Statics.field2541).method724(0.9D);
            }
            if (var2 == 2) {
                class173.method2764(0.8D);
                ((class55) Statics.field2541).method724(0.8D);
            }
            if (var2 == 3) {
                class173.method2764(0.7D);
                ((class55) Statics.field2541).method724(0.7D);
            }
            if (var2 == 4) {
                class173.method2764(0.6D);
                ((class55) Statics.field2541).method724(0.6D);
            }
            class162.method851();
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
            if (field2075 != var3) {
                if (field2075 == 0 && field1932 != -1) {
                    class79.method278(Statics.field702, field1932, 0, var3, false);
                    field2170 = false;
                } else if (var3 == 0) {
                    Statics.field1131.method2286();
                    class79.field1130 = 1;
                    Statics.field1125 = null;
                    field2170 = false;
                } else if (class79.field1130 == 0) {
                    Statics.field1131.method2207(var3);
                } else {
                    Statics.field736 = var3;
                }
                field2075 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field2172 = 127;
            }
            if (var2 == 1) {
                field2172 = 96;
            }
            if (var2 == 2) {
                field2172 = 64;
            }
            if (var2 == 3) {
                field2172 = 32;
            }
            if (var2 == 4) {
                field2172 = 0;
            }
        }
        if (var1 == 5) {
            field2063 = var2;
        }
        if (var1 == 6) {
            field2125 = var2;
        }
        if (var1 == 9) {
            field2086 = var2;
        }
        if (var1 != 10) {
            return;
        }
        if (var2 == 0) {
            field2173 = 127;
        }
        if (var2 == 1) {
            field2173 = 96;
        }
        if (var2 == 2) {
            field2173 = 64;
        }
        if (var2 == 3) {
            field2173 = 32;
        }
        if (var2 == 4) {
            field2173 = 0;
        }
    }

    @ObfuscatedName("ba.fh(Ley;I)V")
    public static final void method902(class141 arg0) {
        int var1 = arg0.field1779;
        if (var1 == 324) {
            if (field2197 == -1) {
                field2197 = arg0.field1796;
                field2198 = arg0.field1800;
            }
            if (field2034.field1238) {
                arg0.field1796 = field2197;
            } else {
                arg0.field1796 = field2198;
            }
        } else if (var1 == 325) {
            if (field2197 == -1) {
                field2197 = arg0.field1796;
                field2198 = arg0.field1800;
            }
            if (field2034.field1238) {
                arg0.field1796 = field2198;
            } else {
                arg0.field1796 = field2197;
            }
        } else if (var1 == 327) {
            arg0.field1777 = 150;
            arg0.field1791 = (int) (Math.sin((double) field1919 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1882 = 5;
            arg0.field1808 = 0;
        } else if (var1 == 328) {
            arg0.field1777 = 150;
            arg0.field1791 = (int) (Math.sin((double) field1919 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1882 = 5;
            arg0.field1808 = 1;
        }
    }

    @ObfuscatedName("dd.fm(I)V")
    public static final void method1335() {
        field2162.method2308(245);
        for (class124 var0 = (class124) field2160.method1280(); var0 != null; var0 = (class124) field2160.method1282()) {
            if (var0.field1601 == 0 || var0.field1601 == 3) {
                method720(var0, true);
            }
        }
        if (field2087 != null) {
            method542(field2087);
            field2087 = null;
        }
    }

    @ObfuscatedName("bj.fv(IIIB)Ldj;")
    public static final class124 method799(int arg0, int arg1, int arg2) {
        class124 var3 = new class124();
        var3.field1602 = arg1;
        var3.field1601 = arg2;
        field2160.method1279(var3, (long) arg0);
        if (class141.method1494(arg1)) {
            class141[] var4 = Statics.field1807[arg1];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class141 var6 = var4[var5];
                if (var6 != null) {
                    var6.field1881 = 0;
                    var6.field1858 = 0;
                }
            }
        }
        class12.method537(arg1);
        class141 var7 = class141.method451(arg0);
        if (var7 != null) {
            method542(var7);
        }
        if (field2087 != null) {
            method542(field2087);
            field2087 = null;
        }
        field2064 = false;
        field2066 = 0;
        method432(Statics.field832, Statics.field491, Statics.field543, Statics.field1598);
        if (field2168 != -1) {
            method901(field2168, 1);
        }
        return var3;
    }

    @ObfuscatedName("bg.fq(Ldj;ZI)V")
    public static final void method720(class124 arg0, boolean arg1) {
        int var2 = arg0.field1602;
        int var3 = (int) arg0.field1513;
        arg0.method1328();
        if (arg1) {
            class141.method914(var2);
        }
        method89(var2);
        class141 var4 = class141.method451(var3);
        if (var4 != null) {
            method542(var4);
        }
        field2064 = false;
        field2066 = 0;
        method432(Statics.field832, Statics.field491, Statics.field543, Statics.field1598);
        if (field2168 != -1) {
            method901(field2168, 1);
        }
    }

    @ObfuscatedName("bk.fx(IIIB)V")
    public static final void method785(int arg0, int arg1, int arg2) {
        method1785();
        class165.method2586(arg0, arg1, Statics.field295.field2513 + arg0, Statics.field295.field2516 + arg1);
        if (field2167 == 2 || field2167 == 5) {
            class165.method2601(arg0 + 25, arg1 + 5, 0, Statics.field1169, Statics.field1599);
        } else {
            int var3 = field1992 + field1955 & 0x7FF;
            int var4 = Statics.field1230.field2630 / 32 + 48;
            int var5 = 464 - Statics.field1230.field2615 / 32;
            Statics.field1209.method2686(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field1994 + 256, Statics.field1169, Statics.field1599);
            for (int var6 = 0; var6 < field2010; var6++) {
                int var7 = field1978[var6] * 4 + 2 - Statics.field1230.field2630 / 32;
                int var8 = field2158[var6] * 4 + 2 - Statics.field1230.field2615 / 32;
                method123(arg0, arg1, var7, var8, field2159[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class105 var11 = field2056[Statics.field2046][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field1230.field2630 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field1230.field2615 / 32;
                        method123(arg0, arg1, var12, var13, Statics.field374[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field1999; var14++) {
                class184 var15 = field2062[field1984[var14]];
                if (var15 != null && var15.method2909()) {
                    class153 var16 = var15.field2805;
                    if (var16 != null && var16.field2296 != null) {
                        var16 = var16.method2355();
                    }
                    if (var16 != null && var16.field2287 && var16.field2299) {
                        int var17 = var15.field2630 / 32 - Statics.field1230.field2630 / 32;
                        int var18 = var15.field2615 / 32 - Statics.field1230.field2615 / 32;
                        method123(arg0, arg1, var17, var18, Statics.field374[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field2041; var19++) {
                class183 var20 = field2040[field2166[var19]];
                if (var20 != null && var20.method2909()) {
                    int var21 = var20.field2630 / 32 - Statics.field1230.field2630 / 32;
                    int var22 = var20.field2615 / 32 - Statics.field1230.field2615 / 32;
                    boolean var23 = false;
                    if (method766(var20.field2792)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    if (Statics.field1230.field2787 != 0 && var20.field2787 != 0 && Statics.field1230.field2787 == var20.field2787) {
                        var24 = true;
                    }
                    if (var23) {
                        method123(arg0, arg1, var21, var22, Statics.field374[3]);
                    } else if (var24) {
                        method123(arg0, arg1, var21, var22, Statics.field374[4]);
                    } else {
                        method123(arg0, arg1, var21, var22, Statics.field374[2]);
                    }
                }
            }
            if (field1927 != 0 && field1919 % 20 < 10) {
                if (field1927 == 1 && field1928 >= 0 && field1928 < field2062.length) {
                    class184 var25 = field2062[field1928];
                    if (var25 != null) {
                        int var26 = var25.field2630 / 32 - Statics.field1230.field2630 / 32;
                        int var27 = var25.field2615 / 32 - Statics.field1230.field2615 / 32;
                        method1127(arg0, arg1, var26, var27, Statics.field2420[1]);
                    }
                }
                if (field1927 == 2) {
                    int var28 = field1930 * 4 - Statics.field125 * 4 + 2 - Statics.field1230.field2630 / 32;
                    int var29 = field2065 * 4 - Statics.field542 * 4 + 2 - Statics.field1230.field2615 / 32;
                    method1127(arg0, arg1, var28, var29, Statics.field2420[1]);
                }
                if (field1927 == 10 && field2184 >= 0 && field2184 < field2040.length) {
                    class183 var30 = field2040[field2184];
                    if (var30 != null) {
                        int var31 = var30.field2630 / 32 - Statics.field1230.field2630 / 32;
                        int var32 = var30.field2615 / 32 - Statics.field1230.field2615 / 32;
                        method1127(arg0, arg1, var31, var32, Statics.field2420[1]);
                    }
                }
            }
            if (field2089 != 0) {
                int var33 = field2089 * 4 + 2 - Statics.field1230.field2630 / 32;
                int var34 = field2161 * 4 + 2 - Statics.field1230.field2615 / 32;
                method123(arg0, arg1, var33, var34, Statics.field2420[0]);
            }
            class165.method2588(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field2167 < 3) {
            Statics.field831.method2686(arg0, arg1, 33, 33, 25, 25, field1955, 256, Statics.field703, Statics.field1570);
        } else {
            class165.method2601(arg0, arg1, 0, Statics.field703, Statics.field1570);
        }
        if (field2131[arg2]) {
            Statics.field295.method2752(arg0, arg1);
        }
        field2130[arg2] = true;
    }

    @ObfuscatedName("cp.fu(IIIILfh;B)V")
    public static final void method1127(int arg0, int arg1, int arg2, int arg3, class171 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method123(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field1992 + field1955 & 0x7FF;
        int var7 = class173.field2544[var6];
        int var8 = class173.field2545[var6];
        int var9 = var7 * 256 / (field1994 + 256);
        int var10 = var8 * 256 / (field1994 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1892.method2708(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("s.fn(IIIILfh;I)V")
    public static final void method123(int arg0, int arg1, int arg2, int arg3, class171 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field1992 + field1955 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class173.field2544[var5];
        int var8 = class173.field2545[var5];
        int var9 = var7 * 256 / (field1994 + 256);
        int var10 = var8 * 256 / (field1994 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method2690(Statics.field295, arg0 + 94 + var11 - arg4.field2506 / 2 + 4, arg1 + 83 - var12 - arg4.field2501 / 2 - 4);
        } else {
            arg4.method2676(arg0 + 94 + var11 - arg4.field2506 / 2 + 4, arg1 + 83 - var12 - arg4.field2501 / 2 - 4);
        }
    }

    @ObfuscatedName("cb.fe(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method1101(int arg0, String arg1, String arg2) {
        method1507(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("dg.fz(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method1507(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field2138[var4] = field2138[var4 - 1];
            field2139[var4] = field2139[var4 - 1];
            field2097[var4] = field2097[var4 - 1];
            field1910[var4] = field1910[var4 - 1];
        }
        field2138[0] = arg0;
        field2139[0] = arg1;
        field2097[0] = arg2;
        field1910[0] = arg3;
        field2142++;
        field2115 = field1954;
    }

    @ObfuscatedName("bc.fy(Ljava/lang/String;B)Z")
    public static boolean method766(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class84.method1100(arg0, Statics.field1912);
        for (int var2 = 0; var2 < field2188; var2++) {
            if (var1.equalsIgnoreCase(class84.method1100(field2030[var2].field178, Statics.field1912))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class84.method1100(Statics.field1230.field2792, Statics.field1912))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("et.fb(Ljava/lang/String;B)Z")
    public static boolean method1769(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class84.method1100(arg0, Statics.field1912);
        for (int var2 = 0; var2 < field2193; var2++) {
            class4 var3 = field1959[var2];
            if (var1.equalsIgnoreCase(class84.method1100(var3.field38, Statics.field1912))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class84.method1100(var3.field37, Statics.field1912))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("br.fs(Ljava/lang/String;ZB)V")
    public static final void method896(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (field2193 >= 100) {
            method1101(0, "", class75.field1037);
            return;
        }
        String var2 = class84.method1100(arg0, Statics.field1912);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field2193; var3++) {
            class4 var4 = field1959[var3];
            String var5 = class84.method1100(var4.field38, Statics.field1912);
            if (var5 != null && var5.equals(var2)) {
                method1101(0, "", arg0 + class75.field1038);
                return;
            }
            if (var4.field37 != null) {
                String var6 = class84.method1100(var4.field37, Statics.field1912);
                if (var6 != null && var6.equals(var2)) {
                    method1101(0, "", arg0 + class75.field1038);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field2188; var7++) {
            class10 var8 = field2030[var7];
            String var9 = class84.method1100(var8.field178, Statics.field1912);
            if (var9 != null && var9.equals(var2)) {
                method1101(0, "", class75.field1043 + arg0 + class75.field950);
                return;
            }
            if (var8.field174 != null) {
                String var10 = class84.method1100(var8.field174, Statics.field1912);
                if (var10 != null && var10.equals(var2)) {
                    method1101(0, "", class75.field1043 + arg0 + class75.field950);
                    return;
                }
            }
        }
        if (class84.method1100(Statics.field1230.field2792, Statics.field1912).equals(var2)) {
            method1101(0, "", class75.field1040);
        } else {
            field2162.method2308(58);
            field2162.method1612(class136.method1143(arg0));
            field2162.method1702(arg0);
        }
    }

    @ObfuscatedName("r.gi(Ljava/lang/String;II)V")
    public static final void method53(String arg0, int arg1) {
        field2162.method2308(59);
        field2162.method1612(class136.method1143(arg0) + 1);
        field2162.method1699(arg1);
        field2162.method1702(arg0);
    }

    @ObfuscatedName("k.gx(II)V")
    public static void method89(int arg0) {
        for (class142 var1 = (class142) field2176.method1280(); var1 != null; var1 = (class142) field2176.method1282()) {
            if ((var1.field1513 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method1328();
            }
        }
    }

    @ObfuscatedName("f.gj(Ley;I)I")
    public static int method101(class141 arg0) {
        class142 var1 = (class142) field2176.method1290(((long) arg0.field1767 << 32) + (long) arg0.field1776);
        return var1 == null ? arg0.field1834 : var1.field1893;
    }

    @ObfuscatedName("fi.gd(Ley;I)Z")
    public static boolean method2658(class141 arg0) {
        if (field2092) {
            if (method101(arg0) != 0) {
                return false;
            }
            if (arg0.field1806 == 0) {
                return false;
            }
        }
        return arg0.field1829;
    }

    @ObfuscatedName("ar.go(Ley;II)Ljava/lang/String;")
    public static String method398(class141 arg0, int arg1) {
        if (!class93.method1784(method101(arg0), arg1) && arg0.field1887 == null) {
            return null;
        } else if (arg0.field1846 == null || arg0.field1846.length <= arg1 || arg0.field1846[arg1] == null || arg0.field1846[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field1846[arg1];
        }
    }
}

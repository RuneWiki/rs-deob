package deob;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;

public final class client extends class111 {

    @ObfuscatedName("client.au")
    public static boolean field1908 = true;

    @ObfuscatedName("client.ac")
    public static int field2010 = 1;

    @ObfuscatedName("client.aq")
    public static int field2175 = 0;

    @ObfuscatedName("client.ay")
    public static boolean field1911 = false;

    @ObfuscatedName("client.ax")
    public static boolean field1912 = false;

    @ObfuscatedName("client.av")
    public static int field1913 = 0;

    @ObfuscatedName("client.az")
    public static int field1914 = 1;

    @ObfuscatedName("client.ag")
    public static int field2078 = 0;

    @ObfuscatedName("client.as")
    public static boolean field2011 = true;

    @ObfuscatedName("client.ab")
    public static int field1917 = 0;

    @ObfuscatedName("client.af")
    public static long field1918 = 0L;

    @ObfuscatedName("client.aj")
    public static int field1919 = 0;

    @ObfuscatedName("client.ao")
    public static int field1920 = 0;

    @ObfuscatedName("client.aw")
    public static int field1921 = 0;

    @ObfuscatedName("client.bk")
    public static boolean field2007 = true;

    @ObfuscatedName("client.ba")
    public static boolean field1915 = false;

    @ObfuscatedName("client.bj")
    public static int field2186 = 0;

    @ObfuscatedName("client.bs")
    public static int field2050 = 0;

    @ObfuscatedName("client.bz")
    public static int field2090 = 0;

    @ObfuscatedName("client.bl")
    public static int field1927 = 0;

    @ObfuscatedName("client.bf")
    public static int field1928 = 0;

    @ObfuscatedName("client.bn")
    public static int field1929 = 0;

    @ObfuscatedName("client.bq")
    public static int field1930 = 0;

    @ObfuscatedName("client.bh")
    public static int field2087 = 0;

    @ObfuscatedName("client.be")
    public static int field1932 = 0;

    @ObfuscatedName("client.bx")
    public static class135 field1983 = new class135(new byte[5000]);

    @ObfuscatedName("client.bi")
    public static int field1935 = 0;

    @ObfuscatedName("client.br")
    public static int field2115 = 0;

    @ObfuscatedName("client.bp")
    public static int field1937 = 0;

    @ObfuscatedName("client.cv")
    public static int field1938 = 0;

    @ObfuscatedName("client.cx")
    public static int field1939 = 0;

    @ObfuscatedName("client.cs")
    public static int field1910 = 0;

    @ObfuscatedName("client.cc")
    public static int field1941 = 0;

    @ObfuscatedName("client.ca")
    public static int field1942 = 0;

    @ObfuscatedName("client.cn")
    public static class183[] field1946 = new class183[32768];

    @ObfuscatedName("client.cr")
    public static int field2157 = 0;

    @ObfuscatedName("client.cw")
    public static int[] field1948 = new int[32768];

    @ObfuscatedName("client.do")
    public static class150 field2176 = new class150(5000);

    @ObfuscatedName("client.de")
    public static class150 field1924 = new class150(5000);

    @ObfuscatedName("client.dq")
    public static class150 field1951 = new class150(5000);

    @ObfuscatedName("client.dh")
    public static int field1925 = 0;

    @ObfuscatedName("client.dk")
    public static int field2139 = 0;

    @ObfuscatedName("client.dm")
    public static int field1954 = 0;

    @ObfuscatedName("client.dw")
    public static int field1955 = 0;

    @ObfuscatedName("client.df")
    public static int field2107 = 0;

    @ObfuscatedName("client.dr")
    public static int field1956 = 0;

    @ObfuscatedName("client.du")
    public static int field1958 = 0;

    @ObfuscatedName("client.dp")
    public static int field2140 = 0;

    @ObfuscatedName("client.dt")
    public static boolean field1960 = false;

    @ObfuscatedName("client.dn")
    public static int field2174 = 0;

    @ObfuscatedName("client.db")
    public static int field1965 = 0;

    @ObfuscatedName("client.dc")
    public static int field1966 = 1;

    @ObfuscatedName("client.ed")
    public static int field1949 = 0;

    @ObfuscatedName("client.ex")
    public static int field1968 = 1;

    @ObfuscatedName("client.ef")
    public static int field1978 = 0;

    @ObfuscatedName("client.ej")
    public static class94[] field1970 = new class94[4];

    @ObfuscatedName("client.ev")
    public static boolean field1971 = false;

    @ObfuscatedName("client.es")
    public static int[][][] field1972 = new int[4][13][13];

    @ObfuscatedName("client.en")
    public static final int[] field1973 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.eo")
    public static int field1974 = 0;

    @ObfuscatedName("client.ew")
    public static int[][] field1975 = new int[104][104];

    @ObfuscatedName("client.eq")
    public static int[][] field1922 = new int[104][104];

    @ObfuscatedName("client.er")
    public static int[] field1977 = new int[4000];

    @ObfuscatedName("client.ez")
    public static int[] field2092 = new int[4000];

    @ObfuscatedName("client.el")
    public static int field1979 = 0;

    @ObfuscatedName("client.ep")
    public static int field1980 = 2;

    @ObfuscatedName("client.ek")
    public static int field2022 = 0;

    @ObfuscatedName("client.ea")
    public static int field1982 = 2;

    @ObfuscatedName("client.ei")
    public static int field2135 = 0;

    @ObfuscatedName("client.fu")
    public static int field1984 = 1;

    @ObfuscatedName("client.fp")
    public static int field1985 = 0;

    @ObfuscatedName("client.fh")
    public static int field2047 = 0;

    @ObfuscatedName("client.fm")
    public static int field1987 = 2;

    @ObfuscatedName("client.fj")
    public static int field1988 = 0;

    @ObfuscatedName("client.fg")
    public static int field2183 = 1;

    @ObfuscatedName("client.fi")
    public static int field2192 = 0;

    @ObfuscatedName("client.fd")
    public static int field1961 = 0;

    @ObfuscatedName("client.gv")
    public static int field1995 = 2301979;

    @ObfuscatedName("client.gp")
    public static int field1996 = 5063219;

    @ObfuscatedName("client.gm")
    public static int field1997 = 3353893;

    @ObfuscatedName("client.gq")
    public static int field1998 = 7759444;

    @ObfuscatedName("client.gi")
    public static boolean field2091 = false;

    @ObfuscatedName("client.gd")
    public static int field2127 = 0;

    @ObfuscatedName("client.gl")
    public static int field2001 = 128;

    @ObfuscatedName("client.ge")
    public static int field2002 = 0;

    @ObfuscatedName("client.gb")
    public static int field1933 = 0;

    @ObfuscatedName("client.go")
    public static int field2004 = 0;

    @ObfuscatedName("client.gx")
    public static int field2005 = 0;

    @ObfuscatedName("client.gr")
    public static boolean field2006 = false;

    @ObfuscatedName("client.gu")
    public static int field2173 = 0;

    @ObfuscatedName("client.gz")
    public static int field2008 = 0;

    @ObfuscatedName("client.gf")
    public static int field2009 = 50;

    @ObfuscatedName("client.gk")
    public static int[] field2013 = new int[field2009];

    @ObfuscatedName("client.gg")
    public static int[] field2014 = new int[field2009];

    @ObfuscatedName("client.ga")
    public static int[] field2012 = new int[field2009];

    @ObfuscatedName("client.gw")
    public static int[] field2163 = new int[field2009];

    @ObfuscatedName("client.ht")
    public static int[] field2033 = new int[field2009];

    @ObfuscatedName("client.hs")
    public static int[] field2015 = new int[field2009];

    @ObfuscatedName("client.ha")
    public static int[] field2016 = new int[field2009];

    @ObfuscatedName("client.hg")
    public static String[] field2060 = new String[field2009];

    @ObfuscatedName("client.hf")
    public static int[][] field2018 = new int[104][104];

    @ObfuscatedName("client.hi")
    public static int field2044 = 0;

    @ObfuscatedName("client.hh")
    public static int field1907 = -1;

    @ObfuscatedName("client.hv")
    public static int field2021 = -1;

    @ObfuscatedName("client.hk")
    public static int field2170 = 0;

    @ObfuscatedName("client.hm")
    public static int field1964 = 0;

    @ObfuscatedName("client.hd")
    public static int field2024 = 0;

    @ObfuscatedName("client.hb")
    public static int field2025 = 0;

    @ObfuscatedName("client.hp")
    public static int field2026 = 0;

    @ObfuscatedName("client.hu")
    public static int field2027 = 0;

    @ObfuscatedName("client.hy")
    public static int field2028 = 0;

    @ObfuscatedName("client.hw")
    public static int field2029 = 0;

    @ObfuscatedName("client.hc")
    public static int field2030 = 0;

    @ObfuscatedName("client.hn")
    public static int field1991 = 0;

    @ObfuscatedName("client.hx")
    public static boolean field2032 = false;

    @ObfuscatedName("client.hl")
    public static int field1957 = 0;

    @ObfuscatedName("client.hj")
    public static int field2118 = 0;

    @ObfuscatedName("client.ie")
    public static class182[] field2037 = new class182[2048];

    @ObfuscatedName("client.io")
    public static int field2038 = 0;

    @ObfuscatedName("client.ir")
    public static int[] field2039 = new int[2048];

    @ObfuscatedName("client.id")
    public static int field2040 = 0;

    @ObfuscatedName("client.ih")
    public static int[] field2041 = new int[2048];

    @ObfuscatedName("client.ik")
    public static class135[] field2042 = new class135[2048];

    @ObfuscatedName("client.il")
    public static int field2046 = -1;

    @ObfuscatedName("client.iq")
    public static int field1990 = 0;

    @ObfuscatedName("client.iu")
    public static int field2045 = 0;

    @ObfuscatedName("client.if")
    public static int[] field2000 = new int[1000];

    @ObfuscatedName("client.ia")
    public static final int[] field2048 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.iv")
    public static String[] field2049 = new String[8];

    @ObfuscatedName("client.in")
    public static boolean[] field2133 = new boolean[8];

    @ObfuscatedName("client.iw")
    public static int[] field2098 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ib")
    public static class104[][][] field2052 = new class104[4][104][104];

    @ObfuscatedName("client.iy")
    public static class104 field2053 = new class104();

    @ObfuscatedName("client.im")
    public static class104 field2003 = new class104();

    @ObfuscatedName("client.ip")
    public static class104 field2055 = new class104();

    @ObfuscatedName("client.ig")
    public static int[] field2056 = new int[25];

    @ObfuscatedName("client.ii")
    public static int[] field2057 = new int[25];

    @ObfuscatedName("client.jp")
    public static int[] field2035 = new int[25];

    @ObfuscatedName("client.jv")
    public static int field2059 = 0;

    @ObfuscatedName("client.jh")
    public static boolean field2064 = false;

    @ObfuscatedName("client.jo")
    public static int field1947 = 0;

    @ObfuscatedName("client.jk")
    public static int[] field2020 = new int[500];

    @ObfuscatedName("client.jq")
    public static int[] field2180 = new int[500];

    @ObfuscatedName("client.jr")
    public static int[] field2097 = new int[500];

    @ObfuscatedName("client.jc")
    public static int[] field2066 = new int[500];

    @ObfuscatedName("client.ja")
    public static String[] field2067 = new String[500];

    @ObfuscatedName("client.ji")
    public static String[] field2068 = new String[500];

    @ObfuscatedName("client.jz")
    public static int field2069 = -1;

    @ObfuscatedName("client.ju")
    public static int field2070 = -1;

    @ObfuscatedName("client.jm")
    public static int field2071 = 0;

    @ObfuscatedName("client.jj")
    public static int field2072 = 50;

    @ObfuscatedName("client.jb")
    public static int field2073 = 0;

    @ObfuscatedName("client.it")
    public static String field2074 = null;

    @ObfuscatedName("client.jx")
    public static boolean field2075 = false;

    @ObfuscatedName("client.jf")
    public static int field2023 = -1;

    @ObfuscatedName("client.kd")
    public static String field2077 = null;

    @ObfuscatedName("client.kw")
    public static String field2155 = null;

    @ObfuscatedName("client.kb")
    public static int field2079 = -1;

    @ObfuscatedName("client.kg")
    public static class103 field2080 = new class103(8);

    @ObfuscatedName("client.kj")
    public static int field2081 = 0;

    @ObfuscatedName("client.kl")
    public static int field2082 = 0;

    @ObfuscatedName("client.kp")
    public static class140 field2083 = null;

    @ObfuscatedName("client.kz")
    public static int field2084 = 0;

    @ObfuscatedName("client.ks")
    public static int field2085 = 0;

    @ObfuscatedName("client.kf")
    public static int field2169 = 0;

    @ObfuscatedName("client.ki")
    public static boolean field1969 = false;

    @ObfuscatedName("client.kv")
    public static boolean field2088 = false;

    @ObfuscatedName("client.kr")
    public static boolean field2194 = false;

    @ObfuscatedName("client.kq")
    public static class140 field2189 = null;

    @ObfuscatedName("client.ka")
    public static class140 field1959 = null;

    @ObfuscatedName("client.km")
    public static int field2108 = 0;

    @ObfuscatedName("client.kk")
    public static int field2089 = 0;

    @ObfuscatedName("client.kn")
    public static class140 field2019 = null;

    @ObfuscatedName("client.ky")
    public static boolean field2063 = false;

    @ObfuscatedName("client.ko")
    public static int field2096 = -1;

    @ObfuscatedName("client.kc")
    public static int field2171 = -1;

    @ObfuscatedName("client.kx")
    public static boolean field2058 = false;

    @ObfuscatedName("client.ku")
    public static int field2099 = -1;

    @ObfuscatedName("client.kh")
    public static int field2100 = -1;

    @ObfuscatedName("client.kt")
    public static boolean field2101 = false;

    @ObfuscatedName("client.lm")
    public static int field2102 = 1;

    @ObfuscatedName("client.lb")
    public static int[] field2105 = new int[32];

    @ObfuscatedName("client.lp")
    public static int field2106 = 0;

    @ObfuscatedName("client.lg")
    public static int[] field2094 = new int[32];

    @ObfuscatedName("client.li")
    public static int field2138 = 0;

    @ObfuscatedName("client.lx")
    public static int[] field2109 = new int[32];

    @ObfuscatedName("client.ld")
    public static int field2110 = 0;

    @ObfuscatedName("client.lh")
    public static int field2111 = 0;

    @ObfuscatedName("client.le")
    public static int field2112 = 0;

    @ObfuscatedName("client.lq")
    public static int field2113 = 0;

    @ObfuscatedName("client.ly")
    public static int field2114 = 0;

    @ObfuscatedName("client.lw")
    public static int[] field1976 = new int[2000];

    @ObfuscatedName("client.lu")
    public static String[] field2116 = new String[1000];

    @ObfuscatedName("client.lt")
    public static int field2117 = 0;

    @ObfuscatedName("client.lr")
    public static class104 field2086 = new class104();

    @ObfuscatedName("client.ll")
    public static class104 field2119 = new class104();

    @ObfuscatedName("client.lv")
    public static class104 field2120 = new class104();

    @ObfuscatedName("client.ln")
    public static class103 field2121 = new class103(512);

    @ObfuscatedName("client.mf")
    public static int field2123 = 0;

    @ObfuscatedName("client.mi")
    public static int field2124 = -2;

    @ObfuscatedName("client.mm")
    public static boolean[] field2125 = new boolean[100];

    @ObfuscatedName("client.mq")
    public static boolean[] field2126 = new boolean[100];

    @ObfuscatedName("client.mr")
    public static boolean[] field1993 = new boolean[100];

    @ObfuscatedName("client.md")
    public static int[] field2128 = new int[100];

    @ObfuscatedName("client.mj")
    public static int[] field1950 = new int[100];

    @ObfuscatedName("client.ma")
    public static int[] field2130 = new int[100];

    @ObfuscatedName("client.mo")
    public static int[] field2131 = new int[100];

    @ObfuscatedName("client.mx")
    public static int field2132 = 0;

    @ObfuscatedName("client.mw")
    public static int[] field2134 = new int[100];

    @ObfuscatedName("client.me")
    public static String[] field1936 = new String[100];

    @ObfuscatedName("client.mz")
    public static String[] field2136 = new String[100];

    @ObfuscatedName("client.mh")
    public static String[] field2137 = new String[100];

    @ObfuscatedName("client.mv")
    public static int field1999 = 0;

    @ObfuscatedName("client.mg")
    public static int[] field2193 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ml")
    public static int field2093 = 0;

    @ObfuscatedName("client.mk")
    public static int field2141 = 0;

    @ObfuscatedName("client.mb")
    public static long[] field2143 = new long[100];

    @ObfuscatedName("client.my")
    public static int field2144 = 0;

    @ObfuscatedName("client.mp")
    public static int field2146 = 0;

    @ObfuscatedName("client.mc")
    public static int[] field2147 = new int[128];

    @ObfuscatedName("client.nn")
    public static int[] field2148 = new int[128];

    @ObfuscatedName("client.nh")
    public static String field2149 = null;

    @ObfuscatedName("client.nx")
    public static String field1909 = null;

    @ObfuscatedName("client.ng")
    public static int field2151 = -1;

    @ObfuscatedName("client.np")
    public static int field2152 = 0;

    @ObfuscatedName("client.nd")
    public static int[] field1926 = new int[1000];

    @ObfuscatedName("client.ny")
    public static int[] field2154 = new int[1000];

    @ObfuscatedName("client.nt")
    public static class170[] field2153 = new class170[1000];

    @ObfuscatedName("client.nw")
    public static int field2156 = 0;

    @ObfuscatedName("client.nc")
    public static int field2062 = 0;

    @ObfuscatedName("client.nf")
    public static int field2076 = 0;

    @ObfuscatedName("client.no")
    public static int field2164 = 255;

    @ObfuscatedName("client.nr")
    public static int field2165 = -1;

    @ObfuscatedName("client.ni")
    public static boolean field2166 = false;

    @ObfuscatedName("client.nq")
    public static int field2168 = 127;

    @ObfuscatedName("client.ol")
    public static int field1953 = 127;

    @ObfuscatedName("client.og")
    public static int field1992 = 0;

    @ObfuscatedName("client.ox")
    public static int[] field2172 = new int[50];

    @ObfuscatedName("client.op")
    public static int[] field2095 = new int[50];

    @ObfuscatedName("client.oa")
    public static int[] field1989 = new int[50];

    @ObfuscatedName("client.ov")
    public static int[] field2017 = new int[50];

    @ObfuscatedName("client.oo")
    public static class22[] field1931 = new class22[50];

    @ObfuscatedName("client.on")
    public static boolean field2177 = false;

    @ObfuscatedName("client.oe")
    public static boolean[] field2054 = new boolean[5];

    @ObfuscatedName("client.ot")
    public static int[] field2181 = new int[5];

    @ObfuscatedName("client.pb")
    public static int[] field2182 = new int[5];

    @ObfuscatedName("client.pp")
    public static int[] field2034 = new int[5];

    @ObfuscatedName("client.pc")
    public static int[] field2184 = new int[5];

    @ObfuscatedName("client.pa")
    public static int field2031 = 0;

    @ObfuscatedName("client.px")
    public static int field2043 = 0;

    @ObfuscatedName("client.py")
    public static class10[] field2188 = new class10[200];

    @ObfuscatedName("client.ph")
    public static class102 field1916 = new class102();

    @ObfuscatedName("client.pm")
    public static int field2190 = 0;

    @ObfuscatedName("client.pw")
    public static class4[] field1986 = new class4[100];

    @ObfuscatedName("client.pq")
    public static class93 field1923 = new class93();

    @ObfuscatedName("client.ps")
    public static int field1981 = -1;

    @ObfuscatedName("client.pl")
    public static int field2195 = -1;

    @ObfuscatedName("client.z(I)V")
    public final void method1352() {
    }

    public final void init() {
        if (!this.method1339()) {
            return;
        }
        class97[] var1 = class97.method736();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class97 var3 = var1[var2];
            String var4 = this.getParameter(var3.field1460);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field1460)) {
                    case 1:
                        Statics.field11 = class72.method719(Integer.parseInt(var4));
                        break;
                    case 2:
                        field2175 = Integer.parseInt(var4);
                    case 3:
                    default:
                        break;
                    case 4:
                        if (var4.equalsIgnoreCase(class1.field1)) {
                            field1914 = 1;
                        } else {
                            field1914 = 0;
                        }
                        break;
                    case 5:
                        field2010 = Integer.parseInt(var4);
                        break;
                    case 6:
                        field1913 = Integer.parseInt(var4);
                        break;
                    case 7:
                        Statics.field807 = var4;
                        break;
                    case 8:
                        class73[] var5 = new class73[] { class73.field855, class73.field852, class73.field850, class73.field854, class73.field851, class73.field853 };
                        Statics.field1579 = (class73) class56.method506(var5, Integer.parseInt(var4));
                        if (Statics.field1579 == class73.field855) {
                            Statics.field359 = class110.field1510;
                        } else {
                            Statics.field359 = class110.field1516;
                        }
                        break;
                    case 9:
                        if (var4.equalsIgnoreCase(class1.field1)) {
                            field1911 = true;
                        } else {
                            field1911 = false;
                        }
                }
            }
        }
        method720();
        Statics.field44 = this.getCodeBase().getHost();
        String var6 = Statics.field11.field847;
        byte var7 = 0;
        try {
            Statics.field517 = 16;
            Statics.field347 = var7;
            try {
                Statics.field673 = System.getProperty("os.name");
            } catch (Exception var53) {
                Statics.field673 = "Unknown";
            }
            Statics.field329 = Statics.field673.toLowerCase();
            try {
                Statics.field2413 = System.getProperty("user.home");
                if (Statics.field2413 != null) {
                    Statics.field2413 = Statics.field2413 + "/";
                }
            } catch (Exception var52) {
            }
            try {
                if (Statics.field329.startsWith("win")) {
                    if (Statics.field2413 == null) {
                        Statics.field2413 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2413 == null) {
                    Statics.field2413 = System.getenv("HOME");
                }
                if (Statics.field2413 != null) {
                    Statics.field2413 = Statics.field2413 + "/";
                }
            } catch (Exception var51) {
            }
            if (Statics.field2413 == null) {
                Statics.field2413 = "~/";
            }
            Statics.field821 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2413, "/tmp/", "" };
            Statics.field518 = new String[] { ".jagex_cache_" + Statics.field347, ".file_store_" + Statics.field347 };
            int var11 = 0;
            label281: while (var11 < 4) {
                String var12 = var11 == 0 ? "" : "" + var11;
                Statics.field514 = new File(Statics.field2413, "jagex_cl_oldschool_" + var6 + var12 + ".dat");
                String var13 = null;
                String var14 = null;
                boolean var15 = false;
                if (Statics.field514.exists()) {
                    try {
                        class13 var16 = new class13(Statics.field514, "rw", 10000L);
                        class135 var17 = new class135((int) var16.method121());
                        while (var17.field1722 < var17.field1723.length) {
                            int var18 = var16.method118(var17.field1723, var17.field1722, var17.field1723.length - var17.field1722);
                            if (var18 == -1) {
                                throw new IOException();
                            }
                            var17.field1722 += var18;
                        }
                        var17.field1722 = 0;
                        int var19 = var17.method1571();
                        if (var19 < 1 || var19 > 3) {
                            throw new IOException("" + var19);
                        }
                        int var20 = 0;
                        if (var19 > 1) {
                            var20 = var17.method1571();
                        }
                        if (var19 <= 2) {
                            var13 = var17.method1580();
                            if (var20 == 1) {
                                var14 = var17.method1580();
                            }
                        } else {
                            var13 = var17.method1581();
                            if (var20 == 1) {
                                var14 = var17.method1581();
                            }
                        }
                        var16.method117();
                    } catch (IOException var56) {
                        var56.printStackTrace();
                    }
                    if (var13 != null) {
                        File var22 = new File(var13);
                        if (!var22.exists()) {
                            var13 = null;
                        }
                    }
                    if (var13 != null) {
                        File var23 = new File(var13, "test.dat");
                        if (!class38.method436(var23, true)) {
                            var13 = null;
                        }
                    }
                }
                if (var13 == null && var11 == 0) {
                    label256: for (int var24 = 0; var24 < Statics.field518.length; var24++) {
                        for (int var25 = 0; var25 < Statics.field821.length; var25++) {
                            File var26 = new File(Statics.field821[var25] + Statics.field518[var24] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var26.exists() && class38.method436(new File(var26, "test.dat"), true)) {
                                var13 = var26.toString();
                                var15 = true;
                                break label256;
                            }
                        }
                    }
                }
                if (var13 == null) {
                    var13 = Statics.field2413 + File.separatorChar + "jagexcache" + var12 + File.separatorChar + "oldschool" + File.separatorChar + var6 + File.separatorChar;
                    var15 = true;
                }
                if (var14 != null) {
                    File var27 = new File(var14);
                    File var28 = new File(var13);
                    try {
                        File[] var29 = var27.listFiles();
                        File[] var30 = var29;
                        for (int var31 = 0; var31 < var30.length; var31++) {
                            File var32 = var30[var31];
                            File var33 = new File(var28, var32.getName());
                            boolean var34 = var32.renameTo(var33);
                            if (!var34) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var55) {
                        var55.printStackTrace();
                    }
                    var15 = true;
                }
                if (var15) {
                    class38.method1461(new File(var13), (File) null);
                }
                File var36 = new File(var13);
                Statics.field515 = var36;
                if (!Statics.field515.exists()) {
                    Statics.field515.mkdirs();
                }
                File[] var37 = Statics.field515.listFiles();
                if (var37 != null) {
                    File[] var38 = var37;
                    for (int var39 = 0; var39 < var38.length; var39++) {
                        File var40 = var38[var39];
                        if (!class38.method436(var40, false)) {
                            var11++;
                            continue label281;
                        }
                    }
                }
                break;
            }
            File var41 = Statics.field515;
            Statics.field1218 = var41;
            if (!Statics.field1218.exists()) {
                throw new RuntimeException("");
            }
            class33.field369 = true;
            try {
                File var42 = new File(Statics.field2413, "random.dat");
                if (var42.exists()) {
                    class38.field508 = new class14(new class13(var42, "rw", 25L), 24, 0);
                } else {
                    label205: for (int var43 = 0; var43 < Statics.field518.length; var43++) {
                        for (int var44 = 0; var44 < Statics.field821.length; var44++) {
                            File var45 = new File(Statics.field821[var44] + Statics.field518[var43] + File.separatorChar + "random.dat");
                            if (var45.exists()) {
                                class38.field508 = new class14(new class13(var45, "rw", 25L), 24, 0);
                                break label205;
                            }
                        }
                    }
                }
                if (class38.field508 == null) {
                    RandomAccessFile var46 = new RandomAccessFile(var42, "rw");
                    int var47 = var46.read();
                    var46.seek(0L);
                    var46.write(var47);
                    var46.seek(0L);
                    var46.close();
                    class38.field508 = new class14(new class13(var42, "rw", 25L), 24, 0);
                }
            } catch (IOException var54) {
            }
            class38.field516 = new class14(new class13(class33.method51("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class38.field509 = new class14(new class13(class33.method51("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field371 = new class14[Statics.field517];
            for (int var49 = 0; var49 < Statics.field517; var49++) {
                Statics.field371[var49] = new class14(new class13(class33.method51("main_file_cache.idx" + var49), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var57) {
            class169.method255((String) null, var57);
        }
        this.method1345(765, 503, 2);
    }

    @ObfuscatedName("aw.cc(B)V")
    public static final void method720() {
        class44.field582 = false;
        field1912 = false;
    }

    @ObfuscatedName("client.u(I)V")
    public final void method1392() {
        Statics.field734 = field2175 == 0 ? 43594 : field2010 + 40000;
        Statics.field119 = field2175 == 0 ? 443 : field2010 + 50000;
        Statics.field849 = Statics.field734;
        Statics.field124 = class91.field1215;
        Statics.field1225 = class91.field1212;
        Statics.field736 = class91.field1214;
        Statics.field1219 = class91.field1213;
        class35.method877();
        Statics.method133(Statics.field1094);
        class36.method52(Statics.field1094);
        class114 var1;
        try {
            var1 = new class114();
        } catch (Throwable var3) {
            var1 = null;
        }
        Statics.field784 = var1;
        if (Statics.field784 != null) {
            Statics.field784.method353(Statics.field1094);
        }
        Statics.field1202 = new class32(255, class38.field516, class38.field509, 500000);
        if (field2175 != 0) {
            field1915 = true;
        }
    }

    @ObfuscatedName("client.m(I)V")
    public final void method1348() {
        field1917++;
        this.method1815();
        while (true) {
            class104 var1 = class88.field1201;
            class139 var2;
            synchronized (class88.field1201) {
                var2 = (class139) class88.field1199.method1293();
            }
            if (var2 == null) {
                try {
                    if (class78.field1109 == 1) {
                        int var4 = Statics.field1110.method2268();
                        if (var4 > 0 && Statics.field1110.method2275()) {
                            int var5 = var4 - Statics.field1113;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field1110.method2194(var5);
                        } else {
                            Statics.field1110.method2263();
                            Statics.field1110.method2198();
                            if (Statics.field1106 == null) {
                                class78.field1109 = 0;
                            } else {
                                class78.field1109 = 2;
                            }
                            Statics.field1578 = null;
                            Statics.field1112 = null;
                        }
                    }
                } catch (Exception var86) {
                    var86.printStackTrace();
                    Statics.field1110.method2263();
                    class78.field1109 = 0;
                    Statics.field1578 = null;
                    Statics.field1112 = null;
                    Statics.field1106 = null;
                }
                method414();
                Statics.method987();
                class36 var7 = class36.field482;
                synchronized (class36.field482) {
                    class36.field485 = class36.field480;
                    class36.field486 = class36.field483;
                    class36.field487 = class36.field493;
                    class36.field481 = class36.field488;
                    class36.field489 = class36.field492;
                    class36.field494 = class36.field490;
                    class36.field495 = class36.field491 * -2325677836611762459L;
                    class36.field488 = 0;
                }
                if (Statics.field784 != null) {
                    int var9 = Statics.field784.method349();
                    field2117 = var9;
                }
                if (field2078 == 0) {
                    method689();
                    Statics.field1528.method360();
                    for (int var10 = 0; var10 < 32; var10++) {
                        field1532[var10] = 0L;
                    }
                    for (int var11 = 0; var11 < 32; var11++) {
                        field1531[var11] = 0L;
                    }
                    Statics.field2486 = 0;
                } else if (field2078 == 5) {
                    class9.method398(this);
                    method689();
                    class111.method524();
                } else if (field2078 == 10) {
                    class9.method398(this);
                } else if (field2078 == 20) {
                    class9.method398(this);
                    method415();
                } else if (field2078 == 25) {
                    method879(false);
                    field1965 = 0;
                    boolean var12 = true;
                    for (int var13 = 0; var13 < Statics.field330.length; var13++) {
                        if (Statics.field1145[var13] != -1 && Statics.field330[var13] == null) {
                            Statics.field330[var13] = Statics.field1560.method1015(Statics.field1145[var13], 0);
                            if (Statics.field330[var13] == null) {
                                var12 = false;
                                field1965++;
                            }
                        }
                        if (Statics.field15[var13] != -1 && Statics.field259[var13] == null) {
                            Statics.field259[var13] = Statics.field1560.method1030(Statics.field15[var13], 0, Statics.field1211[var13]);
                            if (Statics.field259[var13] == null) {
                                var12 = false;
                                field1965++;
                            }
                        }
                    }
                    if (var12) {
                        field1949 = 0;
                        boolean var14 = true;
                        for (int var15 = 0; var15 < Statics.field330.length; var15++) {
                            byte[] var16 = Statics.field259[var15];
                            if (var16 != null) {
                                int var17 = (Statics.field1614[var15] >> 8) * 64 - Statics.field1739;
                                int var18 = (Statics.field1614[var15] & 0xFF) * 64 - Statics.field1766;
                                if (field1971) {
                                    var17 = 10;
                                    var18 = 10;
                                }
                                var14 &= class3.method7(var16, var17, var18);
                            }
                        }
                        if (var14) {
                            if (field1978 != 0) {
                                method771(class74.field867 + class1.field7 + class1.field2 + 100 + "%" + class1.field5, true);
                            }
                            method414();
                            method859();
                            method414();
                            Statics.field1155.method549();
                            method414();
                            System.gc();
                            for (int var19 = 0; var19 < 4; var19++) {
                                field1970[var19].method1200();
                            }
                            for (int var20 = 0; var20 < 4; var20++) {
                                for (int var21 = 0; var21 < 104; var21++) {
                                    for (int var22 = 0; var22 < 104; var22++) {
                                        class3.field18[var20][var21][var22] = 0;
                                    }
                                }
                            }
                            method414();
                            class3.field26 = 99;
                            Statics.field19 = new byte[4][104][104];
                            Statics.field20 = new byte[4][104][104];
                            Statics.field21 = new byte[4][104][104];
                            Statics.field39 = new byte[4][104][104];
                            Statics.field30 = new int[4][105][105];
                            Statics.field16 = new byte[4][105][105];
                            Statics.field1216 = new int[105][105];
                            Statics.field33 = new int[104];
                            Statics.field686 = new int[104];
                            Statics.field24 = new int[104];
                            Statics.field2487 = new int[104];
                            Statics.field25 = new int[104];
                            int var23 = Statics.field330.length;
                            class124.method325();
                            method879(true);
                            if (!field1971) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    int var25 = (Statics.field1614[var24] >> 8) * 64 - Statics.field1739;
                                    int var26 = (Statics.field1614[var24] & 0xFF) * 64 - Statics.field1766;
                                    byte[] var27 = Statics.field330[var24];
                                    if (var27 != null) {
                                        method414();
                                        class3.method694(var27, var25, var26, Statics.field53 * 8 - 48, Statics.field1767 * 8 - 48, field1970);
                                    }
                                }
                                for (int var28 = 0; var28 < var23; var28++) {
                                    int var29 = (Statics.field1614[var28] >> 8) * 64 - Statics.field1739;
                                    int var30 = (Statics.field1614[var28] & 0xFF) * 64 - Statics.field1766;
                                    byte[] var31 = Statics.field330[var28];
                                    if (var31 == null && Statics.field1767 < 800) {
                                        method414();
                                        class3.method868(var29, var30, 64, 64);
                                    }
                                }
                                method879(true);
                                for (int var32 = 0; var32 < var23; var32++) {
                                    byte[] var33 = Statics.field259[var32];
                                    if (var33 != null) {
                                        int var34 = (Statics.field1614[var32] >> 8) * 64 - Statics.field1739;
                                        int var35 = (Statics.field1614[var32] & 0xFF) * 64 - Statics.field1766;
                                        method414();
                                        class3.method46(var33, var34, var35, Statics.field1155, field1970);
                                    }
                                }
                            }
                            if (field1971) {
                                int var36 = 0;
                                label411: while (true) {
                                    if (var36 >= 4) {
                                        for (int var59 = 0; var59 < 13; var59++) {
                                            for (int var60 = 0; var60 < 13; var60++) {
                                                int var61 = field1972[0][var59][var60];
                                                if (var61 == -1) {
                                                    class3.method868(var59 * 8, var60 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method879(true);
                                        int var62 = 0;
                                        while (true) {
                                            if (var62 >= 4) {
                                                break label411;
                                            }
                                            method414();
                                            for (int var63 = 0; var63 < 13; var63++) {
                                                for (int var64 = 0; var64 < 13; var64++) {
                                                    int var65 = field1972[var62][var63][var64];
                                                    if (var65 != -1) {
                                                        int var66 = var65 >> 24 & 0x3;
                                                        int var67 = var65 >> 1 & 0x3;
                                                        int var68 = var65 >> 14 & 0x3FF;
                                                        int var69 = var65 >> 3 & 0x7FF;
                                                        int var70 = (var68 / 8 << 8) + var69 / 8;
                                                        for (int var71 = 0; var71 < Statics.field1614.length; var71++) {
                                                            if (Statics.field1614[var71] == var70 && Statics.field259[var71] != null) {
                                                                class3.method1556(Statics.field259[var71], var62, var63 * 8, var64 * 8, var66, (var68 & 0x7) * 8, (var69 & 0x7) * 8, var67, Statics.field1155, field1970);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var62++;
                                        }
                                    }
                                    method414();
                                    for (int var37 = 0; var37 < 13; var37++) {
                                        for (int var38 = 0; var38 < 13; var38++) {
                                            boolean var39 = false;
                                            int var40 = field1972[var36][var37][var38];
                                            if (var40 != -1) {
                                                int var41 = var40 >> 24 & 0x3;
                                                int var42 = var40 >> 1 & 0x3;
                                                int var43 = var40 >> 14 & 0x3FF;
                                                int var44 = var40 >> 3 & 0x7FF;
                                                int var45 = (var43 / 8 << 8) + var44 / 8;
                                                for (int var46 = 0; var46 < Statics.field1614.length; var46++) {
                                                    if (Statics.field1614[var46] == var45 && Statics.field330[var46] != null) {
                                                        byte[] var47 = Statics.field330[var46];
                                                        int var48 = var37 * 8;
                                                        int var49 = var38 * 8;
                                                        int var50 = (var43 & 0x7) * 8;
                                                        int var51 = (var44 & 0x7) * 8;
                                                        class94[] var52 = field1970;
                                                        for (int var53 = 0; var53 < 8; var53++) {
                                                            for (int var54 = 0; var54 < 8; var54++) {
                                                                if (var48 + var53 > 0 && var48 + var53 < 103 && var49 + var54 > 0 && var49 + var54 < 103) {
                                                                    var52[var36].field1264[var48 + var53][var49 + var54] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class135 var55 = new class135(var47);
                                                        for (int var56 = 0; var56 < 4; var56++) {
                                                            for (int var57 = 0; var57 < 64; var57++) {
                                                                for (int var58 = 0; var58 < 64; var58++) {
                                                                    if (var41 == var56 && var57 >= var50 && var57 < var50 + 8 && var58 >= var51 && var58 < var51 + 8) {
                                                                        Statics.method366(var55, var36, var48 + class90.method872(var57 & 0x7, var58 & 0x7, var42), var49 + class90.method953(var57 & 0x7, var58 & 0x7, var42), 0, 0, var42);
                                                                    } else {
                                                                        Statics.method366(var55, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var39 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var39) {
                                                class3.method437(var36, var37 * 8, var38 * 8);
                                            }
                                        }
                                    }
                                    var36++;
                                }
                            }
                            method879(true);
                            method859();
                            method414();
                            class3.method525(Statics.field1155, field1970);
                            method879(true);
                            int var72 = class3.field26;
                            if (var72 > Statics.field1622) {
                                var72 = Statics.field1622;
                            }
                            if (var72 < Statics.field1622 - 1) {
                                int var73 = Statics.field1622 - 1;
                            }
                            if (field1912) {
                                Statics.field1155.method550(class3.field26);
                            } else {
                                Statics.field1155.method550(0);
                            }
                            for (int var74 = 0; var74 < 104; var74++) {
                                for (int var75 = 0; var75 < 104; var75++) {
                                    method1008(var74, var75);
                                }
                            }
                            method414();
                            method869();
                            class153.field2326.method1221();
                            if (Statics.field368 != null) {
                                field2176.method2288(163);
                                field2176.method1561(1057001181);
                            }
                            if (!field1971) {
                                int var76 = (Statics.field53 - 6) / 8;
                                int var77 = (Statics.field53 + 6) / 8;
                                int var78 = (Statics.field1767 - 6) / 8;
                                int var79 = (Statics.field1767 + 6) / 8;
                                for (int var80 = var76 - 1; var80 <= var77 + 1; var80++) {
                                    for (int var81 = var78 - 1; var81 <= var79 + 1; var81++) {
                                        if (var80 < var76 || var80 > var77 || var81 < var78 || var81 > var79) {
                                            Statics.field1560.method1034("m" + var80 + "_" + var81);
                                            Statics.field1560.method1034("l" + var80 + "_" + var81);
                                        }
                                    }
                                }
                            }
                            method882(30);
                            method414();
                            Statics.field19 = (byte[][][]) null;
                            Statics.field20 = (byte[][][]) null;
                            Statics.field21 = (byte[][][]) null;
                            Statics.field39 = (byte[][][]) null;
                            Statics.field30 = (int[][][]) null;
                            Statics.field16 = (byte[][][]) null;
                            Statics.field1216 = (int[][]) null;
                            Statics.field33 = null;
                            Statics.field686 = null;
                            Statics.field24 = null;
                            Statics.field2487 = null;
                            Statics.field25 = null;
                            field2176.method2288(123);
                            Statics.field1528.method360();
                            for (int var82 = 0; var82 < 32; var82++) {
                                field1532[var82] = 0L;
                            }
                            for (int var83 = 0; var83 < 32; var83++) {
                                field1531[var83] = 0L;
                            }
                            Statics.field2486 = 0;
                        } else {
                            field1978 = 2;
                        }
                    } else {
                        field1978 = 1;
                    }
                }
                if (field2078 == 30) {
                    method1807();
                } else if (field2078 == 40) {
                    method415();
                }
                return;
            }
            var2.field1765.method1447(var2.field1762, (int) var2.field1500, var2.field1763, false);
        }
    }

    @ObfuscatedName("client.b(I)V")
    public final void method1349() {
        boolean var1 = class78.method396();
        if (var1 && field2166 && Statics.field1580 != null) {
            Statics.field1580.method208();
        }
        if (field1538) {
            class35.method852(Statics.field1094);
            class36.method66(Statics.field1094);
            if (Statics.field784 != null) {
                Statics.field784.method348(Statics.field1094);
            }
            this.method1384();
            Statics.method133(Statics.field1094);
            class36.method52(Statics.field1094);
            if (Statics.field784 != null) {
                Statics.field784.method353(Statics.field1094);
            }
        }
        if (field2078 == 0) {
            class111.method1089(class9.field148, class9.field149, (Color) null);
        } else if (field2078 == 5) {
            class9.method970(Statics.field678, Statics.field367);
        } else if (field2078 == 10) {
            class9.method970(Statics.field678, Statics.field367);
        } else if (field2078 == 20) {
            class9.method970(Statics.field678, Statics.field367);
        } else if (field2078 == 25) {
            if (field1978 == 1) {
                if (field1965 > field1966) {
                    field1966 = field1965;
                }
                int var2 = (field1966 * 50 - field1965 * 50) / field1966;
                method771(class74.field867 + class1.field7 + class1.field2 + var2 + "%" + class1.field5, false);
            } else if (field1978 == 2) {
                if (field1949 > field1968) {
                    field1968 = field1949;
                }
                int var3 = (field1968 * 50 - field1949 * 50) / field1968 + 50;
                method771(class74.field867 + class1.field7 + class1.field2 + var3 + "%" + class1.field5, false);
            } else {
                method771(class74.field867, false);
            }
        } else if (field2078 == 30) {
            if (!field2064) {
                field2067[0] = class74.field984;
                field2068[0] = "";
                field2097[0] = 1006;
                field1947 = 1;
            }
            if (field2079 != -1) {
                method700(field2079);
            }
            for (int var4 = 0; var4 < field2123; var4++) {
                if (field2125[var4]) {
                    field2126[var4] = true;
                }
                field1993[var4] = field2125[var4];
                field2125[var4] = false;
            }
            field2124 = field1917;
            field2069 = -1;
            field2070 = -1;
            Statics.field1593 = null;
            if (field2079 != -1) {
                field2123 = 0;
                method897(field2079, 0, 0, 765, 503, 0, 0, -1);
            }
            class164.method2575();
            method107();
            if (field2064) {
                int var5 = Statics.field1558;
                int var6 = Statics.field10;
                int var7 = Statics.field113;
                int var8 = Statics.field1574;
                int var9 = 6116423;
                class164.method2582(var5, var6, var7, var8, var9);
                class164.method2582(var5 + 1, var6 + 1, var7 - 2, 16, 0);
                class164.method2584(var5 + 1, var6 + 18, var7 - 2, var8 - 19, 0);
                Statics.field678.method2876(class74.field939, var5 + 3, var6 + 14, var9, -1);
                int var10 = class36.field486;
                int var11 = class36.field487;
                for (int var12 = 0; var12 < field1947; var12++) {
                    int var13 = (field1947 - 1 - var12) * 15 + var6 + 31;
                    int var14 = 16777215;
                    if (var10 > var5 && var10 < var5 + var7 && var11 > var13 - 13 && var11 < var13 + 3) {
                        var14 = 16776960;
                    }
                    Statics.field678.method2876(method1331(var12), var5 + 3, var13, var14, 0);
                }
                method984(Statics.field1558, Statics.field10, Statics.field113, Statics.field1574);
            } else if (field2069 != -1) {
                method106(field2069, field2070);
            }
            if (field2132 == 3) {
                for (int var15 = 0; var15 < field2123; var15++) {
                    if (field1993[var15]) {
                        class164.method2581(field2128[var15], field1950[var15], field2130[var15], field2131[var15], 16711935, 128);
                    } else if (field2126[var15]) {
                        class164.method2581(field2128[var15], field1950[var15], field2130[var15], field2131[var15], 16711680, 128);
                    }
                }
            }
            int var16 = Statics.field1622;
            int var17 = Statics.field1127.field2642;
            int var18 = Statics.field1127.field2614;
            int var19 = field1961;
            for (class124 var20 = (class124) class124.field1601.method1305(); var20 != null; var20 = (class124) class124.field1601.method1287()) {
                if (var20.field1606 != -1 || var20.field1610 != null) {
                    int var21 = 0;
                    if (var17 > var20.field1603) {
                        var21 += var17 - var20.field1603;
                    } else if (var17 < var20.field1612) {
                        var21 += var20.field1612 - var17;
                    }
                    if (var18 > var20.field1602) {
                        var21 += var18 - var20.field1602;
                    } else if (var18 < var20.field1599) {
                        var21 += var20.field1599 - var18;
                    }
                    if (var21 - 64 > var20.field1605 || field1953 == 0 || var20.field1600 != var16) {
                        if (var20.field1607 != null) {
                            Statics.field1115.method2181(var20.field1607);
                            var20.field1607 = null;
                        }
                        if (var20.field1611 != null) {
                            Statics.field1115.method2181(var20.field1611);
                            var20.field1611 = null;
                        }
                    } else {
                        var21 -= 64;
                        if (var21 < 0) {
                            var21 = 0;
                        }
                        int var22 = field1953 * (var20.field1605 - var21) / var20.field1605;
                        class22 var10000;
                        if (var20.field1607 != null) {
                            var20.field1607.method2073(var22);
                        } else if (var20.field1606 >= 0) {
                            var10000 = (class22) null;
                            class22 var23 = class22.method289(Statics.field795, var20.field1606, 0);
                            if (var23 != null) {
                                class145 var24 = var23.method285().method2049(Statics.field331);
                                class146 var25 = class146.method2094(var24, 100, var22);
                                var25.method2056(-1);
                                Statics.field1115.method2172(var25);
                                var20.field1607 = var25;
                            }
                        }
                        if (var20.field1611 != null) {
                            var20.field1611.method2073(var22);
                            if (!var20.field1611.method1309()) {
                                var20.field1611 = null;
                            }
                        } else if (var20.field1610 != null && (var20.field1604 -= var19) <= 0) {
                            int var26 = (int) (Math.random() * (double) var20.field1610.length);
                            var10000 = (class22) null;
                            class22 var27 = class22.method289(Statics.field795, var20.field1610[var26], 0);
                            if (var27 != null) {
                                class145 var28 = var27.method285().method2049(Statics.field331);
                                class146 var29 = class146.method2094(var28, 100, var22);
                                var29.method2056(0);
                                Statics.field1115.method2172(var29);
                                var20.field1611 = var29;
                                var20.field1604 = var20.field1608 + (int) (Math.random() * (double) (var20.field1609 - var20.field1608));
                            }
                        }
                    }
                }
            }
            field1961 = 0;
        } else if (field2078 == 40) {
            method771(class74.field868 + class1.field7 + class74.field869, false);
        }
        if (field2078 == 30 && field2132 == 0 && !field1535) {
            try {
                Graphics var30 = Statics.field1094.getGraphics();
                for (int var31 = 0; var31 < field2123; var31++) {
                    if (field2126[var31]) {
                        Statics.field1475.method530(var30, field2128[var31], field1950[var31], field2130[var31], field2131[var31]);
                        field2126[var31] = false;
                    }
                }
            } catch (Exception var37) {
                Statics.field1094.repaint();
            }
        } else if (field2078 > 0) {
            try {
                Graphics var33 = Statics.field1094.getGraphics();
                Statics.field1475.method526(var33, 0, 0);
                field1535 = false;
                for (int var34 = 0; var34 < field2123; var34++) {
                    field2126[var34] = false;
                }
            } catch (Exception var36) {
                Statics.field1094.repaint();
            }
        }
    }

    @ObfuscatedName("client.f(I)V")
    public final void method1350() {
        if (Statics.field812 != null) {
            Statics.field812.field118 = false;
        }
        Statics.field812 = null;
        if (Statics.field677 != null) {
            Statics.field677.method394();
            Statics.field677 = null;
        }
        class35.method741();
        class36.method64();
        Statics.field784 = null;
        if (Statics.field1580 != null) {
            Statics.field1580.method206();
        }
        if (Statics.field532 != null) {
            Statics.field532.method206();
        }
        Statics.method358();
        Object var1 = class88.field1198;
        synchronized (class88.field1198) {
            if (class88.field1200 != 0) {
                class88.field1200 = 1;
                try {
                    class88.field1198.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        try {
            class38.field516.method151();
            for (int var4 = 0; var4 < Statics.field517; var4++) {
                Statics.field371[var4].method151();
            }
            class38.field509.method151();
            class38.field508.method151();
        } catch (Exception var7) {
        }
    }

    @ObfuscatedName("bb.ca(II)V")
    public static void method882(int arg0) {
        if (field2078 == arg0) {
            return;
        }
        if (field2078 == 0) {
            Statics.field1533 = null;
            Statics.field857 = null;
            Statics.field1534 = null;
        }
        if (arg0 == 20 || arg0 == 40) {
            field1939 = 0;
            field1910 = 0;
            field1941 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field667 != null) {
            Statics.field667.method394();
            Statics.field667 = null;
        }
        if (field2078 == 25) {
            field1978 = 0;
            field1965 = 0;
            field1966 = 1;
            field1949 = 0;
            field1968 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class9.method898(Statics.field1094, Statics.field1727, Statics.field52);
        } else {
            class9.method2891();
        }
        field2078 = arg0;
    }

    @ObfuscatedName("client.cf(I)V")
    public void method1815() {
        if (field2078 == 1000) {
            return;
        }
        long var1 = class63.method697();
        int var3 = (int) (var1 - Statics.field1179);
        Statics.field1179 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class87.field1178 += var3;
        boolean var4;
        if (class87.field1188 == 0 && class87.field1183 == 0 && class87.field1186 == 0 && class87.field1181 == 0) {
            var4 = true;
        } else if (Statics.field1190 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class87.field1178 > 30000) {
                        throw new IOException();
                    }
                    while (class87.field1183 < 20 && class87.field1181 > 0) {
                        class167 var5 = (class167) class87.field1180.method1262();
                        class135 var6 = new class135(4);
                        var6.method1558(1);
                        var6.method1560((int) var5.field1500);
                        Statics.field1190.method377(var6.field1723, 0, 4);
                        class87.field1182.method1265(var5, var5.field1500);
                        class87.field1181--;
                        class87.field1183++;
                    }
                    while (class87.field1188 < 20 && class87.field1186 > 0) {
                        class167 var7 = (class167) class87.field1184.method1239();
                        class135 var8 = new class135(4);
                        var8.method1558(0);
                        var8.method1560((int) var7.field1500);
                        Statics.field1190.method377(var8.field1723, 0, 4);
                        var7.method1805();
                        class87.field1187.method1265(var7, var7.field1500);
                        class87.field1186--;
                        class87.field1188++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field1190.method375();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class87.field1178 = 0;
                        byte var11 = 0;
                        if (Statics.field1125 == null) {
                            var11 = 8;
                        } else if (class87.field1191 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class87.field1189.field1722;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field1190.method376(class87.field1189.field1723, class87.field1189.field1722, var12);
                            if (class87.field1195 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class87.field1189.field1723[class87.field1189.field1722 + var13] ^= class87.field1195;
                                }
                            }
                            class87.field1189.field1722 += var12;
                            if (class87.field1189.field1722 < var11) {
                                break;
                            }
                            if (Statics.field1125 == null) {
                                class87.field1189.field1722 = 0;
                                int var14 = class87.field1189.method1571();
                                int var15 = class87.field1189.method1725();
                                int var16 = class87.field1189.method1571();
                                int var17 = class87.field1189.method1616();
                                long var18 = (long) ((var14 << 16) + var15);
                                class167 var20 = (class167) class87.field1182.method1259(var18);
                                Statics.field175 = true;
                                if (var20 == null) {
                                    var20 = (class167) class87.field1187.method1259(var18);
                                    Statics.field175 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1125 = var20;
                                Statics.field1192 = new class135(var17 + var21 + Statics.field1125.field2492);
                                Statics.field1192.method1558(var16);
                                Statics.field1192.method1561(var17);
                                class87.field1191 = 8;
                                class87.field1189.field1722 = 0;
                            } else if (class87.field1191 == 0) {
                                if (class87.field1189.field1723[0] == -1) {
                                    class87.field1191 = 1;
                                    class87.field1189.field1722 = 0;
                                } else {
                                    Statics.field1125 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field1192.field1723.length - Statics.field1125.field2492;
                            int var23 = 512 - class87.field1191;
                            if (var23 > var22 - Statics.field1192.field1722) {
                                var23 = var22 - Statics.field1192.field1722;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field1190.method376(Statics.field1192.field1723, Statics.field1192.field1722, var23);
                            if (class87.field1195 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field1192.field1723[Statics.field1192.field1722 + var24] ^= class87.field1195;
                                }
                            }
                            Statics.field1192.field1722 += var23;
                            class87.field1191 += var23;
                            if (Statics.field1192.field1722 == var22) {
                                if (Statics.field1125.field1500 == 16711935L) {
                                    Statics.field2398 = Statics.field1192;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class120 var26 = class87.field1194[var25];
                                        if (var26 != null) {
                                            Statics.field2398.field1722 = var25 * 8 + 5;
                                            int var27 = Statics.field2398.method1616();
                                            int var28 = Statics.field2398.method1616();
                                            var26.method1445(var27, var28);
                                        }
                                    }
                                } else {
                                    class87.field1193.reset();
                                    class87.field1193.update(Statics.field1192.field1723, 0, var22);
                                    int var29 = (int) class87.field1193.getValue();
                                    if (Statics.field1125.field2491 != var29) {
                                        try {
                                            Statics.field1190.method394();
                                        } catch (Exception var35) {
                                        }
                                        class87.field1196++;
                                        Statics.field1190 = null;
                                        class87.field1195 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class87.field1196 = 0;
                                    class87.field1197 = 0;
                                    Statics.field1125.field2490.method1455((int) (Statics.field1125.field1500 & 0xFFFFL), Statics.field1192.field1723, (Statics.field1125.field1500 & 0xFF0000L) == 16711680L, Statics.field175);
                                }
                                Statics.field1125.method1307();
                                if (Statics.field175) {
                                    class87.field1183--;
                                } else {
                                    class87.field1188--;
                                }
                                class87.field1191 = 0;
                                Statics.field1125 = null;
                                Statics.field1192 = null;
                            } else {
                                if (class87.field1191 != 512) {
                                    break;
                                }
                                class87.field1191 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field1190.method394();
                } catch (Exception var34) {
                }
                class87.field1197++;
                Statics.field1190 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1816();
        }
    }

    @ObfuscatedName("client.ch(I)V")
    public void method1816() {
        if (class87.field1196 >= 4) {
            this.method1351("js5crc");
            field2078 = 1000;
            return;
        }
        if (class87.field1197 >= 4) {
            if (field2078 <= 5) {
                this.method1351("js5io");
                field2078 = 1000;
                return;
            }
            field1937 = 3000;
            class87.field1197 = 3;
        }
        if (--field1937 + 1 > 0) {
            return;
        }
        try {
            if (field2115 == 0) {
                Statics.field858 = Statics.field1519.method419(Statics.field44, Statics.field849);
                field2115++;
            }
            if (field2115 == 1) {
                if (Statics.field858.field500 == 2) {
                    this.method1817(-1);
                    return;
                }
                if (Statics.field858.field500 == 1) {
                    field2115++;
                }
            }
            if (field2115 == 2) {
                Statics.field808 = new class31((Socket) Statics.field858.field501, Statics.field1519);
                class135 var1 = new class135(5);
                var1.method1558(15);
                var1.method1561(2);
                Statics.field808.method377(var1.field1723, 0, 5);
                field2115++;
                Statics.field859 = class63.method697();
            }
            if (field2115 == 3) {
                if (field2078 <= 5 || Statics.field808.method375() > 0) {
                    int var2 = Statics.field808.method374();
                    if (var2 != 0) {
                        this.method1817(var2);
                        return;
                    }
                    field2115++;
                } else if (class63.method697() - Statics.field859 > 30000L) {
                    this.method1817(-2);
                    return;
                }
            }
            if (field2115 == 4) {
                class31 var3 = Statics.field808;
                boolean var4 = field2078 > 20;
                if (Statics.field1190 != null) {
                    try {
                        Statics.field1190.method394();
                    } catch (Exception var14) {
                    }
                    Statics.field1190 = null;
                }
                Statics.field1190 = var3;
                Statics.method1112(var4);
                class87.field1189.field1722 = 0;
                Statics.field1125 = null;
                Statics.field1192 = null;
                class87.field1191 = 0;
                while (true) {
                    class167 var6 = (class167) class87.field1182.method1262();
                    if (var6 == null) {
                        while (true) {
                            class167 var7 = (class167) class87.field1187.method1262();
                            if (var7 == null) {
                                if (class87.field1195 != 0) {
                                    try {
                                        class135 var8 = new class135(4);
                                        var8.method1558(4);
                                        var8.method1558(class87.field1195);
                                        var8.method1559(0);
                                        Statics.field1190.method377(var8.field1723, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field1190.method394();
                                        } catch (Exception var12) {
                                        }
                                        class87.field1197++;
                                        Statics.field1190 = null;
                                    }
                                }
                                class87.field1178 = 0;
                                Statics.field1179 = class63.method697();
                                Statics.field858 = null;
                                Statics.field808 = null;
                                field2115 = 0;
                                field1938 = 0;
                                return;
                            }
                            class87.field1184.method1236(var7);
                            class87.field1185.method1265(var7, var7.field1500);
                            class87.field1186++;
                            class87.field1188--;
                        }
                    }
                    class87.field1180.method1265(var6, var6.field1500);
                    class87.field1181++;
                    class87.field1183--;
                }
            }
        } catch (IOException var15) {
            this.method1817(-3);
        }
    }

    @ObfuscatedName("client.cg(II)V")
    public void method1817(int arg0) {
        Statics.field858 = null;
        Statics.field808 = null;
        field2115 = 0;
        if (Statics.field849 == Statics.field734) {
            Statics.field849 = Statics.field119;
        } else {
            Statics.field849 = Statics.field734;
        }
        field1938++;
        if (field1938 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field2078 <= 5) {
                this.method1351("js5connect_full");
                field2078 = 1000;
            } else {
                field1937 = 3000;
            }
        } else if (field1938 >= 2 && arg0 == 6) {
            this.method1351("js5connect_outofdate");
            field2078 = 1000;
        } else if (field1938 >= 4) {
            if (field2078 <= 5) {
                this.method1351("js5connect");
                field2078 = 1000;
            } else {
                field1937 = 3000;
            }
        }
    }

    @ObfuscatedName("ag.co(B)V")
    public static void method689() {
        if (field1935 == 0) {
            Statics.field1155 = new class44(4, 104, 104, class3.field22);
            for (int var0 = 0; var0 < 4; var0++) {
                field1970[var0] = new class94(104, 104);
            }
            Statics.field1768 = new class170(512, 512);
            class9.field149 = class74.field870;
            class9.field148 = 5;
            field1935 = 20;
        } else if (field1935 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class172.field2543[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class44.method583(var1, 500, 800, 512, 334);
            class9.field149 = class74.field893;
            class9.field148 = 10;
            field1935 = 30;
        } else if (field1935 == 30) {
            Statics.field841 = method56(0, false, true, true);
            Statics.field785 = method56(1, false, true, true);
            Statics.field125 = method56(2, true, false, true);
            Statics.field1738 = method56(3, false, true, true);
            Statics.field795 = method56(4, false, true, true);
            Statics.field1560 = method56(5, true, true, true);
            Statics.field1095 = method56(6, true, true, false);
            Statics.field40 = method56(7, false, true, true);
            Statics.field52 = method56(8, false, true, true);
            Statics.field203 = method56(9, false, true, true);
            Statics.field1727 = method56(10, false, true, true);
            Statics.field1210 = method56(11, false, true, true);
            Statics.field1621 = method56(12, false, true, true);
            Statics.field538 = method56(13, true, false, true);
            Statics.field1126 = method56(14, false, true, false);
            Statics.field1508 = method56(15, false, true, true);
            class9.field149 = class74.field872;
            class9.field148 = 20;
            field1935 = 40;
        } else if (field1935 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field841.method1449() * 4 / 100;
            int var8 = var7 + Statics.field785.method1449() * 4 / 100;
            int var9 = var8 + Statics.field125.method1449() * 2 / 100;
            int var10 = var9 + Statics.field1738.method1449() * 2 / 100;
            int var11 = var10 + Statics.field795.method1449() * 6 / 100;
            int var12 = var11 + Statics.field1560.method1449() * 4 / 100;
            int var13 = var12 + Statics.field1095.method1449() * 2 / 100;
            int var14 = var13 + Statics.field40.method1449() * 60 / 100;
            int var15 = var14 + Statics.field52.method1449() * 2 / 100;
            int var16 = var15 + Statics.field203.method1449() * 2 / 100;
            int var17 = var16 + Statics.field1727.method1449() * 2 / 100;
            int var18 = var17 + Statics.field1210.method1449() * 2 / 100;
            int var19 = var18 + Statics.field1621.method1449() * 2 / 100;
            int var20 = var19 + Statics.field538.method1449() * 2 / 100;
            int var21 = var20 + Statics.field1126.method1449() * 2 / 100;
            int var22 = var21 + Statics.field1508.method1449() * 2 / 100;
            if (var22 == 100) {
                class9.field149 = class74.field874;
                class9.field148 = 30;
                field1935 = 45;
            } else {
                if (var22 != 0) {
                    class9.field149 = class74.field887 + var22 + "%";
                }
                class9.field148 = 30;
            }
        } else if (field1935 == 45) {
            boolean var23 = !field1912;
            Statics.field823 = 22050;
            Statics.field251 = var23;
            Statics.field235 = 2;
            class148 var24 = new class148();
            var24.method2226(9, 128);
            Statics.field1580 = class18.method5(Statics.field1519, Statics.field1094, 0, 22050);
            Statics.field1580.method207(var24);
            class120 var25 = Statics.field1508;
            class120 var26 = Statics.field1126;
            class120 var27 = Statics.field795;
            Statics.field1108 = var25;
            Statics.field733 = var26;
            Statics.field1107 = var27;
            Statics.field1110 = var24;
            Statics.field532 = class18.method5(Statics.field1519, Statics.field1094, 1, 2048);
            Statics.field1115 = new class147();
            Statics.field532.method207(Statics.field1115);
            Statics.field331 = new class26(22050, Statics.field823);
            class9.field149 = class74.field1085;
            class9.field148 = 35;
            field1935 = 50;
        } else if (field1935 == 50) {
            int var28 = 0;
            if (Statics.field367 == null) {
                Statics.field367 = Statics.method1465(Statics.field52, Statics.field538, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field2160 == null) {
                Statics.field2160 = Statics.method1465(Statics.field52, Statics.field538, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field678 == null) {
                Statics.field678 = Statics.method1465(Statics.field52, Statics.field538, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class9.field149 = class74.field1059 + var28 * 100 / 3 + "%";
                class9.field148 = 40;
            } else {
                class9.field149 = class74.field877;
                class9.field148 = 40;
                field1935 = 60;
            }
        } else if (field1935 == 60) {
            class120 var29 = Statics.field1727;
            class120 var30 = Statics.field52;
            int var31 = 0;
            if (var29.method1033("title.jpg", "")) {
                var31++;
            }
            if (var30.method1033("logo", "")) {
                var31++;
            }
            if (var30.method1033("titlebox", "")) {
                var31++;
            }
            if (var30.method1033("titlebutton", "")) {
                var31++;
            }
            if (var30.method1033("runes", "")) {
                var31++;
            }
            if (var30.method1033("title_mute", "")) {
                var31++;
            }
            var30.method1033("sl_back", "");
            var30.method1033("sl_flags", "");
            var30.method1033("sl_arrows", "");
            var30.method1033("sl_stars", "");
            var30.method1033("sl_button", "");
            byte var34 = 6;
            if (var31 < var34) {
                class9.field149 = class74.field905 + var31 * 100 / var34 + "%";
                class9.field148 = 50;
            } else {
                class9.field149 = class74.field961;
                class9.field148 = 50;
                method882(5);
                field1935 = 70;
            }
        } else if (field1935 == 70) {
            if (Statics.field125.method1019()) {
                class120 var36 = Statics.field125;
                Statics.field1098 = var36;
                class120 var37 = Statics.field125;
                Statics.field2350 = var37;
                Statics.method724(Statics.field125, Statics.field40);
                class120 var38 = Statics.field125;
                class120 var39 = Statics.field40;
                boolean var40 = field1912;
                Statics.field2342 = var38;
                Statics.field1582 = var39;
                class153.field2328 = var40;
                class120 var41 = Statics.field125;
                class120 var42 = Statics.field40;
                Statics.field2279 = var41;
                Statics.field2266 = var42;
                class161.method254(Statics.field125, Statics.field40, field1911, Statics.field367);
                class155.method782(Statics.field125, Statics.field841, Statics.field785);
                class156.method1203(Statics.field125, Statics.field40);
                class159.method113(Statics.field125);
                class163.method1201(Statics.field125);
                class120 var43 = Statics.field1738;
                class120 var44 = Statics.field40;
                class120 var45 = Statics.field52;
                class120 var46 = Statics.field538;
                Statics.field1770 = var43;
                Statics.field1884 = var44;
                Statics.field1454 = var45;
                Statics.field1772 = var46;
                Statics.field806 = new class140[Statics.field1770.method1026()][];
                Statics.field1883 = new boolean[Statics.field1770.method1026()];
                class162.method2456(Statics.field125);
                class160.method737(Statics.field125);
                class9.field149 = class74.field1066;
                class9.field148 = 60;
                field1935 = 80;
            } else {
                class9.field149 = class74.field880 + Statics.field125.method1448() + "%";
                class9.field148 = 60;
            }
        } else if (field1935 == 80) {
            int var47 = 0;
            if (Statics.field1206 == null) {
                Statics.field1206 = class39.method368(Statics.field52, "compass", "");
            } else {
                var47++;
            }
            if (Statics.field811 == null) {
                Statics.field811 = class39.method368(Statics.field52, "mapedge", "");
            } else {
                var47++;
            }
            if (Statics.field2185 == null) {
                Statics.field2185 = class39.method1478(Statics.field52, "mapscene", "");
            } else {
                var47++;
            }
            if (Statics.field1967 == null) {
                Statics.field1967 = class39.method887(Statics.field52, "mapfunction", "");
            } else {
                var47++;
            }
            if (Statics.field1104 == null) {
                Statics.field1104 = class39.method887(Statics.field52, "hitmarks", "");
            } else {
                var47++;
            }
            if (Statics.field2483 == null) {
                Statics.field2483 = class39.method887(Statics.field52, "headicons_pk", "");
            } else {
                var47++;
            }
            if (Statics.field1176 == null) {
                Statics.field1176 = class39.method887(Statics.field52, "headicons_prayer", "");
            } else {
                var47++;
            }
            if (Statics.field799 == null) {
                Statics.field799 = class39.method887(Statics.field52, "headicons_hint", "");
            } else {
                var47++;
            }
            if (Statics.field1229 == null) {
                Statics.field1229 = class39.method887(Statics.field52, "mapmarker", "");
            } else {
                var47++;
            }
            if (Statics.field45 == null) {
                Statics.field45 = class39.method887(Statics.field52, "cross", "");
            } else {
                var47++;
            }
            if (Statics.field1207 == null) {
                Statics.field1207 = class39.method887(Statics.field52, "mapdots", "");
            } else {
                var47++;
            }
            if (Statics.field1994 == null) {
                Statics.field1994 = class39.method1478(Statics.field52, "scrollbar", "");
            } else {
                var47++;
            }
            if (Statics.field1175 == null) {
                Statics.field1175 = class39.method1478(Statics.field52, "mod_icons", "");
            } else {
                var47++;
            }
            if (Statics.field1716 == null) {
                Statics.field1716 = class39.method759(Statics.field52, "mapback", "");
            } else {
                var47++;
            }
            if (var47 < 14) {
                class9.field149 = class74.field882 + var47 * 100 / 14 + "%";
                class9.field148 = 70;
            } else {
                Statics.field2554 = Statics.field1175;
                Statics.field811.method2657();
                int var48 = (int) (Math.random() * 21.0D) - 10;
                int var49 = (int) (Math.random() * 21.0D) - 10;
                int var50 = (int) (Math.random() * 21.0D) - 10;
                int var51 = (int) (Math.random() * 41.0D) - 20;
                for (int var52 = 0; var52 < Statics.field1967.length; var52++) {
                    Statics.field1967[var52].method2732(var48 + var51, var49 + var51, var50 + var51);
                }
                Statics.field2185[0].method2735(var48 + var51, var49 + var51, var50 + var51);
                Statics.field360 = new int[33];
                Statics.field1594 = new int[33];
                Statics.field521 = new int[151];
                Statics.field1616 = new int[151];
                for (int var53 = 0; var53 < 33; var53++) {
                    int var54 = 999;
                    int var55 = 0;
                    for (int var56 = 0; var56 < 34; var56++) {
                        if (Statics.field1716.field2512[Statics.field1716.field2513 * var53 + var56] == 0) {
                            if (var54 == 999) {
                                var54 = var56;
                            }
                        } else if (var54 != 999) {
                            var55 = var56;
                            break;
                        }
                    }
                    Statics.field360[var53] = var54;
                    Statics.field1594[var53] = var55 - var54;
                }
                for (int var57 = 5; var57 < 156; var57++) {
                    int var58 = 999;
                    int var59 = 0;
                    for (int var60 = 25; var60 < 172; var60++) {
                        if (Statics.field1716.field2512[Statics.field1716.field2513 * var57 + var60] == 0 && (var60 > 34 || var57 > 34)) {
                            if (var58 == 999) {
                                var58 = var60;
                            }
                        } else if (var58 != 999) {
                            var59 = var60;
                            break;
                        }
                    }
                    Statics.field521[var57 - 5] = var58 - 25;
                    Statics.field1616[var57 - 5] = var59 - var58;
                }
                class9.field149 = class74.field991;
                class9.field148 = 70;
                field1935 = 90;
            }
        } else if (field1935 == 90) {
            if (Statics.field203.method1019()) {
                class54 var61 = new class54(Statics.field203, Statics.field52, 20, 0.8D, field1912 ? 64 : 128);
                class172.method2752(var61);
                class172.method2753(0.8D);
                class9.field149 = class74.field885;
                class9.field148 = 90;
                field1935 = 110;
            } else {
                class9.field149 = class74.field884 + Statics.field203.method1448() + "%";
                class9.field148 = 90;
            }
        } else if (field1935 == 110) {
            Statics.field812 = new class7();
            Statics.field1519.method420(Statics.field812, 10);
            class9.field149 = class74.field886;
            class9.field148 = 94;
            field1935 = 120;
        } else if (field1935 == 120) {
            if (Statics.field1727.method1033("huffman", "")) {
                class62 var62 = new class62(Statics.field1727.method1037("huffman", ""));
                class109.method723(var62);
                class9.field149 = class74.field903;
                class9.field148 = 96;
                field1935 = 130;
            } else {
                class9.field149 = class74.field1030 + "%";
                class9.field148 = 96;
            }
        } else if (field1935 == 130) {
            if (!Statics.field1738.method1019()) {
                class9.field149 = class74.field938 + Statics.field1738.method1448() * 4 / 5 + "%";
                class9.field148 = 100;
            } else if (!Statics.field1621.method1019()) {
                class9.field149 = class74.field938 + (80 + Statics.field1621.method1448() / 6) + "%";
                class9.field148 = 100;
            } else if (Statics.field538.method1019()) {
                class9.field149 = class74.field890;
                class9.field148 = 100;
                field1935 = 140;
            } else {
                class9.field149 = class74.field938 + (96 + Statics.field538.method1448() / 20) + "%";
                class9.field148 = 100;
            }
        } else if (field1935 == 140) {
            method882(10);
        }
    }

    @ObfuscatedName("k.ci(IZZZI)Ldy;")
    public static class120 method56(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class32 var4 = null;
        if (class38.field516 != null) {
            var4 = new class32(arg0, class38.field516, Statics.field371[arg0], 1000000);
        }
        return new class120(var4, Statics.field1202, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ah.ce(B)V")
    public static final void method415() {
        try {
            if (field1939 == 0) {
                if (Statics.field677 != null) {
                    Statics.field677.method394();
                    Statics.field677 = null;
                }
                Statics.field204 = null;
                field1960 = false;
                field1910 = 0;
                field1939 = 1;
            }
            if (field1939 == 1) {
                if (Statics.field204 == null) {
                    Statics.field204 = Statics.field1519.method419(Statics.field44, Statics.field849);
                }
                if (Statics.field204.field500 == 2) {
                    throw new IOException();
                }
                if (Statics.field204.field500 == 1) {
                    Statics.field677 = new class31((Socket) Statics.field204.field501, Statics.field1519);
                    Statics.field204 = null;
                    field1939 = 2;
                }
            }
            if (field1939 == 2) {
                field2176.field1722 = 0;
                field2176.method1558(14);
                Statics.field677.method377(field2176.field1723, 0, 1);
                field1951.field1722 = 0;
                field1939 = 3;
            }
            if (field1939 == 3) {
                if (Statics.field1580 != null) {
                    Statics.field1580.method204();
                }
                if (Statics.field532 != null) {
                    Statics.field532.method204();
                }
                int var0 = Statics.field677.method374();
                if (Statics.field1580 != null) {
                    Statics.field1580.method204();
                }
                if (Statics.field532 != null) {
                    Statics.field532.method204();
                }
                if (var0 != 0) {
                    method875(var0);
                    return;
                }
                field1951.field1722 = 0;
                field1939 = 5;
            }
            if (field1939 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field2176.field1722 = 0;
                field2176.method1558(10);
                field2176.method1561(var1[0]);
                field2176.method1561(var1[1]);
                field2176.method1561(var1[2]);
                field2176.method1561(var1[3]);
                field2176.method1597(0L);
                field2176.method1563(class9.field126);
                field2176.method1606(class2.field13, class2.field12);
                field1924.field1722 = 0;
                if (field2078 == 40) {
                    field1924.method1558(18);
                } else {
                    field1924.method1558(16);
                }
                field1924.method1559(0);
                int var2 = field1924.field1722;
                field1924.method1561(2);
                field1924.method1735(field2176.field1723, 0, field2176.field1722);
                int var3 = field1924.field1722;
                field1924.method1563(class9.field154);
                field1924.method1558(field1912 ? 1 : 0);
                class150 var4 = field1924;
                byte[] var5 = new byte[24];
                try {
                    class38.field508.method139(0L);
                    class38.field508.method146(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var12) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method1735(var5, 0, 24);
                field1924.method1561(Statics.field841.field1171);
                field1924.method1561(Statics.field785.field1171);
                field1924.method1561(Statics.field125.field1171);
                field1924.method1561(Statics.field1738.field1171);
                field1924.method1561(Statics.field795.field1171);
                field1924.method1561(Statics.field1560.field1171);
                field1924.method1561(Statics.field1095.field1171);
                field1924.method1561(Statics.field40.field1171);
                field1924.method1561(Statics.field52.field1171);
                field1924.method1561(Statics.field203.field1171);
                field1924.method1561(Statics.field1727.field1171);
                field1924.method1561(Statics.field1210.field1171);
                field1924.method1561(Statics.field1621.field1171);
                field1924.method1561(Statics.field538.field1171);
                field1924.method1561(Statics.field1126.field1171);
                field1924.method1561(Statics.field1508.field1171);
                field1924.method1587(var1, var3, field1924.field1722);
                field1924.method1567(field1924.field1722 - var2);
                Statics.field677.method377(field1924.field1723, 0, field1924.field1722);
                field2176.method2287(var1);
                for (int var9 = 0; var9 < 4; var9++) {
                    var1[var9] += 50;
                }
                field1951.method2287(var1);
                field1939 = 6;
            }
            if (field1939 == 6 && Statics.field677.method375() > 0) {
                int var10 = Statics.field677.method374();
                if (var10 == 21 && field2078 == 20) {
                    field1939 = 7;
                } else if (var10 == 2) {
                    field1939 = 9;
                } else if (var10 == 15 && field2078 == 40) {
                    method1323();
                    return;
                } else if (var10 == 23 && field1941 < 1) {
                    field1941++;
                    field1939 = 0;
                } else {
                    method875(var10);
                    return;
                }
            }
            if (field1939 == 7 && Statics.field677.method375() > 0) {
                field1942 = (Statics.field677.method374() + 3) * 60;
                field1939 = 8;
            }
            if (field1939 == 8) {
                field1910 = 0;
                class9.method1466(class74.field891, class74.field892, field1942 / 60 + class74.field889);
                if (--field1942 <= 0) {
                    field1939 = 0;
                }
            } else {
                if (field1939 == 9 && Statics.field677.method375() >= 8) {
                    field2169 = Statics.field677.method374();
                    field1969 = Statics.field677.method374() == 1;
                    field2046 = Statics.field677.method374();
                    field2046 <<= 0x8;
                    field2046 += Statics.field677.method374();
                    field1990 = Statics.field677.method374();
                    Statics.field677.method376(field1951.field1723, 0, 1);
                    field1951.field1722 = 0;
                    field2139 = field1951.method2303();
                    Statics.field677.method376(field1951.field1723, 0, 2);
                    field1951.field1722 = 0;
                    field1925 = field1951.method1725();
                    field1939 = 10;
                }
                if (field1939 != 10) {
                    field1910++;
                    if (field1910 > 2000) {
                        if (field1941 < 1) {
                            if (Statics.field849 == Statics.field734) {
                                Statics.field849 = Statics.field119;
                            } else {
                                Statics.field849 = Statics.field734;
                            }
                            field1941++;
                            field1939 = 0;
                        } else {
                            method875(-3);
                        }
                    }
                } else if (Statics.field677.method375() >= field1925) {
                    field1951.field1722 = 0;
                    Statics.field677.method376(field1951.field1723, 0, field1925);
                    method97();
                    Statics.field53 = -1;
                    method465(false);
                    field2139 = -1;
                }
            }
        } catch (IOException var13) {
            if (field1941 < 1) {
                if (Statics.field849 == Statics.field734) {
                    Statics.field849 = Statics.field119;
                } else {
                    Statics.field849 = Statics.field734;
                }
                field1941++;
                field1939 = 0;
            } else {
                method875(-2);
            }
        }
    }

    @ObfuscatedName("e.cu(I)V")
    public static void method97() {
        field1918 = 0L;
        field1921 = 0;
        Statics.field812.field115 = 0;
        Statics.field1476 = true;
        field2007 = true;
        class108.method881();
        field2176.field1722 = 0;
        field1951.field1722 = 0;
        field2139 = -1;
        field1956 = -1;
        field1958 = -1;
        field2140 = -1;
        field1954 = 0;
        field2186 = 0;
        field2107 = 0;
        field2050 = 0;
        field1947 = 0;
        field2064 = false;
        class36.field484 = 0;
        for (int var0 = 0; var0 < 100; var0++) {
            field2137[var0] = null;
        }
        field1999 = 0;
        field2073 = 0;
        field2075 = false;
        field1992 = 0;
        field1979 = (int) (Math.random() * 100.0D) - 50;
        field2022 = (int) (Math.random() * 110.0D) - 55;
        field2135 = (int) (Math.random() * 80.0D) - 40;
        field2047 = (int) (Math.random() * 120.0D) - 60;
        field1988 = (int) (Math.random() * 30.0D) - 20;
        field2002 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field2076 = 0;
        field2151 = -1;
        field2156 = 0;
        field2062 = 0;
        field2038 = 0;
        field2157 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            field2037[var1] = null;
            field2042[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field1946[var2] = null;
        }
        Statics.field1127 = field2037[2047] = new class182();
        field2003.method1279();
        field2055.method1279();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field2052[var3][var4][var5] = null;
                }
            }
        }
        field2053 = new class104();
        field2043 = 0;
        field2031 = 0;
        for (int var6 = 0; var6 < Statics.field687; var6++) {
            class163 var7 = class163.method1762(var6);
            if (var7 != null && var7.field2475 == 0) {
                class89.field1203[var6] = 0;
                class89.field1205[var6] = 0;
            }
        }
        for (int var8 = 0; var8 < field1976.length; var8++) {
            field1976[var8] = -1;
        }
        if (field2079 != -1) {
            class140.method62(field2079);
        }
        for (class123 var9 = (class123) field2080.method1262(); var9 != null; var9 = (class123) field2080.method1266()) {
            method1114(var9, true);
        }
        field2079 = -1;
        field2080 = new class103(8);
        field2083 = null;
        field2064 = false;
        field1947 = 0;
        field1923.method1130((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var10 = 0; var10 < 8; var10++) {
            field2049[var10] = null;
            field2133[var10] = false;
        }
        class126.method541();
        field2011 = true;
        for (int var11 = 0; var11 < 100; var11++) {
            field2125[var11] = true;
        }
        field2149 = null;
        Statics.field735 = 0;
        Statics.field828 = null;
    }

    @ObfuscatedName("de.cn(I)V")
    public static void method1323() {
        field2176.field1722 = 0;
        field1951.field1722 = 0;
        field2139 = -1;
        field1956 = -1;
        field1958 = -1;
        field2140 = -1;
        field1925 = 0;
        field1954 = 0;
        field2186 = 0;
        field1947 = 0;
        field2064 = false;
        field2076 = 0;
        field2156 = 0;
        for (int var0 = 0; var0 < field2037.length; var0++) {
            if (field2037[var0] != null) {
                field2037[var0].field2637 = -1;
            }
        }
        for (int var1 = 0; var1 < field1946.length; var1++) {
            if (field1946[var1] != null) {
                field1946[var1].field2637 = -1;
            }
        }
        class126.method541();
        method882(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field2125[var2] = true;
        }
    }

    @ObfuscatedName("bv.cr(IS)V")
    public static void method875(int arg0) {
        if (arg0 == -3) {
            class9.method1466(class74.field894, class74.field895, class74.field879);
        } else if (arg0 == -2) {
            class9.method1466(class74.field897, class74.field898, class74.field925);
        } else if (arg0 == -1) {
            class9.method1466(class74.field944, class74.field878, class74.field902);
        } else if (arg0 == 3) {
            class9.method1466(class74.field929, class74.field904, class74.field875);
        } else if (arg0 == 4) {
            class9.method1466(class74.field906, class74.field996, class74.field911);
        } else if (arg0 == 5) {
            class9.method1466(class74.field909, class74.field910, class74.field1038);
        } else if (arg0 == 6) {
            class9.method1466(class74.field912, class74.field913, class74.field945);
        } else if (arg0 == 7) {
            class9.method1466(class74.field915, class74.field916, class74.field917);
        } else if (arg0 == 8) {
            class9.method1466(class74.field918, class74.field919, class74.field920);
        } else if (arg0 == 9) {
            class9.method1466(class74.field1072, class74.field922, class74.field923);
        } else if (arg0 == 10) {
            class9.method1466(class74.field914, class74.field978, class74.field926);
        } else if (arg0 == 11) {
            class9.method1466(class74.field927, class74.field928, class74.field1025);
        } else if (arg0 == 12) {
            class9.method1466(class74.field930, class74.field931, class74.field899);
        } else if (arg0 == 13) {
            class9.method1466(class74.field933, class74.field934, class74.field935);
        } else if (arg0 == 14) {
            class9.method1466(class74.field936, class74.field937, class74.field959);
        } else if (arg0 == 16) {
            class9.method1466(class74.field997, class74.field940, class74.field941);
        } else if (arg0 == 17) {
            class9.method1466(class74.field942, class74.field881, class74.field1034);
        } else if (arg0 == 18) {
            class9.method1466(class74.field1009, class74.field946, class74.field947);
        } else if (arg0 == 19) {
            class9.method1466(class74.field948, class74.field949, class74.field950);
        } else if (arg0 == 20) {
            class9.method1466(class74.field951, class74.field866, class74.field953);
        } else if (arg0 == 22) {
            class9.method1466(class74.field954, class74.field955, class74.field888);
        } else if (arg0 == 23) {
            class9.method1466(class74.field957, class74.field932, class74.field1078);
        } else if (arg0 == 24) {
            class9.method1466(class74.field960, class74.field873, class74.field907);
        } else if (arg0 == 25) {
            class9.method1466(class74.field963, class74.field964, class74.field965);
        } else if (arg0 == 26) {
            class9.method1466(class74.field966, class74.field967, class74.field968);
        } else if (arg0 == 27) {
            class9.method1466(class74.field969, class74.field1015, class74.field971);
        } else if (arg0 == 31) {
            class9.method1466(class74.field908, class74.field956, class74.field977);
        } else if (arg0 == 32) {
            class9.method1466(class74.field981, class74.field982, class74.field983);
        } else if (arg0 == 37) {
            class9.method1466(class74.field1035, class74.field1088, class74.field1026);
        } else if (arg0 == 38) {
            class9.method1466(class74.field987, class74.field988, class74.field989);
        } else if (arg0 == 55) {
            class9.method1466(class74.field990, class74.field1000, class74.field1081);
        } else {
            class9.method1466(class74.field993, class74.field994, class74.field995);
        }
        method882(10);
    }

    @ObfuscatedName("co.cw(B)V")
    public static final void method1213() {
        if (Statics.field677 != null) {
            Statics.field677.method394();
            Statics.field677 = null;
        }
        method859();
        Statics.field1155.method549();
        for (int var0 = 0; var0 < 4; var0++) {
            field1970[var0].method1200();
        }
        System.gc();
        class78.method1010(2);
        field2165 = -1;
        field2166 = false;
        class124.method325();
        method882(10);
    }

    @ObfuscatedName("bp.cq(I)V")
    public static final void method859() {
        class158.method8();
        class154.method876();
        class157.field2392.method1221();
        class153.method1208();
        class152.field2267.method1221();
        class152.field2276.method1221();
        class161.field2427.method1221();
        class161.field2447.method1221();
        class161.field2443.method1221();
        class155.field2358.method1221();
        class155.field2370.method1221();
        class156.field2374.method1221();
        class156.field2383.method1221();
        class159.field2410.method1221();
        class163.field2473.method1221();
        class93.field1228.method1221();
        class140.field1773.method1221();
        class140.field1812.method1221();
        class140.field1855.method1221();
        ((class54) Statics.field2540).method730();
        class151.field2259.method1221();
        Statics.field841.method1028();
        Statics.field785.method1028();
        Statics.field1738.method1028();
        Statics.field795.method1028();
        Statics.field1560.method1028();
        Statics.field1095.method1028();
        Statics.field40.method1028();
        Statics.field52.method1028();
        Statics.field203.method1028();
        Statics.field1727.method1028();
        Statics.field1210.method1028();
        Statics.field1621.method1028();
    }

    @ObfuscatedName("bh.ds(I)V")
    public static final void method779() {
        if (field2107 > 0) {
            method1213();
        } else {
            method882(40);
            Statics.field667 = Statics.field677;
            Statics.field677 = null;
        }
    }

    @ObfuscatedName("en.dd(S)V")
    public static final void method1807() {
        if (field2186 > 1) {
            field2186--;
        }
        if (field2107 > 0) {
            field2107--;
        }
        if (field1960) {
            field1960 = false;
            method779();
            return;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field677 == null) {
                var1 = false;
            } else {
                label2615: {
                    try {
                        int var2 = Statics.field677.method375();
                        if (var2 == 0) {
                            var1 = false;
                            break label2615;
                        }
                        if (field2139 == -1) {
                            Statics.field677.method376(field1951.field1723, 0, 1);
                            field1951.field1722 = 0;
                            field2139 = field1951.method2303();
                            field1925 = class95.field1357[field2139];
                            var2--;
                        }
                        if (field1925 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2615;
                            }
                            Statics.field677.method376(field1951.field1723, 0, 1);
                            field1925 = field1951.field1723[0] & 0xFF;
                            var2--;
                        }
                        if (field1925 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2615;
                            }
                            Statics.field677.method376(field1951.field1723, 0, 2);
                            field1951.field1722 = 0;
                            field1925 = field1951.method1725();
                            var2 -= 2;
                        }
                        if (var2 < field1925) {
                            var1 = false;
                            break label2615;
                        }
                        field1951.field1722 = 0;
                        Statics.field677.method376(field1951.field1723, 0, field1925);
                        field1954 = 0;
                        field2140 = field1958;
                        field1958 = field1956;
                        field1956 = field2139;
                        if (field2139 == 104) {
                            byte var3 = field1951.method1599();
                            int var4 = field1951.method1726();
                            class89.field1203[var4] = var3;
                            if (class89.field1205[var4] != var3) {
                                class89.field1205[var4] = var3;
                                method1804(var4);
                            }
                            field2105[++field2106 - 1 & 0x1F] = var4;
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 253) {
                            int var5 = field1951.method1604();
                            int var6 = field1951.method1614();
                            class140 var7 = class140.method53(var6);
                            if (var7.field1810 != 1 || var7.field1811 != var5) {
                                var7.field1810 = 1;
                                var7.field1811 = var5;
                                method968(var7);
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 246) {
                            field2043 = 1;
                            field2112 = field2102;
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 149) {
                            int var8 = field1951.method1612();
                            int var9 = field1951.method1726();
                            class89.field1203[var9] = var8;
                            if (class89.field1205[var9] != var8) {
                                class89.field1205[var9] = var8;
                                method1804(var9);
                            }
                            field2105[++field2106 - 1 & 0x1F] = var9;
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 46) {
                            method693();
                            field2084 = field1951.method1571();
                            field2114 = field2102;
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 157) {
                            int var10 = field1951.method1605();
                            if (var10 == 65535) {
                                var10 = -1;
                            }
                            int var11 = field1951.method1613();
                            int var12 = field1951.method1616();
                            class140 var13 = class140.method53(var11);
                            if (var13.field1777) {
                                var13.field1783 = var10;
                                var13.field1886 = var12;
                                class161 var15 = class161.method2496(var10);
                                var13.field1802 = var15.field2463;
                                var13.field1798 = var15.field2439;
                                var13.field1792 = var15.field2440;
                                var13.field1858 = var15.field2441;
                                var13.field1817 = var15.field2442;
                                var13.field1841 = var15.field2450;
                                if (var13.field1791 > 0) {
                                    var13.field1841 = var13.field1841 * 32 / var13.field1791;
                                }
                                method968(var13);
                            } else {
                                if (var10 == -1) {
                                    var13.field1810 = 0;
                                    field2139 = -1;
                                    var1 = true;
                                    break label2615;
                                }
                                class161 var14 = class161.method2496(var10);
                                var13.field1810 = 4;
                                var13.field1811 = var10;
                                var13.field1802 = var14.field2463;
                                var13.field1798 = var14.field2439;
                                var13.field1841 = var14.field2450 * 100 / var12;
                                method968(var13);
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 138) {
                            Statics.field1615 = field1951.method1596();
                            Statics.field2485 = field1951.method1668();
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 122) {
                            for (int var16 = 0; var16 < Statics.field687; var16++) {
                                class163 var17 = class163.method1762(var16);
                                if (var17 != null && var17.field2475 == 0) {
                                    class89.field1203[var16] = 0;
                                    class89.field1205[var16] = 0;
                                }
                            }
                            method693();
                            field2106 += 32;
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 136) {
                            int var18 = field1951.method1596();
                            int var19 = field1951.method1596();
                            int var20 = field1951.method1629();
                            Statics.field1622 = var20 >> 1;
                            Statics.field1127.method2897(var18, var19, (var20 & 0x1) == 1);
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 63) {
                            method356();
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 197) {
                            int var21 = field1951.method1605();
                            if (var21 == 65535) {
                                var21 = -1;
                            }
                            if (var21 == -1 && !field2166) {
                                Statics.field1110.method2263();
                                class78.field1109 = 1;
                                Statics.field1106 = null;
                            } else if (var21 != -1 && field2165 != var21 && field2164 != 0 && !field2166) {
                                class78.method2641(2, Statics.field1095, var21, 0, field2164, false);
                            }
                            field2165 = var21;
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 206) {
                            int var22 = field1951.method1604();
                            if (var22 == 65535) {
                                var22 = -1;
                            }
                            int var23 = field1951.method1695();
                            method112(var22, var23);
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 194) {
                            method465(false);
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 14) {
                            String var24 = field1951.method1716();
                            class150 var25 = field1951;
                            String var29;
                            try {
                                int var26 = var25.method1603();
                                if (var26 > 32767) {
                                    var26 = 32767;
                                }
                                byte[] var27 = new byte[var26];
                                var25.field1722 += Statics.field1507.method773(var25.field1723, var25.field1722, var27, 0, var26);
                                String var28 = Statics.method9(var27, 0, var26);
                                var29 = var28;
                            } catch (Exception var408) {
                                var29 = "Cabbage";
                            }
                            String var32 = class173.method2806(class82.method45(var29));
                            method701(6, var24, var32);
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 191) {
                            int var33 = field1951.method1613();
                            int var34 = field1951.method1687();
                            class140 var35 = class140.method53(var33);
                            if (var35.field1816 != var34 || var34 == -1) {
                                var35.field1816 = var34;
                                var35.field1876 = 0;
                                var35.field1885 = 0;
                                method968(var35);
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 200) {
                            String var36 = field1951.method1716();
                            int var37 = field1951.method1629();
                            int var38 = field1951.method1668();
                            if (var38 >= 1 && var38 <= 8) {
                                if (var36.equalsIgnoreCase("null")) {
                                    var36 = null;
                                }
                                field2049[var38 - 1] = var36;
                                field2133[var38 - 1] = var37 == 0;
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 159) {
                            int var39 = field1951.method1725();
                            int var40 = field1951.method1614();
                            int var41 = field1951.method1725();
                            class140 var42 = class140.method53(var40);
                            var42.field1822 = (var39 << 16) + var41;
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 146 || field2139 == 186 || field2139 == 7 || field2139 == 57 || field2139 == 173 || field2139 == 207 || field2139 == 209 || field2139 == 126 || field2139 == 11 || field2139 == 125 || field2139 == 205) {
                            method1011();
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 150) {
                            field1951.field1722 += 28;
                            if (field1951.method1697()) {
                                class38.method44(field1951, field1951.field1722 - 28);
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 4) {
                            int var43 = field1951.method1725();
                            int var44 = field1951.method1571();
                            int var45 = field1951.method1725();
                            if (field2168 != 0 && var44 != 0 && field1992 < 50) {
                                field2172[field1992] = var43;
                                field2095[field1992] = var44;
                                field1989[field1992] = var45;
                                field1931[field1992] = null;
                                field2017[field1992] = 0;
                                field1992++;
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 234) {
                            field2156 = 0;
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 117) {
                            while (field1951.field1722 < field1925) {
                                boolean var49 = field1951.method1571() == 1;
                                String var50 = field1951.method1716();
                                String var51 = field1951.method1716();
                                int var52 = field1951.method1725();
                                int var53 = field1951.method1571();
                                int var54 = field1951.method1571();
                                boolean var55 = (var54 & 0x2) != 0;
                                boolean var56 = (var54 & 0x1) != 0;
                                if (var52 > 0) {
                                    field1951.method1716();
                                    field1951.method1571();
                                    field1951.method1616();
                                }
                                field1951.method1716();
                                for (int var57 = 0; var57 < field2031; var57++) {
                                    class10 var58 = field2188[var57];
                                    if (var49) {
                                        if (var51.equals(var58.field172)) {
                                            var58.field172 = var50;
                                            var58.field169 = var51;
                                            var50 = null;
                                            break;
                                        }
                                    } else if (var50.equals(var58.field172)) {
                                        if (var58.field171 != var52) {
                                            boolean var59 = true;
                                            for (class121 var60 = (class121) field1916.method1251(); var60 != null; var60 = (class121) field1916.method1253()) {
                                                if (var60.field1576.equals(var50)) {
                                                    if (var52 != 0 && var60.field1577 == 0) {
                                                        var60.method1306();
                                                        var59 = false;
                                                    } else if (var52 == 0 && var60.field1577 != 0) {
                                                        var60.method1306();
                                                        var59 = false;
                                                    }
                                                }
                                            }
                                            if (var59) {
                                                field1916.method1257(new class121(var50, var52));
                                            }
                                            var58.field171 = var52;
                                        }
                                        var58.field169 = var51;
                                        var58.field170 = var53;
                                        var58.field173 = var55;
                                        var58.field174 = var56;
                                        var50 = null;
                                        break;
                                    }
                                }
                                if (var50 != null && field2031 < 200) {
                                    class10 var61 = new class10();
                                    field2188[field2031] = var61;
                                    var61.field172 = var50;
                                    var61.field169 = var51;
                                    var61.field171 = var52;
                                    var61.field170 = var53;
                                    var61.field173 = var55;
                                    var61.field174 = var56;
                                    field2031++;
                                }
                            }
                            field2043 = 2;
                            field2112 = field2102;
                            boolean var62 = false;
                            int var63 = field2031;
                            while (var63 > 0) {
                                boolean var64 = true;
                                var63--;
                                for (int var65 = 0; var65 < var63; var65++) {
                                    boolean var66 = false;
                                    class10 var67 = field2188[var65];
                                    class10 var68 = field2188[var65 + 1];
                                    if (field2010 != var67.field171 && field2010 == var68.field171) {
                                        var66 = true;
                                    }
                                    if (!var66 && var67.field171 == 0 && var68.field171 != 0) {
                                        var66 = true;
                                    }
                                    if (!var66 && !var67.field173 && var68.field173) {
                                        var66 = true;
                                    }
                                    if (!var66 && !var67.field174 && var68.field174) {
                                        var66 = true;
                                    }
                                    if (var66) {
                                        class10 var69 = field2188[var65];
                                        field2188[var65] = field2188[var65 + 1];
                                        field2188[var65 + 1] = var69;
                                        var64 = false;
                                    }
                                }
                                if (var64) {
                                    break;
                                }
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 69) {
                            int var70 = field1951.method1613();
                            int var71 = field1951.method1605();
                            class140 var72 = class140.method53(var70);
                            if (var72.field1810 != 2 || var72.field1811 != var71) {
                                var72.field1810 = 2;
                                var72.field1811 = var71;
                                method968(var72);
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 21) {
                            int var73 = field1951.method1612();
                            class140 var74 = class140.method53(var73);
                            var74.field1810 = 3;
                            var74.field1811 = Statics.field1127.field2792.method1133();
                            method968(var74);
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 116) {
                            for (int var75 = 0; var75 < class89.field1205.length; var75++) {
                                if (class89.field1205[var75] != class89.field1203[var75]) {
                                    class89.field1205[var75] = class89.field1203[var75];
                                    method1804(var75);
                                    field2105[++field2106 - 1 & 0x1F] = var75;
                                }
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 148) {
                            int var76 = field1951.method1613();
                            int var77 = field1951.method1725();
                            if (var77 == 65535) {
                                var77 = -1;
                            }
                            int var78 = field1951.method1613();
                            int var79 = field1951.method1605();
                            if (var79 == 65535) {
                                var79 = -1;
                            }
                            for (int var80 = var77; var80 <= var79; var80++) {
                                long var81 = ((long) var78 << 32) + (long) var80;
                                class106 var83 = field2121.method1259(var81);
                                if (var83 != null) {
                                    var83.method1307();
                                }
                                field2121.method1265(new class141(var76), var81);
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 254) {
                            int var84 = field1951.method1571();
                            int var85 = field1951.method1571();
                            int var86 = field1951.method1571();
                            int var87 = field1951.method1571();
                            field2054[var84] = true;
                            field2181[var84] = var85;
                            field2182[var84] = var86;
                            field2034[var84] = var87;
                            field2184[var84] = 0;
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 54) {
                            int var88 = field1951.method1614();
                            Statics.field1573 = Statics.field1519.method421(var88);
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 76) {
                            String var89 = field1951.method1716();
                            long var90 = (long) field1951.method1725();
                            long var92 = (long) field1951.method1575();
                            int var94 = field1951.method1571();
                            long var95 = (var90 << 32) + var92;
                            boolean var97 = false;
                            for (int var98 = 0; var98 < 100; var98++) {
                                if (field2143[var98] == var95) {
                                    var97 = true;
                                    break;
                                }
                            }
                            if (method511(var89)) {
                                var97 = true;
                            }
                            if (!var97 && field2118 == 0) {
                                field2143[field2144] = var95;
                                field2144 = (field2144 + 1) % 100;
                                class150 var99 = field1951;
                                String var103;
                                try {
                                    int var100 = var99.method1603();
                                    if (var100 > 32767) {
                                        var100 = 32767;
                                    }
                                    byte[] var101 = new byte[var100];
                                    var99.field1722 += Statics.field1507.method773(var99.field1723, var99.field1722, var101, 0, var100);
                                    String var102 = Statics.method9(var101, 0, var100);
                                    var103 = var102;
                                } catch (Exception var407) {
                                    var103 = "Cabbage";
                                }
                                String var106 = class173.method2806(class82.method45(var103));
                                if (var94 == 2 || var94 == 3) {
                                    method701(7, Statics.method1420(1) + var89, var106);
                                } else if (var94 == 1) {
                                    method701(7, Statics.method1420(0) + var89, var106);
                                } else {
                                    method701(3, var89, var106);
                                }
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 106) {
                            Statics.field1598 = Statics.method855(field1951.method1571());
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 27) {
                            int var107 = field1951.method1726();
                            int var108 = field1951.method1668();
                            int var109 = field1951.method1612();
                            class123 var110 = (class123) field2080.method1259((long) var109);
                            if (var110 != null) {
                                method1114(var110, var110.field1595 != var107);
                            }
                            method1760(var109, var107, var108);
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 55) {
                            int var111 = field1951.method1614();
                            String var112 = field1951.method1716();
                            class140 var113 = class140.method53(var111);
                            if (!var112.equals(var113.field1825)) {
                                var113.field1825 = var112;
                                method968(var113);
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 168) {
                            field2177 = true;
                            Statics.field9 = field1951.method1571();
                            Statics.field1478 = field1951.method1571();
                            Statics.field842 = field1951.method1725();
                            Statics.field1554 = field1951.method1571();
                            Statics.field744 = field1951.method1571();
                            if (Statics.field744 >= 100) {
                                Statics.field1208 = Statics.field9 * 128 + 64;
                                Statics.field479 = Statics.field1478 * 128 + 64;
                                Statics.field345 = method788(Statics.field1208, Statics.field479, Statics.field1622) - Statics.field842;
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 161) {
                            Statics.field2485 = field1951.method1596();
                            Statics.field1615 = field1951.method1629();
                            while (field1951.field1722 < field1925) {
                                field2139 = field1951.method1571();
                                method1011();
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 114) {
                            Statics.field2485 = field1951.method1668();
                            Statics.field1615 = field1951.method1571();
                            for (int var114 = Statics.field2485; var114 < Statics.field2485 + 8; var114++) {
                                for (int var115 = Statics.field1615; var115 < Statics.field1615 + 8; var115++) {
                                    if (field2052[Statics.field1622][var114][var115] != null) {
                                        field2052[Statics.field1622][var114][var115] = null;
                                        method1008(var114, var115);
                                    }
                                }
                            }
                            for (class127 var116 = (class127) field2053.method1305(); var116 != null; var116 = (class127) field2053.method1287()) {
                                if (var116.field1628 >= Statics.field2485 && var116.field1628 < Statics.field2485 + 8 && var116.field1629 >= Statics.field1615 && var116.field1629 < Statics.field1615 + 8 && Statics.field1622 == var116.field1637) {
                                    var116.field1626 = 0;
                                }
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 215) {
                            method693();
                            field2085 = field1951.method1687();
                            field2114 = field2102;
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 183) {
                            String var117 = field1951.method1716();
                            long var118 = field1951.method1577();
                            long var120 = (long) field1951.method1725();
                            long var122 = (long) field1951.method1575();
                            int var124 = field1951.method1571();
                            long var125 = (var120 << 32) + var122;
                            boolean var127 = false;
                            for (int var128 = 0; var128 < 100; var128++) {
                                if (field2143[var128] == var125) {
                                    var127 = true;
                                    break;
                                }
                            }
                            if (var124 <= 1 && method511(var117)) {
                                var127 = true;
                            }
                            if (!var127 && field2118 == 0) {
                                field2143[field2144] = var125;
                                field2144 = (field2144 + 1) % 100;
                                class150 var129 = field1951;
                                String var133;
                                try {
                                    int var130 = var129.method1603();
                                    if (var130 > 32767) {
                                        var130 = 32767;
                                    }
                                    byte[] var131 = new byte[var130];
                                    var129.field1722 += Statics.field1507.method773(var129.field1723, var129.field1722, var131, 0, var130);
                                    String var132 = Statics.method9(var131, 0, var130);
                                    var133 = var132;
                                } catch (Exception var406) {
                                    var133 = "Cabbage";
                                }
                                String var136 = class173.method2806(class82.method45(var133));
                                if (var124 == 2 || var124 == 3) {
                                    method301(9, Statics.method1420(1) + var117, var136, class81.method856(var118));
                                } else if (var124 == 1) {
                                    method301(9, Statics.method1420(0) + var117, var136, class81.method856(var118));
                                } else {
                                    method301(9, var117, var136, class81.method856(var118));
                                }
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 51) {
                            int var137 = field1951.method1616();
                            int var138 = field1951.method1605();
                            class140 var139 = class140.method53(var137);
                            if (var139 != null && var139.field1780 == 0) {
                                if (var138 > var139.field1794 - var139.field1788) {
                                    var138 = var139.field1794 - var139.field1788;
                                }
                                if (var138 < 0) {
                                    var138 = 0;
                                }
                                if (var139.field1774 != var138) {
                                    var139.field1774 = var138;
                                    method968(var139);
                                }
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 89) {
                            if (field2079 != -1) {
                                int var140 = field2079;
                                if (class140.method1094(var140)) {
                                    method873(Statics.field806[var140], 0);
                                }
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 249) {
                            field2093 = field1951.method1571();
                            field2141 = field1951.method1571();
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 230) {
                            boolean var141 = field1951.method1629() == 1;
                            int var142 = field1951.method1612();
                            class140 var143 = class140.method53(var142);
                            if (var143.field1790 != var141) {
                                var143.field1790 = var141;
                                method968(var143);
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 152) {
                            method693();
                            int var144 = field1951.method1596();
                            int var145 = field1951.method1571();
                            int var146 = field1951.method1614();
                            field2035[var145] = var146;
                            field2056[var145] = var144;
                            field2057[var145] = 1;
                            for (int var147 = 0; var147 < 98; var147++) {
                                if (var146 >= class70.field827[var147]) {
                                    field2057[var145] = var147 + 2;
                                }
                            }
                            field2109[++field2110 - 1 & 0x1F] = var145;
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 28) {
                            int var148 = field1951.method1616();
                            int var149 = field1951.method1725();
                            if (var148 < -70000) {
                                var149 += 32768;
                            }
                            class140 var150;
                            if (var148 >= 0) {
                                var150 = class140.method53(var148);
                            } else {
                                var150 = null;
                            }
                            if (var150 != null) {
                                for (int var151 = 0; var151 < var150.field1880.length; var151++) {
                                    var150.field1880[var151] = 0;
                                    var150.field1881[var151] = 0;
                                }
                            }
                            class126.method695(var149);
                            int var152 = field1951.method1725();
                            for (int var153 = 0; var153 < var152; var153++) {
                                int var154 = field1951.method1726();
                                int var155 = field1951.method1668();
                                if (var155 == 255) {
                                    var155 = field1951.method1616();
                                }
                                if (var150 != null && var153 < var150.field1880.length) {
                                    var150.field1880[var153] = var154;
                                    var150.field1881[var153] = var155;
                                }
                                class126.method508(var149, var153, var154 - 1, var155);
                            }
                            if (var150 != null) {
                                method968(var150);
                            }
                            method693();
                            field2094[++field2138 - 1 & 0x1F] = var149 & 0x7FFF;
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 216) {
                            int var156 = field1951.method1612();
                            int var157 = field1951.method1687();
                            int var158 = field1951.method1607();
                            class140 var159 = class140.method53(var156);
                            int var160 = var159.field1785 + var157;
                            int var161 = var159.field1786 + var158;
                            if (var159.field1769 != var160 || var159.field1784 != var161) {
                                var159.field1769 = var160;
                                var159.field1784 = var161;
                                method968(var159);
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 251) {
                            String var162 = field1951.method1716();
                            if (var162.endsWith(":tradereq:")) {
                                String var163 = class83.method1463(var162.substring(0, var162.indexOf(":")), Statics.field359);
                                boolean var164 = false;
                                if (method511(var163)) {
                                    var164 = true;
                                }
                                if (!var164 && field2118 == 0) {
                                    method701(4, var163, class74.field1017);
                                }
                            } else if (var162.endsWith(":duelreq:")) {
                                String var165 = class83.method1463(var162.substring(0, var162.indexOf(":")), Statics.field359);
                                boolean var166 = false;
                                if (method511(var165)) {
                                    var166 = true;
                                }
                                if (!var166 && field2118 == 0) {
                                    method701(8, var165, class74.field871);
                                }
                            } else if (var162.endsWith(":chalreq:")) {
                                String var167 = class83.method1463(var162.substring(0, var162.indexOf(":")), Statics.field359);
                                boolean var168 = false;
                                if (method511(var167)) {
                                    var168 = true;
                                }
                                if (!var168 && field2118 == 0) {
                                    String var169 = var162.substring(var162.indexOf(":") + 1, var162.length() - 9);
                                    method701(8, var167, var169);
                                }
                            } else if (var162.endsWith(":assistreq:")) {
                                String var170 = class83.method1463(var162.substring(0, var162.indexOf(":")), Statics.field359);
                                boolean var171 = false;
                                if (method511(var170)) {
                                    var171 = true;
                                }
                                if (!var171 && field2118 == 0) {
                                    method701(10, var170, "");
                                }
                            } else if (var162.endsWith(":clan:")) {
                                String var172 = var162.substring(0, var162.indexOf(":clan:"));
                                method701(11, "", var172);
                            } else if (var162.endsWith(":trade:")) {
                                String var173 = var162.substring(0, var162.indexOf(":trade:"));
                                if (field2118 == 0) {
                                    method701(12, "", var173);
                                }
                            } else if (var162.endsWith(":assist:")) {
                                String var174 = var162.substring(0, var162.indexOf(":assist:"));
                                if (field2118 == 0) {
                                    method701(13, "", var174);
                                }
                            } else {
                                method701(0, "", var162);
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 91) {
                            int var175 = field1951.method1612();
                            int var176 = field1951.method1604();
                            int var177 = var176 >> 10 & 0x1F;
                            int var178 = var176 >> 5 & 0x1F;
                            int var179 = var176 & 0x1F;
                            int var180 = (var179 << 3) + (var177 << 19) + (var178 << 11);
                            class140 var181 = class140.method53(var175);
                            if (var181.field1795 != var180) {
                                var181.field1795 = var180;
                                method968(var181);
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 45) {
                            field2186 = field1951.method1725() * 30;
                            field2114 = field2102;
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 19) {
                            int var182 = field1951.method1616();
                            class140 var183 = class140.method53(var182);
                            for (int var184 = 0; var184 < var183.field1880.length; var184++) {
                                var183.field1880[var184] = -1;
                                var183.field1880[var184] = 0;
                            }
                            method968(var183);
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 64) {
                            method465(true);
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 143) {
                            field2050 = field1951.method1571();
                            if (field2050 == 1) {
                                field2090 = field1951.method1725();
                            }
                            if (field2050 >= 2 && field2050 <= 6) {
                                if (field2050 == 2) {
                                    field2087 = 64;
                                    field1932 = 64;
                                }
                                if (field2050 == 3) {
                                    field2087 = 0;
                                    field1932 = 64;
                                }
                                if (field2050 == 4) {
                                    field2087 = 128;
                                    field1932 = 64;
                                }
                                if (field2050 == 5) {
                                    field2087 = 64;
                                    field1932 = 0;
                                }
                                if (field2050 == 6) {
                                    field2087 = 64;
                                    field1932 = 128;
                                }
                                field2050 = 2;
                                field1928 = field1951.method1725();
                                field1929 = field1951.method1725();
                                field1930 = field1951.method1571();
                            }
                            if (field2050 == 10) {
                                field1927 = field1951.method1725();
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 42) {
                            String var185 = field1951.method1716();
                            int var186 = field1951.method1725();
                            byte var187 = field1951.method1572();
                            boolean var188 = false;
                            if (var187 == -128) {
                                var188 = true;
                            }
                            if (var188) {
                                if (Statics.field735 == 0) {
                                    field2139 = -1;
                                    var1 = true;
                                    break label2615;
                                }
                                boolean var189 = false;
                                int var190;
                                for (var190 = 0; var190 < Statics.field735 && (!Statics.field828[var190].field1620.equals(var185) || Statics.field828[var190].field1618 != var186); var190++) {
                                }
                                if (var190 < Statics.field735) {
                                    while (var190 < Statics.field735 - 1) {
                                        Statics.field828[var190] = Statics.field828[var190 + 1];
                                        var190++;
                                    }
                                    Statics.field735--;
                                    Statics.field828[Statics.field735] = null;
                                }
                            } else {
                                field1951.method1716();
                                class125 var191 = new class125();
                                var191.field1620 = var185;
                                var191.field1617 = class83.method1463(var191.field1620, Statics.field359);
                                var191.field1618 = var186;
                                var191.field1619 = var187;
                                int var192;
                                for (var192 = Statics.field735 - 1; var192 >= 0; var192--) {
                                    int var193 = Statics.field828[var192].field1617.compareTo(var191.field1620);
                                    if (var193 == 0) {
                                        Statics.field828[var192].field1618 = var186;
                                        Statics.field828[var192].field1619 = var187;
                                        if (var185.equals(Statics.field1127.field2797)) {
                                            Statics.field531 = var187;
                                        }
                                        field2113 = field2102;
                                        field2139 = -1;
                                        var1 = true;
                                        break label2615;
                                    }
                                    if (var193 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field735 >= Statics.field828.length) {
                                    field2139 = -1;
                                    var1 = true;
                                    break label2615;
                                }
                                for (int var194 = Statics.field735 - 1; var194 > var192; var194--) {
                                    Statics.field828[var194 + 1] = Statics.field828[var194];
                                }
                                if (Statics.field735 == 0) {
                                    Statics.field828 = new class125[100];
                                }
                                Statics.field828[var192 + 1] = var191;
                                Statics.field735++;
                                if (var185.equals(Statics.field1127.field2797)) {
                                    Statics.field531 = var187;
                                }
                            }
                            field2113 = field2102;
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 58) {
                            int var195 = field1951.method1616();
                            int var196 = field1951.method1725();
                            if (var195 < -70000) {
                                var196 += 32768;
                            }
                            class140 var197;
                            if (var195 >= 0) {
                                var197 = class140.method53(var195);
                            } else {
                                var197 = null;
                            }
                            while (field1951.field1722 < field1925) {
                                int var198 = field1951.method1603();
                                int var199 = field1951.method1725();
                                int var200 = 0;
                                if (var199 != 0) {
                                    var200 = field1951.method1571();
                                    if (var200 == 255) {
                                        var200 = field1951.method1616();
                                    }
                                }
                                if (var197 != null && var198 >= 0 && var198 < var197.field1880.length) {
                                    var197.field1880[var198] = var199;
                                    var197.field1881[var198] = var200;
                                }
                                class126.method508(var196, var198, var199 - 1, var200);
                            }
                            if (var197 != null) {
                                method968(var197);
                            }
                            method693();
                            field2094[++field2138 - 1 & 0x1F] = var196 & 0x7FFF;
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 102) {
                            for (int var201 = 0; var201 < field2037.length; var201++) {
                                if (field2037[var201] != null) {
                                    field2037[var201].field2643 = -1;
                                }
                            }
                            for (int var202 = 0; var202 < field1946.length; var202++) {
                                if (field1946[var202] != null) {
                                    field1946[var202].field2643 = -1;
                                }
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 25) {
                            while (field1951.field1722 < field1925) {
                                int var203 = field1951.method1571();
                                boolean var204 = (var203 & 0x1) == 1;
                                String var205 = field1951.method1716();
                                String var206 = field1951.method1716();
                                field1951.method1716();
                                for (int var207 = 0; var207 < field2190; var207++) {
                                    class4 var208 = field1986[var207];
                                    if (var204) {
                                        if (var206.equals(var208.field43)) {
                                            var208.field43 = var205;
                                            var208.field42 = var206;
                                            var205 = null;
                                            break;
                                        }
                                    } else if (var205.equals(var208.field43)) {
                                        var208.field43 = var205;
                                        var208.field42 = var206;
                                        var205 = null;
                                        break;
                                    }
                                }
                                if (var205 != null && field2190 < 100) {
                                    class4 var209 = new class4();
                                    field1986[field2190] = var209;
                                    var209.field43 = var205;
                                    var209.field42 = var206;
                                    field2190++;
                                }
                            }
                            field2112 = field2102;
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 109) {
                            int var210 = field1925 + field1951.field1722;
                            int var211 = field1951.method1725();
                            int var212 = field1951.method1725();
                            if (field2079 != var211) {
                                field2079 = var211;
                                method985(field2079);
                                class12.method884(field2079);
                                for (int var213 = 0; var213 < 100; var213++) {
                                    field2125[var213] = true;
                                }
                            }
                            while (var212-- > 0) {
                                int var214 = field1951.method1616();
                                int var215 = field1951.method1725();
                                int var216 = field1951.method1571();
                                class123 var217 = (class123) field2080.method1259((long) var214);
                                if (var217 != null && var217.field1595 != var215) {
                                    method1114(var217, true);
                                    var217 = null;
                                }
                                if (var217 == null) {
                                    var217 = method1760(var214, var215, var216);
                                }
                                var217.field1597 = true;
                            }
                            for (class123 var218 = (class123) field2080.method1262(); var218 != null; var218 = (class123) field2080.method1266()) {
                                if (var218.field1597) {
                                    var218.field1597 = false;
                                } else {
                                    method1114(var218, true);
                                }
                            }
                            field2121 = new class103(512);
                            while (field1951.field1722 < var210) {
                                int var219 = field1951.method1616();
                                int var220 = field1951.method1725();
                                int var221 = field1951.method1725();
                                int var222 = field1951.method1616();
                                for (int var223 = var220; var223 <= var221; var223++) {
                                    long var224 = ((long) var219 << 32) + (long) var223;
                                    field2121.method1265(new class141(var222), var224);
                                }
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 80) {
                            field2177 = true;
                            Statics.field2178 = field1951.method1571();
                            Statics.field185 = field1951.method1571();
                            Statics.field1144 = field1951.method1725();
                            Statics.field822 = field1951.method1571();
                            Statics.field346 = field1951.method1571();
                            if (Statics.field346 >= 100) {
                                int var226 = Statics.field2178 * 128 + 64;
                                int var227 = Statics.field185 * 128 + 64;
                                int var228 = method788(var226, var227, Statics.field1622) - Statics.field1144;
                                int var229 = var226 - Statics.field1208;
                                int var230 = var228 - Statics.field345;
                                int var231 = var227 - Statics.field479;
                                int var232 = (int) Math.sqrt((double) (var229 * var229 + var231 * var231));
                                Statics.field543 = (int) (Math.atan2((double) var230, (double) var232) * 325.949D) & 0x7FF;
                                Statics.field523 = (int) (Math.atan2((double) var229, (double) var231) * -325.949D) & 0x7FF;
                                if (Statics.field543 < 128) {
                                    Statics.field543 = 128;
                                }
                                if (Statics.field543 > 383) {
                                    Statics.field543 = 383;
                                }
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 107) {
                            int var233 = field1951.method1725();
                            field2079 = var233;
                            method985(var233);
                            class12.method884(field2079);
                            for (int var234 = 0; var234 < 100; var234++) {
                                field2125[var234] = true;
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 100) {
                            int var235 = field1951.method1614();
                            int var236 = field1951.method1605();
                            int var237 = field1951.method1605();
                            int var238 = field1951.method1726();
                            class140 var239 = class140.method53(var235);
                            if (var239.field1802 != var238 || var239.field1798 != var236 || var239.field1841 != var237) {
                                var239.field1802 = var238;
                                var239.field1798 = var236;
                                var239.field1841 = var237;
                                method968(var239);
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 120) {
                            class150 var240 = field1951;
                            int var241 = field1925;
                            class144 var242 = new class144();
                            var242.field1900 = var240.method1571();
                            var242.field1901 = var240.method1616();
                            var242.field1906 = new int[var242.field1900];
                            var242.field1903 = new int[var242.field1900];
                            var242.field1902 = new Field[var242.field1900];
                            var242.field1904 = new int[var242.field1900];
                            var242.field1905 = new Method[var242.field1900];
                            var242.field1899 = new byte[var242.field1900][][];
                            for (int var243 = 0; var243 < var242.field1900; var243++) {
                                try {
                                    int var244 = var240.method1571();
                                    if (var244 == 0 || var244 == 1 || var244 == 2) {
                                        String var245 = new String(var240.method1716());
                                        String var246 = new String(var240.method1716());
                                        int var247 = 0;
                                        if (var244 == 1) {
                                            var247 = var240.method1616();
                                        }
                                        var242.field1906[var243] = var244;
                                        var242.field1904[var243] = var247;
                                        var242.field1902[var243] = Statics.method1001(var245).getDeclaredField(var246);
                                    } else if (var244 == 3 || var244 == 4) {
                                        String var248 = new String(var240.method1716());
                                        String var249 = new String(var240.method1716());
                                        int var250 = var240.method1571();
                                        String[] var251 = new String[var250];
                                        for (int var252 = 0; var252 < var250; var252++) {
                                            var251[var252] = new String(var240.method1716());
                                        }
                                        byte[][] var253 = new byte[var250][];
                                        if (var244 == 3) {
                                            for (int var254 = 0; var254 < var250; var254++) {
                                                int var255 = var240.method1616();
                                                var253[var254] = new byte[var255];
                                                var240.method1582(var253[var254], 0, var255);
                                            }
                                        }
                                        var242.field1906[var243] = var244;
                                        Class[] var256 = new Class[var250];
                                        for (int var257 = 0; var257 < var250; var257++) {
                                            var256[var257] = Statics.method1001(var251[var257]);
                                        }
                                        var242.field1905[var243] = Statics.method1001(var248).getDeclaredMethod(var249, var256);
                                        var242.field1899[var243] = var253;
                                    }
                                } catch (ClassNotFoundException var410) {
                                    var242.field1903[var243] = -1;
                                } catch (SecurityException var411) {
                                    var242.field1903[var243] = -2;
                                } catch (NullPointerException var412) {
                                    var242.field1903[var243] = -3;
                                } catch (Exception var413) {
                                    var242.field1903[var243] = -4;
                                } catch (Throwable var414) {
                                    var242.field1903[var243] = -5;
                                }
                            }
                            class108.field1504.method1284(var242);
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 6) {
                            int var263 = field1951.method1726();
                            class126 var264 = (class126) class126.field1624.method1259((long) var263);
                            if (var264 != null) {
                                var264.method1307();
                            }
                            field2094[++field2138 - 1 & 0x1F] = var263 & 0x7FFF;
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 81) {
                            method1213();
                            field2139 = -1;
                            var1 = false;
                            break label2615;
                        }
                        if (field2139 == 177) {
                            field2177 = false;
                            for (int var265 = 0; var265 < 5; var265++) {
                                field2054[var265] = false;
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 53) {
                            field2045 = 0;
                            field2040 = 0;
                            field1951.method2294();
                            int var266 = field1951.method2290(8);
                            if (var266 < field2157) {
                                for (int var267 = var266; var267 < field2157; var267++) {
                                    field2000[++field2045 - 1] = field1948[var267];
                                }
                            }
                            if (var266 > field2157) {
                                throw new RuntimeException("");
                            }
                            field2157 = 0;
                            for (int var268 = 0; var268 < var266; var268++) {
                                int var269 = field1948[var268];
                                class183 var270 = field1946[var269];
                                int var271 = field1951.method2290(1);
                                if (var271 == 0) {
                                    field1948[++field2157 - 1] = var269;
                                    var270.field2660 = field1917;
                                } else {
                                    int var272 = field1951.method2290(2);
                                    if (var272 == 0) {
                                        field1948[++field2157 - 1] = var269;
                                        var270.field2660 = field1917;
                                        field2041[++field2040 - 1] = var269;
                                    } else if (var272 == 1) {
                                        field1948[++field2157 - 1] = var269;
                                        var270.field2660 = field1917;
                                        int var273 = field1951.method2290(3);
                                        var270.method2896(var273, false);
                                        int var274 = field1951.method2290(1);
                                        if (var274 == 1) {
                                            field2041[++field2040 - 1] = var269;
                                        }
                                    } else if (var272 == 2) {
                                        field1948[++field2157 - 1] = var269;
                                        var270.field2660 = field1917;
                                        int var275 = field1951.method2290(3);
                                        var270.method2896(var275, true);
                                        int var276 = field1951.method2290(3);
                                        var270.method2896(var276, true);
                                        int var277 = field1951.method2290(1);
                                        if (var277 == 1) {
                                            field2041[++field2040 - 1] = var269;
                                        }
                                    } else if (var272 == 3) {
                                        field2000[++field2045 - 1] = var269;
                                    }
                                }
                            }
                            while (field1951.method2292(field1925) >= 27) {
                                int var278 = field1951.method2290(15);
                                if (var278 == 32767) {
                                    break;
                                }
                                boolean var279 = false;
                                if (field1946[var278] == null) {
                                    field1946[var278] = new class183();
                                    var279 = true;
                                }
                                class183 var280 = field1946[var278];
                                field1948[++field2157 - 1] = var278;
                                var280.field2660 = field1917;
                                int var281 = field1951.method2290(5);
                                if (var281 > 15) {
                                    var281 -= 32;
                                }
                                int var282 = field1951.method2290(1);
                                if (var282 == 1) {
                                    field2041[++field2040 - 1] = var278;
                                }
                                int var283 = field2098[field1951.method2290(3)];
                                if (var279) {
                                    var280.field2662 = var280.field2615 = var283;
                                }
                                var280.field2804 = Statics.method1335(field1951.method2290(14));
                                int var284 = field1951.method2290(5);
                                if (var284 > 15) {
                                    var284 -= 32;
                                }
                                int var285 = field1951.method2290(1);
                                var280.field2668 = var280.field2804.field2271;
                                var280.field2669 = var280.field2804.field2294;
                                if (var280.field2669 == 0) {
                                    var280.field2615 = 0;
                                }
                                var280.field2621 = var280.field2804.field2289;
                                var280.field2622 = var280.field2804.field2278;
                                var280.field2664 = var280.field2804.field2280;
                                var280.field2617 = var280.field2804.field2286;
                                var280.field2618 = var280.field2804.field2274;
                                var280.field2656 = var280.field2804.field2275;
                                var280.field2655 = var280.field2804.field2284;
                                var280.method2897(Statics.field1127.field2666[0] + var284, Statics.field1127.field2649[0] + var281, var285 == 1);
                            }
                            field1951.method2291();
                            for (int var286 = 0; var286 < field2040; var286++) {
                                int var287 = field2041[var286];
                                class183 var288 = field1946[var287];
                                int var289 = field1951.method1571();
                                if ((var289 & 0x2) != 0) {
                                    var288.field2637 = field1951.method1605();
                                    if (var288.field2637 == 65535) {
                                        var288.field2637 = -1;
                                    }
                                }
                                if ((var289 & 0x8) != 0) {
                                    var288.field2661 = field1951.method1716();
                                    var288.field2627 = 100;
                                }
                                if ((var289 & 0x80) != 0) {
                                    int var290 = field1951.method1629();
                                    int var291 = field1951.method1571();
                                    var288.method2898(var290, var291, field1917);
                                    var288.field2634 = field1917 + 300;
                                    var288.field2635 = field1951.method1668();
                                    var288.field2636 = field1951.method1668();
                                }
                                if ((var289 & 0x4) != 0) {
                                    var288.field2640 = field1951.method1604();
                                    int var292 = field1951.method1612();
                                    var288.field2652 = var292 >> 16;
                                    var288.field2651 = (var292 & 0xFFFF) + field1917;
                                    var288.field2619 = 0;
                                    var288.field2616 = 0;
                                    if (var288.field2651 > field1917) {
                                        var288.field2619 = -1;
                                    }
                                    if (var288.field2640 == 65535) {
                                        var288.field2640 = -1;
                                    }
                                }
                                if ((var289 & 0x40) != 0) {
                                    var288.field2804 = Statics.method1335(field1951.method1725());
                                    var288.field2668 = var288.field2804.field2271;
                                    var288.field2669 = var288.field2804.field2294;
                                    var288.field2621 = var288.field2804.field2289;
                                    var288.field2622 = var288.field2804.field2278;
                                    var288.field2664 = var288.field2804.field2280;
                                    var288.field2617 = var288.field2804.field2286;
                                    var288.field2618 = var288.field2804.field2274;
                                    var288.field2656 = var288.field2804.field2275;
                                    var288.field2655 = var288.field2804.field2284;
                                }
                                if ((var289 & 0x1) != 0) {
                                    int var293 = field1951.method1725();
                                    if (var293 == 65535) {
                                        var293 = -1;
                                    }
                                    int var294 = field1951.method1629();
                                    if (var288.field2643 == var293 && var293 != -1) {
                                        int var295 = class155.method2497(var293).field2372;
                                        if (var295 == 1) {
                                            var288.field2644 = 0;
                                            var288.field2645 = 0;
                                            var288.field2620 = var294;
                                            var288.field2647 = 0;
                                        }
                                        if (var295 == 2) {
                                            var288.field2647 = 0;
                                        }
                                    } else if (var293 == -1 || var288.field2643 == -1 || class155.method2497(var293).field2366 >= class155.method2497(var288.field2643).field2366) {
                                        var288.field2643 = var293;
                                        var288.field2644 = 0;
                                        var288.field2645 = 0;
                                        var288.field2620 = var294;
                                        var288.field2647 = 0;
                                        var288.field2624 = var288.field2665;
                                    }
                                }
                                if ((var289 & 0x20) != 0) {
                                    var288.field2626 = field1951.method1605();
                                    var288.field2639 = field1951.method1605();
                                }
                                if ((var289 & 0x10) != 0) {
                                    int var296 = field1951.method1668();
                                    int var297 = field1951.method1571();
                                    var288.method2898(var296, var297, field1917);
                                    var288.field2634 = field1917 + 300;
                                    var288.field2635 = field1951.method1571();
                                    var288.field2636 = field1951.method1629();
                                }
                            }
                            for (int var298 = 0; var298 < field2045; var298++) {
                                int var299 = field2000[var298];
                                if (field1917 != field1946[var299].field2660) {
                                    field1946[var299].field2804 = null;
                                    field1946[var299] = null;
                                }
                            }
                            if (field1925 != field1951.field1722) {
                                throw new RuntimeException(field1951.field1722 + class1.field3 + field1925);
                            }
                            for (int var300 = 0; var300 < field2157; var300++) {
                                if (field1946[field1948[var300]] == null) {
                                    throw new RuntimeException(var300 + class1.field3 + field2157);
                                }
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 0) {
                            String var301 = field1951.method1716();
                            Object[] var302 = new Object[var301.length() + 1];
                            for (int var303 = var301.length() - 1; var303 >= 0; var303--) {
                                if (var301.charAt(var303) == 's') {
                                    var302[var303 + 1] = field1951.method1716();
                                } else {
                                    var302[var303 + 1] = Integer.valueOf(field1951.method1616());
                                }
                            }
                            var302[0] = Integer.valueOf(field1951.method1616());
                            class122 var304 = new class122();
                            var304.field1591 = var302;
                            class12.method870(var304);
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 185) {
                            field2076 = field1951.method1571();
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        if (field2139 == 232) {
                            field2113 = field2102;
                            if (field1925 == 0) {
                                field2149 = null;
                                field1909 = null;
                                Statics.field735 = 0;
                                Statics.field828 = null;
                                field2139 = -1;
                                var1 = true;
                            } else {
                                field1909 = field1951.method1716();
                                long var305 = field1951.method1577();
                                field2149 = class81.method538(var305);
                                Statics.field176 = field1951.method1572();
                                int var307 = field1951.method1571();
                                if (var307 == 255) {
                                    field2139 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field735 = var307;
                                    class125[] var308 = new class125[100];
                                    for (int var309 = 0; var309 < Statics.field735; var309++) {
                                        var308[var309] = new class125();
                                        var308[var309].field1620 = field1951.method1716();
                                        var308[var309].field1617 = class83.method1463(var308[var309].field1620, Statics.field359);
                                        var308[var309].field1618 = field1951.method1725();
                                        var308[var309].field1619 = field1951.method1572();
                                        field1951.method1716();
                                        if (var308[var309].field1620.equals(Statics.field1127.field2797)) {
                                            Statics.field531 = var308[var309].field1619;
                                        }
                                    }
                                    boolean var310 = false;
                                    int var311 = Statics.field735;
                                    while (var311 > 0) {
                                        boolean var312 = true;
                                        var311--;
                                        for (int var313 = 0; var313 < var311; var313++) {
                                            if (var308[var313].field1617.compareTo(var308[var313 + 1].field1617) > 0) {
                                                class125 var314 = var308[var313];
                                                var308[var313] = var308[var313 + 1];
                                                var308[var313 + 1] = var314;
                                                var312 = false;
                                            }
                                        }
                                        if (var312) {
                                            break;
                                        }
                                    }
                                    Statics.field828 = var308;
                                    field2139 = -1;
                                    var1 = true;
                                }
                            }
                            break label2615;
                        }
                        if (field2139 == 84) {
                            int var315 = field1951.method1616();
                            class123 var316 = (class123) field2080.method1259((long) var315);
                            if (var316 != null) {
                                method1114(var316, true);
                            }
                            if (field2083 != null) {
                                method968(field2083);
                                field2083 = null;
                            }
                            field2139 = -1;
                            var1 = true;
                            break label2615;
                        }
                        class169.method255("" + field2139 + class1.field3 + field1958 + class1.field3 + field2140 + class1.field3 + field1925, (Throwable) null);
                        method1213();
                    } catch (IOException var415) {
                        method779();
                    } catch (Exception var416) {
                        String var319 = "" + field2139 + class1.field3 + field1958 + class1.field3 + field2140 + class1.field3 + field1925 + class1.field3 + (Statics.field1739 + Statics.field1127.field2666[0]) + class1.field3 + (Statics.field1766 + Statics.field1127.field2649[0]) + class1.field3;
                        for (int var320 = 0; var320 < field1925 && var320 < 50; var320++) {
                            var319 = var319 + field1951.field1723[var320] + class1.field3;
                        }
                        class169.method255(var319, var416);
                        method1213();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field2078 != 30) {
            return;
        }
        class108.method983(field2176, 25);
        Object var321 = Statics.field812.field114;
        synchronized (Statics.field812.field114) {
            if (!field1908) {
                Statics.field812.field115 = 0;
            } else if (class36.field481 != 0 || Statics.field812.field115 >= 40) {
                field2176.method2288(81);
                field2176.method1558(0);
                int var322 = field2176.field1722;
                int var323 = 0;
                for (int var324 = 0; var324 < Statics.field812.field115 && field2176.field1722 - var322 < 240; var324++) {
                    var323++;
                    int var325 = Statics.field812.field116[var324];
                    if (var325 < 0) {
                        var325 = 0;
                    } else if (var325 > 502) {
                        var325 = 502;
                    }
                    int var326 = Statics.field812.field117[var324];
                    if (var326 < 0) {
                        var326 = 0;
                    } else if (var326 > 764) {
                        var326 = 764;
                    }
                    int var327 = var325 * 765 + var326;
                    if (Statics.field812.field116[var324] == -1 && Statics.field812.field117[var324] == -1) {
                        var326 = -1;
                        var325 = -1;
                        var327 = 524287;
                    }
                    if (field1919 != var326 || field1920 != var325) {
                        int var328 = var326 - field1919;
                        field1919 = var326;
                        int var329 = var325 - field1920;
                        field1920 = var325;
                        if (field1921 < 8 && var328 >= -32 && var328 <= 31 && var329 >= -32 && var329 <= 31) {
                            var328 += 32;
                            var329 += 32;
                            field2176.method1559((field1921 << 12) + (var328 << 6) + var329);
                            field1921 = 0;
                        } else if (field1921 < 8) {
                            field2176.method1560((field1921 << 19) + 8388608 + var327);
                            field1921 = 0;
                        } else {
                            field2176.method1561((field1921 << 19) + -1073741824 + var327);
                            field1921 = 0;
                        }
                    } else if (field1921 < 2047) {
                        field1921++;
                    }
                }
                field2176.method1568(field2176.field1722 - var322);
                if (var323 >= Statics.field812.field115) {
                    Statics.field812.field115 = 0;
                } else {
                    Statics.field812.field115 -= var323;
                    for (int var330 = 0; var330 < Statics.field812.field115; var330++) {
                        Statics.field812.field117[var330] = Statics.field812.field117[var323 + var330];
                        Statics.field812.field116[var330] = Statics.field812.field116[var323 + var330];
                    }
                }
            }
        }
        if (class36.field481 != 0) {
            long var332 = (class36.field495 * -2366786147422337299L - field1918) / 50L;
            if (var332 > 4095L) {
                var332 = 4095L;
            }
            field1918 = class36.field495 * -2366786147422337299L;
            int var334 = class36.field494;
            if (var334 < 0) {
                var334 = 0;
            } else if (var334 > 502) {
                var334 = 502;
            }
            int var335 = class36.field489;
            if (var335 < 0) {
                var335 = 0;
            } else if (var335 > 764) {
                var335 = 764;
            }
            int var336 = var334 * 765 + var335;
            byte var337 = 0;
            if (class36.field481 == 2) {
                var337 = 1;
            }
            int var338 = (int) var332;
            field2176.method2288(26);
            field2176.method1561((var337 << 19) + (var338 << 20) + var336);
        }
        if (field2005 > 0) {
            field2005--;
        }
        if (class35.field464[96] || class35.field464[97] || class35.field464[98] || class35.field464[99]) {
            field2006 = true;
        }
        if (field2006 && field2005 <= 0) {
            field2005 = 20;
            field2006 = false;
            field2176.method2288(63);
            field2176.method1601(field2001);
            field2176.method1602(field2002);
        }
        if (Statics.field1476 && !field2007) {
            field2007 = true;
            field2176.method2288(197);
            field2176.method1558(1);
        }
        if (!Statics.field1476 && field2007) {
            field2007 = false;
            field2176.method2288(197);
            field2176.method1558(0);
        }
        method747();
        if (field2078 != 30) {
            return;
        }
        method1421();
        method969();
        field1954++;
        if (field1954 > 750) {
            method779();
            return;
        }
        for (int var339 = -1; var339 < field2038; var339++) {
            int var340;
            if (var339 == -1) {
                var340 = 2047;
            } else {
                var340 = field2039[var339];
            }
            class182 var341 = field2037[var340];
            if (var341 != null) {
                Statics.method823(var341, 1);
            }
        }
        for (int var342 = 0; var342 < field2157; var342++) {
            int var343 = field1948[var342];
            class183 var344 = field1946[var343];
            if (var344 != null) {
                Statics.method823(var344, var344.field2804.field2271);
            }
        }
        for (int var345 = -1; var345 < field2038; var345++) {
            int var346;
            if (var345 == -1) {
                var346 = 2047;
            } else {
                var346 = field2039[var345];
            }
            class182 var347 = field2037[var346];
            if (var347 != null && var347.field2627 > 0) {
                var347.field2627--;
                if (var347.field2627 == 0) {
                    var347.field2661 = null;
                }
            }
        }
        for (int var348 = 0; var348 < field2157; var348++) {
            int var349 = field1948[var348];
            class183 var350 = field1946[var349];
            if (var350 != null && var350.field2627 > 0) {
                var350.field2627--;
                if (var350.field2627 == 0) {
                    var350.field2661 = null;
                }
            }
        }
        field1961++;
        if (field2025 != 0) {
            field2024 += 20;
            if (field2024 >= 400) {
                field2025 = 0;
            }
        }
        if (Statics.field522 != null) {
            field2026++;
            if (field2026 >= 15) {
                method968(Statics.field522);
                Statics.field522 = null;
            }
        }
        if (Statics.field1503 != null) {
            method968(Statics.field1503);
            field1957++;
            if (class36.field486 > field2029 + 5 || class36.field486 < field2029 - 5 || class36.field487 > field2030 + 5 || class36.field487 < field2030 - 5) {
                field2032 = true;
            }
            if (class36.field485 == 0) {
                if (field2032 && field1957 >= 5) {
                    if (Statics.field1593 == Statics.field1503 && field2028 != field1991) {
                        class140 var351 = Statics.field1503;
                        byte var352 = 0;
                        if (field2082 == 1 && var351.field1782 == 206) {
                            var352 = 1;
                        }
                        if (var351.field1880[field1991] <= 0) {
                            var352 = 0;
                        }
                        if (class92.method1101(method357(var351))) {
                            int var353 = field2028;
                            int var354 = field1991;
                            var351.field1880[var354] = var351.field1880[var353];
                            var351.field1881[var354] = var351.field1881[var353];
                            var351.field1880[var353] = -1;
                            var351.field1881[var353] = 0;
                        } else if (var352 == 1) {
                            int var355 = field2028;
                            int var356 = field1991;
                            while (var355 != var356) {
                                if (var355 > var356) {
                                    var351.method1768(var355 - 1, var355);
                                    var355--;
                                } else if (var355 < var356) {
                                    var351.method1768(var355 + 1, var355);
                                    var355++;
                                }
                            }
                        } else {
                            var351.method1768(field1991, field2028);
                        }
                        field2176.method2288(223);
                        field2176.method1594(var352);
                        field2176.method1611(Statics.field1503.field1778);
                        field2176.method1688(field2028);
                        field2176.method1688(field1991);
                    }
                } else if ((field2059 == 1 || method2306(field1947 - 1)) && field1947 > 2) {
                    method1330();
                } else if (field1947 > 0) {
                    method55(field1947 - 1);
                }
                field2026 = 10;
                class36.field481 = 0;
                Statics.field1503 = null;
            }
        }
        class140 var357 = Statics.field1575;
        class140 var358 = Statics.field743;
        Statics.field1575 = null;
        Statics.field743 = null;
        field2019 = null;
        field2058 = false;
        field2063 = false;
        field2146 = 0;
        while (true) {
            class35 var359 = class35.field455;
            boolean var360;
            synchronized (class35.field455) {
                if (class35.field476 == class35.field474) {
                    var360 = false;
                } else {
                    Statics.field186 = class35.field473[class35.field474];
                    Statics.field198 = class35.field419[class35.field474];
                    class35.field474 = class35.field474 + 1 & 0x7F;
                    var360 = true;
                }
            }
            if (!var360 || field2146 >= 128) {
                Statics.method1113(field2079, 0, 0, 765, 503, 0, 0);
                field2102++;
                while (true) {
                    class122 var362;
                    class140 var363;
                    class140 var364;
                    do {
                        var362 = (class122) field2119.method1293();
                        if (var362 == null) {
                            while (true) {
                                class122 var365;
                                class140 var366;
                                class140 var367;
                                do {
                                    var365 = (class122) field2120.method1293();
                                    if (var365 == null) {
                                        while (true) {
                                            class122 var368;
                                            class140 var369;
                                            class140 var370;
                                            do {
                                                var368 = (class122) field2086.method1293();
                                                if (var368 == null) {
                                                    if (field2189 != null) {
                                                        method968(field2189);
                                                        Statics.field260++;
                                                        if (field2058 && field2063) {
                                                            int var371 = class36.field486;
                                                            int var372 = class36.field487;
                                                            int var373 = var371 - field2108;
                                                            int var374 = var372 - field2089;
                                                            if (var373 < field2096) {
                                                                var373 = field2096;
                                                            }
                                                            if (field2189.field1791 + var373 > field2096 + field1959.field1791) {
                                                                var373 = field2096 + field1959.field1791 - field2189.field1791;
                                                            }
                                                            if (var374 < field2171) {
                                                                var374 = field2171;
                                                            }
                                                            if (field2189.field1788 + var374 > field2171 + field1959.field1788) {
                                                                var374 = field2171 + field1959.field1788 - field2189.field1788;
                                                            }
                                                            int var375 = var373 - field2099;
                                                            int var376 = var374 - field2100;
                                                            int var377 = field2189.field1833;
                                                            if (Statics.field260 > field2189.field1842 && (var375 > var377 || var375 < -var377 || var376 > var377 || var376 < -var377)) {
                                                                field2101 = true;
                                                            }
                                                            int var378 = field1959.field1820 + (var373 - field2096);
                                                            int var379 = field1959.field1774 + (var374 - field2171);
                                                            if (field2189.field1872 != null && field2101) {
                                                                class122 var380 = new class122();
                                                                var380.field1585 = field2189;
                                                                var380.field1586 = var378;
                                                                var380.field1587 = var379;
                                                                var380.field1591 = field2189.field1872;
                                                                class12.method870(var380);
                                                            }
                                                            if (class36.field485 == 0) {
                                                                if (field2101) {
                                                                    if (field2189.field1818 != null) {
                                                                        class122 var381 = new class122();
                                                                        var381.field1585 = field2189;
                                                                        var381.field1586 = var378;
                                                                        var381.field1587 = var379;
                                                                        var381.field1589 = field2019;
                                                                        var381.field1591 = field2189.field1818;
                                                                        class12.method870(var381);
                                                                    }
                                                                    if (field2019 != null && method63(field2189) != null) {
                                                                        field2176.method2288(162);
                                                                        field2176.method1609(field2189.field1778);
                                                                        field2176.method1561(field2019.field1778);
                                                                        field2176.method1688(field2189.field1779);
                                                                        field2176.method1688(field2019.field1779);
                                                                    }
                                                                } else if ((field2059 == 1 || method2306(field1947 - 1)) && field1947 > 2) {
                                                                    method1330();
                                                                } else if (field1947 > 0) {
                                                                    method55(field1947 - 1);
                                                                }
                                                                field2189 = null;
                                                            }
                                                        } else if (Statics.field260 > 1) {
                                                            field2189 = null;
                                                        }
                                                    }
                                                    if (class44.field606 != -1) {
                                                        int var382 = class44.field606;
                                                        int var383 = class44.field618;
                                                        boolean var384 = method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var382, var383, true, 0, 0, 0, 0, 0, 0);
                                                        class44.field606 = -1;
                                                        if (var384) {
                                                            field2170 = class36.field489;
                                                            field1964 = class36.field494;
                                                            field2025 = 1;
                                                            field2024 = 0;
                                                        }
                                                    }
                                                    Statics.method98();
                                                    if (Statics.field1575 != var357) {
                                                        if (var357 != null) {
                                                            method968(var357);
                                                        }
                                                        if (Statics.field1575 != null) {
                                                            method968(Statics.field1575);
                                                        }
                                                    }
                                                    if (Statics.field743 != var358 && field2072 == field2071) {
                                                        if (var358 != null) {
                                                            method968(var358);
                                                        }
                                                        if (Statics.field743 != null) {
                                                            method968(Statics.field743);
                                                        }
                                                    }
                                                    if (Statics.field743 == null) {
                                                        if (field2071 > 0) {
                                                            field2071--;
                                                        }
                                                    } else if (field2071 < field2072) {
                                                        field2071++;
                                                        if (field2072 == field2071) {
                                                            method968(Statics.field743);
                                                        }
                                                    }
                                                    int var385 = field1979 + Statics.field1127.field2642;
                                                    int var386 = field2022 + Statics.field1127.field2614;
                                                    if (Statics.field361 - var385 < -500 || Statics.field361 - var385 > 500 || Statics.field547 - var386 < -500 || Statics.field547 - var386 > 500) {
                                                        Statics.field361 = var385;
                                                        Statics.field547 = var386;
                                                    }
                                                    if (Statics.field361 != var385) {
                                                        Statics.field361 += (var385 - Statics.field361) / 16;
                                                    }
                                                    if (Statics.field547 != var386) {
                                                        Statics.field547 += (var386 - Statics.field547) / 16;
                                                    }
                                                    if (class35.field464[96]) {
                                                        field1933 += (-24 - field1933) / 2;
                                                    } else if (class35.field464[97]) {
                                                        field1933 += (24 - field1933) / 2;
                                                    } else {
                                                        field1933 /= 2;
                                                    }
                                                    if (class35.field464[98]) {
                                                        field2004 += (12 - field2004) / 2;
                                                    } else if (class35.field464[99]) {
                                                        field2004 += (-12 - field2004) / 2;
                                                    } else {
                                                        field2004 /= 2;
                                                    }
                                                    field2002 = field1933 / 2 + field2002 & 0x7FF;
                                                    field2001 += field2004 / 2;
                                                    if (field2001 < 128) {
                                                        field2001 = 128;
                                                    }
                                                    if (field2001 > 383) {
                                                        field2001 = 383;
                                                    }
                                                    int var387 = Statics.field361 >> 7;
                                                    int var388 = Statics.field547 >> 7;
                                                    int var389 = method788(Statics.field361, Statics.field547, Statics.field1622);
                                                    int var390 = 0;
                                                    if (var387 > 3 && var388 > 3 && var387 < 100 && var388 < 100) {
                                                        for (int var391 = var387 - 4; var391 <= var387 + 4; var391++) {
                                                            for (int var392 = var388 - 4; var392 <= var388 + 4; var392++) {
                                                                int var393 = Statics.field1622;
                                                                if (var393 < 3 && (class3.field18[1][var391][var392] & 0x2) == 2) {
                                                                    var393++;
                                                                }
                                                                int var394 = var389 - class3.field22[var393][var391][var392];
                                                                if (var394 > var390) {
                                                                    var390 = var394;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var395 = var390 * 192;
                                                    if (var395 > 98048) {
                                                        var395 = 98048;
                                                    }
                                                    if (var395 < 32768) {
                                                        var395 = 32768;
                                                    }
                                                    if (var395 > field2173) {
                                                        field2173 += (var395 - field2173) / 24;
                                                    } else if (var395 < field2173) {
                                                        field2173 += (var395 - field2173) / 80;
                                                    }
                                                    if (field2177) {
                                                        method161();
                                                    }
                                                    for (int var396 = 0; var396 < 5; var396++) {
                                                        int var10002 = field2184[var396]++;
                                                    }
                                                    int var397 = ++class36.field484 - 1;
                                                    int var399 = class35.field477;
                                                    if (var397 > 15000 && var399 > 15000) {
                                                        field2107 = 250;
                                                        class36.field484 = 14500;
                                                        field2176.method2288(166);
                                                    }
                                                    field1985++;
                                                    if (field1985 > 500) {
                                                        field1985 = 0;
                                                        int var401 = (int) (Math.random() * 8.0D);
                                                        if ((var401 & 0x1) == 1) {
                                                            field1979 += field1980;
                                                        }
                                                        if ((var401 & 0x2) == 2) {
                                                            field2022 += field1982;
                                                        }
                                                        if ((var401 & 0x4) == 4) {
                                                            field2135 += field1984;
                                                        }
                                                    }
                                                    if (field1979 < -50) {
                                                        field1980 = 2;
                                                    }
                                                    if (field1979 > 50) {
                                                        field1980 = -2;
                                                    }
                                                    if (field2022 < -55) {
                                                        field1982 = 2;
                                                    }
                                                    if (field2022 > 55) {
                                                        field1982 = -2;
                                                    }
                                                    if (field2135 < -40) {
                                                        field1984 = 1;
                                                    }
                                                    if (field2135 > 40) {
                                                        field1984 = -1;
                                                    }
                                                    field2192++;
                                                    if (field2192 > 500) {
                                                        field2192 = 0;
                                                        int var402 = (int) (Math.random() * 8.0D);
                                                        if ((var402 & 0x1) == 1) {
                                                            field2047 += field1987;
                                                        }
                                                        if ((var402 & 0x2) == 2) {
                                                            field1988 += field2183;
                                                        }
                                                    }
                                                    if (field2047 < -60) {
                                                        field1987 = 2;
                                                    }
                                                    if (field2047 > 60) {
                                                        field1987 = -2;
                                                    }
                                                    if (field1988 < -20) {
                                                        field2183 = 1;
                                                    }
                                                    if (field1988 > 10) {
                                                        field2183 = -1;
                                                    }
                                                    field1955++;
                                                    if (field1955 > 50) {
                                                        field2176.method2288(152);
                                                    }
                                                    try {
                                                        if (Statics.field677 != null && field2176.field1722 > 0) {
                                                            Statics.field677.method377(field2176.field1723, 0, field2176.field1722);
                                                            field2176.field1722 = 0;
                                                            field1955 = 0;
                                                        }
                                                    } catch (IOException var404) {
                                                        method779();
                                                    }
                                                    return;
                                                }
                                                var369 = var368.field1585;
                                                if (var369.field1779 < 0) {
                                                    break;
                                                }
                                                var370 = class140.method53(var369.field1789);
                                            } while (var370 == null || var370.field1877 == null || var369.field1779 >= var370.field1877.length || var370.field1877[var369.field1779] != var369);
                                            class12.method870(var368);
                                        }
                                    }
                                    var366 = var365.field1585;
                                    if (var366.field1779 < 0) {
                                        break;
                                    }
                                    var367 = class140.method53(var366.field1789);
                                } while (var367 == null || var367.field1877 == null || var366.field1779 >= var367.field1877.length || var367.field1877[var366.field1779] != var366);
                                class12.method870(var365);
                            }
                        }
                        var363 = var362.field1585;
                        if (var363.field1779 < 0) {
                            break;
                        }
                        var364 = class140.method53(var363.field1789);
                    } while (var364 == null || var364.field1877 == null || var363.field1779 >= var364.field1877.length || var364.field1877[var363.field1779] != var363);
                    class12.method870(var362);
                }
            }
            field2148[field2146] = Statics.field186;
            field2147[field2146] = Statics.field198;
            field2146++;
        }
    }

    @ObfuscatedName("ah.do(I)V")
    public static final void method414() {
        if (Statics.field532 != null) {
            Statics.field532.method212();
        }
        if (Statics.field1580 != null) {
            Statics.field1580.method212();
        }
    }

    @ObfuscatedName("cd.de(I)V")
    public static final void method969() {
        for (int var0 = 0; var0 < field1992; var0++) {
            int var10002 = field1989[var0]--;
            if (field1989[var0] >= -10) {
                class22 var2 = field1931[var0];
                if (var2 == null) {
                    class22 var10000 = (class22) null;
                    var2 = class22.method289(Statics.field795, field2172[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field1989[var0] += var2.method284();
                    field1931[var0] = var2;
                }
                if (field1989[var0] < 0) {
                    int var9;
                    if (field2017[var0] == 0) {
                        var9 = field2168;
                    } else {
                        int var3 = (field2017[var0] & 0xFF) * 128;
                        int var4 = field2017[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1127.field2642;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field2017[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1127.field2614;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field1989[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field1953 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class145 var10 = var2.method285().method2049(Statics.field331);
                        class146 var11 = class146.method2094(var10, 100, var9);
                        var11.method2056(field2095[var0] - 1);
                        Statics.field1115.method2172(var11);
                    }
                    field1989[var0] = -100;
                }
            } else {
                field1992--;
                for (int var1 = var0; var1 < field1992; var1++) {
                    field2172[var1] = field2172[var1 + 1];
                    field1931[var1] = field1931[var1 + 1];
                    field2095[var1] = field2095[var1 + 1];
                    field1989[var1] = field1989[var1 + 1];
                    field2017[var1] = field2017[var1 + 1];
                }
                var0--;
            }
        }
        if (field2166 && !Statics.method883()) {
            if (field2164 != 0 && field2165 != -1) {
                class78.method370(Statics.field1095, field2165, 0, field2164, false);
            }
            field2166 = false;
        }
    }

    @ObfuscatedName("w.dh(IIS)V")
    public static void method112(int arg0, int arg1) {
        if (field2164 != 0 && arg0 != -1) {
            class78.method370(Statics.field1210, arg0, 0, field2164, false);
            field2166 = true;
        }
    }

    @ObfuscatedName("bz.dk(I)V")
    public static final void method747() {
        if (field1912 && Statics.field1622 != field2174) {
            Statics.method371(Statics.field53, Statics.field1767, Statics.field1622, Statics.field1127.field2666[0], Statics.field1127.field2649[0]);
        } else if (Statics.field1622 != field2151) {
            field2151 = Statics.field1622;
            int var0 = Statics.field1622;
            int[] var1 = Statics.field1768.field2509;
            int var2 = var1.length;
            for (int var3 = 0; var3 < var2; var3++) {
                var1[var3] = 0;
            }
            for (int var4 = 1; var4 < 103; var4++) {
                int var5 = (103 - var4) * 2048 + 24628;
                for (int var6 = 1; var6 < 103; var6++) {
                    if ((class3.field18[var0][var6][var4] & 0x18) == 0) {
                        Statics.field1155.method582(var1, var5, 512, var0, var6, var4);
                    }
                    if (var0 < 3 && (class3.field18[var0 + 1][var6][var4] & 0x8) != 0) {
                        Statics.field1155.method582(var1, var5, 512, var0 + 1, var6, var4);
                    }
                    var5 += 4;
                }
            }
            int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field1768.method2664();
            for (int var9 = 1; var9 < 103; var9++) {
                for (int var10 = 1; var10 < 103; var10++) {
                    if ((class3.field18[var0][var10][var9] & 0x18) == 0) {
                        method1206(var0, var10, var9, var7, var8);
                    }
                    if (var0 < 3 && (class3.field18[var0 + 1][var10][var9] & 0x8) != 0) {
                        method1206(var0 + 1, var10, var9, var7, var8);
                    }
                }
            }
            field2152 = 0;
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    int var13 = Statics.field1155.method572(Statics.field1622, var11, var12);
                    if (var13 != 0) {
                        int var14 = var13 >> 14 & 0x7FFF;
                        int var15 = Statics.method1460(var14).field2316;
                        if (var15 >= 0) {
                            int var16 = var11;
                            int var17 = var12;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var18 = field1970[Statics.field1622].field1264;
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
                            field2153[field2152] = Statics.field1967[var15];
                            field1926[field2152] = var16;
                            field2154[field2152] = var17;
                            field2152++;
                        }
                    }
                }
            }
            Statics.field1475.method528();
        }
    }

    @ObfuscatedName("da.dm(Ljava/lang/String;I)V")
    public static final void method1468(String arg0) {
        if (field2169 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                method779();
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                field1915 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                field1915 = false;
            }
            if (arg0.equalsIgnoreCase("::noclip")) {
                for (int var1 = 0; var1 < 4; var1++) {
                    for (int var2 = 1; var2 < 103; var2++) {
                        for (int var3 = 1; var3 < 103; var3++) {
                            field1970[var1].field1264[var2][var3] = 0;
                        }
                    }
                }
            }
            if (arg0.equalsIgnoreCase("::errortest") && field2175 == 2) {
                throw new RuntimeException();
            }
        }
        field2176.method2288(110);
        field2176.method1558(arg0.length() - 1);
        field2176.method1563(arg0.substring(2));
    }

    @ObfuscatedName("u.dw(B)V")
    public static final void method161() {
        int var0 = Statics.field9 * 128 + 64;
        int var1 = Statics.field1478 * 128 + 64;
        int var2 = method788(var0, var1, Statics.field1622) - Statics.field842;
        if (Statics.field1208 < var0) {
            Statics.field1208 += Statics.field744 * (var0 - Statics.field1208) / 1000 + Statics.field1554;
            if (Statics.field1208 > var0) {
                Statics.field1208 = var0;
            }
        }
        if (Statics.field1208 > var0) {
            Statics.field1208 -= Statics.field744 * (Statics.field1208 - var0) / 1000 + Statics.field1554;
            if (Statics.field1208 < var0) {
                Statics.field1208 = var0;
            }
        }
        if (Statics.field345 < var2) {
            Statics.field345 += Statics.field744 * (var2 - Statics.field345) / 1000 + Statics.field1554;
            if (Statics.field345 > var2) {
                Statics.field345 = var2;
            }
        }
        if (Statics.field345 > var2) {
            Statics.field345 -= Statics.field744 * (Statics.field345 - var2) / 1000 + Statics.field1554;
            if (Statics.field345 < var2) {
                Statics.field345 = var2;
            }
        }
        if (Statics.field479 < var1) {
            Statics.field479 += Statics.field744 * (var1 - Statics.field479) / 1000 + Statics.field1554;
            if (Statics.field479 > var1) {
                Statics.field479 = var1;
            }
        }
        if (Statics.field479 > var1) {
            Statics.field479 -= Statics.field744 * (Statics.field479 - var1) / 1000 + Statics.field1554;
            if (Statics.field479 < var1) {
                Statics.field479 = var1;
            }
        }
        int var3 = Statics.field2178 * 128 + 64;
        int var4 = Statics.field185 * 128 + 64;
        int var5 = method788(var3, var4, Statics.field1622) - Statics.field1144;
        int var6 = var3 - Statics.field1208;
        int var7 = var5 - Statics.field345;
        int var8 = var4 - Statics.field479;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field543 < var10) {
            Statics.field543 += Statics.field346 * (var10 - Statics.field543) / 1000 + Statics.field822;
            if (Statics.field543 > var10) {
                Statics.field543 = var10;
            }
        }
        if (Statics.field543 > var10) {
            Statics.field543 -= Statics.field346 * (Statics.field543 - var10) / 1000 + Statics.field822;
            if (Statics.field543 < var10) {
                Statics.field543 = var10;
            }
        }
        int var12 = var11 - Statics.field523;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field523 += Statics.field346 * var12 / 1000 + Statics.field822;
            Statics.field523 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field523 -= Statics.field346 * -var12 / 1000 + Statics.field822;
            Statics.field523 &= 0x7FF;
        }
        int var13 = var11 - Statics.field523;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field523 = var11;
        }
    }

    @ObfuscatedName("en.dr(Lfx;I)V")
    public static final void method1808(class178 arg0) {
        if (field1917 == arg0.field2658 || arg0.field2643 == -1 || arg0.field2620 != 0 || arg0.field2645 + 1 > class155.method2497(arg0.field2643).field2359[arg0.field2644]) {
            int var1 = arg0.field2658 - arg0.field2657;
            int var2 = field1917 - arg0.field2657;
            int var3 = arg0.field2668 * 64 + arg0.field2653 * 128;
            int var4 = arg0.field2670 * 128 + arg0.field2668 * 64;
            int var5 = arg0.field2668 * 64 + arg0.field2646 * 128;
            int var6 = arg0.field2668 * 64 + arg0.field2623 * 128;
            arg0.field2642 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field2614 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field2638 = 0;
        if (arg0.field2659 == 0) {
            arg0.field2662 = 1024;
        }
        if (arg0.field2659 == 1) {
            arg0.field2662 = 1536;
        }
        if (arg0.field2659 == 2) {
            arg0.field2662 = 0;
        }
        if (arg0.field2659 == 3) {
            arg0.field2662 = 512;
        }
        arg0.field2615 = arg0.field2662;
    }

    @ObfuscatedName("cv.dp(Lfl;IIB)V")
    public static void method1102(class182 arg0, int arg1, int arg2) {
        if (arg0.field2643 == arg1 && arg1 != -1) {
            int var3 = class155.method2497(arg1).field2372;
            if (var3 == 1) {
                arg0.field2644 = 0;
                arg0.field2645 = 0;
                arg0.field2620 = arg2;
                arg0.field2647 = 0;
            }
            if (var3 == 2) {
                arg0.field2647 = 0;
            }
        } else if (arg1 == -1 || arg0.field2643 == -1 || class155.method2497(arg1).field2366 >= class155.method2497(arg0.field2643).field2366) {
            arg0.field2643 = arg1;
            arg0.field2644 = 0;
            arg0.field2645 = 0;
            arg0.field2620 = arg2;
            arg0.field2647 = 0;
            arg0.field2624 = arg0.field2665;
        }
    }

    @ObfuscatedName("bq.dt(Ljava/lang/String;ZI)V")
    public static final void method771(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2160.method2826(arg0, 250);
        int var6 = Statics.field2160.method2805(arg0, 250) * 13;
        class164.method2582(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class164.method2584(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2160.method2810(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method966(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method984(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1094.getGraphics();
            Statics.field1475.method526(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1094.repaint();
        }
    }

    @ObfuscatedName("a.dg(IIIII)V")
    public static final void method100(int arg0, int arg1, int arg2, int arg3) {
        class164.method2576(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class172.method2748();
        field2044++;
        method1126(true);
        method699(true);
        method1126(false);
        method699(false);
        method1334();
        method1127();
        if (!field2177) {
            int var4 = field2001;
            if (field2173 / 256 > var4) {
                var4 = field2173 / 256;
            }
            if (field2054[4] && field2182[4] + 128 > var4) {
                var4 = field2182[4] + 128;
            }
            int var5 = field2135 + field2002 & 0x7FF;
            method885(Statics.field361, method788(Statics.field1127.field2642, Statics.field1127.field2614, Statics.field1622) - 50, Statics.field547, var4, var5, var4 * 3 + 600);
        }
        int var6;
        if (field2177) {
            var6 = method399();
        } else {
            var6 = method1492();
        }
        int var7 = Statics.field1208;
        int var8 = Statics.field345;
        int var9 = Statics.field479;
        int var10 = Statics.field543;
        int var11 = Statics.field523;
        for (int var12 = 0; var12 < 5; var12++) {
            if (field2054[var12]) {
                int var13 = (int) (Math.random() * (double) (field2181[var12] * 2 + 1) - (double) field2181[var12] + Math.sin((double) field2034[var12] / 100.0D * (double) field2184[var12]) * (double) field2182[var12]);
                if (var12 == 0) {
                    Statics.field1208 += var13;
                }
                if (var12 == 1) {
                    Statics.field345 += var13;
                }
                if (var12 == 2) {
                    Statics.field479 += var13;
                }
                if (var12 == 3) {
                    Statics.field523 = Statics.field523 + var13 & 0x7FF;
                }
                if (var12 == 4) {
                    Statics.field543 += var13;
                    if (Statics.field543 < 128) {
                        Statics.field543 = 128;
                    }
                    if (Statics.field543 > 383) {
                        Statics.field543 = 383;
                    }
                }
            }
        }
        int var14 = class36.field486;
        int var15 = class36.field487;
        if (var14 >= arg0 && var14 < arg0 + arg2 && var15 >= arg1 && var15 < arg1 + arg3) {
            class180.field2773 = true;
            class180.field2776 = 0;
            class180.field2753 = class36.field486 - arg0;
            class180.field2775 = class36.field487 - arg1;
        } else {
            class180.field2773 = false;
            class180.field2776 = 0;
        }
        method414();
        class164.method2582(arg0, arg1, arg2, arg3, 0);
        method414();
        Statics.field1155.method586(Statics.field1208, Statics.field345, Statics.field479, Statics.field543, Statics.field523, var6);
        method414();
        Statics.field1155.method646();
        field2008 = 0;
        for (int var16 = -1; var16 < field2157 + field2038; var16++) {
            class178 var17;
            if (var16 == -1) {
                var17 = Statics.field1127;
            } else if (var16 < field2038) {
                var17 = field2037[field2039[var16]];
            } else {
                var17 = field1946[field1948[var16 - field2038]];
            }
            if (var17 != null && var17.method2900()) {
                if (var17 instanceof class183) {
                    class152 var18 = ((class183) var17).field2804;
                    if (var18.field2295 != null) {
                        var18 = var18.method2316();
                    }
                    if (var18 == null) {
                        continue;
                    }
                }
                if (var16 >= field2038) {
                    class152 var21 = ((class183) var17).field2804;
                    if (var21.field2295 != null) {
                        var21 = var21.method2316();
                    }
                    if (var21.field2293 >= 0 && var21.field2293 < Statics.field1176.length) {
                        method1095(var17, var17.field2654 + 15);
                        if (field1907 > -1) {
                            Statics.field1176[var21.field2293].method2683(field1907 + arg0 - 12, field2021 + arg1 - 30);
                        }
                    }
                    if (field2050 == 1 && field2090 == field1948[var16 - field2038] && field1917 % 20 < 10) {
                        method1095(var17, var17.field2654 + 15);
                        if (field1907 > -1) {
                            Statics.field799[0].method2683(field1907 + arg0 - 12, field2021 + arg1 - 28);
                        }
                    }
                } else {
                    int var19 = 30;
                    class182 var20 = (class182) var17;
                    if (var20.field2787 != -1 || var20.field2788 != -1) {
                        method1095(var17, var17.field2654 + 15);
                        if (field1907 > -1) {
                            if (var20.field2787 != -1) {
                                Statics.field2483[var20.field2787].method2683(field1907 + arg0 - 12, field2021 + arg1 - var19);
                                var19 += 25;
                            }
                            if (var20.field2788 != -1) {
                                Statics.field1176[var20.field2788].method2683(field1907 + arg0 - 12, field2021 + arg1 - var19);
                                var19 += 25;
                            }
                        }
                    }
                    if (var16 >= 0 && field2050 == 10 && field1927 == field2039[var16]) {
                        method1095(var17, var17.field2654 + 15);
                        if (field1907 > -1) {
                            Statics.field799[1].method2683(field1907 + arg0 - 12, field2021 + arg1 - var19);
                        }
                    }
                }
                if (var17.field2661 != null) {
                    label480: {
                        if (var16 < field2038 && field2093 != 0 && field2093 != 3) {
                            if (field2093 != 1) {
                                break label480;
                            }
                            String var22 = ((class182) var17).field2797;
                            boolean var23;
                            if (var22 == null) {
                                var23 = false;
                            } else {
                                int var24 = 0;
                                while (true) {
                                    if (var24 >= field2031) {
                                        if (var22.equalsIgnoreCase(Statics.field1127.field2797)) {
                                            var23 = true;
                                        } else {
                                            var23 = false;
                                        }
                                        break;
                                    }
                                    if (var22.equalsIgnoreCase(field2188[var24].field172)) {
                                        var23 = true;
                                        break;
                                    }
                                    var24++;
                                }
                            }
                            if (!var23) {
                                break label480;
                            }
                        }
                        method1095(var17, var17.field2654);
                        if (field1907 > -1 && field2008 < field2009) {
                            field2163[field2008] = Statics.field678.method2802(var17.field2661) / 2;
                            field2012[field2008] = Statics.field678.field2559;
                            field2013[field2008] = field1907;
                            field2014[field2008] = field2021;
                            field2033[field2008] = var17.field2628;
                            field2015[field2008] = var17.field2629;
                            field2016[field2008] = var17.field2627;
                            field2060[field2008] = var17.field2661;
                            field2008++;
                        }
                    }
                }
                if (var17.field2634 > field1917) {
                    method1095(var17, var17.field2654 + 15);
                    if (field1907 > -1) {
                        int var25 = var17.field2635 * 30 / var17.field2636;
                        if (var25 > 30) {
                            var25 = 30;
                        }
                        class164.method2582(field1907 + arg0 - 15, field2021 + arg1 - 3, var25, 5, 65280);
                        class164.method2582(field1907 + arg0 - 15 + var25, field2021 + arg1 - 3, 30 - var25, 5, 16711680);
                    }
                }
                for (int var26 = 0; var26 < 4; var26++) {
                    if (var17.field2633[var26] > field1917) {
                        method1095(var17, var17.field2654 / 2);
                        if (field1907 > -1) {
                            if (var26 == 1) {
                                field2021 -= 20;
                            }
                            if (var26 == 2) {
                                field1907 -= 15;
                                field2021 -= 10;
                            }
                            if (var26 == 3) {
                                field1907 += 15;
                                field2021 -= 10;
                            }
                            Statics.field1104[var17.field2632[var26]].method2683(field1907 + arg0 - 12, field2021 + arg1 - 12);
                            Statics.field367.method2881(Integer.toString(var17.field2631[var26]), field1907 + arg0 - 1, field2021 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var27 = 0; var27 < field2008; var27++) {
            int var28 = field2013[var27];
            int var29 = field2014[var27];
            int var30 = field2163[var27];
            int var31 = field2012[var27];
            boolean var32 = true;
            while (var32) {
                var32 = false;
                for (int var33 = 0; var33 < var27; var33++) {
                    if (var29 + 2 > field2014[var33] - field2012[var33] && var29 - var31 < field2014[var33] + 2 && var28 - var30 < field2163[var33] + field2013[var33] && var28 + var30 > field2013[var33] - field2163[var33] && field2014[var33] - field2012[var33] < var29) {
                        var29 = field2014[var33] - field2012[var33];
                        var32 = true;
                    }
                }
            }
            field1907 = field2013[var27];
            field2021 = field2014[var27] = var29;
            String var34 = field2060[var27];
            if (field2081 == 0) {
                int var35 = 16776960;
                if (field2033[var27] < 6) {
                    var35 = field2193[field2033[var27]];
                }
                if (field2033[var27] == 6) {
                    var35 = field2044 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field2033[var27] == 7) {
                    var35 = field2044 % 20 < 10 ? 255 : 65535;
                }
                if (field2033[var27] == 8) {
                    var35 = field2044 % 20 < 10 ? 45056 : 8454016;
                }
                if (field2033[var27] == 9) {
                    int var36 = 150 - field2016[var27];
                    if (var36 < 50) {
                        var35 = var36 * 1280 + 16711680;
                    } else if (var36 < 100) {
                        var35 = 16776960 - (var36 - 50) * 327680;
                    } else if (var36 < 150) {
                        var35 = (var36 - 100) * 5 + 65280;
                    }
                }
                if (field2033[var27] == 10) {
                    int var37 = 150 - field2016[var27];
                    if (var37 < 50) {
                        var35 = var37 * 5 + 16711680;
                    } else if (var37 < 100) {
                        var35 = 16711935 - (var37 - 50) * 327680;
                    } else if (var37 < 150) {
                        var35 = (var37 - 100) * 327680 + 255 - (var37 - 100) * 5;
                    }
                }
                if (field2033[var27] == 11) {
                    int var38 = 150 - field2016[var27];
                    if (var38 < 50) {
                        var35 = 16777215 - var38 * 327685;
                    } else if (var38 < 100) {
                        var35 = (var38 - 50) * 327685 + 65280;
                    } else if (var38 < 150) {
                        var35 = 16777215 - (var38 - 100) * 327680;
                    }
                }
                if (field2015[var27] == 0) {
                    Statics.field678.method2881(var34, field1907 + arg0, field2021 + arg1, var35, 0);
                }
                if (field2015[var27] == 1) {
                    Statics.field678.method2811(var34, field1907 + arg0, field2021 + arg1, var35, 0, field2044);
                }
                if (field2015[var27] == 2) {
                    Statics.field678.method2812(var34, field1907 + arg0, field2021 + arg1, var35, 0, field2044);
                }
                if (field2015[var27] == 3) {
                    Statics.field678.method2813(var34, field1907 + arg0, field2021 + arg1, var35, 0, field2044, 150 - field2016[var27]);
                }
                if (field2015[var27] == 4) {
                    int var39 = (150 - field2016[var27]) * (Statics.field678.method2802(var34) + 100) / 150;
                    class164.method2577(field1907 + arg0 - 50, arg1, field1907 + arg0 + 50, arg1 + arg3);
                    Statics.field678.method2876(var34, field1907 + arg0 + 50 - var39, field2021 + arg1, var35, 0);
                    class164.method2576(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field2015[var27] == 5) {
                    int var40 = 150 - field2016[var27];
                    int var41 = 0;
                    if (var40 < 25) {
                        var41 = var40 - 25;
                    } else if (var40 > 125) {
                        var41 = var40 - 125;
                    }
                    class164.method2577(arg0, field2021 + arg1 - Statics.field678.field2559 - 1, arg0 + arg2, field2021 + arg1 + 5);
                    Statics.field678.method2881(var34, field1907 + arg0, field2021 + arg1 + var41, var35, 0);
                    class164.method2576(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field678.method2881(var34, field1907 + arg0, field2021 + arg1, 16776960, 0);
            }
        }
        method355(arg0, arg1);
        ((class54) Statics.field2540).method728(field1961);
        if (field2025 == 1) {
            Statics.field45[field2024 / 100].method2683(field2170 - 8, field1964 - 8);
        }
        if (field2025 == 2) {
            Statics.field45[field2024 / 100 + 4].method2683(field2170 - 8, field1964 - 8);
        }
        field2118 = 0;
        int var42 = (Statics.field1127.field2642 >> 7) + Statics.field1739;
        int var43 = (Statics.field1127.field2614 >> 7) + Statics.field1766;
        if (var42 >= 3053 && var42 <= 3156 && var43 >= 3056 && var43 <= 3136) {
            field2118 = 1;
        }
        if (var42 >= 3072 && var42 <= 3118 && var43 >= 9492 && var43 <= 9535) {
            field2118 = 1;
        }
        if (field2118 == 1 && var42 >= 3139 && var42 <= 3199 && var43 >= 3008 && var43 <= 3062) {
            field2118 = 0;
        }
        if (field1915) {
            int var44 = arg0 + 512 - 5;
            int var45 = arg1 + 20;
            Statics.field2160.method2808("Fps:" + field1536, var44, var45, 16776960, -1);
            int var52 = var45 + 15;
            Runtime var46 = Runtime.getRuntime();
            int var47 = (int) ((var46.totalMemory() - var46.freeMemory()) / 1024L);
            int var48 = 16776960;
            if (var47 > 32768 && field1912) {
                var48 = 16711680;
            }
            if (var47 > 65536 && !field1912) {
                var48 = 16711680;
            }
            Statics.field2160.method2808("Mem:" + var47 + "k", var44, var52, var48, -1);
            var45 = var52 + 15;
        }
        Statics.field1208 = var7;
        Statics.field345 = var8;
        Statics.field479 = var9;
        Statics.field543 = var10;
        Statics.field523 = var11;
        if (field2011) {
            byte var49 = 0;
            int var50 = class87.field1183 + class87.field1181 + var49;
            if (var50 == 0) {
                field2011 = false;
            }
        }
        if (field2011) {
            class164.method2582(arg0, arg1, arg2, arg3, 0);
            method771(class74.field867, false);
        }
        if (!field2011 && !field2064 && var14 >= arg0 && var14 < arg0 + arg2 && var15 >= arg1 && var15 < arg1 + arg3) {
            method510(var14, var15, arg0, arg1);
        }
    }

    @ObfuscatedName("cc.dy(ZB)V")
    public static final void method1126(boolean arg0) {
        if (Statics.field1127.field2642 >> 7 == field2156 && Statics.field1127.field2614 >> 7 == field2062) {
            field2156 = 0;
        }
        int var1 = field2038;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class182 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field1127;
                var4 = 33538048;
            } else {
                var3 = field2037[field2039[var2]];
                var4 = field2039[var2] << 14;
            }
            if (var3 != null && var3.method2900()) {
                var3.field2802 = false;
                if ((field1912 && field2038 > 50 || field2038 > 200) && !arg0 && var3.field2618 == var3.field2613) {
                    var3.field2802 = true;
                }
                int var5 = var3.field2642 >> 7;
                int var6 = var3.field2614 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field2790 == null || field1917 < var3.field2786 || field1917 >= var3.field2793) {
                        if ((var3.field2642 & 0x7F) == 64 && (var3.field2614 & 0x7F) == 64) {
                            if (field2044 == field2018[var5][var6]) {
                                continue;
                            }
                            field2018[var5][var6] = field2044;
                        }
                        var3.field2791 = method788(var3.field2642, var3.field2614, Statics.field1622);
                        Statics.field1155.method560(Statics.field1622, var3.field2642, var3.field2614, var3.field2791, 60, var3, var3.field2615, var4, var3.field2650);
                    } else {
                        var3.field2802 = false;
                        var3.field2791 = method788(var3.field2642, var3.field2614, Statics.field1622);
                        Statics.field1155.method561(Statics.field1622, var3.field2642, var3.field2614, var3.field2791, 60, var3, var3.field2615, var4, var3.field2798, var3.field2799, var3.field2785, var3.field2801);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.dv(ZI)V")
    public static final void method699(boolean arg0) {
        for (int var1 = 0; var1 < field2157; var1++) {
            class183 var2 = field1946[field1948[var1]];
            int var3 = (field1948[var1] << 14) + 536870912;
            if (var2 != null && var2.method2900() && var2.field2804.field2290 == arg0 && var2.field2804.method2317()) {
                int var4 = var2.field2642 >> 7;
                int var5 = var2.field2614 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field2668 == 1 && (var2.field2642 & 0x7F) == 64 && (var2.field2614 & 0x7F) == 64) {
                        if (field2044 == field2018[var4][var5]) {
                            continue;
                        }
                        field2018[var4][var5] = field2044;
                    }
                    if (!var2.field2804.field2298) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1155.method560(Statics.field1622, var2.field2642, var2.field2614, method788(var2.field2642 + (var2.field2668 * 64 - 64), var2.field2614 + (var2.field2668 * 64 - 64), Statics.field1622), var2.field2668 * 64 - 64 + 60, var2, var2.field2615, var3, var2.field2650);
                }
            }
        }
    }

    @ObfuscatedName("dh.da(I)V")
    public static final void method1334() {
        for (class174 var0 = (class174) field2003.method1305(); var0 != null; var0 = (class174) field2003.method1287()) {
            if (Statics.field1622 != var0.field2568 || field1917 > var0.field2583) {
                var0.method1307();
            } else if (field1917 >= var0.field2576) {
                if (var0.field2577 > 0) {
                    class183 var1 = field1946[var0.field2577 - 1];
                    if (var1 != null && var1.field2642 >= 0 && var1.field2642 < 13312 && var1.field2614 >= 0 && var1.field2614 < 13312) {
                        var0.method2886(var1.field2642, var1.field2614, method788(var1.field2642, var1.field2614, var0.field2568) - var0.field2567, field1917);
                    }
                }
                if (var0.field2577 < 0) {
                    int var2 = -var0.field2577 - 1;
                    class182 var3;
                    if (field2046 == var2) {
                        var3 = Statics.field1127;
                    } else {
                        var3 = field2037[var2];
                    }
                    if (var3 != null && var3.field2642 >= 0 && var3.field2642 < 13312 && var3.field2614 >= 0 && var3.field2614 < 13312) {
                        var0.method2886(var3.field2642, var3.field2614, method788(var3.field2642, var3.field2614, var0.field2568) - var0.field2567, field1917);
                    }
                }
                var0.method2888(field1961);
                Statics.field1155.method560(Statics.field1622, (int) var0.field2580, (int) var0.field2572, (int) var0.field2579, 60, var0, var0.field2587, -1, false);
            }
        }
    }

    @ObfuscatedName("cc.dx(I)V")
    public static final void method1127() {
        for (class177 var0 = (class177) field2055.method1305(); var0 != null; var0 = (class177) field2055.method1287()) {
            if (Statics.field1622 != var0.field2605 || var0.field2603) {
                var0.method1307();
            } else if (field1917 >= var0.field2604) {
                var0.method2894(field1961);
                if (var0.field2603) {
                    var0.method1307();
                } else {
                    Statics.field1155.method560(var0.field2605, var0.field2606, var0.field2612, var0.field2608, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("dz.dl(I)I")
    public static final int method1492() {
        int var0 = 3;
        if (Statics.field543 < 310) {
            int var1 = Statics.field1208 >> 7;
            int var2 = Statics.field479 >> 7;
            int var3 = Statics.field1127.field2642 >> 7;
            int var4 = Statics.field1127.field2614 >> 7;
            if ((class3.field18[Statics.field1622][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1622;
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
                    if ((class3.field18[Statics.field1622][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1622;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class3.field18[Statics.field1622][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1622;
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
                    if ((class3.field18[Statics.field1622][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1622;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class3.field18[Statics.field1622][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1622;
                        }
                    }
                }
            }
        }
        if ((class3.field18[Statics.field1622][Statics.field1127.field2642 >> 7][Statics.field1127.field2614 >> 7] & 0x4) != 0) {
            var0 = Statics.field1622;
        }
        return var0;
    }

    @ObfuscatedName("ad.dj(I)I")
    public static final int method399() {
        int var0 = method788(Statics.field1208, Statics.field479, Statics.field1622);
        return var0 - Statics.field345 >= 800 || (class3.field18[Statics.field1622][Statics.field1208 >> 7][Statics.field479 >> 7] & 0x4) == 0 ? 3 : Statics.field1622;
    }

    @ObfuscatedName("ap.dn(III)V")
    public static final void method355(int arg0, int arg1) {
        if (field2050 == 2) {
            method54((field1928 - Statics.field1739 << 7) + field2087, (field1929 - Statics.field1766 << 7) + field1932, field1930 * 2);
            if (field1907 > -1 && field1917 % 20 < 10) {
                Statics.field799[0].method2683(field1907 + arg0 - 12, field2021 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("ct.dz(Lfx;II)V")
    public static final void method1095(class178 arg0, int arg1) {
        method54(arg0.field2642, arg0.field2614, arg1);
    }

    @ObfuscatedName("k.di(IIII)V")
    public static final void method54(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field1907 = -1;
            field2021 = -1;
            return;
        }
        int var3 = method788(arg0, arg1, Statics.field1622) - arg2;
        int var4 = arg0 - Statics.field1208;
        int var5 = var3 - Statics.field345;
        int var6 = arg1 - Statics.field479;
        int var7 = class172.field2543[Statics.field543];
        int var8 = class172.field2544[Statics.field543];
        int var9 = class172.field2543[Statics.field523];
        int var10 = class172.field2544[Statics.field523];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field1907 = (var11 << 9) / var15 + 256;
            field2021 = (var14 << 9) / var15 + 167;
        } else {
            field1907 = -1;
            field2021 = -1;
        }
    }

    @ObfuscatedName("bx.db(IIIB)I")
    public static final int method788(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class3.field22[var5][var3][var4] + class3.field22[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class3.field22[var5][var3][var4 + 1] + class3.field22[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("bc.dc(IIIIIII)V")
    public static final void method885(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class172.field2543[var6];
            int var12 = class172.field2544[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class172.field2543[var7];
            int var15 = class172.field2544[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1208 = arg0 - var8;
        Statics.field345 = arg1 - var9;
        Statics.field479 = arg2 - var10;
        Statics.field543 = arg3;
        Statics.field523 = arg4;
    }

    @ObfuscatedName("ac.ed(ZI)V")
    public static final void method465(boolean arg0) {
        field1971 = arg0;
        if (!field1971) {
            int var1 = field1951.method1571();
            int var2 = field1951.method1604();
            int var3 = field1951.method1725();
            int var4 = (field1925 - field1951.field1722) / 16;
            Statics.field1211 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field1211[var5][var6] = field1951.method1613();
                }
            }
            int var7 = field1951.method1726();
            int var8 = field1951.method1725();
            Statics.field1614 = new int[var4];
            Statics.field1145 = new int[var4];
            Statics.field15 = new int[var4];
            Statics.field330 = new byte[var4][];
            Statics.field259 = new byte[var4][];
            boolean var9 = false;
            if ((var8 / 8 == 48 || var8 / 8 == 49) && var7 / 8 == 48) {
                var9 = true;
            }
            if (var8 / 8 == 48 && var7 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var8 - 6) / 8; var11 <= (var8 + 6) / 8; var11++) {
                for (int var12 = (var7 - 6) / 8; var12 <= (var7 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1614[var10] = var13;
                        Statics.field1145[var10] = Statics.field1560.method1022("m" + var11 + "_" + var12);
                        Statics.field15[var10] = Statics.field1560.method1022("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            Statics.method371(var8, var7, var1, var2, var3);
            return;
        }
        int var14 = field1951.method1668();
        int var15 = field1951.method1726();
        int var16 = field1951.method1726();
        int var17 = field1951.method1605();
        field1951.method2294();
        for (int var18 = 0; var18 < 4; var18++) {
            for (int var19 = 0; var19 < 13; var19++) {
                for (int var20 = 0; var20 < 13; var20++) {
                    int var21 = field1951.method2290(1);
                    if (var21 == 1) {
                        field1972[var18][var19][var20] = field1951.method2290(26);
                    } else {
                        field1972[var18][var19][var20] = -1;
                    }
                }
            }
        }
        field1951.method2291();
        int var22 = (field1925 - field1951.field1722) / 16;
        Statics.field1211 = new int[var22][4];
        for (int var23 = 0; var23 < var22; var23++) {
            for (int var24 = 0; var24 < 4; var24++) {
                Statics.field1211[var23][var24] = field1951.method1616();
            }
        }
        int var25 = field1951.method1726();
        Statics.field1614 = new int[var22];
        Statics.field1145 = new int[var22];
        Statics.field15 = new int[var22];
        Statics.field330 = new byte[var22][];
        Statics.field259 = new byte[var22][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field1972[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1614[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1614[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field1145[var26] = Statics.field1560.method1022("m" + var35 + "_" + var36);
                            Statics.field15[var26] = Statics.field1560.method1022("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        Statics.method371(var17, var16, var14, var15, var25);
    }

    @ObfuscatedName("by.ef(ZI)V")
    public static final void method879(boolean arg0) {
        method414();
        field1955++;
        if (field1955 < 50 && !arg0) {
            return;
        }
        field1955 = 0;
        if (field1960 || Statics.field677 == null) {
            return;
        }
        field2176.method2288(152);
        try {
            Statics.field677.method377(field2176.field1723, 0, field2176.field1722);
            field2176.field1722 = 0;
        } catch (IOException var2) {
            field1960 = true;
        }
    }

    @ObfuscatedName("ch.ey(IIIIIB)V")
    public static final void method1206(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1155.method575(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1155.method578(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1768.field2509;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class153 var13 = Statics.method1460(var12);
            if (var13.field2329 == -1) {
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
                class171 var14 = Statics.field2185[var13.field2329];
                if (var14 != null) {
                    int var15 = (var13.field2315 * 4 - var14.field2513) / 2;
                    int var16 = (var13.field2312 * 4 - var14.field2515) / 2;
                    var14.method2736(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field2312) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1155.method631(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1155.method578(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class153 var22 = Statics.method1460(var21);
            if (var22.field2329 != -1) {
                class171 var23 = Statics.field2185[var22.field2329];
                if (var23 != null) {
                    int var24 = (var22.field2315 * 4 - var23.field2513) / 2;
                    int var25 = (var22.field2312 * 4 - var23.field2515) / 2;
                    var23.method2736(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field2312) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1768.field2509;
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
        int var29 = Statics.field1155.method572(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class153 var31 = Statics.method1460(var30);
        if (var31.field2329 == -1) {
            return;
        }
        class171 var32 = Statics.field2185[var31.field2329];
        if (var32 != null) {
            int var33 = (var31.field2315 * 4 - var32.field2513) / 2;
            int var34 = (var31.field2312 * 4 - var32.field2515) / 2;
            var32.method2736(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field2312) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("dy.ec(IIII)Z")
    public static final boolean method1457(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field1155.method578(Statics.field1622, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class153 var7 = Statics.method1460(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field2315;
                var9 = var7.field2312;
            } else {
                var8 = var7.field2312;
                var9 = var7.field2315;
            }
            int var10 = var7.field2338;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field2170 = class36.field489;
        field1964 = class36.field494;
        field2025 = 2;
        field2024 = 0;
        return true;
    }

    @ObfuscatedName("aw.eu(IIIIZIIIIIII)Z")
    public static final boolean method721(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field1975[var11][var12] = 0;
                field1922[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field1975[arg0][arg1] = 99;
        field1922[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field1977[var15] = arg0;
        int var36 = var15 + 1;
        field2092[var15] = arg1;
        boolean var17 = false;
        int var18 = field1977.length;
        int[][] var19 = field1970[Statics.field1622].field1264;
        while (var36 != var16) {
            var13 = field1977[var16];
            var14 = field2092[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field1970[Statics.field1622].method1166(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field1970[Statics.field1622].method1167(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field1970[Statics.field1622].method1168(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field1922[var13][var14] + 1;
            if (var13 > 0 && field1975[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field1977[var36] = var13 - 1;
                field2092[var36] = var14;
                var36 = (var36 + 1) % var18;
                field1975[var13 - 1][var14] = 2;
                field1922[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field1975[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field1977[var36] = var13 + 1;
                field2092[var36] = var14;
                var36 = (var36 + 1) % var18;
                field1975[var13 + 1][var14] = 8;
                field1922[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field1975[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field1977[var36] = var13;
                field2092[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field1975[var13][var14 - 1] = 1;
                field1922[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field1975[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field1977[var36] = var13;
                field2092[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field1975[var13][var14 + 1] = 4;
                field1922[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field1975[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field1977[var36] = var13 - 1;
                field2092[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field1975[var13 - 1][var14 - 1] = 3;
                field1922[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field1975[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field1977[var36] = var13 + 1;
                field2092[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field1975[var13 + 1][var14 - 1] = 9;
                field1922[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field1975[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field1977[var36] = var13 - 1;
                field2092[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field1975[var13 - 1][var14 + 1] = 6;
                field1922[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field1975[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field1977[var36] = var13 + 1;
                field2092[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field1975[var13 + 1][var14 + 1] = 12;
                field1922[var13 + 1][var14 + 1] = var20;
            }
        }
        field1974 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field1922[var24][var25] < 100) {
                        int var26 = 0;
                        if (var24 < arg2) {
                            var26 = arg2 - var24;
                        } else if (var24 > arg2 + arg7 - 1) {
                            var26 = var24 - (arg2 + arg7 - 1);
                        }
                        int var27 = 0;
                        if (var25 < arg3) {
                            var27 = arg3 - var25;
                        } else if (var25 > arg3 + arg8 - 1) {
                            var27 = var25 - (arg3 + arg8 - 1);
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && field1922[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field1922[var24][var25];
                            var13 = var24;
                            var14 = var25;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg0 == var13 && arg1 == var14) {
                return false;
            }
            field1974 = 1;
        }
        byte var29 = 0;
        field1977[var29] = var13;
        int var37 = var29 + 1;
        field2092[var29] = var14;
        int var30;
        int var31 = var30 = field1975[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field1977[var37] = var13;
                field2092[var37++] = var14;
            }
            if ((var31 & 0x2) != 0) {
                var13++;
            } else if ((var31 & 0x8) != 0) {
                var13--;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            var31 = field1975[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = field1977[var37];
            int var34 = field2092[var37];
            if (arg10 == 0) {
                field2176.method2288(71);
                field2176.method1558(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field2176.method2288(75);
                field2176.method1558(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field2176.method2288(74);
                field2176.method1558(var32 + var32 + 3);
            }
            field2176.method1602(Statics.field1739 + var33);
            field2156 = field1977[0];
            field2062 = field2092[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field2176.method1591(field1977[var37] - var33);
                field2176.method1593(field2092[var37] - var34);
            }
            field2176.method1594(class35.field464[82] ? 1 : 0);
            field2176.method1559(Statics.field1766 + var34);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("cm.eb(B)V")
    public static final void method1011() {
        if (field2139 == 186) {
            int var0 = field1951.method1571();
            int var1 = (var0 >> 4 & 0x7) + Statics.field2485;
            int var2 = (var0 & 0x7) + Statics.field1615;
            int var3 = field1951.method1725();
            int var4 = field1951.method1725();
            int var5 = field1951.method1725();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class104 var6 = field2052[Statics.field1622][var1][var2];
                if (var6 != null) {
                    for (class176 var7 = (class176) var6.method1305(); var7 != null; var7 = (class176) var6.method1287()) {
                        if ((var3 & 0x7FFF) == var7.field2602 && var7.field2601 == var4) {
                            var7.field2601 = var5;
                            break;
                        }
                    }
                    method1008(var1, var2);
                }
            }
            return;
        }
        if (field2139 == 7) {
            int var8 = field1951.method1605();
            int var9 = field1951.method1605();
            int var10 = field1951.method1596();
            int var11 = var10 >> 2;
            int var12 = var10 & 0x3;
            int var13 = field1973[var11];
            byte var14 = field1951.method1599();
            byte var15 = field1951.method1622();
            byte var16 = field1951.method1562();
            byte var17 = field1951.method1572();
            int var18 = field1951.method1629();
            int var19 = (var18 >> 4 & 0x7) + Statics.field2485;
            int var20 = (var18 & 0x7) + Statics.field1615;
            int var21 = field1951.method1604();
            int var22 = field1951.method1725();
            class182 var23;
            if (field2046 == var22) {
                var23 = Statics.field1127;
            } else {
                var23 = field2037[var22];
            }
            if (var23 != null) {
                class153 var24 = Statics.method1460(var9);
                int var25;
                int var26;
                if (var12 == 1 || var12 == 3) {
                    var25 = var24.field2312;
                    var26 = var24.field2315;
                } else {
                    var25 = var24.field2315;
                    var26 = var24.field2312;
                }
                int var27 = (var25 >> 1) + var19;
                int var28 = (var25 + 1 >> 1) + var19;
                int var29 = (var26 >> 1) + var20;
                int var30 = (var26 + 1 >> 1) + var20;
                int[][] var31 = class3.field22[Statics.field1622];
                int var32 = var31[var27][var29] + var31[var28][var29] + var31[var27][var30] + var31[var28][var30] >> 2;
                int var33 = (var19 << 7) + (var25 << 6);
                int var34 = (var20 << 7) + (var26 << 6);
                class180 var35 = var24.method2344(var11, var12, var31, var33, var32, var34);
                if (var35 != null) {
                    method1458(Statics.field1622, var19, var20, var13, -1, 0, 0, var8 + 1, var21 + 1);
                    var23.field2786 = field1917 + var8;
                    var23.field2793 = field1917 + var21;
                    var23.field2790 = var35;
                    var23.field2794 = var19 * 128 + var25 * 64;
                    var23.field2796 = var20 * 128 + var26 * 64;
                    var23.field2795 = var32;
                    if (var14 > var16) {
                        byte var36 = var14;
                        var14 = var16;
                        var16 = var36;
                    }
                    if (var15 > var17) {
                        byte var37 = var15;
                        var15 = var17;
                        var17 = var37;
                    }
                    var23.field2798 = var14 + var19;
                    var23.field2785 = var16 + var19;
                    var23.field2799 = var15 + var20;
                    var23.field2801 = var17 + var20;
                }
            }
        }
        if (field2139 == 126) {
            int var38 = field1951.method1668();
            int var39 = (var38 >> 4 & 0x7) + Statics.field2485;
            int var40 = (var38 & 0x7) + Statics.field1615;
            int var41 = field1951.method1725();
            int var42 = field1951.method1604();
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                class176 var43 = new class176();
                var43.field2602 = var41;
                var43.field2601 = var42;
                if (field2052[Statics.field1622][var39][var40] == null) {
                    field2052[Statics.field1622][var39][var40] = new class104();
                }
                field2052[Statics.field1622][var39][var40].method1284(var43);
                method1008(var39, var40);
            }
        } else if (field2139 == 207) {
            int var44 = field1951.method1571();
            int var45 = (var44 >> 4 & 0x7) + Statics.field2485;
            int var46 = (var44 & 0x7) + Statics.field1615;
            int var47 = var45 + field1951.method1572();
            int var48 = var46 + field1951.method1572();
            int var49 = field1951.method1687();
            int var50 = field1951.method1725();
            int var51 = field1951.method1571() * 4;
            int var52 = field1951.method1571() * 4;
            int var53 = field1951.method1725();
            int var54 = field1951.method1725();
            int var55 = field1951.method1571();
            int var56 = field1951.method1571();
            if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104 && var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104 && var50 != 65535) {
                int var57 = var45 * 128 + 64;
                int var58 = var46 * 128 + 64;
                int var59 = var47 * 128 + 64;
                int var60 = var48 * 128 + 64;
                class174 var61 = new class174(var50, Statics.field1622, var57, var58, method788(var57, var58, Statics.field1622) - var51, field1917 + var53, field1917 + var54, var55, var56, var49, var52);
                var61.method2886(var59, var60, method788(var59, var60, Statics.field1622) - var52, field1917 + var53);
                field2003.method1284(var61);
            }
        } else if (field2139 == 209) {
            int var62 = field1951.method1604();
            int var63 = field1951.method1571();
            int var64 = (var63 >> 4 & 0x7) + Statics.field2485;
            int var65 = (var63 & 0x7) + Statics.field1615;
            if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
                class104 var66 = field2052[Statics.field1622][var64][var65];
                if (var66 != null) {
                    for (class176 var67 = (class176) var66.method1305(); var67 != null; var67 = (class176) var66.method1287()) {
                        if ((var62 & 0x7FFF) == var67.field2602) {
                            var67.method1307();
                            break;
                        }
                    }
                    if (var66.method1305() == null) {
                        field2052[Statics.field1622][var64][var65] = null;
                    }
                    method1008(var64, var65);
                }
            }
        } else if (field2139 == 125) {
            int var68 = field1951.method1571();
            int var69 = var68 >> 2;
            int var70 = var68 & 0x3;
            int var71 = field1973[var69];
            int var72 = field1951.method1629();
            int var73 = (var72 >> 4 & 0x7) + Statics.field2485;
            int var74 = (var72 & 0x7) + Statics.field1615;
            if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                method1458(Statics.field1622, var73, var74, var71, -1, var69, var70, 0, -1);
            }
        } else if (field2139 == 173) {
            int var75 = field1951.method1571();
            int var76 = (var75 >> 4 & 0x7) + Statics.field2485;
            int var77 = (var75 & 0x7) + Statics.field1615;
            int var78 = field1951.method1725();
            int var79 = field1951.method1571();
            int var80 = field1951.method1725();
            if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                int var81 = var76 * 128 + 64;
                int var82 = var77 * 128 + 64;
                class177 var83 = new class177(var78, Statics.field1622, var81, var82, method788(var81, var82, Statics.field1622) - var79, var80, field1917);
                field2055.method1284(var83);
            }
        } else if (field2139 == 57) {
            int var84 = field1951.method1604();
            int var85 = field1951.method1668();
            int var86 = (var85 >> 4 & 0x7) + Statics.field2485;
            int var87 = (var85 & 0x7) + Statics.field1615;
            int var88 = field1951.method1604();
            int var89 = field1951.method1605();
            if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104 && field2046 != var84) {
                class176 var90 = new class176();
                var90.field2602 = var88;
                var90.field2601 = var89;
                if (field2052[Statics.field1622][var86][var87] == null) {
                    field2052[Statics.field1622][var86][var87] = new class104();
                }
                field2052[Statics.field1622][var86][var87].method1284(var90);
                method1008(var86, var87);
            }
        } else if (field2139 == 11) {
            int var91 = field1951.method1629();
            int var92 = var91 >> 2;
            int var93 = var91 & 0x3;
            int var94 = field1973[var92];
            int var95 = field1951.method1668();
            int var96 = (var95 >> 4 & 0x7) + Statics.field2485;
            int var97 = (var95 & 0x7) + Statics.field1615;
            int var98 = field1951.method1726();
            if (var96 >= 0 && var97 >= 0 && var96 < 103 && var97 < 103) {
                if (var94 == 0) {
                    class45 var99 = Statics.field1155.method548(Statics.field1622, var96, var97);
                    if (var99 != null) {
                        int var100 = var99.field640 >> 14 & 0x7FFF;
                        if (var92 == 2) {
                            var99.field638 = new class175(var100, 2, var93 + 4, Statics.field1622, var96, var97, var98, false, var99.field638);
                            var99.field639 = new class175(var100, 2, var93 + 1 & 0x3, Statics.field1622, var96, var97, var98, false, var99.field639);
                        } else {
                            var99.field638 = new class175(var100, var92, var93, Statics.field1622, var96, var97, var98, false, var99.field638);
                        }
                    }
                }
                if (var94 == 1) {
                    class53 var101 = Statics.field1155.method667(Statics.field1622, var96, var97);
                    if (var101 != null) {
                        int var102 = var101.field694 >> 14 & 0x7FFF;
                        if (var92 == 4 || var92 == 5) {
                            var101.field701 = new class175(var102, 4, var93, Statics.field1622, var96, var97, var98, false, var101.field701);
                        } else if (var92 == 6) {
                            var101.field701 = new class175(var102, 4, var93 + 4, Statics.field1622, var96, var97, var98, false, var101.field701);
                        } else if (var92 == 7) {
                            var101.field701 = new class175(var102, 4, (var93 + 2 & 0x3) + 4, Statics.field1622, var96, var97, var98, false, var101.field701);
                        } else if (var92 == 8) {
                            var101.field701 = new class175(var102, 4, var93 + 4, Statics.field1622, var96, var97, var98, false, var101.field701);
                            var101.field696 = new class175(var102, 4, (var93 + 2 & 0x3) + 4, Statics.field1622, var96, var97, var98, false, var101.field696);
                        }
                    }
                }
                if (var94 == 2) {
                    class47 var103 = Statics.field1155.method573(Statics.field1622, var96, var97);
                    if (var92 == 11) {
                        var92 = 10;
                    }
                    if (var103 != null) {
                        var103.field657 = new class175(var103.field662 >> 14 & 0x7FFF, var92, var93, Statics.field1622, var96, var97, var98, false, var103.field657);
                    }
                }
                if (var94 == 3) {
                    class52 var104 = Statics.field1155.method585(Statics.field1622, var96, var97);
                    if (var104 != null) {
                        var104.field691 = new class175(var104.field690 >> 14 & 0x7FFF, 22, var93, Statics.field1622, var96, var97, var98, false, var104.field691);
                    }
                }
            }
        } else if (field2139 == 205) {
            int var105 = field1951.method1571();
            int var106 = (var105 >> 4 & 0x7) + Statics.field2485;
            int var107 = (var105 & 0x7) + Statics.field1615;
            int var108 = field1951.method1571();
            int var109 = var108 >> 2;
            int var110 = var108 & 0x3;
            int var111 = field1973[var109];
            int var112 = field1951.method1604();
            if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104) {
                method1458(Statics.field1622, var106, var107, var111, var112, var109, var110, 0, -1);
            }
        } else if (field2139 == 146) {
            int var113 = field1951.method1571();
            int var114 = (var113 >> 4 & 0x7) + Statics.field2485;
            int var115 = (var113 & 0x7) + Statics.field1615;
            int var116 = field1951.method1725();
            int var117 = field1951.method1571();
            int var118 = var117 >> 4 & 0xF;
            int var119 = var117 & 0x7;
            int var120 = field1951.method1571();
            if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104) {
                int var121 = var118 + 1;
                if (Statics.field1127.field2666[0] >= var114 - var121 && Statics.field1127.field2666[0] <= var114 + var121 && Statics.field1127.field2649[0] >= var115 - var121 && Statics.field1127.field2649[0] <= var115 + var121 && field1953 != 0 && var119 > 0 && field1992 < 50) {
                    field2172[field1992] = var116;
                    field2095[field1992] = var119;
                    field1989[field1992] = var120;
                    field1931[field1992] = null;
                    field2017[field1992] = (var114 << 16) + (var115 << 8) + var118;
                    field1992++;
                }
            }
        }
    }

    @ObfuscatedName("dy.em(IIIIIIIIII)V")
    public static final void method1458(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class127 var9 = null;
        for (class127 var10 = (class127) field2053.method1305(); var10 != null; var10 = (class127) field2053.method1287()) {
            if (var10.field1637 == arg0 && var10.field1628 == arg1 && var10.field1629 == arg2 && var10.field1627 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class127();
            var9.field1637 = arg0;
            var9.field1627 = arg3;
            var9.field1628 = arg1;
            var9.field1629 = arg2;
            method540(var9);
            field2053.method1284(var9);
        }
        var9.field1633 = arg4;
        var9.field1635 = arg5;
        var9.field1636 = arg6;
        var9.field1630 = arg7;
        var9.field1626 = arg8;
    }

    @ObfuscatedName("bw.eg(S)V")
    public static final void method869() {
        for (class127 var0 = (class127) field2053.method1305(); var0 != null; var0 = (class127) field2053.method1287()) {
            if (var0.field1626 == -1) {
                var0.field1630 = 0;
                method540(var0);
            } else {
                var0.method1307();
            }
        }
    }

    @ObfuscatedName("ay.eh(Ldz;B)V")
    public static final void method540(class127 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1627 == 0) {
            var1 = Statics.field1155.method575(arg0.field1637, arg0.field1628, arg0.field1629);
        }
        if (arg0.field1627 == 1) {
            var1 = Statics.field1155.method676(arg0.field1637, arg0.field1628, arg0.field1629);
        }
        if (arg0.field1627 == 2) {
            var1 = Statics.field1155.method631(arg0.field1637, arg0.field1628, arg0.field1629);
        }
        if (arg0.field1627 == 3) {
            var1 = Statics.field1155.method572(arg0.field1637, arg0.field1628, arg0.field1629);
        }
        if (var1 != 0) {
            int var5 = Statics.field1155.method578(arg0.field1637, arg0.field1628, arg0.field1629, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1631 = var2;
        arg0.field1632 = var3;
        arg0.field1634 = var4;
    }

    @ObfuscatedName("dr.ej(I)V")
    public static final void method1421() {
        for (class127 var0 = (class127) field2053.method1305(); var0 != null; var0 = (class127) field2053.method1287()) {
            if (var0.field1626 > 0) {
                var0.field1626--;
            }
            if (var0.field1626 == 0) {
                if (var0.field1631 >= 0) {
                    int var1 = var0.field1631;
                    int var2 = var0.field1632;
                    class153 var3 = Statics.method1460(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method2341(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method1742(var0.field1637, var0.field1627, var0.field1628, var0.field1629, var0.field1631, var0.field1634, var0.field1632);
                var0.method1307();
            } else {
                if (var0.field1630 > 0) {
                    var0.field1630--;
                }
                if (var0.field1630 == 0 && var0.field1628 >= 1 && var0.field1629 >= 1 && var0.field1628 <= 102 && var0.field1629 <= 102) {
                    if (var0.field1633 >= 0) {
                        int var5 = var0.field1633;
                        int var6 = var0.field1635;
                        class153 var7 = Statics.method1460(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method2341(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method1742(var0.field1637, var0.field1627, var0.field1628, var0.field1629, var0.field1633, var0.field1636, var0.field1635);
                    var0.field1630 = -1;
                    if (var0.field1633 == var0.field1631 && var0.field1631 == -1) {
                        var0.method1307();
                    } else if (var0.field1633 == var0.field1631 && var0.field1636 == var0.field1634 && var0.field1635 == var0.field1632) {
                        var0.method1307();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ec.ev(IIIIIIIS)V")
    public static final void method1742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field1912 && Statics.field1622 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1155.method575(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1155.method676(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1155.method631(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1155.method572(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1155.method578(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1155.method604(arg0, arg2, arg3);
                class153 var15 = Statics.method1460(var12);
                if (var15.field2317 != 0) {
                    field1970[arg0].method1162(arg2, arg3, var13, var14, var15.field2318);
                }
            }
            if (arg1 == 1) {
                Statics.field1155.method567(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1155.method596(arg0, arg2, arg3);
                class153 var16 = Statics.method1460(var12);
                if (var16.field2315 + arg2 > 103 || var16.field2315 + arg3 > 103 || var16.field2312 + arg2 > 103 || var16.field2312 + arg3 > 103) {
                    return;
                }
                if (var16.field2317 != 0) {
                    field1970[arg0].method1163(arg2, arg3, var16.field2315, var16.field2312, var14, var16.field2318);
                }
            }
            if (arg1 == 3) {
                Statics.field1155.method569(arg0, arg2, arg3);
                class153 var17 = Statics.method1460(var12);
                if (var17.field2317 == 1) {
                    field1970[arg0].method1165(arg2, arg3);
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
        class3.method1469(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field1155, field1970[arg0]);
    }

    @ObfuscatedName("cm.es(III)V")
    public static final void method1008(int arg0, int arg1) {
        class104 var2 = field2052[Statics.field1622][arg0][arg1];
        if (var2 == null) {
            Statics.field1155.method570(Statics.field1622, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class176 var4 = null;
        for (class176 var5 = (class176) var2.method1305(); var5 != null; var5 = (class176) var2.method1287()) {
            class161 var6 = class161.method2496(var5.field2602);
            int var7 = var6.field2444;
            if (var6.field2453 == 1) {
                var7 = (var5.field2601 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field1155.method570(Statics.field1622, arg0, arg1);
            return;
        }
        var2.method1281(var4);
        class176 var8 = null;
        class176 var9 = null;
        for (class176 var10 = (class176) var2.method1305(); var10 != null; var10 = (class176) var2.method1287()) {
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
        Statics.field1155.method556(Statics.field1622, arg0, arg1, method788(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1622), var4, var11, var8, var9);
    }

    @ObfuscatedName("ap.en(B)V")
    public static final void method356() {
        field2045 = 0;
        field2040 = 0;
        field1951.method2294();
        int var0 = field1951.method2290(1);
        if (var0 != 0) {
            int var1 = field1951.method2290(2);
            if (var1 == 0) {
                field2041[++field2040 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field1951.method2290(3);
                Statics.field1127.method2896(var2, false);
                int var3 = field1951.method2290(1);
                if (var3 == 1) {
                    field2041[++field2040 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field1951.method2290(3);
                Statics.field1127.method2896(var4, true);
                int var5 = field1951.method2290(3);
                Statics.field1127.method2896(var5, true);
                int var6 = field1951.method2290(1);
                if (var6 == 1) {
                    field2041[++field2040 - 1] = 2047;
                }
            } else if (var1 == 3) {
                int var7 = field1951.method2290(7);
                Statics.field1622 = field1951.method2290(2);
                int var8 = field1951.method2290(1);
                if (var8 == 1) {
                    field2041[++field2040 - 1] = 2047;
                }
                int var9 = field1951.method2290(1);
                int var10 = field1951.method2290(7);
                Statics.field1127.method2897(var10, var7, var9 == 1);
            }
        }
        method871();
        method1154();
        method1100();
        for (int var11 = 0; var11 < field2045; var11++) {
            int var12 = field2000[var11];
            if (field1917 != field2037[var12].field2660) {
                field2037[var12] = null;
            }
        }
        if (field1925 != field1951.field1722) {
            throw new RuntimeException(field1951.field1722 + class1.field3 + field1925);
        }
        for (int var13 = 0; var13 < field2038; var13++) {
            if (field2037[field2039[var13]] == null) {
                throw new RuntimeException(var13 + class1.field3 + field2038);
            }
        }
    }

    @ObfuscatedName("bw.eo(B)V")
    public static final void method871() {
        int var0 = field1951.method2290(8);
        if (var0 < field2038) {
            for (int var1 = var0; var1 < field2038; var1++) {
                field2000[++field2045 - 1] = field2039[var1];
            }
        }
        if (var0 > field2038) {
            throw new RuntimeException("");
        }
        field2038 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field2039[var2];
            class182 var4 = field2037[var3];
            int var5 = field1951.method2290(1);
            if (var5 == 0) {
                field2039[++field2038 - 1] = var3;
                var4.field2660 = field1917;
            } else {
                int var6 = field1951.method2290(2);
                if (var6 == 0) {
                    field2039[++field2038 - 1] = var3;
                    var4.field2660 = field1917;
                    field2041[++field2040 - 1] = var3;
                } else if (var6 == 1) {
                    field2039[++field2038 - 1] = var3;
                    var4.field2660 = field1917;
                    int var7 = field1951.method2290(3);
                    var4.method2896(var7, false);
                    int var8 = field1951.method2290(1);
                    if (var8 == 1) {
                        field2041[++field2040 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field2039[++field2038 - 1] = var3;
                    var4.field2660 = field1917;
                    int var9 = field1951.method2290(3);
                    var4.method2896(var9, true);
                    int var10 = field1951.method2290(3);
                    var4.method2896(var10, true);
                    int var11 = field1951.method2290(1);
                    if (var11 == 1) {
                        field2041[++field2040 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field2000[++field2045 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("ca.ew(B)V")
    public static final void method1154() {
        while (true) {
            if (field1951.method2292(field1925) >= 11) {
                int var0 = field1951.method2290(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field2037[var0] == null) {
                        field2037[var0] = new class182();
                        if (field2042[var0] != null) {
                            field2037[var0].method3034(field2042[var0]);
                        }
                        var1 = true;
                    }
                    field2039[++field2038 - 1] = var0;
                    class182 var2 = field2037[var0];
                    var2.field2660 = field1917;
                    int var3 = field1951.method2290(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = field1951.method2290(1);
                    if (var4 == 1) {
                        field2041[++field2040 - 1] = var0;
                    }
                    int var5 = field1951.method2290(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field1951.method2290(1);
                    int var7 = field2098[field1951.method2290(3)];
                    if (var1) {
                        var2.field2662 = var2.field2615 = var7;
                    }
                    var2.method2897(Statics.field1127.field2666[0] + var3, Statics.field1127.field2649[0] + var5, var6 == 1);
                    continue;
                }
            }
            field1951.method2291();
            return;
        }
    }

    @ObfuscatedName("cv.eq(I)V")
    public static final void method1100() {
        for (int var0 = 0; var0 < field2040; var0++) {
            int var1 = field2041[var0];
            class182 var2 = field2037[var1];
            int var3 = field1951.method1571();
            if ((var3 & 0x1) != 0) {
                var3 += field1951.method1571() << 8;
            }
            method326(var1, var2, var3);
        }
    }

    @ObfuscatedName("p.er(ILfl;IS)V")
    public static final void method326(int arg0, class182 arg1, int arg2) {
        if ((arg2 & 0x2) != 0) {
            arg1.field2626 = field1951.method1726();
            arg1.field2639 = field1951.method1605();
        }
        if ((arg2 & 0x10) != 0) {
            arg1.field2661 = field1951.method1716();
            if (arg1.field2661.charAt(0) == '~') {
                arg1.field2661 = arg1.field2661.substring(1);
                method701(2, arg1.field2797, arg1.field2661);
            } else if (Statics.field1127 == arg1) {
                method701(2, arg1.field2797, arg1.field2661);
            }
            arg1.field2628 = 0;
            arg1.field2629 = 0;
            arg1.field2627 = 150;
        }
        if ((arg2 & 0x8) != 0) {
            int var3 = field1951.method1668();
            int var4 = field1951.method1668();
            arg1.method2898(var3, var4, field1917);
            arg1.field2634 = field1917 + 300;
            arg1.field2635 = field1951.method1629();
            arg1.field2636 = field1951.method1668();
        }
        if ((arg2 & 0x200) != 0) {
            int var5 = field1951.method1571();
            int var6 = field1951.method1668();
            arg1.method2898(var5, var6, field1917);
            arg1.field2634 = field1917 + 300;
            arg1.field2635 = field1951.method1668();
            arg1.field2636 = field1951.method1571();
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field2653 = field1951.method1629();
            arg1.field2670 = field1951.method1668();
            arg1.field2646 = field1951.method1596();
            arg1.field2623 = field1951.method1596();
            arg1.field2657 = field1951.method1726() + field1917;
            arg1.field2658 = field1951.method1605() + field1917;
            arg1.field2659 = field1951.method1596();
            arg1.field2665 = 1;
            arg1.field2624 = 0;
        }
        if ((arg2 & 0x80) != 0) {
            int var7 = field1951.method1725();
            int var8 = field1951.method1596();
            int var9 = field1951.method1629();
            int var10 = field1951.field1722;
            if (arg1.field2797 != null && arg1.field2792 != null) {
                boolean var11 = false;
                if (var8 <= 1 && method511(arg1.field2797)) {
                    var11 = true;
                }
                if (!var11 && field2118 == 0) {
                    field1983.field1722 = 0;
                    field1951.method1582(field1983.field1723, 0, var9);
                    field1983.field1722 = 0;
                    class135 var12 = field1983;
                    String var16;
                    try {
                        int var13 = var12.method1603();
                        if (var13 > 32767) {
                            var13 = 32767;
                        }
                        byte[] var14 = new byte[var13];
                        var12.field1722 += Statics.field1507.method773(var12.field1723, var12.field1722, var14, 0, var13);
                        String var15 = Statics.method9(var14, 0, var13);
                        var16 = var15;
                    } catch (Exception var26) {
                        var16 = "Cabbage";
                    }
                    String var19 = class173.method2806(class82.method45(var16));
                    arg1.field2661 = var19.trim();
                    arg1.field2628 = var7 >> 8;
                    arg1.field2629 = var7 & 0xFF;
                    arg1.field2627 = 150;
                    if (var8 == 2 || var8 == 3) {
                        method701(1, Statics.method1420(1) + arg1.field2797, var19);
                    } else if (var8 == 1) {
                        method701(1, Statics.method1420(0) + arg1.field2797, var19);
                    } else {
                        method701(2, arg1.field2797, var19);
                    }
                }
            }
            field1951.field1722 = var9 + var10;
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field2640 = field1951.method1725();
            int var20 = field1951.method1613();
            arg1.field2652 = var20 >> 16;
            arg1.field2651 = (var20 & 0xFFFF) + field1917;
            arg1.field2619 = 0;
            arg1.field2616 = 0;
            if (arg1.field2651 > field1917) {
                arg1.field2619 = -1;
            }
            if (arg1.field2640 == 65535) {
                arg1.field2640 = -1;
            }
        }
        if ((arg2 & 0x4) != 0) {
            int var21 = field1951.method1726();
            if (var21 == 65535) {
                var21 = -1;
            }
            int var22 = field1951.method1571();
            method1102(arg1, var21, var22);
        }
        if ((arg2 & 0x20) != 0) {
            int var23 = field1951.method1596();
            byte[] var24 = new byte[var23];
            class135 var25 = new class135(var24);
            field1951.method1615(var24, 0, var23);
            field2042[arg0] = var25;
            arg1.method3034(var25);
        }
        if ((arg2 & 0x40) != 0) {
            arg1.field2637 = field1951.method1605();
            if (arg1.field2637 == 65535) {
                arg1.field2637 = -1;
            }
        }
    }

    @ObfuscatedName("g.ez(IIB)V")
    public static final void method106(int arg0, int arg1) {
        if (field1947 < 2 && field2073 == 0 && !field2075) {
            return;
        }
        String var2;
        if (field2073 == 1 && field1947 < 2) {
            var2 = class74.field999 + class74.field985 + field2074 + " " + class1.field6;
        } else if (field2075 && field1947 < 2) {
            var2 = field2077 + class74.field985 + field2155 + " " + class1.field6;
        } else {
            var2 = method1331(field1947 - 1);
        }
        if (field1947 > 2) {
            var2 = var2 + class1.method47(16777215) + " " + '/' + " " + (field1947 - 2) + class74.field1003;
        }
        Statics.field678.method2814(var2, arg0 + 4, arg1 + 15, 16777215, 0, field1917 / 1000);
    }

    @ObfuscatedName("cd.el(IIIII)V")
    public static final void method966(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field2123; var4++) {
            if (field2130[var4] + field2128[var4] > arg0 && field2128[var4] < arg0 + arg2 && field2131[var4] + field1950[var4] > arg1 && field1950[var4] < arg1 + arg3) {
                field2125[var4] = true;
            }
        }
    }

    @ObfuscatedName("cj.ep(IIIII)V")
    public static final void method984(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field2123; var4++) {
            if (field2130[var4] + field2128[var4] > arg0 && field2128[var4] < arg0 + arg2 && field2131[var4] + field1950[var4] > arg1 && field1950[var4] < arg1 + arg3) {
                field2126[var4] = true;
            }
        }
    }

    @ObfuscatedName("dq.ea(B)V")
    public static final void method1330() {
        int var0 = Statics.field678.method2802(class74.field939);
        for (int var1 = 0; var1 < field1947; var1++) {
            int var2 = Statics.field678.method2802(method1331(var1));
            if (var2 > var0) {
                var0 = var2;
            }
        }
        var0 += 8;
        int var3 = field1947 * 15 + 21;
        int var4 = class36.field489 - var0 / 2;
        if (var0 + var4 > 765) {
            var4 = 765 - var0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class36.field494;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        field2064 = true;
        Statics.field1558 = var4;
        Statics.field10 = var5;
        Statics.field113 = var0;
        Statics.field1574 = field1947 * 15 + 22;
    }

    @ObfuscatedName("er.ei(II)Z")
    public static final boolean method2306(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field2097[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("k.fu(II)V")
    public static final void method55(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field2020[arg0];
        int var2 = field2180[arg0];
        int var3 = field2097[arg0];
        int var4 = field2066[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 38) {
            method696();
            class140 var5 = class140.method53(var2);
            field2073 = 1;
            Statics.field1721 = var1;
            Statics.field2250 = var2;
            Statics.field1477 = var4;
            method968(var5);
            field2074 = class1.method47(16748608) + class161.method2496(var4).field2432 + class1.method47(16777215);
            if (field2074 == null) {
                field2074 = "null";
            }
            return;
        }
        if (var3 == 5) {
            method1457(var1, var2, var4);
            field2176.method2288(177);
            field2176.method1688(Statics.field1766 + var2);
            field2176.method1559(var4 >> 14 & 0x7FFF);
            field2176.method1601(Statics.field1739 + var1);
        }
        if (var3 == 21) {
            boolean var6 = method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var6) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field2170 = class36.field489;
            field1964 = class36.field494;
            field2025 = 2;
            field2024 = 0;
            field2176.method2288(3);
            field2176.method1601(Statics.field1739 + var1);
            field2176.method1602(var4);
            field2176.method1559(Statics.field1766 + var2);
        }
        if (var3 == 48) {
            class182 var8 = field2037[var4];
            if (var8 != null) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var8.field2666[0], var8.field2649[0], false, 0, 0, 1, 1, 0, 2);
                field2170 = class36.field489;
                field1964 = class36.field494;
                field2025 = 2;
                field2024 = 0;
                field2176.method2288(109);
                field2176.method1559(var4);
            }
        }
        if (var3 == 41) {
            field2176.method2288(125);
            field2176.method1601(var4);
            field2176.method1609(var2);
            field2176.method1688(var1);
            field2026 = 0;
            Statics.field522 = class140.method53(var2);
            field2027 = var1;
        }
        if (var3 == 25) {
            class140 var9 = class140.method858(var2, var1);
            if (var9 != null) {
                method696();
                int var12 = method357(var9);
                int var13 = var12 >> 11 & 0x3F;
                method742(var2, var1, var13);
                field2073 = 0;
                int var14 = method357(var9);
                int var15 = var14 >> 11 & 0x3F;
                String var16;
                if (var15 == 0) {
                    var16 = null;
                } else if (var9.field1844 == null || var9.field1844.trim().length() == 0) {
                    var16 = null;
                } else {
                    var16 = var9.field1844;
                }
                field2077 = var16;
                if (field2077 == null) {
                    field2077 = "Null";
                }
                if (var9.field1777) {
                    field2155 = var9.field1838 + class1.method47(16777215);
                } else {
                    field2155 = class1.method47(65280) + var9.field1878 + class1.method47(16777215);
                }
            }
            return;
        }
        if (var3 == 58) {
            field2176.method2288(28);
            field2176.method1611(Statics.field41);
            field2176.method1601(var1);
            field2176.method1610(var2);
            field2176.method1601(field2023);
        }
        if (var3 == 4) {
            method1457(var1, var2, var4);
            field2176.method2288(100);
            field2176.method1688(var4 >> 14 & 0x7FFF);
            field2176.method1559(Statics.field1766 + var2);
            field2176.method1559(Statics.field1739 + var1);
        }
        if (var3 == 1002) {
            field2170 = class36.field489;
            field1964 = class36.field494;
            field2025 = 2;
            field2024 = 0;
            field2176.method2288(43);
            field2176.method1602(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 33) {
            field2176.method2288(150);
            field2176.method1602(var1);
            field2176.method1609(var2);
            field2176.method1688(var4);
            field2026 = 0;
            Statics.field522 = class140.method53(var2);
            field2027 = var1;
        }
        if (var3 == 14) {
            class182 var17 = field2037[var4];
            if (var17 != null) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var17.field2666[0], var17.field2649[0], false, 0, 0, 1, 1, 0, 2);
                field2170 = class36.field489;
                field1964 = class36.field494;
                field2025 = 2;
                field2024 = 0;
                field2176.method2288(48);
                field2176.method1601(var4);
                field2176.method1609(Statics.field2250);
                field2176.method1559(Statics.field1721);
                field2176.method1601(Statics.field1477);
            }
        }
        if (var3 == 46) {
            class182 var18 = field2037[var4];
            if (var18 != null) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var18.field2666[0], var18.field2649[0], false, 0, 0, 1, 1, 0, 2);
                field2170 = class36.field489;
                field1964 = class36.field494;
                field2025 = 2;
                field2024 = 0;
                field2176.method2288(107);
                field2176.method1688(var4);
            }
        }
        if (var3 == 50) {
            class182 var19 = field2037[var4];
            if (var19 != null) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var19.field2666[0], var19.field2649[0], false, 0, 0, 1, 1, 0, 2);
                field2170 = class36.field489;
                field1964 = class36.field494;
                field2025 = 2;
                field2024 = 0;
                field2176.method2288(178);
                field2176.method1601(var4);
            }
        }
        if (var3 == 32) {
            field2176.method2288(194);
            field2176.method1609(var2);
            field2176.method1688(var1);
            field2176.method1601(var4);
            field2176.method1561(Statics.field41);
            field2176.method1559(field2023);
            field2026 = 0;
            Statics.field522 = class140.method53(var2);
            field2027 = var1;
        }
        if (var3 == 1003) {
            field2170 = class36.field489;
            field1964 = class36.field494;
            field2025 = 2;
            field2024 = 0;
            class183 var20 = field1946[var4];
            if (var20 != null) {
                class152 var21 = var20.field2804;
                if (var21.field2295 != null) {
                    var21 = var21.method2316();
                }
                if (var21 != null) {
                    field2176.method2288(175);
                    field2176.method1559(var21.field2292);
                }
            }
        }
        if (var3 == 12) {
            class183 var22 = field1946[var4];
            if (var22 != null) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var22.field2666[0], var22.field2649[0], false, 0, 0, 1, 1, 0, 2);
                field2170 = class36.field489;
                field1964 = class36.field494;
                field2025 = 2;
                field2024 = 0;
                field2176.method2288(62);
                field2176.method1688(var4);
            }
        }
        if (var3 == 19) {
            boolean var23 = method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var23) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field2170 = class36.field489;
            field1964 = class36.field494;
            field2025 = 2;
            field2024 = 0;
            field2176.method2288(242);
            field2176.method1688(Statics.field1766 + var2);
            field2176.method1688(Statics.field1739 + var1);
            field2176.method1688(var4);
        }
        if (var3 == 39) {
            field2176.method2288(244);
            field2176.method1688(var1);
            field2176.method1688(var4);
            field2176.method1610(var2);
            field2026 = 0;
            Statics.field522 = class140.method53(var2);
            field2027 = var1;
        }
        if (var3 == 7) {
            class183 var25 = field1946[var4];
            if (var25 != null) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var25.field2666[0], var25.field2649[0], false, 0, 0, 1, 1, 0, 2);
                field2170 = class36.field489;
                field1964 = class36.field494;
                field2025 = 2;
                field2024 = 0;
                field2176.method2288(238);
                field2176.method1688(Statics.field1721);
                field2176.method1601(var4);
                field2176.method1609(Statics.field2250);
                field2176.method1688(Statics.field1477);
            }
        }
        if (var3 == 9) {
            class183 var26 = field1946[var4];
            if (var26 != null) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var26.field2666[0], var26.field2649[0], false, 0, 0, 1, 1, 0, 2);
                field2170 = class36.field489;
                field1964 = class36.field494;
                field2025 = 2;
                field2024 = 0;
                field2176.method2288(192);
                field2176.method1559(var4);
            }
        }
        if (var3 == 23) {
            Statics.field1155.method655(Statics.field1622, var1, var2);
        }
        if (var3 == 35) {
            field2176.method2288(158);
            field2176.method1602(var1);
            field2176.method1601(var4);
            field2176.method1609(var2);
            field2026 = 0;
            Statics.field522 = class140.method53(var2);
            field2027 = var1;
        }
        if (var3 == 51) {
            class182 var27 = field2037[var4];
            if (var27 != null) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var27.field2666[0], var27.field2649[0], false, 0, 0, 1, 1, 0, 2);
                field2170 = class36.field489;
                field1964 = class36.field494;
                field2025 = 2;
                field2024 = 0;
                field2176.method2288(186);
                field2176.method1602(var4);
            }
        }
        if (var3 == 34) {
            field2176.method2288(135);
            field2176.method1601(var1);
            field2176.method1609(var2);
            field2176.method1601(var4);
            field2026 = 0;
            Statics.field522 = class140.method53(var2);
            field2027 = var1;
        }
        if (var3 == 22) {
            boolean var28 = method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var28) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field2170 = class36.field489;
            field1964 = class36.field494;
            field2025 = 2;
            field2024 = 0;
            field2176.method2288(98);
            field2176.method1559(var4);
            field2176.method1688(Statics.field1766 + var2);
            field2176.method1559(Statics.field1739 + var1);
        }
        if (var3 == 29) {
            field2176.method2288(44);
            field2176.method1561(var2);
            class140 var30 = class140.method53(var2);
            if (var30.field1874 != null && var30.field1874[0][0] == 5) {
                int var31 = var30.field1874[0][1];
                if (class89.field1205[var31] != var30.field1787[0]) {
                    class89.field1205[var31] = var30.field1787[0];
                    method1804(var31);
                }
            }
        }
        if (var3 == 36) {
            field2176.method2288(57);
            field2176.method1561(var2);
            field2176.method1601(var4);
            field2176.method1559(var1);
            field2026 = 0;
            Statics.field522 = class140.method53(var2);
            field2027 = var1;
        }
        if (var3 == 30 && field2083 == null) {
            field2176.method2288(119);
            field2176.method1602(var1);
            field2176.method1609(var2);
            field2083 = class140.method858(var2, var1);
            method968(field2083);
        }
        if (var3 == 1 && method1457(var1, var2, var4)) {
            field2176.method2288(83);
            field2176.method1688(Statics.field1477);
            field2176.method1559(Statics.field1721);
            field2176.method1559(Statics.field1739 + var1);
            field2176.method1601(var4 >> 14 & 0x7FFF);
            field2176.method1602(Statics.field1766 + var2);
            field2176.method1611(Statics.field2250);
        }
        if (var3 == 15) {
            class182 var32 = field2037[var4];
            if (var32 != null) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var32.field2666[0], var32.field2649[0], false, 0, 0, 1, 1, 0, 2);
                field2170 = class36.field489;
                field1964 = class36.field494;
                field2025 = 2;
                field2024 = 0;
                field2176.method2288(137);
                field2176.method1602(var4);
                field2176.method1610(Statics.field41);
                field2176.method1559(field2023);
            }
        }
        if (var3 == 57 || var3 == 1007) {
            String var33 = field2068[arg0];
            class140 var34 = class140.method858(var2, var1);
            if (var34 != null) {
                if (var34.field1865 != null) {
                    class122 var35 = new class122();
                    var35.field1585 = var34;
                    var35.field1584 = var4;
                    var35.field1592 = var33;
                    var35.field1591 = var34.field1865;
                    class12.method870(var35);
                }
                boolean var36 = true;
                if (var34.field1782 > 0) {
                    var36 = method854(var34);
                }
                if (var36) {
                    int var37 = method357(var34);
                    int var38 = var4 - 1;
                    boolean var39 = (var37 >> var38 + 1 & 0x1) != 0;
                    if (var39) {
                        if (var4 == 1) {
                            field2176.method2288(252);
                            field2176.method1561(var2);
                            field2176.method1559(var1);
                        }
                        if (var4 == 2) {
                            field2176.method2288(147);
                            field2176.method1561(var2);
                            field2176.method1559(var1);
                        }
                        if (var4 == 3) {
                            field2176.method2288(227);
                            field2176.method1561(var2);
                            field2176.method1559(var1);
                        }
                        if (var4 == 4) {
                            field2176.method2288(52);
                            field2176.method1561(var2);
                            field2176.method1559(var1);
                        }
                        if (var4 == 5) {
                            field2176.method2288(0);
                            field2176.method1561(var2);
                            field2176.method1559(var1);
                        }
                        if (var4 == 6) {
                            field2176.method2288(254);
                            field2176.method1561(var2);
                            field2176.method1559(var1);
                        }
                        if (var4 == 7) {
                            field2176.method2288(138);
                            field2176.method1561(var2);
                            field2176.method1559(var1);
                        }
                        if (var4 == 8) {
                            field2176.method2288(82);
                            field2176.method1561(var2);
                            field2176.method1559(var1);
                        }
                        if (var4 == 9) {
                            field2176.method2288(148);
                            field2176.method1561(var2);
                            field2176.method1559(var1);
                        }
                        if (var4 == 10) {
                            field2176.method2288(222);
                            field2176.method1561(var2);
                            field2176.method1559(var1);
                        }
                    }
                }
            }
        }
        if (var3 == 6) {
            method1457(var1, var2, var4);
            field2176.method2288(126);
            field2176.method1688(Statics.field1766 + var2);
            field2176.method1601(var4 >> 14 & 0x7FFF);
            field2176.method1601(Statics.field1739 + var1);
        }
        if (var3 == 45) {
            class182 var40 = field2037[var4];
            if (var40 != null) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var40.field2666[0], var40.field2649[0], false, 0, 0, 1, 1, 0, 2);
                field2170 = class36.field489;
                field1964 = class36.field494;
                field2025 = 2;
                field2024 = 0;
                field2176.method2288(90);
                field2176.method1602(var4);
            }
        }
        if (var3 == 11) {
            class183 var41 = field1946[var4];
            if (var41 != null) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var41.field2666[0], var41.field2649[0], false, 0, 0, 1, 1, 0, 2);
                field2170 = class36.field489;
                field1964 = class36.field494;
                field2025 = 2;
                field2024 = 0;
                field2176.method2288(69);
                field2176.method1601(var4);
            }
        }
        if (var3 == 16) {
            boolean var42 = method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var42) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field2170 = class36.field489;
            field1964 = class36.field494;
            field2025 = 2;
            field2024 = 0;
            field2176.method2288(174);
            field2176.method1601(var4);
            field2176.method1602(Statics.field1766 + var2);
            field2176.method1561(Statics.field2250);
            field2176.method1688(Statics.field1477);
            field2176.method1688(Statics.field1721);
            field2176.method1601(Statics.field1739 + var1);
        }
        if (var3 == 2 && method1457(var1, var2, var4)) {
            field2176.method2288(102);
            field2176.method1559(field2023);
            field2176.method1688(Statics.field1739 + var1);
            field2176.method1601(Statics.field1766 + var2);
            field2176.method1602(var4 >> 14 & 0x7FFF);
            field2176.method1561(Statics.field41);
        }
        if (var3 == 18) {
            boolean var44 = method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var44) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field2170 = class36.field489;
            field1964 = class36.field494;
            field2025 = 2;
            field2024 = 0;
            field2176.method2288(167);
            field2176.method1601(var4);
            field2176.method1601(Statics.field1766 + var2);
            field2176.method1688(Statics.field1739 + var1);
        }
        if (var3 == 1001) {
            method1457(var1, var2, var4);
            field2176.method2288(76);
            field2176.method1559(var4 >> 14 & 0x7FFF);
            field2176.method1601(Statics.field1739 + var1);
            field2176.method1559(Statics.field1766 + var2);
        }
        if (var3 == 28) {
            field2176.method2288(44);
            field2176.method1561(var2);
            class140 var46 = class140.method53(var2);
            if (var46.field1874 != null && var46.field1874[0][0] == 5) {
                int var47 = var46.field1874[0][1];
                class89.field1205[var47] = 1 - class89.field1205[var47];
                method1804(var47);
            }
        }
        if (var3 == 26) {
            field2176.method2288(59);
            for (class123 var48 = (class123) field2080.method1262(); var48 != null; var48 = (class123) field2080.method1266()) {
                if (var48.field1596 == 0 || var48.field1596 == 3) {
                    method1114(var48, true);
                }
            }
            if (field2083 != null) {
                method968(field2083);
                field2083 = null;
            }
        }
        if (var3 == 10) {
            class183 var49 = field1946[var4];
            if (var49 != null) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var49.field2666[0], var49.field2649[0], false, 0, 0, 1, 1, 0, 2);
                field2170 = class36.field489;
                field1964 = class36.field494;
                field2025 = 2;
                field2024 = 0;
                field2176.method2288(191);
                field2176.method1688(var4);
            }
        }
        if (var3 == 42) {
            field2176.method2288(171);
            field2176.method1610(var2);
            field2176.method1602(var4);
            field2176.method1688(var1);
            field2026 = 0;
            Statics.field522 = class140.method53(var2);
            field2027 = var1;
        }
        if (var3 == 13) {
            class183 var50 = field1946[var4];
            if (var50 != null) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var50.field2666[0], var50.field2649[0], false, 0, 0, 1, 1, 0, 2);
                field2170 = class36.field489;
                field1964 = class36.field494;
                field2025 = 2;
                field2024 = 0;
                field2176.method2288(218);
                field2176.method1602(var4);
            }
        }
        if (var3 == 47) {
            class182 var51 = field2037[var4];
            if (var51 != null) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var51.field2666[0], var51.field2649[0], false, 0, 0, 1, 1, 0, 2);
                field2170 = class36.field489;
                field1964 = class36.field494;
                field2025 = 2;
                field2024 = 0;
                field2176.method2288(33);
                field2176.method1559(var4);
            }
        }
        if (var3 == 20) {
            boolean var52 = method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var52) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field2170 = class36.field489;
            field1964 = class36.field494;
            field2025 = 2;
            field2024 = 0;
            field2176.method2288(146);
            field2176.method1559(var4);
            field2176.method1601(Statics.field1739 + var1);
            field2176.method1602(Statics.field1766 + var2);
        }
        if (var3 == 43) {
            field2176.method2288(46);
            field2176.method1601(var1);
            field2176.method1602(var4);
            field2176.method1611(var2);
            field2026 = 0;
            Statics.field522 = class140.method53(var2);
            field2027 = var1;
        }
        if (var3 == 17) {
            boolean var54 = method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var54) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field2170 = class36.field489;
            field1964 = class36.field494;
            field2025 = 2;
            field2024 = 0;
            field2176.method2288(121);
            field2176.method1688(var4);
            field2176.method1561(Statics.field41);
            field2176.method1559(field2023);
            field2176.method1602(Statics.field1739 + var1);
            field2176.method1602(Statics.field1766 + var2);
        }
        if (var3 == 24) {
            class140 var56 = class140.method53(var2);
            boolean var57 = true;
            if (var56.field1782 > 0) {
                var57 = method854(var56);
            }
            if (var57) {
                field2176.method2288(44);
                field2176.method1561(var2);
            }
        }
        if (var3 == 31) {
            field2176.method2288(234);
            field2176.method1609(var2);
            field2176.method1610(Statics.field2250);
            field2176.method1559(Statics.field1721);
            field2176.method1559(var4);
            field2176.method1601(Statics.field1477);
            field2176.method1688(var1);
            field2026 = 0;
            Statics.field522 = class140.method53(var2);
            field2027 = var1;
        }
        if (var3 == 1004) {
            field2170 = class36.field489;
            field1964 = class36.field494;
            field2025 = 2;
            field2024 = 0;
            field2176.method2288(136);
            field2176.method1601(var4);
        }
        if (var3 == 3) {
            method1457(var1, var2, var4);
            field2176.method2288(88);
            field2176.method1601(Statics.field1739 + var1);
            field2176.method1559(Statics.field1766 + var2);
            field2176.method1559(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 1005) {
            class140 var58 = class140.method53(var2);
            if (var58 == null || var58.field1881[var1] < 100000) {
                field2176.method2288(136);
                field2176.method1601(var4);
            } else {
                method701(0, "", var58.field1881[var1] + " x " + class161.method2496(var4).field2432);
            }
            field2026 = 0;
            Statics.field522 = class140.method53(var2);
            field2027 = var1;
        }
        if (var3 == 44) {
            class182 var59 = field2037[var4];
            if (var59 != null) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var59.field2666[0], var59.field2649[0], false, 0, 0, 1, 1, 0, 2);
                field2170 = class36.field489;
                field1964 = class36.field494;
                field2025 = 2;
                field2024 = 0;
                field2176.method2288(216);
                field2176.method1688(var4);
            }
        }
        if (var3 == 8) {
            class183 var60 = field1946[var4];
            if (var60 != null) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var60.field2666[0], var60.field2649[0], false, 0, 0, 1, 1, 0, 2);
                field2170 = class36.field489;
                field1964 = class36.field494;
                field2025 = 2;
                field2024 = 0;
                field2176.method2288(8);
                field2176.method1602(field2023);
                field2176.method1561(Statics.field41);
                field2176.method1601(var4);
            }
        }
        if (var3 == 37) {
            field2176.method2288(95);
            field2176.method1601(var1);
            field2176.method1611(var2);
            field2176.method1688(var4);
            field2026 = 0;
            Statics.field522 = class140.method53(var2);
            field2027 = var1;
        }
        if (var3 == 49) {
            class182 var61 = field2037[var4];
            if (var61 != null) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var61.field2666[0], var61.field2649[0], false, 0, 0, 1, 1, 0, 2);
                field2170 = class36.field489;
                field1964 = class36.field494;
                field2025 = 2;
                field2024 = 0;
                field2176.method2288(160);
                field2176.method1601(var4);
            }
        }
        if (var3 == 40) {
            field2176.method2288(42);
            field2176.method1602(var4);
            field2176.method1561(var2);
            field2176.method1602(var1);
            field2026 = 0;
            Statics.field522 = class140.method53(var2);
            field2027 = var1;
        }
        if (field2073 != 0) {
            field2073 = 0;
            method968(class140.method53(Statics.field2250));
        }
        if (field2075) {
            method696();
        }
        if (Statics.field522 != null && field2026 == 0) {
            method968(Statics.field522);
        }
    }

    @ObfuscatedName("cd.fp(ILjava/lang/String;B)V")
    public static void method967(int arg0, String arg1) {
        String var2 = class81.method544(class81.method2476(arg1));
        boolean var3 = false;
        for (int var4 = 0; var4 < field2038; var4++) {
            class182 var5 = field2037[field2039[var4]];
            if (var5 != null && var5.field2797 != null && var5.field2797.equalsIgnoreCase(var2)) {
                method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var5.field2666[0], var5.field2649[0], false, 0, 0, 1, 1, 0, 2);
                if (arg0 == 1) {
                    field2176.method2288(216);
                    field2176.method1688(field2039[var4]);
                } else if (arg0 == 4) {
                    field2176.method2288(33);
                    field2176.method1559(field2039[var4]);
                } else if (arg0 == 6) {
                    field2176.method2288(160);
                    field2176.method1601(field2039[var4]);
                } else if (arg0 == 7) {
                    field2176.method2288(178);
                    field2176.method1601(field2039[var4]);
                }
                var3 = true;
                break;
            }
        }
        if (!var3) {
            method701(0, "", class74.field998 + var2);
        }
    }

    @ObfuscatedName("bs.fh(IIII)V")
    public static void method742(int arg0, int arg1, int arg2) {
        class140 var3 = class140.method858(arg0, arg1);
        if (var3 != null && var3.field1856 != null) {
            class122 var4 = new class122();
            var4.field1585 = var3;
            var4.field1591 = var3.field1856;
            class12.method870(var4);
        }
        field2075 = true;
        Statics.field41 = arg0;
        field2023 = arg1;
        Statics.field1153 = arg2;
        method968(var3);
    }

    @ObfuscatedName("an.fm(I)V")
    public static void method696() {
        if (!field2075) {
            return;
        }
        class140 var0 = class140.method858(Statics.field41, field2023);
        if (var0 != null && var0.field1775 != null) {
            class122 var1 = new class122();
            var1.field1585 = var0;
            var1.field1591 = var0.field1775;
            class12.method870(var1);
        }
        field2075 = false;
        method968(var0);
    }

    @ObfuscatedName("g.fj(I)V")
    public static final void method107() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field1947 - 1; var1++) {
                if (field2097[var1] < 1000 && field2097[var1 + 1] > 1000) {
                    String var2 = field2068[var1];
                    field2068[var1] = field2068[var1 + 1];
                    field2068[var1 + 1] = var2;
                    String var3 = field2067[var1];
                    field2067[var1] = field2067[var1 + 1];
                    field2067[var1 + 1] = var3;
                    int var4 = field2097[var1];
                    field2097[var1] = field2097[var1 + 1];
                    field2097[var1 + 1] = var4;
                    int var5 = field2020[var1];
                    field2020[var1] = field2020[var1 + 1];
                    field2020[var1 + 1] = var5;
                    int var6 = field2180[var1];
                    field2180[var1] = field2180[var1 + 1];
                    field2180[var1 + 1] = var6;
                    int var7 = field2066[var1];
                    field2066[var1] = field2066[var1 + 1];
                    field2066[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("t.fg(Ljava/lang/String;Ljava/lang/String;IIIIS)V")
    public static final void method6(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field2064 || field1947 >= 500) {
            return;
        }
        field2067[field1947] = arg0;
        field2068[field1947] = arg1;
        field2097[field1947] = arg2;
        field2066[field1947] = arg3;
        field2020[field1947] = arg4;
        field2180[field1947] = arg5;
        field1947++;
    }

    @ObfuscatedName("dq.fi(II)Ljava/lang/String;")
    public static String method1331(int arg0) {
        return field2068[arg0].length() > 0 ? field2067[arg0] + class74.field985 + field2068[arg0] : field2067[arg0];
    }

    @ObfuscatedName("ar.fd(IIIIS)V")
    public static final void method510(int arg0, int arg1, int arg2, int arg3) {
        if (field2073 == 0 && !field2075) {
            method6(class74.field1004, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class180.field2776; var5++) {
            int var6 = class180.field2747[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field1155.method578(Statics.field1622, var7, var8, var6) >= 0) {
                    class153 var11 = Statics.method1460(var10);
                    if (var11.field2301 != null) {
                        var11 = var11.method2342();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field2073 == 1) {
                        method6(class74.field999, field2074 + " " + class1.field6 + " " + class1.method47(65535) + var11.field2310, 1, var6, var7, var8);
                    } else if (!field2075) {
                        String[] var12 = var11.field2336;
                        if (field2194) {
                            var12 = method1207(var12);
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
                                    method6(var12[var13], class1.method47(65535) + var11.field2310, var14, var6, var7, var8);
                                }
                            }
                        }
                        method6(class74.field1028, class1.method47(65535) + var11.field2310, 1002, var11.field2307 << 14, var7, var8);
                    } else if ((Statics.field1153 & 0x4) == 4) {
                        method6(field2077, field2155 + " " + class1.field6 + " " + class1.method47(65535) + var11.field2310, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class183 var15 = field1946[var10];
                    if (var15.field2804.field2271 == 1 && (var15.field2642 & 0x7F) == 64 && (var15.field2614 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field2157; var16++) {
                            class183 var17 = field1946[field1948[var16]];
                            if (var17 != null && var15 != var17 && var17.field2804.field2271 == 1 && var15.field2642 == var17.field2642 && var15.field2614 == var17.field2614) {
                                method1096(var17.field2804, field1948[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field2038; var18++) {
                            class182 var19 = field2037[field2039[var18]];
                            if (var19 != null && var15.field2642 == var19.field2642 && var15.field2614 == var19.field2614) {
                                method1321(var19, field2039[var18], var7, var8);
                            }
                        }
                    }
                    method1096(var15.field2804, var10, var7, var8);
                }
                if (var9 == 0) {
                    class182 var20 = field2037[var10];
                    if ((var20.field2642 & 0x7F) == 64 && (var20.field2614 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field2157; var21++) {
                            class183 var22 = field1946[field1948[var21]];
                            if (var22 != null && var22.field2804.field2271 == 1 && var20.field2642 == var22.field2642 && var20.field2614 == var22.field2614) {
                                method1096(var22.field2804, field1948[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field2038; var23++) {
                            class182 var24 = field2037[field2039[var23]];
                            if (var24 != null && var20 != var24 && var20.field2642 == var24.field2642 && var20.field2614 == var24.field2614) {
                                method1321(var24, field2039[var23], var7, var8);
                            }
                        }
                    }
                    method1321(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class104 var25 = field2052[Statics.field1622][var7][var8];
                    if (var25 != null) {
                        for (class176 var26 = (class176) var25.method1286(); var26 != null; var26 = (class176) var25.method1288()) {
                            class161 var27 = class161.method2496(var26.field2602);
                            if (field2073 == 1) {
                                method6(class74.field999, field2074 + " " + class1.field6 + " " + class1.method47(16748608) + var27.field2432, 16, var26.field2602, var7, var8);
                            } else if (!field2075) {
                                String[] var28 = var27.field2446;
                                if (field2194) {
                                    var28 = method1207(var28);
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
                                        method6(var28[var29], class1.method47(16748608) + var27.field2432, var30, var26.field2602, var7, var8);
                                    } else if (var29 == 2) {
                                        method6(class74.field861, class1.method47(16748608) + var27.field2432, 20, var26.field2602, var7, var8);
                                    }
                                }
                                method6(class74.field1028, class1.method47(16748608) + var27.field2432, 1004, var26.field2602, var7, var8);
                            } else if ((Statics.field1153 & 0x1) == 1) {
                                method6(field2077, field2155 + " " + class1.field6 + " " + class1.method47(16748608) + var27.field2432, 17, var26.field2602, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ct.fs(Lel;IIII)V")
    public static final void method1096(class152 arg0, int arg1, int arg2, int arg3) {
        if (field1947 >= 400) {
            return;
        }
        if (arg0.field2295 != null) {
            arg0 = arg0.method2316();
        }
        if (arg0 == null || !arg0.field2298) {
            return;
        }
        String var4 = arg0.field2270;
        if (arg0.field2287 != 0) {
            int var6 = arg0.field2287;
            int var7 = Statics.field1127.field2789;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class1.method47(16711680);
            } else if (var8 < -6) {
                var9 = class1.method47(16723968);
            } else if (var8 < -3) {
                var9 = class1.method47(16740352);
            } else if (var8 < 0) {
                var9 = class1.method47(16756736);
            } else if (var8 > 9) {
                var9 = class1.method47(65280);
            } else if (var8 > 6) {
                var9 = class1.method47(4259584);
            } else if (var8 > 3) {
                var9 = class1.method47(8453888);
            } else if (var8 > 0) {
                var9 = class1.method47(12648192);
            } else {
                var9 = class1.method47(16776960);
            }
            var4 = var4 + var9 + " " + class1.field2 + class74.field1005 + arg0.field2287 + class1.field5;
        }
        if (field2073 == 1) {
            method6(class74.field999, field2074 + " " + class1.field6 + " " + class1.method47(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field2075) {
            String[] var10 = arg0.field2285;
            if (field2194) {
                var10 = method1207(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class74.field1054)) {
                        byte var12 = 0;
                        if (var11 == 0) {
                            var12 = 9;
                        }
                        if (var11 == 1) {
                            var12 = 10;
                        }
                        if (var11 == 2) {
                            var12 = 11;
                        }
                        if (var11 == 3) {
                            var12 = 12;
                        }
                        if (var11 == 4) {
                            var12 = 13;
                        }
                        method6(var10[var11], class1.method47(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class74.field1054)) {
                        short var14 = 0;
                        if (arg0.field2287 > Statics.field1127.field2789) {
                            var14 = 2000;
                        }
                        int var15 = 0;
                        if (var13 == 0) {
                            var15 = var14 + 9;
                        }
                        if (var13 == 1) {
                            var15 = var14 + 10;
                        }
                        if (var13 == 2) {
                            var15 = var14 + 11;
                        }
                        if (var13 == 3) {
                            var15 = var14 + 12;
                        }
                        if (var13 == 4) {
                            var15 = var14 + 13;
                        }
                        method6(var10[var13], class1.method47(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method6(class74.field1028, class1.method47(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1153 & 0x2) == 2) {
            method6(field2077, field2155 + " " + class1.field6 + " " + class1.method47(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("de.fb(Lfl;IIII)V")
    public static final void method1321(class182 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1127 == arg0 || field1947 >= 400) {
            return;
        }
        String var9;
        if (arg0.field2800 == 0) {
            String var4 = arg0.field2797;
            int var5 = arg0.field2789;
            int var6 = Statics.field1127.field2789;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class1.method47(16711680);
            } else if (var7 < -6) {
                var8 = class1.method47(16723968);
            } else if (var7 < -3) {
                var8 = class1.method47(16740352);
            } else if (var7 < 0) {
                var8 = class1.method47(16756736);
            } else if (var7 > 9) {
                var8 = class1.method47(65280);
            } else if (var7 > 6) {
                var8 = class1.method47(4259584);
            } else if (var7 > 3) {
                var8 = class1.method47(8453888);
            } else if (var7 > 0) {
                var8 = class1.method47(12648192);
            } else {
                var8 = class1.method47(16776960);
            }
            var9 = var4 + var8 + " " + class1.field2 + class74.field1005 + arg0.field2789 + class1.field5;
        } else {
            var9 = arg0.field2797 + " " + class1.field2 + class74.field1006 + arg0.field2800 + class1.field5;
        }
        if (field2073 == 1) {
            method6(class74.field999, field2074 + " " + class1.field6 + " " + class1.method47(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field2075) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field2049[var10] != null) {
                    short var11 = 0;
                    if (field2049[var10].equalsIgnoreCase(class74.field1054)) {
                        if (arg0.field2789 > Statics.field1127.field2789) {
                            var11 = 2000;
                        }
                        if (Statics.field1127.field2803 != 0 && arg0.field2803 != 0) {
                            if (Statics.field1127.field2803 == arg0.field2803) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field2133[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field2048[var10] + var11;
                    method6(field2049[var10], class1.method47(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1153 & 0x8) == 8) {
            method6(field2077, field2155 + " " + class1.field6 + " " + class1.method47(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field1947; var14++) {
            if (field2097[var14] == 23) {
                field2068[var14] = class1.method47(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("bm.fn(IIIIIIIIB)V")
    public static final void method897(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class140.method1094(arg0)) {
            Statics.field1465 = null;
            method2457(Statics.field806[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1465 != null) {
                method2457(Statics.field1465, -1412584499, arg1, arg2, arg3, arg4, Statics.field1559, Statics.field1151, arg7);
                Statics.field1465 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field2125[var8] = true;
            }
        } else {
            field2125[arg7] = true;
        }
    }

    @ObfuscatedName("fu.fw([Leh;IIIIIIIIB)V")
    public static final void method2457(class140[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class164.method2576(arg2, arg3, arg4, arg5);
        class172.method2748();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class140 var10 = arg0[var9];
            if (var10 != null && (var10.field1789 == arg1 || arg1 == -1412584499 && field2189 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field2128[field2123] = var10.field1769 + arg6;
                    field1950[field2123] = var10.field1784 + arg7;
                    field2130[field2123] = var10.field1791;
                    field2131[field2123] = var10.field1788;
                    var11 = ++field2123 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field1893 = var11;
                var10.field1894 = field1917;
                if (!var10.field1777 || !method986(var10)) {
                    if (var10.field1782 > 0) {
                        int var12 = var10.field1782;
                        if (var12 == 324) {
                            if (field1981 == -1) {
                                field1981 = var10.field1806;
                                field2195 = var10.field1803;
                            }
                            if (field1923.field1221) {
                                var10.field1806 = field1981;
                            } else {
                                var10.field1806 = field2195;
                            }
                        } else if (var12 == 325) {
                            if (field1981 == -1) {
                                field1981 = var10.field1806;
                                field2195 = var10.field1803;
                            }
                            if (field1923.field1221) {
                                var10.field1806 = field2195;
                            } else {
                                var10.field1806 = field1981;
                            }
                        } else if (var12 == 327) {
                            var10.field1802 = 150;
                            var10.field1798 = (int) (Math.sin((double) field1917 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field1810 = 5;
                            var10.field1811 = 0;
                        } else if (var12 == 328) {
                            var10.field1802 = 150;
                            var10.field1798 = (int) (Math.sin((double) field1917 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field1810 = 5;
                            var10.field1811 = 1;
                        }
                    }
                    int var13 = var10.field1769 + arg6;
                    int var14 = var10.field1784 + arg7;
                    int var15 = var10.field1892;
                    if (field2189 == var10) {
                        if (arg1 != -1412584499 && !var10.field1814) {
                            Statics.field1465 = arg0;
                            Statics.field1559 = arg6;
                            Statics.field1151 = arg7;
                            continue;
                        }
                        if (field2101 && field2063) {
                            int var16 = class36.field486;
                            int var17 = class36.field487;
                            int var18 = var16 - field2108;
                            int var19 = var17 - field2089;
                            if (var18 < field2096) {
                                var18 = field2096;
                            }
                            if (var10.field1791 + var18 > field2096 + field1959.field1791) {
                                var18 = field2096 + field1959.field1791 - var10.field1791;
                            }
                            if (var19 < field2171) {
                                var19 = field2171;
                            }
                            if (var10.field1788 + var19 > field2171 + field1959.field1788) {
                                var19 = field2171 + field1959.field1788 - var10.field1788;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field1814) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field1780 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field1780 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field1791 + var13;
                        int var27 = var10.field1788 + var14;
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
                        int var30 = var10.field1791 + var13;
                        int var31 = var10.field1788 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field1777 || var20 < var22 && var21 < var23) {
                        if (var10.field1782 != 0) {
                            if (var10.field1782 == 1337) {
                                field2069 = var13;
                                field2070 = var14;
                                method100(var13, var14, var10.field1791, var10.field1788);
                                class164.method2576(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field1782 == 1338) {
                                method886(var13, var14, var11);
                                class164.method2576(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var32 = class36.field486;
                        int var33 = class36.field487;
                        if (!field2064 && var32 >= var20 && var33 >= var21 && var32 < var22 && var33 < var23) {
                            int var34 = var32 - var13;
                            int var35 = var33 - var14;
                            if (var10.field1800 == 1) {
                                method6(var10.field1879, "", 24, 0, 0, var10.field1778);
                            }
                            if (var10.field1800 == 2 && !field2075) {
                                int var36 = method357(var10);
                                int var37 = var36 >> 11 & 0x3F;
                                String var38;
                                if (var37 == 0) {
                                    var38 = null;
                                } else if (var10.field1844 == null || var10.field1844.trim().length() == 0) {
                                    var38 = null;
                                } else {
                                    var38 = var10.field1844;
                                }
                                if (var38 != null) {
                                    method6(var38, class1.method47(65280) + var10.field1878, 25, 0, -1, var10.field1778);
                                }
                            }
                            if (var10.field1800 == 3) {
                                method6(class74.field992, "", 26, 0, 0, var10.field1778);
                            }
                            if (var10.field1800 == 4) {
                                method6(var10.field1879, "", 28, 0, 0, var10.field1778);
                            }
                            if (var10.field1800 == 5) {
                                method6(var10.field1879, "", 29, 0, 0, var10.field1778);
                            }
                            if (var10.field1800 == 6 && field2083 == null) {
                                method6(var10.field1879, "", 30, 0, -1, var10.field1778);
                            }
                            if (var10.field1780 == 2) {
                                int var40 = 0;
                                for (int var41 = 0; var41 < var10.field1788; var41++) {
                                    for (int var42 = 0; var42 < var10.field1791; var42++) {
                                        int var43 = (var10.field1831 + 32) * var42;
                                        int var44 = (var10.field1819 + 32) * var41;
                                        if (var40 < 20) {
                                            var43 += var10.field1771[var40];
                                            var44 += var10.field1834[var40];
                                        }
                                        if (var34 >= var43 && var35 >= var44 && var34 < var43 + 32 && var35 < var44 + 32) {
                                            field1991 = var40;
                                            Statics.field1593 = var10;
                                            if (var10.field1880[var40] > 0) {
                                                label1141: {
                                                    class161 var45 = class161.method2496(var10.field1880[var40] - 1);
                                                    if (field2073 == 1) {
                                                        int var46 = method357(var10);
                                                        boolean var47 = (var46 >> 30 & 0x1) != 0;
                                                        if (var47) {
                                                            if (Statics.field2250 != var10.field1778 || Statics.field1721 != var40) {
                                                                method6(class74.field999, field2074 + " " + class1.field6 + " " + class1.method47(16748608) + var45.field2432, 31, var45.field2430, var40, var10.field1778);
                                                            }
                                                            break label1141;
                                                        }
                                                    }
                                                    if (field2075) {
                                                        int var48 = method357(var10);
                                                        boolean var49 = (var48 >> 30 & 0x1) != 0;
                                                        if (var49) {
                                                            if ((Statics.field1153 & 0x10) == 16) {
                                                                method6(field2077, field2155 + " " + class1.field6 + " " + class1.method47(16748608) + var45.field2432, 32, var45.field2430, var40, var10.field1778);
                                                            }
                                                            break label1141;
                                                        }
                                                    }
                                                    String[] var50 = var45.field2445;
                                                    if (field2194) {
                                                        var50 = method1207(var50);
                                                    }
                                                    int var51 = method357(var10);
                                                    boolean var52 = (var51 >> 30 & 0x1) != 0;
                                                    if (var52) {
                                                        for (int var53 = 4; var53 >= 3; var53--) {
                                                            if (var50 != null && var50[var53] != null) {
                                                                byte var54;
                                                                if (var53 == 3) {
                                                                    var54 = 36;
                                                                } else {
                                                                    var54 = 37;
                                                                }
                                                                method6(var50[var53], class1.method47(16748608) + var45.field2432, var54, var45.field2430, var40, var10.field1778);
                                                            } else if (var53 == 4) {
                                                                method6(class74.field862, class1.method47(16748608) + var45.field2432, 37, var45.field2430, var40, var10.field1778);
                                                            }
                                                        }
                                                    }
                                                    class92 var10000 = (class92) null;
                                                    if (class92.method722(method357(var10))) {
                                                        method6(class74.field999, class1.method47(16748608) + var45.field2432, 38, var45.field2430, var40, var10.field1778);
                                                    }
                                                    int var55 = method357(var10);
                                                    boolean var56 = (var55 >> 30 & 0x1) != 0;
                                                    if (var56 && var50 != null) {
                                                        for (int var57 = 2; var57 >= 0; var57--) {
                                                            if (var50[var57] != null) {
                                                                byte var58 = 0;
                                                                if (var57 == 0) {
                                                                    var58 = 33;
                                                                }
                                                                if (var57 == 1) {
                                                                    var58 = 34;
                                                                }
                                                                if (var57 == 2) {
                                                                    var58 = 35;
                                                                }
                                                                method6(var50[var57], class1.method47(16748608) + var45.field2432, var58, var45.field2430, var40, var10.field1778);
                                                            }
                                                        }
                                                    }
                                                    String[] var59 = var10.field1836;
                                                    if (field2194) {
                                                        var59 = method1207(var59);
                                                    }
                                                    if (var59 != null) {
                                                        for (int var60 = 4; var60 >= 0; var60--) {
                                                            if (var59[var60] != null) {
                                                                byte var61 = 0;
                                                                if (var60 == 0) {
                                                                    var61 = 39;
                                                                }
                                                                if (var60 == 1) {
                                                                    var61 = 40;
                                                                }
                                                                if (var60 == 2) {
                                                                    var61 = 41;
                                                                }
                                                                if (var60 == 3) {
                                                                    var61 = 42;
                                                                }
                                                                if (var60 == 4) {
                                                                    var61 = 43;
                                                                }
                                                                method6(var59[var60], class1.method47(16748608) + var45.field2432, var61, var45.field2430, var40, var10.field1778);
                                                            }
                                                        }
                                                    }
                                                    method6(class74.field1028, class1.method47(16748608) + var45.field2432, 1005, var45.field2430, var40, var10.field1778);
                                                }
                                            }
                                        }
                                        var40++;
                                    }
                                }
                            }
                            if (var10.field1777) {
                                if (field2075) {
                                    int var62 = method357(var10);
                                    boolean var63 = (var62 >> 21 & 0x1) != 0;
                                    if (var63 && (Statics.field1153 & 0x20) == 32) {
                                        method6(field2077, field2155 + " " + class1.field6 + " " + var10.field1838, 58, 0, var10.field1779, var10.field1778);
                                    }
                                } else {
                                    for (int var64 = 9; var64 >= 5; var64--) {
                                        int var65 = method357(var10);
                                        boolean var66 = (var65 >> var64 + 1 & 0x1) != 0;
                                        String var67;
                                        if (!var66 && var10.field1865 == null) {
                                            var67 = null;
                                        } else if (var10.field1839 == null || var10.field1839.length <= var64 || var10.field1839[var64] == null || var10.field1839[var64].trim().length() == 0) {
                                            var67 = null;
                                        } else {
                                            var67 = var10.field1839[var64];
                                        }
                                        if (var67 != null) {
                                            method6(var67, var10.field1838, 1007, var64 + 1, var10.field1779, var10.field1778);
                                        }
                                    }
                                    int var69 = method357(var10);
                                    int var70 = var69 >> 11 & 0x3F;
                                    String var71;
                                    if (var70 == 0) {
                                        var71 = null;
                                    } else if (var10.field1844 == null || var10.field1844.trim().length() == 0) {
                                        var71 = null;
                                    } else {
                                        var71 = var10.field1844;
                                    }
                                    if (var71 != null) {
                                        method6(var71, var10.field1838, 25, 0, var10.field1779, var10.field1778);
                                    }
                                    for (int var73 = 4; var73 >= 0; var73--) {
                                        int var74 = method357(var10);
                                        boolean var75 = (var74 >> var73 + 1 & 0x1) != 0;
                                        String var76;
                                        if (!var75 && var10.field1865 == null) {
                                            var76 = null;
                                        } else if (var10.field1839 == null || var10.field1839.length <= var73 || var10.field1839[var73] == null || var10.field1839[var73].trim().length() == 0) {
                                            var76 = null;
                                        } else {
                                            var76 = var10.field1839[var73];
                                        }
                                        if (var76 != null) {
                                            method6(var76, var10.field1838, 57, var73 + 1, var10.field1779, var10.field1778);
                                        }
                                    }
                                    int var78 = method357(var10);
                                    boolean var79 = (var78 & 0x1) != 0;
                                    if (var79) {
                                        method6(class74.field943, "", 30, 0, var10.field1779, var10.field1778);
                                    }
                                }
                            }
                        }
                        if (var10.field1780 == 0) {
                            if (!var10.field1777 && method986(var10) && Statics.field1575 != var10) {
                                continue;
                            }
                            if (!var10.field1777) {
                                if (var10.field1774 > var10.field1794 - var10.field1788) {
                                    var10.field1774 = var10.field1794 - var10.field1788;
                                }
                                if (var10.field1774 < 0) {
                                    var10.field1774 = 0;
                                }
                            }
                            method2457(arg0, var10.field1778, var20, var21, var22, var23, var13 - var10.field1820, var14 - var10.field1774, var11);
                            if (var10.field1877 != null) {
                                method2457(var10.field1877, var10.field1778, var20, var21, var22, var23, var13 - var10.field1820, var14 - var10.field1774, var11);
                            }
                            class123 var80 = (class123) field2080.method1259((long) var10.field1778);
                            if (var80 != null) {
                                if (var80.field1596 == 0 && class36.field486 >= var20 && class36.field487 >= var21 && class36.field486 < var22 && class36.field487 < var23 && !field2064 && !field2088) {
                                    field2067[0] = class74.field984;
                                    field2068[0] = "";
                                    field2097[0] = 1006;
                                    field1947 = 1;
                                }
                                method897(var80.field1595, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class164.method2576(arg2, arg3, arg4, arg5);
                            class172.method2748();
                        }
                        if (field1993[var11] || field2132 > 1) {
                            if (var10.field1780 == 0 && !var10.field1777 && var10.field1794 > var10.field1788) {
                                int var81 = var10.field1791 + var13;
                                int var82 = var10.field1774;
                                int var83 = var10.field1788;
                                int var84 = var10.field1794;
                                Statics.field1994[0].method2736(var81, var14);
                                Statics.field1994[1].method2736(var81, var14 + var83 - 16);
                                class164.method2582(var81, var14 + 16, 16, var83 - 32, field1995);
                                int var85 = (var83 - 32) * var83 / var84;
                                if (var85 < 8) {
                                    var85 = 8;
                                }
                                int var86 = (var83 - 32 - var85) * var82 / (var84 - var83);
                                class164.method2582(var81, var14 + 16 + var86, 16, var85, field1996);
                                class164.method2588(var81, var14 + 16 + var86, var85, field1998);
                                class164.method2588(var81 + 1, var14 + 16 + var86, var85, field1998);
                                class164.method2616(var81, var14 + 16 + var86, 16, field1998);
                                class164.method2616(var81, var14 + 17 + var86, 16, field1998);
                                class164.method2588(var81 + 15, var14 + 16 + var86, var85, field1997);
                                class164.method2588(var81 + 14, var14 + 17 + var86, var85 - 1, field1997);
                                class164.method2616(var81, var14 + 15 + var86 + var85, 16, field1997);
                                class164.method2616(var81 + 1, var14 + 14 + var86 + var85, 15, field1997);
                            }
                            if (var10.field1780 != 1) {
                                if (var10.field1780 == 2) {
                                    int var87 = 0;
                                    for (int var88 = 0; var88 < var10.field1788; var88++) {
                                        for (int var89 = 0; var89 < var10.field1791; var89++) {
                                            int var90 = (var10.field1831 + 32) * var89 + var13;
                                            int var91 = (var10.field1819 + 32) * var88 + var14;
                                            if (var87 < 20) {
                                                var90 += var10.field1771[var87];
                                                var91 += var10.field1834[var87];
                                            }
                                            if (var10.field1880[var87] > 0) {
                                                boolean var92 = false;
                                                boolean var93 = false;
                                                int var94 = var10.field1880[var87] - 1;
                                                if (var90 + 32 > arg2 && var90 < arg4 && var91 + 32 > arg3 && var91 < arg5 || Statics.field1503 == var10 && field2028 == var87) {
                                                    class170 var95;
                                                    if (field2073 == 1 && Statics.field1721 == var87 && Statics.field2250 == var10.field1778) {
                                                        var95 = class161.method114(var94, var10.field1881[var87], 2, 0, false);
                                                    } else {
                                                        var95 = class161.method114(var94, var10.field1881[var87], 1, 3153952, false);
                                                    }
                                                    if (var95 == null) {
                                                        method968(var10);
                                                    } else if (Statics.field1503 == var10 && field2028 == var87) {
                                                        int var96 = class36.field486 - field2029;
                                                        int var97 = class36.field487 - field2030;
                                                        if (var96 < 5 && var96 > -5) {
                                                            var96 = 0;
                                                        }
                                                        if (var97 < 5 && var97 > -5) {
                                                            var97 = 0;
                                                        }
                                                        if (field1957 < 5) {
                                                            var96 = 0;
                                                            var97 = 0;
                                                        }
                                                        var95.method2655(var90 + var96, var91 + var97, 128);
                                                        if (arg1 != -1) {
                                                            class140 var98 = arg0[arg1 & 0xFFFF];
                                                            if (var91 + var97 < class164.field2479 && var98.field1774 > 0) {
                                                                int var99 = field1961 * (class164.field2479 - var91 - var97) / 3;
                                                                if (var99 > field1961 * 10) {
                                                                    var99 = field1961 * 10;
                                                                }
                                                                if (var99 > var98.field1774) {
                                                                    var99 = var98.field1774;
                                                                }
                                                                var98.field1774 -= var99;
                                                                field2030 += var99;
                                                                method968(var98);
                                                            }
                                                            if (var91 + var97 + 32 > class164.field2481 && var98.field1774 < var98.field1794 - var98.field1788) {
                                                                int var100 = field1961 * (var91 + var97 + 32 - class164.field2481) / 3;
                                                                if (var100 > field1961 * 10) {
                                                                    var100 = field1961 * 10;
                                                                }
                                                                if (var100 > var98.field1794 - var98.field1788 - var98.field1774) {
                                                                    var100 = var98.field1794 - var98.field1788 - var98.field1774;
                                                                }
                                                                var98.field1774 += var100;
                                                                field2030 -= var100;
                                                                method968(var98);
                                                            }
                                                        }
                                                    } else if (Statics.field522 == var10 && field2027 == var87) {
                                                        var95.method2655(var90, var91, 128);
                                                    } else {
                                                        var95.method2683(var90, var91);
                                                    }
                                                }
                                            } else if (var10.field1835 != null && var87 < 20) {
                                                class170 var101 = var10.method1771(var87);
                                                if (var101 != null) {
                                                    var101.method2683(var90, var91);
                                                } else if (class140.field1776) {
                                                    method968(var10);
                                                }
                                            }
                                            var87++;
                                        }
                                    }
                                } else if (var10.field1780 == 3) {
                                    int var102;
                                    if (method748(var10)) {
                                        var102 = var10.field1796;
                                        if (Statics.field1575 == var10 && var10.field1887 != 0) {
                                            var102 = var10.field1887;
                                        }
                                    } else {
                                        var102 = var10.field1795;
                                        if (Statics.field1575 == var10 && var10.field1797 != 0) {
                                            var102 = var10.field1797;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field1799) {
                                            class164.method2582(var13, var14, var10.field1791, var10.field1788, var102);
                                        } else {
                                            class164.method2584(var13, var14, var10.field1791, var10.field1788, var102);
                                        }
                                    } else if (var10.field1799) {
                                        class164.method2581(var13, var14, var10.field1791, var10.field1788, var102, 256 - (var15 & 0xFF));
                                    } else {
                                        class164.method2585(var13, var14, var10.field1791, var10.field1788, var102, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field1780 == 4) {
                                    class181 var103 = var10.method1770();
                                    if (var103 != null) {
                                        String var104 = var10.field1825;
                                        int var105;
                                        if (method748(var10)) {
                                            var105 = var10.field1796;
                                            if (Statics.field1575 == var10 && var10.field1887 != 0) {
                                                var105 = var10.field1887;
                                            }
                                            if (var10.field1826.length() > 0) {
                                                var104 = var10.field1826;
                                            }
                                        } else {
                                            var105 = var10.field1795;
                                            if (Statics.field1575 == var10 && var10.field1797 != 0) {
                                                var105 = var10.field1797;
                                            }
                                        }
                                        if (var10.field1777 && var10.field1783 != -1) {
                                            class161 var106 = class161.method2496(var10.field1783);
                                            var104 = var106.field2432;
                                            if (var104 == null) {
                                                var104 = "null";
                                            }
                                            if ((var106.field2453 == 1 || var10.field1886 != 1) && var10.field1886 != -1) {
                                                var104 = class1.method47(16748608) + var104 + class1.field8 + " " + 'x' + method272(var10.field1886);
                                            }
                                        }
                                        if (field2083 == var10) {
                                            class74 var165 = (class74) null;
                                            var104 = class74.field1007;
                                            var105 = var10.field1795;
                                        }
                                        if (!var10.field1777) {
                                            var104 = method1470(var104, var10);
                                        }
                                        var103.method2810(var104, var13, var14, var10.field1791, var10.field1788, var105, var10.field1830 ? 0 : -1, var10.field1871, var10.field1854, var10.field1827);
                                    } else if (class140.field1776) {
                                        method968(var10);
                                    }
                                } else if (var10.field1780 == 5) {
                                    if (var10.field1777) {
                                        class170 var108;
                                        if (var10.field1783 == -1) {
                                            var108 = var10.method1791(false);
                                        } else {
                                            var108 = class161.method114(var10.field1783, var10.field1886, var10.field1846, var10.field1868, false);
                                        }
                                        if (var108 != null) {
                                            int var109 = var108.field2502;
                                            int var110 = var108.field2506;
                                            if (var10.field1805) {
                                                class164.method2577(var13, var14, var10.field1791 + var13, var10.field1788 + var14);
                                                int var111 = (var10.field1791 + (var109 - 1)) / var109;
                                                int var112 = (var10.field1788 + (var110 - 1)) / var110;
                                                for (int var113 = 0; var113 < var111; var113++) {
                                                    for (int var114 = 0; var114 < var112; var114++) {
                                                        if (var10.field1804 != 0) {
                                                            var108.method2677(var109 / 2 + var109 * var113 + var13, var110 / 2 + var110 * var114 + var14, var10.field1804, 4096);
                                                        } else if (var15 == 0) {
                                                            var108.method2683(var109 * var113 + var13, var110 * var114 + var14);
                                                        } else {
                                                            var108.method2655(var109 * var113 + var13, var110 * var114 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class164.method2576(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var115 = var10.field1791 * 4096 / var109;
                                                if (var10.field1804 != 0) {
                                                    var108.method2677(var10.field1791 / 2 + var13, var10.field1788 / 2 + var14, var10.field1804, var115);
                                                } else if (var15 != 0) {
                                                    var108.method2673(var13, var14, var10.field1791, var10.field1788, 256 - (var15 & 0xFF));
                                                } else if (var10.field1791 == var109 && var10.field1788 == var110) {
                                                    var108.method2683(var13, var14);
                                                } else {
                                                    var108.method2678(var13, var14, var10.field1791, var10.field1788);
                                                }
                                            }
                                        } else if (class140.field1776) {
                                            method968(var10);
                                        }
                                    } else {
                                        class170 var107 = var10.method1791(method748(var10));
                                        if (var107 != null) {
                                            var107.method2683(var13, var14);
                                        } else if (class140.field1776) {
                                            method968(var10);
                                        }
                                    }
                                } else if (var10.field1780 == 6) {
                                    boolean var116 = method748(var10);
                                    int var117;
                                    if (var116) {
                                        var117 = var10.field1815;
                                    } else {
                                        var117 = var10.field1816;
                                    }
                                    class180 var118 = null;
                                    int var119 = 0;
                                    if (var10.field1783 != -1) {
                                        class161 var120 = class161.method2496(var10.field1783);
                                        if (var120 != null) {
                                            class161 var121 = var120.method2501(var10.field1886);
                                            var118 = var121.method2541(1);
                                            if (var118 == null) {
                                                method968(var10);
                                            } else {
                                                var118.method2977();
                                                var119 = var118.field2484 / 2;
                                            }
                                        }
                                    } else if (var10.field1810 == 5) {
                                        if (var10.field1811 == 0) {
                                            var118 = field1923.method1138((class155) null, -1, (class155) null, -1);
                                        } else {
                                            var118 = Statics.field1127.method2628();
                                        }
                                    } else if (var117 == -1) {
                                        var118 = var10.method1772((class155) null, -1, var116, Statics.field1127.field2792);
                                        if (var118 == null && class140.field1776) {
                                            method968(var10);
                                        }
                                    } else {
                                        class155 var122 = class155.method2497(var117);
                                        var118 = var10.method1772(var122, var10.field1876, var116, Statics.field1127.field2792);
                                        if (var118 == null && class140.field1776) {
                                            method968(var10);
                                        }
                                    }
                                    class172.method2782(var10.field1791 / 2 + var13, var10.field1788 / 2 + var14);
                                    int var123 = var10.field1841 * class172.field2543[var10.field1802] >> 16;
                                    int var124 = var10.field1841 * class172.field2544[var10.field1802] >> 16;
                                    if (var118 != null) {
                                        if (var10.field1777) {
                                            var118.method2977();
                                            if (var10.field1823) {
                                                var118.method2990(0, var10.field1798, var10.field1792, var10.field1802, var10.field1858, var10.field1817 + var119 + var123, var10.field1817 + var124, var10.field1841);
                                            } else {
                                                var118.method2986(0, var10.field1798, var10.field1792, var10.field1802, var10.field1858, var10.field1817 + var119 + var123, var10.field1817 + var124);
                                            }
                                        } else {
                                            var118.method2986(0, var10.field1798, 0, var10.field1802, 0, var123, var124);
                                        }
                                    }
                                    class172.method2750();
                                } else {
                                    if (var10.field1780 == 7) {
                                        class181 var125 = var10.method1770();
                                        if (var125 == null) {
                                            if (class140.field1776) {
                                                method968(var10);
                                            }
                                            continue;
                                        }
                                        int var126 = 0;
                                        for (int var127 = 0; var127 < var10.field1788; var127++) {
                                            for (int var128 = 0; var128 < var10.field1791; var128++) {
                                                if (var10.field1880[var126] > 0) {
                                                    class161 var129 = class161.method2496(var10.field1880[var126] - 1);
                                                    String var130;
                                                    if (var129.field2453 != 1 && var10.field1881[var126] == 1) {
                                                        var130 = class1.method47(16748608) + var129.field2432 + class1.field8;
                                                    } else {
                                                        var130 = class1.method47(16748608) + var129.field2432 + class1.field8 + " " + 'x' + method272(var10.field1881[var126]);
                                                    }
                                                    int var131 = (var10.field1831 + 115) * var128 + var13;
                                                    int var132 = (var10.field1819 + 12) * var127 + var14;
                                                    if (var10.field1871 == 0) {
                                                        var125.method2876(var130, var131, var132, var10.field1795, var10.field1830 ? 0 : -1);
                                                    } else if (var10.field1871 == 1) {
                                                        var125.method2881(var130, var10.field1791 / 2 + var131, var132, var10.field1795, var10.field1830 ? 0 : -1);
                                                    } else {
                                                        var125.method2808(var130, var10.field1791 + var131 - 1, var132, var10.field1795, var10.field1830 ? 0 : -1);
                                                    }
                                                }
                                                var126++;
                                            }
                                        }
                                    }
                                    if (var10.field1780 == 8 && Statics.field743 == var10 && field2072 == field2071) {
                                        int var133 = 0;
                                        int var134 = 0;
                                        class181 var135 = Statics.field2160;
                                        String var136 = var10.field1825;
                                        String var137 = method1470(var136, var10);
                                        while (var137.length() > 0) {
                                            int var138 = var137.indexOf(class1.field7);
                                            String var139;
                                            if (var138 == -1) {
                                                var139 = var137;
                                                var137 = "";
                                            } else {
                                                var139 = var137.substring(0, var138);
                                                var137 = var137.substring(var138 + 4);
                                            }
                                            int var140 = var135.method2802(var139);
                                            if (var140 > var133) {
                                                var133 = var140;
                                            }
                                            var134 += var135.field2559 + 1;
                                        }
                                        var133 += 6;
                                        var134 += 7;
                                        int var141 = var10.field1791 + var13 - 5 - var133;
                                        int var142 = var10.field1788 + var14 + 5;
                                        if (var141 < var13 + 5) {
                                            var141 = var13 + 5;
                                        }
                                        if (var133 + var141 > arg4) {
                                            var141 = arg4 - var133;
                                        }
                                        if (var134 + var142 > arg5) {
                                            var142 = arg5 - var134;
                                        }
                                        class164.method2582(var141, var142, var133, var134, 16777120);
                                        class164.method2584(var141, var142, var133, var134, 0);
                                        String var143 = var10.field1825;
                                        int var144 = var135.field2559 + var142 + 2;
                                        String var145 = method1470(var143, var10);
                                        while (var145.length() > 0) {
                                            int var146 = var145.indexOf(class1.field7);
                                            String var147;
                                            if (var146 == -1) {
                                                var147 = var145;
                                                var145 = "";
                                            } else {
                                                var147 = var145.substring(0, var146);
                                                var145 = var145.substring(var146 + 4);
                                            }
                                            var135.method2876(var147, var141 + 3, var144, 0, -1);
                                            var144 += var135.field2559 + 1;
                                        }
                                    }
                                    if (var10.field1780 == 9) {
                                        if (var10.field1801 == 1) {
                                            class164.method2590(var13, var14, var10.field1791 + var13, var10.field1788 + var14, var10.field1795);
                                        } else {
                                            int var148 = var10.field1791 >= 0 ? var10.field1791 : -var10.field1791;
                                            int var149 = var10.field1788 >= 0 ? var10.field1788 : -var10.field1788;
                                            int var150 = var148;
                                            if (var148 < var149) {
                                                var150 = var149;
                                            }
                                            if (var150 != 0) {
                                                int var151 = (var10.field1791 << 16) / var150;
                                                int var152 = (var10.field1788 << 16) / var150;
                                                if (var152 <= var151) {
                                                    var151 = -var151;
                                                } else {
                                                    var152 = -var152;
                                                }
                                                int var153 = var10.field1801 * var152 >> 17;
                                                int var154 = var10.field1801 * var152 + 1 >> 17;
                                                int var155 = var10.field1801 * var151 >> 17;
                                                int var156 = var10.field1801 * var151 + 1 >> 17;
                                                int var157 = var13 + var153;
                                                int var158 = var13 - var154;
                                                int var159 = var10.field1791 + var13 - var154;
                                                int var160 = var10.field1791 + var13 + var153;
                                                int var161 = var14 + var155;
                                                int var162 = var14 - var156;
                                                int var163 = var10.field1788 + var14 - var156;
                                                int var164 = var10.field1788 + var14 + var155;
                                                class172.method2756(var157, var158, var159);
                                                class172.method2759(var161, var162, var163, var157, var158, var159, var10.field1795);
                                                class172.method2756(var157, var159, var160);
                                                class172.method2759(var161, var163, var164, var157, var159, var160, var10.field1795);
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

    @ObfuscatedName("dx.fo(Ljava/lang/String;Leh;I)Ljava/lang/String;")
    public static String method1470(String arg0, class140 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = Statics.method1322(arg1, var2 - 1);
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
                if (Statics.field1573 != null) {
                    var8 = class82.method96(Statics.field1573.field504);
                    if (Statics.field1573.field501 != null) {
                        var8 = (String) Statics.field1573.field501;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("z.fz(IS)Ljava/lang/String;")
    public static final String method272(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class1.field3 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class1.method47(65408) + var1.substring(0, var1.length() - 8) + class74.field1010 + " " + class1.field2 + var1 + class1.field5 + class1.field8;
        } else if (var1.length() > 6) {
            return " " + class1.method47(16777215) + var1.substring(0, var1.length() - 4) + class74.field1068 + " " + class1.field2 + var1 + class1.field5 + class1.field8;
        } else {
            return " " + class1.method47(16776960) + var1 + class1.field8;
        }
    }

    @ObfuscatedName("bz.fc(Leh;I)Z")
    public static final boolean method748(class140 arg0) {
        if (arg0.field1828 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field1828.length; var1++) {
            int var2 = Statics.method1322(arg0, var1);
            int var3 = arg0.field1787[var1];
            if (arg0.field1828[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field1828[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field1828[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("dy.fq([Leh;IIIIIIIS)V")
    public static final void method1459(class140[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class140 var9 = arg0[var8];
            if (var9 != null && (!var9.field1777 || var9.field1780 == 0 || var9.field1845 || method357(var9) != 0 || field1959 == var9) && var9.field1789 == arg1 && (!var9.field1777 || !method986(var9))) {
                int var10 = var9.field1769 + arg6;
                int var11 = var9.field1784 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field1780 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field1780 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field1791 + var10;
                    int var19 = var9.field1788 + var11;
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
                    int var22 = var9.field1791 + var10;
                    int var23 = var9.field1788 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field2189 == var9) {
                    field2058 = true;
                    field2099 = var10;
                    field2100 = var11;
                }
                if (!var9.field1777 || var12 < var14 && var13 < var15) {
                    if (var9.field1782 == 1337) {
                        method968(var9);
                    } else if (var9.field1782 != 1338) {
                        if (var9.field1780 == 0) {
                            if (!var9.field1777 && method986(var9) && Statics.field1575 != var9) {
                                continue;
                            }
                            method1459(arg0, var9.field1778, var12, var13, var14, var15, var10 - var9.field1820, var11 - var9.field1774);
                            if (var9.field1877 != null) {
                                method1459(var9.field1877, var9.field1778, var12, var13, var14, var15, var10 - var9.field1820, var11 - var9.field1774);
                            }
                            class123 var36 = (class123) field2080.method1259((long) var9.field1778);
                            if (var36 != null) {
                                int var37 = var36.field1595;
                                if (class140.method1094(var37)) {
                                    method1459(Statics.field806[var37], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field1777) {
                            boolean var38;
                            if (class36.field486 >= var12 && class36.field487 >= var13 && class36.field486 < var14 && class36.field487 < var15) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if (class36.field485 == 1 && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if (class36.field481 == 1 && class36.field489 >= var12 && class36.field494 >= var13 && class36.field489 < var14 && class36.field494 < var15) {
                                var40 = true;
                            }
                            if (var40) {
                                method860(var9, class36.field489 - var10, class36.field494 - var11);
                            }
                            if (field2189 != null && field2189 != var9 && var38 && class92.method136(method357(var9))) {
                                field2019 = var9;
                            }
                            if (field1959 == var9) {
                                field2063 = true;
                                field2096 = var10;
                                field2171 = var11;
                            }
                            if (var9.field1845) {
                                if (var38 && field2117 != 0 && var9.field1866 != null) {
                                    class122 var41 = new class122();
                                    var41.field1585 = var9;
                                    var41.field1587 = field2117;
                                    var41.field1591 = var9.field1866;
                                    field2086.method1284(var41);
                                }
                                if (field2189 != null || Statics.field1503 != null || field2064) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field1857 && var40) {
                                    var9.field1857 = true;
                                    if (var9.field1847 != null) {
                                        class122 var42 = new class122();
                                        var42.field1585 = var9;
                                        var42.field1586 = class36.field489 - var10;
                                        var42.field1587 = class36.field494 - var11;
                                        var42.field1591 = var9.field1847;
                                        field2086.method1284(var42);
                                    }
                                }
                                if (var9.field1857 && var39 && var9.field1848 != null) {
                                    class122 var43 = new class122();
                                    var43.field1585 = var9;
                                    var43.field1586 = class36.field486 - var10;
                                    var43.field1587 = class36.field487 - var11;
                                    var43.field1591 = var9.field1848;
                                    field2086.method1284(var43);
                                }
                                if (var9.field1857 && !var39) {
                                    var9.field1857 = false;
                                    if (var9.field1843 != null) {
                                        class122 var44 = new class122();
                                        var44.field1585 = var9;
                                        var44.field1586 = class36.field486 - var10;
                                        var44.field1587 = class36.field487 - var11;
                                        var44.field1591 = var9.field1843;
                                        field2120.method1284(var44);
                                    }
                                }
                                if (var39 && var9.field1850 != null) {
                                    class122 var45 = new class122();
                                    var45.field1585 = var9;
                                    var45.field1586 = class36.field486 - var10;
                                    var45.field1587 = class36.field487 - var11;
                                    var45.field1591 = var9.field1850;
                                    field2086.method1284(var45);
                                }
                                if (!var9.field1882 && var38) {
                                    var9.field1882 = true;
                                    if (var9.field1851 != null) {
                                        class122 var46 = new class122();
                                        var46.field1585 = var9;
                                        var46.field1586 = class36.field486 - var10;
                                        var46.field1587 = class36.field487 - var11;
                                        var46.field1591 = var9.field1851;
                                        field2086.method1284(var46);
                                    }
                                }
                                if (var9.field1882 && var38 && var9.field1852 != null) {
                                    class122 var47 = new class122();
                                    var47.field1585 = var9;
                                    var47.field1586 = class36.field486 - var10;
                                    var47.field1587 = class36.field487 - var11;
                                    var47.field1591 = var9.field1852;
                                    field2086.method1284(var47);
                                }
                                if (var9.field1882 && !var38) {
                                    var9.field1882 = false;
                                    if (var9.field1853 != null) {
                                        class122 var48 = new class122();
                                        var48.field1585 = var9;
                                        var48.field1586 = class36.field486 - var10;
                                        var48.field1587 = class36.field487 - var11;
                                        var48.field1591 = var9.field1853;
                                        field2120.method1284(var48);
                                    }
                                }
                                if (var9.field1864 != null) {
                                    class122 var49 = new class122();
                                    var49.field1585 = var9;
                                    var49.field1591 = var9.field1864;
                                    field2119.method1284(var49);
                                }
                                if (var9.field1808 != null && field2106 > var9.field1888) {
                                    if (var9.field1859 == null || field2106 - var9.field1888 > 32) {
                                        class122 var54 = new class122();
                                        var54.field1585 = var9;
                                        var54.field1591 = var9.field1808;
                                        field2086.method1284(var54);
                                    } else {
                                        label450: for (int var50 = var9.field1888; var50 < field2106; var50++) {
                                            int var51 = field2105[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field1859.length; var52++) {
                                                if (var9.field1859[var52] == var51) {
                                                    class122 var53 = new class122();
                                                    var53.field1585 = var9;
                                                    var53.field1591 = var9.field1808;
                                                    field2086.method1284(var53);
                                                    break label450;
                                                }
                                            }
                                        }
                                    }
                                    var9.field1888 = field2106;
                                }
                                if (var9.field1860 != null && field2138 > var9.field1891) {
                                    if (var9.field1861 == null || field2138 - var9.field1891 > 32) {
                                        class122 var59 = new class122();
                                        var59.field1585 = var9;
                                        var59.field1591 = var9.field1860;
                                        field2086.method1284(var59);
                                    } else {
                                        label430: for (int var55 = var9.field1891; var55 < field2138; var55++) {
                                            int var56 = field2094[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field1861.length; var57++) {
                                                if (var9.field1861[var57] == var56) {
                                                    class122 var58 = new class122();
                                                    var58.field1585 = var9;
                                                    var58.field1591 = var9.field1860;
                                                    field2086.method1284(var58);
                                                    break label430;
                                                }
                                            }
                                        }
                                    }
                                    var9.field1891 = field2138;
                                }
                                if (var9.field1862 != null && field2110 > var9.field1832) {
                                    if (var9.field1863 == null || field2110 - var9.field1832 > 32) {
                                        class122 var64 = new class122();
                                        var64.field1585 = var9;
                                        var64.field1591 = var9.field1862;
                                        field2086.method1284(var64);
                                    } else {
                                        label410: for (int var60 = var9.field1832; var60 < field2110; var60++) {
                                            int var61 = field2109[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field1863.length; var62++) {
                                                if (var9.field1863[var62] == var61) {
                                                    class122 var63 = new class122();
                                                    var63.field1585 = var9;
                                                    var63.field1591 = var9.field1862;
                                                    field2086.method1284(var63);
                                                    break label410;
                                                }
                                            }
                                        }
                                    }
                                    var9.field1832 = field2110;
                                }
                                if (field2111 > var9.field1889 && var9.field1867 != null) {
                                    class122 var65 = new class122();
                                    var65.field1585 = var9;
                                    var65.field1591 = var9.field1867;
                                    field2086.method1284(var65);
                                }
                                if (field2112 > var9.field1889 && var9.field1869 != null) {
                                    class122 var66 = new class122();
                                    var66.field1585 = var9;
                                    var66.field1591 = var9.field1869;
                                    field2086.method1284(var66);
                                }
                                if (field2113 > var9.field1889 && var9.field1875 != null) {
                                    class122 var67 = new class122();
                                    var67.field1585 = var9;
                                    var67.field1591 = var9.field1875;
                                    field2086.method1284(var67);
                                }
                                if (field2114 > var9.field1889 && var9.field1849 != null) {
                                    class122 var68 = new class122();
                                    var68.field1585 = var9;
                                    var68.field1591 = var9.field1849;
                                    field2086.method1284(var68);
                                }
                                var9.field1889 = field2102;
                                if (var9.field1890 != null) {
                                    for (int var69 = 0; var69 < field2146; var69++) {
                                        class122 var70 = new class122();
                                        var70.field1585 = var9;
                                        var70.field1590 = field2148[var69];
                                        var70.field1588 = field2147[var69];
                                        var70.field1591 = var9.field1890;
                                        field2086.method1284(var70);
                                    }
                                }
                            }
                        }
                        if (!var9.field1777) {
                            if (field2189 != null || Statics.field1503 != null || field2064) {
                                return;
                            }
                            if ((var9.field1807 >= 0 || var9.field1797 != 0) && class36.field486 >= var12 && class36.field487 >= var13 && class36.field486 < var14 && class36.field487 < var15) {
                                if (var9.field1807 >= 0) {
                                    Statics.field1575 = arg0[var9.field1807];
                                } else {
                                    Statics.field1575 = var9;
                                }
                            }
                            if (var9.field1780 == 8 && class36.field486 >= var12 && class36.field487 >= var13 && class36.field486 < var14 && class36.field487 < var15) {
                                Statics.field743 = var9;
                            }
                            if (var9.field1794 > var9.field1788) {
                                int var71 = var9.field1791 + var10;
                                int var72 = var9.field1788;
                                int var73 = var9.field1794;
                                int var74 = class36.field486;
                                int var75 = class36.field487;
                                if (field2091) {
                                    field2127 = 32;
                                } else {
                                    field2127 = 0;
                                }
                                field2091 = false;
                                if (class36.field485 != 0) {
                                    if (var74 >= var71 && var74 < var71 + 16 && var75 >= var11 && var75 < var11 + 16) {
                                        var9.field1774 -= 4;
                                        method968(var9);
                                    } else if (var74 >= var71 && var74 < var71 + 16 && var75 >= var11 + var72 - 16 && var75 < var11 + var72) {
                                        var9.field1774 += 4;
                                        method968(var9);
                                    } else if (var74 >= var71 - field2127 && var74 < field2127 + var71 + 16 && var75 >= var11 + 16 && var75 < var11 + var72 - 16) {
                                        int var76 = (var72 - 32) * var72 / var73;
                                        if (var76 < 8) {
                                            var76 = 8;
                                        }
                                        int var77 = var75 - var11 - 16 - var76 / 2;
                                        int var78 = var72 - 32 - var76;
                                        var9.field1774 = (var73 - var72) * var77 / var78;
                                        method968(var9);
                                        field2091 = true;
                                    }
                                }
                                if (field2117 != 0) {
                                    int var79 = var9.field1791;
                                    if (var74 >= var71 - var79 && var75 >= var11 && var74 < var71 + 16 && var75 <= var11 + var72) {
                                        var9.field1774 += field2117 * 45;
                                        method968(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field2076 == 0 || field2076 == 3) && class36.field481 == 1) {
                        int var24 = class36.field489 - 25 - var10;
                        int var25 = class36.field494 - 5 - var11;
                        if (var24 >= 0 && var25 >= 0 && var24 < 146 && var25 < 151) {
                            var24 -= 73;
                            var25 -= 75;
                            int var26 = field2047 + field2002 & 0x7FF;
                            int var27 = class172.field2543[var26];
                            int var28 = class172.field2544[var26];
                            int var29 = (field1988 + 256) * var27 >> 8;
                            int var30 = (field1988 + 256) * var28 >> 8;
                            int var31 = var24 * var30 + var25 * var29 >> 11;
                            int var32 = var25 * var30 - var24 * var29 >> 11;
                            int var33 = Statics.field1127.field2642 + var31 >> 7;
                            int var34 = Statics.field1127.field2614 - var32 >> 7;
                            boolean var35 = method721(Statics.field1127.field2666[0], Statics.field1127.field2649[0], var33, var34, true, 0, 0, 0, 0, 0, 1);
                            if (var35) {
                                field2176.method1558(var24);
                                field2176.method1558(var25);
                                field2176.method1559(field2002);
                                field2176.method1558(57);
                                field2176.method1558(field2047);
                                field2176.method1558(field1988);
                                field2176.method1558(89);
                                field2176.method1559(Statics.field1127.field2642);
                                field2176.method1559(Statics.field1127.field2614);
                                field2176.method1558(field1974);
                                field2176.method1558(63);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bg.fk([Leh;II)V")
    public static final void method873(class140[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class140 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field1780 == 0) {
                    if (var3.field1877 != null) {
                        method873(var3.field1877, arg1);
                    }
                    class123 var4 = (class123) field2080.method1259((long) var3.field1778);
                    if (var4 != null) {
                        int var5 = var4.field1595;
                        if (class140.method1094(var5)) {
                            method873(Statics.field806[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field1781 != null) {
                    class122 var6 = new class122();
                    var6.field1585 = var3;
                    var6.field1591 = var3.field1781;
                    class12.method870(var6);
                }
                if (arg1 == 1 && var3.field1873 != null) {
                    if (var3.field1779 >= 0) {
                        class140 var7 = class140.method53(var3.field1778);
                        if (var7 == null || var7.field1877 == null || var3.field1779 >= var7.field1877.length || var7.field1877[var3.field1779] != var3) {
                            continue;
                        }
                    }
                    class122 var8 = new class122();
                    var8.field1585 = var3;
                    var8.field1591 = var3.field1873;
                    class12.method870(var8);
                }
            }
        }
    }

    @ObfuscatedName("bp.ff(Leh;III)V")
    public static final void method860(class140 arg0, int arg1, int arg2) {
        if (field2189 != null || field2064 || arg0 == null || Statics.method690(arg0) == null) {
            return;
        }
        field2189 = arg0;
        field1959 = Statics.method690(arg0);
        field2108 = arg1;
        field2089 = arg2;
        Statics.field260 = 0;
        field2101 = false;
    }

    @ObfuscatedName("cd.ft(Leh;I)V")
    public static void method968(class140 arg0) {
        if (field2124 == arg0.field1894) {
            field2125[arg0.field1893] = true;
        }
    }

    @ObfuscatedName("ab.fx(B)V")
    public static void method693() {
        for (class123 var0 = (class123) field2080.method1262(); var0 != null; var0 = (class123) field2080.method1266()) {
            int var1 = var0.field1595;
            if (class140.method1094(var1)) {
                boolean var2 = true;
                class140[] var3 = Statics.field806[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field1777;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field1500;
                    class140 var6 = class140.method53(var5);
                    if (var6 != null) {
                        method968(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ch.fr([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method1207(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("cj.fa(II)V")
    public static final void method985(int arg0) {
        if (!class140.method1094(arg0)) {
            return;
        }
        class140[] var1 = Statics.field806[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class140 var3 = var1[var2];
            if (var3 != null) {
                var3.field1876 = 0;
                var3.field1885 = 0;
            }
        }
    }

    @ObfuscatedName("aj.fl(II)V")
    public static final void method700(int arg0) {
        if (class140.method1094(arg0)) {
            method853(Statics.field806[arg0], -1);
        }
    }

    @ObfuscatedName("br.gv([Leh;IB)V")
    public static final void method853(class140[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class140 var3 = arg0[var2];
            if (var3 != null && var3.field1789 == arg1 && (!var3.field1777 || !method986(var3))) {
                if (var3.field1780 == 0) {
                    if (!var3.field1777 && method986(var3) && Statics.field1575 != var3) {
                        continue;
                    }
                    method853(arg0, var3.field1778);
                    if (var3.field1877 != null) {
                        method853(var3.field1877, var3.field1778);
                    }
                    class123 var4 = (class123) field2080.method1259((long) var3.field1778);
                    if (var4 != null) {
                        method700(var4.field1595);
                    }
                }
                if (var3.field1780 == 6) {
                    if (var3.field1816 != -1 || var3.field1815 != -1) {
                        boolean var5 = method748(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field1815;
                        } else {
                            var6 = var3.field1816;
                        }
                        if (var6 != -1) {
                            class155 var7 = class155.method2497(var6);
                            var3.field1885 += field1961;
                            while (var3.field1885 > var7.field2359[var3.field1876]) {
                                var3.field1885 -= var7.field2359[var3.field1876];
                                var3.field1876++;
                                if (var3.field1876 >= var7.field2369.length) {
                                    var3.field1876 -= var7.field2363;
                                    if (var3.field1876 < 0 || var3.field1876 >= var7.field2369.length) {
                                        var3.field1876 = 0;
                                    }
                                }
                                method968(var3);
                            }
                        }
                    }
                    if (var3.field1822 != 0 && !var3.field1777) {
                        int var8 = var3.field1822 >> 16;
                        int var9 = var3.field1822 << 16 >> 16;
                        int var10 = field1961 * var8;
                        int var11 = field1961 * var9;
                        var3.field1802 = var3.field1802 + var10 & 0x7FF;
                        var3.field1798 = var3.field1798 + var11 & 0x7FF;
                        method968(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("eh.gp(II)V")
    public static final void method1804(int arg0) {
        method693();
        class124.method1464();
        int var1 = class163.method1762(arg0).field2475;
        if (var1 == 0) {
            return;
        }
        int var2 = class89.field1205[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class172.method2753(0.9D);
                ((class54) Statics.field2540).method727(0.9D);
            }
            if (var2 == 2) {
                class172.method2753(0.8D);
                ((class54) Statics.field2540).method727(0.8D);
            }
            if (var2 == 3) {
                class172.method2753(0.7D);
                ((class54) Statics.field2540).method727(0.7D);
            }
            if (var2 == 4) {
                class172.method2753(0.6D);
                ((class54) Statics.field2540).method727(0.6D);
            }
            class161.method1336();
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
            if (field2164 != var3) {
                if (field2164 == 0 && field2165 != -1) {
                    class78.method370(Statics.field1095, field2165, 0, var3, false);
                    field2166 = false;
                } else if (var3 == 0) {
                    Statics.field1110.method2263();
                    class78.field1109 = 1;
                    Statics.field1106 = null;
                    field2166 = false;
                } else {
                    class78.method1480(var3);
                }
                field2164 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field2168 = 127;
            }
            if (var2 == 1) {
                field2168 = 96;
            }
            if (var2 == 2) {
                field2168 = 64;
            }
            if (var2 == 3) {
                field2168 = 32;
            }
            if (var2 == 4) {
                field2168 = 0;
            }
        }
        if (var1 == 5) {
            field2059 = var2;
        }
        if (var1 == 6) {
            field2081 = var2;
        }
        if (var1 == 9) {
            field2082 = var2;
        }
        if (var1 != 10) {
            return;
        }
        if (var2 == 0) {
            field1953 = 127;
        }
        if (var2 == 1) {
            field1953 = 96;
        }
        if (var2 == 2) {
            field1953 = 64;
        }
        if (var2 == 3) {
            field1953 = 32;
        }
        if (var2 == 4) {
            field1953 = 0;
        }
    }

    @ObfuscatedName("em.gm(IIII)Ldx;")
    public static final class123 method1760(int arg0, int arg1, int arg2) {
        class123 var3 = new class123();
        var3.field1595 = arg1;
        var3.field1596 = arg2;
        field2080.method1265(var3, (long) arg0);
        method985(arg1);
        class12.method884(arg1);
        class140 var4 = class140.method53(arg0);
        if (var4 != null) {
            method968(var4);
        }
        if (field2083 != null) {
            method968(field2083);
            field2083 = null;
        }
        field2064 = false;
        field1947 = 0;
        method966(Statics.field1558, Statics.field10, Statics.field113, Statics.field1574);
        if (field2079 != -1) {
            int var5 = field2079;
            if (class140.method1094(var5)) {
                method873(Statics.field806[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("cx.gq(Ldx;ZI)V")
    public static final void method1114(class123 arg0, boolean arg1) {
        int var2 = arg0.field1595;
        int var3 = (int) arg0.field1500;
        arg0.method1307();
        if (arg1) {
            class140.method62(var2);
        }
        for (class141 var4 = (class141) field2121.method1262(); var4 != null; var4 = (class141) field2121.method1266()) {
            if ((long) var2 == (var4.field1500 >> 48 & 0xFFFFL)) {
                var4.method1307();
            }
        }
        class140 var5 = class140.method53(var3);
        if (var5 != null) {
            method968(var5);
        }
        field2064 = false;
        field1947 = 0;
        method966(Statics.field1558, Statics.field10, Statics.field113, Statics.field1574);
        if (field2079 != -1) {
            int var6 = field2079;
            if (class140.method1094(var6)) {
                method873(Statics.field806[var6], 1);
            }
        }
    }

    @ObfuscatedName("br.gi(Leh;I)Z")
    public static final boolean method854(class140 arg0) {
        int var1 = arg0.field1782;
        if (var1 == 205) {
            field2107 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1923.method1131(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1923.method1132(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1923.method1136(false);
        }
        if (var1 == 325) {
            field1923.method1136(true);
        }
        if (var1 == 326) {
            field2176.method2288(154);
            field1923.method1142(field2176);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bc.gd(IIIB)V")
    public static final void method886(int arg0, int arg1, int arg2) {
        method414();
        class164.method2576(arg0, arg1, Statics.field1716.field2513 + arg0, Statics.field1716.field2515 + arg1);
        if (field2076 == 2 || field2076 == 5) {
            class164.method2606(arg0 + 25, arg1 + 5, 0, Statics.field521, Statics.field1616);
        } else {
            int var3 = field2047 + field2002 & 0x7FF;
            int var4 = Statics.field1127.field2642 / 32 + 48;
            int var5 = 464 - Statics.field1127.field2614 / 32;
            Statics.field1768.method2675(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field1988 + 256, Statics.field521, Statics.field1616);
            for (int var6 = 0; var6 < field2152; var6++) {
                int var7 = field1926[var6] * 4 + 2 - Statics.field1127.field2642 / 32;
                int var8 = field2154[var6] * 4 + 2 - Statics.field1127.field2614 / 32;
                method134(arg0, arg1, var7, var8, field2153[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class104 var11 = field2052[Statics.field1622][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field1127.field2642 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field1127.field2614 / 32;
                        method134(arg0, arg1, var12, var13, Statics.field1207[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field2157; var14++) {
                class183 var15 = field1946[field1948[var14]];
                if (var15 != null && var15.method2900()) {
                    class152 var16 = var15.field2804;
                    if (var16 != null && var16.field2295 != null) {
                        var16 = var16.method2316();
                    }
                    if (var16 != null && var16.field2265 && var16.field2298) {
                        int var17 = var15.field2642 / 32 - Statics.field1127.field2642 / 32;
                        int var18 = var15.field2614 / 32 - Statics.field1127.field2614 / 32;
                        method134(arg0, arg1, var17, var18, Statics.field1207[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field2038; var19++) {
                class182 var20 = field2037[field2039[var19]];
                if (var20 != null && var20.method2900()) {
                    int var21 = var20.field2642 / 32 - Statics.field1127.field2642 / 32;
                    int var22 = var20.field2614 / 32 - Statics.field1127.field2614 / 32;
                    boolean var23 = false;
                    String var24 = var20.field2797;
                    boolean var25;
                    if (var24 == null) {
                        var25 = false;
                    } else {
                        int var26 = 0;
                        while (true) {
                            if (var26 >= field2031) {
                                if (var24.equalsIgnoreCase(Statics.field1127.field2797)) {
                                    var25 = true;
                                } else {
                                    var25 = false;
                                }
                                break;
                            }
                            if (var24.equalsIgnoreCase(field2188[var26].field172)) {
                                var25 = true;
                                break;
                            }
                            var26++;
                        }
                    }
                    if (var25) {
                        var23 = true;
                    }
                    boolean var27 = false;
                    if (Statics.field1127.field2803 != 0 && var20.field2803 != 0 && Statics.field1127.field2803 == var20.field2803) {
                        var27 = true;
                    }
                    if (var23) {
                        method134(arg0, arg1, var21, var22, Statics.field1207[3]);
                    } else if (var27) {
                        method134(arg0, arg1, var21, var22, Statics.field1207[4]);
                    } else {
                        method134(arg0, arg1, var21, var22, Statics.field1207[2]);
                    }
                }
            }
            if (field2050 != 0 && field1917 % 20 < 10) {
                if (field2050 == 1 && field2090 >= 0 && field2090 < field1946.length) {
                    class183 var28 = field1946[field2090];
                    if (var28 != null) {
                        int var29 = var28.field2642 / 32 - Statics.field1127.field2642 / 32;
                        int var30 = var28.field2614 / 32 - Statics.field1127.field2614 / 32;
                        method861(arg0, arg1, var29, var30, Statics.field1229[1]);
                    }
                }
                if (field2050 == 2) {
                    int var31 = field1928 * 4 - Statics.field1739 * 4 + 2 - Statics.field1127.field2642 / 32;
                    int var32 = field1929 * 4 - Statics.field1766 * 4 + 2 - Statics.field1127.field2614 / 32;
                    method861(arg0, arg1, var31, var32, Statics.field1229[1]);
                }
                if (field2050 == 10 && field1927 >= 0 && field1927 < field2037.length) {
                    class182 var33 = field2037[field1927];
                    if (var33 != null) {
                        int var34 = var33.field2642 / 32 - Statics.field1127.field2642 / 32;
                        int var35 = var33.field2614 / 32 - Statics.field1127.field2614 / 32;
                        method861(arg0, arg1, var34, var35, Statics.field1229[1]);
                    }
                }
            }
            if (field2156 != 0) {
                int var36 = field2156 * 4 + 2 - Statics.field1127.field2642 / 32;
                int var37 = field2062 * 4 + 2 - Statics.field1127.field2614 / 32;
                method134(arg0, arg1, var36, var37, Statics.field1229[0]);
            }
            class164.method2582(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field2076 < 3) {
            Statics.field1206.method2675(arg0, arg1, 33, 33, 25, 25, field2002, 256, Statics.field360, Statics.field1594);
        } else {
            class164.method2606(arg0, arg1, 0, Statics.field360, Statics.field1594);
        }
        if (field1993[arg2]) {
            Statics.field1716.method2736(arg0, arg1);
        }
        field2126[arg2] = true;
    }

    @ObfuscatedName("bp.gy(IIIILfz;I)V")
    public static final void method861(int arg0, int arg1, int arg2, int arg3, class170 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method134(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field2047 + field2002 & 0x7FF;
        int var7 = class172.field2543[var6];
        int var8 = class172.field2544[var6];
        int var9 = var7 * 256 / (field1988 + 256);
        int var10 = var8 * 256 / (field1988 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field811.method2687(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("v.gt(IIIILfz;I)V")
    public static final void method134(int arg0, int arg1, int arg2, int arg3, class170 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field2047 + field2002 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class172.field2543[var5];
        int var8 = class172.field2544[var5];
        int var9 = var7 * 256 / (field1988 + 256);
        int var10 = var8 * 256 / (field1988 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method2679(Statics.field1716, arg0 + 94 + var11 - arg4.field2502 / 2 + 4, arg1 + 83 - var12 - arg4.field2506 / 2 - 4);
        } else {
            arg4.method2683(arg0 + 94 + var11 - arg4.field2502 / 2 + 4, arg1 + 83 - var12 - arg4.field2506 / 2 - 4);
        }
    }

    @ObfuscatedName("aj.gn(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method701(int arg0, String arg1, String arg2) {
        method301(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("y.gj(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method301(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field2134[var4] = field2134[var4 - 1];
            field1936[var4] = field1936[var4 - 1];
            field2137[var4] = field2137[var4 - 1];
            field2136[var4] = field2136[var4 - 1];
        }
        field2134[0] = arg0;
        field1936[0] = arg1;
        field2137[0] = arg2;
        field2136[0] = arg3;
        field1999++;
        field2111 = field2102;
    }

    @ObfuscatedName("ar.gh(Ljava/lang/String;I)Z")
    public static boolean method511(String arg0) {
        if (arg0 == null) {
            return false;
        }
        for (int var1 = 0; var1 < field2190; var1++) {
            class4 var2 = field1986[var1];
            if (arg0.equalsIgnoreCase(var2.field43)) {
                return true;
            }
            if (arg0.equalsIgnoreCase(var2.field42)) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("en.gl(Ljava/lang/String;I)V")
    public static final void method1809(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field2031 < 200 || field1990 == 1) || field2031 >= 200) {
            method701(0, "", class74.field986);
            return;
        }
        String var1 = class83.method1463(arg0, Statics.field359);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field2031; var2++) {
            class10 var3 = field2188[var2];
            String var4 = class83.method1463(var3.field172, Statics.field359);
            if (var4 != null && var4.equals(var1)) {
                method701(0, "", arg0 + class74.field1016);
                return;
            }
            if (var3.field169 != null) {
                String var5 = class83.method1463(var3.field169, Statics.field359);
                if (var5 != null && var5.equals(var1)) {
                    method701(0, "", arg0 + class74.field1016);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field2190; var6++) {
            class4 var7 = field1986[var6];
            String var8 = class83.method1463(var7.field43, Statics.field359);
            if (var8 != null && var8.equals(var1)) {
                method701(0, "", class74.field1021 + arg0 + class74.field896);
                return;
            }
            if (var7.field42 != null) {
                String var9 = class83.method1463(var7.field42, Statics.field359);
                if (var9 != null && var9.equals(var1)) {
                    method701(0, "", class74.field1021 + arg0 + class74.field896);
                    return;
                }
            }
        }
        if (class83.method1463(Statics.field1127.field2797, Statics.field359).equals(var1)) {
            method701(0, "", class74.field1019);
        } else {
            field2176.method2288(85);
            field2176.method1558(class135.method878(arg0));
            field2176.method1563(arg0);
        }
    }

    @ObfuscatedName("v.ge(Ljava/lang/String;I)V")
    public static final void method135(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class83.method1463(arg0, Statics.field359);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field2190; var2++) {
            class4 var3 = field1986[var2];
            String var4 = var3.field43;
            String var5 = class83.method1463(var4, Statics.field359);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field2190--;
                for (int var7 = var2; var7 < field2190; var7++) {
                    field1986[var7] = field1986[var7 + 1];
                }
                field2112 = field2102;
                field2176.method2288(12);
                field2176.method1558(class135.method878(arg0));
                field2176.method1563(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("ey.gb(Ljava/lang/String;I)V")
    public static final void method1554(String arg0) {
        if (Statics.field828 != null) {
            field2176.method2288(220);
            field2176.method1558(class135.method878(arg0));
            field2176.method1563(arg0);
        }
    }

    @ObfuscatedName("cz.go(I)V")
    public static final void method1002() {
        field2176.method2288(247);
        field2176.method1558(0);
    }

    @ObfuscatedName("ap.gs(Leh;I)I")
    public static int method357(class140 arg0) {
        class141 var1 = (class141) field2121.method1259(((long) arg0.field1778 << 32) + (long) arg0.field1779);
        return var1 == null ? arg0.field1837 : var1.field1895;
    }

    @ObfuscatedName("l.gc(Leh;I)Leh;")
    public static class140 method63(class140 arg0) {
        int var1 = class92.method1317(method357(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class140.method53(arg0.field1789);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("cj.gx(Leh;I)Z")
    public static boolean method986(class140 arg0) {
        if (field2088) {
            if (method357(arg0) != 0) {
                return false;
            }
            if (arg0.field1780 == 0) {
                return false;
            }
        }
        return arg0.field1790;
    }
}

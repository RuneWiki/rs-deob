package deob;

@ObfuscatedName("hw")
public class class189 extends class481 {

    @ObfuscatedName("hw.ao")
    public static class299 field1923 = new class299(64);

    @ObfuscatedName("hw.ab")
    public static class299 field1948 = new class299(50);

    @ObfuscatedName("hw.au")
    public int field1941;

    @ObfuscatedName("hw.aa")
    public String field1926 = class364.field4153;

    @ObfuscatedName("hw.ac")
    public int field1927 = 1;

    @ObfuscatedName("hw.al")
    public int[] field1928;

    @ObfuscatedName("hw.az")
    public int[] field1929;

    @ObfuscatedName("hw.ap")
    public int field1930 = -1;

    @ObfuscatedName("hw.av")
    public int field1931 = -1;

    @ObfuscatedName("hw.ax")
    public int field1940 = -1;

    @ObfuscatedName("hw.as")
    public int field1933 = -1;

    @ObfuscatedName("hw.ay")
    public int field1925 = -1;

    @ObfuscatedName("hw.ak")
    public int field1935 = -1;

    @ObfuscatedName("hw.aj")
    public int field1936 = -1;

    @ObfuscatedName("hw.am")
    public int field1932 = -1;

    @ObfuscatedName("hw.aq")
    public int field1938 = -1;

    @ObfuscatedName("hw.ai")
    public int field1955 = -1;

    @ObfuscatedName("hw.aw")
    public int field1963 = -1;

    @ObfuscatedName("hw.ae")
    public int field1962 = -1;

    @ObfuscatedName("hw.an")
    public int field1942 = -1;

    @ObfuscatedName("hw.ag")
    public int field1959 = -1;

    @ObfuscatedName("hw.ad")
    public int field1946 = -1;

    @ObfuscatedName("hw.af")
    public short[] field1945;

    @ObfuscatedName("hw.be")
    public short[] field1939;

    @ObfuscatedName("hw.bd")
    public short[] field1934;

    @ObfuscatedName("hw.bl")
    public short[] field1937;

    @ObfuscatedName("hw.bi")
    public String[] field1949 = new String[5];

    @ObfuscatedName("hw.bv")
    public boolean field1950 = true;

    @ObfuscatedName("hw.bf")
    public int field1951 = -1;

    @ObfuscatedName("hw.bg")
    public int field1952 = 128;

    @ObfuscatedName("hw.ba")
    public int field1953 = 128;

    @ObfuscatedName("hw.bm")
    public boolean field1965 = false;

    @ObfuscatedName("hw.bp")
    public int field1954 = 0;

    @ObfuscatedName("hw.bw")
    public int field1956 = 0;

    @ObfuscatedName("hw.bj")
    public int field1957 = 32;

    @ObfuscatedName("hw.bn")
    public int[] field1958;

    @ObfuscatedName("hw.bo")
    public int field1921 = -1;

    @ObfuscatedName("hw.bt")
    public int field1960 = -1;

    @ObfuscatedName("hw.bu")
    public boolean field1961 = true;

    @ObfuscatedName("hw.by")
    public boolean field1947 = true;

    @ObfuscatedName("hw.bh")
    public boolean field1943 = false;

    @ObfuscatedName("hw.bz")
    public int[] field1964 = null;

    @ObfuscatedName("hw.bc")
    public short[] field1944 = null;

    @ObfuscatedName("hw.bs")
    public class500 field1966;

    @ObfuscatedName("dz.at(Lol;Lol;B)V")
    public static void method2382(class371 arg0, class371 arg1) {
        Statics.field1922 = arg0;
        Statics.field1978 = arg1;
    }

    @ObfuscatedName("hg.ah(IS)Lhw;")
    public static class189 method3442(int arg0) {
        class189 var1 = (class189) field1923.method5289((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1922.method6284(9, arg0);
        class189 var3 = new class189();
        var3.field1941 = arg0;
        if (var2 != null) {
            var3.method3380(new class527(var2));
        }
        var3.method3379();
        field1923.method5303(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hw.ar(B)V")
    public void method3379() {
    }

    @ObfuscatedName("hw.ao(Luj;B)V")
    public void method3380(class527 arg0) {
        while (true) {
            int var2 = arg0.method8410();
            if (var2 == 0) {
                return;
            }
            this.method3430(arg0, var2);
        }
    }

    @ObfuscatedName("hw.ab(Luj;II)V")
    public void method3430(class527 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8410();
            this.field1928 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1928[var4] = arg0.method8412();
            }
        } else if (arg1 == 2) {
            this.field1926 = arg0.method8535();
        } else if (arg1 == 12) {
            this.field1927 = arg0.method8410();
        } else if (arg1 == 13) {
            this.field1930 = arg0.method8412();
        } else if (arg1 == 14) {
            this.field1933 = arg0.method8412();
        } else if (arg1 == 15) {
            this.field1931 = arg0.method8412();
        } else if (arg1 == 16) {
            this.field1940 = arg0.method8412();
        } else if (arg1 == 17) {
            this.field1933 = arg0.method8412();
            this.field1925 = arg0.method8412();
            this.field1935 = arg0.method8412();
            this.field1936 = arg0.method8412();
        } else if (arg1 == 18) {
            arg0.method8412();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1949[arg1 - 30] = arg0.method8535();
            if (this.field1949[arg1 - 30].equalsIgnoreCase(class364.field4155)) {
                this.field1949[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method8410();
            this.field1945 = new short[var5];
            this.field1939 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1945[var6] = (short) arg0.method8412();
                this.field1939[var6] = (short) arg0.method8412();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8410();
            this.field1934 = new short[var7];
            this.field1937 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1934[var8] = (short) arg0.method8412();
                this.field1937[var8] = (short) arg0.method8412();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method8410();
            this.field1929 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1929[var10] = arg0.method8412();
            }
        } else if (arg1 == 93) {
            this.field1950 = false;
        } else if (arg1 == 95) {
            this.field1951 = arg0.method8412();
        } else if (arg1 == 97) {
            this.field1952 = arg0.method8412();
        } else if (arg1 == 98) {
            this.field1953 = arg0.method8412();
        } else if (arg1 == 99) {
            this.field1965 = true;
        } else if (arg1 == 100) {
            this.field1954 = arg0.method8616();
        } else if (arg1 == 101) {
            this.field1956 = arg0.method8616() * 5;
        } else if (arg1 == 102) {
            int var11 = arg0.method8410();
            int var12 = 0;
            for (int var13 = var11; var13 != 0; var13 >>= 0x1) {
                var12++;
            }
            this.field1964 = new int[var12];
            this.field1944 = new short[var12];
            for (int var14 = 0; var14 < var12; var14++) {
                if ((var11 & 0x1 << var14) == 0) {
                    this.field1964[var14] = -1;
                    this.field1944[var14] = -1;
                } else {
                    this.field1964[var14] = arg0.method8430();
                    this.field1944[var14] = (short) arg0.method8427();
                }
            }
        } else if (arg1 == 103) {
            this.field1957 = arg0.method8412();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field1921 = arg0.method8412();
            if (this.field1921 == 65535) {
                this.field1921 = -1;
            }
            this.field1960 = arg0.method8412();
            if (this.field1960 == 65535) {
                this.field1960 = -1;
            }
            int var15 = -1;
            if (arg1 == 118) {
                var15 = arg0.method8412();
                if (var15 == 65535) {
                    var15 = -1;
                }
            }
            int var16 = arg0.method8410();
            this.field1958 = new int[var16 + 2];
            for (int var17 = 0; var17 <= var16; var17++) {
                this.field1958[var17] = arg0.method8412();
                if (this.field1958[var17] == 65535) {
                    this.field1958[var17] = -1;
                }
            }
            this.field1958[var16 + 1] = var15;
        } else if (arg1 == 107) {
            this.field1961 = false;
        } else if (arg1 == 109) {
            this.field1947 = false;
        } else if (arg1 == 111) {
            this.field1943 = true;
        } else if (arg1 == 114) {
            this.field1932 = arg0.method8412();
        } else if (arg1 == 115) {
            this.field1932 = arg0.method8412();
            this.field1938 = arg0.method8412();
            this.field1955 = arg0.method8412();
            this.field1963 = arg0.method8412();
        } else if (arg1 == 116) {
            this.field1962 = arg0.method8412();
        } else if (arg1 == 117) {
            this.field1962 = arg0.method8412();
            this.field1942 = arg0.method8412();
            this.field1959 = arg0.method8412();
            this.field1946 = arg0.method8412();
        } else if (arg1 == 249) {
            this.field1966 = class182.method3052(arg0, this.field1966);
        }
    }

    @ObfuscatedName("hw.au(Lhx;ILhx;ILhf;B)Lka;")
    public final class280 method3422(class205 arg0, int arg1, class205 arg2, int arg3, class188 arg4) {
        if (this.field1958 != null) {
            class189 var6 = this.method3385();
            return var6 == null ? null : var6.method3422(arg0, arg1, arg2, arg3, arg4);
        }
        long var7 = (long) this.field1941;
        if (arg4 != null) {
            var7 |= arg4.field1918 << 16;
        }
        class280 var9 = (class280) field1948.method5289(var7);
        if (var9 == null) {
            class262 var10 = this.method3382(this.field1928, arg4);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method4593(this.field1954 + 64, this.field1956 + 850, -30, -50, -30);
            field1948.method5303(var9, var7);
        }
        class280 var11;
        if (arg0 != null && arg2 != null) {
            var11 = arg0.method3730(var9, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var11 = arg0.method3727(var9, arg1);
        } else if (arg2 == null) {
            var11 = var9.method5029(true);
        } else {
            var11 = arg2.method3727(var9, arg3);
        }
        if (this.field1952 != 128 || this.field1953 != 128) {
            var11.method5050(this.field1952, this.field1953, this.field1952);
        }
        return var11;
    }

    @ObfuscatedName("hw.aa(Lhf;B)Lkq;")
    public final class262 method3383(class188 arg0) {
        if (this.field1958 == null) {
            return this.method3382(this.field1929, arg0);
        } else {
            class189 var2 = this.method3385();
            return var2 == null ? null : var2.method3383(arg0);
        }
    }

    @ObfuscatedName("hw.ac([ILhf;I)Lkq;")
    public class262 method3382(int[] arg0, class188 arg1) {
        int[] var3 = arg0;
        if (arg1 != null && arg1.field1912 != null) {
            var3 = arg1.field1912;
        }
        if (var3 == null) {
            return null;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5] != -1 && !Statics.field1978.method6308(var3[var5], 0)) {
                var4 = true;
            }
        }
        if (var4) {
            return null;
        }
        class262[] var6 = new class262[var3.length];
        for (int var7 = 0; var7 < var3.length; var7++) {
            var6[var7] = class262.method4571(Statics.field1978, var3[var7], 0);
        }
        class262 var8;
        if (var6.length == 1) {
            var8 = var6[0];
            if (var8 == null) {
                var8 = new class262(var6, var6.length);
            }
        } else {
            var8 = new class262(var6, var6.length);
        }
        if (this.field1945 != null) {
            short[] var9 = this.field1939;
            if (arg1 != null && arg1.field1913 != null) {
                var9 = arg1.field1913;
            }
            for (int var10 = 0; var10 < this.field1945.length; var10++) {
                var8.method4585(this.field1945[var10], var9[var10]);
            }
        }
        if (this.field1934 != null) {
            short[] var11 = this.field1937;
            if (arg1 != null && arg1.field1916 != null) {
                var11 = arg1.field1916;
            }
            for (int var12 = 0; var12 < this.field1934.length; var12++) {
                var8.method4641(this.field1934[var12], var11[var12]);
            }
        }
        return var8;
    }

    @ObfuscatedName("hw.al(I)Lhw;")
    public final class189 method3385() {
        int var1 = -1;
        if (this.field1921 != -1) {
            var1 = class333.method2521(this.field1921);
        } else if (this.field1960 != -1) {
            var1 = class333.field3554[this.field1960];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1958.length - 1) {
            var2 = this.field1958[var1];
        } else {
            var2 = this.field1958[this.field1958.length - 1];
        }
        return var2 == -1 ? null : method3442(var2);
    }

    @ObfuscatedName("hw.az(B)Z")
    public boolean method3386() {
        if (this.field1958 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field1921 != -1) {
            var1 = class333.method2521(this.field1921);
        } else if (this.field1960 != -1) {
            var1 = class333.field3554[this.field1960];
        }
        if (var1 >= 0 && var1 < this.field1958.length) {
            return this.field1958[var1] != -1;
        } else {
            return this.field1958[this.field1958.length - 1] != -1;
        }
    }

    @ObfuscatedName("hw.ap(III)I")
    public int method3387(int arg0, int arg1) {
        return class182.method2319(this.field1966, arg0, arg1);
    }

    @ObfuscatedName("hw.av(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3378(int arg0, String arg1) {
        class500 var3 = this.field1966;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class482 var5 = (class482) var3.method8134((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4845;
            }
        }
        return var4;
    }

    @ObfuscatedName("dc.ax(B)V")
    public static void method2236() {
        field1923.method5292();
        field1948.method5292();
    }

    @ObfuscatedName("hw.as(I)Z")
    public boolean method3389() {
        return this.field1964 != null && this.field1944 != null;
    }

    @ObfuscatedName("hw.ay(I)[I")
    public int[] method3420() {
        return this.field1964;
    }

    @ObfuscatedName("hw.ak(II)I")
    public int method3391(int arg0) {
        return this.field1964 == null || arg0 >= this.field1964.length ? -1 : this.field1964[arg0];
    }

    @ObfuscatedName("hw.aj(I)[S")
    public short[] method3381() {
        return this.field1944;
    }

    @ObfuscatedName("hw.am(IB)S")
    public short method3393(int arg0) {
        return this.field1944 == null || arg0 >= this.field1944.length ? -1 : this.field1944[arg0];
    }
}

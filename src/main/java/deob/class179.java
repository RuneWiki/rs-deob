package deob;

@ObfuscatedName("fm")
public class class179 extends class406 {

    @ObfuscatedName("fm.l")
    public static class257 field1963 = new class257(64);

    @ObfuscatedName("fm.k")
    public static class257 field1946 = new class257(50);

    @ObfuscatedName("fm.a")
    public int field1974;

    @ObfuscatedName("fm.m")
    public String field1966 = class309.field3681;

    @ObfuscatedName("fm.p")
    public int field1950 = 1;

    @ObfuscatedName("fm.s")
    public int[] field1951;

    @ObfuscatedName("fm.r")
    public int[] field1958;

    @ObfuscatedName("fm.v")
    public int field1953 = -1;

    @ObfuscatedName("fm.y")
    public int field1954 = -1;

    @ObfuscatedName("fm.c")
    public int field1973 = -1;

    @ObfuscatedName("fm.w")
    public int field1945 = -1;

    @ObfuscatedName("fm.b")
    public int field1949 = -1;

    @ObfuscatedName("fm.t")
    public int field1956 = -1;

    @ObfuscatedName("fm.g")
    public int field1955 = -1;

    @ObfuscatedName("fm.x")
    public int field1960 = -1;

    @ObfuscatedName("fm.n")
    public int field1961 = -1;

    @ObfuscatedName("fm.e")
    public int field1962 = -1;

    @ObfuscatedName("fm.h")
    public int field1947 = -1;

    @ObfuscatedName("fm.f")
    public int field1986 = -1;

    @ObfuscatedName("fm.d")
    public int field1965 = -1;

    @ObfuscatedName("fm.j")
    public int field1957 = -1;

    @ObfuscatedName("fm.z")
    public int field1967 = -1;

    @ObfuscatedName("fm.i")
    public short[] field1968;

    @ObfuscatedName("fm.u")
    public short[] field1969;

    @ObfuscatedName("fm.ag")
    public short[] field1952;

    @ObfuscatedName("fm.ar")
    public short[] field1971;

    @ObfuscatedName("fm.am")
    public String[] field1972 = new String[5];

    @ObfuscatedName("fm.ac")
    public boolean field1991 = true;

    @ObfuscatedName("fm.ab")
    public int field1970 = -1;

    @ObfuscatedName("fm.aj")
    public int field1975 = 128;

    @ObfuscatedName("fm.ae")
    public int field1976 = 128;

    @ObfuscatedName("fm.az")
    public boolean field1977 = false;

    @ObfuscatedName("fm.ap")
    public int field1978 = 0;

    @ObfuscatedName("fm.as")
    public int field1979 = 0;

    @ObfuscatedName("fm.au")
    public int field1980 = -1;

    @ObfuscatedName("fm.ak")
    public int field1948 = 32;

    @ObfuscatedName("fm.af")
    public int[] field1982;

    @ObfuscatedName("fm.al")
    public int field1983 = -1;

    @ObfuscatedName("fm.aq")
    public int field1984 = -1;

    @ObfuscatedName("fm.ad")
    public boolean field1985 = true;

    @ObfuscatedName("fm.an")
    public boolean field1964 = true;

    @ObfuscatedName("fm.aw")
    public boolean field1987 = false;

    @ObfuscatedName("fm.ah")
    public class420 field1988;

    @ObfuscatedName("hn.o(II)Lfm;")
    public static class179 method4396(int arg0) {
        class179 var1 = (class179) field1963.method4566((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1981.method5249(9, arg0);
        class179 var3 = new class179();
        var3.field1974 = arg0;
        if (var2 != null) {
            var3.method3125(new class440(var2));
        }
        var3.method3130();
        field1963.method4571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fm.q(B)V")
    public void method3130() {
    }

    @ObfuscatedName("fm.l(Lpx;B)V")
    public void method3125(class440 arg0) {
        while (true) {
            int var2 = arg0.method7071();
            if (var2 == 0) {
                return;
            }
            this.method3118(arg0, var2);
        }
    }

    @ObfuscatedName("fm.k(Lpx;II)V")
    public void method3118(class440 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7071();
            this.field1951 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1951[var4] = arg0.method7082();
            }
        } else if (arg1 == 2) {
            this.field1966 = arg0.method7044();
        } else if (arg1 == 12) {
            this.field1950 = arg0.method7071();
        } else if (arg1 == 13) {
            this.field1953 = arg0.method7082();
        } else if (arg1 == 14) {
            this.field1945 = arg0.method7082();
        } else if (arg1 == 15) {
            this.field1954 = arg0.method7082();
        } else if (arg1 == 16) {
            this.field1973 = arg0.method7082();
        } else if (arg1 == 17) {
            this.field1945 = arg0.method7082();
            this.field1949 = arg0.method7082();
            this.field1956 = arg0.method7082();
            this.field1955 = arg0.method7082();
        } else if (arg1 == 18) {
            arg0.method7082();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1972[arg1 - 30] = arg0.method7044();
            if (this.field1972[arg1 - 30].equalsIgnoreCase(class309.field3689)) {
                this.field1972[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method7071();
            this.field1968 = new short[var5];
            this.field1969 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1968[var6] = (short) arg0.method7082();
                this.field1969[var6] = (short) arg0.method7082();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method7071();
            this.field1952 = new short[var7];
            this.field1971 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1952[var8] = (short) arg0.method7082();
                this.field1971[var8] = (short) arg0.method7082();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method7071();
            this.field1958 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1958[var10] = arg0.method7082();
            }
        } else if (arg1 == 93) {
            this.field1991 = false;
        } else if (arg1 == 95) {
            this.field1970 = arg0.method7082();
        } else if (arg1 == 97) {
            this.field1975 = arg0.method7082();
        } else if (arg1 == 98) {
            this.field1976 = arg0.method7082();
        } else if (arg1 == 99) {
            this.field1977 = true;
        } else if (arg1 == 100) {
            this.field1978 = arg0.method7034();
        } else if (arg1 == 101) {
            this.field1979 = arg0.method7034() * 5;
        } else if (arg1 == 102) {
            this.field1980 = arg0.method7082();
        } else if (arg1 == 103) {
            this.field1948 = arg0.method7082();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field1983 = arg0.method7082();
            if (this.field1983 == 65535) {
                this.field1983 = -1;
            }
            this.field1984 = arg0.method7082();
            if (this.field1984 == 65535) {
                this.field1984 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method7082();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method7071();
            this.field1982 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field1982[var13] = arg0.method7082();
                if (this.field1982[var13] == 65535) {
                    this.field1982[var13] = -1;
                }
            }
            this.field1982[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field1985 = false;
        } else if (arg1 == 109) {
            this.field1964 = false;
        } else if (arg1 == 111) {
            this.field1987 = true;
        } else if (arg1 == 114) {
            this.field1960 = arg0.method7082();
        } else if (arg1 == 115) {
            this.field1960 = arg0.method7082();
            this.field1961 = arg0.method7082();
            this.field1962 = arg0.method7082();
            this.field1947 = arg0.method7082();
        } else if (arg1 == 116) {
            this.field1986 = arg0.method7082();
        } else if (arg1 == 117) {
            this.field1986 = arg0.method7082();
            this.field1965 = arg0.method7082();
            this.field1957 = arg0.method7082();
            this.field1967 = arg0.method7082();
        } else if (arg1 == 249) {
            this.field1988 = class176.method2892(arg0, this.field1988);
        }
    }

    @ObfuscatedName("fm.a(Lgq;ILgq;IB)Lhv;")
    public final class212 method3117(class191 arg0, int arg1, class191 arg2, int arg3) {
        if (this.field1982 != null) {
            class179 var5 = this.method3119();
            return var5 == null ? null : var5.method3117(arg0, arg1, arg2, arg3);
        }
        class212 var6 = (class212) field1946.method4566((long) this.field1974);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1951.length; var8++) {
                if (!Statics.field91.method5237(this.field1951[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class197[] var9 = new class197[this.field1951.length];
            for (int var10 = 0; var10 < this.field1951.length; var10++) {
                var9[var10] = class197.method3507(Statics.field91, this.field1951[var10], 0);
            }
            class197 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class197(var9, var9.length);
            }
            if (this.field1968 != null) {
                for (int var12 = 0; var12 < this.field1968.length; var12++) {
                    var11.method3574(this.field1968[var12], this.field1969[var12]);
                }
            }
            if (this.field1952 != null) {
                for (int var13 = 0; var13 < this.field1952.length; var13++) {
                    var11.method3523(this.field1952[var13], this.field1971[var13]);
                }
            }
            var6 = var11.method3530(this.field1978 + 64, this.field1979 + 850, -30, -50, -30);
            field1946.method4571(var6, (long) this.field1974);
        }
        class212 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3430(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3431(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method3942(true);
        } else {
            var14 = arg2.method3431(var6, arg3);
        }
        if (this.field1975 != 128 || this.field1976 != 128) {
            var14.method3963(this.field1975, this.field1976, this.field1975);
        }
        return var14;
    }

    @ObfuscatedName("fm.m(I)Lgs;")
    public final class197 method3114() {
        if (this.field1982 != null) {
            class179 var1 = this.method3119();
            return var1 == null ? null : var1.method3114();
        } else if (this.field1958 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field1958.length; var3++) {
                if (!Statics.field91.method5237(this.field1958[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class197[] var4 = new class197[this.field1958.length];
            for (int var5 = 0; var5 < this.field1958.length; var5++) {
                var4[var5] = class197.method3507(Statics.field91, this.field1958[var5], 0);
            }
            class197 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class197(var4, var4.length);
            }
            if (this.field1968 != null) {
                for (int var7 = 0; var7 < this.field1968.length; var7++) {
                    var6.method3574(this.field1968[var7], this.field1969[var7]);
                }
            }
            if (this.field1952 != null) {
                for (int var8 = 0; var8 < this.field1952.length; var8++) {
                    var6.method3523(this.field1952[var8], this.field1971[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("fm.p(I)Lfm;")
    public final class179 method3119() {
        int var1 = -1;
        if (this.field1983 != -1) {
            var1 = class289.method241(this.field1983);
        } else if (this.field1984 != -1) {
            var1 = class289.field3348[this.field1984];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1982.length - 1) {
            var2 = this.field1982[var1];
        } else {
            var2 = this.field1982[this.field1982.length - 1];
        }
        return var2 == -1 ? null : method4396(var2);
    }

    @ObfuscatedName("fm.s(S)Z")
    public boolean method3120() {
        if (this.field1982 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field1983 != -1) {
            var1 = class289.method241(this.field1983);
        } else if (this.field1984 != -1) {
            var1 = class289.field3348[this.field1984];
        }
        if (var1 >= 0 && var1 < this.field1982.length) {
            return this.field1982[var1] != -1;
        } else {
            return this.field1982[this.field1982.length - 1] != -1;
        }
    }

    @ObfuscatedName("fm.r(IIS)I")
    public int method3121(int arg0, int arg1) {
        return class176.method2802(this.field1988, arg0, arg1);
    }

    @ObfuscatedName("fm.v(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3122(int arg0, String arg1) {
        return class176.method2266(this.field1988, arg0, arg1);
    }
}

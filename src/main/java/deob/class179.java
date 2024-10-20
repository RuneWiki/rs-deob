package deob;

@ObfuscatedName("fs")
public class class179 extends class407 {

    @ObfuscatedName("fs.f")
    public static class257 field1931 = new class257(64);

    @ObfuscatedName("fs.n")
    public static class257 field1932 = new class257(50);

    @ObfuscatedName("fs.k")
    public int field1933;

    @ObfuscatedName("fs.w")
    public String field1934 = class310.field3924;

    @ObfuscatedName("fs.s")
    public int field1973 = 1;

    @ObfuscatedName("fs.q")
    public int[] field1943;

    @ObfuscatedName("fs.m")
    public int[] field1947;

    @ObfuscatedName("fs.x")
    public int field1938 = -1;

    @ObfuscatedName("fs.j")
    public int field1939 = -1;

    @ObfuscatedName("fs.v")
    public int field1940 = -1;

    @ObfuscatedName("fs.h")
    public int field1941 = -1;

    @ObfuscatedName("fs.t")
    public int field1944 = -1;

    @ObfuscatedName("fs.u")
    public int field1970 = -1;

    @ObfuscatedName("fs.d")
    public int field1929 = -1;

    @ObfuscatedName("fs.b")
    public int field1945 = -1;

    @ObfuscatedName("fs.a")
    public int field1946 = -1;

    @ObfuscatedName("fs.l")
    public int field1957 = -1;

    @ObfuscatedName("fs.e")
    public int field1948 = -1;

    @ObfuscatedName("fs.g")
    public int field1972 = -1;

    @ObfuscatedName("fs.y")
    public int field1950 = -1;

    @ObfuscatedName("fs.i")
    public int field1951 = -1;

    @ObfuscatedName("fs.r")
    public int field1942 = -1;

    @ObfuscatedName("fs.z")
    public short[] field1953;

    @ObfuscatedName("fs.o")
    public short[] field1954;

    @ObfuscatedName("fs.as")
    public short[] field1955;

    @ObfuscatedName("fs.ac")
    public short[] field1935;

    @ObfuscatedName("fs.ao")
    public String[] field1966 = new String[5];

    @ObfuscatedName("fs.ar")
    public boolean field1958 = true;

    @ObfuscatedName("fs.aq")
    public int field1959 = -1;

    @ObfuscatedName("fs.ai")
    public int field1960 = 128;

    @ObfuscatedName("fs.an")
    public int field1961 = 128;

    @ObfuscatedName("fs.aa")
    public boolean field1962 = false;

    @ObfuscatedName("fs.ak")
    public int field1952 = 0;

    @ObfuscatedName("fs.am")
    public int field1964 = 0;

    @ObfuscatedName("fs.ap")
    public int field1965 = -1;

    @ObfuscatedName("fs.ab")
    public int field1963 = 32;

    @ObfuscatedName("fs.az")
    public int[] field1967;

    @ObfuscatedName("fs.ad")
    public int field1936 = -1;

    @ObfuscatedName("fs.af")
    public int field1969 = -1;

    @ObfuscatedName("fs.aj")
    public boolean field1937 = true;

    @ObfuscatedName("fs.ax")
    public boolean field1956 = true;

    @ObfuscatedName("fs.av")
    public boolean field1968 = false;

    @ObfuscatedName("fs.ae")
    public class421 field1971;

    @ObfuscatedName("ga.c(IB)Lfs;")
    public static class179 method3662(int arg0) {
        class179 var1 = (class179) field1931.method4789((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1949.method5499(9, arg0);
        class179 var3 = new class179();
        var3.field1933 = arg0;
        if (var2 != null) {
            var3.method3289(new class445(var2));
        }
        var3.method3271();
        field1931.method4781(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fs.p(I)V")
    public void method3271() {
    }

    @ObfuscatedName("fs.f(Lqq;B)V")
    public void method3289(class445 arg0) {
        while (true) {
            int var2 = arg0.method7196();
            if (var2 == 0) {
                return;
            }
            this.method3273(arg0, var2);
        }
    }

    @ObfuscatedName("fs.n(Lqq;II)V")
    public void method3273(class445 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7196();
            this.field1943 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1943[var4] = arg0.method7198();
            }
        } else if (arg1 == 2) {
            this.field1934 = arg0.method7206();
        } else if (arg1 == 12) {
            this.field1973 = arg0.method7196();
        } else if (arg1 == 13) {
            this.field1938 = arg0.method7198();
        } else if (arg1 == 14) {
            this.field1941 = arg0.method7198();
        } else if (arg1 == 15) {
            this.field1939 = arg0.method7198();
        } else if (arg1 == 16) {
            this.field1940 = arg0.method7198();
        } else if (arg1 == 17) {
            this.field1941 = arg0.method7198();
            this.field1944 = arg0.method7198();
            this.field1970 = arg0.method7198();
            this.field1929 = arg0.method7198();
        } else if (arg1 == 18) {
            arg0.method7198();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1966[arg1 - 30] = arg0.method7206();
            if (this.field1966[arg1 - 30].equalsIgnoreCase(class310.field3658)) {
                this.field1966[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method7196();
            this.field1953 = new short[var5];
            this.field1954 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1953[var6] = (short) arg0.method7198();
                this.field1954[var6] = (short) arg0.method7198();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method7196();
            this.field1955 = new short[var7];
            this.field1935 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1955[var8] = (short) arg0.method7198();
                this.field1935[var8] = (short) arg0.method7198();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method7196();
            this.field1947 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1947[var10] = arg0.method7198();
            }
        } else if (arg1 == 93) {
            this.field1958 = false;
        } else if (arg1 == 95) {
            this.field1959 = arg0.method7198();
        } else if (arg1 == 97) {
            this.field1960 = arg0.method7198();
        } else if (arg1 == 98) {
            this.field1961 = arg0.method7198();
        } else if (arg1 == 99) {
            this.field1962 = true;
        } else if (arg1 == 100) {
            this.field1952 = arg0.method7197();
        } else if (arg1 == 101) {
            this.field1964 = arg0.method7197() * 5;
        } else if (arg1 == 102) {
            this.field1965 = arg0.method7198();
        } else if (arg1 == 103) {
            this.field1963 = arg0.method7198();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field1936 = arg0.method7198();
            if (this.field1936 == 65535) {
                this.field1936 = -1;
            }
            this.field1969 = arg0.method7198();
            if (this.field1969 == 65535) {
                this.field1969 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method7198();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method7196();
            this.field1967 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field1967[var13] = arg0.method7198();
                if (this.field1967[var13] == 65535) {
                    this.field1967[var13] = -1;
                }
            }
            this.field1967[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field1937 = false;
        } else if (arg1 == 109) {
            this.field1956 = false;
        } else if (arg1 == 111) {
            this.field1968 = true;
        } else if (arg1 == 114) {
            this.field1945 = arg0.method7198();
        } else if (arg1 == 115) {
            this.field1945 = arg0.method7198();
            this.field1946 = arg0.method7198();
            this.field1957 = arg0.method7198();
            this.field1948 = arg0.method7198();
        } else if (arg1 == 116) {
            this.field1972 = arg0.method7198();
        } else if (arg1 == 117) {
            this.field1972 = arg0.method7198();
            this.field1950 = arg0.method7198();
            this.field1951 = arg0.method7198();
            this.field1942 = arg0.method7198();
        } else if (arg1 == 249) {
            this.field1971 = class176.method643(arg0, this.field1971);
        }
    }

    @ObfuscatedName("fs.k(Lgd;ILgd;II)Lha;")
    public final class212 method3274(class191 arg0, int arg1, class191 arg2, int arg3) {
        if (this.field1967 != null) {
            class179 var5 = this.method3298();
            return var5 == null ? null : var5.method3274(arg0, arg1, arg2, arg3);
        }
        class212 var6 = (class212) field1932.method4789((long) this.field1933);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1943.length; var8++) {
                if (!Statics.field1930.method5490(this.field1943[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class197[] var9 = new class197[this.field1943.length];
            for (int var10 = 0; var10 < this.field1943.length; var10++) {
                var9[var10] = class197.method3742(Statics.field1930, this.field1943[var10], 0);
            }
            class197 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class197(var9, var9.length);
            }
            if (this.field1953 != null) {
                for (int var12 = 0; var12 < this.field1953.length; var12++) {
                    var11.method3683(this.field1953[var12], this.field1954[var12]);
                }
            }
            if (this.field1955 != null) {
                for (int var13 = 0; var13 < this.field1955.length; var13++) {
                    var11.method3722(this.field1955[var13], this.field1935[var13]);
                }
            }
            var6 = var11.method3690(this.field1952 + 64, this.field1964 + 850, -30, -50, -30);
            field1932.method4781(var6, (long) this.field1933);
        }
        class212 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3575(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3572(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method4135(true);
        } else {
            var14 = arg2.method3572(var6, arg3);
        }
        if (this.field1960 != 128 || this.field1961 != 128) {
            var14.method4153(this.field1960, this.field1961, this.field1960);
        }
        return var14;
    }

    @ObfuscatedName("fs.w(I)Lgu;")
    public final class197 method3277() {
        if (this.field1967 != null) {
            class179 var1 = this.method3298();
            return var1 == null ? null : var1.method3277();
        } else if (this.field1947 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field1947.length; var3++) {
                if (!Statics.field1930.method5490(this.field1947[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class197[] var4 = new class197[this.field1947.length];
            for (int var5 = 0; var5 < this.field1947.length; var5++) {
                var4[var5] = class197.method3742(Statics.field1930, this.field1947[var5], 0);
            }
            class197 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class197(var4, var4.length);
            }
            if (this.field1953 != null) {
                for (int var7 = 0; var7 < this.field1953.length; var7++) {
                    var6.method3683(this.field1953[var7], this.field1954[var7]);
                }
            }
            if (this.field1955 != null) {
                for (int var8 = 0; var8 < this.field1955.length; var8++) {
                    var6.method3722(this.field1955[var8], this.field1935[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("fs.s(I)Lfs;")
    public final class179 method3298() {
        int var1 = -1;
        if (this.field1936 != -1) {
            var1 = class290.method2609(this.field1936);
        } else if (this.field1969 != -1) {
            var1 = class290.field3346[this.field1969];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1967.length - 1) {
            var2 = this.field1967[var1];
        } else {
            var2 = this.field1967[this.field1967.length - 1];
        }
        return var2 == -1 ? null : method3662(var2);
    }

    @ObfuscatedName("fs.q(I)Z")
    public boolean method3276() {
        if (this.field1967 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field1936 != -1) {
            var1 = class290.method2609(this.field1936);
        } else if (this.field1969 != -1) {
            var1 = class290.field3346[this.field1969];
        }
        if (var1 >= 0 && var1 < this.field1967.length) {
            return this.field1967[var1] != -1;
        } else {
            return this.field1967[this.field1967.length - 1] != -1;
        }
    }

    @ObfuscatedName("fs.m(IIB)I")
    public int method3286(int arg0, int arg1) {
        return class176.method3147(this.field1971, arg0, arg1);
    }

    @ObfuscatedName("fs.x(ILjava/lang/String;B)Ljava/lang/String;")
    public String method3278(int arg0, String arg1) {
        class421 var3 = this.field1971;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class408 var5 = (class408) var3.method6917((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4500;
            }
        }
        return var4;
    }
}

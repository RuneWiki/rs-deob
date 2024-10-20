package deob;

@ObfuscatedName("fh")
public class class181 extends class404 {

    @ObfuscatedName("fh.i")
    public static class257 field1940 = new class257(64);

    @ObfuscatedName("fh.f")
    public static class257 field1941 = new class257(30);

    @ObfuscatedName("fh.b")
    public int field1939;

    @ObfuscatedName("fh.n")
    public int field1954;

    @ObfuscatedName("fh.s")
    public int field1944 = -1;

    @ObfuscatedName("fh.l")
    public short[] field1948;

    @ObfuscatedName("fh.q")
    public short[] field1951;

    @ObfuscatedName("fh.o")
    public short[] field1947;

    @ObfuscatedName("fh.r")
    public short[] field1938;

    @ObfuscatedName("fh.p")
    public int field1949 = 128;

    @ObfuscatedName("fh.w")
    public int field1950 = 128;

    @ObfuscatedName("fh.k")
    public int field1942 = 0;

    @ObfuscatedName("fh.d")
    public int field1952 = 0;

    @ObfuscatedName("fh.m")
    public int field1953 = 0;

    @ObfuscatedName("ca.v(II)Lfh;")
    public static class181 method2196(int arg0) {
        class181 var1 = (class181) field1940.method4644((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1943.method5296(13, arg0);
        class181 var3 = new class181();
        var3.field1939 = arg0;
        if (var2 != null) {
            var3.method3204(new class438(var2));
        }
        field1940.method4651(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fh.c(Lpi;I)V")
    public void method3204(class438 arg0) {
        while (true) {
            int var2 = arg0.method6971();
            if (var2 == 0) {
                return;
            }
            this.method3205(arg0, var2);
        }
    }

    @ObfuscatedName("fh.i(Lpi;II)V")
    public void method3205(class438 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1954 = arg0.method7148();
        } else if (arg1 == 2) {
            this.field1944 = arg0.method7148();
        } else if (arg1 == 4) {
            this.field1949 = arg0.method7148();
        } else if (arg1 == 5) {
            this.field1950 = arg0.method7148();
        } else if (arg1 == 6) {
            this.field1942 = arg0.method7148();
        } else if (arg1 == 7) {
            this.field1952 = arg0.method6971();
        } else if (arg1 == 8) {
            this.field1953 = arg0.method6971();
        } else if (arg1 == 40) {
            int var3 = arg0.method6971();
            this.field1948 = new short[var3];
            this.field1951 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1948[var4] = (short) arg0.method7148();
                this.field1951[var4] = (short) arg0.method7148();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method6971();
            this.field1947 = new short[var5];
            this.field1938 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1947[var6] = (short) arg0.method7148();
                this.field1938[var6] = (short) arg0.method7148();
            }
        }
    }

    @ObfuscatedName("fh.f(II)Liq;")
    public final class241 method3206(int arg0) {
        class241 var2 = (class241) field1941.method4644((long) this.field1939);
        if (var2 == null) {
            class226 var3 = class226.method4089(Statics.field1945, this.field1954, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1948 != null) {
                for (int var4 = 0; var4 < this.field1948.length; var4++) {
                    var3.method4046(this.field1948[var4], this.field1951[var4]);
                }
            }
            if (this.field1947 != null) {
                for (int var5 = 0; var5 < this.field1947.length; var5++) {
                    var3.method4047(this.field1947[var5], this.field1938[var5]);
                }
            }
            var2 = var3.method4054(this.field1952 + 64, this.field1953 + 850, -30, -50, -30);
            field1941.method4651(var2, (long) this.field1939);
        }
        class241 var6;
        if (this.field1944 == -1 || arg0 == -1) {
            var6 = var2.method4486(true);
        } else {
            var6 = class191.method3011(this.field1944).method3458(var2, arg0);
        }
        if (this.field1949 != 128 || this.field1950 != 128) {
            var6.method4506(this.field1949, this.field1950, this.field1949);
        }
        if (this.field1942 != 0) {
            if (this.field1942 == 90) {
                var6.method4501();
            }
            if (this.field1942 == 180) {
                var6.method4501();
                var6.method4501();
            }
            if (this.field1942 == 270) {
                var6.method4501();
                var6.method4501();
                var6.method4501();
            }
        }
        return var6;
    }
}

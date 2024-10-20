package deob;

@ObfuscatedName("fu")
public class class171 extends class365 {

    @ObfuscatedName("fu.w")
    public static class236 field1935 = new class236(64);

    @ObfuscatedName("fu.s")
    public int field1936 = 0;

    @ObfuscatedName("fu.a")
    public int field1947 = -1;

    @ObfuscatedName("fu.o")
    public boolean field1938 = true;

    @ObfuscatedName("fu.g")
    public int field1939 = -1;

    @ObfuscatedName("fu.e")
    public int field1940;

    @ObfuscatedName("fu.p")
    public int field1941;

    @ObfuscatedName("fu.j")
    public int field1937;

    @ObfuscatedName("fu.b")
    public int field1934;

    @ObfuscatedName("fu.x")
    public int field1944;

    @ObfuscatedName("fu.y")
    public int field1943;

    @ObfuscatedName("ei.i(IB)Lfu;")
    public static class171 method2677(int arg0) {
        class171 var1 = (class171) field1935.method4205((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1942.method4743(4, arg0);
        class171 var3 = new class171();
        if (var2 != null) {
            var3.method3093(new class401(var2), arg0);
        }
        var3.method3092();
        field1935.method4206(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fu.w(B)V")
    public void method3092() {
        if (this.field1939 != -1) {
            this.method3106(this.field1939);
            this.field1934 = this.field1940;
            this.field1944 = this.field1941;
            this.field1943 = this.field1937;
        }
        this.method3106(this.field1936);
    }

    @ObfuscatedName("fu.s(Lop;II)V")
    public void method3093(class401 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method6240();
            if (var3 == 0) {
                return;
            }
            this.method3094(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("fu.a(Lop;III)V")
    public void method3094(class401 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1936 = arg0.method6432();
        } else if (arg1 == 2) {
            this.field1947 = arg0.method6240();
        } else if (arg1 == 5) {
            this.field1938 = false;
        } else if (arg1 == 7) {
            this.field1939 = arg0.method6432();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("fu.o(IB)V")
    public void method3106(int arg0) {
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        this.field1940 = (int) (var18 * 256.0D);
        this.field1941 = (int) (var14 * 256.0D);
        this.field1937 = (int) (var16 * 256.0D);
        if (this.field1941 < 0) {
            this.field1941 = 0;
        } else if (this.field1941 > 255) {
            this.field1941 = 255;
        }
        if (this.field1937 < 0) {
            this.field1937 = 0;
        } else if (this.field1937 > 255) {
            this.field1937 = 255;
        }
    }
}

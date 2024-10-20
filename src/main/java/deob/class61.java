package deob;

@ObfuscatedName("bv")
public class class61 {

    @ObfuscatedName("bv.b")
    public class183 field1089;

    @ObfuscatedName("bv.e")
    public class183 field1092;

    @ObfuscatedName("bv.c")
    public class126 field1090 = new class126(256);

    @ObfuscatedName("bv.l")
    public class126 field1091 = new class126(256);

    public class61(class183 arg0, class183 arg1) {
        this.field1089 = arg0;
        this.field1092 = arg1;
    }

    @ObfuscatedName("bv.b(II[II)Lbo;")
    public class56 method1118(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1091.method2259(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method969(this.field1089, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method974();
            this.field1091.method2267(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1030.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bv.e(II[II)Lbo;")
    public class56 method1119(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1091.method2259(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class55 var9 = (class55) this.field1090.method2259(var6);
            if (var9 == null) {
                var9 = class55.method988(this.field1092, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1090.method2267(var9, var6);
            }
            class56 var10 = var9.method980(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method2298();
                this.field1091.method2267(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bv.c(I[II)Lbo;")
    public class56 method1135(int arg0, int[] arg1) {
        if (this.field1089.method3137() == 1) {
            return this.method1118(0, arg0, arg1);
        } else if (this.field1089.method3136(arg0) == 1) {
            return this.method1118(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bv.l(I[IB)Lbo;")
    public class56 method1121(int arg0, int[] arg1) {
        if (this.field1092.method3137() == 1) {
            return this.method1119(0, arg0, arg1);
        } else if (this.field1092.method3136(arg0) == 1) {
            return this.method1119(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

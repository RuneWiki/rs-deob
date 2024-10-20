package deob;

@ObfuscatedName("bn")
public class class63 {

    @ObfuscatedName("bn.i")
    public class171 field1270;

    @ObfuscatedName("bn.h")
    public class171 field1269;

    @ObfuscatedName("bn.e")
    public class200 field1273 = new class200(256);

    @ObfuscatedName("bn.g")
    public class200 field1271 = new class200(256);

    public class63(class171 arg0, class171 arg1) {
        this.field1270 = arg0;
        this.field1269 = arg1;
    }

    @ObfuscatedName("bn.i(II[IB)Lbd;")
    public class66 method1261(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class66 var8 = (class66) this.field1271.method3564(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class62 var9 = class62.method1259(this.field1270, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class66 var10 = var9.method1250();
            this.field1271.method3565(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1289.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bn.h(II[II)Lbd;")
    public class66 method1262(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class66 var8 = (class66) this.field1271.method3564(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class74 var9 = (class74) this.field1273.method3564(var6);
            if (var9 == null) {
                var9 = class74.method1485(this.field1269, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1273.method3565(var9, var6);
            }
            class66 var10 = var9.method1506(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3706();
                this.field1271.method3565(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bn.e(I[II)Lbd;")
    public class66 method1263(int arg0, int[] arg1) {
        if (this.field1270.method3094() == 1) {
            return this.method1261(0, arg0, arg1);
        } else if (this.field1270.method3093(arg0) == 1) {
            return this.method1261(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bn.g(I[II)Lbd;")
    public class66 method1260(int arg0, int[] arg1) {
        if (this.field1269.method3094() == 1) {
            return this.method1262(0, arg0, arg1);
        } else if (this.field1269.method3093(arg0) == 1) {
            return this.method1262(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

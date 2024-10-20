package deob;

@ObfuscatedName("bn")
public class class55 {

    @ObfuscatedName("bn.y")
    public class158 field1143;

    @ObfuscatedName("bn.k")
    public class158 field1146;

    @ObfuscatedName("bn.g")
    public class187 field1145 = new class187(256);

    @ObfuscatedName("bn.n")
    public class187 field1144 = new class187(256);

    public class55(class158 arg0, class158 arg1) {
        this.field1143 = arg0;
        this.field1146 = arg1;
    }

    @ObfuscatedName("bn.y(II[II)Lbc;")
    public class58 method1111(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class58 var8 = (class58) this.field1144.method3357(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method1101(this.field1143, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class58 var10 = var9.method1102();
            this.field1144.method3358(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1161.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bn.k(II[II)Lbc;")
    public class58 method1112(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class58 var8 = (class58) this.field1144.method3357(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class66 var9 = (class66) this.field1145.method3357(var6);
            if (var9 == null) {
                var9 = class66.method1325(this.field1146, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1145.method3358(var9, var6);
            }
            class58 var10 = var9.method1326(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3482();
                this.field1144.method3358(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bn.g(I[II)Lbc;")
    public class58 method1115(int arg0, int[] arg1) {
        if (this.field1143.method2884() == 1) {
            return this.method1111(0, arg0, arg1);
        } else if (this.field1143.method2883(arg0) == 1) {
            return this.method1111(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bn.n(I[II)Lbc;")
    public class58 method1113(int arg0, int[] arg1) {
        if (this.field1146.method2884() == 1) {
            return this.method1112(0, arg0, arg1);
        } else if (this.field1146.method2883(arg0) == 1) {
            return this.method1112(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

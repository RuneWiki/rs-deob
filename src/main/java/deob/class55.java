package deob;

@ObfuscatedName("bl")
public class class55 {

    @ObfuscatedName("bl.n")
    public class158 field1172;

    @ObfuscatedName("bl.g")
    public class158 field1171;

    @ObfuscatedName("bl.a")
    public class187 field1176 = new class187(256);

    @ObfuscatedName("bl.m")
    public class187 field1173 = new class187(256);

    public class55(class158 arg0, class158 arg1) {
        this.field1172 = arg0;
        this.field1171 = arg1;
    }

    @ObfuscatedName("bl.n(II[II)Lbr;")
    public class58 method1111(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class58 var8 = (class58) this.field1173.method3425(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method1100(this.field1172, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class58 var10 = var9.method1105();
            this.field1173.method3426(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1186.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bl.g(II[IB)Lbr;")
    public class58 method1119(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class58 var8 = (class58) this.field1173.method3425(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class66 var9 = (class66) this.field1176.method3425(var6);
            if (var9 == null) {
                var9 = class66.method1348(this.field1171, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1176.method3426(var9, var6);
            }
            class58 var10 = var9.method1349(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3554();
                this.field1173.method3426(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bl.a(I[IB)Lbr;")
    public class58 method1115(int arg0, int[] arg1) {
        if (this.field1172.method2973() == 1) {
            return this.method1111(0, arg0, arg1);
        } else if (this.field1172.method2919(arg0) == 1) {
            return this.method1111(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bl.m(I[II)Lbr;")
    public class58 method1114(int arg0, int[] arg1) {
        if (this.field1171.method2973() == 1) {
            return this.method1119(0, arg0, arg1);
        } else if (this.field1171.method2919(arg0) == 1) {
            return this.method1119(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

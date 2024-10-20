package deob;

@ObfuscatedName("bx")
public class class55 {

    @ObfuscatedName("bx.o")
    public class158 field1144;

    @ObfuscatedName("bx.l")
    public class158 field1136;

    @ObfuscatedName("bx.g")
    public class187 field1137 = new class187(256);

    @ObfuscatedName("bx.u")
    public class187 field1140 = new class187(256);

    public class55(class158 arg0, class158 arg1) {
        this.field1144 = arg0;
        this.field1136 = arg1;
    }

    @ObfuscatedName("bx.o(II[II)Lbz;")
    public class58 method1136(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class58 var8 = (class58) this.field1140.method3435(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method1129(this.field1144, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class58 var10 = var9.method1122();
            this.field1140.method3436(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1155.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bx.l(II[IB)Lbz;")
    public class58 method1139(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class58 var8 = (class58) this.field1140.method3435(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class66 var9 = (class66) this.field1137.method3435(var6);
            if (var9 == null) {
                var9 = class66.method1340(this.field1136, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1137.method3436(var9, var6);
            }
            class58 var10 = var9.method1342(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3564();
                this.field1140.method3436(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bx.g(I[II)Lbz;")
    public class58 method1137(int arg0, int[] arg1) {
        if (this.field1144.method2998() == 1) {
            return this.method1136(0, arg0, arg1);
        } else if (this.field1144.method2950(arg0) == 1) {
            return this.method1136(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bx.u(I[IB)Lbz;")
    public class58 method1138(int arg0, int[] arg1) {
        if (this.field1136.method2998() == 1) {
            return this.method1139(0, arg0, arg1);
        } else if (this.field1136.method2950(arg0) == 1) {
            return this.method1139(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

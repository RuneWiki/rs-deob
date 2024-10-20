package deob;

@ObfuscatedName("bw")
public class class55 {

    @ObfuscatedName("bw.n")
    public class158 field1144;

    @ObfuscatedName("bw.w")
    public class158 field1146;

    @ObfuscatedName("bw.i")
    public class187 field1152 = new class187(256);

    @ObfuscatedName("bw.e")
    public class187 field1145 = new class187(256);

    public class55(class158 arg0, class158 arg1) {
        this.field1144 = arg0;
        this.field1146 = arg1;
    }

    @ObfuscatedName("bw.n(II[II)Lbb;")
    public class58 method1092(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class58 var8 = (class58) this.field1145.method3354(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method1084(this.field1144, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class58 var10 = var9.method1080();
            this.field1145.method3346(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1162.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.w(II[II)Lbb;")
    public class58 method1093(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class58 var8 = (class58) this.field1145.method3354(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class66 var9 = (class66) this.field1152.method3354(var6);
            if (var9 == null) {
                var9 = class66.method1307(this.field1146, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1152.method3346(var9, var6);
            }
            class58 var10 = var9.method1309(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3474();
                this.field1145.method3346(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.i(I[IB)Lbb;")
    public class58 method1104(int arg0, int[] arg1) {
        if (this.field1144.method2869() == 1) {
            return this.method1092(0, arg0, arg1);
        } else if (this.field1144.method2898(arg0) == 1) {
            return this.method1092(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bw.e(I[IB)Lbb;")
    public class58 method1095(int arg0, int[] arg1) {
        if (this.field1146.method2869() == 1) {
            return this.method1093(0, arg0, arg1);
        } else if (this.field1146.method2898(arg0) == 1) {
            return this.method1093(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

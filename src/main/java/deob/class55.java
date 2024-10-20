package deob;

@ObfuscatedName("bw")
public class class55 {

    @ObfuscatedName("bw.b")
    public class158 field1152;

    @ObfuscatedName("bw.e")
    public class158 field1145;

    @ObfuscatedName("bw.a")
    public class187 field1150 = new class187(256);

    @ObfuscatedName("bw.k")
    public class187 field1147 = new class187(256);

    public class55(class158 arg0, class158 arg1) {
        this.field1152 = arg0;
        this.field1145 = arg1;
    }

    @ObfuscatedName("bw.b(II[IB)Lbe;")
    public class58 method1085(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class58 var8 = (class58) this.field1147.method3297(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method1062(this.field1152, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class58 var10 = var9.method1055();
            this.field1147.method3288(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1168.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.e(II[IB)Lbe;")
    public class58 method1067(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class58 var8 = (class58) this.field1147.method3297(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class66 var9 = (class66) this.field1150.method3297(var6);
            if (var9 == null) {
                var9 = class66.method1299(this.field1145, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1150.method3288(var9, var6);
            }
            class58 var10 = var9.method1271(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3414();
                this.field1147.method3288(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.a(I[II)Lbe;")
    public class58 method1068(int arg0, int[] arg1) {
        if (this.field1152.method2829() == 1) {
            return this.method1085(0, arg0, arg1);
        } else if (this.field1152.method2828(arg0) == 1) {
            return this.method1085(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bw.k(I[II)Lbe;")
    public class58 method1069(int arg0, int[] arg1) {
        if (this.field1145.method2829() == 1) {
            return this.method1067(0, arg0, arg1);
        } else if (this.field1145.method2828(arg0) == 1) {
            return this.method1067(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

package deob;

@ObfuscatedName("bs")
public class class55 {

    @ObfuscatedName("bs.t")
    public class158 field1129;

    @ObfuscatedName("bs.b")
    public class158 field1132;

    @ObfuscatedName("bs.p")
    public class187 field1130 = new class187(256);

    @ObfuscatedName("bs.e")
    public class187 field1131 = new class187(256);

    public class55(class158 arg0, class158 arg1) {
        this.field1129 = arg0;
        this.field1132 = arg1;
    }

    @ObfuscatedName("bs.t(II[II)Lbl;")
    public class58 method1142(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class58 var8 = (class58) this.field1131.method3382(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method1131(this.field1129, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class58 var10 = var9.method1129();
            this.field1131.method3391(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1144.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bs.b(II[II)Lbl;")
    public class58 method1141(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class58 var8 = (class58) this.field1131.method3382(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class66 var9 = (class66) this.field1130.method3382(var6);
            if (var9 == null) {
                var9 = class66.method1352(this.field1132, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1130.method3391(var9, var6);
            }
            class58 var10 = var9.method1353(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3506();
                this.field1131.method3391(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bs.p(I[II)Lbl;")
    public class58 method1144(int arg0, int[] arg1) {
        if (this.field1129.method2890() == 1) {
            return this.method1142(0, arg0, arg1);
        } else if (this.field1129.method2891(arg0) == 1) {
            return this.method1142(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bs.e(I[II)Lbl;")
    public class58 method1146(int arg0, int[] arg1) {
        if (this.field1132.method2890() == 1) {
            return this.method1141(0, arg0, arg1);
        } else if (this.field1132.method2891(arg0) == 1) {
            return this.method1141(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

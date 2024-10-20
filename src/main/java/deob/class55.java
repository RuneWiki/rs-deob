package deob;

@ObfuscatedName("bb")
public class class55 {

    @ObfuscatedName("bb.q")
    public class158 field1119;

    @ObfuscatedName("bb.s")
    public class158 field1120;

    @ObfuscatedName("bb.h")
    public class186 field1118 = new class186(256);

    @ObfuscatedName("bb.e")
    public class186 field1121 = new class186(256);

    public class55(class158 arg0, class158 arg1) {
        this.field1119 = arg0;
        this.field1120 = arg1;
    }

    @ObfuscatedName("bb.q(II[II)Lbx;")
    public class58 method1054(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class58 var8 = (class58) this.field1121.method3273(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method1050(this.field1119, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class58 var10 = var9.method1043();
            this.field1121.method3274(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1131.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bb.s(II[II)Lbx;")
    public class58 method1055(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class58 var8 = (class58) this.field1121.method3273(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class66 var9 = (class66) this.field1118.method3273(var6);
            if (var9 == null) {
                var9 = class66.method1306(this.field1120, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1118.method3274(var9, var6);
            }
            class58 var10 = var9.method1287(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3404();
                this.field1121.method3274(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bb.h(I[II)Lbx;")
    public class58 method1066(int arg0, int[] arg1) {
        if (this.field1119.method2828() == 1) {
            return this.method1054(0, arg0, arg1);
        } else if (this.field1119.method2808(arg0) == 1) {
            return this.method1054(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bb.e(I[II)Lbx;")
    public class58 method1057(int arg0, int[] arg1) {
        if (this.field1120.method2828() == 1) {
            return this.method1055(0, arg0, arg1);
        } else if (this.field1120.method2808(arg0) == 1) {
            return this.method1055(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

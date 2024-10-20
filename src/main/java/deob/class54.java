package deob;

@ObfuscatedName("by")
public class class54 {

    @ObfuscatedName("by.x")
    public class149 field1125;

    @ObfuscatedName("by.v")
    public class149 field1119;

    @ObfuscatedName("by.m")
    public class177 field1132 = new class177(256);

    @ObfuscatedName("by.e")
    public class177 field1128 = new class177(256);

    public class54(class149 arg0, class149 arg1) {
        this.field1125 = arg0;
        this.field1119 = arg1;
    }

    @ObfuscatedName("by.x(II[II)Lbn;")
    public class57 method1082(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class57 var8 = (class57) this.field1128.method3214(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = class53.method1075(this.field1125, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class57 var10 = var9.method1068();
            this.field1128.method3215(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1145.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("by.v(II[II)Lbn;")
    public class57 method1083(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class57 var8 = (class57) this.field1128.method3214(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class65 var9 = (class65) this.field1132.method3214(var6);
            if (var9 == null) {
                var9 = class65.method1290(this.field1119, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1132.method3215(var9, var6);
            }
            class57 var10 = var9.method1301(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3352();
                this.field1128.method3215(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("by.m(I[IB)Lbn;")
    public class57 method1084(int arg0, int[] arg1) {
        if (this.field1125.method2800() == 1) {
            return this.method1082(0, arg0, arg1);
        } else if (this.field1125.method2741(arg0) == 1) {
            return this.method1082(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("by.e(I[IB)Lbn;")
    public class57 method1081(int arg0, int[] arg1) {
        if (this.field1119.method2800() == 1) {
            return this.method1083(0, arg0, arg1);
        } else if (this.field1119.method2741(arg0) == 1) {
            return this.method1083(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

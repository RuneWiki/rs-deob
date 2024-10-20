package deob;

@ObfuscatedName("be")
public class class58 {

    @ObfuscatedName("be.g")
    public class152 field1198;

    @ObfuscatedName("be.m")
    public class152 field1191;

    @ObfuscatedName("be.v")
    public class175 field1193 = new class175(256);

    @ObfuscatedName("be.r")
    public class175 field1194 = new class175(256);

    public class58(class152 arg0, class152 arg1) {
        this.field1198 = arg0;
        this.field1191 = arg1;
    }

    @ObfuscatedName("be.g(II[II)Lbd;")
    public class63 method1278(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1194.method3293(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1266(this.field1198, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1259();
            this.field1194.method3303(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1227.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("be.m(II[II)Lbd;")
    public class63 method1272(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1194.method3293(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field1193.method3293(var6);
            if (var9 == null) {
                var9 = class53.method1201(this.field1191, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1193.method3303(var9, var6);
            }
            class63 var10 = var9.method1202(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3346();
                this.field1194.method3303(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("be.v(I[II)Lbd;")
    public class63 method1273(int arg0, int[] arg1) {
        if (this.field1198.method2979() == 1) {
            return this.method1278(0, arg0, arg1);
        } else if (this.field1198.method2975(arg0) == 1) {
            return this.method1278(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("be.r(I[IB)Lbd;")
    public class63 method1274(int arg0, int[] arg1) {
        if (this.field1191.method2979() == 1) {
            return this.method1272(0, arg0, arg1);
        } else if (this.field1191.method2975(arg0) == 1) {
            return this.method1272(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

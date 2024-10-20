package deob;

@ObfuscatedName("bi")
public class class63 {

    @ObfuscatedName("bi.f")
    public class171 field1267;

    @ObfuscatedName("bi.e")
    public class171 field1266;

    @ObfuscatedName("bi.n")
    public class200 field1263 = new class200(256);

    @ObfuscatedName("bi.t")
    public class200 field1261 = new class200(256);

    public class63(class171 arg0, class171 arg1) {
        this.field1267 = arg0;
        this.field1266 = arg1;
    }

    @ObfuscatedName("bi.f(II[II)Lbu;")
    public class66 method1283(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class66 var8 = (class66) this.field1261.method3605(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class62 var9 = class62.method1279(this.field1267, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class66 var10 = var9.method1268();
            this.field1261.method3606(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1279.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bi.e(II[II)Lbu;")
    public class66 method1284(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class66 var8 = (class66) this.field1261.method3605(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class74 var9 = (class74) this.field1263.method3605(var6);
            if (var9 == null) {
                var9 = class74.method1507(this.field1266, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1263.method3606(var9, var6);
            }
            class66 var10 = var9.method1512(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3744();
                this.field1261.method3606(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bi.n(I[IB)Lbu;")
    public class66 method1299(int arg0, int[] arg1) {
        if (this.field1267.method3098() == 1) {
            return this.method1283(0, arg0, arg1);
        } else if (this.field1267.method3124(arg0) == 1) {
            return this.method1283(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bi.t(I[II)Lbu;")
    public class66 method1285(int arg0, int[] arg1) {
        if (this.field1266.method3098() == 1) {
            return this.method1284(0, arg0, arg1);
        } else if (this.field1266.method3124(arg0) == 1) {
            return this.method1284(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

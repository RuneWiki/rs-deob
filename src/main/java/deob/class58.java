package deob;

@ObfuscatedName("bi")
public class class58 {

    @ObfuscatedName("bi.t")
    public class152 field1241;

    @ObfuscatedName("bi.l")
    public class152 field1243;

    @ObfuscatedName("bi.c")
    public class175 field1236 = new class175(256);

    @ObfuscatedName("bi.d")
    public class175 field1237 = new class175(256);

    public class58(class152 arg0, class152 arg1) {
        this.field1241 = arg0;
        this.field1243 = arg1;
    }

    @ObfuscatedName("bi.t(II[IB)Lbc;")
    public class63 method1291(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1237.method3301(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1276(this.field1241, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1267();
            this.field1237.method3302(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1271.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bi.l(II[IB)Lbc;")
    public class63 method1283(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1237.method3301(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field1236.method3301(var6);
            if (var9 == null) {
                var9 = class53.method1217(this.field1243, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1236.method3302(var9, var6);
            }
            class63 var10 = var9.method1218(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3361();
                this.field1237.method3302(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bi.c(I[II)Lbc;")
    public class63 method1284(int arg0, int[] arg1) {
        if (this.field1241.method2998() == 1) {
            return this.method1291(0, arg0, arg1);
        } else if (this.field1241.method3048(arg0) == 1) {
            return this.method1291(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bi.d(I[II)Lbc;")
    public class63 method1282(int arg0, int[] arg1) {
        if (this.field1243.method2998() == 1) {
            return this.method1283(0, arg0, arg1);
        } else if (this.field1243.method3048(arg0) == 1) {
            return this.method1283(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

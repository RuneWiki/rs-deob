package deob;

@ObfuscatedName("bi")
public class class60 {

    @ObfuscatedName("bi.w")
    public class168 field1222;

    @ObfuscatedName("bi.x")
    public class168 field1221;

    @ObfuscatedName("bi.t")
    public class197 field1226 = new class197(256);

    @ObfuscatedName("bi.p")
    public class197 field1223 = new class197(256);

    public class60(class168 arg0, class168 arg1) {
        this.field1222 = arg0;
        this.field1221 = arg1;
    }

    @ObfuscatedName("bi.w(II[II)Lbm;")
    public class63 method1231(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1223.method3555(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1216(this.field1222, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1226();
            this.field1223.method3556(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1239.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bi.x(II[II)Lbm;")
    public class63 method1232(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1223.method3555(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1226.method3555(var6);
            if (var9 == null) {
                var9 = class71.method1454(this.field1221, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1226.method3556(var9, var6);
            }
            class63 var10 = var9.method1463(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3684();
                this.field1223.method3556(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bi.t(I[II)Lbm;")
    public class63 method1233(int arg0, int[] arg1) {
        if (this.field1222.method3091() == 1) {
            return this.method1231(0, arg0, arg1);
        } else if (this.field1222.method3122(arg0) == 1) {
            return this.method1231(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bi.p(I[II)Lbm;")
    public class63 method1238(int arg0, int[] arg1) {
        if (this.field1221.method3091() == 1) {
            return this.method1232(0, arg0, arg1);
        } else if (this.field1221.method3122(arg0) == 1) {
            return this.method1232(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

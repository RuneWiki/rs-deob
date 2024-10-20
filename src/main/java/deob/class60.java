package deob;

@ObfuscatedName("bz")
public class class60 {

    @ObfuscatedName("bz.b")
    public class168 field1186;

    @ObfuscatedName("bz.g")
    public class168 field1190;

    @ObfuscatedName("bz.j")
    public class197 field1187 = new class197(256);

    @ObfuscatedName("bz.d")
    public class197 field1188 = new class197(256);

    public class60(class168 arg0, class168 arg1) {
        this.field1186 = arg0;
        this.field1190 = arg1;
    }

    @ObfuscatedName("bz.b(II[IB)Lbh;")
    public class63 method1221(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1188.method3538(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1203(this.field1186, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1209();
            this.field1188.method3528(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1199.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bz.g(II[IB)Lbh;")
    public class63 method1215(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1188.method3538(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1187.method3538(var6);
            if (var9 == null) {
                var9 = class71.method1439(this.field1190, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1187.method3528(var9, var6);
            }
            class63 var10 = var9.method1440(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3647();
                this.field1188.method3528(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bz.j(I[II)Lbh;")
    public class63 method1227(int arg0, int[] arg1) {
        if (this.field1186.method3048() == 1) {
            return this.method1221(0, arg0, arg1);
        } else if (this.field1186.method3047(arg0) == 1) {
            return this.method1221(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bz.d(I[II)Lbh;")
    public class63 method1217(int arg0, int[] arg1) {
        if (this.field1190.method3048() == 1) {
            return this.method1215(0, arg0, arg1);
        } else if (this.field1190.method3047(arg0) == 1) {
            return this.method1215(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

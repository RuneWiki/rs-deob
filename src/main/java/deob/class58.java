package deob;

@ObfuscatedName("bd")
public class class58 {

    @ObfuscatedName("bd.p")
    public class153 field1208;

    @ObfuscatedName("bd.l")
    public class153 field1203;

    @ObfuscatedName("bd.d")
    public class175 field1201 = new class175(256);

    @ObfuscatedName("bd.x")
    public class175 field1205 = new class175(256);

    public class58(class153 arg0, class153 arg1) {
        this.field1208 = arg0;
        this.field1203 = arg1;
    }

    @ObfuscatedName("bd.p(II[II)Lbx;")
    public class63 method1314(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1205.method3405(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1299(this.field1208, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1304();
            this.field1205.method3406(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1235.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bd.l(II[IB)Lbx;")
    public class63 method1327(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1205.method3405(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field1201.method3405(var6);
            if (var9 == null) {
                var9 = class53.method1248(this.field1203, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1201.method3406(var9, var6);
            }
            class63 var10 = var9.method1249(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3455();
                this.field1205.method3406(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bd.d(I[IB)Lbx;")
    public class63 method1315(int arg0, int[] arg1) {
        if (this.field1208.method3099() == 1) {
            return this.method1314(0, arg0, arg1);
        } else if (this.field1208.method3117(arg0) == 1) {
            return this.method1314(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bd.x(I[II)Lbx;")
    public class63 method1326(int arg0, int[] arg1) {
        if (this.field1203.method3099() == 1) {
            return this.method1327(0, arg0, arg1);
        } else if (this.field1203.method3117(arg0) == 1) {
            return this.method1327(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

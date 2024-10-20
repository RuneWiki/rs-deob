package deob;

@ObfuscatedName("by")
public class class60 {

    @ObfuscatedName("by.a")
    public class168 field1223;

    @ObfuscatedName("by.w")
    public class168 field1224;

    @ObfuscatedName("by.d")
    public class197 field1226 = new class197(256);

    @ObfuscatedName("by.c")
    public class197 field1225 = new class197(256);

    public class60(class168 arg0, class168 arg1) {
        this.field1223 = arg0;
        this.field1224 = arg1;
    }

    @ObfuscatedName("by.a(II[II)Lba;")
    public class63 method1305(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1225.method3607(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1301(this.field1223, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1290();
            this.field1225.method3614(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1240.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("by.w(II[IB)Lba;")
    public class63 method1306(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1225.method3607(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1226.method3607(var6);
            if (var9 == null) {
                var9 = class71.method1538(this.field1224, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1226.method3614(var9, var6);
            }
            class63 var10 = var9.method1539(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3737();
                this.field1225.method3614(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("by.d(I[IB)Lba;")
    public class63 method1304(int arg0, int[] arg1) {
        if (this.field1223.method3196() == 1) {
            return this.method1305(0, arg0, arg1);
        } else if (this.field1223.method3157(arg0) == 1) {
            return this.method1305(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("by.c(I[IB)Lba;")
    public class63 method1313(int arg0, int[] arg1) {
        if (this.field1224.method3196() == 1) {
            return this.method1306(0, arg0, arg1);
        } else if (this.field1224.method3157(arg0) == 1) {
            return this.method1306(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

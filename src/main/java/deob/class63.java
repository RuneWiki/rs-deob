package deob;

@ObfuscatedName("by")
public class class63 {

    @ObfuscatedName("by.m")
    public class171 field1292;

    @ObfuscatedName("by.w")
    public class171 field1287;

    @ObfuscatedName("by.e")
    public class200 field1288 = new class200(256);

    @ObfuscatedName("by.o")
    public class200 field1289 = new class200(256);

    public class63(class171 arg0, class171 arg1) {
        this.field1292 = arg0;
        this.field1287 = arg1;
    }

    @ObfuscatedName("by.m(II[II)Lbn;")
    public class66 method1301(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class66 var8 = (class66) this.field1289.method3595(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class62 var9 = class62.method1290(this.field1292, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class66 var10 = var9.method1285();
            this.field1289.method3588(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1306.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("by.w(II[II)Lbn;")
    public class66 method1304(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class66 var8 = (class66) this.field1289.method3595(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class74 var9 = (class74) this.field1288.method3595(var6);
            if (var9 == null) {
                var9 = class74.method1536(this.field1287, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1288.method3588(var9, var6);
            }
            class66 var10 = var9.method1537(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3729();
                this.field1289.method3588(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("by.e(I[IB)Lbn;")
    public class66 method1308(int arg0, int[] arg1) {
        if (this.field1292.method3088() == 1) {
            return this.method1301(0, arg0, arg1);
        } else if (this.field1292.method3099(arg0) == 1) {
            return this.method1301(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("by.o(I[II)Lbn;")
    public class66 method1303(int arg0, int[] arg1) {
        if (this.field1287.method3088() == 1) {
            return this.method1304(0, arg0, arg1);
        } else if (this.field1287.method3099(arg0) == 1) {
            return this.method1304(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

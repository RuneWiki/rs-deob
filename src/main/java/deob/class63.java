package deob;

@ObfuscatedName("bc")
public class class63 {

    @ObfuscatedName("bc.e")
    public class171 field1292;

    @ObfuscatedName("bc.l")
    public class171 field1282;

    @ObfuscatedName("bc.c")
    public class200 field1283 = new class200(256);

    @ObfuscatedName("bc.h")
    public class200 field1290 = new class200(256);

    public class63(class171 arg0, class171 arg1) {
        this.field1292 = arg0;
        this.field1282 = arg1;
    }

    @ObfuscatedName("bc.e(II[IB)Lbf;")
    public class66 method1326(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class66 var8 = (class66) this.field1290.method3619(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class62 var9 = class62.method1324(this.field1292, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class66 var10 = var9.method1310();
            this.field1290.method3620(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1305.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bc.l(II[IB)Lbf;")
    public class66 method1327(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class66 var8 = (class66) this.field1290.method3619(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class74 var9 = (class74) this.field1283.method3619(var6);
            if (var9 == null) {
                var9 = class74.method1544(this.field1282, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1283.method3620(var9, var6);
            }
            class66 var10 = var9.method1545(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3755();
                this.field1290.method3620(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bc.c(I[II)Lbf;")
    public class66 method1328(int arg0, int[] arg1) {
        if (this.field1292.method3206() == 1) {
            return this.method1326(0, arg0, arg1);
        } else if (this.field1292.method3142(arg0) == 1) {
            return this.method1326(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bc.h(I[IB)Lbf;")
    public class66 method1329(int arg0, int[] arg1) {
        if (this.field1282.method3206() == 1) {
            return this.method1327(0, arg0, arg1);
        } else if (this.field1282.method3142(arg0) == 1) {
            return this.method1327(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

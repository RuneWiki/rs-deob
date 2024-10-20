package deob;

@ObfuscatedName("bj")
public class class63 {

    @ObfuscatedName("bj.a")
    public class171 field1292;

    @ObfuscatedName("bj.d")
    public class171 field1287;

    @ObfuscatedName("bj.v")
    public class200 field1288 = new class200(256);

    @ObfuscatedName("bj.r")
    public class200 field1286 = new class200(256);

    public class63(class171 arg0, class171 arg1) {
        this.field1292 = arg0;
        this.field1287 = arg1;
    }

    @ObfuscatedName("bj.a(II[IS)Lbx;")
    public class66 method1293(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class66 var8 = (class66) this.field1286.method3580(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class62 var9 = class62.method1287(this.field1292, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class66 var10 = var9.method1277();
            this.field1286.method3586(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1306.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bj.d(II[II)Lbx;")
    public class66 method1296(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class66 var8 = (class66) this.field1286.method3580(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class74 var9 = (class74) this.field1288.method3580(var6);
            if (var9 == null) {
                var9 = class74.method1503(this.field1287, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1288.method3586(var9, var6);
            }
            class66 var10 = var9.method1504(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3729();
                this.field1286.method3586(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bj.v(I[II)Lbx;")
    public class66 method1292(int arg0, int[] arg1) {
        if (this.field1292.method3128() == 1) {
            return this.method1293(0, arg0, arg1);
        } else if (this.field1292.method3127(arg0) == 1) {
            return this.method1293(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bj.r(I[II)Lbx;")
    public class66 method1290(int arg0, int[] arg1) {
        if (this.field1287.method3128() == 1) {
            return this.method1296(0, arg0, arg1);
        } else if (this.field1287.method3127(arg0) == 1) {
            return this.method1296(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

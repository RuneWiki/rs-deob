package deob;

@ObfuscatedName("bl")
public class class63 {

    @ObfuscatedName("bl.x")
    public class171 field1266;

    @ObfuscatedName("bl.r")
    public class171 field1261;

    @ObfuscatedName("bl.j")
    public class200 field1264 = new class200(256);

    @ObfuscatedName("bl.z")
    public class200 field1263 = new class200(256);

    public class63(class171 arg0, class171 arg1) {
        this.field1266 = arg0;
        this.field1261 = arg1;
    }

    @ObfuscatedName("bl.x(II[II)Lbn;")
    public class66 method1272(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class66 var8 = (class66) this.field1263.method3580(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class62 var9 = class62.method1263(this.field1266, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class66 var10 = var9.method1262();
            this.field1263.method3569(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1276.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bl.r(II[II)Lbn;")
    public class66 method1279(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class66 var8 = (class66) this.field1263.method3580(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class74 var9 = (class74) this.field1264.method3580(var6);
            if (var9 == null) {
                var9 = class74.method1490(this.field1261, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1264.method3569(var9, var6);
            }
            class66 var10 = var9.method1474(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3695();
                this.field1263.method3569(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bl.j(I[II)Lbn;")
    public class66 method1273(int arg0, int[] arg1) {
        if (this.field1266.method3089() == 1) {
            return this.method1272(0, arg0, arg1);
        } else if (this.field1266.method3088(arg0) == 1) {
            return this.method1272(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bl.z(I[II)Lbn;")
    public class66 method1274(int arg0, int[] arg1) {
        if (this.field1261.method3089() == 1) {
            return this.method1279(0, arg0, arg1);
        } else if (this.field1261.method3088(arg0) == 1) {
            return this.method1279(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

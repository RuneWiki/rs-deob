package deob;

@ObfuscatedName("bc")
public class class63 {

    @ObfuscatedName("bc.k")
    public class171 field1280;

    @ObfuscatedName("bc.q")
    public class171 field1281;

    @ObfuscatedName("bc.f")
    public class200 field1276 = new class200(256);

    @ObfuscatedName("bc.c")
    public class200 field1275 = new class200(256);

    public class63(class171 arg0, class171 arg1) {
        this.field1280 = arg0;
        this.field1281 = arg1;
    }

    @ObfuscatedName("bc.k(II[II)Lbe;")
    public class66 method1275(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class66 var8 = (class66) this.field1275.method3580(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class62 var9 = class62.method1258(this.field1280, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class66 var10 = var9.method1250();
            this.field1275.method3574(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1293.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bc.q(II[IB)Lbe;")
    public class66 method1261(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class66 var8 = (class66) this.field1275.method3580(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class74 var9 = (class74) this.field1276.method3580(var6);
            if (var9 == null) {
                var9 = class74.method1498(this.field1281, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1276.method3574(var9, var6);
            }
            class66 var10 = var9.method1499(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3703();
                this.field1275.method3574(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bc.f(I[IB)Lbe;")
    public class66 method1262(int arg0, int[] arg1) {
        if (this.field1280.method3083() == 1) {
            return this.method1275(0, arg0, arg1);
        } else if (this.field1280.method3082(arg0) == 1) {
            return this.method1275(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bc.c(I[IB)Lbe;")
    public class66 method1264(int arg0, int[] arg1) {
        if (this.field1281.method3083() == 1) {
            return this.method1261(0, arg0, arg1);
        } else if (this.field1281.method3082(arg0) == 1) {
            return this.method1261(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

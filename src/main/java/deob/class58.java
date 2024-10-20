package deob;

@ObfuscatedName("bs")
public class class58 {

    @ObfuscatedName("bs.i")
    public class152 field1212;

    @ObfuscatedName("bs.v")
    public class152 field1205;

    @ObfuscatedName("bs.m")
    public class175 field1206 = new class175(256);

    @ObfuscatedName("bs.j")
    public class175 field1207 = new class175(256);

    public class58(class152 arg0, class152 arg1) {
        this.field1212 = arg0;
        this.field1205 = arg1;
    }

    @ObfuscatedName("bs.i(II[II)Lbd;")
    public class63 method1290(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1207.method3348(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1278(this.field1212, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1279();
            this.field1207.method3349(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1241.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bs.v(II[IB)Lbd;")
    public class63 method1301(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1207.method3348(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field1206.method3348(var6);
            if (var9 == null) {
                var9 = class53.method1238(this.field1205, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1206.method3349(var9, var6);
            }
            class63 var10 = var9.method1225(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3409();
                this.field1207.method3349(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bs.m(I[II)Lbd;")
    public class63 method1292(int arg0, int[] arg1) {
        if (this.field1212.method3043() == 1) {
            return this.method1290(0, arg0, arg1);
        } else if (this.field1212.method3088(arg0) == 1) {
            return this.method1290(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bs.j(I[IS)Lbd;")
    public class63 method1307(int arg0, int[] arg1) {
        if (this.field1205.method3043() == 1) {
            return this.method1301(0, arg0, arg1);
        } else if (this.field1205.method3088(arg0) == 1) {
            return this.method1301(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

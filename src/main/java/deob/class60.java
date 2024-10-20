package deob;

@ObfuscatedName("bm")
public class class60 {

    @ObfuscatedName("bm.v")
    public class167 field1216;

    @ObfuscatedName("bm.f")
    public class167 field1217;

    @ObfuscatedName("bm.i")
    public class196 field1212 = new class196(256);

    @ObfuscatedName("bm.d")
    public class196 field1213 = new class196(256);

    public class60(class167 arg0, class167 arg1) {
        this.field1216 = arg0;
        this.field1217 = arg1;
    }

    @ObfuscatedName("bm.v(II[IB)Lbu;")
    public class63 method1226(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1213.method3524(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1211(this.field1216, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1208();
            this.field1213.method3526(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1229.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.f(II[II)Lbu;")
    public class63 method1218(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1213.method3524(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1212.method3524(var6);
            if (var9 == null) {
                var9 = class71.method1440(this.field1217, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1212.method3526(var9, var6);
            }
            class63 var10 = var9.method1441(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3645();
                this.field1213.method3526(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.i(I[IB)Lbu;")
    public class63 method1219(int arg0, int[] arg1) {
        if (this.field1216.method3036() == 1) {
            return this.method1226(0, arg0, arg1);
        } else if (this.field1216.method3093(arg0) == 1) {
            return this.method1226(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bm.d(I[II)Lbu;")
    public class63 method1221(int arg0, int[] arg1) {
        if (this.field1217.method3036() == 1) {
            return this.method1218(0, arg0, arg1);
        } else if (this.field1217.method3093(arg0) == 1) {
            return this.method1218(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

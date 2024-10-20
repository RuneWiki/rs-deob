package deob;

@ObfuscatedName("bf")
public class class60 {

    @ObfuscatedName("bf.n")
    public class167 field1208;

    @ObfuscatedName("bf.d")
    public class167 field1201;

    @ObfuscatedName("bf.s")
    public class196 field1202 = new class196(256);

    @ObfuscatedName("bf.q")
    public class196 field1200 = new class196(256);

    public class60(class167 arg0, class167 arg1) {
        this.field1208 = arg0;
        this.field1201 = arg1;
    }

    @ObfuscatedName("bf.n(II[IB)Lbe;")
    public class63 method1192(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1200.method3519(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1178(this.field1208, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1180();
            this.field1200.method3526(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1217.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bf.d(II[II)Lbe;")
    public class63 method1190(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1200.method3519(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1202.method3519(var6);
            if (var9 == null) {
                var9 = class71.method1408(this.field1201, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1202.method3526(var9, var6);
            }
            class63 var10 = var9.method1402(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3651();
                this.field1200.method3526(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bf.s(I[II)Lbe;")
    public class63 method1191(int arg0, int[] arg1) {
        if (this.field1208.method3045() == 1) {
            return this.method1192(0, arg0, arg1);
        } else if (this.field1208.method3020(arg0) == 1) {
            return this.method1192(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bf.q(I[II)Lbe;")
    public class63 method1193(int arg0, int[] arg1) {
        if (this.field1201.method3045() == 1) {
            return this.method1190(0, arg0, arg1);
        } else if (this.field1201.method3020(arg0) == 1) {
            return this.method1190(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

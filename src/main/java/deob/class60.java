package deob;

@ObfuscatedName("by")
public class class60 {

    @ObfuscatedName("by.f")
    public class168 field1231;

    @ObfuscatedName("by.u")
    public class168 field1227;

    @ObfuscatedName("by.x")
    public class197 field1232 = new class197(256);

    @ObfuscatedName("by.b")
    public class197 field1228 = new class197(256);

    public class60(class168 arg0, class168 arg1) {
        this.field1231 = arg0;
        this.field1227 = arg1;
    }

    @ObfuscatedName("by.f(II[II)Lbe;")
    public class63 method1266(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1228.method3555(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1263(this.field1231, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1257();
            this.field1228.method3559(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1248.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("by.u(II[II)Lbe;")
    public class63 method1269(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1228.method3555(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1232.method3555(var6);
            if (var9 == null) {
                var9 = class71.method1480(this.field1227, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1232.method3559(var9, var6);
            }
            class63 var10 = var9.method1496(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3679();
                this.field1228.method3559(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("by.x(I[II)Lbe;")
    public class63 method1268(int arg0, int[] arg1) {
        if (this.field1231.method3067() == 1) {
            return this.method1266(0, arg0, arg1);
        } else if (this.field1231.method3096(arg0) == 1) {
            return this.method1266(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("by.b(I[II)Lbe;")
    public class63 method1270(int arg0, int[] arg1) {
        if (this.field1227.method3067() == 1) {
            return this.method1269(0, arg0, arg1);
        } else if (this.field1227.method3096(arg0) == 1) {
            return this.method1269(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

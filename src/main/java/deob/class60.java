package deob;

@ObfuscatedName("bi")
public class class60 {

    @ObfuscatedName("bi.y")
    public class167 field1216;

    @ObfuscatedName("bi.d")
    public class167 field1213;

    @ObfuscatedName("bi.g")
    public class196 field1220 = new class196(256);

    @ObfuscatedName("bi.w")
    public class196 field1214 = new class196(256);

    public class60(class167 arg0, class167 arg1) {
        this.field1216 = arg0;
        this.field1213 = arg1;
    }

    @ObfuscatedName("bi.y(II[II)Lbe;")
    public class63 method1230(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1214.method3459(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1203(this.field1216, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1204();
            this.field1214.method3460(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1235.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bi.d(II[II)Lbe;")
    public class63 method1218(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1214.method3459(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1220.method3459(var6);
            if (var9 == null) {
                var9 = class71.method1465(this.field1213, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1220.method3460(var9, var6);
            }
            class63 var10 = var9.method1462(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3588();
                this.field1214.method3460(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bi.g(I[IB)Lbe;")
    public class63 method1219(int arg0, int[] arg1) {
        if (this.field1216.method3007() == 1) {
            return this.method1230(0, arg0, arg1);
        } else if (this.field1216.method3050(arg0) == 1) {
            return this.method1230(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bi.w(I[II)Lbe;")
    public class63 method1229(int arg0, int[] arg1) {
        if (this.field1213.method3007() == 1) {
            return this.method1218(0, arg0, arg1);
        } else if (this.field1213.method3050(arg0) == 1) {
            return this.method1218(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

package deob;

@ObfuscatedName("bb")
public class class60 {

    @ObfuscatedName("bb.t")
    public class168 field1226;

    @ObfuscatedName("bb.i")
    public class168 field1225;

    @ObfuscatedName("bb.g")
    public class197 field1223 = new class197(256);

    @ObfuscatedName("bb.h")
    public class197 field1221 = new class197(256);

    public class60(class168 arg0, class168 arg1) {
        this.field1226 = arg0;
        this.field1225 = arg1;
    }

    @ObfuscatedName("bb.t(II[IS)Lbl;")
    public class63 method1177(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1221.method3485(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1156(this.field1226, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1157();
            this.field1221.method3486(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1236.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bb.i(II[IB)Lbl;")
    public class63 method1168(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1221.method3485(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1223.method3485(var6);
            if (var9 == null) {
                var9 = class71.method1385(this.field1225, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1223.method3486(var9, var6);
            }
            class63 var10 = var9.method1379(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3607();
                this.field1221.method3486(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bb.g(I[II)Lbl;")
    public class63 method1169(int arg0, int[] arg1) {
        if (this.field1226.method3013() == 1) {
            return this.method1177(0, arg0, arg1);
        } else if (this.field1226.method3012(arg0) == 1) {
            return this.method1177(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bb.h(I[IB)Lbl;")
    public class63 method1170(int arg0, int[] arg1) {
        if (this.field1225.method3013() == 1) {
            return this.method1168(0, arg0, arg1);
        } else if (this.field1225.method3012(arg0) == 1) {
            return this.method1168(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

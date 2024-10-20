package deob;

@ObfuscatedName("bh")
public class class58 {

    @ObfuscatedName("bh.b")
    public class153 field1197;

    @ObfuscatedName("bh.e")
    public class153 field1195;

    @ObfuscatedName("bh.g")
    public class175 field1191 = new class175(256);

    @ObfuscatedName("bh.o")
    public class175 field1192 = new class175(256);

    public class58(class153 arg0, class153 arg1) {
        this.field1197 = arg0;
        this.field1195 = arg1;
    }

    @ObfuscatedName("bh.b(II[II)Lbv;")
    public class63 method1257(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1192.method3291(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1241(this.field1197, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1240();
            this.field1192.method3292(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1226.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bh.e(II[II)Lbv;")
    public class63 method1266(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1192.method3291(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field1191.method3291(var6);
            if (var9 == null) {
                var9 = class53.method1178(this.field1195, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1191.method3292(var9, var6);
            }
            class63 var10 = var9.method1179(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3341();
                this.field1192.method3292(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bh.g(I[II)Lbv;")
    public class63 method1259(int arg0, int[] arg1) {
        if (this.field1197.method2996() == 1) {
            return this.method1257(0, arg0, arg1);
        } else if (this.field1197.method3006(arg0) == 1) {
            return this.method1257(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bh.o(I[IB)Lbv;")
    public class63 method1260(int arg0, int[] arg1) {
        if (this.field1195.method2996() == 1) {
            return this.method1266(0, arg0, arg1);
        } else if (this.field1195.method3006(arg0) == 1) {
            return this.method1266(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

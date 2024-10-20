package deob;

@ObfuscatedName("bd")
public class class58 {

    @ObfuscatedName("bd.x")
    public class152 field1179;

    @ObfuscatedName("bd.p")
    public class152 field1176;

    @ObfuscatedName("bd.k")
    public class175 field1177 = new class175(256);

    @ObfuscatedName("bd.a")
    public class175 field1178 = new class175(256);

    public class58(class152 arg0, class152 arg1) {
        this.field1179 = arg0;
        this.field1176 = arg1;
    }

    @ObfuscatedName("bd.x(II[II)Lbj;")
    public class63 method1237(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1178.method3259(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1228(this.field1179, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1221();
            this.field1178.method3253(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1207.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bd.p(II[II)Lbj;")
    public class63 method1250(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1178.method3259(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field1177.method3259(var6);
            if (var9 == null) {
                var9 = class53.method1158(this.field1176, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1177.method3253(var9, var6);
            }
            class63 var10 = var9.method1174(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3301();
                this.field1178.method3253(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bd.k(I[IB)Lbj;")
    public class63 method1239(int arg0, int[] arg1) {
        if (this.field1179.method2930() == 1) {
            return this.method1237(0, arg0, arg1);
        } else if (this.field1179.method2929(arg0) == 1) {
            return this.method1237(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bd.a(I[IB)Lbj;")
    public class63 method1236(int arg0, int[] arg1) {
        if (this.field1176.method2930() == 1) {
            return this.method1250(0, arg0, arg1);
        } else if (this.field1176.method2929(arg0) == 1) {
            return this.method1250(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

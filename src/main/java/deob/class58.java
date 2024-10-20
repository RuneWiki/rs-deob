package deob;

@ObfuscatedName("bi")
public class class58 {

    @ObfuscatedName("bi.d")
    public class152 field1202;

    @ObfuscatedName("bi.g")
    public class152 field1198;

    @ObfuscatedName("bi.a")
    public class175 field1199 = new class175(256);

    @ObfuscatedName("bi.t")
    public class175 field1203 = new class175(256);

    public class58(class152 arg0, class152 arg1) {
        this.field1202 = arg0;
        this.field1198 = arg1;
    }

    @ObfuscatedName("bi.d(II[IB)Lbl;")
    public class63 method1238(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1203.method3255(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1221(this.field1202, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1223();
            this.field1203.method3268(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1232.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bi.g(II[II)Lbl;")
    public class63 method1237(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1203.method3255(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field1199.method3255(var6);
            if (var9 == null) {
                var9 = class53.method1194(this.field1198, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1199.method3268(var9, var6);
            }
            class63 var10 = var9.method1171(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3306();
                this.field1203.method3268(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bi.a(I[IS)Lbl;")
    public class63 method1240(int arg0, int[] arg1) {
        if (this.field1202.method2987() == 1) {
            return this.method1238(0, arg0, arg1);
        } else if (this.field1202.method2943(arg0) == 1) {
            return this.method1238(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bi.t(I[II)Lbl;")
    public class63 method1241(int arg0, int[] arg1) {
        if (this.field1198.method2987() == 1) {
            return this.method1237(0, arg0, arg1);
        } else if (this.field1198.method2943(arg0) == 1) {
            return this.method1237(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

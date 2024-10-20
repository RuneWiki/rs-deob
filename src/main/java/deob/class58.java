package deob;

@ObfuscatedName("be")
public class class58 {

    @ObfuscatedName("be.a")
    public class152 field1187;

    @ObfuscatedName("be.r")
    public class152 field1190;

    @ObfuscatedName("be.u")
    public class175 field1186 = new class175(256);

    @ObfuscatedName("be.t")
    public class175 field1184 = new class175(256);

    public class58(class152 arg0, class152 arg1) {
        this.field1187 = arg0;
        this.field1190 = arg1;
    }

    @ObfuscatedName("be.a(II[IB)Lbq;")
    public class63 method1203(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1184.method3252(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1190(this.field1187, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1189();
            this.field1184.method3254(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1219.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("be.r(II[II)Lbq;")
    public class63 method1204(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1184.method3252(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field1186.method3252(var6);
            if (var9 == null) {
                var9 = class53.method1127(this.field1190, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1186.method3254(var9, var6);
            }
            class63 var10 = var9.method1128(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3311();
                this.field1184.method3254(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("be.u(I[II)Lbq;")
    public class63 method1209(int arg0, int[] arg1) {
        if (this.field1187.method2954() == 1) {
            return this.method1203(0, arg0, arg1);
        } else if (this.field1187.method2962(arg0) == 1) {
            return this.method1203(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("be.t(I[II)Lbq;")
    public class63 method1210(int arg0, int[] arg1) {
        if (this.field1190.method2954() == 1) {
            return this.method1204(0, arg0, arg1);
        } else if (this.field1190.method2962(arg0) == 1) {
            return this.method1204(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

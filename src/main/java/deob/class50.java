package deob;

@ObfuscatedName("ay")
public class class50 {

    @ObfuscatedName("ay.z")
    public class142 field1087;

    @ObfuscatedName("ay.n")
    public class142 field1092;

    @ObfuscatedName("ay.u")
    public class169 field1085 = new class169(256);

    @ObfuscatedName("ay.t")
    public class169 field1083 = new class169(256);

    public class50(class142 arg0, class142 arg1) {
        this.field1087 = arg0;
        this.field1092 = arg1;
    }

    @ObfuscatedName("ay.z(II[II)Lbp;")
    public class53 method1051(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class53 var8 = (class53) this.field1083.method3208(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class49 var9 = class49.method1040(this.field1087, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class53 var10 = var9.method1036();
            this.field1083.method3210(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1101.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ay.n(II[II)Lbp;")
    public class53 method1052(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class53 var8 = (class53) this.field1083.method3208(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class61 var9 = (class61) this.field1085.method3208(var6);
            if (var9 == null) {
                var9 = class61.method1266(this.field1092, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1085.method3210(var9, var6);
            }
            class53 var10 = var9.method1267(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3288();
                this.field1083.method3210(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ay.u(I[II)Lbp;")
    public class53 method1063(int arg0, int[] arg1) {
        if (this.field1087.method2756() == 1) {
            return this.method1051(0, arg0, arg1);
        } else if (this.field1087.method2755(arg0) == 1) {
            return this.method1051(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ay.t(I[II)Lbp;")
    public class53 method1053(int arg0, int[] arg1) {
        if (this.field1092.method2756() == 1) {
            return this.method1052(0, arg0, arg1);
        } else if (this.field1092.method2755(arg0) == 1) {
            return this.method1052(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

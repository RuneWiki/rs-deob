package deob;

@ObfuscatedName("at")
public class class50 {

    @ObfuscatedName("at.m")
    public class142 field1083;

    @ObfuscatedName("at.k")
    public class142 field1084;

    @ObfuscatedName("at.y")
    public class169 field1090 = new class169(256);

    @ObfuscatedName("at.g")
    public class169 field1086 = new class169(256);

    public class50(class142 arg0, class142 arg1) {
        this.field1083 = arg0;
        this.field1084 = arg1;
    }

    @ObfuscatedName("at.m(II[II)Lbw;")
    public class53 method1052(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class53 var8 = (class53) this.field1086.method3159(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class49 var9 = class49.method1027(this.field1083, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class53 var10 = var9.method1021();
            this.field1086.method3165(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1102.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("at.k(II[II)Lbw;")
    public class53 method1036(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class53 var8 = (class53) this.field1086.method3159(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class61 var9 = (class61) this.field1090.method3159(var6);
            if (var9 == null) {
                var9 = class61.method1261(this.field1084, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1090.method3165(var9, var6);
            }
            class53 var10 = var9.method1248(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3223();
                this.field1086.method3165(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("at.y(I[IB)Lbw;")
    public class53 method1037(int arg0, int[] arg1) {
        if (this.field1083.method2736() == 1) {
            return this.method1052(0, arg0, arg1);
        } else if (this.field1083.method2705(arg0) == 1) {
            return this.method1052(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("at.g(I[II)Lbw;")
    public class53 method1044(int arg0, int[] arg1) {
        if (this.field1084.method2736() == 1) {
            return this.method1036(0, arg0, arg1);
        } else if (this.field1084.method2705(arg0) == 1) {
            return this.method1036(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

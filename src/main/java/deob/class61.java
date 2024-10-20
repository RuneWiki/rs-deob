package deob;

@ObfuscatedName("bc")
public class class61 {

    @ObfuscatedName("bc.q")
    public class183 field1099;

    @ObfuscatedName("bc.d")
    public class183 field1100;

    @ObfuscatedName("bc.h")
    public class126 field1101 = new class126(256);

    @ObfuscatedName("bc.p")
    public class126 field1102 = new class126(256);

    public class61(class183 arg0, class183 arg1) {
        this.field1099 = arg0;
        this.field1100 = arg1;
    }

    @ObfuscatedName("bc.q(II[II)Lbj;")
    public class56 method1158(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1102.method2260(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method1022(this.field1099, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1023();
            this.field1102.method2261(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1045.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bc.d(II[IS)Lbj;")
    public class56 method1160(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1102.method2260(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class55 var9 = (class55) this.field1101.method2260(var6);
            if (var9 == null) {
                var9 = class55.method1039(this.field1100, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1101.method2261(var9, var6);
            }
            class56 var10 = var9.method1040(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method2310();
                this.field1102.method2261(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bc.h(I[II)Lbj;")
    public class56 method1159(int arg0, int[] arg1) {
        if (this.field1099.method3127() == 1) {
            return this.method1158(0, arg0, arg1);
        } else if (this.field1099.method3126(arg0) == 1) {
            return this.method1158(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bc.p(I[II)Lbj;")
    public class56 method1164(int arg0, int[] arg1) {
        if (this.field1100.method3127() == 1) {
            return this.method1160(0, arg0, arg1);
        } else if (this.field1100.method3126(arg0) == 1) {
            return this.method1160(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

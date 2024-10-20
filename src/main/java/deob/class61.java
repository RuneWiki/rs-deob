package deob;

@ObfuscatedName("bn")
public class class61 {

    @ObfuscatedName("bn.u")
    public class183 field1073;

    @ObfuscatedName("bn.x")
    public class183 field1074;

    @ObfuscatedName("bn.i")
    public class126 field1077 = new class126(256);

    @ObfuscatedName("bn.a")
    public class126 field1076 = new class126(256);

    public class61(class183 arg0, class183 arg1) {
        this.field1073 = arg0;
        this.field1074 = arg1;
    }

    @ObfuscatedName("bn.u(II[II)Lbe;")
    public class56 method1053(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1076.method2190(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method940(this.field1073, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method938();
            this.field1076.method2191(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1016.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bn.x(II[II)Lbe;")
    public class56 method1061(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1076.method2190(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class55 var9 = (class55) this.field1077.method2190(var6);
            if (var9 == null) {
                var9 = class55.method945(this.field1074, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1077.method2191(var9, var6);
            }
            class56 var10 = var9.method954(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method2228();
                this.field1076.method2191(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bn.i(I[II)Lbe;")
    public class56 method1055(int arg0, int[] arg1) {
        if (this.field1073.method3090() == 1) {
            return this.method1053(0, arg0, arg1);
        } else if (this.field1073.method3122(arg0) == 1) {
            return this.method1053(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bn.a(I[IB)Lbe;")
    public class56 method1056(int arg0, int[] arg1) {
        if (this.field1074.method3090() == 1) {
            return this.method1061(0, arg0, arg1);
        } else if (this.field1074.method3122(arg0) == 1) {
            return this.method1061(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

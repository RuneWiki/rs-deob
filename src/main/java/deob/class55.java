package deob;

@ObfuscatedName("bn")
public class class55 {

    @ObfuscatedName("bn.p")
    public class158 field1157;

    @ObfuscatedName("bn.k")
    public class158 field1158;

    @ObfuscatedName("bn.e")
    public class187 field1159 = new class187(256);

    @ObfuscatedName("bn.f")
    public class187 field1161 = new class187(256);

    public class55(class158 arg0, class158 arg1) {
        this.field1157 = arg0;
        this.field1158 = arg1;
    }

    @ObfuscatedName("bn.p(II[II)Lbp;")
    public class58 method1092(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class58 var8 = (class58) this.field1161.method3405(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method1082(this.field1157, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class58 var10 = var9.method1075();
            this.field1161.method3406(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1171.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bn.k(II[IB)Lbp;")
    public class58 method1084(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class58 var8 = (class58) this.field1161.method3405(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class66 var9 = (class66) this.field1159.method3405(var6);
            if (var9 == null) {
                var9 = class66.method1307(this.field1158, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1159.method3406(var9, var6);
            }
            class58 var10 = var9.method1302(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3533();
                this.field1161.method3406(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bn.e(I[IB)Lbp;")
    public class58 method1086(int arg0, int[] arg1) {
        if (this.field1157.method2907() == 1) {
            return this.method1092(0, arg0, arg1);
        } else if (this.field1157.method2904(arg0) == 1) {
            return this.method1092(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bn.f(I[II)Lbp;")
    public class58 method1087(int arg0, int[] arg1) {
        if (this.field1158.method2907() == 1) {
            return this.method1084(0, arg0, arg1);
        } else if (this.field1158.method2904(arg0) == 1) {
            return this.method1084(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

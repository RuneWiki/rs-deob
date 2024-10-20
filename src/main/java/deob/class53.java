package deob;

@ObfuscatedName("bv")
public class class53 {

    @ObfuscatedName("bv.e")
    public class145 field1109;

    @ObfuscatedName("bv.p")
    public class145 field1105;

    @ObfuscatedName("bv.a")
    public class173 field1104 = new class173(256);

    @ObfuscatedName("bv.g")
    public class173 field1106 = new class173(256);

    public class53(class145 arg0, class145 arg1) {
        this.field1109 = arg0;
        this.field1105 = arg1;
    }

    @ObfuscatedName("bv.e(II[IB)Lbo;")
    public class56 method1074(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1106.method3192(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = class52.method1072(this.field1109, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1065();
            this.field1106.method3191(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1123.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bv.p(II[IB)Lbo;")
    public class56 method1075(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1106.method3192(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class64 var9 = (class64) this.field1104.method3192(var6);
            if (var9 == null) {
                var9 = class64.method1290(this.field1105, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1104.method3191(var9, var6);
            }
            class56 var10 = var9.method1289(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3307();
                this.field1106.method3191(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bv.a(I[IB)Lbo;")
    public class56 method1076(int arg0, int[] arg1) {
        if (this.field1109.method2727() == 1) {
            return this.method1074(0, arg0, arg1);
        } else if (this.field1109.method2726(arg0) == 1) {
            return this.method1074(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bv.g(I[IB)Lbo;")
    public class56 method1077(int arg0, int[] arg1) {
        if (this.field1105.method2727() == 1) {
            return this.method1075(0, arg0, arg1);
        } else if (this.field1105.method2726(arg0) == 1) {
            return this.method1075(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

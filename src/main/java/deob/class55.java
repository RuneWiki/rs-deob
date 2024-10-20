package deob;

@ObfuscatedName("bb")
public class class55 {

    @ObfuscatedName("bb.n")
    public class158 field1164;

    @ObfuscatedName("bb.o")
    public class158 field1169;

    @ObfuscatedName("bb.a")
    public class187 field1165 = new class187(256);

    @ObfuscatedName("bb.w")
    public class187 field1166 = new class187(256);

    public class55(class158 arg0, class158 arg1) {
        this.field1164 = arg0;
        this.field1169 = arg1;
    }

    @ObfuscatedName("bb.n(II[II)Lbu;")
    public class58 method1133(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class58 var8 = (class58) this.field1166.method3418(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method1125(this.field1164, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class58 var10 = var9.method1123();
            this.field1166.method3410(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1181.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bb.o(II[IB)Lbu;")
    public class58 method1134(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class58 var8 = (class58) this.field1166.method3418(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class66 var9 = (class66) this.field1165.method3418(var6);
            if (var9 == null) {
                var9 = class66.method1367(this.field1169, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1165.method3410(var9, var6);
            }
            class58 var10 = var9.method1374(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3540();
                this.field1166.method3410(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bb.a(I[IB)Lbu;")
    public class58 method1135(int arg0, int[] arg1) {
        if (this.field1164.method2934() == 1) {
            return this.method1133(0, arg0, arg1);
        } else if (this.field1164.method2945(arg0) == 1) {
            return this.method1133(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bb.w(I[IB)Lbu;")
    public class58 method1144(int arg0, int[] arg1) {
        if (this.field1169.method2934() == 1) {
            return this.method1134(0, arg0, arg1);
        } else if (this.field1169.method2945(arg0) == 1) {
            return this.method1134(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

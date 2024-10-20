package deob;

@ObfuscatedName("by")
public class class53 {

    @ObfuscatedName("by.g")
    public class147 field1118;

    @ObfuscatedName("by.i")
    public class147 field1114;

    @ObfuscatedName("by.k")
    public class175 field1112 = new class175(256);

    @ObfuscatedName("by.e")
    public class175 field1115 = new class175(256);

    public class53(class147 arg0, class147 arg1) {
        this.field1118 = arg0;
        this.field1114 = arg1;
    }

    @ObfuscatedName("by.g(II[IB)Lbq;")
    public class56 method1041(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1115.method3174(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = class52.method1034(this.field1118, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1028();
            this.field1115.method3177(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1131.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("by.i(II[IB)Lbq;")
    public class56 method1042(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1115.method3174(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class64 var9 = (class64) this.field1112.method3174(var6);
            if (var9 == null) {
                var9 = class64.method1247(this.field1114, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1112.method3177(var9, var6);
            }
            class56 var10 = var9.method1248(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3304();
                this.field1115.method3177(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("by.k(I[IB)Lbq;")
    public class56 method1043(int arg0, int[] arg1) {
        if (this.field1118.method2695() == 1) {
            return this.method1041(0, arg0, arg1);
        } else if (this.field1118.method2681(arg0) == 1) {
            return this.method1041(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("by.e(I[IB)Lbq;")
    public class56 method1044(int arg0, int[] arg1) {
        if (this.field1114.method2695() == 1) {
            return this.method1042(0, arg0, arg1);
        } else if (this.field1114.method2681(arg0) == 1) {
            return this.method1042(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

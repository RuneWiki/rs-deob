package deob;

@ObfuscatedName("bm")
public class class53 {

    @ObfuscatedName("bm.k")
    public class147 field1098;

    @ObfuscatedName("bm.y")
    public class147 field1091;

    @ObfuscatedName("bm.s")
    public class175 field1093 = new class175(256);

    @ObfuscatedName("bm.g")
    public class175 field1094 = new class175(256);

    public class53(class147 arg0, class147 arg1) {
        this.field1098 = arg0;
        this.field1091 = arg1;
    }

    @ObfuscatedName("bm.k(II[II)Lbo;")
    public class56 method1058(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1094.method3244(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = class52.method1047(this.field1098, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1042();
            this.field1094.method3253(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1112.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.y(II[IB)Lbo;")
    public class56 method1060(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1094.method3244(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class64 var9 = (class64) this.field1093.method3244(var6);
            if (var9 == null) {
                var9 = class64.method1274(this.field1091, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1093.method3253(var9, var6);
            }
            class56 var10 = var9.method1282(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3365();
                this.field1094.method3253(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.s(I[II)Lbo;")
    public class56 method1071(int arg0, int[] arg1) {
        if (this.field1098.method2773() == 1) {
            return this.method1058(0, arg0, arg1);
        } else if (this.field1098.method2739(arg0) == 1) {
            return this.method1058(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bm.g(I[II)Lbo;")
    public class56 method1061(int arg0, int[] arg1) {
        if (this.field1091.method2773() == 1) {
            return this.method1060(0, arg0, arg1);
        } else if (this.field1091.method2739(arg0) == 1) {
            return this.method1060(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

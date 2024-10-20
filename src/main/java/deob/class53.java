package deob;

@ObfuscatedName("bf")
public class class53 {

    @ObfuscatedName("bf.n")
    public class147 field1114;

    @ObfuscatedName("bf.x")
    public class147 field1110;

    @ObfuscatedName("bf.k")
    public class175 field1109 = new class175(256);

    @ObfuscatedName("bf.i")
    public class175 field1112 = new class175(256);

    public class53(class147 arg0, class147 arg1) {
        this.field1114 = arg0;
        this.field1110 = arg1;
    }

    @ObfuscatedName("bf.n(II[II)Lbv;")
    public class56 method1070(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1112.method3149(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = class52.method1064(this.field1114, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1057();
            this.field1112.method3156(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1127.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bf.x(II[II)Lbv;")
    public class56 method1082(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1112.method3149(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class64 var9 = (class64) this.field1109.method3149(var6);
            if (var9 == null) {
                var9 = class64.method1280(this.field1110, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1109.method3156(var9, var6);
            }
            class56 var10 = var9.method1282(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3277();
                this.field1112.method3156(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bf.k(I[II)Lbv;")
    public class56 method1069(int arg0, int[] arg1) {
        if (this.field1114.method2724() == 1) {
            return this.method1070(0, arg0, arg1);
        } else if (this.field1114.method2684(arg0) == 1) {
            return this.method1070(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bf.i(I[IB)Lbv;")
    public class56 method1067(int arg0, int[] arg1) {
        if (this.field1110.method2724() == 1) {
            return this.method1082(0, arg0, arg1);
        } else if (this.field1110.method2684(arg0) == 1) {
            return this.method1082(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

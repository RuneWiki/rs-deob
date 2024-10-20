package deob;

@ObfuscatedName("be")
public class class61 {

    @ObfuscatedName("be.x")
    public class183 field1096;

    @ObfuscatedName("be.n")
    public class183 field1091;

    @ObfuscatedName("be.g")
    public class126 field1092 = new class126(256);

    @ObfuscatedName("be.v")
    public class126 field1093 = new class126(256);

    public class61(class183 arg0, class183 arg1) {
        this.field1096 = arg0;
        this.field1091 = arg1;
    }

    @ObfuscatedName("be.x(II[IB)Lbi;")
    public class56 method1176(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1093.method2286(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method1042(this.field1096, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1036();
            this.field1093.method2287(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1035.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("be.n(II[II)Lbi;")
    public class56 method1180(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1093.method2286(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class55 var9 = (class55) this.field1092.method2286(var6);
            if (var9 == null) {
                var9 = class55.method1052(this.field1091, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1092.method2287(var9, var6);
            }
            class56 var10 = var9.method1054(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method2327();
                this.field1093.method2287(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("be.g(I[IB)Lbi;")
    public class56 method1178(int arg0, int[] arg1) {
        if (this.field1096.method3164() == 1) {
            return this.method1176(0, arg0, arg1);
        } else if (this.field1096.method3150(arg0) == 1) {
            return this.method1176(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("be.v(I[II)Lbi;")
    public class56 method1179(int arg0, int[] arg1) {
        if (this.field1091.method3164() == 1) {
            return this.method1180(0, arg0, arg1);
        } else if (this.field1091.method3150(arg0) == 1) {
            return this.method1180(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

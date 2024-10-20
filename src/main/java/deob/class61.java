package deob;

@ObfuscatedName("be")
public class class61 {

    @ObfuscatedName("be.x")
    public class183 field1090;

    @ObfuscatedName("be.j")
    public class183 field1088;

    @ObfuscatedName("be.c")
    public class126 field1089 = new class126(256);

    @ObfuscatedName("be.d")
    public class126 field1092 = new class126(256);

    public class61(class183 arg0, class183 arg1) {
        this.field1090 = arg0;
        this.field1088 = arg1;
    }

    @ObfuscatedName("be.x(II[IS)Lbt;")
    public class56 method1168(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1092.method2247(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method1032(this.field1090, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1023();
            this.field1092.method2245(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1036.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("be.j(II[II)Lbt;")
    public class56 method1175(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1092.method2247(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class55 var9 = (class55) this.field1089.method2247(var6);
            if (var9 == null) {
                var9 = class55.method1043(this.field1088, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1089.method2245(var9, var6);
            }
            class56 var10 = var9.method1060(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method2278();
                this.field1092.method2245(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("be.c(I[IB)Lbt;")
    public class56 method1171(int arg0, int[] arg1) {
        if (this.field1090.method3109() == 1) {
            return this.method1168(0, arg0, arg1);
        } else if (this.field1090.method3108(arg0) == 1) {
            return this.method1168(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("be.d(I[IS)Lbt;")
    public class56 method1169(int arg0, int[] arg1) {
        if (this.field1088.method3109() == 1) {
            return this.method1175(0, arg0, arg1);
        } else if (this.field1088.method3108(arg0) == 1) {
            return this.method1175(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

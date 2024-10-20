package deob;

@ObfuscatedName("bh")
public class class61 {

    @ObfuscatedName("bh.s")
    public class183 field1082;

    @ObfuscatedName("bh.c")
    public class183 field1085;

    @ObfuscatedName("bh.f")
    public class126 field1084 = new class126(256);

    @ObfuscatedName("bh.h")
    public class126 field1083 = new class126(256);

    public class61(class183 arg0, class183 arg1) {
        this.field1082 = arg0;
        this.field1085 = arg1;
    }

    @ObfuscatedName("bh.s(II[II)Lbs;")
    public class56 method1049(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1083.method2131(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method901(this.field1082, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method898();
            this.field1083.method2139(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1021.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bh.c(II[II)Lbs;")
    public class56 method1042(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1083.method2131(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class55 var9 = (class55) this.field1084.method2131(var6);
            if (var9 == null) {
                var9 = class55.method931(this.field1085, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1084.method2139(var9, var6);
            }
            class56 var10 = var9.method914(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method2179();
                this.field1083.method2139(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bh.f(I[II)Lbs;")
    public class56 method1043(int arg0, int[] arg1) {
        if (this.field1082.method3009() == 1) {
            return this.method1049(0, arg0, arg1);
        } else if (this.field1082.method2996(arg0) == 1) {
            return this.method1049(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bh.g(I[II)Lbs;")
    public class56 method1044(int arg0, int[] arg1) {
        if (this.field1085.method3009() == 1) {
            return this.method1042(0, arg0, arg1);
        } else if (this.field1085.method2996(arg0) == 1) {
            return this.method1042(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

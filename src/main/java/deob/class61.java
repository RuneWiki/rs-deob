package deob;

@ObfuscatedName("bv")
public class class61 {

    @ObfuscatedName("bv.f")
    public class183 field1109;

    @ObfuscatedName("bv.i")
    public class183 field1102;

    @ObfuscatedName("bv.u")
    public class126 field1103 = new class126(256);

    @ObfuscatedName("bv.h")
    public class126 field1104 = new class126(256);

    public class61(class183 arg0, class183 arg1) {
        this.field1109 = arg0;
        this.field1102 = arg1;
    }

    @ObfuscatedName("bv.f(II[II)Lbr;")
    public class56 method1126(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1104.method2254(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method991(this.field1109, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method986();
            this.field1104.method2255(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1045.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bv.i(II[II)Lbr;")
    public class56 method1129(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1104.method2254(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class55 var9 = (class55) this.field1103.method2254(var6);
            if (var9 == null) {
                var9 = class55.method1004(this.field1102, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1103.method2255(var9, var6);
            }
            class56 var10 = var9.method1006(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method2289();
                this.field1104.method2255(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bv.u(I[II)Lbr;")
    public class56 method1127(int arg0, int[] arg1) {
        if (this.field1109.method3138() == 1) {
            return this.method1126(0, arg0, arg1);
        } else if (this.field1109.method3127(arg0) == 1) {
            return this.method1126(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bv.r(I[II)Lbr;")
    public class56 method1132(int arg0, int[] arg1) {
        if (this.field1102.method3138() == 1) {
            return this.method1129(0, arg0, arg1);
        } else if (this.field1102.method3127(arg0) == 1) {
            return this.method1129(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

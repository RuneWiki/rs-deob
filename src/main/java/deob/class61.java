package deob;

@ObfuscatedName("br")
public class class61 {

    @ObfuscatedName("br.n")
    public class183 field1075;

    @ObfuscatedName("br.d")
    public class183 field1074;

    @ObfuscatedName("br.m")
    public class126 field1072 = new class126(256);

    @ObfuscatedName("br.h")
    public class126 field1077 = new class126(256);

    public class61(class183 arg0, class183 arg1) {
        this.field1075 = arg0;
        this.field1074 = arg1;
    }

    @ObfuscatedName("br.n(II[IB)Lbd;")
    public class56 method1076(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1077.method2229(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method943(this.field1075, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method937();
            this.field1077.method2230(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1015.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("br.d(II[II)Lbd;")
    public class56 method1087(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1077.method2229(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class55 var9 = (class55) this.field1072.method2229(var6);
            if (var9 == null) {
                var9 = class55.method958(this.field1074, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1072.method2230(var9, var6);
            }
            class56 var10 = var9.method979(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method2273();
                this.field1077.method2230(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("br.m(I[II)Lbd;")
    public class56 method1077(int arg0, int[] arg1) {
        if (this.field1075.method3124() == 1) {
            return this.method1076(0, arg0, arg1);
        } else if (this.field1075.method3103(arg0) == 1) {
            return this.method1076(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("br.h(I[II)Lbd;")
    public class56 method1078(int arg0, int[] arg1) {
        if (this.field1074.method3124() == 1) {
            return this.method1087(0, arg0, arg1);
        } else if (this.field1074.method3103(arg0) == 1) {
            return this.method1087(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

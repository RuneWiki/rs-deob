package deob;

@ObfuscatedName("be")
public class class61 {

    @ObfuscatedName("be.o")
    public class183 field1080;

    @ObfuscatedName("be.m")
    public class183 field1083;

    @ObfuscatedName("be.b")
    public class126 field1081 = new class126(256);

    @ObfuscatedName("be.g")
    public class126 field1082 = new class126(256);

    public class61(class183 arg0, class183 arg1) {
        this.field1080 = arg0;
        this.field1083 = arg1;
    }

    @ObfuscatedName("be.o(II[II)Lbh;")
    public class56 method1072(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1082.method2151(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method937(this.field1080, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method926();
            this.field1082.method2143(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1023.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("be.m(II[II)Lbh;")
    public class56 method1079(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1082.method2151(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class55 var9 = (class55) this.field1081.method2151(var6);
            if (var9 == null) {
                var9 = class55.method943(this.field1083, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1081.method2143(var9, var6);
            }
            class56 var10 = var9.method948(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method2189();
                this.field1082.method2143(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("be.b(I[II)Lbh;")
    public class56 method1074(int arg0, int[] arg1) {
        if (this.field1080.method3063() == 1) {
            return this.method1072(0, arg0, arg1);
        } else if (this.field1080.method3054(arg0) == 1) {
            return this.method1072(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("be.g(I[II)Lbh;")
    public class56 method1073(int arg0, int[] arg1) {
        if (this.field1083.method3063() == 1) {
            return this.method1079(0, arg0, arg1);
        } else if (this.field1083.method3054(arg0) == 1) {
            return this.method1079(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

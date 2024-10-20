package deob;

@ObfuscatedName("bg")
public class class61 {

    @ObfuscatedName("bg.p")
    public class183 field1082;

    @ObfuscatedName("bg.g")
    public class183 field1081;

    @ObfuscatedName("bg.x")
    public class126 field1088 = new class126(256);

    @ObfuscatedName("bg.q")
    public class126 field1083 = new class126(256);

    public class61(class183 arg0, class183 arg1) {
        this.field1082 = arg0;
        this.field1081 = arg1;
    }

    @ObfuscatedName("bg.p(II[II)Lbr;")
    public class56 method1064(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1083.method2199(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method929(this.field1082, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method927();
            this.field1083.method2189(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1025.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bg.g(II[II)Lbr;")
    public class56 method1060(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1083.method2199(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class55 var9 = (class55) this.field1088.method2199(var6);
            if (var9 == null) {
                var9 = class55.method955(this.field1081, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1088.method2189(var9, var6);
            }
            class56 var10 = var9.method945(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method2225();
                this.field1083.method2189(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bg.x(I[II)Lbr;")
    public class56 method1072(int arg0, int[] arg1) {
        if (this.field1082.method3041() == 1) {
            return this.method1064(0, arg0, arg1);
        } else if (this.field1082.method3068(arg0) == 1) {
            return this.method1064(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bg.q(I[IB)Lbr;")
    public class56 method1059(int arg0, int[] arg1) {
        if (this.field1081.method3041() == 1) {
            return this.method1060(0, arg0, arg1);
        } else if (this.field1081.method3068(arg0) == 1) {
            return this.method1060(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

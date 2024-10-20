package deob;

@ObfuscatedName("bk")
public class class61 {

    @ObfuscatedName("bk.b")
    public class183 field1067;

    @ObfuscatedName("bk.l")
    public class183 field1064;

    @ObfuscatedName("bk.i")
    public class126 field1068 = new class126(256);

    @ObfuscatedName("bk.t")
    public class126 field1066 = new class126(256);

    public class61(class183 arg0, class183 arg1) {
        this.field1067 = arg0;
        this.field1064 = arg1;
    }

    @ObfuscatedName("bk.b(II[II)Lbl;")
    public class56 method1147(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1066.method2280(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method1017(this.field1067, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1023();
            this.field1066.method2277(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1010.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bk.l(II[IB)Lbl;")
    public class56 method1148(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1066.method2280(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class55 var9 = (class55) this.field1068.method2280(var6);
            if (var9 == null) {
                var9 = class55.method1038(this.field1064, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1068.method2277(var9, var6);
            }
            class56 var10 = var9.method1043(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method2313();
                this.field1066.method2277(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bk.i(I[II)Lbl;")
    public class56 method1154(int arg0, int[] arg1) {
        if (this.field1067.method3194() == 1) {
            return this.method1147(0, arg0, arg1);
        } else if (this.field1067.method3200(arg0) == 1) {
            return this.method1147(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bk.t(I[II)Lbl;")
    public class56 method1157(int arg0, int[] arg1) {
        if (this.field1064.method3194() == 1) {
            return this.method1148(0, arg0, arg1);
        } else if (this.field1064.method3200(arg0) == 1) {
            return this.method1148(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

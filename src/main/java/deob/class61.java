package deob;

@ObfuscatedName("bf")
public class class61 {

    @ObfuscatedName("bf.k")
    public class183 field1086;

    @ObfuscatedName("bf.y")
    public class183 field1083;

    @ObfuscatedName("bf.o")
    public class126 field1081 = new class126(256);

    @ObfuscatedName("bf.r")
    public class126 field1082 = new class126(256);

    public class61(class183 arg0, class183 arg1) {
        this.field1086 = arg0;
        this.field1083 = arg1;
    }

    @ObfuscatedName("bf.k(II[II)Lbl;")
    public class56 method1104(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1082.method2171(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method959(this.field1086, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method953();
            this.field1082.method2173(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1024.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bf.y(II[IB)Lbl;")
    public class56 method1108(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1082.method2171(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class55 var9 = (class55) this.field1081.method2171(var6);
            if (var9 == null) {
                var9 = class55.method976(this.field1083, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1081.method2173(var9, var6);
            }
            class56 var10 = var9.method975(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method2214();
                this.field1082.method2173(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bf.o(I[IB)Lbl;")
    public class56 method1099(int arg0, int[] arg1) {
        if (this.field1086.method3062() == 1) {
            return this.method1104(0, arg0, arg1);
        } else if (this.field1086.method3075(arg0) == 1) {
            return this.method1104(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bf.r(I[II)Lbl;")
    public class56 method1100(int arg0, int[] arg1) {
        if (this.field1083.method3062() == 1) {
            return this.method1108(0, arg0, arg1);
        } else if (this.field1083.method3075(arg0) == 1) {
            return this.method1108(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

package deob;

@ObfuscatedName("bm")
public class class61 {

    @ObfuscatedName("bm.i")
    public class183 field1086;

    @ObfuscatedName("bm.e")
    public class183 field1084;

    @ObfuscatedName("bm.f")
    public class126 field1085 = new class126(256);

    @ObfuscatedName("bm.k")
    public class126 field1083 = new class126(256);

    public class61(class183 arg0, class183 arg1) {
        this.field1086 = arg0;
        this.field1084 = arg1;
    }

    @ObfuscatedName("bm.i(II[II)Lba;")
    public class56 method1068(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1083.method2161(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method933(this.field1086, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method921();
            this.field1083.method2162(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1023.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.e(II[IS)Lba;")
    public class56 method1069(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1083.method2161(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class55 var9 = (class55) this.field1085.method2161(var6);
            if (var9 == null) {
                var9 = class55.method942(this.field1084, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1085.method2162(var9, var6);
            }
            class56 var10 = var9.method943(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method2200();
                this.field1083.method2162(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.f(I[IB)Lba;")
    public class56 method1070(int arg0, int[] arg1) {
        if (this.field1086.method3024() == 1) {
            return this.method1068(0, arg0, arg1);
        } else if (this.field1086.method3023(arg0) == 1) {
            return this.method1068(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bm.k(I[II)Lba;")
    public class56 method1071(int arg0, int[] arg1) {
        if (this.field1084.method3024() == 1) {
            return this.method1069(0, arg0, arg1);
        } else if (this.field1084.method3023(arg0) == 1) {
            return this.method1069(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

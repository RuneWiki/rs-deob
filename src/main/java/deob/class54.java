package deob;

@ObfuscatedName("bo")
public class class54 {

    @ObfuscatedName("bo.a")
    public class151 field1123;

    @ObfuscatedName("bo.v")
    public class151 field1130;

    @ObfuscatedName("bo.i")
    public class179 field1122 = new class179(256);

    @ObfuscatedName("bo.b")
    public class179 field1125 = new class179(256);

    public class54(class151 arg0, class151 arg1) {
        this.field1123 = arg0;
        this.field1130 = arg1;
    }

    @ObfuscatedName("bo.a(II[II)Lbl;")
    public class57 method1065(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class57 var8 = (class57) this.field1125.method3231(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = class53.method1054(this.field1123, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class57 var10 = var9.method1055();
            this.field1125.method3211(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1141.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bo.v(II[II)Lbl;")
    public class57 method1066(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class57 var8 = (class57) this.field1125.method3231(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class65 var9 = (class65) this.field1122.method3231(var6);
            if (var9 == null) {
                var9 = class65.method1269(this.field1130, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1122.method3211(var9, var6);
            }
            class57 var10 = var9.method1296(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3343();
                this.field1125.method3211(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bo.i(I[IB)Lbl;")
    public class57 method1075(int arg0, int[] arg1) {
        if (this.field1123.method2752() == 1) {
            return this.method1065(0, arg0, arg1);
        } else if (this.field1123.method2806(arg0) == 1) {
            return this.method1065(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bo.b(I[II)Lbl;")
    public class57 method1068(int arg0, int[] arg1) {
        if (this.field1130.method2752() == 1) {
            return this.method1066(0, arg0, arg1);
        } else if (this.field1130.method2806(arg0) == 1) {
            return this.method1066(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

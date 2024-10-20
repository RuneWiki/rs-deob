package deob;

@ObfuscatedName("bc")
public class class54 {

    @ObfuscatedName("bc.b")
    public class151 field1123;

    @ObfuscatedName("bc.e")
    public class151 field1119;

    @ObfuscatedName("bc.i")
    public class179 field1120 = new class179(256);

    @ObfuscatedName("bc.k")
    public class179 field1122 = new class179(256);

    public class54(class151 arg0, class151 arg1) {
        this.field1123 = arg0;
        this.field1119 = arg1;
    }

    @ObfuscatedName("bc.b(II[IB)Lbx;")
    public class57 method1049(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class57 var8 = (class57) this.field1122.method3257(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = class53.method1033(this.field1123, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class57 var10 = var9.method1024();
            this.field1122.method3258(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1137.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bc.e(II[IS)Lbx;")
    public class57 method1036(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class57 var8 = (class57) this.field1122.method3257(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class65 var9 = (class65) this.field1120.method3257(var6);
            if (var9 == null) {
                var9 = class65.method1254(this.field1119, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1120.method3258(var9, var6);
            }
            class57 var10 = var9.method1270(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3392();
                this.field1122.method3258(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bc.i(I[II)Lbx;")
    public class57 method1050(int arg0, int[] arg1) {
        if (this.field1123.method2773() == 1) {
            return this.method1049(0, arg0, arg1);
        } else if (this.field1123.method2772(arg0) == 1) {
            return this.method1049(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bc.k(I[IB)Lbx;")
    public class57 method1038(int arg0, int[] arg1) {
        if (this.field1119.method2773() == 1) {
            return this.method1036(0, arg0, arg1);
        } else if (this.field1119.method2772(arg0) == 1) {
            return this.method1036(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

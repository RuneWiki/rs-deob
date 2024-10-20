package deob;

@ObfuscatedName("bs")
public class class54 {

    @ObfuscatedName("bs.g")
    public class149 field1119;

    @ObfuscatedName("bs.j")
    public class149 field1120;

    @ObfuscatedName("bs.z")
    public class177 field1122 = new class177(256);

    @ObfuscatedName("bs.b")
    public class177 field1125 = new class177(256);

    public class54(class149 arg0, class149 arg1) {
        this.field1119 = arg0;
        this.field1120 = arg1;
    }

    @ObfuscatedName("bs.g(II[IB)Lbg;")
    public class57 method1021(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class57 var8 = (class57) this.field1125.method3140(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = class53.method1019(this.field1119, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class57 var10 = var9.method1011();
            this.field1125.method3137(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1137.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bs.j(II[II)Lbg;")
    public class57 method1032(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class57 var8 = (class57) this.field1125.method3140(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class65 var9 = (class65) this.field1122.method3140(var6);
            if (var9 == null) {
                var9 = class65.method1223(this.field1120, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1122.method3137(var9, var6);
            }
            class57 var10 = var9.method1238(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3259();
                this.field1125.method3137(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bs.z(I[II)Lbg;")
    public class57 method1022(int arg0, int[] arg1) {
        if (this.field1119.method2671() == 1) {
            return this.method1021(0, arg0, arg1);
        } else if (this.field1119.method2688(arg0) == 1) {
            return this.method1021(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bs.b(I[IB)Lbg;")
    public class57 method1023(int arg0, int[] arg1) {
        if (this.field1120.method2671() == 1) {
            return this.method1032(0, arg0, arg1);
        } else if (this.field1120.method2688(arg0) == 1) {
            return this.method1032(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

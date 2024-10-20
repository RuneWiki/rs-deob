package deob;

@ObfuscatedName("bo")
public class class59 {

    @ObfuscatedName("bo.i")
    public class155 field1209;

    @ObfuscatedName("bo.b")
    public class155 field1215;

    @ObfuscatedName("bo.r")
    public class177 field1213 = new class177(256);

    @ObfuscatedName("bo.l")
    public class177 field1210 = new class177(256);

    public class59(class155 arg0, class155 arg1) {
        this.field1209 = arg0;
        this.field1215 = arg1;
    }

    @ObfuscatedName("bo.i(II[IB)Lbq;")
    public class64 method1275(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class64 var8 = (class64) this.field1210.method3315(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class58 var9 = class58.method1261(this.field1209, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class64 var10 = var9.method1256();
            this.field1210.method3329(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1243.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bo.b(II[II)Lbq;")
    public class64 method1272(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class64 var8 = (class64) this.field1210.method3315(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = (class54) this.field1213.method3315(var6);
            if (var9 == null) {
                var9 = class54.method1209(this.field1215, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1213.method3329(var9, var6);
            }
            class64 var10 = var9.method1191(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3363();
                this.field1210.method3329(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bo.r(I[IB)Lbq;")
    public class64 method1266(int arg0, int[] arg1) {
        if (this.field1209.method3054() == 1) {
            return this.method1275(0, arg0, arg1);
        } else if (this.field1209.method3084(arg0) == 1) {
            return this.method1275(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bo.l(I[II)Lbq;")
    public class64 method1267(int arg0, int[] arg1) {
        if (this.field1215.method3054() == 1) {
            return this.method1272(0, arg0, arg1);
        } else if (this.field1215.method3084(arg0) == 1) {
            return this.method1272(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

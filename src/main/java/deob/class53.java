package deob;

@ObfuscatedName("bw")
public class class53 {

    @ObfuscatedName("bw.y")
    public class145 field1106;

    @ObfuscatedName("bw.u")
    public class145 field1100;

    @ObfuscatedName("bw.k")
    public class173 field1105 = new class173(256);

    @ObfuscatedName("bw.v")
    public class173 field1102 = new class173(256);

    public class53(class145 arg0, class145 arg1) {
        this.field1106 = arg0;
        this.field1100 = arg1;
    }

    @ObfuscatedName("bw.y(II[IB)Lbh;")
    public class56 method1039(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1102.method3171(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = class52.method1033(this.field1106, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1026();
            this.field1102.method3172(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1116.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.u(II[II)Lbh;")
    public class56 method1040(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1102.method3171(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class64 var9 = (class64) this.field1105.method3171(var6);
            if (var9 == null) {
                var9 = class64.method1260(this.field1100, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1105.method3172(var9, var6);
            }
            class56 var10 = var9.method1261(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3268();
                this.field1102.method3172(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.k(I[II)Lbh;")
    public class56 method1041(int arg0, int[] arg1) {
        if (this.field1106.method2715() == 1) {
            return this.method1039(0, arg0, arg1);
        } else if (this.field1106.method2714(arg0) == 1) {
            return this.method1039(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bw.v(I[II)Lbh;")
    public class56 method1051(int arg0, int[] arg1) {
        if (this.field1100.method2715() == 1) {
            return this.method1040(0, arg0, arg1);
        } else if (this.field1100.method2714(arg0) == 1) {
            return this.method1040(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

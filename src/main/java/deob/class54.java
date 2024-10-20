package deob;

@ObfuscatedName("bq")
public class class54 {

    @ObfuscatedName("bq.e")
    public class149 field1143;

    @ObfuscatedName("bq.v")
    public class149 field1135;

    @ObfuscatedName("bq.k")
    public class177 field1136 = new class177(256);

    @ObfuscatedName("bq.g")
    public class177 field1137 = new class177(256);

    public class54(class149 arg0, class149 arg1) {
        this.field1143 = arg0;
        this.field1135 = arg1;
    }

    @ObfuscatedName("bq.e(II[II)Lbr;")
    public class57 method1069(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class57 var8 = (class57) this.field1137.method3192(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = class53.method1048(this.field1143, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class57 var10 = var9.method1045();
            this.field1137.method3193(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1153.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bq.v(II[IB)Lbr;")
    public class57 method1063(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class57 var8 = (class57) this.field1137.method3192(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class65 var9 = (class65) this.field1136.method3192(var6);
            if (var9 == null) {
                var9 = class65.method1286(this.field1135, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1136.method3193(var9, var6);
            }
            class57 var10 = var9.method1287(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3324();
                this.field1137.method3193(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bq.k(I[II)Lbr;")
    public class57 method1064(int arg0, int[] arg1) {
        if (this.field1143.method2729() == 1) {
            return this.method1069(0, arg0, arg1);
        } else if (this.field1143.method2730(arg0) == 1) {
            return this.method1069(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bq.g(I[IB)Lbr;")
    public class57 method1065(int arg0, int[] arg1) {
        if (this.field1135.method2729() == 1) {
            return this.method1063(0, arg0, arg1);
        } else if (this.field1135.method2730(arg0) == 1) {
            return this.method1063(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

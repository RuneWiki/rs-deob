package deob;

@ObfuscatedName("bm")
public class class60 {

    @ObfuscatedName("bm.g")
    public class167 field1215;

    @ObfuscatedName("bm.b")
    public class167 field1214;

    @ObfuscatedName("bm.w")
    public class196 field1209 = new class196(256);

    @ObfuscatedName("bm.d")
    public class196 field1211 = new class196(256);

    public class60(class167 arg0, class167 arg1) {
        this.field1215 = arg0;
        this.field1214 = arg1;
    }

    @ObfuscatedName("bm.g(II[II)Lbd;")
    public class63 method1259(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1211.method3573(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1253(this.field1215, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1257();
            this.field1211.method3569(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1224.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.b(II[II)Lbd;")
    public class63 method1260(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1211.method3573(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1209.method3573(var6);
            if (var9 == null) {
                var9 = class71.method1482(this.field1214, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1209.method3569(var9, var6);
            }
            class63 var10 = var9.method1485(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3693();
                this.field1211.method3569(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.w(I[IB)Lbd;")
    public class63 method1269(int arg0, int[] arg1) {
        if (this.field1215.method3089() == 1) {
            return this.method1259(0, arg0, arg1);
        } else if (this.field1215.method3088(arg0) == 1) {
            return this.method1259(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bm.d(I[IB)Lbd;")
    public class63 method1265(int arg0, int[] arg1) {
        if (this.field1214.method3089() == 1) {
            return this.method1260(0, arg0, arg1);
        } else if (this.field1214.method3088(arg0) == 1) {
            return this.method1260(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

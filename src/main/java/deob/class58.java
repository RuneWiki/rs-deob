package deob;

@ObfuscatedName("br")
public class class58 {

    @ObfuscatedName("br.i")
    public class152 field1211;

    @ObfuscatedName("br.w")
    public class152 field1208;

    @ObfuscatedName("br.f")
    public class175 field1209 = new class175(256);

    @ObfuscatedName("br.e")
    public class175 field1210 = new class175(256);

    public class58(class152 arg0, class152 arg1) {
        this.field1211 = arg0;
        this.field1208 = arg1;
    }

    @ObfuscatedName("br.i(II[II)Lbb;")
    public class63 method1258(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1210.method3273(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1251(this.field1211, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1242();
            this.field1210.method3278(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1238.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("br.w(II[IB)Lbb;")
    public class63 method1254(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1210.method3273(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field1209.method3273(var6);
            if (var9 == null) {
                var9 = class53.method1192(this.field1208, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1209.method3278(var9, var6);
            }
            class63 var10 = var9.method1185(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3328();
                this.field1210.method3278(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("br.f(I[II)Lbb;")
    public class63 method1269(int arg0, int[] arg1) {
        if (this.field1211.method3030() == 1) {
            return this.method1258(0, arg0, arg1);
        } else if (this.field1211.method2980(arg0) == 1) {
            return this.method1258(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("br.e(I[II)Lbb;")
    public class63 method1257(int arg0, int[] arg1) {
        if (this.field1208.method3030() == 1) {
            return this.method1254(0, arg0, arg1);
        } else if (this.field1208.method2980(arg0) == 1) {
            return this.method1254(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

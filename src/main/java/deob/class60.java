package deob;

@ObfuscatedName("bw")
public class class60 {

    @ObfuscatedName("bw.o")
    public class167 field1213;

    @ObfuscatedName("bw.f")
    public class167 field1209;

    @ObfuscatedName("bw.i")
    public class196 field1210 = new class196(256);

    @ObfuscatedName("bw.h")
    public class196 field1211 = new class196(256);

    public class60(class167 arg0, class167 arg1) {
        this.field1213 = arg0;
        this.field1209 = arg1;
    }

    @ObfuscatedName("bw.o(II[IB)Lbt;")
    public class63 method1192(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1211.method3482(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1169(this.field1213, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1163();
            this.field1211.method3495(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1225.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.f(II[II)Lbt;")
    public class63 method1180(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1211.method3482(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1210.method3482(var6);
            if (var9 == null) {
                var9 = class71.method1386(this.field1209, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1210.method3495(var9, var6);
            }
            class63 var10 = var9.method1387(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3605();
                this.field1211.method3495(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.i(I[II)Lbt;")
    public class63 method1181(int arg0, int[] arg1) {
        if (this.field1213.method3045() == 1) {
            return this.method1192(0, arg0, arg1);
        } else if (this.field1213.method2973(arg0) == 1) {
            return this.method1192(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bw.h(I[IB)Lbt;")
    public class63 method1182(int arg0, int[] arg1) {
        if (this.field1209.method3045() == 1) {
            return this.method1180(0, arg0, arg1);
        } else if (this.field1209.method2973(arg0) == 1) {
            return this.method1180(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

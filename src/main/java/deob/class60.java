package deob;

@ObfuscatedName("bc")
public class class60 {

    @ObfuscatedName("bc.c")
    public class167 field1212;

    @ObfuscatedName("bc.h")
    public class167 field1209;

    @ObfuscatedName("bc.k")
    public class196 field1210 = new class196(256);

    @ObfuscatedName("bc.t")
    public class196 field1211 = new class196(256);

    public class60(class167 arg0, class167 arg1) {
        this.field1212 = arg0;
        this.field1209 = arg1;
    }

    @ObfuscatedName("bc.c(II[II)Lbn;")
    public class63 method1202(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1211.method3521(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1199(this.field1212, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1194();
            this.field1211.method3531(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1225.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bc.h(II[II)Lbn;")
    public class63 method1203(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1211.method3521(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1210.method3521(var6);
            if (var9 == null) {
                var9 = class71.method1422(this.field1209, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1210.method3531(var9, var6);
            }
            class63 var10 = var9.method1424(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3646();
                this.field1211.method3531(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bc.k(I[IB)Lbn;")
    public class63 method1213(int arg0, int[] arg1) {
        if (this.field1212.method3005() == 1) {
            return this.method1202(0, arg0, arg1);
        } else if (this.field1212.method3046(arg0) == 1) {
            return this.method1202(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bc.t(I[IB)Lbn;")
    public class63 method1204(int arg0, int[] arg1) {
        if (this.field1209.method3005() == 1) {
            return this.method1203(0, arg0, arg1);
        } else if (this.field1209.method3046(arg0) == 1) {
            return this.method1203(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

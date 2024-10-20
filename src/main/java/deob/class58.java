package deob;

@ObfuscatedName("bh")
public class class58 {

    @ObfuscatedName("bh.y")
    public class152 field1191;

    @ObfuscatedName("bh.m")
    public class152 field1190;

    @ObfuscatedName("bh.d")
    public class175 field1195 = new class175(256);

    @ObfuscatedName("bh.k")
    public class175 field1192 = new class175(256);

    public class58(class152 arg0, class152 arg1) {
        this.field1191 = arg0;
        this.field1190 = arg1;
    }

    @ObfuscatedName("bh.y(II[II)Lbx;")
    public class63 method1270(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1192.method3337(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1259(this.field1191, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1263();
            this.field1192.method3334(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1228.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bh.m(II[IB)Lbx;")
    public class63 method1271(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1192.method3337(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field1195.method3337(var6);
            if (var9 == null) {
                var9 = class53.method1202(this.field1190, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1195.method3334(var9, var6);
            }
            class63 var10 = var9.method1203(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3395();
                this.field1192.method3334(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bh.d(I[II)Lbx;")
    public class63 method1272(int arg0, int[] arg1) {
        if (this.field1191.method3015() == 1) {
            return this.method1270(0, arg0, arg1);
        } else if (this.field1191.method2994(arg0) == 1) {
            return this.method1270(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bh.k(I[IB)Lbx;")
    public class63 method1274(int arg0, int[] arg1) {
        if (this.field1190.method3015() == 1) {
            return this.method1271(0, arg0, arg1);
        } else if (this.field1190.method2994(arg0) == 1) {
            return this.method1271(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

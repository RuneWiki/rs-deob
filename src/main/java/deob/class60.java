package deob;

@ObfuscatedName("bc")
public class class60 {

    @ObfuscatedName("bc.o")
    public class167 field1208;

    @ObfuscatedName("bc.e")
    public class167 field1216;

    @ObfuscatedName("bc.u")
    public class196 field1214 = new class196(256);

    @ObfuscatedName("bc.b")
    public class196 field1209 = new class196(256);

    public class60(class167 arg0, class167 arg1) {
        this.field1208 = arg0;
        this.field1216 = arg1;
    }

    @ObfuscatedName("bc.o(II[II)Lbq;")
    public class63 method1192(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1209.method3545(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1190(this.field1208, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1184();
            this.field1209.method3544(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1227.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bc.e(II[II)Lbq;")
    public class63 method1191(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1209.method3545(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1214.method3545(var6);
            if (var9 == null) {
                var9 = class71.method1434(this.field1216, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1214.method3544(var9, var6);
            }
            class63 var10 = var9.method1413(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3670();
                this.field1209.method3544(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bc.u(I[II)Lbq;")
    public class63 method1193(int arg0, int[] arg1) {
        if (this.field1208.method3068() == 1) {
            return this.method1192(0, arg0, arg1);
        } else if (this.field1208.method3067(arg0) == 1) {
            return this.method1192(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bc.b(I[II)Lbq;")
    public class63 method1202(int arg0, int[] arg1) {
        if (this.field1216.method3068() == 1) {
            return this.method1191(0, arg0, arg1);
        } else if (this.field1216.method3067(arg0) == 1) {
            return this.method1191(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

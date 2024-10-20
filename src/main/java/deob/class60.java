package deob;

@ObfuscatedName("bg")
public class class60 {

    @ObfuscatedName("bg.n")
    public class167 field1214;

    @ObfuscatedName("bg.q")
    public class167 field1212;

    @ObfuscatedName("bg.c")
    public class196 field1209 = new class196(256);

    @ObfuscatedName("bg.l")
    public class196 field1210 = new class196(256);

    public class60(class167 arg0, class167 arg1) {
        this.field1214 = arg0;
        this.field1212 = arg1;
    }

    @ObfuscatedName("bg.n(II[IS)Lbk;")
    public class63 method1235(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1210.method3518(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1224(this.field1214, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1225();
            this.field1210.method3524(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1224.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bg.q(II[IB)Lbk;")
    public class63 method1236(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1210.method3518(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1209.method3518(var6);
            if (var9 == null) {
                var9 = class71.method1443(this.field1212, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1209.method3524(var9, var6);
            }
            class63 var10 = var9.method1451(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3651();
                this.field1210.method3524(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bg.c(I[II)Lbk;")
    public class63 method1237(int arg0, int[] arg1) {
        if (this.field1214.method3031() == 1) {
            return this.method1235(0, arg0, arg1);
        } else if (this.field1214.method3030(arg0) == 1) {
            return this.method1235(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bg.l(I[II)Lbk;")
    public class63 method1247(int arg0, int[] arg1) {
        if (this.field1212.method3031() == 1) {
            return this.method1236(0, arg0, arg1);
        } else if (this.field1212.method3030(arg0) == 1) {
            return this.method1236(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

package deob;

@ObfuscatedName("bi")
public class class60 {

    @ObfuscatedName("bi.j")
    public class167 field1210;

    @ObfuscatedName("bi.m")
    public class167 field1209;

    @ObfuscatedName("bi.f")
    public class196 field1202 = new class196(256);

    @ObfuscatedName("bi.l")
    public class196 field1203 = new class196(256);

    public class60(class167 arg0, class167 arg1) {
        this.field1210 = arg0;
        this.field1209 = arg1;
    }

    @ObfuscatedName("bi.j(II[IS)Lbe;")
    public class63 method1236(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1203.method3571(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1227(this.field1210, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1225();
            this.field1203.method3574(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1220.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bi.m(II[IB)Lbe;")
    public class63 method1237(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1203.method3571(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1202.method3571(var6);
            if (var9 == null) {
                var9 = class71.method1448(this.field1209, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1202.method3574(var9, var6);
            }
            class63 var10 = var9.method1465(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3700();
                this.field1203.method3574(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bi.f(I[IS)Lbe;")
    public class63 method1248(int arg0, int[] arg1) {
        if (this.field1210.method3133() == 1) {
            return this.method1236(0, arg0, arg1);
        } else if (this.field1210.method3094(arg0) == 1) {
            return this.method1236(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bi.l(I[IB)Lbe;")
    public class63 method1235(int arg0, int[] arg1) {
        if (this.field1209.method3133() == 1) {
            return this.method1237(0, arg0, arg1);
        } else if (this.field1209.method3094(arg0) == 1) {
            return this.method1237(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

package deob;

@ObfuscatedName("bl")
public class class53 {

    @ObfuscatedName("bl.k")
    public class146 field1115;

    @ObfuscatedName("bl.b")
    public class146 field1111;

    @ObfuscatedName("bl.e")
    public class174 field1112 = new class174(256);

    @ObfuscatedName("bl.i")
    public class174 field1117 = new class174(256);

    public class53(class146 arg0, class146 arg1) {
        this.field1115 = arg0;
        this.field1111 = arg1;
    }

    @ObfuscatedName("bl.k(II[II)Lbf;")
    public class56 method1050(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1117.method3197(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = class52.method1047(this.field1115, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1037();
            this.field1117.method3191(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1130.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bl.b(II[II)Lbf;")
    public class56 method1051(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1117.method3197(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class64 var9 = (class64) this.field1112.method3197(var6);
            if (var9 == null) {
                var9 = class64.method1270(this.field1111, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1112.method3191(var9, var6);
            }
            class56 var10 = var9.method1272(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3321();
                this.field1117.method3191(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bl.e(I[II)Lbf;")
    public class56 method1052(int arg0, int[] arg1) {
        if (this.field1115.method2708() == 1) {
            return this.method1050(0, arg0, arg1);
        } else if (this.field1115.method2723(arg0) == 1) {
            return this.method1050(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bl.i(I[IB)Lbf;")
    public class56 method1060(int arg0, int[] arg1) {
        if (this.field1111.method2708() == 1) {
            return this.method1051(0, arg0, arg1);
        } else if (this.field1111.method2723(arg0) == 1) {
            return this.method1051(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

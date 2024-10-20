package deob;

@ObfuscatedName("bc")
public class class53 {

    @ObfuscatedName("bc.e")
    public class146 field1113;

    @ObfuscatedName("bc.v")
    public class146 field1114;

    @ObfuscatedName("bc.i")
    public class174 field1108 = new class174(256);

    @ObfuscatedName("bc.g")
    public class174 field1109 = new class174(256);

    public class53(class146 arg0, class146 arg1) {
        this.field1113 = arg0;
        this.field1114 = arg1;
    }

    @ObfuscatedName("bc.e(II[II)Lbg;")
    public class56 method1041(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1109.method3171(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = class52.method1030(this.field1113, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1017();
            this.field1109.method3168(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1125.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bc.v(II[II)Lbg;")
    public class56 method1044(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1109.method3171(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class64 var9 = (class64) this.field1108.method3171(var6);
            if (var9 == null) {
                var9 = class64.method1288(this.field1114, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1108.method3168(var9, var6);
            }
            class56 var10 = var9.method1263(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3273();
                this.field1109.method3168(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bc.i(I[II)Lbg;")
    public class56 method1034(int arg0, int[] arg1) {
        if (this.field1113.method2706() == 1) {
            return this.method1041(0, arg0, arg1);
        } else if (this.field1113.method2705(arg0) == 1) {
            return this.method1041(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bc.g(I[II)Lbg;")
    public class56 method1031(int arg0, int[] arg1) {
        if (this.field1114.method2706() == 1) {
            return this.method1044(0, arg0, arg1);
        } else if (this.field1114.method2705(arg0) == 1) {
            return this.method1044(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

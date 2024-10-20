package deob;

@ObfuscatedName("bg")
public class class53 {

    @ObfuscatedName("bg.j")
    public class146 field1127;

    @ObfuscatedName("bg.z")
    public class146 field1119;

    @ObfuscatedName("bg.y")
    public class174 field1118 = new class174(256);

    @ObfuscatedName("bg.h")
    public class174 field1121 = new class174(256);

    public class53(class146 arg0, class146 arg1) {
        this.field1127 = arg0;
        this.field1119 = arg1;
    }

    @ObfuscatedName("bg.j(II[IB)Lbm;")
    public class56 method1042(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1121.method3214(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = class52.method1022(this.field1127, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1026();
            this.field1121.method3208(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1136.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bg.z(II[II)Lbm;")
    public class56 method1038(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1121.method3214(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class64 var9 = (class64) this.field1118.method3214(var6);
            if (var9 == null) {
                var9 = class64.method1273(this.field1119, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1118.method3208(var9, var6);
            }
            class56 var10 = var9.method1269(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3309();
                this.field1121.method3208(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bg.y(I[II)Lbm;")
    public class56 method1039(int arg0, int[] arg1) {
        if (this.field1127.method2750() == 1) {
            return this.method1042(0, arg0, arg1);
        } else if (this.field1127.method2749(arg0) == 1) {
            return this.method1042(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bg.h(I[II)Lbm;")
    public class56 method1040(int arg0, int[] arg1) {
        if (this.field1119.method2750() == 1) {
            return this.method1038(0, arg0, arg1);
        } else if (this.field1119.method2749(arg0) == 1) {
            return this.method1038(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

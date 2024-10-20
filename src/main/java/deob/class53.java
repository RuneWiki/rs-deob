package deob;

@ObfuscatedName("ba")
public class class53 {

    @ObfuscatedName("ba.i")
    public class146 field1125;

    @ObfuscatedName("ba.c")
    public class146 field1126;

    @ObfuscatedName("ba.h")
    public class174 field1123 = new class174(256);

    @ObfuscatedName("ba.v")
    public class174 field1124 = new class174(256);

    public class53(class146 arg0, class146 arg1) {
        this.field1125 = arg0;
        this.field1126 = arg1;
    }

    @ObfuscatedName("ba.i(II[II)Lbg;")
    public class56 method1056(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1124.method3218(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = class52.method1049(this.field1125, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1045();
            this.field1124.method3229(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1140.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ba.c(II[IB)Lbg;")
    public class56 method1057(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1124.method3218(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class64 var9 = (class64) this.field1123.method3218(var6);
            if (var9 == null) {
                var9 = class64.method1295(this.field1126, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1123.method3229(var9, var6);
            }
            class56 var10 = var9.method1282(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3334();
                this.field1124.method3229(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ba.h(I[IB)Lbg;")
    public class56 method1058(int arg0, int[] arg1) {
        if (this.field1125.method2751() == 1) {
            return this.method1056(0, arg0, arg1);
        } else if (this.field1125.method2750(arg0) == 1) {
            return this.method1056(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ba.v(I[IB)Lbg;")
    public class56 method1068(int arg0, int[] arg1) {
        if (this.field1126.method2751() == 1) {
            return this.method1057(0, arg0, arg1);
        } else if (this.field1126.method2750(arg0) == 1) {
            return this.method1057(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

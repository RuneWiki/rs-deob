package deob;

@ObfuscatedName("bw")
public class class53 {

    @ObfuscatedName("bw.e")
    public class146 field1122;

    @ObfuscatedName("bw.o")
    public class146 field1121;

    @ObfuscatedName("bw.y")
    public class174 field1126 = new class174(256);

    @ObfuscatedName("bw.b")
    public class174 field1123 = new class174(256);

    public class53(class146 arg0, class146 arg1) {
        this.field1122 = arg0;
        this.field1121 = arg1;
    }

    @ObfuscatedName("bw.e(II[II)Lbt;")
    public class56 method1033(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1123.method3092(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = class52.method1017(this.field1122, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1019();
            this.field1123.method3091(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1136.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.o(II[II)Lbt;")
    public class56 method1034(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1123.method3092(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class64 var9 = (class64) this.field1126.method3092(var6);
            if (var9 == null) {
                var9 = class64.method1262(this.field1121, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1126.method3091(var9, var6);
            }
            class56 var10 = var9.method1254(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3204();
                this.field1123.method3091(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.y(I[II)Lbt;")
    public class56 method1032(int arg0, int[] arg1) {
        if (this.field1122.method2688() == 1) {
            return this.method1033(0, arg0, arg1);
        } else if (this.field1122.method2670(arg0) == 1) {
            return this.method1033(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bw.b(I[II)Lbt;")
    public class56 method1036(int arg0, int[] arg1) {
        if (this.field1121.method2688() == 1) {
            return this.method1034(0, arg0, arg1);
        } else if (this.field1121.method2670(arg0) == 1) {
            return this.method1034(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

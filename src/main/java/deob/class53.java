package deob;

@ObfuscatedName("bd")
public class class53 {

    @ObfuscatedName("bd.t")
    public class146 field1124;

    @ObfuscatedName("bd.o")
    public class146 field1115;

    @ObfuscatedName("bd.i")
    public class174 field1114 = new class174(256);

    @ObfuscatedName("bd.p")
    public class174 field1117 = new class174(256);

    public class53(class146 arg0, class146 arg1) {
        this.field1124 = arg0;
        this.field1115 = arg1;
    }

    @ObfuscatedName("bd.t(II[II)Lbc;")
    public class56 method1028(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1117.method3138(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = class52.method1018(this.field1124, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1014();
            this.field1117.method3132(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1137.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bd.o(II[II)Lbc;")
    public class56 method1029(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1117.method3138(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class64 var9 = (class64) this.field1114.method3138(var6);
            if (var9 == null) {
                var9 = class64.method1261(this.field1115, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1114.method3132(var9, var6);
            }
            class56 var10 = var9.method1277(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3261();
                this.field1117.method3132(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bd.i(I[IB)Lbc;")
    public class56 method1030(int arg0, int[] arg1) {
        if (this.field1124.method2679() == 1) {
            return this.method1028(0, arg0, arg1);
        } else if (this.field1124.method2740(arg0) == 1) {
            return this.method1028(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bd.p(I[II)Lbc;")
    public class56 method1036(int arg0, int[] arg1) {
        if (this.field1115.method2679() == 1) {
            return this.method1029(0, arg0, arg1);
        } else if (this.field1115.method2740(arg0) == 1) {
            return this.method1029(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

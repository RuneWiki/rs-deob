package deob;

@ObfuscatedName("bb")
public class class57 {

    @ObfuscatedName("bb.g")
    public class150 field1185;

    @ObfuscatedName("bb.e")
    public class150 field1186;

    @ObfuscatedName("bb.n")
    public class173 field1188 = new class173(256);

    @ObfuscatedName("bb.j")
    public class173 field1190 = new class173(256);

    public class57(class150 arg0, class150 arg1) {
        this.field1185 = arg0;
        this.field1186 = arg1;
    }

    @ObfuscatedName("bb.g(II[IB)Lbf;")
    public class62 method1258(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class62 var8 = (class62) this.field1190.method3354(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class56 var9 = class56.method1253(this.field1185, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class62 var10 = var9.method1243();
            this.field1190.method3353(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1221.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bb.e(II[II)Lbf;")
    public class62 method1259(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class62 var8 = (class62) this.field1190.method3354(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = (class52) this.field1188.method3354(var6);
            if (var9 == null) {
                var9 = class52.method1188(this.field1186, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1188.method3353(var9, var6);
            }
            class62 var10 = var9.method1189(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3415();
                this.field1190.method3353(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bb.n(I[IB)Lbf;")
    public class62 method1263(int arg0, int[] arg1) {
        if (this.field1185.method3022() == 1) {
            return this.method1258(0, arg0, arg1);
        } else if (this.field1185.method3033(arg0) == 1) {
            return this.method1258(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bb.j(I[II)Lbf;")
    public class62 method1260(int arg0, int[] arg1) {
        if (this.field1186.method3022() == 1) {
            return this.method1259(0, arg0, arg1);
        } else if (this.field1186.method3033(arg0) == 1) {
            return this.method1259(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

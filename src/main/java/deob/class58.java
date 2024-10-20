package deob;

@ObfuscatedName("bb")
public class class58 {

    @ObfuscatedName("bb.p")
    public class152 field1207;

    @ObfuscatedName("bb.i")
    public class152 field1214;

    @ObfuscatedName("bb.o")
    public class175 field1206 = new class175(256);

    @ObfuscatedName("bb.n")
    public class175 field1204 = new class175(256);

    public class58(class152 arg0, class152 arg1) {
        this.field1207 = arg0;
        this.field1214 = arg1;
    }

    @ObfuscatedName("bb.p(II[II)Lbj;")
    public class63 method1303(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1204.method3312(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1279(this.field1207, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1280();
            this.field1204.method3313(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1242.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bb.i(II[IB)Lbj;")
    public class63 method1290(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1204.method3312(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field1206.method3312(var6);
            if (var9 == null) {
                var9 = class53.method1228(this.field1214, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1206.method3313(var9, var6);
            }
            class63 var10 = var9.method1230(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3360();
                this.field1204.method3313(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bb.o(I[IB)Lbj;")
    public class63 method1293(int arg0, int[] arg1) {
        if (this.field1207.method3009() == 1) {
            return this.method1303(0, arg0, arg1);
        } else if (this.field1207.method3008(arg0) == 1) {
            return this.method1303(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bb.n(I[II)Lbj;")
    public class63 method1294(int arg0, int[] arg1) {
        if (this.field1214.method3009() == 1) {
            return this.method1290(0, arg0, arg1);
        } else if (this.field1214.method3008(arg0) == 1) {
            return this.method1290(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

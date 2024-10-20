package deob;

@ObfuscatedName("bf")
public class class58 {

    @ObfuscatedName("bf.j")
    public class161 field1186;

    @ObfuscatedName("bf.y")
    public class161 field1184;

    @ObfuscatedName("bf.z")
    public class190 field1185 = new class190(256);

    @ObfuscatedName("bf.l")
    public class190 field1187 = new class190(256);

    public class58(class161 arg0, class161 arg1) {
        this.field1186 = arg0;
        this.field1184 = arg1;
    }

    @ObfuscatedName("bf.j(II[II)Lbv;")
    public class61 method1265(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class61 var8 = (class61) this.field1187.method3459(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1242(this.field1186, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class61 var10 = var9.method1243();
            this.field1187.method3463(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1199.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bf.y(II[II)Lbv;")
    public class61 method1260(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class61 var8 = (class61) this.field1187.method3459(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class69 var9 = (class69) this.field1185.method3459(var6);
            if (var9 == null) {
                var9 = class69.method1482(this.field1184, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1185.method3463(var9, var6);
            }
            class61 var10 = var9.method1483(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3563();
                this.field1187.method3463(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bf.z(I[II)Lbv;")
    public class61 method1261(int arg0, int[] arg1) {
        if (this.field1186.method2990() == 1) {
            return this.method1265(0, arg0, arg1);
        } else if (this.field1186.method3008(arg0) == 1) {
            return this.method1265(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bf.l(I[II)Lbv;")
    public class61 method1262(int arg0, int[] arg1) {
        if (this.field1184.method2990() == 1) {
            return this.method1260(0, arg0, arg1);
        } else if (this.field1184.method3008(arg0) == 1) {
            return this.method1260(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

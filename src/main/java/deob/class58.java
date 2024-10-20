package deob;

@ObfuscatedName("bo")
public class class58 {

    @ObfuscatedName("bo.b")
    public class153 field1213;

    @ObfuscatedName("bo.c")
    public class153 field1221;

    @ObfuscatedName("bo.j")
    public class175 field1211 = new class175(256);

    @ObfuscatedName("bo.i")
    public class175 field1212 = new class175(256);

    public class58(class153 arg0, class153 arg1) {
        this.field1213 = arg0;
        this.field1221 = arg1;
    }

    @ObfuscatedName("bo.b(II[II)Lbl;")
    public class63 method1253(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1212.method3232(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1249(this.field1213, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1239();
            this.field1212.method3228(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1250.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bo.c(II[II)Lbl;")
    public class63 method1255(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1212.method3232(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field1211.method3232(var6);
            if (var9 == null) {
                var9 = class53.method1184(this.field1221, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1211.method3228(var9, var6);
            }
            class63 var10 = var9.method1186(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3282();
                this.field1212.method3228(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bo.j(I[II)Lbl;")
    public class63 method1256(int arg0, int[] arg1) {
        if (this.field1213.method3021() == 1) {
            return this.method1253(0, arg0, arg1);
        } else if (this.field1213.method2973(arg0) == 1) {
            return this.method1253(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bo.i(I[II)Lbl;")
    public class63 method1257(int arg0, int[] arg1) {
        if (this.field1221.method3021() == 1) {
            return this.method1255(0, arg0, arg1);
        } else if (this.field1221.method2973(arg0) == 1) {
            return this.method1255(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

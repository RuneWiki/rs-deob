package deob;

@ObfuscatedName("bg")
public class class58 {

    @ObfuscatedName("bg.g")
    public class153 field1206;

    @ObfuscatedName("bg.h")
    public class153 field1210;

    @ObfuscatedName("bg.s")
    public class175 field1205 = new class175(256);

    @ObfuscatedName("bg.o")
    public class175 field1204 = new class175(256);

    public class58(class153 arg0, class153 arg1) {
        this.field1206 = arg0;
        this.field1210 = arg1;
    }

    @ObfuscatedName("bg.g(II[II)Lbk;")
    public class63 method1285(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1204.method3354(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1276(this.field1206, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1274();
            this.field1204.method3364(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1242.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bg.h(II[II)Lbk;")
    public class63 method1288(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1204.method3354(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field1205.method3354(var6);
            if (var9 == null) {
                var9 = class53.method1238(this.field1210, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1205.method3364(var9, var6);
            }
            class63 var10 = var9.method1224(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3404();
                this.field1204.method3364(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bg.s(I[II)Lbk;")
    public class63 method1286(int arg0, int[] arg1) {
        if (this.field1206.method3144() == 1) {
            return this.method1285(0, arg0, arg1);
        } else if (this.field1206.method3100(arg0) == 1) {
            return this.method1285(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bg.o(I[II)Lbk;")
    public class63 method1294(int arg0, int[] arg1) {
        if (this.field1210.method3144() == 1) {
            return this.method1288(0, arg0, arg1);
        } else if (this.field1210.method3100(arg0) == 1) {
            return this.method1288(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

package deob;

@ObfuscatedName("bl")
public class class58 {

    @ObfuscatedName("bl.j")
    public class153 field1207;

    @ObfuscatedName("bl.f")
    public class153 field1204;

    @ObfuscatedName("bl.o")
    public class175 field1205 = new class175(256);

    @ObfuscatedName("bl.h")
    public class175 field1210 = new class175(256);

    public class58(class153 arg0, class153 arg1) {
        this.field1207 = arg0;
        this.field1204 = arg1;
    }

    @ObfuscatedName("bl.j(II[II)Lbx;")
    public class63 method1273(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1210.method3296(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1265(this.field1207, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1259();
            this.field1210.method3297(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1242.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bl.f(II[II)Lbx;")
    public class63 method1281(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1210.method3296(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field1205.method3296(var6);
            if (var9 == null) {
                var9 = class53.method1201(this.field1204, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1205.method3297(var9, var6);
            }
            class63 var10 = var9.method1215(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3349();
                this.field1210.method3297(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bl.o(I[II)Lbx;")
    public class63 method1275(int arg0, int[] arg1) {
        if (this.field1207.method3081() == 1) {
            return this.method1273(0, arg0, arg1);
        } else if (this.field1207.method3037(arg0) == 1) {
            return this.method1273(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bl.h(I[IB)Lbx;")
    public class63 method1276(int arg0, int[] arg1) {
        if (this.field1204.method3081() == 1) {
            return this.method1281(0, arg0, arg1);
        } else if (this.field1204.method3037(arg0) == 1) {
            return this.method1281(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

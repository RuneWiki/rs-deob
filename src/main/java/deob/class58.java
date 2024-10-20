package deob;

@ObfuscatedName("ba")
public class class58 {

    @ObfuscatedName("ba.p")
    public class153 field1196;

    @ObfuscatedName("ba.e")
    public class153 field1203;

    @ObfuscatedName("ba.a")
    public class175 field1194 = new class175(256);

    @ObfuscatedName("ba.h")
    public class175 field1197 = new class175(256);

    public class58(class153 arg0, class153 arg1) {
        this.field1196 = arg0;
        this.field1203 = arg1;
    }

    @ObfuscatedName("ba.p(II[II)Lby;")
    public class63 method1291(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1197.method3311(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1280(this.field1196, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1275();
            this.field1197.method3310(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1236.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ba.e(II[II)Lby;")
    public class63 method1292(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1197.method3311(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field1194.method3311(var6);
            if (var9 == null) {
                var9 = class53.method1238(this.field1203, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1194.method3310(var9, var6);
            }
            class63 var10 = var9.method1215(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3360();
                this.field1197.method3310(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ba.a(I[IB)Lby;")
    public class63 method1293(int arg0, int[] arg1) {
        if (this.field1196.method3059() == 1) {
            return this.method1291(0, arg0, arg1);
        } else if (this.field1196.method3058(arg0) == 1) {
            return this.method1291(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ba.h(I[II)Lby;")
    public class63 method1290(int arg0, int[] arg1) {
        if (this.field1203.method3059() == 1) {
            return this.method1292(0, arg0, arg1);
        } else if (this.field1203.method3058(arg0) == 1) {
            return this.method1292(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

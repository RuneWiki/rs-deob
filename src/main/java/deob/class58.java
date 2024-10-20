package deob;

@ObfuscatedName("bm")
public class class58 {

    @ObfuscatedName("bm.c")
    public class153 field1218;

    @ObfuscatedName("bm.q")
    public class153 field1217;

    @ObfuscatedName("bm.y")
    public class175 field1219 = new class175(256);

    @ObfuscatedName("bm.v")
    public class175 field1220 = new class175(256);

    public class58(class153 arg0, class153 arg1) {
        this.field1218 = arg0;
        this.field1217 = arg1;
    }

    @ObfuscatedName("bm.c(II[II)Lbo;")
    public class63 method1219(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1220.method3138(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1209(this.field1218, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1199();
            this.field1220.method3136(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1251.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.q(II[II)Lbo;")
    public class63 method1220(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1220.method3138(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field1219.method3138(var6);
            if (var9 == null) {
                var9 = class53.method1149(this.field1217, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1219.method3136(var9, var6);
            }
            class63 var10 = var9.method1155(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3196();
                this.field1220.method3136(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.y(I[II)Lbo;")
    public class63 method1228(int arg0, int[] arg1) {
        if (this.field1218.method2897() == 1) {
            return this.method1219(0, arg0, arg1);
        } else if (this.field1218.method2956(arg0) == 1) {
            return this.method1219(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bm.v(I[II)Lbo;")
    public class63 method1222(int arg0, int[] arg1) {
        if (this.field1217.method2897() == 1) {
            return this.method1220(0, arg0, arg1);
        } else if (this.field1217.method2956(arg0) == 1) {
            return this.method1220(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

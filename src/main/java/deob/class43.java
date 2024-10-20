package deob;

@ObfuscatedName("au")
public class class43 {

    @ObfuscatedName("au.c")
    public class307 field330;

    @ObfuscatedName("au.l")
    public class307 field326;

    @ObfuscatedName("au.s")
    public class402 field328 = new class402(256);

    @ObfuscatedName("au.e")
    public class402 field329 = new class402(256);

    public class43(class307 arg0, class307 arg1) {
        this.field330 = arg0;
        this.field326 = arg1;
    }

    @ObfuscatedName("au.c(II[IB)Lab;")
    public class38 method774(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class38 var8 = (class38) this.field329.method6456(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class37 var9 = class37.method668(this.field330, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class38 var10 = var9.method672();
            this.field329.method6455(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field275.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("au.l(II[IB)Lab;")
    public class38 method761(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class38 var8 = (class38) this.field329.method6456(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class50 var9 = (class50) this.field328.method6456(var6);
            if (var9 == null) {
                var9 = class50.method936(this.field326, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field328.method6455(var9, var6);
            }
            class38 var10 = var9.method953(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method6167();
                this.field329.method6455(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("au.s(I[IB)Lab;")
    public class38 method762(int arg0, int[] arg1) {
        if (this.field330.method5041() == 1) {
            return this.method774(0, arg0, arg1);
        } else if (this.field330.method5029(arg0) == 1) {
            return this.method774(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("au.e(I[II)Lab;")
    public class38 method763(int arg0, int[] arg1) {
        if (this.field326.method5041() == 1) {
            return this.method761(0, arg0, arg1);
        } else if (this.field326.method5029(arg0) == 1) {
            return this.method761(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

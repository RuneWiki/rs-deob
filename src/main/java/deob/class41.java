package deob;

@ObfuscatedName("ad")
public class class41 {

    @ObfuscatedName("ad.i")
    public class290 field298;

    @ObfuscatedName("ad.w")
    public class290 field297;

    @ObfuscatedName("ad.s")
    public class380 field296 = new class380(256);

    @ObfuscatedName("ad.a")
    public class380 field294 = new class380(256);

    public class41(class290 arg0, class290 arg1) {
        this.field298 = arg0;
        this.field297 = arg1;
    }

    @ObfuscatedName("ad.i(II[IS)Laz;")
    public class36 method763(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class36 var8 = (class36) this.field294.method6034(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class35 var9 = class35.method666(this.field298, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class36 var10 = var9.method667();
            this.field294.method6027(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field235.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ad.w(II[IB)Laz;")
    public class36 method764(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class36 var8 = (class36) this.field294.method6034(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class48 var9 = (class48) this.field296.method6034(var6);
            if (var9 == null) {
                var9 = class48.method953(this.field297, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field296.method6027(var9, var6);
            }
            class36 var10 = var9.method954(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method5752();
                this.field294.method6027(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ad.s(I[II)Laz;")
    public class36 method773(int arg0, int[] arg1) {
        if (this.field298.method4754() == 1) {
            return this.method763(0, arg0, arg1);
        } else if (this.field298.method4768(arg0) == 1) {
            return this.method763(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ad.a(I[IB)Laz;")
    public class36 method766(int arg0, int[] arg1) {
        if (this.field297.method4754() == 1) {
            return this.method764(0, arg0, arg1);
        } else if (this.field297.method4768(arg0) == 1) {
            return this.method764(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

package deob;

@ObfuscatedName("aw")
public class class47 {

    @ObfuscatedName("aw.a")
    public class330 field340;

    @ObfuscatedName("aw.f")
    public class330 field336;

    @ObfuscatedName("aw.c")
    public class441 field337 = new class441(256);

    @ObfuscatedName("aw.x")
    public class441 field341 = new class441(256);

    public class47(class330 arg0, class330 arg1) {
        this.field340 = arg0;
        this.field336 = arg1;
    }

    @ObfuscatedName("aw.a(II[II)Lam;")
    public class42 method841(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class42 var8 = (class42) this.field341.method7466(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class41 var9 = class41.method753(this.field340, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class42 var10 = var9.method748();
            this.field341.method7468(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field282.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("aw.f(II[IB)Lam;")
    public class42 method839(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class42 var8 = (class42) this.field341.method7466(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = (class54) this.field337.method7466(var6);
            if (var9 == null) {
                var9 = class54.method1023(this.field336, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field337.method7468(var9, var6);
            }
            class42 var10 = var9.method1004(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method7170();
                this.field341.method7468(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("aw.c(I[II)Lam;")
    public class42 method840(int arg0, int[] arg1) {
        if (this.field340.method5794() == 1) {
            return this.method841(0, arg0, arg1);
        } else if (this.field340.method5793(arg0) == 1) {
            return this.method841(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("aw.x(I[II)Lam;")
    public class42 method837(int arg0, int[] arg1) {
        if (this.field336.method5794() == 1) {
            return this.method839(0, arg0, arg1);
        } else if (this.field336.method5793(arg0) == 1) {
            return this.method839(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

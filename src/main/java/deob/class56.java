package deob;

@ObfuscatedName("bz")
public class class56 {

    @ObfuscatedName("bz.f")
    public class276 field440;

    @ObfuscatedName("bz.e")
    public class276 field446;

    @ObfuscatedName("bz.v")
    public class363 field441 = new class363(256);

    @ObfuscatedName("bz.y")
    public class363 field444 = new class363(256);

    public class56(class276 arg0, class276 arg1) {
        this.field440 = arg0;
        this.field446 = arg1;
    }

    @ObfuscatedName("bz.f(II[IB)Lar;")
    public class51 method738(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class51 var8 = (class51) this.field444.method5691(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class50 var9 = class50.method633(this.field440, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class51 var10 = var9.method639();
            this.field444.method5692(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field380.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bz.e(II[II)Lar;")
    public class51 method735(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class51 var8 = (class51) this.field444.method5691(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class63 var9 = (class63) this.field441.method5691(var6);
            if (var9 == null) {
                var9 = class63.method903(this.field446, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field441.method5692(var9, var6);
            }
            class51 var10 = var9.method905(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method5407();
                this.field444.method5692(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bz.v(I[II)Lar;")
    public class51 method736(int arg0, int[] arg1) {
        if (this.field440.method4515() == 1) {
            return this.method738(0, arg0, arg1);
        } else if (this.field440.method4514(arg0) == 1) {
            return this.method738(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bz.y(I[II)Lar;")
    public class51 method739(int arg0, int[] arg1) {
        if (this.field446.method4515() == 1) {
            return this.method735(0, arg0, arg1);
        } else if (this.field446.method4514(arg0) == 1) {
            return this.method735(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

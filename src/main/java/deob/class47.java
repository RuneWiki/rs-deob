package deob;

@ObfuscatedName("aj")
public class class47 {

    @ObfuscatedName("aj.h")
    public class333 field353;

    @ObfuscatedName("aj.e")
    public class333 field352;

    @ObfuscatedName("aj.v")
    public class444 field357 = new class444(256);

    @ObfuscatedName("aj.x")
    public class444 field354 = new class444(256);

    public class47(class333 arg0, class333 arg1) {
        this.field353 = arg0;
        this.field352 = arg1;
    }

    @ObfuscatedName("aj.h(II[IB)Laf;")
    public class42 method839(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class42 var8 = (class42) this.field354.method7535(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class41 var9 = class41.method747(this.field353, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class42 var10 = var9.method749();
            this.field354.method7528(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field297.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("aj.e(II[II)Laf;")
    public class42 method841(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class42 var8 = (class42) this.field354.method7535(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = (class54) this.field357.method7535(var6);
            if (var9 == null) {
                var9 = class54.method1022(this.field352, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field357.method7528(var9, var6);
            }
            class42 var10 = var9.method1023(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method7230();
                this.field354.method7528(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("aj.v(I[II)Laf;")
    public class42 method840(int arg0, int[] arg1) {
        if (this.field353.method5856() == 1) {
            return this.method839(0, arg0, arg1);
        } else if (this.field353.method5869(arg0) == 1) {
            return this.method839(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("aj.x(I[II)Laf;")
    public class42 method843(int arg0, int[] arg1) {
        if (this.field352.method5856() == 1) {
            return this.method841(0, arg0, arg1);
        } else if (this.field352.method5869(arg0) == 1) {
            return this.method841(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

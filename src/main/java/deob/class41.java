package deob;

@ObfuscatedName("ao")
public class class41 {

    @ObfuscatedName("ao.n")
    public class290 field306;

    @ObfuscatedName("ao.c")
    public class290 field304;

    @ObfuscatedName("ao.m")
    public class379 field305 = new class379(256);

    @ObfuscatedName("ao.k")
    public class379 field307 = new class379(256);

    public class41(class290 arg0, class290 arg1) {
        this.field306 = arg0;
        this.field304 = arg1;
    }

    @ObfuscatedName("ao.n(II[II)Lak;")
    public class36 method757(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class36 var8 = (class36) this.field307.method6016(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class35 var9 = class35.method663(this.field306, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class36 var10 = var9.method653();
            this.field307.method6015(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field250.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ao.c(II[II)Lak;")
    public class36 method758(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class36 var8 = (class36) this.field307.method6016(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class48 var9 = (class48) this.field305.method6016(var6);
            if (var9 == null) {
                var9 = class48.method934(this.field304, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field305.method6015(var9, var6);
            }
            class36 var10 = var9.method936(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method5732();
                this.field307.method6015(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ao.m(I[II)Lak;")
    public class36 method756(int arg0, int[] arg1) {
        if (this.field306.method4721() == 1) {
            return this.method757(0, arg0, arg1);
        } else if (this.field306.method4720(arg0) == 1) {
            return this.method757(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ao.k(I[IB)Lak;")
    public class36 method763(int arg0, int[] arg1) {
        if (this.field304.method4721() == 1) {
            return this.method758(0, arg0, arg1);
        } else if (this.field304.method4720(arg0) == 1) {
            return this.method758(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

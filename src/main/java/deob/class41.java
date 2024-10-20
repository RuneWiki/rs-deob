package deob;

@ObfuscatedName("at")
public class class41 {

    @ObfuscatedName("at.l")
    public class290 field309;

    @ObfuscatedName("at.q")
    public class290 field312;

    @ObfuscatedName("at.f")
    public class380 field310 = new class380(256);

    @ObfuscatedName("at.j")
    public class380 field308 = new class380(256);

    public class41(class290 arg0, class290 arg1) {
        this.field309 = arg0;
        this.field312 = arg1;
    }

    @ObfuscatedName("at.l(II[II)Laa;")
    public class36 method748(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class36 var8 = (class36) this.field308.method6061(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class35 var9 = class35.method653(this.field309, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class36 var10 = var9.method651();
            this.field308.method6065(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field246.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("at.q(II[II)Laa;")
    public class36 method755(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class36 var8 = (class36) this.field308.method6061(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class48 var9 = (class48) this.field310.method6061(var6);
            if (var9 == null) {
                var9 = class48.method914(this.field312, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field310.method6065(var9, var6);
            }
            class36 var10 = var9.method915(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method5775();
                this.field308.method6065(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("at.f(I[IB)Laa;")
    public class36 method743(int arg0, int[] arg1) {
        if (this.field309.method4794() == 1) {
            return this.method748(0, arg0, arg1);
        } else if (this.field309.method4774(arg0) == 1) {
            return this.method748(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("at.j(I[IB)Laa;")
    public class36 method756(int arg0, int[] arg1) {
        if (this.field312.method4794() == 1) {
            return this.method755(0, arg0, arg1);
        } else if (this.field312.method4774(arg0) == 1) {
            return this.method755(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

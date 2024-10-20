package deob;

@ObfuscatedName("bu")
public class class56 {

    @ObfuscatedName("bu.v")
    public class275 field466;

    @ObfuscatedName("bu.n")
    public class275 field471;

    @ObfuscatedName("bu.f")
    public class362 field465 = new class362(256);

    @ObfuscatedName("bu.y")
    public class362 field467 = new class362(256);

    public class56(class275 arg0, class275 arg1) {
        this.field466 = arg0;
        this.field471 = arg1;
    }

    @ObfuscatedName("bu.v(II[IB)Lau;")
    public class51 method690(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class51 var8 = (class51) this.field467.method5766(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class50 var9 = class50.method593(this.field466, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class51 var10 = var9.method592();
            this.field467.method5768(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field403.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bu.n(II[IB)Lau;")
    public class51 method705(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class51 var8 = (class51) this.field467.method5766(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class63 var9 = (class63) this.field465.method5766(var6);
            if (var9 == null) {
                var9 = class63.method860(this.field471, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field465.method5768(var9, var6);
            }
            class51 var10 = var9.method869(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method5496();
                this.field467.method5768(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bu.f(I[IB)Lau;")
    public class51 method691(int arg0, int[] arg1) {
        if (this.field466.method4536() == 1) {
            return this.method690(0, arg0, arg1);
        } else if (this.field466.method4478(arg0) == 1) {
            return this.method690(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bu.y(I[II)Lau;")
    public class51 method694(int arg0, int[] arg1) {
        if (this.field471.method4536() == 1) {
            return this.method705(0, arg0, arg1);
        } else if (this.field471.method4478(arg0) == 1) {
            return this.method705(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

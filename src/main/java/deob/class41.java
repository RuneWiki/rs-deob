package deob;

@ObfuscatedName("ac")
public class class41 {

    @ObfuscatedName("ac.v")
    public class316 field316;

    @ObfuscatedName("ac.c")
    public class316 field318;

    @ObfuscatedName("ac.i")
    public class419 field314 = new class419(256);

    @ObfuscatedName("ac.f")
    public class419 field315 = new class419(256);

    public class41(class316 arg0, class316 arg1) {
        this.field316 = arg0;
        this.field318 = arg1;
    }

    @ObfuscatedName("ac.v(II[II)Lat;")
    public class36 method740(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class36 var8 = (class36) this.field315.method6772(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class35 var9 = class35.method652(this.field316, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class36 var10 = var9.method649();
            this.field315.method6773(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field256.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ac.c(II[II)Lat;")
    public class36 method754(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class36 var8 = (class36) this.field315.method6772(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class48 var9 = (class48) this.field314.method6772(var6);
            if (var9 == null) {
                var9 = class48.method955(this.field318, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field314.method6773(var9, var6);
            }
            class36 var10 = var9.method942(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method6503();
                this.field315.method6773(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ac.i(I[II)Lat;")
    public class36 method750(int arg0, int[] arg1) {
        if (this.field316.method5319() == 1) {
            return this.method740(0, arg0, arg1);
        } else if (this.field316.method5305(arg0) == 1) {
            return this.method740(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ac.f(I[IB)Lat;")
    public class36 method743(int arg0, int[] arg1) {
        if (this.field318.method5319() == 1) {
            return this.method754(0, arg0, arg1);
        } else if (this.field318.method5305(arg0) == 1) {
            return this.method754(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

package deob;

@ObfuscatedName("aa")
public class class43 {

    @ObfuscatedName("aa.c")
    public class302 field321;

    @ObfuscatedName("aa.b")
    public class302 field317;

    @ObfuscatedName("aa.p")
    public class397 field316 = new class397(256);

    @ObfuscatedName("aa.m")
    public class397 field315 = new class397(256);

    public class43(class302 arg0, class302 arg1) {
        this.field321 = arg0;
        this.field317 = arg1;
    }

    @ObfuscatedName("aa.c(II[IB)Laj;")
    public class38 method795(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class38 var8 = (class38) this.field315.method6446(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class37 var9 = class37.method695(this.field321, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class38 var10 = var9.method696();
            this.field315.method6447(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field265.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("aa.b(II[II)Laj;")
    public class38 method787(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class38 var8 = (class38) this.field315.method6446(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class50 var9 = (class50) this.field316.method6446(var6);
            if (var9 == null) {
                var9 = class50.method998(this.field317, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field316.method6447(var9, var6);
            }
            class38 var10 = var9.method970(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method6163();
                this.field315.method6447(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("aa.p(I[II)Laj;")
    public class38 method788(int arg0, int[] arg1) {
        if (this.field321.method5062() == 1) {
            return this.method795(0, arg0, arg1);
        } else if (this.field321.method5144(arg0) == 1) {
            return this.method795(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("aa.m(I[II)Laj;")
    public class38 method789(int arg0, int[] arg1) {
        if (this.field317.method5062() == 1) {
            return this.method787(0, arg0, arg1);
        } else if (this.field317.method5144(arg0) == 1) {
            return this.method787(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

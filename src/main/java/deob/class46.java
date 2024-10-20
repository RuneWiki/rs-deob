package deob;

@ObfuscatedName("ah")
public class class46 {

    @ObfuscatedName("ah.f")
    public class337 field342;

    @ObfuscatedName("ah.w")
    public class337 field343;

    @ObfuscatedName("ah.v")
    public class451 field345 = new class451(256);

    @ObfuscatedName("ah.s")
    public class451 field344 = new class451(256);

    public class46(class337 arg0, class337 arg1) {
        this.field342 = arg0;
        this.field343 = arg1;
    }

    @ObfuscatedName("ah.f(II[IB)Lav;")
    public class41 method829(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class41 var8 = (class41) this.field344.method7706(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class40 var9 = class40.method734(this.field342, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class41 var10 = var9.method733();
            this.field344.method7716(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field290.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ah.w(II[II)Lav;")
    public class41 method836(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class41 var8 = (class41) this.field344.method7706(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field345.method7706(var6);
            if (var9 == null) {
                var9 = class53.method1023(this.field343, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field345.method7716(var9, var6);
            }
            class41 var10 = var9.method1035(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method7431();
                this.field344.method7716(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ah.v(I[II)Lav;")
    public class41 method831(int arg0, int[] arg1) {
        if (this.field342.method6055() == 1) {
            return this.method829(0, arg0, arg1);
        } else if (this.field342.method5982(arg0) == 1) {
            return this.method829(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ah.s(I[II)Lav;")
    public class41 method835(int arg0, int[] arg1) {
        if (this.field343.method6055() == 1) {
            return this.method836(0, arg0, arg1);
        } else if (this.field343.method5982(arg0) == 1) {
            return this.method836(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

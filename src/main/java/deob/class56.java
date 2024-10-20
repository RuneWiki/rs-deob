package deob;

@ObfuscatedName("bi")
public class class56 {

    @ObfuscatedName("bi.f")
    public class253 field427;

    @ObfuscatedName("bi.o")
    public class253 field425;

    @ObfuscatedName("bi.u")
    public class361 field426 = new class361(256);

    @ObfuscatedName("bi.p")
    public class361 field430 = new class361(256);

    public class56(class253 arg0, class253 arg1) {
        this.field427 = arg0;
        this.field425 = arg1;
    }

    @ObfuscatedName("bi.f(II[II)Lah;")
    public class51 method681(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class51 var8 = (class51) this.field430.method5638(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class50 var9 = class50.method602(this.field427, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class51 var10 = var9.method590();
            this.field430.method5640(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field370.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bi.o(II[IB)Lah;")
    public class51 method690(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class51 var8 = (class51) this.field430.method5638(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class63 var9 = (class63) this.field426.method5638(var6);
            if (var9 == null) {
                var9 = class63.method859(this.field425, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field426.method5640(var9, var6);
            }
            class51 var10 = var9.method848(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method5354();
                this.field430.method5640(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bi.u(I[II)Lah;")
    public class51 method683(int arg0, int[] arg1) {
        if (this.field427.method4002() == 1) {
            return this.method681(0, arg0, arg1);
        } else if (this.field427.method3944(arg0) == 1) {
            return this.method681(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bi.p(I[II)Lah;")
    public class51 method693(int arg0, int[] arg1) {
        if (this.field425.method4002() == 1) {
            return this.method690(0, arg0, arg1);
        } else if (this.field425.method3944(arg0) == 1) {
            return this.method690(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

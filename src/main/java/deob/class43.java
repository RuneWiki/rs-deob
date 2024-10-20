package deob;

@ObfuscatedName("aq")
public class class43 {

    @ObfuscatedName("aq.c")
    public class315 field318;

    @ObfuscatedName("aq.v")
    public class315 field320;

    @ObfuscatedName("aq.q")
    public class420 field319 = new class420(256);

    @ObfuscatedName("aq.f")
    public class420 field323 = new class420(256);

    public class43(class315 arg0, class315 arg1) {
        this.field318 = arg0;
        this.field320 = arg1;
    }

    @ObfuscatedName("aq.c(II[IB)Laf;")
    public class38 method722(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class38 var8 = (class38) this.field323.method6765(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class37 var9 = class37.method625(this.field318, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class38 var10 = var9.method616();
            this.field323.method6774(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field259.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("aq.v(II[II)Laf;")
    public class38 method718(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class38 var8 = (class38) this.field323.method6765(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class50 var9 = (class50) this.field319.method6765(var6);
            if (var9 == null) {
                var9 = class50.method904(this.field320, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field319.method6774(var9, var6);
            }
            class38 var10 = var9.method903(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method6497();
                this.field323.method6774(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("aq.q(I[II)Laf;")
    public class38 method719(int arg0, int[] arg1) {
        if (this.field318.method5311() == 1) {
            return this.method722(0, arg0, arg1);
        } else if (this.field318.method5313(arg0) == 1) {
            return this.method722(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("aq.f(I[IB)Laf;")
    public class38 method720(int arg0, int[] arg1) {
        if (this.field320.method5311() == 1) {
            return this.method718(0, arg0, arg1);
        } else if (this.field320.method5313(arg0) == 1) {
            return this.method718(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

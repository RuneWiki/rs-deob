package deob;

@ObfuscatedName("bi")
public class class46 {

    @ObfuscatedName("bi.am")
    public class375 field318;

    @ObfuscatedName("bi.ap")
    public class375 field317;

    @ObfuscatedName("bi.af")
    public class505 field319;

    public class46(class375 arg0, class375 arg1) {
        new class505(256);
        this.field319 = new class505(256);
        this.field318 = arg0;
        this.field317 = arg1;
    }

    @ObfuscatedName("bi.am(II[II)Lbm;")
    public class41 method876(int arg0, int arg1, int[] arg2) {
        long var4 = this.method859(arg0, arg1, false);
        class54 var6 = (class54) this.field319.method8301(var4);
        if (var6 != null) {
            return var6.method1040();
        } else if (arg2 == null || arg2[0] > 0) {
            class40 var7 = class40.method769(this.field318, arg0, arg1);
            if (var7 == null) {
                return null;
            }
            class41 var8 = var7.method770();
            this.field319.method8307(new class54(var8), var4);
            if (arg2 != null) {
                arg2[0] -= var8.field269.length;
            }
            return var8;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bi.ap(IIS)Lcb;")
    public class54 method856(int arg0, int arg1) {
        long var3 = this.method859(arg0, arg1, true);
        class54 var5 = (class54) this.field319.method8301(var3);
        if (var5 != null) {
            return var5;
        }
        class55 var6 = class55.method1055(this.field317, arg0, arg1);
        if (var6 == null) {
            return new class54();
        } else {
            class54 var7 = new class54(var6);
            this.field319.method8307(var7, var3);
            return var7;
        }
    }

    @ObfuscatedName("bi.af(I[II)Lbm;")
    public class41 method874(int arg0, int[] arg1) {
        if (this.field318.method6398() == 1) {
            return this.method876(0, arg0, arg1);
        } else if (this.field318.method6406(arg0) == 1) {
            return this.method876(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bi.aj(II)Lcb;")
    public class54 method857(int arg0) {
        if (this.field317.method6398() == 1) {
            return this.method856(0, arg0);
        } else if (this.field317.method6406(arg0) == 1) {
            return this.method856(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bi.aq(II)Lbm;")
    public class41 method855(int arg0) {
        return this.method874(arg0, (int[]) null);
    }

    @ObfuscatedName("bi.ar(IIZI)J")
    public long method859(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >> 12);
        int var5 = var4 | arg0 << 16;
        return arg2 ? (long) var5 ^ 0x100000000L : (long) var5;
    }
}

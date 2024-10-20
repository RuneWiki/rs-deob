package deob;

@ObfuscatedName("bc")
public class class46 {

    @ObfuscatedName("bc.aq")
    public class378 field315;

    @ObfuscatedName("bc.aw")
    public class378 field314;

    @ObfuscatedName("bc.al")
    public class508 field316;

    public class46(class378 arg0, class378 arg1) {
        new class508(256);
        this.field316 = new class508(256);
        this.field315 = arg0;
        this.field314 = arg1;
    }

    @ObfuscatedName("bc.aq(II[II)Lbr;")
    public class41 method786(int arg0, int arg1, int[] arg2) {
        long var4 = this.method789(arg0, arg1, false);
        class54 var6 = (class54) this.field316.method8322(var4);
        if (var6 != null) {
            return var6.method997();
        } else if (arg2 == null || arg2[0] > 0) {
            class40 var7 = class40.method705(this.field315, arg0, arg1);
            if (var7 == null) {
                return null;
            }
            class41 var8 = var7.method710();
            this.field316.method8324(new class54(var8), var4);
            if (arg2 != null) {
                arg2[0] -= var8.field270.length;
            }
            return var8;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bc.aw(III)Lch;")
    public class54 method806(int arg0, int arg1) {
        long var3 = this.method789(arg0, arg1, true);
        class54 var5 = (class54) this.field316.method8322(var3);
        if (var5 != null) {
            return var5;
        }
        class55 var6 = class55.method1005(this.field314, arg0, arg1);
        if (var6 == null) {
            return new class54();
        } else {
            class54 var7 = new class54(var6);
            this.field316.method8324(var7, var3);
            return var7;
        }
    }

    @ObfuscatedName("bc.al(I[II)Lbr;")
    public class41 method793(int arg0, int[] arg1) {
        if (this.field315.method6454() == 1) {
            return this.method786(0, arg0, arg1);
        } else if (this.field315.method6429(arg0) == 1) {
            return this.method786(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bc.ai(II)Lch;")
    public class54 method784(int arg0) {
        if (this.field314.method6454() == 1) {
            return this.method806(0, arg0);
        } else if (this.field314.method6429(arg0) == 1) {
            return this.method806(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bc.ar(II)Lbr;")
    public class41 method788(int arg0) {
        return this.method793(arg0, (int[]) null);
    }

    @ObfuscatedName("bc.as(IIZI)J")
    public long method789(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >> 12);
        int var5 = var4 | arg0 << 16;
        return arg2 ? (long) var5 ^ 0x100000000L : (long) var5;
    }
}

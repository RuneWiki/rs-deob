package deob;

@ObfuscatedName("ba")
public class class46 {

    @ObfuscatedName("ba.ap")
    public class392 field292;

    @ObfuscatedName("ba.aw")
    public class392 field294;

    @ObfuscatedName("ba.ak")
    public class531 field291;

    public class46(class392 arg0, class392 arg1) {
        new class531(256);
        this.field291 = new class531(256);
        this.field292 = arg0;
        this.field294 = arg1;
    }

    @ObfuscatedName("ba.ap(II[II)Lbt;")
    public class41 method869(int arg0, int arg1, int[] arg2) {
        long var4 = this.method846(arg0, arg1, false);
        class54 var6 = (class54) this.field291.method8993(var4);
        if (var6 != null) {
            return var6.method1062();
        } else if (arg2 == null || arg2[0] > 0) {
            class40 var7 = class40.method753(this.field292, arg0, arg1);
            if (var7 == null) {
                return null;
            }
            class41 var8 = var7.method739();
            this.field291.method8990(new class54(var8), var4);
            if (arg2 != null) {
                arg2[0] -= var8.field242.length;
            }
            return var8;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ba.aw(III)Lcb;")
    public class54 method840(int arg0, int arg1) {
        long var3 = this.method846(arg0, arg1, true);
        class54 var5 = (class54) this.field291.method8993(var3);
        if (var5 != null) {
            return var5;
        }
        class55 var6 = class55.method1068(this.field294, arg0, arg1);
        if (var6 == null) {
            return new class54();
        } else {
            class54 var7 = new class54(var6);
            this.field291.method8990(var7, var3);
            return var7;
        }
    }

    @ObfuscatedName("ba.ak(I[IB)Lbt;")
    public class41 method843(int arg0, int[] arg1) {
        if (this.field292.method7047() == 1) {
            return this.method869(0, arg0, arg1);
        } else if (this.field292.method7004(arg0) == 1) {
            return this.method869(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ba.aj(IB)Lcb;")
    public class54 method841(int arg0) {
        if (this.field294.method7047() == 1) {
            return this.method840(0, arg0);
        } else if (this.field294.method7004(arg0) == 1) {
            return this.method840(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ba.ai(IB)Lbt;")
    public class41 method845(int arg0) {
        return this.method843(arg0, (int[]) null);
    }

    @ObfuscatedName("ba.ay(IIZI)J")
    public long method846(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >> 12);
        int var5 = var4 | arg0 << 16;
        return arg2 ? (long) var5 ^ 0x100000000L : (long) var5;
    }
}

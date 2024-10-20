package deob;

@ObfuscatedName("bh")
public class class46 {

    @ObfuscatedName("bh.aq")
    public class388 field296;

    @ObfuscatedName("bh.ad")
    public class388 field302;

    @ObfuscatedName("bh.ag")
    public class521 field298;

    public class46(class388 arg0, class388 arg1) {
        new class521(256);
        this.field298 = new class521(256);
        this.field296 = arg0;
        this.field302 = arg1;
    }

    @ObfuscatedName("bh.aq(II[IB)Lbl;")
    public class41 method847(int arg0, int arg1, int[] arg2) {
        long var4 = this.method852(arg0, arg1, false);
        class54 var6 = (class54) this.field298.method8464(var4);
        if (var6 != null) {
            return var6.method1026();
        } else if (arg2 == null || arg2[0] > 0) {
            class40 var7 = class40.method765(this.field296, arg0, arg1);
            if (var7 == null) {
                return null;
            }
            class41 var8 = var7.method754();
            this.field298.method8470(new class54(var8), var4);
            if (arg2 != null) {
                arg2[0] -= var8.field248.length;
            }
            return var8;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bh.ad(III)Lcv;")
    public class54 method848(int arg0, int arg1) {
        long var3 = this.method852(arg0, arg1, true);
        class54 var5 = (class54) this.field298.method8464(var3);
        if (var5 != null) {
            return var5;
        }
        class55 var6 = class55.method1038(this.field302, arg0, arg1);
        if (var6 == null) {
            return new class54();
        } else {
            class54 var7 = new class54(var6);
            this.field298.method8470(var7, var3);
            return var7;
        }
    }

    @ObfuscatedName("bh.ag(I[II)Lbl;")
    public class41 method858(int arg0, int[] arg1) {
        if (this.field296.method6561() == 1) {
            return this.method847(0, arg0, arg1);
        } else if (this.field296.method6549(arg0) == 1) {
            return this.method847(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bh.ak(IB)Lcv;")
    public class54 method850(int arg0) {
        if (this.field302.method6561() == 1) {
            return this.method848(0, arg0);
        } else if (this.field302.method6549(arg0) == 1) {
            return this.method848(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bh.ap(IB)Lbl;")
    public class41 method846(int arg0) {
        return this.method858(arg0, (int[]) null);
    }

    @ObfuscatedName("bh.an(IIZB)J")
    public long method852(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >> 12);
        int var5 = var4 | arg0 << 16;
        return arg2 ? (long) var5 ^ 0x100000000L : (long) var5;
    }
}

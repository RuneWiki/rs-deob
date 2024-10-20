package deob;

@ObfuscatedName("bq")
public class class46 {

    @ObfuscatedName("bq.ak")
    public class387 field318;

    @ObfuscatedName("bq.al")
    public class387 field315;

    @ObfuscatedName("bq.aj")
    public class520 field321;

    public class46(class387 arg0, class387 arg1) {
        new class520(256);
        this.field321 = new class520(256);
        this.field318 = arg0;
        this.field315 = arg1;
    }

    @ObfuscatedName("bq.ak(II[IB)Lbr;")
    public class41 method829(int arg0, int arg1, int[] arg2) {
        long var4 = this.method831(arg0, arg1, false);
        class54 var6 = (class54) this.field321.method8528(var4);
        if (var6 != null) {
            return var6.method1002();
        } else if (arg2 == null || arg2[0] > 0) {
            class40 var7 = class40.method750(this.field318, arg0, arg1);
            if (var7 == null) {
                return null;
            }
            class41 var8 = var7.method738();
            this.field321.method8527(new class54(var8), var4);
            if (arg2 != null) {
                arg2[0] -= var8.field269.length;
            }
            return var8;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bq.al(III)Lck;")
    public class54 method839(int arg0, int arg1) {
        long var3 = this.method831(arg0, arg1, true);
        class54 var5 = (class54) this.field321.method8528(var3);
        if (var5 != null) {
            return var5;
        }
        class55 var6 = class55.method1035(this.field315, arg0, arg1);
        if (var6 == null) {
            return new class54();
        } else {
            class54 var7 = new class54(var6);
            this.field321.method8527(var7, var3);
            return var7;
        }
    }

    @ObfuscatedName("bq.aj(I[IB)Lbr;")
    public class41 method848(int arg0, int[] arg1) {
        if (this.field318.method6582() == 1) {
            return this.method829(0, arg0, arg1);
        } else if (this.field318.method6591(arg0) == 1) {
            return this.method829(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bq.az(IB)Lck;")
    public class54 method832(int arg0) {
        if (this.field315.method6582() == 1) {
            return this.method839(0, arg0);
        } else if (this.field315.method6591(arg0) == 1) {
            return this.method839(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bq.af(II)Lbr;")
    public class41 method845(int arg0) {
        return this.method848(arg0, (int[]) null);
    }

    @ObfuscatedName("bq.aa(IIZI)J")
    public long method831(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >> 12);
        int var5 = var4 | arg0 << 16;
        return arg2 ? (long) var5 ^ 0x100000000L : (long) var5;
    }
}

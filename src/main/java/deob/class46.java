package deob;

@ObfuscatedName("bc")
public class class46 {

    @ObfuscatedName("bc.at")
    public class371 field305;

    @ObfuscatedName("bc.ah")
    public class371 field303;

    @ObfuscatedName("bc.ar")
    public class501 field307;

    public class46(class371 arg0, class371 arg1) {
        new class501(256);
        this.field307 = new class501(256);
        this.field305 = arg0;
        this.field303 = arg1;
    }

    @ObfuscatedName("bc.at(II[II)Lbt;")
    public class41 method844(int arg0, int arg1, int[] arg2) {
        long var4 = this.method847(arg0, arg1, false);
        class54 var6 = (class54) this.field307.method8154(var4);
        if (var6 != null) {
            return var6.method1013();
        } else if (arg2 == null || arg2[0] > 0) {
            class40 var7 = class40.method755(this.field305, arg0, arg1);
            if (var7 == null) {
                return null;
            }
            class41 var8 = var7.method761();
            this.field307.method8156(new class54(var8), var4);
            if (arg2 != null) {
                arg2[0] -= var8.field252.length;
            }
            return var8;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bc.ah(IIB)Lcg;")
    public class54 method857(int arg0, int arg1) {
        long var3 = this.method847(arg0, arg1, true);
        class54 var5 = (class54) this.field307.method8154(var3);
        if (var5 != null) {
            return var5;
        }
        class55 var6 = class55.method1034(this.field303, arg0, arg1);
        if (var6 == null) {
            return new class54();
        } else {
            class54 var7 = new class54(var6);
            this.field307.method8156(var7, var3);
            return var7;
        }
    }

    @ObfuscatedName("bc.ar(I[IB)Lbt;")
    public class41 method846(int arg0, int[] arg1) {
        if (this.field305.method6351() == 1) {
            return this.method844(0, arg0, arg1);
        } else if (this.field305.method6294(arg0) == 1) {
            return this.method844(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bc.ao(II)Lcg;")
    public class54 method845(int arg0) {
        if (this.field303.method6351() == 1) {
            return this.method857(0, arg0);
        } else if (this.field303.method6294(arg0) == 1) {
            return this.method857(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bc.ab(IS)Lbt;")
    public class41 method863(int arg0) {
        return this.method846(arg0, (int[]) null);
    }

    @ObfuscatedName("bc.au(IIZI)J")
    public long method847(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >> 12);
        int var5 = var4 | arg0 << 16;
        return arg2 ? (long) var5 ^ 0x100000000L : (long) var5;
    }
}

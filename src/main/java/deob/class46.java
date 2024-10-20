package deob;

@ObfuscatedName("bn")
public class class46 {

    @ObfuscatedName("bn.ab")
    public class389 field301;

    @ObfuscatedName("bn.ay")
    public class389 field293;

    @ObfuscatedName("bn.an")
    public class522 field291;

    public class46(class389 arg0, class389 arg1) {
        new class522(256);
        this.field291 = new class522(256);
        this.field301 = arg0;
        this.field293 = arg1;
    }

    @ObfuscatedName("bn.ab(II[II)Lbq;")
    public class41 method798(int arg0, int arg1, int[] arg2) {
        long var4 = this.method817(arg0, arg1, false);
        class54 var6 = (class54) this.field291.method8544(var4);
        if (var6 != null) {
            return var6.method986();
        } else if (arg2 == null || arg2[0] > 0) {
            class40 var7 = class40.method723(this.field301, arg0, arg1);
            if (var7 == null) {
                return null;
            }
            class41 var8 = var7.method712();
            this.field291.method8551(new class54(var8), var4);
            if (arg2 != null) {
                arg2[0] -= var8.field243.length;
            }
            return var8;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bn.ay(IIB)Lcu;")
    public class54 method797(int arg0, int arg1) {
        long var3 = this.method817(arg0, arg1, true);
        class54 var5 = (class54) this.field291.method8544(var3);
        if (var5 != null) {
            return var5;
        }
        class55 var6 = class55.method1003(this.field293, arg0, arg1);
        if (var6 == null) {
            return new class54();
        } else {
            class54 var7 = new class54(var6);
            this.field291.method8551(var7, var3);
            return var7;
        }
    }

    @ObfuscatedName("bn.an(I[II)Lbq;")
    public class41 method800(int arg0, int[] arg1) {
        if (this.field301.method6649() == 1) {
            return this.method798(0, arg0, arg1);
        } else if (this.field301.method6685(arg0) == 1) {
            return this.method798(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bn.au(II)Lcu;")
    public class54 method801(int arg0) {
        if (this.field293.method6649() == 1) {
            return this.method797(0, arg0);
        } else if (this.field293.method6685(arg0) == 1) {
            return this.method797(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bn.ax(II)Lbq;")
    public class41 method802(int arg0) {
        return this.method800(arg0, (int[]) null);
    }

    @ObfuscatedName("bn.ao(IIZB)J")
    public long method817(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >> 12);
        int var5 = var4 | arg0 << 16;
        return arg2 ? (long) var5 ^ 0x100000000L : (long) var5;
    }
}

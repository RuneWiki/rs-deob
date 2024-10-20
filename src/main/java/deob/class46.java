package deob;

@ObfuscatedName("bq")
public class class46 {

    @ObfuscatedName("bq.az")
    public class379 field312;

    @ObfuscatedName("bq.ah")
    public class379 field306;

    @ObfuscatedName("bq.af")
    public class509 field310;

    public class46(class379 arg0, class379 arg1) {
        new class509(256);
        this.field310 = new class509(256);
        this.field312 = arg0;
        this.field306 = arg1;
    }

    @ObfuscatedName("bq.az(II[II)Lbr;")
    public class41 method797(int arg0, int arg1, int[] arg2) {
        long var4 = this.method802(arg0, arg1, false);
        class54 var6 = (class54) this.field310.method8206(var4);
        if (var6 != null) {
            return var6.method979();
        } else if (arg2 == null || arg2[0] > 0) {
            class40 var7 = class40.method710(this.field312, arg0, arg1);
            if (var7 == null) {
                return null;
            }
            class41 var8 = var7.method720();
            this.field310.method8204(new class54(var8), var4);
            if (arg2 != null) {
                arg2[0] -= var8.field256.length;
            }
            return var8;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bq.ah(III)Lcj;")
    public class54 method807(int arg0, int arg1) {
        long var3 = this.method802(arg0, arg1, true);
        class54 var5 = (class54) this.field310.method8206(var3);
        if (var5 != null) {
            return var5;
        }
        class55 var6 = class55.method996(this.field306, arg0, arg1);
        if (var6 == null) {
            return new class54();
        } else {
            class54 var7 = new class54(var6);
            this.field310.method8204(var7, var3);
            return var7;
        }
    }

    @ObfuscatedName("bq.af(I[IB)Lbr;")
    public class41 method799(int arg0, int[] arg1) {
        if (this.field312.method6339() == 1) {
            return this.method797(0, arg0, arg1);
        } else if (this.field312.method6338(arg0) == 1) {
            return this.method797(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bq.at(IS)Lcj;")
    public class54 method809(int arg0) {
        if (this.field306.method6339() == 1) {
            return this.method807(0, arg0);
        } else if (this.field306.method6338(arg0) == 1) {
            return this.method807(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bq.an(IB)Lbr;")
    public class41 method801(int arg0) {
        return this.method799(arg0, (int[]) null);
    }

    @ObfuscatedName("bq.ao(IIZB)J")
    public long method802(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >> 12);
        int var5 = var4 | arg0 << 16;
        return arg2 ? (long) var5 ^ 0x100000000L : (long) var5;
    }
}

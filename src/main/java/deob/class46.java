package deob;

@ObfuscatedName("bz")
public class class46 {

    @ObfuscatedName("bz.at")
    public class357 field320;

    @ObfuscatedName("bz.an")
    public class357 field324;

    @ObfuscatedName("bz.av")
    public class477 field322;

    public class46(class357 arg0, class357 arg1) {
        new class477(256);
        this.field322 = new class477(256);
        this.field320 = arg0;
        this.field324 = arg1;
    }

    @ObfuscatedName("bz.at(II[II)Lbp;")
    public class41 method797(int arg0, int arg1, int[] arg2) {
        long var4 = this.method802(arg0, arg1, false);
        class54 var6 = (class54) this.field322.method7872(var4);
        if (var6 != null) {
            return var6.method970();
        } else if (arg2 == null || arg2[0] > 0) {
            class40 var7 = class40.method710(this.field320, arg0, arg1);
            if (var7 == null) {
                return null;
            }
            class41 var8 = var7.method711();
            this.field322.method7878(new class54(var8), var4);
            if (arg2 != null) {
                arg2[0] -= var8.field265.length;
            }
            return var8;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bz.an(III)Lcu;")
    public class54 method798(int arg0, int arg1) {
        long var3 = this.method802(arg0, arg1, true);
        class54 var5 = (class54) this.field322.method7872(var3);
        if (var5 == null) {
            class54 var6 = new class54(class55.method990(this.field324, arg0, arg1));
            this.field322.method7878(var6, var3);
            return var6;
        } else {
            return var5;
        }
    }

    @ObfuscatedName("bz.av(I[II)Lbp;")
    public class41 method799(int arg0, int[] arg1) {
        if (this.field320.method6092() == 1) {
            return this.method797(0, arg0, arg1);
        } else if (this.field320.method6135(arg0) == 1) {
            return this.method797(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bz.as(IB)Lcu;")
    public class54 method800(int arg0) {
        if (this.field324.method6092() == 1) {
            return this.method798(0, arg0);
        } else if (this.field324.method6135(arg0) == 1) {
            return this.method798(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bz.ax(II)Lbp;")
    public class41 method801(int arg0) {
        return this.method799(arg0, (int[]) null);
    }

    @ObfuscatedName("bz.ap(IIZI)J")
    public long method802(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >> 12);
        int var5 = var4 | arg0 << 16;
        return arg2 ? (long) var5 ^ 0x100000000L : (long) var5;
    }
}

package deob;

@ObfuscatedName("bh")
public class class46 {

    @ObfuscatedName("bh.aw")
    public class360 field346;

    @ObfuscatedName("bh.ay")
    public class360 field340;

    @ObfuscatedName("bh.ar")
    public class490 field341;

    public class46(class360 arg0, class360 arg1) {
        new class490(256);
        this.field341 = new class490(256);
        this.field346 = arg0;
        this.field340 = arg1;
    }

    @ObfuscatedName("bh.aw(II[II)Lbi;")
    public class41 method828(int arg0, int arg1, int[] arg2) {
        long var4 = this.method833(arg0, arg1, false);
        class54 var6 = (class54) this.field341.method7981(var4);
        if (var6 != null) {
            return var6.method1028();
        } else if (arg2 == null || arg2[0] > 0) {
            class40 var7 = class40.method746(this.field346, arg0, arg1);
            if (var7 == null) {
                return null;
            }
            class41 var8 = var7.method742();
            this.field341.method7990(new class54(var8), var4);
            if (arg2 != null) {
                arg2[0] -= var8.field286.length;
            }
            return var8;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bh.ay(IIB)Lcf;")
    public class54 method848(int arg0, int arg1) {
        long var3 = this.method833(arg0, arg1, true);
        class54 var5 = (class54) this.field341.method7981(var3);
        if (var5 != null) {
            return var5;
        }
        class55 var6 = class55.method1041(this.field340, arg0, arg1);
        if (var6 == null) {
            return new class54();
        } else {
            class54 var7 = new class54(var6);
            this.field341.method7990(var7, var3);
            return var7;
        }
    }

    @ObfuscatedName("bh.ar(I[II)Lbi;")
    public class41 method830(int arg0, int[] arg1) {
        if (this.field346.method6128() == 1) {
            return this.method828(0, arg0, arg1);
        } else if (this.field346.method6127(arg0) == 1) {
            return this.method828(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bh.am(II)Lcf;")
    public class54 method840(int arg0) {
        if (this.field340.method6128() == 1) {
            return this.method848(0, arg0);
        } else if (this.field340.method6127(arg0) == 1) {
            return this.method848(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bh.as(IS)Lbi;")
    public class41 method832(int arg0) {
        return this.method830(arg0, (int[]) null);
    }

    @ObfuscatedName("bh.aj(IIZI)J")
    public long method833(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >> 12);
        int var5 = var4 | arg0 << 16;
        return arg2 ? (long) var5 ^ 0x100000000L : (long) var5;
    }
}

package deob;

@ObfuscatedName("bl")
public class class46 {

    @ObfuscatedName("bl.ac")
    public class374 field336;

    @ObfuscatedName("bl.al")
    public class374 field328;

    @ObfuscatedName("bl.ak")
    public class504 field329;

    public class46(class374 arg0, class374 arg1) {
        new class504(256);
        this.field329 = new class504(256);
        this.field336 = arg0;
        this.field328 = arg1;
    }

    @ObfuscatedName("bl.ac(II[II)Lbs;")
    public class41 method828(int arg0, int arg1, int[] arg2) {
        long var4 = this.method832(arg0, arg1, false);
        class54 var6 = (class54) this.field329.method8104(var4);
        if (var6 != null) {
            return var6.method1005();
        } else if (arg2 == null || arg2[0] > 0) {
            class40 var7 = class40.method739(this.field336, arg0, arg1);
            if (var7 == null) {
                return null;
            }
            class41 var8 = var7.method731();
            this.field329.method8098(new class54(var8), var4);
            if (arg2 != null) {
                arg2[0] -= var8.field279.length;
            }
            return var8;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bl.al(III)Lcu;")
    public class54 method819(int arg0, int arg1) {
        long var3 = this.method832(arg0, arg1, true);
        class54 var5 = (class54) this.field329.method8104(var3);
        if (var5 != null) {
            return var5;
        }
        class55 var6 = class55.method1023(this.field328, arg0, arg1);
        if (var6 == null) {
            return new class54();
        } else {
            class54 var7 = new class54(var6);
            this.field329.method8098(var7, var3);
            return var7;
        }
    }

    @ObfuscatedName("bl.ak(I[IB)Lbs;")
    public class41 method820(int arg0, int[] arg1) {
        if (this.field336.method6274() == 1) {
            return this.method828(0, arg0, arg1);
        } else if (this.field336.method6273(arg0) == 1) {
            return this.method828(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bl.ax(IB)Lcu;")
    public class54 method821(int arg0) {
        if (this.field328.method6274() == 1) {
            return this.method819(0, arg0);
        } else if (this.field328.method6273(arg0) == 1) {
            return this.method819(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bl.ao(IS)Lbs;")
    public class41 method822(int arg0) {
        return this.method820(arg0, (int[]) null);
    }

    @ObfuscatedName("bl.ah(IIZI)J")
    public long method832(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >> 12);
        int var5 = var4 | arg0 << 16;
        return arg2 ? (long) var5 ^ 0x100000000L : (long) var5;
    }
}

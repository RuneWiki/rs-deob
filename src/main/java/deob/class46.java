package deob;

@ObfuscatedName("bo")
public class class46 {

    @ObfuscatedName("bo.ac")
    public class391 field305;

    @ObfuscatedName("bo.ae")
    public class391 field300;

    @ObfuscatedName("bo.ag")
    public class524 field302;

    public class46(class391 arg0, class391 arg1) {
        new class524(256);
        this.field302 = new class524(256);
        this.field305 = arg0;
        this.field300 = arg1;
    }

    @ObfuscatedName("bo.ac(II[II)Lbg;")
    public class41 method845(int arg0, int arg1, int[] arg2) {
        long var4 = this.method860(arg0, arg1, false);
        class54 var6 = (class54) this.field302.method8688(var4);
        if (var6 != null) {
            return var6.method1029();
        } else if (arg2 == null || arg2[0] > 0) {
            class40 var7 = class40.method754(this.field305, arg0, arg1);
            if (var7 == null) {
                return null;
            }
            class41 var8 = var7.method752();
            this.field302.method8690(new class54(var8), var4);
            if (arg2 != null) {
                arg2[0] -= var8.field248.length;
            }
            return var8;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bo.ae(IIB)Lch;")
    public class54 method842(int arg0, int arg1) {
        long var3 = this.method860(arg0, arg1, true);
        class54 var5 = (class54) this.field302.method8688(var3);
        if (var5 != null) {
            return var5;
        }
        class55 var6 = class55.method1045(this.field300, arg0, arg1);
        if (var6 == null) {
            return new class54();
        } else {
            class54 var7 = new class54(var6);
            this.field302.method8690(var7, var3);
            return var7;
        }
    }

    @ObfuscatedName("bo.ag(I[II)Lbg;")
    public class41 method851(int arg0, int[] arg1) {
        if (this.field305.method6793() == 1) {
            return this.method845(0, arg0, arg1);
        } else if (this.field305.method6792(arg0) == 1) {
            return this.method845(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bo.am(II)Lch;")
    public class54 method843(int arg0) {
        if (this.field300.method6793() == 1) {
            return this.method842(0, arg0);
        } else if (this.field300.method6792(arg0) == 1) {
            return this.method842(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bo.ax(II)Lbg;")
    public class41 method844(int arg0) {
        return this.method851(arg0, (int[]) null);
    }

    @ObfuscatedName("bo.aq(IIZB)J")
    public long method860(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >> 12);
        int var5 = var4 | arg0 << 16;
        return arg2 ? (long) var5 ^ 0x100000000L : (long) var5;
    }
}

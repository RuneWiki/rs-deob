package deob;

@ObfuscatedName("ba")
public class class46 {

    @ObfuscatedName("ba.af")
    public class344 field339;

    @ObfuscatedName("ba.an")
    public class344 field334;

    @ObfuscatedName("ba.aw")
    public class465 field335 = new class465(256);

    @ObfuscatedName("ba.ac")
    public class465 field337 = new class465(256);

    public class46(class344 arg0, class344 arg1) {
        this.field339 = arg0;
        this.field334 = arg1;
    }

    @ObfuscatedName("ba.af(II[II)Lbr;")
    public class41 method857(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class41 var8 = (class41) this.field337.method7966(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class40 var9 = class40.method766(this.field339, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class41 var10 = var9.method767();
            this.field337.method7967(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field280.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ba.an(II[IB)Lbr;")
    public class41 method858(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class41 var8 = (class41) this.field337.method7966(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field335.method7966(var6);
            if (var9 == null) {
                var9 = class53.method1018(this.field334, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field335.method7967(var9, var6);
            }
            class41 var10 = var9.method1019(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method7651();
                this.field337.method7967(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ba.aw(I[II)Lbr;")
    public class41 method859(int arg0, int[] arg1) {
        if (this.field339.method6082() == 1) {
            return this.method857(0, arg0, arg1);
        } else if (this.field339.method6081(arg0) == 1) {
            return this.method857(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ba.ac(I[II)Lbr;")
    public class41 method860(int arg0, int[] arg1) {
        if (this.field334.method6082() == 1) {
            return this.method858(0, arg0, arg1);
        } else if (this.field334.method6081(arg0) == 1) {
            return this.method858(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

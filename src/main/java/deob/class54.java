package deob;

@ObfuscatedName("bh")
public class class54 {

    @ObfuscatedName("bh.c")
    public class149 field1115;

    @ObfuscatedName("bh.j")
    public class149 field1116;

    @ObfuscatedName("bh.y")
    public class177 field1117 = new class177(256);

    @ObfuscatedName("bh.r")
    public class177 field1118 = new class177(256);

    public class54(class149 arg0, class149 arg1) {
        this.field1115 = arg0;
        this.field1116 = arg1;
    }

    @ObfuscatedName("bh.c(II[II)Lbg;")
    public class57 method1070(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class57 var8 = (class57) this.field1118.method3206(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = class53.method1058(this.field1115, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class57 var10 = var9.method1057();
            this.field1118.method3207(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1130.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bh.j(II[II)Lbg;")
    public class57 method1067(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class57 var8 = (class57) this.field1118.method3206(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class65 var9 = (class65) this.field1117.method3206(var6);
            if (var9 == null) {
                var9 = class65.method1273(this.field1116, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1117.method3207(var9, var6);
            }
            class57 var10 = var9.method1275(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3334();
                this.field1118.method3207(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bh.y(I[IB)Lbg;")
    public class57 method1077(int arg0, int[] arg1) {
        if (this.field1115.method2757() == 1) {
            return this.method1070(0, arg0, arg1);
        } else if (this.field1115.method2756(arg0) == 1) {
            return this.method1070(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bh.r(I[II)Lbg;")
    public class57 method1071(int arg0, int[] arg1) {
        if (this.field1116.method2757() == 1) {
            return this.method1067(0, arg0, arg1);
        } else if (this.field1116.method2756(arg0) == 1) {
            return this.method1067(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

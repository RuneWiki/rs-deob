package deob;

@ObfuscatedName("cn")
public class class99 {

    @ObfuscatedName("cn.z")
    public class248 field1335;

    @ObfuscatedName("cn.w")
    public class248 field1332;

    @ObfuscatedName("cn.s")
    public class203 field1333 = new class203(256);

    @ObfuscatedName("cn.l")
    public class203 field1334 = new class203(256);

    public class99(class248 arg0, class248 arg1) {
        this.field1335 = arg0;
        this.field1332 = arg1;
    }

    @ObfuscatedName("cn.z(II[IB)Lct;")
    public class94 method2067(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class94 var8 = (class94) this.field1334.method3712(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class92 var9 = class92.method1936(this.field1335, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class94 var10 = var9.method1934();
            this.field1334.method3708(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1279.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("cn.w(II[II)Lct;")
    public class94 method2062(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class94 var8 = (class94) this.field1334.method3712(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class93 var9 = (class93) this.field1333.method3712(var6);
            if (var9 == null) {
                var9 = class93.method1953(this.field1332, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1333.method3708(var9, var6);
            }
            class94 var10 = var9.method1948(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3756();
                this.field1334.method3708(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("cn.s(I[II)Lct;")
    public class94 method2060(int arg0, int[] arg1) {
        if (this.field1335.method4259() == 1) {
            return this.method2067(0, arg0, arg1);
        } else if (this.field1335.method4258(arg0) == 1) {
            return this.method2067(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cn.l(I[II)Lct;")
    public class94 method2064(int arg0, int[] arg1) {
        if (this.field1332.method4259() == 1) {
            return this.method2062(0, arg0, arg1);
        } else if (this.field1332.method4258(arg0) == 1) {
            return this.method2062(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

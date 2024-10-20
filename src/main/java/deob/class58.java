package deob;

@ObfuscatedName("be")
public class class58 {

    @ObfuscatedName("be.j")
    public class152 field1196;

    @ObfuscatedName("be.r")
    public class152 field1199;

    @ObfuscatedName("be.v")
    public class175 field1197 = new class175(256);

    @ObfuscatedName("be.p")
    public class175 field1198 = new class175(256);

    public class58(class152 arg0, class152 arg1) {
        this.field1196 = arg0;
        this.field1199 = arg1;
    }

    @ObfuscatedName("be.j(II[II)Lbx;")
    public class63 method1277(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1198.method3302(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1254(this.field1196, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1260();
            this.field1198.method3318(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1234.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("be.r(II[II)Lbx;")
    public class63 method1272(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1198.method3302(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field1197.method3302(var6);
            if (var9 == null) {
                var9 = class53.method1221(this.field1199, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1197.method3318(var9, var6);
            }
            class63 var10 = var9.method1197(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3359();
                this.field1198.method3318(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("be.v(I[II)Lbx;")
    public class63 method1273(int arg0, int[] arg1) {
        if (this.field1196.method2988() == 1) {
            return this.method1277(0, arg0, arg1);
        } else if (this.field1196.method2969(arg0) == 1) {
            return this.method1277(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("be.p(I[IB)Lbx;")
    public class63 method1270(int arg0, int[] arg1) {
        if (this.field1199.method2988() == 1) {
            return this.method1272(0, arg0, arg1);
        } else if (this.field1199.method2969(arg0) == 1) {
            return this.method1272(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

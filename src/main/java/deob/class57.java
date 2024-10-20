package deob;

@ObfuscatedName("bx")
public class class57 {

    @ObfuscatedName("bx.c")
    public class150 field1181;

    @ObfuscatedName("bx.j")
    public class150 field1182;

    @ObfuscatedName("bx.f")
    public class173 field1183 = new class173(256);

    @ObfuscatedName("bx.y")
    public class173 field1184 = new class173(256);

    public class57(class150 arg0, class150 arg1) {
        this.field1181 = arg0;
        this.field1182 = arg1;
    }

    @ObfuscatedName("bx.c(II[II)Lbm;")
    public class62 method1230(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class62 var8 = (class62) this.field1184.method3129(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class56 var9 = class56.method1216(this.field1181, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class62 var10 = var9.method1211();
            this.field1184.method3137(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1214.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bx.j(II[IB)Lbm;")
    public class62 method1231(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class62 var8 = (class62) this.field1184.method3129(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = (class52) this.field1183.method3129(var6);
            if (var9 == null) {
                var9 = class52.method1141(this.field1182, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1183.method3137(var9, var6);
            }
            class62 var10 = var9.method1161(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3182();
                this.field1184.method3137(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bx.f(I[IB)Lbm;")
    public class62 method1242(int arg0, int[] arg1) {
        if (this.field1181.method2839() == 1) {
            return this.method1230(0, arg0, arg1);
        } else if (this.field1181.method2866(arg0) == 1) {
            return this.method1230(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bx.y(I[IB)Lbm;")
    public class62 method1233(int arg0, int[] arg1) {
        if (this.field1182.method2839() == 1) {
            return this.method1231(0, arg0, arg1);
        } else if (this.field1182.method2866(arg0) == 1) {
            return this.method1231(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

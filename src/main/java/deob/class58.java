package deob;

@ObfuscatedName("ba")
public class class58 {

    @ObfuscatedName("ba.a")
    public class152 field1217;

    @ObfuscatedName("ba.x")
    public class152 field1214;

    @ObfuscatedName("ba.e")
    public class175 field1215 = new class175(256);

    @ObfuscatedName("ba.r")
    public class175 field1213 = new class175(256);

    public class58(class152 arg0, class152 arg1) {
        this.field1217 = arg0;
        this.field1214 = arg1;
    }

    @ObfuscatedName("ba.a(II[IB)Lbu;")
    public class63 method1256(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1213.method3242(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1243(this.field1217, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1244();
            this.field1213.method3234(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1245.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ba.x(II[IS)Lbu;")
    public class63 method1257(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1213.method3242(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field1215.method3242(var6);
            if (var9 == null) {
                var9 = class53.method1194(this.field1214, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1215.method3234(var9, var6);
            }
            class63 var10 = var9.method1196(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3288();
                this.field1213.method3234(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ba.e(I[II)Lbu;")
    public class63 method1258(int arg0, int[] arg1) {
        if (this.field1217.method2948() == 1) {
            return this.method1256(0, arg0, arg1);
        } else if (this.field1217.method2947(arg0) == 1) {
            return this.method1256(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ba.r(I[IB)Lbu;")
    public class63 method1260(int arg0, int[] arg1) {
        if (this.field1214.method2948() == 1) {
            return this.method1257(0, arg0, arg1);
        } else if (this.field1214.method2947(arg0) == 1) {
            return this.method1257(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

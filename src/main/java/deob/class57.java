package deob;

@ObfuscatedName("bp")
public class class57 {

    @ObfuscatedName("bp.v")
    public class151 field1189;

    @ObfuscatedName("bp.f")
    public class151 field1181;

    @ObfuscatedName("bp.n")
    public class174 field1182 = new class174(256);

    @ObfuscatedName("bp.c")
    public class174 field1186 = new class174(256);

    public class57(class151 arg0, class151 arg1) {
        this.field1189 = arg0;
        this.field1181 = arg1;
    }

    @ObfuscatedName("bp.v(II[II)Lbz;")
    public class62 method1291(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class62 var8 = (class62) this.field1186.method3270(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class56 var9 = class56.method1280(this.field1189, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class62 var10 = var9.method1281();
            this.field1186.method3284(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1216.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bp.f(II[IB)Lbz;")
    public class62 method1289(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class62 var8 = (class62) this.field1186.method3270(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = (class52) this.field1182.method3270(var6);
            if (var9 == null) {
                var9 = class52.method1212(this.field1181, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1182.method3284(var9, var6);
            }
            class62 var10 = var9.method1225(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3320();
                this.field1186.method3284(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bp.n(I[IB)Lbz;")
    public class62 method1290(int arg0, int[] arg1) {
        if (this.field1189.method2972() == 1) {
            return this.method1291(0, arg0, arg1);
        } else if (this.field1189.method2971(arg0) == 1) {
            return this.method1291(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bp.c(I[II)Lbz;")
    public class62 method1300(int arg0, int[] arg1) {
        if (this.field1181.method2972() == 1) {
            return this.method1289(0, arg0, arg1);
        } else if (this.field1181.method2971(arg0) == 1) {
            return this.method1289(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

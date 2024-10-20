package deob;

@ObfuscatedName("bl")
public class class57 {

    @ObfuscatedName("bl.u")
    public class151 field1187;

    @ObfuscatedName("bl.k")
    public class151 field1188;

    @ObfuscatedName("bl.x")
    public class174 field1189 = new class174(256);

    @ObfuscatedName("bl.m")
    public class174 field1190 = new class174(256);

    public class57(class151 arg0, class151 arg1) {
        this.field1187 = arg0;
        this.field1188 = arg1;
    }

    @ObfuscatedName("bl.u(II[II)Lbp;")
    public class62 method1264(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class62 var8 = (class62) this.field1190.method3311(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class56 var9 = class56.method1248(this.field1187, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class62 var10 = var9.method1256();
            this.field1190.method3317(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1224.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bl.k(II[IB)Lbp;")
    public class62 method1265(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class62 var8 = (class62) this.field1190.method3311(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = (class52) this.field1189.method3311(var6);
            if (var9 == null) {
                var9 = class52.method1181(this.field1188, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1189.method3317(var9, var6);
            }
            class62 var10 = var9.method1199(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3357();
                this.field1190.method3317(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bl.x(I[IB)Lbp;")
    public class62 method1266(int arg0, int[] arg1) {
        if (this.field1187.method2986() == 1) {
            return this.method1264(0, arg0, arg1);
        } else if (this.field1187.method2975(arg0) == 1) {
            return this.method1264(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bl.m(I[IB)Lbp;")
    public class62 method1267(int arg0, int[] arg1) {
        if (this.field1188.method2986() == 1) {
            return this.method1265(0, arg0, arg1);
        } else if (this.field1188.method2975(arg0) == 1) {
            return this.method1265(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

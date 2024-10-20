package deob;

@ObfuscatedName("bm")
public class class60 {

    @ObfuscatedName("bm.j")
    public class168 field1204;

    @ObfuscatedName("bm.h")
    public class168 field1198;

    @ObfuscatedName("bm.m")
    public class197 field1200 = new class197(256);

    @ObfuscatedName("bm.z")
    public class197 field1201 = new class197(256);

    public class60(class168 arg0, class168 arg1) {
        this.field1204 = arg0;
        this.field1198 = arg1;
    }

    @ObfuscatedName("bm.j(II[IB)Lbc;")
    public class63 method1216(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1201.method3498(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1201(this.field1204, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1210();
            this.field1201.method3499(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1214.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.h(II[II)Lbc;")
    public class63 method1213(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1201.method3498(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1200.method3498(var6);
            if (var9 == null) {
                var9 = class71.method1432(this.field1198, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1200.method3499(var9, var6);
            }
            class63 var10 = var9.method1438(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3639();
                this.field1201.method3499(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.m(I[II)Lbc;")
    public class63 method1214(int arg0, int[] arg1) {
        if (this.field1204.method3044() == 1) {
            return this.method1216(0, arg0, arg1);
        } else if (this.field1204.method3021(arg0) == 1) {
            return this.method1216(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bm.z(I[II)Lbc;")
    public class63 method1215(int arg0, int[] arg1) {
        if (this.field1198.method3044() == 1) {
            return this.method1213(0, arg0, arg1);
        } else if (this.field1198.method3021(arg0) == 1) {
            return this.method1213(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

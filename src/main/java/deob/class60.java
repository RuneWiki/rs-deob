package deob;

@ObfuscatedName("bw")
public class class60 {

    @ObfuscatedName("bw.e")
    public class168 field1189;

    @ObfuscatedName("bw.w")
    public class168 field1193;

    @ObfuscatedName("bw.f")
    public class197 field1187 = new class197(256);

    @ObfuscatedName("bw.s")
    public class197 field1188 = new class197(256);

    public class60(class168 arg0, class168 arg1) {
        this.field1189 = arg0;
        this.field1193 = arg1;
    }

    @ObfuscatedName("bw.e(II[IB)Lbu;")
    public class63 method1214(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1188.method3507(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1197(this.field1189, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1199();
            this.field1188.method3508(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1204.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.w(II[IB)Lbu;")
    public class63 method1207(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1188.method3507(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1187.method3507(var6);
            if (var9 == null) {
                var9 = class71.method1419(this.field1193, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1187.method3508(var9, var6);
            }
            class63 var10 = var9.method1429(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3632();
                this.field1188.method3508(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.f(I[II)Lbu;")
    public class63 method1208(int arg0, int[] arg1) {
        if (this.field1189.method3025() == 1) {
            return this.method1214(0, arg0, arg1);
        } else if (this.field1189.method3075(arg0) == 1) {
            return this.method1214(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bw.s(I[II)Lbu;")
    public class63 method1209(int arg0, int[] arg1) {
        if (this.field1193.method3025() == 1) {
            return this.method1207(0, arg0, arg1);
        } else if (this.field1193.method3075(arg0) == 1) {
            return this.method1207(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

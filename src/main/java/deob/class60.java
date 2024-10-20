package deob;

@ObfuscatedName("by")
public class class60 {

    @ObfuscatedName("by.i")
    public class167 field1222;

    @ObfuscatedName("by.v")
    public class167 field1220;

    @ObfuscatedName("by.r")
    public class196 field1219 = new class196(256);

    @ObfuscatedName("by.n")
    public class196 field1226 = new class196(256);

    public class60(class167 arg0, class167 arg1) {
        this.field1222 = arg0;
        this.field1220 = arg1;
    }

    @ObfuscatedName("by.i(II[II)Lbx;")
    public class63 method1256(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1226.method3496(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1240(this.field1222, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1235();
            this.field1226.method3497(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1238.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("by.v(II[IB)Lbx;")
    public class63 method1252(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1226.method3496(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1219.method3496(var6);
            if (var9 == null) {
                var9 = class71.method1479(this.field1220, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1219.method3497(var9, var6);
            }
            class63 var10 = var9.method1468(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3626();
                this.field1226.method3497(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("by.r(I[II)Lbx;")
    public class63 method1253(int arg0, int[] arg1) {
        if (this.field1222.method3050() == 1) {
            return this.method1256(0, arg0, arg1);
        } else if (this.field1222.method3044(arg0) == 1) {
            return this.method1256(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("by.n(I[II)Lbx;")
    public class63 method1254(int arg0, int[] arg1) {
        if (this.field1220.method3050() == 1) {
            return this.method1252(0, arg0, arg1);
        } else if (this.field1220.method3044(arg0) == 1) {
            return this.method1252(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

package deob;

@ObfuscatedName("bh")
public class class60 {

    @ObfuscatedName("bh.s")
    public class168 field1225;

    @ObfuscatedName("bh.j")
    public class168 field1222;

    @ObfuscatedName("bh.p")
    public class197 field1221 = new class197(256);

    @ObfuscatedName("bh.x")
    public class197 field1227 = new class197(256);

    public class60(class168 arg0, class168 arg1) {
        this.field1225 = arg0;
        this.field1222 = arg1;
    }

    @ObfuscatedName("bh.s(II[II)Lba;")
    public class63 method1191(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1227.method3518(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1187(this.field1225, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1181();
            this.field1227.method3519(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1238.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bh.j(II[II)Lba;")
    public class63 method1194(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1227.method3518(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1221.method3518(var6);
            if (var9 == null) {
                var9 = class71.method1426(this.field1222, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1221.method3519(var9, var6);
            }
            class63 var10 = var9.method1425(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3639();
                this.field1227.method3519(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bh.p(I[II)Lba;")
    public class63 method1193(int arg0, int[] arg1) {
        if (this.field1225.method3025() == 1) {
            return this.method1191(0, arg0, arg1);
        } else if (this.field1225.method3024(arg0) == 1) {
            return this.method1191(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bh.x(I[II)Lba;")
    public class63 method1197(int arg0, int[] arg1) {
        if (this.field1222.method3025() == 1) {
            return this.method1194(0, arg0, arg1);
        } else if (this.field1222.method3024(arg0) == 1) {
            return this.method1194(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

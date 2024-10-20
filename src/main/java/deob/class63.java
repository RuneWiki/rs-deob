package deob;

@ObfuscatedName("bm")
public class class63 {

    @ObfuscatedName("bm.s")
    public class171 field1258;

    @ObfuscatedName("bm.z")
    public class171 field1259;

    @ObfuscatedName("bm.t")
    public class200 field1260 = new class200(256);

    @ObfuscatedName("bm.y")
    public class200 field1261 = new class200(256);

    public class63(class171 arg0, class171 arg1) {
        this.field1258 = arg0;
        this.field1259 = arg1;
    }

    @ObfuscatedName("bm.s(II[II)Lbs;")
    public class66 method1244(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class66 var8 = (class66) this.field1261.method3555(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class62 var9 = class62.method1239(this.field1258, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class66 var10 = var9.method1230();
            this.field1261.method3556(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1274.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.z(II[IB)Lbs;")
    public class66 method1245(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class66 var8 = (class66) this.field1261.method3555(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class74 var9 = (class74) this.field1260.method3555(var6);
            if (var9 == null) {
                var9 = class74.method1475(this.field1259, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1260.method3556(var9, var6);
            }
            class66 var10 = var9.method1490(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3699();
                this.field1261.method3556(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.t(I[IB)Lbs;")
    public class66 method1246(int arg0, int[] arg1) {
        if (this.field1258.method3146() == 1) {
            return this.method1244(0, arg0, arg1);
        } else if (this.field1258.method3079(arg0) == 1) {
            return this.method1244(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bm.y(I[II)Lbs;")
    public class66 method1247(int arg0, int[] arg1) {
        if (this.field1259.method3146() == 1) {
            return this.method1245(0, arg0, arg1);
        } else if (this.field1259.method3079(arg0) == 1) {
            return this.method1245(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

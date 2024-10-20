package deob;

@ObfuscatedName("bm")
public class class60 {

    @ObfuscatedName("bm.d")
    public class167 field1221;

    @ObfuscatedName("bm.p")
    public class167 field1217;

    @ObfuscatedName("bm.v")
    public class196 field1218 = new class196(256);

    @ObfuscatedName("bm.l")
    public class196 field1219 = new class196(256);

    public class60(class167 arg0, class167 arg1) {
        this.field1221 = arg0;
        this.field1217 = arg1;
    }

    @ObfuscatedName("bm.d(II[II)Lbh;")
    public class63 method1220(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1219.method3588(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1201(this.field1221, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1206();
            this.field1219.method3596(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1236.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.p(II[II)Lbh;")
    public class63 method1217(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1219.method3588(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1218.method3588(var6);
            if (var9 == null) {
                var9 = class71.method1447(this.field1217, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1218.method3596(var9, var6);
            }
            class63 var10 = var9.method1443(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3715();
                this.field1219.method3596(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.v(I[IS)Lbh;")
    public class63 method1214(int arg0, int[] arg1) {
        if (this.field1221.method3164() == 1) {
            return this.method1220(0, arg0, arg1);
        } else if (this.field1221.method3101(arg0) == 1) {
            return this.method1220(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bm.l(I[II)Lbh;")
    public class63 method1218(int arg0, int[] arg1) {
        if (this.field1217.method3164() == 1) {
            return this.method1217(0, arg0, arg1);
        } else if (this.field1217.method3101(arg0) == 1) {
            return this.method1217(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

package deob;

@ObfuscatedName("bk")
public class class59 {

    @ObfuscatedName("bk.e")
    public class155 field1228;

    @ObfuscatedName("bk.i")
    public class155 field1221;

    @ObfuscatedName("bk.k")
    public class177 field1222 = new class177(256);

    @ObfuscatedName("bk.q")
    public class177 field1223 = new class177(256);

    public class59(class155 arg0, class155 arg1) {
        this.field1228 = arg0;
        this.field1221 = arg1;
    }

    @ObfuscatedName("bk.e(II[II)Lbs;")
    public class64 method1327(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class64 var8 = (class64) this.field1223.method3314(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class58 var9 = class58.method1307(this.field1228, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class64 var10 = var9.method1303();
            this.field1223.method3311(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1256.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bk.i(II[II)Lbs;")
    public class64 method1319(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class64 var8 = (class64) this.field1223.method3314(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = (class54) this.field1222.method3314(var6);
            if (var9 == null) {
                var9 = class54.method1244(this.field1221, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1222.method3311(var9, var6);
            }
            class64 var10 = var9.method1242(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3366();
                this.field1223.method3311(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bk.k(I[II)Lbs;")
    public class64 method1320(int arg0, int[] arg1) {
        if (this.field1228.method3031() == 1) {
            return this.method1327(0, arg0, arg1);
        } else if (this.field1228.method3019(arg0) == 1) {
            return this.method1327(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bk.q(I[II)Lbs;")
    public class64 method1321(int arg0, int[] arg1) {
        if (this.field1221.method3031() == 1) {
            return this.method1319(0, arg0, arg1);
        } else if (this.field1221.method3019(arg0) == 1) {
            return this.method1319(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

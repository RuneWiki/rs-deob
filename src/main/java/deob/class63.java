package deob;

@ObfuscatedName("bw")
public class class63 {

    @ObfuscatedName("bw.l")
    public class171 field1286;

    @ObfuscatedName("bw.g")
    public class171 field1289;

    @ObfuscatedName("bw.r")
    public class200 field1287 = new class200(256);

    @ObfuscatedName("bw.e")
    public class200 field1288 = new class200(256);

    public class63(class171 arg0, class171 arg1) {
        this.field1286 = arg0;
        this.field1289 = arg1;
    }

    @ObfuscatedName("bw.l(II[II)Lbz;")
    public class66 method1360(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class66 var8 = (class66) this.field1288.method3684(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class62 var9 = class62.method1355(this.field1286, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class66 var10 = var9.method1344();
            this.field1288.method3688(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1305.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.g(II[II)Lbz;")
    public class66 method1358(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class66 var8 = (class66) this.field1288.method3684(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class74 var9 = (class74) this.field1287.method3684(var6);
            if (var9 == null) {
                var9 = class74.method1563(this.field1289, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1287.method3688(var9, var6);
            }
            class66 var10 = var9.method1564(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3815();
                this.field1288.method3688(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.r(I[II)Lbz;")
    public class66 method1361(int arg0, int[] arg1) {
        if (this.field1286.method3205() == 1) {
            return this.method1360(0, arg0, arg1);
        } else if (this.field1286.method3204(arg0) == 1) {
            return this.method1360(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bw.e(I[II)Lbz;")
    public class66 method1362(int arg0, int[] arg1) {
        if (this.field1289.method3205() == 1) {
            return this.method1358(0, arg0, arg1);
        } else if (this.field1289.method3204(arg0) == 1) {
            return this.method1358(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

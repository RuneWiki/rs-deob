package deob;

@ObfuscatedName("bm")
public class class58 {

    @ObfuscatedName("bm.l")
    public class154 field1196;

    @ObfuscatedName("bm.b")
    public class154 field1193;

    @ObfuscatedName("bm.o")
    public class176 field1202 = new class176(256);

    @ObfuscatedName("bm.w")
    public class176 field1195 = new class176(256);

    public class58(class154 arg0, class154 arg1) {
        this.field1196 = arg0;
        this.field1193 = arg1;
    }

    @ObfuscatedName("bm.l(II[II)Lbl;")
    public class63 method1270(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1195.method3300(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1260(this.field1196, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1261();
            this.field1195.method3301(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1228.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.b(II[II)Lbl;")
    public class63 method1271(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1195.method3300(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field1202.method3300(var6);
            if (var9 == null) {
                var9 = class53.method1200(this.field1193, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1202.method3301(var9, var6);
            }
            class63 var10 = var9.method1206(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3360();
                this.field1195.method3301(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.o(I[IB)Lbl;")
    public class63 method1285(int arg0, int[] arg1) {
        if (this.field1196.method3026() == 1) {
            return this.method1270(0, arg0, arg1);
        } else if (this.field1196.method3074(arg0) == 1) {
            return this.method1270(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bm.w(I[II)Lbl;")
    public class63 method1272(int arg0, int[] arg1) {
        if (this.field1193.method3026() == 1) {
            return this.method1271(0, arg0, arg1);
        } else if (this.field1193.method3074(arg0) == 1) {
            return this.method1271(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

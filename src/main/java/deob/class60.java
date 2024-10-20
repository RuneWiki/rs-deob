package deob;

@ObfuscatedName("bk")
public class class60 {

    @ObfuscatedName("bk.l")
    public class167 field1201;

    @ObfuscatedName("bk.e")
    public class167 field1206;

    @ObfuscatedName("bk.q")
    public class196 field1199 = new class196(256);

    @ObfuscatedName("bk.o")
    public class196 field1200 = new class196(256);

    public class60(class167 arg0, class167 arg1) {
        this.field1201 = arg0;
        this.field1206 = arg1;
    }

    @ObfuscatedName("bk.l(II[II)Lbl;")
    public class63 method1252(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1200.method3509(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1232(this.field1201, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1229();
            this.field1200.method3518(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1217.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bk.e(II[II)Lbl;")
    public class63 method1259(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1200.method3509(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1199.method3509(var6);
            if (var9 == null) {
                var9 = class71.method1466(this.field1206, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1199.method3518(var9, var6);
            }
            class63 var10 = var9.method1465(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3620();
                this.field1200.method3518(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bk.q(I[II)Lbl;")
    public class63 method1247(int arg0, int[] arg1) {
        if (this.field1201.method3106() == 1) {
            return this.method1252(0, arg0, arg1);
        } else if (this.field1201.method3085(arg0) == 1) {
            return this.method1252(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bk.o(I[II)Lbl;")
    public class63 method1248(int arg0, int[] arg1) {
        if (this.field1206.method3106() == 1) {
            return this.method1259(0, arg0, arg1);
        } else if (this.field1206.method3085(arg0) == 1) {
            return this.method1259(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

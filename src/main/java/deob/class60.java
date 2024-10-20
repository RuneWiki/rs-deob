package deob;

@ObfuscatedName("bb")
public class class60 {

    @ObfuscatedName("bb.z")
    public class167 field1214;

    @ObfuscatedName("bb.q")
    public class167 field1218;

    @ObfuscatedName("bb.k")
    public class196 field1215 = new class196(256);

    @ObfuscatedName("bb.f")
    public class196 field1216 = new class196(256);

    public class60(class167 arg0, class167 arg1) {
        this.field1214 = arg0;
        this.field1218 = arg1;
    }

    @ObfuscatedName("bb.z(II[II)Lba;")
    public class63 method1187(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1216.method3462(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1181(this.field1214, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1182();
            this.field1216.method3470(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1228.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bb.q(II[II)Lba;")
    public class63 method1186(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1216.method3462(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1215.method3462(var6);
            if (var9 == null) {
                var9 = class71.method1405(this.field1218, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1215.method3470(var9, var6);
            }
            class63 var10 = var9.method1406(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3583();
                this.field1216.method3470(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bb.k(I[II)Lba;")
    public class63 method1194(int arg0, int[] arg1) {
        if (this.field1214.method3029() == 1) {
            return this.method1187(0, arg0, arg1);
        } else if (this.field1214.method2996(arg0) == 1) {
            return this.method1187(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bb.f(I[II)Lba;")
    public class63 method1195(int arg0, int[] arg1) {
        if (this.field1218.method3029() == 1) {
            return this.method1186(0, arg0, arg1);
        } else if (this.field1218.method2996(arg0) == 1) {
            return this.method1186(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

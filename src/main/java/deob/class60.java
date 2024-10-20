package deob;

@ObfuscatedName("bw")
public class class60 {

    @ObfuscatedName("bw.i")
    public class167 field1212;

    @ObfuscatedName("bw.v")
    public class167 field1211;

    @ObfuscatedName("bw.f")
    public class196 field1215 = new class196(256);

    @ObfuscatedName("bw.h")
    public class196 field1213 = new class196(256);

    public class60(class167 arg0, class167 arg1) {
        this.field1212 = arg0;
        this.field1211 = arg1;
    }

    @ObfuscatedName("bw.i(II[IS)Lbk;")
    public class63 method1177(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1213.method3509(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1165(this.field1212, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1166();
            this.field1213.method3495(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1229.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.v(II[IB)Lbk;")
    public class63 method1179(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1213.method3509(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1215.method3509(var6);
            if (var9 == null) {
                var9 = class71.method1409(this.field1211, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1215.method3495(var9, var6);
            }
            class63 var10 = var9.method1428(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3624();
                this.field1213.method3495(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.f(I[II)Lbk;")
    public class63 method1180(int arg0, int[] arg1) {
        if (this.field1212.method3029() == 1) {
            return this.method1177(0, arg0, arg1);
        } else if (this.field1212.method3078(arg0) == 1) {
            return this.method1177(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bw.h(I[II)Lbk;")
    public class63 method1181(int arg0, int[] arg1) {
        if (this.field1211.method3029() == 1) {
            return this.method1179(0, arg0, arg1);
        } else if (this.field1211.method3078(arg0) == 1) {
            return this.method1179(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

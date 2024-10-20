package deob;

@ObfuscatedName("bk")
public class class60 {

    @ObfuscatedName("bk.j")
    public class167 field1227;

    @ObfuscatedName("bk.l")
    public class167 field1222;

    @ObfuscatedName("bk.a")
    public class196 field1224 = new class196(256);

    @ObfuscatedName("bk.i")
    public class196 field1223 = new class196(256);

    public class60(class167 arg0, class167 arg1) {
        this.field1227 = arg0;
        this.field1222 = arg1;
    }

    @ObfuscatedName("bk.j(II[IB)Lbj;")
    public class63 method1228(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1223.method3499(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1210(this.field1227, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1215();
            this.field1223.method3501(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1240.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bk.l(II[II)Lbj;")
    public class63 method1219(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1223.method3499(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1224.method3499(var6);
            if (var9 == null) {
                var9 = class71.method1439(this.field1222, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1224.method3501(var9, var6);
            }
            class63 var10 = var9.method1441(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3608();
                this.field1223.method3501(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bk.a(I[IB)Lbj;")
    public class63 method1217(int arg0, int[] arg1) {
        if (this.field1227.method3037() == 1) {
            return this.method1228(0, arg0, arg1);
        } else if (this.field1227.method3015(arg0) == 1) {
            return this.method1228(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bk.i(I[II)Lbj;")
    public class63 method1221(int arg0, int[] arg1) {
        if (this.field1222.method3037() == 1) {
            return this.method1219(0, arg0, arg1);
        } else if (this.field1222.method3015(arg0) == 1) {
            return this.method1219(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

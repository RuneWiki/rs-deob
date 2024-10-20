package deob;

@ObfuscatedName("bk")
public class class60 {

    @ObfuscatedName("bk.h")
    public class167 field1223;

    @ObfuscatedName("bk.q")
    public class167 field1214;

    @ObfuscatedName("bk.v")
    public class196 field1222 = new class196(256);

    @ObfuscatedName("bk.n")
    public class196 field1217 = new class196(256);

    public class60(class167 arg0, class167 arg1) {
        this.field1223 = arg0;
        this.field1214 = arg1;
    }

    @ObfuscatedName("bk.h(II[II)Lbl;")
    public class63 method1250(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1217.method3584(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1226(this.field1223, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1214();
            this.field1217.method3575(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1237.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bk.q(II[II)Lbl;")
    public class63 method1233(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1217.method3584(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1222.method3584(var6);
            if (var9 == null) {
                var9 = class71.method1452(this.field1214, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1222.method3575(var9, var6);
            }
            class63 var10 = var9.method1445(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3711();
                this.field1217.method3575(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bk.v(I[II)Lbl;")
    public class63 method1236(int arg0, int[] arg1) {
        if (this.field1223.method3083() == 1) {
            return this.method1250(0, arg0, arg1);
        } else if (this.field1223.method3092(arg0) == 1) {
            return this.method1250(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bk.n(I[II)Lbl;")
    public class63 method1237(int arg0, int[] arg1) {
        if (this.field1214.method3083() == 1) {
            return this.method1233(0, arg0, arg1);
        } else if (this.field1214.method3092(arg0) == 1) {
            return this.method1233(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

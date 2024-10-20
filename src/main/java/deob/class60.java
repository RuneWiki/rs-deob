package deob;

@ObfuscatedName("bl")
public class class60 {

    @ObfuscatedName("bl.f")
    public class167 field1225;

    @ObfuscatedName("bl.s")
    public class167 field1222;

    @ObfuscatedName("bl.q")
    public class196 field1220 = new class196(256);

    @ObfuscatedName("bl.g")
    public class196 field1221 = new class196(256);

    public class60(class167 arg0, class167 arg1) {
        this.field1225 = arg0;
        this.field1222 = arg1;
    }

    @ObfuscatedName("bl.f(II[IB)Lbf;")
    public class63 method1222(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1221.method3532(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1219(this.field1225, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1213();
            this.field1221.method3534(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1236.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bl.s(II[IB)Lbf;")
    public class63 method1223(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1221.method3532(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1220.method3532(var6);
            if (var9 == null) {
                var9 = class71.method1455(this.field1222, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1220.method3534(var9, var6);
            }
            class63 var10 = var9.method1461(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3665();
                this.field1221.method3534(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bl.q(I[II)Lbf;")
    public class63 method1224(int arg0, int[] arg1) {
        if (this.field1225.method3119() == 1) {
            return this.method1222(0, arg0, arg1);
        } else if (this.field1225.method3047(arg0) == 1) {
            return this.method1222(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bl.g(I[II)Lbf;")
    public class63 method1232(int arg0, int[] arg1) {
        if (this.field1222.method3119() == 1) {
            return this.method1223(0, arg0, arg1);
        } else if (this.field1222.method3047(arg0) == 1) {
            return this.method1223(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

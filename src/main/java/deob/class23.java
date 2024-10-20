package deob;

@ObfuscatedName("a")
public class class23 {

    @ObfuscatedName("a.r")
    public class86 field313;

    @ObfuscatedName("a.d")
    public class86 field311;

    @ObfuscatedName("a.l")
    public class103 field310 = new class103(256);

    @ObfuscatedName("a.m")
    public class103 field312 = new class103(256);

    public class23(class86 arg0, class86 arg1) {
        this.field313 = arg0;
        this.field311 = arg1;
    }

    @ObfuscatedName("a.r(II[II)Leq;")
    public class145 method303(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class145 var8 = (class145) this.field312.method1277(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class22 var9 = class22.method294(this.field313, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class145 var10 = var9.method291();
            this.field312.method1278(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field2204.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("a.d(II[II)Leq;")
    public class145 method304(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class145 var8 = (class145) this.field312.method1277(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class130 var9 = (class130) this.field310.method1277(var6);
            if (var9 == null) {
                var9 = class130.method1543(this.field311, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field310.method1278(var9, var6);
            }
            class145 var10 = var9.method1539(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method1325();
                this.field312.method1278(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("a.l(I[II)Leq;")
    public class145 method305(int arg0, int[] arg1) {
        if (this.field313.method1055() == 1) {
            return this.method303(0, arg0, arg1);
        } else if (this.field313.method1054(arg0) == 1) {
            return this.method303(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("a.m(I[II)Leq;")
    public class145 method309(int arg0, int[] arg1) {
        if (this.field311.method1055() == 1) {
            return this.method304(0, arg0, arg1);
        } else if (this.field311.method1054(arg0) == 1) {
            return this.method304(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

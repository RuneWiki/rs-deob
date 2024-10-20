package deob;

@ObfuscatedName("y")
public class class23 {

    @ObfuscatedName("y.t")
    public class86 field307;

    @ObfuscatedName("y.n")
    public class86 field309;

    @ObfuscatedName("y.q")
    public class103 field306 = new class103(256);

    @ObfuscatedName("y.h")
    public class103 field308 = new class103(256);

    public class23(class86 arg0, class86 arg1) {
        this.field307 = arg0;
        this.field309 = arg1;
    }

    @ObfuscatedName("y.t(II[II)Lee;")
    public class145 method293(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class145 var8 = (class145) this.field308.method1259(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class22 var9 = class22.method289(this.field307, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class145 var10 = var9.method285();
            this.field308.method1265(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field2199.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("y.n(II[IB)Lee;")
    public class145 method295(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class145 var8 = (class145) this.field308.method1259(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class130 var9 = (class130) this.field306.method1259(var6);
            if (var9 == null) {
                var9 = class130.method1514(this.field309, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field306.method1265(var9, var6);
            }
            class145 var10 = var9.method1525(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method1307();
                this.field308.method1265(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("y.q(I[IB)Lee;")
    public class145 method296(int arg0, int[] arg1) {
        if (this.field307.method1026() == 1) {
            return this.method293(0, arg0, arg1);
        } else if (this.field307.method1025(arg0) == 1) {
            return this.method293(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("y.h(I[IB)Lee;")
    public class145 method294(int arg0, int[] arg1) {
        if (this.field309.method1026() == 1) {
            return this.method295(0, arg0, arg1);
        } else if (this.field309.method1025(arg0) == 1) {
            return this.method295(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

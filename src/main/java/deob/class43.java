package deob;

@ObfuscatedName("ax")
public class class43 {

    @ObfuscatedName("ax.c")
    public class317 field337;

    @ObfuscatedName("ax.p")
    public class317 field330;

    @ObfuscatedName("ax.f")
    public class422 field333 = new class422(256);

    @ObfuscatedName("ax.n")
    public class422 field332 = new class422(256);

    public class43(class317 arg0, class317 arg1) {
        this.field337 = arg0;
        this.field330 = arg1;
    }

    @ObfuscatedName("ax.c(II[II)Lab;")
    public class38 method801(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class38 var8 = (class38) this.field332.method6941(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class37 var9 = class37.method685(this.field337, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class38 var10 = var9.method686();
            this.field332.method6948(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field273.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ax.p(II[IB)Lab;")
    public class38 method794(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class38 var8 = (class38) this.field332.method6941(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class50 var9 = (class50) this.field333.method6941(var6);
            if (var9 == null) {
                var9 = class50.method996(this.field330, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field333.method6948(var9, var6);
            }
            class38 var10 = var9.method997(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method6657();
                this.field332.method6948(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ax.f(I[II)Lab;")
    public class38 method795(int arg0, int[] arg1) {
        if (this.field337.method5426() == 1) {
            return this.method801(0, arg0, arg1);
        } else if (this.field337.method5425(arg0) == 1) {
            return this.method801(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ax.n(I[IB)Lab;")
    public class38 method796(int arg0, int[] arg1) {
        if (this.field330.method5426() == 1) {
            return this.method794(0, arg0, arg1);
        } else if (this.field330.method5425(arg0) == 1) {
            return this.method794(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

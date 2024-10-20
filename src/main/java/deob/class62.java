package deob;

@ObfuscatedName("bf")
public class class62 {

    @ObfuscatedName("bf.d")
    public class185 field1071;

    @ObfuscatedName("bf.c")
    public class185 field1069;

    @ObfuscatedName("bf.n")
    public class147 field1070 = new class147(256);

    @ObfuscatedName("bf.q")
    public class147 field1072 = new class147(256);

    public class62(class185 arg0, class185 arg1) {
        this.field1071 = arg0;
        this.field1069 = arg1;
    }

    @ObfuscatedName("bf.d(II[IS)Lbo;")
    public class56 method1115(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1072.method2611(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method965(this.field1071, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method963();
            this.field1072.method2612(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1013.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bf.c(II[II)Lbo;")
    public class56 method1116(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1072.method2611(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class55 var9 = (class55) this.field1070.method2611(var6);
            if (var9 == null) {
                var9 = class55.method983(this.field1069, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1070.method2612(var9, var6);
            }
            class56 var10 = var9.method985(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method2652();
                this.field1072.method2612(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bf.n(I[II)Lbo;")
    public class56 method1124(int arg0, int[] arg1) {
        if (this.field1071.method3098() == 1) {
            return this.method1115(0, arg0, arg1);
        } else if (this.field1071.method3097(arg0) == 1) {
            return this.method1115(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bf.q(I[II)Lbo;")
    public class56 method1128(int arg0, int[] arg1) {
        if (this.field1069.method3098() == 1) {
            return this.method1116(0, arg0, arg1);
        } else if (this.field1069.method3097(arg0) == 1) {
            return this.method1116(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

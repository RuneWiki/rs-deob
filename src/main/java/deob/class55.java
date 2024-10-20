package deob;

@ObfuscatedName("bm")
public class class55 {

    @ObfuscatedName("bm.e")
    public class158 field1099;

    @ObfuscatedName("bm.a")
    public class158 field1095;

    @ObfuscatedName("bm.l")
    public class186 field1094 = new class186(256);

    @ObfuscatedName("bm.c")
    public class186 field1097 = new class186(256);

    public class55(class158 arg0, class158 arg1) {
        this.field1099 = arg0;
        this.field1095 = arg1;
    }

    @ObfuscatedName("bm.e(II[II)Lbe;")
    public class58 method1110(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class58 var8 = (class58) this.field1097.method3339(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method1087(this.field1099, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class58 var10 = var9.method1086();
            this.field1097.method3338(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1111.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.a(II[II)Lbe;")
    public class58 method1098(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class58 var8 = (class58) this.field1097.method3339(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class66 var9 = (class66) this.field1094.method3339(var6);
            if (var9 == null) {
                var9 = class66.method1324(this.field1095, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1094.method3338(var9, var6);
            }
            class58 var10 = var9.method1326(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3463();
                this.field1097.method3338(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.l(I[IS)Lbe;")
    public class58 method1103(int arg0, int[] arg1) {
        if (this.field1099.method2854() == 1) {
            return this.method1110(0, arg0, arg1);
        } else if (this.field1099.method2864(arg0) == 1) {
            return this.method1110(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bm.c(I[II)Lbe;")
    public class58 method1111(int arg0, int[] arg1) {
        if (this.field1095.method2854() == 1) {
            return this.method1098(0, arg0, arg1);
        } else if (this.field1095.method2864(arg0) == 1) {
            return this.method1098(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

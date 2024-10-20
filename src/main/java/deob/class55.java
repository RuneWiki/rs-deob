package deob;

@ObfuscatedName("bw")
public class class55 {

    @ObfuscatedName("bw.n")
    public class158 field1149;

    @ObfuscatedName("bw.d")
    public class158 field1147;

    @ObfuscatedName("bw.z")
    public class187 field1148 = new class187(256);

    @ObfuscatedName("bw.y")
    public class187 field1146 = new class187(256);

    public class55(class158 arg0, class158 arg1) {
        this.field1149 = arg0;
        this.field1147 = arg1;
    }

    @ObfuscatedName("bw.n(II[II)Lba;")
    public class58 method1115(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class58 var8 = (class58) this.field1146.method3445(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class54 var9 = class54.method1103(this.field1149, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class58 var10 = var9.method1104();
            this.field1146.method3446(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1168.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.d(II[II)Lba;")
    public class58 method1118(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class58 var8 = (class58) this.field1146.method3445(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class66 var9 = (class66) this.field1148.method3445(var6);
            if (var9 == null) {
                var9 = class66.method1370(this.field1147, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1148.method3446(var9, var6);
            }
            class58 var10 = var9.method1346(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3562();
                this.field1146.method3446(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.z(I[II)Lba;")
    public class58 method1128(int arg0, int[] arg1) {
        if (this.field1149.method2992() == 1) {
            return this.method1115(0, arg0, arg1);
        } else if (this.field1149.method2978(arg0) == 1) {
            return this.method1115(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bw.y(I[II)Lba;")
    public class58 method1117(int arg0, int[] arg1) {
        if (this.field1147.method2992() == 1) {
            return this.method1118(0, arg0, arg1);
        } else if (this.field1147.method2978(arg0) == 1) {
            return this.method1118(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

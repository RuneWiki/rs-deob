package deob;

@ObfuscatedName("bj")
public class class54 {

    @ObfuscatedName("bj.v")
    public class151 field1110;

    @ObfuscatedName("bj.t")
    public class151 field1111;

    @ObfuscatedName("bj.f")
    public class179 field1112 = new class179(256);

    @ObfuscatedName("bj.j")
    public class179 field1114 = new class179(256);

    public class54(class151 arg0, class151 arg1) {
        this.field1110 = arg0;
        this.field1111 = arg1;
    }

    @ObfuscatedName("bj.v(II[II)Lbb;")
    public class57 method1060(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class57 var8 = (class57) this.field1114.method3274(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = class53.method1054(this.field1110, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class57 var10 = var9.method1047();
            this.field1114.method3282(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1130.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bj.t(II[II)Lbb;")
    public class57 method1059(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class57 var8 = (class57) this.field1114.method3274(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class65 var9 = (class65) this.field1112.method3274(var6);
            if (var9 == null) {
                var9 = class65.method1276(this.field1111, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1112.method3282(var9, var6);
            }
            class57 var10 = var9.method1297(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3392();
                this.field1114.method3282(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bj.f(I[II)Lbb;")
    public class57 method1057(int arg0, int[] arg1) {
        if (this.field1110.method2795() == 1) {
            return this.method1060(0, arg0, arg1);
        } else if (this.field1110.method2794(arg0) == 1) {
            return this.method1060(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bj.j(I[II)Lbb;")
    public class57 method1064(int arg0, int[] arg1) {
        if (this.field1111.method2795() == 1) {
            return this.method1059(0, arg0, arg1);
        } else if (this.field1111.method2794(arg0) == 1) {
            return this.method1059(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

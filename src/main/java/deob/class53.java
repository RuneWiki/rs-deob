package deob;

@ObfuscatedName("bm")
public class class53 {

    @ObfuscatedName("bm.b")
    public class146 field1112;

    @ObfuscatedName("bm.u")
    public class146 field1115;

    @ObfuscatedName("bm.x")
    public class174 field1113 = new class174(256);

    @ObfuscatedName("bm.j")
    public class174 field1114 = new class174(256);

    public class53(class146 arg0, class146 arg1) {
        this.field1112 = arg0;
        this.field1115 = arg1;
    }

    @ObfuscatedName("bm.b(II[II)Lbq;")
    public class56 method1044(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1114.method3157(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = class52.method1029(this.field1112, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1024();
            this.field1114.method3147(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1126.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.u(II[II)Lbq;")
    public class56 method1038(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1114.method3157(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class64 var9 = (class64) this.field1113.method3157(var6);
            if (var9 == null) {
                var9 = class64.method1301(this.field1115, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1113.method3147(var9, var6);
            }
            class56 var10 = var9.method1281(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3260();
                this.field1114.method3147(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bm.x(I[II)Lbq;")
    public class56 method1039(int arg0, int[] arg1) {
        if (this.field1112.method2703() == 1) {
            return this.method1044(0, arg0, arg1);
        } else if (this.field1112.method2702(arg0) == 1) {
            return this.method1044(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bm.j(I[II)Lbq;")
    public class56 method1040(int arg0, int[] arg1) {
        if (this.field1115.method2703() == 1) {
            return this.method1038(0, arg0, arg1);
        } else if (this.field1115.method2702(arg0) == 1) {
            return this.method1038(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

package deob;

@ObfuscatedName("bc")
public class class53 {

    @ObfuscatedName("bc.g")
    public class147 field1110;

    @ObfuscatedName("bc.s")
    public class147 field1108;

    @ObfuscatedName("bc.h")
    public class175 field1107 = new class175(256);

    @ObfuscatedName("bc.m")
    public class175 field1113 = new class175(256);

    public class53(class147 arg0, class147 arg1) {
        this.field1110 = arg0;
        this.field1108 = arg1;
    }

    @ObfuscatedName("bc.g(II[II)Lbi;")
    public class56 method1046(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1113.method3171(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = class52.method1032(this.field1110, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1030();
            this.field1113.method3161(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1128.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bc.s(II[IS)Lbi;")
    public class56 method1047(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1113.method3171(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class64 var9 = (class64) this.field1107.method3171(var6);
            if (var9 == null) {
                var9 = class64.method1281(this.field1108, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1107.method3161(var9, var6);
            }
            class56 var10 = var9.method1278(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3280();
                this.field1113.method3161(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bc.h(I[II)Lbi;")
    public class56 method1048(int arg0, int[] arg1) {
        if (this.field1110.method2678() == 1) {
            return this.method1046(0, arg0, arg1);
        } else if (this.field1110.method2732(arg0) == 1) {
            return this.method1046(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bc.m(I[II)Lbi;")
    public class56 method1045(int arg0, int[] arg1) {
        if (this.field1108.method2678() == 1) {
            return this.method1047(0, arg0, arg1);
        } else if (this.field1108.method2732(arg0) == 1) {
            return this.method1047(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

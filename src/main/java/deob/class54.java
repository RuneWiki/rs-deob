package deob;

@ObfuscatedName("bi")
public class class54 {

    @ObfuscatedName("bi.p")
    public class151 field1105;

    @ObfuscatedName("bi.y")
    public class151 field1104;

    @ObfuscatedName("bi.d")
    public class179 field1110 = new class179(256);

    @ObfuscatedName("bi.c")
    public class179 field1106 = new class179(256);

    public class54(class151 arg0, class151 arg1) {
        this.field1105 = arg0;
        this.field1104 = arg1;
    }

    @ObfuscatedName("bi.p(II[IS)Lbk;")
    public class57 method1081(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class57 var8 = (class57) this.field1106.method3224(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = class53.method1069(this.field1105, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class57 var10 = var9.method1062();
            this.field1106.method3225(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1126.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bi.y(II[II)Lbk;")
    public class57 method1075(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class57 var8 = (class57) this.field1106.method3224(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class65 var9 = (class65) this.field1110.method3224(var6);
            if (var9 == null) {
                var9 = class65.method1307(this.field1104, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1110.method3225(var9, var6);
            }
            class57 var10 = var9.method1308(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3358();
                this.field1106.method3225(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bi.d(I[II)Lbk;")
    public class57 method1076(int arg0, int[] arg1) {
        if (this.field1105.method2758() == 1) {
            return this.method1081(0, arg0, arg1);
        } else if (this.field1105.method2757(arg0) == 1) {
            return this.method1081(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bi.c(I[II)Lbk;")
    public class57 method1077(int arg0, int[] arg1) {
        if (this.field1104.method2758() == 1) {
            return this.method1075(0, arg0, arg1);
        } else if (this.field1104.method2757(arg0) == 1) {
            return this.method1075(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

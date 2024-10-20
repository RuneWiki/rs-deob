package deob;

@ObfuscatedName("br")
public class class60 {

    @ObfuscatedName("br.m")
    public class167 field1174;

    @ObfuscatedName("br.l")
    public class167 field1177;

    @ObfuscatedName("br.y")
    public class196 field1173 = new class196(256);

    @ObfuscatedName("br.u")
    public class196 field1176 = new class196(256);

    public class60(class167 arg0, class167 arg1) {
        this.field1174 = arg0;
        this.field1177 = arg1;
    }

    @ObfuscatedName("br.m(II[IB)Lbt;")
    public class63 method1265(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1176.method3571(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1243(this.field1174, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1244();
            this.field1176.method3572(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1188.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("br.l(II[II)Lbt;")
    public class63 method1257(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1176.method3571(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1173.method3571(var6);
            if (var9 == null) {
                var9 = class71.method1479(this.field1177, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1173.method3572(var9, var6);
            }
            class63 var10 = var9.method1481(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3702();
                this.field1176.method3572(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("br.y(I[II)Lbt;")
    public class63 method1258(int arg0, int[] arg1) {
        if (this.field1174.method3091() == 1) {
            return this.method1265(0, arg0, arg1);
        } else if (this.field1174.method3090(arg0) == 1) {
            return this.method1265(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("br.u(I[II)Lbt;")
    public class63 method1259(int arg0, int[] arg1) {
        if (this.field1177.method3091() == 1) {
            return this.method1257(0, arg0, arg1);
        } else if (this.field1177.method3090(arg0) == 1) {
            return this.method1257(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

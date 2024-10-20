package deob;

@ObfuscatedName("bu")
public class class60 {

    @ObfuscatedName("bu.a")
    public class167 field1221;

    @ObfuscatedName("bu.r")
    public class167 field1213;

    @ObfuscatedName("bu.f")
    public class196 field1212 = new class196(256);

    @ObfuscatedName("bu.s")
    public class196 field1215 = new class196(256);

    public class60(class167 arg0, class167 arg1) {
        this.field1221 = arg0;
        this.field1213 = arg1;
    }

    @ObfuscatedName("bu.a(II[II)Lbl;")
    public class63 method1233(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1215.method3539(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1224(this.field1221, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1222();
            this.field1215.method3546(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1232.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bu.r(II[II)Lbl;")
    public class63 method1228(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1215.method3539(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1212.method3539(var6);
            if (var9 == null) {
                var9 = class71.method1478(this.field1213, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1212.method3546(var9, var6);
            }
            class63 var10 = var9.method1458(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3661();
                this.field1215.method3546(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bu.f(I[II)Lbl;")
    public class63 method1229(int arg0, int[] arg1) {
        if (this.field1221.method3049() == 1) {
            return this.method1233(0, arg0, arg1);
        } else if (this.field1221.method3035(arg0) == 1) {
            return this.method1233(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bu.s(I[II)Lbl;")
    public class63 method1231(int arg0, int[] arg1) {
        if (this.field1213.method3049() == 1) {
            return this.method1228(0, arg0, arg1);
        } else if (this.field1213.method3035(arg0) == 1) {
            return this.method1228(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

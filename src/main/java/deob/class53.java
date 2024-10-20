package deob;

@ObfuscatedName("bj")
public class class53 {

    @ObfuscatedName("bj.p")
    public class147 field1106;

    @ObfuscatedName("bj.g")
    public class147 field1112;

    @ObfuscatedName("bj.x")
    public class175 field1107 = new class175(256);

    @ObfuscatedName("bj.c")
    public class175 field1105 = new class175(256);

    public class53(class147 arg0, class147 arg1) {
        this.field1106 = arg0;
        this.field1112 = arg1;
    }

    @ObfuscatedName("bj.p(II[II)Lbp;")
    public class56 method1101(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1105.method3263(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = class52.method1090(this.field1106, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1085();
            this.field1105.method3264(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1122.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bj.g(II[II)Lbp;")
    public class56 method1102(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1105.method3263(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class64 var9 = (class64) this.field1107.method3263(var6);
            if (var9 == null) {
                var9 = class64.method1323(this.field1112, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1107.method3264(var9, var6);
            }
            class56 var10 = var9.method1325(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3378();
                this.field1105.method3264(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bj.x(I[II)Lbp;")
    public class56 method1103(int arg0, int[] arg1) {
        if (this.field1106.method2848() == 1) {
            return this.method1101(0, arg0, arg1);
        } else if (this.field1106.method2796(arg0) == 1) {
            return this.method1101(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bj.c(I[II)Lbp;")
    public class56 method1104(int arg0, int[] arg1) {
        if (this.field1112.method2848() == 1) {
            return this.method1102(0, arg0, arg1);
        } else if (this.field1112.method2796(arg0) == 1) {
            return this.method1102(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

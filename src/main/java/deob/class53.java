package deob;

@ObfuscatedName("bq")
public class class53 {

    @ObfuscatedName("bq.g")
    public class147 field1112;

    @ObfuscatedName("bq.s")
    public class147 field1116;

    @ObfuscatedName("bq.v")
    public class175 field1111 = new class175(256);

    @ObfuscatedName("bq.o")
    public class175 field1110 = new class175(256);

    public class53(class147 arg0, class147 arg1) {
        this.field1112 = arg0;
        this.field1116 = arg1;
    }

    @ObfuscatedName("bq.g(II[IB)Lbk;")
    public class56 method1045(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1110.method3155(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = class52.method1028(this.field1112, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1030();
            this.field1110.method3152(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1128.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bq.s(II[II)Lbk;")
    public class56 method1038(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1110.method3155(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class64 var9 = (class64) this.field1111.method3155(var6);
            if (var9 == null) {
                var9 = class64.method1251(this.field1116, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1111.method3152(var9, var6);
            }
            class56 var10 = var9.method1253(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3285();
                this.field1110.method3152(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bq.v(I[II)Lbk;")
    public class56 method1039(int arg0, int[] arg1) {
        if (this.field1112.method2670() == 1) {
            return this.method1045(0, arg0, arg1);
        } else if (this.field1112.method2722(arg0) == 1) {
            return this.method1045(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bq.o(I[IB)Lbk;")
    public class56 method1040(int arg0, int[] arg1) {
        if (this.field1116.method2670() == 1) {
            return this.method1038(0, arg0, arg1);
        } else if (this.field1116.method2722(arg0) == 1) {
            return this.method1038(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

package deob;

@ObfuscatedName("cv")
public class class99 {

    @ObfuscatedName("cv.w")
    public class248 field1363;

    @ObfuscatedName("cv.m")
    public class248 field1359;

    @ObfuscatedName("cv.q")
    public class203 field1360 = new class203(256);

    @ObfuscatedName("cv.b")
    public class203 field1358 = new class203(256);

    public class99(class248 arg0, class248 arg1) {
        this.field1363 = arg0;
        this.field1359 = arg1;
    }

    @ObfuscatedName("cv.w(II[IB)Lcg;")
    public class94 method2103(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class94 var8 = (class94) this.field1358.method3748(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class92 var9 = class92.method1964(this.field1363, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class94 var10 = var9.method1960();
            this.field1358.method3747(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1306.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("cv.m(II[II)Lcg;")
    public class94 method2104(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class94 var8 = (class94) this.field1358.method3748(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class93 var9 = (class93) this.field1360.method3748(var6);
            if (var9 == null) {
                var9 = class93.method1977(this.field1359, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1360.method3747(var9, var6);
            }
            class94 var10 = var9.method1978(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3782();
                this.field1358.method3747(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("cv.q(I[II)Lcg;")
    public class94 method2105(int arg0, int[] arg1) {
        if (this.field1363.method4269() == 1) {
            return this.method2103(0, arg0, arg1);
        } else if (this.field1363.method4262(arg0) == 1) {
            return this.method2103(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cv.x(I[II)Lcg;")
    public class94 method2102(int arg0, int[] arg1) {
        if (this.field1359.method4269() == 1) {
            return this.method2104(0, arg0, arg1);
        } else if (this.field1359.method4262(arg0) == 1) {
            return this.method2104(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}

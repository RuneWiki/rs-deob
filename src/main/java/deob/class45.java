package deob;

@ObfuscatedName("ay")
public class class45 extends class204 {

    @ObfuscatedName("ay.q")
    public static class193 field1032 = new class193(64);

    @ObfuscatedName("ay.p")
    public int field1036 = -1;

    @ObfuscatedName("ay.c")
    public int[] field1034;

    @ObfuscatedName("ay.f")
    public short[] field1035;

    @ObfuscatedName("ay.y")
    public short[] field1029;

    @ObfuscatedName("ay.w")
    public short[] field1039;

    @ObfuscatedName("ay.l")
    public short[] field1038;

    @ObfuscatedName("ay.v")
    public int[] field1037 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ay.k")
    public boolean field1040 = false;

    @ObfuscatedName("ev.h(IB)Lay;")
    public static class45 method2716(int arg0) {
        class45 var1 = (class45) field1032.method3472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1031.method3051(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method882(new class119(var2));
        }
        field1032.method3474(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.m(Ldp;I)V")
    public void method882(class119 arg0) {
        while (true) {
            int var2 = arg0.method2320();
            if (var2 == 0) {
                return;
            }
            this.method901(arg0, var2);
        }
    }

    @ObfuscatedName("ay.i(Ldp;II)V")
    public void method901(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1036 = arg0.method2320();
        } else if (arg1 == 2) {
            int var3 = arg0.method2320();
            this.field1034 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1034[var4] = arg0.method2322();
            }
        } else if (arg1 == 3) {
            this.field1040 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2320();
            this.field1035 = new short[var5];
            this.field1029 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1035[var6] = (short) arg0.method2322();
                this.field1029[var6] = (short) arg0.method2322();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2320();
            this.field1039 = new short[var7];
            this.field1038 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1039[var8] = (short) arg0.method2322();
                this.field1038[var8] = (short) arg0.method2322();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1037[arg1 - 60] = arg0.method2322();
        }
    }

    @ObfuscatedName("ay.q(I)Z")
    public boolean method892() {
        if (this.field1034 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1034.length; var2++) {
            if (!Statics.field1030.method3080(this.field1034[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ay.p(I)Lcl;")
    public class100 method884() {
        if (this.field1034 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field1034.length];
        for (int var2 = 0; var2 < this.field1034.length; var2++) {
            var1[var2] = class100.method2081(Statics.field1030, this.field1034[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field1035 != null) {
            for (int var4 = 0; var4 < this.field1035.length; var4++) {
                var3.method2098(this.field1035[var4], this.field1029[var4]);
            }
        }
        if (this.field1039 != null) {
            for (int var5 = 0; var5 < this.field1039.length; var5++) {
                var3.method2038(this.field1039[var5], this.field1038[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ay.c(I)Z")
    public boolean method885() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1037[var2] != -1 && !Statics.field1030.method3080(this.field1037[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ay.f(I)Lcl;")
    public class100 method886() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1037[var3] != -1) {
                var1[var2++] = class100.method2081(Statics.field1030, this.field1037[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field1035 != null) {
            for (int var5 = 0; var5 < this.field1035.length; var5++) {
                var4.method2098(this.field1035[var5], this.field1029[var5]);
            }
        }
        if (this.field1039 != null) {
            for (int var6 = 0; var6 < this.field1039.length; var6++) {
                var4.method2038(this.field1039[var6], this.field1038[var6]);
            }
        }
        return var4;
    }
}

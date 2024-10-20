package deob;

@ObfuscatedName("ad")
public class class180 extends class6 {

    @ObfuscatedName("ad.f")
    public short[] field2729;

    @ObfuscatedName("ad.g")
    public boolean field2732 = false;

    @ObfuscatedName("ad.d")
    public int[] field2727;

    @ObfuscatedName("ad.l")
    public short[] field2728;

    @ObfuscatedName("ad.j")
    public short[] field2731;

    @ObfuscatedName("ad.w")
    public static class2 field2725 = new class2(64);

    @ObfuscatedName("ad.t")
    public int field2726 = -1;

    @ObfuscatedName("ad.s")
    public short[] field2738;

    @ObfuscatedName("ad.x")
    public int[] field2737 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ad.l(B)Lcf;")
    public class157 method3130() {
        class157[] var1 = new class157[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2737[var3] != -1) {
                var1[var2++] = class157.method2663(Statics.field2723, this.field2737[var3], 0);
            }
        }
        class157 var4 = new class157(var1, var2);
        if (this.field2728 != null) {
            for (int var5 = 0; var5 < this.field2728.length; var5++) {
                var4.method2701(this.field2728[var5], this.field2729[var5]);
            }
        }
        if (this.field2738 != null) {
            for (int var6 = 0; var6 < this.field2738.length; var6++) {
                var4.method2678(this.field2738[var6], this.field2731[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ad.d(I)Z")
    public boolean method3131() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2737[var2] != -1 && !Statics.field2723.method1268(this.field2737[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ad.t(I)Lcf;")
    public class157 method3133() {
        if (this.field2727 == null) {
            return null;
        }
        class157[] var1 = new class157[this.field2727.length];
        for (int var2 = 0; var2 < this.field2727.length; var2++) {
            var1[var2] = class157.method2663(Statics.field2723, this.field2727[var2], 0);
        }
        class157 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class157(var1, var1.length);
        }
        if (this.field2728 != null) {
            for (int var4 = 0; var4 < this.field2728.length; var4++) {
                var3.method2701(this.field2728[var4], this.field2729[var4]);
            }
        }
        if (this.field2738 != null) {
            for (int var5 = 0; var5 < this.field2738.length; var5++) {
                var3.method2678(this.field2738[var5], this.field2731[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ad.h(Ldp;I)V")
    public void method3143(class50 arg0) {
        while (true) {
            int var2 = arg0.method726();
            if (var2 == 0) {
                return;
            }
            this.method3144(arg0, var2);
        }
    }

    @ObfuscatedName("ad.k(Ldp;IB)V")
    public void method3144(class50 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2726 = arg0.method726();
        } else if (arg1 == 2) {
            int var3 = arg0.method726();
            this.field2727 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2727[var4] = arg0.method720();
            }
        } else if (arg1 == 3) {
            this.field2732 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method726();
            this.field2728 = new short[var5];
            this.field2729 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2728[var6] = (short) arg0.method720();
                this.field2729[var6] = (short) arg0.method720();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method726();
            this.field2738 = new short[var7];
            this.field2731 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2738[var8] = (short) arg0.method720();
                this.field2731[var8] = (short) arg0.method720();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2737[arg1 - 60] = arg0.method720();
        }
    }

    @ObfuscatedName("ad.w(I)Z")
    public boolean method3148() {
        if (this.field2727 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2727.length; var2++) {
            if (!Statics.field2723.method1268(this.field2727[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("dt.b(II)Lad;")
    public static class180 method381(int arg0) {
        class180 var1 = (class180) field2725.method1((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2733.method1266(3, arg0);
        class180 var3 = new class180();
        if (var2 != null) {
            var3.method3143(new class50(var2));
        }
        field2725.method4(var3, (long) arg0);
        return var3;
    }
}

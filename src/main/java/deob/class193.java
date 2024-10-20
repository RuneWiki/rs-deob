package deob;

@ObfuscatedName("ge")
public class class193 extends class130 {

    @ObfuscatedName("ge.h")
    public static class125 field2831 = new class125(64);

    @ObfuscatedName("ge.r")
    public int field2829 = -1;

    @ObfuscatedName("ge.o")
    public int[] field2833;

    @ObfuscatedName("ge.l")
    public short[] field2834;

    @ObfuscatedName("ge.n")
    public short[] field2830;

    @ObfuscatedName("ge.m")
    public short[] field2836;

    @ObfuscatedName("ge.w")
    public short[] field2837;

    @ObfuscatedName("ge.j")
    public int[] field2838 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ge.s")
    public boolean field2839 = false;

    @ObfuscatedName("co.f(Lgb;Lgb;I)V")
    public static void method1880(class183 arg0, class183 arg1) {
        Statics.field2835 = arg0;
        Statics.field1944 = arg1;
        Statics.field2832 = Statics.field2835.method3127(3);
    }

    @ObfuscatedName("ds.i(IB)Lge;")
    public static class193 method2005(int arg0) {
        class193 var1 = (class193) field2831.method2240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2835.method3163(3, arg0);
        class193 var3 = new class193();
        if (var2 != null) {
            var3.method3332(new class154(var2));
        }
        field2831.method2246(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ge.u(Leo;I)V")
    public void method3332(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3327(arg0, var2);
        }
    }

    @ObfuscatedName("ge.r(Leo;II)V")
    public void method3327(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2829 = arg0.method2666();
        } else if (arg1 == 2) {
            int var3 = arg0.method2666();
            this.field2833 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2833[var4] = arg0.method2668();
            }
        } else if (arg1 == 3) {
            this.field2839 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2666();
            this.field2834 = new short[var5];
            this.field2830 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2834[var6] = (short) arg0.method2668();
                this.field2830[var6] = (short) arg0.method2668();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2666();
            this.field2836 = new short[var7];
            this.field2837 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2836[var8] = (short) arg0.method2668();
                this.field2837[var8] = (short) arg0.method2668();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2838[arg1 - 60] = arg0.method2668();
        }
    }

    @ObfuscatedName("ge.o(B)Z")
    public boolean method3328() {
        if (this.field2833 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2833.length; var2++) {
            if (!Statics.field1944.method3119(this.field2833[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ge.l(B)Lbp;")
    public class77 method3343() {
        if (this.field2833 == null) {
            return null;
        }
        class77[] var1 = new class77[this.field2833.length];
        for (int var2 = 0; var2 < this.field2833.length; var2++) {
            var1[var2] = class77.method1408(Statics.field1944, this.field2833[var2], 0);
        }
        class77 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class77(var1, var1.length);
        }
        if (this.field2834 != null) {
            for (int var4 = 0; var4 < this.field2834.length; var4++) {
                var3.method1422(this.field2834[var4], this.field2830[var4]);
            }
        }
        if (this.field2836 != null) {
            for (int var5 = 0; var5 < this.field2836.length; var5++) {
                var3.method1423(this.field2836[var5], this.field2837[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ge.n(I)Z")
    public boolean method3330() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2838[var2] != -1 && !Statics.field1944.method3119(this.field2838[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ge.m(I)Lbp;")
    public class77 method3331() {
        class77[] var1 = new class77[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2838[var3] != -1) {
                var1[var2++] = class77.method1408(Statics.field1944, this.field2838[var3], 0);
            }
        }
        class77 var4 = new class77(var1, var2);
        if (this.field2834 != null) {
            for (int var5 = 0; var5 < this.field2834.length; var5++) {
                var4.method1422(this.field2834[var5], this.field2830[var5]);
            }
        }
        if (this.field2836 != null) {
            for (int var6 = 0; var6 < this.field2836.length; var6++) {
                var4.method1423(this.field2836[var6], this.field2837[var6]);
            }
        }
        return var4;
    }
}

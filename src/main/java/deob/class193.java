package deob;

@ObfuscatedName("gj")
public class class193 extends class130 {

    @ObfuscatedName("gj.l")
    public static class125 field2827 = new class125(64);

    @ObfuscatedName("gj.y")
    public int field2828 = -1;

    @ObfuscatedName("gj.j")
    public int[] field2830;

    @ObfuscatedName("gj.g")
    public short[] field2829;

    @ObfuscatedName("gj.s")
    public short[] field2836;

    @ObfuscatedName("gj.r")
    public short[] field2832;

    @ObfuscatedName("gj.t")
    public short[] field2838;

    @ObfuscatedName("gj.k")
    public int[] field2834 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("gj.f")
    public boolean field2835 = false;

    @ObfuscatedName("m.b(II)Lgj;")
    public static class193 method270(int arg0) {
        class193 var1 = (class193) field2827.method2246((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2837.method3126(3, arg0);
        class193 var3 = new class193();
        if (var2 != null) {
            var3.method3348(new class154(var2));
        }
        field2827.method2250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gj.e(Lec;I)V")
    public void method3348(class154 arg0) {
        while (true) {
            int var2 = arg0.method2669();
            if (var2 == 0) {
                return;
            }
            this.method3335(arg0, var2);
        }
    }

    @ObfuscatedName("gj.c(Lec;IB)V")
    public void method3335(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2828 = arg0.method2669();
        } else if (arg1 == 2) {
            int var3 = arg0.method2669();
            this.field2830 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2830[var4] = arg0.method2671();
            }
        } else if (arg1 == 3) {
            this.field2835 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2669();
            this.field2829 = new short[var5];
            this.field2836 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2829[var6] = (short) arg0.method2671();
                this.field2836[var6] = (short) arg0.method2671();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2669();
            this.field2832 = new short[var7];
            this.field2838 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2832[var8] = (short) arg0.method2671();
                this.field2838[var8] = (short) arg0.method2671();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2834[arg1 - 60] = arg0.method2671();
        }
    }

    @ObfuscatedName("gj.l(I)Z")
    public boolean method3336() {
        if (this.field2830 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2830.length; var2++) {
            if (!Statics.field2826.method3202(this.field2830[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gj.y(I)Lbr;")
    public class77 method3337() {
        if (this.field2830 == null) {
            return null;
        }
        class77[] var1 = new class77[this.field2830.length];
        for (int var2 = 0; var2 < this.field2830.length; var2++) {
            var1[var2] = class77.method1409(Statics.field2826, this.field2830[var2], 0);
        }
        class77 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class77(var1, var1.length);
        }
        if (this.field2829 != null) {
            for (int var4 = 0; var4 < this.field2829.length; var4++) {
                var3.method1480(this.field2829[var4], this.field2836[var4]);
            }
        }
        if (this.field2832 != null) {
            for (int var5 = 0; var5 < this.field2832.length; var5++) {
                var3.method1423(this.field2832[var5], this.field2838[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("gj.j(I)Z")
    public boolean method3338() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2834[var2] != -1 && !Statics.field2826.method3202(this.field2834[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gj.t(I)Lbr;")
    public class77 method3339() {
        class77[] var1 = new class77[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2834[var3] != -1) {
                var1[var2++] = class77.method1409(Statics.field2826, this.field2834[var3], 0);
            }
        }
        class77 var4 = new class77(var1, var2);
        if (this.field2829 != null) {
            for (int var5 = 0; var5 < this.field2829.length; var5++) {
                var4.method1480(this.field2829[var5], this.field2836[var5]);
            }
        }
        if (this.field2832 != null) {
            for (int var6 = 0; var6 < this.field2832.length; var6++) {
                var4.method1423(this.field2832[var6], this.field2838[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("at.k(I)V")
    public static void method716() {
        field2827.method2249();
    }
}

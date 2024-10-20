package deob;

@ObfuscatedName("fb")
public class class166 extends class387 {

    @ObfuscatedName("fb.e")
    public static class249 field1793 = new class249(64);

    @ObfuscatedName("fb.r")
    public int field1796 = -1;

    @ObfuscatedName("fb.o")
    public int[] field1794;

    @ObfuscatedName("fb.i")
    public short[] field1804;

    @ObfuscatedName("fb.w")
    public short[] field1799;

    @ObfuscatedName("fb.v")
    public short[] field1800;

    @ObfuscatedName("fb.a")
    public short[] field1801;

    @ObfuscatedName("fb.y")
    public int[] field1802 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("fb.u")
    public boolean field1797 = false;

    @ObfuscatedName("eo.l(II)Lfb;")
    public static class166 method2735(int arg0) {
        class166 var1 = (class166) field1793.method4472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1798.method5066(3, arg0);
        class166 var3 = new class166();
        if (var2 != null) {
            var3.method2893(new class421(var2));
        }
        field1793.method4482(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fb.s(Lpi;I)V")
    public void method2893(class421 arg0) {
        while (true) {
            int var2 = arg0.method6686();
            if (var2 == 0) {
                return;
            }
            this.method2906(arg0, var2);
        }
    }

    @ObfuscatedName("fb.e(Lpi;II)V")
    public void method2906(class421 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1796 = arg0.method6686();
        } else if (arg1 == 2) {
            int var3 = arg0.method6686();
            this.field1794 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1794[var4] = arg0.method6666();
            }
        } else if (arg1 == 3) {
            this.field1797 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method6686();
            this.field1804 = new short[var5];
            this.field1799 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1804[var6] = (short) arg0.method6666();
                this.field1799[var6] = (short) arg0.method6666();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method6686();
            this.field1800 = new short[var7];
            this.field1801 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1800[var8] = (short) arg0.method6666();
                this.field1801[var8] = (short) arg0.method6666();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1802[arg1 - 60] = arg0.method6666();
        }
    }

    @ObfuscatedName("fb.r(I)Z")
    public boolean method2896() {
        if (this.field1794 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1794.length; var2++) {
            if (!Statics.field1803.method5057(this.field1794[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fb.o(I)Lgq;")
    public class189 method2912() {
        if (this.field1794 == null) {
            return null;
        }
        class189[] var1 = new class189[this.field1794.length];
        for (int var2 = 0; var2 < this.field1794.length; var2++) {
            var1[var2] = class189.method3374(Statics.field1803, this.field1794[var2], 0);
        }
        class189 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class189(var1, var1.length);
        }
        if (this.field1804 != null) {
            for (int var4 = 0; var4 < this.field1804.length; var4++) {
                var3.method3380(this.field1804[var4], this.field1799[var4]);
            }
        }
        if (this.field1800 != null) {
            for (int var5 = 0; var5 < this.field1800.length; var5++) {
                var3.method3404(this.field1800[var5], this.field1801[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("fb.i(I)Z")
    public boolean method2901() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1802[var2] != -1 && !Statics.field1803.method5057(this.field1802[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fb.w(I)Lgq;")
    public class189 method2905() {
        class189[] var1 = new class189[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1802[var3] != -1) {
                var1[var2++] = class189.method3374(Statics.field1803, this.field1802[var3], 0);
            }
        }
        class189 var4 = new class189(var1, var2);
        if (this.field1804 != null) {
            for (int var5 = 0; var5 < this.field1804.length; var5++) {
                var4.method3380(this.field1804[var5], this.field1799[var5]);
            }
        }
        if (this.field1800 != null) {
            for (int var6 = 0; var6 < this.field1800.length; var6++) {
                var4.method3404(this.field1800[var6], this.field1801[var6]);
            }
        }
        return var4;
    }
}

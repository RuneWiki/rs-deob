package deob;

@ObfuscatedName("go")
public class class193 extends class130 {

    @ObfuscatedName("go.p")
    public static class125 field2820 = new class125(64);

    @ObfuscatedName("go.j")
    public int field2822 = -1;

    @ObfuscatedName("go.n")
    public int[] field2823;

    @ObfuscatedName("go.r")
    public short[] field2824;

    @ObfuscatedName("go.c")
    public short[] field2825;

    @ObfuscatedName("go.i")
    public short[] field2828;

    @ObfuscatedName("go.o")
    public short[] field2827;

    @ObfuscatedName("go.m")
    public int[] field2821 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("go.s")
    public boolean field2829 = false;

    @ObfuscatedName("cd.q(II)Lgo;")
    public static class193 method1898(int arg0) {
        class193 var1 = (class193) field2820.method2258((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2826.method3133(3, arg0);
        class193 var3 = new class193();
        if (var2 != null) {
            var3.method3305(new class154(var2));
        }
        field2820.method2248(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("go.d(Lel;I)V")
    public void method3305(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3307(arg0, var2);
        }
    }

    @ObfuscatedName("go.h(Lel;II)V")
    public void method3307(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2822 = arg0.method2666();
        } else if (arg1 == 2) {
            int var3 = arg0.method2666();
            this.field2823 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2823[var4] = arg0.method2668();
            }
        } else if (arg1 == 3) {
            this.field2829 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2666();
            this.field2824 = new short[var5];
            this.field2825 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2824[var6] = (short) arg0.method2668();
                this.field2825[var6] = (short) arg0.method2668();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2666();
            this.field2828 = new short[var7];
            this.field2827 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2828[var8] = (short) arg0.method2668();
                this.field2827[var8] = (short) arg0.method2668();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2821[arg1 - 60] = arg0.method2668();
        }
    }

    @ObfuscatedName("go.p(I)Z")
    public boolean method3306() {
        if (this.field2823 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2823.length; var2++) {
            if (!Statics.field2819.method3189(this.field2823[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("go.j(B)Lbx;")
    public class77 method3313() {
        if (this.field2823 == null) {
            return null;
        }
        class77[] var1 = new class77[this.field2823.length];
        for (int var2 = 0; var2 < this.field2823.length; var2++) {
            var1[var2] = class77.method1494(Statics.field2819, this.field2823[var2], 0);
        }
        class77 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class77(var1, var1.length);
        }
        if (this.field2824 != null) {
            for (int var4 = 0; var4 < this.field2824.length; var4++) {
                var3.method1461(this.field2824[var4], this.field2825[var4]);
            }
        }
        if (this.field2828 != null) {
            for (int var5 = 0; var5 < this.field2828.length; var5++) {
                var3.method1499(this.field2828[var5], this.field2827[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("go.n(B)Z")
    public boolean method3308() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2821[var2] != -1 && !Statics.field2819.method3189(this.field2821[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("go.c(B)Lbx;")
    public class77 method3309() {
        class77[] var1 = new class77[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2821[var3] != -1) {
                var1[var2++] = class77.method1494(Statics.field2819, this.field2821[var3], 0);
            }
        }
        class77 var4 = new class77(var1, var2);
        if (this.field2824 != null) {
            for (int var5 = 0; var5 < this.field2824.length; var5++) {
                var4.method1461(this.field2824[var5], this.field2825[var5]);
            }
        }
        if (this.field2828 != null) {
            for (int var6 = 0; var6 < this.field2828.length; var6++) {
                var4.method1499(this.field2828[var6], this.field2827[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fp.o(I)V")
    public static void method2988() {
        field2820.method2249();
    }
}

package deob;

@ObfuscatedName("jp")
public class class262 extends class185 {

    @ObfuscatedName("jp.k")
    public static class155 field3345 = new class155(64);

    @ObfuscatedName("jp.s")
    public char field3337;

    @ObfuscatedName("jp.t")
    public char field3339;

    @ObfuscatedName("jp.i")
    public String field3340 = class234.field2806;

    @ObfuscatedName("jp.o")
    public int field3341;

    @ObfuscatedName("jp.x")
    public int field3342 = 0;

    @ObfuscatedName("jp.w")
    public int[] field3336;

    @ObfuscatedName("jp.g")
    public int[] field3344;

    @ObfuscatedName("jp.m")
    public String[] field3343;

    @ObfuscatedName("hu.z(Lic;B)V")
    public static void method3783(class244 arg0) {
        Statics.field3338 = arg0;
    }

    @ObfuscatedName("r.k(II)Ljp;")
    public static class262 method188(int arg0) {
        class262 var1 = (class262) field3345.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3338.method3873(8, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4276(new class310(var2));
        }
        field3345.method3169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jp.s(Lkf;I)V")
    public void method4276(class310 arg0) {
        while (true) {
            int var2 = arg0.method5193();
            if (var2 == 0) {
                return;
            }
            this.method4273(arg0, var2);
        }
    }

    @ObfuscatedName("jp.t(Lkf;IB)V")
    public void method4273(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3337 = (char) arg0.method5193();
        } else if (arg1 == 2) {
            this.field3339 = (char) arg0.method5193();
        } else if (arg1 == 3) {
            this.field3340 = arg0.method5202();
        } else if (arg1 == 4) {
            this.field3341 = arg0.method5270();
        } else if (arg1 == 5) {
            this.field3342 = arg0.method5195();
            this.field3336 = new int[this.field3342];
            this.field3343 = new String[this.field3342];
            for (int var3 = 0; var3 < this.field3342; var3++) {
                this.field3336[var3] = arg0.method5270();
                this.field3343[var3] = arg0.method5202();
            }
        } else if (arg1 == 6) {
            this.field3342 = arg0.method5195();
            this.field3336 = new int[this.field3342];
            this.field3344 = new int[this.field3342];
            for (int var4 = 0; var4 < this.field3342; var4++) {
                this.field3336[var4] = arg0.method5270();
                this.field3344[var4] = arg0.method5270();
            }
        }
    }

    @ObfuscatedName("jp.i(B)I")
    public int method4270() {
        return this.field3342;
    }
}

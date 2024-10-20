package deob;

@ObfuscatedName("ga")
public class class196 extends class130 {

    @ObfuscatedName("ga.e")
    public static class125 field2855 = new class125(64);

    @ObfuscatedName("ga.f")
    public char field2854;

    @ObfuscatedName("ga.k")
    public char field2863;

    @ObfuscatedName("ga.g")
    public String field2858 = "null";

    @ObfuscatedName("ga.n")
    public int field2864;

    @ObfuscatedName("ga.a")
    public int field2860 = 0;

    @ObfuscatedName("ga.q")
    public int[] field2861;

    @ObfuscatedName("ga.w")
    public int[] field2856;

    @ObfuscatedName("ga.v")
    public String[] field2859;

    @ObfuscatedName("gs.i(II)Lga;")
    public static class196 method3117(int arg0) {
        class196 var1 = (class196) field2855.method2150((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2862.method3014(8, arg0);
        class196 var3 = new class196();
        if (var2 != null) {
            var3.method3302(new class154(var2));
        }
        field2855.method2152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ga.e(Let;B)V")
    public void method3302(class154 arg0) {
        while (true) {
            int var2 = arg0.method2573();
            if (var2 == 0) {
                return;
            }
            this.method3293(arg0, var2);
        }
    }

    @ObfuscatedName("ga.f(Let;IB)V")
    public void method3293(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2854 = (char) arg0.method2573();
        } else if (arg1 == 2) {
            this.field2863 = (char) arg0.method2573();
        } else if (arg1 == 3) {
            this.field2858 = arg0.method2581();
        } else if (arg1 == 4) {
            this.field2864 = arg0.method2658();
        } else if (arg1 == 5) {
            this.field2860 = arg0.method2575();
            this.field2861 = new int[this.field2860];
            this.field2859 = new String[this.field2860];
            for (int var3 = 0; var3 < this.field2860; var3++) {
                this.field2861[var3] = arg0.method2658();
                this.field2859[var3] = arg0.method2581();
            }
        } else if (arg1 == 6) {
            this.field2860 = arg0.method2575();
            this.field2861 = new int[this.field2860];
            this.field2856 = new int[this.field2860];
            for (int var4 = 0; var4 < this.field2860; var4++) {
                this.field2861[var4] = arg0.method2658();
                this.field2856[var4] = arg0.method2658();
            }
        }
    }
}

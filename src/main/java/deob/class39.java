package deob;

@ObfuscatedName("ab")
public class class39 extends class174 {

    @ObfuscatedName("ab.i")
    public static class170 field971 = new class170(64);

    @ObfuscatedName("ab.o")
    public int field973;

    @ObfuscatedName("ab.n")
    public char field974;

    @ObfuscatedName("ab.l")
    public String field975 = "null";

    @ObfuscatedName("ab.v")
    public int field978;

    @ObfuscatedName("ab.g")
    public int field976 = 0;

    @ObfuscatedName("ab.x")
    public int[] field982;

    @ObfuscatedName("ab.c")
    public int[] field977;

    @ObfuscatedName("ab.f")
    public String[] field980;

    @ObfuscatedName("q.p(II)Lab;")
    public static class39 method149(int arg0) {
        class39 var1 = (class39) field971.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field972.method3049(8, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method846(new class127(var2));
        }
        field971.method3269(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.i(Ldt;B)V")
    public void method846(class127 arg0) {
        while (true) {
            int var2 = arg0.method2659();
            if (var2 == 0) {
                return;
            }
            this.method849(arg0, var2);
        }
    }

    @ObfuscatedName("ab.o(Ldt;IB)V")
    public void method849(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field973 = arg0.method2659();
        } else if (arg1 == 2) {
            this.field974 = (char) arg0.method2659();
        } else if (arg1 == 3) {
            this.field975 = arg0.method2490();
        } else if (arg1 == 4) {
            this.field978 = arg0.method2551();
        } else if (arg1 == 5) {
            this.field976 = arg0.method2652();
            this.field982 = new int[this.field976];
            this.field980 = new String[this.field976];
            for (int var3 = 0; var3 < this.field976; var3++) {
                this.field982[var3] = arg0.method2551();
                this.field980[var3] = arg0.method2490();
            }
        } else if (arg1 == 6) {
            this.field976 = arg0.method2652();
            this.field982 = new int[this.field976];
            this.field977 = new int[this.field976];
            for (int var4 = 0; var4 < this.field976; var4++) {
                this.field982[var4] = arg0.method2551();
                this.field977[var4] = arg0.method2551();
            }
        }
    }
}

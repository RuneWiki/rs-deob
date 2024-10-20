package deob;

@ObfuscatedName("az")
public class class39 extends class174 {

    @ObfuscatedName("az.g")
    public static class170 field961 = new class170(64);

    @ObfuscatedName("az.a")
    public int field973;

    @ObfuscatedName("az.t")
    public char field971;

    @ObfuscatedName("az.f")
    public String field965 = "null";

    @ObfuscatedName("az.c")
    public int field966;

    @ObfuscatedName("az.p")
    public int field967 = 0;

    @ObfuscatedName("az.s")
    public int[] field968;

    @ObfuscatedName("az.k")
    public int[] field969;

    @ObfuscatedName("az.m")
    public String[] field963;

    @ObfuscatedName("a.d(Lej;I)V")
    public static void method28(class152 arg0) {
        Statics.field970 = arg0;
    }

    @ObfuscatedName("q.g(IB)Laz;")
    public static class39 method205(int arg0) {
        class39 var1 = (class39) field961.method3210((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field970.method2958(8, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method797(new class127(var2));
        }
        field961.method3221(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.a(Ldo;B)V")
    public void method797(class127 arg0) {
        while (true) {
            int var2 = arg0.method2509();
            if (var2 == 0) {
                return;
            }
            this.method798(arg0, var2);
        }
    }

    @ObfuscatedName("az.t(Ldo;II)V")
    public void method798(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field973 = arg0.method2509();
        } else if (arg1 == 2) {
            this.field971 = (char) arg0.method2509();
        } else if (arg1 == 3) {
            this.field965 = arg0.method2408();
        } else if (arg1 == 4) {
            this.field966 = arg0.method2405();
        } else if (arg1 == 5) {
            this.field967 = arg0.method2512();
            this.field968 = new int[this.field967];
            this.field963 = new String[this.field967];
            for (int var3 = 0; var3 < this.field967; var3++) {
                this.field968[var3] = arg0.method2405();
                this.field963[var3] = arg0.method2408();
            }
        } else if (arg1 == 6) {
            this.field967 = arg0.method2512();
            this.field968 = new int[this.field967];
            this.field969 = new int[this.field967];
            for (int var4 = 0; var4 < this.field967; var4++) {
                this.field968[var4] = arg0.method2405();
                this.field969[var4] = arg0.method2405();
            }
        }
    }
}

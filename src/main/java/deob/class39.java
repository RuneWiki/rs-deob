package deob;

@ObfuscatedName("ao")
public class class39 extends class174 {

    @ObfuscatedName("ao.p")
    public static class170 field974 = new class170(64);

    @ObfuscatedName("ao.a")
    public int field975;

    @ObfuscatedName("ao.l")
    public char field976;

    @ObfuscatedName("ao.q")
    public String field985 = "null";

    @ObfuscatedName("ao.b")
    public int field978;

    @ObfuscatedName("ao.u")
    public int field973 = 0;

    @ObfuscatedName("ao.d")
    public int[] field980;

    @ObfuscatedName("ao.m")
    public int[] field981;

    @ObfuscatedName("ao.v")
    public String[] field982;

    @ObfuscatedName("al.i(II)Lao;")
    public static class39 method769(int arg0) {
        class39 var1 = (class39) field974.method3223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field979.method2932(8, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method804(new class127(var2));
        }
        field974.method3225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.p(Ldn;I)V")
    public void method804(class127 arg0) {
        while (true) {
            int var2 = arg0.method2411();
            if (var2 == 0) {
                return;
            }
            this.method805(arg0, var2);
        }
    }

    @ObfuscatedName("ao.a(Ldn;IB)V")
    public void method805(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field975 = arg0.method2411();
        } else if (arg1 == 2) {
            this.field976 = (char) arg0.method2411();
        } else if (arg1 == 3) {
            this.field985 = arg0.method2419();
        } else if (arg1 == 4) {
            this.field978 = arg0.method2416();
        } else if (arg1 == 5) {
            this.field973 = arg0.method2413();
            this.field980 = new int[this.field973];
            this.field982 = new String[this.field973];
            for (int var3 = 0; var3 < this.field973; var3++) {
                this.field980[var3] = arg0.method2416();
                this.field982[var3] = arg0.method2419();
            }
        } else if (arg1 == 6) {
            this.field973 = arg0.method2413();
            this.field980 = new int[this.field973];
            this.field981 = new int[this.field973];
            for (int var4 = 0; var4 < this.field973; var4++) {
                this.field980[var4] = arg0.method2416();
                this.field981[var4] = arg0.method2416();
            }
        }
    }
}

package deob;

@ObfuscatedName("ag")
public class class43 extends class182 {

    @ObfuscatedName("ag.s")
    public static class171 field978 = new class171(64);

    @ObfuscatedName("ag.f")
    public char field979;

    @ObfuscatedName("ag.e")
    public char field977;

    @ObfuscatedName("ag.d")
    public String field981 = "null";

    @ObfuscatedName("ag.n")
    public int field982;

    @ObfuscatedName("ag.v")
    public int field987 = 0;

    @ObfuscatedName("ag.z")
    public int[] field980;

    @ObfuscatedName("ag.j")
    public int[] field985;

    @ObfuscatedName("ag.u")
    public String[] field984;

    @ObfuscatedName("ds.t(Leg;B)V")
    public static void method2531(class146 arg0) {
        Statics.field986 = arg0;
    }

    @ObfuscatedName("ay.s(II)Lag;")
    public static class43 method872(int arg0) {
        class43 var1 = (class43) field978.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field986.method2709(8, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method803(new class107(var2));
        }
        field978.method3168(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.f(Ldb;I)V")
    public void method803(class107 arg0) {
        while (true) {
            int var2 = arg0.method2101();
            if (var2 == 0) {
                return;
            }
            this.method805(arg0, var2);
        }
    }

    @ObfuscatedName("ag.e(Ldb;II)V")
    public void method805(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field979 = (char) arg0.method2101();
        } else if (arg1 == 2) {
            this.field977 = (char) arg0.method2101();
        } else if (arg1 == 3) {
            this.field981 = arg0.method2109();
        } else if (arg1 == 4) {
            this.field982 = arg0.method2106();
        } else if (arg1 == 5) {
            this.field987 = arg0.method2103();
            this.field980 = new int[this.field987];
            this.field984 = new String[this.field987];
            for (int var3 = 0; var3 < this.field987; var3++) {
                this.field980[var3] = arg0.method2106();
                this.field984[var3] = arg0.method2109();
            }
        } else if (arg1 == 6) {
            this.field987 = arg0.method2103();
            this.field980 = new int[this.field987];
            this.field985 = new int[this.field987];
            for (int var4 = 0; var4 < this.field987; var4++) {
                this.field980[var4] = arg0.method2106();
                this.field985[var4] = arg0.method2106();
            }
        }
    }
}

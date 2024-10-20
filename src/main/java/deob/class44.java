package deob;

@ObfuscatedName("an")
public class class44 extends class187 {

    @ObfuscatedName("an.y")
    public static class176 field967 = new class176(64);

    @ObfuscatedName("an.d")
    public char field966;

    @ObfuscatedName("an.c")
    public char field976;

    @ObfuscatedName("an.r")
    public String field970 = "null";

    @ObfuscatedName("an.f")
    public int field969;

    @ObfuscatedName("an.z")
    public int field972 = 0;

    @ObfuscatedName("an.o")
    public int[] field973;

    @ObfuscatedName("an.k")
    public int[] field974;

    @ObfuscatedName("an.s")
    public String[] field971;

    @ObfuscatedName("fy.p(II)Lan;")
    public static class44 method2883(int arg0) {
        class44 var1 = (class44) field967.method3198((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field968.method2811(8, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method851(new class110(var2));
        }
        field967.method3193(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.y(Ldg;B)V")
    public void method851(class110 arg0) {
        while (true) {
            int var2 = arg0.method2309();
            if (var2 == 0) {
                return;
            }
            this.method848(arg0, var2);
        }
    }

    @ObfuscatedName("an.d(Ldg;II)V")
    public void method848(class110 arg0, int arg1) {
        if (arg1 == 1) {
            this.field966 = (char) arg0.method2309();
        } else if (arg1 == 2) {
            this.field976 = (char) arg0.method2309();
        } else if (arg1 == 3) {
            this.field970 = arg0.method2132();
        } else if (arg1 == 4) {
            this.field969 = arg0.method2164();
        } else if (arg1 == 5) {
            this.field972 = arg0.method2243();
            this.field973 = new int[this.field972];
            this.field971 = new String[this.field972];
            for (int var3 = 0; var3 < this.field972; var3++) {
                this.field973[var3] = arg0.method2164();
                this.field971[var3] = arg0.method2132();
            }
        } else if (arg1 == 6) {
            this.field972 = arg0.method2243();
            this.field973 = new int[this.field972];
            this.field974 = new int[this.field972];
            for (int var4 = 0; var4 < this.field972; var4++) {
                this.field973[var4] = arg0.method2164();
                this.field974[var4] = arg0.method2164();
            }
        }
    }
}

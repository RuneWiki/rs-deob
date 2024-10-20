package deob;

@ObfuscatedName("ad")
public class class43 extends class182 {

    @ObfuscatedName("ad.r")
    public static class171 field989 = new class171(64);

    @ObfuscatedName("ad.y")
    public char field990;

    @ObfuscatedName("ad.w")
    public char field993;

    @ObfuscatedName("ad.m")
    public String field992 = "null";

    @ObfuscatedName("ad.j")
    public int field1001;

    @ObfuscatedName("ad.g")
    public int field994 = 0;

    @ObfuscatedName("ad.p")
    public int[] field995;

    @ObfuscatedName("ad.o")
    public int[] field991;

    @ObfuscatedName("ad.b")
    public String[] field997;

    @ObfuscatedName("ar.k(II)Lad;")
    public static class43 method758(int arg0) {
        class43 var1 = (class43) field989.method3141((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field996.method2749(8, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method827(new class107(var2));
        }
        field989.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.r(Lde;I)V")
    public void method827(class107 arg0) {
        while (true) {
            int var2 = arg0.method2111();
            if (var2 == 0) {
                return;
            }
            this.method828(arg0, var2);
        }
    }

    @ObfuscatedName("ad.y(Lde;II)V")
    public void method828(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field990 = (char) arg0.method2111();
        } else if (arg1 == 2) {
            this.field993 = (char) arg0.method2111();
        } else if (arg1 == 3) {
            this.field992 = arg0.method2119();
        } else if (arg1 == 4) {
            this.field1001 = arg0.method2116();
        } else if (arg1 == 5) {
            this.field994 = arg0.method2232();
            this.field995 = new int[this.field994];
            this.field997 = new String[this.field994];
            for (int var3 = 0; var3 < this.field994; var3++) {
                this.field995[var3] = arg0.method2116();
                this.field997[var3] = arg0.method2119();
            }
        } else if (arg1 == 6) {
            this.field994 = arg0.method2232();
            this.field995 = new int[this.field994];
            this.field991 = new int[this.field994];
            for (int var4 = 0; var4 < this.field994; var4++) {
                this.field995[var4] = arg0.method2116();
                this.field991[var4] = arg0.method2116();
            }
        }
    }
}

package deob;

@ObfuscatedName("ak")
public class class45 extends class195 {

    @ObfuscatedName("ak.l")
    public static class184 field1018 = new class184(64);

    @ObfuscatedName("ak.g")
    public char field1009;

    @ObfuscatedName("ak.u")
    public char field1010;

    @ObfuscatedName("ak.q")
    public String field1017 = "null";

    @ObfuscatedName("ak.r")
    public int field1012;

    @ObfuscatedName("ak.v")
    public int field1013 = 0;

    @ObfuscatedName("ak.y")
    public int[] field1016;

    @ObfuscatedName("ak.k")
    public int[] field1015;

    @ObfuscatedName("ak.c")
    public String[] field1008;

    @ObfuscatedName("e.o(Lfg;I)V")
    public static void method579(class158 arg0) {
        Statics.field3061 = arg0;
    }

    @ObfuscatedName("ew.l(II)Lak;")
    public static class45 method2919(int arg0) {
        class45 var1 = (class45) field1018.method3401((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3061.method2940(8, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method895(new class111(var2));
        }
        field1018.method3403(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.g(Ldk;I)V")
    public void method895(class111 arg0) {
        while (true) {
            int var2 = arg0.method2219();
            if (var2 == 0) {
                return;
            }
            this.method896(arg0, var2);
        }
    }

    @ObfuscatedName("ak.u(Ldk;II)V")
    public void method896(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1009 = (char) arg0.method2219();
        } else if (arg1 == 2) {
            this.field1010 = (char) arg0.method2219();
        } else if (arg1 == 3) {
            this.field1017 = arg0.method2339();
        } else if (arg1 == 4) {
            this.field1012 = arg0.method2273();
        } else if (arg1 == 5) {
            this.field1013 = arg0.method2397();
            this.field1016 = new int[this.field1013];
            this.field1008 = new String[this.field1013];
            for (int var3 = 0; var3 < this.field1013; var3++) {
                this.field1016[var3] = arg0.method2273();
                this.field1008[var3] = arg0.method2339();
            }
        } else if (arg1 == 6) {
            this.field1013 = arg0.method2397();
            this.field1016 = new int[this.field1013];
            this.field1015 = new int[this.field1013];
            for (int var4 = 0; var4 < this.field1013; var4++) {
                this.field1016[var4] = arg0.method2273();
                this.field1015[var4] = arg0.method2273();
            }
        }
    }
}

package deob;

@ObfuscatedName("gv")
public class class196 extends class130 {

    @ObfuscatedName("gv.d")
    public static class125 field2856 = new class125(64);

    @ObfuscatedName("gv.m")
    public char field2857;

    @ObfuscatedName("gv.h")
    public char field2859;

    @ObfuscatedName("gv.w")
    public String field2855 = "null";

    @ObfuscatedName("gv.r")
    public int field2860;

    @ObfuscatedName("gv.c")
    public int field2861 = 0;

    @ObfuscatedName("gv.p")
    public int[] field2862;

    @ObfuscatedName("gv.g")
    public int[] field2863;

    @ObfuscatedName("gv.z")
    public String[] field2864;

    @ObfuscatedName("fg.n(Lgj;I)V")
    public static void method3077(class183 arg0) {
        Statics.field2865 = arg0;
    }

    @ObfuscatedName("cp.d(IB)Lgv;")
    public static class196 method1648(int arg0) {
        class196 var1 = (class196) field2856.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2865.method3093(8, arg0);
        class196 var3 = new class196();
        if (var2 != null) {
            var3.method3359(new class161(var2));
        }
        field2856.method2219(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gv.m(Lfa;I)V")
    public void method3359(class161 arg0) {
        while (true) {
            int var2 = arg0.method2823();
            if (var2 == 0) {
                return;
            }
            this.method3361(arg0, var2);
        }
    }

    @ObfuscatedName("gv.h(Lfa;II)V")
    public void method3361(class161 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2857 = (char) arg0.method2823();
        } else if (arg1 == 2) {
            this.field2859 = (char) arg0.method2823();
        } else if (arg1 == 3) {
            this.field2855 = arg0.method2847();
        } else if (arg1 == 4) {
            this.field2860 = arg0.method2785();
        } else if (arg1 == 5) {
            this.field2861 = arg0.method2887();
            this.field2862 = new int[this.field2861];
            this.field2864 = new String[this.field2861];
            for (int var3 = 0; var3 < this.field2861; var3++) {
                this.field2862[var3] = arg0.method2785();
                this.field2864[var3] = arg0.method2847();
            }
        } else if (arg1 == 6) {
            this.field2861 = arg0.method2887();
            this.field2862 = new int[this.field2861];
            this.field2863 = new int[this.field2861];
            for (int var4 = 0; var4 < this.field2861; var4++) {
                this.field2862[var4] = arg0.method2785();
                this.field2863[var4] = arg0.method2785();
            }
        }
    }
}

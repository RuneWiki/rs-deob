package deob;

@ObfuscatedName("gj")
public class class196 extends class130 {

    @ObfuscatedName("gj.c")
    public static class125 field2860 = new class125(64);

    @ObfuscatedName("gj.f")
    public char field2861;

    @ObfuscatedName("gj.h")
    public char field2862;

    @ObfuscatedName("gj.a")
    public String field2863 = "null";

    @ObfuscatedName("gj.g")
    public int field2865;

    @ObfuscatedName("gj.k")
    public int field2869 = 0;

    @ObfuscatedName("gj.u")
    public int[] field2866;

    @ObfuscatedName("gj.b")
    public int[] field2867;

    @ObfuscatedName("gj.x")
    public String[] field2868;

    @ObfuscatedName("gq.s(II)Lgj;")
    public static class196 method3224(int arg0) {
        class196 var1 = (class196) field2860.method2121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2864.method2986(8, arg0);
        class196 var3 = new class196();
        if (var2 != null) {
            var3.method3246(new class154(var2));
        }
        field2860.method2123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gj.c(Lea;I)V")
    public void method3246(class154 arg0) {
        while (true) {
            int var2 = arg0.method2545();
            if (var2 == 0) {
                return;
            }
            this.method3240(arg0, var2);
        }
    }

    @ObfuscatedName("gj.f(Lea;II)V")
    public void method3240(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2861 = (char) arg0.method2545();
        } else if (arg1 == 2) {
            this.field2862 = (char) arg0.method2545();
        } else if (arg1 == 3) {
            this.field2863 = arg0.method2734();
        } else if (arg1 == 4) {
            this.field2865 = arg0.method2550();
        } else if (arg1 == 5) {
            this.field2869 = arg0.method2541();
            this.field2866 = new int[this.field2869];
            this.field2868 = new String[this.field2869];
            for (int var3 = 0; var3 < this.field2869; var3++) {
                this.field2866[var3] = arg0.method2550();
                this.field2868[var3] = arg0.method2734();
            }
        } else if (arg1 == 6) {
            this.field2869 = arg0.method2541();
            this.field2866 = new int[this.field2869];
            this.field2867 = new int[this.field2869];
            for (int var4 = 0; var4 < this.field2869; var4++) {
                this.field2866[var4] = arg0.method2550();
                this.field2867[var4] = arg0.method2550();
            }
        }
    }
}

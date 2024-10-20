package deob;

@ObfuscatedName("af")
public class class45 extends class195 {

    @ObfuscatedName("af.o")
    public static class184 field1038 = new class184(64);

    @ObfuscatedName("af.a")
    public char field1041;

    @ObfuscatedName("af.w")
    public char field1039;

    @ObfuscatedName("af.m")
    public String field1040 = "null";

    @ObfuscatedName("af.h")
    public int field1036;

    @ObfuscatedName("af.i")
    public int field1042 = 0;

    @ObfuscatedName("af.r")
    public int[] field1043;

    @ObfuscatedName("af.l")
    public int[] field1044;

    @ObfuscatedName("af.f")
    public String[] field1046;

    @ObfuscatedName("ee.n(Lfd;I)V")
    public static void method2703(class158 arg0) {
        Statics.field1037 = arg0;
    }

    @ObfuscatedName("aa.o(II)Laf;")
    public static class45 method907(int arg0) {
        class45 var1 = (class45) field1038.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1037.method2925(8, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method882(new class111(var2));
        }
        field1038.method3372(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.a(Ldl;I)V")
    public void method882(class111 arg0) {
        while (true) {
            int var2 = arg0.method2234();
            if (var2 == 0) {
                return;
            }
            this.method884(arg0, var2);
        }
    }

    @ObfuscatedName("af.w(Ldl;II)V")
    public void method884(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1041 = (char) arg0.method2234();
        } else if (arg1 == 2) {
            this.field1039 = (char) arg0.method2234();
        } else if (arg1 == 3) {
            this.field1040 = arg0.method2242();
        } else if (arg1 == 4) {
            this.field1036 = arg0.method2239();
        } else if (arg1 == 5) {
            this.field1042 = arg0.method2236();
            this.field1043 = new int[this.field1042];
            this.field1046 = new String[this.field1042];
            for (int var3 = 0; var3 < this.field1042; var3++) {
                this.field1043[var3] = arg0.method2239();
                this.field1046[var3] = arg0.method2242();
            }
        } else if (arg1 == 6) {
            this.field1042 = arg0.method2236();
            this.field1043 = new int[this.field1042];
            this.field1044 = new int[this.field1042];
            for (int var4 = 0; var4 < this.field1042; var4++) {
                this.field1043[var4] = arg0.method2239();
                this.field1044[var4] = arg0.method2239();
            }
        }
    }
}

package deob;

@ObfuscatedName("af")
public class class49 extends class204 {

    @ObfuscatedName("af.m")
    public static class193 field1069 = new class193(64);

    @ObfuscatedName("af.f")
    public char field1062;

    @ObfuscatedName("af.l")
    public char field1063;

    @ObfuscatedName("af.u")
    public String field1065 = "null";

    @ObfuscatedName("af.a")
    public int field1067;

    @ObfuscatedName("af.h")
    public int field1066 = 0;

    @ObfuscatedName("af.i")
    public int[] field1060;

    @ObfuscatedName("af.t")
    public int[] field1068;

    @ObfuscatedName("af.k")
    public String[] field1061;

    @ObfuscatedName("dq.j(Lfa;I)V")
    public static void method2312(class167 arg0) {
        Statics.field1070 = arg0;
    }

    @ObfuscatedName("af.m(Ldc;I)V")
    public void method994(class119 arg0) {
        while (true) {
            int var2 = arg0.method2372();
            if (var2 == 0) {
                return;
            }
            this.method993(arg0, var2);
        }
    }

    @ObfuscatedName("af.f(Ldc;IS)V")
    public void method993(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1062 = (char) arg0.method2372();
        } else if (arg1 == 2) {
            this.field1063 = (char) arg0.method2372();
        } else if (arg1 == 3) {
            this.field1065 = arg0.method2380();
        } else if (arg1 == 4) {
            this.field1067 = arg0.method2377();
        } else if (arg1 == 5) {
            this.field1066 = arg0.method2374();
            this.field1060 = new int[this.field1066];
            this.field1061 = new String[this.field1066];
            for (int var3 = 0; var3 < this.field1066; var3++) {
                this.field1060[var3] = arg0.method2377();
                this.field1061[var3] = arg0.method2380();
            }
        } else if (arg1 == 6) {
            this.field1066 = arg0.method2374();
            this.field1060 = new int[this.field1066];
            this.field1068 = new int[this.field1066];
            for (int var4 = 0; var4 < this.field1066; var4++) {
                this.field1060[var4] = arg0.method2377();
                this.field1068[var4] = arg0.method2377();
            }
        }
    }
}

package deob;

@ObfuscatedName("au")
public class class49 extends class205 {

    @ObfuscatedName("au.u")
    public static class194 field1089 = new class194(64);

    @ObfuscatedName("au.x")
    public char field1090;

    @ObfuscatedName("au.b")
    public char field1091;

    @ObfuscatedName("au.l")
    public String field1098 = "null";

    @ObfuscatedName("au.d")
    public int field1096;

    @ObfuscatedName("au.n")
    public int field1094 = 0;

    @ObfuscatedName("au.m")
    public int[] field1095;

    @ObfuscatedName("au.g")
    public int[] field1092;

    @ObfuscatedName("au.s")
    public String[] field1097;

    @ObfuscatedName("au.f(Ldj;B)V")
    public void method1011(class120 arg0) {
        while (true) {
            int var2 = arg0.method2385();
            if (var2 == 0) {
                return;
            }
            this.method1013(arg0, var2);
        }
    }

    @ObfuscatedName("au.u(Ldj;II)V")
    public void method1013(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1090 = (char) arg0.method2385();
        } else if (arg1 == 2) {
            this.field1091 = (char) arg0.method2385();
        } else if (arg1 == 3) {
            this.field1098 = arg0.method2499();
        } else if (arg1 == 4) {
            this.field1096 = arg0.method2527();
        } else if (arg1 == 5) {
            this.field1094 = arg0.method2387();
            this.field1095 = new int[this.field1094];
            this.field1097 = new String[this.field1094];
            for (int var3 = 0; var3 < this.field1094; var3++) {
                this.field1095[var3] = arg0.method2527();
                this.field1097[var3] = arg0.method2499();
            }
        } else if (arg1 == 6) {
            this.field1094 = arg0.method2387();
            this.field1095 = new int[this.field1094];
            this.field1092 = new int[this.field1094];
            for (int var4 = 0; var4 < this.field1094; var4++) {
                this.field1095[var4] = arg0.method2527();
                this.field1092[var4] = arg0.method2527();
            }
        }
    }
}

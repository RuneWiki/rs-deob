package deob;

@ObfuscatedName("at")
public class class49 extends class205 {

    @ObfuscatedName("at.i")
    public static class194 field1088 = new class194(64);

    @ObfuscatedName("at.g")
    public char field1085;

    @ObfuscatedName("at.h")
    public char field1086;

    @ObfuscatedName("at.z")
    public String field1087 = "null";

    @ObfuscatedName("at.r")
    public int field1090;

    @ObfuscatedName("at.f")
    public int field1089 = 0;

    @ObfuscatedName("at.s")
    public int[] field1094;

    @ObfuscatedName("at.d")
    public int[] field1091;

    @ObfuscatedName("at.l")
    public String[] field1092;

    @ObfuscatedName("at.t(Ldr;I)V")
    public void method931(class120 arg0) {
        while (true) {
            int var2 = arg0.method2334();
            if (var2 == 0) {
                return;
            }
            this.method932(arg0, var2);
        }
    }

    @ObfuscatedName("at.i(Ldr;IB)V")
    public void method932(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1085 = (char) arg0.method2334();
        } else if (arg1 == 2) {
            this.field1086 = (char) arg0.method2334();
        } else if (arg1 == 3) {
            this.field1087 = arg0.method2316();
        } else if (arg1 == 4) {
            this.field1090 = arg0.method2345();
        } else if (arg1 == 5) {
            this.field1089 = arg0.method2310();
            this.field1094 = new int[this.field1089];
            this.field1092 = new String[this.field1089];
            for (int var3 = 0; var3 < this.field1089; var3++) {
                this.field1094[var3] = arg0.method2345();
                this.field1092[var3] = arg0.method2316();
            }
        } else if (arg1 == 6) {
            this.field1089 = arg0.method2310();
            this.field1094 = new int[this.field1089];
            this.field1091 = new int[this.field1089];
            for (int var4 = 0; var4 < this.field1089; var4++) {
                this.field1094[var4] = arg0.method2345();
                this.field1091[var4] = arg0.method2345();
            }
        }
    }
}

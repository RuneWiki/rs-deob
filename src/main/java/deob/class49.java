package deob;

@ObfuscatedName("aj")
public class class49 extends class204 {

    @ObfuscatedName("aj.h")
    public static class193 field1058 = new class193(64);

    @ObfuscatedName("aj.o")
    public char field1066;

    @ObfuscatedName("aj.z")
    public char field1060;

    @ObfuscatedName("aj.c")
    public String field1068 = "null";

    @ObfuscatedName("aj.d")
    public int field1057;

    @ObfuscatedName("aj.l")
    public int field1063 = 0;

    @ObfuscatedName("aj.b")
    public int[] field1064;

    @ObfuscatedName("aj.j")
    public int[] field1065;

    @ObfuscatedName("aj.f")
    public String[] field1062;

    @ObfuscatedName("a.k(Lfo;I)V")
    public static void method182(class167 arg0) {
        Statics.field1061 = arg0;
    }

    @ObfuscatedName("aj.h(Ldk;I)V")
    public void method947(class119 arg0) {
        while (true) {
            int var2 = arg0.method2330();
            if (var2 == 0) {
                return;
            }
            this.method941(arg0, var2);
        }
    }

    @ObfuscatedName("aj.o(Ldk;II)V")
    public void method941(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1066 = (char) arg0.method2330();
        } else if (arg1 == 2) {
            this.field1060 = (char) arg0.method2330();
        } else if (arg1 == 3) {
            this.field1068 = arg0.method2337();
        } else if (arg1 == 4) {
            this.field1057 = arg0.method2415();
        } else if (arg1 == 5) {
            this.field1063 = arg0.method2332();
            this.field1064 = new int[this.field1063];
            this.field1062 = new String[this.field1063];
            for (int var3 = 0; var3 < this.field1063; var3++) {
                this.field1064[var3] = arg0.method2415();
                this.field1062[var3] = arg0.method2337();
            }
        } else if (arg1 == 6) {
            this.field1063 = arg0.method2332();
            this.field1064 = new int[this.field1063];
            this.field1065 = new int[this.field1063];
            for (int var4 = 0; var4 < this.field1063; var4++) {
                this.field1064[var4] = arg0.method2415();
                this.field1065[var4] = arg0.method2415();
            }
        }
    }
}

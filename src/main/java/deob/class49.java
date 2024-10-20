package deob;

@ObfuscatedName("ae")
public class class49 extends class204 {

    @ObfuscatedName("ae.q")
    public static class193 field1089 = new class193(64);

    @ObfuscatedName("ae.v")
    public char field1079;

    @ObfuscatedName("ae.n")
    public char field1084;

    @ObfuscatedName("ae.f")
    public String field1081 = "null";

    @ObfuscatedName("ae.g")
    public int field1082;

    @ObfuscatedName("ae.o")
    public int field1083 = 0;

    @ObfuscatedName("ae.s")
    public int[] field1086;

    @ObfuscatedName("ae.k")
    public int[] field1085;

    @ObfuscatedName("ae.b")
    public String[] field1080;

    @ObfuscatedName("i.h(Lfv;I)V")
    public static void method173(class167 arg0) {
        Statics.field1078 = arg0;
    }

    @ObfuscatedName("ae.q(Ldm;I)V")
    public void method965(class119 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method967(arg0, var2);
        }
    }

    @ObfuscatedName("ae.v(Ldm;II)V")
    public void method967(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1079 = (char) arg0.method2383();
        } else if (arg1 == 2) {
            this.field1084 = (char) arg0.method2383();
        } else if (arg1 == 3) {
            this.field1081 = arg0.method2391();
        } else if (arg1 == 4) {
            this.field1082 = arg0.method2388();
        } else if (arg1 == 5) {
            this.field1083 = arg0.method2385();
            this.field1086 = new int[this.field1083];
            this.field1080 = new String[this.field1083];
            for (int var3 = 0; var3 < this.field1083; var3++) {
                this.field1086[var3] = arg0.method2388();
                this.field1080[var3] = arg0.method2391();
            }
        } else if (arg1 == 6) {
            this.field1083 = arg0.method2385();
            this.field1086 = new int[this.field1083];
            this.field1085 = new int[this.field1083];
            for (int var4 = 0; var4 < this.field1083; var4++) {
                this.field1086[var4] = arg0.method2388();
                this.field1085[var4] = arg0.method2388();
            }
        }
    }
}

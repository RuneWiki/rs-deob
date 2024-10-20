package deob;

@ObfuscatedName("ay")
public class class49 extends class204 {

    @ObfuscatedName("ay.l")
    public static class193 field1078 = new class193(64);

    @ObfuscatedName("ay.a")
    public char field1079;

    @ObfuscatedName("ay.i")
    public char field1087;

    @ObfuscatedName("ay.f")
    public String field1081 = "null";

    @ObfuscatedName("ay.m")
    public int field1082;

    @ObfuscatedName("ay.o")
    public int field1083 = 0;

    @ObfuscatedName("ay.h")
    public int[] field1080;

    @ObfuscatedName("ay.n")
    public int[] field1077;

    @ObfuscatedName("ay.k")
    public String[] field1086;

    @ObfuscatedName("ac.j(Lff;I)V")
    public static void method692(class167 arg0) {
        Statics.field1084 = arg0;
    }

    @ObfuscatedName("ay.l(Ldc;I)V")
    public void method970(class119 arg0) {
        while (true) {
            int var2 = arg0.method2316();
            if (var2 == 0) {
                return;
            }
            this.method967(arg0, var2);
        }
    }

    @ObfuscatedName("ay.a(Ldc;IB)V")
    public void method967(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1079 = (char) arg0.method2316();
        } else if (arg1 == 2) {
            this.field1087 = (char) arg0.method2316();
        } else if (arg1 == 3) {
            this.field1081 = arg0.method2324();
        } else if (arg1 == 4) {
            this.field1082 = arg0.method2321();
        } else if (arg1 == 5) {
            this.field1083 = arg0.method2318();
            this.field1080 = new int[this.field1083];
            this.field1086 = new String[this.field1083];
            for (int var3 = 0; var3 < this.field1083; var3++) {
                this.field1080[var3] = arg0.method2321();
                this.field1086[var3] = arg0.method2324();
            }
        } else if (arg1 == 6) {
            this.field1083 = arg0.method2318();
            this.field1080 = new int[this.field1083];
            this.field1077 = new int[this.field1083];
            for (int var4 = 0; var4 < this.field1083; var4++) {
                this.field1080[var4] = arg0.method2321();
                this.field1077[var4] = arg0.method2321();
            }
        }
    }
}

package deob;

@ObfuscatedName("ar")
public class class49 extends class204 {

    @ObfuscatedName("ar.q")
    public static class193 field1085 = new class193(64);

    @ObfuscatedName("ar.c")
    public char field1078;

    @ObfuscatedName("ar.l")
    public char field1079;

    @ObfuscatedName("ar.r")
    public String field1077 = "null";

    @ObfuscatedName("ar.u")
    public int field1080;

    @ObfuscatedName("ar.j")
    public int field1082 = 0;

    @ObfuscatedName("ar.w")
    public int[] field1086;

    @ObfuscatedName("ar.y")
    public int[] field1084;

    @ObfuscatedName("ar.o")
    public String[] field1083;

    @ObfuscatedName("ed.n(Lfm;I)V")
    public static void method2848(class167 arg0) {
        Statics.field1076 = arg0;
    }

    @ObfuscatedName("ar.q(Ldc;B)V")
    public void method985(class119 arg0) {
        while (true) {
            int var2 = arg0.method2360();
            if (var2 == 0) {
                return;
            }
            this.method984(arg0, var2);
        }
    }

    @ObfuscatedName("ar.c(Ldc;IB)V")
    public void method984(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1078 = (char) arg0.method2360();
        } else if (arg1 == 2) {
            this.field1079 = (char) arg0.method2360();
        } else if (arg1 == 3) {
            this.field1077 = arg0.method2368();
        } else if (arg1 == 4) {
            this.field1080 = arg0.method2365();
        } else if (arg1 == 5) {
            this.field1082 = arg0.method2430();
            this.field1086 = new int[this.field1082];
            this.field1083 = new String[this.field1082];
            for (int var3 = 0; var3 < this.field1082; var3++) {
                this.field1086[var3] = arg0.method2365();
                this.field1083[var3] = arg0.method2368();
            }
        } else if (arg1 == 6) {
            this.field1082 = arg0.method2430();
            this.field1086 = new int[this.field1082];
            this.field1084 = new int[this.field1082];
            for (int var4 = 0; var4 < this.field1082; var4++) {
                this.field1086[var4] = arg0.method2365();
                this.field1084[var4] = arg0.method2365();
            }
        }
    }
}

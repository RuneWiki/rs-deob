package deob;

@ObfuscatedName("at")
public class class49 extends class204 {

    @ObfuscatedName("at.v")
    public static class193 field1074 = new class193(64);

    @ObfuscatedName("at.r")
    public char field1072;

    @ObfuscatedName("at.n")
    public char field1083;

    @ObfuscatedName("at.x")
    public String field1084 = "null";

    @ObfuscatedName("at.q")
    public int field1076;

    @ObfuscatedName("at.h")
    public int field1077 = 0;

    @ObfuscatedName("at.d")
    public int[] field1078;

    @ObfuscatedName("at.c")
    public int[] field1079;

    @ObfuscatedName("at.y")
    public String[] field1071;

    @ObfuscatedName("cc.i(Lfe;I)V")
    public static void method2037(class167 arg0) {
        Statics.field1075 = arg0;
    }

    @ObfuscatedName("at.r(Ldx;I)V")
    public void method985(class119 arg0) {
        while (true) {
            int var2 = arg0.method2380();
            if (var2 == 0) {
                return;
            }
            this.method987(arg0, var2);
        }
    }

    @ObfuscatedName("at.n(Ldx;II)V")
    public void method987(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1072 = (char) arg0.method2380();
        } else if (arg1 == 2) {
            this.field1083 = (char) arg0.method2380();
        } else if (arg1 == 3) {
            this.field1084 = arg0.method2356();
        } else if (arg1 == 4) {
            this.field1076 = arg0.method2350();
        } else if (arg1 == 5) {
            this.field1077 = arg0.method2347();
            this.field1078 = new int[this.field1077];
            this.field1071 = new String[this.field1077];
            for (int var3 = 0; var3 < this.field1077; var3++) {
                this.field1078[var3] = arg0.method2350();
                this.field1071[var3] = arg0.method2356();
            }
        } else if (arg1 == 6) {
            this.field1077 = arg0.method2347();
            this.field1078 = new int[this.field1077];
            this.field1079 = new int[this.field1077];
            for (int var4 = 0; var4 < this.field1077; var4++) {
                this.field1078[var4] = arg0.method2350();
                this.field1079[var4] = arg0.method2350();
            }
        }
    }
}

package deob;

@ObfuscatedName("ap")
public class class49 extends class204 {

    @ObfuscatedName("ap.q")
    public static class193 field1070 = new class193(64);

    @ObfuscatedName("ap.k")
    public char field1071;

    @ObfuscatedName("ap.f")
    public char field1077;

    @ObfuscatedName("ap.d")
    public String field1073 = "null";

    @ObfuscatedName("ap.l")
    public int field1074;

    @ObfuscatedName("ap.r")
    public int field1075 = 0;

    @ObfuscatedName("ap.g")
    public int[] field1072;

    @ObfuscatedName("ap.h")
    public int[] field1069;

    @ObfuscatedName("ap.n")
    public String[] field1078;

    @ObfuscatedName("h.z(Lfl;I)V")
    public static void method116(class167 arg0) {
        Statics.field1080 = arg0;
    }

    @ObfuscatedName("ax.q(IB)Lap;")
    public static class49 method910(int arg0) {
        class49 var1 = (class49) field1070.method3439((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1080.method2986(8, arg0);
        class49 var3 = new class49();
        if (var2 != null) {
            var3.method947(new class119(var2));
        }
        field1070.method3429(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.k(Lda;I)V")
    public void method947(class119 arg0) {
        while (true) {
            int var2 = arg0.method2457();
            if (var2 == 0) {
                return;
            }
            this.method948(arg0, var2);
        }
    }

    @ObfuscatedName("ap.f(Lda;IB)V")
    public void method948(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1071 = (char) arg0.method2457();
        } else if (arg1 == 2) {
            this.field1077 = (char) arg0.method2457();
        } else if (arg1 == 3) {
            this.field1073 = arg0.method2309();
        } else if (arg1 == 4) {
            this.field1074 = arg0.method2306();
        } else if (arg1 == 5) {
            this.field1075 = arg0.method2415();
            this.field1072 = new int[this.field1075];
            this.field1078 = new String[this.field1075];
            for (int var3 = 0; var3 < this.field1075; var3++) {
                this.field1072[var3] = arg0.method2306();
                this.field1078[var3] = arg0.method2309();
            }
        } else if (arg1 == 6) {
            this.field1075 = arg0.method2415();
            this.field1072 = new int[this.field1075];
            this.field1069 = new int[this.field1075];
            for (int var4 = 0; var4 < this.field1075; var4++) {
                this.field1072[var4] = arg0.method2306();
                this.field1069[var4] = arg0.method2306();
            }
        }
    }
}

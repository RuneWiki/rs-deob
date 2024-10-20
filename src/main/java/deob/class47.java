package deob;

@ObfuscatedName("am")
public class class47 extends class198 {

    @ObfuscatedName("am.y")
    public static class187 field1048 = new class187(64);

    @ObfuscatedName("am.z")
    public char field1055;

    @ObfuscatedName("am.l")
    public char field1050;

    @ObfuscatedName("am.w")
    public String field1051 = "null";

    @ObfuscatedName("am.d")
    public int field1047;

    @ObfuscatedName("am.f")
    public int field1053 = 0;

    @ObfuscatedName("am.i")
    public int[] field1054;

    @ObfuscatedName("am.a")
    public int[] field1057;

    @ObfuscatedName("am.o")
    public String[] field1056;

    @ObfuscatedName("ak.j(Lfh;I)V")
    public static void method655(class161 arg0) {
        Statics.field1049 = arg0;
    }

    @ObfuscatedName("dk.y(II)Lam;")
    public static class47 method2685(int arg0) {
        class47 var1 = (class47) field1048.method3432((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1049.method2995(8, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method981(new class114(var2));
        }
        field1048.method3434(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.z(Lde;B)V")
    public void method981(class114 arg0) {
        while (true) {
            int var2 = arg0.method2322();
            if (var2 == 0) {
                return;
            }
            this.method996(arg0, var2);
        }
    }

    @ObfuscatedName("am.l(Lde;II)V")
    public void method996(class114 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1055 = (char) arg0.method2322();
        } else if (arg1 == 2) {
            this.field1050 = (char) arg0.method2322();
        } else if (arg1 == 3) {
            this.field1051 = arg0.method2440();
        } else if (arg1 == 4) {
            this.field1047 = arg0.method2327();
        } else if (arg1 == 5) {
            this.field1053 = arg0.method2324();
            this.field1054 = new int[this.field1053];
            this.field1056 = new String[this.field1053];
            for (int var3 = 0; var3 < this.field1053; var3++) {
                this.field1054[var3] = arg0.method2327();
                this.field1056[var3] = arg0.method2440();
            }
        } else if (arg1 == 6) {
            this.field1053 = arg0.method2324();
            this.field1054 = new int[this.field1053];
            this.field1057 = new int[this.field1053];
            for (int var4 = 0; var4 < this.field1053; var4++) {
                this.field1054[var4] = arg0.method2327();
                this.field1057[var4] = arg0.method2327();
            }
        }
    }
}

package deob;

@ObfuscatedName("ae")
public class class49 extends class204 {

    @ObfuscatedName("ae.h")
    public static class193 field1073 = new class193(64);

    @ObfuscatedName("ae.k")
    public char field1082;

    @ObfuscatedName("ae.t")
    public char field1075;

    @ObfuscatedName("ae.g")
    public String field1076 = "null";

    @ObfuscatedName("ae.o")
    public int field1077;

    @ObfuscatedName("ae.i")
    public int field1078 = 0;

    @ObfuscatedName("ae.w")
    public int[] field1074;

    @ObfuscatedName("ae.m")
    public int[] field1080;

    @ObfuscatedName("ae.r")
    public String[] field1079;

    @ObfuscatedName("dj.c(IS)Lae;")
    public static class49 method2168(int arg0) {
        class49 var1 = (class49) field1073.method3485((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2897.method2994(8, arg0);
        class49 var3 = new class49();
        if (var2 != null) {
            var3.method956(new class119(var2));
        }
        field1073.method3487(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.h(Ldf;B)V")
    public void method956(class119 arg0) {
        while (true) {
            int var2 = arg0.method2291();
            if (var2 == 0) {
                return;
            }
            this.method949(arg0, var2);
        }
    }

    @ObfuscatedName("ae.k(Ldf;II)V")
    public void method949(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1082 = (char) arg0.method2291();
        } else if (arg1 == 2) {
            this.field1075 = (char) arg0.method2291();
        } else if (arg1 == 3) {
            this.field1076 = arg0.method2299();
        } else if (arg1 == 4) {
            this.field1077 = arg0.method2296();
        } else if (arg1 == 5) {
            this.field1078 = arg0.method2293();
            this.field1074 = new int[this.field1078];
            this.field1079 = new String[this.field1078];
            for (int var3 = 0; var3 < this.field1078; var3++) {
                this.field1074[var3] = arg0.method2296();
                this.field1079[var3] = arg0.method2299();
            }
        } else if (arg1 == 6) {
            this.field1078 = arg0.method2293();
            this.field1074 = new int[this.field1078];
            this.field1080 = new int[this.field1078];
            for (int var4 = 0; var4 < this.field1078; var4++) {
                this.field1074[var4] = arg0.method2296();
                this.field1080[var4] = arg0.method2296();
            }
        }
    }
}

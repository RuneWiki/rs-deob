package deob;

@ObfuscatedName("ao")
public class class49 extends class205 {

    @ObfuscatedName("ao.w")
    public static class194 field1066 = new class194(64);

    @ObfuscatedName("ao.f")
    public char field1060;

    @ObfuscatedName("ao.s")
    public char field1053;

    @ObfuscatedName("ao.p")
    public String field1056 = "null";

    @ObfuscatedName("ao.h")
    public int field1055;

    @ObfuscatedName("ao.g")
    public int field1058 = 0;

    @ObfuscatedName("ao.a")
    public int[] field1059;

    @ObfuscatedName("ao.r")
    public int[] field1057;

    @ObfuscatedName("ao.k")
    public String[] field1061;

    @ObfuscatedName("em.e(II)Lao;")
    public static class49 method2908(int arg0) {
        class49 var1 = (class49) field1066.method3473((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1054.method3048(8, arg0);
        class49 var3 = new class49();
        if (var2 != null) {
            var3.method959(new class120(var2));
        }
        field1066.method3475(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.w(Ldq;I)V")
    public void method959(class120 arg0) {
        while (true) {
            int var2 = arg0.method2355();
            if (var2 == 0) {
                return;
            }
            this.method960(arg0, var2);
        }
    }

    @ObfuscatedName("ao.f(Ldq;IB)V")
    public void method960(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1060 = (char) arg0.method2355();
        } else if (arg1 == 2) {
            this.field1053 = (char) arg0.method2355();
        } else if (arg1 == 3) {
            this.field1056 = arg0.method2363();
        } else if (arg1 == 4) {
            this.field1055 = arg0.method2360();
        } else if (arg1 == 5) {
            this.field1058 = arg0.method2532();
            this.field1059 = new int[this.field1058];
            this.field1061 = new String[this.field1058];
            for (int var3 = 0; var3 < this.field1058; var3++) {
                this.field1059[var3] = arg0.method2360();
                this.field1061[var3] = arg0.method2363();
            }
        } else if (arg1 == 6) {
            this.field1058 = arg0.method2532();
            this.field1059 = new int[this.field1058];
            this.field1057 = new int[this.field1058];
            for (int var4 = 0; var4 < this.field1058; var4++) {
                this.field1059[var4] = arg0.method2360();
                this.field1057[var4] = arg0.method2360();
            }
        }
    }
}

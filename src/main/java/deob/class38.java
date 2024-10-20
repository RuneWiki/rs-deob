package deob;

@ObfuscatedName("ag")
public class class38 extends class172 {

    @ObfuscatedName("ag.j")
    public static class168 field947 = new class168(64);

    @ObfuscatedName("ag.f")
    public int field944;

    @ObfuscatedName("ag.y")
    public char field945;

    @ObfuscatedName("ag.x")
    public String field946 = "null";

    @ObfuscatedName("ag.e")
    public int field949;

    @ObfuscatedName("ag.m")
    public int field942 = 0;

    @ObfuscatedName("ag.s")
    public int[] field948;

    @ObfuscatedName("ag.p")
    public int[] field950;

    @ObfuscatedName("ag.w")
    public String[] field951;

    @ObfuscatedName("l.c(IB)Lag;")
    public static class38 method140(int arg0) {
        class38 var1 = (class38) field947.method3087((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field943.method2821(8, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method777(new class125(var2));
        }
        field947.method3089(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.j(Ldl;I)V")
    public void method777(class125 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method778(arg0, var2);
        }
    }

    @ObfuscatedName("ag.f(Ldl;IB)V")
    public void method778(class125 arg0, int arg1) {
        if (arg1 == 1) {
            this.field944 = arg0.method2326();
        } else if (arg1 == 2) {
            this.field945 = (char) arg0.method2326();
        } else if (arg1 == 3) {
            this.field946 = arg0.method2515();
        } else if (arg1 == 4) {
            this.field949 = arg0.method2489();
        } else if (arg1 == 5) {
            this.field942 = arg0.method2328();
            this.field948 = new int[this.field942];
            this.field951 = new String[this.field942];
            for (int var3 = 0; var3 < this.field942; var3++) {
                this.field948[var3] = arg0.method2489();
                this.field951[var3] = arg0.method2515();
            }
        } else if (arg1 == 6) {
            this.field942 = arg0.method2328();
            this.field948 = new int[this.field942];
            this.field950 = new int[this.field942];
            for (int var4 = 0; var4 < this.field942; var4++) {
                this.field948[var4] = arg0.method2489();
                this.field950[var4] = arg0.method2489();
            }
        }
    }
}

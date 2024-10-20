package deob;

@ObfuscatedName("aj")
public class class38 extends class172 {

    @ObfuscatedName("aj.y")
    public static class168 field951 = new class168(64);

    @ObfuscatedName("aj.x")
    public int field943;

    @ObfuscatedName("aj.z")
    public char field944;

    @ObfuscatedName("aj.c")
    public String field945 = "null";

    @ObfuscatedName("aj.e")
    public int field946;

    @ObfuscatedName("aj.s")
    public int field947 = 0;

    @ObfuscatedName("aj.i")
    public int[] field948;

    @ObfuscatedName("aj.g")
    public int[] field949;

    @ObfuscatedName("aj.q")
    public String[] field950;

    @ObfuscatedName("w.j(Leh;B)V")
    public static void method116(class150 arg0) {
        Statics.field954 = arg0;
    }

    @ObfuscatedName("fc.y(II)Laj;")
    public static class38 method3078(int arg0) {
        class38 var1 = (class38) field951.method3191((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field954.method2903(8, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method802(new class126(var2));
        }
        field951.method3181(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.x(Ldr;I)V")
    public void method802(class126 arg0) {
        while (true) {
            int var2 = arg0.method2399();
            if (var2 == 0) {
                return;
            }
            this.method803(arg0, var2);
        }
    }

    @ObfuscatedName("aj.z(Ldr;IS)V")
    public void method803(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field943 = arg0.method2399();
        } else if (arg1 == 2) {
            this.field944 = (char) arg0.method2399();
        } else if (arg1 == 3) {
            this.field945 = arg0.method2390();
        } else if (arg1 == 4) {
            this.field946 = arg0.method2387();
        } else if (arg1 == 5) {
            this.field947 = arg0.method2405();
            this.field948 = new int[this.field947];
            this.field950 = new String[this.field947];
            for (int var3 = 0; var3 < this.field947; var3++) {
                this.field948[var3] = arg0.method2387();
                this.field950[var3] = arg0.method2390();
            }
        } else if (arg1 == 6) {
            this.field947 = arg0.method2405();
            this.field948 = new int[this.field947];
            this.field949 = new int[this.field947];
            for (int var4 = 0; var4 < this.field947; var4++) {
                this.field948[var4] = arg0.method2387();
                this.field949[var4] = arg0.method2387();
            }
        }
    }
}

package deob;

@ObfuscatedName("ad")
public class class49 extends class204 {

    @ObfuscatedName("ad.d")
    public static class193 field1074 = new class193(64);

    @ObfuscatedName("ad.g")
    public char field1073;

    @ObfuscatedName("ad.w")
    public char field1075;

    @ObfuscatedName("ad.e")
    public String field1077 = "null";

    @ObfuscatedName("ad.c")
    public int field1078;

    @ObfuscatedName("ad.a")
    public int field1076 = 0;

    @ObfuscatedName("ad.q")
    public int[] field1079;

    @ObfuscatedName("ad.m")
    public int[] field1081;

    @ObfuscatedName("ad.n")
    public String[] field1080;

    @ObfuscatedName("am.y(Lfu;S)V")
    public static void method867(class167 arg0) {
        Statics.field1082 = arg0;
    }

    @ObfuscatedName("ek.d(II)Lad;")
    public static class49 method2874(int arg0) {
        class49 var1 = (class49) field1074.method3425((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1082.method3045(8, arg0);
        class49 var3 = new class49();
        if (var2 != null) {
            var3.method959(new class119(var2));
        }
        field1074.method3427(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.g(Ldd;I)V")
    public void method959(class119 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method960(arg0, var2);
        }
    }

    @ObfuscatedName("ad.w(Ldd;IB)V")
    public void method960(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1073 = (char) arg0.method2326();
        } else if (arg1 == 2) {
            this.field1075 = (char) arg0.method2326();
        } else if (arg1 == 3) {
            this.field1077 = arg0.method2334();
        } else if (arg1 == 4) {
            this.field1078 = arg0.method2331();
        } else if (arg1 == 5) {
            this.field1076 = arg0.method2525();
            this.field1079 = new int[this.field1076];
            this.field1080 = new String[this.field1076];
            for (int var3 = 0; var3 < this.field1076; var3++) {
                this.field1079[var3] = arg0.method2331();
                this.field1080[var3] = arg0.method2334();
            }
        } else if (arg1 == 6) {
            this.field1076 = arg0.method2525();
            this.field1079 = new int[this.field1076];
            this.field1081 = new int[this.field1076];
            for (int var4 = 0; var4 < this.field1076; var4++) {
                this.field1079[var4] = arg0.method2331();
                this.field1081[var4] = arg0.method2331();
            }
        }
    }
}

package deob;

@ObfuscatedName("uw")
public class class528 extends class489 {

    @ObfuscatedName("uw.ah")
    public static class304 field5175 = new class304(64);

    @ObfuscatedName("uw.af")
    public Object[][] field5174;

    @ObfuscatedName("uw.at")
    public int[][] field5177;

    @ObfuscatedName("uw.an")
    public int field5178 = -1;

    @ObfuscatedName("oj.az(II)Luw;")
    public static class528 method6468(int arg0) {
        class528 var1 = (class528) field5175.method5336((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5176.method6328(38, arg0);
        class528 var3 = new class528();
        if (var2 != null) {
            var3.method8368(new class535(var2));
        }
        var3.method8370();
        field5175.method5346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("uw.ah(Lur;B)V")
    public void method8368(class535 arg0) {
        while (true) {
            int var2 = arg0.method8462();
            if (var2 == 0) {
                return;
            }
            this.method8382(arg0, var2);
        }
    }

    @ObfuscatedName("uw.af(II)[Ljava/lang/Object;")
    public Object[] method8367(int arg0) {
        return this.field5174 == null ? null : this.field5174[arg0];
    }

    @ObfuscatedName("uw.at(Lur;II)V")
    public void method8382(class535 arg0, int arg1) {
        if (arg1 == 3) {
            int var3 = arg0.method8462();
            if (this.field5174 == null) {
                this.field5174 = new Object[var3][];
                this.field5177 = new int[var3][];
            }
            for (int var4 = arg0.method8462(); var4 != 255; var4 = arg0.method8462()) {
                int var5 = arg0.method8462();
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = arg0.method8676();
                }
                Object[][] var8 = this.field5174;
                int var10 = arg0.method8676();
                Object[] var11 = new Object[var6.length * var10];
                for (int var12 = 0; var12 < var10; var12++) {
                    for (int var13 = 0; var13 < var6.length; var13++) {
                        int var14 = var6.length * var12 + var13;
                        class523 var15 = class521.method3603(var6[var13]);
                        var11[var14] = var15.method8321(arg0);
                    }
                }
                var8[var4] = var11;
                this.field5177[var4] = var6;
            }
        } else if (arg1 == 4) {
            this.field5178 = arg0.method8468();
        }
    }

    @ObfuscatedName("uw.an(B)V")
    public void method8370() {
    }
}

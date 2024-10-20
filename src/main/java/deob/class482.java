package deob;

@ObfuscatedName("sm")
public class class482 extends class444 {

    @ObfuscatedName("sm.an")
    public static class280 field4959 = new class280(64);

    @ObfuscatedName("sm.aw")
    public int[][] field4960;

    @ObfuscatedName("sm.ac")
    public Object[][] field4961;

    @ObfuscatedName("bj.af(Lnm;I)V")
    public static void method717(class344 arg0) {
        Statics.field4962 = arg0;
    }

    @ObfuscatedName("md.an(IB)Lsm;")
    public static class482 method5980(int arg0) {
        class482 var1 = (class482) field4959.method5119((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4962.method6090(39, arg0);
        class482 var3 = new class482();
        if (var2 != null) {
            var3.method8121(new class489(var2));
        }
        var3.method8126();
        field4959.method5121(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("sm.aw(Lsg;B)V")
    public void method8121(class489 arg0) {
        while (true) {
            int var2 = arg0.method8248();
            if (var2 == 0) {
                return;
            }
            this.method8122(arg0, var2);
        }
    }

    @ObfuscatedName("sm.ac(Lsg;IB)V")
    public void method8122(class489 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        int var3 = arg0.method8248();
        if (this.field4960 == null) {
            this.field4960 = new int[var3][];
        }
        for (int var4 = arg0.method8248(); var4 != 255; var4 = arg0.method8248()) {
            int var5 = var4 & 0x7F;
            boolean var6 = (var4 & 0x80) != 0;
            int[] var7 = new int[arg0.method8248()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = arg0.method8417();
            }
            this.field4960[var5] = var7;
            if (var6) {
                if (this.field4961 == null) {
                    this.field4961 = new Object[this.field4960.length][];
                }
                this.field4961[var5] = class485.method6608(arg0, var7);
            }
        }
    }

    @ObfuscatedName("sm.au(S)V")
    public void method8126() {
    }

    @ObfuscatedName("oa.ab(I)V")
    public static void method6892() {
        field4959.method5125();
    }
}

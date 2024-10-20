package deob;

@ObfuscatedName("uc")
public class class525 extends class488 {

    @ObfuscatedName("uc.aw")
    public static class304 field5139 = new class304(64);

    @ObfuscatedName("uc.al")
    public int[][] field5141;

    @ObfuscatedName("uc.ai")
    public Object[][] field5140;

    @ObfuscatedName("dp.aq(Lof;B)V")
    public static void method2378(class378 arg0) {
        Statics.field5138 = arg0;
    }

    @ObfuscatedName("kc.aw(IB)Luc;")
    public static class525 method4633(int arg0) {
        class525 var1 = (class525) field5139.method5414((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5138.method6489(39, arg0);
        class525 var3 = new class525();
        if (var2 != null) {
            var3.method8474(new class534(var2));
        }
        var3.method8476();
        field5139.method5421(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("uc.al(Luq;I)V")
    public void method8474(class534 arg0) {
        while (true) {
            int var2 = arg0.method8591();
            if (var2 == 0) {
                return;
            }
            this.method8475(arg0, var2);
        }
    }

    @ObfuscatedName("uc.ai(Luq;IB)V")
    public void method8475(class534 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        int var3 = arg0.method8591();
        if (this.field5141 == null) {
            this.field5141 = new int[var3][];
        }
        for (int var4 = arg0.method8591(); var4 != 255; var4 = arg0.method8591()) {
            int var5 = var4 & 0x7F;
            boolean var6 = (var4 & 0x80) != 0;
            int[] var7 = new int[arg0.method8591()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = arg0.method8820();
            }
            this.field5141[var5] = var7;
            if (var6) {
                if (this.field5140 == null) {
                    this.field5140 = new Object[this.field5141.length][];
                }
                this.field5140[var5] = class528.method2029(arg0, var7);
            }
        }
    }

    @ObfuscatedName("uc.ar(S)V")
    public void method8476() {
    }

    @ObfuscatedName("gy.as(I)V")
    public static void method3194() {
        field5139.method5418();
    }
}

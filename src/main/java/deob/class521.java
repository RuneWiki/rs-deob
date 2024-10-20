package deob;

@ObfuscatedName("uz")
public class class521 extends class484 {

    @ObfuscatedName("uz.al")
    public static class302 field5082 = new class302(64);

    @ObfuscatedName("uz.ak")
    public int[][] field5080;

    @ObfuscatedName("uz.ax")
    public Object[][] field5079;

    @ObfuscatedName("go.ac(Lom;I)V")
    public static void method3282(class374 arg0) {
        Statics.field5081 = arg0;
    }

    @ObfuscatedName("lq.al(II)Luz;")
    public static class521 method5307(int arg0) {
        class521 var1 = (class521) field5082.method5286((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5081.method6342(39, arg0);
        class521 var3 = new class521();
        if (var2 != null) {
            var3.method8248(new class530(var2));
        }
        var3.method8236();
        field5082.method5289(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("uz.ak(Lul;B)V")
    public void method8248(class530 arg0) {
        while (true) {
            int var2 = arg0.method8365();
            if (var2 == 0) {
                return;
            }
            this.method8235(arg0, var2);
        }
    }

    @ObfuscatedName("uz.ax(Lul;II)V")
    public void method8235(class530 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        int var3 = arg0.method8365();
        if (this.field5080 == null) {
            this.field5080 = new int[var3][];
        }
        for (int var4 = arg0.method8365(); var4 != 255; var4 = arg0.method8365()) {
            int var5 = var4 & 0x7F;
            boolean var6 = (var4 & 0x80) != 0;
            int[] var7 = new int[arg0.method8365()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = arg0.method8526();
            }
            this.field5080[var5] = var7;
            if (var6) {
                if (this.field5079 == null) {
                    this.field5079 = new Object[this.field5080.length][];
                }
                this.field5079[var5] = class524.method7831(arg0, var7);
            }
        }
    }

    @ObfuscatedName("uz.ao(I)V")
    public void method8236() {
    }

    @ObfuscatedName("ol.ah(I)V")
    public static void method6196() {
        field5082.method5288();
    }
}

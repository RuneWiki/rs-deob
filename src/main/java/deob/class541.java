package deob;

@ObfuscatedName("un")
public class class541 extends class504 {

    @ObfuscatedName("un.ae")
    public static class317 field5345 = new class317(64);

    @ObfuscatedName("un.ag")
    public int[][] field5347;

    @ObfuscatedName("un.am")
    public Object[][] field5346;

    @ObfuscatedName("uq.ac(II)Lun;")
    public static class541 method8722(int arg0) {
        class541 var1 = (class541) field5345.method5733((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5349.method6782(39, arg0);
        class541 var3 = new class541();
        if (var2 != null) {
            var3.method8845(new class551(var2));
        }
        var3.method8847();
        field5345.method5735(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("un.ae(Lvf;B)V")
    public void method8845(class551 arg0) {
        while (true) {
            int var2 = arg0.method8955();
            if (var2 == 0) {
                return;
            }
            this.method8846(arg0, var2);
        }
    }

    @ObfuscatedName("un.ag(Lvf;II)V")
    public void method8846(class551 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        int var3 = arg0.method8955();
        if (this.field5347 == null) {
            this.field5347 = new int[var3][];
        }
        for (int var4 = arg0.method8955(); var4 != 255; var4 = arg0.method8955()) {
            int var5 = var4 & 0x7F;
            boolean var6 = (var4 & 0x80) != 0;
            int[] var7 = new int[arg0.method8955()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = arg0.method8989();
            }
            this.field5347[var5] = var7;
            if (var6) {
                if (this.field5346 == null) {
                    this.field5346 = new Object[this.field5347.length][];
                }
                this.field5346[var5] = class544.method5769(arg0, var7);
            }
        }
    }

    @ObfuscatedName("un.am(I)V")
    public void method8847() {
    }
}

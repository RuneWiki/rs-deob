package deob;

@ObfuscatedName("sx")
public class class471 extends class439 {

    @ObfuscatedName("sx.al")
    public static class276 field4872 = new class276(64);

    @ObfuscatedName("sx.ac")
    public int[][] field4873;

    @ObfuscatedName("sx.ab")
    public Object[][] field4874;

    @ObfuscatedName("jz.aj(II)Lsx;")
    public static class471 method4750(int arg0) {
        class471 var1 = (class471) field4872.method4921((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4875.method5860(39, arg0);
        class471 var3 = new class471();
        if (var2 != null) {
            var3.method7787(new class478(var2));
        }
        var3.method7789();
        field4872.method4923(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("sx.al(Lsy;I)V")
    public void method7787(class478 arg0) {
        while (true) {
            int var2 = arg0.method7909();
            if (var2 == 0) {
                return;
            }
            this.method7786(arg0, var2);
        }
    }

    @ObfuscatedName("sx.ac(Lsy;II)V")
    public void method7786(class478 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        int var3 = arg0.method7909();
        if (this.field4873 == null) {
            this.field4873 = new int[var3][];
        }
        for (int var4 = arg0.method7909(); var4 != 255; var4 = arg0.method7909()) {
            int var5 = var4 & 0x7F;
            boolean var6 = (var4 & 0x80) != 0;
            int[] var7 = new int[arg0.method7909()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = arg0.method7918();
            }
            this.field4873[var5] = var7;
            if (var6) {
                if (this.field4874 == null) {
                    this.field4874 = new Object[this.field4873.length][];
                }
                this.field4874[var5] = class474.method3216(arg0, var7);
            }
        }
    }

    @ObfuscatedName("sx.ab(B)V")
    public void method7789() {
    }
}

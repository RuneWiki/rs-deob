package deob;

@ObfuscatedName("sl")
public class class494 extends class457 {

    @ObfuscatedName("sl.an")
    public static class287 field4985 = new class287(64);

    @ObfuscatedName("sl.av")
    public int[][] field4986;

    @ObfuscatedName("sl.as")
    public Object[][] field4987;

    @ObfuscatedName("oz.at(Lnq;S)V")
    public static void method6563(class357 arg0) {
        Statics.field4984 = arg0;
    }

    @ObfuscatedName("fi.an(IB)Lsl;")
    public static class494 method2969(int arg0) {
        class494 var1 = (class494) field4985.method5121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4984.method6080(39, arg0);
        class494 var3 = new class494();
        if (var2 != null) {
            var3.method8012(new class501(var2));
        }
        var3.method8007();
        field4985.method5123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("sl.av(Ltz;B)V")
    public void method8012(class501 arg0) {
        while (true) {
            int var2 = arg0.method8129();
            if (var2 == 0) {
                return;
            }
            this.method8016(arg0, var2);
        }
    }

    @ObfuscatedName("sl.as(Ltz;II)V")
    public void method8016(class501 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        int var3 = arg0.method8129();
        if (this.field4986 == null) {
            this.field4986 = new int[var3][];
        }
        for (int var4 = arg0.method8129(); var4 != 255; var4 = arg0.method8129()) {
            int var5 = var4 & 0x7F;
            boolean var6 = (var4 & 0x80) != 0;
            int[] var7 = new int[arg0.method8129()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = arg0.method8144();
            }
            this.field4986[var5] = var7;
            if (var6) {
                if (this.field4987 == null) {
                    this.field4987 = new Object[this.field4986.length][];
                }
                this.field4987[var5] = class497.method3042(arg0, var7);
            }
        }
    }

    @ObfuscatedName("sl.ax(B)V")
    public void method8007() {
    }

    @ObfuscatedName("dq.ap(I)V")
    public static void method2171() {
        field4985.method5124();
    }
}

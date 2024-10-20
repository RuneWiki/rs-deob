package deob;

@ObfuscatedName("tp")
public class class496 extends class457 {

    @ObfuscatedName("tp.an")
    public static class287 field4995 = new class287(64);

    @ObfuscatedName("tp.av")
    public Object[][] field4997;

    @ObfuscatedName("tp.as")
    public int[][] field4994;

    @ObfuscatedName("tp.ax")
    public int field4996 = -1;

    @ObfuscatedName("sf.at(IB)Ltp;")
    public static class496 method7838(int arg0) {
        class496 var1 = (class496) field4995.method5121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4998.method6080(38, arg0);
        class496 var3 = new class496();
        if (var2 != null) {
            var3.method8031(new class501(var2));
        }
        var3.method8034();
        field4995.method5123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("tp.an(Ltz;I)V")
    public void method8031(class501 arg0) {
        while (true) {
            int var2 = arg0.method8129();
            if (var2 == 0) {
                return;
            }
            this.method8033(arg0, var2);
        }
    }

    @ObfuscatedName("tp.av(II)[Ljava/lang/Object;")
    public Object[] method8032(int arg0) {
        return this.field4997 == null ? null : this.field4997[arg0];
    }

    @ObfuscatedName("tp.as(Ltz;II)V")
    public void method8033(class501 arg0, int arg1) {
        if (arg1 == 3) {
            int var3 = arg0.method8129();
            if (this.field4997 == null) {
                this.field4997 = new Object[var3][];
                this.field4994 = new int[var3][];
            }
            for (int var4 = arg0.method8129(); var4 != 255; var4 = arg0.method8129()) {
                int var5 = arg0.method8129();
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = arg0.method8144();
                }
                this.field4997[var4] = class497.method3042(arg0, var6);
                this.field4994[var4] = var6;
            }
        } else if (arg1 == 4) {
            this.field4996 = arg0.method8150();
        }
    }

    @ObfuscatedName("tp.ax(I)V")
    public void method8034() {
    }

    @ObfuscatedName("dt.ap(I)V")
    public static void method2118() {
        field4995.method5124();
    }
}

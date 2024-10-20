package deob;

@ObfuscatedName("sh")
public class class473 extends class439 {

    @ObfuscatedName("sh.al")
    public static class276 field4885 = new class276(64);

    @ObfuscatedName("sh.ac")
    public Object[][] field4883;

    @ObfuscatedName("sh.ab")
    public int[][] field4881;

    @ObfuscatedName("sh.an")
    public int field4884 = -1;

    @ObfuscatedName("dc.aj(II)Lsh;")
    public static class473 method2123(int arg0) {
        class473 var1 = (class473) field4885.method4921((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4882.method5860(38, arg0);
        class473 var3 = new class473();
        if (var2 != null) {
            var3.method7803(new class478(var2));
        }
        var3.method7808();
        field4885.method4923(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("sh.al(Lsy;B)V")
    public void method7803(class478 arg0) {
        while (true) {
            int var2 = arg0.method7909();
            if (var2 == 0) {
                return;
            }
            this.method7806(arg0, var2);
        }
    }

    @ObfuscatedName("sh.ac(IB)[Ljava/lang/Object;")
    public Object[] method7814(int arg0) {
        return this.field4883 == null ? null : this.field4883[arg0];
    }

    @ObfuscatedName("sh.ab(Lsy;II)V")
    public void method7806(class478 arg0, int arg1) {
        if (arg1 == 3) {
            int var3 = arg0.method7909();
            if (this.field4883 == null) {
                this.field4883 = new Object[var3][];
                this.field4881 = new int[var3][];
            }
            for (int var4 = arg0.method7909(); var4 != 255; var4 = arg0.method7909()) {
                int var5 = arg0.method7909();
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = arg0.method7918();
                }
                this.field4883[var4] = class474.method3216(arg0, var6);
                this.field4881[var4] = var6;
            }
        } else if (arg1 == 4) {
            this.field4884 = arg0.method8082();
        }
    }

    @ObfuscatedName("sh.an(I)V")
    public void method7808() {
    }
}

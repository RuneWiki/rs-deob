package deob;

@ObfuscatedName("uj")
public class class543 extends class504 {

    @ObfuscatedName("uj.ae")
    public static class317 field5356 = new class317(64);

    @ObfuscatedName("uj.ag")
    public Object[][] field5355;

    @ObfuscatedName("uj.am")
    public int[][] field5358;

    @ObfuscatedName("uj.ax")
    public int field5359 = -1;

    @ObfuscatedName("ch.ac(II)Luj;")
    public static class543 method1026(int arg0) {
        class543 var1 = (class543) field5356.method5733((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5357.method6782(38, arg0);
        class543 var3 = new class543();
        if (var2 != null) {
            var3.method8872(new class551(var2));
        }
        var3.method8864();
        field5356.method5735(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("uj.ae(Lvf;I)V")
    public void method8872(class551 arg0) {
        while (true) {
            int var2 = arg0.method8955();
            if (var2 == 0) {
                return;
            }
            this.method8879(arg0, var2);
        }
    }

    @ObfuscatedName("uj.ag(II)[Ljava/lang/Object;")
    public Object[] method8866(int arg0) {
        return this.field5355 == null ? null : this.field5355[arg0];
    }

    @ObfuscatedName("uj.am(Lvf;IB)V")
    public void method8879(class551 arg0, int arg1) {
        if (arg1 == 3) {
            int var3 = arg0.method8955();
            if (this.field5355 == null) {
                this.field5355 = new Object[var3][];
                this.field5358 = new int[var3][];
            }
            for (int var4 = arg0.method8955(); var4 != 255; var4 = arg0.method8955()) {
                int var5 = arg0.method8955();
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = arg0.method8989();
                }
                this.field5355[var4] = class544.method5769(arg0, var6);
                this.field5358[var4] = var6;
            }
        } else if (arg1 == 4) {
            this.field5359 = arg0.method8995();
        }
    }

    @ObfuscatedName("uj.ax(B)V")
    public void method8864() {
    }

    @ObfuscatedName("mi.aq(I)V")
    public static void method5766() {
        field5356.method5736();
    }
}

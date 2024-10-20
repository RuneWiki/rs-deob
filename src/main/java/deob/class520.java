package deob;

@ObfuscatedName("tf")
public class class520 extends class481 {

    @ObfuscatedName("tf.ah")
    public static class299 field5082 = new class299(64);

    @ObfuscatedName("tf.ar")
    public Object[][] field5084;

    @ObfuscatedName("tf.ao")
    public int[][] field5083;

    @ObfuscatedName("tf.ab")
    public int field5085 = -1;

    @ObfuscatedName("sj.at(II)Ltf;")
    public static class520 method7783(int arg0) {
        class520 var1 = (class520) field5082.method5289((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5086.method6284(38, arg0);
        class520 var3 = new class520();
        if (var2 != null) {
            var3.method8328(new class527(var2));
        }
        var3.method8317();
        field5082.method5303(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("tf.ah(Luj;S)V")
    public void method8328(class527 arg0) {
        while (true) {
            int var2 = arg0.method8410();
            if (var2 == 0) {
                return;
            }
            this.method8316(arg0, var2);
        }
    }

    @ObfuscatedName("tf.ar(IB)[Ljava/lang/Object;")
    public Object[] method8315(int arg0) {
        return this.field5084 == null ? null : this.field5084[arg0];
    }

    @ObfuscatedName("tf.ao(Luj;IB)V")
    public void method8316(class527 arg0, int arg1) {
        if (arg1 == 3) {
            int var3 = arg0.method8410();
            if (this.field5084 == null) {
                this.field5084 = new Object[var3][];
                this.field5083 = new int[var3][];
            }
            for (int var4 = arg0.method8410(); var4 != 255; var4 = arg0.method8410()) {
                int var5 = arg0.method8410();
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = arg0.method8426();
                }
                Object[][] var8 = this.field5084;
                int var10 = arg0.method8426();
                Object[] var11 = new Object[var6.length * var10];
                for (int var12 = 0; var12 < var10; var12++) {
                    for (int var13 = 0; var13 < var6.length; var13++) {
                        int var14 = var6.length * var12 + var13;
                        class515 var15 = class513.method7784(var6[var13]);
                        var11[var14] = var15.method8278(arg0);
                    }
                }
                var8[var4] = var11;
                this.field5083[var4] = var6;
            }
        } else if (arg1 == 4) {
            this.field5085 = arg0.method8491();
        }
    }

    @ObfuscatedName("tf.ab(I)V")
    public void method8317() {
    }

    @ObfuscatedName("go.au(I)V")
    public static void method3320() {
        field5082.method5292();
    }
}

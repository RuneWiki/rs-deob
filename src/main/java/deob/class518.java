package deob;

@ObfuscatedName("tb")
public class class518 extends class481 {

    @ObfuscatedName("tb.ah")
    public static class299 field5073 = new class299(64);

    @ObfuscatedName("tb.ar")
    public int[][] field5074;

    @ObfuscatedName("tb.ao")
    public Object[][] field5076;

    @ObfuscatedName("qb.at(II)Ltb;")
    public static class518 method7125(int arg0) {
        class518 var1 = (class518) field5073.method5289((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5075.method6284(39, arg0);
        class518 var3 = new class518();
        if (var2 != null) {
            var3.method8299(new class527(var2));
        }
        var3.method8302();
        field5073.method5303(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("tb.ah(Luj;I)V")
    public void method8299(class527 arg0) {
        while (true) {
            int var2 = arg0.method8410();
            if (var2 == 0) {
                return;
            }
            this.method8300(arg0, var2);
        }
    }

    @ObfuscatedName("tb.ar(Luj;II)V")
    public void method8300(class527 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        int var3 = arg0.method8410();
        if (this.field5074 == null) {
            this.field5074 = new int[var3][];
        }
        for (int var4 = arg0.method8410(); var4 != 255; var4 = arg0.method8410()) {
            int var5 = var4 & 0x7F;
            boolean var6 = (var4 & 0x80) != 0;
            int[] var7 = new int[arg0.method8410()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = arg0.method8426();
            }
            this.field5074[var5] = var7;
            if (var6) {
                if (this.field5076 == null) {
                    this.field5076 = new Object[this.field5074.length][];
                }
                Object[][] var9 = this.field5076;
                int var11 = arg0.method8426();
                Object[] var12 = new Object[var7.length * var11];
                for (int var13 = 0; var13 < var11; var13++) {
                    for (int var14 = 0; var14 < var7.length; var14++) {
                        int var15 = var7.length * var13 + var14;
                        class515 var16 = class513.method7784(var7[var14]);
                        var12[var15] = var16.method8278(arg0);
                    }
                }
                var9[var5] = var12;
            }
        }
    }

    @ObfuscatedName("tb.ao(B)V")
    public void method8302() {
    }
}

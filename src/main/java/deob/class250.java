package deob;

@ObfuscatedName("je")
public class class250 {

    @ObfuscatedName("je.al")
    public class131[] field2684;

    @ObfuscatedName("je.aj")
    public int field2686;

    public class250(class546 arg0, int arg1) {
        this.field2684 = new class131[arg1];
        this.field2686 = arg0.method8796();
        for (int var3 = 0; var3 < this.field2684.length; var3++) {
            class131 var4 = new class131(this.field2686, arg0, false);
            this.field2684[var3] = var4;
        }
        this.method4426();
    }

    @ObfuscatedName("je.ak(I)V")
    public void method4426() {
        class131[] var1 = this.field2684;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class131 var3 = var1[var2];
            if (var3.field1558 >= 0) {
                var3.field1559 = this.field2684[var3.field1558];
            }
        }
    }

    @ObfuscatedName("je.al(B)I")
    public int method4427() {
        return this.field2684.length;
    }

    @ObfuscatedName("je.aj(II)Lfh;")
    public class131 method4428(int arg0) {
        return arg0 >= this.method4427() ? null : this.field2684[arg0];
    }

    @ObfuscatedName("je.az(I)[Lfh;")
    public class131[] method4447() {
        return this.field2684;
    }

    @ObfuscatedName("je.af(Lfo;II)V")
    public void method4425(class142 arg0, int arg1) {
        this.method4429(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("je.aa(Lfo;I[ZZI)V")
    public void method4429(class142 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method3003();
        int var6 = 0;
        class131[] var7 = this.method4447();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class131 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method3005(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}

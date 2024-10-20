package deob;

@ObfuscatedName("so")
public final class class489 {

    @ObfuscatedName("so.au")
    public int field4981;

    @ObfuscatedName("so.ae")
    public class473[] field4978;

    @ObfuscatedName("so.ao")
    public class473 field4979;

    @ObfuscatedName("so.at")
    public class473 field4980;

    @ObfuscatedName("so.ac")
    public int field4977 = 0;

    public class489(int arg0) {
        this.field4981 = arg0;
        this.field4978 = new class473[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class473 var3 = this.field4978[var2] = new class473();
            var3.field4813 = var3;
            var3.field4815 = var3;
        }
    }

    @ObfuscatedName("so.au(J)Lsj;")
    public class473 method8025(long arg0) {
        class473 var3 = this.field4978[(int) (arg0 & (long) (this.field4981 - 1))];
        for (this.field4979 = var3.field4813; this.field4979 != var3; this.field4979 = this.field4979.field4813) {
            if (this.field4979.field4814 == arg0) {
                class473 var4 = this.field4979;
                this.field4979 = this.field4979.field4813;
                return var4;
            }
        }
        this.field4979 = null;
        return null;
    }

    @ObfuscatedName("so.ae()I")
    public int method8024() {
        int var1 = 0;
        for (int var2 = 0; var2 < this.field4981; var2++) {
            class473 var3 = this.field4978[var2];
            for (class473 var4 = var3.field4813; var4 != var3; var4 = var4.field4813) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("so.ao(Lsj;J)V")
    public void method8035(class473 arg0, long arg1) {
        if (arg0.field4815 != null) {
            arg0.method7700();
        }
        class473 var4 = this.field4978[(int) (arg1 & (long) (this.field4981 - 1))];
        arg0.field4815 = var4.field4815;
        arg0.field4813 = var4;
        arg0.field4815.field4813 = arg0;
        arg0.field4813.field4815 = arg0;
        arg0.field4814 = arg1;
    }

    @ObfuscatedName("so.at()Lsj;")
    public class473 method8027() {
        this.field4977 = 0;
        return this.method8028();
    }

    @ObfuscatedName("so.ac()Lsj;")
    public class473 method8028() {
        if (this.field4977 > 0 && this.field4978[this.field4977 - 1] != this.field4980) {
            class473 var1 = this.field4980;
            this.field4980 = var1.field4813;
            return var1;
        }
        class473 var2;
        do {
            if (this.field4977 >= this.field4981) {
                return null;
            }
            var2 = this.field4978[this.field4977++].field4813;
        } while (this.field4978[this.field4977 - 1] == var2);
        this.field4980 = var2.field4813;
        return var2;
    }
}

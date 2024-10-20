package deob;

import java.util.Iterator;

@ObfuscatedName("sf")
public final class class488 implements Iterable {

    @ObfuscatedName("sf.au")
    public int field4972;

    @ObfuscatedName("sf.ae")
    public class473[] field4973;

    @ObfuscatedName("sf.ao")
    public class473 field4974;

    @ObfuscatedName("sf.at")
    public class473 field4975;

    @ObfuscatedName("sf.ac")
    public int field4976 = 0;

    public class488(int arg0) {
        this.field4972 = arg0;
        this.field4973 = new class473[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class473 var3 = this.field4973[var2] = new class473();
            var3.field4813 = var3;
            var3.field4815 = var3;
        }
    }

    @ObfuscatedName("sf.au(J)Lsj;")
    public class473 method8008(long arg0) {
        class473 var3 = this.field4973[(int) (arg0 & (long) (this.field4972 - 1))];
        for (this.field4974 = var3.field4813; this.field4974 != var3; this.field4974 = this.field4974.field4813) {
            if (this.field4974.field4814 == arg0) {
                class473 var4 = this.field4974;
                this.field4974 = this.field4974.field4813;
                return var4;
            }
        }
        this.field4974 = null;
        return null;
    }

    @ObfuscatedName("sf.ae(Lsj;J)V")
    public void method8016(class473 arg0, long arg1) {
        if (arg0.field4815 != null) {
            arg0.method7700();
        }
        class473 var4 = this.field4973[(int) (arg1 & (long) (this.field4972 - 1))];
        arg0.field4815 = var4.field4815;
        arg0.field4813 = var4;
        arg0.field4815.field4813 = arg0;
        arg0.field4813.field4815 = arg0;
        arg0.field4814 = arg1;
    }

    @ObfuscatedName("sf.ao()V")
    public void method8010() {
        for (int var1 = 0; var1 < this.field4972; var1++) {
            class473 var2 = this.field4973[var1];
            while (true) {
                class473 var3 = var2.field4813;
                if (var2 == var3) {
                    break;
                }
                var3.method7700();
            }
        }
        this.field4974 = null;
        this.field4975 = null;
    }

    @ObfuscatedName("sf.at()Lsj;")
    public class473 method8011() {
        this.field4976 = 0;
        return this.method8012();
    }

    @ObfuscatedName("sf.ac()Lsj;")
    public class473 method8012() {
        if (this.field4976 > 0 && this.field4973[this.field4976 - 1] != this.field4975) {
            class473 var1 = this.field4975;
            this.field4975 = var1.field4813;
            return var1;
        }
        class473 var2;
        do {
            if (this.field4976 >= this.field4972) {
                return null;
            }
            var2 = this.field4973[this.field4976++].field4813;
        } while (this.field4973[this.field4976 - 1] == var2);
        this.field4975 = var2.field4813;
        return var2;
    }

    public Iterator iterator() {
        return new class487(this);
    }
}

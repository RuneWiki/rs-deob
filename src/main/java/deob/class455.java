package deob;

@ObfuscatedName("rh")
public final class class455 {

    @ObfuscatedName("rh.aj")
    public int field4815;

    @ObfuscatedName("rh.al")
    public class444[] field4811;

    @ObfuscatedName("rh.ac")
    public class444 field4812;

    @ObfuscatedName("rh.ab")
    public class444 field4814;

    @ObfuscatedName("rh.an")
    public int field4813 = 0;

    public class455(int arg0) {
        this.field4815 = arg0;
        this.field4811 = new class444[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class444 var3 = this.field4811[var2] = new class444();
            var3.field4672 = var3;
            var3.field4674 = var3;
        }
    }

    @ObfuscatedName("rh.aj(J)Lru;")
    public class444 method7619(long arg0) {
        class444 var3 = this.field4811[(int) (arg0 & (long) (this.field4815 - 1))];
        for (this.field4812 = var3.field4672; this.field4812 != var3; this.field4812 = this.field4812.field4672) {
            if (this.field4812.field4673 == arg0) {
                class444 var4 = this.field4812;
                this.field4812 = this.field4812.field4672;
                return var4;
            }
        }
        this.field4812 = null;
        return null;
    }

    @ObfuscatedName("rh.al(Lru;J)V")
    public void method7616(class444 arg0, long arg1) {
        if (arg0.field4674 != null) {
            arg0.method7335();
        }
        class444 var4 = this.field4811[(int) (arg1 & (long) (this.field4815 - 1))];
        arg0.field4674 = var4.field4674;
        arg0.field4672 = var4;
        arg0.field4674.field4672 = arg0;
        arg0.field4672.field4674 = arg0;
        arg0.field4673 = arg1;
    }

    @ObfuscatedName("rh.ac()Lru;")
    public class444 method7614() {
        this.field4813 = 0;
        return this.method7617();
    }

    @ObfuscatedName("rh.ab()Lru;")
    public class444 method7617() {
        if (this.field4813 > 0 && this.field4811[this.field4813 - 1] != this.field4814) {
            class444 var1 = this.field4814;
            this.field4814 = var1.field4672;
            return var1;
        }
        class444 var2;
        do {
            if (this.field4813 >= this.field4815) {
                return null;
            }
            var2 = this.field4811[this.field4813++].field4672;
        } while (this.field4811[this.field4813 - 1] == var2);
        this.field4814 = var2.field4672;
        return var2;
    }
}

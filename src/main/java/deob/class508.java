package deob;

@ObfuscatedName("tl")
public final class class508 {

    @ObfuscatedName("tl.aq")
    public int field5077;

    @ObfuscatedName("tl.aw")
    public class492[] field5080;

    @ObfuscatedName("tl.al")
    public class492 field5078;

    @ObfuscatedName("tl.ai")
    public class492 field5079;

    @ObfuscatedName("tl.ar")
    public int field5076 = 0;

    public class508(int arg0) {
        this.field5077 = arg0;
        this.field5080 = new class492[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class492 var3 = this.field5080[var2] = new class492();
            var3.field4918 = var3;
            var3.field4919 = var3;
        }
    }

    @ObfuscatedName("tl.aq(J)Lse;")
    public class492 method8322(long arg0) {
        class492 var3 = this.field5080[(int) (arg0 & (long) (this.field5077 - 1))];
        for (this.field5078 = var3.field4918; this.field5078 != var3; this.field5078 = this.field5078.field4918) {
            if (this.field5078.field4920 == arg0) {
                class492 var4 = this.field5078;
                this.field5078 = this.field5078.field4918;
                return var4;
            }
        }
        this.field5078 = null;
        return null;
    }

    @ObfuscatedName("tl.aw()I")
    public int method8323() {
        int var1 = 0;
        for (int var2 = 0; var2 < this.field5077; var2++) {
            class492 var3 = this.field5080[var2];
            for (class492 var4 = var3.field4918; var4 != var3; var4 = var4.field4918) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("tl.al(Lse;J)V")
    public void method8324(class492 arg0, long arg1) {
        if (arg0.field4919 != null) {
            arg0.method7996();
        }
        class492 var4 = this.field5080[(int) (arg1 & (long) (this.field5077 - 1))];
        arg0.field4919 = var4.field4919;
        arg0.field4918 = var4;
        arg0.field4919.field4918 = arg0;
        arg0.field4918.field4919 = arg0;
        arg0.field4920 = arg1;
    }

    @ObfuscatedName("tl.ai()Lse;")
    public class492 method8325() {
        this.field5076 = 0;
        return this.method8333();
    }

    @ObfuscatedName("tl.ar()Lse;")
    public class492 method8333() {
        if (this.field5076 > 0 && this.field5080[this.field5076 - 1] != this.field5079) {
            class492 var1 = this.field5079;
            this.field5079 = var1.field4918;
            return var1;
        }
        class492 var2;
        do {
            if (this.field5076 >= this.field5077) {
                return null;
            }
            var2 = this.field5080[this.field5076++].field4918;
        } while (this.field5080[this.field5076 - 1] == var2);
        this.field5079 = var2.field4918;
        return var2;
    }
}

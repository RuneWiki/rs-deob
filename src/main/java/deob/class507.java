package deob;

import java.util.Iterator;

@ObfuscatedName("ta")
public final class class507 implements Iterable {

    @ObfuscatedName("ta.aq")
    public int field5075;

    @ObfuscatedName("ta.aw")
    public class492[] field5072;

    @ObfuscatedName("ta.al")
    public class492 field5073;

    @ObfuscatedName("ta.ai")
    public class492 field5074;

    @ObfuscatedName("ta.ar")
    public int field5071 = 0;

    public class507(int arg0) {
        this.field5075 = arg0;
        this.field5072 = new class492[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class492 var3 = this.field5072[var2] = new class492();
            var3.field4918 = var3;
            var3.field4919 = var3;
        }
    }

    @ObfuscatedName("ta.aq(J)Lse;")
    public class492 method8299(long arg0) {
        class492 var3 = this.field5072[(int) (arg0 & (long) (this.field5075 - 1))];
        for (this.field5073 = var3.field4918; this.field5073 != var3; this.field5073 = this.field5073.field4918) {
            if (this.field5073.field4920 == arg0) {
                class492 var4 = this.field5073;
                this.field5073 = this.field5073.field4918;
                return var4;
            }
        }
        this.field5073 = null;
        return null;
    }

    @ObfuscatedName("ta.aw(Lse;J)V")
    public void method8319(class492 arg0, long arg1) {
        if (arg0.field4919 != null) {
            arg0.method7996();
        }
        class492 var4 = this.field5072[(int) (arg1 & (long) (this.field5075 - 1))];
        arg0.field4919 = var4.field4919;
        arg0.field4918 = var4;
        arg0.field4919.field4918 = arg0;
        arg0.field4918.field4919 = arg0;
        arg0.field4920 = arg1;
    }

    @ObfuscatedName("ta.al()V")
    public void method8308() {
        for (int var1 = 0; var1 < this.field5075; var1++) {
            class492 var2 = this.field5072[var1];
            while (true) {
                class492 var3 = var2.field4918;
                if (var2 == var3) {
                    break;
                }
                var3.method7996();
            }
        }
        this.field5073 = null;
        this.field5074 = null;
    }

    @ObfuscatedName("ta.ai()Lse;")
    public class492 method8302() {
        this.field5071 = 0;
        return this.method8316();
    }

    @ObfuscatedName("ta.ar()Lse;")
    public class492 method8316() {
        if (this.field5071 > 0 && this.field5072[this.field5071 - 1] != this.field5074) {
            class492 var1 = this.field5074;
            this.field5074 = var1.field4918;
            return var1;
        }
        class492 var2;
        do {
            if (this.field5071 >= this.field5075) {
                return null;
            }
            var2 = this.field5072[this.field5071++].field4918;
        } while (this.field5072[this.field5071 - 1] == var2);
        this.field5074 = var2.field4918;
        return var2;
    }

    public Iterator iterator() {
        return new class506(this);
    }
}

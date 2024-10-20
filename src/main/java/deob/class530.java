package deob;

import java.util.Iterator;

@ObfuscatedName("um")
public final class class530 implements Iterable {

    @ObfuscatedName("um.ap")
    public int field5325;

    @ObfuscatedName("um.aw")
    public class515[] field5324;

    @ObfuscatedName("um.ak")
    public class515 field5326;

    @ObfuscatedName("um.aj")
    public class515 field5323;

    @ObfuscatedName("um.ai")
    public int field5327 = 0;

    public class530(int arg0) {
        this.field5325 = arg0;
        this.field5324 = new class515[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class515 var3 = this.field5324[var2] = new class515();
            var3.field5171 = var3;
            var3.field5169 = var3;
        }
    }

    @ObfuscatedName("um.ap(J)Ltw;")
    public class515 method8985(long arg0) {
        class515 var3 = this.field5324[(int) (arg0 & (long) (this.field5325 - 1))];
        for (this.field5326 = var3.field5171; this.field5326 != var3; this.field5326 = this.field5326.field5171) {
            if (this.field5326.field5170 == arg0) {
                class515 var4 = this.field5326;
                this.field5326 = this.field5326.field5171;
                return var4;
            }
        }
        this.field5326 = null;
        return null;
    }

    @ObfuscatedName("um.aw(Ltw;J)V")
    public void method8970(class515 arg0, long arg1) {
        if (arg0.field5169 != null) {
            arg0.method8667();
        }
        class515 var4 = this.field5324[(int) (arg1 & (long) (this.field5325 - 1))];
        arg0.field5169 = var4.field5169;
        arg0.field5171 = var4;
        arg0.field5169.field5171 = arg0;
        arg0.field5171.field5169 = arg0;
        arg0.field5170 = arg1;
    }

    @ObfuscatedName("um.ak()V")
    public void method8963() {
        for (int var1 = 0; var1 < this.field5325; var1++) {
            class515 var2 = this.field5324[var1];
            while (true) {
                class515 var3 = var2.field5171;
                if (var2 == var3) {
                    break;
                }
                var3.method8667();
            }
        }
        this.field5326 = null;
        this.field5323 = null;
    }

    @ObfuscatedName("um.aj()Ltw;")
    public class515 method8964() {
        this.field5327 = 0;
        return this.method8967();
    }

    @ObfuscatedName("um.ai()Ltw;")
    public class515 method8967() {
        if (this.field5327 > 0 && this.field5324[this.field5327 - 1] != this.field5323) {
            class515 var1 = this.field5323;
            this.field5323 = var1.field5171;
            return var1;
        }
        class515 var2;
        do {
            if (this.field5327 >= this.field5325) {
                return null;
            }
            var2 = this.field5324[this.field5327++].field5171;
        } while (this.field5324[this.field5327 - 1] == var2);
        this.field5323 = var2.field5171;
        return var2;
    }

    public Iterator iterator() {
        return new class529(this);
    }
}

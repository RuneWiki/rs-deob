package deob;

import java.util.Iterator;

@ObfuscatedName("th")
public final class class520 implements Iterable {

    @ObfuscatedName("th.aq")
    public int field5234;

    @ObfuscatedName("th.ad")
    public class505[] field5232;

    @ObfuscatedName("th.ag")
    public class505 field5233;

    @ObfuscatedName("th.ak")
    public class505 field5231;

    @ObfuscatedName("th.ap")
    public int field5235 = 0;

    public class520(int arg0) {
        this.field5234 = arg0;
        this.field5232 = new class505[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class505 var3 = this.field5232[var2] = new class505();
            var3.field5083 = var3;
            var3.field5081 = var3;
        }
    }

    @ObfuscatedName("th.aq(J)Ltz;")
    public class505 method8442(long arg0) {
        class505 var3 = this.field5232[(int) (arg0 & (long) (this.field5234 - 1))];
        for (this.field5233 = var3.field5083; this.field5233 != var3; this.field5233 = this.field5233.field5083) {
            if (this.field5233.field5082 == arg0) {
                class505 var4 = this.field5233;
                this.field5233 = this.field5233.field5083;
                return var4;
            }
        }
        this.field5233 = null;
        return null;
    }

    @ObfuscatedName("th.ad(Ltz;J)V")
    public void method8443(class505 arg0, long arg1) {
        if (arg0.field5081 != null) {
            arg0.method8130();
        }
        class505 var4 = this.field5232[(int) (arg1 & (long) (this.field5234 - 1))];
        arg0.field5081 = var4.field5081;
        arg0.field5083 = var4;
        arg0.field5081.field5083 = arg0;
        arg0.field5083.field5081 = arg0;
        arg0.field5082 = arg1;
    }

    @ObfuscatedName("th.ag()V")
    public void method8444() {
        for (int var1 = 0; var1 < this.field5234; var1++) {
            class505 var2 = this.field5232[var1];
            while (true) {
                class505 var3 = var2.field5083;
                if (var2 == var3) {
                    break;
                }
                var3.method8130();
            }
        }
        this.field5233 = null;
        this.field5231 = null;
    }

    @ObfuscatedName("th.ak()Ltz;")
    public class505 method8441() {
        this.field5235 = 0;
        return this.method8446();
    }

    @ObfuscatedName("th.ap()Ltz;")
    public class505 method8446() {
        if (this.field5235 > 0 && this.field5232[this.field5235 - 1] != this.field5231) {
            class505 var1 = this.field5231;
            this.field5231 = var1.field5083;
            return var1;
        }
        class505 var2;
        do {
            if (this.field5235 >= this.field5234) {
                return null;
            }
            var2 = this.field5232[this.field5235++].field5083;
        } while (this.field5232[this.field5235 - 1] == var2);
        this.field5231 = var2.field5083;
        return var2;
    }

    public Iterator iterator() {
        return new class519(this);
    }
}

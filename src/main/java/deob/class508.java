package deob;

import java.util.Iterator;

@ObfuscatedName("to")
public final class class508 implements Iterable {

    @ObfuscatedName("to.az")
    public int field5100;

    @ObfuscatedName("to.ah")
    public class493[] field5097;

    @ObfuscatedName("to.af")
    public class493 field5098;

    @ObfuscatedName("to.at")
    public class493 field5099;

    @ObfuscatedName("to.an")
    public int field5096 = 0;

    public class508(int arg0) {
        this.field5100 = arg0;
        this.field5097 = new class493[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class493 var3 = this.field5097[var2] = new class493();
            var3.field4950 = var3;
            var3.field4952 = var3;
        }
    }

    @ObfuscatedName("to.az(J)Lsu;")
    public class493 method8177(long arg0) {
        class493 var3 = this.field5097[(int) (arg0 & (long) (this.field5100 - 1))];
        for (this.field5098 = var3.field4950; this.field5098 != var3; this.field5098 = this.field5098.field4950) {
            if (this.field5098.field4951 == arg0) {
                class493 var4 = this.field5098;
                this.field5098 = this.field5098.field4950;
                return var4;
            }
        }
        this.field5098 = null;
        return null;
    }

    @ObfuscatedName("to.ah(Lsu;J)V")
    public void method8200(class493 arg0, long arg1) {
        if (arg0.field4952 != null) {
            arg0.method7855();
        }
        class493 var4 = this.field5097[(int) (arg1 & (long) (this.field5100 - 1))];
        arg0.field4952 = var4.field4952;
        arg0.field4950 = var4;
        arg0.field4952.field4950 = arg0;
        arg0.field4950.field4952 = arg0;
        arg0.field4951 = arg1;
    }

    @ObfuscatedName("to.af()V")
    public void method8180() {
        for (int var1 = 0; var1 < this.field5100; var1++) {
            class493 var2 = this.field5097[var1];
            while (true) {
                class493 var3 = var2.field4950;
                if (var2 == var3) {
                    break;
                }
                var3.method7855();
            }
        }
        this.field5098 = null;
        this.field5099 = null;
    }

    @ObfuscatedName("to.at()Lsu;")
    public class493 method8181() {
        this.field5096 = 0;
        return this.method8179();
    }

    @ObfuscatedName("to.an()Lsu;")
    public class493 method8179() {
        if (this.field5096 > 0 && this.field5097[this.field5096 - 1] != this.field5099) {
            class493 var1 = this.field5099;
            this.field5099 = var1.field4950;
            return var1;
        }
        class493 var2;
        do {
            if (this.field5096 >= this.field5100) {
                return null;
            }
            var2 = this.field5097[this.field5096++].field4950;
        } while (this.field5097[this.field5096 - 1] == var2);
        this.field5099 = var2.field4950;
        return var2;
    }

    public Iterator iterator() {
        return new class507(this);
    }
}

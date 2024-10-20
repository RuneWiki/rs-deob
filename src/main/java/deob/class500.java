package deob;

import java.util.Iterator;

@ObfuscatedName("tz")
public final class class500 implements Iterable {

    @ObfuscatedName("tz.at")
    public int field5006;

    @ObfuscatedName("tz.ah")
    public class485[] field5004;

    @ObfuscatedName("tz.ar")
    public class485 field5005;

    @ObfuscatedName("tz.ao")
    public class485 field5007;

    @ObfuscatedName("tz.ab")
    public int field5003 = 0;

    public class500(int arg0) {
        this.field5006 = arg0;
        this.field5004 = new class485[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class485 var3 = this.field5004[var2] = new class485();
            var3.field4850 = var3;
            var3.field4848 = var3;
        }
    }

    @ObfuscatedName("tz.at(J)Lsh;")
    public class485 method8134(long arg0) {
        class485 var3 = this.field5004[(int) (arg0 & (long) (this.field5006 - 1))];
        for (this.field5005 = var3.field4850; this.field5005 != var3; this.field5005 = this.field5005.field4850) {
            if (this.field5005.field4849 == arg0) {
                class485 var4 = this.field5005;
                this.field5005 = this.field5005.field4850;
                return var4;
            }
        }
        this.field5005 = null;
        return null;
    }

    @ObfuscatedName("tz.ah(Lsh;J)V")
    public void method8135(class485 arg0, long arg1) {
        if (arg0.field4848 != null) {
            arg0.method7828();
        }
        class485 var4 = this.field5004[(int) (arg1 & (long) (this.field5006 - 1))];
        arg0.field4848 = var4.field4848;
        arg0.field4850 = var4;
        arg0.field4848.field4850 = arg0;
        arg0.field4850.field4848 = arg0;
        arg0.field4849 = arg1;
    }

    @ObfuscatedName("tz.ar()V")
    public void method8136() {
        for (int var1 = 0; var1 < this.field5006; var1++) {
            class485 var2 = this.field5004[var1];
            while (true) {
                class485 var3 = var2.field4850;
                if (var2 == var3) {
                    break;
                }
                var3.method7828();
            }
        }
        this.field5005 = null;
        this.field5007 = null;
    }

    @ObfuscatedName("tz.ao()Lsh;")
    public class485 method8137() {
        this.field5003 = 0;
        return this.method8133();
    }

    @ObfuscatedName("tz.ab()Lsh;")
    public class485 method8133() {
        if (this.field5003 > 0 && this.field5004[this.field5003 - 1] != this.field5007) {
            class485 var1 = this.field5007;
            this.field5007 = var1.field4850;
            return var1;
        }
        class485 var2;
        do {
            if (this.field5003 >= this.field5006) {
                return null;
            }
            var2 = this.field5004[this.field5003++].field4850;
        } while (this.field5004[this.field5003 - 1] == var2);
        this.field5007 = var2.field4850;
        return var2;
    }

    public Iterator iterator() {
        return new class499(this);
    }
}

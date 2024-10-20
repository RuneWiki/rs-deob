package deob;

import java.util.Iterator;

@ObfuscatedName("pm")
public final class class420 implements Iterable {

    @ObfuscatedName("pm.s")
    public int field4600;

    @ObfuscatedName("pm.h")
    public class411[] field4597;

    @ObfuscatedName("pm.w")
    public class411 field4598;

    @ObfuscatedName("pm.v")
    public class411 field4599;

    @ObfuscatedName("pm.c")
    public int field4596 = 0;

    public class420(int arg0) {
        this.field4600 = arg0;
        this.field4597 = new class411[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class411 var3 = this.field4597[var2] = new class411();
            var3.field4469 = var3;
            var3.field4470 = var3;
        }
    }

    @ObfuscatedName("pm.s(J)Lon;")
    public class411 method6668(long arg0) {
        class411 var3 = this.field4597[(int) (arg0 & (long) (this.field4600 - 1))];
        for (this.field4598 = var3.field4469; this.field4598 != var3; this.field4598 = this.field4598.field4469) {
            if (this.field4598.field4468 == arg0) {
                class411 var4 = this.field4598;
                this.field4598 = this.field4598.field4469;
                return var4;
            }
        }
        this.field4598 = null;
        return null;
    }

    @ObfuscatedName("pm.h(Lon;J)V")
    public void method6673(class411 arg0, long arg1) {
        if (arg0.field4470 != null) {
            arg0.method6409();
        }
        class411 var4 = this.field4597[(int) (arg1 & (long) (this.field4600 - 1))];
        arg0.field4470 = var4.field4470;
        arg0.field4469 = var4;
        arg0.field4470.field4469 = arg0;
        arg0.field4469.field4470 = arg0;
        arg0.field4468 = arg1;
    }

    @ObfuscatedName("pm.w()V")
    public void method6670() {
        for (int var1 = 0; var1 < this.field4600; var1++) {
            class411 var2 = this.field4597[var1];
            while (true) {
                class411 var3 = var2.field4469;
                if (var2 == var3) {
                    break;
                }
                var3.method6409();
            }
        }
        this.field4598 = null;
        this.field4599 = null;
    }

    @ObfuscatedName("pm.v()Lon;")
    public class411 method6671() {
        this.field4596 = 0;
        return this.method6675();
    }

    @ObfuscatedName("pm.c()Lon;")
    public class411 method6675() {
        if (this.field4596 > 0 && this.field4597[this.field4596 - 1] != this.field4599) {
            class411 var1 = this.field4599;
            this.field4599 = var1.field4469;
            return var1;
        }
        class411 var2;
        do {
            if (this.field4596 >= this.field4600) {
                return null;
            }
            var2 = this.field4597[this.field4596++].field4469;
        } while (this.field4597[this.field4596 - 1] == var2);
        this.field4599 = var2.field4469;
        return var2;
    }

    public Iterator iterator() {
        return new class419(this);
    }
}

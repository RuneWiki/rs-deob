package deob;

import java.util.Iterator;

@ObfuscatedName("gx")
public final class class198 implements Iterable {

    @ObfuscatedName("gx.w")
    public int field2427;

    @ObfuscatedName("gx.m")
    public class205[] field2424;

    @ObfuscatedName("gx.q")
    public class205 field2426;

    @ObfuscatedName("gx.b")
    public class205 field2423;

    @ObfuscatedName("gx.f")
    public int field2425 = 0;

    public class198(int arg0) {
        this.field2427 = arg0;
        this.field2424 = new class205[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class205 var3 = this.field2424[var2] = new class205();
            var3.field2448 = var3;
            var3.field2449 = var3;
        }
    }

    @ObfuscatedName("gx.w(J)Lgl;")
    public class205 method3675(long arg0) {
        class205 var3 = this.field2424[(int) (arg0 & (long) (this.field2427 - 1))];
        for (this.field2426 = var3.field2448; this.field2426 != var3; this.field2426 = this.field2426.field2448) {
            if (this.field2426.field2450 == arg0) {
                class205 var4 = this.field2426;
                this.field2426 = this.field2426.field2448;
                return var4;
            }
        }
        this.field2426 = null;
        return null;
    }

    @ObfuscatedName("gx.m(Lgl;J)V")
    public void method3676(class205 arg0, long arg1) {
        if (arg0.field2449 != null) {
            arg0.method3782();
        }
        class205 var4 = this.field2424[(int) (arg1 & (long) (this.field2427 - 1))];
        arg0.field2449 = var4.field2449;
        arg0.field2448 = var4;
        arg0.field2449.field2448 = arg0;
        arg0.field2448.field2449 = arg0;
        arg0.field2450 = arg1;
    }

    @ObfuscatedName("gx.q()V")
    public void method3689() {
        for (int var1 = 0; var1 < this.field2427; var1++) {
            class205 var2 = this.field2424[var1];
            while (true) {
                class205 var3 = var2.field2448;
                if (var2 == var3) {
                    break;
                }
                var3.method3782();
            }
        }
        this.field2426 = null;
        this.field2423 = null;
    }

    @ObfuscatedName("gx.x()Lgl;")
    public class205 method3680() {
        this.field2425 = 0;
        return this.method3679();
    }

    @ObfuscatedName("gx.j()Lgl;")
    public class205 method3679() {
        if (this.field2425 > 0 && this.field2424[this.field2425 - 1] != this.field2423) {
            class205 var1 = this.field2423;
            this.field2423 = var1.field2448;
            return var1;
        }
        class205 var2;
        do {
            if (this.field2425 >= this.field2427) {
                return null;
            }
            var2 = this.field2424[this.field2425++].field2448;
        } while (this.field2424[this.field2425 - 1] == var2);
        this.field2423 = var2.field2448;
        return var2;
    }

    public Iterator iterator() {
        return new class211(this);
    }
}

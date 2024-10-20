package deob;

@ObfuscatedName("hp")
public final class class215 {

    @ObfuscatedName("hp.t")
    public int field2632;

    @ObfuscatedName("hp.q")
    public class217[] field2630;

    @ObfuscatedName("hp.i")
    public class217 field2629;

    @ObfuscatedName("hp.a")
    public class217 field2631;

    @ObfuscatedName("hp.l")
    public int field2633 = 0;

    public class215(int arg0) {
        this.field2632 = arg0;
        this.field2630 = new class217[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class217 var3 = this.field2630[var2] = new class217();
            var3.field2637 = var3;
            var3.field2638 = var3;
        }
    }

    @ObfuscatedName("hp.t(J)Lhx;")
    public class217 method3677(long arg0) {
        class217 var3 = this.field2630[(int) (arg0 & (long) (this.field2632 - 1))];
        for (this.field2629 = var3.field2637; this.field2629 != var3; this.field2629 = this.field2629.field2637) {
            if (this.field2629.field2636 == arg0) {
                class217 var4 = this.field2629;
                this.field2629 = this.field2629.field2637;
                return var4;
            }
        }
        this.field2629 = null;
        return null;
    }

    @ObfuscatedName("hp.q(Lhx;J)V")
    public void method3669(class217 arg0, long arg1) {
        if (arg0.field2638 != null) {
            arg0.method3721();
        }
        class217 var4 = this.field2630[(int) (arg1 & (long) (this.field2632 - 1))];
        arg0.field2638 = var4.field2638;
        arg0.field2637 = var4;
        arg0.field2638.field2637 = arg0;
        arg0.field2637.field2638 = arg0;
        arg0.field2636 = arg1;
    }

    @ObfuscatedName("hp.i()V")
    public void method3670() {
        for (int var1 = 0; var1 < this.field2632; var1++) {
            class217 var2 = this.field2630[var1];
            while (true) {
                class217 var3 = var2.field2637;
                if (var2 == var3) {
                    break;
                }
                var3.method3721();
            }
        }
        this.field2629 = null;
        this.field2631 = null;
    }

    @ObfuscatedName("hp.a()Lhx;")
    public class217 method3667() {
        this.field2633 = 0;
        return this.method3672();
    }

    @ObfuscatedName("hp.l()Lhx;")
    public class217 method3672() {
        if (this.field2633 > 0 && this.field2630[this.field2633 - 1] != this.field2631) {
            class217 var1 = this.field2631;
            this.field2631 = var1.field2637;
            return var1;
        }
        class217 var2;
        do {
            if (this.field2633 >= this.field2632) {
                return null;
            }
            var2 = this.field2630[this.field2633++].field2637;
        } while (this.field2630[this.field2633 - 1] == var2);
        this.field2631 = var2.field2637;
        return var2;
    }
}

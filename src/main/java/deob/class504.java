package deob;

import java.util.Iterator;

@ObfuscatedName("tb")
public final class class504 implements Iterable {

    @ObfuscatedName("tb.am")
    public int field5050;

    @ObfuscatedName("tb.ap")
    public class489[] field5048;

    @ObfuscatedName("tb.af")
    public class489 field5051;

    @ObfuscatedName("tb.aj")
    public class489 field5049;

    @ObfuscatedName("tb.aq")
    public int field5052 = 0;

    public class504(int arg0) {
        this.field5050 = arg0;
        this.field5048 = new class489[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class489 var3 = this.field5048[var2] = new class489();
            var3.field4888 = var3;
            var3.field4890 = var3;
        }
    }

    @ObfuscatedName("tb.am(J)Lse;")
    public class489 method8286(long arg0) {
        class489 var3 = this.field5048[(int) (arg0 & (long) (this.field5050 - 1))];
        for (this.field5051 = var3.field4888; this.field5051 != var3; this.field5051 = this.field5051.field4888) {
            if (this.field5051.field4889 == arg0) {
                class489 var4 = this.field5051;
                this.field5051 = this.field5051.field4888;
                return var4;
            }
        }
        this.field5051 = null;
        return null;
    }

    @ObfuscatedName("tb.ap(Lse;J)V")
    public void method8292(class489 arg0, long arg1) {
        if (arg0.field4890 != null) {
            arg0.method7988();
        }
        class489 var4 = this.field5048[(int) (arg1 & (long) (this.field5050 - 1))];
        arg0.field4890 = var4.field4890;
        arg0.field4888 = var4;
        arg0.field4890.field4888 = arg0;
        arg0.field4888.field4890 = arg0;
        arg0.field4889 = arg1;
    }

    @ObfuscatedName("tb.af()V")
    public void method8284() {
        for (int var1 = 0; var1 < this.field5050; var1++) {
            class489 var2 = this.field5048[var1];
            while (true) {
                class489 var3 = var2.field4888;
                if (var2 == var3) {
                    break;
                }
                var3.method7988();
            }
        }
        this.field5051 = null;
        this.field5049 = null;
    }

    @ObfuscatedName("tb.aj()Lse;")
    public class489 method8285() {
        this.field5052 = 0;
        return this.method8288();
    }

    @ObfuscatedName("tb.aq()Lse;")
    public class489 method8288() {
        if (this.field5052 > 0 && this.field5048[this.field5052 - 1] != this.field5049) {
            class489 var1 = this.field5049;
            this.field5049 = var1.field4888;
            return var1;
        }
        class489 var2;
        do {
            if (this.field5052 >= this.field5050) {
                return null;
            }
            var2 = this.field5048[this.field5052++].field4888;
        } while (this.field5048[this.field5052 - 1] == var2);
        this.field5049 = var2.field4888;
        return var2;
    }

    public Iterator iterator() {
        return new class503(this);
    }
}

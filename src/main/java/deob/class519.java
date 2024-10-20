package deob;

import java.util.Iterator;

@ObfuscatedName("tu")
public final class class519 implements Iterable {

    @ObfuscatedName("tu.ak")
    public int field5206;

    @ObfuscatedName("tu.al")
    public class504[] field5209;

    @ObfuscatedName("tu.aj")
    public class504 field5207;

    @ObfuscatedName("tu.az")
    public class504 field5208;

    @ObfuscatedName("tu.af")
    public int field5205 = 0;

    public class519(int arg0) {
        this.field5206 = arg0;
        this.field5209 = new class504[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class504 var3 = this.field5209[var2] = new class504();
            var3.field5048 = var3;
            var3.field5050 = var3;
        }
    }

    @ObfuscatedName("tu.ak(J)Ltl;")
    public class504 method8506(long arg0) {
        class504 var3 = this.field5209[(int) (arg0 & (long) (this.field5206 - 1))];
        for (this.field5207 = var3.field5048; this.field5207 != var3; this.field5207 = this.field5207.field5048) {
            if (this.field5207.field5049 == arg0) {
                class504 var4 = this.field5207;
                this.field5207 = this.field5207.field5048;
                return var4;
            }
        }
        this.field5207 = null;
        return null;
    }

    @ObfuscatedName("tu.al(Ltl;J)V")
    public void method8513(class504 arg0, long arg1) {
        if (arg0.field5050 != null) {
            arg0.method8189();
        }
        class504 var4 = this.field5209[(int) (arg1 & (long) (this.field5206 - 1))];
        arg0.field5050 = var4.field5050;
        arg0.field5048 = var4;
        arg0.field5050.field5048 = arg0;
        arg0.field5048.field5050 = arg0;
        arg0.field5049 = arg1;
    }

    @ObfuscatedName("tu.aj()V")
    public void method8508() {
        for (int var1 = 0; var1 < this.field5206; var1++) {
            class504 var2 = this.field5209[var1];
            while (true) {
                class504 var3 = var2.field5048;
                if (var2 == var3) {
                    break;
                }
                var3.method8189();
            }
        }
        this.field5207 = null;
        this.field5208 = null;
    }

    @ObfuscatedName("tu.az()Ltl;")
    public class504 method8509() {
        this.field5205 = 0;
        return this.method8507();
    }

    @ObfuscatedName("tu.af()Ltl;")
    public class504 method8507() {
        if (this.field5205 > 0 && this.field5209[this.field5205 - 1] != this.field5208) {
            class504 var1 = this.field5208;
            this.field5208 = var1.field5048;
            return var1;
        }
        class504 var2;
        do {
            if (this.field5205 >= this.field5206) {
                return null;
            }
            var2 = this.field5209[this.field5205++].field5048;
        } while (this.field5209[this.field5205 - 1] == var2);
        this.field5208 = var2.field5048;
        return var2;
    }

    public Iterator iterator() {
        return new class518(this);
    }
}

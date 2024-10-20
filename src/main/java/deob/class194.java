package deob;

import java.util.Iterator;

@ObfuscatedName("gi")
public final class class194 implements Iterable {

    @ObfuscatedName("gi.d")
    public int field2546;

    @ObfuscatedName("gi.x")
    public class200[] field2543;

    @ObfuscatedName("gi.k")
    public class200 field2545;

    @ObfuscatedName("gi.z")
    public class200 field2544;

    @ObfuscatedName("gi.v")
    public int field2547 = 0;

    public class194(int arg0) {
        this.field2546 = arg0;
        this.field2543 = new class200[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class200 var3 = this.field2543[var2] = new class200();
            var3.field2565 = var3;
            var3.field2566 = var3;
        }
    }

    @ObfuscatedName("gi.d(J)Lgf;")
    public class200 method3391(long arg0) {
        class200 var3 = this.field2543[(int) (arg0 & (long) (this.field2546 - 1))];
        for (this.field2545 = var3.field2565; this.field2545 != var3; this.field2545 = this.field2545.field2565) {
            if (this.field2545.field2564 == arg0) {
                class200 var4 = this.field2545;
                this.field2545 = this.field2545.field2565;
                return var4;
            }
        }
        this.field2545 = null;
        return null;
    }

    @ObfuscatedName("gi.x(Lgf;J)V")
    public void method3392(class200 arg0, long arg1) {
        if (arg0.field2566 != null) {
            arg0.method3475();
        }
        class200 var4 = this.field2543[(int) (arg1 & (long) (this.field2546 - 1))];
        arg0.field2566 = var4.field2566;
        arg0.field2565 = var4;
        arg0.field2566.field2565 = arg0;
        arg0.field2565.field2566 = arg0;
        arg0.field2564 = arg1;
    }

    @ObfuscatedName("gi.k()V")
    public void method3393() {
        for (int var1 = 0; var1 < this.field2546; var1++) {
            class200 var2 = this.field2543[var1];
            while (true) {
                class200 var3 = var2.field2565;
                if (var2 == var3) {
                    break;
                }
                var3.method3475();
            }
        }
        this.field2545 = null;
        this.field2544 = null;
    }

    @ObfuscatedName("gi.z()Lgf;")
    public class200 method3394() {
        this.field2547 = 0;
        return this.method3395();
    }

    @ObfuscatedName("gi.v()Lgf;")
    public class200 method3395() {
        if (this.field2547 > 0 && this.field2543[this.field2547 - 1] != this.field2544) {
            class200 var1 = this.field2544;
            this.field2544 = var1.field2565;
            return var1;
        }
        class200 var2;
        do {
            if (this.field2547 >= this.field2546) {
                return null;
            }
            var2 = this.field2543[this.field2547++].field2565;
        } while (this.field2543[this.field2547 - 1] == var2);
        this.field2544 = var2.field2565;
        return var2;
    }

    public Iterator iterator() {
        return new class205(this);
    }
}

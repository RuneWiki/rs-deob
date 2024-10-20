package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public final class class200 implements Iterable {

    @ObfuscatedName("gz.c")
    public int field2442;

    @ObfuscatedName("gz.q")
    public class207[] field2441;

    @ObfuscatedName("gz.m")
    public class207 field2440;

    @ObfuscatedName("gz.j")
    public class207 field2443;

    @ObfuscatedName("gz.g")
    public int field2444 = 0;

    public class200(int arg0) {
        this.field2442 = arg0;
        this.field2441 = new class207[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class207 var3 = this.field2441[var2] = new class207();
            var3.field2465 = var3;
            var3.field2467 = var3;
        }
    }

    @ObfuscatedName("gz.c(J)Lgk;")
    public class207 method3619(long arg0) {
        class207 var3 = this.field2441[(int) (arg0 & (long) (this.field2442 - 1))];
        for (this.field2440 = var3.field2465; this.field2440 != var3; this.field2440 = this.field2440.field2465) {
            if (this.field2440.field2466 == arg0) {
                class207 var4 = this.field2440;
                this.field2440 = this.field2440.field2465;
                return var4;
            }
        }
        this.field2440 = null;
        return null;
    }

    @ObfuscatedName("gz.q(Lgk;J)V")
    public void method3626(class207 arg0, long arg1) {
        if (arg0.field2467 != null) {
            arg0.method3733();
        }
        class207 var4 = this.field2441[(int) (arg1 & (long) (this.field2442 - 1))];
        arg0.field2467 = var4.field2467;
        arg0.field2465 = var4;
        arg0.field2467.field2465 = arg0;
        arg0.field2465.field2467 = arg0;
        arg0.field2466 = arg1;
    }

    @ObfuscatedName("gz.m()V")
    public void method3620() {
        for (int var1 = 0; var1 < this.field2442; var1++) {
            class207 var2 = this.field2441[var1];
            while (true) {
                class207 var3 = var2.field2465;
                if (var2 == var3) {
                    break;
                }
                var3.method3733();
            }
        }
        this.field2440 = null;
        this.field2443 = null;
    }

    @ObfuscatedName("gz.j()Lgk;")
    public class207 method3621() {
        this.field2444 = 0;
        return this.method3622();
    }

    @ObfuscatedName("gz.g()Lgk;")
    public class207 method3622() {
        if (this.field2444 > 0 && this.field2441[this.field2444 - 1] != this.field2443) {
            class207 var1 = this.field2443;
            this.field2443 = var1.field2465;
            return var1;
        }
        class207 var2;
        do {
            if (this.field2444 >= this.field2442) {
                return null;
            }
            var2 = this.field2441[this.field2444++].field2465;
        } while (this.field2441[this.field2444 - 1] == var2);
        this.field2443 = var2.field2465;
        return var2;
    }

    public Iterator iterator() {
        return new class213(this);
    }
}

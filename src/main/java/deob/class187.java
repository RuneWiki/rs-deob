package deob;

import java.util.Iterator;

@ObfuscatedName("gk")
public final class class187 implements Iterable {

    @ObfuscatedName("gk.w")
    public int field2444;

    @ObfuscatedName("gk.s")
    public class193[] field2443;

    @ObfuscatedName("gk.q")
    public class193 field2445;

    @ObfuscatedName("gk.o")
    public class193 field2446;

    @ObfuscatedName("gk.g")
    public int field2447 = 0;

    public class187(int arg0) {
        this.field2444 = arg0;
        this.field2443 = new class193[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class193 var3 = this.field2443[var2] = new class193();
            var3.field2465 = var3;
            var3.field2466 = var3;
        }
    }

    @ObfuscatedName("gk.w(J)Lgd;")
    public class193 method3331(long arg0) {
        class193 var3 = this.field2443[(int) (arg0 & (long) (this.field2444 - 1))];
        for (this.field2445 = var3.field2465; this.field2445 != var3; this.field2445 = this.field2445.field2465) {
            if (this.field2445.field2464 == arg0) {
                class193 var4 = this.field2445;
                this.field2445 = this.field2445.field2465;
                return var4;
            }
        }
        this.field2445 = null;
        return null;
    }

    @ObfuscatedName("gk.s(Lgd;J)V")
    public void method3324(class193 arg0, long arg1) {
        if (arg0.field2466 != null) {
            arg0.method3425();
        }
        class193 var4 = this.field2443[(int) (arg1 & (long) (this.field2444 - 1))];
        arg0.field2466 = var4.field2466;
        arg0.field2465 = var4;
        arg0.field2466.field2465 = arg0;
        arg0.field2465.field2466 = arg0;
        arg0.field2464 = arg1;
    }

    @ObfuscatedName("gk.q()V")
    public void method3340() {
        for (int var1 = 0; var1 < this.field2444; var1++) {
            class193 var2 = this.field2443[var1];
            while (true) {
                class193 var3 = var2.field2465;
                if (var2 == var3) {
                    break;
                }
                var3.method3425();
            }
        }
        this.field2445 = null;
        this.field2446 = null;
    }

    @ObfuscatedName("gk.o()Lgd;")
    public class193 method3327() {
        this.field2447 = 0;
        return this.method3328();
    }

    @ObfuscatedName("gk.g()Lgd;")
    public class193 method3328() {
        if (this.field2447 > 0 && this.field2443[this.field2447 - 1] != this.field2446) {
            class193 var1 = this.field2446;
            this.field2446 = var1.field2465;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2447 >= this.field2444) {
                return null;
            }
            var2 = this.field2443[this.field2447++].field2465;
        } while (this.field2443[this.field2447 - 1] == var2);
        this.field2446 = var2.field2465;
        return var2;
    }

    public Iterator iterator() {
        return new class198(this);
    }
}

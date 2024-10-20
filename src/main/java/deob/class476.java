package deob;

import java.util.Iterator;

@ObfuscatedName("sv")
public final class class476 implements Iterable {

    @ObfuscatedName("sv.at")
    public int field4913;

    @ObfuscatedName("sv.an")
    public class461[] field4911;

    @ObfuscatedName("sv.av")
    public class461 field4910;

    @ObfuscatedName("sv.as")
    public class461 field4912;

    @ObfuscatedName("sv.ax")
    public int field4914 = 0;

    public class476(int arg0) {
        this.field4913 = arg0;
        this.field4911 = new class461[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class461 var3 = this.field4911[var2] = new class461();
            var3.field4756 = var3;
            var3.field4755 = var3;
        }
    }

    @ObfuscatedName("sv.at(J)Lrz;")
    public class461 method7848(long arg0) {
        class461 var3 = this.field4911[(int) (arg0 & (long) (this.field4913 - 1))];
        for (this.field4910 = var3.field4756; this.field4910 != var3; this.field4910 = this.field4910.field4756) {
            if (this.field4910.field4757 == arg0) {
                class461 var4 = this.field4910;
                this.field4910 = this.field4910.field4756;
                return var4;
            }
        }
        this.field4910 = null;
        return null;
    }

    @ObfuscatedName("sv.an(Lrz;J)V")
    public void method7857(class461 arg0, long arg1) {
        if (arg0.field4755 != null) {
            arg0.method7560();
        }
        class461 var4 = this.field4911[(int) (arg1 & (long) (this.field4913 - 1))];
        arg0.field4755 = var4.field4755;
        arg0.field4756 = var4;
        arg0.field4755.field4756 = arg0;
        arg0.field4756.field4755 = arg0;
        arg0.field4757 = arg1;
    }

    @ObfuscatedName("sv.av()V")
    public void method7850() {
        for (int var1 = 0; var1 < this.field4913; var1++) {
            class461 var2 = this.field4911[var1];
            while (true) {
                class461 var3 = var2.field4756;
                if (var2 == var3) {
                    break;
                }
                var3.method7560();
            }
        }
        this.field4910 = null;
        this.field4912 = null;
    }

    @ObfuscatedName("sv.as()Lrz;")
    public class461 method7852() {
        this.field4914 = 0;
        return this.method7862();
    }

    @ObfuscatedName("sv.ax()Lrz;")
    public class461 method7862() {
        if (this.field4914 > 0 && this.field4911[this.field4914 - 1] != this.field4912) {
            class461 var1 = this.field4912;
            this.field4912 = var1.field4756;
            return var1;
        }
        class461 var2;
        do {
            if (this.field4914 >= this.field4913) {
                return null;
            }
            var2 = this.field4911[this.field4914++].field4756;
        } while (this.field4911[this.field4914 - 1] == var2);
        this.field4912 = var2.field4756;
        return var2;
    }

    public Iterator iterator() {
        return new class475(this);
    }
}

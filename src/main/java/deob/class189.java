package deob;

import java.util.Iterator;

@ObfuscatedName("gb")
public final class class189 implements Iterable {

    @ObfuscatedName("gb.b")
    public int field2986;

    @ObfuscatedName("gb.e")
    public class199[] field2987;

    @ObfuscatedName("gb.a")
    public class199 field2988;

    public class189(int arg0) {
        this.field2986 = arg0;
        this.field2987 = new class199[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class199 var3 = this.field2987[var2] = new class199();
            var3.field3005 = var3;
            var3.field3007 = var3;
        }
    }

    @ObfuscatedName("gb.b(J)Lgv;")
    public class199 method3304(long arg0) {
        class199 var3 = this.field2987[(int) (arg0 & (long) (this.field2986 - 1))];
        for (this.field2988 = var3.field3005; this.field2988 != var3; this.field2988 = this.field2988.field3005) {
            if (this.field2988.field3006 == arg0) {
                class199 var4 = this.field2988;
                this.field2988 = this.field2988.field3005;
                return var4;
            }
        }
        this.field2988 = null;
        return null;
    }

    @ObfuscatedName("gb.e(Lgv;J)V")
    public void method3303(class199 arg0, long arg1) {
        if (arg0.field3007 != null) {
            arg0.method3414();
        }
        class199 var4 = this.field2987[(int) (arg1 & (long) (this.field2986 - 1))];
        arg0.field3007 = var4.field3007;
        arg0.field3005 = var4;
        arg0.field3007.field3005 = arg0;
        arg0.field3005.field3007 = arg0;
        arg0.field3006 = arg1;
    }

    @ObfuscatedName("gb.a()V")
    public void method3306() {
        for (int var1 = 0; var1 < this.field2986; var1++) {
            class199 var2 = this.field2987[var1];
            while (true) {
                class199 var3 = var2.field3005;
                if (var2 == var3) {
                    break;
                }
                var3.method3414();
            }
        }
        this.field2988 = null;
    }

    public Iterator iterator() {
        return new class185(this);
    }
}

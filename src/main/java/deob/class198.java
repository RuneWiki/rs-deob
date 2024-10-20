package deob;

import java.util.Iterator;

@ObfuscatedName("gr")
public final class class198 implements Iterable {

    @ObfuscatedName("gr.y")
    public int field3072;

    @ObfuscatedName("gr.d")
    public class208[] field3073;

    @ObfuscatedName("gr.g")
    public class208 field3074;

    public class198(int arg0) {
        this.field3072 = arg0;
        this.field3073 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3073[var2] = new class208();
            var3.field3092 = var3;
            var3.field3093 = var3;
        }
    }

    @ObfuscatedName("gr.y(J)Lgx;")
    public class208 method3475(long arg0) {
        class208 var3 = this.field3073[(int) (arg0 & (long) (this.field3072 - 1))];
        for (this.field3074 = var3.field3092; this.field3074 != var3; this.field3074 = this.field3074.field3092) {
            if (this.field3074.field3091 == arg0) {
                class208 var4 = this.field3074;
                this.field3074 = this.field3074.field3092;
                return var4;
            }
        }
        this.field3074 = null;
        return null;
    }

    @ObfuscatedName("gr.d(Lgx;J)V")
    public void method3476(class208 arg0, long arg1) {
        if (arg0.field3093 != null) {
            arg0.method3588();
        }
        class208 var4 = this.field3073[(int) (arg1 & (long) (this.field3072 - 1))];
        arg0.field3093 = var4.field3093;
        arg0.field3092 = var4;
        arg0.field3093.field3092 = arg0;
        arg0.field3092.field3093 = arg0;
        arg0.field3091 = arg1;
    }

    @ObfuscatedName("gr.g()V")
    public void method3477() {
        for (int var1 = 0; var1 < this.field3072; var1++) {
            class208 var2 = this.field3073[var1];
            while (true) {
                class208 var3 = var2.field3092;
                if (var2 == var3) {
                    break;
                }
                var3.method3588();
            }
        }
        this.field3074 = null;
    }

    public Iterator iterator() {
        return new class194(this);
    }
}

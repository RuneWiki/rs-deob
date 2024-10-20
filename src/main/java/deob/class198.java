package deob;

import java.util.Iterator;

@ObfuscatedName("gr")
public final class class198 implements Iterable {

    @ObfuscatedName("gr.a")
    public int field3093;

    @ObfuscatedName("gr.r")
    public class208[] field3091;

    @ObfuscatedName("gr.f")
    public class208 field3092;

    public class198(int arg0) {
        this.field3093 = arg0;
        this.field3091 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3091[var2] = new class208();
            var3.field3111 = var3;
            var3.field3110 = var3;
        }
    }

    @ObfuscatedName("gr.a(J)Lgs;")
    public class208 method3564(long arg0) {
        class208 var3 = this.field3091[(int) (arg0 & (long) (this.field3093 - 1))];
        for (this.field3092 = var3.field3111; this.field3092 != var3; this.field3092 = this.field3092.field3111) {
            if (this.field3092.field3112 == arg0) {
                class208 var4 = this.field3092;
                this.field3092 = this.field3092.field3111;
                return var4;
            }
        }
        this.field3092 = null;
        return null;
    }

    @ObfuscatedName("gr.r(Lgs;J)V")
    public void method3562(class208 arg0, long arg1) {
        if (arg0.field3110 != null) {
            arg0.method3661();
        }
        class208 var4 = this.field3091[(int) (arg1 & (long) (this.field3093 - 1))];
        arg0.field3110 = var4.field3110;
        arg0.field3111 = var4;
        arg0.field3110.field3111 = arg0;
        arg0.field3111.field3110 = arg0;
        arg0.field3112 = arg1;
    }

    @ObfuscatedName("gr.f()V")
    public void method3559() {
        for (int var1 = 0; var1 < this.field3093; var1++) {
            class208 var2 = this.field3091[var1];
            while (true) {
                class208 var3 = var2.field3111;
                if (var2 == var3) {
                    break;
                }
                var3.method3661();
            }
        }
        this.field3092 = null;
    }

    public Iterator iterator() {
        return new class194(this);
    }
}

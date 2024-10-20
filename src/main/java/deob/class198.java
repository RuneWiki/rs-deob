package deob;

import java.util.Iterator;

@ObfuscatedName("gn")
public final class class198 implements Iterable {

    @ObfuscatedName("gn.h")
    public int field3075;

    @ObfuscatedName("gn.q")
    public class208[] field3076;

    @ObfuscatedName("gn.v")
    public class208 field3074;

    public class198(int arg0) {
        this.field3075 = arg0;
        this.field3076 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3076[var2] = new class208();
            var3.field3094 = var3;
            var3.field3095 = var3;
        }
    }

    @ObfuscatedName("gn.h(J)Lgm;")
    public class208 method3593(long arg0) {
        class208 var3 = this.field3076[(int) (arg0 & (long) (this.field3075 - 1))];
        for (this.field3074 = var3.field3094; this.field3074 != var3; this.field3074 = this.field3074.field3094) {
            if (this.field3074.field3093 == arg0) {
                class208 var4 = this.field3074;
                this.field3074 = this.field3074.field3094;
                return var4;
            }
        }
        this.field3074 = null;
        return null;
    }

    @ObfuscatedName("gn.q(Lgm;J)V")
    public void method3597(class208 arg0, long arg1) {
        if (arg0.field3095 != null) {
            arg0.method3711();
        }
        class208 var4 = this.field3076[(int) (arg1 & (long) (this.field3075 - 1))];
        arg0.field3095 = var4.field3095;
        arg0.field3094 = var4;
        arg0.field3095.field3094 = arg0;
        arg0.field3094.field3095 = arg0;
        arg0.field3093 = arg1;
    }

    @ObfuscatedName("gn.v()V")
    public void method3595() {
        for (int var1 = 0; var1 < this.field3075; var1++) {
            class208 var2 = this.field3076[var1];
            while (true) {
                class208 var3 = var2.field3094;
                if (var2 == var3) {
                    break;
                }
                var3.method3711();
            }
        }
        this.field3074 = null;
    }

    public Iterator iterator() {
        return new class194(this);
    }
}

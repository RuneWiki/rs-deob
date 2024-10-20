package deob;

import java.util.Iterator;

@ObfuscatedName("gy")
public final class class198 implements Iterable {

    @ObfuscatedName("gy.m")
    public int field3076;

    @ObfuscatedName("gy.l")
    public class208[] field3075;

    @ObfuscatedName("gy.y")
    public class208 field3074;

    public class198(int arg0) {
        this.field3076 = arg0;
        this.field3075 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3075[var2] = new class208();
            var3.field3094 = var3;
            var3.field3093 = var3;
        }
    }

    @ObfuscatedName("gy.m(J)Lgs;")
    public class208 method3589(long arg0) {
        class208 var3 = this.field3075[(int) (arg0 & (long) (this.field3076 - 1))];
        for (this.field3074 = var3.field3094; this.field3074 != var3; this.field3074 = this.field3074.field3094) {
            if (this.field3074.field3095 == arg0) {
                class208 var4 = this.field3074;
                this.field3074 = this.field3074.field3094;
                return var4;
            }
        }
        this.field3074 = null;
        return null;
    }

    @ObfuscatedName("gy.l(Lgs;J)V")
    public void method3590(class208 arg0, long arg1) {
        if (arg0.field3093 != null) {
            arg0.method3702();
        }
        class208 var4 = this.field3075[(int) (arg1 & (long) (this.field3076 - 1))];
        arg0.field3093 = var4.field3093;
        arg0.field3094 = var4;
        arg0.field3093.field3094 = arg0;
        arg0.field3094.field3093 = arg0;
        arg0.field3095 = arg1;
    }

    @ObfuscatedName("gy.y()V")
    public void method3591() {
        for (int var1 = 0; var1 < this.field3076; var1++) {
            class208 var2 = this.field3075[var1];
            while (true) {
                class208 var3 = var2.field3094;
                if (var2 == var3) {
                    break;
                }
                var3.method3702();
            }
        }
        this.field3074 = null;
    }

    public Iterator iterator() {
        return new class194(this);
    }
}

package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public final class class199 implements Iterable {

    @ObfuscatedName("gu.f")
    public int field3098;

    @ObfuscatedName("gu.u")
    public class209[] field3097;

    @ObfuscatedName("gu.x")
    public class209 field3099;

    public class199(int arg0) {
        this.field3098 = arg0;
        this.field3097 = new class209[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class209 var3 = this.field3097[var2] = new class209();
            var3.field3117 = var3;
            var3.field3118 = var3;
        }
    }

    @ObfuscatedName("gu.f(J)Lhf;")
    public class209 method3573(long arg0) {
        class209 var3 = this.field3097[(int) (arg0 & (long) (this.field3098 - 1))];
        for (this.field3099 = var3.field3117; this.field3099 != var3; this.field3099 = this.field3099.field3117) {
            if (this.field3099.field3116 == arg0) {
                class209 var4 = this.field3099;
                this.field3099 = this.field3099.field3117;
                return var4;
            }
        }
        this.field3099 = null;
        return null;
    }

    @ObfuscatedName("gu.u(Lhf;J)V")
    public void method3575(class209 arg0, long arg1) {
        if (arg0.field3118 != null) {
            arg0.method3679();
        }
        class209 var4 = this.field3097[(int) (arg1 & (long) (this.field3098 - 1))];
        arg0.field3118 = var4.field3118;
        arg0.field3117 = var4;
        arg0.field3118.field3117 = arg0;
        arg0.field3117.field3118 = arg0;
        arg0.field3116 = arg1;
    }

    @ObfuscatedName("gu.x()V")
    public void method3576() {
        for (int var1 = 0; var1 < this.field3098; var1++) {
            class209 var2 = this.field3097[var1];
            while (true) {
                class209 var3 = var2.field3117;
                if (var2 == var3) {
                    break;
                }
                var3.method3679();
            }
        }
        this.field3099 = null;
    }

    public Iterator iterator() {
        return new class195(this);
    }
}

package deob;

import java.util.Iterator;

@ObfuscatedName("gw")
public final class class199 implements Iterable {

    @ObfuscatedName("gw.e")
    public int field3096;

    @ObfuscatedName("gw.w")
    public class209[] field3097;

    @ObfuscatedName("gw.f")
    public class209 field3098;

    public class199(int arg0) {
        this.field3096 = arg0;
        this.field3097 = new class209[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class209 var3 = this.field3097[var2] = new class209();
            var3.field3115 = var3;
            var3.field3117 = var3;
        }
    }

    @ObfuscatedName("gw.e(J)Lhd;")
    public class209 method3528(long arg0) {
        class209 var3 = this.field3097[(int) (arg0 & (long) (this.field3096 - 1))];
        for (this.field3098 = var3.field3115; this.field3098 != var3; this.field3098 = this.field3098.field3115) {
            if (this.field3098.field3116 == arg0) {
                class209 var4 = this.field3098;
                this.field3098 = this.field3098.field3115;
                return var4;
            }
        }
        this.field3098 = null;
        return null;
    }

    @ObfuscatedName("gw.w(Lhd;J)V")
    public void method3525(class209 arg0, long arg1) {
        if (arg0.field3117 != null) {
            arg0.method3632();
        }
        class209 var4 = this.field3097[(int) (arg1 & (long) (this.field3096 - 1))];
        arg0.field3117 = var4.field3117;
        arg0.field3115 = var4;
        arg0.field3117.field3115 = arg0;
        arg0.field3115.field3117 = arg0;
        arg0.field3116 = arg1;
    }

    @ObfuscatedName("gw.f()V")
    public void method3529() {
        for (int var1 = 0; var1 < this.field3096; var1++) {
            class209 var2 = this.field3097[var1];
            while (true) {
                class209 var3 = var2.field3115;
                if (var2 == var3) {
                    break;
                }
                var3.method3632();
            }
        }
        this.field3098 = null;
    }

    public Iterator iterator() {
        return new class195(this);
    }
}

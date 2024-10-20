package deob;

import java.util.Iterator;

@ObfuscatedName("gd")
public final class class199 implements Iterable {

    @ObfuscatedName("gd.b")
    public int field3097;

    @ObfuscatedName("gd.g")
    public class209[] field3095;

    @ObfuscatedName("gd.j")
    public class209 field3096;

    public class199(int arg0) {
        this.field3097 = arg0;
        this.field3095 = new class209[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class209 var3 = this.field3095[var2] = new class209();
            var3.field3115 = var3;
            var3.field3116 = var3;
        }
    }

    @ObfuscatedName("gd.b(J)Lhk;")
    public class209 method3539(long arg0) {
        class209 var3 = this.field3095[(int) (arg0 & (long) (this.field3097 - 1))];
        for (this.field3096 = var3.field3115; this.field3096 != var3; this.field3096 = this.field3096.field3115) {
            if (this.field3096.field3114 == arg0) {
                class209 var4 = this.field3096;
                this.field3096 = this.field3096.field3115;
                return var4;
            }
        }
        this.field3096 = null;
        return null;
    }

    @ObfuscatedName("gd.g(Lhk;J)V")
    public void method3540(class209 arg0, long arg1) {
        if (arg0.field3116 != null) {
            arg0.method3647();
        }
        class209 var4 = this.field3095[(int) (arg1 & (long) (this.field3097 - 1))];
        arg0.field3116 = var4.field3116;
        arg0.field3115 = var4;
        arg0.field3116.field3115 = arg0;
        arg0.field3115.field3116 = arg0;
        arg0.field3114 = arg1;
    }

    @ObfuscatedName("gd.j()V")
    public void method3543() {
        for (int var1 = 0; var1 < this.field3097; var1++) {
            class209 var2 = this.field3095[var1];
            while (true) {
                class209 var3 = var2.field3115;
                if (var2 == var3) {
                    break;
                }
                var3.method3647();
            }
        }
        this.field3096 = null;
    }

    public Iterator iterator() {
        return new class195(this);
    }
}

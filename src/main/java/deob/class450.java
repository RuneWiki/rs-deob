package deob;

import java.util.Iterator;

@ObfuscatedName("qu")
public final class class450 implements Iterable {

    @ObfuscatedName("qu.f")
    public int field4843;

    @ObfuscatedName("qu.w")
    public class440[] field4840;

    @ObfuscatedName("qu.v")
    public class440 field4841;

    @ObfuscatedName("qu.s")
    public class440 field4842;

    @ObfuscatedName("qu.z")
    public int field4839 = 0;

    public class450(int arg0) {
        this.field4843 = arg0;
        this.field4840 = new class440[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class440 var3 = this.field4840[var2] = new class440();
            var3.field4710 = var3;
            var3.field4709 = var3;
        }
    }

    @ObfuscatedName("qu.f(J)Lpr;")
    public class440 method7691(long arg0) {
        class440 var3 = this.field4840[(int) (arg0 & (long) (this.field4843 - 1))];
        for (this.field4841 = var3.field4710; this.field4841 != var3; this.field4841 = this.field4841.field4710) {
            if (this.field4841.field4711 == arg0) {
                class440 var4 = this.field4841;
                this.field4841 = this.field4841.field4710;
                return var4;
            }
        }
        this.field4841 = null;
        return null;
    }

    @ObfuscatedName("qu.w(Lpr;J)V")
    public void method7693(class440 arg0, long arg1) {
        if (arg0.field4709 != null) {
            arg0.method7431();
        }
        class440 var4 = this.field4840[(int) (arg1 & (long) (this.field4843 - 1))];
        arg0.field4709 = var4.field4709;
        arg0.field4710 = var4;
        arg0.field4709.field4710 = arg0;
        arg0.field4710.field4709 = arg0;
        arg0.field4711 = arg1;
    }

    @ObfuscatedName("qu.v()V")
    public void method7698() {
        for (int var1 = 0; var1 < this.field4843; var1++) {
            class440 var2 = this.field4840[var1];
            while (true) {
                class440 var3 = var2.field4710;
                if (var2 == var3) {
                    break;
                }
                var3.method7431();
            }
        }
        this.field4841 = null;
        this.field4842 = null;
    }

    @ObfuscatedName("qu.s()Lpr;")
    public class440 method7694() {
        this.field4839 = 0;
        return this.method7695();
    }

    @ObfuscatedName("qu.z()Lpr;")
    public class440 method7695() {
        if (this.field4839 > 0 && this.field4840[this.field4839 - 1] != this.field4842) {
            class440 var1 = this.field4842;
            this.field4842 = var1.field4710;
            return var1;
        }
        class440 var2;
        do {
            if (this.field4839 >= this.field4843) {
                return null;
            }
            var2 = this.field4840[this.field4839++].field4710;
        } while (this.field4840[this.field4839 - 1] == var2);
        this.field4842 = var2.field4710;
        return var2;
    }

    public Iterator iterator() {
        return new class449(this);
    }
}

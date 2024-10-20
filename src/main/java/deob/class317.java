package deob;

import java.util.Iterator;

@ObfuscatedName("lh")
public final class class317 implements Iterable {

    @ObfuscatedName("lh.m")
    public int field3842;

    @ObfuscatedName("lh.f")
    public class186[] field3840;

    @ObfuscatedName("lh.q")
    public class186 field3841;

    @ObfuscatedName("lh.w")
    public class186 field3839;

    @ObfuscatedName("lh.o")
    public int field3843 = 0;

    public class317(int arg0) {
        this.field3842 = arg0;
        this.field3840 = new class186[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class186 var3 = this.field3840[var2] = new class186();
            var3.field2140 = var3;
            var3.field2141 = var3;
        }
    }

    @ObfuscatedName("lh.m(J)Lgw;")
    public class186 method5382(long arg0) {
        class186 var3 = this.field3840[(int) (arg0 & (long) (this.field3842 - 1))];
        for (this.field3841 = var3.field2140; this.field3841 != var3; this.field3841 = this.field3841.field2140) {
            if (this.field3841.field2139 == arg0) {
                class186 var4 = this.field3841;
                this.field3841 = this.field3841.field2140;
                return var4;
            }
        }
        this.field3841 = null;
        return null;
    }

    @ObfuscatedName("lh.f(Lgw;J)V")
    public void method5383(class186 arg0, long arg1) {
        if (arg0.field2141 != null) {
            arg0.method3306();
        }
        class186 var4 = this.field3840[(int) (arg1 & (long) (this.field3842 - 1))];
        arg0.field2141 = var4.field2141;
        arg0.field2140 = var4;
        arg0.field2141.field2140 = arg0;
        arg0.field2140.field2141 = arg0;
        arg0.field2139 = arg1;
    }

    @ObfuscatedName("lh.q()V")
    public void method5391() {
        for (int var1 = 0; var1 < this.field3842; var1++) {
            class186 var2 = this.field3840[var1];
            while (true) {
                class186 var3 = var2.field2140;
                if (var2 == var3) {
                    break;
                }
                var3.method3306();
            }
        }
        this.field3841 = null;
        this.field3839 = null;
    }

    @ObfuscatedName("lh.w()Lgw;")
    public class186 method5385() {
        this.field3843 = 0;
        return this.method5397();
    }

    @ObfuscatedName("lh.o()Lgw;")
    public class186 method5397() {
        if (this.field3843 > 0 && this.field3840[this.field3843 - 1] != this.field3839) {
            class186 var1 = this.field3839;
            this.field3839 = var1.field2140;
            return var1;
        }
        class186 var2;
        do {
            if (this.field3843 >= this.field3842) {
                return null;
            }
            var2 = this.field3840[this.field3843++].field2140;
        } while (this.field3840[this.field3843 - 1] == var2);
        this.field3839 = var2.field2140;
        return var2;
    }

    public Iterator iterator() {
        return new class318(this);
    }
}

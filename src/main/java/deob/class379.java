package deob;

import java.util.Iterator;

@ObfuscatedName("nf")
public final class class379 implements Iterable {

    @ObfuscatedName("nf.i")
    public int field4209;

    @ObfuscatedName("nf.w")
    public class370[] field4210;

    @ObfuscatedName("nf.s")
    public class370 field4211;

    @ObfuscatedName("nf.a")
    public class370 field4212;

    @ObfuscatedName("nf.o")
    public int field4213 = 0;

    public class379(int arg0) {
        this.field4209 = arg0;
        this.field4210 = new class370[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class370 var3 = this.field4210[var2] = new class370();
            var3.field4074 = var3;
            var3.field4076 = var3;
        }
    }

    @ObfuscatedName("nf.i(J)Lns;")
    public class370 method6009(long arg0) {
        class370 var3 = this.field4210[(int) (arg0 & (long) (this.field4209 - 1))];
        for (this.field4211 = var3.field4074; this.field4211 != var3; this.field4211 = this.field4211.field4074) {
            if (this.field4211.field4075 == arg0) {
                class370 var4 = this.field4211;
                this.field4211 = this.field4211.field4074;
                return var4;
            }
        }
        this.field4211 = null;
        return null;
    }

    @ObfuscatedName("nf.w(Lns;J)V")
    public void method6010(class370 arg0, long arg1) {
        if (arg0.field4076 != null) {
            arg0.method5752();
        }
        class370 var4 = this.field4210[(int) (arg1 & (long) (this.field4209 - 1))];
        arg0.field4076 = var4.field4076;
        arg0.field4074 = var4;
        arg0.field4076.field4074 = arg0;
        arg0.field4074.field4076 = arg0;
        arg0.field4075 = arg1;
    }

    @ObfuscatedName("nf.s()V")
    public void method6022() {
        for (int var1 = 0; var1 < this.field4209; var1++) {
            class370 var2 = this.field4210[var1];
            while (true) {
                class370 var3 = var2.field4074;
                if (var2 == var3) {
                    break;
                }
                var3.method5752();
            }
        }
        this.field4211 = null;
        this.field4212 = null;
    }

    @ObfuscatedName("nf.a()Lns;")
    public class370 method6014() {
        this.field4213 = 0;
        return this.method6008();
    }

    @ObfuscatedName("nf.o()Lns;")
    public class370 method6008() {
        if (this.field4213 > 0 && this.field4210[this.field4213 - 1] != this.field4212) {
            class370 var1 = this.field4212;
            this.field4212 = var1.field4074;
            return var1;
        }
        class370 var2;
        do {
            if (this.field4213 >= this.field4209) {
                return null;
            }
            var2 = this.field4210[this.field4213++].field4074;
        } while (this.field4210[this.field4213 - 1] == var2);
        this.field4212 = var2.field4074;
        return var2;
    }

    public Iterator iterator() {
        return new class378(this);
    }
}

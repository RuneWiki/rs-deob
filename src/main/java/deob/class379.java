package deob;

import java.util.Iterator;

@ObfuscatedName("nz")
public final class class379 implements Iterable {

    @ObfuscatedName("nz.l")
    public int field4210;

    @ObfuscatedName("nz.q")
    public class370[] field4209;

    @ObfuscatedName("nz.f")
    public class370 field4208;

    @ObfuscatedName("nz.j")
    public class370 field4206;

    @ObfuscatedName("nz.m")
    public int field4207 = 0;

    public class379(int arg0) {
        this.field4210 = arg0;
        this.field4209 = new class370[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class370 var3 = this.field4209[var2] = new class370();
            var3.field4076 = var3;
            var3.field4077 = var3;
        }
    }

    @ObfuscatedName("nz.l(J)Lnv;")
    public class370 method6049(long arg0) {
        class370 var3 = this.field4209[(int) (arg0 & (long) (this.field4210 - 1))];
        for (this.field4208 = var3.field4076; this.field4208 != var3; this.field4208 = this.field4208.field4076) {
            if (this.field4208.field4075 == arg0) {
                class370 var4 = this.field4208;
                this.field4208 = this.field4208.field4076;
                return var4;
            }
        }
        this.field4208 = null;
        return null;
    }

    @ObfuscatedName("nz.q(Lnv;J)V")
    public void method6043(class370 arg0, long arg1) {
        if (arg0.field4077 != null) {
            arg0.method5775();
        }
        class370 var4 = this.field4209[(int) (arg1 & (long) (this.field4210 - 1))];
        arg0.field4077 = var4.field4077;
        arg0.field4076 = var4;
        arg0.field4077.field4076 = arg0;
        arg0.field4076.field4077 = arg0;
        arg0.field4075 = arg1;
    }

    @ObfuscatedName("nz.f()V")
    public void method6044() {
        for (int var1 = 0; var1 < this.field4210; var1++) {
            class370 var2 = this.field4209[var1];
            while (true) {
                class370 var3 = var2.field4076;
                if (var2 == var3) {
                    break;
                }
                var3.method5775();
            }
        }
        this.field4208 = null;
        this.field4206 = null;
    }

    @ObfuscatedName("nz.j()Lnv;")
    public class370 method6045() {
        this.field4207 = 0;
        return this.method6046();
    }

    @ObfuscatedName("nz.m()Lnv;")
    public class370 method6046() {
        if (this.field4207 > 0 && this.field4209[this.field4207 - 1] != this.field4206) {
            class370 var1 = this.field4206;
            this.field4206 = var1.field4076;
            return var1;
        }
        class370 var2;
        do {
            if (this.field4207 >= this.field4210) {
                return null;
            }
            var2 = this.field4209[this.field4207++].field4076;
        } while (this.field4209[this.field4207 - 1] == var2);
        this.field4206 = var2.field4076;
        return var2;
    }

    public Iterator iterator() {
        return new class378(this);
    }
}

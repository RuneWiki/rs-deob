package deob;

import java.util.Iterator;

@ObfuscatedName("nz")
public final class class378 implements Iterable {

    @ObfuscatedName("nz.n")
    public int field4189;

    @ObfuscatedName("nz.c")
    public class369[] field4187;

    @ObfuscatedName("nz.m")
    public class369 field4188;

    @ObfuscatedName("nz.k")
    public class369 field4190;

    @ObfuscatedName("nz.o")
    public int field4186 = 0;

    public class378(int arg0) {
        this.field4189 = arg0;
        this.field4187 = new class369[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class369 var3 = this.field4187[var2] = new class369();
            var3.field4055 = var3;
            var3.field4057 = var3;
        }
    }

    @ObfuscatedName("nz.n(J)Lnr;")
    public class369 method5996(long arg0) {
        class369 var3 = this.field4187[(int) (arg0 & (long) (this.field4189 - 1))];
        for (this.field4188 = var3.field4055; this.field4188 != var3; this.field4188 = this.field4188.field4055) {
            if (this.field4188.field4056 == arg0) {
                class369 var4 = this.field4188;
                this.field4188 = this.field4188.field4055;
                return var4;
            }
        }
        this.field4188 = null;
        return null;
    }

    @ObfuscatedName("nz.c(Lnr;J)V")
    public void method5997(class369 arg0, long arg1) {
        if (arg0.field4057 != null) {
            arg0.method5732();
        }
        class369 var4 = this.field4187[(int) (arg1 & (long) (this.field4189 - 1))];
        arg0.field4057 = var4.field4057;
        arg0.field4055 = var4;
        arg0.field4057.field4055 = arg0;
        arg0.field4055.field4057 = arg0;
        arg0.field4056 = arg1;
    }

    @ObfuscatedName("nz.m()V")
    public void method6000() {
        for (int var1 = 0; var1 < this.field4189; var1++) {
            class369 var2 = this.field4187[var1];
            while (true) {
                class369 var3 = var2.field4055;
                if (var2 == var3) {
                    break;
                }
                var3.method5732();
            }
        }
        this.field4188 = null;
        this.field4190 = null;
    }

    @ObfuscatedName("nz.k()Lnr;")
    public class369 method6001() {
        this.field4186 = 0;
        return this.method5999();
    }

    @ObfuscatedName("nz.o()Lnr;")
    public class369 method5999() {
        if (this.field4186 > 0 && this.field4187[this.field4186 - 1] != this.field4190) {
            class369 var1 = this.field4190;
            this.field4190 = var1.field4055;
            return var1;
        }
        class369 var2;
        do {
            if (this.field4186 >= this.field4189) {
                return null;
            }
            var2 = this.field4187[this.field4186++].field4055;
        } while (this.field4187[this.field4186 - 1] == var2);
        this.field4190 = var2.field4055;
        return var2;
    }

    public Iterator iterator() {
        return new class377(this);
    }
}

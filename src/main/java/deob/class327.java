package deob;

import java.util.Iterator;

@ObfuscatedName("lg")
public final class class327 implements Iterable {

    @ObfuscatedName("lg.n")
    public int field3863;

    @ObfuscatedName("lg.v")
    public class190[] field3864;

    @ObfuscatedName("lg.d")
    public class190 field3865;

    @ObfuscatedName("lg.c")
    public class190 field3866;

    @ObfuscatedName("lg.y")
    public int field3867 = 0;

    public class327(int arg0) {
        this.field3863 = arg0;
        this.field3864 = new class190[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class190 var3 = this.field3864[var2] = new class190();
            var3.field2140 = var3;
            var3.field2139 = var3;
        }
    }

    @ObfuscatedName("lg.n(J)Lga;")
    public class190 method5648(long arg0) {
        class190 var3 = this.field3864[(int) (arg0 & (long) (this.field3863 - 1))];
        for (this.field3865 = var3.field2140; this.field3865 != var3; this.field3865 = this.field3865.field2140) {
            if (this.field3865.field2141 == arg0) {
                class190 var4 = this.field3865;
                this.field3865 = this.field3865.field2140;
                return var4;
            }
        }
        this.field3865 = null;
        return null;
    }

    @ObfuscatedName("lg.v(Lga;J)V")
    public void method5649(class190 arg0, long arg1) {
        if (arg0.field2139 != null) {
            arg0.method3486();
        }
        class190 var4 = this.field3864[(int) (arg1 & (long) (this.field3863 - 1))];
        arg0.field2139 = var4.field2139;
        arg0.field2140 = var4;
        arg0.field2139.field2140 = arg0;
        arg0.field2140.field2139 = arg0;
        arg0.field2141 = arg1;
    }

    @ObfuscatedName("lg.d()V")
    public void method5650() {
        for (int var1 = 0; var1 < this.field3863; var1++) {
            class190 var2 = this.field3864[var1];
            while (true) {
                class190 var3 = var2.field2140;
                if (var2 == var3) {
                    break;
                }
                var3.method3486();
            }
        }
        this.field3865 = null;
        this.field3866 = null;
    }

    @ObfuscatedName("lg.c()Lga;")
    public class190 method5651() {
        this.field3867 = 0;
        return this.method5655();
    }

    @ObfuscatedName("lg.y()Lga;")
    public class190 method5655() {
        if (this.field3867 > 0 && this.field3864[this.field3867 - 1] != this.field3866) {
            class190 var1 = this.field3866;
            this.field3866 = var1.field2140;
            return var1;
        }
        class190 var2;
        do {
            if (this.field3867 >= this.field3863) {
                return null;
            }
            var2 = this.field3864[this.field3867++].field2140;
        } while (this.field3864[this.field3867 - 1] == var2);
        this.field3866 = var2.field2140;
        return var2;
    }

    public Iterator iterator() {
        return new class328(this);
    }
}

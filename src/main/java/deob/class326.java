package deob;

import java.util.Iterator;

@ObfuscatedName("lq")
public final class class326 implements Iterable {

    @ObfuscatedName("lq.z")
    public int field3861;

    @ObfuscatedName("lq.k")
    public class190[] field3858;

    @ObfuscatedName("lq.s")
    public class190 field3857;

    @ObfuscatedName("lq.t")
    public class190 field3860;

    @ObfuscatedName("lq.i")
    public int field3859 = 0;

    public class326(int arg0) {
        this.field3861 = arg0;
        this.field3858 = new class190[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class190 var3 = this.field3858[var2] = new class190();
            var3.field2155 = var3;
            var3.field2156 = var3;
        }
    }

    @ObfuscatedName("lq.z(J)Lgw;")
    public class190 method5582(long arg0) {
        class190 var3 = this.field3858[(int) (arg0 & (long) (this.field3861 - 1))];
        for (this.field3857 = var3.field2155; this.field3857 != var3; this.field3857 = this.field3857.field2155) {
            if (this.field3857.field2157 == arg0) {
                class190 var4 = this.field3857;
                this.field3857 = this.field3857.field2155;
                return var4;
            }
        }
        this.field3857 = null;
        return null;
    }

    @ObfuscatedName("lq.k(Lgw;J)V")
    public void method5583(class190 arg0, long arg1) {
        if (arg0.field2156 != null) {
            arg0.method3401();
        }
        class190 var4 = this.field3858[(int) (arg1 & (long) (this.field3861 - 1))];
        arg0.field2156 = var4.field2156;
        arg0.field2155 = var4;
        arg0.field2156.field2155 = arg0;
        arg0.field2155.field2156 = arg0;
        arg0.field2157 = arg1;
    }

    @ObfuscatedName("lq.s()V")
    public void method5584() {
        for (int var1 = 0; var1 < this.field3861; var1++) {
            class190 var2 = this.field3858[var1];
            while (true) {
                class190 var3 = var2.field2155;
                if (var2 == var3) {
                    break;
                }
                var3.method3401();
            }
        }
        this.field3857 = null;
        this.field3860 = null;
    }

    @ObfuscatedName("lq.t()Lgw;")
    public class190 method5591() {
        this.field3859 = 0;
        return this.method5586();
    }

    @ObfuscatedName("lq.i()Lgw;")
    public class190 method5586() {
        if (this.field3859 > 0 && this.field3858[this.field3859 - 1] != this.field3860) {
            class190 var1 = this.field3860;
            this.field3860 = var1.field2155;
            return var1;
        }
        class190 var2;
        do {
            if (this.field3859 >= this.field3861) {
                return null;
            }
            var2 = this.field3858[this.field3859++].field2155;
        } while (this.field3858[this.field3859 - 1] == var2);
        this.field3860 = var2.field2155;
        return var2;
    }

    public Iterator iterator() {
        return new class327(this);
    }
}

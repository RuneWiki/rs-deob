package deob;

@ObfuscatedName("fm")
public final class class174 {

    @ObfuscatedName("fm.u")
    public int field2799;

    @ObfuscatedName("fm.k")
    public class178[] field2797;

    @ObfuscatedName("fm.x")
    public class178 field2798;

    @ObfuscatedName("fm.m")
    public class178 field2800;

    @ObfuscatedName("fm.n")
    public int field2796 = 0;

    public class174(int arg0) {
        this.field2799 = arg0;
        this.field2797 = new class178[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class178 var3 = this.field2797[var2] = new class178();
            var3.field2807 = var3;
            var3.field2806 = var3;
        }
    }

    @ObfuscatedName("fm.u(J)Lfv;")
    public class178 method3311(long arg0) {
        class178 var3 = this.field2797[(int) (arg0 & (long) (this.field2799 - 1))];
        for (this.field2798 = var3.field2807; this.field2798 != var3; this.field2798 = this.field2798.field2807) {
            if (this.field2798.field2808 == arg0) {
                class178 var4 = this.field2798;
                this.field2798 = this.field2798.field2807;
                return var4;
            }
        }
        this.field2798 = null;
        return null;
    }

    @ObfuscatedName("fm.k(Lfv;J)V")
    public void method3317(class178 arg0, long arg1) {
        if (arg0.field2806 != null) {
            arg0.method3357();
        }
        class178 var4 = this.field2797[(int) (arg1 & (long) (this.field2799 - 1))];
        arg0.field2806 = var4.field2806;
        arg0.field2807 = var4;
        arg0.field2806.field2807 = arg0;
        arg0.field2807.field2806 = arg0;
        arg0.field2808 = arg1;
    }

    @ObfuscatedName("fm.x()V")
    public void method3313() {
        for (int var1 = 0; var1 < this.field2799; var1++) {
            class178 var2 = this.field2797[var1];
            while (true) {
                class178 var3 = var2.field2807;
                if (var2 == var3) {
                    break;
                }
                var3.method3357();
            }
        }
        this.field2798 = null;
        this.field2800 = null;
    }

    @ObfuscatedName("fm.m()Lfv;")
    public class178 method3308() {
        this.field2796 = 0;
        return this.method3309();
    }

    @ObfuscatedName("fm.n()Lfv;")
    public class178 method3309() {
        if (this.field2796 > 0 && this.field2797[this.field2796 - 1] != this.field2800) {
            class178 var1 = this.field2800;
            this.field2800 = var1.field2807;
            return var1;
        }
        class178 var2;
        do {
            if (this.field2796 >= this.field2799) {
                return null;
            }
            var2 = this.field2797[this.field2796++].field2807;
        } while (this.field2797[this.field2796 - 1] == var2);
        this.field2800 = var2.field2807;
        return var2;
    }
}

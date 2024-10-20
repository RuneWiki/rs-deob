package deob;

@ObfuscatedName("fq")
public final class class173 {

    @ObfuscatedName("fq.j")
    public int field2749;

    @ObfuscatedName("fq.y")
    public class177[] field2751;

    @ObfuscatedName("fq.x")
    public class177 field2750;

    @ObfuscatedName("fq.z")
    public class177 field2748;

    @ObfuscatedName("fq.c")
    public int field2752 = 0;

    public class173(int arg0) {
        this.field2749 = arg0;
        this.field2751 = new class177[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class177 var3 = this.field2751[var2] = new class177();
            var3.field2759 = var3;
            var3.field2760 = var3;
        }
    }

    @ObfuscatedName("fq.j(J)Lfa;")
    public class177 method3222(long arg0) {
        class177 var3 = this.field2751[(int) (arg0 & (long) (this.field2749 - 1))];
        for (this.field2750 = var3.field2759; this.field2750 != var3; this.field2750 = this.field2750.field2759) {
            if (this.field2750.field2758 == arg0) {
                class177 var4 = this.field2750;
                this.field2750 = this.field2750.field2759;
                return var4;
            }
        }
        this.field2750 = null;
        return null;
    }

    @ObfuscatedName("fq.y(Lfa;J)V")
    public void method3223(class177 arg0, long arg1) {
        if (arg0.field2760 != null) {
            arg0.method3289();
        }
        class177 var4 = this.field2751[(int) (arg1 & (long) (this.field2749 - 1))];
        arg0.field2760 = var4.field2760;
        arg0.field2759 = var4;
        arg0.field2760.field2759 = arg0;
        arg0.field2759.field2760 = arg0;
        arg0.field2758 = arg1;
    }

    @ObfuscatedName("fq.x()V")
    public void method3224() {
        for (int var1 = 0; var1 < this.field2749; var1++) {
            class177 var2 = this.field2751[var1];
            while (true) {
                class177 var3 = var2.field2759;
                if (var2 == var3) {
                    break;
                }
                var3.method3289();
            }
        }
        this.field2750 = null;
        this.field2748 = null;
    }

    @ObfuscatedName("fq.z()Lfa;")
    public class177 method3225() {
        this.field2752 = 0;
        return this.method3230();
    }

    @ObfuscatedName("fq.c()Lfa;")
    public class177 method3230() {
        if (this.field2752 > 0 && this.field2751[this.field2752 - 1] != this.field2748) {
            class177 var1 = this.field2748;
            this.field2748 = var1.field2759;
            return var1;
        }
        class177 var2;
        do {
            if (this.field2752 >= this.field2749) {
                return null;
            }
            var2 = this.field2751[this.field2752++].field2759;
        } while (this.field2751[this.field2752 - 1] == var2);
        this.field2748 = var2.field2759;
        return var2;
    }
}

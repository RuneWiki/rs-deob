package deob;

@ObfuscatedName("qg")
public final class class451 {

    @ObfuscatedName("qg.f")
    public int field4848;

    @ObfuscatedName("qg.w")
    public class440[] field4845;

    @ObfuscatedName("qg.v")
    public class440 field4846;

    @ObfuscatedName("qg.s")
    public class440 field4847;

    @ObfuscatedName("qg.z")
    public int field4844 = 0;

    public class451(int arg0) {
        this.field4848 = arg0;
        this.field4845 = new class440[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class440 var3 = this.field4845[var2] = new class440();
            var3.field4710 = var3;
            var3.field4709 = var3;
        }
    }

    @ObfuscatedName("qg.f(J)Lpr;")
    public class440 method7706(long arg0) {
        class440 var3 = this.field4845[(int) (arg0 & (long) (this.field4848 - 1))];
        for (this.field4846 = var3.field4710; this.field4846 != var3; this.field4846 = this.field4846.field4710) {
            if (this.field4846.field4711 == arg0) {
                class440 var4 = this.field4846;
                this.field4846 = this.field4846.field4710;
                return var4;
            }
        }
        this.field4846 = null;
        return null;
    }

    @ObfuscatedName("qg.w(Lpr;J)V")
    public void method7716(class440 arg0, long arg1) {
        if (arg0.field4709 != null) {
            arg0.method7431();
        }
        class440 var4 = this.field4845[(int) (arg1 & (long) (this.field4848 - 1))];
        arg0.field4709 = var4.field4709;
        arg0.field4710 = var4;
        arg0.field4709.field4710 = arg0;
        arg0.field4710.field4709 = arg0;
        arg0.field4711 = arg1;
    }

    @ObfuscatedName("qg.v()Lpr;")
    public class440 method7708() {
        this.field4844 = 0;
        return this.method7709();
    }

    @ObfuscatedName("qg.s()Lpr;")
    public class440 method7709() {
        if (this.field4844 > 0 && this.field4845[this.field4844 - 1] != this.field4847) {
            class440 var1 = this.field4847;
            this.field4847 = var1.field4710;
            return var1;
        }
        class440 var2;
        do {
            if (this.field4844 >= this.field4848) {
                return null;
            }
            var2 = this.field4845[this.field4844++].field4710;
        } while (this.field4845[this.field4844 - 1] == var2);
        this.field4847 = var2.field4710;
        return var2;
    }
}

package deob;

@ObfuscatedName("ld")
public final class class319 {

    @ObfuscatedName("ld.m")
    public int field3852;

    @ObfuscatedName("ld.f")
    public class186[] field3849;

    @ObfuscatedName("ld.q")
    public class186 field3848;

    @ObfuscatedName("ld.w")
    public class186 field3851;

    @ObfuscatedName("ld.o")
    public int field3850 = 0;

    public class319(int arg0) {
        this.field3852 = arg0;
        this.field3849 = new class186[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class186 var3 = this.field3849[var2] = new class186();
            var3.field2140 = var3;
            var3.field2141 = var3;
        }
    }

    @ObfuscatedName("ld.m(J)Lgw;")
    public class186 method5416(long arg0) {
        class186 var3 = this.field3849[(int) (arg0 & (long) (this.field3852 - 1))];
        for (this.field3848 = var3.field2140; this.field3848 != var3; this.field3848 = this.field3848.field2140) {
            if (this.field3848.field2139 == arg0) {
                class186 var4 = this.field3848;
                this.field3848 = this.field3848.field2140;
                return var4;
            }
        }
        this.field3848 = null;
        return null;
    }

    @ObfuscatedName("ld.f(Lgw;J)V")
    public void method5412(class186 arg0, long arg1) {
        if (arg0.field2141 != null) {
            arg0.method3306();
        }
        class186 var4 = this.field3849[(int) (arg1 & (long) (this.field3852 - 1))];
        arg0.field2141 = var4.field2141;
        arg0.field2140 = var4;
        arg0.field2141.field2140 = arg0;
        arg0.field2140.field2141 = arg0;
        arg0.field2139 = arg1;
    }

    @ObfuscatedName("ld.q()V")
    public void method5413() {
        for (int var1 = 0; var1 < this.field3852; var1++) {
            class186 var2 = this.field3849[var1];
            while (true) {
                class186 var3 = var2.field2140;
                if (var2 == var3) {
                    break;
                }
                var3.method3306();
            }
        }
        this.field3848 = null;
        this.field3851 = null;
    }

    @ObfuscatedName("ld.w()Lgw;")
    public class186 method5411() {
        this.field3850 = 0;
        return this.method5415();
    }

    @ObfuscatedName("ld.o()Lgw;")
    public class186 method5415() {
        if (this.field3850 > 0 && this.field3849[this.field3850 - 1] != this.field3851) {
            class186 var1 = this.field3851;
            this.field3851 = var1.field2140;
            return var1;
        }
        class186 var2;
        do {
            if (this.field3850 >= this.field3852) {
                return null;
            }
            var2 = this.field3849[this.field3850++].field2140;
        } while (this.field3849[this.field3850 - 1] == var2);
        this.field3851 = var2.field2140;
        return var2;
    }
}

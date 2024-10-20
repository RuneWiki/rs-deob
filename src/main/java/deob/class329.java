package deob;

@ObfuscatedName("lp")
public final class class329 {

    @ObfuscatedName("lp.f")
    public int field3874;

    @ObfuscatedName("lp.b")
    public class190[] field3873;

    @ObfuscatedName("lp.l")
    public class190 field3876;

    @ObfuscatedName("lp.m")
    public class190 field3875;

    @ObfuscatedName("lp.z")
    public int field3872 = 0;

    public class329(int arg0) {
        this.field3874 = arg0;
        this.field3873 = new class190[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class190 var3 = this.field3873[var2] = new class190();
            var3.field2141 = var3;
            var3.field2142 = var3;
        }
    }

    @ObfuscatedName("lp.f(J)Lgn;")
    public class190 method5597(long arg0) {
        class190 var3 = this.field3873[(int) (arg0 & (long) (this.field3874 - 1))];
        for (this.field3876 = var3.field2141; this.field3876 != var3; this.field3876 = this.field3876.field2141) {
            if (this.field3876.field2140 == arg0) {
                class190 var4 = this.field3876;
                this.field3876 = this.field3876.field2141;
                return var4;
            }
        }
        this.field3876 = null;
        return null;
    }

    @ObfuscatedName("lp.b(Lgn;J)V")
    public void method5596(class190 arg0, long arg1) {
        if (arg0.field2142 != null) {
            arg0.method3407();
        }
        class190 var4 = this.field3873[(int) (arg1 & (long) (this.field3874 - 1))];
        arg0.field2142 = var4.field2142;
        arg0.field2141 = var4;
        arg0.field2142.field2141 = arg0;
        arg0.field2141.field2142 = arg0;
        arg0.field2140 = arg1;
    }

    @ObfuscatedName("lp.l()Lgn;")
    public class190 method5601() {
        this.field3872 = 0;
        return this.method5598();
    }

    @ObfuscatedName("lp.m()Lgn;")
    public class190 method5598() {
        if (this.field3872 > 0 && this.field3873[this.field3872 - 1] != this.field3875) {
            class190 var1 = this.field3875;
            this.field3875 = var1.field2141;
            return var1;
        }
        class190 var2;
        do {
            if (this.field3872 >= this.field3874) {
                return null;
            }
            var2 = this.field3873[this.field3872++].field2141;
        } while (this.field3873[this.field3872 - 1] == var2);
        this.field3875 = var2.field2141;
        return var2;
    }
}

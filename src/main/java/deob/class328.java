package deob;

@ObfuscatedName("le")
public final class class328 {

    @ObfuscatedName("le.m")
    public int field3861;

    @ObfuscatedName("le.o")
    public class190[] field3860;

    @ObfuscatedName("le.q")
    public class190 field3859;

    @ObfuscatedName("le.j")
    public class190 field3862;

    @ObfuscatedName("le.p")
    public int field3863 = 0;

    public class328(int arg0) {
        this.field3861 = arg0;
        this.field3860 = new class190[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class190 var3 = this.field3860[var2] = new class190();
            var3.field2153 = var3;
            var3.field2151 = var3;
        }
    }

    @ObfuscatedName("le.m(J)Lgr;")
    public class190 method5641(long arg0) {
        class190 var3 = this.field3860[(int) (arg0 & (long) (this.field3861 - 1))];
        for (this.field3859 = var3.field2153; this.field3859 != var3; this.field3859 = this.field3859.field2153) {
            if (this.field3859.field2152 == arg0) {
                class190 var4 = this.field3859;
                this.field3859 = this.field3859.field2153;
                return var4;
            }
        }
        this.field3859 = null;
        return null;
    }

    @ObfuscatedName("le.o(Lgr;J)V")
    public void method5643(class190 arg0, long arg1) {
        if (arg0.field2151 != null) {
            arg0.method3388();
        }
        class190 var4 = this.field3860[(int) (arg1 & (long) (this.field3861 - 1))];
        arg0.field2151 = var4.field2151;
        arg0.field2153 = var4;
        arg0.field2151.field2153 = arg0;
        arg0.field2153.field2151 = arg0;
        arg0.field2152 = arg1;
    }

    @ObfuscatedName("le.q()Lgr;")
    public class190 method5644() {
        this.field3863 = 0;
        return this.method5642();
    }

    @ObfuscatedName("le.j()Lgr;")
    public class190 method5642() {
        if (this.field3863 > 0 && this.field3860[this.field3863 - 1] != this.field3862) {
            class190 var1 = this.field3862;
            this.field3862 = var1.field2153;
            return var1;
        }
        class190 var2;
        do {
            if (this.field3863 >= this.field3861) {
                return null;
            }
            var2 = this.field3860[this.field3863++].field2153;
        } while (this.field3860[this.field3863 - 1] == var2);
        this.field3862 = var2.field2153;
        return var2;
    }
}

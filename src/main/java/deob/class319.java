package deob;

@ObfuscatedName("lc")
public final class class319 {

    @ObfuscatedName("lc.q")
    public int field3862;

    @ObfuscatedName("lc.w")
    public class181[] field3859;

    @ObfuscatedName("lc.e")
    public class181 field3861;

    @ObfuscatedName("lc.p")
    public class181 field3863;

    @ObfuscatedName("lc.k")
    public int field3860 = 0;

    public class319(int arg0) {
        this.field3862 = arg0;
        this.field3859 = new class181[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class181 var3 = this.field3859[var2] = new class181();
            var3.field2115 = var3;
            var3.field2113 = var3;
        }
    }

    @ObfuscatedName("lc.q(J)Lfw;")
    public class181 method5479(long arg0) {
        class181 var3 = this.field3859[(int) (arg0 & (long) (this.field3862 - 1))];
        for (this.field3861 = var3.field2115; this.field3861 != var3; this.field3861 = this.field3861.field2115) {
            if (this.field3861.field2114 == arg0) {
                class181 var4 = this.field3861;
                this.field3861 = this.field3861.field2115;
                return var4;
            }
        }
        this.field3861 = null;
        return null;
    }

    @ObfuscatedName("lc.w(Lfw;J)V")
    public void method5478(class181 arg0, long arg1) {
        if (arg0.field2113 != null) {
            arg0.method3286();
        }
        class181 var4 = this.field3859[(int) (arg1 & (long) (this.field3862 - 1))];
        arg0.field2113 = var4.field2113;
        arg0.field2115 = var4;
        arg0.field2113.field2115 = arg0;
        arg0.field2115.field2113 = arg0;
        arg0.field2114 = arg1;
    }

    @ObfuscatedName("lc.e()Lfw;")
    public class181 method5477() {
        this.field3860 = 0;
        return this.method5480();
    }

    @ObfuscatedName("lc.p()Lfw;")
    public class181 method5480() {
        if (this.field3860 > 0 && this.field3859[this.field3860 - 1] != this.field3863) {
            class181 var1 = this.field3863;
            this.field3863 = var1.field2115;
            return var1;
        }
        class181 var2;
        do {
            if (this.field3860 >= this.field3862) {
                return null;
            }
            var2 = this.field3859[this.field3860++].field2115;
        } while (this.field3859[this.field3860 - 1] == var2);
        this.field3863 = var2.field2115;
        return var2;
    }
}

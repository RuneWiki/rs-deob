package deob;

@ObfuscatedName("lq")
public final class class329 {

    @ObfuscatedName("lq.n")
    public int field3874;

    @ObfuscatedName("lq.v")
    public class190[] field3875;

    @ObfuscatedName("lq.d")
    public class190 field3873;

    @ObfuscatedName("lq.c")
    public class190 field3872;

    @ObfuscatedName("lq.y")
    public int field3876 = 0;

    public class329(int arg0) {
        this.field3874 = arg0;
        this.field3875 = new class190[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class190 var3 = this.field3875[var2] = new class190();
            var3.field2140 = var3;
            var3.field2139 = var3;
        }
    }

    @ObfuscatedName("lq.n(J)Lga;")
    public class190 method5682(long arg0) {
        class190 var3 = this.field3875[(int) (arg0 & (long) (this.field3874 - 1))];
        for (this.field3873 = var3.field2140; this.field3873 != var3; this.field3873 = this.field3873.field2140) {
            if (this.field3873.field2141 == arg0) {
                class190 var4 = this.field3873;
                this.field3873 = this.field3873.field2140;
                return var4;
            }
        }
        this.field3873 = null;
        return null;
    }

    @ObfuscatedName("lq.v(Lga;J)V")
    public void method5683(class190 arg0, long arg1) {
        if (arg0.field2139 != null) {
            arg0.method3486();
        }
        class190 var4 = this.field3875[(int) (arg1 & (long) (this.field3874 - 1))];
        arg0.field2139 = var4.field2139;
        arg0.field2140 = var4;
        arg0.field2139.field2140 = arg0;
        arg0.field2140.field2139 = arg0;
        arg0.field2141 = arg1;
    }

    @ObfuscatedName("lq.d()Lga;")
    public class190 method5684() {
        this.field3876 = 0;
        return this.method5685();
    }

    @ObfuscatedName("lq.c()Lga;")
    public class190 method5685() {
        if (this.field3876 > 0 && this.field3875[this.field3876 - 1] != this.field3872) {
            class190 var1 = this.field3872;
            this.field3872 = var1.field2140;
            return var1;
        }
        class190 var2;
        do {
            if (this.field3876 >= this.field3874) {
                return null;
            }
            var2 = this.field3875[this.field3876++].field2140;
        } while (this.field3875[this.field3876 - 1] == var2);
        this.field3872 = var2.field2140;
        return var2;
    }
}

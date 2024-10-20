package deob;

@ObfuscatedName("mg")
public final class class361 {

    @ObfuscatedName("mg.f")
    public int field4078;

    @ObfuscatedName("mg.o")
    public class351[] field4075;

    @ObfuscatedName("mg.u")
    public class351 field4077;

    @ObfuscatedName("mg.p")
    public class351 field4076;

    @ObfuscatedName("mg.b")
    public int field4079 = 0;

    public class361(int arg0) {
        this.field4078 = arg0;
        this.field4075 = new class351[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class351 var3 = this.field4075[var2] = new class351();
            var3.field3942 = var3;
            var3.field3943 = var3;
        }
    }

    @ObfuscatedName("mg.f(J)Lmh;")
    public class351 method5638(long arg0) {
        class351 var3 = this.field4075[(int) (arg0 & (long) (this.field4078 - 1))];
        for (this.field4077 = var3.field3942; this.field4077 != var3; this.field4077 = this.field4077.field3942) {
            if (this.field4077.field3941 == arg0) {
                class351 var4 = this.field4077;
                this.field4077 = this.field4077.field3942;
                return var4;
            }
        }
        this.field4077 = null;
        return null;
    }

    @ObfuscatedName("mg.o(Lmh;J)V")
    public void method5640(class351 arg0, long arg1) {
        if (arg0.field3943 != null) {
            arg0.method5354();
        }
        class351 var4 = this.field4075[(int) (arg1 & (long) (this.field4078 - 1))];
        arg0.field3943 = var4.field3943;
        arg0.field3942 = var4;
        arg0.field3943.field3942 = arg0;
        arg0.field3942.field3943 = arg0;
        arg0.field3941 = arg1;
    }

    @ObfuscatedName("mg.u()Lmh;")
    public class351 method5641() {
        this.field4079 = 0;
        return this.method5643();
    }

    @ObfuscatedName("mg.p()Lmh;")
    public class351 method5643() {
        if (this.field4079 > 0 && this.field4075[this.field4079 - 1] != this.field4076) {
            class351 var1 = this.field4076;
            this.field4076 = var1.field3942;
            return var1;
        }
        class351 var2;
        do {
            if (this.field4079 >= this.field4078) {
                return null;
            }
            var2 = this.field4075[this.field4079++].field3942;
        } while (this.field4075[this.field4079 - 1] == var2);
        this.field4076 = var2.field3942;
        return var2;
    }
}

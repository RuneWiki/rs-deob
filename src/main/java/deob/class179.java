package deob;

@ObfuscatedName("fx")
public final class class179 {

    @ObfuscatedName("fx.v")
    public int field2887;

    @ObfuscatedName("fx.t")
    public class191[] field2886;

    @ObfuscatedName("fx.f")
    public class191 field2888;

    @ObfuscatedName("fx.j")
    public class191 field2889;

    @ObfuscatedName("fx.l")
    public int field2890 = 0;

    public class179(int arg0) {
        this.field2887 = arg0;
        this.field2886 = new class191[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class191 var3 = this.field2886[var2] = new class191();
            var3.field2912 = var3;
            var3.field2913 = var3;
        }
    }

    @ObfuscatedName("fx.v(J)Lgu;")
    public class191 method3274(long arg0) {
        class191 var3 = this.field2886[(int) (arg0 & (long) (this.field2887 - 1))];
        for (this.field2888 = var3.field2912; this.field2888 != var3; this.field2888 = this.field2888.field2912) {
            if (this.field2888.field2911 == arg0) {
                class191 var4 = this.field2888;
                this.field2888 = this.field2888.field2912;
                return var4;
            }
        }
        this.field2888 = null;
        return null;
    }

    @ObfuscatedName("fx.t(Lgu;J)V")
    public void method3282(class191 arg0, long arg1) {
        if (arg0.field2913 != null) {
            arg0.method3392();
        }
        class191 var4 = this.field2886[(int) (arg1 & (long) (this.field2887 - 1))];
        arg0.field2913 = var4.field2913;
        arg0.field2912 = var4;
        arg0.field2913.field2912 = arg0;
        arg0.field2912.field2913 = arg0;
        arg0.field2911 = arg1;
    }

    @ObfuscatedName("fx.f()V")
    public void method3268() {
        for (int var1 = 0; var1 < this.field2887; var1++) {
            class191 var2 = this.field2886[var1];
            while (true) {
                class191 var3 = var2.field2912;
                if (var2 == var3) {
                    break;
                }
                var3.method3392();
            }
        }
        this.field2888 = null;
        this.field2889 = null;
    }

    @ObfuscatedName("fx.j()Lgu;")
    public class191 method3269() {
        this.field2890 = 0;
        return this.method3270();
    }

    @ObfuscatedName("fx.l()Lgu;")
    public class191 method3270() {
        if (this.field2890 > 0 && this.field2886[this.field2890 - 1] != this.field2889) {
            class191 var1 = this.field2889;
            this.field2889 = var1.field2912;
            return var1;
        }
        class191 var2;
        do {
            if (this.field2890 >= this.field2887) {
                return null;
            }
            var2 = this.field2886[this.field2890++].field2912;
        } while (this.field2886[this.field2890 - 1] == var2);
        this.field2889 = var2.field2912;
        return var2;
    }
}

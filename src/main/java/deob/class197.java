package deob;

@ObfuscatedName("gs")
public final class class197 {

    @ObfuscatedName("gs.b")
    public int field3092;

    @ObfuscatedName("gs.g")
    public class209[] field3090;

    @ObfuscatedName("gs.j")
    public class209 field3089;

    @ObfuscatedName("gs.d")
    public class209 field3091;

    @ObfuscatedName("gs.x")
    public int field3093 = 0;

    public class197(int arg0) {
        this.field3092 = arg0;
        this.field3090 = new class209[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class209 var3 = this.field3090[var2] = new class209();
            var3.field3115 = var3;
            var3.field3116 = var3;
        }
    }

    @ObfuscatedName("gs.b(J)Lhk;")
    public class209 method3538(long arg0) {
        class209 var3 = this.field3090[(int) (arg0 & (long) (this.field3092 - 1))];
        for (this.field3089 = var3.field3115; this.field3089 != var3; this.field3089 = this.field3089.field3115) {
            if (this.field3089.field3114 == arg0) {
                class209 var4 = this.field3089;
                this.field3089 = this.field3089.field3115;
                return var4;
            }
        }
        this.field3089 = null;
        return null;
    }

    @ObfuscatedName("gs.g(Lhk;J)V")
    public void method3528(class209 arg0, long arg1) {
        if (arg0.field3116 != null) {
            arg0.method3647();
        }
        class209 var4 = this.field3090[(int) (arg1 & (long) (this.field3092 - 1))];
        arg0.field3116 = var4.field3116;
        arg0.field3115 = var4;
        arg0.field3116.field3115 = arg0;
        arg0.field3115.field3116 = arg0;
        arg0.field3114 = arg1;
    }

    @ObfuscatedName("gs.j()V")
    public void method3529() {
        for (int var1 = 0; var1 < this.field3092; var1++) {
            class209 var2 = this.field3090[var1];
            while (true) {
                class209 var3 = var2.field3115;
                if (var2 == var3) {
                    break;
                }
                var3.method3647();
            }
        }
        this.field3089 = null;
        this.field3091 = null;
    }

    @ObfuscatedName("gs.d()Lhk;")
    public class209 method3530() {
        this.field3093 = 0;
        return this.method3531();
    }

    @ObfuscatedName("gs.x()Lhk;")
    public class209 method3531() {
        if (this.field3093 > 0 && this.field3090[this.field3093 - 1] != this.field3091) {
            class209 var1 = this.field3091;
            this.field3091 = var1.field3115;
            return var1;
        }
        class209 var2;
        do {
            if (this.field3093 >= this.field3092) {
                return null;
            }
            var2 = this.field3090[this.field3093++].field3115;
        } while (this.field3090[this.field3093 - 1] == var2);
        this.field3091 = var2.field3115;
        return var2;
    }
}

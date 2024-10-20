package deob;

@ObfuscatedName("gi")
public final class class197 {

    @ObfuscatedName("gi.e")
    public int field3091;

    @ObfuscatedName("gi.w")
    public class209[] field3090;

    @ObfuscatedName("gi.f")
    public class209 field3092;

    @ObfuscatedName("gi.s")
    public class209 field3093;

    @ObfuscatedName("gi.p")
    public int field3094 = 0;

    public class197(int arg0) {
        this.field3091 = arg0;
        this.field3090 = new class209[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class209 var3 = this.field3090[var2] = new class209();
            var3.field3115 = var3;
            var3.field3117 = var3;
        }
    }

    @ObfuscatedName("gi.e(J)Lhd;")
    public class209 method3507(long arg0) {
        class209 var3 = this.field3090[(int) (arg0 & (long) (this.field3091 - 1))];
        for (this.field3092 = var3.field3115; this.field3092 != var3; this.field3092 = this.field3092.field3115) {
            if (this.field3092.field3116 == arg0) {
                class209 var4 = this.field3092;
                this.field3092 = this.field3092.field3115;
                return var4;
            }
        }
        this.field3092 = null;
        return null;
    }

    @ObfuscatedName("gi.w(Lhd;J)V")
    public void method3508(class209 arg0, long arg1) {
        if (arg0.field3117 != null) {
            arg0.method3632();
        }
        class209 var4 = this.field3090[(int) (arg1 & (long) (this.field3091 - 1))];
        arg0.field3117 = var4.field3117;
        arg0.field3115 = var4;
        arg0.field3117.field3115 = arg0;
        arg0.field3115.field3117 = arg0;
        arg0.field3116 = arg1;
    }

    @ObfuscatedName("gi.f()V")
    public void method3509() {
        for (int var1 = 0; var1 < this.field3091; var1++) {
            class209 var2 = this.field3090[var1];
            while (true) {
                class209 var3 = var2.field3115;
                if (var2 == var3) {
                    break;
                }
                var3.method3632();
            }
        }
        this.field3092 = null;
        this.field3093 = null;
    }

    @ObfuscatedName("gi.s()Lhd;")
    public class209 method3513() {
        this.field3094 = 0;
        return this.method3510();
    }

    @ObfuscatedName("gi.p()Lhd;")
    public class209 method3510() {
        if (this.field3094 > 0 && this.field3090[this.field3094 - 1] != this.field3093) {
            class209 var1 = this.field3093;
            this.field3093 = var1.field3115;
            return var1;
        }
        class209 var2;
        do {
            if (this.field3094 >= this.field3091) {
                return null;
            }
            var2 = this.field3090[this.field3094++].field3115;
        } while (this.field3090[this.field3094 - 1] == var2);
        this.field3093 = var2.field3115;
        return var2;
    }
}

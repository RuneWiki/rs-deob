package deob;

@ObfuscatedName("gg")
public final class class197 {

    @ObfuscatedName("gg.f")
    public int field3095;

    @ObfuscatedName("gg.u")
    public class209[] field3092;

    @ObfuscatedName("gg.x")
    public class209 field3091;

    @ObfuscatedName("gg.b")
    public class209 field3093;

    @ObfuscatedName("gg.l")
    public int field3094 = 0;

    public class197(int arg0) {
        this.field3095 = arg0;
        this.field3092 = new class209[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class209 var3 = this.field3092[var2] = new class209();
            var3.field3117 = var3;
            var3.field3118 = var3;
        }
    }

    @ObfuscatedName("gg.f(J)Lhf;")
    public class209 method3555(long arg0) {
        class209 var3 = this.field3092[(int) (arg0 & (long) (this.field3095 - 1))];
        for (this.field3091 = var3.field3117; this.field3091 != var3; this.field3091 = this.field3091.field3117) {
            if (this.field3091.field3116 == arg0) {
                class209 var4 = this.field3091;
                this.field3091 = this.field3091.field3117;
                return var4;
            }
        }
        this.field3091 = null;
        return null;
    }

    @ObfuscatedName("gg.u(Lhf;J)V")
    public void method3559(class209 arg0, long arg1) {
        if (arg0.field3118 != null) {
            arg0.method3679();
        }
        class209 var4 = this.field3092[(int) (arg1 & (long) (this.field3095 - 1))];
        arg0.field3118 = var4.field3118;
        arg0.field3117 = var4;
        arg0.field3118.field3117 = arg0;
        arg0.field3117.field3118 = arg0;
        arg0.field3116 = arg1;
    }

    @ObfuscatedName("gg.x()V")
    public void method3557() {
        for (int var1 = 0; var1 < this.field3095; var1++) {
            class209 var2 = this.field3092[var1];
            while (true) {
                class209 var3 = var2.field3117;
                if (var2 == var3) {
                    break;
                }
                var3.method3679();
            }
        }
        this.field3091 = null;
        this.field3093 = null;
    }

    @ObfuscatedName("gg.b()Lhf;")
    public class209 method3558() {
        this.field3094 = 0;
        return this.method3556();
    }

    @ObfuscatedName("gg.l()Lhf;")
    public class209 method3556() {
        if (this.field3094 > 0 && this.field3092[this.field3094 - 1] != this.field3093) {
            class209 var1 = this.field3093;
            this.field3093 = var1.field3117;
            return var1;
        }
        class209 var2;
        do {
            if (this.field3094 >= this.field3095) {
                return null;
            }
            var2 = this.field3092[this.field3094++].field3117;
        } while (this.field3092[this.field3094 - 1] == var2);
        this.field3093 = var2.field3117;
        return var2;
    }
}

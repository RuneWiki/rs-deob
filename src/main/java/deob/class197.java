package deob;

@ObfuscatedName("gr")
public final class class197 {

    @ObfuscatedName("gr.s")
    public int field3103;

    @ObfuscatedName("gr.j")
    public class209[] field3101;

    @ObfuscatedName("gr.p")
    public class209 field3100;

    @ObfuscatedName("gr.x")
    public class209 field3102;

    @ObfuscatedName("gr.d")
    public int field3104 = 0;

    public class197(int arg0) {
        this.field3103 = arg0;
        this.field3101 = new class209[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class209 var3 = this.field3101[var2] = new class209();
            var3.field3125 = var3;
            var3.field3127 = var3;
        }
    }

    @ObfuscatedName("gr.s(J)Lhd;")
    public class209 method3518(long arg0) {
        class209 var3 = this.field3101[(int) (arg0 & (long) (this.field3103 - 1))];
        for (this.field3100 = var3.field3125; this.field3100 != var3; this.field3100 = this.field3100.field3125) {
            if (this.field3100.field3126 == arg0) {
                class209 var4 = this.field3100;
                this.field3100 = this.field3100.field3125;
                return var4;
            }
        }
        this.field3100 = null;
        return null;
    }

    @ObfuscatedName("gr.j(Lhd;J)V")
    public void method3519(class209 arg0, long arg1) {
        if (arg0.field3127 != null) {
            arg0.method3639();
        }
        class209 var4 = this.field3101[(int) (arg1 & (long) (this.field3103 - 1))];
        arg0.field3127 = var4.field3127;
        arg0.field3125 = var4;
        arg0.field3127.field3125 = arg0;
        arg0.field3125.field3127 = arg0;
        arg0.field3126 = arg1;
    }

    @ObfuscatedName("gr.p()V")
    public void method3520() {
        for (int var1 = 0; var1 < this.field3103; var1++) {
            class209 var2 = this.field3101[var1];
            while (true) {
                class209 var3 = var2.field3125;
                if (var2 == var3) {
                    break;
                }
                var3.method3639();
            }
        }
        this.field3100 = null;
        this.field3102 = null;
    }

    @ObfuscatedName("gr.x()Lhd;")
    public class209 method3521() {
        this.field3104 = 0;
        return this.method3522();
    }

    @ObfuscatedName("gr.d()Lhd;")
    public class209 method3522() {
        if (this.field3104 > 0 && this.field3101[this.field3104 - 1] != this.field3102) {
            class209 var1 = this.field3102;
            this.field3102 = var1.field3125;
            return var1;
        }
        class209 var2;
        do {
            if (this.field3104 >= this.field3103) {
                return null;
            }
            var2 = this.field3101[this.field3104++].field3125;
        } while (this.field3101[this.field3104 - 1] == var2);
        this.field3102 = var2.field3125;
        return var2;
    }
}

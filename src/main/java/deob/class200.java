package deob;

@ObfuscatedName("ge")
public final class class200 {

    @ObfuscatedName("ge.e")
    public int field3138;

    @ObfuscatedName("ge.l")
    public class212[] field3137;

    @ObfuscatedName("ge.c")
    public class212 field3139;

    @ObfuscatedName("ge.h")
    public class212 field3136;

    @ObfuscatedName("ge.r")
    public int field3140 = 0;

    public class200(int arg0) {
        this.field3138 = arg0;
        this.field3137 = new class212[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class212 var3 = this.field3137[var2] = new class212();
            var3.field3163 = var3;
            var3.field3164 = var3;
        }
    }

    @ObfuscatedName("ge.e(J)Lhs;")
    public class212 method3619(long arg0) {
        class212 var3 = this.field3137[(int) (arg0 & (long) (this.field3138 - 1))];
        for (this.field3139 = var3.field3163; this.field3139 != var3; this.field3139 = this.field3139.field3163) {
            if (this.field3139.field3162 == arg0) {
                class212 var4 = this.field3139;
                this.field3139 = this.field3139.field3163;
                return var4;
            }
        }
        this.field3139 = null;
        return null;
    }

    @ObfuscatedName("ge.l(Lhs;J)V")
    public void method3620(class212 arg0, long arg1) {
        if (arg0.field3164 != null) {
            arg0.method3755();
        }
        class212 var4 = this.field3137[(int) (arg1 & (long) (this.field3138 - 1))];
        arg0.field3164 = var4.field3164;
        arg0.field3163 = var4;
        arg0.field3164.field3163 = arg0;
        arg0.field3163.field3164 = arg0;
        arg0.field3162 = arg1;
    }

    @ObfuscatedName("ge.c()V")
    public void method3632() {
        for (int var1 = 0; var1 < this.field3138; var1++) {
            class212 var2 = this.field3137[var1];
            while (true) {
                class212 var3 = var2.field3163;
                if (var2 == var3) {
                    break;
                }
                var3.method3755();
            }
        }
        this.field3139 = null;
        this.field3136 = null;
    }

    @ObfuscatedName("ge.h()Lhs;")
    public class212 method3622() {
        this.field3140 = 0;
        return this.method3623();
    }

    @ObfuscatedName("ge.r()Lhs;")
    public class212 method3623() {
        if (this.field3140 > 0 && this.field3137[this.field3140 - 1] != this.field3136) {
            class212 var1 = this.field3136;
            this.field3136 = var1.field3163;
            return var1;
        }
        class212 var2;
        do {
            if (this.field3140 >= this.field3138) {
                return null;
            }
            var2 = this.field3137[this.field3140++].field3163;
        } while (this.field3137[this.field3140 - 1] == var2);
        this.field3136 = var2.field3163;
        return var2;
    }
}

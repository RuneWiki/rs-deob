package deob;

@ObfuscatedName("gx")
public final class class191 {

    @ObfuscatedName("gx.d")
    public int field2436;

    @ObfuscatedName("gx.q")
    public class193[] field2433;

    @ObfuscatedName("gx.x")
    public class193 field2434;

    @ObfuscatedName("gx.y")
    public class193 field2435;

    @ObfuscatedName("gx.e")
    public int field2432 = 0;

    public class191(int arg0) {
        this.field2436 = arg0;
        this.field2433 = new class193[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class193 var3 = this.field2433[var2] = new class193();
            var3.field2440 = var3;
            var3.field2439 = var3;
        }
    }

    @ObfuscatedName("gx.d(J)Lgm;")
    public class193 method3263(long arg0) {
        class193 var3 = this.field2433[(int) (arg0 & (long) (this.field2436 - 1))];
        for (this.field2434 = var3.field2440; this.field2434 != var3; this.field2434 = this.field2434.field2440) {
            if (this.field2434.field2441 == arg0) {
                class193 var4 = this.field2434;
                this.field2434 = this.field2434.field2440;
                return var4;
            }
        }
        this.field2434 = null;
        return null;
    }

    @ObfuscatedName("gx.q(Lgm;J)V")
    public void method3269(class193 arg0, long arg1) {
        if (arg0.field2439 != null) {
            arg0.method3312();
        }
        class193 var4 = this.field2433[(int) (arg1 & (long) (this.field2436 - 1))];
        arg0.field2439 = var4.field2439;
        arg0.field2440 = var4;
        arg0.field2439.field2440 = arg0;
        arg0.field2440.field2439 = arg0;
        arg0.field2441 = arg1;
    }

    @ObfuscatedName("gx.x()V")
    public void method3264() {
        for (int var1 = 0; var1 < this.field2436; var1++) {
            class193 var2 = this.field2433[var1];
            while (true) {
                class193 var3 = var2.field2440;
                if (var2 == var3) {
                    break;
                }
                var3.method3312();
            }
        }
        this.field2434 = null;
        this.field2435 = null;
    }

    @ObfuscatedName("gx.y()Lgm;")
    public class193 method3265() {
        this.field2432 = 0;
        return this.method3266();
    }

    @ObfuscatedName("gx.e()Lgm;")
    public class193 method3266() {
        if (this.field2432 > 0 && this.field2433[this.field2432 - 1] != this.field2435) {
            class193 var1 = this.field2435;
            this.field2435 = var1.field2440;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2432 >= this.field2436) {
                return null;
            }
            var2 = this.field2433[this.field2432++].field2440;
        } while (this.field2433[this.field2432 - 1] == var2);
        this.field2435 = var2.field2440;
        return var2;
    }
}

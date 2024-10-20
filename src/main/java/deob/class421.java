package deob;

@ObfuscatedName("pa")
public final class class421 {

    @ObfuscatedName("pa.s")
    public int field4601;

    @ObfuscatedName("pa.h")
    public class411[] field4602;

    @ObfuscatedName("pa.w")
    public class411 field4603;

    @ObfuscatedName("pa.v")
    public class411 field4604;

    @ObfuscatedName("pa.c")
    public int field4605 = 0;

    public class421(int arg0) {
        this.field4601 = arg0;
        this.field4602 = new class411[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class411 var3 = this.field4602[var2] = new class411();
            var3.field4469 = var3;
            var3.field4470 = var3;
        }
    }

    @ObfuscatedName("pa.s(J)Lon;")
    public class411 method6695(long arg0) {
        class411 var3 = this.field4602[(int) (arg0 & (long) (this.field4601 - 1))];
        for (this.field4603 = var3.field4469; this.field4603 != var3; this.field4603 = this.field4603.field4469) {
            if (this.field4603.field4468 == arg0) {
                class411 var4 = this.field4603;
                this.field4603 = this.field4603.field4469;
                return var4;
            }
        }
        this.field4603 = null;
        return null;
    }

    @ObfuscatedName("pa.h(Lon;J)V")
    public void method6683(class411 arg0, long arg1) {
        if (arg0.field4470 != null) {
            arg0.method6409();
        }
        class411 var4 = this.field4602[(int) (arg1 & (long) (this.field4601 - 1))];
        arg0.field4470 = var4.field4470;
        arg0.field4469 = var4;
        arg0.field4470.field4469 = arg0;
        arg0.field4469.field4470 = arg0;
        arg0.field4468 = arg1;
    }

    @ObfuscatedName("pa.w()Lon;")
    public class411 method6694() {
        this.field4605 = 0;
        return this.method6681();
    }

    @ObfuscatedName("pa.v()Lon;")
    public class411 method6681() {
        if (this.field4605 > 0 && this.field4602[this.field4605 - 1] != this.field4604) {
            class411 var1 = this.field4604;
            this.field4604 = var1.field4469;
            return var1;
        }
        class411 var2;
        do {
            if (this.field4605 >= this.field4601) {
                return null;
            }
            var2 = this.field4602[this.field4605++].field4469;
        } while (this.field4602[this.field4605 - 1] == var2);
        this.field4604 = var2.field4469;
        return var2;
    }
}

package deob;

@ObfuscatedName("sh")
public final class class477 {

    @ObfuscatedName("sh.at")
    public int field4918;

    @ObfuscatedName("sh.an")
    public class461[] field4916;

    @ObfuscatedName("sh.av")
    public class461 field4917;

    @ObfuscatedName("sh.as")
    public class461 field4919;

    @ObfuscatedName("sh.ax")
    public int field4915 = 0;

    public class477(int arg0) {
        this.field4918 = arg0;
        this.field4916 = new class461[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class461 var3 = this.field4916[var2] = new class461();
            var3.field4756 = var3;
            var3.field4755 = var3;
        }
    }

    @ObfuscatedName("sh.at(J)Lrz;")
    public class461 method7872(long arg0) {
        class461 var3 = this.field4916[(int) (arg0 & (long) (this.field4918 - 1))];
        for (this.field4917 = var3.field4756; this.field4917 != var3; this.field4917 = this.field4917.field4756) {
            if (this.field4917.field4757 == arg0) {
                class461 var4 = this.field4917;
                this.field4917 = this.field4917.field4756;
                return var4;
            }
        }
        this.field4917 = null;
        return null;
    }

    @ObfuscatedName("sh.an(Lrz;J)V")
    public void method7878(class461 arg0, long arg1) {
        if (arg0.field4755 != null) {
            arg0.method7560();
        }
        class461 var4 = this.field4916[(int) (arg1 & (long) (this.field4918 - 1))];
        arg0.field4755 = var4.field4755;
        arg0.field4756 = var4;
        arg0.field4755.field4756 = arg0;
        arg0.field4756.field4755 = arg0;
        arg0.field4757 = arg1;
    }

    @ObfuscatedName("sh.av()Lrz;")
    public class461 method7871() {
        this.field4915 = 0;
        return this.method7879();
    }

    @ObfuscatedName("sh.as()Lrz;")
    public class461 method7879() {
        if (this.field4915 > 0 && this.field4916[this.field4915 - 1] != this.field4919) {
            class461 var1 = this.field4919;
            this.field4919 = var1.field4756;
            return var1;
        }
        class461 var2;
        do {
            if (this.field4915 >= this.field4918) {
                return null;
            }
            var2 = this.field4916[this.field4915++].field4756;
        } while (this.field4916[this.field4915 - 1] == var2);
        this.field4919 = var2.field4756;
        return var2;
    }
}

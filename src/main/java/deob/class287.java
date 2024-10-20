package deob;

@ObfuscatedName("lf")
public final class class287 {

    @ObfuscatedName("lf.at")
    public class457 field3077 = new class457();

    @ObfuscatedName("lf.an")
    public int field3079;

    @ObfuscatedName("lf.av")
    public int field3078;

    @ObfuscatedName("lf.as")
    public class476 field3080;

    @ObfuscatedName("lf.ax")
    public class381 field3076 = new class381();

    public class287(int arg0) {
        this.field3079 = arg0;
        this.field3078 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3080 = new class476(var2);
    }

    @ObfuscatedName("lf.at(J)Lrh;")
    public class457 method5121(long arg0) {
        class457 var3 = (class457) this.field3080.method7848(arg0);
        if (var3 != null) {
            this.field3076.method6460(var3);
        }
        return var3;
    }

    @ObfuscatedName("lf.an(J)V")
    public void method5122(long arg0) {
        class457 var3 = (class457) this.field3080.method7848(arg0);
        if (var3 != null) {
            var3.method7560();
            var3.method7554();
            this.field3078++;
        }
    }

    @ObfuscatedName("lf.av(Lrh;J)V")
    public void method5123(class457 arg0, long arg1) {
        if (this.field3078 == 0) {
            class457 var4 = this.field3076.method6452();
            var4.method7560();
            var4.method7554();
            if (this.field3077 == var4) {
                class457 var5 = this.field3076.method6452();
                var5.method7560();
                var5.method7554();
            }
        } else {
            this.field3078--;
        }
        this.field3080.method7857(arg0, arg1);
        this.field3076.method6460(arg0);
    }

    @ObfuscatedName("lf.as()V")
    public void method5124() {
        this.field3076.method6449();
        this.field3080.method7850();
        this.field3077 = new class457();
        this.field3078 = this.field3079;
    }
}

package deob;

@ObfuscatedName("mi")
public final class class316 {

    @ObfuscatedName("mi.ap")
    public class511 field3299 = new class511();

    @ObfuscatedName("mi.aw")
    public int field3295;

    @ObfuscatedName("mi.ak")
    public int field3296;

    @ObfuscatedName("mi.aj")
    public class530 field3298;

    @ObfuscatedName("mi.ai")
    public class416 field3297 = new class416();

    public class316(int arg0) {
        this.field3295 = arg0;
        this.field3296 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3298 = new class530(var2);
    }

    @ObfuscatedName("mi.ap(J)Ltp;")
    public class511 method5928(long arg0) {
        class511 var3 = (class511) this.field3298.method8985(arg0);
        if (var3 != null) {
            this.field3297.method7400(var3);
        }
        return var3;
    }

    @ObfuscatedName("mi.aw(J)V")
    public void method5944(long arg0) {
        class511 var3 = (class511) this.field3298.method8985(arg0);
        if (var3 != null) {
            var3.method8667();
            var3.method8665();
            this.field3296++;
        }
    }

    @ObfuscatedName("mi.ak(Ltp;J)V")
    public void method5931(class511 arg0, long arg1) {
        if (this.field3296 == 0) {
            class511 var4 = this.field3297.method7399();
            var4.method8667();
            var4.method8665();
            if (this.field3299 == var4) {
                class511 var5 = this.field3297.method7399();
                var5.method8667();
                var5.method8665();
            }
        } else {
            this.field3296--;
        }
        this.field3298.method8970(arg0, arg1);
        this.field3297.method7400(arg0);
    }

    @ObfuscatedName("mi.aj()V")
    public void method5930() {
        this.field3297.method7421();
        this.field3298.method8963();
        this.field3299 = new class511();
        this.field3296 = this.field3295;
    }
}

package deob;

@ObfuscatedName("mo")
public final class class313 {

    @ObfuscatedName("mo.aq")
    public class501 field3257 = new class501();

    @ObfuscatedName("mo.ad")
    public int field3258;

    @ObfuscatedName("mo.ag")
    public int field3259;

    @ObfuscatedName("mo.ak")
    public class520 field3260;

    @ObfuscatedName("mo.ap")
    public class412 field3261 = new class412();

    public class313(int arg0) {
        this.field3258 = arg0;
        this.field3259 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3260 = new class520(var2);
    }

    @ObfuscatedName("mo.aq(J)Ltv;")
    public class501 method5495(long arg0) {
        class501 var3 = (class501) this.field3260.method8442(arg0);
        if (var3 != null) {
            this.field3261.method6923(var3);
        }
        return var3;
    }

    @ObfuscatedName("mo.ad(J)V")
    public void method5503(long arg0) {
        class501 var3 = (class501) this.field3260.method8442(arg0);
        if (var3 != null) {
            var3.method8130();
            var3.method8125();
            this.field3259++;
        }
    }

    @ObfuscatedName("mo.ag(Ltv;J)V")
    public void method5498(class501 arg0, long arg1) {
        if (this.field3259 == 0) {
            class501 var4 = this.field3261.method6935();
            var4.method8130();
            var4.method8125();
            if (this.field3257 == var4) {
                class501 var5 = this.field3261.method6935();
                var5.method8130();
                var5.method8125();
            }
        } else {
            this.field3259--;
        }
        this.field3260.method8443(arg0, arg1);
        this.field3261.method6923(arg0);
    }

    @ObfuscatedName("mo.ak()V")
    public void method5500() {
        this.field3261.method6927();
        this.field3260.method8444();
        this.field3257 = new class501();
        this.field3259 = this.field3258;
    }
}

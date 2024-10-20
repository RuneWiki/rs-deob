package deob;

@ObfuscatedName("pt")
public class class406 extends class407 {

    @ObfuscatedName("pt.au")
    public class318 field4521 = null;

    @ObfuscatedName("pt.ae")
    public int field4520 = 0;

    public class406(class407 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4524 = "FadeInTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class306.field3412.size()) {
                this.field4521 = (class318) class306.field3412.get(arg1);
            } else if (!arg2 && arg1 < class306.field3405.size()) {
                this.field4521 = (class318) class306.field3405.get(arg1);
            }
            this.field4520 = arg3;
        }
    }

    @ObfuscatedName("pt.au(I)Z")
    public boolean method6976() {
        if (this.field4521 == null || this.field4521.field3518 == null) {
            return true;
        }
        this.field4521.field3525 = true;
        try {
            if (this.field4521.field3511 < (float) this.field4521.field3514 && this.field4521.field3518.method5334()) {
                float var1 = this.field4520 == 0 ? (float) this.field4520 : (float) this.field4521.field3514 / (float) this.field4520;
                this.field4521.field3511 += var1 == 0.0F ? (float) this.field4521.field3514 : var1;
                if (this.field4521.field3511 > (float) this.field4521.field3514) {
                    this.field4521.field3511 = (float) this.field4521.field3514;
                }
                this.field4521.field3518.method5272((int) this.field4521.field3511);
                return false;
            }
        } catch (Exception var3) {
            this.method6986(var3.getMessage());
            return true;
        }
        this.field4521.field3525 = false;
        return true;
    }
}

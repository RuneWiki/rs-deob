package deob;

@ObfuscatedName("px")
public class class405 extends class407 {

    @ObfuscatedName("px.au")
    public class318 field4518 = null;

    @ObfuscatedName("px.ae")
    public int field4517 = 0;

    public class405(class407 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4524 = "FadeOutTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class306.field3412.size()) {
                this.field4518 = (class318) class306.field3412.get(arg1);
            } else if (!arg2 && arg1 < class306.field3405.size()) {
                this.field4518 = (class318) class306.field3405.get(arg1);
            }
            this.field4517 = arg3;
        }
    }

    @ObfuscatedName("px.au(I)Z")
    public boolean method6976() {
        if (this.field4518 == null || this.field4518.field3518 == null) {
            return true;
        }
        this.field4518.field3525 = true;
        try {
            if (this.field4518.field3511 > 0.0F && this.field4518.field3518.method5334()) {
                float var1 = this.field4517 == 0 ? (float) this.field4517 : (float) this.field4518.field3514 / (float) this.field4517;
                this.field4518.field3511 -= var1 == 0.0F ? (float) this.field4518.field3514 : var1;
                if (this.field4518.field3511 < 0.0F) {
                    this.field4518.field3511 = 0.0F;
                }
                this.field4518.field3518.method5272((int) this.field4518.field3511);
                return false;
            }
        } catch (Exception var3) {
            this.method6986(var3.getMessage());
            return true;
        }
        this.field4518.field3525 = false;
        return true;
    }
}

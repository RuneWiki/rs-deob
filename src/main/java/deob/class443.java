package deob;

@ObfuscatedName("rr")
public class class443 extends class444 {

    @ObfuscatedName("rr.ak")
    public class342 field4792 = null;

    @ObfuscatedName("rr.al")
    public int field4793 = 0;

    public class443(class444 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4794 = "FadeInTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class330.field3577.size()) {
                this.field4792 = (class342) class330.field3577.get(arg1);
            } else if (!arg2 && arg1 < class330.field3579.size()) {
                this.field4792 = (class342) class330.field3579.get(arg1);
            }
            this.field4793 = arg3;
        }
    }

    @ObfuscatedName("rr.ak(I)Z")
    public boolean method7581() {
        if (this.field4792 == null || this.field4792.field3694 == null) {
            return true;
        }
        this.field4792.field3697 = true;
        try {
            if (this.field4792.field3689 < (float) this.field4792.field3685 && this.field4792.field3694.method5673()) {
                float var1 = this.field4793 == 0 ? (float) this.field4793 : (float) this.field4792.field3685 / (float) this.field4793;
                this.field4792.field3689 += var1 == 0.0F ? (float) this.field4792.field3685 : var1;
                if (this.field4792.field3689 > (float) this.field4792.field3685) {
                    this.field4792.field3689 = (float) this.field4792.field3685;
                }
                this.field4792.field3694.method5736((int) this.field4792.field3689);
                return false;
            }
        } catch (Exception var3) {
            this.method7599(var3.getMessage());
            return true;
        }
        this.field4792.field3697 = false;
        return true;
    }
}

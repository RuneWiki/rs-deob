package deob;

@ObfuscatedName("ri")
public class class448 extends class449 {

    @ObfuscatedName("ri.ap")
    public class346 field4881 = null;

    @ObfuscatedName("ri.aw")
    public int field4880 = 0;

    public class448(class449 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4882 = "FadeInTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class334.field3626.size()) {
                this.field4881 = (class346) class334.field3626.get(arg1);
            } else if (!arg2 && arg1 < class334.field3630.size()) {
                this.field4881 = (class346) class334.field3630.get(arg1);
            }
            this.field4880 = arg3;
        }
    }

    @ObfuscatedName("ri.ap(I)Z")
    public boolean method8051() {
        if (this.field4881 == null || this.field4881.field3748 == null) {
            return true;
        }
        this.field4881.field3752 = true;
        try {
            if (this.field4881.field3750 < (float) this.field4881.field3747 && this.field4881.field3748.method6046()) {
                float var1 = this.field4880 == 0 ? (float) this.field4880 : (float) this.field4881.field3747 / (float) this.field4880;
                this.field4881.field3750 += var1 == 0.0F ? (float) this.field4881.field3747 : var1;
                if (this.field4881.field3750 > (float) this.field4881.field3747) {
                    this.field4881.field3750 = (float) this.field4881.field3747;
                }
                this.field4881.field3748.method6093((int) this.field4881.field3750);
                return false;
            }
        } catch (Exception var3) {
            this.method8067(var3.getMessage());
            return true;
        }
        this.field4881.field3752 = false;
        return true;
    }
}

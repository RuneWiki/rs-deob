package deob;

@ObfuscatedName("rt")
public class class447 extends class449 {

    @ObfuscatedName("rt.ap")
    public class346 field4879 = null;

    @ObfuscatedName("rt.aw")
    public int field4878 = 0;

    public class447(class449 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4882 = "FadeOutTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class334.field3626.size()) {
                this.field4879 = (class346) class334.field3626.get(arg1);
            } else if (!arg2 && arg1 < class334.field3630.size()) {
                this.field4879 = (class346) class334.field3630.get(arg1);
            }
            this.field4878 = arg3;
        }
    }

    @ObfuscatedName("rt.ap(I)Z")
    public boolean method8051() {
        if (this.field4879 == null || this.field4879.field3748 == null) {
            return true;
        }
        this.field4879.field3752 = true;
        try {
            if (this.field4879.field3750 > 0.0F && this.field4879.field3748.method6046()) {
                float var1 = this.field4878 == 0 ? (float) this.field4878 : (float) this.field4879.field3747 / (float) this.field4878;
                this.field4879.field3750 -= var1 == 0.0F ? (float) this.field4879.field3747 : var1;
                if (this.field4879.field3750 < 0.0F) {
                    this.field4879.field3750 = 0.0F;
                }
                this.field4879.field3748.method6093((int) this.field4879.field3750);
                return false;
            }
        } catch (Exception var3) {
            this.method8067(var3.getMessage());
            return true;
        }
        this.field4879.field3752 = false;
        return true;
    }
}

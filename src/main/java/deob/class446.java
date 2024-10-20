package deob;

@ObfuscatedName("rc")
public class class446 extends class448 {

    @ObfuscatedName("rc.ac")
    public class347 field4838 = null;

    @ObfuscatedName("rc.ae")
    public int field4837 = 0;

    public class446(class448 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4844 = "FadeOutTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class335.field3622.size()) {
                this.field4838 = (class347) class335.field3622.get(arg1);
            } else if (!arg2 && arg1 < class335.field3627.size()) {
                this.field4838 = (class347) class335.field3627.get(arg1);
            }
            this.field4837 = arg3;
        }
    }

    @ObfuscatedName("rc.ac(I)Z")
    public boolean method7804() {
        if (this.field4838 == null || this.field4838.field3733 == null) {
            return true;
        }
        this.field4838.field3735 = true;
        try {
            if (this.field4838.field3731 > 0.0F && this.field4838.field3733.method5854()) {
                float var1 = this.field4837 == 0 ? (float) this.field4837 : (float) this.field4838.field3730 / (float) this.field4837;
                this.field4838.field3731 -= var1 == 0.0F ? (float) this.field4838.field3730 : var1;
                if (this.field4838.field3731 < 0.0F) {
                    this.field4838.field3731 = 0.0F;
                }
                this.field4838.field3733.method5847((int) this.field4838.field3731);
                return false;
            }
        } catch (Exception var3) {
            this.method7820(var3.getMessage());
            return true;
        }
        this.field4838.field3735 = false;
        return true;
    }
}

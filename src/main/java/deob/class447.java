package deob;

@ObfuscatedName("rj")
public class class447 extends class448 {

    @ObfuscatedName("rj.ac")
    public class347 field4841 = null;

    @ObfuscatedName("rj.ae")
    public int field4840 = 0;

    public class447(class448 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4844 = "FadeInTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class335.field3622.size()) {
                this.field4841 = (class347) class335.field3622.get(arg1);
            } else if (!arg2 && arg1 < class335.field3627.size()) {
                this.field4841 = (class347) class335.field3627.get(arg1);
            }
            this.field4840 = arg3;
        }
    }

    @ObfuscatedName("rj.ac(I)Z")
    public boolean method7804() {
        if (this.field4841 == null || this.field4841.field3733 == null) {
            return true;
        }
        this.field4841.field3735 = true;
        try {
            if (this.field4841.field3731 < (float) this.field4841.field3730 && this.field4841.field3733.method5854()) {
                float var1 = this.field4840 == 0 ? (float) this.field4840 : (float) this.field4841.field3730 / (float) this.field4840;
                this.field4841.field3731 += var1 == 0.0F ? (float) this.field4841.field3730 : var1;
                if (this.field4841.field3731 > (float) this.field4841.field3730) {
                    this.field4841.field3731 = (float) this.field4841.field3730;
                }
                this.field4841.field3733.method5847((int) this.field4841.field3731);
                return false;
            }
        } catch (Exception var3) {
            this.method7820(var3.getMessage());
            return true;
        }
        this.field4841.field3735 = false;
        return true;
    }
}

package deob;

@ObfuscatedName("rj")
public class class443 extends class445 {

    @ObfuscatedName("rj.aq")
    public class343 field4809 = null;

    @ObfuscatedName("rj.ad")
    public int field4807 = 0;

    public class443(class445 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4815 = "FadeOutTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class331.field3588.size()) {
                this.field4809 = (class343) class331.field3588.get(arg1);
            } else if (!arg2 && arg1 < class331.field3585.size()) {
                this.field4809 = (class343) class331.field3585.get(arg1);
            }
            this.field4807 = arg3;
        }
    }

    @ObfuscatedName("rj.aq(S)Z")
    public boolean method7560() {
        if (this.field4809 == null || this.field4809.field3714 == null) {
            return true;
        }
        this.field4809.field3716 = true;
        try {
            if (this.field4809.field3705 > 0.0F && this.field4809.field3714.method5615()) {
                float var1 = this.field4807 == 0 ? (float) this.field4807 : (float) this.field4809.field3707 / (float) this.field4807;
                this.field4809.field3705 -= var1 == 0.0F ? (float) this.field4809.field3707 : var1;
                if (this.field4809.field3705 < 0.0F) {
                    this.field4809.field3705 = 0.0F;
                }
                this.field4809.field3714.method5609((int) this.field4809.field3705);
                return false;
            }
        } catch (Exception var3) {
            this.method7571(var3.getMessage());
            return true;
        }
        this.field4809.field3716 = false;
        return true;
    }
}

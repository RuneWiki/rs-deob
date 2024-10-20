package deob;

@ObfuscatedName("rz")
public class class444 extends class445 {

    @ObfuscatedName("rz.aq")
    public class343 field4811 = null;

    @ObfuscatedName("rz.ad")
    public int field4810 = 0;

    public class444(class445 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4815 = "FadeInTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class331.field3588.size()) {
                this.field4811 = (class343) class331.field3588.get(arg1);
            } else if (!arg2 && arg1 < class331.field3585.size()) {
                this.field4811 = (class343) class331.field3585.get(arg1);
            }
            this.field4810 = arg3;
        }
    }

    @ObfuscatedName("rz.aq(S)Z")
    public boolean method7560() {
        if (this.field4811 == null || this.field4811.field3714 == null) {
            return true;
        }
        this.field4811.field3716 = true;
        try {
            if (this.field4811.field3705 < (float) this.field4811.field3707 && this.field4811.field3714.method5615()) {
                float var1 = this.field4810 == 0 ? (float) this.field4810 : (float) this.field4811.field3707 / (float) this.field4810;
                this.field4811.field3705 += var1 == 0.0F ? (float) this.field4811.field3707 : var1;
                if (this.field4811.field3705 > (float) this.field4811.field3707) {
                    this.field4811.field3705 = (float) this.field4811.field3707;
                }
                this.field4811.field3714.method5609((int) this.field4811.field3705);
                return false;
            }
        } catch (Exception var3) {
            this.method7571(var3.getMessage());
            return true;
        }
        this.field4811.field3716 = false;
        return true;
    }
}

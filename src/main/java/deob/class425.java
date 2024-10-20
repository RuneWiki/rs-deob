package deob;

@ObfuscatedName("qd")
public class class425 extends class426 {

    @ObfuscatedName("qd.aq")
    public class334 field4626 = null;

    @ObfuscatedName("qd.aw")
    public int field4625 = 0;

    public class425(class426 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4628 = "FadeInTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class322.field3479.size()) {
                this.field4626 = (class334) class322.field3479.get(arg1);
            } else if (!arg2 && arg1 < class322.field3475.size()) {
                this.field4626 = (class334) class322.field3475.get(arg1);
            }
            this.field4625 = arg3;
        }
    }

    @ObfuscatedName("qd.aq(I)Z")
    public boolean method7266() {
        if (this.field4626 == null || this.field4626.field3595 == null) {
            return true;
        }
        this.field4626.field3598 = true;
        try {
            if (this.field4626.field3603 < (float) this.field4626.field3593 && this.field4626.field3595.method5551()) {
                float var1 = this.field4625 == 0 ? (float) this.field4625 : (float) this.field4626.field3593 / (float) this.field4625;
                this.field4626.field3603 += var1 == 0.0F ? (float) this.field4626.field3593 : var1;
                if (this.field4626.field3603 > (float) this.field4626.field3593) {
                    this.field4626.field3603 = (float) this.field4626.field3593;
                }
                this.field4626.field3595.method5622((int) this.field4626.field3603);
                return false;
            }
        } catch (Exception var3) {
            this.method7280(var3.getMessage());
            return true;
        }
        this.field4626.field3598 = false;
        return true;
    }
}

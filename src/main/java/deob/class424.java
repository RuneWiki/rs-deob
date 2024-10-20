package deob;

@ObfuscatedName("qu")
public class class424 extends class426 {

    @ObfuscatedName("qu.aq")
    public class334 field4623 = null;

    @ObfuscatedName("qu.aw")
    public int field4622 = 0;

    public class424(class426 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4628 = "FadeOutTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class322.field3479.size()) {
                this.field4623 = (class334) class322.field3479.get(arg1);
            } else if (!arg2 && arg1 < class322.field3475.size()) {
                this.field4623 = (class334) class322.field3475.get(arg1);
            }
            this.field4622 = arg3;
        }
    }

    @ObfuscatedName("qu.aq(I)Z")
    public boolean method7266() {
        if (this.field4623 == null || this.field4623.field3595 == null) {
            return true;
        }
        this.field4623.field3598 = true;
        try {
            if (this.field4623.field3603 > 0.0F && this.field4623.field3595.method5551()) {
                float var1 = this.field4622 == 0 ? (float) this.field4622 : (float) this.field4623.field3593 / (float) this.field4622;
                this.field4623.field3603 -= var1 == 0.0F ? (float) this.field4623.field3593 : var1;
                if (this.field4623.field3603 < 0.0F) {
                    this.field4623.field3603 = 0.0F;
                }
                this.field4623.field3595.method5622((int) this.field4623.field3603);
                return false;
            }
        } catch (Exception var3) {
            this.method7280(var3.getMessage());
            return true;
        }
        this.field4623.field3598 = false;
        return true;
    }
}

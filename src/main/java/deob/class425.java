package deob;

@ObfuscatedName("qz")
public class class425 extends class427 {

    @ObfuscatedName("qz.az")
    public class334 field4645 = null;

    @ObfuscatedName("qz.ah")
    public int field4643 = 0;

    public class425(class427 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4652 = "FadeOutTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class322.field3501.size()) {
                this.field4645 = (class334) class322.field3501.get(arg1);
            } else if (!arg2 && arg1 < class322.field3496.size()) {
                this.field4645 = (class334) class322.field3496.get(arg1);
            }
            this.field4643 = arg3;
        }
    }

    @ObfuscatedName("qz.az(I)Z")
    public boolean method7146() {
        if (this.field4645 == null || this.field4645.field3614 == null) {
            return true;
        }
        this.field4645.field3605 = true;
        try {
            if (this.field4645.field3609 > 0.0F && this.field4645.field3614.method5448()) {
                float var1 = this.field4643 == 0 ? (float) this.field4643 : (float) this.field4645.field3608 / (float) this.field4643;
                this.field4645.field3609 -= var1 == 0.0F ? (float) this.field4645.field3608 : var1;
                if (this.field4645.field3609 < 0.0F) {
                    this.field4645.field3609 = 0.0F;
                }
                this.field4645.field3614.method5440((int) this.field4645.field3609);
                return false;
            }
        } catch (Exception var3) {
            this.method7175(var3.getMessage());
            return true;
        }
        this.field4645.field3605 = false;
        return true;
    }
}

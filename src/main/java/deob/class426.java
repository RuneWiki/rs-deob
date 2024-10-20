package deob;

@ObfuscatedName("qh")
public class class426 extends class427 {

    @ObfuscatedName("qh.az")
    public class334 field4649 = null;

    @ObfuscatedName("qh.ah")
    public int field4648 = 0;

    public class426(class427 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4652 = "FadeInTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class322.field3501.size()) {
                this.field4649 = (class334) class322.field3501.get(arg1);
            } else if (!arg2 && arg1 < class322.field3496.size()) {
                this.field4649 = (class334) class322.field3496.get(arg1);
            }
            this.field4648 = arg3;
        }
    }

    @ObfuscatedName("qh.az(I)Z")
    public boolean method7146() {
        if (this.field4649 == null || this.field4649.field3614 == null) {
            return true;
        }
        this.field4649.field3605 = true;
        try {
            if (this.field4649.field3609 < (float) this.field4649.field3608 && this.field4649.field3614.method5448()) {
                float var1 = this.field4648 == 0 ? (float) this.field4648 : (float) this.field4649.field3608 / (float) this.field4648;
                this.field4649.field3609 += var1 == 0.0F ? (float) this.field4649.field3608 : var1;
                if (this.field4649.field3609 > (float) this.field4649.field3608) {
                    this.field4649.field3609 = (float) this.field4649.field3608;
                }
                this.field4649.field3614.method5440((int) this.field4649.field3609);
                return false;
            }
        } catch (Exception var3) {
            this.method7175(var3.getMessage());
            return true;
        }
        this.field4649.field3605 = false;
        return true;
    }
}

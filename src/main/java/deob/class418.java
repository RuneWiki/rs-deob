package deob;

@ObfuscatedName("qt")
public class class418 extends class419 {

    @ObfuscatedName("qt.at")
    public class329 field4551 = null;

    @ObfuscatedName("qt.ah")
    public int field4550 = 0;

    public class418(class419 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4553 = "FadeInTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class317.field3417.size()) {
                this.field4551 = (class329) class317.field3417.get(arg1);
            } else if (!arg2 && arg1 < class317.field3423.size()) {
                this.field4551 = (class329) class317.field3423.get(arg1);
            }
            this.field4550 = arg3;
        }
    }

    @ObfuscatedName("qt.at(I)Z")
    public boolean method7116() {
        if (this.field4551 == null || this.field4551.field3523 == null) {
            return true;
        }
        this.field4551.field3531 = true;
        try {
            if (this.field4551.field3529 < (float) this.field4551.field3526 && this.field4551.field3523.method5487()) {
                float var1 = this.field4550 == 0 ? (float) this.field4550 : (float) this.field4551.field3526 / (float) this.field4550;
                this.field4551.field3529 += var1 == 0.0F ? (float) this.field4551.field3526 : var1;
                if (this.field4551.field3529 > (float) this.field4551.field3526) {
                    this.field4551.field3529 = (float) this.field4551.field3526;
                }
                this.field4551.field3523.method5406((int) this.field4551.field3529);
                return false;
            }
        } catch (Exception var3) {
            this.method7133(var3.getMessage());
            return true;
        }
        this.field4551.field3531 = false;
        return true;
    }
}

package deob;

@ObfuscatedName("qb")
public class class417 extends class419 {

    @ObfuscatedName("qb.at")
    public class329 field4549 = null;

    @ObfuscatedName("qb.ah")
    public int field4547 = 0;

    public class417(class419 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4553 = "FadeOutTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class317.field3417.size()) {
                this.field4549 = (class329) class317.field3417.get(arg1);
            } else if (!arg2 && arg1 < class317.field3423.size()) {
                this.field4549 = (class329) class317.field3423.get(arg1);
            }
            this.field4547 = arg3;
        }
    }

    @ObfuscatedName("qb.at(I)Z")
    public boolean method7116() {
        if (this.field4549 == null || this.field4549.field3523 == null) {
            return true;
        }
        this.field4549.field3531 = true;
        try {
            if (this.field4549.field3529 > 0.0F && this.field4549.field3523.method5487()) {
                float var1 = this.field4547 == 0 ? (float) this.field4547 : (float) this.field4549.field3526 / (float) this.field4547;
                this.field4549.field3529 -= var1 == 0.0F ? (float) this.field4549.field3526 : var1;
                if (this.field4549.field3529 < 0.0F) {
                    this.field4549.field3529 = 0.0F;
                }
                this.field4549.field3523.method5406((int) this.field4549.field3529);
                return false;
            }
        } catch (Exception var3) {
            this.method7133(var3.getMessage());
            return true;
        }
        this.field4549.field3531 = false;
        return true;
    }
}

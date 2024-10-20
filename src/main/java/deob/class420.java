package deob;

@ObfuscatedName("qk")
public class class420 extends class422 {

    @ObfuscatedName("qk.ac")
    public class332 field4568 = null;

    @ObfuscatedName("qk.al")
    public int field4567 = 0;

    public class420(class422 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4573 = "FadeOutTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class320.field3429.size()) {
                this.field4568 = (class332) class320.field3429.get(arg1);
            } else if (!arg2 && arg1 < class320.field3434.size()) {
                this.field4568 = (class332) class320.field3434.get(arg1);
            }
            this.field4567 = arg3;
        }
    }

    @ObfuscatedName("qk.ac(B)Z")
    public boolean method7059() {
        if (this.field4568 == null || this.field4568.field3539 == null) {
            return true;
        }
        this.field4568.field3547 = true;
        try {
            if (this.field4568.field3543 > 0.0F && this.field4568.field3539.method5418()) {
                float var1 = this.field4567 == 0 ? (float) this.field4567 : (float) this.field4568.field3542 / (float) this.field4567;
                this.field4568.field3543 -= var1 == 0.0F ? (float) this.field4568.field3542 : var1;
                if (this.field4568.field3543 < 0.0F) {
                    this.field4568.field3543 = 0.0F;
                }
                this.field4568.field3539.method5411((int) this.field4568.field3543);
                return false;
            }
        } catch (Exception var3) {
            this.method7079(var3.getMessage());
            return true;
        }
        this.field4568.field3547 = false;
        return true;
    }
}

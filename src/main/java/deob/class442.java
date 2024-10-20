package deob;

@ObfuscatedName("qn")
public class class442 extends class444 {

    @ObfuscatedName("qn.ak")
    public class342 field4789 = null;

    @ObfuscatedName("qn.al")
    public int field4791 = 0;

    public class442(class444 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4794 = "FadeOutTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class330.field3577.size()) {
                this.field4789 = (class342) class330.field3577.get(arg1);
            } else if (!arg2 && arg1 < class330.field3579.size()) {
                this.field4789 = (class342) class330.field3579.get(arg1);
            }
            this.field4791 = arg3;
        }
    }

    @ObfuscatedName("qn.ak(I)Z")
    public boolean method7581() {
        if (this.field4789 == null || this.field4789.field3694 == null) {
            return true;
        }
        this.field4789.field3697 = true;
        try {
            if (this.field4789.field3689 > 0.0F && this.field4789.field3694.method5673()) {
                float var1 = this.field4791 == 0 ? (float) this.field4791 : (float) this.field4789.field3685 / (float) this.field4791;
                this.field4789.field3689 -= var1 == 0.0F ? (float) this.field4789.field3685 : var1;
                if (this.field4789.field3689 < 0.0F) {
                    this.field4789.field3689 = 0.0F;
                }
                this.field4789.field3694.method5736((int) this.field4789.field3689);
                return false;
            }
        } catch (Exception var3) {
            this.method7599(var3.getMessage());
            return true;
        }
        this.field4789.field3697 = false;
        return true;
    }
}

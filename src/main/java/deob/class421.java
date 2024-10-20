package deob;

@ObfuscatedName("qa")
public class class421 extends class423 {

    @ObfuscatedName("qa.am")
    public class332 field4589 = null;

    @ObfuscatedName("qa.ap")
    public int field4590 = 0;

    public class421(class423 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4598 = "FadeOutTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class320.field3462.size()) {
                this.field4589 = (class332) class320.field3462.get(arg1);
            } else if (!arg2 && arg1 < class320.field3460.size()) {
                this.field4589 = (class332) class320.field3460.get(arg1);
            }
            this.field4590 = arg3;
        }
    }

    @ObfuscatedName("qa.am(I)Z")
    public boolean method7259() {
        if (this.field4589 == null || this.field4589.field3583 == null) {
            return true;
        }
        this.field4589.field3581 = true;
        try {
            if (this.field4589.field3577 > 0.0F && this.field4589.field3583.method5511()) {
                float var1 = this.field4590 == 0 ? (float) this.field4590 : (float) this.field4589.field3578 / (float) this.field4590;
                this.field4589.field3577 -= var1 == 0.0F ? (float) this.field4589.field3578 : var1;
                if (this.field4589.field3577 < 0.0F) {
                    this.field4589.field3577 = 0.0F;
                }
                this.field4589.field3583.method5503((int) this.field4589.field3577);
                return false;
            }
        } catch (Exception var3) {
            this.method7268(var3.getMessage());
            return true;
        }
        this.field4589.field3581 = false;
        return true;
    }
}

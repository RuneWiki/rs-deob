package deob;

@ObfuscatedName("qt")
public class class422 extends class423 {

    @ObfuscatedName("qt.am")
    public class332 field4593 = null;

    @ObfuscatedName("qt.ap")
    public int field4594 = 0;

    public class422(class423 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4598 = "FadeInTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class320.field3462.size()) {
                this.field4593 = (class332) class320.field3462.get(arg1);
            } else if (!arg2 && arg1 < class320.field3460.size()) {
                this.field4593 = (class332) class320.field3460.get(arg1);
            }
            this.field4594 = arg3;
        }
    }

    @ObfuscatedName("qt.am(I)Z")
    public boolean method7259() {
        if (this.field4593 == null || this.field4593.field3583 == null) {
            return true;
        }
        this.field4593.field3581 = true;
        try {
            if (this.field4593.field3577 < (float) this.field4593.field3578 && this.field4593.field3583.method5511()) {
                float var1 = this.field4594 == 0 ? (float) this.field4594 : (float) this.field4593.field3578 / (float) this.field4594;
                this.field4593.field3577 += var1 == 0.0F ? (float) this.field4593.field3578 : var1;
                if (this.field4593.field3577 > (float) this.field4593.field3578) {
                    this.field4593.field3577 = (float) this.field4593.field3578;
                }
                this.field4593.field3583.method5503((int) this.field4593.field3577);
                return false;
            }
        } catch (Exception var3) {
            this.method7268(var3.getMessage());
            return true;
        }
        this.field4593.field3581 = false;
        return true;
    }
}

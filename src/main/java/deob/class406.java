package deob;

@ObfuscatedName("px")
public class class406 extends class408 {

    @ObfuscatedName("px.aw")
    public class319 field4521 = null;

    @ObfuscatedName("px.ay")
    public int field4522 = 0;

    public class406(class408 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4529 = "FadeOutTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class307.field3397.size()) {
                this.field4521 = (class319) class307.field3397.get(arg1);
            } else if (!arg2 && arg1 < class307.field3395.size()) {
                this.field4521 = (class319) class307.field3395.get(arg1);
            }
            this.field4522 = arg3;
        }
    }

    @ObfuscatedName("px.aw(II)Z")
    public boolean method6944(int arg0) {
        if (this.field4521 == null || this.field4521.field3517 == null) {
            return true;
        }
        this.field4521.field3516 = true;
        try {
            if (this.field4521.field3512 > 0.0F && this.field4521.field3517.method5264()) {
                float var2 = this.field4522 == 0 ? (float) this.field4522 : (float) this.field4521.field3511 / (float) this.field4522;
                this.field4521.field3512 -= var2 == 0.0F ? (float) this.field4521.field3511 : var2;
                if (this.field4521.field3512 < 0.0F) {
                    this.field4521.field3512 = 0.0F;
                }
                this.field4521.field3517.method5256((int) this.field4521.field3512);
                return false;
            }
        } catch (Exception var4) {
            this.method6959(var4.getMessage());
            return true;
        }
        this.field4521.field3516 = false;
        return true;
    }
}

package deob;

@ObfuscatedName("pb")
public class class407 extends class408 {

    @ObfuscatedName("pb.aw")
    public class319 field4525 = null;

    @ObfuscatedName("pb.ay")
    public int field4524 = 0;

    public class407(class408 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4529 = "FadeInTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class307.field3397.size()) {
                this.field4525 = (class319) class307.field3397.get(arg1);
            } else if (!arg2 && arg1 < class307.field3395.size()) {
                this.field4525 = (class319) class307.field3395.get(arg1);
            }
            this.field4524 = arg3;
        }
    }

    @ObfuscatedName("pb.aw(II)Z")
    public boolean method6944(int arg0) {
        if (this.field4525 == null || this.field4525.field3517 == null) {
            return true;
        }
        this.field4525.field3516 = true;
        try {
            if (this.field4525.field3512 < (float) this.field4525.field3511 && this.field4525.field3517.method5264()) {
                float var2 = this.field4524 == 0 ? (float) this.field4524 : (float) this.field4525.field3511 / (float) this.field4524;
                this.field4525.field3512 += var2 == 0.0F ? (float) this.field4525.field3511 : var2;
                if (this.field4525.field3512 > (float) this.field4525.field3511) {
                    this.field4525.field3512 = (float) this.field4525.field3511;
                }
                this.field4525.field3517.method5256((int) this.field4525.field3512);
                return false;
            }
        } catch (Exception var4) {
            this.method6959(var4.getMessage());
            return true;
        }
        this.field4525.field3516 = false;
        return true;
    }
}

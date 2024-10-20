package deob;

@ObfuscatedName("rw")
public class class445 extends class446 {

    @ObfuscatedName("rw.ab")
    public class345 field4789 = null;

    @ObfuscatedName("rw.ay")
    public int field4788 = 0;

    public class445(class446 arg0, int arg1, boolean arg2, int arg3) {
        super(arg0);
        this.field4797 = "FadeInTask";
        if (arg1 >= 0) {
            if (arg2 && arg1 < class333.field3564.size()) {
                this.field4789 = (class345) class333.field3564.get(arg1);
            } else if (!arg2 && arg1 < class333.field3565.size()) {
                this.field4789 = (class345) class333.field3565.get(arg1);
            }
            this.field4788 = arg3;
        }
    }

    @ObfuscatedName("rw.ab(I)Z")
    public boolean method7665() {
        if (this.field4789 == null || this.field4789.field3683 == null) {
            return true;
        }
        this.field4789.field3681 = true;
        try {
            if (this.field4789.field3677 < (float) this.field4789.field3676 && this.field4789.field3683.method5700()) {
                float var1 = this.field4788 == 0 ? (float) this.field4788 : (float) this.field4789.field3676 / (float) this.field4788;
                this.field4789.field3677 += var1 == 0.0F ? (float) this.field4789.field3676 : var1;
                if (this.field4789.field3677 > (float) this.field4789.field3676) {
                    this.field4789.field3677 = (float) this.field4789.field3676;
                }
                this.field4789.field3683.method5691((int) this.field4789.field3677);
                return false;
            }
        } catch (Exception var3) {
            this.method7672(var3.getMessage());
            return true;
        }
        this.field4789.field3681 = false;
        return true;
    }
}

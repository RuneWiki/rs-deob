package deob;

@ObfuscatedName("tg")
public class class501 {

    @ObfuscatedName("tg.ar")
    public String field4986;

    @ObfuscatedName("tg.as")
    public class378 field4984;

    @ObfuscatedName("tg.aa")
    public int field4989 = 0;

    @ObfuscatedName("tg.az")
    public boolean field4990 = false;

    public class501(class378 arg0) {
        this.field4984 = arg0;
    }

    @ObfuscatedName("tg.aq(Ljava/lang/String;I)V")
    public void method8044(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4986 != arg0) {
            this.field4986 = arg0;
            this.field4989 = 0;
            this.field4990 = false;
            this.method8056();
        }
    }

    @ObfuscatedName("tg.aw(I)I")
    public int method8056() {
        if (this.field4986 == null) {
            this.field4989 = 100;
            this.field4990 = true;
        } else {
            if (this.field4989 < 33) {
                if (!this.field4984.method6430(class261.field2679.field2680, this.field4986)) {
                    return this.field4989;
                }
                this.field4989 = 33;
            }
            if (this.field4989 == 33) {
                if (this.field4984.method6496(class261.field2682.field2680, this.field4986) && !this.field4984.method6430(class261.field2682.field2680, this.field4986)) {
                    return this.field4989;
                }
                this.field4989 = 66;
            }
            if (this.field4989 == 66) {
                if (!this.field4984.method6430(this.field4986, class261.field2683.field2680)) {
                    return this.field4989;
                }
                this.field4989 = 100;
                this.field4990 = true;
            }
        }
        return this.field4989;
    }

    @ObfuscatedName("tg.al(I)Z")
    public boolean method8046() {
        return this.field4990;
    }

    @ObfuscatedName("tg.ai(I)I")
    public int method8047() {
        return this.field4989;
    }
}

package deob;

@ObfuscatedName("gb")
public class class195 {

    @ObfuscatedName("gb.h")
    public class207 field3066 = new class207();

    @ObfuscatedName("gb.q")
    public class207 field3067;

    public class195() {
        this.field3066.field3092 = this.field3066;
        this.field3066.field3091 = this.field3066;
    }

    @ObfuscatedName("gb.h(Lgh;)V")
    public void method3567(class207 arg0) {
        if (arg0.field3091 != null) {
            arg0.method3707();
        }
        arg0.field3091 = this.field3066.field3091;
        arg0.field3092 = this.field3066;
        arg0.field3091.field3092 = arg0;
        arg0.field3092.field3091 = arg0;
    }

    @ObfuscatedName("gb.q()Lgh;")
    public class207 method3563() {
        class207 var1 = this.field3066.field3092;
        if (this.field3066 == var1) {
            this.field3067 = null;
            return null;
        } else {
            this.field3067 = var1.field3092;
            return var1;
        }
    }

    @ObfuscatedName("gb.v()Lgh;")
    public class207 method3565() {
        class207 var1 = this.field3067;
        if (this.field3066 == var1) {
            this.field3067 = null;
            return null;
        } else {
            this.field3067 = var1.field3092;
            return var1;
        }
    }
}

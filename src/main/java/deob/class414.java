package deob;

@ObfuscatedName("py")
public class class414 {

    @ObfuscatedName("py.ap")
    public class510 field4733 = new class510();

    @ObfuscatedName("py.aw")
    public class510 field4732;

    public class414() {
        this.field4733.field5161 = this.field4733;
        this.field4733.field5162 = this.field4733;
    }

    @ObfuscatedName("py.ap(Ltn;)V")
    public void method7378(class510 arg0) {
        if (arg0.field5162 != null) {
            arg0.method8661();
        }
        arg0.field5162 = this.field4733.field5162;
        arg0.field5161 = this.field4733;
        arg0.field5162.field5161 = arg0;
        arg0.field5161.field5162 = arg0;
    }

    @ObfuscatedName("py.aw()Ltn;")
    public class510 method7380() {
        class510 var1 = this.field4733.field5161;
        if (this.field4733 == var1) {
            this.field4732 = null;
            return null;
        } else {
            this.field4732 = var1.field5161;
            return var1;
        }
    }

    @ObfuscatedName("py.ak()Ltn;")
    public class510 method7381() {
        class510 var1 = this.field4732;
        if (this.field4733 == var1) {
            this.field4732 = null;
            return null;
        } else {
            this.field4732 = var1.field5161;
            return var1;
        }
    }
}

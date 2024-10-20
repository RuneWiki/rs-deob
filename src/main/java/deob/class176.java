package deob;

@ObfuscatedName("fn")
public class class176 {

    @ObfuscatedName("fn.e")
    public class188 field2867 = new class188();

    @ObfuscatedName("fn.v")
    public class188 field2868;

    public class176() {
        this.field2867.field2893 = this.field2867;
        this.field2867.field2892 = this.field2867;
    }

    @ObfuscatedName("fn.e(Lgg;)V")
    public void method3182(class188 arg0) {
        if (arg0.field2892 != null) {
            arg0.method3323();
        }
        arg0.field2892 = this.field2867.field2892;
        arg0.field2893 = this.field2867;
        arg0.field2892.field2893 = arg0;
        arg0.field2893.field2892 = arg0;
    }

    @ObfuscatedName("fn.v()Lgg;")
    public class188 method3183() {
        class188 var1 = this.field2867.field2893;
        if (this.field2867 == var1) {
            this.field2868 = null;
            return null;
        } else {
            this.field2868 = var1.field2893;
            return var1;
        }
    }

    @ObfuscatedName("fn.k()Lgg;")
    public class188 method3184() {
        class188 var1 = this.field2868;
        if (this.field2867 == var1) {
            this.field2868 = null;
            return null;
        } else {
            this.field2868 = var1.field2893;
            return var1;
        }
    }
}

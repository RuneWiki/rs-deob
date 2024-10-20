package deob;

@ObfuscatedName("hn")
public class class221 {

    @ObfuscatedName("hn.t")
    public class222 field2645 = new class222();

    @ObfuscatedName("hn.q")
    public class222 field2646;

    public class221() {
        this.field2645.field2648 = this.field2645;
        this.field2645.field2647 = this.field2645;
    }

    @ObfuscatedName("hn.t(Lha;)V")
    public void method3765(class222 arg0) {
        if (arg0.field2647 != null) {
            arg0.method3775();
        }
        arg0.field2647 = this.field2645.field2647;
        arg0.field2648 = this.field2645;
        arg0.field2647.field2648 = arg0;
        arg0.field2648.field2647 = arg0;
    }

    @ObfuscatedName("hn.q()Lha;")
    public class222 method3766() {
        class222 var1 = this.field2645.field2648;
        if (this.field2645 == var1) {
            this.field2646 = null;
            return null;
        } else {
            this.field2646 = var1.field2648;
            return var1;
        }
    }

    @ObfuscatedName("hn.i()Lha;")
    public class222 method3767() {
        class222 var1 = this.field2646;
        if (this.field2645 == var1) {
            this.field2646 = null;
            return null;
        } else {
            this.field2646 = var1.field2648;
            return var1;
        }
    }
}

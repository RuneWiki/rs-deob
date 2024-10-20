package deob;

@ObfuscatedName("gv")
public class class195 {

    @ObfuscatedName("gv.k")
    public class207 field3082 = new class207();

    @ObfuscatedName("gv.h")
    public class207 field3083;

    public class195() {
        this.field3082.field3108 = this.field3082;
        this.field3082.field3107 = this.field3082;
    }

    @ObfuscatedName("gv.k(Lgu;)V")
    public void method3534(class207 arg0) {
        if (arg0.field3107 != null) {
            arg0.method3676();
        }
        arg0.field3107 = this.field3082.field3107;
        arg0.field3108 = this.field3082;
        arg0.field3107.field3108 = arg0;
        arg0.field3108.field3107 = arg0;
    }

    @ObfuscatedName("gv.h()Lgu;")
    public class207 method3542() {
        class207 var1 = this.field3082.field3108;
        if (this.field3082 == var1) {
            this.field3083 = null;
            return null;
        } else {
            this.field3083 = var1.field3108;
            return var1;
        }
    }

    @ObfuscatedName("gv.o()Lgu;")
    public class207 method3537() {
        class207 var1 = this.field3083;
        if (this.field3082 == var1) {
            this.field3083 = null;
            return null;
        } else {
            this.field3083 = var1.field3108;
            return var1;
        }
    }
}

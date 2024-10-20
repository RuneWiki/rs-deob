package deob;

@ObfuscatedName("fw")
public class class3 {

    @ObfuscatedName("fw.j")
    public class10 field7 = new class10();

    @ObfuscatedName("fw.p")
    public class10 field8;

    @ObfuscatedName("fw.j(Lfl;)V")
    public void method35(class10 arg0) {
        if (arg0.field54 != null) {
            arg0.method216();
        }
        arg0.field54 = this.field7.field54;
        arg0.field55 = this.field7;
        arg0.field54.field55 = arg0;
        arg0.field55.field54 = arg0;
    }

    @ObfuscatedName("fw.p()Lfl;")
    public class10 method36() {
        class10 var1 = this.field7.field55;
        if (this.field7 == var1) {
            this.field8 = null;
            return null;
        } else {
            this.field8 = var1.field55;
            return var1;
        }
    }

    @ObfuscatedName("fw.o()Lfl;")
    public class10 method39() {
        class10 var1 = this.field8;
        if (this.field7 == var1) {
            this.field8 = null;
            return null;
        } else {
            this.field8 = var1.field55;
            return var1;
        }
    }

    public class3() {
        this.field7.field55 = this.field7;
        this.field7.field54 = this.field7;
    }
}

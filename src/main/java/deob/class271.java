package deob;

@ObfuscatedName("ji")
public final class class271 {

    @ObfuscatedName("ji.h")
    public class185 field3566 = new class185();

    public class271() {
        this.field3566.field2130 = this.field3566;
        this.field3566.field2129 = this.field3566;
    }

    @ObfuscatedName("ji.h(Lgj;)V")
    public void method4453(class185 arg0) {
        if (arg0.field2129 != null) {
            arg0.method3353();
        }
        arg0.field2129 = this.field3566.field2129;
        arg0.field2130 = this.field3566;
        arg0.field2129.field2130 = arg0;
        arg0.field2130.field2129 = arg0;
    }

    @ObfuscatedName("ji.v(Lgj;)V")
    public void method4454(class185 arg0) {
        if (arg0.field2129 != null) {
            arg0.method3353();
        }
        arg0.field2129 = this.field3566;
        arg0.field2130 = this.field3566.field2130;
        arg0.field2129.field2130 = arg0;
        arg0.field2130.field2129 = arg0;
    }

    @ObfuscatedName("ji.x()Lgj;")
    public class185 method4456() {
        class185 var1 = this.field3566.field2130;
        return this.field3566 == var1 ? null : var1;
    }
}

package deob;

@ObfuscatedName("ga")
public class class163 {

    @ObfuscatedName("ga.aq")
    public long field1787;

    @ObfuscatedName("ga.aw")
    public long field1786 = -1L;

    @ObfuscatedName("ga.al")
    public class399 field1788 = new class399();

    public class163(class534 arg0) {
        this.method3158(arg0);
    }

    @ObfuscatedName("ga.aq(Luq;I)V")
    public void method3158(class534 arg0) {
        this.field1787 = arg0.method8598();
        this.field1786 = arg0.method8598();
        for (int var2 = arg0.method8591(); var2 != 0; var2 = arg0.method8591()) {
            class162 var3;
            if (var2 == 1) {
                var3 = new class158(this);
            } else if (var2 == 4) {
                var3 = new class169(this);
            } else if (var2 == 3) {
                var3 = new class154(this);
            } else if (var2 == 2) {
                var3 = new class152(this);
            } else if (var2 == 5) {
                var3 = new class159(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method3060(arg0);
            this.field1788.method6739(var3);
        }
    }

    @ObfuscatedName("ga.aw(Lgg;I)V")
    public void method3159(class166 arg0) {
        if (this.field1787 != arg0.field4920 || this.field1786 != arg0.field1809) {
            throw new RuntimeException("");
        }
        for (class162 var2 = (class162) this.field1788.method6756(); var2 != null; var2 = (class162) this.field1788.method6758()) {
            var2.method3061(arg0);
        }
        arg0.field1809++;
    }
}

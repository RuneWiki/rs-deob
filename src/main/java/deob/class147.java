package deob;

@ObfuscatedName("em")
public class class147 {

    @ObfuscatedName("em.c")
    public long field1682;

    @ObfuscatedName("em.p")
    public long field1688 = -1L;

    @ObfuscatedName("em.f")
    public class338 field1683 = new class338();

    public class147(class445 arg0) {
        this.method2951(arg0);
    }

    @ObfuscatedName("em.c(Lqq;I)V")
    public void method2951(class445 arg0) {
        this.field1682 = arg0.method7319();
        this.field1688 = arg0.method7319();
        for (int var2 = arg0.method7196(); var2 != 0; var2 = arg0.method7196()) {
            class146 var3;
            if (var2 == 1) {
                var3 = new class142(this);
            } else if (var2 == 4) {
                var3 = new class153(this);
            } else if (var2 == 3) {
                var3 = new class138(this);
            } else if (var2 == 2) {
                var3 = new class136(this);
            } else if (var2 == 5) {
                var3 = new class143(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2862(arg0);
            this.field1683.method5704(var3);
        }
    }

    @ObfuscatedName("em.p(Ler;I)V")
    public void method2952(class150 arg0) {
        if (this.field1682 != arg0.field4504 || this.field1688 != arg0.field1707) {
            throw new RuntimeException("");
        }
        for (class146 var2 = (class146) this.field1683.method5708(); var2 != null; var2 = (class146) this.field1683.method5695()) {
            var2.method2863(arg0);
        }
        arg0.field1707++;
    }
}

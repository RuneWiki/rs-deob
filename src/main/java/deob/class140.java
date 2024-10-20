package deob;

@ObfuscatedName("em")
public class class140 extends class143 {

    // $FF: synthetic field
    public final class144 this$0;

    @ObfuscatedName("em.c")
    public int field1596;

    @ObfuscatedName("em.b")
    public byte field1595;

    @ObfuscatedName("em.p")
    public int field1594;

    @ObfuscatedName("em.m")
    public String field1597;

    public class140(class144 arg0) {
        this.this$0 = arg0;
        this.field1596 = -1;
    }

    @ObfuscatedName("em.c(Lpi;B)V")
    public void method2619(class419 arg0) {
        arg0.method6781();
        this.field1596 = arg0.method6672();
        this.field1595 = arg0.method6846();
        this.field1594 = arg0.method6672();
        arg0.method6676();
        this.field1597 = arg0.method6707();
        arg0.method6781();
    }

    @ObfuscatedName("em.b(Lei;B)V")
    public void method2621(class147 arg0) {
        class129 var2 = (class129) arg0.field1639.get(this.field1596);
        var2.field1507 = this.field1595;
        var2.field1510 = this.field1594;
        var2.field1506 = new class440(this.field1597);
    }
}

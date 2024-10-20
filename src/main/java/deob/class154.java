package deob;

@ObfuscatedName("fy")
public class class154 extends class164 {

    // $FF: synthetic field
    public final class165 this$0;

    @ObfuscatedName("fy.aq")
    public int field1729;

    @ObfuscatedName("fy.ad")
    public byte field1728;

    @ObfuscatedName("fy.ag")
    public int field1731;

    @ObfuscatedName("fy.ak")
    public String field1730;

    public class154(class165 arg0) {
        this.this$0 = arg0;
        this.field1729 = -1;
    }

    @ObfuscatedName("fy.aq(Lvp;I)V")
    public void method3101(class547 arg0) {
        this.field1729 = arg0.method8899();
        this.field1728 = arg0.method8857();
        this.field1731 = arg0.method8899();
        arg0.method8735();
        this.field1730 = arg0.method8739();
    }

    @ObfuscatedName("fy.ad(Lgj;I)V")
    public void method3102(class168 arg0) {
        class150 var2 = (class150) arg0.field1820.get(this.field1729);
        var2.field1704 = this.field1728;
        var2.field1701 = this.field1731;
        var2.field1702 = new class569(this.field1730);
    }
}

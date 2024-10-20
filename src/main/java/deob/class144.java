package deob;

@ObfuscatedName("ft")
public class class144 extends class146 {

    // $FF: synthetic field
    public final class149 this$0;

    @ObfuscatedName("ft.ac")
    public long field1646;

    @ObfuscatedName("ft.al")
    public String field1645;

    public class144(class149 arg0) {
        this.this$0 = arg0;
        this.field1646 = -1L;
        this.field1645 = null;
    }

    @ObfuscatedName("ft.ac(Lul;I)V")
    public void method2966(class530 arg0) {
        if (arg0.method8365() != 255) {
            arg0.field5140--;
            this.field1646 = arg0.method8573();
        }
        this.field1645 = arg0.method8375();
    }

    @ObfuscatedName("ft.al(Lgi;I)V")
    public void method2967(class157 arg0) {
        arg0.method3024(this.field1646, this.field1645, 0);
    }
}

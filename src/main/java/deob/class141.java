package deob;

@ObfuscatedName("ft")
public class class141 extends class143 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("ft.at")
    public long field1619;

    @ObfuscatedName("ft.an")
    public String field1618;

    public class141(class146 arg0) {
        this.this$0 = arg0;
        this.field1619 = -1L;
        this.field1618 = null;
    }

    @ObfuscatedName("ft.at(Ltz;B)V")
    public void method2929(class501 arg0) {
        if (arg0.method8129() != 255) {
            arg0.field5017--;
            this.field1619 = arg0.method8135();
        }
        this.field1618 = arg0.method8128();
    }

    @ObfuscatedName("ft.an(Lfs;B)V")
    public void method2928(class154 arg0) {
        arg0.method2980(this.field1619, this.field1618, 0);
    }
}

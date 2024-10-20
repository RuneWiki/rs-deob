package deob;

@ObfuscatedName("eq")
public class class138 extends class137 {

    // $FF: synthetic field
    public final class140 this$0;

    @ObfuscatedName("eq.h")
    public int field1656;

    @ObfuscatedName("eq.e")
    public boolean field1652;

    public class138(class140 arg0) {
        this.this$0 = arg0;
        this.field1656 = -1;
    }

    @ObfuscatedName("eq.h(Lqy;I)V")
    public void method2882(class467 arg0) {
        this.field1656 = arg0.method7794();
        this.field1652 = arg0.method7792() == 1;
    }

    @ObfuscatedName("eq.e(Lep;I)V")
    public void method2881(class148 arg0) {
        arg0.method2953(this.field1656, this.field1652);
    }
}
